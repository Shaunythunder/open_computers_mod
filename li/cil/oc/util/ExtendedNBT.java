/*     */ package li.cil.oc.util;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagByte;
/*     */ import net.minecraft.nbt.NBTTagByteArray;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagDouble;
/*     */ import net.minecraft.nbt.NBTTagFloat;
/*     */ import net.minecraft.nbt.NBTTagInt;
/*     */ import net.minecraft.nbt.NBTTagIntArray;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.nbt.NBTTagLong;
/*     */ import net.minecraft.nbt.NBTTagShort;
/*     */ import net.minecraft.nbt.NBTTagString;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ @ScalaSignature(bytes = "\006\001\r%s!B\001\003\021\003Y\021aC#yi\026tG-\0323O\005RS!a\001\003\002\tU$\030\016\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!aC#yi\026tG-\0323O\005R\033\"!\004\t\021\005E!R\"\001\n\013\003M\tQa]2bY\006L!!\006\n\003\r\005s\027PU3g\021\0259R\002\"\001\031\003\031a\024N\\5u}Q\t1\002C\003\033\033\021\r1$A\003u_:\023G\017\006\002\035MA\021Q\004J\007\002=)\021q\004I\001\004]\n$(BA\021#\003%i\027N\\3de\0064GOC\001$\003\rqW\r^\005\003Ky\021!B\024\"U)\006<')\037;f\021\0259\023\0041\001)\003\0251\030\r\\;f!\t\t\022&\003\002+%\t9!i\\8mK\006t\007\"\002\016\016\t\007aCC\001\017.\021\02593\0061\001/!\t\tr&\003\0021%\t!!)\037;f\021\025QR\002b\0013)\t\031d\007\005\002\036i%\021QG\b\002\f\035\n#F+Y4TQ>\024H\017C\003(c\001\007q\007\005\002\022q%\021\021H\005\002\006'\"|'\017\036\005\00655!\031a\017\013\003y}\002\"!H\037\n\005yr\"!\003(C)R\013w-\0238u\021\0259#\b1\001A!\t\t\022)\003\002C%\t\031\021J\034;\t\013iiA1\001#\025\005\025C\005CA\017G\023\t9eD\001\006O\005R#\026m\032'p]\036DQaJ\"A\002%\003\"!\005&\n\005-\023\"\001\002'p]\036DQAG\007\005\0045#\"AT)\021\005uy\025B\001)\037\005-q%\t\026+bO\032cw.\031;\t\013\035b\005\031\001*\021\005E\031\026B\001+\023\005\0251En\\1u\021\025QR\002b\001W)\t9&\f\005\002\0361&\021\021L\b\002\r\035\n#F+Y4E_V\024G.\032\005\006OU\003\ra\027\t\003#qK!!\030\n\003\r\021{WO\0317f\021\025QR\002b\001`)\t\0017\r\005\002\036C&\021!M\b\002\020\035\n#F+Y4CsR,\027I\035:bs\")qE\030a\001IB\031\021#\032\030\n\005\031\024\"!B!se\006L\b\"\002\016\016\t\007AGCA5m!\ti\".\003\002l=\tqaJ\021+UC\036Le\016^!se\006L\b\"B\024h\001\004i\007cA\tf\001\")!$\004C\002_R\021\001\r\035\005\006O9\004\r!\035\t\004#\025D\003\"\002\016\016\t\007\031HC\001;x!\tiR/\003\002w=\taaJ\021+UC\036\034FO]5oO\")qE\035a\001qB\021\021\020 \b\003#iL!a\037\n\002\rA\023X\rZ3g\023\tihP\001\004TiJLgn\032\006\003wJAaAG\007\005\004\005\005A\003BA\002\003\023\0012!HA\003\023\r\t9A\b\002\017\035\n#F+Y4D_6\004x.\0368e\021\0319s\0201\001\002\fA!\021QBA\n\033\t\tyAC\002\002\022\001\nA!\033;f[&!\021QCA\b\005%IE/Z7Ti\006\0347\016\003\004\033\033\021\r\021\021\004\013\005\003\007\tY\002C\004(\003/\001\r!!\b\021\017E\ty\"a\001\002$%\031\021\021\005\n\003\023\031+hn\031;j_:\f\004cA\t\002&%\031\021q\005\n\003\tUs\027\016\036\005\00755!\031!a\013\025\t\005\r\021Q\006\005\bO\005%\002\031AA\030a\021\t\t$a\017\021\re\f\031\004_A\034\023\r\t)D \002\004\033\006\004\b\003BA\035\003wa\001\001\002\007\002>\0055\022\021!A\001\006\003\tyDA\002`IE\nB!!\021\002HA\031\021#a\021\n\007\005\025#CA\004O_RD\027N\\4\021\007E\tI%C\002\002LI\0211!\0218z\021\035\ty%\004C\001\003#\nQ\002^=qK\022l\025\r\035+p\035\n$H\003BA*\0033\0022!HA+\023\r\t9F\b\002\b\035\n#&)Y:f\021!\tY&!\024A\002\005u\023aA7baB2\021qLA2\003S\002r!_A\032\003C\n9\007\005\003\002:\005\rD\001DA3\0033\n\t\021!A\003\002\005}\"aA0%eA!\021\021HA5\t1\tY'!\027\002\002\003\005)\021AA \005\ryFe\r\005\b\003_jA1AA9\003Q\021wn\0347fC:LE/\032:bE2,Gk\034(ciR!\0211OAF!\025\t)(!\"\035\035\021\t9(!!\017\t\005e\024qP\007\003\003wR1!! \013\003\031a$o\\8u}%\t1#C\002\002\004J\tq\001]1dW\006<W-\003\003\002\b\006%%\001C%uKJ\f'\r\\3\013\007\005\r%\003C\004(\003[\002\r!!$\021\013\005U\024Q\021\025\t\017\005EU\002b\001\002\024\006\t\"-\037;f\023R,'/\0312mKR{gJ\031;\025\t\005M\024Q\023\005\bO\005=\005\031AAL!\025\t)(!\"/\021\035\tY*\004C\002\003;\013!c\0355peRLE/\032:bE2,Gk\034(ciR!\021qTAQ!\025\t)(!\"4\021\0359\023\021\024a\001\003G\003R!!\036\002\006^Bq!a*\016\t\007\tI+\001\tj]RLE/\032:bE2,Gk\034(ciR!\0211VAW!\025\t)(!\"=\021\0359\023Q\025a\001\003_\003R!!\036\002\006\002Cq!a-\016\t\007\t),A\013j]R\f%O]1z\023R,'/\0312mKR{gJ\031;\025\t\005]\026\021\030\t\006\003k\n))\033\005\bO\005E\006\031AA^!\025\t)(!\"n\021\035\ty,\004C\002\003\003\f\021\003\\8oO&#XM]1cY\026$vN\0242u)\021\t\031-!2\021\013\005U\024QQ#\t\017\035\ni\f1\001\002HB)\021QOAC\023\"9\0211Z\007\005\004\0055\027A\0054m_\006$\030\n^3sC\ndW\rV8OER$B!a4\002RB)\021QOAC\035\"9q%!3A\002\005M\007#BA;\003\013\023\006bBAl\033\021\r\021\021\\\001\024I>,(\r\\3Ji\026\024\030M\0317f)>t%\r\036\013\005\0037\fi\016E\003\002v\005\025u\013C\004(\003+\004\r!a8\021\013\005U\024QQ.\t\017\005\rX\002b\001\002f\0061\"-\037;f\003J\024\030-_%uKJ\f'\r\\3U_:\023G\017\006\003\002h\006%\b#BA;\003\013\003\007bB\024\002b\002\007\0211\036\t\006\003k\n)\t\032\005\b\003_lA1AAy\003M\031HO]5oO&#XM]1cY\026$vN\0242u)\021\t\0310!>\021\013\005U\024Q\021;\t\017\035\ni\0171\001\002xB)\021QOACq\"9\0211`\007\005\004\005u\030!F<sSR\f'\r\\3Ji\026\024\030M\0317f)>t%\r\036\013\005\003\024\t\001\005\004\002v\005\025\0251\001\005\bO\005e\b\031\001B\002!\031\t)(!\"\002\036!9!qA\007\005\004\t%\021AF5uK6\034F/Y2l\023R,'/\0312mKR{gJ\031;\025\t\005}(1\002\005\bO\t\025\001\031\001B\007!\031\t)(!\"\002\f!9!\021C\007\005\004\tM\021!D3yi\026tGM\024\"U\005\006\034X\r\006\003\003\026\tu\002\003\002B\f\0053i\021!\004\004\007\0057i\001A!\b\003\037\025CH/\0328eK\022t%\t\026\"bg\026\0342A!\007\021\021)y\"\021\004BC\002\023\005!\021E\013\003\003'B1B!\n\003\032\t\005\t\025!\003\002T\005!aN\031;!\021\0359\"\021\004C\001\005S!BA!\006\003,!9qDa\nA\002\005M\003\002\003B\030\0053!\tA!\r\002\025Q|G+\0379fI6\013\007/\006\002\0034A\"!Q\007B\035!\031I\0301\007=\0038A!\021\021\bB\035\t1\021YD!\f\002\002\003\005)\021AA \005\ryF\005\017\005\b?\t=\001\031AA*\021\035\021\t%\004C\002\005\007\nA#\032=uK:$gJ\021+UC\036\034u.\0349pk:$G\003\002B#\005\007\004BAa\006\003H\0311!\021J\007\001\005\027\022a#\022=uK:$W\r\032(C)R\013wmQ8na>,h\016Z\n\004\005\017\002\002BC\020\003H\t\025\r\021\"\001\003PU\021\0211\001\005\f\005K\0219E!A!\002\023\t\031\001C\004\030\005\017\"\tA!\026\025\t\t\025#q\013\005\b?\tM\003\031AA\002\021!\021YFa\022\005\002\tu\023!E:fi:+woQ8na>,h\016\032+bOR1\0211\001B0\005GBqA!\031\003Z\001\007\0010\001\003oC6,\007\002\003B3\0053\002\rAa\032\002\003\031\004r!EA\020\003\007\t9\005\003\005\003l\t\035C\021\001B7\0035\031X\r\036(foR\013w\rT5tiR1\0211\001B8\005cBqA!\031\003j\001\007\001\020\003\005\003t\t%\004\031\001B;\003\0311\030\r\\;fgB1\021QOAC\003'B\001Ba\033\003H\021\005!\021\020\013\007\003\007\021YH! \t\017\t\005$q\017a\001q\"A!1\017B<\001\004\021y\bE\003\022\005\003\013\031&C\002\003\004J\021!\002\020:fa\026\fG/\0323?\021!\0219Ia\022\005\002\t%\025\001D4fi\022K'/Z2uS>tG\003\002BF\005G\003R!\005BG\005#K1Aa$\023\005\031y\005\017^5p]B!!1\023BP\033\t\021)JC\002\004\005/SAA!'\003\034\00611m\\7n_:T1A!(#\0039i\027N\\3de\0064GOZ8sO\026LAA!)\003\026\nqai\034:hK\022K'/Z2uS>t\007b\002B1\005\013\003\r\001\037\005\t\005O\0239\005\"\001\003*\006a1/\032;ESJ,7\r^5p]R1\0211\005BV\005[CqA!\031\003&\002\007\001\020\003\005\0030\n\025\006\031\001BF\003\005!\007\002\003BZ\005\017\"\tA!.\002\037\035,GOQ8pY\026\fg.\021:sCf$2!\035B\\\021\035\021\tG!-A\002aD\001Ba/\003H\021\005!QX\001\020g\026$(i\\8mK\006t\027I\035:bsR1\0211\005B`\005\003DqA!\031\003:\002\007\001\020\003\004(\005s\003\r!\035\005\b?\t}\002\031AA\002\021\035\0219-\004C\002\005\023\f\001#\032=uK:$gJ\021+UC\036d\025n\035;\025\t\t-7q\t\t\005\005/\021iM\002\004\003P6\001!\021\033\002\023\013b$XM\0343fI:\023E\013V1h\031&\034HoE\002\003NBA!b\bBg\005\013\007I\021\001Bk+\t\0219\016E\002\036\0053L1Aa7\037\005)q%\t\026+bO2K7\017\036\005\f\005K\021iM!A!\002\023\0219\016C\004\030\005\033$\tA!9\025\t\t-'1\035\005\b?\t}\007\031\001Bl\021!\0219O!4\005\002\t%\030\001F1qa\026tGMT3x\007>l\007o\\;oIR\013w\r\006\003\002$\t-\b\002\003B3\005K\004\r!!\b\t\021\t=(Q\032C\001\005c\fa!\0319qK:$G\003BA\022\005gD\001Ba\035\003n\002\007!Q\017\005\t\005_\024i\r\"\001\003xR!\0211\005B}\021!\021\031H!>A\002\t}\004\002\003B\005\033$\tAa@\002\017\031|'/Z1dQV!1\021AB\005)\021\t\031ca\001\t\021\t\025$1 a\001\007\013\001r!EA\020\007\017\t\031\003\005\003\002:\r%A\001CB\006\005w\024\ra!\004\003\007Q\013w-\005\003\002B\005M\003\002CA.\005\033$\ta!\005\026\r\rM1qEB\017)\021\031)b!\t\021\r\005U4qCB\016\023\021\031I\"!#\003\025%sG-\032=fIN+\027\017\005\003\002:\ruA\001CB\020\007\037\021\r!a\020\003\013Y\013G.^3\t\021\t\0254q\002a\001\007G\001r!EA\020\007K\031Y\002\005\003\002:\r\035B\001CB\006\007\037\021\ra!\004\t\021\r-\"Q\032C\001\007[\tq\001^8BeJ\f\0270\006\003\0040\rUB\003BB\031\007o\001B!E3\0044A!\021\021HB\033\t!\031Ya!\013C\002\005}\002BCB\035\007S\t\t\021q\001\004<\005QQM^5eK:\034W\rJ\031\021\r\ru21IB\032\033\t\031yDC\002\004BI\tqA]3gY\026\034G/\003\003\004F\r}\"\001C\"mCN\034H+Y4\t\017}\021)\r1\001\003X\002")
/*     */ public final class ExtendedNBT { public static ExtendedNBTTagList extendNBTTagList(NBTTagList paramNBTTagList) { return ExtendedNBT$.MODULE$.extendNBTTagList(paramNBTTagList); } public static ExtendedNBTTagCompound extendNBTTagCompound(NBTTagCompound paramNBTTagCompound) { return ExtendedNBT$.MODULE$.extendNBTTagCompound(paramNBTTagCompound); } public static ExtendedNBTBase extendNBTBase(NBTBase paramNBTBase) { return ExtendedNBT$.MODULE$.extendNBTBase(paramNBTBase); } public static Iterable<NBTTagCompound> itemStackIterableToNbt(Iterable<ItemStack> paramIterable) { return ExtendedNBT$.MODULE$.itemStackIterableToNbt(paramIterable); } public static Iterable<NBTTagCompound> writableIterableToNbt(Iterable<Function1<NBTTagCompound, BoxedUnit>> paramIterable) { return ExtendedNBT$.MODULE$.writableIterableToNbt(paramIterable); } public static Iterable<NBTTagString> stringIterableToNbt(Iterable<String> paramIterable) { return ExtendedNBT$.MODULE$.stringIterableToNbt(paramIterable); } public static Iterable<NBTTagByteArray> byteArrayIterableToNbt(Iterable<byte[]> paramIterable) { return ExtendedNBT$.MODULE$.byteArrayIterableToNbt(paramIterable); } public static Iterable<NBTTagDouble> doubleIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.doubleIterableToNbt(paramIterable); } public static Iterable<NBTTagFloat> floatIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.floatIterableToNbt(paramIterable); } public static Iterable<NBTTagLong> longIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.longIterableToNbt(paramIterable); } public static Iterable<NBTTagIntArray> intArrayIterableToNbt(Iterable<int[]> paramIterable) { return ExtendedNBT$.MODULE$.intArrayIterableToNbt(paramIterable); } public static Iterable<NBTTagInt> intIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.intIterableToNbt(paramIterable); } public static Iterable<NBTTagShort> shortIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.shortIterableToNbt(paramIterable); } public static Iterable<NBTTagByte> byteIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.byteIterableToNbt(paramIterable); } public static Iterable<NBTTagByte> booleanIterableToNbt(Iterable<Object> paramIterable) { return ExtendedNBT$.MODULE$.booleanIterableToNbt(paramIterable); } public static NBTBase typedMapToNbt(Map<?, ?> paramMap) { return ExtendedNBT$.MODULE$.typedMapToNbt(paramMap); } public static NBTTagCompound toNbt(Map<String, ?> paramMap) { return ExtendedNBT$.MODULE$.toNbt(paramMap); } public static NBTTagCompound toNbt(Function1<NBTTagCompound, BoxedUnit> paramFunction1) { return ExtendedNBT$.MODULE$.toNbt(paramFunction1); } public static NBTTagCompound toNbt(ItemStack paramItemStack) { return ExtendedNBT$.MODULE$.toNbt(paramItemStack); } public static NBTTagString toNbt(String paramString) { return ExtendedNBT$.MODULE$.toNbt(paramString); } public static NBTTagByteArray toNbt(boolean[] paramArrayOfboolean) { return ExtendedNBT$.MODULE$.toNbt(paramArrayOfboolean); } public static NBTTagIntArray toNbt(int[] paramArrayOfint) { return ExtendedNBT$.MODULE$.toNbt(paramArrayOfint); } public static NBTTagByteArray toNbt(byte[] paramArrayOfbyte) { return ExtendedNBT$.MODULE$.toNbt(paramArrayOfbyte); } public static NBTTagDouble toNbt(double paramDouble) { return ExtendedNBT$.MODULE$.toNbt(paramDouble); } public static NBTTagFloat toNbt(float paramFloat) { return ExtendedNBT$.MODULE$.toNbt(paramFloat); } public static NBTTagLong toNbt(long paramLong) { return ExtendedNBT$.MODULE$.toNbt(paramLong); } public static NBTTagInt toNbt(int paramInt) { return ExtendedNBT$.MODULE$.toNbt(paramInt); } public static NBTTagShort toNbt(short paramShort) {
/*     */     return ExtendedNBT$.MODULE$.toNbt(paramShort);
/*     */   } public static NBTTagByte toNbt(byte paramByte) {
/*     */     return ExtendedNBT$.MODULE$.toNbt(paramByte);
/*     */   } public static NBTTagByte toNbt(boolean paramBoolean) {
/*     */     return ExtendedNBT$.MODULE$.toNbt(paramBoolean);
/*     */   } public final class ExtendedNBT$$anonfun$toNbt$1 extends AbstractFunction1<Object, Object> implements Serializable { public final byte apply(boolean x$1) {
/*  36 */       return x$1 ? 1 : 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static final long serialVersionUID = 0L; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$toNbt$2
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*     */       boolean bool;
/*  56 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class ExtendedNBT$$anonfun$toNbt$3 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { String key = (String)tuple2._1(); Object value = tuple2._2(), object1 = value;
/*  57 */         if (object1 instanceof Boolean) { boolean bool = BoxesRunTime.unboxToBoolean(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(bool)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  58 */         else if (object1 instanceof Byte) { byte b = BoxesRunTime.unboxToByte(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(b)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  59 */         else if (object1 instanceof Short) { short s = BoxesRunTime.unboxToShort(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(s)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  60 */         else if (object1 instanceof Integer) { int i = BoxesRunTime.unboxToInt(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(i)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  61 */         else if (object1 instanceof Long) { long l = BoxesRunTime.unboxToLong(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(l)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  62 */         else if (object1 instanceof Float) { float f = BoxesRunTime.unboxToFloat(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(f)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  63 */         else if (object1 instanceof Double) { double d = BoxesRunTime.unboxToDouble(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(d)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  64 */         else if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(arrayOfByte)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  65 */         else if (object1 instanceof int[]) { int[] arrayOfInt = (int[])object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(arrayOfInt)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  66 */         else if (object1 instanceof String) { String str = (String)object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(str)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  67 */         else if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(itemStack)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  68 */         else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */         
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return; }
/*     */       
/*     */       throw new MatchError(tuple2); } public ExtendedNBT$$anonfun$toNbt$3(NBTTagCompound nbt$1) {} } public final class ExtendedNBT$$anonfun$mapToList$1$1 extends AbstractPartialFunction<Tuple2<?, ?>, Tuple2<Number, Object>> implements Serializable { public static final long serialVersionUID = 0L;
/*  74 */     public final <A1 extends Tuple2<?, ?>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null)
/*     */       
/*  76 */       { Object k = tuple2._1(), v = tuple2._2(); if (k instanceof Number) { Number number = (Number)k; return (B1)Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(number), v); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Object k = tuple2._1(); if (k instanceof Number)
/*  77 */           return true;  }  return false; } } public final class ExtendedNBT$$anonfun$mapToList$1$2 extends AbstractFunction1<Tuple2<Number, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(Tuple2 x$3) { return ((Number)x$3._1()).intValue(); } } public final class ExtendedNBT$$anonfun$mapToList$1$3 extends AbstractFunction1<Tuple2<Number, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Tuple2 x$4) { return x$4._2(); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final byte apply(Object x0$1) {
/* 127 */       Object object = x0$1;
/* 128 */       if (object instanceof Number) { Number number = (Number)object; return number.byteValue(); }
/* 129 */        throw new IllegalArgumentException("Illegal value.");
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$2
/*     */     extends AbstractFunction1<Object, Map<Nothing$, Object>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Map<Nothing$, Object> apply(Object v) {
/* 140 */       return ExtendedNBT$.MODULE$.li$cil$oc$util$ExtendedNBT$$asMap$1(Option$.MODULE$.apply(v)); } } public final class ExtendedNBT$$anonfun$typedMapToNbt$3 extends AbstractFunction1<Map<Nothing$, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList list$1; public final void apply(Map<?, ?> v) { this.list$1.func_74742_a(ExtendedNBT$.MODULE$.typedMapToNbt(v)); }
/*     */     
/*     */     public ExtendedNBT$$anonfun$typedMapToNbt$3(NBTTagList list$1) {} }
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$4 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/* 146 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class ExtendedNBT$$anonfun$typedMapToNbt$5 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(Tuple2 x$5) { Tuple2 tuple2 = x$5; if (tuple2 != null) { String name = (String)tuple2._1(); Object entry = tuple2._2(); try { return; }
/* 147 */         finally { Exception exception = null; (new String[3])[0] = "Error converting entry '"; (new String[3])[1] = "': "; (new String[3])[2] = ""; }
/*     */          }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public ExtendedNBT$$anonfun$typedMapToNbt$5(NBTTagCompound nbt$2) {} }
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$6 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final int apply(Object x0$2) {
/* 154 */       Object object = x0$2;
/* 155 */       if (object instanceof Number) { Number number = (Number)object; return number.intValue(); }
/* 156 */        throw new IllegalArgumentException();
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$booleanIterableToNbt$1
/*     */     extends AbstractFunction1<Object, NBTTagByte>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final NBTTagByte apply(boolean value) {
/* 166 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$byteIterableToNbt$1 extends AbstractFunction1<Object, NBTTagByte> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagByte apply(byte value) {
/* 168 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$shortIterableToNbt$1 extends AbstractFunction1<Object, NBTTagShort> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagShort apply(short value) {
/* 170 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$intIterableToNbt$1 extends AbstractFunction1<Object, NBTTagInt> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagInt apply(int value) {
/* 172 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$intArrayIterableToNbt$1 extends AbstractFunction1<int[], NBTTagIntArray> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagIntArray apply(int[] value) {
/* 174 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$longIterableToNbt$1 extends AbstractFunction1<Object, NBTTagLong> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagLong apply(long value) {
/* 176 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$floatIterableToNbt$1 extends AbstractFunction1<Object, NBTTagFloat> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagFloat apply(float value) {
/* 178 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$doubleIterableToNbt$1 extends AbstractFunction1<Object, NBTTagDouble> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagDouble apply(double value) {
/* 180 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$byteArrayIterableToNbt$1 extends AbstractFunction1<byte[], NBTTagByteArray> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagByteArray apply(byte[] value) {
/* 182 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$stringIterableToNbt$1 extends AbstractFunction1<String, NBTTagString> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagString apply(String value) {
/* 184 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$writableIterableToNbt$1 extends AbstractFunction1<Function1<NBTTagCompound, BoxedUnit>, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Function1<NBTTagCompound, BoxedUnit> value) {
/* 186 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } } public final class ExtendedNBT$$anonfun$itemStackIterableToNbt$1 extends AbstractFunction1<ItemStack, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(ItemStack value) {
/* 188 */       return ExtendedNBT$.MODULE$.toNbt(value);
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class ExtendedNBTBase
/*     */   {
/*     */     private final NBTBase nbt;
/*     */     
/* 196 */     public NBTBase nbt() { return this.nbt; } public ExtendedNBTBase(NBTBase nbt) {} public Map<String, ?> toTypedMap() { int[] arrayOfInt;
/* 197 */       (new Tuple2[2])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("type"), BoxesRunTime.boxToByte(nbt().func_74732_a())); NBTBase nBTBase = nbt();
/* 198 */       if (nBTBase instanceof NBTTagByte) { NBTTagByte nBTTagByte = (NBTTagByte)nBTBase; Byte byte_ = BoxesRunTime.boxToByte(nBTTagByte.func_150290_f()); }
/* 199 */       else if (nBTBase instanceof NBTTagShort) { NBTTagShort nBTTagShort = (NBTTagShort)nBTBase; Short short_ = BoxesRunTime.boxToShort(nBTTagShort.func_150289_e()); }
/* 200 */       else if (nBTBase instanceof NBTTagInt) { NBTTagInt nBTTagInt = (NBTTagInt)nBTBase; Integer integer = BoxesRunTime.boxToInteger(nBTTagInt.func_150287_d()); }
/* 201 */       else if (nBTBase instanceof NBTTagLong) { NBTTagLong nBTTagLong = (NBTTagLong)nBTBase; Long long_ = BoxesRunTime.boxToLong(nBTTagLong.func_150291_c()); }
/* 202 */       else if (nBTBase instanceof NBTTagFloat) { NBTTagFloat nBTTagFloat = (NBTTagFloat)nBTBase; Float float_ = BoxesRunTime.boxToFloat(nBTTagFloat.func_150288_h()); }
/* 203 */       else if (nBTBase instanceof NBTTagDouble) { NBTTagDouble nBTTagDouble = (NBTTagDouble)nBTBase; Double double_ = BoxesRunTime.boxToDouble(nBTTagDouble.func_150286_g()); }
/* 204 */       else if (nBTBase instanceof NBTTagByteArray) { NBTTagByteArray nBTTagByteArray = (NBTTagByteArray)nBTBase; byte[] arrayOfByte = nBTTagByteArray.func_150292_c(); }
/* 205 */       else if (nBTBase instanceof NBTTagString) { NBTTagString nBTTagString = (NBTTagString)nBTBase; String str = nBTTagString.func_150285_a_(); }
/* 206 */       else if (nBTBase instanceof NBTTagList) { NBTTagList nBTTagList = (NBTTagList)nBTBase; IndexedSeq<?> indexedSeq = ExtendedNBT$.MODULE$.extendNBTTagList(nBTTagList).map((Function1<NBTBase, ?>)new ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$2(this)); }
/* 207 */       else if (nBTBase instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)nBTBase;
/*     */         
/* 209 */         Map map = ((TraversableOnce)WrapAsScala$.MODULE$.asScalaSet(nBTTagCompound.func_150296_c()).collect((PartialFunction)new ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$1(this, nBTTagCompound), Set$.MODULE$.canBuildFrom())).toMap(Predef$.MODULE$.$conforms()); }
/* 210 */       else { if (nBTBase instanceof NBTTagIntArray) { NBTTagIntArray nBTTagIntArray = (NBTTagIntArray)nBTBase; arrayOfInt = nBTTagIntArray.func_150302_c(); (new Tuple2[2])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("value"), arrayOfInt); return (Map<String, ?>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2])); }
/* 211 */          throw new IllegalArgumentException(); }  (new Tuple2[2])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("value"), arrayOfInt); return (Map<String, ?>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2])); } public final class ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$2 extends AbstractFunction1<NBTBase, Map<String, Object>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final Map<String, Object> apply(NBTBase entry) { return (Map)ExtendedNBT$.MODULE$.extendNBTBase(entry).toTypedMap(); } public ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$2(ExtendedNBT.ExtendedNBTBase $outer) {} } public final class ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$1 extends AbstractPartialFunction<Object, Tuple2<String, Map<String, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound x11$1; public final <A1, B1> B1 applyOrElse(Object x2, Function1 default) { Object object2, object1 = x2; if (object1 instanceof String) { String str = (String)object1; object2 = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(str), ExtendedNBT$.MODULE$.extendNBTBase(this.x11$1.func_74781_a(str)).toTypedMap()); } else { object2 = default.apply(x2); }  return (B1)object2; } public final boolean isDefinedAt(Object x2) { boolean bool; Object object = x2; if (object instanceof String) { bool = true; } else { bool = false; }  return bool; } public ExtendedNBT$ExtendedNBTBase$$anonfun$toTypedMap$1(ExtendedNBT.ExtendedNBTBase $outer, NBTTagCompound x11$1) {} }
/*     */   }
/*     */   public static class ExtendedNBTTagCompound { private final NBTTagCompound nbt;
/* 215 */     public NBTTagCompound nbt() { return this.nbt; }
/*     */      public ExtendedNBTTagCompound(NBTTagCompound nbt) {} public NBTTagCompound setNewCompoundTag(String name, Function1 f) {
/* 217 */       NBTTagCompound t = new NBTTagCompound();
/* 218 */       f.apply(t);
/* 219 */       nbt().func_74782_a(name, (NBTBase)t);
/* 220 */       return nbt();
/*     */     }
/*     */     
/*     */     public NBTTagCompound setNewTagList(String name, Iterable<NBTBase> values) {
/* 224 */       NBTTagList t = new NBTTagList();
/* 225 */       ExtendedNBT$.MODULE$.extendNBTTagList(t).append(values);
/* 226 */       nbt().func_74782_a(name, (NBTBase)t);
/* 227 */       return nbt();
/*     */     }
/*     */     public NBTTagCompound setNewTagList(String name, Seq values) {
/* 230 */       return setNewTagList(name, (Iterable<NBTBase>)values);
/*     */     }
/*     */     public Option<ForgeDirection> getDirection(String name) {
/* 233 */       byte b = nbt().func_74771_c(name); switch (b) {  }
/* 234 */        if (b < 0) {  }
/*     */       else
/* 236 */       { ForgeDirection side = ForgeDirection.getOrientation(b);
/*     */         
/* 238 */         ForgeDirection forgeDirection1 = ForgeDirection.UNKNOWN; if (side == null) { if (forgeDirection1 != null); } else if (side.equals(forgeDirection1)) {  }  }  return (Option<ForgeDirection>)None$.MODULE$;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void setDirection(String name, Option d) {
/* 244 */       Option option = d;
/* 245 */       if (option instanceof Some) { Some some = (Some)option; ForgeDirection side = (ForgeDirection)some.x(); nbt().func_74774_a(name, (byte)side.ordinal()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 246 */       else { nbt().func_74774_a(name, (byte)-1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */     
/* 250 */     public boolean[] getBooleanArray(String name) { return (boolean[])Predef$.MODULE$.byteArrayOps(nbt().func_74770_j(name)).map((Function1)new ExtendedNBT$ExtendedNBTTagCompound$$anonfun$getBooleanArray$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean())); } public final class ExtendedNBT$ExtendedNBTTagCompound$$anonfun$getBooleanArray$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(byte x$6) { return (x$6 == 1); }
/*     */        public ExtendedNBT$ExtendedNBTTagCompound$$anonfun$getBooleanArray$1(ExtendedNBT.ExtendedNBTTagCompound $outer) {} } public void setBooleanArray(String name, boolean[] value) {
/* 252 */       nbt().func_74782_a(name, (NBTBase)ExtendedNBT$.MODULE$.toNbt(value));
/*     */     } } public static class ExtendedNBTTagList { private final NBTTagList nbt;
/*     */     public NBTTagList nbt() {
/* 255 */       return this.nbt;
/*     */     } public ExtendedNBTTagList(NBTTagList nbt) {} public void appendNewCompoundTag(Function1 f) {
/* 257 */       NBTTagCompound t = new NBTTagCompound();
/* 258 */       f.apply(t);
/* 259 */       nbt().func_74742_a((NBTBase)t);
/*     */     }
/*     */     
/*     */     public void append(Iterable values) {
/* 263 */       values.foreach((Function1)new ExtendedNBT$ExtendedNBTTagList$$anonfun$append$1(this)); } public final class ExtendedNBT$ExtendedNBTTagList$$anonfun$append$1 extends AbstractFunction1<NBTBase, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public ExtendedNBT$ExtendedNBTTagList$$anonfun$append$1(ExtendedNBT.ExtendedNBTTagList $outer) {} public final void apply(NBTBase value) {
/* 264 */         this.$outer.nbt().func_74742_a(value);
/*     */       } }
/*     */     
/*     */     public void append(Seq values) {
/* 268 */       append((Iterable<NBTBase>)values);
/*     */     }
/*     */     public <Tag extends NBTBase> void foreach(Function1 f) {
/* 271 */       NBTTagList iterable = (NBTTagList)nbt().func_74737_b();
/* 272 */       while (iterable.func_74745_c() > 0) {
/* 273 */         f.apply(iterable.func_74744_a(0));
/*     */       }
/*     */     }
/*     */     
/*     */     public <Tag extends NBTBase, Value> IndexedSeq<Value> map(Function1 f) {
/* 278 */       NBTTagList iterable = (NBTTagList)nbt().func_74737_b();
/* 279 */       ArrayBuffer buffer = (ArrayBuffer)ArrayBuffer$.MODULE$.empty();
/* 280 */       while (iterable.func_74745_c() > 0) {
/* 281 */         buffer.$plus$eq(f.apply(iterable.func_74744_a(0)));
/*     */       }
/* 283 */       return (IndexedSeq<Value>)buffer;
/*     */     }
/*     */     
/* 286 */     public <Tag> Object toArray(ClassTag evidence$1) { return map((Function1<NBTBase, Value>)new ExtendedNBT$ExtendedNBTTagList$$anonfun$toArray$1(this)).toArray(evidence$1); } public final class ExtendedNBT$ExtendedNBTTagList$$anonfun$toArray$1 extends AbstractFunction1<Tag, Tag> implements Serializable { public static final long serialVersionUID = 0L; public final Tag apply(Object t) { return (Tag)t; }
/*     */ 
/*     */       
/*     */       public ExtendedNBT$ExtendedNBTTagList$$anonfun$toArray$1(ExtendedNBT.ExtendedNBTTagList $outer) {} }
/*     */      }
/*     */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedNBT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */