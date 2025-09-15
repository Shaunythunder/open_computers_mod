/*    */ package li.cil.oc.util;
/*    */ @ScalaSignature(bytes = "\006\001\005\025s!B\001\003\021\003Y\021!B\"pY>\024(BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\003D_2|'o\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\017ii!\031!C\0017\005)!\t\\1dWV\tA\004\005\002\022;%\021aD\005\002\004\023:$\bB\002\021\016A\003%A$\001\004CY\006\0347\016\t\005\bE5\021\r\021\"\001\034\003\r\021V\r\032\005\007I5\001\013\021\002\017\002\tI+G\r\t\005\bM5\021\r\021\"\001\034\003\0259%/Z3o\021\031AS\002)A\0059\0051qI]3f]\002BqAK\007C\002\023\0051$A\003Ce><h\016\003\004-\033\001\006I\001H\001\007\005J|wO\034\021\t\0179j!\031!C\0017\005!!\t\\;f\021\031\001T\002)A\0059\005)!\t\\;fA!9!'\004b\001\n\003Y\022A\002)veBdW\r\003\0045\033\001\006I\001H\001\b!V\024\b\017\\3!\021\0351TB1A\005\002m\tAaQ=b]\"1\001(\004Q\001\nq\tQaQ=b]\002BqAO\007C\002\023\0051$A\005MS\036DGo\022:bs\"1A(\004Q\001\nq\t!\002T5hQR<%/Y=!\021\035qTB1A\005\002m\tAa\022:bs\"1\001)\004Q\001\nq\tQa\022:bs\002BqAQ\007C\002\023\0051$\001\003QS:\\\007B\002#\016A\003%A$A\003QS:\\\007\005C\004G\033\t\007I\021A\016\002\t1KW.\032\005\007\0216\001\013\021\002\017\002\0131KW.\032\021\t\017)k!\031!C\0017\0051\021,\0327m_^Da\001T\007!\002\023a\022aB-fY2|w\017\t\005\b\0356\021\r\021\"\001\034\003%a\025n\0325u\0052,X\r\003\004Q\033\001\006I\001H\001\013\031&<\007\016\036\"mk\026\004\003b\002*\016\005\004%\taG\001\b\033\006<WM\034;b\021\031!V\002)A\0059\005AQ*Y4f]R\f\007\005C\004W\033\t\007I\021A\016\002\r=\023\030M\\4f\021\031AV\002)A\0059\0059qJ]1oO\026\004\003b\002.\016\005\004%\taG\001\006/\"LG/\032\005\00796\001\013\021\002\017\002\r]C\027\016^3!\021\035qVB1A\005\002}\013A\001Z=fgV\t\001\rE\002\022C\016L!A\031\n\003\013\005\023(/Y=\021\005\021LW\"A3\013\005\031<\027\001\0027b]\036T\021\001[\001\005U\0064\030-\003\002kK\n11\013\036:j]\036Da\001\\\007!\002\023\001\027!\0023zKN\004\003b\0028\016\005\004%\ta\\\001\nEf|%/\032(b[\026,\022\001\035\t\005cZ\034G$D\001s\025\t\031H/A\005j[6,H/\0312mK*\021QOE\001\013G>dG.Z2uS>t\027BA<s\005\ri\025\r\035\005\007s6\001\013\021\0029\002\025\tLxJ]3OC6,\007\005C\004|\033\t\007I\021\001?\002\r\tLH+[3s+\005i\bcA\tb9!1q0\004Q\001\nu\fqAY=US\026\024\b\005C\004\002\0045!\t!!\002\002\r\tLX*\032;b)\ra\022q\001\005\b\003\023\t\t\0011\001\035\003\021iW\r^1\t\017\0055Q\002\"\001\002\020\0059a-\0338e\tf,G\003BA\t\003/\001B!EA\nG&\031\021Q\003\n\003\r=\003H/[8o\021!\tI\"a\003A\002\005m\021!B:uC\016\\\007\003BA\017\003Wi!!a\b\013\t\005\005\0221E\001\005SR,WN\003\003\002&\005\035\022!C7j]\026\034'/\0314u\025\t\tI#A\002oKRLA!!\f\002 \tI\021\n^3n'R\f7m\033\005\b\003ciA\021AA\032\003\025I7\017R=f)\021\t)$a\017\021\007E\t9$C\002\002:I\021qAQ8pY\026\fg\016\003\005\002\032\005=\002\031AA\016\021\035\ty$\004C\001\003\003\n\001\002Z=f\007>dwN\035\013\0049\005\r\003\002CA\r\003{\001\r!a\007")
/*    */ public final class Color { public static int dyeColor(ItemStack paramItemStack) {
/*    */     return Color$.MODULE$.dyeColor(paramItemStack);
/*    */   }
/*    */   public static boolean isDye(ItemStack paramItemStack) {
/*    */     return Color$.MODULE$.isDye(paramItemStack);
/*    */   }
/*    */   public static Option<String> findDye(ItemStack paramItemStack) {
/*    */     return Color$.MODULE$.findDye(paramItemStack);
/*    */   }
/*    */   public static int byMeta(int paramInt) {
/*    */     return Color$.MODULE$.byMeta(paramInt);
/*    */   }
/*    */   public static int[] byTier() {
/*    */     return Color$.MODULE$.byTier();
/*    */   }
/*    */   public static Map<String, Object> byOreName() {
/*    */     return Color$.MODULE$.byOreName();
/*    */   }
/*    */   public static String[] dyes() {
/*    */     return Color$.MODULE$.dyes();
/*    */   }
/*    */   public static int White() {
/*    */     return Color$.MODULE$.White();
/*    */   }
/*    */   public static int Orange() {
/*    */     return Color$.MODULE$.Orange();
/*    */   }
/*    */   public static int Magenta() {
/*    */     return Color$.MODULE$.Magenta();
/*    */   }
/*    */   public static int LightBlue() {
/*    */     return Color$.MODULE$.LightBlue();
/*    */   }
/*    */   public static int Yellow() {
/*    */     return Color$.MODULE$.Yellow();
/*    */   }
/*    */   public static int Lime() {
/*    */     return Color$.MODULE$.Lime();
/*    */   }
/*    */   public static int Pink() {
/*    */     return Color$.MODULE$.Pink();
/*    */   }
/*    */   public static int Gray() {
/*    */     return Color$.MODULE$.Gray();
/*    */   }
/*    */   public static int LightGray() {
/*    */     return Color$.MODULE$.LightGray();
/*    */   }
/*    */   public static int Cyan() {
/*    */     return Color$.MODULE$.Cyan();
/*    */   }
/*    */   public static int Purple() {
/*    */     return Color$.MODULE$.Purple();
/*    */   }
/*    */   public static int Blue() {
/*    */     return Color$.MODULE$.Blue();
/*    */   }
/*    */   public static int Brown() {
/*    */     return Color$.MODULE$.Brown();
/*    */   }
/*    */   public static int Green() {
/*    */     return Color$.MODULE$.Green();
/*    */   }
/*    */   public static int Red() {
/*    */     return Color$.MODULE$.Red();
/*    */   }
/*    */   public static int Black() {
/*    */     return Color$.MODULE$.Black();
/*    */   }
/*    */   public final class Color$$anonfun$findDye$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 74 */     public final boolean apply(String x$1) { return WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(x$1)).exists((Function1)new Color$$anonfun$findDye$1$$anonfun$apply$1(this)); } public final ItemStack stack$1; public Color$$anonfun$findDye$1(ItemStack stack$1) {} public final class Color$$anonfun$findDye$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack oreStack) { return OreDictionary.itemMatches(this.$outer.stack$1, oreStack, false); }
/*    */       
/*    */       public Color$$anonfun$findDye$1$$anonfun$apply$1(Color$$anonfun$findDye$1 $outer) {} } }
/*    */   public final class Color$$anonfun$dyeColor$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L;
/* 78 */     public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 16711935; } } public final class Color$$anonfun$dyeColor$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(String x$2) { return BoxesRunTime.unboxToInt(Color$.MODULE$.byOreName().apply(x$2)); }
/*    */      }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Color.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */