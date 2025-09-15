/*    */ package li.cil.oc.common.inventory;@ScalaSignature(bytes = "\006\001\0013q!\001\002\021\002\007\005QB\001\nJi\026l7\013^1dW&sg/\0328u_JL(BA\002\005\003%IgN^3oi>\024\030P\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\tA\001\\1oO*\t1#\001\003kCZ\f\027BA\013\021\005\031y%M[3diB\021q\003G\007\002\005%\021\021D\001\002\n\023:4XM\034;pefDQa\007\001\005\002q\ta\001J5oSR$C#A\017\021\005y\tS\"A\020\013\003\001\nQa]2bY\006L!AI\020\003\tUs\027\016\036\005\006I\0011\t!J\001\nG>tG/Y5oKJ,\022A\n\t\003O9j\021\001\013\006\003S)\nA!\033;f[*\0211\006L\001\n[&tWm\031:bMRT\021!L\001\004]\026$\030BA\030)\005%IE/Z7Ti\006\0347\016\003\005\004\001!\025\r\021\"\0032+\005\021\004c\001\0204k%\021Ag\b\002\006\003J\024\030-\037\t\004=Y2\023BA\034 \005\031y\005\017^5p]\"A\021\b\001E\001B\003&!'\001\006j]Z,g\016^8ss\002BQa\017\001\005BE\nQ!\033;f[NDQ!\020\001\005\002q\tAB]3j]&$\030.\0317ju\026DQa\020\001\005Bq\t\021\"\\1sW\022K'\017^=")
/*    */ public interface ItemStackInventory extends Inventory { ItemStack container();
/*    */   Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory();
/*    */   Option<ItemStack>[] items();
/*    */   void reinitialize();
/*    */   
/*    */   void func_70296_d();
/*    */   
/*    */   public final class ItemStackInventory$$anonfun$li$cil$oc$common$inventory$ItemStackInventory$$inventory$1 extends AbstractFunction0<None$> implements Serializable { public final None$ apply() {
/* 10 */       return None$.MODULE$;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ItemStackInventory$$anonfun$li$cil$oc$common$inventory$ItemStackInventory$$inventory$1(ItemStackInventory $outer) {} }
/*    */   
/*    */   public final class ItemStackInventory$$anonfun$reinitialize$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int i) {
/* 21 */       apply$mcVI$sp(i); } public ItemStackInventory$$anonfun$reinitialize$1(ItemStackInventory $outer) {} public void apply$mcVI$sp(int i) {
/* 22 */       this.$outer.updateItems(i, null);
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\ItemStackInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */