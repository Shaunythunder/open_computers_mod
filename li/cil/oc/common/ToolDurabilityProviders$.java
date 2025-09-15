/*    */ package li.cil.oc.common;
/*    */ import java.lang.reflect.Method;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ToolDurabilityProviders$ {
/*    */   public static final ToolDurabilityProviders$ MODULE$;
/*    */   
/*    */   private ArrayBuffer<Method> providers() {
/* 10 */     return this.providers;
/*    */   } private final ArrayBuffer<Method> providers; public void add(Method provider) {
/* 12 */     providers().$plus$eq(provider);
/*    */   }
/* 14 */   public Option<Object> getDurability(ItemStack stack) { Object object = new Object(); try {
/* 15 */       providers().foreach((Function1)new ToolDurabilityProviders$$anonfun$getDurability$1(stack, object));
/*    */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*    */       if (nonLocalReturnControl.key() == object)
/*    */         return (Option<Object>)nonLocalReturnControl.value(); 
/*    */     } 
/* 20 */     return stack.func_77984_f() ? scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(1.0D - stack.func_77960_j() / stack.func_77958_k())) : 
/* 21 */       (Option<Object>)scala.None$.MODULE$; }
/*    */    private ToolDurabilityProviders$() {
/* 23 */     MODULE$ = this;
/*    */     this.providers = (ArrayBuffer<Method>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*    */   }
/*    */   
/*    */   public final class ToolDurabilityProviders$$anonfun$getDurability$1 extends AbstractFunction1<Method, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ItemStack stack$1;
/*    */     private final Object nonLocalReturnKey1$1;
/*    */     
/*    */     public ToolDurabilityProviders$$anonfun$getDurability$1(ItemStack stack$1, Object nonLocalReturnKey1$1) {}
/*    */     
/*    */     public final void apply(Method provider) {
/*    */       double durability = BoxesRunTime.unboxToDouble(IMC$.MODULE$.tryInvokeStatic(provider, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToDouble(Double.NaN)));
/*    */       if (scala.Predef$.MODULE$.double2Double(durability).isNaN())
/*    */         return; 
/*    */       throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(durability)));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\ToolDurabilityProviders$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */