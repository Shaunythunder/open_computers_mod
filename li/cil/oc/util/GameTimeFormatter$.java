/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class GameTimeFormatter$ {
/*     */   public static final GameTimeFormatter$ MODULE$;
/*     */   private final String[] li$cil$oc$util$GameTimeFormatter$$weekDays;
/*     */   private final String[] li$cil$oc$util$GameTimeFormatter$$shortWeekDays;
/*     */   
/*  12 */   public String[] li$cil$oc$util$GameTimeFormatter$$weekDays() { return this.li$cil$oc$util$GameTimeFormatter$$weekDays; } private final String[] li$cil$oc$util$GameTimeFormatter$$months; private final String[] li$cil$oc$util$GameTimeFormatter$$shortMonths; private final String[] li$cil$oc$util$GameTimeFormatter$$amPm; private final Map<Object, Function1<GameTimeFormatter.DateTime, String>> specifiers; public String[] li$cil$oc$util$GameTimeFormatter$$shortWeekDays() {
/*  13 */     return this.li$cil$oc$util$GameTimeFormatter$$shortWeekDays; }
/*  14 */   public String[] li$cil$oc$util$GameTimeFormatter$$months() { return this.li$cil$oc$util$GameTimeFormatter$$months; }
/*  15 */   public String[] li$cil$oc$util$GameTimeFormatter$$shortMonths() { return this.li$cil$oc$util$GameTimeFormatter$$shortMonths; } public String[] li$cil$oc$util$GameTimeFormatter$$amPm() {
/*  16 */     return this.li$cil$oc$util$GameTimeFormatter$$amPm;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<Object, Function1<GameTimeFormatter.DateTime, String>> specifiers() {
/*  23 */     return this.specifiers;
/*  24 */   } public final class GameTimeFormatter$$anonfun$1 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.li$cil$oc$util$GameTimeFormatter$$shortWeekDays()[t.weekDay() - 1]; } } public final class GameTimeFormatter$$anonfun$2 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  25 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.li$cil$oc$util$GameTimeFormatter$$weekDays()[t.weekDay() - 1]; } } public final class GameTimeFormatter$$anonfun$3 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  26 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.li$cil$oc$util$GameTimeFormatter$$shortMonths()[t.month() - 1]; } } public final class GameTimeFormatter$$anonfun$4 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  27 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.li$cil$oc$util$GameTimeFormatter$$months()[t.month() - 1]; } } public final class GameTimeFormatter$$anonfun$5 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  28 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%a %b %e %H:%M:%S %Y", t); } } public final class GameTimeFormatter$$anonfun$6 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  29 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$14 = t.year() / 100; return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$14) })); } } public final class GameTimeFormatter$$anonfun$7 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  30 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$15 = t.day(); return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$15) })); } } public final class GameTimeFormatter$$anonfun$8 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  31 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%m/%d/%y", t); } } public final class GameTimeFormatter$$anonfun$9 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  32 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$16 = t.day(); return (new StringOps("%2d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$16) })); } } public final class GameTimeFormatter$$anonfun$10 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(GameTimeFormatter.DateTime t) {
/*  33 */       return GameTimeFormatter$.MODULE$.format("%Y-%m-%d", t);
/*     */     } }
/*     */   public final class GameTimeFormatter$$anonfun$11 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  36 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%b", t); } } public final class GameTimeFormatter$$anonfun$12 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  37 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$17 = t.hour(); return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$17) })); } } public final class GameTimeFormatter$$anonfun$13 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  38 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$18 = (t.hour() + 11) % 12 + 1; return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$18) })); } } public final class GameTimeFormatter$$anonfun$14 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  39 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$19 = t.yearDay(); return (new StringOps("%03d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$19) })); } } public final class GameTimeFormatter$$anonfun$15 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  40 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$20 = t.month(); return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$20) })); } } public final class GameTimeFormatter$$anonfun$16 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  41 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$21 = t.minute(); return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$21) })); } } public final class GameTimeFormatter$$anonfun$17 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  42 */     public final String apply(GameTimeFormatter.DateTime t) { return "\n"; } } public final class GameTimeFormatter$$anonfun$18 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  43 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.li$cil$oc$util$GameTimeFormatter$$amPm()[(t.hour() < 12) ? 0 : 1]; } } public final class GameTimeFormatter$$anonfun$19 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  44 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%I:%M:%S %p", t); } } public final class GameTimeFormatter$$anonfun$20 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  45 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%H:%M", t); } } public final class GameTimeFormatter$$anonfun$21 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  46 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$22 = t.second(); return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$22) })); } } public final class GameTimeFormatter$$anonfun$22 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  47 */     public final String apply(GameTimeFormatter.DateTime t) { return "\t"; } } public final class GameTimeFormatter$$anonfun$23 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(GameTimeFormatter.DateTime t) {
/*  48 */       return GameTimeFormatter$.MODULE$.format("%H:%M:%S", t);
/*     */     } }
/*     */   public final class GameTimeFormatter$$anonfun$24 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final String apply(GameTimeFormatter.DateTime t) {
/*  52 */       (new String[2])[0] = ""; (new String[2])[1] = ""; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(t.weekDay() - 1) }));
/*     */     } } public final class GameTimeFormatter$$anonfun$25 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  54 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%D", t); } } public final class GameTimeFormatter$$anonfun$26 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  55 */     public final String apply(GameTimeFormatter.DateTime t) { return GameTimeFormatter$.MODULE$.format("%T", t); } } public final class GameTimeFormatter$$anonfun$27 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*  56 */     public final String apply(GameTimeFormatter.DateTime t) { int arg$macro$23 = t.year() % 100; return (new StringOps("%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$23) })); } } public final class GameTimeFormatter$$anonfun$28 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(GameTimeFormatter.DateTime t) {
/*  57 */       int arg$macro$24 = t.year(); return (new StringOps("%04d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$24) }));
/*     */     } } public final class GameTimeFormatter$$anonfun$29 extends AbstractFunction1<GameTimeFormatter.DateTime, String> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final String apply(GameTimeFormatter.DateTime t) {
/*  60 */       return "%";
/*     */     } }
/*     */   
/*     */   public GameTimeFormatter.DateTime parse(double time) {
/*  64 */     GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
/*  65 */     calendar.setTimeInMillis((long)(time * 'Ϩ'));
/*     */     
/*  67 */     return new GameTimeFormatter.DateTime(
/*  68 */         calendar.get(1), 
/*  69 */         calendar.get(2) + 1, 
/*  70 */         calendar.get(5), 
/*  71 */         calendar.get(7), 
/*  72 */         calendar.get(6), 
/*  73 */         calendar.get(11), 
/*  74 */         calendar.get(12), 
/*  75 */         calendar.get(13));
/*     */   }
/*     */   
/*     */   public String format(String format, GameTimeFormatter.DateTime time) {
/*  79 */     StringBuilder result = new StringBuilder();
/*  80 */     Iterator iterator = (new StringOps(scala.Predef$.MODULE$.augmentString(format))).iterator();
/*  81 */     while (iterator.hasNext()) {
/*  82 */       char c = BoxesRunTime.unboxToChar(iterator.next()); switch (c) { case '%':
/*  83 */           if (iterator.hasNext())
/*  84 */           { BoxedUnit boxedUnit; Option option = specifiers().get(iterator.next());
/*  85 */             if (option instanceof Some) { Some some = (Some)option; Function1 specifier = (Function1)some.x(); StringBuilder stringBuilder = result.append((String)specifier.apply(time)); }
/*  86 */             else { boxedUnit = BoxedUnit.UNIT; }  } 
/*     */         default:
/*  88 */           break; }  result.append(c);
/*     */     } 
/*     */     
/*  91 */     return result.toString();
/*     */   }
/*     */   
/*     */   public Option<Object> mktime(int year, int mon, int mday, int hour, int min, int sec) {
/*  95 */     GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
/*  96 */     calendar.set(1, year);
/*  97 */     calendar.set(2, mon - 1);
/*  98 */     calendar.set(5, mday);
/*  99 */     calendar.set(11, hour);
/* 100 */     calendar.set(12, min);
/* 101 */     calendar.set(13, sec);
/*     */     
/* 103 */     return scala.Option$.MODULE$.apply(BoxesRunTime.boxToInteger((int)(calendar.getTimeInMillis() / 1000L)));
/*     */   } private GameTimeFormatter$() {
/* 105 */     MODULE$ = this;
/*     */     (new String[7])[0] = "Sunday";
/*     */     (new String[7])[1] = "Monday";
/*     */     (new String[7])[2] = "Tuesday";
/*     */     (new String[7])[3] = "Wednesday";
/*     */     (new String[7])[4] = "Thursday";
/*     */     (new String[7])[5] = "Friday";
/*     */     (new String[7])[6] = "Saturday";
/*     */     this.li$cil$oc$util$GameTimeFormatter$$weekDays = new String[7];
/*     */     (new String[7])[0] = "Sun";
/*     */     (new String[7])[1] = "Mon";
/*     */     (new String[7])[2] = "Tue";
/*     */     (new String[7])[3] = "Wed";
/*     */     (new String[7])[4] = "Thu";
/*     */     (new String[7])[5] = "Fri";
/*     */     (new String[7])[6] = "Sat";
/*     */     this.li$cil$oc$util$GameTimeFormatter$$shortWeekDays = new String[7];
/*     */     (new String[12])[0] = "January";
/*     */     (new String[12])[1] = "February";
/*     */     (new String[12])[2] = "March";
/*     */     (new String[12])[3] = "April";
/*     */     (new String[12])[4] = "May";
/*     */     (new String[12])[5] = "June";
/*     */     (new String[12])[6] = "July";
/*     */     (new String[12])[7] = "August";
/*     */     (new String[12])[8] = "September";
/*     */     (new String[12])[9] = "October";
/*     */     (new String[12])[10] = "November";
/*     */     (new String[12])[11] = "December";
/*     */     this.li$cil$oc$util$GameTimeFormatter$$months = new String[12];
/*     */     (new String[12])[0] = "Jan";
/*     */     (new String[12])[1] = "Feb";
/*     */     (new String[12])[2] = "Mar";
/*     */     (new String[12])[3] = "Apr";
/*     */     (new String[12])[4] = "May";
/*     */     (new String[12])[5] = "Jun";
/*     */     (new String[12])[6] = "Jul";
/*     */     (new String[12])[7] = "Aug";
/*     */     (new String[12])[8] = "Sep";
/*     */     (new String[12])[9] = "Oct";
/*     */     (new String[12])[10] = "Nov";
/*     */     (new String[12])[11] = "Dec";
/*     */     this.li$cil$oc$util$GameTimeFormatter$$shortMonths = new String[12];
/*     */     (new String[2])[0] = "AM";
/*     */     (new String[2])[1] = "PM";
/*     */     this.li$cil$oc$util$GameTimeFormatter$$amPm = new String[2];
/*     */     (new scala.Tuple2[29])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('a')), new GameTimeFormatter$$anonfun$1());
/*     */     (new scala.Tuple2[29])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('A')), new GameTimeFormatter$$anonfun$2());
/*     */     (new scala.Tuple2[29])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('b')), new GameTimeFormatter$$anonfun$3());
/*     */     (new scala.Tuple2[29])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('B')), new GameTimeFormatter$$anonfun$4());
/*     */     (new scala.Tuple2[29])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('c')), new GameTimeFormatter$$anonfun$5());
/*     */     (new scala.Tuple2[29])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('C')), new GameTimeFormatter$$anonfun$6());
/*     */     (new scala.Tuple2[29])[6] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('d')), new GameTimeFormatter$$anonfun$7());
/*     */     (new scala.Tuple2[29])[7] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('D')), new GameTimeFormatter$$anonfun$8());
/*     */     (new scala.Tuple2[29])[8] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('e')), new GameTimeFormatter$$anonfun$9());
/*     */     (new scala.Tuple2[29])[9] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('F')), new GameTimeFormatter$$anonfun$10());
/*     */     (new scala.Tuple2[29])[10] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('h')), new GameTimeFormatter$$anonfun$11());
/*     */     (new scala.Tuple2[29])[11] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('H')), new GameTimeFormatter$$anonfun$12());
/*     */     (new scala.Tuple2[29])[12] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('I')), new GameTimeFormatter$$anonfun$13());
/*     */     (new scala.Tuple2[29])[13] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('j')), new GameTimeFormatter$$anonfun$14());
/*     */     (new scala.Tuple2[29])[14] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('m')), new GameTimeFormatter$$anonfun$15());
/*     */     (new scala.Tuple2[29])[15] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('M')), new GameTimeFormatter$$anonfun$16());
/*     */     (new scala.Tuple2[29])[16] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('n')), new GameTimeFormatter$$anonfun$17());
/*     */     (new scala.Tuple2[29])[17] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('p')), new GameTimeFormatter$$anonfun$18());
/*     */     (new scala.Tuple2[29])[18] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('r')), new GameTimeFormatter$$anonfun$19());
/*     */     (new scala.Tuple2[29])[19] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('R')), new GameTimeFormatter$$anonfun$20());
/*     */     (new scala.Tuple2[29])[20] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('S')), new GameTimeFormatter$$anonfun$21());
/*     */     (new scala.Tuple2[29])[21] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('t')), new GameTimeFormatter$$anonfun$22());
/*     */     (new scala.Tuple2[29])[22] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('T')), new GameTimeFormatter$$anonfun$23());
/*     */     (new scala.Tuple2[29])[23] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('w')), new GameTimeFormatter$$anonfun$24());
/*     */     (new scala.Tuple2[29])[24] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('x')), new GameTimeFormatter$$anonfun$25());
/*     */     (new scala.Tuple2[29])[25] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('X')), new GameTimeFormatter$$anonfun$26());
/*     */     (new scala.Tuple2[29])[26] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('y')), new GameTimeFormatter$$anonfun$27());
/*     */     (new scala.Tuple2[29])[27] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('Y')), new GameTimeFormatter$$anonfun$28());
/*     */     (new scala.Tuple2[29])[28] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToCharacter('%')), new GameTimeFormatter$$anonfun$29());
/*     */     this.specifiers = (Map<Object, Function1<GameTimeFormatter.DateTime, String>>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[29]));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\GameTimeFormatter$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */