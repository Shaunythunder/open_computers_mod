/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.UpgradeChunkloader;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ @ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\t\001\004\022:jm\026\024X\013]4sC\022,7\t[;oW2|\027\rZ3s\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\0031\021\023\030N^3s+B<'/\0313f\007\",hn\0337pC\022,'o\005\003\020%ii\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\0059Y\022B\001\017\003\005\021IE/Z7\021\005y)S\"A\020\013\005\001\n\023\001B5uK6T!AI\022\002\r\021\024\030N^3s\025\t!c!A\002ba&L!AJ\020\003\023!{7\017^!xCJ,\007\"\002\025\020\t\003I\023A\002\037j]&$h\bF\001\016\021\025Ys\002\"\021-\003%9xN]6t/&$\b\016\006\002.gA\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t9!i\\8mK\006t\007\"\002\033+\001\004)\024!B:uC\016\\\007C\001\034=\033\0059$B\001\0219\025\tI$(A\005nS:,7M]1gi*\t1(A\002oKRL!!P\034\003\023%#X-\\*uC\016\\\007\"B \020\t\003\002\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031\021i\022%\021\005\t+U\"A\"\013\005\021\033\023a\0028fi^|'o[\005\003\r\016\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")AG\020a\001k!)\021J\020a\001\025\006!\001n\\:u!\t\0215*\003\002M\007\nyQI\034<je>tW.\0328u\021>\034H\017C\003O\037\021\005s*\001\003tY>$HC\001)T!\t\031\022+\003\002S)\t11\013\036:j]\036DQ\001N'A\002UBQ!V\b\005BY\013A\001^5feR\021qK\027\t\003]aK!!W\030\003\007%sG\017C\0035)\002\007QgB\003]\037!\005Q,\001\005Qe>4\030\016Z3s!\tqv,D\001\020\r\025\001w\002#\001b\005!\001&o\034<jI\026\0248cA0\023EB\0211\rZ\007\002C%\021Q-\t\002\024\013:4\030N]8o[\026tG\017\025:pm&$WM\035\005\006Q}#\ta\032\013\002;\")\021n\030C!U\006qq-\032;F]ZL'o\0348nK:$HCA6a\taW\017E\002naNt!A\f8\n\005=|\023A\002)sK\022,g-\003\002re\n)1\t\\1tg*\021qn\f\t\003iVd\001\001B\005wQ\006\005\t\021!B\001o\n\031q\fJ\031\022\005a\\\bC\001\030z\023\tQxFA\004O_RD\027N\\4\021\0059b\030BA?0\005\r\te.\037\005\006i!\004\r!\016")
/*    */ public final class DriverUpgradeChunkloader { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeChunkloader$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeChunkloader$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 25 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 27 */       return DriverUpgradeChunkloader$.MODULE$.worksWith(stack) ? 
/* 28 */         UpgradeChunkloader.class : 
/* 29 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeChunkloader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */