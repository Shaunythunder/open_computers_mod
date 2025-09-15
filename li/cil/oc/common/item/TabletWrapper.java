/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.Driver;
/*     */ import li.cil.oc.api.Machine;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.driver.item.Container;
/*     */ import li.cil.oc.api.internal.Keyboard;
/*     */ import li.cil.oc.api.internal.Tablet;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.api.machine.MachineHost;
/*     */ import li.cil.oc.api.network.Connector;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Message;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.util.Lifecycle;
/*     */ import li.cil.oc.common.Slot$;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import li.cil.oc.common.item.data.TabletData;
/*     */ import li.cil.oc.server.component.Tablet;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import li.cil.oc.util.RotationHelper$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.PartialFunction;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.collection.immutable.IndexedSeq$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ import scala.runtime.TraitSetter;
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
/*     */ @ScalaSignature(bytes = "\006\001\tEe\001B\001\003\0015\021Q\002V1cY\026$xK]1qa\026\024(BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031R\001\001\b\0279\021\002\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ii\021\001\007\006\0033\021\t\021\"\0338wK:$xN]=\n\005mA\"AE\"p[B|g.\0328u\023:4XM\034;pef\004\"!\b\022\016\003yQ!a\b\021\002\0175\f7\r[5oK*\021\021EB\001\004CBL\027BA\022\037\005-i\025m\0315j]\026Dun\035;\021\005\025BS\"\001\024\013\005\035\002\023\001C5oi\026\024h.\0317\n\005%2#A\002+bE2,G\017\003\005,\001\t\005\r\021\"\001-\003\025\031H/Y2l+\005i\003C\001\0305\033\005y#BA\0021\025\t\t$'A\005nS:,7M]1gi*\t1'A\002oKRL!!N\030\003\023%#X-\\*uC\016\\\007\002C\034\001\005\003\007I\021\001\035\002\023M$\030mY6`I\025\fHCA\035@!\tQT(D\001<\025\005a\024!B:dC2\f\027B\001 <\005\021)f.\033;\t\017\0013\024\021!a\001[\005\031\001\020J\031\t\021\t\003!\021!Q!\n5\naa\035;bG.\004\003\002\003#\001\005\003\007I\021A#\002\rAd\027-_3s+\0051\005CA$L\033\005A%B\001#J\025\tQ\005'\001\004f]RLG/_\005\003\031\"\023A\"\0228uSRL\b\013\\1zKJD\001B\024\001\003\002\004%\taT\001\013a2\f\0270\032:`I\025\fHCA\035Q\021\035\001U*!AA\002\031C\001B\025\001\003\002\003\006KAR\001\ba2\f\0270\032:!\021\025!\006\001\"\001V\003\031a\024N\\5u}Q\031a\013W-\021\005]\003Q\"\001\002\t\013-\032\006\031A\027\t\013\021\033\006\031\001$\t\017m\003!\031!C\0019\006)qo\034:mIV\tQ\f\005\002_A6\tqL\003\002\\a%\021\021m\030\002\006/>\024H\016\032\005\007G\002\001\013\021B/\002\r]|'\017\0343!\021!y\002\001#b\001\n\003)W#\0014\021\005u9\027B\0015\037\005\035i\025m\0315j]\026D\001B\033\001\t\002\003\006KAZ\001\t[\006\034\007.\0338fA!9A\016\001b\001\n\003i\027\001\0023bi\006,\022A\034\t\003_Fl\021\001\035\006\003Y\nI!A\0359\003\025Q\013'\r\\3u\t\006$\030\r\003\004u\001\001\006IA\\\001\006I\006$\030\r\t\005\bm\002\021\r\021\"\001x\003\031!\030M\0317fiV\t\001\020\005\002z}6\t!P\003\002|y\006I1m\\7q_:,g\016\036\006\003{\032\taa]3sm\026\024\030BA\025{\021\035\t\t\001\001Q\001\na\fq\001^1cY\026$\b\005C\005\002\006\001\001\r\021\"\001\002\b\005A\021-\036;p'\0064X-\006\002\002\nA\031!(a\003\n\007\00551HA\004C_>dW-\0318\t\023\005E\001\0011A\005\002\005M\021\001D1vi>\034\026M^3`I\025\fHcA\035\002\026!I\001)a\004\002\002\003\007\021\021\002\005\t\0033\001\001\025)\003\002\n\005I\021-\036;p'\0064X\r\t\005\n\003;\001\001\031!C\005\003\017\tQ\"[:J]&$\030.\0317ju\026$\007\"CA\021\001\001\007I\021BA\022\003EI7/\0238ji&\fG.\033>fI~#S-\035\013\004s\005\025\002\"\003!\002 \005\005\t\031AA\005\021!\tI\003\001Q!\n\005%\021AD5t\023:LG/[1mSj,G\r\t\005\n\003[\001\001\031!C\005\003\017\t1\002\\1tiJ+hN\\5oO\"I\021\021\007\001A\002\023%\0211G\001\020Y\006\034HOU;o]&twm\030\023fcR\031\021(!\016\t\023\001\013y#!AA\002\005%\001\002CA\035\001\001\006K!!\003\002\0311\f7\017\036*v]:Lgn\032\021\t\017\005u\002\001\"\001\002\b\005Q\021n]\"sK\006$\030N^3\t\017\005\005\003\001\"\001\002D\005)\021\016^3ngV\021\021Q\t\t\006u\005\035\0231J\005\004\003\023Z$!B!se\006L\b\003\002\036\002N5J1!a\024<\005\031y\005\017^5p]\"9\0211\013\001\005B\005U\023A\0024bG&tw\r\006\002\002XA!\021\021LA3\033\t\tYF\003\003\002^\005}\023\001B;uS2T1!BA1\025\r\t\031GM\001\017[&tWm\031:bMR4wN]4f\023\021\t9'a\027\003\035\031{'oZ3ESJ,7\r^5p]\"9\0211\016\001\005B\0055\024a\002;p\031>\034\027\r\034\013\005\003/\ny\007\003\005\002r\005%\004\031AA,\003\0251\030\r\\;f\021\035\t)\b\001C!\003o\n\001\002^8HY>\024\027\r\034\013\005\003/\nI\b\003\005\002r\005M\004\031AA,\021\035\ti\b\001C\001\003\n1B]3bI\032\023x.\034(C)R\t\021\bC\004\002\004\002!\t!!\"\002\025]\024\030\016^3U_:\023E\013F\002:\003\017C!\"!#\002\002B\005\t\031AA\005\003)\031G.Z1s'R\fG/\032\005\b\003\033\003A\021IAH\003%ygnQ8o]\026\034G\017F\002:\003#C\001\"a%\002\f\002\007\021QS\001\005]>$W\r\005\003\002\030\006uUBAAM\025\r\tY\nI\001\b]\026$xo\034:l\023\021\ty*!'\003\t9{G-\032\005\b\003G\003A\021KAS\003=\031wN\0348fGRLE/Z7O_\022,GcA\035\002(\"A\0211SAQ\001\004\t)\nC\004\002,\002!\t%!,\002\031=tG)[:d_:tWm\031;\025\007e\ny\013\003\005\002\024\006%\006\031AAK\021\035\t\031\f\001C!\003k\013\021b\0348NKN\034\030mZ3\025\007e\n9\f\003\005\002:\006E\006\031AA^\003\035iWm]:bO\026\004B!a&\002>&!\021qXAM\005\035iUm]:bO\026Dq!a1\001\t\003\n)-\001\003i_N$X#\001,\t\017\005%\007\001\"\021\002L\006\001r-\032;TSj,\027J\034<f]R|'/\037\013\003\003\033\0042AOAh\023\r\t\tn\017\002\004\023:$\bbBAk\001\021\005\023q[\001\023SNLE/Z7WC2LGMR8s'2|G\017\006\004\002\n\005e\027Q\034\005\t\0037\f\031\0161\001\002N\006!1\017\\8u\021\031Y\0231\033a\001[!9\021\021\035\001\005B\005\r\030!E5t+N,\027M\0317f\005f\004F.Y=feR!\021\021BAs\021\031!\025q\034a\001\r\"9\021\021\036\001\005B\005}\024!C7be.$\025N\035;z\021\035\ti\017\001C!\003_\f\021\002\037)pg&$\030n\0348\025\005\005E\bc\001\036\002t&\031\021Q_\036\003\r\021{WO\0317f\021\035\tI\020\001C!\003_\f\021\"\037)pg&$\030n\0348\t\017\005u\b\001\"\021\002p\006I!\020U8tSRLwN\034\005\b\005\003\001A\021IA@\003-i\027M]6DQ\006tw-\0323\t\017\t\025\001\001\"\001\003\b\005\t2m\0348uC&tWM]*m_R$\026\020]3\026\005\t%\001cA\b\003\f%\031!Q\002\t\003\rM#(/\0338h\021\035\021\t\002\001C\001\005'\t\021cY8oi\006Lg.\032:TY>$H+[3s+\t\ti\rC\004\003\030\001!\tE!\007\002%%tG/\032:oC2\034u.\0349p]\026tGo\035\013\003\0057\001Ba\004B\017[%\031!q\004\t\003\021%#XM]1cY\026DqAa\t\001\t\003\022)#A\007d_6\004xN\\3oiNcw\016\036\013\005\003\033\0249\003\003\005\003*\t\005\002\031\001B\026\003\035\tG\r\032:fgN\004BA!\f\00349\031!Ha\f\n\007\tE2(\001\004Qe\026$WMZ\005\005\005\033\021)DC\002\0032mBqA!\017\001\t\003\022Y$\001\tp]6\0137\r[5oK\016{gN\\3diR\031\021H!\020\t\021\005M%q\007a\001\003+CqA!\021\001\t\003\022\031%A\np]6\0137\r[5oK\022K7oY8o]\026\034G\017F\002:\005\013B\001\"a%\003@\001\007\021Q\023\005\b\003'\003A\021\tB%)\t\t)\nC\004\003N\001!\tAa\024\002\rU\004H-\031;f)%I$\021\013B*\005+\0229\006\003\004\\\005\027\002\r!\030\005\007\t\n-\003\031\001$\t\021\005m'1\na\001\003\033D\001B!\027\003L\001\007\021\021B\001\tg\026dWm\031;fI\"9!Q\f\001\005B\t}\023\001\0027pC\022$2!\017B1\021!\021\031Ga\027A\002\t\025\024a\0018ciB!!q\rB6\033\t\021IGC\002\003dAJAA!\034\003j\tqaJ\021+UC\036\034u.\0349pk:$\007b\002B9\001\021\005#1O\001\005g\0064X\rF\002:\005kB\001Ba\031\003p\001\007!Q\r\005\n\005s\002\021\023!C\001\005w\nAc\036:ji\026$vN\024\"UI\021,g-Y;mi\022\nTC\001B?U\021\tIAa ,\005\t\005\005\003\002BB\005\033k!A!\"\013\t\t\035%\021R\001\nk:\034\007.Z2lK\022T1Aa#<\003)\tgN\\8uCRLwN\\\005\005\005\037\023)IA\tv]\016DWmY6fIZ\013'/[1oG\026\004")
/*     */ public class TabletWrapper
/*     */   implements ComponentInventory, Tablet
/*     */ {
/*     */   private ItemStack stack;
/*     */   private EntityPlayer player;
/*     */   private final World world;
/*     */   private Machine machine;
/*     */   private final TabletData data;
/*     */   private final Tablet tablet;
/*     */   private boolean autoSave;
/*     */   private boolean isInitialized;
/*     */   private boolean lastRunning;
/*     */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*     */   private boolean isSizeInventoryReady;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() {
/* 225 */     return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components(this); } public void updateComponents() { ComponentInventory.class.updateComponents(this); } public void connectComponents() { ComponentInventory.class.connectComponents(this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents(this); } public void saveComponents() { ComponentInventory.class.saveComponents(this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit(this); } public void onItemAdded(int slot, ItemStack stack) { ComponentInventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { ComponentInventory.class.onItemRemoved(this, slot, stack); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot(this, slot, stack); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag(this, driver, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState(this, component, state); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public ItemStack stack() { return this.stack; } public void stack_$eq(ItemStack x$1) { this.stack = x$1; } public EntityPlayer player() { return this.player; } public void player_$eq(EntityPlayer x$1) { this.player = x$1; } public TabletWrapper(ItemStack stack, EntityPlayer player) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$(this);
/*     */ 
/*     */ 
/*     */     
/* 229 */     this.world = (player()).field_70170_p;
/*     */ 
/*     */ 
/*     */     
/* 233 */     this.data = new TabletData();
/*     */     
/* 235 */     this.tablet = (world()).field_72995_K ? null : new Tablet(this);
/*     */     
/* 237 */     this.autoSave = true;
/*     */     
/* 239 */     this.isInitialized = !(world()).field_72995_K;
/*     */     
/* 241 */     this.lastRunning = false;
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
/*     */ 
/*     */ 
/*     */     
/* 287 */     readFromNBT();
/* 288 */     if (!(world()).field_72995_K)
/* 289 */     { Network.joinNewNetwork(machine().node());
/* 290 */       double charge = package$.MODULE$.max(0.0D, data().energy() - tablet().node().globalBuffer());
/* 291 */       tablet().node().changeBuffer(charge);
/* 292 */       writeToNBT(writeToNBT$default$1()); }  }
/*     */   public World world() { return this.world; }
/*     */   private Machine machine$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.machine = (world()).field_72995_K ? null : Machine.create((MachineHost)this); this.bitmap$0 = true; }  return this.machine; }  }
/*     */   public Machine machine() { return this.bitmap$0 ? this.machine : machine$lzycompute(); }
/*     */   public TabletData data() { return this.data; }
/*     */   public Tablet tablet() { return this.tablet; }
/* 298 */   public boolean autoSave() { return this.autoSave; } public void autoSave_$eq(boolean x$1) { this.autoSave = x$1; } private boolean isInitialized() { return this.isInitialized; } private void isInitialized_$eq(boolean x$1) { this.isInitialized = x$1; } private boolean lastRunning() { return this.lastRunning; } private void lastRunning_$eq(boolean x$1) { this.lastRunning = x$1; } public boolean isCreative() { return (data().tier() == 3); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])data().items(); } public ForgeDirection facing() { return RotationHelper$.MODULE$.fromYaw((player()).field_70177_z); } public ForgeDirection toLocal(ForgeDirection value) { return RotationHelper$.MODULE$.toLocal(ForgeDirection.NORTH, facing(), value); } public ForgeDirection toGlobal(ForgeDirection value) { return RotationHelper$.MODULE$.toGlobal(ForgeDirection.NORTH, facing(), value); } public void onConnect(Node node) { Node node1 = node(); if (node == null) { if (node1 != null)
/*     */       {
/*     */ 
/*     */         
/* 302 */         Environment environment = node.host(); }  } else { if (node.equals(node1)) { connectComponents(); node.connect((Node)tablet().node()); return; }  Environment environment = node.host(); }  connectComponents(); node.connect((Node)tablet().node()); }
/*     */   public void readFromNBT() { if (stack().func_77942_o()) { NBTTagCompound data = stack().func_77978_p(); load(data); if (!(world()).field_72995_K) { tablet().load(data.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("component").toString())); machine().load(data.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString())); }  }  }
/*     */   public boolean writeToNBT$default$1() { return true; }
/*     */   public void writeToNBT(boolean clearState) { if (!stack().func_77942_o()) stack().func_77982_d(new NBTTagCompound());  NBTTagCompound data = stack().func_77978_p(); if (!(world()).field_72995_K) { if (!data.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()))
/*     */         data.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)new NBTTagCompound());  ExtendedNBT$.MODULE$.extendNBTTagCompound(data).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("component").toString(), (Function1)new TabletWrapper$$anonfun$writeToNBT$1(this)); ExtendedNBT$.MODULE$.extendNBTTagCompound(data).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString(), (Function1)new TabletWrapper$$anonfun$writeToNBT$2(this)); if (clearState)
/*     */         data.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()).func_82580_o("state");  }  save(data); }
/*     */   public final class TabletWrapper$$anonfun$writeToNBT$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(NBTTagCompound x$1) { this.$outer.tablet().save(x$1); } public TabletWrapper$$anonfun$writeToNBT$1(TabletWrapper $outer) {} } public final class TabletWrapper$$anonfun$writeToNBT$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/* 311 */     public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) { this.$outer.machine().save(x$1); } public TabletWrapper$$anonfun$writeToNBT$2(TabletWrapper $outer) {} } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode(this, node);
/* 312 */     if (node != null) { Environment environment = node.host();
/* 313 */       if (environment instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)environment; Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new TabletWrapper$$anonfun$connectItemNode$1(this, textBuffer), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit())); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */          }
/*     */       
/* 316 */       else if (environment instanceof Keyboard) { Keyboard keyboard = (Keyboard)environment; Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new TabletWrapper$$anonfun$connectItemNode$2(this, keyboard), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/*     */       
/* 319 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  }  }
/*     */    public final class TabletWrapper$$anonfun$connectItemNode$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TextBuffer x2$1; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x2, Function1 default) { Option option = x2; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment keyboard = (ManagedEnvironment)some.x(); if (keyboard instanceof Keyboard) { ManagedEnvironment managedEnvironment = keyboard; this.x2$1.node().connect(managedEnvironment.node()); return (B1)BoxedUnit.UNIT; }  }  return (B1)default.apply(x2); } public final boolean isDefinedAt(Option x2) { Option option = x2; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment keyboard = (ManagedEnvironment)some.x(); if (keyboard instanceof Keyboard) return true;  }  return false; } public TabletWrapper$$anonfun$connectItemNode$1(TabletWrapper $outer, TextBuffer x2$1) {} } public final class TabletWrapper$$anonfun$connectItemNode$2 extends AbstractPartialFunction<Option<ManagedEnvironment>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Keyboard x3$1; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x3, Function1 default) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; this.x3$1.node().connect(textBuffer.node()); return (B1)BoxedUnit.UNIT; }  }  return (B1)default.apply(x3); } public final boolean isDefinedAt(Option x3) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) return true;  }  return false; }
/*     */     public TabletWrapper$$anonfun$connectItemNode$2(TabletWrapper $outer, Keyboard x3$1) {} }
/* 324 */   public void onDisconnect(Node node) { Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 325 */       { disconnectComponents();
/* 326 */         tablet().node().remove(); return; }  return; }  disconnectComponents(); tablet().node().remove(); }
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {}
/*     */   
/*     */   public TabletWrapper host() {
/* 332 */     return this;
/*     */   } public int func_70302_i_() {
/* 334 */     return (items()).length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: aload_0
/*     */     //   2: invokevirtual func_70302_i_ : ()I
/*     */     //   5: iconst_1
/*     */     //   6: isub
/*     */     //   7: if_icmpne -> 148
/*     */     //   10: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   13: aload_2
/*     */     //   14: aload_0
/*     */     //   15: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   18: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   21: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   24: astore_3
/*     */     //   25: aload_3
/*     */     //   26: instanceof scala/Some
/*     */     //   29: ifeq -> 136
/*     */     //   32: aload_3
/*     */     //   33: checkcast scala/Some
/*     */     //   36: astore #4
/*     */     //   38: aload #4
/*     */     //   40: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   43: checkcast li/cil/oc/api/driver/Item
/*     */     //   46: astore #5
/*     */     //   48: aload #5
/*     */     //   50: getstatic li/cil/oc/integration/opencomputers/DriverScreen$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverScreen$;
/*     */     //   53: astore #7
/*     */     //   55: dup
/*     */     //   56: ifnonnull -> 68
/*     */     //   59: pop
/*     */     //   60: aload #7
/*     */     //   62: ifnull -> 130
/*     */     //   65: goto -> 76
/*     */     //   68: aload #7
/*     */     //   70: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   73: ifne -> 130
/*     */     //   76: aload #5
/*     */     //   78: aload_2
/*     */     //   79: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   84: aload_0
/*     */     //   85: invokevirtual containerSlotType : ()Ljava/lang/String;
/*     */     //   88: astore #8
/*     */     //   90: dup
/*     */     //   91: ifnonnull -> 103
/*     */     //   94: pop
/*     */     //   95: aload #8
/*     */     //   97: ifnull -> 111
/*     */     //   100: goto -> 130
/*     */     //   103: aload #8
/*     */     //   105: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 130
/*     */     //   111: aload #5
/*     */     //   113: aload_2
/*     */     //   114: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */     //   119: aload_0
/*     */     //   120: invokevirtual containerSlotTier : ()I
/*     */     //   123: if_icmpgt -> 130
/*     */     //   126: iconst_1
/*     */     //   127: goto -> 131
/*     */     //   130: iconst_0
/*     */     //   131: istore #6
/*     */     //   133: goto -> 139
/*     */     //   136: iconst_0
/*     */     //   137: istore #6
/*     */     //   139: iload #6
/*     */     //   141: ifeq -> 148
/*     */     //   144: iconst_1
/*     */     //   145: goto -> 149
/*     */     //   148: iconst_0
/*     */     //   149: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #336	-> 0
/*     */     //   #337	-> 25
/*     */     //   #340	-> 48
/*     */     //   #341	-> 76
/*     */     //   #342	-> 111
/*     */     //   #341	-> 126
/*     */     //   #343	-> 136
/*     */     //   #336	-> 139
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	150	0	this	Lli/cil/oc/common/item/TabletWrapper;
/*     */     //   0	150	1	slot	I
/*     */     //   0	150	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   48	102	5	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70300_a(EntityPlayer player) {
/* 346 */     return (machine() != null && machine().canInteract(player.func_70005_c_()));
/*     */   }
/*     */   public void func_70296_d() {
/* 349 */     data().save(stack());
/* 350 */     (player()).field_71071_by.func_70296_d();
/*     */   }
/*     */ 
/*     */   
/*     */   public double xPosition() {
/* 355 */     return (player()).field_70165_t;
/*     */   } public double yPosition() {
/* 357 */     return (player()).field_70163_u + player().func_70047_e();
/*     */   } public double zPosition() {
/* 359 */     return (player()).field_70161_v;
/*     */   }
/*     */   
/*     */   public void markChanged() {}
/*     */   
/*     */   public String containerSlotType() {
/* 365 */     return (String)data().container().fold((Function0)new TabletWrapper$$anonfun$containerSlotType$1(this), (Function1)new TabletWrapper$$anonfun$containerSlotType$2(this)); } public final class TabletWrapper$$anonfun$containerSlotType$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return Slot$.MODULE$.None(); } public TabletWrapper$$anonfun$containerSlotType$1(TabletWrapper $outer) {} } public final class TabletWrapper$$anonfun$containerSlotType$2 extends AbstractFunction1<ItemStack, String> implements Serializable { public static final long serialVersionUID = 0L; public TabletWrapper$$anonfun$containerSlotType$2(TabletWrapper $outer) {} public final String apply(ItemStack stack) {
/* 366 */       Option option = Option$.MODULE$.apply(Driver.driverFor(stack, this.$outer.getClass()));
/* 367 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof Container) { Container container = (Container)driver; return container.providedSlot(stack); }  }
/* 368 */        return Slot$.MODULE$.None();
/*     */     } }
/*     */   
/* 371 */   public int containerSlotTier() { return BoxesRunTime.unboxToInt(data().container().fold((Function0)new TabletWrapper$$anonfun$containerSlotTier$1(this), (Function1)new TabletWrapper$$anonfun$containerSlotTier$2(this))); } public final class TabletWrapper$$anonfun$containerSlotTier$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return -1; } public TabletWrapper$$anonfun$containerSlotTier$1(TabletWrapper $outer) {} } public final class TabletWrapper$$anonfun$containerSlotTier$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public TabletWrapper$$anonfun$containerSlotTier$2(TabletWrapper $outer) {} public final int apply(ItemStack stack) {
/* 372 */       Option option = Option$.MODULE$.apply(Driver.driverFor(stack, this.$outer.getClass()));
/* 373 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof Container) { Container container = (Container)driver; return container.providedTier(stack); }  }
/* 374 */        return -1;
/*     */     } }
/*     */   
/* 377 */   public Iterable<ItemStack> internalComponents() { return WrapAsJava$.MODULE$.seqAsJavaList((Seq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).collect((PartialFunction)new TabletWrapper$$anonfun$internalComponents$1(this), IndexedSeq$.MODULE$.canBuildFrom())); } public final class TabletWrapper$$anonfun$internalComponents$1 extends AbstractPartialFunction<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(int x5, Function1 default) { Object object; int i = x5;
/* 378 */       if (this.$outer.func_70301_a(i) != null && this.$outer.isComponentSlot(i, this.$outer.func_70301_a(i))) { object = this.$outer.func_70301_a(i); } else { object = default.apply(BoxesRunTime.boxToInteger(x5)); }  return (B1)object; } public final boolean isDefinedAt(int x5) { boolean bool; int i = x5; if (this.$outer.func_70301_a(i) != null && this.$outer.isComponentSlot(i, this.$outer.func_70301_a(i))) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/* 381 */        return bool; } public TabletWrapper$$anonfun$internalComponents$1(TabletWrapper $outer) {} } public int componentSlot(String address) { return Predef$.MODULE$.refArrayOps((Object[])components()).indexWhere((Function1)new TabletWrapper$$anonfun$componentSlot$1(this, address)); } public final class TabletWrapper$$anonfun$componentSlot$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final String address$1; public final boolean apply(Option x$1) { return x$1.exists((Function1)new TabletWrapper$$anonfun$componentSlot$1$$anonfun$apply$1(this)); } public TabletWrapper$$anonfun$componentSlot$1(TabletWrapper $outer, String address$1) {} public final class TabletWrapper$$anonfun$componentSlot$1$$anonfun$apply$1 extends AbstractFunction1<ManagedEnvironment, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(ManagedEnvironment env) { // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   6: ifnull -> 51
/*     */         //   9: aload_1
/*     */         //   10: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   15: invokeinterface address : ()Ljava/lang/String;
/*     */         //   20: aload_0
/*     */         //   21: getfield $outer : Lli/cil/oc/common/item/TabletWrapper$$anonfun$componentSlot$1;
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
/*     */         //   #381	-> 0
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	53	0	this	Lli/cil/oc/common/item/TabletWrapper$$anonfun$componentSlot$1$$anonfun$apply$1;
/*     */         //   0	53	1	env	Lli/cil/oc/api/network/ManagedEnvironment; } public TabletWrapper$$anonfun$componentSlot$1$$anonfun$apply$1(TabletWrapper$$anonfun$componentSlot$1 $outer) {} } }
/* 383 */   public void onMachineConnect(Node node) { onConnect(node); }
/*     */    public void onMachineDisconnect(Node node) {
/* 385 */     onDisconnect(node);
/*     */   }
/*     */   
/*     */   public Node node() {
/* 389 */     return (Node)Option$.MODULE$.apply(machine()).fold((Function0)new TabletWrapper$$anonfun$node$1(this), (Function1)new TabletWrapper$$anonfun$node$2(this)); } public final class TabletWrapper$$anonfun$node$1 extends AbstractFunction0<Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply() { return null; } public TabletWrapper$$anonfun$node$1(TabletWrapper $outer) {} } public final class TabletWrapper$$anonfun$node$2 extends AbstractFunction1<Machine, Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply(Machine x$2) { return x$2.node(); }
/*     */ 
/*     */     
/*     */     public TabletWrapper$$anonfun$node$2(TabletWrapper $outer) {} }
/*     */   
/* 394 */   public void update(World world, EntityPlayer player, int slot, boolean selected) { player_$eq(player);
/*     */     
/* 396 */     isInitialized_$eq(true);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 401 */     connectComponents();
/* 402 */     isInitialized() ? BoxedUnit.UNIT : Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new TabletWrapper$$anonfun$update$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 408 */     if (!world.field_72995_K)
/* 409 */     { (isCreative() && world.func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) ? 
/* 410 */         BoxesRunTime.boxToDouble(((Connector)machine().node()).changeBuffer(Double.POSITIVE_INFINITY)) : BoxedUnit.UNIT;
/*     */       
/* 412 */       machine().update();
/* 413 */       updateComponents();
/* 414 */       data().isRunning_$eq(machine().isRunning());
/* 415 */       data().energy_$eq(tablet().node().globalBuffer());
/* 416 */       data().maxEnergy_$eq(tablet().node().globalBufferSize());
/*     */       
/* 418 */       if (lastRunning() != machine().isRunning())
/* 419 */       { lastRunning_$eq(machine().isRunning());
/* 420 */         func_70296_d();
/*     */         
/* 422 */         if (machine().isRunning())
/* 423 */           Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new TabletWrapper$$anonfun$update$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));  }  }  } public final class TabletWrapper$$anonfun$update$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x6, Function1 default) { Option option = x6; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; textBuffer.setMaximumColorDepth(TextBuffer.ColorDepth.FourBit); textBuffer.setMaximumResolution(80, 25); return (B1)BoxedUnit.UNIT; }  }  return (B1)default.apply(x6); } public final boolean isDefinedAt(Option x6) { Option option = x6; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) return true;  }  return false; } public TabletWrapper$$anonfun$update$1(TabletWrapper $outer) {} } public final class TabletWrapper$$anonfun$update$2 extends AbstractPartialFunction<Option<ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x7, Function1 default) { Option option = x7;
/* 424 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 425 */           textBuffer.setPowerState(true); return (B1)BoxedUnit.UNIT; }
/*     */          }
/*     */        return (B1)default.apply(x7); } public final boolean isDefinedAt(Option x7) { Option option = x7;
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         ManagedEnvironment buffer = (ManagedEnvironment)some.x();
/*     */         if (buffer instanceof TextBuffer)
/*     */           return true; 
/*     */       } 
/*     */       return false; } public TabletWrapper$$anonfun$update$2(TabletWrapper $outer) {} }
/* 435 */   public void load(NBTTagCompound nbt) { data().load(nbt); }
/*     */ 
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 439 */     saveComponents();
/* 440 */     data().save(nbt);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\TabletWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */