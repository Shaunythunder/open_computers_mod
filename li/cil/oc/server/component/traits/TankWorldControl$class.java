/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import net.minecraftforge.fluids.IFluidHandler;
/*    */ import net.minecraftforge.fluids.IFluidTank;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public abstract class TankWorldControl$class {
/*    */   @Callback(doc = "function(side:number [, tank:number]):boolean -- Compare the fluid in the selected tank with the fluid in the specified tank on the specified side. Returns true if equal.")
/*    */   public static Object[] compareFluid(TankWorldControl $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 15 */     ForgeDirection side = $this.checkSideForAction(args, 0);
/* 16 */     Option<FluidStack> option = $this.fluidInTank($this.selectedTank());
/* 17 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; FluidStack stack = (FluidStack)some.x();
/* 18 */       Option option1 = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(side));
/* 19 */       if (option1 instanceof Some) { Object[] arrayOfObject2; Some some1 = (Some)option1; IFluidHandler handler = (IFluidHandler)some1.x(); FluidTankInfo fluidTankInfo = ExtendedArguments$.MODULE$.extendedArguments(args).optTankInfo(handler, side.getOpposite(), 1, null);
/* 20 */         if (fluidTankInfo != null) { FluidTankInfo fluidTankInfo1 = fluidTankInfo; arrayOfObject2 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(stack.isFluidEqual(fluidTankInfo1.fluid)) })); }
/* 21 */         else { arrayOfObject2 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(Option$.MODULE$.apply(handler.getTankInfo(side.getOpposite())).exists((Function1)new TankWorldControl$$anonfun$compareFluid$1($this, stack))) })); }
/*    */          arrayOfObject1 = arrayOfObject2; }
/* 23 */       else { arrayOfObject1 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 25 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   } public static void $init$(TankWorldControl $this) {} @Callback(doc = "function(side:boolean[, amount:number=1000]):boolean, number or string -- Drains the specified amount of fluid from the specified side. Returns the amount drained, or an error message.")
/*    */   public static Object[] drain(TankWorldControl $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 31 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 32 */     ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$2 = 1, x$3 = qual$1.optFluidCount$default$2(), count = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(qual$1.optFluidCount(x$2, x$3)), 0);
/* 33 */     Option<IFluidTank> option = $this.getTank($this.selectedTank());
/* 34 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidTank tank = (IFluidTank)some.x();
/* 35 */       int space = tank.getCapacity() - tank.getFluidAmount();
/* 36 */       int amount = package$.MODULE$.min(count, space);
/*    */       
/* 38 */       Option option1 = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 39 */       if (option1 instanceof Some) { Object[] arrayOfObject2; Some some1 = (Some)option1; IFluidHandler handler = (IFluidHandler)some1.x();
/* 40 */         FluidStack fluidStack = tank.getFluid();
/* 41 */         if (fluidStack != null) { FluidStack fluidStack1 = fluidStack;
/* 42 */           FluidStack drained = handler.drain(facing.getOpposite(), new FluidStack(fluidStack1, amount), true);
/*    */           
/* 44 */           int filled = tank.fill(drained, true);
/* 45 */           arrayOfObject2 = ((drained != null && drained.amount > 0) || amount == 0) ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(filled)
/*    */                 
/* 47 */                 })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible or no fluid" })); }
/*    */         else
/* 49 */         { int transferred = tank.fill(handler.drain(facing.getOpposite(), amount, true), true);
/* 50 */           arrayOfObject2 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((transferred > 0)), BoxesRunTime.boxToInteger(transferred) })); }
/*    */          arrayOfObject1 = arrayOfObject2; }
/* 52 */       else { arrayOfObject1 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible or no fluid" })); }
/*    */ 
/*    */       
/* 55 */       arrayOfObject = (count < 1 || amount > 0) ? arrayOfObject1 : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tank is full" })); }
/* 56 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank selected" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   } @Callback(doc = "function(side:number[, amount:number=1000]):boolean, number of string -- Eject the specified amount of fluid to the specified side. Returns the amount ejected or an error message.")
/*    */   public static Object[] fill(TankWorldControl $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 62 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 63 */     ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$4 = 1, x$5 = qual$2.optFluidCount$default$2(), count = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(qual$2.optFluidCount(x$4, x$5)), 0);
/* 64 */     Option<IFluidTank> option = $this.getTank($this.selectedTank());
/* 65 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidTank tank = (IFluidTank)some.x();
/* 66 */       int amount = package$.MODULE$.min(count, tank.getFluidAmount());
/*    */       
/* 68 */       Option option1 = FluidUtils$.MODULE$.fluidHandlerAt($this.position().offset(facing));
/* 69 */       if (option1 instanceof Some) { Object[] arrayOfObject2; Some some1 = (Some)option1; IFluidHandler handler = (IFluidHandler)some1.x();
/* 70 */         FluidStack fluidStack = tank.getFluid();
/* 71 */         if (fluidStack != null) { FluidStack fluidStack1 = fluidStack;
/* 72 */           int filled = handler.fill(facing.getOpposite(), new FluidStack(fluidStack1, amount), true);
/*    */           
/* 74 */           tank.drain(filled, true);
/* 75 */           arrayOfObject2 = (filled > 0 || amount == 0) ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(filled)
/*    */                 
/* 77 */                 })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible or no fluid" })); }
/*    */         else
/* 79 */         { arrayOfObject2 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tank is empty" })); }
/*    */          arrayOfObject1 = arrayOfObject2; }
/* 81 */       else { arrayOfObject1 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no space" })); }
/*    */ 
/*    */       
/* 84 */       arrayOfObject = (count < 1 || amount > 0) ? arrayOfObject1 : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tank is empty" })); }
/* 85 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank selected" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankWorldControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */