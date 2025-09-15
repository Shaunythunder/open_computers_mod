/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ @ScalaSignature(bytes = "\006\001M:Q!\001\002\t\002-\t\021BR8oiV#\030\016\\:\013\005\r!\021\001B;uS2T!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001!\taQ\"D\001\003\r\025q!\001#\001\020\005%1uN\034;Vi&d7o\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\017ii!\031!C\0057\005\031B-\0324j]\026$w\fZ8vE2,wl^5eKV\tA\004\005\002\036E5\taD\003\002 A\0059Q.\036;bE2,'BA\021\023\003)\031w\016\0347fGRLwN\\\005\003Gy\021aAQ5u'\026$\bBB\023\016A\003%A$\001\013eK\032Lg.\0323`I>,(\r\\3`o&$W\r\t\005\bO5\021\r\021\"\001)\003=\031w\016Z3q_&tGo\0307j[&$X#A\025\021\005EQ\023BA\026\023\005\rIe\016\036\005\007[5\001\013\021B\025\002!\r|G-\0329pS:$x\f\\5nSR\004\003\"B\030\016\t\003\001\024aB<do&$G\017\033\013\003SEBQA\r\030A\002%\n\001b\0315be\016{G-\032")
/*     */ public final class FontUtils
/*     */ {
/*     */   public static int wcwidth(int paramInt) {
/*     */     return FontUtils$.MODULE$.wcwidth(paramInt);
/*     */   }
/*     */   
/*     */   public static int codepoint_limit() {
/*     */     return FontUtils$.MODULE$.codepoint_limit();
/*     */   }
/*     */   
/*     */   public final class FontUtils$$anonfun$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int[] table$1;
/*     */     private final int[] wtable$1;
/*     */     
/*     */     public FontUtils$$anonfun$1(int[] table$1, int[] wtable$1) {}
/*     */     
/*     */     public final Object apply(int i) {
/* 227 */       return (FontUtils$.MODULE$.li$cil$oc$util$FontUtils$$c_wcwidth$1(i, this.table$1, this.wtable$1) == 2) ? 
/* 228 */         FontUtils$.MODULE$.li$cil$oc$util$FontUtils$$defined_double_wide().$plus$eq(i) : BoxedUnit.UNIT;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\FontUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */