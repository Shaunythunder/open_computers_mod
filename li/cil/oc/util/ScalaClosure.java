/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import li.cil.repack.org.luaj.vm2.lib.VarArgFunction;
/*    */ import scala.Function1;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.immutable.IndexedSeq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]b\001B\001\003\001-\021AbU2bY\006\034En\\:ve\026T!a\001\003\002\tU$\030\016\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\0011C\001\001\r!\ti\001$D\001\017\025\ty\001#A\002mS\nT!!\005\n\002\007Yl'G\003\002\024)\005!A.^1k\025\t)b#A\002pe\036T!a\006\004\002\rI,\007/Y2l\023\tIbB\001\bWCJ\f%o\032$v]\016$\030n\0348\t\021m\001!Q1A\005\002q\t\021AZ\013\002;A!a$I\022$\033\005y\"\"\001\021\002\013M\034\027\r\\1\n\005\tz\"!\003$v]\016$\030n\03482!\t!S%D\001\021\023\t1\003CA\004WCJ\f'oZ:\t\021!\002!\021!Q\001\nu\t!A\032\021\t\013)\002A\021A\026\002\rqJg.\033;?)\tac\006\005\002.\0015\t!\001C\003\034S\001\007Q\004C\0031\001\021\005\023'\001\004j]Z|7.\032\013\003GIBQaM\030A\002\r\nA!\031:hg\036)QG\001E\001m\005a1kY1mC\016cwn];sKB\021Qf\016\004\006\003\tA\t\001O\n\003oe\002\"A\b\036\n\005mz\"AB!osJ+g\rC\003+o\021\005Q\bF\0017\021\025yt\007b\001A\003-9(/\0319DY>\034XO]3\025\0051\n\005\"B\016?\001\004\021\005\003\002\020\"G\r\003\"\001\n#\n\005\025\003\"\001\003'vCZ\013G.^3\t\013\035;D1\001%\002#]\024\030\r\035,be\006\023xm\0217pgV\024X\r\006\002-\023\")1D\022a\001;!)1j\016C\001\031\006QAo\034'vCZ\013G.^3\025\005\rk\005\"\002(K\001\004y\025!\002<bYV,\007C\001\020Q\023\t\tvDA\002B]fDQaU\034\005\002Q\013\021\002^8Mk\006d\025n\035;\025\005\r+\006\"\002(S\001\0041\006cA,`\037:\021\001,\030\b\0033rk\021A\027\006\0037*\ta\001\020:p_Rt\024\"\001\021\n\005y{\022a\0029bG.\fw-Z\005\003A\006\024\001\"\023;fe\006\024G.\032\006\003=~AQaY\034\005\002\021\f!\002^8Mk\006$\026M\0317f)\t\031U\rC\003OE\002\007a\rM\002ha^\004B\001[6om:\021a$[\005\003U~\ta\001\025:fI\0264\027B\0017n\005\ri\025\r\035\006\003U~\001\"a\0349\r\001\021I\021/ZA\001\002\003\025\tA\035\002\004?\022\n\024CA:P!\tqB/\003\002v?\t9aj\034;iS:<\007CA8x\t%AX-!A\001\002\013\005!OA\002`IIBQA_\034\005\002m\f!\003^8TS6\004H.\032&bm\006|%M[3diR\021\021\b \005\006\035f\004\ra\021\005\006}^\"\ta`\001\024i>\034\026.\0349mK*\013g/Y(cU\026\034Go\035\013\007\003\003\t\t\"a\005\021\013\005\r\021QB\035\016\005\005\025!\002BA\004\003\023\t\021\"[7nkR\f'\r\\3\013\007\005-q$\001\006d_2dWm\031;j_:LA!a\004\002\006\tQ\021J\0343fq\026$7+Z9\t\013Mj\b\031A\022\t\023\005UQ\020%AA\002\005]\021!B:uCJ$\bc\001\020\002\032%\031\0211D\020\003\007%sG\017C\005\002 ]\n\n\021\"\001\002\"\005iBo\\*j[BdWMS1wC>\023'.Z2ug\022\"WMZ1vYR$#'\006\002\002$)\"\021qCA\023W\t\t9\003\005\003\002*\005MRBAA\026\025\021\ti#a\f\002\023Ut7\r[3dW\026$'bAA\031?\005Q\021M\0348pi\006$\030n\0348\n\t\005U\0221\006\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007")
/*    */ public class ScalaClosure extends VarArgFunction {
/*    */   private final Function1<Varargs, Varargs> f;
/*    */   
/*    */   public Function1<Varargs, Varargs> f() {
/* 17 */     return this.f; } public Varargs invoke(Varargs args) {
/* 18 */     return (Varargs)f().apply(args);
/*    */   }
/*    */   
/*    */   public ScalaClosure(Function1<Varargs, Varargs> f) {}
/*    */   
/*    */   public static int toSimpleJavaObjects$default$2() {
/*    */     return ScalaClosure$.MODULE$.toSimpleJavaObjects$default$2();
/*    */   }
/*    */   
/*    */   public static IndexedSeq<Object> toSimpleJavaObjects(Varargs paramVarargs, int paramInt) {
/*    */     return ScalaClosure$.MODULE$.toSimpleJavaObjects(paramVarargs, paramInt);
/*    */   }
/*    */   
/*    */   public static Object toSimpleJavaObject(LuaValue paramLuaValue) {
/*    */     return ScalaClosure$.MODULE$.toSimpleJavaObject(paramLuaValue);
/*    */   }
/*    */   
/*    */   public static LuaValue toLuaTable(Map<?, ?> paramMap) {
/*    */     return ScalaClosure$.MODULE$.toLuaTable(paramMap);
/*    */   }
/*    */   
/*    */   public static LuaValue toLuaList(Iterable<Object> paramIterable) {
/*    */     return ScalaClosure$.MODULE$.toLuaList(paramIterable);
/*    */   }
/*    */   
/*    */   public static LuaValue toLuaValue(Object paramObject) {
/*    */     return ScalaClosure$.MODULE$.toLuaValue(paramObject);
/*    */   }
/*    */   
/*    */   public static ScalaClosure wrapVarArgClosure(Function1<Varargs, Varargs> paramFunction1) {
/*    */     return ScalaClosure$.MODULE$.wrapVarArgClosure(paramFunction1);
/*    */   }
/*    */   
/*    */   public static ScalaClosure wrapClosure(Function1<Varargs, LuaValue> paramFunction1) {
/*    */     return ScalaClosure$.MODULE$.wrapClosure(paramFunction1);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ScalaClosure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */