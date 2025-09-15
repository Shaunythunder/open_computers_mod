/*    */ package li.cil.oc.integration.fmp;
/*    */ import codechicken.lib.vec.BlockCoord;
/*    */ import codechicken.multipart.TMultiPart;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.common.tileentity.Cable;
/*    */ import li.cil.oc.common.tileentity.Print;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ public final class MultipartConverter$ implements MultiPartRegistry.IPartConverter {
/*    */   private MultipartConverter$() {
/* 14 */     MODULE$ = this;
/*    */   } public static final MultipartConverter$ MODULE$; public void init() {
/* 16 */     codechicken.multipart.MultiPartRegistry$.MODULE$.registerConverter(this);
/*    */   }
/*    */   
/*    */   public List<Block> blockTypes() {
/* 20 */     (new Block[2])[0] = Items.get("cable").block(); (new Block[2])[1] = 
/* 21 */       Items.get("print").block();
/*    */     return Arrays.asList((Object[])new Block[2]);
/*    */   } public TMultiPart convert(World world, BlockCoord pos) {
/*    */     TMultiPart tMultiPart;
/* 25 */     TileEntity tileEntity = world.func_147438_o(pos.x, pos.y, pos.z);
/* 26 */     if (tileEntity instanceof Cable) { Cable cable = (Cable)tileEntity; tMultiPart = new CablePart((Option<Cable>)new Some(cable)); }
/* 27 */     else if (tileEntity instanceof Print) { Print print = (Print)tileEntity; tMultiPart = new PrintPart((Option<Print>)new Some(print)); }
/* 28 */     else { tMultiPart = null; }
/*    */     
/*    */     return tMultiPart;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\MultipartConverter$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */