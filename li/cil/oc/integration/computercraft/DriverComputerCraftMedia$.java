/*    */ package li.cil.oc.integration.computercraft;
/*    */ 
/*    */ import dan200.computercraft.api.filesystem.IMount;
/*    */ import dan200.computercraft.api.filesystem.IWritableMount;
/*    */ import li.cil.oc.api.FileSystem;
/*    */ import li.cil.oc.api.fs.FileSystem;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.integration.opencomputers.Item;
/*    */ import li.cil.oc.server.fs.ComputerCraftFileSystem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ public final class DriverComputerCraftMedia$ implements Item {
/* 17 */   public boolean worksWith(ItemStack stack, Class host) { return Item.class.worksWith(this, stack, host); } public static final DriverComputerCraftMedia$ MODULE$; public int tier(ItemStack stack) { return Item.class.tier(this, stack); } public NBTTagCompound dataTag(ItemStack stack) { return Item.class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item.class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item.class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item.class.isComputer(this, host); } public boolean isRobot(Class host) { return Item.class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item.class.isRotatable(this, host); } public boolean isServer(Class host) { return Item.class.isServer(this, host); } public boolean isTablet(Class host) { return Item.class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item.class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item.class.isDrone(this, host); } private DriverComputerCraftMedia$() { MODULE$ = this; Item.class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 18 */     return stack.func_77973_b() instanceof IMedia;
/*    */   } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/*    */     ManagedEnvironment managedEnvironment;
/* 21 */     String address = addressFromTag(dataTag(stack));
/* 22 */     FileSystem mount = FileSystem.fromComputerCraft(((IMedia)stack.func_77973_b()).createDataMount(stack, host.world()));
/* 23 */     Option option = scala.Option$.MODULE$.apply(FileSystem.asManagedEnvironment(mount, new DriverComputerCraftMedia.ComputerCraftLabel(stack), host, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":floppy_access").toString()));
/* 24 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x();
/* 25 */       ((Node)environment.node()).address_$eq(address);
/* 26 */       managedEnvironment = environment; }
/* 27 */     else { managedEnvironment = null; }
/*    */     
/*    */     return managedEnvironment;
/*    */   } public String slot(ItemStack stack) {
/* 31 */     return li.cil.oc.common.Slot$.MODULE$.Floppy();
/*    */   }
/* 33 */   public Option<ComputerCraftFileSystem> createFileSystem(Object mount) { return scala.Option$.MODULE$.apply(mount).collect((PartialFunction)new DriverComputerCraftMedia$$anonfun$createFileSystem$1()); } public final class DriverComputerCraftMedia$$anonfun$createFileSystem$1 extends AbstractPartialFunction<Object, ComputerCraftFileSystem> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) { Object object2, object1 = x1;
/* 34 */       if (object1 instanceof IWritableMount) { IWritableMount iWritableMount = (IWritableMount)object1; object2 = new ComputerCraftWritableFileSystem(iWritableMount); }
/* 35 */       else if (object1 instanceof IMount) { IMount iMount = (IMount)object1; object2 = new ComputerCraftFileSystem(iMount); } else { object2 = default.apply(x1); }  return (B1)object2; } public final boolean isDefinedAt(Object x1) { boolean bool; Object object = x1; if (object instanceof IWritableMount) { bool = true; } else if (object instanceof IMount) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/*    */       
/* 39 */       return bool; } } private String addressFromTag(NBTTagCompound tag) { return (tag.func_74764_b("node") && tag.func_74775_l("node").func_74764_b("address")) ? 
/* 40 */       tag.func_74775_l("node").func_74779_i("address") : 
/*    */       
/* 42 */       UUID.randomUUID().toString(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\DriverComputerCraftMedia$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */