/*    */ package li.cil.oc.client.gui.traits;
/*    */ import java.util.List;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ public abstract class Window$class {
/*    */   public static void $init$(Window $this) {
/* 11 */     $this.guiLeft_$eq(0);
/* 12 */     $this.guiTop_$eq(0);
/* 13 */     $this.xSize_$eq(0);
/* 14 */     $this.ySize_$eq(0);
/*    */     
/* 16 */     $this.li$cil$oc$client$gui$traits$Window$_setter_$windowWidth_$eq(176);
/* 17 */     $this.li$cil$oc$client$gui$traits$Window$_setter_$windowHeight_$eq(166);
/*    */   }
/*    */   
/*    */   public static boolean add(Window $this, List<Object> list, Object value) {
/* 21 */     return list.add(value);
/*    */   } public static boolean doesGuiPauseGame(Window $this) {
/* 23 */     return false;
/*    */   }
/*    */   
/* 26 */   public static void initGui(Window $this) { $this.li$cil$oc$client$gui$traits$Window$$super$initGui();
/*    */     
/* 28 */     ScaledResolution screenSize = new ScaledResolution(((GuiScreen)$this).field_146297_k, ((GuiScreen)$this).field_146297_k.field_71443_c, ((GuiScreen)$this).field_146297_k.field_71440_d);
/* 29 */     ScaledResolution guiSize = new ScaledResolution(((GuiScreen)$this).field_146297_k, $this.windowWidth(), $this.windowHeight());
/* 30 */     Tuple2.mcII.sp sp = new Tuple2.mcII.sp(screenSize.func_78326_a() / 2, screenSize.func_78328_b() / 2); if (sp != null) { int midX = sp._1$mcI$sp(), midY = sp._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(midX, midY), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 31 */       $this.guiLeft_$eq(i - guiSize.func_78326_a() / 2);
/* 32 */       $this.guiTop_$eq(j - guiSize.func_78328_b() / 2);
/* 33 */       $this.xSize_$eq(guiSize.func_78326_a());
/* 34 */       $this.ySize_$eq(guiSize.func_78328_b());
/*    */       return; }
/*    */     
/*    */     throw new MatchError(sp); } public static void drawScreen(Window $this, int mouseX, int mouseY, float dt) {
/* 38 */     ((GuiScreen)$this).field_146297_k.field_71446_o.func_110577_a($this.backgroundImage());
/* 39 */     Gui.func_146110_a($this.guiLeft(), $this.guiTop(), 0.0F, 0.0F, $this.xSize(), $this.ySize(), $this.windowWidth(), $this.windowHeight());
/*    */     
/* 41 */     $this.li$cil$oc$client$gui$traits$Window$$super$drawScreen(mouseX, mouseY, dt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\Window$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */