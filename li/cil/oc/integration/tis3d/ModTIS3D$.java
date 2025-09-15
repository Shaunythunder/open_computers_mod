/*    */ package li.cil.oc.integration.tis3d;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModTIS3D$ implements ModProxy {
/*  6 */   private ModTIS3D$() { MODULE$ = this; } public static final ModTIS3D$ MODULE$; public Mods.SimpleMod getMod() {
/*  7 */     return li.cil.oc.integration.Mods$.MODULE$.TIS3D();
/*    */   }
/*    */   public void initialize() {
/* 10 */     SerialInterfaceProviderAdapter$.MODULE$.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tis3d\ModTIS3D$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */