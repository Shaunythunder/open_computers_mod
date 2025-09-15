/*    */ package li.cil.oc.common.inventory;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class SimpleInventory$class {
/*    */   public static boolean hasCustomInventoryName(SimpleInventory $this) {
/*  7 */     return false;
/*    */   } public static void $init$(SimpleInventory $this) {} public static int getInventoryStackLimit(SimpleInventory $this) {
/*  9 */     return 64;
/*    */   }
/*    */   public static int getInventoryStackRequired(SimpleInventory $this) {
/* 12 */     return 1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void openInventory(SimpleInventory $this) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void closeInventory(SimpleInventory $this) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ItemStack decrStackSize(SimpleInventory $this, int slot, int amount) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: iconst_0
/*    */     //   2: if_icmplt -> 131
/*    */     //   5: iload_1
/*    */     //   6: aload_0
/*    */     //   7: invokeinterface func_70302_i_ : ()I
/*    */     //   12: if_icmpge -> 131
/*    */     //   15: aload_0
/*    */     //   16: iload_1
/*    */     //   17: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   22: astore #4
/*    */     //   24: aload #4
/*    */     //   26: ifnull -> 64
/*    */     //   29: aload #4
/*    */     //   31: astore #5
/*    */     //   33: aload #5
/*    */     //   35: getfield field_77994_a : I
/*    */     //   38: iload_2
/*    */     //   39: isub
/*    */     //   40: aload_0
/*    */     //   41: invokeinterface getInventoryStackRequired : ()I
/*    */     //   46: if_icmpge -> 64
/*    */     //   49: aload_0
/*    */     //   50: iload_1
/*    */     //   51: aconst_null
/*    */     //   52: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   57: aload #5
/*    */     //   59: astore #6
/*    */     //   61: goto -> 97
/*    */     //   64: aload #4
/*    */     //   66: ifnull -> 94
/*    */     //   69: aload #4
/*    */     //   71: astore #7
/*    */     //   73: aload #7
/*    */     //   75: iload_2
/*    */     //   76: invokevirtual func_77979_a : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   79: astore #8
/*    */     //   81: aload_0
/*    */     //   82: invokeinterface func_70296_d : ()V
/*    */     //   87: aload #8
/*    */     //   89: astore #6
/*    */     //   91: goto -> 97
/*    */     //   94: aconst_null
/*    */     //   95: astore #6
/*    */     //   97: aload #6
/*    */     //   99: astore_3
/*    */     //   100: aload_3
/*    */     //   101: ifnull -> 123
/*    */     //   104: aload_3
/*    */     //   105: astore #9
/*    */     //   107: aload #9
/*    */     //   109: getfield field_77994_a : I
/*    */     //   112: iconst_0
/*    */     //   113: if_icmple -> 123
/*    */     //   116: aload #9
/*    */     //   118: astore #10
/*    */     //   120: goto -> 126
/*    */     //   123: aconst_null
/*    */     //   124: astore #10
/*    */     //   126: aload #10
/*    */     //   128: goto -> 132
/*    */     //   131: aconst_null
/*    */     //   132: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     //   #20	-> 15
/*    */     //   #21	-> 24
/*    */     //   #22	-> 49
/*    */     //   #23	-> 57
/*    */     //   #21	-> 59
/*    */     //   #24	-> 64
/*    */     //   #25	-> 73
/*    */     //   #26	-> 81
/*    */     //   #27	-> 87
/*    */     //   #24	-> 89
/*    */     //   #28	-> 94
/*    */     //   #20	-> 97
/*    */     //   #30	-> 100
/*    */     //   #31	-> 123
/*    */     //   #20	-> 126
/*    */     //   #34	-> 131
/*    */     //   #19	-> 132
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	133	0	$this	Lli/cil/oc/common/inventory/SimpleInventory;
/*    */     //   0	133	1	slot	I
/*    */     //   0	133	2	amount	I
/*    */     //   81	8	8	result	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ItemStack getStackInSlotOnClosing(SimpleInventory $this, int slot) {
/* 39 */     ItemStack stack = $this.func_70301_a(slot);
/* 40 */     $this.func_70299_a(slot, null);
/* 41 */     return (slot >= 0 && slot < $this.func_70302_i_()) ? stack : 
/*    */       
/* 43 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\SimpleInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */