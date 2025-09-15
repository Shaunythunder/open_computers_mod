/*    */ package li.cil.oc.common.template;
/*    */ 
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.common.inventory.Inventory;
/*    */ import li.cil.oc.common.inventory.ItemStackInventory;
/*    */ import li.cil.oc.common.inventory.ServerInventory;
/*    */ import li.cil.oc.common.inventory.SimpleInventory;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.collection.TraversableLike;
/*    */ import scala.collection.TraversableOnce;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ public final class ServerTemplate$ { public static final ServerTemplate$ MODULE$; public boolean selectDisassembler(ItemStack stack) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   4: ldc 'server1'
/*    */     //   6: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   9: astore_2
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 22
/*    */     //   14: pop
/*    */     //   15: aload_2
/*    */     //   16: ifnull -> 90
/*    */     //   19: goto -> 29
/*    */     //   22: aload_2
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifne -> 90
/*    */     //   29: aload_1
/*    */     //   30: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   33: ldc 'server2'
/*    */     //   35: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   38: astore_3
/*    */     //   39: dup
/*    */     //   40: ifnonnull -> 51
/*    */     //   43: pop
/*    */     //   44: aload_3
/*    */     //   45: ifnull -> 90
/*    */     //   48: goto -> 58
/*    */     //   51: aload_3
/*    */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   55: ifne -> 90
/*    */     //   58: aload_1
/*    */     //   59: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   62: ldc 'server3'
/*    */     //   64: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   67: astore #4
/*    */     //   69: dup
/*    */     //   70: ifnonnull -> 82
/*    */     //   73: pop
/*    */     //   74: aload #4
/*    */     //   76: ifnull -> 90
/*    */     //   79: goto -> 94
/*    */     //   82: aload #4
/*    */     //   84: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   87: ifeq -> 94
/*    */     //   90: iconst_1
/*    */     //   91: goto -> 95
/*    */     //   94: iconst_0
/*    */     //   95: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 0
/*    */     //   #14	-> 29
/*    */     //   #15	-> 58
/*    */     //   #14	-> 90
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	96	0	this	Lli/cil/oc/common/template/ServerTemplate$;
/* 18 */     //   0	96	1	stack	Lnet/minecraft/item/ItemStack; } public final class ServerTemplate$$anon$1 implements ServerInventory { private final ItemStack stack$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0; public int tier() { return ServerInventory.class.tier(this); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_70300_a(EntityPlayer player) { return ServerInventory.class.isUseableByPlayer(this, player); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public ServerTemplate$$anon$1(ItemStack stack$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() { return this.stack$1; } } public ItemStack[][] disassemble(ItemStack stack, ItemStack[] ingredients) { ServerInventory info = new ServerTemplate$$anon$1(stack);
/*    */ 
/*    */     
/* 21 */     (new ItemStack[2][])[0] = ingredients; (new ItemStack[2][])[1] = (ItemStack[])((TraversableOnce)((TraversableLike)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), info.func_70302_i_()).map((Function1)new ServerTemplate$$anonfun$disassemble$1(info), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).filter((Function1)new ServerTemplate$$anonfun$disassemble$2())).toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); return new ItemStack[2][]; } public final class ServerTemplate$$anonfun$disassemble$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final ServerInventory info$1; public final ItemStack apply(int slot) { return this.info$1.func_70301_a(slot); } public ServerTemplate$$anonfun$disassemble$1(ServerInventory info$1) {} } public final class ServerTemplate$$anonfun$disassemble$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Object x$1) { return !(x$1 == null); }
/*    */      }
/*    */ 
/*    */   
/*    */   public void register() {
/* 26 */     IMC.registerDisassemblerTemplate("Server", 
/* 27 */         "li.cil.oc.common.template.ServerTemplate.selectDisassembler", 
/* 28 */         "li.cil.oc.common.template.ServerTemplate.disassemble");
/*    */   } private ServerTemplate$() {
/* 30 */     MODULE$ = this;
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\ServerTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */