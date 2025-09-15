/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import java.util.concurrent.Callable;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.fs.FileSystem;
/*     */ import net.minecraft.item.ItemStack;
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
/*     */ public final class Items
/*     */ {
/*     */   public static ItemInfo get(String name) {
/*  29 */     if (API.items != null) return API.items.get(name); 
/*  30 */     return null;
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
/*     */   public static ItemInfo get(ItemStack stack) {
/*  42 */     if (API.items != null) return API.items.get(stack); 
/*  43 */     return null;
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
/*     */   @Deprecated
/*     */   public static ItemStack registerFloppy(String name, int color, Callable<FileSystem> factory) {
/*  71 */     if (API.items != null) return API.items.registerFloppy(name, color, factory); 
/*  72 */     return null;
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
/*     */   public static ItemStack registerFloppy(String name, int color, Callable<FileSystem> factory, boolean doRecipeCycling) {
/* 103 */     if (API.items != null) return API.items.registerFloppy(name, color, factory, doRecipeCycling); 
/* 104 */     return null;
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
/*     */   public static ItemStack registerEEPROM(String name, byte[] code, byte[] data, boolean readonly) {
/* 124 */     if (API.items != null) return API.items.registerEEPROM(name, code, data, readonly); 
/* 125 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Items.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */