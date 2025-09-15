/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\005g\001B\001\003\0015\021Q\001\022:jm\026T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021!i\002A!b\001\n\003q\022\001C2ba\006\034\027\016^=\026\003}\001\"\001I\022\016\003\005R\021AI\001\006g\016\fG.Y\005\003I\005\0221!\0238u\021!1\003A!A!\002\023y\022!C2ba\006\034\027\016^=!\021!A\003A!b\001\n\003q\022\001\0049mCR$XM]\"pk:$\b\002\003\026\001\005\003\005\013\021B\020\002\033Ad\027\r\036;fe\016{WO\034;!\021!a\003A!b\001\n\003i\023!\0027bE\026dW#\001\030\021\005=\022T\"\001\031\013\005E\022\022A\0014t\023\t\031\004GA\003MC\n,G\016\003\0056\001\t\005\t\025!\003/\003\031a\027MY3mA!Aq\007\001B\001B\003%\001(\001\003i_N$\bc\001\021:w%\021!(\t\002\007\037B$\030n\0348\021\005qzT\"A\037\013\005y\022\022a\0028fi^|'o[\005\003\001v\022q\"\0228wSJ|g.\\3oi\"{7\017\036\005\t\005\002\021)\031!C\001\007\006)1o\\;oIV\tA\tE\002!s\025\003\"AR%\017\005\001:\025B\001%\"\003\031\001&/\0323fM&\021!j\023\002\007'R\024\030N\\4\013\005!\013\003\002C'\001\005\003\005\013\021\002#\002\rM|WO\0343!\021!y\005A!b\001\n\003q\022!B:qK\026$\007\002C)\001\005\003\005\013\021B\020\002\rM\004X-\0323!\021!\031\006A!b\001\n\003!\026\001C5t\031>\0347.\0323\026\003U\003\"\001\t,\n\005]\013#a\002\"p_2,\027M\034\005\t3\002\021\t\021)A\005+\006I\021n\035'pG.,G\r\t\005\0067\002!\t\001X\001\007y%t\027\016\036 \025\021u{\006-\0312dI\026\004\"A\030\001\016\003\tAQ!\b.A\002}AQ\001\013.A\002}AQ\001\f.A\0029BQa\016.A\002aBQA\021.A\002\021CQa\024.A\002}AQa\025.A\002UCqa\032\001C\002\023\005\003.\001\003o_\022,W#A5\021\005qR\027BA6>\005I\031u.\0349p]\026tGoQ8o]\026\034Go\034:\t\r5\004\001\025!\003j\003\025qw\016Z3!\021\025y\007\001\"\003q\003!\031\030M^3QCRDW#A9\021\005I<X\"A:\013\005Q,\030AA5p\025\0051\030\001\0026bm\006L!\001_:\003\t\031KG.\032\005\bu\002\021\r\021\"\004|\003)\031Xm\031;peNK'0Z\013\002y>\tQ0\b\002\003\001!1q\020\001Q\001\016q\f1b]3di>\0248+\033>fA!I\0211\001\001C\002\023%\021QA\001\005I\006$\030-\006\002\002\bA)\001%!\003\002\016%\031\0211B\021\003\013\005\023(/Y=\021\007\001\ny!C\002\002\022\005\022AAQ=uK\"A\021Q\003\001!\002\023\t9!A\003eCR\f\007\005\003\005\002\032\001\021\r\021\"\003\037\003-\031Xm\031;pe\016{WO\034;\t\017\005u\001\001)A\005?\005a1/Z2u_J\034u.\0368uA!A\021\021\005\001C\002\023%a$A\ttK\016$xN]:QKJ\004F.\031;uKJDq!!\n\001A\003%q$\001\ntK\016$xN]:QKJ\004F.\031;uKJ\004\003\002CA\025\001\001\007I\021\002\020\002\017!,\027\r\032)pg\"I\021Q\006\001A\002\023%\021qF\001\fQ\026\fG\rU8t?\022*\027\017\006\003\0022\005]\002c\001\021\0024%\031\021QG\021\003\tUs\027\016\036\005\n\003s\tY#!AA\002}\t1\001\037\0232\021\035\ti\004\001Q!\n}\t\001\002[3bIB{7\017\t\005\n\003\003\002!\031!C\003\003\007\nqB]3bIN+7\r^8s\007>\034Ho]\013\003\003\013\002R\001IA\005\003\017\0022\001IA%\023\r\tY%\t\002\007\t>,(\r\\3\t\021\005=\003\001)A\007\003\013\n\001C]3bIN+7\r^8s\007>\034Ho\035\021\t\023\005M\003A1A\005\006\005\r\023\001E<sSR,7+Z2u_J\034un\035;t\021!\t9\006\001Q\001\016\005\025\023!E<sSR,7+Z2u_J\034un\035;tA!I\0211\f\001C\002\023\025\0211I\001\016e\026\fGMQ=uK\016{7\017^:\t\021\005}\003\001)A\007\003\013\naB]3bI\nKH/Z\"pgR\034\b\005C\005\002d\001\021\r\021\"\002\002D\005qqO]5uK\nKH/Z\"pgR\034\b\002CA4\001\001\006i!!\022\002\037]\024\030\016^3CsR,7i\\:ug\002B!\"a\033\001\021\013\007IQBA7\003)!WM^5dK&sgm\\\013\003\003_\002\002\"!\035\002|\005}\024qP\007\003\003gRA!!\036\002x\005I\021.\\7vi\006\024G.\032\006\004\003s\n\023AC2pY2,7\r^5p]&!\021QPA:\005\ri\025\r\035\t\005\003\003\0139)\004\002\002\004*\031\021QQ;\002\t1\fgnZ\005\004\025\006\r\005BCAF\001!\005\t\025)\004\002p\005YA-\032<jG\026LeNZ8!\021\035\ty\t\001C!\003#\013QbZ3u\t\0264\030nY3J]\032|GCAAJ!\031\t)*a'F\0136\021\021q\023\006\004\0033+\030\001B;uS2LA!! \002\030\"9\021q\024\001\005\002\005\005\026\001C4fi2\013'-\0327\025\r\005\r\0261VA^!\025\001\023\021BAS!\r\001\023qU\005\004\003S\013#AB!osJ+g\r\003\005\002.\006u\005\031AAX\003\035\031wN\034;fqR\004B!!-\00286\021\0211\027\006\004\003k\023\022aB7bG\"Lg.Z\005\005\003s\013\031LA\004D_:$X\r\037;\t\021\005u\026Q\024a\001\003\013A!\031:hgB!\021\021WAa\023\021\t\031-a-\003\023\005\023x-^7f]R\034\b\006DAO\003\017\fi-a4\002R\006M\007\003BAY\003\023LA!a3\0024\nA1)\0317mE\006\0347.\001\004eSJ,7\r^\r\002\003\005\031Am\\2\"\005\005U\027\001\0174v]\016$\030n\0348)Si\032HO]5oO\002jS\006I$fi\002\"\b.\032\021dkJ\024XM\034;!Y\006\024W\r\034\021pM\002\"\b.\032\021ee&4XM\f\005\b\0033\004A\021AAn\003!\031X\r\036'bE\026dGCBAR\003;\fy\016\003\005\002.\006]\007\031AAX\021!\ti,a6A\002\005}\006\006CAl\003\017\f\t.a9\"\005\005\025\030\001\0344v]\016$\030n\0348)m\006dW/\032\036tiJLgnZ\025;gR\024\030N\\4![5\0023+\032;tAQDW\r\t7bE\026d\007e\0344!i\",\007\005\032:jm\026t\003EU3ukJt7\017\t;iK\002rWm\036\021wC2,X\r\f\021xQ&\034\007\016I7bs\002\022W\r\t;sk:\034\027\r^3e]!9\021\021\036\001\005\002\005-\030aC4fi\016\013\007/Y2jif$b!a)\002n\006=\b\002CAW\003O\004\r!a,\t\021\005u\026q\035a\001\003CC\"a:\002H\0065\027qZAi\003g\f#!!>\002\017\032,hn\031;j_:D\023F\0178v[\n,'\017I\027.AI+G/\036:og\002\"\b.\032\021u_R\fG\016I2ba\006\034\027\016^=!_\032\004C\017[3!IJLg/\032\027!S:\004#-\037;fg:Bq!!?\001\t\003\tY0A\007hKR\034Vm\031;peNK'0\032\013\007\003G\013i0a@\t\021\0055\026q\037a\001\003_C\001\"!0\002x\002\007\021q\030\025\r\003o\f9-!4\002P\006E'1A\021\003\005\013\t\001KZ;oGRLwN\034\025*u9,XNY3sA5j\003EU3ukJt7\017\t;iK\002\032\030N_3!_\032\004\023\rI:j]\036dW\rI:fGR|'\017I8oAQDW\r\t3sSZ,G\006I5oA\tLH/Z:/\021\035\021I\001\001C\001\005\027\tqbZ3u!2\fG\017^3s\007>,h\016\036\013\007\003G\023iAa\004\t\021\0055&q\001a\001\003_C\001\"!0\003\b\001\007\021q\030\025\r\005\017\t9-!4\002P\006E'1C\021\003\005+\t\021IZ;oGRLwN\034\025*u9,XNY3sA5j\003EU3ukJt7\017\t;iK\002rW/\0342fe\002zg\r\t9mCR$XM]:!S:\004C\017[3!IJLg/\032\030\t\017\te\001\001\"\001\003\034\005Q!/Z1e'\026\034Go\034:\025\r\005\r&Q\004B\020\021!\tiKa\006A\002\005=\006\002CA_\005/\001\r!a0)\031\t]\021qYAg\003\037\f\tNa\t\"\005\t\025\022\001\0264v]\016$\030n\0348)g\026\034Go\034:;]Vl'-\032:*uM$(/\0338hA5j\003EU3bI\002\"\b.\032\021dkJ\024XM\034;!G>tG/\0328ug\002zg\r\t;iK\002\032\b/Z2jM&,G\rI:fGR|'O\f\005\b\005S\001A\021\001B\026\003-9(/\033;f'\026\034Go\034:\025\r\005\r&Q\006B\030\021!\tiKa\nA\002\005=\006\002CA_\005O\001\r!a0)\031\t\035\022qYAg\003\037\f\tNa\r\"\005\tU\022A\0304v]\016$\030n\0348)g\026\034Go\034:;]Vl'-\032:-AY\fG.^3;gR\024\030N\\4*A5j\003e\026:ji\026\004C\017[3!gB,7-\0334jK\022\0043m\0348uK:$8\017\t;pAQDW\rI:qK\016Lg-[3eAM,7\r^8s]!9!\021\b\001\005\002\tm\022\001\003:fC\022\024\025\020^3\025\r\005\r&Q\bB \021!\tiKa\016A\002\005=\006\002CA_\005o\001\r!a0)\031\t]\022qYAg\003\037\f\tNa\021\"\005\t\025\023!\0244v]\016$\030n\0348)_\03247/\032;;]Vl'-\032:*u9,XNY3sA5j\003EU3bI\002\n\007e]5oO2,\007EY=uK\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI8gMN,GO\f\005\b\005\023\002A\021\001B&\003%9(/\033;f\005f$X\r\006\004\002$\n5#q\n\005\t\003[\0239\0051\001\0020\"A\021Q\030B$\001\004\ty\f\013\007\003H\005\035\027QZAh\003#\024\031&\t\002\003V\005)f-\0368di&|g\016K8gMN,GO\0178v[\n,'\017\f\021wC2,XM\0178v[\n,'/\013\021.[\001:&/\033;fA\005\0043/\0338hY\026\004#-\037;fAQ|\007\005\0365fAM\004XmY5gS\026$\007e\0344gg\026$h\006C\004\003Z\001!\tEa\027\002\t1|\027\r\032\013\005\003c\021i\006\003\005\003`\t]\003\031\001B1\003\rq'\r\036\t\005\005G\022y'\004\002\003f)!!q\fB4\025\021\021IGa\033\002\0235Lg.Z2sC\032$(B\001B7\003\rqW\r^\005\005\005c\022)G\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\tU\004\001\"\021\003x\005!1/\031<f)\021\t\tD!\037\t\021\t}#1\017a\001\005CBqA! \001\t\023\021y(\001\bwC2LG-\031;f'\026\034Go\034:\025\007}\021\t\tC\004\003\004\nm\004\031A\020\002\rM,7\r^8s\021\035\0219\t\001C\005\005\023\0131b\0315fG.\034Vm\031;peR\031qDa#\t\017\t5%Q\021a\001?\0051qN\0324tKRDqAa\"\001\t\023\021\t\nF\003 \005'\023)\n\003\005\002>\n=\005\031AA`\021\035\0219Ja$A\002}\t\021A\034\005\b\0057\003A\021\002BO\0031iwN^3U_N+7\r^8s)\025y\"q\024BQ\021!\tiK!'A\002\005=\006b\002BB\0053\003\ra\b\005\b\005K\003A\021\002BT\003=\031Xm\031;peR{\007*Z1e!>\034HcA\020\003*\"9!1\021BR\001\004y\002b\002BW\001\021%!qV\001\rg\026\034Go\034:PM\032\034X\r\036\013\004?\tE\006b\002BB\005W\003\ra\b\005\b\005k\003A\021\002B\\\0031ygMZ:fiN+7\r^8s)\ry\"\021\030\005\b\005\033\023\031\f1\001 \021\035\021i\f\001C\005\005\013A\002Z5tW\006\033G/\033<jif$\"!!\r")
/*     */ public class Drive extends ManagedEnvironment implements DeviceInfo {
/*     */   private final int capacity;
/*     */   private final int platterCount;
/*     */   private final Label label;
/*     */   private final Option<EnvironmentHost> host;
/*     */   private final Option<String> sound;
/*     */   private final int speed;
/*     */   private final boolean isLocked;
/*     */   private final ComponentConnector node;
/*     */   private final int sectorSize;
/*     */   private final byte[] data;
/*     */   private final int sectorCount;
/*     */   private final int sectorsPerPlatter;
/*     */   private int headPos;
/*     */   private final double[] readSectorCosts;
/*     */   private final double[] writeSectorCosts;
/*     */   private final double[] readByteCosts;
/*     */   private final double[] writeByteCosts;
/*     */   private Map<String, String> deviceInfo;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  31 */   public int capacity() { return this.capacity; } public int platterCount() { return this.platterCount; } public Label label() { return this.label; } public Option<String> sound() { return this.sound; } public int speed() { return this.speed; } public boolean isLocked() { return this.isLocked; }
/*  32 */   public Drive(int capacity, int platterCount, Label label, Option<EnvironmentHost> host, Option<String> sound, int speed, boolean isLocked) { this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  33 */       .withComponent("drive", Visibility.Neighbors)
/*  34 */       .withConnector()
/*  35 */       .create();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  41 */     this.data = new byte[capacity];
/*     */     
/*  43 */     this.sectorCount = capacity / 512;
/*     */     
/*  45 */     this.sectorsPerPlatter = sectorCount() / platterCount;
/*     */     
/*  47 */     this.headPos = 0;
/*     */     
/*  49 */     this.readSectorCosts = new double[] { 0.1D, 0.05D, 0.03333333333333333D, 0.025D, 0.02D, 0.016666666666666666D };
/*  50 */     this.writeSectorCosts = new double[] { 0.2D, 0.1D, 0.06666666666666667D, 0.05D, 0.04D, 0.03333333333333333D };
/*  51 */     this.readByteCosts = new double[] { 0.020833333333333332D, 0.015625D, 0.0125D, 0.010416666666666666D, 0.008928571428571428D, 0.0078125D };
/*  52 */     this.writeByteCosts = new double[] { 0.041666666666666664D, 0.03125D, 0.025D, 0.020833333333333332D, 0.017857142857142856D, 0.015625D }; } public ComponentConnector node() { return this.node; } private File savePath() { return new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(Settings$.MODULE$.savePath()).append(node().address()).append(".bin").toString()); } private final int sectorSize() { return 512; } private byte[] data() { return this.data; } private int sectorCount() { return this.sectorCount; } public final double[] writeByteCosts() { return this.writeByteCosts; }
/*     */   private int sectorsPerPlatter() { return this.sectorsPerPlatter; }
/*     */   private int headPos() { return this.headPos; }
/*     */   private void headPos_$eq(int x$1) { this.headPos = x$1; }
/*  56 */   public final double[] readSectorCosts() { return this.readSectorCosts; } public final double[] writeSectorCosts() { return this.writeSectorCosts; } public final double[] readByteCosts() { return this.readByteCosts; } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[7])[0] = Predef$ArrowAssoc$.MODULE$
/*  57 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "disk");
/*  58 */         (new Tuple2[7])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Hard disk drive");
/*  59 */         (new Tuple2[7])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  60 */         (new Tuple2[7])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), (new StringBuilder()).append("MPD").append(BoxesRunTime.boxToInteger(capacity() / 1024).toString()).append("L").append(BoxesRunTime.boxToInteger(platterCount()).toString()).toString());
/*  61 */         (new Tuple2[7])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger((int)(capacity() * 1.024D)).toString());
/*  62 */         (new Tuple2[7])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(capacity()).toString());
/*  63 */         (new Tuple2[7])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("clock"), (new StringBuilder()).append(BoxesRunTime.boxToInteger((int)('ߐ' / readSectorCosts()[speed()]) / 100).toString()).append("/").append(BoxesRunTime.boxToInteger((int)('ߐ' / writeSectorCosts()[speed()]) / 100).toString()).append("/").append(BoxesRunTime.boxToInteger((int)('ߐ' / readByteCosts()[speed()]) / 100).toString()).append("/").append(BoxesRunTime.boxToInteger((int)('ߐ' / writeByteCosts()[speed()]) / 100).toString()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      }
/*  66 */    private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():string -- Get the current label of the drive.")
/*     */   public synchronized Object[] getLabel(Context context, Arguments args) {
/*  72 */     return (label() == null) ? null : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label().getLabel() }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(value:string):string -- Sets the label of the drive. Returns the new value, which may be truncated.")
/*     */   public synchronized Object[] setLabel(Context context, Arguments args) {
/*  77 */     if (isLocked()) throw new Exception("drive is read only"); 
/*  78 */     if (label() == null) throw new Exception("drive does not support labeling"); 
/*  79 */     if (args.checkAny(0) == null) { label().setLabel(null); }
/*  80 */     else { label().setLabel(args.checkString(0)); }
/*  81 */      return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label().getLabel() }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():number -- Returns the total capacity of the drive, in bytes.")
/*     */   public Object[] getCapacity(Context context, Arguments args) {
/*  85 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(capacity()) }));
/*     */   } @Callback(direct = true, doc = "function():number -- Returns the size of a single sector on the drive, in bytes.")
/*     */   public Object[] getSectorSize(Context context, Arguments args) {
/*  88 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(512) }));
/*     */   } @Callback(direct = true, doc = "function():number -- Returns the number of platters in the drive.")
/*     */   public Object[] getPlatterCount(Context context, Arguments args) {
/*  91 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(platterCount()) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function(sector:number):string -- Read the current contents of the specified sector.")
/*     */   public synchronized Object[] readSector(Context context, Arguments args) {
/*  95 */     context.consumeCallBudget(readSectorCosts()[speed()]);
/*  96 */     int sector = moveToSector(context, checkSector(args, 0));
/*  97 */     diskActivity();
/*  98 */     byte[] sectorData = new byte[512];
/*  99 */     Array$.MODULE$.copy(data(), sectorOffset(sector), sectorData, 0, 512);
/* 100 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { sectorData }));
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function(sector:number, value:string) -- Write the specified contents to the specified sector.")
/*     */   public synchronized Object[] writeSector(Context context, Arguments args) {
/* 105 */     if (isLocked()) throw new Exception("drive is read only"); 
/* 106 */     context.consumeCallBudget(writeSectorCosts()[speed()]);
/* 107 */     byte[] sectorData = args.checkByteArray(1);
/* 108 */     int sector = moveToSector(context, checkSector(args, 0));
/* 109 */     diskActivity();
/* 110 */     Array$.MODULE$.copy(sectorData, 0, data(), sectorOffset(sector), package$.MODULE$.min(512, sectorData.length));
/* 111 */     return null;
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function(offset:number):number -- Read a single byte at the specified offset.")
/*     */   public synchronized Object[] readByte(Context context, Arguments args) {
/* 116 */     context.consumeCallBudget(readByteCosts()[speed()]);
/* 117 */     int offset = args.checkInteger(0) - 1;
/* 118 */     moveToSector(context, checkSector(offset));
/* 119 */     diskActivity();
/* 120 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToByte(data()[offset]) }));
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function(offset:number, value:number) -- Write a single byte to the specified offset.")
/*     */   public synchronized Object[] writeByte(Context context, Arguments args) {
/* 125 */     if (isLocked()) throw new Exception("drive is read only"); 
/* 126 */     context.consumeCallBudget(writeByteCosts()[speed()]);
/* 127 */     int offset = args.checkInteger(0) - 1;
/* 128 */     byte value = (byte)args.checkInteger(1);
/* 129 */     moveToSector(context, checkSector(offset));
/* 130 */     diskActivity();
/* 131 */     data()[offset] = value;
/* 132 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void load(NBTTagCompound nbt) {
/* 138 */     super.load(nbt);
/*     */     
/* 140 */     if (node().address() != null)
/* 141 */       try { File path = savePath();
/* 142 */         if (path.exists()) {
/* 143 */           ByteArrayInputStream bin = new ByteArrayInputStream(Files.toByteArray(path));
/* 144 */           GZIPInputStream zin = new GZIPInputStream(bin);
/* 145 */           int offset = 0;
/* 146 */           int read = 0;
/* 147 */           while (read >= 0 && offset < (data()).length) {
/* 148 */             read = zin.read(data(), offset, (data()).length - offset);
/* 149 */             offset += read;
/*     */           } 
/*     */         }  }
/*     */       finally
/*     */       { Exception exception = null;
/*     */         (new String[2])[0] = "Failed loading drive contents for '";
/*     */         (new String[2])[1] = "'."; }
/*     */        
/* 157 */     headPos_$eq(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(nbt.func_74762_e("headPos")), 0)), sectorToHeadPos(sectorCount())));
/*     */     
/* 159 */     if (label() != null) {
/* 160 */       label().load(nbt);
/*     */     }
/*     */   }
/*     */   
/*     */   public synchronized void save(NBTTagCompound nbt) {
/* 165 */     super.save(nbt);
/*     */     
/* 167 */     if (node().address() != null)
/* 168 */       try { File path = savePath();
/* 169 */         path.getParentFile().mkdirs();
/* 170 */         ByteArrayOutputStream bos = new ByteArrayOutputStream();
/* 171 */         GZIPOutputStream zos = new GZIPOutputStream(bos);
/* 172 */         zos.write(data());
/* 173 */         zos.close();
/* 174 */         Files.write(bos.toByteArray(), path); }
/*     */       finally
/*     */       { Exception exception = null;
/*     */         (new String[2])[0] = "Failed saving drive contents for '";
/*     */         (new String[2])[1] = "'."; }
/*     */        
/* 180 */     nbt.func_74768_a("headPos", headPos());
/*     */     
/* 182 */     if (label() != null) {
/* 183 */       label().save(nbt);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private int validateSector(int sector) {
/* 190 */     if (sector < 0 || sector >= sectorCount())
/* 191 */       throw new IllegalArgumentException("invalid offset, not in a usable sector"); 
/* 192 */     return sector;
/*     */   }
/*     */   private int checkSector(int offset) {
/* 195 */     return validateSector(offsetSector(offset));
/*     */   } private int checkSector(Arguments args, int n) {
/* 197 */     return validateSector(args.checkInteger(n) - 1);
/*     */   }
/*     */   private int moveToSector(Context context, int sector) {
/* 200 */     int newHeadPos = sectorToHeadPos(sector);
/* 201 */     if (headPos() != newHeadPos) {
/* 202 */       int delta = package$.MODULE$.abs(headPos() - newHeadPos);
/* 203 */       (delta > Settings$.MODULE$.get().sectorSeekThreshold()) ? BoxesRunTime.boxToBoolean(context.pause(Settings$.MODULE$.get().sectorSeekTime())) : BoxedUnit.UNIT;
/* 204 */       headPos_$eq(newHeadPos);
/*     */     } 
/* 206 */     return sector;
/*     */   }
/*     */   private int sectorToHeadPos(int sector) {
/* 209 */     return sector % sectorsPerPlatter();
/*     */   } private int sectorOffset(int sector) {
/* 211 */     return sector * 512;
/*     */   } private int offsetSector(int offset) {
/* 213 */     return offset / 512;
/*     */   }
/*     */   private void diskActivity() {
/* 216 */     Tuple2 tuple2 = new Tuple2(sound(), this.host); if (tuple2 != null) {
/* 217 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; String s = (String)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; EnvironmentHost h = (EnvironmentHost)some1.x(); PacketSender$.MODULE$.sendFileSystemActivity((Node)node(), h, s); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  } 
/* 218 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Drive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */