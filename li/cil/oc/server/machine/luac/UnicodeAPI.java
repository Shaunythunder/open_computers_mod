/*     */ package li.cil.oc.server.machine.luac;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\tQQK\\5d_\022,\027\tU%\013\005\r!\021\001\0027vC\016T!!\002\004\002\0175\f7\r[5oK*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001a\005\002\001!A\021\021CE\007\002\005%\0211C\001\002\r\035\006$\030N^3Mk\006\f\005+\023\005\n+\001\021\t\021)A\005-e\tQa\\<oKJ\004\"!E\f\n\005a\021!!\006(bi&4X\rT;b\003J\034\007.\033;fGR,(/Z\005\003+IAQa\007\001\005\002q\ta\001P5oSRtDCA\017\037!\t\t\002\001C\003\0265\001\007a\003C\003!\001\021\005\023%\001\006j]&$\030.\0317ju\026$\022A\t\t\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005\n\002\005+:LG\017")
/*     */ public class UnicodeAPI extends NativeLuaAPI {
/*     */   public UnicodeAPI(NativeLuaArchitecture owner) {
/*   7 */     super(owner);
/*     */   }
/*     */   public void initialize() {
/*  10 */     lua().newTable();
/*     */     
/*  12 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  18 */     lua().setField(-2, "char");
/*     */     
/*  20 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  25 */     lua().setField(-2, "len");
/*     */     
/*  27 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$3(this));
/*     */ 
/*     */ 
/*     */     
/*  31 */     lua().setField(-2, "lower");
/*     */     
/*  33 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$4(this));
/*     */ 
/*     */ 
/*     */     
/*  37 */     lua().setField(-2, "reverse");
/*     */     
/*  39 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$5(this));
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
/*  57 */     lua().setField(-2, "sub");
/*     */     
/*  59 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$6(this));
/*     */ 
/*     */ 
/*     */     
/*  63 */     lua().setField(-2, "upper");
/*     */     
/*  65 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$7(this));
/*     */ 
/*     */ 
/*     */     
/*  69 */     lua().setField(-2, "isWide");
/*     */     
/*  71 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$8(this));
/*     */ 
/*     */ 
/*     */     
/*  75 */     lua().setField(-2, "charWidth");
/*     */     
/*  77 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$9(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     lua().setField(-2, "wlen");
/*     */     
/*  86 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UnicodeAPI$$anonfun$initialize$10(this));
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
/*  99 */     lua().setField(-2, "wtrunc");
/*     */     
/* 101 */     lua().setGlobal("unicode");
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$1(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       StringBuilder builder = new StringBuilder();
/*     */       ((IterableLike)RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(1), lua.getTop()).map((Function1)new UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$1(this, lua), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$2(this, builder));
/*     */       lua.pushString(builder.toString());
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public final class UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$1 extends AbstractFunction1.mcII.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final LuaState lua$1;
/*     */       
/*     */       public final int apply(int x$1) {
/*     */         return apply$mcII$sp(x$1);
/*     */       }
/*     */       
/*     */       public int apply$mcII$sp(int x$1) {
/*     */         return this.lua$1.checkInt32(x$1);
/*     */       }
/*     */       
/*     */       public UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$1(UnicodeAPI$$anonfun$initialize$1 $outer, LuaState lua$1) {}
/*     */     }
/*     */     
/*     */     public final class UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$2 extends AbstractFunction1<Object, StringBuilder> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final StringBuilder builder$1;
/*     */       
/*     */       public final StringBuilder apply(int x$1) {
/*     */         return this.builder$1.appendCodePoint(x$1);
/*     */       }
/*     */       
/*     */       public UnicodeAPI$$anonfun$initialize$1$$anonfun$apply$2(UnicodeAPI$$anonfun$initialize$1 $outer, StringBuilder builder$1) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$2(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String s = lua.checkString(1);
/*     */       lua.pushInteger(ExtendedUnicodeHelper.length(s));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$3(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushString(lua.checkString(1).toLowerCase());
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$4 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$4(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushString(ExtendedUnicodeHelper.reverse(lua.checkString(1)));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$5 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$5(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String string = lua.checkString(1);
/*     */       int sLength = ExtendedUnicodeHelper.length(string);
/*     */       int i = lua.checkInt32(2);
/*     */       switch (i) {
/*     */       
/*     */       } 
/*     */       int start = (i < 0) ? string.offsetByCodePoints(string.length(), package$.MODULE$.max(i, -sLength)) : ((i == 0) ? 0 : string.offsetByCodePoints(0, package$.MODULE$.min(i - 1, sLength)));
/*     */       int j = lua.checkInt32(3);
/*     */       switch (j) {
/*     */       
/*     */       } 
/*     */       int end = (lua.getTop() > 2) ? ((j < 0) ? string.offsetByCodePoints(string.length(), package$.MODULE$.max(j + 1, -sLength)) : string.offsetByCodePoints(0, package$.MODULE$.min(j, sLength))) : string.length();
/*     */       if (end <= start) {
/*     */         lua.pushString("");
/*     */       } else {
/*     */         lua.pushString(string.substring(start, end));
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$6 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$6(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushString(lua.checkString(1).toUpperCase());
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$7 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$7(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushBoolean((FontUtils$.MODULE$.wcwidth(lua.checkString(1).codePointAt(0)) > 1));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$8 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$8(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushInteger(FontUtils$.MODULE$.wcwidth(lua.checkString(1).codePointAt(0)));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$9 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$9(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String value = lua.checkString(1);
/*     */       lua.pushInteger(value.codePoints().map(new UnicodeAPI$$anonfun$initialize$9$$anon$1(this)).sum());
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public final class UnicodeAPI$$anonfun$initialize$9$$anon$1 implements IntUnaryOperator {
/*     */       public UnicodeAPI$$anonfun$initialize$9$$anon$1(UnicodeAPI$$anonfun$initialize$9 $outer) {}
/*     */       
/*     */       public int applyAsInt(int ch) {
/*     */         return package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(ch));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UnicodeAPI$$anonfun$initialize$10 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UnicodeAPI$$anonfun$initialize$10(UnicodeAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String value = lua.checkString(1);
/*     */       long count = lua.checkInteger(2);
/*     */       int width = 0;
/*     */       int end = 0;
/*     */       while (width < count) {
/*     */         width += package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(value.codePointAt(end)));
/*     */         end = value.offsetByCodePoints(end, 1);
/*     */       } 
/*     */       if (end > 1) {
/*     */         lua.pushString(value.substring(0, end - 1));
/*     */       } else {
/*     */         lua.pushString("");
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\UnicodeAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */