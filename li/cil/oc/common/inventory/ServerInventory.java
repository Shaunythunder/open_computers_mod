/*    */ package li.cil.oc.common.inventory;
/*    */ 
/*    */ import li.cil.oc.api.driver.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Q3q!\001\002\021\002\007\005QBA\bTKJ4XM]%om\026tGo\034:z\025\t\031A!A\005j]Z,g\016^8ss*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ai\021AA\005\0033\t\021!#\023;f[N#\030mY6J]Z,g\016^8ss\")1\004\001C\0019\0051A%\0338ji\022\"\022!\b\t\003=\005j\021a\b\006\002A\005)1oY1mC&\021!e\b\002\005+:LG\017C\003%\001\021\005Q%\001\003uS\026\024X#\001\024\021\005y9\023B\001\025 \005\rIe\016\036\005\006U\001!\teK\001\021O\026$8+\033>f\023:4XM\034;pef$\022A\n\005\006[\001!\tFL\001\016S:4XM\034;peft\025-\\3\026\003=\002\"a\004\031\n\005E\002\"AB*ue&tw\rC\0034\001\021\0053&\001\fhKRLeN^3oi>\024\030p\025;bG.d\025.\\5u\021\025)\004\001\"\0217\003EI7/V:fC\ndWMQ=QY\006LXM\035\013\003oi\002\"A\b\035\n\005ez\"a\002\"p_2,\027M\034\005\006wQ\002\r\001P\001\007a2\f\0270\032:\021\005u*U\"\001 \013\005mz$B\001!B\003\031)g\016^5us*\021!iQ\001\n[&tWm\031:bMRT\021\001R\001\004]\026$\030B\001$?\0051)e\016^5usBc\027-_3s\021\025A\005\001\"\021J\003II7/\023;f[Z\013G.\0333G_J\034Fn\034;\025\007]RE\nC\003L\017\002\007a%\001\003tY>$\b\"B'H\001\004q\025!B:uC\016\\\007CA(S\033\005\001&BA)B\003\021IG/Z7\n\005M\003&!C%uK6\034F/Y2l\001")
/*    */ public interface ServerInventory extends ItemStackInventory {
/*    */   int tier();
/*    */   
/*    */   int func_70302_i_();
/*    */   
/*    */   String inventoryName();
/*    */   
/*    */   int func_70297_j_();
/*    */   
/*    */   boolean func_70300_a(EntityPlayer paramEntityPlayer);
/*    */   
/*    */   boolean func_94041_b(int paramInt, ItemStack paramItemStack);
/*    */   
/*    */   public final class ServerInventory$$anonfun$isItemValidForSlot$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/* 22 */     public final boolean apply() { return apply$mcZ$sp(); } public static final long serialVersionUID = 0L; public boolean apply$mcZ$sp() { return false; }
/*    */ 
/*    */     
/*    */     public ServerInventory$$anonfun$isItemValidForSlot$1(ServerInventory $outer) {}
/*    */   }
/*    */   
/*    */   public final class ServerInventory$$anonfun$isItemValidForSlot$2 extends AbstractFunction1<Item, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final int slot$1;
/*    */     private final ItemStack stack$1;
/*    */     
/*    */     public ServerInventory$$anonfun$isItemValidForSlot$2(ServerInventory $outer, int slot$1, ItemStack stack$1) {}
/*    */     
/*    */     public final boolean apply(Item driver) {
/*    */       // Byte code:
/*    */       //   0: getstatic li/cil/oc/common/InventorySlots$.MODULE$ : Lli/cil/oc/common/InventorySlots$;
/*    */       //   3: invokevirtual server : ()[[Lli/cil/oc/common/InventorySlots$InventorySlot;
/*    */       //   6: aload_0
/*    */       //   7: getfield $outer : Lli/cil/oc/common/inventory/ServerInventory;
/*    */       //   10: invokeinterface tier : ()I
/*    */       //   15: aaload
/*    */       //   16: aload_0
/*    */       //   17: getfield slot$1 : I
/*    */       //   20: aaload
/*    */       //   21: astore_2
/*    */       //   22: aload_1
/*    */       //   23: aload_0
/*    */       //   24: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*    */       //   27: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */       //   32: aload_2
/*    */       //   33: invokevirtual slot : ()Ljava/lang/String;
/*    */       //   36: astore_3
/*    */       //   37: dup
/*    */       //   38: ifnonnull -> 49
/*    */       //   41: pop
/*    */       //   42: aload_3
/*    */       //   43: ifnull -> 56
/*    */       //   46: goto -> 77
/*    */       //   49: aload_3
/*    */       //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   53: ifeq -> 77
/*    */       //   56: aload_1
/*    */       //   57: aload_0
/*    */       //   58: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*    */       //   61: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */       //   66: aload_2
/*    */       //   67: invokevirtual tier : ()I
/*    */       //   70: if_icmpgt -> 77
/*    */       //   73: iconst_1
/*    */       //   74: goto -> 78
/*    */       //   77: iconst_0
/*    */       //   78: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #23	-> 0
/*    */       //   #24	-> 22
/*    */       //   #22	-> 78
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	79	0	this	Lli/cil/oc/common/inventory/ServerInventory$$anonfun$isItemValidForSlot$2;
/*    */       //   0	79	1	driver	Lli/cil/oc/api/driver/Item;
/*    */       //   22	57	2	provided	Lli/cil/oc/common/InventorySlots$InventorySlot;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\ServerInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */