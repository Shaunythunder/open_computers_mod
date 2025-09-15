/*    */ package li.cil.oc.integration.igw;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.ModProxy;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModIngameWiki$ implements ModProxy {
/*  8 */   private ModIngameWiki$() { MODULE$ = this; } public static final ModIngameWiki$ MODULE$; public Mods.SimpleMod getMod() {
/*  9 */     return li.cil.oc.integration.Mods$.MODULE$.IngameWiki();
/*    */   }
/*    */   public void initialize() {
/* 12 */     WikiEventHandler$.MODULE$.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\igw\ModIngameWiki$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */