/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\tI1+_:uK6\f\005+\023\006\003\007\021\tA\001\\;bU*\021QAB\001\b[\006\034\007.\0338f\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\003\023\t\031\"AA\004Mk\006T\025\tU%\t\023U\001!\021!Q\001\nYI\022!B8x]\026\024\bCA\t\030\023\tA\"AA\nMk\006TE*^1Be\016D\027\016^3diV\024X-\003\002\026%!)1\004\001C\0019\0051A(\0338jiz\"\"!\b\020\021\005E\001\001\"B\013\033\001\0041\002\"\002\021\001\t\003\n\023AC5oSRL\027\r\\5{KR\t!\005\005\002$M5\tAEC\001&\003\025\0318-\0317b\023\t9CE\001\003V]&$\b")
/*    */ public class SystemAPI extends LuaJAPI {
/*    */   public SystemAPI(LuaJLuaArchitecture owner) {
/*  8 */     super(owner);
/*    */   } public void initialize() {
/* 10 */     LuaTable system = LuaValue.tableOf();
/*    */ 
/*    */     
/* 13 */     system.set("allowBytecode", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new SystemAPI$$anonfun$initialize$1(this)));
/*    */ 
/*    */     
/* 16 */     system.set("allowGC", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new SystemAPI$$anonfun$initialize$2(this)));
/*    */ 
/*    */     
/* 19 */     system.set("timeout", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new SystemAPI$$anonfun$initialize$3(this)));
/*    */     
/* 21 */     lua().set("system", (LuaValue)system);
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaBoolean apply(Varargs x$1) {
/*    */       return LuaValue.valueOf(Settings$.MODULE$.get().allowBytecode());
/*    */     }
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$1(SystemAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaBoolean apply(Varargs x$2) {
/*    */       return LuaValue.valueOf(Settings$.MODULE$.get().allowGC());
/*    */     }
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$2(SystemAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaNumber apply(Varargs x$3) {
/*    */       return LuaValue.valueOf(Settings$.MODULE$.get().timeout());
/*    */     }
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$3(SystemAPI $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\SystemAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */