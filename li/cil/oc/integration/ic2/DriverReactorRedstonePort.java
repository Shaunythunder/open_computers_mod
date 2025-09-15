/*     */ package li.cil.oc.integration.ic2;
/*     */ 
/*     */ import ic2.api.reactor.IReactor;
/*     */ import ic2.api.reactor.IReactorChamber;
/*     */ import ic2.api.reactor.IReactorComponent;
/*     */ import ic2.core.block.reactor.tileentity.TileEntityNuclearReactorElectric;
/*     */ import ic2.core.block.reactor.tileentity.TileEntityReactorChamberElectric;
/*     */ import ic2.core.block.reactor.tileentity.TileEntityReactorRedstonePort;
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
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ public final class DriverReactorRedstonePort
/*     */   extends DriverSidedTileEntity
/*     */ {
/*     */   public Class<?> getTileEntityClass() {
/*  28 */     return TileEntityReactorRedstonePort.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  34 */     return (ManagedEnvironment)new Environment((TileEntityReactorRedstonePort)world.func_147438_o(x, y, z));
/*     */   }
/*     */   
/*     */   public static final class Environment
/*     */     extends ManagedTileEntityEnvironment<TileEntityReactorRedstonePort> implements NamedBlock {
/*     */     public Environment(TileEntityReactorRedstonePort tileEntity) {
/*  40 */       super(tileEntity, "reactor_redstone_port");
/*     */     }
/*     */ 
/*     */     
/*     */     public String preferredName() {
/*  45 */       return "reactor_redstone_port";
/*     */     }
/*     */ 
/*     */     
/*     */     public int priority() {
/*  50 */       return 0;
/*     */     }
/*     */     
/*     */     private IReactor getReactor() {
/*  54 */       TileEntity reactorInventory = ((TileEntityReactorRedstonePort)this.tileEntity).getReactor();
/*     */       
/*  56 */       if (reactorInventory instanceof IReactor) {
/*  57 */         return (IReactor)reactorInventory;
/*     */       }
/*  59 */       return ((IReactorChamber)reactorInventory).getReactor();
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(active:boolean): boolean -- activate or deactivate the reactor")
/*     */     public Object[] setActive(Context context, Arguments args) {
/*  65 */       TileEntityReactorChamberElectric reactorChamberElectric = (TileEntityReactorChamberElectric)((TileEntityReactorRedstonePort)this.tileEntity).getReactor();
/*  66 */       TileEntityNuclearReactorElectric reactor = reactorChamberElectric.getReactor();
/*  67 */       if (reactor != null) {
/*  68 */         reactor.setRedstoneSignal(args.optBoolean(0, false));
/*  69 */         return new Object[] { Boolean.valueOf(reactor.receiveredstone()) };
/*     */       } 
/*  71 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's heat.")
/*     */     public Object[] getHeat(Context context, Arguments args) {
/*  76 */       IReactor reactor = getReactor();
/*  77 */       if (reactor != null) {
/*  78 */         return new Object[] { Integer.valueOf(reactor.getHeat()) };
/*     */       }
/*  80 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's maximum heat before exploding.")
/*     */     public Object[] getMaxHeat(Context context, Arguments args) {
/*  86 */       IReactor reactor = getReactor();
/*  87 */       if (reactor != null) {
/*  88 */         return new Object[] { Integer.valueOf(reactor.getMaxHeat()) };
/*     */       }
/*  90 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's energy output. Not multiplied with the base EU/t value.")
/*     */     public Object[] getReactorEnergyOutput(Context context, Arguments args) {
/*  97 */       IReactor reactor = getReactor();
/*  98 */       if (reactor != null) {
/*  99 */         return new Object[] { Float.valueOf(reactor.getReactorEnergyOutput()) };
/*     */       }
/* 101 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's base EU/t value.")
/*     */     public Object[] getReactorEUOutput(Context context, Arguments args) {
/* 107 */       return new Object[] { Double.valueOf(getReactor().getReactorEUEnergyOutput()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Get whether the reactor is active and supposed to produce energy.")
/*     */     public Object[] producesEnergy(Context context, Arguments args) {
/* 112 */       IReactor reactor = getReactor();
/* 113 */       if (reactor != null) {
/* 114 */         return new Object[] { Boolean.valueOf(reactor.produceEnergy()) };
/*     */       }
/* 116 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's emitted heat. Useful for fluid reactors.")
/*     */     public Object[] getEmitHeat(Context context, Arguments args) {
/* 122 */       IReactor reactor = getReactor();
/* 123 */       if (reactor instanceof TileEntityNuclearReactorElectric) {
/* 124 */         TileEntityNuclearReactorElectric fluidReactor = (TileEntityNuclearReactorElectric)reactor;
/* 125 */         return new Object[] { Integer.valueOf(fluidReactor.EmitHeat) };
/*     */       } 
/* 127 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(x:int,y:int):table -- Get information about the item stored in the given reactor slot.")
/*     */     public Object[] getSlotInfo(Context context, Arguments args) {
/* 133 */       IReactor reactor = getReactor();
/*     */       
/* 135 */       if (reactor == null) {
/* 136 */         return null;
/*     */       }
/*     */       
/* 139 */       int x = args.optInteger(0, -1);
/* 140 */       int y = args.optInteger(1, -1);
/*     */       
/* 142 */       ItemStack stack = reactor.getItemAt(x, y);
/*     */       
/* 144 */       if (stack == null) {
/* 145 */         return null;
/*     */       }
/*     */       
/* 148 */       Item item = stack.func_77973_b();
/*     */       
/* 150 */       HashMap<String, Object> outputMap = new HashMap<>();
/*     */       
/* 152 */       outputMap.put("item", stack);
/*     */       
/* 154 */       if (item instanceof IReactorComponent) {
/* 155 */         IReactorComponent component = (IReactorComponent)item;
/* 156 */         outputMap.put("canStoreHeat", Boolean.valueOf(component.canStoreHeat(reactor, stack, x, y)));
/* 157 */         outputMap.put("heat", Integer.valueOf(component.getCurrentHeat(reactor, stack, x, y)));
/* 158 */         outputMap.put("maxHeat", Integer.valueOf(component.getMaxHeat(reactor, stack, x, y)));
/*     */       } 
/*     */       
/* 161 */       return new Object[] { outputMap };
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverReactorRedstonePort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */