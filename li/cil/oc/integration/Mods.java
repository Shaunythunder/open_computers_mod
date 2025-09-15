/*     */ package li.cil.oc.integration;
/*     */ 
/*     */ import cpw.mods.fml.common.Loader;
/*     */ import cpw.mods.fml.common.ModAPIManager;
/*     */ import cpw.mods.fml.common.ModContainer;
/*     */ import cpw.mods.fml.common.versioning.ArtifactVersion;
/*     */ import cpw.mods.fml.common.versioning.VersionParser;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.TraitSetter;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\031mr!B\001\003\021\003Y\021\001B'pINT!a\001\003\002\027%tG/Z4sCRLwN\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!\001B'pIN\034\"!\004\t\021\005E!R\"\001\n\013\003M\tQa]2bY\006L!!\006\n\003\r\005s\027PU3g\021\0259R\002\"\001\031\003\031a\024N\\5u}Q\t1\002C\004\033\033\t\007I\021B\016\002\021!\fg\016\0327feN,\022\001\b\t\004;\t\"S\"\001\020\013\005}\001\023aB7vi\006\024G.\032\006\003CI\t!bY8mY\026\034G/[8o\023\t\031cDA\002TKR\004\"\001D\023\n\005\031\022!\001C'pIB\023x\016_=\t\r!j\001\025!\003\035\003%A\027M\0343mKJ\034\b\005C\004+\033\t\007I\021B\026\002\023-twn\0368N_\022\034X#\001\027\021\007uis&\003\002/=\tY\021I\035:bs\n+hMZ3s!\t\001\024'D\001\016\r\035\021T\002%A\002\002M\022q!T8e\005\006\034XmE\0022iq\002\"!\016\036\016\003YR!a\016\035\002\t1\fgn\032\006\002s\005!!.\031<b\023\tYdG\001\004PE*,7\r\036\t\003\031uJ!A\020\002\003\0075{G\rC\003Ac\021\005\021)\001\004%S:LG\017\n\013\002\005B\021\021cQ\005\003\tJ\021A!\0268ji\"9a)\ra\001\n\0239\025!\0049po\026\024H)[:bE2,G-F\001I!\t\t\022*\003\002K%\t9!i\\8mK\006t\007b\002'2\001\004%I!T\001\022a><XM\035#jg\006\024G.\0323`I\025\fHC\001\"O\021\035y5*!AA\002!\0131\001\037\0232\021\031\t\026\007)Q\005\021\006q\001o\\<fe\022K7/\0312mK\022\004\003\"B*2\r\003!\026AD5t\033>$\027I^1jY\006\024G.\032\013\002\021\")a+\rD\001/\006\021\021\016\032\013\0021B\021\021\f\030\b\003#iK!a\027\n\002\rA\023X\rZ3g\023\tifL\001\004TiJLgn\032\006\0037JAQ\001Y\031\005\002\035\0131\"[:Bm\006LG.\0312mK\")!-\rC\001\003\006aA-[:bE2,\007k\\<fe\")A-\rC\001K\006I1m\0348uC&tWM]\013\002MB\031\021cZ5\n\005!\024\"AB(qi&|g\016\005\002kg6\t1N\003\002m[\00611m\\7n_:T!A\\8\002\007\031lGN\003\002qc\006!Qn\0343t\025\005\021\030aA2qo&\021Ao\033\002\r\033>$7i\0348uC&tWM\035\005\006mF\"\ta^\001\bm\026\0248/[8o+\005A\bcA\thsB\021!0`\007\002w*\021Ap[\001\013m\026\0248/[8oS:<\027B\001@|\005=\t%\017^5gC\016$h+\032:tS>t\007bBA\001\033\001\006I\001L\001\013W:|wO\\'pIN\004\003BBA\003\033\021\0051&A\002BY2D\021\"!\003\016\005\004%\t!a\003\002\013\005+'GR2\026\005\0055\001c\001\031\002\020\0311\021\021C\007\001\003'\021\021bU5na2,Wj\0343\024\t\005=Ag\f\005\013-\006=!Q1A\005\002\005]Q#\001-\t\025\005m\021q\002B\001B\003%\001,A\002jI\002B\021B^A\b\005\003\005\013\021\002-\t\017]\ty\001\"\001\002\"Q1\021QBA\022\003KAaAVA\020\001\004A\006\002\003<\002 A\005\t\031\001-\t\025\005%\022q\002EC\002\023%q)A\bjg6{G-\021<bS2\f'\r\\3`\021)\ti#a\004\t\002\003\006K\001S\001\021SNlu\016Z!wC&d\027M\0317f?\002BaaUA\b\t\003!\006\002CA\032\033\001\006I!!\004\002\r\005+'GR2!\021%\t9$\004b\001\n\003\tY!A\005BOJL7I]1gi\"A\0211H\007!\002\023\ti!\001\006BOJL7I]1gi\002B\021\"a\020\016\005\004%\t!a\003\002'\005\003\b\017\\5fI\026sWM]4jgRL7m\035\032\t\021\005\rS\002)A\005\003\033\tA#\0219qY&,G-\0228fe\036L7\017^5dgJ\002\003\"CA$\033\t\007I\021AA\006\0039\te/\031:ji&\f\027\t\0323p]ND\001\"a\023\016A\003%\021QB\001\020\003Z\f'/\033;jC\006#Gm\0348tA!I\021qJ\007C\002\023\005\0211B\001\f\005\006$H\017\\3HK\006\024(\007\003\005\002T5\001\013\021BA\007\0031\021\025\r\036;mK\036+\027M\035\032!\021%\t9&\004b\001\n\003\tY!A\007CKR$XM\035*fG>\024Hm\035\005\t\0037j\001\025!\003\002\016\005q!)\032;uKJ\024VmY8sIN\004\003\"CA0\033\t\007I\021AA\006\003)\021En\\8e\033\006<\027n\031\005\t\003Gj\001\025!\003\002\016\005Y!\t\\8pI6\013w-[2!\021%\t9'\004b\001\n\003\tY!A\005CYV,\007k\\<fe\"A\0211N\007!\002\023\ti!\001\006CYV,\007k\\<fe\002B\021\"a\034\016\005\004%\t!a\003\002\025\t+\030\016\0343De\0064G\017\003\005\002t5\001\013\021BA\007\003-\021U/\0337e\007J\fg\r\036\021\t\023\005]TB1A\005\002\005-\021!\005\"vS2$7I]1gi2K'M]1ss\"A\0211P\007!\002\023\ti!\001\nCk&dGm\021:bMRd\025N\031:bef\004\003\"CA@\033\t\007I\021AA\006\003E\021U/\0337e\007J\fg\r\036*fG&\004Xm\035\005\t\003\007k\001\025!\003\002\016\005\021\")^5mI\016\023\030M\032;SK\016L\007/Z:!\021%\t9)\004b\001\n\003\tY!A\bCk&dGm\021:bMR$\026\016\\3t\021!\tY)\004Q\001\n\0055\021\001\005\"vS2$7I]1giRKG.Z:!\021%\ty)\004b\001\n\003\tY!A\bCk&dGm\021:bMR$vn\0347t\021!\t\031*\004Q\001\n\0055\021\001\005\"vS2$7I]1giR{w\016\\:!\021%\t9*\004b\001\n\003\tY!A\nCk&dGm\021:bMR$&/\0318ta>\024H\017\003\005\002\0346\001\013\021BA\007\003Q\021U/\0337e\007J\fg\r\036+sC:\034\bo\034:uA!I\021qT\007C\002\023\005\0211B\001\013\007>4\005*\0228fe\036L\b\002CAR\033\001\006I!!\004\002\027\r{g\tS#oKJ<\027\020\t\005\n\003Ok!\031!C\001\003\027\t\001bQ8G\021&#X-\034\005\t\003Wk\001\025!\003\002\016\005I1i\034$I\023R,W\016\t\005\n\003_k!\031!C\001\003\027\tabQ8G\021RKG.Z#oi&$\030\020\003\005\00246\001\013\021BA\007\003=\031uN\022%US2,WI\034;jif\004\003\"CA\\\033\t\007I\021AA\006\0035\031uN\022%Ue\006t7\017]8si\"A\0211X\007!\002\023\ti!\001\bD_\032CEK]1ogB|'\017\036\021\t\023\005}VB1A\005\002\005-\021!D\"pY>\024X\r\032'jO\"$8\017\003\005\002D6\001\013\021BA\007\0039\031u\016\\8sK\022d\025n\0325ug\002B\021\"a2\016\005\004%\t!a\003\002\033\r{W\016];uKJ\034%/\0314u\021!\tY-\004Q\001\n\0055\021AD\"p[B,H/\032:De\0064G\017\t\005\n\003\037l!\031!C\001\003\027\tQb\021:bMRLgnZ\"pgR\034\b\002CAj\033\001\006I!!\004\002\035\r\023\030M\032;j]\036\034un\035;tA!I\021q[\007C\002\023\005\021\021\\\001\020\t\026,\007o\025;pe\006<W-\0268jiV\021\0211\034\t\004a\005ugABAp\033\001\t\tOA\007DY\006\0348OQ1tK\022lu\016Z\n\005\003;$t\006\003\006W\003;\024)\031!C\001\003/A!\"a\007\002^\n\005\t\025!\003Y\021-\tI/!8\003\006\004%\t!a;\002\025\rd\027m]:OC6,7/\006\002\002nB!\021#a<Y\023\r\t\tP\005\002\013yI,\007/Z1uK\022t\004bCA{\003;\024\t\021)A\005\003[\f1b\0317bgNt\025-\\3tA!9q#!8\005\002\005eHCBAn\003w\fi\020\003\004W\003o\004\r\001\027\005\t\003S\f9\0201\001\002n\"Q\021\021FAo\021\013\007I\021B$\t\025\0055\022Q\034E\001B\003&\001\n\003\004T\003;$\t\001\026\005\t\005\017i\001\025!\003\002\\\006\001B)Z3q'R|'/Y4f+:LG\017\t\005\n\005\027i!\031!C\001\003\027\tQ\"\0227fGR\024\030nY1m\003\036,\007\002\003B\b\033\001\006I!!\004\002\035\025cWm\031;sS\016\fG.Q4fA!I!1C\007C\002\023\005\0211B\001\b\013:$WM]%P\021!\0219\"\004Q\001\n\0055\021\001C#oI\026\024\030j\024\021\t\023\tmQB1A\005\002\005-\021\001D#oI\026\0248\013^8sC\036,\007\002\003B\020\033\001\006I!!\004\002\033\025sG-\032:Ti>\024\030mZ3!\021%\021\031#\004b\001\n\003\tY!\001\006FqR\024\030mQ3mYND\001Ba\n\016A\003%\021QB\001\f\013b$(/Y\"fY2\034\b\005C\005\003,5\021\r\021\"\001\002\f\005ia)Y2u_JL'0\031;j_:D\001Ba\f\016A\003%\021QB\001\017\r\006\034Go\034:ju\006$\030n\0348!\021%\021\031$\004b\001\n\003\tY!\001\005G_J,7\017\036:z\021!\0219$\004Q\001\n\0055\021!\003$pe\026\034HO]=!\021%\021Y$\004b\001\n\003\tY!\001\bG_J<W-T;mi&\004\030M\035;\t\021\t}R\002)A\005\003\033\tqBR8sO\026lU\017\034;ja\006\024H\017\t\005\n\005\007j!\031!C\001\003\027\tAbR1mC\016$\030n\031:bMRD\001Ba\022\016A\003%\021QB\001\016\017\006d\027m\031;jGJ\fg\r\036\021\t\023\t-SB1A\005\002\005e\027\001C$sK\036$Vm\0315\t\021\t=S\002)A\005\0037\f\021b\022:fOR+7\r\033\021\t\023\tMSB1A\005\002\005-\021\001E%oIV\034HO]5bY\016\023\030M\032;3\021!\0219&\004Q\001\n\0055\021!E%oIV\034HO]5bY\016\023\030M\032;3A!I!1L\007C\002\023\005\0211B\001\030\023:$Wo\035;sS\006d7I]1giJ\032E.Y:tS\016D\001Ba\030\016A\003%\021QB\001\031\023:$Wo\035;sS\006d7I]1giJ\032E.Y:tS\016\004\003\"\003B2\033\t\007I\021AA\006\003)IenZ1nK^K7.\033\005\t\005Oj\001\025!\003\002\016\005Y\021J\\4b[\026<\026n[5!\021%\021Y'\004b\001\n\003\tY!\001\005NK.\fg.[:n\021!\021y'\004Q\001\n\0055\021!C'fW\006t\027n]7!\021%\021\031(\004b\001\n\003\tY!A\006NK.\fg.[:n\017\006\034\b\002\003B<\033\001\006I!!\004\002\0315+7.\0318jg6<\025m\035\021\t\023\tmTB1A\005\002\005-\021!C'j]\026\034'/\0314u\021!\021y(\004Q\001\n\0055\021AC'j]\026\034'/\0314uA!I!1Q\007C\002\023\005\0211B\001\024\033&tWMR1di>\024\030PU3m_\006$W\r\032\005\t\005\017k\001\025!\003\002\016\005!R*\0338f\r\006\034Go\034:z%\026dw.\0313fI\002B\021Ba#\016\005\004%\t!a\003\002\0235K8\017^2sC\032$\b\002\003BH\033\001\006I!!\004\002\0255K8\017^2sC\032$\b\005C\005\003\0246\021\r\021\"\001\002\f\005qaj\034;F]>,x\r[%uK6\034\b\002\003BL\033\001\006I!!\004\002\0379{G/\0228pk\036D\027\n^3ng\002B\021Ba'\016\005\004%\t!a\003\002\0339{G/\0228pk\036D7*Z=t\021!\021y*\004Q\001\n\0055\021A\004(pi\026sw.^4i\027\026L8\017\t\005\n\005Gk!\031!C\001\003\027\tQb\0249f]\016{W\016];uKJ\034\b\002\003BT\033\001\006I!!\004\002\035=\003XM\\\"p[B,H/\032:tA!I!1V\007C\002\023\005\0211B\001\n!>\024H/\0317Hk:D\001Ba,\016A\003%\021QB\001\013!>\024H/\0317Hk:\004\003\"\003BZ\033\t\007I\021AA\006\0039\001&o\0346fGR\024V\rZ\"pe\026D\001Ba.\016A\003%\021QB\001\020!J|'.Z2u%\026$7i\034:fA!I!1X\007C\002\023\005\0211B\001\027!J|'.Z2u%\026$GK]1og6L7o]5p]\"A!qX\007!\002\023\ti!A\fQe>TWm\031;SK\022$&/\0318t[&\0348/[8oA!I!1Y\007C\002\023\005\0211B\001\n%\006LGn\031:bMRD\001Ba2\016A\003%\021QB\001\013%\006LGn\031:bMR\004\003\"\003Bf\033\t\007I\021AA\006\003!\021V\r\032'pO&\034\007\002\003Bh\033\001\006I!!\004\002\023I+G\rT8hS\016\004\003\"\003Bj\033\t\007I\021AA\006\003-\021v\016^1ss\016\023\030M\032;\t\021\t]W\002)A\005\003\033\tABU8uCJL8I]1gi\002B\021Ba7\016\005\004%\tA!8\002\033M#\030M]4bi\026$Vm\03153+\t\021yN\005\003\003bRzca\002Br\005K\004!q\034\002\ryI,g-\0338f[\026tGO\020\005\t\005Ol\001\025!\003\003`\006q1\013^1sO\006$X\rV3dQJ\002\003\"\003Bv\033\t\007I\021AA\006\003)!\006.Y;nGJ\fg\r\036\005\t\005_l\001\025!\003\002\016\005YA\013[1v[\016\024\030M\032;!\021%\021\0310\004b\001\n\003\tY!\001\nUQ\006,X.[2F]\026\024x-[:uS\016\034\b\002\003B|\033\001\006I!!\004\002'QC\027-^7jG\026sWM]4jgRL7m\035\021\t\023\tmXB1A\005\002\005-\021\001\005+iKJl\027\r\\#ya\006t7/[8o\021!\021y0\004Q\001\n\0055\021!\005+iKJl\027\r\\#ya\006t7/[8oA!I11A\007C\002\023\005\0211B\001\021)&t7.\032:t\007>t7\017\036:vGRD\001ba\002\016A\003%\021QB\001\022)&t7.\032:t\007>t7\017\036:vGR\004\003\"CB\006\033\t\007I\021AA\006\003\025!\026jU\032E\021!\031y!\004Q\001\n\0055\021A\002+J'N\"\005\005C\005\004\0245\021\r\021\"\001\002\f\005QA+T3dQ^{'o[:\t\021\r]Q\002)A\005\003\033\t1\002V'fG\"<vN]6tA!I11D\007C\002\023\005\0211B\001\017-\026\0248/[8o\007\",7m[3s\021!\031y\"\004Q\001\n\0055\021a\004,feNLwN\\\"iK\016\\WM\035\021\t\023\r\rRB1A\005\002\005-\021!B,bS2\f\007\002CB\024\033\001\006I!!\004\002\r]\013\027\016\\1!\021%\031Y#\004b\001\n\003\tY!A\nXSJ,G.Z:t%\026$7\017^8oK\016\023U\t\003\005\00405\001\013\021BA\007\003Q9\026N]3mKN\034(+\0323ti>tWm\021\"FA!I11G\007C\002\023\005\0211B\001\024/&\024X\r\\3tgJ+Gm\035;p]\026\034f+\022\005\t\007oi\001\025!\003\002\016\005!r+\033:fY\026\0348OU3egR|g.Z*W\013\002B\021ba\017\016\005\004%\ta!\020\002\017A\023x\016_5fgV\0211q\b\t\005#\r\005C%C\002\004DI\021Q!\021:sCfD\001ba\022\016A\003%1qH\001\t!J|\0070[3tA!111J\007\005\002\005\013A!\0338ji\"91qJ\007\005\n\rE\023a\002;ss&s\027\016\036\013\004\005\016M\003bBB+\007\033\002\r\001J\001\004[>$waBB-\033!\00511L\001\004\023\022\033\bc\001\031\004^\03191qL\007\t\002\r\005$aA%EgN\0311Q\f\t\t\017]\031i\006\"\001\004fQ\02111\f\005\013\003o\031iF1A\005\006\r%TCAB6\037\t\031i'\t\002\0028!I\0211HB/A\003511\016\005\013\003\023\031iF1A\005\006\rMTCAB;\037\t\0319(\t\002\004z\005)\021-\032\032gG\"I\0211GB/A\00351Q\017\005\013\003\031iF1A\005\006\r}TCABA\037\t\031\031)\t\002\004\006\006\031\022\r\0359mS\026$WM\\3sO&\034H/[2te!I\0211IB/A\00351\021\021\005\013\003\017\032iF1A\005\006\r-UCABG\037\t\031y)\t\002\004\022\006i\021M^1sSRL\027\r\0323p]ND\021\"a\023\004^\001\006ia!$\t\025\005=3Q\fb\001\n\013\0319*\006\002\004\032>\02111T\021\003\007;\0131BY1ui2,w-Z1se!I\0211KB/A\00351\021\024\005\013\003/\032iF1A\005\006\r\rVCABS\037\t\0319+\t\002\004*\006i!-\032;uKJ\024XmY8sIND\021\"a\027\004^\001\006ia!*\t\025\005}3Q\fb\001\n\013\031y+\006\002\0042>\02111W\021\003\007k\0131\"Q,XCf|g\rV5nK\"I\0211MB/A\00351\021\027\005\013\003O\032iF1A\005\006\rmVCAB_\037\t\031y,\t\002\004B\006a!\r\\;fa><XM]!Q\023\"I\0211NB/A\00351Q\030\005\013\003_\032iF1A\005\006\r\035WCABe\037\t\031Y-\t\002\004N\006y!)^5mI\016\023\030M\032;}\007>\024X\rC\005\002t\ru\003\025!\004\004J\"Q\021qOB/\005\004%)aa5\026\005\rUwBABlC\t\031I.A\013Ck&dGm\021:bMR\f\005+\023?mS\n\024\030M]=\t\023\005m4Q\fQ\001\016\rU\007BCA@\007;\022\r\021\"\002\004`V\0211\021]\b\003\007G\f#a!:\002+\t+\030\016\0343De\0064G/\021)JyJ,7-\0339fg\"I\0211QB/A\00351\021\035\005\013\003\017\033iF1A\005\006\r-XCABw\037\t\031y/\t\002\004r\006\031\")^5mI\016\023\030M\032;B!&cH/\0337fg\"I\0211RB/A\00351Q\036\005\013\003\037\033iF1A\005\006\r]XCAB}\037\t\031Y0\t\002\004~\006\031\")^5mI\016\023\030M\032;B!&cHo\\8mg\"I\0211SB/A\00351\021 \005\013\003/\033iF1A\005\006\021\rQC\001C\003\037\t!9!\t\002\005\n\0059\")^5mI\016\023\030M\032;B!&cHO]1ogB|'\017\036\005\n\0037\033i\006)A\007\t\013A!\"a(\004^\t\007IQ\001C\b+\t!\tb\004\002\005\024\005\022AQC\001\017\007>4\005*\021)Jy\026tWM]4z\021%\t\031k!\030!\002\033!\t\002\003\006\002(\016u#\031!C\003\t7)\"\001\"\b\020\005\021}\021E\001C\021\0031\031uN\022%B!&c\030\016^3n\021%\tYk!\030!\002\033!i\002\003\006\0020\016u#\031!C\003\tO)\"\001\"\013\020\005\021-\022E\001C\027\003I\031uN\022%B!&cH/\0337fK:$\030\016^=\t\023\005M6Q\fQ\001\016\021%\002BCA\\\007;\022\r\021\"\002\0054U\021AQG\b\003\to\t#\001\"\017\002#\r{g\tS!Q\023r$(/\0318ta>\024H\017C\005\002<\016u\003\025!\004\0056!Q\021qXB/\005\004%)\001b\020\026\005\021\005sB\001C\"C\t!)%A\tfCNL8m\0347pe\026$G.[4iiND\021\"a1\004^\001\006i\001\"\021\t\025\005\0357Q\fb\001\n\013!Y%\006\002\005N=\021AqJ\021\003\003\017D\021\"a3\004^\001\006i\001\"\024\t\025\005=7Q\fb\001\n\013!)&\006\002\005X=\021A\021L\021\003\003\037D\021\"a5\004^\001\006i\001b\026\t\025\t-1Q\fb\001\n\013!y&\006\002\005b=\021A1M\021\003\tK\n1!\0227o\021%\021ya!\030!\002\033!\t\007\003\006\003\024\ru#\031!C\003\tW*\"\001\"\034\020\005\021=\024E\001B\n\021%\0219b!\030!\002\033!i\007\003\006\003\034\ru#\031!C\003\tk*\"\001b\036\020\005\021e\024E\001B\016\021%\021yb!\030!\002\033!9\b\003\006\003$\ru#\031!C\003\t*\"\001\"!\020\005\021\r\025E\001CC\003))\007\020\036:bG\026dGn\035\005\n\005O\031i\006)A\007\t\003C!Ba\013\004^\t\007IQ\001CF+\t!ii\004\002\005\020\006\022A\021S\001\016M\006\034Go\034:ju\006$\030n\0348\t\023\t=2Q\fQ\001\016\0215\005B\003B\032\007;\022\r\021\"\002\005\030V\021A\021T\b\003\t7\013#Aa\r\t\023\t]2Q\fQ\001\016\021e\005B\003B\036\007;\022\r\021\"\002\005\"V\021A1U\b\003\tK\013#Aa\017\t\023\t}2Q\fQ\001\016\021\r\006BCAl\007;\022\r\021\"\002\005,V\021AQV\b\003\t_\013#\001\"-\002G5Kg.\032$bGR|'/\037*fY>\fG-\0323}\t\026,\007o\025;pe\006<W-\0268ji\"I!qAB/A\0035AQ\026\005\013\005\007\032iF1A\005\006\021]VC\001C]\037\t!Y,\t\002\005>\006\001r)\0317bGRL7M]1gi\002\n\005+\023\005\n\005\017\032i\006)A\007\tsC!Ba\023\004^\t\007IQ\001Cb+\t!)m\004\002\005H\006\022A\021Z\001\tOJ,w\r^3dQ\"I!qJB/A\0035AQ\031\005\013\005'\032iF1A\005\006\021=WC\001Ci\037\t!\031.\t\002\005V\006\031\021j\021\032\t\023\t]3Q\fQ\001\016\021E\007B\003B.\007;\022\r\021\"\002\005\\V\021AQ\\\b\003\t?\f#\001\"9\002\027%\033%'L\"mCN\034\030n\031\005\n\005?\032i\006)A\007\t;D!\002b:\004^\t\007IQ\001Cu\003UIe\016Z;tiJL\027\r\\\"sC\032$(g\0259n_\022,\"\001b;\020\005\0215\030E\001Cx\003EI5IM\027DY\006\0348/[2.'Blw\016\032\005\n\tg\034i\006)A\007\tW\fa#\0238ekN$(/[1m\007J\fg\r\036\032Ta6|G\r\t\005\013\005G\032iF1A\005\006\021]XC\001C}\037\t!Y0\t\002\005~\0061\021jR,N_\022D\021Ba\032\004^\001\006i\001\"?\t\025\t-4Q\fb\001\n\013)\031!\006\002\006\006=\021QqA\021\003\005WB\021Ba\034\004^\001\006i!\"\002\t\025\tM4Q\fb\001\n\013)i!\006\002\006\020=\021Q\021C\021\003\013'\tq\"T3lC:L7/\\!Q\023r<\027m\035\005\n\005o\032i\006)A\007\013\037A!Ba\037\004^\t\007IQAC\r+\t)Yb\004\002\006\036\005\022!1\020\005\n\005\032i\006)A\007\0137A!Ba!\004^\t\007IQAC\022+\t))c\004\002\006(\005\022!1\021\005\n\005\017\033i\006)A\007\013KA!Ba#\004^\t\007IQAC\027+\t)yc\004\002\0062\005\022!1\022\005\n\005\037\033i\006)A\007\013_A!Ba%\004^\t\007IQAC\034+\t)Id\004\002\006<\005\022!1\023\005\n\005/\033i\006)A\007\013sA!Ba'\004^\t\007IQAC!+\t)\031e\004\002\006F\005\022QqI\001\016]>$XM\\8vO\"\\W-_:\t\023\t}5Q\fQ\001\016\025\r\003B\003BR\007;\022\r\021\"\002\006NU\021QqJ\b\003\013#\n#Aa)\t\023\t\0356Q\fQ\001\016\025=\003B\003BV\007;\022\r\021\"\002\006XU\021Q\021L\b\003\0137\n#Aa+\t\023\t=6Q\fQ\001\016\025e\003B\003BZ\007;\022\r\021\"\002\006bU\021Q1M\b\003\013K\n#!b\032\002\031A\023xN\033*fIr\034uN]3\t\023\t]6Q\fQ\001\016\025\r\004B\003B^\007;\022\r\021\"\002\006nU\021QqN\b\003\013c\n#!b\035\002)A\023xN\033*fIr$&/\0318t[&\0348/[8o\021%\021yl!\030!\002\033)y\007\003\006\003D\016u#\031!C\003\013s*\"!b\037\020\005\025u\024E\001Bb\021%\0219m!\030!\002\033)Y\b\003\006\003L\016u#\031!C\003\013\007+\"!\"\"\020\005\025\035\025E\001Bf\021%\021ym!\030!\002\033))\t\003\006\003T\016u#\031!C\003\013\033+\"!b$\020\005\025E\025E\001Bj\021%\0219n!\030!\002\033)y\t\003\006\003\\\016u#\031!C\003\013/+\"!\"'\020\005\025m\025E\001Bn\021%\0219o!\030!\002\033)I\n\003\006\003l\016u#\031!C\003\013C+\"!b)\020\005\025\025\026E\001Bv\021%\021yo!\030!\002\033)\031\013\003\006\003t\016u#\031!C\003\013W+\"!\",\020\005\025=\026EACY\003I!\b.Y;nS\016,g.\032:hSN$\030nY:\t\023\t]8Q\fQ\001\016\0255\006B\003B~\007;\022\r\021\"\002\0068V\021Q\021X\b\003\013w\013#Aa?\t\023\t}8Q\fQ\001\016\025e\006BCB\002\007;\022\r\021\"\002\006BV\021Q1Y\b\003\013\013\f#!b2\002\025Q\033uN\\:ueV\034G\017C\005\004\b\ru\003\025!\004\006D\"Q11BB/\005\004%)!\"4\026\005\025=wBACiC\t)\031.A\003uSN\034D\rC\005\004\020\ru\003\025!\004\006P\"Q11CB/\005\004%)!\"7\026\005\025mwBACoC\t)y.\001\006U\033\026\034\007n^8sWND\021ba\006\004^\001\006i!b7\t\025\rm1Q\fb\001\n\013))/\006\002\006h>\021Q\021^\021\003\0077A\021ba\b\004^\001\006i!b:\t\025\r\r2Q\fb\001\n\013)y/\006\002\006r>\021Q1_\021\003\007GA\021ba\n\004^\001\006i!\"=\t\025\r-2Q\fb\001\n\013)I0\006\002\006|>\021QQ`\021\003\013\f1b\026*.\007\n+EpQ8sK\"I1qFB/A\0035Q1 \005\013\r\013\031iF1A\005\006\031\035\021AE,je\026dWm]:SK\022\034Ho\0348f'Z+\"A\"\003\020\005\031-\021E\001D\007\003Q9\026N]3mKN\034(+\0323ti>tWmQ8sK\"Ia\021CB/A\0035a\021B\001\024/&\024X\r\\3tgJ+Gm\035;p]\026\034f\013I\004\n\r+i\021\021!E\001\r/\t\021bU5na2,Wj\0343\021\007A2IBB\005\002\0225\t\t\021#\001\007\034M\031a\021\004\t\t\017]1I\002\"\001\007 Q\021aq\003\005\013\rG1I\"%A\005\002\031\025\022a\007\023mKN\034\030N\\5uI\035\024X-\031;fe\022\"WMZ1vYR$#'\006\002\007()\032\001L\"\013,\005\031-\002\003\002D\027\roi!Ab\f\013\t\031Eb1G\001\nk:\034\007.Z2lK\022T1A\"\016\023\003)\tgN\\8uCRLwN\\\005\005\rs1yCA\tv]\016DWmY6fIZ\013'/[1oG\026\004")
/*     */ public final class Mods
/*     */ {
/*     */   public static void init() { Mods$.MODULE$.init(); }
/*     */   public static ModProxy[] Proxies() { return Mods$.MODULE$.Proxies(); }
/*     */   public static SimpleMod WirelessRedstoneSVE() { return Mods$.MODULE$.WirelessRedstoneSVE(); }
/*     */   public static SimpleMod WirelessRedstoneCBE() { return Mods$.MODULE$.WirelessRedstoneCBE(); }
/*     */   public static SimpleMod Waila() { return Mods$.MODULE$.Waila(); }
/*     */   public static SimpleMod VersionChecker() { return Mods$.MODULE$.VersionChecker(); }
/*     */   public static SimpleMod TMechWorks() { return Mods$.MODULE$.TMechWorks(); }
/*     */   public static SimpleMod TIS3D() { return Mods$.MODULE$.TIS3D(); }
/*     */   public static SimpleMod TinkersConstruct() { return Mods$.MODULE$.TinkersConstruct(); }
/*     */   public static SimpleMod ThermalExpansion() { return Mods$.MODULE$.ThermalExpansion(); }
/*     */   public static SimpleMod ThaumicEnergistics() { return Mods$.MODULE$.ThaumicEnergistics(); }
/*     */   public static SimpleMod Thaumcraft() { return Mods$.MODULE$.Thaumcraft(); }
/*     */   public static ModBase StargateTech2() { return Mods$.MODULE$.StargateTech2(); }
/*     */   public static SimpleMod RotaryCraft() { return Mods$.MODULE$.RotaryCraft(); }
/*     */   public static SimpleMod RedLogic() { return Mods$.MODULE$.RedLogic(); }
/*     */   public static SimpleMod Railcraft() { return Mods$.MODULE$.Railcraft(); }
/*     */   public static SimpleMod ProjectRedTransmission() { return Mods$.MODULE$.ProjectRedTransmission(); }
/*     */   public static SimpleMod ProjectRedCore() { return Mods$.MODULE$.ProjectRedCore(); }
/*     */   public static SimpleMod PortalGun() { return Mods$.MODULE$.PortalGun(); }
/*     */   public static SimpleMod OpenComputers() { return Mods$.MODULE$.OpenComputers(); }
/*     */   public static SimpleMod NotEnoughKeys() { return Mods$.MODULE$.NotEnoughKeys(); }
/*     */   public static SimpleMod NotEnoughItems() { return Mods$.MODULE$.NotEnoughItems(); }
/*     */   public static SimpleMod Mystcraft() { return Mods$.MODULE$.Mystcraft(); }
/*     */   public static SimpleMod MineFactoryReloaded() { return Mods$.MODULE$.MineFactoryReloaded(); }
/*     */   public static SimpleMod Minecraft() { return Mods$.MODULE$.Minecraft(); }
/*     */   public static SimpleMod MekanismGas() { return Mods$.MODULE$.MekanismGas(); }
/*     */   public static SimpleMod Mekanism() { return Mods$.MODULE$.Mekanism(); }
/*     */   public static SimpleMod IngameWiki() { return Mods$.MODULE$.IngameWiki(); }
/*     */   public static SimpleMod IndustrialCraft2Classic() { return Mods$.MODULE$.IndustrialCraft2Classic(); }
/*     */   public static SimpleMod IndustrialCraft2() { return Mods$.MODULE$.IndustrialCraft2(); }
/*     */   public static ClassBasedMod GregTech() { return Mods$.MODULE$.GregTech(); }
/*     */   public static SimpleMod Galacticraft() { return Mods$.MODULE$.Galacticraft(); }
/*     */   public static SimpleMod ForgeMultipart() { return Mods$.MODULE$.ForgeMultipart(); }
/*     */   public static SimpleMod Forestry() { return Mods$.MODULE$.Forestry(); }
/*     */   public static SimpleMod Factorization() { return Mods$.MODULE$.Factorization(); }
/*     */   public static SimpleMod ExtraCells() { return Mods$.MODULE$.ExtraCells(); }
/*     */   public static SimpleMod EnderStorage() { return Mods$.MODULE$.EnderStorage(); }
/*     */   public static SimpleMod EnderIO() { return Mods$.MODULE$.EnderIO(); } public static SimpleMod ElectricalAge() { return Mods$.MODULE$.ElectricalAge(); } public static ClassBasedMod DeepStorageUnit() { return Mods$.MODULE$.DeepStorageUnit(); } public static SimpleMod CraftingCosts() { return Mods$.MODULE$.CraftingCosts(); } public static SimpleMod ComputerCraft() { return Mods$.MODULE$.ComputerCraft(); } public static SimpleMod ColoredLights() { return Mods$.MODULE$.ColoredLights(); } public static SimpleMod CoFHTransport() { return Mods$.MODULE$.CoFHTransport(); } public static SimpleMod CoFHTileEntity() { return Mods$.MODULE$.CoFHTileEntity(); } public static SimpleMod CoFHItem() { return Mods$.MODULE$.CoFHItem(); } public static SimpleMod CoFHEnergy() { return Mods$.MODULE$.CoFHEnergy(); } public static SimpleMod BuildCraftTransport() { return Mods$.MODULE$.BuildCraftTransport(); } public static SimpleMod BuildCraftTools() { return Mods$.MODULE$.BuildCraftTools(); } public static SimpleMod BuildCraftTiles() { return Mods$.MODULE$.BuildCraftTiles(); } public static SimpleMod BuildCraftRecipes() { return Mods$.MODULE$.BuildCraftRecipes(); } public static SimpleMod BuildCraftLibrary() { return Mods$.MODULE$.BuildCraftLibrary(); } public static SimpleMod BuildCraft() { return Mods$.MODULE$.BuildCraft(); } public static SimpleMod BluePower() { return Mods$.MODULE$.BluePower(); } public static SimpleMod BloodMagic() { return Mods$.MODULE$.BloodMagic(); } public static SimpleMod BetterRecords() { return Mods$.MODULE$.BetterRecords(); } public static SimpleMod BattleGear2() { return Mods$.MODULE$.BattleGear2(); } public static SimpleMod AvaritiaAddons() { return Mods$.MODULE$.AvaritiaAddons(); } public static SimpleMod AppliedEnergistics2() { return Mods$.MODULE$.AppliedEnergistics2(); } public static SimpleMod AgriCraft() {
/*     */     return Mods$.MODULE$.AgriCraft();
/*     */   } public static SimpleMod Ae2Fc() {
/*     */     return Mods$.MODULE$.Ae2Fc();
/*     */   } public static ArrayBuffer<ModBase> All() {
/*     */     return Mods$.MODULE$.All();
/*     */   } public final class Mods$$anon$1 implements ModBase
/*     */   {
/*  68 */     private boolean isModAvailable_; public boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled() { return this.li$cil$oc$integration$Mods$ModBase$$powerDisabled; } private boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled; private volatile boolean bitmap$0; @TraitSetter public void li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(boolean x$1) { this.li$cil$oc$integration$Mods$ModBase$$powerDisabled = x$1; } public boolean isAvailable() { return Mods.ModBase$class.isAvailable(this); } public void disablePower() { Mods.ModBase$class.disablePower(this); } public Option<ModContainer> container() { return Mods.ModBase$class.container(this); } public Option<ArtifactVersion> version() { return Mods.ModBase$class.version(this); } public Mods$$anon$1() { Mods.ModBase$class.$init$(this); }
/*  69 */     public String id() { return "StargateTech2"; } private boolean isModAvailable_$lzycompute() { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: dup
/*     */       //   2: astore_1
/*     */       //   3: monitorenter
/*     */       //   4: aload_0
/*     */       //   5: getfield bitmap$0 : Z
/*     */       //   8: ifne -> 64
/*     */       //   11: aload_0
/*     */       //   12: ldc 'StargateTech2'
/*     */       //   14: invokestatic isModLoaded : (Ljava/lang/String;)Z
/*     */       //   17: ifeq -> 55
/*     */       //   20: invokestatic instance : ()Lcpw/mods/fml/common/Loader;
/*     */       //   23: invokevirtual getIndexedModList : ()Ljava/util/Map;
/*     */       //   26: ldc 'StargateTech2'
/*     */       //   28: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   33: checkcast cpw/mods/fml/common/ModContainer
/*     */       //   36: astore_2
/*     */       //   37: aload_2
/*     */       //   38: invokeinterface getVersion : ()Ljava/lang/String;
/*     */       //   43: ldc '0.7.'
/*     */       //   45: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */       //   48: ifeq -> 55
/*     */       //   51: iconst_1
/*     */       //   52: goto -> 56
/*     */       //   55: iconst_0
/*     */       //   56: putfield isModAvailable_ : Z
/*     */       //   59: aload_0
/*     */       //   60: iconst_1
/*     */       //   61: putfield bitmap$0 : Z
/*     */       //   64: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   67: pop
/*     */       //   68: aload_1
/*     */       //   69: monitorexit
/*     */       //   70: aload_0
/*     */       //   71: getfield isModAvailable_ : Z
/*     */       //   74: ireturn
/*     */       //   75: aload_1
/*     */       //   76: monitorexit
/*     */       //   77: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #71	-> 0
/*     */       //   #72	-> 20
/*     */       //   #73	-> 37
/*     */       //   #71	-> 51
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	78	0	this	Lli/cil/oc/integration/Mods$$anon$1;
/*     */       //   37	11	2	mod	Lcpw/mods/fml/common/ModContainer;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   4	70	75	finally }
/*     */     private boolean isModAvailable_() {
/*  71 */       return this.bitmap$0 ? this.isModAvailable_ : isModAvailable_$lzycompute();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isModAvailable() {
/*  76 */       return isModAvailable_();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Mods$$anonfun$init$1
/*     */     extends AbstractFunction1<ModProxy, BoxedUnit>
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(ModProxy proxy) {
/* 153 */       Mods$.MODULE$.li$cil$oc$integration$Mods$$tryInit(proxy);
/*     */     } }
/*     */   public static class IDs$ { public static final IDs$ MODULE$; private final String AgriCraft; private final String Ae2Fc; private final String AppliedEnergistics2; private final String AvaritiaAddons; private final String BattleGear2; private final String BetterRecords; private final String BloodMagic; private final String BluePower; private final String BuildCraft; private final String BuildCraftLibrary; private final String BuildCraftRecipes; private final String BuildCraftTiles; private final String BuildCraftTools; private final String BuildCraftTransport; private final String CoFHEnergy; private final String CoFHItem; private final String CoFHTileEntity; private final String CoFHTransport; private final String ColoredLights; private final String ComputerCraft; private final String CraftingCosts; private final String ElectricalAge; private final String EnderIO; private final String EnderStorage; private final String ExtraCells; private final String Factorization; private final String Forestry; private final String ForgeMultipart; private final String DeepStorageUnit; private final String Galacticraft; private final String GregTech; private final String IndustrialCraft2; private final String IndustrialCraft2Classic; private final String IndustrialCraft2Spmod; private final String IngameWiki; private final String Mekanism; private final String MekanismGas; private final String Minecraft; private final String MineFactoryReloaded; private final String Mystcraft; private final String NotEnoughItems; private final String NotEnoughKeys; private final String OpenComputers; private final String PortalGun; private final String ProjectRedCore;
/*     */     private final String ProjectRedTransmission;
/*     */     private final String Railcraft;
/*     */     private final String RedLogic;
/*     */     private final String RotaryCraft;
/*     */     private final String StargateTech2;
/*     */     private final String Thaumcraft;
/*     */     private final String ThaumicEnergistics;
/*     */     private final String ThermalExpansion;
/*     */     private final String TinkersConstruct;
/*     */     private final String TIS3D;
/*     */     private final String TMechWorks;
/*     */     private final String VersionChecker;
/*     */     private final String Waila;
/*     */     private final String WirelessRedstoneCBE;
/*     */     private final String WirelessRedstoneSV;
/*     */     
/* 172 */     public final String AgriCraft() { return "AgriCraft"; }
/* 173 */     public final String Ae2Fc() { return "ae2fc"; }
/* 174 */     public final String AppliedEnergistics2() { return "appliedenergistics2"; }
/* 175 */     public final String AvaritiaAddons() { return "avaritiaddons"; }
/* 176 */     public final String BattleGear2() { return "battlegear2"; }
/* 177 */     public final String BetterRecords() { return "betterrecords"; }
/* 178 */     public final String BloodMagic() { return "AWWayofTime"; }
/* 179 */     public final String BluePower() { return "bluepowerAPI"; }
/* 180 */     public final String BuildCraft() { return "BuildCraft|Core"; }
/* 181 */     public final String BuildCraftLibrary() { return "BuildCraftAPI|library"; }
/* 182 */     public final String BuildCraftRecipes() { return "BuildCraftAPI|recipes"; }
/* 183 */     public final String BuildCraftTiles() { return "BuildCraftAPI|tiles"; }
/* 184 */     public final String BuildCraftTools() { return "BuildCraftAPI|tools"; }
/* 185 */     public final String BuildCraftTransport() { return "BuildCraftAPI|transport"; }
/* 186 */     public final String CoFHEnergy() { return "CoFHAPI|energy"; }
/* 187 */     public final String CoFHItem() { return "CoFHAPI|item"; }
/* 188 */     public final String CoFHTileEntity() { return "CoFHAPI|tileentity"; }
/* 189 */     public final String CoFHTransport() { return "CoFHAPI|transport"; }
/* 190 */     public final String ColoredLights() { return "easycoloredlights"; }
/* 191 */     public final String ComputerCraft() { return "ComputerCraft"; }
/* 192 */     public final String CraftingCosts() { return "CraftingCosts"; }
/* 193 */     public final String ElectricalAge() { return "Eln"; }
/* 194 */     public final String EnderIO() { return "EnderIO"; }
/* 195 */     public final String EnderStorage() { return "EnderStorage"; }
/* 196 */     public final String ExtraCells() { return "extracells"; }
/* 197 */     public final String Factorization() { return "factorization"; }
/* 198 */     public final String Forestry() { return "Forestry"; }
/* 199 */     public final String ForgeMultipart() { return "ForgeMultipart"; }
/* 200 */     public final String DeepStorageUnit() { return "MineFactoryReloaded|DeepStorageUnit"; }
/* 201 */     public final String Galacticraft() { return "Galacticraft API"; }
/* 202 */     public final String GregTech() { return "gregtech"; }
/* 203 */     public final String IndustrialCraft2() { return "IC2"; }
/* 204 */     public final String IndustrialCraft2Classic() { return "IC2-Classic"; }
/* 205 */     public final String IndustrialCraft2Spmod() { return "IC2-Classic-Spmod"; }
/* 206 */     public final String IngameWiki() { return "IGWMod"; }
/* 207 */     public final String Mekanism() { return "Mekanism"; }
/* 208 */     public final String MekanismGas() { return "MekanismAPI|gas"; }
/* 209 */     public final String Minecraft() { return "Minecraft"; }
/* 210 */     public final String MineFactoryReloaded() { return "MineFactoryReloaded"; }
/* 211 */     public final String Mystcraft() { return "Mystcraft"; }
/* 212 */     public final String NotEnoughItems() { return "NotEnoughItems"; }
/* 213 */     public final String NotEnoughKeys() { return "notenoughkeys"; }
/* 214 */     public final String OpenComputers() { return "OpenComputers"; }
/* 215 */     public final String PortalGun() { return "PortalGun"; }
/* 216 */     public final String ProjectRedCore() { return "ProjRed|Core"; }
/* 217 */     public final String ProjectRedTransmission() { return "ProjRed|Transmission"; }
/* 218 */     public final String Railcraft() { return "Railcraft"; }
/* 219 */     public final String RedLogic() { return "RedLogic"; }
/* 220 */     public final String RotaryCraft() { return "RotaryCraft"; }
/* 221 */     public final String StargateTech2() { return "StargateTech2"; }
/* 222 */     public final String Thaumcraft() { return "Thaumcraft"; }
/* 223 */     public final String ThaumicEnergistics() { return "thaumicenergistics"; }
/* 224 */     public final String ThermalExpansion() { return "ThermalExpansion"; }
/* 225 */     public final String TinkersConstruct() { return "TConstruct"; }
/* 226 */     public final String TIS3D() { return "tis3d"; }
/* 227 */     public final String TMechWorks() { return "TMechworks"; }
/* 228 */     public final String VersionChecker() { return "VersionChecker"; }
/* 229 */     public final String Waila() { return "Waila"; }
/* 230 */     public final String WirelessRedstoneCBE() { return "WR-CBE|Core"; } public final String WirelessRedstoneSV() {
/* 231 */       return "WirelessRedstoneCore";
/*     */     }
/*     */     
/*     */     public IDs$()
/*     */     {
/* 236 */       MODULE$ = this; } } public static abstract class ModBase$class { public static void $init$(Mods.ModBase $this) {
/* 237 */       Mods$.MODULE$.li$cil$oc$integration$Mods$$knownMods().$plus$eq($this);
/*     */       
/* 239 */       $this.li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(false);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static boolean isAvailable(Mods.ModBase $this) {
/* 245 */       return $this.isModAvailable();
/*     */     }
/*     */     
/*     */     public static void disablePower(Mods.ModBase $this) {
/* 249 */       $this.li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(true);
/*     */     } public static Option container(Mods.ModBase $this) {
/* 251 */       return scala.Option$.MODULE$.apply(Loader.instance().getIndexedModList().get($this.id()));
/*     */     }
/* 253 */     public static Option version(Mods.ModBase $this) { return $this.container().map((Function1)new Mods$ModBase$$anonfun$version$1($this)); } } public static interface ModBase extends Mod { boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled(); @TraitSetter void li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(boolean param1Boolean); boolean isModAvailable(); String id(); boolean isAvailable(); void disablePower(); Option<ModContainer> container(); Option<ArtifactVersion> version(); public final class Mods$ModBase$$anonfun$version$1 extends AbstractFunction1<ModContainer, ArtifactVersion> implements Serializable { public static final long serialVersionUID = 0L; public final ArtifactVersion apply(ModContainer x$1) { return x$1.getProcessedVersion(); }
/*     */        public Mods$ModBase$$anonfun$version$1(Mods.ModBase $outer) {} } }
/*     */   public static class SimpleMod$ { public static final SimpleMod$ MODULE$;
/* 256 */     public String $lessinit$greater$default$2() { return ""; } public SimpleMod$() { MODULE$ = this; } } public static class SimpleMod implements ModBase { private final String id; private final String version; private boolean isModAvailable_; private boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled; private volatile boolean bitmap$0; public boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled() { return this.li$cil$oc$integration$Mods$ModBase$$powerDisabled; } @TraitSetter public void li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(boolean x$1) { this.li$cil$oc$integration$Mods$ModBase$$powerDisabled = x$1; } public boolean isAvailable() { return Mods.ModBase$class.isAvailable(this); } public void disablePower() { Mods.ModBase$class.disablePower(this); } public Option<ModContainer> container() { return Mods.ModBase$class.container(this); } public Option<ArtifactVersion> version() { return Mods.ModBase$class.version(this); } public String id() { return this.id; } public SimpleMod(String id, String version) { Mods.ModBase$class.$init$(this); }
/* 257 */     private boolean isModAvailable_$lzycompute() { synchronized (this) { if (!this.bitmap$0) {
/* 258 */           ArtifactVersion version = VersionParser.parseVersionReference((new StringBuilder()).append(id()).append(this.version).toString());
/* 259 */           this.isModAvailable_ = Loader.isModLoaded(version.getLabel()) ? 
/* 260 */             version.containsVersion(((ModContainer)Loader.instance().getIndexedModList().get(version.getLabel())).getProcessedVersion()) : 
/* 261 */             ModAPIManager.INSTANCE.hasAPI(version.getLabel()); this.bitmap$0 = true;
/*     */         }  return this.isModAvailable_; }
/*     */        } private boolean isModAvailable_() { return this.bitmap$0 ? this.isModAvailable_ : isModAvailable_$lzycompute(); }
/* 264 */     public boolean isModAvailable() { return isModAvailable_(); }
/*     */      }
/*     */   public static class ClassBasedMod implements ModBase { private final String id; private final Seq<String> classNames; private boolean isModAvailable_; private boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled; private volatile boolean bitmap$0;
/* 267 */     public boolean li$cil$oc$integration$Mods$ModBase$$powerDisabled() { return this.li$cil$oc$integration$Mods$ModBase$$powerDisabled; } @TraitSetter public void li$cil$oc$integration$Mods$ModBase$$powerDisabled_$eq(boolean x$1) { this.li$cil$oc$integration$Mods$ModBase$$powerDisabled = x$1; } public boolean isAvailable() { return Mods.ModBase$class.isAvailable(this); } public void disablePower() { Mods.ModBase$class.disablePower(this); } public Option<ModContainer> container() { return Mods.ModBase$class.container(this); } public Option<ArtifactVersion> version() { return Mods.ModBase$class.version(this); } public String id() { return this.id; } public Seq<String> classNames() { return this.classNames; } public ClassBasedMod(String id, Seq<String> classNames) { Mods.ModBase$class.$init$(this); }
/* 268 */     private boolean isModAvailable_$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.isModAvailable_ = classNames().forall((Function1)new Mods$ClassBasedMod$$anonfun$isModAvailable_$1(this)); this.bitmap$0 = true; }  return this.isModAvailable_; }  } private boolean isModAvailable_() { return this.bitmap$0 ? this.isModAvailable_ : isModAvailable_$lzycompute(); } public final class Mods$ClassBasedMod$$anonfun$isModAvailable_$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(String className) { try {  } finally {} return false; }
/*     */       
/*     */       public Mods$ClassBasedMod$$anonfun$isModAvailable_$1(Mods.ClassBasedMod $outer) {} }
/*     */     public boolean isModAvailable() {
/* 272 */       return isModAvailable_();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\Mods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */