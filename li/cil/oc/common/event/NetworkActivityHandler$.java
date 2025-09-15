/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.api.event.NetworkActivityEvent;
/*    */ import li.cil.oc.server.component.Server;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class NetworkActivityHandler$ {
/*    */   public static final NetworkActivityHandler$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/* 12 */   public void onNetworkActivity(NetworkActivityEvent.Server e) { TileEntity tileEntity = e.getTileEntity();
/* 13 */     if (tileEntity instanceof Rack) { TileEntity tileEntity1 = tileEntity; scala.runtime.RichInt$.MODULE$
/* 14 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), ((IInventory)tileEntity1).func_70302_i_()).foreach$mVc$sp((Function1)new NetworkActivityHandler$$anonfun$onNetworkActivity$1(e, tileEntity1)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */       
/*    */        }
/*    */     
/*    */     else
/*    */     
/*    */     { 
/*    */ 
/*    */       
/* 25 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      }
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onNetworkActivity(NetworkActivityEvent.Client e) {
/* 31 */     TileEntity tileEntity = e.getTileEntity();
/* 32 */     if (tileEntity instanceof Case) { Case case_ = (Case)tileEntity; case_.lastNetworkActivity_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 33 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; } 
/*    */   }
/*    */   public final class NetworkActivityHandler$$anonfun$onNetworkActivity$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/* 36 */     public static final long serialVersionUID = 0L; private final NetworkActivityEvent.Server e$1; private final TileEntity x2$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public NetworkActivityHandler$$anonfun$onNetworkActivity$1(NetworkActivityEvent.Server e$1, TileEntity x2$1) {} public void apply$mcVI$sp(int slot) { RackMountable rackMountable = ((Rack)this.x2$1).getMountable(slot); if (rackMountable instanceof Server) { Server server = (Server)rackMountable; boolean containsNode = (server.componentSlot(this.e$1.getNode().address()) >= 0); server.lastNetworkActivity_$eq(System.currentTimeMillis()); ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } } private NetworkActivityHandler$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\NetworkActivityHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */