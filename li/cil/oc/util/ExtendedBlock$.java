/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraftforge.fluids.IFluidBlock;
/*    */ 
/*    */ public final class ExtendedBlock$
/*    */ {
/*    */   public static final ExtendedBlock$ MODULE$;
/*    */   
/*    */   public ExtendedBlock.ExtendedBlock extendedBlock(Block block) {
/* 11 */     return new ExtendedBlock.ExtendedBlock(block);
/*    */   }
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
/*    */   public ExtendedBlock.ExtendedFluidBlock extendedFluidBlock(IFluidBlock block) {
/* 27 */     return new ExtendedBlock.ExtendedFluidBlock(block);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private ExtendedBlock$() {
/* 37 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedBlock$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */