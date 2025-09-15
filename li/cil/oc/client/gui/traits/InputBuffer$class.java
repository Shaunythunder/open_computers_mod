/*     */ package li.cil.oc.client.gui.traits;
/*     */ import li.cil.oc.client.KeyBindings$;
/*     */ import li.cil.oc.client.Textures$;
/*     */ import li.cil.oc.util.RenderState$;
/*     */ import net.minecraft.client.gui.GuiScreen;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class InputBuffer$class {
/*     */   public static int bufferColumns(InputBuffer $this) {
/*  20 */     return ($this.buffer() == null) ? 0 : $this.buffer().getViewportWidth();
/*     */   } public static int bufferRows(InputBuffer $this) {
/*  22 */     return ($this.buffer() == null) ? 0 : $this.buffer().getViewportHeight();
/*     */   }
/*     */   
/*     */   public static void $init$(InputBuffer $this) {
/*  26 */     $this.li$cil$oc$client$gui$traits$InputBuffer$_setter_$li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys_$eq(Map$.MODULE$.empty());
/*     */     
/*  28 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing_$eq(0L);
/*     */   } public static boolean doesGuiPauseGame(InputBuffer $this) {
/*  30 */     return false;
/*     */   }
/*     */   public static void initGui(InputBuffer $this) {
/*  33 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$super$initGui();
/*  34 */     Keyboard.enableRepeatEvents(true);
/*     */   }
/*     */   
/*     */   public static void drawBufferLayer(InputBuffer $this) {
/*  38 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$super$drawBufferLayer();
/*     */     
/*  40 */     if (System.currentTimeMillis() - $this.li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing() < 1000L) {
/*  41 */       Minecraft.func_71410_x().func_110434_K().func_110577_a(Textures$.MODULE$.guiKeyboardMissing());
/*  42 */       GL11.glDisable(2929);
/*  43 */       Tessellator t = Tessellator.field_78398_a;
/*  44 */       t.func_78382_b();
/*  45 */       int x = $this.bufferX() + $this.buffer().renderWidth() - 16;
/*  46 */       int y = $this.bufferY() + $this.buffer().renderHeight() - 16;
/*  47 */       t.func_78374_a(x, (y + 16), 0.0D, 0.0D, 1.0D);
/*  48 */       t.func_78374_a((x + 16), (y + 16), 0.0D, 1.0D, 1.0D);
/*  49 */       t.func_78374_a((x + 16), y, 0.0D, 1.0D, 0.0D);
/*  50 */       t.func_78374_a(x, y, 0.0D, 0.0D, 0.0D);
/*  51 */       t.func_78381_a();
/*  52 */       GL11.glEnable(2929);
/*     */       
/*  54 */       RenderState$.MODULE$.checkError((new StringBuilder()).append($this.getClass().getName()).append(".drawBufferLayer: keyboard icon").toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void onGuiClosed(InputBuffer $this) {
/*  59 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$super$onGuiClosed();
/*  60 */     if ($this.buffer() != null) $this.li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys().withFilter((Function1)new InputBuffer$$anonfun$onGuiClosed$1($this)).foreach((Function1)new InputBuffer$$anonfun$onGuiClosed$2($this));
/*     */ 
/*     */     
/*  63 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   public static void handleKeyboardInput(InputBuffer $this) {
/*  67 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$super$handleKeyboardInput();
/*     */     
/*  69 */     if ($this instanceof net.minecraft.client.gui.inventory.GuiContainer && NEI$.MODULE$.isInputFocused())
/*     */       return; 
/*  71 */     int code = Keyboard.getEventKey();
/*  72 */     if ($this.buffer() != null && code != 1 && code != 87) {
/*  73 */       if ($this.hasKeyboard()) {
/*     */         
/*  75 */         char char = Keyboard.getEventCharacter();
/*     */         
/*  77 */         $this.buffer().keyDown(char, code, null);
/*     */ 
/*     */ 
/*     */         
/*  81 */         Option option = $this.li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys().remove(BoxesRunTime.boxToInteger(code));
/*  82 */         if (option instanceof Some) { Some some = (Some)option; char c = BoxesRunTime.unboxToChar(some.x()); $this.buffer().keyUp(c, code, null); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  83 */         else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/*     */         Keyboard.getEventKeyState() ? (($this.li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys().contains(BoxesRunTime.boxToInteger(code)) && ignoreRepeat($this, char, code)) ? BoxedUnit.UNIT : $this.li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(code)), BoxesRunTime.boxToCharacter(char)))) : BoxedUnit.UNIT;
/*  86 */         if (KeyBindings$.MODULE$.isPastingClipboard()) {
/*  87 */           $this.buffer().clipboard(GuiScreen.func_146277_j(), null);
/*     */         }
/*     */       } else {
/*     */         
/*  91 */         $this.li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing_$eq(System.currentTimeMillis());
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static void mouseClicked(InputBuffer $this, int x, int y, int button) {
/*  97 */     $this.li$cil$oc$client$gui$traits$InputBuffer$$super$mouseClicked(x, y, button);
/*  98 */     boolean isMiddleMouseButton = (button == 2);
/*  99 */     boolean isBoundMouseButton = KeyBindings$.MODULE$.isPastingClipboard();
/* 100 */     if ($this.buffer() != null && (isMiddleMouseButton || isBoundMouseButton)) {
/* 101 */       if ($this.hasKeyboard()) {
/* 102 */         $this.buffer().clipboard(GuiScreen.func_146277_j(), null);
/*     */       } else {
/*     */         
/* 105 */         $this.li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing_$eq(System.currentTimeMillis());
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean ignoreRepeat(InputBuffer $this, char char, int code) {
/* 111 */     return (code == 29 || 
/* 112 */       code == 157 || 
/* 113 */       code == 56 || 
/* 114 */       code == 184 || 
/* 115 */       code == 42 || 
/* 116 */       code == 54 || 
/* 117 */       code == 219 || 
/* 118 */       code == 220);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\InputBuffer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */