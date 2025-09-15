/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.WirelessNetworkCard;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverWirelessNetworkCard$ implements Item {
/*    */   public static final DriverWirelessNetworkCard$ MODULE$;
/*    */   
/* 14 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverWirelessNetworkCard$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 15 */     (new ItemInfo[2])[0] = 
/* 16 */       Items.get("wlanCard1");
/* 17 */     (new ItemInfo[2])[1] = Items.get("wlanCard2");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[2]));
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 21 */     int i = tier(stack); switch (i) { default: case 1: 
/* 22 */       case 0: break; }  return (host.world() != null && (host.world()).field_72995_K) ? null : (ManagedEnvironment)new WirelessNetworkCard.Tier1(host);
/*    */   }
/*    */ 
/*    */   
/*    */   public String slot(ItemStack stack) {
/* 27 */     return li.cil.oc.common.Slot$.MODULE$.Card();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 30 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 31 */     if (option instanceof Some) { Some some = (Some)option; Delegate card = (Delegate)some.x(); if (card instanceof WirelessNetworkCard) { WirelessNetworkCard wirelessNetworkCard = (WirelessNetworkCard)card; return wirelessNetworkCard.tier(); }  }
/* 32 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverWirelessNetworkCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */