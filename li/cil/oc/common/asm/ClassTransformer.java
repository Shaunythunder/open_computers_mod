/*     */ package li.cil.oc.common.asm;
/*     */ import cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
/*     */ import li.cil.oc.integration.Mods;
/*     */ import net.minecraft.launchwrapper.LaunchClassLoader;
/*     */ import org.objectweb.asm.ClassWriter;
/*     */ import org.objectweb.asm.tree.AbstractInsnNode;
/*     */ import org.objectweb.asm.tree.AnnotationNode;
/*     */ import org.objectweb.asm.tree.ClassNode;
/*     */ import org.objectweb.asm.tree.FieldInsnNode;
/*     */ import org.objectweb.asm.tree.FieldNode;
/*     */ import org.objectweb.asm.tree.InnerClassNode;
/*     */ import org.objectweb.asm.tree.InsnList;
/*     */ import org.objectweb.asm.tree.JumpInsnNode;
/*     */ import org.objectweb.asm.tree.LabelNode;
/*     */ import org.objectweb.asm.tree.LdcInsnNode;
/*     */ import org.objectweb.asm.tree.MethodNode;
/*     */ import org.objectweb.asm.tree.TypeInsnNode;
/*     */ import org.objectweb.asm.tree.VarInsnNode;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.SeqLike;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.util.matching.Regex;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Mx!B\001\003\021\003i\021\001E\"mCN\034HK]1og\032|'/\\3s\025\t\031A!A\002bg6T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\021\0072\f7o\035+sC:\034hm\034:nKJ\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\004\035\037\001\007I\021A\017\002\023!\fG-\022:s_J\034X#\001\020\021\005My\022B\001\021\025\005\035\021un\0347fC:DqAI\bA\002\023\0051%A\007iC\022,%O]8sg~#S-\035\013\003I\035\002\"aE\023\n\005\031\"\"\001B+oSRDq\001K\021\002\002\003\007a$A\002yIEBaAK\b!B\023q\022A\0035bI\026\023(o\034:tA!9Af\004a\001\n\003i\022\001\0075bINKW\016\0357f\007>l\007o\0348f]R,%O]8sg\"9af\004a\001\n\003y\023\001\b5bINKW\016\0357f\007>l\007o\0348f]R,%O]8sg~#S-\035\013\003IABq\001K\027\002\002\003\007a\004\003\0043\037\001\006KAH\001\032Q\006$7+[7qY\026\034u.\0349p]\026tG/\022:s_J\034\bE\002\003\021\005\001!4cA\0326{A\021agO\007\002o)\021\001(O\001\005Y\006twMC\001;\003\021Q\027M^1\n\005q:$AB(cU\026\034G\017\005\002?\0136\tqH\003\002A\003\006iA.Y;oG\"<(/\0319qKJT!AQ\"\002\0235Lg.Z2sC\032$(\"\001#\002\0079,G/\003\002G\t\t\022j\0217bgN$&/\0318tM>\024X.\032:\t\013e\031D\021\001%\025\003%\003\"AD\032\t\017-\033$\031!C\005\031\0061An\\1eKJ,\022!\024\t\003}9K!aT \003#1\013WO\\2i\0072\f7o\035'pC\022,'\017\003\004Rg\001\006I!T\001\bY>\fG-\032:!\021\035\0316G1A\005\nQ\0131\001\\8h+\005)\006C\001,`\033\0059&B\001-Z\003\025awn\032\033k\025\tQ6,A\004m_\036<\027N\\4\013\005qk\026AB1qC\016DWMC\001_\003\ry'oZ\005\003A^\023a\001T8hO\026\024\bB\00224A\003%Q+\001\003m_\036\004\003\"\00234\t\003*\027!\003;sC:\034hm\034:n)\0211G.^<\021\007M9\027.\003\002i)\t)\021I\035:bsB\0211C[\005\003WR\021AAQ=uK\")Qn\031a\001]\006!a.Y7f!\ty'O\004\002\024a&\021\021\017F\001\007!J,G-\0324\n\005M$(AB*ue&twM\003\002r)!)ao\031a\001]\006yAO]1og\032|'/\\3e\035\006lW\rC\003yG\002\007a-\001\006cCNL7m\0217bgNDQA_\032\005\nm\f!\"\0338tKJ$\030J\034;p)!ax0!\006\002\034\005}\001cA\n~M&\021a\020\006\002\007\037B$\030n\0348\t\017\005\005\021\0201\001\002\004\005I1\r\\1tg:{G-\032\t\005\003\013\t\t\"\004\002\002\b)!\021\021BA\006\003\021!(/Z3\013\007\r\tiAC\002\002\020u\013\021b\0342kK\016$x/\0322\n\t\005M\021q\001\002\n\0072\f7o\035(pI\026Dq!a\006z\001\004\tI\"A\006nKRDw\016\032(b[\026\034\bcA\nh]\"9\021QD=A\002\005e\021aC7fi\"|G\rR3tGNDq!!\tz\001\004\t\031#\001\005j]N,'\017^3s!\031\031\022QEA\025=%\031\021q\005\013\003\023\031+hn\031;j_:\f\004\003BA\003\003WIA!!\f\002\b\tA\021J\\:o\031&\034H\017C\004\0022M\"I!a\r\002\027\rd\027m]:Fq&\034Ho\035\013\004=\005U\002BB7\0020\001\007a\016C\004\002:M\"I!a\017\002)5L7o]5oO\032\023x.\\*jO:\fG/\036:f)\021\ti$!\023\021\013\005}\022Q\t8\016\005\005\005#bAA\")\005Q1m\0347mK\016$\030n\0348\n\t\005\035\023\021\t\002\t\023R,'/\031;pe\"9\0211JA\034\001\004q\027\001\0023fg\016Dq!a\0244\t\003\t\t&A\020j]*,7\r^#om&\024xN\\7f]RLU\016\0357f[\026tG/\031;j_:$2AZA*\021!\t\t!!\024A\002\005\r\001bBA,g\021\025\021\021L\001\rSN$\026\016\\3F]RLG/\037\013\004=\005m\003\002CA\001\003+\002\r!a\001)\t\005U\023q\f\t\005\003C\n9'\004\002\002d)\031\021Q\r\013\002\025\005tgn\034;bi&|g.\003\003\002j\005\r$a\002;bS2\024Xm\031\005\b\003[\032DQAA8\0031I7/Q:tS\036t\027M\0317f)\025q\022\021OA;\021!\t\031(a\033A\002\005\r\021A\0029be\026tG\017\003\005\002x\005-\004\031AA\002\003\025\031\007.\0337eQ\021\tY'a\030\t\017\005u4\007\"\001\002\000\0059\021n\035$j]\006dGc\001\020\002\002\"A\0211QA>\001\004\t\031!\001\003o_\022,\007bBADg\021\005\021\021R\001\fSNLe\016^3sM\006\034W\rF\002\037\003\027C\001\"a!\002\006\002\007\0211\001\005\b\003\037\033D\021AAI\0031\031G.Y:t\035>$WMR8s)\021\t\031!a%\t\r5\fi\t1\001o\021\035\t9j\rC\001\0033\013AB\\3x\0072\f7o\035(pI\026$B!a\001\002\034\"9\021QTAK\001\0041\027\001\0023bi\006Dq!!)4\t\003\t\031+\001\006xe&$Xm\0217bgN$RAZAS\003OC\001\"!\001\002 \002\007\0211\001\005\013\003S\013y\n%AA\002\005-\026!\0024mC\036\034\bcA\n\002.&\031\021q\026\013\003\007%sGO\002\004\0024N\002\021Q\027\002\031\023:TWm\031;j_:4\025-\0337fI\026C8-\0329uS>t7\003BAY\003o\003B!!/\002J:!\0211XAc\035\021\ti,a1\016\005\005}&bAAa\031\0051AH]8pizJ\021!F\005\004\003\017$\022a\0029bG.\fw-Z\005\005\003\027\fiMA\005Fq\016,\007\017^5p]*\031\021q\031\013\t\025\005E\027\021\027B\001B\003%a.A\004nKN\034\030mZ3\t\017e\t\t\f\"\001\002VR!\021q[An!\021\tI.!-\016\003MBq!!5\002T\002\007a\016C\005\002`N\n\n\021\"\001\002b\006!rO]5uK\016c\027m]:%I\0264\027-\0367uII*\"!a9+\t\005-\026Q]\026\003\003O\004B!!;\002p6\021\0211\036\006\005\003[\f\031'A\005v]\016DWmY6fI&!\021\021_Av\005E)hn\0315fG.,GMV1sS\006t7-\032")
/*     */ public class ClassTransformer implements IClassTransformer {
/*  42 */   private final LaunchClassLoader loader = (LaunchClassLoader)ClassTransformer.class.getClassLoader(); private LaunchClassLoader loader() { return this.loader; }
/*  43 */    private final Logger li$cil$oc$common$asm$ClassTransformer$$log = LogManager.getLogger("OpenComputers"); public Logger li$cil$oc$common$asm$ClassTransformer$$log() { return this.li$cil$oc$common$asm$ClassTransformer$$log; }
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] transform(String name, String transformedName, byte[] basicClass) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: aconst_null
/*     */     //   2: if_acmpeq -> 14
/*     */     //   5: aload_1
/*     */     //   6: ldc 'scala.'
/*     */     //   8: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   11: ifeq -> 16
/*     */     //   14: aload_3
/*     */     //   15: areturn
/*     */     //   16: aload_3
/*     */     //   17: astore #4
/*     */     //   19: aload_1
/*     */     //   20: ldc 'net.minecraft.'
/*     */     //   22: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   25: ifne -> 746
/*     */     //   28: aload_1
/*     */     //   29: ldc 'net.minecraftforge.'
/*     */     //   31: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   34: ifne -> 746
/*     */     //   37: aload_1
/*     */     //   38: ldc 'li.cil.oc.common.asm.'
/*     */     //   40: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   43: ifne -> 746
/*     */     //   46: aload_1
/*     */     //   47: ldc 'li.cil.oc.integration.'
/*     */     //   49: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   52: ifne -> 746
/*     */     //   55: aload_1
/*     */     //   56: ldc 'li.cil.oc.'
/*     */     //   58: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   61: ifeq -> 549
/*     */     //   64: aload_0
/*     */     //   65: aload #4
/*     */     //   67: invokevirtual newClassNode : ([B)Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   70: astore #6
/*     */     //   72: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   75: aload #6
/*     */     //   77: getfield interfaces : Ljava/util/List;
/*     */     //   80: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   83: new li/cil/oc/common/asm/ClassTransformer$$anonfun$1
/*     */     //   86: dup
/*     */     //   87: aload_0
/*     */     //   88: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   91: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   96: checkcast scala/collection/mutable/Buffer
/*     */     //   99: astore #7
/*     */     //   101: aload #7
/*     */     //   103: new li/cil/oc/common/asm/ClassTransformer$$anonfun$transform$1
/*     */     //   106: dup
/*     */     //   107: aload_0
/*     */     //   108: aload_1
/*     */     //   109: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;Ljava/lang/String;)V
/*     */     //   112: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   117: aload #6
/*     */     //   119: getfield interfaces : Ljava/util/List;
/*     */     //   122: getstatic scala/collection/convert/WrapAsJava$.MODULE$ : Lscala/collection/convert/WrapAsJava$;
/*     */     //   125: aload #7
/*     */     //   127: invokevirtual bufferAsJavaList : (Lscala/collection/mutable/Buffer;)Ljava/util/List;
/*     */     //   130: invokeinterface removeAll : (Ljava/util/Collection;)Z
/*     */     //   135: pop
/*     */     //   136: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   139: aload #6
/*     */     //   141: getfield innerClasses : Ljava/util/List;
/*     */     //   144: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   147: new li/cil/oc/common/asm/ClassTransformer$$anonfun$2
/*     */     //   150: dup
/*     */     //   151: aload_0
/*     */     //   152: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   155: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   160: checkcast scala/collection/mutable/Buffer
/*     */     //   163: astore #8
/*     */     //   165: aload #8
/*     */     //   167: new li/cil/oc/common/asm/ClassTransformer$$anonfun$transform$2
/*     */     //   170: dup
/*     */     //   171: aload_0
/*     */     //   172: aload_1
/*     */     //   173: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;Ljava/lang/String;)V
/*     */     //   176: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   181: aload #6
/*     */     //   183: getfield innerClasses : Ljava/util/List;
/*     */     //   186: getstatic scala/collection/convert/WrapAsJava$.MODULE$ : Lscala/collection/convert/WrapAsJava$;
/*     */     //   189: aload #8
/*     */     //   191: invokevirtual bufferAsJavaList : (Lscala/collection/mutable/Buffer;)Ljava/util/List;
/*     */     //   194: invokeinterface removeAll : (Ljava/util/Collection;)Z
/*     */     //   199: pop
/*     */     //   200: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   203: aload #6
/*     */     //   205: getfield methods : Ljava/util/List;
/*     */     //   208: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   211: new li/cil/oc/common/asm/ClassTransformer$$anonfun$3
/*     */     //   214: dup
/*     */     //   215: aload_0
/*     */     //   216: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   219: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   224: checkcast scala/collection/mutable/Buffer
/*     */     //   227: astore #9
/*     */     //   229: aload #9
/*     */     //   231: new li/cil/oc/common/asm/ClassTransformer$$anonfun$transform$3
/*     */     //   234: dup
/*     */     //   235: aload_0
/*     */     //   236: aload_1
/*     */     //   237: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;Ljava/lang/String;)V
/*     */     //   240: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   245: aload #6
/*     */     //   247: getfield methods : Ljava/util/List;
/*     */     //   250: getstatic scala/collection/convert/WrapAsJava$.MODULE$ : Lscala/collection/convert/WrapAsJava$;
/*     */     //   253: aload #9
/*     */     //   255: invokevirtual bufferAsJavaList : (Lscala/collection/mutable/Buffer;)Ljava/util/List;
/*     */     //   258: invokeinterface removeAll : (Ljava/util/Collection;)Z
/*     */     //   263: pop
/*     */     //   264: aload #6
/*     */     //   266: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   269: ifnull -> 537
/*     */     //   272: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   275: aload #6
/*     */     //   277: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   280: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   283: new li/cil/oc/common/asm/ClassTransformer$$anonfun$8
/*     */     //   286: dup
/*     */     //   287: aload_0
/*     */     //   288: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   291: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   296: astore #10
/*     */     //   298: aload #10
/*     */     //   300: instanceof scala/Some
/*     */     //   303: ifeq -> 340
/*     */     //   306: aload #10
/*     */     //   308: checkcast scala/Some
/*     */     //   311: astore #11
/*     */     //   313: aload #11
/*     */     //   315: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   318: checkcast org/objectweb/asm/tree/AnnotationNode
/*     */     //   321: astore #12
/*     */     //   323: aload_0
/*     */     //   324: aload #12
/*     */     //   326: aload_1
/*     */     //   327: aload #6
/*     */     //   329: invokevirtual li$cil$oc$common$asm$ClassTransformer$$injectInterface$1 : (Lorg/objectweb/asm/tree/AnnotationNode;Ljava/lang/String;Lorg/objectweb/asm/tree/ClassNode;)V
/*     */     //   332: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   335: astore #13
/*     */     //   337: goto -> 345
/*     */     //   340: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   343: astore #13
/*     */     //   345: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   348: aload #6
/*     */     //   350: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   353: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   356: new li/cil/oc/common/asm/ClassTransformer$$anonfun$9
/*     */     //   359: dup
/*     */     //   360: aload_0
/*     */     //   361: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   364: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   369: astore #14
/*     */     //   371: aload #14
/*     */     //   373: instanceof scala/Some
/*     */     //   376: ifeq -> 532
/*     */     //   379: aload #14
/*     */     //   381: checkcast scala/Some
/*     */     //   384: astore #15
/*     */     //   386: aload #15
/*     */     //   388: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   391: checkcast org/objectweb/asm/tree/AnnotationNode
/*     */     //   394: astore #16
/*     */     //   396: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   399: aload #16
/*     */     //   401: getfield values : Ljava/util/List;
/*     */     //   404: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   407: iconst_2
/*     */     //   408: invokeinterface grouped : (I)Lscala/collection/Iterator;
/*     */     //   413: new li/cil/oc/common/asm/ClassTransformer$$anonfun$10
/*     */     //   416: dup
/*     */     //   417: aload_0
/*     */     //   418: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   421: invokeinterface map : (Lscala/Function1;)Lscala/collection/Iterator;
/*     */     //   426: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   429: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*     */     //   432: invokeinterface toMap : (Lscala/Predef$$less$colon$less;)Lscala/collection/immutable/Map;
/*     */     //   437: astore #18
/*     */     //   439: aload #18
/*     */     //   441: ldc 'value'
/*     */     //   443: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   448: astore #19
/*     */     //   450: aload #19
/*     */     //   452: instanceof scala/Some
/*     */     //   455: ifeq -> 519
/*     */     //   458: aload #19
/*     */     //   460: checkcast scala/Some
/*     */     //   463: astore #20
/*     */     //   465: aload #20
/*     */     //   467: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   470: astore #21
/*     */     //   472: aload #21
/*     */     //   474: instanceof java/lang/Iterable
/*     */     //   477: ifeq -> 519
/*     */     //   480: aload #21
/*     */     //   482: checkcast java/lang/Iterable
/*     */     //   485: astore #22
/*     */     //   487: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   490: aload #22
/*     */     //   492: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*     */     //   495: new li/cil/oc/common/asm/ClassTransformer$$anonfun$transform$4
/*     */     //   498: dup
/*     */     //   499: aload_0
/*     */     //   500: aload_1
/*     */     //   501: aload #6
/*     */     //   503: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;Ljava/lang/String;Lorg/objectweb/asm/tree/ClassNode;)V
/*     */     //   506: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   511: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   514: astore #23
/*     */     //   516: goto -> 524
/*     */     //   519: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   522: astore #23
/*     */     //   524: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   527: astore #17
/*     */     //   529: goto -> 537
/*     */     //   532: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   535: astore #17
/*     */     //   537: aload_0
/*     */     //   538: aload #6
/*     */     //   540: aload_0
/*     */     //   541: invokevirtual writeClass$default$2 : ()I
/*     */     //   544: invokevirtual writeClass : (Lorg/objectweb/asm/tree/ClassNode;I)[B
/*     */     //   547: astore #4
/*     */     //   549: aload_0
/*     */     //   550: aload #4
/*     */     //   552: invokevirtual newClassNode : ([B)Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   555: astore #24
/*     */     //   557: aload #24
/*     */     //   559: getfield interfaces : Ljava/util/List;
/*     */     //   562: ldc_w 'li/cil/oc/api/network/SimpleComponent'
/*     */     //   565: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   570: ifeq -> 746
/*     */     //   573: aload #24
/*     */     //   575: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   578: ifnull -> 608
/*     */     //   581: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   584: aload #24
/*     */     //   586: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   589: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   592: new li/cil/oc/common/asm/ClassTransformer$$anonfun$transform$5
/*     */     //   595: dup
/*     */     //   596: aload_0
/*     */     //   597: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   600: invokeinterface exists : (Lscala/Function1;)Z
/*     */     //   605: ifne -> 746
/*     */     //   608: aload_0
/*     */     //   609: aload #24
/*     */     //   611: invokevirtual injectEnvironmentImplementation : (Lorg/objectweb/asm/tree/ClassNode;)[B
/*     */     //   614: astore #4
/*     */     //   616: aload_0
/*     */     //   617: invokevirtual li$cil$oc$common$asm$ClassTransformer$$log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   620: new scala/StringContext
/*     */     //   623: dup
/*     */     //   624: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   627: iconst_2
/*     */     //   628: anewarray java/lang/String
/*     */     //   631: dup
/*     */     //   632: iconst_0
/*     */     //   633: ldc_w 'Successfully injected component logic into class '
/*     */     //   636: aastore
/*     */     //   637: dup
/*     */     //   638: iconst_1
/*     */     //   639: ldc_w '.'
/*     */     //   642: aastore
/*     */     //   643: checkcast [Ljava/lang/Object;
/*     */     //   646: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   649: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   652: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   655: iconst_1
/*     */     //   656: anewarray java/lang/Object
/*     */     //   659: dup
/*     */     //   660: iconst_0
/*     */     //   661: aload_1
/*     */     //   662: aastore
/*     */     //   663: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   666: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   669: invokeinterface info : (Ljava/lang/String;)V
/*     */     //   674: goto -> 746
/*     */     //   677: astore #25
/*     */     //   679: aload_0
/*     */     //   680: invokevirtual li$cil$oc$common$asm$ClassTransformer$$log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   683: new scala/StringContext
/*     */     //   686: dup
/*     */     //   687: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   690: iconst_2
/*     */     //   691: anewarray java/lang/String
/*     */     //   694: dup
/*     */     //   695: iconst_0
/*     */     //   696: ldc_w 'Failed injecting component logic into class '
/*     */     //   699: aastore
/*     */     //   700: dup
/*     */     //   701: iconst_1
/*     */     //   702: ldc_w '.'
/*     */     //   705: aastore
/*     */     //   706: checkcast [Ljava/lang/Object;
/*     */     //   709: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   712: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   715: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   718: iconst_1
/*     */     //   719: anewarray java/lang/Object
/*     */     //   722: dup
/*     */     //   723: iconst_0
/*     */     //   724: aload_1
/*     */     //   725: aastore
/*     */     //   726: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   729: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   732: aload #25
/*     */     //   734: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   739: getstatic li/cil/oc/common/asm/ClassTransformer$.MODULE$ : Lli/cil/oc/common/asm/ClassTransformer$;
/*     */     //   742: iconst_1
/*     */     //   743: invokevirtual hadSimpleComponentErrors_$eq : (Z)V
/*     */     //   746: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   749: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   752: invokevirtual Class_EntityLiving : ()[Ljava/lang/String;
/*     */     //   755: checkcast [Ljava/lang/Object;
/*     */     //   758: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   761: aload_1
/*     */     //   762: bipush #46
/*     */     //   764: bipush #47
/*     */     //   766: invokevirtual replace : (CC)Ljava/lang/String;
/*     */     //   769: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   774: ifeq -> 857
/*     */     //   777: aload_0
/*     */     //   778: aload #4
/*     */     //   780: invokevirtual newClassNode : ([B)Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   783: astore #26
/*     */     //   785: aload_0
/*     */     //   786: aload #26
/*     */     //   788: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   791: invokevirtual Method_recreateLeash : ()[Ljava/lang/String;
/*     */     //   794: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   797: invokevirtual Method_recreateLeashDesc : ()[Ljava/lang/String;
/*     */     //   800: new li/cil/oc/common/asm/ClassTransformer$$anonfun$11
/*     */     //   803: dup
/*     */     //   804: aload_0
/*     */     //   805: aload #26
/*     */     //   807: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;Lorg/objectweb/asm/tree/ClassNode;)V
/*     */     //   810: invokespecial insertInto : (Lorg/objectweb/asm/tree/ClassNode;[Ljava/lang/String;[Ljava/lang/String;Lscala/Function1;)Lscala/Option;
/*     */     //   813: astore #27
/*     */     //   815: aload #27
/*     */     //   817: instanceof scala/Some
/*     */     //   820: ifeq -> 852
/*     */     //   823: aload #27
/*     */     //   825: checkcast scala/Some
/*     */     //   828: astore #28
/*     */     //   830: aload #28
/*     */     //   832: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   835: checkcast [B
/*     */     //   838: astore #29
/*     */     //   840: aload #29
/*     */     //   842: astore #4
/*     */     //   844: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   847: astore #30
/*     */     //   849: goto -> 857
/*     */     //   852: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   855: astore #30
/*     */     //   857: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   860: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   863: invokevirtual Class_RenderLiving : ()[Ljava/lang/String;
/*     */     //   866: checkcast [Ljava/lang/Object;
/*     */     //   869: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   872: aload_1
/*     */     //   873: bipush #46
/*     */     //   875: bipush #47
/*     */     //   877: invokevirtual replace : (CC)Ljava/lang/String;
/*     */     //   880: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   885: ifeq -> 966
/*     */     //   888: aload_0
/*     */     //   889: aload #4
/*     */     //   891: invokevirtual newClassNode : ([B)Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   894: astore #31
/*     */     //   896: aload_0
/*     */     //   897: aload #31
/*     */     //   899: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   902: invokevirtual Method_renderHanging : ()[Ljava/lang/String;
/*     */     //   905: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   908: invokevirtual Method_renderHangingDesc : ()[Ljava/lang/String;
/*     */     //   911: new li/cil/oc/common/asm/ClassTransformer$$anonfun$13
/*     */     //   914: dup
/*     */     //   915: aload_0
/*     */     //   916: invokespecial <init> : (Lli/cil/oc/common/asm/ClassTransformer;)V
/*     */     //   919: invokespecial insertInto : (Lorg/objectweb/asm/tree/ClassNode;[Ljava/lang/String;[Ljava/lang/String;Lscala/Function1;)Lscala/Option;
/*     */     //   922: astore #32
/*     */     //   924: aload #32
/*     */     //   926: instanceof scala/Some
/*     */     //   929: ifeq -> 961
/*     */     //   932: aload #32
/*     */     //   934: checkcast scala/Some
/*     */     //   937: astore #33
/*     */     //   939: aload #33
/*     */     //   941: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   944: checkcast [B
/*     */     //   947: astore #34
/*     */     //   949: aload #34
/*     */     //   951: astore #4
/*     */     //   953: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   956: astore #35
/*     */     //   958: goto -> 966
/*     */     //   961: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   964: astore #35
/*     */     //   966: aload #4
/*     */     //   968: goto -> 995
/*     */     //   971: astore #5
/*     */     //   973: aload_0
/*     */     //   974: invokevirtual li$cil$oc$common$asm$ClassTransformer$$log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   977: ldc_w 'Something went wrong!'
/*     */     //   980: aload #5
/*     */     //   982: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   987: getstatic li/cil/oc/common/asm/ClassTransformer$.MODULE$ : Lli/cil/oc/common/asm/ClassTransformer$;
/*     */     //   990: iconst_1
/*     */     //   991: invokevirtual hadErrors_$eq : (Z)V
/*     */     //   994: aload_3
/*     */     //   995: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 0
/*     */     //   #47	-> 16
/*     */     //   #49	-> 19
/*     */     //   #50	-> 28
/*     */     //   #51	-> 37
/*     */     //   #52	-> 46
/*     */     //   #53	-> 55
/*     */     //   #57	-> 64
/*     */     //   #58	-> 72
/*     */     //   #59	-> 101
/*     */     //   #62	-> 117
/*     */     //   #64	-> 136
/*     */     //   #65	-> 165
/*     */     //   #68	-> 181
/*     */     //   #70	-> 200
/*     */     //   #71	-> 229
/*     */     //   #75	-> 245
/*     */     //   #78	-> 264
/*     */     //   #115	-> 272
/*     */     //   #116	-> 298
/*     */     //   #117	-> 323
/*     */     //   #118	-> 340
/*     */     //   #120	-> 345
/*     */     //   #121	-> 371
/*     */     //   #122	-> 396
/*     */     //   #123	-> 439
/*     */     //   #124	-> 450
/*     */     //   #125	-> 487
/*     */     //   #126	-> 519
/*     */     //   #123	-> 524
/*     */     //   #121	-> 527
/*     */     //   #128	-> 532
/*     */     //   #132	-> 537
/*     */     //   #135	-> 549
/*     */     //   #136	-> 557
/*     */     //   #137	-> 573
/*     */     //   #138	-> 592
/*     */     //   #140	-> 608
/*     */     //   #141	-> 616
/*     */     //   #144	-> 677
/*     */     //   #139	-> 677
/*     */     //   #145	-> 679
/*     */     //   #146	-> 739
/*     */     //   #164	-> 746
/*     */     //   #165	-> 777
/*     */     //   #166	-> 785
/*     */     //   #185	-> 815
/*     */     //   #186	-> 852
/*     */     //   #198	-> 857
/*     */     //   #199	-> 888
/*     */     //   #200	-> 896
/*     */     //   #222	-> 924
/*     */     //   #223	-> 961
/*     */     //   #227	-> 966
/*     */     //   #230	-> 971
/*     */     //   #48	-> 971
/*     */     //   #231	-> 973
/*     */     //   #232	-> 987
/*     */     //   #233	-> 994
/*     */     //   #45	-> 995
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	996	0	this	Lli/cil/oc/common/asm/ClassTransformer;
/*     */     //   0	996	1	name	Ljava/lang/String;
/*     */     //   0	996	2	transformedName	Ljava/lang/String;
/*     */     //   0	996	3	basicClass	[B
/*     */     //   19	977	4	transformedClass	[B
/*     */     //   72	477	6	classNode	Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   101	448	7	missingInterfaces	Lscala/collection/mutable/Buffer;
/*     */     //   165	384	8	missingClasses	Lscala/collection/mutable/Buffer;
/*     */     //   229	320	9	incompleteMethods	Lscala/collection/mutable/Buffer;
/*     */     //   323	673	12	annotation	Lorg/objectweb/asm/tree/AnnotationNode;
/*     */     //   396	600	16	annotation	Lorg/objectweb/asm/tree/AnnotationNode;
/*     */     //   439	88	18	values	Lscala/collection/immutable/Map;
/*     */     //   472	524	21	interfaceList	Ljava/lang/Object;
/*     */     //   557	439	24	classNode	Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   785	211	26	classNode	Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   840	156	29	data	[B
/*     */     //   896	100	31	classNode	Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   949	47	34	data	[B
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   19	971	971	finally
/*     */     //   608	677	677	finally
/*     */   }
/*     */   
/*     */   public final class ClassTransformer$$anonfun$1
/*     */     extends AbstractFunction1<String, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(String x$1) {
/*  58 */       return !this.$outer.li$cil$oc$common$asm$ClassTransformer$$classExists(x$1);
/*     */     } public ClassTransformer$$anonfun$1(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$transform$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public ClassTransformer$$anonfun$transform$1(ClassTransformer $outer, String name$1) {} public final void apply(String interfaceName) {
/*  60 */       (new String[3])[0] = "Stripping interface "; (new String[3])[1] = " from class "; (new String[3])[2] = " because it is missing."; this.$outer.li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { interfaceName, this.name$1 })));
/*     */     } }
/*     */   public final class ClassTransformer$$anonfun$2 extends AbstractFunction1<InnerClassNode, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(InnerClassNode clazz) {
/*  64 */       return !(clazz.outerName == null || this.$outer.li$cil$oc$common$asm$ClassTransformer$$classExists(clazz.outerName));
/*     */     } public ClassTransformer$$anonfun$2(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$transform$2 extends AbstractFunction1<InnerClassNode, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public ClassTransformer$$anonfun$transform$2(ClassTransformer $outer, String name$1) {} public final void apply(InnerClassNode innerClass) {
/*  66 */       (new String[4])[0] = "Stripping inner class "; (new String[4])[1] = " from class "; (new String[4])[2] = " because its type "; (new String[4])[3] = " is missing."; this.$outer.li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { innerClass.name, this.name$1, innerClass.outerName })));
/*     */     } }
/*     */   public final class ClassTransformer$$anonfun$3 extends AbstractFunction1<MethodNode, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(MethodNode method) {
/*  70 */       return this.$outer.li$cil$oc$common$asm$ClassTransformer$$missingFromSignature(method.desc).nonEmpty();
/*     */     } public ClassTransformer$$anonfun$3(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$transform$3 extends AbstractFunction1<MethodNode, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public ClassTransformer$$anonfun$transform$3(ClassTransformer $outer, String name$1) {} public final void apply(MethodNode method) {
/*  72 */       String missing = this.$outer.li$cil$oc$common$asm$ClassTransformer$$missingFromSignature(method.desc).mkString(", ");
/*  73 */       (new String[4])[0] = "Stripping method "; (new String[4])[1] = " from class "; (new String[4])[2] = " because the following types in its signature are missing: "; (new String[4])[3] = ""; this.$outer.li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { method.name, this.name$1, missing })));
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void li$cil$oc$common$asm$ClassTransformer$$injectInterface$1(AnnotationNode annotation, String name$1, ClassNode classNode$1) {
/*  80 */     Map values = WrapAsScala$.MODULE$.asScalaBuffer(annotation.values).grouped(2).map((Function1)new ClassTransformer$$anonfun$4(this)).toMap(Predef$.MODULE$.$conforms());
/*  81 */     Tuple2 tuple2 = new Tuple2(values.get("value"), values.get("modid")); if (tuple2 != null) {
/*  82 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; Object interfaceName = some.x(); if (interfaceName instanceof String) { String str = (String)interfaceName; if (option2 instanceof Some) { Some some1 = (Some)option2; Object modid = some1.x(); if (modid instanceof String) { String str1 = (String)modid;
/*  83 */               Option option = Mods$.MODULE$.All().find((Function1)new ClassTransformer$$anonfun$5(this, str1));
/*  84 */               if (option instanceof Some) { Some some2 = (Some)option; Mods.ModBase mod = (Mods.ModBase)some2.x();
/*     */                 
/*  86 */                 String interfaceDesc = (new StringOps(Predef$.MODULE$.augmentString(str))).replaceAllLiterally(".", "/");
/*  87 */                 ClassNode node = classNodeFor(interfaceDesc);
/*     */                 
/*  89 */                 (new String[2])[0] = "Interface "; (new String[2])[1] = " not found, skipping injection."; li$cil$oc$common$asm$ClassTransformer$$log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { str })));
/*     */ 
/*     */                 
/*  92 */                 Buffer missing = (Buffer)((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(node.methods).filterNot((Function1)new ClassTransformer$$anonfun$6(this, classNode$1))).map((Function1)new ClassTransformer$$anonfun$7(this), Buffer$.MODULE$.canBuildFrom());
/*     */                 
/*  94 */                 (new String[3])[0] = "Injecting interface "; (new String[3])[1] = " into "; (new String[3])[2] = "."; li$cil$oc$common$asm$ClassTransformer$$log().info((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { str, name$1 })));
/*  95 */                 classNode$1.interfaces.add(interfaceDesc);
/*     */ 
/*     */                 
/*  98 */                 (new String[2])[0] = "Missing implementations for interface "; (new String[2])[1] = ", skipping injection."; li$cil$oc$common$asm$ClassTransformer$$log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { str })));
/*  99 */                 missing.foreach((Function1)new ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$injectInterface$1$1(this));
/* 100 */                 ClassTransformer$.MODULE$.hadErrors_$eq(true);
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 105 */                 (new String[3])[0] = "Skipping interface "; (new String[3])[1] = " from missing mod "; (new String[3])[2] = "."; li$cil$oc$common$asm$ClassTransformer$$log().info((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { str, str1 })));
/* 106 */                 mod.disablePower(); BoxedUnit boxedUnit2 = mod.isAvailable() ? ((node == null) ? BoxedUnit.UNIT : (missing.isEmpty() ? BoxedUnit.UNIT : BoxedUnit.UNIT)) : BoxedUnit.UNIT; }
/*     */               else
/*     */               
/* 109 */               { (new String[3])[0] = "Skipping interface "; (new String[3])[1] = " from unknown mod "; (new String[3])[2] = "."; li$cil$oc$common$asm$ClassTransformer$$log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { str, str1 })));
/* 110 */                 ClassTransformer$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }  BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }  }  }
/*     */     
/* 112 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   } public final class ClassTransformer$$anonfun$4 extends AbstractFunction1<Buffer<Object>, Tuple2<Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Tuple2<Object, Object> apply(Buffer buffer) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(buffer.head()), buffer.last()); } public ClassTransformer$$anonfun$4(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$5 extends AbstractFunction1<Mods.ModBase, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String x7$1; public final boolean apply(Mods.ModBase x$2) { String str = this.x7$1; if (x$2.id() == null) { x$2.id(); if (str != null); } else if (x$2.id().equals(str)) {  }  } public ClassTransformer$$anonfun$5(ClassTransformer $outer, String x7$1) {} } public final class ClassTransformer$$anonfun$6 extends AbstractFunction1<MethodNode, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ClassNode classNode$1; public final boolean apply(MethodNode im) { return WrapAsScala$.MODULE$.asScalaBuffer(this.classNode$1.methods).exists((Function1)new ClassTransformer$$anonfun$6$$anonfun$apply$1(this, im)); } public ClassTransformer$$anonfun$6(ClassTransformer $outer, ClassNode classNode$1) {} public final class ClassTransformer$$anonfun$6$$anonfun$apply$1 extends AbstractFunction1<MethodNode, Object> implements Serializable { public static final long serialVersionUID = 0L; private final MethodNode im$1; public final boolean apply(MethodNode cm) { // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield im$1 : Lorg/objectweb/asm/tree/MethodNode;
/*     */         //   4: getfield name : Ljava/lang/String;
/*     */         //   7: aload_1
/*     */         //   8: getfield name : Ljava/lang/String;
/*     */         //   11: astore_2
/*     */         //   12: dup
/*     */         //   13: ifnonnull -> 24
/*     */         //   16: pop
/*     */         //   17: aload_2
/*     */         //   18: ifnull -> 31
/*     */         //   21: goto -> 66
/*     */         //   24: aload_2
/*     */         //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   28: ifeq -> 66
/*     */         //   31: aload_0
/*     */         //   32: getfield im$1 : Lorg/objectweb/asm/tree/MethodNode;
/*     */         //   35: getfield desc : Ljava/lang/String;
/*     */         //   38: aload_1
/*     */         //   39: getfield desc : Ljava/lang/String;
/*     */         //   42: astore_3
/*     */         //   43: dup
/*     */         //   44: ifnonnull -> 55
/*     */         //   47: pop
/*     */         //   48: aload_3
/*     */         //   49: ifnull -> 62
/*     */         //   52: goto -> 66
/*     */         //   55: aload_3
/*     */         //   56: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   59: ifeq -> 66
/*     */         //   62: iconst_1
/*     */         //   63: goto -> 67
/*     */         //   66: iconst_0
/*     */         //   67: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #92	-> 0
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	68	0	this	Lli/cil/oc/common/asm/ClassTransformer$$anonfun$6$$anonfun$apply$1;
/* 115 */         //   0	68	1	cm	Lorg/objectweb/asm/tree/MethodNode; } public ClassTransformer$$anonfun$6$$anonfun$apply$1(ClassTransformer$$anonfun$6 $outer, MethodNode im$1) {} } } public final class ClassTransformer$$anonfun$7 extends AbstractFunction1<MethodNode, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(MethodNode method) { (new String[2])[0] = "Missing implementation of "; (new String[2])[1] = ""; return (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { (new StringBuilder()).append(method.name).append(method.desc).toString() })); } public ClassTransformer$$anonfun$7(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$injectInterface$1$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(String x$1) { this.$outer.li$cil$oc$common$asm$ClassTransformer$$log().warn(x$1); } public ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$injectInterface$1$1(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$8 extends AbstractFunction1<AnnotationNode, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(AnnotationNode x$3) { String str = "Lli/cil/oc/common/asm/Injectable$Interface;"; if (x$3.desc == null) { if (str != null); } else if (x$3.desc.equals(str))
/*     */       {  }
/*     */        }
/*     */      public ClassTransformer$$anonfun$8(ClassTransformer $outer) {} }
/*     */   public final class ClassTransformer$$anonfun$9 extends AbstractFunction1<AnnotationNode, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 120 */     public final boolean apply(AnnotationNode x$4) { String str = "Lli/cil/oc/common/asm/Injectable$InterfaceList;"; if (x$4.desc == null) { if (str != null); } else if (x$4.desc.equals(str))
/*     */       {  }
/* 122 */        } public ClassTransformer$$anonfun$9(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$10 extends AbstractFunction1<Buffer<Object>, Tuple2<Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<Object, Object> apply(Buffer buffer) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(buffer.head()), buffer.last()); }
/*     */      public ClassTransformer$$anonfun$10(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$transform$4 extends AbstractFunction1<AnnotationNode, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; private final ClassNode classNode$1;
/*     */     public final void apply(AnnotationNode annotation) {
/* 125 */       this.$outer.li$cil$oc$common$asm$ClassTransformer$$injectInterface$1(annotation, this.name$1, this.classNode$1);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ClassTransformer$$anonfun$transform$4(ClassTransformer $outer, String name$1, ClassNode classNode$1) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ClassTransformer$$anonfun$transform$5
/*     */     extends AbstractFunction1<AnnotationNode, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(AnnotationNode annotation) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ifnull -> 34
/*     */       //   4: aload_1
/*     */       //   5: getfield desc : Ljava/lang/String;
/*     */       //   8: ldc 'Lli/cil/oc/api/network/SimpleComponent$SkipInjection;'
/*     */       //   10: astore_2
/*     */       //   11: dup
/*     */       //   12: ifnonnull -> 23
/*     */       //   15: pop
/*     */       //   16: aload_2
/*     */       //   17: ifnull -> 30
/*     */       //   20: goto -> 34
/*     */       //   23: aload_2
/*     */       //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   27: ifeq -> 34
/*     */       //   30: iconst_1
/*     */       //   31: goto -> 35
/*     */       //   34: iconst_0
/*     */       //   35: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #138	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	36	0	this	Lli/cil/oc/common/asm/ClassTransformer$$anonfun$transform$5;
/*     */       //   0	36	1	annotation	Lorg/objectweb/asm/tree/AnnotationNode;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ClassTransformer$$anonfun$transform$5(ClassTransformer $outer) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ClassTransformer$$anonfun$11
/*     */     extends AbstractFunction1<InsnList, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final ClassNode classNode$3;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(InsnList instructions) {
/* 166 */       return Predef$.MODULE$.refArrayOps((Object[])instructions.toArray()).sliding(3, 1).exists((Function1)new ClassTransformer$$anonfun$11$$anonfun$apply$2(this, instructions)); } public ClassTransformer$$anonfun$11(ClassTransformer $outer, ClassNode classNode$3) {} public final class ClassTransformer$$anonfun$11$$anonfun$apply$2 extends AbstractFunction1<AbstractInsnNode[], Object> implements Serializable { public static final long serialVersionUID = 0L; private final InsnList instructions$1; public final boolean apply(AbstractInsnNode[] x0$1) { AbstractInsnNode[] arrayOfAbstractInsnNode = x0$1;
/* 167 */         Option option = Array$.MODULE$.unapplySeq(arrayOfAbstractInsnNode); if (!option.isEmpty() && option.get() != null && ((SeqLike)option.get()).lengthCompare(3) == 0) { AbstractInsnNode varNode = (AbstractInsnNode)((SeqLike)option.get()).apply(0), fieldNode = (AbstractInsnNode)((SeqLike)option.get()).apply(1), jumpNode = (AbstractInsnNode)((SeqLike)option.get()).apply(2); if (varNode instanceof VarInsnNode) { VarInsnNode varInsnNode = (VarInsnNode)varNode; if (fieldNode instanceof FieldInsnNode) { FieldInsnNode fieldInsnNode = (FieldInsnNode)fieldNode; if (jumpNode instanceof JumpInsnNode) { JumpInsnNode jumpInsnNode = (JumpInsnNode)jumpNode;
/* 168 */                 if (varInsnNode.getOpcode() == 25 && varInsnNode.var == 0 && 
/* 169 */                   fieldInsnNode.getOpcode() == 180 && Predef$.MODULE$.refArrayOps((Object[])ObfNames$.MODULE$.Field_leashNBTTag()).contains(fieldInsnNode.name) && 
/* 170 */                   jumpInsnNode.getOpcode() == 198) {
/* 171 */                   boolean bool; Option option1 = WrapAsScala$.MODULE$.asScalaBuffer(this.$outer.classNode$3.fields).find((Function1)new ClassTransformer$$anonfun$11$$anonfun$apply$2$$anonfun$12(this));
/* 172 */                   if (option1 instanceof Some) { Some some = (Some)option1; FieldNode field = (FieldNode)some.x();
/* 173 */                     InsnList toInject = new InsnList();
/* 174 */                     toInject.add((AbstractInsnNode)new VarInsnNode(25, 0));
/* 175 */                     toInject.add((AbstractInsnNode)new FieldInsnNode(180, this.$outer.classNode$3.name, field.name, field.desc));
/* 176 */                     toInject.add((AbstractInsnNode)new JumpInsnNode(199, jumpInsnNode.label));
/* 177 */                     this.instructions$1.insert((AbstractInsnNode)jumpInsnNode, toInject);
/* 178 */                     bool = true; }
/*     */                   else
/* 180 */                   { bool = false; }
/*     */                   
/*     */                   return bool;
/*     */                 }  }
/*     */                }
/*     */              }
/*     */            }
/*     */         
/*     */         return false; }
/*     */       
/*     */       public ClassTransformer$$anonfun$11$$anonfun$apply$2(ClassTransformer$$anonfun$11 $outer, InsnList instructions$1) {}
/*     */       public final class ClassTransformer$$anonfun$11$$anonfun$apply$2$$anonfun$12 extends AbstractFunction1<FieldNode, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */         public final boolean apply(FieldNode field) {
/*     */           return Predef$.MODULE$.refArrayOps((Object[])ObfNames$.MODULE$.Field_leashedToEntity()).contains(field.name);
/*     */         }
/*     */         public ClassTransformer$$anonfun$11$$anonfun$apply$2$$anonfun$12(ClassTransformer$$anonfun$11$$anonfun$apply$2 $outer) {} } }
/*     */   }
/*     */   
/*     */   public final class ClassTransformer$$anonfun$13 extends AbstractFunction1<InsnList, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 200 */     public final boolean apply(InsnList instructions) { return Predef$.MODULE$.refArrayOps((Object[])instructions.toArray()).sliding(3, 1).exists((Function1)new ClassTransformer$$anonfun$13$$anonfun$apply$3(this, instructions)); } public ClassTransformer$$anonfun$13(ClassTransformer $outer) {} public final class ClassTransformer$$anonfun$13$$anonfun$apply$3 extends AbstractFunction1<AbstractInsnNode[], Object> implements Serializable { public static final long serialVersionUID = 0L; private final InsnList instructions$2; public final boolean apply(AbstractInsnNode[] x0$2) { AbstractInsnNode[] arrayOfAbstractInsnNode = x0$2;
/* 201 */         Option option = Array$.MODULE$.unapplySeq(arrayOfAbstractInsnNode); if (!option.isEmpty() && option.get() != null && ((SeqLike)option.get()).lengthCompare(3) == 0) { AbstractInsnNode varNode = (AbstractInsnNode)((SeqLike)option.get()).apply(0), typeNode = (AbstractInsnNode)((SeqLike)option.get()).apply(1), jumpNode = (AbstractInsnNode)((SeqLike)option.get()).apply(2); if (varNode instanceof VarInsnNode) { VarInsnNode varInsnNode = (VarInsnNode)varNode; if (typeNode instanceof TypeInsnNode) { TypeInsnNode typeInsnNode = (TypeInsnNode)typeNode; if (jumpNode instanceof JumpInsnNode) { JumpInsnNode jumpInsnNode = (JumpInsnNode)jumpNode;
/* 202 */                 if (varInsnNode.getOpcode() == 25 && varInsnNode.var == 10 && 
/* 203 */                   typeInsnNode.getOpcode() == 193 && Predef$.MODULE$.refArrayOps((Object[])ObfNames$.MODULE$.Class_EntityHanging()).contains(typeInsnNode.desc) && 
/* 204 */                   jumpInsnNode.getOpcode() == 153) {
/* 205 */                   InsnList toInject = new InsnList();
/* 206 */                   toInject.add((AbstractInsnNode)new VarInsnNode(25, 10));
/* 207 */                   toInject.add((AbstractInsnNode)new TypeInsnNode(193, "li/cil/oc/common/entity/Drone"));
/* 208 */                   LabelNode skip = new LabelNode();
/* 209 */                   toInject.add((AbstractInsnNode)new JumpInsnNode(153, skip));
/* 210 */                   toInject.add((AbstractInsnNode)new LdcInsnNode(BoxesRunTime.boxToDouble(0.0D)));
/* 211 */                   toInject.add((AbstractInsnNode)new VarInsnNode(57, 16));
/* 212 */                   toInject.add((AbstractInsnNode)new LdcInsnNode(BoxesRunTime.boxToDouble(0.0D)));
/* 213 */                   toInject.add((AbstractInsnNode)new VarInsnNode(57, 18));
/* 214 */                   toInject.add((AbstractInsnNode)new LdcInsnNode(BoxesRunTime.boxToDouble(-0.75D)));
/* 215 */                   toInject.add((AbstractInsnNode)new VarInsnNode(57, 20));
/* 216 */                   toInject.add((AbstractInsnNode)skip);
/* 217 */                   this.instructions$2.insertBefore((AbstractInsnNode)varInsnNode, toInject);
/*     */                   return true;
/*     */                 }  }
/*     */                }
/*     */              }
/*     */            }
/*     */         
/*     */         return false; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public ClassTransformer$$anonfun$13$$anonfun$apply$3(ClassTransformer$$anonfun$13 $outer, InsnList instructions$2) {} }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Option<byte[]> insertInto(ClassNode classNode, String[] methodNames, String[] methodDescs, Function1 inserter) {
/*     */     None$ none$;
/* 238 */     Option option = WrapAsScala$.MODULE$.asScalaBuffer(classNode.methods).find((Function1)new ClassTransformer$$anonfun$14(this, methodNames, methodDescs));
/* 239 */     if (option instanceof Some) { Some some = (Some)option; MethodNode methodNode = (MethodNode)some.x();
/*     */       
/* 241 */       (new String[3])[0] = "Successfully patched "; (new String[3])[1] = "."; (new String[3])[2] = "."; li$cil$oc$common$asm$ClassTransformer$$log().info((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { classNode.name, methodNames[0] })));
/*     */ 
/*     */ 
/*     */       
/* 245 */       (new String[3])[0] = "Failed patching "; (new String[3])[1] = "."; (new String[3])[2] = ", injection point not found."; li$cil$oc$common$asm$ClassTransformer$$log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { classNode.name, methodNames[0] })));
/* 246 */       ClassTransformer$.MODULE$.hadErrors_$eq(true);
/* 247 */       none$ = (None$)(BoxesRunTime.unboxToBoolean(inserter.apply(methodNode.instructions)) ? Option$.MODULE$.apply(writeClass(classNode, 3)) : None$.MODULE$); }
/*     */     else
/*     */     
/* 250 */     { (new String[3])[0] = "Failed patching "; (new String[3])[1] = "."; (new String[3])[2] = ", method not found."; li$cil$oc$common$asm$ClassTransformer$$log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { classNode.name, methodNames[0] })));
/* 251 */       ClassTransformer$.MODULE$.hadErrors_$eq(true);
/* 252 */       none$ = None$.MODULE$; }
/*     */     
/*     */     return (Option<byte[]>)none$;
/*     */   } public final class ClassTransformer$$anonfun$14 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String[] methodNames$1; private final String[] methodDescs$1; public final boolean apply(MethodNode method) { return (Predef$.MODULE$.refArrayOps((Object[])this.methodNames$1).contains(method.name) && Predef$.MODULE$.refArrayOps((Object[])this.methodDescs$1).contains(method.desc)); } public ClassTransformer$$anonfun$14(ClassTransformer $outer, String[] methodNames$1, String[] methodDescs$1) {} }
/* 257 */   public boolean li$cil$oc$common$asm$ClassTransformer$$classExists(String name) { return (loader().getClassBytes(name) != null || 
/* 258 */       loader().getClassBytes(FMLDeobfuscatingRemapper.INSTANCE.unmap(name)) != null || 
/* 259 */       liftedTree1$1(name)); } private final boolean liftedTree1$1(String name$2) { try {  } catch (ClassNotFoundException classNotFoundException) {} return false; }
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator<String> li$cil$oc$common$asm$ClassTransformer$$missingFromSignature(String desc)
/*     */   {
/* 265 */     return (new StringOps(Predef$.MODULE$.augmentString("L([^;]+);"))).r().findAllMatchIn(desc).map((Function1)new ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$1(this)).filter((Function1)new ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$2(this)); } public final class ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$1 extends AbstractFunction1<Regex.Match, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Regex.Match x$5) { return x$5.group(1); } public ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$1(ClassTransformer $outer) {} } public final class ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(String x$6) { return !this.$outer.li$cil$oc$common$asm$ClassTransformer$$classExists(x$6); }
/*     */     
/*     */     public ClassTransformer$$anonfun$li$cil$oc$common$asm$ClassTransformer$$missingFromSignature$2(ClassTransformer $outer) {} }
/*     */   
/* 269 */   public byte[] injectEnvironmentImplementation(ClassNode classNode) { (new String[2])[0] = "Injecting methods from Environment interface into "; (new String[2])[1] = "."; li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { classNode.name })));
/* 270 */     if (isTileEntity(classNode))
/*     */     
/*     */     { 
/*     */       
/* 274 */       ClassNode template = classNodeFor("li/cil/oc/common/asm/template/SimpleEnvironment");
/* 275 */       if (template == null) {
/* 276 */         throw new InjectionFailedException(this, "Could not find SimpleComponent template!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 291 */       inject$1("node", "()Lli/cil/oc/api/network/Node;", true, classNode, template);
/* 292 */       inject$1("onConnect", "(Lli/cil/oc/api/network/Node;)V", inject$default$3$1(), classNode, template);
/* 293 */       inject$1("onDisconnect", "(Lli/cil/oc/api/network/Node;)V", inject$default$3$1(), classNode, template);
/* 294 */       inject$1("onMessage", "(Lli/cil/oc/api/network/Message;)V", inject$default$3$1(), classNode, template);
/*     */       
/* 296 */       li$cil$oc$common$asm$ClassTransformer$$log().trace("Injecting / wrapping overrides for required tile entity methods.");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 341 */       replace$1(ObfNames$.MODULE$.Method_validate()[0], ObfNames$.MODULE$.Method_validate()[1], "()V", classNode, template);
/* 342 */       replace$1(ObfNames$.MODULE$.Method_invalidate()[0], ObfNames$.MODULE$.Method_invalidate()[1], "()V", classNode, template);
/* 343 */       replace$1(ObfNames$.MODULE$.Method_onChunkUnload()[0], ObfNames$.MODULE$.Method_onChunkUnload()[1], "()V", classNode, template);
/* 344 */       replace$1(ObfNames$.MODULE$.Method_readFromNBT()[0], ObfNames$.MODULE$.Method_readFromNBT()[1], "(Lnet/minecraft/nbt/NBTTagCompound;)V", classNode, template);
/* 345 */       replace$1(ObfNames$.MODULE$.Method_writeToNBT()[0], ObfNames$.MODULE$.Method_writeToNBT()[1], "(Lnet/minecraft/nbt/NBTTagCompound;)V", classNode, template);
/*     */       
/* 347 */       li$cil$oc$common$asm$ClassTransformer$$log().trace("Injecting interface.");
/* 348 */       classNode.interfaces.add("li/cil/oc/common/asm/template/SimpleComponentImpl");
/*     */       
/* 350 */       return writeClass(classNode, 3); }  throw new InjectionFailedException(this, "Found SimpleComponent on something that isn't a tile entity, ignoring."); }
/*     */   private final boolean inject$default$3$1() { return false; }
/*     */   public final boolean li$cil$oc$common$asm$ClassTransformer$$filter$1(MethodNode method, String methodName$1, String signature$1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield name : Ljava/lang/String;
/*     */     //   4: aload_2
/*     */     //   5: astore #4
/*     */     //   7: dup
/*     */     //   8: ifnonnull -> 20
/*     */     //   11: pop
/*     */     //   12: aload #4
/*     */     //   14: ifnull -> 28
/*     */     //   17: goto -> 60
/*     */     //   20: aload #4
/*     */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   25: ifeq -> 60
/*     */     //   28: aload_1
/*     */     //   29: getfield desc : Ljava/lang/String;
/*     */     //   32: aload_3
/*     */     //   33: astore #5
/*     */     //   35: dup
/*     */     //   36: ifnonnull -> 48
/*     */     //   39: pop
/*     */     //   40: aload #5
/*     */     //   42: ifnull -> 56
/*     */     //   45: goto -> 60
/*     */     //   48: aload #5
/*     */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   53: ifeq -> 60
/*     */     //   56: iconst_1
/*     */     //   57: goto -> 61
/*     */     //   60: iconst_0
/*     */     //   61: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #280	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	62	0	this	Lli/cil/oc/common/asm/ClassTransformer;
/*     */     //   0	62	1	method	Lorg/objectweb/asm/tree/MethodNode;
/*     */     //   0	62	2	methodName$1	Ljava/lang/String;
/*     */     //   0	62	3	signature$1	Ljava/lang/String; }
/*     */   private final void inject$1(String methodName, String signature, boolean required, ClassNode classNode$2, ClassNode template$1) { if (WrapAsScala$.MODULE$.asScalaBuffer(classNode$2.methods).exists((Function1)new ClassTransformer$$anonfun$inject$1$1(this, methodName, signature))) { if (required) { (new String[3])[0] = "Could not inject method '"; (new String[3])[1] = ""; (new String[3])[2] = "' because it was already present!"; throw new InjectionFailedException(this, (new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { methodName, signature }))); }  } else { Option option = WrapAsScala$.MODULE$.asScalaBuffer(template$1.methods).find((Function1)new ClassTransformer$$anonfun$15(this, methodName, signature)); if (option instanceof Some) { Some some = (Some)option; MethodNode method = (MethodNode)some.x(); classNode$2.methods.add(method); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new AssertionError(); }  }
/*     */   public final class ClassTransformer$$anonfun$inject$1$1 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String methodName$1; private final String signature$1; public final boolean apply(MethodNode method) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$filter$1(method, this.methodName$1, this.signature$1); } public ClassTransformer$$anonfun$inject$1$1(ClassTransformer $outer, String methodName$1, String signature$1) {} } public final class ClassTransformer$$anonfun$15 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/* 356 */     public static final long serialVersionUID = 0L; private final String methodName$1; private final String signature$1; public final boolean apply(MethodNode method) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$filter$1(method, this.methodName$1, this.signature$1); } public ClassTransformer$$anonfun$15(ClassTransformer $outer, String methodName$1, String signature$1) {} } private final void replace$1(String methodName, String methodNameSrg, String desc, ClassNode classNode$2, ClassNode template$1) { BoxedUnit boxedUnit; FMLDeobfuscatingRemapper mapper = FMLDeobfuscatingRemapper.INSTANCE; if (WrapAsScala$.MODULE$.asScalaBuffer(classNode$2.methods).exists((Function1)new ClassTransformer$$anonfun$replace$1$1(this, methodName, desc, mapper))) { (new String[2])[0] = "Delegator method name '"; (new String[2])[1] = "' is already in use."; throw new InjectionFailedException(this, (new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { (new StringBuilder()).append(methodName).append("_OpenComputers").toString() }))); }  Option option1 = WrapAsScala$.MODULE$.asScalaBuffer(classNode$2.methods).find((Function1)new ClassTransformer$$anonfun$16(this, methodName, methodNameSrg, desc, mapper)); if (option1 instanceof Some) { Some some = (Some)option1; MethodNode method = (MethodNode)some.x(); (new String[2])[0] = "Found original implementation of '"; (new String[2])[1] = "', wrapping."; li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { methodName }))); method.name = (new StringBuilder()).append(methodName).append("_OpenComputers").toString(); boxedUnit = BoxedUnit.UNIT; } else { (new String[2])[0] = "No original implementation of '"; (new String[2])[1] = "', will inject override."; li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { methodName }))); ensureNonFinalIn$1(classNode$2.superName, methodName, methodNameSrg, desc, mapper); Option option = WrapAsScala$.MODULE$.asScalaBuffer(template$1.methods).find((Function1)new ClassTransformer$$anonfun$18(this, methodName)); if (option instanceof Some) { Some some = (Some)option; MethodNode method = (MethodNode)some.x(); boolean bool = classNode$2.methods.add(method); }  (new String[2])[0] = "Couldn't find '"; (new String[2])[1] = "' in template implementation."; throw new AssertionError((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { (new StringBuilder()).append(methodName).append("_OpenComputers").toString() }))); }  Option option2 = WrapAsScala$.MODULE$.asScalaBuffer(template$1.methods).find((Function1)new ClassTransformer$$anonfun$19(this, methodName, methodNameSrg, desc, mapper)); if (option2 instanceof Some) { Some some = (Some)option2; MethodNode method = (MethodNode)some.x(); classNode$2.methods.add(method); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  (new String[2])[0] = "Couldn't find '"; (new String[2])[1] = "' in template implementation."; throw new AssertionError((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { methodName }))); } public final boolean isTileEntity(ClassNode classNode) { while (true) { (new String[2])[0] = "Checking if class "; (new String[2])[1] = " is a TileEntity..."; li$cil$oc$common$asm$ClassTransformer$$log().trace((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { classNode.name })));
/* 357 */       if (Predef$.MODULE$.refArrayOps((Object[])ObfNames$.MODULE$.Class_TileEntity()).contains(classNode.name)) {  }
/* 358 */       else { if (classNode.superName == null) return false;  classNode = classNodeFor(classNode.superName); continue; }  return (classNode == null) ? false : "JD-Core does not support Kotlin"; }  }
/*     */   public final boolean li$cil$oc$common$asm$ClassTransformer$$filter$2(MethodNode method, String methodName$2, String methodNameSrg$1, String desc$1, FMLDeobfuscatingRemapper mapper$1) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: aload_1
/*     */     //   3: getfield desc : Ljava/lang/String;
/*     */     //   6: invokevirtual mapMethodDesc : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   9: astore #6
/*     */     //   11: aload #5
/*     */     //   13: getstatic li/cil/oc/common/asm/ObfNames$.MODULE$ : Lli/cil/oc/common/asm/ObfNames$;
/*     */     //   16: invokevirtual Class_TileEntity : ()[Ljava/lang/String;
/*     */     //   19: iconst_1
/*     */     //   20: aaload
/*     */     //   21: aload_1
/*     */     //   22: getfield name : Ljava/lang/String;
/*     */     //   25: aload_1
/*     */     //   26: getfield desc : Ljava/lang/String;
/*     */     //   29: invokevirtual mapMethodName : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   32: astore #7
/*     */     //   34: new scala/collection/mutable/StringBuilder
/*     */     //   37: dup
/*     */     //   38: invokespecial <init> : ()V
/*     */     //   41: aload_1
/*     */     //   42: getfield name : Ljava/lang/String;
/*     */     //   45: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   48: aload #6
/*     */     //   50: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   53: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   56: new scala/collection/mutable/StringBuilder
/*     */     //   59: dup
/*     */     //   60: invokespecial <init> : ()V
/*     */     //   63: aload_2
/*     */     //   64: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   67: aload #4
/*     */     //   69: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   75: astore #9
/*     */     //   77: dup
/*     */     //   78: ifnonnull -> 90
/*     */     //   81: pop
/*     */     //   82: aload #9
/*     */     //   84: ifnull -> 98
/*     */     //   87: goto -> 102
/*     */     //   90: aload #9
/*     */     //   92: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 102
/*     */     //   98: iconst_1
/*     */     //   99: goto -> 103
/*     */     //   102: iconst_0
/*     */     //   103: istore #8
/*     */     //   105: new scala/collection/mutable/StringBuilder
/*     */     //   108: dup
/*     */     //   109: invokespecial <init> : ()V
/*     */     //   112: aload #7
/*     */     //   114: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   117: aload #6
/*     */     //   119: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   122: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   125: new scala/collection/mutable/StringBuilder
/*     */     //   128: dup
/*     */     //   129: invokespecial <init> : ()V
/*     */     //   132: aload_3
/*     */     //   133: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   136: aload #4
/*     */     //   138: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   141: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   144: astore #11
/*     */     //   146: dup
/*     */     //   147: ifnonnull -> 159
/*     */     //   150: pop
/*     */     //   151: aload #11
/*     */     //   153: ifnull -> 167
/*     */     //   156: goto -> 171
/*     */     //   159: aload #11
/*     */     //   161: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 171
/*     */     //   167: iconst_1
/*     */     //   168: goto -> 172
/*     */     //   171: iconst_0
/*     */     //   172: istore #10
/*     */     //   174: iload #8
/*     */     //   176: ifne -> 184
/*     */     //   179: iload #10
/*     */     //   181: ifeq -> 188
/*     */     //   184: iconst_1
/*     */     //   185: goto -> 189
/*     */     //   188: iconst_0
/*     */     //   189: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #300	-> 0
/*     */     //   #301	-> 11
/*     */     //   #302	-> 34
/*     */     //   #303	-> 105
/*     */     //   #304	-> 174
/*     */     //   #299	-> 189
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	190	0	this	Lli/cil/oc/common/asm/ClassTransformer;
/*     */     //   0	190	1	method	Lorg/objectweb/asm/tree/MethodNode;
/*     */     //   0	190	2	methodName$2	Ljava/lang/String;
/*     */     //   0	190	3	methodNameSrg$1	Ljava/lang/String;
/*     */     //   0	190	4	desc$1	Ljava/lang/String;
/*     */     //   0	190	5	mapper$1	Lcpw/mods/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper;
/*     */     //   11	179	6	descDeObf	Ljava/lang/String;
/*     */     //   34	156	7	methodNameDeObf	Ljava/lang/String;
/*     */     //   105	85	8	areSamePlain	Z
/*     */     //   174	16	10	areSameDeObf	Z }
/*     */   public final class ClassTransformer$$anonfun$replace$1$1 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String methodName$2;
/*     */     private final String desc$1;
/*     */     private final FMLDeobfuscatingRemapper mapper$1;
/*     */     public final boolean apply(MethodNode method) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: getfield name : Ljava/lang/String;
/*     */       //   4: new scala/collection/mutable/StringBuilder
/*     */       //   7: dup
/*     */       //   8: invokespecial <init> : ()V
/*     */       //   11: aload_0
/*     */       //   12: getfield methodName$2 : Ljava/lang/String;
/*     */       //   15: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   18: ldc '_OpenComputers'
/*     */       //   20: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   23: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   26: astore_2
/*     */       //   27: dup
/*     */       //   28: ifnonnull -> 39
/*     */       //   31: pop
/*     */       //   32: aload_2
/*     */       //   33: ifnull -> 46
/*     */       //   36: goto -> 85
/*     */       //   39: aload_2
/*     */       //   40: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   43: ifeq -> 85
/*     */       //   46: aload_0
/*     */       //   47: getfield mapper$1 : Lcpw/mods/fml/common/asm/transformers/deobf/FMLDeobfuscatingRemapper;
/*     */       //   50: aload_1
/*     */       //   51: getfield desc : Ljava/lang/String;
/*     */       //   54: invokevirtual mapMethodDesc : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   57: aload_0
/*     */       //   58: getfield desc$1 : Ljava/lang/String;
/*     */       //   61: astore_3
/*     */       //   62: dup
/*     */       //   63: ifnonnull -> 74
/*     */       //   66: pop
/*     */       //   67: aload_3
/*     */       //   68: ifnull -> 81
/*     */       //   71: goto -> 85
/*     */       //   74: aload_3
/*     */       //   75: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   78: ifeq -> 85
/*     */       //   81: iconst_1
/*     */       //   82: goto -> 86
/*     */       //   85: iconst_0
/*     */       //   86: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #306	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	87	0	this	Lli/cil/oc/common/asm/ClassTransformer$$anonfun$replace$1$1;
/*     */       //   0	87	1	method	Lorg/objectweb/asm/tree/MethodNode; }
/*     */     public ClassTransformer$$anonfun$replace$1$1(ClassTransformer $outer, String methodName$2, String desc$1, FMLDeobfuscatingRemapper mapper$1) {} } public final class ClassTransformer$$anonfun$16 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String methodName$2; private final String methodNameSrg$1; private final String desc$1; private final FMLDeobfuscatingRemapper mapper$1; public final boolean apply(MethodNode method) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$filter$2(method, this.methodName$2, this.methodNameSrg$1, this.desc$1, this.mapper$1); } public ClassTransformer$$anonfun$16(ClassTransformer $outer, String methodName$2, String methodNameSrg$1, String desc$1, FMLDeobfuscatingRemapper mapper$1) {} } private final void ensureNonFinalIn$1(String name, String methodName$2, String methodNameSrg$1, String desc$1, FMLDeobfuscatingRemapper mapper$1) { while (true) { ClassNode node = classNodeFor(name); if (node == null) {  } else { Option option = WrapAsScala$.MODULE$.asScalaBuffer(node.methods).find((Function1)new ClassTransformer$$anonfun$17(this, methodName$2, methodNameSrg$1, desc$1, mapper$1)); if (option instanceof Some) { Some some = (Some)option; MethodNode method = (MethodNode)some.x(); if ((method.access & 0x10) != 0) { (new String[3])[0] = "Method '"; (new String[3])[1] = "' is final in superclass "; (new String[3])[2] = "."; throw new InjectionFailedException(this, (new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { methodName$2, node.name.replace('/', '.') }))); }  BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  name = node.superName; continue; }  (name == null) ? BoxedUnit.UNIT : "JD-Core does not support Kotlin"; return; }  } public final class ClassTransformer$$anonfun$17 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String methodName$2; private final String methodNameSrg$1; private final String desc$1; private final FMLDeobfuscatingRemapper mapper$1; public final boolean apply(MethodNode method) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$filter$2(method, this.methodName$2, this.methodNameSrg$1, this.desc$1, this.mapper$1); } public ClassTransformer$$anonfun$17(ClassTransformer $outer, String methodName$2, String methodNameSrg$1, String desc$1, FMLDeobfuscatingRemapper mapper$1) {} } public final class ClassTransformer$$anonfun$18 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String methodName$2; public final boolean apply(MethodNode x$7) { String str = (new StringBuilder()).append(this.methodName$2).append("_OpenComputers").toString(); if (x$7.name == null) { if (str != null); } else if (x$7.name.equals(str)) {  }  } public ClassTransformer$$anonfun$18(ClassTransformer $outer, String methodName$2) {} } public final class ClassTransformer$$anonfun$19 extends AbstractFunction1<MethodNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String methodName$2; private final String methodNameSrg$1; private final String desc$1; private final FMLDeobfuscatingRemapper mapper$1; public final boolean apply(MethodNode method) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$filter$2(method, this.methodName$2, this.methodNameSrg$1, this.desc$1, this.mapper$1); } public ClassTransformer$$anonfun$19(ClassTransformer $outer, String methodName$2, String methodNameSrg$1, String desc$1, FMLDeobfuscatingRemapper mapper$1) {} } public final boolean isAssignable(ClassNode parent, ClassNode child) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 135
/*     */     //   4: aload_2
/*     */     //   5: ifnull -> 135
/*     */     //   8: aload_0
/*     */     //   9: aload_1
/*     */     //   10: invokevirtual isFinal : (Lorg/objectweb/asm/tree/ClassNode;)Z
/*     */     //   13: ifne -> 135
/*     */     //   16: aload_1
/*     */     //   17: getfield name : Ljava/lang/String;
/*     */     //   20: ldc_w 'java/lang/Object'
/*     */     //   23: astore #4
/*     */     //   25: dup
/*     */     //   26: ifnonnull -> 38
/*     */     //   29: pop
/*     */     //   30: aload #4
/*     */     //   32: ifnull -> 124
/*     */     //   35: goto -> 46
/*     */     //   38: aload #4
/*     */     //   40: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   43: ifne -> 124
/*     */     //   46: aload_1
/*     */     //   47: getfield name : Ljava/lang/String;
/*     */     //   50: aload_2
/*     */     //   51: getfield name : Ljava/lang/String;
/*     */     //   54: astore #5
/*     */     //   56: dup
/*     */     //   57: ifnonnull -> 69
/*     */     //   60: pop
/*     */     //   61: aload #5
/*     */     //   63: ifnull -> 124
/*     */     //   66: goto -> 77
/*     */     //   69: aload #5
/*     */     //   71: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   74: ifne -> 124
/*     */     //   77: aload_1
/*     */     //   78: getfield name : Ljava/lang/String;
/*     */     //   81: aload_2
/*     */     //   82: getfield superName : Ljava/lang/String;
/*     */     //   85: astore #6
/*     */     //   87: dup
/*     */     //   88: ifnonnull -> 100
/*     */     //   91: pop
/*     */     //   92: aload #6
/*     */     //   94: ifnull -> 124
/*     */     //   97: goto -> 108
/*     */     //   100: aload #6
/*     */     //   102: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   105: ifne -> 124
/*     */     //   108: aload_2
/*     */     //   109: getfield interfaces : Ljava/util/List;
/*     */     //   112: aload_1
/*     */     //   113: getfield name : Ljava/lang/String;
/*     */     //   116: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   121: ifeq -> 128
/*     */     //   124: iconst_1
/*     */     //   125: goto -> 136
/*     */     //   128: aload_2
/*     */     //   129: getfield superName : Ljava/lang/String;
/*     */     //   132: ifnonnull -> 137
/*     */     //   135: iconst_0
/*     */     //   136: ireturn
/*     */     //   137: aload_1
/*     */     //   138: aload_0
/*     */     //   139: aload_2
/*     */     //   140: getfield superName : Ljava/lang/String;
/*     */     //   143: invokevirtual classNodeFor : (Ljava/lang/String;)Lorg/objectweb/asm/tree/ClassNode;
/*     */     //   146: astore_2
/*     */     //   147: astore_1
/*     */     //   148: goto -> 0
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #362	-> 0
/*     */     //   #363	-> 16
/*     */     //   #364	-> 46
/*     */     //   #365	-> 77
/*     */     //   #366	-> 108
/*     */     //   #362	-> 124
/*     */     //   #367	-> 128
/*     */     //   #362	-> 135
/*     */     //   #367	-> 137
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	151	0	this	Lli/cil/oc/common/asm/ClassTransformer;
/*     */     //   0	151	1	parent	Lorg/objectweb/asm/tree/ClassNode;
/* 370 */     //   0	151	2	child	Lorg/objectweb/asm/tree/ClassNode; } public boolean isFinal(ClassNode node) { return ((node.access & 0x10) != 0); }
/*     */    public boolean isInterface(ClassNode node) {
/* 372 */     return (node != null && (node.access & 0x200) != 0);
/*     */   }
/*     */   public ClassNode classNodeFor(String name) {
/* 375 */     String namePlain = name.replace('/', '.');
/* 376 */     byte[] bytes = loader().getClassBytes(namePlain);
/*     */ 
/*     */     
/* 379 */     String nameObfed = FMLDeobfuscatingRemapper.INSTANCE.unmap(name).replace('/', '.');
/* 380 */     byte[] arrayOfByte1 = loader().getClassBytes(nameObfed);
/* 381 */     return (bytes != null) ? newClassNode(bytes) : ((arrayOfByte1 == null) ? null : 
/* 382 */       newClassNode(arrayOfByte1));
/*     */   }
/*     */ 
/*     */   
/*     */   public ClassNode newClassNode(byte[] data) {
/* 387 */     ClassNode classNode = new ClassNode();
/* 388 */     (new ClassReader(data)).accept((ClassVisitor)classNode, 0);
/* 389 */     return classNode;
/*     */   }
/*     */   
/* 392 */   public int writeClass$default$2() { return 1; }
/* 393 */   public byte[] writeClass(ClassNode classNode, int flags) { ClassWriter writer = new ClassTransformer$$anon$1(this, flags);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     classNode.accept(writer);
/* 411 */     return writer.toByteArray(); } public static void hadSimpleComponentErrors_$eq(boolean paramBoolean) { ClassTransformer$.MODULE$.hadSimpleComponentErrors_$eq(paramBoolean); } public static boolean hadSimpleComponentErrors() { return ClassTransformer$.MODULE$.hadSimpleComponentErrors(); } public static void hadErrors_$eq(boolean paramBoolean) { ClassTransformer$.MODULE$.hadErrors_$eq(paramBoolean); } public static boolean hadErrors() { return ClassTransformer$.MODULE$.hadErrors(); } public final class ClassTransformer$$anon$1 extends ClassWriter {
/*     */     public ClassTransformer$$anon$1(ClassTransformer $outer, int flags$1) { super(flags$1); } public String getCommonSuperClass(String type1, String type2) { ClassNode node1 = this.$outer.classNodeFor(type1); ClassNode node2 = this.$outer.classNodeFor(type2); if (this.$outer.isInterface(node1) || this.$outer.isInterface(node2)) {  } else { ClassNode parent = (ClassNode)Option$.MODULE$.apply(node1).map((Function1)new ClassTransformer$$anon$1$$anonfun$20(this)).map((Function1)new ClassTransformer$$anon$1$$anonfun$21(this)).orNull(Predef$.MODULE$.$conforms()); while (true) { if (parent == null || parent.superName == null || this.$outer.isAssignable(parent, node2)) return (parent == null) ? "java/lang/Object" : parent.name;  parent = this.$outer.classNodeFor(parent.superName); }  }  return this.$outer.isAssignable(node1, node2) ? node1.name : (this.$outer.isAssignable(node2, node1) ? node2.name : "JD-Core does not support Kotlin"); } public final class ClassTransformer$$anon$1$$anonfun$20 extends AbstractFunction1<ClassNode, String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final String apply(ClassNode x$8) { return x$8.superName; } public ClassTransformer$$anon$1$$anonfun$20(ClassTransformer$$anon$1 $outer) {} } public final class ClassTransformer$$anon$1$$anonfun$21 extends AbstractFunction1<String, ClassNode> implements Serializable {
/* 414 */       public static final long serialVersionUID = 0L; public final ClassNode apply(String name) { return this.$outer.li$cil$oc$common$asm$ClassTransformer$$anon$$$outer().classNodeFor(name); } public ClassTransformer$$anon$1$$anonfun$21(ClassTransformer$$anon$1 $outer) {} } } public class InjectionFailedException extends Exception { public InjectionFailedException(ClassTransformer $outer, String message) { super(message); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\asm\ClassTransformer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */