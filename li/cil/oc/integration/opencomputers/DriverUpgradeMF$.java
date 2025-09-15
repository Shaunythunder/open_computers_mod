/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.SeqLike;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class DriverUpgradeMF$ implements Item, HostAware {
/* 17 */   public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public static final DriverUpgradeMF$ MODULE$; public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverUpgradeMF$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 18 */     (new ItemInfo[1])[0] = 
/* 19 */       Items.get("mfu");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   } public boolean worksWith(ItemStack stack, Class<? extends EnvironmentHost> host) {
/* 22 */     return (worksWith(stack) && isAdapter(host));
/*    */   } public String slot(ItemStack stack) {
/* 24 */     return li.cil.oc.common.Slot$.MODULE$.Upgrade();
/*    */   } public int tier(ItemStack stack) {
/* 26 */     return 2;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 29 */     if (host.world() != null && !(host.world()).field_72995_K && 
/* 30 */       stack.func_77942_o()) {
/* 31 */       int[] arrayOfInt = stack.func_77978_p().func_74759_k((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("coord").toString());
/* 32 */       Option option = scala.Array$.MODULE$.unapplySeq(arrayOfInt); if (!option.isEmpty() && option.get() != null && ((SeqLike)option.get()).lengthCompare(5) == 0) { int x = BoxesRunTime.unboxToInt(((SeqLike)option.get()).apply(0)), y = BoxesRunTime.unboxToInt(((SeqLike)option.get()).apply(1)), z = BoxesRunTime.unboxToInt(((SeqLike)option.get()).apply(2)), dim = BoxesRunTime.unboxToInt(((SeqLike)option.get()).apply(3)), side = BoxesRunTime.unboxToInt(((SeqLike)option.get()).apply(4));
/* 33 */         Option option1 = scala.Option$.MODULE$.apply(DimensionManager.getWorld(dim));
/* 34 */         if (option1 instanceof Some) { Some some = (Some)option1; WorldServer world = (WorldServer)some.x(); return (ManagedEnvironment)new UpgradeMF(host, li.cil.oc.util.BlockPosition$.MODULE$.apply(x, y, z, (World)world), ForgeDirection.getOrientation(side)); }
/* 35 */          BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */       else
/* 37 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } 
/*    */     
/* 41 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeMF$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */