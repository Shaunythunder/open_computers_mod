/*    */ package li.cil.oc.integration.agricraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.ModProxy;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ 
/*    */ public final class ModAgriCraft$ implements ModProxy {
/*  9 */   private ModAgriCraft$() { MODULE$ = this; } public static final ModAgriCraft$ MODULE$; public Mod getMod() {
/* 10 */     return (Mod)li.cil.oc.integration.Mods$.MODULE$.AgriCraft();
/*    */   }
/*    */   public void initialize() {
/* 13 */     Driver.add(ConverterSeeds$.MODULE$);
/*    */     
/* 15 */     MinecraftForge.EVENT_BUS.register(EventHandlerAgriCraft$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\ModAgriCraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */