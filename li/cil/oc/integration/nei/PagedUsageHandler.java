/*    */ package li.cil.oc.integration.nei;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import scala.Option;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055g!B\001\003\003\003i!!\005)bO\026$Wk]1hK\"\013g\016\0327fe*\0211\001B\001\004]\026L'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ui\021\001\007\006\0033i\taA]3dSB,'BA\002\034\025\005a\022aC2pI\026\034\007.[2lK:L!A\b\r\003\033%+6/Y4f\021\006tG\r\\3s\021!\001\003A!b\001\n\003\t\023!\0029bO\026\034X#\001\022\021\007\r2\003&D\001%\025\005)\023!B:dC2\f\027BA\024%\005\031y\005\017^5p]B\0311%K\026\n\005)\"#!B!se\006L\bC\001\0270\035\t\031S&\003\002/I\0051\001K]3eK\032L!\001M\031\003\rM#(/\0338h\025\tqC\005\003\0054\001\t\005\t\025!\003#\003\031\001\030mZ3tA!)Q\007\001C\001m\0051A(\0338jiz\"\"aN\035\021\005a\002Q\"\001\002\t\013\001\"\004\031\001\022\t\013m\002A\021\003\037\002\t]\024\030\r\035\013\004{=\013\006G\001 G!\ry$\tR\007\002\001*\021\021IE\001\005kRLG.\003\002D\001\n!A*[:u!\t)e\t\004\001\005\023\035S\024\021!A\001\006\003A%AA 1#\tIE\n\005\002$\025&\0211\n\n\002\b\035>$\b.\0338h!\t\031S*\003\002OI\t\031\021I\\=\t\013AS\004\031A\026\002\t1Lg.\032\005\006%j\002\raU\001\006o&$G\017\033\t\003GQK!!\026\023\003\007%sG\017C\003X\001\021\005\003,A\bsK\016L\007/[3t!\026\024\b+Y4f)\005\031\006\"\002.\001\t\003B\026A\0038v[J+7-\0339fg\")A\f\001C!;\006qAM]1x\r>\024Xm\032:pk:$GC\0010b!\t\031s,\003\002aI\t!QK\\5u\021\025I2\f1\001T\021\025\031\007\001\"\021e\0039!'/Y<CC\016\\wM]8v]\022$\"AX3\t\013e\021\007\031A*\t\013\035\004A\021\t5\002'\035,G/\0238he\026$\027.\0328u'R\f7m[:\025\005%\004\bcA kY&\0211\016\021\002\n\003J\024\030-\037'jgR\004\"!\0348\016\003iI!a\034\016\003\037A{7/\033;j_:,Gm\025;bG.DQ!\0074A\002MCQA\035\001\005BM\fabZ3u\037RDWM]*uC\016\\7\017\006\002ji\")\021$\035a\001'\")a\017\001C!o\006qq-\032;SKN,H\016^*uC\016\\GC\001=|!\t\031\0230\003\002{I\t!a*\0367m\021\025IR\0171\001T\021\025i\b\001\"\021\003!yg.\0269eCR,G#\0010\t\017\005\005\001\001\"\021\002\004\005Q\001.Y:Pm\026\024H.Y=\025\021\005\025\0211BA\025\003o\0012aIA\004\023\r\tI\001\n\002\b\005>|G.Z1o\021\035\tia a\001\003\037\t1aZ;j!\021\t\t\"!\n\016\005\005M!\002BA\013\003/\t\021\"\0338wK:$xN]=\013\t\0055\021\021\004\006\005\0037\ti\"\001\004dY&,g\016\036\006\005\003?\t\t#A\005nS:,7M]1gi*\021\0211E\001\004]\026$\030\002BA\024\003'\021AbR;j\007>tG/Y5oKJDq!a\013\000\001\004\ti#A\005d_:$\030-\0338feB!\021qFA\032\033\t\t\tD\003\003\002\026\005u\021\002BA\033\003c\021\021bQ8oi\006Lg.\032:\t\013ey\b\031A*\t\017\005m\002\001\"\021\002>\005\tr-\032;Pm\026\024H.Y=IC:$G.\032:\025\013a\fy$!\021\t\021\0055\021\021\ba\001\003\037Aa!GA\035\001\004\031\006bBA#\001\021\005\023qI\001\023O\026$xJ^3sY\006L(+\0328eKJ,'\017F\003y\003\023\nY\005\003\005\002\016\005\r\003\031AA\b\021\031I\0221\ta\001'\"9\021q\n\001\005B\005E\023!\0045b]\022dW\rV8pYRL\007\017\006\005\002T\005U\023QMA5!\ry$i\013\005\t\003\033\ti\0051\001\002XA\"\021\021LA1!\0259\0221LA0\023\r\ti\006\007\002\n\017VL'+Z2ja\026\0042!RA1\t-\t\031'!\026\002\002\003\005)\021\001%\003\007}#\023\007\003\005\002h\0055\003\031AA*\003\035!xn\0347uSBDa!GA'\001\004\031\006bBA7\001\021\005\023qN\001\022Q\006tG\r\\3Ji\026lGk\\8mi&\004HCCA*\003c\ni(!$\002\020\"A\021QBA6\001\004\t\031\b\r\003\002v\005e\004#B\f\002\\\005]\004cA#\002z\021Y\0211PA9\003\003\005\tQ!\001I\005\ryFE\r\005\t\003\nY\0071\001\002\002\006)1\017^1dWB!\0211QAE\033\t\t)I\003\003\002\b\006u\021\001B5uK6LA!a#\002\006\nI\021\n^3n'R\f7m\033\005\t\003O\nY\0071\001\002T!1\021$a\033A\002MCq!a%\001\t\003\n)*\001\005lKf$\026\020]3e))\t)!a&\002$\0065\026\021\027\005\t\003\033\t\t\n1\001\002\032B\"\0211TAP!\0259\0221LAO!\r)\025q\024\003\f\003C\0139*!A\001\002\013\005\001JA\002`IMB\001\"!*\002\022\002\007\021qU\001\005G\"\f'\017E\002$\003SK1!a+%\005\021\031\005.\031:\t\017\005=\026\021\023a\001'\006!1m\0343f\021\031I\022\021\023a\001'\"9\021Q\027\001\005B\005]\026\001D7pkN,7\t\\5dW\026$G\003CA\003\003s\013)-!3\t\021\0055\0211\027a\001\003w\003D!!0\002BB)q#a\027\002@B\031Q)!1\005\027\005\r\027\021XA\001\002\003\025\t\001\023\002\004?\022\"\004bBAd\003g\003\raU\001\002q\"9\0211ZAZ\001\004\031\026!A=")
/*    */ public abstract class PagedUsageHandler implements IUsageHandler {
/*    */   private final Option<String[]> pages;
/*    */   
/* 13 */   public Option<String[]> pages() { return this.pages; } public PagedUsageHandler(Option<String[]> pages) {} public List<?> wrap(String line, int width) {
/* 14 */     return GuiDraw.fontRenderer.func_78271_c(line, width);
/*    */   } public int recipiesPerPage() {
/* 16 */     return 1;
/*    */   }
/* 18 */   public int numRecipes() { return BoxesRunTime.unboxToInt(pages().fold((Function0)new PagedUsageHandler$$anonfun$numRecipes$1(this), (Function1)new PagedUsageHandler$$anonfun$numRecipes$2(this))); } public final class PagedUsageHandler$$anonfun$numRecipes$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public PagedUsageHandler$$anonfun$numRecipes$1(PagedUsageHandler $outer) {} } public final class PagedUsageHandler$$anonfun$numRecipes$2 extends AbstractFunction1<String[], Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(String[] x$1) { return x$1.length; }
/*    */     
/*    */     public PagedUsageHandler$$anonfun$numRecipes$2(PagedUsageHandler $outer) {} }
/* 21 */   public void drawForeground(int recipe) { Option<String[]> option = pages();
/* 22 */     if (option instanceof Some) { Some some = (Some)option; String[] data = (String[])some.x();
/* 23 */       (new StringOps(Predef$.MODULE$.augmentString(data[recipe]))).lines().zipWithIndex().withFilter((Function1)new PagedUsageHandler$$anonfun$drawForeground$1(this)).foreach((Function1)new PagedUsageHandler$$anonfun$drawForeground$2(this)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     else
/*    */     
/* 26 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      }
/*    */   public final class PagedUsageHandler$$anonfun$drawForeground$1 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/* 32 */        return bool; } public PagedUsageHandler$$anonfun$drawForeground$1(PagedUsageHandler $outer) {} } public ArrayList<PositionedStack> getIngredientStacks(int recipe) { return new ArrayList<>(); }
/*    */   public final class PagedUsageHandler$$anonfun$drawForeground$2 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable {
/* 34 */     public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { String text = (String)tuple2._1(); int line = tuple2._2$mcI$sp(); GuiDraw.drawString(text, 4, 4 + line * 10, 3355443, false); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public PagedUsageHandler$$anonfun$drawForeground$2(PagedUsageHandler $outer) {} } public void drawBackground(int recipe) {} public ArrayList<PositionedStack> getOtherStacks(int recipe) { return new ArrayList<>(); }
/*    */    public Null$ getResultStack(int recipe) {
/* 36 */     return null;
/*    */   }
/*    */   public void onUpdate() {}
/*    */   public boolean hasOverlay(GuiContainer gui, Container container, int recipe) {
/* 40 */     return false;
/*    */   } public Null$ getOverlayHandler(GuiContainer gui, int recipe) {
/* 42 */     return null;
/*    */   } public Null$ getOverlayRenderer(GuiContainer gui, int recipe) {
/* 44 */     return null;
/*    */   } public List<String> handleTooltip(GuiRecipe gui, List<String> tooltip, int recipe) {
/* 46 */     return tooltip;
/*    */   } public List<String> handleItemTooltip(GuiRecipe gui, ItemStack stack, List<String> tooltip, int recipe) {
/* 48 */     return tooltip;
/*    */   } public boolean keyTyped(GuiRecipe gui, char char, int code, int recipe) {
/* 50 */     return false;
/*    */   } public boolean mouseClicked(GuiRecipe gui, int x, int y) {
/* 52 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\PagedUsageHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */