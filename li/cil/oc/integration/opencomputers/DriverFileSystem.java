/*     */ package li.cil.oc.integration.opencomputers;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.server.fs.FileSystem;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.util.matching.Regex;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ut!B\001\003\021\003i\021\001\005#sSZ,'OR5mKNK8\017^3n\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003!\021\023\030N^3s\r&dWmU=ti\026l7cA\b\0235A\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\0177%\021AD\001\002\005\023R,W\016C\003\037\037\021\005q$\001\004=S:LGO\020\013\002\033!9\021e\004b\001\n\003\021\023\001D+V\023\0223VM]5gS\026\024X#A\022\021\005\021ZS\"A\023\013\005\031:\023\001C7bi\016D\027N\\4\013\005!J\023\001B;uS2T\021AK\001\006g\016\fG.Y\005\003Y\025\022QAU3hKbDaAL\b!\002\023\031\023!D+V\023\0223VM]5gS\026\024\b\005C\0031\037\021\005\023'A\005x_J\\7oV5uQR\021!G\016\t\003gQj\021!K\005\003k%\022qAQ8pY\026\fg\016C\0038_\001\007\001(A\003ti\006\0347\016\005\002:\0016\t!H\003\002<y\005!\021\016^3n\025\tid(A\005nS:,7M]1gi*\tq(A\002oKRL!!\021\036\003\023%#X-\\*uC\016\\\007\"B\"\020\t\003\"\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031Q)\024(\021\005\031[U\"A$\013\005!K\025a\0028fi^|'o\033\006\003\025\032\t1!\0319j\023\tauI\001\nNC:\fw-\0323F]ZL'o\0348nK:$\b\"B\034C\001\004A\004\"B(C\001\004\001\026\001\0025pgR\004\"AR)\n\005I;%aD#om&\024xN\\7f]RDun\035;\t\013Q{A\021I+\002\tMdw\016\036\013\003-f\003\"aE,\n\005a#\"AB*ue&tw\rC\0038'\002\007\001\bC\003\\\037\021\005C,\001\003uS\026\024HCA/a!\t\031d,\003\002`S\t\031\021J\034;\t\013]R\006\031\001\035\t\013\r{A\021\0022\025\r\025\033GM\0325j\021\0259\024\r1\0019\021\025)\027\r1\001^\003!\031\027\r]1dSRL\b\"B4b\001\004i\026\001\0049mCR$XM]\"pk:$\b\"B(b\001\004\001\006\"\0026b\001\004i\026!B:qK\026$\007\"\0027\020\t\023i\027AD1eIJ,7o\035$s_6$\026m\032\013\003]R\004\"a\034:\017\005M\002\030BA9*\003\031\001&/\0323fM&\021\001l\035\006\003c&BQ!^6A\002Y\f1\001^1h!\t9(0D\001y\025\tIH(A\002oERL!a\037=\003\0359\023E\013V1h\007>l\007o\\;oI\032!Qp\004\003\005I\021V-\0313Xe&$X-\023;f[2\013'-\0327\024\005q|\b\003BA\001\003SqA!a\001\002$9!\021QAA\017\035\021\t9!!\007\017\t\005%\021q\003\b\005\003\027\t)B\004\003\002\016\005MQBAA\b\025\r\t\t\002D\001\007yI|w\016\036 \n\003-I!!\003\006\n\005\035A\021bAA\016\r\00511/\032:wKJLA!a\b\002\"\005\021am\035\006\004\00371\021\002BA\023\003O\t!BR5mKNK8\017^3n\025\021\ty\"!\t\n\t\005-\022Q\006\002\n\023R,W\016T1cK2TA!!\n\002(!Qq\007 B\001B\003%\001(!\r\n\007]\nI\003\003\004\037y\022\005\021Q\007\013\005\003o\tY\004E\002\002:ql\021a\004\005\007o\005M\002\031\001\035\t\023\005}B\0201A\005\002\005\005\023!\0027bE\026dWCAA\"!\021\031\024Q\t8\n\007\005\035\023F\001\004PaRLwN\034\005\n\003\027b\b\031!C\001\003\033\n\021\002\\1cK2|F%Z9\025\t\005=\023Q\013\t\004g\005E\023bAA*S\t!QK\\5u\021)\t9&!\023\002\002\003\007\0211I\001\004q\022\n\004\002CA.y\002\006K!a\021\002\r1\f'-\0327!\021\035\ty\006 C!\003C\n\001bZ3u\031\006\024W\r\034\013\002-\"9\021Q\r?\005B\005\035\024\001C:fi2\013'-\0327\025\t\005=\023\021\016\005\b\003W\n\031\0071\001o\003\0251\030\r\\;f\021\035\ty\007 C!\003c\nA\001\\8bIR!\021qJA:\021\031I\030Q\016a\001m\"9\021q\017?\005B\005e\024\001B:bm\026$B!a\024\002|!1\0210!\036A\002Y\004")
/*     */ public final class DriverFileSystem
/*     */ {
/*     */   public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isDrone(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isMicrocontroller(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isTablet(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isServer(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isRotatable(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isRobot(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isComputer(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.isAdapter(paramClass);
/*     */   }
/*     */   
/*     */   public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*     */     return DriverFileSystem$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*     */   }
/*     */   
/*     */   public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*     */     return DriverFileSystem$.MODULE$.dataTag(paramItemStack);
/*     */   }
/*     */   
/*     */   public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*     */     return DriverFileSystem$.MODULE$.worksWith(paramItemStack, paramClass);
/*     */   }
/*     */   
/*     */   public static int tier(ItemStack paramItemStack) {
/*     */     return DriverFileSystem$.MODULE$.tier(paramItemStack);
/*     */   }
/*     */   
/*     */   public static String slot(ItemStack paramItemStack) {
/*     */     return DriverFileSystem$.MODULE$.slot(paramItemStack);
/*     */   }
/*     */   
/*     */   public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*     */     return DriverFileSystem$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*     */   }
/*     */   
/*     */   public static boolean worksWith(ItemStack paramItemStack) {
/*     */     return DriverFileSystem$.MODULE$.worksWith(paramItemStack);
/*     */   }
/*     */   
/*     */   public static Regex UUIDVerifier() {
/*     */     return DriverFileSystem$.MODULE$.UUIDVerifier();
/*     */   }
/*     */   
/*     */   public static class ReadWriteItemLabel
/*     */     extends FileSystem.ItemLabel
/*     */   {
/*     */     private Option<String> label;
/*     */     
/*     */     public ReadWriteItemLabel(ItemStack stack) {
/* 103 */       super(stack);
/* 104 */       this.label = (Option<String>)None$.MODULE$; } public Option<String> label() { return this.label; } public void label_$eq(Option<String> x$1) { this.label = x$1; }
/*     */      public String getLabel() {
/* 106 */       return (String)label().orNull(Predef$.MODULE$.$conforms());
/*     */     }
/*     */     
/* 109 */     public void setLabel(String value) { label_$eq(Option$.MODULE$.apply(value).map((Function1)new DriverFileSystem$ReadWriteItemLabel$$anonfun$setLabel$1(this))); } public final class DriverFileSystem$ReadWriteItemLabel$$anonfun$setLabel$1 extends AbstractFunction1<String, String> implements Serializable { public final String apply(String x$1) { return (String)(new StringOps(Predef$.MODULE$.augmentString(x$1))).take(16); }
/*     */        public static final long serialVersionUID = 0L;
/*     */       public DriverFileSystem$ReadWriteItemLabel$$anonfun$setLabel$1(DriverFileSystem.ReadWriteItemLabel $outer) {} }
/*     */     public void load(NBTTagCompound nbt) {
/* 113 */       if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs.label").toString())) {
/* 114 */         label_$eq(Option$.MODULE$.apply(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs.label").toString())));
/*     */       }
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 119 */       Option<String> option = label();
/* 120 */       if (option instanceof Some) { Some some = (Some)option; String value = (String)some.x(); nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs.label").toString(), value); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 121 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */