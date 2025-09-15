/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.world.World;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterWorld$ implements Converter {
/*    */   private ConverterWorld$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterWorld$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof World) { World world = (World)object;
/* 14 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("oc:flatten"), world.field_73011_w)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 15 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterWorld$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */