/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.util.ExtendedInventory$;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.ArrayBuffer$;
/*     */ 
/*     */ public abstract class ComponentInventory$class {
/*     */   public static ComponentInventory host(ComponentInventory $this) {
/*  17 */     return $this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(ComponentInventory $this) {
/*  24 */     return (ArrayBuffer)ArrayBuffer$.MODULE$.fill($this.func_70302_i_(), (Function0)new ComponentInventory$$anonfun$li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$1($this));
/*  25 */   } public static ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(ComponentInventory $this) { return (ArrayBuffer)ArrayBuffer$.MODULE$.fill($this.func_70302_i_(), (Function0)new ComponentInventory$$anonfun$li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$1($this)); } public static void $init$(ComponentInventory $this) {
/*  26 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(false);
/*     */   } public static ArrayBuffer pendingRemovals(ComponentInventory $this) {
/*  28 */     adjustSize($this, $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual());
/*  29 */     return $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual();
/*     */   }
/*     */   public static ArrayBuffer pendingAdds(ComponentInventory $this) {
/*  32 */     adjustSize($this, $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual());
/*  33 */     return $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual();
/*     */   }
/*     */   
/*     */   private static void adjustSize(ComponentInventory $this, ArrayBuffer buffer) {
/*  37 */     int delta = buffer.length() - $this.func_70302_i_();
/*  38 */     if (delta > 0) {
/*  39 */       buffer.remove(buffer.length() - delta, delta);
/*     */     }
/*  41 */     else if (delta < 0) {
/*  42 */       buffer.sizeHint($this.func_70302_i_()); RichInt$.MODULE$
/*  43 */         .until$extension0(Predef$.MODULE$.intWrapper(0), -delta).foreach((Function1)new ComponentInventory$$anonfun$adjustSize$1($this, buffer));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void li$cil$oc$common$tileentity$traits$ComponentInventory$$applyInventoryChanges(ComponentInventory $this) {
/*  50 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(false);
/*  51 */     ExtendedInventory$.MODULE$.extendedInventory((IInventory)$this).indices().foreach$mVc$sp((Function1)new ComponentInventory$$anonfun$li$cil$oc$common$tileentity$traits$ComponentInventory$$applyInventoryChanges$1($this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void scheduleInventoryChange(ComponentInventory $this) {
/*  71 */     if (!$this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled()) {
/*  72 */       $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(true);
/*  73 */       EventHandler$.MODULE$.scheduleClient((Function0)new ComponentInventory$$anonfun$scheduleInventoryChange$1($this));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void onItemAdded(ComponentInventory $this, int slot, ItemStack stack) {
/*  78 */     if ($this.isServer()) { $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$onItemAdded(slot, stack); }
/*     */     else
/*  80 */     { $this.pendingAdds().update(slot, Option$.MODULE$.apply(stack));
/*  81 */       scheduleInventoryChange($this); }
/*     */   
/*     */   }
/*     */   
/*     */   public static void onItemRemoved(ComponentInventory $this, int slot, ItemStack stack) {
/*  86 */     if ($this.isServer()) { $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$onItemRemoved(slot, stack); }
/*  87 */     else if (((Option)$this.pendingRemovals().apply(slot)).isEmpty())
/*  88 */     { $this.pendingRemovals().update(slot, Option$.MODULE$.apply(stack));
/*  89 */       scheduleInventoryChange($this); }
/*     */   
/*     */   }
/*     */   
/*     */   public static void save(ComponentInventory $this, ManagedEnvironment component, Item driver, ItemStack stack) {
/*  94 */     if ($this.isServer()) {
/*  95 */       $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$save(component, driver, stack);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void initialize(ComponentInventory $this) {
/* 102 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$initialize();
/* 103 */     if ($this.isClient()) {
/* 104 */       $this.connectComponents();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void dispose(ComponentInventory $this) {
/* 109 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$dispose();
/* 110 */     if ($this.isClient()) {
/* 111 */       $this.disconnectComponents();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void onConnect(ComponentInventory $this, Node node) {
/* 116 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$onConnect(node);
/* 117 */     Node node1 = $this.node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 118 */       { $this.connectComponents(); return; }  return; }  $this.connectComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onDisconnect(ComponentInventory $this, Node node) {
/* 123 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$onDisconnect(node);
/* 124 */     Node node1 = $this.node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 125 */       { $this.disconnectComponents(); return; }  return; }  $this.disconnectComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void writeToNBTForClient(ComponentInventory $this, NBTTagCompound nbt) {
/* 130 */     $this.connectComponents();
/* 131 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$writeToNBTForClient(nbt);
/* 132 */     $this.save(nbt);
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void readFromNBTForClient(ComponentInventory $this, NBTTagCompound nbt) {
/* 137 */     $this.li$cil$oc$common$tileentity$traits$ComponentInventory$$super$readFromNBTForClient(nbt);
/* 138 */     $this.load(nbt);
/* 139 */     $this.connectComponents();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\ComponentInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */