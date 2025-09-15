/*     */ package li.cil.oc.common.entity;
/*     */ 
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.Vec3;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\021-h\001B\001\003\0015\021Q\001\022:p]\026T!a\001\003\002\r\025tG/\033;z\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\002\001\017/}!s%\f\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\t1QI\034;jif\004\"\001G\017\016\003eQ!AG\016\002\0175\f7\r[5oK*\021ADB\001\004CBL\027B\001\020\032\005-i\025m\0315j]\026Dun\035;\021\005\001\032S\"A\021\013\005\tZ\022\001C5oi\026\024h.\0317\n\005\005\t\003C\001\021&\023\t1\023EA\005S_R\fG/\0312mKB\021\001fK\007\002S)\021!fG\001\b]\026$xo\034:l\023\ta\023F\001\006B]\006d\027P_1cY\026\004\"\001\007\030\n\005=J\"aB\"p]R,\007\020\036\005\tc\001\021)\031!C\001e\005)qo\034:mIV\t1\007\005\0025m5\tQG\003\0022#%\021q'\016\002\006/>\024H\016\032\005\ts\001\021\t\021)A\005g\0051qo\034:mI\002BQa\017\001\005\002q\na\001P5oSRtDCA\037@!\tq\004!D\001\003\021\025\t$\b1\0014\021\035\t\005A1A\005\002\t\013qa\032:bm&$\0300F\001D!\t!u)D\001F\025\0051\025!B:dC2\f\027B\001%F\005\0251En\\1u\021\031Q\005\001)A\005\007\006AqM]1wSRL\b\005C\004M\001\t\007I\021\001\"\002\t\021\024\030m\032\005\007\035\002\001\013\021B\"\002\013\021\024\030m\032\021\t\017A\003!\031!C\001\005\006yQ.\031=BG\016,G.\032:bi&|g\016\003\004S\001\001\006IaQ\001\021[\006D\030iY2fY\026\024\030\r^5p]\002Bq\001\026\001C\002\023\005!)A\006nCb4V\r\\8dSRL\bB\002,\001A\003%1)\001\007nCb4V\r\\8dSRL\b\005C\004Y\001\t\007I\021A-\002!5\f\0070\0238wK:$xN]=TSj,W#\001.\021\005\021[\026B\001/F\005\rIe\016\036\005\007=\002\001\013\021\002.\002#5\f\0070\0238wK:$xN]=TSj,\007\005C\004a\001\t\007I\021A1\002!Q\f'oZ3u\r2\f\007/\0218hY\026\034X#\0012\021\007\021\033W-\003\002e\013\n)\021I\035:bsB\031AiY\"\t\r\035\004\001\025!\003c\003E!\030M]4fi\032c\027\r]!oO2,7\017\t\005\bS\002\021\r\021\"\001b\003)1G.\0319B]\036dWm\035\005\007W\002\001\013\021\0022\002\027\031d\027\r]!oO2,7\017\t\005\b[\002\001\r\021\"\001Z\0039qW\r\037;GY\006\0048\t[1oO\026Dqa\034\001A\002\023\005\001/\001\noKb$h\t\\1q\007\"\fgnZ3`I\025\fHCA9u!\t!%/\003\002t\013\n!QK\\5u\021\035)h.!AA\002i\0131\001\037\0232\021\0319\b\001)Q\0055\006ya.\032=u\r2\f\007o\0215b]\036,\007\005C\004z\001\001\007I\021\001\"\002\023\t|G-_!oO2,\007bB>\001\001\004%\t\001`\001\016E>$\0270\0218hY\026|F%Z9\025\005El\bbB;{\003\003\005\ra\021\005\007\002\001\013\025B\"\002\025\t|G-_!oO2,\007\005\003\005\002\004\001\001\r\021\"\001C\003=\tgnZ;mCJ4V\r\\8dSRL\b\"CA\004\001\001\007I\021AA\005\003M\tgnZ;mCJ4V\r\\8dSRLx\fJ3r)\r\t\0301\002\005\tk\006\025\021\021!a\001\007\"9\021q\002\001!B\023\031\025\001E1oOVd\027M\035,fY>\034\027\016^=!\021!\t\031\002\001a\001\n\003I\026!\0078fqR\fenZ;mCJ4V\r\\8dSRL8\t[1oO\026D\021\"a\006\001\001\004%\t!!\007\002;9,\007\020^!oOVd\027M\035,fY>\034\027\016^=DQ\006tw-Z0%KF$2!]A\016\021!)\030QCA\001\002\004Q\006bBA\020\001\001\006KAW\001\033]\026DH/\0218hk2\f'OV3m_\016LG/_\"iC:<W\r\t\005\t\003G\001\001\031!C\0013\006\001B.Y:u\013:,'oZ=Va\022\fG/\032\005\n\003O\001\001\031!C\001\003S\tA\003\\1ti\026sWM]4z+B$\027\r^3`I\025\fHcA9\002,!AQ/!\n\002\002\003\007!\fC\004\0020\001\001\013\025\002.\002#1\f7\017^#oKJ<\0270\0269eCR,\007\005C\005\0024\001\021\r\021\"\001\0026\005!\021N\0344p+\t\t9\004\005\003\002:\005\rSBAA\036\025\021\ti$a\020\002\t\021\fG/\031\006\004\003\003\"\021\001B5uK6LA!!\022\002<\tIAI]8oK\022\013G/\031\005\t\003\023\002\001\025!\003\0028\005)\021N\0344pA!A!\004\001b\001\n\003\ti%\006\002\002PA\031\001$!\025\n\007\005M\023DA\004NC\016D\027N\\3\t\021\005]\003\001)A\005\003\037\n\001\"\\1dQ&tW\r\t\005\n\0037\002!\031!C\001\003;\nqaY8oiJ|G.\006\002\002`A!\021\021MA6\033\t\t\031G\003\003\002f\005\035\024!C2p[B|g.\0328u\025\r\tIGB\001\007g\026\024h/\032:\n\007\005\t\031\007\003\005\002p\001\001\013\021BA0\003!\031wN\034;s_2\004\003\"CA:\001\t\007I\021AA;\003)\031w.\0349p]\026tGo]\013\003\003o\022b!!\037\002\002\006EeaBA>\003{\002\021q\017\002\ryI,g-\0338f[\026tGO\020\005\t\003\002\001\025!\003\002x\005Y1m\\7q_:,g\016^:!!\021\t\031)!$\016\005\005\025%\002BAD\003\023\013A\001\\1oO*\021\0211R\001\005U\0064\030-\003\003\002\020\006\025%AB(cU\026\034G\017\005\003\002\024\006eUBAAK\025\r\t9\nB\001\nS:4XM\034;pefLA!a'\002\026\n\0212i\\7q_:,g\016^%om\026tGo\034:z\021!\ty*!\037\005B\005\005\026\001\0025pgR,\022!\020\005\n\003K\003!\031!C\001\003O\013!#Z9vSBlWM\034;J]Z,g\016^8ssV\021\021\021\026\n\007\003W\013\t)!-\007\017\005m\024Q\026\001\002*\"A\021q\026\001!\002\023\tI+A\nfcVL\007/\\3oi&sg/\0328u_JL\b\005\005\003\002\024\006M\026\002BA[\003+\023\021\"\0238wK:$xN]=\t\025\005e\0261\026b\001\n\003\tY,A\003ji\026l7/\006\002\002>B!AiYA`!\025!\025\021YAc\023\r\t\031-\022\002\007\037B$\030n\0348\021\t\005\035\0271Z\007\003\003\023T1!!\021\022\023\021\ti-!3\003\023%#X-\\*uC\016\\\007\"CAi\001\t\007I\021AAj\0035i\027-\0338J]Z,g\016^8ssV\021\021Q\033\n\007\003/\f\t)!-\007\017\005m\024\021\034\001\002V\"A\0211\034\001!\002\023\t).\001\bnC&t\027J\034<f]R|'/\037\021\t\025\005e\026q\033b\001\n\003\tY\fC\005\002b\002\021\r\021\"\001\002d\006!A/\0318l+\t\t)O\005\004\002h\006\005\025Q\036\004\b\003w\nI\017AAs\021!\tY\017\001Q\001\n\005\025\030!\002;b].\004\003c\001\021\002p&\031\021\021_\021\003\0235+H\016^5UC:\\\007\002CA{\001\001\007I\021A-\002\031M,G.Z2uK\022$\026M\\6\t\023\005e\b\0011A\005\002\005m\030\001E:fY\026\034G/\0323UC:\\w\fJ3r)\r\t\030Q \005\tk\006]\030\021!a\0015\"9!\021\001\001!B\023Q\026!D:fY\026\034G/\0323UC:\\\007\005C\004\003\006\001!\tEa\002\002\037M,GoU3mK\016$X\r\032+b].$2!\035B\005\021\035\021YAa\001A\002i\013Q!\0338eKbDqAa\004\001\t\003\022\t\"\001\003uS\026\024H#\001.\t\017\tU\001\001\"\021\003\030\0051\001\017\\1zKJ$\"A!\007\021\t\tm!qD\007\003\005;Q1A!\006\021\023\021\021\tC!\b\003\031\025sG/\033;z!2\f\0270\032:\t\017\t\025\002\001\"\021\003(\005!a.Y7f)\t\021I\003\005\003\002\004\n-\022\002\002B\027\003\013\023aa\025;sS:<\007b\002B\031\001\021\005#1G\001\bg\026$h*Y7f)\r\t(Q\007\005\t\005K\021y\0031\001\0038A!!\021\bB \035\r!%1H\005\004\005{)\025A\002)sK\022,g-\003\003\003.\t\005#b\001B\037\013\"I!Q\t\001A\002\023\005!qI\001\n_^tWM\035(b[\026,\"A!\013\t\023\t-\003\0011A\005\002\t5\023!D8x]\026\024h*Y7f?\022*\027\017F\002r\005\037B\021\"\036B%\003\003\005\rA!\013\t\021\tM\003\001)Q\005\005S\t!b\\<oKJt\025-\\3!\021%\0219\006\001a\001\n\003\021I&A\005po:,'/V+J\tV\021!1\f\t\005\005;\022\031'\004\002\003`)!!\021MAE\003\021)H/\0337\n\t\t\025$q\f\002\005+VKE\tC\005\003j\001\001\r\021\"\001\003l\005iqn\0368feV+\026\nR0%KF$2!\035B7\021%)(qMA\001\002\004\021Y\006\003\005\003r\001\001\013\025\002B.\003)ywO\\3s+VKE\t\t\005\013\005k\002\001R1A\005\n\t]\024a\0029mCf,'oX\013\003\005s\002BAa\037\003\0026\021!Q\020\006\005\005\n9'A\003bO\026tG/\003\003\003\004\nu$A\002)mCf,'\017\003\006\003\b\002A\t\021)Q\005\005s\n\001\002\0357bs\026\024x\f\t\005\b\005\027\003A\021\tBG\003\021qw\016Z3\025\005\t=\005c\001\025\003\022&\031!1S\025\003\t9{G-\032\005\b\005/\003A\021\tBM\003-\031\027M\\%oi\026\024\030m\031;\025\t\tm%\021\025\t\004\t\nu\025b\001BP\013\n9!i\\8mK\006t\007\002\003B\013\005+\003\rAa\016\t\017\t\025\006\001\"\021\003(\006A\021n\035)bkN,G\r\006\002\003\034\"9!1\026\001\005B\t\035\026!B:uCJ$\bb\002BX\001\021\005#\021W\001\006a\006,8/\032\013\005\0057\023\031\f\003\005\0036\n5\006\031\001B\\\003\035\031XmY8oIN\0042\001\022B]\023\r\021Y,\022\002\007\t>,(\r\\3\t\017\t}\006\001\"\021\003(\006!1\017^8q\021\035\021\031\r\001C!\005\013\f\021cY8ogVlWmQ1mY\n+HmZ3u)\r\t(q\031\005\t\005\023\024\t\r1\001\0038\006A1-\0317m\007>\034H\017C\004\003N\002!\tEa4\002\rMLwM\\1m)\031\021YJ!5\003T\"A!Q\005Bf\001\004\0219\004\003\005\003V\n-\007\031\001Bl\003\021\t'oZ:\021\013\021\023IN!8\n\007\tmWI\001\006=e\026\004X-\031;fIz\0022\001\022Bp\023\r\021\t/\022\002\007\003:L(+\0324\t\017\t\025\b\001\"\021\003h\006Iq-\032;UCJ<W\r\036\013\003\005S\004BAa;\003p6\021!Q\036\006\004\005C\n\022\002\002By\005[\024AAV3dg!9!Q\037\001\005B\t]\030!C:fiR\013'oZ3u)\r\t(\021 \005\t\005w\024\031\0201\001\003j\006)a/\0317vK\"9!q \001\005B\t\035\030aC4fiZ+Gn\\2jifDqaa\001\001\t\003\0229+A\tdC:\024UmQ8mY&$W\rZ,ji\"Dqaa\002\001\t\003\0229+A\006dC:\024U\rU;tQ\026$\007bBB\006\001\021\0053QB\001\nqB{7/\033;j_:$\"Aa.\t\017\rE\001\001\"\021\004\016\005I\021\020U8tSRLwN\034\005\b\007+\001A\021IB\007\003%Q\bk\\:ji&|g\016C\004\004\032\001!\tea\007\002\0275\f'o[\"iC:<W\r\032\013\002c\"91q\004\001\005B\r\005\022A\0024bG&tw\r\006\002\004$A!1QEB\030\033\t\0319C\003\003\003b\r%\"bA\003\004,)\0311QF\n\002\0355Lg.Z2sC\032$hm\034:hK&!1\021GB\024\00591uN]4f\t&\024Xm\031;j_:Dqa!\016\001\t\003\0329$A\004u_2{7-\0317\025\t\r\r2\021\b\005\t\005w\034\031\0041\001\004$!91Q\b\001\005B\r}\022\001\003;p\0172|'-\0317\025\t\r\r2\021\t\005\t\005w\034Y\0041\001\004$!91Q\t\001\005B\r\035\023!C8o\003:\fG.\037>f)1\031Iea\023\004N\rE3QKB-!\021!5Ma$\t\021\tU11\ta\001\0053Aqaa\024\004D\001\007!,\001\003tS\022,\007bBB*\007\007\002\raQ\001\005Q&$\b\fC\004\004X\r\r\003\031A\"\002\t!LG/\027\005\b\0077\032\031\0051\001D\003\021A\027\016\036.\t\017\r}\003\001\"\021\004b\005\021\022N\034;fe:\fGnQ8na>tWM\034;t)\t\031\031\007\005\004\002\004\016\025\024QY\005\005\007O\n)I\001\005Ji\026\024\030M\0317f\021\035\031Y\007\001C!\007[\nQbY8na>tWM\034;TY>$Hc\001.\004p!A1\021OB5\001\004\0219$A\004bI\022\024Xm]:\t\017\rU\004\001\"\021\004x\005\001rN\\'bG\"Lg.Z\"p]:,7\r\036\013\004c\016e\004\002\003BF\007g\002\rAa$\t\017\ru\004\001\"\021\004\000\005\031rN\\'bG\"Lg.\032#jg\016|gN\\3diR\031\021o!!\t\021\t-51\020a\001\005\037Cqa!\"\001\t\003\021\t\"\001\013d_6\004X\017^3J]Z,g\016^8ssNK'0\032\005\b\007\023\003A\021IB\016\003))g\016^5us&s\027\016\036\005\b\007\033\003A\021ABH\003aIg.\033;jC2L'0Z!gi\026\024\b\013\\1dK6,g\016\036\013\bc\016E5QSBL\021!\031\031ja#A\002\005\025\027!B:uC\016\\\007\002\003B\013\007\027\003\rA!\007\t\021\re51\022a\001\005S\f\001\002]8tSRLwN\034\005\b\007;\003A\021AB\016\0039\001(/\0329be\026\004vn^3s+BDqa!)\001\t\023\031Y\"\001\nxSJ,G\013[5oON$vnZ3uQ\026\024\bbBBS\001\021\005!qU\001\nSN\024VO\0348j]\036Daa!+\001\t\003\021\025a\002;be\036,G\017\027\005\007\007[\003A\021\001\"\002\017Q\f'oZ3u3\"11\021\027\001\005\002\t\013q\001^1sO\026$(\f\003\004\0046\002!\tAQ\001\023i\006\024x-\032;BG\016,G.\032:bi&|g\016C\004\004:\002!\tA!\005\002\031M,G.Z2uK\022\034Fn\034;\t\r\ru\006\001\"\001Z\00319Gn\0342bY\n+hMZ3s\021\031\031\t\r\001C\0013\006\001r\r\\8cC2\024UO\0324feNK'0\032\005\b\007\013\004A\021\001B$\003)\031H/\031;vgR+\007\020\036\005\007\007\023\004A\021A-\002\033%tg/\0328u_JL8+\033>f\021\031\031i\r\001C\0013\006QA.[4ii\016{Gn\034:\t\017\rE\007\001\"\001\004T\006Q1/\032;Sk:t\027N\\4\025\007E\034)\016\003\005\003|\016=\007\031\001BN\021\035\031I\016\001C\001\0077\f1\002^1sO\026$\bl\030\023fcR\031\021o!8\t\017\tm8q\033a\001\007\"91\021\035\001\005\002\r\r\030a\003;be\036,G/W0%KF$2!]Bs\021\035\021Ypa8A\002\rCqa!;\001\t\003\031Y/A\006uCJ<W\r\036.`I\025\fHcA9\004n\"9!1`Bt\001\004\031\005bBBy\001\021\00511_\001\027i\006\024x-\032;BG\016,G.\032:bi&|gn\030\023fcR\031\021o!>\t\017\tm8q\036a\001\007\"91\021 \001\005\002\rm\030aD:fiN+G.Z2uK\022\034Fn\034;\025\007E\034i\020C\004\003|\016]\b\031\001.\t\017\021\005\001\001\"\001\005\004\005\001r\r\\8cC2\024UO\0324fe~#S-\035\013\004c\022\025\001b\002B~\007\004\rA\027\005\b\t\023\001A\021\001C\006\003Q9Gn\0342bY\n+hMZ3s'&TXm\030\023fcR\031\021\017\"\004\t\017\tmHq\001a\0015\"9A\021\003\001\005\002\021M\021AD:uCR,8\017V3yi~#S-\035\013\004c\022U\001\002\003B~\t\037\001\rAa\016\t\017\021e\001\001\"\001\005\034\005\t\022N\034<f]R|'/_*ju\026|F%Z9\025\007E$i\002C\004\003|\022]\001\031\001.\t\017\021\005\002\001\"\001\005$\005qA.[4ii\016{Gn\034:`I\025\fHcA9\005&!9!1 C\020\001\004Q\006b\002C\025\001\021\005C1F\001\030g\026$\bk\\:ji&|g.\0218e%>$\030\r^5p]J\"R\"\035C\027\tc!)\004\"\017\005>\021\005\003\002\003C\030\tO\001\rAa.\002\003aD\001\002b\r\005(\001\007!qW\001\002s\"AAq\007C\024\001\004\0219,A\001{\021\035!Y\004b\nA\002\r\0131!_1x\021\035!y\004b\nA\002\r\013Q\001]5uG\"Dq!!\020\005(\001\007!\f\013\005\005(\021\025#1 C/!\021!9\005\"\027\016\005\021%#\002\002C&\t\033\n!B]3mCVt7\r[3s\025\021!y\005\"\025\002\007\031lGN\003\003\005T\021U\023\001B7pINT!\001b\026\002\007\r\004x/\003\003\005\\\021%#\001C*jI\026|e\016\\=%\005\021}\023\002\002C1\tG\naa\021'J\013:#&\002\002C3\t\023\nAaU5eK\"9A\021\016\001\005B\rm\021\001C8o+B$\027\r^3\t\017\0215\004\001\"\021\005p\005Y\001.\033;Cs\026sG/\033;z)\021\021Y\n\"\035\t\r\r!Y\0071\001\017\021\035!)\b\001C!\to\nQ\"\0338uKJ\f7\r\036$jeN$H\003\002BN\tsB\001B!\006\005t\001\007!\021\004\005\b\t{\002A\021\tC@\00351WO\\2`cQ*t\007\017\031`CRI\021\017\"!\005\004\022\025Eq\021\005\b\t_!Y\b1\001[\021\035!\031\004b\037A\002iCq\001b\016\005|\001\007!\f\003\005\005\n\022m\004\031\001CF\003\025\021Gn\\2l!\021!i\t\"%\016\005\021=%b\001CE#%!A1\023CH\005\025\021En\\2l\021%!9\n\001a\001\n\023!I*A\njg\016C\027M\\4j]\036$\025.\\3og&|g.\006\002\003\034\"IAQ\024\001A\002\023%AqT\001\030SN\034\005.\0318hS:<G)[7f]NLwN\\0%KF$2!\035CQ\021%)H1TA\001\002\004\021Y\n\003\005\005&\002\001\013\025\002BN\003QI7o\0215b]\036Lgn\032#j[\026t7/[8oA!9A\021\026\001\005B\021-\026!\005;sCZ,G\016V8ES6,gn]5p]R\031\021\017\",\t\017\021=Fq\025a\0015\006IA-[7f]NLwN\034\005\b\tg\003A\021\tC[\0031\031w\016]=ECR\fgI]8n)\025\tHq\027C]\021\031\031A\021\027a\001\035!AA1\030CY\001\004\021Y*\001\004v]V\034X\r\032\005\b\t\003A\021IB\016\003\035\031X\r\036#fC\022Dq\001b1\001\t\003\032Y\"\001\003lS2d\007b\002Cd\001\021\005C\021Z\001\025O\026$8i\\7nC:$7+\0328eKJt\025-\\3\025\005\t]\002b\002Cg\001\021\005#qU\001\024Q\006tG\r\\3XCR,'/T8wK6,g\016\036\005\b\t#\004A\021\tCj\003E\021X-\0313F]RLG/\037$s_6t%\t\026\013\004c\022U\007\002\003Cl\t\037\004\r\001\"7\002\0079\024G\017\005\003\005\\\022}WB\001Co\025\r!9.E\005\005\tC$iN\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\021\025\b\001\"\021\005h\006\001rO]5uK\026sG/\033;z)>t%\t\026\013\004c\022%\b\002\003Cl\tG\004\r\001\"7")
/*     */ public class Drone extends Entity implements Drone, Analyzable, Context {
/*     */   private final World world;
/*     */   private final float gravity;
/*     */   private final float drag;
/*     */   private final float maxAcceleration;
/*     */   private final float maxVelocity;
/*     */   private final int maxInventorySize;
/*     */   private final float[][] targetFlapAngles;
/*     */   private final float[][] flapAngles;
/*     */   private int nextFlapChange;
/*     */   private float bodyAngle;
/*     */   private float angularVelocity;
/*     */   private int nextAngularVelocityChange;
/*     */   private int lastEnergyUpdate;
/*     */   private final DroneData info;
/*     */   private final Machine machine;
/*     */   private final li.cil.oc.server.component.Drone control;
/*     */   private final ComponentInventory components;
/*     */   private final Inventory equipmentInventory;
/*     */   private final Inventory mainInventory;
/*     */   private final MultiTank tank;
/*     */   private int selectedTank;
/*     */   private String ownerName;
/*     */   private UUID ownerUUID;
/*     */   private Player player_;
/*     */   private boolean isChangingDimension;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  50 */   public World world() { return this.world; } public Drone(World world) { super(world);
/*     */     
/*  52 */     this.gravity = 0.05F;
/*     */     
/*  54 */     this.drag = 0.8F;
/*  55 */     this.maxAcceleration = 0.1F;
/*  56 */     this.maxVelocity = 0.4F;
/*  57 */     this.maxInventorySize = 8;
/*  58 */     func_70105_a(0.75F, 0.375F);
/*  59 */     this.field_70178_ae = true;
/*     */ 
/*     */     
/*  62 */     this.targetFlapAngles = (float[][])Array$.MODULE$.fill(4, 2, (Function0)new Drone$$anonfun$1(this), ClassTag$.MODULE$.Float());
/*  63 */     this.flapAngles = (float[][])Array$.MODULE$.fill(4, 2, (Function0)new Drone$$anonfun$2(this), ClassTag$.MODULE$.Float());
/*  64 */     this.nextFlapChange = 0;
/*  65 */     this.bodyAngle = (float)package$.MODULE$.random() * 90;
/*  66 */     this.angularVelocity = 0.0F;
/*  67 */     this.nextAngularVelocityChange = 0;
/*  68 */     this.lastEnergyUpdate = 0;
/*     */ 
/*     */     
/*  71 */     this.info = new DroneData();
/*     */     
/*  73 */     Machine m = Machine.create((MachineHost)this);
/*  74 */     ((Connector)m.node()).setLocalBufferSize(0.0D);
/*     */     
/*  76 */     this.machine = world.field_72995_K ? null : m;
/*  77 */     this.control = world.field_72995_K ? null : new li.cil.oc.server.component.Drone(this);
/*  78 */     this.components = new Drone$$anon$1(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     this.equipmentInventory = new Drone$$anon$3(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     this.mainInventory = new Drone$$anon$2(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     this.tank = new Drone$$anon$4(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     this.selectedTank = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     this.ownerName = Settings$.MODULE$.get().fakePlayerName();
/*     */     
/* 153 */     this.ownerUUID = Settings$.MODULE$.get().fakePlayerProfile().getId();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 499 */     this.isChangingDimension = false; } public float gravity() { return this.gravity; } public float drag() { return this.drag; } public float maxAcceleration() { return this.maxAcceleration; } public float maxVelocity() { return this.maxVelocity; } public int maxInventorySize() { return this.maxInventorySize; } public float[][] targetFlapAngles() { return this.targetFlapAngles; } public final class Drone$$anonfun$1 extends AbstractFunction0.mcF.sp implements Serializable { public static final long serialVersionUID = 0L; public final float apply() { return apply$mcF$sp(); } public float apply$mcF$sp() { return 0.0F; } public Drone$$anonfun$1(Drone $outer) {} } public float[][] flapAngles() { return this.flapAngles; } public final class Drone$$anonfun$2 extends AbstractFunction0.mcF.sp implements Serializable { public static final long serialVersionUID = 0L; public final float apply() { return apply$mcF$sp(); } public float apply$mcF$sp() { return 0.0F; } public Drone$$anonfun$2(Drone $outer) {} } public int nextFlapChange() { return this.nextFlapChange; } public void nextFlapChange_$eq(int x$1) { this.nextFlapChange = x$1; } public float bodyAngle() { return this.bodyAngle; } public void bodyAngle_$eq(float x$1) { this.bodyAngle = x$1; } public float angularVelocity() { return this.angularVelocity; } public void angularVelocity_$eq(float x$1) { this.angularVelocity = x$1; } public int nextAngularVelocityChange() { return this.nextAngularVelocityChange; } public void nextAngularVelocityChange_$eq(int x$1) { this.nextAngularVelocityChange = x$1; } public int lastEnergyUpdate() { return this.lastEnergyUpdate; } public void lastEnergyUpdate_$eq(int x$1) { this.lastEnergyUpdate = x$1; } public DroneData info() { return this.info; } public Machine machine() { return this.machine; } public li.cil.oc.server.component.Drone control() { return this.control; } public ComponentInventory components() { return this.components; } public final class Drone$$anon$1 implements ComponentInventory { private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components; private boolean isSizeInventoryReady; private final ArrayBuffer<ManagedEnvironment> updatingComponents; public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components(this); } public void updateComponents() { ComponentInventory.class.updateComponents(this); } public void connectComponents() { ComponentInventory.class.connectComponents(this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents(this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save(this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents(this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit(this); } public void onItemAdded(int slot, ItemStack stack) { ComponentInventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { ComponentInventory.class.onItemRemoved(this, slot, stack); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot(this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode(this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag(this, driver, stack); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState(this, component, state); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Drone$$anon$1(Drone $outer) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$(this); } public Drone host() { return this.$outer; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Predef$.MODULE$.refArrayOps((Object[])this.$outer.info().components()).map((Function1)new Drone$$anon$1$$anonfun$items$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class))); } public final class Drone$$anon$1$$anonfun$items$1 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<ItemStack> apply(ItemStack x$1) { return Option$.MODULE$.apply(x$1); } public Drone$$anon$1$$anonfun$items$1(Drone$$anon$1 $outer) {} } public int func_70302_i_() { return (this.$outer.info().components()).length; } public void func_70296_d() {} public boolean func_94041_b(int slot, ItemStack stack) { return true; } public boolean func_70300_a(EntityPlayer player) { return true; } public Node node() { return (Node)Option$.MODULE$.apply(this.$outer.machine()).map((Function1)new Drone$$anon$1$$anonfun$node$1(this)).orNull(Predef$.MODULE$.$conforms()); } public final class Drone$$anon$1$$anonfun$node$1 extends AbstractFunction1<Machine, Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply(Machine x$2) { return x$2.node(); } public Drone$$anon$1$$anonfun$node$1(Drone$$anon$1 $outer) {} } public void onConnect(Node node) {} public void onDisconnect(Node node) {} public void onMessage(Message message) {} } public Inventory equipmentInventory() { return this.equipmentInventory; } public final class Drone$$anon$3 implements Inventory { private final Option<ItemStack>[] items; public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems(this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot(this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents(this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName(this); } public String inventoryName() { return Inventory.class.inventoryName(this); } public void load(NBTTagCompound nbt) { Inventory.class.load(this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save(this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved(this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Drone$$anon$3(Drone $outer) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$(this); this.items = (Option<ItemStack>[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(Option.class)); } public Option<ItemStack>[] items() { return this.items; } public int func_70302_i_() { return 0; } public int func_70297_j_() { return 0; } public void func_70296_d() {} public boolean func_94041_b(int slot, ItemStack stack) { return false; } public boolean func_70300_a(EntityPlayer player) { return false; } } public Inventory mainInventory() { return this.mainInventory; } public final class Drone$$anon$2 implements Inventory { private final Option<ItemStack>[] items; public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems(this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot(this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents(this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName(this); } public String inventoryName() { return Inventory.class.inventoryName(this); } public void load(NBTTagCompound nbt) { Inventory.class.load(this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save(this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded(this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved(this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Drone$$anon$2(Drone $outer) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$(this); this.items = (Option<ItemStack>[])Array$.MODULE$.fill(8, (Function0)new Drone$$anon$2$$anonfun$3(this), ClassTag$.MODULE$.apply(Option.class)); } public Option<ItemStack>[] items() { return this.items; } public final class Drone$$anon$2$$anonfun$3 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; } public Drone$$anon$2$$anonfun$3(Drone$$anon$2 $outer) {} } public int func_70302_i_() { return this.$outer.inventorySize(); } public int func_70297_j_() { return 64; } public void func_70296_d() {} public boolean func_94041_b(int slot, ItemStack stack) { return (slot >= 0 && slot < func_70302_i_()); } public boolean func_70300_a(EntityPlayer player) { return (player.func_70068_e(this.$outer) < 64); } } public MultiTank tank() { return this.tank; } public final class Drone$$anon$4 implements MultiTank { public Drone$$anon$4(Drone $outer) {} public int tankCount() { return Predef$.MODULE$.refArrayOps((Object[])this.$outer.components().components()).count((Function1)new Drone$$anon$4$$anonfun$tankCount$1(this)); } public final class Drone$$anon$4$$anonfun$tankCount$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x0$1) { Option option = x0$1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment tank = (ManagedEnvironment)some.x(); if (tank instanceof IFluidTank) return true;  }  return false; } public Drone$$anon$4$$anonfun$tankCount$1(Drone$$anon$4 $outer) {} } public IFluidTank getFluidTank(int index) { return (IFluidTank)((ManagedEnvironment[])Predef$.MODULE$.refArrayOps((Object[])this.$outer.components().components()).collect((PartialFunction)new Drone$$anon$4$$anonfun$getFluidTank$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ManagedEnvironment.class))))[index]; } public final class Drone$$anon$4$$anonfun$getFluidTank$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, ManagedEnvironment> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment tank = (ManagedEnvironment)some.x(); if (tank instanceof IFluidTank) { ManagedEnvironment managedEnvironment; return (B1)(managedEnvironment = tank); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment tank = (ManagedEnvironment)some.x(); if (tank instanceof IFluidTank) return true;  }  return false; } public Drone$$anon$4$$anonfun$getFluidTank$1(Drone$$anon$4 $outer) {} } } public int selectedTank() { return this.selectedTank; } public void selectedTank_$eq(int x$1) { this.selectedTank = x$1; } public void setSelectedTank(int index) { selectedTank_$eq(index); } public int tier() { return info().tier(); } public EntityPlayer player() { Player$.MODULE$.updatePositionAndRotation(player_(), facing(), facing()); Player$.MODULE$.setInventoryPlayerItems(player_()); return (EntityPlayer)player_(); } public String name() { return info().name(); } public void setName(String name) { info().name_$eq(name); } public String ownerName() { return this.ownerName; } public void ownerName_$eq(String x$1) { this.ownerName = x$1; } public UUID ownerUUID() { return this.ownerUUID; } public void ownerUUID_$eq(UUID x$1) { this.ownerUUID = x$1; } private Player player_$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.player_ = new Player((Agent)this); this.bitmap$0 = true; }  return this.player_; }  } private Player player_() { return this.bitmap$0 ? this.player_ : player_$lzycompute(); } public Node node() { return machine().node(); } public boolean canInteract(String player) { return machine().canInteract(player); } public boolean isPaused() { return machine().isPaused(); } public boolean start() { if ((world()).field_72995_K || machine().isRunning()) return false;  preparePowerUp(); return machine().start(); } public boolean pause(double seconds) { return machine().pause(seconds); } public boolean stop() { return machine().stop(); } public void consumeCallBudget(double callCost) { machine().consumeCallBudget(callCost); } public boolean signal(String name, Seq args) { return machine().signal(name, (Object[])args.toArray(ClassTag$.MODULE$.AnyRef())); } public Vec3 getTarget() { return Vec3.func_72443_a(targetX(), targetY(), targetZ()); } public void setTarget(Vec3 value) { targetX_$eq((float)value.field_72450_a); targetY_$eq((float)value.field_72448_b); targetZ_$eq((float)value.field_72449_c); } public Vec3 getVelocity() { return Vec3.func_72443_a(this.field_70159_w, this.field_70181_x, this.field_70179_y); } private boolean isChangingDimension() { return this.isChangingDimension; } public boolean func_70067_L() { return true; } public boolean func_70104_M() { return true; } public double xPosition() { return this.field_70165_t; } public double yPosition() { return this.field_70163_u; } public double zPosition() { return this.field_70161_v; } public void markChanged() {} public ForgeDirection facing() { return ForgeDirection.SOUTH; } public ForgeDirection toLocal(ForgeDirection value) { return value; } public ForgeDirection toGlobal(ForgeDirection value) { return value; } public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) { (new Node[1])[0] = machine().node(); return new Node[1]; } public Iterable<ItemStack> internalComponents() { return WrapAsJava$.MODULE$.asJavaIterable((Iterable)Predef$.MODULE$.wrapRefArray((Object[])info().components())); } public int componentSlot(String address) { return Predef$.MODULE$.refArrayOps((Object[])components().components()).indexWhere((Function1)new Drone$$anonfun$componentSlot$1(this, address)); } public final class Drone$$anonfun$componentSlot$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final String address$1; public final boolean apply(Option x$3) { return x$3.exists((Function1)new Drone$$anonfun$componentSlot$1$$anonfun$apply$1(this)); } public Drone$$anonfun$componentSlot$1(Drone $outer, String address$1) {} public final class Drone$$anonfun$componentSlot$1$$anonfun$apply$1 extends AbstractFunction1<ManagedEnvironment, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ManagedEnvironment env) { // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   6: ifnull -> 51
/*     */         //   9: aload_1
/*     */         //   10: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   15: invokeinterface address : ()Ljava/lang/String;
/*     */         //   20: aload_0
/*     */         //   21: getfield $outer : Lli/cil/oc/common/entity/Drone$$anonfun$componentSlot$1;
/*     */         //   24: getfield address$1 : Ljava/lang/String;
/*     */         //   27: astore_2
/*     */         //   28: dup
/*     */         //   29: ifnonnull -> 40
/*     */         //   32: pop
/*     */         //   33: aload_2
/*     */         //   34: ifnull -> 47
/*     */         //   37: goto -> 51
/*     */         //   40: aload_2
/*     */         //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   44: ifeq -> 51
/*     */         //   47: iconst_1
/*     */         //   48: goto -> 52
/*     */         //   51: iconst_0
/*     */         //   52: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #227	-> 0
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	53	0	this	Lli/cil/oc/common/entity/Drone$$anonfun$componentSlot$1$$anonfun$apply$1;
/*     */         //   0	53	1	env	Lli/cil/oc/api/network/ManagedEnvironment; } public Drone$$anonfun$componentSlot$1$$anonfun$apply$1(Drone$$anonfun$componentSlot$1 $outer) {} } } public void onMachineConnect(Node node) {} public void onMachineDisconnect(Node node) {} public int computeInventorySize() { return package$.MODULE$.min(maxInventorySize(), BoxesRunTime.unboxToInt(Predef$.MODULE$.refArrayOps((Object[])info().components()).foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new Drone$$anonfun$computeInventorySize$1(this)))); } public final class Drone$$anonfun$computeInventorySize$1 extends AbstractFunction2<Object, ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int acc, ItemStack component) { // Byte code:
/*     */       //   0: iload_1
/*     */       //   1: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   4: aload_2
/*     */       //   5: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   8: astore_3
/*     */       //   9: aload_3
/*     */       //   10: instanceof scala/Some
/*     */       //   13: ifeq -> 125
/*     */       //   16: aload_3
/*     */       //   17: checkcast scala/Some
/*     */       //   20: astore #4
/*     */       //   22: aload #4
/*     */       //   24: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   27: checkcast net/minecraft/item/ItemStack
/*     */       //   30: astore #5
/*     */       //   32: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   35: aload #5
/*     */       //   37: aload_0
/*     */       //   38: getfield $outer : Lli/cil/oc/common/entity/Drone;
/*     */       //   41: invokevirtual getClass : ()Ljava/lang/Class;
/*     */       //   44: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */       //   47: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   50: astore #7
/*     */       //   52: aload #7
/*     */       //   54: instanceof scala/Some
/*     */       //   57: ifeq -> 115
/*     */       //   60: aload #7
/*     */       //   62: checkcast scala/Some
/*     */       //   65: astore #8
/*     */       //   67: aload #8
/*     */       //   69: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   72: checkcast li/cil/oc/api/driver/Item
/*     */       //   75: astore #9
/*     */       //   77: aload #9
/*     */       //   79: instanceof li/cil/oc/api/driver/item/Inventory
/*     */       //   82: ifeq -> 115
/*     */       //   85: aload #9
/*     */       //   87: checkcast li/cil/oc/api/driver/item/Inventory
/*     */       //   90: astore #10
/*     */       //   92: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */       //   95: iconst_1
/*     */       //   96: aload #10
/*     */       //   98: aload #5
/*     */       //   100: invokeinterface inventoryCapacity : (Lnet/minecraft/item/ItemStack;)I
/*     */       //   105: iconst_4
/*     */       //   106: idiv
/*     */       //   107: invokevirtual max : (II)I
/*     */       //   110: istore #11
/*     */       //   112: goto -> 118
/*     */       //   115: iconst_0
/*     */       //   116: istore #11
/*     */       //   118: iload #11
/*     */       //   120: istore #6
/*     */       //   122: goto -> 128
/*     */       //   125: iconst_0
/*     */       //   126: istore #6
/*     */       //   128: iload #6
/*     */       //   130: iadd
/*     */       //   131: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #233	-> 0
/*     */       //   #234	-> 9
/*     */       //   #235	-> 52
/*     */       //   #236	-> 115
/*     */       //   #234	-> 118
/*     */       //   #238	-> 125
/*     */       //   #233	-> 128
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	132	0	this	Lli/cil/oc/common/entity/Drone$$anonfun$computeInventorySize$1;
/*     */       //   0	132	1	acc	I
/*     */       //   0	132	2	component	Lnet/minecraft/item/ItemStack;
/*     */       //   32	100	5	stack	Lnet/minecraft/item/ItemStack;
/* 499 */       //   77	55	9	driver	Lli/cil/oc/api/driver/Item; } public Drone$$anonfun$computeInventorySize$1(Drone $outer) {} } public void func_70088_a() { this.field_70180_af.func_75682_a(2, BoxesRunTime.boxToByte((byte)0)); this.field_70180_af.func_75682_a(3, BoxesRunTime.boxToFloat(0.0F)); this.field_70180_af.func_75682_a(4, BoxesRunTime.boxToFloat(0.0F)); this.field_70180_af.func_75682_a(5, BoxesRunTime.boxToFloat(0.0F)); this.field_70180_af.func_75682_a(6, BoxesRunTime.boxToFloat(0.0F)); this.field_70180_af.func_75682_a(7, BoxesRunTime.boxToByte((byte)0)); this.field_70180_af.func_75682_a(8, BoxesRunTime.boxToInteger(0)); this.field_70180_af.func_75682_a(9, BoxesRunTime.boxToInteger(100)); this.field_70180_af.func_75682_a(10, ""); this.field_70180_af.func_75682_a(11, BoxesRunTime.boxToByte((byte)0)); this.field_70180_af.func_75682_a(12, BoxesRunTime.boxToInteger(6741333)); } public void initializeAfterPlacement(ItemStack stack, EntityPlayer player, Vec3 position) { info().load(stack); control().node().changeBuffer(info().storedEnergy() - control().node().localBuffer()); wireThingsTogether(); inventorySize_$eq(computeInventorySize()); func_70107_b(position.field_72450_a, position.field_72448_b, position.field_72449_c); } public void preparePowerUp() { targetX_$eq((float)package$.MODULE$.floor(this.field_70165_t) + 0.5F); targetY_$eq((float)package$.MODULE$.round(this.field_70163_u) + 0.5F); targetZ_$eq((float)package$.MODULE$.floor(this.field_70161_v) + 0.5F); targetAcceleration_$eq(maxAcceleration()); wireThingsTogether(); } private void wireThingsTogether() { Network.joinNewNetwork(machine().node()); machine().node().connect((Node)control().node()); machine().setCostPerTick(Settings$.MODULE$.get().droneCost()); components().connectComponents(); } public boolean isRunning() { return (this.field_70180_af.func_75683_a(2) != 0); } public float targetX() { return this.field_70180_af.func_111145_d(3); } public float targetY() { return this.field_70180_af.func_111145_d(4); } public float targetZ() { return this.field_70180_af.func_111145_d(5); } public float targetAcceleration() { return this.field_70180_af.func_111145_d(6); } public int selectedSlot() { return this.field_70180_af.func_75683_a(7) & 0xFF; } public int globalBuffer() { return this.field_70180_af.func_75679_c(8); } public int globalBufferSize() { return this.field_70180_af.func_75679_c(9); } public String statusText() { return this.field_70180_af.func_75681_e(10); } public int inventorySize() { return this.field_70180_af.func_75683_a(11) & 0xFF; } public int lightColor() { return this.field_70180_af.func_75679_c(12); } public void setRunning(boolean value) { this.field_70180_af.func_75692_b(2, BoxesRunTime.boxToByte(value ? 1 : 0)); } public void targetX_$eq(float value) { this.field_70180_af.func_75692_b(3, BoxesRunTime.boxToFloat(package$.MODULE$.round(value * 4) / 4.0F)); } public void targetY_$eq(float value) { this.field_70180_af.func_75692_b(4, BoxesRunTime.boxToFloat(package$.MODULE$.round(value * 4) / 4.0F)); } public void targetZ_$eq(float value) { this.field_70180_af.func_75692_b(5, BoxesRunTime.boxToFloat(package$.MODULE$.round(value * 4) / 4.0F)); } public void targetAcceleration_$eq(float value) { this.field_70180_af.func_75692_b(6, BoxesRunTime.boxToFloat(package$.MODULE$.max(0.0F, package$.MODULE$.min(maxAcceleration(), value)))); } public void setSelectedSlot(int value) { this.field_70180_af.func_75692_b(7, BoxesRunTime.boxToByte((byte)value)); } public void globalBuffer_$eq(int value) { this.field_70180_af.func_75692_b(8, BoxesRunTime.boxToInteger(value)); } public void globalBufferSize_$eq(int value) { this.field_70180_af.func_75692_b(9, BoxesRunTime.boxToInteger(value)); } public void statusText_$eq(String value) { this.field_70180_af.func_75692_b(10, Option$.MODULE$.apply(value).fold((Function0)new Drone$$anonfun$statusText_$eq$1(this), (Function1)new Drone$$anonfun$statusText_$eq$2(this))); } public final class Drone$$anonfun$statusText_$eq$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return ""; } public Drone$$anonfun$statusText_$eq$1(Drone $outer) {} } public final class Drone$$anonfun$statusText_$eq$2 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$4) { return (new StringOps(Predef$.MODULE$.augmentString(x$4))).lines().map((Function1)new Drone$$anonfun$statusText_$eq$2$$anonfun$apply$2(this)).take(2).mkString("\n"); } public Drone$$anonfun$statusText_$eq$2(Drone $outer) {} public final class Drone$$anonfun$statusText_$eq$2$$anonfun$apply$2 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$5) { return (String)(new StringOps(Predef$.MODULE$.augmentString(x$5))).take(10); } public Drone$$anonfun$statusText_$eq$2$$anonfun$apply$2(Drone$$anonfun$statusText_$eq$2 $outer) {} } } public void inventorySize_$eq(int value) { this.field_70180_af.func_75692_b(11, BoxesRunTime.boxToByte((byte)value)); } public void lightColor_$eq(int value) { this.field_70180_af.func_75692_b(12, BoxesRunTime.boxToInteger(value)); } @SideOnly(Side.CLIENT) public void func_70056_a(double x, double y, double z, float yaw, float pitch, int data) { if (isRunning() && func_70092_e(x, y, z) <= true) { targetX_$eq((float)x); targetY_$eq((float)y); targetZ_$eq((float)z); } else { func_70080_a(x, y, z, yaw, pitch); }  } public void func_70071_h_() { super.func_70071_h_(); if ((world()).field_72995_K) { if (isRunning()) { Random rng = (world()).field_73012_v; nextFlapChange_$eq(nextFlapChange() - 1); nextAngularVelocityChange_$eq(nextAngularVelocityChange() - 1); if (nextFlapChange() < 0) { nextFlapChange_$eq(5 + rng.nextInt(10)); RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 2).foreach$mVc$sp((Function1)new Drone$$anonfun$onUpdate$1(this, rng)); }  if (nextAngularVelocityChange() < 0) if (angularVelocity() != false) { angularVelocity_$eq(0.0F); nextAngularVelocityChange_$eq(20); } else { angularVelocity_$eq(rng.nextBoolean() ? 0.1F : -0.1F); nextAngularVelocityChange_$eq(100); }   Tuple2Zipped$.MODULE$.foreach$extension(Tuple2Zipped$Ops$.MODULE$.zipped$extension(Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(flapAngles(), targetFlapAngles())), (Function1)new Drone$$anonfun$onUpdate$2(this), (Function1)new Drone$$anonfun$onUpdate$3(this)), (Function2)new Drone$$anonfun$onUpdate$4(this)); bodyAngle_$eq(bodyAngle() + angularVelocity()); }  } else { (func_70055_a(Material.field_151586_h) || func_70055_a(Material.field_151587_i)) ? BoxesRunTime.boxToBoolean(machine().stop()) : BoxedUnit.UNIT; machine().update(); components().updateComponents(); setRunning(machine().isRunning()); int buffer = (int)package$.MODULE$.round(((Connector)machine().node()).globalBuffer()); if (package$.MODULE$.abs(lastEnergyUpdate() - buffer) > 1 || world().func_82737_E() % 200L == 0L) { lastEnergyUpdate_$eq(buffer); globalBuffer_$eq(buffer); globalBufferSize_$eq((int)((Connector)machine().node()).globalBufferSize()); }  }  this.field_70169_q = this.field_70165_t; this.field_70167_r = this.field_70163_u; this.field_70166_s = this.field_70161_v; this.field_70145_X = func_145771_j(this.field_70165_t, (this.field_70121_D.field_72338_b + this.field_70121_D.field_72337_e) / 2, this.field_70161_v); if (isRunning()) { Vec3 toTarget = Vec3.func_72443_a(targetX() - this.field_70165_t, targetY() - this.field_70163_u, targetZ() - this.field_70161_v); double distance = toTarget.func_72433_c(); Vec3 velocity = Vec3.func_72443_a(this.field_70159_w, this.field_70181_x, this.field_70179_y); if (distance > false && (distance > 0.004999999888241291D || velocity.func_72430_b(velocity) > 0.004999999888241291D)) { double acceleration = package$.MODULE$.min(targetAcceleration(), distance) / distance; velocity.field_72450_a += toTarget.field_72450_a * acceleration; velocity.field_72448_b += toTarget.field_72448_b * acceleration; velocity.field_72449_c += toTarget.field_72449_c * acceleration; this.field_70159_w = package$.MODULE$.max(-maxVelocity(), package$.MODULE$.min(maxVelocity(), velocity.field_72450_a)); this.field_70181_x = package$.MODULE$.max(-maxVelocity(), package$.MODULE$.min(maxVelocity(), velocity.field_72448_b)); this.field_70179_y = package$.MODULE$.max(-maxVelocity(), package$.MODULE$.min(maxVelocity(), velocity.field_72449_c)); } else { this.field_70159_w = 0.0D; this.field_70181_x = 0.0D; this.field_70179_y = 0.0D; this.field_70165_t = targetX(); this.field_70163_u = targetY(); this.field_70161_v = targetZ(); }  } else { this.field_70181_x -= gravity(); }  func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y); if (isRunning()) { this.field_70159_w *= drag(); this.field_70181_x *= drag(); this.field_70179_y *= drag(); } else { float groundDrag = (ExtendedWorld$.MODULE$.extendedWorld(this.field_70170_p).getBlock(BlockPosition$.MODULE$.apply(this).offset(ForgeDirection.DOWN))).field_149765_K * drag(); this.field_70159_w *= groundDrag; this.field_70181_x *= drag(); this.field_70179_y *= groundDrag; if (this.field_70122_E) this.field_70181_x *= -0.5D;  }  } public final class Drone$$anonfun$onUpdate$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Random rng$1; public final void apply(int i) { apply$mcVI$sp(i); } public Drone$$anonfun$onUpdate$1(Drone $outer, Random rng$1) {} public void apply$mcVI$sp(int i) { int flap = this.rng$1.nextInt((this.$outer.targetFlapAngles()).length); this.$outer.targetFlapAngles()[flap][0] = (float)package$.MODULE$.toRadians((this.rng$1.nextFloat() * 4 - 2)); this.$outer.targetFlapAngles()[flap][1] = (float)package$.MODULE$.toRadians((this.rng$1.nextFloat() * 4 - 2)); } } public final class Drone$$anonfun$onUpdate$2 extends AbstractFunction1<float[][], ArrayOps<float[]>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<float[]> apply(float[][] xs) { return Predef$.MODULE$.refArrayOps((Object[])xs); } public Drone$$anonfun$onUpdate$2(Drone $outer) {} } public final class Drone$$anonfun$onUpdate$3 extends AbstractFunction1<float[][], ArrayOps<float[]>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<float[]> apply(float[][] xs) { return Predef$.MODULE$.refArrayOps((Object[])xs); } public Drone$$anonfun$onUpdate$3(Drone $outer) {} } public final class Drone$$anonfun$onUpdate$4 extends AbstractFunction2<float[], float[], BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Drone$$anonfun$onUpdate$4(Drone $outer) {} public final void apply(float[] f, float[] t) { f[0] = f[0] * 0.7F + t[0] * 0.3F; f[1] = f[1] * 0.7F + t[1] * 0.3F; } } public boolean func_85031_j(Entity entity) { if (isRunning()) { Vec3 direction = Vec3.func_72443_a(entity.field_70165_t - this.field_70165_t, entity.field_70163_u + entity.func_70047_e() - this.field_70163_u, entity.field_70161_v - this.field_70161_v).func_72432_b(); (world()).field_72995_K ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(Settings$.MODULE$.get().inputUsername() ? machine().signal("hit", new Object[] { BoxesRunTime.boxToDouble(direction.field_72450_a), BoxesRunTime.boxToDouble(direction.field_72449_c), BoxesRunTime.boxToDouble(direction.field_72448_b), entity.func_70005_c_() }) : machine().signal("hit", new Object[] { BoxesRunTime.boxToDouble(direction.field_72450_a), BoxesRunTime.boxToDouble(direction.field_72449_c), BoxesRunTime.boxToDouble(direction.field_72448_b) })); this.field_70159_w = (this.field_70159_w - direction.field_72450_a) * 0.5D; this.field_70181_x = (this.field_70181_x - direction.field_72448_b) * 0.5D; this.field_70179_y = (this.field_70179_y - direction.field_72449_c) * 0.5D; }  return super.func_85031_j(entity); } public boolean func_130002_c(EntityPlayer player) { if (this.field_70128_L) return false;  if (!(world()).field_72995_K) func_70076_C();  if (!(world()).field_72995_K) player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.Drone().id(), world(), func_145782_y(), 0, 0);  player.func_70093_af() ? (Wrench$.MODULE$.isWrench(player.func_70694_bm()) ? BoxedUnit.UNIT : (((world()).field_72995_K || machine().isRunning()) ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(start()))) : BoxedUnit.UNIT; return true; } public void func_145780_a(int x, int y, int z, Block block) { if (EventHandler$.MODULE$.isItTime()) super.func_145780_a(x, y, z, block);  } private void isChangingDimension_$eq(boolean x$1) { this.isChangingDimension = x$1; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_71027_c(int dimension) {
/* 504 */     targetX_$eq((float)(targetX() - this.field_70165_t));
/* 505 */     targetY_$eq((float)(targetY() - this.field_70163_u));
/* 506 */     targetZ_$eq((float)(targetZ() - this.field_70161_v));
/*     */     try {
/* 508 */       isChangingDimension_$eq(true);
/* 509 */       super.func_71027_c(dimension);
/*     */       return;
/*     */     } finally {
/* 512 */       isChangingDimension_$eq(false);
/* 513 */       func_70106_y();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_82141_a(Entity entity, boolean unused) {
/* 518 */     super.func_82141_a(entity, unused);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 523 */     Entity entity1 = entity;
/* 524 */     if (entity1 instanceof Drone) { Drone drone = (Drone)entity1;
/* 525 */       targetX_$eq((float)(this.field_70165_t + drone.targetX()));
/* 526 */       targetY_$eq((float)(this.field_70163_u + drone.targetY()));
/* 527 */       targetZ_$eq((float)(this.field_70161_v + drone.targetZ())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/* 529 */     { targetX_$eq((float)this.field_70165_t);
/* 530 */       targetY_$eq((float)this.field_70163_u);
/* 531 */       targetZ_$eq((float)this.field_70161_v); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void func_70106_y() {
/* 536 */     super.func_70106_y();
/* 537 */     if (!(world()).field_72995_K && !isChangingDimension()) {
/* 538 */       machine().stop();
/* 539 */       machine().node().remove();
/* 540 */       components().disconnectComponents();
/* 541 */       components().saveComponents();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_70076_C() {
/* 546 */     if (this.field_70128_L)
/* 547 */       return;  super.func_70076_C();
/* 548 */     if (!(world()).field_72995_K) {
/* 549 */       ItemStack stack = Items.get("drone").createItemStack(1);
/* 550 */       info().storedEnergy_$eq((int)control().node().localBuffer());
/* 551 */       info().save(stack);
/* 552 */       EntityItem entity = new EntityItem(world(), this.field_70165_t, this.field_70163_u, this.field_70161_v, stack);
/* 553 */       entity.field_145804_b = 15;
/* 554 */       world().func_72838_d((Entity)entity);
/* 555 */       InventoryUtils$.MODULE$.dropAllSlots(BlockPosition$.MODULE$.apply(this), (IInventory)mainInventory());
/*     */     } 
/*     */   }
/*     */   public String func_70005_c_() {
/* 559 */     return Localization$.MODULE$.localizeImmediately("entity.oc.Drone.name");
/*     */   }
/*     */   public boolean func_70072_I() {
/* 562 */     this.field_70171_ac = this.field_70170_p.func_72918_a(this.field_70121_D, Material.field_151586_h, this);
/* 563 */     return this.field_70171_ac;
/*     */   }
/*     */   
/*     */   public void func_70037_a(NBTTagCompound nbt) {
/* 567 */     info().load(nbt.func_74775_l("info"));
/* 568 */     inventorySize_$eq(computeInventorySize());
/* 569 */     if (!(world()).field_72995_K) {
/* 570 */       machine().load(nbt.func_74775_l("machine"));
/* 571 */       control().load(nbt.func_74775_l("control"));
/* 572 */       components().load(nbt.func_74775_l("components"));
/* 573 */       mainInventory().load(nbt.func_74775_l("inventory"));
/*     */       
/* 575 */       wireThingsTogether();
/*     */     } 
/* 577 */     targetX_$eq(nbt.func_74760_g("targetX"));
/* 578 */     targetY_$eq(nbt.func_74760_g("targetY"));
/* 579 */     targetZ_$eq(nbt.func_74760_g("targetZ"));
/* 580 */     targetAcceleration_$eq(nbt.func_74760_g("targetAcceleration"));
/* 581 */     setSelectedSlot(nbt.func_74771_c("selectedSlot") & 0xFF);
/* 582 */     setSelectedTank(nbt.func_74771_c("selectedTank") & 0xFF);
/* 583 */     statusText_$eq(nbt.func_74779_i("statusText"));
/* 584 */     lightColor_$eq(nbt.func_74762_e("lightColor"));
/* 585 */     if (nbt.func_74764_b("owner")) {
/* 586 */       ownerName_$eq(nbt.func_74779_i("owner"));
/*     */     }
/* 588 */     if (nbt.func_74764_b("ownerUuid")) {
/* 589 */       ownerUUID_$eq(UUID.fromString(nbt.func_74779_i("ownerUuid")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void func_70014_b(NBTTagCompound nbt) {
/* 594 */     if (this.field_70170_p.field_72995_K)
/* 595 */       return;  components().saveComponents();
/* 596 */     info().storedEnergy_$eq((int)control().node().localBuffer());
/* 597 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("info", (Function1)new Drone$$anonfun$writeEntityToNBT$1(this));
/*     */     
/* 599 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("machine", (Function1)new Drone$$anonfun$writeEntityToNBT$2(this));
/* 600 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("control", (Function1)new Drone$$anonfun$writeEntityToNBT$3(this));
/* 601 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("components", (Function1)new Drone$$anonfun$writeEntityToNBT$4(this));
/* 602 */     (world()).field_72995_K ? BoxedUnit.UNIT : ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("inventory", (Function1)new Drone$$anonfun$writeEntityToNBT$5(this));
/*     */     
/* 604 */     nbt.func_74776_a("targetX", targetX());
/* 605 */     nbt.func_74776_a("targetY", targetY());
/* 606 */     nbt.func_74776_a("targetZ", targetZ());
/* 607 */     nbt.func_74776_a("targetAcceleration", targetAcceleration());
/* 608 */     nbt.func_74774_a("selectedSlot", (byte)selectedSlot());
/* 609 */     nbt.func_74774_a("selectedTank", (byte)selectedTank());
/* 610 */     nbt.func_74778_a("statusText", statusText());
/* 611 */     nbt.func_74768_a("lightColor", lightColor());
/* 612 */     nbt.func_74778_a("owner", ownerName());
/* 613 */     nbt.func_74778_a("ownerUuid", ownerUUID().toString());
/*     */   }
/*     */   
/*     */   public final class Drone$$anonfun$writeEntityToNBT$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.info().save(nbt);
/*     */     }
/*     */     
/*     */     public Drone$$anonfun$writeEntityToNBT$1(Drone $outer) {}
/*     */   }
/*     */   
/*     */   public final class Drone$$anonfun$writeEntityToNBT$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(NBTTagCompound x$1) {
/*     */       this.$outer.machine().save(x$1);
/*     */     }
/*     */     
/*     */     public Drone$$anonfun$writeEntityToNBT$2(Drone $outer) {}
/*     */   }
/*     */   
/*     */   public final class Drone$$anonfun$writeEntityToNBT$3 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(NBTTagCompound x$1) {
/*     */       this.$outer.control().save(x$1);
/*     */     }
/*     */     
/*     */     public Drone$$anonfun$writeEntityToNBT$3(Drone $outer) {}
/*     */   }
/*     */   
/*     */   public final class Drone$$anonfun$writeEntityToNBT$4 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.components().save(nbt);
/*     */     }
/*     */     
/*     */     public Drone$$anonfun$writeEntityToNBT$4(Drone $outer) {}
/*     */   }
/*     */   
/*     */   public final class Drone$$anonfun$writeEntityToNBT$5 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.mainInventory().save(nbt);
/*     */     }
/*     */     
/*     */     public Drone$$anonfun$writeEntityToNBT$5(Drone $outer) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\entity\Drone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */