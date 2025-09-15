/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import com.google.common.hash.Hashing;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterWorldProvider$ implements Converter {
/*    */   private ConverterWorldProvider$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final ConverterWorldProvider$ MODULE$; public void convert(Object value, Map output) {
/* 14 */     Object object = value;
/* 15 */     if (object instanceof WorldProvider) { WorldProvider worldProvider = (WorldProvider)object;
/* 16 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$
/*    */ 
/*    */           
/* 19 */           .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("id"), UUID.nameUUIDFromBytes(Hashing.md5().newHasher().putLong(worldProvider.getSeed()).putInt(worldProvider.field_76574_g).hash().asBytes()).toString()));
/* 20 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), worldProvider.func_80007_l())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 21 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterWorldProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */