/*     */ package li.cil.oc.util;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ @ScalaSignature(bytes = "\006\001\r=s!B\001\003\021\003Y\021a\003)bG.,GmQ8m_JT!a\001\003\002\tU$\030\016\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!a\003)bG.,GmQ8m_J\034\"!\004\t\021\005E!R\"\001\n\013\003M\tQa]2bY\006L!!\006\n\003\r\005s\027PU3g\021\0259R\002\"\001\031\003\031a\024N\\5u}Q\t1bB\003\033\033!\0051$A\003EKB$\b\016\005\002\035;5\tQBB\003\037\033!\005qDA\003EKB$\bn\005\002\036!!)q#\bC\001CQ\t1\004C\003$;\021\005A%\001\003cSR\034HCA\023)!\t\tb%\003\002(%\t\031\021J\034;\t\013%\022\003\031\001\026\002\013\021,\007\017\0365\021\005-:dB\001\0275\035\ti\023G\004\002/_5\tA!\003\0021\t\005\031\021\r]5\n\005I\032\024\001C5oi\026\024h.\0317\013\005A\"\021BA\0337\003)!V\r\037;Ck\0324WM\035\006\003eMJ!\001O\035\003\025\r{Gn\034:EKB$\bN\003\0026m!)1(\bC\001y\0051am\034:nCR$2!PAS!\tabHB\004@\033A\005\031\021\001!\003\027\r{Gn\034:G_Jl\027\r^\n\004}\005K\005C\001\"H\033\005\031%B\001#F\003\021a\027M\\4\013\003\031\013AA[1wC&\021\001j\021\002\007\037\nTWm\031;\021\005)[U\"A\032\n\0051\033$a\003)feNL7\017^1cY\026DQA\024 \005\002=\013a\001J5oSR$C#\001)\021\005E\t\026B\001*\023\005\021)f.\033;\t\013%rd\021\001+\026\003)BQA\026 \007\002]\013q!\0338gY\006$X\r\006\002&1\")\021,\026a\001K\005)a/\0317vK\")1L\020C\0019\006Aa/\0317jI\006$X\r\006\002Q;\")\021L\027a\001=B\021Ad\030\004\005A6\001\025MA\003D_2|'o\005\003`!\t,\007CA\td\023\t!'CA\004Qe>$Wo\031;\021\005E1\027BA4\023\0051\031VM]5bY&T\030M\0317f\021!IvL!f\001\n\003IW#A\023\t\021-|&\021#Q\001\n\025\naA^1mk\026\004\003\002C7`\005+\007I\021\0018\002\023%\034\b+\0317fiR,W#A8\021\005E\001\030BA9\023\005\035\021un\0347fC:D\001b]0\003\022\003\006Ia\\\001\013SN\004\026\r\\3ui\026\004\003\"B\f`\t\003)Hc\0010wo\")\021\f\036a\001K!9Q\016\036I\001\002\004y\007bB=`\003\003%\tA_\001\005G>\004\030\020F\002_wrDq!\027=\021\002\003\007Q\005C\004nqB\005\t\031A8\t\017y|\026\023!C\001\006q1m\0349zI\021,g-Y;mi\022\nTCAA\001U\r)\0231A\026\003\003\013\001B!a\002\002\0225\021\021\021\002\006\005\003\027\ti!A\005v]\016DWmY6fI*\031\021q\002\n\002\025\005tgn\034;bi&|g.\003\003\002\024\005%!!E;oG\",7m[3e-\006\024\030.\0318dK\"I\021qC0\022\002\023\005\021\021D\001\017G>\004\030\020\n3fM\006,H\016\036\0233+\t\tYBK\002p\003\007A\021\"a\b`\003\003%\t%!\t\002\033A\024x\016Z;diB\023XMZ5y+\t\t\031\003E\002C\003KI1!a\nD\005\031\031FO]5oO\"A\0211F0\002\002\023\005\021.\001\007qe>$Wo\031;Be&$\030\020C\005\0020}\013\t\021\"\001\0022\005q\001O]8ek\016$X\t\\3nK:$H\003BA\032\003s\0012!EA\033\023\r\t9D\005\002\004\003:L\b\"CA\036\003[\t\t\0211\001&\003\rAH%\r\005\n\003y\026\021!C!\003\003\nq\002\035:pIV\034G/\023;fe\006$xN]\013\003\003\007\002b!!\022\002L\005MRBAA$\025\r\tIEE\001\013G>dG.Z2uS>t\027\002BA'\003\017\022\001\"\023;fe\006$xN\035\005\n\003#z\026\021!C\001\003'\n\001bY1o\013F,\030\r\034\013\004_\006U\003BCA\036\003\037\n\t\0211\001\0024!I\021\021L0\002\002\023\005\0231L\001\tQ\006\034\bnQ8eKR\tQ\005C\005\002`}\013\t\021\"\021\002b\005AAo\\*ue&tw\r\006\002\002$!I\021QM0\002\002\023\005\023qM\001\007KF,\030\r\\:\025\007=\fI\007\003\006\002<\005\r\024\021!a\001\003gAq!!\034?\r\003\ty'A\004eK\032d\027\r^3\025\t\005E\024q\017\t\004#\005M\024bAA;%\t!!)\037;f\021\031I\0261\016a\001=\"9\0211\020 \005\002\005u\024!D5t\rJ|W\016U1mKR$X\rF\002p\003Ba!WA=\001\004)\003bBAB}\021\005\023QQ\001\005Y>\fG\rF\002Q\003\017C\001\"!#\002\002\002\007\0211R\001\004]\n$\b\003BAG\0033k!!a$\013\t\005%\025\021\023\006\005\003'\013)*A\005nS:,7M]1gi*\021\021qS\001\004]\026$\030\002BAN\003\037\023aB\024\"U)\006<7i\\7q_VtG\rC\004\002 z\"\t%!)\002\tM\fg/\032\013\004!\006\r\006\002CAE\003;\003\r!a#\t\013%R\004\031\001\026\t\021\005%VB1A\005\n%\f\001B]*iS\032$8G\r\005\b\003[k\001\025!\003&\003%\0218\013[5giN\022\004\005\003\005\00226\021\r\021\"\003j\003!97\013[5giN\022\004bBA[\033\001\006I!J\001\nONC\027N\032;4e\001B\001\"!/\016\005\004%I![\001\tENC\027N\032;4e!9\021QX\007!\002\023)\023!\0032TQ&4Go\r\032!\021\035\t\t-\004C\005\003\007\fq!\032=ue\006\034G\017\006\003\002F\006-\007CB\t\002H\026*S%C\002\002JJ\021a\001V;qY\026\034\004BB-\002@\002\007QE\002\004\002P6\001\021\021\033\002\020'&tw\r\\3CSR4uN]7biN!\021QZ!>\021)\t).!4\003\006\004%\t![\001\006G>dwN\035\005\013\0033\fiM!A!\002\023)\023AB2pY>\024\b\005C\004\030\003\033$\t!!8\025\t\005}\027\021\035\t\0049\0055\007bBAk\0037\004\r!\n\005\bS\0055G\021IAs+\t\t9\017E\002\002j^j\021!\017\005\b-\0065G\021IAw)\r)\023q\036\005\0073\006-\b\031A\023\t\021\0055\024Q\032C!\003g$B!!\035\002v\"1\021,!=A\002y;q!!?\016\021\003\tY0A\bTS:<G.\032\"ji\032{'/\\1u!\ra\022Q \004\b\003\037l\001\022AA\000'\021\ti0a8\t\017]\ti\020\"\001\003\004Q\021\0211 \004\b\005\017i\021\021\001B\005\0055\001\026\r\\3ui\0264uN]7biN!!QA!>\021\0359\"Q\001C\001\005\033!\"Aa\004\021\007q\021)\001C\004W\005\013!\tEa\005\025\007\025\022)\002\003\004Z\005#\001\r!\n\005\b7\n\025A\021\tB\r)\r\001&1\004\005\0073\n]\001\031\0010\t\021\0055$Q\001C!\005?!B!!\035\003\"!1\021L!\bA\002yC\001\"a\037\003\006\021\005#Q\005\013\004_\n\035\002BB-\003$\001\007Q\005\003\005\003,\t\025a\021\003B\027\003\035\001\030\r\\3ui\026,\"Aa\f\021\tE\021\t$J\005\004\005g\021\"!B!se\006L\b\002\003B\034\005\013!\tB!\017\002\013\021,G\016^1\025\r\tm\"\021\tB#!\r\t\"QH\005\004\005\021\"A\002#pk\ndW\rC\004\003D\tU\002\031A\023\002\r\r|Gn\034:B\021\035\0219E!\016A\002\025\naaY8m_J\024eA\002B&\033\001\021iE\001\013NkR\f'\r\\3QC2,G\017^3G_Jl\027\r^\n\005\005\023\022y\001C\004\030\005\023\"\tA!\025\025\005\tM\003c\001\017\003J!9\021F!\023\005B\005\025\b\002\003B-\005\023\"\tAa\027\002\013\005\004\b\017\\=\025\007\025\022i\006C\004\003`\t]\003\031A\023\002\013%tG-\032=\t\021\t\r$\021\nC\001\005K\na!\0369eCR,G#\002)\003h\t%\004b\002B0\005C\002\r!\n\005\0073\n\005\004\031A\023\t\025\t-\"\021\nb\001\n#\021i\003C\005\003p\t%\003\025!\003\0030\005A\001/\0317fiR,\007\005\003\005\002\004\n%C\021\tB:)\r\001&Q\017\005\t\003\023\023\t\b1\001\002\f\"A\021q\024B%\t\003\022I\bF\002Q\005wB\001\"!#\003x\001\007\0211\022\004\007\005j\001A!!\003\031!K(M]5e\r>\024X.\031;\024\t\tu$1\013\005\b/\tuD\021\001BC)\t\0219\tE\002\035\005{B\021Ba#\003~\t\007I\021B5\002\tI,Gm\035\005\t\005\037\023i\b)A\005K\005)!/\0323tA!I!1\023B?\005\004%I![\001\007OJ,WM\\:\t\021\t]%Q\020Q\001\n\025\nqa\032:fK:\034\b\005C\005\003\034\nu$\031!C\005S\006)!\r\\;fg\"A!q\024B?A\003%Q%\001\004cYV,7\017\t\005\013\005G\023iH1A\005\n\t5\022!D:uCRL7\rU1mKR$X\rC\005\003(\nu\004\025!\003\0030\005q1\017^1uS\016\004\026\r\\3ui\026\004\003bB\025\003~\021\005\023Q\035\005\b-\nuD\021\tBW)\r)#q\026\005\0073\n-\006\031A\023\t\021\0055$Q\020C!\005g#B!!\035\0036\"1\021L!-A\002yC\001\"a\037\003~\021\005#\021\030\013\004_\nm\006BB-\0038\002\007QeB\005\003@6\t\t\021#\001\003B\006)1i\0347peB\031ADa1\007\021\001l\021\021!E\001\005\013\034RAa1\003H\026\004rA!3\003P\026zg,\004\002\003L*\031!Q\032\n\002\017I,h\016^5nK&!!\021\033Bf\005E\t%m\035;sC\016$h)\0368di&|gN\r\005\b/\t\rG\021\001Bk)\t\021\t\r\003\006\002`\t\r\027\021!C#\003CB!B!\027\003D\006\005I\021\021Bn)\025q&Q\034Bp\021\031I&\021\034a\001K!AQN!7\021\002\003\007q\016\003\006\003d\n\r\027\021!CA\005K\fq!\0368baBd\027\020\006\003\003h\nM\b#B\t\003j\n5\030b\001Bv%\t1q\n\035;j_:\004R!\005BxK=L1A!=\023\005\031!V\017\0357fe!I!Q\037Bq\003\003\005\rAX\001\004q\022\002\004B\003B}\005\007\f\n\021\"\001\002\032\005y\021\r\0359ms\022\"WMZ1vYR$#\007\003\006\003~\n\r\027\023!C\001\0033\t1\004\n7fgNLg.\033;%OJ,\027\r^3sI\021,g-Y;mi\022\022\004BCB\001\005\007\f\t\021\"\003\004\004\005Y!/Z1e%\026\034x\016\034<f)\005\t\005\002CB\004\033\t\007I\021A5\002\037\031{'/Z4s_VtGm\0255jMRDqaa\003\016A\003%Q%\001\tG_J,wM]8v]\022\034\006.\0334uA!A1qB\007C\002\023\005\021.\001\bCC\016\\wM]8v]\022l\025m]6\t\017\rMQ\002)A\005K\005y!)Y2lOJ|WO\0343NCN\\\007\005C\004\004\0305!\ta!\007\002\tA\f7m\033\013\t\0077\031\tc!\n\004*A\031\021c!\b\n\007\r}!CA\003TQ>\024H\017C\004\004$\rU\001\031\0010\002\025\031|'/Z4s_VtG\rC\004\004(\rU\001\031\0010\002\025\t\f7m[4s_VtG\r\003\004<\007+\001\r!\020\005\b\007[iA\021AB\030\003E)\007\020\036:bGR4uN]3he>,h\016\032\013\004K\rE\002\002CAk\007W\001\raa\007\t\017\rUR\002\"\001\0048\005\tR\r\037;sC\016$()Y2lOJ|WO\0343\025\007\025\032I\004\003\005\002V\016M\002\031AB\016\021\035\031i$\004C\001\007\t\001#\0368qC\016\\gi\034:fOJ|WO\0343\025\013\025\032\tea\021\t\021\005U71\ba\001\0077AaaOB\036\001\004i\004bBB$\033\021\0051\021J\001\021k:\004\030mY6CC\016\\wM]8v]\022$R!JB&\007\033B\001\"!6\004F\001\00711\004\005\007w\r\025\003\031A\037")
/*     */ public final class PackedColor { public static int unpackBackground(short paramShort, ColorFormat paramColorFormat) { return PackedColor$.MODULE$.unpackBackground(paramShort, paramColorFormat); } public static int unpackForeground(short paramShort, ColorFormat paramColorFormat) { return PackedColor$.MODULE$.unpackForeground(paramShort, paramColorFormat); } public static int extractBackground(short paramShort) { return PackedColor$.MODULE$.extractBackground(paramShort); } public static int extractForeground(short paramShort) { return PackedColor$.MODULE$.extractForeground(paramShort); } public static short pack(Color paramColor1, Color paramColor2, ColorFormat paramColorFormat) { return PackedColor$.MODULE$.pack(paramColor1, paramColor2, paramColorFormat); } public static int BackgroundMask() { return PackedColor$.MODULE$.BackgroundMask(); } public static int ForegroundShift() {
/*     */     return PackedColor$.MODULE$.ForegroundShift();
/*  11 */   } public static class Depth$ { public int bits(TextBuffer.ColorDepth depth) { TextBuffer.ColorDepth colorDepth = depth;
/*  12 */       if (TextBuffer.ColorDepth.OneBit.equals(colorDepth)) { boolean bool = true; }
/*  13 */       else if (TextBuffer.ColorDepth.FourBit.equals(colorDepth)) { byte b = 4; }
/*  14 */       else { if (TextBuffer.ColorDepth.EightBit.equals(colorDepth)) return 8; 
/*     */         throw new MatchError(colorDepth); }
/*     */       
/*  17 */       return SYNTHETIC_LOCAL_VARIABLE_3; } public static final Depth$ MODULE$; public PackedColor.ColorFormat format(TextBuffer.ColorDepth depth) { TextBuffer.ColorDepth colorDepth = depth;
/*  18 */       if (TextBuffer.ColorDepth.OneBit.equals(colorDepth)) { PackedColor.SingleBitFormat$ singleBitFormat$ = PackedColor.SingleBitFormat$.MODULE$; }
/*  19 */       else if (TextBuffer.ColorDepth.FourBit.equals(colorDepth)) { PackedColor.MutablePaletteFormat mutablePaletteFormat = new PackedColor.MutablePaletteFormat(); }
/*  20 */       else { if (TextBuffer.ColorDepth.EightBit.equals(colorDepth)) return new PackedColor.HybridFormat(); 
/*     */         throw new MatchError(colorDepth); }
/*     */       
/*     */       return (PackedColor.ColorFormat)SYNTHETIC_LOCAL_VARIABLE_3; } public Depth$() {
/*  24 */       MODULE$ = this;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class ColorFormat$class
/*     */   {
/*     */     public static void $init$(PackedColor.ColorFormat $this) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static void validate(PackedColor.ColorFormat $this, PackedColor.Color value) {
/*  41 */       if (value.isPalette()) {
/*  42 */         throw new IllegalArgumentException("color palette not supported");
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public static boolean isFromPalette(PackedColor.ColorFormat $this, int value) {
/*  48 */       return false;
/*     */     }
/*     */     public static void load(PackedColor.ColorFormat $this, NBTTagCompound nbt) {}
/*     */     public static void save(PackedColor.ColorFormat $this, NBTTagCompound nbt) {} }
/*     */   
/*     */   public static class SingleBitFormat implements ColorFormat { private final int color;
/*     */     
/*  55 */     public void validate(PackedColor.Color value) { PackedColor.ColorFormat$class.validate(this, value); } public boolean isFromPalette(int value) { return PackedColor.ColorFormat$class.isFromPalette(this, value); } public void load(NBTTagCompound nbt) { PackedColor.ColorFormat$class.load(this, nbt); } public void save(NBTTagCompound nbt) { PackedColor.ColorFormat$class.save(this, nbt); } public int color() { return this.color; } public SingleBitFormat(int color) { PackedColor.ColorFormat$class.$init$(this); } public TextBuffer.ColorDepth depth() {
/*  56 */       return TextBuffer.ColorDepth.OneBit;
/*     */     } public int inflate(int value) {
/*  58 */       return (value == 0) ? 0 : color();
/*     */     }
/*     */     public byte deflate(PackedColor.Color value) {
/*  61 */       return (byte)((value.value() == 0) ? 0 : 1);
/*     */     } }
/*     */   public static class SingleBitFormat$ extends SingleBitFormat { public static final SingleBitFormat$ MODULE$;
/*     */     public SingleBitFormat$() {
/*  65 */       super(scala.Predef$.MODULE$.Integer2int(li.cil.oc.Settings$.MODULE$.get().monochromeColor())); MODULE$ = this;
/*     */     } }
/*  67 */   public static abstract class PaletteFormat implements ColorFormat { public void load(NBTTagCompound nbt) { PackedColor.ColorFormat$class.load(this, nbt); } public void save(NBTTagCompound nbt) { PackedColor.ColorFormat$class.save(this, nbt); } public PaletteFormat() { PackedColor.ColorFormat$class.$init$(this); } public int inflate(int value) {
/*  68 */       return palette()[scala.math.package$.MODULE$.max(0, scala.math.package$.MODULE$.min((palette()).length - 1, value))];
/*     */     }
/*     */     public void validate(PackedColor.Color value) {
/*  71 */       if (value.isPalette() && (value.value() < 0 || value.value() >= (palette()).length)) {
/*  72 */         throw new IllegalArgumentException("invalid palette index");
/*     */       }
/*     */     }
/*     */     
/*     */     public byte deflate(PackedColor.Color value) {
/*  77 */       return value.isPalette() ? (byte)(scala.math.package$.MODULE$.max(0, value.value()) % (palette()).length) : 
/*  78 */         (byte)((Tuple2)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.doubleArrayOps((double[])scala.Predef$.MODULE$.intArrayOps(palette()).map((Function1)new PackedColor$PaletteFormat$$anonfun$deflate$1(this, value), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Double()))).zipWithIndex(scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).minBy((Function1)new PackedColor$PaletteFormat$$anonfun$deflate$2(this), (Ordering)scala.math.Ordering$Double$.MODULE$))._2$mcI$sp(); } public final class PackedColor$PaletteFormat$$anonfun$deflate$1 extends AbstractFunction1.mcDI.sp implements Serializable { public static final long serialVersionUID = 0L; private final PackedColor.Color value$1; public final double apply(int x$1) { return apply$mcDI$sp(x$1); } public double apply$mcDI$sp(int x$1) { return this.$outer.delta(this.value$1.value(), x$1); } public PackedColor$PaletteFormat$$anonfun$deflate$1(PackedColor.PaletteFormat $outer, PackedColor.Color value$1) {} } public final class PackedColor$PaletteFormat$$anonfun$deflate$2 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final double apply(Tuple2 x$2) { return x$2._1$mcD$sp(); }
/*     */        public PackedColor$PaletteFormat$$anonfun$deflate$2(PackedColor.PaletteFormat $outer) {} } public boolean isFromPalette(int value) {
/*  80 */       return true;
/*     */     }
/*     */     
/*     */     public double delta(int colorA, int colorB)
/*     */     {
/*  85 */       Tuple3<Object, Object, Object> tuple3 = PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$extract(colorA); if (tuple3 != null) { int rA = BoxesRunTime.unboxToInt(tuple3._1()), gA = BoxesRunTime.unboxToInt(tuple3._2()), bA = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(rA), BoxesRunTime.boxToInteger(gA), BoxesRunTime.boxToInteger(bA)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/*  86 */         Tuple3<Object, Object, Object> tuple33 = PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$extract(colorB); if (tuple33 != null) { int rB = BoxesRunTime.unboxToInt(tuple33._1()), gB = BoxesRunTime.unboxToInt(tuple33._2()), bB = BoxesRunTime.unboxToInt(tuple33._3()); Tuple3 tuple35 = new Tuple3(BoxesRunTime.boxToInteger(rB), BoxesRunTime.boxToInteger(gB), BoxesRunTime.boxToInteger(bB)), tuple34 = tuple35; int m = BoxesRunTime.unboxToInt(tuple34._1()), n = BoxesRunTime.unboxToInt(tuple34._2()), i1 = BoxesRunTime.unboxToInt(tuple34._3());
/*  87 */           int dr = i - m;
/*  88 */           int dg = j - n;
/*  89 */           int db = k - i1;
/*  90 */           return 0.2126D * dr * dr + 0.7152D * dg * dg + 0.0722D * db * db; }
/*     */         
/*     */         throw new MatchError(tuple33); }
/*     */       
/*     */       throw new MatchError(tuple3); } public abstract int[] palette(); } public static class MutablePaletteFormat extends PaletteFormat { public TextBuffer.ColorDepth depth() {
/*  95 */       return TextBuffer.ColorDepth.FourBit;
/*     */     } public int apply(int index) {
/*  97 */       return palette()[index];
/*     */     } public void update(int index, int value) {
/*  99 */       palette()[index] = value;
/*     */     }
/* 101 */     private final int[] palette = new int[] { 
/* 102 */         16777215, 16763955, 13395660, 6724095, 
/* 103 */         16777011, 3394611, 16737945, 3355443, 
/* 104 */         13421772, 3368601, 10040268, 3355545, 
/* 105 */         6697728, 3368448, 16724787, 0 }; public int[] palette() {
/*     */       return this.palette;
/*     */     } public void load(NBTTagCompound nbt) {
/* 108 */       int[] loaded = nbt.func_74759_k("palette");
/* 109 */       scala.Array$.MODULE$.copy(loaded, 0, palette(), 0, scala.math.package$.MODULE$.min(loaded.length, (palette()).length));
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 113 */       nbt.func_74783_a("palette", palette());
/*     */     } }
/*     */   public static class HybridFormat extends MutablePaletteFormat { private final int li$cil$oc$util$PackedColor$HybridFormat$$reds; private final int li$cil$oc$util$PackedColor$HybridFormat$$greens; private final int li$cil$oc$util$PackedColor$HybridFormat$$blues;
/*     */     private final int[] li$cil$oc$util$PackedColor$HybridFormat$$staticPalette;
/*     */     
/* 118 */     public HybridFormat() { this.li$cil$oc$util$PackedColor$HybridFormat$$reds = 6;
/* 119 */       this.li$cil$oc$util$PackedColor$HybridFormat$$greens = 8;
/* 120 */       this.li$cil$oc$util$PackedColor$HybridFormat$$blues = 5;
/*     */       
/* 122 */       this.li$cil$oc$util$PackedColor$HybridFormat$$staticPalette = new int[240];
/*     */ 
/*     */       
/* 125 */       scala.Predef$.MODULE$.intArrayOps(li$cil$oc$util$PackedColor$HybridFormat$$staticPalette()).indices().foreach$mVc$sp((Function1)new PackedColor$HybridFormat$$anonfun$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 138 */       scala.Predef$.MODULE$.intArrayOps(palette()).indices().foreach$mVc$sp((Function1)new PackedColor$HybridFormat$$anonfun$2(this)); } public int li$cil$oc$util$PackedColor$HybridFormat$$reds() { return this.li$cil$oc$util$PackedColor$HybridFormat$$reds; } public int li$cil$oc$util$PackedColor$HybridFormat$$greens() { return this.li$cil$oc$util$PackedColor$HybridFormat$$greens; } public int li$cil$oc$util$PackedColor$HybridFormat$$blues() { return this.li$cil$oc$util$PackedColor$HybridFormat$$blues; } public int[] li$cil$oc$util$PackedColor$HybridFormat$$staticPalette() { return this.li$cil$oc$util$PackedColor$HybridFormat$$staticPalette; } public final class PackedColor$HybridFormat$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int index) { apply$mcVI$sp(index); } public PackedColor$HybridFormat$$anonfun$1(PackedColor.HybridFormat $outer) {} public void apply$mcVI$sp(int index) { int idxB = index % this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$blues(); int idxG = index / this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$blues() % this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$greens(); int idxR = index / this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$blues() / this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$greens() % this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$reds(); int r = (int)((idxR * 255) / (this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$reds() - 1.0D) + 0.5D); int g = (int)((idxG * 255) / (this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$greens() - 1.0D) + 0.5D); int b = (int)((idxB * 255) / (this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$blues() - 1.0D) + 0.5D); this.$outer.li$cil$oc$util$PackedColor$HybridFormat$$staticPalette()[index] = r << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$rShift32() | g << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$gShift32() | b << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$bShift32(); } } public final class PackedColor$HybridFormat$$anonfun$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public PackedColor$HybridFormat$$anonfun$2(PackedColor.HybridFormat $outer) {} public void apply$mcVI$sp(int i) {
/* 139 */         int shade = 255 * (i + 1) / ((this.$outer.palette()).length + 1);
/* 140 */         this.$outer.update(i, shade << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$rShift32() | shade << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$gShift32() | shade << PackedColor$.MODULE$.li$cil$oc$util$PackedColor$$bShift32());
/*     */       } }
/*     */     public TextBuffer.ColorDepth depth() {
/* 143 */       return TextBuffer.ColorDepth.EightBit;
/*     */     }
/*     */     public int inflate(int value) {
/* 146 */       return isFromPalette(value) ? super.inflate(value) : 
/* 147 */         li$cil$oc$util$PackedColor$HybridFormat$$staticPalette()[(value - (palette()).length) % 240];
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public byte deflate(PackedColor.Color value) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: invokespecial deflate : (Lli/cil/oc/util/PackedColor$Color;)B
/*     */       //   5: istore_2
/*     */       //   6: aload_1
/*     */       //   7: invokevirtual isPalette : ()Z
/*     */       //   10: ifeq -> 17
/*     */       //   13: iload_2
/*     */       //   14: goto -> 264
/*     */       //   17: getstatic li/cil/oc/util/PackedColor$.MODULE$ : Lli/cil/oc/util/PackedColor$;
/*     */       //   20: aload_1
/*     */       //   21: invokevirtual value : ()I
/*     */       //   24: invokevirtual li$cil$oc$util$PackedColor$$extract : (I)Lscala/Tuple3;
/*     */       //   27: astore #4
/*     */       //   29: aload #4
/*     */       //   31: ifnull -> 265
/*     */       //   34: aload #4
/*     */       //   36: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   39: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   42: istore #5
/*     */       //   44: aload #4
/*     */       //   46: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   49: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   52: istore #6
/*     */       //   54: aload #4
/*     */       //   56: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   59: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   62: istore #7
/*     */       //   64: new scala/Tuple3
/*     */       //   67: dup
/*     */       //   68: iload #5
/*     */       //   70: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   73: iload #6
/*     */       //   75: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   78: iload #7
/*     */       //   80: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   83: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   86: astore #8
/*     */       //   88: aload #8
/*     */       //   90: astore_3
/*     */       //   91: aload_3
/*     */       //   92: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   95: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   98: istore #9
/*     */       //   100: aload_3
/*     */       //   101: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   104: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   107: istore #10
/*     */       //   109: aload_3
/*     */       //   110: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   113: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   116: istore #11
/*     */       //   118: iload #9
/*     */       //   120: i2d
/*     */       //   121: aload_0
/*     */       //   122: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$reds : ()I
/*     */       //   125: i2d
/*     */       //   126: dconst_1
/*     */       //   127: dsub
/*     */       //   128: dmul
/*     */       //   129: sipush #255
/*     */       //   132: i2d
/*     */       //   133: ddiv
/*     */       //   134: ldc2_w 0.5
/*     */       //   137: dadd
/*     */       //   138: d2i
/*     */       //   139: istore #12
/*     */       //   141: iload #10
/*     */       //   143: i2d
/*     */       //   144: aload_0
/*     */       //   145: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$greens : ()I
/*     */       //   148: i2d
/*     */       //   149: dconst_1
/*     */       //   150: dsub
/*     */       //   151: dmul
/*     */       //   152: sipush #255
/*     */       //   155: i2d
/*     */       //   156: ddiv
/*     */       //   157: ldc2_w 0.5
/*     */       //   160: dadd
/*     */       //   161: d2i
/*     */       //   162: istore #13
/*     */       //   164: iload #11
/*     */       //   166: i2d
/*     */       //   167: aload_0
/*     */       //   168: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$blues : ()I
/*     */       //   171: i2d
/*     */       //   172: dconst_1
/*     */       //   173: dsub
/*     */       //   174: dmul
/*     */       //   175: sipush #255
/*     */       //   178: i2d
/*     */       //   179: ddiv
/*     */       //   180: ldc2_w 0.5
/*     */       //   183: dadd
/*     */       //   184: d2i
/*     */       //   185: istore #14
/*     */       //   187: aload_0
/*     */       //   188: invokevirtual palette : ()[I
/*     */       //   191: arraylength
/*     */       //   192: iload #12
/*     */       //   194: aload_0
/*     */       //   195: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$greens : ()I
/*     */       //   198: imul
/*     */       //   199: aload_0
/*     */       //   200: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$blues : ()I
/*     */       //   203: imul
/*     */       //   204: iadd
/*     */       //   205: iload #13
/*     */       //   207: aload_0
/*     */       //   208: invokevirtual li$cil$oc$util$PackedColor$HybridFormat$$blues : ()I
/*     */       //   211: imul
/*     */       //   212: iadd
/*     */       //   213: iload #14
/*     */       //   215: iadd
/*     */       //   216: i2b
/*     */       //   217: istore #15
/*     */       //   219: aload_0
/*     */       //   220: aload_0
/*     */       //   221: iload #15
/*     */       //   223: sipush #255
/*     */       //   226: iand
/*     */       //   227: invokevirtual inflate : (I)I
/*     */       //   230: aload_1
/*     */       //   231: invokevirtual value : ()I
/*     */       //   234: invokevirtual delta : (II)D
/*     */       //   237: aload_0
/*     */       //   238: aload_0
/*     */       //   239: iload_2
/*     */       //   240: sipush #255
/*     */       //   243: iand
/*     */       //   244: invokevirtual inflate : (I)I
/*     */       //   247: aload_1
/*     */       //   248: invokevirtual value : ()I
/*     */       //   251: invokevirtual delta : (II)D
/*     */       //   254: dcmpg
/*     */       //   255: ifge -> 263
/*     */       //   258: iload #15
/*     */       //   260: goto -> 264
/*     */       //   263: iload_2
/*     */       //   264: ireturn
/*     */       //   265: new scala/MatchError
/*     */       //   268: dup
/*     */       //   269: aload #4
/*     */       //   271: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   274: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #150	-> 0
/*     */       //   #151	-> 6
/*     */       //   #153	-> 17
/*     */       //   #154	-> 118
/*     */       //   #155	-> 141
/*     */       //   #156	-> 164
/*     */       //   #157	-> 187
/*     */       //   #158	-> 219
/*     */       //   #159	-> 258
/*     */       //   #162	-> 263
/*     */       //   #149	-> 264
/*     */       //   #153	-> 265
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	275	0	this	Lli/cil/oc/util/PackedColor$HybridFormat;
/*     */       //   0	275	1	value	Lli/cil/oc/util/PackedColor$Color;
/*     */       //   6	269	2	paletteIndex	B
/*     */       //   44	231	5	r	I
/*     */       //   54	221	6	g	I
/*     */       //   64	211	7	b	I
/*     */       //   100	175	9	r	I
/*     */       //   109	166	10	g	I
/*     */       //   118	157	11	b	I
/*     */       //   141	134	12	idxR	I
/*     */       //   164	111	13	idxG	I
/*     */       //   187	88	14	idxB	I
/*     */       //   219	56	15	deflated	B
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isFromPalette(int value) {
/* 167 */       return (value >= 0 && value < (palette()).length);
/*     */     } }
/*     */   public static class Color implements Product, Serializable { private final int value; private final boolean isPalette;
/* 170 */     public int value() { return this.value; } public boolean isPalette() { return this.isPalette; } public Color copy(int value, boolean isPalette) { return new Color(value, isPalette); } public int copy$default$1() { return value(); } public boolean copy$default$2() { return isPalette(); } public String productPrefix() { return "Color"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return BoxesRunTime.boxToInteger(value()); } public Iterator<Object> productIterator() { return scala.runtime.ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof Color; } public int hashCode() { int i = -889275714; i = Statics.mix(i, value()); i = Statics.mix(i, isPalette() ? 1231 : 1237); return Statics.finalizeHash(i, 2); } public String toString() { return scala.runtime.ScalaRunTime$.MODULE$._toString(this); } public boolean equals(Object x$1) { if (this != x$1) { boolean bool; Object object = x$1; if (object instanceof Color) { bool = true; } else { bool = false; }  if (bool) { Color color = (Color)x$1; if ((value() == color.value() && isPalette() == color.isPalette() && color.canEqual(this))); }  return false; }  } public Color(int value, boolean isPalette) { Product.class.$init$(this); } } public static class Color$ extends AbstractFunction2<Object, Object, Color> implements Serializable { public static final Color$ MODULE$; public final String toString() { return "Color"; } public PackedColor.Color apply(int value, boolean isPalette) { return new PackedColor.Color(value, isPalette); } public Option<Tuple2<Object, Object>> unapply(PackedColor.Color x$0) { return (x$0 == null) ? (Option<Tuple2<Object, Object>>)scala.None$.MODULE$ : (Option<Tuple2<Object, Object>>)new Some(new Tuple2.mcIZ.sp(x$0.value(), x$0.isPalette())); } public boolean apply$default$2() { return false; } public boolean $lessinit$greater$default$2() { return false; } private Object readResolve() { return MODULE$; } public Color$() { MODULE$ = this; }
/*     */      }
/*     */ 
/*     */   
/*     */   public static interface ColorFormat extends Persistable {
/*     */     TextBuffer.ColorDepth depth();
/*     */     
/*     */     int inflate(int param1Int);
/*     */     
/*     */     void validate(PackedColor.Color param1Color);
/*     */     
/*     */     byte deflate(PackedColor.Color param1Color);
/*     */     
/*     */     boolean isFromPalette(int param1Int);
/*     */     
/*     */     void load(NBTTagCompound param1NBTTagCompound);
/*     */     
/*     */     void save(NBTTagCompound param1NBTTagCompound);
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\PackedColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */