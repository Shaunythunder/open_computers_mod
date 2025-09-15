/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import li.cil.oc.api.Network;
/*    */ 
/*    */ public abstract class ImmibisMicroblock$class {
/*    */   public static void $init$(ImmibisMicroblock $this) {
/*  6 */     $this.li$cil$oc$common$tileentity$traits$ImmibisMicroblock$_setter_$ImmibisMicroblocks_TransformableTileEntityMarker_$eq(null);
/*    */   } public static boolean ImmibisMicroblocks_isSideOpen(ImmibisMicroblock $this, int side) {
/*  8 */     return true;
/*    */   }
/*    */   public static void ImmibisMicroblocks_onMicroblocksChanged(ImmibisMicroblock $this) {
/* 11 */     Network.joinOrCreateNetwork((TileEntity)$this);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\ImmibisMicroblock$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */