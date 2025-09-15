/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ @ScalaSignature(bytes = "\006\001];Q!\001\002\t\0025\tA\002\022:jm\026\024H+\0312mKRT!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taAI]5wKJ$\026M\0317fiN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"AD\016\n\005q\021!\001B%uK6DQAH\b\005\002}\ta\001P5oSRtD#A\007\t\013\005zA\021\t\022\002\023]|'o[:XSRDGCA\022*!\t!s%D\001&\025\0051\023!B:dC2\f\027B\001\025&\005\035\021un\0347fC:DQA\013\021A\002-\nQa\035;bG.\004\"\001L\032\016\0035R!AL\030\002\t%$X-\034\006\003aE\n\021\"\\5oK\016\024\030M\032;\013\003I\n1A\\3u\023\t!TFA\005Ji\026l7\013^1dW\")ag\004C!o\005\t2M]3bi\026,eN^5s_:lWM\034;\025\007a\002\025\t\005\002:}5\t!H\003\002<y\0059a.\032;x_J\\'BA\037\007\003\r\t\007/[\005\003i\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")!&\016a\001W!)!)\016a\001\007\006!\001n\\:u!\tID)\003\002Fu\tyQI\034<je>tW.\0328u\021>\034H\017C\003H\037\021\005\003*\001\003tY>$HCA%M!\t\031\"*\003\002L)\t11\013\036:j]\036DQA\013$A\002-BQAT\b\005B=\013q\001Z1uCR\013w\r\006\002Q-B\021\021\013V\007\002%*\0211kL\001\004]\n$\030BA+S\0059q%\t\026+bO\016{W\016]8v]\022DQAK'A\002-\002")
/*    */ public final class DriverTablet { public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isDrone(paramClass); } public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isMicrocontroller(paramClass); } public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isTablet(paramClass); } public static boolean isServer(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isServer(paramClass); } public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isRotatable(paramClass); } public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isRobot(paramClass); } public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isComputer(paramClass); } public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) { return DriverTablet$.MODULE$.isAdapter(paramClass); } public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
/*    */     return DriverTablet$.MODULE$.isOneOf(paramItemStack, paramSeq);
/*    */   } public static int tier(ItemStack paramItemStack) {
/*    */     return DriverTablet$.MODULE$.tier(paramItemStack);
/*    */   } public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
/*    */     return DriverTablet$.MODULE$.worksWith(paramItemStack, paramClass);
/*    */   } public static NBTTagCompound dataTag(ItemStack paramItemStack) {
/*    */     return DriverTablet$.MODULE$.dataTag(paramItemStack);
/*    */   } public static String slot(ItemStack paramItemStack) {
/*    */     return DriverTablet$.MODULE$.slot(paramItemStack);
/*    */   } public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
/*    */     return DriverTablet$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
/*    */   } public static boolean worksWith(ItemStack paramItemStack) {
/*    */     return DriverTablet$.MODULE$.worksWith(paramItemStack);
/* 25 */   } public final class DriverTablet$$anonfun$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1;
/* 26 */       if (option instanceof Some) { Some some = (Some)option; ItemStack fs = (ItemStack)some.x(); if (DriverFileSystem$.MODULE$.worksWith(fs)) return (B1)fs;  }  return (B1)default.apply(x1); } public static final long serialVersionUID = 0L; public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack fs = (ItemStack)some.x(); if (DriverFileSystem$.MODULE$.worksWith(fs))
/* 27 */           return true;  }  return false; } } public final class DriverTablet$$anonfun$2 extends AbstractFunction1<ItemStack, ManagedEnvironment> implements Serializable { public static final long serialVersionUID = 0L; private final EnvironmentHost host$1; public final ManagedEnvironment apply(ItemStack x$1) { return DriverFileSystem$.MODULE$.createEnvironment(x$1, this.host$1); }
/*    */ 
/*    */ 
/*    */     
/*    */     public DriverTablet$$anonfun$2(EnvironmentHost host$1) {} }
/*    */ 
/*    */ 
/*    */   
/*    */   public final class DriverTablet$$anonfun$3
/*    */     extends AbstractFunction1<Option<ItemStack>, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Option x0$1) {
/*    */       boolean bool;
/* 43 */       Option option = x0$1;
/* 44 */       if (option instanceof Some) { Some some = (Some)option; ItemStack fs = (ItemStack)some.x(); bool = DriverFileSystem$.MODULE$.worksWith(fs); }
/* 45 */       else { bool = false; }
/*    */       
/*    */       return bool;
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */