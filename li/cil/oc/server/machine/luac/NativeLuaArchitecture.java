/*     */ package li.cil.oc.server.machine.luac;
/*     */ 
/*     */ import java.util.IdentityHashMap;
/*     */ import li.cil.oc.OpenComputers$;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.driver.item.Memory;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.server.machine.Machine;
/*     */ import li.cil.oc.util.ExtendedLuaState;
/*     */ import li.cil.oc.util.ExtendedLuaState$;
/*     */ import li.cil.repack.com.naef.jnlua.LuaGcMetamethodException;
/*     */ import li.cil.repack.com.naef.jnlua.LuaRuntimeException;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function0;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Ug!B\001\003\003\003y!!\006(bi&4X\rT;b\003J\034\007.\033;fGR,(/\032\006\003\007\021\tA\001\\;bG*\021QAB\001\b[\006\034\007.\0338f\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\0211A\021\021CF\007\002%)\0211\003F\001\005Y\006twMC\001\026\003\021Q\027M^1\n\005]\021\"AB(cU\026\034G\017\005\002\032;5\t!D\003\002\0067)\021A\004C\001\004CBL\027B\001\020\033\0051\t%o\0315ji\026\034G/\036:f\021!)\001A!b\001\n\003\001S#A\021\021\005e\021\023BA\022\033\005\035i\025m\0315j]\026D\001\"\n\001\003\002\003\006I!I\001\t[\006\034\007.\0338fA!)q\005\001C\001Q\0051A(\0338jiz\"\"!K\026\021\005)\002Q\"\001\002\t\013\0251\003\031A\021\t\0135\002a\021\003\030\002\017\031\f7\r^8ssV\tq\006\005\002+a%\021\021G\001\002\020\031V\f7\013^1uK\032\0137\r^8ss\"A1\007\001a\001\n\003!A'A\002mk\006,\022!\016\t\003m}j\021a\016\006\003qe\nQA\0338mk\006T!AO\036\002\t9\fWM\032\006\003yu\n1aY8n\025\tq$\"\001\004sKB\f7m[\005\003\001^\022\001\002T;b'R\fG/\032\005\t\005\002\001\r\021\"\001\005\007\0069A.^1`I\025\fHC\001#K!\t)\005*D\001G\025\0059\025!B:dC2\f\027BA%G\005\021)f.\033;\t\017-\013\025\021!a\001k\005\031\001\020J\031\t\r5\003\001\025)\0036\003\021aW/\031\021\t\021=\003\001\031!C\001\tA\013Ab[3s]\026dW*Z7pef,\022!\025\t\003\013JK!a\025$\003\007%sG\017\003\005V\001\001\007I\021\001\003W\003AYWM\0358fY6+Wn\034:z?\022*\027\017\006\002E/\"91\nVA\001\002\004\t\006BB-\001A\003&\021+A\007lKJtW\r\\'f[>\024\030\020\t\005\t7\002\001\r\021\"\001\0059\006A!/Y7TG\006dW-F\001^!\t)e,\003\002`\r\n1Ai\\;cY\026D\001\"\031\001A\002\023\005AAY\001\re\006l7kY1mK~#S-\035\013\003\t\016Dqa\0231\002\002\003\007Q\f\003\004f\001\001\006K!X\001\ne\006l7kY1mK\002Bqa\032\001C\002\023%\001.A\006qKJ\034\030n\035;f]\016,W#A5\021\005)R\027BA6\003\0059\001VM]:jgR,gnY3B!&Ca!\034\001!\002\023I\027\001\0049feNL7\017^3oG\026\004\003bB8\001\005\004%I\001]\001\005CBL7/F\001r!\r)%\017^\005\003g\032\023Q!\021:sCf\004\"AK;\n\005Y\024!\001\004(bi&4X\rT;b\003BK\005B\002=\001A\003%\021/A\003ba&\034\b\005\003\004{\001\021\005Aa_\001\007S:4xn[3\025\005Ec\b\"B?z\001\004q\030!\0014\021\t\025{\0301A\005\004\003\0031%!\003$v]\016$\030n\03481!\021)%/!\002\021\007\025\0139!C\002\002\n\031\023a!\0218z%\0264\007\002CA\007\001\021\005A!a\004\002\033\021|7-^7f]R\fG/[8o)\r\t\026\021\003\005\b{\006-\001\031AA\n!\021)u0!\006\021\t\005]\021Q\004\b\004\013\006e\021bAA\016\r\0061\001K]3eK\032LA!a\b\002\"\t11\013\036:j]\036T1!a\007G\021\035\t)\003\001C!\003O\tQ\"[:J]&$\030.\0317ju\026$GCAA\025!\r)\0251F\005\004\003[1%a\002\"p_2,\027M\034\005\b\003c\001A\021IA\032\003=\021XmY8naV$X-T3n_JLH\003BA\025\003kA\001\"a\016\0020\001\007\021\021H\001\013G>l\007o\0348f]R\034\b#B\t\002<\005}\022bAA\037%\tA\021\n^3sC\ndW\r\005\003\002B\005=SBAA\"\025\021\t)%a\022\002\t%$X-\034\006\005\003\023\nY%A\005nS:,7M]1gi*\021\021QJ\001\004]\026$\030\002BA)\003\007\022\021\"\023;f[N#\030mY6\t\017\005U\003\001\"\003\002X\005iQ.Z7pefLeNQ=uKN$2!UA-\021!\t9$a\025A\002\005e\002bBA/\001\021\005\023qL\001\020eVt7+\0378dQJ|g.\033>fIR\tA\tC\004\002d\001!\t%!\032\002\027I,h\016\0265sK\006$W\r\032\013\005\003O\ni\007E\002\032\003SJ1!a\033\033\005=)\0050Z2vi&|gNU3tk2$\b\002CA8\003C\002\r!!\013\002)%\0348+\0378dQJ|g.\033>fIJ+G/\036:o\021\035\t\031\b\001C!\003?\n\001b\0348TS\036t\027\r\034\005\b\003o\002A\021IA\024\003)Ig.\033;jC2L'0\032\005\b\003w\002A\021IA0\003%ygnQ8o]\026\034G\017C\004\002\000\001!\t%a\030\002\013\rdwn]3\t\017\005\r\005\001\"\003\002\006\006)1\017^1uKV\021\021q\021\t\007\003\023\013\031*a&\016\005\005-%\002BAG\003\037\013q!\\;uC\ndWMC\002\002\022\032\013!bY8mY\026\034G/[8o\023\021\t)*a#\003\013M#\030mY6\021\t\005e\025\021\026\b\005\0037\013\031K\004\003\002\036\006}U\"\001\003\n\007\005\005F!A\004NC\016D\027N\\3\n\t\005\025\026qU\001\006'R\fG/\032\006\004\003C#\021\002BAV\003[\023QAV1mk\026L1!a,G\005-)e.^7fe\006$\030n\0348)\t\005\005\0251\027\t\004#\005U\026bAA\\%\tQA)\0329sK\016\fG/\0323\t\017\005m\006\001\"\021\002>\006!An\\1e)\r!\025q\030\005\t\003\003\fI\f1\001\002D\006\031aN\031;\021\t\005\025\027\021Z\007\003\003\017TA!!1\002H%!\0211ZAd\0059q%\t\026+bO\016{W\016]8v]\022Dq!a4\001\t\003\n\t.\001\003tCZ,Gc\001#\002T\"A\021\021YAg\001\004\t\031\r")
/*     */ public abstract class NativeLuaArchitecture implements Architecture {
/*     */   private final Machine machine;
/*     */   private LuaState lua;
/*     */   private int kernelMemory;
/*     */   private double ramScale;
/*     */   private final PersistenceAPI persistence;
/*     */   private final NativeLuaAPI[] apis;
/*     */   
/*  38 */   public Machine machine() { return this.machine; }
/*     */   public LuaState lua() { return this.lua; }
/*     */   public void lua_$eq(LuaState x$1) { this.lua = x$1; }
/*  41 */   public int kernelMemory() { return this.kernelMemory; } public void kernelMemory_$eq(int x$1) { this.kernelMemory = x$1; } public double ramScale() { return this.ramScale; } public NativeLuaArchitecture(Machine machine) { this.lua = null;
/*     */     
/*  43 */     this.kernelMemory = 0;
/*     */     
/*  45 */     this.ramScale = 1.0D;
/*     */     
/*  47 */     this.persistence = new PersistenceAPI(this);
/*     */     
/*  49 */     (new NativeLuaAPI[7])[0] = 
/*  50 */       new ComponentAPI(this);
/*  51 */     (new NativeLuaAPI[7])[1] = new ComputerAPI(this);
/*  52 */     (new NativeLuaAPI[7])[2] = new OSAPI(this);
/*  53 */     (new NativeLuaAPI[7])[3] = new SystemAPI(this);
/*  54 */     (new NativeLuaAPI[7])[4] = new UnicodeAPI(this);
/*  55 */     (new NativeLuaAPI[7])[5] = new UserdataAPI(this);
/*     */     
/*  57 */     (new NativeLuaAPI[7])[6] = persistence();
/*     */     this.apis = new NativeLuaAPI[7]; }
/*     */   public void ramScale_$eq(double x$1) { this.ramScale = x$1; }
/*     */   private PersistenceAPI persistence() { return this.persistence; } private NativeLuaAPI[] apis() { return this.apis; } public int invoke(Function0 f) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface apply : ()Ljava/lang/Object;
/*     */     //   6: checkcast [Ljava/lang/Object;
/*     */     //   9: astore #9
/*     */     //   11: aload #9
/*     */     //   13: ifnull -> 59
/*     */     //   16: aload #9
/*     */     //   18: astore #10
/*     */     //   20: aload_0
/*     */     //   21: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   24: iconst_1
/*     */     //   25: invokevirtual pushBoolean : (Z)V
/*     */     //   28: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   31: aload #10
/*     */     //   33: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   36: new li/cil/oc/server/machine/luac/NativeLuaArchitecture$$anonfun$invoke$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: invokespecial <init> : (Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;)V
/*     */     //   44: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   49: iconst_1
/*     */     //   50: aload #10
/*     */     //   52: arraylength
/*     */     //   53: iadd
/*     */     //   54: istore #11
/*     */     //   56: goto -> 70
/*     */     //   59: aload_0
/*     */     //   60: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   63: iconst_1
/*     */     //   64: invokevirtual pushBoolean : (Z)V
/*     */     //   67: iconst_1
/*     */     //   68: istore #11
/*     */     //   70: iload #11
/*     */     //   72: goto -> 567
/*     */     //   75: astore_2
/*     */     //   76: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   79: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   82: invokevirtual logLuaCallbackErrors : ()Z
/*     */     //   85: ifeq -> 109
/*     */     //   88: aload_2
/*     */     //   89: instanceof li/cil/oc/api/machine/LimitReachedException
/*     */     //   92: ifne -> 109
/*     */     //   95: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   98: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   101: ldc 'Exception in Lua callback.'
/*     */     //   103: aload_2
/*     */     //   104: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   109: iconst_0
/*     */     //   110: istore_3
/*     */     //   111: aconst_null
/*     */     //   112: astore #4
/*     */     //   114: aload_2
/*     */     //   115: astore #5
/*     */     //   117: aload #5
/*     */     //   119: instanceof li/cil/oc/api/machine/LimitReachedException
/*     */     //   122: ifeq -> 131
/*     */     //   125: iconst_0
/*     */     //   126: istore #6
/*     */     //   128: goto -> 565
/*     */     //   131: aload #5
/*     */     //   133: instanceof java/lang/IllegalArgumentException
/*     */     //   136: ifeq -> 182
/*     */     //   139: iconst_1
/*     */     //   140: istore_3
/*     */     //   141: aload #5
/*     */     //   143: checkcast java/lang/IllegalArgumentException
/*     */     //   146: astore #4
/*     */     //   148: aload #4
/*     */     //   150: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   153: ifnull -> 182
/*     */     //   156: aload_0
/*     */     //   157: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   160: iconst_0
/*     */     //   161: invokevirtual pushBoolean : (Z)V
/*     */     //   164: aload_0
/*     */     //   165: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   168: aload #4
/*     */     //   170: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   173: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   176: iconst_2
/*     */     //   177: istore #6
/*     */     //   179: goto -> 565
/*     */     //   182: aload #5
/*     */     //   184: ifnull -> 280
/*     */     //   187: aload #5
/*     */     //   189: astore #7
/*     */     //   191: aload #7
/*     */     //   193: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   196: ifnull -> 280
/*     */     //   199: aload_0
/*     */     //   200: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   203: iconst_1
/*     */     //   204: invokevirtual pushBoolean : (Z)V
/*     */     //   207: aload_0
/*     */     //   208: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   211: invokevirtual pushNil : ()V
/*     */     //   214: aload_0
/*     */     //   215: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   218: aload #7
/*     */     //   220: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   223: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   226: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   229: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   232: invokevirtual logLuaCallbackErrors : ()Z
/*     */     //   235: ifeq -> 274
/*     */     //   238: aload_0
/*     */     //   239: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   242: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   245: aload #7
/*     */     //   247: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
/*     */     //   250: checkcast [Ljava/lang/Object;
/*     */     //   253: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   256: ldc ''
/*     */     //   258: ldc '\\n'
/*     */     //   260: ldc '\\n'
/*     */     //   262: invokeinterface mkString : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   267: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   270: iconst_4
/*     */     //   271: goto -> 275
/*     */     //   274: iconst_3
/*     */     //   275: istore #6
/*     */     //   277: goto -> 565
/*     */     //   280: aload #5
/*     */     //   282: instanceof java/lang/IndexOutOfBoundsException
/*     */     //   285: ifeq -> 311
/*     */     //   288: aload_0
/*     */     //   289: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   292: iconst_0
/*     */     //   293: invokevirtual pushBoolean : (Z)V
/*     */     //   296: aload_0
/*     */     //   297: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   300: ldc 'index out of bounds'
/*     */     //   302: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   305: iconst_2
/*     */     //   306: istore #6
/*     */     //   308: goto -> 565
/*     */     //   311: iload_3
/*     */     //   312: ifeq -> 338
/*     */     //   315: aload_0
/*     */     //   316: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   319: iconst_0
/*     */     //   320: invokevirtual pushBoolean : (Z)V
/*     */     //   323: aload_0
/*     */     //   324: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   327: ldc 'bad argument'
/*     */     //   329: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   332: iconst_2
/*     */     //   333: istore #6
/*     */     //   335: goto -> 565
/*     */     //   338: aload #5
/*     */     //   340: instanceof java/lang/NoSuchMethodException
/*     */     //   343: ifeq -> 369
/*     */     //   346: aload_0
/*     */     //   347: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   350: iconst_0
/*     */     //   351: invokevirtual pushBoolean : (Z)V
/*     */     //   354: aload_0
/*     */     //   355: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   358: ldc 'no such method'
/*     */     //   360: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   363: iconst_2
/*     */     //   364: istore #6
/*     */     //   366: goto -> 565
/*     */     //   369: aload #5
/*     */     //   371: instanceof java/io/FileNotFoundException
/*     */     //   374: ifeq -> 407
/*     */     //   377: aload_0
/*     */     //   378: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   381: iconst_1
/*     */     //   382: invokevirtual pushBoolean : (Z)V
/*     */     //   385: aload_0
/*     */     //   386: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   389: invokevirtual pushNil : ()V
/*     */     //   392: aload_0
/*     */     //   393: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   396: ldc 'file not found'
/*     */     //   398: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   401: iconst_3
/*     */     //   402: istore #6
/*     */     //   404: goto -> 565
/*     */     //   407: aload #5
/*     */     //   409: instanceof java/lang/SecurityException
/*     */     //   412: ifeq -> 445
/*     */     //   415: aload_0
/*     */     //   416: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   419: iconst_1
/*     */     //   420: invokevirtual pushBoolean : (Z)V
/*     */     //   423: aload_0
/*     */     //   424: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   427: invokevirtual pushNil : ()V
/*     */     //   430: aload_0
/*     */     //   431: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   434: ldc 'access denied'
/*     */     //   436: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   439: iconst_3
/*     */     //   440: istore #6
/*     */     //   442: goto -> 565
/*     */     //   445: aload #5
/*     */     //   447: instanceof java/io/IOException
/*     */     //   450: ifeq -> 483
/*     */     //   453: aload_0
/*     */     //   454: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   457: iconst_1
/*     */     //   458: invokevirtual pushBoolean : (Z)V
/*     */     //   461: aload_0
/*     */     //   462: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   465: invokevirtual pushNil : ()V
/*     */     //   468: aload_0
/*     */     //   469: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   472: ldc 'i/o error'
/*     */     //   474: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   477: iconst_3
/*     */     //   478: istore #6
/*     */     //   480: goto -> 565
/*     */     //   483: aload #5
/*     */     //   485: instanceof java/lang/UnsupportedOperationException
/*     */     //   488: ifeq -> 514
/*     */     //   491: aload_0
/*     */     //   492: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   495: iconst_0
/*     */     //   496: invokevirtual pushBoolean : (Z)V
/*     */     //   499: aload_0
/*     */     //   500: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   503: ldc 'unsupported operation'
/*     */     //   505: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   508: iconst_2
/*     */     //   509: istore #6
/*     */     //   511: goto -> 565
/*     */     //   514: aload #5
/*     */     //   516: ifnull -> 568
/*     */     //   519: aload #5
/*     */     //   521: astore #8
/*     */     //   523: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   526: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   529: ldc 'Unexpected error in Lua callback.'
/*     */     //   531: aload #8
/*     */     //   533: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   538: aload_0
/*     */     //   539: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   542: iconst_1
/*     */     //   543: invokevirtual pushBoolean : (Z)V
/*     */     //   546: aload_0
/*     */     //   547: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   550: invokevirtual pushNil : ()V
/*     */     //   553: aload_0
/*     */     //   554: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   557: ldc 'unknown error'
/*     */     //   559: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   562: iconst_3
/*     */     //   563: istore #6
/*     */     //   565: iload #6
/*     */     //   567: ireturn
/*     */     //   568: new scala/MatchError
/*     */     //   571: dup
/*     */     //   572: aload #5
/*     */     //   574: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   577: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #61	-> 11
/*     */     //   #62	-> 20
/*     */     //   #63	-> 28
/*     */     //   #64	-> 49
/*     */     //   #61	-> 54
/*     */     //   #66	-> 59
/*     */     //   #67	-> 67
/*     */     //   #65	-> 68
/*     */     //   #60	-> 70
/*     */     //   #71	-> 75
/*     */     //   #59	-> 75
/*     */     //   #72	-> 76
/*     */     //   #73	-> 95
/*     */     //   #78	-> 109
/*     */     //   #75	-> 114
/*     */     //   #76	-> 117
/*     */     //   #77	-> 125
/*     */     //   #78	-> 131
/*     */     //   #79	-> 156
/*     */     //   #80	-> 164
/*     */     //   #81	-> 176
/*     */     //   #78	-> 177
/*     */     //   #82	-> 182
/*     */     //   #83	-> 199
/*     */     //   #84	-> 207
/*     */     //   #85	-> 214
/*     */     //   #86	-> 226
/*     */     //   #87	-> 238
/*     */     //   #88	-> 270
/*     */     //   #90	-> 274
/*     */     //   #82	-> 275
/*     */     //   #91	-> 280
/*     */     //   #92	-> 288
/*     */     //   #93	-> 296
/*     */     //   #94	-> 305
/*     */     //   #91	-> 306
/*     */     //   #75	-> 311
/*     */     //   #96	-> 315
/*     */     //   #97	-> 323
/*     */     //   #98	-> 332
/*     */     //   #95	-> 333
/*     */     //   #99	-> 338
/*     */     //   #100	-> 346
/*     */     //   #101	-> 354
/*     */     //   #102	-> 363
/*     */     //   #99	-> 364
/*     */     //   #103	-> 369
/*     */     //   #104	-> 377
/*     */     //   #105	-> 385
/*     */     //   #106	-> 392
/*     */     //   #107	-> 401
/*     */     //   #103	-> 402
/*     */     //   #108	-> 407
/*     */     //   #109	-> 415
/*     */     //   #110	-> 423
/*     */     //   #111	-> 430
/*     */     //   #112	-> 439
/*     */     //   #108	-> 440
/*     */     //   #113	-> 445
/*     */     //   #114	-> 453
/*     */     //   #115	-> 461
/*     */     //   #116	-> 468
/*     */     //   #117	-> 477
/*     */     //   #113	-> 478
/*     */     //   #118	-> 483
/*     */     //   #119	-> 491
/*     */     //   #120	-> 499
/*     */     //   #121	-> 508
/*     */     //   #118	-> 509
/*     */     //   #122	-> 514
/*     */     //   #123	-> 523
/*     */     //   #124	-> 538
/*     */     //   #125	-> 546
/*     */     //   #126	-> 553
/*     */     //   #127	-> 562
/*     */     //   #122	-> 563
/*     */     //   #75	-> 565
/*     */     //   #59	-> 567
/*     */     //   #75	-> 568
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	578	0	this	Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;
/*     */     //   0	578	1	f	Lscala/Function0;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	75	75	finally } public final class NativeLuaArchitecture$$anonfun$invoke$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable
/*     */   {
/*     */     public final void apply(Object result) {
/*  63 */       ExtendedLuaState.ExtendedLuaState qual$1 = ExtendedLuaState$.MODULE$.extendLuaState(this.$outer.lua()); Object x$2 = result; IdentityHashMap x$3 = qual$1.pushValue$default$2(); qual$1.pushValue(x$2, x$3);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
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
/*     */     
/*     */     public NativeLuaArchitecture$$anonfun$invoke$1(NativeLuaArchitecture $outer) {}
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
/*     */   public int documentation(Function0 f) {
/*     */     try {
/* 132 */       String doc = (String)f.apply();
/* 133 */       if (Strings.isNullOrEmpty(doc)) { lua().pushNil(); }
/* 134 */       else { lua().pushString(doc); }
/*     */     
/*     */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */     
/*     */     } finally {
/*     */       Exception exception = null;
/*     */ 
/*     */ 
/*     */       
/* 143 */       lua().pushNil();
/*     */     } 
/* 145 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInitialized() {
/* 150 */     return (kernelMemory() > 0);
/*     */   }
/*     */   
/*     */   public boolean recomputeMemory(Iterable components) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial memoryInBytes : (Ljava/lang/Iterable;)I
/*     */     //   5: istore_2
/*     */     //   6: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   9: aload_0
/*     */     //   10: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   13: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   16: astore_3
/*     */     //   17: aload_3
/*     */     //   18: instanceof scala/Some
/*     */     //   21: ifeq -> 106
/*     */     //   24: aload_3
/*     */     //   25: checkcast scala/Some
/*     */     //   28: astore #4
/*     */     //   30: aload #4
/*     */     //   32: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   35: checkcast li/cil/repack/com/naef/jnlua/LuaState
/*     */     //   38: astore #5
/*     */     //   40: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   43: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   46: invokevirtual limitMemory : ()Z
/*     */     //   49: ifeq -> 106
/*     */     //   52: aload #5
/*     */     //   54: ldc_w 2147483647
/*     */     //   57: invokevirtual setTotalMemory : (I)V
/*     */     //   60: aload_0
/*     */     //   61: invokevirtual kernelMemory : ()I
/*     */     //   64: iconst_0
/*     */     //   65: if_icmple -> 98
/*     */     //   68: aload #5
/*     */     //   70: aload_0
/*     */     //   71: invokevirtual kernelMemory : ()I
/*     */     //   74: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   77: iload_2
/*     */     //   78: i2d
/*     */     //   79: aload_0
/*     */     //   80: invokevirtual ramScale : ()D
/*     */     //   83: dmul
/*     */     //   84: invokevirtual ceil : (D)D
/*     */     //   87: d2i
/*     */     //   88: iadd
/*     */     //   89: invokevirtual setTotalMemory : (I)V
/*     */     //   92: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   95: goto -> 101
/*     */     //   98: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   101: astore #6
/*     */     //   103: goto -> 111
/*     */     //   106: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   109: astore #6
/*     */     //   111: iload_2
/*     */     //   112: iconst_0
/*     */     //   113: if_icmple -> 120
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 121
/*     */     //   120: iconst_0
/*     */     //   121: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 0
/*     */     //   #154	-> 6
/*     */     //   #155	-> 17
/*     */     //   #156	-> 52
/*     */     //   #157	-> 60
/*     */     //   #158	-> 68
/*     */     //   #157	-> 98
/*     */     //   #155	-> 101
/*     */     //   #160	-> 106
/*     */     //   #162	-> 111
/*     */     //   #152	-> 121
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	122	0	this	Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;
/*     */     //   0	122	1	components	Ljava/lang/Iterable;
/*     */     //   6	116	2	memoryBytes	I
/*     */     //   40	82	5	l	Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */   }
/*     */   
/*     */   public final class NativeLuaArchitecture$$anonfun$memoryInBytes$1
/*     */     extends AbstractFunction2<Object, ItemStack, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final double apply(double acc, ItemStack stack)
/*     */     {
/* 165 */       Option option = Option$.MODULE$.apply(Driver.driverFor(stack));
/* 166 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof Memory) { Memory memory = (Memory)driver; double d1 = memory.amount(stack) * 'Ѐ'; return acc + d1; }  }
/* 167 */        double d = 0.0D;
/* 168 */       return acc + d; } public NativeLuaArchitecture$$anonfun$memoryInBytes$1(NativeLuaArchitecture $outer) {} } private int memoryInBytes(Iterable components) { return RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper((int)BoxesRunTime.unboxToDouble(WrapAsScala$.MODULE$.iterableAsScalaIterable(components).foldLeft(BoxesRunTime.boxToDouble(0.0D), (Function2)new NativeLuaArchitecture$$anonfun$memoryInBytes$1(this)))), 0)), Settings$.MODULE$.get().maxTotalRam()); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void runSynchronized() {
/* 174 */     Predef$.MODULE$.assert((lua().getTop() == 2));
/* 175 */     Predef$.MODULE$.assert(lua().isThread(1));
/* 176 */     Predef$.MODULE$.assert(lua().isFunction(2));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 182 */       lua().call(0, 1);
/* 183 */       lua().checkType(2, LuaType.TABLE);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } catch (LuaMemoryAllocationException luaMemoryAllocationException) {
/* 190 */       throw new OutOfMemoryError("not enough memory");
/*     */     } 
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
/*     */   public ExecutionResult runThreaded(boolean isSynchronizedReturn) {
/*     */     // Byte code:
/*     */     //   0: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   3: aload_0
/*     */     //   4: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   7: iconst_1
/*     */     //   8: invokevirtual isThread : (I)Z
/*     */     //   11: invokevirtual assert : (Z)V
/*     */     //   14: iload_1
/*     */     //   15: ifeq -> 66
/*     */     //   18: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   21: aload_0
/*     */     //   22: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   25: invokevirtual getTop : ()I
/*     */     //   28: iconst_2
/*     */     //   29: if_icmpne -> 36
/*     */     //   32: iconst_1
/*     */     //   33: goto -> 37
/*     */     //   36: iconst_0
/*     */     //   37: invokevirtual assert : (Z)V
/*     */     //   40: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   43: aload_0
/*     */     //   44: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   47: iconst_2
/*     */     //   48: invokevirtual isTable : (I)Z
/*     */     //   51: invokevirtual assert : (Z)V
/*     */     //   54: aload_0
/*     */     //   55: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   58: iconst_1
/*     */     //   59: iconst_1
/*     */     //   60: invokevirtual resume : (II)I
/*     */     //   63: goto -> 252
/*     */     //   66: aload_0
/*     */     //   67: invokevirtual kernelMemory : ()I
/*     */     //   70: iconst_0
/*     */     //   71: if_icmpne -> 160
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   78: iconst_1
/*     */     //   79: iconst_0
/*     */     //   80: invokevirtual resume : (II)I
/*     */     //   83: iconst_0
/*     */     //   84: if_icmple -> 91
/*     */     //   87: iconst_0
/*     */     //   88: goto -> 252
/*     */     //   91: aload_0
/*     */     //   92: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   95: getstatic li/cil/repack/com/naef/jnlua/LuaState$GcAction.COLLECT : Lli/cil/repack/com/naef/jnlua/LuaState$GcAction;
/*     */     //   98: iconst_0
/*     */     //   99: invokevirtual gc : (Lli/cil/repack/com/naef/jnlua/LuaState$GcAction;I)I
/*     */     //   102: pop
/*     */     //   103: aload_0
/*     */     //   104: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   107: aload_0
/*     */     //   108: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   111: invokevirtual getTotalMemory : ()I
/*     */     //   114: aload_0
/*     */     //   115: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   118: invokevirtual getFreeMemory : ()I
/*     */     //   121: isub
/*     */     //   122: iconst_1
/*     */     //   123: invokevirtual max : (II)I
/*     */     //   126: invokevirtual kernelMemory_$eq : (I)V
/*     */     //   129: aload_0
/*     */     //   130: aload_0
/*     */     //   131: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   134: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*     */     //   139: invokeinterface internalComponents : ()Ljava/lang/Iterable;
/*     */     //   144: invokevirtual recomputeMemory : (Ljava/lang/Iterable;)Z
/*     */     //   147: pop
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   152: lconst_0
/*     */     //   153: invokevirtual pushInteger : (J)V
/*     */     //   156: iconst_1
/*     */     //   157: goto -> 252
/*     */     //   160: aload_0
/*     */     //   161: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   164: invokeinterface popSignal : ()Lli/cil/oc/api/machine/Signal;
/*     */     //   169: astore #10
/*     */     //   171: aload #10
/*     */     //   173: ifnonnull -> 190
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   180: iconst_1
/*     */     //   181: iconst_0
/*     */     //   182: invokevirtual resume : (II)I
/*     */     //   185: istore #11
/*     */     //   187: goto -> 250
/*     */     //   190: aload_0
/*     */     //   191: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   194: aload #10
/*     */     //   196: invokeinterface name : ()Ljava/lang/String;
/*     */     //   201: invokevirtual pushString : (Ljava/lang/String;)V
/*     */     //   204: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   207: aload #10
/*     */     //   209: invokeinterface args : ()[Ljava/lang/Object;
/*     */     //   214: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   217: new li/cil/oc/server/machine/luac/NativeLuaArchitecture$$anonfun$1
/*     */     //   220: dup
/*     */     //   221: aload_0
/*     */     //   222: invokespecial <init> : (Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;)V
/*     */     //   225: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   230: aload_0
/*     */     //   231: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   234: iconst_1
/*     */     //   235: iconst_1
/*     */     //   236: aload #10
/*     */     //   238: invokeinterface args : ()[Ljava/lang/Object;
/*     */     //   243: arraylength
/*     */     //   244: iadd
/*     */     //   245: invokevirtual resume : (II)I
/*     */     //   248: istore #11
/*     */     //   250: iload #11
/*     */     //   252: istore #9
/*     */     //   254: aload_0
/*     */     //   255: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   258: iconst_1
/*     */     //   259: invokevirtual status : (I)I
/*     */     //   262: iconst_1
/*     */     //   263: if_icmpne -> 387
/*     */     //   266: iload #9
/*     */     //   268: iconst_1
/*     */     //   269: if_icmpne -> 293
/*     */     //   272: aload_0
/*     */     //   273: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   276: iconst_2
/*     */     //   277: invokevirtual isFunction : (I)Z
/*     */     //   280: ifeq -> 293
/*     */     //   283: new li/cil/oc/api/machine/ExecutionResult$SynchronizedCall
/*     */     //   286: dup
/*     */     //   287: invokespecial <init> : ()V
/*     */     //   290: goto -> 817
/*     */     //   293: iload #9
/*     */     //   295: iconst_1
/*     */     //   296: if_icmpne -> 328
/*     */     //   299: aload_0
/*     */     //   300: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   303: iconst_2
/*     */     //   304: invokevirtual isBoolean : (I)Z
/*     */     //   307: ifeq -> 328
/*     */     //   310: new li/cil/oc/api/machine/ExecutionResult$Shutdown
/*     */     //   313: dup
/*     */     //   314: aload_0
/*     */     //   315: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   318: iconst_2
/*     */     //   319: invokevirtual toBoolean : (I)Z
/*     */     //   322: invokespecial <init> : (Z)V
/*     */     //   325: goto -> 817
/*     */     //   328: iload #9
/*     */     //   330: iconst_1
/*     */     //   331: if_icmpne -> 361
/*     */     //   334: aload_0
/*     */     //   335: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   338: iconst_2
/*     */     //   339: invokevirtual isNumber : (I)Z
/*     */     //   342: ifeq -> 361
/*     */     //   345: aload_0
/*     */     //   346: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   349: iconst_2
/*     */     //   350: invokevirtual toNumber : (I)D
/*     */     //   353: bipush #20
/*     */     //   355: i2d
/*     */     //   356: dmul
/*     */     //   357: d2i
/*     */     //   358: goto -> 364
/*     */     //   361: ldc_w 2147483647
/*     */     //   364: istore #12
/*     */     //   366: aload_0
/*     */     //   367: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   370: iload #9
/*     */     //   372: invokevirtual pop : (I)V
/*     */     //   375: new li/cil/oc/api/machine/ExecutionResult$Sleep
/*     */     //   378: dup
/*     */     //   379: iload #12
/*     */     //   381: invokespecial <init> : (I)V
/*     */     //   384: goto -> 817
/*     */     //   387: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   390: aload_0
/*     */     //   391: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   394: iconst_1
/*     */     //   395: invokevirtual isThread : (I)Z
/*     */     //   398: invokevirtual assert : (Z)V
/*     */     //   401: aload_0
/*     */     //   402: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   405: iconst_2
/*     */     //   406: invokevirtual isBoolean : (I)Z
/*     */     //   409: ifeq -> 434
/*     */     //   412: aload_0
/*     */     //   413: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   416: iconst_3
/*     */     //   417: invokevirtual isString : (I)Z
/*     */     //   420: ifne -> 448
/*     */     //   423: aload_0
/*     */     //   424: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   427: iconst_3
/*     */     //   428: invokevirtual isNoneOrNil : (I)Z
/*     */     //   431: ifne -> 448
/*     */     //   434: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   437: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   440: ldc_w 'Kernel returned unexpected results.'
/*     */     //   443: invokeinterface warn : (Ljava/lang/String;)V
/*     */     //   448: aload_0
/*     */     //   449: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   452: iconst_2
/*     */     //   453: invokevirtual toBoolean : (I)Z
/*     */     //   456: ifeq -> 484
/*     */     //   459: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   462: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   465: ldc_w 'Kernel stopped unexpectedly.'
/*     */     //   468: invokeinterface warn : (Ljava/lang/String;)V
/*     */     //   473: new li/cil/oc/api/machine/ExecutionResult$Shutdown
/*     */     //   476: dup
/*     */     //   477: iconst_0
/*     */     //   478: invokespecial <init> : (Z)V
/*     */     //   481: goto -> 817
/*     */     //   484: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   487: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   490: invokevirtual limitMemory : ()Z
/*     */     //   493: ifeq -> 506
/*     */     //   496: aload_0
/*     */     //   497: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   500: ldc_w 2147483647
/*     */     //   503: invokevirtual setTotalMemory : (I)V
/*     */     //   506: aload_0
/*     */     //   507: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   510: iconst_3
/*     */     //   511: invokevirtual isJavaObjectRaw : (I)Z
/*     */     //   514: ifeq -> 531
/*     */     //   517: aload_0
/*     */     //   518: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   521: iconst_3
/*     */     //   522: invokevirtual toJavaObjectRaw : (I)Ljava/lang/Object;
/*     */     //   525: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   528: goto -> 539
/*     */     //   531: aload_0
/*     */     //   532: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   535: iconst_3
/*     */     //   536: invokevirtual toString : (I)Ljava/lang/String;
/*     */     //   539: astore #13
/*     */     //   541: aload #13
/*     */     //   543: ifnonnull -> 558
/*     */     //   546: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   549: dup
/*     */     //   550: ldc 'unknown error'
/*     */     //   552: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   555: goto -> 817
/*     */     //   558: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   561: dup
/*     */     //   562: aload #13
/*     */     //   564: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   567: goto -> 817
/*     */     //   570: astore_2
/*     */     //   571: aload_2
/*     */     //   572: astore_3
/*     */     //   573: aload_3
/*     */     //   574: instanceof li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */     //   577: ifeq -> 667
/*     */     //   580: aload_3
/*     */     //   581: checkcast li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */     //   584: astore #4
/*     */     //   586: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   589: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   592: new scala/collection/mutable/StringBuilder
/*     */     //   595: dup
/*     */     //   596: invokespecial <init> : ()V
/*     */     //   599: ldc_w 'Kernel crashed. This is a bug!\\n'
/*     */     //   602: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   605: aload #4
/*     */     //   607: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   610: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   613: ldc_w '\\tat '
/*     */     //   616: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   619: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   622: aload #4
/*     */     //   624: invokevirtual getLuaStackTrace : ()[Lli/cil/repack/com/naef/jnlua/LuaStackTraceElement;
/*     */     //   627: checkcast [Ljava/lang/Object;
/*     */     //   630: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   633: ldc_w '\\n\\tat '
/*     */     //   636: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   641: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   644: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   647: invokeinterface warn : (Ljava/lang/String;)V
/*     */     //   652: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   655: dup
/*     */     //   656: ldc_w 'kernel panic: this is a bug, check your log file and report it'
/*     */     //   659: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   662: astore #5
/*     */     //   664: goto -> 815
/*     */     //   667: aload_3
/*     */     //   668: instanceof li/cil/repack/com/naef/jnlua/LuaGcMetamethodException
/*     */     //   671: ifeq -> 737
/*     */     //   674: aload_3
/*     */     //   675: checkcast li/cil/repack/com/naef/jnlua/LuaGcMetamethodException
/*     */     //   678: astore #6
/*     */     //   680: aload #6
/*     */     //   682: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   685: ifnonnull -> 701
/*     */     //   688: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   691: dup
/*     */     //   692: ldc_w 'kernel panic:\\nerror in garbage collection metamethod'
/*     */     //   695: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   698: goto -> 732
/*     */     //   701: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   704: dup
/*     */     //   705: new scala/collection/mutable/StringBuilder
/*     */     //   708: dup
/*     */     //   709: invokespecial <init> : ()V
/*     */     //   712: ldc_w 'kernel panic:\\n'
/*     */     //   715: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   718: aload #6
/*     */     //   720: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   723: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   726: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   729: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   732: astore #5
/*     */     //   734: goto -> 815
/*     */     //   737: aload_3
/*     */     //   738: instanceof li/cil/repack/com/naef/jnlua/LuaMemoryAllocationException
/*     */     //   741: ifeq -> 759
/*     */     //   744: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   747: dup
/*     */     //   748: ldc_w 'not enough memory'
/*     */     //   751: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   754: astore #5
/*     */     //   756: goto -> 815
/*     */     //   759: aload_3
/*     */     //   760: instanceof java/lang/Error
/*     */     //   763: ifeq -> 818
/*     */     //   766: aload_3
/*     */     //   767: checkcast java/lang/Error
/*     */     //   770: astore #7
/*     */     //   772: aload #7
/*     */     //   774: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   777: ldc_w 'not enough memory'
/*     */     //   780: astore #8
/*     */     //   782: dup
/*     */     //   783: ifnonnull -> 795
/*     */     //   786: pop
/*     */     //   787: aload #8
/*     */     //   789: ifnull -> 803
/*     */     //   792: goto -> 818
/*     */     //   795: aload #8
/*     */     //   797: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   800: ifeq -> 818
/*     */     //   803: new li/cil/oc/api/machine/ExecutionResult$Error
/*     */     //   806: dup
/*     */     //   807: ldc_w 'not enough memory'
/*     */     //   810: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   813: astore #5
/*     */     //   815: aload #5
/*     */     //   817: areturn
/*     */     //   818: aload_2
/*     */     //   819: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #197	-> 0
/*     */     //   #200	-> 14
/*     */     //   #202	-> 18
/*     */     //   #203	-> 40
/*     */     //   #204	-> 54
/*     */     //   #207	-> 66
/*     */     //   #209	-> 74
/*     */     //   #211	-> 87
/*     */     //   #220	-> 91
/*     */     //   #221	-> 103
/*     */     //   #222	-> 129
/*     */     //   #225	-> 148
/*     */     //   #226	-> 156
/*     */     //   #229	-> 160
/*     */     //   #230	-> 171
/*     */     //   #235	-> 176
/*     */     //   #231	-> 190
/*     */     //   #232	-> 204
/*     */     //   #233	-> 230
/*     */     //   #230	-> 248
/*     */     //   #229	-> 250
/*     */     //   #200	-> 252
/*     */     //   #240	-> 254
/*     */     //   #245	-> 266
/*     */     //   #246	-> 283
/*     */     //   #251	-> 293
/*     */     //   #252	-> 310
/*     */     //   #259	-> 328
/*     */     //   #260	-> 366
/*     */     //   #261	-> 375
/*     */     //   #266	-> 387
/*     */     //   #268	-> 401
/*     */     //   #269	-> 434
/*     */     //   #272	-> 448
/*     */     //   #273	-> 459
/*     */     //   #274	-> 473
/*     */     //   #277	-> 484
/*     */     //   #278	-> 496
/*     */     //   #281	-> 506
/*     */     //   #282	-> 531
/*     */     //   #280	-> 539
/*     */     //   #283	-> 541
/*     */     //   #284	-> 546
/*     */     //   #283	-> 558
/*     */     //   #195	-> 570
/*     */     //   #289	-> 573
/*     */     //   #290	-> 586
/*     */     //   #291	-> 652
/*     */     //   #289	-> 662
/*     */     //   #292	-> 667
/*     */     //   #293	-> 680
/*     */     //   #294	-> 688
/*     */     //   #293	-> 701
/*     */     //   #295	-> 737
/*     */     //   #296	-> 744
/*     */     //   #297	-> 759
/*     */     //   #298	-> 803
/*     */     //   #195	-> 815
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	820	0	this	Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;
/*     */     //   0	820	1	isSynchronizedReturn	Z
/*     */     //   254	566	9	results	I
/*     */     //   366	18	12	ticks	I
/*     */     //   541	279	13	error	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	570	570	finally
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
/*     */   public final class NativeLuaArchitecture$$anonfun$1
/*     */     extends AbstractFunction1<Object, BoxedUnit>
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
/*     */     public final void apply(Object arg) {
/* 232 */       ExtendedLuaState.ExtendedLuaState qual$2 = ExtendedLuaState$.MODULE$.extendLuaState(this.$outer.lua()); Object x$4 = arg; IdentityHashMap x$5 = qual$2.pushValue$default$2(); qual$2.pushValue(x$4, x$5);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NativeLuaArchitecture$$anonfun$1(NativeLuaArchitecture $outer) {}
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
/*     */   public void onSignal() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean initialize() {
/* 310 */     Option<LuaState> option = factory().createState();
/* 311 */     if (None$.MODULE$.equals(option)) {
/* 312 */       lua_$eq(null);
/* 313 */       machine().crash("native libraries not available");
/* 314 */       return false;
/* 315 */     }  if (option instanceof Some) { Some some = (Some)option; LuaState value = (LuaState)some.x(); lua_$eq(value); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       
/* 317 */       ramScale_$eq((lua().getPointerWidth() >= 8) ? Settings$.MODULE$.get().ramScaleFor64Bit() : 1.0D);
/*     */       
/* 319 */       Predef$.MODULE$.refArrayOps((Object[])apis()).foreach((Function1)new NativeLuaArchitecture$$anonfun$initialize$1(this));
/*     */       
/* 321 */       lua().load(Machine.class.getResourceAsStream((new StringBuilder()).append(Settings$.MODULE$.scriptPath()).append("machine.lua").toString()), "=machine", "t");
/* 322 */       lua().newThread();
/*     */       
/* 324 */       return true; }
/*     */     
/*     */     throw new MatchError(option);
/*     */   } public final class NativeLuaArchitecture$$anonfun$initialize$1 extends AbstractFunction1<NativeLuaAPI, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(NativeLuaAPI x$1) {
/*     */       x$1.initialize();
/*     */     } public NativeLuaArchitecture$$anonfun$initialize$1(NativeLuaArchitecture $outer) {} } public void onConnect() {} public void close() {
/* 331 */     if (lua() != null) {
/* 332 */       if (Settings$.MODULE$.get().limitMemory()) {
/* 333 */         lua().setTotalMemory(2147483647);
/*     */       }
/* 335 */       lua().close();
/*     */     } 
/* 337 */     lua_$eq(null);
/* 338 */     kernelMemory_$eq(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   private Stack<Enumeration.Value> state() {
/* 347 */     return ((Machine)machine()).state();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   4: invokeinterface isRunning : ()Z
/*     */     //   9: ifeq -> 303
/*     */     //   12: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   15: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   18: invokevirtual limitMemory : ()Z
/*     */     //   21: ifeq -> 34
/*     */     //   24: aload_0
/*     */     //   25: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   28: ldc_w 2147483647
/*     */     //   31: invokevirtual setTotalMemory : (I)V
/*     */     //   34: aload_0
/*     */     //   35: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   38: iconst_0
/*     */     //   39: invokevirtual setTop : (I)V
/*     */     //   42: aload_0
/*     */     //   43: invokespecial persistence : ()Lli/cil/oc/server/machine/luac/PersistenceAPI;
/*     */     //   46: getstatic li/cil/oc/common/SaveHandler$.MODULE$ : Lli/cil/oc/common/SaveHandler$;
/*     */     //   49: aload_1
/*     */     //   50: new scala/collection/mutable/StringBuilder
/*     */     //   53: dup
/*     */     //   54: invokespecial <init> : ()V
/*     */     //   57: aload_0
/*     */     //   58: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   61: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   66: invokeinterface address : ()Ljava/lang/String;
/*     */     //   71: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   74: ldc_w '_kernel'
/*     */     //   77: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   80: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   83: invokevirtual load : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/lang/String;)[B
/*     */     //   86: invokevirtual unpersist : ([B)Z
/*     */     //   89: pop
/*     */     //   90: aload_0
/*     */     //   91: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   94: iconst_1
/*     */     //   95: invokevirtual isThread : (I)Z
/*     */     //   98: ifeq -> 292
/*     */     //   101: aload_0
/*     */     //   102: invokespecial state : ()Lscala/collection/mutable/Stack;
/*     */     //   105: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*     */     //   108: invokevirtual SynchronizedCall : ()Lscala/Enumeration$Value;
/*     */     //   111: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   114: ifne -> 133
/*     */     //   117: aload_0
/*     */     //   118: invokespecial state : ()Lscala/collection/mutable/Stack;
/*     */     //   121: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*     */     //   124: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*     */     //   127: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   130: ifeq -> 230
/*     */     //   133: aload_0
/*     */     //   134: invokespecial persistence : ()Lli/cil/oc/server/machine/luac/PersistenceAPI;
/*     */     //   137: getstatic li/cil/oc/common/SaveHandler$.MODULE$ : Lli/cil/oc/common/SaveHandler$;
/*     */     //   140: aload_1
/*     */     //   141: new scala/collection/mutable/StringBuilder
/*     */     //   144: dup
/*     */     //   145: invokespecial <init> : ()V
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   152: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   157: invokeinterface address : ()Ljava/lang/String;
/*     */     //   162: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   165: ldc_w '_stack'
/*     */     //   168: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   171: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   174: invokevirtual load : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/lang/String;)[B
/*     */     //   177: invokevirtual unpersist : ([B)Z
/*     */     //   180: pop
/*     */     //   181: aload_0
/*     */     //   182: invokespecial state : ()Lscala/collection/mutable/Stack;
/*     */     //   185: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*     */     //   188: invokevirtual SynchronizedCall : ()Lscala/Enumeration$Value;
/*     */     //   191: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   194: ifeq -> 208
/*     */     //   197: aload_0
/*     */     //   198: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   201: iconst_2
/*     */     //   202: invokevirtual isFunction : (I)Z
/*     */     //   205: goto -> 216
/*     */     //   208: aload_0
/*     */     //   209: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   212: iconst_2
/*     */     //   213: invokevirtual isTable : (I)Z
/*     */     //   216: ifne -> 230
/*     */     //   219: new li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */     //   222: dup
/*     */     //   223: ldc_w 'Invalid stack.'
/*     */     //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   229: athrow
/*     */     //   230: aload_0
/*     */     //   231: aload_1
/*     */     //   232: ldc_w 'kernelMemory'
/*     */     //   235: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */     //   238: i2d
/*     */     //   239: aload_0
/*     */     //   240: invokevirtual ramScale : ()D
/*     */     //   243: dmul
/*     */     //   244: d2i
/*     */     //   245: invokevirtual kernelMemory_$eq : (I)V
/*     */     //   248: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   251: aload_0
/*     */     //   252: invokespecial apis : ()[Lli/cil/oc/server/machine/luac/NativeLuaAPI;
/*     */     //   255: checkcast [Ljava/lang/Object;
/*     */     //   258: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   261: new li/cil/oc/server/machine/luac/NativeLuaArchitecture$$anonfun$load$1
/*     */     //   264: dup
/*     */     //   265: aload_0
/*     */     //   266: aload_1
/*     */     //   267: invokespecial <init> : (Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   270: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   275: aload_0
/*     */     //   276: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */     //   279: getstatic li/cil/repack/com/naef/jnlua/LuaState$GcAction.COLLECT : Lli/cil/repack/com/naef/jnlua/LuaState$GcAction;
/*     */     //   282: iconst_0
/*     */     //   283: invokevirtual gc : (Lli/cil/repack/com/naef/jnlua/LuaState$GcAction;I)I
/*     */     //   286: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   289: goto -> 492
/*     */     //   292: new li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */     //   295: dup
/*     */     //   296: ldc_w 'Invalid kernel.'
/*     */     //   299: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   302: athrow
/*     */     //   303: return
/*     */     //   304: astore_3
/*     */     //   305: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   308: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   311: new scala/StringContext
/*     */     //   314: dup
/*     */     //   315: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   318: iconst_2
/*     */     //   319: anewarray java/lang/String
/*     */     //   322: dup
/*     */     //   323: iconst_0
/*     */     //   324: ldc_w 'Error cleaning up loaded computer @ '
/*     */     //   327: aastore
/*     */     //   328: dup
/*     */     //   329: iconst_1
/*     */     //   330: ldc_w '. This either means the server is badly overloaded or a user created an evil __gc method, accidentally or not.'
/*     */     //   333: aastore
/*     */     //   334: checkcast [Ljava/lang/Object;
/*     */     //   337: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   340: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   343: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   346: iconst_1
/*     */     //   347: anewarray java/lang/Object
/*     */     //   350: dup
/*     */     //   351: iconst_0
/*     */     //   352: aload_0
/*     */     //   353: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   356: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*     */     //   361: invokeinterface machinePosition : ()Ljava/lang/String;
/*     */     //   366: aastore
/*     */     //   367: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   370: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   373: invokeinterface warn : (Ljava/lang/String;)V
/*     */     //   378: aload_0
/*     */     //   379: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   382: ldc_w 'error in garbage collector, most likely __gc method timed out'
/*     */     //   385: invokeinterface crash : (Ljava/lang/String;)Z
/*     */     //   390: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   393: goto -> 492
/*     */     //   396: astore_2
/*     */     //   397: new java/lang/Exception
/*     */     //   400: dup
/*     */     //   401: new scala/collection/mutable/StringBuilder
/*     */     //   404: dup
/*     */     //   405: invokespecial <init> : ()V
/*     */     //   408: aload_2
/*     */     //   409: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   412: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   415: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   418: aload_2
/*     */     //   419: invokevirtual getLuaStackTrace : ()[Lli/cil/repack/com/naef/jnlua/LuaStackTraceElement;
/*     */     //   422: checkcast [Ljava/lang/Object;
/*     */     //   425: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   428: invokeinterface isEmpty : ()Z
/*     */     //   433: ifeq -> 441
/*     */     //   436: ldc ''
/*     */     //   438: goto -> 481
/*     */     //   441: new scala/collection/mutable/StringBuilder
/*     */     //   444: dup
/*     */     //   445: invokespecial <init> : ()V
/*     */     //   448: ldc_w '\\tat '
/*     */     //   451: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   454: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   457: aload_2
/*     */     //   458: invokevirtual getLuaStackTrace : ()[Lli/cil/repack/com/naef/jnlua/LuaStackTraceElement;
/*     */     //   461: checkcast [Ljava/lang/Object;
/*     */     //   464: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   467: ldc_w '\\n\\tat '
/*     */     //   470: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   475: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   478: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   481: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   484: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   487: aload_2
/*     */     //   488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   491: athrow
/*     */     //   492: pop
/*     */     //   493: aload_0
/*     */     //   494: aload_0
/*     */     //   495: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   498: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*     */     //   503: invokeinterface internalComponents : ()Ljava/lang/Iterable;
/*     */     //   508: invokevirtual recomputeMemory : (Ljava/lang/Iterable;)Z
/*     */     //   511: pop
/*     */     //   512: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #350	-> 0
/*     */     //   #353	-> 12
/*     */     //   #354	-> 24
/*     */     //   #360	-> 34
/*     */     //   #362	-> 42
/*     */     //   #363	-> 90
/*     */     //   #368	-> 101
/*     */     //   #369	-> 133
/*     */     //   #370	-> 181
/*     */     //   #373	-> 219
/*     */     //   #377	-> 230
/*     */     //   #379	-> 248
/*     */     //   #383	-> 275
/*     */     //   #366	-> 292
/*     */     //   #350	-> 303
/*     */     //   #384	-> 304
/*     */     //   #383	-> 304
/*     */     //   #385	-> 305
/*     */     //   #386	-> 378
/*     */     //   #384	-> 390
/*     */     //   #389	-> 396
/*     */     //   #357	-> 396
/*     */     //   #357	-> 492
/*     */     //   #393	-> 493
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	513	0	this	Lli/cil/oc/server/machine/luac/NativeLuaArchitecture;
/*     */     //   0	513	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   34	303	396	li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */     //   275	292	304	finally
/*     */     //   304	396	396	li/cil/repack/com/naef/jnlua/LuaRuntimeException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class NativeLuaArchitecture$$anonfun$load$1
/*     */     extends AbstractFunction1<NativeLuaAPI, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final NBTTagCompound nbt$1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NativeLuaArchitecture$$anonfun$load$1(NativeLuaArchitecture $outer, NBTTagCompound nbt$1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(NativeLuaAPI api) {
/* 380 */       api.load(this.nbt$1);
/*     */     }
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
/*     */   public void save(NBTTagCompound nbt) {
/* 398 */     if (Settings$.MODULE$.get().limitMemory()) {
/* 399 */       lua().setTotalMemory(2147483647);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 405 */       Predef$.MODULE$.assert(lua().isThread(1));
/*     */       
/* 407 */       SaveHandler$.MODULE$.scheduleSave(machine().host(), nbt, (new StringBuilder()).append(machine().node().address()).append("_kernel").toString(), persistence().persist(1));
/*     */ 
/*     */       
/* 410 */       if (state().contains(Machine$State$.MODULE$.SynchronizedCall()) || state().contains(Machine$State$.MODULE$.SynchronizedReturn()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     catch (LuaRuntimeException luaRuntimeException) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 428 */       (new String[3])[0] = "Could not persist computer @ "; (new String[3])[1] = ".\\n"; (new String[3])[2] = ""; OpenComputers$.MODULE$.log().warn((new StringBuilder()).append((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { machine().host().machinePosition(), luaRuntimeException.toString() }))).append(Predef$.MODULE$.refArrayOps((Object[])luaRuntimeException.getLuaStackTrace()).isEmpty() ? "" : (new StringBuilder()).append("\tat ").append(Predef$.MODULE$.refArrayOps((Object[])luaRuntimeException.getLuaStackTrace()).mkString("\n\tat ")).toString()).toString());
/* 429 */       nbt.func_82580_o("state");
/*     */     } catch (LuaGcMetamethodException luaGcMetamethodException) {
/* 431 */       (new String[3])[0] = "Could not persist computer @ "; (new String[3])[1] = ".\\n"; (new String[3])[2] = ""; OpenComputers$.MODULE$.log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { machine().host().machinePosition(), luaGcMetamethodException.toString() })));
/* 432 */       nbt.func_82580_o("state");
/*     */     } 
/*     */ 
/*     */     
/* 436 */     recomputeMemory(machine().host().internalComponents());
/*     */   }
/*     */   
/*     */   public abstract LuaStateFactory factory();
/*     */   
/*     */   public final class NativeLuaArchitecture$$anonfun$save$1 extends AbstractFunction1<NativeLuaAPI, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NBTTagCompound nbt$2;
/*     */     
/*     */     public NativeLuaArchitecture$$anonfun$save$1(NativeLuaArchitecture $outer, NBTTagCompound nbt$2) {}
/*     */     
/*     */     public final void apply(NativeLuaAPI api) {
/*     */       api.save(this.nbt$2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\NativeLuaArchitecture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */