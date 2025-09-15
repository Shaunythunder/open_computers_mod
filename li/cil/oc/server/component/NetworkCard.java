/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import li.cil.oc.server.component.traits.WakeMessageAware;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tub\001B\001\003\0015\0211BT3uo>\0248nQ1sI*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\006\001912$\t\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021q#G\007\0021)\0211AE\005\0035a\021!CU1dW\n+8oQ8o]\026\034G/\0312mKB\021AdH\007\002;)\021aDE\001\007IJLg/\032:\n\005\001j\"A\003#fm&\034W-\0238g_B\021!%J\007\002G)\021AEA\001\007iJ\f\027\016^:\n\005\031\032#\001E,bW\026lUm]:bO\026\fu/\031:f\021!A\003A!b\001\n\003I\023\001\0025pgR,\022A\013\t\003W9j\021\001\f\006\003[I\tqA\\3uo>\0248.\003\0020Y\tyQI\034<je>tW.\0328u\021>\034H\017\003\0052\001\t\005\t\025!\003+\003\025Awn\035;!\021\025\031\004\001\"\0015\003\031a\024N\\5u}Q\021Qg\016\t\003m\001i\021A\001\005\006QI\002\rA\013\005\bs\001\021\r\021\"\005;\003)1\030n]5cS2LG/_\013\002wA\0211\006P\005\003{1\022!BV5tS\nLG.\033;z\021\031y\004\001)A\005w\005Ya/[:jE&d\027\016^=!\021\035\t\005A1A\005B\t\013AA\\8eKV\t1\t\005\002,\t&\021Q\t\f\002\n\007>l\007o\0348f]RDaa\022\001!\002\023\031\025!\0028pI\026\004\003bB%\001\005\004%\tBS\001\n_B,g\016U8siN,\022a\023\t\004\031N+V\"A'\013\0059{\025aB7vi\006\024G.\032\006\003!F\013!bY8mY\026\034G/[8o\025\005\021\026!B:dC2\f\027B\001+N\005\r\031V\r\036\t\003-^k\021!U\005\0031F\0231!\0238u\021\031Q\006\001)A\005\027\006Qq\016]3o!>\024Ho\035\021\t\013q\003A\021C/\002\0315\f\007p\0249f]B{'\017^:\026\003UC\001b\030\001\t\006\004%i\001Y\001\013I\0264\030nY3J]\032|W#A1\021\t\t,wmZ\007\002G*\021AmT\001\nS6lW\017^1cY\026L!AZ2\003\0075\013\007\017\005\002i[6\t\021N\003\002kW\006!A.\0318h\025\005a\027\001\0026bm\006L!A\\5\003\rM#(/\0338h\021!\001\b\001#A!B\033\t\027a\0033fm&\034W-\0238g_\002BQA\035\001\005BM\fQbZ3u\t\0264\030nY3J]\032|G#\001;\021\tUD\0300_\007\002m*\021qo[\001\005kRLG.\003\002gmB\021!0 \b\003-nL!\001`)\002\rA\023X\rZ3g\023\tqgP\003\002}#\"9\021\021\001\001\005\002\005\r\021\001B8qK:$b!!\002\002\022\005\005\002#\002,\002\b\005-\021bAA\005#\n)\021I\035:bsB\031a+!\004\n\007\005=\021K\001\004B]f\024VM\032\005\b\003'y\b\031AA\013\003\035\031wN\034;fqR\004B!a\006\002\0365\021\021\021\004\006\004\0037\021\022aB7bG\"Lg.Z\005\005\003?\tIBA\004D_:$X\r\037;\t\017\005\rr\0201\001\002&\005!\021M]4t!\021\t9\"a\n\n\t\005%\022\021\004\002\n\003J<W/\\3oiNDsa`A\027\003g\t)\004\005\003\002\030\005=\022\002BA\031\0033\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA\034\003}3WO\\2uS>t\007\006]8sijrW/\0342fe&R$m\\8mK\006t\007%L\027!\037B,gn\035\021uQ\026\0043\017]3dS\032LW\r\032\021q_J$h\006\t*fiV\024hn\035\021ueV,\007%\0334!i\",\007\005]8si\002:\030m\035\021pa\026tW\r\032\030\t\017\005m\002\001\"\001\002>\005)1\r\\8tKR1\021QAA \003\003B\001\"a\005\002:\001\007\021Q\003\005\t\003G\tI\0041\001\002&!B\021\021HA\027\003g\t)%\t\002\002H\005)h-\0368di&|g\016K.q_J$(H\\;nE\026\024X,\013\036c_>dW-\0318![5\0023\t\\8tKN\004C\017[3!gB,7-\0334jK\022\004\003o\034:uA!\"WMZ1vYRT\004%\0317mAA|'\017^:*]\001\022V\r^;s]N\004CO];fA%4\007\005]8siN\004s/\032:fA\rdwn]3e]!9\0211\n\001\005\002\0055\023AB5t\037B,g\016\006\004\002\006\005=\023\021\013\005\t\003'\tI\0051\001\002\026!A\0211EA%\001\004\t)\003\013\007\002J\0055\022QKA,\003g\tI&\001\004eSJ,7\r^\r\002\003\005\022\0211L\001EMVt7\r^5p]\"\002xN\035;;]Vl'-\032:*u\t|w\016\\3b]\002jS\006I,iKRDWM\035\021uQ\026\0043\017]3dS\032LW\r\032\021q_J$\b%[:!_B,gN\f\005\b\003?\002A\021AA1\003)I7oV5sK2,7o\035\013\007\003\013\t\031'!\032\t\021\005M\021Q\fa\001\003+A\001\"a\t\002^\001\007\021Q\005\025\r\003;\ni#!\026\002X\005M\022\021N\021\003\003W\n1JZ;oGRLwN\034\025*u\t|w\016\\3b]\002jS\006I,iKRDWM\035\021uQ&\034\beY1sI\002B\027m\035\021xSJ,G.Z:tA9,Go^8sW&tw\rI2ba\006\024\027\016\\5us:Bq!a\034\001\t\003\t\t(A\004jg^K'/\0323\025\r\005\025\0211OA;\021!\t\031\"!\034A\002\005U\001\002CA\022\003[\002\r!!\n)\031\0055\024QFA+\003/\n\031$!\037\"\005\005m\024\001\0234v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021XQ\026$\b.\032:!i\"L7\017I2be\022\004\003.Y:!o&\024X\r\032\021oKR<xN]6j]\036\0043-\0319bE&d\027\016^=/\021\035\ty\b\001C\001\003\003\013Aa]3oIR1\021QAAB\003\013C\001\"a\005\002~\001\007\021Q\003\005\t\003G\ti\b1\001\002&!B\021QPA\027\003g\tI)\t\002\002\f\006\031g-\0368di&|g\016K1eIJ,7o\035\036tiJLgn\032\027!a>\024HO\0178v[\n,'\017\f\021eCR\fgF\f\030*A5j\003eU3oIN\004C\017[3!gB,7-\0334jK\022\004C-\031;bAQ|\007\005\0365fAM\004XmY5gS\026$\007\005^1sO\026$h\006C\004\002\020\002!\t!!%\002\023\t\024x.\0313dCN$HCBA\003\003'\013)\n\003\005\002\024\0055\005\031AA\013\021!\t\031#!$A\002\005\025\002\006CAG\003[\t\031$!'\"\005\005m\025A\0264v]\016$\030n\0348)a>\024HO\0178v[\n,'\017\f\021eCR\fgF\f\030*A5j\003E\021:pC\022\034\027m\035;tAQDW\rI:qK\016Lg-[3eA\021\fG/\031\021p]\002\"\b.\032\021ta\026\034\027NZ5fI\002\002xN\035;/\021\035\ty\n\001C\001\003C\013Q\"\\1y!\006\0347.\032;TSj,GCBA\003\003G\013)\013\003\005\002\024\005u\005\031AA\013\021!\t\031#!(A\002\005\025\002\006DAO\003[\t)&a\026\0024\005%\026EAAV\003\r3WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r^:!i\",\007%\\1yS6,X\016\t9bG.,G\017I:ju\026\004\003fY8oM&<\007e]3ui&tw-\013\030\t\017\005=\006\001\"\005\0022\0061Am\\*f]\022$B!a-\002:B\031a+!.\n\007\005]\026K\001\003V]&$\b\002CA^\003[\003\r!!0\002\rA\f7m[3u!\rY\023qX\005\004\003\003d#A\002)bG.,G\017C\004\002F\002!\t\"a2\002\027\021|'I]8bI\016\f7\017\036\013\005\003g\013I\r\003\005\002<\006\r\007\031AA_\021\035\ti\r\001C!\003\037\fAb\0348ESN\034wN\0348fGR$B!a-\002R\"9\021)a3A\002\005M\007cA\026\002V&\031\021q\033\027\003\t9{G-\032\005\b\0037\004A\021IAo\003%yg.T3tg\006<W\r\006\003\0024\006}\007\002CAq\0033\004\r!a9\002\0175,7o]1hKB\0311&!:\n\007\005\035HFA\004NKN\034\030mZ3\t\017\005-\b\001\"\025\002n\006\001\022n\035)bG.,G/Q2dKB$X\r\032\013\007\003_\f)0a>\021\007Y\013\t0C\002\002tF\023qAQ8pY\026\fg\016\003\005\002<\006%\b\031AA_\021!\tI0!;A\002\005m\030\001\0033jgR\fgnY3\021\007Y\013i0C\002\002\000F\023a\001R8vE2,\007b\002B\002\001\021\005#QA\001\016e\026\034W-\033<f!\006\0347.\032;\025\t\005M&q\001\005\t\003w\023\t\0011\001\002>\"9!1\002\001\005B\t5\021\001\0027pC\022$B!a-\003\020!A!\021\003B\005\001\004\021\031\"A\002oER\004BA!\006\003\"5\021!q\003\006\005\005#\021IB\003\003\003\034\tu\021!C7j]\026\034'/\0314u\025\t\021y\"A\002oKRLAAa\t\003\030\tqaJ\021+UC\036\034u.\0349pk:$\007b\002B\024\001\021\005#\021F\001\005g\0064X\r\006\003\0024\n-\002\002\003B\t\005K\001\rAa\005\t\017\t=\002\001\"\005\0032\005I1\r[3dWB{'\017\036\013\004+\nM\002b\002B\033\005[\001\r!V\001\005a>\024H\017C\004\003:\001!IAa\017\002\0379,Go^8sW\006\033G/\033<jif$\"!a-")
/*     */ public class NetworkCard extends ManagedEnvironment implements RackBusConnectable, DeviceInfo, WakeMessageAware {
/*     */   private final EnvironmentHost host;
/*     */   private final Visibility visibility;
/*     */   private final Component node;
/*     */   private final Set<Object> openPorts;
/*     */   
/*  29 */   public Option<String> wakeMessage() { return this.wakeMessage; } private Map<String, String> deviceInfo; private Option<String> wakeMessage; private boolean wakeMessageFuzzy; private volatile boolean bitmap$0; public void wakeMessage_$eq(Option<String> x$1) { this.wakeMessage = x$1; } public boolean wakeMessageFuzzy() { return this.wakeMessageFuzzy; } public void wakeMessageFuzzy_$eq(boolean x$1) { this.wakeMessageFuzzy = x$1; } @Callback(direct = true, doc = "function():string, boolean -- Get the current wake-up message.") public Object[] getWakeMessage(Context context, Arguments args) { return WakeMessageAware.class.getWakeMessage(this, context, args); } @Callback(doc = "function(message:string[, fuzzy:boolean]):string -- Set the wake-up message and whether to ignore additional data/parameters.") public Object[] setWakeMessage(Context context, Arguments args) { return WakeMessageAware.class.setWakeMessage(this, context, args); } public void receivePacket(Packet packet, double distance, EnvironmentHost host) { WakeMessageAware.class.receivePacket(this, packet, distance, host); } public void loadWakeMessage(NBTTagCompound nbt) { WakeMessageAware.class.loadWakeMessage(this, nbt); } public void saveWakeMessage(NBTTagCompound nbt) { WakeMessageAware.class.saveWakeMessage(this, nbt); } public EnvironmentHost host() { return this.host; } public NetworkCard(EnvironmentHost host) { Visibility visibility; WakeMessageAware.class.$init$(this);
/*  30 */     EnvironmentHost environmentHost = host;
/*  31 */     if (environmentHost instanceof li.cil.oc.api.internal.Rack) { visibility = Visibility.Neighbors; }
/*  32 */     else { visibility = Visibility.Network; }
/*     */     
/*     */     this.visibility = visibility;
/*  35 */     this.node = (Component)Network.newNode((Environment)this, visibility())
/*  36 */       .withComponent("modem", Visibility.Neighbors)
/*  37 */       .create();
/*     */     
/*  39 */     this.openPorts = Set$.MODULE$.empty(); } public Visibility visibility() { return this.visibility; } public Component node() { return this.node; } public Set<Object> openPorts() { return this.openPorts; }
/*     */   
/*     */   public int maxOpenPorts() {
/*  42 */     return Settings$.MODULE$.get().maxOpenPorts()[0];
/*     */   }
/*     */   
/*     */   private Map deviceInfo$lzycompute() {
/*  46 */     synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[8])[0] = Predef$ArrowAssoc$.MODULE$
/*  47 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "network");
/*  48 */         (new scala.Tuple2[8])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Ethernet controller");
/*  49 */         (new scala.Tuple2[8])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  50 */         (new scala.Tuple2[8])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "42i520 (MPN-01)");
/*  51 */         (new scala.Tuple2[8])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("version"), "1.0");
/*  52 */         (new scala.Tuple2[8])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()).toString());
/*  53 */         (new scala.Tuple2[8])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(maxOpenPorts()).toString());
/*  54 */         (new scala.Tuple2[8])[7] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketParts()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[8])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */   
/*  57 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(port:number):boolean -- Opens the specified port. Returns true if the port was opened.")
/*     */   public Object[] open(Context context, Arguments args) {
/*  63 */     int port = checkPort(args.checkInteger(0));
/*     */     
/*  65 */     if (openPorts().size() >= maxOpenPorts()) {
/*  66 */       throw new IOException("too many open ports");
/*     */     }
/*  68 */     return openPorts().contains(BoxesRunTime.boxToInteger(port)) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(openPorts().add(BoxesRunTime.boxToInteger(port))) }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function([port:number]):boolean -- Closes the specified port (default: all ports). Returns true if ports were closed.")
/*     */   public Object[] close(Context context, Arguments args) {
/*  74 */     boolean closed = openPorts().nonEmpty();
/*  75 */     openPorts().clear();
/*     */ 
/*     */ 
/*     */     
/*  79 */     int port = checkPort(args.checkInteger(0));
/*  80 */     return (args.count() == 0) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(closed) })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(openPorts().remove(BoxesRunTime.boxToInteger(port))) }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function(port:number):boolean -- Whether the specified port is open.")
/*     */   public Object[] isOpen(Context context, Arguments args) {
/*  86 */     int port = checkPort(args.checkInteger(0));
/*  87 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(openPorts().contains(BoxesRunTime.boxToInteger(port))) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():boolean -- Whether this card has wireless networking capability.")
/*     */   public Object[] isWireless(Context context, Arguments args) {
/*  91 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*     */   } @Callback(direct = true, doc = "function():boolean -- Whether this card has wired networking capability.")
/*     */   public Object[] isWired(Context context, Arguments args) {
/*  94 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */   }
/*     */   @Callback(doc = "function(address:string, port:number, data...) -- Sends the specified data to the specified target.")
/*     */   public Object[] send(Context context, Arguments args) {
/*  98 */     String address = args.checkString(0);
/*  99 */     int port = checkPort(args.checkInteger(1));
/* 100 */     Packet packet = Network.newPacket(node().address(), address, port, (Object[])((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)args).drop(2)).toArray(ClassTag$.MODULE$.Object()));
/* 101 */     doSend(packet);
/* 102 */     networkActivity();
/* 103 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(port:number, data...) -- Broadcasts the specified data on the specified port.")
/*     */   public Object[] broadcast(Context context, Arguments args) {
/* 108 */     int port = checkPort(args.checkInteger(0));
/* 109 */     Packet packet = Network.newPacket(node().address(), null, port, (Object[])((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)args).drop(1)).toArray(ClassTag$.MODULE$.Object()));
/* 110 */     doBroadcast(packet);
/* 111 */     networkActivity();
/* 112 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- Gets the maximum packet size (config setting).")
/*     */   public Object[] maxPacketSize(Context context, Arguments args) {
/* 117 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()) }));
/*     */   } public void doSend(Packet packet) {
/* 119 */     Visibility visibility = visibility();
/* 120 */     if (Visibility.Neighbors.equals(visibility)) { node().sendToNeighbors("network.message", new Object[] { packet }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 121 */     else if (Visibility.Network.equals(visibility)) { node().sendToReachable("network.message", new Object[] { packet }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 122 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public void doBroadcast(Packet packet) {
/* 125 */     Visibility visibility = visibility();
/* 126 */     if (Visibility.Neighbors.equals(visibility)) { node().sendToNeighbors("network.message", new Object[] { packet }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 127 */     else if (Visibility.Network.equals(visibility)) { node().sendToReachable("network.message", new Object[] { packet }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 128 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 134 */     super.onDisconnect(node);
/* 135 */     Component component = node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/* 136 */       { openPorts().clear(); return; }  return; }  openPorts().clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'computer.stopped'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 63
/*     */     //   24: goto -> 34
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifne -> 63
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface name : ()Ljava/lang/String;
/*     */     //   40: ldc_w 'computer.started'
/*     */     //   43: astore_3
/*     */     //   44: dup
/*     */     //   45: ifnonnull -> 56
/*     */     //   48: pop
/*     */     //   49: aload_3
/*     */     //   50: ifnull -> 63
/*     */     //   53: goto -> 90
/*     */     //   56: aload_3
/*     */     //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 90
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual node : ()Lli/cil/oc/api/network/Component;
/*     */     //   67: aload_1
/*     */     //   68: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   73: invokeinterface isNeighborOf : (Lli/cil/oc/api/network/Node;)Z
/*     */     //   78: ifeq -> 90
/*     */     //   81: aload_0
/*     */     //   82: invokevirtual openPorts : ()Lscala/collection/mutable/Set;
/*     */     //   85: invokeinterface clear : ()V
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface name : ()Ljava/lang/String;
/*     */     //   96: ldc_w 'network.message'
/*     */     //   99: astore #4
/*     */     //   101: dup
/*     */     //   102: ifnonnull -> 114
/*     */     //   105: pop
/*     */     //   106: aload #4
/*     */     //   108: ifnull -> 122
/*     */     //   111: goto -> 224
/*     */     //   114: aload #4
/*     */     //   116: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   119: ifeq -> 224
/*     */     //   122: aload_1
/*     */     //   123: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   128: astore #5
/*     */     //   130: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   133: aload #5
/*     */     //   135: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   138: astore #6
/*     */     //   140: aload #6
/*     */     //   142: invokevirtual isEmpty : ()Z
/*     */     //   145: ifne -> 219
/*     */     //   148: aload #6
/*     */     //   150: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   153: ifnull -> 219
/*     */     //   156: aload #6
/*     */     //   158: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   161: checkcast scala/collection/SeqLike
/*     */     //   164: iconst_1
/*     */     //   165: invokeinterface lengthCompare : (I)I
/*     */     //   170: iconst_0
/*     */     //   171: if_icmpne -> 219
/*     */     //   174: aload #6
/*     */     //   176: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   179: checkcast scala/collection/SeqLike
/*     */     //   182: iconst_0
/*     */     //   183: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   188: astore #7
/*     */     //   190: aload #7
/*     */     //   192: instanceof li/cil/oc/api/network/Packet
/*     */     //   195: ifeq -> 219
/*     */     //   198: aload #7
/*     */     //   200: checkcast li/cil/oc/api/network/Packet
/*     */     //   203: astore #8
/*     */     //   205: aload_0
/*     */     //   206: aload #8
/*     */     //   208: invokevirtual receivePacket : (Lli/cil/oc/api/network/Packet;)V
/*     */     //   211: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   214: astore #9
/*     */     //   216: goto -> 224
/*     */     //   219: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   222: astore #9
/*     */     //   224: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 0
/*     */     //   #142	-> 5
/*     */     //   #143	-> 81
/*     */     //   #144	-> 90
/*     */     //   #145	-> 130
/*     */     //   #146	-> 219
/*     */     //   #140	-> 224
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	225	0	this	Lli/cil/oc/server/component/NetworkCard;
/*     */     //   0	225	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   190	35	7	packet	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPacketAccepted(Packet packet, double distance) {
/* 151 */     if (WakeMessageAware.class.isPacketAccepted(this, packet, distance) && 
/* 152 */       openPorts().contains(BoxesRunTime.boxToInteger(packet.port()))) {
/* 153 */       networkActivity();
/* 154 */       return true;
/*     */     } 
/*     */     
/* 157 */     return false;
/*     */   }
/*     */   public void receivePacket(Packet packet) {
/* 160 */     receivePacket(packet, 0.0D, host());
/*     */   }
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 165 */     super.load(nbt);
/* 166 */     Predef$.MODULE$.assert(openPorts().isEmpty());
/* 167 */     openPorts().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(nbt.func_74759_k("openPorts")));
/* 168 */     loadWakeMessage(nbt);
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 172 */     super.save(nbt);
/* 173 */     nbt.func_74783_a("openPorts", (int[])openPorts().toArray(ClassTag$.MODULE$.Int()));
/* 174 */     saveWakeMessage(nbt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkPort(int port) {
/* 180 */     if (port < 1 || port > 65535) throw new IllegalArgumentException("invalid port number");  return 
/* 181 */       port;
/*     */   }
/*     */   private void networkActivity() {
/* 184 */     EnvironmentHost environmentHost = host();
/* 185 */     if (environmentHost != null) { EnvironmentHost environmentHost1 = environmentHost; PacketSender$.MODULE$.sendNetworkActivity((Node)node(), environmentHost1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 186 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\NetworkCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */