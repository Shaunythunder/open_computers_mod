/*     */ package li.cil.oc.client.renderer.font;
/*     */ 
/*     */ import gnu.trove.map.TIntObjectMap;
/*     */ import gnu.trove.map.hash.TIntObjectHashMap;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.ByteBuffer;
/*     */ import li.cil.oc.OpenComputers;
/*     */ import li.cil.oc.Settings;
/*     */ import li.cil.oc.util.FontUtils;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.resources.IResource;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import org.lwjgl.BufferUtils;
/*     */ 
/*     */ public class FontParserHex
/*     */   implements IGlyphProvider
/*     */ {
/*  21 */   private static final byte[] OPAQUE = new byte[] { -1, -1, -1, -1 };
/*  22 */   private static final byte[] TRANSPARENT = new byte[] { 0, 0, 0, 0 };
/*     */   
/*  24 */   private final TIntObjectMap<byte[]> glyphs = (TIntObjectMap<byte[]>)new TIntObjectHashMap();
/*     */   
/*     */   private static int hex2int(char c) {
/*  27 */     if (c >= '0' && c <= '9')
/*  28 */       return c - 48; 
/*  29 */     if (c >= 'A' && c <= 'F')
/*  30 */       return c - 55; 
/*  31 */     if (c >= 'a' && c <= 'f') {
/*  32 */       return c - 87;
/*     */     }
/*  34 */     throw new RuntimeException("invalid char: " + c);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void initialize() {
/*     */     try {
/*  41 */       this.glyphs.clear();
/*     */       
/*  43 */       OpenComputers.log().info("Loading Unicode glyphs...");
/*  44 */       long time = System.currentTimeMillis();
/*  45 */       int glyphCount = 0;
/*     */       
/*  47 */       ResourceLocation loc = new ResourceLocation(Settings.resourceDomain(), "font.hex");
/*  48 */       for (IResource resource : Minecraft.func_71410_x().func_110442_L().func_135056_b(loc)) {
/*  49 */         InputStream font = resource.func_110527_b();
/*     */         try {
/*  51 */           BufferedReader input = new BufferedReader(new InputStreamReader(font));
/*     */           String line;
/*  53 */           while ((line = input.readLine()) != null) {
/*  54 */             String info = line.substring(0, line.indexOf(':'));
/*  55 */             int charCode = Integer.parseInt(info, 16);
/*  56 */             if (charCode < 0 || charCode >= FontUtils.codepoint_limit()) {
/*  57 */               OpenComputers.log().warn(String.format("Unicode font contained unexpected glyph: U+%04X, ignoring", new Object[] { Integer.valueOf(charCode) }));
/*     */               continue;
/*     */             } 
/*  60 */             int expectedWidth = FontUtils.wcwidth(charCode);
/*  61 */             if (expectedWidth < 1)
/*     */               continue; 
/*  63 */             int glyphStrOfs = info.length() + 1;
/*  64 */             byte[] glyph = new byte[line.length() - glyphStrOfs >> 1];
/*  65 */             int glyphWidth = glyph.length / getGlyphHeight();
/*  66 */             if (expectedWidth == glyphWidth) {
/*  67 */               for (int i = 0; i < glyph.length; i++, glyphStrOfs += 2) {
/*  68 */                 glyph[i] = (byte)(hex2int(line.charAt(glyphStrOfs)) << 4 | hex2int(line.charAt(glyphStrOfs + 1)));
/*     */               }
/*  70 */               if (!this.glyphs.containsKey(charCode)) {
/*  71 */                 glyphCount++;
/*     */               }
/*  73 */               this.glyphs.put(charCode, glyph); continue;
/*  74 */             }  if (Settings.get().logHexFontErrors()) {
/*  75 */               OpenComputers.log().warn(String.format("Size of glyph for code point U+%04X (%s) in font (%d) does not match expected width (%d), ignoring.", new Object[] { Integer.valueOf(charCode), String.valueOf((char)charCode), Integer.valueOf(glyphWidth), Integer.valueOf(expectedWidth) }));
/*     */             }
/*     */           } 
/*     */         } finally {
/*     */           try {
/*  80 */             font.close();
/*  81 */           } catch (IOException ex) {
/*  82 */             OpenComputers.log().warn("Error parsing font.", ex);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/*  87 */       OpenComputers.log().info("Loaded " + glyphCount + " glyphs in " + (System.currentTimeMillis() - time) + " milliseconds.");
/*  88 */     } catch (IOException ex) {
/*  89 */       OpenComputers.log().warn("Failed loading glyphs.", ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ByteBuffer getGlyph(int charCode) {
/*  95 */     if (!this.glyphs.containsKey(charCode))
/*  96 */       return null; 
/*  97 */     byte[] glyph = (byte[])this.glyphs.get(charCode);
/*  98 */     if (glyph == null || glyph.length == 0)
/*  99 */       return null; 
/* 100 */     ByteBuffer buffer = BufferUtils.createByteBuffer(glyph.length * getGlyphWidth() * 4);
/* 101 */     for (byte aGlyph : glyph) {
/* 102 */       int c = aGlyph & 0xFF;
/*     */       
/* 104 */       for (int j = 0; j < 8; j++) {
/* 105 */         boolean isBitSet = ((c & 0x80) > 0);
/* 106 */         if (isBitSet) { buffer.put(OPAQUE); }
/* 107 */         else { buffer.put(TRANSPARENT); }
/* 108 */          c <<= 1;
/*     */       } 
/*     */     } 
/* 111 */     buffer.rewind();
/* 112 */     return buffer;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getGlyphWidth() {
/* 117 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getGlyphHeight() {
/* 122 */     return 16;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\FontParserHex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */