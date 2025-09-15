/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import li.cil.oc.common.item.data.PrintData;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%<Q!\001\002\t\002=\tQ\001\025:j]RT!a\001\003\002\013\tdwnY6\013\005\0251\021\001\003:f]\022,'/\032:\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021Q\001\025:j]R\034\"!\005\013\021\005UAR\"\001\f\013\003]\tQa]2bY\006L!!\007\f\003\r\005s\027PU3g\021\025Y\022\003\"\001\035\003\031a\024N\\5u}Q\tq\002C\003\037#\021\005q$\001\004sK:$WM\035\013\nA\rr3\007Q#H\023F\003\"!F\021\n\005\t2\"\001B+oSRDQ\001J\017A\002\025\nA\001Z1uCB\021a\005L\007\002O)\021A\005\013\006\003S)\nA!\033;f[*\0211\006C\001\007G>lWn\0348\n\0055:#!\003)sS:$H)\031;b\021\025yS\0041\0011\003\025\031H/\031;f!\t)\022'\003\0023-\t9!i\\8mK\006t\007\"\002\033\036\001\004)\024A\0024bG&tw\r\005\0027}5\tqG\003\0029s\005!Q\017^5m\025\tY#H\003\002<y\005qQ.\0338fGJ\fg\r\0364pe\036,'\"A\037\002\0079,G/\003\002@o\tqai\034:hK\022K'/Z2uS>t\007\"B!\036\001\004\021\025!\001=\021\005U\031\025B\001#\027\005\rIe\016\036\005\006\rv\001\rAQ\001\002s\")\001*\ba\001\005\006\t!\020C\003\004;\001\007!\n\005\002L\0376\tAJ\003\002\004\033*\021a\nP\001\n[&tWm\031:bMRL!\001\025'\003\013\tcwnY6\t\013\025i\002\031\001*\021\005M3V\"\001+\013\005\025)&BA\004N\023\t9FK\001\007SK:$WM\035\"m_\016\\7\017C\003Z#\021\005!,\001\bsKN|GN^3UKb$XO]3\025\005m\003\007C\001/_\033\005i&B\001\035N\023\tyVLA\003J\023\016|g\016C\003b1\002\007!-\001\003oC6,\007CA2g\035\t)B-\003\002f-\0051\001K]3eK\032L!a\0325\003\rM#(/\0338h\025\t)g\003")
/*    */ public final class Print {
/*    */   public static IIcon resolveTexture(String paramString) {
/*    */     return Print$.MODULE$.resolveTexture(paramString);
/*    */   }
/*    */   
/*    */   public static void render(PrintData paramPrintData, boolean paramBoolean, ForgeDirection paramForgeDirection, int paramInt1, int paramInt2, int paramInt3, Block paramBlock, RenderBlocks paramRenderBlocks) {
/*    */     Print$.MODULE$.render(paramPrintData, paramBoolean, paramForgeDirection, paramInt1, paramInt2, paramInt3, paramBlock, paramRenderBlocks);
/*    */   }
/*    */   
/* 23 */   public final class Print$$anonfun$render$1 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable { public final boolean apply(PrintData.Shape shape) { return !Strings.isNullOrEmpty(shape.texture()); } public static final long serialVersionUID = 0L; } public final class Print$$anonfun$render$2 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection facing$1; public final boolean apply(PrintData.Shape shape) {
/* 24 */       AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.facing$1);
/* 25 */       this.printBlock$1.colorMultiplierOverride_$eq(shape.tint());
/* 26 */       this.printBlock$1.textureOverride_$eq(Option$.MODULE$.apply(Print$.MODULE$.resolveTexture(shape.texture())));
/* 27 */       this.renderer$1.func_147782_a(
/* 28 */           bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c, 
/* 29 */           bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f);
/* 30 */       return this.renderer$1.func_147784_q((Block)this.printBlock$1, this.x$1, this.y$1, this.z$1);
/*    */     }
/*    */     
/*    */     private final int x$1;
/*    */     private final int y$1;
/*    */     private final int z$1;
/*    */     private final RenderBlocks renderer$1;
/*    */     private final li.cil.oc.common.block.Print printBlock$1;
/*    */     
/*    */     public Print$$anonfun$render$2(ForgeDirection facing$1, int x$1, int y$1, int z$1, RenderBlocks renderer$1, li.cil.oc.common.block.Print printBlock$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Print.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */