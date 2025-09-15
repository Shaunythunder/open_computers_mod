/*    */ package li.cil.oc.integration.computercraft;
/*    */ import li.cil.oc.common.tileentity.traits.BundledRedstoneAware;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ public final class BundledRedstoneProvider$ implements IBundledRedstoneProvider, BundledRedstone.RedstoneProvider {
/*    */   public static final BundledRedstoneProvider$ MODULE$;
/*    */   
/*    */   private BundledRedstoneProvider$() {
/* 12 */     MODULE$ = this;
/*    */   } public void init() {
/* 14 */     ComputerCraftAPI.registerBundledRedstoneProvider(this);
/* 15 */     li.cil.oc.integration.util.BundledRedstone$.MODULE$.addProvider(this);
/*    */   }
/*    */   
/*    */   public int getBundledRedstoneOutput(World world, int x, int y, int z, int side) { byte b;
/* 19 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 20 */     if (tileEntity instanceof BundledRedstoneAware) { BundledRedstoneAware bundledRedstoneAware = (BundledRedstoneAware)tileEntity;
/* 21 */       IntRef result = IntRef.create(0);
/* 22 */       int[] colors = bundledRedstoneAware.getBundledOutput(ForgeDirection.VALID_DIRECTIONS[side]); scala.runtime.RichInt$.MODULE$
/* 23 */         .to$extension0(scala.Predef$.MODULE$.intWrapper(0), 15).foreach$mVc$sp((Function1)new BundledRedstoneProvider$$anonfun$getBundledRedstoneOutput$1(result, colors));
/*    */ 
/*    */       
/* 26 */       b = result.elem; }
/* 27 */     else { b = -1; }
/*    */     
/*    */     return b; }
/* 30 */   public int computeInput(BlockPosition pos, ForgeDirection side) { return 0; }
/*    */   public final class BundledRedstoneProvider$$anonfun$getBundledRedstoneOutput$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/* 33 */     private final IntRef result$1; private final int[] colors$1; public final void apply(int color) { apply$mcVI$sp(color); } public BundledRedstoneProvider$$anonfun$getBundledRedstoneOutput$1(IntRef result$1, int[] colors$1) {} public void apply$mcVI$sp(int color) { if (this.colors$1[color] > 0) this.result$1.elem |= 1 << color;  } } public int[] computeBundledInput(BlockPosition pos, ForgeDirection side) { BlockPosition offset = pos.offset(side);
/* 34 */     int strength = ComputerCraftAPI.getBundledRedstoneOutput((World)pos.world().get(), offset.x(), offset.y(), offset.z(), side.getOpposite().ordinal());
/*    */     
/* 36 */     int[] strengths = new int[16]; scala.runtime.RichInt$.MODULE$
/* 37 */       .to$extension0(scala.Predef$.MODULE$.intWrapper(0), 15).foreach$mVc$sp((Function1)new BundledRedstoneProvider$$anonfun$computeBundledInput$1(strength, strengths));
/*    */ 
/*    */     
/* 40 */     return (strength >= 0) ? strengths : 
/* 41 */       null; }
/*    */ 
/*    */   
/*    */   public final class BundledRedstoneProvider$$anonfun$computeBundledInput$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final int strength$1;
/*    */     private final int[] strengths$1;
/*    */     
/*    */     public final void apply(int colour) {
/*    */       apply$mcVI$sp(colour);
/*    */     }
/*    */     
/*    */     public BundledRedstoneProvider$$anonfun$computeBundledInput$1(int strength$1, int[] strengths$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int colour) {
/*    */       this.strengths$1[colour] = ((this.strength$1 & 1 << colour) == 0) ? 0 : 15;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\BundledRedstoneProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */