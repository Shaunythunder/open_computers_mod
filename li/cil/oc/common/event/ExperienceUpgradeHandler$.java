/*     */ package li.cil.oc.common.event;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.event.RobotBreakBlockEvent;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import li.cil.oc.api.internal.Robot;
/*     */ import li.cil.oc.server.component.UpgradeExperience;
/*     */ import scala.Function1;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.DoubleRef;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ public final class ExperienceUpgradeHandler$ {
/*     */   public static final ExperienceUpgradeHandler$ MODULE$;
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotAnalyze(RobotAnalyzeEvent e) {
/*  18 */     Tuple2<Object, Object> tuple2 = getLevelAndExperience(e.agent); if (tuple2 != null) { int level = tuple2._1$mcI$sp(); double experience = tuple2._2$mcD$sp(); Tuple2.mcID.sp sp2 = new Tuple2.mcID.sp(level, experience), sp1 = sp2; int i = sp1._1$mcI$sp(); double d1 = sp1._2$mcD$sp();
/*     */       
/*  20 */       if (d1 != 0.0D)
/*  21 */         e.player.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.RobotXp(d1, i)); 
/*     */       return; }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   } @SubscribeEvent
/*     */   public void onRobotComputeDamageRate(RobotUsedToolEvent.ComputeDamageRate e) {
/*  27 */     e.setDamageRate(e.getDamageRate() * scala.math.package$.MODULE$.max(0.0D, true - getLevel(e.agent) * li.cil.oc.Settings$.MODULE$.get().toolEfficiencyPerLevel()));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotBreakBlockPre(RobotBreakBlockEvent.Pre e) {
/*  32 */     double boost = scala.math.package$.MODULE$.max(0.0D, true - getLevel(e.agent) * li.cil.oc.Settings$.MODULE$.get().harvestSpeedBoostPerLevel());
/*  33 */     e.setBreakTime(e.getBreakTime() * boost);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotAttackEntityPost(RobotAttackEntityEvent.Post e) {
/*  38 */     Agent agent = e.agent;
/*  39 */     if (agent instanceof Robot) { Robot robot = (Robot)agent;
/*     */       
/*  41 */       addExperience((Agent)robot, li.cil.oc.Settings$.MODULE$.get().robotActionXp()); BoxedUnit boxedUnit = (robot.equipmentInventory().func_70301_a(0) != null && e.target.field_70128_L) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/*  43 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotBreakBlockPost(RobotBreakBlockEvent.Post e) {
/*  49 */     addExperience(e.agent, e.experience * li.cil.oc.Settings$.MODULE$.get().robotOreXpRate() + li.cil.oc.Settings$.MODULE$.get().robotActionXp());
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotPlaceBlockPost(RobotPlaceBlockEvent.Post e) {
/*  54 */     addExperience(e.agent, li.cil.oc.Settings$.MODULE$.get().robotActionXp());
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotMovePost(RobotMoveEvent.Post e) {
/*  59 */     addExperience(e.agent, li.cil.oc.Settings$.MODULE$.get().robotExhaustionXpRate() * 0.01D);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onRobotExhaustion(RobotExhaustionEvent e) {
/*  64 */     addExperience(e.agent, li.cil.oc.Settings$.MODULE$.get().robotExhaustionXpRate() * e.exhaustion);
/*     */   }
/*     */   public final class ExperienceUpgradeHandler$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IntRef acc$1; private final Robot x2$1; public final void apply(int index) { apply$mcVI$sp(index); } public ExperienceUpgradeHandler$$anonfun$1(IntRef acc$1, Robot x2$1) {} public void apply$mcVI$sp(int index) { Environment environment = this.x2$1.getComponentInSlot(index); if (environment instanceof UpgradeExperience) { UpgradeExperience upgradeExperience = (UpgradeExperience)environment; this.acc$1.elem += upgradeExperience.level(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  69 */        } } @SubscribeEvent public void onRobotRender(RobotRenderEvent e) { boolean bool; Agent agent = e.agent;
/*  70 */     if (agent instanceof Robot) { Robot robot = (Robot)agent;
/*  71 */       IntRef acc = IntRef.create(0); scala.runtime.RichInt$.MODULE$
/*  72 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), robot.func_70302_i_()).foreach$mVc$sp((Function1)new ExperienceUpgradeHandler$$anonfun$1(acc, robot));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  79 */       bool = acc.elem; }
/*  80 */     else { bool = false; }
/*     */      int level = bool;
/*  82 */     if (level > 19) {
/*  83 */       GL11.glColor3f(0.4F, 1.0F, 1.0F);
/*     */     }
/*  85 */     else if (level > 9) {
/*  86 */       GL11.glColor3f(1.0F, 1.0F, 0.4F);
/*     */     } else {
/*     */       
/*  89 */       GL11.glColor3f(0.5F, 0.5F, 0.5F);
/*     */     }  }
/*     */ 
/*     */   
/*     */   private int getLevel(Agent agent) {
/*  94 */     IntRef level = IntRef.create(0);
/*  95 */     foreachUpgrade(agent.machine().node(), (Function1<UpgradeExperience, BoxedUnit>)new ExperienceUpgradeHandler$$anonfun$getLevel$1(level));
/*  96 */     return level.elem; } public final class ExperienceUpgradeHandler$$anonfun$getLevel$1 extends AbstractFunction1<UpgradeExperience, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IntRef level$2; public final void apply(UpgradeExperience upgrade) {
/*     */       this.level$2.elem += upgrade.level();
/*     */     } public ExperienceUpgradeHandler$$anonfun$getLevel$1(IntRef level$2) {} }
/* 100 */   private Tuple2<Object, Object> getLevelAndExperience(Agent agent) { IntRef level = IntRef.create(0);
/* 101 */     DoubleRef experience = DoubleRef.create(0.0D);
/* 102 */     foreachUpgrade(agent.machine().node(), (Function1<UpgradeExperience, BoxedUnit>)new ExperienceUpgradeHandler$$anonfun$getLevelAndExperience$1(level, experience));
/*     */ 
/*     */ 
/*     */     
/* 106 */     return (Tuple2<Object, Object>)new Tuple2.mcID.sp(level.elem, experience.elem); } public final class ExperienceUpgradeHandler$$anonfun$getLevelAndExperience$1 extends AbstractFunction1<UpgradeExperience, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IntRef level$1; private final DoubleRef experience$1; public ExperienceUpgradeHandler$$anonfun$getLevelAndExperience$1(IntRef level$1, DoubleRef experience$1) {}
/*     */     public final void apply(UpgradeExperience upgrade) { this.level$1.elem += upgrade.level();
/*     */       this.experience$1.elem += upgrade.experience(); } }
/* 110 */   private void addExperience(Agent agent, double amount) { foreachUpgrade(agent.machine().node(), (Function1<UpgradeExperience, BoxedUnit>)new ExperienceUpgradeHandler$$anonfun$addExperience$1(amount)); } public final class ExperienceUpgradeHandler$$anonfun$addExperience$1 extends AbstractFunction1<UpgradeExperience, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final double amount$1; public final void apply(UpgradeExperience upgrade) { upgrade.addExperience(this.amount$1); }
/*     */     
/*     */     public ExperienceUpgradeHandler$$anonfun$addExperience$1(double amount$1) {} }
/*     */   
/* 114 */   private void foreachUpgrade(Node node, Function1 f) { scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(node.reachableNodes()).foreach((Function1)new ExperienceUpgradeHandler$$anonfun$foreachUpgrade$1(f)); } public final class ExperienceUpgradeHandler$$anonfun$foreachUpgrade$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Function1 f$1; public final void apply(Node x$2) { Environment environment = x$2.host();
/* 115 */       if (environment instanceof UpgradeExperience) { UpgradeExperience upgradeExperience = (UpgradeExperience)environment; BoxedUnit boxedUnit = (BoxedUnit)this.f$1.apply(upgradeExperience); }
/* 116 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */      public ExperienceUpgradeHandler$$anonfun$foreachUpgrade$1(Function1 f$1) {} } private ExperienceUpgradeHandler$() {
/* 119 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\ExperienceUpgradeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */