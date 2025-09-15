/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.component.TextBuffer;
/*    */ import li.cil.oc.common.tileentity.Screen;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverScreen$ implements Item, HostAware {
/* 13 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverScreen$ MODULE$; public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverScreen$() { MODULE$ = this; Item$class.$init$(this); }
/* 14 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[1])[0] = 
/* 15 */       Items.get("screen1");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1])); } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 17 */     EnvironmentHost environmentHost = host;
/* 18 */     if (environmentHost instanceof Screen) { Screen screen = (Screen)environmentHost; if (screen.tier() > 0) return (ManagedEnvironment)new Screen(screen);  }
/* 19 */      return (ManagedEnvironment)new TextBuffer(host);
/*    */   }
/*    */   public String slot(ItemStack stack) {
/* 22 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverScreen$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */