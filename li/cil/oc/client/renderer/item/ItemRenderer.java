/*     */ package li.cil.oc.client.renderer.item;
/*     */ 
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.renderer.entity.RenderItem;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.client.IItemRenderer;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Us!B\001\003\021\003y\021\001D%uK6\024VM\0343fe\026\024(BA\002\005\003\021IG/Z7\013\005\0251\021\001\003:f]\022,'/\032:\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021A\"\023;f[J+g\016Z3sKJ\0342!\005\013\035!\t)\"$D\001\027\025\t9\002$\001\003mC:<'\"A\r\002\t)\fg/Y\005\0037Y\021aa\0242kK\016$\bCA\017$\033\005q\"BA\004 \025\t\001\023%\001\bnS:,7M]1gi\032|'oZ3\013\003\t\n1A\\3u\023\t!cDA\007J\023R,WNU3oI\026\024XM\035\005\006ME!\taJ\001\007y%t\027\016\036 \025\003=Aq!K\tC\002\023\005!&\001\006sK:$WM]%uK6,\022a\013\t\003YMj\021!\f\006\003]=\na!\0328uSRL(BA\0031\025\t9\021G\003\0023C\005IQ.\0338fGJ\fg\r^\005\003i5\022!BU3oI\026\024\030\n^3n\021\0311\024\003)A\005W\005Y!/\0328eKJLE/Z7!\021!A\024\003#b\001\n\003I\024!\0023s_:,W#\001\036\021\005m\002U\"\001\037\013\005ur\024A\0023fi\006LGN\003\002@\021\005\031\021\r]5\n\005\005c$\001C%uK6LeNZ8\t\021\r\013\002\022!Q!\ni\na\001\032:p]\026\004\003\002C#\022\021\013\007I\021A\035\002\r\031dw\016\0359z\021!9\025\003#A!B\023Q\024a\0024m_B\004\030\020\t\005\t\023FA)\031!C\001s\005AAn\\8u\t&\0348\016\003\005L#!\005\t\025)\003;\003%awn\034;ESN\\\007\005\003\005N#!\025\r\021\"\001:\003\025\001(/\0338u\021!y\025\003#A!B\023Q\024A\0029sS:$\b\005\003\005R#!\025\r\021\"\001:\003\025\031\027M\0317f\021!\031\026\003#A!B\023Q\024AB2bE2,\007\005\003\005V#!\025\r\021\"\001W\003%qW\017\0347TQ\006\004X-F\001X!\tA\026M\004\002Z?6\t!L\003\002\\9\006!A-\031;b\025\t\031QL\003\002_\021\00511m\\7n_:L!\001\031.\002\023A\023\030N\034;ECR\f\027B\0012d\005\025\031\006.\0319f\025\t\001'\f\003\005f#!\005\t\025)\003X\003)qW\017\0347TQ\006\004X\r\t\005\006OF!\t\001[\001\tSN4En\0349qsR\021\021n\034\t\003U6l\021a\033\006\002Y\006)1oY1mC&\021an\033\002\b\005>|G.Z1o\021\025\001h\r1\001;\003)!Wm]2sSB$xN\035\005\006eF!\te]\001\021Q\006tG\r\\3SK:$WM\035+za\026$2!\033;|\021\025)\030\0171\001w\003\025\031H/Y2l!\t9\0300D\001y\025\t\031\021'\003\002{q\nI\021\n^3n'R\f7m\033\005\006yF\004\r!`\001\013e\026tG-\032:UsB,\007c\001@\002\0269\031q0!\005\017\t\005\005\021q\002\b\005\003\007\tiA\004\003\002\006\005-QBAA\004\025\r\tIAD\001\007yI|w\016\036 \n\003\tJ!\001I\021\n\005\035y\022bAA\n=\005i\021*\023;f[J+g\016Z3sKJLA!a\006\002\032\tq\021\n^3n%\026tG-\032:UsB,'bAA\n=!9\021QD\t\005B\005}\021!F:i_VdG-V:f%\026tG-\032:IK2\004XM\035\013\bS\006\005\0221EA\023\021\031a\0301\004a\001{\"1Q/a\007A\002YD\001\"a\n\002\034\001\007\021\021F\001\007Q\026d\007/\032:\021\007y\fY#\003\003\002.\005e!AE%uK6\024VM\0343fe\026\024\b*\0327qKJDa!K\t\005B\005EB\003CA\032\003s\tY$!\020\021\007)\f)$C\002\0028-\024A!\0268ji\"1A0a\fA\002uDa!^A\030\001\0041\bbB.\0020\001\007\021q\b\t\006U\006\005\023QI\005\004\003\007Z'A\003\037sKB,\027\r^3e}A\031!.a\022\n\007\005%3N\001\004B]f\024VM\032\005\b\003\033\nB\021BA(\003%!'/Y<TQ\006\004X\r\006\003\0024\005E\003bBA*\003\027\002\raV\001\006g\"\f\007/\032")
/*     */ public final class ItemRenderer
/*     */ {
/*     */   public static void renderItem(IItemRenderer.ItemRenderType paramItemRenderType, ItemStack paramItemStack, Seq<Object> paramSeq) {
/*     */     ItemRenderer$.MODULE$.renderItem(paramItemRenderType, paramItemStack, paramSeq);
/*     */   }
/*     */   
/*     */   public static boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType paramItemRenderType, ItemStack paramItemStack, IItemRenderer.ItemRendererHelper paramItemRendererHelper) {
/*     */     return ItemRenderer$.MODULE$.shouldUseRenderHelper(paramItemRenderType, paramItemStack, paramItemRendererHelper);
/*     */   }
/*     */   
/*     */   public static boolean handleRenderType(ItemStack paramItemStack, IItemRenderer.ItemRenderType paramItemRenderType) {
/*     */     return ItemRenderer$.MODULE$.handleRenderType(paramItemStack, paramItemRenderType);
/*     */   }
/*     */   
/*     */   public static boolean isFloppy(ItemInfo paramItemInfo) {
/*     */     return ItemRenderer$.MODULE$.isFloppy(paramItemInfo);
/*     */   }
/*     */   
/*     */   public static PrintData.Shape nullShape() {
/*     */     return ItemRenderer$.MODULE$.nullShape();
/*     */   }
/*     */   
/*     */   public static ItemInfo cable() {
/*     */     return ItemRenderer$.MODULE$.cable();
/*     */   }
/*     */   
/*     */   public static ItemInfo print() {
/*     */     return ItemRenderer$.MODULE$.print();
/*     */   }
/*     */   
/*     */   public static ItemInfo lootDisk() {
/*     */     return ItemRenderer$.MODULE$.lootDisk();
/*     */   }
/*     */   
/*     */   public static ItemInfo floppy() {
/*     */     return ItemRenderer$.MODULE$.floppy();
/*     */   }
/*     */   
/*     */   public static ItemInfo drone() {
/*     */     return ItemRenderer$.MODULE$.drone();
/*     */   }
/*     */   
/*     */   public static RenderItem renderItem() {
/*     */     return ItemRenderer$.MODULE$.renderItem();
/*     */   }
/*     */   
/*     */   public final class ItemRenderer$$anonfun$renderItem$1
/*     */     extends AbstractFunction1<Object, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final FontRenderer fontRenderer$1;
/*     */     
/*     */     public ItemRenderer$$anonfun$renderItem$1(FontRenderer fontRenderer$1) {}
/*     */     
/*     */     public final void apply(Object line) {
/*  85 */       this.fontRenderer$1.func_78276_b((String)line, 0, 0, 0);
/*  86 */       GL11.glTranslatef(0.0F, this.fontRenderer$1.field_78288_b, 0.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ItemRenderer$$anonfun$renderItem$2
/*     */     extends AbstractFunction1<PrintData.Shape, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(PrintData.Shape shape) {
/* 139 */       ItemRenderer$.MODULE$.li$cil$oc$client$renderer$item$ItemRenderer$$drawShape(shape);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ItemRenderer$$anonfun$li$cil$oc$client$renderer$item$ItemRenderer$$drawShape$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int color) {
/* 185 */       apply$mcVI$sp(color); } public void apply$mcVI$sp(int color) {
/* 186 */       byte r = (byte)(color >> 16);
/* 187 */       byte g = (byte)(color >> 8);
/* 188 */       byte b = (byte)color;
/* 189 */       GL11.glColor3ub(r, g, b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\ItemRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */