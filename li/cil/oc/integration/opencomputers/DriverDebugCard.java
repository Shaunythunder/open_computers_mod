/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.DebugCard;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001M<Q!\001\002\t\0025\tq\002\022:jm\026\024H)\0322vO\016\013'\017\032\006\003\007\021\tQb\0349f]\016|W\016];uKJ\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\bEe&4XM\035#fEV<7)\031:e'\ry!C\007\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\021abG\005\0039\t\021A!\023;f[\")ad\004C\001?\0051A(\0338jiz\"\022!\004\005\006C=!\tEI\001\no>\0248n],ji\"$\"aI\025\021\005\021:S\"A\023\013\003\031\nQa]2bY\006L!\001K\023\003\017\t{w\016\\3b]\")!\006\ta\001W\005)1\017^1dWB\021AfM\007\002[)\021afL\001\005SR,WN\003\0021c\005IQ.\0338fGJ\fg\r\036\006\002e\005\031a.\032;\n\005Qj#!C%uK6\034F/Y2l\021\0251t\002\"\0218\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\004q\001\013\005CA\035?\033\005Q$BA\036=\003\035qW\r^<pe.T!!\020\004\002\007\005\004\030.\003\002@u\t\021R*\0318bO\026$WI\034<je>tW.\0328u\021\025QS\0071\001,\021\025\021U\0071\001D\003\021Awn\035;\021\005e\"\025BA#;\005=)eN^5s_:lWM\034;I_N$\b\"B$\020\t\003B\025\001B:m_R$\"!\023'\021\005MQ\025BA&\025\005\031\031FO]5oO\")!F\022a\001W\035)aj\004E\001\037\006A\001K]8wS\022,'\017\005\002Q#6\tqBB\003S\037!\0051K\001\005Qe>4\030\016Z3s'\r\t&\003\026\t\003+bk\021A\026\006\003/r\na\001\032:jm\026\024\030BA-W\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\025q\022\013\"\001\\)\005y\005\"B/R\t\003r\026AD4fi\026sg/\033:p]6,g\016\036\013\003?J\004$\001Y5\021\007\005$wM\004\002%E&\0211-J\001\007!J,G-\0324\n\005\0254'!B\"mCN\034(BA2&!\tA\027\016\004\001\005\023)d\026\021!A\001\006\003Y'aA0%cE\021An\034\t\003I5L!A\\\023\003\0179{G\017[5oOB\021A\005]\005\003c\026\0221!\0218z\021\025QC\f1\001,\001")
/*    */ public final class DriverDebugCard { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverDebugCard$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverDebugCard$.MODULE$.dataTag(paramItemStack); } public static int tier(ItemStack paramItemStack) { return DriverDebugCard$.MODULE$.tier(paramItemStack); } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) { return DriverDebugCard$.MODULE$.worksWith(paramItemStack, paramClass); } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverDebugCard$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverDebugCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverDebugCard$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 21 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 23 */       return DriverDebugCard$.MODULE$.worksWith(stack) ? 
/* 24 */         DebugCard.class : 
/* 25 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverDebugCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */