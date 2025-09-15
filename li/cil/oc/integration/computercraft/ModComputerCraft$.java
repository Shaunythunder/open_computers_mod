/*    */ package li.cil.oc.integration.computercraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModComputerCraft$ implements ModProxy {
/*  7 */   private ModComputerCraft$() { MODULE$ = this; } public static final ModComputerCraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.ComputerCraft();
/*    */   }
/*    */   public void initialize() {
/* 11 */     PeripheralProvider$.MODULE$.init();
/* 12 */     BundledRedstoneProvider$.MODULE$.init();
/*    */     
/* 14 */     Driver.add((Item)DriverComputerCraftMedia$.MODULE$);
/* 15 */     Driver.add(new DriverPeripheral());
/*    */     
/* 17 */     Driver.add(new ConverterLuaObject());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\ModComputerCraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */