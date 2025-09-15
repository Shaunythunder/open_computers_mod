/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!;Q!\001\002\t\0025\tAbQ8om\026\024H/\032:O\005RS!a\001\003\002\017Y\fg.\0337mC*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021AbQ8om\026\024H/\032:O\005R\0332a\004\n\033!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016!\033\005a\"BA\017\037\003\031!'/\033<fe*\021qDB\001\004CBL\027BA\021\035\005%\031uN\034<feR,'\017C\003$\037\021\005A%\001\004=S:LGO\020\013\002\033!)ae\004C!O\00591m\0348wKJ$Hc\001\025/gA\021\021\006L\007\002U)\t1&A\003tG\006d\027-\003\002.U\t!QK\\5u\021\025yS\0051\0011\003\0251\030\r\\;f!\tI\023'\003\0023U\t1\021I\\=SK\032DQ\001N\023A\002U\naa\\;uaV$\b\003\002\034:aAj\021a\016\006\003qY\tA!\036;jY&\021!h\016\002\004\033\006\004\b\"\002\024\020\t\023aDC\001\031>\021\025q4\b1\001@\003\rq'\r\036\t\003\001\032k\021!\021\006\003}\tS!a\021#\002\0235Lg.Z2sC\032$(\"A#\002\0079,G/\003\002H\003\n9aJ\021+CCN,\007")
/*    */ public final class ConverterNBT {
/*    */   public static void convert(Object paramObject, Map<Object, Object> paramMap) {
/*    */     ConverterNBT$.MODULE$.convert(paramObject, paramMap);
/*    */   }
/*    */   
/*    */   public final class ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$2
/*    */     extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagList copy$1;
/*    */     
/*    */     public final Object apply(int x$1) {
/* 28 */       return ConverterNBT$.MODULE$.li$cil$oc$integration$vanilla$ConverterNBT$$convert(this.copy$1.func_74744_a(0));
/*    */     } public ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$2(NBTTagList copy$1) {}
/* 30 */   } public final class ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$1 extends AbstractPartialFunction<Object, Tuple2<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound x11$1; public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) { Object object2, object1 = x1;
/* 31 */       if (object1 instanceof String) { String str = (String)object1; object2 = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(str), ConverterNBT$.MODULE$.li$cil$oc$integration$vanilla$ConverterNBT$$convert(this.x11$1.func_74781_a(str))); } else { object2 = default.apply(x1); }  return (B1)object2; } public final boolean isDefinedAt(Object x1) { boolean bool; Object object = x1; if (object instanceof String) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/*    */       
/*    */       return bool; }
/*    */ 
/*    */     
/*    */     public ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$1(NBTTagCompound x11$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterNBT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */