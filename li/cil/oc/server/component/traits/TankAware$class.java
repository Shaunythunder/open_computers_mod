/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import net.minecraftforge.fluids.IFluidTank;
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Some;
/*    */ 
/*    */ 
/*    */ public abstract class TankAware$class
/*    */ {
/*    */   public static void $init$(TankAware $this) {}
/*    */   
/*    */   public static int optTank(TankAware $this, Arguments args, int n) {
/* 18 */     return (args.count() > 0 && args.checkAny(0) != null) ? ExtendedArguments$.MODULE$.extendedArguments(args).checkTank($this.tank(), 0) : 
/* 19 */       $this.selectedTank();
/*    */   }
/* 21 */   public static Option getTank(TankAware $this, int index) { return Option$.MODULE$.apply($this.tank().getFluidTank(index)); }
/*    */   public static Option fluidInTank(TankAware $this, int index) { None$ none$;
/* 23 */     Option<IFluidTank> option = $this.getTank(index);
/* 24 */     if (option instanceof Some) { Some some = (Some)option; IFluidTank tank = (IFluidTank)some.x(); Option option1 = Option$.MODULE$.apply(tank.getFluid()); }
/* 25 */     else { none$ = None$.MODULE$; }
/*    */     
/*    */     return (Option)none$; } public static boolean haveSameFluidType(TankAware $this, FluidStack stackA, FluidStack stackB) {
/* 28 */     return stackA.isFluidEqual(stackB);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */