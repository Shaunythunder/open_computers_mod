/*    */ package li.cil.oc.server.network;
/*    */ import scala.collection.mutable.WeakHashMap;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class QuantumNetwork$ {
/*    */   public static final QuantumNetwork$ MODULE$;
/*    */   
/*    */   public Map<String, WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit>> tunnels() {
/*  9 */     return this.tunnels;
/*    */   } private final Map<String, WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit>> tunnels;
/*    */   public void add(QuantumNetwork.QuantumNode card) {
/* 12 */     ((Wrappers.JMapWrapperLike)tunnels().getOrElseUpdate(card.tunnel(), (Function0)new QuantumNetwork$$anonfun$add$1())).put(card, BoxedUnit.UNIT); } public final class QuantumNetwork$$anonfun$add$1 extends AbstractFunction0<WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; public final WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit> apply() { return scala.collection.mutable.WeakHashMap$.MODULE$.empty(); }
/*    */      }
/*    */ 
/*    */   
/* 16 */   public void remove(QuantumNetwork.QuantumNode card) { tunnels().get(card.tunnel()).foreach((Function1)new QuantumNetwork$$anonfun$remove$1(card)); } public final class QuantumNetwork$$anonfun$remove$1 extends AbstractFunction1<WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit>, Option<BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; private final QuantumNetwork.QuantumNode card$1; public final Option<BoxedUnit> apply(WeakHashMap x$1) { return x$1.remove(this.card$1); }
/*    */     
/*    */     public QuantumNetwork$$anonfun$remove$1(QuantumNetwork.QuantumNode card$1) {} }
/* 19 */   public Iterable<QuantumNetwork.QuantumNode> getEndpoints(String tunnel) { return (Iterable<QuantumNetwork.QuantumNode>)tunnels().get(tunnel).fold((Function0)new QuantumNetwork$$anonfun$getEndpoints$1(), (Function1)new QuantumNetwork$$anonfun$getEndpoints$2()); } public final class QuantumNetwork$$anonfun$getEndpoints$1 extends AbstractFunction0<Iterable<QuantumNetwork.QuantumNode>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<QuantumNetwork.QuantumNode> apply() { return (Iterable<QuantumNetwork.QuantumNode>)scala.package$.MODULE$.Iterable().empty(); } } public final class QuantumNetwork$$anonfun$getEndpoints$2 extends AbstractFunction1<WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit>, Iterable<QuantumNetwork.QuantumNode>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<QuantumNetwork.QuantumNode> apply(WeakHashMap x$2) { return x$2.keys(); }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private QuantumNetwork$() {
/* 27 */     MODULE$ = this;
/*    */     this.tunnels = scala.collection.mutable.Map$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\QuantumNetwork$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */