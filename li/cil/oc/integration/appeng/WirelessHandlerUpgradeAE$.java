/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.AEApi;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WirelessHandlerUpgradeAE$
/*    */ {
/*    */   public static final WirelessHandlerUpgradeAE$ MODULE$;
/*    */   private WirelessHandlerUpgradeAE instance;
/*    */   private volatile boolean bitmap$0;
/*    */   
/*    */   private WirelessHandlerUpgradeAE instance$lzycompute() {
/* 78 */     synchronized (this) { if (!this.bitmap$0) { this.instance = new WirelessHandlerUpgradeAE(); this.bitmap$0 = true; }  return this.instance; }  } public WirelessHandlerUpgradeAE instance() { return this.bitmap$0 ? this.instance : instance$lzycompute(); }
/*    */    public void register() {
/* 80 */     AEApi.instance().registries().wireless().registerWirelessHandler(instance());
/*    */   } private WirelessHandlerUpgradeAE$() {
/* 82 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\WirelessHandlerUpgradeAE$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */