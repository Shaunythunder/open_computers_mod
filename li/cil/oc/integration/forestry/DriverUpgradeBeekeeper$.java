/*    */ package li.cil.oc.integration.forestry;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.integration.opencomputers.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverUpgradeBeekeeper$ implements Item, HostAware {
/* 13 */   public boolean worksWith(ItemStack stack, Class host) { return Item.class.worksWith(this, stack, host); } public static final DriverUpgradeBeekeeper$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item.class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item.class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item.class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item.class.isComputer(this, host); } public boolean isRobot(Class host) { return Item.class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item.class.isRotatable(this, host); } public boolean isServer(Class host) { return Item.class.isServer(this, host); } public boolean isTablet(Class host) { return Item.class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item.class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item.class.isDrone(this, host); } private DriverUpgradeBeekeeper$() { MODULE$ = this; Item.class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 14 */     (new ItemInfo[1])[0] = 
/* 15 */       Items.get("beekeeperUpgrade");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { ManagedEnvironment managedEnvironment;
/* 19 */     EnvironmentHost environmentHost = host;
/* 20 */     if (environmentHost instanceof Agent) { Agent agent = (Agent)environmentHost; managedEnvironment = (ManagedEnvironment)new UpgradeBeekeeper(agent); }
/* 21 */     else { managedEnvironment = null; }
/*    */     
/*    */     return (host.world() != null && (host.world()).field_72995_K) ? null : managedEnvironment; } public String slot(ItemStack stack) {
/* 24 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   } public int tier(ItemStack stack) {
/* 26 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\DriverUpgradeBeekeeper$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */