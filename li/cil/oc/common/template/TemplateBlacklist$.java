/*    */ package li.cil.oc.common.template;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ 
/*    */ public final class TemplateBlacklist$ {
/*    */   public static final TemplateBlacklist$ MODULE$;
/*    */   private ItemStack[] TheBlacklist;
/*    */   private volatile boolean bitmap$0;
/*    */   
/* 12 */   private ItemStack[] TheBlacklist$lzycompute() { synchronized (this) { if (!this.bitmap$0) {
/*    */         
/* 14 */         Regex pattern = (new StringOps(scala.Predef$.MODULE$.augmentString("^([^@]+)(?:@(\\d+))?$"))).r();
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
/* 25 */         this.TheBlacklist = (ItemStack[])((TraversableOnce)((TraversableLike)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(li.cil.oc.Settings$.MODULE$.get().assemblerBlacklist()).map((Function1)new TemplateBlacklist$$anonfun$TheBlacklist$2(pattern), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()))
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 35 */           .collect((PartialFunction)new TemplateBlacklist$$anonfun$TheBlacklist$1(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()))
/*    */           
/* 37 */           .toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); this.bitmap$0 = true;
/*    */       }  return this.TheBlacklist; }
/*    */      } private ItemStack[] TheBlacklist() { return this.bitmap$0 ? this.TheBlacklist : TheBlacklist$lzycompute(); }
/*    */   public final Option li$cil$oc$common$template$TemplateBlacklist$$parseDescriptor$1(String id, int meta) { Item item = (Item)Item.field_150901_e.func_82594_a(id); (new String[2])[0] = "Bad assembler blacklist entry '"; (new String[2])[1] = "', unknown item id."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { id }))); return (item == null) ? (Option)scala.None$.MODULE$ : scala.Option$.MODULE$.apply(new ItemStack(item, 1, meta)); }
/* 41 */   public void register() { IMC.registerAssemblerFilter("li.cil.oc.common.template.TemplateBlacklist.filter"); }
/*    */   public final class TemplateBlacklist$$anonfun$TheBlacklist$2 extends AbstractFunction1<String, Option<ItemStack>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Regex pattern$1; public final Option<ItemStack> apply(String x0$1) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: astore_2
/*    */       //   2: aload_0
/*    */       //   3: getfield pattern$1 : Lscala/util/matching/Regex;
/*    */       //   6: aload_2
/*    */       //   7: invokevirtual unapplySeq : (Ljava/lang/CharSequence;)Lscala/Option;
/*    */       //   10: astore_3
/*    */       //   11: aload_3
/*    */       //   12: invokevirtual isEmpty : ()Z
/*    */       //   15: ifne -> 97
/*    */       //   18: aload_3
/*    */       //   19: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   22: ifnull -> 97
/*    */       //   25: aload_3
/*    */       //   26: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   29: checkcast scala/collection/LinearSeqOptimized
/*    */       //   32: iconst_2
/*    */       //   33: invokeinterface lengthCompare : (I)I
/*    */       //   38: iconst_0
/*    */       //   39: if_icmpne -> 97
/*    */       //   42: aload_3
/*    */       //   43: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   46: checkcast scala/collection/LinearSeqOptimized
/*    */       //   49: iconst_0
/*    */       //   50: invokeinterface apply : (I)Ljava/lang/Object;
/*    */       //   55: checkcast java/lang/String
/*    */       //   58: astore #4
/*    */       //   60: aload_3
/*    */       //   61: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   64: checkcast scala/collection/LinearSeqOptimized
/*    */       //   67: iconst_1
/*    */       //   68: invokeinterface apply : (I)Ljava/lang/Object;
/*    */       //   73: checkcast java/lang/String
/*    */       //   76: astore #5
/*    */       //   78: aload #5
/*    */       //   80: ifnonnull -> 97
/*    */       //   83: getstatic li/cil/oc/common/template/TemplateBlacklist$.MODULE$ : Lli/cil/oc/common/template/TemplateBlacklist$;
/*    */       //   86: aload #4
/*    */       //   88: iconst_0
/*    */       //   89: invokevirtual li$cil$oc$common$template$TemplateBlacklist$$parseDescriptor$1 : (Ljava/lang/String;I)Lscala/Option;
/*    */       //   92: astore #6
/*    */       //   94: goto -> 349
/*    */       //   97: aload_0
/*    */       //   98: getfield pattern$1 : Lscala/util/matching/Regex;
/*    */       //   101: aload_2
/*    */       //   102: invokevirtual unapplySeq : (Ljava/lang/CharSequence;)Lscala/Option;
/*    */       //   105: astore #7
/*    */       //   107: aload #7
/*    */       //   109: invokevirtual isEmpty : ()Z
/*    */       //   112: ifne -> 208
/*    */       //   115: aload #7
/*    */       //   117: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   120: ifnull -> 208
/*    */       //   123: aload #7
/*    */       //   125: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   128: checkcast scala/collection/LinearSeqOptimized
/*    */       //   131: iconst_2
/*    */       //   132: invokeinterface lengthCompare : (I)I
/*    */       //   137: iconst_0
/*    */       //   138: if_icmpne -> 208
/*    */       //   141: aload #7
/*    */       //   143: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   146: checkcast scala/collection/LinearSeqOptimized
/*    */       //   149: iconst_0
/*    */       //   150: invokeinterface apply : (I)Ljava/lang/Object;
/*    */       //   155: checkcast java/lang/String
/*    */       //   158: astore #8
/*    */       //   160: aload #7
/*    */       //   162: invokevirtual get : ()Ljava/lang/Object;
/*    */       //   165: checkcast scala/collection/LinearSeqOptimized
/*    */       //   168: iconst_1
/*    */       //   169: invokeinterface apply : (I)Ljava/lang/Object;
/*    */       //   174: checkcast java/lang/String
/*    */       //   177: astore #9
/*    */       //   179: getstatic li/cil/oc/common/template/TemplateBlacklist$.MODULE$ : Lli/cil/oc/common/template/TemplateBlacklist$;
/*    */       //   182: aload #8
/*    */       //   184: new scala/collection/immutable/StringOps
/*    */       //   187: dup
/*    */       //   188: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   191: aload #9
/*    */       //   193: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   196: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   199: invokevirtual toInt : ()I
/*    */       //   202: invokevirtual li$cil$oc$common$template$TemplateBlacklist$$parseDescriptor$1 : (Ljava/lang/String;I)Lscala/Option;
/*    */       //   205: goto -> 347
/*    */       //   208: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */       //   211: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */       //   214: new scala/StringContext
/*    */       //   217: dup
/*    */       //   218: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   221: iconst_2
/*    */       //   222: anewarray java/lang/String
/*    */       //   225: dup
/*    */       //   226: iconst_0
/*    */       //   227: ldc 'Bad assembler blacklist entry ''
/*    */       //   229: aastore
/*    */       //   230: dup
/*    */       //   231: iconst_1
/*    */       //   232: ldc '', invalid format (should be 'id' or 'id@damage').'
/*    */       //   234: aastore
/*    */       //   235: checkcast [Ljava/lang/Object;
/*    */       //   238: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   241: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   244: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   247: iconst_1
/*    */       //   248: anewarray java/lang/Object
/*    */       //   251: dup
/*    */       //   252: iconst_0
/*    */       //   253: aload_2
/*    */       //   254: aastore
/*    */       //   255: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   258: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   261: invokeinterface warn : (Ljava/lang/String;)V
/*    */       //   266: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */       //   269: astore #6
/*    */       //   271: goto -> 349
/*    */       //   274: pop
/*    */       //   275: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */       //   278: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */       //   281: new scala/StringContext
/*    */       //   284: dup
/*    */       //   285: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   288: iconst_3
/*    */       //   289: anewarray java/lang/String
/*    */       //   292: dup
/*    */       //   293: iconst_0
/*    */       //   294: ldc 'Bad assembler blacklist entry ''
/*    */       //   296: aastore
/*    */       //   297: dup
/*    */       //   298: iconst_1
/*    */       //   299: ldc '@'
/*    */       //   301: aastore
/*    */       //   302: dup
/*    */       //   303: iconst_2
/*    */       //   304: ldc '', invalid damage value.'
/*    */       //   306: aastore
/*    */       //   307: checkcast [Ljava/lang/Object;
/*    */       //   310: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   313: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   316: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   319: iconst_2
/*    */       //   320: anewarray java/lang/Object
/*    */       //   323: dup
/*    */       //   324: iconst_0
/*    */       //   325: aload #8
/*    */       //   327: aastore
/*    */       //   328: dup
/*    */       //   329: iconst_1
/*    */       //   330: aload #9
/*    */       //   332: aastore
/*    */       //   333: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   336: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   339: invokeinterface warn : (Ljava/lang/String;)V
/*    */       //   344: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */       //   347: astore #6
/*    */       //   349: aload #6
/*    */       //   351: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #25	-> 0
/*    */       //   #26	-> 2
/*    */       //   #27	-> 97
/*    */       //   #33	-> 208
/*    */       //   #34	-> 266
/*    */       //   #32	-> 269
/*    */       //   #27	-> 274
/*    */       //   #29	-> 275
/*    */       //   #30	-> 344
/*    */       //   #27	-> 347
/*    */       //   #25	-> 349
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	352	0	this	Lli/cil/oc/common/template/TemplateBlacklist$$anonfun$TheBlacklist$2;
/*    */       //   0	352	1	x0$1	Ljava/lang/String;
/*    */       //   60	292	4	id	Ljava/lang/String;
/*    */       //   160	192	8	id	Ljava/lang/String;
/*    */       //   179	173	9	meta	Ljava/lang/String;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   179	208	274	java/lang/NumberFormatException
/* 45 */     } public TemplateBlacklist$$anonfun$TheBlacklist$2(Regex pattern$1) {} } public boolean filter(ItemStack stack) { return !scala.Predef$.MODULE$.refArrayOps((Object[])TheBlacklist()).exists((Function1)new TemplateBlacklist$$anonfun$filter$1(stack)); } public final class TemplateBlacklist$$anonfun$TheBlacklist$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } } public final class TemplateBlacklist$$anonfun$filter$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(ItemStack x$1) { return x$1.func_77969_a(this.stack$1); }
/*    */      public TemplateBlacklist$$anonfun$filter$1(ItemStack stack$1) {} } private TemplateBlacklist$() {
/* 47 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\TemplateBlacklist$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */