/*    */ package li.cil.oc.integration.stargatetech2;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModStargateTech2$ implements ModProxy {
/*  7 */   private ModStargateTech2$() { MODULE$ = this; } public static final ModStargateTech2$ MODULE$; public Mods.ModBase getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.StargateTech2();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((Item)DriverAbstractBusCard$.MODULE$);
/*    */     
/* 13 */     Driver.add(ConverterBusPacketNetScanDevice$.MODULE$);
/*    */     
/* 15 */     Driver.add(DriverAbstractBusCard.Provider$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\stargatetech2\ModStargateTech2$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */