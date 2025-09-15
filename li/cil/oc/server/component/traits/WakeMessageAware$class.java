/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.network.Packet;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Predef$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class WakeMessageAware$class {
/*    */   public static void $init$(WakeMessageAware $this) {
/* 12 */     $this.wakeMessage_$eq((Option<String>)None$.MODULE$);
/*    */     
/* 14 */     $this.wakeMessageFuzzy_$eq(false);
/*    */   } @Callback(direct = true, doc = "function():string, boolean -- Get the current wake-up message.")
/*    */   public static Object[] getWakeMessage(WakeMessageAware $this, Context context, Arguments args) {
/* 17 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { $this.wakeMessage().orNull(Predef$.MODULE$.$conforms()), BoxesRunTime.boxToBoolean($this.wakeMessageFuzzy()) }));
/*    */   }
/*    */   @Callback(doc = "function(message:string[, fuzzy:boolean]):string -- Set the wake-up message and whether to ignore additional data/parameters.")
/*    */   public static Object[] setWakeMessage(WakeMessageAware $this, Context context, Arguments args) {
/* 21 */     Option<String> oldMessage = $this.wakeMessage();
/* 22 */     boolean oldFuzzy = $this.wakeMessageFuzzy();
/*    */     
/* 24 */     if (args.optAny(0, null) == null) {
/* 25 */       $this.wakeMessage_$eq((Option<String>)None$.MODULE$);
/*    */     } else {
/* 27 */       $this.wakeMessage_$eq(Option$.MODULE$.apply(args.checkString(0)));
/* 28 */     }  $this.wakeMessageFuzzy_$eq(args.optBoolean(1, $this.wakeMessageFuzzy()));
/*    */     
/* 30 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { oldMessage.orNull(Predef$.MODULE$.$conforms()), BoxesRunTime.boxToBoolean(oldFuzzy) }));
/*    */   }
/*    */   public static boolean isPacketAccepted(WakeMessageAware $this, Packet packet, double distance) {
/* 33 */     return true;
/*    */   }
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
/*    */   public static void receivePacket(WakeMessageAware $this, Packet packet, double distance, EnvironmentHost host) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokeinterface source : ()Ljava/lang/String;
/*    */     //   6: aload_0
/*    */     //   7: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*    */     //   12: invokeinterface address : ()Ljava/lang/String;
/*    */     //   17: astore #5
/*    */     //   19: dup
/*    */     //   20: ifnonnull -> 32
/*    */     //   23: pop
/*    */     //   24: aload #5
/*    */     //   26: ifnull -> 678
/*    */     //   29: goto -> 40
/*    */     //   32: aload #5
/*    */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   37: ifne -> 678
/*    */     //   40: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   43: aload_1
/*    */     //   44: invokeinterface destination : ()Ljava/lang/String;
/*    */     //   49: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   52: new li/cil/oc/server/component/traits/WakeMessageAware$$anonfun$receivePacket$1
/*    */     //   55: dup
/*    */     //   56: aload_0
/*    */     //   57: invokespecial <init> : (Lli/cil/oc/server/component/traits/WakeMessageAware;)V
/*    */     //   60: invokevirtual forall : (Lscala/Function1;)Z
/*    */     //   63: ifeq -> 678
/*    */     //   66: aload_0
/*    */     //   67: aload_1
/*    */     //   68: dload_2
/*    */     //   69: invokeinterface isPacketAccepted : (Lli/cil/oc/api/network/Packet;D)Z
/*    */     //   74: ifeq -> 182
/*    */     //   77: aload_0
/*    */     //   78: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*    */     //   83: ldc 'computer.signal'
/*    */     //   85: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*    */     //   88: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   91: iconst_4
/*    */     //   92: anewarray java/lang/Object
/*    */     //   95: dup
/*    */     //   96: iconst_0
/*    */     //   97: ldc 'modem_message'
/*    */     //   99: aastore
/*    */     //   100: dup
/*    */     //   101: iconst_1
/*    */     //   102: aload_1
/*    */     //   103: invokeinterface source : ()Ljava/lang/String;
/*    */     //   108: aastore
/*    */     //   109: dup
/*    */     //   110: iconst_2
/*    */     //   111: aload_1
/*    */     //   112: invokeinterface port : ()I
/*    */     //   117: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   120: aastore
/*    */     //   121: dup
/*    */     //   122: iconst_3
/*    */     //   123: dload_2
/*    */     //   124: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*    */     //   127: aastore
/*    */     //   128: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   131: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*    */     //   134: checkcast scala/collection/TraversableLike
/*    */     //   137: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   140: aload_1
/*    */     //   141: invokeinterface data : ()[Ljava/lang/Object;
/*    */     //   146: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   149: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*    */     //   152: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */     //   155: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */     //   160: checkcast scala/collection/TraversableOnce
/*    */     //   163: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */     //   166: invokevirtual Object : ()Lscala/reflect/ClassTag;
/*    */     //   169: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */     //   174: checkcast [Ljava/lang/Object;
/*    */     //   177: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   182: aload_1
/*    */     //   183: invokeinterface data : ()[Ljava/lang/Object;
/*    */     //   188: astore #7
/*    */     //   190: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   193: aload #7
/*    */     //   195: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   198: astore #8
/*    */     //   200: aload #8
/*    */     //   202: invokevirtual isEmpty : ()Z
/*    */     //   205: ifne -> 295
/*    */     //   208: aload #8
/*    */     //   210: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   213: ifnull -> 295
/*    */     //   216: aload #8
/*    */     //   218: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   221: checkcast scala/collection/SeqLike
/*    */     //   224: iconst_1
/*    */     //   225: invokeinterface lengthCompare : (I)I
/*    */     //   230: iconst_0
/*    */     //   231: if_icmpne -> 295
/*    */     //   234: aload #8
/*    */     //   236: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   239: checkcast scala/collection/SeqLike
/*    */     //   242: iconst_0
/*    */     //   243: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   248: astore #9
/*    */     //   250: aload #9
/*    */     //   252: instanceof [B
/*    */     //   255: ifeq -> 295
/*    */     //   258: aload #9
/*    */     //   260: checkcast [B
/*    */     //   263: astore #10
/*    */     //   265: aload_0
/*    */     //   266: invokeinterface wakeMessage : ()Lscala/Option;
/*    */     //   271: new java/lang/String
/*    */     //   274: dup
/*    */     //   275: aload #10
/*    */     //   277: getstatic com/google/common/base/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   280: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*    */     //   283: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   286: ifeq -> 295
/*    */     //   289: iconst_1
/*    */     //   290: istore #11
/*    */     //   292: goto -> 611
/*    */     //   295: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   298: aload #7
/*    */     //   300: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   303: astore #12
/*    */     //   305: aload #12
/*    */     //   307: invokevirtual isEmpty : ()Z
/*    */     //   310: ifne -> 390
/*    */     //   313: aload #12
/*    */     //   315: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   318: ifnull -> 390
/*    */     //   321: aload #12
/*    */     //   323: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   326: checkcast scala/collection/SeqLike
/*    */     //   329: iconst_1
/*    */     //   330: invokeinterface lengthCompare : (I)I
/*    */     //   335: iconst_0
/*    */     //   336: if_icmpne -> 390
/*    */     //   339: aload #12
/*    */     //   341: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   344: checkcast scala/collection/SeqLike
/*    */     //   347: iconst_0
/*    */     //   348: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   353: astore #13
/*    */     //   355: aload #13
/*    */     //   357: instanceof java/lang/String
/*    */     //   360: ifeq -> 390
/*    */     //   363: aload #13
/*    */     //   365: checkcast java/lang/String
/*    */     //   368: astore #14
/*    */     //   370: aload_0
/*    */     //   371: invokeinterface wakeMessage : ()Lscala/Option;
/*    */     //   376: aload #14
/*    */     //   378: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   381: ifeq -> 390
/*    */     //   384: iconst_1
/*    */     //   385: istore #11
/*    */     //   387: goto -> 611
/*    */     //   390: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   393: aload #7
/*    */     //   395: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   398: astore #15
/*    */     //   400: aload #15
/*    */     //   402: invokevirtual isEmpty : ()Z
/*    */     //   405: ifne -> 504
/*    */     //   408: aload #15
/*    */     //   410: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   413: ifnull -> 504
/*    */     //   416: aload #15
/*    */     //   418: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   421: checkcast scala/collection/SeqLike
/*    */     //   424: iconst_1
/*    */     //   425: invokeinterface lengthCompare : (I)I
/*    */     //   430: iconst_0
/*    */     //   431: if_icmplt -> 504
/*    */     //   434: aload #15
/*    */     //   436: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   439: checkcast scala/collection/SeqLike
/*    */     //   442: iconst_0
/*    */     //   443: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   448: astore #16
/*    */     //   450: aload #16
/*    */     //   452: instanceof [B
/*    */     //   455: ifeq -> 504
/*    */     //   458: aload #16
/*    */     //   460: checkcast [B
/*    */     //   463: astore #17
/*    */     //   465: aload_0
/*    */     //   466: invokeinterface wakeMessageFuzzy : ()Z
/*    */     //   471: ifeq -> 504
/*    */     //   474: aload_0
/*    */     //   475: invokeinterface wakeMessage : ()Lscala/Option;
/*    */     //   480: new java/lang/String
/*    */     //   483: dup
/*    */     //   484: aload #17
/*    */     //   486: getstatic com/google/common/base/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   489: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*    */     //   492: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   495: ifeq -> 504
/*    */     //   498: iconst_1
/*    */     //   499: istore #11
/*    */     //   501: goto -> 611
/*    */     //   504: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   507: aload #7
/*    */     //   509: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   512: astore #18
/*    */     //   514: aload #18
/*    */     //   516: invokevirtual isEmpty : ()Z
/*    */     //   519: ifne -> 608
/*    */     //   522: aload #18
/*    */     //   524: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   527: ifnull -> 608
/*    */     //   530: aload #18
/*    */     //   532: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   535: checkcast scala/collection/SeqLike
/*    */     //   538: iconst_1
/*    */     //   539: invokeinterface lengthCompare : (I)I
/*    */     //   544: iconst_0
/*    */     //   545: if_icmplt -> 608
/*    */     //   548: aload #18
/*    */     //   550: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   553: checkcast scala/collection/SeqLike
/*    */     //   556: iconst_0
/*    */     //   557: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   562: astore #19
/*    */     //   564: aload #19
/*    */     //   566: instanceof java/lang/String
/*    */     //   569: ifeq -> 608
/*    */     //   572: aload #19
/*    */     //   574: checkcast java/lang/String
/*    */     //   577: astore #20
/*    */     //   579: aload_0
/*    */     //   580: invokeinterface wakeMessageFuzzy : ()Z
/*    */     //   585: ifeq -> 608
/*    */     //   588: aload_0
/*    */     //   589: invokeinterface wakeMessage : ()Lscala/Option;
/*    */     //   594: aload #20
/*    */     //   596: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   599: ifeq -> 608
/*    */     //   602: iconst_1
/*    */     //   603: istore #11
/*    */     //   605: goto -> 611
/*    */     //   608: iconst_0
/*    */     //   609: istore #11
/*    */     //   611: iload #11
/*    */     //   613: istore #6
/*    */     //   615: iload #6
/*    */     //   617: ifeq -> 678
/*    */     //   620: aload #4
/*    */     //   622: astore #21
/*    */     //   624: aload #21
/*    */     //   626: instanceof li/cil/oc/api/machine/Context
/*    */     //   629: ifeq -> 655
/*    */     //   632: aload #21
/*    */     //   634: astore #22
/*    */     //   636: aload #22
/*    */     //   638: checkcast li/cil/oc/api/machine/Context
/*    */     //   641: invokeinterface start : ()Z
/*    */     //   646: pop
/*    */     //   647: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   650: astore #23
/*    */     //   652: goto -> 678
/*    */     //   655: aload_0
/*    */     //   656: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*    */     //   661: ldc_w 'computer.start'
/*    */     //   664: iconst_0
/*    */     //   665: anewarray java/lang/Object
/*    */     //   668: invokeinterface sendToNeighbors : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   673: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   676: astore #23
/*    */     //   678: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 0
/*    */     //   #37	-> 66
/*    */     //   #38	-> 77
/*    */     //   #43	-> 182
/*    */     //   #44	-> 190
/*    */     //   #45	-> 295
/*    */     //   #46	-> 390
/*    */     //   #47	-> 504
/*    */     //   #48	-> 608
/*    */     //   #43	-> 611
/*    */     //   #50	-> 615
/*    */     //   #51	-> 620
/*    */     //   #52	-> 624
/*    */     //   #53	-> 655
/*    */     //   #36	-> 678
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	679	0	$this	Lli/cil/oc/server/component/traits/WakeMessageAware;
/*    */     //   0	679	1	packet	Lli/cil/oc/api/network/Packet;
/*    */     //   0	679	2	distance	D
/*    */     //   0	679	4	host	Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   250	429	9	message	Ljava/lang/Object;
/*    */     //   355	324	13	message	Ljava/lang/Object;
/*    */     //   450	229	16	message	Ljava/lang/Object;
/*    */     //   564	115	19	message	Ljava/lang/Object;
/*    */     //   615	64	6	wakeup	Z
/*    */   }
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
/*    */   public static void loadWakeMessage(WakeMessageAware $this, NBTTagCompound nbt) {
/* 60 */     if (nbt.func_74764_b("wakeMessage")) {
/* 61 */       $this.wakeMessage_$eq(Option$.MODULE$.apply(nbt.func_74779_i("wakeMessage")));
/*    */     }
/* 63 */     $this.wakeMessageFuzzy_$eq(nbt.func_74767_n("wakeMessageFuzzy"));
/*    */   }
/*    */   
/*    */   public static void saveWakeMessage(WakeMessageAware $this, NBTTagCompound nbt) {
/* 67 */     $this.wakeMessage().foreach((Function1)new WakeMessageAware$$anonfun$saveWakeMessage$1($this, nbt));
/* 68 */     nbt.func_74757_a("wakeMessageFuzzy", $this.wakeMessageFuzzy());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WakeMessageAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */