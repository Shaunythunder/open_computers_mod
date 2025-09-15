/*     */ package li.cil.oc.server.network;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.runtime.VolatileByteRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\031Eh\001B\001\003\t5\021qAT3uo>\0248N\003\002\004\t\0059a.\032;x_J\\'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qA\003\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\t\003+Yi\021AA\005\003/\t\0211\002R5tiJL'-\036;pe\"A\021\004\001BC\002\023%!$\001\003eCR\fW#A\016\021\tq\t3EK\007\002;)\021adH\001\b[V$\030M\0317f\025\t\001\003#\001\006d_2dWm\031;j_:L!AI\017\003\0075\013\007\017\005\002%O9\021q\"J\005\003MA\ta\001\025:fI\0264\027B\001\025*\005\031\031FO]5oO*\021a\005\005\t\004W\r]dBA\013-\017\025i#\001#\001/\003\035qU\r^<pe.\004\"!F\030\007\013\005\021\001\022\001\031\024\007=\n\024\b\005\0023o5\t1G\003\0025k\005!A.\0318h\025\0051\024\001\0026bm\006L!\001O\032\003\r=\023'.Z2u!\tQt(D\001<\025\taT(\001\004eKR\f\027\016\034\006\003}\031\t1!\0319j\023\t\0015H\001\006OKR<xN]6B!&CQAQ\030\005\002\r\013a\001P5oSRtD#\001\030\t\013\025{C\021\t$\002')|\027N\\(s\007J,\027\r^3OKR<xN]6\025\005\035S\005CA\bI\023\tI\005C\001\003V]&$\b\"B&E\001\004a\025A\003;jY\026,e\016^5usB\021Q\nV\007\002\035*\021q\nU\001\013i&dW-\0328uSRL(BA)S\003%i\027N\\3de\0064GOC\001T\003\rqW\r^\005\003+:\023!\002V5mK\026sG/\033;z\021\0259v\006\"\001Y\0039Qw.\0338OK^tU\r^<pe.$\"aR-\t\013i3\006\031A.\002\t9|G-\032\t\0039zk\021!\030\006\003\007uJ!aX/\003\t9{G-\032\005\006C>\"\tAY\001\017O\026$h*\032;x_J\\gj\0343f)\r\031gm\032\t\004\037\021\\\026BA3\021\005\031y\005\017^5p]\")1\n\031a\001\031\")\001\016\031a\001S\006!1/\0333f!\tQ\027/D\001l\025\taW.\001\003vi&d'B\0018p\003\031\031w.\\7p]*\021\001OU\001\017[&tWm\031:bMR4wN]4f\023\t\0218N\001\bG_J<W\rR5sK\016$\030n\0348\t\013Q|C\021B;\002!\035,G/T;mi&\004\026M\035;O_\022,GCA2w\021\025Y5\0171\001M\021\025Ax\006\"\003z\003)\031\027M\0317f\007>dwN\035\013\003uv\004\"aD>\n\005q\004\"aA%oi\")1j\036a\001\031\"1qp\fC\005\003\003\tQbY1cY\026\034u\016\\8s\r6\003Fc\001>\002\004!)1J a\001\031\"9\021qA\030\005\n\005%\021AF2b]\016{gN\\3di\n\0137/\0323P]\016{Gn\034:\025\r\005-\021\021CA\013!\ry\021QB\005\004\003\037\001\"a\002\"p_2,\027M\034\005\b\003'\t)\0011\001M\003\r!X-\r\005\b\003/\t)\0011\001M\003\r!XM\r\005\b\0037yC\021BA\017\003U\031\027M\\\"p]:,7\r\036$s_6\034\026\016Z3G\033B#b!a\003\002 \005\005\002BB&\002\032\001\007A\n\003\004i\0033\001\r!\033\005\b\003KyC\021BA\024\003Q\031\027M\\\"p]:,7\r\036$s_6\034\026\016Z3J\033R1\0211BA\025\003WAaaSA\022\001\004a\005B\0025\002$\001\007\021\016C\004\0020=\"\t%!\r\002')|\027N\\,je\026dWm]:OKR<xN]6\025\007\035\013\031\004\003\005\0026\0055\002\031AA\034\003!)g\016\0329pS:$\bc\001/\002:%\031\0211H/\003!]K'/\0327fgN,e\016\0329pS:$\bbBA _\021\005\023\021I\001\026kB$\027\r^3XSJ,G.Z:t\035\026$xo\034:l)\r9\0251\t\005\t\003k\ti\0041\001\0028!9\021qI\030\005B\005%\023\001\0067fCZ,w+\033:fY\026\0348OT3uo>\0248\016F\002H\003\027B\001\"!\016\002F\001\007\021q\007\005\b\003\017zC\021IA()\0259\025\021KA*\021!\t)$!\024A\002\005]\002bBA+\003\033\002\rA_\001\nI&lWM\\:j_:Dq!!\0270\t\003\nY&\001\ntK:$w+\033:fY\026\0348\017U1dW\026$HcB$\002^\005\005\0241\016\005\t\003?\n9\0061\001\0028\00511o\\;sG\026D\001\"a\031\002X\001\007\021QM\001\tgR\024XM\\4uQB\031q\"a\032\n\007\005%\004C\001\004E_V\024G.\032\005\t\003[\n9\0061\001\002p\0051\001/Y2lKR\0042\001XA9\023\r\t\031(\030\002\007!\006\0347.\032;\t\017\005]t\006\"\001\002z\0059a.Z<O_\022,GCBA>\005_\023\031\f\005\003\002~\005}T\"A\030\007\r\005\005u\006AAB\005-qu\016Z3Ck&dG-\032:\024\013\005}\024'!\"\021\t\005\035\025q\023\b\005\003\023\013\031J\004\003\002\f\006Ee\002BAG\003\037k\021AB\005\003}\031I!\001P\037\n\007\005U5(A\004Ck&dG-\032:\n\t\005\005\025\021\024\006\004\003+[\004bCAO\003\022)\031!C\001\003?\013Qa\0305pgR,\"!!)\021\007q\013\031+C\002\002&v\0231\"\0228wSJ|g.\\3oi\"Y\021\021VA@\005\003\005\013\021BAQ\003\031y\006n\\:uA!Y\021QVA@\005\013\007I\021AAX\0035y&/Z1dQ\006\024\027\016\\5usV\021\021\021\027\t\0049\006M\026bAA[;\nQa+[:jE&d\027\016^=\t\027\005e\026q\020B\001B\003%\021\021W\001\017?J,\027m\0315bE&d\027\016^=!\021\035\021\025q\020C\001\003{#b!a\037\002@\006\005\007\002CAO\003w\003\r!!)\t\021\0055\0261\030a\001\003cC\001\"!2\002\000\021\005\021qY\001\016o&$\bnQ8na>tWM\034;\025\r\005%'q\013B.!\rY\0231\032\004\007\003\033|\003!a4\003!\r{W\016]8oK:$()^5mI\026\0248#BAfc\005E\007\003BAD\003'LA!!4\002\032\"Y\021QTAf\005\013\007I\021AAP\021-\tI+a3\003\002\003\006I!!)\t\027\0055\0261\032BC\002\023\005\021q\026\005\f\003s\013YM!A!\002\023\t\t\fC\006\002`\006-'Q1A\005\002\005\005\030!B0oC6,W#A\022\t\025\005\025\0301\032B\001B\003%1%\001\004`]\006lW\r\t\005\f\003S\fYM!b\001\n\003\ty+A\006`m&\034\030NY5mSRL\bbCAw\003\027\024\t\021)A\005\003c\013Ab\030<jg&\024\027\016\\5us\002BqAQAf\t\003\t\t\020\006\006\002t\006U\030q_A}\003w\004B!! \002L\"A\021QTAx\001\004\t\t\013\003\005\002.\006=\b\031AAY\021\035\ty.a<A\002\rB\001\"!;\002p\002\007\021\021\027\005\t\003\fY\r\"\001\003\002\005iq/\033;i\007>tg.Z2u_J$BAa\001\003FA\0311F!\002\007\r\t\035q\006\001B\005\005e\031u.\0349p]\026tGoQ8o]\026\034Go\034:Ck&dG-\032:\024\013\t\025\021Ga\003\021\t\005\035%QB\005\005\005\017\tI\nC\006\002\036\n\025!Q1A\005\002\005}\005bCAU\005\013\021\t\021)A\005\003CC1\"!,\003\006\t\025\r\021\"\001\0020\"Y\021\021\030B\003\005\003\005\013\021BAY\021-\tyN!\002\003\006\004%\t!!9\t\025\005\025(Q\001B\001B\003%1\005C\006\002j\n\025!Q1A\005\002\005=\006bCAw\005\013\021\t\021)A\005\003cC1B!\t\003\006\t\025\r\021\"\001\003$\005YqLY;gM\026\0248+\033>f+\t\t)\007C\006\003(\t\025!\021!Q\001\n\005\025\024\001D0ck\0324WM]*ju\026\004\003b\002\"\003\006\021\005!1\006\013\r\005[\021yC!\r\0034\tU\"q\007\t\005\003{\022)\001\003\005\002\036\n%\002\031AAQ\021!\tiK!\013A\002\005E\006bBAp\005S\001\ra\t\005\t\003S\024I\0031\001\0022\"A!\021\005B\025\001\004\t)\007\003\005\003<\t\025A\021\001B\037\003\031\031'/Z1uKR\021!q\b\t\0049\n\005\023b\001B\";\n\0212i\\7q_:,g\016^\"p]:,7\r^8s\021!\0219%!@A\002\005\025\024A\0032vM\032,'oU5{K\"A\021q`Af\t\003\021Y\005\006\002\003\004!A!1HAf\t\003\021y\005\006\002\003RA\031ALa\025\n\007\tUSLA\005D_6\004xN\\3oi\"9!\021LAb\001\004\031\023\001\0028b[\026D\001B!\030\002D\002\007\021\021W\001\013m&\034\030NY5mSRL\b\002CAc\003\"\tA!\031\025\t\005%'1\r\005\b\0053\022y\0061\001$\021!\ty0a \005\002\t\035D\003\002B5\005K\0032a\013B6\r\031\021ig\f\001\003p\t\0012i\0348oK\016$xN\035\"vS2$WM]\n\006\005W\n$\021\017\t\005\003\017\023\031(\003\003\003n\005e\005bCAO\005W\022)\031!C\001\003?C1\"!+\003l\t\005\t\025!\003\002\"\"Y\021Q\026B6\005\013\007I\021AAX\021-\tILa\033\003\002\003\006I!!-\t\027\t\005\"1\016BC\002\023\005!1\005\005\f\005O\021YG!A!\002\023\t)\007C\004C\005W\"\tAa!\025\021\t\025%q\021BE\005\027\003B!! \003l!A\021Q\024BA\001\004\t\t\013\003\005\002.\n\005\005\031AAY\021!\021\tC!!A\002\005\025\004\002CAc\005W\"\tAa$\025\r\t\r!\021\023BJ\021\035\021IF!$A\002\rB\001B!\030\003\016\002\007\021\021\027\005\t\003\013\024Y\007\"\001\003\030R!!1\001BM\021\035\021IF!&A\002\rB\001Ba\017\003l\021\005!Q\024\013\003\005?\0032\001\030BQ\023\r\021\031+\030\002\n\007>tg.Z2u_JD\001Ba\022\003f\001\007\021Q\r\005\t\003\fy\b\"\001\003*R\021!\021\016\005\t\005w\ty\b\"\001\003.R\t1\f\003\005\0032\006U\004\031AAQ\003\021Awn\035;\t\021\tU\026Q\017a\001\003c\013AB]3bG\"\f'-\0337jifDqA!/0\t\003\022Y,A\005oK^\004\026mY6fiRQ!QXB)\007'\032)fa\026\021\t\005u$q\030\004\007\003gz\003A!1\024\013\t}\026'a\034\t\027\005}#q\030BA\002\023\005\021\021\035\005\f\005\017\024yL!a\001\n\003\021I-\001\006t_V\0248-Z0%KF$2a\022Bf\021%\021iM!2\002\002\003\0071%A\002yIEB!B!5\003@\n\005\t\025)\003$\003\035\031x.\036:dK\002B1B!6\003@\n\005\r\021\"\001\002b\006YA-Z:uS:\fG/[8o\021-\021INa0\003\002\004%\tAa7\002\037\021,7\017^5oCRLwN\\0%KF$2a\022Bo\021%\021iMa6\002\002\003\0071\005\003\006\003b\n}&\021!Q!\n\r\nA\002Z3ti&t\027\r^5p]\002B1B!:\003@\n\005\r\021\"\001\003h\006!\001o\034:u+\005Q\bb\003Bv\005\023\t\031!C\001\005[\f\001\002]8si~#S-\035\013\004\017\n=\b\"\003Bg\005S\f\t\0211\001{\021)\021\031Pa0\003\002\003\006KA_\001\006a>\024H\017\t\005\0133\t}&\0211A\005\002\t]XC\001B}!\021y!1 \b\n\007\tu\bCA\003BeJ\f\027\020C\006\004\002\t}&\0211A\005\002\r\r\021\001\0033bi\006|F%Z9\025\007\035\033)\001\003\006\003N\n}\030\021!a\001\005sD1b!\003\003@\n\005\t\025)\003\003z\006)A-\031;bA!Y1Q\002B`\005\003\007I\021\001Bt\003\r!H\017\034\005\f\007#\021yL!a\001\n\003\031\031\"A\004ui2|F%Z9\025\007\035\033)\002C\005\003N\016=\021\021!a\001u\"Q1\021\004B`\005\003\005\013\025\002>\002\tQ$H\016\t\005\b\005\n}F\021AB\017)1\021ila\b\004\"\r\r2QEB\024\021\035\tyfa\007A\002\rBqA!6\004\034\001\0071\005C\004\003f\016m\001\031\001>\t\017e\031Y\0021\001\003z\"I1QBB\016!\003\005\rA\037\005\013\007W\021yL1A\005\002\t\035\030\001B:ju\026D\001ba\f\003@\002\006IA_\001\006g&TX\r\t\005\t\007g\021y\f\"\021\0046\005\031\001n\0349\025\005\tu\006\002CB\035\005#\tea\017\002\tM\fg/\032\013\004\017\016u\002\002CB \007o\001\ra!\021\002\0079\024G\017\005\003\004D\r\035SBAB#\025\r\031y\004U\005\005\007\023\032)E\001\bO\005R#\026mZ\"p[B|WO\0343\t\021\r5#q\030C!\007\037\n\001\002^8TiJLgn\032\013\002G!9\021q\fB\\\001\004\031\003b\002Bk\005o\003\ra\t\005\b\005K\0249\f1\001{\021\035I\"q\027a\001\005sDqA!/0\t\003\032Y\006\006\003\003>\016u\003\002CB \0073\002\ra!\021\t\023\r\005t\0061A\005\002\r\r\024\001C5t'\026\024h/\032:\026\005\r\025\004#B\b\004h\005-\021bAB5!\tIa)\0368di&|g\016\r\005\n\007[z\003\031!C\001\007_\nA\"[:TKJ4XM]0%KF$2aRB9\021)\021ima\033\002\002\003\0071Q\r\005\t\007kz\003\025)\003\004f\005I\021n]*feZ,'\017\t\004\007\007szCaa\037\003\rY+'\017^3y'\r\0319H\004\005\0133\r]$Q1A\005\002\r}TCABA!\r)21Q\005\003?\nA1b!\003\004x\t\005\t\025!\003\004\002\"9!ia\036\005\002\r%E\003BBF\007\033\003B!! \004x!9\021da\"A\002\r\005\005BCBI\007o\022\r\021\"\001\004\024\006)Q\rZ4fgV\0211Q\023\t\0069\r]51T\005\004\0073k\"aC!se\006L()\0364gKJ\004B!! \004\036\03211qT\030E\007C\023A!\0223hKN91Q\024\b\004$\016%\006cA\b\004&&\0311q\025\t\003\017A\023x\016Z;diB\031qba+\n\007\r5\006C\001\007TKJL\027\r\\5{C\ndW\rC\006\0042\016u%Q3A\005\002\rM\026\001\0027fMR,\"aa#\t\027\r]6Q\024B\tB\003%11R\001\006Y\0264G\017\t\005\f\007w\033iJ!f\001\n\003\031\031,A\003sS\036DG\017C\006\004@\016u%\021#Q\001\n\r-\025A\002:jO\"$\b\005C\004C\007;#\taa1\025\r\rm5QYBd\021!\031\tl!1A\002\r-\005\002CB^\007\003\004\raa#\t\021\r-7Q\024C\001\007\033\fQa\034;iKJ$Baa#\004P\"9\001n!3A\002\r-\005\002CBj\007;#\ta!6\002\023%\034()\032;xK\026tGCBA\006\007/\034Y\016\003\005\004Z\016E\007\031ABF\003\005\t\007\002CBo\007#\004\raa#\002\003\tD\001b!9\004\036\022\00511]\001\007e\026lwN^3\025\005\r\025\bCBBt\007S\034i/D\001 \023\r\031Yo\b\002\004'\026\f\b#\002\017\"G\r-\005BCBy\007;\013\t\021\"\001\004t\006!1m\0349z)\031\031Yj!>\004x\"Q1\021WBx!\003\005\raa#\t\025\rm6q\036I\001\002\004\031Y\t\003\006\004|\016u\025\023!C\001\007{\fabY8qs\022\"WMZ1vYR$\023'\006\002\004\000*\"11\022C\001W\t!\031\001\005\003\005\006\021=QB\001C\004\025\021!I\001b\003\002\023Ut7\r[3dW\026$'b\001C\007!\005Q\021M\0348pi\006$\030n\0348\n\t\021EAq\001\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007B\003C\013\007;\013\n\021\"\001\004~\006q1m\0349zI\021,g-Y;mi\022\022\004B\003C\r\007;\013\t\021\"\021\005\034\005i\001O]8ek\016$\bK]3gSb,\"\001\"\b\021\007I\"y\"\003\002)g!QA1EBO\003\003%\tAa:\002\031A\024x\016Z;di\006\023\030\016^=\t\025\021\0352QTA\001\n\003!I#\001\bqe>$Wo\031;FY\026lWM\034;\025\t\021-B\021\007\t\004\037\0215\022b\001C\030!\t\031\021I\\=\t\023\t5GQEA\001\002\004Q\bB\003C\033\007;\013\t\021\"\021\0058\005y\001O]8ek\016$\030\n^3sCR|'/\006\002\005:A11q\035C\036\tWI1\001\"\020 \005!IE/\032:bi>\024\bB\003C!\007;\013\t\021\"\001\005D\005A1-\0318FcV\fG\016\006\003\002\f\021\025\003B\003Bg\t\t\t\0211\001\005,!QA\021JBO\003\003%\t\005b\023\002\021!\f7\017[\"pI\026$\022A\037\005\013\007\033\032i*!A\005B\021=CC\001C\017\021)!\031f!(\002\002\023\005CQK\001\007KF,\030\r\\:\025\t\005-Aq\013\005\013\005\033$\t&!AA\002\021-\002\"\003C.\007o\002\013\021BBK\003\031)GmZ3tA!A1\021]B<\t\003\031\031\017\003\005\004N\r]D\021IB(\017%!\031gLA\001\022\023!)'\001\003FI\036,\007\003BA?\tO2\021ba(0\003\003EI\001\"\033\024\r\021\035D1NBU!)!i\007b\035\004\f\016-51T\007\003\t_R1\001\"\035\021\003\035\021XO\034;j[\026LA\001\"\036\005p\t\t\022IY:ue\006\034GOR;oGRLwN\034\032\t\017\t#9\007\"\001\005zQ\021AQ\r\005\013\007\033\"9'!A\005F\021=\003B\003C@\tO\n\t\021\"!\005\002\006)\021\r\0359msR111\024CB\t\013C\001b!-\005~\001\00711\022\005\t\007w#i\b1\001\004\f\"QA\021\022C4\003\003%\t\tb#\002\017Ut\027\r\0359msR!AQ\022CK!\021yA\rb$\021\017=!\tja#\004\f&\031A1\023\t\003\rQ+\b\017\\33\021)!9\nb\"\002\002\003\00711T\001\004q\022\002\004B\003CN\tO\n\t\021\"\003\005\036\006Y!/Z1e%\026\034x\016\034<f)\005\t\004b\002CQ_\021%A1U\001\rg\026\f'o\0315He\006\004\bn\035\013\005\007K$)\013\003\005\005(\022}\005\031\001CU\003\025\031X-\0323t!\031!Y\013b/\004\f:!AQ\026C\\\035\021!y\013\".\016\005\021E&b\001CZ\031\0051AH]8pizJ\021!E\005\004\ts\003\022a\0029bG.\fw-Z\005\005\007W$iLC\002\005:B1a\001\"10\t\021\r'aB'fgN\fw-Z\n\006\t\013DQ\031\t\0049\022\035\027b\001Ca;\"Y\021q\fC`\005\013\007I\021\001Cf+\005Y\006B\003Bi\t\023\t\021)A\0057\"Y!\021\fC`\005\013\007I\021AAq\021)!\031\016b0\003\002\003\006IaI\001\006]\006lW\r\t\005\0133\021}&Q1A\005\002\t]\bbCB\005\t\023\t\021)A\005\005sDqA\021C`\t\003!Y\016\006\005\005^\022}G\021\035Cr!\021\ti\bb0\t\017\005}C\021\034a\0017\"9!\021\fCm\001\004\031\003bB\r\005Z\002\007!\021 \005\013\tO$y\f1A\005\002\021%\030AC5t\007\006t7-\0327fIV\021\0211\002\005\013\t[$y\f1A\005\002\021=\030AD5t\007\006t7-\0327fI~#S-\035\013\004\017\022E\bB\003Bg\tW\f\t\0211\001\002\f!IAQ\037C`A\003&\0211B\001\fSN\034\025M\\2fY\026$\007\005\003\005\005z\022}F\021\001C~\003\031\031\027M\\2fYR\tqiB\005\005\000>\n\t\021#\001\006\002\0051\001+Y2lKR\004B!! \006\004\031I\0211O\030\002\002#\005QQA\n\004\013\007q\001b\002\"\006\004\021\005Q\021\002\013\003\013\003A!\"\"\004\006\004E\005I\021AC\b\003m!C.Z:tS:LG\017J4sK\006$XM\035\023eK\032\fW\017\034;%kU\021Q\021\003\026\004u\022\005aaBC\013_\001\021Qq\003\002\b/J\f\007\017]3s'\031)\031\"MC\r)A\031A,b\007\n\005\005i\006BC\002\006\024\t\025\r\021\"\001\006 U\021Q\021\005\t\003+\001A1\"\"\n\006\024\t\005\t\025!\003\006\"\005Aa.\032;x_J\\\007\005C\004C\013'!\t!\"\013\025\t\025-RQ\006\t\005\003{*\031\002C\004\004\013O\001\r!\"\t\t\021\025ER1\003C\001\013g\tqaY8o]\026\034G\017\006\004\002\f\025UR\021\b\005\b\013o)y\0031\001\\\003\025qw\016Z3B\021\035)Y$b\fA\002m\013QA\\8eK\nC\001\"b\020\006\024\021\005Q\021I\001\013I&\0348m\0348oK\016$HCBA\006\013\007*)\005C\004\0068\025u\002\031A.\t\017\025mRQ\ba\0017\"A1\021]C\n\t\003)I\005\006\003\002\f\025-\003B\002.\006H\001\0071\fC\004[\013'!\t!b\024\025\t\r\005U\021\013\005\b\013'*i\0051\001$\003\035\tG\r\032:fgND\001\"b\026\006\024\021\005Q\021L\001\006]>$Wm\035\013\003\0137\002BAMC/7&\031QqL\032\003\021%#XM]1cY\026D\001\"b\026\006\024\021\005Q1\r\013\005\0137*)\007C\004\006h\025\005\004\031A.\002\023I,g-\032:f]\016,\007\002CC6\013'!\t!\"\034\002\0239,\027n\0325c_J\034H\003BC.\013_BaAWC5\001\004Y\006\002CC:\013'!\t!\"\036\002\033M,g\016\032+p\003\022$'/Z:t)%9UqOC=\013{*y\bC\004\002`\025E\004\031A.\t\017\025mT\021\017a\001G\0051A/\031:hKRDqA!\027\006r\001\0071\005C\004\032\013c\002\r!\"!\021\t=)\031ID\005\004\013\013\003\"A\003\037sKB,\027\r^3e}!AQ\021RC\n\t\003)Y)A\btK:$Gk\034(fS\036D'm\034:t)\0359UQRCH\013#Cq!a\030\006\b\002\0071\fC\004\003Z\025\035\005\031A\022\t\017e)9\t1\001\006\002\"AQQSC\n\t\003)9*A\btK:$Gk\034*fC\016D\027M\0317f)\0359U\021TCN\013;Cq!a\030\006\024\002\0071\fC\004\003Z\025M\005\031A\022\t\017e)\031\n1\001\006\002\"AQ\021UC\n\t\003)\031+A\007tK:$Gk\034,jg&\024G.\032\013\b\017\026\025VqUCU\021\035\ty&b(A\002mCqA!\027\006 \002\0071\005C\004\032\013?\003\r!\"!\t\021\0255V1\003C\001\005G\tAb\0327pE\006d')\0364gKJD\001\"\"-\006\024\021\005Q1W\001\021O2|'-\0317Ck\0324WM]0%KF$2aRC[\021!)9,b,A\002\005\025\024!\002<bYV,\007\002CC^\013'!\tAa\t\002!\035dwNY1m\005V4g-\032:TSj,\007\002CC`\013'!\t!\"1\002)\035dwNY1m\005V4g-\032:TSj,w\fJ3r)\r9U1\031\005\t\013o+i\f1\001\002f!AQqYC\n\t\003)I-\001\007bI\022\034uN\0348fGR|'\017F\002H\013\027D\001\"\"4\006F\002\007QqZ\001\nG>tg.Z2u_J\0042!FCi\023\r\021\031K\001\005\t\013+,\031\002\"\001\006X\006y!/Z7pm\026\034uN\0348fGR|'\017F\002H\0133D\001\"\"4\006T\002\007Qq\032\005\t\013;,\031\002\"\001\006`\006a1\r[1oO\026\024UO\0324feR!\021QMCq\021!)\031/b7A\002\005\025\024!\0023fYR\f\007\"CCt_E\005I\021BCu\003m!C.Z:tS:LG\017J4sK\006$XM\035\023eK\032\fW\017\034;%cU\021Q1\036\026\0047\021\005\001\"CB\005\001\t\005\t\025!\003\034\021\031\021\005\001\"\003\006rR!Q\021ECz\021!IRq\036I\001\002\004Y\002B\002\"\001\t\003)9\020\006\003\006\"\025e\bb\002.\006v\002\0071\021\021\005\n\013[\003\001\031!C\001\005GA\021\"\"-\001\001\004%\t!b@\025\007\0353\t\001\003\006\003N\026u\030\021!a\001\003KB\001B\"\002\001A\003&\021QM\001\016O2|'-\0317Ck\0324WM\035\021\t\023\025m\006\0011A\005\002\t\r\002\"CC`\001\001\007I\021\001D\006)\r9eQ\002\005\013\005\0334I!!AA\002\005\025\004\002\003D\t\001\001\006K!!\032\002#\035dwNY1m\005V4g-\032:TSj,\007\005C\005\007\026\001\021\r\021\"\003\007\030\005Q1m\0348oK\016$xN]:\026\005\031e\001#\002\017\004\030\026=\007\002\003D\017\001\001\006IA\"\007\002\027\r|gN\\3di>\0248\017\t\005\013\rC\001\001R1A\005\n\031\r\022aB<sCB\004XM]\013\003\rK\0012aKC\n\021)1I\003\001E\001B\003&aQE\001\toJ\f\007\017]3sA!9aQ\006\001\005\002\031=\022!\002:f[\006\004H#B$\0072\031U\002\002\003D\032\rW\001\ra!!\002\031I,W.\0319qK\022tu\016Z3\t\017\031]b1\006a\001G\005Qa.Z<BI\022\024Xm]:\t\017\025E\002\001\"\001\007<Q1\0211\002D\037\rA\001\"b\016\007:\001\0071\021\021\005\t\013w1I\0041\001\004\002\"9Qq\b\001\005\002\031\rCCBA\006\r\01329\005\003\005\0068\031\005\003\031ABA\021!)YD\"\021A\002\r\005\005bBBq\001\021\005a1\n\013\005\003\0271i\005C\004[\r\023\002\ra!!\t\ri\003A\021\001D))\021\031\tIb\025\t\017\025Mcq\na\001G!9Qq\013\001\005\002\031]SC\001D-!\025!YKb\027\\\023\021)y\006\"0\t\017\031}\003\001\"\001\007b\005q!/Z1dQ\006\024G.\032(pI\026\034H\003\002D-\rGBq!b\032\007^\001\0071\fC\004\007h\001!\tA\"\033\002\033I,\027m\0315j]\036tu\016Z3t)\0211IFb\033\t\017\025\035dQ\ra\0017\"9Q1\016\001\005\002\031=D\003\002D-\rcBaA\027D7\001\004Y\006bBC:\001\021\005aQ\017\013\n\017\032]d\021\020D>\r{Bq!a\030\007t\001\0071\fC\004\006|\031M\004\031A\022\t\017\tec1\017a\001G!Aaq\020D:\001\004)\t)\001\003be\036\034\bbBCE\001\021\005a1\021\013\b\017\032\025eq\021DE\021\035\tyF\"!A\002mCqA!\027\007\002\002\0071\005\003\005\007\000\031\005\005\031ACA\021\035))\n\001C\001\r\033#ra\022DH\r#3\031\nC\004\002`\031-\005\031A.\t\017\tec1\022a\001G!Aaq\020DF\001\004)\t\tC\004\006\"\002!\tAb&\025\017\0353IJb'\007\036\"9\021q\fDK\001\004Y\006b\002B-\r+\003\ra\t\005\t\r2)\n1\001\006\002\"9a\021\025\001\005\n\031\r\026\001C2p]R\f\027N\\:\025\t\005-aQ\025\005\b5\032}\005\031ABA\021\031Q\006\001\"\003\007*R\031!Fb+\t\ri39\0131\001\\\021\0351y\013\001C\005\rc\013a!\0313e\035\026<Hc\001\026\0074\"9!L\",A\002\r\005\005b\002D\\\001\021%a\021X\001\004C\022$GCBA\006\rw3y\fC\004\007>\032U\006\031\001\026\002\017=dGMT8eK\"Aa\021\031D[\001\004\031\t)A\005bI\022,GMT8eK\"9aQ\031\001\005\n\031\035\027a\0035b]\022dWm\0259mSR$2a\022De\021!1YMb1A\002\0315\027!C:vE\036\023\030\r\0355t!\025!Y\013b/\034\021\0351\t\016\001C\005\r'\fAa]3oIRIqI\"6\007X\032mgQ\034\005\b\003?2y\r1\001\\\021!1INb4A\002\031e\023a\002;be\036,Go\035\005\b\00532y\r1\001$\021!1yHb4A\002\025\005\005bBCd\001\021\005a\021\035\013\004\017\032\r\b\002CCg\r?\004\r!b4\t\017\025U\007\001\"\001\007hR\031qI\";\t\021\0255gQ\035a\001\013\037Dq!\"8\001\t\0031i\017\006\003\002f\031=\b\002CCr\rW\004\r!!\032")
/*     */ public class Network implements Distributor {
/*     */   private final Map<String, Vertex> li$cil$oc$server$network$Network$$data;
/*     */   private double globalBuffer;
/*     */   private double globalBufferSize;
/*     */   private final ArrayBuffer<Connector> connectors;
/*     */   private Wrapper li$cil$oc$server$network$Network$$wrapper;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   public Map<String, Vertex> li$cil$oc$server$network$Network$$data() {
/*  31 */     return this.li$cil$oc$server$network$Network$$data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Network(Map<String, Vertex> data) {
/*  38 */     this.globalBuffer = 0.0D;
/*     */     
/*  40 */     this.globalBufferSize = 0.0D;
/*     */     
/*  42 */     this.connectors = (ArrayBuffer<Connector>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */ 
/*     */ 
/*     */     
/*  46 */     data.values().foreach((Function1)new Network$$anonfun$3(this));
/*  47 */   } public Network(Node node) { this(Network$.MODULE$.li$cil$oc$server$network$Network$$$lessinit$greater$default$1()); addNew(node); node.onConnect(node); } public double globalBuffer() { return this.globalBuffer; } public void globalBuffer_$eq(double x$1) { this.globalBuffer = x$1; } public double globalBufferSize() { return this.globalBufferSize; } public void globalBufferSize_$eq(double x$1) { this.globalBufferSize = x$1; } private ArrayBuffer<Connector> connectors() { return this.connectors; } private Wrapper li$cil$oc$server$network$Network$$wrapper$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$server$network$Network$$wrapper = new Wrapper(this); this.bitmap$0 = true; }  return this.li$cil$oc$server$network$Network$$wrapper; }  } public Wrapper li$cil$oc$server$network$Network$$wrapper() { return this.bitmap$0 ? this.li$cil$oc$server$network$Network$$wrapper : li$cil$oc$server$network$Network$$wrapper$lzycompute(); } public final class Network$$anonfun$3 extends AbstractFunction1<Vertex, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Network$$anonfun$3(Network $outer) {} public final void apply(Network.Vertex node) { Node node1 = node.data();
/*  48 */       if (node1 instanceof Connector) { Connector connector = (Connector)node1; this.$outer.addConnector(connector); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  49 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*  51 */       node.data().network_$eq(this.$outer.li$cil$oc$server$network$Network$$wrapper()); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void remap(Node remappedNode, String newAddress) {
/*  56 */     Option option = li$cil$oc$server$network$Network$$data().get(remappedNode.address());
/*  57 */     if (option instanceof Some) { Some some = (Some)option; Vertex node = (Vertex)some.x();
/*  58 */       ArrayBuffer neighbors = (ArrayBuffer)node.edges().map((Function1)new Network$$anonfun$4(this, node), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());
/*  59 */       node.data().remove();
/*  60 */       node.data().address_$eq(newAddress);
/*  61 */       while (li$cil$oc$server$network$Network$$data().contains(node.data().address())) {
/*  62 */         node.data().address_$eq(UUID.randomUUID().toString());
/*     */       }
/*     */       
/*  65 */       addNew(node.data());
/*     */       
/*  67 */       neighbors.foreach((Function1)new Network$$anonfun$remap$1(this, node)); BoxedUnit boxedUnit = neighbors.isEmpty() ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }
/*  68 */      throw new AssertionError("Node believes it belongs to a network it doesn't.");
/*     */   }
/*     */   public final class Network$$anonfun$4 extends AbstractFunction1<Edge, Vertex> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Network.Vertex node$1;
/*     */     public final Network.Vertex apply(Network.Edge x$1) {
/*     */       return x$1.other(this.node$1);
/*     */     }
/*     */     public Network$$anonfun$4(Network $outer, Network.Vertex node$1) {} }
/*     */   public final class Network$$anonfun$remap$1 extends AbstractFunction1<Vertex, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Network.Vertex node$1;
/*     */     public final void apply(Network.Vertex x$2) {
/*     */       x$2.data().connect(this.node$1.data());
/*     */     }
/*     */     public Network$$anonfun$remap$1(Network $outer, Network.Vertex node$1) {} }
/*     */   
/*     */   public boolean connect(Node nodeA, Node nodeB) {
/*     */     // Byte code:
/*     */     //   0: invokestatic zero : ()Lscala/runtime/ObjectRef;
/*     */     //   3: astore_3
/*     */     //   4: invokestatic zero : ()Lscala/runtime/ObjectRef;
/*     */     //   7: astore #4
/*     */     //   9: iconst_0
/*     */     //   10: invokestatic create : (B)Lscala/runtime/VolatileByteRef;
/*     */     //   13: astore #5
/*     */     //   15: aload_1
/*     */     //   16: ifnonnull -> 30
/*     */     //   19: new java/lang/NullPointerException
/*     */     //   22: dup
/*     */     //   23: ldc_w 'nodeA'
/*     */     //   26: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   29: athrow
/*     */     //   30: aload_2
/*     */     //   31: ifnonnull -> 45
/*     */     //   34: new java/lang/NullPointerException
/*     */     //   37: dup
/*     */     //   38: ldc_w 'nodeB'
/*     */     //   41: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   44: athrow
/*     */     //   45: aload_1
/*     */     //   46: aload_2
/*     */     //   47: astore #6
/*     */     //   49: dup
/*     */     //   50: ifnonnull -> 62
/*     */     //   53: pop
/*     */     //   54: aload #6
/*     */     //   56: ifnull -> 70
/*     */     //   59: goto -> 81
/*     */     //   62: aload #6
/*     */     //   64: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 81
/*     */     //   70: new java/lang/IllegalArgumentException
/*     */     //   73: dup
/*     */     //   74: ldc_w 'Cannot connect a node to itself.'
/*     */     //   77: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   80: athrow
/*     */     //   81: aload_0
/*     */     //   82: aload_1
/*     */     //   83: invokespecial contains : (Lli/cil/oc/server/network/Node;)Z
/*     */     //   86: istore #7
/*     */     //   88: aload_0
/*     */     //   89: aload_2
/*     */     //   90: invokespecial contains : (Lli/cil/oc/server/network/Node;)Z
/*     */     //   93: istore #8
/*     */     //   95: iload #7
/*     */     //   97: ifne -> 105
/*     */     //   100: iload #8
/*     */     //   102: ifeq -> 401
/*     */     //   105: iload #7
/*     */     //   107: ifeq -> 365
/*     */     //   110: iload #8
/*     */     //   112: ifeq -> 365
/*     */     //   115: aload_0
/*     */     //   116: aload_1
/*     */     //   117: aload_3
/*     */     //   118: aload #5
/*     */     //   120: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   123: invokevirtual edges : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   126: new li/cil/oc/server/network/Network$$anonfun$connect$1
/*     */     //   129: dup
/*     */     //   130: aload_0
/*     */     //   131: aload_1
/*     */     //   132: aload_2
/*     */     //   133: aload_3
/*     */     //   134: aload #4
/*     */     //   136: aload #5
/*     */     //   138: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)V
/*     */     //   141: invokevirtual exists : (Lscala/Function1;)Z
/*     */     //   144: ifeq -> 151
/*     */     //   147: iconst_0
/*     */     //   148: goto -> 400
/*     */     //   151: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   154: aload_0
/*     */     //   155: aload_2
/*     */     //   156: aload #4
/*     */     //   158: aload #5
/*     */     //   160: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   163: invokevirtual edges : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   166: new li/cil/oc/server/network/Network$$anonfun$connect$2
/*     */     //   169: dup
/*     */     //   170: aload_0
/*     */     //   171: aload_1
/*     */     //   172: aload_2
/*     */     //   173: aload_3
/*     */     //   174: aload #4
/*     */     //   176: aload #5
/*     */     //   178: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)V
/*     */     //   181: invokevirtual exists : (Lscala/Function1;)Z
/*     */     //   184: ifeq -> 191
/*     */     //   187: iconst_0
/*     */     //   188: goto -> 192
/*     */     //   191: iconst_1
/*     */     //   192: invokevirtual assert : (Z)V
/*     */     //   195: new li/cil/oc/server/network/Network$Edge
/*     */     //   198: dup
/*     */     //   199: aload_0
/*     */     //   200: aload_1
/*     */     //   201: aload_3
/*     */     //   202: aload #5
/*     */     //   204: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   207: aload_0
/*     */     //   208: aload_2
/*     */     //   209: aload #4
/*     */     //   211: aload #5
/*     */     //   213: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   216: invokespecial <init> : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Network$Vertex;)V
/*     */     //   219: pop
/*     */     //   220: aload_0
/*     */     //   221: aload_1
/*     */     //   222: aload_3
/*     */     //   223: aload #5
/*     */     //   225: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   228: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   231: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   236: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   239: astore #9
/*     */     //   241: dup
/*     */     //   242: ifnonnull -> 254
/*     */     //   245: pop
/*     */     //   246: aload #9
/*     */     //   248: ifnull -> 262
/*     */     //   251: goto -> 290
/*     */     //   254: aload #9
/*     */     //   256: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 290
/*     */     //   262: aload_0
/*     */     //   263: aload_2
/*     */     //   264: aload #4
/*     */     //   266: aload #5
/*     */     //   268: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   271: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   274: aload_0
/*     */     //   275: aload_1
/*     */     //   276: aload_3
/*     */     //   277: aload #5
/*     */     //   279: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   282: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   285: invokeinterface onConnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   290: aload_0
/*     */     //   291: aload_2
/*     */     //   292: aload #4
/*     */     //   294: aload #5
/*     */     //   296: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   299: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   302: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   307: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   310: astore #10
/*     */     //   312: dup
/*     */     //   313: ifnonnull -> 325
/*     */     //   316: pop
/*     */     //   317: aload #10
/*     */     //   319: ifnull -> 333
/*     */     //   322: goto -> 361
/*     */     //   325: aload #10
/*     */     //   327: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   330: ifeq -> 361
/*     */     //   333: aload_0
/*     */     //   334: aload_1
/*     */     //   335: aload_3
/*     */     //   336: aload #5
/*     */     //   338: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   341: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   344: aload_0
/*     */     //   345: aload_2
/*     */     //   346: aload #4
/*     */     //   348: aload #5
/*     */     //   350: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   353: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   356: invokeinterface onConnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   361: iconst_1
/*     */     //   362: goto -> 400
/*     */     //   365: iload #7
/*     */     //   367: ifeq -> 386
/*     */     //   370: aload_0
/*     */     //   371: aload_0
/*     */     //   372: aload_1
/*     */     //   373: aload_3
/*     */     //   374: aload #5
/*     */     //   376: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   379: aload_2
/*     */     //   380: invokespecial add : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Node;)Z
/*     */     //   383: goto -> 400
/*     */     //   386: aload_0
/*     */     //   387: aload_0
/*     */     //   388: aload_2
/*     */     //   389: aload #4
/*     */     //   391: aload #5
/*     */     //   393: invokevirtual li$cil$oc$server$network$Network$$oldNodeB$1 : (Lli/cil/oc/server/network/Node;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   396: aload_1
/*     */     //   397: invokespecial add : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Node;)Z
/*     */     //   400: ireturn
/*     */     //   401: new java/lang/IllegalArgumentException
/*     */     //   404: dup
/*     */     //   405: ldc_w 'At least one of the nodes must already be in this network.'
/*     */     //   408: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   411: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 3
/*     */     //   #88	-> 7
/*     */     //   #74	-> 9
/*     */     //   #75	-> 15
/*     */     //   #76	-> 30
/*     */     //   #78	-> 45
/*     */     //   #79	-> 74
/*     */     //   #78	-> 77
/*     */     //   #81	-> 81
/*     */     //   #82	-> 88
/*     */     //   #84	-> 95
/*     */     //   #90	-> 105
/*     */     //   #96	-> 115
/*     */     //   #105	-> 147
/*     */     //   #97	-> 151
/*     */     //   #98	-> 195
/*     */     //   #99	-> 220
/*     */     //   #100	-> 262
/*     */     //   #101	-> 290
/*     */     //   #102	-> 333
/*     */     //   #103	-> 361
/*     */     //   #107	-> 365
/*     */     //   #108	-> 386
/*     */     //   #84	-> 401
/*     */     //   #85	-> 405
/*     */     //   #84	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	412	0	this	Lli/cil/oc/server/network/Network;
/*     */     //   0	412	1	nodeA	Lli/cil/oc/server/network/Node;
/*     */     //   0	412	2	nodeB	Lli/cil/oc/server/network/Node;
/*     */     //   4	408	3	oldNodeA$lzy	Lscala/runtime/ObjectRef;
/*     */     //   9	403	4	oldNodeB$lzy	Lscala/runtime/ObjectRef;
/*     */     //   15	397	5	bitmap$0	Lscala/runtime/VolatileByteRef;
/*     */     //   88	324	7	containsA	Z
/*     */     //   95	317	8	containsB	Z
/*     */   }
/*     */   
/*  87 */   private final Vertex oldNodeA$lzycompute$1(Node nodeA$1, ObjectRef oldNodeA$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { oldNodeA$lzy$1.elem = node(nodeA$1); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (Vertex)oldNodeA$lzy$1.elem; }  } public final Vertex li$cil$oc$server$network$Network$$oldNodeA$1(Node nodeA$1, ObjectRef oldNodeA$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? oldNodeA$lzycompute$1(nodeA$1, oldNodeA$lzy$1, bitmap$0$1) : (Vertex)oldNodeA$lzy$1.elem; }
/*  88 */   private final Vertex oldNodeB$lzycompute$1(Node nodeB$1, ObjectRef oldNodeB$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x2) == 0) { oldNodeB$lzy$1.elem = node(nodeB$1); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x2); }  return (Vertex)oldNodeB$lzy$1.elem; }  } public final Vertex li$cil$oc$server$network$Network$$oldNodeB$1(Node nodeB$1, ObjectRef oldNodeB$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x2) == 0) ? oldNodeB$lzycompute$1(nodeB$1, oldNodeB$lzy$1, bitmap$0$1) : (Vertex)oldNodeB$lzy$1.elem; }
/*     */   
/*     */   public final class Network$$anonfun$connect$1 extends AbstractFunction1<Edge, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node nodeA$1;
/*     */     private final Node nodeB$1;
/*     */     private final ObjectRef oldNodeA$lzy$1;
/*     */     private final ObjectRef oldNodeB$lzy$1;
/*     */     private final VolatileByteRef bitmap$0$1;
/*     */     
/*  96 */     public final boolean apply(Network.Edge x$3) { return x$3.isBetween(this.$outer.li$cil$oc$server$network$Network$$oldNodeA$1(this.nodeA$1, this.oldNodeA$lzy$1, this.bitmap$0$1), this.$outer.li$cil$oc$server$network$Network$$oldNodeB$1(this.nodeB$1, this.oldNodeB$lzy$1, this.bitmap$0$1)); } public Network$$anonfun$connect$1(Network $outer, Node nodeA$1, Node nodeB$1, ObjectRef oldNodeA$lzy$1, ObjectRef oldNodeB$lzy$1, VolatileByteRef bitmap$0$1) {} } public final class Network$$anonfun$connect$2 extends AbstractFunction1<Edge, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node nodeA$1; private final Node nodeB$1; private final ObjectRef oldNodeA$lzy$1; private final ObjectRef oldNodeB$lzy$1; private final VolatileByteRef bitmap$0$1; public final boolean apply(Network.Edge x$4) {
/*  97 */       return x$4.isBetween(this.$outer.li$cil$oc$server$network$Network$$oldNodeA$1(this.nodeA$1, this.oldNodeA$lzy$1, this.bitmap$0$1), this.$outer.li$cil$oc$server$network$Network$$oldNodeB$1(this.nodeB$1, this.oldNodeB$lzy$1, this.bitmap$0$1));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$connect$2(Network $outer, Node nodeA$1, Node nodeB$1, ObjectRef oldNodeA$lzy$1, ObjectRef oldNodeB$lzy$1, VolatileByteRef bitmap$0$1) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean disconnect(Node nodeA, Node nodeB) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: astore_3
/*     */     //   3: dup
/*     */     //   4: ifnonnull -> 15
/*     */     //   7: pop
/*     */     //   8: aload_3
/*     */     //   9: ifnull -> 22
/*     */     //   12: goto -> 33
/*     */     //   15: aload_3
/*     */     //   16: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   19: ifeq -> 33
/*     */     //   22: new java/lang/IllegalArgumentException
/*     */     //   25: dup
/*     */     //   26: ldc_w 'Cannot disconnect a node from itself.'
/*     */     //   29: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   32: athrow
/*     */     //   33: aload_0
/*     */     //   34: aload_1
/*     */     //   35: invokespecial contains : (Lli/cil/oc/server/network/Node;)Z
/*     */     //   38: istore #4
/*     */     //   40: aload_0
/*     */     //   41: aload_2
/*     */     //   42: invokespecial contains : (Lli/cil/oc/server/network/Node;)Z
/*     */     //   45: istore #5
/*     */     //   47: iload #4
/*     */     //   49: ifeq -> 246
/*     */     //   52: iload #5
/*     */     //   54: ifeq -> 246
/*     */     //   57: aload_0
/*     */     //   58: aload_1
/*     */     //   59: invokevirtual li$cil$oc$server$network$Network$$oldNodeA$2 : (Lli/cil/oc/server/network/Node;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   62: invokevirtual edges : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   65: new li/cil/oc/server/network/Network$$anonfun$5
/*     */     //   68: dup
/*     */     //   69: aload_0
/*     */     //   70: aload_1
/*     */     //   71: aload_2
/*     */     //   72: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;Lli/cil/oc/server/network/Node;)V
/*     */     //   75: invokevirtual find : (Lscala/Function1;)Lscala/Option;
/*     */     //   78: astore #6
/*     */     //   80: aload #6
/*     */     //   82: instanceof scala/Some
/*     */     //   85: ifeq -> 240
/*     */     //   88: aload #6
/*     */     //   90: checkcast scala/Some
/*     */     //   93: astore #7
/*     */     //   95: aload #7
/*     */     //   97: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   100: checkcast li/cil/oc/server/network/Network$Edge
/*     */     //   103: astore #8
/*     */     //   105: aload_0
/*     */     //   106: aload #8
/*     */     //   108: invokevirtual remove : ()Lscala/collection/Seq;
/*     */     //   111: invokespecial handleSplit : (Lscala/collection/Seq;)V
/*     */     //   114: aload #8
/*     */     //   116: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   119: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   122: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   127: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   130: astore #10
/*     */     //   132: dup
/*     */     //   133: ifnonnull -> 145
/*     */     //   136: pop
/*     */     //   137: aload #10
/*     */     //   139: ifnull -> 153
/*     */     //   142: goto -> 174
/*     */     //   145: aload #10
/*     */     //   147: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   150: ifeq -> 174
/*     */     //   153: aload #8
/*     */     //   155: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   158: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   161: aload #8
/*     */     //   163: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   166: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   169: invokeinterface onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   174: aload #8
/*     */     //   176: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   179: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   182: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   187: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   190: astore #11
/*     */     //   192: dup
/*     */     //   193: ifnonnull -> 205
/*     */     //   196: pop
/*     */     //   197: aload #11
/*     */     //   199: ifnull -> 213
/*     */     //   202: goto -> 234
/*     */     //   205: aload #11
/*     */     //   207: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   210: ifeq -> 234
/*     */     //   213: aload #8
/*     */     //   215: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   218: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   221: aload #8
/*     */     //   223: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   226: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   229: invokeinterface onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   234: iconst_1
/*     */     //   235: istore #9
/*     */     //   237: goto -> 243
/*     */     //   240: iconst_0
/*     */     //   241: istore #9
/*     */     //   243: iload #9
/*     */     //   245: ireturn
/*     */     //   246: new java/lang/IllegalArgumentException
/*     */     //   249: dup
/*     */     //   250: ldc_w 'Both of the nodes must be in this network.'
/*     */     //   253: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   256: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 0
/*     */     //   #113	-> 26
/*     */     //   #112	-> 29
/*     */     //   #115	-> 33
/*     */     //   #116	-> 40
/*     */     //   #118	-> 47
/*     */     //   #124	-> 57
/*     */     //   #125	-> 80
/*     */     //   #126	-> 105
/*     */     //   #127	-> 114
/*     */     //   #128	-> 153
/*     */     //   #129	-> 174
/*     */     //   #130	-> 213
/*     */     //   #131	-> 234
/*     */     //   #125	-> 235
/*     */     //   #132	-> 240
/*     */     //   #124	-> 243
/*     */     //   #118	-> 246
/*     */     //   #119	-> 250
/*     */     //   #118	-> 253
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	257	0	this	Lli/cil/oc/server/network/Network;
/*     */     //   0	257	1	nodeA	Lli/cil/oc/server/network/Node;
/*     */     //   0	257	2	nodeB	Lli/cil/oc/server/network/Node;
/*     */     //   40	205	4	containsA	Z
/*     */     //   47	198	5	containsB	Z
/*     */     //   105	152	8	edge	Lli/cil/oc/server/network/Network$Edge;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final Vertex li$cil$oc$server$network$Network$$oldNodeA$2(Node nodeA$2)
/*     */   {
/* 121 */     return node(nodeA$2); } public final Vertex li$cil$oc$server$network$Network$$oldNodeB$2(Node nodeB$2) {
/* 122 */     return node(nodeB$2);
/*     */   } public final class Network$$anonfun$5 extends AbstractFunction1<Edge, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node nodeA$2; private final Node nodeB$2; public final boolean apply(Network.Edge x$5) {
/* 124 */       return x$5.isBetween(this.$outer.li$cil$oc$server$network$Network$$oldNodeA$2(this.nodeA$2), this.$outer.li$cil$oc$server$network$Network$$oldNodeB$2(this.nodeB$2));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$5(Network $outer, Node nodeA$2, Node nodeB$2) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(Node node) {
/*     */     boolean bool;
/* 137 */     Option option = li$cil$oc$server$network$Network$$data().remove(node.address());
/* 138 */     if (option instanceof Some) { Iterable iterable1; Some some = (Some)option; Vertex entry = (Vertex)some.x();
/* 139 */       Node node1 = node;
/* 140 */       if (node1 instanceof Connector) { Connector connector = (Connector)node1; removeConnector(connector); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 141 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 143 */       node.network_$eq(null);
/* 144 */       Seq<Map<String, Vertex>> subGraphs = entry.remove();
/* 145 */       (new Node[1])[0] = node; Visibility visibility = entry.data().reachability();
/* 146 */       if (Visibility.None.equals(visibility)) { iterable1 = (Iterable)scala.package$.MODULE$.Iterable().empty(); }
/* 147 */       else if (Visibility.Neighbors.equals(visibility)) { iterable1 = (Iterable)entry.edges().map((Function1)new Network$$anonfun$6(this, entry), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom()); }
/* 148 */       else if (Visibility.Network.equals(visibility)) { iterable1 = (Iterable)subGraphs.flatMap((Function1)new Network$$anonfun$7(this), scala.collection.Seq$.MODULE$.canBuildFrom()); }
/*     */       else { throw new MatchError(visibility); }
/* 150 */        Iterable targets = (Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Node[1]))).$plus$plus((GenTraversableOnce)iterable1, scala.collection.Iterable$.MODULE$.canBuildFrom()); handleSplit(subGraphs);
/* 151 */       targets.foreach((Function1)new Network$$anonfun$remove$1(this, node));
/* 152 */       bool = true; }
/* 153 */     else { bool = false; }  return bool;
/*     */   } public final class Network$$anonfun$6 extends AbstractFunction1<Edge, Node> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Network.Vertex entry$1; public final Node apply(Network.Edge x$6) { return x$6.other(this.entry$1).data(); } public Network$$anonfun$6(Network $outer, Network.Vertex entry$1) {} } public final class Network$$anonfun$7 extends AbstractFunction1<Map<String, Vertex>, Iterable<Node>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Iterable<Node> apply(Map x$7) { return (Iterable<Node>)x$7.values().map((Function1)new Network$$anonfun$7$$anonfun$apply$1(this), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public Network$$anonfun$7(Network $outer) {} public final class Network$$anonfun$7$$anonfun$apply$1 extends AbstractFunction1<Network.Vertex, Node> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final Node apply(Network.Vertex x$8) { return x$8.data(); } public Network$$anonfun$7$$anonfun$apply$1(Network$$anonfun$7 $outer) {} } } public final class Network$$anonfun$remove$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Node node$3; public final void apply(Node x$9) { ((Node)x$9).onDisconnect(this.node$3); }
/*     */     public Network$$anonfun$remove$1(Network $outer, Node node$3) {} }
/* 160 */   public Node node(String address) { Node node; Option option = li$cil$oc$server$network$Network$$data().get(address);
/* 161 */     if (option instanceof Some) { Some some = (Some)option; Vertex vertex = (Vertex)some.x(); node = vertex.data(); }
/* 162 */     else { node = null; }
/*     */     
/*     */     return node; }
/*     */   
/* 166 */   public Iterable<Node> nodes() { return (Iterable<Node>)li$cil$oc$server$network$Network$$data().values().map((Function1)new Network$$anonfun$nodes$1(this), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class Network$$anonfun$nodes$1 extends AbstractFunction1<Vertex, Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply(Network.Vertex x$10) { return x$10.data(); }
/*     */     
/*     */     public Network$$anonfun$nodes$1(Network $outer) {} }
/* 169 */   public Iterable<Node> reachableNodes(Node reference) { Set referenceNeighbors = neighbors(reference).toSet();
/* 170 */     return (Iterable<Node>)nodes().filter((Function1)new Network$$anonfun$reachableNodes$1(this, reference, referenceNeighbors)); } public final class Network$$anonfun$reachableNodes$1 extends AbstractFunction1<Node, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Node reference$1; private final Set referenceNeighbors$1; public final boolean apply(Node node) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield reference$1 : Lli/cil/oc/api/network/Node;
/*     */       //   5: astore_2
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_2
/*     */       //   12: ifnull -> 103
/*     */       //   15: goto -> 25
/*     */       //   18: aload_2
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifne -> 103
/*     */       //   25: aload_1
/*     */       //   26: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */       //   31: getstatic li/cil/oc/api/network/Visibility.Network : Lli/cil/oc/api/network/Visibility;
/*     */       //   34: astore_3
/*     */       //   35: dup
/*     */       //   36: ifnonnull -> 47
/*     */       //   39: pop
/*     */       //   40: aload_3
/*     */       //   41: ifnull -> 99
/*     */       //   44: goto -> 54
/*     */       //   47: aload_3
/*     */       //   48: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   51: ifne -> 99
/*     */       //   54: aload_1
/*     */       //   55: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */       //   60: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */       //   63: astore #4
/*     */       //   65: dup
/*     */       //   66: ifnonnull -> 78
/*     */       //   69: pop
/*     */       //   70: aload #4
/*     */       //   72: ifnull -> 86
/*     */       //   75: goto -> 103
/*     */       //   78: aload #4
/*     */       //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   83: ifeq -> 103
/*     */       //   86: aload_0
/*     */       //   87: getfield referenceNeighbors$1 : Lscala/collection/immutable/Set;
/*     */       //   90: aload_1
/*     */       //   91: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   96: ifeq -> 103
/*     */       //   99: iconst_1
/*     */       //   100: goto -> 104
/*     */       //   103: iconst_0
/*     */       //   104: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #170	-> 0
/*     */       //   #171	-> 54
/*     */       //   #170	-> 99
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	105	0	this	Lli/cil/oc/server/network/Network$$anonfun$reachableNodes$1;
/*     */       //   0	105	1	node	Lli/cil/oc/api/network/Node; } public Network$$anonfun$reachableNodes$1(Network $outer, Node reference$1, Set referenceNeighbors$1) {} } public Iterable<Node> reachingNodes(Node reference) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   6: getstatic li/cil/oc/api/network/Visibility.Network : Lli/cil/oc/api/network/Visibility;
/*     */     //   9: astore_2
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 22
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: ifnull -> 29
/*     */     //   19: goto -> 53
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 53
/*     */     //   29: aload_0
/*     */     //   30: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   33: new li/cil/oc/server/network/Network$$anonfun$reachingNodes$1
/*     */     //   36: dup
/*     */     //   37: aload_0
/*     */     //   38: aload_1
/*     */     //   39: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/api/network/Node;)V
/*     */     //   42: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   47: checkcast scala/collection/Iterable
/*     */     //   50: goto -> 132
/*     */     //   53: aload_1
/*     */     //   54: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   59: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   62: astore_3
/*     */     //   63: dup
/*     */     //   64: ifnonnull -> 75
/*     */     //   67: pop
/*     */     //   68: aload_3
/*     */     //   69: ifnull -> 82
/*     */     //   72: goto -> 120
/*     */     //   75: aload_3
/*     */     //   76: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   79: ifeq -> 120
/*     */     //   82: aload_0
/*     */     //   83: aload_1
/*     */     //   84: invokevirtual neighbors : (Lli/cil/oc/api/network/Node;)Lscala/collection/Iterable;
/*     */     //   87: invokeinterface toSet : ()Lscala/collection/immutable/Set;
/*     */     //   92: astore #4
/*     */     //   94: aload_0
/*     */     //   95: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   98: new li/cil/oc/server/network/Network$$anonfun$reachingNodes$2
/*     */     //   101: dup
/*     */     //   102: aload_0
/*     */     //   103: aload_1
/*     */     //   104: aload #4
/*     */     //   106: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/api/network/Node;Lscala/collection/immutable/Set;)V
/*     */     //   109: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   114: checkcast scala/collection/Iterable
/*     */     //   117: goto -> 132
/*     */     //   120: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   123: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   126: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   129: checkcast scala/collection/Iterable
/*     */     //   132: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #175	-> 0
/*     */     //   #176	-> 53
/*     */     //   #177	-> 82
/*     */     //   #178	-> 94
/*     */     //   #179	-> 120
/*     */     //   #175	-> 132
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	133	0	this	Lli/cil/oc/server/network/Network;
/*     */     //   0	133	1	reference	Lli/cil/oc/api/network/Node;
/*     */     //   94	23	4	referenceNeighbors	Lscala/collection/immutable/Set;
/*     */   } public final class Network$$anonfun$reachingNodes$1 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node reference$2;
/*     */     public final boolean apply(Node node) {
/* 175 */       Node node1 = this.reference$2; if (node == null) { if (node1 != null); } else if (node.equals(node1))
/*     */       {  }
/*     */     
/*     */     } public Network$$anonfun$reachingNodes$1(Network $outer, Node reference$2) {} } public final class Network$$anonfun$reachingNodes$2 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node reference$2; private final Set referenceNeighbors$2; public final boolean apply(Node node) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield reference$2 : Lli/cil/oc/api/network/Node;
/*     */       //   5: astore_2
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_2
/*     */       //   12: ifnull -> 42
/*     */       //   15: goto -> 25
/*     */       //   18: aload_2
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifne -> 42
/*     */       //   25: aload_0
/*     */       //   26: getfield referenceNeighbors$2 : Lscala/collection/immutable/Set;
/*     */       //   29: aload_1
/*     */       //   30: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   35: ifeq -> 42
/*     */       //   38: iconst_1
/*     */       //   39: goto -> 43
/*     */       //   42: iconst_0
/*     */       //   43: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #178	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	44	0	this	Lli/cil/oc/server/network/Network$$anonfun$reachingNodes$2;
/*     */       //   0	44	1	node	Lli/cil/oc/api/network/Node;
/*     */     } public Network$$anonfun$reachingNodes$2(Network $outer, Node reference$2, Set referenceNeighbors$2) {} }
/*     */   public Iterable<Node> neighbors(Node node) {
/*     */     Vertex n;
/* 183 */     Option option = li$cil$oc$server$network$Network$$data().get(node.address());
/* 184 */     if (option instanceof Some) { Some some = (Some)option; n = (Vertex)some.x(); Node node1 = node; if (n.data() == null) { n.data(); if (node1 != null)
/* 185 */           throw new IllegalArgumentException("Node must be in this network.");  } else { if (n.data().equals(node1)) return (Iterable)n.edges().map((Function1)new Network$$anonfun$neighbors$1(this, n), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());  throw new IllegalArgumentException("Node must be in this network."); }  } else { throw new IllegalArgumentException("Node must be in this network."); }
/*     */     
/*     */     return (Iterable)n.edges().map((Function1)new Network$$anonfun$neighbors$1(this, n), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());
/*     */   } public final class Network$$anonfun$neighbors$1 extends AbstractFunction1<Edge, Node> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Network.Vertex n$1; public final Node apply(Network.Edge x$11) {
/*     */       return x$11.other(this.n$1).data();
/*     */     } public Network$$anonfun$neighbors$1(Network $outer, Network.Vertex n$1) {} } public void sendToAddress(Node source, String target, String name, Seq<Object> args) {
/* 192 */     Wrapper wrapper = li$cil$oc$server$network$Network$$wrapper(); if (source.network() == null) { source.network(); if (wrapper != null)
/* 193 */         throw new IllegalArgumentException("Source node must be in this network.");  } else if (!source.network().equals(wrapper)) { throw new IllegalArgumentException("Source node must be in this network."); }
/* 194 */      Option option = li$cil$oc$server$network$Network$$data().get(target);
/* 195 */     if (option instanceof Some) { Some some = (Some)option; Vertex node = (Vertex)some.x(); if (node.data().canBeReachedFrom(source))
/* 196 */       { (new Node[1])[0] = node.data(); send(source, (Iterable<Node>)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Node[1])), name, args); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 197 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */   
/*     */   public void sendToNeighbors(Node source, String name, Seq<Object> args)
/*     */   {
/* 202 */     Wrapper wrapper = li$cil$oc$server$network$Network$$wrapper(); if (source.network() == null) { source.network(); if (wrapper != null)
/* 203 */         throw new IllegalArgumentException("Source node must be in this network.");  } else if (!source.network().equals(wrapper)) { throw new IllegalArgumentException("Source node must be in this network."); }
/* 204 */      send(source, (Iterable<Node>)neighbors(source).filter((Function1)new Network$$anonfun$sendToNeighbors$1(this)), name, args); } public final class Network$$anonfun$sendToNeighbors$1 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x$12) { Visibility visibility = Visibility.None; if (x$12.reachability() == null) { x$12.reachability(); if (visibility != null); } else if (x$12.reachability().equals(visibility))
/*     */       {  }
/*     */        }
/*     */      public Network$$anonfun$sendToNeighbors$1(Network $outer) {} } public void sendToReachable(Node source, String name, Seq<Object> args) {
/* 208 */     Wrapper wrapper = li$cil$oc$server$network$Network$$wrapper(); if (source.network() == null) { source.network(); if (wrapper != null)
/* 209 */         throw new IllegalArgumentException("Source node must be in this network.");  } else if (!source.network().equals(wrapper)) { throw new IllegalArgumentException("Source node must be in this network."); }
/* 210 */      send(source, reachableNodes(source), name, args);
/*     */   }
/*     */   
/*     */   public void sendToVisible(Node source, String name, Seq<Object> args) {
/* 214 */     Wrapper wrapper = li$cil$oc$server$network$Network$$wrapper(); if (source.network() == null) { source.network(); if (wrapper != null)
/* 215 */         throw new IllegalArgumentException("Source node must be in this network.");  } else if (!source.network().equals(wrapper)) { throw new IllegalArgumentException("Source node must be in this network."); }
/* 216 */      send(source, (Iterable<Node>)reachableNodes(source).collect((PartialFunction)new Network$$anonfun$sendToVisible$1(this, source), scala.collection.Iterable$.MODULE$.canBuildFrom()), 
/*     */         
/* 218 */         name, args);
/*     */   } public final class Network$$anonfun$sendToVisible$1 extends AbstractPartialFunction<Node, Component> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Node source$1; public final <A1 extends Node, B1> B1 applyOrElse(Node x1, Function1 default) { Node node = x1; if (node instanceof Component) { Component component = (Component)node; if (component.canBeSeenFrom(this.source$1))
/*     */           return (B1)component;  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Node x1) { Node node = x1; if (node instanceof Component) { Component component = (Component)node; if (component.canBeSeenFrom(this.source$1))
/*     */           return true;  }
/*     */        return false; } public Network$$anonfun$sendToVisible$1(Network $outer, Node source$1) {} }
/*     */   private boolean contains(Node node) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual li$cil$oc$server$network$Network$$wrapper : ()Lli/cil/oc/server/network/Network$Wrapper;
/*     */     //   10: astore_2
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 23
/*     */     //   15: pop
/*     */     //   16: aload_2
/*     */     //   17: ifnull -> 30
/*     */     //   20: goto -> 52
/*     */     //   23: aload_2
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifeq -> 52
/*     */     //   30: aload_0
/*     */     //   31: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface address : ()Ljava/lang/String;
/*     */     //   40: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 52
/*     */     //   48: iconst_1
/*     */     //   49: goto -> 53
/*     */     //   52: iconst_0
/*     */     //   53: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #223	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	54	0	this	Lli/cil/oc/server/network/Network;
/*     */     //   0	54	1	node	Lli/cil/oc/server/network/Node; }
/* 225 */   private Vertex node(Node node) { return (Vertex)li$cil$oc$server$network$Network$$data().apply(node.address()); }
/*     */   
/*     */   private Vertex addNew(Node node) {
/* 228 */     Vertex newNode = new Vertex(node);
/* 229 */     if (node.address() == null || li$cil$oc$server$network$Network$$data().contains(node.address()))
/* 230 */       node.address_$eq(UUID.randomUUID().toString()); 
/* 231 */     li$cil$oc$server$network$Network$$data().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(node.address()), newNode));
/* 232 */     Node node1 = node;
/* 233 */     if (node1 instanceof Connector) { Connector connector = (Connector)node1; addConnector(connector); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 234 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 236 */     node.network_$eq(li$cil$oc$server$network$Network$$wrapper());
/* 237 */     return newNode;
/*     */   }
/*     */   
/*     */   private boolean add(Vertex oldNode, Node addedNode) {
/*     */     // Byte code:
/*     */     //   0: getstatic scala/collection/mutable/Buffer$.MODULE$ : Lscala/collection/mutable/Buffer$;
/*     */     //   3: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   6: checkcast scala/collection/mutable/Buffer
/*     */     //   9: astore_3
/*     */     //   10: aload_2
/*     */     //   11: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   16: ifnonnull -> 376
/*     */     //   19: aload_0
/*     */     //   20: aload_2
/*     */     //   21: invokespecial addNew : (Lli/cil/oc/server/network/Node;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   24: astore #4
/*     */     //   26: new li/cil/oc/server/network/Network$Edge
/*     */     //   29: dup
/*     */     //   30: aload_1
/*     */     //   31: aload #4
/*     */     //   33: invokespecial <init> : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Network$Vertex;)V
/*     */     //   36: pop
/*     */     //   37: aload_2
/*     */     //   38: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   43: astore #5
/*     */     //   45: getstatic li/cil/oc/api/network/Visibility.None : Lli/cil/oc/api/network/Visibility;
/*     */     //   48: aload #5
/*     */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   53: ifeq -> 101
/*     */     //   56: aload_3
/*     */     //   57: new scala/Tuple2
/*     */     //   60: dup
/*     */     //   61: aload_2
/*     */     //   62: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   65: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   68: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   71: iconst_1
/*     */     //   72: anewarray li/cil/oc/server/network/Node
/*     */     //   75: dup
/*     */     //   76: iconst_0
/*     */     //   77: aload_2
/*     */     //   78: aastore
/*     */     //   79: checkcast [Ljava/lang/Object;
/*     */     //   82: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   85: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   88: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   91: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   96: astore #6
/*     */     //   98: goto -> 312
/*     */     //   101: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   104: aload #5
/*     */     //   106: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 200
/*     */     //   112: aload_3
/*     */     //   113: new scala/Tuple2
/*     */     //   116: dup
/*     */     //   117: aload_2
/*     */     //   118: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   121: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   124: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   127: iconst_1
/*     */     //   128: anewarray li/cil/oc/server/network/Node
/*     */     //   131: dup
/*     */     //   132: iconst_0
/*     */     //   133: aload_2
/*     */     //   134: aastore
/*     */     //   135: checkcast [Ljava/lang/Object;
/*     */     //   138: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   141: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   144: checkcast scala/collection/TraversableLike
/*     */     //   147: aload_0
/*     */     //   148: aload_2
/*     */     //   149: invokevirtual neighbors : (Lli/cil/oc/api/network/Node;)Lscala/collection/Iterable;
/*     */     //   152: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   155: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   158: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   163: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   166: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   171: pop
/*     */     //   172: aload_0
/*     */     //   173: aload_2
/*     */     //   174: invokevirtual reachingNodes : (Lli/cil/oc/api/network/Node;)Lscala/collection/Iterable;
/*     */     //   177: new li/cil/oc/server/network/Network$$anonfun$add$1
/*     */     //   180: dup
/*     */     //   181: aload_0
/*     */     //   182: aload_2
/*     */     //   183: aload_3
/*     */     //   184: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;Lscala/collection/mutable/Buffer;)V
/*     */     //   187: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   192: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   195: astore #6
/*     */     //   197: goto -> 312
/*     */     //   200: getstatic li/cil/oc/api/network/Visibility.Network : Lli/cil/oc/api/network/Visibility;
/*     */     //   203: aload #5
/*     */     //   205: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   208: ifeq -> 366
/*     */     //   211: aload_3
/*     */     //   212: new scala/Tuple2
/*     */     //   215: dup
/*     */     //   216: aload_2
/*     */     //   217: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   220: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   223: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   226: iconst_1
/*     */     //   227: anewarray li/cil/oc/server/network/Node
/*     */     //   230: dup
/*     */     //   231: iconst_0
/*     */     //   232: aload_2
/*     */     //   233: aastore
/*     */     //   234: checkcast [Ljava/lang/Object;
/*     */     //   237: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   240: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   243: checkcast scala/collection/TraversableLike
/*     */     //   246: aload_0
/*     */     //   247: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   250: new li/cil/oc/server/network/Network$$anonfun$add$2
/*     */     //   253: dup
/*     */     //   254: aload_0
/*     */     //   255: aload_2
/*     */     //   256: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;)V
/*     */     //   259: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   264: checkcast scala/collection/GenTraversableOnce
/*     */     //   267: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   270: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   273: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   278: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   281: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   286: pop
/*     */     //   287: aload_0
/*     */     //   288: aload_2
/*     */     //   289: invokevirtual reachingNodes : (Lli/cil/oc/api/network/Node;)Lscala/collection/Iterable;
/*     */     //   292: new li/cil/oc/server/network/Network$$anonfun$add$3
/*     */     //   295: dup
/*     */     //   296: aload_0
/*     */     //   297: aload_2
/*     */     //   298: aload_3
/*     */     //   299: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Node;Lscala/collection/mutable/Buffer;)V
/*     */     //   302: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   307: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   310: astore #6
/*     */     //   312: aload #6
/*     */     //   314: pop
/*     */     //   315: aload_2
/*     */     //   316: aload_2
/*     */     //   317: invokeinterface onConnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   322: aload_0
/*     */     //   323: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   326: new li/cil/oc/server/network/Network$$anonfun$8
/*     */     //   329: dup
/*     */     //   330: aload_0
/*     */     //   331: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   334: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   339: checkcast scala/collection/Iterable
/*     */     //   342: astore #7
/*     */     //   344: aload #7
/*     */     //   346: new li/cil/oc/server/network/Network$$anonfun$add$4
/*     */     //   349: dup
/*     */     //   350: aload_0
/*     */     //   351: aload_3
/*     */     //   352: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lscala/collection/mutable/Buffer;)V
/*     */     //   355: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   360: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   363: goto -> 988
/*     */     //   366: new scala/MatchError
/*     */     //   369: dup
/*     */     //   370: aload #5
/*     */     //   372: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   375: athrow
/*     */     //   376: aload_2
/*     */     //   377: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   382: aload_1
/*     */     //   383: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   386: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   391: astore #8
/*     */     //   393: dup
/*     */     //   394: ifnonnull -> 406
/*     */     //   397: pop
/*     */     //   398: aload #8
/*     */     //   400: ifnull -> 414
/*     */     //   403: goto -> 421
/*     */     //   406: aload #8
/*     */     //   408: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   411: ifeq -> 421
/*     */     //   414: iconst_0
/*     */     //   415: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   418: goto -> 988
/*     */     //   421: aload_2
/*     */     //   422: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   427: checkcast li/cil/oc/server/network/Network$Wrapper
/*     */     //   430: invokevirtual network : ()Lli/cil/oc/server/network/Network;
/*     */     //   433: astore #9
/*     */     //   435: aload #9
/*     */     //   437: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   440: new li/cil/oc/server/network/Network$$anonfun$9
/*     */     //   443: dup
/*     */     //   444: aload_0
/*     */     //   445: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   448: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   453: checkcast scala/collection/MapLike
/*     */     //   456: invokeinterface values : ()Lscala/collection/Iterable;
/*     */     //   461: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   464: ldc li/cil/oc/server/network/Network$Vertex
/*     */     //   466: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   469: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   474: checkcast [Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   477: astore #10
/*     */     //   479: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   482: aload #10
/*     */     //   484: checkcast [Ljava/lang/Object;
/*     */     //   487: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   490: invokeinterface isEmpty : ()Z
/*     */     //   495: ifeq -> 503
/*     */     //   498: aload #9
/*     */     //   500: goto -> 562
/*     */     //   503: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   506: aload #10
/*     */     //   508: checkcast [Ljava/lang/Object;
/*     */     //   511: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   514: new li/cil/oc/server/network/Network$$anonfun$10
/*     */     //   517: dup
/*     */     //   518: aload_0
/*     */     //   519: aload #9
/*     */     //   521: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lli/cil/oc/server/network/Network;)V
/*     */     //   524: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   529: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   532: aload #10
/*     */     //   534: checkcast [Ljava/lang/Object;
/*     */     //   537: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   540: invokeinterface head : ()Ljava/lang/Object;
/*     */     //   545: checkcast li/cil/oc/server/network/Network$Vertex
/*     */     //   548: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   551: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   556: checkcast li/cil/oc/server/network/Network$Wrapper
/*     */     //   559: invokevirtual network : ()Lli/cil/oc/server/network/Network;
/*     */     //   562: astore #11
/*     */     //   564: aload_2
/*     */     //   565: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   570: ifnull -> 979
/*     */     //   573: aload_2
/*     */     //   574: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   579: checkcast li/cil/oc/server/network/Network$Wrapper
/*     */     //   582: invokevirtual network : ()Lli/cil/oc/server/network/Network;
/*     */     //   585: aload #11
/*     */     //   587: astore #12
/*     */     //   589: dup
/*     */     //   590: ifnonnull -> 602
/*     */     //   593: pop
/*     */     //   594: aload #12
/*     */     //   596: ifnull -> 610
/*     */     //   599: goto -> 979
/*     */     //   602: aload #12
/*     */     //   604: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   607: ifeq -> 979
/*     */     //   610: aload_2
/*     */     //   611: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   616: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   619: astore #13
/*     */     //   621: dup
/*     */     //   622: ifnonnull -> 634
/*     */     //   625: pop
/*     */     //   626: aload #13
/*     */     //   628: ifnull -> 642
/*     */     //   631: goto -> 688
/*     */     //   634: aload #13
/*     */     //   636: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   639: ifeq -> 688
/*     */     //   642: aload_3
/*     */     //   643: new scala/Tuple2
/*     */     //   646: dup
/*     */     //   647: aload_2
/*     */     //   648: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   651: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   654: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   657: iconst_1
/*     */     //   658: anewarray li/cil/oc/server/network/Node
/*     */     //   661: dup
/*     */     //   662: iconst_0
/*     */     //   663: aload_1
/*     */     //   664: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   667: aastore
/*     */     //   668: checkcast [Ljava/lang/Object;
/*     */     //   671: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   674: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   677: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   680: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   685: goto -> 691
/*     */     //   688: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   691: pop
/*     */     //   692: aload_1
/*     */     //   693: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   696: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   701: getstatic li/cil/oc/api/network/Visibility.Neighbors : Lli/cil/oc/api/network/Visibility;
/*     */     //   704: astore #14
/*     */     //   706: dup
/*     */     //   707: ifnonnull -> 719
/*     */     //   710: pop
/*     */     //   711: aload #14
/*     */     //   713: ifnull -> 727
/*     */     //   716: goto -> 773
/*     */     //   719: aload #14
/*     */     //   721: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   724: ifeq -> 773
/*     */     //   727: aload_3
/*     */     //   728: new scala/Tuple2
/*     */     //   731: dup
/*     */     //   732: aload_1
/*     */     //   733: invokevirtual data : ()Lli/cil/oc/server/network/Node;
/*     */     //   736: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   739: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   742: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   745: iconst_1
/*     */     //   746: anewarray li/cil/oc/server/network/Node
/*     */     //   749: dup
/*     */     //   750: iconst_0
/*     */     //   751: aload_2
/*     */     //   752: aastore
/*     */     //   753: checkcast [Ljava/lang/Object;
/*     */     //   756: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   759: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   762: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   765: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/Buffer;
/*     */     //   770: goto -> 776
/*     */     //   773: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   776: pop
/*     */     //   777: aload_0
/*     */     //   778: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   781: astore #15
/*     */     //   783: aload #11
/*     */     //   785: invokevirtual nodes : ()Lscala/collection/Iterable;
/*     */     //   788: astore #16
/*     */     //   790: aload #15
/*     */     //   792: new li/cil/oc/server/network/Network$$anonfun$12
/*     */     //   795: dup
/*     */     //   796: aload_0
/*     */     //   797: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   800: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   805: checkcast scala/collection/Iterable
/*     */     //   808: astore #17
/*     */     //   810: aload #16
/*     */     //   812: new li/cil/oc/server/network/Network$$anonfun$13
/*     */     //   815: dup
/*     */     //   816: aload_0
/*     */     //   817: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   820: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   825: checkcast scala/collection/Iterable
/*     */     //   828: astore #18
/*     */     //   830: aload #18
/*     */     //   832: new li/cil/oc/server/network/Network$$anonfun$add$5
/*     */     //   835: dup
/*     */     //   836: aload_0
/*     */     //   837: aload_3
/*     */     //   838: aload #15
/*     */     //   840: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lscala/collection/mutable/Buffer;Lscala/collection/Iterable;)V
/*     */     //   843: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   848: aload #17
/*     */     //   850: new li/cil/oc/server/network/Network$$anonfun$add$6
/*     */     //   853: dup
/*     */     //   854: aload_0
/*     */     //   855: aload_3
/*     */     //   856: aload #16
/*     */     //   858: invokespecial <init> : (Lli/cil/oc/server/network/Network;Lscala/collection/mutable/Buffer;Lscala/collection/Iterable;)V
/*     */     //   861: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   866: aload_0
/*     */     //   867: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   870: aload #11
/*     */     //   872: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   875: invokeinterface $plus$plus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/generic/Growable;
/*     */     //   880: pop
/*     */     //   881: aload_0
/*     */     //   882: invokespecial connectors : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   885: aload #11
/*     */     //   887: invokespecial connectors : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   890: invokevirtual $plus$plus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/mutable/ArrayBuffer;
/*     */     //   893: pop
/*     */     //   894: aload_0
/*     */     //   895: aload_0
/*     */     //   896: invokevirtual globalBuffer : ()D
/*     */     //   899: aload #11
/*     */     //   901: invokevirtual globalBuffer : ()D
/*     */     //   904: dadd
/*     */     //   905: invokevirtual globalBuffer_$eq : (D)V
/*     */     //   908: aload_0
/*     */     //   909: aload_0
/*     */     //   910: invokevirtual globalBufferSize : ()D
/*     */     //   913: aload #11
/*     */     //   915: invokevirtual globalBufferSize : ()D
/*     */     //   918: dadd
/*     */     //   919: invokevirtual globalBufferSize_$eq : (D)V
/*     */     //   922: aload #11
/*     */     //   924: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   927: invokeinterface values : ()Lscala/collection/Iterable;
/*     */     //   932: new li/cil/oc/server/network/Network$$anonfun$add$7
/*     */     //   935: dup
/*     */     //   936: aload_0
/*     */     //   937: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   940: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   945: aload #11
/*     */     //   947: invokevirtual li$cil$oc$server$network$Network$$data : ()Lscala/collection/mutable/Map;
/*     */     //   950: invokeinterface clear : ()V
/*     */     //   955: aload #11
/*     */     //   957: invokespecial connectors : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   960: invokevirtual clear : ()V
/*     */     //   963: new li/cil/oc/server/network/Network$Edge
/*     */     //   966: dup
/*     */     //   967: aload_1
/*     */     //   968: aload_0
/*     */     //   969: aload_2
/*     */     //   970: invokespecial node : (Lli/cil/oc/api/network/Node;)Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   973: invokespecial <init> : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Network$Vertex;)V
/*     */     //   976: goto -> 988
/*     */     //   979: aload_0
/*     */     //   980: aload_1
/*     */     //   981: aload_2
/*     */     //   982: invokespecial add : (Lli/cil/oc/server/network/Network$Vertex;Lli/cil/oc/server/network/Node;)Z
/*     */     //   985: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   988: pop
/*     */     //   989: aload_3
/*     */     //   990: new li/cil/oc/server/network/Network$$anonfun$add$8
/*     */     //   993: dup
/*     */     //   994: aload_0
/*     */     //   995: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   998: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1003: new li/cil/oc/server/network/Network$$anonfun$add$9
/*     */     //   1006: dup
/*     */     //   1007: aload_0
/*     */     //   1008: invokespecial <init> : (Lli/cil/oc/server/network/Network;)V
/*     */     //   1011: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1016: iconst_1
/*     */     //   1017: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #242	-> 0
/*     */     //   #244	-> 10
/*     */     //   #245	-> 19
/*     */     //   #246	-> 26
/*     */     //   #247	-> 37
/*     */     //   #248	-> 45
/*     */     //   #249	-> 56
/*     */     //   #250	-> 101
/*     */     //   #251	-> 112
/*     */     //   #252	-> 172
/*     */     //   #250	-> 195
/*     */     //   #253	-> 200
/*     */     //   #255	-> 211
/*     */     //   #256	-> 287
/*     */     //   #253	-> 310
/*     */     //   #247	-> 312
/*     */     //   #260	-> 315
/*     */     //   #261	-> 322
/*     */     //   #262	-> 344
/*     */     //   #244	-> 360
/*     */     //   #247	-> 366
/*     */     //   #263	-> 376
/*     */     //   #265	-> 414
/*     */     //   #268	-> 421
/*     */     //   #278	-> 435
/*     */     //   #279	-> 479
/*     */     //   #280	-> 498
/*     */     //   #282	-> 503
/*     */     //   #305	-> 529
/*     */     //   #279	-> 562
/*     */     //   #311	-> 564
/*     */     //   #312	-> 610
/*     */     //   #313	-> 642
/*     */     //   #312	-> 688
/*     */     //   #314	-> 692
/*     */     //   #315	-> 727
/*     */     //   #314	-> 773
/*     */     //   #317	-> 777
/*     */     //   #318	-> 783
/*     */     //   #319	-> 790
/*     */     //   #320	-> 810
/*     */     //   #322	-> 830
/*     */     //   #323	-> 848
/*     */     //   #325	-> 866
/*     */     //   #326	-> 881
/*     */     //   #327	-> 894
/*     */     //   #328	-> 908
/*     */     //   #329	-> 922
/*     */     //   #336	-> 945
/*     */     //   #337	-> 955
/*     */     //   #339	-> 963
/*     */     //   #341	-> 979
/*     */     //   #244	-> 988
/*     */     //   #344	-> 989
/*     */     //   #346	-> 1016
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1018	0	this	Lli/cil/oc/server/network/Network;
/*     */     //   0	1018	1	oldNode	Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   0	1018	2	addedNode	Lli/cil/oc/server/network/Node;
/*     */     //   10	1007	3	connects	Lscala/collection/mutable/Buffer;
/*     */     //   26	334	4	newNode	Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   344	16	7	visibleNodes	Lscala/collection/Iterable;
/*     */     //   435	583	9	otherNetwork	Lli/cil/oc/server/network/Network;
/*     */     //   479	539	10	duplicates	[Lli/cil/oc/server/network/Network$Vertex;
/*     */     //   564	454	11	otherNetworkAfterReaddress	Lli/cil/oc/server/network/Network;
/*     */     //   783	193	15	oldNodes	Lscala/collection/Iterable;
/*     */     //   790	186	16	newNodes	Lscala/collection/Iterable;
/*     */     //   810	166	17	oldVisibleNodes	Lscala/collection/Iterable;
/*     */     //   830	146	18	newVisibleNodes	Lscala/collection/Iterable;
/*     */   }
/*     */   
/*     */   public final class Network$$anonfun$add$1
/*     */     extends AbstractFunction1<Node, Buffer<Tuple2<Node, Iterable<Node>>>>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Node addedNode$1;
/*     */     private final Buffer connects$1;
/*     */     
/*     */     public final Buffer<Tuple2<Node, Iterable<Node>>> apply(Node node) {
/* 252 */       (new Node[1])[0] = this.addedNode$1; return this.connects$1.$plus$eq(new Tuple2(node, scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Node[1]))));
/*     */     } public Network$$anonfun$add$1(Network $outer, Node addedNode$1, Buffer connects$1) {} }
/*     */   public final class Network$$anonfun$add$2 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Node addedNode$1;
/* 255 */     public final boolean apply(Node x$13) { Node node = this.addedNode$1; if (x$13 == null) { if (node != null); } else if (x$13.equals(node)) {  }
/* 256 */        } public Network$$anonfun$add$2(Network $outer, Node addedNode$1) {} } public final class Network$$anonfun$add$3 extends AbstractFunction1<Node, Buffer<Tuple2<Node, Iterable<Node>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Node addedNode$1; private final Buffer connects$1; public final Buffer<Tuple2<Node, Iterable<Node>>> apply(Node node) { (new Node[1])[0] = this.addedNode$1; return this.connects$1.$plus$eq(new Tuple2(node, scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Node[1])))); }
/*     */     
/*     */     public Network$$anonfun$add$3(Network $outer, Node addedNode$1, Buffer connects$1) {} }
/*     */   public final class Network$$anonfun$8 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 261 */     public final boolean apply(Node x$14) { Visibility visibility = Visibility.Network; if (x$14.reachability() == null) { x$14.reachability(); if (visibility != null); } else if (x$14.reachability().equals(visibility)) {  }
/* 262 */        } public Network$$anonfun$8(Network $outer) {} } public final class Network$$anonfun$add$4 extends AbstractFunction1<Node, Buffer<Tuple2<Node, Iterable<Node>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer connects$1; public final Buffer<Tuple2<Node, Iterable<Node>>> apply(Node node) { return this.connects$1.$plus$eq(new Tuple2(node, this.$outer.nodes())); }
/*     */ 
/*     */ 
/*     */     
/*     */     public Network$$anonfun$add$4(Network $outer, Buffer connects$1) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$9
/*     */     extends AbstractFunction1<Tuple2<String, Vertex>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final boolean apply(Tuple2 entry) {
/* 278 */       return this.$outer.li$cil$oc$server$network$Network$$data().contains(entry._1());
/*     */     } public Network$$anonfun$9(Network $outer) {} }
/*     */   public final class Network$$anonfun$10 extends AbstractFunction1<Vertex, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Network otherNetwork$1;
/*     */     public Network$$anonfun$10(Network $outer, Network otherNetwork$1) {}
/*     */     public final void apply(Network.Vertex vertex) {
/* 283 */       Node node = vertex.data();
/* 284 */       Node[] neighbors = (Node[])((TraversableOnce)vertex.edges().map((Function1)new Network$$anonfun$10$$anonfun$11(this, vertex), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(Node.class));
/*     */       
/* 286 */       String newAddress = ""; do {
/* 287 */         newAddress = UUID.randomUUID().toString();
/*     */       }
/* 289 */       while (this.$outer.li$cil$oc$server$network$Network$$data().contains(newAddress) || this.otherNetwork$1.li$cil$oc$server$network$Network$$data().contains(newAddress));
/*     */ 
/*     */ 
/*     */       
/* 293 */       node.remove();
/* 294 */       node.address_$eq(newAddress);
/* 295 */       Network$.MODULE$.joinNewNetwork(node);
/*     */       
/* 297 */       String str1 = newAddress; if (node.address() == null) { node.address(); if (str1 != null)
/*     */         
/*     */         { 
/* 300 */           li.cil.oc.OpenComputers$.MODULE$.log().error("I can't see this happening any other way than someone directly setting node addresses, which they shouldn't. So yeah. Shit'll be borked. Deal with it.");
/* 301 */           node.remove(); }  } else { if (node.address().equals(str1)) { scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])neighbors).filter((Function1)new Network$$anonfun$10$$anonfun$apply$2(this))).foreach((Function1)new Network$$anonfun$10$$anonfun$apply$3(this, node)); return; }  li.cil.oc.OpenComputers$.MODULE$.log().error("I can't see this happening any other way than someone directly setting node addresses, which they shouldn't. So yeah. Shit'll be borked. Deal with it."); node.remove(); }
/*     */       
/*     */       scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])neighbors).filter((Function1)new Network$$anonfun$10$$anonfun$apply$2(this))).foreach((Function1)new Network$$anonfun$10$$anonfun$apply$3(this, node));
/*     */     } public final class Network$$anonfun$10$$anonfun$11 extends AbstractFunction1<Network.Edge, Node> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Network.Vertex vertex$1; public final Node apply(Network.Edge x$15) {
/*     */         return x$15.other(this.vertex$1).data();
/*     */       } public Network$$anonfun$10$$anonfun$11(Network$$anonfun$10 $outer, Network.Vertex vertex$1) {} } public final class Network$$anonfun$10$$anonfun$apply$2 extends AbstractFunction1<Node, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(Node x$16) {
/*     */         return !(x$16.network() == null);
/*     */       }
/*     */       public Network$$anonfun$10$$anonfun$apply$2(Network$$anonfun$10 $outer) {} }
/*     */     public final class Network$$anonfun$10$$anonfun$apply$3 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Node node$4;
/*     */       public final void apply(Node x$17) {
/*     */         x$17.connect(this.node$4);
/*     */       }
/*     */       public Network$$anonfun$10$$anonfun$apply$3(Network$$anonfun$10 $outer, Node node$4) {} } }
/*     */   public final class Network$$anonfun$12 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 319 */     public final boolean apply(Node x$18) { Visibility visibility = Visibility.Network; if (x$18.reachability() == null) { x$18.reachability(); if (visibility != null); } else if (x$18.reachability().equals(visibility)) {  }
/* 320 */        } public Network$$anonfun$12(Network $outer) {} } public final class Network$$anonfun$13 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x$19) { Visibility visibility = Visibility.Network; if (x$19.reachability() == null) { x$19.reachability(); if (visibility != null); } else if (x$19.reachability().equals(visibility))
/*     */       {  }
/* 322 */        } public Network$$anonfun$13(Network $outer) {} } public final class Network$$anonfun$add$5 extends AbstractFunction1<Node, Buffer<Tuple2<Node, Iterable<Node>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer connects$1; private final Iterable oldNodes$1; public final Buffer<Tuple2<Node, Iterable<Node>>> apply(Node node) { return this.connects$1.$plus$eq(new Tuple2(node, this.oldNodes$1)); } public Network$$anonfun$add$5(Network $outer, Buffer connects$1, Iterable oldNodes$1) {} } public final class Network$$anonfun$add$6 extends AbstractFunction1<Node, Buffer<Tuple2<Node, Iterable<Node>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer connects$1; private final Iterable newNodes$1; public final Buffer<Tuple2<Node, Iterable<Node>>> apply(Node node) {
/* 323 */       return this.connects$1.$plus$eq(new Tuple2(node, this.newNodes$1));
/*     */     }
/*     */     public Network$$anonfun$add$6(Network $outer, Buffer connects$1, Iterable newNodes$1) {} }
/*     */   public final class Network$$anonfun$add$7 extends AbstractFunction1<Vertex, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public Network$$anonfun$add$7(Network $outer) {}
/*     */     
/*     */     public final void apply(Network.Vertex node) {
/* 330 */       Node node1 = node.data();
/* 331 */       if (node1 instanceof Connector) { Connector connector = (Connector)node1; connector.distributor_$eq((Option<Distributor>)new Some(this.$outer.li$cil$oc$server$network$Network$$wrapper())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 332 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 334 */       node.data().network_$eq(this.$outer.li$cil$oc$server$network$Network$$wrapper());
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$add$8
/*     */     extends AbstractFunction1<Tuple2<Node, Iterable<Node>>, Object> implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/* 344 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Network$$anonfun$add$8(Network $outer) {} } public final class Network$$anonfun$add$9 extends AbstractFunction1<Tuple2<Node, Iterable<Node>>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$21) { Tuple2 tuple2 = x$21; if (tuple2 != null) { Node node = (Node)tuple2._1(); Iterable nodes = (Iterable)tuple2._2(); nodes.foreach((Function1)new Network$$anonfun$add$9$$anonfun$apply$4(this, node)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Network$$anonfun$add$9(Network $outer) {} public final class Network$$anonfun$add$9$$anonfun$apply$4 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$5; public final void apply(Node x$20) { ((Node)x$20).onConnect(this.node$5); }
/*     */ 
/*     */       
/*     */       public Network$$anonfun$add$9$$anonfun$apply$4(Network$$anonfun$add$9 $outer, Node node$5) {} }
/*     */      }
/*     */   
/* 350 */   private void handleSplit(Seq subGraphs) { if (subGraphs.size() > 1)
/* 351 */     { Seq nodes = (Seq)subGraphs.map((Function1)new Network$$anonfun$14(this), scala.collection.Seq$.MODULE$.canBuildFrom());
/* 352 */       Seq visibleNodes = (Seq)nodes.map((Function1)new Network$$anonfun$15(this), scala.collection.Seq$.MODULE$.canBuildFrom());
/*     */       
/* 354 */       li$cil$oc$server$network$Network$$data().clear();
/* 355 */       connectors().clear();
/* 356 */       globalBuffer_$eq(0.0D);
/* 357 */       globalBufferSize_$eq(0.0D);
/* 358 */       li$cil$oc$server$network$Network$$data().$plus$plus$eq((TraversableOnce)subGraphs.head());
/* 359 */       li$cil$oc$server$network$Network$$data().values().foreach((Function1)new Network$$anonfun$handleSplit$2(this));
/*     */ 
/*     */ 
/*     */       
/* 363 */       ((IterableLike)subGraphs.tail()).foreach((Function1)new Network$$anonfun$handleSplit$3(this));
/*     */       
/* 365 */       subGraphs.indices().foreach$mVc$sp((Function1)new Network$$anonfun$handleSplit$1(this, subGraphs, nodes, visibleNodes)); }  } public final class Network$$anonfun$14 extends AbstractFunction1<Map<String, Vertex>, Iterable<Node>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<Node> apply(Map x$22) { return (Iterable<Node>)x$22.values().map((Function1)new Network$$anonfun$14$$anonfun$apply$5(this), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public Network$$anonfun$14(Network $outer) {} public final class Network$$anonfun$14$$anonfun$apply$5 extends AbstractFunction1<Network.Vertex, Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply(Network.Vertex x$23) { return x$23.data(); } public Network$$anonfun$14$$anonfun$apply$5(Network$$anonfun$14 $outer) {} } } public final class Network$$anonfun$15 extends AbstractFunction1<Iterable<Node>, Iterable<Node>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<Node> apply(Iterable x$24) { return (Iterable<Node>)x$24.filter((Function1)new Network$$anonfun$15$$anonfun$apply$6(this)); } public Network$$anonfun$15(Network $outer) {} public final class Network$$anonfun$15$$anonfun$apply$6 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x$25) { Visibility visibility = Visibility.Network; if (x$25.reachability() == null) { x$25.reachability(); if (visibility != null); } else if (x$25.reachability().equals(visibility)) {  }  } public Network$$anonfun$15$$anonfun$apply$6(Network$$anonfun$15 $outer) {} } } public final class Network$$anonfun$handleSplit$2 extends AbstractFunction1<Vertex, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Network.Vertex node) { Node node1 = node.data(); if (node1 instanceof Connector) { Connector connector = (Connector)node1; this.$outer.addConnector(connector); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public Network$$anonfun$handleSplit$2(Network $outer) {} } public final class Network$$anonfun$handleSplit$3 extends AbstractFunction1<Map<String, Vertex>, Network> implements Serializable { public static final long serialVersionUID = 0L; public final Network apply(Map<String, Network.Vertex> x$26) { return new Network(x$26); } public Network$$anonfun$handleSplit$3(Network $outer) {} } public final class Network$$anonfun$handleSplit$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Seq subGraphs$1; public final Seq nodes$1; public final Seq visibleNodes$1; public final void apply(int indexA) { apply$mcVI$sp(indexA); } public Network$$anonfun$handleSplit$1(Network $outer, Seq subGraphs$1, Seq nodes$1, Seq visibleNodes$1) {}
/* 366 */     public void apply$mcVI$sp(int indexA) { Iterable nodesA = (Iterable)this.nodes$1.apply(indexA);
/* 367 */       Iterable visibleNodesA = (Iterable)this.visibleNodes$1.apply(indexA); scala.runtime.RichInt$.MODULE$
/* 368 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(indexA + 1), this.subGraphs$1.length()).foreach$mVc$sp((Function1)new Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1(this, nodesA, visibleNodesA)); } public final class Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final Iterable nodesA$1; private final Iterable visibleNodesA$1; public final void apply(int indexB) { apply$mcVI$sp(indexB); } public Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1(Network$$anonfun$handleSplit$1 $outer, Iterable nodesA$1, Iterable visibleNodesA$1) {}
/* 369 */       public void apply$mcVI$sp(int indexB) { Iterable nodesB = (Iterable)this.$outer.nodes$1.apply(indexB);
/* 370 */         Iterable visibleNodesB = (Iterable)this.$outer.visibleNodes$1.apply(indexB);
/* 371 */         this.visibleNodesA$1.foreach((Function1)new Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, nodesB));
/* 372 */         visibleNodesB.foreach((Function1)new Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3(this)); } public final class Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Iterable nodesB$1; public final void apply(Node node) { this.nodesB$1.foreach((Function1)new Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$7(this, node)); } public Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1 $outer, Iterable nodesB$1) {} public final class Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$7 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$6; public final void apply(Node x$27) { x$27.onDisconnect(this.node$6); } public Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$7(Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 $outer, Node node$6) {} } } public final class Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node node) { this.$outer.nodesA$1.foreach((Function1)new Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$8(this, node)); } public Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3(Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1 $outer) {} public final class Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$8 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$7; public final void apply(Node x$28) { x$28.onDisconnect(this.node$7); }
/*     */ 
/*     */           
/*     */           public Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$8(Network$$anonfun$handleSplit$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$3 $outer, Node node$7) {} }
/*     */          } } }
/*     */   
/* 378 */   private void send(Node source, Iterable targets, String name, Seq args) { Message message = new Message(source, name, (Object[])scala.Array$.MODULE$.apply(args, scala.reflect.ClassTag$.MODULE$.AnyRef()));
/* 379 */     targets.foreach((Function1)new Network$$anonfun$send$1(this, message)); } public final class Network$$anonfun$send$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Network.Message message$1; public final void apply(Node x$29) { x$29.host().onMessage(this.message$1); }
/*     */ 
/*     */     
/*     */     public Network$$anonfun$send$1(Network $outer, Network.Message message$1) {} }
/*     */   
/*     */   public void addConnector(Connector connector) {
/* 385 */     if (connector.localBufferSize() > false) {
/* 386 */       scala.Predef$.MODULE$.assert(!connectors().contains(connector));
/* 387 */       connectors().$plus$eq(connector);
/* 388 */       globalBuffer_$eq(globalBuffer() + connector.localBuffer());
/* 389 */       globalBufferSize_$eq(globalBufferSize() + connector.localBufferSize());
/*     */     } 
/* 391 */     connector.distributor_$eq((Option<Distributor>)new Some(li$cil$oc$server$network$Network$$wrapper()));
/*     */   }
/*     */   
/*     */   public void removeConnector(Connector connector) {
/* 395 */     if (connector.localBufferSize() > false) {
/* 396 */       scala.Predef$.MODULE$.assert(connectors().contains(connector));
/* 397 */       connectors().$minus$eq(connector);
/* 398 */       globalBuffer_$eq(globalBuffer() - connector.localBuffer());
/* 399 */       globalBufferSize_$eq(globalBufferSize() - connector.localBufferSize());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public double changeBuffer(double delta) {
/* 405 */     if (li.cil.oc.Settings$.MODULE$.get().ignorePower()) {
/*     */ 
/*     */     
/*     */     } else {
/* 409 */       synchronized (this) {
/* 410 */         double oldBuffer = globalBuffer();
/* 411 */         globalBuffer_$eq(scala.math.package$.MODULE$.min(scala.math.package$.MODULE$.max(globalBuffer() + delta, 0.0D), globalBufferSize()));
/* 412 */         if (globalBuffer() == oldBuffer) {
/* 413 */           return delta;
/*     */         }
/*     */         
/* 416 */         DoubleRef remaining = DoubleRef.create(-delta);
/* 417 */         connectors().withFilter((Function1)new Network$$anonfun$changeBuffer$1(this, remaining)).foreach((Function1)new Network$$anonfun$changeBuffer$2(this, remaining));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 432 */         DoubleRef doubleRef1 = DoubleRef.create(delta);
/* 433 */         connectors().withFilter((Function1)new Network$$anonfun$changeBuffer$3(this, doubleRef1)).foreach((Function1)new Network$$anonfun$changeBuffer$4(this, doubleRef1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 446 */         Double double_ = (delta < false) ? BoxesRunTime.boxToDouble(-remaining.elem) : BoxesRunTime.boxToDouble(doubleRef1.elem);
/*     */         return BoxesRunTime.unboxToDouble(double_);
/*     */       } 
/*     */     } 
/*     */     return (delta == false) ? 0.0D : "JD-Core does not support Kotlin";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void isServer_$eq(Function0<Object> paramFunction0) {
/*     */     Network$.MODULE$.isServer_$eq(paramFunction0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Function0<Object> isServer() {
/*     */     return Network$.MODULE$.isServer();
/*     */   }
/*     */ 
/*     */   
/*     */   public static Packet newPacket(NBTTagCompound paramNBTTagCompound) {
/*     */     return Network$.MODULE$.newPacket(paramNBTTagCompound);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Packet newPacket(String paramString1, String paramString2, int paramInt, Object[] paramArrayOfObject) {
/*     */     return Network$.MODULE$.newPacket(paramString1, paramString2, paramInt, paramArrayOfObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public static NodeBuilder newNode(Environment paramEnvironment, Visibility paramVisibility) {
/*     */     return Network$.MODULE$.newNode(paramEnvironment, paramVisibility);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void sendWirelessPacket(WirelessEndpoint paramWirelessEndpoint, double paramDouble, li.cil.oc.api.network.Packet paramPacket) {
/*     */     Network$.MODULE$.sendWirelessPacket(paramWirelessEndpoint, paramDouble, paramPacket);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void leaveWirelessNetwork(WirelessEndpoint paramWirelessEndpoint, int paramInt) {
/*     */     Network$.MODULE$.leaveWirelessNetwork(paramWirelessEndpoint, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void leaveWirelessNetwork(WirelessEndpoint paramWirelessEndpoint) {
/*     */     Network$.MODULE$.leaveWirelessNetwork(paramWirelessEndpoint);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateWirelessNetwork(WirelessEndpoint paramWirelessEndpoint) {
/*     */     Network$.MODULE$.updateWirelessNetwork(paramWirelessEndpoint);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void joinWirelessNetwork(WirelessEndpoint paramWirelessEndpoint) {
/*     */     Network$.MODULE$.joinWirelessNetwork(paramWirelessEndpoint);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Option<Node> getNetworkNode(TileEntity paramTileEntity, ForgeDirection paramForgeDirection) {
/*     */     return Network$.MODULE$.getNetworkNode(paramTileEntity, paramForgeDirection);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void joinNewNetwork(Node paramNode) {
/*     */     Network$.MODULE$.joinNewNetwork(paramNode);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void joinOrCreateNetwork(TileEntity paramTileEntity) {
/*     */     Network$.MODULE$.joinOrCreateNetwork(paramTileEntity);
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$changeBuffer$1
/*     */     extends AbstractFunction1<Connector, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final DoubleRef remaining$1;
/*     */ 
/*     */     
/*     */     public final boolean apply(Connector connector) {
/*     */       return (this.remaining$1.elem > false);
/*     */     }
/*     */ 
/*     */     
/*     */     public Network$$anonfun$changeBuffer$1(Network $outer, DoubleRef remaining$1) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$changeBuffer$2
/*     */     extends AbstractFunction1<Connector, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final DoubleRef remaining$1;
/*     */ 
/*     */     
/*     */     public Network$$anonfun$changeBuffer$2(Network $outer, DoubleRef remaining$1) {}
/*     */ 
/*     */     
/*     */     public final void apply(Connector connector) {
/*     */       if (connector.localBuffer() > false) {
/*     */         if (connector.localBuffer() < this.remaining$1.elem) {
/*     */           this.remaining$1.elem -= connector.localBuffer();
/*     */           connector.localBuffer_$eq(0.0D);
/*     */         } else {
/*     */           connector.localBuffer_$eq(connector.localBuffer() - this.remaining$1.elem);
/*     */           this.remaining$1.elem = 0.0D;
/*     */         } 
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$changeBuffer$3
/*     */     extends AbstractFunction1<Connector, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final DoubleRef remaining$2;
/*     */ 
/*     */     
/*     */     public final boolean apply(Connector connector) {
/*     */       return (this.remaining$2.elem > false);
/*     */     }
/*     */ 
/*     */     
/*     */     public Network$$anonfun$changeBuffer$3(Network $outer, DoubleRef remaining$2) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Network$$anonfun$changeBuffer$4
/*     */     extends AbstractFunction1<Connector, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final DoubleRef remaining$2;
/*     */ 
/*     */     
/*     */     public Network$$anonfun$changeBuffer$4(Network $outer, DoubleRef remaining$2) {}
/*     */ 
/*     */     
/*     */     public final void apply(Connector connector) {
/*     */       if (connector.localBuffer() < connector.localBufferSize()) {
/*     */         double space = connector.localBufferSize() - connector.localBuffer();
/*     */         if (space < this.remaining$2.elem) {
/*     */           this.remaining$2.elem -= space;
/*     */           connector.localBuffer_$eq(connector.localBufferSize());
/*     */         } else {
/*     */           connector.localBuffer_$eq(connector.localBuffer() + this.remaining$2.elem);
/*     */           this.remaining$2.elem = 0.0D;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class NodeBuilder
/*     */     implements Builder.NodeBuilder
/*     */   {
/*     */     private final Environment _host;
/*     */     
/*     */     private final Visibility _reachability;
/*     */ 
/*     */     
/*     */     public Environment _host() {
/* 619 */       return this._host; } public Visibility _reachability() { return this._reachability; } public NodeBuilder(Environment _host, Visibility _reachability) {} public Network.ComponentBuilder withComponent(String name, Visibility visibility) {
/* 620 */       return new Network.ComponentBuilder(_host(), _reachability(), name, visibility);
/*     */     } public Network.ComponentBuilder withComponent(String name) {
/* 622 */       return withComponent(name, _reachability());
/*     */     } public Network.ConnectorBuilder withConnector(double bufferSize) {
/* 624 */       return new Network.ConnectorBuilder(_host(), _reachability(), bufferSize);
/*     */     } public Network.ConnectorBuilder withConnector() {
/* 626 */       return withConnector(0.0D);
/*     */     }
/* 628 */     public Node create() { return Network$.MODULE$.isServer().apply$mcZ$sp() ? new Network$NodeBuilder$$anon$4(this) : 
/*     */ 
/*     */ 
/*     */         
/* 632 */         null; } public final class Network$NodeBuilder$$anon$4 implements Node, NodeVarargPart { private final Environment host; private final Visibility reachability; private String address; private li.cil.oc.api.network.Network network; public void sendToAddress(String target, String name, Seq data) { NodeVarargPart$class.sendToAddress(this, target, name, data); } public void sendToNeighbors(String name, Seq data) { NodeVarargPart$class.sendToNeighbors(this, name, data); } public void sendToReachable(String name, Seq data) { NodeVarargPart$class.sendToReachable(this, name, data); } public void sendToVisible(String name, Seq data) { NodeVarargPart$class.sendToVisible(this, name, data); } public final String address() { return this.address; } public final void address_$eq(String x$1) { this.address = x$1; } public final li.cil.oc.api.network.Network network() { return this.network; } public final void network_$eq(li.cil.oc.api.network.Network x$1) { this.network = x$1; } public boolean canBeReachedFrom(Node other) { return Node$class.canBeReachedFrom(this, other); } public boolean isNeighborOf(Node other) { return Node$class.isNeighborOf(this, other); } public Iterable<Node> reachableNodes() { return Node$class.reachableNodes(this); } public Iterable<Node> neighbors() { return Node$class.neighbors(this); } public void connect(Node node) { Node$class.connect(this, node); } public void disconnect(Node node) { Node$class.disconnect(this, node); } public void remove() { Node$class.remove(this); } public void onConnect(Node node) { Node$class.onConnect(this, node); } public void onDisconnect(Node node) { Node$class.onDisconnect(this, node); } public void load(NBTTagCompound nbt) { Node$class.load(this, nbt); } public void save(NBTTagCompound nbt) { Node$class.save(this, nbt); } public String toString() { return Node$class.toString(this); } public Network$NodeBuilder$$anon$4(Network.NodeBuilder $outer) { Node$class.$init$(this); NodeVarargPart$class.$init$(this); this.host = $outer._host(); this.reachability = $outer._reachability(); } public Environment host() { return this.host; } public Visibility reachability() { return this.reachability; } }
/*     */   }
/*     */   public static class ComponentBuilder implements Builder.ComponentBuilder { private final Environment _host; private final Visibility _reachability; private final String _name; private final Visibility _visibility;
/* 635 */     public Environment _host() { return this._host; } public Visibility _reachability() { return this._reachability; } public String _name() { return this._name; } public Visibility _visibility() { return this._visibility; } public ComponentBuilder(Environment _host, Visibility _reachability, String _name, Visibility _visibility) {} public Network.ComponentConnectorBuilder withConnector(double bufferSize) {
/* 636 */       return new Network.ComponentConnectorBuilder(_host(), _reachability(), _name(), _visibility(), bufferSize);
/*     */     } public Network.ComponentConnectorBuilder withConnector() {
/* 638 */       return withConnector(0.0D);
/*     */     }
/* 640 */     public Component create() { return Network$.MODULE$.isServer().apply$mcZ$sp() ? new Network$ComponentBuilder$$anon$2(this) : 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 646 */         null; } public final class Network$ComponentBuilder$$anon$2 implements Component, NodeVarargPart {
/*     */       private final Environment host; private final Visibility reachability; private final String name; private final Map<String, Callbacks.Callback> li$cil$oc$server$network$Component$$callbacks; private final Map<String, Option<Environment>> li$cil$oc$server$network$Component$$hosts; private Visibility li$cil$oc$server$network$Component$$_visibility; private String address; private li.cil.oc.api.network.Network network; private volatile byte bitmap$0; public void sendToAddress(String target, String name, Seq data) { NodeVarargPart$class.sendToAddress(this, target, name, data); } public void sendToNeighbors(String name, Seq data) { NodeVarargPart$class.sendToNeighbors(this, name, data); } public void sendToReachable(String name, Seq data) { NodeVarargPart$class.sendToReachable(this, name, data); } public void sendToVisible(String name, Seq data) { NodeVarargPart$class.sendToVisible(this, name, data); } private Map li$cil$oc$server$network$Component$$callbacks$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.li$cil$oc$server$network$Component$$callbacks = Component$class.li$cil$oc$server$network$Component$$callbacks(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.li$cil$oc$server$network$Component$$callbacks; }  } public Map<String, Callbacks.Callback> li$cil$oc$server$network$Component$$callbacks() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? li$cil$oc$server$network$Component$$callbacks$lzycompute() : this.li$cil$oc$server$network$Component$$callbacks; } private Map li$cil$oc$server$network$Component$$hosts$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$server$network$Component$$hosts = Component$class.li$cil$oc$server$network$Component$$hosts(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$server$network$Component$$hosts; }  } public Map<String, Option<Environment>> li$cil$oc$server$network$Component$$hosts() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$server$network$Component$$hosts$lzycompute() : this.li$cil$oc$server$network$Component$$hosts; } public Visibility li$cil$oc$server$network$Component$$_visibility() { return this.li$cil$oc$server$network$Component$$_visibility; } @TraitSetter public void li$cil$oc$server$network$Component$$_visibility_$eq(Visibility x$1) { this.li$cil$oc$server$network$Component$$_visibility = x$1; } public Visibility visibility() { return Component$class.visibility(this); } public void setVisibility(Visibility value) { Component$class.setVisibility(this, value); } public boolean canBeSeenFrom(Node other) { return Component$class.canBeSeenFrom(this, other); } public Set<String> methods() { return Component$class.methods(this); } public Callback annotation(String method) { return Component$class.annotation(this, method); } public Object[] invoke(String method, Context context, Seq arguments) { return Component$class.invoke(this, method, context, arguments); } public void load(NBTTagCompound nbt) { Component$class.load(this, nbt); } public void save(NBTTagCompound nbt) { Component$class.save(this, nbt); } public String toString() { return Component$class.toString(this); } public final String address() { return this.address; } public final void address_$eq(String x$1) { this.address = x$1; } public final li.cil.oc.api.network.Network network() { return this.network; } public final void network_$eq(li.cil.oc.api.network.Network x$1) { this.network = x$1; } public boolean canBeReachedFrom(Node other) { return Node$class.canBeReachedFrom(this, other); } public boolean isNeighborOf(Node other) { return Node$class.isNeighborOf(this, other); } public Iterable<Node> reachableNodes() { return Node$class.reachableNodes(this); } public Iterable<Node> neighbors() { return Node$class.neighbors(this); } public void connect(Node node) { Node$class.connect(this, node); } public void disconnect(Node node) { Node$class.disconnect(this, node); } public void remove() { Node$class.remove(this); } public void onConnect(Node node) { Node$class.onConnect(this, node); } public void onDisconnect(Node node) { Node$class.onDisconnect(this, node); } public Network$ComponentBuilder$$anon$2(Network.ComponentBuilder $outer) { Node$class.$init$(this); Component$class.$init$(this); NodeVarargPart$class.$init$(this); this.host = $outer._host(); this.reachability = $outer._reachability(); this.name = $outer._name(); setVisibility($outer._visibility()); } public Environment host() { return this.host; } public Visibility reachability() { return this.reachability; } public String name() { return this.name; } } }
/*     */   public static class ConnectorBuilder implements Builder.ConnectorBuilder { private final Environment _host; private final Visibility _reachability; private final double _bufferSize;
/* 649 */     public Environment _host() { return this._host; } public Visibility _reachability() { return this._reachability; } public double _bufferSize() { return this._bufferSize; } public ConnectorBuilder(Environment _host, Visibility _reachability, double _bufferSize) {} public Network.ComponentConnectorBuilder withComponent(String name, Visibility visibility) {
/* 650 */       return new Network.ComponentConnectorBuilder(_host(), _reachability(), name, visibility, _bufferSize());
/*     */     } public Network.ComponentConnectorBuilder withComponent(String name) {
/* 652 */       return withComponent(name, _reachability());
/*     */     }
/* 654 */     public Connector create() { return Network$.MODULE$.isServer().apply$mcZ$sp() ? new Network$ConnectorBuilder$$anon$3(this) : 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 659 */         null; } public final class Network$ConnectorBuilder$$anon$3 implements Connector, NodeVarargPart {
/*     */       private final Environment host; private final Visibility reachability; private double localBufferSize; private double localBuffer; private Option<Distributor> distributor; private String address; private li.cil.oc.api.network.Network network; public void sendToAddress(String target, String name, Seq data) { NodeVarargPart$class.sendToAddress(this, target, name, data); } public void sendToNeighbors(String name, Seq data) { NodeVarargPart$class.sendToNeighbors(this, name, data); } public void sendToReachable(String name, Seq data) { NodeVarargPart$class.sendToReachable(this, name, data); } public void sendToVisible(String name, Seq data) { NodeVarargPart$class.sendToVisible(this, name, data); } public double localBufferSize() { return this.localBufferSize; } @TraitSetter public void localBufferSize_$eq(double x$1) { this.localBufferSize = x$1; } public double localBuffer() { return this.localBuffer; } @TraitSetter public void localBuffer_$eq(double x$1) { this.localBuffer = x$1; } public Option<Distributor> distributor() { return this.distributor; } @TraitSetter public void distributor_$eq(Option<Distributor> x$1) { this.distributor = x$1; } public double globalBuffer() { return Connector$class.globalBuffer(this); } public double globalBufferSize() { return Connector$class.globalBufferSize(this); } public double changeBuffer(double delta) { return Connector$class.changeBuffer(this, delta); } public boolean tryChangeBuffer(double delta) { return Connector$class.tryChangeBuffer(this, delta); } public void setLocalBufferSize(double size) { Connector$class.setLocalBufferSize(this, size); } public void onDisconnect(Node node) { Connector$class.onDisconnect(this, node); } public void load(NBTTagCompound nbt) { Connector$class.load(this, nbt); } public void save(NBTTagCompound nbt) { Connector$class.save(this, nbt); } public final String address() { return this.address; } public final void address_$eq(String x$1) { this.address = x$1; } public final li.cil.oc.api.network.Network network() { return this.network; } public final void network_$eq(li.cil.oc.api.network.Network x$1) { this.network = x$1; } public boolean canBeReachedFrom(Node other) { return Node$class.canBeReachedFrom(this, other); } public boolean isNeighborOf(Node other) { return Node$class.isNeighborOf(this, other); } public Iterable<Node> reachableNodes() { return Node$class.reachableNodes(this); } public Iterable<Node> neighbors() { return Node$class.neighbors(this); } public void connect(Node node) { Node$class.connect(this, node); } public void disconnect(Node node) { Node$class.disconnect(this, node); } public void remove() { Node$class.remove(this); } public void onConnect(Node node) { Node$class.onConnect(this, node); } public String toString() { return Node$class.toString(this); } public Network$ConnectorBuilder$$anon$3(Network.ConnectorBuilder $outer) { Node$class.$init$(this); Connector$class.$init$(this); NodeVarargPart$class.$init$(this); this.host = $outer._host(); this.reachability = $outer._reachability(); localBufferSize_$eq($outer._bufferSize()); } public Environment host() { return this.host; } public Visibility reachability() { return this.reachability; } } }
/*     */   public static class ComponentConnectorBuilder implements Builder.ComponentConnectorBuilder { private final Environment _host; private final Visibility _reachability; private final String _name; private final Visibility _visibility; private final double _bufferSize;
/* 662 */     public Environment _host() { return this._host; } public Visibility _reachability() { return this._reachability; } public String _name() { return this._name; } public Visibility _visibility() { return this._visibility; } public double _bufferSize() { return this._bufferSize; } public ComponentConnectorBuilder(Environment _host, Visibility _reachability, String _name, Visibility _visibility, double _bufferSize) {}
/* 663 */     public ComponentConnector create() { return Network$.MODULE$.isServer().apply$mcZ$sp() ? new Network$ComponentConnectorBuilder$$anon$1(this) : 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 670 */         null; }
/*     */     public final class Network$ComponentConnectorBuilder$$anon$1 implements ComponentConnector, NodeVarargPart {
/*     */       private final Environment host; private final Visibility reachability; private final String name; private double localBufferSize; private double localBuffer; private Option<Distributor> distributor; private final Map<String, Callbacks.Callback> li$cil$oc$server$network$Component$$callbacks; private final Map<String, Option<Environment>> li$cil$oc$server$network$Component$$hosts; private Visibility li$cil$oc$server$network$Component$$_visibility; private String address; private li.cil.oc.api.network.Network network; private volatile byte bitmap$0; public void sendToAddress(String target, String name, Seq data) { NodeVarargPart$class.sendToAddress(this, target, name, data); } public void sendToNeighbors(String name, Seq data) { NodeVarargPart$class.sendToNeighbors(this, name, data); } public void sendToReachable(String name, Seq data) { NodeVarargPart$class.sendToReachable(this, name, data); } public void sendToVisible(String name, Seq data) { NodeVarargPart$class.sendToVisible(this, name, data); } public double localBufferSize() { return this.localBufferSize; } @TraitSetter public void localBufferSize_$eq(double x$1) { this.localBufferSize = x$1; } public double localBuffer() { return this.localBuffer; } @TraitSetter public void localBuffer_$eq(double x$1) { this.localBuffer = x$1; } public Option<Distributor> distributor() { return this.distributor; } @TraitSetter public void distributor_$eq(Option<Distributor> x$1) { this.distributor = x$1; } public double globalBuffer() { return Connector$class.globalBuffer(this); } public double globalBufferSize() { return Connector$class.globalBufferSize(this); } public double changeBuffer(double delta) { return Connector$class.changeBuffer(this, delta); } public boolean tryChangeBuffer(double delta) { return Connector$class.tryChangeBuffer(this, delta); } public void setLocalBufferSize(double size) { Connector$class.setLocalBufferSize(this, size); } public void onDisconnect(Node node) { Connector$class.onDisconnect(this, node); } public void load(NBTTagCompound nbt) { Connector$class.load(this, nbt); } public void save(NBTTagCompound nbt) { Connector$class.save(this, nbt); } private Map li$cil$oc$server$network$Component$$callbacks$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.li$cil$oc$server$network$Component$$callbacks = Component$class.li$cil$oc$server$network$Component$$callbacks(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.li$cil$oc$server$network$Component$$callbacks; }  } public Map<String, Callbacks.Callback> li$cil$oc$server$network$Component$$callbacks() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? li$cil$oc$server$network$Component$$callbacks$lzycompute() : this.li$cil$oc$server$network$Component$$callbacks; } private Map li$cil$oc$server$network$Component$$hosts$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$server$network$Component$$hosts = Component$class.li$cil$oc$server$network$Component$$hosts(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$server$network$Component$$hosts; }  } public Map<String, Option<Environment>> li$cil$oc$server$network$Component$$hosts() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$server$network$Component$$hosts$lzycompute() : this.li$cil$oc$server$network$Component$$hosts; } public Visibility li$cil$oc$server$network$Component$$_visibility() { return this.li$cil$oc$server$network$Component$$_visibility; } @TraitSetter public void li$cil$oc$server$network$Component$$_visibility_$eq(Visibility x$1) { this.li$cil$oc$server$network$Component$$_visibility = x$1; } public Visibility visibility() { return Component$class.visibility(this); } public void setVisibility(Visibility value) { Component$class.setVisibility(this, value); } public boolean canBeSeenFrom(Node other) { return Component$class.canBeSeenFrom(this, other); } public Set<String> methods() { return Component$class.methods(this); } public Callback annotation(String method) { return Component$class.annotation(this, method); } public Object[] invoke(String method, Context context, Seq arguments) { return Component$class.invoke(this, method, context, arguments); } public String toString() { return Component$class.toString(this); } public final String address() { return this.address; } public final void address_$eq(String x$1) { this.address = x$1; } public final li.cil.oc.api.network.Network network() { return this.network; } public final void network_$eq(li.cil.oc.api.network.Network x$1) { this.network = x$1; } public boolean canBeReachedFrom(Node other) { return Node$class.canBeReachedFrom(this, other); } public boolean isNeighborOf(Node other) { return Node$class.isNeighborOf(this, other); } public Iterable<Node> reachableNodes() { return Node$class.reachableNodes(this); } public Iterable<Node> neighbors() { return Node$class.neighbors(this); } public void connect(Node node) { Node$class.connect(this, node); } public void disconnect(Node node) { Node$class.disconnect(this, node); } public void remove() { Node$class.remove(this); } public void onConnect(Node node) { Node$class.onConnect(this, node); } public Network$ComponentConnectorBuilder$$anon$1(Network.ComponentConnectorBuilder $outer) { Node$class.$init$(this); Component$class.$init$(this); Connector$class.$init$(this); NodeVarargPart$class.$init$(this); this.host = $outer._host(); this.reachability = $outer._reachability(); this.name = $outer._name(); localBufferSize_$eq($outer._bufferSize()); setVisibility($outer._visibility()); } public Environment host() { return this.host; } public Visibility reachability() { return this.reachability; } public String name() { return this.name; }
/*     */     } }
/*     */    public static class Vertex {
/* 675 */     public Node data() { return this.data; }
/* 676 */      private final Node data; private final ArrayBuffer<Network.Edge> edges = (ArrayBuffer<Network.Edge>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty(); public ArrayBuffer<Network.Edge> edges() { return this.edges; }
/*     */ 
/*     */     
/* 679 */     public Seq<Map<String, Vertex>> remove() { edges().foreach((Function1)new Network$Vertex$$anonfun$remove$2(this));
/* 680 */       return Network$.MODULE$.li$cil$oc$server$network$Network$$searchGraphs((Seq<Vertex>)edges().map((Function1)new Network$Vertex$$anonfun$remove$3(this), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())); } public final class Network$Vertex$$anonfun$remove$2 extends AbstractFunction1<Network.Edge, ArrayBuffer<Network.Edge>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer<Network.Edge> apply(Network.Edge edge) { return (ArrayBuffer<Network.Edge>)edge.other(this.$outer).edges().$minus$eq(edge); } public Network$Vertex$$anonfun$remove$2(Network.Vertex $outer) {} } public final class Network$Vertex$$anonfun$remove$3 extends AbstractFunction1<Network.Edge, Vertex> implements Serializable { public static final long serialVersionUID = 0L; public final Network.Vertex apply(Network.Edge x$33) { return x$33.other(this.$outer); }
/*     */        public Network$Vertex$$anonfun$remove$3(Network.Vertex $outer) {} }
/*     */     public String toString() {
/* 683 */       (new String[3])[0] = ""; (new String[3])[1] = " ["; (new String[3])[2] = "]"; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { data(), BoxesRunTime.boxToInteger(edges().length()) }));
/*     */     } public Vertex(Node data) {} }
/*     */   public static class Edge implements Product, Serializable { private final Network.Vertex left; private final Network.Vertex right;
/* 686 */     public Network.Vertex left() { return this.left; } public Network.Vertex right() { return this.right; } public Edge copy(Network.Vertex left, Network.Vertex right) { return new Edge(left, right); } public Network.Vertex copy$default$1() { return left(); } public Network.Vertex copy$default$2() { return right(); } public String productPrefix() { return "Edge"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return left(); } public Iterator<Object> productIterator() { return scala.runtime.ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof Edge; } public int hashCode() { return scala.runtime.ScalaRunTime$.MODULE$._hashCode(this); } public String toString() { return scala.runtime.ScalaRunTime$.MODULE$._toString(this); } public boolean equals(Object x$1) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: if_acmpeq -> 112
/*     */       //   5: aload_1
/*     */       //   6: astore_2
/*     */       //   7: aload_2
/*     */       //   8: instanceof li/cil/oc/server/network/Network$Edge
/*     */       //   11: ifeq -> 19
/*     */       //   14: iconst_1
/*     */       //   15: istore_3
/*     */       //   16: goto -> 21
/*     */       //   19: iconst_0
/*     */       //   20: istore_3
/*     */       //   21: iload_3
/*     */       //   22: ifeq -> 116
/*     */       //   25: aload_1
/*     */       //   26: checkcast li/cil/oc/server/network/Network$Edge
/*     */       //   29: astore #4
/*     */       //   31: aload_0
/*     */       //   32: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   35: aload #4
/*     */       //   37: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   40: astore #5
/*     */       //   42: dup
/*     */       //   43: ifnonnull -> 55
/*     */       //   46: pop
/*     */       //   47: aload #5
/*     */       //   49: ifnull -> 63
/*     */       //   52: goto -> 108
/*     */       //   55: aload #5
/*     */       //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   60: ifeq -> 108
/*     */       //   63: aload_0
/*     */       //   64: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   67: aload #4
/*     */       //   69: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   72: astore #6
/*     */       //   74: dup
/*     */       //   75: ifnonnull -> 87
/*     */       //   78: pop
/*     */       //   79: aload #6
/*     */       //   81: ifnull -> 95
/*     */       //   84: goto -> 108
/*     */       //   87: aload #6
/*     */       //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   92: ifeq -> 108
/*     */       //   95: aload #4
/*     */       //   97: aload_0
/*     */       //   98: invokevirtual canEqual : (Ljava/lang/Object;)Z
/*     */       //   101: ifeq -> 108
/*     */       //   104: iconst_1
/*     */       //   105: goto -> 109
/*     */       //   108: iconst_0
/*     */       //   109: ifeq -> 116
/*     */       //   112: iconst_1
/*     */       //   113: goto -> 117
/*     */       //   116: iconst_0
/*     */       //   117: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #686	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	118	0	this	Lli/cil/oc/server/network/Network$Edge;
/* 686 */       //   0	118	1	x$1	Ljava/lang/Object; } public Edge(Network.Vertex left, Network.Vertex right) { Product.class.$init$(this);
/* 687 */       left.edges().$plus$eq(this);
/* 688 */       right.edges().$plus$eq(this); }
/*     */     
/* 690 */     public Network.Vertex other(Network.Vertex side) { Network.Vertex vertex = left(); if (side == null) { if (vertex != null); } else if (side.equals(vertex))
/*     */       {  }
/*     */        } public boolean isBetween(Network.Vertex a, Network.Vertex b) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   5: astore_3
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_3
/*     */       //   12: ifnull -> 25
/*     */       //   15: goto -> 53
/*     */       //   18: aload_3
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifeq -> 53
/*     */       //   25: aload_2
/*     */       //   26: aload_0
/*     */       //   27: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   30: astore #4
/*     */       //   32: dup
/*     */       //   33: ifnonnull -> 45
/*     */       //   36: pop
/*     */       //   37: aload #4
/*     */       //   39: ifnull -> 109
/*     */       //   42: goto -> 53
/*     */       //   45: aload #4
/*     */       //   47: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   50: ifne -> 109
/*     */       //   53: aload_2
/*     */       //   54: aload_0
/*     */       //   55: invokevirtual left : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   58: astore #5
/*     */       //   60: dup
/*     */       //   61: ifnonnull -> 73
/*     */       //   64: pop
/*     */       //   65: aload #5
/*     */       //   67: ifnull -> 81
/*     */       //   70: goto -> 113
/*     */       //   73: aload #5
/*     */       //   75: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   78: ifeq -> 113
/*     */       //   81: aload_1
/*     */       //   82: aload_0
/*     */       //   83: invokevirtual right : ()Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   86: astore #6
/*     */       //   88: dup
/*     */       //   89: ifnonnull -> 101
/*     */       //   92: pop
/*     */       //   93: aload #6
/*     */       //   95: ifnull -> 109
/*     */       //   98: goto -> 113
/*     */       //   101: aload #6
/*     */       //   103: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   106: ifeq -> 113
/*     */       //   109: iconst_1
/*     */       //   110: goto -> 114
/*     */       //   113: iconst_0
/*     */       //   114: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #692	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	115	0	this	Lli/cil/oc/server/network/Network$Edge;
/*     */       //   0	115	1	a	Lli/cil/oc/server/network/Network$Vertex;
/*     */       //   0	115	2	b	Lli/cil/oc/server/network/Network$Vertex;
/*     */     } public Seq<Map<String, Network.Vertex>> remove() {
/* 695 */       left().edges().$minus$eq(this);
/* 696 */       right().edges().$minus$eq(this);
/* 697 */       (new Network.Vertex[2])[0] = left(); (new Network.Vertex[2])[1] = right(); return Network$.MODULE$.li$cil$oc$server$network$Network$$searchGraphs((Seq<Network.Vertex>)scala.collection.immutable.List$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Network.Vertex[2])));
/*     */     } }
/*     */   public static class Edge$ extends AbstractFunction2<Vertex, Vertex, Edge> implements Serializable { public static final Edge$ MODULE$;
/*     */     public final String toString() {
/*     */       return "Edge";
/*     */     }
/*     */     public Network.Edge apply(Network.Vertex left, Network.Vertex right) {
/*     */       return new Network.Edge(left, right);
/*     */     }
/*     */     public Option<Tuple2<Network.Vertex, Network.Vertex>> unapply(Network.Edge x$0) {
/*     */       return (x$0 == null) ? (Option<Tuple2<Network.Vertex, Network.Vertex>>)scala.None$.MODULE$ : (Option<Tuple2<Network.Vertex, Network.Vertex>>)new Some(new Tuple2(x$0.left(), x$0.right()));
/*     */     }
/*     */     private Object readResolve() {
/*     */       return MODULE$;
/*     */     }
/*     */     
/*     */     public Edge$() {
/*     */       MODULE$ = this;
/*     */     } }
/*     */   
/*     */   public static class Message implements li.cil.oc.api.network.Message { private final Node source;
/*     */     private final String name;
/*     */     private final Object[] data;
/*     */     
/* 721 */     public Node source() { return this.source; } public String name() { return this.name; } public Object[] data() { return this.data; } private boolean isCanceled = false;
/* 722 */     public boolean isCanceled() { return this.isCanceled; } public void isCanceled_$eq(boolean x$1) { this.isCanceled = x$1; }
/*     */      public void cancel() {
/* 724 */       isCanceled_$eq(true);
/*     */     }
/*     */     public Message(Node source, String name, Object[] data) {} }
/*     */   public static class Packet implements li.cil.oc.api.network.Packet { private String source; private String destination; private int port; private Object[] data; private int ttl;
/*     */     
/* 729 */     public String source() { return this.source; } public void source_$eq(String x$1) { this.source = x$1; } public String destination() { return this.destination; } public void destination_$eq(String x$1) { this.destination = x$1; } public int port() { return this.port; } public void port_$eq(int x$1) { this.port = x$1; } public Object[] data() { return this.data; } public void data_$eq(Object[] x$1) { this.data = x$1; } public int ttl() { return this.ttl; } public void ttl_$eq(int x$1) { this.ttl = x$1; }
/* 730 */      private final int size = BoxesRunTime.unboxToInt(scala.Option$.MODULE$.apply(data()).fold((Function0)new Network$Packet$$anonfun$2(this), (Function1)new Network$Packet$$anonfun$18(this))); public int size() { return this.size; } public final class Network$Packet$$anonfun$2 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public Network$Packet$$anonfun$2(Network.Packet $outer) {} } public final class Network$Packet$$anonfun$18 extends AbstractFunction1<Object[], Object> implements Serializable { public static final long serialVersionUID = 0L; public Network$Packet$$anonfun$18(Network.Packet $outer) {}
/* 731 */       public final int apply(Object[] values) { if (values.length > li.cil.oc.Settings$.MODULE$.get().maxNetworkPacketParts()) {
/* 732 */           throw new IllegalArgumentException("packet has too many parts");
/*     */         }
/* 734 */         return values.length * 2 + BoxesRunTime.unboxToInt(scala.Predef$.MODULE$.refArrayOps(values).foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new Network$Packet$$anonfun$18$$anonfun$apply$11(this))); } public final class Network$Packet$$anonfun$18$$anonfun$apply$11 extends AbstractFunction2<Object, Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public Network$Packet$$anonfun$18$$anonfun$apply$11(Network$Packet$$anonfun$18 $outer) {} public final int apply(int acc, Object arg) { boolean bool; int i;
/* 735 */           Object object = arg;
/* 736 */           if (object == null) { bool = true; } else if (scala.Unit$.MODULE$.equals(object)) { bool = true; } else if (scala.None$.MODULE$.equals(object)) { bool = true; } else { bool = false; }  if (bool) { i = 1; }
/* 737 */           else if (object instanceof Boolean) { i = 1; }
/* 738 */           else if (object instanceof Byte) { i = 2; }
/* 739 */           else if (object instanceof Short) { i = 2; }
/* 740 */           else if (object instanceof Integer) { i = 4; }
/* 741 */           else if (object instanceof Long) { i = 8; }
/* 742 */           else if (object instanceof Float) { i = 4; }
/* 743 */           else if (object instanceof Double) { i = 8; }
/* 744 */           else if (object instanceof String) { String str = (String)object; i = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(str.length()), 1); }
/* 745 */           else { if (object instanceof byte[]) { byte[] arrayOfByte = (byte[])object; i = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(arrayOfByte.length), 1); return acc + i; }
/* 746 */              throw new IllegalArgumentException("unsupported data type"); }
/*     */           
/*     */           return acc + i; }
/*     */          } }
/*     */     public Packet hop() {
/* 751 */       return new Packet(source(), destination(), port(), data(), ttl() - 1);
/*     */     }
/*     */     
/* 754 */     public void save(NBTTagCompound nbt) { nbt.func_74778_a("source", source());
/* 755 */       if (destination() != null && !destination().isEmpty()) {
/* 756 */         nbt.func_74778_a("dest", destination());
/*     */       }
/* 758 */       nbt.func_74768_a("port", port());
/* 759 */       nbt.func_74768_a("ttl", ttl());
/* 760 */       nbt.func_74768_a("dataLength", (data()).length);
/* 761 */       scala.Predef$.MODULE$.refArrayOps(data()).indices().foreach$mVc$sp((Function1)new Network$Packet$$anonfun$save$1(this, nbt)); } public final class Network$Packet$$anonfun$save$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(int i) { apply$mcVI$sp(i); } public void apply$mcVI$sp(int i) { boolean bool; Object object = this.$outer.data()[i];
/* 762 */         if (object == null) { bool = true; } else if (scala.Unit$.MODULE$.equals(object)) { bool = true; } else if (scala.None$.MODULE$.equals(object)) { bool = true; } else { bool = false; }  if (bool) { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 763 */         else if (object instanceof Boolean) { Boolean bool1 = (Boolean)object; this.nbt$2.func_74757_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Boolean2boolean(bool1)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 764 */         else if (object instanceof Byte) { Byte byte_ = (Byte)object; this.nbt$2.func_74777_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), byte_.shortValue()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 765 */         else if (object instanceof Short) { Short short_ = (Short)object; this.nbt$2.func_74777_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Short2short(short_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 766 */         else if (object instanceof Integer) { Integer integer = (Integer)object; this.nbt$2.func_74768_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Integer2int(integer)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 767 */         else if (object instanceof Long) { Long long_ = (Long)object; this.nbt$2.func_74772_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Long2long(long_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 768 */         else if (object instanceof Float) { Float float_ = (Float)object; this.nbt$2.func_74776_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Float2float(float_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 769 */         else if (object instanceof Double) { Double double_ = (Double)object; this.nbt$2.func_74780_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Double2double(double_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 770 */         else if (object instanceof String) { String str = (String)object; this.nbt$2.func_74778_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), str); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 771 */         else if (object instanceof byte[]) { byte[] arrayOfByte = (byte[])object; this.nbt$2.func_74773_a((new StringBuilder()).append("data").append(BoxesRunTime.boxToInteger(i)).toString(), arrayOfByte); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 772 */         else { li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringBuilder()).append("Unexpected type while saving network packet: ").append(object.getClass().getName()).toString()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */          }
/*     */       
/*     */       public Network$Packet$$anonfun$save$1(Network.Packet $outer, NBTTagCompound nbt$2) {} }
/* 776 */     public String toString() { (new String[5])[0] = "{source = "; (new String[5])[1] = ", destination = "; (new String[5])[2] = ", port = "; (new String[5])[3] = ", data = ["; (new String[5])[4] = "}]}"; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[5]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { source(), destination(), BoxesRunTime.boxToInteger(port()), scala.Predef$.MODULE$.refArrayOps(data()).mkString(", ") })); } public Packet(String source, String destination, int port, Object[] data, int ttl) {} }
/*     */    public static class Packet$ { public static final Packet$ MODULE$; public int $lessinit$greater$default$5() { return 5; } public Packet$() {
/*     */       MODULE$ = this;
/*     */     } } public static class Wrapper implements li.cil.oc.api.network.Network, Distributor { private final Network network;
/*     */     public Network network() {
/* 781 */       return this.network;
/*     */     } public Wrapper(Network network) {} public boolean connect(Node nodeA, Node nodeB) {
/* 783 */       return network().connect((Node)nodeA, (Node)nodeB);
/*     */     }
/*     */     public boolean disconnect(Node nodeA, Node nodeB) {
/* 786 */       return network().disconnect((Node)nodeA, (Node)nodeB);
/*     */     } public boolean remove(Node node) {
/* 788 */       return network().remove((Node)node);
/*     */     } public Node node(String address) {
/* 790 */       return network().node(address);
/*     */     } public Iterable<Node> nodes() {
/* 792 */       return (Iterable<Node>)scala.collection.JavaConverters$.MODULE$.asJavaIterableConverter(network().nodes()).asJava();
/*     */     } public Iterable<Node> nodes(Node reference) {
/* 794 */       return (Iterable<Node>)scala.collection.JavaConverters$.MODULE$.asJavaIterableConverter(network().reachableNodes(reference)).asJava();
/*     */     } public Iterable<Node> neighbors(Node node) {
/* 796 */       return (Iterable<Node>)scala.collection.JavaConverters$.MODULE$.asJavaIterableConverter(network().neighbors(node)).asJava();
/*     */     }
/*     */     public void sendToAddress(Node source, String target, String name, Seq<Object> data) {
/* 799 */       network().sendToAddress(source, target, name, data);
/*     */     }
/*     */     public void sendToNeighbors(Node source, String name, Seq<Object> data) {
/* 802 */       network().sendToNeighbors(source, name, data);
/*     */     }
/*     */     public void sendToReachable(Node source, String name, Seq<Object> data) {
/* 805 */       network().sendToReachable(source, name, data);
/*     */     }
/*     */     public void sendToVisible(Node source, String name, Seq<Object> data) {
/* 808 */       network().sendToVisible(source, name, data);
/*     */     } public double globalBuffer() {
/* 810 */       return network().globalBuffer();
/*     */     } public void globalBuffer_$eq(double value) {
/* 812 */       network().globalBuffer_$eq(value);
/*     */     } public double globalBufferSize() {
/* 814 */       return network().globalBufferSize();
/*     */     } public void globalBufferSize_$eq(double value) {
/* 816 */       network().globalBufferSize_$eq(value);
/*     */     } public void addConnector(Connector connector) {
/* 818 */       network().addConnector(connector);
/*     */     } public void removeConnector(Connector connector) {
/* 820 */       network().removeConnector(connector);
/*     */     } public double changeBuffer(double delta) {
/* 822 */       return network().changeBuffer(delta);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Network.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */