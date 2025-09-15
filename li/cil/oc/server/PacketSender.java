/*     */ package li.cil.oc.server;
/*     */ import com.google.common.cache.Cache;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.CompressedPacketBuilder;
/*     */ import li.cil.oc.common.PacketBuilder;
/*     */ import li.cil.oc.common.PacketType$;
/*     */ import li.cil.oc.common.SimplePacketBuilder;
/*     */ import li.cil.oc.common.nanomachines.NeuralNetwork;
/*     */ import li.cil.oc.common.tileentity.Adapter;
/*     */ import li.cil.oc.common.tileentity.Assembler;
/*     */ import li.cil.oc.common.tileentity.Charger;
/*     */ import li.cil.oc.common.tileentity.DiskDrive;
/*     */ import li.cil.oc.common.tileentity.Hologram;
/*     */ import li.cil.oc.common.tileentity.NetSplitter;
/*     */ import li.cil.oc.common.tileentity.Printer;
/*     */ import li.cil.oc.common.tileentity.Rack;
/*     */ import li.cil.oc.common.tileentity.Raid;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.common.tileentity.Screen;
/*     */ import li.cil.oc.common.tileentity.traits.AbstractBusAware;
/*     */ import li.cil.oc.common.tileentity.traits.Colored;
/*     */ import li.cil.oc.common.tileentity.traits.Computer;
/*     */ import li.cil.oc.common.tileentity.traits.PowerInformation;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneAware;
/*     */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*     */ import li.cil.oc.common.tileentity.traits.SwitchLike;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.PackedColor;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ @ScalaSignature(bytes = "\006\001\0255s!B\001\003\021\003Y\021\001\004)bG.,GoU3oI\026\024(BA\002\005\003\031\031XM\035<fe*\021QAB\001\003_\016T!a\002\005\002\007\rLGNC\001\n\003\ta\027n\001\001\021\0051iQ\"\001\002\007\0139\021\001\022A\b\003\031A\0137m[3u'\026tG-\032:\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!)!$\004C\0017\005!2/\0328e\003\n\034HO]1di\n+8o\025;bi\026$\"\001H\020\021\005Ei\022B\001\020\023\005\021)f.\033;\t\013\001J\002\031A\021\002\003Q\004\"AI\025\016\003\rR!\001J\023\002\rQ\024\030-\033;t\025\t1s%\001\006uS2,WM\034;jifT!\001\013\003\002\r\r|W.\\8o\023\tQ3E\001\tBEN$(/Y2u\005V\034\030i^1sK\")A&\004C\001[\005\0012/\0328e\003\022\f\007\017^3s'R\fG/\032\013\00399BQ\001I\026A\002=\002\"\001M\031\016\003\025J!AM\023\003\017\005#\027\r\035;fe\")A'\004C\001k\005Y1/\0328e\003:\fG.\037>f)\rabg\020\005\006oM\002\r\001O\001\bC\022$'/Z:t!\tIDH\004\002\022u%\0211HE\001\007!J,G-\0324\n\005ur$AB*ue&twM\003\002<%!)\001i\ra\001\003\0061\001\017\\1zKJ\004\"A\021&\016\003\rS!\001\021#\013\005\0253\025AB3oi&$\030P\003\002H\021\006IQ.\0338fGJ\fg\r\036\006\002\023\006\031a.\032;\n\005-\033%AD#oi&$\030\020\0257bs\026\024X\n\025\005\006\0336!\tAT\001\021g\026tGm\0215be\036,'o\025;bi\026$\"\001H(\t\013\001b\005\031\001)\021\005A\n\026B\001*&\005\035\031\005.\031:hKJDQ\001V\007\005\002U\013Qb]3oI\016c\027.\0328u\031><Gc\001\017W1\")qk\025a\001q\005!A.\0338f\021\025\0015\0131\001B\021\025QV\002\"\001\\\0035\031XM\0343DY&\004(m\\1sIR\031A\004X/\t\013\001K\006\031A!\t\013yK\006\031\001\035\002\tQ,\007\020\036\005\006A6!\t!Y\001\020g\026tGmQ8m_J\034\005.\0318hKR\021AD\031\005\006A}\003\ra\031\t\003E\021L!!Z\022\003\017\r{Gn\034:fI\")q-\004C\001Q\006\t2/\0328e\007>l\007/\036;feN#\030\r^3\025\005qI\007\"\002\021g\001\004Q\007C\001\022l\023\ta7E\001\005D_6\004X\017^3s\021\025qW\002\"\001p\003Q\031XM\0343D_6\004X\017^3s+N,'\017T5tiR\031A\004]9\t\013\001j\007\031\0016\t\013Il\007\031A:\002\t1L7\017\036\t\004#QD\024BA;\023\005\025\t%O]1z\021\0259X\002\"\001y\003M\031XM\0343D_:$\030-\0338feV\003H-\031;f)\031a\0220a\001\002\022!)!P\036a\001w\006\t1\r\005\002}6\tQP\003\002\r\006I\021N\034<f]R|'/_\005\004\003\003i(!C\"p]R\f\027N\\3s\021\035\t)A\036a\001\003\017\t1A\0342u!\021\tI!!\004\016\005\005-!bAA\003\r&!\021qBA\006\0059q%\t\026+bO\016{W\016]8v]\022DQ\001\021<A\002\005Cq!!\006\016\t\003\t9\"\001\ftK:$G)[:bgN,WN\0317fe\006\033G/\033<f)\025a\022\021DA\021\021\035\001\0231\003a\001\0037\0012\001MA\017\023\r\ty\"\n\002\r\t&\034\030m]:f[\ndWM\035\005\t\003G\t\031\0021\001\002&\0051\021m\031;jm\026\0042!EA\024\023\r\tIC\005\002\b\005>|G.Z1o\021%\ti#\004b\001\n\023\ty#\001\rgS2,7+_:uK6\f5mY3tgRKW.Z8viN,\"!!\r\021\021\005M\022QHA!\003#j!!!\016\013\t\005]\022\021H\001\b[V$\030M\0317f\025\r\tYDE\001\013G>dG.Z2uS>t\027\002BA \003k\0211bV3bW\"\0137\017['baB!\0211IA'\033\t\t)E\003\003\002H\005%\023a\0028fi^|'o\033\006\004\003\027\"\021aA1qS&!\021qJA#\005\021qu\016Z3\021\017\005M\0231\r\035\002h5\021\021Q\013\006\005\003/\nI&A\003dC\016DWMC\002)\0037RA!!\030\002`\0051qm\\8hY\026T!!!\031\002\007\r|W.\003\003\002f\005U#!B\"bG\",\007\003BA5\003gj!!a\033\013\t\0055\024qN\001\005Y\006twM\003\002\002r\005!!.\031<b\023\021\t)(a\033\003\t1{gn\032\005\t\003sj\001\025!\003\0022\005Ib-\0337f'f\034H/Z7BG\016,7o\035+j[\026|W\017^:!\021\035\ti(\004C\001\003\nac]3oI\032KG.Z*zgR,W.Q2uSZLG/\037\013\b9\005\005\025QQAH\021!\t\031)a\037A\002\005\005\023\001\0028pI\026D\001\"a\"\002|\001\007\021\021R\001\005Q>\034H\017\005\003\002D\005-\025\002BAG\003\013\022q\"\0228wSJ|g.\\3oi\"{7\017\036\005\b\003#\013Y\b1\0019\003\021q\027-\\3\t\017\005UU\002\"\001\002\030\006\0312/\0328e\035\026$xo\034:l\003\016$\030N^5usR)A$!'\002\034\"A\0211QAJ\001\004\t\t\005\003\005\002\b\006M\005\031AAE\021\035\ty*\004C\001\003C\013\001c]3oI\032cw\016\0359z\007\"\fgnZ3\025\013q\t\031+a+\t\017\001\ni\n1\001\002&B\031\001'a*\n\007\005%VEA\005ESN\\GI]5wK\"Q\021QVAO!\003\005\r!a,\002\013M$\030mY6\021\t\005E\026qW\007\003\003gS1!!.G\003\021IG/Z7\n\t\005e\0261\027\002\n\023R,Wn\025;bG.Dq!!0\016\t\003\ty,A\ttK:$\007j\0347pOJ\fWn\0217fCJ$2\001HAa\021\035\001\0231\030a\001\003\007\0042\001MAc\023\r\t9-\n\002\t\021>dwn\032:b[\"9\0211Z\007\005\002\0055\027!E:f]\022Du\016\\8he\006l7i\0347peR9A$a4\002R\006m\007b\002\021\002J\002\007\0211\031\005\t\003'\fI\r1\001\002V\006)\021N\0343fqB\031\021#a6\n\007\005e'CA\002J]RD\001\"!8\002J\002\007\021Q[\001\006m\006dW/\032\005\b\003ClA\021AAr\003]\031XM\0343I_2|wM]1n!><XM]\"iC:<W\rF\002\035\003KDq\001IAp\001\004\t\031\rC\004\002j6!\t!a;\002#M,g\016\032%pY><'/Y7TG\006dW\rF\002\035\003[Dq\001IAt\001\004\t\031\rC\004\002r6!\t!a=\002!M,g\016\032%pY><'/Y7Be\026\fGc\001\017\002v\"9\001%a<A\002\005\r\007bBA}\033\021\005\0211`\001\023g\026tG\rS8m_\036\024\030-\034,bYV,7\017F\002\035\003{Dq\001IA|\001\004\t\031\rC\004\003\0025!\tAa\001\002%M,g\016\032%pY><'/Y7PM\032\034X\r\036\013\0049\t\025\001b\002\021\002\000\002\007\0211\031\005\b\005\023iA\021\001B\006\003Q\031XM\0343I_2|wM]1n%>$\030\r^5p]R\031AD!\004\t\017\001\0229\0011\001\002D\"9!\021C\007\005\002\tM\021!G:f]\022Du\016\\8he\006l'k\034;bi&|gn\0259fK\022$2\001\bB\013\021\035\001#q\002a\001\003\007DqA!\007\016\t\003\021Y\"A\007tK:$Gj\\8u\t&\0348n\035\013\0049\tu\001b\002B\020\005/\001\r!Q\001\002a\"9!1E\007\005\002\t\025\022\001H:f]\022t\025M\\8nC\016D\027N\\3D_:4\027nZ;sCRLwN\034\013\0049\t\035\002b\002!\003\"\001\007!\021\006\t\004\005\n-\022b\001B\027\007\naQI\034;jif\004F.Y=fe\"9!\021G\007\005\002\tM\022!F:f]\022t\025M\\8nC\016D\027N\\3J]B,Ho\035\013\0049\tU\002b\002!\0030\001\007!\021\006\005\b\005siA\021\001B\036\003Q\031XM\0343OC:|W.Y2iS:,\007k\\<feR\031AD!\020\t\017\001\0239\0041\001\003*!9!\021I\007\005\002\t\r\023\001F:f]\022tU\r^*qY&$H/\032:Ti\006$X\rF\002\035\005\013Bq\001\tB \001\004\0219\005E\0021\005\023J1Aa\023&\005-qU\r^*qY&$H/\032:\t\017\t=S\002\"\001\003R\005\0212/\0328e!\006\024H/[2mK\0263g-Z2u)-a\"1\013B2\005K\022IGa\035\t\021\tU#Q\na\001\005/\n\001\002]8tSRLwN\034\t\005\0053\022y&\004\002\003\\)\031!Q\f\003\002\tU$\030\016\\\005\005\005C\022YFA\007CY>\0347\016U8tSRLwN\034\005\b\003#\023i\0051\0019\021!\0219G!\024A\002\005U\027!B2pk:$\b\002\003B6\005\033\002\rA!\034\002\021Y,Gn\\2jif\0042!\005B8\023\r\021\tH\005\002\007\t>,(\r\\3\t\025\tU$Q\nI\001\002\004\0219(A\005eSJ,7\r^5p]B)\021C!\037\003~%\031!1\020\n\003\r=\003H/[8o!\021\021yH!#\016\005\t\005%\002\002B/\005\007S1\001\013BC\025\r\0219\tS\001\017[&tWm\031:bMR4wN]4f\023\021\021YI!!\003\035\031{'oZ3ESJ,7\r^5p]\"9!qR\007\005\002\tE\025!E:f]\022\004V\r\036,jg&\024\027\016\\5usR)ADa%\003\030\"Q\021\021\023BG!\003\005\rA!&\021\tE\021I\b\017\005\n\001\n5\005\023!a\001\0053\003B!\005B=\003\"9!QT\007\005\002\t}\025AD:f]\022\004vn^3s'R\fG/\032\013\0049\t\005\006b\002\021\003\034\002\007!1\025\t\004E\t\025\026b\001BTG\t\001\002k\\<fe&sgm\034:nCRLwN\034\005\b\005WkA\021\001BW\0031\031XM\0343Qe&tG/\0338h)\025a\"q\026B\\\021\035\001#\021\026a\001\005c\0032\001\rBZ\023\r\021),\n\002\b!JLg\016^3s\021!\021IL!+A\002\005\025\022\001\0039sS:$\030N\\4\t\017\tuV\002\"\001\003@\006\t2/\0328e%\006\0347.\0238wK:$xN]=\025\007q\021\t\rC\004!\005w\003\rAa1\021\007A\022)-C\002\003H\026\022AAU1dW\"9!QX\007\005\002\t-G#\002\017\003N\n=\007b\002\021\003J\002\007!1\031\005\t\005#\024I\r1\001\002V\006!1\017\\8u\021\035\021).\004C\001\005/\fQc]3oIJ\0137m['pk:$\030M\0317f\t\006$\030\rF\003\035\0053\024Y\016C\004!\005'\004\rAa1\t\021\tu'1\033a\001\003+\f\021\"\\8v]R\f'\r\\3\t\017\t\005X\002\"\001\003d\006q1/\0328e%\006LGm\0215b]\036,Gc\001\017\003f\"9\001Ea8A\002\t\035\bc\001\031\003j&\031!1^\023\003\tI\013\027\016\032\005\b\005_lA\021\001By\003E\031XM\0343SK\022\034Ho\0348f'R\fG/\032\013\0049\tM\bb\002\021\003n\002\007!Q\037\t\004E\t]\030b\001B}G\ti!+\0323ti>tW-Q<be\026DqA!@\016\t\003\021y0A\ntK:$'k\0342pi\006\0338/Z7cY&tw\rF\003\035\007\003\031I\001C\004!\005w\004\raa\001\021\007A\032)!C\002\004\b\025\022\021\"Q:tK6\024G.\032:\t\021\r-!1 a\001\003K\t!\"Y:tK6\024G.\0338h\021\035\031y!\004C\001\007#\tQb]3oIJ{'m\034;N_Z,Gc\002\017\004\024\rm1Q\004\005\bA\r5\001\031AB\013!\r\0014qC\005\004\0073)#!\002*pE>$\b\002\003B+\007\033\001\rAa\026\t\021\tU4Q\002a\001\005{Bqa!\t\016\t\003\031\031#A\013tK:$'k\0342pi\006s\027.\\1uKN;\030N\\4\025\007q\031)\003C\004!\007?\001\ra!\006\t\017\r%R\002\"\001\004,\005!2/\0328e%>\024w\016^!oS6\fG/\032+ve:$2\001HB\027\021\035\0013q\005a\001\007+Aqa!\r\016\t\003\031\031$\001\ntK:$'k\0342pi&sg/\0328u_JLHc\002\017\0046\r]2\021\b\005\bA\r=\002\031AB\013\021!\021\tna\fA\002\005U\007\002CAW\007_\001\r!a,\t\017\ruR\002\"\001\004@\005!2/\0328e%>\024w\016\036'jO\"$8\t[1oO\026$2\001HB!\021\035\00131\ba\001\007+Aqa!\022\016\t\003\0319%A\ntK:$'k\0342pi:\013W.Z\"iC:<W\rF\002\035\007\023Bq\001IB\"\001\004\031)\002C\004\004N5!\taa\024\0027M,g\016\032*pE>$8+\0327fGR,Gm\0257pi\016C\027M\\4f)\ra2\021\013\005\bA\r-\003\031AB\013\021\035\031)&\004C\001\007/\n!c]3oIJ{G/\031;bE2,7\013^1uKR\031Ad!\027\t\017\001\032\031\0061\001\004\\A\031!e!\030\n\007\r}3EA\005S_R\fG/\0312mK\"911M\007\005\002\r\025\024AE:f]\022\034v/\033;dQ\006\033G/\033<jif$2\001HB4\021\035\0013\021\ra\001\007S\0022AIB6\023\r\031ig\t\002\013'^LGo\0315MS.,\007bBB9\033\021\00511O\001\034CB\004XM\0343UKb$()\0364gKJ\034u\016\\8s\007\"\fgnZ3\025\017q\031)h!!\004\024\"A1qOB8\001\004\031I(\001\002qEB!11PB?\033\0059\023bAB@O\ti\001+Y2lKR\024U/\0337eKJD\001ba!\004p\001\0071QQ\001\013M>\024Xm\032:pk:$\007\003BBD\007\033sAA!\027\004\n&!11\022B.\003-\001\026mY6fI\016{Gn\034:\n\t\r=5\021\023\002\006\007>dwN\035\006\005\007\027\023Y\006\003\005\004\026\016=\004\031ABC\003)\021\027mY6he>,h\016\032\005\b\0073kA\021ABN\003Q\t\007\017]3oIR+\007\020\036\"vM\032,'oQ8qsRyAd!(\004 \016\r6qUBV\007_\033\031\f\003\005\004x\r]\005\031AB=\021!\031\tka&A\002\005U\027aA2pY\"A1QUBL\001\004\t).A\002s_^D\001b!+\004\030\002\007\021Q[\001\002o\"A1QVBL\001\004\t).A\001i\021!\031\tla&A\002\005U\027A\001;y\021!\031)la&A\002\005U\027A\001;z\021\035\031I,\004C\001\007w\0131$\0319qK:$G+\032=u\005V4g-\032:EKB$\bn\0215b]\036,G#\002\017\004>\016}\006\002CB<\007o\003\ra!\037\t\021\005u7q\027a\001\007\003\004Baa1\004X:!1QYBi\035\021\0319m!4\017\t\r%71Z\007\002\t%\031\0211\n\003\n\t\r=\027\021J\001\tS:$XM\0358bY&!11[Bk\003)!V\r\037;Ck\0324WM\035\006\005\007\037\fI%\003\003\004Z\016m'AC\"pY>\024H)\0329uQ*!11[Bk\021\035\031y.\004C\001\007C\fA#\0319qK:$G+\032=u\005V4g-\032:GS2dG#\004\017\004d\016\0258q]Bu\007W\034i\017\003\005\004x\ru\007\031AB=\021!\031\tk!8A\002\005U\007\002CBS\007;\004\r!!6\t\021\r%6Q\034a\001\003+D\001b!,\004^\002\007\021Q\033\005\bu\016u\007\031AAk\021\035\031\t0\004C\001\007g\fQ$\0319qK:$G+\032=u\005V4g-\032:QC2,G\017^3DQ\006tw-\032\013\b9\rU8q_B}\021!\0319ha<A\002\re\004\002CAj\007_\004\r!!6\t\021\rm8q\036a\001\003+\fQaY8m_JDqaa@\016\t\003!\t!\001\021baB,g\016\032+fqR\024UO\0324feJ+7o\0347vi&|gn\0215b]\036,Gc\002\017\005\004\021\025Aq\001\005\t\007o\032i\0201\001\004z!A1\021VB\001\004\t)\016\003\005\004.\016u\b\031AAk\021\035!Y!\004C\001\t\033\t\001&\0319qK:$G+\032=u\005V4g-\032:WS\026<\bo\034:u%\026\034x\016\\;uS>t7\t[1oO\026$r\001\bC\b\t#!\031\002\003\005\004x\021%\001\031AB=\021!\031I\013\"\003A\002\005U\007\002CBW\t\023\001\r!!6\t\017\021]Q\002\"\001\005\032\005\031\023\r\0359f]\022$V\r\037;Ck\0324WM]'bqJ+7o\0347vi&|gn\0215b]\036,Gc\002\017\005\034\021uAq\004\005\t\007o\")\0021\001\004z!A1\021\026C\013\001\004\t)\016\003\005\004.\022U\001\031AAk\021\035!\031#\004C\001\tK\t1#\0319qK:$G+\032=u\005V4g-\032:TKR$2\002\bC\024\tS!Y\003\"\f\0052!A1q\017C\021\001\004\031I\b\003\005\004\"\022\005\002\031AAk\021!\031)\013\"\tA\002\005U\007b\002C\030\tC\001\r\001O\001\002g\"AA1\007C\021\001\004\t)#\001\005wKJ$\030nY1m\021\035!9$\004C\001\ts\ta#\0319qK:$G+\032=u\005V4g-\032:CSR\024E\016\036\013\0249\021mBQ\bC \t\003\"\031\005\"\022\005J\0215C\021\013\005\t\007o\")\0041\001\004z!A1\021\025C\033\001\004\t)\016\003\005\004&\022U\002\031AAk\021!\031I\013\"\016A\002\005U\007\002CBW\tk\001\r!!6\t\017\021\035CQ\007a\001q\005)qn\0368fe\"AA1\nC\033\001\004\t).\001\002jI\"AAq\nC\033\001\004\t).A\004ge>l7i\0347\t\021\021MCQ\007a\001\003+\fqA\032:p[J{w\017C\004\005X5!\t\001\"\027\002/\005\004\b/\0328e)\026DHOQ;gM\026\024(+Y7J]&$H#\003\017\005\\\021uCq\fC1\021!\0319\b\"\026A\002\re\004BB\034\005V\001\007\001\b\003\005\005L\021U\003\031AAk\021!\t)\001\"\026A\002\005\035\001b\002C3\033\021\005AqM\001\033CB\004XM\0343UKb$()\0364gKJ\024\026-\034#fgR\024x.\037\013\b9\021%D1\016C7\021!\0319\bb\031A\002\re\004b\002C$\tG\002\r\001\017\005\t\t\027\"\031\0071\001\002V\"9A\021O\007\005\002\021M\024AG1qa\026tG\rV3yi\n+hMZ3s%\006<8+\032;UKb$H#\003\017\005v\021]D\021\020C>\021!\0319\bb\034A\002\re\004\002CBQ\t_\002\r!!6\t\021\r\025Fq\016a\001\003+DqA\030C8\001\004!i\b\005\003\022i\022}\004\003B\tu\003+Dq\001b!\016\t\003!))\001\021baB,g\016\032+fqR\024UO\0324feJ\013woU3u\005\006\0347n\032:pk:$G#\003\017\005\b\022%E1\022CG\021!\0319\b\"!A\002\re\004\002CBQ\t\003\003\r!!6\t\021\r\025F\021\021a\001\003+D\001ba?\005\002\002\007AQ\020\005\b\t#kA\021\001CJ\003\001\n\007\017]3oIR+\007\020\036\"vM\032,'OU1x'\026$hi\034:fOJ|WO\0343\025\023q!)\nb&\005\032\022m\005\002CB<\t\037\003\ra!\037\t\021\r\005Fq\022a\001\003+D\001b!*\005\020\002\007\021Q\033\005\t\007w$y\t1\001\005~!9AqT\007\005\002\021\005\026AE:f]\022$V\r\037;Ck\0324WM]%oSR$r\001\bCR\tK#9\013\003\0048\t;\003\r\001\017\005\t\003;$i\n1\001\002\b!1\001\t\"(A\002\005Cq\001b+\016\t\003!i+A\rtK:$G+\032=u\005V4g-\032:Q_^,'o\0215b]\036,Gc\002\017\0050\022EFQ\027\005\007o\021%\006\031\001\035\t\021\021MF\021\026a\001\003K\t\001\002[1t!><XM\035\005\t\003\017#I\0131\001\002\n\"9A\021X\007\005\002\021m\026aE:f]\022\0346M]3f]R{Wo\0315N_\022,G#\002\017\005>\022\025\007b\002\021\0058\002\007Aq\030\t\004a\021\005\027b\001CbK\t11k\031:fK:D\001\"!8\0058\002\007\021Q\005\005\b\t\023lA\021\001Cf\003%\031XM\0343T_VtG\rF\007\035\t\033$Y\016b8\005d\022\035H1\036\005\t\t\037$9\r1\001\005R\006)qo\034:mIB!A1\033Cl\033\t!)NC\002\005P\032KA\001\"7\005V\n)qk\034:mI\"AAQ\034Cd\001\004\021i'A\001y\021!!\t\017b2A\002\t5\024!A=\t\021\021\025Hq\031a\001\005[\n\021A\037\005\t\tS$9\r1\001\002V\006IaM]3rk\026t7-\037\005\t\t[$9\r1\001\002V\006AA-\036:bi&|g\016C\004\005J6!\t\001\"=\025\027q!\031\020\">\005x\022eH1 \005\t\t\037$y\0171\001\005R\"AAQ\034Cx\001\004\021i\007\003\005\005b\022=\b\031\001B7\021!!)\017b<A\002\t5\004b\002C\t_\004\r\001O\001\ba\006$H/\032:o\021\035)\t!\004C\001\013\007\tac]3oIR\023\030M\\:q_N,'/Q2uSZLG/\037\013\0049\025\025\001b\002\021\005\000\002\007Qq\001\t\004a\025%\021bAC\006K\tQAK]1ogB|7/\032:\t\017\025=Q\002\"\001\006\022\005\t2/\0328e/\006L\bo\\5oi2\013'-\0327\025\007q)\031\002C\004!\013\033\001\r!\"\006\021\007A*9\"C\002\006\032\025\022\001bV1za>Lg\016\036\005\n\013;i\021\023!C\001\013?\t1d]3oIB+GOV5tS\nLG.\033;zI\021,g-Y;mi\022\nTCAC\021U\021\021)*b\t,\005\025\025\002\003BC\024\013ci!!\"\013\013\t\025-RQF\001\nk:\034\007.Z2lK\022T1!b\f\023\003)\tgN\\8uCRLwN\\\005\005\013g)ICA\tv]\016DWmY6fIZ\013'/[1oG\026D\021\"b\016\016#\003%\t!\"\017\0027M,g\016\032)fiZK7/\0332jY&$\030\020\n3fM\006,H\016\036\0233+\t)YD\013\003\003\032\026\r\002\"CC \033E\005I\021AC!\003i\031XM\0343GY>\004\b/_\"iC:<W\r\n3fM\006,H\016\036\0233+\t)\031E\013\003\0020\026\r\002\"CC$\033E\005I\021AC%\003q\031XM\0343QCJ$\030n\0317f\013\0324Wm\031;%I\0264\027-\0367uIU*\"!b\023+\t\t]T1\005")
/*     */ public final class PacketSender { public static Option<ForgeDirection> sendParticleEffect$default$5() { return PacketSender$.MODULE$.sendParticleEffect$default$5(); } public static ItemStack sendFloppyChange$default$2() { return PacketSender$.MODULE$.sendFloppyChange$default$2(); } public static Option<EntityPlayerMP> sendPetVisibility$default$2() { return PacketSender$.MODULE$.sendPetVisibility$default$2(); } public static Option<String> sendPetVisibility$default$1() { return PacketSender$.MODULE$.sendPetVisibility$default$1(); } public static void sendWaypointLabel(Waypoint paramWaypoint) { PacketSender$.MODULE$.sendWaypointLabel(paramWaypoint); } public static void sendTransposerActivity(Transposer paramTransposer) { PacketSender$.MODULE$.sendTransposerActivity(paramTransposer); } public static void sendSound(World paramWorld, double paramDouble1, double paramDouble2, double paramDouble3, String paramString) { PacketSender$.MODULE$.sendSound(paramWorld, paramDouble1, paramDouble2, paramDouble3, paramString); } public static void sendSound(World paramWorld, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2) { PacketSender$.MODULE$.sendSound(paramWorld, paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2); } public static void sendScreenTouchMode(Screen paramScreen, boolean paramBoolean) { PacketSender$.MODULE$.sendScreenTouchMode(paramScreen, paramBoolean); } public static void sendTextBufferPowerChange(String paramString, boolean paramBoolean, EnvironmentHost paramEnvironmentHost) { PacketSender$.MODULE$.sendTextBufferPowerChange(paramString, paramBoolean, paramEnvironmentHost); } public static void sendTextBufferInit(String paramString, NBTTagCompound paramNBTTagCompound, EntityPlayerMP paramEntityPlayerMP) { PacketSender$.MODULE$.sendTextBufferInit(paramString, paramNBTTagCompound, paramEntityPlayerMP); } public static void appendTextBufferRawSetForeground(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int[][] paramArrayOfint) { PacketSender$.MODULE$.appendTextBufferRawSetForeground(paramPacketBuilder, paramInt1, paramInt2, paramArrayOfint); } public static void appendTextBufferRawSetBackground(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int[][] paramArrayOfint) { PacketSender$.MODULE$.appendTextBufferRawSetBackground(paramPacketBuilder, paramInt1, paramInt2, paramArrayOfint); } public static void appendTextBufferRawSetText(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int[][] paramArrayOfint) { PacketSender$.MODULE$.appendTextBufferRawSetText(paramPacketBuilder, paramInt1, paramInt2, paramArrayOfint); } public static void appendTextBufferRamDestroy(PacketBuilder paramPacketBuilder, String paramString, int paramInt) { PacketSender$.MODULE$.appendTextBufferRamDestroy(paramPacketBuilder, paramString, paramInt); } public static void appendTextBufferRamInit(PacketBuilder paramPacketBuilder, String paramString, int paramInt, NBTTagCompound paramNBTTagCompound) { PacketSender$.MODULE$.appendTextBufferRamInit(paramPacketBuilder, paramString, paramInt, paramNBTTagCompound); } public static void appendTextBufferBitBlt(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, int paramInt6, int paramInt7) { PacketSender$.MODULE$.appendTextBufferBitBlt(paramPacketBuilder, paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramInt5, paramInt6, paramInt7); } public static void appendTextBufferSet(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, String paramString, boolean paramBoolean) { PacketSender$.MODULE$.appendTextBufferSet(paramPacketBuilder, paramInt1, paramInt2, paramString, paramBoolean); } public static void appendTextBufferMaxResolutionChange(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2) { PacketSender$.MODULE$.appendTextBufferMaxResolutionChange(paramPacketBuilder, paramInt1, paramInt2); } public static void appendTextBufferViewportResolutionChange(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2) { PacketSender$.MODULE$.appendTextBufferViewportResolutionChange(paramPacketBuilder, paramInt1, paramInt2); } public static void appendTextBufferResolutionChange(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2) { PacketSender$.MODULE$.appendTextBufferResolutionChange(paramPacketBuilder, paramInt1, paramInt2); } public static void appendTextBufferPaletteChange(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2) { PacketSender$.MODULE$.appendTextBufferPaletteChange(paramPacketBuilder, paramInt1, paramInt2); } public static void appendTextBufferFill(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { PacketSender$.MODULE$.appendTextBufferFill(paramPacketBuilder, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5); } public static void appendTextBufferDepthChange(PacketBuilder paramPacketBuilder, TextBuffer.ColorDepth paramColorDepth) { PacketSender$.MODULE$.appendTextBufferDepthChange(paramPacketBuilder, paramColorDepth); } public static void appendTextBufferCopy(PacketBuilder paramPacketBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) { PacketSender$.MODULE$.appendTextBufferCopy(paramPacketBuilder, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6); } public static void appendTextBufferColorChange(PacketBuilder paramPacketBuilder, PackedColor.Color paramColor1, PackedColor.Color paramColor2) { PacketSender$.MODULE$.appendTextBufferColorChange(paramPacketBuilder, paramColor1, paramColor2); } public static void sendSwitchActivity(SwitchLike paramSwitchLike) { PacketSender$.MODULE$.sendSwitchActivity(paramSwitchLike); } public static void sendRotatableState(Rotatable paramRotatable) { PacketSender$.MODULE$.sendRotatableState(paramRotatable); } public static void sendRobotSelectedSlotChange(Robot paramRobot) { PacketSender$.MODULE$.sendRobotSelectedSlotChange(paramRobot); } public static void sendRobotNameChange(Robot paramRobot) { PacketSender$.MODULE$.sendRobotNameChange(paramRobot); } public static void sendRobotLightChange(Robot paramRobot) { PacketSender$.MODULE$.sendRobotLightChange(paramRobot); } public static void sendRobotInventory(Robot paramRobot, int paramInt, ItemStack paramItemStack) { PacketSender$.MODULE$.sendRobotInventory(paramRobot, paramInt, paramItemStack); } public static void sendRobotAnimateTurn(Robot paramRobot) { PacketSender$.MODULE$.sendRobotAnimateTurn(paramRobot); } public static void sendRobotAnimateSwing(Robot paramRobot) { PacketSender$.MODULE$.sendRobotAnimateSwing(paramRobot); } public static void sendRobotMove(Robot paramRobot, BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) { PacketSender$.MODULE$.sendRobotMove(paramRobot, paramBlockPosition, paramForgeDirection); } public static void sendRobotAssembling(Assembler paramAssembler, boolean paramBoolean) { PacketSender$.MODULE$.sendRobotAssembling(paramAssembler, paramBoolean); } public static void sendRedstoneState(RedstoneAware paramRedstoneAware) { PacketSender$.MODULE$.sendRedstoneState(paramRedstoneAware); } public static void sendRaidChange(Raid paramRaid) { PacketSender$.MODULE$.sendRaidChange(paramRaid); } public static void sendRackMountableData(Rack paramRack, int paramInt) { PacketSender$.MODULE$.sendRackMountableData(paramRack, paramInt); } public static void sendRackInventory(Rack paramRack, int paramInt) { PacketSender$.MODULE$.sendRackInventory(paramRack, paramInt); } public static void sendRackInventory(Rack paramRack) { PacketSender$.MODULE$.sendRackInventory(paramRack); } public static void sendPrinting(Printer paramPrinter, boolean paramBoolean) { PacketSender$.MODULE$.sendPrinting(paramPrinter, paramBoolean); } public static void sendPowerState(PowerInformation paramPowerInformation) { PacketSender$.MODULE$.sendPowerState(paramPowerInformation); } public static void sendPetVisibility(Option<String> paramOption, Option<EntityPlayerMP> paramOption1) { PacketSender$.MODULE$.sendPetVisibility(paramOption, paramOption1); } public static void sendParticleEffect(BlockPosition paramBlockPosition, String paramString, int paramInt, double paramDouble, Option<ForgeDirection> paramOption) { PacketSender$.MODULE$.sendParticleEffect(paramBlockPosition, paramString, paramInt, paramDouble, paramOption); } public static void sendNetSplitterState(NetSplitter paramNetSplitter) {
/*     */     PacketSender$.MODULE$.sendNetSplitterState(paramNetSplitter);
/*     */   } public static void sendNanomachinePower(EntityPlayer paramEntityPlayer) {
/*     */     PacketSender$.MODULE$.sendNanomachinePower(paramEntityPlayer);
/*     */   } public static void sendNanomachineInputs(EntityPlayer paramEntityPlayer) {
/*     */     PacketSender$.MODULE$.sendNanomachineInputs(paramEntityPlayer);
/*     */   } public static void sendNanomachineConfiguration(EntityPlayer paramEntityPlayer) {
/*     */     PacketSender$.MODULE$.sendNanomachineConfiguration(paramEntityPlayer);
/*     */   } public static void sendLootDisks(EntityPlayerMP paramEntityPlayerMP) {
/*     */     PacketSender$.MODULE$.sendLootDisks(paramEntityPlayerMP);
/*     */   } public static void sendHologramRotationSpeed(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramRotationSpeed(paramHologram);
/*     */   } public static void sendHologramRotation(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramRotation(paramHologram);
/*     */   } public static void sendHologramOffset(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramOffset(paramHologram);
/*     */   } public static void sendHologramValues(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramValues(paramHologram);
/*     */   } public static void sendHologramArea(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramArea(paramHologram);
/*     */   } public static void sendHologramScale(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramScale(paramHologram);
/*     */   } public static void sendHologramPowerChange(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramPowerChange(paramHologram);
/*     */   } public static void sendHologramColor(Hologram paramHologram, int paramInt1, int paramInt2) {
/*     */     PacketSender$.MODULE$.sendHologramColor(paramHologram, paramInt1, paramInt2);
/*     */   } public static void sendHologramClear(Hologram paramHologram) {
/*     */     PacketSender$.MODULE$.sendHologramClear(paramHologram);
/*     */   } public static void sendFloppyChange(DiskDrive paramDiskDrive, ItemStack paramItemStack) {
/*     */     PacketSender$.MODULE$.sendFloppyChange(paramDiskDrive, paramItemStack);
/*     */   } public static void sendNetworkActivity(Node paramNode, EnvironmentHost paramEnvironmentHost) {
/*     */     PacketSender$.MODULE$.sendNetworkActivity(paramNode, paramEnvironmentHost);
/*     */   } public static void sendFileSystemActivity(Node paramNode, EnvironmentHost paramEnvironmentHost, String paramString) {
/*     */     PacketSender$.MODULE$.sendFileSystemActivity(paramNode, paramEnvironmentHost, paramString);
/*     */   } public static void sendDisassemblerActive(Disassembler paramDisassembler, boolean paramBoolean) {
/*     */     PacketSender$.MODULE$.sendDisassemblerActive(paramDisassembler, paramBoolean);
/*     */   } public static void sendContainerUpdate(Container paramContainer, NBTTagCompound paramNBTTagCompound, EntityPlayerMP paramEntityPlayerMP) {
/*     */     PacketSender$.MODULE$.sendContainerUpdate(paramContainer, paramNBTTagCompound, paramEntityPlayerMP);
/*     */   } public static void sendComputerUserList(Computer paramComputer, String[] paramArrayOfString) {
/*     */     PacketSender$.MODULE$.sendComputerUserList(paramComputer, paramArrayOfString);
/*     */   } public static void sendComputerState(Computer paramComputer) {
/*     */     PacketSender$.MODULE$.sendComputerState(paramComputer);
/*     */   } public static void sendColorChange(Colored paramColored) {
/*     */     PacketSender$.MODULE$.sendColorChange(paramColored);
/*     */   } public static void sendClipboard(EntityPlayerMP paramEntityPlayerMP, String paramString) {
/*     */     PacketSender$.MODULE$.sendClipboard(paramEntityPlayerMP, paramString);
/*     */   } public static void sendClientLog(String paramString, EntityPlayerMP paramEntityPlayerMP) {
/*     */     PacketSender$.MODULE$.sendClientLog(paramString, paramEntityPlayerMP);
/*     */   } public static void sendChargerState(Charger paramCharger) {
/*     */     PacketSender$.MODULE$.sendChargerState(paramCharger);
/*     */   } public static void sendAnalyze(String paramString, EntityPlayerMP paramEntityPlayerMP) {
/*     */     PacketSender$.MODULE$.sendAnalyze(paramString, paramEntityPlayerMP);
/*     */   } public static void sendAdapterState(Adapter paramAdapter) {
/*     */     PacketSender$.MODULE$.sendAdapterState(paramAdapter);
/*     */   } public static void sendAbstractBusState(AbstractBusAware paramAbstractBusAware) {
/*     */     PacketSender$.MODULE$.sendAbstractBusState(paramAbstractBusAware);
/*     */   } public final class PacketSender$$anonfun$sendComputerUserList$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public final void apply(String x$1) {
/* 104 */       this.pb$4.writeUTF(x$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final SimplePacketBuilder pb$4;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public PacketSender$$anonfun$sendComputerUserList$1(SimplePacketBuilder pb$4) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class PacketSender$$anonfun$1
/*     */     extends AbstractFunction0<Cache<String, Long>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final int diskActivityPacketDelay$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final Cache<String, Long> apply() {
/* 137 */       return CacheBuilder.newBuilder().concurrencyLevel(Settings$.MODULE$.get().threads()).maximumSize(250L).expireAfterWrite(this.diskActivityPacketDelay$1, TimeUnit.MILLISECONDS).build();
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
/*     */     public PacketSender$$anonfun$1(int diskActivityPacketDelay$1) {}
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
/*     */   public final class PacketSender$$anonfun$sendHologramArea$1
/*     */     extends AbstractFunction1.mcVI.sp
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
/*     */     public final Hologram t$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final CompressedPacketBuilder pb$5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int x) {
/* 252 */       apply$mcVI$sp(x);
/* 253 */     } public PacketSender$$anonfun$sendHologramArea$1(Hologram t$1, CompressedPacketBuilder pb$5) {} public void apply$mcVI$sp(int x) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(this.t$1.dirtyFromZ()), this.t$1.dirtyUntilZ()).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int x$2; public final void apply(int z) { apply$mcVI$sp(z); } public PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1(PacketSender$$anonfun$sendHologramArea$1 $outer, int x$2) {} public void apply$mcVI$sp(int z) {
/* 254 */         this.$outer.pb$5.writeInt(this.$outer.t$1.volume()[this.x$2 + z * 48]);
/* 255 */         this.$outer.pb$5.writeInt(this.$outer.t$1.volume()[this.x$2 + z * 48 + 2304]);
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   public final class PacketSender$$anonfun$sendHologramValues$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Hologram t$2;
/*     */     private final CompressedPacketBuilder pb$6;
/*     */     
/*     */     public PacketSender$$anonfun$sendHologramValues$1(Hologram t$2, CompressedPacketBuilder pb$6) {}
/*     */     
/*     */     public final void apply(short xz) {
/* 268 */       byte x = (byte)(xz >> 8);
/* 269 */       byte z = (byte)xz;
/* 270 */       this.pb$6.writeShort(xz);
/* 271 */       int rangeStart = x + z * 48;
/* 272 */       int rangeFinal = x + z * 48 + 2304;
/* 273 */       this.pb$6.writeInt(this.t$2.volume()[RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(rangeStart), 0)), (this.t$2.volume()).length - 1)]);
/* 274 */       this.pb$6.writeInt(this.t$2.volume()[RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(rangeFinal), 0)), (this.t$2.volume()).length - 1)]);
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
/*     */   public final class PacketSender$$anonfun$2
/*     */     extends AbstractFunction1<Tuple2<ItemStack, Object>, ItemStack>
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
/*     */     public final ItemStack apply(Tuple2 x$1) {
/* 317 */       return (ItemStack)x$1._1();
/*     */     } } public final class PacketSender$$anonfun$sendLootDisks$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayerMP p$1; public PacketSender$$anonfun$sendLootDisks$1(EntityPlayerMP p$1) {} public final void apply(ItemStack stack) {
/* 319 */       SimplePacketBuilder pb = new SimplePacketBuilder(PacketType$.MODULE$.LootDisk());
/*     */       
/* 321 */       pb.writeItemStack(stack);
/*     */       
/* 323 */       pb.sendToPlayer(this.p$1);
/*     */     } } public final class PacketSender$$anonfun$sendLootDisks$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayerMP p$1; public PacketSender$$anonfun$sendLootDisks$2(EntityPlayerMP p$1) {}
/*     */     public final void apply(ItemStack stack) {
/* 326 */       SimplePacketBuilder pb = new SimplePacketBuilder(PacketType$.MODULE$.CyclingDisk());
/*     */       
/* 328 */       pb.writeItemStack(stack);
/*     */       
/* 330 */       pb.sendToPlayer(this.p$1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class PacketSender$$anonfun$3
/*     */     extends AbstractFunction1<NeuralNetwork.TriggerNeuron, Object>
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
/*     */     public final byte apply(NeuralNetwork.TriggerNeuron i) {
/* 357 */       return i.isActive() ? (byte)1 : (byte)0;
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
/*     */   public final class PacketSender$$anonfun$sendPetVisibility$1
/*     */     extends AbstractFunction1<String, BoxedUnit>
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
/*     */     private final SimplePacketBuilder pb$7;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public PacketSender$$anonfun$sendPetVisibility$1(SimplePacketBuilder pb$7) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(String n) {
/* 415 */       this.pb$7.writeUTF(n);
/* 416 */       this.pb$7.writeBoolean(false);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class PacketSender$$anonfun$sendRackInventory$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Rack t$3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final SimplePacketBuilder pb$8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int slot)
/*     */     {
/* 450 */       apply$mcVI$sp(slot); } public PacketSender$$anonfun$sendRackInventory$1(Rack t$3, SimplePacketBuilder pb$8) {} public void apply$mcVI$sp(int slot) {
/* 451 */       this.pb$8.writeInt(slot);
/* 452 */       this.pb$8.writeItemStack(this.t$3.func_70301_a(slot));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class PacketSender$$anonfun$sendRaidChange$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Raid t$4;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final SimplePacketBuilder pb$9;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int slot)
/*     */     {
/* 483 */       apply$mcVI$sp(slot); } public PacketSender$$anonfun$sendRaidChange$1(Raid t$4, SimplePacketBuilder pb$9) {} public void apply$mcVI$sp(int slot) {
/* 484 */       this.pb$9.writeBoolean(!(this.t$4.func_70301_a(slot) == null));
/*     */     }
/*     */   }
/*     */   
/*     */   public final class PacketSender$$anonfun$sendRedstoneState$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final RedstoneAware t$5;
/*     */     private final SimplePacketBuilder pb$10;
/*     */     
/*     */     public PacketSender$$anonfun$sendRedstoneState$1(RedstoneAware t$5, SimplePacketBuilder pb$10) {}
/*     */     
/*     */     public final void apply(ForgeDirection d) {
/* 496 */       this.pb$10.writeByte(this.t$5.getOutput(d));
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
/*     */   public final class PacketSender$$anonfun$sendRobotNameChange$1
/*     */     extends AbstractFunction1.mcVI.sp
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
/*     */     private final SimplePacketBuilder pb$11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final String name$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int x)
/*     */     {
/* 569 */       apply$mcVI$sp(x); } public PacketSender$$anonfun$sendRobotNameChange$1(SimplePacketBuilder pb$11, String name$1) {} public void apply$mcVI$sp(int x) {
/* 570 */       this.pb$11.writeChar(StringOps$.MODULE$.apply$extension(Predef$.MODULE$.augmentString(this.name$1), x));
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
/*     */   public final class PacketSender$$anonfun$appendTextBufferRawSetText$1
/*     */     extends AbstractFunction1.mcVI.sp
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
/*     */     public final PacketBuilder pb$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final int[][] text$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int y) {
/* 709 */       apply$mcVI$sp(y);
/* 710 */     } public PacketSender$$anonfun$appendTextBufferRawSetText$1(PacketBuilder pb$1, int[][] text$1) {} public void apply$mcVI$sp(int y) { int[] line = this.text$1[y];
/* 711 */       this.pb$1.writeShort((short)line.length); RichInt$.MODULE$
/* 712 */         .until$extension0(Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$1; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2(PacketSender$$anonfun$appendTextBufferRawSetText$1 $outer, int[] line$1) {} public void apply$mcVI$sp(int x) {
/* 713 */         this.$outer.pb$1.writeMedium(this.line$1[x]);
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   public final class PacketSender$$anonfun$appendTextBufferRawSetBackground$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final PacketBuilder pb$2;
/*     */     private final int[][] color$1;
/*     */     
/*     */     public final void apply(int y) {
/* 724 */       apply$mcVI$sp(y);
/* 725 */     } public PacketSender$$anonfun$appendTextBufferRawSetBackground$1(PacketBuilder pb$2, int[][] color$1) {} public void apply$mcVI$sp(int y) { int[] line = this.color$1[y];
/* 726 */       this.pb$2.writeShort((short)line.length); RichInt$.MODULE$
/* 727 */         .until$extension0(Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$2; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3(PacketSender$$anonfun$appendTextBufferRawSetBackground$1 $outer, int[] line$2) {} public void apply$mcVI$sp(int x) {
/* 728 */         this.$outer.pb$2.writeInt(this.line$2[x]);
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   public final class PacketSender$$anonfun$appendTextBufferRawSetForeground$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final PacketBuilder pb$3;
/*     */     private final int[][] color$2;
/*     */     
/*     */     public final void apply(int y) {
/* 739 */       apply$mcVI$sp(y);
/* 740 */     } public PacketSender$$anonfun$appendTextBufferRawSetForeground$1(PacketBuilder pb$3, int[][] color$2) {} public void apply$mcVI$sp(int y) { int[] line = this.color$2[y];
/* 741 */       this.pb$3.writeShort((short)line.length); RichInt$.MODULE$
/* 742 */         .until$extension0(Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$3; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4(PacketSender$$anonfun$appendTextBufferRawSetForeground$1 $outer, int[] line$3) {} public void apply$mcVI$sp(int x) {
/* 743 */         this.$outer.pb$3.writeInt(this.line$3[x]);
/*     */       } }
/*     */   
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\PacketSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */