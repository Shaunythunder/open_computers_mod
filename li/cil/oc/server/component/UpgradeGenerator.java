/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import li.cil.oc.api.internal.Robot;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005]f\001B\001\003\0015\021\001#\0269he\006$WmR3oKJ\fGo\034:\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032%\0051AM]5wKJL!a\007\r\003\025\021+g/[2f\023:4w\016\003\005\036\001\t\025\r\021\"\001\037\003\021Awn\035;\026\003}\0212\001\t\022)\r\021\t\003\001A\020\003\031q\022XMZ5oK6,g\016\036 \021\005\r2S\"\001\023\013\005\025\022\022a\0028fi^|'o[\005\003O\021\022q\"\0228wSJ|g.\\3oi\"{7\017\036\t\003S1j\021A\013\006\003WI\t\001\"\0338uKJt\027\r\\\005\003[)\022Q!Q4f]RD\001b\f\001\003\002\003\006IaH\001\006Q>\034H\017\t\005\006c\001!\tAM\001\007y%t\027\016\036 \025\005M*\004C\001\033\001\033\005\021\001\"B\0171\001\0041$cA\034#Q\031!\021\005\001\0017\021\035I\004A1A\005Bi\nAA\\8eKV\t1\b\005\002$y%\021Q\b\n\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\004@\001\001\006IaO\001\006]>$W\r\t\005\b\003\002\001\r\021\"\001C\003%IgN^3oi>\024\0300F\001D!\r!u)S\007\002\013*\ta)A\003tG\006d\027-\003\002I\013\n1q\n\035;j_:\004\"AS)\016\003-S!\001T'\002\t%$X-\034\006\003\035>\013\021\"\\5oK\016\024\030M\032;\013\003A\0131A\\3u\023\t\0216JA\005Ji\026l7\013^1dW\"9A\013\001a\001\n\003)\026!D5om\026tGo\034:z?\022*\027\017\006\002W3B\021AiV\005\0031\026\023A!\0268ji\"9!lUA\001\002\004\031\025a\001=%c!1A\f\001Q!\n\r\013!\"\0338wK:$xN]=!\021\035q\006\0011A\005\002}\013aB]3nC&t\027N\\4US\016\\7/F\001a!\t!\025-\003\002c\013\n\031\021J\034;\t\017\021\004\001\031!C\001K\006\021\"/Z7bS:Lgn\032+jG.\034x\fJ3r)\t1f\rC\004[G\006\005\t\031\0011\t\r!\004\001\025)\003a\003=\021X-\\1j]&tw\rV5dWN\004\003\002\0036\001\021\013\007IQB6\002\025\021,g/[2f\023:4w.F\001m!\021i'\017\036;\016\0039T!a\0349\002\023%lW.\036;bE2,'BA9F\003)\031w\016\0347fGRLwN\\\005\003g:\0241!T1q!\t)(0D\001w\025\t9\b0\001\003mC:<'\"A=\002\t)\fg/Y\005\003wZ\024aa\025;sS:<\007\002C?\001\021\003\005\013U\0027\002\027\021,g/[2f\023:4w\016\t\005\007\002!\t%!\001\002\033\035,G\017R3wS\016,\027J\0344p)\t\t\031\001\005\005\002\006\005-\021QBA\007\033\t\t9AC\002\002\na\fA!\036;jY&\0311/a\002\021\t\005=\021Q\003\b\004\t\006E\021bAA\n\013\0061\001K]3eK\032L1a_A\f\025\r\t\031\"\022\005\b\0037\001A\021AA\017\003\031Ign]3siR1\021qDA\026\003w\001R\001RA\021\003KI1!a\tF\005\025\t%O]1z!\r!\025qE\005\004\003S)%AB!osJ+g\r\003\005\002.\005e\001\031AA\030\003\035\031wN\034;fqR\004B!!\r\00285\021\0211\007\006\004\003k\021\022aB7bG\"Lg.Z\005\005\003s\t\031DA\004D_:$X\r\037;\t\021\005u\022\021\004a\001\003\tA!\031:hgB!\021\021GA!\023\021\t\031%a\r\003\023\005\023x-^7f]R\034\b\006CA\r\003\017\ni%a\024\021\t\005E\022\021J\005\005\003\027\n\031D\001\005DC2d'-Y2l\003\r!wnY\021\003\003#\n1NZ;oGRLwN\034\025\\G>,h\016\036\036ok6\024WM]/*u\t|w\016\\3b]\002jS\006\t+sS\026\034\b\005^8!S:\034XM\035;!MV,G\016\t4s_6\004C\017[3!g\026dWm\031;fI\002\032Hn\034;!S:$x\016\t;iK\002:WM\\3sCR|'oJ:!cV,W/\032\030\t\017\005U\003\001\"\001\002X\005)1m\\;oiR1\021qDA-\0037B\001\"!\f\002T\001\007\021q\006\005\t\003{\t\031\0061\001\002@!B\0211KA$\003\033\ny&\t\002\002b\005ie-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;!i\",\007e]5{K\002zg\r\t;iK\002JG/Z7!gR\f7m\033\021j]\002\"\b.\032\021hK:,'/\031;pe\036\032\b%];fk\026t\003bBA3\001\021\005\021qM\001\007e\026lwN^3\025\r\005}\021\021NA6\021!\ti#a\031A\002\005=\002\002CA\037\003G\002\r!a\020)\021\005\r\024qIA'\003_\n#!!\035\002+\032,hn\031;j_:D3lY8v]RTd.^7cKJl\026F\0172p_2,\027M\034\021.[\001\"&/[3tAQ|\007E]3n_Z,\007%\033;f[N\004cM]8nAQDW\rI4f]\026\024\030\r^8sOM\004\023/^3vK:B\021\"!\036\001\005\004%\t%a\036\002\023\r\fg.\0269eCR,WCAA=!\r!\0251P\005\004\003{*%a\002\"p_2,\027M\034\005\t\003\003\003\001\025!\003\002z\005Q1-\0318Va\022\fG/\032\021\t\017\005\025\005\001\"\021\002\b\0061Q\017\0353bi\026$\022A\026\005\b\003\027\003A\021BAD\0031)\b\017Z1uK\016c\027.\0328u\021\035\ty\t\001C!\003#\013Ab\0348ESN\034wN\0348fGR$2AVAJ\021\035I\024Q\022a\001\003+\0032aIAL\023\r\tI\n\n\002\005\035>$W\rC\004\002\036\002!\t%a(\002\t1|\027\r\032\013\004-\006\005\006\002CAR\0037\003\r!!*\002\0079\024G\017\005\003\002(\006-VBAAU\025\r\t\031+T\005\005\003[\013IK\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\005E\006\001\"\021\0024\006!1/\031<f)\r1\026Q\027\005\t\003G\013y\0131\001\002&\002")
/*     */ public class UpgradeGenerator extends ManagedEnvironment implements DeviceInfo {
/*     */   public Agent host() {
/*  26 */     return this.host;
/*  27 */   } private final Agent host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  28 */     .withComponent("generator", Visibility.Neighbors)
/*  29 */     .withConnector()
/*  30 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*  32 */   } private Option<ItemStack> inventory = (Option<ItemStack>)None$.MODULE$; public Option<ItemStack> inventory() { return this.inventory; } public void inventory_$eq(Option<ItemStack> x$1) { this.inventory = x$1; }
/*     */   
/*  34 */   private int remainingTicks = 0; private Map<String, String> deviceInfo; public int remainingTicks() { return this.remainingTicks; } public void remainingTicks_$eq(int x$1) { this.remainingTicks = x$1; }
/*     */   
/*  36 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  37 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/*  38 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Generator");
/*  39 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  40 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Portagen 2.0 (Rev. 3)");
/*  41 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), "1"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  44 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function([count:number]):boolean -- Tries to insert fuel from the selected slot into the generator's queue.")
/*     */   public Object[] insert(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: iconst_0
/*     */     //   2: bipush #64
/*     */     //   4: invokeinterface optInteger : (II)I
/*     */     //   9: istore_3
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   14: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   19: aload_0
/*     */     //   20: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   23: invokeinterface selectedSlot : ()I
/*     */     //   28: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   33: astore #4
/*     */     //   35: aload #4
/*     */     //   37: ifnull -> 49
/*     */     //   40: aload #4
/*     */     //   42: getfield field_77994_a : I
/*     */     //   45: iconst_0
/*     */     //   46: if_icmpne -> 77
/*     */     //   49: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   52: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   55: iconst_2
/*     */     //   56: anewarray java/lang/Object
/*     */     //   59: dup
/*     */     //   60: iconst_0
/*     */     //   61: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   64: aastore
/*     */     //   65: dup
/*     */     //   66: iconst_1
/*     */     //   67: ldc 'selected slot is empty'
/*     */     //   69: aastore
/*     */     //   70: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   73: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   76: areturn
/*     */     //   77: aload #4
/*     */     //   79: invokestatic func_145954_b : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   82: ifeq -> 611
/*     */     //   85: aload #4
/*     */     //   87: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   90: aload #4
/*     */     //   92: invokevirtual getContainerItem : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
/*     */     //   95: astore #5
/*     */     //   97: aload_0
/*     */     //   98: invokevirtual inventory : ()Lscala/Option;
/*     */     //   101: astore #7
/*     */     //   103: aload #7
/*     */     //   105: instanceof scala/Some
/*     */     //   108: ifeq -> 197
/*     */     //   111: aload #7
/*     */     //   113: checkcast scala/Some
/*     */     //   116: astore #8
/*     */     //   118: aload #8
/*     */     //   120: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   123: checkcast net/minecraft/item/ItemStack
/*     */     //   126: astore #9
/*     */     //   128: aload #9
/*     */     //   130: ifnull -> 197
/*     */     //   133: aload #9
/*     */     //   135: getfield field_77994_a : I
/*     */     //   138: iconst_0
/*     */     //   139: if_icmple -> 197
/*     */     //   142: aload #9
/*     */     //   144: aload #4
/*     */     //   146: invokevirtual func_77969_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   149: ifeq -> 169
/*     */     //   152: aload #9
/*     */     //   154: aload #4
/*     */     //   156: invokestatic func_77970_a : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   159: ifeq -> 169
/*     */     //   162: aload #9
/*     */     //   164: astore #10
/*     */     //   166: goto -> 200
/*     */     //   169: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   172: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   175: iconst_2
/*     */     //   176: anewarray java/lang/Object
/*     */     //   179: dup
/*     */     //   180: iconst_0
/*     */     //   181: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   184: aastore
/*     */     //   185: dup
/*     */     //   186: iconst_1
/*     */     //   187: ldc 'different fuel type already queued'
/*     */     //   189: aastore
/*     */     //   190: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   193: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   196: areturn
/*     */     //   197: aconst_null
/*     */     //   198: astore #10
/*     */     //   200: aload #10
/*     */     //   202: astore #6
/*     */     //   204: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   207: aload #6
/*     */     //   209: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   212: astore #12
/*     */     //   214: aload #12
/*     */     //   216: instanceof scala/Some
/*     */     //   219: ifeq -> 269
/*     */     //   222: aload #12
/*     */     //   224: checkcast scala/Some
/*     */     //   227: astore #13
/*     */     //   229: aload #13
/*     */     //   231: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   234: checkcast net/minecraft/item/ItemStack
/*     */     //   237: astore #14
/*     */     //   239: aload #14
/*     */     //   241: ifnull -> 269
/*     */     //   244: aload #14
/*     */     //   246: getfield field_77994_a : I
/*     */     //   249: iconst_0
/*     */     //   250: if_icmple -> 269
/*     */     //   253: aload #14
/*     */     //   255: invokevirtual func_77976_d : ()I
/*     */     //   258: aload #14
/*     */     //   260: getfield field_77994_a : I
/*     */     //   263: isub
/*     */     //   264: istore #15
/*     */     //   266: goto -> 276
/*     */     //   269: aload #4
/*     */     //   271: invokevirtual func_77976_d : ()I
/*     */     //   274: istore #15
/*     */     //   276: iload #15
/*     */     //   278: istore #11
/*     */     //   280: iload #11
/*     */     //   282: iconst_0
/*     */     //   283: if_icmpne -> 315
/*     */     //   286: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   289: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   292: iconst_2
/*     */     //   293: anewarray java/lang/Object
/*     */     //   296: dup
/*     */     //   297: iconst_0
/*     */     //   298: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   301: aastore
/*     */     //   302: dup
/*     */     //   303: iconst_1
/*     */     //   304: ldc_w 'queue is full'
/*     */     //   307: aastore
/*     */     //   308: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   311: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   314: areturn
/*     */     //   315: aload #4
/*     */     //   317: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   320: astore #16
/*     */     //   322: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   325: aload #4
/*     */     //   327: getfield field_77994_a : I
/*     */     //   330: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   333: iload #11
/*     */     //   335: iload_3
/*     */     //   336: invokevirtual min : (II)I
/*     */     //   339: invokevirtual min : (II)I
/*     */     //   342: istore #17
/*     */     //   344: aload #4
/*     */     //   346: iload #17
/*     */     //   348: invokevirtual func_77979_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   351: astore #18
/*     */     //   353: aload #4
/*     */     //   355: getfield field_77994_a : I
/*     */     //   358: iconst_0
/*     */     //   359: if_icmpne -> 389
/*     */     //   362: aload_0
/*     */     //   363: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   366: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   371: aload_0
/*     */     //   372: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   375: invokeinterface selectedSlot : ()I
/*     */     //   380: aconst_null
/*     */     //   381: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   386: goto -> 414
/*     */     //   389: aload_0
/*     */     //   390: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   393: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   398: aload_0
/*     */     //   399: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   402: invokeinterface selectedSlot : ()I
/*     */     //   407: aload #4
/*     */     //   409: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   414: aload #5
/*     */     //   416: ifnonnull -> 425
/*     */     //   419: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   422: goto -> 490
/*     */     //   425: aload #5
/*     */     //   427: aload #18
/*     */     //   429: getfield field_77994_a : I
/*     */     //   432: putfield field_77994_a : I
/*     */     //   435: aload_0
/*     */     //   436: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   439: invokeinterface player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   444: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   447: aload #5
/*     */     //   449: invokevirtual func_70441_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   452: ifeq -> 556
/*     */     //   455: aload #5
/*     */     //   457: getfield field_77994_a : I
/*     */     //   460: iconst_0
/*     */     //   461: if_icmple -> 487
/*     */     //   464: aload_0
/*     */     //   465: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   468: invokeinterface player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   473: aload #5
/*     */     //   475: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   478: ldc_w -0.25
/*     */     //   481: invokevirtual func_70099_a : (Lnet/minecraft/item/ItemStack;F)Lnet/minecraft/entity/item/EntityItem;
/*     */     //   484: goto -> 490
/*     */     //   487: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   490: pop
/*     */     //   491: aload #6
/*     */     //   493: ifnull -> 512
/*     */     //   496: aload #18
/*     */     //   498: aload #18
/*     */     //   500: getfield field_77994_a : I
/*     */     //   503: aload #6
/*     */     //   505: getfield field_77994_a : I
/*     */     //   508: iadd
/*     */     //   509: putfield field_77994_a : I
/*     */     //   512: aload_0
/*     */     //   513: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   516: aload #18
/*     */     //   518: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   521: invokevirtual inventory_$eq : (Lscala/Option;)V
/*     */     //   524: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   527: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   530: iconst_2
/*     */     //   531: anewarray java/lang/Object
/*     */     //   534: dup
/*     */     //   535: iconst_0
/*     */     //   536: iconst_1
/*     */     //   537: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   540: aastore
/*     */     //   541: dup
/*     */     //   542: iconst_1
/*     */     //   543: iload #17
/*     */     //   545: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   548: aastore
/*     */     //   549: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   552: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   555: areturn
/*     */     //   556: aload_0
/*     */     //   557: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   560: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   565: aload_0
/*     */     //   566: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   569: invokeinterface selectedSlot : ()I
/*     */     //   574: aload #16
/*     */     //   576: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   581: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   584: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   587: iconst_2
/*     */     //   588: anewarray java/lang/Object
/*     */     //   591: dup
/*     */     //   592: iconst_0
/*     */     //   593: iconst_0
/*     */     //   594: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   597: aastore
/*     */     //   598: dup
/*     */     //   599: iconst_1
/*     */     //   600: ldc_w 'no space in inventory for fuel containers'
/*     */     //   603: aastore
/*     */     //   604: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   607: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   610: areturn
/*     */     //   611: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   614: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   617: iconst_2
/*     */     //   618: anewarray java/lang/Object
/*     */     //   621: dup
/*     */     //   622: iconst_0
/*     */     //   623: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   626: aastore
/*     */     //   627: dup
/*     */     //   628: iconst_1
/*     */     //   629: ldc_w 'selected slot does not contain fuel'
/*     */     //   632: aastore
/*     */     //   633: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   636: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   639: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 0
/*     */     //   #51	-> 10
/*     */     //   #52	-> 35
/*     */     //   #53	-> 77
/*     */     //   #56	-> 85
/*     */     //   #57	-> 97
/*     */     //   #58	-> 103
/*     */     //   #59	-> 142
/*     */     //   #62	-> 162
/*     */     //   #58	-> 164
/*     */     //   #60	-> 169
/*     */     //   #63	-> 197
/*     */     //   #57	-> 200
/*     */     //   #65	-> 204
/*     */     //   #66	-> 214
/*     */     //   #67	-> 269
/*     */     //   #65	-> 276
/*     */     //   #69	-> 280
/*     */     //   #70	-> 286
/*     */     //   #72	-> 315
/*     */     //   #73	-> 322
/*     */     //   #74	-> 344
/*     */     //   #77	-> 353
/*     */     //   #78	-> 362
/*     */     //   #80	-> 389
/*     */     //   #84	-> 414
/*     */     //   #85	-> 425
/*     */     //   #86	-> 435
/*     */     //   #90	-> 455
/*     */     //   #92	-> 464
/*     */     //   #90	-> 487
/*     */     //   #84	-> 490
/*     */     //   #96	-> 491
/*     */     //   #97	-> 496
/*     */     //   #100	-> 512
/*     */     //   #102	-> 524
/*     */     //   #88	-> 556
/*     */     //   #89	-> 581
/*     */     //   #54	-> 611
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	640	0	this	Lli/cil/oc/server/component/UpgradeGenerator;
/*     */     //   0	640	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	640	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   10	545	3	count	I
/*     */     //   35	520	4	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   97	458	5	container	Lnet/minecraft/item/ItemStack;
/*     */     //   128	512	9	q	Lnet/minecraft/item/ItemStack;
/*     */     //   204	351	6	inQueue	Lnet/minecraft/item/ItemStack;
/*     */     //   239	401	14	q	Lnet/minecraft/item/ItemStack;
/*     */     //   280	275	11	space	I
/*     */     //   322	233	16	previousSelectedFuel	Lnet/minecraft/item/ItemStack;
/*     */     //   344	211	17	insertLimit	I
/*     */     //   353	202	18	fuelToInsert	Lnet/minecraft/item/ItemStack;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():number -- Get the size of the item stack in the generator's queue.")
/*     */   public Object[] count(Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/* 107 */     Option<ItemStack> option = inventory();
/* 108 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(stack.field_77994_a), stack.func_77973_b().func_77653_i(stack) })); }
/* 109 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0) })); }
/*     */     
/*     */     return arrayOfObject;
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
/*     */   @Callback(doc = "function([count:number]):boolean -- Tries to remove items from the generator's queue.")
/*     */   public Object[] remove(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: iconst_0
/*     */     //   2: ldc_w 2147483647
/*     */     //   5: invokeinterface optInteger : (II)I
/*     */     //   10: istore_3
/*     */     //   11: iload_3
/*     */     //   12: iconst_0
/*     */     //   13: if_icmpgt -> 40
/*     */     //   16: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   19: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   22: iconst_1
/*     */     //   23: anewarray java/lang/Object
/*     */     //   26: dup
/*     */     //   27: iconst_0
/*     */     //   28: iconst_1
/*     */     //   29: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   32: aastore
/*     */     //   33: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   36: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   39: areturn
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual inventory : ()Lscala/Option;
/*     */     //   44: astore #5
/*     */     //   46: aload #5
/*     */     //   48: instanceof scala/Some
/*     */     //   51: ifeq -> 92
/*     */     //   54: aload #5
/*     */     //   56: checkcast scala/Some
/*     */     //   59: astore #6
/*     */     //   61: aload #6
/*     */     //   63: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   66: checkcast net/minecraft/item/ItemStack
/*     */     //   69: astore #7
/*     */     //   71: aload #7
/*     */     //   73: ifnull -> 92
/*     */     //   76: aload #7
/*     */     //   78: getfield field_77994_a : I
/*     */     //   81: iconst_0
/*     */     //   82: if_icmple -> 92
/*     */     //   85: aload #7
/*     */     //   87: astore #8
/*     */     //   89: goto -> 95
/*     */     //   92: aconst_null
/*     */     //   93: astore #8
/*     */     //   95: aload #8
/*     */     //   97: astore #4
/*     */     //   99: aload #4
/*     */     //   101: ifnonnull -> 134
/*     */     //   104: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   107: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   110: iconst_2
/*     */     //   111: anewarray java/lang/Object
/*     */     //   114: dup
/*     */     //   115: iconst_0
/*     */     //   116: iconst_0
/*     */     //   117: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   120: aastore
/*     */     //   121: dup
/*     */     //   122: iconst_1
/*     */     //   123: ldc_w 'queue is empty'
/*     */     //   126: aastore
/*     */     //   127: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   130: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   133: areturn
/*     */     //   134: aload_0
/*     */     //   135: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   138: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   143: aload_0
/*     */     //   144: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   147: invokeinterface selectedSlot : ()I
/*     */     //   152: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   157: astore #10
/*     */     //   159: aload #10
/*     */     //   161: ifnull -> 183
/*     */     //   164: aload #10
/*     */     //   166: astore #11
/*     */     //   168: aload #11
/*     */     //   170: ifnull -> 183
/*     */     //   173: aload #11
/*     */     //   175: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   178: astore #12
/*     */     //   180: goto -> 186
/*     */     //   183: aconst_null
/*     */     //   184: astore #12
/*     */     //   186: aload #12
/*     */     //   188: astore #9
/*     */     //   190: aload #4
/*     */     //   192: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   195: aload #4
/*     */     //   197: invokevirtual getContainerItem : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
/*     */     //   200: astore #14
/*     */     //   202: aload #14
/*     */     //   204: ifnull -> 336
/*     */     //   207: aload #14
/*     */     //   209: getfield field_77994_a : I
/*     */     //   212: iconst_0
/*     */     //   213: if_icmple -> 336
/*     */     //   216: aload #9
/*     */     //   218: astore #16
/*     */     //   220: aload #16
/*     */     //   222: ifnull -> 306
/*     */     //   225: aload #16
/*     */     //   227: astore #17
/*     */     //   229: aload #17
/*     */     //   231: ifnull -> 306
/*     */     //   234: aload #17
/*     */     //   236: getfield field_77994_a : I
/*     */     //   239: iconst_0
/*     */     //   240: if_icmple -> 306
/*     */     //   243: aload #17
/*     */     //   245: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   248: aload #14
/*     */     //   250: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   253: astore #18
/*     */     //   255: dup
/*     */     //   256: ifnonnull -> 268
/*     */     //   259: pop
/*     */     //   260: aload #18
/*     */     //   262: ifnull -> 276
/*     */     //   265: goto -> 306
/*     */     //   268: aload #18
/*     */     //   270: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   273: ifeq -> 306
/*     */     //   276: aload #17
/*     */     //   278: aload #14
/*     */     //   280: invokestatic func_77970_a : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   283: ifeq -> 306
/*     */     //   286: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   289: aload #17
/*     */     //   291: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   294: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   297: astore #19
/*     */     //   299: aload #19
/*     */     //   301: astore #15
/*     */     //   303: goto -> 341
/*     */     //   306: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   309: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   312: iconst_2
/*     */     //   313: anewarray java/lang/Object
/*     */     //   316: dup
/*     */     //   317: iconst_0
/*     */     //   318: iconst_0
/*     */     //   319: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   322: aastore
/*     */     //   323: dup
/*     */     //   324: iconst_1
/*     */     //   325: ldc_w 'removing this fuel requires the appropriate container in the selected slot'
/*     */     //   328: aastore
/*     */     //   329: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   332: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   335: areturn
/*     */     //   336: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   339: astore #15
/*     */     //   341: aload #15
/*     */     //   343: astore #13
/*     */     //   345: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   348: aload #4
/*     */     //   350: getfield field_77994_a : I
/*     */     //   353: aload #13
/*     */     //   355: astore #21
/*     */     //   357: aload #21
/*     */     //   359: instanceof scala/Some
/*     */     //   362: ifeq -> 392
/*     */     //   365: aload #21
/*     */     //   367: checkcast scala/Some
/*     */     //   370: astore #22
/*     */     //   372: aload #22
/*     */     //   374: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   377: checkcast net/minecraft/item/ItemStack
/*     */     //   380: astore #23
/*     */     //   382: aload #23
/*     */     //   384: getfield field_77994_a : I
/*     */     //   387: istore #24
/*     */     //   389: goto -> 395
/*     */     //   392: iload_3
/*     */     //   393: istore #24
/*     */     //   395: iload #24
/*     */     //   397: invokevirtual min : (II)I
/*     */     //   400: istore #20
/*     */     //   402: aload #4
/*     */     //   404: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   407: astore #25
/*     */     //   409: aload #4
/*     */     //   411: iload #20
/*     */     //   413: invokevirtual func_77979_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   416: astore #26
/*     */     //   418: aload #13
/*     */     //   420: astore #27
/*     */     //   422: aload #27
/*     */     //   424: instanceof scala/Some
/*     */     //   427: ifeq -> 524
/*     */     //   430: aload #27
/*     */     //   432: checkcast scala/Some
/*     */     //   435: astore #28
/*     */     //   437: aload #28
/*     */     //   439: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   442: checkcast net/minecraft/item/ItemStack
/*     */     //   445: astore #29
/*     */     //   447: aload #29
/*     */     //   449: iload #20
/*     */     //   451: invokevirtual func_77979_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   454: pop
/*     */     //   455: aload #29
/*     */     //   457: getfield field_77994_a : I
/*     */     //   460: iconst_0
/*     */     //   461: if_icmpne -> 494
/*     */     //   464: aload_0
/*     */     //   465: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   468: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   473: aload_0
/*     */     //   474: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   477: invokeinterface selectedSlot : ()I
/*     */     //   482: aconst_null
/*     */     //   483: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   488: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   491: goto -> 519
/*     */     //   494: aload_0
/*     */     //   495: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   498: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   503: aload_0
/*     */     //   504: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   507: invokeinterface selectedSlot : ()I
/*     */     //   512: iload #20
/*     */     //   514: invokeinterface func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*     */     //   519: astore #30
/*     */     //   521: goto -> 529
/*     */     //   524: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   527: astore #30
/*     */     //   529: aload #30
/*     */     //   531: pop
/*     */     //   532: aload_0
/*     */     //   533: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   536: invokeinterface player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   541: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   544: aload #26
/*     */     //   546: invokevirtual func_70441_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   549: ifeq -> 635
/*     */     //   552: aload #25
/*     */     //   554: aload #4
/*     */     //   556: getfield field_77994_a : I
/*     */     //   559: aload #26
/*     */     //   561: getfield field_77994_a : I
/*     */     //   564: iadd
/*     */     //   565: putfield field_77994_a : I
/*     */     //   568: aload_0
/*     */     //   569: aload #25
/*     */     //   571: getfield field_77994_a : I
/*     */     //   574: iconst_0
/*     */     //   575: if_icmpne -> 584
/*     */     //   578: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   581: goto -> 592
/*     */     //   584: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   587: aload #25
/*     */     //   589: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   592: invokevirtual inventory_$eq : (Lscala/Option;)V
/*     */     //   595: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   598: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   601: iconst_2
/*     */     //   602: anewarray java/lang/Object
/*     */     //   605: dup
/*     */     //   606: iconst_0
/*     */     //   607: iconst_1
/*     */     //   608: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   611: aastore
/*     */     //   612: dup
/*     */     //   613: iconst_1
/*     */     //   614: iload #20
/*     */     //   616: aload #26
/*     */     //   618: getfield field_77994_a : I
/*     */     //   621: isub
/*     */     //   622: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   625: aastore
/*     */     //   626: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   629: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   632: goto -> 701
/*     */     //   635: aload_0
/*     */     //   636: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   639: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   644: aload_0
/*     */     //   645: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   648: invokeinterface selectedSlot : ()I
/*     */     //   653: aload #9
/*     */     //   655: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   660: aload_0
/*     */     //   661: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   664: aload #25
/*     */     //   666: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   669: invokevirtual inventory_$eq : (Lscala/Option;)V
/*     */     //   672: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   675: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   678: iconst_2
/*     */     //   679: anewarray java/lang/Object
/*     */     //   682: dup
/*     */     //   683: iconst_0
/*     */     //   684: iconst_0
/*     */     //   685: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   688: aastore
/*     */     //   689: dup
/*     */     //   690: iconst_1
/*     */     //   691: ldc_w 'no inventory space available for fuel'
/*     */     //   694: aastore
/*     */     //   695: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   698: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   701: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 0
/*     */     //   #116	-> 11
/*     */     //   #117	-> 16
/*     */     //   #119	-> 40
/*     */     //   #120	-> 46
/*     */     //   #121	-> 92
/*     */     //   #119	-> 95
/*     */     //   #123	-> 99
/*     */     //   #124	-> 104
/*     */     //   #126	-> 134
/*     */     //   #127	-> 159
/*     */     //   #128	-> 183
/*     */     //   #126	-> 186
/*     */     //   #130	-> 190
/*     */     //   #131	-> 202
/*     */     //   #132	-> 220
/*     */     //   #133	-> 229
/*     */     //   #134	-> 234
/*     */     //   #135	-> 243
/*     */     //   #136	-> 276
/*     */     //   #131	-> 299
/*     */     //   #137	-> 306
/*     */     //   #139	-> 336
/*     */     //   #130	-> 341
/*     */     //   #142	-> 345
/*     */     //   #143	-> 357
/*     */     //   #144	-> 392
/*     */     //   #142	-> 395
/*     */     //   #148	-> 402
/*     */     //   #149	-> 409
/*     */     //   #150	-> 418
/*     */     //   #151	-> 422
/*     */     //   #152	-> 447
/*     */     //   #153	-> 455
/*     */     //   #154	-> 464
/*     */     //   #156	-> 494
/*     */     //   #151	-> 519
/*     */     //   #158	-> 524
/*     */     //   #150	-> 529
/*     */     //   #161	-> 532
/*     */     //   #167	-> 552
/*     */     //   #168	-> 568
/*     */     //   #169	-> 595
/*     */     //   #163	-> 635
/*     */     //   #164	-> 660
/*     */     //   #165	-> 672
/*     */     //   #114	-> 701
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	702	0	this	Lli/cil/oc/server/component/UpgradeGenerator;
/*     */     //   0	702	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	702	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   11	691	3	count	I
/*     */     //   71	631	7	q	Lnet/minecraft/item/ItemStack;
/*     */     //   99	603	4	inQueue	Lnet/minecraft/item/ItemStack;
/*     */     //   190	512	9	previousSelectedItem	Lnet/minecraft/item/ItemStack;
/*     */     //   345	357	13	selectedEmptyContainer	Lscala/Option;
/*     */     //   382	320	23	emptyContainer	Lnet/minecraft/item/ItemStack;
/*     */     //   402	300	20	removeLimit	I
/*     */     //   409	293	25	previousQueue	Lnet/minecraft/item/ItemStack;
/*     */     //   418	284	26	forUser	Lnet/minecraft/item/ItemStack;
/*     */     //   447	255	29	emptyContainer	Lnet/minecraft/item/ItemStack;
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
/*     */   private final boolean canUpdate = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private volatile boolean bitmap$0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 175 */     return this.canUpdate;
/*     */   }
/*     */   public void update() {
/* 178 */     super.update();
/* 179 */     if (remainingTicks() <= 0 && inventory().isDefined()) {
/* 180 */       ItemStack stack = (ItemStack)inventory().get();
/* 181 */       remainingTicks_$eq(TileEntityFurnace.func_145952_a(stack));
/* 182 */       if (remainingTicks() > 0) {
/* 183 */         updateClient();
/* 184 */         stack.field_77994_a--;
/* 185 */         if (stack.field_77994_a <= 0)
/*     */         {
/* 187 */           inventory_$eq((Option<ItemStack>)None$.MODULE$);
/*     */         }
/*     */       } 
/*     */     } 
/* 191 */     if (remainingTicks() > 0) {
/* 192 */       remainingTicks_$eq(remainingTicks() - 1);
/* 193 */       if (remainingTicks() == 0 && inventory().isEmpty()) {
/* 194 */         updateClient();
/*     */       }
/* 196 */       node().changeBuffer(Settings$.MODULE$.get().generatorEfficiency());
/*     */     } 
/*     */   }
/*     */   private void updateClient() {
/* 200 */     Agent agent = host();
/* 201 */     if (agent instanceof Robot) { Robot robot = (Robot)agent; robot.synchronizeSlot(robot.componentSlot(node().address())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 202 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   5: aload_1
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   10: astore_2
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 23
/*     */     //   15: pop
/*     */     //   16: aload_2
/*     */     //   17: ifnull -> 30
/*     */     //   20: goto -> 159
/*     */     //   23: aload_2
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifeq -> 159
/*     */     //   30: aload_0
/*     */     //   31: invokevirtual inventory : ()Lscala/Option;
/*     */     //   34: astore_3
/*     */     //   35: aload_3
/*     */     //   36: instanceof scala/Some
/*     */     //   39: ifeq -> 149
/*     */     //   42: aload_3
/*     */     //   43: checkcast scala/Some
/*     */     //   46: astore #4
/*     */     //   48: aload #4
/*     */     //   50: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   53: checkcast net/minecraft/item/ItemStack
/*     */     //   56: astore #5
/*     */     //   58: aload_0
/*     */     //   59: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   62: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   67: astore #7
/*     */     //   69: new net/minecraft/entity/item/EntityItem
/*     */     //   72: dup
/*     */     //   73: aload #7
/*     */     //   75: aload_0
/*     */     //   76: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   79: invokeinterface xPosition : ()D
/*     */     //   84: aload_0
/*     */     //   85: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   88: invokeinterface yPosition : ()D
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   97: invokeinterface zPosition : ()D
/*     */     //   102: aload #5
/*     */     //   104: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   107: invokespecial <init> : (Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V
/*     */     //   110: astore #8
/*     */     //   112: aload #8
/*     */     //   114: ldc2_w 0.04
/*     */     //   117: putfield field_70181_x : D
/*     */     //   120: aload #8
/*     */     //   122: iconst_5
/*     */     //   123: putfield field_145804_b : I
/*     */     //   126: aload #7
/*     */     //   128: aload #8
/*     */     //   130: invokevirtual func_72838_d : (Lnet/minecraft/entity/Entity;)Z
/*     */     //   133: pop
/*     */     //   134: aload_0
/*     */     //   135: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   138: invokevirtual inventory_$eq : (Lscala/Option;)V
/*     */     //   141: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   144: astore #6
/*     */     //   146: goto -> 154
/*     */     //   149: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   152: astore #6
/*     */     //   154: aload_0
/*     */     //   155: iconst_0
/*     */     //   156: invokevirtual remainingTicks_$eq : (I)V
/*     */     //   159: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #208	-> 0
/*     */     //   #209	-> 5
/*     */     //   #210	-> 30
/*     */     //   #211	-> 35
/*     */     //   #212	-> 58
/*     */     //   #213	-> 69
/*     */     //   #214	-> 112
/*     */     //   #215	-> 120
/*     */     //   #216	-> 126
/*     */     //   #217	-> 134
/*     */     //   #211	-> 144
/*     */     //   #218	-> 149
/*     */     //   #220	-> 154
/*     */     //   #207	-> 159
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	160	0	this	Lli/cil/oc/server/component/UpgradeGenerator;
/*     */     //   0	160	1	node	Lli/cil/oc/api/network/Node;
/*     */     //   58	102	5	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   69	75	7	world	Lnet/minecraft/world/World;
/*     */     //   112	32	8	entity	Lnet/minecraft/entity/item/EntityItem;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 225 */     super.load(nbt);
/* 226 */     if (nbt.func_74764_b("inventory")) {
/* 227 */       inventory_$eq(Option$.MODULE$.apply(ItemStack.func_77949_a(nbt.func_74775_l("inventory"))));
/*     */     }
/* 229 */     remainingTicks_$eq(nbt.func_74762_e("remainingTicks"));
/*     */   }
/*     */   public void save(NBTTagCompound nbt) {
/*     */     BoxedUnit boxedUnit;
/* 233 */     super.save(nbt);
/* 234 */     Option<ItemStack> option = inventory();
/* 235 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); NBTTagCompound nBTTagCompound = ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("inventory", (Function1)new UpgradeGenerator$$anonfun$save$1(this, stack)); }
/* 236 */     else { boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 238 */     if (remainingTicks() > 0)
/* 239 */       nbt.func_74768_a("remainingTicks", remainingTicks()); 
/*     */   }
/*     */   
/*     */   public UpgradeGenerator(Agent host) {}
/*     */   
/*     */   public final class UpgradeGenerator$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$1;
/*     */     
/*     */     public final NBTTagCompound apply(NBTTagCompound x$1) {
/*     */       return this.stack$1.func_77955_b(x$1);
/*     */     }
/*     */     
/*     */     public UpgradeGenerator$$anonfun$save$1(UpgradeGenerator $outer, ItemStack stack$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */