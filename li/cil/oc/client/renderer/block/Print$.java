/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import li.cil.oc.common.block.Print;
/*    */ import li.cil.oc.common.item.data.PrintData;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.collection.mutable.Set;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Print$ {
/*    */   public static final Print$ MODULE$;
/*    */   
/* 15 */   public void render(PrintData data, boolean state, ForgeDirection facing, int x, int y, int z, Block block, RenderBlocks renderer) { Print printBlock = ((Print)block).getPrintBlock();
/* 16 */     Set shapes = state ? data.stateOn() : data.stateOff();
/* 17 */     printBlock.isSingleShape_$eq((shapes.size() == 1));
/*    */     
/* 19 */     printBlock.textureOverride_$eq(scala.Option$.MODULE$.apply(resolveTexture("missingno")));
/* 20 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*    */ 
/*    */     
/* 23 */     shapes.withFilter((Function1)new Print$$anonfun$render$1()).foreach((Function1)new Print$$anonfun$render$2(facing, x, y, z, renderer, printBlock)); shapes.isEmpty() ? BoxesRunTime.boxToBoolean(renderer.func_147784_q((Block)printBlock, x, y, z)) : BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     printBlock.colorMultiplierOverride_$eq((Option)scala.None$.MODULE$);
/* 33 */     printBlock.textureOverride_$eq((Option)scala.None$.MODULE$);
/* 34 */     printBlock.isSingleShape_$eq(false); }
/*    */   public final class Print$$anonfun$render$1 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(PrintData.Shape shape) {
/*    */       return !Strings.isNullOrEmpty(shape.texture());
/* 38 */     } } public IIcon resolveTexture(String name) { TextureAtlasSprite icon = Minecraft.func_71410_x().func_147117_R().getTextureExtry(name);
/* 39 */     return (icon == null) ? (IIcon)((TextureMap)Minecraft.func_71410_x().func_110434_K().func_110581_b(TextureMap.field_110575_b)).func_110572_b("missingno") : 
/* 40 */       (IIcon)icon; }
/*    */   public final class Print$$anonfun$render$2 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable {
/* 42 */     public static final long serialVersionUID = 0L; private final ForgeDirection facing$1; private final int x$1; private final int y$1; private final int z$1; private final RenderBlocks renderer$1; private final Print printBlock$1; public Print$$anonfun$render$2(ForgeDirection facing$1, int x$1, int y$1, int z$1, RenderBlocks renderer$1, Print printBlock$1) {} public final boolean apply(PrintData.Shape shape) { AxisAlignedBB bounds = li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.facing$1); this.printBlock$1.colorMultiplierOverride_$eq(shape.tint()); this.printBlock$1.textureOverride_$eq(scala.Option$.MODULE$.apply(Print$.MODULE$.resolveTexture(shape.texture()))); this.renderer$1.func_147782_a(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c, bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f); return this.renderer$1.func_147784_q((Block)this.printBlock$1, this.x$1, this.y$1, this.z$1); } } private Print$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Print$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */