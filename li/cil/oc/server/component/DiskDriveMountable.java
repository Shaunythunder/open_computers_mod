/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.ItemStackInventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\ted\001B\001\003\0015\021!\003R5tW\022\023\030N^3N_VtG/\0312mK*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\b\00191b$\t\024-!\tyA#D\001\021\025\t\t\"#\001\004qe\0264\027M\031\006\003'\031\t1!\0319j\023\t)\002C\001\nNC:\fw-\0323F]ZL'o\0348nK:$\bCA\f\035\033\005A\"BA\r\033\003%IgN^3oi>\024\030P\003\002\034\r\00511m\\7n_:L!!\b\r\003%%#X-\\*uC\016\\\027J\034<f]R|'/\037\t\003/}I!\001\t\r\003%\r{W\016]8oK:$\030J\034<f]R|'/\037\t\003E\021j\021a\t\006\003\007II!!J\022\003\033I\0137m['pk:$\030M\0317f!\t9#&D\001)\025\tI##A\004oKR<xN]6\n\005-B#AC!oC2L(0\0312mKB\021Q\006M\007\002])\021qFE\001\007IJLg/\032:\n\005Er#A\003#fm&\034W-\0238g_\"A1\007\001BC\002\023\005A'\001\003sC\016\\W#A\033\021\005YJT\"A\034\013\005a\022\022\001C5oi\026\024h.\0317\n\005i:$\001\002*bG.D\001\002\020\001\003\002\003\006I!N\001\006e\006\0347\016\t\005\t}\001\021)\031!C\001\005!1\017\\8u+\005\001\005CA!E\033\005\021%\"A\"\002\013M\034\027\r\\1\n\005\025\023%aA%oi\"Aq\t\001B\001B\003%\001)A\003tY>$\b\005C\003J\001\021\005!*\001\004=S:LGO\020\013\004\0276s\005C\001'\001\033\005\021\001\"B\032I\001\004)\004\"\002 I\001\004\001\005b\002)\001\001\004%\t!U\001\013Y\006\034H/Q2dKN\034X#\001*\021\005\005\033\026B\001+C\005\021auN\\4\t\017Y\003\001\031!C\001/\006qA.Y:u\003\016\034Wm]:`I\025\fHC\001-\\!\t\t\025,\003\002[\005\n!QK\\5u\021\035aV+!AA\002I\0131\001\037\0232\021\031q\006\001)Q\005%\006YA.Y:u\003\016\034Wm]:!\021\025\001\007\001\"\001b\00391\027\016\\3tsN$X-\034(pI\026,\022A\031\t\004\003\016,\027B\0013C\005\031y\005\017^5p]B\021qEZ\005\003O\"\022AAT8eK\"A\021\016\001EC\002\0235!.\001\006eKZL7-Z%oM>,\022a\033\t\005YF\0348/D\001n\025\tqw.A\005j[6,H/\0312mK*\021\001OQ\001\013G>dG.Z2uS>t\027B\001:n\005\ri\025\r\035\t\003ifl\021!\036\006\003m^\fA\001\\1oO*\t\0010\001\003kCZ\f\027B\001>v\005\031\031FO]5oO\"AA\020\001E\001B\00361.A\006eKZL7-Z%oM>\004\003\"\002@\001\t\003z\030!D4fi\022+g/[2f\023:4w\016\006\002\002\002AA\0211AA\005\003\027\tY!\004\002\002\006)\031\021qA<\002\tU$\030\016\\\005\004e\006\025\001\003BA\007\003'q1!QA\b\023\r\t\tBQ\001\007!J,G-\0324\n\007i\f)BC\002\002\022\tC\021\"!\007\001\005\004%\t%a\007\002\t9|G-Z\013\003\003;\0012aJA\020\023\r\t\t\003\013\002\n\007>l\007o\0348f]RD\001\"!\n\001A\003%\021QD\001\006]>$W\r\t\005\b\003S\001A\021AA\026\003\035I7/R7qif$b!!\f\002:\005%\003#B!\0020\005M\022bAA\031\005\n)\021I\035:bsB\031\021)!\016\n\007\005]\"I\001\004B]f\024VM\032\005\t\003w\t9\0031\001\002>\00591m\0348uKb$\b\003BA \003\013j!!!\021\013\007\005\r##A\004nC\016D\027N\\3\n\t\005\035\023\021\t\002\b\007>tG/\032=u\021!\tY%a\nA\002\0055\023\001B1sON\004B!a\020\002P%!\021\021KA!\005%\t%oZ;nK:$8\017\013\005\002(\005U\0231LA/!\021\ty$a\026\n\t\005e\023\021\t\002\t\007\006dGNY1dW\006\031Am\\2\"\005\005}\023a\0234v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021DQ\026\0347n\035\021xQ\026$\b.\032:!g>lW\rI7fI&,X\016I5tA\r,(O]3oi2L\b%\0338!i\",\007\005\032:jm\026t\003bBA2\001\021\005\021QM\001\006K*,7\r\036\013\007\003[\t9'!\033\t\021\005m\022\021\ra\001\003{A\001\"a\023\002b\001\007\021Q\n\025\t\003C\n)&a\027\002n\005\022\021qN\001ZMVt7\r^5p]\"Zf/\0327pG&$\030P\0178v[\n,'/X\025;E>|G.Z1oA5j\003%\0226fGR\004C\017[3!GV\024(/\0328uYf\004\003O]3tK:$\b%\\3eSVl\007E\032:p[\002\"\b.\032\021ee&4XM\f\005\b\003g\002A\021AA;\003\025iW\rZ5b)\031\ti#a\036\002z!A\0211HA9\001\004\ti\004\003\005\002L\005E\004\031AA'Q!\t\t(!\026\002\\\005u\024EAA@\003u2WO\\2uS>t\007&\013\036!gR\024\030N\\4![5\002#+\032;ve:\004C\017[3!S:$XM\0358bY\0022Gn\0349qs\002\"\027n]6!C\022$'/Z:t\021\035\t\031\t\001C!\003\013\013\021b\0348B]\006d\027P_3\025\031\005\035\025\021RAR\003O\013\t,!.\021\t\005\013y#\032\005\t\003\027\013\t\t1\001\002\016\0061\001\017\\1zKJ\004B!a$\002 6\021\021\021\023\006\005\003\027\013\031J\003\003\002\026\006]\025AB3oi&$\030P\003\003\002\032\006m\025!C7j]\026\034'/\0314u\025\t\ti*A\002oKRLA!!)\002\022\naQI\034;jif\004F.Y=fe\"9\021QUAA\001\004\001\025\001B:jI\026D\001\"!+\002\002\002\007\0211V\001\005Q&$\b\fE\002B\003[K1!a,C\005\0251En\\1u\021!\t\031,!!A\002\005-\026\001\0025jifC\001\"a.\002\002\002\007\0211V\001\005Q&$(\fC\004\002<\002!\t%!0\002\t!|7\017^\013\003\003\0032aJAa\023\r\t\031\r\013\002\020\013:4\030N]8o[\026tG\017S8ti\"9\021q\031\001\005B\005%\027\001E4fiNK'0Z%om\026tGo\034:z)\005\001\005bBAg\001\021\005\023qZ\001\023SNLE/Z7WC2LGMR8s'2|G\017\006\004\002R\006]\027\021\034\t\004\003\006M\027bAAk\005\n9!i\\8mK\006t\007B\002 \002L\002\007\001\t\003\005\002\\\006-\007\031AAo\003\025\031H/Y2l!\021\ty.!:\016\005\005\005(\002BAr\003/\013A!\033;f[&!\021q]Aq\005%IE/Z7Ti\006\0347\016C\004\002l\002!\t%!<\002#%\034Xk]3bE2,')\037)mCf,'\017\006\003\002R\006=\b\002CAF\003S\004\r!!$\t\017\005M\b\001\"\021\002v\006I1m\0348uC&tWM]\013\003\003;Dq!!?\001\t#\nY0A\006p]&#X-\\!eI\026$G#\002-\002~\006}\bB\002 \002x\002\007\001\t\003\005\002\\\006]\b\031AAo\021\035\021\031\001\001C)\005\013\tQb\0348Ji\026l'+Z7pm\026$G#\002-\003\b\t%\001B\002 \003\002\001\007\001\t\003\005\002\\\n\005\001\031AAo\021\035\021i\001\001C!\005\037\t\021bY1o+B$\027\r^3\025\005\005E\007b\002B\n\001\021\005#QC\001\005Y>\fG\rF\002Y\005/A\001B!\007\003\022\001\007!1D\001\004]\n$\b\003\002B\017\005Ci!Aa\b\013\t\te\021qS\005\005\005G\021yB\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\t\035\002\001\"\021\003*\005!1/\031<f)\rA&1\006\005\t\0053\021)\0031\001\003\034!9!q\006\001\005B\tE\022aB4fi\022\013G/\031\013\003\0057AqA!\016\001\t\003\nI-A\nhKR\034uN\0348fGR\f'\r\\3D_VtG\017C\004\003:\001!\tEa\017\002!\035,GoQ8o]\026\034G/\0312mK\006#H\003\002B\037\005\007\0022A\tB \023\r\021\te\t\002\023%\006\0347NQ;t\007>tg.Z2uC\ndW\rC\004\003F\t]\002\031\001!\002\013%tG-\032=\t\017\t%\003\001\"\021\003L\005QqN\\!di&4\030\r^3\025\021\005E'Q\nB(\005#B\001\"a#\003H\001\007\021Q\022\005\t\003S\0239\0051\001\002,\"A\0211\027B$\001\004\tY\013C\004\003V\001!\tEa\026\002\037\035,GoQ;se\026tGo\025;bi\026$\"A!\027\021\r\005\r!1\fB0\023\021\021i&!\002\003\017\025sW/\\*fiB!!\021\rB:\035\021\021\031G!\034\017\t\t\025$1\016\b\005\005O\022I'D\001\007\023\t\031b!C\002\002\bIIAAa\034\003r\005Q1\013^1uK\006;\030M]3\013\007\005\035!#\003\003\003v\t]$!B*uCR,'\002\002B8\005c\002")
/*     */ public class DiskDriveMountable extends ManagedEnvironment implements ItemStackInventory, ComponentInventory, RackMountable, Analyzable, DeviceInfo {
/*     */   private final Rack rack;
/*     */   private final int slot;
/*     */   private long lastAccess;
/*     */   private Map<String, String> deviceInfo;
/*     */   private final Component node;
/*     */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*     */   private boolean isSizeInventoryReady;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*     */   private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*     */   private volatile byte bitmap$0;
/*     */   
/*  33 */   public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components(this); } public void updateComponents() { ComponentInventory.class.updateComponents(this); } public void connectComponents() { ComponentInventory.class.connectComponents(this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents(this); } public void saveComponents() { ComponentInventory.class.saveComponents(this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit(this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot(this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode(this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag(this, driver, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState(this, component, state); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() : this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items(this); } public void reinitialize() { ItemStackInventory.class.reinitialize(this); } public void func_70296_d() { ItemStackInventory.class.markDirty(this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Rack rack() { return this.rack; } public int slot() { return this.slot; } public DiskDriveMountable(Rack rack, int slot) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$(this); ComponentInventory.class.$init$(this);
/*     */     
/*  35 */     this.lastAccess = 0L;
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
/*  57 */     this.node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  58 */       .withComponent("disk_drive")
/*  59 */       .create(); }
/*     */   public long lastAccess() { return this.lastAccess; }
/*     */   public void lastAccess_$eq(long x$1) { this.lastAccess = x$1; }
/*     */   public Option<Node> filesystemNode() { None$ none$; Option<ManagedEnvironment> option = components()[0]; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); Option option1 = Option$.MODULE$.apply(environment.node()); } else { none$ = None$.MODULE$; }
/*  63 */      return (Option<Node>)none$; } @Callback(doc = "function():boolean -- Checks whether some medium is currently in the drive.") public Object[] isEmpty(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(filesystemNode().isEmpty()) })); }
/*     */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "disk"); (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Floppy disk drive"); (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "RackDrive 100 Rev. 2"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.deviceInfo; }
/*     */      }
/*     */   private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*     */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*  68 */   public Component node() { return this.node; } @Callback(doc = "function([velocity:number]):boolean -- Eject the currently present medium from the drive.") public Object[] eject(Context context, Arguments args) { double velocity = RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(args.optDouble(0, 0.0D)), 0.0D)), 1.0D);
/*  69 */     ItemStack ejected = func_70298_a(0, 1);
/*     */     
/*  71 */     EntityItem entity = InventoryUtils$.MODULE$.spawnStackInWorld(BlockPosition$.MODULE$.apply((EnvironmentHost)rack()), ejected, Option$.MODULE$.apply(rack().facing()), InventoryUtils$.MODULE$.spawnStackInWorld$default$4());
/*  72 */     if (entity != null) {
/*  73 */       double vx = (rack().facing()).offsetX * velocity;
/*  74 */       double vy = (rack().facing()).offsetY * velocity;
/*  75 */       double vz = (rack().facing()).offsetZ * velocity;
/*  76 */       entity.func_70024_g(vx, vy, vz);
/*     */     } 
/*  78 */     return (ejected != null && ejected.field_77994_a > 0) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*     */           
/*  80 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(): string -- Return the internal floppy disk address")
/*     */   public Object[] media(Context context, Arguments args) {
/*  85 */     return filesystemNode().isEmpty() ? 
/*  86 */       package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "drive is empty"
/*     */           
/*  88 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { ((Node)Option$.MODULE$.option2Iterable(filesystemNode()).head()).address() }));
/*     */   }
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ)
/*     */   {
/*  94 */     return (Node[])filesystemNode().fold((Function0)new DiskDriveMountable$$anonfun$onAnalyze$1(this), (Function1)new DiskDriveMountable$$anonfun$onAnalyze$2(this)); } public final class DiskDriveMountable$$anonfun$onAnalyze$1 extends AbstractFunction0<Node[]> implements Serializable { public static final long serialVersionUID = 0L; public final Node[] apply() { return null; } public DiskDriveMountable$$anonfun$onAnalyze$1(DiskDriveMountable $outer) {} } public final class DiskDriveMountable$$anonfun$onAnalyze$2 extends AbstractFunction1<Node, Node[]> implements Serializable { public static final long serialVersionUID = 0L; public final Node[] apply(Node x$1) { (new Node[1])[0] = x$1; return new Node[1]; }
/*     */     
/*     */     public DiskDriveMountable$$anonfun$onAnalyze$2(DiskDriveMountable $outer) {} }
/*     */   
/*     */   public EnvironmentHost host() {
/*  99 */     return (EnvironmentHost)rack();
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/* 104 */     return 1;
/*     */   }
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: new scala/Tuple2
/*     */     //   3: dup
/*     */     //   4: iload_1
/*     */     //   5: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   8: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   11: aload_2
/*     */     //   12: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/driver/Item;
/*     */     //   15: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   18: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   21: astore_3
/*     */     //   22: aload_3
/*     */     //   23: ifnull -> 119
/*     */     //   26: aload_3
/*     */     //   27: invokevirtual _1$mcI$sp : ()I
/*     */     //   30: istore #4
/*     */     //   32: aload_3
/*     */     //   33: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   36: checkcast scala/Option
/*     */     //   39: astore #5
/*     */     //   41: iconst_0
/*     */     //   42: iload #4
/*     */     //   44: if_icmpne -> 119
/*     */     //   47: aload #5
/*     */     //   49: instanceof scala/Some
/*     */     //   52: ifeq -> 119
/*     */     //   55: aload #5
/*     */     //   57: checkcast scala/Some
/*     */     //   60: astore #6
/*     */     //   62: aload #6
/*     */     //   64: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   67: checkcast li/cil/oc/api/driver/Item
/*     */     //   70: astore #7
/*     */     //   72: aload #7
/*     */     //   74: aload_2
/*     */     //   75: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   80: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   83: invokevirtual Floppy : ()Ljava/lang/String;
/*     */     //   86: astore #9
/*     */     //   88: dup
/*     */     //   89: ifnonnull -> 101
/*     */     //   92: pop
/*     */     //   93: aload #9
/*     */     //   95: ifnull -> 109
/*     */     //   98: goto -> 113
/*     */     //   101: aload #9
/*     */     //   103: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   106: ifeq -> 113
/*     */     //   109: iconst_1
/*     */     //   110: goto -> 114
/*     */     //   113: iconst_0
/*     */     //   114: istore #8
/*     */     //   116: goto -> 122
/*     */     //   119: iconst_0
/*     */     //   120: istore #8
/*     */     //   122: iload #8
/*     */     //   124: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 0
/*     */     //   #107	-> 26
/*     */     //   #108	-> 119
/*     */     //   #106	-> 122
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	125	0	this	Lli/cil/oc/server/component/DiskDriveMountable;
/*     */     //   0	125	1	slot	I
/*     */     //   0	125	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   72	53	7	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */   
/*     */   public boolean func_70300_a(EntityPlayer player) {
/* 111 */     return rack().func_70300_a(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack container() {
/* 116 */     return rack().func_70301_a(slot());
/*     */   }
/*     */   public void onItemAdded(int slot, ItemStack stack) {
/* 119 */     ComponentInventory.class.onItemAdded(this, slot, stack);
/* 120 */     Option<ManagedEnvironment> option = components()[slot];
/* 121 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); Node node = environment.node();
/* 122 */       if (node instanceof Component) { Component component = (Component)node; component.setVisibility(Visibility.Network); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */        throw new MatchError(node); }
/* 124 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     
/* 126 */     Sound$.MODULE$.playDiskInsert((EnvironmentHost)rack());
/* 127 */     if (!(rack().world()).field_72995_K) {
/* 128 */       rack().markChanged(slot());
/*     */     }
/*     */   }
/*     */   
/*     */   public void onItemRemoved(int slot, ItemStack stack) {
/* 133 */     ComponentInventory.class.onItemRemoved(this, slot, stack);
/* 134 */     Sound$.MODULE$.playDiskEject((EnvironmentHost)rack());
/* 135 */     if (!(rack().world()).field_72995_K) {
/* 136 */       rack().markChanged(slot());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 143 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 149 */     super.load(nbt);
/* 150 */     Inventory.class.load((Inventory)this, nbt);
/* 151 */     connectComponents();
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 155 */     super.save(nbt);
/* 156 */     ComponentInventory.class.save(this, nbt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound getData() {
/* 163 */     NBTTagCompound nbt = new NBTTagCompound();
/* 164 */     nbt.func_74772_a("lastAccess", lastAccess());
/* 165 */     nbt.func_74782_a("disk", (NBTBase)ExtendedNBT$.MODULE$.toNbt(func_70301_a(0)));
/* 166 */     return nbt;
/*     */   }
/*     */   public int getConnectableCount() {
/* 169 */     return 0;
/*     */   } public RackBusConnectable getConnectableAt(int index) {
/* 171 */     return null;
/*     */   }
/*     */   
/*     */   public boolean onActivate(EntityPlayer player, float hitX, float hitY) {
/* 175 */     boolean isDiskInDrive = !(func_70301_a(0) == null);
/* 176 */     boolean isHoldingDisk = func_94041_b(0, player.func_70694_bm());
/* 177 */     isDiskInDrive ? (
/* 178 */       (rack().world()).field_72995_K ? BoxedUnit.UNIT : 
/* 179 */       BoxesRunTime.boxToBoolean(InventoryUtils$.MODULE$.dropSlot(BlockPosition$.MODULE$.apply((EnvironmentHost)rack()), (IInventory)this, 0, 1, Option$.MODULE$.apply(rack().facing())))) : BoxedUnit.UNIT;
/*     */ 
/*     */     
/* 182 */     if (isHoldingDisk)
/*     */     {
/* 184 */       func_70299_a(0, player.field_71071_by.func_70298_a(player.field_71071_by.field_70461_c, 1));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 189 */     BlockPosition position = BlockPosition$.MODULE$.apply((EnvironmentHost)rack());
/* 190 */     player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.DiskDriveMountableInRack().id(), rack().world(), position.x(), GuiType$.MODULE$.embedSlot(position.y(), slot()), position.z());
/*     */     return player.func_70093_af() ? ((isDiskInDrive || isHoldingDisk)) : true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState() {
/* 198 */     return EnumSet.noneOf(StateAware.State.class);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\DiskDriveMountable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */