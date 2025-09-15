/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.common.item.TabletWrapper;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005-a\001B\001\003\0015\021a\001V1cY\026$(BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021qCG\007\0021)\021\021DE\001\007IJLg/\032:\n\005mA\"A\003#fm&\034W-\0238g_\"AQ\004\001BC\002\023\005a$\001\004uC\ndW\r^\013\002?A\021\001%J\007\002C)\021!eI\001\005SR,WN\003\002%\r\00511m\\7n_:L!AJ\021\003\033Q\013'\r\\3u/J\f\007\017]3s\021!A\003A!A!\002\023y\022a\002;bE2,G\017\t\005\006U\001!\taK\001\007y%t\027\016\036 \025\0051r\003CA\027\001\033\005\021\001\"B\017*\001\004y\002b\002\031\001\005\004%\t%M\001\005]>$W-F\0013!\t\031d'D\0015\025\t)$#A\004oKR<xN]6\n\005]\"$AE\"p[B|g.\0328u\007>tg.Z2u_JDa!\017\001!\002\023\021\024!\0028pI\026\004\003\002C\036\001\021\013\007IQ\002\037\002\025\021,g/[2f\023:4w.F\001>!\021qTiR$\016\003}R!\001Q!\002\023%lW.\036;bE2,'B\001\"D\003)\031w\016\0347fGRLwN\034\006\002\t\006)1oY1mC&\021ai\020\002\004\033\006\004\bC\001%N\033\005I%B\001&L\003\021a\027M\\4\013\0031\013AA[1wC&\021a*\023\002\007'R\024\030N\\4\t\021A\003\001\022!Q!\016u\n1\002Z3wS\016,\027J\0344pA!)!\013\001C!'\006iq-\032;EKZL7-Z%oM>$\022\001\026\t\005+bK\026,D\001W\025\t96*\001\003vi&d\027B\001$W!\tQfL\004\002\\96\t1)\003\002^\007\0061\001K]3eK\032L!AT0\013\005u\033\005\"B1\001\t\003\021\027\001C4fiBKGo\0315\025\007\rL\027\017E\002\\I\032L!!Z\"\003\013\005\023(/Y=\021\005m;\027B\0015D\005\031\te.\037*fM\")!\016\031a\001W\00691m\0348uKb$\bC\0017p\033\005i'B\0018\023\003\035i\027m\0315j]\026L!\001]7\003\017\r{g\016^3yi\")!\017\031a\001g\006!\021M]4t!\taG/\003\002v[\nI\021I]4v[\026tGo\035\025\005A^T8\020\005\002mq&\021\0210\034\002\t\007\006dGNY1dW\006\031Am\\2\"\003q\fQIZ;oGRLwN\034\025*u9,XNY3sA5j\003eR3ug\002\"\b.\032\021qSR\034\007\016I8gAQDW\r\t9mCf,'\017\t5pY\022Lgn\032\021uQ\026\004C/\0312mKRt\003\"\002@\001\t\003y\030AB4fif\013w\017F\003d\003\003\t\031\001C\003k{\002\0071\016C\003s{\002\0071\017K\003~oj\f9!\t\002\002\n\005\031e-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;tAQDW\rI=bo\002zg\r\t;iK\002\002H.Y=fe\002Bw\016\0343j]\036\004C\017[3!i\006\024G.\032;/\001")
/*    */ public class Tablet extends ManagedEnvironment implements DeviceInfo {
/*    */   public TabletWrapper tablet() {
/* 20 */     return this.tablet;
/* 21 */   } private final TabletWrapper tablet; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 22 */     .withComponent("tablet")
/* 23 */     .withConnector(Settings$.MODULE$.get().bufferTablet())
/* 24 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*    */   public ComponentConnector node() { return this.node; }
/* 26 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 27 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "system");
/* 28 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Tablet");
/* 29 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 30 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Jogger");
/* 31 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(tablet().func_70302_i_()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 34 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */    private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   } @Callback(doc = "function():number -- Gets the pitch of the player holding the tablet.")
/*    */   public Object[] getPitch(Context context, Arguments args) {
/* 39 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat((tablet().player()).field_70125_A) }));
/*    */   } @Callback(doc = "function():number -- Gets the yaw of the player holding the tablet.")
/*    */   public Object[] getYaw(Context context, Arguments args) {
/* 42 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat((tablet().player()).field_70177_z) }));
/*    */   }
/*    */   
/*    */   public Tablet(TabletWrapper tablet) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Tablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */