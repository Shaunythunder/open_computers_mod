/*    */ package li.cil.oc.integration.util;
/*    */ 
/*    */ public final class WirelessRedstone$ {
/*    */   public static final WirelessRedstone$ MODULE$;
/*    */   private final Set<WirelessRedstone.WirelessRedstoneSystem> systems;
/*    */   
/*    */   public Set<WirelessRedstone.WirelessRedstoneSystem> systems() {
/*  8 */     return this.systems;
/*    */   } public boolean isAvailable() {
/* 10 */     return systems().nonEmpty();
/*    */   }
/*    */   
/* 13 */   public void addReceiver(RedstoneWireless rs) { systems().foreach((Function1)new WirelessRedstone$$anonfun$addReceiver$1(rs)); } public final class WirelessRedstone$$anonfun$addReceiver$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) { try { system.addReceiver(this.rs$2); }
/*    */       finally {} }
/*    */     
/*    */     private final RedstoneWireless rs$2;
/*    */     public WirelessRedstone$$anonfun$addReceiver$1(RedstoneWireless rs$2) {} }
/*    */   public void removeReceiver(RedstoneWireless rs) {
/* 19 */     systems().foreach((Function1)new WirelessRedstone$$anonfun$removeReceiver$1(rs)); } public final class WirelessRedstone$$anonfun$removeReceiver$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$4; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) { try { system.removeReceiver(this.rs$4); }
/*    */       finally {} }
/*    */ 
/*    */     
/*    */     public WirelessRedstone$$anonfun$removeReceiver$1(RedstoneWireless rs$4) {} }
/*    */   
/* 25 */   public void updateOutput(RedstoneWireless rs) { systems().foreach((Function1)new WirelessRedstone$$anonfun$updateOutput$1(rs)); } public final class WirelessRedstone$$anonfun$updateOutput$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$3; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) { try { system.updateOutput(this.rs$3); }
/*    */       finally {} }
/*    */ 
/*    */     
/*    */     public WirelessRedstone$$anonfun$updateOutput$1(RedstoneWireless rs$3) {} }
/*    */   
/* 31 */   public void removeTransmitter(RedstoneWireless rs) { systems().foreach((Function1)new WirelessRedstone$$anonfun$removeTransmitter$1(rs)); } public final class WirelessRedstone$$anonfun$removeTransmitter$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$5; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) { try { system.removeTransmitter(this.rs$5); }
/*    */       finally {} }
/*    */     
/*    */     public WirelessRedstone$$anonfun$removeTransmitter$1(RedstoneWireless rs$5) {} }
/*    */   
/* 36 */   public boolean getInput(RedstoneWireless rs) { return systems().exists((Function1)new WirelessRedstone$$anonfun$getInput$1(rs)); } public final class WirelessRedstone$$anonfun$getInput$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$6; public final boolean apply(WirelessRedstone.WirelessRedstoneSystem x$1) { return x$1.getInput(this.rs$6); }
/*    */     
/*    */     public WirelessRedstone$$anonfun$getInput$1(RedstoneWireless rs$6) {} }
/* 39 */   public void resetRedstone(RedstoneWireless rs) { systems().foreach((Function1)new WirelessRedstone$$anonfun$resetRedstone$1(rs)); } public final class WirelessRedstone$$anonfun$resetRedstone$1 extends AbstractFunction1<WirelessRedstone.WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$1; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) { try { system.resetRedstone(this.rs$1); }
/*    */       finally {} }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public WirelessRedstone$$anonfun$resetRedstone$1(RedstoneWireless rs$1) {} }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private WirelessRedstone$() {
/* 57 */     MODULE$ = this;
/*    */     this.systems = scala.collection.mutable.Set$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\WirelessRedstone$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */