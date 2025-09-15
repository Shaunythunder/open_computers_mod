/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.driver.item.Processor;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.ComponentBus;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverComponentBus$ implements Item, Processor {
/* 14 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverComponentBus$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverComponentBus$() { MODULE$ = this; Item$class.$init$(this); }
/* 15 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[4])[0] = 
/* 16 */       Items.get("componentBus1");
/* 17 */     (new ItemInfo[4])[1] = Items.get("componentBus2");
/* 18 */     (new ItemInfo[4])[2] = Items.get("componentBus3");
/* 19 */     (new ItemInfo[4])[3] = Items.get("componentBusCreative");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[4])); } public scala.runtime.Null$ createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 21 */     return null;
/*    */   } public String slot(ItemStack stack) {
/* 23 */     return li.cil.oc.common.Slot$.MODULE$.ComponentBus();
/*    */   }
/*    */   
/*    */   public int tier(ItemStack stack) {
/* 27 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 28 */     if (option instanceof Some) { Some some = (Some)option; Delegate bus = (Delegate)some.x(); if (bus instanceof ComponentBus) { ComponentBus componentBus = (ComponentBus)bus; return scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(componentBus.tier()), 2); }  }
/* 29 */      return 0;
/*    */   }
/*    */   
/*    */   public int supportedComponents(ItemStack stack) {
/* 33 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 34 */     if (option instanceof Some) { Some some = (Some)option; Delegate bus = (Delegate)some.x(); if (bus instanceof ComponentBus) { ComponentBus componentBus = (ComponentBus)bus; return li.cil.oc.Settings$.MODULE$.get().cpuComponentSupport()[componentBus.tier()]; }  }
/* 35 */      return 0;
/*    */   }
/*    */   public scala.runtime.Null$ architecture(ItemStack stack) {
/* 38 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverComponentBus$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */