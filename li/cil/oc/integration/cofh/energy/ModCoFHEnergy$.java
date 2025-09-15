/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cpw.mods.fml.common.ModContainer;
/*    */ import cpw.mods.fml.common.versioning.ArtifactVersion;
/*    */ import cpw.mods.fml.common.versioning.VersionRange;
/*    */ import li.cil.oc.api.Driver;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ 
/*    */ public final class ModCoFHEnergy$ implements ModProxy {
/*    */   public static final ModCoFHEnergy$ MODULE$;
/*    */   
/* 13 */   private ModCoFHEnergy$() { MODULE$ = this;
/*    */ 
/*    */     
/* 16 */     this.li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI = VersionRange.createFromVersionSpec("[1.0.0,)"); } private final VersionRange li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI; public Mods.SimpleMod getMod() { return li.cil.oc.integration.Mods$.MODULE$.CoFHEnergy(); } public VersionRange li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI() { return this.li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI; }
/*    */   
/*    */   public void initialize() {
/* 19 */     IMC.registerToolDurabilityProvider("li.cil.oc.integration.cofh.energy.EventHandlerRedstoneFlux.getDurability");
/* 20 */     IMC.registerItemCharge(
/* 21 */         "RedstoneFlux", 
/* 22 */         "li.cil.oc.integration.cofh.energy.EventHandlerRedstoneFlux.canCharge", 
/* 23 */         "li.cil.oc.integration.cofh.energy.EventHandlerRedstoneFlux.charge");
/*    */     
/* 25 */     MinecraftForge.EVENT_BUS.register(EventHandlerRedstoneFlux$.MODULE$);
/*    */     
/* 27 */     Option apiVersion = scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(ModAPIManager.INSTANCE.getAPIList()).find((Function1)new ModCoFHEnergy$$anonfun$1()).map((Function1)new ModCoFHEnergy$$anonfun$2());
/* 28 */     if (apiVersion.exists((Function1)new ModCoFHEnergy$$anonfun$initialize$1())) {
/* 29 */       Driver.add((SidedBlock)new DriverEnergyProvider());
/* 30 */       Driver.add((SidedBlock)new DriverEnergyReceiver());
/*    */     } else {
/*    */       
/* 33 */       Driver.add((SidedBlock)new DriverEnergyHandler());
/*    */     } 
/*    */     
/* 36 */     Driver.add(new ConverterEnergyContainerItem());
/*    */   }
/*    */   
/*    */   public final class ModCoFHEnergy$$anonfun$1 extends AbstractFunction1<ModContainer, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(ModContainer x$1) {
/*    */       String str = "CoFHAPI|energy";
/*    */       if (x$1.getModId() == null) {
/*    */         x$1.getModId();
/*    */         if (str != null);
/*    */       } else if (x$1.getModId().equals(str)) {
/*    */       
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ModCoFHEnergy$$anonfun$2 extends AbstractFunction1<ModContainer, ArtifactVersion> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final ArtifactVersion apply(ModContainer x$2) {
/*    */       return x$2.getProcessedVersion();
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ModCoFHEnergy$$anonfun$initialize$1 extends AbstractFunction1<ArtifactVersion, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(ArtifactVersion x$1) {
/*    */       return ModCoFHEnergy$.MODULE$.li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI().containsVersion(x$1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\ModCoFHEnergy$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */