/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.RenderHelper;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001]3Q!\001\002\001\rI\021a#\023;f[N#\030mY6J[\006<WMU3oI\026\024XM\035\006\003\007\021\taA]3oI\026\024(BA\003\007\003\035\031XmZ7f]RT!a\002\005\002\0215\f'o\0333po:T!!\003\006\002\021I,g\016Z3sKJT!a\003\007\002\r\rd\027.\0328u\025\tia\"\001\002pG*\021q\002E\001\004G&d'\"A\t\002\0051L7c\001\001\0247A\021A#G\007\002+)\021acF\001\005Y\006twMC\001\031\003\021Q\027M^1\n\005i)\"AB(cU\026\034G\017\005\002\035C5\tQD\003\002\037?\0051Q.\0318vC2T!\001\t\007\002\007\005\004\030.\003\002#;\ti\021*\\1hKJ+g\016Z3sKJD\001\002\n\001\003\006\004%\tAJ\001\007gR\f7m[:\004\001U\tq\005E\002)W5j\021!\013\006\002U\005)1oY1mC&\021A&\013\002\006\003J\024\030-\037\t\003]Uj\021a\f\006\003aE\nA!\033;f[*\021!gM\001\n[&tWm\031:bMRT\021\001N\001\004]\026$\030B\001\0340\005%IE/Z7Ti\006\0347\016\003\0059\001\t\005\t\025!\003(\003\035\031H/Y2lg\002BQA\017\001\005\002m\na\001P5oSRtDC\001\037?!\ti\004!D\001\003\021\025!\023\b1\001(\021\035\001\005A1A\005\006\005\013!bY=dY\026\034\006/Z3e+\005\021u\"A\"\036\005\rA\017BB#\001A\0035!)A\006ds\016dWm\0259fK\022\004\003\"B$\001\t\003B\025\001C4fi^KG\r\0365\025\003%\003\"\001\013&\n\005-K#aA%oi\")Q\n\001C!\021\006Iq-\032;IK&<\007\016\036\005\006\007\001!\te\024\013\004!N+\006C\001\025R\023\t\021\026F\001\003V]&$\b\"\002+O\001\004I\025AB7pkN,\007\fC\003W\035\002\007\021*\001\004n_V\034X-\027")
/*    */ public class ItemStackImageRenderer implements ImageRenderer {
/*    */   private final ItemStack[] stacks;
/*    */   
/*    */   public ItemStack[] stacks() {
/* 12 */     return this.stacks;
/*    */   } private final int cycleSpeed; public ItemStackImageRenderer(ItemStack[] stacks) {} public final int cycleSpeed() {
/* 14 */     return 1000;
/*    */   } public int getWidth() {
/* 16 */     return 32;
/*    */   } public int getHeight() {
/* 18 */     return 32;
/*    */   }
/*    */   public void render(int mouseX, int mouseY) {
/* 21 */     Minecraft mc = Minecraft.func_71410_x();
/* 22 */     int index = (int)(System.currentTimeMillis() % (1000 * (stacks()).length)) / 1000;
/* 23 */     ItemStack stack = stacks()[index];
/*    */     
/* 25 */     GL11.glScalef((getWidth() / 16), (getHeight() / 16), (getWidth() / 16));
/* 26 */     GL11.glEnable(32826);
/* 27 */     RenderHelper.func_74520_c();
/* 28 */     OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 240.0F, 240.0F);
/* 29 */     RenderItem.getInstance().func_82406_b(mc.field_71466_p, mc.func_110434_K(), stack, 0, 0);
/* 30 */     RenderHelper.func_74518_a();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\ItemStackImageRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */