/*    */ package li.cil.oc.integration.projectred;
/*    */ 
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\0011<Q!\001\002\t\0025\tQ\"T8e!J|'.Z2u%\026$'BA\002\005\003)\001(o\0346fGR\024X\r\032\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\0335{G\r\025:pU\026\034GOU3e'\021y!C\007\020\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\017\016\003\021I!!\b\003\003\0215{G\r\025:pqf\004\"aH\031\017\005\001rcBA\021-\035\t\0213F\004\002$U9\021A%\013\b\003K!j\021A\n\006\003O1\ta\001\020:p_Rt\024\"A\006\n\005%Q\021BA\004\t\023\t)a!\003\002.\t\005!Q\017^5m\023\ty\003'A\bCk:$G.\0323SK\022\034Ho\0348f\025\tiC!\003\0023g\t\001\"+\0323ti>tW\r\025:pm&$WM\035\006\003_ABQ!N\b\005\002Y\na\001P5oSRtD#A\007\t\013azA\021I\035\002\r\035,G/T8e)\005Q\004CA\036?\035\tYB(\003\002>\t\005!Qj\0343t\023\ty\004IA\005TS6\004H.Z'pI*\021Q\b\002\005\006\005>!\teQ\001\013S:LG/[1mSj,G#\001#\021\005\025CU\"\001$\013\003\035\013Qa]2bY\006L!!\023$\003\tUs\027\016\036\005\006\027>!\t\005T\001\rG>l\007/\036;f\023:\004X\017\036\013\004\033B;\006CA#O\023\tyeIA\002J]RDQ!\025&A\002I\0131\001]8t!\t\031V+D\001U\025\tic!\003\002W)\ni!\t\\8dWB{7/\033;j_:DQ\001\027&A\002e\013Aa]5eKB\021!LY\007\0027*\021Q\006\030\006\003;z\013aaY8n[>t'BA0a\0039i\027N\\3de\0064GOZ8sO\026T\021!Y\001\004]\026$\030BA2\\\00591uN]4f\t&\024Xm\031;j_:DQ!Z\b\005\002\031\f1cY8naV$XMQ;oI2,G-\0238qkR$2a\0326l!\r)\005.T\005\003S\032\023Q!\021:sCfDQ!\0253A\002ICQ\001\0273A\002e\003")
/*    */ public final class ModProjectRed {
/*    */   public static int[] computeBundledInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return ModProjectRed$.MODULE$.computeBundledInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static int computeInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return ModProjectRed$.MODULE$.computeInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static void initialize() {
/*    */     ModProjectRed$.MODULE$.initialize();
/*    */   }
/*    */   
/*    */   public static Mods.SimpleMod getMod() {
/*    */     return ModProjectRed$.MODULE$.getMod();
/*    */   }
/*    */   
/* 26 */   public final class ModProjectRed$$anonfun$computeBundledInput$1 extends AbstractFunction0<int[]> implements Serializable { public final int[] apply() { return null; } public static final long serialVersionUID = 0L; } public final class ModProjectRed$$anonfun$computeBundledInput$2 extends AbstractFunction1<byte[], int[]> implements Serializable { public static final long serialVersionUID = 0L; public final int[] apply(byte[] x$1) { return (int[])Predef$.MODULE$.byteArrayOps(x$1).map((Function1)new ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())); } public final class ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(byte x$2) { return x$2 & 0xFF; }
/*    */ 
/*    */       
/*    */       public ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1(ModProjectRed$$anonfun$computeBundledInput$2 $outer) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\projectred\ModProjectRed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */