/*    */ package li.cil.oc.server.network;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class DebugNetwork$ {
/*    */   public static final DebugNetwork$ MODULE$;
/*    */   
/*    */   public WeakHashMap<DebugNetwork.DebugNode, BoxedUnit> cards() {
/*  8 */     return this.cards;
/*    */   } private final WeakHashMap<DebugNetwork.DebugNode, BoxedUnit> cards;
/*    */   public void add(DebugNetwork.DebugNode card) {
/* 11 */     cards().put(card, BoxedUnit.UNIT);
/*    */   }
/*    */   
/*    */   public void remove(DebugNetwork.DebugNode card) {
/* 15 */     cards().remove(card);
/*    */   }
/*    */   
/* 18 */   public Option<DebugNetwork.DebugNode> getEndpoint(String tunnel) { return cards().keys().find((Function1)new DebugNetwork$$anonfun$getEndpoint$1(tunnel)); } public final class DebugNetwork$$anonfun$getEndpoint$1 extends AbstractFunction1<DebugNetwork.DebugNode, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String tunnel$1; public final boolean apply(DebugNetwork.DebugNode x$1) { String str = this.tunnel$1; if (x$1.address() == null) { x$1.address(); if (str != null); } else if (x$1.address().equals(str))
/*    */       {  }
/*    */        }
/*    */     
/*    */     public DebugNetwork$$anonfun$getEndpoint$1(String tunnel$1) {} }
/*    */   
/*    */   private DebugNetwork$() {
/* 25 */     MODULE$ = this;
/*    */     this.cards = scala.collection.mutable.WeakHashMap$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\DebugNetwork$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */