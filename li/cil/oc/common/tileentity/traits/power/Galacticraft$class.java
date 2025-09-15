/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ 
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import micdoodle8.mods.galacticraft.api.power.EnergySource;
/*    */ import micdoodle8.mods.galacticraft.api.transmission.NetworkType;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Galacticraft$class
/*    */ {
/*    */   public static void $init$(Galacticraft $this) {}
/*    */   
/*    */   private static ForgeDirection toDirection(Galacticraft $this, EnergySource source) {
/*    */     ForgeDirection forgeDirection;
/* 18 */     EnergySource energySource = source;
/* 19 */     if (energySource instanceof EnergySource.EnergySourceAdjacent) { EnergySource.EnergySourceAdjacent energySourceAdjacent = (EnergySource.EnergySourceAdjacent)energySource; forgeDirection = energySourceAdjacent.direction; }
/* 20 */     else { forgeDirection = ForgeDirection.UNKNOWN; }
/*    */     
/*    */     return forgeDirection; } @Method(modid = "Galacticraft API")
/*    */   public static boolean nodeAvailable(Galacticraft $this, EnergySource from) {
/* 24 */     return (Mods$.MODULE$.Galacticraft().isAvailable() && $this.canConnectPower(toDirection($this, from)));
/*    */   }
/*    */   @Method(modid = "Galacticraft API")
/*    */   public static float receiveEnergyGC(Galacticraft $this, EnergySource from, float amount, boolean simulate) {
/* 28 */     return Mods$.MODULE$.Galacticraft().isAvailable() ? 
/* 29 */       Power$.MODULE$.toGC($this.tryChangeBuffer(toDirection($this, from), Power$.MODULE$.fromGC(amount), !simulate)) : 0.0F;
/*    */   } @Method(modid = "Galacticraft API")
/*    */   public static float getEnergyStoredGC(Galacticraft $this, EnergySource from) {
/* 32 */     return Power$.MODULE$.toGC($this.globalBuffer(toDirection($this, from)));
/*    */   } @Method(modid = "Galacticraft API")
/*    */   public static float getMaxEnergyStoredGC(Galacticraft $this, EnergySource from) {
/* 35 */     return Power$.MODULE$.toGC($this.globalBufferSize(toDirection($this, from)));
/*    */   } @Method(modid = "Galacticraft API")
/*    */   public static float extractEnergyGC(Galacticraft $this, EnergySource from, float amount, boolean simulate) {
/* 38 */     return 0.0F;
/*    */   }
/*    */   
/*    */   @Method(modid = "Galacticraft API")
/*    */   public static boolean canConnect(Galacticraft $this, ForgeDirection from, NetworkType networkType) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: getstatic micdoodle8/mods/galacticraft/api/transmission/NetworkType.POWER : Lmicdoodle8/mods/galacticraft/api/transmission/NetworkType;
/*    */     //   4: astore_3
/*    */     //   5: dup
/*    */     //   6: ifnonnull -> 17
/*    */     //   9: pop
/*    */     //   10: aload_3
/*    */     //   11: ifnull -> 24
/*    */     //   14: goto -> 38
/*    */     //   17: aload_3
/*    */     //   18: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   21: ifeq -> 38
/*    */     //   24: aload_0
/*    */     //   25: aload_1
/*    */     //   26: invokeinterface canConnectPower : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*    */     //   31: ifeq -> 38
/*    */     //   34: iconst_1
/*    */     //   35: goto -> 39
/*    */     //   38: iconst_0
/*    */     //   39: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	40	0	$this	Lli/cil/oc/common/tileentity/traits/power/Galacticraft;
/*    */     //   0	40	1	from	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   0	40	2	networkType	Lmicdoodle8/mods/galacticraft/api/transmission/NetworkType;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Galacticraft$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */