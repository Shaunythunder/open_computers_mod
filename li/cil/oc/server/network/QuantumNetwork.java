/*    */ package li.cil.oc.server.network;
/*    */ @ScalaSignature(bytes = "\006\001i;Q!\001\002\t\0025\ta\"U;b]R,XNT3uo>\0248N\003\002\004\t\0059a.\032;x_J\\'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\035E+\030M\034;v[:+Go^8sWN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001b\002\017\020\005\004%\t!H\001\biVtg.\0327t+\005q\002\003B\020%M5j\021\001\t\006\003C\t\nq!\\;uC\ndWM\003\002$)\005Q1m\0347mK\016$\030n\0348\n\005\025\002#aA'baB\021qE\013\b\003'!J!!\013\013\002\rA\023X\rZ3g\023\tYCF\001\004TiJLgn\032\006\003SQ\001Ba\b\0301w%\021q\006\t\002\f/\026\f7\016S1tQ6\013\007\017\005\0022e5\tqBB\0044\037A\005\031\023\001\033\003\027E+\030M\034;v[:{G-Z\n\003eIAQA\016\032\007\002]\na\001^;o]\026dW#\001\024\t\013e\022d\021\001\036\002\033I,7-Z5wKB\0137m[3u)\tYd\b\005\002\024y%\021Q\b\006\002\005+:LG\017C\003@q\001\007\001)\001\004qC\016\\W\r\036\t\003\003\026k\021A\021\006\003\007\rS!\001\022\004\002\007\005\004\030.\003\002G\005\n1\001+Y2lKRDa\001S\b!\002\023q\022\001\003;v]:,Gn\035\021\t\013){A\021A&\002\007\005$G\r\006\002<\031\")Q*\023a\001a\005!1-\031:e\021\025yu\002\"\001Q\003\031\021X-\\8wKR\0211(\025\005\006\033:\003\r\001\r\005\006'>!\t\001V\001\rO\026$XI\0343q_&tGo\035\013\003+f\0032AV,1\033\005\021\023B\001-#\005!IE/\032:bE2,\007\"\002\034S\001\0041\003")
/*    */ public final class QuantumNetwork { public static Iterable<QuantumNode> getEndpoints(String paramString) {
/*    */     return QuantumNetwork$.MODULE$.getEndpoints(paramString);
/*    */   } public static void remove(QuantumNode paramQuantumNode) {
/*    */     QuantumNetwork$.MODULE$.remove(paramQuantumNode);
/*    */   } public static void add(QuantumNode paramQuantumNode) {
/*    */     QuantumNetwork$.MODULE$.add(paramQuantumNode);
/*    */   } public static Map<String, WeakHashMap<QuantumNode, BoxedUnit>> tunnels() {
/*    */     return QuantumNetwork$.MODULE$.tunnels();
/*    */   } public static interface QuantumNode { String tunnel(); void receivePacket(Packet param1Packet); } public final class QuantumNetwork$$anonfun$add$1 extends AbstractFunction0<WeakHashMap<QuantumNode, BoxedUnit>> implements Serializable { public final WeakHashMap<QuantumNetwork.QuantumNode, BoxedUnit> apply() {
/* 12 */       return WeakHashMap$.MODULE$.empty();
/*    */     } public static final long serialVersionUID = 0L; }
/*    */   public final class QuantumNetwork$$anonfun$remove$1 extends AbstractFunction1<WeakHashMap<QuantumNode, BoxedUnit>, Option<BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; private final QuantumNetwork.QuantumNode card$1;
/*    */     public final Option<BoxedUnit> apply(WeakHashMap x$1) {
/* 16 */       return x$1.remove(this.card$1);
/*    */     } public QuantumNetwork$$anonfun$remove$1(QuantumNetwork.QuantumNode card$1) {} }
/*    */   public final class QuantumNetwork$$anonfun$getEndpoints$1 extends AbstractFunction0<Iterable<QuantumNode>> implements Serializable { public static final long serialVersionUID = 0L;
/* 19 */     public final Iterable<QuantumNetwork.QuantumNode> apply() { return (Iterable<QuantumNetwork.QuantumNode>)package$.MODULE$.Iterable().empty(); } } public final class QuantumNetwork$$anonfun$getEndpoints$2 extends AbstractFunction1<WeakHashMap<QuantumNode, BoxedUnit>, Iterable<QuantumNode>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<QuantumNetwork.QuantumNode> apply(WeakHashMap x$2) { return x$2.keys(); }
/*    */      }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\QuantumNetwork.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */