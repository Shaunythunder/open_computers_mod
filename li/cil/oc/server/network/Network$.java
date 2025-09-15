/*     */ package li.cil.oc.server.network;
/*     */ import codechicken.multipart.TFacePart;
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import codechicken.multipart.TileMultipart;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import li.cil.oc.api.network.WirelessEndpoint;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagLong;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.TraversableLike;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Queue;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class Network$ implements NetworkAPI {
/*     */   public Map<String, Network.Vertex> li$cil$oc$server$network$Network$$$lessinit$greater$default$1() {
/*  31 */     return scala.collection.mutable.Map$.MODULE$.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final Network$ MODULE$;
/*     */ 
/*     */ 
/*     */   
/*     */   private Function0<Object> isServer;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void joinOrCreateNetwork(TileEntity tileEntity) {
/*     */     if (!tileEntity.func_145837_r() && !(tileEntity.func_145831_w()).field_72995_K) {
/*     */       scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Network$$anonfun$joinOrCreateNetwork$1(tileEntity));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$joinOrCreateNetwork$1
/*     */     extends AbstractFunction1<ForgeDirection, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final TileEntity tileEntity$1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$joinOrCreateNetwork$1(TileEntity tileEntity$1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: new scala/Tuple3
/*     */       //   3: dup
/*     */       //   4: aload_0
/*     */       //   5: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   8: getfield field_145851_c : I
/*     */       //   11: aload_1
/*     */       //   12: getfield offsetX : I
/*     */       //   15: iadd
/*     */       //   16: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   19: aload_0
/*     */       //   20: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   23: getfield field_145848_d : I
/*     */       //   26: aload_1
/*     */       //   27: getfield offsetY : I
/*     */       //   30: iadd
/*     */       //   31: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   34: aload_0
/*     */       //   35: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   38: getfield field_145849_e : I
/*     */       //   41: aload_1
/*     */       //   42: getfield offsetZ : I
/*     */       //   45: iadd
/*     */       //   46: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   49: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   52: astore_3
/*     */       //   53: aload_3
/*     */       //   54: ifnull -> 515
/*     */       //   57: aload_3
/*     */       //   58: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   61: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   64: istore #4
/*     */       //   66: aload_3
/*     */       //   67: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   70: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   73: istore #5
/*     */       //   75: aload_3
/*     */       //   76: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   79: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   82: istore #6
/*     */       //   84: new scala/Tuple3
/*     */       //   87: dup
/*     */       //   88: iload #4
/*     */       //   90: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   93: iload #5
/*     */       //   95: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   98: iload #6
/*     */       //   100: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   103: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   106: astore #7
/*     */       //   108: aload #7
/*     */       //   110: astore_2
/*     */       //   111: aload_2
/*     */       //   112: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   115: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   118: istore #8
/*     */       //   120: aload_2
/*     */       //   121: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   124: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   127: istore #9
/*     */       //   129: aload_2
/*     */       //   130: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   133: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   136: istore #10
/*     */       //   138: aload_0
/*     */       //   139: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   142: invokevirtual func_145831_w : ()Lnet/minecraft/world/World;
/*     */       //   145: iload #8
/*     */       //   147: iload #9
/*     */       //   149: iload #10
/*     */       //   151: invokevirtual func_72899_e : (III)Z
/*     */       //   154: ifeq -> 514
/*     */       //   157: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   160: aload_0
/*     */       //   161: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   164: aload_1
/*     */       //   165: invokevirtual getNetworkNode : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Option;
/*     */       //   168: astore #11
/*     */       //   170: aload_0
/*     */       //   171: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   174: invokevirtual func_145831_w : ()Lnet/minecraft/world/World;
/*     */       //   177: iload #8
/*     */       //   179: iload #9
/*     */       //   181: iload #10
/*     */       //   183: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */       //   186: astore #12
/*     */       //   188: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   191: aload #12
/*     */       //   193: aload_1
/*     */       //   194: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   197: invokevirtual getNetworkNode : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Option;
/*     */       //   200: astore #13
/*     */       //   202: aload #11
/*     */       //   204: astore #14
/*     */       //   206: aload #14
/*     */       //   208: instanceof scala/Some
/*     */       //   211: ifeq -> 509
/*     */       //   214: aload #14
/*     */       //   216: checkcast scala/Some
/*     */       //   219: astore #15
/*     */       //   221: aload #15
/*     */       //   223: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   226: checkcast li/cil/oc/api/network/Node
/*     */       //   229: astore #16
/*     */       //   231: aload #16
/*     */       //   233: instanceof li/cil/oc/server/network/Node
/*     */       //   236: ifeq -> 509
/*     */       //   239: aload #16
/*     */       //   241: checkcast li/cil/oc/server/network/Node
/*     */       //   244: astore #17
/*     */       //   246: aload #13
/*     */       //   248: astore #19
/*     */       //   250: aload #19
/*     */       //   252: instanceof scala/Some
/*     */       //   255: ifeq -> 472
/*     */       //   258: aload #19
/*     */       //   260: checkcast scala/Some
/*     */       //   263: astore #20
/*     */       //   265: aload #20
/*     */       //   267: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   270: checkcast li/cil/oc/api/network/Node
/*     */       //   273: astore #21
/*     */       //   275: aload #21
/*     */       //   277: instanceof li/cil/oc/server/network/Node
/*     */       //   280: ifeq -> 472
/*     */       //   283: aload #21
/*     */       //   285: checkcast li/cil/oc/server/network/Node
/*     */       //   288: astore #22
/*     */       //   290: aload #22
/*     */       //   292: aload #17
/*     */       //   294: astore #23
/*     */       //   296: dup
/*     */       //   297: ifnonnull -> 309
/*     */       //   300: pop
/*     */       //   301: aload #23
/*     */       //   303: ifnull -> 472
/*     */       //   306: goto -> 317
/*     */       //   309: aload #23
/*     */       //   311: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   314: ifne -> 472
/*     */       //   317: aload #22
/*     */       //   319: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */       //   324: ifnull -> 472
/*     */       //   327: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   330: aload_0
/*     */       //   331: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   334: aload #12
/*     */       //   336: invokevirtual li$cil$oc$server$network$Network$$canConnectBasedOnColor : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraft/tileentity/TileEntity;)Z
/*     */       //   339: istore #25
/*     */       //   341: getstatic li/cil/oc/integration/Mods$.MODULE$ : Lli/cil/oc/integration/Mods$;
/*     */       //   344: invokevirtual ForgeMultipart : ()Lli/cil/oc/integration/Mods$SimpleMod;
/*     */       //   347: invokevirtual isAvailable : ()Z
/*     */       //   350: ifeq -> 386
/*     */       //   353: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   356: aload_0
/*     */       //   357: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   360: aload_1
/*     */       //   361: invokevirtual li$cil$oc$server$network$Network$$canConnectFromSideFMP : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */       //   364: ifeq -> 382
/*     */       //   367: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   370: aload #12
/*     */       //   372: aload_1
/*     */       //   373: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   376: invokevirtual li$cil$oc$server$network$Network$$canConnectFromSideFMP : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */       //   379: ifne -> 386
/*     */       //   382: iconst_0
/*     */       //   383: goto -> 387
/*     */       //   386: iconst_1
/*     */       //   387: istore #26
/*     */       //   389: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   392: aload_0
/*     */       //   393: getfield tileEntity$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   396: aload_1
/*     */       //   397: invokevirtual li$cil$oc$server$network$Network$$canConnectFromSideIM : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */       //   400: ifeq -> 422
/*     */       //   403: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   406: aload #12
/*     */       //   408: aload_1
/*     */       //   409: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   412: invokevirtual li$cil$oc$server$network$Network$$canConnectFromSideIM : (Lnet/minecraft/tileentity/TileEntity;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */       //   415: ifeq -> 422
/*     */       //   418: iconst_1
/*     */       //   419: goto -> 423
/*     */       //   422: iconst_0
/*     */       //   423: istore #27
/*     */       //   425: iload #25
/*     */       //   427: ifeq -> 455
/*     */       //   430: iload #26
/*     */       //   432: ifeq -> 455
/*     */       //   435: iload #27
/*     */       //   437: ifeq -> 455
/*     */       //   440: aload #22
/*     */       //   442: aload #17
/*     */       //   444: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */       //   449: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   452: goto -> 467
/*     */       //   455: aload #17
/*     */       //   457: aload #22
/*     */       //   459: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */       //   464: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   467: astore #24
/*     */       //   469: goto -> 477
/*     */       //   472: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   475: astore #24
/*     */       //   477: aload #17
/*     */       //   479: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */       //   484: ifnonnull -> 501
/*     */       //   487: getstatic li/cil/oc/server/network/Network$.MODULE$ : Lli/cil/oc/server/network/Network$;
/*     */       //   490: aload #17
/*     */       //   492: invokevirtual joinNewNetwork : (Lli/cil/oc/api/network/Node;)V
/*     */       //   495: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   498: goto -> 504
/*     */       //   501: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   504: astore #18
/*     */       //   506: goto -> 514
/*     */       //   509: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   512: astore #18
/*     */       //   514: return
/*     */       //   515: new scala/MatchError
/*     */       //   518: dup
/*     */       //   519: aload_3
/*     */       //   520: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   523: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #456	-> 0
/*     */       //   #457	-> 4
/*     */       //   #458	-> 19
/*     */       //   #459	-> 34
/*     */       //   #456	-> 49
/*     */       //   #460	-> 138
/*     */       //   #461	-> 157
/*     */       //   #462	-> 170
/*     */       //   #463	-> 188
/*     */       //   #464	-> 202
/*     */       //   #465	-> 206
/*     */       //   #466	-> 246
/*     */       //   #467	-> 250
/*     */       //   #468	-> 327
/*     */       //   #469	-> 341
/*     */       //   #470	-> 353
/*     */       //   #469	-> 382
/*     */       //   #471	-> 389
/*     */       //   #472	-> 425
/*     */       //   #473	-> 455
/*     */       //   #467	-> 467
/*     */       //   #474	-> 472
/*     */       //   #476	-> 477
/*     */       //   #477	-> 487
/*     */       //   #476	-> 501
/*     */       //   #465	-> 504
/*     */       //   #479	-> 509
/*     */       //   #455	-> 514
/*     */       //   #456	-> 515
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	524	0	this	Lli/cil/oc/server/network/Network$$anonfun$joinOrCreateNetwork$1;
/*     */       //   0	524	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   66	458	4	nx	I
/*     */       //   75	449	5	ny	I
/*     */       //   84	440	6	nz	I
/*     */       //   120	404	8	nx	I
/*     */       //   129	395	9	ny	I
/*     */       //   138	386	10	nz	I
/*     */       //   170	354	11	localNode	Lscala/Option;
/*     */       //   188	336	12	neighborTileEntity	Lnet/minecraft/tileentity/TileEntity;
/*     */       //   202	322	13	neighborNode	Lscala/Option;
/*     */       //   231	293	16	node	Lli/cil/oc/api/network/Node;
/*     */       //   275	249	21	neighbor	Lli/cil/oc/api/network/Node;
/*     */       //   341	183	25	canConnectColor	Z
/*     */       //   389	135	26	canConnectFMP	Z
/*     */       //   425	99	27	canConnectIM	Z
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void joinNewNetwork(Node node) {
/*     */     Node node1 = node;
/*     */     if (node1 instanceof Node) {
/*     */       Node node2 = (Node)node1;
/*     */       if (node2.network() == null) {
/*     */         new Network(node2);
/*     */         BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<Node> getNetworkNode(TileEntity tileEntity, ForgeDirection side) {
/*     */     scala.None$ none$;
/*     */     TileEntity tileEntity1 = tileEntity;
/*     */     if (tileEntity1 instanceof SidedEnvironment) {
/*     */       TileEntity tileEntity2 = tileEntity1;
/*     */       Option option = scala.Option$.MODULE$.apply(((SidedEnvironment)tileEntity2).sidedNode(side));
/*     */     } else if (tileEntity1 instanceof Environment && tileEntity1 instanceof SidedComponent) {
/*     */       TileEntity tileEntity2 = tileEntity1;
/*     */       none$ = (scala.None$)(((SidedComponent)tileEntity2).canConnectNode(side) ? scala.Option$.MODULE$.apply(((Environment)tileEntity2).node()) : scala.None$.MODULE$);
/*     */     } else if (tileEntity1 instanceof Environment) {
/*     */       TileEntity tileEntity2 = tileEntity1;
/*     */       Option option = scala.Option$.MODULE$.apply(((Environment)tileEntity2).node());
/*     */     } else if (li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable()) {
/*     */       Option<Node> option = getMultiPartNode(tileEntity1);
/*     */     } else {
/*     */       none$ = scala.None$.MODULE$;
/*     */     } 
/*     */     return (Option<Node>)none$;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Option<Node> getMultiPartNode(TileEntity tileEntity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: instanceof codechicken/multipart/TileMultipart
/*     */     //   6: ifeq -> 101
/*     */     //   9: aload_2
/*     */     //   10: checkcast codechicken/multipart/TileMultipart
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: invokevirtual partList : ()Lscala/collection/Seq;
/*     */     //   18: new li/cil/oc/server/network/Network$$anonfun$16
/*     */     //   21: dup
/*     */     //   22: invokespecial <init> : ()V
/*     */     //   25: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   30: astore #5
/*     */     //   32: aload #5
/*     */     //   34: instanceof scala/Some
/*     */     //   37: ifeq -> 89
/*     */     //   40: aload #5
/*     */     //   42: checkcast scala/Some
/*     */     //   45: astore #6
/*     */     //   47: aload #6
/*     */     //   49: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   52: checkcast codechicken/multipart/TMultiPart
/*     */     //   55: astore #7
/*     */     //   57: aload #7
/*     */     //   59: instanceof li/cil/oc/integration/fmp/CablePart
/*     */     //   62: ifeq -> 89
/*     */     //   65: aload #7
/*     */     //   67: checkcast li/cil/oc/integration/fmp/CablePart
/*     */     //   70: astore #8
/*     */     //   72: new scala/Some
/*     */     //   75: dup
/*     */     //   76: aload #8
/*     */     //   78: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   81: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   84: astore #9
/*     */     //   86: goto -> 94
/*     */     //   89: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   92: astore #9
/*     */     //   94: aload #9
/*     */     //   96: astore #4
/*     */     //   98: goto -> 106
/*     */     //   101: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   104: astore #4
/*     */     //   106: aload #4
/*     */     //   108: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #503	-> 0
/*     */     //   #504	-> 2
/*     */     //   #505	-> 32
/*     */     //   #506	-> 89
/*     */     //   #504	-> 94
/*     */     //   #508	-> 101
/*     */     //   #503	-> 106
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	109	0	this	Lli/cil/oc/server/network/Network$;
/*     */     //   0	109	1	tileEntity	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   57	52	7	part	Lcodechicken/multipart/TMultiPart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$16
/*     */     extends AbstractFunction1<TMultiPart, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(TMultiPart x$31) {
/*     */       return x$31 instanceof CablePart;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int cableColor(TileEntity tileEntity) {
/*     */     int i;
/*     */     TileEntity tileEntity1 = tileEntity;
/*     */     if (tileEntity1 instanceof Cable) {
/*     */       Cable cable = (Cable)tileEntity1;
/*     */       i = cable.color();
/*     */     } else {
/*     */       i = li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable() ? cableColorFMP(tileEntity) : li.cil.oc.util.Color$.MODULE$.LightGray();
/*     */     } 
/*     */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int cableColorFMP(TileEntity tileEntity) {
/*     */     int i;
/*     */     TileEntity tileEntity1 = tileEntity;
/*     */     if (tileEntity1 instanceof TileMultipart) {
/*     */       TileMultipart tileMultipart = (TileMultipart)tileEntity1;
/*     */       i = BoxesRunTime.unboxToInt(((TraversableLike)tileMultipart.partList().collect((PartialFunction)new Network$$anonfun$cableColorFMP$2(), scala.collection.Seq$.MODULE$.canBuildFrom())).headOption().getOrElse((Function0)new Network$$anonfun$cableColorFMP$1()));
/*     */     } else {
/*     */       i = li.cil.oc.util.Color$.MODULE$.LightGray();
/*     */     } 
/*     */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$cableColorFMP$2
/*     */     extends AbstractPartialFunction<TMultiPart, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final <A1 extends TMultiPart, B1> B1 applyOrElse(TMultiPart x2, Function1 default) {
/*     */       Object object;
/*     */       TMultiPart tMultiPart = x2;
/*     */       if (tMultiPart instanceof CablePart) {
/*     */         CablePart cablePart = (CablePart)tMultiPart;
/*     */         object = BoxesRunTime.boxToInteger(cablePart.color());
/*     */       } else {
/*     */         object = default.apply(x2);
/*     */       } 
/*     */       return (B1)object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean isDefinedAt(TMultiPart x2) {
/*     */       boolean bool;
/*     */       TMultiPart tMultiPart = x2;
/*     */       if (tMultiPart instanceof CablePart) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$cableColorFMP$1
/*     */     extends AbstractFunction0.mcI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int apply() {
/*     */       return apply$mcI$sp();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int apply$mcI$sp() {
/*     */       return li.cil.oc.util.Color$.MODULE$.LightGray();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean li$cil$oc$server$network$Network$$canConnectBasedOnColor(TileEntity te1, TileEntity te2) {
/*     */     Tuple2.mcII.sp sp = new Tuple2.mcII.sp(cableColor(te1), cableColor(te2));
/*     */     if (sp != null) {
/*     */       int c1 = sp._1$mcI$sp(), c2 = sp._2$mcI$sp();
/*     */       Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(c1, c2), sp1 = sp2;
/*     */       int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*     */       return (i == j || i == li.cil.oc.util.Color$.MODULE$.LightGray() || j == li.cil.oc.util.Color$.MODULE$.LightGray());
/*     */     } 
/*     */     throw new MatchError(sp);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean li$cil$oc$server$network$Network$$canConnectFromSideFMP(TileEntity tileEntity, ForgeDirection side) {
/*     */     boolean bool;
/*     */     TileEntity tileEntity1 = tileEntity;
/*     */     if (tileEntity1 instanceof TileMultipart) {
/*     */       TileMultipart tileMultipart = (TileMultipart)tileEntity1;
/*     */       bool = tileMultipart.partList().forall((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$canConnectFromSideFMP$1(side));
/*     */     } else {
/*     */       bool = true;
/*     */     } 
/*     */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$li$cil$oc$server$network$Network$$canConnectFromSideFMP$1
/*     */     extends AbstractFunction1<TMultiPart, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final ForgeDirection side$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(TMultiPart x0$1) {
/*     */       boolean bool;
/*     */       TMultiPart tMultiPart = x0$1;
/*     */       if (tMultiPart instanceof JNormalOcclusion) {
/*     */         TMultiPart tMultiPart1 = tMultiPart;
/*     */         if (!(tMultiPart1 instanceof CablePart)) {
/*     */           (new Cuboid6[1])[0] = new Cuboid6(li.cil.oc.common.block.Cable$.MODULE$.cachedBounds()[this.side$1.flag]);
/*     */           Iterable ownBounds = (Iterable)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Cuboid6[1]));
/*     */           Iterable otherBounds = ((JNormalOcclusion)tMultiPart1).getOcclusionBoxes();
/*     */           return codechicken.multipart.NormalOcclusionTest$.MODULE$.apply((Traversable)ownBounds, (Traversable)scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(otherBounds));
/*     */         } 
/*     */       } 
/*     */       if (tMultiPart instanceof TFacePart) {
/*     */         TFacePart tFacePart = (TFacePart)tMultiPart;
/*     */         bool = (tFacePart.solid(this.side$1.ordinal()) && (tFacePart.getSlotMask() & (PartMap.face(this.side$1.ordinal())).mask) != 0) ? false : true;
/*     */       } else {
/*     */         bool = true;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$li$cil$oc$server$network$Network$$canConnectFromSideFMP$1(ForgeDirection side$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean li$cil$oc$server$network$Network$$canConnectFromSideIM(TileEntity tileEntity, ForgeDirection side) {
/*     */     boolean bool;
/*     */     TileEntity tileEntity1 = tileEntity;
/*     */     if (tileEntity1 instanceof ImmibisMicroblock) {
/*     */       ImmibisMicroblock immibisMicroblock = (ImmibisMicroblock)tileEntity1;
/*     */       bool = immibisMicroblock.ImmibisMicroblocks_isSideOpen(side.ordinal());
/*     */     } else {
/*     */       bool = true;
/*     */     } 
/*     */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void joinWirelessNetwork(WirelessEndpoint endpoint) {
/*     */     WirelessNetwork$.MODULE$.add(endpoint);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateWirelessNetwork(WirelessEndpoint endpoint) {
/*     */     WirelessNetwork$.MODULE$.update(endpoint);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void leaveWirelessNetwork(WirelessEndpoint endpoint) {
/*     */     WirelessNetwork$.MODULE$.remove(endpoint);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void leaveWirelessNetwork(WirelessEndpoint endpoint, int dimension) {
/*     */     WirelessNetwork$.MODULE$.remove(endpoint, dimension);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendWirelessPacket(WirelessEndpoint source, double strength, Packet packet) {
/*     */     WirelessNetwork$.MODULE$.computeReachableFrom(source, strength).foreach((Function1)new Network$$anonfun$sendWirelessPacket$1(source, packet));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$sendWirelessPacket$1
/*     */     extends AbstractFunction1<WirelessEndpoint, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final WirelessEndpoint source$2;
/*     */ 
/*     */     
/*     */     private final Packet packet$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$sendWirelessPacket$1(WirelessEndpoint source$2, Packet packet$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(WirelessEndpoint endpoint) {
/*     */       endpoint.receivePacket(this.packet$1, this.source$2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Network.NodeBuilder newNode(Environment host, Visibility reachability) {
/*     */     return new Network.NodeBuilder(host, reachability);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Network.Packet newPacket(String source, String destination, int port, Object[] data) {
/*     */     Network.Packet packet = new Network.Packet(source, destination, port, data, Network.Packet$.MODULE$.$lessinit$greater$default$5());
/*     */     if (packet.size() > li.cil.oc.Settings$.MODULE$.get().maxNetworkPacketSize()) {
/*     */       throw new IllegalArgumentException((new StringBuilder()).append("packet too big (max ").append(BoxesRunTime.boxToInteger(li.cil.oc.Settings$.MODULE$.get().maxNetworkPacketSize())).append(")").toString());
/*     */     }
/*     */     return packet;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Network.Packet newPacket(NBTTagCompound nbt) {
/*     */     String source = nbt.func_74779_i("source");
/*     */     String destination = nbt.func_74764_b("dest") ? null : nbt.func_74779_i("dest");
/*     */     int port = nbt.func_74762_e("port");
/*     */     int ttl = nbt.func_74762_e("ttl");
/*     */     Object[] data = (Object[])((TraversableOnce)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), nbt.func_74762_e("dataLength")).map((Function1)new Network$$anonfun$17(nbt), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.AnyRef());
/*     */     return new Network.Packet(source, destination, port, data, ttl);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$17
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final NBTTagCompound nbt$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$17(NBTTagCompound nbt$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object apply(int i) {
/*     */       byte[] arrayOfByte;
/*     */       NBTBase nBTBase = this.nbt$1.func_74781_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString());
/*     */       if (nBTBase instanceof NBTTagByte) {
/*     */         NBTTagByte nBTTagByte = (NBTTagByte)nBTBase;
/*     */         Boolean bool = BoxesRunTime.boxToBoolean((nBTTagByte.func_150290_f() == 1));
/*     */       } else if (nBTBase instanceof NBTTagShort) {
/*     */         NBTTagShort nBTTagShort = (NBTTagShort)nBTBase;
/*     */         Short short_ = BoxesRunTime.boxToShort(nBTTagShort.func_150289_e());
/*     */       } else if (nBTBase instanceof NBTTagInt) {
/*     */         NBTTagInt nBTTagInt = (NBTTagInt)nBTBase;
/*     */         Integer integer = BoxesRunTime.boxToInteger(nBTTagInt.func_150287_d());
/*     */       } else if (nBTBase instanceof NBTTagLong) {
/*     */         NBTTagLong nBTTagLong = (NBTTagLong)nBTBase;
/*     */         Long long_ = BoxesRunTime.boxToLong(nBTTagLong.func_150291_c());
/*     */       } else if (nBTBase instanceof NBTTagFloat) {
/*     */         NBTTagFloat nBTTagFloat = (NBTTagFloat)nBTBase;
/*     */         Float float_ = BoxesRunTime.boxToFloat(nBTTagFloat.func_150288_h());
/*     */       } else if (nBTBase instanceof NBTTagDouble) {
/*     */         NBTTagDouble nBTTagDouble = (NBTTagDouble)nBTBase;
/*     */         Double double_ = BoxesRunTime.boxToDouble(nBTTagDouble.func_150286_g());
/*     */       } else if (nBTBase instanceof NBTTagString) {
/*     */         NBTTagString nBTTagString = (NBTTagString)nBTBase;
/*     */         String str = nBTTagString.func_150285_a_();
/*     */       } else if (nBTBase instanceof NBTTagByteArray) {
/*     */         NBTTagByteArray nBTTagByteArray = (NBTTagByteArray)nBTBase;
/*     */         arrayOfByte = nBTTagByteArray.func_150292_c();
/*     */       } else {
/*     */         throw new MatchError(nBTBase);
/*     */       } 
/*     */       return this.nbt$1.func_74764_b((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString()) ? arrayOfByte : null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Network$() {
/* 452 */     MODULE$ = this;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 617 */     this.isServer = (Function0<Object>)new Network$$anonfun$1(); } public Function0<Object> isServer() { return this.isServer; } public void isServer_$eq(Function0<Object> x$1) { this.isServer = x$1; } public final class Network$$anonfun$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return SideTracker.isServer(); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1
/*     */     extends AbstractFunction1<Network.Vertex, Option<Map<String, Network.Vertex>>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final Set seen$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1(Set seen$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final Option<Map<String, Network.Vertex>> apply(Network.Vertex seed) {
/*     */       Map addressed = scala.collection.mutable.Map$.MODULE$.empty();
/*     */       (new Network.Vertex[1])[0] = seed;
/*     */       Queue queue = (Queue)scala.collection.mutable.Queue$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Network.Vertex[1]));
/*     */       while (queue.nonEmpty()) {
/*     */         Network.Vertex node = (Network.Vertex)queue.dequeue();
/*     */         this.seen$1.$plus$eq(node);
/*     */         addressed.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(node.data().address()), node));
/*     */         queue.$plus$plus$eq((TraversableOnce)((TraversableLike)node.edges().map((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$9(this, node), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).filter((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$10(this, queue)));
/*     */       } 
/*     */       return this.seen$1.contains(seed) ? (Option<Map<String, Network.Vertex>>)scala.None$.MODULE$ : (Option<Map<String, Network.Vertex>>)new Some(addressed);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final class Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$9
/*     */       extends AbstractFunction1<Network.Edge, Network.Vertex>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */       
/*     */       private final Network.Vertex node$2;
/*     */ 
/*     */ 
/*     */       
/*     */       public final Network.Vertex apply(Network.Edge x$34) {
/*     */         return x$34.other(this.node$2);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$9(Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1 $outer, Network.Vertex node$2) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final class Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$10
/*     */       extends AbstractFunction1<Network.Vertex, Object>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */       
/*     */       private final Queue queue$1;
/*     */ 
/*     */ 
/*     */       
/*     */       public final boolean apply(Network.Vertex n) {
/*     */         return !(this.$outer.seen$1.contains(n) || this.queue$1.contains(n));
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1$$anonfun$apply$10(Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1 $outer, Queue queue$1) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Seq<Map<String, Network.Vertex>> li$cil$oc$server$network$Network$$searchGraphs(Seq seeds)
/*     */   {
/* 702 */     Set seen = scala.collection.mutable.Set$.MODULE$.empty();
/* 703 */     return (Seq<Map<String, Network.Vertex>>)((TraversableLike)((TraversableLike)seeds.map((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$1(seen), scala.collection.Seq$.MODULE$.canBuildFrom()))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 716 */       .filter((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$2())).map((Function1)new Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$3(), scala.collection.Seq$.MODULE$.canBuildFrom()); } public final class Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$2 extends AbstractFunction1<Option<Map<String, Network.Vertex>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x$35) { return x$35.nonEmpty(); } } public final class Network$$anonfun$li$cil$oc$server$network$Network$$searchGraphs$3 extends AbstractFunction1<Option<Map<String, Network.Vertex>>, Map<String, Network.Vertex>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, Network.Vertex> apply(Option x$36) { return (Map<String, Network.Vertex>)x$36.get(); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Network$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */