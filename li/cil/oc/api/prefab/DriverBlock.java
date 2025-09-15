/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.driver.Block;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
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
/*    */ @Deprecated
/*    */ public abstract class DriverBlock
/*    */   implements Block
/*    */ {
/*    */   protected final ItemStack[] blocks;
/*    */   
/*    */   protected DriverBlock(ItemStack... blocks) {
/* 30 */     this.blocks = (ItemStack[])blocks.clone();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean worksWith(World world, int x, int y, int z) {
/* 35 */     return worksWith(world.func_147439_a(x, y, z), world.func_72805_g(x, y, z));
/*    */   }
/*    */   
/*    */   protected boolean worksWith(Block referenceBlock, int referenceMetadata) {
/* 39 */     for (ItemStack stack : this.blocks) {
/* 40 */       if (stack != null && stack.func_77973_b() instanceof ItemBlock) {
/* 41 */         ItemBlock item = (ItemBlock)stack.func_77973_b();
/* 42 */         Block supportedBlock = item.field_150939_a;
/* 43 */         int supportedMetadata = item.func_77647_b(stack.func_77960_j());
/* 44 */         if (referenceBlock == supportedBlock && (referenceMetadata == supportedMetadata || stack
/*    */           
/* 46 */           .func_77960_j() == 32767)) {
/* 47 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/* 51 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\DriverBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */