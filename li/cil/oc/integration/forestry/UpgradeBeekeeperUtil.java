/*     */ package li.cil.oc.integration.forestry;
/*     */ 
/*     */ import cpw.mods.fml.common.Loader;
/*     */ import forestry.api.apiculture.IBeeHousing;
/*     */ import gregtech.api.metatileentity.BaseMetaTileEntity;
/*     */ import gregtech.api.util.GTUtility;
/*     */ import gregtech.common.tileentities.machines.basic.MTEIndustrialApiary;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class UpgradeBeekeeperUtil
/*     */ {
/*  20 */   private static final boolean GT_LOADED = Loader.isModLoaded("gregtech");
/*     */ 
/*     */ 
/*     */   
/*     */   public static IBeeHousing getBeeHousingAt(BlockPosition pos) {
/*  25 */     if (pos.world().isEmpty()) {
/*  26 */       return null;
/*     */     }
/*  28 */     World world = (World)pos.world().get();
/*  29 */     TileEntity te = world.func_147438_o(pos.x(), pos.y(), pos.z());
/*  30 */     if (te == null)
/*  31 */       return null; 
/*  32 */     if (te instanceof IBeeHousing) {
/*  33 */       return (IBeeHousing)te;
/*     */     }
/*  35 */     if (!GT_LOADED) {
/*  36 */       return null;
/*     */     }
/*     */     
/*  39 */     if (!(te instanceof BaseMetaTileEntity))
/*  40 */       return null; 
/*  41 */     BaseMetaTileEntity mte = (BaseMetaTileEntity)te;
/*  42 */     if (!(mte.getMetaTileEntity() instanceof MTEIndustrialApiary))
/*  43 */       return null; 
/*  44 */     return (IBeeHousing)mte.getMetaTileEntity();
/*     */   }
/*     */ 
/*     */   
/*     */   public static MTEIndustrialApiary getGTIApiaryAt(BlockPosition pos) {
/*  49 */     if (!GT_LOADED || pos.world().isEmpty()) {
/*  50 */       return null;
/*     */     }
/*  52 */     World world = (World)pos.world().get();
/*  53 */     TileEntity te = world.func_147438_o(pos.x(), pos.y(), pos.z());
/*  54 */     if (te == null)
/*  55 */       return null; 
/*  56 */     if (!(te instanceof BaseMetaTileEntity))
/*  57 */       return null; 
/*  58 */     BaseMetaTileEntity mte = (BaseMetaTileEntity)te;
/*  59 */     if (!(mte.getMetaTileEntity() instanceof MTEIndustrialApiary))
/*  60 */       return null; 
/*  61 */     return (MTEIndustrialApiary)mte.getMetaTileEntity();
/*     */   }
/*     */   
/*     */   public static boolean swapQueen(BlockPosition pos, IInventory hostInv, int slot) {
/*  65 */     IBeeHousing housing = getBeeHousingAt(pos);
/*  66 */     if (housing == null) {
/*  67 */       return false;
/*     */     }
/*  69 */     ItemStack newQueen = hostInv.func_70301_a(slot);
/*  70 */     ItemStack oldQueen = housing.getBeeInventory().getQueen();
/*  71 */     housing.getBeeInventory().setQueen(newQueen);
/*  72 */     hostInv.func_70299_a(slot, oldQueen);
/*  73 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean swapDrone(BlockPosition pos, IInventory hostInv, int slot) {
/*  77 */     IBeeHousing housing = getBeeHousingAt(pos);
/*  78 */     if (housing == null) {
/*  79 */       return false;
/*     */     }
/*  81 */     ItemStack newDrone = hostInv.func_70301_a(slot);
/*  82 */     ItemStack oldDrone = housing.getBeeInventory().getDrone();
/*  83 */     housing.getBeeInventory().setDrone(newDrone);
/*  84 */     hostInv.func_70299_a(slot, oldDrone);
/*  85 */     return true;
/*     */   }
/*     */   
/*     */   public static int getMaxIndustrialUpgradeCount() {
/*  89 */     if (!GT_LOADED)
/*  90 */       return 0; 
/*  91 */     return MTEIndustrialApiary.getMaxUpgradeCount();
/*     */   }
/*     */   
/*     */   public static int addIndustrialUpgrade(BlockPosition pos, IInventory hostInv, int slot, int amount) {
/*  95 */     MTEIndustrialApiary iapiary = getGTIApiaryAt(pos);
/*  96 */     if (iapiary == null || amount <= 0) {
/*  97 */       return 0;
/*     */     }
/*  99 */     ItemStack stackToInstall = hostInv.func_70301_a(slot);
/* 100 */     if (stackToInstall == null)
/* 101 */       return 0; 
/* 102 */     amount = Math.min(amount, stackToInstall.field_77994_a);
/*     */     
/* 104 */     ItemStack stackToTryPush = stackToInstall.func_77979_a(amount);
/* 105 */     iapiary.addUpgrade(stackToTryPush);
/* 106 */     int itemsPushed = amount - stackToTryPush.field_77994_a;
/*     */     
/* 108 */     stackToInstall.field_77994_a += stackToTryPush.field_77994_a;
/*     */     
/* 110 */     return itemsPushed;
/*     */   }
/*     */   
/*     */   public static ItemStack getIndustrialUpgrade(BlockPosition pos, int index) {
/* 114 */     if (index < 1 || index > getMaxIndustrialUpgradeCount())
/* 115 */       return null; 
/* 116 */     MTEIndustrialApiary iapiary = getGTIApiaryAt(pos);
/* 117 */     if (iapiary == null)
/* 118 */       return null; 
/* 119 */     return iapiary.getUpgrade(index - 1);
/*     */   }
/*     */   
/*     */   public static int removeIndustrialUpgrade(BlockPosition pos, IInventory hostInv, int slot, int index, int amount) {
/* 123 */     if (index < 1 || index > getMaxIndustrialUpgradeCount() || amount <= 0)
/* 124 */       return 0; 
/* 125 */     MTEIndustrialApiary iapiary = getGTIApiaryAt(pos);
/* 126 */     if (iapiary == null) {
/* 127 */       return 0;
/*     */     }
/* 129 */     ItemStack stack = iapiary.getUpgrade(index - 1);
/* 130 */     if (stack == null)
/* 131 */       return 0; 
/* 132 */     stack = stack.func_77946_l();
/*     */     
/* 134 */     amount = Math.min(amount, stack.field_77994_a);
/* 135 */     int moved = insertIntoHostInv(hostInv, slot, stack.func_77979_a(amount));
/*     */     
/* 137 */     iapiary.removeUpgrade(index - 1, moved);
/* 138 */     return moved;
/*     */   }
/*     */   
/*     */   private static int insertIntoHostInv(IInventory hostInv, int slot, ItemStack stack) {
/* 142 */     if (stack == null) {
/* 143 */       return 0;
/*     */     }
/* 145 */     int initialStackSize = stack.field_77994_a;
/*     */ 
/*     */     
/* 148 */     insertIntoSlot(hostInv, slot, stack);
/*     */     
/* 150 */     if (stack.field_77994_a <= 0) {
/* 151 */       return initialStackSize;
/*     */     }
/*     */     int i;
/* 154 */     for (i = 0; i < hostInv.func_70302_i_(); i++) {
/* 155 */       ItemStack stackInSlot = hostInv.func_70301_a(i);
/* 156 */       if (GTUtility.areStacksEqual(stack, stackInSlot)) {
/*     */         
/* 158 */         insertIntoSlot(hostInv, i, stack);
/*     */         
/* 160 */         if (stack.field_77994_a <= 0) {
/* 161 */           return initialStackSize;
/*     */         }
/*     */       } 
/*     */     } 
/* 165 */     for (i = 0; i < hostInv.func_70302_i_(); i++) {
/* 166 */       insertIntoSlot(hostInv, i, stack);
/*     */       
/* 168 */       if (stack.field_77994_a <= 0) {
/* 169 */         return initialStackSize;
/*     */       }
/*     */     } 
/* 172 */     return initialStackSize - stack.field_77994_a;
/*     */   }
/*     */   
/*     */   private static void insertIntoSlot(IInventory inv, int slot, ItemStack stack) {
/* 176 */     ItemStack stackInSlot = inv.func_70301_a(slot);
/* 177 */     int maxStackSize = Math.min(inv.func_70297_j_(), stack.func_77976_d());
/* 178 */     if (stackInSlot == null) {
/* 179 */       inv.func_70299_a(slot, stack.func_77979_a(Math.min(maxStackSize, stack.field_77994_a)));
/* 180 */     } else if (GTUtility.areStacksEqual(stack, stackInSlot)) {
/* 181 */       int toMove = Math.min(stack.field_77994_a, Math.max(0, maxStackSize - stackInSlot.field_77994_a));
/* 182 */       if (toMove > 0) {
/* 183 */         stackInSlot.field_77994_a += toMove;
/* 184 */         stack.field_77994_a -= toMove;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\UpgradeBeekeeperUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */