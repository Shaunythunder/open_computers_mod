/*    */ package li.cil.oc.integration.bloodmagic;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ 
/*    */ public final class ModBloodMagic$ implements ModProxy {
/*  6 */   private ModBloodMagic$() { MODULE$ = this; } public static final ModBloodMagic$ MODULE$; public Mods.SimpleMod getMod() {
/*  7 */     return li.cil.oc.integration.Mods$.MODULE$.BloodMagic();
/*    */   }
/*    */   public void initialize() {
/* 10 */     Driver.add((SidedBlock)new DriverBloodAltar());
/* 11 */     Driver.add((SidedBlock)new DriverMasterRitualStone());
/*    */     
/* 13 */     Driver.add(new ConverterBloodOrb());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bloodmagic\ModBloodMagic$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */