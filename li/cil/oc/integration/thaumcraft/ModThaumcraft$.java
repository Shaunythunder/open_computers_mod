/*    */ package li.cil.oc.integration.thaumcraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModThaumcraft$ implements ModProxy {
/*  7 */   private ModThaumcraft$() { MODULE$ = this; } public static final ModThaumcraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.Thaumcraft();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverAspectContainer());
/* 12 */     Driver.add(ConverterAspectItem$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumcraft\ModThaumcraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */