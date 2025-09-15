/*     */ package li.cil.oc.common.template;@ScalaSignature(bytes = "\006\001q<Q!\001\002\t\0025\tQBU8c_R$V-\0349mCR,'BA\002\005\003!!X-\0349mCR,'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\033I{'m\034;UK6\004H.\031;f'\ty!\003\005\002\017'%\021AC\001\002\t)\026l\007\017\\1uK\")ac\004C\001/\0051A(\0338jiz\"\022!\004\005\0063=!\tFG\001\nQ>\034Ho\0217bgN,\022a\007\t\0049\005\032S\"A\017\013\005yy\022\001\0027b]\036T\021\001I\001\005U\0064\030-\003\002#;\t)1\t\\1tgB\021A%K\007\002K)\021aeJ\001\tS:$XM\0358bY*\021\001FB\001\004CBL\027B\001\026&\005\025\021vNY8u\021\025as\002\"\001.\003-\031X\r\\3diRKWM]\031\025\0059\"\004CA\0303\033\005\001$\"A\031\002\013M\034\027\r\\1\n\005M\002$a\002\"p_2,\027M\034\005\006k-\002\rAN\001\006gR\f7m\033\t\003oyj\021\001\017\006\003si\nA!\033;f[*\0211\bP\001\n[&tWm\031:bMRT\021!P\001\004]\026$\030BA 9\005%IE/Z7Ti\006\0347\016C\003B\037\021\005!)A\006tK2,7\r\036+jKJ\024DC\001\030D\021\025)\004\t1\0017\021\025)u\002\"\001G\003-\031X\r\\3diRKWM]\032\025\0059:\005\"B\033E\001\0041\004\"B%\020\t\003Q\025AD:fY\026\034Go\021:fCRLg/\032\013\003]-CQ!\016%A\002YBQ!T\b\005\0029\013\001B^1mS\022\fG/\032\013\003\037V\0032a\f)S\023\t\t\006GA\003BeJ\f\027\020\005\0020'&\021A\013\r\002\007\003:L(+\0324\t\013Yc\005\031A,\002\023%tg/\0328u_JL\bC\001-[\033\005I&B\001,;\023\tY\026L\001\006J\023:4XM\034;pefDQ!X\b\005\002y\013\001\"Y:tK6\024G.\032\013\003?\016\0042a\f)a!\ta\022-\003\002c;\t1qJ\0316fGRDQA\026/A\002]CQ!Z\b\005\002\031\f!c]3mK\016$H)[:bgN,WN\0317feR\021af\032\005\006k\021\004\rA\016\005\006S>!\tA[\001\fI&\034\030m]:f[\ndW\rF\002lY6\0042a\f)7\021\025)\004\0161\0017\021\025q\007\0161\001l\003-Ign\032:fI&,g\016^:\t\013A|A\021A9\002\021I,w-[:uKJ$\022A\035\t\003_ML!\001\036\031\003\tUs\027\016\036\005\006m>!\tf^\001\tG\006\034X\rV5feR\021\001p\037\t\003_eL!A\037\031\003\007%sG\017C\003Wk\002\007q\013")
/*     */ public final class RobotTemplate { public static void register() {
/*     */     RobotTemplate$.MODULE$.register();
/*     */   } public static ItemStack[] disassemble(ItemStack paramItemStack, ItemStack[] paramArrayOfItemStack) {
/*     */     return RobotTemplate$.MODULE$.disassemble(paramItemStack, paramArrayOfItemStack);
/*     */   } public static boolean selectDisassembler(ItemStack paramItemStack) {
/*     */     return RobotTemplate$.MODULE$.selectDisassembler(paramItemStack);
/*     */   } public static Object[] assemble(IInventory paramIInventory) {
/*     */     return RobotTemplate$.MODULE$.assemble(paramIInventory);
/*     */   } public static Object[] validate(IInventory paramIInventory) {
/*     */     return RobotTemplate$.MODULE$.validate(paramIInventory);
/*     */   } public static boolean selectCreative(ItemStack paramItemStack) {
/*     */     return RobotTemplate$.MODULE$.selectCreative(paramItemStack);
/*     */   } public static boolean selectTier3(ItemStack paramItemStack) {
/*     */     return RobotTemplate$.MODULE$.selectTier3(paramItemStack);
/*     */   } public static boolean selectTier2(ItemStack paramItemStack) {
/*     */     return RobotTemplate$.MODULE$.selectTier2(paramItemStack);
/*     */   } public static boolean selectTier1(ItemStack paramItemStack) {
/*     */     return RobotTemplate$.MODULE$.selectTier1(paramItemStack);
/*     */   } public static Pair<String, Integer> toPair(Tuple2<String, Object> paramTuple2) {
/*     */     return RobotTemplate$.MODULE$.toPair(paramTuple2);
/*     */   } public static boolean hasFileSystem(IInventory paramIInventory) {
/*     */     return RobotTemplate$.MODULE$.hasFileSystem(paramIInventory);
/*     */   } public static boolean hasInventory(IInventory paramIInventory) {
/*     */     return RobotTemplate$.MODULE$.hasInventory(paramIInventory);
/*     */   } public static boolean hasComponent(String paramString, IInventory paramIInventory) {
/*     */     return RobotTemplate$.MODULE$.hasComponent(paramString, paramIInventory);
/*     */   } public final class RobotTemplate$$anonfun$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack apply(int x$1) {
/*  30 */       return this.inventory$1.func_70301_a(x$1);
/*     */     }
/*     */     private final IInventory inventory$1;
/*     */     public RobotTemplate$$anonfun$1(IInventory inventory$1) {} }
/*     */   public final class RobotTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(ItemStack x$1) {
/*  36 */       return !(x$1 == null); } } public final class RobotTemplate$$anonfun$assemble$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) {
/*  37 */       return !(x$2 == null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class RobotTemplate$$anonfun$register$1
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  80 */       return RobotTemplate$.MODULE$.toPair(t);
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
/*     */   public final class RobotTemplate$$anonfun$register$2
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 111 */       return RobotTemplate$.MODULE$.toPair(t);
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
/*     */   public final class RobotTemplate$$anonfun$register$3
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 146 */       return RobotTemplate$.MODULE$.toPair(t);
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
/*     */   public final class RobotTemplate$$anonfun$register$4
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 181 */       return RobotTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\RobotTemplate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */