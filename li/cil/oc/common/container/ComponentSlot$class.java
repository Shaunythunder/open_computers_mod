/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.common.tileentity.traits.PlayerInputAware;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ComponentSlot$class
/*    */ {
/*    */   public static void $init$(ComponentSlot $this) {
/* 22 */     $this.changeListener_$eq((Option<Function1<Slot, BoxedUnit>>)None$.MODULE$);
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static boolean func_111238_b(ComponentSlot $this) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface slot : ()Ljava/lang/String;
/*    */     //   6: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   9: invokevirtual None : ()Ljava/lang/String;
/*    */     //   12: astore_1
/*    */     //   13: dup
/*    */     //   14: ifnonnull -> 25
/*    */     //   17: pop
/*    */     //   18: aload_1
/*    */     //   19: ifnull -> 55
/*    */     //   22: goto -> 32
/*    */     //   25: aload_1
/*    */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   29: ifne -> 55
/*    */     //   32: aload_0
/*    */     //   33: invokeinterface tier : ()I
/*    */     //   38: iconst_m1
/*    */     //   39: if_icmpeq -> 55
/*    */     //   42: aload_0
/*    */     //   43: invokeinterface li$cil$oc$common$container$ComponentSlot$$super$func_111238_b : ()Z
/*    */     //   48: ifeq -> 55
/*    */     //   51: iconst_1
/*    */     //   52: goto -> 56
/*    */     //   55: iconst_0
/*    */     //   56: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	57	0	$this	Lli/cil/oc/common/container/ComponentSlot;
/*    */   }
/*    */   public static boolean isItemValid(ComponentSlot $this, ItemStack stack) {
/* 29 */     return ((Slot)$this).field_75224_c.func_94041_b(((Slot)$this).getSlotIndex(), stack);
/*    */   }
/*    */   public static void onPickupFromSlot(ComponentSlot $this, EntityPlayer player, ItemStack stack) {
/* 32 */     $this.li$cil$oc$common$container$ComponentSlot$$super$onPickupFromSlot(player, stack);
/* 33 */     WrapAsScala$.MODULE$.asScalaBuffer(($this.container()).field_75151_b).foreach((Function1)new ComponentSlot$$anonfun$onPickupFromSlot$1($this, player));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void putStack(ComponentSlot $this, ItemStack stack) {
/* 40 */     $this.li$cil$oc$common$container$ComponentSlot$$super$putStack(stack);
/* 41 */     IInventory iInventory = ((Slot)$this).field_75224_c;
/* 42 */     if (iInventory instanceof PlayerInputAware) { PlayerInputAware playerInputAware = (PlayerInputAware)iInventory;
/* 43 */       playerInputAware.onSetInventorySlotContents(($this.container().playerInventory()).field_70458_d, ((Slot)$this).getSlotIndex(), stack); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 44 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public static void onSlotChanged(ComponentSlot $this) {
/* 49 */     $this.li$cil$oc$common$container$ComponentSlot$$super$onSlotChanged();
/* 50 */     WrapAsScala$.MODULE$.asScalaBuffer(($this.container()).field_75151_b).foreach((Function1)new ComponentSlot$$anonfun$onSlotChanged$1($this));
/*    */ 
/*    */ 
/*    */     
/* 54 */     $this.changeListener().foreach((Function1)new ComponentSlot$$anonfun$onSlotChanged$2($this));
/*    */   }
/*    */   
/*    */   public static void clearIfInvalid(ComponentSlot $this, EntityPlayer player) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\ComponentSlot$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */