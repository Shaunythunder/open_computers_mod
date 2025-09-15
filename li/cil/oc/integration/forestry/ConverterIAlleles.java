/*    */ package li.cil.oc.integration.forestry;
/*    */ 
/*    */ import com.google.common.collect.Maps;
/*    */ import forestry.api.genetics.IAlleleSpecies;
/*    */ import forestry.api.genetics.IMutation;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ 
/*    */ public class ConverterIAlleles
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 12 */     if (value instanceof IMutation) {
/* 13 */       IMutation mutation = (IMutation)value;
/*    */       
/* 15 */       IAlleleSpecies allele1 = mutation.getAllele0();
/* 16 */       if (allele1 != null) {
/* 17 */         Map<Object, Object> allelMap1 = Maps.newHashMap();
/* 18 */         convert(allele1, allelMap1);
/* 19 */         output.put("allele1", allelMap1);
/*    */       } 
/* 21 */       IAlleleSpecies allele2 = mutation.getAllele1();
/* 22 */       if (allele2 != null) {
/* 23 */         Map<Object, Object> allelMap2 = Maps.newHashMap();
/* 24 */         convert(allele2, allelMap2);
/* 25 */         output.put("allele2", allelMap2);
/*    */       } 
/* 27 */       output.put("chance", Float.valueOf(mutation.getBaseChance()));
/* 28 */       output.put("specialConditions", mutation.getSpecialConditions().toArray());
/*    */     } 
/*    */     
/* 31 */     if (value instanceof IAlleleSpecies) {
/* 32 */       convertAlleleSpecies((IAlleleSpecies)value, output);
/*    */     }
/*    */   }
/*    */   
/*    */   static void convertAlleleSpecies(IAlleleSpecies value, Map<Object, Object> output) {
/* 37 */     output.put("name", value.getName());
/* 38 */     output.put("uid", value.getUID());
/* 39 */     output.put("humidity", (value.getHumidity()).name);
/* 40 */     output.put("temperature", (value.getTemperature()).name);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\ConverterIAlleles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */