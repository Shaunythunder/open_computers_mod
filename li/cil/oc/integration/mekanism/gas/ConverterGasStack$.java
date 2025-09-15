/*    */ package li.cil.oc.integration.mekanism.gas;
/*    */ import java.util.Map;
/*    */ import mekanism.api.gas.Gas;
/*    */ import mekanism.api.gas.GasStack;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterGasStack$ implements Converter {
/*    */   private ConverterGasStack$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterGasStack$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof GasStack) { GasStack gasStack = (GasStack)object;
/* 14 */       li.cil.oc.Settings$.MODULE$.get().insertIdsInConverters() ? 
/* 15 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToInteger(gasStack.getGas().getID()))) : BoxedUnit.UNIT;
/*    */       
/* 17 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(gasStack.amount)));
/* 18 */       Gas gas = gasStack.getGas();
/*    */       
/* 20 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), gas.getName()));
/* 21 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("label"), gas.getLocalizedName())); BoxedUnit boxedUnit = (gas == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */     else
/* 23 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mekanism\gas\ConverterGasStack$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */