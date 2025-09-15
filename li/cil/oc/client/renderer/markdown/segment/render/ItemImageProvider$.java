/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ import net.minecraft.item.Item;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.immutable.StringOps;
/*    */ 
/*    */ public final class ItemImageProvider$ implements ImageProvider {
/*    */   public static final ItemImageProvider$ MODULE$;
/*    */   
/*    */   private ItemImageProvider$() {
/* 11 */     MODULE$ = this;
/*    */   }
/* 13 */   public ImageRenderer getImage(String data) { int splitIndex = data.lastIndexOf('@');
/* 14 */     Tuple2 tuple2 = (splitIndex > 0) ? (new StringOps(scala.Predef$.MODULE$.augmentString(data))).splitAt(splitIndex) : new Tuple2(data, ""); if (tuple2 != null) { ItemImageProvider$$anon$1 itemImageProvider$$anon$1; String name = (String)tuple2._1(), optMeta = (String)tuple2._2(); Tuple2 tuple22 = new Tuple2(name, optMeta), tuple21 = tuple22; String str1 = (String)tuple21._1(), str2 = (String)tuple21._2();
/* 15 */       int meta = Strings.isNullOrEmpty(str2) ? 0 : Integer.parseInt((String)(new StringOps(scala.Predef$.MODULE$.augmentString(str2))).drop(1));
/* 16 */       Object object = Item.field_150901_e.func_82594_a(str1);
/* 17 */       if (object instanceof Item) { Item item = (Item)object; (new ItemStack[1])[0] = new ItemStack(item, 1, meta); ItemStackImageRenderer itemStackImageRenderer = new ItemStackImageRenderer(new ItemStack[1]); }
/* 18 */       else { itemImageProvider$$anon$1 = new ItemImageProvider$$anon$1(); }  return itemImageProvider$$anon$1; }  throw new MatchError(tuple2); } public final class ItemImageProvider$$anon$1 extends TextureImageRenderer implements InteractiveImageRenderer { public ItemImageProvider$$anon$1() { super(li.cil.oc.client.Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 19 */       return "oc:gui.Manual.Warning.ItemMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 21 */       return false;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\ItemImageProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */