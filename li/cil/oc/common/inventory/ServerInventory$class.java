/*    */ package li.cil.oc.common.inventory;
/*    */ import li.cil.oc.common.InventorySlots$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Option$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class ServerInventory$class {
/*    */   public static int tier(ServerInventory $this) {
/* 11 */     return RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(ItemUtils$.MODULE$.caseTier($this.container())), 0);
/*    */   } public static void $init$(ServerInventory $this) {} public static int getSizeInventory(ServerInventory $this) {
/* 13 */     return (InventorySlots$.MODULE$.server()[$this.tier()]).length;
/*    */   } public static String inventoryName(ServerInventory $this) {
/* 15 */     return "Server";
/*    */   } public static int getInventoryStackLimit(ServerInventory $this) {
/* 17 */     return 1;
/*    */   } public static boolean isUseableByPlayer(ServerInventory $this, EntityPlayer player) {
/* 19 */     return false;
/*    */   }
/*    */   public static boolean isItemValidForSlot(ServerInventory $this, int slot, ItemStack stack) {
/* 22 */     return BoxesRunTime.unboxToBoolean(Option$.MODULE$.apply(Driver.driverFor(stack, Server.class)).fold((Function0)new ServerInventory$$anonfun$isItemValidForSlot$1($this), (Function1)new ServerInventory$$anonfun$isItemValidForSlot$2($this, slot, stack)));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\ServerInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */