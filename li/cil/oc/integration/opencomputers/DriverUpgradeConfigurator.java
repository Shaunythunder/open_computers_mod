/*    */ package li.cil.oc.integration.opencomputers;@ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\t\021\004\022:jm\026\024X\013]4sC\022,7i\0348gS\036,(/\031;pe*\0211\001B\001\016_B,gnY8naV$XM]:\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005e!%/\033<feV\003xM]1eK\016{gNZ5hkJ\fGo\034:\024\t=\021\"$\b\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\021abG\005\0039\t\021A!\023;f[B\021a$J\007\002?)\021\001%I\001\005SR,WN\003\002#G\0051AM]5wKJT!\001\n\004\002\007\005\004\030.\003\002'?\tI\001j\\:u\003^\f'/\032\005\006Q=!\t!K\001\007y%t\027\016\036 \025\0035AQaK\b\005B1\n\021b^8sWN<\026\016\0365\025\0055\032\004C\001\0302\033\005y#\"\001\031\002\013M\034\027\r\\1\n\005Iz#a\002\"p_2,\027M\034\005\006i)\002\r!N\001\006gR\f7m\033\t\003mqj\021a\016\006\003AaR!!\017\036\002\0235Lg.Z2sC\032$(\"A\036\002\0079,G/\003\002>o\tI\021\n^3n'R\f7m\033\005\006=!\t\005Q\001\022GJ,\027\r^3F]ZL'o\0348nK:$HcA!H\021B\021!)R\007\002\007*\021AiI\001\b]\026$xo\034:l\023\t15I\001\nNC:\fw-\0323F]ZL'o\0348nK:$\b\"\002\033?\001\004)\004\"B%?\001\004Q\025\001\0025pgR\004\"AQ&\n\0051\033%aD#om&\024xN\\7f]RDun\035;\t\0139{A\021I(\002\tMdw\016\036\013\003!^\003\"!\025+\017\0059\022\026BA*0\003\031\001&/\0323fM&\021QK\026\002\007'R\024\030N\\4\013\005M{\003\"\002\033N\001\004)\004\"B-\020\t\003R\026\001\002;jKJ$\"a\0270\021\0059b\026BA/0\005\rIe\016\036\005\006ia\003\r!N\004\006A>A\t!Y\001\t!J|g/\0333feB\021!mY\007\002\037\031)Am\004E\001K\nA\001K]8wS\022,'oE\002d%\031\004\"a\0325\016\003\005J!![\021\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\013!\032G\021A6\025\003\005DQ!\\2\005B9\fabZ3u\013:4\030N]8o[\026tG\017\006\002p}B\022\001/\036\t\004#F\034\030B\001:W\005\025\031E.Y:t!\t!X\017\004\001\005\023Yd\027\021!A\001\006\0039(aA0%cE\021\001p\037\t\003]eL!A_\030\003\0179{G\017[5oOB\021a\006`\005\003{>\0221!\0218z\021\025!D\0161\0016\001")
/*    */ public final class DriverUpgradeConfigurator { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isDrone(paramClass);
/*    */   } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isMicrocontroller(paramClass);
/*    */   } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isTablet(paramClass);
/*    */   } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeConfigurator$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 33 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 35 */       return DriverUpgradeConfigurator$.MODULE$.worksWith(stack) ? 
/* 36 */         UpgradeConfigurator.Robot.class : 
/* 37 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeConfigurator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */