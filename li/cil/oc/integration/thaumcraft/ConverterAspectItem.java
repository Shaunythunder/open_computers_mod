/*    */ package li.cil.oc.integration.thaumcraft;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ import thaumcraft.api.aspects.Aspect;
/*    */ import thaumcraft.api.aspects.AspectList;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y:Q!\001\002\t\0025\t1cQ8om\026\024H/\032:BgB,7\r^%uK6T!a\001\003\002\025QD\027-^7de\0064GO\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\024\007>tg/\032:uKJ\f5\017]3di&#X-\\\n\004\037IQ\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\005m\001S\"\001\017\013\005uq\022A\0023sSZ,'O\003\002 \r\005\031\021\r]5\n\005\005b\"!C\"p]Z,'\017^3s\021\025\031s\002\"\001%\003\031a\024N\\5u}Q\tQ\002C\003'\037\021\005s%A\004d_:4XM\035;\025\007!r3\007\005\002*Y5\t!FC\001,\003\025\0318-\0317b\023\ti#F\001\003V]&$\b\"B\030&\001\004\001\024!\002<bYV,\007CA\0252\023\t\021$FA\002B]fDQ\001N\023A\002U\naa\\;uaV$\b\003\002\034:wmj\021a\016\006\003qY\tA!\036;jY&\021!h\016\002\004\033\006\004\bCA\025=\023\ti$F\001\004B]f\024VM\032")
/*    */ public final class ConverterAspectItem {
/*    */   public static void convert(Object paramObject, Map<Object, Object> paramMap) {
/*    */     ConverterAspectItem$.MODULE$.convert(paramObject, paramMap);
/*    */   }
/*    */   
/*    */   public final class ConverterAspectItem$$anonfun$convert$1
/*    */     extends AbstractFunction1<Aspect, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Map output$1;
/*    */     private final IntRef i$1;
/*    */     private final AspectList x4$1;
/*    */     
/*    */     public ConverterAspectItem$$anonfun$convert$1(Map output$1, IntRef i$1, AspectList x4$1) {}
/*    */     
/*    */     public final void apply(Aspect aspect) {
/* 33 */       if (aspect != null) {
/* 34 */         HashMap<Object, Object> aspectMap = new HashMap<>();
/* 35 */         WrapAsScala$.MODULE$.mapAsScalaMap(aspectMap).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("name"), aspect.getName()));
/* 36 */         WrapAsScala$.MODULE$.mapAsScalaMap(aspectMap).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(this.x4$1.getAmount(aspect))));
/* 37 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.output$1).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(this.i$1.elem)), aspectMap));
/* 38 */         this.i$1.elem++;
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumcraft\ConverterAspectItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */