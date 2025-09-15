/*     */ package li.cil.oc.server.component.traits;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.server.component.package$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.InventorySource;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ 
/*     */ public abstract class WorldInventoryAnalytics$class {
/*     */   public static void $init$(WorldInventoryAnalytics $this) {}
/*     */   
/*     */   @Callback(doc = "function(side:number):number -- Get the number of slots in the inventory on the specified side of the device.")
/*     */   public static Object[] getInventorySize(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  22 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  23 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getInventorySize$1($this));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number, slot:number):number -- Get number of items in the specified slot of the inventory on the specified side of the device.")
/*     */   public static Object[] getSlotStackSize(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  28 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  29 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getSlotStackSize$1($this, args));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number, slot:number):number -- Get the maximum number of items in the specified slot of the inventory on the specified side of the device.")
/*     */   public static Object[] getSlotMaxStackSize(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  34 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  35 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getSlotMaxStackSize$1($this, args));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number, slotA:number, slotB:number[, checkNBT:boolean=false]):boolean -- Get whether the items in the two specified slots of the inventory on the specified side of the device are of the same type.")
/*     */   public static Object[] compareStacks(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  40 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  41 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$compareStacks$1($this, args));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(side:number, slot:number, dbAddress:string, dbSlot:number[, checkNBT:boolean=false]):boolean -- Compare an item in the specified slot in the inventory on the specified side with one in the database with the specified address.")
/*     */   public static Object[] compareStackToDatabase(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  50 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  51 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$compareStackToDatabase$1($this, args));
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
/*     */   @Callback(doc = "function(side:number, slotA:number, slotB:number):boolean -- Get whether the items in the two specified slots of the inventory on the specified side of the device are equivalent (have shared OreDictionary IDs).")
/*     */   public static Object[] areStacksEquivalent(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  65 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  66 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$areStacksEquivalent$1($this, args));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(side:number, slot:number, label:string):boolean -- Change the display name of the stack in the inventory on the specified side of the device.")
/*     */   public static Object[] setStackDisplayName(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  77 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  78 */     String label = args.checkString(2).trim();
/*  79 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$setStackDisplayName$1($this, label, args));
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
/*     */   @Callback(doc = "function(side:number, slot:number):table -- Get a description of the stack in the inventory on the specified side of the device.")
/*     */   public static Object[] getStackInSlot(WorldInventoryAnalytics $this, Context context, Arguments args) {
/*  95 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  96 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getStackInSlot$1($this, args)) : 
/*     */       
/*  98 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number):userdata -- Get a description of all stacks in the inventory on the specified side of the device.")
/* 102 */   public static Object[] getAllStacks(WorldInventoryAnalytics $this, Context context, Arguments args) { ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 103 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getAllStacks$1($this)) : 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 111 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" })); }
/*     */   public static final Option blockAt$1(WorldInventoryAnalytics $this, BlockPosition position) { Option option = position.world(); if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x(); if (ExtendedWorld$.MODULE$.extendedWorld(world).blockExists(position)) { None$ none$; Block block = ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(position); if (block != null) { Block block1 = block; Some some1 = new Some(block1); } else { none$ = None$.MODULE$; }
/*     */          return (Option)none$; }
/*     */        }
/* 115 */      return (Option)None$.MODULE$; } @Callback(doc = "function(side:number):string -- Get the the name of the inventory on the specified side of the device.") public static Object[] getInventoryName(WorldInventoryAnalytics $this, Context context, Arguments args) { ForgeDirection facing = $this.checkSideForAction(args, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventorySource($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$getInventoryName$1($this)) : 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" })); }
/*     */   
/*     */   @Callback(doc = "function(side:number, slot:number, dbAddress:string, dbSlot:number):boolean -- Store an item stack description in the specified slot of the database with the specified address.")
/*     */   public static Object[] store(WorldInventoryAnalytics $this, Context context, Arguments args) {
/* 136 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 137 */     String dbAddress = args.checkString(2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     return withInventory($this, facing, (Function1)new WorldInventoryAnalytics$$anonfun$store$1($this, dbAddress, args));
/*     */   } public static final Object[] store$1(WorldInventoryAnalytics $this, ItemStack stack, String dbAddress$1, Arguments args$8) {
/*     */     return DatabaseAccess$.MODULE$.withDatabase($this.node(), dbAddress$1, (Function1)new Object($this, stack, args$8));
/*     */   } private static boolean mayInteract(WorldInventoryAnalytics $this, ForgeDirection side, InventorySource f) {
/*     */     boolean bool;
/* 149 */     InventorySource inventorySource = f;
/* 150 */     if (inventorySource instanceof BlockInventorySource) { BlockInventorySource blockInventorySource = (BlockInventorySource)inventorySource; BlockPosition pos = blockInventorySource.position(); bool = $this.mayInteract(pos, side.getOpposite()); }
/* 151 */     else { bool = true; }
/*     */     
/*     */     return f.inventory().func_70300_a($this.fakePlayer()) ? bool : false;
/*     */   }
/*     */   private static Object[] withInventorySource(WorldInventoryAnalytics $this, ForgeDirection side, Function1 f) {
/* 156 */     Option option = InventoryUtils$.MODULE$.inventorySourceAt($this.position().offset(side));
/* 157 */     if (option instanceof Some) { Some some = (Some)option; InventorySource is = (InventorySource)some.x(); if (mayInteract($this, side, is)) return (Object[])f.apply(is);  }
/* 158 */      return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no inventory" }));
/*     */   }
/*     */   
/*     */   private static Object[] withInventory(WorldInventoryAnalytics $this, ForgeDirection side, Function1 f) {
/* 162 */     return withInventorySource($this, side, (Function1)new WorldInventoryAnalytics$$anonfun$withInventory$1($this, f));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldInventoryAnalytics$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */