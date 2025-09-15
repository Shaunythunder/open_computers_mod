/*     */ package li.cil.oc.server.component;
/*     */ import java.util.List;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraftforge.common.ForgeChunkManager;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005}f\001B\001\003\0015\021!#\0269he\006$Wm\0215v].dw.\0313fe*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\031\001(/\0324bE*\0211CB\001\004CBL\027BA\013\021\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\021\005]QR\"\001\r\013\005e\021\022A\0023sSZ,'/\003\002\0341\tQA)\032<jG\026LeNZ8\t\021u\001!Q1A\005\002y\tA\001[8tiV\tq\004\005\002!G5\t\021E\003\002#%\0059a.\032;x_J\\\027B\001\023\"\005=)eN^5s_:lWM\034;I_N$\b\002\003\024\001\005\003\005\013\021B\020\002\013!|7\017\036\021\t\013!\002A\021A\025\002\rqJg.\033;?)\tQC\006\005\002,\0015\t!\001C\003\036O\001\007q\004C\004/\001\t\007I\021I\030\002\t9|G-Z\013\002aA\021\001%M\005\003e\005\022!cQ8na>tWM\034;D_:tWm\031;pe\"1A\007\001Q\001\nA\nQA\\8eK\002B\001B\016\001\t\006\004%iaN\001\013I\0264\030nY3J]\032|W#\001\035\021\te\002%IQ\007\002u)\0211\bP\001\nS6lW\017^1cY\026T!!\020 \002\025\r|G\016\\3di&|gNC\001@\003\025\0318-\0317b\023\t\t%HA\002NCB\004\"a\021%\016\003\021S!!\022$\002\t1\fgn\032\006\002\017\006!!.\031<b\023\tIEI\001\004TiJLgn\032\005\t\027\002A\t\021)Q\007q\005YA-\032<jG\026LeNZ8!\021\025i\005\001\"\021O\00359W\r\036#fm&\034W-\0238g_R\tq\n\005\003Q'R#V\"A)\013\005I3\025\001B;uS2L!!Q)\021\005UKfB\001,X\033\005q\024B\001-?\003\031\001&/\0323fM&\021\021J\027\006\0031zBq\001\030\001A\002\023\005Q,\001\004uS\016\\W\r^\013\002=B\031akX1\n\005\001t$AB(qi&|g\016\005\002ci:\0211-\035\b\003I:t!!Z6\017\005\031LW\"A4\013\005!d\021A\002\037s_>$h(C\001k\003\rqW\r^\005\003Y6\fa\"\\5oK\016\024\030M\032;g_J<WMC\001k\023\ty\007/\001\004d_6lwN\034\006\003Y6L!A]:\002#\031{'oZ3DQVt7.T1oC\036,'O\003\002pa&\021QO\036\002\007)&\0347.\032;\013\005I\034\bb\002=\001\001\004%\t!_\001\013i&\0347.\032;`I\025\fHC\001>~!\t160\003\002}}\t!QK\\5u\021\035qx/!AA\002y\0131\001\037\0232\021\035\t\t\001\001Q!\ny\013q\001^5dW\026$\b\005C\005\002\006\001\021\r\021\"\021\002\b\005I1-\0318Va\022\fG/Z\013\003\003\023\0012AVA\006\023\r\tiA\020\002\b\005>|G.Z1o\021!\t\t\002\001Q\001\n\005%\021AC2b]V\003H-\031;fA!9\021Q\003\001\005B\005]\021AB;qI\006$X\rF\001{\021\035\tY\002\001C\001\003;\t\001\"[:BGRLg/\032\013\007\003?\tY#a\017\021\013Y\013\t#!\n\n\007\005\rbHA\003BeJ\f\027\020E\002W\003OI1!!\013?\005\031\te.\037*fM\"A\021QFA\r\001\004\ty#A\004d_:$X\r\037;\021\t\005E\022qG\007\003\003gQ1!!\016\023\003\035i\027m\0315j]\026LA!!\017\0024\t91i\0348uKb$\b\002CA\037\0033\001\r!a\020\002\t\005\024xm\035\t\005\003c\t\t%\003\003\002D\005M\"!C!sOVlWM\034;tQ!\tI\"a\022\002N\005=\003\003BA\031\003\023JA!a\023\0024\tA1)\0317mE\006\0347.A\002e_\016\f#!!\025\002\017\032,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001:U\r^:!o\",G\017[3sAQDW\rI2ik:\\Gn\\1eKJ\004\023n\035\021dkJ\024XM\034;ms\002\n7\r^5wK:Bq!!\026\001\t\003\t9&A\005tKR\f5\r^5wKR1\021qDA-\0037B\001\"!\f\002T\001\007\021q\006\005\t\003{\t\031\0061\001\002@!B\0211KA$\003\033\ny&\t\002\002b\005Ag-\0368di&|g\016K3oC\ndW\r\032\036c_>dW-\0318*u\t|w\016\\3b]\002jS\006I#oC\ndWm\035\021pe\002\"\027n]1cY\026\034\b\005\0365fA\rDWO\\6m_\006$WM\035\027!e\026$XO\0358tAQ\024X/\032\021jM\002\n7\r^5wK\002\032\007.\0318hK\022Dq!!\032\001\t\003\n9'A\005p]\016{gN\\3diR\031!0!\033\t\0179\n\031\0071\001\002lA\031\001%!\034\n\007\005=\024E\001\003O_\022,\007bBA:\001\021\005\023QO\001\r_:$\025n]2p]:,7\r\036\013\004u\006]\004b\002\030\002r\001\007\0211\016\005\b\003w\002A\021IA?\003%yg.T3tg\006<W\rF\002{\003B\001\"!!\002z\001\007\0211Q\001\b[\026\0348/Y4f!\r\001\023QQ\005\004\003\017\013#aB'fgN\fw-\032\005\b\003+\002A\021BAF)\031\tI!!$\002\022\"A\021qRAE\001\004\tI!A\004f]\006\024G.\0323\t\025\005M\025\021\022I\001\002\004\tI!\001\buQJ|w/\0234CY>\0347.\0323\t\017\005]\005\001\"\003\002\b\005\021\022n\035#j[\026t7/[8o\0032dwn^3e\021\035\tY\n\001C\005\003;\013QB]3rk\026\034H\017V5dW\026$Hc\001>\002 \"Q\0211SAM!\003\005\r!!\003\t\023\005\r\006!%A\005\n\005\025\026aE:fi\006\033G/\033<fI\021,g-Y;mi\022\022TCAATU\021\tI!!+,\005\005-\006\003BAW\003ok!!a,\013\t\005E\0261W\001\nk:\034\007.Z2lK\022T1!!.?\003)\tgN\\8uCRLwN\\\005\005\003s\013yKA\tv]\016DWmY6fIZ\013'/[1oG\026D\021\"!0\001#\003%I!!*\002/I,\027/^3tiRK7m[3uI\021,g-Y;mi\022\n\004")
/*     */ public class UpgradeChunkloader extends ManagedEnvironment implements DeviceInfo {
/*     */   public EnvironmentHost host() {
/*  25 */     return this.host;
/*  26 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  27 */     .withComponent("chunkloader")
/*  28 */     .withConnector()
/*  29 */     .create(); private Map<String, String> deviceInfo;
/*     */   public ComponentConnector node() { return this.node; }
/*  31 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  32 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  33 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "World stabilizer");
/*  34 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  35 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Realizer9001-CL"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  38 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   
/*  40 */   private Option<ForgeChunkManager.Ticket> ticket = (Option<ForgeChunkManager.Ticket>)None$.MODULE$; public Option<ForgeChunkManager.Ticket> ticket() { return this.ticket; } public void ticket_$eq(Option<ForgeChunkManager.Ticket> x$1) { this.ticket = x$1; }
/*     */    private final boolean canUpdate = true; private volatile boolean bitmap$0; public boolean canUpdate() {
/*  42 */     return this.canUpdate;
/*     */   }
/*     */   
/*  45 */   public void update() { super.update();
/*  46 */     if (host().world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false && ticket().isDefined())
/*  47 */       if (node().tryChangeBuffer(-Settings$.MODULE$.get().chunkloaderCost() * Settings$.MODULE$.get().tickFrequency()))
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */         
/*  53 */         if (host() instanceof net.minecraft.entity.Entity)
/*  54 */           ChunkloaderUpgradeHandler$.MODULE$.updateLoadedChunk(this);  }
/*     */       else { ticket().foreach((Function1)new UpgradeChunkloader$$anonfun$update$1(this)); ticket_$eq((Option<ForgeChunkManager.Ticket>)None$.MODULE$); }
/*     */         } public final class UpgradeChunkloader$$anonfun$update$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(ForgeChunkManager.Ticket ticket) { try { ForgeChunkManager.releaseTicket(ticket); }
/*     */       finally {} } public UpgradeChunkloader$$anonfun$update$1(UpgradeChunkloader $outer) {} }
/*  59 */   @Callback(doc = "function():boolean -- Gets whether the chunkloader is currently active.") public Object[] isActive(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(ticket().isDefined()) })); }
/*     */    @Callback(doc = "function(enabled:boolean):boolean -- Enables or disables the chunkloader, returns true if active changed")
/*     */   public Object[] setActive(Context context, Arguments args) {
/*  62 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(setActive(args.checkBoolean(0), true)) }));
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
/*     */   public void onConnect(Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onConnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   5: aload_1
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   10: astore_2
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 23
/*     */     //   15: pop
/*     */     //   16: aload_2
/*     */     //   17: ifnull -> 30
/*     */     //   20: goto -> 426
/*     */     //   23: aload_2
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifeq -> 426
/*     */     //   30: getstatic li/cil/oc/common/event/ChunkloaderUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/ChunkloaderUpgradeHandler$;
/*     */     //   33: invokevirtual restoredTickets : ()Lscala/collection/mutable/Map;
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface address : ()Ljava/lang/String;
/*     */     //   42: invokeinterface remove : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   47: astore_3
/*     */     //   48: aload_3
/*     */     //   49: invokevirtual isDefined : ()Z
/*     */     //   52: ifeq -> 230
/*     */     //   55: aload_0
/*     */     //   56: invokespecial isDimensionAllowed : ()Z
/*     */     //   59: ifeq -> 217
/*     */     //   62: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   65: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   68: new scala/StringContext
/*     */     //   71: dup
/*     */     //   72: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   75: iconst_5
/*     */     //   76: anewarray java/lang/String
/*     */     //   79: dup
/*     */     //   80: iconst_0
/*     */     //   81: ldc_w 'Reclaiming chunk loader ticket at ('
/*     */     //   84: aastore
/*     */     //   85: dup
/*     */     //   86: iconst_1
/*     */     //   87: ldc_w ', '
/*     */     //   90: aastore
/*     */     //   91: dup
/*     */     //   92: iconst_2
/*     */     //   93: ldc_w ', '
/*     */     //   96: aastore
/*     */     //   97: dup
/*     */     //   98: iconst_3
/*     */     //   99: ldc_w ') in dimension '
/*     */     //   102: aastore
/*     */     //   103: dup
/*     */     //   104: iconst_4
/*     */     //   105: ldc_w '.'
/*     */     //   108: aastore
/*     */     //   109: checkcast [Ljava/lang/Object;
/*     */     //   112: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   115: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   118: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   121: iconst_4
/*     */     //   122: anewarray java/lang/Object
/*     */     //   125: dup
/*     */     //   126: iconst_0
/*     */     //   127: aload_0
/*     */     //   128: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   131: invokeinterface xPosition : ()D
/*     */     //   136: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   139: aastore
/*     */     //   140: dup
/*     */     //   141: iconst_1
/*     */     //   142: aload_0
/*     */     //   143: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   146: invokeinterface yPosition : ()D
/*     */     //   151: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   154: aastore
/*     */     //   155: dup
/*     */     //   156: iconst_2
/*     */     //   157: aload_0
/*     */     //   158: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   161: invokeinterface zPosition : ()D
/*     */     //   166: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   169: aastore
/*     */     //   170: dup
/*     */     //   171: iconst_3
/*     */     //   172: aload_0
/*     */     //   173: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   176: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   181: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
/*     */     //   184: getfield field_76574_g : I
/*     */     //   187: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   190: aastore
/*     */     //   191: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   194: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   197: invokeinterface info : (Ljava/lang/String;)V
/*     */     //   202: aload_0
/*     */     //   203: aload_3
/*     */     //   204: invokevirtual ticket_$eq : (Lscala/Option;)V
/*     */     //   207: getstatic li/cil/oc/common/event/ChunkloaderUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/ChunkloaderUpgradeHandler$;
/*     */     //   210: aload_0
/*     */     //   211: invokevirtual updateLoadedChunk : (Lli/cil/oc/server/component/UpgradeChunkloader;)V
/*     */     //   214: goto -> 426
/*     */     //   217: aload_3
/*     */     //   218: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   221: checkcast net/minecraftforge/common/ForgeChunkManager$Ticket
/*     */     //   224: invokestatic releaseTicket : (Lnet/minecraftforge/common/ForgeChunkManager$Ticket;)V
/*     */     //   227: goto -> 286
/*     */     //   230: aload_0
/*     */     //   231: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   234: astore #4
/*     */     //   236: aload #4
/*     */     //   238: instanceof li/cil/oc/api/machine/Context
/*     */     //   241: ifeq -> 277
/*     */     //   244: aload #4
/*     */     //   246: astore #5
/*     */     //   248: aload #5
/*     */     //   250: checkcast li/cil/oc/api/machine/Context
/*     */     //   253: invokeinterface isRunning : ()Z
/*     */     //   258: ifeq -> 277
/*     */     //   261: aload_0
/*     */     //   262: aload_0
/*     */     //   263: invokespecial requestTicket$default$1 : ()Z
/*     */     //   266: invokespecial requestTicket : (Z)V
/*     */     //   269: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   272: astore #6
/*     */     //   274: goto -> 426
/*     */     //   277: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   280: astore #6
/*     */     //   282: goto -> 426
/*     */     //   285: pop
/*     */     //   286: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   289: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   292: new scala/StringContext
/*     */     //   295: dup
/*     */     //   296: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   299: iconst_5
/*     */     //   300: anewarray java/lang/String
/*     */     //   303: dup
/*     */     //   304: iconst_0
/*     */     //   305: ldc_w 'Releasing chunk loader ticket at ('
/*     */     //   308: aastore
/*     */     //   309: dup
/*     */     //   310: iconst_1
/*     */     //   311: ldc_w ', '
/*     */     //   314: aastore
/*     */     //   315: dup
/*     */     //   316: iconst_2
/*     */     //   317: ldc_w ', '
/*     */     //   320: aastore
/*     */     //   321: dup
/*     */     //   322: iconst_3
/*     */     //   323: ldc_w ') in blacklisted dimension '
/*     */     //   326: aastore
/*     */     //   327: dup
/*     */     //   328: iconst_4
/*     */     //   329: ldc_w '.'
/*     */     //   332: aastore
/*     */     //   333: checkcast [Ljava/lang/Object;
/*     */     //   336: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   339: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   342: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   345: iconst_4
/*     */     //   346: anewarray java/lang/Object
/*     */     //   349: dup
/*     */     //   350: iconst_0
/*     */     //   351: aload_0
/*     */     //   352: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   355: invokeinterface xPosition : ()D
/*     */     //   360: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   363: aastore
/*     */     //   364: dup
/*     */     //   365: iconst_1
/*     */     //   366: aload_0
/*     */     //   367: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   370: invokeinterface yPosition : ()D
/*     */     //   375: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   378: aastore
/*     */     //   379: dup
/*     */     //   380: iconst_2
/*     */     //   381: aload_0
/*     */     //   382: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   385: invokeinterface zPosition : ()D
/*     */     //   390: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   393: aastore
/*     */     //   394: dup
/*     */     //   395: iconst_3
/*     */     //   396: aload_0
/*     */     //   397: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   400: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   405: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
/*     */     //   408: getfield field_76574_g : I
/*     */     //   411: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   414: aastore
/*     */     //   415: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   418: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   421: invokeinterface info : (Ljava/lang/String;)V
/*     */     //   426: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 0
/*     */     //   #66	-> 5
/*     */     //   #67	-> 30
/*     */     //   #68	-> 48
/*     */     //   #69	-> 55
/*     */     //   #75	-> 62
/*     */     //   #76	-> 202
/*     */     //   #77	-> 207
/*     */     //   #70	-> 217
/*     */     //   #79	-> 230
/*     */     //   #80	-> 236
/*     */     //   #81	-> 277
/*     */     //   #70	-> 285
/*     */     //   #73	-> 286
/*     */     //   #64	-> 426
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	427	0	this	Lli/cil/oc/server/component/UpgradeChunkloader;
/*     */     //   0	427	1	node	Lli/cil/oc/api/network/Node;
/*     */     //   48	379	3	restoredTicket	Lscala/Option;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   217	230	285	finally
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
/*     */   public void onDisconnect(Node node) {
/*  87 */     super.onDisconnect(node);
/*  88 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/*  89 */       { ticket().foreach((Function1)new UpgradeChunkloader$$anonfun$onDisconnect$1(this));
/*     */ 
/*     */         
/*  92 */         ticket_$eq((Option<ForgeChunkManager.Ticket>)None$.MODULE$); return; }  return; }  ticket().foreach((Function1)new UpgradeChunkloader$$anonfun$onDisconnect$1(this)); ticket_$eq((Option<ForgeChunkManager.Ticket>)None$.MODULE$);
/*     */   }
/*     */   public final class UpgradeChunkloader$$anonfun$onDisconnect$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(ForgeChunkManager.Ticket ticket) {
/*     */       try {
/*     */         ForgeChunkManager.releaseTicket(ticket);
/*     */       } finally {}
/*     */     }
/*     */     public UpgradeChunkloader$$anonfun$onDisconnect$1(UpgradeChunkloader $outer) {} }
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'computer.stopped'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 47
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 47
/*     */     //   34: aload_0
/*     */     //   35: iconst_0
/*     */     //   36: aload_0
/*     */     //   37: invokespecial setActive$default$2 : ()Z
/*     */     //   40: invokespecial setActive : (ZZ)Z
/*     */     //   43: pop
/*     */     //   44: goto -> 86
/*     */     //   47: aload_1
/*     */     //   48: invokeinterface name : ()Ljava/lang/String;
/*     */     //   53: ldc_w 'computer.started'
/*     */     //   56: astore_3
/*     */     //   57: dup
/*     */     //   58: ifnonnull -> 69
/*     */     //   61: pop
/*     */     //   62: aload_3
/*     */     //   63: ifnull -> 76
/*     */     //   66: goto -> 86
/*     */     //   69: aload_3
/*     */     //   70: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   73: ifeq -> 86
/*     */     //   76: aload_0
/*     */     //   77: iconst_1
/*     */     //   78: aload_0
/*     */     //   79: invokespecial setActive$default$2 : ()Z
/*     */     //   82: invokespecial setActive : (ZZ)Z
/*     */     //   85: pop
/*     */     //   86: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 0
/*     */     //   #98	-> 5
/*     */     //   #99	-> 34
/*     */     //   #101	-> 47
/*     */     //   #102	-> 76
/*     */     //   #96	-> 86
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	87	0	this	Lli/cil/oc/server/component/UpgradeChunkloader;
/*     */     //   0	87	1	message	Lli/cil/oc/api/network/Message;
/*     */   }
/*     */   private boolean setActive$default$2() {
/* 106 */     return false;
/*     */   } private boolean setActive(boolean enabled, boolean throwIfBlocked) {
/* 108 */     requestTicket(throwIfBlocked);
/*     */ 
/*     */ 
/*     */     
/* 112 */     ticket().foreach((Function1)new UpgradeChunkloader$$anonfun$setActive$1(this));
/*     */ 
/*     */     
/* 115 */     ticket_$eq((Option<ForgeChunkManager.Ticket>)None$.MODULE$);
/*     */     return (enabled && ticket().isEmpty()) ? ticket().isDefined() : ((!enabled && ticket().isDefined()));
/*     */   } public final class UpgradeChunkloader$$anonfun$setActive$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(ForgeChunkManager.Ticket ticket) {
/*     */       try {
/*     */         ForgeChunkManager.releaseTicket(ticket);
/*     */       } finally {}
/*     */     } public UpgradeChunkloader$$anonfun$setActive$1(UpgradeChunkloader $outer) {} }
/* 123 */   private boolean isDimensionAllowed() { int id = (host().world()).field_73011_w.field_76574_g;
/* 124 */     List whitelist = Settings$.MODULE$.get().chunkloadDimensionWhitelist();
/* 125 */     List blacklist = Settings$.MODULE$.get().chunkloadDimensionBlacklist();
/* 126 */     if (whitelist.isEmpty() || 
/* 127 */       whitelist.contains(BoxesRunTime.boxToInteger(id))) {
/*     */ 
/*     */       
/* 130 */       if (!blacklist.isEmpty() && 
/* 131 */         blacklist.contains(BoxesRunTime.boxToInteger(id))) {
/* 132 */         return false;
/*     */       }
/*     */       
/* 135 */       return true;
/*     */     } 
/*     */     return false; }
/* 138 */   private boolean requestTicket$default$1() { return false; } private void requestTicket(boolean throwIfBlocked) {
/* 139 */     if (isDimensionAllowed()) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       ticket_$eq(Option$.MODULE$.apply(ForgeChunkManager.requestTicket(OpenComputers$.MODULE$, host().world(), ForgeChunkManager.Type.NORMAL)));
/* 145 */       ChunkloaderUpgradeHandler$.MODULE$.updateLoadedChunk(this);
/*     */     } else if (throwIfBlocked) {
/*     */       throw new Exception("this dimension is blacklisted");
/*     */     } 
/*     */   }
/*     */   
/*     */   public UpgradeChunkloader(EnvironmentHost host) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeChunkloader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */