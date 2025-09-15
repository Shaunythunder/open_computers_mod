/*     */ package li.cil.oc.server.component;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Proxy;
/*     */ import java.net.URI;
/*     */ import java.net.URL;
/*     */ import java.net.UnknownHostException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.SelectionKey;
/*     */ import java.nio.channels.Selector;
/*     */ import java.nio.channels.SocketChannel;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import java.util.concurrent.ExecutionException;
/*     */ import java.util.concurrent.Future;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.HashSet;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\021\035g\001B\001\003\0015\021A\"\0238uKJtW\r^\"be\022T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021\025i\002\001\"\001\037\003\031a\024N\\5u}Q\tq\004\005\002!\0015\t!\001C\004#\001\t\007I\021I\022\002\t9|G-Z\013\002IA\021Q\005K\007\002M)\021qEE\001\b]\026$xo\034:l\023\tIcEA\005D_6\004xN\\3oi\"11\006\001Q\001\n\021\nQA\\8eK\002Bq!\f\001A\002\023Ea&A\003po:,'/F\0010!\r\0014'N\007\002c)\t!'A\003tG\006d\027-\003\0025c\t1q\n\035;j_:\004\"AN\035\016\003]R!\001\017\n\002\0175\f7\r[5oK&\021!h\016\002\b\007>tG/\032=u\021\035a\004\0011A\005\022u\n\021b\\<oKJ|F%Z9\025\005y\n\005C\001\031@\023\t\001\025G\001\003V]&$\bb\002\"<\003\003\005\raL\001\004q\022\n\004B\002#\001A\003&q&\001\004po:,'\017\t\005\b\r\002\021\r\021\"\005H\003-\031wN\0348fGRLwN\\:\026\003!\0032!\023(Q\033\005Q%BA&M\003\035iW\017^1cY\026T!!T\031\002\025\r|G\016\\3di&|g.\003\002P\025\n\0311+\032;\021\005E[gB\001\021S\017\025\031&\001#\001U\0031Ie\016^3s]\026$8)\031:e!\t\001SKB\003\002\005!\005ak\005\002V/B\021\001\007W\005\0033F\022a!\0218z%\0264\007\"B\017V\t\003YF#\001+\t\017u+&\031!C\005=\006QA\017\033:fC\022\004vn\0347\026\003}\003\"\001Y4\016\003\005T!AY2\002\025\r|gnY;se\026tGO\003\002eK\006!Q\017^5m\025\0051\027\001\0026bm\006L!\001[1\0031M\033\007.\0323vY\026$W\t_3dkR|'oU3sm&\034W\r\003\004k+\002\006IaX\001\fi\"\024X-\0313Q_>d\007EB\004m+B\005\031\023A7\003\021\rcwn]1cY\026\034\"a[,\t\013=\\g\021\0019\002\013\rdwn]3\025\003y:QA]+\t\002M\f1\002V\"Q\035>$\030NZ5feB\021A/^\007\002+\032)a/\026E\001o\nYAk\021)O_RLg-[3s'\t)\b\020\005\002zy6\t!P\003\002|K\006!A.\0318h\023\ti(P\001\004UQJ,\027\r\032\005\006;U$\ta \013\002g\"I\0211A;A\002\023%\021QA\001\tg\026dWm\031;peV\021\021q\001\t\005\003\023\t\031\"\004\002\002\f)!\021QBA\b\003!\031\007.\0318oK2\034(bAA\tK\006\031a.[8\n\t\005U\0211\002\002\t'\026dWm\031;pe\"I\021\021D;A\002\023%\0211D\001\rg\026dWm\031;pe~#S-\035\013\004}\005u\001\"\003\"\002\030\005\005\t\031AA\004\021!\t\t#\036Q!\n\005\035\021!C:fY\026\034Go\034:!\021%\t)#\036b\001\n\023\t9#\001\005u_\006\0337-\0329u+\t\tI\003E\003a\003W\ty#C\002\002.\005\024QcQ8oGV\024(/\0328u\031&t7.\0323Rk\026,X\rE\0041\003c\t)$a\017\n\007\005M\022G\001\004UkBdWM\r\t\005\003\023\t9$\003\003\002:\005-!!D*pG.,Go\0215b]:,G\016\005\0031\003{q\024bAA c\tIa)\0368di&|g\016\r\005\t\003\007*\b\025!\003\002*\005IAo\\!dG\026\004H\017\t\005\007\003\017*H\021\t9\002\007I,h\016C\004\002LU$\t!!\024\002\007\005$G\rF\002?\003\037B\001\"!\025\002J\001\007\021qF\001\002K\0321\021QK+\001\003/\022\021\002V\"Q'>\0347.\032;\024\r\005M\023\021LA0!\ry\0211L\005\004\003;\002\"!D!cgR\024\030m\031;WC2,X\r\005\002uW\"9Q$a\025\005\002\005\rDCAA3!\r!\0301\013\005\b;\005MC\021AA5)!\t)'a\033\002n\005u\004BB\027\002h\001\007q\004\003\005\002p\005\035\004\031AA9\003\r)(/\033\t\005\003g\nI(\004\002\002v)\031\021qO3\002\0079,G/\003\003\002|\005U$aA+S\023\"A\021qPA4\001\004\t\t)\001\003q_J$\bc\001\031\002\004&\031\021QQ\031\003\007%sG\017C\005.\003'\002\r\021\"\003\002\nV\021\0211\022\t\004aMz\002\"\003\037\002T\001\007I\021BAH)\rq\024\021\023\005\n\005\0065\025\021!a\001\003\027C\001\002RA*A\003&\0211\022\005\013\003/\013\031\0061A\005\n\005e\025aB1eIJ,7o]\013\003\0037\003R\001YAO\003CK1!a(b\005\0311U\017^;sKB!\0211OAR\023\021\t)+!\036\003\027%sW\r^!eIJ,7o\035\005\013\003S\013\031\0061A\005\n\005-\026aC1eIJ,7o]0%KF$2APAW\021%\021\025qUA\001\002\004\tY\nC\005\0022\006M\003\025)\003\002\034\006A\021\r\0323sKN\034\b\005\003\006\0026\006M\003\031!C\005\003o\013qa\0315b]:,G.\006\002\0026!Q\0211XA*\001\004%I!!0\002\027\rD\027M\0348fY~#S-\035\013\004}\005}\006\"\003\"\002:\006\005\t\031AA\033\021%\t\031-a\025!B\023\t)$\001\005dQ\006tg.\0327!\021)\t9-a\025A\002\023%\021\021Z\001\022SN\fE\r\032:fgN\024Vm]8mm\026$WCAAf!\r\001\024QZ\005\004\003\037\f$a\002\"p_2,\027M\034\005\013\003'\f\031\0061A\005\n\005U\027!F5t\003\022$'/Z:t%\026\034x\016\034<fI~#S-\035\013\004}\005]\007\"\003\"\002R\006\005\t\031AAf\021%\tY.a\025!B\023\tY-\001\njg\006#GM]3tgJ+7o\0347wK\022\004\003BCAp\003'\022\r\021\"\003\002b\006\021\021\016Z\013\003\003G\004B!!:\002h6\t1-C\002\002j\016\024A!V+J\t\"I\021Q^A*A\003%\0211]\001\004S\022\004\003bBAy\003'\"I\001]\001\016g\026$X\017]*fY\026\034Go\034:\t\021\005U\0301\013C\001\003o\fQBZ5oSND7i\0348oK\016$HCBA}\003\024\031\001\005\0031\003w<\026bAAc\t)\021I\035:bs\"9!\021AAz\001\004)\024aB2p]R,\007\020\036\005\t\005\013\t\031\0201\001\003\b\005!\021M]4t!\r1$\021B\005\004\005\0279$!C!sOVlWM\034;tQ!\t\031Pa\004\003\026\t]\001c\001\034\003\022%\031!1C\034\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\021I\"A+gk:\034G/[8oQ%R$m\\8mK\006t\007%L\027!\013:\034XO]3tA\005\0043o\\2lKR\004\023n\035\021d_:tWm\031;fI:\002SI\035:peN\004\023N\032\021uQ\026\0043m\0348oK\016$\030n\0348!M\006LG.\0323/\021!\021i\"a\025\005\002\t}\021\001\002:fC\022$b!!?\003\"\t\r\002b\002B\001\0057\001\r!\016\005\t\005\013\021Y\0021\001\003\b!B!1\004B\b\005+\0219#\t\002\003*\0051g-\0368di&|g\016K.ou9,XNY3s;&R4\017\036:j]\036\004S&\f\021Ue&,7\017\t;pAI,\027\r\032\021eCR\f\007E\032:p[\002\"\b.\032\021t_\016\\W\r\036\021tiJ,\027-\034\030!%\026$XO\0358tAQDW\r\t:fC\022\004#-\037;fA\005\024(/Y=/\021!\021i#a\025\005\002\t=\022!B<sSR,GCBA}\005c\021\031\004C\004\003\002\t-\002\031A\033\t\021\t\025!1\006a\001\005\017A\003Ba\013\003\020\tU!qG\021\003\005s\taNZ;oGRLwN\034\025eCR\f'h\035;sS:<\027F\0178v[\n,'\017I\027.AQ\023\030.Z:!i>\004sO]5uK\002\"\027\r^1!i>\004C\017[3!g>\0347.\032;!gR\024X-Y7/AI+G/\036:og\002\"\b.\032\021ok6\024WM\035\021pM\002\022\027\020^3tA]\024\030\016\036;f]:Bqa\\A*\t\003\021i\004\006\004\002z\n}\"\021\t\005\b\005\003\021Y\0041\0016\021!\021)Aa\017A\002\t\035\001\006\004B\036\005\037\021)Ea\022\003\026\t%\023A\0023je\026\034G/G\001\002C\t\021Y%A\026gk:\034G/[8oQ%\002S&\f\021DY>\034Xm\035\021b]\002z\007/\0328!g>\0347.\032;!gR\024X-Y7/\021!\ty.a\025\005\002\t=CCBA}\005#\022\031\006C\004\003\002\t5\003\031A\033\t\021\t\025!Q\na\001\005\017ACB!\024\003\020\t\025#q\tB\013\005/\n#A!\027\002W\031,hn\031;j_:D\023FO:ue&tw\rI\027.AI+G/\036:og\002\032wN\0348fGRLwN\034\021J\t:B\001B!\030\002T\021\005#qL\001\bI&\034\bo\\:f)\rq$\021\r\005\b\005\003\021Y\0061\0016\021\031y\0271\013C!a\"A!qMA*\t\023\021I'\001\bdQ\026\0347nQ8o]\026\034G/\0323\025\005\005-ga\002B7\003'\"!q\016\002\020\003\022$'/Z:t%\026\034x\016\034<feN1!1\016B9\005o\0022!\037B:\023\r\021)H\037\002\007\037\nTWm\031;\021\013\001\024I(!)\n\007\tm\024M\001\005DC2d\027M\0317f\021-\tyGa\033\003\006\004%\tAa \026\005\005E\004b\003BB\005W\022\t\021)A\005\003c\nA!\036:jA!Y\021q\020B6\005\013\007I\021\001BD+\t\t\t\tC\006\003\f\n-$\021!Q\001\n\005\005\025!\0029peR\004\003bB\017\003l\021\005!q\022\013\007\005#\023)Ja&\021\t\tM%1N\007\003\003'B\001\"a\034\003\016\002\007\021\021\017\005\t\003\022i\t1\001\002\002\"A!1\024B6\t\003\022i*\001\003dC2dGCAAQ\021\035\021\t+\026C\001\005G\013\001#[:SKF,Xm\035;BY2|w/\0323\025\021\005-'Q\025BY\005kC\001Ba*\003 \002\007!\021V\001\tg\026$H/\0338hgB!!1\026BW\033\0051\021b\001BX\r\tA1+\032;uS:<7\017\003\005\0034\n}\005\031AAQ\003-Ig.\032;BI\022\024Xm]:\t\021\t]&q\024a\001\005s\013A\001[8tiB!!1\030Ba\035\r\001$QX\005\004\005\013\024A\002)sK\022,g-\003\003\003D\n\025'AB*ue&twMC\002\003@FBqA!3V\t\003\021Y-\001\006dQ\026\0347\016T5tiN$RA\020Bg\005\037D\001Ba-\003H\002\007\021\021\025\005\t\005o\0239\r1\001\003:\0321!1[+\001\005+\0241\002\023+U!J+\027/^3tiN1!\021[A-\003?Bq!\bBi\t\003\021I\016\006\002\003\\B\031AO!5\t\017u\021\t\016\"\001\003`Ra!1\034Bq\005G\024iOa=\003~\"1QF!8A\002}A\001B!:\003^\002\007!q]\001\004kJd\007\003BA:\005SLAAa;\002v\t\031QK\025'\t\021\t=(Q\034a\001\005c\fA\001]8tiB!\001g\rB]\021!\021)P!8A\002\t]\030a\0025fC\022,'o\035\t\t\005w\023IP!/\003:&!!1 Bc\005\ri\025\r\035\005\t\005\024i\0161\001\003r\0061Q.\032;i_\022D\021\"\fBi\001\004%I!!#\t\023q\022\t\0161A\005\n\r\025Ac\001 \004\b!I!ia\001\002\002\003\007\0211\022\005\t\t\nE\007\025)\003\002\f\"Q1Q\002Bi\001\004%Iaa\004\002\021I,7\017]8og\026,\"a!\005\021\tA\03241\003\t\ta\rU\021\021\021B]/&\0311qC\031\003\rQ+\b\017\\34\021)\031YB!5A\002\023%1QD\001\re\026\034\bo\0348tK~#S-\035\013\004}\r}\001\"\003\"\004\032\005\005\t\031AB\t\021%\031\031C!5!B\023\031\t\"A\005sKN\004xN\\:fA!Q1q\005Bi\001\004%Ia!\013\002\rM$(/Z1n+\t\031Y\003E\003a\003;\033i\003\005\003\0040\rURBAB\031\025\r\031\031$Z\001\003S>LAaa\016\0042\tY\021J\0349viN#(/Z1n\021)\031YD!5A\002\023%1QH\001\013gR\024X-Y7`I\025\fHc\001 \004@!I!i!\017\002\002\003\00711\006\005\n\007\007\022\t\016)Q\005\007W\tqa\035;sK\006l\007\005\003\006\004H\tE'\031!C\005\007\023\nQ!];fk\026,\"aa\023\021\013\001\fYc!\024\021\007A\032y%C\002\004RE\022AAQ=uK\"I1Q\013BiA\003%11J\001\007cV,W/\032\021\t\025\re#\021\033a\001\n\023\031Y&\001\004sK\006$WM]\013\003\007;\002Daa\030\004fA)\001-!(\004bA!11MB3\031\001!Aba\032\004j\005\005\t\021!B\001\007k\0221a\030\0232\021%\031YG!5!B\023\031i'A\004sK\006$WM\035\0211\t\r=41\017\t\006A\006u5\021\017\t\005\007G\032\031\b\002\007\004h\r%\024\021!A\001\006\003\031)(\005\003\004x\ru\004c\001\031\004z%\03111P\031\003\0179{G\017[5oOB\031\001ga \n\007\r\005\025GA\002B]fD!b!\"\003R\002\007I\021BBD\003)\021X-\0313fe~#S-\035\013\004}\r%\005\"\003\"\004\004\006\005\t\031ABFa\021\031ii!%\021\013\001\fija$\021\t\r\r4\021\023\003\r\007O\032I'!A\001\002\013\0051Q\017\005\013\007+\023\t\0161A\005\n\005%\027aA3pM\"Q1\021\024Bi\001\004%Iaa'\002\017\025|gm\030\023fcR\031ah!(\t\023\t\0339*!AA\002\005-\007\"CBQ\005#\004\013\025BAf\003\021)wN\032\021\t\021\005U(\021\033C\001\007K#b!!?\004(\016%\006b\002B\001\007G\003\r!\016\005\t\005\013\031\031\0131\001\003\b!B11\025B\b\005+\031i+\t\002\0040\0069f-\0368di&|g\016K\025;E>|G.Z1oA5j\003%\0228tkJ,7\017I1!e\026\034\bo\0348tK\002J7\017I1wC&d\027M\0317f]\001*%O]8sg\002Jg\r\t;iK\002\032wN\0348fGRLwN\034\021gC&dW\r\032\030\t\021\r5!\021\033C\001\007g#b!!?\0046\016]\006b\002B\001\007c\003\r!\016\005\t\005\013\031\t\f1\001\003\b!b1\021\027B\b\005\013\0229E!\006\004<\006\0221QX\001LMVt7\r^5p]\"J#H\\;nE\026\024H\006I:ue&tw\r\f\021uC\ndW\rI\027.A\035+G\017\t:fgB|gn]3!G>$W\r\f\021nKN\034\030mZ3!C:$\007\005[3bI\026\0248O\f\005\t\005;\021\t\016\"\001\004BR1\021\021`Bb\007\013DqA!\001\004@\002\007Q\007\003\005\003\006\r}\006\031\001B\004Q!\031yLa\004\003\026\r%\027EABf\003\0054WO\\2uS>t\007f\0278;]Vl'-\032:^Si\032HO]5oO\002jS\006\t+sS\026\034\b\005^8!e\026\fG\r\t3bi\006\004cM]8nAQDW\r\t:fgB|gn]3/AI+G/\036:og\002\"\b.\032\021sK\006$\007EY=uK\002\n'O]1z]!9qN!5\005\002\r=GCBA}\007#\034\031\016C\004\003\002\r5\007\031A\033\t\021\t\0251Q\032a\001\005\017ACb!4\003\020\t\025#q\tB\013\005\023B\001B!\030\003R\022\0053\021\034\013\004}\rm\007b\002B\001\007/\004\r!\016\005\007_\nEG\021\t9\t\021\r\005(\021\033C\005\005S\nQb\0315fG.\024Vm\0359p]N,\007bBBs\005#$I\001]\001\te\026\fG-T8sK\03291\021\036Bi\t\r-(!\004*fcV,7\017^*f]\022,'o\005\004\004h\nE4Q\036\t\006A\ne4Q\006\005\f\005K\0349O!b\001\n\003\031\t0\006\002\003h\"Y1Q_Bt\005\003\005\013\021\002Bt\003\021)(\017\034\021\t\027\t=8q\035BC\002\023\0051\021`\013\003\005cD1b!@\004h\n\005\t\025!\003\003r\006)\001o\\:uA!Y!Q_Bt\005\013\007I\021\001C\001+\t\0219\020C\006\005\006\r\035(\021!Q\001\n\t]\030\001\0035fC\022,'o\035\021\t\027\t}8q\035BC\002\023\0051\021 \005\f\t\027\0319O!A!\002\023\021\t0A\004nKRDw\016\032\021\t\017u\0319\017\"\001\005\020QQA\021\003C\013\t/!I\002b\007\021\t\021M1q]\007\003\005#D\001B!:\005\016\001\007!q\035\005\t\005_$i\0011\001\003r\"A!Q\037C\007\001\004\0219\020\003\005\003\000\0225\001\031\001By\021!\021Yja:\005B\021}ACAB\027\021\035!\031\003\001Q\001\n!\013AbY8o]\026\034G/[8og\002B!\002b\n\001\021\013\007IQ\002C\025\003)!WM^5dK&sgm\\\013\003\tW\001\002\002\"\f\0054\021UBQG\007\003\t_Q1\001\"\rM\003%IW.\\;uC\ndW-\003\003\003|\022=\002cA=\0058%\031!1\031>\t\025\021m\002\001#A!B\033!Y#A\006eKZL7-Z%oM>\004\003b\002C \001\021\005C\021I\001\016O\026$H)\032<jG\026LeNZ8\025\005\021\r\003\003CAs\t\013\022IL!/\n\007\tm8\rC\004\005J\001!\t\001b\023\002\033%\034\b\n\036;q\013:\f'\r\\3e)\031\tI\020\"\024\005P!9!\021\001C$\001\004)\004\002\003B\003\t\017\002\rAa\002)\031\021\035#q\002B#\005\017\022)\002b\025\"\005\021U\023!\0254v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021SKR,(O\\:!o\",G\017[3sA!#F\013\025\021sKF,Xm\035;tA\r\fg\016\t2fA5\fG-\032\021)G>tg-[4!g\026$H/\0338hS9Bq\001\"\027\001\t\003!Y&A\004sKF,Xm\035;\025\r\005eHQ\fC0\021\035\021\t\001b\026A\002UB\001B!\002\005X\001\007!q\001\025\t\t/\022yA!\006\005d\005\022AQM\001\002\004\032,hn\031;j_:DSO\0357;gR\024\030N\\4\\Y\001\002xn\035;ECR\f'h\035;sS:<7\f\f\021iK\006$WM]:;i\006\024G.Z.-A5,G\017[8euM$(/\0338h;vk\026FO;tKJ$\027\r^1![5\0023\013^1siN\004\023M\034\021I)R\003\006E]3rk\026\034HO\f\021JM\002\"\b.[:!e\026$XO\0358tAQ\024X/\032\027!MV\024H\017[3sAI,7/\0367ug\002:\030\016\0347!E\026\004\003/^:iK\022\004So]5oO\002\002\007\016\036;q?J,7\017]8og\026\004\007e]5h]\006d7O\f\005\b\tS\002A\021\001C6\0031I7\017V2q\013:\f'\r\\3e)\031\tI\020\"\034\005p!9!\021\001C4\001\004)\004\002\003B\003\tO\002\rAa\002)\031\021\035$q\002B#\005\017\022)\002b\035\"\005\021U\024a\0254v]\016$\030n\0348)Si\022wn\0347fC:\004S&\f\021SKR,(O\\:!o\",G\017[3sAQ\033\005\013I2p]:,7\r^5p]N\0043-\0318!E\026\004S.\0313fA!\032wN\0344jO\002\032X\r\036;j]\036Lc\006C\004\005z\001!\t\001b\037\002\017\r|gN\\3diR1\021\021 C?\tBqA!\001\005x\001\007Q\007\003\005\003\006\021]\004\031\001B\004Q!!9Ha\004\003\026\021\r\025E\001CC\003U4WO\\2uS>t\007&\0313ee\026\0348OO:ue&twm\027\027!a>\024HO\0178v[\n,'/X\025;kN,'\017Z1uC\002jS\006I(qK:\034\b%\031\021oK^\004Ck\021)!G>tg.Z2uS>tg\006\t*fiV\024hn\035\021uQ\026\004\003.\0318eY\026\004sN\032\021uQ\026\0043m\0348oK\016$\030n\0348/\021\035!I\t\001C\005\t\027\013!b\0315fG.|uO\\3s)\rqDQ\022\005\b\005\003!9\t1\0016\021\035!\t\n\001C!\t'\013\021b\0348D_:tWm\031;\025\007y\")\nC\004#\t\037\003\r\001b&\021\007\025\"I*C\002\005\034\032\022AAT8eK\"9Aq\024\001\005B\021\005\026\001D8o\t&\0348m\0348oK\016$Hc\001 \005$\"9!\005\"(A\002\021]\005b\002CT\001\021\005C\021V\001\n_:lUm]:bO\026$2A\020CV\021!!i\013\"*A\002\021=\026aB7fgN\fw-\032\t\004K\021E\026b\001CZM\t9Q*Z:tC\036,\007b\002C\\\001\021%A\021X\001\tG\",7m[+sSR1\021\021\017C^\t{C\001\"a&\0056\002\007!\021\030\005\t\003\")\f1\001\002\002\"9A\021\031\001\005\n\021\r\027\001D2iK\016\\\027\t\0323sKN\034H\003\002Bt\t\013D\001\"a&\005@\002\007!\021\030")
/*     */ public class InternetCard extends ManagedEnvironment implements DeviceInfo {
/*  39 */   private final Component node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  40 */     .withComponent("internet", Visibility.Neighbors)
/*  41 */     .create(); public Component node() {
/*     */     return this.node;
/*  43 */   } private Option<Context> owner = (Option<Context>)scala.None$.MODULE$; public Option<Context> owner() { return this.owner; } public void owner_$eq(Option<Context> x$1) { this.owner = x$1; }
/*     */   
/*  45 */   private final Set<Closable> connections = scala.collection.mutable.Set$.MODULE$.empty(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public Set<Closable> connections() { return this.connections; }
/*     */ 
/*     */   
/*     */   private Map deviceInfo$lzycompute() {
/*  49 */     synchronized (this) { if (!this.bitmap$0) { (new Tuple2[4])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  50 */           .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("class"), "communication");
/*  51 */         (new Tuple2[4])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("description"), "Internet modem");
/*  52 */         (new Tuple2[4])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  53 */         (new Tuple2[4])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("product"), "SuperLink X-D4NK"); this.deviceInfo = (Map<String, String>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */   
/*  56 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return scala.collection.convert.WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():boolean -- Returns whether HTTP requests can be made (config setting).")
/*     */   public Object[] isHttpEnabled(Context context, Arguments args) {
/*  61 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(li.cil.oc.Settings$.MODULE$.get().httpEnabled()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(url:string[, postData:string[, headers:table[, method:string]]]):userdata -- Starts an HTTP request. If this returns true, further results will be pushed using `http_response` signals.")
/*  65 */   public synchronized Object[] request(Context context, Arguments args) { checkOwner(context);
/*  66 */     String address = args.checkString(0);
/*  67 */     if (li.cil.oc.Settings$.MODULE$.get().internetAccessAllowed())
/*     */     
/*     */     { 
/*  70 */       if (li.cil.oc.Settings$.MODULE$.get().httpEnabled())
/*     */       
/*     */       { 
/*  73 */         if (connections().size() >= li.cil.oc.Settings$.MODULE$.get().maxConnections()) {
/*  74 */           throw new IOException("too many open connections");
/*     */         }
/*  76 */         Option<String> post = args.isString(1) ? scala.Option$.MODULE$.apply(args.checkString(1)) : (Option)scala.None$.MODULE$;
/*  77 */         Map<String, String> headers = args.isTable(2) ? ((TraversableOnce)scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(args.checkTable(2)).collect((PartialFunction)new InternetCard$$anonfun$1(this), scala.collection.mutable.Map$.MODULE$.canBuildFrom()))
/*     */           
/*  79 */           .toMap(scala.Predef$.MODULE$.$conforms()) : 
/*  80 */           scala.Predef$.MODULE$.Map().empty();
/*  81 */         if (!li.cil.oc.Settings$.MODULE$.get().httpHeadersEnabled() && headers.nonEmpty()) {
/*  82 */           return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "http request headers are unavailable" }));
/*     */         }
/*  84 */         Option<String> method = args.isString(3) ? scala.Option$.MODULE$.apply(args.checkString(3)) : (Option)scala.None$.MODULE$;
/*  85 */         HTTPRequest request = new HTTPRequest(this, checkAddress(address), post, headers, method);
/*  86 */         connections().$plus$eq(request);
/*  87 */         return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { request })); }  return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "http requests are unavailable" })); }  return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "internet access is unavailable" })); } public final class InternetCard$$anonfun$1 extends AbstractPartialFunction<Tuple2<Object, Object>, Tuple2<String, String>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String) { String str = (String)key; if (value instanceof Object) { Object object = value; return (B1)new Tuple2(str, object.toString()); }  }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof String && value instanceof Object)
/*     */           return true;  }  return false; }
/*     */     public InternetCard$$anonfun$1(InternetCard $outer) {} }
/*  91 */   @Callback(direct = true, doc = "function():boolean -- Returns whether TCP connections can be made (config setting).") public Object[] isTcpEnabled(Context context, Arguments args) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(li.cil.oc.Settings$.MODULE$.get().tcpEnabled()) })); }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(address:string[, port:number]):userdata -- Opens a new TCP connection. Returns the handle of the connection.")
/*  95 */   public synchronized Object[] connect(Context context, Arguments args) { checkOwner(context);
/*  96 */     String address = args.checkString(0);
/*  97 */     int port = args.optInteger(1, -1);
/*  98 */     if (li.cil.oc.Settings$.MODULE$.get().internetAccessAllowed()) {
/*     */ 
/*     */       
/* 101 */       if (li.cil.oc.Settings$.MODULE$.get().tcpEnabled()) {
/*     */ 
/*     */         
/* 104 */         if (connections().size() >= li.cil.oc.Settings$.MODULE$.get().maxConnections()) {
/* 105 */           throw new IOException("too many open connections");
/*     */         }
/* 107 */         URI uri = checkUri(address, port);
/* 108 */         TCPSocket socket = new TCPSocket(this, uri, port);
/* 109 */         connections().$plus$eq(socket);
/* 110 */         return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { socket }));
/*     */       } 
/*     */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "tcp connections are unavailable" }));
/*     */     } 
/* 114 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "internet access is unavailable" })); } private void checkOwner(Context context) { if (!owner().isEmpty()) { Node node = ((Context)owner().get()).node(); if (context.node() == null) { context.node(); if (node != null)
/* 115 */           throw new IllegalArgumentException("can only be used by the owning computer");  } else { if (context.node().equals(node)) return;  throw new IllegalArgumentException("can only be used by the owning computer"); }  return; }  throw new IllegalArgumentException("can only be used by the owning computer"); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 122 */     super.onConnect(node);
/* 123 */     if (owner().isEmpty() && node.host() instanceof Context && node.isNeighborOf((Node)node()))
/* 124 */       owner_$eq((Option<Context>)new Some(node.host())); 
/*     */   }
/*     */   public synchronized void onDisconnect(Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   5: aload_0
/*     */     //   6: invokevirtual owner : ()Lscala/Option;
/*     */     //   9: invokevirtual isDefined : ()Z
/*     */     //   12: ifeq -> 133
/*     */     //   15: aload_1
/*     */     //   16: aload_0
/*     */     //   17: invokevirtual node : ()Lli/cil/oc/api/network/Component;
/*     */     //   20: astore_2
/*     */     //   21: dup
/*     */     //   22: ifnonnull -> 33
/*     */     //   25: pop
/*     */     //   26: aload_2
/*     */     //   27: ifnull -> 88
/*     */     //   30: goto -> 40
/*     */     //   33: aload_2
/*     */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   37: ifne -> 88
/*     */     //   40: aload_1
/*     */     //   41: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*     */     //   46: instanceof li/cil/oc/api/machine/Context
/*     */     //   49: ifeq -> 133
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*     */     //   58: checkcast li/cil/oc/api/machine/Context
/*     */     //   61: aload_0
/*     */     //   62: invokevirtual owner : ()Lscala/Option;
/*     */     //   65: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   68: astore_3
/*     */     //   69: dup
/*     */     //   70: ifnonnull -> 81
/*     */     //   73: pop
/*     */     //   74: aload_3
/*     */     //   75: ifnull -> 88
/*     */     //   78: goto -> 133
/*     */     //   81: aload_3
/*     */     //   82: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   85: ifeq -> 133
/*     */     //   88: aload_0
/*     */     //   89: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   92: invokevirtual owner_$eq : (Lscala/Option;)V
/*     */     //   95: aload_0
/*     */     //   96: dup
/*     */     //   97: astore #4
/*     */     //   99: monitorenter
/*     */     //   100: aload_0
/*     */     //   101: invokevirtual connections : ()Lscala/collection/mutable/Set;
/*     */     //   104: new li/cil/oc/server/component/InternetCard$$anonfun$onDisconnect$1
/*     */     //   107: dup
/*     */     //   108: aload_0
/*     */     //   109: invokespecial <init> : (Lli/cil/oc/server/component/InternetCard;)V
/*     */     //   112: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   117: aload_0
/*     */     //   118: invokevirtual connections : ()Lscala/collection/mutable/Set;
/*     */     //   121: invokeinterface clear : ()V
/*     */     //   126: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   129: pop
/*     */     //   130: aload #4
/*     */     //   132: monitorexit
/*     */     //   133: return
/*     */     //   134: aload #4
/*     */     //   136: monitorexit
/*     */     //   137: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 0
/*     */     //   #130	-> 5
/*     */     //   #131	-> 88
/*     */     //   #132	-> 95
/*     */     //   #133	-> 100
/*     */     //   #134	-> 117
/*     */     //   #132	-> 132
/*     */     //   #128	-> 133
/*     */     //   #132	-> 134
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	138	0	this	Lli/cil/oc/server/component/InternetCard;
/*     */     //   0	138	1	node	Lli/cil/oc/api/network/Node;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   100	133	134	finally
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$onDisconnect$1 extends AbstractFunction1<Closable, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(InternetCard.Closable x$1) {
/* 133 */       x$1.close();
/*     */     }
/*     */     public InternetCard$$anonfun$onDisconnect$1(InternetCard $outer) {} }
/*     */   
/*     */   public synchronized void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   11: astore_2
/*     */     //   12: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   15: aload_2
/*     */     //   16: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   19: astore_3
/*     */     //   20: aload_3
/*     */     //   21: invokevirtual isEmpty : ()Z
/*     */     //   24: ifne -> 228
/*     */     //   27: aload_3
/*     */     //   28: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   31: ifnull -> 228
/*     */     //   34: aload_3
/*     */     //   35: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   38: checkcast scala/collection/SeqLike
/*     */     //   41: iconst_0
/*     */     //   42: invokeinterface lengthCompare : (I)I
/*     */     //   47: iconst_0
/*     */     //   48: if_icmpne -> 228
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface name : ()Ljava/lang/String;
/*     */     //   57: ldc_w 'computer.stopped'
/*     */     //   60: astore #4
/*     */     //   62: dup
/*     */     //   63: ifnonnull -> 75
/*     */     //   66: pop
/*     */     //   67: aload #4
/*     */     //   69: ifnull -> 115
/*     */     //   72: goto -> 83
/*     */     //   75: aload #4
/*     */     //   77: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   80: ifne -> 115
/*     */     //   83: aload_1
/*     */     //   84: invokeinterface name : ()Ljava/lang/String;
/*     */     //   89: ldc_w 'computer.started'
/*     */     //   92: astore #5
/*     */     //   94: dup
/*     */     //   95: ifnonnull -> 107
/*     */     //   98: pop
/*     */     //   99: aload #5
/*     */     //   101: ifnull -> 115
/*     */     //   104: goto -> 228
/*     */     //   107: aload #5
/*     */     //   109: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   112: ifeq -> 228
/*     */     //   115: aload_0
/*     */     //   116: invokevirtual owner : ()Lscala/Option;
/*     */     //   119: invokevirtual isDefined : ()Z
/*     */     //   122: ifeq -> 228
/*     */     //   125: aload_1
/*     */     //   126: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   131: invokeinterface address : ()Ljava/lang/String;
/*     */     //   136: aload_0
/*     */     //   137: invokevirtual owner : ()Lscala/Option;
/*     */     //   140: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   143: checkcast li/cil/oc/api/machine/Context
/*     */     //   146: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   151: invokeinterface address : ()Ljava/lang/String;
/*     */     //   156: astore #6
/*     */     //   158: dup
/*     */     //   159: ifnonnull -> 171
/*     */     //   162: pop
/*     */     //   163: aload #6
/*     */     //   165: ifnull -> 179
/*     */     //   168: goto -> 228
/*     */     //   171: aload #6
/*     */     //   173: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   176: ifeq -> 228
/*     */     //   179: aload_0
/*     */     //   180: dup
/*     */     //   181: astore #8
/*     */     //   183: monitorenter
/*     */     //   184: aload_0
/*     */     //   185: invokevirtual connections : ()Lscala/collection/mutable/Set;
/*     */     //   188: new li/cil/oc/server/component/InternetCard$$anonfun$onMessage$1
/*     */     //   191: dup
/*     */     //   192: aload_0
/*     */     //   193: invokespecial <init> : (Lli/cil/oc/server/component/InternetCard;)V
/*     */     //   196: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   201: aload_0
/*     */     //   202: invokevirtual connections : ()Lscala/collection/mutable/Set;
/*     */     //   205: invokeinterface clear : ()V
/*     */     //   210: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   213: astore #9
/*     */     //   215: aload #8
/*     */     //   217: monitorexit
/*     */     //   218: aload #9
/*     */     //   220: checkcast scala/runtime/BoxedUnit
/*     */     //   223: astore #7
/*     */     //   225: goto -> 233
/*     */     //   228: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   231: astore #7
/*     */     //   233: return
/*     */     //   234: aload #8
/*     */     //   236: monitorexit
/*     */     //   237: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #140	-> 0
/*     */     //   #141	-> 5
/*     */     //   #142	-> 12
/*     */     //   #143	-> 179
/*     */     //   #144	-> 184
/*     */     //   #145	-> 201
/*     */     //   #143	-> 217
/*     */     //   #147	-> 228
/*     */     //   #139	-> 233
/*     */     //   #143	-> 234
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	238	0	this	Lli/cil/oc/server/component/InternetCard;
/*     */     //   0	238	1	message	Lli/cil/oc/api/network/Message;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   184	218	234	finally
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$onMessage$1 extends AbstractFunction1<Closable, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(InternetCard.Closable x$2) {
/* 144 */       x$2.close();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public InternetCard$$anonfun$onMessage$1(InternetCard $outer) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   private URI checkUri(String address, int port) {
/*     */     try {
/* 155 */       URI parsed = new URI(address);
/* 156 */       if (parsed.getHost() != null && (parsed.getPort() > 0 || port > 0)) {
/* 157 */         return parsed;
/*     */       }
/*     */     } finally {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     URI simple = new URI((new StringBuilder()).append("oc://").append(address).toString());
/* 165 */     if (simple.getHost() != null) {
/* 166 */       if (simple.getPort() > 0)
/* 167 */         return simple; 
/* 168 */       if (port > 0) {
/* 169 */         return new URI((new StringBuilder()).append(simple.toString()).append(":").append(BoxesRunTime.boxToInteger(port)).toString());
/*     */       }
/*     */     } 
/* 172 */     throw new IllegalArgumentException("address could not be parsed or no valid port given");
/*     */   }
/*     */   private URL checkAddress(String address) {
/*     */     try {
/* 176 */       URL url = new URL(address);
/*     */ 
/*     */ 
/*     */       
/* 180 */       String protocol = url.getProtocol();
/* 181 */       if (protocol.matches("^https?$"))
/*     */       {
/*     */         
/* 184 */         return url; } 
/*     */       throw new FileNotFoundException("unsupported protocol");
/*     */     } finally {
/*     */       Exception exception = null;
/*     */     } 
/*     */   }
/*     */   public static void checkLists(InetAddress paramInetAddress, String paramString) {
/*     */     InternetCard$.MODULE$.checkLists(paramInetAddress, paramString);
/*     */   }
/*     */   public static boolean isRequestAllowed(Settings paramSettings, InetAddress paramInetAddress, String paramString) {
/*     */     return InternetCard$.MODULE$.isRequestAllowed(paramSettings, paramInetAddress, paramString);
/*     */   }
/*     */   public static class TCPNotifier$ extends Thread { public static final TCPNotifier$ MODULE$; private Selector li$cil$oc$server$component$InternetCard$TCPNotifier$$selector;
/*     */     private final ConcurrentLinkedQueue<Tuple2<SocketChannel, Function0<BoxedUnit>>> li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept;
/*     */     
/* 199 */     public TCPNotifier$() { MODULE$ = this;
/* 200 */       this.li$cil$oc$server$component$InternetCard$TCPNotifier$$selector = Selector.open();
/* 201 */       this.li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept = new ConcurrentLinkedQueue<>(); } public Selector li$cil$oc$server$component$InternetCard$TCPNotifier$$selector() { return this.li$cil$oc$server$component$InternetCard$TCPNotifier$$selector; } private void li$cil$oc$server$component$InternetCard$TCPNotifier$$selector_$eq(Selector x$1) { this.li$cil$oc$server$component$InternetCard$TCPNotifier$$selector = x$1; } public ConcurrentLinkedQueue<Tuple2<SocketChannel, Function0<BoxedUnit>>> li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept() { return this.li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept; } public final class InternetCard$TCPNotifier$$anonfun$run$2 extends AbstractFunction0<Tuple2<SocketChannel, Function0<BoxedUnit>>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final Tuple2<SocketChannel, Function0<BoxedUnit>> apply() { return InternetCard.TCPNotifier$.MODULE$.li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept().poll(); } } public final class InternetCard$TCPNotifier$$anonfun$run$3 extends AbstractFunction1<Tuple2<SocketChannel, Function0<BoxedUnit>>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public final boolean apply(Tuple2 x$3) { return !(x$3 == null); } }
/*     */     public void run() { while (true) { HashSet readableKeys; 
/* 206 */         try { scala.package$.MODULE$.Stream().continually((Function0)new InternetCard$TCPNotifier$$anonfun$run$2()).takeWhile((Function1)new InternetCard$TCPNotifier$$anonfun$run$3()).foreach((Function1)new InternetCard$TCPNotifier$$anonfun$run$4());
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 211 */           li$cil$oc$server$component$InternetCard$TCPNotifier$$selector().select();
/*     */ 
/*     */           
/* 214 */           Set<SelectionKey> selectedKeys = li$cil$oc$server$component$InternetCard$TCPNotifier$$selector().selectedKeys();
/* 215 */           readableKeys = (HashSet)scala.collection.mutable.HashSet$.MODULE$.apply((Seq)scala.collection.immutable.Nil$.MODULE$);
/* 216 */           ((IterableLike)scala.collection.JavaConversions$.MODULE$.asScalaSet(selectedKeys).filter((Function1)new InternetCard$TCPNotifier$$anonfun$run$5())).foreach((Function1)new InternetCard$TCPNotifier$$anonfun$run$6(readableKeys));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 221 */           if (!readableKeys.nonEmpty())
/*     */           {
/*     */             continue;
/*     */           
/*     */           }
/*     */            }
/*     */         
/*     */         catch (IOException iOException)
/*     */         
/*     */         { 
/* 231 */           li.cil.oc.OpenComputers$.MODULE$.log().error("Error in TCP selector loop.", iOException); continue; }  Selector newSelector = Selector.open(); ((IterableLike)scala.collection.JavaConversions$.MODULE$.asScalaSet(li$cil$oc$server$component$InternetCard$TCPNotifier$$selector().keys()).filter((Function1)new InternetCard$TCPNotifier$$anonfun$run$7(readableKeys))).foreach((Function1)new InternetCard$TCPNotifier$$anonfun$run$8(newSelector)); li$cil$oc$server$component$InternetCard$TCPNotifier$$selector().close(); li$cil$oc$server$component$InternetCard$TCPNotifier$$selector_$eq(newSelector); }  }
/*     */     public final class InternetCard$TCPNotifier$$anonfun$run$4 extends AbstractFunction1<Tuple2<SocketChannel, Function0<BoxedUnit>>, SelectionKey> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public final SelectionKey apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) { SocketChannel channel = (SocketChannel)tuple2._1(); Function0 action = (Function0)tuple2._2(); if (channel != null) { SocketChannel socketChannel = channel; if (action != null) { Function0 function0 = action; return socketChannel.register(InternetCard.TCPNotifier$.MODULE$.li$cil$oc$server$component$InternetCard$TCPNotifier$$selector(), 1, function0); }  }  }  throw new MatchError(tuple2); } }
/*     */     public final class InternetCard$TCPNotifier$$anonfun$run$5 extends AbstractFunction1<SelectionKey, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(SelectionKey x$4) { return x$4.isReadable(); } } public final class InternetCard$TCPNotifier$$anonfun$run$6 extends AbstractFunction1<SelectionKey, HashSet<SelectionKey>> implements Serializable {
/* 237 */       public static final long serialVersionUID = 0L; private final HashSet readableKeys$1; public InternetCard$TCPNotifier$$anonfun$run$6(HashSet readableKeys$1) {} public final HashSet<SelectionKey> apply(SelectionKey key) { ((Function0)key.attachment()).apply$mcV$sp(); return this.readableKeys$1.$plus$eq(key); } } public void add(Tuple2<SocketChannel, Function0<BoxedUnit>> e) { li$cil$oc$server$component$InternetCard$TCPNotifier$$toAccept().offer(e);
/* 238 */       li$cil$oc$server$component$InternetCard$TCPNotifier$$selector().wakeup(); }
/*     */      public final class InternetCard$TCPNotifier$$anonfun$run$7 extends AbstractFunction1<SelectionKey, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final HashSet readableKeys$1; public final boolean apply(SelectionKey x$5) {
/*     */         return !this.readableKeys$1.contains(x$5);
/*     */       } public InternetCard$TCPNotifier$$anonfun$run$7(HashSet readableKeys$1) {} } public final class InternetCard$TCPNotifier$$anonfun$run$8 extends AbstractFunction1<SelectionKey, SelectionKey> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Selector newSelector$1; public InternetCard$TCPNotifier$$anonfun$run$8(Selector newSelector$1) {} public final SelectionKey apply(SelectionKey key) {
/*     */         return key.channel().register(this.newSelector$1, 1, key.attachment());
/*     */       } } } public static class TCPSocket extends AbstractValue implements Closable { public TCPSocket(InternetCard owner, URI uri, int port) {
/* 246 */       this();
/* 247 */       li$cil$oc$server$component$InternetCard$TCPSocket$$owner_$eq((Option<InternetCard>)new Some(owner));
/* 248 */       li$cil$oc$server$component$InternetCard$TCPSocket$$channel_$eq(SocketChannel.open());
/* 249 */       li$cil$oc$server$component$InternetCard$TCPSocket$$channel().configureBlocking(false);
/* 250 */       li$cil$oc$server$component$InternetCard$TCPSocket$$address_$eq(InternetCard$.MODULE$.li$cil$oc$server$component$InternetCard$$threadPool().submit(new AddressResolver(this, uri, port)));
/*     */     }
/*     */     
/* 253 */     private Option<InternetCard> li$cil$oc$server$component$InternetCard$TCPSocket$$owner = (Option<InternetCard>)scala.None$.MODULE$; public Option<InternetCard> li$cil$oc$server$component$InternetCard$TCPSocket$$owner() { return this.li$cil$oc$server$component$InternetCard$TCPSocket$$owner; } public void li$cil$oc$server$component$InternetCard$TCPSocket$$owner_$eq(Option<InternetCard> x$1) { this.li$cil$oc$server$component$InternetCard$TCPSocket$$owner = x$1; }
/* 254 */      private Future<InetAddress> li$cil$oc$server$component$InternetCard$TCPSocket$$address = null; public Future<InetAddress> li$cil$oc$server$component$InternetCard$TCPSocket$$address() { return this.li$cil$oc$server$component$InternetCard$TCPSocket$$address; } public void li$cil$oc$server$component$InternetCard$TCPSocket$$address_$eq(Future<InetAddress> x$1) { this.li$cil$oc$server$component$InternetCard$TCPSocket$$address = x$1; }
/* 255 */      private SocketChannel li$cil$oc$server$component$InternetCard$TCPSocket$$channel = null; public SocketChannel li$cil$oc$server$component$InternetCard$TCPSocket$$channel() { return this.li$cil$oc$server$component$InternetCard$TCPSocket$$channel; } public void li$cil$oc$server$component$InternetCard$TCPSocket$$channel_$eq(SocketChannel x$1) { this.li$cil$oc$server$component$InternetCard$TCPSocket$$channel = x$1; } private boolean isAddressResolved = false;
/* 256 */     private boolean isAddressResolved() { return this.isAddressResolved; } private void isAddressResolved_$eq(boolean x$1) { this.isAddressResolved = x$1; }
/* 257 */      private final UUID li$cil$oc$server$component$InternetCard$TCPSocket$$id = UUID.randomUUID(); public UUID li$cil$oc$server$component$InternetCard$TCPSocket$$id() { return this.li$cil$oc$server$component$InternetCard$TCPSocket$$id; }
/*     */ 
/*     */     
/* 260 */     private void setupSelector() { if (li$cil$oc$server$component$InternetCard$TCPSocket$$channel() == null)
/* 261 */         return;  InternetCard.TCPNotifier$.MODULE$.add(new Tuple2(li$cil$oc$server$component$InternetCard$TCPSocket$$channel(), new InternetCard$TCPSocket$$anonfun$setupSelector$1(this))); } public final class InternetCard$TCPSocket$$anonfun$setupSelector$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } public InternetCard$TCPSocket$$anonfun$setupSelector$1(InternetCard.TCPSocket $outer) {} public void apply$mcV$sp() {
/* 262 */         Option<InternetCard> option = this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$owner();
/* 263 */         if (option instanceof Some) { Some some = (Some)option; InternetCard internetCard = (InternetCard)some.x();
/* 264 */           internetCard.node().sendToVisible("computer.signal", new Object[] { "internet_ready", this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$id().toString() }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         else
/* 266 */         { this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$channel().close(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */       } }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():boolean -- Ensures a socket is connected. Errors if the connection failed.")
/*     */     public Object[] finishConnect(Context context, Arguments args) {
/* 273 */       synchronized (this) { Object[] arrayOfObject1 = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(checkConnected()) })), r = arrayOfObject1;
/* 274 */         setupSelector();
/* 275 */         return r; }
/*     */     
/*     */     }
/*     */     @Callback(doc = "function([n:number]):string -- Tries to read data from the socket stream. Returns the read byte array.")
/*     */     public synchronized Object[] read(Context context, Arguments args) {
/* 280 */       int n = scala.math.package$.MODULE$.min(li.cil.oc.Settings$.MODULE$.get().maxReadBuffer(), scala.math.package$.MODULE$.max(0, args.optInteger(0, 2147483647)));
/*     */       
/* 282 */       ByteBuffer buffer = ByteBuffer.allocate(n);
/* 283 */       int read = li$cil$oc$server$component$InternetCard$TCPSocket$$channel().read(buffer);
/*     */ 
/*     */       
/* 286 */       setupSelector();
/* 287 */       return checkConnected() ? ((read == -1) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$ })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Predef$.MODULE$.byteArrayOps(buffer.array()).view(0, read).toArray(scala.reflect.ClassTag$.MODULE$.Byte())
/*     */ 
/*     */             
/* 290 */             }))) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Array$.MODULE$.empty(scala.reflect.ClassTag$.MODULE$.Byte()) }));
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function(data:string):number -- Tries to write data to the socket stream. Returns the number of bytes written.")
/*     */     public synchronized Object[] write(Context context, Arguments args) {
/* 296 */       byte[] value = args.checkByteArray(0);
/* 297 */       return checkConnected() ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(li$cil$oc$server$component$InternetCard$TCPSocket$$channel().write(ByteBuffer.wrap(value)))
/*     */             
/* 299 */             })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0) }));
/*     */     }
/*     */     
/*     */     @Callback(direct = true, doc = "function() -- Closes an open socket stream.")
/*     */     public synchronized Object[] close(Context context, Arguments args) {
/* 304 */       close();
/* 305 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(direct = true, doc = "function():string -- Returns connection ID.")
/*     */     public synchronized Object[] id(Context context, Arguments args) {
/* 310 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { li$cil$oc$server$component$InternetCard$TCPSocket$$id().toString() }));
/*     */     }
/*     */     
/*     */     public void dispose(Context context) {
/* 314 */       super.dispose(context);
/* 315 */       close();
/*     */     }
/*     */     
/*     */     public void close() {
/* 319 */       li$cil$oc$server$component$InternetCard$TCPSocket$$owner().foreach((Function1)new InternetCard$TCPSocket$$anonfun$close$1(this)); } public final class InternetCard$TCPSocket$$anonfun$close$1 extends AbstractFunction1<InternetCard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public InternetCard$TCPSocket$$anonfun$close$1(InternetCard.TCPSocket $outer) {} public final void apply(InternetCard card) {
/* 320 */         card.connections().remove(this.$outer);
/* 321 */         this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$address().cancel(true);
/* 322 */         this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$channel().close();
/* 323 */         this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$owner_$eq((Option<InternetCard>)scala.None$.MODULE$);
/* 324 */         this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$address_$eq(null);
/* 325 */         this.$outer.li$cil$oc$server$component$InternetCard$TCPSocket$$channel_$eq(null);
/*     */       } }
/*     */ 
/*     */     
/*     */     private boolean checkConnected() {
/* 330 */       if (li$cil$oc$server$component$InternetCard$TCPSocket$$owner().isEmpty()) throw new IOException("connection lost");
/*     */       
/*     */       try {
/* 333 */         if (li$cil$oc$server$component$InternetCard$TCPSocket$$address().isCancelled()) {
/*     */           
/* 335 */           li$cil$oc$server$component$InternetCard$TCPSocket$$channel().close();
/* 336 */           throw new IOException("bad connection descriptor");
/*     */         } 
/* 338 */         if (li$cil$oc$server$component$InternetCard$TCPSocket$$address().isDone()) {
/*     */           try {
/* 340 */             li$cil$oc$server$component$InternetCard$TCPSocket$$address().get();
/*     */ 
/*     */             
/* 343 */             isAddressResolved_$eq(true);
/*     */           } catch (ExecutionException executionException) {
/*     */             throw executionException.getCause();
/*     */           } 
/*     */         } else {
/*     */         
/*     */         } 
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       } 
/*     */     }
/*     */     public TCPSocket() {}
/*     */     public class AddressResolver implements Callable<InetAddress> { private final URI uri; private final int port;
/*     */       
/* 357 */       public URI uri() { return this.uri; } public int port() { return this.port; }
/*     */        public AddressResolver(InternetCard.TCPSocket $outer, URI uri, int port) {} public InetAddress call() {
/* 359 */         InetAddress resolved = InetAddress.getByName(uri().getHost());
/* 360 */         InternetCard$.MODULE$.checkLists(resolved, uri().getHost());
/* 361 */         InetSocketAddress address = new InetSocketAddress(resolved, (uri().getPort() != -1) ? uri().getPort() : port());
/* 362 */         li$cil$oc$server$component$InternetCard$TCPSocket$AddressResolver$$$outer().li$cil$oc$server$component$InternetCard$TCPSocket$$channel().connect(address);
/* 363 */         return resolved;
/*     */       } }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class HTTPRequest
/*     */     extends AbstractValue
/*     */     implements Closable
/*     */   {
/*     */     public HTTPRequest(InternetCard owner, URL url, Option<String> post, Map<String, String> headers, Option<String> method) {
/* 408 */       this();
/* 409 */       li$cil$oc$server$component$InternetCard$HTTPRequest$$owner_$eq((Option<InternetCard>)new Some(owner));
/* 410 */       li$cil$oc$server$component$InternetCard$HTTPRequest$$stream_$eq(InternetCard$.MODULE$.li$cil$oc$server$component$InternetCard$$threadPool().submit(new RequestSender(this, url, post, headers, method)));
/*     */     }
/*     */     
/* 413 */     private Option<InternetCard> li$cil$oc$server$component$InternetCard$HTTPRequest$$owner = (Option<InternetCard>)scala.None$.MODULE$; private Option<InternetCard> li$cil$oc$server$component$InternetCard$HTTPRequest$$owner() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$owner; } public void li$cil$oc$server$component$InternetCard$HTTPRequest$$owner_$eq(Option<InternetCard> x$1) { this.li$cil$oc$server$component$InternetCard$HTTPRequest$$owner = x$1; }
/* 414 */      private Option<Tuple3<Object, String, Object>> li$cil$oc$server$component$InternetCard$HTTPRequest$$response = (Option<Tuple3<Object, String, Object>>)scala.None$.MODULE$; private Option<Tuple3<Object, String, Object>> li$cil$oc$server$component$InternetCard$HTTPRequest$$response() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$response; } public void li$cil$oc$server$component$InternetCard$HTTPRequest$$response_$eq(Option<Tuple3<Object, String, Object>> x$1) { this.li$cil$oc$server$component$InternetCard$HTTPRequest$$response = x$1; }
/* 415 */      private Future<InputStream> li$cil$oc$server$component$InternetCard$HTTPRequest$$stream = null; public Future<InputStream> li$cil$oc$server$component$InternetCard$HTTPRequest$$stream() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$stream; } public void li$cil$oc$server$component$InternetCard$HTTPRequest$$stream_$eq(Future<InputStream> x$1) { this.li$cil$oc$server$component$InternetCard$HTTPRequest$$stream = x$1; }
/* 416 */      private final ConcurrentLinkedQueue<Object> li$cil$oc$server$component$InternetCard$HTTPRequest$$queue = new ConcurrentLinkedQueue(); public ConcurrentLinkedQueue<Object> li$cil$oc$server$component$InternetCard$HTTPRequest$$queue() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$queue; }
/* 417 */      private Future<?> li$cil$oc$server$component$InternetCard$HTTPRequest$$reader = null; public Future<?> li$cil$oc$server$component$InternetCard$HTTPRequest$$reader() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$reader; } public void li$cil$oc$server$component$InternetCard$HTTPRequest$$reader_$eq(Future<?> x$1) { this.li$cil$oc$server$component$InternetCard$HTTPRequest$$reader = x$1; } private boolean li$cil$oc$server$component$InternetCard$HTTPRequest$$eof = false;
/* 418 */     private boolean li$cil$oc$server$component$InternetCard$HTTPRequest$$eof() { return this.li$cil$oc$server$component$InternetCard$HTTPRequest$$eof; } public void li$cil$oc$server$component$InternetCard$HTTPRequest$$eof_$eq(boolean x$1) { this.li$cil$oc$server$component$InternetCard$HTTPRequest$$eof = x$1; }
/*     */      @Callback(doc = "function():boolean -- Ensures a response is available. Errors if the connection failed.")
/*     */     public synchronized Object[] finishConnect(Context context, Arguments args) {
/* 421 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(checkResponse()) }));
/*     */     }
/*     */     @Callback(direct = true, doc = "function():number, string, table -- Get response code, message and headers.")
/*     */     public synchronized Object[] response(Context context, Arguments args) {
/* 425 */       Option<Tuple3<Object, String, Object>> option = li$cil$oc$server$component$InternetCard$HTTPRequest$$response();
/* 426 */       if (option instanceof Some) { Some some = (Some)option; Tuple3 tuple3 = (Tuple3)some.x(); if (tuple3 != null) { int code = BoxesRunTime.unboxToInt(tuple3._1()); String message = (String)tuple3._2(); Object headers = tuple3._3(); return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(code), message, headers })); }  }
/* 427 */        return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$ }));
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function([n:number]):string -- Tries to read data from the response. Returns the read byte array.")
/*     */     public synchronized Object[] read(Context context, Arguments args) {
/* 433 */       int n = scala.math.package$.MODULE$.min(li.cil.oc.Settings$.MODULE$.get().maxReadBuffer(), scala.math.package$.MODULE$.max(0, args.optInteger(0, 2147483647)));
/*     */ 
/*     */ 
/*     */       
/* 437 */       ByteBuffer buffer = ByteBuffer.allocate(n);
/* 438 */       int read = 0;
/* 439 */       while (!li$cil$oc$server$component$InternetCard$HTTPRequest$$queue().isEmpty() && read < n) {
/* 440 */         buffer.put(BoxesRunTime.unboxToByte(li$cil$oc$server$component$InternetCard$HTTPRequest$$queue().poll()));
/* 441 */         read++;
/*     */       } 
/* 443 */       if (read == 0) {
/* 444 */         readMore();
/*     */       }
/* 446 */       return checkResponse() ? ((li$cil$oc$server$component$InternetCard$HTTPRequest$$eof() && li$cil$oc$server$component$InternetCard$HTTPRequest$$queue().isEmpty()) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$ })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Predef$.MODULE$.byteArrayOps(buffer.array()).view(0, read).toArray(scala.reflect.ClassTag$.MODULE$.Byte())
/*     */ 
/*     */             
/* 449 */             }))) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Array$.MODULE$.empty(scala.reflect.ClassTag$.MODULE$.Byte()) }));
/*     */     }
/*     */     
/*     */     @Callback(direct = true, doc = "function() -- Closes an open socket stream.")
/*     */     public synchronized Object[] close(Context context, Arguments args) {
/* 454 */       close();
/* 455 */       return null;
/*     */     }
/*     */     
/*     */     public void dispose(Context context) {
/* 459 */       super.dispose(context);
/* 460 */       close();
/*     */     }
/*     */     
/*     */     public void close() {
/* 464 */       li$cil$oc$server$component$InternetCard$HTTPRequest$$owner().foreach((Function1)new InternetCard$HTTPRequest$$anonfun$close$2(this)); } public final class InternetCard$HTTPRequest$$anonfun$close$2 extends AbstractFunction1<InternetCard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public InternetCard$HTTPRequest$$anonfun$close$2(InternetCard.HTTPRequest $outer) {} public final void apply(InternetCard card) {
/* 465 */         card.connections().remove(this.$outer);
/* 466 */         this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$stream().cancel(true);
/* 467 */         (this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$reader() == null) ? BoxedUnit.UNIT : 
/* 468 */           BoxesRunTime.boxToBoolean(this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$reader().cancel(true));
/*     */         
/* 470 */         this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$owner_$eq((Option<InternetCard>)scala.None$.MODULE$);
/* 471 */         this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$stream_$eq(null);
/* 472 */         this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$reader_$eq(null);
/*     */       } }
/*     */ 
/*     */     
/*     */     private synchronized boolean checkResponse() {
/* 477 */       if (li$cil$oc$server$component$InternetCard$HTTPRequest$$owner().isEmpty()) throw new IOException("connection lost"); 
/* 478 */       if (li$cil$oc$server$component$InternetCard$HTTPRequest$$stream().isDone()) {
/* 479 */         if (li$cil$oc$server$component$InternetCard$HTTPRequest$$reader() == null)
/*     */           try {
/* 481 */             li$cil$oc$server$component$InternetCard$HTTPRequest$$stream().get();
/*     */ 
/*     */             
/* 484 */             readMore();
/*     */           } catch (ExecutionException executionException) {
/*     */             throw executionException.getCause();
/*     */           }  
/*     */       } else {
/*     */         return false;
/*     */       } 
/*     */     } private void readMore() {
/* 492 */       if ((li$cil$oc$server$component$InternetCard$HTTPRequest$$reader() == null || li$cil$oc$server$component$InternetCard$HTTPRequest$$reader().isCancelled() || li$cil$oc$server$component$InternetCard$HTTPRequest$$reader().isDone()) && 
/* 493 */         !li$cil$oc$server$component$InternetCard$HTTPRequest$$eof()) li$cil$oc$server$component$InternetCard$HTTPRequest$$reader_$eq(InternetCard$.MODULE$.li$cil$oc$server$component$InternetCard$$threadPool().submit(new InternetCard$HTTPRequest$$anon$1(this))); 
/*     */     } public HTTPRequest() {} public final class InternetCard$HTTPRequest$$anon$1 implements Runnable { public InternetCard$HTTPRequest$$anon$1(InternetCard.HTTPRequest $outer) {}
/* 495 */       public void run() { byte[] buffer = new byte[li.cil.oc.Settings$.MODULE$.get().maxReadBuffer()];
/* 496 */         int count = ((InputStream)this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$stream().get()).read(buffer);
/* 497 */         if (count < 0)
/* 498 */           this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$eof_$eq(true);  scala.runtime.RichInt$.MODULE$
/*     */           
/* 500 */           .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach((Function1)new InternetCard$HTTPRequest$$anon$1$$anonfun$run$1(this, buffer)); } public final class InternetCard$HTTPRequest$$anon$1$$anonfun$run$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; private final byte[] buffer$1; public final boolean apply(int i) { return apply$mcZI$sp(i); } public InternetCard$HTTPRequest$$anon$1$$anonfun$run$1(InternetCard$HTTPRequest$$anon$1 $outer, byte[] buffer$1) {} public boolean apply$mcZI$sp(int i) {
/* 501 */           return this.$outer.li$cil$oc$server$component$InternetCard$HTTPRequest$$anon$$$outer().li$cil$oc$server$component$InternetCard$HTTPRequest$$queue().add(BoxesRunTime.boxToByte(this.buffer$1[i]));
/*     */         } } }
/*     */     
/*     */     public class RequestSender implements Callable<InputStream> { private final URL url;
/*     */       private final Option<String> post;
/*     */       private final Map<String, String> headers;
/*     */       private final Option<String> method;
/*     */       
/* 509 */       public URL url() { return this.url; } public Option<String> post() { return this.post; } public Map<String, String> headers() { return this.headers; } public Option<String> method() { return this.method; } public RequestSender(InternetCard.HTTPRequest $outer, URL url, Option<String> post, Map<String, String> headers, Option<String> method) {}
/*     */       public InputStream call() { 
/* 511 */         try { InternetCard$.MODULE$.checkLists(InetAddress.getByName(url().getHost()), url().getHost());
/* 512 */           Proxy proxy = (Proxy)scala.Option$.MODULE$.apply(MinecraftServer.func_71276_C().func_110454_ao()).getOrElse((Function0)new InternetCard$HTTPRequest$RequestSender$$anonfun$2(this));
/* 513 */           URLConnection uRLConnection = url().openConnection(proxy);
/* 514 */           if (uRLConnection instanceof HttpURLConnection) { HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection; try {
/* 515 */               httpURLConnection.setDoInput(true);
/* 516 */               httpURLConnection.setDoOutput(post().isDefined());
/* 517 */               httpURLConnection.setRequestMethod(method().isDefined() ? (String)method().get() : (post().isDefined() ? "POST" : "GET"));
/* 518 */               headers().foreach(scala.Function$.MODULE$.tupled((Function2)new InternetCard$HTTPRequest$RequestSender$$anonfun$call$1(this, httpURLConnection)));
/* 519 */               if (post().isDefined()) {
/* 520 */                 httpURLConnection.setReadTimeout(li.cil.oc.Settings$.MODULE$.get().httpTimeout());
/*     */                 
/* 522 */                 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()));
/* 523 */                 out.write((String)post().get());
/* 524 */                 out.close();
/*     */               } 
/*     */               
/*     */               try {
/*     */               
/* 529 */               } catch (Exception exception) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             }
/*     */             finally {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 545 */               httpURLConnection.disconnect();
/*     */             }  }
/*     */           
/* 548 */           throw new IOException("unexpected connection type");
/*     */            }
/*     */         
/*     */         catch (UnknownHostException unknownHostException)
/*     */         
/* 553 */         { throw new IOException((new StringBuilder()).append("unknown host: ").append(scala.Option$.MODULE$.apply(unknownHostException.getMessage()).getOrElse(new InternetCard$HTTPRequest$RequestSender$$anonfun$call$2(this, unknownHostException))).toString()); } finally { Exception exception = null; }  } public final class InternetCard$HTTPRequest$RequestSender$$anonfun$2 extends AbstractFunction0<Proxy> implements Serializable { public static final long serialVersionUID = 0L; public final Proxy apply() { return Proxy.NO_PROXY; } public InternetCard$HTTPRequest$RequestSender$$anonfun$2(InternetCard.HTTPRequest.RequestSender $outer) {} } public final class InternetCard$HTTPRequest$RequestSender$$anonfun$call$1 extends AbstractFunction2<String, String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final HttpURLConnection x2$2; public final void apply(String x$1, String x$2) { this.x2$2.setRequestProperty(x$1, x$2); } public InternetCard$HTTPRequest$RequestSender$$anonfun$call$1(InternetCard.HTTPRequest.RequestSender $outer, HttpURLConnection x2$2) {} } public final class InternetCard$HTTPRequest$RequestSender$$anonfun$call$2 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final UnknownHostException e$1; public final String apply() { return this.e$1.toString(); }
/*     */          public InternetCard$HTTPRequest$RequestSender$$anonfun$call$2(InternetCard.HTTPRequest.RequestSender $outer, UnknownHostException e$1) {} } public final class InternetCard$HTTPRequest$RequestSender$$anonfun$call$3 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final Throwable e$2; public final String apply() {
/* 555 */           return this.e$2.toString();
/*     */         }
/*     */         
/*     */         public InternetCard$HTTPRequest$RequestSender$$anonfun$call$3(InternetCard.HTTPRequest.RequestSender $outer, Throwable e$2) {} }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   public static interface Closable {
/*     */     void close();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\InternetCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */