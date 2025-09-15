/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import li.cil.oc.common.tileentity.traits.ComponentInventory;
/*     */ import li.cil.oc.common.tileentity.traits.Environment;
/*     */ import li.cil.oc.common.tileentity.traits.Inventory;
/*     */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t5a\001B\001\003\0015\021\021\002R5tW\022\023\030N^3\013\005\r!\021A\003;jY\026,g\016^5us*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\004\001\035]i\002eI\026\021\005=)R\"\001\t\013\005\r\t\"B\001\n\024\003%i\027N\\3de\0064GOC\001\025\003\rqW\r^\005\003-A\021!\002V5mK\026sG/\033;z!\tA2$D\001\032\025\tQ\"!\001\004ue\006LGo]\005\0039e\0211\"\0228wSJ|g.\\3oiB\021\001DH\005\003?e\021!cQ8na>tWM\034;J]Z,g\016^8ssB\021\001$I\005\003Ee\021\021BU8uCR\f'\r\\3\021\005\021JS\"A\023\013\005\031:\023a\0028fi^|'o\033\006\003Q\031\t1!\0319j\023\tQSE\001\006B]\006d\027P_1cY\026\004\"\001L\030\016\0035R!AL\024\002\r\021\024\030N^3s\023\t\001TF\001\006EKZL7-Z%oM>DQA\r\001\005\002M\na\001P5oSRtD#\001\033\021\005U\002Q\"\001\002\t\017]\002\001\031!C\001q\005QA.Y:u\003\016\034Wm]:\026\003e\002\"AO\037\016\003mR\021\001P\001\006g\016\fG.Y\005\003}m\022A\001T8oO\"9\001\t\001a\001\n\003\t\025A\0047bgR\f5mY3tg~#S-\035\013\003\005\026\003\"AO\"\n\005\021[$\001B+oSRDqAR \002\002\003\007\021(A\002yIEBa\001\023\001!B\023I\024a\0037bgR\f5mY3tg\002BQA\023\001\005\002-\013aBZ5mKNL8\017^3n\035>$W-F\001M!\rQTjT\005\003\035n\022aa\0249uS>t\007C\001\023Q\023\t\tVE\001\003O_\022,\007\002C*\001\021\013\007IQ\002+\002\025\021,g/[2f\023:4w.F\001V!\02116,X/\016\003]S!\001W-\002\023%lW.\036;bE2,'B\001.<\003)\031w\016\0347fGRLwN\\\005\0039^\0231!T1q!\tq6-D\001`\025\t\001\027-\001\003mC:<'\"\0012\002\t)\fg/Y\005\003I~\023aa\025;sS:<\007\002\0034\001\021\003\005\013UB+\002\027\021,g/[2f\023:4w\016\t\005\006Q\002!\t%[\001\016O\026$H)\032<jG\026LeNZ8\025\003)\004Ba\0338p_6\tAN\003\002nC\006!Q\017^5m\023\taF\016\005\002qg:\021!(]\005\003en\na\001\025:fI\0264\027B\0013u\025\t\0218\bC\004w\001\t\007I\021A<\002\t9|G-Z\013\002qB\021A%_\005\003u\026\022\021bQ8na>tWM\034;\t\rq\004\001\025!\003y\003\025qw\016Z3!\021\025q\b\001\"\001\000\003\035I7/R7qif$b!!\001\002\016\005u\001#\002\036\002\004\005\035\021bAA\003w\t)\021I\035:bsB\031!(!\003\n\007\005-1H\001\004B]f\024VM\032\005\b\003\037i\b\031AA\t\003\035\031wN\034;fqR\004B!a\005\002\0325\021\021Q\003\006\004\003/9\023aB7bG\"Lg.Z\005\005\0037\t)BA\004D_:$X\r\037;\t\017\005}Q\0201\001\002\"\005!\021M]4t!\021\t\031\"a\t\n\t\005\025\022Q\003\002\n\003J<W/\\3oiNDs!`A\025\003_\t\t\004\005\003\002\024\005-\022\002BA\027\003+\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA\032\003-3WO\\2uS>t\007&\013\036c_>dW-\0318![5\0023\t[3dWN\004s\017[3uQ\026\024\be]8nK\002jW\rZ5v[\002J7\017I2veJ,g\016\0367zA%t\007\005\0365fA\021\024\030N^3/\021\035\t9\004\001C\001\003s\tQ!\0326fGR$b!!\001\002<\005u\002\002CA\b\003k\001\r!!\005\t\021\005}\021Q\007a\001\003CA\003\"!\016\002*\005=\022\021I\021\003\003\007\n\021LZ;oGRLwN\034\025\\m\026dwnY5usjrW/\0342fevK#HY8pY\026\fg\016I\027.A\025SWm\031;!i\",\007eY;se\026tG\017\\=!aJ,7/\0328uA5,G-[;nA\031\024x.\034\021uQ\026\004CM]5wK:Bq!a\022\001\t\003\tI%A\003nK\022L\027\r\006\004\002\002\005-\023Q\n\005\t\003\037\t)\0051\001\002\022!A\021qDA#\001\004\t\t\003\013\005\002F\005%\022qFA)C\t\t\031&A\037gk:\034G/[8oQ%R\004e\035;sS:<\007%L\027!%\026$XO\0358!i\",\007%\0338uKJt\027\r\034\021gY>\004\b/\037\021eSN\\\007%\0313ee\026\0348\017C\004\002X\001!\t%!\027\002\023=t\027I\\1msj,G\003DA.\003;\ny'!\037\002\004\006\035\005\003\002\036\002\004=C\001\"a\030\002V\001\007\021\021M\001\007a2\f\0270\032:\021\t\005\r\0241N\007\003\003KRA!a\030\002h)\031\021\021N\t\002\r\025tG/\033;z\023\021\ti'!\032\003\031\025sG/\033;z!2\f\0270\032:\t\021\005E\024Q\013a\001\003g\nAa]5eKB\031!(!\036\n\007\005]4HA\002J]RD\001\"a\037\002V\001\007\021QP\001\005Q&$\b\fE\002;\003J1!!!<\005\0251En\\1u\021!\t))!\026A\002\005u\024\001\0025jifC\001\"!#\002V\001\007\021QP\001\005Q&$(\fC\004\002\016\002!\t%a$\002!\035,GoU5{K&sg/\0328u_JLHCAA:\021\035\t\031\n\001C!\003+\013!#[:Ji\026lg+\0317jI\032{'o\0257piR1\021qSAO\003C\0032AOAM\023\r\tYj\017\002\b\005>|G.Z1o\021!\ty*!%A\002\005M\024\001B:m_RD\001\"a)\002\022\002\007\021QU\001\006gR\f7m\033\t\005\003O\013i+\004\002\002**\031\0211V\t\002\t%$X-\\\005\005\003_\013IKA\005Ji\026l7\013^1dW\"9\0211\027\001\005R\005U\026aC8o\023R,W.\0213eK\022$RAQA\\\003sC\001\"a(\0022\002\007\0211\017\005\t\003G\013\t\f1\001\002&\"9\021Q\030\001\005R\005}\026!D8o\023R,WNU3n_Z,G\rF\003C\003\003\f\031\r\003\005\002 \006m\006\031AA:\021!\t\031+a/A\002\005\025\006bBAd\001\021\005\023\021Z\001\nG\006tW\013\0353bi\026$\"!a&\t\017\0055\007\001\"\021\002P\006!\"/Z1e\rJ|WN\024\"U\r>\0248\t\\5f]R$2AQAi\021!\t\031.a3A\002\005U\027a\0018ciB!\021q[An\033\t\tINC\002\002TFIA!!8\002Z\nqaJ\021+UC\036\034u.\0349pk:$\007\006CAf\003C\fI0a?\021\t\005\r\030Q_\007\003\003KTA!a:\002j\006Q!/\0327bk:\034\007.\032:\013\t\005-\030Q^\001\004M6d'\002BAx\003c\fA!\\8eg*\021\0211_\001\004GB<\030\002BA|\003K\024\001bU5eK>sG._\001\006m\006dW/\032\023\003\003{LA!a@\003\002\00511\tT%F\035RSAAa\001\002f\006!1+\0333f\021\035\0219\001\001C!\005\023\t1c\036:ji\026$vN\024\"U\r>\0248\t\\5f]R$2A\021B\006\021!\t\031N!\002A\002\005U\007")
/*     */ public class DiskDrive extends TileEntity implements ComponentInventory, Rotatable, Analyzable, DeviceInfo {
/*     */   private long lastAccess;
/*     */   private Map<String, String> deviceInfo;
/*     */   private final Component node;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction;
/*     */   private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch;
/*     */   private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*     */   
/*  31 */   public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components; private boolean isSizeInventoryReady; private final ArrayBuffer<ManagedEnvironment> updatingComponents; private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public ForgeDirection[] validFacings() { return Rotatable.class.validFacings(this); } public void onRotationChanged() { Rotatable.class.onRotationChanged(this); } public void readFromNBTForServer(NBTTagCompound nbt) { Rotatable.class.readFromNBTForServer(this, nbt); } public void writeToNBTForServer(NBTTagCompound nbt) { Rotatable.class.writeToNBTForServer(this, nbt); } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void dispose() { ComponentInventory.class.dispose(this); } public void onConnect(Node node) { ComponentInventory.class.onConnect(this, node); } public void onDisconnect(Node node) { ComponentInventory.class.onDisconnect(this, node); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit((ComponentInventory)this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot((ComponentInventory)this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode((ComponentInventory)this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public boolean isConnected() { return Environment.class.isConnected((Environment)this); } public void func_145845_h() { Environment.class.updateEntity((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public DiskDrive() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this);
/*     */     
/*  33 */     this.lastAccess = 0L;
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
/*  52 */     this.node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  53 */       .withComponent("disk_drive")
/*  54 */       .create(); } public long lastAccess() { return this.lastAccess; } public void lastAccess_$eq(long x$1) { this.lastAccess = x$1; } public Option<Node> filesystemNode() { None$ none$; Option<ManagedEnvironment> option = components()[0]; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); Option option1 = Option$.MODULE$.apply(environment.node()); } else { none$ = None$.MODULE$; }  return (Option<Node>)none$; } private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "disk"); (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Floppy disk drive"); (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Spinner 520p1"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.deviceInfo; }  }
/*     */   private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*     */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   public Component node() { return this.node; }
/*  58 */   @Callback(doc = "function():boolean -- Checks whether some medium is currently in the drive.") public Object[] isEmpty(Context context, Arguments args) { return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(filesystemNode().isEmpty()) })); }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function([velocity:number]):boolean -- Eject the currently present medium from the drive.")
/*     */   public Object[] eject(Context context, Arguments args) {
/*  63 */     double velocity = RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(args.optDouble(0, 0.0D)), 0.0D)), 1.0D);
/*  64 */     ItemStack ejected = func_70298_a(0, 1);
/*     */     
/*  66 */     EntityItem entity = InventoryUtils$.MODULE$.spawnStackInWorld(position(), ejected, Option$.MODULE$.apply(facing()), InventoryUtils$.MODULE$.spawnStackInWorld$default$4());
/*  67 */     if (entity != null) {
/*  68 */       double vx = (facing()).offsetX * velocity;
/*  69 */       double vy = (facing()).offsetY * velocity;
/*  70 */       double vz = (facing()).offsetZ * velocity;
/*  71 */       entity.func_70024_g(vx, vy, vz);
/*     */     } 
/*  73 */     return (ejected != null && ejected.field_77994_a > 0) ? result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*     */           
/*  75 */           })) : result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(): string -- Return the internal floppy disk address")
/*     */   public Object[] media(Context context, Arguments args) {
/*  80 */     return filesystemNode().isEmpty() ? 
/*  81 */       result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "drive is empty"
/*     */           
/*  83 */           })) : result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { ((Node)Option$.MODULE$.option2Iterable(filesystemNode()).head()).address() }));
/*     */   }
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ)
/*     */   {
/*  89 */     return (Node[])filesystemNode().fold((Function0)new DiskDrive$$anonfun$onAnalyze$1(this), (Function1)new DiskDrive$$anonfun$onAnalyze$2(this)); } public final class DiskDrive$$anonfun$onAnalyze$1 extends AbstractFunction0<Node[]> implements Serializable { public static final long serialVersionUID = 0L; public final Node[] apply() { return null; } public DiskDrive$$anonfun$onAnalyze$1(DiskDrive $outer) {} } public final class DiskDrive$$anonfun$onAnalyze$2 extends AbstractFunction1<Node, Node[]> implements Serializable { public static final long serialVersionUID = 0L; public final Node[] apply(Node x$1) { (new Node[1])[0] = x$1; return new Node[1]; }
/*     */     
/*     */     public DiskDrive$$anonfun$onAnalyze$2(DiskDrive $outer) {} }
/*     */   
/*     */   public int func_70302_i_() {
/*  94 */     return 1;
/*     */   }
/*     */ 
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
/*     */     //   87: invokevirtual Floppy : ()Ljava/lang/String;
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
/*     */     //   #96	-> 0
/*     */     //   #97	-> 30
/*     */     //   #98	-> 123
/*     */     //   #96	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	129	0	this	Lli/cil/oc/common/tileentity/DiskDrive;
/*     */     //   0	129	1	slot	I
/*     */     //   0	129	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   76	53	7	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onItemAdded(int slot, ItemStack stack) {
/* 105 */     ComponentInventory.class.onItemAdded(this, slot, stack);
/* 106 */     Option<ManagedEnvironment> option = components()[slot];
/* 107 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); Node node = environment.node();
/* 108 */       if (node instanceof Component) { Component component = (Component)node; component.setVisibility(Visibility.Network); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */        throw new MatchError(node); }
/* 110 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     
/* 112 */     Sound$.MODULE$.playDiskInsert((EnvironmentHost)this);
/* 113 */     if (isServer()) {
/* 114 */       PacketSender$.MODULE$.sendFloppyChange(this, stack);
/*     */     }
/*     */   }
/*     */   
/*     */   public void onItemRemoved(int slot, ItemStack stack) {
/* 119 */     ComponentInventory.class.onItemRemoved(this, slot, stack);
/* 120 */     Sound$.MODULE$.playDiskEject((EnvironmentHost)this);
/* 121 */     if (isServer()) {
/* 122 */       PacketSender$.MODULE$.sendFloppyChange(this, PacketSender$.MODULE$.sendFloppyChange$default$2());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 129 */     return false;
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 133 */     Rotatable.class.readFromNBTForClient(this, nbt);
/* 134 */     if (nbt.func_74764_b("disk")) {
/* 135 */       func_70299_a(0, ItemStack.func_77949_a(nbt.func_74775_l("disk")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 140 */     Rotatable.class.writeToNBTForClient(this, nbt);
/* 141 */     Option<ItemStack> option = items()[0];
/* 142 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("disk", (Function1)new DiskDrive$$anonfun$writeToNBTForClient$1(this, stack)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 143 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public final class DiskDrive$$anonfun$writeToNBTForClient$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$1;
/*     */     
/*     */     public final NBTTagCompound apply(NBTTagCompound x$1) {
/*     */       return this.stack$1.func_77955_b(x$1);
/*     */     }
/*     */     
/*     */     public DiskDrive$$anonfun$writeToNBTForClient$1(DiskDrive $outer, ItemStack stack$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\DiskDrive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */