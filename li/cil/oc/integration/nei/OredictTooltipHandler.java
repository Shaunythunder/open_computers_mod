/*    */ package li.cil.oc.integration.nei;
/*    */ import java.util.List;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ import scala.Predef$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0214A!\001\002\001\033\t)rJ]3eS\016$Hk\\8mi&\004\b*\0318eY\026\024(BA\002\005\003\rqW-\033\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9R$D\001\031\025\tI\"$A\004hk&Dwn\\6\013\005\rY\"\"\001\017\002\027\r|G-Z2iS\016\\WM\\\005\003=a\021\001$S\"p]R\f\027N\\3s)>|G\016^5q\021\006tG\r\\3s\021\025\001\003\001\"\001\"\003\031a\024N\\5u}Q\t!\005\005\002$\0015\t!\001C\003&\001\021\005c%A\007iC:$G.\032+p_2$\030\016\035\013\006O]25*\024\t\004Q-jS\"A\025\013\005)\022\022\001B;uS2L!\001L\025\003\t1K7\017\036\t\003]Qr!a\f\032\016\003AR\021!M\001\006g\016\fG.Y\005\003gA\na\001\025:fI\0264\027BA\0337\005\031\031FO]5oO*\0211\007\r\005\006q\021\002\r!O\001\004OVL\007C\001\036E\033\005Y$B\001\037>\003%IgN^3oi>\024\030P\003\0029})\021q\bQ\001\007G2LWM\034;\013\005\005\023\025!C7j]\026\034'/\0314u\025\005\031\025a\0018fi&\021Qi\017\002\r\017VL7i\0348uC&tWM\035\005\006\017\022\002\r\001S\001\002qB\021q&S\005\003\025B\0221!\0238u\021\025aE\0051\001I\003\005I\b\"\002(%\001\0049\023a\002;p_2$\030\016\035\005\006!\002!\t%U\001\026Q\006tG\r\\3Ji\026lG)[:qY\006Lh*Y7f)\0219#kU.\t\013az\005\031A\035\t\013Q{\005\031A+\002\013M$\030mY6\021\005YKV\"A,\013\005a\003\025\001B5uK6L!AW,\003\023%#X-\\*uC\016\\\007\"\002(P\001\0049\003\"B/\001\t\003r\026!\0055b]\022dW-\023;f[R{w\016\034;jaR1qe\0301bE\016DQ\001\017/A\002eBQ\001\026/A\002UCQa\022/A\002!CQ\001\024/A\002!CQA\024/A\002\035\002")
/*    */ public class OredictTooltipHandler implements IContainerTooltipHandler {
/*    */   public List<String> handleTooltip(GuiContainer gui, int x, int y, List<String> tooltip) {
/* 13 */     return tooltip;
/*    */   } public List<String> handleItemDisplayName(GuiContainer gui, ItemStack stack, List<String> tooltip) {
/* 15 */     return tooltip;
/*    */   }
/*    */   public List<String> handleItemTooltip(GuiContainer gui, ItemStack stack, int x, int y, List<String> tooltip) {
/* 18 */     if (NEIClientConfig.getBooleanSetting("inventory.oredict")) {
/* 19 */       Predef$.MODULE$.intArrayOps(OreDictionary.getOreIDs(stack)).foreach((Function1)new OredictTooltipHandler$$anonfun$handleItemTooltip$1(this, tooltip));
/*    */     }
/*    */ 
/*    */     
/* 23 */     return tooltip;
/*    */   }
/*    */   
/*    */   public final class OredictTooltipHandler$$anonfun$handleItemTooltip$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final List tooltip$1;
/*    */     
/*    */     public final boolean apply(int oreId) {
/*    */       return apply$mcZI$sp(oreId);
/*    */     }
/*    */     
/*    */     public OredictTooltipHandler$$anonfun$handleItemTooltip$1(OredictTooltipHandler $outer, List tooltip$1) {}
/*    */     
/*    */     public boolean apply$mcZI$sp(int oreId) {
/*    */       return this.tooltip$1.add(Predef$any2stringadd$.MODULE$.$plus$extension(Predef$.MODULE$.any2stringadd(EnumChatFormatting.DARK_GRAY), OreDictionary.getOreName(oreId)));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\OredictTooltipHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */