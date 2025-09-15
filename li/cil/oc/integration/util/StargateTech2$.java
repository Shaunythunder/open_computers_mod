/*    */ package li.cil.oc.integration.util;
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import lordfokas.stargatetech2.api.bus.BusEvent;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ 
/*    */ public final class StargateTech2$ {
/*    */   public boolean addDevice(World world, int x, int y, int z) {
/*  9 */     return MinecraftForge.EVENT_BUS.post((Event)new BusEvent.AddToNetwork(world, x, y, z));
/*    */   } public static final StargateTech2$ MODULE$; public boolean removeDevice(World world, int x, int y, int z) {
/* 11 */     return MinecraftForge.EVENT_BUS.post((Event)new BusEvent.RemoveFromNetwork(world, x, y, z)); } private StargateTech2$() {
/* 12 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\StargateTech2$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */