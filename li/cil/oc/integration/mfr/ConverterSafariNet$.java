/*    */ package li.cil.oc.integration.mfr;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterSafariNet$ implements Converter {
/*    */   public static final ConverterSafariNet$ MODULE$;
/*    */   
/* 12 */   private ConverterSafariNet$() { MODULE$ = this; } public void convert(Object value, Map output) {
/* 13 */     Object object = value;
/* 14 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (itemStack.func_77973_b() instanceof powercrystals.minefactoryreloaded.item.ItemSafariNet && itemStack.func_77942_o()) {
/* 15 */         NBTTagCompound nbt = itemStack.func_77978_p();
/*    */         
/* 17 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("entity"), nbt.func_74779_i("id"))); BoxedUnit boxedUnit1 = (nbt.func_150297_b("id", 8) && !nbt.func_74767_n("hide")) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*    */       }  }
/* 19 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mfr\ConverterSafariNet$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */