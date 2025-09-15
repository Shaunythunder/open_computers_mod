/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.fluids.Fluid;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import net.minecraftforge.fluids.FluidTankInfo;
/*     */ import net.minecraftforge.fluids.IFluidHandler;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ public final class FluidUtils$
/*     */ {
/*     */   public static final FluidUtils$ MODULE$;
/*     */   
/*     */   public Option<IFluidHandler> fluidHandlerAt(BlockPosition position) {
/*  26 */     Option<World> option = position.world();
/*  27 */     if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x(); if (ExtendedWorld$.MODULE$.extendedWorld(world).blockExists(position)) { Option<IFluidHandler> option1; TileEntity tileEntity = ExtendedWorld$.MODULE$.extendedWorld(world).getTileEntity(position);
/*  28 */         if (tileEntity instanceof IFluidHandler) { TileEntity tileEntity1 = tileEntity; option1 = scala.Option$.MODULE$.apply(tileEntity1); }
/*  29 */         else { option1 = scala.Option$.MODULE$.apply(new FluidUtils.GenericBlockWrapper(position)); }  return option1; }
/*     */        }
/*  31 */      return (Option<IFluidHandler>)scala.None$.MODULE$;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int transferBetweenFluidHandlers$default$5()
/*     */   {
/*  43 */     return 1000; } public int transferBetweenFluidHandlers$default$6() { return -1; } public int transferBetweenFluidHandlers(IFluidHandler source, ForgeDirection sourceSide, IFluidHandler sink, ForgeDirection sinkSide, int limit, int sourceTank) {
/*  44 */     FluidTankInfo[] ti = source.getTankInfo(sourceSide);
/*  45 */     FluidStack srcFluid = (sourceTank < 0 || ti == null || ti.length <= sourceTank) ? null : (ti[sourceTank]).fluid.copy();
/*     */     
/*  47 */     boolean nullFluid = (srcFluid == null);
/*     */ 
/*     */ 
/*     */     
/*  51 */     srcFluid.amount = limit;
/*  52 */     FluidStack drained = nullFluid ? source.drain(sourceSide, limit, false) : source.drain(sourceSide, srcFluid, false);
/*     */ 
/*     */     
/*  55 */     int filled = sink.fill(sinkSide, drained, false);
/*     */ 
/*     */ 
/*     */     
/*  59 */     srcFluid.amount = filled;
/*     */ 
/*     */     
/*  62 */     return (drained == null) ? 0 : (nullFluid ? sink.fill(sinkSide, source.drain(sourceSide, filled, true), true) : sink.fill(sinkSide, source.drain(sourceSide, srcFluid, true), true));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int transferBetweenFluidHandlersAt$default$5()
/*     */   {
/*  72 */     return 1000; } public int transferBetweenFluidHandlersAt$default$6() { return -1; }
/*  73 */   public int transferBetweenFluidHandlersAt(BlockPosition sourcePos, ForgeDirection sourceSide, BlockPosition sinkPos, ForgeDirection sinkSide, int limit, int sourceTank) { return BoxesRunTime.unboxToInt(fluidHandlerAt(sourcePos).fold((Function0)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$1(), (Function1)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2(sourceSide, sinkPos, sinkSide, limit, sourceTank))); } public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } }
/*  74 */    public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; public final ForgeDirection sourceSide$1; private final BlockPosition sinkPos$1; public final int apply(IFluidHandler source) { return BoxesRunTime.unboxToInt(FluidUtils$.MODULE$.fluidHandlerAt(this.sinkPos$1).fold((Function0)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1(this), (Function1)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2(this, source))); } public final ForgeDirection sinkSide$1; public final int limit$1; public final int sourceTank$1; public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2(ForgeDirection sourceSide$1, BlockPosition sinkPos$1, ForgeDirection sinkSide$1, int limit$1, int sourceTank$1) {} public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1(FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 $outer) {} } public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IFluidHandler source$1; public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2(FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 $outer, IFluidHandler source$1) {} public final int apply(IFluidHandler sink) {
/*  75 */         return FluidUtils$.MODULE$.transferBetweenFluidHandlers(this.source$1, this.$outer.sourceSide$1, sink, this.$outer.sinkSide$1, this.$outer.limit$1, this.$outer.sourceTank$1);
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Fluid lookupFluidForBlock(Block block) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic net/minecraft/init/Blocks.field_150356_k : Lnet/minecraft/block/BlockLiquid;
/*     */     //   4: astore_2
/*     */     //   5: dup
/*     */     //   6: ifnonnull -> 17
/*     */     //   9: pop
/*     */     //   10: aload_2
/*     */     //   11: ifnull -> 24
/*     */     //   14: goto -> 30
/*     */     //   17: aload_2
/*     */     //   18: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   21: ifeq -> 30
/*     */     //   24: getstatic net/minecraftforge/fluids/FluidRegistry.LAVA : Lnet/minecraftforge/fluids/Fluid;
/*     */     //   27: goto -> 64
/*     */     //   30: aload_1
/*     */     //   31: getstatic net/minecraft/init/Blocks.field_150358_i : Lnet/minecraft/block/BlockLiquid;
/*     */     //   34: astore_3
/*     */     //   35: dup
/*     */     //   36: ifnonnull -> 47
/*     */     //   39: pop
/*     */     //   40: aload_3
/*     */     //   41: ifnull -> 54
/*     */     //   44: goto -> 60
/*     */     //   47: aload_3
/*     */     //   48: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 60
/*     */     //   54: getstatic net/minecraftforge/fluids/FluidRegistry.WATER : Lnet/minecraftforge/fluids/Fluid;
/*     */     //   57: goto -> 64
/*     */     //   60: aload_1
/*     */     //   61: invokestatic lookupFluidForBlock : (Lnet/minecraft/block/Block;)Lnet/minecraftforge/fluids/Fluid;
/*     */     //   64: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 0
/*     */     //   #82	-> 30
/*     */     //   #83	-> 60
/*     */     //   #81	-> 64
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	65	0	this	Lli/cil/oc/util/FluidUtils$;
/*     */     //   0	65	1	block	Lnet/minecraft/block/Block;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FluidUtils$() {
/* 189 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\FluidUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */