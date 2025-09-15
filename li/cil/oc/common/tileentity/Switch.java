/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}b\001B\001\003\0015\021aaU<ji\016D'BA\002\005\003)!\030\016\\3f]RLG/\037\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M)\001AD\f\036AA\021q\"F\007\002!)\0211!\005\006\003%M\t\021\"\\5oK\016\024\030M\032;\013\003Q\t1A\\3u\023\t1\002C\001\006US2,WI\034;jif\004\"\001G\016\016\003eQ!A\007\002\002\rQ\024\030-\033;t\023\ta\022D\001\006To&$8\r\033'jW\026\004\"\001\007\020\n\005}I\"!\004(pi\006s\027\r\\={C\ndW\r\005\002\031C%\021!%\007\002\023\007>l\007o\0348f]RLeN^3oi>\024\030\020C\003%\001\021\005Q%\001\004=S:LGO\020\013\002MA\021q\005A\007\002\005!)\021\006\001C!U\005\t\022n],je\026dWm]:F]\006\024G.\0323\026\003-\002\"\001L\030\016\0035R\021AL\001\006g\016\fG.Y\005\003a5\022qAQ8pY\026\fg\016C\0033\001\021\005#&A\bjg2Kgn[3e\013:\f'\r\\3e\021\025!\004\001\"\0216\003%\031\027M\\+qI\006$X\rF\001,\021\0259\004\001\"\0059\0031\tX/Z;f\033\026\0348/Y4f)\031ID(R$M\035B\021AFO\005\003w5\022A!\0268ji\")QH\016a\001}\00511o\\;sG\026\004\"a\020\"\017\0051\002\025BA!.\003\031\001&/\0323fM&\0211\t\022\002\007'R\024\030N\\4\013\005\005k\003\"\002$7\001\004q\024a\0033fgRLg.\031;j_:DQ\001\023\034A\002%\013A\001]8siB\021AFS\005\003\0276\0221!\0238u\021\025ie\0071\001J\003)\tgn]<feB{'\017\036\005\006\037Z\002\r\001U\001\005CJ<7\017E\002-#NK!AU\027\003\013\005\023(/Y=\021\0051\"\026BA+.\005\031\te.\037*fM\")q\013\001C!1\006\001BO]=F]F,X-^3QC\016\\W\r\036\013\004We;\007\"\002.W\001\004Y\026AC:pkJ\034WmU5eKB\031A\006\0300\n\005uk#AB(qi&|g\016\005\002`K6\t\001M\003\002bE\006!Q\017^5m\025\t)1M\003\002e'\005qQ.\0338fGJ\fg\r\0364pe\036,\027B\0014a\00591uN]4f\t&\024Xm\031;j_:DQ\001\033,A\002%\fa\001]1dW\026$\bC\0016p\033\005Y'B\0017n\003\035qW\r^<pe.T!A\034\004\002\007\005\004\030.\003\002qW\n1\001+Y2lKRDQA\035\001\005RM\f1B]3mCf\004\026mY6fiR\031\021\b^;\t\013i\013\b\031A.\t\013!\f\b\031A5\t\013]\004A\021\013=\002\027=t\027\n^3n\003\022$W\r\032\013\004se\\\b\"\002>w\001\004I\025\001B:m_RDQ\001 <A\002u\fQa\035;bG.\0042A`A\002\033\005y(bAA\001#\005!\021\016^3n\023\r\t)a \002\n\023R,Wn\025;bG.Dq!!\003\001\t\023\tY!\001\007va\022\fG/\032'j[&$8\017F\003:\003\033\ty\001\003\004{\003\017\001\r!\023\005\007y\006\035\001\031A?\t\017\005M\001\001\"\025\002\026\005iqN\\%uK6\024V-\\8wK\022$R!OA\f\0033AaA_A\t\001\004I\005B\002?\002\022\001\007Q\020C\004\002\036\001!\t%a\b\002!\035,GoU5{K&sg/\0328u_JLH#A%\t\017\005\r\002\001\"\021\002&\005\021\022n]%uK64\026\r\\5e\r>\0248\013\\8u)\025Y\023qEA\025\021\031Q\030\021\005a\001\023\"1A0!\tA\002uDq!!\f\001\t\003\ny#\001\013sK\006$gI]8n\035\n#fi\034:TKJ4XM\035\013\004s\005E\002\002CA\032\003W\001\r!!\016\002\0079\024G\017\005\003\0028\005mRBAA\035\025\r\t\031$E\005\005\003{\tID\001\bO\005R#\026mZ\"p[B|WO\0343")
/*    */ public class Switch extends TileEntity implements SwitchLike, NotAnalyzable, ComponentInventory {
/*    */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*    */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual;
/*    */   private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled;
/*    */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*    */   private boolean isSizeInventoryReady;
/*    */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*    */   private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory;
/*    */   private final Buffer<Object> computers;
/*    */   private final Map<Object, Set<Object>> openPorts;
/*    */   private long lastMessage;
/*    */   
/* 17 */   private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } private final Hub.Plug[] plugs; private final Queue<Tuple2<Option<ForgeDirection>, Packet>> queue; private int maxQueueSize; private int relayDelay; private int relayAmount; private int relayCooldown; private final MovingAverage packetsPerCycleAvg; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void dispose() { ComponentInventory.class.dispose(this); } public void onConnect(Node node) { ComponentInventory.class.onConnect(this, node); } public void onDisconnect(Node node) { ComponentInventory.class.onDisconnect(this, node); } public void writeToNBTForClient(NBTTagCompound nbt) { ComponentInventory.class.writeToNBTForClient(this, nbt); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { ComponentInventory.class.readFromNBTForClient(this, nbt); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit((ComponentInventory)this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot((ComponentInventory)this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode((ComponentInventory)this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public void writeToNBTForServer(NBTTagCompound nbt) { Inventory.class.writeToNBTForServer((Inventory)this, nbt); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) { return NotAnalyzable.class.onAnalyze(this, player, side, hitX, hitY, hitZ); } public Buffer<Object> computers() { return this.computers; } public Map<Object, Set<Object>> openPorts() { return this.openPorts; } public long lastMessage() { return this.lastMessage; } public void lastMessage_$eq(long x$1) { this.lastMessage = x$1; } public void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$computers_$eq(Buffer<Object> x$1) { this.computers = x$1; } public void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$openPorts_$eq(Map<Object, Set<Object>> x$1) { this.openPorts = x$1; } public void onSwitchActivity() { SwitchLike.class.onSwitchActivity(this); } public Hub.Plug[] plugs() { return this.plugs; } public Queue<Tuple2<Option<ForgeDirection>, Packet>> queue() { return this.queue; } public int maxQueueSize() { return this.maxQueueSize; } public void maxQueueSize_$eq(int x$1) { this.maxQueueSize = x$1; } public int relayDelay() { return this.relayDelay; } public void relayDelay_$eq(int x$1) { this.relayDelay = x$1; } public int relayAmount() { return this.relayAmount; } public void relayAmount_$eq(int x$1) { this.relayAmount = x$1; } public int relayCooldown() { return this.relayCooldown; } public void relayCooldown_$eq(int x$1) { this.relayCooldown = x$1; } public MovingAverage packetsPerCycleAvg() { return this.packetsPerCycleAvg; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$plugs_$eq(Hub.Plug[] x$1) { this.plugs = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$queue_$eq(Queue<Tuple2<Option<ForgeDirection>, Packet>> x$1) { this.queue = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$packetsPerCycleAvg_$eq(MovingAverage x$1) { this.packetsPerCycleAvg = x$1; } public Node node() { return Hub.class.node((Hub)this); } public boolean isConnected() { return Hub.class.isConnected((Hub)this); } public int queueBaseSize() { return Hub.class.queueBaseSize((Hub)this); } public int queueSizePerUpgrade() { return Hub.class.queueSizePerUpgrade((Hub)this); } public int relayBaseDelay() { return Hub.class.relayBaseDelay((Hub)this); } public double relayDelayPerUpgrade() { return Hub.class.relayDelayPerUpgrade((Hub)this); } public int relayBaseAmount() { return Hub.class.relayBaseAmount((Hub)this); } public int relayAmountPerUpgrade() { return Hub.class.relayAmountPerUpgrade((Hub)this); } @SideOnly(Side.CLIENT) public boolean canConnect(ForgeDirection side) { return Hub.class.canConnect((Hub)this, side); } public Node sidedNode(ForgeDirection side) { return Hub.class.sidedNode((Hub)this, side); } public void func_145845_h() { Hub.class.updateEntity((Hub)this); } public Hub.Plug createPlug(ForgeDirection side) { return Hub.class.createPlug((Hub)this, side); } public void onPlugConnect(Hub.Plug plug, Node node) { Hub.class.onPlugConnect((Hub)this, plug, node); } public void onPlugDisconnect(Hub.Plug plug, Node node) { Hub.class.onPlugDisconnect((Hub)this, plug, node); } public void onPlugMessage(Hub.Plug plug, Message message) { Hub.class.onPlugMessage((Hub)this, plug, message); } public Node createNode(Hub.Plug plug) { return Hub.class.createNode((Hub)this, plug); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Switch() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); Hub.class.$init$((Hub)this); SwitchLike.class.$init$(this); NotAnalyzable.class.$init$(this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); } public boolean isWirelessEnabled() {
/* 18 */     return false;
/*    */   } public boolean isLinkedEnabled() {
/* 20 */     return false;
/*    */   } public boolean canUpdate() {
/* 22 */     return isServer();
/*    */   }
/*    */   
/*    */   public void queueMessage(String source, String destination, int port, int answerPort, Object[] args)
/*    */   {
/* 27 */     ((IterableLike)computers().map((Function1)new Switch$$anonfun$queueMessage$1(this), Buffer$.MODULE$.canBuildFrom())).foreach((Function1)new Switch$$anonfun$queueMessage$2(this, source, destination, port, answerPort, args)); } public final class Switch$$anonfun$queueMessage$1 extends AbstractFunction1<Object, IComputerAccess> implements Serializable { public static final long serialVersionUID = 0L; public final IComputerAccess apply(Object x$1) { return (IComputerAccess)x$1; } public Switch$$anonfun$queueMessage$1(Switch $outer) {} } public final class Switch$$anonfun$queueMessage$2 extends AbstractFunction1<IComputerAccess, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String source$1; private final String destination$1; private final int port$1; private final int answerPort$1; private final Object[] args$1; public Switch$$anonfun$queueMessage$2(Switch $outer, String source$1, String destination$1, int port$1, int answerPort$1, Object[] args$1) {} public final void apply(IComputerAccess computer) { // Byte code:
/*    */       //   0: new scala/StringContext
/*    */       //   3: dup
/*    */       //   4: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   7: iconst_3
/*    */       //   8: anewarray java/lang/String
/*    */       //   11: dup
/*    */       //   12: iconst_0
/*    */       //   13: ldc 'cc'
/*    */       //   15: aastore
/*    */       //   16: dup
/*    */       //   17: iconst_1
/*    */       //   18: ldc '_'
/*    */       //   20: aastore
/*    */       //   21: dup
/*    */       //   22: iconst_2
/*    */       //   23: ldc ''
/*    */       //   25: aastore
/*    */       //   26: checkcast [Ljava/lang/Object;
/*    */       //   29: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   32: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   35: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   38: iconst_2
/*    */       //   39: anewarray java/lang/Object
/*    */       //   42: dup
/*    */       //   43: iconst_0
/*    */       //   44: aload_1
/*    */       //   45: invokeinterface getID : ()I
/*    */       //   50: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */       //   53: aastore
/*    */       //   54: dup
/*    */       //   55: iconst_1
/*    */       //   56: aload_1
/*    */       //   57: invokeinterface getAttachmentName : ()Ljava/lang/String;
/*    */       //   62: aastore
/*    */       //   63: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   66: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   69: astore_2
/*    */       //   70: aload_0
/*    */       //   71: getfield source$1 : Ljava/lang/String;
/*    */       //   74: aload_2
/*    */       //   75: astore_3
/*    */       //   76: dup
/*    */       //   77: ifnonnull -> 88
/*    */       //   80: pop
/*    */       //   81: aload_3
/*    */       //   82: ifnull -> 280
/*    */       //   85: goto -> 95
/*    */       //   88: aload_3
/*    */       //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   92: ifne -> 280
/*    */       //   95: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */       //   98: aload_0
/*    */       //   99: getfield destination$1 : Ljava/lang/String;
/*    */       //   102: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */       //   105: new li/cil/oc/common/tileentity/Switch$$anonfun$queueMessage$2$$anonfun$apply$2
/*    */       //   108: dup
/*    */       //   109: aload_0
/*    */       //   110: aload_2
/*    */       //   111: invokespecial <init> : (Lli/cil/oc/common/tileentity/Switch$$anonfun$queueMessage$2;Ljava/lang/String;)V
/*    */       //   114: invokevirtual forall : (Lscala/Function1;)Z
/*    */       //   117: ifeq -> 280
/*    */       //   120: aload_0
/*    */       //   121: getfield $outer : Lli/cil/oc/common/tileentity/Switch;
/*    */       //   124: invokevirtual openPorts : ()Lscala/collection/mutable/Map;
/*    */       //   127: aload_1
/*    */       //   128: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   133: checkcast scala/collection/SetLike
/*    */       //   136: aload_0
/*    */       //   137: getfield port$1 : I
/*    */       //   140: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */       //   143: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */       //   148: ifeq -> 280
/*    */       //   151: aload_1
/*    */       //   152: ldc 'modem_message'
/*    */       //   154: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */       //   157: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*    */       //   160: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   163: iconst_3
/*    */       //   164: anewarray java/lang/Object
/*    */       //   167: dup
/*    */       //   168: iconst_0
/*    */       //   169: aload_1
/*    */       //   170: invokeinterface getAttachmentName : ()Ljava/lang/String;
/*    */       //   175: aastore
/*    */       //   176: dup
/*    */       //   177: iconst_1
/*    */       //   178: aload_0
/*    */       //   179: getfield port$1 : I
/*    */       //   182: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */       //   185: aastore
/*    */       //   186: dup
/*    */       //   187: iconst_2
/*    */       //   188: aload_0
/*    */       //   189: getfield answerPort$1 : I
/*    */       //   192: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */       //   195: aastore
/*    */       //   196: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   199: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*    */       //   202: checkcast scala/collection/TraversableLike
/*    */       //   205: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   208: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   211: aload_0
/*    */       //   212: getfield args$1 : [Ljava/lang/Object;
/*    */       //   215: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */       //   218: new li/cil/oc/common/tileentity/Switch$$anonfun$queueMessage$2$$anonfun$apply$3
/*    */       //   221: dup
/*    */       //   222: aload_0
/*    */       //   223: invokespecial <init> : (Lli/cil/oc/common/tileentity/Switch$$anonfun$queueMessage$2;)V
/*    */       //   226: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */       //   229: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */       //   232: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*    */       //   235: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*    */       //   238: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */       //   243: checkcast [Ljava/lang/Object;
/*    */       //   246: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */       //   249: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*    */       //   252: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */       //   255: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */       //   260: checkcast scala/collection/Seq
/*    */       //   263: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */       //   266: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*    */       //   269: invokevirtual apply : (Lscala/collection/Seq;Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */       //   272: checkcast [Ljava/lang/Object;
/*    */       //   275: invokeinterface queueEvent : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */       //   280: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #28	-> 0
/*    */       //   #29	-> 70
/*    */       //   #30	-> 151
/*    */       //   #27	-> 280
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	281	0	this	Lli/cil/oc/common/tileentity/Switch$$anonfun$queueMessage$2;
/*    */       //   0	281	1	computer	Ldan200/computercraft/api/peripheral/IComputerAccess;
/*    */       //   70	211	2	address	Ljava/lang/String; }
/*    */     public final class Switch$$anonfun$queueMessage$2$$anonfun$apply$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String address$1;
/* 29 */       public final boolean apply(String x$2) { String str = this.address$1; if (x$2 == null) { if (str != null); } else if (x$2.equals(str)) {  }
/* 30 */          } public Switch$$anonfun$queueMessage$2$$anonfun$apply$2(Switch$$anonfun$queueMessage$2 $outer, String address$1) {} } public final class Switch$$anonfun$queueMessage$2$$anonfun$apply$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object x0$1) { Object object2, object1 = x0$1;
/* 31 */         if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; object2 = new String(arrayOfByte, Charsets.UTF_8); }
/* 32 */         else { object2 = object1; }
/*    */         
/*    */         return object2; }
/*    */ 
/*    */       
/*    */       public Switch$$anonfun$queueMessage$2$$anonfun$apply$3(Switch$$anonfun$queueMessage$2 $outer) {} } }
/*    */   
/*    */   public boolean tryEnqueuePacket(Option sourceSide, Packet packet) {
/* 40 */     if (Mods$.MODULE$.ComputerCraft().isAvailable())
/* 41 */     { Option option = Predef$.MODULE$.refArrayOps(packet.data()).headOption();
/* 42 */       if (option instanceof Some) { Some some = (Some)option; Object answerPort = some.x(); if (answerPort instanceof Double) { Double double_ = (Double)answerPort; queueMessage(packet.source(), packet.destination(), packet.port(), (int)Predef$.MODULE$.Double2double(double_), (Object[])Predef$.MODULE$.refArrayOps(packet.data()).drop(1)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */           
/* 46 */           return Hub.class.tryEnqueuePacket((Hub)this, sourceSide, packet); }  }  queueMessage(packet.source(), packet.destination(), packet.port(), -1, packet.data()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return Hub.class.tryEnqueuePacket((Hub)this, sourceSide, packet);
/*    */   }
/*    */   
/*    */   public void relayPacket(Option sourceSide, Packet packet) {
/* 50 */     Hub.class.relayPacket((Hub)this, sourceSide, packet);
/* 51 */     onSwitchActivity();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onItemAdded(int slot, ItemStack stack) {
/* 57 */     ComponentInventory.class.onItemAdded(this, slot, stack);
/* 58 */     li$cil$oc$common$tileentity$Switch$$updateLimits(slot, stack);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void li$cil$oc$common$tileentity$Switch$$updateLimits(int slot, ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore_3
/*    */     //   2: aconst_null
/*    */     //   3: astore #4
/*    */     //   5: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   8: aload_2
/*    */     //   9: aload_0
/*    */     //   10: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   13: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*    */     //   16: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   19: astore #5
/*    */     //   21: aload #5
/*    */     //   23: instanceof scala/Some
/*    */     //   26: ifeq -> 126
/*    */     //   29: iconst_1
/*    */     //   30: istore_3
/*    */     //   31: aload #5
/*    */     //   33: checkcast scala/Some
/*    */     //   36: astore #4
/*    */     //   38: aload #4
/*    */     //   40: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   43: checkcast li/cil/oc/api/driver/Item
/*    */     //   46: astore #6
/*    */     //   48: aload #6
/*    */     //   50: aload_2
/*    */     //   51: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   56: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   59: invokevirtual CPU : ()Ljava/lang/String;
/*    */     //   62: astore #7
/*    */     //   64: dup
/*    */     //   65: ifnonnull -> 77
/*    */     //   68: pop
/*    */     //   69: aload #7
/*    */     //   71: ifnull -> 85
/*    */     //   74: goto -> 126
/*    */     //   77: aload #7
/*    */     //   79: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   82: ifeq -> 126
/*    */     //   85: aload_0
/*    */     //   86: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   89: iconst_1
/*    */     //   90: aload_0
/*    */     //   91: invokevirtual relayBaseDelay : ()I
/*    */     //   94: aload #6
/*    */     //   96: aload_2
/*    */     //   97: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   102: iconst_1
/*    */     //   103: iadd
/*    */     //   104: i2d
/*    */     //   105: aload_0
/*    */     //   106: invokevirtual relayDelayPerUpgrade : ()D
/*    */     //   109: dmul
/*    */     //   110: d2i
/*    */     //   111: isub
/*    */     //   112: invokevirtual max : (II)I
/*    */     //   115: invokevirtual relayDelay_$eq : (I)V
/*    */     //   118: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   121: astore #8
/*    */     //   123: goto -> 383
/*    */     //   126: iload_3
/*    */     //   127: ifeq -> 288
/*    */     //   130: aload #4
/*    */     //   132: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   135: checkcast li/cil/oc/api/driver/Item
/*    */     //   138: astore #9
/*    */     //   140: aload #9
/*    */     //   142: aload_2
/*    */     //   143: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   148: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   151: invokevirtual Memory : ()Ljava/lang/String;
/*    */     //   154: astore #10
/*    */     //   156: dup
/*    */     //   157: ifnonnull -> 169
/*    */     //   160: pop
/*    */     //   161: aload #10
/*    */     //   163: ifnull -> 177
/*    */     //   166: goto -> 288
/*    */     //   169: aload #10
/*    */     //   171: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   174: ifeq -> 288
/*    */     //   177: aload_0
/*    */     //   178: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   181: iconst_1
/*    */     //   182: aload_0
/*    */     //   183: invokevirtual relayBaseAmount : ()I
/*    */     //   186: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*    */     //   189: aload_2
/*    */     //   190: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*    */     //   193: astore #11
/*    */     //   195: aload #11
/*    */     //   197: instanceof scala/Some
/*    */     //   200: ifeq -> 252
/*    */     //   203: aload #11
/*    */     //   205: checkcast scala/Some
/*    */     //   208: astore #12
/*    */     //   210: aload #12
/*    */     //   212: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   215: checkcast li/cil/oc/common/item/traits/Delegate
/*    */     //   218: astore #13
/*    */     //   220: aload #13
/*    */     //   222: instanceof li/cil/oc/common/item/Memory
/*    */     //   225: ifeq -> 252
/*    */     //   228: aload #13
/*    */     //   230: checkcast li/cil/oc/common/item/Memory
/*    */     //   233: astore #14
/*    */     //   235: aload #14
/*    */     //   237: invokevirtual tier : ()I
/*    */     //   240: iconst_1
/*    */     //   241: iadd
/*    */     //   242: aload_0
/*    */     //   243: invokevirtual relayAmountPerUpgrade : ()I
/*    */     //   246: imul
/*    */     //   247: istore #15
/*    */     //   249: goto -> 271
/*    */     //   252: aload #9
/*    */     //   254: aload_2
/*    */     //   255: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   260: iconst_1
/*    */     //   261: iadd
/*    */     //   262: aload_0
/*    */     //   263: invokevirtual relayAmountPerUpgrade : ()I
/*    */     //   266: iconst_2
/*    */     //   267: imul
/*    */     //   268: imul
/*    */     //   269: istore #15
/*    */     //   271: iload #15
/*    */     //   273: iadd
/*    */     //   274: invokevirtual max : (II)I
/*    */     //   277: invokevirtual relayAmount_$eq : (I)V
/*    */     //   280: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   283: astore #8
/*    */     //   285: goto -> 383
/*    */     //   288: iload_3
/*    */     //   289: ifeq -> 378
/*    */     //   292: aload #4
/*    */     //   294: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   297: checkcast li/cil/oc/api/driver/Item
/*    */     //   300: astore #16
/*    */     //   302: aload #16
/*    */     //   304: aload_2
/*    */     //   305: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   310: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   313: invokevirtual HDD : ()Ljava/lang/String;
/*    */     //   316: astore #17
/*    */     //   318: dup
/*    */     //   319: ifnonnull -> 331
/*    */     //   322: pop
/*    */     //   323: aload #17
/*    */     //   325: ifnull -> 339
/*    */     //   328: goto -> 378
/*    */     //   331: aload #17
/*    */     //   333: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   336: ifeq -> 378
/*    */     //   339: aload_0
/*    */     //   340: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   343: iconst_1
/*    */     //   344: aload_0
/*    */     //   345: invokevirtual queueBaseSize : ()I
/*    */     //   348: aload #16
/*    */     //   350: aload_2
/*    */     //   351: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   356: iconst_1
/*    */     //   357: iadd
/*    */     //   358: aload_0
/*    */     //   359: invokevirtual queueSizePerUpgrade : ()I
/*    */     //   362: imul
/*    */     //   363: iadd
/*    */     //   364: invokevirtual max : (II)I
/*    */     //   367: invokevirtual maxQueueSize_$eq : (I)V
/*    */     //   370: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   373: astore #8
/*    */     //   375: goto -> 383
/*    */     //   378: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   381: astore #8
/*    */     //   383: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 0
/*    */     //   #62	-> 5
/*    */     //   #63	-> 21
/*    */     //   #64	-> 85
/*    */     //   #62	-> 126
/*    */     //   #65	-> 130
/*    */     //   #66	-> 177
/*    */     //   #67	-> 195
/*    */     //   #68	-> 252
/*    */     //   #66	-> 271
/*    */     //   #62	-> 288
/*    */     //   #70	-> 292
/*    */     //   #71	-> 339
/*    */     //   #72	-> 378
/*    */     //   #62	-> 383
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	384	0	this	Lli/cil/oc/common/tileentity/Switch;
/*    */     //   0	384	1	slot	I
/*    */     //   0	384	2	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   48	336	6	driver	Lli/cil/oc/api/driver/Item;
/*    */     //   140	244	9	driver	Lli/cil/oc/api/driver/Item;
/*    */     //   220	164	13	ram	Lli/cil/oc/common/item/traits/Delegate;
/*    */     //   302	82	16	driver	Lli/cil/oc/api/driver/Item;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onItemRemoved(int slot, ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iload_1
/*    */     //   2: aload_2
/*    */     //   3: invokestatic onItemRemoved : (Lli/cil/oc/common/tileentity/traits/ComponentInventory;ILnet/minecraft/item/ItemStack;)V
/*    */     //   6: aload_2
/*    */     //   7: aload_0
/*    */     //   8: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   11: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*    */     //   14: astore_3
/*    */     //   15: aload_3
/*    */     //   16: aload_2
/*    */     //   17: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   22: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   25: invokevirtual CPU : ()Ljava/lang/String;
/*    */     //   28: astore #4
/*    */     //   30: dup
/*    */     //   31: ifnonnull -> 43
/*    */     //   34: pop
/*    */     //   35: aload #4
/*    */     //   37: ifnull -> 51
/*    */     //   40: goto -> 67
/*    */     //   43: aload #4
/*    */     //   45: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   48: ifeq -> 67
/*    */     //   51: aload_0
/*    */     //   52: aload_0
/*    */     //   53: invokevirtual relayBaseDelay : ()I
/*    */     //   56: invokevirtual relayDelay_$eq : (I)V
/*    */     //   59: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   62: astore #5
/*    */     //   64: goto -> 168
/*    */     //   67: aload_3
/*    */     //   68: aload_2
/*    */     //   69: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   74: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   77: invokevirtual Memory : ()Ljava/lang/String;
/*    */     //   80: astore #6
/*    */     //   82: dup
/*    */     //   83: ifnonnull -> 95
/*    */     //   86: pop
/*    */     //   87: aload #6
/*    */     //   89: ifnull -> 103
/*    */     //   92: goto -> 119
/*    */     //   95: aload #6
/*    */     //   97: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   100: ifeq -> 119
/*    */     //   103: aload_0
/*    */     //   104: aload_0
/*    */     //   105: invokevirtual relayBaseAmount : ()I
/*    */     //   108: invokevirtual relayAmount_$eq : (I)V
/*    */     //   111: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   114: astore #5
/*    */     //   116: goto -> 168
/*    */     //   119: aload_3
/*    */     //   120: aload_2
/*    */     //   121: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   126: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   129: invokevirtual HDD : ()Ljava/lang/String;
/*    */     //   132: astore #7
/*    */     //   134: dup
/*    */     //   135: ifnonnull -> 147
/*    */     //   138: pop
/*    */     //   139: aload #7
/*    */     //   141: ifnull -> 155
/*    */     //   144: goto -> 169
/*    */     //   147: aload #7
/*    */     //   149: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   152: ifeq -> 169
/*    */     //   155: aload_0
/*    */     //   156: aload_0
/*    */     //   157: invokevirtual queueBaseSize : ()I
/*    */     //   160: invokevirtual maxQueueSize_$eq : (I)V
/*    */     //   163: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   166: astore #5
/*    */     //   168: return
/*    */     //   169: new scala/MatchError
/*    */     //   172: dup
/*    */     //   173: aload_3
/*    */     //   174: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   177: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #77	-> 0
/*    */     //   #78	-> 6
/*    */     //   #79	-> 15
/*    */     //   #80	-> 67
/*    */     //   #81	-> 119
/*    */     //   #76	-> 168
/*    */     //   #78	-> 169
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	178	0	this	Lli/cil/oc/common/tileentity/Switch;
/*    */     //   0	178	1	slot	I
/*    */     //   0	178	2	stack	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_70302_i_() {
/* 85 */     return (InventorySlots$.MODULE$.switch()).length;
/*    */   }
/*    */   
/* 88 */   public boolean func_94041_b(int slot, ItemStack stack) { return BoxesRunTime.unboxToBoolean(Option$.MODULE$.apply(Driver.driverFor(stack, getClass())).fold((Function0)new Switch$$anonfun$isItemValidForSlot$1(this), (Function1)new Switch$$anonfun$isItemValidForSlot$2(this, slot, stack))); } public final class Switch$$anonfun$isItemValidForSlot$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; }
/*    */      public Switch$$anonfun$isItemValidForSlot$1(Switch $outer) {} }
/*    */   
/*    */   public final class Switch$$anonfun$isItemValidForSlot$2 extends AbstractFunction1<Item, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int slot$1; private final ItemStack stack$1;
/*    */     public Switch$$anonfun$isItemValidForSlot$2(Switch $outer, int slot$1, ItemStack stack$1) {}
/*    */     public final boolean apply(Item driver) {
/*    */       // Byte code:
/*    */       //   0: getstatic li/cil/oc/common/InventorySlots$.MODULE$ : Lli/cil/oc/common/InventorySlots$;
/*    */       //   3: invokevirtual switch : ()[Lli/cil/oc/common/InventorySlots$InventorySlot;
/*    */       //   6: aload_0
/*    */       //   7: getfield slot$1 : I
/*    */       //   10: aaload
/*    */       //   11: astore_2
/*    */       //   12: aload_1
/*    */       //   13: aload_0
/*    */       //   14: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*    */       //   17: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */       //   22: aload_2
/*    */       //   23: invokevirtual slot : ()Ljava/lang/String;
/*    */       //   26: astore_3
/*    */       //   27: dup
/*    */       //   28: ifnonnull -> 39
/*    */       //   31: pop
/*    */       //   32: aload_3
/*    */       //   33: ifnull -> 46
/*    */       //   36: goto -> 67
/*    */       //   39: aload_3
/*    */       //   40: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   43: ifeq -> 67
/*    */       //   46: aload_1
/*    */       //   47: aload_0
/*    */       //   48: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*    */       //   51: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */       //   56: aload_2
/*    */       //   57: invokevirtual tier : ()I
/*    */       //   60: if_icmpgt -> 67
/*    */       //   63: iconst_1
/*    */       //   64: goto -> 68
/*    */       //   67: iconst_0
/*    */       //   68: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #89	-> 0
/*    */       //   #90	-> 12
/*    */       //   #88	-> 68
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	69	0	this	Lli/cil/oc/common/tileentity/Switch$$anonfun$isItemValidForSlot$2;
/*    */       //   0	69	1	driver	Lli/cil/oc/api/driver/Item;
/*    */       //   12	57	2	provided	Lli/cil/oc/common/InventorySlots$InventorySlot;
/*    */     } }
/* 96 */   public void readFromNBTForServer(NBTTagCompound nbt) { Inventory.class.readFromNBTForServer((Inventory)this, nbt);
/* 97 */     Predef$.MODULE$.refArrayOps((Object[])items()).indices().foreach((Function1)new Switch$$anonfun$readFromNBTForServer$1(this)); } public final class Switch$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<Object, Option<BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<BoxedUnit> apply(int slot) { return this.$outer.items()[slot].collect((PartialFunction)new Switch$$anonfun$readFromNBTForServer$1$$anonfun$apply$1(this, slot)); } public Switch$$anonfun$readFromNBTForServer$1(Switch $outer) {} public final class Switch$$anonfun$readFromNBTForServer$1$$anonfun$apply$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final int slot$2; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { ItemStack itemStack = x1;
/* 98 */         this.$outer.li$cil$oc$common$tileentity$Switch$$anonfun$$$outer().li$cil$oc$common$tileentity$Switch$$updateLimits(this.slot$2, itemStack); return (B1)BoxedUnit.UNIT; }
/*    */ 
/*    */       
/*    */       public final boolean isDefinedAt(ItemStack x1) {
/*    */         ItemStack itemStack = x1;
/*    */         return true;
/*    */       }
/*    */       
/*    */       public Switch$$anonfun$readFromNBTForServer$1$$anonfun$apply$1(Switch$$anonfun$readFromNBTForServer$1 $outer, int slot$2) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */