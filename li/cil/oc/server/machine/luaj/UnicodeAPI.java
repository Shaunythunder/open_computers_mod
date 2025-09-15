/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\tQQK\\5d_\022,\027\tU%\013\005\r!\021\001\0027vC*T!!\002\004\002\0175\f7\r[5oK*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001a\005\002\001!A\021\021CE\007\002\005%\0211C\001\002\b\031V\f'*\021)J\021%)\002A!A!\002\0231\022$A\003po:,'\017\005\002\022/%\021\001D\001\002\024\031V\f'\nT;b\003J\034\007.\033;fGR,(/Z\005\003+IAQa\007\001\005\002q\ta\001P5oSRtDCA\017\037!\t\t\002\001C\003\0265\001\007a\003C\003!\001\021\005\023%\001\006j]&$\030.\0317ju\026$\022A\t\t\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005\n\002\005+:LG\017")
/*    */ public class UnicodeAPI extends LuaJAPI {
/*    */   public UnicodeAPI(LuaJLuaArchitecture owner) {
/*  9 */     super(owner);
/*    */   }
/*    */   public void initialize() {
/* 12 */     LuaTable unicode = LuaValue.tableOf();
/*    */     
/* 14 */     unicode.set("lower", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$1(this)));
/*    */     
/* 16 */     unicode.set("upper", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$2(this)));
/*    */     
/* 18 */     unicode.set("char", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$3(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     unicode.set("len", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$4(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     unicode.set("reverse", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$5(this)));
/*    */     
/* 31 */     unicode.set("sub", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$6(this)));
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
/* 49 */     unicode.set("isWide", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$7(this)));
/*    */ 
/*    */     
/* 52 */     unicode.set("charWidth", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$8(this)));
/*    */ 
/*    */     
/* 55 */     unicode.set("wlen", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$9(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     unicode.set("wtrunc", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UnicodeAPI$$anonfun$initialize$10(this)));
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
/* 75 */     lua().set("unicode", (LuaValue)unicode);
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       return LuaValue.valueOf(args.checkjstring(1).toLowerCase());
/*    */     }
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$1(UnicodeAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       return LuaValue.valueOf(args.checkjstring(1).toUpperCase());
/*    */     }
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$2(UnicodeAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$3(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       StringBuilder builder = new StringBuilder();
/*    */       ((IterableLike)RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(1), args.narg()).map((Function1)new UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$1(this, args), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$2(this, builder));
/*    */       return LuaValue.valueOf(builder.toString());
/*    */     }
/*    */     
/*    */     public final class UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$1 extends AbstractFunction1.mcII.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Varargs args$1;
/*    */       
/*    */       public final int apply(int x$1) {
/*    */         return apply$mcII$sp(x$1);
/*    */       }
/*    */       
/*    */       public int apply$mcII$sp(int x$1) {
/*    */         return this.args$1.checkint(x$1);
/*    */       }
/*    */       
/*    */       public UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$1(UnicodeAPI$$anonfun$initialize$3 $outer, Varargs args$1) {}
/*    */     }
/*    */     
/*    */     public final class UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$2 extends AbstractFunction1<Object, StringBuilder> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final StringBuilder builder$1;
/*    */       
/*    */       public final StringBuilder apply(int x$1) {
/*    */         return this.builder$1.appendCodePoint(x$1);
/*    */       }
/*    */       
/*    */       public UnicodeAPI$$anonfun$initialize$3$$anonfun$apply$2(UnicodeAPI$$anonfun$initialize$3 $outer, StringBuilder builder$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$4 extends AbstractFunction1<Varargs, LuaInteger> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$4(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaInteger apply(Varargs args) {
/*    */       String s = args.checkjstring(1);
/*    */       return LuaValue.valueOf(s.codePointCount(0, s.length()));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$5 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       return LuaValue.valueOf(ExtendedUnicodeHelper.reverse(args.checkjstring(1)));
/*    */     }
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$5(UnicodeAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$6 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$6(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       String string = args.checkjstring(1);
/*    */       int sLength = ExtendedUnicodeHelper.length(string);
/*    */       int i = args.checkint(2);
/*    */       switch (i) {
/*    */       
/*    */       } 
/*    */       int start = (i < 0) ? string.offsetByCodePoints(string.length(), package$.MODULE$.max(i, -sLength)) : ((i == 0) ? 0 : string.offsetByCodePoints(0, package$.MODULE$.min(i - 1, sLength)));
/*    */       int j = args.checkint(3);
/*    */       switch (j) {
/*    */       
/*    */       } 
/*    */       int end = (args.narg() > 2) ? ((j < 0) ? string.offsetByCodePoints(string.length(), package$.MODULE$.max(j + 1, -sLength)) : string.offsetByCodePoints(0, package$.MODULE$.min(j, sLength))) : string.length();
/*    */       return (end <= start) ? LuaValue.valueOf("") : LuaValue.valueOf(string.substring(start, end));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$7 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$7(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaBoolean apply(Varargs args) {
/*    */       return LuaValue.valueOf((FontUtils$.MODULE$.wcwidth(args.checkjstring(1).codePointAt(0)) > 1));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$8 extends AbstractFunction1<Varargs, LuaInteger> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$8(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaInteger apply(Varargs args) {
/*    */       return LuaValue.valueOf(FontUtils$.MODULE$.wcwidth(args.checkjstring(1).codePointAt(0)));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$9 extends AbstractFunction1<Varargs, LuaInteger> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$9(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaInteger apply(Varargs args) {
/*    */       String value = args.checkjstring(1);
/*    */       return LuaValue.valueOf(value.codePoints().map(new UnicodeAPI$$anonfun$initialize$9$$anon$1(this)).sum());
/*    */     }
/*    */     
/*    */     public final class UnicodeAPI$$anonfun$initialize$9$$anon$1 implements IntUnaryOperator {
/*    */       public UnicodeAPI$$anonfun$initialize$9$$anon$1(UnicodeAPI$$anonfun$initialize$9 $outer) {}
/*    */       
/*    */       public int applyAsInt(int ch) {
/*    */         return package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(ch));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UnicodeAPI$$anonfun$initialize$10 extends AbstractFunction1<Varargs, LuaString> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UnicodeAPI$$anonfun$initialize$10(UnicodeAPI $outer) {}
/*    */     
/*    */     public final LuaString apply(Varargs args) {
/*    */       String value = args.checkjstring(1);
/*    */       int count = args.checkint(2);
/*    */       int width = 0;
/*    */       int end = 0;
/*    */       while (width < count) {
/*    */         width += package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(value.codePointAt(end)));
/*    */         end = value.offsetByCodePoints(end, 1);
/*    */       } 
/*    */       return (end > 1) ? LuaValue.valueOf(value.substring(0, end - 1)) : LuaValue.valueOf("");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\UnicodeAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */