/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import li.cil.oc.api.manual.ContentProvider;
/*     */ import li.cil.oc.api.manual.ImageProvider;
/*     */ import li.cil.oc.api.manual.ImageRenderer;
/*     */ import li.cil.oc.api.manual.PathProvider;
/*     */ import li.cil.oc.api.manual.TabIconRenderer;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
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
/*     */ public class Manual
/*     */ {
/*     */   public static void addTab(TabIconRenderer renderer, String tooltip, String path) {
/*  35 */     if (API.manual != null) API.manual.addTab(renderer, tooltip, path);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addProvider(PathProvider provider) {
/*  47 */     if (API.manual != null) API.manual.addProvider(provider);
/*     */   
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
/*     */   public static void addProvider(ContentProvider provider) {
/*  61 */     if (API.manual != null) API.manual.addProvider(provider);
/*     */   
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
/*     */   public static void addProvider(String prefix, ImageProvider provider) {
/*  83 */     if (API.manual != null) API.manual.addProvider(prefix, provider);
/*     */   
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
/*     */   public static ImageRenderer imageFor(String path) {
/*  97 */     if (API.manual != null) return API.manual.imageFor(path); 
/*  98 */     return null;
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
/*     */   public static String pathFor(ItemStack stack) {
/* 110 */     if (API.manual != null) return API.manual.pathFor(stack); 
/* 111 */     return null;
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
/*     */   public static String pathFor(World world, int x, int y, int z) {
/* 124 */     if (API.manual != null) return API.manual.pathFor(world, x, y, z); 
/* 125 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Iterable<String> contentFor(String path) {
/* 135 */     if (API.manual != null) return API.manual.contentFor(path); 
/* 136 */     return null;
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
/*     */   public static void openFor(EntityPlayer player) {
/* 150 */     if (API.manual != null) API.manual.openFor(player);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void reset() {
/* 157 */     if (API.manual != null) API.manual.reset();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void navigate(String path) {
/* 166 */     if (API.manual != null) API.manual.navigate(path); 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Manual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */