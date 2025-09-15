/*    */ package li.cil.oc.common.nanomachines;@ScalaSignature(bytes = "\006\001u<Q!\001\002\t\0025\tABT1o_6\f7\r[5oKNT!a\001\003\002\0319\fgn\\7bG\"Lg.Z:\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021ABT1o_6\f7\r[5oKN\0342a\004\n\033!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016!\033\005a\"BA\017\037\003\031!W\r^1jY*\021qDB\001\004CBL\027BA\021\035\005=q\025M\\8nC\016D\027N\\3t\003BK\005\"B\022\020\t\003!\023A\002\037j]&$h\bF\001\016\021\0351sB1A\005\002\035\n\021\002\035:pm&$WM]:\026\003!\0022!\013\0313\033\005Q#BA\026-\003\035iW\017^1cY\026T!!\f\030\002\025\r|G\016\\3di&|gNC\0010\003\025\0318-\0317b\023\t\t$FA\002TKR\004\"aM\033\016\003QR!a\001\020\n\005Y\"$\001\005\"fQ\0064\030n\034:Qe>4\030\016Z3s\021\031At\002)A\005Q\005Q\001O]8wS\022,'o\035\021\t\017iz!\031!C\001w\005\t2/\032:wKJ\034uN\034;s_2dWM]:\026\003q\002B!K\037@\027&\021aH\013\002\f/\026\f7\016S1tQ6\013\007\017\005\002A\0236\t\021I\003\002C\007\0061\001\017\\1zKJT!\001R#\002\r\025tG/\033;z\025\t1u)A\005nS:,7M]1gi*\t\001*A\002oKRL!AS!\003\031\025sG/\033;z!2\f\0270\032:\021\0059a\025BA'\003\0059\031uN\034;s_2dWM]%na2DaaT\b!\002\023a\024AE:feZ,'oQ8oiJ|G\016\\3sg\002Bq!U\bC\002\023\0051(A\tdY&,g\016^\"p]R\024x\016\0347feNDaaU\b!\002\023a\024AE2mS\026tGoQ8oiJ|G\016\\3sg\002BQ!V\b\005\002Y\0131bY8oiJ|G\016\\3sgR\021Ah\026\005\006\005R\003\ra\020\005\0063>!\tEW\001\fC\022$\007K]8wS\022,'\017\006\002\\?B\021A,X\007\002]%\021aL\f\002\005+:LG\017C\003a1\002\007!'\001\005qe>4\030\016Z3s\021\025\021w\002\"\021d\00319W\r\036)s_ZLG-\032:t)\005!\007cA\nfe%\021a\r\006\002\t\023R,'/\0312mK\")\001n\004C\001S\006iq-\032;D_:$(o\0347mKJ$\"A[7\021\005MZ\027B\00175\005)\031uN\034;s_2dWM\035\005\006\005\036\004\ra\020\005\006_>!\t\001]\001\016Q\006\0348i\0348ue>dG.\032:\025\005E$\bC\001/s\023\t\031hFA\004C_>dW-\0318\t\013\ts\007\031A \t\013Y|A\021A<\002#%t7\017^1mY\016{g\016\036:pY2,'\017\006\002kq\")!)\036a\001!)!p\004C!w\006\031RO\\5ogR\fG\016\\\"p]R\024x\016\0347feR\0211\f \005\006\005f\004\ra\020")
/*    */ public final class Nanomachines { public static void uninstallController(EntityPlayer paramEntityPlayer) {
/*    */     Nanomachines$.MODULE$.uninstallController(paramEntityPlayer);
/*    */   } public static Controller installController(EntityPlayer paramEntityPlayer) {
/*    */     return Nanomachines$.MODULE$.installController(paramEntityPlayer);
/*    */   } public static boolean hasController(EntityPlayer paramEntityPlayer) {
/*    */     return Nanomachines$.MODULE$.hasController(paramEntityPlayer);
/*    */   } public static Controller getController(EntityPlayer paramEntityPlayer) {
/*    */     return Nanomachines$.MODULE$.getController(paramEntityPlayer);
/*    */   } public static Iterable<BehaviorProvider> getProviders() {
/*    */     return Nanomachines$.MODULE$.getProviders();
/*    */   } public static void addProvider(BehaviorProvider paramBehaviorProvider) {
/*    */     Nanomachines$.MODULE$.addProvider(paramBehaviorProvider);
/*    */   } public static WeakHashMap<EntityPlayer, ControllerImpl> controllers(EntityPlayer paramEntityPlayer) {
/*    */     return Nanomachines$.MODULE$.controllers(paramEntityPlayer);
/*    */   }
/*    */   public static WeakHashMap<EntityPlayer, ControllerImpl> clientControllers() {
/*    */     return Nanomachines$.MODULE$.clientControllers();
/*    */   }
/*    */   public static WeakHashMap<EntityPlayer, ControllerImpl> serverControllers() {
/*    */     return Nanomachines$.MODULE$.serverControllers();
/*    */   }
/*    */   public static Set<BehaviorProvider> providers() {
/*    */     return Nanomachines$.MODULE$.providers();
/*    */   }
/*    */   public final class Nanomachines$$anonfun$getController$1 extends AbstractFunction0<ControllerImpl> implements Serializable { public final ControllerImpl apply() {
/* 27 */       return new ControllerImpl(this.player$1);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final EntityPlayer player$1;
/*    */     
/*    */     public Nanomachines$$anonfun$getController$1(EntityPlayer player$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\Nanomachines.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */