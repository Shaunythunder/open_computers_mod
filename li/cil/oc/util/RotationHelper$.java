/*    */ package li.cil.oc.util;
/*    */ public final class RotationHelper$ {
/*    */   public static final RotationHelper$ MODULE$;
/*    */   private final Map<ForgeDirection, Map<ForgeDirection, ForgeDirection[]>> translationCache;
/*    */   private final Map<ForgeDirection, Map<ForgeDirection, ForgeDirection[]>> inverseTranslationCache;
/*    */   private final ForgeDirection[][][] li$cil$oc$util$RotationHelper$$translations;
/*    */   
/*    */   public ForgeDirection fromYaw(float yaw) {
/*  9 */     int i = scala.runtime.RichFloat$.MODULE$.round$extension(scala.Predef$.MODULE$.floatWrapper(yaw / 'Ũ' * 4)) & 0x3; switch (i) { default: throw new MatchError(BoxesRunTime.boxToInteger(i));case 3: case 2: case 1: case 0: break; }  return 
/* 10 */       ForgeDirection.SOUTH;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ForgeDirection toLocal(ForgeDirection pitch, ForgeDirection yaw, ForgeDirection value) {
/* 18 */     return translationFor(pitch, yaw)[value.ordinal()];
/*    */   }
/*    */   public ForgeDirection toGlobal(ForgeDirection pitch, ForgeDirection yaw, ForgeDirection value) {
/* 21 */     return inverseTranslationFor(pitch, yaw)[value.ordinal()];
/*    */   }
/*    */   
/* 24 */   public ForgeDirection[] translationFor(ForgeDirection pitch, ForgeDirection yaw) { synchronized (translationCache())
/*    */     
/* 26 */     { Object object = ((MapLike)translationCache().getOrElseUpdate(pitch, (Function0)new RotationHelper$$anonfun$translationFor$1())).getOrElseUpdate(yaw, (Function0)new RotationHelper$$anonfun$translationFor$2(pitch, yaw)); return (ForgeDirection[])object; }  } public final class RotationHelper$$anonfun$translationFor$1 extends AbstractFunction0<Map<ForgeDirection, ForgeDirection[]>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<ForgeDirection, ForgeDirection[]> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); } } public final class RotationHelper$$anonfun$translationFor$2 extends AbstractFunction0<ForgeDirection[]> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection pitch$1; private final ForgeDirection yaw$1; public final ForgeDirection[] apply() { return RotationHelper$.MODULE$.li$cil$oc$util$RotationHelper$$translations()[this.pitch$1.ordinal()][this.yaw$1.ordinal() - 2]; }
/*    */     
/*    */     public RotationHelper$$anonfun$translationFor$2(ForgeDirection pitch$1, ForgeDirection yaw$1) {} }
/* 29 */   public ForgeDirection[] inverseTranslationFor(ForgeDirection pitch, ForgeDirection yaw) { synchronized (inverseTranslationCache())
/*    */     
/* 31 */     { Object object = ((MapLike)inverseTranslationCache().getOrElseUpdate(pitch, (Function0)new RotationHelper$$anonfun$inverseTranslationFor$1())).getOrElseUpdate(yaw, (Function0)new RotationHelper$$anonfun$inverseTranslationFor$2(pitch, yaw)); return (ForgeDirection[])object; }  } public final class RotationHelper$$anonfun$inverseTranslationFor$1 extends AbstractFunction0<Map<ForgeDirection, ForgeDirection[]>> implements Serializable {
/* 32 */     public static final long serialVersionUID = 0L; public final Map<ForgeDirection, ForgeDirection[]> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); } } public final class RotationHelper$$anonfun$inverseTranslationFor$2 extends AbstractFunction0<ForgeDirection[]> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection pitch$2; private final ForgeDirection yaw$2; public RotationHelper$$anonfun$inverseTranslationFor$2(ForgeDirection pitch$2, ForgeDirection yaw$2) {} public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1 extends AbstractFunction1<Object, ForgeDirection> implements Serializable { public static final long serialVersionUID = 0L; public final ForgeDirection apply(int x$1) { return ForgeDirection.getOrientation(x$1); } public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1(RotationHelper$$anonfun$inverseTranslationFor$2 $outer) {} } public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayOps eta$0$1$1; public final int apply(Object elem) { return this.eta$0$1$1.indexOf(elem); } public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2(RotationHelper$$anonfun$inverseTranslationFor$2 $outer, ArrayOps eta$0$1$1) {} } public final ForgeDirection[] apply() { ForgeDirection[] t = RotationHelper$.MODULE$.translationFor(this.pitch$2, this.yaw$2);
/*    */ 
/*    */       
/* 35 */       ArrayOps arrayOps = scala.Predef$.MODULE$.refArrayOps((Object[])t); return (ForgeDirection[])((TraversableOnce)((TraversableLike)((TraversableLike)scala.Predef$.MODULE$.refArrayOps((Object[])t).indices().map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2(this, arrayOps), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 36 */         .map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 37 */         .toArray(scala.reflect.ClassTag$.MODULE$.apply(ForgeDirection.class)); }
/*    */      public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3 extends AbstractFunction1<Object, ForgeDirection> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final ForgeDirection apply(int x$1) {
/*    */         return ForgeDirection.getOrientation(x$1);
/*    */       } public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3(RotationHelper$$anonfun$inverseTranslationFor$2 $outer) {} } } private Map<ForgeDirection, Map<ForgeDirection, ForgeDirection[]>> translationCache() {
/* 42 */     return this.translationCache; } private Map<ForgeDirection, Map<ForgeDirection, ForgeDirection[]>> inverseTranslationCache() {
/* 43 */     return this.inverseTranslationCache;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ForgeDirection[][][] li$cil$oc$util$RotationHelper$$translations() {
/* 51 */     return this.li$cil$oc$util$RotationHelper$$translations;
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
/*    */   private RotationHelper$() {
/* 94 */     MODULE$ = this;
/*    */     this.translationCache = scala.collection.mutable.Map$.MODULE$.empty();
/*    */     this.inverseTranslationCache = scala.collection.mutable.Map$.MODULE$.empty();
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[0] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[1] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[2] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[3] = new ForgeDirection[7];
/*    */     (new ForgeDirection[3][][])[0] = new ForgeDirection[4][];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[0] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[1] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[2] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[3] = new ForgeDirection[7];
/*    */     (new ForgeDirection[3][][])[1] = new ForgeDirection[4][];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[0] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[1] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[2] = new ForgeDirection[7];
/*    */     (new ForgeDirection[7])[0] = RotationHelper.D$.MODULE$.down();
/*    */     (new ForgeDirection[7])[1] = RotationHelper.D$.MODULE$.up();
/*    */     (new ForgeDirection[7])[2] = RotationHelper.D$.MODULE$.east();
/*    */     (new ForgeDirection[7])[3] = RotationHelper.D$.MODULE$.west();
/*    */     (new ForgeDirection[7])[4] = RotationHelper.D$.MODULE$.north();
/*    */     (new ForgeDirection[7])[5] = RotationHelper.D$.MODULE$.south();
/*    */     (new ForgeDirection[7])[6] = RotationHelper.D$.MODULE$.unknown();
/*    */     (new ForgeDirection[4][])[3] = new ForgeDirection[7];
/*    */     (new ForgeDirection[3][][])[2] = new ForgeDirection[4][];
/*    */     this.li$cil$oc$util$RotationHelper$$translations = new ForgeDirection[3][][];
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\RotationHelper$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */