/*     */ package li.cil.oc.common.template;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ @ScalaSignature(bytes = "\006\001\005]q!B\001\003\021\003i\021aF'jGJ|7m\0348ue>dG.\032:UK6\004H.\031;f\025\t\031A!\001\005uK6\004H.\031;f\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"aF'jGJ|7m\0348ue>dG.\032:UK6\004H.\031;f'\ty!\003\005\002\017'%\021AC\001\002\t)\026l\007\017\\1uK\")ac\004C\001/\0051A(\0338jiz\"\022!\004\005\b3=\021\r\021\"\025\033\003M\031XoZ4fgR,GmQ8na>tWM\034;t+\005Y\002c\001\017 C5\tQDC\001\037\003\025\0318-\0317b\023\t\001SDA\003BeJ\f\027\020\005\003\035E\021b\023BA\022\036\005\031!V\017\0357feA\021QEK\007\002M)\021q\005K\001\005Y\006twMC\001*\003\021Q\027M^1\n\005-2#AB*ue&tw\r\005\003\035[=J\024B\001\030\036\005%1UO\\2uS>t\027\007\005\0021o5\t\021G\003\0023g\005I\021N\034<f]R|'/\037\006\003iU\n\021\"\\5oK\016\024\030M\032;\013\003Y\n1A\\3u\023\tA\024G\001\006J\023:4XM\034;pef\004\"\001\b\036\n\005mj\"a\002\"p_2,\027M\034\005\007{=\001\013\021B\016\002)M,xmZ3ti\026$7i\\7q_:,g\016^:!\021\025yt\002\"\025A\003%Awn\035;DY\006\0348/F\001B!\r)#\tR\005\003\007\032\022Qa\0217bgN\004\"!\022&\016\003\031S!a\022%\002\021%tG/\032:oC2T!!\023\004\002\007\005\004\030.\003\002L\r\nyQ*[2s_\016|g\016\036:pY2,'\017C\003N\037\021\005a*A\006tK2,7\r\036+jKJ\fDCA\035P\021\025\001F\n1\001R\003\025\031H/Y2l!\t\021V+D\001T\025\t!6'\001\003ji\026l\027B\001,T\005%IE/Z7Ti\006\0347\016C\003Y\037\021\005\021,A\006tK2,7\r\036+jKJ\024DCA\035[\021\025\001v\0131\001R\021\025av\002\"\001^\003I\031X\r\\3diRKWM]\"sK\006$\030N^3\025\005er\006\"\002)\\\001\004\t\006\"\0021\020\t\003\t\027\001\003<bY&$\027\r^3\025\005\t4\007c\001\017 GB\021A\004Z\005\003Kv\021a!\0218z%\0264\007\"\002\032`\001\004y\003\"\0025\020\t\003I\027\001C1tg\026l'\r\\3\025\005)t\007c\001\017 WB\021Q\005\\\005\003[\032\022aa\0242kK\016$\b\"\002\032h\001\004y\003\"\0029\020\t\003\t\030AE:fY\026\034G\017R5tCN\034X-\0342mKJ$\"!\017:\t\013A{\007\031A)\t\013Q|A\021A;\002\027\021L7/Y:tK6\024G.\032\013\004m^D\bc\001\017 #\")\001k\035a\001#\")\021p\035a\001m\006Y\021N\\4sK\022LWM\034;t\021\025Yx\002\"\001}\003!\021XmZ5ti\026\024H#A?\021\005qq\030BA@\036\005\021)f.\033;\t\017\005\rq\002\"\025\002\006\005iQ.\031=D_6\004H.\032=jif$B!a\002\002\016A\031A$!\003\n\007\005-QDA\002J]RDaAMA\001\001\004y\003bBA\t\037\021E\0231C\001\tG\006\034X\rV5feR!\021qAA\013\021\031\021\024q\002a\001_\001")
/*     */ public final class MicrocontrollerTemplate { public static void register() { MicrocontrollerTemplate$.MODULE$.register(); } public static ItemStack[] disassemble(ItemStack paramItemStack, ItemStack[] paramArrayOfItemStack) { return MicrocontrollerTemplate$.MODULE$.disassemble(paramItemStack, paramArrayOfItemStack); } public static boolean selectDisassembler(ItemStack paramItemStack) { return MicrocontrollerTemplate$.MODULE$.selectDisassembler(paramItemStack); } public static Object[] assemble(IInventory paramIInventory) { return MicrocontrollerTemplate$.MODULE$.assemble(paramIInventory); } public static Object[] validate(IInventory paramIInventory) { return MicrocontrollerTemplate$.MODULE$.validate(paramIInventory); } public static boolean selectTierCreative(ItemStack paramItemStack) { return MicrocontrollerTemplate$.MODULE$.selectTierCreative(paramItemStack); } public static boolean selectTier2(ItemStack paramItemStack) { return MicrocontrollerTemplate$.MODULE$.selectTier2(paramItemStack); } public static boolean selectTier1(ItemStack paramItemStack) { return MicrocontrollerTemplate$.MODULE$.selectTier1(paramItemStack); } public static Pair<String, Integer> toPair(Tuple2<String, Object> paramTuple2) { return MicrocontrollerTemplate$.MODULE$.toPair(paramTuple2); } public static boolean hasFileSystem(IInventory paramIInventory) {
/*     */     return MicrocontrollerTemplate$.MODULE$.hasFileSystem(paramIInventory);
/*     */   } public static boolean hasInventory(IInventory paramIInventory) {
/*     */     return MicrocontrollerTemplate$.MODULE$.hasInventory(paramIInventory);
/*     */   } public static boolean hasComponent(String paramString, IInventory paramIInventory) {
/*     */     return MicrocontrollerTemplate$.MODULE$.hasComponent(paramString, paramIInventory);
/*     */   } public final class MicrocontrollerTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public final boolean apply(IInventory inventory) {
/*  18 */       return MicrocontrollerTemplate$.MODULE$.hasComponent("eeprom", inventory);
/*     */     }
/*     */     
/*     */     public static final long serialVersionUID = 0L; }
/*     */ 
/*     */   
/*     */   public final class MicrocontrollerTemplate$$anonfun$2
/*     */     extends AbstractFunction1<Object, ItemStack>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IInventory inventory$1;
/*     */     
/*     */     public final ItemStack apply(int x$1) {
/*  31 */       return this.inventory$1.func_70301_a(x$1);
/*     */     } public MicrocontrollerTemplate$$anonfun$2(IInventory inventory$1) {} } public final class MicrocontrollerTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(ItemStack x$1) {
/*  34 */       return !(x$1 == null);
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
/*     */   public final class MicrocontrollerTemplate$$anonfun$register$1
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  71 */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class MicrocontrollerTemplate$$anonfun$register$2
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  93 */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
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
/*     */   public final class MicrocontrollerTemplate$$anonfun$register$3
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 122 */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\MicrocontrollerTemplate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */