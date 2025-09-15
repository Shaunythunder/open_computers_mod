/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\t)qjU!Q\023*\0211\001B\001\005YV\f'N\003\002\006\r\0059Q.Y2iS:,'BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005\035aU/\031&B!&C\021\"\006\001\003\002\003\006IAF\r\002\013=<h.\032:\021\005E9\022B\001\r\003\005MaU/\031&Mk\006\f%o\0315ji\026\034G/\036:f\023\t)\"\003C\003\034\001\021\005A$\001\004=S:LGO\020\013\003;y\001\"!\005\001\t\013UQ\002\031\001\f\t\013\001\002A\021I\021\002\025%t\027\016^5bY&TX\rF\001#!\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\005\021)f.\033;")
/*    */ public class OSAPI extends LuaJAPI {
/*    */   public OSAPI(LuaJLuaArchitecture owner) {
/*  8 */     super(owner);
/*    */   } public void initialize() {
/* 10 */     LuaTable os = LuaValue.tableOf();
/*    */     
/* 12 */     os.set("clock", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new OSAPI$$anonfun$initialize$1(this)));
/*    */ 
/*    */     
/* 15 */     os.set("date", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new OSAPI$$anonfun$initialize$2(this)));
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
/* 50 */     os.set("time", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new OSAPI$$anonfun$initialize$3(this)));
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
/* 84 */     lua().set("os", (LuaValue)os);
/*    */   }
/*    */   
/*    */   public final class OSAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaNumber apply(Varargs x$1) {
/*    */       return LuaValue.valueOf(this.$outer.machine().cpuTime());
/*    */     }
/*    */     
/*    */     public OSAPI$$anonfun$initialize$1(OSAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class OSAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public OSAPI$$anonfun$initialize$2(OSAPI $outer) {}
/*    */     
/*    */     public final LuaValue apply(Varargs args) {
/*    */       String format = (args.narg() > 0 && args.isstring(1)) ? args.tojstring(1) : "%d/%m/%y %H:%M:%S";
/*    */       double time = (args.narg() > 1 && args.isnumber(2)) ? args.todouble(2) : ((this.$outer.machine().worldTime() + 6000L) * 60L * 60L / 1000L);
/*    */       GameTimeFormatter.DateTime dt = GameTimeFormatter$.MODULE$.parse(time);
/*    */       return format.startsWith("!") ? fmt$1(format.substring(1), dt) : fmt$1(format, dt);
/*    */     }
/*    */     
/*    */     private final LuaValue fmt$1(String format, GameTimeFormatter.DateTime dt$1) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc '*t'
/*    */       //   3: astore_3
/*    */       //   4: dup
/*    */       //   5: ifnonnull -> 16
/*    */       //   8: pop
/*    */       //   9: aload_3
/*    */       //   10: ifnull -> 23
/*    */       //   13: goto -> 148
/*    */       //   16: aload_3
/*    */       //   17: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   20: ifeq -> 148
/*    */       //   23: iconst_0
/*    */       //   24: bipush #8
/*    */       //   26: invokestatic tableOf : (II)Lli/cil/repack/org/luaj/vm2/LuaTable;
/*    */       //   29: astore #4
/*    */       //   31: aload #4
/*    */       //   33: ldc 'year'
/*    */       //   35: aload_2
/*    */       //   36: invokevirtual year : ()I
/*    */       //   39: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   42: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   45: aload #4
/*    */       //   47: ldc 'month'
/*    */       //   49: aload_2
/*    */       //   50: invokevirtual month : ()I
/*    */       //   53: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   56: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   59: aload #4
/*    */       //   61: ldc 'day'
/*    */       //   63: aload_2
/*    */       //   64: invokevirtual day : ()I
/*    */       //   67: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   70: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   73: aload #4
/*    */       //   75: ldc 'hour'
/*    */       //   77: aload_2
/*    */       //   78: invokevirtual hour : ()I
/*    */       //   81: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   84: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   87: aload #4
/*    */       //   89: ldc 'min'
/*    */       //   91: aload_2
/*    */       //   92: invokevirtual minute : ()I
/*    */       //   95: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   98: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   101: aload #4
/*    */       //   103: ldc 'sec'
/*    */       //   105: aload_2
/*    */       //   106: invokevirtual second : ()I
/*    */       //   109: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   112: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   115: aload #4
/*    */       //   117: ldc 'wday'
/*    */       //   119: aload_2
/*    */       //   120: invokevirtual weekDay : ()I
/*    */       //   123: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   126: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   129: aload #4
/*    */       //   131: ldc 'yday'
/*    */       //   133: aload_2
/*    */       //   134: invokevirtual yearDay : ()I
/*    */       //   137: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*    */       //   140: invokevirtual set : (Ljava/lang/String;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*    */       //   143: aload #4
/*    */       //   145: goto -> 159
/*    */       //   148: getstatic li/cil/oc/util/GameTimeFormatter$.MODULE$ : Lli/cil/oc/util/GameTimeFormatter$;
/*    */       //   151: aload_1
/*    */       //   152: aload_2
/*    */       //   153: invokevirtual format : (Ljava/lang/String;Lli/cil/oc/util/GameTimeFormatter$DateTime;)Ljava/lang/String;
/*    */       //   156: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*    */       //   159: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #25	-> 0
/*    */       //   #26	-> 23
/*    */       //   #27	-> 31
/*    */       //   #28	-> 45
/*    */       //   #29	-> 59
/*    */       //   #30	-> 73
/*    */       //   #31	-> 87
/*    */       //   #32	-> 101
/*    */       //   #33	-> 115
/*    */       //   #34	-> 129
/*    */       //   #35	-> 143
/*    */       //   #38	-> 148
/*    */       //   #25	-> 159
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	160	0	this	Lli/cil/oc/server/machine/luaj/OSAPI$$anonfun$initialize$2;
/*    */       //   0	160	1	format	Ljava/lang/String;
/*    */       //   0	160	2	dt$1	Lli/cil/oc/util/GameTimeFormatter$DateTime;
/*    */       //   31	114	4	table	Lli/cil/repack/org/luaj/vm2/LuaTable;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class OSAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public OSAPI$$anonfun$initialize$3(OSAPI $outer) {}
/*    */     
/*    */     public final LuaValue apply(Varargs args) {
/*    */       LuaValue luaValue;
/*    */       LuaTable table = args.checktable(1);
/*    */       int sec = getField$1("sec", 0, table);
/*    */       int min = getField$1("min", 0, table);
/*    */       int hour = getField$1("hour", 12, table);
/*    */       int mday = getField$1("day", -1, table);
/*    */       int mon = getField$1("month", -1, table);
/*    */       int year = getField$1("year", -1, table);
/*    */       Option option = GameTimeFormatter$.MODULE$.mktime(year, mon, mday, hour, min, sec);
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         int time = BoxesRunTime.unboxToInt(some.x());
/*    */         LuaInteger luaInteger = LuaValue.valueOf(time);
/*    */       } else {
/*    */         luaValue = LuaValue.NIL;
/*    */       } 
/*    */       return args.isnoneornil(1) ? (LuaValue)LuaValue.valueOf(((this.$outer.machine().worldTime() + 5000L) * 60L * 60L / 1000L)) : luaValue;
/*    */     }
/*    */     
/*    */     private final int getField$1(String key, int d, LuaTable table$1) {
/*    */       LuaValue res = table$1.get(key);
/*    */       if (d < 0)
/*    */         throw new Exception((new StringBuilder()).append("field '").append(key).append("' missing in date table").toString()); 
/*    */       return res.isint() ? res.toint() : d;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\OSAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */