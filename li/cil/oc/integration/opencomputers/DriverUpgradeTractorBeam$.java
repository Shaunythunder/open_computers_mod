/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.entity.Drone;
/*    */ import li.cil.oc.common.item.TabletWrapper;
/*    */ import li.cil.oc.server.component.UpgradeTractorBeam;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverUpgradeTractorBeam$ implements Item, HostAware {
/*    */   public static final DriverUpgradeTractorBeam$ MODULE$;
/*    */   
/* 17 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverUpgradeTractorBeam$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 18 */     (new ItemInfo[1])[0] = 
/* 19 */       Items.get("tractorBeamUpgrade");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { ManagedEnvironment managedEnvironment;
/* 23 */     EnvironmentHost environmentHost = host;
/* 24 */     if (environmentHost instanceof Drone) { Drone drone = (Drone)environmentHost; managedEnvironment = (ManagedEnvironment)new UpgradeTractorBeam.Drone((Agent)drone); }
/* 25 */     else if (environmentHost instanceof Robot) { Robot robot = (Robot)environmentHost; managedEnvironment = (ManagedEnvironment)new UpgradeTractorBeam.Player(host, (Function0)new DriverUpgradeTractorBeam$$anonfun$createEnvironment$1(robot)); }
/* 26 */     else if (environmentHost instanceof TabletWrapper) { TabletWrapper tabletWrapper = (TabletWrapper)environmentHost; managedEnvironment = (ManagedEnvironment)new UpgradeTractorBeam.Player(host, (Function0)new DriverUpgradeTractorBeam$$anonfun$createEnvironment$2(tabletWrapper)); }
/* 27 */     else { managedEnvironment = null; }
/*    */      return (host.world() != null && (host.world()).field_72995_K) ? null : managedEnvironment; }
/*    */   public final class DriverUpgradeTractorBeam$$anonfun$createEnvironment$1 extends AbstractFunction0<EntityPlayer> implements Serializable {
/* 30 */     public static final long serialVersionUID = 0L; private final Robot x3$1; public final EntityPlayer apply() { return this.x3$1.player(); } public DriverUpgradeTractorBeam$$anonfun$createEnvironment$1(Robot x3$1) {} } public String slot(ItemStack stack) { return li.cil.oc.common.Slot$.MODULE$.Upgrade(); }
/*    */   public final class DriverUpgradeTractorBeam$$anonfun$createEnvironment$2 extends AbstractFunction0<EntityPlayer> implements Serializable {
/* 32 */     public static final long serialVersionUID = 0L; private final TabletWrapper x4$1; public final EntityPlayer apply() { return this.x4$1.player(); } public DriverUpgradeTractorBeam$$anonfun$createEnvironment$2(TabletWrapper x4$1) {} } public int tier(ItemStack stack) { return 2; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeTractorBeam$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */