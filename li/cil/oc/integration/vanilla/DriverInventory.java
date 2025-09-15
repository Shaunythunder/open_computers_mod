/*     */ package li.cil.oc.integration.vanilla;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import li.cil.oc.Settings;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*     */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraftforge.common.util.FakePlayerFactory;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*     */ 
/*     */ public final class DriverInventory
/*     */   extends DriverSidedTileEntity {
/*     */   public Class<?> getTileEntityClass() {
/*  26 */     return IInventory.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  32 */     return (ManagedEnvironment)new Environment(world.func_147438_o(x, y, z), world);
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<IInventory> {
/*     */     private final EntityPlayer fakePlayer;
/*     */     private final BlockPosition position;
/*     */     
/*     */     public Environment(TileEntity tileEntity, World world) {
/*  40 */       super(tileEntity, "inventory");
/*  41 */       this
/*  42 */         .fakePlayer = (EntityPlayer)FakePlayerFactory.get((WorldServer)world, Settings.get().fakePlayerProfile());
/*  43 */       this.position = BlockPosition.apply(tileEntity.field_145851_c, tileEntity.field_145848_d, tileEntity.field_145849_e, world);
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():string -- Get the name of this inventory.")
/*     */     public Object[] getInventoryName(Context context, Arguments args) {
/*  48 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/*  49 */       return new Object[] { ((IInventory)this.tileEntity).func_145825_b() };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the number of slots in this inventory.")
/*     */     public Object[] getInventorySize(Context context, Arguments args) {
/*  54 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/*  55 */       return new Object[] { Integer.valueOf(((IInventory)this.tileEntity).func_70302_i_()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(slot:number):number -- Get the stack size of the item stack in the specified slot.")
/*     */     public Object[] getSlotStackSize(Context context, Arguments args) {
/*  60 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/*  61 */       int slot = checkSlot(args, 0);
/*  62 */       ItemStack stack = ((IInventory)this.tileEntity).func_70301_a(slot);
/*  63 */       if (stack != null) {
/*  64 */         return new Object[] { Integer.valueOf(stack.field_77994_a) };
/*     */       }
/*  66 */       return new Object[] { Integer.valueOf(0) };
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(slot:number):number -- Get the maximum stack size of the item stack in the specified slot.")
/*     */     public Object[] getSlotMaxStackSize(Context context, Arguments args) {
/*  74 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/*  75 */       int slot = checkSlot(args, 0);
/*  76 */       ItemStack stack = ((IInventory)this.tileEntity).func_70301_a(slot);
/*  77 */       if (stack != null) {
/*  78 */         return new Object[] { Integer.valueOf(Math.min(((IInventory)this.tileEntity).func_70297_j_(), stack.func_77976_d())) };
/*     */       }
/*  80 */       return new Object[] { Integer.valueOf(((IInventory)this.tileEntity).func_70297_j_()) };
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(slotA:number, slotB:number):boolean -- Compare the two item stacks in the specified slots for equality.")
/*     */     public Object[] compareStacks(Context context, Arguments args) {
/*  88 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/*  89 */       int slotA = checkSlot(args, 0);
/*  90 */       int slotB = checkSlot(args, 1);
/*  91 */       if (slotA == slotB) {
/*  92 */         return new Object[] { Boolean.valueOf(true) };
/*     */       }
/*  94 */       ItemStack stackA = ((IInventory)this.tileEntity).func_70301_a(slotA);
/*  95 */       ItemStack stackB = ((IInventory)this.tileEntity).func_70301_a(slotB);
/*  96 */       if (stackA == null && stackB == null)
/*  97 */         return new Object[] { Boolean.valueOf(true) }; 
/*  98 */       if (stackA != null && stackB != null) {
/*  99 */         return new Object[] { Boolean.valueOf(itemEquals(stackA, stackB)) };
/*     */       }
/* 101 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(slotA:number, slotB:number[, count:number=math.huge]):boolean -- Move up to the specified number of items from the first specified slot to the second.")
/*     */     public Object[] transferStack(Context context, Arguments args) {
/* 109 */       if (notPermitted()) return new Object[] { null, "permission denied" }; 
/* 110 */       int slotA = checkSlot(args, 0);
/* 111 */       int slotB = checkSlot(args, 1);
/* 112 */       int count = Math.max(0, 
/*     */           
/* 114 */           Math.min((args
/* 115 */             .count() > 2 && args.checkAny(2) != null) ? args.checkInteger(2) : 64, ((IInventory)this.tileEntity)
/* 116 */             .func_70297_j_()));
/* 117 */       if (slotA == slotB || count == 0) {
/* 118 */         return new Object[] { Boolean.valueOf(true) };
/*     */       }
/* 120 */       ItemStack stackA = ((IInventory)this.tileEntity).func_70301_a(slotA);
/* 121 */       ItemStack stackB = ((IInventory)this.tileEntity).func_70301_a(slotB);
/* 122 */       if (stackA == null)
/*     */       {
/* 124 */         return new Object[] { Boolean.valueOf(false) }; } 
/* 125 */       if (stackB == null) {
/*     */         
/* 127 */         ((IInventory)this.tileEntity).func_70299_a(slotB, ((IInventory)this.tileEntity).func_70298_a(slotA, count));
/* 128 */         return new Object[] { Boolean.valueOf(true) };
/* 129 */       }  if (itemEquals(stackA, stackB)) {
/*     */ 
/*     */         
/* 132 */         int space = Math.min(((IInventory)this.tileEntity).func_70297_j_(), stackB.func_77976_d()) - stackB.field_77994_a;
/* 133 */         int amount = Math.min(count, Math.min(space, stackA.field_77994_a));
/* 134 */         if (amount > 0) {
/*     */           
/* 136 */           stackA.field_77994_a -= amount;
/* 137 */           stackB.field_77994_a += amount;
/* 138 */           if (stackA.field_77994_a == 0) {
/* 139 */             ((IInventory)this.tileEntity).func_70299_a(slotA, null);
/*     */           }
/* 141 */           ((IInventory)this.tileEntity).func_70296_d();
/* 142 */           return new Object[] { Boolean.valueOf(true) };
/*     */         } 
/* 144 */       } else if (count >= stackA.field_77994_a) {
/*     */         
/* 146 */         ((IInventory)this.tileEntity).func_70299_a(slotB, stackA);
/* 147 */         ((IInventory)this.tileEntity).func_70299_a(slotA, stackB);
/* 148 */         return new Object[] { Boolean.valueOf(true) };
/*     */       } 
/*     */       
/* 151 */       return new Object[] { Boolean.valueOf(false) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(slot:number):table -- Get a description of the item stack in the specified slot.")
/*     */     public Object[] getStackInSlot(Context context, Arguments args) {
/* 156 */       if (Settings.get().allowItemStackInspection()) {
/* 157 */         if (notPermitted()) return new Object[] { null, "permission denied" }; 
/* 158 */         return new Object[] { ((IInventory)this.tileEntity).func_70301_a(checkSlot(args, 0)) };
/*     */       } 
/* 160 */       return new Object[] { null, "not enabled in config" };
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():table -- Get a list of descriptions for all item stacks in this inventory.")
/*     */     public Object[] getAllStacks(Context context, Arguments args) {
/* 166 */       if (Settings.get().allowItemStackInspection()) {
/* 167 */         if (notPermitted()) return new Object[] { null, "permission denied" }; 
/* 168 */         ItemStack[] allStacks = new ItemStack[((IInventory)this.tileEntity).func_70302_i_()];
/* 169 */         for (int i = 0; i < ((IInventory)this.tileEntity).func_70302_i_(); i++) {
/* 170 */           allStacks[i] = ((IInventory)this.tileEntity).func_70301_a(i);
/*     */         }
/* 172 */         return new Object[] { allStacks };
/*     */       } 
/* 174 */       return new Object[] { null, "not enabled in config" };
/*     */     }
/*     */ 
/*     */     
/*     */     private int checkSlot(Arguments args, int number) {
/* 179 */       int slot = args.checkInteger(number) - 1;
/* 180 */       if (slot < 0 || slot >= ((IInventory)this.tileEntity).func_70302_i_()) {
/* 181 */         throw new IllegalArgumentException("slot index out of bounds");
/*     */       }
/* 183 */       return slot;
/*     */     }
/*     */     
/*     */     private boolean itemEquals(ItemStack stackA, ItemStack stackB) {
/* 187 */       return ((stackA.func_77973_b().equals(stackB.func_77973_b()) && !stackA.func_77981_g()) || stackA
/* 188 */         .func_77960_j() == stackB.func_77960_j());
/*     */     }
/*     */     
/*     */     private boolean notPermitted() {
/* 192 */       synchronized (this.fakePlayer) {
/* 193 */         this.fakePlayer.func_70107_b((this.position.toVec3()).field_72450_a, (this.position.toVec3()).field_72448_b, (this.position.toVec3()).field_72449_c);
/* 194 */         PlayerInteractEvent event = ForgeEventFactory.onPlayerInteract(this.fakePlayer, PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, this.position
/*     */ 
/*     */             
/* 197 */             .x(), this.position
/* 198 */             .y(), this.position
/* 199 */             .z(), 0, this.fakePlayer
/*     */             
/* 201 */             .func_130014_f_());
/* 202 */         return (!event.isCanceled() && event.useBlock != Event.Result.DENY && 
/*     */           
/* 204 */           !((IInventory)this.tileEntity).func_70300_a(this.fakePlayer));
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */