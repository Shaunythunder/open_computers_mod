/*    */ package li.cil.oc.util;@ScalaSignature(bytes = "\006\001A3A!\001\002\001\027\tiQj\034<j]\036\fe/\032:bO\026T!a\001\003\002\tU$\030\016\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\0011C\001\001\r!\ti\001#D\001\017\025\005y\021!B:dC2\f\027BA\t\017\005\031\te.\037*fM\"A1\003\001BC\002\023\005A#\001\003tSj,W#A\013\021\00551\022BA\f\017\005\rIe\016\036\005\t3\001\021\t\021)A\005+\005)1/\033>fA!)1\004\001C\0019\0051A(\0338jiz\"\"!H\020\021\005y\001Q\"\001\002\t\013MQ\002\031A\013\t\017\005\002!\031!C\005E\005!A-\031;b+\005\031\003cA\007%+%\021QE\004\002\006\003J\024\030-\037\005\007O\001\001\013\021B\022\002\013\021\fG/\031\021\t\017%\002\001\031!C\005)\005!\001.Z1e\021\035Y\003\0011A\005\n1\n\001\002[3bI~#S-\035\013\003[A\002\"!\004\030\n\005=r!\001B+oSRDq!\r\026\002\002\003\007Q#A\002yIEBaa\r\001!B\023)\022!\0025fC\022\004\003bB\033\001\001\004%I\001F\001\016G\006\034\007.\0323Bm\026\024\030mZ3\t\017]\002\001\031!C\005q\005\t2-Y2iK\022\fe/\032:bO\026|F%Z9\025\0055J\004bB\0317\003\003\005\r!\006\005\007w\001\001\013\025B\013\002\035\r\f7\r[3e\003Z,'/Y4fA!9Q\b\001a\001\n\023q\024!\0023jeRLX#A \021\0055\001\025BA!\017\005\035\021un\0347fC:Dqa\021\001A\002\023%A)A\005eSJ$\030p\030\023fcR\021Q&\022\005\bc\t\013\t\0211\001@\021\0319\005\001)Q\005\0051A-\033:us\002BQ!\023\001\005\002)\013Q!\0319qYf$\022!\006\005\006\031\002!\t!T\001\tIAdWo\035\023fcR\021QD\024\005\006\037.\003\r!F\001\006m\006dW/\032")
/*    */ public class MovingAverage { private final int size; private final int[] data; private int head; private int cachedAverage; private boolean dirty;
/*  3 */   public int size() { return this.size; }
/*  4 */   private int[] data() { return this.data; } public MovingAverage(int size) { this.data = (int[])Array$.MODULE$.fill(size, (Function0)new MovingAverage$$anonfun$1(this), ClassTag$.MODULE$.Int());
/*  5 */     this.head = 0;
/*  6 */     this.cachedAverage = 0;
/*  7 */     this.dirty = true; } public final class MovingAverage$$anonfun$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public MovingAverage$$anonfun$1(MovingAverage $outer) {} } private int head() { return this.head; } private void head_$eq(int x$1) { this.head = x$1; } private int cachedAverage() { return this.cachedAverage; } private void cachedAverage_$eq(int x$1) { this.cachedAverage = x$1; } private boolean dirty() { return this.dirty; } private void dirty_$eq(boolean x$1) { this.dirty = x$1; }
/*    */   
/*    */   public int apply() {
/* 10 */     if (dirty()) {
/* 11 */       cachedAverage_$eq(BoxesRunTime.unboxToInt(Predef$.MODULE$.intArrayOps(data()).sum((Numeric)Numeric$IntIsIntegral$.MODULE$)) / size());
/* 12 */       dirty_$eq(false);
/*    */     } 
/* 14 */     return cachedAverage();
/*    */   }
/*    */   
/*    */   public MovingAverage $plus$eq(int value) {
/* 18 */     data()[head()] = value;
/* 19 */     head_$eq((head() + 1) % size());
/* 20 */     dirty_$eq(true);
/* 21 */     return this;
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\MovingAverage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */