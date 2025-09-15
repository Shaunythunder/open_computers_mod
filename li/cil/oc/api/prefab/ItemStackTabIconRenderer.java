/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.api.manual.TabIconRenderer;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.OpenGlHelper;
/*    */ import net.minecraft.client.renderer.RenderHelper;
/*    */ import net.minecraft.client.renderer.entity.RenderItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemStackTabIconRenderer
/*    */   implements TabIconRenderer
/*    */ {
/*    */   private final ItemStack stack;
/*    */   
/*    */   public ItemStackTabIconRenderer(ItemStack stack) {
/* 22 */     this.stack = stack;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void render() {
/* 28 */     GL11.glEnable(32826);
/* 29 */     RenderHelper.func_74520_c();
/* 30 */     OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 240.0F, 240.0F);
/* 31 */     RenderItem.getInstance()
/* 32 */       .func_82406_b(
/* 33 */         (Minecraft.func_71410_x()).field_71466_p, 
/* 34 */         Minecraft.func_71410_x().func_110434_K(), this.stack, 0, 0);
/*    */ 
/*    */ 
/*    */     
/* 38 */     RenderHelper.func_74518_a();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\ItemStackTabIconRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */