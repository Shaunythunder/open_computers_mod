/*      */ package li.cil.oc.server.machine;
/*      */ 
/*      */ import java.util.Map;
/*      */ import li.cil.oc.api.machine.Architecture;
/*      */ import li.cil.oc.api.network.Component;
/*      */ import li.cil.oc.api.network.ManagedEnvironment;
/*      */ import li.cil.oc.api.network.Node;
/*      */ import net.minecraft.item.ItemStack;
/*      */ import net.minecraft.nbt.NBTBase;
/*      */ import net.minecraft.nbt.NBTTagCompound;
/*      */ import net.minecraft.nbt.NBTTagList;
/*      */ import scala.Enumeration;
/*      */ import scala.Function1;
/*      */ import scala.Option;
/*      */ import scala.Serializable;
/*      */ import scala.Tuple2;
/*      */ import scala.collection.Seq;
/*      */ import scala.collection.mutable.Map;
/*      */ import scala.runtime.AbstractFunction1;
/*      */ import scala.runtime.BoxedUnit;
/*      */ import scala.runtime.BoxesRunTime;
/*      */ 
/*      */ @ScalaSignature(bytes = "\006\001\025\035e\001B\001\003\0015\021q!T1dQ&tWM\003\002\004\t\0059Q.Y2iS:,'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\013\001qaC\007\022\021\005=!R\"\001\t\013\005E\021\022A\0029sK\032\f'M\003\002\024\r\005\031\021\r]5\n\005U\001\"AE'b]\006<W\rZ#om&\024xN\\7f]R\004\"aF\r\016\003aQ!a\001\n\n\005\005A\002CA\016!\033\005a\"BA\017\037\003\021a\027M\\4\013\003}\tAA[1wC&\021\021\005\b\002\t%Vtg.\0312mKB\0211EJ\007\002I)\021QEE\001\007IJLg/\032:\n\005\035\"#A\003#fm&\034W-\0238g_\"A\021\006\001BC\002\023\005!&\001\003i_N$X#A\026\021\005]a\023BA\027\031\005-i\025m\0315j]\026Dun\035;\t\021=\002!\021!Q\001\n-\nQ\001[8ti\002BQ!\r\001\005\002I\na\001P5oSRtDCA\0326!\t!\004!D\001\003\021\025I\003\0071\001,\021\0359\004A1A\005Ba\nAA\\8eKV\t\021\b\005\002;{5\t1H\003\002=%\0059a.\032;x_J\\\027B\001 <\005I\031u.\0349p]\026tGoQ8o]\026\034Go\034:\t\r\001\003\001\025!\003:\003\025qw\016Z3!\021\035\021\005A1A\005\002\r\0131\001^7q+\005!\005cA#I\0256\taIC\001H\003\025\0318-\0317b\023\tIeI\001\004PaRLwN\034\t\003u-K!!F\036\t\r5\003\001\025!\003E\003\021!X\016\035\021\t\023=\003\001\031!a\001\n\003\001\026\001D1sG\"LG/Z2ukJ,W#A)\021\005]\021\026BA*\031\0051\t%o\0315ji\026\034G/\036:f\021%)\006\0011AA\002\023\005a+\001\tbe\016D\027\016^3diV\024Xm\030\023fcR\021qK\027\t\003\013bK!!\027$\003\tUs\027\016\036\005\b7R\013\t\0211\001R\003\rAH%\r\005\007;\002\001\013\025B)\002\033\005\0248\r[5uK\016$XO]3!\021!y\006A1A\005\002\t\001\027!B:uCR,W#A1\021\007\t<\027.D\001d\025\t!W-A\004nkR\f'\r\\3\013\005\0314\025AC2pY2,7\r^5p]&\021\001n\031\002\006'R\f7m\033\t\004U\006EebA6\002p9\021A\007\\\004\006[\nA\tA\\\001\b\033\006\034\007.\0338f!\t!tNB\003\002\005!\005\001oE\002pcR\004\"a\007:\n\005Md\"AB(cU\026\034G\017\005\002vq6\taO\003\002x%\0051A-\032;bS2L!!\037<\003\0255\0137\r[5oK\006\003\026\nC\0032_\022\0051\020F\001o\021\035ixN1A\005\002y\fqa\0315fG.,G-F\001\000!\025\021\027\021AA\003\023\r\t\031a\031\002\016\031&t7.\0323ICND7+\032;1\t\005\035\021\021\003\t\0067\005%\021QB\005\004\003\027a\"!B\"mCN\034\b\003BA\b\003#a\001\001\002\007\002\024\005U\021\021!A\001\006\003\tIBA\002`IEBq!a\006pA\003%q0\001\005dQ\026\0347.\0323!#\r\tY\"\025\t\004\013\006u\021bAA\020\r\n9aj\034;iS:<\007bBA\022_\022\005\023QE\001\004C\022$GcA,\002(!9q*!\tA\002\005%\002\007BA\026\003s\001b!!\f\0024\005]bbA#\0020%\031\021\021\007$\002\rA\023X\rZ3g\023\021\tY!!\016\013\007\005Eb\t\005\003\002\020\005eB\001DA\036\003O\t\t\021!A\003\002\005e!aA0%e!9\021qH8\005B\005\005\023!D1sG\"LG/Z2ukJ,7\017\006\002\002DA1\021QIA&\003\013i!!a\022\013\007\005%c$\001\003vi&d\027\002BA'\003\017\022A\001T5ti\"9\021\021K8\005\002\005M\023aE4fi\006\0238\r[5uK\016$XO]3OC6,G\003BA+\0037\0022aGA,\023\r\tI\006\b\002\007'R\024\030N\\4\t\017=\013y\0051\001\002^A\"\021qLA2!\031\ti#a\r\002bA!\021qBA2\t1\t)'a\027\002\002\003\005)\021AA\r\005\ryFe\r\005\b\003SzG\021IA6\003\031\031'/Z1uKR\0311'!\034\t\r%\n9\0071\001,\017!\t\th\034E\001\005\005M\024!B*uCR,\007\003BA;\003oj\021a\034\004\t\003sz\007\022\001\002\002|\t)1\013^1uKN!\021qOA?!\r)\025qP\005\004\003\0033%aC#ok6,'/\031;j_:Dq!MA<\t\003\t)\t\006\002\002t!Q\021\021RA<\005\004%\t!a#\002\017M#x\016\0359fIV\021\021Q\022\t\005\003\037\013\t*\004\002\002x%!\0211SA@\005\0251\026\r\\;f\021%\t9*a\036!\002\023\ti)\001\005Ti>\004\b/\0323!\021)\tY*a\036C\002\023\005\0211R\001\t'R\f'\017^5oO\"I\021qTA<A\003%\021QR\001\n'R\f'\017^5oO\002B!\"a)\002x\t\007I\021AAF\003)\021Vm\035;beRLgn\032\005\n\003O\0139\b)A\005\003\033\0131BU3ti\006\024H/\0338hA!Q\0211VA<\005\004%\t!a#\002\021M#x\016\0359j]\036D\021\"a,\002x\001\006I!!$\002\023M#x\016\0359j]\036\004\003BCAZ\003o\022\r\021\"\001\002\f\0061\001+Y;tK\022D\021\"a.\002x\001\006I!!$\002\017A\013Wo]3eA!Q\0211XA<\005\004%\t!a#\002!MKhn\0315s_:L'0\0323DC2d\007\"CA`\003o\002\013\021BAG\003E\031\026P\\2ie>t\027N_3e\007\006dG\016\t\005\013\003\007\f9H1A\005\002\005-\025AE*z]\016D'o\0348ju\026$'+\032;ve:D\021\"a2\002x\001\006I!!$\002'MKhn\0315s_:L'0\0323SKR,(O\034\021\t\025\005-\027q\017b\001\n\003\tY)A\004ZS\026dG-\0323\t\023\005=\027q\017Q\001\n\0055\025\001C-jK2$W\r\032\021\t\025\005M\027q\017b\001\n\003\tY)\001\005TY\026,\007/\0338h\021%\t9.a\036!\002\023\ti)A\005TY\026,\007/\0338hA!Q\0211\\A<\005\004%\t!a#\002\017I+hN\\5oO\"I\021q\\A<A\003%\021QR\001\t%Vtg.\0338hA\0319\0211]8\001\005\005\025(AB*jO:\fGnE\003\002bF\f9\017E\002\030\003SL1!a9\031\021-\ti/!9\003\006\004%\t!a<\002\t9\fW.Z\013\003\003c\004B!!\f\002t&!\021\021LA\033\021-\t90!9\003\002\003\006I!!=\002\0139\fW.\032\021\t\027\005m\030\021\035BC\002\023\005\021Q`\001\005CJ<7/\006\002\002\000B)QI!\001\003\006%\031!1\001$\003\013\005\023(/Y=\021\007\025\0239!C\002\003\n\031\023a!\0218z%\0264\007b\003B\007\003C\024\t\021)A\005\003\fQ!\031:hg\002Bq!MAq\t\003\021\t\002\006\004\003\024\tU!q\003\t\005\003k\n\t\017\003\005\002n\n=\001\031AAy\021!\tYPa\004A\002\005}\b\002\003B\016\003C$\tA!\b\002\017\r|gN^3siR\021!1\003\005\n\005Cy'\031!C\005\005G\t!\002\0365sK\006$\007k\\8m+\t\021)\003\005\003\003(\t5RB\001B\025\025\021\021Y#a\022\002\025\r|gnY;se\026tG/\003\003\0030\t%\"\001G*dQ\026$W\017\\3e\013b,7-\036;peN+'O^5dK\"A!1G8!\002\023\021)#A\006uQJ,\027\r\032)p_2\004\003b\002B\034\001\001\006I!Y\001\007gR\fG/\032\021\t\023\tm\002A1A\005\n\tu\022aC0d_6\004xN\\3oiN,\"Aa\020\021\017\t\024\t%!=\002r&\031!1I2\003\0075\013\007\017\003\005\003H\001\001\013\021\002B \0031y6m\\7q_:,g\016^:!\021%\021Y\005\001b\001\n\023\021i%A\bbI\022,GmQ8na>tWM\034;t+\t\021y\005E\003c\005#\022)&C\002\003T\r\0241aU3u!\rQ$qK\005\004\0053Z$!C\"p[B|g.\0328u\021!\021i\006\001Q\001\n\t=\023\001E1eI\026$7i\\7q_:,g\016^:!\021%\021\t\007\001b\001\n\023\021\031'\001\004`kN,'o]\013\003\005K\002RA\031B)\003cD\001B!\033\001A\003%!QM\001\b?V\034XM]:!\021%\021i\007\001b\001\n\023\021y'A\004tS\036t\027\r\\:\026\005\tE\004#\0022\003t\t]\024b\001B;G\n)\021+^3vKB\0311.!9\t\021\tm\004\001)A\005\005c\n\001b]5h]\006d7\017\t\005\n\005\002\001\031!C\001\005\003\013Q\"\\1y\007>l\007o\0348f]R\034XC\001BB!\r)%QQ\005\004\005\0173%aA%oi\"I!1\022\001A\002\023\005!QR\001\022[\006D8i\\7q_:,g\016^:`I\025\fHcA,\003\020\"I1L!#\002\002\003\007!1\021\005\t\005'\003\001\025)\003\003\004\006qQ.\031=D_6\004xN\\3oiN\004\003\"\003BL\001\001\007I\021\002BM\0035i\027\r_\"bY2\024U\017Z4fiV\021!1\024\t\004\013\nu\025b\001BP\r\n1Ai\\;cY\026D\021Ba)\001\001\004%IA!*\002#5\f\007pQ1mY\n+HmZ3u?\022*\027\017F\002X\005OC\021b\027BQ\003\003\005\rAa'\t\021\t-\006\001)Q\005\0057\013a\"\\1y\007\006dGNQ;eO\026$\b\005C\005\0030\002\001\r\021\"\003\0032\006I\001.Y:NK6|'/_\013\003\005g\0032!\022B[\023\r\0219L\022\002\b\005>|G.Z1o\021%\021Y\f\001a\001\n\023\021i,A\007iCNlU-\\8ss~#S-\035\013\004/\n}\006\"C.\003:\006\005\t\031\001BZ\021!\021\031\r\001Q!\n\tM\026A\0035bg6+Wn\034:zA!I!q\031\001A\002\023%!\021T\001\013G\006dGNQ;eO\026$\b\"\003Bf\001\001\007I\021\002Bg\0039\031\027\r\0347Ck\022<W\r^0%KF$2a\026Bh\021%Y&\021ZA\001\002\004\021Y\n\003\005\003T\002\001\013\025\002BN\003-\031\027\r\0347Ck\022<W\r\036\021)\t\tE'q\033\t\004\013\ne\027b\001Bn\r\nAao\0347bi&dW\rC\005\003`\002\001\r\021\"\003\0032\006\021\022N\\*z]\016D'o\0348ju\026$7)\0317m\021%\021\031\017\001a\001\n\023\021)/\001\fj]NKhn\0315s_:L'0\0323DC2dw\fJ3r)\r9&q\035\005\n7\n\005\030\021!a\001\005gC\001Ba;\001A\003&!1W\001\024S:\034\026P\\2ie>t\027N_3e\007\006dG\016\t\005\n\005_\004\001\031!C\001\005c\f\021b^8sY\022$\026.\\3\026\005\tM\bcA#\003v&\031!q\037$\003\t1{gn\032\005\n\005w\004\001\031!C\001\005{\fQb^8sY\022$\026.\\3`I\025\fHcA,\003\000\"I1L!?\002\002\003\007!1\037\005\t\007\007\001\001\025)\003\003t\006Qqo\034:mIRKW.\032\021\t\023\r\035\001\0011A\005\n\tE\030AB;qi&lW\rC\005\004\f\001\001\r\021\"\003\004\016\005QQ\017\035;j[\026|F%Z9\025\007]\033y\001C\005\\\007\023\t\t\0211\001\003t\"A11\003\001!B\023\021\0310A\004vaRLW.\032\021\t\023\r]\001\0011A\005\n\tE\030\001C2qkR{G/\0317\t\023\rm\001\0011A\005\n\ru\021\001D2qkR{G/\0317`I\025\fHcA,\004 !I1l!\007\002\002\003\007!1\037\005\t\007G\001\001\025)\003\003t\006I1\r];U_R\fG\016\t\005\n\007O\001\001\031!C\005\005c\f\001b\0319v'R\f'\017\036\005\n\007W\001\001\031!C\005\007[\tAb\0319v'R\f'\017^0%KF$2aVB\030\021%Y6\021FA\001\002\004\021\031\020\003\005\0044\001\001\013\025\002Bz\003%\031\007/^*uCJ$\b\005C\005\0048\001\001\r\021\"\003\003\002\006Q!/Z7bS:LE\r\\3\t\023\rm\002\0011A\005\n\ru\022A\004:f[\006Lg.\0233mK~#S-\035\013\004/\016}\002\"C.\004:\005\005\t\031\001BB\021!\031\031\005\001Q!\n\t\r\025a\003:f[\006Lg.\0233mK\002B\021ba\022\001\001\004%IA!!\002\035I,W.Y5oS:<\007+Y;tK\"I11\n\001A\002\023%1QJ\001\023e\026l\027-\0338j]\036\004\026-^:f?\022*\027\017F\002X\007\037B\021bWB%\003\003\005\rAa!\t\021\rM\003\001)Q\005\005\007\013qB]3nC&t\027N\\4QCV\034X\r\t\005\n\007/\002\001\031!C\005\005c\013A\"^:feN\034\005.\0318hK\022D\021ba\027\001\001\004%Ia!\030\002!U\034XM]:DQ\006tw-\0323`I\025\fHcA,\004`!I1l!\027\002\002\003\007!1\027\005\t\007G\002\001\025)\003\0034\006iQo]3sg\016C\027M\\4fI\002B\021ba\032\001\001\004%Ia!\033\002\0175,7o]1hKV\02111\016\t\005\013\"\013\t\020C\005\004p\001\001\r\021\"\003\004r\005YQ.Z:tC\036,w\fJ3r)\r961\017\005\n7\0165\024\021!a\001\007WB\001ba\036\001A\003&11N\001\t[\026\0348/Y4fA!I11\020\001A\002\023%!\021T\001\005G>\034H\017C\005\004\000\001\001\r\021\"\003\004\002\006A1m\\:u?\022*\027\017F\002X\007\007C\021bWB?\003\003\005\rAa'\t\021\r\035\005\001)Q\005\0057\013QaY8ti\002B\021ba#\001\005\004%IA!!\002%5\f\007pU5h]\006d\027+^3vKNK'0\032\005\t\007\037\003\001\025!\003\003\004\006\031R.\031=TS\036t\027\r\\)vKV,7+\033>fA!911\023\001\005B\rU\025!D8o\021>\034Ho\0215b]\036,G\rF\001X\021\035\031I\n\001C!\0077\013!bY8na>tWM\034;t)\t\031i\n\005\005\002F\r}\025\021_Ay\023\021\021\031%a\022\t\017\r\r\006\001\"\001\004&\006q1m\\7q_:,g\016^\"pk:$HC\001BB\021\035\031I\013\001C!\007W\013!\002^7q\003\022$'/Z:t)\t\t\t\020C\004\0040\002!\ta!-\002\0231\f7\017^#se>\024HCAA+\021\035\031)\f\001C!\007o\013ab]3u\007>\034H\017U3s)&\0347\016F\002X\007sC\001ba/\0044\002\007!1T\001\006m\006dW/\032\005\b\007\003A\021IBa\00399W\r^\"pgR\004VM\035+jG.$\"Aa'\t\017\r\025\007\001\"\021\004H\006)Qo]3sgR\0211\021\032\t\006\013\n\005\021\021\037\005\b\007\033\004A\021IBa\003\031)\b\017V5nK\"91\021\033\001\005B\r\005\027aB2qkRKW.\032\005\b\007+\004A\021IBN\00359W\r\036#fm&\034W-\0238g_\"91\021\034\001\005B\rm\027aC2b]&sG/\032:bGR$BAa-\004^\"A1q\\Bl\001\004\t\t0\001\004qY\006LXM\035\005\b\007G\004A\021IBs\003%I7OU;o]&tw\r\006\002\0034\"91\021\036\001\005B\r\025\030\001C5t!\006,8/\0323\t\017\r5\b\001\"\021\004f\006)1\017^1si\"91\021\037\001\005B\rM\030!\0029bkN,G\003\002BZ\007kD\001ba>\004p\002\007!1T\001\bg\026\034wN\0343t\021\035\031Y\020\001C!\007K\fAa\035;pa\"91q \001\005B\021\005\021!E2p]N,X.Z\"bY2\024U\017Z4fiR\031q\013b\001\t\021\021\0251Q a\001\0057\013\001bY1mY\016{7\017\036\005\b\t\023\001A\021\tC\006\003\021\021W-\0329\025\013]#i\001b\006\t\021\021=Aq\001a\001\t#\t\021B\032:fcV,gnY=\021\007\025#\031\"C\002\005\026\031\023Qa\0255peRD\001\002\"\007\005\b\001\007A\021C\001\tIV\024\030\r^5p]\"9A\021\002\001\005B\021uAcA,\005 !AA\021\005C\016\001\004\t\t0A\004qCR$XM\0358\t\017\021\025\002\001\"\021\005(\005)1M]1tQR!!1\027C\025\021!\0319\007b\tA\002\005E\bb\002C\027\001\021\005AqF\001\013G>tg/\032:u\003J<G\003\002B\003\tcA\001\002b\r\005,\001\007AQG\001\006a\006\024\030-\034\t\004\013\022]\022b\001C\035\r\n\031\021I\\=\t\017\021u\002\001\"\021\005@\00511/[4oC2$bAa-\005B\021\r\003\002CAw\tw\001\r!!=\t\021\005mH1\ba\001\t\013\002R!\022C$\005\013I1\001\"\023G\005)a$/\0329fCR,GM\020\005\b\t\033\002A\021\tC(\003%\001x\016]*jO:\fG\016\006\002\003x!9A1\013\001\005B\021U\023aB7fi\"|Gm\035\013\005\t/\"y\006\005\005\002F\r}\025\021\037C-!\r9B1L\005\004\t;B\"\001C\"bY2\024\027mY6\t\021\rmF\021\013a\001\005\013Aq\001b\031\001\t\003\")'\001\004j]Z|7.\032\013\t\003$9\007b\033\005p!AA\021\016C1\001\004\t\t0A\004bI\022\024Xm]:\t\021\0215D\021\ra\001\003c\fa!\\3uQ>$\007\002CA~\tC\002\r!a@\t\017\021\r\004\001\"\021\005tQA\021q C;\tw\"i\b\003\005\004<\022E\004\031\001C<!\r9B\021P\005\004\003'C\002\002\003C7\tc\002\r!!=\t\021\005mH\021\017a\001\003Dq\001\"!\001\t\003\"\031)A\004bI\022,6/\032:\025\007]#)\t\003\005\002n\022}\004\031AAy\021\035!I\t\001C!\t\027\013!B]3n_Z,Wk]3s)\021\021\031\f\"$\t\021\0055Hq\021a\001\003cDqa!<\001\t\003!\t\n\006\004\002\000\022MEQ\024\005\t\t+#y\t1\001\005\030\00691m\0348uKb$\bcA\f\005\032&\031A1\024\r\003\017\r{g\016^3yi\"A\0211 CH\001\004!y\nE\002\030\tCK1\001b)\031\005%\t%oZ;nK:$8\017\013\005\005\020\022eCq\025CU\003\r!wnY\021\003\tW\013QJZ;oGRLwN\034\025*u\t|w\016\\3b]\002jS\006I*uCJ$8\017\t;iK\002\032w.\0349vi\026\024h\006\t*fiV\024hn\035\021ueV,\007%\0334!i\",\007e\035;bi\026\0043\r[1oO\026$g\006C\004\004|\002!\t\001b,\025\r\005}H\021\027CZ\021!!)\n\",A\002\021]\005\002CA~\t[\003\r\001b()\021\0215F\021\fCT\to\013#\001\"/\002\031\032,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001\032Fo\0349tAQDW\rI2p[B,H/\032:/AI+G/\036:og\002\"(/^3!S\032\004C\017[3!gR\fG/\032\021dQ\006tw-\0323/\021\035\031\031\017\001C\001\t{#b!a@\005@\022\005\007\002\003CK\tw\003\r\001b&\t\021\005mH1\030a\001\t?CC\002b/\005Z\021\025Gq\031CT\t\023\fa\001Z5sK\016$\030$A\001\"\005\021-\027A\0204v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021SKR,(O\\:!o\",G\017[3sAQDW\rI2p[B,H/\032:!SN\004#/\0368oS:<g\006C\004\005\n\001!\t\001b4\025\r\005}H\021\033Cj\021!!)\n\"4A\002\021]\005\002CA~\t\033\004\r\001b()\021\0215G\021\fCT\t/\f#\001\"7\002m\032,hn\031;j_:D3L\032:fcV,gnY=;gR\024\030N\\4!_J\004c.^7cKJ\\F\006\t3ve\006$\030n\0348;]Vl'-\032:^;&\002S&\f\021QY\006L8\017I1!i>tW\r\f\021vg\0264W\017\034\021u_\002\nG.\032:uAU\034XM]:!m&\f\007%Y;eS\ndW\r\t4fK\022\024\027mY6/\021\035\031)\016\001C\001\t;$b!a@\005`\022\005\b\002\003CK\t7\004\r\001b&\t\021\005mH1\034a\001\t?C\003\002b7\005Z\021\035FQ]\021\003\tO\f\021IZ;oGRLwN\034\025*uQ\f'\r\\3![5\0023i\0347mK\016$\b%\0338g_Jl\027\r^5p]\002zg\016I1mY\002\032wN\0348fGR,G\r\t3fm&\034Wm\035\030\t\017\021-\b\001\"\001\005n\006\031r-\032;Qe><'/Y7M_\016\fG/[8ogR1\021q Cx\tcD\001\002\"&\005j\002\007Aq\023\005\t\003w$I\0171\001\005 \"BA\021\036C-\tO#)0\t\002\005x\006\031f-\0368di&|g\016K\025;i\006\024G.\032\021.[\001\022V\r^;s]N\004\023\rI7ba\002zg\r\t9s_\036\024\030-\034\021oC6,\007\005^8!I&\0348\016\t7bE\026d\007EZ8sA-twn\0368!aJ|wM]1ng:Bq\001b?\001\t\003\021\t,A\006jg\026CXmY;uS:<\007\"\003C\000\001\t\007I\021\tBY\003%\031\027M\\+qI\006$X\r\003\005\006\004\001\001\013\021\002BZ\003)\031\027M\\+qI\006$X\r\t\005\b\013\017\001A\021IBK\003\031)\b\017Z1uK\"9Q1\002\001\005B\0255\021!C8o\033\026\0348/Y4f)\r9Vq\002\005\t\007O*I\0011\001\006\022A\031!(b\005\n\007\025U1HA\004NKN\034\030mZ3\t\017\025e\001\001\"\021\006\034\005IqN\\\"p]:,7\r\036\013\004/\026u\001bB\034\006\030\001\007Qq\004\t\004u\025\005\022bAC\022w\t!aj\0343f\021\035)9\003\001C!\013S\tAb\0348ESN\034wN\0348fGR$2aVC\026\021\0359TQ\005a\001\013?Aq!b\f\001\t\003)\t$\001\007bI\022\034u.\0349p]\026tG\017F\002X\013gA\001\"\"\016\006.\001\007!QK\001\nG>l\007o\0348f]RDq!\"\017\001\t\003)Y$A\bsK6|g/Z\"p[B|g.\0328u)\r9VQ\b\005\t\013k)9\0041\001\003V!9Q\021\t\001\005\n\rU\025A\0069s_\016,7o]!eI\026$7i\\7q_:,g\016^:\t\017\025\025\003\001\"\003\004\026\006\001b/\032:jMf\034u.\0349p]\026tGo\035\005\b\013\023\002A\021IC&\003\021aw.\0313\025\007]+i\005\003\005\006P\025\035\003\031AC)\003\rq'\r\036\t\005\013'*y&\004\002\006V)!QqJC,\025\021)I&b\027\002\0235Lg.Z2sC\032$(BAC/\003\rqW\r^\005\005\013C*)F\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\025\025\004\001\"\021\006h\005!1/\031<f)\r9V\021\016\005\t\013\037*\031\0071\001\006R!9QQ\016\001\005\n\r\025\030\001B5oSRDq!\"\035\001\t\003\031)/\001\005uef\034En\\:f\021\035))\b\001C\005\007+\013Qa\0317pg\026Dq!\"\037\001\t\023)Y(\001\005to&$8\r\033+p)\rIWQ\020\005\b\007w+9\b1\001j\021\035)\t\t\001C\005\005c\013A\"[:HC6,\007+Y;tK\022Dq!\"\"\001\t\003\032)*A\002sk:\004")
/*      */ public class Machine extends ManagedEnvironment implements Machine, Runnable, DeviceInfo {
/*      */   private final MachineHost host;
/*      */   private final ComponentConnector node;
/*      */   private final Option<ManagedEnvironment> tmp;
/*      */   private Architecture architecture;
/*      */   private final Stack<Enumeration.Value> state;
/*      */   private final Map<String, String> li$cil$oc$server$machine$Machine$$_components;
/*      */   private final Set<Component> addedComponents;
/*      */   private final Set<String> li$cil$oc$server$machine$Machine$$_users;
/*      */   private final Queue<Signal> signals;
/*      */   private int maxComponents;
/*      */   private double maxCallBudget;
/*      */   private boolean hasMemory;
/*      */   private volatile double callBudget;
/*      */   private boolean inSynchronizedCall;
/*      */   private long worldTime;
/*      */   private long uptime;
/*      */   private long cpuTotal;
/*      */   private long cpuStart;
/*      */   private int remainIdle;
/*      */   private int remainingPause;
/*      */   private boolean usersChanged;
/*      */   private Option<String> message;
/*      */   private double cost;
/*      */   private final int maxSignalQueueSize;
/*      */   private final boolean canUpdate;
/*      */   
/*   51 */   public MachineHost host() { return this.host; }
/*   52 */   public Machine(MachineHost host) { this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*   53 */       .withComponent("computer", Visibility.Neighbors)
/*   54 */       .withConnector(li.cil.oc.Settings$.MODULE$.get().bufferComputer())
/*   55 */       .create();
/*      */     
/*   57 */     this.tmp = (li.cil.oc.Settings$.MODULE$.get().tmpSize() > 0) ? 
/*   58 */       scala.Option$.MODULE$.apply(li.cil.oc.server.fs.FileSystem$.MODULE$.asManagedEnvironment(li.cil.oc.server.fs.FileSystem$.MODULE$
/*   59 */           .fromMemory((li.cil.oc.Settings$.MODULE$.get().tmpSize() * 1024)), "tmpfs", null, null, 5)) : 
/*   60 */       (Option<ManagedEnvironment>)scala.None$.MODULE$;
/*      */ 
/*      */ 
/*      */     
/*   64 */     (new Enumeration.Value[1])[0] = State$.MODULE$.Stopped(); this.state = (Stack<Enumeration.Value>)scala.collection.mutable.Stack$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Enumeration.Value[1]));
/*      */     
/*   66 */     this.li$cil$oc$server$machine$Machine$$_components = scala.collection.mutable.Map$.MODULE$.empty();
/*      */     
/*   68 */     this.addedComponents = scala.collection.mutable.Set$.MODULE$.empty();
/*      */     
/*   70 */     this.li$cil$oc$server$machine$Machine$$_users = scala.collection.mutable.Set$.MODULE$.empty();
/*      */     
/*   72 */     this.signals = (Queue<Signal>)scala.collection.mutable.Queue$.MODULE$.empty();
/*      */     
/*   74 */     this.maxComponents = 0;
/*      */     
/*   76 */     this.maxCallBudget = 1.0D;
/*      */     
/*   78 */     this.hasMemory = false;
/*      */     
/*   80 */     this.callBudget = 0.0D;
/*      */ 
/*      */     
/*   83 */     this.inSynchronizedCall = false;
/*      */ 
/*      */ 
/*      */     
/*   87 */     this.worldTime = 0L;
/*      */     
/*   89 */     this.uptime = 0L;
/*      */     
/*   91 */     this.cpuTotal = 0L;
/*      */     
/*   93 */     this.cpuStart = 0L;
/*      */     
/*   95 */     this.remainIdle = 0;
/*      */     
/*   97 */     this.remainingPause = 0;
/*      */     
/*   99 */     this.usersChanged = false;
/*      */     
/*  101 */     this.message = (Option<String>)scala.None$.MODULE$;
/*      */     
/*  103 */     this.cost = li.cil.oc.Settings$.MODULE$.get().computerCost() * li.cil.oc.Settings$.MODULE$.get().tickFrequency();
/*      */     
/*  105 */     this.maxSignalQueueSize = li.cil.oc.Settings$.MODULE$.get().maxSignalQueueSize();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  492 */     this.canUpdate = true; } public ComponentConnector node() { return this.node; } public Option<ManagedEnvironment> tmp() { return this.tmp; } public Architecture architecture() { return this.architecture; } public void architecture_$eq(Architecture x$1) { this.architecture = x$1; } public Stack<Enumeration.Value> state() { return this.state; } public Map<String, String> li$cil$oc$server$machine$Machine$$_components() { return this.li$cil$oc$server$machine$Machine$$_components; } private Set<Component> addedComponents() { return this.addedComponents; } public Set<String> li$cil$oc$server$machine$Machine$$_users() { return this.li$cil$oc$server$machine$Machine$$_users; } private Queue<Signal> signals() { return this.signals; } public int maxComponents() { return this.maxComponents; } public void maxComponents_$eq(int x$1) { this.maxComponents = x$1; } private double maxCallBudget() { return this.maxCallBudget; } private void maxCallBudget_$eq(double x$1) { this.maxCallBudget = x$1; } private boolean hasMemory() { return this.hasMemory; } private void hasMemory_$eq(boolean x$1) { this.hasMemory = x$1; } private double callBudget() { return this.callBudget; } private void callBudget_$eq(double x$1) { this.callBudget = x$1; } private boolean inSynchronizedCall() { return this.inSynchronizedCall; } private void inSynchronizedCall_$eq(boolean x$1) { this.inSynchronizedCall = x$1; } public long worldTime() { return this.worldTime; } public void worldTime_$eq(long x$1) { this.worldTime = x$1; } private long uptime() { return this.uptime; } private void uptime_$eq(long x$1) { this.uptime = x$1; } private long cpuTotal() { return this.cpuTotal; } private void cpuTotal_$eq(long x$1) { this.cpuTotal = x$1; } private long cpuStart() { return this.cpuStart; } private void cpuStart_$eq(long x$1) { this.cpuStart = x$1; } private int remainIdle() { return this.remainIdle; } private void remainIdle_$eq(int x$1) { this.remainIdle = x$1; } private int remainingPause() { return this.remainingPause; } private void remainingPause_$eq(int x$1) { this.remainingPause = x$1; } private boolean usersChanged() { return this.usersChanged; } private void usersChanged_$eq(boolean x$1) { this.usersChanged = x$1; } private Option<String> message() { return this.message; } private void message_$eq(Option<String> x$1) { this.message = x$1; } private double cost() { return this.cost; } private void cost_$eq(double x$1) { this.cost = x$1; } private int maxSignalQueueSize() { return this.maxSignalQueueSize; } public void onHostChanged() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   4: invokeinterface internalComponents : ()Ljava/lang/Iterable;
/*      */     //   9: astore_1
/*      */     //   10: aload_0
/*      */     //   11: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*      */     //   14: aload_1
/*      */     //   15: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*      */     //   18: iconst_0
/*      */     //   19: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*      */     //   22: new li/cil/oc/server/machine/Machine$$anonfun$onHostChanged$2
/*      */     //   25: dup
/*      */     //   26: aload_0
/*      */     //   27: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   30: invokeinterface foldLeft : (Ljava/lang/Object;Lscala/Function2;)Ljava/lang/Object;
/*      */     //   35: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*      */     //   38: invokevirtual maxComponents_$eq : (I)V
/*      */     //   41: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*      */     //   44: aload_1
/*      */     //   45: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*      */     //   48: new li/cil/oc/server/machine/Machine$$anonfun$2
/*      */     //   51: dup
/*      */     //   52: aload_0
/*      */     //   53: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   56: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*      */     //   59: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   62: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   67: checkcast scala/collection/TraversableLike
/*      */     //   70: new li/cil/oc/server/machine/Machine$$anonfun$1
/*      */     //   73: dup
/*      */     //   74: aload_0
/*      */     //   75: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   78: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*      */     //   81: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   84: invokeinterface collect : (Lscala/PartialFunction;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   89: checkcast scala/collection/Iterable
/*      */     //   92: astore_2
/*      */     //   93: aload_0
/*      */     //   94: aload_2
/*      */     //   95: invokeinterface isEmpty : ()Z
/*      */     //   100: ifeq -> 107
/*      */     //   103: dconst_1
/*      */     //   104: goto -> 127
/*      */     //   107: aload_2
/*      */     //   108: getstatic scala/math/Numeric$DoubleIsFractional$.MODULE$ : Lscala/math/Numeric$DoubleIsFractional$;
/*      */     //   111: invokeinterface sum : (Lscala/math/Numeric;)Ljava/lang/Object;
/*      */     //   116: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*      */     //   119: aload_2
/*      */     //   120: invokeinterface size : ()I
/*      */     //   125: i2d
/*      */     //   126: ddiv
/*      */     //   127: invokespecial maxCallBudget_$eq : (D)V
/*      */     //   130: aconst_null
/*      */     //   131: invokestatic create : (Ljava/lang/Object;)Lscala/runtime/ObjectRef;
/*      */     //   134: astore_3
/*      */     //   135: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*      */     //   138: aload_1
/*      */     //   139: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*      */     //   142: new li/cil/oc/server/machine/Machine$$anonfun$onHostChanged$3
/*      */     //   145: dup
/*      */     //   146: aload_0
/*      */     //   147: aload_3
/*      */     //   148: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lscala/runtime/ObjectRef;)V
/*      */     //   151: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*      */     //   156: pop
/*      */     //   157: aload_3
/*      */     //   158: getfield elem : Ljava/lang/Object;
/*      */     //   161: checkcast li/cil/oc/api/machine/Architecture
/*      */     //   164: aload_0
/*      */     //   165: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   168: astore #4
/*      */     //   170: dup
/*      */     //   171: ifnonnull -> 183
/*      */     //   174: pop
/*      */     //   175: aload #4
/*      */     //   177: ifnull -> 191
/*      */     //   180: goto -> 197
/*      */     //   183: aload #4
/*      */     //   185: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   188: ifeq -> 197
/*      */     //   191: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   194: goto -> 257
/*      */     //   197: aload_0
/*      */     //   198: dup
/*      */     //   199: astore #5
/*      */     //   201: monitorenter
/*      */     //   202: aload_0
/*      */     //   203: aload_3
/*      */     //   204: getfield elem : Ljava/lang/Object;
/*      */     //   207: checkcast li/cil/oc/api/machine/Architecture
/*      */     //   210: invokevirtual architecture_$eq : (Lli/cil/oc/api/machine/Architecture;)V
/*      */     //   213: aload_0
/*      */     //   214: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   217: ifnull -> 232
/*      */     //   220: aload_0
/*      */     //   221: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   224: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*      */     //   229: ifnonnull -> 238
/*      */     //   232: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   235: goto -> 250
/*      */     //   238: aload_0
/*      */     //   239: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   242: invokeinterface onConnect : ()V
/*      */     //   247: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   250: astore #6
/*      */     //   252: aload #5
/*      */     //   254: monitorexit
/*      */     //   255: aload #6
/*      */     //   257: pop
/*      */     //   258: aload_0
/*      */     //   259: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   262: aload_0
/*      */     //   263: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   266: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   269: new li/cil/oc/server/machine/Machine$$anonfun$onHostChanged$1
/*      */     //   272: dup
/*      */     //   273: aload_0
/*      */     //   274: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   277: new li/cil/oc/server/machine/Machine$$anonfun$onHostChanged$4
/*      */     //   280: dup
/*      */     //   281: aload_0
/*      */     //   282: aload_1
/*      */     //   283: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Ljava/lang/Iterable;)V
/*      */     //   286: invokevirtual fold : (Lscala/Function0;Lscala/Function1;)Ljava/lang/Object;
/*      */     //   289: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   292: invokespecial hasMemory_$eq : (Z)V
/*      */     //   295: return
/*      */     //   296: aload #5
/*      */     //   298: monitorexit
/*      */     //   299: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #110	-> 0
/*      */     //   #111	-> 10
/*      */     //   #118	-> 41
/*      */     //   #121	-> 93
/*      */     //   #122	-> 130
/*      */     //   #123	-> 135
/*      */     //   #146	-> 157
/*      */     //   #147	-> 202
/*      */     //   #148	-> 213
/*      */     //   #146	-> 254
/*      */     //   #150	-> 258
/*      */     //   #146	-> 296
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	300	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   10	285	1	components	Ljava/lang/Iterable;
/*      */     //   93	202	2	callBudgets	Lscala/collection/Iterable;
/*      */     //   135	160	3	newArchitecture	Lscala/runtime/ObjectRef;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   202	255	296	finally } public final class Machine$$anonfun$onHostChanged$2 extends AbstractFunction2<Object, ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int sum, ItemStack item) { // Byte code:
/*      */       //   0: iload_1
/*      */       //   1: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   4: aload_2
/*      */       //   5: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   8: astore_3
/*      */       //   9: aload_3
/*      */       //   10: instanceof scala/Some
/*      */       //   13: ifeq -> 119
/*      */       //   16: aload_3
/*      */       //   17: checkcast scala/Some
/*      */       //   20: astore #4
/*      */       //   22: aload #4
/*      */       //   24: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   27: checkcast net/minecraft/item/ItemStack
/*      */       //   30: astore #5
/*      */       //   32: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   35: aload #5
/*      */       //   37: aload_0
/*      */       //   38: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   41: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */       //   44: invokevirtual getClass : ()Ljava/lang/Class;
/*      */       //   47: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*      */       //   50: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   53: astore #7
/*      */       //   55: aload #7
/*      */       //   57: instanceof scala/Some
/*      */       //   60: ifeq -> 109
/*      */       //   63: aload #7
/*      */       //   65: checkcast scala/Some
/*      */       //   68: astore #8
/*      */       //   70: aload #8
/*      */       //   72: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   75: checkcast li/cil/oc/api/driver/Item
/*      */       //   78: astore #9
/*      */       //   80: aload #9
/*      */       //   82: instanceof li/cil/oc/api/driver/item/Processor
/*      */       //   85: ifeq -> 109
/*      */       //   88: aload #9
/*      */       //   90: checkcast li/cil/oc/api/driver/item/Processor
/*      */       //   93: astore #10
/*      */       //   95: aload #10
/*      */       //   97: aload #5
/*      */       //   99: invokeinterface supportedComponents : (Lnet/minecraft/item/ItemStack;)I
/*      */       //   104: istore #11
/*      */       //   106: goto -> 112
/*      */       //   109: iconst_0
/*      */       //   110: istore #11
/*      */       //   112: iload #11
/*      */       //   114: istore #6
/*      */       //   116: goto -> 122
/*      */       //   119: iconst_0
/*      */       //   120: istore #6
/*      */       //   122: iload #6
/*      */       //   124: iadd
/*      */       //   125: ireturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #111	-> 0
/*      */       //   #112	-> 9
/*      */       //   #113	-> 55
/*      */       //   #114	-> 109
/*      */       //   #112	-> 112
/*      */       //   #116	-> 119
/*      */       //   #111	-> 122
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	126	0	this	Lli/cil/oc/server/machine/Machine$$anonfun$onHostChanged$2;
/*      */       //   0	126	1	sum	I
/*      */       //   0	126	2	item	Lnet/minecraft/item/ItemStack;
/*      */       //   32	94	5	stack	Lnet/minecraft/item/ItemStack;
/*      */       //   80	46	9	driver	Lli/cil/oc/api/driver/Item; } public Machine$$anonfun$onHostChanged$2(Machine $outer) {} } public final class Machine$$anonfun$2 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Option<Item>>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<ItemStack, Option<Item>> apply(ItemStack stack) { return new Tuple2(stack, scala.Option$.MODULE$.apply(Driver.driverFor(stack, this.$outer.host().getClass()))); } public Machine$$anonfun$2(Machine $outer) {} } public final class Machine$$anonfun$1 extends AbstractPartialFunction<Tuple2<ItemStack, Option<Item>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<ItemStack, Option<Item>>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); Option option = (Option)tuple2._2(); if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof CallBudget) { Item item = driver; return (B1)BoxesRunTime.boxToDouble(((CallBudget)item).getCallBudget(stack)); }  }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Option option = (Option)tuple2._2(); if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof CallBudget) return true;  }  }  return false; } public Machine$$anonfun$1(Machine $outer) {} } public final class Machine$$anonfun$onHostChanged$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef newArchitecture$1; public final boolean apply(ItemStack x0$1) { // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: astore_2
/*      */       //   2: aload_2
/*      */       //   3: ifnull -> 263
/*      */       //   6: aload_2
/*      */       //   7: astore_3
/*      */       //   8: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   11: aload_3
/*      */       //   12: aload_0
/*      */       //   13: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   16: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */       //   19: invokevirtual getClass : ()Ljava/lang/Class;
/*      */       //   22: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*      */       //   25: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   28: astore #5
/*      */       //   30: aload #5
/*      */       //   32: instanceof scala/Some
/*      */       //   35: ifeq -> 257
/*      */       //   38: aload #5
/*      */       //   40: checkcast scala/Some
/*      */       //   43: astore #6
/*      */       //   45: aload #6
/*      */       //   47: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   50: checkcast li/cil/oc/api/driver/Item
/*      */       //   53: astore #7
/*      */       //   55: aload #7
/*      */       //   57: instanceof li/cil/oc/api/driver/item/Processor
/*      */       //   60: ifeq -> 257
/*      */       //   63: aload #7
/*      */       //   65: checkcast li/cil/oc/api/driver/item/Processor
/*      */       //   68: astore #8
/*      */       //   70: aload #8
/*      */       //   72: aload_3
/*      */       //   73: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*      */       //   78: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*      */       //   81: invokevirtual CPU : ()Ljava/lang/String;
/*      */       //   84: astore #9
/*      */       //   86: dup
/*      */       //   87: ifnonnull -> 99
/*      */       //   90: pop
/*      */       //   91: aload #9
/*      */       //   93: ifnull -> 107
/*      */       //   96: goto -> 257
/*      */       //   99: aload #9
/*      */       //   101: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   104: ifeq -> 257
/*      */       //   107: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   110: aload #8
/*      */       //   112: aload_3
/*      */       //   113: invokeinterface architecture : (Lnet/minecraft/item/ItemStack;)Ljava/lang/Class;
/*      */       //   118: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   121: astore #11
/*      */       //   123: aload #11
/*      */       //   125: instanceof scala/Some
/*      */       //   128: ifeq -> 251
/*      */       //   131: aload #11
/*      */       //   133: checkcast scala/Some
/*      */       //   136: astore #12
/*      */       //   138: aload #12
/*      */       //   140: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   143: checkcast java/lang/Class
/*      */       //   146: astore #13
/*      */       //   148: aload_0
/*      */       //   149: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   152: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */       //   155: ifnull -> 210
/*      */       //   158: aload_0
/*      */       //   159: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   162: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */       //   165: invokevirtual getClass : ()Ljava/lang/Class;
/*      */       //   168: aload #13
/*      */       //   170: astore #15
/*      */       //   172: dup
/*      */       //   173: ifnonnull -> 185
/*      */       //   176: pop
/*      */       //   177: aload #15
/*      */       //   179: ifnull -> 193
/*      */       //   182: goto -> 210
/*      */       //   185: aload #15
/*      */       //   187: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   190: ifeq -> 210
/*      */       //   193: aload_0
/*      */       //   194: getfield newArchitecture$1 : Lscala/runtime/ObjectRef;
/*      */       //   197: aload_0
/*      */       //   198: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   201: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */       //   204: putfield elem : Ljava/lang/Object;
/*      */       //   207: goto -> 286
/*      */       //   210: aload_0
/*      */       //   211: getfield newArchitecture$1 : Lscala/runtime/ObjectRef;
/*      */       //   214: aload #13
/*      */       //   216: iconst_1
/*      */       //   217: anewarray java/lang/Class
/*      */       //   220: dup
/*      */       //   221: iconst_0
/*      */       //   222: ldc li/cil/oc/api/machine/Machine
/*      */       //   224: aastore
/*      */       //   225: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/*      */       //   228: iconst_1
/*      */       //   229: anewarray java/lang/Object
/*      */       //   232: dup
/*      */       //   233: iconst_0
/*      */       //   234: aload_0
/*      */       //   235: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   238: aastore
/*      */       //   239: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   242: checkcast li/cil/oc/api/machine/Architecture
/*      */       //   245: putfield elem : Ljava/lang/Object;
/*      */       //   248: goto -> 286
/*      */       //   251: iconst_0
/*      */       //   252: istore #14
/*      */       //   254: goto -> 289
/*      */       //   257: iconst_0
/*      */       //   258: istore #10
/*      */       //   260: goto -> 293
/*      */       //   263: iconst_0
/*      */       //   264: istore #4
/*      */       //   266: goto -> 297
/*      */       //   269: astore #16
/*      */       //   271: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */       //   274: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */       //   277: ldc 'Failed instantiating a CPU architecture.'
/*      */       //   279: aload #16
/*      */       //   281: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*      */       //   286: iconst_1
/*      */       //   287: istore #14
/*      */       //   289: iload #14
/*      */       //   291: istore #10
/*      */       //   293: iload #10
/*      */       //   295: istore #4
/*      */       //   297: iload #4
/*      */       //   299: ireturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #123	-> 0
/*      */       //   #124	-> 2
/*      */       //   #125	-> 30
/*      */       //   #126	-> 107
/*      */       //   #127	-> 123
/*      */       //   #128	-> 148
/*      */       //   #135	-> 193
/*      */       //   #129	-> 210
/*      */       //   #138	-> 251
/*      */       //   #140	-> 257
/*      */       //   #142	-> 263
/*      */       //   #132	-> 269
/*      */       //   #128	-> 269
/*      */       //   #137	-> 286
/*      */       //   #127	-> 287
/*      */       //   #126	-> 289
/*      */       //   #124	-> 293
/*      */       //   #123	-> 297
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	300	0	this	Lli/cil/oc/server/machine/Machine$$anonfun$onHostChanged$3;
/*      */       //   0	300	1	x0$1	Lnet/minecraft/item/ItemStack;
/*      */       //   55	245	7	driver	Lli/cil/oc/api/driver/Item;
/*      */       //   148	152	13	clazz	Ljava/lang/Class;
/*      */       // Exception table:
/*      */       //   from	to	target	type
/*  492 */       //   210	251	269	finally } public Machine$$anonfun$onHostChanged$3(Machine $outer, ObjectRef newArchitecture$1) {} } public final class Machine$$anonfun$onHostChanged$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public Machine$$anonfun$onHostChanged$1(Machine $outer) {} } public final class Machine$$anonfun$onHostChanged$4 extends AbstractFunction1<Architecture, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Iterable components$1; public final boolean apply(Architecture x$1) { return x$1.recomputeMemory(this.components$1); } public Machine$$anonfun$onHostChanged$4(Machine $outer, Iterable components$1) {} } public boolean canUpdate() { return this.canUpdate; }
/*      */   public Map<String, String> components() { return scala.collection.convert.WrapAsJava$.MODULE$.mapAsJavaMap((Map)li$cil$oc$server$machine$Machine$$_components()); }
/*      */   public int componentCount() { return (int)(BoxesRunTime.unboxToDouble(li$cil$oc$server$machine$Machine$$_components().foldLeft(BoxesRunTime.boxToDouble(0.0D), (Function2)new Machine$$anonfun$componentCount$1(this))) + BoxesRunTime.unboxToDouble(addedComponents().foldLeft(BoxesRunTime.boxToDouble(0.0D), (Function2)new Machine$$anonfun$componentCount$2(this))) - true); }
/*      */   public final class Machine$$anonfun$componentCount$1 extends AbstractFunction2<Object, Tuple2<String, String>, Object> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final double apply(double acc, Tuple2 entry) { // Byte code:
/*      */       //   0: aload_3
/*      */       //   1: astore #4
/*      */       //   3: aload #4
/*      */       //   5: ifnull -> 59
/*      */       //   8: aload #4
/*      */       //   10: invokevirtual _2 : ()Ljava/lang/Object;
/*      */       //   13: checkcast java/lang/String
/*      */       //   16: astore #5
/*      */       //   18: dload_1
/*      */       //   19: aload #5
/*      */       //   21: ldc 'filesystem'
/*      */       //   23: astore #8
/*      */       //   25: dup
/*      */       //   26: ifnonnull -> 38
/*      */       //   29: pop
/*      */       //   30: aload #8
/*      */       //   32: ifnull -> 46
/*      */       //   35: goto -> 52
/*      */       //   38: aload #8
/*      */       //   40: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   43: ifeq -> 52
/*      */       //   46: ldc2_w 0.25
/*      */       //   49: goto -> 53
/*      */       //   52: dconst_1
/*      */       //   53: dadd
/*      */       //   54: dstore #6
/*      */       //   56: dload #6
/*      */       //   58: dreturn
/*      */       //   59: new scala/MatchError
/*      */       //   62: dup
/*      */       //   63: aload #4
/*      */       //   65: invokespecial <init> : (Ljava/lang/Object;)V
/*      */       //   68: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #155	-> 0
/*      */       //   #156	-> 8
/*      */       //   #155	-> 56
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	69	0	this	Lli/cil/oc/server/machine/Machine$$anonfun$componentCount$1;
/*      */       //   0	69	1	acc	D
/*      */       //   0	69	3	entry	Lscala/Tuple2;
/*      */       //   18	51	5	name	Ljava/lang/String; }
/*      */     public Machine$$anonfun$componentCount$1(Machine $outer) {} }
/*      */   public final class Machine$$anonfun$componentCount$2 extends AbstractFunction2<Object, Component, Object> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final double apply(double acc, Component component) { String str = "filesystem"; if (component.name() == null) { component.name(); if (str != null); } else if (component.name().equals(str)) {  }  }
/*      */     public Machine$$anonfun$componentCount$2(Machine $outer) {} }
/*      */   public String tmpAddress() { return (String)tmp().fold((Function0)new Machine$$anonfun$tmpAddress$1(this), (Function1)new Machine$$anonfun$tmpAddress$2(this)); }
/*      */   public final class Machine$$anonfun$tmpAddress$1 extends AbstractFunction0<String> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final String apply() { return null; }
/*      */     public Machine$$anonfun$tmpAddress$1(Machine $outer) {} }
/*      */   public final class Machine$$anonfun$tmpAddress$2 extends AbstractFunction1<ManagedEnvironment, String> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final String apply(ManagedEnvironment x$2) { return x$2.node().address(); }
/*      */     public Machine$$anonfun$tmpAddress$2(Machine $outer) {} }
/*      */   public String lastError() { return (String)message().orNull(scala.Predef$.MODULE$.$conforms()); }
/*      */   public void setCostPerTick(double value) { cost_$eq(value * li.cil.oc.Settings$.MODULE$.get().tickFrequency()); }
/*      */   public double getCostPerTick() { return cost() / li.cil.oc.Settings$.MODULE$.get().tickFrequency(); }
/*      */   public String[] users() { synchronized (li$cil$oc$server$machine$Machine$$_users()) { Object object = li$cil$oc$server$machine$Machine$$_users().toArray(scala.reflect.ClassTag$.MODULE$.apply(String.class)); return (String[])object; }  }
/*      */   public double upTime() { if (uptime() < 0L) uptime_$eq(worldTime() + uptime());  return uptime() / 20.0D; }
/*      */   public double cpuTime() { return (cpuTotal() + System.nanoTime() - cpuStart()) * 1.0E-9D; }
/*      */   public Map<String, String> getDeviceInfo() { Map map; MachineHost machineHost = host(); if (machineHost instanceof DeviceInfo) { MachineHost machineHost1 = machineHost; map = ((DeviceInfo)machineHost1).getDeviceInfo(); } else { map = null; }  return map; }
/*      */   public boolean canInteract(String player) { if (li.cil.oc.Settings$.MODULE$.get().canComputersBeOwned()) synchronized (li$cil$oc$server$machine$Machine$$_users()) { Boolean bool = BoxesRunTime.boxToBoolean((li$cil$oc$server$machine$Machine$$_users().isEmpty() || li$cil$oc$server$machine$Machine$$_users().contains(player))); if (!BoxesRunTime.unboxToBoolean(bool) && !MinecraftServer.func_71276_C().func_71264_H()) { ServerConfigurationManager config = MinecraftServer.func_71276_C().func_71203_ab(); EntityPlayerMP entity = config.func_152612_a(player); if (!((entity != null && config.func_152596_g(entity.func_146103_bH())) ? 1 : 0)); }  return true; }   return true; }
/*      */   public boolean isRunning() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   17: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   20: astore_3
/*      */     //   21: dup
/*      */     //   22: ifnonnull -> 33
/*      */     //   25: pop
/*      */     //   26: aload_3
/*      */     //   27: ifnull -> 76
/*      */     //   30: goto -> 40
/*      */     //   33: aload_3
/*      */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   37: ifne -> 76
/*      */     //   40: aload_0
/*      */     //   41: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   44: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   47: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   50: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   53: astore #4
/*      */     //   55: dup
/*      */     //   56: ifnonnull -> 68
/*      */     //   59: pop
/*      */     //   60: aload #4
/*      */     //   62: ifnull -> 76
/*      */     //   65: goto -> 80
/*      */     //   68: aload #4
/*      */     //   70: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   73: ifeq -> 80
/*      */     //   76: iconst_0
/*      */     //   77: goto -> 81
/*      */     //   80: iconst_1
/*      */     //   81: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   84: astore_2
/*      */     //   85: aload_1
/*      */     //   86: monitorexit
/*      */     //   87: aload_2
/*      */     //   88: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   91: ireturn
/*      */     //   92: aload_1
/*      */     //   93: monitorexit
/*      */     //   94: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #199	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	95	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	87	92	finally }
/*      */   public boolean isPaused() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   17: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   20: astore_3
/*      */     //   21: dup
/*      */     //   22: ifnonnull -> 33
/*      */     //   25: pop
/*      */     //   26: aload_3
/*      */     //   27: ifnull -> 40
/*      */     //   30: goto -> 52
/*      */     //   33: aload_3
/*      */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   37: ifeq -> 52
/*      */     //   40: aload_0
/*      */     //   41: invokespecial remainingPause : ()I
/*      */     //   44: iconst_0
/*      */     //   45: if_icmple -> 52
/*      */     //   48: iconst_1
/*      */     //   49: goto -> 53
/*      */     //   52: iconst_0
/*      */     //   53: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   56: astore_2
/*      */     //   57: aload_1
/*      */     //   58: monitorexit
/*      */     //   59: aload_2
/*      */     //   60: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   63: ireturn
/*      */     //   64: aload_1
/*      */     //   65: monitorexit
/*      */     //   66: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #201	-> 0
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	67	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	59	64	finally }
/*      */   public boolean start() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: checkcast scala/Enumeration$Value
/*      */     //   17: astore_3
/*      */     //   18: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   21: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   24: aload_3
/*      */     //   25: astore #4
/*      */     //   27: dup
/*      */     //   28: ifnonnull -> 40
/*      */     //   31: pop
/*      */     //   32: aload #4
/*      */     //   34: ifnull -> 48
/*      */     //   37: goto -> 259
/*      */     //   40: aload #4
/*      */     //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   45: ifeq -> 259
/*      */     //   48: aload_0
/*      */     //   49: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   52: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*      */     //   57: ifnull -> 259
/*      */     //   60: aload_0
/*      */     //   61: invokevirtual onHostChanged : ()V
/*      */     //   64: aload_0
/*      */     //   65: invokespecial processAddedComponents : ()V
/*      */     //   68: aload_0
/*      */     //   69: invokespecial verifyComponents : ()V
/*      */     //   72: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*      */     //   75: invokevirtual get : ()Lli/cil/oc/Settings;
/*      */     //   78: invokevirtual ignorePower : ()Z
/*      */     //   81: ifne -> 113
/*      */     //   84: aload_0
/*      */     //   85: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   88: invokeinterface globalBuffer : ()D
/*      */     //   93: aload_0
/*      */     //   94: invokespecial cost : ()D
/*      */     //   97: dcmpg
/*      */     //   98: ifge -> 113
/*      */     //   101: aload_0
/*      */     //   102: ldc_w 'gui.Error.NoEnergy'
/*      */     //   105: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   108: pop
/*      */     //   109: iconst_0
/*      */     //   110: goto -> 254
/*      */     //   113: aload_0
/*      */     //   114: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   117: ifnull -> 128
/*      */     //   120: aload_0
/*      */     //   121: invokevirtual maxComponents : ()I
/*      */     //   124: iconst_0
/*      */     //   125: if_icmpne -> 147
/*      */     //   128: aload_0
/*      */     //   129: ldc_w '-'
/*      */     //   132: invokevirtual beep : (Ljava/lang/String;)V
/*      */     //   135: aload_0
/*      */     //   136: ldc_w 'gui.Error.NoCPU'
/*      */     //   139: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   142: pop
/*      */     //   143: iconst_0
/*      */     //   144: goto -> 254
/*      */     //   147: aload_0
/*      */     //   148: invokevirtual componentCount : ()I
/*      */     //   151: aload_0
/*      */     //   152: invokevirtual maxComponents : ()I
/*      */     //   155: if_icmple -> 177
/*      */     //   158: aload_0
/*      */     //   159: ldc_w '-..'
/*      */     //   162: invokevirtual beep : (Ljava/lang/String;)V
/*      */     //   165: aload_0
/*      */     //   166: ldc_w 'gui.Error.ComponentOverflow'
/*      */     //   169: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   172: pop
/*      */     //   173: iconst_0
/*      */     //   174: goto -> 254
/*      */     //   177: aload_0
/*      */     //   178: invokespecial hasMemory : ()Z
/*      */     //   181: ifeq -> 238
/*      */     //   184: aload_0
/*      */     //   185: invokespecial init : ()Z
/*      */     //   188: ifeq -> 227
/*      */     //   191: aload_0
/*      */     //   192: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   195: invokevirtual Starting : ()Lscala/Enumeration$Value;
/*      */     //   198: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   201: pop
/*      */     //   202: aload_0
/*      */     //   203: lconst_0
/*      */     //   204: invokespecial uptime_$eq : (J)V
/*      */     //   207: aload_0
/*      */     //   208: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   211: ldc_w 'computer.started'
/*      */     //   214: iconst_0
/*      */     //   215: anewarray java/lang/Object
/*      */     //   218: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*      */     //   223: iconst_1
/*      */     //   224: goto -> 254
/*      */     //   227: aload_0
/*      */     //   228: ldc_w '--'
/*      */     //   231: invokevirtual beep : (Ljava/lang/String;)V
/*      */     //   234: iconst_0
/*      */     //   235: goto -> 254
/*      */     //   238: aload_0
/*      */     //   239: ldc_w '-.'
/*      */     //   242: invokevirtual beep : (Ljava/lang/String;)V
/*      */     //   245: aload_0
/*      */     //   246: ldc_w 'gui.Error.NoRAM'
/*      */     //   249: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   252: pop
/*      */     //   253: iconst_0
/*      */     //   254: istore #5
/*      */     //   256: goto -> 374
/*      */     //   259: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   262: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   265: aload_3
/*      */     //   266: astore #6
/*      */     //   268: dup
/*      */     //   269: ifnonnull -> 281
/*      */     //   272: pop
/*      */     //   273: aload #6
/*      */     //   275: ifnull -> 289
/*      */     //   278: goto -> 317
/*      */     //   281: aload #6
/*      */     //   283: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   286: ifeq -> 317
/*      */     //   289: aload_0
/*      */     //   290: invokespecial remainingPause : ()I
/*      */     //   293: iconst_0
/*      */     //   294: if_icmple -> 317
/*      */     //   297: aload_0
/*      */     //   298: iconst_0
/*      */     //   299: invokespecial remainingPause_$eq : (I)V
/*      */     //   302: aload_0
/*      */     //   303: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   306: invokeinterface markChanged : ()V
/*      */     //   311: iconst_1
/*      */     //   312: istore #5
/*      */     //   314: goto -> 374
/*      */     //   317: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   320: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   323: aload_3
/*      */     //   324: astore #7
/*      */     //   326: dup
/*      */     //   327: ifnonnull -> 339
/*      */     //   330: pop
/*      */     //   331: aload #7
/*      */     //   333: ifnull -> 347
/*      */     //   336: goto -> 371
/*      */     //   339: aload #7
/*      */     //   341: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   344: ifeq -> 371
/*      */     //   347: aload_0
/*      */     //   348: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   351: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   354: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   357: pop
/*      */     //   358: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*      */     //   361: aload_0
/*      */     //   362: invokevirtual unscheduleClose : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   365: iconst_1
/*      */     //   366: istore #5
/*      */     //   368: goto -> 374
/*      */     //   371: iconst_0
/*      */     //   372: istore #5
/*      */     //   374: iload #5
/*      */     //   376: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   379: astore_2
/*      */     //   380: aload_1
/*      */     //   381: monitorexit
/*      */     //   382: aload_2
/*      */     //   383: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   386: ireturn
/*      */     //   387: aload_1
/*      */     //   388: monitorexit
/*      */     //   389: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #203	-> 0
/*      */     //   #204	-> 18
/*      */     //   #205	-> 60
/*      */     //   #206	-> 64
/*      */     //   #207	-> 68
/*      */     //   #208	-> 72
/*      */     //   #210	-> 101
/*      */     //   #211	-> 109
/*      */     //   #213	-> 113
/*      */     //   #214	-> 128
/*      */     //   #215	-> 135
/*      */     //   #216	-> 143
/*      */     //   #218	-> 147
/*      */     //   #219	-> 158
/*      */     //   #220	-> 165
/*      */     //   #221	-> 173
/*      */     //   #223	-> 177
/*      */     //   #228	-> 184
/*      */     //   #233	-> 191
/*      */     //   #234	-> 202
/*      */     //   #235	-> 207
/*      */     //   #236	-> 223
/*      */     //   #229	-> 227
/*      */     //   #230	-> 234
/*      */     //   #224	-> 238
/*      */     //   #225	-> 245
/*      */     //   #226	-> 253
/*      */     //   #204	-> 254
/*      */     //   #238	-> 259
/*      */     //   #239	-> 297
/*      */     //   #240	-> 302
/*      */     //   #241	-> 311
/*      */     //   #238	-> 312
/*      */     //   #242	-> 317
/*      */     //   #243	-> 347
/*      */     //   #244	-> 358
/*      */     //   #245	-> 365
/*      */     //   #242	-> 366
/*      */     //   #247	-> 371
/*      */     //   #203	-> 374
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	390	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	382	387	finally }
/*      */   public boolean pause(double seconds) { // Byte code:
/*      */     //   0: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*      */     //   3: dload_1
/*      */     //   4: bipush #20
/*      */     //   6: i2d
/*      */     //   7: dmul
/*      */     //   8: d2i
/*      */     //   9: iconst_0
/*      */     //   10: invokevirtual max : (II)I
/*      */     //   13: istore_3
/*      */     //   14: aload_0
/*      */     //   15: aload_0
/*      */     //   16: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   19: dup
/*      */     //   20: astore #4
/*      */     //   22: monitorenter
/*      */     //   23: aload_0
/*      */     //   24: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   27: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   30: astore #5
/*      */     //   32: aload #4
/*      */     //   34: monitorexit
/*      */     //   35: aload #5
/*      */     //   37: checkcast scala/Enumeration$Value
/*      */     //   40: iload_3
/*      */     //   41: invokespecial shouldPause$1 : (Lscala/Enumeration$Value;I)Z
/*      */     //   44: ifeq -> 203
/*      */     //   47: aload_0
/*      */     //   48: dup
/*      */     //   49: astore #6
/*      */     //   51: monitorenter
/*      */     //   52: aload_0
/*      */     //   53: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   56: dup
/*      */     //   57: astore #8
/*      */     //   59: monitorenter
/*      */     //   60: aload_0
/*      */     //   61: aload_0
/*      */     //   62: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   65: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   68: checkcast scala/Enumeration$Value
/*      */     //   71: iload_3
/*      */     //   72: invokespecial shouldPause$1 : (Lscala/Enumeration$Value;I)Z
/*      */     //   75: ifeq -> 183
/*      */     //   78: aload_0
/*      */     //   79: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   82: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   85: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   88: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   91: astore #10
/*      */     //   93: dup
/*      */     //   94: ifnonnull -> 106
/*      */     //   97: pop
/*      */     //   98: aload #10
/*      */     //   100: ifnull -> 114
/*      */     //   103: goto -> 120
/*      */     //   106: aload #10
/*      */     //   108: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 120
/*      */     //   114: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   117: goto -> 160
/*      */     //   120: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   123: aload_0
/*      */     //   124: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   127: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   130: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   133: invokevirtual contains : (Ljava/lang/Object;)Z
/*      */     //   136: ifeq -> 143
/*      */     //   139: iconst_0
/*      */     //   140: goto -> 144
/*      */     //   143: iconst_1
/*      */     //   144: invokevirtual assert : (Z)V
/*      */     //   147: aload_0
/*      */     //   148: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   151: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   154: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   157: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   160: pop
/*      */     //   161: aload_0
/*      */     //   162: iload_3
/*      */     //   163: invokespecial remainingPause_$eq : (I)V
/*      */     //   166: aload_0
/*      */     //   167: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   170: invokeinterface markChanged : ()V
/*      */     //   175: iconst_1
/*      */     //   176: aload #8
/*      */     //   178: monitorexit
/*      */     //   179: aload #6
/*      */     //   181: monitorexit
/*      */     //   182: ireturn
/*      */     //   183: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   186: astore #9
/*      */     //   188: aload #8
/*      */     //   190: monitorexit
/*      */     //   191: aload #9
/*      */     //   193: astore #7
/*      */     //   195: aload #6
/*      */     //   197: monitorexit
/*      */     //   198: aload #7
/*      */     //   200: goto -> 206
/*      */     //   203: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   206: pop
/*      */     //   207: iconst_0
/*      */     //   208: ireturn
/*      */     //   209: aload #4
/*      */     //   211: monitorexit
/*      */     //   212: athrow
/*      */     //   213: aload #8
/*      */     //   215: monitorexit
/*      */     //   216: athrow
/*      */     //   217: aload #6
/*      */     //   219: monitorexit
/*      */     //   220: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #251	-> 0
/*      */     //   #257	-> 14
/*      */     //   #259	-> 47
/*      */     //   #260	-> 78
/*      */     //   #261	-> 120
/*      */     //   #262	-> 147
/*      */     //   #260	-> 160
/*      */     //   #264	-> 161
/*      */     //   #265	-> 166
/*      */     //   #266	-> 175
/*      */     //   #259	-> 183
/*      */     //   #257	-> 203
/*      */     //   #269	-> 207
/*      */     //   #257	-> 209
/*      */     //   #259	-> 213
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	221	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	221	1	seconds	D
/*      */     //   14	194	3	ticksToPause	I
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   23	35	209	finally
/*      */     //   52	198	217	finally
/*      */     //   60	191	213	finally
/*      */     //   213	217	217	finally }
/*      */   private final boolean shouldPause$1(Enumeration.Value state, int ticksToPause$1) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: astore_3
/*      */     //   2: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   5: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   8: aload_3
/*      */     //   9: astore #4
/*      */     //   11: dup
/*      */     //   12: ifnonnull -> 24
/*      */     //   15: pop
/*      */     //   16: aload #4
/*      */     //   18: ifnull -> 32
/*      */     //   21: goto -> 38
/*      */     //   24: aload #4
/*      */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   29: ifeq -> 38
/*      */     //   32: iconst_1
/*      */     //   33: istore #5
/*      */     //   35: goto -> 77
/*      */     //   38: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   41: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   44: aload_3
/*      */     //   45: astore #6
/*      */     //   47: dup
/*      */     //   48: ifnonnull -> 60
/*      */     //   51: pop
/*      */     //   52: aload #6
/*      */     //   54: ifnull -> 68
/*      */     //   57: goto -> 74
/*      */     //   60: aload #6
/*      */     //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 74
/*      */     //   68: iconst_1
/*      */     //   69: istore #5
/*      */     //   71: goto -> 77
/*      */     //   74: iconst_0
/*      */     //   75: istore #5
/*      */     //   77: iload #5
/*      */     //   79: ifeq -> 88
/*      */     //   82: iconst_0
/*      */     //   83: istore #7
/*      */     //   85: goto -> 135
/*      */     //   88: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   91: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   94: aload_3
/*      */     //   95: astore #8
/*      */     //   97: dup
/*      */     //   98: ifnonnull -> 110
/*      */     //   101: pop
/*      */     //   102: aload #8
/*      */     //   104: ifnull -> 118
/*      */     //   107: goto -> 132
/*      */     //   110: aload #8
/*      */     //   112: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   115: ifeq -> 132
/*      */     //   118: iload_2
/*      */     //   119: aload_0
/*      */     //   120: invokespecial remainingPause : ()I
/*      */     //   123: if_icmpgt -> 132
/*      */     //   126: iconst_0
/*      */     //   127: istore #7
/*      */     //   129: goto -> 135
/*      */     //   132: iconst_1
/*      */     //   133: istore #7
/*      */     //   135: iload #7
/*      */     //   137: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #252	-> 0
/*      */     //   #253	-> 2
/*      */     //   #254	-> 88
/*      */     //   #255	-> 132
/*      */     //   #252	-> 135
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	138	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	138	1	state	Lscala/Enumeration$Value;
/*      */     //   0	138	2	ticksToPause$1	I }
/*      */   public boolean stop() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual headOption : ()Lscala/Option;
/*      */     //   14: astore_3
/*      */     //   15: aload_3
/*      */     //   16: instanceof scala/Some
/*      */     //   19: ifeq -> 126
/*      */     //   22: aload_3
/*      */     //   23: checkcast scala/Some
/*      */     //   26: astore #4
/*      */     //   28: aload #4
/*      */     //   30: invokevirtual x : ()Ljava/lang/Object;
/*      */     //   33: checkcast scala/Enumeration$Value
/*      */     //   36: astore #5
/*      */     //   38: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   41: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   44: aload #5
/*      */     //   46: astore #6
/*      */     //   48: dup
/*      */     //   49: ifnonnull -> 61
/*      */     //   52: pop
/*      */     //   53: aload #6
/*      */     //   55: ifnull -> 69
/*      */     //   58: goto -> 75
/*      */     //   61: aload #6
/*      */     //   63: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   66: ifeq -> 75
/*      */     //   69: iconst_1
/*      */     //   70: istore #7
/*      */     //   72: goto -> 115
/*      */     //   75: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   78: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   81: aload #5
/*      */     //   83: astore #8
/*      */     //   85: dup
/*      */     //   86: ifnonnull -> 98
/*      */     //   89: pop
/*      */     //   90: aload #8
/*      */     //   92: ifnull -> 106
/*      */     //   95: goto -> 112
/*      */     //   98: aload #8
/*      */     //   100: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   103: ifeq -> 112
/*      */     //   106: iconst_1
/*      */     //   107: istore #7
/*      */     //   109: goto -> 115
/*      */     //   112: iconst_0
/*      */     //   113: istore #7
/*      */     //   115: iload #7
/*      */     //   117: ifeq -> 126
/*      */     //   120: iconst_0
/*      */     //   121: istore #9
/*      */     //   123: goto -> 150
/*      */     //   126: aload_0
/*      */     //   127: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   130: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   133: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   136: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   139: pop
/*      */     //   140: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*      */     //   143: aload_0
/*      */     //   144: invokevirtual scheduleClose : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   147: iconst_1
/*      */     //   148: istore #9
/*      */     //   150: iload #9
/*      */     //   152: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   155: astore_2
/*      */     //   156: aload_1
/*      */     //   157: monitorexit
/*      */     //   158: aload_2
/*      */     //   159: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   162: ireturn
/*      */     //   163: aload_1
/*      */     //   164: monitorexit
/*      */     //   165: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #272	-> 0
/*      */     //   #273	-> 15
/*      */     //   #274	-> 120
/*      */     //   #276	-> 126
/*      */     //   #277	-> 140
/*      */     //   #278	-> 147
/*      */     //   #275	-> 148
/*      */     //   #272	-> 150
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	166	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	158	163	finally }
/*      */   public void consumeCallBudget(double callCost) { if (architecture().isInitialized() && !inSynchronizedCall()) { double clampedCost = scala.math.package$.MODULE$.max(0.0D, callCost); if (clampedCost > callBudget()) throw new LimitReachedException();  callBudget_$eq(callBudget() - clampedCost); }  }
/*      */   public void beep(short frequency, short duration) { li.cil.oc.server.PacketSender$.MODULE$.sendSound(host().world(), host().xPosition(), host().yPosition(), host().zPosition(), frequency, duration); }
/*      */   public void beep(String pattern) { li.cil.oc.server.PacketSender$.MODULE$.sendSound(host().world(), host().xPosition(), host().yPosition(), host().zPosition(), pattern); }
/*      */   public boolean crash(String message) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   4: aload_1
/*      */     //   5: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   8: invokespecial message_$eq : (Lscala/Option;)V
/*      */     //   11: aload_0
/*      */     //   12: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   15: dup
/*      */     //   16: astore_2
/*      */     //   17: monitorenter
/*      */     //   18: aload_0
/*      */     //   19: invokevirtual stop : ()Z
/*      */     //   22: istore #4
/*      */     //   24: aload_0
/*      */     //   25: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   28: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   31: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   34: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   37: astore #5
/*      */     //   39: dup
/*      */     //   40: ifnonnull -> 52
/*      */     //   43: pop
/*      */     //   44: aload #5
/*      */     //   46: ifnull -> 60
/*      */     //   49: goto -> 83
/*      */     //   52: aload #5
/*      */     //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   57: ifeq -> 83
/*      */     //   60: aload_0
/*      */     //   61: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   64: invokevirtual clear : ()V
/*      */     //   67: aload_0
/*      */     //   68: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   71: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   74: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   77: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   80: goto -> 86
/*      */     //   83: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   86: pop
/*      */     //   87: iload #4
/*      */     //   89: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   92: astore_3
/*      */     //   93: aload_2
/*      */     //   94: monitorexit
/*      */     //   95: aload_3
/*      */     //   96: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   99: ireturn
/*      */     //   100: aload_2
/*      */     //   101: monitorexit
/*      */     //   102: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #300	-> 0
/*      */     //   #301	-> 11
/*      */     //   #302	-> 18
/*      */     //   #303	-> 24
/*      */     //   #305	-> 60
/*      */     //   #306	-> 67
/*      */     //   #303	-> 83
/*      */     //   #308	-> 87
/*      */     //   #301	-> 94
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	103	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	103	1	message	Ljava/lang/String;
/*      */     //   24	68	4	result	Z
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   18	95	100	finally }
/*      */   public Object convertArg(Object param) { Object object1; Object object = param; if (object instanceof Boolean) { Boolean bool = (Boolean)object; } else if (object instanceof Character) { Character character = (Character)object; object1 = Integer.valueOf(scala.Predef$.MODULE$.Character2char(character)); } else if (object instanceof Byte) { Byte byte_ = (Byte)object; } else if (object instanceof Short) { Short short_ = (Short)object; } else if (object instanceof Integer) { Integer integer = (Integer)object; } else if (object instanceof Long) { Long long_ = (Long)object; } else if (object instanceof Number) { Number number = (Number)object; object1 = BoxesRunTime.boxToDouble(number.doubleValue()); } else if (object instanceof String) { String str = (String)object; } else if (object instanceof byte[]) { byte[] arrayOfByte = (byte[])object; } else if (object instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)object; } else { li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringBuilder()).append("Trying to push signal with an unsupported argument of type ").append(object.getClass().getName()).toString()); object1 = null; }  return object1; }
/*      */   public boolean signal(String name, Seq args) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_3
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: checkcast scala/Enumeration$Value
/*      */     //   17: astore #4
/*      */     //   19: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   22: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   25: aload #4
/*      */     //   27: astore #5
/*      */     //   29: dup
/*      */     //   30: ifnonnull -> 42
/*      */     //   33: pop
/*      */     //   34: aload #5
/*      */     //   36: ifnull -> 50
/*      */     //   39: goto -> 56
/*      */     //   42: aload #5
/*      */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   47: ifeq -> 56
/*      */     //   50: iconst_1
/*      */     //   51: istore #6
/*      */     //   53: goto -> 96
/*      */     //   56: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   59: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   62: aload #4
/*      */     //   64: astore #7
/*      */     //   66: dup
/*      */     //   67: ifnonnull -> 79
/*      */     //   70: pop
/*      */     //   71: aload #7
/*      */     //   73: ifnull -> 87
/*      */     //   76: goto -> 93
/*      */     //   79: aload #7
/*      */     //   81: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   84: ifeq -> 93
/*      */     //   87: iconst_1
/*      */     //   88: istore #6
/*      */     //   90: goto -> 96
/*      */     //   93: iconst_0
/*      */     //   94: istore #6
/*      */     //   96: iload #6
/*      */     //   98: ifeq -> 105
/*      */     //   101: iconst_0
/*      */     //   102: aload_3
/*      */     //   103: monitorexit
/*      */     //   104: ireturn
/*      */     //   105: aload_0
/*      */     //   106: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   109: dup
/*      */     //   110: astore #9
/*      */     //   112: monitorenter
/*      */     //   113: aload_0
/*      */     //   114: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   117: invokevirtual size : ()I
/*      */     //   120: aload_0
/*      */     //   121: invokespecial maxSignalQueueSize : ()I
/*      */     //   124: if_icmplt -> 134
/*      */     //   127: iconst_0
/*      */     //   128: aload #9
/*      */     //   130: monitorexit
/*      */     //   131: aload_3
/*      */     //   132: monitorexit
/*      */     //   133: ireturn
/*      */     //   134: aload_2
/*      */     //   135: ifnonnull -> 190
/*      */     //   138: aload_0
/*      */     //   139: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   142: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   145: iconst_1
/*      */     //   146: anewarray li/cil/oc/server/machine/Machine$Signal
/*      */     //   149: dup
/*      */     //   150: iconst_0
/*      */     //   151: new li/cil/oc/server/machine/Machine$Signal
/*      */     //   154: dup
/*      */     //   155: aload_1
/*      */     //   156: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*      */     //   159: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*      */     //   162: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*      */     //   165: invokevirtual empty : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*      */     //   168: checkcast [Ljava/lang/Object;
/*      */     //   171: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
/*      */     //   174: aastore
/*      */     //   175: checkcast [Ljava/lang/Object;
/*      */     //   178: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */     //   181: invokevirtual enqueue : (Lscala/collection/Seq;)V
/*      */     //   184: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   187: goto -> 261
/*      */     //   190: aload_0
/*      */     //   191: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   194: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   197: iconst_1
/*      */     //   198: anewarray li/cil/oc/server/machine/Machine$Signal
/*      */     //   201: dup
/*      */     //   202: iconst_0
/*      */     //   203: new li/cil/oc/server/machine/Machine$Signal
/*      */     //   206: dup
/*      */     //   207: aload_1
/*      */     //   208: aload_2
/*      */     //   209: new li/cil/oc/server/machine/Machine$$anonfun$signal$1
/*      */     //   212: dup
/*      */     //   213: aload_0
/*      */     //   214: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   217: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*      */     //   220: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   223: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   228: checkcast scala/collection/TraversableOnce
/*      */     //   231: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*      */     //   234: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*      */     //   237: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*      */     //   242: checkcast [Ljava/lang/Object;
/*      */     //   245: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
/*      */     //   248: aastore
/*      */     //   249: checkcast [Ljava/lang/Object;
/*      */     //   252: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */     //   255: invokevirtual enqueue : (Lscala/collection/Seq;)V
/*      */     //   258: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   261: astore #10
/*      */     //   263: aload #9
/*      */     //   265: monitorexit
/*      */     //   266: aload #10
/*      */     //   268: checkcast scala/runtime/BoxedUnit
/*      */     //   271: astore #8
/*      */     //   273: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   276: pop
/*      */     //   277: aload_3
/*      */     //   278: monitorexit
/*      */     //   279: aload_0
/*      */     //   280: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   283: ifnull -> 295
/*      */     //   286: aload_0
/*      */     //   287: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   290: invokeinterface onSignal : ()V
/*      */     //   295: iconst_1
/*      */     //   296: ireturn
/*      */     //   297: aload #9
/*      */     //   299: monitorexit
/*      */     //   300: athrow
/*      */     //   301: aload_3
/*      */     //   302: monitorexit
/*      */     //   303: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #331	-> 0
/*      */     //   #332	-> 19
/*      */     //   #333	-> 105
/*      */     //   #334	-> 113
/*      */     //   #335	-> 134
/*      */     //   #336	-> 138
/*      */     //   #339	-> 190
/*      */     //   #357	-> 231
/*      */     //   #339	-> 245
/*      */     //   #333	-> 265
/*      */     //   #331	-> 273
/*      */     //   #362	-> 279
/*      */     //   #363	-> 295
/*      */     //   #333	-> 297
/*      */     //   #331	-> 301
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	304	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	304	1	name	Ljava/lang/String;
/*      */     //   0	304	2	args	Lscala/collection/Seq;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	279	301	finally
/*      */     //   113	266	297	finally
/*      */     //   297	301	301	finally }
/*      */   public final class Machine$$anonfun$signal$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final Object apply(Object x0$2) { boolean bool; Object object2, object1 = x0$2; if (object1 == null) { bool = true; } else if (scala.Unit$.MODULE$.equals(object1)) { bool = true; } else if (scala.None$.MODULE$.equals(object1)) { bool = true; } else { bool = false; }  if (bool) { object2 = null; } else { if (object1 instanceof Map) { Map map = (Map)object1; if (map.isEmpty() || (((Tuple2)map.head())._1() instanceof String && ((Tuple2)map.head())._2() instanceof String)) return map;  }  if (object1 instanceof Map) { Map map = (Map)object1; if (map.isEmpty() || (((Tuple2)map.head())._1() instanceof String && ((Tuple2)map.head())._2() instanceof String))
/*      */             return map.toMap(scala.Predef$.MODULE$.$conforms());  }  if (object1 instanceof Map) { Map map = (Map)object1; HashMap convertedMap = new HashMap(); scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map).withFilter((Function1)new Machine$$anonfun$signal$1$$anonfun$apply$1(this)).foreach((Function1)new Machine$$anonfun$signal$1$$anonfun$apply$2(this, convertedMap)); object2 = convertedMap; } else { object2 = this.$outer.convertArg(object1); }  }  return object2; }
/*      */     public Machine$$anonfun$signal$1(Machine $outer) {}
/*      */     public final class Machine$$anonfun$signal$1$$anonfun$apply$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*      */       public static final long serialVersionUID = 0L;
/*      */       public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; }
/*      */       public Machine$$anonfun$signal$1$$anonfun$apply$1(Machine$$anonfun$signal$1 $outer) {} }
/*      */     public final class Machine$$anonfun$signal$1$$anonfun$apply$2 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*      */       public static final long serialVersionUID = 0L;
/*      */       private final HashMap convertedMap$1;
/*      */       public final Object apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); Object convertedKey = this.$outer.li$cil$oc$server$machine$Machine$$anonfun$$$outer().convertArg(key); Object convertedValue = this.$outer.li$cil$oc$server$machine$Machine$$anonfun$$$outer().convertArg(value); return (convertedKey == null) ? BoxedUnit.UNIT : ((convertedValue == null) ? BoxedUnit.UNIT : this.convertedMap$1.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(convertedKey), convertedValue))); }  throw new MatchError(tuple2); }
/*      */       public Machine$$anonfun$signal$1$$anonfun$apply$2(Machine$$anonfun$signal$1 $outer, HashMap convertedMap$1) {} } }
/*      */   public Signal popSignal() { synchronized (signals()) { return signals().isEmpty() ? null : ((Signal)signals().dequeue()).convert(); }  }
/*      */   public Map<String, Callback> methods(Object value) { return scala.collection.convert.WrapAsJava$.MODULE$.mapAsJavaMap((Map)Callbacks$.MODULE$.apply(value).map((Function1)new Machine$$anonfun$methods$1(this), scala.collection.immutable.Map$.MODULE$.canBuildFrom())); }
/*      */   public final class Machine$$anonfun$methods$1 extends AbstractFunction1<Tuple2<String, Callbacks.Callback>, Tuple2<String, Callback>> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public Machine$$anonfun$methods$1(Machine $outer) {} public final Tuple2<String, Callback> apply(Tuple2 entry) { Tuple2 tuple2 = entry; if (tuple2 != null) { String name = (String)tuple2._1(); Callbacks.Callback callback = (Callbacks.Callback)tuple2._2(); Tuple2 tuple22 = new Tuple2(name, callback), tuple21 = tuple22; String str1 = (String)tuple21._1(); Callbacks.Callback callback1 = (Callbacks.Callback)tuple21._2(); return scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(str1), callback1.annotation()); }  throw new MatchError(tuple2); } } public Object[] invoke(String address, String method, Object[] args) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   4: ifnull -> 19
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   11: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*      */     //   16: ifnonnull -> 27
/*      */     //   19: new li/cil/oc/api/machine/LimitReachedException
/*      */     //   22: dup
/*      */     //   23: invokespecial <init> : ()V
/*      */     //   26: athrow
/*      */     //   27: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   30: aload_0
/*      */     //   31: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   34: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*      */     //   39: aload_1
/*      */     //   40: invokeinterface node : (Ljava/lang/String;)Lli/cil/oc/api/network/Node;
/*      */     //   45: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   48: astore #4
/*      */     //   50: aload #4
/*      */     //   52: instanceof scala/Some
/*      */     //   55: ifeq -> 188
/*      */     //   58: aload #4
/*      */     //   60: checkcast scala/Some
/*      */     //   63: astore #5
/*      */     //   65: aload #5
/*      */     //   67: invokevirtual x : ()Ljava/lang/Object;
/*      */     //   70: checkcast li/cil/oc/api/network/Node
/*      */     //   73: astore #6
/*      */     //   75: aload #6
/*      */     //   77: instanceof li/cil/oc/server/network/Component
/*      */     //   80: ifeq -> 188
/*      */     //   83: aload #6
/*      */     //   85: checkcast li/cil/oc/server/network/Component
/*      */     //   88: astore #7
/*      */     //   90: aload #7
/*      */     //   92: aload_0
/*      */     //   93: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   96: invokeinterface canBeSeenFrom : (Lli/cil/oc/api/network/Node;)Z
/*      */     //   101: ifne -> 133
/*      */     //   104: aload #7
/*      */     //   106: aload_0
/*      */     //   107: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   110: astore #8
/*      */     //   112: dup
/*      */     //   113: ifnonnull -> 125
/*      */     //   116: pop
/*      */     //   117: aload #8
/*      */     //   119: ifnull -> 133
/*      */     //   122: goto -> 188
/*      */     //   125: aload #8
/*      */     //   127: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   130: ifeq -> 188
/*      */     //   133: aload #7
/*      */     //   135: aload_2
/*      */     //   136: invokeinterface annotation : (Ljava/lang/String;)Lli/cil/oc/api/machine/Callback;
/*      */     //   141: astore #10
/*      */     //   143: aload #10
/*      */     //   145: invokeinterface direct : ()Z
/*      */     //   150: ifeq -> 167
/*      */     //   153: aload_0
/*      */     //   154: dconst_1
/*      */     //   155: aload #10
/*      */     //   157: invokeinterface limit : ()I
/*      */     //   162: i2d
/*      */     //   163: ddiv
/*      */     //   164: invokevirtual consumeCallBudget : (D)V
/*      */     //   167: aload #7
/*      */     //   169: aload_2
/*      */     //   170: aload_0
/*      */     //   171: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   174: aload_3
/*      */     //   175: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */     //   178: invokeinterface invoke : (Ljava/lang/String;Lli/cil/oc/api/machine/Context;Lscala/collection/Seq;)[Ljava/lang/Object;
/*      */     //   183: astore #9
/*      */     //   185: aload #9
/*      */     //   187: areturn
/*      */     //   188: new java/lang/IllegalArgumentException
/*      */     //   191: dup
/*      */     //   192: ldc_w 'no such component'
/*      */     //   195: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   198: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #374	-> 0
/*      */     //   #388	-> 19
/*      */     //   #375	-> 27
/*      */     //   #376	-> 50
/*      */     //   #377	-> 133
/*      */     //   #378	-> 143
/*      */     //   #379	-> 153
/*      */     //   #381	-> 167
/*      */     //   #376	-> 183
/*      */     //   #375	-> 185
/*      */     //   #374	-> 187
/*      */     //   #382	-> 188
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	199	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	199	1	address	Ljava/lang/String;
/*      */     //   0	199	2	method	Ljava/lang/String;
/*      */     //   0	199	3	args	[Ljava/lang/Object;
/*      */     //   75	124	6	component	Lli/cil/oc/api/network/Node;
/*      */     //   143	40	10	annotation	Lli/cil/oc/api/machine/Callback; } public Object[] invoke(Value value, String method, Object[] args) { Option option = Callbacks$.MODULE$.apply(value).get(method); if (option instanceof Some) { Some some = (Some)option; Callbacks.Callback callback = (Callbacks.Callback)some.x(); Callback annotation = callback.annotation(); if (annotation.direct())
/*      */         consumeCallBudget(1.0D / annotation.limit());  ArgumentsImpl arguments = new ArgumentsImpl((Seq<Object>)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray(args))); return li.cil.oc.server.driver.Registry$.MODULE$.convert(callback.apply(value, (Context)this, arguments)); }  throw new NoSuchMethodException(); } public void addUser(String name) { if (li$cil$oc$server$machine$Machine$$_users().size() >= li.cil.oc.Settings$.MODULE$.get().maxUsers())
/*      */       throw new Exception("too many users");  if (li$cil$oc$server$machine$Machine$$_users().contains(name))
/*      */       throw new Exception("user exists");  if (name.length() > li.cil.oc.Settings$.MODULE$.get().maxUsernameLength())
/*      */       throw new Exception("username too long");  if (scala.Predef$.MODULE$.refArrayOps((Object[])MinecraftServer.func_71276_C().func_71203_ab().func_72369_d()).contains(name))
/*      */       synchronized (li$cil$oc$server$machine$Machine$$_users()) { li$cil$oc$server$machine$Machine$$_users().$plus$eq(name); usersChanged_$eq(true); return; }   throw new Exception("player must be online"); } public boolean removeUser(String name) { synchronized (li$cil$oc$server$machine$Machine$$_users()) { boolean success = li$cil$oc$server$machine$Machine$$_users().remove(name); if (success)
/*      */         usersChanged_$eq(true);  Boolean bool = BoxesRunTime.boxToBoolean(success); return BoxesRunTime.unboxToBoolean(bool); }  } @Callback(doc = "function():boolean -- Starts the computer. Returns true if the state changed.") public Object[] start(Context context, Arguments args) { return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((!isPaused() && start())) })); } @Callback(doc = "function():boolean -- Stops the computer. Returns true if the state changed.") public Object[] stop(Context context, Arguments args) { return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(stop()) })); } @Callback(direct = true, doc = "function():boolean -- Returns whether the computer is running.") public Object[] isRunning(Context context, Arguments args) { return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isRunning()) })); } @Callback(doc = "function([frequency:string or number[, duration:number]]) -- Plays a tone, useful to alert users via audible feedback.") public Object[] beep(Context context, Arguments args) { if (args.count() == 1 && args.isString(0)) { beep(args.checkString(0)); } else { int frequency = args.optInteger(0, 440); if (frequency < 20 || frequency > 2000)
/*      */         throw new IllegalArgumentException("invalid frequency, must be in [20, 2000]");  double duration = args.optDouble(1, 0.1D); int durationInMilliseconds = scala.math.package$.MODULE$.max(50, scala.math.package$.MODULE$.min(5000, (int)(duration * 'Ϩ'))); context.pause(durationInMilliseconds / 1000.0D); beep((short)frequency, (short)durationInMilliseconds); }  return null; } @Callback(doc = "function():table -- Collect information on all connected devices.") public Object[] getDeviceInfo(Context context, Arguments args) { context.pause(1.0D); return new Object[] { ((TraversableOnce)((TraversableLike)((TraversableLike)scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(node().network().nodes()).map((Function1)new Machine$$anonfun$getDeviceInfo$3(this), scala.collection.Iterable$.MODULE$.canBuildFrom())).collect((PartialFunction)new Machine$$anonfun$getDeviceInfo$1(this), scala.collection.Iterable$.MODULE$.canBuildFrom())).collect((PartialFunction)new Machine$$anonfun$getDeviceInfo$2(this), scala.collection.Iterable$.MODULE$.canBuildFrom())).toMap(scala.Predef$.MODULE$.$conforms()) }; } public final class Machine$$anonfun$getDeviceInfo$3 extends AbstractFunction1<Node, Tuple2<Node, Environment>> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final Tuple2<Node, Environment> apply(Node n) { return new Tuple2(n, n.host()); } public Machine$$anonfun$getDeviceInfo$3(Machine $outer) {} } public final class Machine$$anonfun$getDeviceInfo$1 extends AbstractPartialFunction<Tuple2<Node, Environment>, Option<Tuple2<String, Map<String, String>>>> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<Node, Environment>, B1> B1 applyOrElse(Tuple2 x2, Function1 default) { // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: astore_3
/*      */       //   2: aload_3
/*      */       //   3: ifnull -> 193
/*      */       //   6: aload_3
/*      */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*      */       //   10: checkcast li/cil/oc/api/network/Node
/*      */       //   13: astore #4
/*      */       //   15: aload_3
/*      */       //   16: invokevirtual _2 : ()Ljava/lang/Object;
/*      */       //   19: checkcast li/cil/oc/api/network/Environment
/*      */       //   22: astore #5
/*      */       //   24: aload #4
/*      */       //   26: instanceof li/cil/oc/api/network/Component
/*      */       //   29: ifeq -> 193
/*      */       //   32: aload #4
/*      */       //   34: checkcast li/cil/oc/api/network/Component
/*      */       //   37: astore #6
/*      */       //   39: aload #5
/*      */       //   41: instanceof li/cil/oc/api/driver/DeviceInfo
/*      */       //   44: ifeq -> 193
/*      */       //   47: aload #5
/*      */       //   49: astore #7
/*      */       //   51: aload #6
/*      */       //   53: aload_0
/*      */       //   54: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   57: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */       //   60: invokeinterface canBeSeenFrom : (Lli/cil/oc/api/network/Node;)Z
/*      */       //   65: ifne -> 100
/*      */       //   68: aload #6
/*      */       //   70: aload_0
/*      */       //   71: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   74: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */       //   77: astore #9
/*      */       //   79: dup
/*      */       //   80: ifnonnull -> 92
/*      */       //   83: pop
/*      */       //   84: aload #9
/*      */       //   86: ifnull -> 100
/*      */       //   89: goto -> 185
/*      */       //   92: aload #9
/*      */       //   94: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   97: ifeq -> 185
/*      */       //   100: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   103: aload #7
/*      */       //   105: checkcast li/cil/oc/api/driver/DeviceInfo
/*      */       //   108: invokeinterface getDeviceInfo : ()Ljava/util/Map;
/*      */       //   113: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   116: astore #10
/*      */       //   118: aload #10
/*      */       //   120: instanceof scala/Some
/*      */       //   123: ifeq -> 175
/*      */       //   126: aload #10
/*      */       //   128: checkcast scala/Some
/*      */       //   131: astore #11
/*      */       //   133: aload #11
/*      */       //   135: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   138: checkcast java/util/Map
/*      */       //   141: astore #12
/*      */       //   143: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   146: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*      */       //   149: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   152: aload #6
/*      */       //   154: invokeinterface address : ()Ljava/lang/String;
/*      */       //   159: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   162: aload #12
/*      */       //   164: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*      */       //   167: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   170: astore #13
/*      */       //   172: goto -> 180
/*      */       //   175: getstatic scala/None$.MODULE$ : Lscala/None$;
/*      */       //   178: astore #13
/*      */       //   180: aload #13
/*      */       //   182: goto -> 188
/*      */       //   185: getstatic scala/None$.MODULE$ : Lscala/None$;
/*      */       //   188: astore #8
/*      */       //   190: goto -> 346
/*      */       //   193: aload_3
/*      */       //   194: ifnull -> 337
/*      */       //   197: aload_3
/*      */       //   198: invokevirtual _1 : ()Ljava/lang/Object;
/*      */       //   201: checkcast li/cil/oc/api/network/Node
/*      */       //   204: astore #14
/*      */       //   206: aload_3
/*      */       //   207: invokevirtual _2 : ()Ljava/lang/Object;
/*      */       //   210: checkcast li/cil/oc/api/network/Environment
/*      */       //   213: astore #15
/*      */       //   215: aload #15
/*      */       //   217: instanceof li/cil/oc/api/driver/DeviceInfo
/*      */       //   220: ifeq -> 337
/*      */       //   223: aload #15
/*      */       //   225: astore #16
/*      */       //   227: aload #14
/*      */       //   229: aload_0
/*      */       //   230: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   233: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */       //   236: invokeinterface canBeReachedFrom : (Lli/cil/oc/api/network/Node;)Z
/*      */       //   241: ifeq -> 329
/*      */       //   244: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   247: aload #16
/*      */       //   249: checkcast li/cil/oc/api/driver/DeviceInfo
/*      */       //   252: invokeinterface getDeviceInfo : ()Ljava/util/Map;
/*      */       //   257: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   260: astore #17
/*      */       //   262: aload #17
/*      */       //   264: instanceof scala/Some
/*      */       //   267: ifeq -> 319
/*      */       //   270: aload #17
/*      */       //   272: checkcast scala/Some
/*      */       //   275: astore #18
/*      */       //   277: aload #18
/*      */       //   279: invokevirtual x : ()Ljava/lang/Object;
/*      */       //   282: checkcast java/util/Map
/*      */       //   285: astore #19
/*      */       //   287: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */       //   290: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*      */       //   293: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   296: aload #14
/*      */       //   298: invokeinterface address : ()Ljava/lang/String;
/*      */       //   303: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   306: aload #19
/*      */       //   308: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*      */       //   311: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */       //   314: astore #20
/*      */       //   316: goto -> 324
/*      */       //   319: getstatic scala/None$.MODULE$ : Lscala/None$;
/*      */       //   322: astore #20
/*      */       //   324: aload #20
/*      */       //   326: goto -> 332
/*      */       //   329: getstatic scala/None$.MODULE$ : Lscala/None$;
/*      */       //   332: astore #8
/*      */       //   334: goto -> 346
/*      */       //   337: aload_2
/*      */       //   338: aload_1
/*      */       //   339: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   344: astore #8
/*      */       //   346: aload #8
/*      */       //   348: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #464	-> 0
/*      */       //   #465	-> 6
/*      */       //   #466	-> 51
/*      */       //   #467	-> 100
/*      */       //   #468	-> 118
/*      */       //   #469	-> 175
/*      */       //   #467	-> 180
/*      */       //   #472	-> 185
/*      */       //   #466	-> 188
/*      */       //   #464	-> 193
/*      */       //   #473	-> 197
/*      */       //   #474	-> 227
/*      */       //   #475	-> 244
/*      */       //   #476	-> 262
/*      */       //   #477	-> 319
/*      */       //   #475	-> 324
/*      */       //   #480	-> 329
/*      */       //   #474	-> 332
/*      */       //   #464	-> 337
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	349	0	this	Lli/cil/oc/server/machine/Machine$$anonfun$getDeviceInfo$1;
/*      */       //   0	349	1	x2	Lscala/Tuple2;
/*      */       //   0	349	2	default	Lscala/Function1;
/*      */       //   15	334	4	n	Lli/cil/oc/api/network/Node;
/*      */       //   24	325	5	deviceInfo	Lli/cil/oc/api/network/Environment;
/*      */       //   143	206	12	info	Ljava/util/Map;
/*      */       //   206	143	14	n	Lli/cil/oc/api/network/Node;
/*      */       //   215	134	15	deviceInfo	Lli/cil/oc/api/network/Environment;
/*      */       //   287	62	19	info	Ljava/util/Map; } public final boolean isDefinedAt(Tuple2 x2) { Tuple2 tuple2 = x2; if (tuple2 != null) { Node n = (Node)tuple2._1(); Environment deviceInfo = (Environment)tuple2._2(); if (n instanceof Component && deviceInfo instanceof DeviceInfo)
/*      */           return true;  }  if (tuple2 != null) { Environment deviceInfo = (Environment)tuple2._2(); if (deviceInfo instanceof DeviceInfo)
/*      */           return true;  }  return false; } public Machine$$anonfun$getDeviceInfo$1(Machine $outer) {}
/*      */   } public final class Machine$$anonfun$getDeviceInfo$2 extends AbstractPartialFunction<Option<Tuple2<String, Map<String, String>>>, Tuple2<String, Map<String, String>>> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final <A1 extends Option<Tuple2<String, Map<String, String>>>, B1> B1 applyOrElse(Option x3, Function1 default) { Object object; Option option = x3; if (option instanceof Some) { Some some = (Some)option; Tuple2 kvp = (Tuple2)some.x(); } else { object = default.apply(x3); }  return (B1)object; } public final boolean isDefinedAt(Option x3) { boolean bool; Option option = x3; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } public Machine$$anonfun$getDeviceInfo$2(Machine $outer) {}
/*      */   } @Callback(doc = "function():table -- Returns a map of program name to disk label for known programs.") public Object[] getProgramLocations(Context context, Arguments args) { return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { ProgramLocations$.MODULE$.getMappings(Machine$.MODULE$.getArchitectureName((Class)architecture().getClass())) })); } public boolean isExecuting() { synchronized (state()) { Boolean bool = BoxesRunTime.boxToBoolean(state().contains(State$.MODULE$.Running())); return BoxesRunTime.unboxToBoolean(bool); }  } public void update() { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   17: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   20: astore_3
/*      */     //   21: dup
/*      */     //   22: ifnonnull -> 33
/*      */     //   25: pop
/*      */     //   26: aload_3
/*      */     //   27: ifnull -> 40
/*      */     //   30: goto -> 44
/*      */     //   33: aload_3
/*      */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   37: ifeq -> 44
/*      */     //   40: iconst_0
/*      */     //   41: goto -> 45
/*      */     //   44: iconst_1
/*      */     //   45: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   48: astore_2
/*      */     //   49: aload_1
/*      */     //   50: monitorexit
/*      */     //   51: aload_2
/*      */     //   52: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   55: ifeq -> 1437
/*      */     //   58: aload_0
/*      */     //   59: invokespecial processAddedComponents : ()V
/*      */     //   62: aload_0
/*      */     //   63: invokevirtual componentCount : ()I
/*      */     //   66: aload_0
/*      */     //   67: invokevirtual maxComponents : ()I
/*      */     //   70: if_icmple -> 86
/*      */     //   73: aload_0
/*      */     //   74: ldc_w 'gui.Error.ComponentOverflow'
/*      */     //   77: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   80: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   83: goto -> 89
/*      */     //   86: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   89: pop
/*      */     //   90: aload_0
/*      */     //   91: aload_0
/*      */     //   92: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   95: invokeinterface world : ()Lnet/minecraft/world/World;
/*      */     //   100: invokevirtual func_72820_D : ()J
/*      */     //   103: invokevirtual worldTime_$eq : (J)V
/*      */     //   106: aload_0
/*      */     //   107: aload_0
/*      */     //   108: invokespecial uptime : ()J
/*      */     //   111: lconst_1
/*      */     //   112: ladd
/*      */     //   113: invokespecial uptime_$eq : (J)V
/*      */     //   116: aload_0
/*      */     //   117: invokespecial remainIdle : ()I
/*      */     //   120: iconst_0
/*      */     //   121: if_icmple -> 134
/*      */     //   124: aload_0
/*      */     //   125: aload_0
/*      */     //   126: invokespecial remainIdle : ()I
/*      */     //   129: iconst_1
/*      */     //   130: isub
/*      */     //   131: invokespecial remainIdle_$eq : (I)V
/*      */     //   134: aload_0
/*      */     //   135: aload_0
/*      */     //   136: invokespecial maxCallBudget : ()D
/*      */     //   139: invokespecial callBudget_$eq : (D)V
/*      */     //   142: aload_0
/*      */     //   143: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   146: invokeinterface world : ()Lnet/minecraft/world/World;
/*      */     //   151: invokevirtual func_82737_E : ()J
/*      */     //   154: l2d
/*      */     //   155: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*      */     //   158: invokevirtual get : ()Lli/cil/oc/Settings;
/*      */     //   161: invokevirtual tickFrequency : ()D
/*      */     //   164: drem
/*      */     //   165: iconst_0
/*      */     //   166: i2d
/*      */     //   167: dcmpl
/*      */     //   168: ifne -> 499
/*      */     //   171: aload_0
/*      */     //   172: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   175: dup
/*      */     //   176: astore #4
/*      */     //   178: monitorenter
/*      */     //   179: aload_0
/*      */     //   180: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   183: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   186: checkcast scala/Enumeration$Value
/*      */     //   189: astore #6
/*      */     //   191: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   194: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   197: aload #6
/*      */     //   199: astore #7
/*      */     //   201: dup
/*      */     //   202: ifnonnull -> 214
/*      */     //   205: pop
/*      */     //   206: aload #7
/*      */     //   208: ifnull -> 222
/*      */     //   211: goto -> 228
/*      */     //   214: aload #7
/*      */     //   216: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   219: ifeq -> 228
/*      */     //   222: iconst_1
/*      */     //   223: istore #8
/*      */     //   225: goto -> 342
/*      */     //   228: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   231: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   234: aload #6
/*      */     //   236: astore #9
/*      */     //   238: dup
/*      */     //   239: ifnonnull -> 251
/*      */     //   242: pop
/*      */     //   243: aload #9
/*      */     //   245: ifnull -> 259
/*      */     //   248: goto -> 265
/*      */     //   251: aload #9
/*      */     //   253: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   256: ifeq -> 265
/*      */     //   259: iconst_1
/*      */     //   260: istore #8
/*      */     //   262: goto -> 342
/*      */     //   265: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   268: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   271: aload #6
/*      */     //   273: astore #10
/*      */     //   275: dup
/*      */     //   276: ifnonnull -> 288
/*      */     //   279: pop
/*      */     //   280: aload #10
/*      */     //   282: ifnull -> 296
/*      */     //   285: goto -> 302
/*      */     //   288: aload #10
/*      */     //   290: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   293: ifeq -> 302
/*      */     //   296: iconst_1
/*      */     //   297: istore #8
/*      */     //   299: goto -> 342
/*      */     //   302: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   305: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   308: aload #6
/*      */     //   310: astore #11
/*      */     //   312: dup
/*      */     //   313: ifnonnull -> 325
/*      */     //   316: pop
/*      */     //   317: aload #11
/*      */     //   319: ifnull -> 333
/*      */     //   322: goto -> 339
/*      */     //   325: aload #11
/*      */     //   327: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   330: ifeq -> 339
/*      */     //   333: iconst_1
/*      */     //   334: istore #8
/*      */     //   336: goto -> 342
/*      */     //   339: iconst_0
/*      */     //   340: istore #8
/*      */     //   342: iload #8
/*      */     //   344: ifeq -> 355
/*      */     //   347: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   350: astore #12
/*      */     //   352: goto -> 487
/*      */     //   355: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   358: invokevirtual Sleeping : ()Lscala/Enumeration$Value;
/*      */     //   361: aload #6
/*      */     //   363: astore #13
/*      */     //   365: dup
/*      */     //   366: ifnonnull -> 378
/*      */     //   369: pop
/*      */     //   370: aload #13
/*      */     //   372: ifnull -> 386
/*      */     //   375: goto -> 452
/*      */     //   378: aload #13
/*      */     //   380: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   383: ifeq -> 452
/*      */     //   386: aload_0
/*      */     //   387: invokespecial remainIdle : ()I
/*      */     //   390: iconst_0
/*      */     //   391: if_icmple -> 452
/*      */     //   394: aload_0
/*      */     //   395: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   398: invokevirtual isEmpty : ()Z
/*      */     //   401: ifeq -> 452
/*      */     //   404: aload_0
/*      */     //   405: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   408: aload_0
/*      */     //   409: invokespecial cost : ()D
/*      */     //   412: dneg
/*      */     //   413: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*      */     //   416: invokevirtual get : ()Lli/cil/oc/Settings;
/*      */     //   419: invokevirtual sleepCostFactor : ()D
/*      */     //   422: dmul
/*      */     //   423: invokeinterface tryChangeBuffer : (D)Z
/*      */     //   428: ifeq -> 437
/*      */     //   431: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   434: goto -> 447
/*      */     //   437: aload_0
/*      */     //   438: ldc_w 'gui.Error.NoEnergy'
/*      */     //   441: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   444: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   447: astore #12
/*      */     //   449: goto -> 487
/*      */     //   452: aload_0
/*      */     //   453: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   456: aload_0
/*      */     //   457: invokespecial cost : ()D
/*      */     //   460: dneg
/*      */     //   461: invokeinterface tryChangeBuffer : (D)Z
/*      */     //   466: ifeq -> 475
/*      */     //   469: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   472: goto -> 485
/*      */     //   475: aload_0
/*      */     //   476: ldc_w 'gui.Error.NoEnergy'
/*      */     //   479: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   482: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   485: astore #12
/*      */     //   487: aload #12
/*      */     //   489: astore #5
/*      */     //   491: aload #4
/*      */     //   493: monitorexit
/*      */     //   494: aload #5
/*      */     //   496: goto -> 502
/*      */     //   499: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   502: pop
/*      */     //   503: aload_0
/*      */     //   504: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   507: invokeinterface world : ()Lnet/minecraft/world/World;
/*      */     //   512: invokevirtual func_82737_E : ()J
/*      */     //   515: ldc2_w 20
/*      */     //   518: lrem
/*      */     //   519: lconst_0
/*      */     //   520: lcmp
/*      */     //   521: ifne -> 604
/*      */     //   524: aload_0
/*      */     //   525: invokespecial usersChanged : ()Z
/*      */     //   528: ifeq -> 604
/*      */     //   531: aload_0
/*      */     //   532: invokevirtual li$cil$oc$server$machine$Machine$$_users : ()Lscala/collection/mutable/Set;
/*      */     //   535: dup
/*      */     //   536: astore #15
/*      */     //   538: monitorenter
/*      */     //   539: aload_0
/*      */     //   540: iconst_0
/*      */     //   541: invokespecial usersChanged_$eq : (Z)V
/*      */     //   544: aload_0
/*      */     //   545: invokevirtual users : ()[Ljava/lang/String;
/*      */     //   548: astore #16
/*      */     //   550: aload #15
/*      */     //   552: monitorexit
/*      */     //   553: aload #16
/*      */     //   555: checkcast [Ljava/lang/String;
/*      */     //   558: astore #14
/*      */     //   560: aload_0
/*      */     //   561: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   564: astore #17
/*      */     //   566: aload #17
/*      */     //   568: instanceof li/cil/oc/common/tileentity/traits/Computer
/*      */     //   571: ifeq -> 599
/*      */     //   574: aload #17
/*      */     //   576: checkcast li/cil/oc/common/tileentity/traits/Computer
/*      */     //   579: astore #18
/*      */     //   581: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*      */     //   584: aload #18
/*      */     //   586: aload #14
/*      */     //   588: invokevirtual sendComputerUserList : (Lli/cil/oc/common/tileentity/traits/Computer;[Ljava/lang/String;)V
/*      */     //   591: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   594: astore #19
/*      */     //   596: goto -> 604
/*      */     //   599: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   602: astore #19
/*      */     //   604: aload_0
/*      */     //   605: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   608: dup
/*      */     //   609: astore #21
/*      */     //   611: monitorenter
/*      */     //   612: aload_0
/*      */     //   613: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   616: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   619: astore #22
/*      */     //   621: aload #21
/*      */     //   623: monitorexit
/*      */     //   624: aload #22
/*      */     //   626: checkcast scala/Enumeration$Value
/*      */     //   629: astore #20
/*      */     //   631: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   634: invokevirtual Starting : ()Lscala/Enumeration$Value;
/*      */     //   637: aload #20
/*      */     //   639: astore #23
/*      */     //   641: dup
/*      */     //   642: ifnonnull -> 654
/*      */     //   645: pop
/*      */     //   646: aload #23
/*      */     //   648: ifnull -> 662
/*      */     //   651: goto -> 681
/*      */     //   654: aload #23
/*      */     //   656: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   659: ifeq -> 681
/*      */     //   662: aload_0
/*      */     //   663: invokespecial verifyComponents : ()V
/*      */     //   666: aload_0
/*      */     //   667: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   670: invokevirtual Yielded : ()Lscala/Enumeration$Value;
/*      */     //   673: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   676: astore #24
/*      */     //   678: goto -> 1336
/*      */     //   681: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   684: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   687: aload #20
/*      */     //   689: astore #25
/*      */     //   691: dup
/*      */     //   692: ifnonnull -> 704
/*      */     //   695: pop
/*      */     //   696: aload #25
/*      */     //   698: ifnull -> 712
/*      */     //   701: goto -> 786
/*      */     //   704: aload #25
/*      */     //   706: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   709: ifeq -> 786
/*      */     //   712: aload_0
/*      */     //   713: invokespecial close : ()V
/*      */     //   716: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*      */     //   719: invokevirtual get : ()Lli/cil/oc/Settings;
/*      */     //   722: invokevirtual eraseTmpOnReboot : ()Z
/*      */     //   725: ifeq -> 758
/*      */     //   728: aload_0
/*      */     //   729: invokevirtual tmp : ()Lscala/Option;
/*      */     //   732: new li/cil/oc/server/machine/Machine$$anonfun$update$1
/*      */     //   735: dup
/*      */     //   736: aload_0
/*      */     //   737: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   740: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   743: aload_0
/*      */     //   744: invokevirtual tmp : ()Lscala/Option;
/*      */     //   747: new li/cil/oc/server/machine/Machine$$anonfun$update$2
/*      */     //   750: dup
/*      */     //   751: aload_0
/*      */     //   752: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   755: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   758: aload_0
/*      */     //   759: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   762: ldc_w 'computer.stopped'
/*      */     //   765: iconst_0
/*      */     //   766: anewarray java/lang/Object
/*      */     //   769: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*      */     //   774: aload_0
/*      */     //   775: invokevirtual start : ()Z
/*      */     //   778: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   781: astore #24
/*      */     //   783: goto -> 1336
/*      */     //   786: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   789: invokevirtual Sleeping : ()Lscala/Enumeration$Value;
/*      */     //   792: aload #20
/*      */     //   794: astore #26
/*      */     //   796: dup
/*      */     //   797: ifnonnull -> 809
/*      */     //   800: pop
/*      */     //   801: aload #26
/*      */     //   803: ifnull -> 817
/*      */     //   806: goto -> 850
/*      */     //   809: aload #26
/*      */     //   811: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   814: ifeq -> 850
/*      */     //   817: aload_0
/*      */     //   818: invokespecial remainIdle : ()I
/*      */     //   821: iconst_0
/*      */     //   822: if_icmple -> 835
/*      */     //   825: aload_0
/*      */     //   826: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   829: invokevirtual nonEmpty : ()Z
/*      */     //   832: ifeq -> 850
/*      */     //   835: aload_0
/*      */     //   836: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   839: invokevirtual Yielded : ()Lscala/Enumeration$Value;
/*      */     //   842: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   845: astore #24
/*      */     //   847: goto -> 1336
/*      */     //   850: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   853: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   856: aload #20
/*      */     //   858: astore #27
/*      */     //   860: dup
/*      */     //   861: ifnonnull -> 873
/*      */     //   864: pop
/*      */     //   865: aload #27
/*      */     //   867: ifnull -> 881
/*      */     //   870: goto -> 936
/*      */     //   873: aload #27
/*      */     //   875: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   878: ifeq -> 936
/*      */     //   881: aload_0
/*      */     //   882: invokespecial remainingPause : ()I
/*      */     //   885: iconst_0
/*      */     //   886: if_icmple -> 905
/*      */     //   889: aload_0
/*      */     //   890: aload_0
/*      */     //   891: invokespecial remainingPause : ()I
/*      */     //   894: iconst_1
/*      */     //   895: isub
/*      */     //   896: invokespecial remainingPause_$eq : (I)V
/*      */     //   899: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   902: goto -> 931
/*      */     //   905: aload_0
/*      */     //   906: invokespecial verifyComponents : ()V
/*      */     //   909: aload_0
/*      */     //   910: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   913: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   916: pop
/*      */     //   917: aload_0
/*      */     //   918: aload_0
/*      */     //   919: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   922: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   925: checkcast scala/Enumeration$Value
/*      */     //   928: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   931: astore #24
/*      */     //   933: goto -> 1336
/*      */     //   936: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   939: invokevirtual SynchronizedCall : ()Lscala/Enumeration$Value;
/*      */     //   942: aload #20
/*      */     //   944: astore #28
/*      */     //   946: dup
/*      */     //   947: ifnonnull -> 959
/*      */     //   950: pop
/*      */     //   951: aload #28
/*      */     //   953: ifnull -> 967
/*      */     //   956: goto -> 1200
/*      */     //   959: aload #28
/*      */     //   961: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   964: ifeq -> 1200
/*      */     //   967: aload_0
/*      */     //   968: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   971: invokevirtual Running : ()Lscala/Enumeration$Value;
/*      */     //   974: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   977: pop
/*      */     //   978: aload_0
/*      */     //   979: iconst_1
/*      */     //   980: invokespecial inSynchronizedCall_$eq : (Z)V
/*      */     //   983: aload_0
/*      */     //   984: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   987: invokeinterface runSynchronized : ()V
/*      */     //   992: aload_0
/*      */     //   993: iconst_0
/*      */     //   994: invokespecial inSynchronizedCall_$eq : (Z)V
/*      */     //   997: aload_0
/*      */     //   998: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1001: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   1004: checkcast scala/Enumeration$Value
/*      */     //   1007: astore #36
/*      */     //   1009: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1012: invokevirtual Running : ()Lscala/Enumeration$Value;
/*      */     //   1015: aload #36
/*      */     //   1017: astore #37
/*      */     //   1019: dup
/*      */     //   1020: ifnonnull -> 1032
/*      */     //   1023: pop
/*      */     //   1024: aload #37
/*      */     //   1026: ifnull -> 1040
/*      */     //   1029: goto -> 1055
/*      */     //   1032: aload #37
/*      */     //   1034: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1037: ifeq -> 1055
/*      */     //   1040: aload_0
/*      */     //   1041: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1044: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*      */     //   1047: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   1050: astore #38
/*      */     //   1052: goto -> 1187
/*      */     //   1055: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1058: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   1061: aload #36
/*      */     //   1063: astore #39
/*      */     //   1065: dup
/*      */     //   1066: ifnonnull -> 1078
/*      */     //   1069: pop
/*      */     //   1070: aload #39
/*      */     //   1072: ifnull -> 1086
/*      */     //   1075: goto -> 1134
/*      */     //   1078: aload #39
/*      */     //   1080: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1083: ifeq -> 1134
/*      */     //   1086: aload_0
/*      */     //   1087: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1090: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   1093: pop
/*      */     //   1094: aload_0
/*      */     //   1095: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1098: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   1101: pop
/*      */     //   1102: aload_0
/*      */     //   1103: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1106: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1109: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*      */     //   1112: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   1115: pop
/*      */     //   1116: aload_0
/*      */     //   1117: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1120: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1123: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   1126: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   1129: astore #38
/*      */     //   1131: goto -> 1187
/*      */     //   1134: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1137: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   1140: aload #36
/*      */     //   1142: astore #40
/*      */     //   1144: dup
/*      */     //   1145: ifnonnull -> 1157
/*      */     //   1148: pop
/*      */     //   1149: aload #40
/*      */     //   1151: ifnull -> 1165
/*      */     //   1154: goto -> 1192
/*      */     //   1157: aload #40
/*      */     //   1159: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1162: ifeq -> 1192
/*      */     //   1165: aload_0
/*      */     //   1166: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1169: invokevirtual clear : ()V
/*      */     //   1172: aload_0
/*      */     //   1173: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1176: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1179: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   1182: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   1185: astore #38
/*      */     //   1187: aload #38
/*      */     //   1189: goto -> 1329
/*      */     //   1192: new java/lang/AssertionError
/*      */     //   1195: dup
/*      */     //   1196: invokespecial <init> : ()V
/*      */     //   1199: athrow
/*      */     //   1200: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   1203: astore #24
/*      */     //   1205: goto -> 1336
/*      */     //   1208: aload_1
/*      */     //   1209: monitorexit
/*      */     //   1210: athrow
/*      */     //   1211: aload #4
/*      */     //   1213: monitorexit
/*      */     //   1214: athrow
/*      */     //   1215: aload #15
/*      */     //   1217: monitorexit
/*      */     //   1218: athrow
/*      */     //   1219: aload #21
/*      */     //   1221: monitorexit
/*      */     //   1222: athrow
/*      */     //   1223: astore #29
/*      */     //   1225: aload #29
/*      */     //   1227: astore #31
/*      */     //   1229: aload #31
/*      */     //   1231: instanceof java/lang/Error
/*      */     //   1234: ifeq -> 1290
/*      */     //   1237: aload #31
/*      */     //   1239: checkcast java/lang/Error
/*      */     //   1242: astore #32
/*      */     //   1244: aload #32
/*      */     //   1246: invokevirtual getMessage : ()Ljava/lang/String;
/*      */     //   1249: ldc_w 'not enough memory'
/*      */     //   1252: astore #33
/*      */     //   1254: dup
/*      */     //   1255: ifnonnull -> 1267
/*      */     //   1258: pop
/*      */     //   1259: aload #33
/*      */     //   1261: ifnull -> 1275
/*      */     //   1264: goto -> 1290
/*      */     //   1267: aload #33
/*      */     //   1269: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1272: ifeq -> 1290
/*      */     //   1275: aload_0
/*      */     //   1276: ldc_w 'gui.Error.OutOfMemory'
/*      */     //   1279: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   1282: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   1285: astore #34
/*      */     //   1287: goto -> 1327
/*      */     //   1290: aload #31
/*      */     //   1292: ifnull -> 1438
/*      */     //   1295: aload #31
/*      */     //   1297: astore #35
/*      */     //   1299: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */     //   1302: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */     //   1305: ldc_w 'Faulty architecture implementation for synchronized calls.'
/*      */     //   1308: aload #35
/*      */     //   1310: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*      */     //   1315: aload_0
/*      */     //   1316: ldc_w 'gui.Error.InternalError'
/*      */     //   1319: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   1322: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   1325: astore #34
/*      */     //   1327: aload #34
/*      */     //   1329: aload_0
/*      */     //   1330: iconst_0
/*      */     //   1331: invokespecial inSynchronizedCall_$eq : (Z)V
/*      */     //   1334: astore #24
/*      */     //   1336: aload #24
/*      */     //   1338: pop
/*      */     //   1339: aload_0
/*      */     //   1340: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1343: dup
/*      */     //   1344: astore #42
/*      */     //   1346: monitorenter
/*      */     //   1347: aload_0
/*      */     //   1348: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1351: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   1354: astore #43
/*      */     //   1356: aload #42
/*      */     //   1358: monitorexit
/*      */     //   1359: aload #43
/*      */     //   1361: checkcast scala/Enumeration$Value
/*      */     //   1364: astore #41
/*      */     //   1366: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   1369: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   1372: aload #41
/*      */     //   1374: astore #44
/*      */     //   1376: dup
/*      */     //   1377: ifnonnull -> 1389
/*      */     //   1380: pop
/*      */     //   1381: aload #44
/*      */     //   1383: ifnull -> 1397
/*      */     //   1386: goto -> 1432
/*      */     //   1389: aload #44
/*      */     //   1391: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1394: ifeq -> 1432
/*      */     //   1397: aload_0
/*      */     //   1398: dup
/*      */     //   1399: astore #46
/*      */     //   1401: monitorenter
/*      */     //   1402: aload_0
/*      */     //   1403: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   1406: dup
/*      */     //   1407: astore #47
/*      */     //   1409: monitorenter
/*      */     //   1410: aload_0
/*      */     //   1411: invokevirtual tryClose : ()Z
/*      */     //   1414: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   1417: pop
/*      */     //   1418: aload #47
/*      */     //   1420: monitorexit
/*      */     //   1421: aload #46
/*      */     //   1423: monitorexit
/*      */     //   1424: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   1427: astore #45
/*      */     //   1429: goto -> 1437
/*      */     //   1432: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   1435: astore #45
/*      */     //   1437: return
/*      */     //   1438: aload #29
/*      */     //   1440: athrow
/*      */     //   1441: astore #30
/*      */     //   1443: aload_0
/*      */     //   1444: iconst_0
/*      */     //   1445: invokespecial inSynchronizedCall_$eq : (Z)V
/*      */     //   1448: aload #30
/*      */     //   1450: athrow
/*      */     //   1451: aload #42
/*      */     //   1453: monitorexit
/*      */     //   1454: athrow
/*      */     //   1455: aload #47
/*      */     //   1457: monitorexit
/*      */     //   1458: athrow
/*      */     //   1459: aload #46
/*      */     //   1461: monitorexit
/*      */     //   1462: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #494	-> 0
/*      */     //   #503	-> 58
/*      */     //   #507	-> 62
/*      */     //   #508	-> 73
/*      */     //   #507	-> 86
/*      */     //   #512	-> 90
/*      */     //   #513	-> 106
/*      */     //   #515	-> 116
/*      */     //   #516	-> 124
/*      */     //   #520	-> 134
/*      */     //   #523	-> 142
/*      */     //   #524	-> 171
/*      */     //   #525	-> 191
/*      */     //   #526	-> 228
/*      */     //   #527	-> 265
/*      */     //   #528	-> 302
/*      */     //   #525	-> 339
/*      */     //   #528	-> 347
/*      */     //   #529	-> 355
/*      */     //   #530	-> 404
/*      */     //   #531	-> 437
/*      */     //   #530	-> 447
/*      */     //   #534	-> 452
/*      */     //   #535	-> 475
/*      */     //   #534	-> 485
/*      */     //   #524	-> 487
/*      */     //   #523	-> 499
/*      */     //   #541	-> 503
/*      */     //   #542	-> 531
/*      */     //   #543	-> 539
/*      */     //   #544	-> 544
/*      */     //   #542	-> 552
/*      */     //   #546	-> 560
/*      */     //   #547	-> 566
/*      */     //   #548	-> 599
/*      */     //   #554	-> 604
/*      */     //   #556	-> 631
/*      */     //   #557	-> 662
/*      */     //   #558	-> 666
/*      */     //   #556	-> 676
/*      */     //   #560	-> 681
/*      */     //   #561	-> 712
/*      */     //   #562	-> 716
/*      */     //   #563	-> 728
/*      */     //   #564	-> 743
/*      */     //   #566	-> 758
/*      */     //   #567	-> 774
/*      */     //   #560	-> 781
/*      */     //   #569	-> 786
/*      */     //   #570	-> 835
/*      */     //   #572	-> 850
/*      */     //   #573	-> 881
/*      */     //   #574	-> 889
/*      */     //   #577	-> 905
/*      */     //   #578	-> 909
/*      */     //   #579	-> 917
/*      */     //   #573	-> 931
/*      */     //   #582	-> 936
/*      */     //   #585	-> 967
/*      */     //   #587	-> 978
/*      */     //   #588	-> 983
/*      */     //   #589	-> 992
/*      */     //   #591	-> 997
/*      */     //   #592	-> 1009
/*      */     //   #593	-> 1040
/*      */     //   #594	-> 1055
/*      */     //   #595	-> 1086
/*      */     //   #596	-> 1094
/*      */     //   #597	-> 1102
/*      */     //   #598	-> 1116
/*      */     //   #594	-> 1129
/*      */     //   #599	-> 1134
/*      */     //   #600	-> 1165
/*      */     //   #601	-> 1172
/*      */     //   #599	-> 1185
/*      */     //   #591	-> 1187
/*      */     //   #602	-> 1192
/*      */     //   #615	-> 1200
/*      */     //   #494	-> 1208
/*      */     //   #524	-> 1211
/*      */     //   #542	-> 1215
/*      */     //   #554	-> 1219
/*      */     //   #586	-> 1223
/*      */     //   #606	-> 1229
/*      */     //   #607	-> 1275
/*      */     //   #608	-> 1290
/*      */     //   #609	-> 1299
/*      */     //   #610	-> 1315
/*      */     //   #608	-> 1325
/*      */     //   #586	-> 1327
/*      */     //   #613	-> 1329
/*      */     //   #582	-> 1334
/*      */     //   #554	-> 1336
/*      */     //   #621	-> 1339
/*      */     //   #623	-> 1366
/*      */     //   #624	-> 1432
/*      */     //   #494	-> 1437
/*      */     //   #586	-> 1438
/*      */     //   #613	-> 1441
/*      */     //   #621	-> 1451
/*      */     //   #623	-> 1455
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	1463	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   560	903	14	list	[Ljava/lang/String;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	51	1208	finally
/*      */     //   179	494	1211	finally
/*      */     //   539	553	1215	finally
/*      */     //   612	624	1219	finally
/*      */     //   978	1200	1223	finally
/*      */     //   978	1200	1441	finally
/*      */     //   1223	1329	1441	finally
/*      */     //   1347	1359	1451	finally
/*      */     //   1402	1424	1459	finally
/*      */     //   1410	1421	1455	finally
/*      */     //   1438	1441	1441	finally
/*  563 */     //   1455	1459	1459	finally } public final class Machine$$anonfun$update$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public final void apply(ManagedEnvironment x$5) { x$5.node().remove(); } public static final long serialVersionUID = 0L; public Machine$$anonfun$update$1(Machine $outer) {} } public final class Machine$$anonfun$update$2 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ManagedEnvironment tmp) {
/*  564 */       this.$outer.node().connect(tmp.node());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$update$2(Machine $outer) {} }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onMessage(Message message) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: invokeinterface data : ()[Ljava/lang/Object;
/*      */     //   6: astore_2
/*      */     //   7: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*      */     //   10: aload_2
/*      */     //   11: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   14: astore_3
/*      */     //   15: aload_3
/*      */     //   16: invokevirtual isEmpty : ()Z
/*      */     //   19: ifne -> 193
/*      */     //   22: aload_3
/*      */     //   23: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   26: ifnull -> 193
/*      */     //   29: aload_3
/*      */     //   30: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   33: checkcast scala/collection/SeqLike
/*      */     //   36: iconst_1
/*      */     //   37: invokeinterface lengthCompare : (I)I
/*      */     //   42: iconst_0
/*      */     //   43: if_icmplt -> 193
/*      */     //   46: aload_3
/*      */     //   47: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   50: checkcast scala/collection/SeqLike
/*      */     //   53: iconst_0
/*      */     //   54: invokeinterface apply : (I)Ljava/lang/Object;
/*      */     //   59: astore #4
/*      */     //   61: aload_3
/*      */     //   62: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   65: checkcast scala/collection/IterableLike
/*      */     //   68: iconst_1
/*      */     //   69: invokeinterface drop : (I)Ljava/lang/Object;
/*      */     //   74: checkcast scala/collection/IndexedSeq
/*      */     //   77: astore #5
/*      */     //   79: aload #4
/*      */     //   81: instanceof java/lang/String
/*      */     //   84: ifeq -> 193
/*      */     //   87: aload #4
/*      */     //   89: checkcast java/lang/String
/*      */     //   92: astore #6
/*      */     //   94: aload_1
/*      */     //   95: invokeinterface name : ()Ljava/lang/String;
/*      */     //   100: ldc_w 'computer.signal'
/*      */     //   103: astore #7
/*      */     //   105: dup
/*      */     //   106: ifnonnull -> 118
/*      */     //   109: pop
/*      */     //   110: aload #7
/*      */     //   112: ifnull -> 126
/*      */     //   115: goto -> 193
/*      */     //   118: aload #7
/*      */     //   120: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   123: ifeq -> 193
/*      */     //   126: aload_0
/*      */     //   127: aload #6
/*      */     //   129: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*      */     //   132: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   135: iconst_1
/*      */     //   136: anewarray java/lang/String
/*      */     //   139: dup
/*      */     //   140: iconst_0
/*      */     //   141: aload_1
/*      */     //   142: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*      */     //   147: invokeinterface address : ()Ljava/lang/String;
/*      */     //   152: aastore
/*      */     //   153: checkcast [Ljava/lang/Object;
/*      */     //   156: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */     //   159: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*      */     //   162: checkcast scala/collection/TraversableLike
/*      */     //   165: aload #5
/*      */     //   167: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*      */     //   170: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   173: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   178: checkcast scala/collection/Seq
/*      */     //   181: invokevirtual signal : (Ljava/lang/String;Lscala/collection/Seq;)Z
/*      */     //   184: pop
/*      */     //   185: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   188: astore #8
/*      */     //   190: goto -> 532
/*      */     //   193: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*      */     //   196: aload_2
/*      */     //   197: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   200: astore #9
/*      */     //   202: aload #9
/*      */     //   204: invokevirtual isEmpty : ()Z
/*      */     //   207: ifne -> 434
/*      */     //   210: aload #9
/*      */     //   212: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   215: ifnull -> 434
/*      */     //   218: aload #9
/*      */     //   220: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   223: checkcast scala/collection/SeqLike
/*      */     //   226: iconst_2
/*      */     //   227: invokeinterface lengthCompare : (I)I
/*      */     //   232: iconst_0
/*      */     //   233: if_icmplt -> 434
/*      */     //   236: aload #9
/*      */     //   238: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   241: checkcast scala/collection/SeqLike
/*      */     //   244: iconst_0
/*      */     //   245: invokeinterface apply : (I)Ljava/lang/Object;
/*      */     //   250: astore #10
/*      */     //   252: aload #9
/*      */     //   254: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   257: checkcast scala/collection/SeqLike
/*      */     //   260: iconst_1
/*      */     //   261: invokeinterface apply : (I)Ljava/lang/Object;
/*      */     //   266: astore #11
/*      */     //   268: aload #9
/*      */     //   270: invokevirtual get : ()Ljava/lang/Object;
/*      */     //   273: checkcast scala/collection/IterableLike
/*      */     //   276: iconst_2
/*      */     //   277: invokeinterface drop : (I)Ljava/lang/Object;
/*      */     //   282: checkcast scala/collection/IndexedSeq
/*      */     //   285: astore #12
/*      */     //   287: aload #10
/*      */     //   289: instanceof net/minecraft/entity/player/EntityPlayer
/*      */     //   292: ifeq -> 434
/*      */     //   295: aload #10
/*      */     //   297: checkcast net/minecraft/entity/player/EntityPlayer
/*      */     //   300: astore #13
/*      */     //   302: aload #11
/*      */     //   304: instanceof java/lang/String
/*      */     //   307: ifeq -> 434
/*      */     //   310: aload #11
/*      */     //   312: checkcast java/lang/String
/*      */     //   315: astore #14
/*      */     //   317: aload_1
/*      */     //   318: invokeinterface name : ()Ljava/lang/String;
/*      */     //   323: ldc_w 'computer.checked_signal'
/*      */     //   326: astore #15
/*      */     //   328: dup
/*      */     //   329: ifnonnull -> 341
/*      */     //   332: pop
/*      */     //   333: aload #15
/*      */     //   335: ifnull -> 349
/*      */     //   338: goto -> 434
/*      */     //   341: aload #15
/*      */     //   343: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   346: ifeq -> 434
/*      */     //   349: aload_0
/*      */     //   350: aload #13
/*      */     //   352: invokevirtual func_70005_c_ : ()Ljava/lang/String;
/*      */     //   355: invokevirtual canInteract : (Ljava/lang/String;)Z
/*      */     //   358: ifeq -> 426
/*      */     //   361: aload_0
/*      */     //   362: aload #14
/*      */     //   364: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*      */     //   367: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   370: iconst_1
/*      */     //   371: anewarray java/lang/String
/*      */     //   374: dup
/*      */     //   375: iconst_0
/*      */     //   376: aload_1
/*      */     //   377: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*      */     //   382: invokeinterface address : ()Ljava/lang/String;
/*      */     //   387: aastore
/*      */     //   388: checkcast [Ljava/lang/Object;
/*      */     //   391: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */     //   394: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*      */     //   397: checkcast scala/collection/TraversableLike
/*      */     //   400: aload #12
/*      */     //   402: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*      */     //   405: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   408: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   413: checkcast scala/collection/Seq
/*      */     //   416: invokevirtual signal : (Ljava/lang/String;Lscala/collection/Seq;)Z
/*      */     //   419: pop
/*      */     //   420: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   423: goto -> 429
/*      */     //   426: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   429: astore #8
/*      */     //   431: goto -> 532
/*      */     //   434: aload_1
/*      */     //   435: invokeinterface name : ()Ljava/lang/String;
/*      */     //   440: ldc_w 'computer.start'
/*      */     //   443: astore #16
/*      */     //   445: dup
/*      */     //   446: ifnonnull -> 458
/*      */     //   449: pop
/*      */     //   450: aload #16
/*      */     //   452: ifnull -> 466
/*      */     //   455: goto -> 484
/*      */     //   458: aload #16
/*      */     //   460: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   463: ifeq -> 484
/*      */     //   466: aload_0
/*      */     //   467: invokevirtual isPaused : ()Z
/*      */     //   470: ifne -> 484
/*      */     //   473: aload_0
/*      */     //   474: invokevirtual start : ()Z
/*      */     //   477: pop
/*      */     //   478: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   481: goto -> 530
/*      */     //   484: aload_1
/*      */     //   485: invokeinterface name : ()Ljava/lang/String;
/*      */     //   490: ldc_w 'computer.stop'
/*      */     //   493: astore #17
/*      */     //   495: dup
/*      */     //   496: ifnonnull -> 508
/*      */     //   499: pop
/*      */     //   500: aload #17
/*      */     //   502: ifnull -> 516
/*      */     //   505: goto -> 527
/*      */     //   508: aload #17
/*      */     //   510: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   513: ifeq -> 527
/*      */     //   516: aload_0
/*      */     //   517: invokevirtual stop : ()Z
/*      */     //   520: pop
/*      */     //   521: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   524: goto -> 530
/*      */     //   527: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   530: astore #8
/*      */     //   532: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #631	-> 0
/*      */     //   #632	-> 7
/*      */     //   #633	-> 126
/*      */     //   #634	-> 193
/*      */     //   #635	-> 349
/*      */     //   #636	-> 361
/*      */     //   #635	-> 426
/*      */     //   #638	-> 434
/*      */     //   #639	-> 484
/*      */     //   #638	-> 530
/*      */     //   #631	-> 532
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	533	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	533	1	message	Lli/cil/oc/api/network/Message;
/*      */     //   61	472	4	name	Ljava/lang/Object;
/*      */     //   79	454	5	args	Lscala/collection/IndexedSeq;
/*      */     //   252	281	10	player	Ljava/lang/Object;
/*      */     //   268	265	11	name	Ljava/lang/Object;
/*      */     //   287	246	12	args	Lscala/collection/IndexedSeq;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onConnect(Node node) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: aload_0
/*      */     //   2: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   5: astore_2
/*      */     //   6: dup
/*      */     //   7: ifnonnull -> 18
/*      */     //   10: pop
/*      */     //   11: aload_2
/*      */     //   12: ifnull -> 25
/*      */     //   15: goto -> 105
/*      */     //   18: aload_2
/*      */     //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   22: ifeq -> 105
/*      */     //   25: aload_0
/*      */     //   26: invokevirtual li$cil$oc$server$machine$Machine$$_components : ()Lscala/collection/mutable/Map;
/*      */     //   29: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*      */     //   32: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   35: aload_0
/*      */     //   36: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   39: invokeinterface address : ()Ljava/lang/String;
/*      */     //   44: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   47: aload_0
/*      */     //   48: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   51: invokeinterface name : ()Ljava/lang/String;
/*      */     //   56: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*      */     //   59: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*      */     //   64: pop
/*      */     //   65: aload_0
/*      */     //   66: invokevirtual tmp : ()Lscala/Option;
/*      */     //   69: new li/cil/oc/server/machine/Machine$$anonfun$onConnect$1
/*      */     //   72: dup
/*      */     //   73: aload_0
/*      */     //   74: aload_1
/*      */     //   75: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lli/cil/oc/api/network/Node;)V
/*      */     //   78: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   81: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   84: aload_0
/*      */     //   85: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   88: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   91: new li/cil/oc/server/machine/Machine$$anonfun$onConnect$2
/*      */     //   94: dup
/*      */     //   95: aload_0
/*      */     //   96: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   99: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   102: goto -> 139
/*      */     //   105: aload_1
/*      */     //   106: astore_3
/*      */     //   107: aload_3
/*      */     //   108: instanceof li/cil/oc/api/network/Component
/*      */     //   111: ifeq -> 134
/*      */     //   114: aload_3
/*      */     //   115: checkcast li/cil/oc/api/network/Component
/*      */     //   118: astore #4
/*      */     //   120: aload_0
/*      */     //   121: aload #4
/*      */     //   123: invokevirtual addComponent : (Lli/cil/oc/api/network/Component;)V
/*      */     //   126: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   129: astore #5
/*      */     //   131: goto -> 139
/*      */     //   134: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   137: astore #5
/*      */     //   139: aload_0
/*      */     //   140: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   143: aload_1
/*      */     //   144: invokeinterface onMachineConnect : (Lli/cil/oc/api/network/Node;)V
/*      */     //   149: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #644	-> 0
/*      */     //   #645	-> 25
/*      */     //   #646	-> 65
/*      */     //   #647	-> 81
/*      */     //   #650	-> 105
/*      */     //   #651	-> 107
/*      */     //   #652	-> 134
/*      */     //   #656	-> 139
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	150	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	150	1	node	Lli/cil/oc/api/network/Node;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final class Machine$$anonfun$onConnect$1
/*      */     extends AbstractFunction1<ManagedEnvironment, BoxedUnit>
/*      */     implements Serializable
/*      */   {
/*      */     public static final long serialVersionUID = 0L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Node node$1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void apply(ManagedEnvironment fs)
/*      */     {
/*  646 */       this.node$1.connect(fs.node()); } public Machine$$anonfun$onConnect$1(Machine $outer, Node node$1) {} } public final class Machine$$anonfun$onConnect$2 extends AbstractFunction1<Architecture, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Architecture x$6) {
/*  647 */       x$6.onConnect();
/*      */     }
/*      */     
/*      */     public Machine$$anonfun$onConnect$2(Machine $outer) {} }
/*      */ 
/*      */   
/*      */   public void onDisconnect(Node node) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: aload_0
/*      */     //   2: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */     //   5: astore_2
/*      */     //   6: dup
/*      */     //   7: ifnonnull -> 18
/*      */     //   10: pop
/*      */     //   11: aload_2
/*      */     //   12: ifnull -> 25
/*      */     //   15: goto -> 47
/*      */     //   18: aload_2
/*      */     //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   22: ifeq -> 47
/*      */     //   25: aload_0
/*      */     //   26: invokespecial close : ()V
/*      */     //   29: aload_0
/*      */     //   30: invokevirtual tmp : ()Lscala/Option;
/*      */     //   33: new li/cil/oc/server/machine/Machine$$anonfun$onDisconnect$1
/*      */     //   36: dup
/*      */     //   37: aload_0
/*      */     //   38: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   41: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   44: goto -> 81
/*      */     //   47: aload_1
/*      */     //   48: astore_3
/*      */     //   49: aload_3
/*      */     //   50: instanceof li/cil/oc/api/network/Component
/*      */     //   53: ifeq -> 76
/*      */     //   56: aload_3
/*      */     //   57: checkcast li/cil/oc/api/network/Component
/*      */     //   60: astore #4
/*      */     //   62: aload_0
/*      */     //   63: aload #4
/*      */     //   65: invokevirtual removeComponent : (Lli/cil/oc/api/network/Component;)V
/*      */     //   68: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   71: astore #5
/*      */     //   73: goto -> 81
/*      */     //   76: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   79: astore #5
/*      */     //   81: aload_0
/*      */     //   82: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   85: aload_1
/*      */     //   86: invokeinterface onMachineDisconnect : (Lli/cil/oc/api/network/Node;)V
/*      */     //   91: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #660	-> 0
/*      */     //   #661	-> 25
/*      */     //   #662	-> 29
/*      */     //   #665	-> 47
/*      */     //   #666	-> 49
/*      */     //   #667	-> 76
/*      */     //   #671	-> 81
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	92	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	92	1	node	Lli/cil/oc/api/network/Node;
/*      */   }
/*      */   
/*      */   public final class Machine$$anonfun$onDisconnect$1
/*      */     extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     
/*      */     public final void apply(ManagedEnvironment x$7) {
/*  662 */       x$7.node().remove();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$onDisconnect$1(Machine $outer) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addComponent(Component component) {
/*  677 */     if (!li$cil$oc$server$machine$Machine$$_components().contains(component.address())) {
/*  678 */       addedComponents().$plus$eq(component);
/*      */     }
/*      */   }
/*      */   
/*      */   public void removeComponent(Component component) {
/*  683 */     if (li$cil$oc$server$machine$Machine$$_components().contains(component.address())) {
/*  684 */       synchronized (li$cil$oc$server$machine$Machine$$_components()) { li$cil$oc$server$machine$Machine$$_components().$minus$eq(component.address()); }
/*      */     
/*      */     }
/*  687 */     addedComponents().$minus$eq(component);
/*      */   }
/*      */   
/*      */   private void processAddedComponents() {
/*  691 */     if (addedComponents().nonEmpty()) {
/*  692 */       addedComponents().foreach((Function1)new Machine$$anonfun$processAddedComponents$1(this));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  702 */       addedComponents().clear();
/*      */     } 
/*      */   } public final class Machine$$anonfun$processAddedComponents$1 extends AbstractFunction1<Component, Object> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public Machine$$anonfun$processAddedComponents$1(Machine $outer) {} public final Object apply(Component component) { if (component.canBeSeenFrom((Node)this.$outer.node()))
/*      */         synchronized (this.$outer.li$cil$oc$server$machine$Machine$$_components()) { this.$outer.li$cil$oc$server$machine$Machine$$_components().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(component.address()), component.name())); return (this.$outer.architecture() != null && this.$outer.architecture().isInitialized()) ? BoxesRunTime.boxToBoolean(this.$outer.signal("component_added", (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { component.address(), component.name() }))) : BoxedUnit.UNIT; }
/*  707 */           return BoxedUnit.UNIT; } } private void verifyComponents() { Set invalid = scala.collection.mutable.Set$.MODULE$.empty();
/*  708 */     li$cil$oc$server$machine$Machine$$_components().withFilter((Function1)new Machine$$anonfun$verifyComponents$1(this)).foreach((Function1)new Machine$$anonfun$verifyComponents$2(this, invalid));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  721 */     invalid.foreach((Function1)new Machine$$anonfun$verifyComponents$3(this)); } public final class Machine$$anonfun$verifyComponents$1 extends AbstractFunction1<Tuple2<String, String>, Object> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool; Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Machine$$anonfun$verifyComponents$1(Machine $outer) {} } public final class Machine$$anonfun$verifyComponents$2 extends AbstractFunction1<Tuple2<String, String>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Set invalid$1; public final Object apply(Tuple2 x$8) { // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: astore_2
/*      */       //   2: aload_2
/*      */       //   3: ifnull -> 325
/*      */       //   6: aload_2
/*      */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*      */       //   10: checkcast java/lang/String
/*      */       //   13: astore_3
/*      */       //   14: aload_2
/*      */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*      */       //   18: checkcast java/lang/String
/*      */       //   21: astore #4
/*      */       //   23: aload_0
/*      */       //   24: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   27: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*      */       //   30: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*      */       //   35: aload_3
/*      */       //   36: invokeinterface node : (Ljava/lang/String;)Lli/cil/oc/api/network/Node;
/*      */       //   41: astore #6
/*      */       //   43: aload #6
/*      */       //   45: instanceof li/cil/oc/api/network/Component
/*      */       //   48: ifeq -> 98
/*      */       //   51: aload #6
/*      */       //   53: checkcast li/cil/oc/api/network/Component
/*      */       //   56: astore #7
/*      */       //   58: aload #7
/*      */       //   60: invokeinterface name : ()Ljava/lang/String;
/*      */       //   65: aload #4
/*      */       //   67: astore #8
/*      */       //   69: dup
/*      */       //   70: ifnonnull -> 82
/*      */       //   73: pop
/*      */       //   74: aload #8
/*      */       //   76: ifnull -> 90
/*      */       //   79: goto -> 98
/*      */       //   82: aload #8
/*      */       //   84: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   87: ifeq -> 98
/*      */       //   90: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */       //   93: astore #9
/*      */       //   95: goto -> 318
/*      */       //   98: aload #4
/*      */       //   100: ldc 'filesystem'
/*      */       //   102: astore #10
/*      */       //   104: dup
/*      */       //   105: ifnonnull -> 117
/*      */       //   108: pop
/*      */       //   109: aload #10
/*      */       //   111: ifnull -> 125
/*      */       //   114: goto -> 209
/*      */       //   117: aload #10
/*      */       //   119: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */       //   122: ifeq -> 209
/*      */       //   125: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */       //   128: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */       //   131: new scala/StringContext
/*      */       //   134: dup
/*      */       //   135: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   138: iconst_3
/*      */       //   139: anewarray java/lang/String
/*      */       //   142: dup
/*      */       //   143: iconst_0
/*      */       //   144: ldc 'A component of type ''
/*      */       //   146: aastore
/*      */       //   147: dup
/*      */       //   148: iconst_1
/*      */       //   149: ldc '' disappeared ('
/*      */       //   151: aastore
/*      */       //   152: dup
/*      */       //   153: iconst_2
/*      */       //   154: ldc ')! This usually means that it didn't save its node.'
/*      */       //   156: aastore
/*      */       //   157: checkcast [Ljava/lang/Object;
/*      */       //   160: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */       //   163: invokespecial <init> : (Lscala/collection/Seq;)V
/*      */       //   166: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   169: iconst_2
/*      */       //   170: anewarray java/lang/Object
/*      */       //   173: dup
/*      */       //   174: iconst_0
/*      */       //   175: aload #4
/*      */       //   177: aastore
/*      */       //   178: dup
/*      */       //   179: iconst_1
/*      */       //   180: aload_3
/*      */       //   181: aastore
/*      */       //   182: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */       //   185: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*      */       //   188: invokeinterface trace : (Ljava/lang/String;)V
/*      */       //   193: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */       //   196: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */       //   199: ldc 'If this was a file system provided by a ComputerCraft peripheral, this is normal.'
/*      */       //   201: invokeinterface trace : (Ljava/lang/String;)V
/*      */       //   206: goto -> 277
/*      */       //   209: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */       //   212: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */       //   215: new scala/StringContext
/*      */       //   218: dup
/*      */       //   219: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   222: iconst_3
/*      */       //   223: anewarray java/lang/String
/*      */       //   226: dup
/*      */       //   227: iconst_0
/*      */       //   228: ldc 'A component of type ''
/*      */       //   230: aastore
/*      */       //   231: dup
/*      */       //   232: iconst_1
/*      */       //   233: ldc '' disappeared ('
/*      */       //   235: aastore
/*      */       //   236: dup
/*      */       //   237: iconst_2
/*      */       //   238: ldc ')! This usually means that it didn't save its node.'
/*      */       //   240: aastore
/*      */       //   241: checkcast [Ljava/lang/Object;
/*      */       //   244: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */       //   247: invokespecial <init> : (Lscala/collection/Seq;)V
/*      */       //   250: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   253: iconst_2
/*      */       //   254: anewarray java/lang/Object
/*      */       //   257: dup
/*      */       //   258: iconst_0
/*      */       //   259: aload #4
/*      */       //   261: aastore
/*      */       //   262: dup
/*      */       //   263: iconst_1
/*      */       //   264: aload_3
/*      */       //   265: aastore
/*      */       //   266: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */       //   269: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*      */       //   272: invokeinterface warn : (Ljava/lang/String;)V
/*      */       //   277: aload_0
/*      */       //   278: getfield $outer : Lli/cil/oc/server/machine/Machine;
/*      */       //   281: ldc 'component_removed'
/*      */       //   283: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */       //   286: iconst_2
/*      */       //   287: anewarray java/lang/Object
/*      */       //   290: dup
/*      */       //   291: iconst_0
/*      */       //   292: aload_3
/*      */       //   293: aastore
/*      */       //   294: dup
/*      */       //   295: iconst_1
/*      */       //   296: aload #4
/*      */       //   298: aastore
/*      */       //   299: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*      */       //   302: invokevirtual signal : (Ljava/lang/String;Lscala/collection/Seq;)Z
/*      */       //   305: pop
/*      */       //   306: aload_0
/*      */       //   307: getfield invalid$1 : Lscala/collection/mutable/Set;
/*      */       //   310: aload_3
/*      */       //   311: invokeinterface $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/SetLike;
/*      */       //   316: astore #9
/*      */       //   318: aload #9
/*      */       //   320: astore #5
/*      */       //   322: aload #5
/*      */       //   324: areturn
/*      */       //   325: new scala/MatchError
/*      */       //   328: dup
/*      */       //   329: aload_2
/*      */       //   330: invokespecial <init> : (Ljava/lang/Object;)V
/*      */       //   333: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #708	-> 0
/*      */       //   #709	-> 23
/*      */       //   #710	-> 43
/*      */       //   #712	-> 98
/*      */       //   #713	-> 125
/*      */       //   #714	-> 193
/*      */       //   #716	-> 209
/*      */       //   #717	-> 277
/*      */       //   #718	-> 306
/*      */       //   #711	-> 316
/*      */       //   #709	-> 318
/*      */       //   #708	-> 322
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   0	334	0	this	Lli/cil/oc/server/machine/Machine$$anonfun$verifyComponents$2;
/*      */       //   0	334	1	x$8	Lscala/Tuple2;
/*      */       //   14	320	3	address	Ljava/lang/String;
/*  722 */       //   23	311	4	name	Ljava/lang/String; } public Machine$$anonfun$verifyComponents$2(Machine $outer, Set invalid$1) {} } public final class Machine$$anonfun$verifyComponents$3 extends AbstractFunction1<String, Map<String, String>> implements Serializable { public static final long serialVersionUID = 0L; public Machine$$anonfun$verifyComponents$3(Machine $outer) {} public final Map<String, String> apply(String address) { return (Map<String, String>)this.$outer.li$cil$oc$server$machine$Machine$$_components().$minus$eq(address); }
/*      */      }
/*      */ 
/*      */   
/*      */   public void load(NBTTagCompound nbt) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: dup
/*      */     //   2: astore_2
/*      */     //   3: monitorenter
/*      */     //   4: aload_0
/*      */     //   5: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   8: dup
/*      */     //   9: astore_3
/*      */     //   10: monitorenter
/*      */     //   11: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   14: aload_0
/*      */     //   15: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   18: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   21: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   24: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   27: astore #4
/*      */     //   29: dup
/*      */     //   30: ifnonnull -> 42
/*      */     //   33: pop
/*      */     //   34: aload #4
/*      */     //   36: ifnull -> 86
/*      */     //   39: goto -> 50
/*      */     //   42: aload #4
/*      */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   47: ifne -> 86
/*      */     //   50: aload_0
/*      */     //   51: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   54: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   57: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   60: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   63: astore #5
/*      */     //   65: dup
/*      */     //   66: ifnonnull -> 78
/*      */     //   69: pop
/*      */     //   70: aload #5
/*      */     //   72: ifnull -> 86
/*      */     //   75: goto -> 90
/*      */     //   78: aload #5
/*      */     //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   83: ifeq -> 90
/*      */     //   86: iconst_1
/*      */     //   87: goto -> 91
/*      */     //   90: iconst_0
/*      */     //   91: invokevirtual assert : (Z)V
/*      */     //   94: aload_0
/*      */     //   95: invokespecial close : ()V
/*      */     //   98: aload_0
/*      */     //   99: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   102: invokevirtual clear : ()V
/*      */     //   105: aload_0
/*      */     //   106: aload_1
/*      */     //   107: invokespecial load : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   110: aload_0
/*      */     //   111: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   114: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   117: aload_1
/*      */     //   118: ldc_w 'state'
/*      */     //   121: invokevirtual func_74759_k : (Ljava/lang/String;)[I
/*      */     //   124: invokevirtual intArrayOps : ([I)Lscala/collection/mutable/ArrayOps;
/*      */     //   127: new li/cil/oc/server/machine/Machine$$anonfun$load$1
/*      */     //   130: dup
/*      */     //   131: aload_0
/*      */     //   132: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   135: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*      */     //   138: getstatic scala/Predef$DummyImplicit$.MODULE$ : Lscala/Predef$DummyImplicit$;
/*      */     //   141: invokevirtual dummyImplicit : ()Lscala/Predef$DummyImplicit;
/*      */     //   144: invokevirtual fallbackCanBuildFrom : (Lscala/Predef$DummyImplicit;)Lscala/collection/generic/CanBuildFrom;
/*      */     //   147: invokeinterface reverseMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   152: checkcast scala/collection/TraversableOnce
/*      */     //   155: invokevirtual pushAll : (Lscala/collection/TraversableOnce;)Lscala/collection/mutable/Stack;
/*      */     //   158: pop
/*      */     //   159: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*      */     //   162: aload_1
/*      */     //   163: ldc_w 'users'
/*      */     //   166: bipush #8
/*      */     //   168: invokevirtual func_150295_c : (Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;
/*      */     //   171: invokevirtual extendNBTTagList : (Lnet/minecraft/nbt/NBTTagList;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagList;
/*      */     //   174: new li/cil/oc/server/machine/Machine$$anonfun$load$2
/*      */     //   177: dup
/*      */     //   178: aload_0
/*      */     //   179: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   182: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   185: aload_1
/*      */     //   186: ldc_w 'message'
/*      */     //   189: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*      */     //   192: ifeq -> 213
/*      */     //   195: aload_0
/*      */     //   196: new scala/Some
/*      */     //   199: dup
/*      */     //   200: aload_1
/*      */     //   201: ldc_w 'message'
/*      */     //   204: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*      */     //   207: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   210: invokespecial message_$eq : (Lscala/Option;)V
/*      */     //   213: aload_0
/*      */     //   214: invokevirtual li$cil$oc$server$machine$Machine$$_components : ()Lscala/collection/mutable/Map;
/*      */     //   217: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*      */     //   220: aload_1
/*      */     //   221: ldc_w 'components'
/*      */     //   224: bipush #10
/*      */     //   226: invokevirtual func_150295_c : (Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;
/*      */     //   229: invokevirtual extendNBTTagList : (Lnet/minecraft/nbt/NBTTagList;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagList;
/*      */     //   232: new li/cil/oc/server/machine/Machine$$anonfun$load$3
/*      */     //   235: dup
/*      */     //   236: aload_0
/*      */     //   237: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   240: invokevirtual map : (Lscala/Function1;)Lscala/collection/IndexedSeq;
/*      */     //   243: invokeinterface $plus$plus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/generic/Growable;
/*      */     //   248: pop
/*      */     //   249: aload_0
/*      */     //   250: invokevirtual tmp : ()Lscala/Option;
/*      */     //   253: new li/cil/oc/server/machine/Machine$$anonfun$load$4
/*      */     //   256: dup
/*      */     //   257: aload_0
/*      */     //   258: aload_1
/*      */     //   259: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   262: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   265: aload_0
/*      */     //   266: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   269: invokevirtual nonEmpty : ()Z
/*      */     //   272: ifeq -> 297
/*      */     //   275: aload_0
/*      */     //   276: invokevirtual isRunning : ()Z
/*      */     //   279: ifeq -> 297
/*      */     //   282: aload_0
/*      */     //   283: invokespecial init : ()Z
/*      */     //   286: ifeq -> 297
/*      */     //   289: aload_0
/*      */     //   290: aload_1
/*      */     //   291: invokespecial liftedTree1$1 : (Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/Object;
/*      */     //   294: goto -> 304
/*      */     //   297: aload_0
/*      */     //   298: invokespecial close : ()V
/*      */     //   301: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   304: pop
/*      */     //   305: aload_3
/*      */     //   306: monitorexit
/*      */     //   307: aload_2
/*      */     //   308: monitorexit
/*      */     //   309: return
/*      */     //   310: aload_3
/*      */     //   311: monitorexit
/*      */     //   312: athrow
/*      */     //   313: aload_2
/*      */     //   314: monitorexit
/*      */     //   315: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #728	-> 0
/*      */     //   #729	-> 11
/*      */     //   #730	-> 94
/*      */     //   #731	-> 98
/*      */     //   #733	-> 105
/*      */     //   #735	-> 110
/*      */     //   #736	-> 159
/*      */     //   #737	-> 185
/*      */     //   #738	-> 195
/*      */     //   #741	-> 213
/*      */     //   #744	-> 249
/*      */     //   #749	-> 265
/*      */     //   #792	-> 297
/*      */     //   #749	-> 304
/*      */     //   #728	-> 306
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	316	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	316	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   4	309	313	finally
/*      */     //   11	307	310	finally
/*      */     //   310	313	313	finally
/*      */   }
/*      */   
/*      */   public final class Machine$$anonfun$load$1
/*      */     extends AbstractFunction1<Object, Enumeration.Value> implements Serializable
/*      */   {
/*      */     public static final long serialVersionUID = 0L;
/*      */     
/*  735 */     public final Enumeration.Value apply(int x$9) { return Machine.State$.MODULE$.apply(x$9); } public Machine$$anonfun$load$1(Machine $outer) {} } public final class Machine$$anonfun$load$2 extends AbstractFunction1<NBTTagString, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagString tag) {
/*  736 */       this.$outer.li$cil$oc$server$machine$Machine$$_users().$plus$eq(tag.func_150285_a_());
/*      */     }
/*      */     public Machine$$anonfun$load$2(Machine $outer) {} }
/*      */   public final class Machine$$anonfun$load$3 extends AbstractFunction1<NBTTagCompound, Tuple2<String, String>> implements Serializable { public static final long serialVersionUID = 0L;
/*      */     public Machine$$anonfun$load$3(Machine $outer) {}
/*      */     public final Tuple2<String, String> apply(NBTTagCompound tag) {
/*  742 */       return scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(tag.func_74779_i("address")), tag.func_74779_i("name"));
/*      */     } } public final class Machine$$anonfun$load$4 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public Machine$$anonfun$load$4(Machine $outer, NBTTagCompound nbt$1) {}
/*      */     public final void apply(ManagedEnvironment fs) {
/*  745 */       if (this.nbt$1.func_74764_b("tmp")) { fs.load(this.nbt$1.func_74775_l("tmp")); }
/*  746 */       else { fs.load(li.cil.oc.common.SaveHandler$.MODULE$.loadNBT(this.nbt$1, (new StringBuilder()).append(this.$outer.node().address()).append("_tmp").toString())); }
/*      */     
/*      */     } }
/*      */   private final Object liftedTree1$1(NBTTagCompound nbt$1) { try {
/*  750 */       architecture().load(nbt$1);
/*      */       
/*  752 */       signals().$plus$plus$eq((TraversableOnce)li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(nbt$1.func_150295_c("signals", 10)).map((Function1)new Machine$$anonfun$liftedTree1$1$1(this)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  774 */       uptime_$eq(nbt$1.func_74763_f("uptime"));
/*  775 */       cpuTotal_$eq(nbt$1.func_74763_f("cpuTime"));
/*  776 */       remainingPause_$eq(nbt$1.func_74762_e("remainingPause"));
/*      */ 
/*      */       
/*  779 */       Enumeration.Value value = State$.MODULE$.Restarting(); if (state().top() == null) { state().top(); if (value != null); } else if (state().top().equals(value))
/*      */       {  }
/*      */     
/*      */     } finally {
/*      */       Exception exception = null;
/*      */ 
/*      */       
/*  786 */       (new String[2])[0] = "Unexpected error loading a state of computer at "; (new String[2])[1] = ". ";
/*  787 */       (new String[2])[0] = "State: "; (new String[2])[1] = ". Unless you're upgrading/downgrading across a major version, please report this! Thank you."; li.cil.oc.OpenComputers$.MODULE$.log().error((new StringBuilder()).append((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { host().machinePosition() }, ))).append((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { state().headOption().fold((Function0)new Machine$$anonfun$liftedTree1$1$2(this), (Function1)new Machine$$anonfun$liftedTree1$1$3(this)) }))).toString(), exception);
/*  788 */     }  return BoxedUnit.UNIT; } public final class Machine$$anonfun$liftedTree1$1$1 extends AbstractFunction1<NBTTagCompound, Signal> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public Machine$$anonfun$liftedTree1$1$1(Machine $outer) {} public final Machine.Signal apply(NBTTagCompound signalNbt) { NBTTagCompound argsNbt = signalNbt.func_74775_l("args"); int argsLength = argsNbt.func_74762_e("length"); return new Machine.Signal(signalNbt.func_74779_i("name"), (Object[])((TraversableOnce)((TraversableLike)((TraversableLike)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), argsLength).map((Function1)new Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$3(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).map((Function1)new Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$4(this, argsNbt), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).map((Function1)new Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.AnyRef())); } public final class Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$3 extends AbstractFunction1<Object, String> implements Serializable {
/*      */       public static final long serialVersionUID = 0L; public final String apply(int x$10) { return (new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(x$10)).toString(); } public Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$3(Machine$$anonfun$liftedTree1$1$1 $outer) {} } public final class Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$4 extends AbstractFunction1<String, NBTBase> implements Serializable {
/*      */       public static final long serialVersionUID = 0L; private final NBTTagCompound argsNbt$1; public final NBTBase apply(String x$1) { return this.argsNbt$1.func_74781_a(x$1); } public Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$4(Machine$$anonfun$liftedTree1$1$1 $outer, NBTTagCompound argsNbt$1) {} } public final class Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5 extends AbstractFunction1<NBTBase, Object> implements Serializable {
/*      */       public static final long serialVersionUID = 0L; public Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5(Machine$$anonfun$liftedTree1$1$1 $outer) {} public final Object apply(NBTBase x0$3) { Object object; boolean bool = false; NBTTagByte nBTTagByte = null; NBTBase nBTBase = x0$3; if (nBTBase instanceof NBTTagByte) { bool = true; nBTTagByte = (NBTTagByte)nBTBase; if (nBTTagByte.func_150290_f() == -1)
/*      */             return null;  }
/*      */          if (bool) { object = BoxesRunTime.boxToBoolean((nBTTagByte.func_150290_f() == 1)); }
/*      */         else if (nBTBase instanceof NBTTagLong) { NBTTagLong nBTTagLong = (NBTTagLong)nBTBase; object = BoxesRunTime.boxToLong(nBTTagLong.func_150291_c()); }
/*      */         else if (nBTBase instanceof NBTTagDouble) { NBTTagDouble nBTTagDouble = (NBTTagDouble)nBTBase; object = BoxesRunTime.boxToDouble(nBTTagDouble.func_150286_g()); }
/*      */         else if (nBTBase instanceof NBTTagString) { NBTTagString nBTTagString = (NBTTagString)nBTBase; object = nBTTagString.func_150285_a_(); }
/*      */         else if (nBTBase instanceof NBTTagByteArray) { NBTTagByteArray nBTTagByteArray = (NBTTagByteArray)nBTBase; object = nBTTagByteArray.func_150292_c(); }
/*      */         else if (nBTBase instanceof NBTTagList) { NBTTagList nBTTagList = (NBTTagList)nBTBase; Map data = scala.collection.mutable.Map$.MODULE$.empty(); scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), nBTTagList.func_74745_c()).by(2).foreach((Function1)new Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5$$anonfun$apply$6(this, data, nBTTagList)); object = data; }
/*      */         else if (nBTBase instanceof NBTTagCompound)
/*      */         { NBTTagCompound nBTTagCompound = (NBTTagCompound)nBTBase; }
/*      */         else
/*      */         { object = null; }
/*      */          return object; } public final class Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5$$anonfun$apply$6 extends AbstractFunction1<Object, Map<String, String>> implements Serializable {
/*      */         public static final long serialVersionUID = 0L; private final Map data$1; private final NBTTagList x8$1; public Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5$$anonfun$apply$6(Machine$$anonfun$liftedTree1$1$1$$anonfun$apply$5 $outer, Map data$1, NBTTagList x8$1) {} public final Map<String, String> apply(int i) { return (Map<String, String>)this.data$1.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(this.x8$1.func_150307_f(i)), this.x8$1.func_150307_f(i + 1))); } } } } public final class Machine$$anonfun$liftedTree1$1$2 extends AbstractFunction0<String> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final String apply() { return "no state"; }
/*      */     public Machine$$anonfun$liftedTree1$1$2(Machine $outer) {} }
/*      */   public final class Machine$$anonfun$liftedTree1$1$3 extends AbstractFunction1<Enumeration.Value, String> implements Serializable {
/*      */     public static final long serialVersionUID = 0L;
/*      */     public final String apply(Enumeration.Value x$11) { return x$11.toString(); }
/*      */     public Machine$$anonfun$liftedTree1$1$3(Machine $outer) {} }
/*      */   public synchronized void save(NBTTagCompound nbt) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_2
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual isExecuting : ()Z
/*      */     //   11: ifeq -> 17
/*      */     //   14: aload_2
/*      */     //   15: monitorexit
/*      */     //   16: return
/*      */     //   17: getstatic li/cil/oc/common/SaveHandler$.MODULE$ : Lli/cil/oc/common/SaveHandler$;
/*      */     //   20: invokevirtual savingForClients : ()Z
/*      */     //   23: ifeq -> 29
/*      */     //   26: aload_2
/*      */     //   27: monitorexit
/*      */     //   28: return
/*      */     //   29: aload_0
/*      */     //   30: ldc2_w 0.05
/*      */     //   33: invokevirtual pause : (D)Z
/*      */     //   36: pop
/*      */     //   37: aload_0
/*      */     //   38: aload_1
/*      */     //   39: invokespecial save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   42: aload_0
/*      */     //   43: invokespecial processAddedComponents : ()V
/*      */     //   46: aload_1
/*      */     //   47: ldc_w 'state'
/*      */     //   50: aload_0
/*      */     //   51: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   54: new li/cil/oc/server/machine/Machine$$anonfun$save$1
/*      */     //   57: dup
/*      */     //   58: aload_0
/*      */     //   59: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   62: getstatic scala/collection/mutable/Stack$.MODULE$ : Lscala/collection/mutable/Stack$;
/*      */     //   65: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*      */     //   68: invokevirtual map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*      */     //   71: checkcast scala/collection/TraversableOnce
/*      */     //   74: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*      */     //   77: invokevirtual Int : ()Lscala/reflect/ClassTag;
/*      */     //   80: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*      */     //   85: checkcast [I
/*      */     //   88: invokevirtual func_74783_a : (Ljava/lang/String;[I)V
/*      */     //   91: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*      */     //   94: aload_1
/*      */     //   95: invokevirtual extendNBTTagCompound : (Lnet/minecraft/nbt/NBTTagCompound;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagCompound;
/*      */     //   98: ldc_w 'users'
/*      */     //   101: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*      */     //   104: aload_0
/*      */     //   105: invokevirtual li$cil$oc$server$machine$Machine$$_users : ()Lscala/collection/mutable/Set;
/*      */     //   108: invokevirtual stringIterableToNbt : (Lscala/collection/Iterable;)Lscala/collection/Iterable;
/*      */     //   111: invokevirtual setNewTagList : (Ljava/lang/String;Lscala/collection/Iterable;)Lnet/minecraft/nbt/NBTTagCompound;
/*      */     //   114: pop
/*      */     //   115: aload_0
/*      */     //   116: invokespecial message : ()Lscala/Option;
/*      */     //   119: new li/cil/oc/server/machine/Machine$$anonfun$save$2
/*      */     //   122: dup
/*      */     //   123: aload_0
/*      */     //   124: aload_1
/*      */     //   125: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   128: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   131: new net/minecraft/nbt/NBTTagList
/*      */     //   134: dup
/*      */     //   135: invokespecial <init> : ()V
/*      */     //   138: astore_3
/*      */     //   139: aload_0
/*      */     //   140: invokevirtual li$cil$oc$server$machine$Machine$$_components : ()Lscala/collection/mutable/Map;
/*      */     //   143: new li/cil/oc/server/machine/Machine$$anonfun$save$3
/*      */     //   146: dup
/*      */     //   147: aload_0
/*      */     //   148: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   151: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*      */     //   156: new li/cil/oc/server/machine/Machine$$anonfun$save$4
/*      */     //   159: dup
/*      */     //   160: aload_0
/*      */     //   161: aload_3
/*      */     //   162: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lnet/minecraft/nbt/NBTTagList;)V
/*      */     //   165: invokeinterface foreach : (Lscala/Function1;)V
/*      */     //   170: aload_1
/*      */     //   171: ldc_w 'components'
/*      */     //   174: aload_3
/*      */     //   175: invokevirtual func_74782_a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
/*      */     //   178: aload_0
/*      */     //   179: invokevirtual tmp : ()Lscala/Option;
/*      */     //   182: new li/cil/oc/server/machine/Machine$$anonfun$save$5
/*      */     //   185: dup
/*      */     //   186: aload_0
/*      */     //   187: aload_1
/*      */     //   188: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   191: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   194: aload_0
/*      */     //   195: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   198: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   201: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   204: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   207: astore #4
/*      */     //   209: dup
/*      */     //   210: ifnonnull -> 222
/*      */     //   213: pop
/*      */     //   214: aload #4
/*      */     //   216: ifnull -> 230
/*      */     //   219: goto -> 236
/*      */     //   222: aload #4
/*      */     //   224: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   227: ifeq -> 236
/*      */     //   230: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   233: goto -> 244
/*      */     //   236: aload_0
/*      */     //   237: aload_1
/*      */     //   238: invokespecial liftedTree2$1 : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*      */     //   241: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   244: pop
/*      */     //   245: aload_2
/*      */     //   246: monitorexit
/*      */     //   247: return
/*      */     //   248: aload_2
/*      */     //   249: monitorexit
/*      */     //   250: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #796	-> 0
/*      */     //   #801	-> 7
/*      */     //   #803	-> 17
/*      */     //   #804	-> 28
/*      */     //   #808	-> 29
/*      */     //   #810	-> 37
/*      */     //   #813	-> 42
/*      */     //   #815	-> 46
/*      */     //   #816	-> 91
/*      */     //   #817	-> 115
/*      */     //   #819	-> 131
/*      */     //   #820	-> 139
/*      */     //   #826	-> 170
/*      */     //   #828	-> 178
/*      */     //   #830	-> 194
/*      */     //   #796	-> 246
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	251	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	251	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*      */     //   139	106	3	componentsNbt	Lnet/minecraft/nbt/NBTTagList;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	247	248	finally }
/*      */   public final class Machine$$anonfun$save$1 extends AbstractFunction1<Enumeration.Value, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  815 */     public final int apply(Enumeration.Value x$12) { return x$12.id(); }
/*      */      public Machine$$anonfun$save$1(Machine $outer) {} } public final class Machine$$anonfun$save$2 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(String x$13) {
/*  817 */       this.nbt$2.func_74778_a("message", x$13);
/*      */     } public Machine$$anonfun$save$2(Machine $outer, NBTTagCompound nbt$2) {} } public final class Machine$$anonfun$save$3 extends AbstractFunction1<Tuple2<String, String>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*      */     public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool;
/*  820 */       Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Machine$$anonfun$save$3(Machine $outer) {} } public final class Machine$$anonfun$save$4 extends AbstractFunction1<Tuple2<String, String>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList componentsNbt$1; public final void apply(Tuple2 x$14) { Tuple2 tuple2 = x$14; if (tuple2 != null) { String address = (String)tuple2._1(), name = (String)tuple2._2();
/*  821 */         NBTTagCompound componentNbt = new NBTTagCompound();
/*  822 */         componentNbt.func_74778_a("address", address);
/*  823 */         componentNbt.func_74778_a("name", name);
/*  824 */         this.componentsNbt$1.func_74742_a((NBTBase)componentNbt); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*      */         return; }
/*      */       
/*      */       throw new MatchError(tuple2); } public Machine$$anonfun$save$4(Machine $outer, NBTTagList componentsNbt$1) {} } public final class Machine$$anonfun$save$5 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2;
/*  828 */     public final void apply(ManagedEnvironment fs) { li.cil.oc.common.SaveHandler$.MODULE$.scheduleSave(this.$outer.host(), this.nbt$2, (new StringBuilder()).append(this.$outer.node().address()).append("_tmp").toString(), (Function1)new Machine$$anonfun$save$5$$anonfun$apply$7(this, fs)); } public Machine$$anonfun$save$5(Machine $outer, NBTTagCompound nbt$2) {} public final class Machine$$anonfun$save$5$$anonfun$apply$7 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ManagedEnvironment fs$1; public final void apply(NBTTagCompound x$1) { this.fs$1.save(x$1); }
/*      */        public Machine$$anonfun$save$5$$anonfun$apply$7(Machine$$anonfun$save$5 $outer, ManagedEnvironment fs$1) {} } }
/*      */   private final void liftedTree2$1(NBTTagCompound nbt$2) { 
/*  831 */     try { architecture().save(nbt$2);
/*      */       
/*  833 */       NBTTagList signalsNbt = new NBTTagList();
/*  834 */       signals().iterator().foreach((Function1)new Machine$$anonfun$liftedTree2$1$1(this, signalsNbt));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  859 */       nbt$2.func_74782_a("signals", (NBTBase)signalsNbt);
/*      */       
/*  861 */       nbt$2.func_74772_a("uptime", uptime());
/*  862 */       nbt$2.func_74772_a("cpuTime", cpuTotal());
/*  863 */       nbt$2.func_74768_a("remainingPause", remainingPause()); }
/*      */     finally
/*      */     { Exception exception = null;
/*      */ 
/*      */       
/*  868 */       (new String[2])[0] = "Unexpected error saving a state of computer at "; (new String[2])[1] = ". ";
/*  869 */       (new String[2])[0] = "State: "; (new String[2])[1] = ". Unless you're upgrading/downgrading across a major version, please report this! Thank you."; }  } public final class Machine$$anonfun$liftedTree2$1$1 extends AbstractFunction1<Signal, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList signalsNbt$1; public Machine$$anonfun$liftedTree2$1$1(Machine $outer, NBTTagList signalsNbt$1) {} public final void apply(Machine.Signal s) { NBTTagCompound signalNbt = new NBTTagCompound(); signalNbt.func_74778_a("name", s.name()); li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(signalNbt).setNewCompoundTag("args", (Function1)new Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8(this, s)); this.signalsNbt$1.func_74742_a((NBTBase)signalNbt); } public final class Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Machine.Signal s$1; public Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8(Machine$$anonfun$liftedTree2$1$1 $outer, Machine.Signal s$1) {} public final void apply(NBTTagCompound args) { args.func_74768_a("length", (this.s$1.args()).length); scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps(this.s$1.args()).zipWithIndex(scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9(this, args)); } public final class Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound args$1; public final void apply(Tuple2 x0$4) { Tuple2 tuple2 = x0$4; if (tuple2 != null) { Object object = tuple2._1(); int i = tuple2._2$mcI$sp(); if (object == null) { this.args$1.func_74774_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), (byte)-1); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof Boolean) { Boolean bool = (Boolean)arg; this.args$1.func_74774_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Boolean2boolean(bool) ? 1 : 0); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof Long) { Long long_ = (Long)arg; this.args$1.func_74772_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Long2long(long_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof Double) { Double double_ = (Double)arg; this.args$1.func_74780_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), scala.Predef$.MODULE$.Double2double(double_)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof String) { String str = (String)arg; this.args$1.func_74778_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), str); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof byte[]) { byte[] arrayOfByte = (byte[])arg; this.args$1.func_74773_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), arrayOfByte); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof Map) { Map map = (Map)arg; NBTTagList list = new NBTTagList(); map.withFilter((Function1)new Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$10(this)).foreach((Function1)new Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$11(this, list)); this.args$1.func_74782_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), (NBTBase)list); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { Object arg = tuple2._1(); int i = tuple2._2$mcI$sp(); if (arg instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)arg; this.args$1.func_74782_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), (NBTBase)nBTTagCompound); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  }  if (tuple2 != null) { int i = tuple2._2$mcI$sp(); this.args$1.func_74774_a((new StringBuilder()).append("arg").append(BoxesRunTime.boxToInteger(i)).toString(), (byte)-1); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9(Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8 $outer, NBTTagCompound args$1) {} public final class Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$10 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$4) { boolean bool; Tuple2 tuple2 = check$ifrefutable$4; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$10(Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9 $outer) {} } public final class Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$11 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList list$1; public final void apply(Tuple2 x$15) { Tuple2 tuple2 = x$15; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); (new NBTBase[1])[0] = (NBTBase)li.cil.oc.util.ExtendedNBT$.MODULE$.toNbt(key.toString()); li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(this.list$1).append((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new NBTBase[1])); (new NBTBase[1])[0] = (NBTBase)li.cil.oc.util.ExtendedNBT$.MODULE$.toNbt(value.toString()); li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(this.list$1).append((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new NBTBase[1])); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9$$anonfun$apply$11(Machine$$anonfun$liftedTree2$1$1$$anonfun$apply$8$$anonfun$apply$9 $outer, NBTTagList list$1) {} } } } } public final class Machine$$anonfun$liftedTree2$1$2 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return "no state"; } public Machine$$anonfun$liftedTree2$1$2(Machine $outer) {} } public final class Machine$$anonfun$liftedTree2$1$3 extends AbstractFunction1<Enumeration.Value, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Enumeration.Value x$16) { return x$16.toString(); }
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$liftedTree2$1$3(Machine $outer) {} }
/*      */ 
/*      */   
/*      */   private boolean init() {
/*  876 */     onHostChanged();
/*  877 */     if (architecture() == null) return false;
/*      */ 
/*      */     
/*  880 */     message_$eq((Option<String>)scala.None$.MODULE$);
/*      */ 
/*      */     
/*  883 */     signals().clear();
/*      */ 
/*      */ 
/*      */     
/*  887 */     if (node().network() != null) {
/*  888 */       tmp().foreach((Function1)new Machine$$anonfun$init$1(this));
/*      */     }
/*      */     
/*      */     try {
/*  892 */       return architecture().initialize();
/*      */     } finally {
/*      */       Exception exception = null;
/*      */       
/*  896 */       li.cil.oc.OpenComputers$.MODULE$.log().warn("Failed initializing computer.", exception);
/*  897 */       close();
/*      */     } 
/*      */   } public final class Machine$$anonfun$init$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final void apply(ManagedEnvironment fs) {
/*      */       this.$outer.node().connect(fs.node());
/*      */     }
/*      */     public Machine$$anonfun$init$1(Machine $outer) {} }
/*      */   public boolean tryClose() {
/*  905 */     close();
/*  906 */     tmp().foreach((Function1)new Machine$$anonfun$tryClose$1(this));
/*  907 */     if (node().network() != null) {
/*  908 */       tmp().foreach((Function1)new Machine$$anonfun$tryClose$2(this));
/*      */     }
/*  910 */     node().sendToReachable("computer.stopped", new Object[0]);
/*      */     return !isExecuting();
/*      */   } public final class Machine$$anonfun$tryClose$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final void apply(ManagedEnvironment x$17) {
/*      */       x$17.node().remove();
/*      */     } public Machine$$anonfun$tryClose$1(Machine $outer) {} } public final class Machine$$anonfun$tryClose$2 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable {
/*      */     public static final long serialVersionUID = 0L; public final void apply(ManagedEnvironment tmp) {
/*      */       this.$outer.node().connect(tmp.node());
/*      */     } public Machine$$anonfun$tryClose$2(Machine $outer) {} } private void close() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_1
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual isEmpty : ()Z
/*      */     //   14: ifne -> 54
/*      */     //   17: aload_0
/*      */     //   18: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   21: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   24: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   27: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   30: astore_3
/*      */     //   31: dup
/*      */     //   32: ifnonnull -> 43
/*      */     //   35: pop
/*      */     //   36: aload_3
/*      */     //   37: ifnull -> 50
/*      */     //   40: goto -> 54
/*      */     //   43: aload_3
/*      */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   47: ifeq -> 54
/*      */     //   50: iconst_0
/*      */     //   51: goto -> 55
/*      */     //   54: iconst_1
/*      */     //   55: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   58: astore_2
/*      */     //   59: aload_1
/*      */     //   60: monitorexit
/*      */     //   61: aload_2
/*      */     //   62: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 169
/*      */     //   68: aload_0
/*      */     //   69: dup
/*      */     //   70: astore #4
/*      */     //   72: monitorenter
/*      */     //   73: aload_0
/*      */     //   74: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   77: dup
/*      */     //   78: astore #5
/*      */     //   80: monitorenter
/*      */     //   81: aload_0
/*      */     //   82: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   85: invokevirtual clear : ()V
/*      */     //   88: aload_0
/*      */     //   89: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   92: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   95: invokevirtual Stopped : ()Lscala/Enumeration$Value;
/*      */     //   98: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   101: pop
/*      */     //   102: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   105: aload_0
/*      */     //   106: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   109: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   112: new li/cil/oc/server/machine/Machine$$anonfun$close$1
/*      */     //   115: dup
/*      */     //   116: aload_0
/*      */     //   117: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   120: invokevirtual foreach : (Lscala/Function1;)V
/*      */     //   123: aload_0
/*      */     //   124: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   127: invokevirtual clear : ()V
/*      */     //   130: aload_0
/*      */     //   131: lconst_0
/*      */     //   132: invokespecial uptime_$eq : (J)V
/*      */     //   135: aload_0
/*      */     //   136: lconst_0
/*      */     //   137: invokespecial cpuTotal_$eq : (J)V
/*      */     //   140: aload_0
/*      */     //   141: lconst_0
/*      */     //   142: invokespecial cpuStart_$eq : (J)V
/*      */     //   145: aload_0
/*      */     //   146: iconst_0
/*      */     //   147: invokespecial remainIdle_$eq : (I)V
/*      */     //   150: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   153: pop
/*      */     //   154: aload #5
/*      */     //   156: monitorexit
/*      */     //   157: aload #4
/*      */     //   159: monitorexit
/*      */     //   160: aload_0
/*      */     //   161: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   164: invokeinterface markChanged : ()V
/*      */     //   169: return
/*      */     //   170: aload_1
/*      */     //   171: monitorexit
/*      */     //   172: athrow
/*      */     //   173: aload #5
/*      */     //   175: monitorexit
/*      */     //   176: athrow
/*      */     //   177: aload #4
/*      */     //   179: monitorexit
/*      */     //   180: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #915	-> 0
/*      */     //   #918	-> 68
/*      */     //   #919	-> 81
/*      */     //   #920	-> 88
/*      */     //   #921	-> 102
/*      */     //   #922	-> 123
/*      */     //   #923	-> 130
/*      */     //   #924	-> 135
/*      */     //   #925	-> 140
/*      */     //   #926	-> 145
/*      */     //   #918	-> 156
/*      */     //   #930	-> 160
/*      */     //   #915	-> 169
/*      */     //   #918	-> 173
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	181	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	61	170	finally
/*      */     //   73	160	177	finally
/*      */     //   81	157	173	finally
/*      */     //   173	177	177	finally
/*      */   } public final class Machine$$anonfun$close$1 extends AbstractFunction1<Architecture, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Architecture x$18) {
/*  921 */       x$18.close();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$close$1(Machine $outer) {} }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Enumeration.Value switchTo(Enumeration.Value value) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_2
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   14: checkcast scala/Enumeration$Value
/*      */     //   17: astore #4
/*      */     //   19: aload_1
/*      */     //   20: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   23: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   26: astore #5
/*      */     //   28: dup
/*      */     //   29: ifnonnull -> 41
/*      */     //   32: pop
/*      */     //   33: aload #5
/*      */     //   35: ifnull -> 79
/*      */     //   38: goto -> 49
/*      */     //   41: aload #5
/*      */     //   43: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   46: ifne -> 79
/*      */     //   49: aload_1
/*      */     //   50: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   53: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   56: astore #6
/*      */     //   58: dup
/*      */     //   59: ifnonnull -> 71
/*      */     //   62: pop
/*      */     //   63: aload #6
/*      */     //   65: ifnull -> 79
/*      */     //   68: goto -> 86
/*      */     //   71: aload #6
/*      */     //   73: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   76: ifeq -> 86
/*      */     //   79: aload_0
/*      */     //   80: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   83: invokevirtual clear : ()V
/*      */     //   86: aload_0
/*      */     //   87: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   90: aload_1
/*      */     //   91: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   94: pop
/*      */     //   95: aload_1
/*      */     //   96: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   99: invokevirtual Yielded : ()Lscala/Enumeration$Value;
/*      */     //   102: astore #7
/*      */     //   104: dup
/*      */     //   105: ifnonnull -> 117
/*      */     //   108: pop
/*      */     //   109: aload #7
/*      */     //   111: ifnull -> 155
/*      */     //   114: goto -> 125
/*      */     //   117: aload #7
/*      */     //   119: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   122: ifne -> 155
/*      */     //   125: aload_1
/*      */     //   126: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   129: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*      */     //   132: astore #8
/*      */     //   134: dup
/*      */     //   135: ifnonnull -> 147
/*      */     //   138: pop
/*      */     //   139: aload #8
/*      */     //   141: ifnull -> 155
/*      */     //   144: goto -> 188
/*      */     //   147: aload #8
/*      */     //   149: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   152: ifeq -> 188
/*      */     //   155: aload_0
/*      */     //   156: iconst_0
/*      */     //   157: invokespecial remainIdle_$eq : (I)V
/*      */     //   160: getstatic li/cil/oc/server/machine/Machine$.MODULE$ : Lli/cil/oc/server/machine/Machine$;
/*      */     //   163: invokevirtual li$cil$oc$server$machine$Machine$$threadPool : ()Ljava/util/concurrent/ScheduledExecutorService;
/*      */     //   166: aload_0
/*      */     //   167: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*      */     //   170: invokevirtual get : ()Lli/cil/oc/Settings;
/*      */     //   173: invokevirtual executionDelay : ()I
/*      */     //   176: i2l
/*      */     //   177: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*      */     //   180: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
/*      */     //   185: goto -> 191
/*      */     //   188: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   191: pop
/*      */     //   192: aload_0
/*      */     //   193: invokevirtual host : ()Lli/cil/oc/api/machine/MachineHost;
/*      */     //   196: invokeinterface markChanged : ()V
/*      */     //   201: aload #4
/*      */     //   203: astore_3
/*      */     //   204: aload_2
/*      */     //   205: monitorexit
/*      */     //   206: aload_3
/*      */     //   207: checkcast scala/Enumeration$Value
/*      */     //   210: areturn
/*      */     //   211: aload_2
/*      */     //   212: monitorexit
/*      */     //   213: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #935	-> 0
/*      */     //   #936	-> 7
/*      */     //   #937	-> 19
/*      */     //   #938	-> 79
/*      */     //   #940	-> 86
/*      */     //   #941	-> 95
/*      */     //   #942	-> 155
/*      */     //   #943	-> 160
/*      */     //   #941	-> 188
/*      */     //   #947	-> 192
/*      */     //   #949	-> 201
/*      */     //   #935	-> 205
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	214	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   0	214	1	value	Lscala/Enumeration$Value;
/*      */     //   19	184	4	result	Lscala/Enumeration$Value;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	206	211	finally
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isGamePaused() {
/*  952 */     if (!MinecraftServer.func_71276_C().func_71262_S()) { boolean bool; MinecraftServer minecraftServer = MinecraftServer.func_71276_C();
/*  953 */       if (minecraftServer instanceof net.minecraft.server.integrated.IntegratedServer) { bool = Minecraft.func_71410_x().func_147113_T(); }
/*  954 */       else { bool = false; }
/*      */       
/*      */       if (bool); }
/*      */     
/*      */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void run() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   4: dup
/*      */     //   5: astore_2
/*      */     //   6: monitorenter
/*      */     //   7: aload_0
/*      */     //   8: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   11: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   14: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   17: invokevirtual Yielded : ()Lscala/Enumeration$Value;
/*      */     //   20: astore #4
/*      */     //   22: dup
/*      */     //   23: ifnonnull -> 35
/*      */     //   26: pop
/*      */     //   27: aload #4
/*      */     //   29: ifnull -> 79
/*      */     //   32: goto -> 43
/*      */     //   35: aload #4
/*      */     //   37: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   40: ifne -> 79
/*      */     //   43: aload_0
/*      */     //   44: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   47: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   50: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   53: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*      */     //   56: astore #5
/*      */     //   58: dup
/*      */     //   59: ifnonnull -> 71
/*      */     //   62: pop
/*      */     //   63: aload #5
/*      */     //   65: ifnull -> 79
/*      */     //   68: goto -> 862
/*      */     //   71: aload #5
/*      */     //   73: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   76: ifeq -> 862
/*      */     //   79: aload_0
/*      */     //   80: invokespecial isGamePaused : ()Z
/*      */     //   83: ifeq -> 103
/*      */     //   86: aload_0
/*      */     //   87: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   90: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   93: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   96: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   99: pop
/*      */     //   100: aload_2
/*      */     //   101: monitorexit
/*      */     //   102: return
/*      */     //   103: aload_0
/*      */     //   104: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   107: invokevirtual Running : ()Lscala/Enumeration$Value;
/*      */     //   110: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   113: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   116: invokevirtual SynchronizedReturn : ()Lscala/Enumeration$Value;
/*      */     //   119: astore #6
/*      */     //   121: dup
/*      */     //   122: ifnonnull -> 134
/*      */     //   125: pop
/*      */     //   126: aload #6
/*      */     //   128: ifnull -> 142
/*      */     //   131: goto -> 146
/*      */     //   134: aload #6
/*      */     //   136: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   139: ifeq -> 146
/*      */     //   142: iconst_1
/*      */     //   143: goto -> 147
/*      */     //   146: iconst_0
/*      */     //   147: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   150: astore_3
/*      */     //   151: aload_2
/*      */     //   152: monitorexit
/*      */     //   153: aload_3
/*      */     //   154: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*      */     //   157: istore_1
/*      */     //   158: aload_0
/*      */     //   159: invokestatic nanoTime : ()J
/*      */     //   162: invokespecial cpuStart_$eq : (J)V
/*      */     //   165: aload_0
/*      */     //   166: invokevirtual architecture : ()Lli/cil/oc/api/machine/Architecture;
/*      */     //   169: iload_1
/*      */     //   170: invokeinterface runThreaded : (Z)Lli/cil/oc/api/machine/ExecutionResult;
/*      */     //   175: astore #8
/*      */     //   177: aload_0
/*      */     //   178: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   181: dup
/*      */     //   182: astore #9
/*      */     //   184: monitorenter
/*      */     //   185: aload_0
/*      */     //   186: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   189: invokevirtual top : ()Ljava/lang/Object;
/*      */     //   192: checkcast scala/Enumeration$Value
/*      */     //   195: astore #11
/*      */     //   197: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   200: invokevirtual Running : ()Lscala/Enumeration$Value;
/*      */     //   203: aload #11
/*      */     //   205: astore #12
/*      */     //   207: dup
/*      */     //   208: ifnonnull -> 220
/*      */     //   211: pop
/*      */     //   212: aload #12
/*      */     //   214: ifnull -> 228
/*      */     //   217: goto -> 469
/*      */     //   220: aload #12
/*      */     //   222: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   225: ifeq -> 469
/*      */     //   228: aload #8
/*      */     //   230: astore #14
/*      */     //   232: aload #14
/*      */     //   234: instanceof li/cil/oc/api/machine/ExecutionResult$Sleep
/*      */     //   237: ifeq -> 322
/*      */     //   240: aload #14
/*      */     //   242: checkcast li/cil/oc/api/machine/ExecutionResult$Sleep
/*      */     //   245: astore #15
/*      */     //   247: aload_0
/*      */     //   248: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   251: dup
/*      */     //   252: astore #17
/*      */     //   254: monitorenter
/*      */     //   255: aload_0
/*      */     //   256: invokespecial signals : ()Lscala/collection/mutable/Queue;
/*      */     //   259: invokevirtual isEmpty : ()Z
/*      */     //   262: ifeq -> 300
/*      */     //   265: aload #15
/*      */     //   267: getfield ticks : I
/*      */     //   270: iconst_0
/*      */     //   271: if_icmple -> 300
/*      */     //   274: aload_0
/*      */     //   275: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   278: invokevirtual Sleeping : ()Lscala/Enumeration$Value;
/*      */     //   281: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   284: pop
/*      */     //   285: aload_0
/*      */     //   286: aload #15
/*      */     //   288: getfield ticks : I
/*      */     //   291: invokespecial remainIdle_$eq : (I)V
/*      */     //   294: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   297: goto -> 310
/*      */     //   300: aload_0
/*      */     //   301: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   304: invokevirtual Yielded : ()Lscala/Enumeration$Value;
/*      */     //   307: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   310: astore #18
/*      */     //   312: aload #17
/*      */     //   314: monitorexit
/*      */     //   315: aload #18
/*      */     //   317: astore #16
/*      */     //   319: goto -> 452
/*      */     //   322: aload #14
/*      */     //   324: instanceof li/cil/oc/api/machine/ExecutionResult$SynchronizedCall
/*      */     //   327: ifeq -> 345
/*      */     //   330: aload_0
/*      */     //   331: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   334: invokevirtual SynchronizedCall : ()Lscala/Enumeration$Value;
/*      */     //   337: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   340: astore #16
/*      */     //   342: goto -> 452
/*      */     //   345: aload #14
/*      */     //   347: instanceof li/cil/oc/api/machine/ExecutionResult$Shutdown
/*      */     //   350: ifeq -> 396
/*      */     //   353: aload #14
/*      */     //   355: checkcast li/cil/oc/api/machine/ExecutionResult$Shutdown
/*      */     //   358: astore #19
/*      */     //   360: aload #19
/*      */     //   362: getfield reboot : Z
/*      */     //   365: ifeq -> 381
/*      */     //   368: aload_0
/*      */     //   369: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   372: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   375: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   378: goto -> 391
/*      */     //   381: aload_0
/*      */     //   382: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   385: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   388: invokespecial switchTo : (Lscala/Enumeration$Value;)Lscala/Enumeration$Value;
/*      */     //   391: astore #16
/*      */     //   393: goto -> 452
/*      */     //   396: aload #14
/*      */     //   398: instanceof li/cil/oc/api/machine/ExecutionResult$Error
/*      */     //   401: ifeq -> 459
/*      */     //   404: aload #14
/*      */     //   406: checkcast li/cil/oc/api/machine/ExecutionResult$Error
/*      */     //   409: astore #20
/*      */     //   411: aload_0
/*      */     //   412: ldc_w '--'
/*      */     //   415: invokevirtual beep : (Ljava/lang/String;)V
/*      */     //   418: aload_0
/*      */     //   419: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   422: aload #20
/*      */     //   424: getfield message : Ljava/lang/String;
/*      */     //   427: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   430: new li/cil/oc/server/machine/Machine$$anonfun$run$1
/*      */     //   433: dup
/*      */     //   434: aload_0
/*      */     //   435: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   438: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*      */     //   441: checkcast java/lang/String
/*      */     //   444: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   447: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   450: astore #16
/*      */     //   452: aload #16
/*      */     //   454: astore #13
/*      */     //   456: goto -> 817
/*      */     //   459: new scala/MatchError
/*      */     //   462: dup
/*      */     //   463: aload #14
/*      */     //   465: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   468: athrow
/*      */     //   469: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   472: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   475: aload #11
/*      */     //   477: astore #21
/*      */     //   479: dup
/*      */     //   480: ifnonnull -> 492
/*      */     //   483: pop
/*      */     //   484: aload #21
/*      */     //   486: ifnull -> 500
/*      */     //   489: goto -> 725
/*      */     //   492: aload #21
/*      */     //   494: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   497: ifeq -> 725
/*      */     //   500: aload_0
/*      */     //   501: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   504: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   507: pop
/*      */     //   508: aload_0
/*      */     //   509: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   512: invokevirtual pop : ()Ljava/lang/Object;
/*      */     //   515: pop
/*      */     //   516: aload #8
/*      */     //   518: astore #22
/*      */     //   520: aload #22
/*      */     //   522: instanceof li/cil/oc/api/machine/ExecutionResult$Sleep
/*      */     //   525: ifeq -> 562
/*      */     //   528: aload #22
/*      */     //   530: checkcast li/cil/oc/api/machine/ExecutionResult$Sleep
/*      */     //   533: astore #23
/*      */     //   535: aload_0
/*      */     //   536: aload #23
/*      */     //   538: getfield ticks : I
/*      */     //   541: invokespecial remainIdle_$eq : (I)V
/*      */     //   544: aload_0
/*      */     //   545: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   548: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   551: invokevirtual Sleeping : ()Lscala/Enumeration$Value;
/*      */     //   554: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   557: astore #24
/*      */     //   559: goto -> 694
/*      */     //   562: aload #22
/*      */     //   564: instanceof li/cil/oc/api/machine/ExecutionResult$SynchronizedCall
/*      */     //   567: ifeq -> 588
/*      */     //   570: aload_0
/*      */     //   571: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   574: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   577: invokevirtual SynchronizedCall : ()Lscala/Enumeration$Value;
/*      */     //   580: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   583: astore #24
/*      */     //   585: goto -> 694
/*      */     //   588: aload #22
/*      */     //   590: instanceof li/cil/oc/api/machine/ExecutionResult$Shutdown
/*      */     //   593: ifeq -> 645
/*      */     //   596: aload #22
/*      */     //   598: checkcast li/cil/oc/api/machine/ExecutionResult$Shutdown
/*      */     //   601: astore #25
/*      */     //   603: aload #25
/*      */     //   605: getfield reboot : Z
/*      */     //   608: ifeq -> 627
/*      */     //   611: aload_0
/*      */     //   612: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   615: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   618: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   621: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   624: goto -> 640
/*      */     //   627: aload_0
/*      */     //   628: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   631: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   634: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   637: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   640: astore #24
/*      */     //   642: goto -> 694
/*      */     //   645: aload #22
/*      */     //   647: instanceof li/cil/oc/api/machine/ExecutionResult$Error
/*      */     //   650: ifeq -> 715
/*      */     //   653: aload #22
/*      */     //   655: checkcast li/cil/oc/api/machine/ExecutionResult$Error
/*      */     //   658: astore #26
/*      */     //   660: aload_0
/*      */     //   661: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*      */     //   664: aload #26
/*      */     //   666: getfield message : Ljava/lang/String;
/*      */     //   669: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*      */     //   672: new li/cil/oc/server/machine/Machine$$anonfun$run$2
/*      */     //   675: dup
/*      */     //   676: aload_0
/*      */     //   677: invokespecial <init> : (Lli/cil/oc/server/machine/Machine;)V
/*      */     //   680: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*      */     //   683: checkcast java/lang/String
/*      */     //   686: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   689: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   692: astore #24
/*      */     //   694: aload #24
/*      */     //   696: pop
/*      */     //   697: aload_0
/*      */     //   698: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   701: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   704: invokevirtual Paused : ()Lscala/Enumeration$Value;
/*      */     //   707: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   710: astore #13
/*      */     //   712: goto -> 817
/*      */     //   715: new scala/MatchError
/*      */     //   718: dup
/*      */     //   719: aload #22
/*      */     //   721: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   724: athrow
/*      */     //   725: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   728: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   731: aload #11
/*      */     //   733: astore #27
/*      */     //   735: dup
/*      */     //   736: ifnonnull -> 748
/*      */     //   739: pop
/*      */     //   740: aload #27
/*      */     //   742: ifnull -> 756
/*      */     //   745: goto -> 781
/*      */     //   748: aload #27
/*      */     //   750: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   753: ifeq -> 781
/*      */     //   756: aload_0
/*      */     //   757: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   760: invokevirtual clear : ()V
/*      */     //   763: aload_0
/*      */     //   764: invokevirtual state : ()Lscala/collection/mutable/Stack;
/*      */     //   767: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   770: invokevirtual Stopping : ()Lscala/Enumeration$Value;
/*      */     //   773: invokevirtual push : (Ljava/lang/Object;)Lscala/collection/mutable/Stack;
/*      */     //   776: astore #13
/*      */     //   778: goto -> 817
/*      */     //   781: getstatic li/cil/oc/server/machine/Machine$State$.MODULE$ : Lli/cil/oc/server/machine/Machine$State$;
/*      */     //   784: invokevirtual Restarting : ()Lscala/Enumeration$Value;
/*      */     //   787: aload #11
/*      */     //   789: astore #28
/*      */     //   791: dup
/*      */     //   792: ifnonnull -> 804
/*      */     //   795: pop
/*      */     //   796: aload #28
/*      */     //   798: ifnull -> 812
/*      */     //   801: goto -> 851
/*      */     //   804: aload #28
/*      */     //   806: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   809: ifeq -> 851
/*      */     //   812: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   815: astore #13
/*      */     //   817: aload #13
/*      */     //   819: pop
/*      */     //   820: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*      */     //   823: aload_0
/*      */     //   824: invokevirtual isExecuting : ()Z
/*      */     //   827: ifeq -> 834
/*      */     //   830: iconst_0
/*      */     //   831: goto -> 835
/*      */     //   834: iconst_1
/*      */     //   835: invokevirtual assert : (Z)V
/*      */     //   838: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*      */     //   841: astore #10
/*      */     //   843: aload #9
/*      */     //   845: monitorexit
/*      */     //   846: aload #10
/*      */     //   848: goto -> 904
/*      */     //   851: new java/lang/AssertionError
/*      */     //   854: dup
/*      */     //   855: ldc_w 'Invalid state in executor post-processing.'
/*      */     //   858: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   861: athrow
/*      */     //   862: aload_2
/*      */     //   863: monitorexit
/*      */     //   864: return
/*      */     //   865: aload_2
/*      */     //   866: monitorexit
/*      */     //   867: athrow
/*      */     //   868: aload #17
/*      */     //   870: monitorexit
/*      */     //   871: athrow
/*      */     //   872: aload #9
/*      */     //   874: monitorexit
/*      */     //   875: athrow
/*      */     //   876: astore #7
/*      */     //   878: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*      */     //   881: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*      */     //   884: ldc_w 'Architecture's runThreaded threw an error. This should never happen!'
/*      */     //   887: aload #7
/*      */     //   889: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*      */     //   894: aload_0
/*      */     //   895: ldc_w 'gui.Error.InternalError'
/*      */     //   898: invokevirtual crash : (Ljava/lang/String;)Z
/*      */     //   901: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   904: pop
/*      */     //   905: aload_0
/*      */     //   906: aload_0
/*      */     //   907: invokespecial cpuTotal : ()J
/*      */     //   910: invokestatic nanoTime : ()J
/*      */     //   913: aload_0
/*      */     //   914: invokespecial cpuStart : ()J
/*      */     //   917: lsub
/*      */     //   918: ladd
/*      */     //   919: invokespecial cpuTotal_$eq : (J)V
/*      */     //   922: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #959	-> 0
/*      */     //   #960	-> 7
/*      */     //   #961	-> 43
/*      */     //   #965	-> 79
/*      */     //   #966	-> 86
/*      */     //   #967	-> 102
/*      */     //   #969	-> 103
/*      */     //   #959	-> 152
/*      */     //   #972	-> 158
/*      */     //   #975	-> 165
/*      */     //   #978	-> 177
/*      */     //   #979	-> 185
/*      */     //   #980	-> 197
/*      */     //   #981	-> 228
/*      */     //   #982	-> 232
/*      */     //   #983	-> 247
/*      */     //   #986	-> 255
/*      */     //   #987	-> 274
/*      */     //   #988	-> 285
/*      */     //   #990	-> 300
/*      */     //   #983	-> 314
/*      */     //   #993	-> 322
/*      */     //   #994	-> 330
/*      */     //   #995	-> 345
/*      */     //   #996	-> 360
/*      */     //   #997	-> 368
/*      */     //   #1000	-> 381
/*      */     //   #996	-> 391
/*      */     //   #1002	-> 396
/*      */     //   #1003	-> 411
/*      */     //   #1004	-> 418
/*      */     //   #1002	-> 450
/*      */     //   #981	-> 452
/*      */     //   #1006	-> 469
/*      */     //   #1007	-> 500
/*      */     //   #1008	-> 508
/*      */     //   #1009	-> 516
/*      */     //   #1010	-> 520
/*      */     //   #1011	-> 535
/*      */     //   #1012	-> 544
/*      */     //   #1010	-> 557
/*      */     //   #1013	-> 562
/*      */     //   #1014	-> 570
/*      */     //   #1015	-> 588
/*      */     //   #1016	-> 603
/*      */     //   #1017	-> 611
/*      */     //   #1020	-> 627
/*      */     //   #1016	-> 640
/*      */     //   #1022	-> 645
/*      */     //   #1023	-> 660
/*      */     //   #1009	-> 694
/*      */     //   #1025	-> 697
/*      */     //   #1006	-> 710
/*      */     //   #1009	-> 715
/*      */     //   #1026	-> 725
/*      */     //   #1027	-> 756
/*      */     //   #1028	-> 763
/*      */     //   #1026	-> 776
/*      */     //   #1029	-> 781
/*      */     //   #979	-> 817
/*      */     //   #1033	-> 820
/*      */     //   #978	-> 845
/*      */     //   #1031	-> 851
/*      */     //   #962	-> 864
/*      */     //   #959	-> 865
/*      */     //   #983	-> 868
/*      */     //   #978	-> 872
/*      */     //   #1037	-> 876
/*      */     //   #974	-> 876
/*      */     //   #1038	-> 878
/*      */     //   #1039	-> 894
/*      */     //   #1037	-> 901
/*      */     //   #974	-> 904
/*      */     //   #1043	-> 905
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	923	0	this	Lli/cil/oc/server/machine/Machine;
/*      */     //   158	764	1	isSynchronizedReturn	Z
/*      */     //   177	671	8	result	Lli/cil/oc/api/machine/ExecutionResult;
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	153	865	finally
/*      */     //   165	862	876	finally
/*      */     //   185	846	872	finally
/*      */     //   255	315	868	finally
/*      */     //   851	862	872	finally
/*      */     //   862	865	865	finally
/*      */     //   868	872	872	finally
/*      */     //   868	876	876	finally
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static Machine create(MachineHost paramMachineHost) {
/*      */     return Machine$.MODULE$.create(paramMachineHost);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getArchitectureName(Class<? extends Architecture> paramClass) {
/*      */     return Machine$.MODULE$.getArchitectureName(paramClass);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static List<Class<? extends Architecture>> architectures() {
/*      */     return Machine$.MODULE$.architectures();
/*      */   }
/*      */ 
/*      */   
/*      */   public static void add(Class<? extends Architecture> paramClass) {
/*      */     Machine$.MODULE$.add(paramClass);
/*      */   }
/*      */ 
/*      */   
/*      */   public static LinkedHashSet<Class<? extends Architecture>> checked() {
/*      */     return Machine$.MODULE$.checked();
/*      */   }
/*      */ 
/*      */   
/*      */   public final class Machine$$anonfun$run$1
/*      */     extends AbstractFunction0<String>
/*      */     implements Serializable
/*      */   {
/*      */     public static final long serialVersionUID = 0L;
/*      */ 
/*      */     
/*      */     public final String apply() {
/* 1004 */       return "unknown error";
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$run$1(Machine $outer) {}
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final class Machine$$anonfun$run$2
/*      */     extends AbstractFunction0<String>
/*      */     implements Serializable
/*      */   {
/*      */     public static final long serialVersionUID = 0L;
/*      */ 
/*      */ 
/*      */     
/*      */     public final String apply() {
/* 1023 */       return "unknown error";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Machine$$anonfun$run$2(Machine $outer) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class State$
/*      */     extends Enumeration
/*      */   {
/*      */     public static final State$ MODULE$;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Stopped;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Starting;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Restarting;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Stopping;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Paused;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value SynchronizedCall;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value SynchronizedReturn;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Yielded;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Sleeping;
/*      */ 
/*      */     
/*      */     private final Enumeration.Value Running;
/*      */ 
/*      */ 
/*      */     
/*      */     public State$()
/*      */     {
/* 1074 */       MODULE$ = this;
/*      */       
/* 1076 */       this.Stopped = Value("Stopped");
/*      */ 
/*      */       
/* 1079 */       this.Starting = Value("Starting");
/*      */ 
/*      */       
/* 1082 */       this.Restarting = Value("Restarting");
/*      */ 
/*      */       
/* 1085 */       this.Stopping = Value("Stopping");
/*      */ 
/*      */       
/* 1088 */       this.Paused = Value("Paused");
/*      */ 
/*      */       
/* 1091 */       this.SynchronizedCall = Value("SynchronizedCall");
/*      */ 
/*      */       
/* 1094 */       this.SynchronizedReturn = Value("SynchronizedReturn");
/*      */ 
/*      */       
/* 1097 */       this.Yielded = Value("Yielded");
/*      */ 
/*      */       
/* 1100 */       this.Sleeping = Value("Sleeping");
/*      */ 
/*      */       
/* 1103 */       this.Running = Value("Running"); } public Enumeration.Value Stopped() { return this.Stopped; } public Enumeration.Value Starting() { return this.Starting; } public Enumeration.Value Restarting() { return this.Restarting; } public Enumeration.Value Stopping() { return this.Stopping; } public Enumeration.Value Paused() { return this.Paused; } public Enumeration.Value SynchronizedCall() { return this.SynchronizedCall; } public Enumeration.Value SynchronizedReturn() { return this.SynchronizedReturn; } public Enumeration.Value Yielded() { return this.Yielded; } public Enumeration.Value Sleeping() { return this.Sleeping; } public Enumeration.Value Running() { return this.Running; }
/*      */      }
/*      */   public static class Signal implements li.cil.oc.api.machine.Signal { private final String name; private final Object[] args;
/*      */     
/* 1107 */     public String name() { return this.name; } public Object[] args() { return this.args; } public Signal(String name, Object[] args) {} public Signal convert() {
/* 1108 */       return new Signal(name(), li.cil.oc.server.driver.Registry$.MODULE$.convert(args()));
/*      */     } }
/*      */ 
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\Machine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */