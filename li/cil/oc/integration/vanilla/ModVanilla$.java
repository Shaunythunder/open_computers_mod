/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ import li.cil.oc.integration.util.BundledRedstone;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.block.BlockRedstoneWire;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class ModVanilla$ implements ModProxy, BundledRedstone.RedstoneProvider {
/* 15 */   private ModVanilla$() { MODULE$ = this; } public static final ModVanilla$ MODULE$; public Mods.SimpleMod getMod() {
/* 16 */     return li.cil.oc.integration.Mods$.MODULE$.Minecraft();
/*    */   }
/*    */   public void initialize() {
/* 19 */     Driver.add((SidedBlock)DriverBeacon$.MODULE$);
/* 20 */     Driver.add((SidedBlock)DriverBrewingStand$.MODULE$);
/* 21 */     Driver.add((SidedBlock)DriverComparator$.MODULE$);
/* 22 */     Driver.add((SidedBlock)DriverFurnace$.MODULE$);
/* 23 */     Driver.add((SidedBlock)DriverMobSpawner$.MODULE$);
/* 24 */     Driver.add((SidedBlock)DriverNoteBlock$.MODULE$);
/* 25 */     Driver.add((SidedBlock)DriverRecordPlayer$.MODULE$);
/*    */     
/* 27 */     Driver.add(DriverBeacon.Provider$.MODULE$);
/* 28 */     Driver.add(DriverBrewingStand.Provider$.MODULE$);
/* 29 */     Driver.add(DriverComparator.Provider$.MODULE$);
/* 30 */     Driver.add(DriverFurnace.Provider$.MODULE$);
/* 31 */     Driver.add(DriverMobSpawner.Provider$.MODULE$);
/* 32 */     Driver.add(DriverNoteBlock.Provider$.MODULE$);
/* 33 */     Driver.add(DriverRecordPlayer.Provider$.MODULE$);
/*    */     
/* 35 */     if (li.cil.oc.Settings$.MODULE$.get().enableInventoryDriver()) {
/* 36 */       Driver.add((SidedBlock)new DriverInventory());
/*    */     }
/* 38 */     if (li.cil.oc.Settings$.MODULE$.get().enableTankDriver()) {
/* 39 */       Driver.add((SidedBlock)new DriverFluidHandler());
/* 40 */       Driver.add((SidedBlock)new DriverFluidTank());
/*    */     } 
/* 42 */     if (li.cil.oc.Settings$.MODULE$.get().enableCommandBlockDriver()) {
/* 43 */       Driver.add((SidedBlock)DriverCommandBlock$.MODULE$);
/*    */     }
/*    */     
/* 46 */     Driver.add(ConverterFluidContainerItem$.MODULE$);
/* 47 */     Driver.add(ConverterFluidStack$.MODULE$);
/* 48 */     Driver.add(ConverterFluidTankInfo$.MODULE$);
/* 49 */     Driver.add(ConverterFluidContainerItem$.MODULE$);
/* 50 */     Driver.add(ConverterItemStack$.MODULE$);
/* 51 */     Driver.add(ConverterNBT$.MODULE$);
/* 52 */     Driver.add(ConverterWorld$.MODULE$);
/* 53 */     Driver.add(ConverterWorldProvider$.MODULE$);
/*    */     
/* 55 */     RecipeHandler$.MODULE$.init();
/*    */     
/* 57 */     li.cil.oc.integration.util.BundledRedstone$.MODULE$.addProvider(this);
/*    */     
/* 59 */     MinecraftForge.EVENT_BUS.register(EventHandlerVanilla$.MODULE$);
/*    */   }
/*    */   
/*    */   public int computeInput(BlockPosition pos, ForgeDirection side) {
/* 63 */     World world = (World)pos.world().get();
/*    */     
/* 65 */     BlockRedstoneWire blockRedstoneWire = Blocks.field_150488_af; if (li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(pos.offset(side)) == null) { li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(pos.offset(side)); if (blockRedstoneWire != null); } else if (li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(pos.offset(side)).equals(blockRedstoneWire))
/*    */     {  }
/*    */      } public int[] computeBundledInput(BlockPosition pos, ForgeDirection side) {
/* 68 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ModVanilla$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */