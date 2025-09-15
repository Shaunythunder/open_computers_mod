/*    */ package li.cil.oc;
/*    */ import cpw.mods.fml.common.Mod.EventHandler;
/*    */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*    */ import cpw.mods.fml.common.event.FMLInterModComms;
/*    */ import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
/*    */ import cpw.mods.fml.common.event.FMLPostInitializationEvent;
/*    */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*    */ import cpw.mods.fml.common.event.FMLServerStartingEvent;
/*    */ import cpw.mods.fml.common.event.FMLServerStoppedEvent;
/*    */ import cpw.mods.fml.common.network.FMLEventChannel;
/*    */ import li.cil.oc.common.Proxy;
/*    */ import li.cil.oc.util.SafeThreadPool;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ @Mod(modid = "OpenComputers", name = "OpenComputers", version = "1.10.30-GTNH", modLanguage = "scala", useMetadata = true)
/*    */ @ScalaSignature(bytes = "\006\001\005\rw!B\001\003\021\003I\021!D(qK:\034u.\0349vi\026\0248O\003\002\004\t\005\021qn\031\006\003\013\031\t1aY5m\025\0059\021A\0017j\007\001\001\"AC\006\016\003\t1Q\001\004\002\t\0025\021Qb\0249f]\016{W\016];uKJ\0348CA\006\017!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fM\")Qc\003C\001-\0051A(\0338jiz\"\022!\003\005\b1-\021\r\021\"\002\032\003\tIE)F\001\033\037\005Y\022%A\001\t\ruY\001\025!\004\033\003\rIE\t\t\005\b?-\021\r\021\"\002\032\003\021q\025-\\3\t\r\005Z\001\025!\004\033\003\025q\025-\\3!\021\035\0313B1A\005\006\021\n\021\"T2WKJ\034\030n\0348\026\003\025z\021AJ\021\002O\005a\021GL\034/cAjcm\034:hK\"1\021f\003Q\001\016\025\n!\"T2WKJ\034\030n\0348!\021\035Y3B1A\005\0061\nqAV3sg&|g.F\001.\037\005q\023%A\030\002\031Er\023\007\r\0304a5:EK\024%\t\rEZ\001\025!\004.\003!1VM]:j_:\004\003\"B\032\f\t\003!\024a\0017pOV\tQ\007\005\00275\tqG\003\0029s\005)An\\45U*\021!hO\001\bY><w-\0338h\025\taT(\001\004ba\006\034\007.\032\006\002}\005\031qN]4\n\005\001;$A\002'pO\036,'\017C\004C\027\001\007I\021A\"\002\r1|wmZ3s+\005!\005cA\bFk%\021a\t\005\002\007\037B$\030n\0348\t\017![\001\031!C\001\023\006QAn\\4hKJ|F%Z9\025\005)k\005CA\bL\023\ta\005C\001\003V]&$\bb\002(H\003\003\005\r\001R\001\004q\022\n\004B\002)\fA\003&A)A\004m_\036<WM\035\021\t\017I[\001\031!C\001'\006)\001O]8ysV\tA\013\005\002V16\taK\003\002X\005\00511m\\7n_:L!!\027,\003\013A\023x\016_=\t\017m[\001\031!C\0019\006I\001O]8ys~#S-\035\013\003\025vCqA\024.\002\002\003\007A\013\003\004`\027\001\006K\001V\001\007aJ|\0070\037\021)\ry\013G.\\8q!\t\021'.D\001d\025\t9FM\003\002fM\006\031a-\0347\013\005\035D\027\001B7pINT\021![\001\004GB<\030BA6d\005)\031\026\016Z3e!J|\0070_\001\013G2LWM\034;TS\022,\027%\0018\002-1LgfY5m]=\034gf\0317jK:$h\006\025:pqf\f!b]3sm\026\0248+\0333fC\005\t\030A\0067j]\rLGNL8d]M,'O^3s]A\023x\016_=\t\023M\\\001\031!a\001\n\003!\030aB2iC:tW\r\\\013\002kB\021a/_\007\002o*\021\001pY\001\b]\026$xo\034:l\023\tQxOA\bG\0332+e/\0328u\007\"\fgN\\3m\021%a8\0021AA\002\023\005Q0A\006dQ\006tg.\0327`I\025\fHC\001&\021\035q50!AA\002UDq!!\001\fA\003&Q/\001\005dQ\006tg.\0327!\021\035\t)a\003C\001\003\017\tq\001\035:f\023:LG\017F\002K\003\023A\001\"a\003\002\004\001\007\021QB\001\002KB!\021qBA\013\033\t\t\tBC\002\002\024\r\fQ!\032<f]RLA!a\006\002\022\tIb)\024'Qe\026Le.\033;jC2L'0\031;j_:,e/\0328uQ\021\t\031!a\007\021\t\005u\021\021\b\b\005\003?\t)D\004\003\002\"\005Mb\002BA\022\003cqA!!\n\00209!\021qEA\027\033\t\tICC\002\002,!\ta\001\020:p_Rt\024\"A5\n\005\035D\027BA3g\023\t9F-C\002\0028\r\f1!T8e\023\021\tY$!\020\003\031\0253XM\034;IC:$G.\032:\013\007\005]2\rC\004\002B-!\t!a\021\002\t%t\027\016\036\013\004\025\006\025\003\002CA\006\003\001\r!a\022\021\t\005=\021\021J\005\005\003\027\n\tB\001\fG\0332Ke.\033;jC2L'0\031;j_:,e/\0328uQ\021\ty$a\007\t\017\005E3\002\"\001\002T\005A\001o\\:u\023:LG\017F\002K\003+B\001\"a\003\002P\001\007\021q\013\t\005\003\037\tI&\003\003\002\\\005E!A\007$N\031B{7\017^%oSRL\027\r\\5{CRLwN\\#wK:$\b\006BA(\0037Aq!!\031\f\t\003\t\031'A\bnSN\034\030N\\4NCB\004\030N\\4t)\rQ\025Q\r\005\t\003\027\ty\0061\001\002hA!\021qBA5\023\021\tY'!\005\003/\031kE*T5tg&tw-T1qa&twm]#wK:$\b\006BA0\0037Aq!!\035\f\t\003\t\031(A\006tKJ4XM]*uCJ$Hc\001&\002v!A\0211BA8\001\004\t9\b\005\003\002\020\005e\024\002BA>\003#\021aCR'M'\026\024h/\032:Ti\006\024H/\0338h\013Z,g\016\036\025\005\003_\nY\002C\004\002\002.!\t!a!\002\025M,'O^3s'R|\007\017F\002K\003\013C\001\"a\003\002\000\001\007\021q\021\t\005\003\037\tI)\003\003\002\f\006E!!\006$N\031N+'O^3s'R|\007\017]3e\013Z,g\016\036\025\005\003\nY\002C\004\002\022.!\t!a%\002\007%l7\rF\002K\003+C\001\"a\003\002\020\002\007\021q\023\t\005\0033\013\031K\004\003\002\034\006}e\002BA\020\003;K1!a\005d\023\021\t\t+!\005\002!\031kE*\0238uKJlu\016Z\"p[6\034\030\002BAS\003O\023\001\"S'D\013Z,g\016\036\006\005\003C\013\t\002\013\003\002\020\006m\001\006F\006\002.\006M6$!.\034\003os\023\021XA^\003{\013y\fE\002c\003_K1!!-d\005\riu\016Z\001\006[>$\027\016Z\001\005]\006lW-A\004wKJ\034\030n\0348\002\0275|G\rT1oOV\fw-Z\021\002#\005YQo]3NKR\fG-\031;b3\005\t\001\006\006\001\002.\006M6$!.\034\003os\023\021XA^\003{\013y\f")
/*    */ public final class OpenComputers { @EventHandler
/*    */   public static void imc(FMLInterModComms.IMCEvent paramIMCEvent) { OpenComputers$.MODULE$.imc(paramIMCEvent); } @EventHandler
/*    */   public static void serverStop(FMLServerStoppedEvent paramFMLServerStoppedEvent) { OpenComputers$.MODULE$.serverStop(paramFMLServerStoppedEvent); } @EventHandler
/*    */   public static void serverStart(FMLServerStartingEvent paramFMLServerStartingEvent) { OpenComputers$.MODULE$.serverStart(paramFMLServerStartingEvent); } @EventHandler
/*    */   public static void missingMappings(FMLMissingMappingsEvent paramFMLMissingMappingsEvent) { OpenComputers$.MODULE$.missingMappings(paramFMLMissingMappingsEvent); } @EventHandler
/*    */   public static void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent) { OpenComputers$.MODULE$.postInit(paramFMLPostInitializationEvent); } @EventHandler
/*    */   public static void init(FMLInitializationEvent paramFMLInitializationEvent) { OpenComputers$.MODULE$.init(paramFMLInitializationEvent); } @EventHandler
/* 28 */   public static void preInit(FMLPreInitializationEvent paramFMLPreInitializationEvent) { OpenComputers$.MODULE$.preInit(paramFMLPreInitializationEvent); } public static void channel_$eq(FMLEventChannel paramFMLEventChannel) { OpenComputers$.MODULE$.channel_$eq(paramFMLEventChannel); } public static FMLEventChannel channel() { return OpenComputers$.MODULE$.channel(); } public static void proxy_$eq(Proxy paramProxy) { OpenComputers$.MODULE$.proxy_$eq(paramProxy); } public static Proxy proxy() { return OpenComputers$.MODULE$.proxy(); } public static void logger_$eq(Option<Logger> paramOption) { OpenComputers$.MODULE$.logger_$eq(paramOption); } public static Option<Logger> logger() { return OpenComputers$.MODULE$.logger(); } public static Logger log() { return OpenComputers$.MODULE$.log(); } public static String Version() { return OpenComputers$.MODULE$.Version(); } public static String McVersion() { return OpenComputers$.MODULE$.McVersion(); } public static String Name() { return OpenComputers$.MODULE$.Name(); } public static String ID() { return OpenComputers$.MODULE$.ID(); } public final class OpenComputers$$anonfun$log$1 extends AbstractFunction0<Logger> implements Serializable { public final Logger apply() { return LogManager.getLogger("OpenComputers"); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class OpenComputers$$anonfun$serverStart$1
/*    */     extends AbstractFunction1<SafeThreadPool, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final void apply(SafeThreadPool x$1) {
/* 62 */       x$1.newThreadPool();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class OpenComputers$$anonfun$serverStop$1
/*    */     extends AbstractFunction1<SafeThreadPool, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final void apply(SafeThreadPool x$2) {
/* 93 */       x$2.waitForCompletion();
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\OpenComputers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */