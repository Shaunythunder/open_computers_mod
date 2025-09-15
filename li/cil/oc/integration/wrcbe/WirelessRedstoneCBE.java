/*    */ package li.cil.oc.integration.wrcbe;
/*    */ import codechicken.wirelessredstone.core.WirelessTransmittingDevice;
/*    */ import li.cil.oc.server.component.RedstoneWireless;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q;Q!\001\002\t\0025\t1cV5sK2,7o\035*fIN$xN\\3D\005\026S!a\001\003\002\013]\0248MY3\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005M9\026N]3mKN\034(+\0323ti>tWm\021\"F'\ry!\003\007\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\021\005eYcB\001\016)\035\tYbE\004\002\035K9\021Q\004\n\b\003=\rr!a\b\022\016\003\001R!!\t\007\002\rq\022xn\034;?\023\005Y\021BA\005\013\023\t9\001\"\003\002\006\r%\021q\005B\001\005kRLG.\003\002*U\005\001r+\033:fY\026\0348OU3egR|g.\032\006\003O\021I!\001L\027\003-]K'/\0327fgN\024V\rZ:u_:,7+_:uK6T!!\013\026\t\013=zA\021\001\031\002\rqJg.\033;?)\005i\001\"\002\032\020\t\003\031\024AD1eIR\023\030M\\:nSR$XM\035\013\003i]\002\"aE\033\n\005Y\"\"\001B+oSRDQ\001O\031A\002e\n!A]:\021\005izT\"A\036\013\005qj\024!C2p[B|g.\0328u\025\tqd!\001\004tKJ4XM]\005\003\001n\022\001CU3egR|g.Z,je\026dWm]:\t\013\t{A\021A\"\002#I,Wn\034<f)J\fgn]7jiR,'\017\006\0025\t\")\001(\021a\001s!)ai\004C\001\017\006Y\021\r\0323SK\016,\027N^3s)\t!\004\nC\0039\013\002\007\021\bC\003K\037\021\0051*\001\bsK6|g/\032*fG\026Lg/\032:\025\005Qb\005\"\002\035J\001\004I\004\"\002(\020\t\003y\025\001D;qI\006$XmT;uaV$HC\001\033Q\021\025AT\n1\001:\021\025\021v\002\"\001T\003!9W\r^%oaV$HC\001+X!\t\031R+\003\002W)\t9!i\\8mK\006t\007\"\002\035R\001\004I\004\"B-\020\t\003Q\026!\004:fg\026$(+\0323ti>tW\r\006\00257\")\001\b\027a\001s\001")
/*    */ public final class WirelessRedstoneCBE {
/*    */   public static void resetRedstone(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.resetRedstone(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static boolean getInput(RedstoneWireless paramRedstoneWireless) {
/*    */     return WirelessRedstoneCBE$.MODULE$.getInput(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static void updateOutput(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.updateOutput(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static void removeReceiver(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.removeReceiver(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static void addReceiver(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.addReceiver(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static void removeTransmitter(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.removeTransmitter(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public static void addTransmitter(RedstoneWireless paramRedstoneWireless) {
/*    */     WirelessRedstoneCBE$.MODULE$.addTransmitter(paramRedstoneWireless);
/*    */   }
/*    */   
/*    */   public final class WirelessRedstoneCBE$$anonfun$1 extends AbstractFunction1<WirelessTransmittingDevice, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final RedstoneWireless rs$1;
/*    */     
/*    */     public WirelessRedstoneCBE$$anonfun$1(RedstoneWireless rs$1) {}
/*    */     
/*    */     public final boolean apply(WirelessTransmittingDevice f) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: invokeinterface getPosition : ()Lcodechicken/lib/vec/Vector3;
/*    */       //   6: aload_0
/*    */       //   7: getfield rs$1 : Lli/cil/oc/server/component/RedstoneWireless;
/*    */       //   10: invokeinterface getPosition : ()Lcodechicken/lib/vec/Vector3;
/*    */       //   15: astore_2
/*    */       //   16: dup
/*    */       //   17: ifnonnull -> 28
/*    */       //   20: pop
/*    */       //   21: aload_2
/*    */       //   22: ifnull -> 35
/*    */       //   25: goto -> 57
/*    */       //   28: aload_2
/*    */       //   29: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   32: ifeq -> 57
/*    */       //   35: aload_1
/*    */       //   36: invokeinterface getDimension : ()I
/*    */       //   41: aload_0
/*    */       //   42: getfield rs$1 : Lli/cil/oc/server/component/RedstoneWireless;
/*    */       //   45: invokeinterface getDimension : ()I
/*    */       //   50: if_icmpne -> 57
/*    */       //   53: iconst_1
/*    */       //   54: goto -> 58
/*    */       //   57: iconst_0
/*    */       //   58: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #47	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	59	0	this	Lli/cil/oc/integration/wrcbe/WirelessRedstoneCBE$$anonfun$1;
/*    */       //   0	59	1	f	Lcodechicken/wirelessredstone/core/WirelessTransmittingDevice;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class WirelessRedstoneCBE$$anonfun$2 extends AbstractFunction1<WirelessTransmittingDevice, BoxedUnit> implements Serializable {
/*    */     public final void apply(WirelessTransmittingDevice x$1) {
/* 49 */       RedstoneEther.server().removeTransmittingDevice(x$1);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\wrcbe\WirelessRedstoneCBE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */