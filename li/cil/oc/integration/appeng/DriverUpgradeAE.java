/*    */ package li.cil.oc.integration.appeng;
/*    */ @ScalaSignature(bytes = "\006\001\005\025q!B\001\003\021\003i\021a\004#sSZ,'/\0269he\006$W-Q#\013\005\r!\021AB1qa\026twM\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\020\tJLg/\032:Va\036\024\030\rZ3B\013N!qB\005\016!!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016\037\033\005a\"BA\017\005\0035y\007/\0328d_6\004X\017^3sg&\021q\004\b\002\005\023R,W\016\005\002\"Q5\t!E\003\002$I\005!\021\016^3n\025\t)c%\001\004ee&4XM\035\006\003O\031\t1!\0319j\023\tI#EA\005I_N$\030i^1sK\")1f\004C\001Y\0051A(\0338jiz\"\022!\004\005\006]=!\teL\001\no>\0248n],ji\"$\"\001\r\034\021\005E\"T\"\001\032\013\003M\nQa]2bY\006L!!\016\032\003\017\t{w\016\\3b]\")q'\fa\001q\005)1\017^1dWB\021\021hP\007\002u)\0211e\017\006\003yu\n\021\"\\5oK\016\024\030M\032;\013\003y\n1A\\3u\023\t\001%HA\005Ji\026l7\013^1dW\")!i\004C!\007\006\t2M]3bi\026,eN^5s_:lWM\034;\025\007\021S5\n\005\002F\0216\taI\003\002HM\0059a.\032;x_J\\\027BA%G\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013]\n\005\031\001\035\t\0131\013\005\031A'\002\t!|7\017\036\t\003\013:K!a\024$\003\037\025sg/\033:p]6,g\016\036%pgRDQ!U\b\005BI\013Aa\0357piR\0211K\026\t\003'QK!!\026\013\003\rM#(/\0338h\021\0259\004\0131\0019\021\025Av\002\"\021Z\003\021!\030.\032:\025\005ik\006CA\031\\\023\ta&GA\002J]RDQaN,A\002a:QaX\b\t\002\001\f\001\002\025:pm&$WM\035\t\003C\nl\021a\004\004\006G>A\t\001\032\002\t!J|g/\0333feN\031!ME3\021\005\031<W\"\001\023\n\005!$#aE#om&\024xN\\7f]R\004&o\034<jI\026\024\b\"B\026c\t\003QG#\0011\t\0131\024G\021I7\002\035\035,G/\0228wSJ|g.\\3oiR\031a.a\0011\005=D\bc\0019tm:\021\021']\005\003eJ\na\001\025:fI\0264\027B\001;v\005\025\031E.Y:t\025\t\021(\007\005\002xq2\001A!C=l\003\003\005\tQ!\001{\005\ryF%M\t\003wz\004\"!\r?\n\005u\024$a\002(pi\"Lgn\032\t\003c}L1!!\0013\005\r\te.\037\005\006o-\004\r\001\017")
/*    */ public final class DriverUpgradeAE { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeAE$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isMicrocontroller(paramClass);
/*    */   } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isTablet(paramClass);
/*    */   } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeAE$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeAE$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeAE$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeAE$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeAE$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeAE$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeAE$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 32 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 34 */       return DriverUpgradeAE$.MODULE$.worksWith(stack) ? 
/* 35 */         UpgradeAE.class : 
/* 36 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverUpgradeAE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */