/*    */ package li.cil.oc.common.inventory;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class DiskDriveMountableInventory$class {
/*    */   public static void $init$(DiskDriveMountableInventory $this) {}
/*    */   
/*    */   public static int tier(DiskDriveMountableInventory $this) {
/*  9 */     return 1;
/*    */   } public static int getSizeInventory(DiskDriveMountableInventory $this) {
/* 11 */     return 1;
/*    */   } public static String inventoryName(DiskDriveMountableInventory $this) {
/* 13 */     return "DiskDrive";
/*    */   } public static int getInventoryStackLimit(DiskDriveMountableInventory $this) {
/* 15 */     return 1;
/*    */   }
/*    */   
/*    */   public static boolean isItemValidForSlot(DiskDriveMountableInventory $this, int slot, ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: new scala/Tuple2
/*    */     //   3: dup
/*    */     //   4: iload_1
/*    */     //   5: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   8: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   11: aload_2
/*    */     //   12: ldc li/cil/oc/common/tileentity/DiskDrive
/*    */     //   14: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*    */     //   17: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   20: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   23: astore_3
/*    */     //   24: aload_3
/*    */     //   25: ifnull -> 121
/*    */     //   28: aload_3
/*    */     //   29: invokevirtual _1$mcI$sp : ()I
/*    */     //   32: istore #4
/*    */     //   34: aload_3
/*    */     //   35: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   38: checkcast scala/Option
/*    */     //   41: astore #5
/*    */     //   43: iconst_0
/*    */     //   44: iload #4
/*    */     //   46: if_icmpne -> 121
/*    */     //   49: aload #5
/*    */     //   51: instanceof scala/Some
/*    */     //   54: ifeq -> 121
/*    */     //   57: aload #5
/*    */     //   59: checkcast scala/Some
/*    */     //   62: astore #6
/*    */     //   64: aload #6
/*    */     //   66: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   69: checkcast li/cil/oc/api/driver/Item
/*    */     //   72: astore #7
/*    */     //   74: aload #7
/*    */     //   76: aload_2
/*    */     //   77: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   82: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   85: invokevirtual Floppy : ()Ljava/lang/String;
/*    */     //   88: astore #9
/*    */     //   90: dup
/*    */     //   91: ifnonnull -> 103
/*    */     //   94: pop
/*    */     //   95: aload #9
/*    */     //   97: ifnull -> 111
/*    */     //   100: goto -> 115
/*    */     //   103: aload #9
/*    */     //   105: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   108: ifeq -> 115
/*    */     //   111: iconst_1
/*    */     //   112: goto -> 116
/*    */     //   115: iconst_0
/*    */     //   116: istore #8
/*    */     //   118: goto -> 124
/*    */     //   121: iconst_0
/*    */     //   122: istore #8
/*    */     //   124: iload #8
/*    */     //   126: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 0
/*    */     //   #18	-> 28
/*    */     //   #19	-> 121
/*    */     //   #17	-> 124
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	127	0	$this	Lli/cil/oc/common/inventory/DiskDriveMountableInventory;
/*    */     //   0	127	1	slot	I
/*    */     //   0	127	2	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   74	53	7	driver	Lli/cil/oc/api/driver/Item;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\DiskDriveMountableInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */