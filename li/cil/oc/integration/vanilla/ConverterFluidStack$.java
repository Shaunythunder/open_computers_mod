/*    */ package li.cil.oc.integration.vanilla;
/*    */ import java.util.Map;
/*    */ import net.minecraftforge.fluids.Fluid;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterFluidStack$ implements Converter {
/*    */   private ConverterFluidStack$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterFluidStack$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof FluidStack) { FluidStack fluidStack = (FluidStack)object;
/* 14 */       li.cil.oc.Settings$.MODULE$.get().insertIdsInConverters() ? 
/* 15 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToInteger(fluidStack.getFluid().getID()))) : BoxedUnit.UNIT;
/*    */       
/* 17 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(fluidStack.amount)));
/* 18 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("hasTag"), BoxesRunTime.boxToBoolean(!(fluidStack.tag == null))));
/* 19 */       Fluid fluid = fluidStack.getFluid();
/*    */       
/* 21 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), fluid.getName()));
/* 22 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("label"), fluid.getLocalizedName(fluidStack))); BoxedUnit boxedUnit = (fluid == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */     else
/* 24 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterFluidStack$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */