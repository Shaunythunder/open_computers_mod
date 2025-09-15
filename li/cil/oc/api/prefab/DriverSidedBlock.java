/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
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
/*    */ public abstract class DriverSidedBlock
/*    */   implements SidedBlock
/*    */ {
/*    */   protected final ItemStack[] blocks;
/*    */   
/*    */   protected DriverSidedBlock(ItemStack... blocks) {
/* 32 */     this.blocks = (ItemStack[])blocks.clone();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) {
/* 37 */     return worksWith(world.func_147439_a(x, y, z), world.func_72805_g(x, y, z));
/*    */   }
/*    */   
/*    */   protected boolean worksWith(Block referenceBlock, int referenceMetadata) {
/* 41 */     for (ItemStack stack : this.blocks) {
/* 42 */       if (stack != null && stack.func_77973_b() instanceof ItemBlock) {
/* 43 */         ItemBlock item = (ItemBlock)stack.func_77973_b();
/* 44 */         Block supportedBlock = item.field_150939_a;
/* 45 */         int supportedMetadata = item.func_77647_b(stack.func_77960_j());
/* 46 */         if (referenceBlock == supportedBlock && (referenceMetadata == supportedMetadata || stack
/*    */           
/* 48 */           .func_77960_j() == 32767)) {
/* 49 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/* 53 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\DriverSidedBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */