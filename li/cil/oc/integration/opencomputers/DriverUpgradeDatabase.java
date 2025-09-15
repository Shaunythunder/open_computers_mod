/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.inventory.DatabaseInventory;
/*    */ import li.cil.oc.common.inventory.Inventory;
/*    */ import li.cil.oc.common.inventory.ItemStackInventory;
/*    */ import li.cil.oc.common.inventory.SimpleInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.collection.Seq;
/*    */ @ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\tQ\003\022:jm\026\024X\013]4sC\022,G)\031;bE\006\034XM\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\006#sSZ,'/\0269he\006$W\rR1uC\n\f7/Z\n\005\037IQR\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n!\tqR%D\001 \025\t\001\023%\001\003ji\026l'B\001\022$\003\031!'/\033<fe*\021AEB\001\004CBL\027B\001\024 \005%Aun\035;Bo\006\024X\rC\003)\037\021\005\021&\001\004=S:LGO\020\013\002\033!)1f\004C!Y\005Iqo\034:lg^KG\017\033\013\003[M\002\"AL\031\016\003=R\021\001M\001\006g\016\fG.Y\005\003e=\022qAQ8pY\026\fg\016C\0035U\001\007Q'A\003ti\006\0347\016\005\0027y5\tqG\003\002!q)\021\021HO\001\n[&tWm\031:bMRT\021aO\001\004]\026$\030BA\0378\005%IE/Z7Ti\006\0347\016C\003@\037\021\005\003)A\tde\026\fG/Z#om&\024xN\\7f]R$2!Q$I!\t\021U)D\001D\025\t!5%A\004oKR<xN]6\n\005\031\033%AE'b]\006<W\rZ#om&\024xN\\7f]RDQ\001\016 A\002UBQ!\023 A\002)\013A\001[8tiB\021!iS\005\003\031\016\023q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006\035>!\teT\001\005g2|G\017\006\002Q'B\0211#U\005\003%R\021aa\025;sS:<\007\"\002\033N\001\004)\004\"B+\020\t\0032\026\001\002;jKJ$\"a\026.\021\0059B\026BA-0\005\rIe\016\036\005\006iQ\003\r!N\004\0069>A\t!X\001\t!J|g/\0333feB\021alX\007\002\037\031)\001m\004E\001C\nA\001K]8wS\022,'oE\002`%\t\004\"a\0313\016\003\005J!!Z\021\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\013!zF\021A4\025\003uCQ![0\005B)\fabZ3u\013:4\030N]8o[\026tG\017\006\002l}B\022A.\036\t\004[B\034hB\001\030o\023\tyw&\001\004Qe\026$WMZ\005\003cJ\024Qa\0217bgNT!a\\\030\021\005Q,H\002\001\003\nm\"\f\t\021!A\003\002]\0241a\030\0232#\tA8\020\005\002/s&\021!p\f\002\b\035>$\b.\0338h!\tqC0\003\002~_\t\031\021I\\=\t\013QB\007\031A\033")
/*    */ public final class DriverUpgradeDatabase { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeDatabase$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverUpgradeDatabase$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverUpgradeDatabase$.MODULE$.dataTag(paramItemStack); } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeDatabase$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeDatabase$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeDatabase$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeDatabase$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeDatabase$.MODULE$.worksWith(paramItemStack);
/* 23 */   } public final class DriverUpgradeDatabase$$anon$1 implements DatabaseInventory { private final ItemStack stack$1; public int tier() { return DatabaseInventory.class.tier(this); } private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0; public int func_70302_i_() { return DatabaseInventory.class.getSizeInventory(this); } public String inventoryName() { return DatabaseInventory.class.inventoryName(this); } public int func_70297_j_() { return DatabaseInventory.class.getInventoryStackLimit(this); } public int getInventoryStackRequired() { return DatabaseInventory.class.getInventoryStackRequired(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DatabaseInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public DriverUpgradeDatabase$$anon$1(ItemStack stack$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DatabaseInventory.class.$init$(this); } public ItemStack container() {
/* 24 */       return this.stack$1;
/*    */     } public boolean func_70300_a(EntityPlayer player) {
/* 26 */       return false;
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class Provider$
/*    */     implements EnvironmentProvider
/*    */   {
/*    */     public static final Provider$ MODULE$;
/*    */     
/*    */     public Provider$() {
/* 37 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 39 */       return DriverUpgradeDatabase$.MODULE$.worksWith(stack) ? 
/* 40 */         UpgradeDatabase.class : 
/* 41 */         null;
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */