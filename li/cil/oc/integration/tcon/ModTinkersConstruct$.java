/*    */ package li.cil.oc.integration.tcon;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ 
/*    */ public final class ModTinkersConstruct$ implements ModProxy {
/*  9 */   private ModTinkersConstruct$() { MODULE$ = this; } public static final ModTinkersConstruct$ MODULE$; public Mods.SimpleMod getMod() {
/* 10 */     return li.cil.oc.integration.Mods$.MODULE$.TinkersConstruct();
/*    */   }
/*    */   public void initialize() {
/* 13 */     IMC.registerToolDurabilityProvider("li.cil.oc.integration.tcon.EventHandlerTinkersConstruct.getDurability");
/*    */     
/* 15 */     MinecraftForge.EVENT_BUS.register(EventHandlerTinkersConstruct$.MODULE$);
/*    */   }
/*    */   public boolean isInfiTool(ItemStack stack) {
/* 18 */     return (stack != null && stack.func_77973_b().getClass().getName().startsWith("tconstruct."));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tcon\ModTinkersConstruct$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */