/*    */ package li.cil.oc.integration.util;
/*    */ public final class PortalGun$ {
/*    */   public static final PortalGun$ MODULE$;
/*    */   private Class<?> portalGunClass;
/*    */   private volatile boolean bitmap$0;
/*    */   
/*  7 */   private Class portalGunClass$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.portalGunClass = liftedTree1$1(); this.bitmap$0 = true; }  return this.portalGunClass; }  } private Class<?> portalGunClass() { return this.bitmap$0 ? this.portalGunClass : portalGunClass$lzycompute(); } private final Class liftedTree1$1() { try {  } finally {} return 
/*    */ 
/*    */ 
/*    */       
/* 11 */       null; }
/*    */ 
/*    */   
/*    */   public boolean isPortalGun(ItemStack stack) {
/* 15 */     return (stack != null && stack.field_77994_a > 0 && 
/* 16 */       li.cil.oc.integration.Mods$.MODULE$.PortalGun().isAvailable() && 
/* 17 */       portalGunClass() != null && 
/* 18 */       portalGunClass().isAssignableFrom(stack.func_77973_b().getClass()));
/*    */   }
/* 20 */   public boolean isStandardPortalGun(ItemStack stack) { return (isPortalGun(stack) && stack.func_77960_j() == 0); } private PortalGun$() {
/* 21 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\PortalGun$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */