/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import factorization.api.Charge;
/*    */ import factorization.api.Coord;
/*    */ import factorization.api.IChargeConductor;
/*    */ import li.cil.oc.OpenComputers$;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import scala.Function1;
/*    */ import scala.Function2;
/*    */ 
/*    */ public abstract class Factorization$class {
/*    */   private static boolean useFactorizationPower(Factorization $this) {
/* 16 */     return ($this.isServer() && Mods$.MODULE$.Factorization().isAvailable());
/*    */   } public static void $init$(Factorization $this) {} public static Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge(Factorization $this) {
/*    */     Object object;
/* 19 */     Factorization factorization = $this;
/* 20 */     if (factorization instanceof IChargeConductor) { Factorization factorization1 = factorization; object = new Charge((IChargeConductor)factorization1); }
/*    */     else
/* 22 */     { OpenComputers$.MODULE$.log().warn("Failed setting up Factorization power, which most likely means the class transformer did not run. You're probably running in an incorrectly configured development environment. Try adding `-Dfml.coreMods.load=li.cil.oc.common.launch.TransformerLoader` to the VM options of your run configuration.");
/* 23 */       object = null; }
/*    */     
/*    */     return object;
/*    */   }
/*    */   
/*    */   public static void updateEntity(Factorization $this) {
/* 29 */     if (useFactorizationPower($this)) updateEnergy($this); 
/* 30 */     $this.li$cil$oc$common$tileentity$traits$power$Factorization$$super$updateEntity();
/*    */   }
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   private static void updateEnergy(Factorization $this) {
/* 35 */     $this.getCharge().update();
/* 36 */     if ($this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 37 */       $this.tryAllSides((Function2<Object, ForgeDirection, Object>)new Factorization$$anonfun$updateEnergy$3($this), (Function1<Object, Object>)new Factorization$$anonfun$updateEnergy$1($this), (Function1<Object, Object>)new Factorization$$anonfun$updateEnergy$2($this));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void invalidate(Factorization $this) {
/* 42 */     if (useFactorizationPower($this)) invalidateCharge($this); 
/* 43 */     $this.li$cil$oc$common$tileentity$traits$power$Factorization$$super$invalidate();
/*    */   }
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   private static void invalidateCharge(Factorization $this) {
/* 48 */     $this.getCharge().invalidate();
/*    */   }
/*    */   
/*    */   public static void onChunkUnload(Factorization $this) {
/* 52 */     if (useFactorizationPower($this)) removeCharge($this); 
/* 53 */     $this.li$cil$oc$common$tileentity$traits$power$Factorization$$super$onChunkUnload();
/*    */   }
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   private static void removeCharge(Factorization $this) {
/* 58 */     if (!((TileEntity)$this).func_145837_r()) $this.getCharge().remove();
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public static void readFromNBTForServer(Factorization $this, NBTTagCompound nbt) {
/* 64 */     $this.li$cil$oc$common$tileentity$traits$power$Factorization$$super$readFromNBTForServer(nbt);
/* 65 */     if (useFactorizationPower($this)) loadCharge($this, nbt); 
/*    */   }
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   private static void loadCharge(Factorization $this, NBTTagCompound nbt) {
/* 70 */     $this.getCharge().readFromNBT(nbt, "fzpower");
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(Factorization $this, NBTTagCompound nbt) {
/* 74 */     $this.li$cil$oc$common$tileentity$traits$power$Factorization$$super$writeToNBTForServer(nbt);
/* 75 */     if (useFactorizationPower($this)) saveCharge($this, nbt); 
/*    */   }
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   private static void saveCharge(Factorization $this, NBTTagCompound nbt) {
/* 80 */     $this.getCharge().writeToNBT(nbt, "fzpower");
/*    */   }
/*    */ 
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   public static Charge getCharge(Factorization $this) {
/* 86 */     return Mods$.MODULE$.Factorization().isAvailable() ? (Charge)$this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge() : null;
/*    */   } @Method(modid = "factorization")
/*    */   public static String getInfo(Factorization $this) {
/* 89 */     return "";
/*    */   } @Method(modid = "factorization")
/*    */   public static Coord getCoord(Factorization $this) {
/* 92 */     return new Coord((TileEntity)$this);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Factorization$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */