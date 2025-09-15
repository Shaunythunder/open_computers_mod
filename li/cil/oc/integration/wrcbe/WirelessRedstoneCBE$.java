/*    */ package li.cil.oc.integration.wrcbe;
/*    */ import codechicken.wirelessredstone.core.RedstoneEther;
/*    */ import codechicken.wirelessredstone.core.WirelessTransmittingDevice;
/*    */ import li.cil.oc.server.component.RedstoneWireless;
/*    */ 
/*    */ public final class WirelessRedstoneCBE$ implements WirelessRedstone.WirelessRedstoneSystem {
/*    */   public static final WirelessRedstoneCBE$ MODULE$;
/*    */   
/*    */   private WirelessRedstoneCBE$() {
/* 10 */     MODULE$ = this;
/*    */   } public void addTransmitter(RedstoneWireless rs) {
/* 12 */     if (rs.wirelessOutput() && rs.wirelessFrequency() > 0) {
/* 13 */       RedstoneEther.server().addTransmittingDevice((WirelessTransmittingDevice)rs);
/*    */     }
/*    */   }
/*    */   
/*    */   public void removeTransmitter(RedstoneWireless rs) {
/* 18 */     if (rs.wirelessFrequency() > 0) {
/* 19 */       RedstoneEther.server().removeTransmittingDevice((WirelessTransmittingDevice)rs);
/*    */     }
/*    */   }
/*    */   
/*    */   public void addReceiver(RedstoneWireless rs) {
/* 24 */     RedstoneEther.server().addReceivingDevice((WirelessReceivingDevice)rs);
/* 25 */     if (rs.wirelessFrequency() > 0) {
/* 26 */       rs.wirelessInput_$eq(RedstoneEther.server().isFreqOn(rs.wirelessFrequency()));
/*    */     }
/*    */   }
/*    */   
/*    */   public void removeReceiver(RedstoneWireless rs) {
/* 31 */     RedstoneEther.server().removeReceivingDevice((WirelessReceivingDevice)rs);
/*    */   }
/*    */   
/*    */   public void updateOutput(RedstoneWireless rs) {
/* 35 */     if (rs.wirelessOutput()) {
/* 36 */       addTransmitter(rs);
/*    */     } else {
/*    */       
/* 39 */       removeTransmitter(rs);
/*    */     } 
/*    */   } public final class WirelessRedstoneCBE$$anonfun$1 extends AbstractFunction1<WirelessTransmittingDevice, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final RedstoneWireless rs$1; public WirelessRedstoneCBE$$anonfun$1(RedstoneWireless rs$1) {} public final boolean apply(WirelessTransmittingDevice f) { // Byte code:
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
/*    */       //   0	59	1	f	Lcodechicken/wirelessredstone/core/WirelessTransmittingDevice; } } public boolean getInput(RedstoneWireless rs) {
/* 43 */     return rs.wirelessInput();
/*    */   }
/*    */   public void resetRedstone(RedstoneWireless rs) {
/* 46 */     ((IterableLike)scala.collection.JavaConversions$.MODULE$.asScalaBuffer(RedstoneEther.server().getTransmittingDevicesOnFreq(rs.wirelessFrequency())).filter((Function1)new WirelessRedstoneCBE$$anonfun$1(rs)))
/*    */       
/* 48 */       .foreach(
/* 49 */         (Function1)new WirelessRedstoneCBE$$anonfun$2()); BoxedUnit ff = BoxedUnit.UNIT; } public final class WirelessRedstoneCBE$$anonfun$2 extends AbstractFunction1<WirelessTransmittingDevice, BoxedUnit> implements Serializable { public final void apply(WirelessTransmittingDevice x$1) { RedstoneEther.server().removeTransmittingDevice(x$1); }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\wrcbe\WirelessRedstoneCBE$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */