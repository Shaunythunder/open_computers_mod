/*     */ package li.cil.oc.server.machine.luac;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001!2A!\001\002\001\037\t)qjU!Q\023*\0211\001B\001\005YV\f7M\003\002\006\r\0059Q.Y2iS:,'BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\0051q\025\r^5wK2+\030-\021)J\021%)\002A!A!\002\0231\022$A\003po:,'\017\005\002\022/%\021\001D\001\002\026\035\006$\030N^3Mk\006\f%o\0315ji\026\034G/\036:f\023\t)\"\003C\003\034\001\021\005A$\001\004=S:LGO\020\013\003;y\001\"!\005\001\t\013UQ\002\031\001\f\t\013\001\002A\021I\021\002\025%t\027\016^5bY&TX\rF\001#!\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\005\021)f.\033;")
/*     */ public class OSAPI extends NativeLuaAPI {
/*     */   public OSAPI(NativeLuaArchitecture owner) {
/*   7 */     super(owner);
/*     */   }
/*     */   
/*     */   public void initialize() {
/*  11 */     lua().getGlobal("os");
/*     */ 
/*     */ 
/*     */     
/*  15 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new OSAPI$$anonfun$initialize$1(this));
/*     */ 
/*     */ 
/*     */     
/*  19 */     lua().setField(-2, "clock");
/*     */ 
/*     */     
/*  22 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new OSAPI$$anonfun$initialize$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     lua().setField(-2, "date");
/*     */ 
/*     */     
/*  66 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new OSAPI$$anonfun$initialize$3(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     lua().setField(-2, "time");
/*     */ 
/*     */     
/* 106 */     lua().pop(1);
/*     */   }
/*     */   
/*     */   public final class OSAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public OSAPI$$anonfun$initialize$1(OSAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushNumber(this.$outer.machine().cpuTime());
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class OSAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public OSAPI$$anonfun$initialize$2(OSAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String format = (lua.getTop() > 0 && lua.isString(1)) ? lua.toString(1) : "%d/%m/%y %H:%M:%S";
/*     */       double time = (lua.getTop() > 1 && lua.isNumber(2)) ? lua.toNumber(2) : (((this.$outer.machine().worldTime() + 6000L) * 60L * 60L) / 1000.0D);
/*     */       GameTimeFormatter.DateTime dt = GameTimeFormatter$.MODULE$.parse(time);
/*     */       if (format.startsWith("!")) {
/*     */         fmt$1(format.substring(1), dt, lua);
/*     */       } else {
/*     */         fmt$1(format, dt, lua);
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */     
/*     */     private final void fmt$1(String format, GameTimeFormatter.DateTime dt$1, LuaState lua$1) {
/*     */       String str = "*t";
/*     */       if (format == null) {
/*     */         if (str != null)
/*     */           lua$1.pushString(GameTimeFormatter$.MODULE$.format(format, dt$1)); 
/*     */       } else {
/*     */         if (format.equals(str)) {
/*     */           lua$1.newTable(0, 8);
/*     */           lua$1.pushInteger(dt$1.year());
/*     */           lua$1.setField(-2, "year");
/*     */           lua$1.pushInteger(dt$1.month());
/*     */           lua$1.setField(-2, "month");
/*     */           lua$1.pushInteger(dt$1.day());
/*     */           lua$1.setField(-2, "day");
/*     */           lua$1.pushInteger(dt$1.hour());
/*     */           lua$1.setField(-2, "hour");
/*     */           lua$1.pushInteger(dt$1.minute());
/*     */           lua$1.setField(-2, "min");
/*     */           lua$1.pushInteger(dt$1.second());
/*     */           lua$1.setField(-2, "sec");
/*     */           lua$1.pushInteger(dt$1.weekDay());
/*     */           lua$1.setField(-2, "wday");
/*     */           lua$1.pushInteger(dt$1.yearDay());
/*     */           lua$1.setField(-2, "yday");
/*     */           return;
/*     */         } 
/*     */         lua$1.pushString(GameTimeFormatter$.MODULE$.format(format, dt$1));
/*     */       } 
/*     */       lua$1.newTable(0, 8);
/*     */       lua$1.pushInteger(dt$1.year());
/*     */       lua$1.setField(-2, "year");
/*     */       lua$1.pushInteger(dt$1.month());
/*     */       lua$1.setField(-2, "month");
/*     */       lua$1.pushInteger(dt$1.day());
/*     */       lua$1.setField(-2, "day");
/*     */       lua$1.pushInteger(dt$1.hour());
/*     */       lua$1.setField(-2, "hour");
/*     */       lua$1.pushInteger(dt$1.minute());
/*     */       lua$1.setField(-2, "min");
/*     */       lua$1.pushInteger(dt$1.second());
/*     */       lua$1.setField(-2, "sec");
/*     */       lua$1.pushInteger(dt$1.weekDay());
/*     */       lua$1.setField(-2, "wday");
/*     */       lua$1.pushInteger(dt$1.yearDay());
/*     */       lua$1.setField(-2, "yday");
/*     */     }
/*     */   }
/*     */   
/*     */   public final class OSAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public OSAPI$$anonfun$initialize$3(OSAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       if (lua.isNoneOrNil(1)) {
/*     */         lua.pushNumber(((this.$outer.machine().worldTime() + 5000L) * 60L * 60L) / 1000.0D);
/*     */       } else {
/*     */         lua.checkType(1, LuaType.TABLE);
/*     */         lua.setTop(1);
/*     */         int sec = getField$1("sec", 0, lua);
/*     */         int min = getField$1("min", 0, lua);
/*     */         int hour = getField$1("hour", 12, lua);
/*     */         int mday = getField$1("day", -1, lua);
/*     */         int mon = getField$1("month", -1, lua);
/*     */         int year = getField$1("year", -1, lua);
/*     */         Option option = GameTimeFormatter$.MODULE$.mktime(year, mon, mday, hour, min, sec);
/*     */         if (option instanceof Some) {
/*     */           Some some = (Some)option;
/*     */           int time = BoxesRunTime.unboxToInt(some.x());
/*     */           lua.pushNumber(time);
/*     */           BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         } else {
/*     */           lua.pushNil();
/*     */           BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         } 
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */     
/*     */     private final int getField$1(String key, int d, LuaState lua$2) {
/*     */       lua$2.getField(-1, key);
/*     */       Long res = lua$2.toIntegerX(-1);
/*     */       lua$2.pop(1);
/*     */       if (d < 0)
/*     */         throw new Exception((new StringBuilder()).append("field '").append(key).append("' missing in date table").toString()); 
/*     */       return (res == null) ? d : res.intValue();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\OSAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */