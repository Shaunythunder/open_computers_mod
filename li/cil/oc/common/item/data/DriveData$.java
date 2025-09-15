/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
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
/*    */ public final class DriveData$
/*    */ {
/*    */   public static final DriveData$ MODULE$;
/*    */   
/*    */   public void lock(ItemStack stack, EntityPlayer player) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: invokevirtual getDisplayName : ()Ljava/lang/String;
/*    */     //   4: astore_3
/*    */     //   5: new li/cil/oc/common/item/data/DriveData
/*    */     //   8: dup
/*    */     //   9: aload_1
/*    */     //   10: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   13: astore #4
/*    */     //   15: aload #4
/*    */     //   17: invokevirtual isLocked : ()Z
/*    */     //   20: ifne -> 85
/*    */     //   23: aload #4
/*    */     //   25: aload_3
/*    */     //   26: astore #5
/*    */     //   28: aload #5
/*    */     //   30: ifnull -> 70
/*    */     //   33: aload #5
/*    */     //   35: astore #6
/*    */     //   37: aload #6
/*    */     //   39: ifnull -> 70
/*    */     //   42: new scala/collection/immutable/StringOps
/*    */     //   45: dup
/*    */     //   46: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   49: aload #6
/*    */     //   51: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   57: invokevirtual nonEmpty : ()Z
/*    */     //   60: ifeq -> 70
/*    */     //   63: aload #6
/*    */     //   65: astore #7
/*    */     //   67: goto -> 74
/*    */     //   70: ldc 'notch'
/*    */     //   72: astore #7
/*    */     //   74: aload #7
/*    */     //   76: invokevirtual lockInfo_$eq : (Ljava/lang/String;)V
/*    */     //   79: aload #4
/*    */     //   81: aload_1
/*    */     //   82: invokevirtual save : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   85: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 0
/*    */     //   #41	-> 5
/*    */     //   #42	-> 15
/*    */     //   #43	-> 23
/*    */     //   #44	-> 28
/*    */     //   #45	-> 70
/*    */     //   #43	-> 74
/*    */     //   #47	-> 79
/*    */     //   #39	-> 85
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	86	0	this	Lli/cil/oc/common/item/data/DriveData$;
/*    */     //   0	86	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   0	86	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   5	81	3	key	Ljava/lang/String;
/*    */     //   15	71	4	data	Lli/cil/oc/common/item/data/DriveData;
/*    */   }
/*    */   
/*    */   public void setUnmanaged(ItemStack stack, boolean unmanaged) {
/* 52 */     DriveData data = new DriveData(stack);
/* 53 */     if (data.isUnmanaged() != unmanaged) {
/* 54 */       li.cil.oc.server.fs.FileSystem$.MODULE$.removeAddress(stack);
/* 55 */       data.lockInfo_$eq("");
/*    */     } 
/* 57 */     data.isUnmanaged_$eq(unmanaged);
/* 58 */     data.save(stack);
/*    */   } private DriveData$() {
/* 60 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\DriveData$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */