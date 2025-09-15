/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import net.minecraft.tileentity.TileEntitySign;
/*    */ 
/*    */ 
/*    */ public abstract class SignChangeEvent
/*    */   extends Event
/*    */ {
/*    */   public final TileEntitySign sign;
/*    */   public final String[] lines;
/*    */   
/*    */   private SignChangeEvent(TileEntitySign sign, String[] lines) {
/* 15 */     this.sign = sign;
/* 16 */     this.lines = lines;
/*    */   }
/*    */   
/*    */   @Cancelable
/*    */   public static class Pre extends SignChangeEvent {
/*    */     public Pre(TileEntitySign sign, String[] lines) {
/* 22 */       super(sign, lines);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Post extends SignChangeEvent {
/*    */     public Post(TileEntitySign sign, String[] lines) {
/* 28 */       super(sign, lines);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\SignChangeEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */