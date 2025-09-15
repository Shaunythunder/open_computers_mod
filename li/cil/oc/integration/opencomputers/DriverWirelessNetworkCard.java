/*    */ package li.cil.oc.integration.opencomputers;@ScalaSignature(bytes = "\006\001i<Q!\001\002\t\0025\t\021\004\022:jm\026\024x+\033:fY\026\0348OT3uo>\0248nQ1sI*\0211\001B\001\016_B,gnY8naV$XM]:\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005e!%/\033<fe^K'/\0327fgNtU\r^<pe.\034\025M\0353\024\007=\021\"\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n\021\025qr\002\"\001 \003\031a\024N\\5u}Q\tQ\002C\003\"\037\021\005#%A\005x_J\\7oV5uQR\0211%\013\t\003I\035j\021!\n\006\002M\005)1oY1mC&\021\001&\n\002\b\005>|G.Z1o\021\025Q\003\0051\001,\003\025\031H/Y2l!\ta3'D\001.\025\tqs&\001\003ji\026l'B\001\0312\003%i\027N\\3de\0064GOC\0013\003\rqW\r^\005\003i5\022\021\"\023;f[N#\030mY6\t\013YzA\021I\034\002#\r\024X-\031;f\013:4\030N]8o[\026tG\017F\0029\001\006\003\"!\017 \016\003iR!a\017\037\002\0179,Go^8sW*\021QHB\001\004CBL\027BA ;\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013)*\004\031A\026\t\013\t+\004\031A\"\002\t!|7\017\036\t\003s\021K!!\022\036\003\037\025sg/\033:p]6,g\016\036%pgRDQaR\b\005B!\013Aa\0357piR\021\021\n\024\t\003')K!a\023\013\003\rM#(/\0338h\021\025Qc\t1\001,\021\025qu\002\"\021P\003\021!\030.\032:\025\005A\033\006C\001\023R\023\t\021VEA\002J]RDQAK'A\002-:Q!V\b\t\002Y\013\001\002\025:pm&$WM\035\t\003/bk\021a\004\004\0063>A\tA\027\002\t!J|g/\0333feN\031\001LE.\021\005q{V\"A/\013\005yc\024A\0023sSZ,'/\003\002a;\n\031RI\034<je>tW.\0328u!J|g/\0333fe\")a\004\027C\001ER\ta\013C\003e1\022\005S-\001\bhKR,eN^5s_:lWM\034;\025\005\031L\bGA4q!\rA7N\034\b\003I%L!A[\023\002\rA\023X\rZ3g\023\taWNA\003DY\006\0348O\003\002kKA\021q\016\035\007\001\t%\t8-!A\001\002\013\005!OA\002`IE\n\"a\035<\021\005\021\"\030BA;&\005\035qu\016\0365j]\036\004\"\001J<\n\005a,#aA!os\")!f\031a\001W\001")
/*    */ public final class DriverWirelessNetworkCard { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isDrone(paramClass);
/*    */   } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isMicrocontroller(paramClass);
/*    */   } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isTablet(paramClass);
/*    */   } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   }
/*    */   public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverWirelessNetworkCard$.MODULE$.worksWith(paramItemStack);
/*    */   }
/*    */   public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 35 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 37 */       int i = DriverWirelessNetworkCard$.MODULE$.tier(stack); switch (i) { default: case 1: case 0: break; }  return DriverWirelessNetworkCard$.MODULE$.worksWith(stack) ? 
/* 38 */         WirelessNetworkCard.Tier1.class : 
/*    */ 
/*    */ 
/*    */         
/* 42 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverWirelessNetworkCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */