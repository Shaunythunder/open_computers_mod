/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.math.Ordering$Double$;
/*    */ import scala.math.package$;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class IndustrialCraft2Experimental$class {
/*    */   public static void $init$(IndustrialCraft2Experimental $this) {
/* 17 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(0.0D);
/*    */   } private static boolean useIndustrialCraft2Power(IndustrialCraft2Experimental $this) {
/* 19 */     return ($this.isServer() && Mods$.MODULE$.IndustrialCraft2().isAvailable());
/*    */   }
/*    */ 
/*    */   
/*    */   public static void updateEntity(IndustrialCraft2Experimental $this) {
/* 24 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$updateEntity();
/* 25 */     if (useIndustrialCraft2Power($this) && $this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 26 */       updateEnergy($this);
/*    */     }
/*    */   }
/*    */   
/*    */   @Method(modid = "IC2")
/*    */   private static void updateEnergy(IndustrialCraft2Experimental $this) {
/* 32 */     $this.tryAllSides((Function2<Object, ForgeDirection, Object>)new IndustrialCraft2Experimental$$anonfun$updateEnergy$3($this), 
/*    */ 
/*    */ 
/*    */         
/* 36 */         (Function1<Object, Object>)new IndustrialCraft2Experimental$$anonfun$updateEnergy$1($this), (Function1<Object, Object>)new IndustrialCraft2Experimental$$anonfun$updateEnergy$2($this));
/*    */   }
/*    */   
/*    */   public static void validate(IndustrialCraft2Experimental $this) {
/* 40 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$validate();
/* 41 */     if (useIndustrialCraft2Power($this) && !$this.addedToIC2PowerGrid()) EventHandler$.MODULE$.scheduleIC2Add($this); 
/*    */   }
/*    */   
/*    */   public static void invalidate(IndustrialCraft2Experimental $this) {
/* 45 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$invalidate();
/* 46 */     if (useIndustrialCraft2Power($this) && $this.addedToIC2PowerGrid()) removeFromIC2Grid($this); 
/*    */   }
/*    */   
/*    */   public static void onChunkUnload(IndustrialCraft2Experimental $this) {
/* 50 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$onChunkUnload();
/* 51 */     if (useIndustrialCraft2Power($this) && $this.addedToIC2PowerGrid()) removeFromIC2Grid($this); 
/*    */   } private static void removeFromIC2Grid(IndustrialCraft2Experimental $this) {
/*    */     try {
/*    */     
/*    */     } finally {
/* 56 */       Exception exception = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void readFromNBTForServer(IndustrialCraft2Experimental $this, NBTTagCompound nbt) {
/* 64 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$readFromNBTForServer(nbt);
/* 65 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ic2power").toString()));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(IndustrialCraft2Experimental $this, NBTTagCompound nbt) {
/* 69 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$super$writeToNBTForServer(nbt);
/* 70 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ic2power").toString(), $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer());
/*    */   }
/*    */ 
/*    */   
/*    */   @Method(modid = "IC2")
/*    */   public static int getSinkTier(IndustrialCraft2Experimental $this) {
/* 76 */     return Integer.MAX_VALUE;
/*    */   } @Method(modid = "IC2")
/*    */   public static boolean acceptsEnergyFrom(IndustrialCraft2Experimental $this, TileEntity emitter, ForgeDirection direction) {
/* 79 */     return (useIndustrialCraft2Power($this) && $this.canConnectPower(direction));
/*    */   }
/*    */   @Method(modid = "IC2")
/*    */   public static double injectEnergy(IndustrialCraft2Experimental $this, ForgeDirection directionFrom, double amount, double voltage) {
/* 83 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq($this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() + amount);
/* 84 */     return 0.0D;
/*    */   }
/*    */   
/*    */   @Method(modid = "IC2")
/*    */   public static double getDemandedEnergy(IndustrialCraft2Experimental $this) {
/* 89 */     return useIndustrialCraft2Power($this) ? (
/* 90 */       ($this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() < $this.energyThroughput() * Settings$.MODULE$.get().tickFrequency()) ? 
/* 91 */       package$.MODULE$.min(BoxesRunTime.unboxToDouble(Predef$.MODULE$.doubleArrayOps((double[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new IndustrialCraft2Experimental$$anonfun$getDemandedEnergy$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Double()))).max((Ordering)Ordering$Double$.MODULE$)), Power$.MODULE$.toEU($this.energyThroughput())) : 
/* 92 */       0.0D) : 0.0D;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\IndustrialCraft2Experimental$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */