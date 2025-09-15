/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ @ScalaSignature(bytes = "\006\001}<Q!\001\002\t\0025\tQ\003\022:jm\026\024X\013]4sC\022,7I]1gi&twM\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\006#sSZ,'/\0269he\006$Wm\021:bMRLgnZ\n\005\037IQR\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n!\tqR%D\001 \025\t\001\023%\001\003ji\026l'B\001\022$\003\031!'/\033<fe*\021AEB\001\004CBL\027B\001\024 \005%Aun\035;Bo\006\024X\rC\003)\037\021\005\021&\001\004=S:LGO\020\013\002\033!)1f\004C!Y\005Iqo\034:lg^KG\017\033\013\003[M\002\"AL\031\016\003=R\021\001M\001\006g\016\fG.Y\005\003e=\022qAQ8pY\026\fg\016C\0035U\001\007Q'A\003ti\006\0347\016\005\0027y5\tqG\003\002!q)\021\021HO\001\n[&tWm\031:bMRT\021aO\001\004]\026$\030BA\0378\005%IE/Z7Ti\006\0347\016C\003@\037\021\005\003)A\tde\026\fG/Z#om&\024xN\\7f]R$2!Q$I!\t\021U)D\001D\025\t!5%A\004oKR<xN]6\n\005\031\033%AE'b]\006<W\rZ#om&\024xN\\7f]RDQ\001\016 A\002UBQ!\023 A\002)\013A\001[8tiB\021!iS\005\003\031\016\023q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006\035>!\teT\001\005g2|G\017\006\002Q'B\0211#U\005\003%R\021aa\025;sS:<\007\"\002\033N\001\004)\004\"B+\020\t\0032\026\001\002;jKJ$\"a\026.\021\0059B\026BA-0\005\rIe\016\036\005\006iQ\003\r!N\004\0069>A\t!X\001\t!J|g/\0333feB\021alX\007\002\037\031)\001m\004E\001C\nA\001K]8wS\022,'oE\002`%\t\004\"a\0313\016\003\005J!!Z\021\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\013!zF\021A4\025\003uCQ![0\005B)\fabZ3u\013:4\030N]8o[\026tG\017\006\002l}B\022A.\036\t\004[B\034hB\001\030o\023\tyw&\001\004Qe\026$WMZ\005\003cJ\024Qa\0217bgNT!a\\\030\021\005Q,H\002\001\003\nm\"\f\t\021!A\003\002]\0241a\030\0232#\tA8\020\005\002/s&\021!p\f\002\b\035>$\b.\0338h!\tqC0\003\002~_\t\031\021I\\=\t\013QB\007\031A\033")
/*    */ public final class DriverUpgradeCrafting { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeCrafting$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeCrafting$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeCrafting$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverUpgradeCrafting$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeCrafting$.MODULE$.isRotatable(paramClass);
/*    */   } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeCrafting$.MODULE$.isRobot(paramClass);
/*    */   } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeCrafting$.MODULE$.isComputer(paramClass);
/*    */   } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeCrafting$.MODULE$.isAdapter(paramClass);
/*    */   } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverUpgradeCrafting$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverUpgradeCrafting$.MODULE$.dataTag(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverUpgradeCrafting$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverUpgradeCrafting$.MODULE$.tier(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverUpgradeCrafting$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverUpgradeCrafting$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverUpgradeCrafting$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 29 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 31 */       return DriverUpgradeCrafting$.MODULE$.worksWith(stack) ? 
/* 32 */         UpgradeCrafting.class : 
/* 33 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeCrafting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */