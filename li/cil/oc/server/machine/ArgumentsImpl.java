/*     */ package li.cil.oc.server.machine;
/*     */ 
/*     */ import com.google.common.base.Charsets;
/*     */ import java.util.Map;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tMd\001B\001\003\0015\021Q\"\021:hk6,g\016^:J[Bd'BA\002\005\003\035i\027m\0315j]\026T!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]YR\"\001\r\013\005\rI\"B\001\016\007\003\r\t\007/[\005\0039a\021\021\"\021:hk6,g\016^:\t\021y\001!Q1A\005\002}\tA!\031:hgV\t\001\005E\002\"W9r!A\t\025\017\005\r2S\"\001\023\013\005\025b\021A\002\037s_>$h(C\001(\003\025\0318-\0317b\023\tI#&A\004qC\016\\\027mZ3\013\003\035J!\001L\027\003\007M+\027O\003\002*UA\021q\006M\007\002U%\021\021G\013\002\007\003:L(+\0324\t\021M\002!\021!Q\001\n\001\nQ!\031:hg\002BQ!\016\001\005\002Y\na\001P5oSRtDCA\034:!\tA\004!D\001\003\021\025qB\0071\001!\021\025Y\004\001\"\001=\003!IG/\032:bi>\024H#A\037\021\007y\ne&D\001@\025\t\001%#\001\003vi&d\027B\001\"@\005!IE/\032:bi>\024\b\"\002#\001\t\003)\025!B2pk:$H#\001$\021\005=:\025B\001%+\005\rIe\016\036\005\006\025\002!\taS\001\tG\",7m[!osR\021a\002\024\005\006\033&\003\rAR\001\006S:$W\r\037\005\006\037\002!\t\001U\001\007_B$\030I\\=\025\0079\t&\013C\003N\035\002\007a\tC\003T\035\002\007a&A\004eK\032\fW\017\034;\t\013U\003A\021\001,\002\031\rDWmY6C_>dW-\0318\025\005]S\006CA\030Y\023\tI&FA\004C_>dW-\0318\t\0135#\006\031\001$\t\013q\003A\021A/\002\025=\004HOQ8pY\026\fg\016F\002X=~CQ!T.A\002\031CQaU.A\002]CQ!\031\001\005\002\t\f1b\0315fG.$u.\0362mKR\0211M\032\t\003_\021L!!\032\026\003\r\021{WO\0317f\021\025i\005\r1\001G\021\025A\007\001\"\001j\003%y\007\017\036#pk\ndW\rF\002dU.DQ!T4A\002\031CQaU4A\002\rDQ!\034\001\005\0029\fAb\0315fG.Le\016^3hKJ$\"AR8\t\0135c\007\031\001$\t\013E\004A\021\001:\002\025=\004H/\0238uK\036,'\017F\002GgRDQ!\0249A\002\031CQa\0259A\002\031CQA\036\001\005\002]\f\021b\0315fG.duN\\4\025\005a\\\bCA\030z\023\tQ(F\001\003M_:<\007\"B'v\001\0041\005\"B?\001\t\003q\030aB8qi2{gn\032\013\005q~\f\t\001C\003Ny\002\007a\tC\003Ty\002\007\001\020C\004\002\006\001!\t!a\002\002\027\rDWmY6TiJLgn\032\013\005\003\023\ty\001E\002\020\003\027I1!!\004\021\005\031\031FO]5oO\"1Q*a\001A\002\031Cq!a\005\001\t\003\t)\"A\005paR\034FO]5oOR1\021\021BA\f\0033Aa!TA\t\001\0041\005bB*\002\022\001\007\0211\004\t\005\003;\t\031CD\0020\003?I1!!\t+\003\031\001&/\0323fM&!\021QBA\023\025\r\t\tC\013\005\b\003S\001A\021AA\026\0039\031\007.Z2l\005f$X-\021:sCf$B!!\f\002:A)q&a\f\0024%\031\021\021\007\026\003\013\005\023(/Y=\021\007=\n)$C\002\0028)\022AAQ=uK\"1Q*a\nA\002\031Cq!!\020\001\t\003\ty$\001\007paR\024\025\020^3BeJ\f\027\020\006\004\002.\005\005\0231\t\005\007\033\006m\002\031\001$\t\017M\013Y\0041\001\002.!9\021q\t\001\005\002\005%\023AC2iK\016\\G+\0312mKR!\0211JA7a\031\ti%a\026\002lA9a(a\024\002T\005%\024bAA)\t\031Q*\0319\021\t\005U\023q\013\007\001\t1\tI&!\022\002\002\003\005)\021AA.\005\005y\026\003BA/\003G\0022aLA0\023\r\t\tG\013\002\b\035>$\b.\0338h!\ry\023QM\005\004\003OR#aA!osB!\021QKA6\t1\tI&!\022\002\002\003\005)\021AA.\021\031i\025Q\ta\001\r\"9\021\021\017\001\005\002\005M\024\001C8qiR\013'\r\\3\025\r\005U\024QQADa\031\t9(a\037\002\002B9a(a\024\002z\005}\004\003BA+\003w\"A\"! \002p\005\005\t\021!B\001\0037\0221a\030\0232!\021\t)&!!\005\031\005\r\025qNA\001\002\003\025\t!a\027\003\007}##\007\003\004N\003_\002\rA\022\005\b'\006=\004\031AAEa\031\tY)a$\002\024B9a(a\024\002\016\006E\005\003BA+\003\037#A\"! \002\b\006\005\t\021!B\001\0037\002B!!\026\002\024\022a\0211QAD\003\003\005\tQ!\001\002\\!9\021q\023\001\005\002\005e\025AD2iK\016\\\027\n^3n'R\f7m\033\013\005\0037\013y\013\005\003\002\036\006-VBAAP\025\021\t\t+a)\002\t%$X-\034\006\005\003K\0139+A\005nS:,7M]1gi*\021\021\021V\001\004]\026$\030\002BAW\003?\023\021\"\023;f[N#\030mY6\t\r5\013)\n1\001G\021\035\t\031\f\001C\001\003k\013Ab\0349u\023R,Wn\025;bG.$b!a'\0028\006e\006BB'\0022\002\007a\tC\004T\003c\003\r!a'\t\017\005u\006\001\"\001\002@\006I\021n\035\"p_2,\027M\034\013\004/\006\005\007BB'\002<\002\007a\tC\004\002F\002!\t!a2\002\021%\034Hi\\;cY\026$2aVAe\021\031i\0251\031a\001\r\"9\021Q\032\001\005\002\005=\027!C5t\023:$XmZ3s)\r9\026\021\033\005\007\033\006-\007\031\001$\t\017\005U\007\001\"\001\002X\0061\021n\035'p]\036$2aVAm\021\031i\0251\033a\001\r\"9\021Q\034\001\005\002\005}\027\001C5t'R\024\030N\\4\025\007]\013\t\017\003\004N\0037\004\rA\022\005\b\003K\004A\021AAt\003-I7OQ=uK\006\023(/Y=\025\007]\013I\017\003\004N\003G\004\rA\022\005\b\003[\004A\021AAx\003\035I7\017V1cY\026$2aVAy\021\031i\0251\036a\001\r\"9\021Q\037\001\005\002\005]\030aC5t\023R,Wn\025;bG.$2aVA}\021\031i\0251\037a\001\r\"9\021Q \001\005\002\005}\030a\002;p\003J\024\030-\037\013\003\005\003\001BaLA\030]!9!Q\001\001\005\n\t\035\021!C5t\t\0264\027N\\3e)\r9&\021\002\005\007\033\n\r\001\031\001$\t\017\t5\001\001\"\003\003\020\005Q1\r[3dW&sG-\032=\025\r\tE!q\003B\r!\ry#1C\005\004\005+Q#\001B+oSRDa!\024B\006\001\0041\005\002\003B\016\005\027\001\r!a\007\002\t9\fW.\032\005\b\005?\001A\021\002B\021\003%!\030\020]3FeJ|'\017\006\005\003$\t%\"1\006B\030!\ry!QE\005\004\005O\001\"\001G%mY\026<\027\r\\!sOVlWM\034;Fq\016,\007\017^5p]\"1QJ!\bA\002\031CqA!\f\003\036\001\007a&\001\003iCZ,\007\002\003B\031\005;\001\r!a\007\002\t]\fg\016\036\005\b\005k\001A\021\002B\034\003!Ig\016^#se>\024HC\002B\022\005s\021Y\004\003\004N\005g\001\rA\022\005\b\005[\021\031\0041\001/\021\035\021y\004\001C\005\005\003\n\001\002^=qK:\013W.\032\013\005\0037\021\031\005C\004\003F\tu\002\031\001\030\002\013Y\fG.^3\t\017\t%\003\001\"\003\003L\005IQ.Y6f'R\f7m\033\013\t\0037\023iEa\024\003T!A!1\004B$\001\004\tY\002C\004\003R\t\035\003\031\001$\002\r\021\fW.Y4f\021!\021)Fa\022A\002\t]\023a\001;bOB)qF!\027\003^%\031!1\f\026\003\r=\003H/[8o!\021\021yF!\032\016\005\t\005$\002\002B2\003G\0131A\0342u\023\021\0219G!\031\003\0359\023E\013V1h\007>l\007o\\;oI\"9!1\016\001\005\n\t5\024\001\005;p\035\n$H+Y4D_6\004x.\0368e)\021\0219Fa\034\t\021\tE$\021\016a\001\003[\tA\001Z1uC\002")
/*     */ public class ArgumentsImpl implements Arguments {
/*  16 */   public Seq<Object> args() { return this.args; } private final Seq<Object> args; public ArgumentsImpl(Seq<Object> args) {} public Iterator<Object> iterator() {
/*  17 */     return WrapAsJava$.MODULE$.asJavaIterator(args().iterator());
/*     */   }
/*  19 */   public int count() { return args().length(); } public Object checkAny(int index) {
/*     */     boolean bool;
/*     */     Object object2;
/*  22 */     checkIndex(index, "value");
/*  23 */     Object object1 = args().apply(index);
/*  24 */     if (Unit$.MODULE$.equals(object1)) { bool = true; } else if (None$.MODULE$.equals(object1)) { bool = true; } else { bool = false; }  if (bool) { object2 = null; }
/*  25 */     else { object2 = object1; }
/*     */     
/*     */     return object2;
/*     */   }
/*     */   public Object optAny(int index, Object default) {
/*  30 */     return isDefined(index) ? 
/*  31 */       checkAny(index) : default;
/*     */   }
/*     */   
/*     */   public boolean checkBoolean(int index) {
/*  35 */     checkIndex(index, "boolean");
/*  36 */     Object object = args().apply(index);
/*  37 */     if (object instanceof Boolean) { Boolean bool = (Boolean)object; return Predef$.MODULE$.Boolean2boolean(bool); }
/*  38 */      throw typeError(index, object, "boolean");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean optBoolean(int index, boolean default) {
/*  43 */     return isDefined(index) ? 
/*  44 */       checkBoolean(index) : default;
/*     */   }
/*     */   
/*     */   public double checkDouble(int index) {
/*  48 */     checkIndex(index, "number");
/*  49 */     Object object = args().apply(index);
/*  50 */     if (object instanceof Number) { Number number = (Number)object; return number.doubleValue(); }
/*  51 */      throw typeError(index, object, "number");
/*     */   }
/*     */ 
/*     */   
/*     */   public double optDouble(int index, double default) {
/*  56 */     return isDefined(index) ? 
/*  57 */       checkDouble(index) : default;
/*     */   }
/*     */   
/*     */   public int checkInteger(int index) {
/*  61 */     checkIndex(index, "integer");
/*  62 */     Object object = args().apply(index);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     if (object instanceof Double) { Double double_ = (Double)object;
/*  85 */       if (double_.isNaN())
/*  86 */         throw intError(index, double_); 
/*  87 */       int i = (Predef$.MODULE$.Double2double(double_) > 2147483647) ? Integer
/*  88 */         .MAX_VALUE : (
/*  89 */         (Predef$.MODULE$.Double2double(double_) < -2147483648) ? Integer
/*  90 */         .MIN_VALUE : 
/*     */         
/*  92 */         double_.intValue()); }
/*  93 */     else if (object instanceof Float) { Float float_ = (Float)object;
/*  94 */       if (float_.isNaN())
/*  95 */         throw intError(index, float_); 
/*  96 */       int i = (Predef$.MODULE$.Float2float(float_) > 2147483647) ? Integer
/*  97 */         .MAX_VALUE : (
/*  98 */         (Predef$.MODULE$.Float2float(float_) < -2147483648) ? Integer
/*  99 */         .MIN_VALUE : 
/*     */         
/* 101 */         float_.intValue()); }
/* 102 */     else if (object instanceof Long) { Long long_ = (Long)object;
/* 103 */       int i = (Predef$.MODULE$.Long2long(long_) > 2147483647L) ? Integer
/* 104 */         .MAX_VALUE : (
/* 105 */         (Predef$.MODULE$.Long2long(long_) < -2147483648L) ? Integer
/* 106 */         .MIN_VALUE : 
/*     */         
/* 108 */         long_.intValue()); }
/* 109 */     else { if (object instanceof Number) { Number number = (Number)object; return number.intValue(); }
/* 110 */        throw typeError(index, object, "integer"); }
/*     */     
/*     */     return SYNTHETIC_LOCAL_VARIABLE_4;
/*     */   }
/*     */   public int optInteger(int index, int default) {
/* 115 */     return isDefined(index) ? 
/* 116 */       checkInteger(index) : default;
/*     */   }
/*     */   
/*     */   public long checkLong(int index) {
/* 120 */     checkIndex(index, "integer");
/* 121 */     Object object = args().apply(index);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     if (object instanceof Double) { Double double_ = (Double)object;
/* 138 */       if (double_.isNaN())
/* 139 */         throw intError(index, double_); 
/* 140 */       long l = (Predef$.MODULE$.Double2double(double_) > Long.MAX_VALUE) ? 
/* 141 */         Long.MAX_VALUE : (
/* 142 */         (Predef$.MODULE$.Double2double(double_) < Long.MIN_VALUE) ? 
/* 143 */         Long.MIN_VALUE : 
/*     */         
/* 145 */         double_.longValue()); }
/* 146 */     else if (object instanceof Float) { Float float_ = (Float)object;
/* 147 */       if (float_.isNaN())
/* 148 */         throw intError(index, float_); 
/* 149 */       long l = (Predef$.MODULE$.Float2float(float_) > (float)Long.MAX_VALUE) ? 
/* 150 */         Long.MAX_VALUE : (
/* 151 */         (Predef$.MODULE$.Float2float(float_) < (float)Long.MIN_VALUE) ? 
/* 152 */         Long.MIN_VALUE : 
/*     */         
/* 154 */         float_.longValue()); }
/* 155 */     else { if (object instanceof Number) { Number number = (Number)object; return number.longValue(); }
/* 156 */        throw typeError(index, object, "integer"); }
/*     */     
/*     */     return SYNTHETIC_LOCAL_VARIABLE_4;
/*     */   }
/*     */   public long optLong(int index, long default) {
/* 161 */     return isDefined(index) ? 
/* 162 */       checkLong(index) : default;
/*     */   }
/*     */   
/*     */   public String checkString(int index) {
/* 166 */     checkIndex(index, "string");
/* 167 */     Object object = args().apply(index);
/* 168 */     if (object instanceof String) { String str1 = (String)object, str2 = str1; }
/* 169 */     else { if (object instanceof byte[]) { byte[] arrayOfByte = (byte[])object; return new String(arrayOfByte, Charsets.UTF_8); }
/* 170 */        throw typeError(index, object, "string"); }
/*     */     
/*     */     return (String)SYNTHETIC_LOCAL_VARIABLE_4;
/*     */   }
/*     */   public String optString(int index, String default) {
/* 175 */     return isDefined(index) ? 
/* 176 */       checkString(index) : default;
/*     */   }
/*     */   
/*     */   public byte[] checkByteArray(int index) {
/* 180 */     checkIndex(index, "string");
/* 181 */     Object object = args().apply(index);
/* 182 */     if (object instanceof String) { String str = (String)object; byte[] arrayOfByte = str.getBytes(Charsets.UTF_8); }
/* 183 */     else { if (object instanceof byte[]) { byte[] arrayOfByte; return arrayOfByte = (byte[])object; }
/* 184 */        throw typeError(index, object, "string"); }
/*     */     
/*     */     return (byte[])SYNTHETIC_LOCAL_VARIABLE_4;
/*     */   }
/*     */   public byte[] optByteArray(int index, byte[] default) {
/* 189 */     return isDefined(index) ? 
/* 190 */       checkByteArray(index) : default;
/*     */   }
/*     */   
/*     */   public Map<?, ?> checkTable(int index) {
/* 194 */     checkIndex(index, "table");
/* 195 */     Object object = args().apply(index);
/* 196 */     if (object instanceof Map) { Map map1 = (Map)object, map2 = map1; }
/* 197 */     else if (object instanceof Map) { Map map1 = (Map)object; Map map = WrapAsJava$.MODULE$.mapAsJavaMap((Map)map1); }
/* 198 */     else { if (object instanceof Map) { Map map = (Map)object; return WrapAsJava$.MODULE$.mutableMapAsJavaMap(map); }
/* 199 */        throw typeError(index, object, "table"); }
/*     */     
/*     */     return (Map<?, ?>)SYNTHETIC_LOCAL_VARIABLE_4;
/*     */   }
/*     */   public Map<?, ?> optTable(int index, Map<?, ?> default) {
/* 204 */     return isDefined(index) ? 
/* 205 */       checkTable(index) : default;
/*     */   }
/*     */   
/*     */   public ItemStack checkItemStack(int index) {
/* 209 */     Map<?, ?> map = checkTable(index);
/* 210 */     Object object = map.get("name");
/* 211 */     if (object instanceof String) { boolean bool; None$ none$2; String str = (String)object;
/* 212 */       Object object1 = map.get("damage");
/* 213 */       if (object1 instanceof Number) { Number number = (Number)object1; bool = number.intValue(); }
/* 214 */       else { bool = false; }
/*     */        int damage = bool;
/* 216 */       Object object2 = map.get("tag");
/* 217 */       if (object2 instanceof byte[]) { byte[] arrayOfByte = (byte[])object2; Option<NBTTagCompound> option = toNbtTagCompound(arrayOfByte); }
/* 218 */       else if (object2 instanceof String) { String str1 = (String)object2; Option<NBTTagCompound> option = toNbtTagCompound(str1.getBytes(Charsets.UTF_8)); }
/* 219 */       else { none$2 = None$.MODULE$; }
/*     */        None$ none$1 = none$2;
/* 221 */       return makeStack(str, damage, (Option<NBTTagCompound>)none$1); }
/* 222 */      throw new IllegalArgumentException("invalid item stack");
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack optItemStack(int index, ItemStack default) {
/* 227 */     return isDefined(index) ? 
/* 228 */       checkItemStack(index) : default;
/*     */   }
/*     */   
/*     */   public boolean isBoolean(int index) {
/* 232 */     if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/* 233 */       if (object instanceof Boolean) { bool = true; }
/* 234 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 238 */     return false; } public boolean isDouble(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/* 239 */       if (object instanceof Number) { bool = true; }
/* 240 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 244 */     return false; } public boolean isInteger(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 252 */       if (object instanceof Double) { Double double_ = (Double)object; bool = double_.isNaN() ? false : true; }
/* 253 */       else if (object instanceof Float) { Float float_ = (Float)object; bool = float_.isNaN() ? false : true; }
/* 254 */       else if (object instanceof Number) { bool = true; }
/* 255 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 259 */     return false; } public boolean isLong(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 265 */       if (object instanceof Double) { Double double_ = (Double)object; bool = double_.isNaN() ? false : true; }
/* 266 */       else if (object instanceof Float) { Float float_ = (Float)object; bool = float_.isNaN() ? false : true; }
/* 267 */       else if (object instanceof Number) { bool = true; }
/* 268 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 272 */     return false; } public boolean isString(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/* 273 */       if (object instanceof String) { bool = true; }
/* 274 */       else if (object instanceof byte[]) { bool = true; }
/* 275 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 279 */     return false; } public boolean isByteArray(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/* 280 */       if (object instanceof String) { bool = true; }
/* 281 */       else if (object instanceof byte[]) { bool = true; }
/* 282 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 286 */     return false; } public boolean isTable(int index) { if (index >= 0 && index < count()) { boolean bool; Object object = args().apply(index);
/* 287 */       if (object instanceof Map) { bool = true; }
/* 288 */       else if (object instanceof Map) { bool = true; }
/* 289 */       else if (object instanceof Map) { bool = true; }
/* 290 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/* 294 */     return false; } public boolean isItemStack(int index) { if (isTable(index)) {
/* 295 */       boolean bool; Map<?, ?> map = checkTable(index);
/* 296 */       Object object = map.get("name");
/* 297 */       if (object instanceof String) { bool = true; }
/* 298 */       else if (object instanceof byte[]) { bool = true; }
/* 299 */       else { bool = false; }
/*     */       
/*     */       if (bool);
/*     */     } 
/* 303 */     return false; } public Object[] toArray() { return (Object[])((TraversableOnce)args().map((Function1)new ArgumentsImpl$$anonfun$toArray$1(this), Seq$.MODULE$.canBuildFrom()))
/*     */ 
/*     */       
/* 306 */       .toArray(ClassTag$.MODULE$.AnyRef()); } public final class ArgumentsImpl$$anonfun$toArray$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Object apply(Object x0$1) { Object object2, object1 = x0$1; if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; object2 = new String(arrayOfByte, Charsets.UTF_8); } else { object2 = object1; }  return object2; } public ArgumentsImpl$$anonfun$toArray$1(ArgumentsImpl $outer) {} }
/* 308 */   private boolean isDefined(int index) { return (index >= 0 && index < args().length() && args().apply(index) != null); }
/*     */   
/*     */   private void checkIndex(int index, String name) {
/* 311 */     if (index < 0) throw new IndexOutOfBoundsException(); 
/* 312 */     if (args().length() <= index) {
/* 313 */       (new String[3])[0] = "bad arguments #"; (new String[3])[1] = " ("; (new String[3])[2] = " expected, got no value)"; throw new IllegalArgumentException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1), name })));
/*     */     } 
/*     */   }
/*     */   private IllegalArgumentException typeError(int index, Object have, String want) {
/* 317 */     (new String[4])[0] = "bad argument #"; (new String[4])[1] = " ("; (new String[4])[2] = " expected, got "; (new String[4])[3] = ")"; return new IllegalArgumentException((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1), want, typeName(have) })));
/*     */   }
/*     */   
/*     */   private IllegalArgumentException intError(int index, Object have) {
/* 321 */     (new String[3])[0] = "bad argument #"; (new String[3])[1] = " ("; (new String[3])[2] = " has no integer representation)"; return new IllegalArgumentException((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1), typeName(have) }))); } private String typeName(Object value) { boolean bool;
/*     */     String str;
/* 323 */     Object object = value;
/* 324 */     if (object == null) { bool = true; } else if (Unit$.MODULE$.equals(object)) { bool = true; } else if (None$.MODULE$.equals(object)) { bool = true; } else { bool = false; }  if (bool) { str = "nil"; }
/* 325 */     else if (object instanceof Boolean) { str = "boolean"; }
/* 326 */     else if (object instanceof Byte) { str = "integer"; }
/* 327 */     else if (object instanceof Short) { str = "integer"; }
/* 328 */     else if (object instanceof Integer) { str = "integer"; }
/* 329 */     else if (object instanceof Long) { str = "integer"; }
/* 330 */     else if (object instanceof Number) { str = "number"; }
/* 331 */     else if (object instanceof String) { str = "string"; }
/* 332 */     else if (object instanceof byte[]) { str = "string"; }
/* 333 */     else if (object instanceof Map) { str = "table"; }
/* 334 */     else if (object instanceof Map) { str = "table"; }
/* 335 */     else if (object instanceof Map) { str = "table"; }
/* 336 */     else { str = value.getClass().getSimpleName(); }
/*     */     
/*     */     return str; }
/*     */   
/* 340 */   private ItemStack makeStack(String name, int damage, Option tag) { Object object = Item.field_150901_e.func_82594_a(name);
/* 341 */     if (object instanceof Item) { Item item = (Item)object;
/* 342 */       ItemStack stack = new ItemStack(item, 1, damage);
/* 343 */       tag.foreach((Function1)new ArgumentsImpl$$anonfun$makeStack$1(this, stack));
/* 344 */       return stack; }
/* 345 */      throw new IllegalArgumentException("invalid item stack"); } public final class ArgumentsImpl$$anonfun$makeStack$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final void apply(NBTTagCompound x$1) {
/*     */       this.stack$1.func_77982_d(x$1);
/*     */     } public ArgumentsImpl$$anonfun$makeStack$1(ArgumentsImpl $outer, ItemStack stack$1) {} } private Option<NBTTagCompound> toNbtTagCompound(byte[] data) {
/* 349 */     return Option$.MODULE$.apply(CompressedStreamTools.func_152457_a(data, NBTSizeTracker.field_152451_a));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\ArgumentsImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */