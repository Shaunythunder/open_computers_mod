/*     */ package li.cil.oc.integration.ic2;
/*     */ 
/*     */ import ic2.api.crops.ICropTile;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*     */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public final class DriverCrop
/*     */   extends DriverSidedTileEntity {
/*     */   public Class<?> getTileEntityClass() {
/*  16 */     return ICropTile.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  21 */     return (ManagedEnvironment)new Environment((ICropTile)world.func_147438_o(x, y, z));
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<ICropTile> {
/*     */     public Environment(ICropTile tileEntity) {
/*  26 */       super(tileEntity, "crop");
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getSize(Context context, Arguments args) {
/*  31 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getSize()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getGrowth(Context context, Arguments args) {
/*  36 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getGrowth()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getGain(Context context, Arguments args) {
/*  41 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getGain()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getResistance(Context context, Arguments args) {
/*  46 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getResistance()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getNutrientStorage(Context context, Arguments args) {
/*  51 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getNutrientStorage()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getHydrationStorage(Context context, Arguments args) {
/*  56 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getHydrationStorage()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getWeedExStorage(Context context, Arguments args) {
/*  61 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getWeedExStorage()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getHumidity(Context context, Arguments args) {
/*  66 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getHumidity()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getNutrients(Context context, Arguments args) {
/*  71 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getNutrients()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getAirQuality(Context context, Arguments args) {
/*  76 */       return new Object[] { Byte.valueOf(((ICropTile)this.tileEntity).getAirQuality()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getName(Context context, Arguments args) {
/*  81 */       return new Object[] { ((ICropTile)this.tileEntity).getCrop().name() };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getRootsLength(Context context, Arguments args) {
/*  86 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getCrop().getrootslength((ICropTile)this.tileEntity)) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getTier(Context context, Arguments args) {
/*  91 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getCrop().tier()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] maxSize(Context context, Arguments args) {
/*  96 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getCrop().maxSize()) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] canGrow(Context context, Arguments args) {
/* 101 */       return new Object[] { Boolean.valueOf(((ICropTile)this.tileEntity).getCrop().canGrow((ICropTile)this.tileEntity)) };
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] getOptimalHavestSize(Context context, Arguments args) {
/* 106 */       return new Object[] { Integer.valueOf(((ICropTile)this.tileEntity).getCrop().getOptimalHavestSize((ICropTile)this.tileEntity)) };
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverCrop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */