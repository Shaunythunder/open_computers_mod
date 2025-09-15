/*    */ package li.cil.oc.integration.vanilla;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraftforge.fluids.FluidTankInfo;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterFluidTankInfo$ implements Converter {
/*    */   private ConverterFluidTankInfo$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterFluidTankInfo$ MODULE$; public void convert(Object value, Map<Object, Object> output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof FluidTankInfo) { FluidTankInfo fluidTankInfo = (FluidTankInfo)object;
/* 14 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(fluidTankInfo.capacity)));
/*    */ 
/*    */ 
/*    */       
/* 18 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(0))); ConverterFluidStack$.MODULE$.convert(fluidTankInfo.fluid, output); BoxedUnit boxedUnit = (fluidTankInfo.fluid == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 19 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterFluidTankInfo$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */