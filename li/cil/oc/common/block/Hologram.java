/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.common.block.traits.SpecialBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Md\001B\001\003\0015\021\001\002S8m_\036\024\030-\034\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\0019\021\002CA\b\021\033\005\021\021BA\t\003\005-\031\026.\0349mK\ncwnY6\021\005M1R\"\001\013\013\005U\021\021A\002;sC&$8/\003\002\030)\ta1\013]3dS\006d'\t\\8dW\"A\021\004\001BC\002\023\005!$\001\003uS\026\024X#A\016\021\005qyR\"A\017\013\003y\tQa]2bY\006L!\001I\017\003\007%sG\017\003\005#\001\t\005\t\025!\003\034\003\025!\030.\032:!\021\025!\003\001\"\001&\003\031a\024N\\5u}Q\021ae\n\t\003\037\001AQ!G\022A\002mAQ!\013\001\005R)\nabY;ti>lG+\032=ukJ,7/F\001,!\raBFL\005\003[u\021Q!\021:sCf\0042\001H\0302\023\t\001TD\001\004PaRLwN\034\t\003eUr!\001H\032\n\005Qj\022A\002)sK\022,g-\003\0027o\t11\013\036:j]\036T!\001N\017\t\013e\002A\021\t\036\002\031%\034(\t\\8dWN{G.\0333\025\rmr\024jS'P!\taB(\003\002>;\t9!i\\8mK\006t\007\"B 9\001\004\001\025!B<pe2$\007CA!H\033\005\021%BA D\025\t!U)A\005nS:,7M]1gi*\ta)A\002oKRL!\001\023\"\003\031%\023En\\2l\003\016\034Wm]:\t\013)C\004\031A\016\002\003aDQ\001\024\035A\002m\t\021!\037\005\006\035b\002\raG\001\002u\")\001\013\017a\001#\006!1/\0333f!\t\021\006,D\001T\025\t!V+\001\003vi&d'BA\003W\025\t9V)\001\bnS:,7M]1gi\032|'oZ3\n\005e\033&A\004$pe\036,G)\033:fGRLwN\034\005\0067\002!\t\005X\001\025g\"|W\017\0343TS\022,')\032*f]\022,'/\0323\025\rmjfl\0301b\021\025y$\f1\001A\021\025Q%\f1\001\034\021\025a%\f1\001\034\021\025q%\f1\001\034\021\025\001&\f1\001RQ\021Q6m\0349\021\005\021lW\"A3\013\005\031<\027A\003:fY\006,hn\0315fe*\021\001.[\001\004M6d'B\0016l\003\021iw\016Z:\013\0031\f1a\0319x\023\tqWM\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005\t\030B\001:t\003\031\031E*S#O)*\021A/Z\001\005'&$W\rC\003w\001\021\005s/A\006jgNKG-Z*pY&$GCB\036ysj\\H\020C\003@k\002\007\001\tC\003Kk\002\0071\004C\003Mk\002\0071\004C\003Ok\002\0071\004C\003Qk\002\007\021\013C\003\001\021\005s0\001\004sCJLG/\037\013\005\003\003\ti\001\005\003\002\004\005%QBAA\003\025\r\t9aQ\001\005SR,W.\003\003\002\f\005\025!AC#ok6\024\026M]5us\"9\021qB?A\002\005E\021!B:uC\016\\\007\003BA\002\003'IA!!\006\002\006\tI\021\n^3n'R\f7m\033\005\b\0033\001A\021KA\016\003-!xn\0347uSB\024u\016Z=\025\031\005u\0211EA\024\003S\tY$!\024\021\007q\ty\"C\002\002\"u\021A!\0268ji\"9\021QEA\f\001\004Y\022\001C7fi\006$\027\r^1\t\021\005=\021q\003a\001\003#A\001\"a\013\002\030\001\007\021QF\001\007a2\f\0270\032:\021\t\005=\022qG\007\003\003cQA!a\013\0024)\031\021QG\"\002\r\025tG/\033;z\023\021\tI$!\r\003\031\025sG/\033;z!2\f\0270\032:\t\021\005u\022q\003a\001\003\tq\001^8pYRL\007\017E\003\002B\005%\023'\004\002\002D)\031A+!\022\013\005\005\035\023\001\0026bm\006LA!a\023\002D\t!A*[:u\021\035\ty%a\006A\002m\n\001\"\0313wC:\034W\r\032\005\b\003'\002A\021IA+\0035A\027m\035+jY\026,e\016^5usR\0311(a\026\t\017\005\025\022\021\013a\0017!9\0211\f\001\005B\005u\023\001E2sK\006$X\rV5mK\026sG/\033;z)\031\ty&!\033\002rA!\021\021MA4\033\t\t\031GC\002\002f\021\t!\002^5mK\026tG/\033;z\023\r\t\0211\r\005\b\005e\003\031AA6!\r\t\025QN\005\004\003_\022%!B,pe2$\007bBA\023\0033\002\ra\007")
/*    */ public class Hologram extends SimpleBlock implements SpecialBlock {
/* 18 */   public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } private final int tier; public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public int tier() { return this.tier; } public Hologram(int tier) { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); SpecialBlock.class.$init$(this);
/* 19 */     if (Settings$.MODULE$.get().hologramLight()) {
/* 20 */       ModColoredLights$.MODULE$.setLightLevel(this, 15, 15, 15);
/*    */     }
/* 22 */     func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F); }
/*    */ 
/*    */   
/*    */   public Option<String>[] customTextures() {
/* 26 */     (new Option[6])[0] = 
/* 27 */       (Option)None$.MODULE$;
/* 28 */     (new Option[6])[1] = (Option)new Some((new StringBuilder()).append("HologramTop").append(BoxesRunTime.boxToInteger(tier())).toString());
/* 29 */     (new Option[6])[2] = (Option)new Some("HologramSide");
/* 30 */     (new Option[6])[3] = (Option)new Some("HologramSide");
/* 31 */     (new Option[6])[4] = (Option)new Some("HologramSide");
/* 32 */     (new Option[6])[5] = (Option)new Some("HologramSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/* 35 */   public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.DOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*    */     {  }
/*    */      }
/*    */   @SideOnly(Side.CLIENT)
/* 39 */   public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) { if (!super.shouldSideBeRendered(world, x, y, z, side)) { ForgeDirection forgeDirection = ForgeDirection.UP; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*    */       {  }
/*    */        }
/* 42 */      } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.DOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*    */     {  }
/*    */      }
/*    */    public EnumRarity rarity(ItemStack stack) {
/* 46 */     return Rarity$.MODULE$.byTier(tier());
/*    */   }
/*    */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 49 */     tooltip.addAll(Tooltip$.MODULE$.get((new StringBuilder()).append(getClass().getSimpleName()).append(BoxesRunTime.boxToInteger(tier())).toString(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 54 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Hologram createTileEntity(World world, int metadata) {
/* 56 */     return new li.cil.oc.common.tileentity.Hologram(tier());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Hologram.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */