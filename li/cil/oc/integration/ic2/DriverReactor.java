/*     */ package li.cil.oc.integration.ic2;
/*     */ 
/*     */ import ic2.api.reactor.IReactor;
/*     */ import ic2.api.reactor.IReactorComponent;
/*     */ import ic2.core.block.reactor.tileentity.TileEntityNuclearReactorElectric;
/*     */ import java.util.HashMap;
/*     */ import li.cil.oc.api.driver.NamedBlock;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*     */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public final class DriverReactor
/*     */   extends DriverSidedTileEntity {
/*     */   public Class<?> getTileEntityClass() {
/*  22 */     return IReactor.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  28 */     return (ManagedEnvironment)new Environment((IReactor)world.func_147438_o(x, y, z));
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<IReactor> implements NamedBlock {
/*     */     public Environment(IReactor tileEntity) {
/*  33 */       super(tileEntity, "reactor");
/*     */     }
/*     */ 
/*     */     
/*     */     public String preferredName() {
/*  38 */       return "reactor";
/*     */     }
/*     */ 
/*     */     
/*     */     public int priority() {
/*  43 */       return 0;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(active:boolean): boolean -- activate or deactivate the reactor")
/*     */     public Object[] setActive(Context context, Arguments args) {
/*  48 */       TileEntityNuclearReactorElectric reactor = (TileEntityNuclearReactorElectric)this.tileEntity;
/*  49 */       if (reactor != null) {
/*  50 */         reactor.setRedstoneSignal(args.optBoolean(0, false));
/*  51 */         return new Object[] { Boolean.valueOf(reactor.receiveredstone()) };
/*     */       } 
/*  53 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's heat.")
/*     */     public Object[] getHeat(Context context, Arguments args) {
/*  58 */       return new Object[] { Integer.valueOf(((IReactor)this.tileEntity).getHeat()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's maximum heat before exploding.")
/*     */     public Object[] getMaxHeat(Context context, Arguments args) {
/*  63 */       return new Object[] { Integer.valueOf(((IReactor)this.tileEntity).getMaxHeat()) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's energy output. Not multiplied with the base EU/t value.")
/*     */     public Object[] getReactorEnergyOutput(Context context, Arguments args) {
/*  69 */       return new Object[] { Float.valueOf(((IReactor)this.tileEntity).getReactorEnergyOutput()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's base EU/t value.")
/*     */     public Object[] getReactorEUOutput(Context context, Arguments args) {
/*  74 */       return new Object[] { Double.valueOf(((IReactor)this.tileEntity).getReactorEUEnergyOutput()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Get whether the reactor is active and supposed to produce energy.")
/*     */     public Object[] producesEnergy(Context context, Arguments args) {
/*  79 */       return new Object[] { Boolean.valueOf(((IReactor)this.tileEntity).produceEnergy()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:int,y:int):table -- Get information about the item stored in the given reactor slot.")
/*     */     public Object[] getSlotInfo(Context context, Arguments args) {
/*  84 */       int x = args.optInteger(0, -1);
/*  85 */       int y = args.optInteger(1, -1);
/*     */       
/*  87 */       ItemStack stack = ((IReactor)this.tileEntity).getItemAt(x, y);
/*     */       
/*  89 */       if (stack == null) {
/*  90 */         return null;
/*     */       }
/*     */       
/*  93 */       Item item = stack.func_77973_b();
/*     */       
/*  95 */       HashMap<String, Object> outputMap = new HashMap<>();
/*     */       
/*  97 */       outputMap.put("item", stack);
/*     */       
/*  99 */       if (item instanceof IReactorComponent) {
/* 100 */         IReactorComponent component = (IReactorComponent)item;
/* 101 */         outputMap.put("canStoreHeat", Boolean.valueOf(component.canStoreHeat((IReactor)this.tileEntity, stack, x, y)));
/* 102 */         outputMap.put("heat", Integer.valueOf(component.getCurrentHeat((IReactor)this.tileEntity, stack, x, y)));
/* 103 */         outputMap.put("maxHeat", Integer.valueOf(component.getMaxHeat((IReactor)this.tileEntity, stack, x, y)));
/*     */       } 
/*     */       
/* 106 */       return new Object[] { outputMap };
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverReactor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */