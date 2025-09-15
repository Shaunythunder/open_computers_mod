/*    */ package li.cil.oc.server.network;
/*    */ @ScalaSignature(bytes = "\006\001];Q!\001\002\t\0025\tA\002R3ck\036tU\r^<pe.T!a\001\003\002\0179,Go^8sW*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\007EK\n,xMT3uo>\0248n\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\001;\005)1-\031:egV\ta\004\005\003 I\031BT\"\001\021\013\005\005\022\023aB7vi\006\024G.\032\006\003GQ\t!bY8mY\026\034G/[8o\023\t)\003EA\006XK\006\\\007*Y:i\033\006\004\bCA\024)\033\005yaaB\025\020!\003\r\nA\013\002\n\t\026\024Wo\032(pI\026\034\"\001\013\n\t\0131Bc\021A\027\002\017\005$GM]3tgV\ta\006\005\0020e9\0211\003M\005\003cQ\ta\001\025:fI\0264\027BA\0325\005\031\031FO]5oO*\021\021\007\006\005\006m!2\taN\001\016e\026\034W-\033<f!\006\0347.\032;\025\005aZ\004CA\n:\023\tQDC\001\003V]&$\b\"\002\0376\001\004i\024A\0029bG.,G\017\005\002?\0056\tqH\003\002\004\001*\021\021IB\001\004CBL\027BA\"@\005\031\001\026mY6fi\"1Qi\004Q\001\ny\taaY1sIN\004\003\"B$\020\t\003A\025aA1eIR\021\001(\023\005\006\025\032\003\rAJ\001\005G\006\024H\rC\003M\037\021\005Q*\001\004sK6|g/\032\013\003q9CQAS&A\002\031BQ\001U\b\005\002E\0131bZ3u\013:$\007o\\5oiR\021!+\026\t\004'M3\023B\001+\025\005\031y\005\017^5p]\")ak\024a\001]\0051A/\0368oK2\004")
/*    */ public final class DebugNetwork { public static Option<DebugNode> getEndpoint(String paramString) {
/*    */     return DebugNetwork$.MODULE$.getEndpoint(paramString);
/*    */   }
/*    */   public static void remove(DebugNode paramDebugNode) {
/*    */     DebugNetwork$.MODULE$.remove(paramDebugNode);
/*    */   }
/*    */   public static void add(DebugNode paramDebugNode) {
/*    */     DebugNetwork$.MODULE$.add(paramDebugNode);
/*    */   }
/*    */   public static WeakHashMap<DebugNode, BoxedUnit> cards() {
/*    */     return DebugNetwork$.MODULE$.cards();
/*    */   }
/*    */   public static interface DebugNode { String address();
/*    */     void receivePacket(Packet param1Packet); }
/*    */   public final class DebugNetwork$$anonfun$getEndpoint$1 extends AbstractFunction1<DebugNode, Object> implements Serializable { public final boolean apply(DebugNetwork.DebugNode x$1) {
/* 18 */       String str = this.tunnel$1; if (x$1.address() == null) { x$1.address(); if (str != null); } else if (x$1.address().equals(str))
/*    */       {  }
/*    */     
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final String tunnel$1;
/*    */     
/*    */     public DebugNetwork$$anonfun$getEndpoint$1(String tunnel$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\DebugNetwork.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */