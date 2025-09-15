/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import cpw.mods.fml.common.event.FMLInterModComms;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.nbt.NBTTagString;
/*     */ import org.apache.commons.lang3.tuple.Pair;
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
/*     */ public final class IMC
/*     */ {
/*     */   private static final String MOD_ID = "OpenComputers";
/*     */   
/*     */   public static void registerAssemblerFilter(String callback) {
/*  43 */     FMLInterModComms.sendMessage("OpenComputers", "registerAssemblerFilter", callback);
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
/*     */   public static void registerAssemblerTemplate(String name, String select, String validate, String assemble, Class host, int[] containerTiers, int[] upgradeTiers, Iterable<Pair<String, Integer>> componentSlots) {
/* 112 */     NBTTagCompound nbt = new NBTTagCompound();
/* 113 */     if (name != null) {
/* 114 */       nbt.func_74778_a("name", name);
/*     */     }
/* 116 */     nbt.func_74778_a("select", select);
/* 117 */     nbt.func_74778_a("validate", validate);
/* 118 */     nbt.func_74778_a("assemble", assemble);
/* 119 */     if (host != null) {
/* 120 */       nbt.func_74778_a("hostClass", host.getName());
/*     */     }
/*     */     
/* 123 */     NBTTagList containersNbt = new NBTTagList();
/* 124 */     if (containerTiers != null) {
/* 125 */       for (int tier : containerTiers) {
/* 126 */         NBTTagCompound slotNbt = new NBTTagCompound();
/* 127 */         slotNbt.func_74768_a("tier", tier);
/* 128 */         containersNbt.func_74742_a((NBTBase)slotNbt);
/*     */       } 
/*     */     }
/* 131 */     if (containersNbt.func_74745_c() > 0) {
/* 132 */       nbt.func_74782_a("containerSlots", (NBTBase)containersNbt);
/*     */     }
/*     */     
/* 135 */     NBTTagList upgradesNbt = new NBTTagList();
/* 136 */     if (upgradeTiers != null) {
/* 137 */       for (int tier : upgradeTiers) {
/* 138 */         NBTTagCompound slotNbt = new NBTTagCompound();
/* 139 */         slotNbt.func_74768_a("tier", tier);
/* 140 */         upgradesNbt.func_74742_a((NBTBase)slotNbt);
/*     */       } 
/*     */     }
/* 143 */     if (upgradesNbt.func_74745_c() > 0) {
/* 144 */       nbt.func_74782_a("upgradeSlots", (NBTBase)upgradesNbt);
/*     */     }
/*     */     
/* 147 */     NBTTagList componentsNbt = new NBTTagList();
/* 148 */     if (componentSlots != null) {
/* 149 */       for (Pair<String, Integer> slot : componentSlots) {
/* 150 */         if (slot == null) {
/* 151 */           componentsNbt.func_74742_a((NBTBase)new NBTTagCompound()); continue;
/*     */         } 
/* 153 */         NBTTagCompound slotNbt = new NBTTagCompound();
/* 154 */         slotNbt.func_74778_a("type", (String)slot.getLeft());
/* 155 */         slotNbt.func_74768_a("tier", ((Integer)slot.getRight()).intValue());
/* 156 */         componentsNbt.func_74742_a((NBTBase)slotNbt);
/*     */       } 
/*     */     }
/*     */     
/* 160 */     if (componentsNbt.func_74745_c() > 0) {
/* 161 */       nbt.func_74782_a("componentSlots", (NBTBase)componentsNbt);
/*     */     }
/*     */     
/* 164 */     FMLInterModComms.sendMessage("OpenComputers", "registerAssemblerTemplate", nbt);
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
/*     */   public static void registerDisassemblerTemplate(String name, String select, String disassemble) {
/* 201 */     NBTTagCompound nbt = new NBTTagCompound();
/* 202 */     if (name != null) {
/* 203 */       nbt.func_74778_a("name", name);
/*     */     }
/* 205 */     nbt.func_74778_a("select", select);
/* 206 */     nbt.func_74778_a("disassemble", disassemble);
/*     */     
/* 208 */     FMLInterModComms.sendMessage("OpenComputers", "registerDisassemblerTemplate", nbt);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerToolDurabilityProvider(String callback) {
/* 232 */     FMLInterModComms.sendMessage("OpenComputers", "registerToolDurabilityProvider", callback);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerWrenchTool(String callback) {
/* 256 */     FMLInterModComms.sendMessage("OpenComputers", "registerWrenchTool", callback);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerWrenchToolCheck(String callback) {
/* 279 */     FMLInterModComms.sendMessage("OpenComputers", "registerWrenchToolCheck", callback);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerItemCharge(String name, String canCharge, String charge) {
/* 305 */     NBTTagCompound nbt = new NBTTagCompound();
/* 306 */     nbt.func_74778_a("name", name);
/* 307 */     nbt.func_74778_a("canCharge", canCharge);
/* 308 */     nbt.func_74778_a("charge", charge);
/* 309 */     FMLInterModComms.sendMessage("OpenComputers", "registerItemCharge", nbt);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerInkProvider(String callback) {
/* 333 */     FMLInterModComms.sendMessage("OpenComputers", "registerInkProvider", callback);
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
/*     */   public static void blacklistPeripheral(Class peripheral) {
/* 346 */     FMLInterModComms.sendMessage("OpenComputers", "blacklistPeripheral", peripheral.getName());
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
/*     */   public static void blacklistHost(String name, Class host, ItemStack stack) {
/* 365 */     NBTTagCompound nbt = new NBTTagCompound();
/* 366 */     nbt.func_74778_a("name", name);
/* 367 */     nbt.func_74778_a("host", host.getName());
/* 368 */     NBTTagCompound stackNbt = new NBTTagCompound();
/* 369 */     stack.func_77955_b(stackNbt);
/* 370 */     nbt.func_74782_a("item", (NBTBase)stackNbt);
/* 371 */     FMLInterModComms.sendMessage("OpenComputers", "blacklistHost", nbt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerCustomPowerSystem() {
/* 382 */     FMLInterModComms.sendMessage("OpenComputers", "registerCustomPowerSystem", "true");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void registerProgramDiskLabel(String programName, String diskLabel, String... architectures) {
/* 411 */     NBTTagCompound nbt = new NBTTagCompound();
/* 412 */     nbt.func_74778_a("program", programName);
/* 413 */     nbt.func_74778_a("label", diskLabel);
/* 414 */     if (architectures != null && architectures.length > 0) {
/* 415 */       NBTTagList architecturesNbt = new NBTTagList();
/* 416 */       for (String architecture : architectures) {
/* 417 */         architecturesNbt.func_74742_a((NBTBase)new NBTTagString(architecture));
/*     */       }
/* 419 */       nbt.func_74782_a("architectures", (NBTBase)architecturesNbt);
/*     */     } 
/* 421 */     FMLInterModComms.sendMessage("OpenComputers", "registerProgramDiskLabel", nbt);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\IMC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */