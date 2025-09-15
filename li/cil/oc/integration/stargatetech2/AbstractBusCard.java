/*     */ package li.cil.oc.integration.stargatetech2;
/*     */ 
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import lordfokas.stargatetech2.api.bus.BusPacketLIP;
/*     */ import scala.Tuple2;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t]c\001B\001\003\0015\021q\"\0212tiJ\f7\r\036\"vg\016\013'\017\032\006\003\007\021\tQb\035;be\036\fG/\032;fG\"\024$BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\t\003/yi\021\001\007\006\0033i\t1AY;t\025\t\0312D\003\002\0049)\tQ$A\005m_J$gm\\6bg&\021q\004\007\002\013\023\n+8\017\022:jm\026\024\b\002C\021\001\005\013\007I\021\001\022\002\r\021,g/[2f+\005\031\003CA\f%\023\t)\003D\001\006J\005V\034H)\032<jG\026D\001b\n\001\003\002\003\006IaI\001\bI\0264\030nY3!\021\025I\003\001\"\001+\003\031a\024N\\5u}Q\0211&\f\t\003Y\001i\021A\001\005\006C!\002\ra\t\005\b_\001\021\r\021\"\0211\003\021qw\016Z3\026\003E\002\"AM\033\016\003MR!\001\016\n\002\0179,Go^8sW&\021ag\r\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\0049\001\001\006I!M\001\006]>$W\r\t\005\bu\001\021\r\021\"\001<\0031\021Wo]%oi\026\024h-Y2f+\005a\004CA\f>\023\tq\004DA\007J\005V\034\030J\034;fe\032\f7-\032\005\007\001\002\001\013\021\002\037\002\033\t,8/\0238uKJ4\027mY3!\021\035\021\005\0011A\005\022\r\013\021\"[:F]\006\024G.\0323\026\003\021\003\"!\022%\016\003\031S\021aR\001\006g\016\fG.Y\005\003\023\032\023qAQ8pY\026\fg\016C\004L\001\001\007I\021\003'\002\033%\034XI\\1cY\026$w\fJ3r)\ti\005\013\005\002F\035&\021qJ\022\002\005+:LG\017C\004R\025\006\005\t\031\001#\002\007a$\023\007\003\004T\001\001\006K\001R\001\013SN,e.\0312mK\022\004\003bB+\001\001\004%\tBV\001\bC\022$'/Z:t+\0059\006CA#Y\023\tIfIA\002J]RDqa\027\001A\002\023EA,A\006bI\022\024Xm]:`I\025\fHCA'^\021\035\t&,!AA\002]Caa\030\001!B\0239\026\001C1eIJ,7o\035\021\t\017\005\004\001\031!C\tE\006I1/\0328e#V,W/Z\013\002GB\031Q\t\0324\n\005\0254%AB(qi&|g\016\r\002hYB\031q\003\0336\n\005%D\"!\003\"vgB\0137m[3u!\tYG\016\004\001\005\0235t\027\021!A\001\006\003)(aA0%c!1q\016\001Q!\nA\f!b]3oIF+X-^3!!\r)E-\035\031\003eR\0042a\0065t!\tYG\017B\005n]\006\005\t\021!B\001kF\021a/\037\t\003\013^L!\001\037$\003\0179{G\017[5oOB\021QI_\005\003w\032\0231!\0218z\021\035i\b\0011A\005\022y\fQb]3oIF+X-^3`I\025\fHCA'\000\021!\tF0!AA\002\005\005\001\003B#e\003\007\001D!!\002\002\nA!q\003[A\004!\rY\027\021\002\003\n[:\f\t\021!A\003\002UD\021\"!\004\001\001\004%\t\"a\004\002\013=<h.\032:\026\005\005E\001\003B#e\003'\001B!!\006\002\0345\021\021q\003\006\004\0033\021\022aB7bG\"Lg.Z\005\005\003;\t9BA\004D_:$X\r\037;\t\023\005\005\002\0011A\005\022\005\r\022!C8x]\026\024x\fJ3r)\ri\025Q\005\005\n#\006}\021\021!a\001\003#A\001\"!\013\001A\003&\021\021C\001\007_^tWM\035\021\t\017\0055\002\001\"\021\0020\005aq-\032;TQ>\024HOT1nKR\021\021\021\007\t\005\003g\ti$\004\002\0026)!\021qGA\035\003\021a\027M\\4\013\005\005m\022\001\0026bm\006LA!a\020\0026\t11\013\036:j]\036Dq!a\021\001\t\003\ny#\001\bhKR$Um]2sSB$\030n\0348\t\017\005\035\003\001\"\021\002J\005y1-\0318IC:$G.\032)bG.,G\017F\004E\003\027\n)&!\027\t\021\0055\023Q\ta\001\003\037\naa]3oI\026\024\bcA#\002R%\031\0211\013$\003\013MCwN\035;\t\017\005]\023Q\ta\001/\006Q\001O]8u_\016|G.\023#\t\017\005m\023Q\ta\001\t\0061\001.Y:M\023BCq!a\030\001\t\003\n\t'\001\007iC:$G.\032)bG.,G\017F\002N\003GB\001\"!\032\002^\001\007\021qM\001\007a\006\0347.\032;1\t\005%\024Q\016\t\005/!\fY\007E\002l\003[\"1\"a\034\002d\005\005\t\021!B\001k\n\031q\f\n\032\t\017\005M\004\001\"\021\002v\005\031r-\032;OKb$\b+Y2lKR$vnU3oIR\021\021q\017\031\005\003s\ni\b\005\003\030Q\006m\004cA6\002~\021QQ.!\035\002\002\003\005)\021A;\t\017\005\005\005\001\"\021\002\004\006\021\022n]%oi\026\024h-Y2f\013:\f'\r\\3e)\005!\005bBAD\001\021\005\023\021R\001\024O\026$\030J\034;fe\032\f7-Z!eIJ,7o\035\013\003\003\037Bq!!$\001\t\003\ty)\001\006hKR,e.\0312mK\022$b!!%\002\036\006\005\006#B#\002\024\006]\025bAAK\r\n)\021I\035:bsB\031Q)!'\n\007\005meI\001\004B]f\024VM\032\005\t\003?\013Y\t1\001\002\024\00591m\0348uKb$\b\002CAR\003\027\003\r!!*\002\t\005\024xm\035\t\005\003+\t9+\003\003\002*\006]!!C!sOVlWM\034;tQ!\tY)!,\0024\006U\006\003BA\013\003_KA!!-\002\030\tA1)\0317mE\006\0347.A\002e_\016\f#!a.\002\003\032,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001:\006.\032;iKJ\004C\017[3!Y>\034\027\r\034\021ckN\004\023N\034;fe\032\f7-\032\021jg\002*g.\0312mK\022t\003bBA^\001\021\005\021QX\001\013g\026$XI\\1cY\026$GCBAI\003\013\t\r\003\005\002 \006e\006\031AA\n\021!\t\031+!/A\002\005\025\006\006CA]\003[\013\031,!2\"\005\005\035\027\001\0304v]\016$\030n\0348)K:\f'\r\\3eu\t|w\016\\3b]&R$m\\8mK\006t\007%L\027!'\026$8\017I<iKRDWM\035\021uQ\026\004Cn\\2bY\002\022Wo\035\021j]R,'OZ1dK\002\032\bn\\;mI\002\022W\rI3oC\ndW\r\032\030\t\017\005-\007\001\"\001\002N\006Qq-\032;BI\022\024Xm]:\025\r\005E\025qZAi\021!\ty*!3A\002\005M\001\002CAR\003\023\004\r!!*)\021\005%\027QVAZ\003+\f#!a6\002k\031,hn\031;j_:D\023F\0178v[\n,'\017I\027.A\035+G\017\t;iK\002bwnY1mA%tG/\032:gC\016,\007%\0313ee\026\0348O\f\005\b\0037\004A\021AAo\003)\031X\r^!eIJ,7o\035\013\007\003#\013y.!9\t\021\005}\025\021\034a\001\003'A\001\"a)\002Z\002\007\021Q\025\025\t\0033\fi+a-\002f\006\022\021q]\001EMVt7\r^5p]\"\nG\r\032:fgNTd.^7cKJL#H\\;nE\026\024\b%L\027!'\026$8\017\t;iK\002bwnY1mA%tG/\032:gC\016,\007%\0313ee\026\0348O\f\005\b\003W\004A\021AAw\003\021\031XM\0343\025\r\005E\025q^Ay\021!\ty*!;A\002\005M\001\002CAR\003S\004\r!!*)\021\005%\030QVAZ\003k\f#!a>\002#\032,hn\031;j_:D\023\r\0323sKN\034(H\\;nE\026\024H\006\t3bi\006TD/\0312mK&RD/\0312mK\002jS\006I*f]\022\034\b\005Z1uC\002\n7M]8tg\002\"\b.\032\021bEN$(/Y2uA\t,8O\f\005\b\003w\004A\021AA\003\021\0318-\0318\025\r\005E\025q B\001\021!\ty*!?A\002\005M\001\002CAR\003s\004\r!!*)\021\005e\030QVAZ\005\013\t#Aa\002\002\007\032,hn\031;j_:DS.Y:lu9,XNY3sSi\"\030M\0317fA5j\003eU2b]N\004C\017[3!]\026$xo\034:lA\031|'\017I8uQ\026\024\b\005Z3wS\016,7O\f\005\b\005\027\001A\021\001B\007\0035i\027\r\037)bG.,GoU5{KR1\021\021\023B\b\005#A\001\"a(\003\n\001\007\0211\003\005\t\003G\023I\0011\001\002&\"b!\021BAW\005+\0219\"a-\003\032\0051A-\033:fGRL\022!A\021\003\0057\t1JZ;oGRLwN\034\025*u9,XNY3sA5j\003\005\0265fA5\f\0070[7v[\002\002\030mY6fi\002\032\030N_3!i\"\fG\017I2b]\002\022W\rI:f]R\004sN^3sAQDW\r\t2vg:BqAa\b\001\t\003\022\t#A\005p]\016{gN\\3diR\031QJa\t\t\017=\022i\0021\001\003&A\031!Ga\n\n\007\t%2G\001\003O_\022,\007b\002B\027\001\021\005#qF\001\r_:$\025n]2p]:,7\r\036\013\004\033\nE\002bB\030\003,\001\007!Q\005\005\b\005k\001A\021\tB\034\003\021aw.\0313\025\0075\023I\004\003\005\003<\tM\002\031\001B\037\003\rq'\r\036\t\005\005\021Y%\004\002\003B)!!1\bB\"\025\021\021)Ea\022\002\0235Lg.Z2sC\032$(B\001B%\003\rqW\r^\005\005\005\033\022\tE\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\tE\003\001\"\021\003T\005!1/\031<f)\ri%Q\013\005\t\005w\021y\0051\001\003>\001")
/*     */ public class AbstractBusCard extends ManagedEnvironment implements IBusDriver {
/*     */   private final IBusDevice device;
/*     */   private final ComponentConnector node;
/*     */   private final IBusInterface busInterface;
/*     */   private boolean isEnabled;
/*     */   private int address;
/*     */   private Option<BusPacket<?>> sendQueue;
/*     */   private Option<Context> owner;
/*     */   
/*  17 */   public IBusDevice device() { return this.device; }
/*  18 */   public AbstractBusCard(IBusDevice device) { this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Neighbors)
/*  19 */       .withComponent("abstract_bus")
/*  20 */       .withConnector()
/*  21 */       .create();
/*     */     
/*  23 */     this.busInterface = StargateTechAPI.api().getFactory().getIBusInterface(device, this);
/*     */     
/*  25 */     this.isEnabled = true;
/*     */     
/*  27 */     this.address = 0;
/*     */     
/*  29 */     this.sendQueue = (Option<BusPacket<?>>)None$.MODULE$;
/*     */     
/*  31 */     this.owner = (Option<Context>)None$.MODULE$; } public ComponentConnector node() { return this.node; } public IBusInterface busInterface() { return this.busInterface; } public boolean isEnabled() { return this.isEnabled; } public void isEnabled_$eq(boolean x$1) { this.isEnabled = x$1; } public int address() { return this.address; } public void address_$eq(int x$1) { this.address = x$1; } public Option<BusPacket<?>> sendQueue() { return this.sendQueue; } public void sendQueue_$eq(Option<BusPacket<?>> x$1) { this.sendQueue = x$1; } public Option<Context> owner() { return this.owner; } public void owner_$eq(Option<Context> x$1) { this.owner = x$1; }
/*     */ 
/*     */   
/*     */   public String getShortName() {
/*  35 */     return "Computer";
/*     */   } public String getDescription() {
/*  37 */     return "An OpenComputers computer or server.";
/*     */   } public boolean canHandlePacket(short sender, int protocolID, boolean hasLIP) {
/*  39 */     return hasLIP;
/*     */   }
/*     */   
/*  42 */   public void handlePacket(BusPacket packet) { BusPacketLIP lip = packet.getPlainText();
/*  43 */     Map data = (Map)Predef$.MODULE$.Map().apply((Seq)WrapAsScala$.MODULE$.asScalaBuffer(lip.getEntryList()).map((Function1)new AbstractBusCard$$anonfun$1(this, lip), Buffer$.MODULE$.canBuildFrom()));
/*  44 */     (new Tuple2[3])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("mod"), (lip.getMetadata()).modID); (new Tuple2[3])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("device"), (lip.getMetadata()).deviceName); (new Tuple2[3])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("player"), (lip.getMetadata()).playerName); Map metadata = (Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[3]));
/*  45 */     owner().foreach((Function1)new AbstractBusCard$$anonfun$handlePacket$1(this, packet, data, metadata)); } public final class AbstractBusCard$$anonfun$1 extends AbstractFunction1<String, Tuple2<String, String>> implements Serializable { public static final long serialVersionUID = 0L; private final BusPacketLIP lip$1; public final Tuple2<String, String> apply(String key) { return new Tuple2(key, this.lip$1.get(key)); } public AbstractBusCard$$anonfun$1(AbstractBusCard $outer, BusPacketLIP lip$1) {} } public final class AbstractBusCard$$anonfun$handlePacket$1 extends AbstractFunction1<Context, Object> implements Serializable { public static final long serialVersionUID = 0L; private final BusPacket packet$1; private final Map data$1; private final Map metadata$1; public final boolean apply(Context x$1) { return x$1.signal("bus_message", new Object[] { BoxesRunTime.boxToInteger(this.packet$1.getProtocolID()), BoxesRunTime.boxToInteger(this.packet$1.getSender()), BoxesRunTime.boxToInteger(this.packet$1.getTarget()), this.data$1, this.metadata$1 }); }
/*     */     
/*     */     public AbstractBusCard$$anonfun$handlePacket$1(AbstractBusCard $outer, BusPacket packet$1, Map data$1, Map metadata$1) {} }
/*     */   public synchronized BusPacket<?> getNextPacketToSend() {
/*  49 */     BusPacket<?> packet = (BusPacket)sendQueue().orNull(Predef$.MODULE$.$conforms());
/*  50 */     sendQueue_$eq((Option<BusPacket<?>>)None$.MODULE$);
/*  51 */     return packet;
/*     */   }
/*     */   public boolean isInterfaceEnabled() {
/*  54 */     return isEnabled();
/*     */   } public short getInterfaceAddress() {
/*  56 */     return (short)address();
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():boolean -- Whether the local bus interface is enabled.")
/*     */   public Object[] getEnabled(Context context, Arguments args) {
/*  61 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isEnabled()) }));
/*     */   }
/*     */   @Callback(doc = "function(enabled:boolean):boolean -- Sets whether the local bus interface should be enabled.")
/*     */   public Object[] setEnabled(Context context, Arguments args) {
/*  65 */     isEnabled_$eq(args.checkBoolean(0));
/*  66 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isEnabled()) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the local interface address.")
/*     */   public Object[] getAddress(Context context, Arguments args) {
/*  70 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(address()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(address:number):number -- Sets the local interface address.")
/*  74 */   public Object[] setAddress(Context context, Arguments args) { address_$eq(args.checkInteger(0) & 0xFFFF);
/*  75 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(address()) })); }
/*     */   public final void li$cil$oc$integration$stargatetech2$AbstractBusCard$$checkSize$1(int add, IntRef size$1) { size$1.elem += add; if (size$1.elem > Settings$.MODULE$.get().maxNetworkPacketSize())
/*     */       throw new IllegalArgumentException((new StringBuilder()).append("packet too big (max ").append(BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize())).append(")").toString());  }
/*     */   public final class AbstractBusCard$$anonfun$send$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }
/*  80 */        return bool; } public AbstractBusCard$$anonfun$send$1(AbstractBusCard $outer) {} } @Callback(doc = "function(address:number, data:table):table -- Sends data across the abstract bus.") public synchronized Object[] send(Context context, Arguments args) { int target = args.checkInteger(0) & 0xFFFF;
/*  81 */     Map data = args.checkTable(1);
/*     */     
/*  83 */     BusPacketLIP packet = new BusPacketLIP((short)address(), (short)target);
/*  84 */     IntRef size = IntRef.create(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     WrapAsScala$.MODULE$.mapAsScalaMap(data).withFilter((Function1)new AbstractBusCard$$anonfun$send$1(this)).foreach((Function1)new AbstractBusCard$$anonfun$send$2(this, packet, size));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     packet.setMetadata(new BusPacketLIP.LIPMetadata("OpenComputers", node().address(), null));
/*  99 */     packet.finish();
/* 100 */     sendQueue_$eq((Option<BusPacket<?>>)new Some(packet));
/* 101 */     busInterface().sendAllPackets();
/* 102 */     return node().tryChangeBuffer(-Settings$.MODULE$.get().abstractBusPacketCost()) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { packet.getResponses().toArray()
/*     */           
/* 104 */           })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" })); }
/*     */   public final class AbstractBusCard$$anonfun$send$2 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final BusPacketLIP packet$2; private final IntRef size$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) {
/*     */         Object key = tuple2._1(), value = tuple2._2(); String keyAsString = key.toString(); this.$outer.li$cil$oc$integration$stargatetech2$AbstractBusCard$$checkSize$1(keyAsString.length(), this.size$1); String valueAsString = value.toString(); this.$outer.li$cil$oc$integration$stargatetech2$AbstractBusCard$$checkSize$1(valueAsString.length(), this.size$1); this.packet$2.set(keyAsString, valueAsString); BoxedUnit boxedUnit = BoxedUnit.UNIT; return;
/*     */       } 
/* 109 */       throw new MatchError(tuple2); } public AbstractBusCard$$anonfun$send$2(AbstractBusCard $outer, BusPacketLIP packet$2, IntRef size$1) {} } @Callback(doc = "function(mask:number):table -- Scans the network for other devices.") public synchronized Object[] scan(Context context, Arguments args) { short mask = (short)(args.checkInteger(0) & 0xFFFF);
/*     */     
/* 111 */     BusPacketNetScan packet = new BusPacketNetScan(mask);
/* 112 */     sendQueue_$eq((Option<BusPacket<?>>)new Some(packet));
/* 113 */     busInterface().sendAllPackets();
/* 114 */     (new Object[1])[0] = packet.getDevices().toArray();
/*     */     
/* 116 */     (new Object[2])[0] = Unit$.MODULE$; (new Object[2])[1] = "not enough energy"; return node().tryChangeBuffer(-Settings$.MODULE$.get().abstractBusPacketCost()) ? new Object[1] : new Object[2]; }
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- The maximum packet size that can be sent over the bus.")
/*     */   public Object[] maxPacketSize(Context context, Arguments args) {
/* 120 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()) }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 125 */     super.onConnect(node);
/* 126 */     if (owner().isEmpty() && node.host() instanceof Context) {
/* 127 */       owner_$eq((Option<Context>)new Some(node.host()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 132 */     super.onDisconnect(node);
/* 133 */     if (owner().isDefined() && node.host() instanceof Context) { Object object = owner().get(); if ((Context)node.host() == null) { (Context)node.host(); if (object != null) return;  } else { if (((Context)node.host()).equals(object))
/* 134 */         { owner_$eq((Option<Context>)None$.MODULE$); return; }  return; }  } else { return; }  owner_$eq((Option<Context>)None$.MODULE$);
/*     */   }
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 139 */     super.load(nbt);
/* 140 */     busInterface().readFromNBT(nbt, "bus");
/*     */     
/* 142 */     if (nbt.func_74764_b("enabled")) {
/* 143 */       isEnabled_$eq(nbt.func_74767_n("enabled"));
/*     */     }
/* 145 */     address_$eq(nbt.func_74762_e("address") & 0xFFFF);
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 149 */     super.save(nbt);
/* 150 */     busInterface().writeToNBT(nbt, "bus");
/* 151 */     nbt.func_74757_a("enabled", isEnabled());
/* 152 */     nbt.func_74768_a("address", address());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\stargatetech2\AbstractBusCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */