/*     */ package li.cil.repack.org.luaj.vm2;
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
/*     */ public abstract class Varargs
/*     */ {
/*     */   public abstract LuaValue arg(int paramInt);
/*     */   
/*     */   public abstract int narg();
/*     */   
/*     */   public abstract LuaValue arg1();
/*     */   
/*     */   public Varargs eval() {
/*  84 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTailcall() {
/*  91 */     return false;
/*     */   }
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
/*     */   public int type(int i) {
/* 112 */     return arg(i).type();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isnil(int i) {
/* 121 */     return arg(i).isnil();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isfunction(int i) {
/* 131 */     return arg(i).isfunction();
/*     */   }
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
/*     */   public boolean isnumber(int i) {
/* 144 */     return arg(i).isnumber();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isstring(int i) {
/* 156 */     return arg(i).isstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean istable(int i) {
/* 165 */     return arg(i).istable();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isthread(int i) {
/* 174 */     return arg(i).isthread();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isuserdata(int i) {
/* 183 */     return arg(i).isuserdata();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isvalue(int i) {
/* 191 */     return (i > 0 && i <= narg());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean optboolean(int i, boolean defval) {
/* 202 */     return arg(i).optboolean(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaClosure optclosure(int i, LuaClosure defval) {
/* 213 */     return arg(i).optclosure(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double optdouble(int i, double defval) {
/* 224 */     return arg(i).optdouble(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaFunction optfunction(int i, LuaFunction defval) {
/* 235 */     return arg(i).optfunction(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int optint(int i, int defval) {
/* 246 */     return arg(i).optint(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaInteger optinteger(int i, LuaInteger defval) {
/* 258 */     return arg(i).optinteger(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long optlong(int i, long defval) {
/* 269 */     return arg(i).optlong(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaNumber optnumber(int i, LuaNumber defval) {
/* 280 */     return arg(i).optnumber(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String optjstring(int i, String defval) {
/* 291 */     return arg(i).optjstring(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaString optstring(int i, LuaString defval) {
/* 302 */     return arg(i).optstring(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaTable opttable(int i, LuaTable defval) {
/* 312 */     return arg(i).opttable(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaThread optthread(int i, LuaThread defval) {
/* 322 */     return arg(i).optthread(defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object optuserdata(int i, Object defval) {
/* 333 */     return arg(i).optuserdata(defval);
/*     */   }
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
/*     */   public Object optuserdata(int i, Class c, Object defval) {
/* 347 */     return arg(i).optuserdata(c, defval);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue optvalue(int i, LuaValue defval) {
/* 356 */     return (i > 0 && i <= narg()) ? arg(i) : defval;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkboolean(int i) {
/* 366 */     return arg(i).checkboolean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaClosure checkclosure(int i) {
/* 375 */     return arg(i).checkclosure();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double checkdouble(int i) {
/* 386 */     return arg(i).checkdouble();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaFunction checkfunction(int i) {
/* 397 */     return arg(i).checkfunction();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkint(int i) {
/* 409 */     return arg(i).checkint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaInteger checkinteger(int i) {
/* 420 */     return arg(i).checkinteger();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long checklong(int i) {
/* 432 */     return arg(i).checklong();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaNumber checknumber(int i) {
/* 442 */     return arg(i).checknumber();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String checkjstring(int i) {
/* 452 */     return arg(i).checkjstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaString checkstring(int i) {
/* 462 */     return arg(i).checkstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaTable checktable(int i) {
/* 472 */     return arg(i).checktable();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaThread checkthread(int i) {
/* 482 */     return arg(i).checkthread();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object checkuserdata(int i) {
/* 492 */     return arg(i).checkuserdata();
/*     */   }
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
/*     */   public Object checkuserdata(int i, Class c) {
/* 505 */     return arg(i).checkuserdata(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue checkvalue(int i) {
/* 514 */     return (i <= narg()) ? arg(i) : LuaValue.argerror(i, "value expected");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue checknotnil(int i) {
/* 524 */     return arg(i).checknotnil();
/*     */   }
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
/*     */   public void argcheck(boolean test, int i, String msg) {
/* 538 */     if (!test) {
/* 539 */       LuaValue.argerror(i, msg);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isnoneornil(int i) {
/* 549 */     return (i > narg() || arg(i).isnil());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean toboolean(int i) {
/* 560 */     return arg(i).toboolean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte tobyte(int i) {
/* 570 */     return arg(i).tobyte();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public char tochar(int i) {
/* 580 */     return arg(i).tochar();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double todouble(int i) {
/* 588 */     return arg(i).todouble();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float tofloat(int i) {
/* 598 */     return arg(i).tofloat();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int toint(int i) {
/* 608 */     return arg(i).toint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long tolong(int i) {
/* 618 */     return arg(i).tolong();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String tojstring(int i) {
/* 626 */     return arg(i).tojstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short toshort(int i) {
/* 636 */     return arg(i).toshort();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object touserdata(int i) {
/* 644 */     return arg(i).touserdata();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object touserdata(int i, Class c) {
/* 655 */     return arg(i).touserdata(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String tojstring() {
/* 663 */     Buffer sb = new Buffer();
/* 664 */     sb.append("(");
/* 665 */     for (int i = 1, n = narg(); i <= n; i++) {
/* 666 */       if (i > 1)
/* 667 */         sb.append(","); 
/* 668 */       sb.append(arg(i).tojstring());
/*     */     } 
/* 670 */     sb.append(")");
/* 671 */     return sb.tojstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 681 */     return tojstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract Varargs subargs(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   static class SubVarargs
/*     */     extends Varargs
/*     */   {
/*     */     private final Varargs v;
/*     */ 
/*     */     
/*     */     private final int start;
/*     */ 
/*     */     
/*     */     private final int end;
/*     */ 
/*     */ 
/*     */     
/*     */     public SubVarargs(Varargs varargs, int start, int end) {
/* 705 */       this.v = varargs;
/* 706 */       this.start = start;
/* 707 */       this.end = end;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg(int i) {
/* 712 */       i += this.start - 1;
/* 713 */       return (i >= this.start && i <= this.end) ? this.v.arg(i) : LuaValue.NIL;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg1() {
/* 718 */       return this.v.arg(this.start);
/*     */     }
/*     */ 
/*     */     
/*     */     public int narg() {
/* 723 */       return this.end + 1 - this.start;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs subargs(int start) {
/* 728 */       if (start == 1)
/* 729 */         return this; 
/* 730 */       int newstart = this.start + start - 1;
/* 731 */       if (start > 0) {
/* 732 */         if (newstart >= this.end)
/* 733 */           return LuaValue.NONE; 
/* 734 */         if (newstart == this.end)
/* 735 */           return this.v.arg(this.end); 
/* 736 */         if (newstart == this.end - 1)
/* 737 */           return new Varargs.PairVarargs(this.v.arg(this.end - 1), this.v.arg(this.end)); 
/* 738 */         return new SubVarargs(this.v, newstart, this.end);
/*     */       } 
/* 740 */       return new SubVarargs(this.v, newstart, this.end);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final class PairVarargs
/*     */     extends Varargs
/*     */   {
/*     */     private final LuaValue v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Varargs v2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PairVarargs(LuaValue v1, Varargs v2) {
/* 765 */       this.v1 = v1;
/* 766 */       this.v2 = v2;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg(int i) {
/* 771 */       return (i == 1) ? this.v1 : this.v2.arg(i - 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public int narg() {
/* 776 */       return 1 + this.v2.narg();
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg1() {
/* 781 */       return this.v1;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs subargs(int start) {
/* 786 */       if (start == 1)
/* 787 */         return this; 
/* 788 */       if (start == 2)
/* 789 */         return this.v2; 
/* 790 */       if (start > 2)
/* 791 */         return this.v2.subargs(start - 1); 
/* 792 */       return LuaValue.argerror(1, "start must be > 0");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final class ArrayVarargs
/*     */     extends Varargs
/*     */   {
/*     */     private final LuaValue[] v;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Varargs r;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ArrayVarargs(LuaValue[] v, Varargs r) {
/* 819 */       this.v = v;
/* 820 */       this.r = r;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg(int i) {
/* 825 */       return (i < 1) ? LuaValue.NIL : ((i <= this.v.length) ? this.v[i - 1] : this.r.arg(i - this.v.length));
/*     */     }
/*     */ 
/*     */     
/*     */     public int narg() {
/* 830 */       return this.v.length + this.r.narg();
/*     */     }
/*     */     
/*     */     public LuaValue arg1() {
/* 834 */       return (this.v.length > 0) ? this.v[0] : this.r.arg1();
/*     */     }
/*     */     
/*     */     public Varargs subargs(int start) {
/* 838 */       if (start <= 0)
/* 839 */         LuaValue.argerror(1, "start must be > 0"); 
/* 840 */       if (start == 1)
/* 841 */         return this; 
/* 842 */       if (start > this.v.length)
/* 843 */         return this.r.subargs(start - this.v.length); 
/* 844 */       return LuaValue.varargsOf(this.v, start - 1, this.v.length - start - 1, this.r);
/*     */     }
/*     */ 
/*     */     
/*     */     void copyto(LuaValue[] dest, int offset, int length) {
/* 849 */       int n = Math.min(this.v.length, length);
/* 850 */       System.arraycopy(this.v, 0, dest, offset, n);
/* 851 */       this.r.copyto(dest, offset + n, length - n);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static final class ArrayPartVarargs
/*     */     extends Varargs
/*     */   {
/*     */     private final int offset;
/*     */ 
/*     */ 
/*     */     
/*     */     private final LuaValue[] v;
/*     */ 
/*     */ 
/*     */     
/*     */     private final int length;
/*     */ 
/*     */ 
/*     */     
/*     */     private final Varargs more;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ArrayPartVarargs(LuaValue[] v, int offset, int length) {
/* 879 */       this.v = v;
/* 880 */       this.offset = offset;
/* 881 */       this.length = length;
/* 882 */       this.more = LuaValue.NONE;
/*     */     }
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
/*     */     public ArrayPartVarargs(LuaValue[] v, int offset, int length, Varargs more) {
/* 895 */       this.v = v;
/* 896 */       this.offset = offset;
/* 897 */       this.length = length;
/* 898 */       this.more = more;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg(int i) {
/* 903 */       return (i < 1) ? LuaValue.NIL : ((i <= this.length) ? this.v[this.offset + i - 1] : this.more.arg(i - this.length));
/*     */     }
/*     */ 
/*     */     
/*     */     public int narg() {
/* 908 */       return this.length + this.more.narg();
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue arg1() {
/* 913 */       return (this.length > 0) ? this.v[this.offset] : this.more.arg1();
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs subargs(int start) {
/* 918 */       if (start <= 0)
/* 919 */         LuaValue.argerror(1, "start must be > 0"); 
/* 920 */       if (start == 1)
/* 921 */         return this; 
/* 922 */       if (start > this.length)
/* 923 */         return this.more.subargs(start - this.length); 
/* 924 */       return LuaValue.varargsOf(this.v, this.offset + start - 1, this.length - start - 1, this.more);
/*     */     }
/*     */ 
/*     */     
/*     */     void copyto(LuaValue[] dest, int offset, int length) {
/* 929 */       int n = Math.min(this.length, length);
/* 930 */       System.arraycopy(this.v, this.offset, dest, offset, n);
/* 931 */       this.more.copyto(dest, offset + n, length - n);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void copyto(LuaValue[] dest, int offset, int length) {
/* 942 */     for (int i = 0; i < length; i++) {
/* 943 */       dest[offset + i] = arg(i + 1);
/*     */     }
/*     */   }
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
/*     */   public Varargs dealias() {
/* 957 */     int n = narg();
/* 958 */     switch (n) {
/*     */       case 0:
/* 960 */         return LuaValue.NONE;
/*     */       case 1:
/* 962 */         return arg1();
/*     */       case 2:
/* 964 */         return new PairVarargs(arg1(), arg(2));
/*     */     } 
/* 966 */     LuaValue[] v = new LuaValue[n];
/* 967 */     copyto(v, 0, n);
/* 968 */     return new ArrayVarargs(v, LuaValue.NONE);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Varargs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */