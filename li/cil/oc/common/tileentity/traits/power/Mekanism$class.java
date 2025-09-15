/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class Mekanism$class {
/*    */   @Method(modid = "Mekanism")
/*    */   public static boolean canReceiveEnergy(Mekanism $this, ForgeDirection side) {
/* 12 */     return (Mods$.MODULE$.Mekanism().isAvailable() && $this.canConnectPower(side));
/*    */   } public static void $init$(Mekanism $this) {}
/*    */   @Method(modid = "Mekanism")
/*    */   public static double transferEnergyToAcceptor(Mekanism $this, ForgeDirection side, double amount) {
/* 16 */     return Mods$.MODULE$.Mekanism().isAvailable() ? 
/* 17 */       Power$.MODULE$.toJoules($this.tryChangeBuffer(side, Power$.MODULE$.fromJoules(amount), $this.tryChangeBuffer$default$3())) : 0.0D;
/*    */   } @Method(modid = "Mekanism")
/*    */   public static double getMaxEnergy(Mekanism $this) {
/* 20 */     return Power$.MODULE$.toJoules(BoxesRunTime.unboxToDouble(Predef$.MODULE$.doubleArrayOps((double[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Mekanism$$anonfun$getMaxEnergy$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Double()))).max((Ordering)Ordering$Double$.MODULE$)));
/*    */   } @Method(modid = "Mekanism")
/*    */   public static double getEnergy(Mekanism $this) {
/* 23 */     return Power$.MODULE$.toJoules(BoxesRunTime.unboxToDouble(Predef$.MODULE$.doubleArrayOps((double[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Mekanism$$anonfun$getEnergy$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Double()))).max((Ordering)Ordering$Double$.MODULE$)));
/*    */   }
/*    */   
/*    */   @Method(modid = "Mekanism")
/*    */   public static void setEnergy(Mekanism $this, double energy) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Mekanism$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */