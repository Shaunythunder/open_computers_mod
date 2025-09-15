/*    */ package li.cil.oc.common.event;
/*    */ @ScalaSignature(bytes = "\006\001\r;Q!\001\002\t\0025\taCT3uo>\0248.Q2uSZLG/\037%b]\022dWM\035\006\003\007\021\tQ!\032<f]RT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\027\035\026$xo\034:l\003\016$\030N^5us\"\013g\016\0327feN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\"\002\017\020\t\003i\022!E8o\035\026$xo\034:l\003\016$\030N^5usR\021a$\t\t\003'}I!\001\t\013\003\tUs\027\016\036\005\006Em\001\raI\001\002KB\021Ae\013\b\003K%j\021A\n\006\003\007\035R!\001\013\004\002\007\005\004\030.\003\002+M\005!b*\032;x_J\\\027i\031;jm&$\0300\022<f]RL!\001L\027\003\rM+'O^3s\025\tQc\005\013\002\034_A\021\001GO\007\002c)\021!gM\001\rKZ,g\016\0365b]\022dWM\035\006\003\013QR!!\016\034\002\007\031lGN\003\0028q\005!Qn\0343t\025\005I\024aA2qo&\0211(\r\002\017'V\0247o\031:jE\026,e/\0328u\021\025ar\002\"\001>)\tqb\bC\003#y\001\007q\b\005\002%\001&\021\021)\f\002\007\0072LWM\034;)\005qz\003")
/*    */ public final class NetworkActivityHandler { @SubscribeEvent
/*    */   public static void onNetworkActivity(NetworkActivityEvent.Client paramClient) {
/*    */     NetworkActivityHandler$.MODULE$.onNetworkActivity(paramClient);
/*    */   }
/*    */   @SubscribeEvent
/*    */   public static void onNetworkActivity(NetworkActivityEvent.Server paramServer) {
/*    */     NetworkActivityHandler$.MODULE$.onNetworkActivity(paramServer);
/*    */   }
/*    */   
/*    */   public final class NetworkActivityHandler$$anonfun$onNetworkActivity$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 14 */     public final void apply(int slot) { apply$mcVI$sp(slot); } private final NetworkActivityEvent.Server e$1; private final TileEntity x2$1; public NetworkActivityHandler$$anonfun$onNetworkActivity$1(NetworkActivityEvent.Server e$1, TileEntity x2$1) {} public void apply$mcVI$sp(int slot) {
/* 15 */       RackMountable rackMountable = ((Rack)this.x2$1).getMountable(slot);
/* 16 */       if (rackMountable instanceof Server) { Server server = (Server)rackMountable;
/* 17 */         boolean containsNode = (server.componentSlot(this.e$1.getNode().address()) >= 0);
/*    */         
/* 19 */         server.lastNetworkActivity_$eq(System.currentTimeMillis());
/* 20 */         ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */       else
/* 22 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\NetworkActivityHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */