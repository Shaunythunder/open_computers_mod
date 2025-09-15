/*     */ package li.cil.oc.client.renderer.block;
/*     */ 
/*     */ import com.gtnewhorizons.angelica.api.ThreadSafeISBRH;
/*     */ import li.cil.oc.common.tileentity.NetSplitter;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ThreadSafeISBRH(perThread = false)
/*     */ @ScalaSignature(bytes = "\006\001\005\005v!B\001\003\021\003y\021!\004\"m_\016\\'+\0328eKJ,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\te\026tG-\032:fe*\021q\001C\001\007G2LWM\034;\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051CA\007CY>\0347NU3oI\026\024XM]\n\004#Qa\002CA\013\033\033\0051\"BA\f\031\003\021a\027M\\4\013\003e\tAA[1wC&\0211D\006\002\007\037\nTWm\031;\021\005u9S\"\001\020\013\005}\001\023\001\003:fO&\034HO]=\013\005\035\t#B\001\022$\003\r1W\016\034\006\003I\025\nA!\\8eg*\ta%A\002da^L!\001\013\020\0039%\033\026.\0349mK\ncwnY6SK:$WM]5oO\"\013g\016\0327fe\")!&\005C\001W\0051A(\0338jiz\"\022a\004\005\006[E!\tAL\001\fO\026$(+\0328eKJLE\rF\0010!\t\0014'D\0012\025\005\021\024!B:dC2\f\027B\001\0332\005\rIe\016\036\005\006mE!\teN\001\032g\"|W\017\0343SK:$WM]\032E\023:LeN^3oi>\024\030\020\006\0029wA\021\001'O\005\003uE\022qAQ8pY\026\fg\016C\003=k\001\007q&A\004n_\022,G.\023#\t\013y\nB\021I \002)I,g\016Z3s\023:4XM\034;pef\024En\\2l)\025\0015)T(Q!\t\001\024)\003\002Cc\t!QK\\5u\021\025\031Q\b1\001E!\t)5*D\001G\025\t\031qI\003\002I\023\006IQ.\0338fGJ\fg\r\036\006\002\025\006\031a.\032;\n\00513%!\002\"m_\016\\\007\"\002(>\001\004y\023\001C7fi\006$\027\r^1\t\013qj\004\031A\030\t\013Ek\004\031\001*\002\031I,\027\r\034*f]\022,'/\032:\021\005M3V\"\001+\013\005\025)&BA\004H\023\t9FK\001\007SK:$WM\035\"m_\016\\7\017C\003Z#\021\005#,\001\tsK:$WM],pe2$'\t\\8dWRA\001h\0272eM\"L7\016C\003]1\002\007Q,A\003x_JdG\r\005\002_A6\tqL\003\002]\017&\021\021m\030\002\r\023\ncwnY6BG\016,7o\035\005\006Gb\003\raL\001\002q\")Q\r\027a\001_\005\t\021\020C\003h1\002\007q&A\001{\021\025\031\001\f1\001E\021\025Q\007\f1\0010\003\035iw\016Z3m\023\022DQ!\025-A\002ICQ!\\\t\005\n9\fQB\\3fIN4E.\0339qS:<GC\001\035p\021\025\031A\0161\001E\021\035\t\030C1A\005\002I\fa\004]1uG\",GMU3oI\026\024(\t\\8dWN$\006N]3bI2{7-\0317\026\003M\0042!\006;w\023\t)hCA\006UQJ,\027\r\032'pG\006d\007CA<y\033\005\tb\001B=\022\001i\0241\003U1uG\",GMU3oI\026\024(\t\\8dWN\034\"\001\037*\t\013)BH\021\001?\025\003YDQA =\005B}\faB]3oI\026\024h)Y2f1B{7\017F\006A\003\003\t\031!a\003\002\016\005=\001\"B\002~\001\004!\005BB2~\001\004\t)\001E\0021\003\017I1!!\0032\005\031!u.\0362mK\"1Q- a\001\003\013AaaZ?A\002\005\025\001bBA\t{\002\007\0211C\001\bi\026DH/\036:f!\021\t)\"a\007\016\005\005]!bAA\r\017\006!Q\017^5m\023\021\ti\"a\006\003\013%K5m\0348\t\017\005\005\002\020\"\021\002$\005q!/\0328eKJ4\025mY3[\035\026<Gc\003!\002&\005\035\022\021FA\026\003[AaaAA\020\001\004!\005bB2\002 \001\007\021Q\001\005\bK\006}\001\031AA\003\021\0359\027q\004a\001\003\013A\001\"!\005\002 \001\007\0211\003\005\b\003c\t\002\025!\003t\003}\001\030\r^2iK\022\024VM\0343fe\ncwnY6t)\"\024X-\0313M_\016\fG\016\t\005\b\003k\tB\021AA\034\003=\001\030\r^2iK\022\024VM\0343fe\026\024H#\002*\002:\005m\002BB\003\0024\001\007!\013\003\004\004\003g\001\r\001\022\005\007}F!\t!a\020\025\017\001\013\t%a\021\002F!11!!\020A\002\021CaATA\037\001\004y\003BB\003\002>\001\007!\013C\004\002JE!\t!a\023\002\035I,g\016Z3s\r\006\034W\r\027(fOR9\001)!\024\002P\005E\003BB\002\002H\001\007A\t\003\004O\003\017\002\ra\f\005\007\013\005\035\003\031\001*\t\017\005U\023\003\"\001\002X\005q!/\0328eKJ4\025mY3Z!>\034Hc\002!\002Z\005m\023Q\f\005\007\007\005M\003\031\001#\t\r9\013\031\0061\0010\021\031)\0211\013a\001%\"9\021\021M\t\005\002\005\r\024A\004:f]\022,'OR1dKfsUm\032\013\b\001\006\025\024qMA5\021\031\031\021q\fa\001\t\"1a*a\030A\002=Ba!BA0\001\004\021\006bBA7#\021\005\021qN\001\017e\026tG-\032:GC\016,'\fU8t)\035\001\025\021OA:\003kBaaAA6\001\004!\005B\002(\002l\001\007q\006\003\004\006\003W\002\rA\025\005\b\003C\tB\021AA=)\035\001\0251PA?\003BaaAA<\001\004!\005B\002(\002x\001\007q\006\003\004\006\003o\002\rA\025\025\b#\005\r\0251TAO!\021\t))a&\016\005\005\035%\002BAE\003\027\0131!\0319j\025\021\ti)a$\002\021\005tw-\0327jG\006TA!!%\002\024\006iq\r\0368fo\"|'/\033>p]NT!!!&\002\007\r|W.\003\003\002\032\006\035%a\004+ie\026\fGmU1gK&\033&I\025%\002\023A,'\017\0265sK\006$\027$\001\001)\017\001\t\031)a'\002\036\002")
/*     */ public final class BlockRenderer
/*     */ {
/*     */   public static void renderFaceZNeg(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceZNeg(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderFaceZPos(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceZPos(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderFaceYNeg(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceYNeg(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderFaceYPos(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceYPos(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderFaceXNeg(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceXNeg(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderFaceXPos(Block paramBlock, int paramInt, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderFaceXPos(paramBlock, paramInt, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static RenderBlocks patchedRenderer(RenderBlocks paramRenderBlocks, Block paramBlock) {
/*     */     return BlockRenderer$.MODULE$.patchedRenderer(paramRenderBlocks, paramBlock);
/*     */   }
/*     */   
/*     */   public static ThreadLocal<PatchedRenderBlocks> patchedRenderBlocksThreadLocal() {
/*     */     return BlockRenderer$.MODULE$.patchedRenderBlocksThreadLocal();
/*     */   }
/*     */   
/*     */   public static boolean renderWorldBlock(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3, Block paramBlock, int paramInt4, RenderBlocks paramRenderBlocks) {
/*     */     return BlockRenderer$.MODULE$.renderWorldBlock(paramIBlockAccess, paramInt1, paramInt2, paramInt3, paramBlock, paramInt4, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static void renderInventoryBlock(Block paramBlock, int paramInt1, int paramInt2, RenderBlocks paramRenderBlocks) {
/*     */     BlockRenderer$.MODULE$.renderInventoryBlock(paramBlock, paramInt1, paramInt2, paramRenderBlocks);
/*     */   }
/*     */   
/*     */   public static boolean shouldRender3DInInventory(int paramInt) {
/*     */     return BlockRenderer$.MODULE$.shouldRender3DInInventory(paramInt);
/*     */   }
/*     */   
/*     */   public static int getRenderId() {
/*     */     return BlockRenderer$.MODULE$.getRenderId();
/*     */   }
/*     */   
/*     */   public final class BlockRenderer$$anonfun$renderWorldBlock$1
/*     */     extends AbstractFunction1<ForgeDirection, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NetSplitter x9$1;
/*     */     
/*     */     public final boolean apply(ForgeDirection side) {
/* 119 */       return this.x9$1.isSideOpen(side);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BlockRenderer$$anonfun$renderWorldBlock$1(NetSplitter x9$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class BlockRenderer$$anon$1
/*     */     extends ThreadLocal<PatchedRenderBlocks>
/*     */   {
/*     */     public BlockRenderer.PatchedRenderBlocks initialValue() {
/* 141 */       return new BlockRenderer.PatchedRenderBlocks();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class PatchedRenderBlocks
/*     */     extends RenderBlocks
/*     */   {
/*     */     public void func_147764_f(Block block, double x, double y, double z, IIcon texture) {
/* 173 */       this.field_147842_e = !this.field_147842_e;
/* 174 */       super.func_147764_f(block, x, y, z, texture);
/* 175 */       this.field_147842_e = !this.field_147842_e;
/*     */     }
/*     */     
/*     */     public void func_147761_c(Block block, double x, double y, double z, IIcon texture) {
/* 179 */       this.field_147842_e = !this.field_147842_e;
/* 180 */       super.func_147761_c(block, x, y, z, texture);
/* 181 */       this.field_147842_e = !this.field_147842_e;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\BlockRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */