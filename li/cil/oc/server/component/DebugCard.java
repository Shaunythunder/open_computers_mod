/*     */ package li.cil.oc.server.component;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.api.prefab.AbstractValue;
/*     */ import li.cil.oc.server.network.DebugNetwork;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.server.management.ServerConfigurationManager;
/*     */ import net.minecraft.server.management.UserListEntry;
/*     */ import net.minecraft.server.management.UserListOpsEntry;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraft.world.WorldSettings;
/*     */ import net.minecraftforge.common.DimensionManager;
/*     */ import net.minecraftforge.common.util.FakePlayer;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.event.world.BlockEvent;
/*     */ import net.minecraftforge.fluids.Fluid;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\035-c\001B\001\003\0015\021\021\002R3ck\036\034\025M\0353\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\030S9\021\001D\n\b\0033\021r!AG\022\017\005m\021cB\001\017\"\035\ti\002%D\001\037\025\tyB\"\001\004=e>|GOP\005\002\027%\021\021BC\005\003\017!I!!\002\004\n\005\025\"\021a\0028fi^|'o[\005\003O!\nA\002R3ck\036tU\r^<pe.T!!\n\003\n\005)Z#!\003#fEV<gj\0343f\025\t9\003\006\003\005.\001\t\005\t\025!\003/\003\021Awn\035;\021\005=\nT\"\001\031\013\005\025\022\022B\001\0321\005=)eN^5s_:lWM\034;I_N$\b\"\002\033\001\t\003)\024A\002\037j]&$h\b\006\0027qA\021q\007A\007\002\005!)Qf\ra\001]!9!\b\001b\001\n\003Z\024\001\0028pI\026,\022\001\020\t\003_uJ!A\020\031\003%\r{W\016]8oK:$8i\0348oK\016$xN\035\005\007\001\002\001\013\021\002\037\002\0139|G-\032\021\t\017\t\003\001\031!C\005\007\006Q!/Z7pi\026tu\016Z3\026\003\021\0032!\022%K\033\0051%\"A$\002\013M\034\027\r\\1\n\005%3%AB(qi&|g\016\005\0020\027&\021A\n\r\002\005\035>$W\rC\004O\001\001\007I\021B(\002\035I,Wn\034;f\035>$Wm\030\023fcR\021\001k\025\t\003\013FK!A\025$\003\tUs\027\016\036\005\b)6\013\t\0211\001E\003\rAH%\r\005\007-\002\001\013\025\002#\002\027I,Wn\034;f\035>$W\r\t\005\b1\002\001\r\021\"\003Z\003I\021X-\\8uK:{G-\032)pg&$\030n\0348\026\003i\0032!\022%\\!\025)EL\0300_\023\tifI\001\004UkBdWm\r\t\003\013~K!\001\031$\003\007%sG\017C\004c\001\001\007I\021B2\002-I,Wn\034;f\035>$W\rU8tSRLwN\\0%KF$\"\001\0253\t\017Q\013\027\021!a\0015\"1a\r\001Q!\ni\0131C]3n_R,gj\0343f!>\034\030\016^5p]\002Bq\001\033\001A\002\023\r\021.\001\004bG\016,7o]\013\002UB\031Q\tS6\021\0071\f)A\004\002n_:\021\021D\\\005\003\007\0219Q\001\035\002\t\002E\f\021\002R3ck\036\034\025M\0353\021\005]\022h!B\001\003\021\003\0318C\001:u!\t)U/\003\002w\r\n1\021I\\=SK\032DQ\001\016:\005\002a$\022!\035\005\006uJ$\ta_\001\fG\",7m[!dG\026\0348\017F\001})\t\001V\020C\003s\002\017q0A\002dib\004B!\022%\002\002A!\0211AA\003\033\005\021hABA\004e\002\013IAA\007BG\016,7o]\"p]R,\007\020^\n\b\003\013!\0301BA\t!\r)\025QB\005\004\003\0371%a\002)s_\022,8\r\036\t\004\013\006M\021bAA\013\r\na1+\032:jC2L'0\0312mK\"Y\021\021DA\003\005+\007I\021AA\016\003\031\001H.Y=feV\021\021Q\004\t\005\003?\t)CD\002F\003CI1!a\tG\003\031\001&/\0323fM&!\021qEA\025\005\031\031FO]5oO*\031\0211\005$\t\027\0055\022Q\001B\tB\003%\021QD\001\ba2\f\0270\032:!\021-\t\t$!\002\003\026\004%\t!a\007\002\0139|gnY3\t\027\005U\022Q\001B\tB\003%\021QD\001\007]>t7-\032\021\t\017Q\n)\001\"\001\002:Q1\021\021AA\036\003{A\001\"!\007\0028\001\007\021Q\004\005\t\003c\t9\0041\001\002\036!A\021\021IA\003\t\003\t\031%\001\003tCZ,Gc\001)\002F!A\021qIA \001\004\tI%A\002oER\004B!a\023\002X5\021\021Q\n\006\005\003\017\nyE\003\003\002R\005M\023!C7j]\026\034'/\0314u\025\t\t)&A\002oKRLA!!\027\002N\tqaJ\021+UC\036\034u.\0349pk:$\007BCA/\003\013\t\t\021\"\001\002`\005!1m\0349z)\031\t\t!!\031\002d!Q\021\021DA.!\003\005\r!!\b\t\025\005E\0221\fI\001\002\004\ti\002\003\006\002h\005\025\021\023!C\001\003S\nabY8qs\022\"WMZ1vYR$\023'\006\002\002l)\"\021QDA7W\t\ty\007\005\003\002r\005mTBAA:\025\021\t)(a\036\002\023Ut7\r[3dW\026$'bAA=\r\006Q\021M\0348pi\006$\030n\0348\n\t\005u\0241\017\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007BCAA\003\013\t\n\021\"\001\002j\005q1m\0349zI\021,g-Y;mi\022\022\004BCAC\003\013\t\t\021\"\021\002\b\006i\001O]8ek\016$\bK]3gSb,\"!!#\021\t\005-\025QS\007\003\003\033SA!a$\002\022\006!A.\0318h\025\t\t\031*\001\003kCZ\f\027\002BA\024\003\033C!\"!'\002\006\005\005I\021AAN\0031\001(o\0343vGR\f%/\033;z+\005q\006BCAP\003\013\t\t\021\"\001\002\"\006q\001O]8ek\016$X\t\\3nK:$H\003BAR\003S\0032!RAS\023\r\t9K\022\002\004\003:L\b\002\003+\002\036\006\005\t\031\0010\t\025\0055\026QAA\001\n\003\ny+A\bqe>$Wo\031;Ji\026\024\030\r^8s+\t\t\t\f\005\004\0024\006e\0261U\007\003\003kS1!a.G\003)\031w\016\0347fGRLwN\\\005\005\003w\013)L\001\005Ji\026\024\030\r^8s\021)\ty,!\002\002\002\023\005\021\021Y\001\tG\006tW)];bYR!\0211YAe!\r)\025QY\005\004\003\0174%a\002\"p_2,\027M\034\005\n)\006u\026\021!a\001\003GC!\"!4\002\006\005\005I\021IAh\003!A\027m\0355D_\022,G#\0010\t\025\005M\027QAA\001\n\003\n).\001\005u_N#(/\0338h)\t\tI\t\003\006\002Z\006\025\021\021!C!\0037\fa!Z9vC2\034H\003BAb\003;D\021\002VAl\003\003\005\r!a)\b\017\005\005(\017#\001\002d\006i\021iY2fgN\034uN\034;fqR\004B!a\001\002f\0329\021q\001:\t\002\005\0358#BAsi\006E\001b\002\033\002f\022\005\0211\036\013\003\003GD\001\"a<\002f\022\005\021\021_\001\007e\026lwN^3\025\007A\013\031\020\003\005\002H\0055\b\031AA%\021!\t90!:\005\002\005e\030\001\0027pC\022$2a`A~\021!\t9%!>A\002\005%\003BCA\000\003K\f\t\021\"!\003\002\005)\021\r\0359msR1\021\021\001B\002\005\013A\001\"!\007\002~\002\007\021Q\004\005\t\003c\ti\0201\001\002\036!Q!\021BAs\003\003%\tIa\003\002\017Ut\027\r\0359msR!!Q\002B\013!\021)\005Ja\004\021\017\025\023\t\"!\b\002\036%\031!1\003$\003\rQ+\b\017\\33\021)\0219Ba\002\002\002\003\007\021\021A\001\004q\022\002\004B\003B\016\003K\f\t\021\"\003\003\036\005Y!/Z1e%\026\034x\016\034<f)\t\021y\002\005\003\002\f\n\005\022\002\002B\022\003\033\023aa\0242kK\016$hA\002B\024e\002\021ICA\006QY\006LXM\035,bYV,7\003\002B\023\005W\0012a\004B\027\023\r\021y\003\005\002\016\003\n\034HO]1diZ\013G.^3\t\027\tM\"Q\005BA\002\023\005\0211D\001\005]\006lW\rC\006\0038\t\025\"\0211A\005\002\te\022\001\0038b[\026|F%Z9\025\007A\023Y\004C\005U\005k\t\t\0211\001\002\036!Y!q\bB\023\005\003\005\013\025BA\017\003\025q\027-\\3!\021)q(Q\005BA\002\023\r!1I\013\002\"Y!q\tB\023\005\003\007I\021\001B%\003\035\031G\017_0%KF$2\001\025B&\021!!&QIA\001\002\004y\bB\003B(\005K\021\t\021)Q\005\006!1\r\036=!\021\035!$Q\005C\001\005'\"BA!\026\003\\Q!!q\013B-!\021\t\031A!\n\t\ry\024\t\006q\001\000\021!\021\031D!\025A\002\005u\001b\002\033\003&\021\005!q\f\013\003\005/B\001Ba\031\003&\021\005!QM\001\013o&$\b\016\0257bs\026\024H\003\002B4\005[\002B!\022B5i&\031!1\016$\003\013\005\023(/Y=\t\021\t=$\021\ra\001\005c\n\021A\032\t\b\013\nM$q\017B4\023\r\021)H\022\002\n\rVt7\r^5p]F\002BA!\037\003\0026\021!1\020\006\005\0033\021iH\003\003\003\000\005=\023AB3oi&$\0300\003\003\003\004\nm$AD#oi&$\030\020\0257bs\026\024X\n\025\005\t\005\017\023)\003\"\001\003\n\006Aq-\032;X_JdG\r\006\004\003h\t-%1\024\005\t\005\033\023)\t1\001\003\020\00691m\0348uKb$\b\003\002BI\005/k!Aa%\013\007\tU%#A\004nC\016D\027N\\3\n\t\te%1\023\002\b\007>tG/\032=u\021!\021iJ!\"A\002\t}\025\001B1sON\004BA!%\003\"&!!1\025BJ\005%\t%oZ;nK:$8\017\013\005\003\006\n\035&Q\026BX!\021\021\tJ!+\n\t\t-&1\023\002\t\007\006dGNY1dW\006\031Am\\2\"\005\tE\026!\0164v]\016$\030n\0348)Si*8/\032:eCR\f\007%L\027!\017\026$\b\005\0365fAAd\027-_3sOM\004so\034:mI\002z'M[3di:B\001B!.\003&\021\005!qW\001\fO\026$x)Y7f)f\004X\r\006\004\003h\te&1\030\005\t\005\033\023\031\f1\001\003\020\"A!Q\024BZ\001\004\021y\n\013\005\0034\n\035&Q\026B`C\t\021\t-\001\031gk:\034G/[8oQ%R4\017\036:j]\036\004S&\f\021HKR\004C\017[3!a2\f\0270\032:(g\002:\027-\\3!if\004XM\f\005\t\005\013\024)\003\"\001\003H\006Y1/\032;HC6,G+\0379f)\031\0219G!3\003L\"A!Q\022Bb\001\004\021y\t\003\005\003\036\n\r\007\031\001BPQ!\021\031Ma*\003.\n=\027E\001Bi\003a3WO\\2uS>t\007fZ1nKRL\b/\032\036tiJLgnZ\025![5\0023+\032;!i\",\007\005\0357bs\026\024xe\035\021hC6,\007\005^=qK\002B3/\036:wSZ\fG\016\f\021de\026\fG/\033<fY\001\nGM^3oiV\024X-\013\030\t\021\tU'Q\005C\001\005/\f1bZ3u!>\034\030\016^5p]R1!q\rBm\0057D\001B!$\003T\002\007!q\022\005\t\005;\023\031\0161\001\003 \"B!1\033BT\005[\023y.\t\002\003b\006yd-\0368di&|g\016K\025;]Vl'-\032:-A9,XNY3sY\001rW/\0342fe\002jS\006I$fi\002\"\b.\032\021qY\006LXM]\024tAA|7/\033;j_:t\003\002\003Bs\005K!\tAa:\002\027M,G\017U8tSRLwN\034\013\007\005O\022IOa;\t\021\t5%1\035a\001\005\037C\001B!(\003d\002\007!q\024\025\t\005G\0249K!,\003p\006\022!\021_\001EMVt7\r^5p]\"B(H\\;nE\026\024H\006I=;]Vl'-\032:-AiTd.^7cKJL\003%L\027!'\026$\b\005\0365fAAd\027-_3sOM\004\003o\\:ji&|gN\f\005\t\005k\024)\003\"\001\003x\006Iq-\032;IK\006dG\017\033\013\007\005O\022IPa?\t\021\t5%1\037a\001\005\037C\001B!(\003t\002\007!q\024\025\t\005g\0249K!,\003\000\006\0221\021A\001.MVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fAAd\027-_3sOM\004\003.Z1mi\"t\003\002CB\003\005K!\taa\002\002\031\035,G/T1y\021\026\fG\016\0365\025\r\t\0354\021BB\006\021!\021iia\001A\002\t=\005\002\003BO\007\007\001\rAa()\021\r\r!q\025BW\007\037\t#a!\005\002c\031,hn\031;j_:D\023F\0178v[\n,'\017I\027.A\035+G\017\t;iK\002\002H.Y=fe\036\032\b%\\1yA!,\027\r\034;i]!A1Q\003B\023\t\003\0319\"A\005tKRDU-\0317uQR1!qMB\r\0077A\001B!$\004\024\001\007!q\022\005\t\005;\033\031\0021\001\003 \"B11\003BT\005[\033y\"\t\002\004\"\005\031d-\0368di&|g\016\0135fC2$\bN\0178v[\n,'/\013\021.[\001\032V\r\036\021uQ\026\004\003\017\\1zKJ<3\017\t5fC2$\bN\f\005\t\003o\024)\003\"\021\004&Q\031\001ka\n\t\021\005\03531\005a\001\003\023B\001\"!\021\003&\021\00531\006\013\004!\0165\002\002CA$\007S\001\r!!\023\007\r\rE\"\017AB\032\005)9vN\0357e-\006dW/Z\n\005\007_\021Y\003C\006\0048\r=\"\0211A\005\002\re\022!B<pe2$WCAB\036!\021\031id!\021\016\005\r}\"\002BB\034\003\037JAaa\021\004@\t)qk\034:mI\"Y1qIB\030\005\003\007I\021AB%\003%9xN\0357e?\022*\027\017F\002Q\007\027B\021\002VB#\003\003\005\raa\017\t\027\r=3q\006B\001B\003&11H\001\007o>\024H\016\032\021\t\025y\034yC!a\001\n\007\021\031\005C\006\003H\r=\"\0211A\005\002\rUCc\001)\004X!AAka\025\002\002\003\007q\020\003\006\003P\r=\"\021!Q!\n}Dq\001NB\030\t\003\031i\006\006\003\004`\r\025D\003BB1\007G\002B!a\001\0040!1apa\027A\004}D\001ba\016\004\\\001\00711\b\005\bi\r=B\021AB5)\t\031\t\007\003\005\004n\r=B\021AB8\00399W\r\036#j[\026t7/[8o\023\022$bAa\032\004r\rM\004\002\003BG\007W\002\rAa$\t\021\tu51\016a\001\005?C\003ba\033\003(\n56qO\021\003\007s\n!IZ;oGRLwN\034\025*u9,XNY3sA5j\003eR3ug\002\"\b.\032\021ok6,'/[2!S\022\004sN\032\021uQ\026\0043-\036:sK:$\b\005Z5nK:\034\030n\0348/\021!\031iha\f\005\002\r}\024\001E4fi\022KW.\0328tS>tg*Y7f)\031\0219g!!\004\004\"A!QRB>\001\004\021y\t\003\005\003\036\016m\004\031\001BPQ!\031YHa*\003.\016\035\025EABE\003q2WO\\2uS>t\007&\013\036tiJLgn\032\021.[\001:U\r^:!i\",\007E\\1nK\002zg\r\t;iK\002\032WO\035:f]R\004C-[7f]NLwN\034\030\t\021\r55q\006C\001\007\037\013qaZ3u'\026,G\r\006\004\003h\rE51\023\005\t\005\033\033Y\t1\001\003\020\"A!QTBF\001\004\021y\n\013\005\004\f\n\035&QVBLC\t\031I*\001\031gk:\034G/[8oQ%Rd.^7cKJ\004S&\f\021HKR\034\b\005\0365fAM,W\r\032\021pM\002\"\b.\032\021x_JdGM\f\005\t\007;\033y\003\"\001\004 \006I\021n\035*bS:Lgn\032\013\007\005O\032\tka)\t\021\t551\024a\001\005\037C\001B!(\004\034\002\007!q\024\025\t\0077\0239K!,\004(\006\0221\021V\001?MVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AI+G/\036:og\002:\b.\032;iKJ\004\023\016\036\021jg\002\032WO\035:f]Rd\027\020\t:bS:Lgn\032\030\t\021\r56q\006C\001\007_\013!b]3u%\006Lg.\0338h)\031\0219g!-\0044\"A!QRBV\001\004\021y\t\003\005\003\036\016-\006\031\001BPQ!\031YKa*\003.\016]\026EAB]\003\0013WO\\2uS>t\007F^1mk\026T$m\\8mK\006t\027\006I\027.AM+Go\035\021xQ\026$\b.\032:!SR\004\023n\035\021dkJ\024XM\034;ms\002\022\030-\0338j]\036t\003\002CB_\007_!\taa0\002\031%\034H\013[;oI\026\024\030N\\4\025\r\t\0354\021YBb\021!\021iia/A\002\t=\005\002\003BO\007w\003\rAa()\021\rm&q\025BW\007\017\f#a!3\002\003\032,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001\022V\r^;s]N\004s\017[3uQ\026\024\b%\033;!SN\0043-\036:sK:$H.\037\021uQVtG-\032:j]\036t\003\002CBg\007_!\taa4\002\033M,G\017\0265v]\022,'/\0338h)\031\0219g!5\004T\"A!QRBf\001\004\021y\t\003\005\003\036\016-\007\031\001BPQ!\031YMa*\003.\016]\027EABm\003\r3WO\\2uS>t\007F^1mk\026T$m\\8mK\006t\027\006I\027.AM+Go\035\021xQ\026$\b.\032:!SR\004\023n\035\021dkJ\024XM\034;ms\002\"\b.\0368eKJLgn\032\030\t\021\ru7q\006C\001\007?\fqaZ3u)&lW\r\006\004\003h\r\00581\035\005\t\005\033\033Y\0161\001\003\020\"A!QTBn\001\004\021y\n\013\005\004\\\n\035&QVBtC\t\031I/\001\031gk:\034G/[8oQ%Rd.^7cKJ\004S&\f\021HKR\004C\017[3!GV\024(/\0328uA]|'\017\0343!i&lWM\f\005\t\007[\034y\003\"\001\004p\00691/\032;US6,GC\002B4\007c\034\031\020\003\005\003\016\016-\b\031\001BH\021!\021ija;A\002\t}\005\006CBv\005O\023ika>\"\005\re\030!\0164v]\016$\030n\0348)m\006dW/\032\036ok6\024WM]\025![5\0023+\032;!i\",\007eY;se\026tG\017I<pe2$\007\005^5nK:B\001b!@\0040\021\0051q`\001\016O\026$8\013]1x]B{\027N\034;\025\r\t\035D\021\001C\002\021!\021iia?A\002\t=\005\002\003BO\007w\004\rAa()\021\rm(q\025BW\t\017\t#\001\"\003\002\033\032,hn\031;j_:D\023F\0178v[\n,'\017\f\021ok6\024WM\035\027!]Vl'-\032:![5\002s)\032;!i\",\007eY;se\026tG\017I:qC^t\007\005]8j]R\0043m\\8sI&t\027\r^3t]!AAQBB\030\t\003!y!A\007tKR\034\006/Y<o!>Lg\016\036\013\007\005O\"\t\002b\005\t\021\t5E1\002a\001\005\037C\001B!(\005\f\001\007!q\024\025\t\t\027\0219K!,\005\030\005\022A\021D\001KMVt7\r^5p]\"B(H\\;nE\026\024H\006I=;]Vl'-\032:-AiTd.^7cKJL\003%L\027!'\026$\b\005\0365fAM\004\030m\0368!a>Lg\016\036\021d_>\024H-\0338bi\026\034h\006\003\005\005\036\r=B\021\001C\020\003-\001H.Y=T_VtG-\021;\025\r\t\035D\021\005C\022\021!\021i\tb\007A\002\t=\005\002\003BO\t7\001\rAa()\021\021m!q\025BW\tO\t#\001\"\013\002a\032,hn\031;j_:D\003P\0178v[\n,'\017\f\021zu9,XNY3sY\001R(H\\;nE\026\024H\006I:pk:$'h\035;sS:<G\006\t:b]\036,'H\\;nE\026\024\030\006I\027.AAc\027-\037\021bAM|WO\0343!CR\004C\017[3!gB,7-\0334jK\022\0043m\\8sI&t\027\r^3t]!AAQFB\030\t\003!y#\001\006hKR\024En\\2l\023\022$bAa\032\0052\021M\002\002\003BG\tW\001\rAa$\t\021\tuE1\006a\001\005?C\003\002b\013\003(\n5FqG\021\003\ts\taMZ;oGRLwN\034\025yu9,XNY3sY\001J(H\\;nE\026\024H\006\t>;]Vl'-\032:*u9,XNY3sA5j\003eR3uAQDW\rI%EA=4\007\005\0365fA\tdwnY6!CR\004C\017[3!gB,7-\0334jK\022\0043m\\8sI&t\027\r^3t]!AAQHB\030\t\003!y$A\006hKRlU\r^1eCR\fGC\002B4\t\003\"\031\005\003\005\003\016\022m\002\031\001BH\021!\021i\nb\017A\002\t}\005\006\003C\036\005O\023i\013b\022\"\005\021%\023\001\0344v]\016$\030n\0348)qjrW/\0342fe2\002\023P\0178v[\n,'\017\f\021{u9,XNY3sSirW/\0342fe\002jS\006I$fi\002\"\b.\032\021nKR\fG-\031;bA=4\007\005\0365fA\tdwnY6!CR\004C\017[3!gB,7-\0334jK\022\0043m\\8sI&t\027\r^3t]!AAQJB\030\t\003!y%\001\005jg2{\027\rZ3e)\031\0219\007\"\025\005T!A!Q\022C&\001\004\021y\t\003\005\003\036\022-\003\031\001BPQ!!YEa*\003.\022]\023E\001C-\003A4WO\\2uS>t\007\006\037\036ok6\024WM\035\027!sjrW/\0342fe2\002#P\0178v[\n,'/\013\036ok6\024WM\035\021.[\001\032\005.Z2lA]DW\r\0365fe\002\"\b.\032\021cY>\0347\016I1uAQDW\rI:qK\016Lg-[3eA\r|wN\0353j]\006$Xm\035\021jg\002bw.\0313fI:B\001\002\"\030\0040\021\005AqL\001\016Q\006\034H+\0337f\013:$\030\016^=\025\r\t\035D\021\rC2\021!\021i\tb\027A\002\t=\005\002\003BO\t7\002\rAa()\021\021m#q\025BW\tO\n#\001\"\033\002q\032,hn\031;j_:D\003P\0178v[\n,'\017\f\021zu9,XNY3sY\001R(H\\;nE\026\024\030F\0178v[\n,'\017I\027.A\rCWmY6!o\",G\017[3sAQDW\r\t2m_\016\\\007%\031;!i\",\007e\0359fG&4\027.\0323!G>|'\017Z5oCR,7\017\t5bg\002\n\007\005^5mK\002*g\016^5us:B\001\002\"\034\0040\021\005AqN\001\013O\026$H+\0337f\035\n#FC\002B4\tc\"\031\b\003\005\003\016\022-\004\031\001BH\021!\021i\nb\033A\002\t}\005\006\003C6\005O\023i\013b\036\"\005\021e\024A\0324v]\016$\030n\0348)qjrW/\0342fe2\002\023P\0178v[\n,'\017\f\021{u9,XNY3sSi\"\030M\0317fA5j\003eR3uAQDW\r\t(C)\002zg\r\t;iK\002\022Gn\\2lA\005$\b\005\0365fAM\004XmY5gS\026$\007eY8pe\022Lg.\031;fg:B\001\002\" \0040\021\005AqP\001\013g\026$H+\0337f\035\n#FC\002B4\t\003#\031\t\003\005\003\016\022m\004\031\001BH\021!\021i\nb\037A\002\t}\005\006\003C>\005O\023i\013b\"\"\005\021%\025a\0354v]\016$\030n\0348)qjrW/\0342fe2\002\023P\0178v[\n,'\017\f\021{u9,XNY3sY\001r'\r\036\036uC\ndW-\013\036c_>dW-\0318![5\0023+\032;!i\",\007E\024\"UA=4\007\005\0365fA\tdwnY6!CR\004C\017[3!gB,7-\0334jK\022\0043m\\8sI&t\027\r^3t]!AAQRB\030\t\003!y)A\bhKRd\025n\0325u\037B\f7-\033;z)\031\0219\007\"%\005\024\"A!Q\022CF\001\004\021y\t\003\005\003\036\022-\005\031\001BPQ!!YIa*\003.\022]\025E\001CM\003E4WO\\2uS>t\007\006\037\036ok6\024WM\035\027!sjrW/\0342fe2\002#P\0178v[\n,'/\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\004C.[4ii\002z\007/Y2jif\004sN\032\021uQ\026\004#\r\\8dW\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI2p_J$\027N\\1uKNt\003\002\003CO\007_!\t\001b(\002\033\035,G\017T5hQR4\026\r\\;f)\031\0219\007\")\005$\"A!Q\022CN\001\004\021y\t\003\005\003\036\022m\005\031\001BPQ!!YJa*\003.\022\035\026E\001CU\003i4WO\\2uS>t\007\006\037\036ok6\024WM\035\027!sjrW/\0342fe2\002#P\0178v[\n,'/\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\004C.[4ii\0022\030\r\\;fA!*W.[:tS>t\027\006I8gAQDW\r\t2m_\016\\\007%\031;!i\",\007e\0359fG&4\027.\0323!G>|'\017Z5oCR,7O\f\005\t\t[\033y\003\"\001\0050\006I1-\0318TK\026\0346.\037\013\007\005O\"\t\fb-\t\021\t5E1\026a\001\005\037C\001B!(\005,\002\007!q\024\025\t\tW\0239K!,\0058\006\022A\021X\001MVt7\r^5p]\"B(H\\;nE\026\024H\006I=;]Vl'-\032:-AiTd.^7cKJL#H\\;nE\026\024\b%L\027!\017\026$\be\0365fi\",'\017\t;iK\002\022Gn\\2lA\005$\b\005\0365fAM\004XmY5gS\026$\007eY8pe\022Lg.\031;fg\002J7\017\t3je\026\034G\017\\=!k:$WM\035\021uQ\026\0043o[=/\021!!ila\f\005\002\021}\026\001C:fi\ncwnY6\025\r\t\035D\021\031Cb\021!\021i\tb/A\002\t=\005\002\003BO\tw\003\rAa()\021\021m&q\025BW\t\017\f#\001\"3\002}\032,hn\031;j_:D\003P\0178v[\n,'\017\f\021zu9,XNY3sY\001R(H\\;nE\026\024H\006I5eu9,XNY3sA=\024\be\035;sS:<G\006I7fi\006Td.^7cKJL#H\\;nE\026\024\b%L\027!'\026$\b\005\0365fA\tdwnY6!CR\004C\017[3!gB,7-\0334jK\022\0043m\\8sI&t\027\r^3t]!AAQZB\030\t\003!y-A\005tKR\024En\\2lgR1!q\rCi\t'D\001B!$\005L\002\007!q\022\005\t\005;#Y\r1\001\003 \"BA1\032BT\005[#9.\t\002\005Z\006\t\031KZ;oGRLwN\034\025ycirW/\0342fe2\002\0230\r\036ok6\024WM\035\027!uFRd.^7cKJd\003\005\037\032;]Vl'-\032:-Ae\024$H\\;nE\026\024H\006\t>3u9,XNY3sY\001JGM\0178v[\n,'\017I8sAM$(/\0338hY\001jW\r^1;]Vl'-\032:*u9,XNY3sA5j\003eU3uA\005dG\016\t2m_\016\\7\017I5oAQDW\rI1sK\006\004C-\0324j]\026$\007EY=!i\",\007\005^<pA\r|'O\\3sAA|\027N\034;tA!B\030\007\f\021zc1\002#0M\025!C:$\007\005\013=3Y\001J(\007\f\021{e%r\003\002\003Co\007_!\t\001b8\002\025%t7/\032:u\023R,W\016\006\004\003h\021\005H1\035\005\t\005\033#Y\0161\001\003\020\"A!Q\024Cn\001\004\021y\n\013\005\005\\\n\035&Q\026CtC\t!I/AAYMVt7\r^5p]\"JGMO:ue&tw\r\f\021d_VtGO\0178v[\n,'\017\f\021eC6\fw-\032\036ok6\024WM\035\027!]\n$(h\035;sS:<G\006\t=;]Vl'-\032:-AeTd.^7cKJd\003E\037\036ok6\024WM\035\027!g&$WM\0178v[\n,'/\013\036c_>dW-\0318![\001Jen]3si\002\ng\016I5uK6\0043\017^1dW\002Jg\016^8!i\",\007%\0338wK:$xN]=!CR\004C\017[3!gB,7-\0334jK\022\004Cn\\2bi&|gN\f\021O\005R\003C/Y4!SN\004S\r\0379fGR,G\rI5oA)\033vJ\024\021g_Jl\027\r\036\030\t\021\02158q\006C\001\t_\f!B]3n_Z,\027\n^3n)\031\0219\007\"=\005t\"A!Q\022Cv\001\004\021y\t\003\005\003\036\022-\b\031\001BPQ!!YOa*\003.\022]\030E\001C}\003\005Mb-\0368di&|g\016\013=;]Vl'-\032:-AeTd.^7cKJd\003E\037\036ok6\024WM\035\027!g2|GO\0178v[\n,'o\027\027!G>,h\016\036\036ok6\024WM]/*u9,XNY3sA5\002#+\0323vG\026\004C\017[3!g&TX\rI8gA\005t\007%\033;f[\002\032H/Y2lA%t\007\005\0365fA%tg/\0328u_JL\b%\031;!i\",\007e\0359fG&4\027.\0323!Y>\034\027\r^5p]:B\001\002\"@\0040\021\005Aq`\001\fS:\034XM\035;GYVLG\r\006\004\003h\025\005Q1\001\005\t\005\033#Y\0201\001\003\020\"A!Q\024C~\001\004\021y\n\013\005\005|\n\035&QVC\004C\t)I!AA\023MVt7\r^5p]\"JGMO:ue&tw\r\f\021b[>,h\016\036\036ok6\024WM\035\027!qjrW/\0342fe2\002\023P\0178v[\n,'\017\f\021{u9,XNY3sY\001\032\030\016Z3;]Vl'-\032:*u\t|w\016\\3b]\002j\003%\0238tKJ$\be]8nK\0022G.^5eA%tGo\034\021uQ\026\004C/\0318lA\005$\b\005\0365fAM\004XmY5gS\026$\007\005\\8dCRLwN\034\030\t\021\02551q\006C\001\013\037\t1B]3n_Z,g\t\\;jIR1!qMC\t\013'A\001B!$\006\f\001\007!q\022\005\t\005;+Y\0011\001\003 \"BQ1\002BT\005[+9\"\t\002\006\032\005\tYAZ;oGRLwN\034\025b[>,h\016\036\036ok6\024WM\035\027!qjrW/\0342fe2\002\023P\0178v[\n,'\017\f\021{u9,XNY3sY\001\032\030\016Z3;]Vl'-\032:*u\t|w\016\\3b]\002j\003EU3n_Z,\007e]8nK\0022G.^5eA\031\024x.\034\021bAQ\fgn\033\021bi\002\"\b.\032\021ta\026\034\027NZ5fI\002bwnY1uS>tg\006\003\005\002x\016=B\021IC\017)\r\001Vq\004\005\t\003\017*Y\0021\001\002J!A\021\021IB\030\t\003*\031\003F\002Q\013KA\001\"a\022\006\"\001\007\021\021\n\004\007\013S\021\b!b\013\003\033\r{W.\\1oIN+g\016Z3s'\021)9#\"\f\021\t\025=RQH\007\003\013cQA!b\r\0066\005!Q\017^5m\025\021)9$\"\017\002\r\r|W.\\8o\025\021)Y$a\025\002\0355Lg.Z2sC\032$hm\034:hK&!QqHC\031\005)1\025m[3QY\006LXM\035\005\013[\025\035\"Q1A\005\002\025\rS#\001\030\t\025\025\035Sq\005B\001B\003%a&A\003i_N$\b\005C\006\006L\025\035\"Q1A\005\002\0255\023AC;oI\026\024H._5oOV\021!q\017\005\f\013#*9C!A!\002\023\0219(A\006v]\022,'\017\\=j]\036\004\003b\002\033\006(\021\005QQ\013\013\007\013/*I&b\027\021\t\005\rQq\005\005\007[\025M\003\031\001\030\t\021\025-S1\013a\001\005oB!\"b\030\006(\001\007I\021AC1\003!iWm]:bO\026\034XCAC2!\021)\005*!\b\t\025\025\035Tq\005a\001\n\003)I'\001\007nKN\034\030mZ3t?\022*\027\017F\002Q\013WB\021\002VC3\003\003\005\r!b\031\t\023\025=Tq\005Q!\n\025\r\024!C7fgN\fw-Z:!\021!)\031(b\n\005\002\025U\024a\0029sKB\f'/\032\013\002!\"AQ\021PC\024\t\003\n).\001\013hKR\034u.\\7b]\022\034VM\0343fe:\013W.\032\005\t\013{*9\003\"\021\006\000\005qq-\032;F]RLG/_,pe2$GCAB\036\021!)\031)b\n\005B\025\025\025AD1eI\016C\027\r^'fgN\fw-\032\013\004!\026\035\005\002CCE\013\003\003\r!b#\002\0175,7o]1hKB!QQRCI\033\t)yI\003\003\0064\005=\023\002BCJ\013\037\023a\"S\"iCR\034u.\0349p]\026tG\017\003\005\006\030\026\035B\021ICM\003i\031\027M\\\"p[6\fg\016Z*f]\022,'/V:f\007>lW.\0318e)\031\t\031-b'\006 \"9QQTCK\001\004q\026!\0027fm\026d\007\002CCQ\013+\003\r!!\b\002\017\r|W.\\1oI\"AQQUC\024\t\003*9+\001\013hKR\004F.Y=fe\016{wN\0353j]\006$Xm\035\013\003\013S\003B!\"$\006,&!QQVCH\005A\031\005.\0368l\007>|'\017Z5oCR,7\017\003\005\0062\026\035B\021ICZ\00391WO\\2`cQ*t\007\016\035`G~#\"!b#\007\r\025]&\017AC]\005%!Vm\035;WC2,Xm\005\003\0066\n-\002b\002\033\0066\022\005QQ\030\013\003\013\003B!a\001\0066\"QQ1YC[\001\004%\t!a\"\002\013Y\fG.^3\t\025\025\035WQ\027a\001\n\003)I-A\005wC2,Xm\030\023fcR\031\001+b3\t\023Q+)-!AA\002\005%\005\"CCh\013k\003\013\025BAE\003\0311\030\r\\;fA!A\021q`C[\t\003*\031\016F\003u\013+,9\016\003\005\003\016\026E\007\031\001BH\021!)I.\"5A\002\t}\025!C1sOVlWM\034;t\021!\021I!\".\005B\025uG#\002)\006`\026\005\b\002\003BG\0137\004\rAa$\t\021\025eW1\034a\001\005?C\001\"\":\0066\022\005Sq]\001\005G\006dG\016\006\004\003h\025%X1\036\005\t\005\033+\031\0171\001\003\020\"AQ\021\\Cr\001\004\021y\n\003\005\006p\026UF\021ICy\003\035!\027n\0359pg\026$2\001UCz\021!\021i)\"<A\002\t=\005\002CA|\013k#\t%b>\025\007A+I\020\003\005\002H\025U\b\031AA%\021!\t\t%\".\005B\025uHc\001)\006\000\"A\021qIC~\001\004\tI\005C\005\007\004\001\001\r\021\"\001\007\006\005Q\021mY2fgN|F%Z9\025\007A39\001\003\005U\r\003\t\t\0211\001k\021\0351Y\001\001Q!\n)\fq!Y2dKN\034\b\005C\004\002\032\001!\t!\"\031\t\025\031E\001\001#b\001\n\0231\031\"A\007D_6l\027M\0343TK:$WM]\013\003\r+\0012\001\\C\024\021)1I\002\001E\001B\003&aQC\001\017\007>lW.\0318e'\026tG-\032:!\021\0351i\002\001C\001\r?\tAb\0315b]\036,')\0364gKJ$bAa\032\007\"\031\r\002\002\003BG\r7\001\rAa$\t\021\tue1\004a\001\005?C\003Bb\007\003(\n5fqE\021\003\rS\taMZ;oGRLwN\034\025wC2,XM\0178v[\n,'/\013\036ok6\024WM\035\021.[\001\032\005.\0318hKN\004C\017[3!G>l\007o\0348f]R\004c.\032;x_J\\we\035\021f]\026\024x-\037\021ck\0324WM\035\021cs\002\"\b.\032\021ta\026\034\027NZ5fI\002\"W\r\034;b]!9aQ\006\001\005\002\031=\022\001B4fib#bAa\032\0072\031M\002\002\003BG\rW\001\rAa$\t\021\tue1\006a\001\005?C\003Bb\013\003(\n5fqG\021\003\rs\t\021IZ;oGRLwN\034\025*u9,XNY3sA5j\003eR3uAQDW\rI2p]R\f\027N\\3sOM\004\003\f\t9pg&$\030n\0348!S:\004C\017[3!o>\024H\016\032\030\t\017\031u\002\001\"\001\007@\005!q-\032;Z)\031\0219G\"\021\007D!A!Q\022D\036\001\004\021y\t\003\005\003\036\032m\002\031\001BPQ!1YDa*\003.\032\035\023E\001D%\003\0053WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043m\0348uC&tWM]\024tAe\003\003o\\:ji&|g\016I5oAQDW\rI<pe2$g\006C\004\007N\001!\tAb\024\002\t\035,GO\027\013\007\005O2\tFb\025\t\021\t5e1\na\001\005\037C\001B!(\007L\001\007!q\024\025\t\r\027\0229K!,\007X\005\022a\021L\001BMVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fA\r|g\016^1j]\026\024xe\035\021[AA|7/\033;j_:\004\023N\034\021uQ\026\004so\034:mI:BqAa\"\001\t\0031i\006\006\004\003h\031}c\021\r\005\t\005\0333Y\0061\001\003\020\"A!Q\024D.\001\004\021y\n\013\005\007\\\t\035&Q\026D3C\t19'\0016gk:\034G/[8oQmKGM\0178v[\n,'/X\025;kN,'\017Z1uC\002jS\006I$fi\002\"\b.\032\021x_JdG\rI8cU\026\034G\017\t4pe\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\027.\\3og&|g\016I%EY\001z'\017\t;iK\002\032wN\034;bS:,'oJ:/\021\0351Y\007\001C\001\r[\n\021bZ3u/>\024H\016Z:\025\r\t\035dq\016D9\021!\021iI\"\033A\002\t=\005\002\003BO\rS\002\rAa()\021\031%$q\025BW\rk\n#Ab\036\002\013\032,hn\031;j_:D\023F\017;bE2,\007%L\027!\017\026$\b%\031\021mSN$\be\0344!C2d\007e^8sY\022\004\023\nR:-A1|\027\rZ3eA\005tG\rI;oY>\fG-\0323/\021\0351Y\b\001C\001\r{\n\021bZ3u!2\f\0270\032:\025\r\t\035dq\020DA\021!\021iI\"\037A\002\t=\005\002\003BO\rs\002\rAa()\021\031e$q\025BW\r\013\013#Ab\"\002{\031,hn\031;j_:Dc.Y7fuM$(/\0338hSi*8/\032:eCR\f\007%L\027!\017\026$\b\005\0365fA\025tG/\033;zA=4\007%\031\021qY\006LXM\035\030\t\017\031-\005\001\"\001\007\016\006Qq-\032;QY\006LXM]:\025\r\t\035dq\022DI\021!\021iI\"#A\002\t=\005\002\003BO\r\023\003\rAa()\021\031%%q\025BW\r+\013#Ab&\002}\031,hn\031;j_:D\023F\017;bE2,\007%L\027!\017\026$\b%\031\021mSN$\be\0344!GV\024(/\0328uYf\004Cn\\4hK\022l\023N\034\021qY\006LXM]:/\021\0351Y\n\001C\001\r;\013ab]2b]\016{g\016^3oiN\fE\017\006\004\003h\031}e\021\025\005\t\005\0333I\n1\001\003\020\"A!Q\024DM\001\004\021y\n\013\005\007\032\n\035&Q\026DSC\t19+AA\034MVt7\r^5p]\"B(\b\t8v[\n,'\017\f\021zu\001rW/\0342fe2\002#P\017\021ok6\024WM].-A]|'\017\0343JIj\002c.^7cKJl\026F\0172p_2,\027M\034\027!gR\024\030N\\4-AQ\f'\r\\3![5\002#/\032;ve:\034\beY8oi\026tGo\035\021bi\002\"\b.\032\021m_\016\fG/[8oA%t\007e^8sY\022\004#-\037\021jI\002BC-\0324bk2$\b\005[8ti\002:xN\0357eS!9a1\026\001\005\002\0315\026aC5t\033>$Gj\\1eK\022$bAa\032\0070\032E\006\002\003BG\rS\003\rAa$\t\021\tue\021\026a\001\005?C\003B\"+\003(\n5fQW\021\003\ro\013AIZ;oGRLwN\034\025oC6,'h\035;sS:<\027F\0172p_2,\027M\034\021.[\001:U\r\036\021xQ\026$\b.\032:!C\002jw\016\032\021pe\002\n\005+\023\021jg\002bw.\0313fI:BqAb/\001\t\0031i,\001\006sk:\034u.\\7b]\022$bAa\032\007@\032\005\007\002\003BG\rs\003\rAa$\t\021\tue\021\030a\001\005?C\003B\"/\003(\n5fQY\021\003\r\017\f\021KZ;oGRLwN\034\025d_6l\027M\0343;gR\024\030N\\4*u9,XNY3sA5j\003EU;og\002\ng\016I1sE&$(/\031:zA\r|W.\\1oI\002*8/\0338hA\005\004c-Y6fAAd\027-_3s]!9a1\032\001\005\002\0315\027AD2p]:,7\r\036+p\0052|7m\033\013\007\005O2yM\"5\t\021\t5e\021\032a\001\005\037C\001B!(\007J\002\007!q\024\025\t\r\023\0249K!,\007V\006\022aq[\001~MVt7\r^5p]\"B(H\\;nE\026\024H\006I=;]Vl'-\032:-AiTd.^7cKJL#HY8pY\026\fg\016I\027.A\005#G\rI1!G>l\007o\0348f]R\004#\r\\8dW\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI2p_J$\027N\\1uKN\004Co\034\021uQ\026\0043m\\7qkR,'\017\t8fi^|'o\033\030\t\017\031m\007\001\"\003\007^\006Aa-\0338e\035>$W\rF\004E\r?4\031Ob:\t\017\031\005h\021\034a\001=\006\t\001\020C\004\007f\032e\007\031\0010\002\003eDqA\";\007Z\002\007a,A\001{\021\0351i\017\001C\001\r_\fA\001^3tiR1!q\rDy\rgD\001B!$\007l\002\007!q\022\005\t\005;3Y\0171\001\003 \"Ba1\036BT\005[390\t\002\007z\006qe-\0368di&|g\016K\025;kN,'\017Z1uC\002jS\006\t+fgR\004S.\032;i_\022\004cm\034:!kN,'/\f3bi\006\004\023M\0343!O\026tWM]1mAY\fG.^3!G>tg/\032:tS>tg\006C\004\007~\002!\tAb@\002\037M,g\016\032+p\0072L\007OY8be\022$bAa\032\b\002\035\r\001\002\003BG\rw\004\rAa$\t\021\tue1 a\001\005?C\003Bb?\003(\n5vqA\021\003\017\023\t1MZ;oGRLwN\034\025qY\006LXM\035\036tiJLgn\032\027!i\026DHOO:ue&tw-\013\021.[\001\032VM\0343tAQ,\007\020\036\021u_\002\"\b.\032\021ta\026\034\027NZ5fI\002\002H.Y=fe\036\032\be\0317ja\n|\027M\0353!S\032\004\003o\\:tS\ndWM\f\005\b\017\033\001A\021AD\b\003=\031XM\0343U_\022+'-^4DCJ$GC\002B4\017#9\031\002\003\005\003\016\036-\001\031\001BH\021!\021ijb\003A\002\t}\005\006CD\006\005O\023ikb\006\"\005\035e\021!\0304v]\016$\030n\0348)C\022$'/Z:tuM$(/\0338hY\001\"\027\r^1/]9J\003%L\027!'\026tGm\035\021eCR\f\007\005^8!i\",\007\005Z3ck\036\0043-\031:eA]LG\017\033\021uQ\026\0043\017]3dS\032LW\r\032\021bI\022\024Xm]:/\021\0359i\002\001C!\017?\tQB]3dK&4X\rU1dW\026$Hc\001)\b\"!Aq1ED\016\001\0049)#\001\004qC\016\\W\r\036\t\004_\035\035\022bAD\025a\t1\001+Y2lKRDqa\"\f\001\t\003\nY\"A\004bI\022\024Xm]:\t\017\035E\002\001\"\021\b4\005IqN\\\"p]:,7\r\036\013\004!\036U\002B\002\036\b0\001\007!\nC\004\b:\001!\teb\017\002\031=tG)[:d_:tWm\031;\025\007A;i\004\003\004;\017o\001\rA\023\005\b\003o\004A\021ID!)\r\001v1\t\005\t\003\017:y\0041\001\002J!9\021\021\t\001\005B\035\035Cc\001)\bJ!A\021qID#\001\004\tI\005")
/*     */ public class DebugCard extends ManagedEnvironment implements DebugNetwork.DebugNode {
/*     */   private final EnvironmentHost host;
/*  56 */   private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Neighbors)
/*  57 */     .withComponent("debug")
/*  58 */     .withConnector()
/*  59 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*     */   }
/*  62 */   private Option<Node> li$cil$oc$server$component$DebugCard$$remoteNode = (Option<Node>)scala.None$.MODULE$; public Option<Node> li$cil$oc$server$component$DebugCard$$remoteNode() { return this.li$cil$oc$server$component$DebugCard$$remoteNode; } public void li$cil$oc$server$component$DebugCard$$remoteNode_$eq(Option<Node> x$1) { this.li$cil$oc$server$component$DebugCard$$remoteNode = x$1; }
/*     */ 
/*     */   
/*  65 */   private Option<Tuple3<Object, Object, Object>> li$cil$oc$server$component$DebugCard$$remoteNodePosition = (Option<Tuple3<Object, Object, Object>>)scala.None$.MODULE$; private Option<Tuple3<Object, Object, Object>> li$cil$oc$server$component$DebugCard$$remoteNodePosition() { return this.li$cil$oc$server$component$DebugCard$$remoteNodePosition; } public void li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq(Option<Tuple3<Object, Object, Object>> x$1) { this.li$cil$oc$server$component$DebugCard$$remoteNodePosition = x$1; }
/*     */ 
/*     */   
/*  68 */   private Option<AccessContext> access = (Option<AccessContext>)scala.None$.MODULE$; private CommandSender li$cil$oc$server$component$DebugCard$$CommandSender; private volatile boolean bitmap$0; public Option<AccessContext> access() { return this.access; } public void access_$eq(Option<AccessContext> x$1) { this.access = x$1; }
/*     */   
/*  70 */   public Option<String> player() { return access().map((Function1)new DebugCard$$anonfun$player$1(this)); } public final class DebugCard$$anonfun$player$1 extends AbstractFunction1<AccessContext, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(DebugCard.AccessContext x$1) { return x$1.player(); }
/*     */      public DebugCard$$anonfun$player$1(DebugCard $outer) {} }
/*  72 */   private CommandSender li$cil$oc$server$component$DebugCard$$CommandSender$lzycompute() { synchronized (this) { if (!this.bitmap$0) {
/*     */         FakePlayer fakePlayer;
/*  74 */         Option<String> option = player();
/*  75 */         if (option instanceof Some) { FakePlayer fakePlayer1; Some some = (Some)option; String name = (String)some.x(); Option option1 = scala.Option$.MODULE$.apply(MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(name));
/*  76 */           if (option1 instanceof Some) { Some some1 = (Some)option1; EntityPlayerMP playerEntity = (EntityPlayerMP)some1.x(), entityPlayerMP1 = playerEntity; }
/*  77 */           else { fakePlayer1 = defaultFakePlayer$1(); }
/*     */            fakePlayer = fakePlayer1; }
/*  79 */         else { fakePlayer = defaultFakePlayer$1(); }
/*     */         
/*     */         this.li$cil$oc$server$component$DebugCard$$CommandSender = new CommandSender(this.host, (EntityPlayerMP)fakePlayer);
/*     */         this.bitmap$0 = true;
/*     */       } 
/*     */       return this.li$cil$oc$server$component$DebugCard$$CommandSender; }
/*     */      } public CommandSender li$cil$oc$server$component$DebugCard$$CommandSender() { return this.bitmap$0 ? this.li$cil$oc$server$component$DebugCard$$CommandSender : li$cil$oc$server$component$DebugCard$$CommandSender$lzycompute(); }
/*     */   private final FakePlayer defaultFakePlayer$1() { return FakePlayerFactory.get((WorldServer)this.host.world(), li.cil.oc.Settings$.MODULE$.get().fakePlayerProfile()); }
/*     */   @Callback(doc = "function(value:number):number -- Changes the component network's energy buffer by the specified delta.")
/*     */   public Object[] changeBuffer(Context context, Arguments args) {
/*  89 */     DebugCard$.MODULE$.checkAccess(access());
/*  90 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(node().changeBuffer(args.checkDouble(0))) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():number -- Get the container's X position in the world.")
/*     */   public Object[] getX(Context context, Arguments args) {
/*  95 */     DebugCard$.MODULE$.checkAccess(access());
/*  96 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(this.host.xPosition()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():number -- Get the container's Y position in the world.")
/*     */   public Object[] getY(Context context, Arguments args) {
/* 101 */     DebugCard$.MODULE$.checkAccess(access());
/* 102 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(this.host.yPosition()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():number -- Get the container's Z position in the world.")
/*     */   public Object[] getZ(Context context, Arguments args) {
/* 107 */     DebugCard$.MODULE$.checkAccess(access());
/* 108 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(this.host.zPosition()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function([id:number]):userdata -- Get the world object for the specified dimension ID, or the container's.")
/*     */   public Object[] getWorld(Context context, Arguments args) {
/* 113 */     DebugCard$.MODULE$.checkAccess(access());
/* 114 */     return (args.count() > 0) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { new WorldValue((World)DimensionManager.getWorld(args.checkInteger(0)), access())
/* 115 */           })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { new WorldValue(this.host.world(), access()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of all world IDs, loaded and unloaded.")
/*     */   public Object[] getWorlds(Context context, Arguments args) {
/* 120 */     DebugCard$.MODULE$.checkAccess(access());
/* 121 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { DimensionManager.getStaticDimensionIDs() }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(name:string):userdata -- Get the entity of a player.")
/*     */   public Object[] getPlayer(Context context, Arguments args) {
/* 126 */     DebugCard$.MODULE$.checkAccess(access());
/* 127 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { new PlayerValue(args.checkString(0), access()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of currently logged-in players.")
/*     */   public Object[] getPlayers(Context context, Arguments args) {
/* 132 */     DebugCard$.MODULE$.checkAccess(access());
/* 133 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { MinecraftServer.func_71276_C().func_71213_z() }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(x: number, y: number, z: number[, worldId: number]):boolean, string, table -- returns contents at the location in world by id (default host world)")
/*     */   public Object[] scanContentsAt(Context context, Arguments args) {
/* 139 */     DebugCard$.MODULE$.checkAccess(access());
/* 140 */     int x = args.checkInteger(0);
/* 141 */     int y = args.checkInteger(1);
/* 142 */     int z = args.checkInteger(2);
/* 143 */     World worldServer = (args.count() > 3) ? (World)DimensionManager.getWorld(args.checkInteger(3)) : this.host.world();
/* 144 */     World world = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(worldServer).world();
/*     */     
/* 146 */     BlockPosition position = new BlockPosition(x, y, z, scala.Option$.MODULE$.apply(world));
/* 147 */     FakePlayer fakePlayer = FakePlayerFactory.get((WorldServer)world, li.cil.oc.Settings$.MODULE$.get().fakePlayerProfile());
/* 148 */     ((Entity)fakePlayer).field_70165_t = position.x() + 0.5D;
/* 149 */     ((Entity)fakePlayer).field_70163_u = position.y() + 0.5D;
/* 150 */     ((Entity)fakePlayer).field_70161_v = position.z() + 0.5D;
/*     */ 
/*     */     
/* 153 */     boolean bool = false; Some some = null; Option option = scala.Option$.MODULE$.apply(world.func_72857_a(Entity.class, position.bounds(), (Entity)fakePlayer)); if (option instanceof Some) { bool = true; some = (Some)option; Entity living = (Entity)some.x(); if (living instanceof EntityLivingBase) { EntityLivingBase entityLivingBase = (EntityLivingBase)living; return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), "EntityLivingBase", entityLivingBase })); }  }
/* 154 */      if (bool) { Entity minecart = (Entity)some.x(); if (minecart instanceof EntityMinecart) { EntityMinecart entityMinecart = (EntityMinecart)minecart; return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), "EntityMinecart", entityMinecart })); }
/*     */        }
/* 156 */      Block block = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(position);
/* 157 */     int metadata = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getBlockMetadata(position);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     BlockEvent.BreakEvent breakEvent1 = new BlockEvent.BreakEvent(position.x(), position.y(), position.z(), world, block, metadata, (EntityPlayer)fakePlayer);
/* 168 */     MinecraftForge.EVENT_BUS.post((Event)breakEvent1); BlockEvent.BreakEvent event = new BlockEvent.BreakEvent(position.x(), position.y(), position.z(), world, block, metadata, (EntityPlayer)fakePlayer); MinecraftForge.EVENT_BUS.post((Event)event);
/* 169 */     return li.cil.oc.util.ExtendedBlock$.MODULE$.extendedBlock(block).isAir(position) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "air", block })) : ((FluidRegistry.lookupFluidForBlock(block) == null) ? (li.cil.oc.util.ExtendedBlock$.MODULE$.extendedBlock(block).isReplaceable(position) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(breakEvent1.isCanceled()), "replaceable", block
/*     */           
/* 171 */           })) : ((li.cil.oc.util.ExtendedBlock$.MODULE$.extendedBlock(block).getCollisionBoundingBoxFromPool(position) == null) ? 
/* 172 */       package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), "passable", block
/*     */ 
/*     */           
/* 175 */           })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), "solid", block })))) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(event.isCanceled()), "liquid", block })));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(name:string):boolean -- Get whether a mod or API is loaded.")
/*     */   public Object[] isModLoaded(Context context, Arguments args) {
/* 182 */     DebugCard$.MODULE$.checkAccess(access());
/* 183 */     String name = args.checkString(0);
/* 184 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((Loader.isModLoaded(name) || ModAPIManager.INSTANCE.hasAPI(name))) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(command:string):number -- Runs an arbitrary command using a fake player.")
/*     */   public Object[] runCommand(Context context, Arguments args) {
/* 189 */     DebugCard$.MODULE$.checkAccess(access());
/*     */ 
/*     */     
/* 192 */     (new String[1])[0] = args.checkString(0); Iterable commands = args.isTable(0) ? scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable(args.checkTable(0).values()) : (Iterable)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 194 */     synchronized (li$cil$oc$server$component$DebugCard$$CommandSender()) {
/* 195 */       li$cil$oc$server$component$DebugCard$$CommandSender().prepare();
/* 196 */       IntRef value = IntRef.create(0);
/* 197 */       commands.foreach((Function1)new DebugCard$$anonfun$runCommand$1(this, value));
/*     */ 
/*     */       
/* 200 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(value.elem), li$cil$oc$server$component$DebugCard$$CommandSender().messages().orNull(scala.Predef$.MODULE$.$conforms()) }));
/*     */     } 
/*     */   } public final class DebugCard$$anonfun$runCommand$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IntRef value$1; public DebugCard$$anonfun$runCommand$1(DebugCard $outer, IntRef value$1) {} public final void apply(Object command) { this.value$1.elem = MinecraftServer.func_71276_C().func_71187_D().func_71556_a((ICommandSender)this.$outer.li$cil$oc$server$component$DebugCard$$CommandSender(), command.toString()); } }
/*     */   @Callback(doc = "function(x:number, y:number, z:number):boolean -- Add a component block at the specified coordinates to the computer network.")
/*     */   public Object[] connectToBlock(Context context, Arguments args) { Object[] arrayOfObject;
/* 206 */     DebugCard$.MODULE$.checkAccess(access());
/* 207 */     int x = args.checkInteger(0);
/* 208 */     int y = args.checkInteger(1);
/* 209 */     int z = args.checkInteger(2);
/* 210 */     Option<Node> option = li$cil$oc$server$component$DebugCard$$findNode(x, y, z);
/* 211 */     if (option instanceof Some) { Some some = (Some)option; Node other = (Node)some.x();
/* 212 */       li$cil$oc$server$component$DebugCard$$remoteNode().foreach((Function1)new DebugCard$$anonfun$connectToBlock$1(this));
/* 213 */       li$cil$oc$server$component$DebugCard$$remoteNode_$eq((Option<Node>)new Some(other));
/* 214 */       li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq((Option<Tuple3<Object, Object, Object>>)new Some(new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z))));
/* 215 */       node().connect(other);
/* 216 */       arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); }
/*     */     else
/* 218 */     { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no node found at this position" })); }
/*     */     
/*     */     return arrayOfObject; } public final class DebugCard$$anonfun$connectToBlock$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(Node other) { this.$outer.node().disconnect(other); }
/*     */     public DebugCard$$anonfun$connectToBlock$1(DebugCard $outer) {} }
/*     */   public Option<Node> li$cil$oc$server$component$DebugCard$$findNode(int x, int y, int z) { scala.None$ none$;
/* 224 */     TileEntity tileEntity = this.host.world().func_147438_o(x, y, z);
/* 225 */     if (tileEntity instanceof SidedEnvironment) { TileEntity tileEntity1 = tileEntity; Option option = scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$1(this, tileEntity1), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Node.class)))).find((Function1)new DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$2(this)); }
/* 226 */     else if (tileEntity instanceof Environment) { TileEntity tileEntity1 = tileEntity; Option option = scala.Option$.MODULE$.apply(((Environment)tileEntity1).node()); }
/* 227 */     else { none$ = scala.None$.MODULE$; }
/*     */ 
/*     */     
/* 230 */     return this.host.world().func_72899_e(x, y, z) ? (Option<Node>)none$ : (Option<Node>)scala.None$.MODULE$; } public final class DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$1 extends AbstractFunction1<ForgeDirection, Node> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final Node apply(ForgeDirection x$1) { return ((SidedEnvironment)this.x2$1).sidedNode(x$1); } public DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$1(DebugCard $outer, TileEntity x2$1) {} } public final class DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$2 extends AbstractFunction1<Node, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Node x$2) { return !(x$2 == null); }
/*     */     public DebugCard$$anonfun$li$cil$oc$server$component$DebugCard$$findNode$2(DebugCard $outer) {} }
/* 234 */   @Callback(doc = "function():userdata -- Test method for user-data and general value conversion.") public Object[] test(Context context, Arguments args) { DebugCard$.MODULE$.checkAccess(access());
/*     */     
/* 236 */     (new Tuple2[2])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("a"), BoxesRunTime.boxToBoolean(true)); (new Tuple2[2])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("b"), "test"); Map v1 = (Map)scala.collection.mutable.Map$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2]));
/* 237 */     (new Tuple2[2])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(10)), "zxc"); (new Tuple2[2])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToBoolean(false)), v1); Map v2 = (Map)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2]));
/* 238 */     v1.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("c"), v2));
/*     */     
/* 240 */     return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { v2, new TestValue(), this.host.world() })); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(player:string, text:string) -- Sends text to the specified player's clipboard if possible.")
/*     */   public Object[] sendToClipboard(Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/* 247 */     DebugCard$.MODULE$.checkAccess(access());
/* 248 */     Option option = scala.Option$.MODULE$.apply(MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(args.checkString(0)));
/* 249 */     if (option instanceof Some) { Some some = (Some)option; EntityPlayerMP player = (EntityPlayerMP)some.x();
/* 250 */       li.cil.oc.server.PacketSender$.MODULE$.sendClipboard(player, args.checkString(1));
/* 251 */       arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); }
/*     */     else
/* 253 */     { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "no such player" })); }
/*     */     
/*     */     return arrayOfObject;
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(address:string, data...) -- Sends data to the debug card with the specified address.")
/* 259 */   public Object[] sendToDebugCard(Context context, Arguments args) { DebugCard$.MODULE$.checkAccess(access());
/* 260 */     String destination = args.checkString(0);
/* 261 */     li.cil.oc.server.network.DebugNetwork$.MODULE$.getEndpoint(destination).filter((Function1)new DebugCard$$anonfun$sendToDebugCard$1(this)).foreach((Function1)new DebugCard$$anonfun$sendToDebugCard$2(this, args, destination));
/*     */ 
/*     */ 
/*     */     
/* 265 */     return package$.MODULE$.result((Seq<Object>)scala.collection.immutable.Nil$.MODULE$); } public final class DebugCard$$anonfun$sendToDebugCard$1 extends AbstractFunction1<DebugNetwork.DebugNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(DebugNetwork.DebugNode x$3) { DebugCard debugCard = this.$outer; if (x$3 == null) { if (debugCard != null); } else if (x$3.equals(debugCard)) {  }  } public DebugCard$$anonfun$sendToDebugCard$1(DebugCard $outer) {} } public final class DebugCard$$anonfun$sendToDebugCard$2 extends AbstractFunction1<DebugNetwork.DebugNode, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Arguments args$1; private final String destination$1; public DebugCard$$anonfun$sendToDebugCard$2(DebugCard $outer, Arguments args$1, String destination$1) {}
/*     */     public final void apply(DebugNetwork.DebugNode endpoint) { Packet packet = Network.newPacket(this.$outer.node().address(), this.destination$1, 0, (Object[])((TraversableOnce)scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)this.args$1).drop(1)).toArray(scala.reflect.ClassTag$.MODULE$.Object())); endpoint.receivePacket(packet); } }
/* 269 */   public void receivePacket(Packet packet) { int distance = 0;
/* 270 */     node().sendToReachable("computer.signal", (Object[])((TraversableOnce)((TraversableLike)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { "debug_message", packet.source(), BoxesRunTime.boxToInteger(packet.port()), BoxesRunTime.boxToDouble(distance) }))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps(packet.data()), scala.collection.Seq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.Object())); }
/*     */   
/*     */   public String address() {
/* 273 */     return (node() == null) ? "debug" : node().address();
/*     */   }
/*     */   
/*     */   public void onConnect(Node node)
/*     */   {
/* 278 */     super.onConnect(node);
/* 279 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 280 */       { li.cil.oc.server.network.DebugNetwork$.MODULE$.add(this);
/* 281 */         li$cil$oc$server$component$DebugCard$$remoteNodePosition().foreach((Function1)new DebugCard$$anonfun$onConnect$1(this, node)); return; }  return; }  li.cil.oc.server.network.DebugNetwork$.MODULE$.add(this); li$cil$oc$server$component$DebugCard$$remoteNodePosition().foreach((Function1)new DebugCard$$anonfun$onConnect$1(this, node)); } public final class DebugCard$$anonfun$onConnect$1 extends AbstractFunction1<Tuple3<Object, Object, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$1; public final void apply(Tuple3 x0$1) { Tuple3 tuple3 = x0$1; if (tuple3 != null) {
/* 282 */         int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3());
/* 283 */         this.$outer.li$cil$oc$server$component$DebugCard$$remoteNode_$eq(this.$outer.li$cil$oc$server$component$DebugCard$$findNode(x, y, z));
/* 284 */         Option<Node> option = this.$outer.li$cil$oc$server$component$DebugCard$$remoteNode();
/* 285 */         if (option instanceof Some) { Some some = (Some)option; Node other = (Node)some.x(); this.node$1.connect(other); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 286 */         else { this.$outer.li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq((Option<Tuple3<Object, Object, Object>>)scala.None$.MODULE$); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */         
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple3); }
/*     */      public DebugCard$$anonfun$onConnect$1(DebugCard $outer, Node node$1) {} }
/* 293 */   public void onDisconnect(Node node) { super.onDisconnect(node);
/* 294 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null)
/*     */       {
/*     */ 
/*     */         
/* 298 */         if (li$cil$oc$server$component$DebugCard$$remoteNode().contains(node))
/* 299 */         { li$cil$oc$server$component$DebugCard$$remoteNode_$eq((Option<Node>)scala.None$.MODULE$);
/* 300 */           li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq((Option<Tuple3<Object, Object, Object>>)scala.None$.MODULE$); }  }  } else { if (node.equals(componentConnector)) { li.cil.oc.server.network.DebugNetwork$.MODULE$.remove(this); li$cil$oc$server$component$DebugCard$$remoteNode().foreach((Function1)new DebugCard$$anonfun$onDisconnect$1(this, node)); return; }  if (li$cil$oc$server$component$DebugCard$$remoteNode().contains(node)) { li$cil$oc$server$component$DebugCard$$remoteNode_$eq((Option<Node>)scala.None$.MODULE$); li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq((Option<Tuple3<Object, Object, Object>>)scala.None$.MODULE$); }
/*     */        }
/*     */     
/*     */     li.cil.oc.server.network.DebugNetwork$.MODULE$.remove(this);
/*     */     li$cil$oc$server$component$DebugCard$$remoteNode().foreach((Function1)new DebugCard$$anonfun$onDisconnect$1(this, node)); } public final class DebugCard$$anonfun$onDisconnect$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Node node$2; public final void apply(Node other) { other.disconnect(this.node$2); } public DebugCard$$anonfun$onDisconnect$1(DebugCard $outer, Node node$2) {} }
/*     */   public void load(NBTTagCompound nbt) {
/* 307 */     super.load(nbt);
/* 308 */     access_$eq(AccessContext$.MODULE$.load(nbt));
/* 309 */     if (nbt.func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteX").toString())) {
/* 310 */       int x = nbt.func_74762_e((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteX").toString());
/* 311 */       int y = nbt.func_74762_e((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteY").toString());
/* 312 */       int z = nbt.func_74762_e((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteZ").toString());
/* 313 */       li$cil$oc$server$component$DebugCard$$remoteNodePosition_$eq((Option<Tuple3<Object, Object, Object>>)new Some(new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 318 */     super.save(nbt);
/* 319 */     access().foreach((Function1)new DebugCard$$anonfun$save$1(this, nbt));
/* 320 */     li$cil$oc$server$component$DebugCard$$remoteNodePosition().foreach((Function1)new DebugCard$$anonfun$save$2(this, nbt)); } public static void checkAccess(Option<AccessContext> paramOption) { DebugCard$.MODULE$.checkAccess(paramOption); } public DebugCard(EnvironmentHost host) {} public final class DebugCard$$anonfun$save$1 extends AbstractFunction1<AccessContext, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(DebugCard.AccessContext x$4) { x$4.save(this.nbt$1); } public DebugCard$$anonfun$save$1(DebugCard $outer, NBTTagCompound nbt$1) {} } public final class DebugCard$$anonfun$save$2 extends AbstractFunction1<Tuple3<Object, Object, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(Tuple3 x0$2) { Tuple3 tuple3 = x0$2; if (tuple3 != null) {
/* 321 */         int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3());
/* 322 */         this.nbt$1.func_74768_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteX").toString(), x);
/* 323 */         this.nbt$1.func_74768_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteY").toString(), y);
/* 324 */         this.nbt$1.func_74768_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("remoteZ").toString(), z); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple3); }
/*     */     
/*     */     public DebugCard$$anonfun$save$2(DebugCard $outer, NBTTagCompound nbt$1) {} }
/*     */   
/*     */   public static class AccessContext$ implements Serializable { public static final AccessContext$ MODULE$;
/*     */     
/*     */     private Object readResolve() {
/* 334 */       return MODULE$;
/*     */     } public void remove(NBTTagCompound nbt) {
/* 336 */       nbt.func_82580_o((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("player").toString());
/* 337 */       nbt.func_82580_o((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("accessNonce").toString());
/*     */     }
/*     */     
/*     */     public Option<DebugCard.AccessContext> load(NBTTagCompound nbt) {
/* 341 */       if (nbt.func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("player").toString())) {  } else {  }  return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 347 */         (Option<DebugCard.AccessContext>)scala.None$.MODULE$;
/*     */     }
/*     */     
/*     */     public DebugCard.AccessContext apply(String player, String nonce) {
/* 351 */       return new DebugCard.AccessContext(player, nonce); } public Option<Tuple2<String, String>> unapply(DebugCard.AccessContext x$0) { return (x$0 == null) ? (Option<Tuple2<String, String>>)scala.None$.MODULE$ : (Option<Tuple2<String, String>>)new Some(new Tuple2(x$0.player(), x$0.nonce())); } public AccessContext$() { MODULE$ = this; } } public static class AccessContext implements Product, Serializable { private final String player; private final String nonce; public String player() { return this.player; } public String nonce() { return this.nonce; } public AccessContext copy(String player, String nonce) { return new AccessContext(player, nonce); } public String copy$default$1() { return player(); } public String copy$default$2() { return nonce(); } public String productPrefix() { return "AccessContext"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return player(); } public Iterator<Object> productIterator() { return scala.runtime.ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof AccessContext; } public int hashCode() { return scala.runtime.ScalaRunTime$.MODULE$._hashCode(this); } public String toString() { return scala.runtime.ScalaRunTime$.MODULE$._toString(this); } public boolean equals(Object x$1) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: if_acmpeq -> 112
/*     */       //   5: aload_1
/*     */       //   6: astore_2
/*     */       //   7: aload_2
/*     */       //   8: instanceof li/cil/oc/server/component/DebugCard$AccessContext
/*     */       //   11: ifeq -> 19
/*     */       //   14: iconst_1
/*     */       //   15: istore_3
/*     */       //   16: goto -> 21
/*     */       //   19: iconst_0
/*     */       //   20: istore_3
/*     */       //   21: iload_3
/*     */       //   22: ifeq -> 116
/*     */       //   25: aload_1
/*     */       //   26: checkcast li/cil/oc/server/component/DebugCard$AccessContext
/*     */       //   29: astore #4
/*     */       //   31: aload_0
/*     */       //   32: invokevirtual player : ()Ljava/lang/String;
/*     */       //   35: aload #4
/*     */       //   37: invokevirtual player : ()Ljava/lang/String;
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
/*     */       //   64: invokevirtual nonce : ()Ljava/lang/String;
/*     */       //   67: aload #4
/*     */       //   69: invokevirtual nonce : ()Ljava/lang/String;
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
/*     */       //   #351	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	118	0	this	Lli/cil/oc/server/component/DebugCard$AccessContext;
/* 351 */       //   0	118	1	x$1	Ljava/lang/Object; } public AccessContext(String player, String nonce) { Product.class.$init$(this); }
/*     */      public void save(NBTTagCompound nbt) {
/* 353 */       nbt.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("player").toString(), player());
/* 354 */       nbt.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("accessNonce").toString(), nonce());
/*     */     } }
/*     */   public static class PlayerValue extends AbstractValue { private String name; private Option<DebugCard.AccessContext> ctx;
/*     */     
/* 358 */     public String name() { return this.name; } public void name_$eq(String x$1) { this.name = x$1; } public Option<DebugCard.AccessContext> ctx() { return this.ctx; } public void ctx_$eq(Option<DebugCard.AccessContext> x$1) { this.ctx = x$1; } public PlayerValue(String name, Option<DebugCard.AccessContext> ctx) {} public PlayerValue() {
/* 359 */       this("", (Option<DebugCard.AccessContext>)scala.None$.MODULE$);
/*     */     }
/*     */     
/*     */     public Object[] withPlayer(Function1 f) {
/*     */       Object[] arrayOfObject;
/* 364 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 365 */       EntityPlayerMP entityPlayerMP = MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(name());
/* 366 */       if (entityPlayerMP != null) { EntityPlayerMP entityPlayerMP1 = entityPlayerMP; arrayOfObject = (Object[])f.apply(entityPlayerMP1); }
/* 367 */       else { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "player is offline" })); }
/*     */       
/*     */       return arrayOfObject;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():userdata -- Get the player's world object.")
/* 373 */     public Object[] getWorld(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$getWorld$1(this)); } public final class DebugCard$PlayerValue$$anonfun$getWorld$1 extends AbstractFunction1<EntityPlayerMP, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(EntityPlayerMP player) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { new DebugCard.WorldValue(player.func_130014_f_(), this.$outer.ctx()) })); }
/*     */       
/*     */       public DebugCard$PlayerValue$$anonfun$getWorld$1(DebugCard.PlayerValue $outer) {} }
/*     */     
/*     */     @Callback(doc = "function():string -- Get the player's game type.")
/* 378 */     public Object[] getGameType(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$getGameType$1(this)); } public final class DebugCard$PlayerValue$$anonfun$getGameType$1 extends AbstractFunction1<EntityPlayerMP, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(EntityPlayerMP player) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { player.field_71134_c.func_73081_b().func_77149_b() })); }
/*     */       
/*     */       public DebugCard$PlayerValue$$anonfun$getGameType$1(DebugCard.PlayerValue $outer) {} }
/*     */     @Callback(doc = "function(gametype:string) -- Set the player's game type (survival, creative, adventure).")
/* 382 */     public Object[] setGameType(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$setGameType$1(this, args)); } public final class DebugCard$PlayerValue$$anonfun$setGameType$1 extends AbstractFunction1<EntityPlayerMP, scala.runtime.Null$> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$2; public DebugCard$PlayerValue$$anonfun$setGameType$1(DebugCard.PlayerValue $outer, Arguments args$2) {}
/* 383 */       public final scala.runtime.Null$ apply(EntityPlayerMP player) { String gametype = this.args$2.checkString(0);
/* 384 */         player.func_71033_a((WorldSettings.GameType)scala.Predef$.MODULE$.refArrayOps((Object[])WorldSettings.GameType.values()).find((Function1)new DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$1(this, gametype)).getOrElse((Function0)new DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$2(this)));
/* 385 */         return null; } public final class DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$1 extends AbstractFunction1<WorldSettings.GameType, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final String gametype$1; public final boolean apply(WorldSettings.GameType x$5) { String str = this.gametype$1; if (x$5.func_77149_b() == null) { x$5.func_77149_b(); if (str != null); } else if (x$5.func_77149_b().equals(str)) {  }
/*     */            } public DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$1(DebugCard$PlayerValue$$anonfun$setGameType$1 $outer, String gametype$1) {} } public final class DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$2 extends AbstractFunction0<WorldSettings.GameType> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public final WorldSettings.GameType apply() { return WorldSettings.GameType.SURVIVAL; }
/*     */         public DebugCard$PlayerValue$$anonfun$setGameType$1$$anonfun$apply$2(DebugCard$PlayerValue$$anonfun$setGameType$1 $outer) {} } }
/* 390 */     @Callback(doc = "function():number, number, number -- Get the player's position.") public Object[] getPosition(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$getPosition$1(this)); } public final class DebugCard$PlayerValue$$anonfun$getPosition$1 extends AbstractFunction1<EntityPlayerMP, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(EntityPlayerMP player) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(player.field_70165_t), BoxesRunTime.boxToDouble(player.field_70163_u), BoxesRunTime.boxToDouble(player.field_70161_v) })); }
/*     */       
/*     */       public DebugCard$PlayerValue$$anonfun$getPosition$1(DebugCard.PlayerValue $outer) {} }
/*     */     @Callback(doc = "function(x:number, y:number, z:number) -- Set the player's position.")
/* 394 */     public Object[] setPosition(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$setPosition$1(this, args)); } public final class DebugCard$PlayerValue$$anonfun$setPosition$1 extends AbstractFunction1<EntityPlayerMP, scala.runtime.Null$> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$3; public DebugCard$PlayerValue$$anonfun$setPosition$1(DebugCard.PlayerValue $outer, Arguments args$3) {} public final scala.runtime.Null$ apply(EntityPlayerMP player) {
/* 395 */         player.func_70634_a(this.args$3.checkDouble(0), this.args$3.checkDouble(1), this.args$3.checkDouble(2));
/* 396 */         return null;
/*     */       } }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Get the player's health.")
/* 401 */     public Object[] getHealth(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$getHealth$1(this)); } public final class DebugCard$PlayerValue$$anonfun$getHealth$1 extends AbstractFunction1<EntityPlayerMP, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(EntityPlayerMP player) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(player.func_110143_aJ()) })); }
/*     */       
/*     */       public DebugCard$PlayerValue$$anonfun$getHealth$1(DebugCard.PlayerValue $outer) {} }
/*     */     @Callback(doc = "function():number -- Get the player's max health.")
/* 405 */     public Object[] getMaxHealth(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$getMaxHealth$1(this)); } public final class DebugCard$PlayerValue$$anonfun$getMaxHealth$1 extends AbstractFunction1<EntityPlayerMP, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(EntityPlayerMP player) { return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(player.func_110138_aP()) })); }
/*     */       
/*     */       public DebugCard$PlayerValue$$anonfun$getMaxHealth$1(DebugCard.PlayerValue $outer) {} }
/*     */     @Callback(doc = "function(health:number) -- Set the player's health.")
/* 409 */     public Object[] setHealth(Context context, Arguments args) { return withPlayer((Function1<EntityPlayerMP, Object[]>)new DebugCard$PlayerValue$$anonfun$setHealth$1(this, args)); } public final class DebugCard$PlayerValue$$anonfun$setHealth$1 extends AbstractFunction1<EntityPlayerMP, scala.runtime.Null$> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$4; public DebugCard$PlayerValue$$anonfun$setHealth$1(DebugCard.PlayerValue $outer, Arguments args$4) {} public final scala.runtime.Null$ apply(EntityPlayerMP player) {
/* 410 */         player.func_70606_j((float)this.args$4.checkDouble(0));
/* 411 */         return null;
/*     */       } }
/*     */ 
/*     */ 
/*     */     
/*     */     public void load(NBTTagCompound nbt) {
/* 417 */       super.load(nbt);
/* 418 */       ctx_$eq(DebugCard.AccessContext$.MODULE$.load(nbt));
/* 419 */       name_$eq(nbt.func_74779_i("name"));
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 423 */       super.save(nbt);
/* 424 */       ctx().foreach((Function1)new DebugCard$PlayerValue$$anonfun$save$3(this, nbt));
/* 425 */       nbt.func_74778_a("name", name());
/*     */     } public final class DebugCard$PlayerValue$$anonfun$save$3 extends AbstractFunction1<DebugCard.AccessContext, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(DebugCard.AccessContext x$6) {
/*     */         x$6.save(this.nbt$2);
/* 429 */       } public DebugCard$PlayerValue$$anonfun$save$3(DebugCard.PlayerValue $outer, NBTTagCompound nbt$2) {} } } public static class WorldValue extends AbstractValue { private World world; private Option<DebugCard.AccessContext> ctx; public World world() { return this.world; } public void world_$eq(World x$1) { this.world = x$1; } public Option<DebugCard.AccessContext> ctx() { return this.ctx; } public void ctx_$eq(Option<DebugCard.AccessContext> x$1) { this.ctx = x$1; } public WorldValue(World world, Option<DebugCard.AccessContext> ctx) {} public WorldValue() {
/* 430 */       this(null, (Option<DebugCard.AccessContext>)scala.None$.MODULE$);
/*     */     }
/*     */ 
/*     */     
/*     */     @Callback(doc = "function():number -- Gets the numeric id of the current dimension.")
/*     */     public Object[] getDimensionId(Context context, Arguments args) {
/* 436 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 437 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger((world()).field_73011_w.field_76574_g) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():string -- Gets the name of the current dimension.")
/*     */     public Object[] getDimensionName(Context context, Arguments args) {
/* 442 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 443 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { (world()).field_73011_w.func_80007_l() }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Gets the seed of the world.")
/*     */     public Object[] getSeed(Context context, Arguments args) {
/* 448 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 449 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(world().func_72905_C()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Returns whether it is currently raining.")
/*     */     public Object[] isRaining(Context context, Arguments args) {
/* 454 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 455 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(world().func_72896_J()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(value:boolean) -- Sets whether it is currently raining.")
/*     */     public Object[] setRaining(Context context, Arguments args) {
/* 460 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 461 */       world().func_72912_H().func_76084_b(args.checkBoolean(0));
/* 462 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Returns whether it is currently thundering.")
/*     */     public Object[] isThundering(Context context, Arguments args) {
/* 467 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 468 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(world().func_72911_I()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(value:boolean) -- Sets whether it is currently thundering.")
/*     */     public Object[] setThundering(Context context, Arguments args) {
/* 473 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 474 */       world().func_72912_H().func_76069_a(args.checkBoolean(0));
/* 475 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number -- Get the current world time.")
/*     */     public Object[] getTime(Context context, Arguments args) {
/* 480 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 481 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(world().func_72820_D()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(value:number) -- Set the current world time.")
/*     */     public Object[] setTime(Context context, Arguments args) {
/* 486 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 487 */       world().func_72877_b((long)args.checkDouble(0));
/* 488 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():number, number, number -- Get the current spawn point coordinates.")
/*     */     public Object[] getSpawnPoint(Context context, Arguments args) {
/* 493 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 494 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(world().func_72912_H().func_76079_c()), BoxesRunTime.boxToInteger(world().func_72912_H().func_76075_d()), BoxesRunTime.boxToInteger(world().func_72912_H().func_76074_e()) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number) -- Set the spawn point coordinates.")
/*     */     public Object[] setSpawnPoint(Context context, Arguments args) {
/* 499 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 500 */       world().func_72912_H().func_76081_a(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2));
/* 501 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number, sound:string, range:number) -- Play a sound at the specified coordinates.")
/*     */     public Object[] playSoundAt(Context context, Arguments args) {
/* 506 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 507 */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(0)), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); if (tuple3 != null) { int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 508 */         String sound = args.checkString(3);
/* 509 */         int range = args.checkInteger(4);
/* 510 */         world().func_72908_a(i, j, k, sound, (range / 15) + 0.5F, 1.0F);
/* 511 */         return null; }
/*     */       
/*     */       throw new MatchError(tuple3);
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Get the ID of the block at the specified coordinates.")
/*     */     public Object[] getBlockId(Context context, Arguments args) {
/* 518 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 519 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Block.func_149682_b(world().func_147439_a(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2)))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Get the metadata of the block at the specified coordinates.")
/*     */     public Object[] getMetadata(Context context, Arguments args) {
/* 524 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 525 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(world().func_72805_g(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Check whether the block at the specified coordinates is loaded.")
/*     */     public Object[] isLoaded(Context context, Arguments args) {
/* 530 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 531 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(world().func_72899_e(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Check whether the block at the specified coordinates has a tile entity.")
/*     */     public Object[] hasTileEntity(Context context, Arguments args) {
/* 536 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 537 */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(0)), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); if (tuple3 != null) { int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 538 */         Block block = world().func_147439_a(i, j, k);
/* 539 */         return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((block != null && block.hasTileEntity(world().func_72805_g(i, j, k)))) })); }
/*     */       
/*     */       throw new MatchError(tuple3);
/*     */     }
/*     */     @Callback(doc = "function(x:number, y:number, z:number):table -- Get the NBT of the block at the specified coordinates.")
/* 544 */     public Object[] getTileNBT(Context context, Arguments args) { DebugCard$.MODULE$.checkAccess(ctx());
/* 545 */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(0)), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); if (tuple3 != null) { Object[] arrayOfObject; int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 546 */         TileEntity tileEntity = world().func_147438_o(i, j, k);
/* 547 */         if (tileEntity != null) { TileEntity tileEntity1 = tileEntity; arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTBase((NBTBase)li.cil.oc.util.ExtendedNBT$.MODULE$.toNbt((Function1)new DebugCard$WorldValue$$anonfun$getTileNBT$1(this, tileEntity1))).toTypedMap() })); }
/* 548 */         else { arrayOfObject = null; }
/*     */         
/*     */         return arrayOfObject; }
/*     */       
/*     */       throw new MatchError(tuple3); } public final class DebugCard$WorldValue$$anonfun$getTileNBT$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final TileEntity x2$2; public final void apply(NBTTagCompound x$1) { this.x2$2.func_145841_b(x$1); } public DebugCard$WorldValue$$anonfun$getTileNBT$1(DebugCard.WorldValue $outer, TileEntity x2$2) {} }
/* 554 */     @Callback(doc = "function(x:number, y:number, z:number, nbt:table):boolean -- Set the NBT of the block at the specified coordinates.") public Object[] setTileNBT(Context context, Arguments args) { DebugCard$.MODULE$.checkAccess(ctx());
/* 555 */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(0)), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); if (tuple3 != null) { Object[] arrayOfObject; int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 556 */         TileEntity tileEntity = world().func_147438_o(i, j, k);
/* 557 */         if (tileEntity != null) { Object[] arrayOfObject1; TileEntity tileEntity1 = tileEntity;
/* 558 */           NBTBase nBTBase = li.cil.oc.util.ExtendedNBT$.MODULE$.typedMapToNbt(scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(args.checkTable(3)).toMap(scala.Predef$.MODULE$.$conforms()));
/* 559 */           if (nBTBase instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)nBTBase;
/* 560 */             tileEntity1.func_145839_a(nBTTagCompound);
/* 561 */             tileEntity1.func_70296_d();
/* 562 */             world().func_147471_g(i, j, k);
/* 563 */             arrayOfObject1 = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); }
/* 564 */           else { (new Object[2])[0] = scala.Unit$.MODULE$; (new String[2])[0] = "nbt tag compound expected, got '"; (new String[2])[1] = "'"; arrayOfObject1 = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { null, (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { NBTBase.field_82578_b[nBTBase.func_74732_a()] })) })); }
/*     */            arrayOfObject = arrayOfObject1; }
/* 566 */         else { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no tile entity" })); }
/*     */         
/*     */         return arrayOfObject; }
/*     */       
/*     */       throw new MatchError(tuple3); } @Callback(doc = "function(x:number, y:number, z:number):number -- Get the light opacity of the block at the specified coordinates.")
/*     */     public Object[] getLightOpacity(Context context, Arguments args) {
/* 572 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 573 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(world().getBlockLightOpacity(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Get the light value (emission) of the block at the specified coordinates.")
/*     */     public Object[] getLightValue(Context context, Arguments args) {
/* 578 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 579 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(world().func_72957_l(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number):number -- Get whether the block at the specified coordinates is directly under the sky.")
/*     */     public Object[] canSeeSky(Context context, Arguments args) {
/* 584 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 585 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(world().func_72937_j(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2))) }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(x:number, y:number, z:number, id:number or string, meta:number):number -- Set the block at the specified coordinates.")
/*     */     public Object[] setBlock(Context context, Arguments args) {
/* 590 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 591 */       Block block = args.isInteger(3) ? Block.func_149729_e(args.checkInteger(3)) : Block.func_149684_b(args.checkString(3));
/* 592 */       int metadata = args.checkInteger(4);
/* 593 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(world().func_147465_d(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2), block, metadata, 3)) }));
/*     */     }
/*     */     public final class DebugCard$WorldValue$$anonfun$setBlocks$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int yMin$1; public final int zMin$1; private final int yMax$1; public final int zMax$1; public final Block block$1; public final int metadata$1; public final void apply(int x) { apply$mcVI$sp(x); } public DebugCard$WorldValue$$anonfun$setBlocks$1(DebugCard.WorldValue $outer, int yMin$1, int zMin$1, int yMax$1, int zMax$1, Block block$1, int metadata$1) {} public void apply$mcVI$sp(int x) { scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(scala.math.package$.MODULE$.min(this.yMin$1, this.yMax$1)), scala.math.package$.MODULE$.max(this.yMin$1, this.yMax$1)).foreach$mVc$sp((Function1)new DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public final int x$15; public final void apply(int y) { apply$mcVI$sp(y); } public DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1(DebugCard$WorldValue$$anonfun$setBlocks$1 $outer, int x$15) {} public void apply$mcVI$sp(int y) { scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(scala.math.package$.MODULE$.min(this.$outer.zMin$1, this.$outer.zMax$1)), scala.math.package$.MODULE$.max(this.$outer.zMin$1, this.$outer.zMax$1)).foreach((Function1)new DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, y)); } public final class DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcZI.sp implements Serializable {
/* 598 */           public static final long serialVersionUID = 0L; private final int y$1; public final boolean apply(int z) { return apply$mcZI$sp(z); } public DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(DebugCard$WorldValue$$anonfun$setBlocks$1$$anonfun$apply$mcVI$sp$1 $outer, int y$1) {} public boolean apply$mcZI$sp(int z) { return this.$outer.li$cil$oc$server$component$DebugCard$WorldValue$$anonfun$$anonfun$$$outer().li$cil$oc$server$component$DebugCard$WorldValue$$anonfun$$$outer().world().func_147465_d(this.$outer.x$15, this.y$1, z, (this.$outer.li$cil$oc$server$component$DebugCard$WorldValue$$anonfun$$anonfun$$$outer()).block$1, (this.$outer.li$cil$oc$server$component$DebugCard$WorldValue$$anonfun$$anonfun$$$outer()).metadata$1, 3); } } } } @Callback(doc = "function(x1:number, y1:number, z1:number, x2:number, y2:number, z2:number, id:number or string, meta:number):number -- Set all blocks in the area defined by the two corner points (x1, y1, z1) and (x2, y2, z2).") public Object[] setBlocks(Context context, Arguments args) { DebugCard$.MODULE$.checkAccess(ctx());
/* 599 */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(0)), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); if (tuple3 != null) { int xMin = BoxesRunTime.unboxToInt(tuple3._1()), yMin = BoxesRunTime.unboxToInt(tuple3._2()), zMin = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(xMin), BoxesRunTime.boxToInteger(yMin), BoxesRunTime.boxToInteger(zMin)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 600 */         Tuple3 tuple33 = new Tuple3(BoxesRunTime.boxToInteger(args.checkInteger(3)), BoxesRunTime.boxToInteger(args.checkInteger(4)), BoxesRunTime.boxToInteger(args.checkInteger(5))); if (tuple33 != null) { int xMax = BoxesRunTime.unboxToInt(tuple33._1()), yMax = BoxesRunTime.unboxToInt(tuple33._2()), zMax = BoxesRunTime.unboxToInt(tuple33._3()); Tuple3 tuple35 = new Tuple3(BoxesRunTime.boxToInteger(xMax), BoxesRunTime.boxToInteger(yMax), BoxesRunTime.boxToInteger(zMax)), tuple34 = tuple35; int m = BoxesRunTime.unboxToInt(tuple34._1()), n = BoxesRunTime.unboxToInt(tuple34._2()), i1 = BoxesRunTime.unboxToInt(tuple34._3());
/* 601 */           Block block = args.isInteger(6) ? Block.func_149729_e(args.checkInteger(6)) : Block.func_149684_b(args.checkString(6));
/* 602 */           int metadata = args.checkInteger(7); scala.runtime.RichInt$.MODULE$
/* 603 */             .to$extension0(scala.Predef$.MODULE$.intWrapper(scala.math.package$.MODULE$.min(i, m)), scala.math.package$.MODULE$.max(i, m)).foreach$mVc$sp((Function1)new DebugCard$WorldValue$$anonfun$setBlocks$1(this, j, k, n, i1, block, metadata));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 610 */           return null; }
/*     */         
/*     */         throw new MatchError(tuple33); }
/*     */       
/*     */       throw new MatchError(tuple3); } @Callback(doc = "function(id:string, count:number, damage:number, nbt:string, x:number, y:number, z:number, side:number):boolean - Insert an item stack into the inventory at the specified location. NBT tag is expected in JSON format.")
/*     */     public Object[] insertItem(Context context, Arguments args) {
/*     */       Object[] arrayOfObject;
/* 617 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 618 */       Item item = (Item)Item.field_150901_e.func_82594_a(args.checkString(0));
/* 619 */       if (item == null) {
/* 620 */         throw new IllegalArgumentException("invalid item id");
/*     */       }
/* 622 */       int count = args.checkInteger(1);
/* 623 */       int damage = args.checkInteger(2);
/* 624 */       String tagJson = args.optString(3, "");
/* 625 */       NBTTagCompound tag = Strings.isNullOrEmpty(tagJson) ? null : (NBTTagCompound)JsonToNBT.func_150315_a(tagJson);
/* 626 */       BlockPosition position = li.cil.oc.util.BlockPosition$.MODULE$.apply(args.checkDouble(4), args.checkDouble(5), args.checkDouble(6), world());
/* 627 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(7);
/* 628 */       Option option = li.cil.oc.util.InventoryUtils$.MODULE$.inventoryAt(position);
/* 629 */       if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x();
/* 630 */         ItemStack stack = new ItemStack(item, count, damage);
/* 631 */         stack.func_77982_d(tag);
/* 632 */         boolean res = li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory(stack, inventory, scala.Option$.MODULE$.apply(side), count, li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory$default$5(), li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/*     */ 
/*     */ 
/*     */         
/* 636 */         int stored = count - stack.field_77994_a;
/* 637 */         while (stored > 0 && stack.field_77994_a > 0) {
/* 638 */           count = stack.field_77994_a;
/*     */ 
/*     */ 
/*     */           
/* 642 */           if (li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory(stack, inventory, scala.Option$.MODULE$.apply(side), count, li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory$default$5(), li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventory$default$6())) {
/*     */             
/* 644 */             stored = count - stack.field_77994_a; continue;
/*     */           }  return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/* 646 */         }  arrayOfObject = res ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(res) })); }
/*     */       else
/* 648 */       { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no inventory" })); }
/*     */       
/*     */       return arrayOfObject;
/*     */     } @Callback(doc = "function(x:number, y:number, z:number, slot:number[, count:number]):number - Reduce the size of an item stack in the inventory at the specified location.")
/*     */     public Object[] removeItem(Context context, Arguments args) {
/*     */       Object[] arrayOfObject;
/* 654 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 655 */       BlockPosition position = li.cil.oc.util.BlockPosition$.MODULE$.apply(args.checkDouble(0), args.checkDouble(1), args.checkDouble(2), world());
/* 656 */       Option option = li.cil.oc.util.InventoryUtils$.MODULE$.inventoryAt(position);
/* 657 */       if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x();
/* 658 */         int slot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(inventory, 3);
/* 659 */         int count = args.optInteger(4, inventory.func_70297_j_());
/* 660 */         ItemStack removed = inventory.func_70298_a(slot, count);
/* 661 */         arrayOfObject = (removed == null) ? package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0)
/* 662 */               })) : package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(removed.field_77994_a) })); }
/* 663 */       else { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no inventory" })); }
/*     */       
/*     */       return arrayOfObject;
/*     */     } @Callback(doc = "function(id:string, amount:number, x:number, y:number, z:number, side:number):boolean - Insert some fluid into the tank at the specified location.")
/*     */     public Object[] insertFluid(Context context, Arguments args) {
/*     */       Object[] arrayOfObject;
/* 669 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 670 */       Fluid fluid = FluidRegistry.getFluid(args.checkString(0));
/* 671 */       if (fluid == null) {
/* 672 */         throw new IllegalArgumentException("invalid fluid id");
/*     */       }
/* 674 */       int amount = args.checkInteger(1);
/* 675 */       BlockPosition position = li.cil.oc.util.BlockPosition$.MODULE$.apply(args.checkDouble(2), args.checkDouble(3), args.checkDouble(4), world());
/* 676 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(5);
/* 677 */       TileEntity tileEntity = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world()).getTileEntity(position);
/* 678 */       if (tileEntity instanceof IFluidHandler) { TileEntity tileEntity1 = tileEntity; arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((IFluidHandler)tileEntity1).fill(side, new FluidStack(fluid, amount), true)) })); }
/* 679 */       else { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no tank" })); }
/*     */       
/*     */       return arrayOfObject;
/*     */     } @Callback(doc = "function(amount:number, x:number, y:number, z:number, side:number):boolean - Remove some fluid from a tank at the specified location.")
/*     */     public Object[] removeFluid(Context context, Arguments args) {
/*     */       Object[] arrayOfObject;
/* 685 */       DebugCard$.MODULE$.checkAccess(ctx());
/* 686 */       int amount = args.checkInteger(0);
/* 687 */       BlockPosition position = li.cil.oc.util.BlockPosition$.MODULE$.apply(args.checkDouble(1), args.checkDouble(2), args.checkDouble(3), world());
/* 688 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(4);
/* 689 */       TileEntity tileEntity = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world()).getTileEntity(position);
/* 690 */       if (tileEntity instanceof IFluidHandler) { TileEntity tileEntity1 = tileEntity; arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { ((IFluidHandler)tileEntity1).drain(side, amount, true) })); }
/* 691 */       else { arrayOfObject = package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no tank" })); }
/*     */       
/*     */       return arrayOfObject;
/*     */     }
/*     */ 
/*     */     
/*     */     public void load(NBTTagCompound nbt) {
/* 698 */       super.load(nbt);
/* 699 */       ctx_$eq(DebugCard.AccessContext$.MODULE$.load(nbt));
/* 700 */       world_$eq((World)DimensionManager.getWorld(nbt.func_74762_e("dimension")));
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 704 */       super.save(nbt);
/* 705 */       ctx().foreach((Function1)new DebugCard$WorldValue$$anonfun$save$4(this, nbt));
/* 706 */       nbt.func_74768_a("dimension", (world()).field_73011_w.field_76574_g);
/*     */     } public final class DebugCard$WorldValue$$anonfun$save$4 extends AbstractFunction1<DebugCard.AccessContext, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$3; public final void apply(DebugCard.AccessContext x$13) {
/*     */         x$13.save(this.nbt$3);
/* 710 */       } public DebugCard$WorldValue$$anonfun$save$4(DebugCard.WorldValue $outer, NBTTagCompound nbt$3) {} } } public static class CommandSender extends FakePlayer { private final EnvironmentHost host; private final EntityPlayerMP underlying; private Option<String> messages; public EnvironmentHost host() { return this.host; } public EntityPlayerMP underlying() { return this.underlying; } public CommandSender(EnvironmentHost host, EntityPlayerMP underlying) { super((WorldServer)underlying.func_130014_f_(), underlying.func_146103_bH());
/* 711 */       this.messages = (Option<String>)scala.None$.MODULE$; } public Option<String> messages() { return this.messages; } public void messages_$eq(Option<String> x$1) { this.messages = x$1; }
/*     */     
/*     */     public void prepare() {
/* 714 */       BlockPosition blockPos = li.cil.oc.util.BlockPosition$.MODULE$.apply(host());
/* 715 */       ((Entity)this).field_70165_t = blockPos.x();
/* 716 */       ((Entity)this).field_70163_u = blockPos.y();
/* 717 */       ((Entity)this).field_70161_v = blockPos.z();
/* 718 */       messages_$eq((Option<String>)scala.None$.MODULE$);
/*     */     }
/*     */     public String func_70005_c_() {
/* 721 */       return underlying().func_70005_c_();
/*     */     } public World func_130014_f_() {
/* 723 */       return host().world();
/*     */     }
/*     */     
/* 726 */     public void func_145747_a(IChatComponent message) { messages_$eq(scala.Option$.MODULE$.apply((new StringBuilder()).append(messages().fold((Function0)new DebugCard$CommandSender$$anonfun$addChatMessage$1(this), (Function1)new DebugCard$CommandSender$$anonfun$addChatMessage$2(this))).append(message.func_150260_c()).toString())); } public final class DebugCard$CommandSender$$anonfun$addChatMessage$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return ""; } public DebugCard$CommandSender$$anonfun$addChatMessage$1(DebugCard.CommandSender $outer) {} } public final class DebugCard$CommandSender$$anonfun$addChatMessage$2 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$14) { return (new StringBuilder()).append(x$14).append("\n").toString(); }
/*     */       
/*     */       public DebugCard$CommandSender$$anonfun$addChatMessage$2(DebugCard.CommandSender $outer) {} }
/*     */     
/* 730 */     public boolean func_70003_b(int level, String command) { GameProfile profile = underlying().func_146103_bH();
/* 731 */       MinecraftServer server = (underlying()).field_71133_b;
/* 732 */       ServerConfigurationManager config = server.func_71203_ab();
/* 733 */       if (!server.func_71264_H()) { if (config.func_152596_g(profile)) { boolean bool; UserListEntry userListEntry = config.func_152603_m().func_152683_b(profile);
/* 734 */           if (userListEntry instanceof UserListOpsEntry) { UserListOpsEntry userListOpsEntry = (UserListOpsEntry)userListEntry; bool = (userListOpsEntry.func_152644_a() >= level) ? true : false; }
/* 735 */           else { bool = (server.func_110455_j() >= level) ? true : false; }
/*     */            if (bool); }
/*     */         
/*     */         return false; }
/* 739 */        } public ChunkCoordinates func_82114_b() { return li.cil.oc.util.BlockPosition$.MODULE$.apply(host()).toChunkCoordinates(); }
/*     */      public IChatComponent func_145748_c_() {
/* 741 */       return underlying().func_145748_c_();
/*     */     } }
/*     */   
/*     */   public static class TestValue extends AbstractValue {
/* 745 */     private String value = "hello"; public String value() { return this.value; } public void value_$eq(String x$1) { this.value = x$1; }
/*     */     
/*     */     public Object apply(Context context, Arguments arguments) {
/* 748 */       li.cil.oc.OpenComputers$.MODULE$.log().info((new StringBuilder()).append("TestValue.apply(").append(scala.Predef$.MODULE$.refArrayOps(arguments.toArray()).mkString(", ")).append(")").toString());
/* 749 */       return value();
/*     */     }
/*     */     
/*     */     public void unapply(Context context, Arguments arguments) {
/* 753 */       li.cil.oc.OpenComputers$.MODULE$.log().info((new StringBuilder()).append("TestValue.unapply(").append(scala.Predef$.MODULE$.refArrayOps(arguments.toArray()).mkString(", ")).append(")").toString());
/* 754 */       value_$eq(arguments.checkString(1));
/*     */     }
/*     */     
/*     */     public Object[] call(Context context, Arguments arguments) {
/* 758 */       li.cil.oc.OpenComputers$.MODULE$.log().info((new StringBuilder()).append("TestValue.call(").append(scala.Predef$.MODULE$.refArrayOps(arguments.toArray()).mkString(", ")).append(")").toString());
/* 759 */       return package$.MODULE$.result((Seq<Object>)scala.Predef$.MODULE$.genericWrapArray(arguments.toArray()));
/*     */     }
/*     */     
/*     */     public void dispose(Context context) {
/* 763 */       super.dispose(context);
/* 764 */       li.cil.oc.OpenComputers$.MODULE$.log().info("TestValue.dispose()");
/*     */     }
/*     */     
/*     */     public void load(NBTTagCompound nbt) {
/* 768 */       super.load(nbt);
/* 769 */       value_$eq(nbt.func_74779_i("value"));
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 773 */       super.save(nbt);
/* 774 */       nbt.func_74778_a("value", value());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\DebugCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */