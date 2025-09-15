/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import li.cil.oc.client.Textures$Cable$;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function2;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractFunction2;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055r!B\001\003\021\003y\021!B\"bE2,'BA\002\005\003\025\021Gn\\2l\025\t)a!\001\005sK:$WM]3s\025\t9\001\"\001\004dY&,g\016\036\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\001\001C\001\t\022\033\005\021a!\002\n\003\021\003\031\"!B\"bE2,7CA\t\025!\t)\002$D\001\027\025\0059\022!B:dC2\f\027BA\r\027\005\031\te.\037*fM\")1$\005C\0019\0051A(\0338jiz\"\022a\004\005\b=E\021\r\021\"\003 \003!\021\027m]3TSj,W#\001\021\021\005U\t\023B\001\022\027\005\031!u.\0362mK\"1A%\005Q\001\n\001\n\021BY1tKNK'0\032\021\t\017\031\n\"\031!C\005?\005A\001\017\\;h'&TX\r\003\004)#\001\006I\001I\001\na2,xmU5{K\002BQAK\t\005\002-\naA]3oI\026\024Hc\002\0270u}\n5)\023\t\003+5J!A\f\f\003\tUs\027\016\036\005\006a%\002\r!M\001\006o>\024H\016\032\t\003eaj\021a\r\006\003aQR!!\016\034\002\0235Lg.Z2sC\032$(\"A\034\002\0079,G/\003\002:g\ta\021J\0217pG.\f5mY3tg\")1(\013a\001y\005\t\001\020\005\002\026{%\021aH\006\002\004\023:$\b\"\002!*\001\004a\024!A=\t\013\tK\003\031\001\037\002\003iDQaA\025A\002\021\003\"!R$\016\003\031S!a\001\033\n\005!3%!\002\"m_\016\\\007\"B\003*\001\004Q\005CA&O\033\005a%BA\003N\025\t9A'\003\002P\031\na!+\0328eKJ\024En\\2lg\")!&\005C\001#R\031AF\025.\t\013M\003\006\031\001+\002\013M$\030mY6\021\005UCV\"\001,\013\005]#\024\001B5uK6L!!\027,\003\023%#X-\\*uC\016\\\007\"B\003Q\001\004Q\005\"\002/\022\t\023i\026aB5t\007\006\024G.\032\013\006=\006\0247\r\032\t\003+}K!\001\031\f\003\017\t{w\016\\3b]\")\001g\027a\001c!)1h\027a\001y!)\001i\027a\001y!)!i\027a\001y!)a-\005C\005O\006Q\021n]\"bE2,g)\024)\025\005yC\007\"B5f\001\004Q\027A\003;jY\026,e\016^5usB\0211N\\\007\002Y*\021Q\016N\001\013i&dW-\0328uSRL\030BA8m\005)!\026\016\\3F]RLG/\037\005\006cF!IA]\001?kRLGNR8s)JL7m[5oORCWMU3oI\026\024XM]%oi>,6/\0338h+:\034G.Y7qK\022$V\r\037;ve\026\034un\034:eS:\fG/Z:\025\0071\032H\017C\003\006a\002\007!\nC\003va\002\007A(A\003wC2,X\rC\003x#\021%\0010\001\ntKR\034uN\0348fGR,GMQ8v]\022\034H\003\002\027z\003\007AQA\037<A\002m\faAY8v]\022\034\bC\001?\000\033\005i(B\001@5\003\021)H/\0337\n\007\005\005QPA\007Bq&\034\030\t\\5h]\026$'I\021\005\b\003\0131\b\031AA\004\003\021\031\030\016Z3\021\t\005%\021QC\007\003\003\027Q1A`A\007\025\021\ty!!\005\002\r\r|W.\\8o\025\r\t\031BN\001\017[&tWm\031:bMR4wN]4f\023\021\t9\"a\003\003\035\031{'oZ3ESJ,7\r^5p]\"9\0211D\t\005\n\005u\021!D:fiBcWo\032\"pk:$7\017F\003-\003?\t\t\003\003\004{\0033\001\ra\037\005\t\003\013\tI\0021\001\002\b!9\021QE\t\005\n\005\035\022\001F:fiVs7m\0348oK\016$X\r\032\"pk:$7\017F\003-\003S\tY\003\003\004{\003G\001\ra\037\005\t\003\013\t\031\0031\001\002\b\001")
/*    */ public final class Cable
/*    */ {
/*    */   public static void render(ItemStack paramItemStack, RenderBlocks paramRenderBlocks) {
/*    */     Cable$.MODULE$.render(paramItemStack, paramRenderBlocks);
/*    */   }
/*    */   
/*    */   public static void render(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3, Block paramBlock, RenderBlocks paramRenderBlocks) {
/*    */     Cable$.MODULE$.render(paramIBlockAccess, paramInt1, paramInt2, paramInt3, paramBlock, paramRenderBlocks);
/*    */   }
/*    */   
/*    */   public final class Cable$$anonfun$render$1
/*    */     extends AbstractFunction1<ForgeDirection, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final IBlockAccess world$1;
/*    */     private final int x$1;
/*    */     private final int y$1;
/*    */     private final int z$1;
/*    */     
/*    */     public final void apply(ForgeDirection side) {
/* 40 */       if ((side.flag & this.mask$1) != 0) {
/* 41 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$baseSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$1(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/*    */       }
/* 43 */       this.renderer$1.field_147840_d = Textures$Cable$.MODULE$.iconCap();
/* 44 */       if ((side.flag & this.mask$1) != 0 && !Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$isCable(this.world$1, this.x$1 + side.offsetX, this.y$1 + side.offsetY, this.z$1 + side.offsetZ)) {
/* 45 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$utilForTrickingTheRendererIntoUsingUnclampedTextureCoordinates(this.renderer$1, 1);
/* 46 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$plugSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$2(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/* 47 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$utilForTrickingTheRendererIntoUsingUnclampedTextureCoordinates(this.renderer$1, 0);
/*    */       }
/* 49 */       else if (((side.getOpposite()).flag & this.mask$1) == this.mask$1 || this.mask$1 == 0) {
/* 50 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$baseSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$3(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/*    */       } 
/* 52 */       this.renderer$1.func_147771_a();
/*    */     }
/*    */     
/*    */     private final Block block$1;
/*    */     private final RenderBlocks renderer$1;
/*    */     private final AxisAlignedBB bounds$1;
/*    */     private final int mask$1;
/*    */     
/*    */     public Cable$$anonfun$render$1(IBlockAccess world$1, int x$1, int y$1, int z$1, Block block$1, RenderBlocks renderer$1, AxisAlignedBB bounds$1, int mask$1) {}
/*    */     
/*    */     public final class Cable$$anonfun$render$1$$anonfun$apply$1 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final void apply(AxisAlignedBB bounds, ForgeDirection side) {
/*    */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setConnectedBounds(bounds, side);
/*    */       }
/*    */       
/*    */       public Cable$$anonfun$render$1$$anonfun$apply$1(Cable$$anonfun$render$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class Cable$$anonfun$render$1$$anonfun$apply$2 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final void apply(AxisAlignedBB bounds, ForgeDirection side) {
/*    */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setPlugBounds(bounds, side);
/*    */       }
/*    */       
/*    */       public Cable$$anonfun$render$1$$anonfun$apply$2(Cable$$anonfun$render$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class Cable$$anonfun$render$1$$anonfun$apply$3 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final void apply(AxisAlignedBB bounds, ForgeDirection side) {
/*    */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setUnconnectedBounds(bounds, side);
/*    */       }
/*    */       
/*    */       public Cable$$anonfun$render$1$$anonfun$apply$3(Cable$$anonfun$render$1 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Cable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */