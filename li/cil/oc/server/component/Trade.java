/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import net.minecraft.entity.IMerchant;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.village.MerchantRecipe;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0055d\001B\001\003\0015\021Q\001\026:bI\026T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\025\033\005\001\"BA\t\023\003\031\001(/\0324bE*\0211CB\001\004CBL\027BA\013\021\0055\t%m\035;sC\016$h+\0317vK\"Aq\003\001BC\002\023\005\001$\001\003j]\032|W#A\r\021\005iYR\"\001\002\n\005q\021!!\003+sC\022,\027J\0344p\021!q\002A!A!\002\023I\022!B5oM>\004\003\"\002\021\001\t\003\t\023A\002\037j]&$h\b\006\002#GA\021!\004\001\005\006/}\001\r!\007\005\006A\001!\t!\n\013\002E!)\001\005\001C\001OQ)!\005K\027:\003\")\021F\na\001U\0059Q\017]4sC\022,\007C\001\016,\023\ta#A\001\bVa\036\024\030\rZ3Ue\006$\027N\\4\t\01392\003\031A\030\002\0215,'o\0315b]R\004\"\001M\034\016\003ER!AM\032\002\r\025tG/\033;z\025\t!T'A\005nS:,7M]1gi*\ta'A\002oKRL!\001O\031\003\023%kUM]2iC:$\b\"\002\036'\001\004Y\024\001\003:fG&\004X-\023#\021\005qzT\"A\037\013\003y\nQa]2bY\006L!\001Q\037\003\007%sG\017C\003CM\001\0071(\001\006nKJ\034\007.\0318u\023\022CQ\001\022\001\005\002\025\013\001\"\\1y%\006tw-Z\013\002\rB\021AhR\005\003\021v\022a\001R8vE2,\007\"\002&\001\t\003Y\025!C5t\023:\024\026M\\4f+\005a\005C\001\037N\023\tqUHA\004C_>dW-\0318\t\013A\003A\021I)\002\t1|\027\r\032\013\003%V\003\"\001P*\n\005Qk$\001B+oSRDQAV(A\002]\0131A\0342u!\tA&,D\001Z\025\t16'\003\002\\3\nqaJ\021+UC\036\034u.\0349pk:$\007\"B/\001\t\003r\026\001B:bm\026$\"AU0\t\013Yc\006\031A,\t\013\005\004A\021\0012\002\033\035,G/T3sG\"\fg\016^%e)\r\031\027.\035\t\004y\0214\027BA3>\005\025\t%O]1z!\tat-\003\002i{\t1\021I\\=SK\032DQA\0331A\002-\fqaY8oi\026DH\017\005\002m_6\tQN\003\002o%\0059Q.Y2iS:,\027B\0019n\005\035\031uN\034;fqRDQA\0351A\002M\f\021\"\031:hk6,g\016^:\021\0051$\030BA;n\005%\t%oZ;nK:$8\017\013\003aoj\\\bC\0017y\023\tIXN\001\005DC2d'-Y2l\003\r!wnY\021\002y\006\021f-\0368di&|g\016K\025;]Vl'-\032:![5\002#+\032;ve:\034\b%\031\021t_J$\b%\0338eKb\004sN\032\021uQ\026\004S.\032:dQ\006tG\017\t;iCR\004\003O]8wS\022,7\017\t;iSN\004CO]1eK\")a\020\001C\001\006Aq-\032;J]B,H\017F\003d\003\003\t\031\001C\003k{\002\0071\016C\003s{\002\0071\017K\003~oj\f9!\t\002\002\n\005ye-\0368di&|g\016K\025;i\006\024G.\032\027!i\006\024G.\032\021.[\001\022V\r^;s]N\004C\017[3!SR,Wn\035\021uQ\026\004S.\032:dQ\006tG\017I<b]R\034\bEZ8sAQD\027n\035\021ue\006$WM\f\005\b\003\033\001A\021AA\b\003%9W\r^(viB,H\017F\003d\003#\t\031\002\003\004k\003\027\001\ra\033\005\007e\006-\001\031A:)\r\005-qO_A\fC\t\tI\"\001%gk:\034G/[8oQ%RD/\0312mK\002jS\006\t*fiV\024hn\035\021uQ\026\004\023\016^3nAQDW\rI7fe\016D\027M\034;!_\0324WM]:!M>\024\b\005\0365jg\002\"(/\0313f]!9\021Q\004\001\005\002\005}\021!C5t\013:\f'\r\\3e)\025\031\027\021EA\022\021\031Q\0271\004a\001W\"1!/a\007A\002MDc!a\007xu\006\035\022EAA\025\003E3WO\\2uS>t\007&\013\036c_>dW-\0318![5\002#+\032;ve:\034\be\0365fi\",'\017\t;iK\002jWM]2iC:$\beY;se\026tG\017\\=!o\006tGo\035\021u_\002\"(/\0313fAQD\027n\035\030\t\017\0055\002\001\"\001\0020\005)AO]1eKR)1-!\r\0024!1!.a\013A\002-DaA]A\026\001\004\031\bFBA\026oj\f9$\t\002\002:\0059f-\0368di&|g\016K\025;E>|G.Z1oY\001\032HO]5oO\002jS\006\t*fiV\024hn\035\021ueV,\007e\0365f]\002\"(/\0313fAM,8mY3fIN\004\023M\0343!]&dG\006I3se>\024\be\0365f]\002rw\016\036\030\t\017\005u\002\001\"\001\002@\005\001\002.Y:S_>lgi\034:SK\016L\007/\032\013\006\031\006\005\023q\n\005\t\003\007\nY\0041\001\002F\005I\021N\034<f]R|'/\037\t\005\003\017\nY%\004\002\002J)\031\0211I\032\n\t\0055\023\021\n\002\013\023&sg/\0328u_JL\b\002CA)\003w\001\r!a\025\002\rI,7-\0339f!\021\t)&a\027\016\005\005]#bAA-g\0059a/\0337mC\036,\027\002BA/\003/\022a\"T3sG\"\fg\016\036*fG&\004X\rC\004\002b\001!\t!a\031\002\033\r|W\016\0357fi\026$&/\0313f)\035a\025QMA4\003SB\001\"a\021\002`\001\007\021Q\t\005\t\003#\ny\0061\001\002T!9\0211NA0\001\004a\025!B3yC\016$\b")
/*     */ public class Trade extends AbstractValue {
/*  24 */   public TradeInfo info() { return this.info; } private final TradeInfo info; public Trade(TradeInfo info) {} public Trade() {
/*  25 */     this(new TradeInfo());
/*     */   }
/*     */   public Trade(UpgradeTrading upgrade, IMerchant merchant, int recipeID, int merchantID) {
/*  28 */     this(new TradeInfo(upgrade.host(), merchant, recipeID, merchantID));
/*     */   } public double maxRange() {
/*  30 */     return Settings$.MODULE$.get().tradingRange();
/*     */   }
/*  32 */   public boolean isInRange() { Tuple2 tuple2 = new Tuple2(info().merchant().get(), info().host()); if (tuple2 != null) {
/*  33 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; IMerchant merchant = (IMerchant)some.x(); if (merchant instanceof Entity) { Entity entity = (Entity)merchant; if (option2 instanceof Some) { Some some1 = (Some)option2; EnvironmentHost host = (EnvironmentHost)some1.x(); return (entity.func_70092_e(host.xPosition(), host.yPosition(), host.zPosition()) < maxRange() * maxRange()); }
/*     */            }
/*     */          }
/*     */     
/*     */     } 
/*     */     return false; }
/*  39 */   public void load(NBTTagCompound nbt) { EventHandler$.MODULE$.scheduleServer((Function0)new Trade$$anonfun$load$1(this, nbt)); } public final class Trade$$anonfun$load$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { this.$outer.info().load(this.nbt$1); }
/*     */      public Trade$$anonfun$load$1(Trade $outer, NBTTagCompound nbt$1) {} } public void save(NBTTagCompound nbt) {
/*  41 */     info().save(nbt);
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():number -- Returns a sort index of the merchant that provides this trade")
/*  45 */   public Object[] getMerchantId(Context context, Arguments arguments) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(info().merchantID()) })); } public final class Trade$$anonfun$getInput$1 extends AbstractFunction1<MerchantRecipe, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack apply(MerchantRecipe x$1) { return x$1.func_77394_a().func_77946_l(); }
/*     */     public Trade$$anonfun$getInput$1(Trade $outer) {} }
/*     */   @Callback(doc = "function():table, table -- Returns the items the merchant wants for this trade.")
/*  49 */   public Object[] getInput(Context context, Arguments arguments) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { info().recipe().map((Function1)new Trade$$anonfun$getInput$1(this)).orNull(Predef$.MODULE$.$conforms()), 
/*  50 */             info().recipe().exists((Function1)new Trade$$anonfun$getInput$2(this)) ? info().recipe().map((Function1)new Trade$$anonfun$getInput$3(this)).orNull(Predef$.MODULE$.$conforms()) : null })); } public final class Trade$$anonfun$getInput$2 extends AbstractFunction1<MerchantRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(MerchantRecipe x$2) { return x$2.func_77398_c(); } public Trade$$anonfun$getInput$2(Trade $outer) {} } public final class Trade$$anonfun$getInput$3 extends AbstractFunction1<MerchantRecipe, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(MerchantRecipe x$3) { return x$3.func_77396_b().func_77946_l(); }
/*     */     
/*     */     public Trade$$anonfun$getInput$3(Trade $outer) {} }
/*     */   @Callback(doc = "function():table -- Returns the item the merchant offers for this trade.")
/*  54 */   public Object[] getOutput(Context context, Arguments arguments) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { info().recipe().map((Function1)new Trade$$anonfun$getOutput$1(this)).orNull(Predef$.MODULE$.$conforms()) })); } public final class Trade$$anonfun$getOutput$1 extends AbstractFunction1<MerchantRecipe, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(MerchantRecipe x$4) { return x$4.func_77397_d().func_77946_l(); }
/*     */     
/*     */     public Trade$$anonfun$getOutput$1(Trade $outer) {} }
/*     */   @Callback(doc = "function():boolean -- Returns whether the merchant currently wants to trade this.")
/*  58 */   public Object[] isEnabled(Context context, Arguments arguments) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(info().merchant().get().exists((Function1)new Trade$$anonfun$isEnabled$1(this))) })); } public final class Trade$$anonfun$isEnabled$1 extends AbstractFunction1<IMerchant, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IMerchant merchant) { return !this.$outer.info().recipe().exists((Function1)new Trade$$anonfun$isEnabled$1$$anonfun$apply$1(this)); } public Trade$$anonfun$isEnabled$1(Trade $outer) {} public final class Trade$$anonfun$isEnabled$1$$anonfun$apply$1 extends AbstractFunction1<MerchantRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(MerchantRecipe x$5) { return x$5.func_82784_g(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Trade$$anonfun$isEnabled$1$$anonfun$apply$1(Trade$$anonfun$isEnabled$1 $outer) {} }
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
/*     */   @Callback(doc = "function():boolean, string -- Returns true when trade succeeds and nil, error when not.")
/*     */   public Object[] trade(Context context, Arguments arguments) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual info : ()Lli/cil/oc/server/component/TradeInfo;
/*     */     //   4: invokevirtual inventory : ()Lscala/Option;
/*     */     //   7: astore_3
/*     */     //   8: aload_3
/*     */     //   9: instanceof scala/Some
/*     */     //   12: ifeq -> 447
/*     */     //   15: aload_3
/*     */     //   16: checkcast scala/Some
/*     */     //   19: astore #4
/*     */     //   21: aload #4
/*     */     //   23: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   26: checkcast net/minecraft/inventory/IInventory
/*     */     //   29: astore #5
/*     */     //   31: aload_0
/*     */     //   32: invokevirtual info : ()Lli/cil/oc/server/component/TradeInfo;
/*     */     //   35: invokevirtual merchant : ()Lscala/ref/WeakReference;
/*     */     //   38: invokevirtual get : ()Lscala/Option;
/*     */     //   41: astore #7
/*     */     //   43: aload #7
/*     */     //   45: instanceof scala/Some
/*     */     //   48: ifeq -> 410
/*     */     //   51: aload #7
/*     */     //   53: checkcast scala/Some
/*     */     //   56: astore #8
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   63: checkcast net/minecraft/entity/IMerchant
/*     */     //   66: astore #9
/*     */     //   68: aload #9
/*     */     //   70: instanceof net/minecraft/entity/Entity
/*     */     //   73: ifeq -> 410
/*     */     //   76: aload #9
/*     */     //   78: checkcast net/minecraft/entity/Entity
/*     */     //   81: astore #10
/*     */     //   83: aload #10
/*     */     //   85: invokevirtual func_70089_S : ()Z
/*     */     //   88: ifeq -> 410
/*     */     //   91: aload_0
/*     */     //   92: invokevirtual isInRange : ()Z
/*     */     //   95: ifeq -> 410
/*     */     //   98: aload #10
/*     */     //   100: invokevirtual func_70089_S : ()Z
/*     */     //   103: ifeq -> 377
/*     */     //   106: aload_0
/*     */     //   107: invokevirtual isInRange : ()Z
/*     */     //   110: ifeq -> 346
/*     */     //   113: aload_0
/*     */     //   114: invokevirtual info : ()Lli/cil/oc/server/component/TradeInfo;
/*     */     //   117: invokevirtual recipe : ()Lscala/Option;
/*     */     //   120: astore #12
/*     */     //   122: aload #12
/*     */     //   124: instanceof scala/Some
/*     */     //   127: ifeq -> 311
/*     */     //   130: aload #12
/*     */     //   132: checkcast scala/Some
/*     */     //   135: astore #13
/*     */     //   137: aload #13
/*     */     //   139: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   142: checkcast net/minecraft/village/MerchantRecipe
/*     */     //   145: astore #14
/*     */     //   147: aload #14
/*     */     //   149: invokevirtual func_82784_g : ()Z
/*     */     //   152: ifeq -> 186
/*     */     //   155: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   158: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   161: iconst_2
/*     */     //   162: anewarray java/lang/Object
/*     */     //   165: dup
/*     */     //   166: iconst_0
/*     */     //   167: iconst_0
/*     */     //   168: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   171: aastore
/*     */     //   172: dup
/*     */     //   173: iconst_1
/*     */     //   174: ldc 'trade is disabled'
/*     */     //   176: aastore
/*     */     //   177: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   180: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   183: goto -> 306
/*     */     //   186: aload_0
/*     */     //   187: aload #5
/*     */     //   189: aload #14
/*     */     //   191: invokevirtual hasRoomForRecipe : (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/village/MerchantRecipe;)Z
/*     */     //   194: ifeq -> 278
/*     */     //   197: aload_0
/*     */     //   198: aload #5
/*     */     //   200: aload #14
/*     */     //   202: iconst_1
/*     */     //   203: invokevirtual completeTrade : (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/village/MerchantRecipe;Z)Z
/*     */     //   206: ifne -> 221
/*     */     //   209: aload_0
/*     */     //   210: aload #5
/*     */     //   212: aload #14
/*     */     //   214: iconst_0
/*     */     //   215: invokevirtual completeTrade : (Lnet/minecraft/inventory/IInventory;Lnet/minecraft/village/MerchantRecipe;Z)Z
/*     */     //   218: ifeq -> 247
/*     */     //   221: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   224: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   227: iconst_1
/*     */     //   228: anewarray java/lang/Object
/*     */     //   231: dup
/*     */     //   232: iconst_0
/*     */     //   233: iconst_1
/*     */     //   234: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   237: aastore
/*     */     //   238: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   241: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   244: goto -> 306
/*     */     //   247: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   250: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   253: iconst_2
/*     */     //   254: anewarray java/lang/Object
/*     */     //   257: dup
/*     */     //   258: iconst_0
/*     */     //   259: iconst_0
/*     */     //   260: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   263: aastore
/*     */     //   264: dup
/*     */     //   265: iconst_1
/*     */     //   266: ldc 'not enough items to trade'
/*     */     //   268: aastore
/*     */     //   269: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   272: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   275: goto -> 306
/*     */     //   278: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   281: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   284: iconst_2
/*     */     //   285: anewarray java/lang/Object
/*     */     //   288: dup
/*     */     //   289: iconst_0
/*     */     //   290: iconst_0
/*     */     //   291: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   294: aastore
/*     */     //   295: dup
/*     */     //   296: iconst_1
/*     */     //   297: ldc 'not enough inventory space to trade'
/*     */     //   299: aastore
/*     */     //   300: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   303: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   306: astore #15
/*     */     //   308: goto -> 341
/*     */     //   311: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   314: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   317: iconst_2
/*     */     //   318: anewarray java/lang/Object
/*     */     //   321: dup
/*     */     //   322: iconst_0
/*     */     //   323: iconst_0
/*     */     //   324: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   327: aastore
/*     */     //   328: dup
/*     */     //   329: iconst_1
/*     */     //   330: ldc 'trade has become invalid'
/*     */     //   332: aastore
/*     */     //   333: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   336: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   339: astore #15
/*     */     //   341: aload #15
/*     */     //   343: goto -> 405
/*     */     //   346: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   349: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   352: iconst_2
/*     */     //   353: anewarray java/lang/Object
/*     */     //   356: dup
/*     */     //   357: iconst_0
/*     */     //   358: iconst_0
/*     */     //   359: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   362: aastore
/*     */     //   363: dup
/*     */     //   364: iconst_1
/*     */     //   365: ldc 'out of range'
/*     */     //   367: aastore
/*     */     //   368: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   371: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   374: goto -> 405
/*     */     //   377: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   380: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   383: iconst_2
/*     */     //   384: anewarray java/lang/Object
/*     */     //   387: dup
/*     */     //   388: iconst_0
/*     */     //   389: iconst_0
/*     */     //   390: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   393: aastore
/*     */     //   394: dup
/*     */     //   395: iconst_1
/*     */     //   396: ldc 'trader died'
/*     */     //   398: aastore
/*     */     //   399: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   402: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   405: astore #11
/*     */     //   407: goto -> 440
/*     */     //   410: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   413: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   416: iconst_2
/*     */     //   417: anewarray java/lang/Object
/*     */     //   420: dup
/*     */     //   421: iconst_0
/*     */     //   422: iconst_0
/*     */     //   423: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   426: aastore
/*     */     //   427: dup
/*     */     //   428: iconst_1
/*     */     //   429: ldc 'trade has become invalid'
/*     */     //   431: aastore
/*     */     //   432: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   435: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   438: astore #11
/*     */     //   440: aload #11
/*     */     //   442: astore #6
/*     */     //   444: goto -> 477
/*     */     //   447: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   450: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   453: iconst_2
/*     */     //   454: anewarray java/lang/Object
/*     */     //   457: dup
/*     */     //   458: iconst_0
/*     */     //   459: iconst_0
/*     */     //   460: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   463: aastore
/*     */     //   464: dup
/*     */     //   465: iconst_1
/*     */     //   466: ldc 'trading requires an inventory upgrade to be installed'
/*     */     //   468: aastore
/*     */     //   469: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   472: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   475: astore #6
/*     */     //   477: aload #6
/*     */     //   479: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 0
/*     */     //   #64	-> 8
/*     */     //   #66	-> 31
/*     */     //   #67	-> 43
/*     */     //   #68	-> 98
/*     */     //   #70	-> 106
/*     */     //   #73	-> 113
/*     */     //   #74	-> 122
/*     */     //   #75	-> 147
/*     */     //   #76	-> 155
/*     */     //   #78	-> 186
/*     */     //   #81	-> 197
/*     */     //   #82	-> 221
/*     */     //   #84	-> 247
/*     */     //   #79	-> 278
/*     */     //   #75	-> 306
/*     */     //   #88	-> 311
/*     */     //   #73	-> 341
/*     */     //   #71	-> 346
/*     */     //   #69	-> 377
/*     */     //   #68	-> 405
/*     */     //   #91	-> 410
/*     */     //   #66	-> 440
/*     */     //   #93	-> 447
/*     */     //   #63	-> 477
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	480	0	this	Lli/cil/oc/server/component/Trade;
/*     */     //   0	480	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	480	2	arguments	Lli/cil/oc/api/machine/Arguments;
/*     */     //   31	449	5	inventory	Lnet/minecraft/inventory/IInventory;
/*     */     //   68	412	9	merchant	Lnet/minecraft/entity/IMerchant;
/*     */     //   147	333	14	recipe	Lnet/minecraft/village/MerchantRecipe;
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
/*     */   public boolean hasRoomForRecipe(IInventory inventory, MerchantRecipe recipe) {
/*  98 */     ItemStack remainder = recipe.func_77397_d().func_77946_l();
/*  99 */     InventoryUtils$.MODULE$.insertIntoInventory(remainder, inventory, (Option)None$.MODULE$, remainder.field_77994_a, true, InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/* 100 */     return (remainder.field_77994_a == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean completeTrade(IInventory inventory, MerchantRecipe recipe, boolean exact) {
/* 105 */     Option option = info().merchant().get();
/* 106 */     if (option instanceof Some) { Some some = (Some)option; IMerchant merchant = (IMerchant)some.x();
/* 107 */       ItemStack firstInputStack = recipe.func_77394_a();
/* 108 */       Option secondInputStack = recipe.func_77398_c() ? Option$.MODULE$.apply(recipe.func_77396_b()) : (Option)None$.MODULE$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 114 */       if (li$cil$oc$server$component$Trade$$containsAccumulativeItemStack$1(firstInputStack, inventory, exact) && secondInputStack.forall((Function1)new Trade$$anonfun$completeTrade$1(this, inventory, exact))) {
/*     */ 
/*     */ 
/*     */         
/* 118 */         ItemStack outputStack = recipe.func_77397_d().func_77946_l();
/*     */ 
/*     */         
/* 121 */         ItemStack x$9 = firstInputStack; IInventory x$10 = inventory; ForgeDirection x$11 = ForgeDirection.UNKNOWN; boolean x$12 = exact, x$13 = InventoryUtils$.MODULE$.extractFromInventory$default$4(); InventoryUtils$.MODULE$.extractFromInventory(x$9, x$10, x$11, x$13, x$12);
/* 122 */         secondInputStack.map((Function1)new Trade$$anonfun$completeTrade$2(this, inventory, exact));
/* 123 */         InventoryUtils$.MODULE$.insertIntoInventory(outputStack, inventory, (Option)None$.MODULE$, outputStack.field_77994_a, InventoryUtils$.MODULE$.insertIntoInventory$default$5(), InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/*     */ 
/*     */         
/* 126 */         merchant.func_70933_a(recipe);
/* 127 */         boolean bool = true;
/*     */       } 
/*     */       return false; }
/*     */     
/*     */     return false;
/*     */   }
/*     */   
/*     */   public final boolean li$cil$oc$server$component$Trade$$containsAccumulativeItemStack$1(ItemStack stack, IInventory inventory$1, boolean exact$1) {
/*     */     return ((InventoryUtils$.MODULE$.extractFromInventory(stack, inventory$1, ForgeDirection.UNKNOWN, true, exact$1)).field_77994_a == 0);
/*     */   }
/*     */   
/*     */   public final class Trade$$anonfun$completeTrade$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IInventory inventory$1;
/*     */     private final boolean exact$1;
/*     */     
/*     */     public final boolean apply(ItemStack stack) {
/*     */       return this.$outer.li$cil$oc$server$component$Trade$$containsAccumulativeItemStack$1(stack, this.inventory$1, this.exact$1);
/*     */     }
/*     */     
/*     */     public Trade$$anonfun$completeTrade$1(Trade $outer, IInventory inventory$1, boolean exact$1) {}
/*     */   }
/*     */   
/*     */   public final class Trade$$anonfun$completeTrade$2 extends AbstractFunction1<ItemStack, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IInventory inventory$1;
/*     */     private final boolean exact$1;
/*     */     
/*     */     public final ItemStack apply(ItemStack x$6) {
/*     */       ItemStack x$14 = x$6;
/*     */       IInventory x$15 = this.inventory$1;
/*     */       ForgeDirection x$16 = ForgeDirection.UNKNOWN;
/*     */       boolean x$17 = this.exact$1, x$18 = InventoryUtils$.MODULE$.extractFromInventory$default$4();
/*     */       return InventoryUtils$.MODULE$.extractFromInventory(x$14, x$15, x$16, x$18, x$17);
/*     */     }
/*     */     
/*     */     public Trade$$anonfun$completeTrade$2(Trade $outer, IInventory inventory$1, boolean exact$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Trade.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */