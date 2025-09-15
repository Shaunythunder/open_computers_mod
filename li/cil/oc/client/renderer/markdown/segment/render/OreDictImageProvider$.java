/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class OreDictImageProvider$ implements ImageProvider {
/*    */   public static final OreDictImageProvider$ MODULE$;
/*    */   
/* 11 */   private OreDictImageProvider$() { MODULE$ = this; }
/*    */   
/* 13 */   public ImageRenderer getImage(String data) { Buffer stacks = (Buffer)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(data)).filter((Function1)new OreDictImageProvider$$anonfun$1());
/* 14 */     return (stacks != null && stacks.nonEmpty()) ? new ItemStackImageRenderer((ItemStack[])stacks.toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class))) : 
/* 15 */       new OreDictImageProvider$$anon$1(); } public final class OreDictImageProvider$$anonfun$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return !(stack == null || stack.func_77973_b() == null); } } public final class OreDictImageProvider$$anon$1 extends TextureImageRenderer implements InteractiveImageRenderer { public OreDictImageProvider$$anon$1() { super(li.cil.oc.client.Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 16 */       return "oc:gui.Manual.Warning.OreDictMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 18 */       return false;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\OreDictImageProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */