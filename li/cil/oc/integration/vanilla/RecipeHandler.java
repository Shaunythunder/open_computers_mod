/*    */ package li.cil.oc.integration.vanilla;
/*    */ @ScalaSignature(bytes = "\006\001\031;Q!\001\002\t\0025\tQBU3dSB,\007*\0318eY\026\024(BA\002\005\003\0351\030M\\5mY\006T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\004*fG&\004X\rS1oI2,'o\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\013qyA\021A\017\002\t%t\027\016\036\013\002=A\0211cH\005\003AQ\021A!\0268ji\")!e\004C\001G\005y\021\r\0323TQ\006\004X\r\032*fG&\004X\rF\002\037IABQ!J\021A\002\031\naa\\;uaV$\bCA\024/\033\005A#BA\025+\003\021IG/Z7\013\005-b\023!C7j]\026\034'/\0314u\025\005i\023a\0018fi&\021q\006\013\002\n\023R,Wn\025;bG.DQ!M\021A\002I\naA]3dSB,\007CA\032;\033\005!$BA\0337\003\031\031wN\0344jO*\021q\007O\001\tif\004Xm]1gK*\t\021(A\002d_6L!a\017\033\003\r\r{gNZ5h\021\025it\002\"\001?\003I\tG\rZ*iCB,G.Z:t%\026\034\027\016]3\025\007yy\004\tC\003&y\001\007a\005C\0032y\001\007!\007C\003C\037\021\0051)\001\tbI\0224UO\0358bG\026\024VmY5qKR\031a\004R#\t\013\025\n\005\031\001\024\t\013E\n\005\031\001\032")
/*    */ public final class RecipeHandler { public static void addFurnaceRecipe(ItemStack paramItemStack, Config paramConfig) {
/*    */     RecipeHandler$.MODULE$.addFurnaceRecipe(paramItemStack, paramConfig);
/*    */   }
/*    */   public static void addShapelessRecipe(ItemStack paramItemStack, Config paramConfig) {
/*    */     RecipeHandler$.MODULE$.addShapelessRecipe(paramItemStack, paramConfig);
/*    */   }
/*    */   
/*    */   public static void addShapedRecipe(ItemStack paramItemStack, Config paramConfig) {
/*    */     RecipeHandler$.MODULE$.addShapedRecipe(paramItemStack, paramConfig);
/*    */   }
/*    */   
/*    */   public static void init() {
/*    */     RecipeHandler$.MODULE$.init();
/*    */   }
/*    */   
/* 18 */   public final class RecipeHandler$$anonfun$init$1 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addShapedRecipe(output, recipe); } public static final long serialVersionUID = 0L; } public final class RecipeHandler$$anonfun$init$2 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) {
/* 19 */       RecipeHandler$.MODULE$.addShapelessRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$3 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) {
/* 20 */       RecipeHandler$.MODULE$.addFurnaceRecipe(output, recipe);
/*    */     } }
/*    */   public final class RecipeHandler$$anonfun$1 extends AbstractFunction1<Object, Buffer<Object>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final Buffer<Object> apply(Object x0$1) {
/* 24 */       Object object = x0$1;
/* 25 */       if (object instanceof List) { List list = (List)object; return (Buffer)WrapAsScala$.MODULE$.asScalaBuffer(list).map((Function1)new RecipeHandler$$anonfun$1$$anonfun$apply$1(this), Buffer$.MODULE$.canBuildFrom()); }
/* 26 */        (new String[2])[0] = "Invalid row entry for shaped recipe (not a list: "; (new String[2])[1] = ")."; throw new Recipes.RecipeException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { object })));
/*    */     } public final class RecipeHandler$$anonfun$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final Object apply(Object entry) {
/*    */         return Recipes$.MODULE$.parseIngredient(entry);
/*    */       }
/*    */       public RecipeHandler$$anonfun$1$$anonfun$apply$1(RecipeHandler$$anonfun$1 $outer) {} } }
/*    */   public final class RecipeHandler$$anonfun$addShapedRecipe$1 extends AbstractFunction1<Buffer<Object>, ArrayBuffer<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final IntRef number$1; private final ObjectRef shape$1; private final ArrayBuffer input$1;
/*    */     public RecipeHandler$$anonfun$addShapedRecipe$1(IntRef number$1, ObjectRef shape$1, ArrayBuffer input$1) {}
/* 34 */     public final ArrayBuffer<Object> apply(Buffer row) { Tuple2 tuple2 = (Tuple2)row.foldLeft(new Tuple2(new StringBuilder(), package$.MODULE$.Iterable().empty()), (Function2)new RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2(this)); if (tuple2 != null) { StringBuilder pattern = (StringBuilder)tuple2._1(); Iterable ingredients = (Iterable)tuple2._2(); Tuple2 tuple22 = new Tuple2(pattern, ingredients), tuple21 = tuple22; StringBuilder stringBuilder1 = (StringBuilder)tuple21._1(); Iterable iterable1 = (Iterable)tuple21._2();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 43 */         ((ArrayBuffer)this.shape$1.elem).$plus$eq(stringBuilder1.toString());
/* 44 */         return this.input$1.$plus$plus$eq((TraversableOnce)iterable1); }
/*    */        throw new MatchError(tuple2); } public final class RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2 extends AbstractFunction2<Tuple2<StringBuilder, Iterable<Object>>, Object, Tuple2<StringBuilder, Iterable<Object>>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2(RecipeHandler$$anonfun$addShapedRecipe$1 $outer) {} public final Tuple2<StringBuilder, Iterable<Object>> apply(Tuple2 acc, Object ingredient) { Tuple2 tuple2 = acc; if (tuple2 != null) { boolean bool; Tuple2<StringBuilder, Iterable<Object>> tuple23; StringBuilder pattern = (StringBuilder)tuple2._1(); Iterable ingredients = (Iterable)tuple2._2(); Tuple2 tuple22 = new Tuple2(pattern, ingredients), tuple21 = tuple22; StringBuilder stringBuilder1 = (StringBuilder)tuple21._1(); Iterable iterable1 = (Iterable)tuple21._2(); Object object = ingredient; if (object instanceof ItemStack) { bool = true; }
/*    */           else if (object instanceof String) { bool = true; }
/*    */           else { bool = false; }
/*    */            if (bool) { this.$outer.number$1.elem++; tuple23 = new Tuple2(stringBuilder1.append((char)(97 + this.$outer.number$1.elem)), iterable1.$plus$plus((GenTraversableOnce)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray(new Object[] { BoxesRunTime.boxToCharacter((char)(97 + this.$outer.number$1.elem)), ingredient }, )), Iterable$.MODULE$.canBuildFrom())); }
/*    */           else { tuple23 = new Tuple2(stringBuilder1.append(' '), iterable1); }
/*    */            return tuple23; }
/*    */          throw new MatchError(tuple2); } } } public final class RecipeHandler$$anonfun$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 53 */     public final Object apply(Object entry) { return Recipes$.MODULE$.parseIngredient(entry); }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class RecipeHandler$$anonfun$addFurnaceRecipe$1
/*    */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     private final ItemStack output$1;
/*    */ 
/*    */     
/*    */     public RecipeHandler$$anonfun$addFurnaceRecipe$1(ItemStack output$1) {}
/*    */ 
/*    */     
/*    */     public final void apply(ItemStack stack) {
/* 72 */       FurnaceRecipes.func_77602_a().func_151394_a(stack, this.output$1, 0.0F);
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\RecipeHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */