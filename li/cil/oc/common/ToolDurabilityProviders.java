/*    */ package li.cil.oc.common;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\0015;Q!\001\002\t\002-\tq\003V8pY\022+(/\0312jY&$\030\020\025:pm&$WM]:\013\005\r!\021AB2p[6|gN\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\001\"\001D\007\016\003\t1QA\004\002\t\002=\021q\003V8pY\022+(/\0312jY&$\030\020\025:pm&$WM]:\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!9!$\004b\001\n\023Y\022!\0039s_ZLG-\032:t+\005a\002cA\017#I5\taD\003\002 A\0059Q.\036;bE2,'BA\021\023\003)\031w\016\0347fGRLwN\\\005\003Gy\0211\"\021:sCf\024UO\0324feB\021Q\005L\007\002M)\021q\005K\001\be\0264G.Z2u\025\tI#&\001\003mC:<'\"A\026\002\t)\fg/Y\005\003[\031\022a!T3uQ>$\007BB\030\016A\003%A$\001\006qe>4\030\016Z3sg\002BQ!M\007\005\002I\n1!\0313e)\t\031d\007\005\002\022i%\021QG\005\002\005+:LG\017C\0038a\001\007A%\001\005qe>4\030\016Z3s\021\025IT\002\"\001;\00359W\r\036#ve\006\024\027\016\\5usR\0211(\021\t\004#qr\024BA\037\023\005\031y\005\017^5p]B\021\021cP\005\003\001J\021a\001R8vE2,\007\"\002\"9\001\004\031\025!B:uC\016\\\007C\001#L\033\005)%B\001$H\003\021IG/Z7\013\005!K\025!C7j]\026\034'/\0314u\025\005Q\025a\0018fi&\021A*\022\002\n\023R,Wn\025;bG.\004")
/*    */ public final class ToolDurabilityProviders {
/*    */   public static Option<Object> getDurability(ItemStack paramItemStack) {
/*    */     return ToolDurabilityProviders$.MODULE$.getDurability(paramItemStack);
/*    */   }
/*    */   
/*    */   public static void add(Method paramMethod) {
/*    */     ToolDurabilityProviders$.MODULE$.add(paramMethod);
/*    */   }
/*    */   
/*    */   public final class ToolDurabilityProviders$$anonfun$getDurability$1 extends AbstractFunction1<Method, BoxedUnit> implements Serializable {
/*    */     public final void apply(Method provider) {
/* 16 */       double durability = BoxesRunTime.unboxToDouble(IMC$.MODULE$.tryInvokeStatic(provider, (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToDouble(Double.NaN)));
/* 17 */       if (Predef$.MODULE$.double2Double(durability).isNaN()) return;  throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, Option$.MODULE$.apply(BoxesRunTime.boxToDouble(durability)));
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ItemStack stack$1;
/*    */     private final Object nonLocalReturnKey1$1;
/*    */     
/*    */     public ToolDurabilityProviders$$anonfun$getDurability$1(ItemStack stack$1, Object nonLocalReturnKey1$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\ToolDurabilityProviders.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */