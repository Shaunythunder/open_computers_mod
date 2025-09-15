/*     */ package li.cil.oc.common.recipe;
/*     */ 
/*     */ import com.typesafe.config.Config;
/*     */ import com.typesafe.config.ConfigIncluder;
/*     */ import com.typesafe.config.ConfigValueType;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.LinkedHashMap;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tEs!B\001\003\021\003i\021a\002*fG&\004Xm\035\006\003\007\021\taA]3dSB,'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\017I+7-\0339fgN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001b\002\017\020\005\004%\t!H\001\005Y&\034H/F\001\037!\021yBE\n\031\016\003\001R!!\t\022\002\0175,H/\0312mK*\0211\005F\001\013G>dG.Z2uS>t\027BA\023!\0055a\025N\\6fI\"\0137\017['baB\021qEL\007\002Q)\021\021FK\001\005SR,WN\003\002,Y\005IQ.\0338fGJ\fg\r\036\006\002[\005\031a.\032;\n\005=B#!C%uK6\034F/Y2l!\t\tDG\004\002\024e%\0211\007F\001\007!J,G-\0324\n\005U2$AB*ue&twM\003\0024)!1\001h\004Q\001\ny\tQ\001\\5ti\002BqAO\bC\002\023\0051(\001\bpe\026$\025n\031;F]R\024\030.Z:\026\003q\002Ba\b\0231M!1ah\004Q\001\nq\nqb\034:f\t&\034G/\0228ue&,7\017\t\005\b\001>\001\r\021\"\001B\003%A\027\rZ#se>\0248/F\001C!\t\0312)\003\002E)\t9!i\\8mK\006t\007b\002$\020\001\004%\taR\001\016Q\006$WI\035:peN|F%Z9\025\005![\005CA\nJ\023\tQEC\001\003V]&$\bb\002'F\003\003\005\rAQ\001\004q\022\n\004B\002(\020A\003&!)\001\006iC\022,%O]8sg\002Bq\001U\bC\002\023\005\021+\001\bsK\016L\007/\032%b]\022dWM]:\026\003I\003Ba\b\0231'B)1\003\026\024W\021&\021Q\013\006\002\n\rVt7\r^5p]J\002\"a\0260\016\003aS!!\027.\002\r\r|gNZ5h\025\tYF,\001\005usB,7/\0314f\025\005i\026aA2p[&\021q\f\027\002\007\007>tg-[4\t\r\005|\001\025!\003S\003=\021XmY5qK\"\013g\016\0327feN\004\003\"B2\020\t\003!\027!\006:fO&\034H/\032:SK\016L\007/\032%b]\022dWM\035\013\004\021\026<\007\"\0024c\001\004\001\024\001\0028b[\026DQa\0012A\002MCQ![\b\005\002)\f\001\"\0313e\0052|7m\033\013\005WF\034H\017\005\002m_6\tQN\003\002oU\005)!\r\\8dW&\021\001/\034\002\006\0052|7m\033\005\006e\"\004\ra[\001\tS:\034H/\0318dK\")a\r\033a\001a!)Q\017\033a\001m\0069qN]3ES\016$\bcA\nxa%\021\001\020\006\002\013yI,\007/Z1uK\022t\004\"\002>\020\t\003Y\030AC1eIN+(-\023;f[V\021Ap \013\b{\006e\021QDA\020!\tqx\020\004\001\005\017\005\005\021P1\001\002\004\t\tA+\005\003\002\006\005-\001cA\n\002\b%\031\021\021\002\013\003\0179{G\017[5oOB!\021QBA\013\033\t\tyA\003\003\002\022\005M\021A\002;sC&$8O\003\002*\t%!\021qCA\b\005!!U\r\\3hCR,\007BBA\016s\002\007Q0\001\005eK2,w-\031;f\021\0251\027\0201\0011\021\025)\030\0201\001w\021\035\t\031c\004C\001\003K\tq!\0313e\023R,W\016\006\005\002(\0055\022qFA\031!\r9\023\021F\005\004\003WA#\001B%uK6DqA]A\021\001\004\t9\003\003\004g\003C\001\r\001\r\005\007k\006\005\002\031\001<\t\017\005Ur\002\"\001\0028\005A\021\r\0323Ti\006\0347\016F\004'\003s\ti$a\020\t\017\005m\0221\007a\001M\005)1\017^1dW\"1a-a\rA\002ABa!^A\032\001\0041\bbBA\"\037\021\005\021QI\001\nC\022$'+Z2ja\026$R\001SA$\003\023Bq!a\017\002B\001\007a\005\003\004g\003\003\002\r\001\r\005\b\003\033zA\021BA(\003!\021XmZ5ti\026\024H#\002%\002R\005M\003BB\025\002L\001\007a\005C\004\002V\005-\003\031\001<\002\0139\fW.Z:\t\017\005es\002\"\001\002\\\005!\021N\\5u)\005A\005bBA\"\037\021%\021q\f\013\b\021\006\005\024QMA4\021\035\t\031'!\030A\002\031\naa\\;uaV$\bBB\002\002^\001\007a\013\003\004g\003;\002\r\001\r\005\b\003WzA\021AA7\003-!(/_$fi\016{WO\034;\025\t\005=\024Q\017\t\004'\005E\024bAA:)\t\031\021J\034;\t\r\r\tI\0071\001W\021\035\tIh\004C\001\003w\nq\002]1sg\026Len\032:fI&,g\016\036\013\004%\005u\004bBA@\003o\002\rAE\001\006K:$(/\037\005\b\003\007{A\021AAC\003Q\001\030M]:f\r2,\030\016Z%oOJ,G-[3oiR!\021qQAO!\025\031\022\021RAG\023\r\tY\t\006\002\007\037B$\030n\0348\021\t\005=\025\021T\007\003\003#SA!a%\002\026\0061a\r\\;jINT1!a&-\0039i\027N\\3de\0064GOZ8sO\026LA!a'\002\022\nQa\t\\;jIN#\030mY6\t\017\005}\024\021\021a\001-\"9\021\021U\b\005\n\005\r\026\001\0034j]\022LE/Z7\025\t\005\025\026Q\026\t\006'\005%\025q\025\t\004'\005%\026bAAV)\t\031\021I\\=\t\r\031\fy\n1\0011\021\035\t\tl\004C\005\003g\013\021BZ5oI\ncwnY6\025\t\005\025\026Q\027\005\007M\006=\006\031\001\031\t\017\005ev\002\"\003\002<\006Ar-\032;PE*,7\r^,ji\"|W\017\036$bY2\024\027mY6\025\r\005u\026qZAp!\025\031\022\021RA`!\021\t\t-a3\016\005\005\r'\002BAc\003\017\fA\001\\1oO*\021\021\021Z\001\005U\0064\030-\003\003\002N\006\r'AB(cU\026\034G\017\003\005\002R\006]\006\031AAj\003!\021XmZ5tiJL\b\003BAk\0037l!!a6\013\007\005e'&\001\003vi&d\027\002BAo\003/\024!CU3hSN$(/\037(b[\026\034\b/Y2fI\"9\021\021]A\\\001\004\001\024aA6fs\"9\021Q]\b\005\n\005\035\030A\003;ss\036+G\017V=qKR!\021\021^Aw!\021\t\t-a;\n\007U\n\031\r\003\004\004\003G\004\rA\026\005\b\003c|A\021BAz\003!!(/_$fi&#G\003BA8\003kD\001\"a>\002p\002\007\021\021`\001\013S:<'/\0323jK:$\bCBA~\003\024\"#\004\002\002~*!\021\021\\Ad\023\021\021\t!!@\003\0075\013\007\017C\004\003\006=!IAa\002\002\037Y\fG.\0333bi\026\024En\\2l\023\022$2a\033B\005\021!\021YAa\001A\002\t5\021AA5e!\021\t\tMa\004\n\t\tE\0211\031\002\007\035Vl'-\032:\t\017\tUq\002\"\003\003\030\005qa/\0317jI\006$X-\023;f[&#G\003BA\024\0053A\001Ba\003\003\024\001\007!Q\002\005\b\005;yA\021\002B\020\003\021A\027\016Z3\025\007!\023\t\003C\004\003$\tm\001\031\001\024\002\013Y\fG.^3\007\r\t\035r\002\001B\025\005=\021VmY5qK\026C8-\0329uS>t7\003\002B\023\005W\001BA!\f\003>9!!q\006B\035\035\021\021\tDa\016\016\005\tM\"b\001B\033\031\0051AH]8pizJ\021!F\005\004\005w!\022a\0029bG.\fw-Z\005\005\005\021\tE\001\tSk:$\030.\\3Fq\016,\007\017^5p]*\031!1\b\013\t\025\t\025#Q\005B\001B\003%\001'A\004nKN\034\030mZ3\t\017e\021)\003\"\001\003JQ!!1\nB(!\021\021iE!\n\016\003=AqA!\022\003H\001\007\001\007")
/*     */ public final class Recipes {
/*     */   public static Option<FluidStack> parseFluidIngredient(Config paramConfig) {
/*     */     return Recipes$.MODULE$.parseFluidIngredient(paramConfig);
/*     */   }
/*     */   
/*     */   public static Object parseIngredient(Object paramObject) {
/*     */     return Recipes$.MODULE$.parseIngredient(paramObject);
/*     */   }
/*     */   
/*     */   public static int tryGetCount(Config paramConfig) {
/*     */     return Recipes$.MODULE$.tryGetCount(paramConfig);
/*     */   }
/*     */   
/*     */   public static void init() {
/*     */     Recipes$.MODULE$.init();
/*     */   }
/*     */   
/*     */   public static void addRecipe(ItemStack paramItemStack, String paramString) {
/*     */     Recipes$.MODULE$.addRecipe(paramItemStack, paramString);
/*     */   }
/*     */   
/*     */   public static ItemStack addStack(ItemStack paramItemStack, String paramString, Seq<String> paramSeq) {
/*     */     return Recipes$.MODULE$.addStack(paramItemStack, paramString, paramSeq);
/*     */   }
/*     */   
/*     */   public static Item addItem(Item paramItem, String paramString, Seq<String> paramSeq) {
/*     */     return Recipes$.MODULE$.addItem(paramItem, paramString, paramSeq);
/*     */   }
/*     */   
/*     */   public static <T extends li.cil.oc.common.item.traits.Delegate> T addSubItem(T paramT, String paramString, Seq<String> paramSeq) {
/*     */     return Recipes$.MODULE$.addSubItem(paramT, paramString, paramSeq);
/*     */   }
/*     */   
/*     */   public static Block addBlock(Block paramBlock, String paramString, Seq<String> paramSeq) {
/*     */     return Recipes$.MODULE$.addBlock(paramBlock, paramString, paramSeq);
/*     */   }
/*     */   
/*     */   public static void registerRecipeHandler(String paramString, Function2<ItemStack, Config, BoxedUnit> paramFunction2) {
/*     */     Recipes$.MODULE$.registerRecipeHandler(paramString, paramFunction2);
/*     */   }
/*     */   
/*     */   public static LinkedHashMap<String, Function2<ItemStack, Config, BoxedUnit>> recipeHandlers() {
/*     */     return Recipes$.MODULE$.recipeHandlers();
/*     */   }
/*     */   
/*     */   public static void hadErrors_$eq(boolean paramBoolean) {
/*     */     Recipes$.MODULE$.hadErrors_$eq(paramBoolean);
/*     */   }
/*     */   
/*     */   public static boolean hadErrors() {
/*     */     return Recipes$.MODULE$.hadErrors();
/*     */   }
/*     */   
/*     */   public static LinkedHashMap<String, ItemStack> oreDictEntries() {
/*     */     return Recipes$.MODULE$.oreDictEntries();
/*     */   }
/*     */   
/*     */   public static LinkedHashMap<ItemStack, String> list() {
/*     */     return Recipes$.MODULE$.list();
/*     */   }
/*     */   
/*  84 */   public final class Recipes$$anonfun$register$1 extends AbstractFunction1<String, Object> implements Serializable { public final boolean apply(String name) { return !(name == null); } public static final long serialVersionUID = 0L; } public final class Recipes$$anonfun$register$2 extends AbstractFunction1<String, LinkedHashMap<String, ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack item$1; public Recipes$$anonfun$register$2(ItemStack item$1) {} public final LinkedHashMap<String, ItemStack> apply(String name) {
/*  85 */       return Recipes$.MODULE$.oreDictEntries().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), this.item$1));
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class Recipes$$anonfun$init$1
/*     */     extends AbstractFunction1<Tuple2<String, ItemStack>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/*  96 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Recipes$$anonfun$init$2 extends AbstractFunction1<Tuple2<String, ItemStack>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String name = (String)tuple2._1(); ItemStack stack = (ItemStack)tuple2._2();
/*     */         
/*  98 */         OreDictionary.registerOre(name, stack); BoxedUnit boxedUnit = OreDictionary.getOres(name).contains(stack) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         return; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class Recipes$$anonfun$init$3 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final File recipeDirectory$1;
/*     */     
/*     */     public Recipes$$anonfun$init$3(File recipeDirectory$1) {}
/*     */     
/*     */     public final void apply(String recipeSet) {
/* 112 */       (new String[2])[0] = "/assets/opencomputers/recipes/"; (new String[2])[1] = ".recipes"; (new String[2])[0] = ""; (new String[2])[1] = ".recipes"; FileUtils.copyURLToFile(Recipes$.MODULE$.getClass().getResource((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { recipeSet }, ))), new File(this.recipeDirectory$1, (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { recipeSet }))));
/*     */     } }
/*     */   public final class Recipes$$anon$1 implements ConfigIncluder, ConfigIncluderFile { private ConfigIncluder fallback; private final File userRecipes$1; private final ObjectRef config$lzy$1; private final VolatileByteRef bitmap$0$1;
/*     */     public Recipes$$anon$1(File userRecipes$1, ObjectRef config$lzy$1, VolatileByteRef bitmap$0$1) {}
/*     */     
/* 117 */     private ConfigIncluder fallback() { return this.fallback; } private void fallback_$eq(ConfigIncluder x$1) { this.fallback = x$1; }
/*     */     
/*     */     public Recipes$$anon$1 withFallback(ConfigIncluder fallback) {
/* 120 */       fallback_$eq(fallback);
/* 121 */       return this;
/*     */     }
/*     */     public ConfigObject include(ConfigIncludeContext context, String what) {
/* 124 */       return fallback().include(context, what);
/*     */     }
/*     */     public ConfigObject includeFile(ConfigIncludeContext context, File what) {
/* 127 */       FileReader in = what.isAbsolute() ? new FileReader(what) : new FileReader(new File(this.userRecipes$1.getParentFile(), what.getPath()));
/* 128 */       Config result = ConfigFactory.parseReader(in, Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$config$1(this.userRecipes$1, this.config$lzy$1, this.bitmap$0$1));
/* 129 */       in.close();
/* 130 */       return result.root();
/*     */     } }
/*     */   
/*     */   public final class Recipes$$anonfun$init$4 extends AbstractFunction1<Tuple2<ItemStack, String>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/* 136 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Recipes$$anonfun$init$5 extends AbstractFunction1<Tuple2<ItemStack, String>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Config recipes$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); String name = (String)tuple2._2();
/*     */         
/* 138 */         ConfigValue value = this.recipes$1.getValue(name);
/* 139 */         ConfigValueType configValueType = value.valueType();
/* 140 */         if (ConfigValueType.OBJECT.equals(configValueType)) {
/* 141 */           (new String[2])[0] = "'"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(stack, this.recipes$1.getConfig(name), (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { name }))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/* 142 */         } else if (ConfigValueType.BOOLEAN.equals(configValueType)) {
/*     */ 
/*     */           
/* 145 */           Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$hide(stack); BoxedUnit boxedUnit1 = BoxesRunTime.unboxToBoolean(value.unwrapped()) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         } else {
/*     */           
/* 148 */           (new String[2])[0] = "Failed adding recipe for '"; (new String[2])[1] = "', you will not be able to craft this item. The error was: Invalid value for recipe."; OpenComputers$.MODULE$.log().error((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { name })));
/* 149 */           Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*     */         } 
/*     */ 
/*     */         
/* 153 */         (new String[2])[0] = "No recipe for '"; (new String[2])[1] = "', you will not be able to craft this item. To suppress this warning, disable the recipe (assign `false` to it)."; OpenComputers$.MODULE$.log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { name })));
/* 154 */         Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = this.recipes$1.hasPath(name) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         return; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public Recipes$$anonfun$init$5(Config recipes$1) {} }
/*     */   public final class Recipes$$anonfun$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack apply(Tuple2 x$3) {
/* 161 */       return (ItemStack)x$3._1();
/*     */     } } public final class Recipes$$anonfun$init$6 extends AbstractFunction1<Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer lootStacks$1; public Recipes$$anonfun$init$6(ArrayBuffer lootStacks$1) {} public final void apply(Config recipe) {
/* 163 */       String name = recipe.getString("name");
/* 164 */       Option option = this.lootStacks$1.find((Function1)new Recipes$$anonfun$init$6$$anonfun$2(this, name));
/* 165 */       if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); (new String[2])[0] = "loot disk '"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(stack, recipe, (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { name }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 167 */       { (new String[2])[0] = "Failed adding recipe for loot disk '"; (new String[2])[1] = "': No such global loot disk."; OpenComputers$.MODULE$.log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { name })));
/* 168 */         Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } public final class Recipes$$anonfun$init$6$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final String name$1; public final boolean apply(ItemStack s) {
/*     */         String str = this.name$1;
/*     */         if (s.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lootFactory").toString()) == null) {
/*     */           s.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lootFactory").toString());
/*     */           if (str != null);
/*     */         } else if (s.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lootFactory").toString()).equals(str)) {
/*     */         
/*     */         } 
/*     */       } public Recipes$$anonfun$init$6$$anonfun$2(Recipes$$anonfun$init$6 $outer, String name$1) {} } } public final class Recipes$$anonfun$init$7 extends AbstractFunction1<Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final void apply(Config recipe) {
/* 181 */       Object result = recipe.getValue("result").unwrapped();
/* 182 */       Object object1 = Recipes$.MODULE$.parseIngredient(result);
/* 183 */       if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; (new String[2])[0] = "'"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(itemStack, recipe, (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { result }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 185 */       { (new String[2])[0] = "Failed adding generic recipe for '"; (new String[2])[1] = "': Invalid output (make sure it's not an OreDictionary name)."; OpenComputers$.MODULE$.log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { result })));
/* 186 */         Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Recipes$$anonfun$init$8
/*     */     extends AbstractFunction1<String, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemInfo floppy$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Recipes$$anonfun$init$8(ItemInfo floppy$1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(String dye) {
/* 222 */       ItemStack result = this.floppy$1.createItemStack(1);
/* 223 */       NBTTagCompound tag = new NBTTagCompound();
/* 224 */       tag.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("color").toString(), Predef$.MODULE$.refArrayOps((Object[])Color$.MODULE$.dyes()).indexOf(dye));
/* 225 */       result.func_77982_d(tag);
/* 226 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(result, (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { this.floppy$1.createItemStack(1), dye })));
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
/*     */   public final class Recipes$$anonfun$init$9
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Object>
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
/*     */     public final boolean apply(Tuple2 check$ifrefutable$3)
/*     */     {
/*     */       boolean bool;
/* 260 */       Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Recipes$$anonfun$init$10 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ItemInfo chameliumBlock$1; public final void apply(Tuple2 x$4) { Tuple2 tuple2 = x$4; if (tuple2 != null) { String dye = (String)tuple2._1(); int meta = tuple2._2$mcI$sp();
/* 261 */         ItemStack result = this.chameliumBlock$1.createItemStack(1);
/* 262 */         result.func_77964_b(meta);
/* 263 */         ItemStack input = this.chameliumBlock$1.createItemStack(1);
/* 264 */         input.func_77964_b(32767);
/* 265 */         GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 266 */               result, (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] {
/* 267 */                   input, dye })));
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */ 
/*     */     
/*     */     public Recipes$$anonfun$init$10(ItemInfo chameliumBlock$1) {} }
/*     */ 
/*     */   
/*     */   public final class Recipes$$anonfun$init$11 extends AbstractFunction1<Block, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemInfo print$1;
/*     */     private final ItemStack beaconPrint$1;
/*     */     
/*     */     public Recipes$$anonfun$init$11(ItemInfo print$1, ItemStack beaconPrint$1) {}
/*     */     
/*     */     public final void apply(Block block) {
/* 285 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 286 */             this.beaconPrint$1, (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] {
/* 287 */                 this.print$1.createItemStack(1), new ItemStack(block)
/*     */               })));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Recipes$$anonfun$init$12
/*     */     extends AbstractFunction1<ItemInfo, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final void apply(ItemInfo hdd) {
/* 301 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(hdd.createItemStack(1), (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { hdd.createItemStack(1) })));
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
/*     */   public final class Recipes$$anonfun$findItem$1
/*     */     extends AbstractFunction0<Option<Object>>
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
/*     */     public final String name$2;
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
/*     */     public final Option<Object> apply() {
/* 431 */       return WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)Item.field_150901_e).find((Function1)new Recipes$$anonfun$findItem$1$$anonfun$apply$1(this));
/*     */     } public Recipes$$anonfun$findItem$1(String name$2) {} public final class Recipes$$anonfun$findItem$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Object x0$1) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_2
/*     */         //   2: aload_2
/*     */         //   3: instanceof net/minecraft/item/Item
/*     */         //   6: ifeq -> 110
/*     */         //   9: aload_2
/*     */         //   10: checkcast net/minecraft/item/Item
/*     */         //   13: astore_3
/*     */         //   14: aload_3
/*     */         //   15: invokevirtual func_77658_a : ()Ljava/lang/String;
/*     */         //   18: aload_0
/*     */         //   19: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1;
/*     */         //   22: getfield name$2 : Ljava/lang/String;
/*     */         //   25: astore #5
/*     */         //   27: dup
/*     */         //   28: ifnonnull -> 40
/*     */         //   31: pop
/*     */         //   32: aload #5
/*     */         //   34: ifnull -> 100
/*     */         //   37: goto -> 48
/*     */         //   40: aload #5
/*     */         //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   45: ifne -> 100
/*     */         //   48: aload_3
/*     */         //   49: invokevirtual func_77658_a : ()Ljava/lang/String;
/*     */         //   52: new scala/collection/mutable/StringBuilder
/*     */         //   55: dup
/*     */         //   56: invokespecial <init> : ()V
/*     */         //   59: ldc 'item.'
/*     */         //   61: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   64: aload_0
/*     */         //   65: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1;
/*     */         //   68: getfield name$2 : Ljava/lang/String;
/*     */         //   71: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   77: astore #6
/*     */         //   79: dup
/*     */         //   80: ifnonnull -> 92
/*     */         //   83: pop
/*     */         //   84: aload #6
/*     */         //   86: ifnull -> 100
/*     */         //   89: goto -> 104
/*     */         //   92: aload #6
/*     */         //   94: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   97: ifeq -> 104
/*     */         //   100: iconst_1
/*     */         //   101: goto -> 105
/*     */         //   104: iconst_0
/*     */         //   105: istore #4
/*     */         //   107: goto -> 113
/*     */         //   110: iconst_0
/*     */         //   111: istore #4
/*     */         //   113: iload #4
/*     */         //   115: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #431	-> 0
/*     */         //   #432	-> 2
/*     */         //   #433	-> 110
/*     */         //   #431	-> 113
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	116	0	this	Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1$$anonfun$apply$1;
/*     */         //   0	116	1	x0$1	Ljava/lang/Object;
/*     */       } public Recipes$$anonfun$findItem$1$$anonfun$apply$1(Recipes$$anonfun$findItem$1 $outer) {} } } public final class Recipes$$anonfun$findBlock$1 extends AbstractFunction0<Option<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final String name$3;
/*     */     public final Option<Object> apply() {
/* 436 */       return WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)Block.field_149771_c).find((Function1)new Recipes$$anonfun$findBlock$1$$anonfun$apply$2(this));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Recipes$$anonfun$findBlock$1(String name$3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final class Recipes$$anonfun$findBlock$1$$anonfun$apply$2
/*     */       extends AbstractFunction1<Object, Object>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public final boolean apply(Object x0$2) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_2
/*     */         //   2: aload_2
/*     */         //   3: instanceof net/minecraft/block/Block
/*     */         //   6: ifeq -> 110
/*     */         //   9: aload_2
/*     */         //   10: checkcast net/minecraft/block/Block
/*     */         //   13: astore_3
/*     */         //   14: aload_3
/*     */         //   15: invokevirtual func_149739_a : ()Ljava/lang/String;
/*     */         //   18: aload_0
/*     */         //   19: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1;
/*     */         //   22: getfield name$3 : Ljava/lang/String;
/*     */         //   25: astore #5
/*     */         //   27: dup
/*     */         //   28: ifnonnull -> 40
/*     */         //   31: pop
/*     */         //   32: aload #5
/*     */         //   34: ifnull -> 100
/*     */         //   37: goto -> 48
/*     */         //   40: aload #5
/*     */         //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   45: ifne -> 100
/*     */         //   48: aload_3
/*     */         //   49: invokevirtual func_149739_a : ()Ljava/lang/String;
/*     */         //   52: new scala/collection/mutable/StringBuilder
/*     */         //   55: dup
/*     */         //   56: invokespecial <init> : ()V
/*     */         //   59: ldc 'tile.'
/*     */         //   61: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   64: aload_0
/*     */         //   65: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1;
/*     */         //   68: getfield name$3 : Ljava/lang/String;
/*     */         //   71: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   77: astore #6
/*     */         //   79: dup
/*     */         //   80: ifnonnull -> 92
/*     */         //   83: pop
/*     */         //   84: aload #6
/*     */         //   86: ifnull -> 100
/*     */         //   89: goto -> 104
/*     */         //   92: aload #6
/*     */         //   94: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   97: ifeq -> 104
/*     */         //   100: iconst_1
/*     */         //   101: goto -> 105
/*     */         //   104: iconst_0
/*     */         //   105: istore #4
/*     */         //   107: goto -> 113
/*     */         //   110: iconst_0
/*     */         //   111: istore #4
/*     */         //   113: iload #4
/*     */         //   115: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #436	-> 0
/*     */         //   #437	-> 2
/*     */         //   #438	-> 110
/*     */         //   #436	-> 113
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	116	0	this	Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1$$anonfun$apply$2;
/*     */         //   0	116	1	x0$2	Ljava/lang/Object;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Recipes$$anonfun$findBlock$1$$anonfun$apply$2(Recipes$$anonfun$findBlock$1 $outer) {}
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class RecipeException
/*     */     extends RuntimeException
/*     */   {
/*     */     public RecipeException(String message) {
/* 484 */       super(message);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\Recipes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */