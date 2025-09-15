/*     */ package li.cil.oc.common.component;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.component.traits.TextBufferProxy;
/*     */ import li.cil.oc.common.tileentity.Screen;
/*     */ import li.cil.oc.server.PacketSender$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001!Ug\001B\001\003\0015\021!\002V3yi\n+hMZ3s\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\003\001\035Yar\004\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"!\001\004ue\006LGo]\005\0037a\021q\002V3yi\n+hMZ3s!J|\0070\037\t\003/uI!A\b\r\003%YKG-Z8SC6\024\026m\035;fe&TXM\035\t\003A\rj\021!\t\006\003EI\ta\001\032:jm\026\024\030B\001\023\"\005)!UM^5dK&sgm\034\005\tM\001\021)\031!C\001O\005!\001n\\:u+\005A\003CA\025-\033\005Q#BA\026\023\003\035qW\r^<pe.L!!\f\026\003\037\025sg/\033:p]6,g\016\036%pgRD\001b\f\001\003\002\003\006I\001K\001\006Q>\034H\017\t\005\006c\001!\tAM\001\007y%t\027\016\036 \025\005M*\004C\001\033\001\033\005\021\001\"\002\0241\001\004A\003bB\034\001\005\004%\t\005O\001\005]>$W-F\001:!\tI#(\003\002<U\t\0212i\\7q_:,g\016^\"p]:,7\r^8s\021\031i\004\001)A\005s\005)an\0343fA!9q\b\001a\001\n\023\001\025!D7bqJ+7o\0347vi&|g.F\001B!\021\021UiR$\016\003\rS\021\001R\001\006g\016\fG.Y\005\003\r\016\023a\001V;qY\026\024\004C\001\"I\023\tI5IA\002J]RDqa\023\001A\002\023%A*A\tnCb\024Vm]8mkRLwN\\0%KF$\"!\024)\021\005\ts\025BA(D\005\021)f.\033;\t\017ES\025\021!a\001\003\006\031\001\020J\031\t\rM\003\001\025)\003B\0039i\027\r\037*fg>dW\017^5p]\002Bq!\026\001A\002\023%a+\001\005nCb$U\r\035;i+\0059\006C\001-c\035\tIvL\004\002[;:\0211\fX\007\002\r%\0211CB\005\003=J\t\001\"\0338uKJt\027\r\\\005\003A\006\f!\002V3yi\n+hMZ3s\025\tq&#\003\002dI\nQ1i\0347pe\022+\007\017\0365\013\005\001\f\007b\0024\001\001\004%IaZ\001\r[\006DH)\0329uQ~#S-\035\013\003\033\"Dq!U3\002\002\003\007q\013\003\004k\001\001\006KaV\001\n[\006DH)\0329uQ\002Bq\001\034\001A\002\023%Q.A\006bgB,7\r\036*bi&|W#\0018\021\t\t+un\034\t\003\005BL!!]\"\003\r\021{WO\0317f\021\035\031\b\0011A\005\nQ\fq\"Y:qK\016$(+\031;j_~#S-\035\013\003\033VDq!\025:\002\002\003\007a\016\003\004x\001\001\006KA\\\001\rCN\004Xm\031;SCRLw\016\t\005\bs\002\001\r\021\"\003{\003]\001xn^3s\007>t7/^7qi&|g\016U3s)&\0347.F\001p\021\035a\b\0011A\005\nu\f1\004]8xKJ\034uN\\:v[B$\030n\0348QKJ$\026nY6`I\025\fHCA'\021\035\t60!AA\002=Dq!!\001\001A\003&q.\001\rq_^,'oQ8ogVl\007\017^5p]B+'\017V5dW\002B\021\"!\002\001\001\004%I!a\002\002\033A\024XmY5tS>tWj\0343f+\t\tI\001E\002C\003\027I1!!\004D\005\035\021un\0347fC:D\021\"!\005\001\001\004%I!a\005\002#A\024XmY5tS>tWj\0343f?\022*\027\017F\002N\003+A\021\"UA\b\003\003\005\r!!\003\t\021\005e\001\001)Q\005\003\023\ta\002\035:fG&\034\030n\0348N_\022,\007\005C\005\002\036\001\001\r\021\"\003\002\b\005Y\021n\035*f]\022,'/\0338h\021%\t\t\003\001a\001\n\023\t\031#A\bjgJ+g\016Z3sS:<w\fJ3r)\ri\025Q\005\005\n#\006}\021\021!a\001\003\023A\001\"!\013\001A\003&\021\021B\001\rSN\024VM\0343fe&tw\r\t\005\n\003[\001\001\031!C\005\003\017\tA\"[:ESN\004H.Y=j]\036D\021\"!\r\001\001\004%I!a\r\002!%\034H)[:qY\006L\030N\\4`I\025\fHcA'\0026!I\021+a\f\002\002\003\007\021\021\002\005\t\003s\001\001\025)\003\002\n\005i\021n\035#jgBd\027-_5oO\002B\021\"!\020\001\001\004%I!a\002\002\021!\f7\017U8xKJD\021\"!\021\001\001\004%I!a\021\002\031!\f7\017U8xKJ|F%Z9\025\0075\013)\005C\005R\003\t\t\0211\001\002\n!A\021\021\n\001!B\023\tI!A\005iCN\004vn^3sA!A\021Q\n\001A\002\023%!0A\bsK2\fG/\033<f\031&$\030I]3b\021%\t\t\006\001a\001\n\023\t\031&A\nsK2\fG/\033<f\031&$\030I]3b?\022*\027\017F\002N\003+B\001\"UA(\003\003\005\ra\034\005\b\0033\002\001\025)\003p\003A\021X\r\\1uSZ,G*\033;Be\026\f\007\005C\005\002^\001\001\r\021\"\003\002`\005\001r\f]3oI&twmQ8n[\006tGm]\013\003\003C\002RAQA2\003OJ1!!\032D\005\031y\005\017^5p]B!\021\021NA6\033\005!\021bAA7\t\ti\001+Y2lKR\024U/\0337eKJD\021\"!\035\001\001\004%I!a\035\002)}\003XM\0343j]\036\034u.\\7b]\022\034x\fJ3r)\ri\025Q\017\005\n#\006=\024\021!a\001\003CB\001\"!\037\001A\003&\021\021M\001\022?B,g\016Z5oO\016{W.\\1oIN\004\003\"CA?\001\t\007I\021BA@\0031\031\030P\\2J]R,'O^1m+\0059\005bBAB\001\001\006IaR\001\016gft7-\0238uKJ4\030\r\034\021\t\023\005\035\005\0011A\005\n\005}\024\001D:z]\016\034un\0347e_^t\007\"CAF\001\001\007I\021BAG\003A\031\030P\\2D_>dGm\\<o?\022*\027\017F\002N\003\037C\001\"UAE\003\003\005\ra\022\005\b\003'\003\001\025)\003H\0035\031\030P\\2D_>dGm\\<oA!9\021q\023\001\005\n\005e\025a\0049f]\022LgnZ\"p[6\fg\016Z:\026\005\005\035\004\002CAO\001\001\007I\021\001>\002\031\031,H\016\\=MSR\034un\035;\t\023\005\005\006\0011A\005\002\005\r\026\001\0054vY2LH*\033;D_N$x\fJ3r)\ri\025Q\025\005\t#\006}\025\021!a\001_\"9\021\021\026\001!B\023y\027!\0044vY2LH*\033;D_N$\b\005C\004\002.\002!\t!a,\002'\r|W\016];uK\032+H\016\\=MSR\034un\035;\025\003=D\021\"a-\001\005\004%\t!!.\002\013A\024x\016_=\026\005\005]\006\003BA]\005+r1\001NA^\017\031\001'\001#\001\002>B\031A'a0\007\r\005\021\001\022AAa'\021\ty,a1\021\007\t\013)-C\002\002H\016\023a!\0218z%\0264\007bB\031\002@\022\005\0211\032\013\003\003{C!\"a4\002@\002\007I\021AAi\0035\031G.[3oi\n+hMZ3sgV\021\0211\033\t\006\003+\fynM\007\003\003/TA!!7\002\\\0069Q.\036;bE2,'bAAo\007\006Q1m\0347mK\016$\030n\0348\n\t\005\005\030q\033\002\013\031&\034HOQ;gM\026\024\bBCAs\003\003\r\021\"\001\002h\006\t2\r\\5f]R\024UO\0324feN|F%Z9\025\0075\013I\017C\005R\003G\f\t\0211\001\002T\"I\021Q^A`A\003&\0211[\001\017G2LWM\034;Ck\0324WM]:!\021!\t\t0a0\005\002\005M\030!D8o\007\",hn[+oY>\fG\rF\002N\003kD\001\"a>\002p\002\007\021\021`\001\002KB!\0211 B\n\035\021\tiPa\004\016\005\005}(\002\002B\001\005\007\tQa^8sY\022TAA!\002\003\b\005)QM^3oi*!!\021\002B\006\0039i\027N\\3de\0064GOZ8sO\026T!A!\004\002\0079,G/\003\003\003\022\005}\030AC\"ik:\\WI^3oi&!!Q\003B\f\005\031)f\016\\8bI*!!\021CA\000Q\021\tyOa\007\021\t\tu!\021G\007\003\005?QAA!\t\003$\005aQM^3oi\"\fg\016\0327fe*\031QA!\n\013\t\t\035\"\021F\001\004M6d'\002\002B\026\005[\tA!\\8eg*\021!qF\001\004GB<\030\002\002B\032\005?\021abU;cg\016\024\030NY3Fm\026tG\017\003\005\0038\005}F\021\001B\035\0035ygnV8sY\022,f\016\\8bIR\031QJa\017\t\021\005](Q\007a\001\005{\001BAa\020\003F9!\021Q B!\023\021\021\031%a@\002\025]{'\017\0343Fm\026tG/\003\003\003\026\t\035#\002\002B\"\003DCA!\016\003\034!A!QJA`\t\003\021y%\001\013sK\036L7\017^3s\0072LWM\034;Ck\0324WM\035\013\004\033\nE\003b\002B*\005\027\002\raM\001\002i\032A!qKA`\003\003\021IFA\003Qe>D\030p\005\003\003V\005\r\007bB\031\003V\021\005!Q\f\013\003\005?\002BA!\031\003V5\021\021q\030\005\t\005K\022)F\"\001\003h\005)qn\0368feV\t1\007\003\006\003l\tU\003\031!C\001\003\017\tQ\001Z5sifD!Ba\034\003V\001\007I\021\001B9\003%!\027N\035;z?\022*\027\017F\002N\005gB\021\"\025B7\003\003\005\r!!\003\t\023\t]$Q\013Q!\n\005%\021A\0023jeRL\b\005\003\006\003|\tU\003\031!C\001\005{\n1B\\8eK\006#GM]3tgV\021!q\020\t\005\005\003\023Y)\004\002\003\004*!!Q\021BD\003\021a\027M\\4\013\005\t%\025\001\0026bm\006LAA!$\003\004\n11\013\036:j]\036D!B!%\003V\001\007I\021\001BJ\003=qw\016Z3BI\022\024Xm]:`I\025\fHcA'\003\026\"I\021Ka$\002\002\003\007!q\020\005\n\0053\023)\006)Q\005\005\nAB\\8eK\006#GM]3tg\002B\001B!(\003V\021\005!qT\001\n[\006\0248\016R5sif$\022!\024\005\t\005G\023)\006\"\001\003&\0061!/\0328eKJ$\"!!\003\t\021\t%&Q\013D\001\005?\0131c\0348Ck\0324WM]\"pY>\0248\t[1oO\026D\001B!,\003V\021\005!qV\001\r_:\024UO\0324fe\016{\007/\037\013\016\033\nE&Q\027B]\005{\023\tM!2\t\017\tM&1\026a\001\017\006\0311m\0347\t\017\t]&1\026a\001\017\006\031!o\\<\t\017\tm&1\026a\001\017\006\tq\017C\004\003@\n-\006\031A$\002\003!DqAa1\003,\002\007q)\001\002uq\"9!q\031BV\001\0049\025A\001;z\021!\021YM!\026\007\002\t5\027aE8o\005V4g-\032:EKB$\bn\0215b]\036,GcA'\003P\"9!\021\033Be\001\0049\026!\0023faRD\007\002\003Bk\005+\"\tAa6\002\031=t')\0364gKJ4\025\016\0347\025\0275\023INa7\003^\n}'\021\035\005\b\005g\023\031\0161\001H\021\035\0219La5A\002\035CqAa/\003T\002\007q\tC\004\003@\nM\007\031A$\t\017\t\r(1\033a\001\017\006\t1\r\003\005\003h\nUc\021\001Bu\003UygNQ;gM\026\024\b+\0317fiR,7\t[1oO\026$2!\024Bv\021\035\021iO!:A\002\035\013Q!\0338eKbD\001B!=\003V\021\005!1_\001\031_:\024UO\0324feJ+7o\0347vi&|gn\0215b]\036,G#B'\003v\n]\bb\002B^\005_\004\ra\022\005\b\005\023y\0171\001H\021!\021YP!\026\005\002\tu\030\001I8o\005V4g-\032:WS\026<\bo\034:u%\026\034x\016\\;uS>t7\t[1oO\026$R!\024B\000\007\003AqAa/\003z\002\007q\tC\004\003@\ne\b\031A$\t\021\r\025!Q\013C\001\007\017\t1d\0348Ck\0324WM]'bqJ+7o\0347vi&|gn\0215b]\036,G#B'\004\n\r-\001b\002B^\007\007\001\ra\022\005\b\005\033\031\0011\001H\021!\031yA!\026\005\002\rE\021aC8o\005V4g-\032:TKR$\022\"TB\n\007+\0319ba\n\t\017\tM6Q\002a\001\017\"9!qWB\007\001\0049\005\002CB\r\007\033\001\raa\007\002\003M\004Ba!\b\004$9\031!ia\b\n\007\r\0052)\001\004Qe\026$WMZ\005\005\005\033\033)CC\002\004\"\rC\001b!\013\004\016\001\007\021\021B\001\tm\026\024H/[2bY\"A1Q\006B+\t\003\031y#\001\bp]\n+hMZ3s\005&$(\t\034;\025\0375\033\tda\r\0046\r]2\021HB\"\007\017BqAa-\004,\001\007q\tC\004\0038\016-\002\031A$\t\017\tm61\006a\001\017\"9!qXB\026\001\0049\005\002CB\036\007W\001\ra!\020\002\007I\fW\016E\0025\007I1a!\021\003\00559\005/\036+fqR\024UO\0324fe\"91QIB\026\001\0049\025a\0024s_6\034u\016\034\005\b\007\023\032Y\0031\001H\003\0351'o\\7S_^D\001b!\024\003V\021\0051qJ\001\020_:\024UO\0324feJ\013W.\0238jiR\031Qj!\025\t\021\rm21\na\001\007{A\001b!\026\003V\021\0051qK\001\023_:\024UO\0324feJ\013W\016R3tiJ|\027\020F\002N\0073B\001ba\017\004T\001\0071Q\b\005\t\007;\022)\006\"\001\004`\005\021rN\034\"vM\032,'OU1x'\026$H+\032=u)\035i5\021MB2\007KBqAa-\004\\\001\007q\tC\004\0038\016m\003\031A$\t\021\r\03541\fa\001\007S\nA\001^3yiB)!ia\033\004p%\0311QN\"\003\013\005\023(/Y=\021\t\t\033Yg\022\005\t\007g\022)\006\"\001\004v\005ArN\034\"vM\032,'OU1x'\026$()Y2lOJ|WO\0343\025\0175\0339h!\037\004|!9!1WB9\001\0049\005b\002B\\\007c\002\ra\022\005\t\007{\032\t\b1\001\004j\005)1m\0347pe\"A1\021\021B+\t\003\031\031)\001\rp]\n+hMZ3s%\006<8+\032;G_J,wM]8v]\022$r!TBC\007\017\033I\tC\004\0034\016}\004\031A$\t\017\t]6q\020a\001\017\"A1QPB@\001\004\031I\007\003\005\004\016\nUc\021ABH\003\035YW-\037#po:$r!TBI\0077\033y\n\003\005\004\024\016-\005\031ABK\003%\031\007.\031:bGR,'\017E\002C\007/K1a!'D\005\021\031\005.\031:\t\017\ru51\022a\001\017\006!1m\0343f\021!\031\tka#A\002\r\r\026A\0029mCf,'\017\005\003\004&\016EVBABT\025\021\031\tk!+\013\t\r-6QV\001\007K:$\030\016^=\013\t\r=&1B\001\n[&tWm\031:bMRLAaa-\004(\naQI\034;jif\004F.Y=fe\"A1q\027B+\r\003\031I,A\003lKf,\006\017F\004N\007w\033ila0\t\021\rM5Q\027a\001\007+Cqa!(\0046\002\007q\t\003\005\004\"\016U\006\031ABR\021!\031\031M!\026\007\002\r\025\027!C2mSB\024w.\031:e)\025i5qYBf\021!\031Im!1A\002\rm\021!\002<bYV,\007\002CBQ\007\003\004\raa)\t\021\r='Q\013D\001\007#\f\021\"\\8vg\026$un\0368\025\0235\033\031na6\004\\\016}\007bBBk\007\033\004\ra\\\001\002q\"91\021\\Bg\001\004y\027!A=\t\017\ru7Q\032a\001\017\0061!-\036;u_:D\001b!)\004N\002\00711\025\005\t\007G\024)F\"\001\004f\006IQn\\;tK\022\023\030m\032\013\n\033\016\0358\021^Bv\007[Dqa!6\004b\002\007q\016C\004\004Z\016\005\b\031A8\t\017\ru7\021\035a\001\017\"A1\021UBq\001\004\031\031\013\003\005\004r\nUc\021ABz\003\035iw.^:f+B$\022\"TB{\007o\034Ipa?\t\017\rU7q\036a\001_\"91\021\\Bx\001\004y\007bBBo\007_\004\ra\022\005\t\007C\033y\0171\001\004$\"A1q B+\r\003!\t!A\006n_V\034XmU2s_2dG#C'\005\004\021\025Aq\001C\006\021\035\031)n!@A\002=Dqa!7\004~\002\007q\016C\004\005\n\ru\b\031A$\002\013\021,G\016^1\t\021\r\0056Q a\001\007GC\001\002b\004\003V\031\005A\021C\001\017G>\004\030\020V8B]\006d\027P_3s)\025iE1\003C\f\021\035!)\002\"\004A\002\035\013A\001\\5oK\"A1\021\025C\007\001\004\031\031KB\004\005\034\005}\006\001\"\b\003\027\rc\027.\0328u!J|\0070_\n\005\t3\021y\006C\006\003f\021e!Q1A\005\002\t\035\004B\003C\022\t3\021\t\021)A\005g\0051qn\0368fe\002Bq!\rC\r\t\003!9\003\006\003\005*\021-\002\003\002B1\t3AqA!\032\005&\001\0071\007\003\006\0050\021e!\031!C\001\tc\t\001B]3oI\026\024XM]\013\003\tg\021b\001\"\016\002D\022uba\002C\034\ts\001A1\007\002\ryI,g-\0338f[\026tGO\020\005\n\tw!I\002)A\005\tg\t\021B]3oI\026\024XM\035\021\021\t\021}B1J\007\003\t\003RA\001b\021\005F\005!am\0348u\025\021!y\003b\022\013\007\021%c!\001\004dY&,g\016^\005\005\t\033\"\tE\001\013UKb$()\0364gKJ\024VM\0343fe\022\013G/\031\005\t\005G#I\002\"\021\003&\"A!\021\026C\r\t\003\022y\n\003\005\003.\022eA\021\tC+)5iEq\013C-\t7\"i\006b\030\005b!9!1\027C*\001\0049\005b\002B\\\t'\002\ra\022\005\b\005w#\031\0061\001H\021\035\021y\fb\025A\002\035CqAa1\005T\001\007q\tC\004\003H\022M\003\031A$\t\021\t-G\021\004C!\tK\"2!\024C4\021\035\021\t\016b\031A\002]C\001B!6\005\032\021\005C1\016\013\f\033\0225Dq\016C9\tg\")\bC\004\0034\022%\004\031A$\t\017\t]F\021\016a\001\017\"9!1\030C5\001\0049\005b\002B`\tS\002\ra\022\005\b\005G$I\0071\001H\021!\0219\017\"\007\005B\021eDcA'\005|!9!Q\036C<\001\0049\005\002\003By\t3!\t\005b \025\0135#\t\tb!\t\017\tmFQ\020a\001\017\"9!q\030C?\001\0049\005\002\003B~\t3!\t\005b\"\025\0135#I\tb#\t\017\tmFQ\021a\001\017\"9!q\030CC\001\0049\005\002CB\b\t3!\t\005b$\025\0235#\t\nb%\005\026\022]\005b\002BZ\t\033\003\ra\022\005\b\005o#i\t1\001H\021!\031I\002\"$A\002\rm\001\002CB\025\t\033\003\r!!\003\t\021\r5B\021\004C!\t7#r\"\024CO\t?#\t\013b)\005&\022\035F\021\026\005\b\005g#I\n1\001H\021\035\0219\f\"'A\002\035CqAa/\005\032\002\007q\tC\004\003@\022e\005\031A$\t\021\rmB\021\024a\001\007{Aqa!\022\005\032\002\007q\tC\004\004J\021e\005\031A$\t\021\r5C\021\004C!\t[#2!\024CX\021!\031Y\004b+A\002\ru\002\002CB+\t3!\t\005b-\025\0075#)\f\003\005\004<\021E\006\031AB\037\021!\031i\t\"\007\005B\021eFcB'\005<\022uFq\030\005\t\007'#9\f1\001\004\026\"91Q\024C\\\001\0049\005\002CBQ\to\003\raa)\t\021\r]F\021\004C!\t\007$r!\024Cc\t\017$I\r\003\005\004\024\022\005\007\031ABK\021\035\031i\n\"1A\002\035C\001b!)\005B\002\00711\025\005\t\007\007$I\002\"\021\005NR)Q\nb4\005R\"A1\021\032Cf\001\004\031Y\002\003\005\004\"\022-\007\031ABR\021!\031y\r\"\007\005B\021UG#C'\005X\022eG1\034Co\021\035\031)\016b5A\002=Dqa!7\005T\002\007q\016C\004\004^\022M\007\031A$\t\021\r\005F1\033a\001\007GC\001ba9\005\032\021\005C\021\035\013\n\033\022\rHQ\035Ct\tSDqa!6\005`\002\007q\016C\004\004Z\022}\007\031A8\t\017\ruGq\034a\001\017\"A1\021\025Cp\001\004\031\031\013\003\005\004r\022eA\021\tCw)%iEq\036Cy\tg$)\020C\004\004V\022-\b\031A8\t\017\reG1\036a\001_\"91Q\034Cv\001\0049\005\002CBQ\tW\004\raa)\t\021\r}H\021\004C!\ts$\022\"\024C~\t{$y0\"\001\t\017\rUGq\037a\001_\"91\021\034C|\001\004y\007b\002C\005\to\004\ra\022\005\t\007C#9\0201\001\004$\"AAq\002C\r\t\003*)\001F\003N\013\017)I\001C\004\005\026\025\r\001\031A$\t\021\r\005V1\001a\001\007GC1\"\"\004\005\032!\025\r\021\"\003\006\020\005AA)\0322vO\036,'/\006\002\006\022A!Q1CC\r\033\t))BC\002\006\030I\ta\001Z3uC&d\027\002BC\016\013+\021\001\"\023;f[&sgm\034\005\f\013?!I\002#A!B\023)\t\"A\005EK\n,xmZ3sA!AQ1\005C\r\t\023))#A\003eK\n,x\rF\002N\013OA\001\"\"\013\006\"\001\00711D\001\b[\026\0348/Y4f\r\035)i#a0\001\013_\0211bU3sm\026\024\bK]8ysN!Q1\006B0\021-\021)'b\013\003\006\004%\tAa\032\t\025\021\rR1\006B\001B\003%1\007C\0042\013W!\t!b\016\025\t\025eR1\b\t\005\005C*Y\003C\004\003f\025U\002\031A\032\t\021\t%V1\006C!\005?C\001B!,\006,\021\005S\021\t\013\016\033\026\rSQIC$\013\023*Y%\"\024\t\017\tMVq\ba\001\017\"9!qWC \001\0049\005b\002B^\013\001\ra\022\005\b\005+y\0041\001H\021\035\021\031-b\020A\002\035CqAa2\006@\001\007q\t\003\005\003L\026-B\021IC))\riU1\013\005\b\005#,y\0051\001X\021!\021).b\013\005B\025]CcC'\006Z\025mSQLC0\013CBqAa-\006V\001\007q\tC\004\0038\026U\003\031A$\t\017\tmVQ\013a\001\017\"9!qXC+\001\0049\005b\002Br\013+\002\ra\022\005\t\005O,Y\003\"\021\006fQ\031Q*b\032\t\017\t5X1\ra\001\017\"A!\021_C\026\t\003*Y\007F\003N\013[*y\007C\004\003<\026%\004\031A$\t\017\t}V\021\016a\001\017\"A!1`C\026\t\003*\031\bF\003N\013k*9\bC\004\003<\026E\004\031A$\t\017\t}V\021\017a\001\017\"A1QAC\026\t\003*Y\bF\003N\013{*y\bC\004\003<\026e\004\031A$\t\017\t}V\021\020a\001\017\"A1qBC\026\t\003*\031\tF\005N\013\013+9)\"#\006\f\"9!1WCA\001\0049\005b\002B\\\013\003\003\ra\022\005\t\0073)\t\t1\001\004\034!A1\021FCA\001\004\tI\001\003\005\004.\025-B\021ICH)=iU\021SCJ\013++9*\"'\006\034\026u\005b\002BZ\013\033\003\ra\022\005\b\005o+i\t1\001H\021\035\021Y,\"$A\002\035CqAa0\006\016\002\007q\t\003\005\004<\0255\005\031AB\037\021\035\031)%\"$A\002\035Cqa!\023\006\016\002\007q\t\003\005\004N\025-B\021ICQ)\riU1\025\005\t\007w)y\n1\001\004>!A1QKC\026\t\003*9\013F\002N\013SC\001ba\017\006&\002\0071Q\b\005\t\007;*Y\003\"\021\006.R9Q*b,\0062\026M\006b\002BZ\013W\003\ra\022\005\b\005o+Y\0131\001H\021!\0319'b+A\002\r%\004\002CB:\013W!\t%b.\025\0175+I,b/\006>\"9!1WC[\001\0049\005b\002B\\\013k\003\ra\022\005\t\007{*)\f1\001\004j!A1\021QC\026\t\003*\t\rF\004N\013\007,)-b2\t\017\tMVq\030a\001\017\"9!qWC`\001\0049\005\002CB?\013\003\ra!\033\t\021\r5U1\006C!\013\027$r!TCg\013\037,\t\016\003\005\004\024\026%\007\031ABK\021\035\031i*\"3A\002\035C\001b!)\006J\002\00711\025\005\t\007o+Y\003\"\021\006VR9Q*b6\006Z\026m\007\002CBJ\013'\004\ra!&\t\017\ruU1\033a\001\017\"A1\021UCj\001\004\031\031\013\003\005\004D\026-B\021ICp)\025iU\021]Cr\021!\031I-\"8A\002\rm\001\002CBQ\013;\004\raa)\t\021\r=W1\006C!\013O$\022\"TCu\013W,i/b<\t\017\rUWQ\035a\001_\"91\021\\Cs\001\004y\007bBBo\013K\004\ra\022\005\t\007C+)\0171\001\004$\"A11]C\026\t\003*\031\020F\005N\013k,90\"?\006|\"91Q[Cy\001\004y\007bBBm\013c\004\ra\034\005\b\007;,\t\0201\001H\021!\031\t+\"=A\002\r\r\006\002CBy\013W!\t%b@\025\02353\tAb\001\007\006\031\035\001bBBk\013{\004\ra\034\005\b\0073,i\0201\001p\021\035\031i.\"@A\002\035C\001b!)\006~\002\00711\025\005\t\007,Y\003\"\021\007\fQIQJ\"\004\007\020\031Ea1\003\005\b\007+4I\0011\001p\021\035\031IN\"\003A\002=Dq\001\"\003\007\n\001\007q\t\003\005\004\"\032%\001\031ABR\021!!y!b\013\005B\031]A#B'\007\032\031m\001b\002C\013\r+\001\ra\022\005\t\007C3)\0021\001\004$\"AaqDC\026\t\0231\t#\001\btK:$Wj\\;tK\0263XM\034;\025\02753\031C\"\n\007*\031-bQ\006\005\t\007C3i\0021\001\004$\"Aaq\005D\017\001\004\031Y\"\001\003oC6,\007bBBk\r;\001\ra\034\005\b\00734i\0021\001p\021\0351yC\"\bA\002\035\013A\001Z1uC\"Aa1GC\026\t\0231)$A\btK:$Gk\\&fs\n|\027M\0353t)\025ieq\007D\035\021!19C\"\rA\002\rm\001\002\003D\036\rc\001\rA\"\020\002\rY\fG.^3t!\025\021eqHAb\023\r1\te\021\002\013yI,\007/Z1uK\022t\004\002\003D#\001\001\006I!a.\002\rA\024x\016_=!\021%1y\003\001b\001\n\0031I%\006\002\007LA!aQ\nD*\033\t1yEC\002\007R\031\tA!\036;jY&\031\021Ab\024\t\021\031]\003\001)A\005\r\027\nQ\001Z1uC\002B\001Bb\027\001\001\004%\t\001Q\001\tm&,w\017]8si\"Iaq\f\001A\002\023\005a\021M\001\rm&,w\017]8si~#S-\035\013\004\033\032\r\004\002C)\007^\005\005\t\031A!\t\017\031\035\004\001)Q\005\003\006Ia/[3xa>\024H\017\t\005\b\rW\002A\021\001BP\003=i\027M]6J]&$\030.\0317ju\026$\007B\003D8\001!\025\r\021\"\004\007r\005QA-\032<jG\026LeNZ8\026\005\031M\004\003\003D;\rw\022yHa \016\005\031]$\002\002D=\0037\f\021\"[7nkR\f'\r\\3\n\t\031udq\017\002\004\033\006\004\bB\003DA\001!\005\t\025)\004\007t\005YA-\032<jG\026LeNZ8!\021\0351)\t\001C!\r\017\013QbZ3u\t\0264\030nY3J]\032|GC\001DE!!1YIb$\004\034\rmQB\001DG\025\0211\tFa\"\n\t\031udQ\022\005\n\r'\003!\031!C!\003\017\t\021bY1o+B$\027\r^3\t\021\031]\005\001)A\005\003\023\t!bY1o+B$\027\r^3!\021\0351Y\n\001C!\005?\013a!\0369eCR,\007b\002DP\001\021\005a\021U\001\005SN|e\016\006\004\007$\032\025fQ\027\t\006\005\016-\0241\031\005\t\rO3i\n1\001\007*\006A1m\\7qkR,'\017\005\003\007,\032EVB\001DW\025\r1yKE\001\b[\006\034\007.\0338f\023\0211\031L\",\003\017\r{g\016^3yi\"Aaq\027DO\001\0041I,\001\003be\036\034\b\003\002DV\rwKAA\"0\007.\nI\021I]4v[\026tGo\035\025\r\r;3\tMb2\007J\032-gQ\032\t\005\rW3\031-\003\003\007F\0325&\001C\"bY2\024\027mY6\002\r\021L'/Z2u3\005\t\021a\0013pG\006\022aqZ\001BMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AI+G/\036:og\002:\b.\032;iKJ\004C\017[3!g\016\024X-\0328!SN\0043-\036:sK:$H.\037\021p]:BqAb5\001\t\0031).\001\004ukJtwJ\034\013\007\rG39N\"7\t\021\031\035f\021\033a\001\rSC\001Bb.\007R\002\007a\021\030\025\t\r#4\tMb3\007^\006\022aq\\\001hMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AQ+(O\\:!i\",\007e]2sK\026t\007e\0348/AI+G/\036:og\002:\b.\032;iKJ\004C\017[3!gR\fG/\032\021dQ\006tw-\0323-A\005tG\rI<iKRDWM\035\021ji\002J7\017\t8po\002zgN\f\005\b\rG\004A\021\001Ds\003\035!XO\0358PM\032$bAb)\007h\032%\b\002\003DT\rC\004\rA\"+\t\021\031]f\021\035a\001\rsC\003B\"9\007B\032-gQ^\021\003\r_\f\001NZ;oGRLwN\034\025*u\t|w\016\\3b]\002jS\006\t+ve:\034\be\0344gAQDW\rI:de\026,gN\f\021SKR,(O\\:!o\",G\017[3sAQDW\rI:uCR,\007e\0315b]\036,G\r\f\021b]\022\004s\017[3uQ\026\024\b%\033;!SN\004cn\\<!_:t\003b\002Dz\001\021\005aQ_\001\017O\026$\030i\0359fGR\024\026\r^5p)\0311\031Kb>\007|\"Aa\021 Dy\001\0041I+A\004d_:$X\r\037;\t\021\031]f\021\037a\001\rsCCB\"=\007B\032\035g\021\032Df\r\f#a\"\001\002\003/1WO\\2uS>t\007&\013\036ok6\024WM\035\027!]Vl'-\032:![5\002C\013[3!CN\004Xm\031;!e\006$\030n\034\021pM\002\"\b.\032\021tGJ,WM\034\030!\r>\024\b%\\;mi&l#\r\\8dW\002\0328M]3f]N\004C\017[5tA%\034\b\005\0365fA9,XNY3sA=4\007E\0317pG.\034H\006\t5pe&TxN\034;bY\002\ng\016\032\021wKJ$\030nY1m]!9qQ\001\001\005\002\035\035\021\001D4fi.+\027PY8be\022\034HC\002DR\017\0239Y\001\003\005\007z\036\r\001\031\001DU\021!19lb\001A\002\031e\006\006CD\002\r\0034Ymb\004\"\005\035E\021!\0214v]\016$\030n\0348)Si\"\030M\0317fA5j\003\005\0265fA1L7\017\036\021pM\002ZW-\0372pCJ$7\017I1ui\006\034\007.\0323!i>\004C\017[3!g\016\024X-\0328/\021\0359)\002\001C\001\017/\t\021\"[:Qe\026\034\027n]3\025\r\031\rv\021DD\016\021!19kb\005A\002\031%\006\002\003D\\\017'\001\rA\"/)\031\035Ma\021\031Dd\r\0234Ymb\b\"\005\035\005\022!\0344v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021SKR,(O\\:!o\",G\017[3sAQDW\rI:de\026,g\016I5tA%t\007\005[5hQ\002\002(/Z2jg&|g\016I7pI\026\004\003f];c[AL\0070\0327![>,8/\032\021fm\026tG\017\t9pg&$\030n\0348tS9Bqa\"\n\001\t\00399#\001\006tKR\004&/Z2jg\026$bAb)\b*\035-\002\002\003DT\017G\001\rA\"+\t\021\031]v1\005a\001\rsC\003bb\t\007B\032-wqF\021\003\017c\taNZ;oGRLwN\034\025f]\006\024G.\0323;E>|G.Z1oSi\022wn\0347fC:\004S&\f\021TKR\004s\017[3uQ\026\024\b\005^8!kN,\007\005[5hQ\002\002(/Z2jg&|g\016I7pI\026\004\003f];c[AL\0070\0327![>,8/\032\021fm\026tG\017\t9pg&$\030n\0348tS9Bqa\"\016\001\t\003:9$\001\013tKR,e.\032:hs\016{7\017\036)feRK7m\033\013\004\033\036e\002bBBe\017g\001\ra\034\005\b\017{\001A\021IAX\003Q9W\r^#oKJ<\027pQ8tiB+'\017V5dW\"9q\021\t\001\005B\035\r\023!D:fiB{w/\032:Ti\006$X\rF\002N\017\013B\001b!3\b@\001\007\021\021\002\005\b\017\023\002A\021\tBS\00359W\r\036)po\026\0248\013^1uK\"9qQ\n\001\005B\035=\023\001F:fi6\013\0070[7v[J+7o\0347vi&|g\016F\003N\017#:)\006C\004\bT\035-\003\031A$\002\013]LG\r\0365\t\017\035]s1\na\001\017\0061\001.Z5hQRDqab\027\001\t\003:i&A\bhKRl\025\r_5nk6<\026\016\032;i)\0059\005bBD1\001\021\005sQL\001\021O\026$X*\031=j[Vl\007*Z5hQRDqa\"\032\001\t\003:9'\001\btKR\f5\017]3diJ\013G/[8\025\0135;Igb\033\t\017\035Ms1\ra\001_\"9qqKD2\001\004y\007b\002Dz\001\021\005\023q\026\005\b\017c\002A\021ID:\0035\031X\r\036*fg>dW\017^5p]R1\021\021BD;\017oBqAa/\bp\001\007q\tC\004\003@\036=\004\031A$\t\017\035m\004\001\"\021\b~\005Y1/\032;WS\026<\bo\034:u)\031\tIab \b\002\"9!1XD=\001\0049\005b\002B`\017s\002\ra\022\005\b\017\013\003A\021ID/\003A9W\r\036,jK^\004xN\035;XS\022$\b\016C\004\b\n\002!\te\"\030\002#\035,GOV5foB|'\017\036%fS\036DG\017C\004\b\016\002!\teb$\002)M,G/T1yS6,XnQ8m_J$U\r\035;i)\riu\021\023\005\b\005#<Y\t1\001X\021\0359)\n\001C!\017/\013AcZ3u\033\006D\030.\\;n\007>dwN\035#faRDG#A,\t\017\035m\005\001\"\021\b\036\006i1/\032;D_2|'\017R3qi\"$B!!\003\b \"9!\021[DM\001\0049\006b\002Bt\001\021\005s1\025\013\004\033\036\025\006b\002Bw\017C\003\ra\022\005\b\005S\003A\021\tBP\021\035\021i\013\001C!\017W#R\"TDW\017_;\tlb-\b6\036]\006b\002BZ\017S\003\ra\022\005\b\005o;I\0131\001H\021\035\021Yl\"+A\002\035CqAa0\b*\002\007q\tC\004\003D\036%\006\031A$\t\017\t\035w\021\026a\001\017\"9!Q\033\001\005B\035mFcC'\b>\036}v\021YDb\017\013DqAa-\b:\002\007q\tC\004\0038\036e\006\031A$\t\017\tmv\021\030a\001\017\"9!qXD]\001\0049\005b\002Br\017s\003\ra\022\005\b\007\037\001A\021IDe)%iu1ZDg\017\037<\t\016C\004\0034\036\035\007\031A$\t\017\t]vq\031a\001\017\"A1\021DDd\001\004\031Y\002\003\005\004*\035\035\007\031AA\005\021\035\031i\003\001C!\017+$r\"TDl\0173<Yn\"8\b`\036\005x1\035\005\b\005g;\031\0161\001H\021\035\0219lb5A\002\035CqAa/\bT\002\007q\tC\004\003@\036M\007\031A$\t\021\rmr1\033a\001\007{Aqa!\022\bT\002\007q\tC\004\004J\035M\007\031A$\t\017\r5\003\001\"\021\bhR\031Qj\";\t\021\rmrQ\035a\001\007{Aqa!\026\001\t\003:i\017F\002N\017_D\001ba\017\bl\002\0071Q\b\005\b\017g\004A\021ID{\003)\021\030m^*fiR+\007\020\036\013\b\033\036]x\021`D~\021\035\021\031l\"=A\002\035CqAa.\br\002\007q\t\003\005\004h\035E\b\031AB5\021\0359y\020\001C!\021\003\t\001C]1x'\026$()Y2lOJ|WO\0343\025\0175C\031\001#\002\t\b!9!1WD\001\0049\005b\002B\\\017{\004\ra\022\005\t\007{:i\0201\001\004j!9\0012\002\001\005B!5\021\001\005:boN+GOR8sK\036\024x.\0368e)\035i\005r\002E\t\021'AqAa-\t\n\001\007q\tC\004\0038\"%\001\031A$\t\021\ru\004\022\002a\001\007SBq\001c\006\001\t\003\022)+\001\006sK:$WM\035+fqRD\003\002#\006\t\034\r%\007r\005\t\005\021;A\031#\004\002\t )!\001\022\005B\023\003)\021X\r\\1v]\016DWM]\005\005\021KAyB\001\005TS\022,wJ\0347zI\tAI#\003\003\t,!5\022AB\"M\023\026sEK\003\003\t0!}\021\001B*jI\026Dq\001c\r\001\t\003:i&A\006sK:$WM],jIRD\007\006\003E\031\0217\031I\rc\n\t\017!e\002\001\"\021\b^\005a!/\0328eKJDU-[4ii\"B\001r\007E\016\007\023D9\003C\004\t@\001!\t\005#\021\002'M,GOU3oI\026\024\030N\\4F]\006\024G.\0323\025\0075C\031\005\003\005\tF!u\002\031AA\005\003\035)g.\0312mK\022D\003\002#\020\t\034\r%\007r\005\005\b\021\027\002A\021\tBS\003II7OU3oI\026\024\030N\\4F]\006\024G.\0323)\021!%\0032DBe\021OAqa!$\001\t\003B\t\006F\004N\021'B)\006c\026\t\021\rM\005r\na\001\007+Cqa!(\tP\001\007q\t\003\005\004\"\"=\003\031ABR\021\035\0319\f\001C!\0217\"r!\024E/\021?B\t\007\003\005\004\024\"e\003\031ABK\021\035\031i\n#\027A\002\035C\001b!)\tZ\001\00711\025\005\b\007\007\004A\021\tE3)\025i\005r\rE5\021!\031I\rc\031A\002\rm\001\002CBQ\021G\002\raa)\t\017\r=\007\001\"\021\tnQIQ\nc\034\tr!M\004R\017\005\b\007+DY\0071\001p\021\035\031I\016c\033A\002=Dqa!8\tl\001\007q\t\003\005\004\"\"-\004\031ABR\021\035\031\031\017\001C!\021s\"\022\"\024E>\021{By\b#!\t\017\rU\007r\017a\001_\"91\021\034E<\001\004y\007bBBo\021o\002\ra\022\005\t\007CC9\b1\001\004$\"91\021\037\001\005B!\025E#C'\t\b\"%\0052\022EG\021\035\031)\016c!A\002=Dqa!7\t\004\002\007q\016C\004\004^\"\r\005\031A$\t\021\r\005\0062\021a\001\007GCqaa@\001\t\003B\t\nF\005N\021'C)\nc&\t\032\"91Q\033EH\001\004y\007bBBm\021\037\003\ra\034\005\b\t\023Ay\t1\001H\021!\031\t\013c$A\002\r\r\006b\002C\b\001\021\005\001R\024\013\006\033\"}\005\022\025\005\b\t+AY\n1\001H\021!\031\t\013c'A\002\r\r\006b\002ES\001\021\005\003rU\001\n_:\034uN\0348fGR$2!\024EU\021\0359\0042\025a\001\021W\0032!\013EW\023\rAyK\013\002\005\035>$W\rC\004\t4\002!\t\005#.\002\031=tG)[:d_:tWm\031;\025\0075C9\fC\0048\021c\003\r\001c+\t\017!m\006\001\"\021\t>\006!An\\1e)\ri\005r\030\005\t\021\003DI\f1\001\tD\006\031aN\031;\021\t!\025\007\022Z\007\003\021\017TA\001#1\004.&!\0012\032Ed\0059q%\t\026+bO\016{W\016]8v]\022Dq\001c4\001\t\003B\t.\001\003tCZ,GcA'\tT\"A\001\022\031Eg\001\004A\031\r")
/*     */ public class TextBuffer extends ManagedEnvironment implements TextBufferProxy, VideoRamRasterizer, DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   private final ComponentConnector node;
/*     */   private Tuple2<Object, Object> maxResolution;
/*     */   private li.cil.oc.api.internal.TextBuffer.ColorDepth maxDepth;
/*     */   private Tuple2<Object, Object> aspectRatio;
/*     */   private double powerConsumptionPerTick;
/*     */   private boolean li$cil$oc$common$component$TextBuffer$$precisionMode;
/*     */   private boolean isRendering;
/*     */   private boolean isDisplaying;
/*     */   private boolean hasPower;
/*     */   private double li$cil$oc$common$component$TextBuffer$$relativeLitArea;
/*     */   private Option<PacketBuilder> li$cil$oc$common$component$TextBuffer$$_pendingCommands;
/*     */   private final int syncInterval;
/*     */   private int syncCooldown;
/*     */   private double fullyLitCost;
/*     */   private final Proxy proxy;
/*     */   private final li.cil.oc.util.TextBuffer data;
/*     */   private Tuple2<Object, Object> viewport;
/*     */   private Map<String, String> deviceInfo;
/*     */   private final boolean canUpdate;
/*     */   private final HashMap<String, VideoRamDevice> li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  43 */   public HashMap<String, VideoRamDevice> li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers() { return this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers; } public void li$cil$oc$common$component$traits$VideoRamRasterizer$_setter_$li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers_$eq(HashMap<String, VideoRamDevice> x$1) { this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers = x$1; } public boolean addBuffer(GpuTextBuffer ram) { return VideoRamRasterizer.class.addBuffer(this, ram); } public boolean removeBuffer(String owner, int id) { return VideoRamRasterizer.class.removeBuffer(this, owner, id); } public int removeAllBuffers(String owner) { return VideoRamRasterizer.class.removeAllBuffers(this, owner); } public int removeAllBuffers() { return VideoRamRasterizer.class.removeAllBuffers(this); } public boolean loadBuffer(String owner, int id, NBTTagCompound nbt) { return VideoRamRasterizer.class.loadBuffer(this, owner, id, nbt); } public Option<GpuTextBuffer> getBuffer(String owner, int id) { return VideoRamRasterizer.class.getBuffer(this, owner, id); } public int getWidth() { return TextBufferProxy.class.getWidth(this); } public int getHeight() { return TextBufferProxy.class.getHeight(this); } public li.cil.oc.api.internal.TextBuffer.ColorDepth getColorDepth() { return TextBufferProxy.class.getColorDepth(this); } public void setPaletteColor(int index, int color) { TextBufferProxy.class.setPaletteColor(this, index, color); } public int getPaletteColor(int index) { return TextBufferProxy.class.getPaletteColor(this, index); } public void setForegroundColor(int color) { TextBufferProxy.class.setForegroundColor(this, color); } public void setForegroundColor(int color, boolean isFromPalette) { TextBufferProxy.class.setForegroundColor(this, color, isFromPalette); } public int getForegroundColor() { return TextBufferProxy.class.getForegroundColor(this); } public boolean isForegroundFromPalette() { return TextBufferProxy.class.isForegroundFromPalette(this); } public void setBackgroundColor(int color) { TextBufferProxy.class.setBackgroundColor(this, color); } public void setBackgroundColor(int color, boolean isFromPalette) { TextBufferProxy.class.setBackgroundColor(this, color, isFromPalette); } public int getBackgroundColor() { return TextBufferProxy.class.getBackgroundColor(this); } public boolean isBackgroundFromPalette() { return TextBufferProxy.class.isBackgroundFromPalette(this); } public void copy(int col, int row, int w, int h, int tx, int ty) { TextBufferProxy.class.copy(this, col, row, w, h, tx, ty); } public void fill(int col, int row, int w, int h, char c) { TextBufferProxy.class.fill(this, col, row, w, h, c); } public void fill(int col, int row, int w, int h, int c) { TextBufferProxy.class.fill(this, col, row, w, h, c); } public void set(int col, int row, String s, boolean vertical) { TextBufferProxy.class.set(this, col, row, s, vertical); } public char get(int col, int row) { return TextBufferProxy.class.get(this, col, row); } public int getCodePoint(int col, int row) { return TextBufferProxy.class.getCodePoint(this, col, row); } public int getForegroundColor(int column, int row) { return TextBufferProxy.class.getForegroundColor(this, column, row); } public boolean isForegroundFromPalette(int column, int row) { return TextBufferProxy.class.isForegroundFromPalette(this, column, row); } public int getBackgroundColor(int column, int row) { return TextBufferProxy.class.getBackgroundColor(this, column, row); } public boolean isBackgroundFromPalette(int column, int row) { return TextBufferProxy.class.isBackgroundFromPalette(this, column, row); } public void rawSetText(int col, int row, char[][] text) { TextBufferProxy.class.rawSetText(this, col, row, text); } public EnvironmentHost host() { return this.host; } public TextBuffer(EnvironmentHost host) { TextBufferProxy.class.$init$(this); VideoRamRasterizer.class.$init$(this);
/*  44 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  45 */       .withComponent("screen")
/*  46 */       .withConnector()
/*  47 */       .create();
/*     */     
/*  49 */     this.maxResolution = Settings$.MODULE$.screenResolutionsByTier()[0];
/*     */     
/*  51 */     this.maxDepth = Settings$.MODULE$.screenDepthsByTier()[0];
/*     */     
/*  53 */     this.aspectRatio = (Tuple2<Object, Object>)new Tuple2.mcDD.sp(1.0D, 1.0D);
/*     */     
/*  55 */     this.powerConsumptionPerTick = Settings$.MODULE$.get().screenCost();
/*     */     
/*  57 */     this.li$cil$oc$common$component$TextBuffer$$precisionMode = false;
/*     */ 
/*     */     
/*  60 */     this.isRendering = true;
/*     */     
/*  62 */     this.isDisplaying = true;
/*     */     
/*  64 */     this.hasPower = true;
/*     */     
/*  66 */     this.li$cil$oc$common$component$TextBuffer$$relativeLitArea = -1.0D;
/*     */     
/*  68 */     this.li$cil$oc$common$component$TextBuffer$$_pendingCommands = (Option<PacketBuilder>)None$.MODULE$;
/*     */     
/*  70 */     this.syncInterval = 100;
/*     */     
/*  72 */     this.syncCooldown = syncInterval();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     this.fullyLitCost = computeFullyLitCost();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     this.proxy = 
/*  95 */       SideTracker.isClient() ? new ClientProxy(this) : 
/*  96 */       new ServerProxy(this);
/*     */     
/*  98 */     this.data = new li.cil.oc.util.TextBuffer(maxResolution(), PackedColor$Depth$.MODULE$.format(maxDepth()));
/*     */     
/* 100 */     this.viewport = data().size();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     this.canUpdate = true; } public ComponentConnector node() { return this.node; } private Tuple2<Object, Object> maxResolution() { return this.maxResolution; } private void maxResolution_$eq(Tuple2<Object, Object> x$1) { this.maxResolution = x$1; } private li.cil.oc.api.internal.TextBuffer.ColorDepth maxDepth() { return this.maxDepth; } private void maxDepth_$eq(li.cil.oc.api.internal.TextBuffer.ColorDepth x$1) { this.maxDepth = x$1; } private Tuple2<Object, Object> aspectRatio() { return this.aspectRatio; } private void aspectRatio_$eq(Tuple2<Object, Object> x$1) { this.aspectRatio = x$1; } private double powerConsumptionPerTick() { return this.powerConsumptionPerTick; } private void powerConsumptionPerTick_$eq(double x$1) { this.powerConsumptionPerTick = x$1; } public boolean li$cil$oc$common$component$TextBuffer$$precisionMode() { return this.li$cil$oc$common$component$TextBuffer$$precisionMode; } private void li$cil$oc$common$component$TextBuffer$$precisionMode_$eq(boolean x$1) { this.li$cil$oc$common$component$TextBuffer$$precisionMode = x$1; } private boolean isRendering() { return this.isRendering; } private void isRendering_$eq(boolean x$1) { this.isRendering = x$1; } private boolean isDisplaying() { return this.isDisplaying; } private void isDisplaying_$eq(boolean x$1) { this.isDisplaying = x$1; } private boolean hasPower() { return this.hasPower; } private void hasPower_$eq(boolean x$1) { this.hasPower = x$1; } private double li$cil$oc$common$component$TextBuffer$$relativeLitArea() { return this.li$cil$oc$common$component$TextBuffer$$relativeLitArea; } public boolean canUpdate() { return this.canUpdate; }
/*     */   public void li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(double x$1) { this.li$cil$oc$common$component$TextBuffer$$relativeLitArea = x$1; }
/*     */   private Option<PacketBuilder> li$cil$oc$common$component$TextBuffer$$_pendingCommands() { return this.li$cil$oc$common$component$TextBuffer$$_pendingCommands; } public void li$cil$oc$common$component$TextBuffer$$_pendingCommands_$eq(Option<PacketBuilder> x$1) { this.li$cil$oc$common$component$TextBuffer$$_pendingCommands = x$1; } private int syncInterval() { return this.syncInterval; } private int syncCooldown() { return this.syncCooldown; } private void syncCooldown_$eq(int x$1) { this.syncCooldown = x$1; } public PacketBuilder li$cil$oc$common$component$TextBuffer$$pendingCommands() { return (PacketBuilder)li$cil$oc$common$component$TextBuffer$$_pendingCommands().getOrElse((Function0)new TextBuffer$$anonfun$li$cil$oc$common$component$TextBuffer$$pendingCommands$1(this)); } public final class TextBuffer$$anonfun$li$cil$oc$common$component$TextBuffer$$pendingCommands$1 extends AbstractFunction0<CompressedPacketBuilder> implements Serializable {
/* 123 */     public static final long serialVersionUID = 0L; public TextBuffer$$anonfun$li$cil$oc$common$component$TextBuffer$$pendingCommands$1(TextBuffer $outer) {} public final CompressedPacketBuilder apply() { CompressedPacketBuilder pb = new CompressedPacketBuilder(PacketType$.MODULE$.TextBufferMulti(), CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2()); pb.writeUTF(this.$outer.node().address()); this.$outer.li$cil$oc$common$component$TextBuffer$$_pendingCommands_$eq((Option<PacketBuilder>)new Some(pb)); return pb; } } public double fullyLitCost() { return this.fullyLitCost; } public void update() { super.update();
/* 124 */     if (isDisplaying() && host().world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 125 */       if (li$cil$oc$common$component$TextBuffer$$relativeLitArea() < false) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 130 */         int w = getViewportWidth();
/* 131 */         int h = getViewportHeight();
/* 132 */         FloatRef acc = FloatRef.create(0.0F); RichInt$.MODULE$
/* 133 */           .until$extension0(Predef$.MODULE$.intWrapper(0), h).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$update$1(this, w, acc));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 146 */         li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(acc.elem / (w * h));
/*     */       } 
/* 148 */       if (node() != null) {
/* 149 */         boolean hadPower = hasPower();
/* 150 */         double neededPower = li$cil$oc$common$component$TextBuffer$$relativeLitArea() * fullyLitCost() * Settings$.MODULE$.get().tickFrequency();
/* 151 */         hasPower_$eq(node().tryChangeBuffer(-neededPower));
/* 152 */         if (hasPower() != hadPower) {
/* 153 */           PacketSender$.MODULE$.sendTextBufferPowerChange(node().address(), (isDisplaying() && hasPower()), host());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 158 */     synchronized (this)
/* 159 */     { li$cil$oc$common$component$TextBuffer$$_pendingCommands().foreach((Function1)new TextBuffer$$anonfun$update$2(this));
/* 160 */       li$cil$oc$common$component$TextBuffer$$_pendingCommands_$eq((Option<PacketBuilder>)None$.MODULE$);
/*     */ 
/*     */       
/* 163 */       if (SideTracker.isClient() && syncCooldown() > 0)
/* 164 */       { syncCooldown_$eq(syncCooldown() - 1);
/* 165 */         if (syncCooldown() == 0)
/* 166 */         { syncCooldown_$eq(syncInterval());
/* 167 */           PacketSender$.MODULE$.sendTextBufferInit(proxy().nodeAddress()); }  }  return; }  }
/*     */   public void fullyLitCost_$eq(double x$1) { this.fullyLitCost = x$1; }
/*     */   public double computeFullyLitCost() { Tuple2 tuple2 = Settings$.MODULE$.screenResolutionsByTier()[0]; if (tuple2 != null) { int w = tuple2._1$mcI$sp(), h = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(w, h), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp(); int mw = getMaximumWidth(); int mh = getMaximumHeight(); return powerConsumptionPerTick() * (mw * mh) / (i * j); }  throw new MatchError(tuple2); }
/*     */   public Proxy proxy() { return this.proxy; }
/*     */   public li.cil.oc.util.TextBuffer data() { return this.data; }
/*     */   public Tuple2<Object, Object> viewport() { return this.viewport; } public void viewport_$eq(Tuple2<Object, Object> x$1) { this.viewport = x$1; } public void markInitialized() { syncCooldown_$eq(-1); li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D); } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "display"); (new Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Text buffer"); (new Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Text Screen V0"); (new Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(maxResolution()._1$mcI$sp() * maxResolution()._2$mcI$sp()).toString()); (new String[3])[0] = "1"; (new String[3])[1] = "4"; (new String[3])[2] = "8"; (new Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), ((String[])new String[3])[maxDepth().ordinal()]); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[6])); this.bitmap$0 = true; }  return this.deviceInfo; }  } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); } public final class TextBuffer$$anonfun$update$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int w$1; public final FloatRef acc$1; public final void apply(int y) { apply$mcVI$sp(y); } public TextBuffer$$anonfun$update$1(TextBuffer $outer, int w$1, FloatRef acc$1) {} public void apply$mcVI$sp(int y) { int[] line = this.$outer.data().buffer()[y]; short[] colors = this.$outer.data().color()[y]; RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.w$1).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$update$1$$anonfun$apply$mcVI$sp$1(this, line, colors)); } public final class TextBuffer$$anonfun$update$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$1; private final short[] colors$1; public final void apply(int x) { apply$mcVI$sp(x); } public TextBuffer$$anonfun$update$1$$anonfun$apply$mcVI$sp$1(TextBuffer$$anonfun$update$1 $outer, int[] line$1, short[] colors$1) {} public void apply$mcVI$sp(int x) { int char = this.line$1[x]; short color = this.colors$1[x]; int bg = PackedColor$.MODULE$.unpackBackground(color, this.$outer.li$cil$oc$common$component$TextBuffer$$anonfun$$$outer().data().format()); int fg = PackedColor$.MODULE$.unpackForeground(color, this.$outer.li$cil$oc$common$component$TextBuffer$$anonfun$$$outer().data().format()); this.$outer.acc$1.elem += ((char == 32) ? ((bg == 0) ? false : true) : ((char == 9608) ? ((fg == 0) ? false : true) : ((fg == 0 && bg == 0) ? false : true))); } } } public final class TextBuffer$$anonfun$update$2 extends AbstractFunction1<PacketBuilder, BoxedUnit> implements Serializable {
/* 175 */     public static final long serialVersionUID = 0L; public final void apply(PacketBuilder x$2) { x$2.sendToPlayersNearHost(this.$outer.host(), Option$.MODULE$.apply(BoxesRunTime.boxToDouble(Settings$.MODULE$.get().maxWirelessRange()[1] * Settings$.MODULE$.get().maxWirelessRange()[1]))); } public TextBuffer$$anonfun$update$2(TextBuffer $outer) {} } @Callback(direct = true, doc = "function():boolean -- Returns whether the screen is currently on.") public Object[] isOn(Context computer, Arguments args) { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isDisplaying()) })); }
/*     */   
/*     */   @Callback(doc = "function():boolean -- Turns the screen on. Returns whether the state changed, and whether it is now on.")
/*     */   public Object[] turnOn(Context computer, Arguments args) {
/* 179 */     boolean oldPowerState = isDisplaying();
/* 180 */     setPowerState(true);
/* 181 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((isDisplaying() != oldPowerState)), BoxesRunTime.boxToBoolean(isDisplaying()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():boolean -- Turns off the screen. Returns whether the state changed, and whether it is now on.")
/*     */   public Object[] turnOff(Context computer, Arguments args) {
/* 186 */     boolean oldPowerState = isDisplaying();
/* 187 */     setPowerState(false);
/* 188 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((isDisplaying() != oldPowerState)), BoxesRunTime.boxToBoolean(isDisplaying()) }));
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function():number, number -- The aspect ratio of the screen. For multi-block screens this is the number of blocks, horizontal and vertical.")
/*     */   public synchronized Object[] getAspectRatio(Context context, Arguments args) {
/* 193 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(aspectRatio()._1$mcD$sp()), BoxesRunTime.boxToDouble(aspectRatio()._2$mcD$sp()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():table -- The list of keyboards attached to the screen.")
/*     */   public Object[] getKeyboards(Context context, Arguments args) { Object[] arrayOfObject;
/* 198 */     context.pause(0.25D);
/* 199 */     EnvironmentHost environmentHost = host();
/* 200 */     if (environmentHost instanceof Screen) { Screen screen = (Screen)environmentHost;
/* 201 */       arrayOfObject = new Object[] { ((TraversableOnce)((TraversableLike)screen.screens().map((Function1)new TextBuffer$$anonfun$getKeyboards$1(this), Set$.MODULE$.canBuildFrom())).flatMap((Function1)new TextBuffer$$anonfun$getKeyboards$2(this), Set$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(String.class)) }; }
/*     */     else
/* 203 */     { arrayOfObject = new Object[] { ((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable(node().neighbors()).filter((Function1)new TextBuffer$$anonfun$getKeyboards$3(this))).map((Function1)new TextBuffer$$anonfun$getKeyboards$4(this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(String.class)) }; }  return arrayOfObject; } public final class TextBuffer$$anonfun$getKeyboards$1 extends AbstractFunction1<Screen, Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply(Screen x$3) { return x$3.node(); } public TextBuffer$$anonfun$getKeyboards$1(TextBuffer $outer) {} } public final class TextBuffer$$anonfun$getKeyboards$2 extends AbstractFunction1<Node, Iterable<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<String> apply(Node x$4) { return (Iterable<String>)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable(x$4.neighbors()).filter((Function1)new TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$1(this))).map((Function1)new TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$2(this), Iterable$.MODULE$.canBuildFrom()); } public TextBuffer$$anonfun$getKeyboards$2(TextBuffer $outer) {} public final class TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$1 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x$5) { return x$5.host() instanceof li.cil.oc.server.component.Keyboard; } public TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$1(TextBuffer$$anonfun$getKeyboards$2 $outer) {} } public final class TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$2 extends AbstractFunction1<Node, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Node x$6) { return x$6.address(); } public TextBuffer$$anonfun$getKeyboards$2$$anonfun$apply$2(TextBuffer$$anonfun$getKeyboards$2 $outer) {} } } public final class TextBuffer$$anonfun$getKeyboards$3 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x$7) { return x$7.host() instanceof li.cil.oc.server.component.Keyboard; } public TextBuffer$$anonfun$getKeyboards$3(TextBuffer $outer) {} } public final class TextBuffer$$anonfun$getKeyboards$4 extends AbstractFunction1<Node, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Node x$8) { return x$8.address(); }
/*     */     
/*     */     public TextBuffer$$anonfun$getKeyboards$4(TextBuffer $outer) {} }
/*     */   @Callback(direct = true, doc = "function():boolean -- Returns whether the screen is in high precision mode (sub-pixel mouse event positions).")
/*     */   public Object[] isPrecise(Context computer, Arguments args) {
/* 208 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(li$cil$oc$common$component$TextBuffer$$precisionMode()) }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(enabled:boolean):boolean -- Set whether to use high precision mode (sub-pixel mouse event positions).")
/*     */   public Object[] setPrecise(Context computer, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial maxDepth : ()Lli/cil/oc/api/internal/TextBuffer$ColorDepth;
/*     */     //   4: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   7: invokevirtual screenDepthsByTier : ()[Lli/cil/oc/api/internal/TextBuffer$ColorDepth;
/*     */     //   10: iconst_2
/*     */     //   11: aaload
/*     */     //   12: astore_3
/*     */     //   13: dup
/*     */     //   14: ifnonnull -> 25
/*     */     //   17: pop
/*     */     //   18: aload_3
/*     */     //   19: ifnull -> 32
/*     */     //   22: goto -> 76
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 76
/*     */     //   32: aload_0
/*     */     //   33: invokevirtual li$cil$oc$common$component$TextBuffer$$precisionMode : ()Z
/*     */     //   36: istore #4
/*     */     //   38: aload_0
/*     */     //   39: aload_2
/*     */     //   40: iconst_0
/*     */     //   41: invokeinterface checkBoolean : (I)Z
/*     */     //   46: invokespecial li$cil$oc$common$component$TextBuffer$$precisionMode_$eq : (Z)V
/*     */     //   49: getstatic li/cil/oc/common/component/package$.MODULE$ : Lli/cil/oc/common/component/package$;
/*     */     //   52: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   55: iconst_1
/*     */     //   56: anewarray java/lang/Object
/*     */     //   59: dup
/*     */     //   60: iconst_0
/*     */     //   61: iload #4
/*     */     //   63: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   66: aastore
/*     */     //   67: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   70: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   73: goto -> 104
/*     */     //   76: getstatic li/cil/oc/common/component/package$.MODULE$ : Lli/cil/oc/common/component/package$;
/*     */     //   79: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   82: iconst_2
/*     */     //   83: anewarray java/lang/Object
/*     */     //   86: dup
/*     */     //   87: iconst_0
/*     */     //   88: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   91: aastore
/*     */     //   92: dup
/*     */     //   93: iconst_1
/*     */     //   94: ldc_w 'unsupported operation'
/*     */     //   97: aastore
/*     */     //   98: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   101: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   104: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #214	-> 0
/*     */     //   #215	-> 32
/*     */     //   #216	-> 38
/*     */     //   #217	-> 49
/*     */     //   #219	-> 76
/*     */     //   #214	-> 104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	105	0	this	Lli/cil/oc/common/component/TextBuffer;
/*     */     //   0	105	1	computer	Lli/cil/oc/api/machine/Context;
/*     */     //   0	105	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   38	35	4	oldValue	Z
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnergyCostPerTick(double value) {
/* 225 */     powerConsumptionPerTick_$eq(value);
/* 226 */     fullyLitCost_$eq(computeFullyLitCost());
/*     */   }
/*     */   public double getEnergyCostPerTick() {
/* 229 */     return powerConsumptionPerTick();
/*     */   }
/*     */   public void setPowerState(boolean value) {
/* 232 */     if (isDisplaying() != value) {
/* 233 */       isDisplaying_$eq(value);
/* 234 */       if (isDisplaying()) {
/* 235 */         double neededPower = fullyLitCost() * Settings$.MODULE$.get().tickFrequency();
/* 236 */         hasPower_$eq((node().changeBuffer(-neededPower) == false));
/*     */       } 
/* 238 */       PacketSender$.MODULE$.sendTextBufferPowerChange(node().address(), (isDisplaying() && hasPower()), host());
/*     */     } 
/*     */   }
/*     */   public boolean getPowerState() {
/* 242 */     return isDisplaying();
/*     */   }
/*     */   public void setMaximumResolution(int width, int height) {
/* 245 */     if (width < 1) throw new IllegalArgumentException("width must be larger or equal to one"); 
/* 246 */     if (height < 1) throw new IllegalArgumentException("height must be larger or equal to one"); 
/* 247 */     maxResolution_$eq((Tuple2<Object, Object>)new Tuple2.mcII.sp(width, height));
/* 248 */     fullyLitCost_$eq(computeFullyLitCost());
/* 249 */     proxy().onBufferMaxResolutionChange(width, width);
/*     */   }
/*     */   public int getMaximumWidth() {
/* 252 */     return maxResolution()._1$mcI$sp();
/*     */   } public int getMaximumHeight() {
/* 254 */     return maxResolution()._2$mcI$sp();
/*     */   } public synchronized void setAspectRatio(double width, double height) {
/* 256 */     aspectRatio_$eq((Tuple2<Object, Object>)new Tuple2.mcDD.sp(width, height));
/*     */   } public double getAspectRatio() {
/* 258 */     return aspectRatio()._1$mcD$sp() / aspectRatio()._2$mcD$sp();
/*     */   }
/*     */   public boolean setResolution(int w, int h) {
/* 261 */     Tuple2<Object, Object> tuple2 = maxResolution(); if (tuple2 != null) { int mw = tuple2._1$mcI$sp(), mh = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(mw, mh), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 262 */       if (w < 1 || h < 1 || w > i || h > i || h * w > i * j) {
/* 263 */         throw new IllegalArgumentException("unsupported resolution");
/*     */       }
/* 265 */       proxy().onBufferResolutionChange(w, h);
/*     */ 
/*     */       
/* 268 */       boolean sizeChanged = data().size_$eq((Tuple2)new Tuple2.mcII.sp(w, h));
/* 269 */       boolean viewportChanged = setViewport(w, h);
/*     */       
/* 271 */       if (!viewportChanged && node() != null) {
/* 272 */         node().sendToReachable("computer.signal", new Object[] { "screen_resized", BoxesRunTime.boxToInteger(w), BoxesRunTime.boxToInteger(h) });
/*     */       }
/*     */       return (sizeChanged || viewportChanged); }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   }
/*     */   
/*     */   public boolean setViewport(int w, int h) {
/* 280 */     Tuple2 tuple2 = data().size(); if (tuple2 != null) { int mw = tuple2._1$mcI$sp(), mh = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(mw, mh), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 281 */       if (w < 1 || h < 1 || w > i || h > j) {
/* 282 */         throw new IllegalArgumentException("unsupported viewport resolution");
/*     */       }
/* 284 */       proxy().onBufferViewportResolutionChange(w, h);
/* 285 */       Tuple2<Object, Object> tuple21 = viewport(); if (tuple21 != null) { int cw = tuple21._1$mcI$sp(), ch = tuple21._2$mcI$sp(); Tuple2.mcII.sp sp4 = new Tuple2.mcII.sp(cw, ch), sp3 = sp4; int k = sp3._1$mcI$sp(), m = sp3._2$mcI$sp();
/*     */         
/* 287 */         viewport_$eq((Tuple2<Object, Object>)new Tuple2.mcII.sp(w, h));
/* 288 */         if (node() != null)
/* 289 */           node().sendToReachable("computer.signal", new Object[] { "screen_resized", BoxesRunTime.boxToInteger(w), BoxesRunTime.boxToInteger(h) }); 
/*     */         return (w != k || h != m); }
/*     */       
/*     */       throw new MatchError(tuple21); }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   } public int getViewportWidth() {
/* 296 */     return viewport()._1$mcI$sp();
/*     */   } public int getViewportHeight() {
/* 298 */     return viewport()._2$mcI$sp();
/*     */   } public void setMaximumColorDepth(li.cil.oc.api.internal.TextBuffer.ColorDepth depth) {
/* 300 */     maxDepth_$eq(depth);
/*     */   } public li.cil.oc.api.internal.TextBuffer.ColorDepth getMaximumColorDepth() {
/* 302 */     return maxDepth();
/*     */   }
/*     */   public boolean setColorDepth(li.cil.oc.api.internal.TextBuffer.ColorDepth depth) {
/* 305 */     boolean colorDepthChanged = TextBufferProxy.class.setColorDepth(this, depth);
/*     */     
/* 307 */     proxy().onBufferDepthChange(depth);
/* 308 */     return colorDepthChanged;
/*     */   }
/*     */   
/*     */   public void onBufferPaletteChange(int index) {
/* 312 */     proxy().onBufferPaletteChange(index);
/*     */   }
/*     */   public void onBufferColorChange() {
/* 315 */     proxy().onBufferColorChange();
/*     */   }
/*     */   public void onBufferCopy(int col, int row, int w, int h, int tx, int ty) {
/* 318 */     proxy().onBufferCopy(col, row, w, h, tx, ty);
/*     */   }
/*     */   
/*     */   public void onBufferFill(int col, int row, int w, int h, int c) {
/* 322 */     proxy().onBufferFill(col, row, w, h, c);
/*     */   }
/*     */   
/*     */   public void onBufferSet(int col, int row, String s, boolean vertical) {
/* 326 */     proxy().onBufferSet(col, row, s, vertical);
/*     */   }
/*     */   
/*     */   public void onBufferBitBlt(int col, int row, int w, int h, GpuTextBuffer ram, int fromCol, int fromRow) {
/* 330 */     proxy().onBufferBitBlt(col, row, w, h, ram, fromCol, fromRow);
/*     */   }
/*     */   
/*     */   public void onBufferRamInit(GpuTextBuffer ram) {
/* 334 */     proxy().onBufferRamInit(ram);
/*     */   }
/*     */   
/*     */   public void onBufferRamDestroy(GpuTextBuffer ram) {
/* 338 */     proxy().onBufferRamDestroy(ram);
/*     */   }
/*     */   
/*     */   public void rawSetText(int col, int row, int[][] text) {
/* 342 */     TextBufferProxy.class.rawSetText(this, col, row, text);
/* 343 */     proxy().onBufferRawSetText(col, row, text);
/*     */   }
/*     */   
/*     */   public void rawSetBackground(int col, int row, int[][] color) {
/* 347 */     TextBufferProxy.class.rawSetBackground(this, col, row, color);
/*     */ 
/*     */     
/* 350 */     proxy().onBufferRawSetBackground(col, row, color);
/*     */   }
/*     */   
/*     */   public void rawSetForeground(int col, int row, int[][] color) {
/* 354 */     TextBufferProxy.class.rawSetForeground(this, col, row, color);
/*     */ 
/*     */     
/* 357 */     proxy().onBufferRawSetForeground(col, row, color);
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean renderText() {
/* 361 */     return (li$cil$oc$common$component$TextBuffer$$relativeLitArea() != false && proxy().render());
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public int renderWidth() {
/* 364 */     return TextBufferRenderCache$.MODULE$.renderer().charRenderWidth() * getViewportWidth();
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public int renderHeight() {
/* 367 */     return TextBufferRenderCache$.MODULE$.renderer().charRenderHeight() * getViewportHeight();
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public void setRenderingEnabled(boolean enabled) {
/* 370 */     isRendering_$eq(enabled);
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public boolean isRenderingEnabled() {
/* 373 */     return isRendering();
/*     */   }
/*     */   public void keyDown(char character, int code, EntityPlayer player) {
/* 376 */     proxy().keyDown(character, code, player);
/*     */   }
/*     */   public void keyUp(char character, int code, EntityPlayer player) {
/* 379 */     proxy().keyUp(character, code, player);
/*     */   }
/*     */   public void clipboard(String value, EntityPlayer player) {
/* 382 */     proxy().clipboard(value, player);
/*     */   }
/*     */   public void mouseDown(double x, double y, int button, EntityPlayer player) {
/* 385 */     proxy().mouseDown(x, y, button, player);
/*     */   }
/*     */   public void mouseDrag(double x, double y, int button, EntityPlayer player) {
/* 388 */     proxy().mouseDrag(x, y, button, player);
/*     */   }
/*     */   public void mouseUp(double x, double y, int button, EntityPlayer player) {
/* 391 */     proxy().mouseUp(x, y, button, player);
/*     */   }
/*     */   public void mouseScroll(double x, double y, int delta, EntityPlayer player) {
/* 394 */     proxy().mouseScroll(x, y, delta, player);
/*     */   }
/*     */   public void copyToAnalyzer(int line, EntityPlayer player) {
/* 397 */     proxy().copyToAnalyzer(line, player);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 403 */     super.onConnect(node);
/* 404 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 405 */       { ComponentTracker$.MODULE$.add(host().world(), node.address(), (ManagedEnvironment)this); return; }  return; }  ComponentTracker$.MODULE$.add(host().world(), node.address(), (ManagedEnvironment)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 410 */     super.onDisconnect(node);
/* 411 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 412 */       { ComponentTracker$.MODULE$.remove(host().world(), (ManagedEnvironment)this); return; }  return; }  ComponentTracker$.MODULE$.remove(host().world(), (ManagedEnvironment)this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 419 */     super.load(nbt);
/* 420 */     if (SideTracker.isClient()) {
/* 421 */       if (Strings.isNullOrEmpty(proxy().nodeAddress()))
/* 422 */       { proxy().nodeAddress_$eq(nbt.func_74775_l("node").func_74779_i("address"));
/* 423 */         TextBuffer$.MODULE$.registerClientBuffer(this); }
/*     */       else { return; }
/*     */     
/* 426 */     } else if (nbt.func_74764_b("buffer")) {
/* 427 */       data().load(nbt.func_74775_l("buffer"));
/*     */     }
/* 429 */     else if (!Strings.isNullOrEmpty(node().address())) {
/* 430 */       data().load(SaveHandler$.MODULE$.loadNBT(nbt, (new StringBuilder()).append(node().address()).append("_buffer").toString()));
/*     */     } 
/*     */ 
/*     */     
/* 434 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isOn").toString())) {
/* 435 */       isDisplaying_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isOn").toString()));
/*     */     }
/* 437 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("hasPower").toString())) {
/* 438 */       hasPower_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("hasPower").toString()));
/*     */     }
/* 440 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxWidth").toString()) && nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxHeight").toString())) {
/* 441 */       int maxWidth = nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxWidth").toString());
/* 442 */       int maxHeight = nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxHeight").toString());
/* 443 */       maxResolution_$eq((Tuple2<Object, Object>)new Tuple2.mcII.sp(maxWidth, maxHeight));
/*     */     } 
/* 445 */     li$cil$oc$common$component$TextBuffer$$precisionMode_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("precise").toString()));
/*     */     
/* 447 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("viewportWidth").toString())) {
/* 448 */       int vpw = nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("viewportWidth").toString());
/* 449 */       int vph = nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("viewportHeight").toString());
/* 450 */       viewport_$eq((Tuple2<Object, Object>)new Tuple2.mcII.sp(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(vpw), data().width())), 1), RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(vph), data().height())), 1)));
/*     */     } else {
/* 452 */       viewport_$eq(data().size());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 457 */     if (node() != null) {
/* 458 */       super.save(nbt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 468 */       if (node().network() != null) {
/* 469 */         WrapAsScala$.MODULE$.iterableAsScalaIterable(node().network().nodes()).foreach((Function1)new TextBuffer$$anonfun$save$1(this));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 476 */       SaveHandler$.MODULE$.scheduleSave(host(), nbt, (new StringBuilder()).append(node().address()).append("_buffer").toString(), (Function1)new TextBuffer$$anonfun$save$2(this));
/* 477 */       nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isOn").toString(), isDisplaying());
/* 478 */       nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("hasPower").toString(), hasPower());
/* 479 */       nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxWidth").toString(), maxResolution()._1$mcI$sp());
/* 480 */       nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxHeight").toString(), maxResolution()._2$mcI$sp());
/* 481 */       nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("precise").toString(), li$cil$oc$common$component$TextBuffer$$precisionMode());
/* 482 */       nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("viewportWidth").toString(), viewport()._1$mcI$sp());
/* 483 */       nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("viewportHeight").toString(), viewport()._2$mcI$sp());
/*     */     } 
/*     */   }
/*     */   public static void registerClientBuffer(TextBuffer paramTextBuffer) {
/*     */     TextBuffer$.MODULE$.registerClientBuffer(paramTextBuffer);
/*     */   }
/*     */   @SubscribeEvent
/*     */   public static void onWorldUnload(WorldEvent.Unload paramUnload) {
/*     */     TextBuffer$.MODULE$.onWorldUnload(paramUnload);
/*     */   }
/*     */   @SubscribeEvent
/*     */   public static void onChunkUnload(ChunkEvent.Unload paramUnload) {
/*     */     TextBuffer$.MODULE$.onChunkUnload(paramUnload);
/*     */   }
/*     */   public static void clientBuffers_$eq(ListBuffer<TextBuffer> paramListBuffer) {
/*     */     TextBuffer$.MODULE$.clientBuffers_$eq(paramListBuffer);
/*     */   }
/*     */   public static ListBuffer<TextBuffer> clientBuffers() {
/*     */     return TextBuffer$.MODULE$.clientBuffers();
/*     */   }
/*     */   public final class TextBuffer$$anonfun$save$1 extends AbstractFunction1<Node, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Object apply(Node node) {
/*     */       Environment environment = node.host();
/*     */       if (environment instanceof Computer) {
/*     */         Computer computer = (Computer)environment;
/*     */         if (!computer.machine().isPaused())
/*     */           return BoxesRunTime.boxToBoolean(computer.machine().pause(0.1D)); 
/*     */       } 
/*     */       return BoxedUnit.UNIT;
/*     */     }
/*     */     public TextBuffer$$anonfun$save$1(TextBuffer $outer) {} }
/*     */   public final class TextBuffer$$anonfun$save$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.data().save(nbt);
/*     */     }
/*     */     public TextBuffer$$anonfun$save$2(TextBuffer $outer) {} }
/*     */   public static abstract class Proxy { private boolean dirty = false;
/*     */     public abstract TextBuffer owner();
/* 523 */     public boolean dirty() { return this.dirty; } public void dirty_$eq(boolean x$1) { this.dirty = x$1; }
/*     */     
/* 525 */     private String nodeAddress = ""; public String nodeAddress() { return this.nodeAddress; } public void nodeAddress_$eq(String x$1) { this.nodeAddress = x$1; }
/*     */     
/*     */     public void markDirty() {
/* 528 */       dirty_$eq(true);
/*     */     }
/*     */     public boolean render() {
/* 531 */       return false;
/*     */     }
/*     */     public abstract void onBufferColorChange();
/*     */     
/*     */     public void onBufferCopy(int col, int row, int w, int h, int tx, int ty) {
/* 536 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public abstract void onBufferDepthChange(li.cil.oc.api.internal.TextBuffer.ColorDepth param1ColorDepth);
/*     */     
/*     */     public void onBufferFill(int col, int row, int w, int h, int c) {
/* 542 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public abstract void onBufferPaletteChange(int param1Int);
/*     */     
/*     */     public void onBufferResolutionChange(int w, int h) {
/* 548 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferViewportResolutionChange(int w, int h) {
/* 552 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onBufferMaxResolutionChange(int w, int h) {}
/*     */     
/*     */     public void onBufferSet(int col, int row, String s, boolean vertical) {
/* 559 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferBitBlt(int col, int row, int w, int h, GpuTextBuffer ram, int fromCol, int fromRow) {
/* 563 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferRamInit(GpuTextBuffer ram) {
/* 567 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferRamDestroy(GpuTextBuffer ram) {
/* 571 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferRawSetText(int col, int row, int[][] text) {
/* 575 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferRawSetBackground(int col, int row, int[][] color) {
/* 579 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     
/*     */     public void onBufferRawSetForeground(int col, int row, int[][] color) {
/* 583 */       owner().li$cil$oc$common$component$TextBuffer$$relativeLitArea_$eq(-1.0D);
/*     */     }
/*     */     public abstract void keyDown(char param1Char, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     public abstract void keyUp(char param1Char, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void clipboard(String param1String, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void mouseDown(double param1Double1, double param1Double2, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void mouseDrag(double param1Double1, double param1Double2, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void mouseUp(double param1Double1, double param1Double2, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void mouseScroll(double param1Double1, double param1Double2, int param1Int, EntityPlayer param1EntityPlayer);
/*     */     
/*     */     public abstract void copyToAnalyzer(int param1Int, EntityPlayer param1EntityPlayer); }
/*     */   
/*     */   public static class ClientProxy extends Proxy { private final TextBuffer owner;
/*     */     
/*     */     public TextBuffer owner() {
/* 603 */       return this.owner;
/* 604 */     } private final TextBufferRenderData renderer = new TextBuffer$ClientProxy$$anon$1(this); private ItemInfo Debugger; private volatile boolean bitmap$0; public TextBufferRenderData renderer() { return this.renderer; } public final class TextBuffer$ClientProxy$$anon$1 implements TextBufferRenderData { public TextBuffer$ClientProxy$$anon$1(TextBuffer.ClientProxy $outer) {} public boolean dirty() {
/* 605 */         return this.$outer.dirty();
/*     */       } public void dirty_$eq(boolean value) {
/* 607 */         this.$outer.dirty_$eq(value);
/*     */       } public li.cil.oc.util.TextBuffer data() {
/* 609 */         return this.$outer.owner().data();
/*     */       } public Tuple2<Object, Object> viewport() {
/* 611 */         return this.$outer.owner().viewport();
/*     */       } }
/*     */     
/*     */     public boolean render() {
/* 615 */       boolean wasDirty = dirty();
/* 616 */       TextBufferRenderCache$.MODULE$.render(renderer());
/* 617 */       return wasDirty;
/*     */     }
/*     */     
/*     */     public void onBufferColorChange() {
/* 621 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferCopy(int col, int row, int w, int h, int tx, int ty) {
/* 625 */       super.onBufferCopy(col, row, w, h, tx, ty);
/* 626 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferDepthChange(li.cil.oc.api.internal.TextBuffer.ColorDepth depth) {
/* 630 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferFill(int col, int row, int w, int h, int c) {
/* 634 */       super.onBufferFill(col, row, w, h, c);
/* 635 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferPaletteChange(int index) {
/* 639 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferResolutionChange(int w, int h) {
/* 643 */       super.onBufferResolutionChange(w, h);
/* 644 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferViewportResolutionChange(int w, int h) {
/* 648 */       super.onBufferViewportResolutionChange(w, h);
/* 649 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferSet(int col, int row, String s, boolean vertical) {
/* 653 */       super.onBufferSet(col, row, s, vertical);
/* 654 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferBitBlt(int col, int row, int w, int h, GpuTextBuffer ram, int fromCol, int fromRow) {
/* 658 */       super.onBufferBitBlt(col, row, w, h, ram, fromCol, fromRow);
/* 659 */       markDirty();
/*     */     }
/*     */     
/*     */     public void onBufferRamInit(GpuTextBuffer ram) {
/* 663 */       super.onBufferRamInit(ram);
/*     */     }
/*     */     
/*     */     public void onBufferRamDestroy(GpuTextBuffer ram) {
/* 667 */       super.onBufferRamDestroy(ram);
/*     */     }
/*     */     
/*     */     public void keyDown(char character, int code, EntityPlayer player) {
/* 671 */       (new String[3])[0] = "{type = keyDown, char = "; (new String[3])[1] = ", code = "; (new String[3])[2] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToCharacter(character), BoxesRunTime.boxToInteger(code) })));
/* 672 */       PacketSender$.MODULE$.sendKeyDown(nodeAddress(), character, code);
/*     */     }
/*     */     
/*     */     public void keyUp(char character, int code, EntityPlayer player) {
/* 676 */       (new String[3])[0] = "{type = keyUp, char = "; (new String[3])[1] = ", code = "; (new String[3])[2] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToCharacter(character), BoxesRunTime.boxToInteger(code) })));
/* 677 */       PacketSender$.MODULE$.sendKeyUp(nodeAddress(), character, code);
/*     */     }
/*     */     
/*     */     public void clipboard(String value, EntityPlayer player) {
/* 681 */       (new String[1])[0] = "{type = clipboard}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[1]))).s((Seq)Nil$.MODULE$));
/* 682 */       PacketSender$.MODULE$.sendClipboard(nodeAddress(), value);
/*     */     }
/*     */     
/*     */     public void mouseDown(double x, double y, int button, EntityPlayer player) {
/* 686 */       (new String[4])[0] = "{type = mouseDown, x = "; (new String[4])[1] = ", y = "; (new String[4])[2] = ", button = "; (new String[4])[3] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(x), BoxesRunTime.boxToDouble(y), BoxesRunTime.boxToInteger(button) })));
/* 687 */       PacketSender$.MODULE$.sendMouseClick(nodeAddress(), x, y, false, button);
/*     */     }
/*     */     
/*     */     public void mouseDrag(double x, double y, int button, EntityPlayer player) {
/* 691 */       (new String[4])[0] = "{type = mouseDrag, x = "; (new String[4])[1] = ", y = "; (new String[4])[2] = ", button = "; (new String[4])[3] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(x), BoxesRunTime.boxToDouble(y), BoxesRunTime.boxToInteger(button) })));
/* 692 */       PacketSender$.MODULE$.sendMouseClick(nodeAddress(), x, y, true, button);
/*     */     }
/*     */     
/*     */     public void mouseUp(double x, double y, int button, EntityPlayer player) {
/* 696 */       (new String[4])[0] = "{type = mouseUp, x = "; (new String[4])[1] = ", y = "; (new String[4])[2] = ", button = "; (new String[4])[3] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(x), BoxesRunTime.boxToDouble(y), BoxesRunTime.boxToInteger(button) })));
/* 697 */       PacketSender$.MODULE$.sendMouseUp(nodeAddress(), x, y, button);
/*     */     }
/*     */     
/*     */     public void mouseScroll(double x, double y, int delta, EntityPlayer player) {
/* 701 */       (new String[4])[0] = "{type = mouseScroll, x = "; (new String[4])[1] = ", y = "; (new String[4])[2] = ", delta = "; (new String[4])[3] = "}"; debug((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(x), BoxesRunTime.boxToDouble(y), BoxesRunTime.boxToInteger(delta) })));
/* 702 */       PacketSender$.MODULE$.sendMouseScroll(nodeAddress(), x, y, delta);
/*     */     }
/*     */     
/*     */     public void copyToAnalyzer(int line, EntityPlayer player) {
/* 706 */       PacketSender$.MODULE$.sendCopyToAnalyzer(nodeAddress(), line);
/*     */     }
/*     */     
/* 709 */     private ItemInfo Debugger$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.Debugger = Items.get("debugger"); this.bitmap$0 = true; }  return this.Debugger; }  } private ItemInfo Debugger() { return this.bitmap$0 ? this.Debugger : Debugger$lzycompute(); }
/*     */     
/*     */     private void debug(String message) {
/* 712 */       if (Minecraft.func_71410_x() != null && (Minecraft.func_71410_x()).field_71439_g != null) { ItemInfo itemInfo = Debugger(); if (Items.get((Minecraft.func_71410_x()).field_71439_g.func_70694_bm()) == null) { Items.get((Minecraft.func_71410_x()).field_71439_g.func_70694_bm()); if (itemInfo != null) return;  } else { if (Items.get((Minecraft.func_71410_x()).field_71439_g.func_70694_bm()).equals(itemInfo))
/* 713 */           { (new String[2])[0] = "[NETWORK DEBUGGER] Sending packet to node "; (new String[2])[1] = ": "; OpenComputers$.MODULE$.log().info((new StringBuilder()).append((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { nodeAddress() }))).append(message).toString()); return; }  return; }  } else { return; }  (new String[2])[0] = "[NETWORK DEBUGGER] Sending packet to node "; (new String[2])[1] = ": "; OpenComputers$.MODULE$.log().info((new StringBuilder()).append((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { nodeAddress() }))).append(message).toString());
/*     */     }
/*     */     public ClientProxy(TextBuffer owner) {} }
/*     */   public static class ServerProxy extends Proxy { private final TextBuffer owner;
/*     */     public TextBuffer owner() {
/* 718 */       return this.owner;
/*     */     } public ServerProxy(TextBuffer owner) {} public void onBufferColorChange() {
/* 720 */       owner().host().markChanged();
/* 721 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferColorChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), owner().data().foreground(), owner().data().background());
/*     */         return; }
/*     */     
/*     */     } public void onBufferCopy(int col, int row, int w, int h, int tx, int ty) {
/* 725 */       super.onBufferCopy(col, row, w, h, tx, ty);
/* 726 */       owner().host().markChanged();
/* 727 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferCopy(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, w, h, tx, ty);
/*     */         return; }
/*     */     
/*     */     } public void onBufferDepthChange(li.cil.oc.api.internal.TextBuffer.ColorDepth depth) {
/* 731 */       owner().host().markChanged();
/* 732 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferDepthChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), depth);
/*     */         return; }
/*     */     
/*     */     } public void onBufferFill(int col, int row, int w, int h, int c) {
/* 736 */       super.onBufferFill(col, row, w, h, c);
/* 737 */       owner().host().markChanged();
/* 738 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferFill(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, w, h, c);
/*     */         return; }
/*     */     
/*     */     } public void onBufferPaletteChange(int index) {
/* 742 */       owner().host().markChanged();
/* 743 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferPaletteChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), index, owner().getPaletteColor(index));
/*     */         return; }
/*     */     
/*     */     } public void onBufferResolutionChange(int w, int h) {
/* 747 */       super.onBufferResolutionChange(w, h);
/* 748 */       owner().host().markChanged();
/* 749 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferResolutionChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), w, h);
/*     */         return; }
/*     */     
/*     */     } public void onBufferViewportResolutionChange(int w, int h) {
/* 753 */       super.onBufferViewportResolutionChange(w, h);
/* 754 */       owner().host().markChanged();
/* 755 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferViewportResolutionChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), w, h);
/*     */         return; }
/*     */     
/*     */     } public void onBufferMaxResolutionChange(int w, int h) {
/* 759 */       if (owner().node().network() != null) {
/* 760 */         super.onBufferMaxResolutionChange(w, h);
/* 761 */         owner().host().markChanged();
/* 762 */         synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferMaxResolutionChange(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), w, h);
/*     */           return; }
/*     */       
/*     */       } 
/*     */     } public void onBufferSet(int col, int row, String s, boolean vertical) {
/* 767 */       super.onBufferSet(col, row, s, vertical);
/* 768 */       owner().host().markChanged();
/* 769 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferSet(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, s, vertical);
/*     */         return; }
/*     */     
/*     */     } public void onBufferBitBlt(int col, int row, int w, int h, GpuTextBuffer ram, int fromCol, int fromRow) {
/* 773 */       super.onBufferBitBlt(col, row, w, h, ram, fromCol, fromRow);
/* 774 */       owner().host().markChanged();
/* 775 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferBitBlt(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, w, h, ram.owner(), ram.id(), fromCol, fromRow);
/*     */         return; }
/*     */     
/*     */     } public void onBufferRamInit(GpuTextBuffer ram) {
/* 779 */       super.onBufferRamInit(ram);
/* 780 */       owner().host().markChanged();
/* 781 */       NBTTagCompound nbt = new NBTTagCompound();
/* 782 */       ram.save(nbt);
/* 783 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferRamInit(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), ram.owner(), ram.id(), nbt);
/*     */         return; }
/*     */     
/*     */     } public void onBufferRamDestroy(GpuTextBuffer ram) {
/* 787 */       super.onBufferRamDestroy(ram);
/* 788 */       owner().host().markChanged();
/* 789 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferRamDestroy(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), ram.owner(), ram.id());
/*     */         return; }
/*     */     
/*     */     } public void onBufferRawSetText(int col, int row, int[][] text) {
/* 793 */       super.onBufferRawSetText(col, row, text);
/* 794 */       owner().host().markChanged();
/* 795 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferRawSetText(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, text);
/*     */         return; }
/*     */     
/*     */     } public void onBufferRawSetBackground(int col, int row, int[][] color) {
/* 799 */       super.onBufferRawSetBackground(col, row, color);
/* 800 */       owner().host().markChanged();
/* 801 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferRawSetBackground(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, color);
/*     */         return; }
/*     */     
/*     */     } public void onBufferRawSetForeground(int col, int row, int[][] color) {
/* 805 */       super.onBufferRawSetForeground(col, row, color);
/* 806 */       owner().host().markChanged();
/* 807 */       synchronized (owner()) { PacketSender$.MODULE$.appendTextBufferRawSetForeground(owner().li$cil$oc$common$component$TextBuffer$$pendingCommands(), col, row, color);
/*     */         return; }
/*     */     
/*     */     } public void keyDown(char character, int code, EntityPlayer player) {
/* 811 */       sendToKeyboards("keyboard.keyDown", (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { player, BoxesRunTime.boxToCharacter(character), BoxesRunTime.boxToInteger(code) }));
/*     */     }
/*     */     
/*     */     public void keyUp(char character, int code, EntityPlayer player) {
/* 815 */       sendToKeyboards("keyboard.keyUp", (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { player, BoxesRunTime.boxToCharacter(character), BoxesRunTime.boxToInteger(code) }));
/*     */     }
/*     */     
/*     */     public void clipboard(String value, EntityPlayer player) {
/* 819 */       sendToKeyboards("keyboard.clipboard", (Seq<Object>)Predef$.MODULE$.wrapRefArray(new Object[] { player, value }));
/*     */     }
/*     */     
/*     */     public void mouseDown(double x, double y, int button, EntityPlayer player) {
/* 823 */       sendMouseEvent(player, "touch", x, y, button);
/*     */     }
/*     */     
/*     */     public void mouseDrag(double x, double y, int button, EntityPlayer player) {
/* 827 */       sendMouseEvent(player, "drag", x, y, button);
/*     */     }
/*     */     
/*     */     public void mouseUp(double x, double y, int button, EntityPlayer player) {
/* 831 */       sendMouseEvent(player, "drop", x, y, button);
/*     */     }
/*     */     
/*     */     public void mouseScroll(double x, double y, int delta, EntityPlayer player) {
/* 835 */       sendMouseEvent(player, "scroll", x, y, delta);
/*     */     }
/*     */     
/*     */     public void copyToAnalyzer(int line, EntityPlayer player) {
/* 839 */       ItemStack stack = player.func_70694_bm();
/* 840 */       if (stack != null) {
/* 841 */         if (!stack.func_77942_o()) {
/* 842 */           stack.func_77982_d(new NBTTagCompound());
/*     */         }
/* 844 */         stack.func_77978_p().func_82580_o((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("clipboard").toString());
/*     */         
/* 846 */         if (line >= 0 && line < owner().getViewportHeight()) {
/* 847 */           String text = owner().data().lineToString(line);
/* 848 */           if (!Strings.isNullOrEmpty(text)) {
/* 849 */             stack.func_77978_p().func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("clipboard").toString(), text);
/*     */           }
/*     */         } 
/*     */         
/* 853 */         if (stack.func_77978_p().func_82582_d()) {
/* 854 */           stack.func_77982_d(null);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     private void sendMouseEvent(EntityPlayer player, String name, double x, double y, int data) {
/* 860 */       ArrayBuffer args = (ArrayBuffer)ArrayBuffer$.MODULE$.empty();
/*     */       
/* 862 */       args.$plus$eq(player);
/* 863 */       args.$plus$eq(name);
/*     */       
/* 865 */       args.$plus$eq(BoxesRunTime.boxToDouble(x));
/*     */ 
/*     */ 
/*     */       
/* 869 */       args.$plus$eq(BoxesRunTime.boxToInteger((int)x + 1));
/* 870 */       owner().li$cil$oc$common$component$TextBuffer$$precisionMode() ? args.$plus$eq(BoxesRunTime.boxToDouble(y)) : args.$plus$eq(BoxesRunTime.boxToInteger((int)y + 1));
/*     */       
/* 872 */       args.$plus$eq(BoxesRunTime.boxToInteger(data));
/* 873 */       Settings$.MODULE$.get().inputUsername() ? 
/* 874 */         args.$plus$eq(player.func_70005_c_()) : BoxedUnit.UNIT;
/*     */ 
/*     */       
/* 877 */       owner().node().sendToReachable("computer.checked_signal", (Object[])args.toArray(ClassTag$.MODULE$.AnyRef()));
/*     */     }
/*     */     
/*     */     private void sendToKeyboards(String name, Seq values) {
/* 881 */       EnvironmentHost environmentHost = owner().host();
/* 882 */       if (environmentHost instanceof Screen) { Screen screen = (Screen)environmentHost;
/* 883 */         screen.screens().foreach((Function1)new TextBuffer$ServerProxy$$anonfun$sendToKeyboards$1(this, name, values)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 885 */       { owner().node().sendToNeighbors(name, (Object[])values.toArray(ClassTag$.MODULE$.AnyRef())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */     
/*     */     public final class TextBuffer$ServerProxy$$anonfun$sendToKeyboards$1 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final String name$1;
/*     */       private final Seq values$1;
/*     */       
/*     */       public final void apply(Screen x$12) {
/*     */         x$12.node().sendToNeighbors(this.name$1, (Object[])this.values$1.toArray(ClassTag$.MODULE$.AnyRef()));
/*     */       }
/*     */       
/*     */       public TextBuffer$ServerProxy$$anonfun$sendToKeyboards$1(TextBuffer.ServerProxy $outer, String name$1, Seq values$1) {}
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\TextBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */