/*    */ package li.cil.oc.integration.ae2fc;
/*    */ import com.glodblock.github.common.item.ItemFluidDrop;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterFluidDrop$ implements Converter {
/*    */   private ConverterFluidDrop$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterFluidDrop$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (ItemFluidDrop.isFluidStack(itemStack))
/* 14 */       { scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluidDrop"), ItemFluidDrop.getFluidStack(itemStack))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 15 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ae2fc\ConverterFluidDrop$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */