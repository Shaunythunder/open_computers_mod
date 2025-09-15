/*    */ package li.cil.oc.integration.util;@ScalaSignature(bytes = "\006\001\025<Q!\001\002\t\0025\tqBQ;oI2,GMU3egR|g.\032\006\003\007\021\tA!\036;jY*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021qBQ;oI2,GMU3egR|g.Z\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\035arB1A\005\002u\t\021\002\035:pm&$WM]:\026\003y\0012a\b\023'\033\005\001#BA\021#\003\035iW\017^1cY\026T!a\t\013\002\025\r|G\016\\3di&|g.\003\002&A\t1!)\0364gKJ\004\"a\n\025\016\003=1q!K\b\021\002G\005!F\001\tSK\022\034Ho\0348f!J|g/\0333feN\021\001F\005\005\006Y!2\t!L\001\rG>l\007/\036;f\023:\004X\017\036\013\004]EB\004CA\n0\023\t\001DCA\002J]RDQAM\026A\002M\n1\001]8t!\t!d'D\0016\025\t\031a!\003\0028k\ti!\t\\8dWB{7/\033;j_:DQ!O\026A\002i\nAa]5eKB\0211hQ\007\002y)\0211!\020\006\003}}\naaY8n[>t'B\001!B\0039i\027N\\3de\0064GOZ8sO\026T\021AQ\001\004]\026$\030B\001#=\00591uN]4f\t&\024Xm\031;j_:DQA\022\025\007\002\035\0131cY8naV$XMQ;oI2,G-\0238qkR$2\001S&M!\r\031\022JL\005\003\025R\021Q!\021:sCfDQAM#A\002MBQ!O#A\002iBaAT\b!\002\023q\022A\0039s_ZLG-\032:tA!)\001k\004C\001#\006Y\021\r\0323Qe>4\030\016Z3s)\t\021V\013\005\002\024'&\021A\013\006\002\005+:LG\017C\003W\037\002\007a%\001\005qe>4\030\016Z3s\021\025Av\002\"\001Z\003-I7/\021<bS2\f'\r\\3\026\003i\003\"aE.\n\005q#\"a\002\"p_2,\027M\034\005\006Y=!\tA\030\013\004]}\003\007\"\002\032^\001\004\031\004\"B\035^\001\004Q\004\"\002$\020\t\003\021Gc\001%dI\")!'\031a\001g!)\021(\031a\001u\001")
/*    */ public final class BundledRedstone { public static int[] computeBundledInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return BundledRedstone$.MODULE$.computeBundledInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   public static int computeInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return BundledRedstone$.MODULE$.computeInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   public static boolean isAvailable() {
/*    */     return BundledRedstone$.MODULE$.isAvailable();
/*    */   }
/*    */   public static void addProvider(RedstoneProvider paramRedstoneProvider) {
/*    */     BundledRedstone$.MODULE$.addProvider(paramRedstoneProvider);
/*    */   }
/*    */   public static Buffer<RedstoneProvider> providers() {
/*    */     return BundledRedstone$.MODULE$.providers();
/*    */   }
/*    */   public final class BundledRedstone$$anonfun$computeInput$1 extends AbstractFunction1<RedstoneProvider, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final int apply(BundledRedstone.RedstoneProvider x$1) {
/* 19 */       return x$1.computeInput(this.pos$2, this.side$2);
/*    */     }
/*    */     private final BlockPosition pos$2; private final ForgeDirection side$2;
/*    */     public BundledRedstone$$anonfun$computeInput$1(BlockPosition pos$2, ForgeDirection side$2) {} }
/*    */   public final class BundledRedstone$$anonfun$1 extends AbstractFunction1<RedstoneProvider, int[]> implements Serializable { public static final long serialVersionUID = 0L; private final BlockPosition pos$1; private final ForgeDirection side$1;
/*    */     public final int[] apply(BundledRedstone.RedstoneProvider x$2) {
/* 25 */       return x$2.computeBundledInput(this.pos$1, this.side$1); } public BundledRedstone$$anonfun$1(BlockPosition pos$1, ForgeDirection side$1) {} } public final class BundledRedstone$$anonfun$2 extends AbstractFunction1<int[], Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int[] x$3) { return (x$3 != null); }
/*    */      } public final class BundledRedstone$$anonfun$computeBundledInput$1 extends AbstractFunction2<int[], int[], int[]> implements Serializable { public static final long serialVersionUID = 0L;
/* 27 */     public final int[] apply(int[] a, int[] b) { return (int[])Tuple2Zipped$.MODULE$.map$extension(Tuple2Zipped$Ops$.MODULE$.zipped$extension(Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(a, b)), (Function1)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2(this), (Function1)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3(this)), (Function2)new BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())); } public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2 extends AbstractFunction1<int[], ArrayOps<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<Object> apply(int[] xs) { return Predef$.MODULE$.intArrayOps(xs); } public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$2(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {} } public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3 extends AbstractFunction1<int[], ArrayOps<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<Object> apply(int[] xs) { return Predef$.MODULE$.intArrayOps(xs); } public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$3(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {} } public final class BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1 extends AbstractFunction2.mcIII.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int l, int r) { return apply$mcIII$sp(l, r); } public int apply$mcIII$sp(int l, int r) { return package$.MODULE$.max(l, r); }
/*    */ 
/*    */       
/*    */       public BundledRedstone$$anonfun$computeBundledInput$1$$anonfun$apply$1(BundledRedstone$$anonfun$computeBundledInput$1 $outer) {} }
/*    */      }
/*    */ 
/*    */   
/*    */   public static interface RedstoneProvider {
/*    */     int computeInput(BlockPosition param1BlockPosition, ForgeDirection param1ForgeDirection);
/*    */     
/*    */     int[] computeBundledInput(BlockPosition param1BlockPosition, ForgeDirection param1ForgeDirection);
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\BundledRedstone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */