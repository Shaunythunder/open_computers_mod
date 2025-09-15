/*    */ package li.cil.oc.integration.forestry;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.collection.Seq;
/*    */ @ScalaSignature(bytes = "\006\001\005\025q!B\001\003\021\003i\021A\006#sSZ,'/\0269he\006$WMQ3fW\026,\007/\032:\013\005\r!\021\001\0034pe\026\034HO]=\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005Y!%/\033<feV\003xM]1eK\n+Wm[3fa\026\0248\003B\b\0235\001\002\"a\005\r\016\003QQ!!\006\f\002\t1\fgn\032\006\002/\005!!.\031<b\023\tIBC\001\004PE*,7\r\036\t\0037yi\021\001\b\006\003;\021\tQb\0349f]\016|W\016];uKJ\034\030BA\020\035\005\021IE/Z7\021\005\005BS\"\001\022\013\005\r\"\023\001B5uK6T!!\n\024\002\r\021\024\030N^3s\025\t9c!A\002ba&L!!\013\022\003\023!{7\017^!xCJ,\007\"B\026\020\t\003a\023A\002\037j]&$h\bF\001\016\021\025qs\002\"\0210\003%9xN]6t/&$\b\016\006\0021mA\021\021\007N\007\002e)\t1'A\003tG\006d\027-\003\0026e\t9!i\\8mK\006t\007\"B\034.\001\004A\024!B:uC\016\\\007CA\035@\033\005Q$BA\022<\025\taT(A\005nS:,7M]1gi*\ta(A\002oKRL!\001\021\036\003\023%#X-\\*uC\016\\\007\"\002\"\020\t\003\032\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031AIS&\021\005\025CU\"\001$\013\005\0353\023a\0028fi^|'o[\005\003\023\032\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")q'\021a\001q!)A*\021a\001\033\006!\001n\\:u!\t)e*\003\002P\r\nyQI\034<je>tW.\0328u\021>\034H\017C\003R\037\021\005#+\001\003tY>$HCA*[!\t!vK\004\0022+&\021aKM\001\007!J,G-\0324\n\005aK&AB*ue&twM\003\002We!)q\007\025a\001q!)Al\004C!;\006!A/[3s)\tq\026\r\005\0022?&\021\001M\r\002\004\023:$\b\"B\034\\\001\004At!B2\020\021\003!\027\001\003)s_ZLG-\032:\021\005\0254W\"A\b\007\013\035|\001\022\0015\003\021A\023xN^5eKJ\0342A\032\nj!\tQ7.D\001%\023\taGEA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\003,M\022\005a\016F\001e\021\025\001h\r\"\021r\00399W\r^#om&\024xN\\7f]R$2A]A\002a\t\031\b\020E\002UiZL!!^-\003\013\rc\027m]:\021\005]DH\002\001\003\ns>\f\t\021!A\003\002i\0241a\030\0232#\tYh\020\005\0022y&\021QP\r\002\b\035>$\b.\0338h!\t\tt0C\002\002\002I\0221!\0218z\021\0259t\0161\0019\001")
/*    */ public final class DriverUpgradeBeekeeper { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeBeekeeper$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeBeekeeper$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeBeekeeper$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeBeekeeper$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeBeekeeper$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeBeekeeper$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 28 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 30 */       return DriverUpgradeBeekeeper$.MODULE$.worksWith(stack) ? 
/* 31 */         UpgradeBeekeeper.class : 
/* 32 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\DriverUpgradeBeekeeper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */