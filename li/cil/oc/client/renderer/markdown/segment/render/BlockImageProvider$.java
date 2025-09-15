/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ import net.minecraft.block.Block;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.immutable.StringOps;
/*    */ 
/*    */ public final class BlockImageProvider$ implements ImageProvider {
/*    */   public static final BlockImageProvider$ MODULE$;
/*    */   
/*    */   private BlockImageProvider$() {
/* 12 */     MODULE$ = this;
/*    */   }
/* 14 */   public ImageRenderer getImage(String data) { int splitIndex = data.lastIndexOf('@');
/* 15 */     Tuple2 tuple2 = (splitIndex > 0) ? (new StringOps(scala.Predef$.MODULE$.augmentString(data))).splitAt(splitIndex) : new Tuple2(data, ""); if (tuple2 != null) { String name = (String)tuple2._1(), optMeta = (String)tuple2._2(); Tuple2 tuple22 = new Tuple2(name, optMeta), tuple21 = tuple22; String str1 = (String)tuple21._1(), str2 = (String)tuple21._2();
/* 16 */       int meta = Strings.isNullOrEmpty(str2) ? 0 : Integer.parseInt((String)(new StringOps(scala.Predef$.MODULE$.augmentString(str2))).drop(1));
/* 17 */       Object object = Block.field_149771_c.func_82594_a(str1);
/* 18 */       if (object instanceof Block) { Block block = (Block)object; if (Item.func_150898_a(block) != null) { (new ItemStack[1])[0] = new ItemStack(block, 1, meta); return new ItemStackImageRenderer(new ItemStack[1]); }  }
/* 19 */        return new BlockImageProvider$$anon$1(); }  throw new MatchError(tuple2); } public final class BlockImageProvider$$anon$1 extends TextureImageRenderer implements InteractiveImageRenderer { public BlockImageProvider$$anon$1() { super(li.cil.oc.client.Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 20 */       return "oc:gui.Manual.Warning.BlockMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 22 */       return false;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\BlockImageProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */