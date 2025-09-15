/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.time.format.TextStyle;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import li.cil.repack.org.luaj.vm2.Buffer;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OsLib
/*     */   extends TwoArgFunction
/*     */ {
/*     */   public static final String TMP_PREFIX = ".luaj";
/*     */   public static final String TMP_SUFFIX = "tmp";
/*     */   private static final int CLOCK = 0;
/*     */   private static final int DATE = 1;
/*     */   private static final int DIFFTIME = 2;
/*     */   private static final int EXECUTE = 3;
/*     */   private static final int EXIT = 4;
/*     */   private static final int GETENV = 5;
/*     */   private static final int REMOVE = 6;
/*     */   private static final int RENAME = 7;
/*     */   private static final int SETLOCALE = 8;
/*     */   private static final int TIME = 9;
/*     */   private static final int TMPNAME = 10;
/* 115 */   private static final String[] NAMES = new String[] { "clock", "date", "difftime", "execute", "exit", "getenv", "remove", "rename", "setlocale", "time", "tmpname" };
/*     */ 
/*     */   
/* 118 */   private static final long t0 = System.currentTimeMillis();
/* 119 */   private static long tmpnames = t0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Globals globals;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/* 141 */     this.globals = env.checkglobals();
/* 142 */     LuaTable os = new LuaTable();
/* 143 */     for (int i = 0; i < NAMES.length; i++)
/* 144 */       os.set(NAMES[i], (LuaValue)new OsLibFunc(i, NAMES[i])); 
/* 145 */     env.set("os", (LuaValue)os);
/* 146 */     if (!env.get("package").isnil())
/* 147 */       env.get("package").get("loaded").set("os", (LuaValue)os); 
/* 148 */     return (LuaValue)os;
/*     */   }
/*     */   
/*     */   class OsLibFunc extends VarArgFunction {
/*     */     public OsLibFunc(int opcode, String name) {
/* 153 */       this.opcode = opcode;
/* 154 */       this.name = name; } public Varargs invoke(Varargs args) {
/*     */       try {
/*     */         String str1;
/*     */         String val;
/*     */         String s;
/*     */         long t;
/* 160 */         switch (this.opcode) {
/*     */           case 0:
/* 162 */             return (Varargs)valueOf(OsLib.this.clock());
/*     */           case 1:
/* 164 */             str1 = args.optjstring(1, "%c");
/* 165 */             t = args.isnumber(2) ? args.tolong(2) : OsLib.this.time((LuaTable)null);
/* 166 */             if (str1.equals("*t")) {
/* 167 */               Calendar d = Calendar.getInstance();
/* 168 */               d.setTime(new Date(t * 1000L));
/* 169 */               LuaTable tbl = LuaValue.tableOf();
/* 170 */               tbl.set("year", (LuaValue)LuaValue.valueOf(d.get(1)));
/* 171 */               tbl.set("month", (LuaValue)LuaValue.valueOf(d.get(2) + 1));
/* 172 */               tbl.set("day", (LuaValue)LuaValue.valueOf(d.get(5)));
/* 173 */               tbl.set("hour", (LuaValue)LuaValue.valueOf(d.get(11)));
/* 174 */               tbl.set("min", (LuaValue)LuaValue.valueOf(d.get(12)));
/* 175 */               tbl.set("sec", (LuaValue)LuaValue.valueOf(d.get(13)));
/* 176 */               tbl.set("wday", (LuaValue)LuaValue.valueOf(d.get(7)));
/* 177 */               tbl.set("yday", (LuaValue)LuaValue.valueOf(d.get(6)));
/* 178 */               tbl.set("isdst", (LuaValue)LuaValue.valueOf(OsLib.this.isDaylightSavingsTime(d)));
/* 179 */               return (Varargs)tbl;
/*     */             } 
/* 181 */             return (Varargs)valueOf(OsLib.date(str1, (t == -1L) ? OsLib.this.time((LuaTable)null) : t));
/*     */           
/*     */           case 2:
/* 184 */             return (Varargs)valueOf(OsLib.this.difftime(args.checkdouble(1), args.checkdouble(2)));
/*     */           case 3:
/* 186 */             return OsLib.this.execute(args.optjstring(1, null));
/*     */           case 4:
/* 188 */             OsLib.this.exit(args.optint(1, 0));
/* 189 */             return (Varargs)NONE;
/*     */           case 5:
/* 191 */             val = OsLib.this.getenv(args.checkjstring(1));
/* 192 */             return (val != null) ? (Varargs)valueOf(val) : (Varargs)NIL;
/*     */           
/*     */           case 6:
/* 195 */             OsLib.this.remove(args.checkjstring(1));
/* 196 */             return (Varargs)LuaValue.TRUE;
/*     */           case 7:
/* 198 */             OsLib.this.rename(args.checkjstring(1), args.checkjstring(2));
/* 199 */             return (Varargs)LuaValue.TRUE;
/*     */           case 8:
/* 201 */             s = OsLib.this.setlocale(args.optjstring(1, null), args.optjstring(2, "all"));
/* 202 */             return (s != null) ? (Varargs)valueOf(s) : (Varargs)NIL;
/*     */           
/*     */           case 9:
/* 205 */             return (Varargs)valueOf(OsLib.this.time(args.opttable(1, null)));
/*     */           case 10:
/* 207 */             return (Varargs)valueOf(OsLib.this.tmpname());
/*     */         } 
/* 209 */         return (Varargs)NONE;
/* 210 */       } catch (IOException e) {
/* 211 */         return varargsOf(NIL, (Varargs)valueOf(e.getMessage()));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected double clock() {
/* 222 */     return (System.currentTimeMillis() - t0) / 1000.0D;
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
/*     */   protected double difftime(double t2, double t1) {
/* 234 */     return t2 - t1;
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
/*     */   private static String date(String format, long timeInSec) {
/* 255 */     Calendar d = Calendar.getInstance();
/* 256 */     d.setTime(new Date(timeInSec * 1000L));
/* 257 */     if (format.startsWith("!")) {
/* 258 */       timeInSec -= timeZoneOffset(d);
/* 259 */       d.setTime(new Date(timeInSec * 1000L));
/* 260 */       format = format.substring(1);
/*     */     } 
/* 262 */     byte[] fmt = format.getBytes();
/* 263 */     int n = fmt.length;
/*     */     
/* 265 */     Buffer result = new Buffer(n);
/* 266 */     for (int i = 0; i < n; i++) {
/* 267 */       String conv; byte c = fmt[i];
/* 268 */       switch (c) {
/*     */         case 10:
/* 270 */           result.append("\n");
/*     */           break;
/*     */         case 37:
/* 273 */           if (++i >= n)
/*     */             break; 
/* 275 */           conv = Character.toString((char)fmt[i]);
/* 276 */           if (CONVERTERS.containsKey(conv)) {
/* 277 */             result.append(((DateConversion)CONVERTERS.get(conv)).convert(d)); break;
/*     */           } 
/* 279 */           LuaValue.argerror(1, "invalid conversion specifier '%" + conv + "'");
/*     */           break;
/*     */         
/*     */         default:
/* 283 */           result.append(c);
/*     */           break;
/*     */       } 
/*     */     } 
/* 287 */     return result.tojstring();
/*     */   }
/*     */   
/* 290 */   private static final String[] WeekdayNameAbbrev = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
/* 291 */   private static final String[] WeekdayName = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
/*     */   
/* 293 */   private static final String[] MonthNameAbbrev = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
/*     */   
/* 295 */   private static final String[] MonthName = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 302 */   private static final Map<String, DateConversion> CONVERTERS = new HashMap<>();
/*     */   static {
/* 304 */     CONVERTERS.put("%", d -> "%");
/* 305 */     CONVERTERS.put("a", d -> WeekdayNameAbbrev[d.get(7) - 1]);
/* 306 */     CONVERTERS.put("A", d -> WeekdayName[d.get(7) - 1]);
/* 307 */     CONVERTERS.put("b", d -> MonthNameAbbrev[d.get(2)]);
/* 308 */     CONVERTERS.put("B", d -> MonthName[d.get(2)]);
/* 309 */     CONVERTERS.put("c", d -> date("%a %b %e %H:%M:%S %Y", d.getTimeInMillis() / 1000L));
/* 310 */     CONVERTERS.put("C", d -> String.valueOf(d.get(1)).substring(0, 2));
/* 311 */     CONVERTERS.put("d", d -> String.valueOf(100 + d.get(5)).substring(1));
/* 312 */     CONVERTERS.put("D", d -> date("%m/%d/%y", d.getTimeInMillis() / 1000L));
/* 313 */     CONVERTERS.put("e", d -> String.format("%2d", new Object[] { Integer.valueOf(d.get(5)) }));
/* 314 */     CONVERTERS.put("F", d -> date("%Y-%m-%d", d.getTimeInMillis() / 1000L));
/* 315 */     CONVERTERS.put("g", d -> String.valueOf(d.get(1)).substring(2));
/* 316 */     CONVERTERS.put("G", d -> String.valueOf(d.get(1)));
/* 317 */     CONVERTERS.put("h", d -> MonthNameAbbrev[d.get(2)]);
/* 318 */     CONVERTERS.put("H", d -> String.valueOf(100 + d.get(11)).substring(1));
/* 319 */     CONVERTERS.put("I", d -> String.valueOf(100 + d.get(11) % 12).substring(1));
/*     */     
/* 321 */     CONVERTERS.put("j", d -> {
/*     */           Calendar y0 = beginningOfYear(d);
/*     */           int dayOfYear = (int)((d.getTimeInMillis() - y0.getTimeInMillis()) / 86400000L);
/*     */           return String.valueOf(1001 + dayOfYear).substring(1);
/*     */         });
/* 326 */     CONVERTERS.put("m", d -> String.valueOf(101 + d.get(2)).substring(1));
/* 327 */     CONVERTERS.put("M", d -> String.valueOf(100 + d.get(12)).substring(1));
/* 328 */     CONVERTERS.put("n", d -> "\n");
/* 329 */     CONVERTERS.put("p", d -> (d.get(11) < 12) ? "AM" : "PM");
/* 330 */     CONVERTERS.put("r", d -> date("%I:%M:%S %p", d.getTimeInMillis() / 1000L));
/* 331 */     CONVERTERS.put("R", d -> date("%H:%M", d.getTimeInMillis() / 1000L));
/* 332 */     CONVERTERS.put("S", d -> String.valueOf(100 + d.get(13)).substring(1));
/* 333 */     CONVERTERS.put("t", d -> "\t");
/* 334 */     CONVERTERS.put("T", d -> date("%H:%M:%S", d.getTimeInMillis() / 1000L));
/* 335 */     CONVERTERS.put("u", d -> String.valueOf((d.get(7) + 6) % 7));
/* 336 */     CONVERTERS.put("U", d -> String.valueOf(weekNumber(d, 0)));
/* 337 */     CONVERTERS.put("V", d -> String.valueOf(weekNumber(d, 0)));
/* 338 */     CONVERTERS.put("w", d -> String.valueOf((d.get(7) + 6) % 7));
/* 339 */     CONVERTERS.put("W", d -> String.valueOf(weekNumber(d, 1)));
/* 340 */     CONVERTERS.put("x", d -> date("%m/%d/%y", d.getTimeInMillis() / 1000L));
/* 341 */     CONVERTERS.put("X", d -> date("%H:%M:%S", d.getTimeInMillis() / 1000L));
/* 342 */     CONVERTERS.put("y", d -> String.valueOf(d.get(1)).substring(2));
/* 343 */     CONVERTERS.put("Y", d -> String.valueOf(d.get(1)));
/* 344 */     CONVERTERS.put("z", d -> {
/*     */           int tzo = timeZoneOffset(d) / 60;
/*     */           int a = Math.abs(tzo);
/*     */           String h = String.valueOf(100 + a / 60).substring(1);
/*     */           String m = String.valueOf(100 + a % 60).substring(1);
/*     */           return ((tzo >= 0) ? "+" : "-") + h + m;
/*     */         });
/* 351 */     CONVERTERS.put("Z", d -> d.getTimeZone().toZoneId().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
/*     */   }
/*     */   
/*     */   private static Calendar beginningOfYear(Calendar d) {
/* 355 */     Calendar y0 = Calendar.getInstance();
/* 356 */     y0.setTime(d.getTime());
/* 357 */     y0.set(2, 0);
/* 358 */     y0.set(5, 1);
/* 359 */     y0.set(11, 0);
/* 360 */     y0.set(12, 0);
/* 361 */     y0.set(13, 0);
/* 362 */     y0.set(14, 0);
/* 363 */     return y0;
/*     */   }
/*     */   
/*     */   private static int weekNumber(Calendar d, int startDay) {
/* 367 */     Calendar y0 = beginningOfYear(d);
/* 368 */     y0.set(5, 1 + (startDay + 8 - y0.get(7)) % 7);
/* 369 */     if (y0.after(d)) {
/* 370 */       y0.set(1, y0.get(1) - 1);
/* 371 */       y0.set(5, 1 + (startDay + 8 - y0.get(7)) % 7);
/*     */     } 
/* 373 */     long dt = d.getTime().getTime() - y0.getTime().getTime();
/* 374 */     return 1 + (int)(dt / 604800000L);
/*     */   }
/*     */   
/*     */   private static int timeZoneOffset(Calendar d) {
/* 378 */     int localStandarTimeMillis = (d.get(11) * 3600 + d.get(12) * 60 + d.get(13)) * 1000;
/*     */     
/* 380 */     return d.getTimeZone().getOffset(1, d.get(1), d.get(2), d.get(5), d
/* 381 */         .get(7), localStandarTimeMillis) / 1000;
/*     */   }
/*     */   
/*     */   private boolean isDaylightSavingsTime(Calendar d) {
/* 385 */     return (timeZoneOffset(d) != d.getTimeZone().getRawOffset() / 1000);
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
/*     */   protected Varargs execute(String command) {
/* 397 */     return varargsOf(NIL, (LuaValue)valueOf("exit"), (Varargs)ONE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void exit(int code) {
/* 407 */     System.exit(code);
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
/*     */   protected String getenv(String varname) {
/* 428 */     return System.getProperty(varname);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void remove(String filename) throws IOException {
/* 439 */     throw new IOException("not implemented");
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
/*     */   protected void rename(String oldname, String newname) throws IOException {
/* 451 */     throw new IOException("not implemented");
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
/*     */   
/*     */   protected String setlocale(String locale, String category) {
/* 473 */     return "C";
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
/*     */   protected long time(LuaTable table) {
/*     */     Date d;
/* 488 */     if (table == null) {
/* 489 */       d = new Date();
/*     */     } else {
/* 491 */       Calendar c = Calendar.getInstance();
/* 492 */       c.set(1, table.get("year").checkint());
/* 493 */       c.set(2, table.get("month").checkint() - 1);
/* 494 */       c.set(5, table.get("day").checkint());
/* 495 */       c.set(11, table.get("hour").optint(12));
/* 496 */       c.set(12, table.get("min").optint(0));
/* 497 */       c.set(13, table.get("sec").optint(0));
/* 498 */       c.set(14, 0);
/* 499 */       d = c.getTime();
/*     */     } 
/* 501 */     return d.getTime() / 1000L;
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
/*     */   protected String tmpname() {
/* 518 */     synchronized (OsLib.class) {
/* 519 */       return ".luaj" + tmpnames++ + "tmp";
/*     */     } 
/*     */   }
/*     */   
/*     */   private static interface DateConversion {
/*     */     String convert(Calendar param1Calendar);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\OsLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */