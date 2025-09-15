/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\tq\003\022:jm\026\024X\013]4sC\022,g*\031<jO\006$\030n\0348\013\005\r!\021!D8qK:\034w.\0349vi\026\0248O\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\030\tJLg/\032:Va\036\024\030\rZ3OCZLw-\031;j_:\034Ba\004\n\033;A\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\0177%\021AD\001\002\005\023R,W\016\005\002\037K5\tqD\003\002!C\005!\021\016^3n\025\t\0213%\001\004ee&4XM\035\006\003I\031\t1!\0319j\023\t1sDA\005I_N$\030i^1sK\")\001f\004C\001S\0051A(\0338jiz\"\022!\004\005\006W=!\t\005L\001\no>\0248n],ji\"$\"!L\032\021\0059\nT\"A\030\013\003A\nQa]2bY\006L!AM\030\003\017\t{w\016\\3b]\")AG\013a\001k\005)1\017^1dWB\021a\007P\007\002o)\021\001\005\017\006\003si\n\021\"\\5oK\016\024\030M\032;\013\003m\n1A\\3u\023\titGA\005Ji\026l7\013^1dW\")qh\004C!\001\006\t2M]3bi\026,eN^5s_:lWM\034;\025\007\005;\005\n\005\002C\0136\t1I\003\002EG\0059a.\032;x_J\\\027B\001$D\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013Qr\004\031A\033\t\013%s\004\031\001&\002\t!|7\017\036\t\003\005.K!\001T\"\003\037\025sg/\033:p]6,g\016\036%pgRDQAT\b\005B=\013Aa\0357piR\021\001k\025\t\003'EK!A\025\013\003\rM#(/\0338h\021\025!T\n1\0016\021\025)v\002\"\021W\003\021!\030.\032:\025\005]S\006C\001\030Y\023\tIvFA\002J]RDQ\001\016+A\002U:Q\001X\b\t\002u\013\001\002\025:pm&$WM\035\t\003=~k\021a\004\004\006A>A\t!\031\002\t!J|g/\0333feN\031qL\0052\021\005\r$W\"A\021\n\005\025\f#aE#om&\024xN\\7f]R\004&o\034<jI\026\024\b\"\002\025`\t\0039G#A/\t\013%|F\021\t6\002\035\035,G/\0228wSJ|g.\\3oiR\0211N \031\003YV\0042!\0349t\035\tqc.\003\002p_\0051\001K]3eK\032L!!\035:\003\013\rc\027m]:\013\005=|\003C\001;v\031\001!\021B\0365\002\002\003\005)\021A<\003\007}#\023'\005\002ywB\021a&_\005\003u>\022qAT8uQ&tw\r\005\002/y&\021Qp\f\002\004\003:L\b\"\002\033i\001\004)\004")
/*    */ public final class DriverUpgradeNavigation { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeNavigation$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeNavigation$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeNavigation$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeNavigation$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeNavigation$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeNavigation$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeNavigation$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeNavigation$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeNavigation$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeNavigation$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeNavigation$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeNavigation$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeNavigation$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeNavigation$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeNavigation$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 29 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 31 */       return DriverUpgradeNavigation$.MODULE$.worksWith(stack) ? 
/* 32 */         UpgradeNavigation.class : 
/* 33 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeNavigation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */