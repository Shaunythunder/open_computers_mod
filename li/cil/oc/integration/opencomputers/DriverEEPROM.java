/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ @ScalaSignature(bytes = "\006\001i<Q!\001\002\t\0025\tA\002\022:jm\026\024X)\022)S\0376S!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taAI]5wKJ,U\t\025*P\033N\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"AD\016\n\005q\021!\001B%uK6DQAH\b\005\002}\ta\001P5oSRtD#A\007\t\013\005zA\021\t\022\002\023]|'o[:XSRDGCA\022*!\t!s%D\001&\025\0051\023!B:dC2\f\027B\001\025&\005\035\021un\0347fC:DQA\013\021A\002-\nQa\035;bG.\004\"\001L\032\016\0035R!AL\030\002\t%$X-\034\006\003aE\n\021\"\\5oK\016\024\030M\032;\013\003I\n1A\\3u\023\t!TFA\005Ji\026l7\013^1dW\")ag\004C!o\005\t2M]3bi\026,eN^5s_:lWM\034;\025\007a\002\025\t\005\002:}5\t!H\003\002<y\0059a.\032;x_J\\'BA\037\007\003\r\t\007/[\005\003i\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")!&\016a\001W!)!)\016a\001\007\006!\001n\\:u!\tID)\003\002Fu\tyQI\034<je>tW.\0328u\021>\034H\017C\003H\037\021\005\003*\001\003tY>$HCA%M!\t\031\"*\003\002L)\t11\013\036:j]\036DQA\013$A\002-BQAT\b\005B=\013A\001^5feR\021\001k\025\t\003IEK!AU\023\003\007%sG\017C\003+\033\002\0071fB\003V\037!\005a+\001\005Qe>4\030\016Z3s!\t9\006,D\001\020\r\025Iv\002#\001[\005!\001&o\034<jI\026\0248c\001-\0237B\021AlX\007\002;*\021a\fP\001\007IJLg/\032:\n\005\001l&aE#om&\024xN\\7f]R\004&o\034<jI\026\024\b\"\002\020Y\t\003\021G#\001,\t\013\021DF\021I3\002\035\035,G/\0228wSJ|g.\\3oiR\021a-\037\031\003OB\0042\001[6o\035\t!\023.\003\002kK\0051\001K]3eK\032L!\001\\7\003\013\rc\027m]:\013\005),\003CA8q\031\001!\021\"]2\002\002\003\005)\021\001:\003\007}#\023'\005\002tmB\021A\005^\005\003k\026\022qAT8uQ&tw\r\005\002%o&\021\0010\n\002\004\003:L\b\"\002\026d\001\004Y\003")
/*    */ public final class DriverEEPROM { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverEEPROM$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverEEPROM$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverEEPROM$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverEEPROM$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverEEPROM$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverEEPROM$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverEEPROM$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverEEPROM$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 24 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 26 */       return DriverEEPROM$.MODULE$.worksWith(stack) ? 
/* 27 */         EEPROM.class : 
/* 28 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverEEPROM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */