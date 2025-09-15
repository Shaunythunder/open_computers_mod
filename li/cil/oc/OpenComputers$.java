/*    */ package li.cil.oc;
/*    */ 
/*    */ import cpw.mods.fml.common.Mod.EventHandler;
/*    */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*    */ import cpw.mods.fml.common.network.FMLEventChannel;
/*    */ import li.cil.oc.common.Proxy;
/*    */ import li.cil.oc.util.SafeThreadPool;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @Mod(modid = "OpenComputers", name = "OpenComputers", version = "1.10.30-GTNH", modLanguage = "scala", useMetadata = true)
/*    */ public final class OpenComputers$ {
/*    */   public static final OpenComputers$ MODULE$;
/*    */   private final String ID;
/*    */   private final String Name;
/*    */   private final String McVersion;
/*    */   
/* 20 */   public final String ID() { return "OpenComputers"; } private final String Version; private Option<Logger> logger; @SidedProxy(clientSide = "li.cil.oc.client.Proxy", serverSide = "li.cil.oc.server.Proxy")
/*    */   private Proxy proxy; private FMLEventChannel channel; public final String Name() {
/* 22 */     return "OpenComputers";
/*    */   } public final String McVersion() {
/* 24 */     return "1.7.10-forge";
/*    */   } public final String Version() {
/* 26 */     return "1.10.30-GTNH";
/*    */   }
/* 28 */   public Logger log() { return (Logger)logger().getOrElse((Function0)new OpenComputers$$anonfun$log$1()); } public final class OpenComputers$$anonfun$log$1 extends AbstractFunction0<Logger> implements Serializable { public static final long serialVersionUID = 0L; public final Logger apply() { return LogManager.getLogger("OpenComputers"); }
/*    */      }
/* 30 */   public Option<Logger> logger() { return this.logger; } public void logger_$eq(Option<Logger> x$1) { this.logger = x$1; }
/*    */ 
/*    */   
/* 33 */   public Proxy proxy() { return this.proxy; } public void proxy_$eq(Proxy x$1) { this.proxy = x$1; }
/*    */   
/* 35 */   public FMLEventChannel channel() { return this.channel; } public void channel_$eq(FMLEventChannel x$1) { this.channel = x$1; }
/*    */   
/*    */   @EventHandler
/*    */   public void preInit(FMLPreInitializationEvent e) {
/* 39 */     logger_$eq(scala.Option$.MODULE$.apply(e.getModLog()));
/* 40 */     proxy().preInit(e);
/* 41 */     log().info("Done with pre init phase.");
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void init(FMLInitializationEvent e) {
/* 46 */     proxy().init(e);
/* 47 */     log().info("Done with init phase.");
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void postInit(FMLPostInitializationEvent e) {
/* 52 */     proxy().postInit(e);
/* 53 */     log().info("Done with post init phase.");
/*    */   }
/*    */   @EventHandler
/*    */   public void missingMappings(FMLMissingMappingsEvent e) {
/* 57 */     proxy().missingMappings(e);
/*    */   }
/*    */   @EventHandler
/*    */   public void serverStart(FMLServerStartingEvent e) {
/* 61 */     CommandHandler$.MODULE$.register(e);
/* 62 */     ThreadPoolFactory$.MODULE$.safePools().foreach((Function1)new OpenComputers$$anonfun$serverStart$1());
/*    */     
/* 64 */     if (Settings$.MODULE$.get().internetAccessConfigured())
/* 65 */       if (Settings$.MODULE$.get().internetFilteringRulesInvalid()) {
/* 66 */         log().warn("####################################################");
/* 67 */         log().warn("#                                                  #");
/* 68 */         log().warn("#  Could not parse Internet Card filtering rules!  #");
/* 69 */         log().warn("#  Review the server log and adjust the filtering  #");
/* 70 */         log().warn("#  list to ensure it is appropriately configured.  #");
/* 71 */         log().warn("#   (config/OpenComputers.cfg => filteringRules)   #");
/* 72 */         log().warn("# Internet access has been automatically disabled. #");
/* 73 */         log().warn("#                                                  #");
/* 74 */         log().warn("####################################################");
/* 75 */       } else if (!Settings$.MODULE$.get().internetFilteringRulesObserved() && e.getServer().func_71262_S()) {
/* 76 */         log().warn("####################################################");
/* 77 */         log().warn("#                                                  #");
/* 78 */         log().warn("#    It appears that you're running a dedicated    #");
/* 79 */         log().warn("#  server with OpenComputers installed! Make sure  #");
/* 80 */         log().warn("#  to review the Internet Card address filtering   #");
/* 81 */         log().warn("#  list to ensure it is appropriately configured.  #");
/* 82 */         log().warn("#   (config/OpenComputers.cfg => filteringRules)   #");
/* 83 */         log().warn("#                                                  #");
/* 84 */         log().warn("####################################################");
/*    */       } else {
/* 86 */         Object arg$macro$2 = BoxesRunTime.boxToInteger((Settings$.MODULE$.get().internetFilteringRules()).length); log().info((new StringOps("Successfully applied %s Internet Card filtering rules.")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { arg$macro$2 })));
/*    */       }  
/*    */   } public final class OpenComputers$$anonfun$serverStart$1 extends AbstractFunction1<SafeThreadPool, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(SafeThreadPool x$1) {
/*    */       x$1.newThreadPool();
/*    */     } }
/*    */   @EventHandler
/* 93 */   public void serverStop(FMLServerStoppedEvent e) { ThreadPoolFactory$.MODULE$.safePools().foreach((Function1)new OpenComputers$$anonfun$serverStop$1()); } public final class OpenComputers$$anonfun$serverStop$1 extends AbstractFunction1<SafeThreadPool, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(SafeThreadPool x$2) { x$2.waitForCompletion(); }
/*    */      }
/*    */   
/*    */   @EventHandler
/* 97 */   public void imc(FMLInterModComms.IMCEvent e) { IMC$.MODULE$.handleEvent(e); } private OpenComputers$() {
/* 98 */     MODULE$ = this;
/*    */     this.logger = (Option<Logger>)scala.None$.MODULE$;
/*    */     this.proxy = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\OpenComputers$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */