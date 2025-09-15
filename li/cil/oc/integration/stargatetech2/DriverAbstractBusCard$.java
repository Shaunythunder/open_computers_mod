/*    */ package li.cil.oc.integration.stargatetech2;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.integration.opencomputers.Item;
/*    */ import lordfokas.stargatetech2.api.bus.IBusDevice;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverAbstractBusCard$ implements Item, HostAware {
/* 14 */   public int tier(ItemStack stack) { return Item.class.tier(this, stack); } public static final DriverAbstractBusCard$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item.class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item.class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item.class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item.class.isComputer(this, host); } public boolean isRobot(Class host) { return Item.class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item.class.isRotatable(this, host); } public boolean isServer(Class host) { return Item.class.isServer(this, host); } public boolean isTablet(Class host) { return Item.class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item.class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item.class.isDrone(this, host); } private DriverAbstractBusCard$() { MODULE$ = this; Item.class.$init$(this); }
/*    */    public boolean worksWith(ItemStack stack) {
/* 16 */     (new ItemInfo[1])[0] = Items.get("abstractBusCard"); return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   }
/*    */   
/* 19 */   public boolean worksWith(ItemStack stack, Class<? extends EnvironmentHost> host) { return (worksWith(stack) && (isComputer(host) || isRobot(host) || isServer(host) || isMicrocontroller(host))); } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/*    */     ManagedEnvironment managedEnvironment;
/* 21 */     EnvironmentHost environmentHost = host;
/* 22 */     if (environmentHost instanceof IBusDevice) { EnvironmentHost environmentHost1 = environmentHost; managedEnvironment = (ManagedEnvironment)new AbstractBusCard((IBusDevice)environmentHost1); }
/* 23 */     else { managedEnvironment = null; }
/*    */     
/* 25 */     return li.cil.oc.integration.Mods$.MODULE$.StargateTech2().isAvailable() ? managedEnvironment : null;
/*    */   } public String slot(ItemStack stack) {
/* 27 */     return li.cil.oc.common.Slot$.MODULE$.Card();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\stargatetech2\DriverAbstractBusCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */