/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.tileentity.traits.ComponentInventory;
/*     */ import li.cil.oc.common.tileentity.traits.Environment;
/*     */ import li.cil.oc.common.tileentity.traits.Inventory;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ import scala.Tuple2;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tMa\001B\001\003\0015\021q!\0213baR,'O\003\002\004\t\005QA/\0337fK:$\030\016^=\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\002\002\001\b\030;\001\0323\006\r\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\tQA+\0337f\013:$\030\016^=\021\005aYR\"A\r\013\005i\021\021A\002;sC&$8/\003\002\0353\tYQI\034<je>tW.\0328u!\tAb$\003\002 3\t\0212i\\7q_:,g\016^%om\026tGo\034:z!\tA\022%\003\002#3\tIq\n]3o'&$Wm\035\t\003I%j\021!\n\006\003M\035\nqA\\3uo>\0248N\003\002)\r\005\031\021\r]5\n\005)*#AC!oC2L(0\0312mKB\021AfL\007\002[)\021afJ\001\tS:$XM\0358bY&\021\021!\f\t\003cQj\021A\r\006\003g\035\na\001\032:jm\026\024\030BA\0333\005)!UM^5dK&sgm\034\005\006o\001!\t\001O\001\007y%t\027\016\036 \025\003e\002\"A\017\001\016\003\tAq\001\020\001C\002\023\005Q(\001\003o_\022,W#\001 \021\005\021z\024B\001!&\005\021qu\016Z3\t\r\t\003\001\025!\003?\003\025qw\016Z3!\021\035!\005A1A\005\n\025\013aA\0317pG.\034X#\001$\021\007\035SE*D\001I\025\005I\025!B:dC2\f\027BA&I\005\025\t%O]1z!\r9UjT\005\003\035\"\023aa\0249uS>t\007\003B$Q%VK!!\025%\003\rQ+\b\017\\33!\t!3+\003\002UK\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t\td+\003\002Xe\tQ1+\0333fI\ncwnY6\t\re\003\001\025!\003G\003\035\021Gn\\2lg\002Bqa\027\001C\002\023%A,\001\bva\022\fG/\0338h\0052|7m[:\026\003u\0032AX2S\033\005y&B\0011b\003\035iW\017^1cY\026T!A\031%\002\025\r|G\016\\3di&|g.\003\002e?\nY\021I\035:bs\n+hMZ3s\021\0311\007\001)A\005;\006yQ\017\0353bi&twM\0217pG.\034\b\005C\004i\001\t\007I\021B5\002\025\tdwnY6t\t\006$\030-F\001k!\r9%j\033\t\004\0176c\007CA7o\033\005\001a\001B8\001\tA\024\021B\0217pG.$\025\r^1\024\0059\f\bCA$s\023\t\031\bJ\001\004B]f\024VM\032\005\tk:\024)\031!C\001m\006!a.Y7f+\0059\bC\001=|\035\t9\0250\003\002{\021\0061\001K]3eK\032L!\001`?\003\rM#(/\0338h\025\tQ\b\n\003\005\000]\n\005\t\025!\003x\003\025q\027-\\3!\021)\t\031A\034BC\002\023\005\021QA\001\005I\006$\030-\006\002\002\bA!\021\021BA\b\033\t\tYAC\002\002\016E\t1A\0342u\023\021\t\t\"a\003\003\0359\023E\013V1h\007>l\007o\\;oI\"Q\021Q\0038\003\002\003\006I!a\002\002\013\021\fG/\031\021\t\r]rG\021AA\r)\025a\0271DA\017\021\031)\030q\003a\001o\"A\0211AA\f\001\004\t9\001C\004\002\"\001\001\013\021\0026\002\027\tdwnY6t\t\006$\030\r\t\005\013\003K\001\001R1A\005\016\005\035\022A\0033fm&\034W-\0238g_V\021\021\021\006\t\t\003W\t\t$!\016\00265\021\021Q\006\006\004\003_\t\027!C5n[V$\030M\0317f\023\021\t\031$!\f\003\0075\013\007\017\005\003\0028\005\005SBAA\035\025\021\tY$!\020\002\t1\fgn\032\006\003\003\tAA[1wC&\031A0!\017\t\025\005\025\003\001#A!B\033\tI#A\006eKZL7-Z%oM>\004\003bBA%\001\021\005\0231J\001\016O\026$H)\032<jG\026LeNZ8\025\005\0055\003CBA(\003+:x/\004\002\002R)!\0211KA\037\003\021)H/\0337\n\t\005M\022\021\013\005\b\0033\002A\021KA.\0031!WMZ1vYR\034F/\031;f+\t\ti\006E\002H\003?J1!!\031I\005\035\021un\0347fC:Dq!!\032\001\t\003\n9'A\006tKR\034\026\016Z3Pa\026tGCBA5\003_\n\031\tE\002H\003WJ1!!\034I\005\021)f.\033;\t\021\005E\0241\ra\001\003g\nAa]5eKB!\021QOA@\033\t\t9H\003\003\002T\005e$bA\003\002|)\031\021QP\n\002\0355Lg.Z2sC\032$hm\034:hK&!\021\021QA<\00591uN]4f\t&\024Xm\031;j_:D\001\"!\"\002d\001\007\021QL\001\006m\006dW/\032\005\b\003\023\003A\021IAF\003%yg.\0218bYfTX\r\006\007\002\016\006=\025\021UAU\003g\0139\fE\002H\025zB\001\"!%\002\b\002\007\0211S\001\007a2\f\0270\032:\021\t\005U\025QT\007\003\003/SA!!%\002\032*\031\0211T\t\002\r\025tG/\033;z\023\021\ty*a&\003\031\025sG/\033;z!2\f\0270\032:\t\021\005E\024q\021a\001\003G\0032aRAS\023\r\t9\013\023\002\004\023:$\b\002CAV\003\017\003\r!!,\002\t!LG\017\027\t\004\017\006=\026bAAY\021\n)a\t\\8bi\"A\021QWAD\001\004\ti+\001\003iSRL\006\002CA]\003\017\003\r!!,\002\t!LGO\027\005\b\003{\003A\021IA`\003%\031\027M\\+qI\006$X\r\006\002\002^!9\0211\031\001\005B\005\025\027\001D;qI\006$X-\0228uSRLHCAA5\021\035\tI\r\001C\001\003\027\fqB\\3jO\"\024wN]\"iC:<W\r\032\013\005\003S\ni\r\003\005\002P\006\035\007\031AA:\003\005!\007bBAe\001\021\005\021Q\031\005\b\003+\004A\021IAl\003%ygnQ8o]\026\034G\017\006\003\002j\005e\007B\002\037\002T\002\007a\bC\004\002^\002!\t%a8\002\031=tG)[:d_:tWm\031;\025\t\005%\024\021\035\005\007y\005m\007\031\001 \t\017\005\025\b\001\"\021\002h\006\001r-\032;TSj,\027J\034<f]R|'/\037\013\003\003GCq!a;\001\t\003\ni/\001\njg&#X-\034,bY&$gi\034:TY>$HCBA/\003_\f\031\020\003\005\002r\006%\b\031AAR\003\021\031Hn\034;\t\021\005U\030\021\036a\001\003o\fQa\035;bG.\004B!!?\002\0006\021\0211 \006\004\003{\f\022\001B5uK6LAA!\001\002|\nI\021\n^3n'R\f7m\033\005\b\005\013\001A\021\tB\004\003Q\021X-\0313Ge>lgJ\021+G_J\034VM\035<feR!\021\021\016B\005\021!\tiAa\001A\002\005\035\001b\002B\007\001\021\005#qB\001\024oJLG/\032+p\035\n#fi\034:TKJ4XM\035\013\005\003S\022\t\002\003\005\002\016\t-\001\031AA\004\001")
/*     */ public class Adapter extends TileEntity implements ComponentInventory, OpenSides, Analyzable, Adapter, DeviceInfo {
/*     */   private final Node node;
/*     */   private final Option<Tuple2<ManagedEnvironment, SidedBlock>>[] li$cil$oc$common$tileentity$Adapter$$blocks;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingBlocks;
/*     */   private final Option<BlockData>[] li$cil$oc$common$tileentity$Adapter$$blocksData;
/*     */   private Map<String, String> deviceInfo;
/*     */   private boolean[] openSides;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual;
/*     */   
/*  27 */   public boolean[] openSides() { return this.openSides; } private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components; private boolean isSizeInventoryReady; private final ArrayBuffer<ManagedEnvironment> updatingComponents; private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; public void openSides_$eq(boolean[] x$1) { this.openSides = x$1; } public int SideCount() { return OpenSides.class.SideCount(this); } public byte compressSides() { return OpenSides.class.compressSides(this); } public boolean[] uncompressSides(byte byte) { return OpenSides.class.uncompressSides(this, byte); } public boolean isSideOpen(ForgeDirection side) { return OpenSides.class.isSideOpen(this, side); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { OpenSides.class.readFromNBTForClient(this, nbt); } public void writeToNBTForClient(NBTTagCompound nbt) { OpenSides.class.writeToNBTForClient(this, nbt); } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void onItemAdded(int slot, ItemStack stack) { ComponentInventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { ComponentInventory.class.onItemRemoved(this, slot, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void dispose() { ComponentInventory.class.dispose(this); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit((ComponentInventory)this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot((ComponentInventory)this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode((ComponentInventory)this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public boolean isConnected() { return Environment.class.isConnected((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Adapter() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); OpenSides.class.$init$(this);
/*  28 */     this.node = Network.newNode((Environment)this, Visibility.Network).create();
/*     */     
/*  30 */     this.li$cil$oc$common$tileentity$Adapter$$blocks = (Option<Tuple2<ManagedEnvironment, SidedBlock>>[])Array$.MODULE$.fill(6, (Function0)new Adapter$$anonfun$1(this), ClassTag$.MODULE$.apply(Option.class));
/*     */     
/*  32 */     this.updatingBlocks = (ArrayBuffer<ManagedEnvironment>)ArrayBuffer$.MODULE$.empty();
/*     */     
/*  34 */     this.li$cil$oc$common$tileentity$Adapter$$blocksData = (Option<BlockData>[])Array$.MODULE$.fill(6, (Function0)new Adapter$$anonfun$2(this), ClassTag$.MODULE$.apply(Option.class)); } public Node node() { return this.node; } public Option<Tuple2<ManagedEnvironment, SidedBlock>>[] li$cil$oc$common$tileentity$Adapter$$blocks() { return this.li$cil$oc$common$tileentity$Adapter$$blocks; } public final class Adapter$$anonfun$1 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; } public Adapter$$anonfun$1(Adapter $outer) {} } private ArrayBuffer<ManagedEnvironment> updatingBlocks() { return this.updatingBlocks; } public Option<BlockData>[] li$cil$oc$common$tileentity$Adapter$$blocksData() { return this.li$cil$oc$common$tileentity$Adapter$$blocksData; } public final class Adapter$$anonfun$2 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; }
/*     */      public Adapter$$anonfun$2(Adapter $outer) {} }
/*  36 */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  37 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "bus");
/*  38 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Adapter");
/*  39 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  40 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Multiplug Ext.1"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*  43 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   public boolean defaultState() {
/*  47 */     return true;
/*     */   }
/*     */   public void setSideOpen(ForgeDirection side, boolean value) {
/*  50 */     OpenSides.class.setSideOpen(this, side, value);
/*  51 */     if (isServer()) {
/*  52 */       PacketSender$.MODULE$.sendAdapterState(this);
/*  53 */       world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "tile.piston.out", 0.5F, (world()).field_73012_v.nextFloat() * 0.25F + 0.7F);
/*  54 */       world().func_147459_d(x(), y(), z(), block());
/*  55 */       neighborChanged(side);
/*     */     } else {
/*  57 */       world().func_147471_g(x(), y(), z());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ)
/*     */   {
/*  64 */     return (Node[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])li$cil$oc$common$tileentity$Adapter$$blocks()).collect((PartialFunction)new Adapter$$anonfun$onAnalyze$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Node.class))))
/*     */       
/*  66 */       .$plus$plus(
/*  67 */         (GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new Adapter$$anonfun$onAnalyze$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Node.class)))), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Node.class))); } public final class Adapter$$anonfun$onAnalyze$1 extends AbstractPartialFunction<Option<Tuple2<ManagedEnvironment, SidedBlock>>, Node> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<Tuple2<ManagedEnvironment, SidedBlock>>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; Tuple2 tuple2 = (Tuple2)some.x(); if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._1(); return (B1)environment.node(); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; Tuple2 tuple2 = (Tuple2)some.x(); if (tuple2 != null) return true;  }  return false; } public Adapter$$anonfun$onAnalyze$1(Adapter $outer) {} } public final class Adapter$$anonfun$onAnalyze$2 extends AbstractPartialFunction<Option<ManagedEnvironment>, Node> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x2, Function1 default) { Object object; Option option = x2;
/*  68 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); object = environment.node(); } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Option x2) { boolean bool; Option option = x2; if (option instanceof Some) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*     */       
/*     */       return bool; }
/*     */      public Adapter$$anonfun$onAnalyze$2(Adapter $outer) {} } public boolean canUpdate() {
/*  74 */     return isServer();
/*     */   }
/*     */   
/*  77 */   public void func_145845_h() { Environment.class.updateEntity((Environment)this);
/*  78 */     if (updatingBlocks().nonEmpty())
/*  79 */       updatingBlocks().foreach((Function1)new Adapter$$anonfun$updateEntity$1(this));  } public final class Adapter$$anonfun$updateEntity$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Adapter$$anonfun$updateEntity$1(Adapter $outer) {} public final void apply(ManagedEnvironment block) {
/*  80 */       block.update();
/*     */     } }
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
/*     */   public void neighborChanged(ForgeDirection d) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   4: ifnull -> 944
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   11: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   16: ifnull -> 944
/*     */     //   19: new scala/Tuple3
/*     */     //   22: dup
/*     */     //   23: aload_0
/*     */     //   24: invokevirtual x : ()I
/*     */     //   27: aload_1
/*     */     //   28: getfield offsetX : I
/*     */     //   31: iadd
/*     */     //   32: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   35: aload_0
/*     */     //   36: invokevirtual y : ()I
/*     */     //   39: aload_1
/*     */     //   40: getfield offsetY : I
/*     */     //   43: iadd
/*     */     //   44: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   47: aload_0
/*     */     //   48: invokevirtual z : ()I
/*     */     //   51: aload_1
/*     */     //   52: getfield offsetZ : I
/*     */     //   55: iadd
/*     */     //   56: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   59: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   62: astore_3
/*     */     //   63: aload_3
/*     */     //   64: ifnull -> 945
/*     */     //   67: aload_3
/*     */     //   68: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   71: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   74: istore #4
/*     */     //   76: aload_3
/*     */     //   77: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   80: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   83: istore #5
/*     */     //   85: aload_3
/*     */     //   86: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   89: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   92: istore #6
/*     */     //   94: new scala/Tuple3
/*     */     //   97: dup
/*     */     //   98: iload #4
/*     */     //   100: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   103: iload #5
/*     */     //   105: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   108: iload #6
/*     */     //   110: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   113: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   116: astore #7
/*     */     //   118: aload #7
/*     */     //   120: astore_2
/*     */     //   121: aload_2
/*     */     //   122: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   125: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   128: istore #8
/*     */     //   130: aload_2
/*     */     //   131: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   134: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   137: istore #9
/*     */     //   139: aload_2
/*     */     //   140: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   143: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   146: istore #10
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   152: iload #8
/*     */     //   154: iload #9
/*     */     //   156: iload #10
/*     */     //   158: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   161: astore #11
/*     */     //   163: aload #11
/*     */     //   165: instanceof li/cil/oc/common/tileentity/traits/Environment
/*     */     //   168: ifeq -> 179
/*     */     //   171: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   174: astore #12
/*     */     //   176: goto -> 944
/*     */     //   179: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   182: aload_0
/*     */     //   183: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   186: iload #8
/*     */     //   188: iload #9
/*     */     //   190: iload #10
/*     */     //   192: aload_1
/*     */     //   193: invokestatic driverFor : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   196: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   199: astore #13
/*     */     //   201: aload #13
/*     */     //   203: instanceof scala/Some
/*     */     //   206: ifeq -> 783
/*     */     //   209: aload #13
/*     */     //   211: checkcast scala/Some
/*     */     //   214: astore #14
/*     */     //   216: aload #14
/*     */     //   218: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   221: checkcast li/cil/oc/api/driver/SidedBlock
/*     */     //   224: astore #15
/*     */     //   226: aload_0
/*     */     //   227: aload_1
/*     */     //   228: invokevirtual isSideOpen : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   231: ifeq -> 783
/*     */     //   234: aload_0
/*     */     //   235: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   238: aload_1
/*     */     //   239: invokevirtual ordinal : ()I
/*     */     //   242: aaload
/*     */     //   243: astore #17
/*     */     //   245: aload #17
/*     */     //   247: instanceof scala/Some
/*     */     //   250: ifeq -> 525
/*     */     //   253: aload #17
/*     */     //   255: checkcast scala/Some
/*     */     //   258: astore #18
/*     */     //   260: aload #18
/*     */     //   262: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   265: checkcast scala/Tuple2
/*     */     //   268: astore #19
/*     */     //   270: aload #19
/*     */     //   272: ifnull -> 525
/*     */     //   275: aload #19
/*     */     //   277: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   280: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   283: astore #20
/*     */     //   285: aload #19
/*     */     //   287: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   290: checkcast li/cil/oc/api/driver/SidedBlock
/*     */     //   293: astore #21
/*     */     //   295: aload #15
/*     */     //   297: aload #21
/*     */     //   299: astore #23
/*     */     //   301: dup
/*     */     //   302: ifnonnull -> 314
/*     */     //   305: pop
/*     */     //   306: aload #23
/*     */     //   308: ifnull -> 322
/*     */     //   311: goto -> 328
/*     */     //   314: aload #23
/*     */     //   316: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   319: ifeq -> 328
/*     */     //   322: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   325: goto -> 520
/*     */     //   328: aload_0
/*     */     //   329: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   332: aload_1
/*     */     //   333: invokevirtual ordinal : ()I
/*     */     //   336: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   339: aastore
/*     */     //   340: aload_0
/*     */     //   341: invokespecial updatingBlocks : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   344: aload #20
/*     */     //   346: invokevirtual $minus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   349: pop
/*     */     //   350: aload_0
/*     */     //   351: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */     //   354: aload_1
/*     */     //   355: invokevirtual ordinal : ()I
/*     */     //   358: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   361: aastore
/*     */     //   362: aload_0
/*     */     //   363: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   366: aload #20
/*     */     //   368: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   373: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   378: aload #15
/*     */     //   380: aload_0
/*     */     //   381: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   384: iload #8
/*     */     //   386: iload #9
/*     */     //   388: iload #10
/*     */     //   390: aload_1
/*     */     //   391: invokeinterface createEnvironment : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   396: astore #24
/*     */     //   398: aload #24
/*     */     //   400: ifnonnull -> 409
/*     */     //   403: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   406: goto -> 520
/*     */     //   409: aload_0
/*     */     //   410: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   413: aload_1
/*     */     //   414: invokevirtual ordinal : ()I
/*     */     //   417: new scala/Some
/*     */     //   420: dup
/*     */     //   421: new scala/Tuple2
/*     */     //   424: dup
/*     */     //   425: aload #24
/*     */     //   427: aload #15
/*     */     //   429: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   432: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   435: aastore
/*     */     //   436: aload #24
/*     */     //   438: invokeinterface canUpdate : ()Z
/*     */     //   443: ifeq -> 458
/*     */     //   446: aload_0
/*     */     //   447: invokespecial updatingBlocks : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   450: aload #24
/*     */     //   452: invokevirtual $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/ArrayBuffer;
/*     */     //   455: goto -> 461
/*     */     //   458: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   461: pop
/*     */     //   462: aload_0
/*     */     //   463: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */     //   466: aload_1
/*     */     //   467: invokevirtual ordinal : ()I
/*     */     //   470: new scala/Some
/*     */     //   473: dup
/*     */     //   474: new li/cil/oc/common/tileentity/Adapter$BlockData
/*     */     //   477: dup
/*     */     //   478: aload_0
/*     */     //   479: aload #24
/*     */     //   481: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   484: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   487: new net/minecraft/nbt/NBTTagCompound
/*     */     //   490: dup
/*     */     //   491: invokespecial <init> : ()V
/*     */     //   494: invokespecial <init> : (Lli/cil/oc/common/tileentity/Adapter;Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   497: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   500: aastore
/*     */     //   501: aload_0
/*     */     //   502: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   505: aload #24
/*     */     //   507: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   512: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   517: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   520: astore #22
/*     */     //   522: goto -> 774
/*     */     //   525: aload_0
/*     */     //   526: aload_1
/*     */     //   527: invokevirtual isSideOpen : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   530: ifeq -> 782
/*     */     //   533: aload #15
/*     */     //   535: aload_0
/*     */     //   536: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   539: iload #8
/*     */     //   541: iload #9
/*     */     //   543: iload #10
/*     */     //   545: aload_1
/*     */     //   546: invokeinterface createEnvironment : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   551: astore #25
/*     */     //   553: aload #25
/*     */     //   555: ifnonnull -> 564
/*     */     //   558: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   561: goto -> 772
/*     */     //   564: aload_0
/*     */     //   565: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   568: aload_1
/*     */     //   569: invokevirtual ordinal : ()I
/*     */     //   572: new scala/Some
/*     */     //   575: dup
/*     */     //   576: new scala/Tuple2
/*     */     //   579: dup
/*     */     //   580: aload #25
/*     */     //   582: aload #15
/*     */     //   584: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   587: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   590: aastore
/*     */     //   591: aload #25
/*     */     //   593: invokeinterface canUpdate : ()Z
/*     */     //   598: ifeq -> 613
/*     */     //   601: aload_0
/*     */     //   602: invokespecial updatingBlocks : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   605: aload #25
/*     */     //   607: invokevirtual $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/ArrayBuffer;
/*     */     //   610: goto -> 616
/*     */     //   613: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   616: pop
/*     */     //   617: aload_0
/*     */     //   618: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */     //   621: aload_1
/*     */     //   622: invokevirtual ordinal : ()I
/*     */     //   625: aaload
/*     */     //   626: astore #26
/*     */     //   628: aload #26
/*     */     //   630: instanceof scala/Some
/*     */     //   633: ifeq -> 709
/*     */     //   636: aload #26
/*     */     //   638: checkcast scala/Some
/*     */     //   641: astore #27
/*     */     //   643: aload #27
/*     */     //   645: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   648: checkcast li/cil/oc/common/tileentity/Adapter$BlockData
/*     */     //   651: astore #28
/*     */     //   653: aload #28
/*     */     //   655: invokevirtual name : ()Ljava/lang/String;
/*     */     //   658: aload #25
/*     */     //   660: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   663: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   666: astore #29
/*     */     //   668: dup
/*     */     //   669: ifnonnull -> 681
/*     */     //   672: pop
/*     */     //   673: aload #29
/*     */     //   675: ifnull -> 689
/*     */     //   678: goto -> 709
/*     */     //   681: aload #29
/*     */     //   683: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   686: ifeq -> 709
/*     */     //   689: aload #25
/*     */     //   691: aload #28
/*     */     //   693: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   696: invokeinterface load : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   701: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   704: astore #30
/*     */     //   706: goto -> 714
/*     */     //   709: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   712: astore #30
/*     */     //   714: aload_0
/*     */     //   715: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */     //   718: aload_1
/*     */     //   719: invokevirtual ordinal : ()I
/*     */     //   722: new scala/Some
/*     */     //   725: dup
/*     */     //   726: new li/cil/oc/common/tileentity/Adapter$BlockData
/*     */     //   729: dup
/*     */     //   730: aload_0
/*     */     //   731: aload #25
/*     */     //   733: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   736: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   739: new net/minecraft/nbt/NBTTagCompound
/*     */     //   742: dup
/*     */     //   743: invokespecial <init> : ()V
/*     */     //   746: invokespecial <init> : (Lli/cil/oc/common/tileentity/Adapter;Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   749: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   752: aastore
/*     */     //   753: aload_0
/*     */     //   754: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   757: aload #25
/*     */     //   759: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   764: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   769: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   772: astore #22
/*     */     //   774: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   777: astore #16
/*     */     //   779: goto -> 939
/*     */     //   782: return
/*     */     //   783: aload_0
/*     */     //   784: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   787: aload_1
/*     */     //   788: invokevirtual ordinal : ()I
/*     */     //   791: aaload
/*     */     //   792: astore #31
/*     */     //   794: aload #31
/*     */     //   796: instanceof scala/Some
/*     */     //   799: ifeq -> 929
/*     */     //   802: aload #31
/*     */     //   804: checkcast scala/Some
/*     */     //   807: astore #32
/*     */     //   809: aload #32
/*     */     //   811: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   814: checkcast scala/Tuple2
/*     */     //   817: astore #33
/*     */     //   819: aload #33
/*     */     //   821: ifnull -> 929
/*     */     //   824: aload #33
/*     */     //   826: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   829: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   832: astore #34
/*     */     //   834: aload_0
/*     */     //   835: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   838: aload #34
/*     */     //   840: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   845: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   850: aload #34
/*     */     //   852: aload_0
/*     */     //   853: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */     //   856: aload_1
/*     */     //   857: invokevirtual ordinal : ()I
/*     */     //   860: aaload
/*     */     //   861: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   864: checkcast li/cil/oc/common/tileentity/Adapter$BlockData
/*     */     //   867: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   870: invokeinterface save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   875: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   878: aload #34
/*     */     //   880: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   885: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   888: new li/cil/oc/common/tileentity/Adapter$$anonfun$neighborChanged$1
/*     */     //   891: dup
/*     */     //   892: aload_0
/*     */     //   893: invokespecial <init> : (Lli/cil/oc/common/tileentity/Adapter;)V
/*     */     //   896: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   899: aload_0
/*     */     //   900: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */     //   903: aload_1
/*     */     //   904: invokevirtual ordinal : ()I
/*     */     //   907: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   910: aastore
/*     */     //   911: aload_0
/*     */     //   912: invokespecial updatingBlocks : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   915: aload #34
/*     */     //   917: invokevirtual $minus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   920: pop
/*     */     //   921: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   924: astore #35
/*     */     //   926: goto -> 934
/*     */     //   929: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   932: astore #35
/*     */     //   934: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   937: astore #16
/*     */     //   939: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   942: astore #12
/*     */     //   944: return
/*     */     //   945: new scala/MatchError
/*     */     //   948: dup
/*     */     //   949: aload_3
/*     */     //   950: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   953: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 0
/*     */     //   #87	-> 19
/*     */     //   #88	-> 148
/*     */     //   #89	-> 163
/*     */     //   #96	-> 179
/*     */     //   #97	-> 201
/*     */     //   #98	-> 245
/*     */     //   #99	-> 295
/*     */     //   #101	-> 328
/*     */     //   #102	-> 340
/*     */     //   #103	-> 350
/*     */     //   #104	-> 362
/*     */     //   #107	-> 378
/*     */     //   #108	-> 398
/*     */     //   #109	-> 409
/*     */     //   #110	-> 436
/*     */     //   #111	-> 446
/*     */     //   #110	-> 458
/*     */     //   #113	-> 462
/*     */     //   #114	-> 501
/*     */     //   #99	-> 520
/*     */     //   #118	-> 525
/*     */     //   #122	-> 533
/*     */     //   #123	-> 553
/*     */     //   #124	-> 564
/*     */     //   #125	-> 591
/*     */     //   #126	-> 601
/*     */     //   #125	-> 613
/*     */     //   #128	-> 617
/*     */     //   #129	-> 628
/*     */     //   #130	-> 689
/*     */     //   #131	-> 709
/*     */     //   #133	-> 714
/*     */     //   #134	-> 753
/*     */     //   #117	-> 772
/*     */     //   #97	-> 774
/*     */     //   #119	-> 782
/*     */     //   #137	-> 783
/*     */     //   #138	-> 794
/*     */     //   #140	-> 834
/*     */     //   #141	-> 850
/*     */     //   #142	-> 875
/*     */     //   #143	-> 899
/*     */     //   #144	-> 911
/*     */     //   #138	-> 924
/*     */     //   #145	-> 929
/*     */     //   #137	-> 934
/*     */     //   #96	-> 939
/*     */     //   #86	-> 944
/*     */     //   #87	-> 945
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	954	0	this	Lli/cil/oc/common/tileentity/Adapter;
/*     */     //   0	954	1	d	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   76	878	4	x	I
/*     */     //   85	869	5	y	I
/*     */     //   94	860	6	z	I
/*     */     //   130	824	8	x	I
/*     */     //   139	815	9	y	I
/*     */     //   148	806	10	z	I
/*     */     //   226	728	15	newDriver	Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   285	669	20	oldEnvironment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   295	659	21	driver	Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   398	556	24	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   553	401	25	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   653	301	28	data	Lli/cil/oc/common/tileentity/Adapter$BlockData;
/*     */     //   834	120	34	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   }
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
/*     */   public final class Adapter$$anonfun$neighborChanged$1
/*     */     extends AbstractFunction1<Node, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
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
/*     */     public final void apply(Node x$2) {
/* 142 */       x$2.remove();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Adapter$$anonfun$neighborChanged$1(Adapter $outer) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void neighborChanged()
/*     */   {
/* 153 */     if (node() != null && node().network() != null)
/* 154 */       Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Adapter$$anonfun$neighborChanged$2(this));  } public final class Adapter$$anonfun$neighborChanged$2 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Adapter$$anonfun$neighborChanged$2(Adapter $outer) {} public final void apply(ForgeDirection d) {
/* 155 */       this.$outer.neighborChanged(d);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 163 */     ComponentInventory.class.onConnect(this, node);
/* 164 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 165 */       { neighborChanged(); return; }  return; }  neighborChanged();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 170 */     ComponentInventory.class.onDisconnect(this, node);
/* 171 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 172 */       { updatingBlocks().clear(); return; }  return; }  updatingBlocks().clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/* 178 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: new scala/Tuple2
/*     */     //   3: dup
/*     */     //   4: iload_1
/*     */     //   5: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   8: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   11: aload_2
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   16: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   19: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   22: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   25: astore_3
/*     */     //   26: aload_3
/*     */     //   27: ifnull -> 123
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual _1$mcI$sp : ()I
/*     */     //   34: istore #4
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   40: checkcast scala/Option
/*     */     //   43: astore #5
/*     */     //   45: iconst_0
/*     */     //   46: iload #4
/*     */     //   48: if_icmpne -> 123
/*     */     //   51: aload #5
/*     */     //   53: instanceof scala/Some
/*     */     //   56: ifeq -> 123
/*     */     //   59: aload #5
/*     */     //   61: checkcast scala/Some
/*     */     //   64: astore #6
/*     */     //   66: aload #6
/*     */     //   68: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   71: checkcast li/cil/oc/api/driver/Item
/*     */     //   74: astore #7
/*     */     //   76: aload #7
/*     */     //   78: aload_2
/*     */     //   79: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   84: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   87: invokevirtual Upgrade : ()Ljava/lang/String;
/*     */     //   90: astore #9
/*     */     //   92: dup
/*     */     //   93: ifnonnull -> 105
/*     */     //   96: pop
/*     */     //   97: aload #9
/*     */     //   99: ifnull -> 113
/*     */     //   102: goto -> 117
/*     */     //   105: aload #9
/*     */     //   107: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 117
/*     */     //   113: iconst_1
/*     */     //   114: goto -> 118
/*     */     //   117: iconst_0
/*     */     //   118: istore #8
/*     */     //   120: goto -> 126
/*     */     //   123: iconst_0
/*     */     //   124: istore #8
/*     */     //   126: iload #8
/*     */     //   128: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #180	-> 0
/*     */     //   #181	-> 30
/*     */     //   #182	-> 123
/*     */     //   #180	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	129	0	this	Lli/cil/oc/common/tileentity/Adapter;
/*     */     //   0	129	1	slot	I
/*     */     //   0	129	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   76	53	7	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt)
/*     */   {
/* 188 */     OpenSides.class.readFromNBTForServer(this, nbt);
/*     */     
/* 190 */     NBTTagList blocksNbt = nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("adapter.blocks").toString(), 10); ((IterableLike)((IterableLike)RichInt$.MODULE$
/* 191 */       .until$extension0(Predef$.MODULE$.intWrapper(0), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(blocksNbt.func_74745_c()), (li$cil$oc$common$tileentity$Adapter$$blocksData()).length))
/* 192 */       .map((Function1)new Adapter$$anonfun$readFromNBTForServer$1(this, blocksNbt), IndexedSeq$.MODULE$.canBuildFrom()))
/* 193 */       .zipWithIndex(IndexedSeq$.MODULE$.canBuildFrom()))
/* 194 */       .foreach((Function1)new Adapter$$anonfun$readFromNBTForServer$2(this)); } public final class Adapter$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<Object, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList blocksNbt$1; public final NBTTagCompound apply(int x$1) { return this.blocksNbt$1.func_150305_b(x$1); } public Adapter$$anonfun$readFromNBTForServer$1(Adapter $outer, NBTTagList blocksNbt$1) {} } public final class Adapter$$anonfun$readFromNBTForServer$2 extends AbstractFunction1<Tuple2<NBTTagCompound, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/* 195 */         NBTTagCompound blockNbt = (NBTTagCompound)tuple2._1(); int i = tuple2._2$mcI$sp();
/*     */         
/* 197 */         this.$outer.li$cil$oc$common$tileentity$Adapter$$blocksData()[i] = (Option<Adapter.BlockData>)new Some(new Adapter.BlockData(this.$outer, blockNbt.func_74779_i("name"), blockNbt.func_74775_l("data"))); BoxedUnit boxedUnit = (blockNbt.func_74764_b("name") && blockNbt.func_74764_b("data")) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple2); }
/*     */     
/*     */     public Adapter$$anonfun$readFromNBTForServer$2(Adapter $outer) {} }
/* 203 */   public void writeToNBTForServer(NBTTagCompound nbt) { OpenSides.class.writeToNBTForServer(this, nbt);
/*     */     
/* 205 */     NBTTagList blocksNbt = new NBTTagList();
/* 206 */     Predef$.MODULE$.refArrayOps((Object[])li$cil$oc$common$tileentity$Adapter$$blocks()).indices().foreach$mVc$sp((Function1)new Adapter$$anonfun$writeToNBTForServer$1(this, blocksNbt));
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
/* 220 */     nbt.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("adapter.blocks").toString(), (NBTBase)blocksNbt); } public final class Adapter$$anonfun$writeToNBTForServer$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagList blocksNbt$2; public final void apply(int i) { apply$mcVI$sp(i); } public Adapter$$anonfun$writeToNBTForServer$1(Adapter $outer, NBTTagList blocksNbt$2) {} public void apply$mcVI$sp(int i) {
/*     */       // Byte code:
/*     */       //   0: new net/minecraft/nbt/NBTTagCompound
/*     */       //   3: dup
/*     */       //   4: invokespecial <init> : ()V
/*     */       //   7: astore_2
/*     */       //   8: aload_0
/*     */       //   9: getfield $outer : Lli/cil/oc/common/tileentity/Adapter;
/*     */       //   12: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocksData : ()[Lscala/Option;
/*     */       //   15: iload_1
/*     */       //   16: aaload
/*     */       //   17: astore_3
/*     */       //   18: aload_3
/*     */       //   19: instanceof scala/Some
/*     */       //   22: ifeq -> 147
/*     */       //   25: aload_3
/*     */       //   26: checkcast scala/Some
/*     */       //   29: astore #4
/*     */       //   31: aload #4
/*     */       //   33: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   36: checkcast li/cil/oc/common/tileentity/Adapter$BlockData
/*     */       //   39: astore #5
/*     */       //   41: aload_0
/*     */       //   42: getfield $outer : Lli/cil/oc/common/tileentity/Adapter;
/*     */       //   45: invokevirtual li$cil$oc$common$tileentity$Adapter$$blocks : ()[Lscala/Option;
/*     */       //   48: iload_1
/*     */       //   49: aaload
/*     */       //   50: astore #7
/*     */       //   52: aload #7
/*     */       //   54: instanceof scala/Some
/*     */       //   57: ifeq -> 112
/*     */       //   60: aload #7
/*     */       //   62: checkcast scala/Some
/*     */       //   65: astore #8
/*     */       //   67: aload #8
/*     */       //   69: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   72: checkcast scala/Tuple2
/*     */       //   75: astore #9
/*     */       //   77: aload #9
/*     */       //   79: ifnull -> 112
/*     */       //   82: aload #9
/*     */       //   84: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   87: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */       //   90: astore #10
/*     */       //   92: aload #10
/*     */       //   94: aload #5
/*     */       //   96: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   99: invokeinterface save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   104: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   107: astore #11
/*     */       //   109: goto -> 117
/*     */       //   112: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   115: astore #11
/*     */       //   117: aload_2
/*     */       //   118: ldc 'name'
/*     */       //   120: aload #5
/*     */       //   122: invokevirtual name : ()Ljava/lang/String;
/*     */       //   125: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   128: aload_2
/*     */       //   129: ldc 'data'
/*     */       //   131: aload #5
/*     */       //   133: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   136: invokevirtual func_74782_a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
/*     */       //   139: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   142: astore #6
/*     */       //   144: goto -> 152
/*     */       //   147: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   150: astore #6
/*     */       //   152: aload_0
/*     */       //   153: getfield blocksNbt$2 : Lnet/minecraft/nbt/NBTTagList;
/*     */       //   156: aload_2
/*     */       //   157: invokevirtual func_74742_a : (Lnet/minecraft/nbt/NBTBase;)V
/*     */       //   160: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #207	-> 0
/*     */       //   #208	-> 8
/*     */       //   #209	-> 18
/*     */       //   #210	-> 41
/*     */       //   #211	-> 52
/*     */       //   #212	-> 112
/*     */       //   #214	-> 117
/*     */       //   #215	-> 128
/*     */       //   #209	-> 142
/*     */       //   #216	-> 147
/*     */       //   #218	-> 152
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	161	0	this	Lli/cil/oc/common/tileentity/Adapter$$anonfun$writeToNBTForServer$1;
/*     */       //   0	161	1	i	I
/*     */       //   8	152	2	blockNbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   41	120	5	data	Lli/cil/oc/common/tileentity/Adapter$BlockData;
/*     */       //   92	69	10	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     } }
/*     */   public class BlockData { private final String name; private final NBTTagCompound data;
/* 225 */     public String name() { return this.name; } public NBTTagCompound data() { return this.data; }
/*     */ 
/*     */     
/*     */     public BlockData(Adapter $outer, String name, NBTTagCompound data) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */