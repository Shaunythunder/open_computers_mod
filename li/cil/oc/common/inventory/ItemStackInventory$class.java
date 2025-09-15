/*    */ package li.cil.oc.common.inventory;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.reflect.ClassTag$;
/*    */ 
/*    */ public abstract class ItemStackInventory$class {
/*    */   public static Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory(ItemStackInventory $this) {
/* 10 */     return (Option[])Array$.MODULE$.fill($this.func_70302_i_(), (Function0)new ItemStackInventory$$anonfun$li$cil$oc$common$inventory$ItemStackInventory$$inventory$1($this), ClassTag$.MODULE$.apply(Option.class));
/*    */   } public static Option[] items(ItemStackInventory $this) {
/* 12 */     return (Option[])$this.li$cil$oc$common$inventory$ItemStackInventory$$inventory();
/*    */   }
/*    */   public static void $init$(ItemStackInventory $this) {
/* 15 */     if ($this.container() != null) {
/* 16 */       $this.reinitialize();
/*    */     }
/*    */   }
/*    */   
/*    */   public static void reinitialize(ItemStackInventory $this) {
/* 21 */     Predef$.MODULE$.refArrayOps((Object[])$this.items()).indices().foreach$mVc$sp((Function1)new ItemStackInventory$$anonfun$reinitialize$1($this));
/*    */ 
/*    */     
/* 24 */     if (!$this.container().func_77942_o()) {
/* 25 */       $this.container().func_77982_d(new NBTTagCompound());
/*    */     }
/* 27 */     $this.load($this.container().func_77978_p());
/*    */   }
/*    */ 
/*    */   
/*    */   public static void markDirty(ItemStackInventory $this) {
/* 32 */     if (!$this.container().func_77942_o()) {
/* 33 */       $this.container().func_77982_d(new NBTTagCompound());
/*    */     }
/* 35 */     $this.save($this.container().func_77978_p());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\ItemStackInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */