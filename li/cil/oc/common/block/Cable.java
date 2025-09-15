/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import li.cil.oc.common.block.traits.CustomDrops;
/*     */ import li.cil.oc.common.block.traits.SpecialBlock;
/*     */ import li.cil.oc.common.tileentity.Cable;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function0;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.Null$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\035b\001B\001\003\0015\021QaQ1cY\026T!a\001\003\002\013\tdwnY6\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0231A\021q\002E\007\002\005%\021\021C\001\002\f'&l\007\017\\3CY>\0347\016\005\002\024-5\tAC\003\002\026\005\0051AO]1jiNL!a\006\013\003\031M\003XmY5bY\ncwnY6\021\007MI2$\003\002\033)\tY1)^:u_6$%o\0349t!\tar$D\001\036\025\tqB!\001\006uS2,WM\034;jifL!!A\017\t\021\005\002!Q1A\005\024\t\nq\001^5mKR\013w-F\001$!\r!\023fG\007\002K)\021aeJ\001\be\0264G.Z2u\025\005A\023!B:dC2\f\027B\001\026&\005!\031E.Y:t)\006<\007\002\003\027\001\005\003\005\013\021B\022\002\021QLG.\032+bO\002BQA\f\001\005\002=\na\001P5oSRtD#\001\031\025\005E\022\004CA\b\001\021\025\tS\006q\001$\021\035!\004A1A\005\002U\n1&S7nS\nL7/T5de>\024Gn\\2lg~#&/\0318tM>\024X.\0312mK\ncwnY6NCJ\\WM]\013\002mA\021q\007O\007\002O%\021\021h\n\002\005\035VdG\016\003\004<\001\001\006IAN\001-\0236l\027NY5t\033&\034'o\0342m_\016\\7o\030+sC:\034hm\034:nC\ndWM\0217pG.l\025M]6fe\002Bq!\020\001A\002\023\005a(A\fd_2|'/T;mi&\004H.[3s\037Z,'O]5eKV\tq\bE\0028\001\nK!!Q\024\003\r=\003H/[8o!\t94)\003\002EO\t\031\021J\034;\t\017\031\003\001\031!C\001\017\006Y2m\0347pe6+H\016^5qY&,'o\024<feJLG-Z0%KF$\"\001S&\021\005]J\025B\001&(\005\021)f.\033;\t\0171+\025\021!a\001\005\031\001\020J\031\t\r9\003\001\025)\003@\003a\031w\016\\8s\033VdG/\0339mS\026\024xJ^3se&$W\r\t\005\006!\002!\t&U\001\017GV\034Ho\\7UKb$XO]3t+\005\021\006cA\034T+&\021Ak\n\002\006\003J\024\030-\037\t\004o\0013\006CA,[\035\t9\004,\003\002ZO\0051\001K]3eK\032L!a\027/\003\rM#(/\0338h\025\tIv\005C\003_\001\021\005s,\001\nsK\036L7\017^3s\0052|7m[%d_:\034HC\001%a\021\025\tW\f1\001c\0031I7m\0348SK\036L7\017^3s!\t\031g.D\001e\025\t)g-A\004uKb$XO]3\013\005\035D\027\001\003:f]\022,'/\032:\013\005%T\027AB2mS\026tGO\003\002lY\006IQ.\0338fGJ\fg\r\036\006\002[\006\031a.\032;\n\005=$'!D%JG>t'+Z4jgR,'\017\013\003^cvt\bC\001:|\033\005\031(B\001;v\003)\021X\r\\1v]\016DWM\035\006\003m^\f1AZ7m\025\tA\0300\001\003n_\022\034(\"\001>\002\007\r\004x/\003\002}g\nA1+\0333f\037:d\0270A\003wC2,X\rJ\001\000\023\021\t\t!a\001\002\r\rc\025*\022(U\025\r\t)a]\001\005'&$W\rC\004\002\n\001!\t%a\003\002\037\r|Gn\034:Nk2$\030\016\0357jKJ$\022BQA\007\0037\ty\"a\t\t\021\005=\021q\001a\001\003#\tQa^8sY\022\004B!a\005\002\0305\021\021Q\003\006\004\003\037Q\027\002BA\r\003+\021A\"\023\"m_\016\\\027iY2fgNDq!!\b\002\b\001\007!)A\001y\021\035\t\t#a\002A\002\t\013\021!\037\005\b\003K\t9\0011\001C\003\005Q\bbBA\025\001\021\005\0231F\001\025g\"|W\017\0343TS\022,')\032*f]\022,'/\0323\025\031\0055\0221GA\033\003o\tI$a\017\021\007]\ny#C\002\0022\035\022qAQ8pY\026\fg\016\003\005\002\020\005\035\002\031AA\t\021\035\ti\"a\nA\002\tCq!!\t\002(\001\007!\tC\004\002&\005\035\002\031\001\"\t\021\005u\022q\005a\001\003\tAa]5eKB!\021\021IA'\033\t\t\031E\003\003\002F\005\035\023\001B;uS2T1!BA%\025\r\tY\005\\\001\017[&tWm\031:bMR4wN]4f\023\021\ty%a\021\003\035\031{'oZ3ESJ,7\r^5p]\"9\0211\013\001\005B\005U\023aC5t'&$WmU8mS\022$B\"!\f\002X\005e\0231LA/\003?B\001\"a\004\002R\001\007\021\021\003\005\b\003;\t\t\0061\001C\021\035\t\t#!\025A\002\tCq!!\n\002R\001\007!\t\003\005\002>\005E\003\031AA \021\035\t\031\007\001C!\003K\nAbZ3u!&\0347N\0217pG.$B\"a\032\002t\005\005\025\021RAF\003\033\003B!!\033\002p5\021\0211\016\006\004\003[R\027\001B5uK6LA!!\035\002l\tI\021\n^3n'R\f7m\033\005\t\003k\n\t\0071\001\002x\0051A/\031:hKR\004B!!\037\002~5\021\0211\020\006\004\003\013R\027\002BA@\003w\022A#T8wS:<wJ\0316fGR\004vn]5uS>t\007\002CA\b\003C\002\r!a!\021\t\005M\021QQ\005\005\003\017\013)BA\003X_JdG\rC\004\002\036\005\005\004\031\001\"\t\017\005\005\022\021\ra\001\005\"9\021QEA1\001\004\021\005bBAI\001\021\005\0231S\001\016Q\006\034H+\0337f\013:$\030\016^=\025\t\0055\022Q\023\005\b\003/\013y\t1\001C\003!iW\r^1eCR\f\007bBAN\001\021\005\023QT\001\021GJ,\027\r^3US2,WI\034;jif$RaGAP\003CC\001\"a\004\002\032\002\007\0211\021\005\b\003/\013I\n1\001C\021\035\t)\013\001C!\003O\013Qc\0348OK&<\007NY8s\0052|7m[\"iC:<W\rF\006I\003S\013Y+!,\0020\006E\006\002CA\b\003G\003\r!a!\t\017\005u\0211\025a\001\005\"9\021\021EAR\001\004\021\005bBA\023\003G\003\rA\021\005\b\007\005\r\006\031AAZ!\021\t),!/\016\005\005]&BA\002k\023\021\tY,a.\003\013\tcwnY6\t\017\005}\006\001\"\025\002B\006aBm\\*fi\ncwnY6C_VtGm\035\"bg\026$wJ\\*uCR,G#\003%\002D\006\025\027qYAe\021!\ty!!0A\002\005E\001bBA\017\003{\003\rA\021\005\b\003C\ti\f1\001C\021\035\t)#!0A\002\tCq!!4\001\t\003\ny-A\fbI\022\034u\016\0347jg&|gNQ8yKN$v\016T5tiRy\001*!5\002T\006U\027q[Am\003G\024i\001\003\005\002\020\005-\007\031AAB\021\035\ti\"a3A\002\tCq!!\t\002L\002\007!\tC\004\002&\005-\007\031\001\"\t\021\005m\0271\032a\001\003;\f\021\"\0328uSRL(i\034=\021\t\005e\024q\\\005\005\003C\fYHA\007Bq&\034\030\t\\5h]\026$'I\021\005\t\003K\fY\r1\001\002h\006)!m\034=fgB\"\021\021^A~!\031\tY/a=\002x6\021\021Q\036\006\005\003\013\nyO\003\002\002r\006!!.\031<b\023\021\t)0!<\003\t1K7\017\036\t\005\003s\fY\020\004\001\005\031\005u\0301]A\001\002\003\025\t!a@\003\007}#\023'\005\003\003\002\t\035\001cA\034\003\004%\031!QA\024\003\0179{G\017[5oOB\031qG!\003\n\007\t-qEA\002B]fD\001Ba\004\002L\002\007!\021C\001\007K:$\030\016^=\021\t\tM!qC\007\003\005+Q1Aa\004k\023\021\021IB!\006\003\r\025sG/\033;z\021\035\021i\002\001C)\005?\tA\002Z8DkN$x.\\%oSR$r\001\023B\021\005K\021y\003C\004\003$\tm\001\031A\016\002\025QLG.Z#oi&$\030\020\003\005\003(\tm\001\031\001B\025\003\031\001H.Y=feB!!1\003B\026\023\021\021iC!\006\003!\025sG/\033;z\031&4\030N\\4CCN,\007\002\003B\031\0057\001\r!a\032\002\013M$\030mY6\t\017\tU\002\001\"\025\0038\005iAm\\\"vgR|W\016\022:paN$r\001\023B\035\005w\0219\005C\004\003$\tM\002\031A\016\t\021\t\035\"1\007a\001\005{\001BAa\020\003D5\021!\021\t\006\005\005O\021)\"\003\003\003F\t\005#\001D#oi&$\030\020\0257bs\026\024\b\002\003B%\005g\001\r!!\f\002\027]LG\016\034%beZ,7\017\036\005\017\005\033\002\001\023aA\001\002\023%!q\nB-\003U\031X\017]3sI\r|Gn\034:Nk2$\030\016\0357jKJ$\022B\021B)\005'\022)Fa\026\t\021\005=!1\na\001\003#Aq!!\b\003L\001\007!\tC\004\002\"\t-\003\031\001\"\t\017\005\025\"1\na\001\005&\031\021\021\002\t\b\017\tu#\001#\001\003`\005)1)\0312mKB\031qB!\031\007\r\005\021\001\022\001B2'\021\021\tG!\032\021\007]\0229'C\002\003j\035\022a!\0218z%\0264\007b\002\030\003b\021\005!Q\016\013\003\005?B!B!\035\003b\t\007IQ\002B:\003\ri\025JT\013\003\005kz!Aa\036!\021}B\016\001\001\001\001\001\001A\021Ba\037\003b\001\006iA!\036\002\t5Ke\n\t\005\013\005\022\tG1A\005\016\t\005\025aA'B1V\021!1Q\b\003\005\013\003\003b\020s\001\001\001\001\001\001\001\005\n\005\023\023\t\007)A\007\005\007\013A!T!YA!Q!Q\022B1\005\004%)Aa$\002\r\r,g\016^3s+\t\ti\016C\005\003\024\n\005\004\025!\004\002^\00691-\0328uKJ\004\003B\003BL\005C\022\r\021\"\002\003\032\006Y1-Y2iK\022\004\026M\035;t+\t\021Y\n\005\0038'\006u\007\"\003BP\005C\002\013Q\002BN\0031\031\027m\0315fIB\013'\017^:!\021)\021\031K!\031C\002\023\005!\021T\001\rG\006\034\007.\0323C_VtGm\035\005\n\005O\023\t\007)A\005\0057\013QbY1dQ\026$'i\\;oIN\004\003\002\003BV\005C\"\tA!,\002\0239,\027n\0325c_J\034H#\003\"\0030\nE&1\027B[\021!\tyA!+A\002\005E\001bBA\017\005S\003\rA\021\005\b\003C\021I\0131\001C\021\035\t)C!+A\002\tC\001B!/\003b\021\005!1X\001\007E>,h\016Z:\025\025\005u'Q\030B`\005\003\024\031\r\003\005\002\020\t]\006\031AA\t\021\035\tiBa.A\002\tCq!!\t\0038\002\007!\tC\004\002&\t]\006\031\001\"\t\021\t\035'\021\rC\001\005\023\fQ\001]1siN$R\002\023Bf\005\033\024yM!5\003T\nU\007\002CA\b\005\013\004\r!!\005\t\017\005u!Q\031a\001\005\"9\021\021\005Bc\001\004\021\005bBA\023\005\013\004\rA\021\005\t\0037\024)\r1\001\002^\"A\021Q\035Bc\001\004\0219\016\005\004\002l\006M\030Q\034\005\t\0057\024\t\007\"\003\003^\006q\001.Y:OKR<xN]6O_\022,GCBA\027\005?\024Y\017\003\005\003$\te\007\031\001Bq!\021\021\031Oa:\016\005\t\025(B\001\020k\023\021\021IO!:\003\025QKG.Z#oi&$\030\020\003\005\002>\te\007\031AA \021!\021yO!\031\005\n\tE\030\001\0055bg6+H\016^5QCJ$hj\0343f)\021\tiCa=\t\021\t\r\"Q\036a\001\005CD\001Ba>\003b\021%!\021`\001\013G\006\024G.Z\"pY>\024Hc\001\"\003|\"A!1\005B{\001\004\021\t\017\003\005\003\000\n\005D\021BB\001\0035\031\027M\0317f\007>dwN\035$N!R\031!ia\001\t\021\t\r\"Q a\001\005CD\001ba\002\003b\021%1\021B\001\027G\006t7i\0348oK\016$()Y:fI>s7i\0347peR1\021QFB\006\007\037A\001b!\004\004\006\001\007!\021]\001\004i\026\f\004\002CB\t\007\013\001\rA!9\002\007Q,'\007\003\005\004\026\t\005D\021BB\f\003U\031\027M\\\"p]:,7\r\036$s_6\034\026\016Z3G\033B#b!!\f\004\032\rm\001\002\003B\022\007'\001\rA!9\t\021\005u21\003a\001\003A\001ba\b\003b\021%1\021E\001\025G\006t7i\0348oK\016$hI]8n'&$W-S'\025\r\005521EB\023\021!\021\031c!\bA\002\t\005\b\002CA\037\007;\001\r!a\020")
/*     */ public class Cable implements SpecialBlock, CustomDrops<Cable> {
/*     */   private final ClassTag<Cable> tileTag;
/*     */   private final Null$ ImmibisMicroblocks_TransformableBlockMarker;
/*     */   private Option<Object> colorMultiplierOverride;
/*     */   
/*  34 */   public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) { return CustomDrops.class.getDrops(this, world, x, y, z, metadata, fortune); } public void func_149725_f(World world, int x, int y, int z, int metadata) { CustomDrops.class.onBlockPreDestroy(this, world, x, y, z, metadata); } public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) { return CustomDrops.class.removedByPlayer(this, world, player, x, y, z, willHarvest); } public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) { CustomDrops.class.onBlockPlacedBy(this, world, x, y, z, player, stack); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public ClassTag<Cable> tileTag() { return this.tileTag; } public Cable(ClassTag<Cable> tileTag) { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); SpecialBlock.class.$init$(this); CustomDrops.class.$init$(this);
/*  35 */     func_149713_g(0);
/*     */ 
/*     */     
/*  38 */     this.ImmibisMicroblocks_TransformableBlockMarker = null;
/*     */ 
/*     */     
/*  41 */     this.colorMultiplierOverride = (Option<Object>)None$.MODULE$; } public Null$ ImmibisMicroblocks_TransformableBlockMarker() { return null; } public Option<Object> colorMultiplierOverride() { return this.colorMultiplierOverride; } public void colorMultiplierOverride_$eq(Option<Object> x$1) { this.colorMultiplierOverride = x$1; }
/*     */    public Option<String>[] customTextures() {
/*  43 */     (new Option[6])[0] = 
/*  44 */       (Option)new Some("CablePart");
/*  45 */     (new Option[6])[1] = (Option)new Some("CablePart");
/*  46 */     (new Option[6])[2] = (Option)new Some("CablePart");
/*  47 */     (new Option[6])[3] = (Option)new Some("CablePart");
/*  48 */     (new Option[6])[4] = (Option)new Some("CablePart");
/*  49 */     (new Option[6])[5] = (Option)new Some("CablePart");
/*     */     return (Option<String>[])new Option[6];
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/*  54 */     super.func_149651_a(iconRegister);
/*  55 */     Textures$Cable$.MODULE$.iconCap_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":CableCap").toString()));
/*     */   }
/*     */   
/*     */   public int func_149720_d(IBlockAccess world, int x, int y, int z) {
/*  59 */     return BoxesRunTime.unboxToInt(colorMultiplierOverride().getOrElse((Function0)new Cable$$anonfun$colorMultiplier$1(this, world, x, y, z))); } public final class Cable$$anonfun$colorMultiplier$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IBlockAccess world$2; public final int apply() { return apply$mcI$sp(); } private final int x$5; private final int y$2; private final int z$2; public int apply$mcI$sp() { return this.$outer.li$cil$oc$common$block$Cable$$super$colorMultiplier(this.world$2, this.x$5, this.y$2, this.z$2); }
/*     */      public Cable$$anonfun$colorMultiplier$1(Cable $outer, IBlockAccess world$2, int x$5, int y$2, int z$2) {} } public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  61 */     return true;
/*     */   } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  63 */     return false;
/*     */   }
/*     */   
/*     */   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
/*     */     ItemStack itemStack;
/*  68 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  69 */     if (tileEntity instanceof Cable) { Cable cable = (Cable)tileEntity; itemStack = cable.createItemStack(); }
/*  70 */     else { itemStack = null; }
/*     */     
/*     */     return itemStack;
/*     */   }
/*     */   public boolean hasTileEntity(int metadata) {
/*  75 */     return true;
/*     */   } public Cable createTileEntity(World world, int metadata) {
/*  77 */     return new Cable();
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149695_a(World world, int x, int y, int z, Block block) {
/*  82 */     world.func_147471_g(x, y, z);
/*  83 */     super.func_149695_a(world, x, y, z, block);
/*     */   }
/*     */   
/*     */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
/*  87 */     setBlockBounds(Cable$.MODULE$.bounds(world, x, y, z));
/*     */   }
/*     */   
/*     */   public void func_149743_a(World world, int x, int y, int z, AxisAlignedBB entityBox, List<AxisAlignedBB> boxes, Entity entity) {
/*  91 */     Cable$.MODULE$.parts((IBlockAccess)world, x, y, z, entityBox, boxes);
/*     */   }
/*     */   
/*     */   public void doCustomInit(Cable tileEntity, EntityLivingBase player, ItemStack stack) {
/*  95 */     CustomDrops.class.doCustomInit(this, (TileEntity)tileEntity, player, stack);
/*  96 */     if (!(tileEntity.world()).field_72995_K) {
/*  97 */       tileEntity.fromItemStack(stack);
/*     */     }
/*     */   }
/*     */   
/*     */   public void doCustomDrops(Cable tileEntity, EntityPlayer player, boolean willHarvest) {
/* 102 */     CustomDrops.class.doCustomDrops(this, (TileEntity)tileEntity, player, willHarvest);
/* 103 */     if (!player.field_71075_bZ.field_75098_d)
/* 104 */       func_149642_a(tileEntity.world(), tileEntity.x(), tileEntity.y(), tileEntity.z(), tileEntity.createItemStack()); 
/*     */   }
/*     */   
/*     */   public static void parts(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3, AxisAlignedBB paramAxisAlignedBB, List<AxisAlignedBB> paramList) {
/*     */     Cable$.MODULE$.parts(paramIBlockAccess, paramInt1, paramInt2, paramInt3, paramAxisAlignedBB, paramList);
/*     */   }
/*     */   
/*     */   public static AxisAlignedBB bounds(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3) {
/*     */     return Cable$.MODULE$.bounds(paramIBlockAccess, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public static int neighbors(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3) {
/*     */     return Cable$.MODULE$.neighbors(paramIBlockAccess, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public static AxisAlignedBB[] cachedBounds() {
/*     */     return Cable$.MODULE$.cachedBounds();
/*     */   }
/*     */   
/*     */   public static AxisAlignedBB[] cachedParts() {
/*     */     return Cable$.MODULE$.cachedParts();
/*     */   }
/*     */   
/*     */   public static AxisAlignedBB center() {
/*     */     return Cable$.MODULE$.center();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Cable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */