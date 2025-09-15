/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.UpgradeContainerUpgrade;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverContainerUpgrade$ implements Item, Container {
/* 13 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverContainerUpgrade$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverContainerUpgrade$() { MODULE$ = this; Item$class.$init$(this); }
/* 14 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[3])[0] = 
/* 15 */       Items.get("upgradeContainer1");
/* 16 */     (new ItemInfo[3])[1] = Items.get("upgradeContainer2");
/* 17 */     (new ItemInfo[3])[2] = Items.get("upgradeContainer3");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3])); } public scala.runtime.Null$ createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 19 */     return null;
/*    */   } public String slot(ItemStack stack) {
/* 21 */     return li.cil.oc.common.Slot$.MODULE$.Container();
/*    */   } public String providedSlot(ItemStack stack) {
/* 23 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   } public int providedTier(ItemStack stack) {
/* 25 */     return tier(stack);
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 28 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 29 */     if (option instanceof Some) { Some some = (Some)option; Delegate container = (Delegate)some.x(); if (container instanceof UpgradeContainerUpgrade) { UpgradeContainerUpgrade upgradeContainerUpgrade = (UpgradeContainerUpgrade)container; return upgradeContainerUpgrade.tier(); }  }
/* 30 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverContainerUpgrade$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */