/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import ic2classic.api.Direction;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Function2;
/*    */ import scala.Predef$;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.math.Ordering$Double$;
/*    */ import scala.math.package$;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class IndustrialCraft2Classic$class {
/*    */   public static void $init$(IndustrialCraft2Classic $this) {
/* 19 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(0.0D);
/*    */   } private static boolean useIndustrialCraft2ClassicPower(IndustrialCraft2Classic $this) {
/* 21 */     return ($this.isServer() && Mods$.MODULE$.IndustrialCraft2Classic().isAvailable());
/*    */   }
/*    */ 
/*    */   
/*    */   public static void updateEntity(IndustrialCraft2Classic $this) {
/* 26 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$updateEntity();
/* 27 */     if (useIndustrialCraft2ClassicPower($this) && $this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 28 */       updateEnergy($this);
/*    */     }
/*    */   }
/*    */   
/*    */   @Method(modid = "IC2-Classic")
/*    */   private static void updateEnergy(IndustrialCraft2Classic $this) {
/* 34 */     $this.tryAllSides((Function2<Object, ForgeDirection, Object>)new IndustrialCraft2Classic$$anonfun$updateEnergy$3($this), 
/*    */ 
/*    */ 
/*    */         
/* 38 */         (Function1<Object, Object>)new IndustrialCraft2Classic$$anonfun$updateEnergy$1($this), (Function1<Object, Object>)new IndustrialCraft2Classic$$anonfun$updateEnergy$2($this));
/*    */   }
/*    */   
/*    */   public static void validate(IndustrialCraft2Classic $this) {
/* 42 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$validate();
/* 43 */     if (useIndustrialCraft2ClassicPower($this) && !$this.addedToIC2PowerGrid()) EventHandler$.MODULE$.scheduleIC2Add($this); 
/*    */   }
/*    */   
/*    */   public static void invalidate(IndustrialCraft2Classic $this) {
/* 47 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$invalidate();
/* 48 */     if (useIndustrialCraft2ClassicPower($this) && $this.addedToIC2PowerGrid()) removeFromIC2Grid($this); 
/*    */   }
/*    */   
/*    */   public static void onChunkUnload(IndustrialCraft2Classic $this) {
/* 52 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$onChunkUnload();
/* 53 */     if (useIndustrialCraft2ClassicPower($this) && $this.addedToIC2PowerGrid()) removeFromIC2Grid($this); 
/*    */   } private static void removeFromIC2Grid(IndustrialCraft2Classic $this) {
/*    */     try {
/*    */     
/*    */     } finally {
/* 58 */       Exception exception = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void readFromNBTForServer(IndustrialCraft2Classic $this, NBTTagCompound nbt) {
/* 66 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$readFromNBTForServer(nbt);
/* 67 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ic2cpower").toString()));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(IndustrialCraft2Classic $this, NBTTagCompound nbt) {
/* 71 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$super$writeToNBTForServer(nbt);
/* 72 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ic2cpower").toString(), $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer());
/*    */   }
/*    */ 
/*    */   
/*    */   @Method(modid = "IC2-Classic")
/*    */   public static boolean isAddedToEnergyNet(IndustrialCraft2Classic $this) {
/* 78 */     return $this.addedToIC2PowerGrid();
/*    */   } @Method(modid = "IC2-Classic")
/*    */   public static int getMaxSafeInput(IndustrialCraft2Classic $this) {
/* 81 */     return Integer.MAX_VALUE;
/*    */   } @Method(modid = "IC2-Classic")
/*    */   public static boolean acceptsEnergyFrom(IndustrialCraft2Classic $this, TileEntity emitter, Direction direction) {
/* 84 */     return (useIndustrialCraft2ClassicPower($this) && $this.canConnectPower(direction.toForgeDirection()));
/*    */   }
/*    */   @Method(modid = "IC2-Classic")
/*    */   public static boolean injectEnergy(IndustrialCraft2Classic $this, Direction directionFrom, int amount) {
/* 88 */     $this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq($this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() + amount);
/* 89 */     return true;
/*    */   }
/*    */   
/*    */   @Method(modid = "IC2-Classic")
/*    */   public static int demandsEnergy(IndustrialCraft2Classic $this) {
/* 94 */     return useIndustrialCraft2ClassicPower($this) ? (
/* 95 */       ($this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() < $this.energyThroughput() * Settings$.MODULE$.get().tickFrequency()) ? 
/* 96 */       (int)package$.MODULE$.min(BoxesRunTime.unboxToDouble(Predef$.MODULE$.doubleArrayOps((double[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new IndustrialCraft2Classic$$anonfun$demandsEnergy$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Double()))).max((Ordering)Ordering$Double$.MODULE$)), Power$.MODULE$.toEU($this.energyThroughput())) : 
/* 97 */       0) : 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\IndustrialCraft2Classic$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */