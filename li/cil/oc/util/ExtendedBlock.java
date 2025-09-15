/*    */ package li.cil.oc.util;
/*    */ import net.minecraft.world.World;
/*    */ @ScalaSignature(bytes = "\006\001\005}q!B\001\003\021\003Y\021!D#yi\026tG-\0323CY>\0347N\003\002\004\t\005!Q\017^5m\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001\001\t\003\0315i\021A\001\004\006\035\tA\ta\004\002\016\013b$XM\0343fI\ncwnY6\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!)!$\004C\0027\005iQ\r\037;f]\022,GM\0217pG.$\"\001\b4\021\005uqR\"A\007\007\t9i\001aH\n\003=AA\001\"\t\020\003\006\004%\tAI\001\006E2|7m[\013\002GA\021AEK\007\002K)\021\021E\n\006\003O!\n\021\"\\5oK\016\024\030M\032;\013\003%\n1A\\3u\023\tYSEA\003CY>\0347\016\003\005.=\t\005\t\025!\003$\003\031\021Gn\\2lA!)qC\bC\001_Q\021A\004\r\005\006C9\002\ra\t\005\006ey!\taM\001\006SN\f\025N\035\013\003i]\002\"!E\033\n\005Y\022\"a\002\"p_2,\027M\034\005\006qE\002\r!O\001\ta>\034\030\016^5p]B\021ABO\005\003w\t\021QB\0217pG.\004vn]5uS>t\007\"B\037\037\t\003q\024!D5t%\026\004H.Y2fC\ndW\r\006\0025!)\001\b\020a\001s!)\021I\bC\001\005\006Q2/\032;CY>\0347NQ8v]\022\034()Y:fI>s7\013^1uKR\0211I\022\t\003#\021K!!\022\n\003\tUs\027\016\036\005\006q\001\003\r!\017\005\006\021z!\t!S\001\037O\026$8+\0327fGR,GMQ8v]\022Lgn\032\"pq\032\023x.\034)p_2$\"AS(\021\005-kU\"\001'\013\005\r1\023B\001(M\0055\t\0050[:BY&<g.\0323C\005\")\001h\022a\001s!)\021K\bC\001%\006yr-\032;D_2d\027n]5p]\n{WO\0343j]\036\024u\016\037$s_6\004vn\0347\025\005)\033\006\"\002\035Q\001\004I\004\"B+\037\t\0031\026AG4fi\016{W\016]1sCR|'/\0238qkR|e/\032:sS\022,GcA,[7B\021\021\003W\005\0033J\0211!\0238u\021\025AD\0131\001:\021\025aF\0131\001^\003\021\031\030\016Z3\021\005y#W\"A0\013\005\r\001'BA1c\003\031\031w.\\7p]*\0211\rK\001\017[&tWm\031:bMR4wN]4f\023\t)wL\001\bG_J<W\rR5sK\016$\030n\0348\t\013\005J\002\031A\022\t\013!lA1A5\002%\025DH/\0328eK\0224E.^5e\0052|7m\033\013\004U\006u\001CA\017l\r\021aW\002A7\003%\025CH/\0328eK\0224E.^5e\0052|7m[\n\003WBA\001\"I6\003\006\004%\ta\\\013\002aB\021\021\017^\007\002e*\0211OY\001\007M2,\030\016Z:\n\005U\024(aC%GYVLGM\0217pG.D\001\"L6\003\002\003\006I\001\035\005\006/-$\t\001\037\013\003UfDQ!I<A\002ADQa_6\005\002q\fQ\001\032:bS:$R!`A\001\003\007\001\"!\035@\n\005}\024(A\003$mk&$7\013^1dW\")\001H\037a\001s!1\021Q\001>A\002Q\nq\001Z8Ee\006Lg\016C\004\002\n-$\t!a\003\002\021\r\fg\016\022:bS:$2\001NA\007\021\031A\024q\001a\001s!9\021\021C6\005\002\005M\021aE4fi\032KG\016\\3e!\026\0248-\0328uC\036,G\003BA\013\0037\0012!EA\f\023\r\tIB\005\002\006\r2|\027\r\036\005\007q\005=\001\031A\035\t\013\005:\007\031\0019")
/*    */ public final class ExtendedBlock {
/*    */   public static ExtendedFluidBlock extendedFluidBlock(IFluidBlock paramIFluidBlock) {
/*    */     return ExtendedBlock$.MODULE$.extendedFluidBlock(paramIFluidBlock);
/*    */   }
/*    */   
/*    */   public static ExtendedBlock extendedBlock(Block paramBlock) {
/*    */     return ExtendedBlock$.MODULE$.extendedBlock(paramBlock);
/*    */   }
/*    */   
/* 13 */   public static class ExtendedBlock { public Block block() { return this.block; } private final Block block; public ExtendedBlock(Block block) {} public boolean isAir(BlockPosition position) {
/* 14 */       return block().isAir((IBlockAccess)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public boolean isReplaceable(BlockPosition position) {
/* 16 */       return block().isReplaceable((IBlockAccess)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public void setBlockBoundsBasedOnState(BlockPosition position) {
/* 18 */       block().func_149719_a((IBlockAccess)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public AxisAlignedBB getSelectedBoundingBoxFromPool(BlockPosition position) {
/* 20 */       return block().func_149633_g((World)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public AxisAlignedBB getCollisionBoundingBoxFromPool(BlockPosition position) {
/* 22 */       return block().func_149668_a((World)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public int getComparatorInputOverride(BlockPosition position, ForgeDirection side) {
/* 24 */       return block().func_149736_g((World)position.world().get(), position.x(), position.y(), position.z(), side.ordinal());
/*    */     } }
/*    */   
/*    */   public static class ExtendedFluidBlock { private final IFluidBlock block;
/*    */     
/* 29 */     public IFluidBlock block() { return this.block; } public ExtendedFluidBlock(IFluidBlock block) {} public FluidStack drain(BlockPosition position, boolean doDrain) {
/* 30 */       return block().drain((World)position.world().get(), position.x(), position.y(), position.z(), doDrain);
/*    */     } public boolean canDrain(BlockPosition position) {
/* 32 */       return block().canDrain((World)position.world().get(), position.x(), position.y(), position.z());
/*    */     } public float getFilledPercentage(BlockPosition position) {
/* 34 */       return block().getFilledPercentage((World)position.world().get(), position.x(), position.y(), position.z());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */