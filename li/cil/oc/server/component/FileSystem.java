/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import li.cil.oc.api.fs.Handle;
/*     */ import li.cil.oc.api.fs.Label;
/*     */ import li.cil.oc.api.fs.Mode;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r%b\001B\001\003\0015\021!BR5mKNK8\017^3n\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\t\003/ii\021\001\007\006\0033I\ta\001\032:jm\026\024\030BA\016\031\005)!UM^5dK&sgm\034\005\t;\001\021)\031!C\001=\005Qa-\0337f'f\034H/Z7\026\003}\001\"\001I\022\016\003\005R!A\t\n\002\005\031\034\030BA\001\"\021!)\003A!A!\002\023y\022a\0034jY\026\034\026p\035;f[\002B\001b\n\001\003\002\004%\t\001K\001\006Y\006\024W\r\\\013\002SA\021\001EK\005\003W\005\022Q\001T1cK2D\001\"\f\001\003\002\004%\tAL\001\nY\006\024W\r\\0%KF$\"aL\033\021\005A\032T\"A\031\013\003I\nQa]2bY\006L!\001N\031\003\tUs\027\016\036\005\bm1\n\t\0211\001*\003\rAH%\r\005\tq\001\021\t\021)Q\005S\0051A.\0312fY\002B\001B\017\001\003\006\004%\taO\001\005Q>\034H/F\001=!\r\001ThP\005\003}E\022aa\0249uS>t\007C\001!D\033\005\t%B\001\"\023\003\035qW\r^<pe.L!\001R!\003\037\025sg/\033:p]6,g\016\036%pgRD\001B\022\001\003\002\003\006I\001P\001\006Q>\034H\017\t\005\t\021\002\021)\031!C\001\023\006)1o\\;oIV\t!\nE\0021{-\003\"\001T(\017\005Aj\025B\001(2\003\031\001&/\0323fM&\021\001+\025\002\007'R\024\030N\\4\013\0059\013\004\002C*\001\005\003\005\013\021\002&\002\rM|WO\0343!\021!)\006A!b\001\n\0031\026!B:qK\026$W#A,\021\005AB\026BA-2\005\rIe\016\036\005\t7\002\021\t\021)A\005/\00611\017]3fI\002BQ!\030\001\005\002y\013a\001P5oSRtDCB0bE\016$W\r\005\002a\0015\t!\001C\003\0369\002\007q\004C\003(9\002\007\021\006C\003;9\002\007A\bC\003I9\002\007!\nC\003V9\002\007q\013C\004h\001\t\007I\021\t5\002\t9|G-Z\013\002SB\021\001I[\005\003W\006\023!cQ8na>tWM\034;D_:tWm\031;pe\"1Q\016\001Q\001\n%\fQA\\8eK\002Bqa\034\001C\002\023%\001/\001\004po:,'o]\013\002cB!!o^&z\033\005\031(B\001;v\003\035iW\017^1cY\026T!A^\031\002\025\r|G\016\\3di&|g.\003\002yg\n\031Q*\0319\021\007ITx+\003\002|g\n\0311+\032;\t\ru\004\001\025!\003r\003\035ywO\\3sg\002B\001b \001C\002\023\025\021\021A\001\ne\026\fGmQ8tiN,\"!a\001\021\013A\n)!!\003\n\007\005\035\021GA\003BeJ\f\027\020E\0021\003\027I1!!\0042\005\031!u.\0362mK\"A\021\021\003\001!\002\033\t\031!\001\006sK\006$7i\\:ug\002B\021\"!\006\001\005\004%)!!\001\002\023M,Wm[\"pgR\034\b\002CA\r\001\001\006i!a\001\002\025M,Wm[\"pgR\034\b\005C\005\002\036\001\021\r\021\"\002\002\002\005QqO]5uK\016{7\017^:\t\021\005\005\002\001)A\007\003\007\t1b\036:ji\026\034un\035;tA!Q\021Q\005\001\t\006\004%i!a\n\002\025\021,g/[2f\023:4w.\006\002\002*AA\0211FA\031\003g\t\031$\004\002\002.)\031\021qF;\002\023%lW.\036;bE2,\027b\001=\002.A!\021QGA \033\t\t9D\003\003\002:\005m\022\001\0027b]\036T!!!\020\002\t)\fg/Y\005\004!\006]\002BCA\"\001!\005\t\025)\004\002*\005YA-\032<jG\026LeNZ8!\021\035\t9\005\001C!\003\023\nQbZ3u\t\0264\030nY3J]\032|GCAA&!\031\ti%a\025L\0276\021\021q\n\006\005\003#\nY$\001\003vi&d\027b\001=\002P!9\021q\013\001\005\002\005e\023\001C4fi2\013'-\0327\025\r\005m\0231MA:!\025\001\024QAA/!\r\001\024qL\005\004\003C\n$AB!osJ+g\r\003\005\002f\005U\003\031AA4\003\035\031wN\034;fqR\004B!!\033\002p5\021\0211\016\006\004\003[\022\022aB7bG\"Lg.Z\005\005\003c\nYGA\004D_:$X\r\037;\t\021\005U\024Q\013a\001\003o\nA!\031:hgB!\021\021NA=\023\021\tY(a\033\003\023\005\023x-^7f]R\034\b\006DA+\003\n))a\"\002\n\006-\005\003BA5\003\003KA!a!\002l\tA1)\0317mE\006\0347.\001\004eSJ,7\r^\r\002\003\005\031Am\\2\"\005\0055\025\001\0174v]\016$\030n\0348)Si\032HO]5oO\002jS\006I$fi\002\"\b.\032\021dkJ\024XM\034;!Y\006\024W\r\034\021pM\002\"\b.\032\021ee&4XM\f\005\b\003#\003A\021AAJ\003!\031X\r\036'bE\026dGCBA.\003+\0139\n\003\005\002f\005=\005\031AA4\021!\t)(a$A\002\005]\004\006CAH\003\nI)a'\"\005\005u\025\001\0344v]\016$\030n\0348)m\006dW/\032\036tiJLgnZ\025;gR\024\030N\\4![5\0023+\032;tAQDW\r\t7bE\026d\007e\0344!i\",\007\005\032:jm\026t\003EU3ukJt7\017\t;iK\002rWm\036\021wC2,X\r\f\021xQ&\034\007\016I7bs\002\022W\r\t;sk:\034\027\r^3e]!9\021\021\025\001\005\002\005\r\026AC5t%\026\fGm\0248msR1\0211LAS\003OC\001\"!\032\002 \002\007\021q\r\005\t\003k\ny\n1\001\002x!b\021qTA@\003\013\0139)!#\002,\006\022\021QV\001DMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AI+G/\036:og\002:\b.\032;iKJ\004C\017[3!M&dW\rI:zgR,W\016I5tAI,\027\rZ\027p]2Lh\006C\004\0022\002!\t!a-\002\025M\004\030mY3U_R\fG\016\006\004\002\\\005U\026q\027\005\t\003K\ny\0131\001\002h!A\021QOAX\001\004\t9\b\013\007\0020\006}\024QQAD\003\023\013Y,\t\002\002>\0069e-\0368di&|g\016K\025;]Vl'-\032:![5\002C\013[3!_Z,'/\0317mA\r\f\007/Y2jif\004sN\032\021uQ\026\004c-\0337fAML8\017^3nY\001Jg\016\t2zi\026\034h\006C\004\002B\002!\t!a1\002\023M\004\030mY3Vg\026$GCBA.\003\013\f9\r\003\005\002f\005}\006\031AA4\021!\t)(a0A\002\005]\004\006DA`\003\n))a\"\002\n\006-\027EAAg\00393WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001\"\006.\032\021dkJ\024XM\034;ms\002*8/\0323!G\006\004\030mY5us\002zg\r\t;iK\0022\027\016\\3!gf\034H/Z7-A%t\007EY=uKNt\003bBAi\001\021\005\0211[\001\007KbL7\017^:\025\r\005m\023Q[Al\021!\t)'a4A\002\005\035\004\002CA;\003\037\004\r!a\036)\031\005=\027qPAC\003\017\013I)a7\"\005\005u\027\001\0364v]\016$\030n\0348)a\006$\bNO:ue&tw-\013\036c_>dW-\0318![5\002#+\032;ve:\034\be\0365fi\",'\017I1oA=\024'.Z2uA\025D\030n\035;tA\005$\b\005\0365fAM\004XmY5gS\026$\007%\0312t_2,H/\032\021qCRD\007%\0338!i\",\007EZ5mK\002\032\030p\035;f[:Bq!!9\001\t\003\t\031/\001\003tSj,GCBA.\003K\f9\017\003\005\002f\005}\007\031AA4\021!\t)(a8A\002\005]\004\006DAp\003\n))a\"\002\n\006-\030EAAw\003E4WO\\2uS>t\007\006]1uQj\032HO]5oO&Rd.^7cKJ\004S&\f\021SKR,(O\\:!i\",\007e]5{K\002zg\r\t;iK\002z'M[3di\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI1cg>dW\017^3!a\006$\b\016I5oAQDW\r\t4jY\026\0043/_:uK6t\003bBAy\001\021\005\0211_\001\fSN$\025N]3di>\024\030\020\006\004\002\\\005U\030q\037\005\t\003K\ny\0171\001\002h!A\021QOAx\001\004\t9\b\013\007\002p\006}\024QQAD\003\023\013Y0\t\002\002~\006ih-\0368di&|g\016\0139bi\"T4\017\036:j]\036L#HY8pY\026\fg\016I\027.AI+G/\036:og\002:\b.\032;iKJ\004C\017[3!_\nTWm\031;!CR\004C\017[3!gB,7-\0334jK\022\004\023MY:pYV$X\r\t9bi\"\004\023N\034\021uQ\026\004c-\0337fAML8\017^3nA%\034\b%\031\021eSJ,7\r^8ss:BqA!\001\001\t\003\021\031!\001\007mCN$Xj\0343jM&,G\r\006\004\002\\\t\025!q\001\005\t\003K\ny\0201\001\002h!A\021QOA\000\001\004\t9\b\013\007\002\000\006}\024QQAD\003\023\023Y!\t\002\003\016\005\tYCZ;oGRLwN\034\025qCRD'h\035;sS:<\027F\0178v[\n,'\017I\027.AI+G/\036:og\002\"\b.\032\021)e\026\fG\016I<pe2$\027\006\t;j[\026\034H/Y7qA=4\007e\0365f]\002\"\b.\032\021pE*,7\r\036\021bi\002\"\b.\032\021ta\026\034\027NZ5fI\002\n'm]8mkR,\007\005]1uQ\002Jg\016\t;iK\0022\027\016\\3!gf\034H/Z7!o\006\034\b%\\8eS\032LW\r\032\030\t\017\tE\001\001\"\001\003\024\005!A.[:u)\031\tYF!\006\003\030!A\021Q\rB\b\001\004\t9\007\003\005\002v\t=\001\031AA<Q!\021y!a \002\n\nm\021E\001B\017\003\005-a-\0368di&|g\016\0139bi\"T4\017\036:j]\036L#\b^1cY\026\004S&\f\021SKR,(O\\:!C\002b\027n\035;!_\032\004c.Y7fg\002zg\rI8cU\026\034Go\035\021j]\002\"\b.\032\021eSJ,7\r^8ss\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI1cg>dW\017^3!a\006$\b\016I5oAQDW\r\t4jY\026\0043/_:uK6t\003b\002B\021\001\021\005!1E\001\016[\006\\W\rR5sK\016$xN]=\025\r\005m#Q\005B\024\021!\t)Ga\bA\002\005\035\004\002CA;\005?\001\r!a\036)\021\t}\021qPAE\005W\t#A!\f\002\003G1WO\\2uS>t\007\006]1uQj\032HO]5oO&R$m\\8mK\006t\007%L\027!\007J,\027\r^3tA\005\004C-\033:fGR|'/\037\021bi\002\"\b.\032\021ta\026\034\027NZ5fI\002\n'm]8mkR,\007\005]1uQ\002Jg\016\t;iK\0022\027\016\\3!gf\034H/Z7/A\r\023X-\031;fg\002\002\030M]3oi\002\"\027N]3di>\024\030.Z:-A%4\007E\\3dKN\034\030M]=/\021\035\021\t\004\001C\001\005g\taA]3n_Z,GCBA.\005k\0219\004\003\005\002f\t=\002\031AA4\021!\t)Ha\fA\002\005]\004\006\003B\030\003\nIIa\017\"\005\tu\022A\0324v]\016$\030n\0348)a\006$\bNO:ue&tw-\013\036c_>dW-\0318![5\002#+Z7pm\026\034\b\005\0365fA=\024'.Z2uA\005$\b\005\0365fAM\004XmY5gS\026$\007%\0312t_2,H/\032\021qCRD\007%\0338!i\",\007EZ5mK\002\032\030p\035;f[:BqA!\021\001\t\003\021\031%\001\004sK:\fW.\032\013\007\0037\022)Ea\022\t\021\005\025$q\ba\001\003OB\001\"!\036\003@\001\007\021q\017\025\t\005\ty(!#\003L\005\022!QJ\001\002\032\031,hn\031;j_:DcM]8nuM$(/\0338hY\001\"xNO:ue&tw-\013\036c_>dW-\0318![5\002#+\0328b[\026\034x&\\8wKN\004\023M\034\021pE*,7\r\036\021ge>l\007\005\0365fA\031L'o\035;!gB,7-\0334jK\022\004\023MY:pYV$X\r\t9bi\"\004\023N\034\021uQ\026\004c-\0337fAML8\017^3nAQ|\007\005\0365fAM,7m\0348e]!9!\021\013\001\005\002\tM\023!B2m_N,GCBA.\005+\0229\006\003\005\002f\t=\003\031AA4\021!\t)Ha\024A\002\005]\004\006\004B(\003\n))a\"\002\n\nm\023E\001B/\003Y3WO\\2uS>t\007\006[1oI2,'(^:fe\022\fG/Y\025![5\0023\t\\8tKN\004\023M\034\021pa\026t\007EZ5mK\002\"Wm]2sSB$xN\035\021xSRD\007\005\0365fAM\004XmY5gS\026$\007\005[1oI2,g\006C\004\003b\001!\tAa\031\002\t=\004XM\034\013\007\0037\022)Ga\032\t\021\005\025$q\fa\001\003OB\001\"!\036\003`\001\007\021q\017\025\021\005?\ny(!\"\002\b\n-$QNAE\005_\nQ\001\\5nSRl\022\001B\021\003\005c\n\001NZ;oGRLwN\034\025qCRD'h\035;sS:<7\f\f\021n_\022,'h\035;sS:<Wh\n:(;&RTo]3sI\006$\030\rI\027.A=\003XM\\:!C\002rWm\036\021gS2,\007\005Z3tGJL\007\017^8sA\005tG\r\t:fiV\024hn\035\021jiN\004\003.\0318eY\026t\003b\002B;\001\021\005!qO\001\005e\026\fG\r\006\004\002\\\te$1\020\005\t\003K\022\031\b1\001\002h!A\021Q\017B:\001\004\t9\b\013\t\003t\005}\024QQAD\005W\022y(!#\003\002v\tq\"\t\002\003\004\006\t)HZ;oGRLwN\034\025iC:$G.\032\036vg\026\024H-\031;bY\001\032w.\0368uu9,XNY3sSi\032HO]5oO\002z'\017\t8jY\002jS\006\t*fC\022\034\b%\0369!i>\004C\017[3!gB,7-\0334jK\022\004\023-\\8v]R\004sN\032\021eCR\f\007E\032:p[\002\ng\016I8qK:\004c-\0337fA\021,7o\031:jaR|'\017I<ji\"\004C\017[3!gB,7-\0334jK\022\004\003.\0318eY\026t\003EU3ukJt7\017\t8jY\002:\b.\0328!\013>3\005%[:!e\026\f7\r[3e]!9!q\021\001\005\002\t%\025\001B:fK.$b!a\027\003\f\n5\005\002CA3\005\013\003\r!a\032\t\021\005U$Q\021a\001\003oBCB!\"\002\000\005\025\025qQAE\005#\013#Aa%\002\0031WO\\2uS>t\007\006[1oI2,'(^:fe\022\fG/\031\027!o\",gnY3;gR\024\030N\\4-A=4gm]3uu9,XNY3sSirW/\0342fe\002jS\006I*fK.\034\b%\0338!C:\004s\016]3oA\031LG.\032\021eKN\034'/\0339u_J\004s/\033;iAQDW\rI:qK\016Lg-[3eA!\fg\016\0327f]\001\022V\r^;s]N\004C\017[3!]\026<\b\005]8j]R,'\017\t9pg&$\030n\0348/\021\035\0219\n\001C\001\0053\013Qa\036:ji\026$b!a\027\003\034\nu\005\002CA3\005+\003\r!a\032\t\021\005U$Q\023a\001\003oBCB!&\002\000\005\025\025qQAE\005C\013#Aa)\002\003\0131WO\\2uS>t\007\006[1oI2,'(^:fe\022\fG/\031\027!m\006dW/\032\036tiJLgnZ\025;E>|G.Z1oA5j\003e\026:ji\026\034\b\005\0365fAM\004XmY5gS\026$\007\005Z1uC\002\"x\016I1oA=\004XM\034\021gS2,\007\005Z3tGJL\007\017^8sA]LG\017\033\021uQ\026\0043\017]3dS\032LW\r\032\021iC:$G.\032\030\t\017\t\035\006\001\"\001\003*\006Y1\r[3dW\"\013g\016\0327f)\0259&1\026BW\021!\t)H!*A\002\005]\004b\002BX\005K\003\raV\001\006S:$W\r\037\005\b\005#\002A\021\001BZ)\025y#Q\027B\\\021!\t)G!-A\002\005\035\004b\002B]\005c\003\raV\001\007Q\006tG\r\\3\t\017\tu\006\001\"\021\003@\006IqN\\'fgN\fw-\032\013\004_\t\005\007\002\003Bb\005w\003\rA!2\002\0175,7o]1hKB\031\001Ia2\n\007\t%\027IA\004NKN\034\030mZ3\t\017\t5\007\001\"\021\003P\006aqN\034#jg\016|gN\\3diR\031qF!5\t\017\035\024Y\r1\001\003TB\031\001I!6\n\007\t]\027I\001\003O_\022,\007b\002Bn\001\021\005#Q\\\001\005Y>\fG\rF\0020\005?D\001B!9\003Z\002\007!1]\001\004]\n$\b\003\002Bs\005cl!Aa:\013\t\t\005(\021\036\006\005\005W\024i/A\005nS:,7M]1gi*\021!q^\001\004]\026$\030\002\002Bz\005O\024aB\024\"U)\006<7i\\7q_VtG\rC\004\003x\002!\tE!?\002\tM\fg/\032\013\004_\tm\b\002\003Bq\005k\004\rAa9\t\017\t}\b\001\"\003\004\002\005)1\r\\3b]R!\0211GB\002\021\035\031)A!@A\002-\013A\001]1uQ\"91\021\002\001\005\n\r-\021!\0039beN,Wj\0343f)\021\031iaa\005\021\007\001\032y!C\002\004\022\005\022A!T8eK\"91QCB\004\001\004Y\025!\002<bYV,\007bBB\r\001\021%11D\001\013G\",7m[(x]\026\024H#B\030\004\036\r\005\002bBB\020\007/\001\raS\001\006_^tWM\035\005\b\005s\0339\0021\001X\021\035\031)\003\001C\005\007O\tA\002Z5tW\006\033G/\033<jif$\022a\f")
/*     */ public class FileSystem extends ManagedEnvironment implements DeviceInfo {
/*     */   private final li.cil.oc.api.fs.FileSystem fileSystem;
/*     */   private Label label;
/*     */   
/*  34 */   public li.cil.oc.api.fs.FileSystem fileSystem() { return this.fileSystem; } private final Option<EnvironmentHost> host; private final Option<String> sound; private final int speed; public Label label() { return this.label; } public void label_$eq(Label x$1) { this.label = x$1; } public Option<EnvironmentHost> host() { return this.host; } public Option<String> sound() { return this.sound; } public int speed() { return this.speed; }
/*  35 */    private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  36 */     .withComponent("filesystem", Visibility.Neighbors)
/*  37 */     .withConnector()
/*  38 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*  40 */   } private final Map<String, Set<Object>> li$cil$oc$server$component$FileSystem$$owners = Map$.MODULE$.empty(); public Map<String, Set<Object>> li$cil$oc$server$component$FileSystem$$owners() { return this.li$cil$oc$server$component$FileSystem$$owners; }
/*     */   
/*  42 */   private final double[] readCosts = new double[] { 1.0D, 0.25D, 0.14285714285714285D, 0.1D, 0.07692307692307693D, 0.06666666666666667D }; public final double[] readCosts() { return this.readCosts; }
/*  43 */    private final double[] seekCosts = new double[] { 1.0D, 0.25D, 0.14285714285714285D, 0.1D, 0.07692307692307693D, 0.06666666666666667D }; public final double[] seekCosts() { return this.seekCosts; }
/*  44 */    private final double[] writeCosts = new double[] { 1.0D, 0.5D, 0.3333333333333333D, 0.25D, 0.2D, 0.16666666666666666D }; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public final double[] writeCosts() { return this.writeCosts; }
/*     */ 
/*     */   
/*     */   private Map deviceInfo$lzycompute() {
/*  48 */     synchronized (this) { if (!this.bitmap$0) { (new Tuple2[7])[0] = Predef$ArrowAssoc$.MODULE$
/*  49 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "volume");
/*  50 */         (new Tuple2[7])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Filesystem");
/*  51 */         (new Tuple2[7])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  52 */         (new Tuple2[7])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "MPFS.21.6");
/*  53 */         (new Tuple2[7])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger((int)(fileSystem().spaceTotal() * 1.024D)).toString());
/*  54 */         (new Tuple2[7])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToLong(fileSystem().spaceTotal()).toString());
/*  55 */         (new Tuple2[7])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("clock"), (new StringBuilder()).append(BoxesRunTime.boxToInteger((int)('ߐ' / readCosts()[speed()]) / 100).toString()).append("/").append(BoxesRunTime.boxToInteger((int)('ߐ' / seekCosts()[speed()]) / 100).toString()).append("/").append(BoxesRunTime.boxToInteger((int)('ߐ' / writeCosts()[speed()]) / 100).toString()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */   
/*  58 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():string -- Get the current label of the drive.")
/*     */   public Object[] getLabel(Context context, Arguments args) {
/*  63 */     synchronized (fileSystem()) { return 
/*  64 */         (label() == null) ? null : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label().getLabel() })); }
/*     */   
/*     */   } @Callback(doc = "function(value:string):string -- Sets the label of the drive. Returns the new value, which may be truncated.")
/*     */   public Object[] setLabel(Context context, Arguments args) {
/*  68 */     synchronized (fileSystem()) {
/*  69 */       if (label() == null) throw new Exception("drive does not support labeling"); 
/*  70 */       if (args.checkAny(0) == null) { label().setLabel(null); }
/*  71 */       else { label().setLabel(args.checkString(0)); }
/*  72 */        return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label().getLabel() }));
/*     */     } 
/*     */   } @Callback(direct = true, doc = "function():boolean -- Returns whether the file system is read-only.")
/*     */   public Object[] isReadOnly(Context context, Arguments args) {
/*  76 */     synchronized (fileSystem()) { return 
/*  77 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(fileSystem().isReadOnly()) })); }
/*     */   
/*     */   } @Callback(direct = true, doc = "function():number -- The overall capacity of the file system, in bytes.")
/*     */   public Object[] spaceTotal(Context context, Arguments args) {
/*  81 */     synchronized (fileSystem()) {
/*  82 */       long space = fileSystem().spaceTotal();
/*  83 */       return (space < 0L) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(Double.POSITIVE_INFINITY)
/*  84 */             })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(space) }));
/*     */     } 
/*     */   } @Callback(direct = true, doc = "function():number -- The currently used capacity of the file system, in bytes.")
/*     */   public Object[] spaceUsed(Context context, Arguments args) {
/*  88 */     synchronized (fileSystem()) { return 
/*  89 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(fileSystem().spaceUsed()) })); }
/*     */   
/*     */   } @Callback(direct = true, doc = "function(path:string):boolean -- Returns whether an object exists at the specified absolute path in the file system.")
/*     */   public Object[] exists(Context context, Arguments args) {
/*  93 */     synchronized (fileSystem()) {
/*  94 */       diskActivity();
/*  95 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(fileSystem().exists(clean(args.checkString(0)))) }));
/*     */     } 
/*     */   } @Callback(direct = true, doc = "function(path:string):number -- Returns the size of the object at the specified absolute path in the file system.")
/*     */   public Object[] size(Context context, Arguments args) {
/*  99 */     synchronized (fileSystem()) {
/* 100 */       diskActivity();
/* 101 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(fileSystem().size(clean(args.checkString(0)))) }));
/*     */     } 
/*     */   } @Callback(direct = true, doc = "function(path:string):boolean -- Returns whether the object at the specified absolute path in the file system is a directory.")
/*     */   public Object[] isDirectory(Context context, Arguments args) {
/* 105 */     synchronized (fileSystem()) {
/* 106 */       diskActivity();
/* 107 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(fileSystem().isDirectory(clean(args.checkString(0)))) }));
/*     */     } 
/*     */   } @Callback(direct = true, doc = "function(path:string):number -- Returns the (real world) timestamp of when the object at the specified absolute path in the file system was modified.")
/*     */   public Object[] lastModified(Context context, Arguments args) {
/* 111 */     synchronized (fileSystem()) {
/* 112 */       diskActivity();
/* 113 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(fileSystem().lastModified(clean(args.checkString(0)))) }));
/*     */     } 
/*     */   }
/*     */   @Callback(doc = "function(path:string):table -- Returns a list of names of objects in the directory at the specified absolute path in the file system.")
/* 117 */   public Object[] list(Context context, Arguments args) { synchronized (fileSystem()) {
/* 118 */       Object[] arrayOfObject2; Option option = Option$.MODULE$.apply(fileSystem().list(clean(args.checkString(0))));
/* 119 */       if (option instanceof Some) { Some some = (Some)option; String[] list = (String[])some.x();
/* 120 */         diskActivity();
/* 121 */         arrayOfObject2 = new Object[] { list }; }
/* 122 */       else { arrayOfObject2 = null; }
/*     */       
/*     */       Object[] arrayOfObject1 = arrayOfObject2;
/*     */       return arrayOfObject1;
/*     */     }  } @Callback(doc = "function(path:string):boolean -- Creates a directory at the specified absolute path in the file system. Creates parent directories, if necessary.")
/* 127 */   public Object[] makeDirectory(Context context, Arguments args) { synchronized (fileSystem()) {
/*     */ 
/*     */       
/* 130 */       boolean success = recurse$1(clean(args.checkString(0)));
/* 131 */       diskActivity();
/* 132 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(success) }));
/*     */     }  }
/*     */   private final boolean recurse$1(String path) { return (!fileSystem().exists(path) && (fileSystem().makeDirectory(path) || (recurse$1(Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])path.split("/")).dropRight(1)).mkString("/")) && fileSystem().makeDirectory(path)))); }
/*     */   @Callback(doc = "function(path:string):boolean -- Removes the object at the specified absolute path in the file system.")
/* 136 */   public Object[] remove(Context context, Arguments args) { synchronized (fileSystem()) {
/*     */ 
/*     */       
/* 139 */       boolean success = li$cil$oc$server$component$FileSystem$$recurse$2(clean(args.checkString(0)));
/* 140 */       diskActivity();
/* 141 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(success) }));
/*     */     }  } public final boolean li$cil$oc$server$component$FileSystem$$recurse$2(String parent) { return ((!fileSystem().isDirectory(parent) || Predef$.MODULE$.refArrayOps((Object[])fileSystem().list(parent)).forall((Function1)new FileSystem$$anonfun$li$cil$oc$server$component$FileSystem$$recurse$2$1(this, parent))) && fileSystem().delete(parent)); } public final class FileSystem$$anonfun$li$cil$oc$server$component$FileSystem$$recurse$2$1 extends AbstractFunction1<String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String parent$1; public final boolean apply(String child) { return this.$outer.li$cil$oc$server$component$FileSystem$$recurse$2((new StringBuilder()).append(this.parent$1).append("/").append(child).toString()); }
/*     */     public FileSystem$$anonfun$li$cil$oc$server$component$FileSystem$$recurse$2$1(FileSystem $outer, String parent$1) {} }
/* 145 */   @Callback(doc = "function(from:string, to:string):boolean -- Renames/moves an object from the first specified absolute path in the file system to the second.") public Object[] rename(Context context, Arguments args) { synchronized (fileSystem()) {
/* 146 */       boolean success = fileSystem().rename(clean(args.checkString(0)), clean(args.checkString(1)));
/* 147 */       diskActivity();
/* 148 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(success) }));
/*     */     }  }
/*     */   
/*     */   @Callback(direct = true, doc = "function(handle:userdata) -- Closes an open file descriptor with the specified handle.")
/* 152 */   public Object[] close(Context context, Arguments args) { synchronized (fileSystem()) {
/* 153 */       close(context, checkHandle(args, 0));
/* 154 */       Object[] arrayOfObject = null;
/*     */       return arrayOfObject;
/*     */     }  }
/*     */   @Callback(direct = true, limit = 4, doc = "function(path:string[, mode:string='r']):userdata -- Opens a new file descriptor and returns its handle.")
/* 158 */   public Object[] open(Context context, Arguments args) { synchronized (fileSystem())
/* 159 */     { if (BoxesRunTime.unboxToBoolean(li$cil$oc$server$component$FileSystem$$owners().get(context.node().address()).fold((Function0)new FileSystem$$anonfun$open$1(this), (Function1)new FileSystem$$anonfun$open$2(this)))) {
/* 160 */         throw new IOException("too many open handles");
/*     */       }
/* 162 */       String path = args.checkString(0);
/* 163 */       String mode = args.optString(1, "r");
/* 164 */       int handle = fileSystem().open(clean(path), parseMode(mode));
/* 165 */       (handle > 0) ? (
/* 166 */         (SetLike)li$cil$oc$server$component$FileSystem$$owners().getOrElseUpdate(context.node().address(), (Function0)new FileSystem$$anonfun$open$3(this))).$plus$eq(BoxesRunTime.boxToInteger(handle)) : BoxedUnit.UNIT;
/*     */       
/* 168 */       diskActivity();
/* 169 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { new HandleValue(node().address(), handle) })); }  } public final class FileSystem$$anonfun$open$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public FileSystem$$anonfun$open$1(FileSystem $outer) {} } public final class FileSystem$$anonfun$open$2 extends AbstractFunction1<Set<Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Set x$1) { return (x$1.size() >= Settings$.MODULE$.get().maxHandles()); } public FileSystem$$anonfun$open$2(FileSystem $outer) {} } public final class FileSystem$$anonfun$open$3 extends AbstractFunction0<Set<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Set<Object> apply() { return Set$.MODULE$.empty(); } public FileSystem$$anonfun$open$3(FileSystem $outer) {} }
/* 173 */   @Callback(direct = true, limit = 15, doc = "function(handle:userdata, count:number):string or nil -- Reads up to the specified amount of data from an open file descriptor with the specified handle. Returns nil when EOF is reached.") public Object[] read(Context context, Arguments args) { synchronized (fileSystem()) {
/* 174 */       context.consumeCallBudget(readCosts()[speed()]);
/* 175 */       int handle = checkHandle(args, 0);
/* 176 */       int n = package$.MODULE$.min(Settings$.MODULE$.get().maxReadBuffer(), package$.MODULE$.max(0, args.checkInteger(1)));
/* 177 */       checkOwner(context.node().address(), handle);
/* 178 */       Option option = Option$.MODULE$.apply(fileSystem().getHandle(handle));
/* 179 */       if (option instanceof Some) { Some some = (Some)option; Handle file = (Handle)some.x();
/*     */         
/* 181 */         byte[] buffer = new byte[n];
/* 182 */         int read = file.read(buffer);
/* 183 */         if (read >= 0)
/*     */         
/*     */         { 
/*     */ 
/*     */           
/* 188 */           byte[] arrayOfByte1 = new byte[read];
/* 189 */           Array$.MODULE$.copy(buffer, 0, arrayOfByte1, 0, read);
/* 190 */           byte[] bytes = (read == buffer.length) ? buffer : arrayOfByte1;
/*     */           
/* 192 */           if (node().tryChangeBuffer(-Settings$.MODULE$.get().hddReadCost() * bytes.length))
/*     */           
/*     */           { 
/* 195 */             diskActivity(); }
/*     */           else { throw new IOException("not enough energy"); }
/*     */            }
/*     */         else {  }
/* 199 */          Object[] arrayOfObject2 = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$ })); Object[] arrayOfObject1 = arrayOfObject2; }
/*     */       
/* 201 */       throw new IOException("bad file descriptor");
/*     */     }  }
/*     */   
/*     */   @Callback(direct = true, doc = "function(handle:userdata, whence:string, offset:number):number -- Seeks in an open file descriptor with the specified handle. Returns the new pointer position.")
/*     */   public Object[] seek(Context context, Arguments args) {
/* 206 */     synchronized (fileSystem()) {
/* 207 */       context.consumeCallBudget(seekCosts()[speed()]);
/* 208 */       int handle = checkHandle(args, 0);
/* 209 */       String whence = args.checkString(1);
/* 210 */       int offset = args.checkInteger(2);
/* 211 */       checkOwner(context.node().address(), handle);
/* 212 */       Option option = Option$.MODULE$.apply(fileSystem().getHandle(handle));
/* 213 */       if (option instanceof Some) { long l; Some some = (Some)option; Handle file = (Handle)some.x();
/* 214 */         String str = whence;
/* 215 */         if ("cur".equals(str)) { l = file.seek(file.position() + offset); }
/* 216 */         else if ("set".equals(str)) { l = file.seek(offset); }
/* 217 */         else if ("end".equals(str)) { l = file.seek(file.length() + offset); }
/* 218 */         else { throw new IllegalArgumentException("invalid mode"); }
/*     */         
/* 220 */         Object[] arrayOfObject2 = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(file.position()) })); Object[] arrayOfObject1 = arrayOfObject2; }
/* 221 */        throw new IOException("bad file descriptor");
/*     */     } 
/*     */   }
/*     */   @Callback(direct = true, doc = "function(handle:userdata, value:string):boolean -- Writes the specified data to an open file descriptor with the specified handle.")
/*     */   public Object[] write(Context context, Arguments args) {
/* 226 */     synchronized (fileSystem()) {
/* 227 */       context.consumeCallBudget(writeCosts()[speed()]);
/* 228 */       int handle = checkHandle(args, 0);
/* 229 */       byte[] value = args.checkByteArray(1);
/* 230 */       if (node().tryChangeBuffer(-Settings$.MODULE$.get().hddWriteCost() * value.length)) {
/*     */ 
/*     */         
/* 233 */         checkOwner(context.node().address(), handle);
/* 234 */         Option option = Option$.MODULE$.apply(fileSystem().getHandle(handle));
/* 235 */         if (option instanceof Some) { Some some = (Some)option; Handle file = (Handle)some.x();
/* 236 */           file.write(value);
/* 237 */           diskActivity();
/* 238 */           Object[] arrayOfObject2 = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); Object[] arrayOfObject1 = arrayOfObject2; }
/* 239 */          throw new IOException("bad file descriptor");
/*     */       } 
/*     */       throw new IOException("not enough energy");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkHandle(Arguments args, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_2
/*     */     //   2: invokeinterface isInteger : (I)Z
/*     */     //   7: ifeq -> 20
/*     */     //   10: aload_1
/*     */     //   11: iload_2
/*     */     //   12: invokeinterface checkInteger : (I)I
/*     */     //   17: goto -> 115
/*     */     //   20: aload_1
/*     */     //   21: iload_2
/*     */     //   22: invokeinterface isTable : (I)Z
/*     */     //   27: ifeq -> 82
/*     */     //   30: aload_1
/*     */     //   31: iload_2
/*     */     //   32: invokeinterface checkTable : (I)Ljava/util/Map;
/*     */     //   37: ldc_w 'handle'
/*     */     //   40: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: instanceof java/lang/Number
/*     */     //   50: ifeq -> 71
/*     */     //   53: aload_3
/*     */     //   54: checkcast java/lang/Number
/*     */     //   57: astore #4
/*     */     //   59: aload #4
/*     */     //   61: invokevirtual intValue : ()I
/*     */     //   64: istore #5
/*     */     //   66: iload #5
/*     */     //   68: goto -> 115
/*     */     //   71: new java/io/IOException
/*     */     //   74: dup
/*     */     //   75: ldc_w 'bad file descriptor'
/*     */     //   78: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   81: athrow
/*     */     //   82: aload_1
/*     */     //   83: iload_2
/*     */     //   84: invokeinterface checkAny : (I)Ljava/lang/Object;
/*     */     //   89: astore #6
/*     */     //   91: aload #6
/*     */     //   93: instanceof li/cil/oc/server/component/HandleValue
/*     */     //   96: ifeq -> 116
/*     */     //   99: aload #6
/*     */     //   101: checkcast li/cil/oc/server/component/HandleValue
/*     */     //   104: astore #7
/*     */     //   106: aload #7
/*     */     //   108: invokevirtual handle : ()I
/*     */     //   111: istore #8
/*     */     //   113: iload #8
/*     */     //   115: ireturn
/*     */     //   116: new java/io/IOException
/*     */     //   119: dup
/*     */     //   120: ldc_w 'bad file descriptor'
/*     */     //   123: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   126: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #246	-> 0
/*     */     //   #247	-> 10
/*     */     //   #248	-> 20
/*     */     //   #249	-> 30
/*     */     //   #250	-> 46
/*     */     //   #249	-> 66
/*     */     //   #251	-> 71
/*     */     //   #253	-> 82
/*     */     //   #254	-> 91
/*     */     //   #253	-> 113
/*     */     //   #246	-> 115
/*     */     //   #255	-> 116
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	127	0	this	Lli/cil/oc/server/component/FileSystem;
/*     */     //   0	127	1	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   0	127	2	index	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close(Context context, int handle) {
/* 260 */     Option option = Option$.MODULE$.apply(fileSystem().getHandle(handle));
/* 261 */     if (option instanceof Some) { Some some = (Some)option; Handle file = (Handle)some.x();
/* 262 */       Option option1 = li$cil$oc$server$component$FileSystem$$owners().get(context.node().address());
/* 263 */       if (option1 instanceof Some) { Some some1 = (Some)option1; Set set = (Set)some1.x(); if (set.remove(BoxesRunTime.boxToInteger(handle))) { file.close(); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }  }
/* 264 */        throw new IOException("bad file descriptor"); }
/*     */     
/* 266 */     throw new IOException("bad file descriptor");
/*     */   }
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual fileSystem : ()Lli/cil/oc/api/fs/FileSystem;
/*     */     //   4: dup
/*     */     //   5: astore_2
/*     */     //   6: monitorenter
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   12: aload_1
/*     */     //   13: invokeinterface name : ()Ljava/lang/String;
/*     */     //   18: ldc_w 'computer.stopped'
/*     */     //   21: astore_3
/*     */     //   22: dup
/*     */     //   23: ifnonnull -> 34
/*     */     //   26: pop
/*     */     //   27: aload_3
/*     */     //   28: ifnull -> 73
/*     */     //   31: goto -> 41
/*     */     //   34: aload_3
/*     */     //   35: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   38: ifne -> 73
/*     */     //   41: aload_1
/*     */     //   42: invokeinterface name : ()Ljava/lang/String;
/*     */     //   47: ldc_w 'computer.started'
/*     */     //   50: astore #4
/*     */     //   52: dup
/*     */     //   53: ifnonnull -> 65
/*     */     //   56: pop
/*     */     //   57: aload #4
/*     */     //   59: ifnull -> 73
/*     */     //   62: goto -> 161
/*     */     //   65: aload #4
/*     */     //   67: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   70: ifeq -> 161
/*     */     //   73: aload_0
/*     */     //   74: invokevirtual li$cil$oc$server$component$FileSystem$$owners : ()Lscala/collection/mutable/Map;
/*     */     //   77: aload_1
/*     */     //   78: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   83: invokeinterface address : ()Ljava/lang/String;
/*     */     //   88: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   93: astore #5
/*     */     //   95: aload #5
/*     */     //   97: instanceof scala/Some
/*     */     //   100: ifeq -> 150
/*     */     //   103: aload #5
/*     */     //   105: checkcast scala/Some
/*     */     //   108: astore #6
/*     */     //   110: aload #6
/*     */     //   112: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   115: checkcast scala/collection/mutable/Set
/*     */     //   118: astore #7
/*     */     //   120: aload #7
/*     */     //   122: new li/cil/oc/server/component/FileSystem$$anonfun$onMessage$1
/*     */     //   125: dup
/*     */     //   126: aload_0
/*     */     //   127: invokespecial <init> : (Lli/cil/oc/server/component/FileSystem;)V
/*     */     //   130: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   135: aload #7
/*     */     //   137: invokeinterface clear : ()V
/*     */     //   142: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   145: astore #8
/*     */     //   147: goto -> 155
/*     */     //   150: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   153: astore #8
/*     */     //   155: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   158: goto -> 164
/*     */     //   161: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   164: pop
/*     */     //   165: aload_2
/*     */     //   166: monitorexit
/*     */     //   167: return
/*     */     //   168: aload_2
/*     */     //   169: monitorexit
/*     */     //   170: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #272	-> 0
/*     */     //   #273	-> 7
/*     */     //   #274	-> 12
/*     */     //   #275	-> 73
/*     */     //   #276	-> 95
/*     */     //   #277	-> 120
/*     */     //   #281	-> 135
/*     */     //   #276	-> 145
/*     */     //   #282	-> 150
/*     */     //   #275	-> 155
/*     */     //   #274	-> 161
/*     */     //   #272	-> 166
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	171	0	this	Lli/cil/oc/server/component/FileSystem;
/*     */     //   0	171	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   120	51	7	set	Lscala/collection/mutable/Set;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   7	167	168	finally
/*     */   }
/*     */   
/*     */   public final class FileSystem$$anonfun$onMessage$1 extends AbstractFunction1.mcVI.sp implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 277 */     public final void apply(int handle) { apply$mcVI$sp(handle); } public void apply$mcVI$sp(int handle) { Option option = Option$.MODULE$.apply(this.$outer.fileSystem().getHandle(handle));
/* 278 */       if (option instanceof Some) { Some some = (Some)option; Handle file = (Handle)some.x(); file.close(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 279 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */ 
/*     */     
/*     */     public FileSystem$$anonfun$onMessage$1(FileSystem $outer) {}
/*     */   }
/*     */   
/*     */   public void onDisconnect(Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual fileSystem : ()Lli/cil/oc/api/fs/FileSystem;
/*     */     //   4: dup
/*     */     //   5: astore_2
/*     */     //   6: monitorenter
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: invokespecial onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   12: aload_1
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   17: astore_3
/*     */     //   18: dup
/*     */     //   19: ifnonnull -> 30
/*     */     //   22: pop
/*     */     //   23: aload_3
/*     */     //   24: ifnull -> 37
/*     */     //   27: goto -> 52
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 52
/*     */     //   37: aload_0
/*     */     //   38: invokevirtual fileSystem : ()Lli/cil/oc/api/fs/FileSystem;
/*     */     //   41: invokeinterface close : ()V
/*     */     //   46: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   49: goto -> 122
/*     */     //   52: aload_0
/*     */     //   53: invokevirtual li$cil$oc$server$component$FileSystem$$owners : ()Lscala/collection/mutable/Map;
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface address : ()Ljava/lang/String;
/*     */     //   62: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 119
/*     */     //   70: aload_0
/*     */     //   71: invokevirtual li$cil$oc$server$component$FileSystem$$owners : ()Lscala/collection/mutable/Map;
/*     */     //   74: aload_1
/*     */     //   75: invokeinterface address : ()Ljava/lang/String;
/*     */     //   80: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   85: checkcast scala/collection/IterableLike
/*     */     //   88: new li/cil/oc/server/component/FileSystem$$anonfun$onDisconnect$1
/*     */     //   91: dup
/*     */     //   92: aload_0
/*     */     //   93: invokespecial <init> : (Lli/cil/oc/server/component/FileSystem;)V
/*     */     //   96: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   101: aload_0
/*     */     //   102: invokevirtual li$cil$oc$server$component$FileSystem$$owners : ()Lscala/collection/mutable/Map;
/*     */     //   105: aload_1
/*     */     //   106: invokeinterface address : ()Ljava/lang/String;
/*     */     //   111: invokeinterface remove : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   116: goto -> 122
/*     */     //   119: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   122: pop
/*     */     //   123: aload_2
/*     */     //   124: monitorexit
/*     */     //   125: return
/*     */     //   126: aload_2
/*     */     //   127: monitorexit
/*     */     //   128: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #287	-> 0
/*     */     //   #288	-> 7
/*     */     //   #289	-> 12
/*     */     //   #290	-> 37
/*     */     //   #292	-> 52
/*     */     //   #293	-> 70
/*     */     //   #299	-> 101
/*     */     //   #292	-> 119
/*     */     //   #289	-> 122
/*     */     //   #287	-> 124
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	129	0	this	Lli/cil/oc/server/component/FileSystem;
/*     */     //   0	129	1	node	Lli/cil/oc/api/network/Node;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   7	125	126	finally
/*     */   }
/*     */   
/*     */   public final class FileSystem$$anonfun$onDisconnect$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 293 */     public final void apply(int handle) { apply$mcVI$sp(handle); } public FileSystem$$anonfun$onDisconnect$1(FileSystem $outer) {}
/* 294 */     public void apply$mcVI$sp(int handle) { Option option = Option$.MODULE$.apply(this.$outer.fileSystem().getHandle(handle));
/* 295 */       if (option instanceof Some) { Some some = (Some)option; Handle file = (Handle)some.x(); file.close(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 296 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */   } public final class FileSystem$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public FileSystem$$anonfun$load$1(FileSystem $outer) {} public final void apply(NBTTagCompound ownerNbt) { String address = ownerNbt.func_74779_i("address"); String str1 = ""; if (address == null) {
/*     */         if (str1 != null) {
/*     */           this.$outer.li$cil$oc$server$component$FileSystem$$owners().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(address), Predef$.MODULE$.intArrayOps(ownerNbt.func_74759_k("handles")).to(Set$.MODULE$.canBuildFrom()))); return;
/*     */         } 
/*     */       } else if (!address.equals(str1)) {
/*     */         this.$outer.li$cil$oc$server$component$FileSystem$$owners().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(address), Predef$.MODULE$.intArrayOps(ownerNbt.func_74759_k("handles")).to(Set$.MODULE$.canBuildFrom())));
/*     */         return;
/*     */       }  } }
/* 306 */   public void load(NBTTagCompound nbt) { super.load(nbt);
/*     */     
/* 308 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("owners", 10)).foreach((Function1)new FileSystem$$anonfun$load$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     if (label() != null) {
/* 316 */       label().load(nbt);
/*     */     }
/* 318 */     fileSystem().load(nbt.func_74775_l("fs")); } public final class FileSystem$$anonfun$save$1 extends AbstractFunction1<Tuple2<String, Set<Object>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }
/*     */        return bool; } public FileSystem$$anonfun$save$1(FileSystem $outer) {} }
/* 321 */   public void save(NBTTagCompound nbt) { synchronized (fileSystem())
/* 322 */     { super.save(nbt);
/*     */       
/* 324 */       if (label() != null) {
/* 325 */         label().save(nbt);
/*     */       }
/*     */ 
/*     */       
/* 329 */       NBTTagList ownersNbt = new NBTTagList();
/* 330 */       li$cil$oc$server$component$FileSystem$$owners().withFilter((Function1)new FileSystem$$anonfun$save$1(this)).foreach((Function1)new FileSystem$$anonfun$save$2(this, ownersNbt));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 336 */       nbt.func_74782_a("owners", (NBTBase)ownersNbt);
/*     */       
/* 338 */       SaveHandler$.MODULE$.savingForClients() ? BoxedUnit.UNIT : ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("fs", (Function1)new FileSystem$$anonfun$save$3(this)); return; }  } public final class FileSystem$$anonfun$save$2 extends AbstractFunction1<Tuple2<String, Set<Object>>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList ownersNbt$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { String address = (String)tuple2._1(); Set handles = (Set)tuple2._2(); NBTTagCompound ownerNbt = new NBTTagCompound(); ownerNbt.func_74778_a("address", address); ownerNbt.func_74782_a("handles", (NBTBase)new NBTTagIntArray((int[])handles.toArray(ClassTag$.MODULE$.Int()))); this.ownersNbt$1.func_74742_a((NBTBase)ownerNbt); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public FileSystem$$anonfun$save$2(FileSystem $outer, NBTTagList ownersNbt$1) {} } public final class FileSystem$$anonfun$save$3 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public final void apply(NBTTagCompound x$1) { this.$outer.fileSystem().save(x$1); }
/*     */ 
/*     */ 
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public FileSystem$$anonfun$save$3(FileSystem $outer) {} }
/*     */ 
/*     */   
/*     */   private String clean(String path) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic simplifyPath : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: ldc_w '../'
/*     */     //   9: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   12: ifne -> 39
/*     */     //   15: aload_2
/*     */     //   16: ldc_w '..'
/*     */     //   19: astore_3
/*     */     //   20: dup
/*     */     //   21: ifnonnull -> 32
/*     */     //   24: pop
/*     */     //   25: aload_3
/*     */     //   26: ifnull -> 39
/*     */     //   29: goto -> 48
/*     */     //   32: aload_3
/*     */     //   33: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   36: ifeq -> 48
/*     */     //   39: new java/io/FileNotFoundException
/*     */     //   42: dup
/*     */     //   43: aload_1
/*     */     //   44: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   47: athrow
/*     */     //   48: aload_2
/*     */     //   49: ldc '/'
/*     */     //   51: astore #4
/*     */     //   53: dup
/*     */     //   54: ifnonnull -> 66
/*     */     //   57: pop
/*     */     //   58: aload #4
/*     */     //   60: ifnull -> 101
/*     */     //   63: goto -> 74
/*     */     //   66: aload #4
/*     */     //   68: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   71: ifne -> 101
/*     */     //   74: aload_2
/*     */     //   75: ldc_w '.'
/*     */     //   78: astore #5
/*     */     //   80: dup
/*     */     //   81: ifnonnull -> 93
/*     */     //   84: pop
/*     */     //   85: aload #5
/*     */     //   87: ifnull -> 101
/*     */     //   90: goto -> 107
/*     */     //   93: aload #5
/*     */     //   95: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   98: ifeq -> 107
/*     */     //   101: ldc_w ''
/*     */     //   104: goto -> 108
/*     */     //   107: aload_2
/*     */     //   108: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #345	-> 0
/*     */     //   #346	-> 5
/*     */     //   #347	-> 48
/*     */     //   #348	-> 107
/*     */     //   #344	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	109	0	this	Lli/cil/oc/server/component/FileSystem;
/*     */     //   0	109	1	path	Ljava/lang/String;
/*     */     //   5	104	2	result	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private Mode parseMode(String value) {
/* 352 */     if ("r".equals(value) || "rb".equals(value)) return Mode.Read; 
/* 353 */     if ("w".equals(value) || "wb".equals(value)) return Mode.Write; 
/* 354 */     if ("a".equals(value) || "ab".equals(value)) return Mode.Append; 
/* 355 */     throw new IllegalArgumentException("unsupported mode");
/*     */   }
/*     */   
/*     */   private void checkOwner(String owner, int handle) {
/* 359 */     if (li$cil$oc$server$component$FileSystem$$owners().contains(owner) && ((SetLike)li$cil$oc$server$component$FileSystem$$owners().apply(owner)).contains(BoxesRunTime.boxToInteger(handle)))
/* 360 */       return;  throw new IOException("bad file descriptor");
/*     */   }
/*     */   private void diskActivity() {
/* 363 */     Tuple2 tuple2 = new Tuple2(sound(), host()); if (tuple2 != null) {
/* 364 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; String s = (String)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; EnvironmentHost h = (EnvironmentHost)some1.x(); PacketSender$.MODULE$.sendFileSystemActivity((Node)node(), h, s); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  } 
/* 365 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */   
/*     */   public FileSystem(li.cil.oc.api.fs.FileSystem fileSystem, Label label, Option<EnvironmentHost> host, Option<String> sound, int speed) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\FileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */