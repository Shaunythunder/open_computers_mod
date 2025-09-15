/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import li.cil.oc.server.component.FileSystem;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\005b\001B\001\003\0015\021AAU1jI*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\r\001qq#\b\021$!\tyQ#D\001\021\025\t\031\021C\003\002\023'\005IQ.\0338fGJ\fg\r\036\006\002)\005\031a.\032;\n\005Y\001\"A\003+jY\026,e\016^5usB\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005qI\"aC#om&\024xN\\7f]R\004\"\001\007\020\n\005}I\"!C%om\026tGo\034:z!\tA\022%\003\002#3\tI!k\034;bi\006\024G.\032\t\003I%j\021!\n\006\003M\035\nqA\\3uo>\0248N\003\002)\r\005\031\021\r]5\n\005)*#AC!oC2L(0\0312mK\")A\006\001C\001[\0051A(\0338jiz\"\022A\f\t\003_\001i\021A\001\005\bc\001\021\r\021\"\0013\003\021qw\016Z3\026\003M\002\"\001\n\033\n\005U*#\001\002(pI\026Daa\016\001!\002\023\031\024!\0028pI\026\004\003bB\035\001\001\004%\tAO\001\013M&dWm]=ti\026lW#A\036\021\007qz\024)D\001>\025\005q\024!B:dC2\f\027B\001!>\005\031y\005\017^5p]B\021!iR\007\002\007*\021A)R\001\nG>l\007o\0348f]RT!A\022\004\002\rM,'O^3s\023\tA5I\001\006GS2,7+_:uK6DqA\023\001A\002\023\0051*\001\bgS2,7/_:uK6|F%Z9\025\0051{\005C\001\037N\023\tqUH\001\003V]&$\bb\002)J\003\003\005\raO\001\004q\022\n\004B\002*\001A\003&1(A\006gS2,7/_:uK6\004\003b\002+\001\005\004%\t!V\001\006Y\006\024W\r\\\013\002-B\021q\013W\007\002\001\031!\021\f\001\001[\005%\021\026-\0333MC\n,GnE\002Y7\016\004\"\001X1\016\003uS!AX0\002\t1\fgn\032\006\002A\006!!.\031<b\023\t\021WL\001\004PE*,7\r\036\t\003I\036l\021!\032\006\003M\036\n!AZ:\n\005!,'!\002'bE\026d\007\"\002\027Y\t\003QG#\001,\t\017QC\006\031!C\001YV\tQ\016\005\002]]&\021q.\030\002\007'R\024\030N\\4\t\017ED\006\031!C\001e\006IA.\0312fY~#S-\035\013\003\031NDq\001\0259\002\002\003\007Q\016\003\004v1\002\006K!\\\001\007Y\006\024W\r\034\021\t\013]DF\021\t=\002\021\035,G\017T1cK2$\022!\034\005\006ub#\te_\001\tg\026$H*\0312fYR\021A\n \005\006{f\004\rA`\001\006m\006dW/\032\t\004\006\025ab\001\037\002\002%\031\0211A\037\002\rA\023X\rZ3g\023\ry\027q\001\006\004\003\007i\004bBA\0061\022\005\023QB\001\005Y>\fG\rF\002M\003\037A\001\"!\005\002\n\001\007\0211C\001\004]\n$\b\003BA\013\0033i!!a\006\013\007\005E\021#\003\003\002\034\005]!A\004(C)R\013wmQ8na>,h\016\032\005\b\003?AF\021IA\021\003\021\031\030M^3\025\0071\013\031\003\003\005\002\022\005u\001\031AA\n\021\031)\b\001)A\005-\"I\021\021\006\001A\002\023\005\0211F\001\013Y\006\034H/Q2dKN\034XCAA\027!\ra\024qF\005\004\003ci$\001\002'p]\036D\021\"!\016\001\001\004%\t!a\016\002\0351\f7\017^!dG\026\0348o\030\023fcR\031A*!\017\t\023A\013\031$!AA\002\0055\002\002CA\037\001\001\006K!!\f\002\0271\f7\017^!dG\026\0348\017\t\005\n\003\003\002!\031!C\001\003\007\n\001\002\035:fg\026t7-Z\013\003\003\013\002R\001PA$\003\027J1!!\023>\005\025\t%O]1z!\ra\024QJ\005\004\003\037j$a\002\"p_2,\027M\034\005\t\003'\002\001\025!\003\002F\005I\001O]3tK:\034W\r\t\005\b\003/\002A\021IA-\003%yg.\0218bYfTX\r\006\007\002\\\005u\023qNA=\003\007\0139\t\005\003=\003\017\032\004\002CA0\003+\002\r!!\031\002\rAd\027-_3s!\021\t\031'a\033\016\005\005\025$\002BA0\003OR1!!\033\022\003\031)g\016^5us&!\021QNA3\0051)e\016^5usBc\027-_3s\021!\t\t(!\026A\002\005M\024\001B:jI\026\0042\001PA;\023\r\t9(\020\002\004\023:$\b\002CA>\003+\002\r!! \002\t!LG\017\027\t\004y\005}\024bAAA{\t)a\t\\8bi\"A\021QQA+\001\004\ti(\001\003iSRL\006\002CAE\003+\002\r!! \002\t!LGO\027\005\b\003\033\003A\021IAH\003%\031\027M\\+qI\006$X\r\006\002\002L!9\0211\023\001\005B\005U\025\001E4fiNK'0Z%om\026tGo\034:z)\t\t\031\bC\004\002\032\002!\t%!&\002-\035,G/\0238wK:$xN]=Ti\006\0347\016T5nSRDq!!(\001\t\003\ny*\001\njg&#X-\034,bY&$gi\034:TY>$HCBA&\003C\013)\013\003\005\002$\006m\005\031AA:\003\021\031Hn\034;\t\021\005\035\0261\024a\001\003S\013Qa\035;bG.\004B!a+\00226\021\021Q\026\006\004\003_\013\022\001B5uK6LA!a-\002.\nI\021\n^3n'R\f7m\033\005\b\003o\003A\021KA]\003-yg.\023;f[\006#G-\0323\025\0131\013Y,!0\t\021\005\r\026Q\027a\001\003gB\001\"a*\0026\002\007\021\021\026\005\b\003\003\004A\021IAb\003%i\027M]6ESJ$\030\020F\001M\021\035\t9\r\001C)\003\023\fQb\0348Ji\026l'+Z7pm\026$G#\002'\002L\0065\007\002CAR\003\013\004\r!a\035\t\021\005\035\026Q\031a\001\003SCq!!5\001\t\003\t\031.A\007uef\034%/Z1uKJ\013\027\016\032\013\004\031\006U\007bBAl\003\037\004\rA`\001\003S\022Dq!a7\001\t\023\tY#\001\rxSB,G)[:lg\006sGmQ8naV$Xm\0259bG\026Dq!a8\001\t\003\n\t/\001\013sK\006$gI]8n\035\n#fi\034:TKJ4XM\035\013\004\031\006\r\b\002CA\t\003;\004\r!a\005\t\017\005\035\b\001\"\021\002j\006\031rO]5uKR{gJ\021+G_J\034VM\035<feR\031A*a;\t\021\005E\021Q\035a\001\003'Aq!a<\001\t\003\n\t0\001\013sK\006$gI]8n\035\n#fi\034:DY&,g\016\036\013\004\031\006M\b\002CA\t\003[\004\r!a\005)\017\0055\030q_?\003\020A!\021\021 B\006\033\t\tYP\003\003\002~\006}\030A\003:fY\006,hn\0315fe*!!\021\001B\002\003\r1W\016\034\006\005\005\013\0219!\001\003n_\022\034(B\001B\005\003\r\031\007o^\005\005\005\033\tYP\001\005TS\022,wJ\0347zI\t\021\t\"\003\003\003\024\tU\021AB\"M\023\026sEK\003\003\003\030\005m\030\001B*jI\026DqAa\007\001\t\003\022i\"A\nxe&$X\rV8O\005R3uN]\"mS\026tG\017F\002M\005?A\001\"!\005\003\032\001\007\0211\003")
/*     */ public class Raid extends TileEntity implements Environment, Inventory, Rotatable, Analyzable {
/*     */   private final Node node;
/*     */   private Option<FileSystem> filesystem;
/*     */   private final RaidLabel label;
/*     */   private long lastAccess;
/*     */   private final boolean[] presence;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*     */   
/*  22 */   public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory; private boolean isChangeScheduled; private boolean moving; private volatile boolean bitmap$0; public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public ForgeDirection[] validFacings() { return Rotatable.class.validFacings(this); } public void onRotationChanged() { Rotatable.class.onRotationChanged(this); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory(this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$tileentity$traits$Inventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items(this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer(this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot(this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots(this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld(this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2(this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3(this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2(this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void func_145845_h() { Environment.class.updateEntity(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Raid() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this);
/*  23 */     this.node = Network.newNode((Environment)this, Visibility.None).create();
/*     */     
/*  25 */     this.filesystem = (Option<FileSystem>)None$.MODULE$;
/*     */     
/*  27 */     this.label = new RaidLabel(this);
/*     */ 
/*     */     
/*  30 */     this.lastAccess = 0L;
/*     */ 
/*     */     
/*  33 */     this.presence = (boolean[])Array$.MODULE$.fill(func_70302_i_(), (Function0)new Raid$$anonfun$1(this), ClassTag$.MODULE$.Boolean()); } public Node node() { return this.node; } public Option<FileSystem> filesystem() { return this.filesystem; } public void filesystem_$eq(Option<FileSystem> x$1) { this.filesystem = x$1; } public RaidLabel label() { return this.label; } public long lastAccess() { return this.lastAccess; } public void lastAccess_$eq(long x$1) { this.lastAccess = x$1; } public boolean[] presence() { return this.presence; } public final class Raid$$anonfun$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; }
/*     */     
/*     */     public Raid$$anonfun$1(Raid $outer) {} }
/*     */   
/*  37 */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) { (new Node[1])[0] = (Node)filesystem().map((Function1)new Raid$$anonfun$onAnalyze$1(this)).orNull(Predef$.MODULE$.$conforms()); return new Node[1]; } public final class Raid$$anonfun$onAnalyze$1 extends AbstractFunction1<FileSystem, ComponentConnector> implements Serializable { public static final long serialVersionUID = 0L; public final ComponentConnector apply(FileSystem x$1) { return x$1.node(); }
/*     */      public Raid$$anonfun$onAnalyze$1(Raid $outer) {} } public boolean canUpdate() {
/*  39 */     return false;
/*     */   }
/*     */   
/*     */   public int func_70302_i_() {
/*  43 */     return 3;
/*     */   } public int func_70297_j_() {
/*  45 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   3: aload_2
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   8: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   11: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   14: astore_3
/*     */     //   15: aload_3
/*     */     //   16: instanceof scala/Some
/*     */     //   19: ifeq -> 85
/*     */     //   22: aload_3
/*     */     //   23: checkcast scala/Some
/*     */     //   26: astore #4
/*     */     //   28: aload #4
/*     */     //   30: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   33: checkcast li/cil/oc/api/driver/Item
/*     */     //   36: astore #5
/*     */     //   38: aload #5
/*     */     //   40: aload_2
/*     */     //   41: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   46: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   49: invokevirtual HDD : ()Ljava/lang/String;
/*     */     //   52: astore #7
/*     */     //   54: dup
/*     */     //   55: ifnonnull -> 67
/*     */     //   58: pop
/*     */     //   59: aload #7
/*     */     //   61: ifnull -> 75
/*     */     //   64: goto -> 79
/*     */     //   67: aload #7
/*     */     //   69: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   72: ifeq -> 79
/*     */     //   75: iconst_1
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_0
/*     */     //   80: istore #6
/*     */     //   82: goto -> 88
/*     */     //   85: iconst_0
/*     */     //   86: istore #6
/*     */     //   88: iload #6
/*     */     //   90: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 0
/*     */     //   #48	-> 15
/*     */     //   #49	-> 85
/*     */     //   #47	-> 88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	91	0	this	Lli/cil/oc/common/tileentity/Raid;
/*     */     //   0	91	1	slot	I
/*     */     //   0	91	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   38	53	5	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */   
/*     */   public void onItemAdded(int slot, ItemStack stack) {
/*  53 */     Inventory.class.onItemAdded((Inventory)this, slot, stack);
/*  54 */     if (isServer()) synchronized (this) {
/*  55 */         PacketSender$.MODULE$.sendRaidChange(this);
/*  56 */         tryCreateRaid(UUID.randomUUID().toString());
/*     */         return;
/*     */       }  
/*     */   }
/*     */   
/*  61 */   public void func_70296_d() { super.func_70296_d();
/*     */     
/*  63 */     Predef$.MODULE$.booleanArrayOps((boolean[])Predef$.MODULE$.refArrayOps((Object[])items()).map((Function1)new Raid$$anonfun$markDirty$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean()))).copyToArray(presence()); } public final class Raid$$anonfun$markDirty$1 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x$2) { return x$2.isDefined(); }
/*     */     
/*     */     public Raid$$anonfun$markDirty$1(Raid $outer) {} }
/*     */   
/*  67 */   public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack);
/*  68 */     if (isServer()) synchronized (this) {
/*  69 */         PacketSender$.MODULE$.sendRaidChange(this);
/*  70 */         filesystem().foreach((Function1)new Raid$$anonfun$onItemRemoved$1(this)); return;
/*  71 */       }   } public final class Raid$$anonfun$onItemRemoved$1 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Raid$$anonfun$onItemRemoved$1(Raid $outer) {} public final void apply(FileSystem fs) { fs.fileSystem().close();
/*  72 */       Predef$.MODULE$.refArrayOps((Object[])fs.fileSystem().list("/")).foreach((Function1)new Raid$$anonfun$onItemRemoved$1$$anonfun$apply$1(this, fs));
/*  73 */       fs.save(new NBTTagCompound());
/*  74 */       fs.node().remove();
/*  75 */       this.$outer.filesystem_$eq((Option<FileSystem>)None$.MODULE$); }
/*     */      public final class Raid$$anonfun$onItemRemoved$1$$anonfun$apply$1 extends AbstractFunction1<String, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final FileSystem fs$1; public final boolean apply(String x$1) {
/*     */         return this.fs$1.fileSystem().delete(x$1);
/*     */       }
/*     */       public Raid$$anonfun$onItemRemoved$1$$anonfun$apply$1(Raid$$anonfun$onItemRemoved$1 $outer, FileSystem fs$1) {} } }
/*  81 */   public void tryCreateRaid(String id) { if (Predef$.MODULE$.refArrayOps((Object[])items()).count((Function1)new Raid$$anonfun$tryCreateRaid$2(this)) == (items()).length && BoxesRunTime.unboxToBoolean(filesystem().fold((Function0)new Raid$$anonfun$tryCreateRaid$1(this), (Function1)new Raid$$anonfun$tryCreateRaid$3(this, id))))
/*  82 */     { filesystem().foreach((Function1)new Raid$$anonfun$tryCreateRaid$4(this));
/*  83 */       Predef$.MODULE$.refArrayOps((Object[])items()).foreach((Function1)new Raid$$anonfun$tryCreateRaid$5(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  91 */       FileSystem fs = (FileSystem)FileSystem.asManagedEnvironment(
/*  92 */           FileSystem.fromSaveDirectory(id, wipeDisksAndComputeSpace(), Settings$.MODULE$.get().bufferChanges()), 
/*  93 */           label(), (EnvironmentHost)this, (new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":hdd_access").toString(), 6);
/*     */       
/*  95 */       NBTTagCompound nbtToSetAddress = new NBTTagCompound();
/*  96 */       nbtToSetAddress.func_74778_a("address", id);
/*  97 */       fs.node().load(nbtToSetAddress);
/*  98 */       fs.node().setVisibility(Visibility.Network);
/*     */       
/* 100 */       Network.joinNewNetwork(node());
/* 101 */       node().connect((Node)fs.node());
/* 102 */       filesystem_$eq(Option$.MODULE$.apply(fs)); }  } public final class Raid$$anonfun$tryCreateRaid$2 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Option x$3) { return x$3.isDefined(); } public Raid$$anonfun$tryCreateRaid$2(Raid $outer) {} } public final class Raid$$anonfun$tryCreateRaid$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } public Raid$$anonfun$tryCreateRaid$1(Raid $outer) {} } public final class Raid$$anonfun$tryCreateRaid$3 extends AbstractFunction1<FileSystem, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String id$1; public final boolean apply(FileSystem fs) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */       //   4: ifnull -> 44
/*     */       //   7: aload_1
/*     */       //   8: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */       //   11: invokeinterface address : ()Ljava/lang/String;
/*     */       //   16: aload_0
/*     */       //   17: getfield id$1 : Ljava/lang/String;
/*     */       //   20: astore_2
/*     */       //   21: dup
/*     */       //   22: ifnonnull -> 33
/*     */       //   25: pop
/*     */       //   26: aload_2
/*     */       //   27: ifnull -> 40
/*     */       //   30: goto -> 44
/*     */       //   33: aload_2
/*     */       //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   37: ifeq -> 44
/*     */       //   40: iconst_0
/*     */       //   41: goto -> 45
/*     */       //   44: iconst_1
/*     */       //   45: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #81	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	46	0	this	Lli/cil/oc/common/tileentity/Raid$$anonfun$tryCreateRaid$3;
/*     */       //   0	46	1	fs	Lli/cil/oc/server/component/FileSystem; } public Raid$$anonfun$tryCreateRaid$3(Raid $outer, String id$1) {} } public final class Raid$$anonfun$tryCreateRaid$4 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable {
/* 106 */     public static final long serialVersionUID = 0L; public final void apply(FileSystem fs) { if (fs.node() != null) fs.node().remove();  } public Raid$$anonfun$tryCreateRaid$4(Raid $outer) {} } public final class Raid$$anonfun$tryCreateRaid$5 extends AbstractFunction1<Option<ItemStack>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Option fs) { Option option = fs; if (option instanceof Some) { Some some = (Some)option; ItemStack fsStack = (ItemStack)some.x(); DriveData drive = new DriveData(fsStack); drive.lockInfo_$eq(""); drive.isUnmanaged_$eq(false); drive.save(fsStack); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public Raid$$anonfun$tryCreateRaid$5(Raid $outer) {} } private long wipeDisksAndComputeSpace() { return BoxesRunTime.unboxToLong(Predef$.MODULE$.refArrayOps((Object[])items()).foldLeft(BoxesRunTime.boxToLong(0L), (Function2)new Raid$$anonfun$wipeDisksAndComputeSpace$1(this))); } public final class Raid$$anonfun$wipeDisksAndComputeSpace$1 extends AbstractFunction2<Object, Option<ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final long apply(long x0$1, Option x1$1) { Tuple2 tuple2 = new Tuple2(BoxesRunTime.boxToLong(x0$1), x1$1); if (tuple2 != null) {
/* 107 */         long acc = tuple2._1$mcJ$sp(); Option option = (Option)tuple2._2(); if (option instanceof Some) { long l; Some some = (Some)option; ItemStack hdd = (ItemStack)some.x(); Option option1 = Option$.MODULE$.apply(Driver.driverFor(hdd));
/* 108 */           if (option1 instanceof Some) { long l1; Some some1 = (Some)option1; Item driver = (Item)some1.x(); ManagedEnvironment managedEnvironment = driver.createEnvironment(hdd, (EnvironmentHost)this.$outer);
/* 109 */             if (managedEnvironment instanceof FileSystem) { FileSystem fileSystem = (FileSystem)managedEnvironment;
/* 110 */               NBTTagCompound nbt = driver.dataTag(hdd);
/* 111 */               fileSystem.load(nbt);
/* 112 */               fileSystem.fileSystem().close();
/* 113 */               Predef$.MODULE$.refArrayOps((Object[])fileSystem.fileSystem().list("/")).foreach((Function1)new Raid$$anonfun$wipeDisksAndComputeSpace$1$$anonfun$apply$2(this, fileSystem));
/* 114 */               fileSystem.save(nbt);
/* 115 */               l1 = (int)fileSystem.fileSystem().spaceTotal(); }
/* 116 */             else { l1 = 0L; }
/*     */              l = l1; }
/* 118 */           else { l = 0L; }  return acc + l; }
/*     */       
/* 120 */       }  if (tuple2 != null) { long acc = tuple2._1$mcJ$sp(); Option option = (Option)tuple2._2(); if (None$.MODULE$.equals(option)) return acc;  }
/*     */       
/*     */       throw new MatchError(tuple2); } public Raid$$anonfun$wipeDisksAndComputeSpace$1(Raid $outer) {} public final class Raid$$anonfun$wipeDisksAndComputeSpace$1$$anonfun$apply$2 extends AbstractFunction1<String, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final FileSystem x2$1; public final boolean apply(String x$1) {
/*     */         return this.x2$1.fileSystem().delete(x$1);
/*     */       } public Raid$$anonfun$wipeDisksAndComputeSpace$1$$anonfun$apply$2(Raid$$anonfun$wipeDisksAndComputeSpace$1 $outer, FileSystem x2$1) {} } }
/* 126 */   public void readFromNBTForServer(NBTTagCompound nbt) { Rotatable.class.readFromNBTForServer(this, nbt);
/* 127 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs").toString())) {
/* 128 */       NBTTagCompound tag = nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs").toString());
/* 129 */       tryCreateRaid(tag.func_74775_l("node").func_74779_i("address"));
/* 130 */       filesystem().foreach((Function1)new Raid$$anonfun$readFromNBTForServer$1(this, tag));
/*     */     } 
/* 132 */     label().load(nbt); } public final class Raid$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound tag$1; public final void apply(FileSystem fs) {
/*     */       fs.load(this.tag$1);
/*     */     } public Raid$$anonfun$readFromNBTForServer$1(Raid $outer, NBTTagCompound tag$1) {} }
/* 136 */   public void writeToNBTForServer(NBTTagCompound nbt) { Rotatable.class.writeToNBTForServer(this, nbt);
/* 137 */     filesystem().foreach((Function1)new Raid$$anonfun$writeToNBTForServer$1(this, nbt));
/* 138 */     label().save(nbt); } public final class Raid$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<FileSystem, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final NBTTagCompound apply(FileSystem fs) { return ExtendedNBT$.MODULE$.extendNBTTagCompound(this.nbt$1).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs").toString(), (Function1)new Raid$$anonfun$writeToNBTForServer$1$$anonfun$apply$3(this, fs)); } public Raid$$anonfun$writeToNBTForServer$1(Raid $outer, NBTTagCompound nbt$1) {} public final class Raid$$anonfun$writeToNBTForServer$1$$anonfun$apply$3 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final FileSystem fs$2; public final void apply(NBTTagCompound nbt) { this.fs$2.save(nbt); }
/*     */       public Raid$$anonfun$writeToNBTForServer$1$$anonfun$apply$3(Raid$$anonfun$writeToNBTForServer$1 $outer, FileSystem fs$2) {} } }
/*     */   @SideOnly(Side.CLIENT)
/* 143 */   public void readFromNBTForClient(NBTTagCompound nbt) { Rotatable.class.readFromNBTForClient(this, nbt);
/*     */     
/* 145 */     Predef$.MODULE$.booleanArrayOps((boolean[])Predef$.MODULE$.byteArrayOps(nbt.func_74770_j("presence")).map((Function1)new Raid$$anonfun$readFromNBTForClient$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean())))
/* 146 */       .copyToArray(presence());
/* 147 */     label().setLabel(nbt.func_74779_i("label")); } public final class Raid$$anonfun$readFromNBTForClient$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(byte x$4) {
/*     */       return (x$4 != 0);
/*     */     } public Raid$$anonfun$readFromNBTForClient$1(Raid $outer) {} } public void writeToNBTForClient(NBTTagCompound nbt) {
/* 151 */     Rotatable.class.writeToNBTForClient(this, nbt);
/* 152 */     nbt.func_74782_a("presence", (NBTBase)ExtendedNBT$.MODULE$.toNbt((boolean[])Predef$.MODULE$.refArrayOps((Object[])items()).map((Function1)new Raid$$anonfun$writeToNBTForClient$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean()))));
/* 153 */     if (label().getLabel() != null)
/* 154 */       nbt.func_74778_a("label", label().getLabel()); 
/*     */   } public final class Raid$$anonfun$writeToNBTForClient$1 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Option x$5) {
/*     */       return x$5.isDefined();
/*     */     }
/*     */     public Raid$$anonfun$writeToNBTForClient$1(Raid $outer) {} }
/* 160 */   public class RaidLabel implements Label { private String label = "raid"; public String label() { return this.label; } public void label_$eq(String x$1) { this.label = x$1; }
/*     */      public String getLabel() {
/* 162 */       return label();
/*     */     }
/* 164 */     public void setLabel(String value) { label_$eq((String)Option$.MODULE$.apply(value).map((Function1)new Raid$RaidLabel$$anonfun$setLabel$1(this)).orNull(Predef$.MODULE$.$conforms())); } public final class Raid$RaidLabel$$anonfun$setLabel$1 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$6) { return (String)(new StringOps(Predef$.MODULE$.augmentString(x$6))).take(16); }
/*     */        public Raid$RaidLabel$$anonfun$setLabel$1(Raid.RaidLabel $outer) {} }
/*     */     public void load(NBTTagCompound nbt) {
/* 167 */       if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString())) {
/* 168 */         label_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()));
/*     */       }
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 173 */       nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString(), label());
/*     */     }
/*     */     
/*     */     public RaidLabel(Raid $outer) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Raid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */