/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.LinkedCard;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ @ScalaSignature(bytes = "\006\001i<Q!\001\002\t\0025\t\001\003\022:jm\026\024H*\0338lK\022\034\025M\0353\013\005\r!\021!D8qK:\034w.\0349vi\026\0248O\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\021\tJLg/\032:MS:\\W\rZ\"be\022\0342a\004\n\033!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007\"\002\020\020\t\003y\022A\002\037j]&$h\bF\001\016\021\025\ts\002\"\021#\003%9xN]6t/&$\b\016\006\002$SA\021AeJ\007\002K)\ta%A\003tG\006d\027-\003\002)K\t9!i\\8mK\006t\007\"\002\026!\001\004Y\023!B:uC\016\\\007C\001\0274\033\005i#B\001\0300\003\021IG/Z7\013\005A\n\024!C7j]\026\034'/\0314u\025\005\021\024a\0018fi&\021A'\f\002\n\023R,Wn\025;bG.DQAN\b\005B]\n\021c\031:fCR,WI\034<je>tW.\0328u)\rA\004)\021\t\003syj\021A\017\006\003wq\nqA\\3uo>\0248N\003\002>\r\005\031\021\r]5\n\005}R$AE'b]\006<W\rZ#om&\024xN\\7f]RDQAK\033A\002-BQAQ\033A\002\r\013A\001[8tiB\021\021\bR\005\003\013j\022q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006\017>!\t\005S\001\005g2|G\017\006\002J\031B\0211CS\005\003\027R\021aa\025;sS:<\007\"\002\026G\001\004Y\003\"\002(\020\t\003z\025\001\002;jKJ$\"\001U*\021\005\021\n\026B\001*&\005\rIe\016\036\005\006U5\003\raK\004\006+>A\tAV\001\t!J|g/\0333feB\021q\013W\007\002\037\031)\021l\004E\0015\nA\001K]8wS\022,'oE\002Y%m\003\"\001X0\016\003uS!A\030\037\002\r\021\024\030N^3s\023\t\001WLA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\003\0371\022\005!\rF\001W\021\025!\007\f\"\021f\00399W\r^#om&\024xN\\7f]R$\"AZ=1\005\035\004\bc\0015l]:\021A%[\005\003U\026\na\001\025:fI\0264\027B\0017n\005\025\031E.Y:t\025\tQW\005\005\002pa2\001A!C9d\003\003\005\tQ!\001s\005\ryF%M\t\003gZ\004\"\001\n;\n\005U,#a\002(pi\"Lgn\032\t\003I]L!\001_\023\003\007\005s\027\020C\003+G\002\0071\006")
/*    */ public final class DriverLinkedCard { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverLinkedCard$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverLinkedCard$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverLinkedCard$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverLinkedCard$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverLinkedCard$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverLinkedCard$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverLinkedCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverLinkedCard$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 24 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 26 */       return DriverLinkedCard$.MODULE$.worksWith(stack) ? 
/* 27 */         LinkedCard.class : 
/* 28 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverLinkedCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */