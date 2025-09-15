/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import li.cil.oc.util.InventoryUtils$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ 
/*    */ public abstract class Inventory$class {
/*    */   public static Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory(Inventory $this) {
/* 12 */     return (Option[])Array$.MODULE$.fill($this.func_70302_i_(), (Function0)new Inventory$$anonfun$li$cil$oc$common$tileentity$traits$Inventory$$inventory$1($this), ClassTag$.MODULE$.apply(Option.class));
/*    */   } public static void $init$(Inventory $this) {} public static Option[] items(Inventory $this) {
/* 14 */     return (Option[])$this.li$cil$oc$common$tileentity$traits$Inventory$$inventory();
/*    */   }
/*    */ 
/*    */   
/*    */   public static void readFromNBTForServer(Inventory $this, NBTTagCompound nbt) {
/* 19 */     $this.li$cil$oc$common$tileentity$traits$Inventory$$super$readFromNBTForServer(nbt);
/* 20 */     $this.load(nbt);
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(Inventory $this, NBTTagCompound nbt) {
/* 24 */     $this.li$cil$oc$common$tileentity$traits$Inventory$$super$writeToNBTForServer(nbt);
/* 25 */     $this.save(nbt);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isUseableByPlayer(Inventory $this, EntityPlayer player) {
/* 31 */     return (player.func_70092_e($this.x() + 0.5D, $this.y() + 0.5D, $this.z() + 0.5D) <= 64);
/*    */   }
/*    */   
/*    */   public static int dropSlot$default$2(Inventory $this) {
/* 35 */     return $this.func_70297_j_(); } public static Option dropSlot$default$3(Inventory $this) { return (Option)None$.MODULE$; } public static boolean dropSlot(Inventory $this, int slot, int count, Option direction) {
/* 36 */     return InventoryUtils$.MODULE$.dropSlot(BlockPosition$.MODULE$.apply($this.x(), $this.y(), $this.z(), $this.world()), (IInventory)$this, slot, count, direction);
/*    */   }
/*    */   public static void dropAllSlots(Inventory $this) {
/* 39 */     InventoryUtils$.MODULE$.dropAllSlots(BlockPosition$.MODULE$.apply($this.x(), $this.y(), $this.z(), $this.world()), (IInventory)$this);
/*    */   }
/* 41 */   public static Option spawnStackInWorld$default$2(Inventory $this) { return (Option)None$.MODULE$; } public static EntityItem spawnStackInWorld(Inventory $this, ItemStack stack, Option direction) {
/* 42 */     return InventoryUtils$.MODULE$.spawnStackInWorld(BlockPosition$.MODULE$.apply($this.x(), $this.y(), $this.z(), $this.world()), stack, direction, InventoryUtils$.MODULE$.spawnStackInWorld$default$4());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Inventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */