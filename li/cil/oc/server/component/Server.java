/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.ItemStackInventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tmf\001B\001\003\0015\021aaU3sm\026\024(BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'%\001aB\006\020%Y=\022t\007\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9B$D\001\031\025\tI\"$A\004oKR<xN]6\013\005m1\021aA1qS&\021Q\004\007\002\f\013:4\030N]8o[\026tG\017\005\002 E5\t\001E\003\002\"5\0059Q.Y2iS:,\027BA\022!\005-i\025m\0315j]\026Dun\035;\021\005\025RS\"\001\024\013\005\035B\023!C5om\026tGo\034:z\025\tIc!\001\004d_6lwN\\\005\003W\031\022qbU3sm\026\024\030J\034<f]R|'/\037\t\003K5J!A\f\024\003%\r{W\016]8oK:$\030J\034<f]R|'/\037\t\003/AJ!!\r\r\003\025\005s\027\r\\={C\ndW\r\005\0024m5\tAG\003\00265\005A\021N\034;fe:\fG.\003\002\002iA\021\001hO\007\002s)\021!HG\001\007IJLg/\032:\n\005qJ$A\003#fm&\034W-\0238g_\"Aa\b\001BC\002\023\005q(\001\003sC\016\\W#\001!\021\005M\n\025B\001\"5\005\021\021\026mY6\t\021\021\003!\021!Q\001\n\001\013QA]1dW\002B\001B\022\001\003\006\004%\taR\001\005g2|G/F\001I!\tIE*D\001K\025\005Y\025!B:dC2\f\027BA'K\005\rIe\016\036\005\t\037\002\021\t\021)A\005\021\006)1\017\\8uA!)\021\013\001C\001%\0061A(\0338jiz\"2aU+W!\t!\006!D\001\003\021\025q\004\0131\001A\021\0251\005\0131\001I\021!\t\003\001#b\001\n\003AV#A-\021\005}Q\026BA.!\005\035i\025m\0315j]\026D\001\"\030\001\t\002\003\006K!W\001\t[\006\034\007.\0338fA!9q\f\001b\001\n\003\001\027\001\0028pI\026,\022!\031\t\003/\tL!a\031\r\003\t9{G-\032\005\007K\002\001\013\021B1\002\0139|G-\032\021\t\017\035\004\001\031!C\001Q\006Qq/Y:Sk:t\027N\\4\026\003%\004\"!\0236\n\005-T%a\002\"p_2,\027M\034\005\b[\002\001\r\021\"\001o\00399\030m\035*v]:LgnZ0%KF$\"a\034:\021\005%\003\030BA9K\005\021)f.\033;\t\017Md\027\021!a\001S\006\031\001\020J\031\t\rU\004\001\025)\003j\003-9\030m\035*v]:Lgn\032\021\t\017]\004\001\031!C\001Q\006Q\001.\0313FeJ|'/\0323\t\017e\004\001\031!C\001u\006q\001.\0313FeJ|'/\0323`I\025\fHCA8|\021\035\031\b0!AA\002%Da! \001!B\023I\027a\0035bI\026\023(o\034:fI\002B\001b \001A\002\023\005\021\021A\001\025Y\006\034HOR5mKNK8\017^3n\003\016\034Wm]:\026\005\005\r\001cA%\002\006%\031\021q\001&\003\t1{gn\032\005\n\003\027\001\001\031!C\001\003\033\t\001\004\\1ti\032KG.Z*zgR,W.Q2dKN\034x\fJ3r)\ry\027q\002\005\ng\006%\021\021!a\001\003\007A\001\"a\005\001A\003&\0211A\001\026Y\006\034HOR5mKNK8\017^3n\003\016\034Wm]:!\021%\t9\002\001a\001\n\003\t\t!A\nmCN$h*\032;x_J\\\027i\031;jm&$\030\020C\005\002\034\001\001\r\021\"\001\002\036\0059B.Y:u\035\026$xo\034:l\003\016$\030N^5us~#S-\035\013\004_\006}\001\"C:\002\032\005\005\t\031AA\002\021!\t\031\003\001Q!\n\005\r\021\001\0067bgRtU\r^<pe.\f5\r^5wSRL\b\005\003\006\002(\001A)\031!C\007\003S\t!\002Z3wS\016,\027J\0344p+\t\tY\003\005\005\002.\005]\0221HA\036\033\t\tyC\003\003\0022\005M\022!C5n[V$\030M\0317f\025\r\t)DS\001\013G>dG.Z2uS>t\027\002BA\035\003_\0211!T1q!\ry\021QH\005\004\003\001\"AB*ue&tw\r\003\006\002D\001A\t\021)Q\007\003W\t1\002Z3wS\016,\027J\0344pA!9\021q\t\001\005B\005%\023!D4fi\022+g/[2f\023:4w\016\006\002\002LAA\021QJA*\003+\n)&\004\002\002P)\031\021\021\013\n\002\tU$\030\016\\\005\005\003s\ty\005\005\003\002X\005ucbA%\002Z%\031\0211\f&\002\rA\023X\rZ3g\023\021\ty$a\030\013\007\005m#\nC\004\002d\001!\t%!\032\002\023=t7i\0348oK\016$HcA8\002h!1q,!\031A\002\005Dq!a\033\001\t\003\ni'\001\007p]\022K7oY8o]\026\034G\017F\002p\003_BaaXA5\001\004\t\007bBA:\001\021\005\023QO\001\n_:lUm]:bO\026$2a\\A<\021!\tI(!\035A\002\005m\024aB7fgN\fw-\032\t\004/\005u\024bAA@1\t9Q*Z:tC\036,\007bBAB\001\021\005\023QQ\001\005Y>\fG\rF\002p\003\017C\001\"!#\002\002\002\007\0211R\001\004]\n$\b\003BAG\0033k!!a$\013\t\005%\025\021\023\006\005\003'\013)*A\005nS:,7M]1gi*\021\021qS\001\004]\026$\030\002BAN\003\037\023aB\024\"U)\006<7i\\7q_VtG\rC\004\002 \002!\t%!)\002\tM\fg/\032\013\004_\006\r\006\002CAE\003;\003\r!a#\t\017\005\035\006\001\"\021\002*\006\021\022N\034;fe:\fGnQ8na>tWM\034;t)\t\tY\013E\003\020\003[\013\t,C\002\0020B\021\001\"\023;fe\006\024G.\032\t\005\003g\013I,\004\002\0026*!\021qWAI\003\021IG/Z7\n\t\005m\026Q\027\002\n\023R,Wn\025;bG.Dq!a0\001\t\003\n\t-A\007d_6\004xN\\3oiNcw\016\036\013\004\021\006\r\007\002CAc\003{\003\r!!\026\002\017\005$GM]3tg\"9\021\021\032\001\005B\005-\027\001E8o\033\006\034\007.\0338f\007>tg.Z2u)\ry\027Q\032\005\007?\006\035\007\031A1\t\017\005E\007\001\"\021\002T\006\031rN\\'bG\"Lg.\032#jg\016|gN\\3diR\031q.!6\t\r}\013y\r1\001b\021\035\tI\016\001C!\0037\f\021\002\037)pg&$\030n\0348\025\005\005u\007cA%\002`&\031\021\021\035&\003\r\021{WO\0317f\021\035\t)\017\001C!\0037\f\021\"\037)pg&$\030n\0348\t\017\005%\b\001\"\021\002\\\006I!\020U8tSRLwN\034\005\b\003[\004A\021IAx\003\0259xN\0357e)\t\t\t\020\005\003\002t\006]XBAA{\025\021\ti/!%\n\t\005e\030Q\037\002\006/>\024H\016\032\005\b\003{\004A\021IA\000\003-i\027M]6DQ\006tw-\0323\025\003=DaAa\001\001\t\003:\025\001\002;jKJDqAa\002\001\t\003\022I!A\tjgV\033X-\0312mK\nK\b\013\\1zKJ$2!\033B\006\021!\021iA!\002A\002\t=\021A\0029mCf,'\017\005\003\003\022\teQB\001B\n\025\021\021iA!\006\013\t\t]\021\021S\001\007K:$\030\016^=\n\t\tm!1\003\002\r\013:$\030\016^=QY\006LXM\035\005\007\005?\001A\021I \002\t!|7\017\036\005\b\005G\001A\021\tB\023\003%\031wN\034;bS:,'/\006\002\0022\"9!\021\006\001\005R\t-\022aD2p]:,7\r^%uK6tu\016Z3\025\007=\024i\003\003\004`\005O\001\r!\031\005\b\005c\001A\021\013B\032\0035yg.\023;f[J+Wn\034<fIR)qN!\016\0038!1aIa\fA\002!C\001B!\017\0030\001\007\021\021W\001\006gR\f7m\033\005\b\005{\001A\021\tB \003\0359W\r\036#bi\006$\"!a#\t\017\t\r\003\001\"\021\003F\005\031r-\032;D_:tWm\031;bE2,7i\\;oiR\t\001\nC\004\003J\001!\tEa\023\002!\035,GoQ8o]\026\034G/\0312mK\006#H\003\002B'\005/\002BAa\024\003T5\021!\021\013\006\003\007iIAA!\026\003R\t\021\"+Y2l\005V\0348i\0348oK\016$\030M\0317f\021\035\021IFa\022A\002!\013Q!\0338eKbDqA!\030\001\t\003\022y&\001\006p]\006\033G/\033<bi\026$r!\033B1\005G\022i\007\003\005\003\016\tm\003\031\001B\b\021!\021)Ga\027A\002\t\035\024\001\0025jib\0032!\023B5\023\r\021YG\023\002\006\r2|\027\r\036\005\t\005_\022Y\0061\001\003h\005!\001.\033;Z\021\035\021\031\b\001C!\005k\n\021bY1o+B$\027\r^3\025\003%DqA!\037\001\t\003\ny0\001\004va\022\fG/\032\005\b\005{\002A\021\tB@\003=9W\r^\"veJ,g\016^*uCR,GC\001BA!\031\tiEa!\003\b&!!QQA(\005\035)e.^7TKR\004BA!#\003\034:!!1\022BK\035\021\021iIa%\017\t\t=%\021S\007\002\r%\0211DB\005\004\003#R\022\002\002BL\0053\013!b\025;bi\026\fu/\031:f\025\r\t\tFG\005\005\005;\023yJA\003Ti\006$XM\003\003\003\030\ne\005b\002BR\001\021\005#QU\001\n_:\fe.\0317zu\026$BBa*\003.\n=&1\027B[\005o\003B!\023BUC&\031!1\026&\003\013\005\023(/Y=\t\021\t5!\021\025a\001\005\037AqA!-\003\"\002\007\001*\001\003tS\022,\007\002\003B3\005C\003\rAa\032\t\021\t=$\021\025a\001\005OB\001B!/\003\"\002\007!qM\001\005Q&$(\f")
/*     */ public class Server implements ServerInventory, ComponentInventory, Analyzable, Server, DeviceInfo {
/*     */   private final Rack rack;
/*     */   private final int slot;
/*     */   private Machine machine;
/*     */   private final Node node;
/*     */   private boolean wasRunning;
/*     */   private boolean hadErrored;
/*     */   private long lastFileSystemAccess;
/*     */   private long lastNetworkActivity;
/*     */   private Map<String, String> deviceInfo;
/*     */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*     */   private boolean isSizeInventoryReady;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*     */   private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*     */   private volatile byte bitmap$0;
/*     */   
/*  37 */   public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components(this); } public void updateComponents() { ComponentInventory.class.updateComponents(this); } public void connectComponents() { ComponentInventory.class.connectComponents(this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents(this); } public void saveComponents() { ComponentInventory.class.saveComponents(this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit(this); } public void onItemAdded(int slot, ItemStack stack) { ComponentInventory.class.onItemAdded(this, slot, stack); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot(this, slot, stack); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag(this, driver, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState(this, component, state); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() : this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Rack rack() { return this.rack; } public int slot() { return this.slot; } public Server(Rack rack, int slot) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); ComponentInventory.class.$init$(this);
/*     */ 
/*     */     
/*  40 */     this.node = (rack.world()).field_72995_K ? null : machine().node();
/*     */     
/*  42 */     this.wasRunning = false;
/*  43 */     this.hadErrored = false;
/*  44 */     this.lastFileSystemAccess = 0L;
/*  45 */     this.lastNetworkActivity = 0L; } private Machine machine$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.machine = Machine.create((MachineHost)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.machine; }  } public Machine machine() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? machine$lzycompute() : this.machine; } public Node node() { return this.node; } public boolean wasRunning() { return this.wasRunning; } public long lastNetworkActivity() { return this.lastNetworkActivity; } public void wasRunning_$eq(boolean x$1) { this.wasRunning = x$1; } public boolean hadErrored() { return this.hadErrored; } public void hadErrored_$eq(boolean x$1) { this.hadErrored = x$1; } public long lastFileSystemAccess() { return this.lastFileSystemAccess; } public void lastFileSystemAccess_$eq(long x$1) { this.lastFileSystemAccess = x$1; } public void lastNetworkActivity_$eq(long x$1) { this.lastNetworkActivity = x$1; }
/*     */   
/*  47 */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  48 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "system");
/*  49 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Server");
/*  50 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  51 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Blader");
/*  52 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(func_70302_i_()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*  55 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/*  61 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/*  62 */       { connectComponents(); return; }  return; }  connectComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/*  67 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/*  68 */       { disconnectComponents(); return; }  return; }  disconnectComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {}
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/*  76 */     Inventory.class.load((Inventory)this, nbt);
/*  77 */     if (!(rack().world()).field_72995_K) {
/*  78 */       machine().load(nbt.func_74775_l("machine"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/*  83 */     ComponentInventory.class.save(this, nbt);
/*  84 */     if (!(rack().world()).field_72995_K)
/*  85 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("machine", (Function1)new Server$$anonfun$save$1(this));  } public final class Server$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) { this.$outer.machine().save(x$1); }
/*     */ 
/*     */     
/*     */     public Server$$anonfun$save$1(Server $outer) {} }
/*     */ 
/*     */   
/*     */   public Iterable<ItemStack> internalComponents() {
/*  92 */     return WrapAsJava$.MODULE$.seqAsJavaList((Seq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).collect((PartialFunction)new Server$$anonfun$internalComponents$1(this), IndexedSeq$.MODULE$.canBuildFrom())); } public final class Server$$anonfun$internalComponents$1 extends AbstractPartialFunction<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(int x2, Function1 default) { Object object; int i = x2;
/*  93 */       if (this.$outer.func_70301_a(i) != null && this.$outer.isComponentSlot(i, this.$outer.func_70301_a(i))) { object = this.$outer.func_70301_a(i); } else { object = default.apply(BoxesRunTime.boxToInteger(x2)); }  return (B1)object; } public final boolean isDefinedAt(int x2) { boolean bool; int i = x2; if (this.$outer.func_70301_a(i) != null && this.$outer.isComponentSlot(i, this.$outer.func_70301_a(i))) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*  96 */        return bool; } public Server$$anonfun$internalComponents$1(Server $outer) {} } public int componentSlot(String address) { return Predef$.MODULE$.refArrayOps((Object[])components()).indexWhere((Function1)new Server$$anonfun$componentSlot$1(this, address)); } public final class Server$$anonfun$componentSlot$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final String address$1; public final boolean apply(Option x$1) { return x$1.exists((Function1)new Server$$anonfun$componentSlot$1$$anonfun$apply$1(this)); } public Server$$anonfun$componentSlot$1(Server $outer, String address$1) {} public final class Server$$anonfun$componentSlot$1$$anonfun$apply$1 extends AbstractFunction1<ManagedEnvironment, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(ManagedEnvironment env) { // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   6: ifnull -> 51
/*     */         //   9: aload_1
/*     */         //   10: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   15: invokeinterface address : ()Ljava/lang/String;
/*     */         //   20: aload_0
/*     */         //   21: getfield $outer : Lli/cil/oc/server/component/Server$$anonfun$componentSlot$1;
/*     */         //   24: getfield address$1 : Ljava/lang/String;
/*     */         //   27: astore_2
/*     */         //   28: dup
/*     */         //   29: ifnonnull -> 40
/*     */         //   32: pop
/*     */         //   33: aload_2
/*     */         //   34: ifnull -> 47
/*     */         //   37: goto -> 51
/*     */         //   40: aload_2
/*     */         //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   44: ifeq -> 51
/*     */         //   47: iconst_1
/*     */         //   48: goto -> 52
/*     */         //   51: iconst_0
/*     */         //   52: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #96	-> 0
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	53	0	this	Lli/cil/oc/server/component/Server$$anonfun$componentSlot$1$$anonfun$apply$1;
/*     */         //   0	53	1	env	Lli/cil/oc/api/network/ManagedEnvironment; } public Server$$anonfun$componentSlot$1$$anonfun$apply$1(Server$$anonfun$componentSlot$1 $outer) {} } }
/*  98 */   public void onMachineConnect(Node node) { onConnect(node); }
/*     */    public void onMachineDisconnect(Node node) {
/* 100 */     onDisconnect(node);
/*     */   }
/*     */ 
/*     */   
/*     */   public double xPosition() {
/* 105 */     return rack().xPosition();
/*     */   } public double yPosition() {
/* 107 */     return rack().yPosition();
/*     */   } public double zPosition() {
/* 109 */     return rack().zPosition();
/*     */   } public World world() {
/* 111 */     return rack().world();
/*     */   } public void markChanged() {
/* 113 */     rack().markChanged();
/*     */   }
/*     */ 
/*     */   
/*     */   public int tier() {
/* 118 */     Option option = Delegator$.MODULE$.subItem(container());
/* 119 */     if (option instanceof Some) { Some some = (Some)option; Delegate server = (Delegate)some.x(); if (server instanceof li.cil.oc.common.item.Server) { li.cil.oc.common.item.Server server1 = (li.cil.oc.common.item.Server)server; return server1.tier(); }  }
/* 120 */      return 0;
/*     */   }
/*     */   public boolean func_70300_a(EntityPlayer player) {
/* 123 */     return rack().func_70300_a(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rack host() {
/* 128 */     return rack();
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack container() {
/* 133 */     return rack().func_70301_a(slot());
/*     */   }
/*     */   public void connectItemNode(Node node) {
/* 136 */     if (node != null) {
/* 137 */       Network.joinNewNetwork(machine().node());
/* 138 */       machine().node().connect(node);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onItemRemoved(int slot, ItemStack stack) {
/* 143 */     ComponentInventory.class.onItemRemoved(this, slot, stack);
/* 144 */     if (!(rack().world()).field_72995_K)
/* 145 */     { String slotType = InventorySlots$.MODULE$.server()[tier()][slot].slot();
/* 146 */       String str1 = Slot$.MODULE$.CPU(); if (slotType == null) { if (str1 != null) return;  } else { if (slotType.equals(str1))
/* 147 */         { machine().stop(); return; }  return; }  } else { return; }  machine().stop();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound getData() {
/* 156 */     NBTTagCompound nbt = new NBTTagCompound();
/* 157 */     nbt.func_74757_a("isRunning", wasRunning());
/* 158 */     nbt.func_74757_a("hasErrored", hadErrored());
/* 159 */     nbt.func_74772_a("lastFileSystemAccess", lastFileSystemAccess());
/* 160 */     nbt.func_74772_a("lastNetworkActivity", lastNetworkActivity());
/* 161 */     return nbt;
/*     */   }
/*     */   public int getConnectableCount() {
/* 164 */     return Predef$.MODULE$.refArrayOps((Object[])components()).count((Function1)new Server$$anonfun$getConnectableCount$1(this));
/*     */   } public final class Server$$anonfun$getConnectableCount$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(Option x0$1) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof scala/Some
/*     */       //   6: ifeq -> 30
/*     */       //   9: aload_2
/*     */       //   10: checkcast scala/Some
/*     */       //   13: astore_3
/*     */       //   14: aload_3
/*     */       //   15: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   18: instanceof li/cil/oc/api/component/RackBusConnectable
/*     */       //   21: ifeq -> 30
/*     */       //   24: iconst_1
/*     */       //   25: istore #4
/*     */       //   27: goto -> 33
/*     */       //   30: iconst_0
/*     */       //   31: istore #4
/*     */       //   33: iload #4
/*     */       //   35: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #164	-> 0
/*     */       //   #165	-> 2
/*     */       //   #164	-> 14
/*     */       //   #165	-> 15
/*     */       //   #166	-> 30
/*     */       //   #164	-> 33
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	36	0	this	Lli/cil/oc/server/component/Server$$anonfun$getConnectableCount$1;
/*     */       //   0	36	1	x0$1	Lscala/Option;
/*     */     }
/*     */     public Server$$anonfun$getConnectableCount$1(Server $outer) {} }
/* 171 */   public RackBusConnectable getConnectableAt(int index) { return (RackBusConnectable)((ManagedEnvironment[])Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new Server$$anonfun$getConnectableAt$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ManagedEnvironment.class))))[index]; } public final class Server$$anonfun$getConnectableAt$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, ManagedEnvironment> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x3, Function1 default) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment busConnectable = (ManagedEnvironment)some.x(); if (busConnectable instanceof RackBusConnectable) { ManagedEnvironment managedEnvironment; return (B1)(managedEnvironment = busConnectable); }  }
/*     */        return (B1)default.apply(x3); } public final boolean isDefinedAt(Option x3) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment busConnectable = (ManagedEnvironment)some.x(); if (busConnectable instanceof RackBusConnectable)
/*     */           return true;  }
/*     */        return false; }
/*     */     public Server$$anonfun$getConnectableAt$1(Server $outer) {} }
/* 177 */   public boolean onActivate(EntityPlayer player, float hitX, float hitY) { wasRunning_$eq(false);
/* 178 */     hadErrored_$eq(false);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     BlockPosition position = BlockPosition$.MODULE$.apply((EnvironmentHost)rack());
/* 184 */     player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.ServerInRack().id(), world(), position.x(), GuiType$.MODULE$.embedSlot(position.y(), slot()), position.z());
/*     */     
/*     */     (player.func_130014_f_()).field_72995_K ? BoxedUnit.UNIT : (player.func_70093_af() ? ((!machine().isRunning() && func_70300_a(player)) ? BoxesRunTime.boxToBoolean(machine().start()) : BoxedUnit.UNIT) : BoxedUnit.UNIT);
/* 187 */     return true; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 193 */     return true;
/*     */   }
/*     */   
/*     */   public void update() {
/* 197 */     machine().update();
/*     */     
/* 199 */     boolean isRunning = machine().isRunning();
/* 200 */     boolean hasErrored = !(machine().lastError() == null);
/* 201 */     if (isRunning != wasRunning() || hasErrored != hadErrored()) {
/* 202 */       rack().markChanged(slot());
/*     */     }
/* 204 */     wasRunning_$eq(isRunning);
/* 205 */     hadErrored_$eq(hasErrored);
/* 206 */     (rack().world()).field_72995_K ? BoxedUnit.UNIT : ((tier() == 3) ? BoxesRunTime.boxToDouble(((Connector)node()).changeBuffer(Double.POSITIVE_INFINITY)) : BoxedUnit.UNIT);
/*     */ 
/*     */     
/* 209 */     updateComponents();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState() {
/* 216 */     return machine().isRunning() ? EnumSet.<StateAware.State>of(StateAware.State.IsWorking) : 
/* 217 */       EnumSet.<StateAware.State>noneOf(StateAware.State.class);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 223 */     (new Node[1])[0] = machine().node(); return new Node[1];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */