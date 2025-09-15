/*    */ package li.cil.oc.integration.stargatetech2;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001\005-q!B\001\003\021\003i\021!\006#sSZ,'/\0212tiJ\f7\r\036\"vg\016\013'\017\032\006\003\007\021\tQb\035;be\036\fG/\032;fG\"\024$BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\013Ee&4XM]!cgR\024\030m\031;CkN\034\025M\0353\024\t=\021\"\004\t\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\0211DH\007\0029)\021Q\004B\001\016_B,gnY8naV$XM]:\n\005}a\"\001B%uK6\004\"!\t\025\016\003\tR!a\t\023\002\t%$X-\034\006\003K\031\na\001\032:jm\026\024(BA\024\007\003\r\t\007/[\005\003S\t\022\021\002S8ti\006;\030M]3\t\013-zA\021\001\027\002\rqJg.\033;?)\005i\001\"\002\030\020\t\003z\023!C<pe.\034x+\033;i)\t\001d\007\005\0022i5\t!GC\0014\003\025\0318-\0317b\023\t)$GA\004C_>dW-\0318\t\013]j\003\031\001\035\002\013M$\030mY6\021\005ezT\"\001\036\013\005\rZ$B\001\037>\003%i\027N\\3de\0064GOC\001?\003\rqW\r^\005\003\001j\022\021\"\023;f[N#\030mY6\t\0139zA\021\t\"\025\007A\032E\tC\0038\003\002\007\001\bC\003F\003\002\007a)\001\003i_N$\bGA$Q!\rA5J\024\b\003c%K!A\023\032\002\rA\023X\rZ3g\023\taUJA\003DY\006\0348O\003\002KeA\021q\n\025\007\001\t%\tF)!A\001\002\013\005!KA\002`IE\n\"a\025,\021\005E\"\026BA+3\005\035qu\016\0365j]\036\004\"a\026.\016\003aS!!\027\024\002\0179,Go^8sW&\0211\f\027\002\020\013:4\030N]8o[\026tG\017S8ti\")Ql\004C!=\006\t2M]3bi\026,eN^5s_:lWM\034;\025\007}\0237\r\005\002XA&\021\021\r\027\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\00389\002\007\001\bC\003F9\002\007a\013C\003f\037\021\005c-\001\003tY>$HCA4k!\t\031\002.\003\002j)\t11\013\036:j]\036DQa\0163A\002a:Q\001\\\b\t\0025\f\001\002\025:pm&$WM\035\t\003]>l\021a\004\004\006a>A\t!\035\002\t!J|g/\0333feN\031qN\005:\021\005M$X\"\001\023\n\005U$#aE#om&\024xN\\7f]R\004&o\034<jI\026\024\b\"B\026p\t\0039H#A7\t\013e|G\021\t>\002\035\035,G/\0228wSJ|g.\\3oiR\03110!\0031\005qt\bc\001%L{B\021qJ \003\013b\f\t\021!A\003\002\005\005!aA0%eE\0311+a\001\021\007E\n)!C\002\002\bI\0221!\0218z\021\0259\004\0201\0019\001")
/*    */ public final class DriverAbstractBusCard { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverAbstractBusCard$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverAbstractBusCard$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverAbstractBusCard$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverAbstractBusCard$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAbstractBusCard$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAbstractBusCard$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAbstractBusCard$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAbstractBusCard$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverAbstractBusCard$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverAbstractBusCard$.MODULE$.dataTag(paramItemStack);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverAbstractBusCard$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverAbstractBusCard$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverAbstractBusCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverAbstractBusCard$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverAbstractBusCard$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 29 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 31 */       return DriverAbstractBusCard$.MODULE$.worksWith(stack) ? 
/* 32 */         AbstractBusCard.class : 
/* 33 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\stargatetech2\DriverAbstractBusCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */