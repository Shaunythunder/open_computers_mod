/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Map$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Ue\001B\001\003\0015\021\001bS3zE>\f'\017\032\006\003\007\021\t\021bY8na>tWM\034;\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0277A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032%\005A\021N\034;fe:\fG.\003\002\0021A\021AdH\007\002;)\021aDE\001\007IJLg/\032:\n\005\001j\"A\003#fm&\034W-\0238g_\"A!\005\001BC\002\023\0051%\001\003i_N$X#\001\023\021\005\025BS\"\001\024\013\005\035\022\022a\0028fi^|'o[\005\003S\031\022q\"\0228wSJ|g.\\3oi\"{7\017\036\005\tW\001\021\t\021)A\005I\005)\001n\\:uA!)Q\006\001C\001]\0051A(\0338jiz\"\"aL\031\021\005A\002Q\"\001\002\t\013\tb\003\031\001\023\t\017M\002!\031!C!i\005!an\0343f+\005)\004CA\0237\023\t9dEA\005D_6\004xN\\3oi\"1\021\b\001Q\001\nU\nQA\\8eK\002Bqa\017\001C\002\023\005A(A\006qe\026\0348/\0323LKf\034X#A\037\021\ty*uiU\007\002)\021\001)Q\001\b[V$\030M\0317f\025\t\0215)\001\006d_2dWm\031;j_:T\021\001R\001\006g\016\fG.Y\005\003\r~\0221!T1q!\tA\025+D\001J\025\tQ5*\001\004qY\006LXM\035\006\003\0316\013a!\0328uSRL(B\001(P\003%i\027N\\3de\0064GOC\001Q\003\rqW\r^\005\003%&\023A\"\0228uSRL\b\013\\1zKJ\004BAP#U9B\021QKW\007\002-*\021q\013W\001\005Y\006twMC\001Z\003\021Q\027M^1\n\005m3&aB%oi\026<WM\035\t\003+vK!A\030,\003\023\rC\027M]1di\026\024\bB\0021\001A\003%Q(\001\007qe\026\0348/\0323LKf\034\b\005C\004c\001\001\007I\021A2\002\035U\034\030M\0317f\037Z,'O]5eKV\tA\rE\002fM\"l\021aQ\005\003O\016\023aa\0249uS>t\007CA5r\035\tQwN\004\002l]:\021A.\\\007\002\r%\0211CB\005\0033II!\001\035\r\002\021-+\027PY8be\022L!A]:\003!U\033\030MY5mSRL8\t[3dW\026\024(B\0019\031\021\035)\b\0011A\005\002Y\f!#^:bE2,wJ^3se&$Wm\030\023fcR\021qO\037\t\003KbL!!_\"\003\tUs\027\016\036\005\bwR\f\t\0211\001e\003\rAH%\r\005\007{\002\001\013\025\0023\002\037U\034\030M\0317f\037Z,'O]5eK\002Baa \001\005B\005\005\021!E:fiV\033\030M\0317f\037Z,'O]5eKR\031q/a\001\t\017\005\025a\0201\001\002\b\005A1-\0317mE\006\0347\016E\002\002\nEt1!a\003p\035\r\tiA\034\b\004\003\037ig\002BA\t\003?qA!a\005\002\0369!\021QCA\016\033\t\t9BC\002\002\0321\ta\001\020:p_Rt\024\"A\006\n\005%Q\021BA\004\t\021)\t\031\003\001EC\002\0235\021QE\001\013I\0264\030nY3J]\032|WCAA\024!!\tI#a\f\0022\005ERBAA\026\025\r\ti#Q\001\nS6lW\017^1cY\026L1ARA\026!\r)\0261G\005\004\003k1&AB*ue&tw\r\003\006\002:\001A\t\021)Q\007\003O\t1\002Z3wS\016,\027J\0344pA!9\021Q\b\001\005B\005}\022!D4fi\022+g/[2f\023:4w\016\006\002\002BAA\0211IA%\003\027\nY%\004\002\002F)\031\021q\t-\002\tU$\030\016\\\005\004\r\006\025\003\003BA'\003'r1!ZA(\023\r\t\tfQ\001\007!J,G-\0324\n\t\005U\022Q\013\006\004\003#\032\005bBA-\001\021\005\0211L\001\023e\026dW-Y:f!J,7o]3e\027\026L8\017F\002x\003;BaASA,\001\0049\005bBA1\001\021\005\0231M\001\n_:lUm]:bO\026$2a^A3\021!\t9'a\030A\002\005%\024aB7fgN\fw-\032\t\004K\005-\024bAA7M\t9Q*Z:tC\036,\007bBA9\001\021\005\0211O\001\022SN,6/Z1cY\026\024\025\020\0257bs\026\024H\003BA;\003w\0022!ZA<\023\r\tIh\021\002\b\005>|G.Z1o\021\035\ti(a\034A\002\035\013\021\001\035\005\b\003\003\003A\021CAB\003\031\031\030n\0328bYR\031q/!\"\t\021\005\035\025q\020a\001\003\023\013A!\031:hgB)Q-a#\002\020&\031\021QR\"\003\025q\022X\r]3bi\026$g\bE\002f\003#K1!a%D\005\031\te.\037*fM\002")
/*     */ public class Keyboard extends ManagedEnvironment implements Keyboard, DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   
/*     */   public EnvironmentHost host() {
/*  25 */     return this.host;
/*  26 */   } private final Component node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  27 */     .withComponent("keyboard")
/*  28 */     .create(); public Component node() {
/*     */     return this.node;
/*  30 */   } private final Map<EntityPlayer, Map<Integer, Character>> pressedKeys = Map$.MODULE$.empty(); public Map<EntityPlayer, Map<Integer, Character>> pressedKeys() { return this.pressedKeys; }
/*     */   
/*  32 */   private Option<Keyboard.UsabilityChecker> usableOverride = (Option<Keyboard.UsabilityChecker>)None$.MODULE$; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public Option<Keyboard.UsabilityChecker> usableOverride() { return this.usableOverride; } public void usableOverride_$eq(Option<Keyboard.UsabilityChecker> x$1) { this.usableOverride = x$1; }
/*     */    public void setUsableOverride(Keyboard.UsabilityChecker callback) {
/*  34 */     usableOverride_$eq(Option$.MODULE$.apply(callback));
/*     */   }
/*     */   
/*     */   private Map deviceInfo$lzycompute() {
/*  38 */     synchronized (this) { if (!this.bitmap$0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  39 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "input");
/*  40 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Keyboard");
/*  41 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  42 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Fancytyper MX-Stone"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */   
/*  45 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   public final class Keyboard$$anonfun$releasePressedKeys$1 extends AbstractFunction1<Tuple2<Integer, Character>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*  50 */        return bool; } public Keyboard$$anonfun$releasePressedKeys$1(Keyboard $outer) {} } public void releasePressedKeys(EntityPlayer player) { Option option = pressedKeys().get(player);
/*  51 */     if (option instanceof Some) { Some some = (Some)option; Map keys = (Map)some.x(); keys.withFilter((Function1)new Keyboard$$anonfun$releasePressedKeys$1(this)).foreach((Function1)new Keyboard$$anonfun$releasePressedKeys$2(this, player)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */       
/*  59 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*  61 */     pressedKeys().remove(player); } public final class Keyboard$$anonfun$releasePressedKeys$2 extends AbstractFunction1<Tuple2<Integer, Character>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) {
/*     */         Integer code = (Integer)tuple2._1(); Character char = (Character)tuple2._2(); this.$outer.signal((Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { this.player$1, "key_up", char, code, this.player$1.func_70005_c_() }));
/*     */         this.$outer.signal((Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { this.player$1, "key_up", char, code }));
/*     */         BoxedUnit boxedUnit = Settings$.MODULE$.get().inputUsername() ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple2); } public Keyboard$$anonfun$releasePressedKeys$2(Keyboard $outer, EntityPlayer player$1) {}
/*     */   } public void onMessage(Message message) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   6: astore_2
/*     */     //   7: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   10: aload_2
/*     */     //   11: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   14: astore_3
/*     */     //   15: aload_3
/*     */     //   16: invokevirtual isEmpty : ()Z
/*     */     //   19: ifne -> 330
/*     */     //   22: aload_3
/*     */     //   23: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   26: ifnull -> 330
/*     */     //   29: aload_3
/*     */     //   30: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   33: checkcast scala/collection/SeqLike
/*     */     //   36: iconst_3
/*     */     //   37: invokeinterface lengthCompare : (I)I
/*     */     //   42: iconst_0
/*     */     //   43: if_icmpne -> 330
/*     */     //   46: aload_3
/*     */     //   47: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   50: checkcast scala/collection/SeqLike
/*     */     //   53: iconst_0
/*     */     //   54: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   59: astore #4
/*     */     //   61: aload_3
/*     */     //   62: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   65: checkcast scala/collection/SeqLike
/*     */     //   68: iconst_1
/*     */     //   69: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   74: astore #5
/*     */     //   76: aload_3
/*     */     //   77: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   80: checkcast scala/collection/SeqLike
/*     */     //   83: iconst_2
/*     */     //   84: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   89: astore #6
/*     */     //   91: aload #4
/*     */     //   93: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   96: ifeq -> 330
/*     */     //   99: aload #4
/*     */     //   101: checkcast net/minecraft/entity/player/EntityPlayer
/*     */     //   104: astore #7
/*     */     //   106: aload #5
/*     */     //   108: instanceof java/lang/Character
/*     */     //   111: ifeq -> 330
/*     */     //   114: aload #5
/*     */     //   116: checkcast java/lang/Character
/*     */     //   119: astore #8
/*     */     //   121: aload #6
/*     */     //   123: instanceof java/lang/Integer
/*     */     //   126: ifeq -> 330
/*     */     //   129: aload #6
/*     */     //   131: checkcast java/lang/Integer
/*     */     //   134: astore #9
/*     */     //   136: aload_1
/*     */     //   137: invokeinterface name : ()Ljava/lang/String;
/*     */     //   142: ldc 'keyboard.keyDown'
/*     */     //   144: astore #10
/*     */     //   146: dup
/*     */     //   147: ifnonnull -> 159
/*     */     //   150: pop
/*     */     //   151: aload #10
/*     */     //   153: ifnull -> 167
/*     */     //   156: goto -> 330
/*     */     //   159: aload #10
/*     */     //   161: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 330
/*     */     //   167: aload_0
/*     */     //   168: aload #7
/*     */     //   170: invokevirtual isUseableByPlayer : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   173: ifeq -> 322
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual pressedKeys : ()Lscala/collection/mutable/Map;
/*     */     //   180: aload #7
/*     */     //   182: new li/cil/oc/server/component/Keyboard$$anonfun$onMessage$1
/*     */     //   185: dup
/*     */     //   186: aload_0
/*     */     //   187: invokespecial <init> : (Lli/cil/oc/server/component/Keyboard;)V
/*     */     //   190: invokeinterface getOrElseUpdate : (Ljava/lang/Object;Lscala/Function0;)Ljava/lang/Object;
/*     */     //   195: checkcast scala/collection/mutable/MapLike
/*     */     //   198: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   201: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   204: aload #9
/*     */     //   206: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   209: aload #8
/*     */     //   211: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   214: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */     //   219: pop
/*     */     //   220: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   223: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   226: invokevirtual inputUsername : ()Z
/*     */     //   229: ifeq -> 281
/*     */     //   232: aload_0
/*     */     //   233: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   236: iconst_5
/*     */     //   237: anewarray java/lang/Object
/*     */     //   240: dup
/*     */     //   241: iconst_0
/*     */     //   242: aload #7
/*     */     //   244: aastore
/*     */     //   245: dup
/*     */     //   246: iconst_1
/*     */     //   247: ldc_w 'key_down'
/*     */     //   250: aastore
/*     */     //   251: dup
/*     */     //   252: iconst_2
/*     */     //   253: aload #8
/*     */     //   255: aastore
/*     */     //   256: dup
/*     */     //   257: iconst_3
/*     */     //   258: aload #9
/*     */     //   260: aastore
/*     */     //   261: dup
/*     */     //   262: iconst_4
/*     */     //   263: aload #7
/*     */     //   265: invokevirtual func_70005_c_ : ()Ljava/lang/String;
/*     */     //   268: aastore
/*     */     //   269: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   272: invokevirtual signal : (Lscala/collection/Seq;)V
/*     */     //   275: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   278: goto -> 325
/*     */     //   281: aload_0
/*     */     //   282: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   285: iconst_4
/*     */     //   286: anewarray java/lang/Object
/*     */     //   289: dup
/*     */     //   290: iconst_0
/*     */     //   291: aload #7
/*     */     //   293: aastore
/*     */     //   294: dup
/*     */     //   295: iconst_1
/*     */     //   296: ldc_w 'key_down'
/*     */     //   299: aastore
/*     */     //   300: dup
/*     */     //   301: iconst_2
/*     */     //   302: aload #8
/*     */     //   304: aastore
/*     */     //   305: dup
/*     */     //   306: iconst_3
/*     */     //   307: aload #9
/*     */     //   309: aastore
/*     */     //   310: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   313: invokevirtual signal : (Lscala/collection/Seq;)V
/*     */     //   316: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   319: goto -> 325
/*     */     //   322: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   325: astore #11
/*     */     //   327: goto -> 873
/*     */     //   330: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   333: aload_2
/*     */     //   334: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   337: astore #12
/*     */     //   339: aload #12
/*     */     //   341: invokevirtual isEmpty : ()Z
/*     */     //   344: ifne -> 675
/*     */     //   347: aload #12
/*     */     //   349: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   352: ifnull -> 675
/*     */     //   355: aload #12
/*     */     //   357: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   360: checkcast scala/collection/SeqLike
/*     */     //   363: iconst_3
/*     */     //   364: invokeinterface lengthCompare : (I)I
/*     */     //   369: iconst_0
/*     */     //   370: if_icmpne -> 675
/*     */     //   373: aload #12
/*     */     //   375: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   378: checkcast scala/collection/SeqLike
/*     */     //   381: iconst_0
/*     */     //   382: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   387: astore #13
/*     */     //   389: aload #12
/*     */     //   391: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   394: checkcast scala/collection/SeqLike
/*     */     //   397: iconst_1
/*     */     //   398: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   403: astore #14
/*     */     //   405: aload #12
/*     */     //   407: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   410: checkcast scala/collection/SeqLike
/*     */     //   413: iconst_2
/*     */     //   414: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   419: astore #15
/*     */     //   421: aload #13
/*     */     //   423: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   426: ifeq -> 675
/*     */     //   429: aload #13
/*     */     //   431: checkcast net/minecraft/entity/player/EntityPlayer
/*     */     //   434: astore #16
/*     */     //   436: aload #14
/*     */     //   438: instanceof java/lang/Character
/*     */     //   441: ifeq -> 675
/*     */     //   444: aload #14
/*     */     //   446: checkcast java/lang/Character
/*     */     //   449: astore #17
/*     */     //   451: aload #15
/*     */     //   453: instanceof java/lang/Integer
/*     */     //   456: ifeq -> 675
/*     */     //   459: aload #15
/*     */     //   461: checkcast java/lang/Integer
/*     */     //   464: astore #18
/*     */     //   466: aload_1
/*     */     //   467: invokeinterface name : ()Ljava/lang/String;
/*     */     //   472: ldc_w 'keyboard.keyUp'
/*     */     //   475: astore #19
/*     */     //   477: dup
/*     */     //   478: ifnonnull -> 490
/*     */     //   481: pop
/*     */     //   482: aload #19
/*     */     //   484: ifnull -> 498
/*     */     //   487: goto -> 675
/*     */     //   490: aload #19
/*     */     //   492: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   495: ifeq -> 675
/*     */     //   498: aload_0
/*     */     //   499: invokevirtual pressedKeys : ()Lscala/collection/mutable/Map;
/*     */     //   502: aload #16
/*     */     //   504: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   509: astore #20
/*     */     //   511: aload #20
/*     */     //   513: instanceof scala/Some
/*     */     //   516: ifeq -> 662
/*     */     //   519: aload #20
/*     */     //   521: checkcast scala/Some
/*     */     //   524: astore #21
/*     */     //   526: aload #21
/*     */     //   528: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   531: checkcast scala/collection/mutable/Map
/*     */     //   534: astore #22
/*     */     //   536: aload #22
/*     */     //   538: aload #18
/*     */     //   540: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   545: ifeq -> 662
/*     */     //   548: aload #22
/*     */     //   550: aload #18
/*     */     //   552: invokeinterface $minus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/MapLike;
/*     */     //   557: pop
/*     */     //   558: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   561: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   564: invokevirtual inputUsername : ()Z
/*     */     //   567: ifeq -> 619
/*     */     //   570: aload_0
/*     */     //   571: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   574: iconst_5
/*     */     //   575: anewarray java/lang/Object
/*     */     //   578: dup
/*     */     //   579: iconst_0
/*     */     //   580: aload #16
/*     */     //   582: aastore
/*     */     //   583: dup
/*     */     //   584: iconst_1
/*     */     //   585: ldc_w 'key_up'
/*     */     //   588: aastore
/*     */     //   589: dup
/*     */     //   590: iconst_2
/*     */     //   591: aload #17
/*     */     //   593: aastore
/*     */     //   594: dup
/*     */     //   595: iconst_3
/*     */     //   596: aload #18
/*     */     //   598: aastore
/*     */     //   599: dup
/*     */     //   600: iconst_4
/*     */     //   601: aload #16
/*     */     //   603: invokevirtual func_70005_c_ : ()Ljava/lang/String;
/*     */     //   606: aastore
/*     */     //   607: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   610: invokevirtual signal : (Lscala/collection/Seq;)V
/*     */     //   613: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   616: goto -> 657
/*     */     //   619: aload_0
/*     */     //   620: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   623: iconst_4
/*     */     //   624: anewarray java/lang/Object
/*     */     //   627: dup
/*     */     //   628: iconst_0
/*     */     //   629: aload #16
/*     */     //   631: aastore
/*     */     //   632: dup
/*     */     //   633: iconst_1
/*     */     //   634: ldc_w 'key_up'
/*     */     //   637: aastore
/*     */     //   638: dup
/*     */     //   639: iconst_2
/*     */     //   640: aload #17
/*     */     //   642: aastore
/*     */     //   643: dup
/*     */     //   644: iconst_3
/*     */     //   645: aload #18
/*     */     //   647: aastore
/*     */     //   648: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   651: invokevirtual signal : (Lscala/collection/Seq;)V
/*     */     //   654: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   657: astore #23
/*     */     //   659: goto -> 667
/*     */     //   662: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   665: astore #23
/*     */     //   667: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   670: astore #11
/*     */     //   672: goto -> 873
/*     */     //   675: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   678: aload_2
/*     */     //   679: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   682: astore #24
/*     */     //   684: aload #24
/*     */     //   686: invokevirtual isEmpty : ()Z
/*     */     //   689: ifne -> 868
/*     */     //   692: aload #24
/*     */     //   694: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   697: ifnull -> 868
/*     */     //   700: aload #24
/*     */     //   702: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   705: checkcast scala/collection/SeqLike
/*     */     //   708: iconst_2
/*     */     //   709: invokeinterface lengthCompare : (I)I
/*     */     //   714: iconst_0
/*     */     //   715: if_icmpne -> 868
/*     */     //   718: aload #24
/*     */     //   720: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   723: checkcast scala/collection/SeqLike
/*     */     //   726: iconst_0
/*     */     //   727: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   732: astore #25
/*     */     //   734: aload #24
/*     */     //   736: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   739: checkcast scala/collection/SeqLike
/*     */     //   742: iconst_1
/*     */     //   743: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   748: astore #26
/*     */     //   750: aload #25
/*     */     //   752: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   755: ifeq -> 868
/*     */     //   758: aload #25
/*     */     //   760: checkcast net/minecraft/entity/player/EntityPlayer
/*     */     //   763: astore #27
/*     */     //   765: aload #26
/*     */     //   767: instanceof java/lang/String
/*     */     //   770: ifeq -> 868
/*     */     //   773: aload #26
/*     */     //   775: checkcast java/lang/String
/*     */     //   778: astore #28
/*     */     //   780: aload_1
/*     */     //   781: invokeinterface name : ()Ljava/lang/String;
/*     */     //   786: ldc_w 'keyboard.clipboard'
/*     */     //   789: astore #29
/*     */     //   791: dup
/*     */     //   792: ifnonnull -> 804
/*     */     //   795: pop
/*     */     //   796: aload #29
/*     */     //   798: ifnull -> 812
/*     */     //   801: goto -> 868
/*     */     //   804: aload #29
/*     */     //   806: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   809: ifeq -> 868
/*     */     //   812: aload_0
/*     */     //   813: aload #27
/*     */     //   815: invokevirtual isUseableByPlayer : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   818: ifeq -> 860
/*     */     //   821: new scala/collection/immutable/StringOps
/*     */     //   824: dup
/*     */     //   825: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   828: aload #28
/*     */     //   830: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   833: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   836: invokevirtual linesWithSeparators : ()Lscala/collection/Iterator;
/*     */     //   839: new li/cil/oc/server/component/Keyboard$$anonfun$onMessage$2
/*     */     //   842: dup
/*     */     //   843: aload_0
/*     */     //   844: aload #27
/*     */     //   846: invokespecial <init> : (Lli/cil/oc/server/component/Keyboard;Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   849: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   854: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   857: goto -> 863
/*     */     //   860: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   863: astore #11
/*     */     //   865: goto -> 873
/*     */     //   868: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   871: astore #11
/*     */     //   873: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 0
/*     */     //   #68	-> 7
/*     */     //   #69	-> 167
/*     */     //   #70	-> 176
/*     */     //   #71	-> 220
/*     */     //   #72	-> 232
/*     */     //   #75	-> 281
/*     */     //   #69	-> 322
/*     */     //   #78	-> 330
/*     */     //   #79	-> 498
/*     */     //   #80	-> 511
/*     */     //   #81	-> 548
/*     */     //   #82	-> 558
/*     */     //   #83	-> 570
/*     */     //   #86	-> 619
/*     */     //   #80	-> 657
/*     */     //   #88	-> 662
/*     */     //   #79	-> 667
/*     */     //   #90	-> 675
/*     */     //   #91	-> 812
/*     */     //   #92	-> 821
/*     */     //   #91	-> 860
/*     */     //   #101	-> 868
/*     */     //   #67	-> 873
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	874	0	this	Lli/cil/oc/server/component/Keyboard;
/*     */     //   0	874	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   61	813	4	p	Ljava/lang/Object;
/*     */     //   76	798	5	char	Ljava/lang/Object;
/*     */     //   91	783	6	code	Ljava/lang/Object;
/*     */     //   389	485	13	p	Ljava/lang/Object;
/*     */     //   405	469	14	char	Ljava/lang/Object;
/*     */     //   421	453	15	code	Ljava/lang/Object;
/*     */     //   536	338	22	keys	Lscala/collection/mutable/Map;
/*     */     //   734	140	25	p	Ljava/lang/Object;
/*     */     //   750	124	26	value	Ljava/lang/Object; } public final class Keyboard$$anonfun$onMessage$1 extends AbstractFunction0<Map<Integer, Character>> implements Serializable {
/*  70 */     public final Map<Integer, Character> apply() { return Map$.MODULE$.empty(); }
/*     */ 
/*     */ 
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public Keyboard$$anonfun$onMessage$1(Keyboard $outer) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Keyboard$$anonfun$onMessage$2
/*     */     extends AbstractFunction1<String, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final EntityPlayer x11$1;
/*     */ 
/*     */     
/*     */     public Keyboard$$anonfun$onMessage$2(Keyboard $outer, EntityPlayer x11$1) {}
/*     */     
/*     */     public final void apply(String line) {
/*  93 */       if (Settings$.MODULE$.get().inputUsername()) {
/*  94 */         this.$outer.signal((Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { this.x11$1, "clipboard", line, this.x11$1.func_70005_c_() }));
/*     */       } else {
/*     */         
/*  97 */         this.$outer.signal((Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { this.x11$1, "clipboard", line }));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUseableByPlayer(EntityPlayer p) {
/*     */     boolean bool;
/* 107 */     Option<Keyboard.UsabilityChecker> option = usableOverride();
/* 108 */     if (option instanceof Some) { Some some = (Some)option; Keyboard.UsabilityChecker callback = (Keyboard.UsabilityChecker)some.x(); bool = callback.isUsableByPlayer(this, p); }
/* 109 */     else { bool = (p.func_70092_e(host().xPosition(), host().yPosition(), host().zPosition()) <= 64) ? true : false; }
/*     */     
/*     */     return bool;
/*     */   } public void signal(Seq args) {
/* 113 */     node().sendToReachable("computer.checked_signal", (Object[])args.toArray(ClassTag$.MODULE$.AnyRef()));
/*     */   }
/*     */   
/*     */   public Keyboard(EnvironmentHost host) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */