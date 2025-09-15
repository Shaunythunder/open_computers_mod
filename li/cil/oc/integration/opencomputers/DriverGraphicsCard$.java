/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.GraphicsCard;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverGraphicsCard$ implements Item, HostAware {
/*    */   public static final DriverGraphicsCard$ MODULE$;
/*    */   
/* 15 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverGraphicsCard$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 16 */     (new ItemInfo[3])[0] = 
/* 17 */       Items.get("graphicsCard1");
/* 18 */     (new ItemInfo[3])[1] = Items.get("graphicsCard2");
/* 19 */     (new ItemInfo[3])[2] = Items.get("graphicsCard3");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3]));
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 23 */     int i = tier(stack); switch (i) { default: case 2: case 1: 
/* 24 */       case 0: break; }  return (host.world() != null && (host.world()).field_72995_K) ? null : (ManagedEnvironment)new GraphicsCard(0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String slot(ItemStack stack) {
/* 30 */     return li.cil.oc.common.Slot$.MODULE$.Card();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 33 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 34 */     if (option instanceof Some) { Some some = (Some)option; Delegate gpu = (Delegate)some.x(); if (gpu instanceof GraphicsCard) { GraphicsCard graphicsCard = (GraphicsCard)gpu; return graphicsCard.gpuTier(); }  }
/* 35 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverGraphicsCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */