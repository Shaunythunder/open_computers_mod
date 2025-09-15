/*    */ package li.cil.oc.integration;
/*    */ 
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ 
/*    */ public class ManagedTileEntityEnvironment<T>
/*    */   extends ManagedEnvironment {
/*    */   public ManagedTileEntityEnvironment(T tileEntity, String name) {
/* 11 */     this.tileEntity = tileEntity;
/* 12 */     setNode(Network.newNode((Environment)this, Visibility.Network).withComponent(name).create());
/*    */   }
/*    */   
/*    */   protected final T tileEntity;
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ManagedTileEntityEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */