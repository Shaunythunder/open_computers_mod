/*    */ package li.cil.oc.integration.util;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class BundledRedstone$ {
/*    */   public static final BundledRedstone$ MODULE$;
/*    */   
/*    */   public Buffer<BundledRedstone.RedstoneProvider> providers() {
/* 11 */     return this.providers;
/*    */   } private final Buffer<BundledRedstone.RedstoneProvider> providers; public void addProvider(BundledRedstone.RedstoneProvider provider) {
/* 13 */     providers().$plus$eq(provider);
/*    */   } public boolean isAvailable() {
/* 15 */     return (li.cil.oc.integration.Mods$.MODULE$.MineFactoryReloaded().isAvailable() || providers().nonEmpty());
/*    */   }
/*    */   public int computeInput(BlockPosition pos, ForgeDirection side) {
/* 18 */     return li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld((World)pos.world().get()).blockExists(pos.offset(side)) ? 
/* 19 */       BoxesRunTime.unboxToInt(((TraversableOnce)((SeqLike)providers().map((Function1)new BundledRedstone$$anonfun$computeInput$1(pos, side), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom())).padTo(1, BoxesRunTime.boxToInteger(0), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom())).max((Ordering)scala.math.Ordering$Int$.MODULE$)) : 
/* 20 */       0;
/*    */   } public final class BundledRedstone$$anonfun$computeInput$1 extends AbstractFunction1<BundledRedstone.RedstoneProvider, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final BlockPosition pos$2; private final ForgeDirection side$2; public final int apply(BundledRedstone.RedstoneProvider x$1) {
/*    */       return x$1.computeInput(this.pos$2, this.side$2);
/*    */     } public BundledRedstone$$anonfun$computeInput$1(BlockPosition pos$2, ForgeDirection side$2) {} }
/* 25 */   public int[] computeBundledInput(BlockPosition pos, ForgeDirection side) { Buffer inputs = (Buffer)((TraversableLike)providers().map((Function1)new BundledRedstone$$anonfun$1(pos, side), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom())).filter((Function1)new BundledRedstone$$anonfun$2());
/* 26 */     return li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld((World)pos.world().get()).blockExists(pos.offset(side)) ? (inputs.isEmpty() ? null : 
/* 27 */       (int[])inputs.reduce((Function2)new BundledRedstone$$anonfun$computeBundledInput$1())) : 
/*    */       
/* 29 */       null; }
/*    */   
/*    */   public final class BundledRedstone$$anonfun$1 extends AbstractFunction1<BundledRedstone.RedstoneProvider, int[]> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final BlockPosition pos$1; private final ForgeDirection side$1;
/*    */     public final int[] apply(BundledRedstone.RedstoneProvider x$2) {
/*    */       return x$2.computeBundledInput(this.pos$1, this.side$1);
/*    */     }
/*    */     public BundledRedstone$$anonfun$1(BlockPosition pos$1, ForgeDirection side$1) {} }
/*    */   private BundledRedstone$() {
/* 38 */     MODULE$ = this;
/*    */     this.providers = (Buffer<BundledRedstone.RedstoneProvider>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*    */   }
/*    */   
/*    */   public final class BundledRedstone$$anonfun$2 extends AbstractFunction1<int[], Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(int[] x$3) {
/*    */       return (x$3 != null);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class BundledRedstone$$anonfun$computeBundledInput$1 extends AbstractFunction2<int[], int[], int[]> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final int[] apply(int[] a, int[] b) {
/*    */       return (int[])scala.runtime.Tuple2Zipped$.MODULE$.map$extension(scala.runtime.Tuple2Zipped$Ops$.MODULE$.zipped$extension(scala.Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(a, b)), (Function1)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2(this), (Function1)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3(this)), (Function2)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1(this), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Int()));
/*    */     }
/*    */     
/*    */     public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2 extends AbstractFunction1<int[], ArrayOps<Object>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final ArrayOps<Object> apply(int[] xs) {
/*    */         return scala.Predef$.MODULE$.intArrayOps(xs);
/*    */       }
/*    */       
/*    */       public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3 extends AbstractFunction1<int[], ArrayOps<Object>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final ArrayOps<Object> apply(int[] xs) {
/*    */         return scala.Predef$.MODULE$.intArrayOps(xs);
/*    */       }
/*    */       
/*    */       public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1 extends AbstractFunction2.mcIII.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final int apply(int l, int r) {
/*    */         return apply$mcIII$sp(l, r);
/*    */       }
/*    */       
/*    */       public int apply$mcIII$sp(int l, int r) {
/*    */         return scala.math.package$.MODULE$.max(l, r);
/*    */       }
/*    */       
/*    */       public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\BundledRedstone$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */