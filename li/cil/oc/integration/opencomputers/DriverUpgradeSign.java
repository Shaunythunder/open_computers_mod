/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001a<Q!\001\002\t\0025\t\021\003\022:jm\026\024X\013]4sC\022,7+[4o\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003#\021\023\030N^3s+B<'/\0313f'&<gn\005\003\020%ii\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\0059Y\022B\001\017\003\005\021IE/Z7\021\005y)S\"A\020\013\005\001\n\023\001B5uK6T!AI\022\002\r\021\024\030N^3s\025\t!c!A\002ba&L!AJ\020\003\023!{7\017^!xCJ,\007\"\002\025\020\t\003I\023A\002\037j]&$h\bF\001\016\021\025Ys\002\"\021-\003%9xN]6t/&$\b\016\006\002.gA\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t9!i\\8mK\006t\007\"\002\033+\001\004)\024!B:uC\016\\\007C\001\034=\033\0059$B\001\0219\025\tI$(A\005nS:,7M]1gi*\t1(A\002oKRL!!P\034\003\023%#X-\\*uC\016\\\007\"B \020\t\003\002\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031\021i\022%\021\005\t+U\"A\"\013\005\021\033\023a\0028fi^|'o[\005\003\r\016\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")AG\020a\001k!)\021J\020a\001\025\006!\001n\\:u!\t\0215*\003\002M\007\nyQI\034<je>tW.\0328u\021>\034H\017C\003O\037\021\005s*\001\003tY>$HC\001)T!\t\031\022+\003\002S)\t11\013\036:j]\036DQ\001N'A\002U:Q!V\b\t\002Y\013\001\002\025:pm&$WM\035\t\003/bk\021a\004\004\0063>A\tA\027\002\t!J|g/\0333feN\031\001LE.\021\005qkV\"A\021\n\005y\013#aE#om&\024xN\\7f]R\004&o\034<jI\026\024\b\"\002\025Y\t\003\001G#\001,\t\013\tDF\021I2\002\035\035,G/\0228wSJ|g.\\3oiR\021Am\036\031\003K:\0042AZ5m\035\tqs-\003\002i_\0051\001K]3eK\032L!A[6\003\013\rc\027m]:\013\005!|\003CA7o\031\001!\021b\\1\002\002\003\005)\021\0019\003\007}#\023'\005\002riB\021aF]\005\003g>\022qAT8uQ&tw\r\005\002/k&\021ao\f\002\004\003:L\b\"\002\033b\001\004)\004")
/*    */ public final class DriverUpgradeSign { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeSign$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeSign$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeSign$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeSign$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeSign$.MODULE$.dataTag(paramItemStack);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeSign$.MODULE$.tier(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeSign$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeSign$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeSign$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeSign$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 30 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 32 */       return DriverUpgradeSign$.MODULE$.worksWith(stack) ? 
/* 33 */         UpgradeSign.class : 
/* 34 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeSign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */