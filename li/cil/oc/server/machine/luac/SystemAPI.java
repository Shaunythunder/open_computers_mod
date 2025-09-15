/*    */ package li.cil.oc.server.machine.luac;
/*    */ import li.cil.repack.com.naef.jnlua.LuaType;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\tI1+_:uK6\f\005+\023\006\003\007\021\tA\001\\;bG*\021QAB\001\b[\006\034\007.\0338f\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\003\023\t\031\"A\001\007OCRLg/\032'vC\006\003\026\nC\005\026\001\t\005\t\025!\003\0273\005)qn\0368feB\021\021cF\005\0031\t\021QCT1uSZ,G*^1Be\016D\027\016^3diV\024X-\003\002\026%!)1\004\001C\0019\0051A(\0338jiz\"\"!\b\020\021\005E\001\001\"B\013\033\001\0041\002\"\002\021\001\t\003\n\023AC5oSRL\027\r\\5{KR\t!\005\005\002$M5\tAEC\001&\003\025\0318-\0317b\023\t9CE\001\003V]&$\b")
/*    */ public class SystemAPI extends NativeLuaAPI {
/*    */   public SystemAPI(NativeLuaArchitecture owner) {
/*  7 */     super(owner);
/*    */   }
/*    */   public void initialize() {
/* 10 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new SystemAPI$$anonfun$initialize$1(this));
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
/* 23 */     lua().setGlobal("print");
/*    */ 
/*    */     
/* 26 */     lua().newTable();
/*    */ 
/*    */     
/* 29 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new SystemAPI$$anonfun$initialize$2(this));
/*    */ 
/*    */ 
/*    */     
/* 33 */     lua().setField(-2, "allowBytecode");
/*    */ 
/*    */     
/* 36 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new SystemAPI$$anonfun$initialize$3(this));
/*    */ 
/*    */ 
/*    */     
/* 40 */     lua().setField(-2, "allowGC");
/*    */ 
/*    */     
/* 43 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new SystemAPI$$anonfun$initialize$4(this));
/*    */ 
/*    */ 
/*    */     
/* 47 */     lua().setField(-2, "timeout");
/*    */     
/* 49 */     lua().setGlobal("system");
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$1(SystemAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       Predef$.MODULE$.println(((TraversableOnce)RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(1), lua.getTop()).map((Function1)new SystemAPI$$anonfun$initialize$1$$anonfun$apply$1(this, lua), IndexedSeq$.MODULE$.canBuildFrom())).mkString("  "));
/*    */       return 0;
/*    */     }
/*    */     
/*    */     public final class SystemAPI$$anonfun$initialize$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final LuaState lua$1;
/*    */       
/*    */       public final Object apply(int i) {
/*    */         LuaType luaType = this.lua$1.type(i);
/*    */         if (LuaType.NIL.equals(luaType)) {
/*    */           String str = "nil";
/*    */         } else if (LuaType.BOOLEAN.equals(luaType)) {
/*    */           Boolean bool = BoxesRunTime.boxToBoolean(this.lua$1.toBoolean(i));
/*    */         } else if (LuaType.NUMBER.equals(luaType)) {
/*    */           Double double_ = this.lua$1.isInteger(i) ? BoxesRunTime.boxToDouble(this.lua$1.toInteger(i)) : BoxesRunTime.boxToDouble(this.lua$1.toNumber(i));
/*    */         } else if (LuaType.STRING.equals(luaType)) {
/*    */           String str = this.lua$1.toString(i);
/*    */         } else if (LuaType.TABLE.equals(luaType)) {
/*    */           String str = "table";
/*    */         } else if (LuaType.FUNCTION.equals(luaType)) {
/*    */           String str = "function";
/*    */         } else if (LuaType.THREAD.equals(luaType)) {
/*    */           String str = "thread";
/*    */         } else {
/*    */           boolean bool;
/*    */           if (LuaType.LIGHTUSERDATA.equals(luaType)) {
/*    */             bool = true;
/*    */           } else if (LuaType.USERDATA.equals(luaType)) {
/*    */             bool = true;
/*    */           } else {
/*    */             bool = false;
/*    */           } 
/*    */           if (bool)
/*    */             return "userdata"; 
/*    */           throw new MatchError(luaType);
/*    */         } 
/*    */         return SYNTHETIC_LOCAL_VARIABLE_3;
/*    */       }
/*    */       
/*    */       public SystemAPI$$anonfun$initialize$1$$anonfun$apply$1(SystemAPI$$anonfun$initialize$1 $outer, LuaState lua$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$2(SystemAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       lua.pushBoolean(Settings$.MODULE$.get().allowBytecode());
/*    */       return 1;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$3(SystemAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       lua.pushBoolean(Settings$.MODULE$.get().allowGC());
/*    */       return 1;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class SystemAPI$$anonfun$initialize$4 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public SystemAPI$$anonfun$initialize$4(SystemAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       lua.pushNumber(Settings$.MODULE$.get().timeout());
/*    */       return 1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\SystemAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */