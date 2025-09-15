/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.api.network.WirelessEndpoint;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035b!B\001\003\003\003i!aE,je\026dWm]:OKR<xN]6DCJ$'BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\005\t\003\037Ai\021AA\005\003#\t\0211BT3uo>\0248nQ1sIB\0211\003G\007\002))\021QCF\001\b]\026$xo\034:l\025\t9b!A\002ba&L!!\007\013\003!]K'/\0327fgN,e\016\0329pS:$\b\"C\016\001\005\003\005\013\021\002\017 \003\021Awn\035;\021\005Mi\022B\001\020\025\005=)eN^5s_:lWM\034;I_N$\030BA\016\021\021\025\t\003\001\"\001#\003\031a\024N\\5u}Q\0211\005\n\t\003\037\001AQa\007\021A\002qAqA\n\001C\002\023\005s%\001\003o_\022,W#\001\025\021\005MI\023B\001\026\025\005I\031u.\0349p]\026tGoQ8o]\026\034Go\034:\t\r1\002\001\025!\003)\003\025qw\016Z3!\021\025q\003A\"\0050\003Q9\030N]3mKN\0348i\\:u!\026\024(+\0318hKV\t\001\007\005\0022i5\t!GC\0014\003\025\0318-\0317b\023\t)$G\001\004E_V\024G.\032\005\006o\0011\tbL\001\021[\006Dx+\033:fY\026\0348OU1oO\026DQ!\017\001\007\022i\nac\0355pk2$7+\0328e/&\024X\r\032+sC\0324\027nY\013\002wA\021\021\007P\005\003{I\022qAQ8pY\026\fg\016C\004@\001\001\007I\021A\030\002\021M$(/\0328hi\"Dq!\021\001A\002\023\005!)\001\007tiJ,gn\032;i?\022*\027\017\006\002D\rB\021\021\007R\005\003\013J\022A!\0268ji\"9q\tQA\001\002\004\001\024a\001=%c!1\021\n\001Q!\nA\n\021b\035;sK:<G\017\033\021\t\013-\003A\021\t'\002\003a$\022!\024\t\003c9K!a\024\032\003\007%sG\017C\003R\001\021\005C*A\001z\021\025\031\006\001\"\021M\003\005Q\b\"B+\001\t\0032\026!B<pe2$G#A,\021\005asV\"A-\013\005US&BA.]\003%i\027N\\3de\0064GOC\001^\003\rqW\r^\005\003?f\023QaV8sY\022DQ!\031\001\005\002\t\fQB]3dK&4X\rU1dW\026$HcA\"dQ\")A\r\031a\001K\0061\001/Y2lKR\004\"a\0054\n\005\035$\"A\002)bG.,G\017C\003jA\002\007!#\001\004t_V\0248-\032\005\006W\002!\t\001\\\001\fO\026$8\013\036:f]\036$\b\016F\002ngn\0042!\r8q\023\ty'GA\003BeJ\f\027\020\005\0022c&\021!O\r\002\007\003:L(+\0324\t\013QT\007\031A;\002\017\r|g\016^3yiB\021a/_\007\002o*\021\001PF\001\b[\006\034\007.\0338f\023\tQxOA\004D_:$X\r\037;\t\013qT\007\031A?\002\t\005\024xm\035\t\003mzL!a`<\003\023\005\023x-^7f]R\034\bf\0036\002\004\005%\0211BA\007\003\037\0012A^A\003\023\r\t9a\036\002\t\007\006dGNY1dW\0061A-\033:fGRL\022!A\001\004I>\034\027EAA\t\003A3WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043/[4oC2\0043\017\036:f]\036$\b\016\t\025sC:<W-\013\021vg\026$\007e\0365f]\002\032XM\0343j]\036\004S.Z:tC\036,7O\f\005\b\003+\001A\021AA\f\003-\031X\r^*ue\026tw\r\0365\025\0135\fI\"a\007\t\rQ\f\031\0021\001v\021\031a\0301\003a\001{\"B\0211CA\002\003\033\ty\"\t\002\002\"\005yf-\0368di&|g\016K:ue\026tw\r\0365;]Vl'-\032:*u9,XNY3sA5j\003eU3uAQDW\rI:jO:\fG\016I:ue\026tw\r\0365!QI\fgnZ3*AU\034X\r\032\021xQ\026t\007e]3oI&tw\rI7fgN\fw-Z:/\021\035\t)\003\001C!\003O\t!\"[:XSJ,G.Z:t)\025i\027\021FA\026\021\031!\0301\005a\001k\"1A0a\tA\002uDq!a\f\001\t\003\n\t$A\004jg^K'/\0323\025\0135\f\031$!\016\t\rQ\fi\0031\001v\021\031a\030Q\006a\001{\"9\021\021\b\001\005R\005m\022A\0023p'\026tG\rF\002D\003{Aa\001ZA\034\001\004)\007bBA!\001\021E\0231I\001\fI>\024%o\\1eG\006\034H\017F\002D\003\013Ba\001ZA \001\004)\007bBA%\001\021%\0211J\001\013G\",7m\033)po\026\024H#A\"\t\021\005=\003A1A\005Bi\n\021bY1o+B$\027\r^3\t\017\005M\003\001)A\005w\005Q1-\0318Va\022\fG/\032\021\t\017\005]\003\001\"\021\002L\0051Q\017\0353bi\026Dq!a\027\001\t\003\ni&A\005p]\016{gN\\3diR\0311)a\030\t\017\031\nI\0061\001\002bA\0311#a\031\n\007\005\025DC\001\003O_\022,\007bBA5\001\021\005\0231N\001\r_:$\025n]2p]:,7\r\036\013\004\007\0065\004b\002\024\002h\001\007\021\021\r\005\b\003c\002A\021IA:\003\021aw.\0313\025\007\r\013)\b\003\005\002x\005=\004\031AA=\003\rq'\r\036\t\005\003w\ny(\004\002\002~)\031\021q\017.\n\t\005\005\025Q\020\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\t)\t\001C!\003\017\013Aa]1wKR\0311)!#\t\021\005]\0241\021a\001\003s:q!!$\003\021\003\ty)A\nXSJ,G.Z:t\035\026$xo\034:l\007\006\024H\rE\002\020\003#3a!\001\002\t\002\005M5cAAIa\"9\021%!%\005\002\005]ECAAH\r\035\tY*!%\001\003;\023Q\001V5feF\0322!!'$\021)Y\022\021\024B\001B\003%Ad\b\005\bC\005eE\021AAR)\021\t)+!+\021\t\005\035\026\021T\007\003\003#CaaGAQ\001\004a\002B\002\030\002\032\022Es\006\003\0048\0033#\tf\f\005\t\003c\013I\n\"\025\0024\006aQ.\031=Pa\026t\007k\034:ugV\tQ\n\003\004:\0033#\tF\017\005\f\003s\013I\n#b\001\n\033\tY,\001\006eKZL7-Z%oM>,\"!!0\021\021\005}\026\021ZAg\003\033l!!!1\013\t\005\r\027QY\001\nS6lW\017^1cY\026T1!a23\003)\031w\016\0347fGRLwN\\\005\005\003\027\f\tMA\002NCB\004B!a4\002Z6\021\021\021\033\006\005\003'\f).\001\003mC:<'BAAl\003\021Q\027M^1\n\t\005m\027\021\033\002\007'R\024\030N\\4\t\027\005}\027\021\024E\001B\0036\021QX\001\fI\0264\030nY3J]\032|\007\005\003\005\002d\006eE\021IAs\00359W\r\036#fm&\034W-\0238g_R\021\021q\035\t\t\003S\fy/!=\002r6\021\0211\036\006\005\003[\f).\001\003vi&d\027\002BAf\003W\004B!a=\002z:\031\021'!>\n\007\005]('\001\004Qe\026$WMZ\005\005\0037\fYPC\002\002xJB\001\"a@\002\032\022E#\021A\001\021SN\004\026mY6fi\006\0337-\0329uK\022$Ra\017B\002\005\013Aa\001ZA\001\004)\007b\002B\004\003{\004\r\001M\001\tI&\034H/\0318dK\0329!1BAI\001\t5!!\002+jKJ\0244\003\002B\005\003KC!b\007B\005\005\003\005\013\021\002\017 \021\035\t#\021\002C\001\005'!BA!\006\003\030A!\021q\025B\005\021\031Y\"\021\003a\0019!1aF!\003\005R=Baa\016B\005\t#z\003\002CAY\005\023!\t&a-\t\re\022I\001\"\025;\021-\tIL!\003\t\006\004%i!a/\t\027\005}'\021\002E\001B\0036\021Q\030\005\t\003G\024I\001\"\021\002f\002")
/*     */ public abstract class WirelessNetworkCard extends NetworkCard implements WirelessEndpoint {
/*     */   private final ComponentConnector node;
/*     */   private double strength;
/*     */   private final boolean canUpdate;
/*     */   
/*  24 */   public WirelessNetworkCard(EnvironmentHost host) { super(host);
/*  25 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  26 */       .withComponent("modem", Visibility.Neighbors)
/*  27 */       .withConnector()
/*  28 */       .create();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     this.strength = maxWirelessRange();
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
/*  96 */     this.canUpdate = true; } public ComponentConnector node() { return this.node; } public double strength() { return this.strength; } public void strength_$eq(double x$1) { this.strength = x$1; } public int x() { return BlockPosition$.MODULE$.apply(host()).x(); } public int y() { return BlockPosition$.MODULE$.apply(host()).y(); } public int z() { return BlockPosition$.MODULE$.apply(host()).z(); } public World world() { return host().world(); } public boolean canUpdate() { return this.canUpdate; }
/*     */   public void receivePacket(Packet packet, WirelessEndpoint source) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToDouble(source.x() + 0.5D - host().xPosition()), BoxesRunTime.boxToDouble(source.y() + 0.5D - host().yPosition()), BoxesRunTime.boxToDouble(source.z() + 0.5D - host().zPosition())); if (tuple3 != null) { double dx = BoxesRunTime.unboxToDouble(tuple3._1()), dy = BoxesRunTime.unboxToDouble(tuple3._2()), dz = BoxesRunTime.unboxToDouble(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToDouble(dx), BoxesRunTime.boxToDouble(dy), BoxesRunTime.boxToDouble(dz)), tuple31 = tuple32; double d1 = BoxesRunTime.unboxToDouble(tuple31._1()), d2 = BoxesRunTime.unboxToDouble(tuple31._2()), d3 = BoxesRunTime.unboxToDouble(tuple31._3()); double distance = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3); receivePacket(packet, distance, host()); return; }  throw new MatchError(tuple3); }
/*     */   @Callback(direct = true, doc = "function():number -- Get the signal strength (range) used when sending messages.") public Object[] getStrength(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) })); }
/*  99 */   @Callback(doc = "function(strength:number):number -- Set the signal strength (range) used when sending messages.") public Object[] setStrength(Context context, Arguments args) { strength_$eq(package$.MODULE$.max(0.0D, package$.MODULE$.min(args.checkDouble(0), maxWirelessRange()))); return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) })); } public Object[] isWireless(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); } public Object[] isWired(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(shouldSendWiredTraffic()) })); } public void doSend(Packet packet) { if (strength() > false) { checkPower(); Network.sendWirelessPacket(this, strength(), packet); }  if (shouldSendWiredTraffic()) super.doSend(packet);  } public void doBroadcast(Packet packet) { if (strength() > false) { checkPower(); Network.sendWirelessPacket(this, strength(), packet); }  if (shouldSendWiredTraffic()) super.doBroadcast(packet);  } private void checkPower() { double cost = wirelessCostPerRange(); if (cost > false && !Settings$.MODULE$.get().ignorePower() && !node().tryChangeBuffer(-strength() * cost)) throw new IOException("not enough energy");  } public void update() { super.update();
/* 100 */     if (world().func_82737_E() % 20L == 0L) {
/* 101 */       Network.updateWirelessNetwork(this);
/*     */     } }
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 106 */     super.onConnect(node);
/* 107 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 108 */       { Network.joinWirelessNetwork(this); return; }  return; }  Network.joinWirelessNetwork(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 113 */     super.onDisconnect(node);
/* 114 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) { if (!world().func_72899_e(x(), y(), z()))
/* 115 */         { Network.leaveWirelessNetwork(this); return; }  return; }  } else if (!node.equals(componentConnector)) { if (!world().func_72899_e(x(), y(), z())) { Network.leaveWirelessNetwork(this); return; }  return; }  Network.leaveWirelessNetwork(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 122 */     super.load(nbt);
/* 123 */     if (nbt.func_74764_b("strength")) {
/* 124 */       strength_$eq(RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(nbt.func_74769_h("strength")), 0.0D)), maxWirelessRange()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 129 */     super.save(nbt);
/* 130 */     nbt.func_74780_a("strength", strength());
/*     */   } public abstract double wirelessCostPerRange();
/*     */   public abstract double maxWirelessRange();
/*     */   public abstract boolean shouldSendWiredTraffic();
/*     */   public static class Tier1 extends WirelessNetworkCard { private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/* 135 */     public Tier1(EnvironmentHost host) { super(host); } public double wirelessCostPerRange() {
/* 136 */       return Settings$.MODULE$.get().wirelessCostPerRange()[0];
/*     */     } public double maxWirelessRange() {
/* 138 */       return Settings$.MODULE$.get().maxWirelessRange()[0];
/*     */     }
/*     */     public int maxOpenPorts() {
/* 141 */       return Settings$.MODULE$.get().maxOpenPorts()[1];
/*     */     } public boolean shouldSendWiredTraffic() {
/* 143 */       return false;
/*     */     }
/*     */     
/*     */     private Map deviceInfo$lzycompute() {
/* 147 */       synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[8])[0] = Predef$ArrowAssoc$.MODULE$
/* 148 */             .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "network");
/* 149 */           (new scala.Tuple2[8])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Wireless ethernet controller");
/* 150 */           (new scala.Tuple2[8])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 151 */           (new scala.Tuple2[8])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "39i110 (LPPW-01)");
/* 152 */           (new scala.Tuple2[8])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("version"), "1.0");
/* 153 */           (new scala.Tuple2[8])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()).toString());
/* 154 */           (new scala.Tuple2[8])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(maxOpenPorts()).toString());
/* 155 */           (new scala.Tuple2[8])[7] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), BoxesRunTime.boxToDouble(maxWirelessRange()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[8])); this.bitmap$0 = true; }
/*     */          return this.deviceInfo; }
/*     */     
/* 158 */     } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */     
/*     */     public boolean isPacketAccepted(Packet packet, double distance) {
/* 161 */       return (distance <= maxWirelessRange() && (distance > false || shouldSendWiredTraffic())) ? 
/* 162 */         super.isPacketAccepted(packet, distance) : false;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class Tier2 extends Tier1 { private Map<String, String> deviceInfo;
/*     */     private volatile boolean bitmap$0;
/*     */     
/* 169 */     public Tier2(EnvironmentHost host) { super(host); } public double wirelessCostPerRange() {
/* 170 */       return Settings$.MODULE$.get().wirelessCostPerRange()[1];
/*     */     } public double maxWirelessRange() {
/* 172 */       return Settings$.MODULE$.get().maxWirelessRange()[1];
/*     */     }
/*     */     public int maxOpenPorts() {
/* 175 */       return Settings$.MODULE$.get().maxOpenPorts()[2];
/*     */     } public boolean shouldSendWiredTraffic() {
/* 177 */       return true;
/*     */     }
/*     */     
/*     */     private Map deviceInfo$lzycompute() {
/* 181 */       synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[8])[0] = Predef$ArrowAssoc$.MODULE$
/* 182 */             .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "network");
/* 183 */           (new scala.Tuple2[8])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Wireless ethernet controller");
/* 184 */           (new scala.Tuple2[8])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 185 */           (new scala.Tuple2[8])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "62i230 (MPW-01)");
/* 186 */           (new scala.Tuple2[8])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("version"), "2.0");
/* 187 */           (new scala.Tuple2[8])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()).toString());
/* 188 */           (new scala.Tuple2[8])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(maxOpenPorts()).toString());
/* 189 */           (new scala.Tuple2[8])[7] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), BoxesRunTime.boxToDouble(maxWirelessRange()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[8])); this.bitmap$0 = true; }
/*     */          return this.deviceInfo; }
/*     */     
/* 192 */     } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\WirelessNetworkCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */