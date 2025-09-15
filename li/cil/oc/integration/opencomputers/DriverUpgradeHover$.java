/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.UpgradeHover;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverUpgradeHover$ implements Item, HostAware {
/* 13 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverUpgradeHover$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverUpgradeHover$() { MODULE$ = this; Item$class.$init$(this); }
/* 14 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[2])[0] = 
/* 15 */       Items.get("hoverUpgrade1");
/* 16 */     (new ItemInfo[2])[1] = Items.get("hoverUpgrade2");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[2])); } public scala.runtime.Null$ createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 18 */     return null;
/*    */   } public String slot(ItemStack stack) {
/* 20 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 23 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 24 */     if (option instanceof Some) { Some some = (Some)option; Delegate upgrade = (Delegate)some.x(); if (upgrade instanceof UpgradeHover) { UpgradeHover upgradeHover = (UpgradeHover)upgrade; return upgradeHover.tier(); }  }
/* 25 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeHover$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */