/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.TpsCard;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001M<Q!\001\002\t\0025\tQ\002\022:jm\026\024H\013]:DCJ$'BA\002\005\0035y\007/\0328d_6\004X\017^3sg*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021Q\002\022:jm\026\024H\013]:DCJ$7cA\b\0235A\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\0177%\021AD\001\002\005\023R,W\016C\003\037\037\021\005q$\001\004=S:LGO\020\013\002\033!)\021e\004C!E\005Iqo\034:lg^KG\017\033\013\003G%\002\"\001J\024\016\003\025R\021AJ\001\006g\016\fG.Y\005\003Q\025\022qAQ8pY\026\fg\016C\003+A\001\0071&A\003ti\006\0347\016\005\002-g5\tQF\003\002/_\005!\021\016^3n\025\t\001\024'A\005nS:,7M]1gi*\t!'A\002oKRL!\001N\027\003\023%#X-\\*uC\016\\\007\"\002\034\020\t\003:\024!E2sK\006$X-\0228wSJ|g.\\3oiR\031\001\bQ!\021\005erT\"\001\036\013\005mb\024a\0028fi^|'o\033\006\003{\031\t1!\0319j\023\ty$H\001\nNC:\fw-\0323F]ZL'o\0348nK:$\b\"\002\0266\001\004Y\003\"\002\"6\001\004\031\025\001\0025pgR\004\"!\017#\n\005\025S$aD#om&\024xN\\7f]RDun\035;\t\013\035{A\021\t%\002\tMdw\016\036\013\003\023B\003\"AS'\017\005\021Z\025B\001'&\003\031\001&/\0323fM&\021aj\024\002\007'R\024\030N\\4\013\0051+\003\"\002\026G\001\004Ys!\002*\020\021\003\031\026\001\003)s_ZLG-\032:\021\005Q+V\"A\b\007\013Y{\001\022A,\003\021A\023xN^5eKJ\0342!\026\nY!\tIF,D\001[\025\tYF(\001\004ee&4XM]\005\003;j\0231#\0228wSJ|g.\\3oiB\023xN^5eKJDQAH+\005\002}#\022a\025\005\006CV#\tEY\001\017O\026$XI\034<je>tW.\0328u)\t\031'\017\r\002eSB\031!*Z4\n\005\031|%!B\"mCN\034\bC\0015j\031\001!\021B\0331\002\002\003\005)\021A6\003\007}#\023'\005\002m_B\021A%\\\005\003]\026\022qAT8uQ&tw\r\005\002%a&\021\021/\n\002\004\003:L\b\"\002\026a\001\004Y\003")
/*    */ public final class DriverTpsCard {
/*    */   public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverTpsCard$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverTpsCard$.MODULE$.dataTag(paramItemStack); } public static int tier(ItemStack paramItemStack) { return DriverTpsCard$.MODULE$.tier(paramItemStack); } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) { return DriverTpsCard$.MODULE$.worksWith(paramItemStack, paramClass); } public static String slot(ItemStack paramItemStack) { return DriverTpsCard$.MODULE$.slot(paramItemStack); } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverTpsCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverTpsCard$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 20 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 22 */       return DriverTpsCard$.MODULE$.worksWith(stack) ? 
/* 23 */         TpsCard.class : 
/* 24 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTpsCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */