/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.server.component.Geolyzer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ @ScalaSignature(bytes = "\006\001a<Q!\001\002\t\0025\ta\002\022:jm\026\024x)Z8msj,'O\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"A\004#sSZ,'oR3pYfTXM]\n\005\037IQR\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n!\tqR%D\001 \025\t\001\023%\001\003ji\026l'B\001\022$\003\031!'/\033<fe*\021AEB\001\004CBL\027B\001\024 \005%Aun\035;Bo\006\024X\rC\003)\037\021\005\021&\001\004=S:LGO\020\013\002\033!)1f\004C!Y\005Iqo\034:lg^KG\017\033\013\003[M\002\"AL\031\016\003=R\021\001M\001\006g\016\fG.Y\005\003e=\022qAQ8pY\026\fg\016C\0035U\001\007Q'A\003ti\006\0347\016\005\0027y5\tqG\003\002!q)\021\021HO\001\n[&tWm\031:bMRT\021aO\001\004]\026$\030BA\0378\005%IE/Z7Ti\006\0347\016C\003@\037\021\005\003)A\tde\026\fG/Z#om&\024xN\\7f]R$2!Q$I!\t\021U)D\001D\025\t!5%A\004oKR<xN]6\n\005\031\033%AE'b]\006<W\rZ#om&\024xN\\7f]RDQ\001\016 A\002UBQ!\023 A\002)\013A\001[8tiB\021!iS\005\003\031\016\023q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006\035>!\teT\001\005g2|G\017\006\002Q'B\0211#U\005\003%R\021aa\025;sS:<\007\"\002\033N\001\004)t!B+\020\021\0031\026\001\003)s_ZLG-\032:\021\005]CV\"A\b\007\013e{\001\022\001.\003\021A\023xN^5eKJ\0342\001\027\n\\!\taV,D\001\"\023\tq\026EA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\003)1\022\005\001\rF\001W\021\025\021\007\f\"\021d\00399W\r^#om&\024xN\\7f]R$\"\001Z<1\005\025t\007c\0014jY:\021afZ\005\003Q>\na\001\025:fI\0264\027B\0016l\005\025\031E.Y:t\025\tAw\006\005\002n]2\001A!C8b\003\003\005\tQ!\001q\005\ryF%M\t\003cR\004\"A\f:\n\005M|#a\002(pi\"Lgn\032\t\003]UL!A^\030\003\007\005s\027\020C\0035C\002\007Q\007")
/*    */ public final class DriverGeolyzer { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverGeolyzer$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) { return DriverGeolyzer$.MODULE$.isOneOf(paramItemStack, paramSeq); } public static NBTTagCompound dataTag(ItemStack paramItemStack) { return DriverGeolyzer$.MODULE$.dataTag(paramItemStack); } public static int tier(ItemStack paramItemStack) { return DriverGeolyzer$.MODULE$.tier(paramItemStack); } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverGeolyzer$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverGeolyzer$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverGeolyzer$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverGeolyzer$.MODULE$.worksWith(paramItemStack);
/*    */   } public static class Provider$ implements EnvironmentProvider { public Provider$() {
/* 22 */       MODULE$ = this;
/*    */     } public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 24 */       return DriverGeolyzer$.MODULE$.worksWith(stack) ? 
/* 25 */         Geolyzer.class : 
/* 26 */         null;
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverGeolyzer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */