/*     */ package li.cil.oc.common.template;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ @ScalaSignature(bytes = "\006\001\005]q!B\001\003\021\003i\021!\004#s_:,G+Z7qY\006$XM\003\002\004\t\005AA/Z7qY\006$XM\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\0055!%o\0348f)\026l\007\017\\1uKN\021qB\005\t\003\035MI!\001\006\002\003\021Q+W\016\0357bi\026DQAF\b\005\002]\ta\001P5oSRtD#A\007\t\017ey!\031!C)5\005\0312/^4hKN$X\rZ\"p[B|g.\0328ugV\t1\004E\002\035?\005j\021!\b\006\002=\005)1oY1mC&\021\001%\b\002\006\003J\024\030-\037\t\0059\t\"C&\003\002$;\t1A+\0369mKJ\002\"!\n\026\016\003\031R!a\n\025\002\t1\fgn\032\006\002S\005!!.\031<b\023\tYcE\001\004TiJLgn\032\t\00595z\023(\003\002/;\tIa)\0368di&|g.\r\t\003a]j\021!\r\006\003eM\n\021\"\0338wK:$xN]=\013\005Q*\024!C7j]\026\034'/\0314u\025\0051\024a\0018fi&\021\001(\r\002\013\023&sg/\0328u_JL\bC\001\017;\023\tYTDA\004C_>dW-\0318\t\ruz\001\025!\003\034\003Q\031XoZ4fgR,GmQ8na>tWM\034;tA!)qh\004C)\001\006I\001n\\:u\0072\f7o]\013\002\003B\031QE\021#\n\005\r3#!B\"mCN\034\bCA#K\033\0051%BA$I\003!Ig\016^3s]\006d'BA%\007\003\r\t\007/[\005\003\027\032\023Q\001\022:p]\026DQ!T\b\005\0029\0131b]3mK\016$H+[3scQ\021\021h\024\005\006!2\003\r!U\001\006gR\f7m\033\t\003%Vk\021a\025\006\003)N\nA!\033;f[&\021ak\025\002\n\023R,Wn\025;bG.DQ\001W\b\005\002e\0131b]3mK\016$H+[3seQ\021\021H\027\005\006!^\003\r!\025\005\0069>!\t!X\001\023g\026dWm\031;US\026\0248I]3bi&4X\r\006\002:=\")\001k\027a\001#\")\001m\004C\001C\006Aa/\0317jI\006$X\r\006\002cMB\031AdH2\021\005q!\027BA3\036\005\031\te.\037*fM\")!g\030a\001_!)\001n\004C\001S\006A\021m]:f[\ndW\r\006\002k]B\031AdH6\021\005\025b\027BA7'\005\031y%M[3di\")!g\032a\001_!)\001o\004C\001c\006\0212/\0327fGR$\025n]1tg\026l'\r\\3s)\tI$\017C\003Q_\002\007\021\013C\003u\037\021\005Q/A\006eSN\f7o]3nE2,Gc\001<xqB\031AdH)\t\013A\033\b\031A)\t\013e\034\b\031\001<\002\027%twM]3eS\026tGo\035\005\006w>!\t\001`\001\te\026<\027n\035;feR\tQ\020\005\002\035}&\021q0\b\002\005+:LG\017C\004\002\004=!\t&!\002\002\0335\f\007pQ8na2,\0070\033;z)\021\t9!!\004\021\007q\tI!C\002\002\fu\0211!\0238u\021\031\021\024\021\001a\001_!9\021\021C\b\005R\005M\021\001C2bg\026$\026.\032:\025\t\005\035\021Q\003\005\007e\005=\001\031A\030")
/*     */ public final class DroneTemplate { public static void register() { DroneTemplate$.MODULE$.register(); } public static ItemStack[] disassemble(ItemStack paramItemStack, ItemStack[] paramArrayOfItemStack) { return DroneTemplate$.MODULE$.disassemble(paramItemStack, paramArrayOfItemStack); } public static boolean selectDisassembler(ItemStack paramItemStack) { return DroneTemplate$.MODULE$.selectDisassembler(paramItemStack); } public static Object[] assemble(IInventory paramIInventory) { return DroneTemplate$.MODULE$.assemble(paramIInventory); } public static Object[] validate(IInventory paramIInventory) { return DroneTemplate$.MODULE$.validate(paramIInventory); } public static boolean selectTierCreative(ItemStack paramItemStack) { return DroneTemplate$.MODULE$.selectTierCreative(paramItemStack); } public static boolean selectTier2(ItemStack paramItemStack) { return DroneTemplate$.MODULE$.selectTier2(paramItemStack); } public static boolean selectTier1(ItemStack paramItemStack) {
/*     */     return DroneTemplate$.MODULE$.selectTier1(paramItemStack);
/*     */   } public static Pair<String, Integer> toPair(Tuple2<String, Object> paramTuple2) {
/*     */     return DroneTemplate$.MODULE$.toPair(paramTuple2);
/*     */   } public static boolean hasFileSystem(IInventory paramIInventory) {
/*     */     return DroneTemplate$.MODULE$.hasFileSystem(paramIInventory);
/*     */   } public static boolean hasInventory(IInventory paramIInventory) {
/*     */     return DroneTemplate$.MODULE$.hasInventory(paramIInventory);
/*     */   } public static boolean hasComponent(String paramString, IInventory paramIInventory) {
/*     */     return DroneTemplate$.MODULE$.hasComponent(paramString, paramIInventory);
/*     */   } public final class DroneTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public final boolean apply(IInventory inventory) {
/*  20 */       return DroneTemplate$.MODULE$.hasComponent("eeprom", inventory);
/*     */     }
/*     */     
/*     */     public static final long serialVersionUID = 0L; }
/*     */ 
/*     */   
/*     */   public final class DroneTemplate$$anonfun$2
/*     */     extends AbstractFunction1<Object, ItemStack>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IInventory inventory$1;
/*     */     
/*     */     public final ItemStack apply(int x$1) {
/*  33 */       return this.inventory$1.func_70301_a(x$1);
/*     */     } public DroneTemplate$$anonfun$2(IInventory inventory$1) {} }
/*     */   public final class DroneTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(ItemStack x$1) {
/*  37 */       return !(x$1 == null);
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
/*     */   public final class DroneTemplate$$anonfun$register$1
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  76 */       return DroneTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class DroneTemplate$$anonfun$register$2
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  99 */       return DroneTemplate$.MODULE$.toPair(t);
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
/*     */   public final class DroneTemplate$$anonfun$register$3
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
/* 128 */       return DroneTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\DroneTemplate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */