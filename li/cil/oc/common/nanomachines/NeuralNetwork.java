/*     */ package li.cil.oc.common.nanomachines;
/*     */ import li.cil.oc.api.nanomachines.Behavior;
/*     */ import li.cil.oc.api.nanomachines.BehaviorProvider;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.TraversableLike;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.ArrayBuffer$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.util.Random;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005}d\001B\001\003\0015\021QBT3ve\006dg*\032;x_J\\'BA\002\005\0031q\027M\\8nC\016D\027N\\3t\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\005Y\006twMC\001\024\003\021Q\027M^1\n\005U\001\"AB(cU\026\034G\017\005\002\03055\t\001D\003\002\032\r\005\031\021\r]5\n\005mA\"a\003)feNL7\017^1cY\026D\001\"\b\001\003\002\003\006IAH\001\013G>tGO]8mY\026\024\bCA\020!\033\005\021\021BA\021\003\0059\031uN\034;s_2dWM]%na2DQa\t\001\005\002\021\na\001P5oSRtDCA\023'!\ty\002\001C\003\036E\001\007a\004C\004)\001\t\007I\021A\025\002\021Q\024\030nZ4feN,\022A\013\t\004WI\"T\"\001\027\013\0055r\023aB7vi\006\024G.\032\006\003_A\n!bY8mY\026\034G/[8o\025\005\t\024!B:dC2\f\027BA\032-\005-\t%O]1z\005V4g-\032:\021\005U2T\"\001\001\007\t]\002\001\001\017\002\016)JLwmZ3s\035\026,(o\0348\024\007YJT\b\005\002;w5\t\001'\003\002=a\t1\021I\\=SK\032\004\"!\016 \007\017}\002\001\023aI\001\001\n1a*Z;s_:\034\"AP\035\t\013\tsd\021A\"\002\021%\034\030i\031;jm\026,\022\001\022\t\003u\025K!A\022\031\003\017\t{w\016\\3b]\")1E\016C\001\021R\tA\007C\004Cm\001\007I\021A\"\t\017-3\004\031!C\001\031\006a\021n]!di&4Xm\030\023fcR\021Q\n\025\t\003u9K!a\024\031\003\tUs\027\016\036\005\b#*\013\t\0211\001E\003\rAH%\r\005\007'Z\002\013\025\002#\002\023%\034\030i\031;jm\026\004\003BB+\001A\003%!&A\005ue&<w-\032:tA!9q\013\001b\001\n\003A\026AC2p]:,7\r^8sgV\t\021\fE\002,ei\003\"!N.\007\tq\003\001!\030\002\020\007>tg.Z2u_JtU-\036:p]N\0311,O\037\t\013\rZF\021A0\025\003iCq!Y.C\002\023\005!-\001\004j]B,Ho]\013\002GB\0311FM\037\t\r\025\\\006\025!\003d\003\035Ig\016];ug\002BQAQ.\005B\rCa\001\033\001!\002\023I\026aC2p]:,7\r^8sg\002BqA\033\001C\002\023\0051.A\005cK\"\fg/[8sgV\tA\016E\002,e5\004\"!\0168\007\t=\004\001\001\035\002\017\005\026D\027M^5pe:+WO]8o'\tq'\f\003\005s]\n\025\r\021\"\001t\003!\001(o\034<jI\026\024X#\001;\021\005U<X\"\001<\013\005\rA\022B\001=w\005A\021U\r[1wS>\024\bK]8wS\022,'\017\003\005{]\n\005\t\025!\003u\003%\001(o\034<jI\026\024\b\005\003\005}]\n\025\r\021\"\001~\003!\021W\r[1wS>\024X#\001@\021\005U|\030bAA\001m\nA!)\0325bm&|'\017C\005\002\0069\024\t\021)A\005}\006I!-\0325bm&|'\017\t\005\007G9$\t!!\003\025\0135\fY!!\004\t\rI\f9\0011\001u\021\031a\030q\001a\001}\"9\021\021\003\001!\002\023a\027A\0032fQ\0064\030n\034:tA!I\021Q\003\001C\002\023\005\021qC\001\fE\026D\027M^5pe6\013\007/\006\002\002\032A)1&a\007[&\031\021Q\004\027\003\0075\013\007\017\003\005\002\"\001\001\013\021BA\r\0031\021W\r[1wS>\024X*\0319!\021\031\t\007\001\"\001\002&Q!\021qEA\027!\rQ\024\021F\005\004\003W\001$aA%oi\"1A0a\tA\002yDq!!\r\001\t\003\t\031$A\006sK\016|gNZ5hkJ,G#A'\t\017\005]\002\001\"\001\0024\005)A-\0322vO\"9\0211\b\001\005\002\005u\022!\0029sS:$HcA'\002@!A\021\021IA\035\001\004\t\031%\001\004qY\006LXM\035\t\005\003\013\n)&\004\002\002H)!\021\021IA%\025\021\tY%!\024\002\r\025tG/\033;z\025\021\ty%!\025\002\0235Lg.Z2sC\032$(BAA*\003\rqW\r^\005\005\003/\n9E\001\007F]RLG/\037)mCf,'\017C\004\002\\\001!\t%!\030\002\tM\fg/\032\013\004\033\006}\003\002CA1\0033\002\r!a\031\002\0079\024G\017\005\003\002f\005%TBAA4\025\021\t\t'!\024\n\t\005-\024q\r\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\tY\006\001C\001\003_\"R!TA9\003gB\001\"!\031\002n\001\007\0211\r\005\b\003k\ni\0071\001E\003\0351wN]%uK6Dq!!\037\001\t\003\nY(\001\003m_\006$GcA'\002~!A\021\021MA<\001\004\t\031\007")
/*     */ public class NeuralNetwork implements Persistable {
/*     */   public final ControllerImpl li$cil$oc$common$nanomachines$NeuralNetwork$$controller;
/*  23 */   private final ArrayBuffer<TriggerNeuron> triggers = (ArrayBuffer<TriggerNeuron>)ArrayBuffer$.MODULE$.empty(); public ArrayBuffer<TriggerNeuron> triggers() { return this.triggers; }
/*  24 */    private final ArrayBuffer<ConnectorNeuron> connectors = (ArrayBuffer<ConnectorNeuron>)ArrayBuffer$.MODULE$.empty(); public ArrayBuffer<ConnectorNeuron> connectors() { return this.connectors; }
/*  25 */    private final ArrayBuffer<BehaviorNeuron> behaviors = (ArrayBuffer<BehaviorNeuron>)ArrayBuffer$.MODULE$.empty(); public ArrayBuffer<BehaviorNeuron> behaviors() { return this.behaviors; }
/*     */   
/*  27 */   private final Map<Behavior, BehaviorNeuron> behaviorMap = Map$.MODULE$.empty(); public Map<Behavior, BehaviorNeuron> behaviorMap() { return this.behaviorMap; }
/*     */   public int inputs(Behavior behavior) { boolean bool;
/*  29 */     Option option = behaviorMap().get(behavior);
/*  30 */     if (option instanceof Some) { Some some = (Some)option; BehaviorNeuron node = (BehaviorNeuron)some.x(); bool = node.inputs().count((Function1)new NeuralNetwork$$anonfun$inputs$1(this)); }
/*  31 */     else { bool = false; }
/*     */     
/*     */     return bool; } public final class NeuralNetwork$$anonfun$inputs$1 extends AbstractFunction1<Neuron, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.Neuron x$1) { return x$1.isActive(); }
/*     */     public NeuralNetwork$$anonfun$inputs$1(NeuralNetwork $outer) {} }
/*  36 */   public void reconfigure() { behaviors().clear();
/*  37 */     behaviors().$plus$plus$eq((TraversableOnce)((TraversableLike)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable(Nanomachines.getProviders())
/*  38 */         .map((Function1)new NeuralNetwork$$anonfun$reconfigure$1(this), Iterable$.MODULE$.canBuildFrom()))
/*  39 */         .filter((Function1)new NeuralNetwork$$anonfun$reconfigure$2(this)))
/*  40 */         .flatMap((Function1)new NeuralNetwork$$anonfun$reconfigure$3(this), Iterable$.MODULE$.canBuildFrom()));
/*     */ 
/*     */     
/*  43 */     while (triggers().length() > behaviors().length() * Settings$.MODULE$.get().nanomachineTriggerQuota()) {
/*  44 */       triggers().remove(triggers().length() - 1);
/*     */     }
/*  46 */     triggers().foreach((Function1)new NeuralNetwork$$anonfun$reconfigure$4(this));
/*  47 */     while (triggers().length() < behaviors().length() * Settings$.MODULE$.get().nanomachineTriggerQuota()) {
/*  48 */       triggers().$plus$eq(new TriggerNeuron(this));
/*     */     }
/*     */ 
/*     */     
/*  52 */     while (connectors().length() > behaviors().length() * Settings$.MODULE$.get().nanomachineConnectorQuota()) {
/*  53 */       connectors().remove(connectors().length() - 1);
/*     */     }
/*  55 */     connectors().foreach((Function1)new NeuralNetwork$$anonfun$reconfigure$5(this));
/*  56 */     while (connectors().length() < behaviors().length() * Settings$.MODULE$.get().nanomachineConnectorQuota()) {
/*  57 */       connectors().$plus$eq(new ConnectorNeuron(this));
/*     */     }
/*     */ 
/*     */     
/*  61 */     Random rng = new Random((this.li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player().func_130014_f_()).field_73012_v.nextInt());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     ArrayBuffer sourcePool = (ArrayBuffer)ArrayBuffer$.MODULE$.fill(Settings$.MODULE$.get().nanomachineMaxOutputs(), (Function0)new NeuralNetwork$$anonfun$2(this)).flatten((Function1)Predef$.MODULE$.$conforms());
/*  83 */     connect$1((Iterable)connectors(), sourcePool, rng);
/*  84 */     sourcePool.$plus$plus$eq((TraversableOnce)ArrayBuffer$.MODULE$.fill(Settings$.MODULE$.get().nanomachineMaxOutputs(), (Function0)new NeuralNetwork$$anonfun$reconfigure$6(this)).flatten((Function1)Predef$.MODULE$.$conforms()));
/*  85 */     connect$1((Iterable)behaviors(), sourcePool, rng);
/*     */ 
/*     */     
/*  88 */     ArrayBuffer deadConnectors = (ArrayBuffer)connectors().filter((Function1)new NeuralNetwork$$anonfun$3(this));
/*  89 */     connectors().$minus$minus$eq((TraversableOnce)deadConnectors);
/*  90 */     behaviors().foreach((Function1)new NeuralNetwork$$anonfun$reconfigure$7(this, deadConnectors));
/*     */     
/*  92 */     ArrayBuffer deadBehaviors = (ArrayBuffer)behaviors().filter((Function1)new NeuralNetwork$$anonfun$4(this));
/*  93 */     behaviors().$minus$minus$eq((TraversableOnce)deadBehaviors);
/*     */     
/*  95 */     behaviorMap().clear();
/*  96 */     behaviorMap().$plus$plus$eq((TraversableOnce)behaviors().map((Function1)new NeuralNetwork$$anonfun$reconfigure$8(this), ArrayBuffer$.MODULE$.canBuildFrom())); } public final class NeuralNetwork$$anonfun$reconfigure$1 extends AbstractFunction1<BehaviorProvider, Tuple2<BehaviorProvider, Iterable<Behavior>>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<BehaviorProvider, Iterable<Behavior>> apply(BehaviorProvider p) { return new Tuple2(p, Option$.MODULE$.apply(p.createBehaviors(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player())).map((Function1)new NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5(this)).orNull(Predef$.MODULE$.$conforms())); } public NeuralNetwork$$anonfun$reconfigure$1(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5 extends AbstractFunction1<Iterable<Behavior>, Iterable<Behavior>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<Behavior> apply(Iterable x$2) { return (Iterable<Behavior>)WrapAsScala$.MODULE$.iterableAsScalaIterable(x$2).filter((Function1)new NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5$$anonfun$apply$6(this)); } public NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5(NeuralNetwork$$anonfun$reconfigure$1 $outer) {} public final class NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5$$anonfun$apply$6 extends AbstractFunction1<Behavior, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Behavior x$3) { return !(x$3 == null); } public NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5$$anonfun$apply$6(NeuralNetwork$$anonfun$reconfigure$1$$anonfun$apply$5 $outer) {} } } } public final class NeuralNetwork$$anonfun$reconfigure$2 extends AbstractFunction1<Tuple2<BehaviorProvider, Iterable<Behavior>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$4) { return !(x$4._2() == null); } public NeuralNetwork$$anonfun$reconfigure$2(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$reconfigure$3 extends AbstractFunction1<Tuple2<BehaviorProvider, Iterable<Behavior>>, Iterable<BehaviorNeuron>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<NeuralNetwork.BehaviorNeuron> apply(Tuple2 pb) { return (Iterable<NeuralNetwork.BehaviorNeuron>)((TraversableLike)pb._2()).map((Function1)new NeuralNetwork$$anonfun$reconfigure$3$$anonfun$apply$7(this, pb), Iterable$.MODULE$.canBuildFrom()); } public NeuralNetwork$$anonfun$reconfigure$3(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$reconfigure$3$$anonfun$apply$7 extends AbstractFunction1<Behavior, NeuralNetwork.BehaviorNeuron> implements Serializable { public static final long serialVersionUID = 0L; private final Tuple2 pb$1; public final NeuralNetwork.BehaviorNeuron apply(Behavior b) { return new NeuralNetwork.BehaviorNeuron(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer(), (BehaviorProvider)this.pb$1._1(), b); } public NeuralNetwork$$anonfun$reconfigure$3$$anonfun$apply$7(NeuralNetwork$$anonfun$reconfigure$3 $outer, Tuple2 pb$1) {} } } public final class NeuralNetwork$$anonfun$reconfigure$4 extends AbstractFunction1<TriggerNeuron, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NeuralNetwork.TriggerNeuron x$5) { x$5.isActive_$eq(false); } public NeuralNetwork$$anonfun$reconfigure$4(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$reconfigure$5 extends AbstractFunction1<ConnectorNeuron, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NeuralNetwork.ConnectorNeuron x$6) { x$6.inputs().clear(); } public NeuralNetwork$$anonfun$reconfigure$5(NeuralNetwork $outer) {} } private final void connect$1(Iterable sinks, ArrayBuffer sources, Random rng$1) { Buffer sinkPool = (Buffer)rng$1.shuffle((TraversableOnce)sinks.toBuffer(), Buffer$.MODULE$.canBuildFrom()); sinkPool.withFilter((Function1)new NeuralNetwork$$anonfun$connect$1$1(this, sources)).foreach((Function1)new NeuralNetwork$$anonfun$connect$1$2(this, rng$1, sources)); } public final class NeuralNetwork$$anonfun$connect$1$1 extends AbstractFunction1<Sink, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer sources$1; public final boolean apply(NeuralNetwork.ConnectorNeuron sink) { return this.sources$1.nonEmpty(); } public NeuralNetwork$$anonfun$connect$1$1(NeuralNetwork $outer, ArrayBuffer sources$1) {} } public final class NeuralNetwork$$anonfun$connect$1$2 extends AbstractFunction1<Sink, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final Random rng$1; public final ArrayBuffer sources$1; public NeuralNetwork$$anonfun$connect$1$2(NeuralNetwork $outer, Random rng$1, ArrayBuffer sources$1) {} public final void apply(NeuralNetwork.ConnectorNeuron sink) { Set blacklist = Set$.MODULE$.empty(); RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(0), this.rng$1.nextInt(Settings$.MODULE$.get().nanomachineMaxInputs())).withFilter((Function1)new NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$1(this)).foreach((Function1)new NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8(this, blacklist, sink)); } public final class NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int n) { return apply$mcZI$sp(n); } public boolean apply$mcZI$sp(int n) { return this.$outer.sources$1.nonEmpty(); } public NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$1(NeuralNetwork$$anonfun$connect$1$2 $outer) {} } public final class NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Set blacklist$1; private final NeuralNetwork.ConnectorNeuron sink$1; public NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8(NeuralNetwork$$anonfun$connect$1$2 $outer, Set blacklist$1, NeuralNetwork.ConnectorNeuron sink$1) {} public final Object apply(int n) { int baseIndex = this.$outer.rng$1.nextInt(this.$outer.sources$1.length()); int sourceIndex = ((BufferLike)this.$outer.sources$1.drop(baseIndex)).$plus$plus((GenTraversableOnce)this.$outer.sources$1.take(baseIndex)).indexWhere((Function1)new NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8$$anonfun$1(this)); NeuralNetwork.Neuron source = (NeuralNetwork.Neuron)this.$outer.sources$1.remove((sourceIndex + baseIndex) % this.$outer.sources$1.length()); this.blacklist$1.$plus$eq(source); return (sourceIndex >= 0) ? this.sink$1.inputs().$plus$eq(source) : BoxedUnit.UNIT; } public final class NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8$$anonfun$1 extends AbstractFunction1<Source, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.Neuron s) { return !this.$outer.blacklist$1.contains(s); } public NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8$$anonfun$1(NeuralNetwork$$anonfun$connect$1$2$$anonfun$apply$8 $outer) {} } } } public final class NeuralNetwork$$anonfun$2 extends AbstractFunction0<ArrayBuffer<Neuron>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer<NeuralNetwork.Neuron> apply() { return (ArrayBuffer<NeuralNetwork.Neuron>)this.$outer.triggers().map((Function1)new NeuralNetwork$$anonfun$2$$anonfun$apply$9(this), ArrayBuffer$.MODULE$.canBuildFrom()); } public NeuralNetwork$$anonfun$2(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$2$$anonfun$apply$9 extends AbstractFunction1<NeuralNetwork.TriggerNeuron, NeuralNetwork.Neuron> implements Serializable { public static final long serialVersionUID = 0L; public final NeuralNetwork.Neuron apply(NeuralNetwork.TriggerNeuron x$7) { return x$7; } public NeuralNetwork$$anonfun$2$$anonfun$apply$9(NeuralNetwork$$anonfun$2 $outer) {} } } public final class NeuralNetwork$$anonfun$reconfigure$6 extends AbstractFunction0<ArrayBuffer<Neuron>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer<NeuralNetwork.Neuron> apply() { return (ArrayBuffer<NeuralNetwork.Neuron>)this.$outer.connectors().map((Function1)new NeuralNetwork$$anonfun$reconfigure$6$$anonfun$apply$10(this), ArrayBuffer$.MODULE$.canBuildFrom()); } public NeuralNetwork$$anonfun$reconfigure$6(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$reconfigure$6$$anonfun$apply$10 extends AbstractFunction1<NeuralNetwork.ConnectorNeuron, NeuralNetwork.Neuron> implements Serializable { public static final long serialVersionUID = 0L; public final NeuralNetwork.Neuron apply(NeuralNetwork.ConnectorNeuron x$8) { return x$8; } public NeuralNetwork$$anonfun$reconfigure$6$$anonfun$apply$10(NeuralNetwork$$anonfun$reconfigure$6 $outer) {} } } public final class NeuralNetwork$$anonfun$3 extends AbstractFunction1<ConnectorNeuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.ConnectorNeuron x$9) { return x$9.inputs().isEmpty(); } public NeuralNetwork$$anonfun$3(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$reconfigure$7 extends AbstractFunction1<BehaviorNeuron, ArrayBuffer<Neuron>> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer deadConnectors$1; public final ArrayBuffer<NeuralNetwork.Neuron> apply(NeuralNetwork.BehaviorNeuron x$10) { return (ArrayBuffer<NeuralNetwork.Neuron>)x$10.inputs().$minus$minus$eq((TraversableOnce)this.deadConnectors$1); } public NeuralNetwork$$anonfun$reconfigure$7(NeuralNetwork $outer, ArrayBuffer deadConnectors$1) {} } public final class NeuralNetwork$$anonfun$4 extends AbstractFunction1<BehaviorNeuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.BehaviorNeuron x$11) { return x$11.inputs().isEmpty(); } public NeuralNetwork$$anonfun$4(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$reconfigure$8 extends AbstractFunction1<BehaviorNeuron, Tuple2<Behavior, BehaviorNeuron>> implements Serializable { public final Tuple2<Behavior, NeuralNetwork.BehaviorNeuron> apply(NeuralNetwork.BehaviorNeuron n) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(n.behavior()), n); }
/*     */      public static final long serialVersionUID = 0L;
/*     */     public NeuralNetwork$$anonfun$reconfigure$8(NeuralNetwork $outer) {} }
/*     */   public void debug() {
/*     */     NeuralNetwork$$anonfun$6 neuralNetwork$$anonfun$62;
/* 101 */     EntityPlayer entityPlayer = this.li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player();
/* 102 */     if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer; NeuralNetwork$$anonfun$5 neuralNetwork$$anonfun$5 = new NeuralNetwork$$anonfun$5(this, entityPlayerMP); }
/* 103 */     else { neuralNetwork$$anonfun$62 = new NeuralNetwork$$anonfun$6(this); }
/*     */      NeuralNetwork$$anonfun$6 neuralNetwork$$anonfun$61 = neuralNetwork$$anonfun$62;
/* 105 */     (new String[2])[0] = "Creating debug configuration for nanomachines in player "; (new String[2])[1] = "."; neuralNetwork$$anonfun$61.apply((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { this.li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player().getDisplayName() })));
/*     */     
/* 107 */     behaviors().clear();
/* 108 */     behaviors().$plus$plus$eq((TraversableOnce)((TraversableLike)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable(Nanomachines.getProviders())
/* 109 */         .map((Function1)new NeuralNetwork$$anonfun$debug$2(this), Iterable$.MODULE$.canBuildFrom()))
/* 110 */         .filter((Function1)new NeuralNetwork$$anonfun$debug$3(this)))
/* 111 */         .flatMap((Function1)new NeuralNetwork$$anonfun$debug$4(this), Iterable$.MODULE$.canBuildFrom()));
/*     */     
/* 113 */     connectors().clear();
/*     */     
/* 115 */     triggers().clear();
/* 116 */     behaviors().indices().foreach$mVc$sp((Function1)new NeuralNetwork$$anonfun$debug$1(this, (Function1)neuralNetwork$$anonfun$61)); } public final class NeuralNetwork$$anonfun$5 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayerMP x2$1; public final void apply(String s) { PacketSender$.MODULE$.sendClientLog(s, this.x2$1); } public NeuralNetwork$$anonfun$5(NeuralNetwork $outer, EntityPlayerMP x2$1) {} } public final class NeuralNetwork$$anonfun$6 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(String s) { OpenComputers$.MODULE$.log().info(s); } public NeuralNetwork$$anonfun$6(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$debug$2 extends AbstractFunction1<BehaviorProvider, Tuple2<BehaviorProvider, Iterable<Behavior>>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<BehaviorProvider, Iterable<Behavior>> apply(BehaviorProvider p) { return new Tuple2(p, Option$.MODULE$.apply(p.createBehaviors(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player())).map((Function1)new NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11(this)).orNull(Predef$.MODULE$.$conforms())); } public NeuralNetwork$$anonfun$debug$2(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11 extends AbstractFunction1<Iterable<Behavior>, Iterable<Behavior>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<Behavior> apply(Iterable x$12) { return (Iterable<Behavior>)WrapAsScala$.MODULE$.iterableAsScalaIterable(x$12).filter((Function1)new NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11$$anonfun$apply$12(this)); } public NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11(NeuralNetwork$$anonfun$debug$2 $outer) {} public final class NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11$$anonfun$apply$12 extends AbstractFunction1<Behavior, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Behavior x$13) { return !(x$13 == null); } public NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11$$anonfun$apply$12(NeuralNetwork$$anonfun$debug$2$$anonfun$apply$11 $outer) {} } } } public final class NeuralNetwork$$anonfun$debug$3 extends AbstractFunction1<Tuple2<BehaviorProvider, Iterable<Behavior>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$14) { return !(x$14._2() == null); } public NeuralNetwork$$anonfun$debug$3(NeuralNetwork $outer) {} } public final class NeuralNetwork$$anonfun$debug$4 extends AbstractFunction1<Tuple2<BehaviorProvider, Iterable<Behavior>>, Iterable<BehaviorNeuron>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<NeuralNetwork.BehaviorNeuron> apply(Tuple2 pb) { return (Iterable<NeuralNetwork.BehaviorNeuron>)((TraversableLike)pb._2()).map((Function1)new NeuralNetwork$$anonfun$debug$4$$anonfun$apply$13(this, pb), Iterable$.MODULE$.canBuildFrom()); } public NeuralNetwork$$anonfun$debug$4(NeuralNetwork $outer) {} public final class NeuralNetwork$$anonfun$debug$4$$anonfun$apply$13 extends AbstractFunction1<Behavior, NeuralNetwork.BehaviorNeuron> implements Serializable { public static final long serialVersionUID = 0L; private final Tuple2 pb$2; public final NeuralNetwork.BehaviorNeuron apply(Behavior b) { return new NeuralNetwork.BehaviorNeuron(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer(), (BehaviorProvider)this.pb$2._1(), b); } public NeuralNetwork$$anonfun$debug$4$$anonfun$apply$13(NeuralNetwork$$anonfun$debug$4 $outer, Tuple2 pb$2) {} } } public final class NeuralNetwork$$anonfun$debug$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Function1 log$1; public final void apply(int i) { apply$mcVI$sp(i); } public NeuralNetwork$$anonfun$debug$1(NeuralNetwork $outer, Function1 log$1) {} public void apply$mcVI$sp(int i) {
/* 117 */       NeuralNetwork.BehaviorNeuron behavior = (NeuralNetwork.BehaviorNeuron)this.$outer.behaviors().apply(i);
/* 118 */       NeuralNetwork.TriggerNeuron trigger = new NeuralNetwork.TriggerNeuron(this.$outer);
/* 119 */       this.$outer.triggers().$plus$eq(trigger);
/* 120 */       behavior.inputs().$plus$eq(trigger);
/*     */       
/* 122 */       (new String[4])[0] = ""; (new String[4])[1] = " -> "; (new String[4])[2] = " ("; (new String[4])[3] = ")"; this.log$1.apply((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(i), behavior.behavior().getNameHint(), behavior.behavior().getClass().toString() })));
/*     */     } }
/*     */ 
/*     */   
/*     */   public void print(EntityPlayer player) {
/* 127 */     StringBuilder sb = package$.MODULE$.StringBuilder().newBuilder();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     behaviors().foreach((Function1)new NeuralNetwork$$anonfun$print$1(this, player, sb));
/* 135 */   } public final StringBuilder li$cil$oc$common$nanomachines$NeuralNetwork$$colored$1(Object value, boolean enabled, StringBuilder sb$1) { enabled ? sb$1.append(EnumChatFormatting.GREEN) : sb$1.append(EnumChatFormatting.RED); sb$1.append(value); return sb$1.append(EnumChatFormatting.RESET); } public final class NeuralNetwork$$anonfun$print$1 extends AbstractFunction1<BehaviorNeuron, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final StringBuilder sb$1; public NeuralNetwork$$anonfun$print$1(NeuralNetwork $outer, EntityPlayer player$1, StringBuilder sb$1) {} public final void apply(NeuralNetwork.BehaviorNeuron behavior) { String name = (String)Option$.MODULE$.apply(behavior.behavior().getNameHint()).getOrElse((Function0)new NeuralNetwork$$anonfun$print$1$$anonfun$7(this, behavior));
/* 136 */       this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$colored$1(name, behavior.isActive(), this.sb$1);
/* 137 */       this.sb$1.append(" <- (");
/* 138 */       BooleanRef first = BooleanRef.create(true);
/* 139 */       behavior.inputs().foreach((Function1)new NeuralNetwork$$anonfun$print$1$$anonfun$apply$14(this, first));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 155 */       this.sb$1.append(")");
/* 156 */       this.player$1.func_145747_a((IChatComponent)new ChatComponentText(this.sb$1.toString()));
/* 157 */       this.sb$1.clear(); } public final class NeuralNetwork$$anonfun$print$1$$anonfun$7 extends AbstractFunction0<String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final NeuralNetwork.BehaviorNeuron behavior$1; public final String apply() { return this.behavior$1.behavior().getClass().getSimpleName(); } public NeuralNetwork$$anonfun$print$1$$anonfun$7(NeuralNetwork$$anonfun$print$1 $outer, NeuralNetwork.BehaviorNeuron behavior$1) {} } public final class NeuralNetwork$$anonfun$print$1$$anonfun$apply$14 extends AbstractFunction1<NeuralNetwork.Neuron, StringBuilder> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final BooleanRef first$1; public NeuralNetwork$$anonfun$print$1$$anonfun$apply$14(NeuralNetwork$$anonfun$print$1 $outer, BooleanRef first$1) {} public final StringBuilder apply(NeuralNetwork.Neuron input) { this.first$1.elem = false; this.first$1.elem ? BoxedUnit.UNIT : this.$outer.sb$1.append(", "); NeuralNetwork.Neuron neuron = input; if (neuron instanceof NeuralNetwork.TriggerNeuron) { NeuralNetwork.TriggerNeuron triggerNeuron = (NeuralNetwork.TriggerNeuron)neuron; StringBuilder stringBuilder = this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$colored$1(BoxesRunTime.boxToInteger(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().indexOf(triggerNeuron) + 1), triggerNeuron.isActive(), this.$outer.sb$1); } else { if (neuron instanceof NeuralNetwork.ConnectorNeuron) { NeuralNetwork.ConnectorNeuron connectorNeuron = (NeuralNetwork.ConnectorNeuron)neuron; this.$outer.sb$1.append("("); this.first$1.elem = true; connectorNeuron.inputs().foreach((Function1)new NeuralNetwork$$anonfun$print$1$$anonfun$apply$14$$anonfun$apply$15(this)); this.first$1.elem = false; return this.$outer.sb$1.append(")"); }  throw new MatchError(neuron); }  return (StringBuilder)SYNTHETIC_LOCAL_VARIABLE_4; } public final class NeuralNetwork$$anonfun$print$1$$anonfun$apply$14$$anonfun$apply$15 extends AbstractFunction1<NeuralNetwork.Neuron, StringBuilder> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$print$1$$anonfun$apply$14$$anonfun$apply$15(NeuralNetwork$$anonfun$print$1$$anonfun$apply$14 $outer) {}
/*     */         public final StringBuilder apply(NeuralNetwork.Neuron trigger) { this.$outer.first$1.elem = false; this.$outer.first$1.elem ? BoxedUnit.UNIT : (this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer()).sb$1.append(", "); return this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$colored$1(BoxesRunTime.boxToInteger(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().indexOf(trigger) + 1), trigger.isActive(), (this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer()).sb$1); } } } }
/* 162 */   public void save(NBTTagCompound nbt) { save(nbt, false); }
/*     */ 
/*     */   
/*     */   public void save(NBTTagCompound nbt, boolean forItem) {
/* 166 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("triggers", (Iterable)triggers().map((Function1)new NeuralNetwork$$anonfun$save$1(this, forItem), ArrayBuffer$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("connectors", (Iterable)connectors().map((Function1)new NeuralNetwork$$anonfun$save$2(this), ArrayBuffer$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("behaviors", (Iterable)behaviors().map((Function1)new NeuralNetwork$$anonfun$save$3(this), ArrayBuffer$.MODULE$.canBuildFrom()));
/* 179 */   } public final class NeuralNetwork$$anonfun$save$1 extends AbstractFunction1<TriggerNeuron, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final boolean forItem$1; public NeuralNetwork$$anonfun$save$1(NeuralNetwork $outer, boolean forItem$1) {} public final NBTTagCompound apply(NeuralNetwork.TriggerNeuron t) { NBTTagCompound nbt = new NBTTagCompound(); nbt.func_74757_a("isActive", (t.isActive() && !this.forItem$1)); return nbt; } } public final class NeuralNetwork$$anonfun$save$2 extends AbstractFunction1<ConnectorNeuron, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$save$2(NeuralNetwork $outer) {} public final NBTTagCompound apply(NeuralNetwork.ConnectorNeuron c) { NBTTagCompound nbt = new NBTTagCompound(); nbt.func_74783_a("triggerInputs", (int[])((TraversableOnce)((TraversableLike)c.inputs().map((Function1)new NeuralNetwork$$anonfun$save$2$$anonfun$apply$16(this), ArrayBuffer$.MODULE$.canBuildFrom())).filter((Function1)new NeuralNetwork$$anonfun$save$2$$anonfun$apply$2(this))).toArray(ClassTag$.MODULE$.Int())); return nbt; } public final class NeuralNetwork$$anonfun$save$2$$anonfun$apply$2 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int x$16) { return apply$mcZI$sp(x$16); } public boolean apply$mcZI$sp(int x$16) { return (x$16 >= 0); } public NeuralNetwork$$anonfun$save$2$$anonfun$apply$2(NeuralNetwork$$anonfun$save$2 $outer) {} } public final class NeuralNetwork$$anonfun$save$2$$anonfun$apply$16 extends AbstractFunction1<NeuralNetwork.Neuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(NeuralNetwork.Neuron x$15) { return this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().indexOf(x$15); } public NeuralNetwork$$anonfun$save$2$$anonfun$apply$16(NeuralNetwork$$anonfun$save$2 $outer) {} } } public final class NeuralNetwork$$anonfun$save$3 extends AbstractFunction1<BehaviorNeuron, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$save$3(NeuralNetwork $outer) {} public final NBTTagCompound apply(NeuralNetwork.BehaviorNeuron b) { NBTTagCompound nbt = new NBTTagCompound();
/* 180 */       nbt.func_74783_a("triggerInputs", (int[])((TraversableOnce)((TraversableLike)b.inputs().map((Function1)new NeuralNetwork$$anonfun$save$3$$anonfun$apply$17(this), ArrayBuffer$.MODULE$.canBuildFrom())).filter((Function1)new NeuralNetwork$$anonfun$save$3$$anonfun$apply$3(this))).toArray(ClassTag$.MODULE$.Int()));
/* 181 */       nbt.func_74783_a("connectorInputs", (int[])((TraversableOnce)((TraversableLike)b.inputs().map((Function1)new NeuralNetwork$$anonfun$save$3$$anonfun$apply$18(this), ArrayBuffer$.MODULE$.canBuildFrom())).filter((Function1)new NeuralNetwork$$anonfun$save$3$$anonfun$apply$4(this))).toArray(ClassTag$.MODULE$.Int()));
/* 182 */       nbt.func_74782_a("behavior", (NBTBase)b.provider().writeToNBT(b.behavior()));
/* 183 */       return nbt; } public final class NeuralNetwork$$anonfun$save$3$$anonfun$apply$3 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(int x$18) { return apply$mcZI$sp(x$18); } public boolean apply$mcZI$sp(int x$18) { return (x$18 >= 0); } public NeuralNetwork$$anonfun$save$3$$anonfun$apply$3(NeuralNetwork$$anonfun$save$3 $outer) {} } public final class NeuralNetwork$$anonfun$save$3$$anonfun$apply$17 extends AbstractFunction1<NeuralNetwork.Neuron, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int apply(NeuralNetwork.Neuron x$17) { return this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().indexOf(x$17); } public NeuralNetwork$$anonfun$save$3$$anonfun$apply$17(NeuralNetwork$$anonfun$save$3 $outer) {} } public final class NeuralNetwork$$anonfun$save$3$$anonfun$apply$4 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(int x$20) { return apply$mcZI$sp(x$20); } public boolean apply$mcZI$sp(int x$20) { return (x$20 >= 0); } public NeuralNetwork$$anonfun$save$3$$anonfun$apply$4(NeuralNetwork$$anonfun$save$3 $outer) {} } public final class NeuralNetwork$$anonfun$save$3$$anonfun$apply$18 extends AbstractFunction1<NeuralNetwork.Neuron, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int apply(NeuralNetwork.Neuron x$19) { return this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().connectors().indexOf(x$19); } public NeuralNetwork$$anonfun$save$3$$anonfun$apply$18(NeuralNetwork$$anonfun$save$3 $outer) {} } }
/* 188 */   public void load(NBTTagCompound nbt) { triggers().clear();
/* 189 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("triggers", 10)).foreach((Function1)new NeuralNetwork$$anonfun$load$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     connectors().clear();
/* 196 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("connectors", 10)).foreach((Function1)new NeuralNetwork$$anonfun$load$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     behaviors().clear();
/* 203 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("behaviors", 10)).foreach((Function1)new NeuralNetwork$$anonfun$load$3(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 216 */     behaviorMap().clear();
/* 217 */     behaviorMap().$plus$plus$eq((TraversableOnce)behaviors().map((Function1)new NeuralNetwork$$anonfun$load$4(this), ArrayBuffer$.MODULE$.canBuildFrom())); } public NeuralNetwork(ControllerImpl controller) {} public final class NeuralNetwork$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$load$1(NeuralNetwork $outer) {} public final void apply(NBTTagCompound t) { NeuralNetwork.TriggerNeuron neuron = new NeuralNetwork.TriggerNeuron(this.$outer); neuron.isActive_$eq(t.func_74767_n("isActive")); this.$outer.triggers().$plus$eq(neuron); } } public final class NeuralNetwork$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$load$2(NeuralNetwork $outer) {} public final void apply(NBTTagCompound t) { NeuralNetwork.ConnectorNeuron neuron = new NeuralNetwork.ConnectorNeuron(this.$outer); neuron.inputs().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(t.func_74759_k("triggerInputs")).map((Function1)new NeuralNetwork$$anonfun$load$2$$anonfun$apply$19(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit()))); this.$outer.connectors().$plus$eq(neuron); } public final class NeuralNetwork$$anonfun$load$2$$anonfun$apply$19 extends AbstractFunction1<Object, NeuralNetwork.TriggerNeuron> implements Serializable { public static final long serialVersionUID = 0L; public final NeuralNetwork.TriggerNeuron apply(int idx) { return (NeuralNetwork.TriggerNeuron)this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().apply(idx); } public NeuralNetwork$$anonfun$load$2$$anonfun$apply$19(NeuralNetwork$$anonfun$load$2 $outer) {} } } public final class NeuralNetwork$$anonfun$load$3 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public NeuralNetwork$$anonfun$load$3(NeuralNetwork $outer) {} public final void apply(NBTTagCompound t) { WrapAsScala$.MODULE$.iterableAsScalaIterable(Nanomachines.getProviders()).find((Function1)new NeuralNetwork$$anonfun$load$3$$anonfun$apply$20(this, t)); } public final class NeuralNetwork$$anonfun$load$3$$anonfun$apply$20 extends AbstractFunction1<BehaviorProvider, Object> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound t$1; public final boolean apply(BehaviorProvider p) { boolean bool; Behavior behavior = p.readFromNBT((this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer()).li$cil$oc$common$nanomachines$NeuralNetwork$$controller.player(), this.t$1.func_74775_l("behavior")); if (behavior != null) { Behavior behavior1 = behavior; NeuralNetwork.BehaviorNeuron neuron = new NeuralNetwork.BehaviorNeuron(this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer(), p, behavior1); neuron.inputs().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(this.t$1.func_74759_k("triggerInputs")).map((Function1)new NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$21(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit()))); neuron.inputs().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(this.t$1.func_74759_k("connectorInputs")).map((Function1)new NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$22(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit()))); this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().behaviors().$plus$eq(neuron); bool = true; } else { bool = false; }  return bool; } public NeuralNetwork$$anonfun$load$3$$anonfun$apply$20(NeuralNetwork$$anonfun$load$3 $outer, NBTTagCompound t$1) {} public final class NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$21 extends AbstractFunction1<Object, NeuralNetwork.TriggerNeuron> implements Serializable { public static final long serialVersionUID = 0L; public final NeuralNetwork.TriggerNeuron apply(int idx) { return (NeuralNetwork.TriggerNeuron)this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().triggers().apply(idx); } public NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$21(NeuralNetwork$$anonfun$load$3$$anonfun$apply$20 $outer) {} } public final class NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$22 extends AbstractFunction1<Object, NeuralNetwork.ConnectorNeuron> implements Serializable { public static final long serialVersionUID = 0L; public final NeuralNetwork.ConnectorNeuron apply(int idx) { return (NeuralNetwork.ConnectorNeuron)this.$outer.li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$anonfun$$$outer().li$cil$oc$common$nanomachines$NeuralNetwork$$anonfun$$$outer().connectors().apply(idx); } public NeuralNetwork$$anonfun$load$3$$anonfun$apply$20$$anonfun$apply$22(NeuralNetwork$$anonfun$load$3$$anonfun$apply$20 $outer) {} } } } public final class NeuralNetwork$$anonfun$load$4 extends AbstractFunction1<BehaviorNeuron, Tuple2<Behavior, BehaviorNeuron>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<Behavior, NeuralNetwork.BehaviorNeuron> apply(NeuralNetwork.BehaviorNeuron n) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(n.behavior()), n); }
/*     */     
/*     */     public NeuralNetwork$$anonfun$load$4(NeuralNetwork $outer) {} }
/*     */   
/*     */   public class TriggerNeuron implements Neuron { public TriggerNeuron(NeuralNetwork $outer) {}
/*     */     
/*     */     private boolean isActive = false;
/*     */     
/* 225 */     public void isActive_$eq(boolean x$1) { this.isActive = x$1; } public boolean isActive() { return this.isActive; }
/*     */      }
/*     */ 
/*     */   
/* 229 */   public class ConnectorNeuron implements Neuron { private final ArrayBuffer<NeuralNetwork.Neuron> inputs = (ArrayBuffer<NeuralNetwork.Neuron>)ArrayBuffer$.MODULE$.empty(); public ArrayBuffer<NeuralNetwork.Neuron> inputs() { return this.inputs; }
/*     */     
/* 231 */     public boolean isActive() { return inputs().forall((Function1)new NeuralNetwork$ConnectorNeuron$$anonfun$isActive$1(this)); } public ConnectorNeuron(NeuralNetwork $outer) {} public final class NeuralNetwork$ConnectorNeuron$$anonfun$isActive$1 extends AbstractFunction1<NeuralNetwork.Neuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.Neuron x$21) { return x$21.isActive(); }
/*     */        public NeuralNetwork$ConnectorNeuron$$anonfun$isActive$1(NeuralNetwork.ConnectorNeuron $outer) {} } }
/*     */   public class BehaviorNeuron extends ConnectorNeuron { private final BehaviorProvider provider; private final Behavior behavior;
/* 234 */     public BehaviorProvider provider() { return this.provider; } public Behavior behavior() { return this.behavior; } public BehaviorNeuron(NeuralNetwork $outer, BehaviorProvider provider, Behavior behavior) { super($outer); }
/*     */      }
/*     */ 
/*     */   
/*     */   public interface Neuron {
/*     */     boolean isActive();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\NeuralNetwork.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */