/*     */ package li.cil.oc.common.tileentity.traits.power;
/*     */ 
/*     */ import appeng.api.AEApi;
/*     */ import appeng.api.networking.IGridNode;
/*     */ import appeng.api.util.AECableType;
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.common.EventHandler$;
/*     */ import li.cil.oc.integration.Mods$;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Function2;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AppliedEnergistics2$class
/*     */ {
/*     */   private static boolean useAppliedEnergistics2Power(AppliedEnergistics2 $this) {
/*  26 */     return ($this.isServer() && Mods$.MODULE$.AppliedEnergistics2().isAvailable());
/*     */   }
/*     */   public static void $init$(AppliedEnergistics2 $this) {
/*  29 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq((Option<Object>)None$.MODULE$);
/*     */   }
/*     */   public static void updateEntity(AppliedEnergistics2 $this) {
/*  32 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$updateEntity();
/*  33 */     if (useAppliedEnergistics2Power($this) && $this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/*  34 */       updateEnergy($this);
/*     */     }
/*     */   }
/*     */   
/*     */   @Method(modid = "appliedenergistics2")
/*     */   private static void updateEnergy(AppliedEnergistics2 $this) {
/*  40 */     $this.tryAllSides((Function2<Object, ForgeDirection, Object>)new AppliedEnergistics2$$anonfun$updateEnergy$3($this), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  50 */         (Function1<Object, Object>)new AppliedEnergistics2$$anonfun$updateEnergy$1($this), (Function1<Object, Object>)new AppliedEnergistics2$$anonfun$updateEnergy$2($this));
/*     */   }
/*     */   
/*     */   public static void validate(AppliedEnergistics2 $this) {
/*  54 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$validate();
/*  55 */     if (useAppliedEnergistics2Power($this)) EventHandler$.MODULE$.scheduleAE2Add($this); 
/*     */   }
/*     */   
/*     */   public static void invalidate(AppliedEnergistics2 $this) {
/*  59 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$invalidate();
/*  60 */     if (useAppliedEnergistics2Power($this)) $this.securityBreak(); 
/*     */   }
/*     */   
/*     */   public static void onChunkUnload(AppliedEnergistics2 $this) {
/*  64 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$onChunkUnload();
/*  65 */     if (useAppliedEnergistics2Power($this)) $this.securityBreak();
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(AppliedEnergistics2 $this, NBTTagCompound nbt) {
/*  71 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$readFromNBTForServer(nbt);
/*  72 */     if (useAppliedEnergistics2Power($this)) loadNode($this, nbt); 
/*     */   }
/*     */   
/*     */   @Method(modid = "appliedenergistics2")
/*     */   private static void loadNode(AppliedEnergistics2 $this, NBTTagCompound nbt) {
/*  77 */     $this.getGridNode(ForgeDirection.UNKNOWN).loadFromNBT((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ae2power").toString(), nbt);
/*     */   }
/*     */   
/*     */   public static void writeToNBTForServer(AppliedEnergistics2 $this, NBTTagCompound nbt) {
/*  81 */     $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$super$writeToNBTForServer(nbt);
/*  82 */     if (useAppliedEnergistics2Power($this)) saveNode($this, nbt); 
/*     */   }
/*     */   
/*     */   @Method(modid = "appliedenergistics2")
/*     */   private static void saveNode(AppliedEnergistics2 $this, NBTTagCompound nbt) {
/*  87 */     $this.getGridNode(ForgeDirection.UNKNOWN).saveToNBT((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("ae2power").toString(), nbt);
/*     */   }
/*     */   
/*     */   @Method(modid = "appliedenergistics2")
/*     */   public static IGridNode getGridNode(AppliedEnergistics2 $this, ForgeDirection side) {
/*     */     IGridNode iGridNode;
/*  93 */     Option<Object> option = $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node();
/*  94 */     if (option instanceof Some) { Some some = (Some)option; Object gridNode = some.x(); if (gridNode instanceof IGridNode) { IGridNode iGridNode1; return iGridNode1 = (IGridNode)gridNode; }  }
/*  95 */      if ($this.isServer())
/*  96 */     { IGridNode gridNode = AEApi.instance().createGridNode(new AppliedEnergistics2GridBlock($this));
/*  97 */       $this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option$.MODULE$.apply(gridNode));
/*  98 */       iGridNode = gridNode; }
/*  99 */     else { iGridNode = null; }
/*     */     
/*     */     return iGridNode; } @Method(modid = "appliedenergistics2")
/*     */   public static AECableType getCableConnectionType(AppliedEnergistics2 $this, ForgeDirection side) {
/* 103 */     return AECableType.SMART;
/*     */   }
/*     */   @Method(modid = "appliedenergistics2")
/*     */   public static void securityBreak(AppliedEnergistics2 $this) {
/* 107 */     $this.getGridNode(ForgeDirection.UNKNOWN).destroy();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\AppliedEnergistics2$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */