/*     */ package li.cil.oc.integration.ic2;
/*     */ 
/*     */ import ic2.api.reactor.IReactor;
/*     */ import ic2.api.reactor.IReactorChamber;
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
/*     */ 
/*     */ public final class DriverReactorChamber
/*     */   extends DriverSidedTileEntity
/*     */ {
/*     */   public Class<?> getTileEntityClass() {
/*  25 */     return IReactorChamber.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  31 */     return (ManagedEnvironment)new Environment((IReactorChamber)world.func_147438_o(x, y, z));
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<IReactorChamber> implements NamedBlock {
/*     */     public Environment(IReactorChamber tileEntity) {
/*  36 */       super(tileEntity, "reactor_chamber");
/*     */     }
/*     */ 
/*     */     
/*     */     public String preferredName() {
/*  41 */       return "reactor_chamber";
/*     */     }
/*     */ 
/*     */     
/*     */     public int priority() {
/*  46 */       return 0;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(active:boolean): boolean -- activate or deactivate the reactor")
/*     */     public Object[] setActive(Context context, Arguments args) {
/*  51 */       TileEntityNuclearReactorElectric reactor = (TileEntityNuclearReactorElectric)((IReactorChamber)this.tileEntity).getReactor();
/*  52 */       if (reactor != null) {
/*  53 */         reactor.setRedstoneSignal(args.optBoolean(0, false));
/*  54 */         return new Object[] { Boolean.valueOf(reactor.receiveredstone()) };
/*     */       } 
/*  56 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */     @Callback(doc = "function():number -- Get the reactor's heat.")
/*     */     public Object[] getHeat(Context context, Arguments args) {
/*  60 */       IReactor reactor = ((IReactorChamber)this.tileEntity).getReactor();
/*  61 */       if (reactor != null) {
/*  62 */         return new Object[] { Integer.valueOf(reactor.getHeat()) };
/*     */       }
/*  64 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's maximum heat before exploding.")
/*     */     public Object[] getMaxHeat(Context context, Arguments args) {
/*  70 */       IReactor reactor = ((IReactorChamber)this.tileEntity).getReactor();
/*  71 */       if (reactor != null) {
/*  72 */         return new Object[] { Integer.valueOf(((IReactorChamber)this.tileEntity).getReactor().getMaxHeat()) };
/*     */       }
/*  74 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's energy output. Not multiplied with the base EU/t value.")
/*     */     public Object[] getReactorEnergyOutput(Context context, Arguments args) {
/*  81 */       IReactor reactor = ((IReactorChamber)this.tileEntity).getReactor();
/*  82 */       if (reactor != null) {
/*  83 */         return new Object[] { Float.valueOf(((IReactorChamber)this.tileEntity).getReactor().getReactorEnergyOutput()) };
/*     */       }
/*  85 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the reactor's base EU/t value.")
/*     */     public Object[] getReactorEUOutput(Context context, Arguments args) {
/*  91 */       return new Object[] { Double.valueOf(((IReactorChamber)this.tileEntity).getReactor().getReactorEUEnergyOutput()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Get whether the reactor is active and supposed to produce energy.")
/*     */     public Object[] producesEnergy(Context context, Arguments args) {
/*  96 */       IReactor reactor = ((IReactorChamber)this.tileEntity).getReactor();
/*  97 */       if (reactor != null) {
/*  98 */         return new Object[] { Boolean.valueOf(((IReactorChamber)this.tileEntity).getReactor().produceEnergy()) };
/*     */       }
/* 100 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(x:int,y:int):table -- Get information about the item stored in the given reactor slot.")
/*     */     public Object[] getSlotInfo(Context context, Arguments args) {
/* 106 */       IReactor reactor = ((IReactorChamber)this.tileEntity).getReactor();
/*     */       
/* 108 */       if (reactor == null) {
/* 109 */         return null;
/*     */       }
/*     */       
/* 112 */       int x = args.optInteger(0, -1);
/* 113 */       int y = args.optInteger(1, -1);
/*     */       
/* 115 */       ItemStack stack = reactor.getItemAt(x, y);
/*     */       
/* 117 */       if (stack == null) {
/* 118 */         return null;
/*     */       }
/*     */       
/* 121 */       Item item = stack.func_77973_b();
/*     */       
/* 123 */       HashMap<String, Object> outputMap = new HashMap<>();
/*     */       
/* 125 */       outputMap.put("item", stack);
/*     */       
/* 127 */       if (item instanceof IReactorComponent) {
/* 128 */         IReactorComponent component = (IReactorComponent)item;
/* 129 */         outputMap.put("canStoreHeat", Boolean.valueOf(component.canStoreHeat(reactor, stack, x, y)));
/* 130 */         outputMap.put("heat", Integer.valueOf(component.getCurrentHeat(reactor, stack, x, y)));
/* 131 */         outputMap.put("maxHeat", Integer.valueOf(component.getMaxHeat(reactor, stack, x, y)));
/*     */       } 
/*     */       
/* 134 */       return new Object[] { outputMap };
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverReactorChamber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */