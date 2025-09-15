/*    */ package li.cil.oc.api;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import li.cil.oc.api.nanomachines.BehaviorProvider;
/*    */ import li.cil.oc.api.nanomachines.Controller;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Nanomachines
/*    */ {
/*    */   public static void addProvider(BehaviorProvider provider) {
/* 25 */     if (API.nanomachines != null) API.nanomachines.addProvider(provider);
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Iterable<BehaviorProvider> getProviders() {
/* 34 */     if (API.nanomachines != null) return API.nanomachines.getProviders(); 
/* 35 */     return Collections.emptyList();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean hasController(EntityPlayer player) {
/* 45 */     if (API.nanomachines != null) return API.nanomachines.hasController(player); 
/* 46 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Controller getController(EntityPlayer player) {
/* 60 */     if (API.nanomachines != null) return API.nanomachines.getController(player); 
/* 61 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Controller installController(EntityPlayer player) {
/* 74 */     if (API.nanomachines != null) return API.nanomachines.installController(player); 
/* 75 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void uninstallController(EntityPlayer player) {
/* 86 */     if (API.nanomachines != null) API.nanomachines.uninstallController(player); 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Nanomachines.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */