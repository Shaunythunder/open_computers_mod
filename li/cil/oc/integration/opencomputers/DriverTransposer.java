/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.Transposer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ @ScalaSignature(bytes = "\006\001a<Q!\001\002\t\0025\t\001\003\022:jm\026\024HK]1ogB|7/\032:\013\005\r!\021!D8qK:\034w.\0349vi\026\0248O\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\021\tJLg/\032:Ue\006t7\017]8tKJ\034Ba\004\n\033;A\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\0177%\021AD\001\002\005\023R,W\016\005\002\037K5\tqD\003\002!C\005!\021\016^3n\025\t\0213%\001\004ee&4XM\035\006\003I\031\t1!\0319j\023\t1sDA\005I_N$\030i^1sK\")\001f\004C\001S\0051A(\0338jiz\"\022!\004\005\006W=!\t\005L\001\no>\0248n],ji\"$\"!L\032\021\0059\nT\"A\030\013\003A\nQa]2bY\006L!AM\030\003\017\t{w\016\\3b]\")AG\013a\001k\005)1\017^1dWB\021a\007P\007\002o)\021\001\005\017\006\003si\n\021\"\\5oK\016\024\030M\032;\013\003m\n1A\\3u\023\titGA\005Ji\026l7\013^1dW\")qh\004C!\001\006\t2M]3bi\026,eN^5s_:lWM\034;\025\007\005;\005\n\005\002C\0136\t1I\003\002EG\0059a.\032;x_J\\\027B\001$D\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013Qr\004\031A\033\t\013%s\004\031\001&\002\t!|7\017\036\t\003\005.K!\001T\"\003\037\025sg/\033:p]6,g\016\036%pgRDQAT\b\005B=\013Aa\0357piR\021\001k\025\t\003'EK!A\025\013\003\rM#(/\0338h\021\025!T\n1\0016\017\025)v\002#\001W\003!\001&o\034<jI\026\024\bCA,Y\033\005ya!B-\020\021\003Q&\001\003)s_ZLG-\032:\024\007a\0232\f\005\002];6\t\021%\003\002_C\t\031RI\034<je>tW.\0328u!J|g/\0333fe\")\001\006\027C\001AR\ta\013C\003c1\022\0053-\001\bhKR,eN^5s_:lWM\034;\025\005\021<\bGA3o!\r1\027\016\034\b\003]\035L!\001[\030\002\rA\023X\rZ3g\023\tQ7NA\003DY\006\0348O\003\002i_A\021QN\034\007\001\t%y\027-!A\001\002\013\005\001OA\002`IE\n\"!\035;\021\0059\022\030BA:0\005\035qu\016\0365j]\036\004\"AL;\n\005Y|#aA!os\")A'\031a\001k\001")
/*    */ public final class DriverTransposer { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverTransposer$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverTransposer$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverTransposer$.MODULE$.dataTag(paramItemStack); } public static int tier(ItemStack paramItemStack) { return DriverTransposer$.MODULE$.tier(paramItemStack); } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverTransposer$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverTransposer$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverTransposer$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverTransposer$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 22 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 24 */       return DriverTransposer$.MODULE$.worksWith(stack) ? 
/* 25 */         Transposer.Upgrade.class : 
/* 26 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTransposer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */