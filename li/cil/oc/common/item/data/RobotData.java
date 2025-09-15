/*     */ package li.cil.oc.common.item.data;@ScalaSignature(bytes = "\006\001\005Er!B\001\003\021\003y\021!\003*pE>$H)\031;b\025\t\031A!\001\003eCR\f'BA\003\007\003\021IG/Z7\013\005\035A\021AB2p[6|gN\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021\021BU8c_R$\025\r^1\024\005E!\002CA\013\031\033\0051\"\"A\f\002\013M\034\027\r\\1\n\005e1\"AB!osJ+g\rC\003\034#\021\005A$\001\004=S:LGO\020\013\002\037!9a$\005b\001\n\003y\022!\0028b[\026\034X#\001\021\021\007U\t3%\003\002#-\t)\021I\035:bsB\021A%K\007\002K)\021aeJ\001\005Y\006twMC\001)\003\021Q\027M^1\n\005)*#AB*ue&tw\r\003\004-#\001\006I\001I\001\007]\006lWm\035\021\t\0139\nB\021A\030\002\025I\fg\016Z8n\035\006lW-F\001$\r\021\021\"\001A\031\024\005A\022\004C\001\t4\023\t!$A\001\005Ji\026lG)\031;b\021\025Y\002\007\"\0017)\0059\004C\001\t1\021\025Y\002\007\"\001:)\t9$\bC\003<q\001\007A(A\003ti\006\0347\016\005\002>\0076\taH\003\002\006)\021\001)Q\001\n[&tWm\031:bMRT\021AQ\001\004]\026$\030B\001#?\005%IE/Z7Ti\006\0347\016C\004Ga\001\007I\021A\030\002\t9\fW.\032\005\b\021B\002\r\021\"\001J\003!q\027-\\3`I\025\fHC\001&N!\t)2*\003\002M-\t!QK\\5u\021\035qu)!AA\002\r\n1\001\037\0232\021\031\001\006\007)Q\005G\005)a.Y7fA!9!\013\ra\001\n\003\031\026a\003;pi\006dWI\\3sOf,\022\001\026\t\003+UK!A\026\f\003\007%sG\017C\004Ya\001\007I\021A-\002\037Q|G/\0317F]\026\024x-_0%KF$\"A\023.\t\0179;\026\021!a\001)\"1A\f\rQ!\nQ\013A\002^8uC2,e.\032:hs\002BqA\030\031A\002\023\0051+A\006s_\n|G/\0228fe\036L\bb\00211\001\004%\t!Y\001\020e>\024w\016^#oKJ<\027p\030\023fcR\021!J\031\005\b\035~\013\t\0211\001U\021\031!\007\007)Q\005)\006a!o\0342pi\026sWM]4zA!9a\r\ra\001\n\003\031\026\001\002;jKJDq\001\033\031A\002\023\005\021.\001\005uS\026\024x\fJ3r)\tQ%\016C\004OO\006\005\t\031\001+\t\r1\004\004\025)\003U\003\025!\030.\032:!\021\035q\007\0071A\005\002=\f!bY8na>tWM\034;t+\005\001\bcA\013\"y!9!\017\ra\001\n\003\031\030AD2p[B|g.\0328ug~#S-\035\013\003\025RDqAT9\002\002\003\007\001\017\003\004wa\001\006K\001]\001\fG>l\007o\0348f]R\034\b\005C\004ya\001\007I\021A8\002\025\r|g\016^1j]\026\0248\017C\004{a\001\007I\021A>\002\035\r|g\016^1j]\026\0248o\030\023fcR\021!\n \005\b\035f\f\t\0211\001q\021\031q\b\007)Q\005a\006Y1m\0348uC&tWM]:!\021!\t\t\001\ra\001\n\003\031\026A\0037jO\"$8i\0347pe\"I\021Q\001\031A\002\023\005\021qA\001\017Y&<\007\016^\"pY>\024x\fJ3r)\rQ\025\021\002\005\t\035\006\r\021\021!a\001)\"9\021Q\002\031!B\023!\026a\0037jO\"$8i\0347pe\002Bq!!\0051\t\003\n\031\"\001\003m_\006$Gc\001&\002\026!A\021qCA\b\001\004\tI\"A\002oER\004B!a\007\002 5\021\021Q\004\006\004\003/y\024\002BA\021\003;\021aB\024\"U)\006<7i\\7q_VtG\rC\004\002&A\"\t%a\n\002\tM\fg/\032\013\004\025\006%\002\002CA\f\003G\001\r!!\007\t\017\0055\002\007\"\001\0020\005i1m\0349z\023R,Wn\025;bG.$\022\001\020")
/*     */ public class RobotData extends ItemData { private String name; private int totalEnergy; private int robotEnergy; private int tier; private ItemStack[] components; private ItemStack[] containers; private int lightColor;
/*     */   public RobotData(ItemStack stack) {
/*     */     this();
/*     */     load(stack);
/*     */   }
/*     */   
/*     */   public String name() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   public void name_$eq(String x$1) {
/*     */     this.name = x$1;
/*     */   }
/*     */   
/*     */   public int totalEnergy() {
/*     */     return this.totalEnergy;
/*     */   }
/*     */   
/*     */   public void totalEnergy_$eq(int x$1) {
/*     */     this.totalEnergy = x$1;
/*     */   }
/*     */   
/*     */   public int robotEnergy() {
/*     */     return this.robotEnergy;
/*     */   }
/*     */   
/*     */   public void robotEnergy_$eq(int x$1) {
/*     */     this.robotEnergy = x$1;
/*     */   }
/*     */   
/*  32 */   public RobotData() { super("robot");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     this.name = "";
/*     */ 
/*     */     
/*  41 */     this.totalEnergy = 0;
/*     */ 
/*     */     
/*  44 */     this.robotEnergy = 0;
/*     */     
/*  46 */     this.tier = 0;
/*     */     
/*  48 */     this.components = (ItemStack[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(ItemStack.class));
/*     */     
/*  50 */     this.containers = (ItemStack[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(ItemStack.class));
/*     */     
/*  52 */     this.lightColor = 15872048; } public int tier() { return this.tier; } public void tier_$eq(int x$1) { this.tier = x$1; } public ItemStack[] components() { return this.components; } public int lightColor() { return this.lightColor; } public void components_$eq(ItemStack[] x$1) { this.components = x$1; } public ItemStack[] containers() { return this.containers; } public void containers_$eq(ItemStack[] x$1) { this.containers = x$1; } public void lightColor_$eq(int x$1) { this.lightColor = x$1; }
/*     */ 
/*     */   
/*  55 */   public void load(NBTTagCompound nbt) { if (nbt.func_74764_b("display") && nbt.func_74775_l("display").func_74764_b("Name")) {
/*  56 */       name_$eq(nbt.func_74775_l("display").func_74779_i("Name"));
/*     */     }
/*  58 */     if (Strings.isNullOrEmpty(name())) {
/*  59 */       name_$eq(RobotData$.MODULE$.randomName());
/*     */     }
/*  61 */     totalEnergy_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString()));
/*  62 */     robotEnergy_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("robotEnergy").toString()));
/*  63 */     tier_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString()));
/*  64 */     components_$eq(
/*  65 */         (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("components").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).map((Function1)new RobotData$$anonfun$load$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))));
/*  66 */     containers_$eq(
/*  67 */         (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("containers").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).map((Function1)new RobotData$$anonfun$load$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))));
/*  68 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lightColor").toString()))
/*  69 */       lightColor_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lightColor").toString()));  } public final class RobotData$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack apply(NBTTagCompound x$1) { return ItemStack.func_77949_a(x$1); } public RobotData$$anonfun$load$1(RobotData $outer) {} } public final class RobotData$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack apply(NBTTagCompound x$1) { return ItemStack.func_77949_a(x$1); }
/*     */     public RobotData$$anonfun$load$2(RobotData $outer) {} }
/*     */   public void save(NBTTagCompound nbt) {
/*  74 */     if (!Strings.isNullOrEmpty(name())) {
/*  75 */       if (!nbt.func_74764_b("display")) {
/*  76 */         nbt.func_74782_a("display", (NBTBase)new NBTTagCompound());
/*     */       }
/*  78 */       nbt.func_74775_l("display").func_74778_a("Name", name());
/*     */     } 
/*  80 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString(), totalEnergy());
/*  81 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("robotEnergy").toString(), robotEnergy());
/*  82 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString(), tier());
/*  83 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("components").toString(), ExtendedNBT$.MODULE$.itemStackIterableToNbt(Predef$.MODULE$.refArrayOps((Object[])components()).toIterable()));
/*  84 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("containers").toString(), ExtendedNBT$.MODULE$.itemStackIterableToNbt(Predef$.MODULE$.refArrayOps((Object[])containers()).toIterable()));
/*  85 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lightColor").toString(), lightColor());
/*     */   }
/*     */   
/*     */   public ItemStack copyItemStack() {
/*  89 */     ItemStack stack = createItemStack();
/*     */ 
/*     */     
/*  92 */     RobotData newInfo = new RobotData(stack);
/*  93 */     Predef$.MODULE$.refArrayOps((Object[])newInfo.components()).foreach((Function1)new RobotData$$anonfun$copyItemStack$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     newInfo.totalEnergy_$eq(0);
/* 104 */     newInfo.robotEnergy_$eq(50000);
/* 105 */     newInfo.save(stack);
/* 106 */     return stack;
/*     */   }
/*     */   
/*     */   public static String randomName() {
/*     */     return RobotData$.MODULE$.randomName();
/*     */   }
/*     */   
/*     */   public static String[] names() {
/*     */     return RobotData$.MODULE$.names();
/*     */   }
/*     */   
/*     */   public final class RobotData$$anonfun$copyItemStack$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(ItemStack cs) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   3: aload_1
/*     */       //   4: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/driver/Item;
/*     */       //   7: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   10: astore_2
/*     */       //   11: aload_2
/*     */       //   12: instanceof scala/Some
/*     */       //   15: ifeq -> 109
/*     */       //   18: aload_2
/*     */       //   19: checkcast scala/Some
/*     */       //   22: astore_3
/*     */       //   23: aload_3
/*     */       //   24: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   27: checkcast li/cil/oc/api/driver/Item
/*     */       //   30: astore #4
/*     */       //   32: aload #4
/*     */       //   34: getstatic li/cil/oc/integration/opencomputers/DriverScreen$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverScreen$;
/*     */       //   37: astore #5
/*     */       //   39: dup
/*     */       //   40: ifnonnull -> 52
/*     */       //   43: pop
/*     */       //   44: aload #5
/*     */       //   46: ifnull -> 60
/*     */       //   49: goto -> 109
/*     */       //   52: aload #5
/*     */       //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   57: ifeq -> 109
/*     */       //   60: aload #4
/*     */       //   62: aload_1
/*     */       //   63: invokeinterface dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   68: astore #7
/*     */       //   70: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   73: aload #7
/*     */       //   75: invokevirtual func_150296_c : ()Ljava/util/Set;
/*     */       //   78: invokeinterface toArray : ()[Ljava/lang/Object;
/*     */       //   83: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   86: new li/cil/oc/common/item/data/RobotData$$anonfun$copyItemStack$1$$anonfun$apply$2
/*     */       //   89: dup
/*     */       //   90: aload_0
/*     */       //   91: aload #7
/*     */       //   93: invokespecial <init> : (Lli/cil/oc/common/item/data/RobotData$$anonfun$copyItemStack$1;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   96: invokeinterface foreach : (Lscala/Function1;)V
/*     */       //   101: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   104: astore #6
/*     */       //   106: goto -> 114
/*     */       //   109: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   112: astore #6
/*     */       //   114: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #93	-> 0
/*     */       //   #94	-> 11
/*     */       //   #95	-> 60
/*     */       //   #96	-> 70
/*     */       //   #94	-> 104
/*     */       //   #99	-> 109
/*     */       //   #93	-> 114
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	115	0	this	Lli/cil/oc/common/item/data/RobotData$$anonfun$copyItemStack$1;
/*     */       //   0	115	1	cs	Lnet/minecraft/item/ItemStack;
/*     */       //   32	83	4	driver	Lli/cil/oc/api/driver/Item;
/*     */       //   70	34	7	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     }
/*     */     
/*     */     public RobotData$$anonfun$copyItemStack$1(RobotData $outer) {}
/*     */     
/*     */     public final class RobotData$$anonfun$copyItemStack$1$$anonfun$apply$2 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final NBTTagCompound nbt$1;
/*     */       
/*     */       public RobotData$$anonfun$copyItemStack$1$$anonfun$apply$2(RobotData$$anonfun$copyItemStack$1 $outer, NBTTagCompound nbt$1) {}
/*     */       
/*     */       public final void apply(Object tagName) {
/*     */         this.nbt$1.func_82580_o((String)tagName);
/*     */       }
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\RobotData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */