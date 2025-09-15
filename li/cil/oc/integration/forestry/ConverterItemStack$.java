/*    */ package li.cil.oc.integration.forestry;
/*    */ import forestry.api.circuits.ChipsetManager;
/*    */ import forestry.api.circuits.ICircuit;
/*    */ import forestry.api.genetics.AlleleManager;
/*    */ import java.util.Map;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterItemStack$ implements Converter {
/*    */   private ConverterItemStack$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final ConverterItemStack$ MODULE$; public void convert(Object value, Map output) {
/* 14 */     boolean bool = false; ItemStack itemStack = null; Object object = value; if (object instanceof ItemStack) { bool = true; itemStack = (ItemStack)object; if (AlleleManager.alleleRegistry.isIndividual(itemStack))
/* 15 */       { scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("individual"), AlleleManager.alleleRegistry.getIndividual(itemStack))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }  if (bool)
/* 16 */       if (ChipsetManager.circuitRegistry.getCircuitboard(itemStack) != null) {
/* 17 */         ICircuit[] cc = ChipsetManager.circuitRegistry.getCircuitboard(itemStack).getCircuits();
/* 18 */         String[] names = (String[])scala.Predef$.MODULE$.refArrayOps((Object[])cc).collect((PartialFunction)new ConverterItemStack$$anonfun$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(String.class)));
/*    */         
/* 20 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("circuits"), names)); BoxedUnit boxedUnit1 = (names.length > 0) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*    */       }  
/* 22 */     BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$1 extends AbstractPartialFunction<ICircuit, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final <A1 extends ICircuit, B1> B1 applyOrElse(ICircuit x1, Function1 default) {
/*    */       Object object;
/*    */       ICircuit iCircuit = x1;
/*    */       if (iCircuit != null) {
/*    */         ICircuit iCircuit1 = iCircuit;
/*    */         object = iCircuit1.getName();
/*    */       } else {
/*    */         object = default.apply(x1);
/*    */       } 
/*    */       return (B1)object;
/*    */     }
/*    */     
/*    */     public final boolean isDefinedAt(ICircuit x1) {
/*    */       boolean bool;
/*    */       ICircuit iCircuit = x1;
/*    */       if (iCircuit != null) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return bool;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\ConverterItemStack$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */