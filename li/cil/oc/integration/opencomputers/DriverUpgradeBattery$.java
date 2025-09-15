/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.item.UpgradeBattery;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverUpgradeBattery$ implements Item, HostAware {
/* 14 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverUpgradeBattery$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverUpgradeBattery$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 15 */     (new ItemInfo[3])[0] = 
/* 16 */       Items.get("batteryUpgrade1");
/* 17 */     (new ItemInfo[3])[1] = Items.get("batteryUpgrade2");
/* 18 */     (new ItemInfo[3])[2] = Items.get("batteryUpgrade3");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3]));
/*    */   } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 21 */     return (host.world() != null && (host.world()).field_72995_K) ? null : 
/* 22 */       (ManagedEnvironment)new UpgradeBattery(tier(stack));
/*    */   } public String slot(ItemStack stack) {
/* 24 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 27 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 28 */     if (option instanceof Some) { Some some = (Some)option; Delegate battery = (Delegate)some.x(); if (battery instanceof UpgradeBattery) { UpgradeBattery upgradeBattery = (UpgradeBattery)battery; return upgradeBattery.tier(); }  }
/* 29 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeBattery$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */