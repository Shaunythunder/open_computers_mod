/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import java.util.Map;
/*     */ import li.cil.oc.common.tileentity.traits.Environment;
/*     */ import li.cil.oc.common.tileentity.traits.OpenSides;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneAware;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Predef$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tEa\001B\001\003\0015\0211BT3u'Bd\027\016\036;fe*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\017\001qq#\b\021$WA\021q\"F\007\002!)\0211!\005\006\003%M\t\021\"\\5oK\016\024\030M\032;\013\003Q\t1A\\3u\023\t1\002C\001\006US2,WI\034;jif\004\"\001G\016\016\003eQ!A\007\002\002\rQ\024\030-\033;t\023\ta\022DA\006F]ZL'o\0348nK:$\bC\001\r\037\023\ty\022DA\005Pa\026t7+\0333fgB\021\001$I\005\003Ee\021QBU3egR|g.Z!xCJ,\007C\001\023*\033\005)#B\001\024(\003\035qW\r^<pe.T!\001\013\004\002\007\005\004\030.\003\002+K\t\0012+\0333fI\026sg/\033:p]6,g\016\036\t\003Y=j\021!\f\006\003]\035\na\001\032:jm\026\024\030B\001\031.\005)!UM^5dK&sgm\034\005\006e\001!\taM\001\007y%t\027\016\036 \025\003Q\002\"!\016\001\016\003\tA\001b\016\001\t\006\004%I\001O\001\013I\0264\030nY3J]\032|W#A\035\021\tiz\024)Q\007\002w)\021A(P\001\005kRLGNC\001?\003\021Q\027M^1\n\005\001[$aA'baB\021!\t\023\b\003\007\032k\021\001\022\006\002\013\006)1oY1mC&\021q\tR\001\007!J,G-\0324\n\005%S%AB*ue&twM\003\002H\t\"AA\n\001E\001B\003&\021(A\006eKZL7-Z%oM>\004\003\"\002(\001\t\003z\025!D4fi\022+g/[2f\023:4w\016F\001:\021\035\t\006A1A\005\002I\013AA\\8eKV\t1\013\005\002%)&\021Q+\n\002\005\035>$W\r\003\004X\001\001\006IaU\001\006]>$W\r\t\005\b3\002\001\r\021\"\001[\003)I7/\0238wKJ$X\rZ\013\0027B\0211\tX\005\003;\022\023qAQ8pY\026\fg\016C\004`\001\001\007I\021\0011\002\035%\034\030J\034<feR,Gm\030\023fcR\021\021\r\032\t\003\007\nL!a\031#\003\tUs\027\016\036\005\bKz\013\t\0211\001\\\003\rAH%\r\005\007O\002\001\013\025B.\002\027%\034\030J\034<feR,G\r\t\005\006S\002!\tE[\001\013SN\034\026\016Z3Pa\026tGCA.l\021\025a\007\0161\001n\003\021\031\030\016Z3\021\0059\034X\"A8\013\005q\002(BA\003r\025\t\0218#\001\bnS:,7M]1gi\032|'oZ3\n\005Q|'A\004$pe\036,G)\033:fGRLwN\034\005\006m\002!\te^\001\fg\026$8+\0333f\037B,g\016F\002bqfDQ\001\\;A\0025DQA_;A\002m\013QA^1mk\026DQ\001 \001\005Bu\f\021b]5eK\022tu\016Z3\025\005Ms\b\"\0027|\001\004i\007bBA\001\001\021\005\0231A\001\013G\006t7i\0348oK\016$HcA.\002\006!)An a\001[\"2q0!\003{\003C\001B!a\003\002\0365\021\021Q\002\006\005\003\037\t\t\"\001\006sK2\fWO\\2iKJTA!a\005\002\026\005\031a-\0347\013\t\005]\021\021D\001\005[>$7O\003\002\002\034\005\0311\r]<\n\t\005}\021Q\002\002\t'&$Wm\0248ms\022\022\0211E\005\005\003K\t9#\001\004D\031&+e\n\026\006\005\003S\ti!\001\003TS\022,\007bBA\027\001\021\005\023qF\001\nG\006tW\013\0353bi\026$\022a\027\005\b\003g\001A\021KA\033\003)Ig.\033;jC2L'0\032\013\002C\"9\021\021\b\001\005R\005m\022AF8o%\026$7\017^8oK&s\007/\036;DQ\006tw-\0323\025\007\005\fi\004\003\005\002@\005]\002\031AA!\003\021\t'oZ:\021\007a\t\031%C\002\002Fe\021\001DU3egR|g.Z\"iC:<W\rZ#wK:$\030I]4t\021\035\tI\005\001C!\003\027\nAC]3bI\032\023x.\034(C)\032{'oU3sm\026\024HcA1\002N!A\021qJA$\001\004\t\t&A\002oER\004B!a\025\002X5\021\021Q\013\006\004\003\037\n\022\002BA-\003+\022aB\024\"U)\006<7i\\7q_VtG\rC\004\002^\001!\t%a\030\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\007\005\f\t\007\003\005\002P\005m\003\031AA)\021\035\t)\007\001C!\003O\nAC]3bI\032\023x.\034(C)\032{'o\0217jK:$HcA1\002j!A\021qJA2\001\004\t\t\006K\004\002d\005%!0!\t\t\017\005=\004\001\"\021\002r\005\031rO]5uKR{gJ\021+G_J\034E.[3oiR\031\021-a\035\t\021\005=\023Q\016a\001\003#Bq!a\036\001\t\003\tI(A\007dkJ\024XM\034;Ti\006$Xo\035\013\003\003w\002r!! \002\b\006%5,\004\002\002\000)!\021\021QAB\003\035iW\017^1cY\026T1!!\"E\003)\031w\016\0347fGRLwN\\\005\004\001\006}\004cA\"\002\f&\031\021Q\022#\003\007%sG\017C\004\002\022\002!\t!a%\002\017M,GoU5eKR)1,!&\002\030\"1A.a$A\0025Dq!!'\002\020\002\0071,A\003ti\006$X\rC\004\002\036\002!\t!a(\002\021M,GoU5eKN$b!!)\002.\006u\006#B\"\002$\006\035\026bAAS\t\n)\021I\035:bsB\0311)!+\n\007\005-FI\001\004B]f\024VM\032\005\t\003_\013Y\n1\001\0022\00691m\0348uKb$\b\003BAZ\003sk!!!.\013\007\005]v%A\004nC\016D\027N\\3\n\t\005m\026Q\027\002\b\007>tG/\032=u\021!\ty$a'A\002\005}\006\003BAZ\003\003LA!a1\0026\nI\021I]4v[\026tGo\035\025\t\0037\0139-!4\002PB!\0211WAe\023\021\tY-!.\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\t\t.AA\004MVt7\r^5p]\"\032X\r\036;j]\036\034(\b^1cY\026L#\b^1cY\026\004S&\f\021tKR\004s\016]3oAM$\030\r^3!QQ\024X/Z\030gC2\034X-\013\021pM\002\nG\016\034\021tS\022,7\017I5oA\005t\007%\031:sCf\\\004%\0338eKb\004#-\037\021eSJ,7\r^5p]:\002#+\032;ve:\034\b\005\035:fm&|Wo\035\021ti\006$Xm\035\005\b\003+\004A\021AAl\003!9W\r^*jI\026\034HCBAQ\0033\fY\016\003\005\0020\006M\007\031AAY\021!\ty$a5A\002\005}\006\006DAj\003\017\fy.!9\002N\006\r\030A\0023je\026\034G/G\001\002C\t\t)/\0013gk:\034G/[8oQ%RD/\0312mK\002jS\006\t*fiV\024hn\035\021dkJ\024XM\034;!_B,gnL2m_N,\007e\035;bi\026\004sN\032\021bY2\0043/\0333fg\002Jg\016I1oA\005\024(/Y=-A%tG-\032=fI\002\022\027\020\t3je\026\034G/[8o]!9\021\021\036\001\005\002\005-\030!D:fiNKG-\032%fYB,'\017\006\004\002\"\0065\030q\036\005\t\003\t9\0171\001\002@\"1!0a:A\002mCq!a=\001\t\003\t)0\001\003pa\026tGCBAQ\003o\fI\020\003\005\0020\006E\b\031AAY\021!\ty$!=A\002\005}\006\006CAy\003\017\fi-!@\"\005\005}\030\001\0264v]\016$\030n\0348)g&$WM\017\021ok6\024WM]\025;E>|G.Z1oA5j\003e\0249f]\002\"\b.\032\021tS\022,G\006\t:fiV\024hn\035\021ueV,\007%\0334!SR\0043\r[1oO\026$\007\005^8!_B,gN\f\005\b\005\007\001A\021\001B\003\003\025\031Gn\\:f)\031\t\tKa\002\003\n!A\021q\026B\001\001\004\t\t\f\003\005\002@\t\005\001\031AA`Q!\021\t!a2\002N\n5\021E\001B\b\003Y3WO\\2uS>t\007f]5eKj\002c.^7cKJL#HY8pY\026\fg\016I\027.A\rcwn]3!i\",\007e]5eK2\002#/\032;ve:\034\b\005\036:vK\002Jg\rI5uA\rD\027M\\4fI\002\"x\016I2m_N,g\006")
/*     */ public class NetSplitter extends TileEntity implements Environment, OpenSides, RedstoneAware, SidedEnvironment, DeviceInfo {
/*     */   private Map<String, String> deviceInfo;
/*     */   private final Node node;
/*     */   private boolean isInverted;
/*     */   private final int[] _input;
/*     */   private final int[] _output;
/*     */   
/*  20 */   public int[] _input() { return this._input; } private boolean _isOutputEnabled; private boolean shouldUpdateInput; private boolean[] openSides; private boolean isChangeScheduled; private boolean moving; private volatile boolean bitmap$0; public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled(this); } public void setOutputEnabled(boolean value) { RedstoneAware.class.setOutputEnabled(this, value); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy(this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt(this, value); } public int[] getInput() { return RedstoneAware.class.getInput(this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput(this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput(this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput(this, values); } public int maxInput() { return RedstoneAware.class.maxInput(this); } public int[] getOutput() { return RedstoneAware.class.getOutput(this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput(this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput(this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput(this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged(this); } public void func_145845_h() { RedstoneAware.class.updateEntity(this); } public void func_145829_t() { RedstoneAware.class.validate(this); } public void updateRedstoneInput(ForgeDirection side) { RedstoneAware.class.updateRedstoneInput(this, side); } public void onRedstoneOutputEnabledChanged() { RedstoneAware.class.onRedstoneOutputEnabledChanged(this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged(this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged(this); } public ForgeDirection toLocal(ForgeDirection value) { return RotationAware.class.toLocal((RotationAware)this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return RotationAware.class.toGlobal((RotationAware)this, value); } public boolean[] openSides() { return this.openSides; } public void openSides_$eq(boolean[] x$1) { this.openSides = x$1; } public int SideCount() { return OpenSides.class.SideCount(this); } public boolean defaultState() { return OpenSides.class.defaultState(this); } public byte compressSides() { return OpenSides.class.compressSides(this); } public boolean[] uncompressSides(byte byte) { return OpenSides.class.uncompressSides(this, byte); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public NetSplitter() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); OpenSides.class.$init$(this); RotationAware.class.$init$((RotationAware)this); RedstoneAware.class.$init$(this);
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
/*  32 */     _isOutputEnabled_$eq(true);
/*     */     
/*  34 */     this.node = Network.newNode((Environment)this, Visibility.Network)
/*  35 */       .withComponent("net_splitter", Visibility.Network)
/*  36 */       .create();
/*     */     
/*  38 */     this.isInverted = false; } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "network"); (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Ethernet controller"); (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "NetSplits"); (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("version"), "1.0"); (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), "6"); this.deviceInfo = WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6]))); this.bitmap$0 = true; }  return this.deviceInfo; }  } private Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return deviceInfo(); } public Node node() { return this.node; } public boolean isInverted() { return this.isInverted; } public void isInverted_$eq(boolean x$1) { this.isInverted = x$1; }
/*     */    public boolean isSideOpen(ForgeDirection side) {
/*  40 */     return isInverted() ? (!OpenSides.class.isSideOpen(this, side)) : OpenSides.class.isSideOpen(this, side);
/*     */   }
/*     */   public void setSideOpen(ForgeDirection side, boolean value) {
/*  43 */     boolean previous = isSideOpen(side);
/*  44 */     OpenSides.class.setSideOpen(this, side, value);
/*  45 */     if (previous != isSideOpen(side)) {
/*  46 */       if (isServer()) {
/*  47 */         node().remove();
/*  48 */         Network.joinOrCreateNetwork(this);
/*  49 */         PacketSender$.MODULE$.sendNetSplitterState(this);
/*  50 */         world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "tile.piston.out", 0.5F, (world()).field_73012_v.nextFloat() * 0.25F + 0.7F);
/*  51 */         world().func_147459_d(x(), y(), z(), block());
/*     */       } else {
/*     */         
/*  54 */         world().func_147471_g(x(), y(), z());
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Node sidedNode(ForgeDirection side) {
/*  61 */     return isSideOpen(side) ? node() : null;
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public boolean canConnect(ForgeDirection side) {
/*  64 */     return isSideOpen(side);
/*     */   }
/*     */   
/*     */   public boolean canUpdate() {
/*  68 */     return false;
/*     */   }
/*     */   public void initialize() {
/*  71 */     Environment.class.initialize(this);
/*  72 */     EventHandler$.MODULE$.scheduleServer(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRedstoneInputChanged(RedstoneChangedEventArgs args) {
/*  78 */     RedstoneAware.class.onRedstoneInputChanged(this, args);
/*  79 */     boolean oldIsInverted = isInverted();
/*  80 */     isInverted_$eq((args.newValue() > 0));
/*  81 */     if (isInverted() != oldIsInverted) {
/*  82 */       if (isServer()) {
/*  83 */         node().remove();
/*  84 */         Network.joinOrCreateNetwork(this);
/*  85 */         PacketSender$.MODULE$.sendNetSplitterState(this);
/*  86 */         world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "tile.piston.in", 0.5F, (world()).field_73012_v.nextFloat() * 0.25F + 0.7F);
/*     */       } else {
/*     */         
/*  89 */         world().func_147471_g(x(), y(), z());
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt) {
/*  95 */     RedstoneAware.class.readFromNBTForServer(this, nbt);
/*  96 */     isInverted_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isInverted").toString()));
/*     */   }
/*     */   
/*     */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 100 */     RedstoneAware.class.writeToNBTForServer(this, nbt);
/* 101 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isInverted").toString(), isInverted());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 106 */     RedstoneAware.class.readFromNBTForClient(this, nbt);
/* 107 */     isInverted_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isInverted").toString()));
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 111 */     RedstoneAware.class.writeToNBTForClient(this, nbt);
/* 112 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isInverted").toString(), isInverted());
/*     */   }
/*     */   
/*     */   public Map<Object, Object> currentStatus()
/*     */   {
/* 117 */     Map<Object, Object> openSides = (Map)Map$.MODULE$.apply((Seq)Nil$.MODULE$);
/* 118 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new NetSplitter$$anonfun$currentStatus$1(this, openSides));
/*     */ 
/*     */     
/* 121 */     return openSides; } public final class NetSplitter$$anonfun$currentStatus$1 extends AbstractFunction1<ForgeDirection, Map<Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Map openSides$1; public NetSplitter$$anonfun$currentStatus$1(NetSplitter $outer, Map openSides$1) {} public final Map<Object, Object> apply(ForgeDirection side) {
/*     */       return (Map<Object, Object>)this.openSides$1.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(side.ordinal())), BoxesRunTime.boxToBoolean(this.$outer.isSideOpen(side))));
/*     */     } } public boolean setSide(ForgeDirection side, boolean state) {
/* 125 */     boolean previous = isSideOpen(side);
/* 126 */     setSideOpen(side, isInverted() ? (!state) : state);
/* 127 */     return (previous != state);
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(settings:table):table -- set open state (true/false) of all sides in an array; index by direction. Returns previous states")
/*     */   public Object[] setSides(Context context, Arguments args) {
/* 132 */     Map settings = args.checkTable(0);
/* 133 */     Map<Object, Object> previous = currentStatus();
/* 134 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new NetSplitter$$anonfun$setSides$1(this, settings));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { previous }));
/*     */   } public final class NetSplitter$$anonfun$setSides$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Map settings$1; public NetSplitter$$anonfun$setSides$1(NetSplitter $outer, Map settings$1) {} public final boolean apply(ForgeDirection side) { boolean bool; int ordinal = side.ordinal(); Object object = this.settings$1.get(BoxesRunTime.boxToInteger(ordinal)); if (object instanceof Boolean) { boolean bool1 = BoxesRunTime.unboxToBoolean(object); }
/*     */       else { bool = false; }
/* 148 */        boolean value = this.settings$1.containsKey(BoxesRunTime.boxToInteger(ordinal)) ? bool : false; return this.$outer.setSide(side, value); } } @Callback(direct = true, doc = "function():table -- Returns current open/close state of all sides in an array, indexed by direction.") public Object[] getSides(Context context, Arguments args) { return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { currentStatus() })); }
/*     */   
/*     */   public Object[] setSideHelper(Arguments args, boolean value) {
/* 151 */     ForgeDirection side = ForgeDirection.getOrientation(args.checkInteger(0));
/* 152 */     if (Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).contains(side))
/*     */     {
/* 154 */       return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(setSide(side, value)) })); } 
/*     */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "invalid direction" }));
/*     */   } @Callback(doc = "function(side: number):boolean -- Open the side, returns true if it changed to open.")
/*     */   public Object[] open(Context context, Arguments args) {
/* 158 */     return setSideHelper(args, true);
/*     */   } @Callback(doc = "function(side: number):boolean -- Close the side, returns true if it changed to close.")
/*     */   public Object[] close(Context context, Arguments args) {
/* 161 */     return setSideHelper(args, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\NetSplitter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */