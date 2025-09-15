/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import li.cil.oc.client.gui.widget.ProgressBar;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001a4A!\001\002\001\033\t9\001K]5oi\026\024(BA\002\005\003\r9W/\033\006\003\013\031\taa\0317jK:$(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\004\037A\021R\"\001\002\n\005E\021!a\005#z]\006l\027nY$vS\016{g\016^1j]\026\024\bCA\n\031\033\005!\"BA\013\027\003%\031wN\034;bS:,'O\003\002\030\r\00511m\\7n_:L!!\001\013\t\021i\001!\021!Q\001\nm\tq\002\0357bs\026\024\030J\034<f]R|'/\037\t\0039\025j\021!\b\006\003=}\ta\001\0357bs\026\024(B\001\021\"\003\031)g\016^5us*\021!eI\001\n[&tWm\031:bMRT\021\001J\001\004]\026$\030B\001\024\036\005=IeN^3oi>\024\030\020\0257bs\026\024\b\002\003\025\001\005\013\007I\021A\025\002\017A\024\030N\034;feV\t!\006\005\002,]5\tAF\003\002.-\005QA/\0337fK:$\030\016^=\n\005\005a\003\002\003\031\001\005\003\005\013\021\002\026\002\021A\024\030N\034;fe\002BQA\r\001\005\002M\na\001P5oSRtDc\001\0336mA\021q\002\001\005\0065E\002\ra\007\005\006QE\002\rA\013\005\bq\001\021\r\021\"\003:\003-i\027\r^3sS\006d')\031:\026\003i\022\"aO \007\tqj\004A\017\002\ryI,g-\0338f[\026tGO\020\005\007}\001\001\013\021\002\036\002\0315\fG/\032:jC2\024\025M\035\021\021\005\001\033U\"A!\013\005\t\023\021AB<jI\036,G/\003\002E\003\nY\001K]8he\026\0348OQ1s\021\0351\005A1A\005\n\035\013a!\0338l\005\006\024X#\001%\023\005%{d\001\002\037K\001!Caa\023\001!\002\023A\025aB5oW\n\013'\017\t\005\b\033\002\021\r\021\"\003O\003-\001(o\\4sKN\034()\031:\026\003=\023\"\001U \007\tq\n\006a\024\005\007%\002\001\013\021B(\002\031A\024xn\032:fgN\024\025M\035\021\t\013Q\003A\021I+\002\017%t\027\016^$vSR\ta\013\005\002X56\t\001LC\001Z\003\025\0318-\0317b\023\tY\006L\001\003V]&$\b\"B/\001\t\003r\026\001\b3sC^\034VmY8oI\006\024\030PR8sK\036\024x.\0368e\031\006LXM\035\013\004-~#\007\"\0021]\001\004\t\027AB7pkN,\007\f\005\002XE&\0211\r\027\002\004\023:$\b\"B3]\001\004\t\027AB7pkN,\027\fC\003h\001\021\005\003.A\020ee\006<x)^5D_:$\030-\0338fe\n\0137m[4s_VtG\rT1zKJ$BAV5o_\")!N\032a\001W\006\021A\r\036\t\003/2L!!\034-\003\013\031cw.\031;\t\013\0014\007\031A1\t\013\0254\007\031A1\t\013E\004A\021\013:\002!\021\024\030m\036#jg\006\024G.\0323TY>$HC\001,t\021\025!\b\0171\001v\003\021\031Hn\034;\021\005M1\030BA<\025\0055\031u.\0349p]\026tGo\0257pi\002")
/*    */ public class Printer extends DynamicGuiContainer<Printer> {
/*    */   private final li.cil.oc.common.tileentity.Printer printer;
/*    */   private final ProgressBar materialBar;
/*    */   private final ProgressBar inkBar;
/*    */   private final ProgressBar progressBar;
/*    */   
/* 12 */   public li.cil.oc.common.tileentity.Printer printer() { return this.printer; } private ProgressBar materialBar() { return this.materialBar; } public final class Printer$$anon$1 extends ProgressBar { public Printer$$anon$1(Printer $outer) { super(40, 21); } public int width() { return 62; } public int height() { return 12; } public ResourceLocation barTexture() { return Textures$.MODULE$.guiPrinterMaterial(); } } public Printer(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Printer printer) { super(new Printer(playerInventory, printer));
/* 13 */     this.field_146999_f = 176;
/* 14 */     this.field_147000_g = 166;
/*    */     
/* 16 */     this.materialBar = (ProgressBar)addWidget(new Printer$$anon$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.inkBar = (ProgressBar)addWidget(new Printer$$anon$2(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.progressBar = (ProgressBar)addWidget(new Printer$$anon$3(this)); } private ProgressBar inkBar() { return this.inkBar; } public final class Printer$$anon$2 extends ProgressBar { public Printer$$anon$2(Printer $outer) { super(40, 53); } public int width() { return 62; } public int height() { return 12; } public ResourceLocation barTexture() { return Textures$.MODULE$.guiPrinterInk(); } } private ProgressBar progressBar() { return this.progressBar; } public final class Printer$$anon$3 extends ProgressBar { public Printer$$anon$3(Printer $outer) { super(105, 20); } public int width() {
/* 31 */       return 46;
/*    */     } public int height() {
/* 33 */       return 46;
/*    */     } public ResourceLocation barTexture() {
/* 35 */       return Textures$.MODULE$.guiPrinterProgress();
/*    */     } }
/*    */   
/*    */   public void func_73866_w_() {
/* 39 */     super.func_73866_w_();
/*    */   }
/*    */   
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 43 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 44 */     this.field_146289_q.func_78276_b(
/* 45 */         Localization$.MODULE$.localizeImmediately(printer().func_145825_b()), 
/* 46 */         8, 6, 4210752);
/* 47 */     GL11.glPushAttrib(1048575);
/* 48 */     if (func_146978_c(materialBar().x(), materialBar().y(), materialBar().width(), materialBar().height(), mouseX, mouseY)) {
/* 49 */       ArrayList<String> tooltip = new ArrayList();
/* 50 */       tooltip.add((new StringBuilder()).append(inventoryContainer().amountMaterial()).append("/").append(BoxesRunTime.boxToInteger(printer().maxAmountMaterial())).toString());
/* 51 */       copiedDrawHoveringText(tooltip, mouseX - this.field_147003_i, mouseY - this.field_147009_r, this.field_146289_q);
/*    */     } 
/* 53 */     if (func_146978_c(inkBar().x(), inkBar().y(), inkBar().width(), inkBar().height(), mouseX, mouseY)) {
/* 54 */       ArrayList<String> tooltip = new ArrayList();
/* 55 */       tooltip.add((new StringBuilder()).append(inventoryContainer().amountInk()).append("/").append(BoxesRunTime.boxToInteger(printer().maxAmountInk())).toString());
/* 56 */       copiedDrawHoveringText(tooltip, mouseX - this.field_147003_i, mouseY - this.field_147009_r, this.field_146289_q);
/*    */     } 
/* 58 */     GL11.glPopAttrib();
/*    */   }
/*    */   
/*    */   public void func_146976_a(float dt, int mouseX, int mouseY) {
/* 62 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 63 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiPrinter());
/* 64 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/* 65 */     materialBar().level_$eq(inventoryContainer().amountMaterial() / printer().maxAmountMaterial());
/* 66 */     inkBar().level_$eq(inventoryContainer().amountInk() / printer().maxAmountInk());
/* 67 */     progressBar().level_$eq(inventoryContainer().progress());
/* 68 */     drawWidgets();
/* 69 */     drawInventorySlots();
/*    */   }
/*    */   
/*    */   public void drawDisabledSlot(ComponentSlot slot) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Printer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */