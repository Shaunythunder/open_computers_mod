/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import li.cil.oc.server.PacketSender$;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.collection.mutable.Buffer$;
/*    */ import scala.collection.mutable.Map$;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SwitchLike$class
/*    */ {
/*    */   public static void $init$(SwitchLike $this) {
/* 14 */     $this.li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$computers_$eq((Buffer)Buffer$.MODULE$.empty());
/*    */     
/* 16 */     $this.li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$openPorts_$eq(Map$.MODULE$.empty());
/*    */     
/* 18 */     $this.lastMessage_$eq(0L);
/*    */   }
/*    */   public static void onSwitchActivity(SwitchLike $this) {
/* 21 */     long now = System.currentTimeMillis();
/* 22 */     if (now - $this.lastMessage() >= (($this.relayDelay() - 1) * 50)) {
/* 23 */       $this.lastMessage_$eq(now);
/* 24 */       PacketSender$.MODULE$.sendSwitchActivity($this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\SwitchLike$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */