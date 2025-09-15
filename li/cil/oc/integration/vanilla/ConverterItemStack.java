/*    */ package li.cil.oc.integration.vanilla;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.enchantment.Enchantment;
/*    */ import net.minecraft.nbt.NBTTagString;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001m:Q!\001\002\t\0025\t!cQ8om\026\024H/\032:Ji\026l7\013^1dW*\0211\001B\001\bm\006t\027\016\0347b\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t\0212i\0348wKJ$XM]%uK6\034F/Y2l'\ry!C\007\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\0211\004I\007\0029)\021QDH\001\007IJLg/\032:\013\005}1\021aA1qS&\021\021\005\b\002\n\007>tg/\032:uKJDQaI\b\005\002\021\na\001P5oSRtD#A\007\t\013\031zA\021I\024\002\017\r|gN^3siR\031\001FL\032\021\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\tUs\027\016\036\005\006_\025\002\r\001M\001\006m\006dW/\032\t\003SEJ!A\r\026\003\r\005s\027PU3g\021\025!T\0051\0016\003\031yW\017\0369viB!a'\017\0311\033\0059$B\001\035\027\003\021)H/\0337\n\005i:$aA'ba\002")
/*    */ public final class ConverterItemStack {
/*    */   public static void convert(Object paramObject, Map<Object, Object> paramMap) {
/*    */     ConverterItemStack$.MODULE$.convert(paramObject, paramMap);
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$convert$2 extends AbstractFunction1<Object, String> implements Serializable {
/*    */     public final String apply(int x$1) {
/* 26 */       return OreDictionary.getOreName(x$1);
/*    */     }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$convert$3
/*    */     extends AbstractFunction1<NBTTagString, String>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(NBTTagString tag) {
/* 40 */       return tag.func_150285_a_();
/*    */     } }
/*    */   public final class ConverterItemStack$$anonfun$convert$1 extends AbstractPartialFunction<Tuple2<Object, Object>, ArrayBuffer<Map<String, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer enchantments$1;
/*    */     
/*    */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) {
/* 45 */       Tuple2 tuple2 = x1; if (tuple2 != null) {
/* 46 */         Object id = tuple2._1(), level = tuple2._2(); if (id instanceof Integer) { int i = BoxesRunTime.unboxToInt(id); if (level instanceof Integer) { int j = BoxesRunTime.unboxToInt(level); if (i >= 0 && i < Enchantment.field_77331_b.length && Enchantment.field_77331_b[i] != null) {
/* 47 */               Enchantment enchantment = Enchantment.field_77331_b[i];
/* 48 */               (new Tuple2[3])[0] = Predef$ArrowAssoc$.MODULE$
/* 49 */                 .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("name"), enchantment.func_77320_a());
/* 50 */               (new Tuple2[3])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("label"), enchantment.func_77316_c(j));
/* 51 */               (new Tuple2[3])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("level"), BoxesRunTime.boxToInteger(j));
/*    */               Map map = (Map)Map$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[3]));
/* 53 */               Settings$.MODULE$.get().insertIdsInConverters() ? 
/* 54 */                 map.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("id"), BoxesRunTime.boxToInteger(i))) : BoxedUnit.UNIT;
/*    */               
/* 56 */               return (B1)this.enchantments$1.$plus$eq(map);
/*    */             }  }
/*    */            }
/*    */       
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
/*    */     public ConverterItemStack$$anonfun$convert$1(ArrayBuffer enchantments$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterItemStack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */