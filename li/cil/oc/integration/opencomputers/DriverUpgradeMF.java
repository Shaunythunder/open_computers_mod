/*    */ package li.cil.oc.integration.opencomputers;@ScalaSignature(bytes = "\006\001\005Mq!B\001\003\021\003i\021a\004#sSZ,'/\0269he\006$W-\024$\013\005\r!\021!D8qK:\034w.\0349vi\026\0248O\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\020\tJLg/\032:Va\036\024\030\rZ3N\rN!qB\005\016\036!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007C\001\020&\033\005y\"B\001\021\"\003\021IG/Z7\013\005\t\032\023A\0023sSZ,'O\003\002%\r\005\031\021\r]5\n\005\031z\"!\003%pgR\fu/\031:f\021\025As\002\"\001*\003\031a\024N\\5u}Q\tQ\002C\003,\037\021\005C&A\005x_J\\7oV5uQR\021Qf\r\t\003]Ej\021a\f\006\002a\005)1oY1mC&\021!g\f\002\b\005>|G.Z1o\021\025!$\0061\0016\003\025\031H/Y2l!\t1D(D\0018\025\t\001\003H\003\002:u\005IQ.\0338fGJ\fg\r\036\006\002w\005\031a.\032;\n\005u:$!C%uK6\034F/Y2l\021\025Ys\002\"\021@)\ri\003)\021\005\006iy\002\r!\016\005\006\005z\002\raQ\001\005Q>\034H\017\r\002E\033B\031Q\tS&\017\00592\025BA$0\003\031\001&/\0323fM&\021\021J\023\002\006\0072\f7o\035\006\003\017>\002\"\001T'\r\001\021Ia*QA\001\002\003\025\ta\024\002\004?\022\n\024C\001)T!\tq\023+\003\002S_\t9aj\034;iS:<\007C\001+X\033\005)&B\001,$\003\035qW\r^<pe.L!\001W+\003\037\025sg/\033:p]6,g\016\036%pgRDQAW\b\005Bm\013Aa\0357piR\021Al\030\t\003\013vK!A\030&\003\rM#(/\0338h\021\025!\024\f1\0016\021\025\tw\002\"\021c\003\021!\030.\032:\025\005\r4\007C\001\030e\023\t)wFA\002J]RDQ\001\0161A\002UBQ\001[\b\005B%\f\021c\031:fCR,WI\034<je>tW.\0328u)\rQWN\034\t\003).L!\001\\+\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006i\035\004\r!\016\005\006\005\036\004\raU\004\006a>A\t!]\001\t!J|g/\0333feB\021!o]\007\002\037\031)Ao\004E\001k\nA\001K]8wS\022,'oE\002t%Y\004\"a\036=\016\003\005J!!_\021\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\013!\032H\021A>\025\003EDQ!`:\005By\fabZ3u\013:4\030N]8o[\026tG\017F\002\000\003#\001D!!\001\002\006A!Q\tSA\002!\ra\025Q\001\003\f\003\017a\030\021!A\001\006\003\tIAA\002`II\n2\001UA\006!\rq\023QB\005\004\003\037y#aA!os\")A\007 a\001k\001")
/*    */ public final class DriverUpgradeMF { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isDrone(paramClass);
/*    */   } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isMicrocontroller(paramClass);
/*    */   } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isTablet(paramClass);
/*    */   } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isServer(paramClass);
/*    */   } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isRotatable(paramClass);
/*    */   }
/*    */   public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isRobot(paramClass);
/*    */   }
/*    */   public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isComputer(paramClass);
/*    */   }
/*    */   public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.isAdapter(paramClass);
/*    */   }
/*    */   public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeMF$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   }
/*    */   public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeMF$.MODULE$.dataTag(paramItemStack);
/*    */   }
/*    */   public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeMF$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   }
/*    */   public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeMF$.MODULE$.tier(paramItemStack);
/*    */   }
/*    */   public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeMF$.MODULE$.slot(paramItemStack);
/*    */   }
/*    */   public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeMF$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   }
/*    */   public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeMF$.MODULE$.worksWith(paramItemStack);
/*    */   }
/*    */   public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 44 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 46 */       return DriverUpgradeMF$.MODULE$.worksWith(stack) ? 
/* 47 */         UpgradeMF.class : 
/* 48 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeMF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */