/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.item.HostAware;
/*    */ import li.cil.oc.api.internal.Rack;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverDiskDriveMountable$ implements Item, HostAware {
/* 14 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverDiskDriveMountable$ MODULE$; public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverDiskDriveMountable$() { MODULE$ = this; Item$class.$init$(this); }
/* 15 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[1])[0] = 
/* 16 */       Items.get("diskDriveMountable");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1])); } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { ManagedEnvironment managedEnvironment;
/* 18 */     EnvironmentHost environmentHost = host;
/* 19 */     if (environmentHost instanceof Rack) { Rack rack = (Rack)environmentHost; managedEnvironment = (ManagedEnvironment)new DiskDriveMountable(rack, li.cil.oc.util.ExtendedInventory$.MODULE$.extendedInventory((IInventory)rack).indexOf(stack)); }
/* 20 */     else { managedEnvironment = null; }
/*    */     
/*    */     return managedEnvironment; } public String slot(ItemStack stack) {
/* 23 */     return li.cil.oc.common.Slot$.MODULE$.RackMountable();
/*    */   }
/*    */   public NBTTagCompound dataTag(ItemStack stack) {
/* 26 */     if (!stack.func_77942_o()) {
/* 27 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 29 */     return stack.func_77978_p();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverDiskDriveMountable$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */