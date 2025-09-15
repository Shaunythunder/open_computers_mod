/*    */ package li.cil.oc.integration.forestry;
/*    */ 
/*    */ import forestry.api.circuits.ICircuit;
/*    */ import java.util.Map;
/*    */ import scala.Function1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y:Q!\001\002\t\0025\t!cQ8om\026\024H/\032:Ji\026l7\013^1dW*\0211\001B\001\tM>\024Xm\035;ss*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!cQ8om\026\024H/\032:Ji\026l7\013^1dWN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\021\016\003qQ!!\b\020\002\r\021\024\030N^3s\025\tyb!A\002ba&L!!\t\017\003\023\r{gN^3si\026\024\b\"B\022\020\t\003!\023A\002\037j]&$h\bF\001\016\021\0251s\002\"\021(\003\035\031wN\034<feR$2\001\013\0304!\tIC&D\001+\025\005Y\023!B:dC2\f\027BA\027+\005\021)f.\033;\t\013=*\003\031\001\031\002\013Y\fG.^3\021\005%\n\024B\001\032+\005\r\te.\037\005\006i\025\002\r!N\001\007_V$\b/\036;\021\tYJ4hO\007\002o)\021\001HF\001\005kRLG.\003\002;o\t\031Q*\0319\021\005%b\024BA\037+\005\031\te.\037*fM\002")
/*    */ public final class ConverterItemStack {
/*    */   public static void convert(Object paramObject, Map<Object, Object> paramMap) {
/*    */     ConverterItemStack$.MODULE$.convert(paramObject, paramMap);
/*    */   }
/*    */   
/*    */   public final class ConverterItemStack$$anonfun$1 extends AbstractPartialFunction<ICircuit, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final <A1 extends ICircuit, B1> B1 applyOrElse(ICircuit x1, Function1 default) { Object object;
/* 18 */       ICircuit iCircuit = x1; if (iCircuit != null) { ICircuit iCircuit1 = iCircuit; object = iCircuit1.getName(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(ICircuit x1) { boolean bool; ICircuit iCircuit = x1; if (iCircuit != null) { bool = true; } else { bool = false; }  return bool; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\ConverterItemStack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */