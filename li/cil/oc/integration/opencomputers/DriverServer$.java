/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.internal.Rack;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.Server;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverServer$ implements Item, HostAware {
/* 14 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverServer$ MODULE$; public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverServer$() { MODULE$ = this; Item$class.$init$(this); }
/* 15 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[4])[0] = 
/* 16 */       Items.get("server1");
/* 17 */     (new ItemInfo[4])[1] = Items.get("server2");
/* 18 */     (new ItemInfo[4])[2] = Items.get("server3");
/* 19 */     (new ItemInfo[4])[3] = Items.get("serverCreative");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[4])); } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { ManagedEnvironment managedEnvironment;
/* 21 */     EnvironmentHost environmentHost = host;
/* 22 */     if (environmentHost instanceof Rack) { Rack rack = (Rack)environmentHost; managedEnvironment = (ManagedEnvironment)new Server(rack, li.cil.oc.util.ExtendedInventory$.MODULE$.extendedInventory((IInventory)rack).indexOf(stack)); }
/* 23 */     else { managedEnvironment = null; }
/*    */     
/*    */     return managedEnvironment; } public String slot(ItemStack stack) {
/* 26 */     return li.cil.oc.common.Slot$.MODULE$.RackMountable();
/*    */   }
/*    */   public NBTTagCompound dataTag(ItemStack stack) {
/* 29 */     if (!stack.func_77942_o()) {
/* 30 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 32 */     return stack.func_77978_p();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverServer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */