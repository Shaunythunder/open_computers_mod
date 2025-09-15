/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Delegator$
/*    */ {
/*    */   public static final Delegator$ MODULE$;
/*    */   
/*    */   public Option<Delegate> subItem(ItemStack stack) {
/*    */     scala.None$ none$;
/* 34 */     Item item = stack.func_77973_b();
/* 35 */     if (item instanceof Delegator) { Delegator delegator = (Delegator)item; Option<Delegate> option = delegator.subItem(stack.func_77960_j()); }
/* 36 */     else { none$ = scala.None$.MODULE$; }
/*    */     
/* 38 */     return (stack == null) ? (Option<Delegate>)scala.None$.MODULE$ : (Option<Delegate>)none$;
/*    */   }
/*    */   private Delegator$() {
/* 41 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Delegator$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */