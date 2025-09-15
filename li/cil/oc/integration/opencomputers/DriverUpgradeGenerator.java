/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\ta\003\022:jm\026\024X\013]4sC\022,w)\0328fe\006$xN\035\006\003\007\021\tQb\0349f]\016|W\016];uKJ\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\fEe&4XM]+qOJ\fG-Z$f]\026\024\030\r^8s'\021y!CG\017\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"AD\016\n\005q\021!\001B%uK6\004\"AH\023\016\003}Q!\001I\021\002\t%$X-\034\006\003E\r\na\001\032:jm\026\024(B\001\023\007\003\r\t\007/[\005\003M}\021\021\002S8ti\006;\030M]3\t\013!zA\021A\025\002\rqJg.\033;?)\005i\001\"B\026\020\t\003b\023!C<pe.\034x+\033;i)\ti3\007\005\002/c5\tqFC\0011\003\025\0318-\0317b\023\t\021tFA\004C_>dW-\0318\t\013QR\003\031A\033\002\013M$\030mY6\021\005YbT\"A\034\013\005\001B$BA\035;\003%i\027N\\3de\0064GOC\001<\003\rqW\r^\005\003{]\022\021\"\023;f[N#\030mY6\t\013}zA\021\t!\002#\r\024X-\031;f\013:4\030N]8o[\026tG\017F\002B\017\"\003\"AQ#\016\003\rS!\001R\022\002\0179,Go^8sW&\021ai\021\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\0035}\001\007Q\007C\003J}\001\007!*\001\003i_N$\bC\001\"L\023\ta5IA\bF]ZL'o\0348nK:$\bj\\:u\021\025qu\002\"\021P\003\021\031Hn\034;\025\005A\033\006CA\nR\023\t\021FC\001\004TiJLgn\032\005\006i5\003\r!\016\005\006+>!\tEV\001\005i&,'\017\006\002X5B\021a\006W\005\0033>\0221!\0238u\021\025!D\0131\0016\017\025av\002#\001^\003!\001&o\034<jI\026\024\bC\0010`\033\005ya!\0021\020\021\003\t'\001\003)s_ZLG-\032:\024\007}\023\"\r\005\002dI6\t\021%\003\002fC\t\031RI\034<je>tW.\0328u!J|g/\0333fe\")\001f\030C\001OR\tQ\fC\003j?\022\005#.\001\bhKR,eN^5s_:lWM\034;\025\005-t\bG\0017v!\ri\007o\035\b\003]9L!a\\\030\002\rA\023X\rZ3g\023\t\t(OA\003DY\006\0348O\003\002p_A\021A/\036\007\001\t%1\b.!A\001\002\013\005qOA\002`IE\n\"\001_>\021\0059J\030B\001>0\005\035qu\016\0365j]\036\004\"A\f?\n\005u|#aA!os\")A\007\033a\001k\001")
/*    */ public final class DriverUpgradeGenerator { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeGenerator$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeGenerator$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeGenerator$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeGenerator$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeGenerator$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeGenerator$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeGenerator$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeGenerator$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeGenerator$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeGenerator$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeGenerator$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeGenerator$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeGenerator$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeGenerator$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeGenerator$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 29 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 31 */       return DriverUpgradeGenerator$.MODULE$.worksWith(stack) ? 
/* 32 */         UpgradeGenerator.class : 
/* 33 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */