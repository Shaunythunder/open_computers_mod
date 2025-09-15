/*     */ package li.cil.oc.common.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.event.RobotAnalyzeEvent;
/*     */ import li.cil.oc.api.event.RobotAttackEntityEvent;
/*     */ import li.cil.oc.api.event.RobotBreakBlockEvent;
/*     */ import li.cil.oc.api.event.RobotExhaustionEvent;
/*     */ import li.cil.oc.api.event.RobotMoveEvent;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import li.cil.oc.api.event.RobotUsedToolEvent;
/*     */ import li.cil.oc.api.internal.Robot;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.server.component.UpgradeExperience;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.DoubleRef;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005}t!B\001\003\021\003i\021\001G#ya\026\024\030.\0328dKV\003xM]1eK\"\013g\016\0327fe*\0211\001B\001\006KZ,g\016\036\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\tAR\t\0379fe&,gnY3Va\036\024\030\rZ3IC:$G.\032:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!)Ad\004C\001;\005qqN\034*pE>$\030I\\1msj,GC\001\020\"!\t\031r$\003\002!)\t!QK\\5u\021\025\0213\0041\001$\003\005)\007C\001\023)\033\005)#BA\002'\025\t9c!A\002ba&L!!K\023\003#I{'m\034;B]\006d\027P_3Fm\026tG\017\013\002\034WA\021AFN\007\002[)\021afL\001\rKZ,g\016\0365b]\022dWM\035\006\003\013AR!!\r\032\002\007\031lGN\003\0024i\005!Qn\0343t\025\005)\024aA2qo&\021q'\f\002\017'V\0247o\031:jE\026,e/\0328u\021\025It\002\"\001;\003aygNU8c_R\034u.\0349vi\026$\025-\\1hKJ\013G/\032\013\003=mBQA\t\035A\002q\002\"!\020!\017\005\021r\024BA &\003I\021vNY8u+N,G\rV8pY\0263XM\034;\n\005\005\023%!E\"p[B,H/\032#b[\006<WMU1uK*\021q(\n\025\003q-BQ!R\b\005\002\031\013Ac\0348S_\n|GO\021:fC.\024En\\2l!J,GC\001\020H\021\025\021C\t1\001I!\tIEJ\004\002%\025&\0211*J\001\025%>\024w\016\036\"sK\006\\'\t\\8dW\0263XM\034;\n\0055s%a\001)sK*\0211*\n\025\003\t.BQ!U\b\005\002I\013qc\0348S_\n|G/\021;uC\016\\WI\034;jif\004vn\035;\025\005y\031\006\"\002\022Q\001\004!\006CA+Y\035\t!c+\003\002XK\0051\"k\0342pi\006#H/Y2l\013:$\030\016^=Fm\026tG/\003\002Z5\n!\001k\\:u\025\t9V\005\013\002QW!)Ql\004C\001=\006)rN\034*pE>$(I]3bW\ncwnY6Q_N$HC\001\020`\021\025\021C\f1\001a!\tI\025-\003\002Z\035\"\022Al\013\005\006I>!\t!Z\001\026_:\024vNY8u!2\f7-\032\"m_\016\\\007k\\:u)\tqb\rC\003#G\002\007q\r\005\002iW:\021A%[\005\003U\026\nACU8c_R\004F.Y2f\0052|7m[#wK:$\030BA-m\025\tQW\005\013\002dW!)qn\004C\001a\006yqN\034*pE>$Xj\034<f!>\034H\017\006\002\037c\")!E\034a\001eB\0211O\036\b\003IQL!!^\023\002\035I{'m\034;N_Z,WI^3oi&\021\021l\036\006\003k\026B#A\\\026\t\013i|A\021A>\002#=t'k\0342pi\026C\b.Y;ti&|g\016\006\002\037y\")!%\037a\001{B\021AE`\005\003\026\022ACU8c_R,\005\020[1vgRLwN\\#wK:$\bFA=,\021\035\t)a\004C\001\003\017\tQb\0348S_\n|GOU3oI\026\024Hc\001\020\002\n!9!%a\001A\002\005-\001c\001\023\002\016%\031\021qB\023\003!I{'m\034;SK:$WM]#wK:$\bfAA\002W!9\021QC\b\005\n\005]\021\001C4fi2+g/\0327\025\t\005e\021q\004\t\004'\005m\021bAA\017)\t\031\021J\034;\t\021\005\005\0221\003a\001\003G\tQ!Y4f]R\004B!!\n\002,5\021\021q\005\006\004\003S1\023\001C5oi\026\024h.\0317\n\t\0055\022q\005\002\006\003\036,g\016\036\005\b\003cyA\021BA\032\003U9W\r\036'fm\026d\027I\0343FqB,'/[3oG\026$B!!\016\002BA91#a\016\002\032\005m\022bAA\035)\t1A+\0369mKJ\0022aEA\037\023\r\ty\004\006\002\007\t>,(\r\\3\t\021\005\005\022q\006a\001\003GAq!!\022\020\t\023\t9%A\007bI\022,\005\020]3sS\026t7-\032\013\006=\005%\0231\n\005\t\003C\t\031\0051\001\002$!A\021QJA\"\001\004\tY$\001\004b[>,h\016\036\005\b\003#zA\021BA*\00391wN]3bG\",\006o\032:bI\026$RAHA+\003KB\001\"a\026\002P\001\007\021\021L\001\005]>$W\r\005\003\002\\\005\005TBAA/\025\r\tyFJ\001\b]\026$xo\034:l\023\021\t\031'!\030\003\t9{G-\032\005\t\003O\ny\0051\001\002j\005\ta\r\005\004\024\003W\nyGH\005\004\003[\"\"!\003$v]\016$\030n\03482!\021\t\t(a\037\016\005\005M$\002BA;\003o\n\021bY8na>tWM\034;\013\007\005ed!\001\004tKJ4XM]\005\005\003{\n\031HA\tVa\036\024\030\rZ3FqB,'/[3oG\026\004")
/*     */ public final class ExperienceUpgradeHandler {
/*     */   @SubscribeEvent
/*     */   public static void onRobotRender(RobotRenderEvent paramRobotRenderEvent) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotRender(paramRobotRenderEvent);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotExhaustion(RobotExhaustionEvent paramRobotExhaustionEvent) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotExhaustion(paramRobotExhaustionEvent);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotMovePost(RobotMoveEvent.Post paramPost) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotMovePost(paramPost);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotPlaceBlockPost(RobotPlaceBlockEvent.Post paramPost) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotPlaceBlockPost(paramPost);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotBreakBlockPost(RobotBreakBlockEvent.Post paramPost) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotBreakBlockPost(paramPost);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotAttackEntityPost(RobotAttackEntityEvent.Post paramPost) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotAttackEntityPost(paramPost);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotBreakBlockPre(RobotBreakBlockEvent.Pre paramPre) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotBreakBlockPre(paramPre);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotComputeDamageRate(RobotUsedToolEvent.ComputeDamageRate paramComputeDamageRate) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotComputeDamageRate(paramComputeDamageRate);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onRobotAnalyze(RobotAnalyzeEvent paramRobotAnalyzeEvent) {
/*     */     ExperienceUpgradeHandler$.MODULE$.onRobotAnalyze(paramRobotAnalyzeEvent);
/*     */   }
/*     */   
/*     */   public final class ExperienceUpgradeHandler$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*  72 */     public final void apply(int index) { apply$mcVI$sp(index); } private final IntRef acc$1; private final Robot x2$1; public ExperienceUpgradeHandler$$anonfun$1(IntRef acc$1, Robot x2$1) {} public void apply$mcVI$sp(int index) {
/*  73 */       Environment environment = this.x2$1.getComponentInSlot(index);
/*  74 */       if (environment instanceof UpgradeExperience) { UpgradeExperience upgradeExperience = (UpgradeExperience)environment;
/*  75 */         this.acc$1.elem += upgradeExperience.level(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  76 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExperienceUpgradeHandler$$anonfun$getLevel$1
/*     */     extends AbstractFunction1<UpgradeExperience, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final IntRef level$2;
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(UpgradeExperience upgrade) {
/*  95 */       this.level$2.elem += upgrade.level();
/*     */     }
/*     */     public ExperienceUpgradeHandler$$anonfun$getLevel$1(IntRef level$2) {} }
/*     */   public final class ExperienceUpgradeHandler$$anonfun$getLevelAndExperience$1 extends AbstractFunction1<UpgradeExperience, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef level$1; private final DoubleRef experience$1;
/*     */     
/*     */     public ExperienceUpgradeHandler$$anonfun$getLevelAndExperience$1(IntRef level$1, DoubleRef experience$1) {}
/*     */     
/*     */     public final void apply(UpgradeExperience upgrade) {
/* 103 */       this.level$1.elem += upgrade.level();
/* 104 */       this.experience$1.elem += upgrade.experience();
/*     */     } }
/*     */   public final class ExperienceUpgradeHandler$$anonfun$addExperience$1 extends AbstractFunction1<UpgradeExperience, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final double amount$1;
/*     */     
/*     */     public final void apply(UpgradeExperience upgrade) {
/* 110 */       upgrade.addExperience(this.amount$1);
/*     */     } public ExperienceUpgradeHandler$$anonfun$addExperience$1(double amount$1) {} }
/*     */   public final class ExperienceUpgradeHandler$$anonfun$foreachUpgrade$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final void apply(Node x$2) {
/* 114 */       Environment environment = x$2.host();
/* 115 */       if (environment instanceof UpgradeExperience) { UpgradeExperience upgradeExperience = (UpgradeExperience)environment; BoxedUnit boxedUnit = (BoxedUnit)this.f$1.apply(upgradeExperience); }
/* 116 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */     
/*     */     private final Function1 f$1;
/*     */     
/*     */     public ExperienceUpgradeHandler$$anonfun$foreachUpgrade$1(Function1 f$1) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\ExperienceUpgradeHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */