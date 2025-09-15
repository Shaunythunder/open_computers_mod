/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import net.minecraftforge.fluids.FluidTankInfo;
/*    */ import net.minecraftforge.fluids.IFluidHandler;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public abstract class WorldTankAnalytics$class {
/*    */   @Callback(doc = "function(side:number [, tank:number]):number -- Get the amount of fluid in the specified tank on the specified side.")
/*    */   public static Object[] getTankLevel(WorldTankAnalytics $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 15 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*    */     
/* 17 */     Option option = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 18 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidHandler handler = (IFluidHandler)some.x(); FluidTankInfo fluidTankInfo = ExtendedArguments$.MODULE$.extendedArguments(args).optTankInfo(handler, facing.getOpposite(), 1, null);
/* 19 */       if (fluidTankInfo != null) { FluidTankInfo fluidTankInfo1 = fluidTankInfo; arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Option$.MODULE$.apply(fluidTankInfo1.fluid).fold((Function0)new WorldTankAnalytics$$anonfun$getTankLevel$1($this), (Function1)new WorldTankAnalytics$$anonfun$getTankLevel$2($this)) })); }
/* 20 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.refArrayOps((Object[])handler.getTankInfo(facing.getOpposite())).map((Function1)new WorldTankAnalytics$$anonfun$getTankLevel$3($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).sum((Numeric)Numeric$IntIsIntegral$.MODULE$) })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 22 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   } public static void $init$(WorldTankAnalytics $this) {} @Callback(doc = "function(side:number [, tank:number]):number -- Get the capacity of the specified tank on the specified side.")
/*    */   public static Object[] getTankCapacity(WorldTankAnalytics $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 28 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 29 */     Option option = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 30 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidHandler handler = (IFluidHandler)some.x(); FluidTankInfo fluidTankInfo = ExtendedArguments$.MODULE$.extendedArguments(args).optTankInfo(handler, facing.getOpposite(), 1, null);
/* 31 */       if (fluidTankInfo != null) { FluidTankInfo fluidTankInfo1 = fluidTankInfo; arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(fluidTankInfo1.capacity) })); }
/* 32 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.refArrayOps((Object[])handler.getTankInfo(facing.getOpposite())).map((Function1)new WorldTankAnalytics$$anonfun$getTankCapacity$2($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new WorldTankAnalytics$$anonfun$getTankCapacity$1($this)) })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 34 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   } @Callback(doc = "function(side:number [, tank:number]):table -- Get a description of the fluid in the the specified tank on the specified side.")
/*    */   public static Object[] getFluidInTank(WorldTankAnalytics $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 40 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 41 */     Option option = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 42 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidHandler handler = (IFluidHandler)some.x(); FluidTankInfo fluidTankInfo = ExtendedArguments$.MODULE$.extendedArguments(args).optTankInfo(handler, facing.getOpposite(), 1, null);
/* 43 */       if (fluidTankInfo != null) { FluidTankInfo fluidTankInfo1 = fluidTankInfo; arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { fluidTankInfo1 })); }
/* 44 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { handler.getTankInfo(facing.getOpposite()) })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 46 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*    */ 
/*    */     
/* 49 */     return Settings$.MODULE$.get().allowItemStackInspection() ? arrayOfObject : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*    */   } @Callback(doc = "function(side:number):number -- Get the number of tanks available on the specified side.")
/*    */   public static Object[] getTankCount(WorldTankAnalytics $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 53 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 54 */     Option option = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 55 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidHandler handler = (IFluidHandler)some.x(); FluidTankInfo[] arrayOfFluidTankInfo = handler.getTankInfo(facing.getOpposite());
/* 56 */       if (arrayOfFluidTankInfo != null) { FluidTankInfo[] arrayOfFluidTankInfo1 = arrayOfFluidTankInfo; arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arrayOfFluidTankInfo1.length) })); }
/* 57 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 59 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldTankAnalytics$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */