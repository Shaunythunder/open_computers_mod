/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t5r!B\001\003\021\003Y\021!D#yi\026tG-\0323X_JdGM\003\002\004\t\005!Q\017^5m\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001\001\t\003\0315i\021A\001\004\006\035\tA\ta\004\002\016\013b$XM\0343fI^{'\017\0343\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!)!$\004C\0027\005\031R\r\037;f]\022,GM\0217pG.\f5mY3tgR\021A\004\036\t\003;yi\021!\004\004\005?5\001\001EA\nFqR,g\016Z3e\0052|7m[!dG\026\0348o\005\002\037!!A!E\bBC\002\023\0051%A\003x_JdG-F\001%!\t)3&D\001'\025\t\021sE\003\002)S\005IQ.\0338fGJ\fg\r\036\006\002U\005\031a.\032;\n\00512#\001D%CY>\0347.Q2dKN\034\b\002\003\030\037\005\003\005\013\021\002\023\002\r]|'\017\0343!\021\0259b\004\"\0011)\ta\022\007C\003#_\001\007A\005C\0034=\021\005A'\001\005hKR\024En\\2l)\t)4\b\005\0027s5\tqG\003\0029O\005)!\r\\8dW&\021!h\016\002\006\0052|7m\033\005\006yI\002\r!P\001\ta>\034\030\016^5p]B\021ABP\005\003\t\021QB\0217pG.\004vn]5uS>t\007\"B!\037\t\003\021\025\001E4fi\ncwnY6NCB\034u\016\\8s)\t\031\025\n\005\002E\0176\tQI\003\002Go\005AQ.\031;fe&\fG.\003\002I\013\nAQ*\0319D_2|'\017C\003=\001\002\007Q\bC\003L=\021\005A*\001\thKR\024En\\2l\033\026$\030\rZ1uCR\021Q\n\025\t\003#9K!a\024\n\003\007%sG\017C\003=\025\002\007Q\bC\003S=\021\0051+A\007hKR$\026\016\\3F]RLG/\037\013\003)j\003\"!\026-\016\003YS!aV\024\002\025QLG.Z3oi&$\0300\003\002Z-\nQA+\0337f\013:$\030\016^=\t\013q\n\006\031A\037\t\013IsB\021\001/\025\005Qk\006\"\0020\\\001\004y\026\001\0025pgR\004\"\001Y3\016\003\005T!AY2\002\0179,Go^8sW*\021A\rB\001\004CBL\027B\0014b\005=)eN^5s_:lWM\034;I_N$\b\"\0025\037\t\003I\027AC5t\003&\024(\t\\8dWR\021!.\034\t\003#-L!\001\034\n\003\017\t{w\016\\3b]\")Ah\032a\001{!)qN\bC\001a\006qr-\032;MS\036DGO\021:jO\"$h.Z:t\r>\0248k[=CY>\0347n\035\013\004\033F\024\b\"\002\037o\001\004i\004\"B:o\001\004i\025!D7j]\n\023\030n\0325u]\026\0348\017C\003#3\001\007A\005C\003w\033\021\rq/A\007fqR,g\016Z3e/>\024H\016\032\013\004q\n-\002CA\017z\r\021qQ\002\001>\024\005ed\002\002\003\022z\005\013\007I\021\t?\026\003u\004\"!\n@\n\005}4#!B,pe2$\007\"\003\030z\005\003\005\013\021B?\"\021\0319\022\020\"\001\002\006Q\031\0010a\002\t\r\t\n\031\0011\001~\021\035\tY!\037C\001\003\033\t1B\0317pG.,\0050[:ugR\031!.a\004\t\rq\nI\0011\001>\021\035\t\031\"\037C\001\003+\t!B\031:fC.\024En\\2l)\025Q\027qCA\r\021\031a\024\021\003a\001{!I\0211DA\t!\003\005\rA[\001\006IJ|\007o\035\005\b\003?IH\021AA\021\003q!Wm\035;s_f\024En\\2l\023:<vN\0357e!\006\024H/[1mYf$\002\"a\t\002*\0055\022q\006\t\004#\005\025\022bAA\024%\t!QK\\5u\021\035\tY#!\bA\0025\013\001\"\0328uSRL\030\n\032\005\007y\005u\001\031A\037\t\017\005E\022Q\004a\001\033\006A\001O]8he\026\0348\017C\004\0026e$\t!a\016\002\035\025DH/\0338hk&\034\bNR5sKR9!.!\017\002L\0055\003\002CA\036\003g\001\r!!\020\002\rAd\027-_3s!\021\ty$a\022\016\005\005\005#\002BA\036\003\007R1!!\022(\003\031)g\016^5us&!\021\021JA!\0051)e\016^5usBc\027-_3s\021\031a\0241\007a\001{!A\021qJA\032\001\004\t\t&\001\003tS\022,\007\003BA*\003?j!!!\026\013\007\r\t9F\003\003\002Z\005m\023AB2p[6|gNC\002\002^%\na\"\\5oK\016\024\030M\032;g_J<W-\003\003\002b\005U#A\004$pe\036,G)\033:fGRLwN\034\005\b\003KJH\021AA4\003A9W\r\036\"m_\016\\\007*\031:e]\026\0348\017\006\003\002j\005=\004cA\t\002l%\031\021Q\016\n\003\013\031cw.\031;\t\rq\n\031\0071\001>\021\035\t\031(\037C\001\003k\nAcZ3u\0052|7m\033%beZ,7\017\036'fm\026dGcA'\002x!1A(!\035A\002uBq!a\037z\t\003\ti(A\nhKR\024En\\2l\021\006\024h/Z:u)>|G\016\006\003\002\000\005=\005\003BAA\003\027k!!a!\013\t\005\025\025qQ\001\005Y\006twM\003\002\002\n\006!!.\031<b\023\021\ti)a!\003\rM#(/\0338h\021\031a\024\021\020a\001{!9\0211S=\005\002\005U\025!F2p[B,H/\032*fIN$xN\\3TS\036t\027\r\034\013\006\033\006]\025\021\024\005\007y\005E\005\031A\037\t\021\005=\023\021\023a\001\003#Bq!!(z\t\003\ty*A\fjg\ncwnY6Qe>4\030\016Z5oOB{w/\032:U_R)Q*!)\002$\"1A(a'A\002uB\001\"a\024\002\034\002\007\021\021\013\005\b\003OKH\021AAU\003]9W\r^%oI&\024Xm\031;Q_^,'\017T3wK2$v\016F\003N\003W\013i\013\003\004=\003K\003\r!\020\005\t\003\037\n)\0131\001\002R!9\021\021W=\005\002\005M\026AE7be.\024En\\2l\r>\024X\013\0353bi\026$B!a\t\0026\"1A(a,A\002uBq!!/z\t\003\tY,A\016o_RLg-\037\"m_\016\\wJ\032(fS\036D'm\034:DQ\006tw-\032\013\007\003G\ti,a0\t\rq\n9\f1\001>\021\031A\024q\027a\001k!9\0211Y=\005\002\005\025\027\001\b8pi&4\027P\0217pG.\034xJ\032(fS\036D'm\034:DQ\006tw-\032\013\007\003G\t9-!3\t\rq\n\t\r1\001>\021\031A\024\021\031a\001k!9\0211Y=\005\002\0055G\003CA\022\003\037\f\t.a5\t\rq\nY\r1\001>\021\031A\0241\032a\001k!A\021qJAf\001\004\t\t\006C\004\002Xf$\t!!7\002\025Ad\027-_!vqN3\005\f\006\005\002$\005m\027q\\Aq\021\035\ti.!6A\0025\013!!\0333\t\rq\n)\0161\001>\021\035\t\031/!6A\0025\013A\001Z1uC\"9\021q]=\005\002\005%\030\001C:fi\ncwnY6\025\013)\fY/!<\t\rq\n)\0171\001>\021\031A\024Q\035a\001k!9\021q]=\005\002\005EH#\0036\002t\006U\030q_A~\021\031a\024q\036a\001{!1\001(a<A\002UBq!!?\002p\002\007Q*\001\005nKR\fG-\031;b\021\035\ti0a<A\0025\013AA\0327bO\"9!\021A=\005\002\t\r\021!D:fi\ncwnY6U_\006K'\017F\002k\005\013Aa\001PA\000\001\004i\004b\002B\005s\022\005!1B\001\fSN\034\026\016Z3T_2LG\rF\003k\005\033\021y\001\003\004=\005\017\001\r!\020\005\t\003\037\0229\0011\001\002R!I!1C=\022\002\023\005!QC\001\025EJ,\027m\033\"m_\016\\G\005Z3gCVdG\017\n\032\026\005\t]!f\0016\003\032-\022!1\004\t\005\005;\0219#\004\002\003 )!!\021\005B\022\003%)hn\0315fG.,GMC\002\003&I\t!\"\0318o_R\fG/[8o\023\021\021ICa\b\003#Ut7\r[3dW\026$g+\031:jC:\034W\rC\003#k\002\007Q\020")
/*    */ public final class ExtendedWorld {
/*    */   public static ExtendedWorld extendedWorld(World paramWorld) {
/*    */     return ExtendedWorld$.MODULE$.extendedWorld(paramWorld);
/*    */   }
/*    */   
/*    */   public static ExtendedBlockAccess extendedBlockAccess(IBlockAccess paramIBlockAccess) {
/*    */     return ExtendedWorld$.MODULE$.extendedBlockAccess(paramIBlockAccess);
/*    */   }
/*    */   
/* 19 */   public static class ExtendedBlockAccess { public IBlockAccess world() { return this.world; } private final IBlockAccess world; public ExtendedBlockAccess(IBlockAccess world) {} public Block getBlock(BlockPosition position) {
/* 20 */       return world().func_147439_a(position.x(), position.y(), position.z());
/*    */     } public MapColor getBlockMapColor(BlockPosition position) {
/* 22 */       return getBlock(position).func_149728_f(getBlockMetadata(position));
/*    */     } public int getBlockMetadata(BlockPosition position) {
/* 24 */       return world().func_72805_g(position.x(), position.y(), position.z());
/*    */     } public TileEntity getTileEntity(BlockPosition position) {
/* 26 */       return world().func_147438_o(position.x(), position.y(), position.z());
/*    */     } public TileEntity getTileEntity(EnvironmentHost host) {
/* 28 */       return getTileEntity(BlockPosition$.MODULE$.apply(host));
/*    */     } public boolean isAirBlock(BlockPosition position) {
/* 30 */       return world().func_147437_c(position.x(), position.y(), position.z());
/*    */     } public int getLightBrightnessForSkyBlocks(BlockPosition position, int minBrightness) {
/* 32 */       return world().func_72802_i(position.x(), position.y(), position.z(), minBrightness);
/*    */     } }
/*    */   
/* 35 */   public static class ExtendedWorld extends ExtendedBlockAccess { public World world() { return (World)super.world(); } public ExtendedWorld(World world) { super((IBlockAccess)world); } public boolean blockExists(BlockPosition position) {
/* 36 */       return world().func_72899_e(position.x(), position.y(), position.z());
/*    */     }
/* 38 */     public boolean breakBlock(BlockPosition position, boolean drops) { return world().func_147480_a(position.x(), position.y(), position.z(), drops); } public boolean breakBlock$default$2() { return true; }
/*    */      public void destroyBlockInWorldPartially(int entityId, BlockPosition position, int progress) {
/* 40 */       world().func_147443_d(entityId, position.x(), position.y(), position.z(), progress);
/*    */     } public boolean extinguishFire(EntityPlayer player, BlockPosition position, ForgeDirection side) {
/* 42 */       return world().func_72886_a(player, position.x(), position.y(), position.z(), side.ordinal());
/*    */     } public float getBlockHardness(BlockPosition position) {
/* 44 */       return getBlock(position).func_149712_f(world(), position.x(), position.y(), position.z());
/*    */     } public int getBlockHarvestLevel(BlockPosition position) {
/* 46 */       return getBlock(position).getHarvestLevel(getBlockMetadata(position));
/*    */     } public String getBlockHarvestTool(BlockPosition position) {
/* 48 */       return getBlock(position).getHarvestTool(getBlockMetadata(position));
/*    */     }
/*    */     public int computeRedstoneSignal(BlockPosition position, ForgeDirection side) {
/* 51 */       return package$.MODULE$.max(ExtendedWorld$.MODULE$.extendedWorld(world()).isBlockProvidingPowerTo(position.offset(side), side), ExtendedWorld$.MODULE$.extendedWorld(world()).getIndirectPowerLevelTo(position.offset(side), side));
/*    */     } public int isBlockProvidingPowerTo(BlockPosition position, ForgeDirection side) {
/* 53 */       return world().func_72879_k(position.x(), position.y(), position.z(), side.ordinal());
/*    */     } public int getIndirectPowerLevelTo(BlockPosition position, ForgeDirection side) {
/* 55 */       return world().func_72878_l(position.x(), position.y(), position.z(), side.ordinal());
/*    */     } public void markBlockForUpdate(BlockPosition position) {
/* 57 */       world().func_147471_g(position.x(), position.y(), position.z());
/*    */     } public void notifyBlockOfNeighborChange(BlockPosition position, Block block) {
/* 59 */       world().func_147460_e(position.x(), position.y(), position.z(), block);
/*    */     } public void notifyBlocksOfNeighborChange(BlockPosition position, Block block) {
/* 61 */       world().func_147459_d(position.x(), position.y(), position.z(), block);
/*    */     } public void notifyBlocksOfNeighborChange(BlockPosition position, Block block, ForgeDirection side) {
/* 63 */       world().func_147441_b(position.x(), position.y(), position.z(), block, side.ordinal());
/*    */     } public void playAuxSFX(int id, BlockPosition position, int data) {
/* 65 */       world().func_72926_e(id, position.x(), position.y(), position.z(), data);
/*    */     } public boolean setBlock(BlockPosition position, Block block) {
/* 67 */       return world().func_147449_b(position.x(), position.y(), position.z(), block);
/*    */     } public boolean setBlock(BlockPosition position, Block block, int metadata, int flag) {
/* 69 */       return world().func_147465_d(position.x(), position.y(), position.z(), block, metadata, flag);
/*    */     } public boolean setBlockToAir(BlockPosition position) {
/* 71 */       return world().func_147468_f(position.x(), position.y(), position.z());
/*    */     } public boolean isSideSolid(BlockPosition position, ForgeDirection side) {
/* 73 */       return world().isSideSolid(position.x(), position.y(), position.z(), side);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedWorld.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */