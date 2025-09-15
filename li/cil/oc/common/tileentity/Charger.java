/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.common.tileentity.traits.Environment;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\035c\001B\001\003\0015\021qa\0215be\036,'O\003\002\004\t\005QA/\0337fK:$\030\016^=\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\002\001\b\030;\001\032c%K\0315!\tyQ#D\001\021\025\t\031\021C\003\002\023'\005IQ.\0338fGJ\fg\r\036\006\002)\005\031a.\032;\n\005Y\001\"A\003+jY\026,e\016^5usB\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005qI\"aC#om&\024xN\\7f]R\004\"\001\007\020\n\005}I\"!\004)po\026\024\030iY2faR|'\017\005\002\031C%\021!%\007\002\016%\026$7\017^8oK\006;\030M]3\021\005a!\023BA\023\032\005%\021v\016^1uC\ndW\r\005\002\031O%\021\001&\007\002\023\007>l\007o\0348f]RLeN^3oi>\024\030\020\005\002+_5\t1F\003\002-[\0059a.\032;x_J\\'B\001\030\007\003\r\t\007/[\005\003a-\022!\"\0218bYfT\030M\0317f!\tA\"'\003\00243\tQ1\013^1uK\006;\030M]3\021\005UBT\"\001\034\013\005]j\023A\0023sSZ,'/\003\002:m\tQA)\032<jG\026LeNZ8\t\013m\002A\021\001\037\002\rqJg.\033;?)\005i\004C\001 \001\033\005\021\001b\002!\001\005\004%\t!Q\001\005]>$W-F\001C!\tQ3)\003\002EW\tI1i\0348oK\016$xN\035\005\007\r\002\001\013\021\002\"\002\0139|G-\032\021\t\017!\003!\031!C\001\023\006Q1m\0348oK\016$xN]:\026\003)\0032a\023*U\033\005a%BA'O\003\035iW\017^1cY\026T!a\024)\002\025\r|G\016\\3di&|gNC\001R\003\025\0318-\0317b\023\t\031FJA\002TKR\004\"!\026,\016\003\0011qa\026\001\021\002G\005\001L\001\006DQ\006\024x-Z1cY\026\034\"AV-\021\005i[V\"\001)\n\005q\003&AB!osJ+g\rC\003_-\032\005q,A\002q_N,\022\001\031\t\003C\022l\021A\031\006\003GF\tA!\036;jY&\021QM\031\002\005-\026\0347\007C\003h-\032\005\001.\001\007dQ\006tw-\032\"vM\032,'\017\006\002jYB\021!L[\005\003WB\023a\001R8vE2,\007\"B7g\001\004I\027!\0023fYR\f\007BB8\001A\003%!*A\006d_:tWm\031;peN\004\003bB9\001\005\004%\tA]\001\nKF,\030\016]7f]R,\022a\035\t\004\027J#\bCA;y\033\0051(BA<\022\003\021IG/Z7\n\005e4(!C%uK6\034F/Y2l\021\031Y\b\001)A\005g\006QQ-];ja6,g\016\036\021\t\017u\004\001\031!C\001}\006Y1\r[1sO\026\034\006/Z3e+\005I\007\"CA\001\001\001\007I\021AA\002\003=\031\007.\031:hKN\003X-\0323`I\025\fH\003BA\003\003\027\0012AWA\004\023\r\tI\001\025\002\005+:LG\017\003\005\002\016}\f\t\0211\001j\003\rAH%\r\005\b\003#\001\001\025)\003j\0031\031\007.\031:hKN\003X-\0323!\021%\t)\002\001a\001\n\003\t9\"\001\005iCN\004vn^3s+\t\tI\002E\002[\0037I1!!\bQ\005\035\021un\0347fC:D\021\"!\t\001\001\004%\t!a\t\002\031!\f7\017U8xKJ|F%Z9\025\t\005\025\021Q\005\005\013\003\033\ty\"!AA\002\005e\001\002CA\025\001\001\006K!!\007\002\023!\f7\017U8xKJ\004\003\"CA\027\001\001\007I\021AA\f\0031IgN^3siNKwM\\1m\021%\t\t\004\001a\001\n\003\t\031$\001\tj]Z,'\017^*jO:\fGn\030\023fcR!\021QAA\033\021)\ti!a\f\002\002\003\007\021\021\004\005\t\003s\001\001\025)\003\002\032\005i\021N\034<feR\034\026n\0328bY\002B!\"!\020\001\021\013\007IQBA \003)!WM^5dK&sgm\\\013\003\003\003\002\002\"a\021\002J\0055\023QJ\007\003\003\013R1!a\022O\003%IW.\\;uC\ndW-\003\003\002L\005\025#aA'baB!\021qJA-\033\t\t\tF\003\003\002T\005U\023\001\0027b]\036T!!a\026\002\t)\fg/Y\005\005\0037\n\tF\001\004TiJLgn\032\005\013\003?\002\001\022!Q!\016\005\005\023a\0033fm&\034W-\0238g_\002Bq!a\031\001\t\003\n)'A\007hKR$UM^5dK&sgm\034\013\003\003O\002\002\"!\033\002n\005=\024qN\007\003\003WR1aYA+\023\021\tY%a\033\021\t\005E\024q\017\b\0045\006M\024bAA;!\0061\001K]3eK\032LA!a\027\002z)\031\021Q\017)\t\017\005u\004\001\"\025\002\000\005a\001.Y:D_:tWm\031;peR!\021\021DAA\021!\t\031)a\037A\002\005\025\025\001B:jI\026\004B!a\"\002\0226\021\021\021\022\006\004G\006-%bA\003\002\016*\031\021qR\n\002\0355Lg.Z2sC\032$hm\034:hK&!\0211SAE\00591uN]4f\t&\024Xm\031;j_:D\003\"a\037\002\030\006=\026\021\027\t\005\0033\013Y+\004\002\002\034*!\021QTAP\003)\021X\r\\1v]\016DWM\035\006\005\003C\013\031+A\002g[2TA!!*\002(\006!Qn\0343t\025\t\tI+A\002da^LA!!,\002\034\nA1+\0333f\037:d\0270A\003wC2,X\r\n\002\0024&!\021QWA\\\003\031\031E*S#O)*!\021\021XAN\003\021\031\026\016Z3\t\017\005u\006\001\"\025\002@\006I1m\0348oK\016$xN\035\013\005\003\003\f9\r\005\003[\003\007\024\025bAAc!\n1q\n\035;j_:D\001\"a!\002<\002\007\021Q\021\005\007\003\027\004A\021\t@\002!\025tWM]4z)\"\024x.^4iaV$\bbBAh\001\021\005\023\021[\001\020O\026$8)\036:sK:$8\013^1uKR\021\0211\033\t\007\003S\n).!7\n\t\005]\0271\016\002\b\013:,XnU3u!\021\tY.a9\016\005\005u'\002BAp\003C\f!b\025;bi\026\fu/\031:f\025\t\031W&\003\003\002f\006u'!B*uCR,\007bBAu\001\021\005\0231^\001\n_:\fe.\0317zu\026$B\"!<\002t\n\025!Q\002B\f\0057\0012AWAx\023\r\t\t\020\025\002\005\035VdG\016\003\005\002v\006\035\b\031AA|\003\031\001H.Y=feB!\021\021 B\001\033\t\tYP\003\003\002v\006u(bAA\000#\0051QM\034;jifLAAa\001\002|\naQI\034;jif\004F.Y=fe\"A\0211QAt\001\004\0219\001E\002[\005\023I1Aa\003Q\005\rIe\016\036\005\t\005\037\t9\0171\001\003\022\005!\001.\033;Y!\rQ&1C\005\004\005+\001&!\002$m_\006$\b\002\003B\r\003O\004\rA!\005\002\t!LG/\027\005\t\005;\t9\0171\001\003\022\005!\001.\033;[\021\035\021\t\003\001C!\005G\t\021bY1o+B$\027\r^3\025\005\005e\001b\002B\024\001\021%!\021F\001\fG\"\f'oZ3Ti\006\0347\016\006\004\002\006\t-\"q\006\005\b\005[\021)\0031\001u\003\025\031H/Y2l\021\035\021\tD!\nA\002%\faa\0315be\036,\007b\002B\033\001\021\005#qG\001\rkB$\027\r^3F]RLG/\037\013\003\003\013AqAa\017\001\t\003\022i$A\005p]\016{gN\\3diR!\021Q\001B \021\035\001%\021\ba\001\005\003\0022A\013B\"\023\r\021)e\013\002\005\035>$W\rC\004\003J\001!\tEa\023\002)I,\027\r\032$s_6t%\t\026$peN+'O^3s)\021\t)A!\024\t\021\t=#q\ta\001\005#\n1A\0342u!\021\021\031Fa\026\016\005\tU#b\001B(#%!!\021\fB+\0059q%\t\026+bO\016{W\016]8v]\022DqA!\030\001\t\003\022y&A\nxe&$X\rV8O\005R3uN]*feZ,'\017\006\003\002\006\t\005\004\002\003B(\0057\002\rA!\025\t\017\t\025\004\001\"\021\003h\005!\"/Z1e\rJ|WN\024\"U\r>\0248\t\\5f]R$B!!\002\003j!A!q\nB2\001\004\021\t\006\013\005\003d\005]\025qVAY\021\035\021y\007\001C!\005c\n1c\036:ji\026$vN\024\"U\r>\0248\t\\5f]R$B!!\002\003t!A!q\nB7\001\004\021\t\006C\004\003x\001!\tE!\037\002\037%\0348i\\7q_:,g\016^*m_R$b!!\007\003|\t}\004\002\003B?\005k\002\rAa\002\002\tMdw\016\036\005\b\005[\021)\b1\001u\021\035\021\031\t\001C!\005\013\013\001cZ3u'&TX-\0238wK:$xN]=\025\005\t\035\001b\002BE\001\021\005#1R\001\023SNLE/Z7WC2LGMR8s'2|G\017\006\004\002\032\t5%q\022\005\t\005{\0229\t1\001\003\b!9!Q\006BD\001\004!\bb\002BJ\001\021\005#QS\001\024kB$\027\r^3SK\022\034Ho\0348f\023:\004X\017\036\013\005\003\013\0219\n\003\005\002\004\nE\005\031AAC\021\035\021Y\n\001C\001\005o\t\021c\0348OK&<\007NY8s\007\"\fgnZ3e\021\035\021y\n\001C\001\005o\t\001#\0369eCR,7i\0348oK\016$xN]:\007\017\t\r\006!!\001\003&\n\0312i\0348oK\016$xN]\"iCJ<W-\0312mKN!!\021U-U\021)\tiL!)\003\006\004%\t!\021\005\013\005W\023\tK!A!\002\023\021\025AC2p]:,7\r^8sA!91H!)\005\002\t=F\003\002BY\005g\0032!\026BQ\021\035\tiL!,A\002\tCqa\032BQ\t\003\0229\fF\002j\005sCa!\034B[\001\004I\007\002\003B_\005C#\tEa0\002\r\025\fX/\0317t)\021\tIB!1\t\021\t\r'1\030a\001\005\013\f1a\0342k!\rQ&qY\005\004\005\023\004&aA!os\0321!Q\032\001\001\005\037\024qBU8c_R\034\005.\031:hK\006\024G.Z\n\005\005\027\024\t\fC\006\003T\n-'Q1A\005\002\tU\027!\002:pE>$XC\001Bl!\rq$\021\\\005\004\0057\024!!\002*pE>$\bb\003Bp\005\027\024\t\021)A\005\005/\faA]8c_R\004\003bB\036\003L\022\005!1\035\013\005\005K\0249\017E\002V\005\027D\001Ba5\003b\002\007!q\033\005\007=\n-G\021I0\t\021\tu&1\032C!\005[$B!!\007\003p\"A!1\031Bv\001\004\021)\r\003\005\003t\n-G\021\tBC\003!A\027m\0355D_\022,gA\002B|\001\001\021IPA\bEe>tWm\0215be\036,\027M\0317f'\021\021)P!-\t\027\tu(Q\037BC\002\023\005!q`\001\006IJ|g.Z\013\003\007\003\001Baa\001\004\b5\0211Q\001\006\004\003$\021\002BB\005\007\013\021Q\001\022:p]\026D1b!\004\003v\n\005\t\025!\003\004\002\0051AM]8oK\002Bqa\017B{\t\003\031\t\002\006\003\004\024\rU\001cA+\003v\"A!Q`B\b\001\004\031\t\001\003\004_\005k$\te\030\005\t\005{\023)\020\"\021\004\034Q!\021\021DB\017\021!\021\031m!\007A\002\t\025\007\002\003Bz\005k$\tE!\"\007\r\r\r\002\001AB\023\005A\001F.Y=fe\016C\027M]4fC\ndWm\005\003\004\"e#\006bCA{\007C\021)\031!C\001\007S)\"!a>\t\027\r52\021\005B\001B\003%\021q_\001\ba2\f\0270\032:!\021\035Y4\021\005C\001\007c!Baa\r\0046A\031Qk!\t\t\021\005U8q\006a\001\003oDaAXB\021\t\003z\006bB4\004\"\021\00531\b\013\004S\016u\002BB7\004:\001\007\021\016\003\005\003>\016\005B\021IB!)\021\tIba\021\t\021\t\r7q\ba\001\005\013D\001Ba=\004\"\021\005#Q\021")
/*     */ public class Charger extends TileEntity implements PowerAcceptor, RedstoneAware, Rotatable, ComponentInventory, Analyzable, StateAware, DeviceInfo {
/*     */   private final Connector node;
/*     */   private final Set<Chargeable> connectors;
/*     */   private final Set<ItemStack> equipment;
/*     */   private double chargeSpeed;
/*     */   private boolean hasPower;
/*     */   private boolean invertSignal;
/*     */   private Map<String, String> deviceInfo;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual;
/*     */   private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled;
/*     */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*     */   private boolean isSizeInventoryReady;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*     */   private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction;
/*     */   private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch;
/*     */   
/*     */   @Method(modid = "BuildCraft|Core")
/*  33 */   public boolean hasWork() { return StateAware.class.hasWork(this); } private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private final int[] _input; private final int[] _output; private boolean _isOutputEnabled; private boolean shouldUpdateInput; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; private long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; private boolean addedToIC2PowerGrid; @Method(modid = "factorization") private final Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge; private Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void onItemAdded(int slot, ItemStack stack) { ComponentInventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { ComponentInventory.class.onItemRemoved(this, slot, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void dispose() { ComponentInventory.class.dispose(this); } public void onDisconnect(Node node) { ComponentInventory.class.onDisconnect(this, node); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit((ComponentInventory)this); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode((ComponentInventory)this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public ForgeDirection[] validFacings() { return Rotatable.class.validFacings(this); } public void onRotationChanged() { Rotatable.class.onRotationChanged(this); } public int[] _input() { return this._input; } public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled(this); } public void setOutputEnabled(boolean value) { RedstoneAware.class.setOutputEnabled(this, value); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy(this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt(this, value); } public int[] getInput() { return RedstoneAware.class.getInput(this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput(this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput(this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput(this, values); } public int maxInput() { return RedstoneAware.class.maxInput(this); } public int[] getOutput() { return RedstoneAware.class.getOutput(this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput(this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput(this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput(this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged(this); } public void func_145829_t() { RedstoneAware.class.validate(this); } public void onRedstoneInputChanged(RedstoneChangedEventArgs args) { RedstoneAware.class.onRedstoneInputChanged(this, args); } public void onRedstoneOutputEnabledChanged() { RedstoneAware.class.onRedstoneOutputEnabledChanged(this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged(this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged(this); } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque = x$1; } public long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(long x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha = x$1; } @Method(modid = "RotaryCraft") public int getOmega() { return RotaryCraft.class.getOmega((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getTorque() { return RotaryCraft.class.getTorque((RotaryCraft)this); } @Method(modid = "RotaryCraft") public long getPower() { return RotaryCraft.class.getPower((RotaryCraft)this); } @Method(modid = "RotaryCraft") public String getName() { return RotaryCraft.class.getName((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getIORenderAlpha() { return RotaryCraft.class.getIORenderAlpha((RotaryCraft)this); } @Method(modid = "RotaryCraft") public void setIORenderAlpha(int value) { RotaryCraft.class.setIORenderAlpha((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setOmega(int value) { RotaryCraft.class.setOmega((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setTorque(int value) { RotaryCraft.class.setTorque((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setPower(long value) { RotaryCraft.class.setPower((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void noInputMachine() { RotaryCraft.class.noInputMachine((RotaryCraft)this); } @Method(modid = "RotaryCraft") public boolean canReadFrom(ForgeDirection forgeDirection) { return RotaryCraft.class.canReadFrom((RotaryCraft)this, forgeDirection); } @Method(modid = "RotaryCraft") public boolean isReceiving() { return RotaryCraft.class.isReceiving((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getMinTorque(int available) { return RotaryCraft.class.getMinTorque((RotaryCraft)this, available); } @Method(modid = "CoFHAPI|energy") public boolean canConnectEnergy(ForgeDirection from) { return RedstoneFlux.class.canConnectEnergy((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) { return RedstoneFlux.class.receiveEnergy((RedstoneFlux)this, from, maxReceive, simulate); } @Method(modid = "CoFHAPI|energy") public int getEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int getMaxEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getMaxEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) { return RedstoneFlux.class.extractEnergy((RedstoneFlux)this, from, maxExtract, simulate); } @Method(modid = "Mekanism") public boolean canReceiveEnergy(ForgeDirection side) { return Mekanism.class.canReceiveEnergy((Mekanism)this, side); } @Method(modid = "Mekanism") public double transferEnergyToAcceptor(ForgeDirection side, double amount) { return Mekanism.class.transferEnergyToAcceptor((Mekanism)this, side, amount); } @Method(modid = "Mekanism") public double getMaxEnergy() { return Mekanism.class.getMaxEnergy((Mekanism)this); } @Method(modid = "Mekanism") public double getEnergy() { return Mekanism.class.getEnergy((Mekanism)this); } @Method(modid = "Mekanism") public void setEnergy(double energy) { Mekanism.class.setEnergy((Mekanism)this, energy); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer = x$1; } public void func_145843_s() { IndustrialCraft2Classic.class.invalidate((IndustrialCraft2Classic)this); } public void onChunkUnload() { IndustrialCraft2Classic.class.onChunkUnload((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean isAddedToEnergyNet() { return IndustrialCraft2Classic.class.isAddedToEnergyNet((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public int getMaxSafeInput() { return IndustrialCraft2Classic.class.getMaxSafeInput((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) { return IndustrialCraft2Classic.class.acceptsEnergyFrom((IndustrialCraft2Classic)this, emitter, direction); } @Method(modid = "IC2-Classic") public boolean injectEnergy(Direction directionFrom, int amount) { return IndustrialCraft2Classic.class.injectEnergy((IndustrialCraft2Classic)this, directionFrom, amount); } @Method(modid = "IC2-Classic") public int demandsEnergy() { return IndustrialCraft2Classic.class.demandsEnergy((IndustrialCraft2Classic)this); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer = x$1; } @Method(modid = "IC2") public int getSinkTier() { return IndustrialCraft2Experimental.class.getSinkTier((IndustrialCraft2Experimental)this); } @Method(modid = "IC2") public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) { return IndustrialCraft2Experimental.class.acceptsEnergyFrom((IndustrialCraft2Experimental)this, emitter, direction); } @Method(modid = "IC2") public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) { return IndustrialCraft2Experimental.class.injectEnergy((IndustrialCraft2Experimental)this, directionFrom, amount, voltage); } @Method(modid = "IC2") public double getDemandedEnergy() { return IndustrialCraft2Experimental.class.getDemandedEnergy((IndustrialCraft2Experimental)this); } public boolean addedToIC2PowerGrid() { return this.addedToIC2PowerGrid; } public void addedToIC2PowerGrid_$eq(boolean x$1) { this.addedToIC2PowerGrid = x$1; } @Method(modid = "Galacticraft API") public boolean nodeAvailable(EnergySource from) { return Galacticraft.class.nodeAvailable((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float receiveEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.receiveEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public float getEnergyStoredGC(EnergySource from) { return Galacticraft.class.getEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float getMaxEnergyStoredGC(EnergySource from) { return Galacticraft.class.getMaxEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float extractEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.extractEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public boolean canConnect(ForgeDirection from, NetworkType networkType) { return Galacticraft.class.canConnect((Galacticraft)this, from, networkType); } private Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x10) == 0) { this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge = Factorization.class.li$cil$oc$common$tileentity$traits$power$Factorization$$charge((Factorization)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x10); }  return this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; }  } public Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge() { return ((byte)(this.bitmap$0 & 0x10) == 0) ? li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() : this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; } @Method(modid = "factorization") public Charge getCharge() { return Factorization.class.getCharge((Factorization)this); } @Method(modid = "factorization") public String getInfo() { return Factorization.class.getInfo((Factorization)this); } @Method(modid = "factorization") public Coord getCoord() { return Factorization.class.getCoord((Factorization)this); } public Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node() { return this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; } public void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> x$1) { this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node = x$1; } @Method(modid = "appliedenergistics2") public IGridNode getGridNode(ForgeDirection side) { return AppliedEnergistics2.class.getGridNode((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public AECableType getCableConnectionType(ForgeDirection side) { return AppliedEnergistics2.class.getCableConnectionType((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public void securityBreak() { AppliedEnergistics2.class.securityBreak((AppliedEnergistics2)this); } public void tryAllSides(Function2 provider, Function1 fromOther, Function1 toOther) { Common.class.tryAllSides((Common)this, provider, fromOther, toOther); } public boolean canConnectPower(ForgeDirection side) { return Common.class.canConnectPower((Common)this, side); } public double tryChangeBuffer(ForgeDirection side, double amount, boolean doReceive) { return Common.class.tryChangeBuffer((Common)this, side, amount, doReceive); } public double globalBuffer(ForgeDirection side) { return Common.class.globalBuffer((Common)this, side); } public double globalBufferSize(ForgeDirection side) { return Common.class.globalBufferSize((Common)this, side); } public double globalDemand(ForgeDirection side) { return Common.class.globalDemand((Common)this, side); } public boolean tryChangeBuffer$default$3() { return Common.class.tryChangeBuffer$default$3((Common)this); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public boolean isConnected() { return Environment.class.isConnected((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Charger() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); Common.class.$init$((Common)this); AppliedEnergistics2.class.$init$((AppliedEnergistics2)this); Factorization.class.$init$((Factorization)this); Galacticraft.class.$init$((Galacticraft)this); IndustrialCraft2Common.class.$init$((IndustrialCraft2Common)this); IndustrialCraft2Experimental.class.$init$((IndustrialCraft2Experimental)this); IndustrialCraft2Classic.class.$init$((IndustrialCraft2Classic)this); Mekanism.class.$init$((Mekanism)this); RedstoneFlux.class.$init$((RedstoneFlux)this); RotaryCraft.class.$init$((RotaryCraft)this); RotationAware.class.$init$((RotationAware)this); RedstoneAware.class.$init$(this); Rotatable.class.$init$(this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); StateAware.class.$init$(this);
/*  34 */     this.node = (Connector)Network.newNode((Environment)this, Visibility.None)
/*  35 */       .withConnector(Settings$.MODULE$.get().bufferConverter())
/*  36 */       .create();
/*     */     
/*  38 */     this.connectors = Set$.MODULE$.empty();
/*  39 */     this.equipment = Set$.MODULE$.empty();
/*     */     
/*  41 */     this.chargeSpeed = 0.0D;
/*     */     
/*  43 */     this.hasPower = false;
/*     */     
/*  45 */     this.invertSignal = false; } public Connector node() { return this.node; } public Set<Chargeable> connectors() { return this.connectors; } public Set<ItemStack> equipment() { return this.equipment; } public double chargeSpeed() { return this.chargeSpeed; } public void chargeSpeed_$eq(double x$1) { this.chargeSpeed = x$1; } public boolean hasPower() { return this.hasPower; } public void hasPower_$eq(boolean x$1) { this.hasPower = x$1; } public boolean invertSignal() { return this.invertSignal; } public void invertSignal_$eq(boolean x$1) { this.invertSignal = x$1; }
/*     */   
/*  47 */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  48 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  49 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Charger");
/*  50 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  51 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "PowerUpper"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*  54 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean hasConnector(ForgeDirection side) {
/*  59 */     ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*  61 */      } public Option<Connector> connector(ForgeDirection side) { ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*  63 */      } public double energyThroughput() { return Settings$.MODULE$.get().chargerRate(); }
/*     */ 
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState() {
/*  67 */     return connectors().nonEmpty() ? (
/*  68 */       hasPower() ? EnumSet.<StateAware.State>of(StateAware.State.IsWorking) : 
/*  69 */       EnumSet.<StateAware.State>of(StateAware.State.CanWork)) : 
/*     */       
/*  71 */       EnumSet.<StateAware.State>noneOf(StateAware.State.class);
/*     */   }
/*     */   
/*     */   public Null$ onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*  75 */     player.func_145747_a((IChatComponent)Localization$Analyzer$.MODULE$.ChargerSpeed(chargeSpeed()));
/*  76 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/*  81 */     return true;
/*     */   }
/*     */   public void li$cil$oc$common$tileentity$Charger$$chargeStack(ItemStack stack, double charge) {
/*  84 */     if (stack != null && charge > false) {
/*  85 */       double offered = charge + node().changeBuffer(-charge);
/*  86 */       double surplus = ItemCharge$.MODULE$.charge(stack, offered);
/*  87 */       node().changeBuffer(surplus);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_145845_h() {
/*  92 */     RedstoneAware.class.updateEntity(this);
/*     */ 
/*     */     
/*  95 */     if ((world().func_72912_H().func_82573_f() + package$.MODULE$.abs(hashCode())) % 20L == 0L) {
/*  96 */       updateConnectors();
/*     */     }
/*     */     
/*  99 */     if (isServer() && world().func_72912_H().func_82573_f() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 100 */       boolean canCharge = Settings$.MODULE$.get().ignorePower();
/*     */ 
/*     */ 
/*     */       
/* 104 */       double charge = Settings$.MODULE$.get().chargeRateExternal() * chargeSpeed() * Settings$.MODULE$.get().tickFrequency();
/* 105 */       canCharge = (canCharge || (charge > false && node().globalBuffer() >= charge * 0.5D));
/* 106 */       if (canCharge) {
/* 107 */         connectors().foreach((Function1)new Charger$$anonfun$updateEntity$1(this, charge));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       double d1 = Settings$.MODULE$.get().chargeRateTablet() * chargeSpeed() * Settings$.MODULE$.get().tickFrequency();
/* 114 */       canCharge = (canCharge || (d1 > false && node().globalBuffer() >= d1 * 0.5D));
/* 115 */       if (canCharge) ((IterableLike)RichInt$.MODULE$
/* 116 */           .until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).map((Function1)new Charger$$anonfun$updateEntity$2(this), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new Charger$$anonfun$updateEntity$3(this, d1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 122 */       double d2 = Settings$.MODULE$.get().chargeRateTablet() * chargeSpeed() * Settings$.MODULE$.get().tickFrequency();
/* 123 */       canCharge = (canCharge || (d2 > false && node().globalBuffer() >= d2 * 0.5D));
/* 124 */       if (canCharge) {
/* 125 */         equipment().foreach((Function1)new Charger$$anonfun$updateEntity$4(this, d2));
/*     */       }
/*     */ 
/*     */       
/* 129 */       if (hasPower() && !canCharge) {
/* 130 */         hasPower_$eq(false);
/* 131 */         PacketSender$.MODULE$.sendChargerState(this);
/*     */       } 
/* 133 */       if (!hasPower() && canCharge) {
/* 134 */         hasPower_$eq(true);
/* 135 */         PacketSender$.MODULE$.sendChargerState(this);
/*     */       } 
/*     */     } 
/*     */     
/* 139 */     if (isClient() && chargeSpeed() > false && hasPower() && world().func_72912_H().func_82573_f() % 10L == 0L)
/* 140 */       connectors().foreach((Function1)new Charger$$anonfun$updateEntity$5(this)); 
/* 141 */   } public final class Charger$$anonfun$updateEntity$1 extends AbstractFunction1<Chargeable, Object> implements Serializable { public static final long serialVersionUID = 0L; private final double charge$1; public final double apply(Charger.Chargeable connector) { return this.$outer.node().changeBuffer(connector.changeBuffer(this.charge$1 + this.$outer.node().changeBuffer(-this.charge$1))); } public Charger$$anonfun$updateEntity$1(Charger $outer, double charge$1) {} } public final class Charger$$anonfun$updateEntity$2 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(int slot) { return this.$outer.func_70301_a(slot); } public Charger$$anonfun$updateEntity$2(Charger $outer) {} } public final class Charger$$anonfun$updateEntity$3 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final double charge$2; public final void apply(ItemStack x$1) { this.$outer.li$cil$oc$common$tileentity$Charger$$chargeStack(x$1, this.charge$2); } public Charger$$anonfun$updateEntity$3(Charger $outer, double charge$2) {} } public final class Charger$$anonfun$updateEntity$4 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final double charge$3; public final void apply(ItemStack x$2) { this.$outer.li$cil$oc$common$tileentity$Charger$$chargeStack(x$2, this.charge$3); } public Charger$$anonfun$updateEntity$4(Charger $outer, double charge$3) {} } public final class Charger$$anonfun$updateEntity$5 extends AbstractFunction1<Chargeable, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Charger$$anonfun$updateEntity$5(Charger $outer) {} public final void apply(Charger.Chargeable connector) { Vec3 position = connector.pos();
/* 142 */       double theta = (this.$outer.world()).field_73012_v.nextDouble() * Math.PI;
/* 143 */       double phi = (this.$outer.world()).field_73012_v.nextDouble() * Math.PI * 2;
/* 144 */       double dx = 0.45D * Math.sin(theta) * Math.cos(phi);
/* 145 */       double dy = 0.45D * Math.sin(theta) * Math.sin(phi);
/* 146 */       double dz = 0.45D * Math.cos(theta);
/* 147 */       this.$outer.world().func_72869_a("happyVillager", position.field_72450_a + dx, position.field_72448_b + dz, position.field_72449_c + dy, 0.0D, 0.0D, 0.0D); }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 153 */     ComponentInventory.class.onConnect(this, node);
/* 154 */     Connector connector = node(); if (node == null) { if (connector != null) return;  } else { if (node.equals(connector))
/* 155 */       { onNeighborChanged(); return; }  return; }  onNeighborChanged();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 162 */     Inventory.class.readFromNBTForServer((Inventory)this, nbt);
/* 163 */     chargeSpeed_$eq(RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(nbt.func_74769_h("chargeSpeed")), 0.0D)), 1.0D));
/* 164 */     hasPower_$eq(nbt.func_74767_n("hasPower"));
/* 165 */     invertSignal_$eq(nbt.func_74767_n("invertSignal"));
/*     */   }
/*     */   
/*     */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 169 */     Inventory.class.writeToNBTForServer((Inventory)this, nbt);
/* 170 */     nbt.func_74780_a("chargeSpeed", chargeSpeed());
/* 171 */     nbt.func_74757_a("hasPower", hasPower());
/* 172 */     nbt.func_74757_a("invertSignal", invertSignal());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 177 */     ComponentInventory.class.readFromNBTForClient(this, nbt);
/* 178 */     chargeSpeed_$eq(nbt.func_74769_h("chargeSpeed"));
/* 179 */     hasPower_$eq(nbt.func_74767_n("hasPower"));
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 183 */     ComponentInventory.class.writeToNBTForClient(this, nbt);
/* 184 */     nbt.func_74780_a("chargeSpeed", chargeSpeed());
/* 185 */     nbt.func_74757_a("hasPower", hasPower());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isComponentSlot(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_1
/*     */     //   2: aload_2
/*     */     //   3: invokestatic isComponentSlot : (Lli/cil/oc/common/inventory/ComponentInventory;ILnet/minecraft/item/ItemStack;)Z
/*     */     //   6: ifeq -> 106
/*     */     //   9: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   12: aload_2
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   17: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   20: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   23: astore_3
/*     */     //   24: aload_3
/*     */     //   25: instanceof scala/Some
/*     */     //   28: ifeq -> 94
/*     */     //   31: aload_3
/*     */     //   32: checkcast scala/Some
/*     */     //   35: astore #4
/*     */     //   37: aload #4
/*     */     //   39: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   42: checkcast li/cil/oc/api/driver/Item
/*     */     //   45: astore #5
/*     */     //   47: aload #5
/*     */     //   49: aload_2
/*     */     //   50: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   55: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   58: invokevirtual Tablet : ()Ljava/lang/String;
/*     */     //   61: astore #7
/*     */     //   63: dup
/*     */     //   64: ifnonnull -> 76
/*     */     //   67: pop
/*     */     //   68: aload #7
/*     */     //   70: ifnull -> 84
/*     */     //   73: goto -> 88
/*     */     //   76: aload #7
/*     */     //   78: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: istore #6
/*     */     //   91: goto -> 97
/*     */     //   94: iconst_0
/*     */     //   95: istore #6
/*     */     //   97: iload #6
/*     */     //   99: ifeq -> 106
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 107
/*     */     //   106: iconst_0
/*     */     //   107: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #191	-> 0
/*     */     //   #192	-> 24
/*     */     //   #193	-> 94
/*     */     //   #191	-> 97
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	108	0	this	Lli/cil/oc/common/tileentity/Charger;
/*     */     //   0	108	1	slot	I
/*     */     //   0	108	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   47	61	5	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/* 196 */     return 1;
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
/*     */     //   27: ifnull -> 119
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual _1$mcI$sp : ()I
/*     */     //   34: istore #4
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   40: checkcast scala/Option
/*     */     //   43: astore #5
/*     */     //   45: iconst_0
/*     */     //   46: iload #4
/*     */     //   48: if_icmpne -> 119
/*     */     //   51: aload #5
/*     */     //   53: instanceof scala/Some
/*     */     //   56: ifeq -> 119
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
/*     */     //   87: invokevirtual Tablet : ()Ljava/lang/String;
/*     */     //   90: astore #8
/*     */     //   92: dup
/*     */     //   93: ifnonnull -> 105
/*     */     //   96: pop
/*     */     //   97: aload #8
/*     */     //   99: ifnull -> 113
/*     */     //   102: goto -> 119
/*     */     //   105: aload #8
/*     */     //   107: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 119
/*     */     //   113: iconst_1
/*     */     //   114: istore #9
/*     */     //   116: goto -> 128
/*     */     //   119: getstatic li/cil/oc/integration/util/ItemCharge$.MODULE$ : Lli/cil/oc/integration/util/ItemCharge$;
/*     */     //   122: aload_2
/*     */     //   123: invokevirtual canCharge : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   126: istore #9
/*     */     //   128: iload #9
/*     */     //   130: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #198	-> 0
/*     */     //   #199	-> 30
/*     */     //   #200	-> 119
/*     */     //   #198	-> 128
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	131	0	this	Lli/cil/oc/common/tileentity/Charger;
/*     */     //   0	131	1	slot	I
/*     */     //   0	131	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   76	55	7	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateRedstoneInput(ForgeDirection side) {
/* 206 */     RedstoneAware.class.updateRedstoneInput(this, side);
/* 207 */     int signal = RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(BoxesRunTime.unboxToInt(Predef$.MODULE$.intArrayOps(getInput()).max((Ordering)Ordering$Int$.MODULE$))), 15);
/*     */     
/* 209 */     if (invertSignal()) { chargeSpeed_$eq((15 - signal) / 15.0D); }
/* 210 */     else { chargeSpeed_$eq(signal / 15.0D); }
/* 211 */      if (isServer()) {
/* 212 */       PacketSender$.MODULE$.sendChargerState(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void onNeighborChanged() {
/* 217 */     checkRedstoneInputChanged();
/* 218 */     updateConnectors();
/*     */   } public final class Charger$$anonfun$5 extends AbstractFunction1<ForgeDirection, Option<TileEntity>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public Charger$$anonfun$5(Charger $outer) {} public final Option<TileEntity> apply(ForgeDirection side) { BlockPosition blockPos = BlockPosition$.MODULE$.apply((EnvironmentHost)this.$outer).offset(side); return ExtendedWorld$.MODULE$.extendedWorld(this.$outer.world()).blockExists(blockPos) ? Option$.MODULE$.apply(ExtendedWorld$.MODULE$.extendedWorld(this.$outer.world()).getTileEntity(blockPos)) : (Option<TileEntity>)None$.MODULE$; } } public final class Charger$$anonfun$1 extends AbstractPartialFunction<Option<TileEntity>, RobotChargeable> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Option<TileEntity>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; TileEntity t = (TileEntity)some.x(); if (t instanceof RobotProxy) { RobotProxy robotProxy = (RobotProxy)t; return (B1)new Charger.RobotChargeable(this.$outer, robotProxy.robot()); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; TileEntity t = (TileEntity)some.x(); if (t instanceof RobotProxy) return true;  }  return false; } public Charger$$anonfun$1(Charger $outer) {} } public final class Charger$$anonfun$2 extends AbstractPartialFunction<Object, DroneChargeable> implements Serializable {
/* 222 */     public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x2, Function1 default) { Object object2, object1 = x2; if (object1 instanceof Drone) { Drone drone = (Drone)object1; object2 = new Charger.DroneChargeable(this.$outer, drone); } else { object2 = default.apply(x2); }  return (B1)object2; } public final boolean isDefinedAt(Object x2) { boolean bool; Object object = x2; if (object instanceof Drone) { bool = true; } else { bool = false; }  return bool; } public Charger$$anonfun$2(Charger $outer) {} } public void updateConnectors() { RobotChargeable[] robots = (RobotChargeable[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Charger$$anonfun$5(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class))))
/*     */ 
/*     */ 
/*     */       
/* 226 */       .collect((PartialFunction)new Charger$$anonfun$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(RobotChargeable.class)));
/*     */ 
/*     */ 
/*     */     
/* 230 */     AxisAlignedBB bounds = BlockPosition$.MODULE$.apply((EnvironmentHost)this).bounds().func_72314_b(1.0D, 1.0D, 1.0D);
/* 231 */     Buffer drones = (Buffer)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(Drone.class, bounds)).collect((PartialFunction)new Charger$$anonfun$2(this), Buffer$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */     
/* 235 */     Buffer players = (Buffer)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(EntityPlayer.class, bounds)).collect((PartialFunction)new Charger$$anonfun$3(this), Buffer$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */     
/* 239 */     Buffer chargeablePlayers = (Buffer)players.collect((PartialFunction)new Charger$$anonfun$4(this), Buffer$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     Chargeable[] newConnectors = (Chargeable[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])robots).$plus$plus((GenTraversableOnce)drones, Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ConnectorChargeable.class)))).$plus$plus((GenTraversableOnce)chargeablePlayers, Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Chargeable.class)));
/* 246 */     if (connectors().size() != newConnectors.length || (connectors().nonEmpty() && connectors().$minus$minus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])newConnectors)).nonEmpty())) {
/* 247 */       connectors().clear();
/* 248 */       connectors().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.refArrayOps((Object[])newConnectors));
/* 249 */       world().func_147459_d(x(), y(), z(), block());
/*     */     } 
/*     */ 
/*     */     
/* 253 */     equipment().clear();
/* 254 */     players.foreach(
/* 255 */         (Function1)new Charger$$anonfun$updateConnectors$1(this)); } public final class Charger$$anonfun$3 extends AbstractPartialFunction<Object, EntityPlayer> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x3, Function1 default) { Object object2, object1 = x3; if (object1 instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)object1; } else { object2 = default.apply(x3); }  return (B1)object2; } public final boolean isDefinedAt(Object x3) { boolean bool; Object object = x3; if (object instanceof EntityPlayer) { bool = true; } else { bool = false; }  return bool; } public Charger$$anonfun$3(Charger $outer) {} } public final class Charger$$anonfun$4 extends AbstractPartialFunction<EntityPlayer, PlayerChargeable> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends EntityPlayer, B1> B1 applyOrElse(EntityPlayer x4, Function1 default) { Object object; EntityPlayer entityPlayer = x4; if (Nanomachines.hasController(entityPlayer)) { object = new Charger.PlayerChargeable(this.$outer, entityPlayer); } else { object = default.apply(x4); }  return (B1)object; } public final boolean isDefinedAt(EntityPlayer x4) { boolean bool; EntityPlayer entityPlayer = x4; if (Nanomachines.hasController(entityPlayer)) { bool = true; } else { bool = false; }  return bool; } public Charger$$anonfun$4(Charger $outer) {} } public final class Charger$$anonfun$updateConnectors$1 extends AbstractFunction1<EntityPlayer, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(EntityPlayer player) { Predef$.MODULE$.refArrayOps((Object[])player.field_71071_by.field_70462_a).foreach(
/* 256 */           (Function1)new Charger$$anonfun$updateConnectors$1$$anonfun$apply$1(this)); }
/*     */ 
/*     */     
/*     */     public Charger$$anonfun$updateConnectors$1(Charger $outer) {}
/*     */     
/*     */     public final class Charger$$anonfun$updateConnectors$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public Charger$$anonfun$updateConnectors$1$$anonfun$apply$1(Charger$$anonfun$updateConnectors$1 $outer) {}
/*     */       
/*     */       public final Object apply(ItemStack stack) {
/*     */         // Byte code:
/*     */         //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */         //   3: aload_1
/*     */         //   4: aload_0
/*     */         //   5: getfield $outer : Lli/cil/oc/common/tileentity/Charger$$anonfun$updateConnectors$1;
/*     */         //   8: invokevirtual li$cil$oc$common$tileentity$Charger$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */         //   11: invokevirtual getClass : ()Ljava/lang/Class;
/*     */         //   14: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */         //   17: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */         //   20: astore_2
/*     */         //   21: aload_2
/*     */         //   22: instanceof scala/Some
/*     */         //   25: ifeq -> 85
/*     */         //   28: aload_2
/*     */         //   29: checkcast scala/Some
/*     */         //   32: astore_3
/*     */         //   33: aload_3
/*     */         //   34: invokevirtual x : ()Ljava/lang/Object;
/*     */         //   37: checkcast li/cil/oc/api/driver/Item
/*     */         //   40: astore #4
/*     */         //   42: aload #4
/*     */         //   44: aload_1
/*     */         //   45: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */         //   50: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */         //   53: invokevirtual Tablet : ()Ljava/lang/String;
/*     */         //   56: astore #5
/*     */         //   58: dup
/*     */         //   59: ifnonnull -> 71
/*     */         //   62: pop
/*     */         //   63: aload #5
/*     */         //   65: ifnull -> 79
/*     */         //   68: goto -> 85
/*     */         //   71: aload #5
/*     */         //   73: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   76: ifeq -> 85
/*     */         //   79: iconst_1
/*     */         //   80: istore #6
/*     */         //   82: goto -> 94
/*     */         //   85: getstatic li/cil/oc/integration/util/ItemCharge$.MODULE$ : Lli/cil/oc/integration/util/ItemCharge$;
/*     */         //   88: aload_1
/*     */         //   89: invokevirtual canCharge : (Lnet/minecraft/item/ItemStack;)Z
/*     */         //   92: istore #6
/*     */         //   94: iload #6
/*     */         //   96: ifeq -> 118
/*     */         //   99: aload_0
/*     */         //   100: getfield $outer : Lli/cil/oc/common/tileentity/Charger$$anonfun$updateConnectors$1;
/*     */         //   103: invokevirtual li$cil$oc$common$tileentity$Charger$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */         //   106: invokevirtual equipment : ()Lscala/collection/mutable/Set;
/*     */         //   109: aload_1
/*     */         //   110: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/SetLike;
/*     */         //   115: goto -> 121
/*     */         //   118: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   121: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #257	-> 0
/*     */         //   #258	-> 21
/*     */         //   #259	-> 85
/*     */         //   #257	-> 94
/*     */         //   #261	-> 99
/*     */         //   #257	-> 118
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	122	0	this	Lli/cil/oc/common/tileentity/Charger$$anonfun$updateConnectors$1$$anonfun$apply$1;
/*     */         //   0	122	1	stack	Lnet/minecraft/item/ItemStack;
/*     */         //   42	80	4	driver	Lli/cil/oc/api/driver/Item;
/*     */       } } }
/*     */ 
/*     */   
/*     */   public abstract class ConnectorChargeable implements Chargeable { private final Connector connector;
/*     */     
/* 273 */     public Connector connector() { return this.connector; } public ConnectorChargeable(Charger $outer, Connector connector) {} public double changeBuffer(double delta) {
/* 274 */       return connector().changeBuffer(delta);
/*     */     }
/*     */     public boolean equals(Object obj) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof li/cil/oc/common/tileentity/Charger$ConnectorChargeable
/*     */       //   6: ifeq -> 69
/*     */       //   9: aload_2
/*     */       //   10: checkcast li/cil/oc/common/tileentity/Charger$ConnectorChargeable
/*     */       //   13: invokevirtual li$cil$oc$common$tileentity$Charger$ConnectorChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   16: aload_0
/*     */       //   17: invokevirtual li$cil$oc$common$tileentity$Charger$ConnectorChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   20: if_acmpne -> 69
/*     */       //   23: aload_2
/*     */       //   24: checkcast li/cil/oc/common/tileentity/Charger$ConnectorChargeable
/*     */       //   27: astore_3
/*     */       //   28: aload_3
/*     */       //   29: invokevirtual connector : ()Lli/cil/oc/api/network/Connector;
/*     */       //   32: aload_0
/*     */       //   33: invokevirtual connector : ()Lli/cil/oc/api/network/Connector;
/*     */       //   36: astore #5
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 51
/*     */       //   42: pop
/*     */       //   43: aload #5
/*     */       //   45: ifnull -> 59
/*     */       //   48: goto -> 63
/*     */       //   51: aload #5
/*     */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 63
/*     */       //   59: iconst_1
/*     */       //   60: goto -> 64
/*     */       //   63: iconst_0
/*     */       //   64: istore #4
/*     */       //   66: goto -> 72
/*     */       //   69: iconst_0
/*     */       //   70: istore #4
/*     */       //   72: iload #4
/*     */       //   74: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #276	-> 0
/*     */       //   #277	-> 2
/*     */       //   #278	-> 69
/*     */       //   #276	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	75	0	this	Lli/cil/oc/common/tileentity/Charger$ConnectorChargeable;
/*     */       //   0	75	1	obj	Ljava/lang/Object;
/*     */     } }
/*     */   
/*     */   public class RobotChargeable extends ConnectorChargeable { private final Robot robot;
/*     */     
/* 282 */     public Robot robot() { return this.robot; } public RobotChargeable(Charger $outer, Robot robot) { super($outer, (Connector)robot.node()); } public Vec3 pos() {
/* 283 */       return BlockPosition$.MODULE$.apply((EnvironmentHost)robot()).toVec3();
/*     */     }
/*     */     public boolean equals(Object obj) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof li/cil/oc/common/tileentity/Charger$RobotChargeable
/*     */       //   6: ifeq -> 69
/*     */       //   9: aload_2
/*     */       //   10: checkcast li/cil/oc/common/tileentity/Charger$RobotChargeable
/*     */       //   13: invokevirtual li$cil$oc$common$tileentity$Charger$RobotChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   16: aload_0
/*     */       //   17: invokevirtual li$cil$oc$common$tileentity$Charger$RobotChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   20: if_acmpne -> 69
/*     */       //   23: aload_2
/*     */       //   24: checkcast li/cil/oc/common/tileentity/Charger$RobotChargeable
/*     */       //   27: astore_3
/*     */       //   28: aload_3
/*     */       //   29: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */       //   32: aload_0
/*     */       //   33: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */       //   36: astore #5
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 51
/*     */       //   42: pop
/*     */       //   43: aload #5
/*     */       //   45: ifnull -> 59
/*     */       //   48: goto -> 63
/*     */       //   51: aload #5
/*     */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 63
/*     */       //   59: iconst_1
/*     */       //   60: goto -> 64
/*     */       //   63: iconst_0
/*     */       //   64: istore #4
/*     */       //   66: goto -> 72
/*     */       //   69: iconst_0
/*     */       //   70: istore #4
/*     */       //   72: iload #4
/*     */       //   74: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #285	-> 0
/*     */       //   #286	-> 2
/*     */       //   #287	-> 69
/*     */       //   #285	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	75	0	this	Lli/cil/oc/common/tileentity/Charger$RobotChargeable;
/*     */       //   0	75	1	obj	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/* 290 */       return robot().hashCode();
/*     */     } }
/*     */   public class DroneChargeable extends ConnectorChargeable { private final Drone drone;
/* 293 */     public Drone drone() { return this.drone; } public DroneChargeable(Charger $outer, Drone drone) { super($outer, (Connector)drone.components().node()); } public Vec3 pos() {
/* 294 */       return Vec3.func_72443_a((drone()).field_70165_t, (drone()).field_70163_u, (drone()).field_70161_v);
/*     */     }
/*     */     public boolean equals(Object obj) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof li/cil/oc/common/tileentity/Charger$DroneChargeable
/*     */       //   6: ifeq -> 69
/*     */       //   9: aload_2
/*     */       //   10: checkcast li/cil/oc/common/tileentity/Charger$DroneChargeable
/*     */       //   13: invokevirtual li$cil$oc$common$tileentity$Charger$DroneChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   16: aload_0
/*     */       //   17: invokevirtual li$cil$oc$common$tileentity$Charger$DroneChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   20: if_acmpne -> 69
/*     */       //   23: aload_2
/*     */       //   24: checkcast li/cil/oc/common/tileentity/Charger$DroneChargeable
/*     */       //   27: astore_3
/*     */       //   28: aload_3
/*     */       //   29: invokevirtual drone : ()Lli/cil/oc/common/entity/Drone;
/*     */       //   32: aload_0
/*     */       //   33: invokevirtual drone : ()Lli/cil/oc/common/entity/Drone;
/*     */       //   36: astore #5
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 51
/*     */       //   42: pop
/*     */       //   43: aload #5
/*     */       //   45: ifnull -> 59
/*     */       //   48: goto -> 63
/*     */       //   51: aload #5
/*     */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 63
/*     */       //   59: iconst_1
/*     */       //   60: goto -> 64
/*     */       //   63: iconst_0
/*     */       //   64: istore #4
/*     */       //   66: goto -> 72
/*     */       //   69: iconst_0
/*     */       //   70: istore #4
/*     */       //   72: iload #4
/*     */       //   74: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #296	-> 0
/*     */       //   #297	-> 2
/*     */       //   #298	-> 69
/*     */       //   #296	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	75	0	this	Lli/cil/oc/common/tileentity/Charger$DroneChargeable;
/*     */       //   0	75	1	obj	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/* 301 */       return drone().hashCode();
/*     */     } }
/*     */   public class PlayerChargeable implements Chargeable { private final EntityPlayer player;
/* 304 */     public EntityPlayer player() { return this.player; } public PlayerChargeable(Charger $outer, EntityPlayer player) {} public Vec3 pos() {
/* 305 */       return Vec3.func_72443_a((player()).field_70165_t, (player()).field_70163_u, (player()).field_70161_v);
/*     */     } public double changeBuffer(double delta) {
/*     */       double d;
/* 308 */       Controller controller = Nanomachines.getController(player());
/* 309 */       if (controller != null) { Controller controller1 = controller; d = controller1.changeBuffer(delta); }
/* 310 */       else { d = delta; }
/*     */       
/*     */       return d;
/*     */     }
/*     */     public boolean equals(Object obj) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof li/cil/oc/common/tileentity/Charger$PlayerChargeable
/*     */       //   6: ifeq -> 69
/*     */       //   9: aload_2
/*     */       //   10: checkcast li/cil/oc/common/tileentity/Charger$PlayerChargeable
/*     */       //   13: invokevirtual li$cil$oc$common$tileentity$Charger$PlayerChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   16: aload_0
/*     */       //   17: invokevirtual li$cil$oc$common$tileentity$Charger$PlayerChargeable$$$outer : ()Lli/cil/oc/common/tileentity/Charger;
/*     */       //   20: if_acmpne -> 69
/*     */       //   23: aload_2
/*     */       //   24: checkcast li/cil/oc/common/tileentity/Charger$PlayerChargeable
/*     */       //   27: astore_3
/*     */       //   28: aload_3
/*     */       //   29: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   32: aload_0
/*     */       //   33: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   36: astore #5
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 51
/*     */       //   42: pop
/*     */       //   43: aload #5
/*     */       //   45: ifnull -> 59
/*     */       //   48: goto -> 63
/*     */       //   51: aload #5
/*     */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 63
/*     */       //   59: iconst_1
/*     */       //   60: goto -> 64
/*     */       //   63: iconst_0
/*     */       //   64: istore #4
/*     */       //   66: goto -> 72
/*     */       //   69: iconst_0
/*     */       //   70: istore #4
/*     */       //   72: iload #4
/*     */       //   74: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #314	-> 0
/*     */       //   #315	-> 2
/*     */       //   #316	-> 69
/*     */       //   #314	-> 72
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	75	0	this	Lli/cil/oc/common/tileentity/Charger$PlayerChargeable;
/*     */       //   0	75	1	obj	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/* 319 */       return player().hashCode();
/*     */     } }
/*     */ 
/*     */   
/*     */   public interface Chargeable {
/*     */     Vec3 pos();
/*     */     
/*     */     double changeBuffer(double param1Double);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Charger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */