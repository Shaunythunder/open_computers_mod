/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ @ScalaSignature(bytes = "\006\001a<Q!\001\002\t\0025\tA\002\022:jm\026\0248k\031:fK:T!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taAI]5wKJ\0346M]3f]N!qB\005\016\036!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007C\001\020&\033\005y\"B\001\021\"\003\021IG/Z7\013\005\t\032\023A\0023sSZ,'O\003\002%\r\005\031\021\r]5\n\005\031z\"!\003%pgR\fu/\031:f\021\025As\002\"\001*\003\031a\024N\\5u}Q\tQ\002C\003,\037\021\005C&A\005x_J\\7oV5uQR\021Qf\r\t\003]Ej\021a\f\006\002a\005)1oY1mC&\021!g\f\002\b\005>|G.Z1o\021\025!$\0061\0016\003\025\031H/Y2l!\t1D(D\0018\025\t\001\003H\003\002:u\005IQ.\0338fGJ\fg\r\036\006\002w\005\031a.\032;\n\005u:$!C%uK6\034F/Y2l\021\025yt\002\"\021A\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\004\003\036C\005C\001\"F\033\005\031%B\001#$\003\035qW\r^<pe.L!AR\"\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006iy\002\r!\016\005\006\023z\002\rAS\001\005Q>\034H\017\005\002C\027&\021Aj\021\002\020\013:4\030N]8o[\026tG\017S8ti\")aj\004C!\037\006!1\017\\8u)\t\0016\013\005\002\024#&\021!\013\006\002\007'R\024\030N\\4\t\013Qj\005\031A\033\b\013U{\001\022\001,\002\021A\023xN^5eKJ\004\"a\026-\016\003=1Q!W\b\t\002i\023\001\002\025:pm&$WM]\n\0041JY\006C\001/^\033\005\t\023B\0010\"\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\025A\003\f\"\001a)\0051\006\"\0022Y\t\003\032\027AD4fi\026sg/\033:p]6,g\016\036\013\003I^\004$!\0328\021\007\031LGN\004\002/O&\021\001nL\001\007!J,G-\0324\n\005)\\'!B\"mCN\034(B\00150!\tig\016\004\001\005\023=\f\027\021!A\001\006\003\001(aA0%cE\021\021\017\036\t\003]IL!a]\030\003\0179{G\017[5oOB\021a&^\005\003m>\0221!\0218z\021\025!\024\r1\0016\001")
/*    */ public final class DriverScreen { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverScreen$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverScreen$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverScreen$.MODULE$.dataTag(paramItemStack);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverScreen$.MODULE$.tier(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverScreen$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverScreen$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverScreen$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverScreen$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 24 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 26 */       return DriverScreen$.MODULE$.worksWith(stack) ? 
/* 27 */         Screen.class : 
/* 28 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */