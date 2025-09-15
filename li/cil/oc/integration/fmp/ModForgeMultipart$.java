/*    */ package li.cil.oc.integration.fmp;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModForgeMultipart$ implements ModProxy {
/*  7 */   private ModForgeMultipart$() { MODULE$ = this; } public static final ModForgeMultipart$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart();
/*    */   }
/*    */   public void initialize() {
/* 11 */     MultipartConverter$.MODULE$.init();
/* 12 */     MultipartFactory$.MODULE$.init();
/*    */     
/* 14 */     MinecraftForge.EVENT_BUS.register(EventHandler$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\ModForgeMultipart$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */