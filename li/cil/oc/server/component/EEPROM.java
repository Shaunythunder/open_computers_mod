/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Array$;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Unit$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-h\001B\001\003\0015\021a!R#Q%>k%BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021qCG\007\0021)\021\021DE\001\007IJLg/\032:\n\005mA\"A\003#fm&\034W-\0238g_\")Q\004\001C\001=\0051A(\0338jiz\"\022a\b\t\003A\001i\021A\001\005\bE\001\021\r\021\"\021$\003\021qw\016Z3\026\003\021\002\"!\n\025\016\003\031R!a\n\n\002\0179,Go^8sW&\021\021F\n\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\004,\001\001\006I\001J\001\006]>$W\r\t\005\b[\001\001\r\021\"\001/\003!\031w\016Z3ECR\fW#A\030\021\007A\032T'D\0012\025\005\021\024!B:dC2\f\027B\001\0332\005\025\t%O]1z!\t\001d'\003\0028c\t!!)\037;f\021\035I\004\0011A\005\002i\nAbY8eK\022\013G/Y0%KF$\"a\017 \021\005Ab\024BA\0372\005\021)f.\033;\t\017}B\024\021!a\001_\005\031\001\020J\031\t\r\005\003\001\025)\0030\003%\031w\016Z3ECR\f\007\005C\004D\001\001\007I\021\001\030\002\031Y|G.\031;jY\026$\025\r^1\t\017\025\003\001\031!C\001\r\006\001bo\0347bi&dW\rR1uC~#S-\035\013\003w\035Cqa\020#\002\002\003\007q\006\003\004J\001\001\006KaL\001\016m>d\027\r^5mK\022\013G/\031\021\t\017-\003\001\031!C\001\031\006A!/Z1e_:d\0270F\001N!\t\001d*\003\002Pc\t9!i\\8mK\006t\007bB)\001\001\004%\tAU\001\re\026\fGm\0348ms~#S-\035\013\003wMCqa\020)\002\002\003\007Q\n\003\004V\001\001\006K!T\001\ne\026\fGm\0348ms\002Bqa\026\001A\002\023\005\001,A\003mC\n,G.F\001Z!\tQv,D\001\\\025\taV,\001\003mC:<'\"\0010\002\t)\fg/Y\005\003An\023aa\025;sS:<\007b\0022\001\001\004%\taY\001\nY\006\024W\r\\0%KF$\"a\0173\t\017}\n\027\021!a\0013\"1a\r\001Q!\ne\013a\001\\1cK2\004\003\"\0025\001\t\003A\026\001C2iK\016\\7/^7\t\021)\004\001R1A\005\016-\f!\002Z3wS\016,\027J\0344p+\005a\007\003B7s3fk\021A\034\006\003_B\f\021\"[7nkR\f'\r\\3\013\005E\f\024AC2pY2,7\r^5p]&\0211O\034\002\004\033\006\004\b\002C;\001\021\003\005\013U\0027\002\027\021,g/[2f\023:4w\016\t\005\006o\002!\t\005_\001\016O\026$H)\032<jG\026LeNZ8\025\003e\004BA_?}6\t1P\003\002};\006!Q\017^5m\023\t\0318\020E\002\000\003\013q1\001MA\001\023\r\t\031!M\001\007!J,G-\0324\n\007\001\f9AC\002\002\004EBq!a\003\001\t\003\ti!A\002hKR$b!a\004\002\030\005\035\002\003\002\0314\003#\0012\001MA\n\023\r\t)\"\r\002\007\003:L(+\0324\t\021\005e\021\021\002a\001\0037\tqaY8oi\026DH\017\005\003\002\036\005\rRBAA\020\025\r\t\tCE\001\b[\006\034\007.\0338f\023\021\t)#a\b\003\017\r{g\016^3yi\"A\021\021FA\005\001\004\tY#\001\003be\036\034\b\003BA\017\003[IA!a\f\002 \tI\021I]4v[\026tGo\035\025\r\003\023\t\031$!\017\002<\005u\022q\b\t\005\003;\t)$\003\003\0028\005}!\001C\"bY2\024\027mY6\002\r\021L'/Z2u3\005\t\021a\0013pG\006\022\021\021I\001:MVt7\r^5p]\"J#h\035;sS:<\007%L\027!\017\026$\b\005\0365fA\r,(O]3oi2L\be\035;pe\026$\007EY=uK\002\n'O]1z]!9\021Q\t\001\005\002\005\035\023aA:fiR1\021qBA%\003\027B\001\"!\007\002D\001\007\0211\004\005\t\003S\t\031\0051\001\002,!B\0211IA\032\003{\ty%\t\002\002R\005\031e-\0368di&|g\016\0133bi\006T4\017\036:j]\036L\003%L\027!\037Z,'o\036:ji\026\004C\017[3!GV\024(/\0328uYf\0043\017^8sK\022\004#-\037;fA\005\024(/Y=/\021\035\t)\006\001C\001\003/\n\001bZ3u\031\006\024W\r\034\013\007\003\037\tI&a\027\t\021\005e\0211\013a\001\0037A\001\"!\013\002T\001\007\0211\006\025\r\003'\n\031$!\017\002<\005u\022qL\021\003\003C\n\021GZ;oGRLwN\034\025*uM$(/\0338hA5j\003eR3uAQDW\r\t7bE\026d\007e\0344!i\",\007%R#Q%>ke\006C\004\002f\001!\t!a\032\002\021M,G\017T1cK2$b!a\004\002j\005-\004\002CA\r\003G\002\r!a\007\t\021\005%\0221\ra\001\003WA\003\"a\031\0024\005u\022qN\021\003\003c\nAHZ;oGRLwN\034\025eCR\f'h\035;sS:<\027FO:ue&tw\rI\027.AM+G\017\t;iK\002b\027MY3mA=4\007\005\0365fA\025+\005KU(N]!9\021Q\017\001\005\002\005]\024aB4fiNK'0\032\013\007\003\037\tI(a\037\t\021\005e\0211\017a\001\0037A\001\"!\013\002t\001\007\0211\006\025\r\003g\n\031$!\017\002<\005u\022qP\021\003\003\003\013QHZ;oGRLwN\034\025*u9,XNY3sA5j\003eR3uAQDW\rI:u_J\fw-\032\021dCB\f7-\033;zA=4\007\005\0365jg\002*U\t\025*P\033:Bq!!\"\001\t\003\t9)A\006hKR\034\005.Z2lgVlGCBA\b\003\023\013Y\t\003\005\002\032\005\r\005\031AA\016\021!\tI#a!A\002\005-\002\006DAB\003g\tI$a\017\002>\005=\025EAAI\003\0053WO\\2uS>t\007&\013\036tiJLgn\032\021.[\001:U\r\036\021uQ\026\0043\r[3dWN,X\016I8gAQDW\r\t3bi\006\004sN\034\021uQ&\034\b%R#Q%>ke\006C\004\002\026\002!\t!a&\002\0315\f7.\032*fC\022|g\016\\=\025\r\005=\021\021TAN\021!\tI\"a%A\002\005m\001\002CA\025\003'\003\r!a\013)\031\005M\0251GA\035\003w\ti$a(\"\005\005\005\026\001\0364v]\016$\030n\0348)G\",7m[:v[j\032HO]5oO&R$m\\8mK\006t\007%L\027!\033\006\\W\r\t;iSN\004S)\022)S\0376\003#/Z1e_:d\027\020I5gA%$\b%[:oOQ\004\023\r\034:fC\022Lh\006\t+iSN\004\003O]8dKN\034\beY1o]>$\bEY3!e\0264XM]:fI\006Bq!!*\001\t\003\t9+A\006hKR$\025\r^1TSj,GCBA\b\003S\013Y\013\003\005\002\032\005\r\006\031AA\016\021!\tI#a)A\002\005-\002\006DAR\003g\tI$a\017\002>\005}\004bBAY\001\021\005\0211W\001\bO\026$H)\031;b)\031\ty!!.\0028\"A\021\021DAX\001\004\tY\002\003\005\002*\005=\006\031AA\026Q1\ty+a\r\002:\005m\022QHA \021\035\ti\f\001C\001\003\013qa]3u\t\006$\030\r\006\004\002\020\005\005\0271\031\005\t\0033\tY\f1\001\002\034!A\021\021FA^\001\004\tY\003\013\005\002<\006M\022QHA(\021\035\tI\r\001C!\003\027\fA\001\\8bIR\0311(!4\t\021\005=\027q\031a\001\003#\f1A\0342u!\021\t\031.a8\016\005\005U'\002BAh\003/TA!!7\002\\\006IQ.\0338fGJ\fg\r\036\006\003\003;\f1A\\3u\023\021\t\t/!6\003\0359\023E\013V1h\007>l\007o\\;oI\"9\021Q\035\001\005B\005\035\030\001B:bm\026$2aOAu\021!\ty-a9A\002\005E\007")
/*     */ public class EEPROM extends ManagedEnvironment implements DeviceInfo {
/*  22 */   private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Neighbors)
/*  23 */     .withComponent("eeprom", Visibility.Neighbors)
/*  24 */     .withConnector()
/*  25 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*  27 */   } private byte[] codeData = (byte[])Array$.MODULE$.empty(ClassTag$.MODULE$.Byte()); public byte[] codeData() { return this.codeData; } public void codeData_$eq(byte[] x$1) { this.codeData = x$1; }
/*     */   
/*  29 */   private byte[] volatileData = (byte[])Array$.MODULE$.empty(ClassTag$.MODULE$.Byte()); public byte[] volatileData() { return this.volatileData; } public void volatileData_$eq(byte[] x$1) { this.volatileData = x$1; }
/*     */   
/*  31 */   private boolean readonly = false; public boolean readonly() { return this.readonly; } public void readonly_$eq(boolean x$1) { this.readonly = x$1; }
/*     */   
/*  33 */   private String label = "EEPROM"; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public String label() { return this.label; } public void label_$eq(String x$1) { this.label = x$1; }
/*     */    public String checksum() {
/*  35 */     return Hashing.crc32().hashBytes(codeData()).toString();
/*     */   }
/*     */   
/*     */   private Map deviceInfo$lzycompute() {
/*  39 */     synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/*  40 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "memory");
/*  41 */         (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "EEPROM");
/*  42 */         (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  43 */         (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "FlashStick2k");
/*  44 */         (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().eepromSize()).toString());
/*  45 */         (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("size"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().eepromSize()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */   
/*  48 */   } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():string -- Get the currently stored byte array.")
/*     */   public Object[] get(Context context, Arguments args) {
/*  53 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { codeData() }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(data:string) -- Overwrite the currently stored byte array.")
/*  57 */   public Object[] set(Context context, Arguments args) { if (readonly()) {
/*  58 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "storage is readonly" }));
/*     */     }
/*  60 */     if (node().tryChangeBuffer(-Settings$.MODULE$.get().eepromWriteCost())) {
/*     */ 
/*     */       
/*  63 */       byte[] newData = args.optByteArray(0, (byte[])Array$.MODULE$.empty(ClassTag$.MODULE$.Byte()));
/*  64 */       if (newData.length > Settings$.MODULE$.get().eepromSize()) throw new IllegalArgumentException("not enough space"); 
/*  65 */       codeData_$eq(newData);
/*  66 */       context.pause(2.0D);
/*  67 */       return null;
/*     */     } 
/*     */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" })); } @Callback(direct = true, doc = "function():string -- Get the label of the EEPROM.")
/*     */   public Object[] getLabel(Context context, Arguments args) {
/*  71 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label() }));
/*     */   }
/*     */   @Callback(doc = "function(data:string):string -- Set the label of the EEPROM.")
/*     */   public Object[] setLabel(Context context, Arguments args) {
/*  75 */     if (readonly()) {
/*  76 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "storage is readonly" }));
/*     */     }
/*  78 */     label_$eq((String)(new StringOps(Predef$.MODULE$.augmentString(args.optString(0, "EEPROM").trim()))).take(24));
/*  79 */     if (label().length() == 0) label_$eq("EEPROM"); 
/*  80 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label() }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():number -- Get the storage capacity of this EEPROM.")
/*     */   public Object[] getSize(Context context, Arguments args) {
/*  84 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().eepromSize()) }));
/*     */   } @Callback(direct = true, doc = "function():string -- Get the checksum of the data on this EEPROM.")
/*     */   public Object[] getChecksum(Context context, Arguments args) {
/*  87 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { checksum() }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function(checksum:string):boolean -- Make this EEPROM readonly if it isn't already. This process cannot be reversed!")
/*     */   public Object[] makeReadonly(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: iconst_0
/*     */     //   2: invokeinterface checkString : (I)Ljava/lang/String;
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual checksum : ()Ljava/lang/String;
/*     */     //   11: astore_3
/*     */     //   12: dup
/*     */     //   13: ifnonnull -> 24
/*     */     //   16: pop
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 31
/*     */     //   21: goto -> 62
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 62
/*     */     //   31: aload_0
/*     */     //   32: iconst_1
/*     */     //   33: invokevirtual readonly_$eq : (Z)V
/*     */     //   36: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   39: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   42: iconst_1
/*     */     //   43: anewarray java/lang/Object
/*     */     //   46: dup
/*     */     //   47: iconst_0
/*     */     //   48: iconst_1
/*     */     //   49: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   52: aastore
/*     */     //   53: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   56: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   59: goto -> 90
/*     */     //   62: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   65: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   68: iconst_2
/*     */     //   69: anewarray java/lang/Object
/*     */     //   72: dup
/*     */     //   73: iconst_0
/*     */     //   74: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   77: aastore
/*     */     //   78: dup
/*     */     //   79: iconst_1
/*     */     //   80: ldc_w 'incorrect checksum'
/*     */     //   83: aastore
/*     */     //   84: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   87: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   90: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 0
/*     */     //   #92	-> 31
/*     */     //   #93	-> 36
/*     */     //   #95	-> 62
/*     */     //   #91	-> 90
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	91	0	this	Lli/cil/oc/server/component/EEPROM;
/*     */     //   0	91	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	91	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- Get the storage capacity of this EEPROM.")
/*     */   public Object[] getDataSize(Context context, Arguments args) {
/*  99 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().eepromDataSize()) }));
/*     */   } @Callback(direct = true, doc = "function():string -- Get the currently stored byte array.")
/*     */   public Object[] getData(Context context, Arguments args) {
/* 102 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { volatileData() }));
/*     */   }
/*     */   @Callback(doc = "function(data:string) -- Overwrite the currently stored byte array.")
/*     */   public Object[] setData(Context context, Arguments args) {
/* 106 */     if (node().tryChangeBuffer(-Settings$.MODULE$.get().eepromWriteCost())) {
/*     */ 
/*     */       
/* 109 */       byte[] newData = args.optByteArray(0, (byte[])Array$.MODULE$.empty(ClassTag$.MODULE$.Byte()));
/* 110 */       if (newData.length > Settings$.MODULE$.get().eepromDataSize()) throw new IllegalArgumentException("not enough space"); 
/* 111 */       volatileData_$eq(newData);
/* 112 */       context.pause(1.0D);
/* 113 */       return null;
/*     */     } 
/*     */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" }));
/*     */   }
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 119 */     super.load(nbt);
/* 120 */     codeData_$eq(nbt.func_74770_j((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("eeprom").toString()));
/* 121 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString())) {
/* 122 */       label_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()));
/*     */     }
/* 124 */     readonly_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("readonly").toString()));
/* 125 */     volatileData_$eq(nbt.func_74770_j((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("userdata").toString()));
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 129 */     super.save(nbt);
/* 130 */     nbt.func_74773_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("eeprom").toString(), codeData());
/* 131 */     nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString(), label());
/* 132 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("readonly").toString(), readonly());
/* 133 */     nbt.func_74773_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("userdata").toString(), volatileData());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\EEPROM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */