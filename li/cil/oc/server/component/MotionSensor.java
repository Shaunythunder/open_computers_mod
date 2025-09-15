/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.Vec3;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.immutable.Set;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Uh\001B\001\003\0015\021A\"T8uS>t7+\0328t_JT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021!i\002A!b\001\n\003q\022\001\0025pgR,\022a\b\t\003A\rj\021!\t\006\003EI\tqA\\3uo>\0248.\003\002%C\tyQI\034<je>tW.\0328u\021>\034H\017\003\005'\001\t\005\t\025!\003 \003\025Awn\035;!\021\025A\003\001\"\001*\003\031a\024N\\5u}Q\021!\006\f\t\003W\001i\021A\001\005\006;\035\002\ra\b\005\b]\001\021\r\021\"\0210\003\021qw\016Z3\026\003A\002\"\001I\031\n\005I\n#AE\"p[B|g.\0328u\007>tg.Z2u_JDa\001\016\001!\002\023\001\024!\0028pI\026\004\003b\002\034\001\005\004%IaN\001\007e\006$\027.^:\026\003a\002\"!\017\037\016\003iR\021aO\001\006g\016\fG.Y\005\003{i\0221!\0238u\021\031y\004\001)A\005q\0059!/\0313jkN\004\003bB!\001\001\004%IAQ\001\fg\026t7/\033;jm&$\0300F\001D!\tID)\003\002Fu\t1Ai\\;cY\026Dqa\022\001A\002\023%\001*A\btK:\034\030\016^5wSRLx\fJ3r)\tIE\n\005\002:\025&\0211J\017\002\005+:LG\017C\004N\r\006\005\t\031A\"\002\007a$\023\007\003\004P\001\001\006KaQ\001\rg\026t7/\033;jm&$\030\020\t\005\b#\002\021\r\021\"\003S\003=!(/Y2lK\022,e\016^5uS\026\034X#A*\021\tQK6,Z\007\002+*\021akV\001\b[V$\030M\0317f\025\tA&(\001\006d_2dWm\031;j_:L!AW+\003\0075\013\007\017\005\002]G6\tQL\003\002_?\0061QM\034;jifT!\001Y1\002\0235Lg.Z2sC\032$(\"\0012\002\0079,G/\003\002e;\n\001RI\034;jifd\025N^5oO\n\0137/\032\t\006s\031\0345iQ\005\003Oj\022a\001V;qY\026\034\004BB5\001A\003%1+\001\tue\006\0347.\0323F]RLG/[3tA!A1\016\001EC\002\0235A.\001\006eKZL7-Z%oM>,\022!\034\t\005]F\024(/D\001p\025\t\001x+A\005j[6,H/\0312mK&\021!l\034\t\003gbl\021\001\036\006\003kZ\fA\001\\1oO*\tq/\001\003kCZ\f\027BA=u\005\031\031FO]5oO\"A1\020\001E\001B\0036Q.A\006eKZL7-Z%oM>\004\003\"B?\001\t\003r\030!D4fi\022+g/[2f\023:4w\016F\001\000!!\t\t!a\002\002\n\005%QBAA\002\025\r\t)A^\001\005kRLG.C\002[\003\007\001B!a\003\002\0229\031\021(!\004\n\007\005=!(\001\004Qe\026$WMZ\005\004s\006M!bAA\bu!9\021q\003\001\005\n\005e\021!B<pe2$WCAA\016!\021\ti\"!\t\016\005\005}!bAA\f?&!\0211EA\020\005\0259vN\0357e\021\031\t9\003\001C\005\005\006\t\001\020\003\004\002,\001!IAQ\001\002s\"1\021q\006\001\005\n\t\013\021A\037\005\b\003g\001A\021BA\033\003!I7oU3sm\026\024XCAA\034!\rI\024\021H\005\004\003wQ$a\002\"p_2,\027M\034\005\b\003\001A\021IA!\003%\031\027M\\+qI\006$X\r\006\002\0028!9\021Q\t\001\005B\005\035\023AB;qI\006$X\rF\001J\021\035\tY\005\001C\005\003\033\nAb]3og>\024(i\\;oIN,\"!a\024\021\t\005E\023QK\007\003\003'R1!!\002`\023\021\t9&a\025\003\033\005C\030n]!mS\036tW\r\032\"C\021\035\tY\006\001C\005\003;\n\021\"[:J]J\013gnZ3\025\t\005]\022q\f\005\007=\006e\003\031A.\t\017\005\r\004\001\"\003\002f\005Y\021n]\"mK\006\024\b+\031;i)\021\t9$a\032\t\021\005%\024\021\ra\001\003W\na\001^1sO\026$\b\003BA)\003[JA!a\034\002T\t!a+Z24\021\035\t\031\b\001C\005\003k\n\021\"[:WSNL'\r\\3\025\t\005]\022q\017\005\007=\006E\004\031A.\t\017\005m\004\001\"\003\002~\005Q1/\0328e'&<g.\0317\025\007%\013y\b\003\004_\003s\002\ra\027\005\b\003\007\003A\021AAC\00399W\r^*f]NLG/\033<jif$b!a\"\002\024\006\r\006#B\035\002\n\0065\025bAAFu\t)\021I\035:bsB\031\021(a$\n\007\005E%H\001\004B]f\024VM\032\005\t\003+\013\t\t1\001\002\030\006A1m\\7qkR,'\017\005\003\002\032\006}UBAAN\025\r\tiJE\001\b[\006\034\007.\0338f\023\021\t\t+a'\003\017\r{g\016^3yi\"A\021QUAA\001\004\t9+\001\003be\036\034\b\003BAM\003SKA!a+\002\034\nI\021I]4v[\026tGo\035\025\r\003\003\013y+!.\0028\006e\0261\030\t\005\0033\013\t,\003\003\0024\006m%\001C\"bY2\024\027mY6\002\r\021L'/Z2u3\005\t\021a\0013pG\006\022\021QX\001:MVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!\017\026$8\017\t;iK\002\032WO\035:f]R\0043/\0328t_J\0043/\0328tSRLg/\033;z]!9\021\021\031\001\005\002\005\r\027AD:fiN+gn]5uSZLG/\037\013\007\003\017\013)-a2\t\021\005U\025q\030a\001\003/C\001\"!*\002@\002\007\021q\025\025\r\003\013y+!.\0028\006e\0261Z\021\003\003\033\faKZ;oGRLwN\034\025wC2,XM\0178v[\n,'/\013\036ok6\024WM\035\021.[\001\032V\r^:!i\",\007e]3og>\024xe\035\021tK:\034\030\016^5wSRLh\006\t*fiV\024hn\035\021uQ\026\004s\016\0343!m\006dW/\032\030\t\023\005E\007A1A\005\016\005M\027AD*f]NLG/\033<jif$\026mZ\013\002e\"9\021q\033\001!\002\033\021\030aD*f]NLG/\033<jif$\026m\032\021\t\017\005m\007\001\"\021\002^\006!An\\1e)\rI\025q\034\005\t\003C\fI\0161\001\002d\006\031aN\031;\021\t\005\025\030\021^\007\003\003OT1!!9`\023\021\tY/a:\003\0359\023E\013V1h\007>l\007o\\;oI\"9\021q\036\001\005B\005E\030\001B:bm\026$2!SAz\021!\t\t/!<A\002\005\r\b")
/*     */ public class MotionSensor extends ManagedEnvironment implements DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   
/*     */   public EnvironmentHost host() {
/*  28 */     return this.host;
/*  29 */   } private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  30 */     .withComponent("motion_sensor")
/*  31 */     .withConnector()
/*  32 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*  34 */   } private final int radius = 8; private int radius() { return this.radius; }
/*     */   
/*  36 */   private double li$cil$oc$server$component$MotionSensor$$sensitivity = 0.4D; public double li$cil$oc$server$component$MotionSensor$$sensitivity() { return this.li$cil$oc$server$component$MotionSensor$$sensitivity; } private void li$cil$oc$server$component$MotionSensor$$sensitivity_$eq(double x$1) { this.li$cil$oc$server$component$MotionSensor$$sensitivity = x$1; }
/*     */   
/*  38 */   private final Map<EntityLivingBase, Tuple3<Object, Object, Object>> li$cil$oc$server$component$MotionSensor$$trackedEntities = Map$.MODULE$.empty(); private Map<String, String> deviceInfo; public Map<EntityLivingBase, Tuple3<Object, Object, Object>> li$cil$oc$server$component$MotionSensor$$trackedEntities() { return this.li$cil$oc$server$component$MotionSensor$$trackedEntities; }
/*     */   
/*  40 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  41 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  42 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Motion sensor");
/*  43 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  44 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Blinker M1K0");
/*  45 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(radius()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  48 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   private World world() {
/*  52 */     return host().world();
/*     */   } private double x() {
/*  54 */     return host().xPosition();
/*     */   } private double y() {
/*  56 */     return host().yPosition();
/*     */   } private double z() {
/*  58 */     return host().zPosition();
/*     */   } private boolean isServer() {
/*  60 */     return (world() == null) ? SideTracker.isServer() : (!(world()).field_72995_K);
/*     */   } public boolean canUpdate() {
/*  62 */     return isServer();
/*     */   }
/*     */   
/*  65 */   public void update() { super.update();
/*  66 */     if (world().func_82737_E() % 10L == 0L)
/*     */     
/*     */     { 
/*     */       
/*  70 */       Set entities = ((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(EntityLivingBase.class, sensorBounds()))
/*  71 */         .map((Function1)new MotionSensor$$anonfun$1(this), Buffer$.MODULE$.canBuildFrom()))
/*  72 */         .filter((Function1)new MotionSensor$$anonfun$2(this)))
/*  73 */         .toSet();
/*     */       
/*  75 */       li$cil$oc$server$component$MotionSensor$$trackedEntities().retain((Function2)new MotionSensor$$anonfun$update$1(this, entities));
/*     */       
/*  77 */       entities.foreach((Function1)new MotionSensor$$anonfun$update$2(this)); }  } public final class MotionSensor$$anonfun$1 extends AbstractFunction1<Object, EntityLivingBase> implements Serializable {
/*  78 */     public static final long serialVersionUID = 0L; public final EntityLivingBase apply(Object x$1) { return (EntityLivingBase)x$1; } public MotionSensor$$anonfun$1(MotionSensor $outer) {} } public final class MotionSensor$$anonfun$2 extends AbstractFunction1<EntityLivingBase, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(EntityLivingBase entity) { return (entity.func_70089_S() && this.$outer.li$cil$oc$server$component$MotionSensor$$isInRange(entity) && this.$outer.li$cil$oc$server$component$MotionSensor$$isVisible(entity)); } public MotionSensor$$anonfun$2(MotionSensor $outer) {} } public final class MotionSensor$$anonfun$update$1 extends AbstractFunction2<EntityLivingBase, Tuple3<Object, Object, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Set entities$1; public final boolean apply(EntityLivingBase key, Tuple3 x$2) { return this.entities$1.contains(key); } public MotionSensor$$anonfun$update$1(MotionSensor $outer, Set entities$1) {} } public final class MotionSensor$$anonfun$update$2 extends AbstractFunction1<EntityLivingBase, Map<EntityLivingBase, Tuple3<Object, Object, Object>>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<EntityLivingBase, Tuple3<Object, Object, Object>> apply(EntityLivingBase entity) { Option option = this.$outer.li$cil$oc$server$component$MotionSensor$$trackedEntities().get(entity);
/*  79 */       if (option instanceof Some) { Some some = (Some)option; Tuple3 tuple3 = (Tuple3)some.x(); if (tuple3 != null) { double prevX = BoxesRunTime.unboxToDouble(tuple3._1()), prevY = BoxesRunTime.unboxToDouble(tuple3._2()), prevZ = BoxesRunTime.unboxToDouble(tuple3._3());
/*     */ 
/*     */           
/*  82 */           this.$outer.li$cil$oc$server$component$MotionSensor$$sendSignal(entity); BoxedUnit boxedUnit1 = (entity.func_70092_e(prevX, prevY, prevZ) > this.$outer.li$cil$oc$server$component$MotionSensor$$sensitivity() * this.$outer.li$cil$oc$server$component$MotionSensor$$sensitivity() * 2) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  89 */           return (Map<EntityLivingBase, Tuple3<Object, Object, Object>>)this.$outer.li$cil$oc$server$component$MotionSensor$$trackedEntities().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(entity), new Tuple3(BoxesRunTime.boxToDouble(entity.field_70165_t), BoxesRunTime.boxToDouble(entity.field_70163_u), BoxesRunTime.boxToDouble(entity.field_70161_v)))); }  }  this.$outer.li$cil$oc$server$component$MotionSensor$$sendSignal(entity); BoxedUnit boxedUnit = BoxedUnit.UNIT; return (Map<EntityLivingBase, Tuple3<Object, Object, Object>>)this.$outer.li$cil$oc$server$component$MotionSensor$$trackedEntities().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(entity), new Tuple3(BoxesRunTime.boxToDouble(entity.field_70165_t), BoxesRunTime.boxToDouble(entity.field_70163_u), BoxesRunTime.boxToDouble(entity.field_70161_v)))); }
/*     */     
/*     */     public MotionSensor$$anonfun$update$2(MotionSensor $outer) {} }
/*     */   
/*     */   private AxisAlignedBB sensorBounds() {
/*  94 */     return AxisAlignedBB.func_72330_a(
/*  95 */         x() + 0.5D - radius(), y() + 0.5D - radius(), z() + 0.5D - radius(), 
/*  96 */         x() + 0.5D + radius(), y() + 0.5D + radius(), z() + 0.5D + radius());
/*     */   } public boolean li$cil$oc$server$component$MotionSensor$$isInRange(EntityLivingBase entity) {
/*  98 */     return (entity.func_70092_e(x() + 0.5D, y() + 0.5D, z() + 0.5D) <= (radius() * radius()));
/*     */   }
/*     */   private boolean isClearPath(Vec3 target) {
/* 101 */     Vec3 origin = Vec3.func_72443_a(x(), y(), z());
/* 102 */     Vec3 path = origin.func_72444_a(target).func_72432_b();
/* 103 */     Vec3 eye = origin.func_72441_c(path.field_72450_a, path.field_72448_b, path.field_72449_c);
/* 104 */     MovingObjectPosition blocker = world().func_72933_a(eye, target);
/* 105 */     return (blocker == null);
/*     */   }
/*     */   
/*     */   public boolean li$cil$oc$server$component$MotionSensor$$isVisible(EntityLivingBase entity) {
/* 109 */     if (entity.func_70660_b(Potion.field_76441_p) == null) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 114 */       Vec3 target = Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v);
/* 115 */       if ((isClearPath(target) || isClearPath(target.func_72441_c(0.0D, entity.func_70047_e(), 0.0D))));
/*     */     } 
/*     */     return false;
/*     */   } public void li$cil$oc$server$component$MotionSensor$$sendSignal(EntityLivingBase entity) {
/* 119 */     if (Settings$.MODULE$.get().inputUsername()) {
/* 120 */       node().sendToReachable("computer.signal", new Object[] { "motion", BoxesRunTime.boxToDouble(entity.field_70165_t - x() + 0.5D), BoxesRunTime.boxToDouble(entity.field_70163_u - y() + 0.5D), BoxesRunTime.boxToDouble(entity.field_70161_v - z() + 0.5D), entity.func_70005_c_() });
/*     */     } else {
/*     */       
/* 123 */       node().sendToReachable("computer.signal", new Object[] { "motion", BoxesRunTime.boxToDouble(entity.field_70165_t - x() + 0.5D), BoxesRunTime.boxToDouble(entity.field_70163_u - y() + 0.5D), BoxesRunTime.boxToDouble(entity.field_70161_v - z() + 0.5D) });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- Gets the current sensor sensitivity.")
/*     */   public Object[] getSensitivity(Context computer, Arguments args) {
/* 130 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(li$cil$oc$server$component$MotionSensor$$sensitivity()) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function(value:number):number -- Sets the sensor's sensitivity. Returns the old value.")
/*     */   public Object[] setSensitivity(Context computer, Arguments args) {
/* 134 */     double oldValue = li$cil$oc$server$component$MotionSensor$$sensitivity();
/* 135 */     li$cil$oc$server$component$MotionSensor$$sensitivity_$eq(package$.MODULE$.max(0.2D, args.checkDouble(0)));
/* 136 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(oldValue) }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 141 */   private final String SensitivityTag = (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("sensitivity").toString(); private volatile boolean bitmap$0; private final String SensitivityTag() { return this.SensitivityTag; }
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 144 */     super.load(nbt);
/* 145 */     li$cil$oc$server$component$MotionSensor$$sensitivity_$eq(nbt.func_74769_h(SensitivityTag()));
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 149 */     super.save(nbt);
/* 150 */     nbt.func_74780_a(SensitivityTag(), li$cil$oc$server$component$MotionSensor$$sensitivity());
/*     */   }
/*     */   
/*     */   public MotionSensor(EnvironmentHost host) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\MotionSensor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */