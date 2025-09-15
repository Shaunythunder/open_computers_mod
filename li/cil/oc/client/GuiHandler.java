/*     */ package li.cil.oc.client;
/*     */ 
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.common.component.TerminalServer;
/*     */ import li.cil.oc.common.inventory.DatabaseInventory;
/*     */ import li.cil.oc.common.inventory.DiskDriveMountableInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.ItemStackInventory;
/*     */ import li.cil.oc.common.inventory.ServerInventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import li.cil.oc.common.tileentity.Rack;
/*     */ import li.cil.oc.common.tileentity.Screen;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\001;Q!\001\002\t\002-\t!bR;j\021\006tG\r\\3s\025\t\031A!\001\004dY&,g\016\036\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!AC$vS\"\013g\016\0327feN\021Q\002\005\t\003#Qi\021A\005\006\003'\021\taaY8n[>t\027B\001\b\023\021\0251R\002\"\001\030\003\031a\024N\\5u}Q\t1\002C\003\032\033\021\005#$A\nhKR\034E.[3oi\036+\030.\0227f[\026tG\017F\004\034C\031\032$\b\020 \021\005qyR\"A\017\013\003y\tQa]2bY\006L!\001I\017\003\r\005s\027PU3g\021\025\021\003\0041\001$\003\tIG\r\005\002\035I%\021Q%\b\002\004\023:$\b\"B\024\031\001\004A\023A\0029mCf,'\017\005\002*c5\t!F\003\002(W)\021A&L\001\007K:$\030\016^=\013\0059z\023!C7j]\026\034'/\0314u\025\005\001\024a\0018fi&\021!G\013\002\r\013:$\030\016^=QY\006LXM\035\005\006ia\001\r!N\001\006o>\024H\016\032\t\003maj\021a\016\006\003i5J!!O\034\003\013]{'\017\0343\t\013mB\002\031A\022\002\003aDQ!\020\rA\002\r\n\021!\037\005\006a\001\raI\001\002u\002")
/*     */ public final class GuiHandler {
/*     */   public static Object getClientGuiElement(int paramInt1, EntityPlayer paramEntityPlayer, World paramWorld, int paramInt2, int paramInt3, int paramInt4) {
/*     */     return GuiHandler$.MODULE$.getClientGuiElement(paramInt1, paramEntityPlayer, paramWorld, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public static Object getServerGuiElement(int paramInt1, EntityPlayer paramEntityPlayer, World paramWorld, int paramInt2, int paramInt3, int paramInt4) {
/*     */     return GuiHandler$.MODULE$.getServerGuiElement(paramInt1, paramEntityPlayer, paramWorld, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public final class GuiHandler$$anonfun$getClientGuiElement$1 extends AbstractFunction0.mcZ.sp implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Screen x13$1;
/*     */     
/*  44 */     public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return this.x13$1.origin().hasKeyboard(); } public GuiHandler$$anonfun$getClientGuiElement$1(Screen x13$1) {} } public final class GuiHandler$$anonfun$getClientGuiElement$2 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } private final Screen x13$1; public boolean apply$mcZ$sp() { return this.x13$1.origin().buffer().isRenderingEnabled(); }
/*     */      public GuiHandler$$anonfun$getClientGuiElement$2(Screen x13$1) {} }
/*     */   public final class GuiHandler$$anon$1 implements ServerInventory { private final int slot$1; private final ObjectRef x9$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  47 */     public int tier() { return ServerInventory.class.tier(this); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$1(int slot$1, ObjectRef x9$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() {
/*  48 */       return ((Rack)this.x9$1.elem).func_70301_a(this.slot$1);
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  50 */       return ((Rack)this.x9$1.elem).func_70300_a(player);
/*     */     } }
/*     */   public final class GuiHandler$$anon$2 implements DiskDriveMountableInventory { private final int slot$2; private final ObjectRef x9$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*     */     
/*  54 */     public int tier() { return DiskDriveMountableInventory.class.tier(this); } public int func_70302_i_() { return DiskDriveMountableInventory.class.getSizeInventory(this); } public String inventoryName() { return DiskDriveMountableInventory.class.inventoryName(this); } public int func_70297_j_() { return DiskDriveMountableInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DiskDriveMountableInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$2(int slot$2, ObjectRef x9$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DiskDriveMountableInventory.class.$init$(this); } public ItemStack container() {
/*  55 */       return ((Rack)this.x9$1.elem).func_70301_a(this.slot$2);
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  57 */       return ((Rack)this.x9$1.elem).func_70300_a(player);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class GuiHandler$$anonfun$getClientGuiElement$7
/*     */     extends AbstractFunction0<ItemStack>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final EntityPlayer player$1;
/*     */ 
/*     */     
/*     */     public final ItemStack apply() {
/*  74 */       return this.player$1.func_70694_bm();
/*     */     } public GuiHandler$$anonfun$getClientGuiElement$7(EntityPlayer player$1) {} } public final class GuiHandler$$anon$3 implements DatabaseInventory { private final EntityPlayer player$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  76 */     public int tier() { return DatabaseInventory.class.tier(this); } public int func_70302_i_() { return DatabaseInventory.class.getSizeInventory(this); } public String inventoryName() { return DatabaseInventory.class.inventoryName(this); } public int func_70297_j_() { return DatabaseInventory.class.getInventoryStackLimit(this); } public int getInventoryStackRequired() { return DatabaseInventory.class.getInventoryStackRequired(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DatabaseInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$3(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DatabaseInventory.class.$init$(this); } public ItemStack container() {
/*  77 */       return this.player$1.func_70694_bm();
/*     */     }
/*  79 */     public boolean func_70300_a(EntityPlayer player) { EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*     */       {  }
/*     */        } } public final class GuiHandler$$anon$4 implements ServerInventory { private final EntityPlayer player$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  82 */     public int tier() { return ServerInventory.class.tier(this); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$4(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() {
/*  83 */       return this.player$1.func_70694_bm();
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  85 */       EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*     */       {  }
/*     */     
/*     */     } }
/*     */   public final class GuiHandler$$anonfun$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, TextBuffer> implements Serializable { public static final long serialVersionUID = 0L;
/*  90 */     public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1;
/*  91 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer; return (B1)(textBuffer = (TextBuffer)buffer); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer)
/*     */           return true;  }
/*  93 */        return false; } } public final class GuiHandler$$anonfun$getClientGuiElement$3 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class GuiHandler$$anonfun$getClientGuiElement$4 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; private final TextBuffer x3$1; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return this.x3$1.isRenderingEnabled(); }
/*     */ 
/*     */     
/*     */     public GuiHandler$$anonfun$getClientGuiElement$4(TextBuffer x3$1) {} }
/*     */ 
/*     */   
/*     */   public final class GuiHandler$$anon$5 implements DiskDriveMountableInventory {
/*     */     private final EntityPlayer player$1;
/*     */     private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*     */     private volatile boolean bitmap$0;
/*     */     
/*     */     public int tier() {
/* 105 */       return DiskDriveMountableInventory.class.tier(this); } public int func_70302_i_() { return DiskDriveMountableInventory.class.getSizeInventory(this); } public String inventoryName() { return DiskDriveMountableInventory.class.inventoryName(this); } public int func_70297_j_() { return DiskDriveMountableInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DiskDriveMountableInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$5(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DiskDriveMountableInventory.class.$init$(this); }
/* 106 */     public ItemStack container() { return this.player$1.func_70694_bm(); } public boolean func_70300_a(EntityPlayer activePlayer) {
/* 107 */       EntityPlayer entityPlayer = this.player$1; if (activePlayer == null) { if (entityPlayer != null); } else if (activePlayer.equals(entityPlayer))
/*     */       {  }
/*     */     
/*     */     }
/*     */   }
/*     */   
/*     */   public final class GuiHandler$$anonfun$getClientGuiElement$5
/*     */     extends AbstractFunction0.mcZ.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply() {
/* 120 */       return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class GuiHandler$$anonfun$getClientGuiElement$6 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; private final ItemStack stack$1; public final boolean apply() { return apply$mcZ$sp(); }
/*     */ 
/*     */     
/*     */     private final String key$1;
/*     */     private final TerminalServer term$1;
/*     */     private final TileEntity x2$1;
/*     */     
/*     */     public GuiHandler$$anonfun$getClientGuiElement$6(EntityPlayer player$1, ItemStack stack$1, String key$1, TerminalServer term$1, TileEntity x2$1) {}
/*     */     
/*     */     public boolean apply$mcZ$sp() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   4: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   7: new scala/collection/mutable/StringBuilder
/*     */       //   10: dup
/*     */       //   11: invokespecial <init> : ()V
/*     */       //   14: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   17: invokevirtual namespace : ()Ljava/lang/String;
/*     */       //   20: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   23: ldc 'key'
/*     */       //   25: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   28: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   31: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   34: aload_0
/*     */       //   35: getfield key$1 : Ljava/lang/String;
/*     */       //   38: astore_1
/*     */       //   39: dup
/*     */       //   40: ifnonnull -> 51
/*     */       //   43: pop
/*     */       //   44: aload_1
/*     */       //   45: ifnull -> 65
/*     */       //   48: goto -> 58
/*     */       //   51: aload_1
/*     */       //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   55: ifne -> 65
/*     */       //   58: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   61: aconst_null
/*     */       //   62: invokevirtual func_147108_a : (Lnet/minecraft/client/gui/GuiScreen;)V
/*     */       //   65: getstatic li/cil/oc/client/GuiHandler$.MODULE$ : Lli/cil/oc/client/GuiHandler$;
/*     */       //   68: aload_0
/*     */       //   69: getfield player$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   72: aload_0
/*     */       //   73: getfield term$1 : Lli/cil/oc/common/component/TerminalServer;
/*     */       //   76: aload_0
/*     */       //   77: getfield x2$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   80: invokevirtual li$cil$oc$client$GuiHandler$$inRange$1 : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/common/component/TerminalServer;Lnet/minecraft/tileentity/TileEntity;)Z
/*     */       //   83: ifne -> 93
/*     */       //   86: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   89: aconst_null
/*     */       //   90: invokevirtual func_147108_a : (Lnet/minecraft/client/gui/GuiScreen;)V
/*     */       //   93: iconst_1
/*     */       //   94: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #122	-> 0
/*     */       //   #123	-> 58
/*     */       //   #126	-> 65
/*     */       //   #127	-> 86
/*     */       //   #129	-> 93
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	95	0	this	Lli/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$6;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\GuiHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */