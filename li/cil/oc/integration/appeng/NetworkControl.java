/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import appeng.api.networking.crafting.ICraftingLink;
/*     */ import appeng.api.storage.data.IAEItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\031ubaB\001\003!\003\r\t!\004\002\017\035\026$xo\034:l\007>tGO]8m\025\t\031A!\001\004baB,gn\032\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\026\0059\0013C\001\001\020!\t\0012#D\001\022\025\005\021\022!B:dC2\f\027B\001\013\022\005\031\te.\037*fM\")a\003\001C\001/\0051A%\0338ji\022\"\022\001\007\t\003!eI!AG\t\003\tUs\027\016\036\005\0069\0011\t!H\001\005i&dW-F\001\037!\ty\002\005\004\001\005\013\005\002!\031\001\022\003\r\005+E+\0337f#\t\031c\005\005\002\021I%\021Q%\005\002\005\035VdGN\005\003(SMbd\001\002\025\001\001\031\022A\002\020:fM&tW-\\3oiz\002\"AK\031\016\003-R!\001L\027\002\025QLG.Z3oi&$\030P\003\002/_\005IQ.\0338fGJ\fg\r\036\006\002a\005\031a.\032;\n\005IZ#A\003+jY\026,e\016^5usB\021AGO\007\002k)\021agN\001\bQ\026d\007/\032:t\025\tA\024(\001\002nK*\t1!\003\002<k\tq\021j\022:jIB\023x\016_=bE2,\007CA\037E\033\005q$BA A\003!\031XmY;sSRL(BA!C\003)qW\r^<pe.Lgn\032\006\003\007f\n1!\0319j\023\t)eHA\006J\003\016$\030n\0348I_N$\b\"B$\001\r\003A\025\001\0028pI\026,\022!\023\t\003\025:k\021a\023\006\003\0316\013qA\\3uo>\0248N\003\002D\r%\021qj\023\002\005\035>$W\rC\003R\001\021%!+\001\005bY2LE/Z7t+\005\031\006c\001+]?:\021QK\027\b\003-fk\021a\026\006\00312\ta\001\020:p_Rt\024\"\001\n\n\005m\013\022a\0029bG.\fw-Z\005\003;z\023\001\"\023;fe\006\024G.\032\006\0037F\001\"\001Y3\016\003\005T!AY2\002\t\021\fG/\031\006\003I\n\013qa\035;pe\006<W-\003\002gC\na\021*Q#Ji\026l7\013^1dW\")\001\016\001C\005%\006i\021\r\0347De\0064G/\0312mKNDQA\033\001\005\002-\fqaZ3u\007B,8\017F\002m_^\0042\001E7\020\023\tq\027CA\003BeJ\f\027\020C\003qS\002\007\021/A\004d_:$X\r\037;\021\005I,X\"A:\013\005Ql\025aB7bG\"Lg.Z\005\003mN\024qaQ8oi\026DH\017C\003yS\002\007\0210\001\003be\036\034\bC\001:{\023\tY8OA\005Be\036,X.\0328ug\"2\021.`A\001\003\007\001\"A\035@\n\005}\034(\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002\006\005Af-\0368di&|g\016K\025;i\006\024G.\032\021.[\001:U\r\036\021bA1L7\017\036\021pM\002\"\030M\0317fg\002\022X\r\035:fg\026tG/\0338hAQDW\rI1wC&d\027M\0317fA\r\003Vk\035\021j]\002\"\b.\032\021oKR<xN]6/\021\035\tI\001\001C\001\003\027\tQbZ3u\007J\fg\r^1cY\026\034H#\0027\002\016\005=\001B\0029\002\b\001\007\021\017\003\004y\003\017\001\r!\037\025\b\003\017i\030\021AA\nC\t\t)\"A9gk:\034G/[8oQm3\027\016\034;fej\"\030M\0317f;&RD/\0312mK\002jS\006I$fi\002\n\007\005\\5ti\002zg\rI6o_^t\007%\033;f[\002\022XmY5qKNt\003\005\0265fg\026\0043-\0318!E\026\004So]3eAQ|\007%[:tk\026\0043M]1gi&tw\r\t:fcV,7\017^:/\021\035\tI\002\001C\001\0037\t\021cZ3u\023R,Wn]%o\035\026$xo\034:l)\025a\027QDA\020\021\031\001\030q\003a\001c\"1\0010a\006A\002eDs!a\006~\003\003\t\031#\t\002\002&\005\001f-\0368di&|g\016K.gS2$XM\035\036uC\ndW-X\025;i\006\024G.\032\021.[\001:U\r\036\021bA1L7\017\036\021pM\002\"\b.\032\021ti>\024X\r\032\021ji\026l7\017I5oAQDW\r\t8fi^|'o\033\030\t\017\005%\002\001\"\001\002,\005)r-\032;Ji\026l7/\0238OKR<xN]6Cs&#G#\0027\002.\005=\002B\0029\002(\001\007\021\017\003\004y\003O\001\r!\037\025\b\003Oi\030\021AA\032C\t\t)$AA\002MVt7\r^5p]\"2\027\016\034;fej\"\030M\0317fSi\"\030M\0317fA5j\003eR3uA\005\004C.[:uA=4\007\005\0365fAM$xN]3eA%$X-\\:!S:\004C\017[3!]\026$xo\034:lA5\fGo\0315j]\036\004C\017[3!M&dG/\032:/A\031KG\016^3sA%\034\b%\0318!\003J\024\030-\037\021pM\002JE/Z7!\023\022\033\bBB)\001\t\003\tI\004F\003m\003w\ti\004\003\004q\003o\001\r!\035\005\007q\006]\002\031A=)\017\005]R0!\001\002B\005\022\0211I\001XMVt7\r^5p]\"J#(^:fe\022\fG/\031\021.[\001:U\r\036\021b]\002JG/\032:bi>\024\be\0342kK\016$\bEZ8sAQDW\r\t7jgR\004sN\032\021uQ\026\004\023\016^3ng\002Jg\016\t;iK\002rW\r^<pe.t\003bBA$\001\021\005\021\021J\001\006gR|'/\032\013\006Y\006-\023Q\n\005\007a\006\025\003\031A9\t\ra\f)\0051\001zQ\035\t)%`A\001\003#\n#!a\025\002\003w2WO\\2uS>t\007FZ5mi\026\024(\b^1cY\026d\003\005\0322BI\022\024Xm]:;gR\024\030N\\4\\Y\001\032H/\031:u'2|GO\0178v[\n,'o\027\027!G>,h\016\036\036ok6\024WM]/^Si\002#i\\8mK\006t\007%L\027!'R|'/\032\021ji\026l7\017I5oAQDW\r\t8fi^|'o\033\021nCR\034\007.\0338hAQDW\rI:qK\016Lg-[3eA\031LG\016^3sA%t\007\005\0365fA\021\fG/\0312bg\026\004s/\033;iAQDW\rI:qK\016Lg-[3eA\005$GM]3tg:Bq!a\026\001\t\023\tI&\001\bjg\032cW/\0333WSNL'\r\\3\025\t\005m\023\021\r\t\004!\005u\023bAA0#\t9!i\\8mK\006t\007\002CA2\003+\002\r!!\032\002\013M$\030mY6\021\007\001\f9'C\002\002j\005\024Q\"S!F\r2,\030\016Z*uC\016\\\007bBA7\001\021\005\021qN\001\023O\026$h\t\\;jINLeNT3uo>\0248\016F\003m\003c\n\031\b\003\004q\003W\002\r!\035\005\007q\006-\004\031A=)\017\005-T0!\001\002x\005\022\021\021P\001DMVt7\r^5p]\"J#\b^1cY\026\004S&\f\021HKR\004\023\r\t7jgR\004sN\032\021uQ\026\0043\017^8sK\022\004c\r\\;jIN\004\023N\034\021uQ\026\004c.\032;x_J\\g\006C\004\002~\001!\t!a \002)\035,G/\021<h!><XM]%oU\026\034G/[8o)\025a\027\021QAB\021\031\001\0301\020a\001c\"1\0010a\037A\002eDs!a\037~\003\003\t9)\t\002\002\n\0061e-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;!i\",\007%\031<fe\006<W\r\t9po\026\024\b%\0338kK\016$\030n\0348!S:$x\016\t;iK\002rW\r^<pe.t\003bBAG\001\021\005\021qR\001\021O\026$\030I^4Q_^,'/V:bO\026$R\001\\AI\003'Ca\001]AF\001\004\t\bB\002=\002\f\002\007\021\020K\004\002\fv\f\t!a&\"\005\005e\025\001\0214v]\016$\030n\0348)SirW/\0342fe\002jS\006I$fi\002\"\b.\032\021bm\026\024\030mZ3!a><XM\035\021vg\006<W\rI8gAQDW\r\t8fi^|'o\033\030\t\017\005u\005\001\"\001\002 \006\tr-\032;JI2,\007k\\<feV\033\030mZ3\025\0131\f\t+a)\t\rA\fY\n1\001r\021\031A\0301\024a\001s\":\0211T?\002\002\005\035\026EAAU\003u2WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\004\023\016\0327fAA|w/\032:!kN\fw-\032\021pM\002\"\b.\032\021oKR<xN]6/\021\035\ti\013\001C\001\003_\013\021cZ3u\033\006D8\013^8sK\022\004vn^3s)\025a\027\021WAZ\021\031\001\0301\026a\001c\"1\0010a+A\002eDs!a+~\003\003\t9,\t\002\002:\006\te-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;!i\",\007%\\1yS6,X\016I:u_J,G\r\t9po\026\024\b%\0338!i\",\007E\\3uo>\0248N\f\005\b\003{\003A\021AA`\00399W\r^*u_J,G\rU8xKJ$R\001\\Aa\003\007Da\001]A^\001\004\t\bB\002=\002<\002\007\021\020K\004\002<v\f\t!a2\"\005\005%\027A\0174v]\016$\030n\0348)SirW/\0342fe\002jS\006I$fi\002\"\b.\032\021ti>\024X\r\032\021q_^,'\017I5oAQDW\r\t8fi^|'o\033\030!\021\035\ti\r\001C\005\003\037\fq!\\1uG\",7\017\006\004\002\\\005E\027\021\037\005\t\003G\nY\r1\001\002TB9\021Q[Ap\003G|QBAAl\025\021\tI.a7\002\tU$\030\016\034\006\003\003;\fAA[1wC&!\021\021]Al\005\035A\025m\0355NCB\004B!!:\002l:\031\001#a:\n\007\005%\030#\001\004Qe\026$WMZ\005\005\003[\fyO\001\004TiJLgn\032\006\004\003S\f\002\002CAz\003\027\004\r!!>\002\r\031LG\016^3s!\035\t9P!\001\002d>i!!!?\013\t\005m\030Q`\001\b[V$\030M\0317f\025\r\ty0E\001\013G>dG.Z2uS>t\027\002\002B\002\003s\0241!T1q\017\035\0219A\001E\001\005\023\taBT3uo>\0248nQ8oiJ|G\016\005\003\003\f\t5Q\"\001\002\007\r\005\021\001\022\001B\b'\r\021ia\004\005\t\005'\021i\001\"\001\003\026\0051A(\0338jiz\"\"A!\003\007\017\te!Q\002\001\003\034\tI1I]1gi\006\024G.Z\n\007\005/\021iB!\013\021\t\t}!QE\007\003\005CQ1Aa\tN\003\031\001(/\0324bE&!!q\005B\021\0055\t%m\035;sC\016$h+\0317vKB!!1\006B\031\033\t\021iCC\002\0030\001\013\001b\031:bMRLgnZ\005\005\005g\021iC\001\nJ\007J\fg\r^5oOJ+\027/^3ti\026\024\bb\003B\034\005/\021\t\031!C\001\005s\t!bY8oiJ|G\016\\3s+\t\021YDE\003\003>%\032DH\002\004)\005\033\001!1\b\005\f\005\003\0229B!a\001\n\003\021\031%\001\bd_:$(o\0347mKJ|F%Z9\025\007a\021)\005\003\006\003H\t}\022\021!a\001\005w\t1\001\037\0232\021-\021YEa\006\003\002\003\006KAa\017\002\027\r|g\016\036:pY2,'\017\t\005\f\003G\0229B!a\001\n\003\021y%F\001`\021-\021\031Fa\006\003\002\004%\tA!\026\002\023M$\030mY6`I\025\fHc\001\r\003X!I!q\tB)\003\003\005\ra\030\005\013\0057\0229B!A!B\023y\026AB:uC\016\\\007\005\003\005\003\024\t]A\021\001B0)\031\021\tG!\032\003lA!!1\rB\f\033\t\021i\001\003\005\0038\tu\003\031\001B4%\025\021I'K\032=\r\031A#Q\002\001\003h!9\0211\rB/\001\004y\006\002\003B\n\005/!\tAa\034\025\005\t\005\004B\003B:\005/\021\r\021\"\003\003v\005)A.\0338lgV\021!q\017\t\007\003o\024IH! \n\t\tm\024\021 \002\004'\026$\b\003\002B\026\005JAA!!\003.\ti\021j\021:bMRLgn\032'j].D\021B!\"\003\030\001\006IAa\036\002\r1Lgn[:!\021!\021IIa\006\005B\t-\025\001E4fiJ+\027/^3ti\026$'j\0342t)\t\021i\t\005\004\003\020\n\005&QP\007\003\005#SAAa%\003\026\00691m\0347mK\016$(\002\002BL\0053\013aaY8n[>t'\002\002BN\005;\013aaZ8pO2,'B\001BP\003\r\031w.\\\005\005\005G\023\tJ\001\007J[6,H/\0312mKN+G\017\003\005\003(\n]A\021\tBU\0039QwNY*uCR,7\t[1oO\026$2\001\007BV\021!\021iK!*A\002\tu\024\001\0027j].D\001B!-\003\030\021\005#1W\001\023S:TWm\031;De\0064G/\0323Ji\026l7\017F\004`\005k\0239L!/\t\021\t5&q\026a\001\005{Bq!a\031\0030\002\007q\f\003\005\003<\n=\006\031\001B_\003\t\0018\007\005\003\003@\n\025WB\001Ba\025\r\021\031MQ\001\007G>tg-[4\n\t\t\035'\021\031\002\013\003\016$\030n\0348bE2,\007\002\003Bf\005/!\tE!4\002#\035,G/Q2uS>t\027M\0317f\035>$W\r\006\002\003PB!!\021\033Bj\033\005\001\025b\001Bk\001\nI\021j\022:jI:{G-\032\005\t\0053\0249\002\"\021\003\\\0061r-\032;DC\ndWmQ8o]\026\034G/[8o)f\004X\r\006\003\003^\n\035\b\003\002Bp\005Gl!A!9\013\007\005e')\003\003\003f\n\005(aC!F\007\006\024G.\032+za\026D\001B!;\003X\002\007!1^\001\005g&$W\r\005\003\003n\n]XB\001Bx\025\021\tIN!=\013\t\t]%1\037\006\004\005k|\023AD7j]\026\034'/\0314uM>\024x-Z\005\005\005s\024yO\001\bG_J<W\rR5sK\016$\030n\0348\t\017\tu(q\003C!/\005i1/Z2ve&$\030P\021:fC.D\001b!\001\003\030\021\00531A\001\fO\026$xI]5e\035>$W\r\006\003\003P\016\025\001\002\003Bu\005\004\rAa;\t\021\r%!q\003C\001\007\027\tAbZ3u\023R,Wn\025;bG.$R\001\\B\007\007\037Aa\001]B\004\001\004\t\bB\002=\004\b\001\007\021\020K\004\004\bu\f\taa\005\"\005\rU\021!\0254v]\016$\030n\0348)Si\"\030M\0317fA5j\003EU3ukJt7\017\t;iK\002JG/Z7!gR\f7m\033\021sKB\024Xm]3oi\006$\030n\0348!_\032\004C\017[3!GJ\fg\r^5oO\002\022Xm];mi:B\001b!\007\003\030\021\00511D\001\be\026\fX/Z:u)\025a7QDB\020\021\031\0018q\003a\001c\"1\001pa\006A\002eDsaa\006~\003\003\031\031#\t\002\004&\005\tiFZ;oGRLwN\034\025\\C6|WO\034;;S:$8\f\f\021qe&|'/\033;ju\026\004vn^3su\t|w\016\\3b]nc\003e\0319v\035\006lWMO:ue&tw-X/^Si*8/\032:eCR\f\007%L\027!%\026\fX/Z:ug\002\"\b.\032\021ji\026l\007\005^8!E\026\0043M]1gi\026$G\006\t:fiV\024h.\0338hA\005t\007e\0342kK\016$\b\005\0365bi\002\nG\016\\8xg\002\"(/Y2lS:<\007\005\0365fA\r\024\030M\032;j]\036\0043\017^1ukNt\003\002CB\025\005/!\tea\013\002\t1|\027\r\032\013\0041\r5\002\002CB\030\007O\001\ra!\r\002\0079\024G\017\005\003\0044\r]RBAB\033\025\r\031y#L\005\005\007s\031)D\001\bO\005R#\026mZ\"p[B|WO\0343\t\021\ru\"q\003C!\007\tAa]1wKR\031\001d!\021\t\021\r=21\ba\001\007c1qa!\022\003\016\001\0319EA\002DaV\034Baa\021\003\036!Y!qGB\"\005\003\007I\021AB&+\t\031iE\005\003\004P%\032dA\002\025\003\016\001\031i\005C\006\003B\r\r#\0211A\005\002\rMCc\001\r\004V!Q!qIB)\003\003\005\ra!\024\t\027\t-31\tB\001B\003&1Q\n\005\f\0077\032\031E!a\001\n\003\031i&A\003j]\022,\0070\006\002\004`A\031\001c!\031\n\007\r\r\024CA\002J]RD1ba\032\004D\t\005\r\021\"\001\004j\005I\021N\0343fq~#S-\035\013\0041\r-\004B\003B$\007K\n\t\0211\001\004`!Y1qNB\"\005\003\005\013\025BB0\003\031Ig\016Z3yA!Y11OB\"\005\003\007I\021AB;\003\r\031\007/^\013\003\007o\002Ba!\037\004\0046\02111\020\006\005\007{\032y(A\bj[BdW-\\3oi\006$\030n\0348t\025\r\031\tiN\001\bG2,8\017^3s\023\021\031)ia\037\003%\r\023\030M\032;j]\036\034\005+V\"mkN$XM\035\005\f\007\023\033\031E!a\001\n\003\031Y)A\004daV|F%Z9\025\007a\031i\t\003\006\003H\r\035\025\021!a\001\007oB1b!%\004D\t\005\t\025)\003\004x\005!1\r];!\021!\021\031ba\021\005\002\rUE\003CBL\0073\033yj!)\021\t\t\r41\t\005\t\005o\031\031\n1\001\004\034J!1QT\0254\r\031A#Q\002\001\004\034\"A11LBJ\001\004\031y\006\003\005\004t\rM\005\031AB<\021!\021\031ba\021\005\002\r\025FCABL\021!\031Ika\021\005\002\r-\026AB2b]\016,G\016F\003m\007[\033y\013\003\004q\007O\003\r!\035\005\007q\016\035\006\031A=)\017\r\035V0!\001\0044\006\0221QW\001<MVt7\r^5p]\"J#HY8pY\026\fg\016I\027.A\r\013gnY3mAQD\027n\035\021D!V\0033-\036:sK:$\be\031:bMRLgn\032\021k_\nt\003\002CB]\007\007\"\taa/\002\021%\034\030i\031;jm\026$R\001\\B_\007Ca\001]B\\\001\004\t\bB\002=\0048\002\007\021\020K\004\0048v\f\taa1\"\005\r\025\027\001\n4v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021Jg\002\032\007/\036\021bGRLg/Z \t\021\r%71\tC\001\007\027\fa![:CkNLH#\0027\004N\016=\007B\0029\004H\002\007\021\017\003\004y\007\017\004\r!\037\025\b\007\017l\030\021ABjC\t\031).\001\022gk:\034G/[8oQ%R$m\\8mK\006t\007%L\027!\023N\0043\r];!EV\034\030p\020\005\t\0073\034\031\005\"\001\004\\\006Y\021m\031;jm\026LE/Z7t)\025a7Q\\Bp\021\031\0018q\033a\001c\"1\001pa6A\002eDsaa6~\003\003\031\031/\t\002\004f\006\001d-\0368di&|g\016K\025;i\006\024G.\032\021.[\001:U\r\036\021dkJ\024XM\034;ms\002\032'/\0314uK\022\004\023\016^3ng:B\001b!;\004D\021\00511^\001\ra\026tG-\0338h\023R,Wn\035\013\006Y\01658q\036\005\007a\016\035\b\031A9\t\ra\0349\0171\001zQ\035\0319/`A\001\007g\f#a!>\002M\031,hn\031;j_:D\023F\017;bE2,\007%L\027!\017\026$\b\005]3oI&tw\rI5uK6\034h\006\003\005\004z\016\rC\021AB~\003-\031Ho\034:fI&#X-\\:\025\0131\034ipa@\t\rA\0349\0201\001r\021\031A8q\037a\001s\":1q_?\002\002\021\r\021E\001C\003\003\0252WO\\2uS>t\007&\013\036uC\ndW\rI\027.A\035+G\017I:u_J,G\rI5uK6\034h\006\003\005\005\n\r\rC\021\001C\006\003-1\027N\\1m\037V$\b/\036;\025\0131$i\001b\004\t\rA$9\0011\001r\021\031AHq\001a\001s\":AqA?\002\002\021M\021E\001C\013\00392WO\\2uS>t\007&\013\036uC\ndW\rI\027.A\035+G\017I2sC\032$\030N\\4!M&t\027\r\034\021pkR\004X\017\036\030\t\021\021e11\tC\005\007k\naaZ3u\007B,\b\002CB\037\007\007\"\t\005\"\b\025\007a!y\002\003\005\0040\021m\001\031AB\031\021!\031Ica\021\005B\021\rBc\001\r\005&!A1q\006C\021\001\004\031\tDB\004\005*\t5\001\001b\013\003\035\r\023\030M\032;j]\036\034F/\031;vgN!Aq\005B\017\021!\021\031\002b\n\005\002\021=BC\001C\031!\021\021\031\007b\n\t\025\021UBq\005a\001\n\023!9$A\006jg\016{W\016];uS:<WCAA.\021)!Y\004b\nA\002\023%AQH\001\020SN\034u.\0349vi&twm\030\023fcR\031\001\004b\020\t\025\t\035C\021HA\001\002\004\tY\006C\005\005D\021\035\002\025)\003\002\\\005a\021n]\"p[B,H/\0338hA!Q!Q\026C\024\001\004%I\001b\022\026\005\021%\003#\002\t\005L\tu\024b\001C'#\t1q\n\035;j_:D!\002\"\025\005(\001\007I\021\002C*\003!a\027N\\6`I\025\fHc\001\r\005V!Q!q\tC(\003\003\005\r\001\"\023\t\023\021eCq\005Q!\n\021%\023!\0027j].\004\003B\003C/\tO\001\r\021\"\003\0058\0051a-Y5mK\022D!\002\"\031\005(\001\007I\021\002C2\003)1\027-\0337fI~#S-\035\013\0041\021\025\004B\003B$\t?\n\t\0211\001\002\\!IA\021\016C\024A\003&\0211L\001\bM\006LG.\0323!\021)!i\007b\nA\002\023%AqN\001\007e\026\f7o\0348\026\005\021E\004\003\002C:\tsj!\001\"\036\013\t\021]\0241\\\001\005Y\006tw-\003\003\002n\022U\004B\003C?\tO\001\r\021\"\003\005\000\005Q!/Z1t_:|F%Z9\025\007a!\t\t\003\006\003H\021m\024\021!a\001\tcB\021\002\"\"\005(\001\006K\001\"\035\002\017I,\027m]8oA!AA\021\022C\024\t\003!Y)A\004tKRd\025N\\6\025\007a!i\t\003\005\005\020\022\035\005\031\001B?\003\0251\030\r\\;f\021!!\031\nb\n\005\002\021U\025\001\0024bS2$2\001\007CL\021!!i\007\"%A\002\005\r\b\002\003C\033\tO!\t\001b'\025\0131$i\nb(\t\rA$I\n1\001r\021\031AH\021\024a\001s\":A\021T?\002\002\021\r\026E\001CS\00393WO\\2uS>t\007&\013\036c_>dW-\0318![5\002s)\032;!o\",G\017[3sAQDW\rI2sC\032$\030N\\4!e\026\fX/Z:uA%\034\beY;se\026tG\017\\=!G>l\007/\036;j]\036t\003\002\003CU\tO!\t\001b+\002\023!\f7OR1jY\026$G#\0027\005.\022=\006B\0029\005(\002\007\021\017\003\004y\tO\003\r!\037\025\b\tOk\030\021\001CZC\t!),\001\"gk:\034G/[8oQ%R$m\\8mK\006t\007%L\027!\017\026$\be\0365fi\",'\017\t;iK\002\032'/\0314uS:<\007E]3rk\026\034H\017\t5bg\0022\027-\0337fI:B\001\002\"/\005(\021\005A1X\001\013SN\034\025M\\2fY\026$G#\0027\005>\022}\006B\0029\0058\002\007\021\017\003\004y\to\003\r!\037\025\b\tok\030\021\001CbC\t!)-A%gk:\034G/[8oQ%R$m\\8mK\006t\007%L\027!\017\026$\be\0365fi\",'\017\t;iK\002\032'/\0314uS:<\007E]3rk\026\034H\017\t5bg\002\022W-\0328!G\006t7-\0327fI:B\001\002\"3\005(\021\005A1Z\001\007SN$uN\\3\025\0131$i\rb4\t\rA$9\r1\001r\021\031AHq\031a\001s\":AqY?\002\002\021M\027E\001Ck\003}2WO\\2uS>t\007&\013\036c_>dW-\0318![5\002s)\032;!o\",G\017[3sAQDW\rI2sC\032$\030N\\4!e\026\fX/Z:uA%\034\b\005Z8oK:B\001b!\020\005(\021\005C\021\034\013\0041\021m\007\002CB\030\t/\004\ra!\r\t\021\r%Bq\005C!\t?$2\001\007Cq\021!\031y\003\"8A\002\rEba\002Cs\005\033\001Aq\035\002\020\035\026$xo\034:l\007>tG/\0328ugN1A1\035B\017\tS\004R\001b;\005n~k\021aY\005\004\t_\034'!G%N\0136{g.\033;pe\"\013g\016\0327feJ+7-Z5wKJD1Ba\016\005d\n\005\r\021\"\001\005tV\021AQ\037\n\006\toL3\007\020\004\007Q\t5\001\001\">\t\027\t\005C1\035BA\002\023\005A1 \013\0041\021u\bB\003B$\ts\f\t\0211\001\005v\"Y!1\nCr\005\003\005\013\025\002C{\021!\021\031\002b9\005\002\025\rA\003BC\003\013\017\001BAa\031\005d\"A!qGC\001\001\004)IAE\003\006\f%\032DH\002\004)\005\033\001Q\021\002\005\t\005'!\031\017\"\001\006\020Q\021QQ\001\005\013\013'!\031\0171A\005\n\021]\022!D1eI\026$G*[:uK:,'\017\003\006\006\030\021\r\b\031!C\005\0133\t\021#\0313eK\022d\025n\035;f]\026\024x\fJ3r)\rAR1\004\005\013\005\017*)\"!AA\002\005m\003\"CC\020\tG\004\013\025BA.\0039\tG\rZ3e\031&\034H/\0328fe\002B!\"b\t\005d\002\007I\021BC\023\003\025IG/Z7t+\t)9\003\005\003a\013Sy\026bAC\026C\nI\021*\023;f[2K7\017\036\005\013\013_!\031\0171A\005\n\025E\022!C5uK6\034x\fJ3r)\rAR1\007\005\013\005\017*i#!AA\002\025\035\002\"CC\034\tG\004\013\025BC\024\003\031IG/Z7tA!QQ1\bCr\001\004%I!\"\020\002\031%$X-\\%uKJ\fGo\034:\026\005\025}\002#BAk\013\003z\026\002BC\"\003/\024\001\"\023;fe\006$xN\035\005\013\013\017\"\031\0171A\005\n\025%\023\001E5uK6LE/\032:bi>\024x\fJ3r)\rAR1\n\005\013\005\017*)%!AA\002\025}\002\"CC(\tG\004\013\025BC \0035IG/Z7Ji\026\024\030\r^8sA!Q11\fCr\001\004%Ia!\030\t\025\r\035D1\035a\001\n\023))\006F\002\031\013/B!Ba\022\006T\005\005\t\031AB0\021%\031y\007b9!B\023\031y\006\003\005\006^\021\rH\021IC0\003\021\031\027\r\0347\025\0131,\t'b\031\t\rA,Y\0061\001r\021\035))'b\027A\002e\f\021\"\031:hk6,g\016^:\t\021\r%B1\035C!\013S\"2\001GC6\021!\031y#b\032A\002\rE\002\002CB\037\tG$\t%b\034\025\007a)\t\b\003\005\0040\0255\004\031AB\031\021)))\bb9A\002\023%AqG\001\006m\006d\027\016\032\005\013\013s\"\031\0171A\005\n\025m\024!\003<bY&$w\fJ3r)\rARQ\020\005\013\005\017*9(!AA\002\005m\003\"CCA\tG\004\013\025BA.\003\0311\030\r\\5eA!AQQ\021Cr\t\003*9)A\004eSN\004xn]3\025\007a)I\t\003\004q\013\007\003\r!\035\005\t\013\033#\031\017\"\021\006\020\0069\021n\035,bY&$G\003BA.\013#C\001\"b%\006\f\002\007QQS\001\022m\026\024\030NZ5dCRLwN\034+pW\026t\007c\001\t\006\030&\031Q\021T\t\003\007\005s\027\020C\004\006\036\022\rH\021I\f\002\031=tG*[:u+B$\027\r^3\t\021\025\005F1\035C!\013G\013!\002]8ti\016C\027M\\4f)\035ARQUCZ\013wC\001\"b*\006 \002\007Q\021V\001\b[>t\027\016^8s!\025)Y+b,`\033\t)iK\003\002e\001&!Q\021WCW\0051I%)Y:f\033>t\027\016^8s\021!)),b(A\002\025]\026AB2iC:<W\rE\003\005t\025ev,C\002^\tkB\001\"\"0\006 \002\007QqX\001\rC\016$\030n\0348T_V\0248-\032\t\004{\025\005\027bACb}\t\001\")Y:f\003\016$\030n\0348T_V\0248-\032\005\t\013\017\024i\001\"\001\006J\006Y\021-Z\"sC\032$\030\n^3n)\025yV1ZCh\021\035)i-\"2A\002}\013a!Y3Ji\026l\007b\002\017\006F\002\007Q\021\033\n\005\013'L3G\002\004)\005\033\001Q\021\033\005\t\013/\024i\001\"\001\006Z\006y\021-\032)pi\026tG/[1m\023R,W\016F\003`\0137,i\016C\004\006N\026U\007\031A0\t\017q))\0161\001\006`J!Q\021]\0254\r\031A#Q\002\001\006`\"AQQ\035B\007\t\003)9/A\006iCND7i\0348wKJ$H\003BAj\013SD\001\002b$\006d\002\007Q1\036\031\007\013[,\t0b@\021\021\005U\027q\\Cx\013{\0042aHCy\t1)\0310\";\002\002\003\005)\021AC{\005\ryF%M\t\005\013o,)\nE\002\021\013sL1!b?\022\005\035qu\016\0365j]\036\0042aHC\000\t11\t!\";\002\002\003\005)\021AC{\005\ryFE\r\005\t\r\013\021i\001\"\001\007\b\00591m\0348wKJ$HCBAj\r\0231Y\001C\004\006N\032\r\001\031A0\t\017q1\031\0011\001\007\016I!aqB\0254\r\031A#Q\002\001\007\016!AaQ\001B\007\t\0031\031\002\006\004\002T\032Uaq\003\005\t\013\0334\t\0021\001\002f!9AD\"\005A\002\031e!\003\002D\016SM2a\001\013B\007\001\031e\001\002\003D\020\005\033!IA\"\t\002\0351|\027\rZ\"p]R\024x\016\0347feR)\001Db\t\007&!A1q\006D\017\001\004\031\t\004\003\005\007(\031u\001\031\001D\025\003\0051\007C\002\t\007,\031=\002$C\002\007.E\021\021BR;oGRLwN\\\031\023\013\031E\022f\r\037\007\r!\022i\001\001D\030\021!1)D!\004\005\n\031]\022AD:bm\026\034uN\034;s_2dWM\035\013\0061\031eb1\b\005\b\005o1\031\0041\001*\021!\031yCb\rA\002\rE\002")
/*     */ public interface NetworkControl<AETile extends TileEntity & IGridProxyable & IActionHost> {
/*     */   AETile tile();
/*     */   
/*     */   Node node();
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of tables representing the available CPUs in the network.")
/*     */   Object[] getCpus(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function([filter:table]):table -- Get a list of known item recipes. These can be used to issue crafting requests.")
/*     */   Object[] getCraftables(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function([filter:table]):table -- Get a list of the stored items in the network.")
/*     */   Object[] getItemsInNetwork(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(filter:table):table -- Get a list of the stored items in the network matching the filter. Filter is an Array of Item IDs")
/*     */   Object[] getItemsInNetworkById(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():userdata -- Get an iterator object for the list of the items in the network.")
/*     */   Object[] allItems(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(filter:table, dbAddress:string[, startSlot:number[, count:number]]): Boolean -- Store items in the network matching the specified filter in the database with the specified address.")
/*     */   Object[] store(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of the stored fluids in the network.")
/*     */   Object[] getFluidsInNetwork(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():number -- Get the average power injection into the network.")
/*     */   Object[] getAvgPowerInjection(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():number -- Get the average power usage of the network.")
/*     */   Object[] getAvgPowerUsage(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():number -- Get the idle power usage of the network.")
/*     */   Object[] getIdlePowerUsage(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():number -- Get the maximum stored power in the network.")
/*     */   Object[] getMaxStoredPower(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function():number -- Get the stored power in the network. ")
/*     */   Object[] getStoredPower(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   public final class NetworkControl$$anonfun$allCraftables$1 extends AbstractPartialFunction<IAEItemStack, IAEItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final <A1 extends IAEItemStack, B1> B1 applyOrElse(IAEItemStack x1, Function1 default) { Object object;
/*  56 */       IAEItemStack iAEItemStack = x1; if (iAEItemStack.isCraftable()) { object = NetworkControl$.MODULE$.aeCraftItem(iAEItemStack, this.$outer.tile()); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(IAEItemStack x1) { boolean bool; IAEItemStack iAEItemStack = x1; if (iAEItemStack.isCraftable()) { bool = true; } else { bool = false; }  return bool; }
/*     */     
/*     */     public NetworkControl$$anonfun$allCraftables$1(NetworkControl $outer) {} }
/*     */   public final class NetworkControl$$anonfun$getCpus$1 extends AbstractFunction1<ICraftingCPU, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ListBuffer buffer$1; private final IntRef index$1;
/*     */     public NetworkControl$$anonfun$getCpus$1(NetworkControl $outer, ListBuffer buffer$1, IntRef index$1) {}
/*     */     
/*     */     public final void apply(ICraftingCPU cpu) {
/*  63 */       (new Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  64 */         .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("name"), cpu.getName());
/*  65 */       (new Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("storage"), BoxesRunTime.boxToLong(cpu.getAvailableStorage()));
/*  66 */       (new Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("coprocessors"), BoxesRunTime.boxToInteger(cpu.getCoProcessors()));
/*  67 */       (new Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("busy"), BoxesRunTime.boxToBoolean(cpu.isBusy()));
/*  68 */       (new Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("cpu"), new NetworkControl.Cpu(this.$outer.tile(), this.index$1.elem, (CraftingCPUCluster)cpu)); (new Map[1])[0] = (Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[5]));
/*     */       this.buffer$1.append((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Map[1]));
/*  70 */       this.index$1.elem++;
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class NetworkControl$$anonfun$1 extends AbstractPartialFunction<Tuple2<Object, Object>, Tuple2<String, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*  77 */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x2, Function1 default) { Tuple2 tuple2 = x2; if (tuple2 != null)
/*  78 */       { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String) { String str = (String)key; if (value instanceof Object) { Object object = value; return (B1)new Tuple2(str, object); }  }  }  return (B1)default.apply(x2); } public final boolean isDefinedAt(Tuple2 x2) { Tuple2 tuple2 = x2; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String && value instanceof Object)
/*     */           return true;  }
/*     */        return false; } public NetworkControl$$anonfun$1(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getCraftables$1 extends AbstractPartialFunction<IAEItemStack, Craftable> implements Serializable { public static final long serialVersionUID = 0L; private final Map filter$1; public final <A1 extends IAEItemStack, B1> B1 applyOrElse(IAEItemStack x3, Function1 default) { Object object;
/*  81 */       IAEItemStack iAEItemStack = x3; if (this.filter$1.isEmpty() || NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$matches(this.$outer, NetworkControl$.MODULE$.convert(iAEItemStack, this.$outer.tile()), this.filter$1)) { object = new NetworkControl.Craftable(this.$outer.tile(), iAEItemStack); } else { object = default.apply(x3); }  return (B1)object; } public final boolean isDefinedAt(IAEItemStack x3) { boolean bool; IAEItemStack iAEItemStack = x3; if (this.filter$1.isEmpty() || NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$matches(this.$outer, NetworkControl$.MODULE$.convert(iAEItemStack, this.$outer.tile()), this.filter$1)) { bool = true; } else { bool = false; }  return bool; }
/*     */     
/*     */     public NetworkControl$$anonfun$getCraftables$1(NetworkControl $outer, Map filter$1) {} }
/*     */   
/*     */   public final class NetworkControl$$anonfun$2 extends AbstractPartialFunction<Tuple2<Object, Object>, Tuple2<String, Object>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*  87 */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x4, Function1 default) { Tuple2 tuple2 = x4; if (tuple2 != null)
/*  88 */       { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String) { String str = (String)key; if (value instanceof Object) { Object object = value; return (B1)new Tuple2(str, object); }  }  }  return (B1)default.apply(x4); } public final boolean isDefinedAt(Tuple2 x4) { Tuple2 tuple2 = x4; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String && value instanceof Object)
/*     */           return true;  }
/*     */       
/*  91 */       return false; } public NetworkControl$$anonfun$2(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getItemsInNetwork$1 extends AbstractFunction1<IAEItemStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEItemStack item) { return NetworkControl$.MODULE$.convert(item, this.$outer.tile()); } public NetworkControl$$anonfun$getItemsInNetwork$1(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getItemsInNetwork$2 extends AbstractFunction1<HashMap<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Map filter$2; public final boolean apply(HashMap hash) {
/*  92 */       return NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$matches(this.$outer, hash, this.filter$2);
/*     */     }
/*     */     public NetworkControl$$anonfun$getItemsInNetwork$2(NetworkControl $outer, Map filter$2) {} }
/*     */   
/*     */   public final class NetworkControl$$anonfun$getItemsInNetworkById$1 extends AbstractFunction1<Object, LinkedHashSet<Item>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final Map table$1;
/*     */     private final LinkedHashSet itemFilterSet$1;
/*     */     
/*     */     public NetworkControl$$anonfun$getItemsInNetworkById$1(NetworkControl $outer, Map table$1, LinkedHashSet itemFilterSet$1) {}
/*     */     
/* 102 */     public final LinkedHashSet<Item> apply(int i) { Object object = this.table$1.get(BoxesRunTime.boxToInteger(i + 1));
/* 103 */       if (object instanceof Number) { Number number = (Number)object; LinkedHashSet linkedHashSet = this.itemFilterSet$1.$plus$eq(Item.field_150901_e.func_148754_a(number.intValue())); }
/* 104 */       else { if (object instanceof String) { String str = (String)object; return this.itemFilterSet$1.$plus$eq(Item.field_150901_e.func_82594_a(str)); }
/* 105 */          if (object instanceof Object) { (new String[2])[0] = "bad argument in filter table at index "; (new String[2])[1] = " (number or string expected)"; throw new IllegalArgumentException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(i + 1) }))); }
/*     */         
/*     */         throw new MatchError(object); }
/*     */       
/* 109 */       return (LinkedHashSet<Item>)SYNTHETIC_LOCAL_VARIABLE_4; } } public final class NetworkControl$$anonfun$getItemsInNetworkById$2 extends AbstractFunction1<IAEItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final LinkedHashSet itemFilterSet$1; public final boolean apply(IAEItemStack item) { return this.itemFilterSet$1.contains(item.getItem()); } public NetworkControl$$anonfun$getItemsInNetworkById$2(NetworkControl $outer, LinkedHashSet itemFilterSet$1) {} } public final class NetworkControl$$anonfun$getItemsInNetworkById$3 extends AbstractFunction1<IAEItemStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEItemStack item) {
/* 110 */       return NetworkControl$.MODULE$.convert(item, this.$outer.tile());
/*     */     }
/*     */     
/*     */     public NetworkControl$$anonfun$getItemsInNetworkById$3(NetworkControl $outer) {} }
/*     */ 
/*     */   
/*     */   public final class NetworkControl$$anonfun$3
/*     */     extends AbstractPartialFunction<Tuple2<Object, Object>, Tuple2<String, Object>> implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 121 */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x5, Function1 default) { Tuple2 tuple2 = x5; if (tuple2 != null)
/* 122 */       { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String) { String str = (String)key; if (value instanceof Object) { Object object = value; return (B1)new Tuple2(str, object); }  }  }  return (B1)default.apply(x5); } public final boolean isDefinedAt(Tuple2 x5) { Tuple2 tuple2 = x5; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String && value instanceof Object)
/*     */           return true;  }
/*     */       
/* 125 */       return false; } public NetworkControl$$anonfun$3(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$store$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Map filter$3; private final Arguments args$1; public NetworkControl$$anonfun$store$1(NetworkControl $outer, Map filter$3, Arguments args$1) {} public final Object[] apply(UpgradeDatabase database) { IAEItemStack[] items = (IAEItemStack[])((TraversableOnce)NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$allItems(this.$outer)
/* 126 */         .collect((PartialFunction)new NetworkControl$$anonfun$store$1$$anonfun$4(this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(IAEItemStack.class));
/* 127 */       int offset = ExtendedArguments$.MODULE$.extendedArguments(this.args$1).optSlot(database.data(), 2, 0);
/* 128 */       int count = RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(this.args$1.optInteger(3, 2147483647)), database.size() - offset)), items.length);
/* 129 */       IntRef slot = IntRef.create(offset); RichInt$.MODULE$
/* 130 */         .until$extension0(Predef$.MODULE$.intWrapper(0), count).foreach$mVc$sp((Function1)new NetworkControl$$anonfun$store$1$$anonfun$apply$1(this, items, slot, ($anonfun$store$1)database));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); } public final class NetworkControl$$anonfun$store$1$$anonfun$4 extends AbstractPartialFunction<IAEItemStack, IAEItemStack> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final <A1 extends IAEItemStack, B1> B1 applyOrElse(IAEItemStack x6, Function1 default) { Object object; IAEItemStack iAEItemStack = x6; if (NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$matches(this.$outer.li$cil$oc$integration$appeng$NetworkControl$$anonfun$$$outer(), NetworkControl$.MODULE$.convert(iAEItemStack, this.$outer.li$cil$oc$integration$appeng$NetworkControl$$anonfun$$$outer().tile()), this.$outer.filter$3)) { object = NetworkControl$.MODULE$.aePotentialItem(iAEItemStack, this.$outer.li$cil$oc$integration$appeng$NetworkControl$$anonfun$$$outer().tile()); } else { object = default.apply(x6); }  return (B1)object; } public final boolean isDefinedAt(IAEItemStack x6) { boolean bool; IAEItemStack iAEItemStack = x6; if (NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$matches(this.$outer.li$cil$oc$integration$appeng$NetworkControl$$anonfun$$$outer(), NetworkControl$.MODULE$.convert(iAEItemStack, this.$outer.li$cil$oc$integration$appeng$NetworkControl$$anonfun$$$outer().tile()), this.$outer.filter$3)) { bool = true; }
/*     */         else { bool = false; }
/*     */          return bool; } public NetworkControl$$anonfun$store$1$$anonfun$4(NetworkControl$$anonfun$store$1 $outer) {} } public final class NetworkControl$$anonfun$store$1$$anonfun$apply$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IAEItemStack[] items$1; private final IntRef slot$1; private final UpgradeDatabase database$1; public final void apply(int i) { apply$mcVI$sp(i); } public NetworkControl$$anonfun$store$1$$anonfun$apply$1(NetworkControl$$anonfun$store$1 $outer, IAEItemStack[] items$1, IntRef slot$1, UpgradeDatabase database$1) {} public void apply$mcVI$sp(int i) { ItemStack stack = (ItemStack)Option$.MODULE$.apply(this.items$1[i]).map((Function1)new NetworkControl$$anonfun$store$1$$anonfun$apply$1$$anonfun$8(this)).orNull(Predef$.MODULE$.$conforms()); for (; this.database$1.getStackInSlot(this.slot$1.elem) != null && this.slot$1.elem < this.database$1.size(); this.slot$1.elem++); if (this.database$1.getStackInSlot(this.slot$1.elem) == null)
/*     */           this.database$1.setStackInSlot(this.slot$1.elem, stack);  }
/*     */       public final class NetworkControl$$anonfun$store$1$$anonfun$apply$1$$anonfun$8 extends AbstractFunction1<IAEItemStack, ItemStack> implements Serializable {
/*     */         public static final long serialVersionUID = 0L;
/*     */         public final ItemStack apply(IAEItemStack x$1) { return x$1.getItemStack().func_77946_l(); }
/*     */         public NetworkControl$$anonfun$store$1$$anonfun$apply$1$$anonfun$8(NetworkControl$$anonfun$store$1$$anonfun$apply$1 $outer) {} } } }
/*     */   public final class NetworkControl$$anonfun$getFluidsInNetwork$1 extends AbstractFunction1<IAEFluidStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 148 */     public final boolean apply(IAEFluidStack stack) { return NetworkControl$class.li$cil$oc$integration$appeng$NetworkControl$$isFluidVisible(this.$outer, stack); } public NetworkControl$$anonfun$getFluidsInNetwork$1(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getFluidsInNetwork$2 extends AbstractFunction1<IAEFluidStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEFluidStack fs) { return NetworkControl$.MODULE$.convert(fs, this.$outer.tile()); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NetworkControl$$anonfun$getFluidsInNetwork$2(NetworkControl $outer) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$matches$1
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final HashMap stack$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(Tuple2 x0$1) {
/* 172 */       Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/* 173 */         String key = (String)tuple2._1(); Object value = tuple2._2(); if (key != null) { String str = key; if (value != null) { boolean bool; Object object1 = value;
/* 174 */             Object stack_value = this.stack$1.get(str);
/*     */             
/* 176 */             Object object2 = object1;
/* 177 */             if (object2 instanceof Number) { boolean bool1; Number number = (Number)object2; Object object = stack_value;
/* 178 */               if (object instanceof Number) { Number number1 = (Number)object; bool1 = (number.intValue() == number1.intValue()); }
/* 179 */               else { bool1 = number.toString().equals(object.toString()); }
/*     */                bool = bool1; }
/* 181 */             else { bool = object2.toString().equals(stack_value.toString()); }
/*     */             
/*     */             return (stack_value == null) ? false : bool; }
/*     */            }
/*     */       
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     } public NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$matches$1(NetworkControl $outer, HashMap stack$1) {} }
/*     */   public static class Craftable extends AbstractValue implements ICraftingRequester { private TileEntity controller; private IAEItemStack stack;
/* 190 */     public TileEntity controller() { return this.controller; } public void controller_$eq(TileEntity x$1) { this.controller = x$1; } public IAEItemStack stack() { return this.stack; } public void stack_$eq(IAEItemStack x$1) { this.stack = x$1; } public Craftable() {
/* 191 */       this(null, null);
/*     */     }
/* 193 */     private final Set<ICraftingLink> li$cil$oc$integration$appeng$NetworkControl$Craftable$$links = Set$.MODULE$.empty(); public Set<ICraftingLink> li$cil$oc$integration$appeng$NetworkControl$Craftable$$links() { return this.li$cil$oc$integration$appeng$NetworkControl$Craftable$$links; }
/*     */ 
/*     */ 
/*     */     
/*     */     public ImmutableSet<ICraftingLink> getRequestedJobs() {
/* 198 */       return ImmutableSet.copyOf(WrapAsJava$.MODULE$.asJavaCollection(li$cil$oc$integration$appeng$NetworkControl$Craftable$$links().toIterable()));
/*     */     }
/*     */     public void jobStateChange(ICraftingLink link) {
/* 201 */       li$cil$oc$integration$appeng$NetworkControl$Craftable$$links().$minus$eq(link);
/*     */     }
/*     */     public IAEItemStack injectCraftedItems(ICraftingLink link, IAEItemStack stack, Actionable p3) {
/* 204 */       return stack;
/*     */     } public IGridNode getActionableNode() {
/* 206 */       return ((IActionHost)controller()).getActionableNode();
/*     */     } public AECableType getCableConnectionType(ForgeDirection side) {
/* 208 */       return ((IGridHost)controller()).getCableConnectionType(side);
/*     */     } public void securityBreak() {
/* 210 */       ((IGridHost)controller()).securityBreak();
/*     */     } public IGridNode getGridNode(ForgeDirection side) {
/* 212 */       return ((IGridHost)controller()).getGridNode(side);
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Returns the item stack representation of the crafting result.")
/*     */     public Object[] getItemStack(Context context, Arguments args) {
/* 217 */       return new Object[] { stack().getItemStack() };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function([amount:int[, prioritizePower:boolean[, cpuName:string]]]):userdata -- Requests the item to be crafted, returning an object that allows tracking the crafting status.")
/* 221 */     public Object[] request(Context context, Arguments args) { if (controller() == null || controller().func_145837_r()) {
/* 222 */         return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no controller" }));
/*     */       }
/*     */       
/* 225 */       int count = args.optInteger(0, 1);
/* 226 */       IAEItemStack request = stack().copy();
/* 227 */       request.setStackSize(count);
/*     */       
/* 229 */       ICraftingGrid craftingGrid = ((IGridProxyable)controller()).getProxy().getCrafting();
/* 230 */       MachineSource source = new MachineSource((IActionHost)controller());
/* 231 */       Future future = craftingGrid.beginCraftingJob(controller().func_145831_w(), ((IGridProxyable)controller()).getProxy().getGrid(), (BaseActionSource)source, request, null);
/* 232 */       boolean prioritizePower = args.optBoolean(1, true);
/* 233 */       String cpuName = args.optString(2, "");
/* 234 */       ICraftingCPU cpu = cpuName.isEmpty() ? 
/*     */ 
/*     */ 
/*     */         
/* 238 */         null : (ICraftingCPU)WrapAsScala$.MODULE$.asScalaSet((Set)((IGridProxyable)controller()).getProxy().getCrafting().getCpus()).collectFirst((PartialFunction)new NetworkControl$Craftable$$anonfun$5(this, cpuName)).orNull(Predef$.MODULE$.$conforms());
/*     */       
/* 240 */       NetworkControl.CraftingStatus status = new NetworkControl.CraftingStatus();
/* 241 */       Future$.MODULE$.apply(
/* 242 */           (Function0)new NetworkControl$Craftable$$anonfun$request$1(this, craftingGrid, source, future, prioritizePower, cpu, status), (ExecutionContext)ExecutionContext$Implicits$.MODULE$.global());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 271 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { status })); } public final class NetworkControl$Craftable$$anonfun$5 extends AbstractPartialFunction<ICraftingCPU, ICraftingCPU> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final String cpuName$1; public final <A1 extends ICraftingCPU, B1> B1 applyOrElse(ICraftingCPU x7, Function1 default) { Object object; ICraftingCPU iCraftingCPU = x7; if (this.cpuName$1.equals(iCraftingCPU.getName())) { object = iCraftingCPU; } else { object = default.apply(x7); }  return (B1)object; } public final boolean isDefinedAt(ICraftingCPU x7) { boolean bool; ICraftingCPU iCraftingCPU = x7; if (this.cpuName$1.equals(iCraftingCPU.getName())) { bool = true; } else { bool = false; }  return bool; } public NetworkControl$Craftable$$anonfun$5(NetworkControl.Craftable $outer, String cpuName$1) {} } public final class NetworkControl$Craftable$$anonfun$request$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final ICraftingGrid craftingGrid$1; public final MachineSource source$1; private final Future future$1; public final boolean prioritizePower$1; public final ICraftingCPU cpu$1; public final NetworkControl.CraftingStatus status$1; public final void apply() { apply$mcV$sp(); } public NetworkControl$Craftable$$anonfun$request$1(NetworkControl.Craftable $outer, ICraftingGrid craftingGrid$1, MachineSource source$1, Future future$1, boolean prioritizePower$1, ICraftingCPU cpu$1, NetworkControl.CraftingStatus status$1) {} public void apply$mcV$sp() { try { while (true) { if (this.future$1.isDone()) { ICraftingJob job = this.future$1.get(); if (this.future$1.isCancelled()) { this.status$1.fail("missing resources"); break; }  EventHandler$.MODULE$.scheduleServer((Function0)new NetworkControl$Craftable$$anonfun$request$1$$anonfun$apply$mcV$sp$1(this, job)); break; }  Thread.sleep(10L); }  } catch (Exception exception) { OpenComputers$.MODULE$.log().debug("Error submitting job to AE2.", exception); this.status$1.fail(exception.toString()); }  } public final class NetworkControl$Craftable$$anonfun$request$1$$anonfun$apply$mcV$sp$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final ICraftingJob job$1; public final void apply() { apply$mcV$sp(); }
/*     */         public NetworkControl$Craftable$$anonfun$request$1$$anonfun$apply$mcV$sp$1(NetworkControl$Craftable$$anonfun$request$1 $outer, ICraftingJob job$1) {}
/*     */         public void apply$mcV$sp() { ICraftingLink link = this.$outer.craftingGrid$1.submitJob(this.job$1, this.$outer.li$cil$oc$integration$appeng$NetworkControl$Craftable$$anonfun$$$outer(), this.$outer.cpu$1, this.$outer.prioritizePower$1, (BaseActionSource)this.$outer.source$1); if (link == null) { this.$outer.status$1.fail("missing resources?"); } else { this.$outer.status$1.setLink(link); this.$outer.li$cil$oc$integration$appeng$NetworkControl$Craftable$$anonfun$$$outer().li$cil$oc$integration$appeng$NetworkControl$Craftable$$links().$plus$eq(link); }  } } }
/* 277 */     public void load(NBTTagCompound nbt) { super.load(nbt);
/* 278 */       stack_$eq(AEItemStack.loadItemStackFromNBT(nbt));
/* 279 */       NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$loadController(nbt, (Function1<TileEntity, BoxedUnit>)new NetworkControl$Craftable$$anonfun$load$1(this));
/* 280 */       li$cil$oc$integration$appeng$NetworkControl$Craftable$$links().$plus$plus$eq((TraversableOnce)ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("links", 10)).map(
/* 281 */             (Function1)new NetworkControl$Craftable$$anonfun$load$2(this))); } public final class NetworkControl$Craftable$$anonfun$load$1 extends AbstractFunction1<TileEntity, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(TileEntity c) { this.$outer.controller_$eq(c); } public NetworkControl$Craftable$$anonfun$load$1(NetworkControl.Craftable $outer) {} } public final class NetworkControl$Craftable$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, ICraftingLink> implements Serializable { public static final long serialVersionUID = 0L; public final ICraftingLink apply(NBTTagCompound nbt) { return AEApi.instance().storage().loadCraftingLink(nbt, this.$outer); }
/*     */       
/*     */       public NetworkControl$Craftable$$anonfun$load$2(NetworkControl.Craftable $outer) {} }
/*     */     
/* 285 */     public void save(NBTTagCompound nbt) { super.save(nbt);
/* 286 */       stack().writeToNBT(nbt);
/* 287 */       NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$saveController(controller(), nbt);
/* 288 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("links", ExtendedNBT$.MODULE$.writableIterableToNbt((Iterable)li$cil$oc$integration$appeng$NetworkControl$Craftable$$links().map((Function1)new NetworkControl$Craftable$$anonfun$save$2(this), Set$.MODULE$.canBuildFrom()))); } public Craftable(TileEntity controller, IAEItemStack stack) {} public final class NetworkControl$Craftable$$anonfun$save$2 extends AbstractFunction1<ICraftingLink, Function1<NBTTagCompound, BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; public final Function1<NBTTagCompound, BoxedUnit> apply(ICraftingLink x$2) { return (Function1<NBTTagCompound, BoxedUnit>)new NetworkControl$Craftable$$anonfun$save$2$$anonfun$apply$2(this, x$2); } public NetworkControl$Craftable$$anonfun$save$2(NetworkControl.Craftable $outer) {} public final class NetworkControl$Craftable$$anonfun$save$2$$anonfun$apply$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ICraftingLink x$2$1; public final void apply(NBTTagCompound x$1) { this.x$2$1.writeToNBT(x$1); }
/*     */         
/*     */         public NetworkControl$Craftable$$anonfun$save$2$$anonfun$apply$2(NetworkControl$Craftable$$anonfun$save$2 $outer, ICraftingLink x$2$1) {} } } }
/*     */   public static class Cpu extends AbstractValue { private TileEntity controller; private int index; private CraftingCPUCluster cpu;
/*     */     
/* 293 */     public TileEntity controller() { return this.controller; } public void controller_$eq(TileEntity x$1) { this.controller = x$1; } public int index() { return this.index; } public void index_$eq(int x$1) { this.index = x$1; } public CraftingCPUCluster cpu() { return this.cpu; } public void cpu_$eq(CraftingCPUCluster x$1) { this.cpu = x$1; } public Cpu(TileEntity controller, int index, CraftingCPUCluster cpu) {} public Cpu() {
/* 294 */       this(null, 0, null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():boolean -- Cancel this CPU current crafting job.")
/*     */     public Object[] cancel(Context context, Arguments args) {
/* 301 */       getCpu().cancel();
/* 302 */       return getCpu().isBusy() ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():boolean -- Is cpu active?")
/*     */     public Object[] isActive(Context context, Arguments args) {
/* 308 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(getCpu().isActive()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Is cpu busy?")
/*     */     public Object[] isBusy(Context context, Arguments args) {
/* 313 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(getCpu().isBusy()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Get currently crafted items.")
/*     */     public Object[] activeItems(Context context, Arguments args) {
/* 318 */       IItemList list = AEApi.instance().storage().createItemList();
/* 319 */       getCpu().getListOfItem(list, CraftingItemList.ACTIVE);
/* 320 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)list).map((Function1)new NetworkControl$Cpu$$anonfun$activeItems$1(this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(HashMap.class)) })); } public final class NetworkControl$Cpu$$anonfun$activeItems$1 extends AbstractFunction1<IAEItemStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEItemStack item) { return NetworkControl$.MODULE$.convert(item, this.$outer.controller()); }
/*     */       
/*     */       public NetworkControl$Cpu$$anonfun$activeItems$1(NetworkControl.Cpu $outer) {} }
/*     */     
/*     */     @Callback(doc = "function():table -- Get pending items.")
/* 325 */     public Object[] pendingItems(Context context, Arguments args) { IItemList list = AEApi.instance().storage().createItemList();
/* 326 */       getCpu().getListOfItem(list, CraftingItemList.PENDING);
/* 327 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)list).map((Function1)new NetworkControl$Cpu$$anonfun$pendingItems$1(this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(HashMap.class)) })); } public final class NetworkControl$Cpu$$anonfun$pendingItems$1 extends AbstractFunction1<IAEItemStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEItemStack item) { return NetworkControl$.MODULE$.convert(item, this.$outer.controller()); }
/*     */       
/*     */       public NetworkControl$Cpu$$anonfun$pendingItems$1(NetworkControl.Cpu $outer) {} }
/*     */     
/*     */     @Callback(doc = "function():table -- Get stored items.")
/* 332 */     public Object[] storedItems(Context context, Arguments args) { IItemList list = AEApi.instance().storage().createItemList();
/* 333 */       getCpu().getListOfItem(list, CraftingItemList.STORAGE);
/* 334 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)list).map((Function1)new NetworkControl$Cpu$$anonfun$storedItems$1(this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(HashMap.class)) })); } public final class NetworkControl$Cpu$$anonfun$storedItems$1 extends AbstractFunction1<IAEItemStack, HashMap<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final HashMap<String, Object> apply(IAEItemStack item) { return NetworkControl$.MODULE$.convert(item, this.$outer.controller()); }
/*     */       
/*     */       public NetworkControl$Cpu$$anonfun$storedItems$1(NetworkControl.Cpu $outer) {} }
/*     */     @Callback(doc = "function():table -- Get crafting final output.")
/*     */     public Object[] finalOutput(Context context, Arguments args) {
/* 339 */       Option monitor = WrapAsScala$.MODULE$.asScalaIterator(getCpu().getTiles()).find((Function1)new NetworkControl$Cpu$$anonfun$9(this));
/*     */ 
/*     */ 
/*     */       
/* 343 */       IAEItemStack aeStack = ((TileCraftingMonitorTile)monitor.get()).getJobProgress();
/* 344 */       return monitor.isEmpty() ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { null, "No crafting monitor" })) : ((aeStack == null) ? 
/* 345 */         ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { null, "Nothing is crafted"
/*     */             
/* 347 */             })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { aeStack.getItemStack() })));
/*     */     } public final class NetworkControl$Cpu$$anonfun$9 extends AbstractFunction1<IGridHost, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(IGridHost t) {
/*     */         return t instanceof TileCraftingMonitorTile;
/*     */       } public NetworkControl$Cpu$$anonfun$9(NetworkControl.Cpu $outer) {} }
/* 352 */     private CraftingCPUCluster getCpu() { if (cpu() == null && controller() != null) {
/* 353 */         IntRef i = IntRef.create(0);
/* 354 */         WrapAsScala$.MODULE$.asScalaSet((Set)((IGridProxyable)controller()).getProxy().getCrafting().getCpus()).foreach((Function1)new NetworkControl$Cpu$$anonfun$getCpu$1(this, i));
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 361 */       if (cpu() == null)
/* 362 */         throw new Exception("Broken CPU cluster"); 
/* 363 */       return cpu(); } public final class NetworkControl$Cpu$$anonfun$getCpu$1 extends AbstractFunction1<ICraftingCPU, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IntRef i$1; public NetworkControl$Cpu$$anonfun$getCpu$1(NetworkControl.Cpu $outer, IntRef i$1) {} public final void apply(ICraftingCPU c) { if (this.i$1.elem == this.$outer.index())
/*     */           this.$outer.cpu_$eq((CraftingCPUCluster)c); 
/*     */         this.i$1.elem++; } }
/* 367 */     public void save(NBTTagCompound nbt) { super.save(nbt);
/* 368 */       nbt.func_74768_a("index", index());
/* 369 */       NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$saveController(controller(), nbt); }
/*     */ 
/*     */     
/* 372 */     public void load(NBTTagCompound nbt) { super.load(nbt);
/* 373 */       index_$eq(nbt.func_74762_e("index"));
/* 374 */       NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$loadController(nbt, (Function1<TileEntity, BoxedUnit>)new NetworkControl$Cpu$$anonfun$load$3(this)); } public final class NetworkControl$Cpu$$anonfun$load$3 extends AbstractFunction1<TileEntity, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(TileEntity c) { this.$outer.controller_$eq(c); }
/*     */       
/*     */       public NetworkControl$Cpu$$anonfun$load$3(NetworkControl.Cpu $outer) {} } }
/*     */   
/*     */   public static class CraftingStatus extends AbstractValue { private boolean isComputing = true;
/*     */     
/* 380 */     private boolean isComputing() { return this.isComputing; } private void isComputing_$eq(boolean x$1) { this.isComputing = x$1; }
/* 381 */      private Option<ICraftingLink> link = (Option<ICraftingLink>)None$.MODULE$; private Option<ICraftingLink> link() { return this.link; } private void link_$eq(Option<ICraftingLink> x$1) { this.link = x$1; } private boolean li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed = false;
/* 382 */     public boolean li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed() { return this.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed; } private void li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed_$eq(boolean x$1) { this.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed = x$1; }
/* 383 */      private String li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason = "no link"; public String li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason() { return this.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason; } private void li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason_$eq(String x$1) { this.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason = x$1; }
/*     */     
/*     */     public void setLink(ICraftingLink value) {
/* 386 */       isComputing_$eq(false);
/* 387 */       link_$eq(Option$.MODULE$.apply(value));
/*     */     }
/*     */     
/*     */     public void fail(String reason) {
/* 391 */       isComputing_$eq(false);
/* 392 */       li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed_$eq(true);
/* 393 */       (new String[2])[0] = "request failed ("; (new String[2])[1] = ")"; li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason_$eq((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { reason })));
/*     */     }
/*     */     @Callback(doc = "function():boolean -- Get whether the crafting request is currently computing.")
/*     */     public Object[] isComputing(Context context, Arguments args) {
/* 397 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isComputing()) }));
/*     */     } @Callback(doc = "function():boolean -- Get whether the crafting request has failed.")
/*     */     public Object[] hasFailed(Context context, Arguments args) {
/* 400 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed()), li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason() }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Get whether the crafting request has been canceled.")
/* 404 */     public Object[] isCanceled(Context context, Arguments args) { if (isComputing()) return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "computing" })); 
/* 405 */       return (Object[])link().fold((Function0)new NetworkControl$CraftingStatus$$anonfun$isCanceled$1(this), (Function1)new NetworkControl$CraftingStatus$$anonfun$isCanceled$2(this)); } public final class NetworkControl$CraftingStatus$$anonfun$isCanceled$2 extends AbstractFunction1<ICraftingLink, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(ICraftingLink l) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(l.isCanceled()) })); } public NetworkControl$CraftingStatus$$anonfun$isCanceled$2(NetworkControl.CraftingStatus $outer) {} } public final class NetworkControl$CraftingStatus$$anonfun$isCanceled$1 extends AbstractFunction0<Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply() { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.$outer.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed()), this.$outer.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason() })); }
/*     */       
/*     */       public NetworkControl$CraftingStatus$$anonfun$isCanceled$1(NetworkControl.CraftingStatus $outer) {} }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Get whether the crafting request is done.")
/* 410 */     public Object[] isDone(Context context, Arguments args) { if (isComputing()) return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "computing" })); 
/* 411 */       return (Object[])link().fold((Function0)new NetworkControl$CraftingStatus$$anonfun$isDone$1(this), (Function1)new NetworkControl$CraftingStatus$$anonfun$isDone$2(this)); } public final class NetworkControl$CraftingStatus$$anonfun$isDone$2 extends AbstractFunction1<ICraftingLink, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(ICraftingLink l) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(l.isDone()) })); } public NetworkControl$CraftingStatus$$anonfun$isDone$2(NetworkControl.CraftingStatus $outer) {} } public final class NetworkControl$CraftingStatus$$anonfun$isDone$1 extends AbstractFunction0<Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply() { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(!this.$outer.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed()), this.$outer.li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason() })); }
/*     */       
/*     */       public NetworkControl$CraftingStatus$$anonfun$isDone$1(NetworkControl.CraftingStatus $outer) {} }
/*     */     
/* 415 */     public void save(NBTTagCompound nbt) { super.save(nbt);
/* 416 */       li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed_$eq(BoxesRunTime.unboxToBoolean(link().fold((Function0)new NetworkControl$CraftingStatus$$anonfun$save$1(this), (Function1)new NetworkControl$CraftingStatus$$anonfun$save$3(this))));
/* 417 */       nbt.func_74757_a("failed", li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed());
/* 418 */       if (li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed() && li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason() != null)
/* 419 */         nbt.func_74778_a("reason", li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason());  } public final class NetworkControl$CraftingStatus$$anonfun$save$3 extends AbstractFunction1<ICraftingLink, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(ICraftingLink x$3) { return !x$3.isDone(); } public NetworkControl$CraftingStatus$$anonfun$save$3(NetworkControl.CraftingStatus $outer) {} } public final class NetworkControl$CraftingStatus$$anonfun$save$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); }
/*     */       public boolean apply$mcZ$sp() { return true; }
/*     */       public NetworkControl$CraftingStatus$$anonfun$save$1(NetworkControl.CraftingStatus $outer) {} }
/* 424 */     public void load(NBTTagCompound nbt) { super.load(nbt);
/* 425 */       isComputing_$eq(false);
/* 426 */       li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed_$eq(nbt.func_74767_n("failed"));
/* 427 */       if (li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$failed() && nbt.func_74764_b("reason"))
/* 428 */         li$cil$oc$integration$appeng$NetworkControl$CraftingStatus$$reason_$eq(nbt.func_74779_i("reason"));  }
/*     */      }
/*     */   public static class NetworkContents extends AbstractValue implements IMEMonitorHandlerReceiver<IAEItemStack> { private TileEntity controller; private boolean addedListener; private IItemList<IAEItemStack> items; private Iterator<IAEItemStack> li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator;
/*     */     private int index;
/*     */     private boolean valid;
/*     */     
/* 434 */     public TileEntity controller() { return this.controller; } public void controller_$eq(TileEntity x$1) { this.controller = x$1; }
/*     */     public NetworkContents() { this(null); }
/*     */     private boolean addedListener() { return this.addedListener; }
/* 437 */     private void addedListener_$eq(boolean x$1) { this.addedListener = x$1; } private IItemList<IAEItemStack> items() { return this.items; } private void items_$eq(IItemList<IAEItemStack> x$1) { this.items = x$1; } public Iterator<IAEItemStack> li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator() { return this.li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator; } private void li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator_$eq(Iterator<IAEItemStack> x$1) { this.li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator = x$1; } public NetworkContents(TileEntity controller) { if (controller() != null)
/* 438 */         ((IGridProxyable)controller()).getProxy().getStorage().getItemInventory().addListener(this, null); 
/* 439 */       this.addedListener = true;
/* 440 */       this.items = null;
/* 441 */       this.li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator = null;
/* 442 */       this.index = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 481 */       this.valid = true; } private int index() { return this.index; } private void index_$eq(int x$1) { this.index = x$1; } public Object[] call(Context context, Arguments arguments) { if (controller() == null) return null;  if (!addedListener()) { ((IGridProxyable)controller()).getProxy().getStorage().getItemInventory().addListener(this, null); addedListener_$eq(true); }  if (items() == null) { items_$eq(((IGridProxyable)controller()).getProxy().getStorage().getItemInventory().getStorageList()); if (items() != null) li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator_$eq(items().iterator());  if (li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator() != null) RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(1), index()).foreach((Function1)new NetworkControl$NetworkContents$$anonfun$call$1(this));  }  if (li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator() == null && items() != null) li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator_$eq(items().iterator());  if (li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator().hasNext()) { index_$eq(index() + 1); return new Object[] { NetworkControl$.MODULE$.convert(li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator().next(), controller()) }; }  return null; } public final class NetworkControl$NetworkContents$$anonfun$call$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public NetworkControl$NetworkContents$$anonfun$call$1(NetworkControl.NetworkContents $outer) {} public final Object apply(int _) { return this.$outer.li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator().hasNext() ? this.$outer.li$cil$oc$integration$appeng$NetworkControl$NetworkContents$$itemIterator().next() : BoxedUnit.UNIT; } } public void load(NBTTagCompound nbt) { super.load(nbt); addedListener_$eq(false); NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$loadController(nbt, (Function1<TileEntity, BoxedUnit>)new NetworkControl$NetworkContents$$anonfun$load$4(this)); } public final class NetworkControl$NetworkContents$$anonfun$load$4 extends AbstractFunction1<TileEntity, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(TileEntity c) { this.$outer.controller_$eq(c); } public NetworkControl$NetworkContents$$anonfun$load$4(NetworkControl.NetworkContents $outer) {} } public void save(NBTTagCompound nbt) { super.save(nbt); nbt.func_74768_a("index", index()); NetworkControl$.MODULE$.li$cil$oc$integration$appeng$NetworkControl$$saveController(controller(), nbt); } private boolean valid() { return this.valid; } private void valid_$eq(boolean x$1) { this.valid = x$1; }
/*     */     
/*     */     public void dispose(Context context) {
/* 484 */       valid_$eq(false);
/*     */     }
/*     */     public boolean isValid(Object verificationToken) {
/* 487 */       return valid();
/*     */     }
/*     */     public void onListUpdate() {
/* 490 */       items_$eq(null);
/*     */     }
/*     */     public void postChange(IBaseMonitor monitor, Iterable change, BaseActionSource actionSource) {
/* 493 */       items_$eq(null);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\NetworkControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */