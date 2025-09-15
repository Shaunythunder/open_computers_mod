/*    */ package li.cil.oc.integration.gc;
/*    */ 
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ @ScalaSignature(bytes = "\006\001m<Q!\001\002\t\0025\tQ\003\022:jm\026\024xk\034:mIN+gn]8s\007\006\024HM\003\002\004\t\005\021qm\031\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003+\021\023\030N^3s/>\024H\016Z*f]N|'oQ1sIN!qB\005\016!!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016\037\033\005a\"BA\017\005\0035y\007/\0328d_6\004X\017^3sg&\021q\004\b\002\005\023R,W\016\005\002\"Q5\t!E\003\002$I\005!\021\016^3n\025\t)c%\001\004ee&4XM\035\006\003O\031\t1!\0319j\023\tI#EA\005I_N$\030i^1sK\")1f\004C\001Y\0051A(\0338jiz\"\022!\004\005\006]=!\teL\001\no>\0248n],ji\"$\"\001\r\034\021\005E\"T\"\001\032\013\003M\nQa]2bY\006L!!\016\032\003\017\t{w\016\\3b]\")q'\fa\001q\005)1\017^1dWB\021\021hP\007\002u)\0211e\017\006\003yu\n\021\"\\5oK\016\024\030M\032;\013\003y\n1A\\3u\023\t\001%HA\005Ji\026l7\013^1dW\")!i\004C!\007\006\t2M]3bi\026,eN^5s_:lWM\034;\025\007\021S5\n\005\002F\0216\taI\003\002HM\0059a.\032;x_J\\\027BA%G\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013]\n\005\031\001\035\t\0131\013\005\031A'\002\t!|7\017\036\t\003\013:K!a\024$\003\037\025sg/\033:p]6,g\016\036%pgRDQ!U\b\005BI\013Aa\0357piR\0211K\026\t\003'QK!!\026\013\003\rM#(/\0338h\021\0259\004\0131\0019\017\025Av\002#\001Z\003!\001&o\034<jI\026\024\bC\001.\\\033\005ya!\002/\020\021\003i&\001\003)s_ZLG-\032:\024\007m\023b\f\005\002`A6\tA%\003\002bI\t\031RI\034<je>tW.\0328u!J|g/\0333fe\")1f\027C\001GR\t\021\fC\003f7\022\005c-\001\bhKR,eN^5s_:lWM\034;\025\005\035T\bG\0015r!\rIGn\034\b\003c)L!a\033\032\002\rA\023X\rZ3g\023\tigNA\003DY\006\0348O\003\002leA\021\001/\035\007\001\t%\021H-!A\001\002\013\0051OA\002`IE\n\"\001^<\021\005E*\030B\001<3\005\035qu\016\0365j]\036\004\"!\r=\n\005e\024$aA!os\")q\007\032a\001q\001")
/*    */ public final class DriverWorldSensorCard { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverWorldSensorCard$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverWorldSensorCard$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverWorldSensorCard$.MODULE$.dataTag(paramItemStack); } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverWorldSensorCard$.MODULE$.tier(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWorldSensorCard$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverWorldSensorCard$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverWorldSensorCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverWorldSensorCard$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 23 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 25 */       return DriverWorldSensorCard$.MODULE$.worksWith(stack) ? 
/* 26 */         WorldSensorCard.class : 
/* 27 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gc\DriverWorldSensorCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */