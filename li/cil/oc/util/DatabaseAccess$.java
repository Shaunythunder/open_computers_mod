/*    */ package li.cil.oc.util;
/*    */ import li.cil.oc.api.network.Component;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.server.component.UpgradeDatabase;
/*    */ 
/*    */ public final class DatabaseAccess$ {
/*    */   public Object[] withDatabase(Node node, String address, Function1 f) {
/*  9 */     Node node1 = node.network().node(address);
/* 10 */     if (node1 instanceof Component) { Component component = (Component)node1; Environment environment = component.host();
/* 11 */       if (environment instanceof UpgradeDatabase) { UpgradeDatabase upgradeDatabase = (UpgradeDatabase)environment; Object[] arrayOfObject2 = (Object[])f.apply(upgradeDatabase); Object[] arrayOfObject1 = arrayOfObject2; }
/* 12 */        throw new IllegalArgumentException("not a database"); }
/*    */     
/* 14 */     throw new IllegalArgumentException("no such component");
/*    */   } public static final DatabaseAccess$ MODULE$;
/*    */   private DatabaseAccess$() {
/* 17 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\DatabaseAccess$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */