/*    */ package li.cil.oc.common.inventory;
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ public abstract class Inventory$class {
/*    */   public static void updateItems(Inventory $this, int slot, ItemStack stack) {
/* 12 */     $this.items()[slot] = Option$.MODULE$.apply(stack);
/*    */   }
/*    */   public static void $init$(Inventory $this) {}
/*    */   
/*    */   public static ItemStack getStackInSlot(Inventory $this, int slot) {
/* 17 */     return (slot >= 0 && slot < $this.func_70302_i_()) ? (ItemStack)$this.items()[slot].orNull(Predef$.MODULE$.$conforms()) : 
/* 18 */       null;
/*    */   }
/*    */   public static void setInventorySlotContents(Inventory $this, int slot, ItemStack stack) {
/* 21 */     if (slot >= 0 && slot < $this.func_70302_i_()) {
/* 22 */       if (stack == null && $this.items()[slot].isEmpty()) {
/*    */         return;
/*    */       }
/* 25 */       if ($this.items()[slot].contains(stack)) {
/*    */         return;
/*    */       }
/*    */       
/* 29 */       Option<ItemStack> oldStack = $this.items()[slot];
/* 30 */       $this.updateItems(slot, (ItemStack)null);
/* 31 */       if (oldStack.isDefined()) {
/* 32 */         $this.onItemRemoved(slot, (ItemStack)oldStack.get());
/*    */       }
/* 34 */       if (stack != null && stack.field_77994_a >= $this.getInventoryStackRequired()) {
/* 35 */         if (stack.field_77994_a > $this.func_70297_j_()) {
/* 36 */           stack.field_77994_a = $this.func_70297_j_();
/*    */         }
/* 38 */         $this.updateItems(slot, stack);
/*    */       } 
/*    */       
/* 41 */       if ($this.items()[slot].isDefined()) {
/* 42 */         $this.onItemAdded(slot, (ItemStack)$this.items()[slot].get());
/*    */       }
/*    */       
/* 45 */       $this.func_70296_d();
/*    */     } 
/*    */   }
/*    */   public static String getInventoryName(Inventory $this) {
/* 49 */     return (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("container.").append($this.inventoryName()).toString();
/*    */   } public static String inventoryName(Inventory $this) {
/* 51 */     return $this.getClass().getSimpleName();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void load(Inventory $this, NBTTagCompound nbt) {
/* 58 */     IntRef count = IntRef.create(0);
/* 59 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("items").toString(), 10)).foreach((Function1)new Inventory$$anonfun$load$1($this, count));
/*    */   }
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
/*    */   public static void save(Inventory $this, NBTTagCompound nbt) {
/* 77 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("items").toString(), 
/*    */ 
/*    */         
/* 80 */         (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])$this.items()).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).collect((PartialFunction)new Inventory$$anonfun$save$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).map((Function1)new Inventory$$anonfun$save$2($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class)))));
/*    */   }
/*    */   
/*    */   public static void onItemAdded(Inventory $this, int slot, ItemStack stack) {}
/*    */   
/*    */   public static void onItemRemoved(Inventory $this, int slot, ItemStack stack) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\Inventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */