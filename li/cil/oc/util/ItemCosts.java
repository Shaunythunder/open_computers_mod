/*     */ package li.cil.oc.util;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.Seq$;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0055s!B\001\003\021\003Y\021!C%uK6\034un\035;t\025\t\031A!\001\003vi&d'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001A\021A\"D\007\002\005\031)aB\001E\001\037\tI\021\n^3n\007>\034Ho]\n\003\033A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\016\t\003A\022A\002\037j]&$h\bF\001\f\021\035QRB1A\005\016m\tq\001V5nK>,H/F\001\035\037\005iRDA\001u\022\031yR\002)A\0079\005AA+[7f_V$\b\005C\004\"\033\t\007I\021\002\022\002\013\r\f7\r[3\026\003\r\002B\001J\025,]5\tQE\003\002'O\0059Q.\036;bE2,'B\001\025\023\003)\031w\016\0347fGRLwN\\\005\003U\025\0221!T1q!\taA&\003\002.\005\t\001\022\n^3n'R\f7m[,sCB\004XM\035\t\004_]RdB\001\0316\035\t\tD'D\0013\025\t\031$\"\001\004=e>|GOP\005\002'%\021aGE\001\ba\006\0347.Y4f\023\tA\024H\001\005Ji\026\024\030M\0317f\025\t1$\003\005\003\022wu:\025B\001\037\023\005\031!V\017\0357feA\021a(R\007\002)\021\001)Q\001\005SR,WN\003\002C\007\006IQ.\0338fGJ\fg\r\036\006\002\t\006\031a.\032;\n\005\031{$!C%uK6\034F/Y2l!\t\t\002*\003\002J%\t1Ai\\;cY\026DaaS\007!\002\023\031\023AB2bG\",\007\005C\004N\033\001\007I\021\002(\002\017M$\030M\035;fIV\tq\n\005\002\022!&\021\021K\005\002\005\031>tw\rC\004T\033\001\007I\021\002+\002\027M$\030M\035;fI~#S-\035\013\003+b\003\"!\005,\n\005]\023\"\001B+oSRDq!\027*\002\002\003\007q*A\002yIEBaaW\007!B\023y\025\001C:uCJ$X\r\032\021\t\013ukA\021\0010\002\023Q,'/\\5oCR,GcA\022`G\")\001\t\030a\001AB\021a(Y\005\003E~\022A!\023;f[\"9A\r\030I\001\002\004)\027\001B7fi\006\004\"!\0054\n\005\035\024\"aA%oi\")Q,\004C\001SR\0211E\033\005\006W\"\004\r\001\\\001\006E2|7m\033\t\003[>l\021A\034\006\003W\006K!\001\0358\003\013\tcwnY6\t\013IlA\021A:\002\021!\f7oQ8tiN$\"\001^<\021\005E)\030B\001<\023\005\035\021un\0347fC:DQ\001_9A\002u\nQa\035;bG.DQA_\007\005\002m\f!\"\0313e)>|G\016^5q)\r)F0 \005\006qf\004\r!\020\005\006}f\004\ra`\001\bi>|G\016^5q!\031\t\t!!\003\002\0165\021\0211\001\006\004\007\005\025!BAA\004\003\021Q\027M^1\n\t\005-\0211\001\002\005\031&\034H\017\005\003\002\020\005UabA\t\002\022%\031\0211\003\n\002\rA\023X\rZ3g\023\021\t9\"!\007\003\rM#(/\0338h\025\r\t\031B\005\005\b\003;iA\021CA\020\003I\031w.\0349vi\026Len\032:fI&,g\016^:\025\0079\n\t\003C\004\002$\005m\001\031A\037\002\t]D\027\r\036\005\b\003OiA\021BA\025\003-1WO\037>z\013F,\030\r\\:\025\013Q\fY#a\f\t\017\0055\022Q\005a\001{\00511\017^1dWFBq!!\r\002&\001\007Q(\001\004ti\006\0347N\r\005\n\003ki\021\023!C\001\003o\t1\003^3s[&t\027\r^3%I\0264\027-\0367uII*\"!!\017+\007\025\fYd\013\002\002>A!\021qHA%\033\t\t\tE\003\003\002D\005\025\023!C;oG\",7m[3e\025\r\t9EE\001\013C:tw\016^1uS>t\027\002BA&\003\003\022\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\001")
/*     */ public final class ItemCosts {
/*     */   public static int terminate$default$2() {
/*     */     return ItemCosts$.MODULE$.terminate$default$2();
/*     */   }
/*     */   
/*     */   public static void addTooltip(ItemStack paramItemStack, List<String> paramList) {
/*     */     ItemCosts$.MODULE$.addTooltip(paramItemStack, paramList);
/*     */   }
/*     */   
/*     */   public static boolean hasCosts(ItemStack paramItemStack) {
/*     */     return ItemCosts$.MODULE$.hasCosts(paramItemStack);
/*     */   }
/*     */   
/*     */   public static Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> terminate(Block paramBlock) {
/*     */     return ItemCosts$.MODULE$.terminate(paramBlock);
/*     */   }
/*     */   
/*     */   public static Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> terminate(Item paramItem, int paramInt) {
/*     */     return ItemCosts$.MODULE$.terminate(paramItem, paramInt);
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$1 extends AbstractFunction1<Object, Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> apply(int i) {
/*  46 */       return ItemCosts$.MODULE$.terminate(Items.field_151100_aR, i);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ItemCosts$$anonfun$addTooltip$1
/*     */     extends AbstractFunction1<Tuple2<ItemStack, Object>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1)
/*     */     {
/*     */       boolean bool;
/*  69 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class ItemCosts$$anonfun$addTooltip$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final boolean apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { ItemStack ingredient = (ItemStack)tuple2._1(); double count = tuple2._2$mcD$sp();
/*  70 */         String line = (new StringBuilder()).append((int)package$.MODULE$.ceil(count)).append("x ").append(ingredient.func_82833_r()).toString();
/*  71 */         return this.tooltip$1.add(line); }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */     
/*     */     public ItemCosts$$anonfun$addTooltip$2(List tooltip$1) {} }
/*     */   public final class ItemCosts$$anonfun$deflate$1$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/*  79 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } }
/*     */    public final class ItemCosts$$anonfun$deflate$1$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Map counts$1; public final Object apply(Tuple2 x$2) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 150
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast net/minecraft/item/ItemStack
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2$mcD$sp : ()D
/*     */       //   18: dstore #4
/*     */       //   20: aload_0
/*     */       //   21: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   24: new li/cil/oc/util/ItemCosts$$anonfun$deflate$1$2$$anonfun$2
/*     */       //   27: dup
/*     */       //   28: aload_0
/*     */       //   29: aload_3
/*     */       //   30: invokespecial <init> : (Lli/cil/oc/util/ItemCosts$$anonfun$deflate$1$2;Lnet/minecraft/item/ItemStack;)V
/*     */       //   33: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */       //   38: astore #7
/*     */       //   40: aload #7
/*     */       //   42: instanceof scala/Some
/*     */       //   45: ifeq -> 114
/*     */       //   48: aload #7
/*     */       //   50: checkcast scala/Some
/*     */       //   53: astore #8
/*     */       //   55: aload #8
/*     */       //   57: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   60: checkcast scala/Tuple2
/*     */       //   63: astore #9
/*     */       //   65: aload #9
/*     */       //   67: ifnull -> 114
/*     */       //   70: aload #9
/*     */       //   72: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   75: checkcast net/minecraft/item/ItemStack
/*     */       //   78: astore #10
/*     */       //   80: aload #9
/*     */       //   82: invokevirtual _2$mcD$sp : ()D
/*     */       //   85: dstore #11
/*     */       //   87: aload_0
/*     */       //   88: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   91: aload #10
/*     */       //   93: dload #11
/*     */       //   95: dload #4
/*     */       //   97: dadd
/*     */       //   98: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */       //   101: invokeinterface update : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   106: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   109: astore #13
/*     */       //   111: goto -> 143
/*     */       //   114: aload_0
/*     */       //   115: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   118: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */       //   121: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   124: aload_3
/*     */       //   125: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   128: dload #4
/*     */       //   130: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */       //   133: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */       //   136: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */       //   141: astore #13
/*     */       //   143: aload #13
/*     */       //   145: astore #6
/*     */       //   147: aload #6
/*     */       //   149: areturn
/*     */       //   150: new scala/MatchError
/*     */       //   153: dup
/*     */       //   154: aload_2
/*     */       //   155: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   158: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #79	-> 0
/*     */       //   #80	-> 20
/*     */       //   #83	-> 40
/*     */       //   #84	-> 114
/*     */       //   #80	-> 143
/*     */       //   #79	-> 147
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	159	0	this	Lli/cil/oc/util/ItemCosts$$anonfun$deflate$1$2;
/*     */       //   0	159	1	x$2	Lscala/Tuple2;
/*     */       //   14	145	3	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   20	139	4	count	D
/*     */       //   80	79	10	key	Lnet/minecraft/item/ItemStack;
/*  80 */       //   87	72	11	value	D } public ItemCosts$$anonfun$deflate$1$2(Map counts$1) {} public final class ItemCosts$$anonfun$deflate$1$2$$anonfun$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/*  81 */           ItemStack key = (ItemStack)tuple2._1(); return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key, this.stack$1);
/*     */         } 
/*     */         throw new MatchError(tuple2); }
/*     */ 
/*     */       
/*     */       private final ItemStack stack$1;
/*     */       
/*     */       public ItemCosts$$anonfun$deflate$1$2$$anonfun$2(ItemCosts$$anonfun$deflate$1$2 $outer, ItemStack stack$1) {} } }
/*     */   
/*     */   public final class ItemCosts$$anonfun$3 extends AbstractFunction1<Tuple2<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final boolean apply(Tuple2 x0$2) {
/*  94 */       Tuple2 tuple2 = x0$2; if (tuple2 != null) {
/*  95 */         ItemStackWrapper key = (ItemStackWrapper)tuple2._1(); return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key.inner(), this.x2$1);
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     } public ItemCosts$$anonfun$3(ItemStack x2$1) {} } public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack x2$1; public final boolean apply(ItemStack value) {
/*  99 */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(value, this.x2$1);
/*     */     } public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$1(ItemStack x2$1) {} }
/*     */   public final class ItemCosts$$anonfun$4 extends AbstractFunction1<Object, IRecipe> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final IRecipe apply(Object x$3) {
/* 103 */       return (IRecipe)x$3;
/*     */     } }
/*     */   public final class ItemCosts$$anonfun$5 extends AbstractFunction1<IRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 106 */     public final boolean apply(IRecipe x$4) { return !(x$4 == null); } } public final class ItemCosts$$anonfun$6 extends AbstractFunction1<IRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack x2$1; public final boolean apply(IRecipe recipe) { return (recipe.func_77571_b() != null && ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(this.x2$1, recipe.func_77571_b())); }
/*     */      public ItemCosts$$anonfun$6(ItemStack x2$1) {} } public final class ItemCosts$$anonfun$7 extends AbstractFunction1<ItemStack, Iterable<Tuple2<ItemStack, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final Seq path$1; private final ItemStack x2$1;
/* 108 */     public final Iterable<Tuple2<ItemStack, Object>> apply(ItemStack x$5) { return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$5, (Seq)this.path$1.$colon$plus(this.x2$1, Seq$.MODULE$.canBuildFrom())); } public ItemCosts$$anonfun$7(Seq path$1, ItemStack x2$1) {} } public final class ItemCosts$$anonfun$8 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final Seq path$1; private final ItemStack x2$1;
/* 109 */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$6) { return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$6, (Seq)this.path$1.$colon$plus(this.x2$1, Seq$.MODULE$.canBuildFrom())); } public ItemCosts$$anonfun$8(Seq path$1, ItemStack x2$1) {} } public final class ItemCosts$$anonfun$9 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final Seq path$1; private final ItemStack x2$1;
/* 110 */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$7) { return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$7, (Seq)this.path$1.$colon$plus(this.x2$1, Seq$.MODULE$.canBuildFrom())); } public ItemCosts$$anonfun$9(Seq path$1, ItemStack x2$1) {} } public final class ItemCosts$$anonfun$10 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final Seq path$1; private final ItemStack x2$1;
/* 111 */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$8) { return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$8, (Seq)this.path$1.$colon$plus(this.x2$1, Seq$.MODULE$.canBuildFrom())); } public ItemCosts$$anonfun$10(Seq path$1, ItemStack x2$1) {} } public final class ItemCosts$$anonfun$11 extends AbstractFunction1<Tuple2<ItemStack, ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack x2$1; public final boolean apply(Tuple2 x0$3) {
/* 112 */       Tuple2 tuple2 = x0$3; if (tuple2 != null) {
/* 113 */         ItemStack value = (ItemStack)tuple2._2(); return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(this.x2$1, value);
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     public ItemCosts$$anonfun$11(ItemStack x2$1) {} }
/*     */   public final class ItemCosts$$anonfun$12 extends AbstractFunction1<Tuple2<ItemStack, Object>, Tuple2<ItemStack, Object>> implements Serializable { public static final long serialVersionUID = 0L; private final int output$1;
/* 119 */     public final Tuple2<ItemStack, Object> apply(Tuple2 x0$4) { Tuple2 tuple2 = x0$4; if (tuple2 != null) {
/* 120 */         ItemStack ingredient = (ItemStack)tuple2._1(); double count = tuple2._2$mcD$sp(); return new Tuple2(ingredient.func_77946_l(), BoxesRunTime.boxToDouble(count / this.output$1));
/* 121 */       }  throw new MatchError(tuple2); } public ItemCosts$$anonfun$12(int output$1) {} } public final class ItemCosts$$anonfun$13 extends AbstractFunction1<Tuple2<ItemStack, Object>, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Tuple2 x$10) { return ((ItemStack)x$10._1()).func_77977_a(); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ObjectRef result$1;
/*     */     
/* 129 */     public final boolean apply(ItemStack stack) { return ((Iterable)this.result$1.elem).isEmpty(); } public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$2(ObjectRef result$1) {} } public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef result$1; public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3(ObjectRef result$1) {} public final void apply(ItemStack stack) {
/* 130 */       Option option = ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$cache().find((Function1)new ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14(this, stack));
/*     */ 
/*     */       
/* 133 */       if (option instanceof Some) { Some some = (Some)option; Tuple2 tuple2 = (Tuple2)some.x(); if (tuple2 != null) { Iterable value = (Iterable)tuple2._2(); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 134 */        BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     }
/*     */     
/*     */     public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14 extends AbstractFunction1<Tuple2<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final ItemStack stack$2;
/*     */       
/*     */       public final boolean apply(Tuple2 x0$5) {
/*     */         Tuple2 tuple2 = x0$5;
/*     */         if (tuple2 != null) {
/*     */           ItemStackWrapper key = (ItemStackWrapper)tuple2._1();
/*     */           return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key.inner(), this.stack$2);
/*     */         } 
/*     */         throw new MatchError(tuple2);
/*     */       }
/*     */       
/*     */       public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14(ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3 $outer, ItemStack stack$2) {}
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemCosts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */