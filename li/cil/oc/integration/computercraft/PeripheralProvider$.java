/*    */ package li.cil.oc.integration.computercraft;
/*    */ import dan200.computercraft.api.peripheral.IPeripheral;
/*    */ import li.cil.oc.common.tileentity.traits.SwitchLike;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ 
/*    */ public final class PeripheralProvider$ implements IPeripheralProvider {
/*    */   private PeripheralProvider$() {
/*  8 */     MODULE$ = this;
/*    */   } public static final PeripheralProvider$ MODULE$; public void init() {
/* 10 */     ComputerCraftAPI.registerPeripheralProvider(this);
/*    */   } public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
/*    */     IPeripheral iPeripheral;
/* 13 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 14 */     if (tileEntity instanceof SwitchLike) { SwitchLike switchLike = (SwitchLike)tileEntity; iPeripheral = new SwitchPeripheral(switchLike); }
/* 15 */     else { iPeripheral = null; }
/*    */     
/*    */     return iPeripheral;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\PeripheralProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */