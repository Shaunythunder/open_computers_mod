/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.api.manual.TabIconRenderer;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TextureTabIconRenderer
/*    */   implements TabIconRenderer
/*    */ {
/*    */   private final ResourceLocation location;
/*    */   
/*    */   public TextureTabIconRenderer(ResourceLocation location) {
/* 18 */     this.location = location;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void render() {
/* 24 */     Minecraft.func_71410_x().func_110434_K().func_110577_a(this.location);
/* 25 */     Tessellator t = Tessellator.field_78398_a;
/* 26 */     t.func_78382_b();
/* 27 */     t.func_78374_a(0.0D, 16.0D, 0.0D, 0.0D, 1.0D);
/* 28 */     t.func_78374_a(16.0D, 16.0D, 0.0D, 1.0D, 1.0D);
/* 29 */     t.func_78374_a(16.0D, 0.0D, 0.0D, 1.0D, 0.0D);
/* 30 */     t.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 31 */     t.func_78381_a();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\TextureTabIconRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */