/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.common.inventory.DatabaseInventory;
/*    */ import li.cil.oc.common.inventory.Inventory;
/*    */ import li.cil.oc.common.inventory.ItemStackInventory;
/*    */ import li.cil.oc.common.inventory.SimpleInventory;
/*    */ import li.cil.oc.common.item.UpgradeDatabase;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ 
/*    */ public final class DriverUpgradeDatabase$ implements Item, HostAware {
/* 15 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverUpgradeDatabase$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverUpgradeDatabase$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 16 */     (new ItemInfo[3])[0] = 
/* 17 */       Items.get("databaseUpgrade1");
/* 18 */     (new ItemInfo[3])[1] = Items.get("databaseUpgrade2");
/* 19 */     (new ItemInfo[3])[2] = Items.get("databaseUpgrade3");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3]));
/*    */   }
/* 22 */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { return (host.world() != null && (host.world()).field_72995_K) ? null : 
/* 23 */       (ManagedEnvironment)new UpgradeDatabase((IInventory)new DriverUpgradeDatabase$$anon$1(stack)); } public final class DriverUpgradeDatabase$$anon$1 implements DatabaseInventory { private final ItemStack stack$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0; public int tier() { return DatabaseInventory.class.tier(this); } public int func_70302_i_() { return DatabaseInventory.class.getSizeInventory(this); } public String inventoryName() { return DatabaseInventory.class.inventoryName(this); } public int func_70297_j_() { return DatabaseInventory.class.getInventoryStackLimit(this); } public int getInventoryStackRequired() { return DatabaseInventory.class.getInventoryStackRequired(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DatabaseInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public DriverUpgradeDatabase$$anon$1(ItemStack stack$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DatabaseInventory.class.$init$(this); } public ItemStack container() {
/* 24 */       return this.stack$1;
/*    */     } public boolean func_70300_a(EntityPlayer player) {
/* 26 */       return false;
/*    */     } }
/*    */   public String slot(ItemStack stack) {
/* 29 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 32 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 33 */     if (option instanceof Some) { Some some = (Some)option; Delegate database = (Delegate)some.x(); if (database instanceof UpgradeDatabase) { UpgradeDatabase upgradeDatabase = (UpgradeDatabase)database; return upgradeDatabase.tier(); }  }
/* 34 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeDatabase$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */