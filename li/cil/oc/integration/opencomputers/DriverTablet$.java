/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.item.data.TabletData;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class DriverTablet$ implements Item {
/*    */   public static final DriverTablet$ MODULE$;
/*    */   
/* 16 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverTablet$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 17 */     (new ItemInfo[1])[0] = 
/* 18 */       Items.get("tablet");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   }
/*    */   
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) { ManagedEnvironment managedEnvironment;
/* 23 */     li.cil.oc.common.item.Tablet$Server$.MODULE$.cache().invalidate(li.cil.oc.common.item.Tablet$.MODULE$.getId(stack));
/* 24 */     TabletData data = new TabletData(stack);
/*    */ 
/*    */     
/* 27 */     Option option = scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])data.items()).collect((PartialFunction)new DriverTablet$$anonfun$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).headOption().map((Function1)new DriverTablet$$anonfun$2(host));
/* 28 */     if (option instanceof Some) { Object object; Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); Node node = environment.node();
/* 29 */       if (node instanceof Component) { Component component = (Component)node;
/* 30 */         component.setVisibility(Visibility.Network);
/* 31 */         environment.save(dataTag(stack));
/* 32 */         object = environment; }
/* 33 */       else { object = null; }
/*    */        managedEnvironment = (ManagedEnvironment)object; }
/* 35 */     else { managedEnvironment = null; }  return (host.world() != null && (host.world()).field_72995_K) ? null : managedEnvironment; }
/*    */   public final class DriverTablet$$anonfun$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack fs = (ItemStack)some.x(); if (DriverFileSystem$.MODULE$.worksWith(fs)) return (B1)fs;  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack fs = (ItemStack)some.x(); if (DriverFileSystem$.MODULE$.worksWith(fs))
/* 39 */           return true;  }  return false; } } public String slot(ItemStack stack) { return li.cil.oc.common.Slot$.MODULE$.Tablet(); }
/*    */   public final class DriverTablet$$anonfun$2 extends AbstractFunction1<ItemStack, ManagedEnvironment> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final EnvironmentHost host$1; public final ManagedEnvironment apply(ItemStack x$1) { return DriverFileSystem$.MODULE$.createEnvironment(x$1, this.host$1); } public DriverTablet$$anonfun$2(EnvironmentHost host$1) {} } public NBTTagCompound dataTag(ItemStack stack) {
/* 42 */     TabletData data = new TabletData(stack);
/* 43 */     int index = scala.Predef$.MODULE$.refArrayOps((Object[])data.items()).indexWhere((Function1)new DriverTablet$$anonfun$3());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     NBTTagCompound baseTag = stack.func_77978_p().func_150295_c((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("items").toString(), 10).func_150305_b(index);
/* 49 */     if (!baseTag.func_74764_b("item")) {
/* 50 */       baseTag.func_74782_a("item", (NBTBase)new NBTTagCompound());
/*    */     }
/* 52 */     NBTTagCompound itemTag = baseTag.func_74775_l("item");
/* 53 */     if (!itemTag.func_74764_b("tag")) {
/* 54 */       itemTag.func_74782_a("tag", (NBTBase)new NBTTagCompound());
/*    */     }
/* 56 */     NBTTagCompound stackTag = itemTag.func_74775_l("tag");
/* 57 */     if (!stackTag.func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString())) {
/* 58 */       stackTag.func_74782_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)new NBTTagCompound());
/*    */     }
/* 60 */     return (index >= 0 && stack.func_77942_o() && stack.func_77978_p().func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("items").toString())) ? stackTag.func_74775_l((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString()) : 
/*    */       
/* 62 */       new NBTTagCompound();
/*    */   }
/*    */   
/*    */   public final class DriverTablet$$anonfun$3 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Option x0$1) {
/*    */       boolean bool;
/*    */       Option option = x0$1;
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         ItemStack fs = (ItemStack)some.x();
/*    */         bool = DriverFileSystem$.MODULE$.worksWith(fs);
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return bool;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTablet$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */