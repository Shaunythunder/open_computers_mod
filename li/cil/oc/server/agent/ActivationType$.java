/*   */ package li.cil.oc.server.agent;
/*   */ public final class ActivationType$ extends Enumeration { public static final ActivationType$ MODULE$; private final Enumeration.Value None;
/* 3 */   private ActivationType$() { MODULE$ = this;
/* 4 */     this.None = Value(); this.ItemUsed = Value(); this.ItemPlaced = Value(); this.BlockActivated = Value(); } private final Enumeration.Value ItemUsed; private final Enumeration.Value ItemPlaced; private final Enumeration.Value BlockActivated; public Enumeration.Value BlockActivated() { return this.BlockActivated; } public Enumeration.Value ItemPlaced() { return this.ItemPlaced; } public Enumeration.Value ItemUsed() { return this.ItemUsed; } public Enumeration.Value None() { return this.None; }
/*   */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\ActivationType$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */