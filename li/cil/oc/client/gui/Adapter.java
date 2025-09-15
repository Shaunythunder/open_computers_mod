/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import li.cil.oc.common.container.Adapter;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0353A!\001\002\001\033\t9\021\tZ1qi\026\024(BA\002\005\003\r9W/\033\006\003\013\031\taa\0317jK:$(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\004\037A\021R\"\001\002\n\005E\021!a\005#z]\006l\027nY$vS\016{g\016^1j]\026\024\bCA\n\031\033\005!\"BA\013\027\003%\031wN\034;bS:,'O\003\002\030\r\00511m\\7n_:L!!\001\013\t\021i\001!\021!Q\001\nm\tq\002\0357bs\026\024\030J\034<f]R|'/\037\t\0039\025j\021!\b\006\003=}\ta\001\0357bs\026\024(B\001\021\"\003\031)g\016^5us*\021!eI\001\n[&tWm\031:bMRT\021\001J\001\004]\026$\030B\001\024\036\005=IeN^3oi>\024\030\020\0257bs\026\024\b\002\003\025\001\005\013\007I\021A\025\002\017\005$\027\r\035;feV\t!\006\005\002,]5\tAF\003\002.-\005QA/\0337fK:$\030\016^=\n\005\005a\003\002\003\031\001\005\003\005\013\021\002\026\002\021\005$\027\r\035;fe\002BQA\r\001\005\002M\na\001P5oSRtDc\001\0336mA\021q\002\001\005\0065E\002\ra\007\005\006QE\002\rA\013\005\006q\001!\t%O\001\035IJ\fwoU3d_:$\027M]=G_J,wM]8v]\022d\025-_3s)\rQ\004)\022\t\003wyj\021\001\020\006\002{\005)1oY1mC&\021q\b\020\002\005+:LG\017C\003Bo\001\007!)\001\004n_V\034X\r\027\t\003w\rK!\001\022\037\003\007%sG\017C\003Go\001\007!)\001\004n_V\034X-\027")
/*    */ public class Adapter extends DynamicGuiContainer<Adapter> {
/*  8 */   public li.cil.oc.common.tileentity.Adapter adapter() { return this.adapter; } private final li.cil.oc.common.tileentity.Adapter adapter; public Adapter(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Adapter adapter) { super(new Adapter(playerInventory, adapter)); }
/*    */    public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 10 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 11 */     this.field_146289_q.func_78276_b(
/* 12 */         Localization$.MODULE$.localizeImmediately(adapter().func_145825_b()), 
/* 13 */         8, 6, 4210752);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */