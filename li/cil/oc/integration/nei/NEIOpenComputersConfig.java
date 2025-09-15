/*    */ package li.cil.oc.integration.nei;
/*    */ import codechicken.nei.NEIClientConfig;
/*    */ import codechicken.nei.api.API;
/*    */ import codechicken.nei.api.INEIGuiHandler;
/*    */ import codechicken.nei.config.OptionToggleButton;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function0;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @SideOnly(Side.CLIENT)
/*    */ @ScalaSignature(bytes = "\006\00113A!\001\002\001\033\t1b*R%Pa\026t7i\\7qkR,'o]\"p]\032LwM\003\002\004\t\005\031a.Z5\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\tA\001\\1oO*\t1#\001\003kCZ\f\027BA\013\021\005\031y%M[3diB\021q#H\007\0021)\021\021DG\001\004CBL'BA\002\034\025\005a\022aC2pI\026\034\007.[2lK:L!A\b\r\003\033%\033uN\0344jOV\024XMT#J\021\025\001\003\001\"\001\"\003\031a\024N\\5u}Q\t!\005\005\002$\0015\t!\001C\003&\001\021\005c%A\004hKRt\025-\\3\025\003\035\002\"\001\013\030\017\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\002\rA\023X\rZ3g\023\ty\003G\001\004TiJLgn\032\006\003[)BQA\r\001\005B\031\n!bZ3u-\026\0248/[8o\021\025!\004\001\"\0216\003)aw.\0313D_:4\027n\032\013\002mA\021\021fN\005\003q)\022A!\0268ji\"\"\001A\017$H!\tYD)D\001=\025\tid(\001\006sK2\fWO\\2iKJT!a\020!\002\007\031lGN\003\002B\005\006!Qn\0343t\025\005\031\025aA2qo&\021Q\t\020\002\t'&$Wm\0248ms\006)a/\0317vK\022\n\001*\003\002J\025\00611\tT%F\035RS!a\023\037\002\tMKG-\032")
/*    */ public class NEIOpenComputersConfig implements IConfigureNEI {
/*    */   public String getName() {
/* 15 */     return "OpenComputers";
/*    */   } public String getVersion() {
/* 17 */     return "1.10.30-GTNH";
/*    */   }
/*    */ 
/*    */   
/*    */   public void loadConfig() {
/* 22 */     API.registerUsageHandler(new ManualUsageHandler());
/* 23 */     API.registerUsageHandler(new CallbackDocHandler());
/* 24 */     API.registerNEIGuiHandler((INEIGuiHandler)new GuiHandler());
/*    */ 
/*    */     
/* 27 */     NEIClientConfig.global.config.getTag("inventory.oredict").getBooleanValue(false);
/* 28 */     OptionToggleButton oreDictOption = new OptionToggleButton("inventory.oredict", true);
/* 29 */     GuiContainerManager.addTooltipHandler(new OredictTooltipHandler());
/* 30 */     API.addOption((Option)oreDictOption);
/*    */     
/* 32 */     NEI$.MODULE$.hiddenItems().foreach((Function1)new NEIOpenComputersConfig$$anonfun$loadConfig$1(this)); } public final class NEIOpenComputersConfig$$anonfun$loadConfig$1 extends AbstractFunction1<Function0<ItemStack>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public NEIOpenComputersConfig$$anonfun$loadConfig$1(NEIOpenComputersConfig $outer) {} public final void apply(Function0 stack) {
/* 33 */       API.hideItem((ItemStack)stack.apply());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\NEIOpenComputersConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */