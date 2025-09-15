/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import java.text.DecimalFormat;
/*    */ import li.cil.oc.Localization$Switch$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u3A!\001\002\001\033\t11k^5uG\"T!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002E\002\020!Ii\021AA\005\003#\t\0211\003R=oC6L7mR;j\007>tG/Y5oKJ\004\"a\005\r\016\003QQ!!\006\f\002\023\r|g\016^1j]\026\024(BA\f\007\003\031\031w.\\7p]&\021\021\001\006\005\t5\001\021\t\021)A\0057\005y\001\017\\1zKJLeN^3oi>\024\030\020\005\002\035K5\tQD\003\002\037?\0051\001\017\\1zKJT!\001I\021\002\r\025tG/\033;z\025\t\0213%A\005nS:,7M]1gi*\tA%A\002oKRL!AJ\017\003\037%sg/\0328u_JL\b\013\\1zKJD\001\002\013\001\003\006\004%\t!K\001\007g^LGo\0315\026\003)\002\"a\013\030\016\0031R!!\f\f\002\025QLG.Z3oi&$\0300\003\002\002Y!A\001\007\001B\001B\003%!&A\004to&$8\r\033\021\t\013I\002A\021A\032\002\rqJg.\033;?)\r!TG\016\t\003\037\001AQAG\031A\002mAQ\001K\031A\002)Bq\001\017\001C\002\023%\021(\001\004g_Jl\027\r^\013\002uA\0211\bQ\007\002y)\021QHP\001\005i\026DHOC\001@\003\021Q\027M^1\n\005\005c$!\004#fG&l\027\r\034$pe6\fG\017\003\004D\001\001\006IAO\001\bM>\024X.\031;!\021\025)\005\001\"\021G\003q!'/Y<TK\016|g\016Z1ss\032{'/Z4s_VtG\rT1zKJ$2aR'S!\tA5*D\001J\025\005Q\025!B:dC2\f\027B\001'J\005\021)f.\033;\t\0139#\005\031A(\002\r5|Wo]3Y!\tA\005+\003\002R\023\n\031\021J\034;\t\013M#\005\031A(\002\r5|Wo]3Z\021\025)\006\001\"\003W\003M!\bN]3tQ>dGMQ1tK\022\034u\016\\8s)\021yu+W.\t\013a#\006\031A(\002\013Y\fG.^3\t\013i#\006\031A(\002\re,G\016\\8x\021\025aF\0131\001P\003\r\021X\r\032")
/*    */ public class Switch extends DynamicGuiContainer<Switch> {
/*    */   private final li.cil.oc.common.tileentity.Switch switch;
/*    */   
/* 11 */   public li.cil.oc.common.tileentity.Switch switch() { return this.switch; } private final DecimalFormat format; public Switch(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Switch switch) { super(new Switch(playerInventory, switch));
/* 12 */     this.format = new DecimalFormat("#.##hz"); } private DecimalFormat format() { return this.format; }
/*    */   
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 15 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 16 */     this.field_146289_q.func_78276_b(
/* 17 */         Localization$.MODULE$.localizeImmediately(switch().func_145825_b()), 
/* 18 */         8, 6, 4210752);
/*    */     
/* 20 */     this.field_146289_q.func_78276_b(
/* 21 */         Localization$Switch$.MODULE$.TransferRate(), 
/* 22 */         14, 20, 4210752);
/* 23 */     this.field_146289_q.func_78276_b(
/* 24 */         Localization$Switch$.MODULE$.PacketsPerCycle(), 
/* 25 */         14, 39, 4210752);
/* 26 */     this.field_146289_q.func_78276_b(
/* 27 */         Localization$Switch$.MODULE$.QueueSize(), 
/* 28 */         14, 58, 4210752);
/*    */     
/* 30 */     this.field_146289_q.func_78276_b(
/* 31 */         format().format((20.0F / inventoryContainer().relayDelay())), 
/* 32 */         108, 20, 4210752);
/* 33 */     this.field_146289_q.func_78276_b((
/* 34 */         new StringBuilder()).append(inventoryContainer().packetsPerCycleAvg()).append(" / ").append(BoxesRunTime.boxToInteger(inventoryContainer().relayAmount())).toString(), 
/* 35 */         108, 39, thresholdBasedColor(inventoryContainer().packetsPerCycleAvg(), (int)package$.MODULE$.ceil((inventoryContainer().relayAmount() / 2.0F)), inventoryContainer().relayAmount()));
/* 36 */     this.field_146289_q.func_78276_b((
/* 37 */         new StringBuilder()).append(inventoryContainer().queueSize()).append(" / ").append(BoxesRunTime.boxToInteger(inventoryContainer().maxQueueSize())).toString(), 
/* 38 */         108, 58, thresholdBasedColor(inventoryContainer().queueSize(), inventoryContainer().maxQueueSize() / 2, inventoryContainer().maxQueueSize()));
/*    */   }
/*    */   
/*    */   private int thresholdBasedColor(int value, int yellow, int red) {
/* 42 */     return (value < yellow) ? 39168 : (
/* 43 */       (value < red) ? 10066176 : 
/* 44 */       10027008);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */