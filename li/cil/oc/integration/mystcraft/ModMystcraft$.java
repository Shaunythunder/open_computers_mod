/*    */ package li.cil.oc.integration.mystcraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModMystcraft$ implements ModProxy {
/*  7 */   private ModMystcraft$() { MODULE$ = this; } public static final ModMystcraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.Mystcraft();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add(new ConverterAgebook());
/* 12 */     Driver.add(new ConverterLinkbook());
/* 13 */     Driver.add(new ConverterPage());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mystcraft\ModMystcraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */