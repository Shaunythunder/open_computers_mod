/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001\005\005q!B\001\003\021\003i\021!\003#sSZ,'/\021)V\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\023\021\023\030N^3s\003B+6cA\b\023+A\021abE\005\003)\t\021\021\002\022:jm\026\0248\tU+\021\005YiR\"A\f\013\005aI\022\001B5uK6T!AG\016\002\r\021\024\030N^3s\025\tab!A\002ba&L!AH\f\003\023!{7\017^!xCJ,\007\"\002\021\020\t\003\t\023A\002\037j]&$h\bF\001\016\021\025\031s\002\"\021%\003%9xN]6t/&$\b\016\006\002&WA\021a%K\007\002O)\t\001&A\003tG\006d\027-\003\002+O\t9!i\\8mK\006t\007\"\002\027#\001\004i\023!B:uC\016\\\007C\001\0305\033\005y#B\001\r1\025\t\t$'A\005nS:,7M]1gi*\t1'A\002oKRL!!N\030\003\023%#X-\\*uC\016\\\007\"B\034\020\t\003B\024!E2sK\006$X-\0228wSJ|g.\\3oiR\031\021h\020!\021\005ijT\"A\036\013\005qZ\022a\0028fi^|'o[\005\003}m\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")AF\016a\001[!)\021I\016a\001\005\006!\001n\\:u!\tQ4)\003\002Ew\tyQI\034<je>tW.\0328u\021>\034H\017C\003G\037\021\005s)A\ntkB\004xN\035;fI\016{W\016]8oK:$8\017\006\002I\027B\021a%S\005\003\025\036\0221!\0238u\021\025aS\t1\001.\021\025iu\002\"\021O\003\035\031\007/\036+jKJ$\"\001S(\t\0131b\005\031A\027\t\013E{A\021\001*\002\017\035\004X\017V5feR\021\001j\025\005\006YA\003\r!L\004\006+>A\tAV\001\t!J|g/\0333feB\021q\013W\007\002\037\031)\021l\004E\0015\nA\001K]8wS\022,'oE\002Y7\016\004\"\001X1\016\003uS!AX0\002\t1\fgn\032\006\002A\006!!.\031<b\023\t\021WL\001\004PE*,7\r\036\t\003I\026l\021!G\005\003Mf\0211#\0228wSJ|g.\\3oiB\023xN^5eKJDQ\001\t-\005\002!$\022A\026\005\006Ub#\te[\001\017O\026$XI\034<je>tW.\0328u)\taw\020\r\002nmB\031a.\035;\017\005\031z\027B\0019(\003\031\001&/\0323fM&\021!o\035\002\006\0072\f7o\035\006\003a\036\002\"!\036<\r\001\021Iq/[A\001\002\003\025\t\001\037\002\004?\022\n\024CA=}!\t1#0\003\002|O\t9aj\034;iS:<\007C\001\024~\023\tqxEA\002B]fDQ\001L5A\0025\002")
/*    */ public final class DriverAPU { public static int gpuTier(ItemStack paramItemStack) { return DriverAPU$.MODULE$.gpuTier(paramItemStack); } public static int cpuTier(ItemStack paramItemStack) { return DriverAPU$.MODULE$.cpuTier(paramItemStack); } public static int supportedComponents(ItemStack paramItemStack) { return DriverAPU$.MODULE$.supportedComponents(paramItemStack); } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverAPU$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.worksWith(paramItemStack);
/*    */   } public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isDrone(paramClass);
/*    */   } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isMicrocontroller(paramClass);
/*    */   } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isTablet(paramClass);
/*    */   } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverAPU$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAPU$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static double getCallBudget(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.getCallBudget(paramItemStack);
/*    */   } public static void setArchitecture(ItemStack paramItemStack, Class<? extends Architecture> paramClass) {
/*    */     DriverAPU$.MODULE$.setArchitecture(paramItemStack, paramClass);
/*    */   } public static Class<? extends Architecture> architecture(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.architecture(paramItemStack);
/*    */   } public static List<Class<? extends Architecture>> allArchitectures() {
/*    */     return DriverAPU$.MODULE$.allArchitectures();
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverAPU$.MODULE$.slot(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 44 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 46 */       return DriverAPU$.MODULE$.worksWith(stack) ? 
/* 47 */         GraphicsCard.class : 
/* 48 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverAPU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */