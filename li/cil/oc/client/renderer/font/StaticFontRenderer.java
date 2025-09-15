/*    */ package li.cil.oc.client.renderer.font;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Y4A!\001\002\001\037\t\0212\013^1uS\0164uN\034;SK:$WM]3s\025\t\031A!\001\003g_:$(BA\003\007\003!\021XM\0343fe\026\024(BA\004\t\003\031\031G.[3oi*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005M!V\r\037;ve\0264uN\034;SK:$WM]3s\021\025)\002\001\"\001\027\003\031a\024N\\5u}Q\tq\003\005\002\022\001!Q\021\004\001I\001\002\007\005\013\021\002\016\002\007a$#\007E\003\034=\001:s%D\001\035\025\005i\022!B:dC2\f\027BA\020\035\005\031!V\017\0357fgA\021\021\005\n\b\0037\tJ!a\t\017\002\rA\023X\rZ3g\023\t)cE\001\004TiJLgn\032\006\003Gq\001\"a\007\025\n\005%b\"aA%oi\"91\006\001b\001\n#a\023!B2iCJ\034X#\001\021\t\r9\002\001\025!\003!\003\031\031\007.\031:tA!9\001\007\001b\001\n#\t\024!C2iCJ<\026\016\032;i+\0059\003BB\032\001A\003%q%\001\006dQ\006\024x+\0333uQ\002Bq!\016\001C\002\023E\021'\001\006dQ\006\024\b*Z5hQRDaa\016\001!\002\0239\023aC2iCJDU-[4ii\002Bq!\017\001C\002\023%\021'\001\003d_2\034\bBB\036\001A\003%q%A\003d_2\034\b\005C\004>\001\t\007I\021\002 \002\013U\034F/\0329\026\003}\002\"a\007!\n\005\005c\"A\002#pk\ndW\r\003\004D\001\001\006IaP\001\007kN#X\r\035\021\t\017\025\003!\031!C\005}\005)QoU5{K\"1q\t\001Q\001\n}\na!^*ju\026\004\003bB%\001\005\004%IAP\001\006mN#X\r\035\005\007\027\002\001\013\021B \002\rY\034F/\0329!\021\035i\005A1A\005\ny\nQA^*ju\026Daa\024\001!\002\023y\024A\002<TSj,\007\005C\004R\001\t\007I\021\002 \002\003MDaa\025\001!\002\023y\024AA:!\021\035)\006A1A\005\ny\n!\001Z<\t\r]\003\001\025!\003@\003\r!w\017\t\005\b3\002\021\r\021\"\003?\003\t!\007\016\003\004\\\001\001\006IaP\001\004I\"\004\003\"B/\001\t#\n\024\001\004;fqR,(/Z\"pk:$\b\"B0\001\t#\002\027a\0032j]\022$V\r\037;ve\026$\"!\0313\021\005m\021\027BA2\035\005\021)f.\033;\t\013\025t\006\031A\024\002\013%tG-\032=\t\013\035\004A\021\0135\002\021\021\024\030m^\"iCJ$B!Y5oa\")!N\032a\001W\006\021A\017\037\t\00371L!!\034\017\003\013\031cw.\031;\t\013=4\007\031A6\002\005QL\b\"B9g\001\0049\023\001B2iCJDQa\035\001\005RQ\fAbZ3oKJ\fG/Z\"iCJ$\"!Y;\t\013E\024\b\031A\024")
/*    */ public class StaticFontRenderer extends TextureFontRenderer {
/*    */   private final String chars;
/*    */   private final int charWidth;
/*    */   private final int charHeight;
/*    */   private final int cols;
/*    */   private final double uStep;
/*    */   private final double uSize;
/*    */   private final double vStep;
/*    */   private final double vSize;
/*    */   private final double s;
/*    */   private final double dw;
/*    */   private final double dh;
/*    */   
/* 18 */   public StaticFontRenderer() { Tuple3 tuple3 = liftedTree1$1(); if (tuple3 != null) { String chars = (String)tuple3._1(); int charWidth = BoxesRunTime.unboxToInt(tuple3._2()), charHeight = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple31 = new Tuple3(chars, BoxesRunTime.boxToInteger(charWidth), BoxesRunTime.boxToInteger(charHeight)); this.chars = (String)this.x$2._1(); this.charWidth = BoxesRunTime.unboxToInt(this.x$2._2()); this.charHeight = BoxesRunTime.unboxToInt(this.x$2._3());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 33 */       this.cols = 256 / charWidth();
/* 34 */       this.uStep = charWidth() / 256.0D;
/* 35 */       this.uSize = uStep();
/* 36 */       this.vStep = (charHeight() + 1) / 256.0D;
/* 37 */       this.vSize = charHeight() / 256.0D;
/* 38 */       this.s = Settings$.MODULE$.get().fontCharScale();
/* 39 */       this.dw = charWidth() * s() - charWidth();
/* 40 */       this.dh = charHeight() * s() - charHeight(); return; }  throw new MatchError(tuple3); } public String chars() { return this.chars; } public int charWidth() { return this.charWidth; } public int charHeight() { return this.charHeight; } private final Tuple3 liftedTree1$1() { try { Iterator lines = Source$.MODULE$.fromInputStream(Minecraft.func_71410_x().func_110442_L().func_110536_a(new ResourceLocation(Settings$.MODULE$.resourceDomain(), "textures/font/chars.txt")).func_110527_b(), Codec$.MODULE$.charset2codec(Charsets.UTF_8)).getLines(); String chars = (String)lines.next(); String[] size = ((String)lines.next()).split(" ", 2); Tuple2.mcII.sp sp = lines.hasNext() ? new Tuple2.mcII.sp((new StringOps(Predef$.MODULE$.augmentString(size[0]))).toInt(), (new StringOps(Predef$.MODULE$.augmentString(size[1]))).toInt()) : new Tuple2.mcII.sp(10, 18); } finally { Exception exception = null; }  return new Tuple3("☺☻♥♦♣♠•◘○◙♂♀♪♫☼►◄↕‼¶§▬↨↑↓→←∟↔▲▼ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜ¢£¥₧ƒáíóúñÑªº¿⌐¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αßΓπΣσµτΦΘΩδ∞φε∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■", BoxesRunTime.boxToInteger(10), BoxesRunTime.boxToInteger(18)); } private int cols() { return this.cols; } private double dh() { return this.dh; }
/*    */   private double uStep() { return this.uStep; }
/* 42 */   private double uSize() { return this.uSize; } private double vStep() { return this.vStep; } private double vSize() { return this.vSize; } private double s() { return this.s; } private double dw() { return this.dw; } public int textureCount() { return 1; }
/*    */   
/*    */   public void bindTexture(int index) {
/* 45 */     if (Settings$.MODULE$.get().textAntiAlias()) {
/* 46 */       Minecraft.func_71410_x().func_110434_K().func_110577_a(Textures$.MODULE$.fontAntiAliased());
/*    */     } else {
/*    */       
/* 49 */       Minecraft.func_71410_x().func_110434_K().func_110577_a(Textures$.MODULE$.fontAliased());
/*    */     } 
/*    */   }
/*    */   
/*    */   public void drawChar(float tx, float ty, int char) {
/* 54 */     int i = chars().indexOf(char); switch (i) { default: case -1: break; }  int index = 1 + 
/* 55 */       chars().indexOf('?');
/*    */ 
/*    */     
/* 58 */     int x = (index - 1) % cols();
/* 59 */     int y = (index - 1) / cols();
/* 60 */     double u = x * uStep();
/* 61 */     double v = y * vStep();
/* 62 */     GL11.glTexCoord2d(u, v + vSize());
/* 63 */     GL11.glVertex3d(tx - dw(), ty + charHeight() * s(), 0.0D);
/* 64 */     GL11.glTexCoord2d(u + uSize(), v + vSize());
/* 65 */     GL11.glVertex3d(tx + charWidth() * s(), ty + charHeight() * s(), 0.0D);
/* 66 */     GL11.glTexCoord2d(u + uSize(), v);
/* 67 */     GL11.glVertex3d(tx + charWidth() * s(), ty - dh(), 0.0D);
/* 68 */     GL11.glTexCoord2d(u, v);
/* 69 */     GL11.glVertex3d(tx - dw(), ty - dh(), 0.0D);
/*    */   }
/*    */   
/*    */   public void generateChar(int char) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\StaticFontRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */