/*    */ package li.cil.oc.integration.vanilla;
/*    */ import java.util.Map;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagString;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterItemStack$ implements Converter {
/*    */   private ConverterItemStack$() {
/* 20 */     MODULE$ = this;
/*    */   } public static final ConverterItemStack$ MODULE$; public void convert(Object value, Map output) {
/* 22 */     Object object = value;
/* 23 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object;
/*    */       
/* 25 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToInteger(Item.func_150891_b(itemStack.func_77973_b()))));
/* 26 */       li.cil.oc.Settings$.MODULE$.get().insertIdsInConverters() ? scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("oreNames"), scala.Predef$.MODULE$.intArrayOps(OreDictionary.getOreIDs(itemStack)).map((Function1)new ConverterItemStack$$anonfun$convert$2(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(String.class))))) : BoxedUnit.UNIT;
/*    */       
/* 28 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("damage"), BoxesRunTime.boxToInteger(itemStack.func_77960_j())));
/* 29 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxDamage"), BoxesRunTime.boxToInteger(itemStack.func_77958_k())));
/* 30 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(itemStack.field_77994_a)));
/* 31 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxSize"), BoxesRunTime.boxToInteger(itemStack.func_77976_d())));
/* 32 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("hasTag"), BoxesRunTime.boxToBoolean(itemStack.func_77942_o())));
/* 33 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), Item.field_150901_e.func_148750_c(itemStack.func_77973_b())));
/* 34 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("label"), itemStack.func_82833_r()));
/* 35 */       (itemStack.func_77942_o() && 
/* 36 */         itemStack.func_77978_p().func_150297_b("display", 10) && 
/* 37 */         itemStack.func_77978_p().func_74775_l("display").func_150297_b("Lore", 9)) ? 
/* 38 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$
/*    */ 
/*    */           
/* 41 */           .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("lore"), li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(itemStack.func_77978_p().func_74775_l("display").func_150295_c("Lore", 8)).map((Function1)new ConverterItemStack$$anonfun$convert$3()).mkString("\n"))) : BoxedUnit.UNIT;
/*    */ 
/*    */       
/* 44 */       ArrayBuffer enchantments = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/* 45 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(EnchantmentHelper.func_82781_a(itemStack)).collect((PartialFunction)new ConverterItemStack$$anonfun$convert$1(enchantments), scala.collection.mutable.Iterable$.MODULE$.canBuildFrom());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 58 */       enchantments.nonEmpty() ? 
/* 59 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("enchantments"), enchantments)) : BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */       
/* 63 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("tag"), CompressedStreamTools.func_74798_a(itemStack.func_77978_p()))); BoxedUnit boxedUnit = (itemStack.func_77942_o() && li.cil.oc.Settings$.MODULE$.get().allowItemStackNBTTags()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */     else
/* 65 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$convert$2 extends AbstractFunction1<Object, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(int x$1) {
/*    */       return OreDictionary.getOreName(x$1);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$convert$3 extends AbstractFunction1<NBTTagString, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(NBTTagString tag) {
/*    */       return tag.func_150285_a_();
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$convert$1 extends AbstractPartialFunction<Tuple2<Object, Object>, ArrayBuffer<Map<String, Object>>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ArrayBuffer enchantments$1;
/*    */     
/*    */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) {
/*    */       Tuple2 tuple2 = x1;
/*    */       if (tuple2 != null) {
/*    */         Object id = tuple2._1(), level = tuple2._2();
/*    */         if (id instanceof Integer) {
/*    */           int i = BoxesRunTime.unboxToInt(id);
/*    */           if (level instanceof Integer) {
/*    */             int j = BoxesRunTime.unboxToInt(level);
/*    */             if (i >= 0 && i < Enchantment.field_77331_b.length && Enchantment.field_77331_b[i] != null) {
/*    */               Enchantment enchantment = Enchantment.field_77331_b[i];
/*    */               (new Tuple2[3])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), enchantment.func_77320_a());
/*    */               (new Tuple2[3])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("label"), enchantment.func_77316_c(j));
/*    */               (new Tuple2[3])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("level"), BoxesRunTime.boxToInteger(j));
/*    */               Map map = (Map)scala.collection.mutable.Map$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[3]));
/*    */               li.cil.oc.Settings$.MODULE$.get().insertIdsInConverters() ? map.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToInteger(i))) : BoxedUnit.UNIT;
/*    */               return (B1)this.enchantments$1.$plus$eq(map);
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       return (B1)default.apply(x1);
/*    */     }
/*    */     
/*    */     public final boolean isDefinedAt(Tuple2 x1) {
/*    */       Tuple2 tuple2 = x1;
/*    */       if (tuple2 != null) {
/*    */         Object id = tuple2._1(), level = tuple2._2();
/*    */         if (id instanceof Integer) {
/*    */           int i = BoxesRunTime.unboxToInt(id);
/*    */           if (level instanceof Integer && i >= 0 && i < Enchantment.field_77331_b.length && Enchantment.field_77331_b[i] != null)
/*    */             return true; 
/*    */         } 
/*    */       } 
/*    */       return false;
/*    */     }
/*    */     
/*    */     public ConverterItemStack$$anonfun$convert$1(ArrayBuffer enchantments$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterItemStack$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */