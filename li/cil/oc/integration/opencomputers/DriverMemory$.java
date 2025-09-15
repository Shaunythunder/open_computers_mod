/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.common.item.Memory;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverMemory$ implements Item, Memory, CallBudget {
/* 13 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public static final DriverMemory$ MODULE$; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverMemory$() { MODULE$ = this; Item$class.$init$(this); }
/*    */    public double amount(ItemStack stack) {
/* 15 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 16 */     if (option instanceof Some) { Some some = (Some)option; Delegate memory = (Delegate)some.x(); if (memory instanceof Memory) { Memory memory1 = (Memory)memory;
/* 17 */         int[] sizes = li.cil.oc.Settings$.MODULE$.get().ramSizes();
/* 18 */         return li.cil.oc.Settings$.MODULE$.get().ramSizes()[scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(memory1.tier()), 0)), sizes.length - 1)]; }  }
/* 19 */      return 0.0D;
/*    */   }
/*    */   
/* 22 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[6])[0] = 
/* 23 */       Items.get("ram1");
/* 24 */     (new ItemInfo[6])[1] = Items.get("ram2");
/* 25 */     (new ItemInfo[6])[2] = Items.get("ram3");
/* 26 */     (new ItemInfo[6])[3] = Items.get("ram4");
/* 27 */     (new ItemInfo[6])[4] = Items.get("ram5");
/* 28 */     (new ItemInfo[6])[5] = Items.get("ram6");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[6])); } public Memory createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 30 */     return new Memory(tier(stack));
/*    */   } public String slot(ItemStack stack) {
/* 32 */     return li.cil.oc.common.Slot$.MODULE$.Memory();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 35 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 36 */     if (option instanceof Some) { Some some = (Some)option; Delegate memory = (Delegate)some.x(); if (memory instanceof Memory) { Memory memory1 = (Memory)memory; return memory1.tier() / 2; }  }
/* 37 */      return 0;
/*    */   }
/*    */   public double getCallBudget(ItemStack stack) {
/* 40 */     return li.cil.oc.Settings$.MODULE$.get().callBudgets()[scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(tier(stack)), 0)), 2)];
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverMemory$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */