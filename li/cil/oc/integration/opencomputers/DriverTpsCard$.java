/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.TpsCard;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverTpsCard$ implements Item {
/* 10 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverTpsCard$ MODULE$; public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverTpsCard$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 11 */     (new ItemInfo[1])[0] = 
/* 12 */       Items.get("tpsCard");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 15 */     return (host.world() != null && (host.world()).field_72995_K) ? null : 
/* 16 */       (ManagedEnvironment)new TpsCard(host);
/*    */   } public String slot(ItemStack stack) {
/* 18 */     return li.cil.oc.common.Slot$.MODULE$.Card();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTpsCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */