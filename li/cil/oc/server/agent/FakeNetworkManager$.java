/*   */ package li.cil.oc.server.agent;
/*   */ import io.netty.util.concurrent.GenericFutureListener;
/*   */ import net.minecraft.network.Packet;
/*   */ import scala.collection.Seq;
/*   */ 
/*   */ public final class FakeNetworkManager$ extends NetworkManager {
/*   */   private FakeNetworkManager$() {
/* 8 */     super(false); MODULE$ = this;
/*   */   }
/*   */   
/*   */   public static final FakeNetworkManager$ MODULE$;
/*   */   
/*   */   public void scheduleOutboundPacket(Packet packet, Seq listener) {}
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\FakeNetworkManager$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */