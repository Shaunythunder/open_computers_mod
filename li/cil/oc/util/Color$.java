/*    */ package li.cil.oc.util;public final class Color$ { public static final Color$ MODULE$; private final int Black; private final int Red; private final int Green; private final int Brown;
/*    */   private final int Blue;
/*    */   private final int Purple;
/*    */   private final int Cyan;
/*    */   private final int LightGray;
/*    */   private final int Gray;
/*    */   
/*    */   public int Black() {
/*  9 */     return this.Black;
/*    */   } private final int Pink; private final int Lime; private final int Yellow; private final int LightBlue; private final int Magenta; private final int Orange; private final int White; private final String[] dyes; private final Map<String, Object> byOreName; private final int[] byTier; public int Red() {
/* 11 */     return this.Red; } public int Green() {
/* 12 */     return this.Green;
/*    */   }
/* 14 */   public int Brown() { return this.Brown; } public int Blue() {
/* 15 */     return this.Blue;
/*    */   }
/* 17 */   public int Purple() { return this.Purple; } public int Cyan() {
/* 18 */     return this.Cyan;
/*    */   }
/* 20 */   public int LightGray() { return this.LightGray; } public int Gray() {
/* 21 */     return this.Gray;
/*    */   }
/* 23 */   public int Pink() { return this.Pink; } public int Lime() {
/* 24 */     return this.Lime;
/*    */   } public int Yellow() {
/* 26 */     return this.Yellow;
/*    */   } public int LightBlue() {
/* 28 */     return this.LightBlue;
/*    */   }
/* 30 */   public int Magenta() { return this.Magenta; }
/* 31 */   public int Orange() { return this.Orange; } public int White() {
/* 32 */     return this.White;
/*    */   } public String[] dyes() {
/* 34 */     return this.dyes;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<String, Object> byOreName() {
/* 52 */     return this.byOreName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int[] byTier() {
/* 70 */     return this.byTier;
/*    */   } public int byMeta(int meta) {
/* 72 */     return BoxesRunTime.unboxToInt(byOreName().apply(dyes()[15 - meta]));
/*    */   }
/* 74 */   public Option<String> findDye(ItemStack stack) { return byOreName().keys().find((Function1)new Color$$anonfun$findDye$1(stack)); } public final class Color$$anonfun$findDye$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack stack$1; public final boolean apply(String x$1) { return scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(x$1)).exists((Function1)new Color$$anonfun$findDye$1$$anonfun$apply$1(this)); } public Color$$anonfun$findDye$1(ItemStack stack$1) {} public final class Color$$anonfun$findDye$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack oreStack) { return OreDictionary.itemMatches(this.$outer.stack$1, oreStack, false); }
/*    */        public Color$$anonfun$findDye$1$$anonfun$apply$1(Color$$anonfun$findDye$1 $outer) {} } } public boolean isDye(ItemStack stack) {
/* 76 */     return findDye(stack).isDefined();
/*    */   }
/* 78 */   public int dyeColor(ItemStack stack) { return BoxesRunTime.unboxToInt(findDye(stack).fold((Function0)new Color$$anonfun$dyeColor$1(), (Function1)new Color$$anonfun$dyeColor$2())); } public final class Color$$anonfun$dyeColor$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 16711935; } } public final class Color$$anonfun$dyeColor$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(String x$2) { return BoxesRunTime.unboxToInt(Color$.MODULE$.byOreName().apply(x$2)); } } private Color$() {
/* 79 */     MODULE$ = this;
/*    */     this.Black = 4473924;
/*    */     this.Red = 11743532;
/*    */     this.Green = 3381521;
/*    */     this.Brown = 5320730;
/*    */     this.Blue = 6711039;
/*    */     this.Purple = 8073150;
/*    */     this.Cyan = 6750207;
/*    */     this.LightGray = 11250603;
/*    */     this.Gray = 6710886;
/*    */     this.Pink = 14188952;
/*    */     this.Lime = 6750054;
/*    */     this.Yellow = 16777062;
/*    */     this.LightBlue = 11184895;
/*    */     this.Magenta = 12801229;
/*    */     this.Orange = 15435844;
/*    */     this.White = 15790320;
/*    */     (new String[16])[0] = "dyeBlack";
/*    */     (new String[16])[1] = "dyeRed";
/*    */     (new String[16])[2] = "dyeGreen";
/*    */     (new String[16])[3] = "dyeBrown";
/*    */     (new String[16])[4] = "dyeBlue";
/*    */     (new String[16])[5] = "dyePurple";
/*    */     (new String[16])[6] = "dyeCyan";
/*    */     (new String[16])[7] = "dyeLightGray";
/*    */     (new String[16])[8] = "dyeGray";
/*    */     (new String[16])[9] = "dyePink";
/*    */     (new String[16])[10] = "dyeLime";
/*    */     (new String[16])[11] = "dyeYellow";
/*    */     (new String[16])[12] = "dyeLightBlue";
/*    */     (new String[16])[13] = "dyeMagenta";
/*    */     (new String[16])[14] = "dyeOrange";
/*    */     (new String[16])[15] = "dyeWhite";
/*    */     this.dyes = new String[16];
/*    */     (new scala.Tuple2[16])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeBlack"), BoxesRunTime.boxToInteger(Black()));
/*    */     (new scala.Tuple2[16])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeRed"), BoxesRunTime.boxToInteger(Red()));
/*    */     (new scala.Tuple2[16])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeGreen"), BoxesRunTime.boxToInteger(Green()));
/*    */     (new scala.Tuple2[16])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeBrown"), BoxesRunTime.boxToInteger(Brown()));
/*    */     (new scala.Tuple2[16])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeBlue"), BoxesRunTime.boxToInteger(Blue()));
/*    */     (new scala.Tuple2[16])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyePurple"), BoxesRunTime.boxToInteger(Purple()));
/*    */     (new scala.Tuple2[16])[6] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeCyan"), BoxesRunTime.boxToInteger(Cyan()));
/*    */     (new scala.Tuple2[16])[7] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeLightGray"), BoxesRunTime.boxToInteger(LightGray()));
/*    */     (new scala.Tuple2[16])[8] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeGray"), BoxesRunTime.boxToInteger(Gray()));
/*    */     (new scala.Tuple2[16])[9] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyePink"), BoxesRunTime.boxToInteger(Pink()));
/*    */     (new scala.Tuple2[16])[10] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeLime"), BoxesRunTime.boxToInteger(Lime()));
/*    */     (new scala.Tuple2[16])[11] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeYellow"), BoxesRunTime.boxToInteger(Yellow()));
/*    */     (new scala.Tuple2[16])[12] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeLightBlue"), BoxesRunTime.boxToInteger(LightBlue()));
/*    */     (new scala.Tuple2[16])[13] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeMagenta"), BoxesRunTime.boxToInteger(Magenta()));
/*    */     (new scala.Tuple2[16])[14] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeOrange"), BoxesRunTime.boxToInteger(Orange()));
/*    */     (new scala.Tuple2[16])[15] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dyeWhite"), BoxesRunTime.boxToInteger(White()));
/*    */     this.byOreName = (Map<String, Object>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[16]));
/*    */     this.byTier = new int[] { LightGray(), Yellow(), Cyan(), Magenta() };
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Color$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */