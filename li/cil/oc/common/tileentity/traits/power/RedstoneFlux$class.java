/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public abstract class RedstoneFlux$class {
/*    */   public static void $init$(RedstoneFlux $this) {}
/*    */   
/*    */   @Method(modid = "CoFHAPI|energy")
/*    */   public static boolean canConnectEnergy(RedstoneFlux $this, ForgeDirection from) {
/* 12 */     return (Mods$.MODULE$.CoFHEnergy().isAvailable() && $this.canConnectPower(from));
/*    */   }
/*    */   @Method(modid = "CoFHAPI|energy")
/*    */   public static int receiveEnergy(RedstoneFlux $this, ForgeDirection from, int maxReceive, boolean simulate) {
/* 16 */     return Mods$.MODULE$.CoFHEnergy().isAvailable() ? 
/* 17 */       Power$.MODULE$.toRF($this.tryChangeBuffer(from, Power$.MODULE$.fromRF(maxReceive), !simulate)) : 0;
/*    */   } @Method(modid = "CoFHAPI|energy")
/*    */   public static int getEnergyStored(RedstoneFlux $this, ForgeDirection from) {
/* 20 */     return Power$.MODULE$.toRF($this.globalBuffer(from));
/*    */   } @Method(modid = "CoFHAPI|energy")
/*    */   public static int getMaxEnergyStored(RedstoneFlux $this, ForgeDirection from) {
/* 23 */     return Power$.MODULE$.toRF($this.globalBufferSize(from));
/*    */   } @Method(modid = "CoFHAPI|energy")
/*    */   public static int extractEnergy(RedstoneFlux $this, ForgeDirection from, int maxExtract, boolean simulate) {
/* 26 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\RedstoneFlux$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */