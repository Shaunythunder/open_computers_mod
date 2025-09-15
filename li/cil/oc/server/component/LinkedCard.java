/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.network.Packet;
/*    */ import li.cil.oc.server.component.traits.WakeMessageAware;
/*    */ import li.cil.oc.server.network.QuantumNetwork;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025e\001B\001\003\0015\021!\002T5oW\026$7)\031:e\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\003\001\035Y\001c\005\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9RD\004\002\03175\t\021D\003\002\033\t\0059a.\032;x_J\\\027B\001\017\032\0039\tV/\0318uk6tU\r^<pe.L!AH\020\003\027E+\030M\034;v[:{G-\032\006\0039e\001\"!\t\023\016\003\tR!a\t\n\002\r\021\024\030N^3s\023\t)#E\001\006EKZL7-Z%oM>\004\"a\n\026\016\003!R!!\013\002\002\rQ\024\030-\033;t\023\tY\003F\001\tXC.,W*Z:tC\036,\027i^1sK\")Q\006\001C\001]\0051A(\0338jiz\"\022a\f\t\003a\001i\021A\001\005\be\001\021\r\021\"\0214\003\021qw\016Z3\026\003Q\002\"!N\034\016\003YR!A\007\n\n\005a2$AE\"p[B|g.\0328u\007>tg.Z2u_JDaA\017\001!\002\023!\024!\0028pI\026\004\003b\002\037\001\001\004%\t!P\001\007iVtg.\0327\026\003y\002\"aP#\017\005\001\033U\"A!\013\003\t\013Qa]2bY\006L!\001R!\002\rA\023X\rZ3g\023\t1uI\001\004TiJLgn\032\006\003\t\006Cq!\023\001A\002\023\005!*\001\006uk:tW\r\\0%KF$\"a\023(\021\005\001c\025BA'B\005\021)f.\033;\t\017=C\025\021!a\001}\005\031\001\020J\031\t\rE\003\001\025)\003?\003\035!XO\0348fY\002B\001b\025\001\t\006\004%i\001V\001\013I\0264\030nY3J]\032|W#A+\021\tY[V,X\007\002/*\021\001,W\001\nS6lW\017^1cY\026T!AW!\002\025\r|G\016\\3di&|g.\003\002]/\n\031Q*\0319\021\005y\033W\"A0\013\005\001\f\027\001\0027b]\036T\021AY\001\005U\0064\030-\003\002G?\"AQ\r\001E\001B\0036Q+A\006eKZL7-Z%oM>\004\003\"B4\001\t\003B\027!D4fi\022+g/[2f\023:4w\016F\001j!\021QWN\020 \016\003-T!\001\\1\002\tU$\030\016\\\005\0039.DQa\034\001\005\002A\fAa]3oIR\031\021o^@\021\007\001\023H/\003\002t\003\n)\021I\035:bsB\021\001)^\005\003m\006\023a!\0218z%\0264\007\"\002=o\001\004I\030aB2p]R,\007\020\036\t\003uvl\021a\037\006\003yJ\tq!\\1dQ&tW-\003\002w\n91i\0348uKb$\bbBA\001]\002\007\0211A\001\005CJ<7\017E\002{\003\013I1!a\002|\005%\t%oZ;nK:$8\017K\004o\003\027\t\t\"a\005\021\007i\fi!C\002\002\020m\024\001bQ1mY\n\f7m[\001\004I>\034\027EAA\013\003A3WO\\2uS>t\007\006Z1uC:rc&\013\021.[\001\032VM\0343tAQDW\rI:qK\016Lg-[3eA\021\fG/\031\021u_\002\"\b.\032\021dCJ$\007\005\0365jg\002zg.\032\021jg\002b\027N\\6fI\002\"xN\f\005\b\0033\001A\021AA\016\0035i\027\r\037)bG.,GoU5{KR)\021/!\b\002 !1\0010a\006A\002eD\001\"!\001\002\030\001\007\0211\001\025\r\003/\tY!a\t\002&\005E\021qE\001\007I&\024Xm\031;\032\003\005\t#!!\013\002\007\032,hn\031;j_:D\023F\0178v[\n,'\017I\027.A\035+Go\035\021uQ\026\004S.\031=j[Vl\007\005]1dW\026$\be]5{K\002B3m\0348gS\036\0043/\032;uS:<\027F\f\005\b\003[\001A\021AA\030\0035\021XmY3jm\026\004\026mY6fiR\0311*!\r\t\021\005M\0221\006a\001\003k\ta\001]1dW\026$\bcA\033\0028%\031\021\021\b\034\003\rA\0137m[3u\021\035\ti\004\001C\001\003\t!bZ3u\007\"\fgN\\3m)\025\t\030\021IA\"\021\031A\0301\ba\001s\"A\021\021AA\036\001\004\t\031\001\013\007\002<\005-\0211EA\023\003#\t9%\t\002\002J\005\te-\0368di&|g\016K\025;gR\024\030N\\4![5\002s)\032;tAQD\027n\035\021mS:\\\007eY1sI\036\032\be\0355be\026$\007e\0315b]:,G\016I1eIJ,7o\035\005\b\003\033\002A\021IA(\003%ygnQ8o]\026\034G\017F\002L\003#BqAMA&\001\004\t\031\006E\0026\003+J1!a\0267\005\021qu\016Z3\t\017\005m\003\001\"\021\002^\005aqN\034#jg\016|gN\\3diR\0311*a\030\t\017I\nI\0061\001\002T!9\0211\r\001\005B\005\025\024\001\0027pC\022$2aSA4\021!\tI'!\031A\002\005-\024a\0018ciB!\021QNA=\033\t\tyG\003\003\002j\005E$\002BA:\003k\n\021\"\\5oK\016\024\030M\032;\013\005\005]\024a\0018fi&!\0211PA8\0059q%\t\026+bO\016{W\016]8v]\022Dq!a \001\t\003\n\t)\001\003tCZ,GcA&\002\004\"A\021\021NA?\001\004\tY\007")
/*    */ public class LinkedCard extends ManagedEnvironment implements QuantumNetwork.QuantumNode, DeviceInfo, WakeMessageAware {
/*    */   private final ComponentConnector node;
/*    */   private String tunnel;
/*    */   private Map<String, String> deviceInfo;
/*    */   
/* 23 */   public Option<String> wakeMessage() { return this.wakeMessage; } private Option<String> wakeMessage; private boolean wakeMessageFuzzy; private volatile boolean bitmap$0; public void wakeMessage_$eq(Option<String> x$1) { this.wakeMessage = x$1; } public boolean wakeMessageFuzzy() { return this.wakeMessageFuzzy; } public void wakeMessageFuzzy_$eq(boolean x$1) { this.wakeMessageFuzzy = x$1; } @Callback(direct = true, doc = "function():string, boolean -- Get the current wake-up message.") public Object[] getWakeMessage(Context context, Arguments args) { return WakeMessageAware.class.getWakeMessage(this, context, args); } @Callback(doc = "function(message:string[, fuzzy:boolean]):string -- Set the wake-up message and whether to ignore additional data/parameters.") public Object[] setWakeMessage(Context context, Arguments args) { return WakeMessageAware.class.setWakeMessage(this, context, args); } public boolean isPacketAccepted(Packet packet, double distance) { return WakeMessageAware.class.isPacketAccepted(this, packet, distance); } public void receivePacket(Packet packet, double distance, EnvironmentHost host) { WakeMessageAware.class.receivePacket(this, packet, distance, host); } public void loadWakeMessage(NBTTagCompound nbt) { WakeMessageAware.class.loadWakeMessage(this, nbt); } public void saveWakeMessage(NBTTagCompound nbt) { WakeMessageAware.class.saveWakeMessage(this, nbt); } public LinkedCard() { WakeMessageAware.class.$init$(this);
/* 24 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 25 */       .withComponent("tunnel", Visibility.Neighbors)
/* 26 */       .withConnector()
/* 27 */       .create();
/*    */     
/* 29 */     this.tunnel = "creative"; } public ComponentConnector node() { return this.node; } public String tunnel() { return this.tunnel; } public void tunnel_$eq(String x$1) { this.tunnel = x$1; }
/*    */ 
/*    */   
/*    */   private Map deviceInfo$lzycompute() {
/* 33 */     synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/* 34 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "network");
/* 35 */         (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Quantumnet controller");
/* 36 */         (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 37 */         (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "HyperLink IV: Ender Edition");
/* 38 */         (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()).toString());
/* 39 */         (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketParts()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */   
/* 42 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   @Callback(doc = "function(data...) -- Sends the specified data to the card this one is linked to.")
/*    */   public Object[] send(Context context, Arguments args)
/*    */   {
/* 48 */     Iterable endpoints = (Iterable)QuantumNetwork$.MODULE$.getEndpoints(tunnel()).filter((Function1)new LinkedCard$$anonfun$1(this));
/*    */     
/* 50 */     Packet packet = Network.newPacket(node().address(), null, 0, (Object[])WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)args).toArray(ClassTag$.MODULE$.AnyRef()));
/*    */     
/* 52 */     endpoints.foreach((Function1)new LinkedCard$$anonfun$send$1(this, packet));
/*    */ 
/*    */     
/* 55 */     return node().tryChangeBuffer(-(packet.size() / 32.0D + Settings$.MODULE$.get().wirelessCostPerRange()[1] * Settings$.MODULE$.get().maxWirelessRange()[1] * 5)) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*    */           
/* 57 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" }));
/*    */   } public final class LinkedCard$$anonfun$1 extends AbstractFunction1<QuantumNetwork.QuantumNode, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(QuantumNetwork.QuantumNode x$1) { LinkedCard linkedCard = this.$outer; if (x$1 == null) { if (linkedCard != null); } else if (x$1.equals(linkedCard)) {  }  } public LinkedCard$$anonfun$1(LinkedCard $outer) {} } public final class LinkedCard$$anonfun$send$1 extends AbstractFunction1<QuantumNetwork.QuantumNode, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Packet packet$1; public LinkedCard$$anonfun$send$1(LinkedCard $outer, Packet packet$1) {} public final void apply(QuantumNetwork.QuantumNode endpoint) { endpoint.receivePacket(this.packet$1); } }
/* 61 */   @Callback(direct = true, doc = "function():number -- Gets the maximum packet size (config setting).") public Object[] maxPacketSize(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()) })); }
/*    */    public void receivePacket(Packet packet) {
/* 63 */     receivePacket(packet, 0.0D, null);
/*    */   }
/*    */   @Callback(direct = true, doc = "function():string -- Gets this link card's shared channel address")
/*    */   public Object[] getChannel(Context context, Arguments args) {
/* 67 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { tunnel() }));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onConnect(Node node) {
/* 73 */     super.onConnect(node);
/* 74 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 75 */       { QuantumNetwork$.MODULE$.add(this); return; }  return; }  QuantumNetwork$.MODULE$.add(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onDisconnect(Node node) {
/* 80 */     super.onDisconnect(node);
/* 81 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 82 */       { QuantumNetwork$.MODULE$.remove(this); return; }  return; }  QuantumNetwork$.MODULE$.remove(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 89 */     super.load(nbt);
/* 90 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tunnel").toString())) {
/* 91 */       tunnel_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tunnel").toString()));
/*    */     }
/* 93 */     loadWakeMessage(nbt);
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 97 */     super.save(nbt);
/* 98 */     nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tunnel").toString(), tunnel());
/* 99 */     saveWakeMessage(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\LinkedCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */