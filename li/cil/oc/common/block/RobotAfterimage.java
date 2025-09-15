/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import li.cil.oc.common.block.traits.SpecialBlock;
/*     */ import li.cil.oc.common.item.data.RobotData;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t-a\001B\001\003\0015\021qBU8c_R\fe\r^3sS6\fw-\032\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\0019\021\002CA\b\021\033\005\021\021BA\t\003\005-\031\026.\0349mK\ncwnY6\021\005M1R\"\001\013\013\005U\021\021A\002;sC&$8/\003\002\030)\ta1\013]3dS\006d'\t\\8dW\")\021\004\001C\0015\0051A(\0338jiz\"\022a\007\t\003\037\001A\021\"\b\001A\002\003\007I\021\002\020\002\t%\034wN\\\013\002?A\021\001eJ\007\002C)\021!eI\001\005kRLGN\003\002%K\005IQ.\0338fGJ\fg\r\036\006\002M\005\031a.\032;\n\005!\n#!B%JG>t\007\"\003\026\001\001\004\005\r\021\"\003,\003!I7m\0348`I\025\fHC\001\0273!\ti\003'D\001/\025\005y\023!B:dC2\f\027BA\031/\005\021)f.\033;\t\017MJ\023\021!a\001?\005\031\001\020J\031\t\rU\002\001\025)\003 \003\025I7m\0348!\021\0259\004\001\"\0219\003\0359W\r^%d_:$2aH\035D\021\025Qd\0071\001<\003\021\031\030\016Z3\021\005q\nU\"A\037\013\005\tr$BA\003@\025\t\001U%\001\bnS:,7M]1gi\032|'oZ3\n\005\tk$A\004$pe\036,G)\033:fGRLwN\034\005\006\tZ\002\r!R\001\t[\026$\030\rZ1uCB\021QFR\005\003\017:\0221!\0238uQ\0211\024*\026,\021\005)\033V\"A&\013\0051k\025A\003:fY\006,hn\0315fe*\021ajT\001\004M6d'B\001)R\003\021iw\016Z:\013\003I\0131a\0319x\023\t!6J\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\0059\026B\001-Z\003\031\031E*S#O)*\021!lS\001\005'&$W\rC\003]\001\021\005S,\001\nsK\036L7\017^3s\0052|7m[%d_:\034HC\001\027_\021\025y6\f1\001a\0031I7m\0348SK\036L7\017^3s!\t\t\007.D\001c\025\t\031G-A\004uKb$XO]3\013\005\0254\027\001\003:f]\022,'/\032:\013\005\035\034\023AB2mS\026tG/\003\002jE\ni\021*S2p]J+w-[:uKJDCaW%V-\")A\016\001C![\006!2\017[8vY\022\034\026\016Z3CKJ+g\016Z3sK\022$bA\\9yurt\bCA\027p\023\t\001hFA\004C_>dW-\0318\t\013I\\\007\031A:\002\013]|'\017\0343\021\005Q4X\"A;\013\005I\034\023BA<v\0051I%\t\\8dW\006\0337-Z:t\021\025I8\0161\001F\003\005A\b\"B>l\001\004)\025!A=\t\013u\\\007\031A#\002\003iDQAO6A\002mBq!!\001\001\t\003\n\031!\001\007jg\ncwnY6T_2LG\rF\006o\003\013\t9!!\003\002\f\0055\001\"\002:\000\001\004\031\b\"B=\000\001\004)\005\"B>\000\001\004)\005\"B?\000\001\004)\005\"\002\036\000\001\004Y\004bBA\t\001\021\005\0231C\001\fSN\034\026\016Z3T_2LG\rF\006o\003+\t9\"!\007\002\034\005u\001B\002:\002\020\001\0071\017\003\004z\003\037\001\r!\022\005\007w\006=\001\031A#\t\ru\fy\0011\001F\021\031Q\024q\002a\001w!9\021\021\005\001\005B\005\r\022\001D4fiBK7m\033\"m_\016\\G\003DA\023\003c\tY$a\021\002F\005\035\003\003BA\024\003[i!!!\013\013\007\005-2%\001\003ji\026l\027\002BA\030\003S\021\021\"\023;f[N#\030mY6\t\021\005M\022q\004a\001\003k\ta\001^1sO\026$\bc\001\021\0028%\031\021\021H\021\003)5{g/\0338h\037\nTWm\031;Q_NLG/[8o\021\035\021\030q\004a\001\003{\0012\001^A \023\r\t\t%\036\002\006/>\024H\016\032\005\007s\006}\001\031A#\t\rm\fy\0021\001F\021\031i\030q\004a\001\013\"9\0211\n\001\005B\0055\023A\002:be&$\030\020\006\003\002P\005U\003\003BA\024\003#JA!a\025\002*\tQQI\\;n%\006\024\030\016^=\t\021\005]\023\021\na\001\003K\tQa\035;bG.Dq!a\027\001\t\003\ni&A\003jg\006K'\017F\005o\003?\n\t'a\031\002f!1!/!\027A\002MDa!_A-\001\004)\005BB>\002Z\001\007Q\t\003\004~\0033\002\r!\022\005\b\003S\002A\021IA6\0031ygN\0217pG.\fE\rZ3e)%a\023QNA8\003c\n\031\bC\004s\003O\002\r!!\020\t\re\f9\0071\001F\021\031Y\030q\ra\001\013\"1Q0a\032A\002\025Cq!a\036\001\t\003\nI(\001\006va\022\fG/\032+jG.$2\002LA>\003{\ny(!!\002\004\"9!/!\036A\002\005u\002BB=\002v\001\007Q\t\003\004|\003k\002\r!\022\005\007{\006U\004\031A#\t\021\005\025\025Q\017a\001\003\017\0131A\0358h!\021\tI)!%\016\005\005-%b\001\022\002\016*\021\021qR\001\005U\0064\030-\003\003\002\024\006-%A\002*b]\022|W\016C\004\002\030\002!\t%!'\002\037I,Wn\034<fI\nK\b\013\\1zKJ$RB\\AN\003;\013y+!-\0024\006U\006b\002:\002\026\002\007\021Q\b\005\t\003?\013)\n1\001\002\"\0061\001\017\\1zKJ\004B!a)\002,6\021\021Q\025\006\005\003?\0139KC\002\002*\016\na!\0328uSRL\030\002BAW\003K\023A\"\0228uSRL\b\013\\1zKJDa!_AK\001\004)\005BB>\002\026\002\007Q\t\003\004~\003+\003\r!\022\005\b\003o\013)\n1\001o\003-9\030\016\0347ICJ4Xm\035;\t\017\005m\006\001\"\025\002>\006aBm\\*fi\ncwnY6C_VtGm\035\"bg\026$wJ\\*uCR,G#\003\027\002@\006\005\0271YAc\021\031\021\030\021\030a\001g\"1\0210!/A\002\025Caa_A]\001\004)\005BB?\002:\002\007Q\tC\004\002J\002!\t%a3\002!=t'\t\\8dW\006\033G/\033<bi\026$Gc\0058\002N\006=\027\021[Aj\003+\f9.!7\002d\006\035\bb\002:\002H\002\007\021Q\b\005\007s\006\035\007\031A#\t\rm\f9\r1\001F\021\031i\030q\031a\001\013\"A\021qTAd\001\004\t\t\013\003\004;\003\017\004\ra\017\005\t\0037\f9\r1\001\002^\006!\001.\033;Y!\ri\023q\\\005\004\003Ct#!\002$m_\006$\b\002CAs\003\017\004\r!!8\002\t!LG/\027\005\t\003S\f9\r1\001\002^\006!\001.\033;[\021\035\ti\017\001C\001\003_\fqBZ5oI6{g/\0338h%>\024w\016\036\013\013\003c\024\031A!\002\003\b\t%\001#B\027\002t\006]\030bAA{]\t1q\n\035;j_:\004B!!?\002\0006\021\0211 \006\004\003{$\021A\003;jY\026,g\016^5us&!!\021AA~\005\025\021vNY8u\021\031\021\0301\036a\001g\"1\0210a;A\002\025Caa_Av\001\004)\005BB?\002l\002\007Q\t")
/*     */ public class RobotAfterimage extends SimpleBlock implements SpecialBlock {
/*  23 */   public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } private IIcon icon; public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public RobotAfterimage() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); SpecialBlock.class.$init$(this);
/*  24 */     func_149713_g(0);
/*  25 */     func_149647_a(null);
/*  26 */     NEI$.MODULE$.hide(this); }
/*     */   
/*  28 */   private IIcon icon() { return this.icon; } private void icon_$eq(IIcon x$1) { this.icon = x$1; }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(ForgeDirection side, int metadata) {
/*  33 */     return icon();
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149651_a(IIconRegister iconRegister) {
/*  37 */     super.func_149651_a(iconRegister);
/*  38 */     icon_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":GenericTop").toString()));
/*     */   }
/*     */   public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  41 */     return false;
/*     */   } public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  43 */     return false;
/*     */   } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  45 */     return false;
/*     */   } public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
/*     */     ItemStack itemStack;
/*  48 */     Option<Robot> option = findMovingRobot((IBlockAccess)world, x, y, z);
/*  49 */     if (option instanceof Some) { Some some = (Some)option; Robot robot = (Robot)some.x(); itemStack = robot.info().createItemStack(); }
/*  50 */     else { itemStack = null; }
/*     */     
/*     */     return itemStack;
/*     */   }
/*     */   
/*     */   public EnumRarity rarity(ItemStack stack) {
/*  56 */     RobotData data = new RobotData(stack);
/*  57 */     return Rarity$.MODULE$.byTier(data.tier());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isAir(IBlockAccess world, int x, int y, int z) {
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149726_b(World world, int x, int y, int z) {
/*  67 */     world.func_147464_a(x, y, z, this, package$.MODULE$.max((int)(Settings$.MODULE$.get().moveDelay() * 20), 1) - 1);
/*     */   }
/*     */   
/*     */   public void func_149674_a(World world, int x, int y, int z, Random rng) {
/*  71 */     world.func_147468_f(x, y, z);
/*     */   }
/*     */   
/*     */   public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
/*  75 */     Option<Robot> option = findMovingRobot((IBlockAccess)world, x, y, z);
/*  76 */     if (option instanceof Some) { Some some = (Some)option; Robot robot = (Robot)some.x(); if (robot.isAnimatingMove() && 
/*  77 */         robot.moveFromX() == x && 
/*  78 */         robot.moveFromY() == y && 
/*  79 */         robot.moveFromZ() == z)
/*  80 */         return robot.proxy().func_145838_q().removedByPlayer(world, player, robot.x(), robot.y(), robot.z(), false);  }
/*  81 */      return super.removedByPlayer(world, player, x, y, z, willHarvest);
/*     */   }
/*     */ 
/*     */   
/*     */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
/*  86 */     Option<Robot> option = findMovingRobot(world, x, y, z);
/*  87 */     if (option instanceof Some) { Some some = (Some)option; Robot robot = (Robot)some.x();
/*  88 */       Block block = robot.func_145838_q();
/*  89 */       block.func_149719_a(world, robot.x(), robot.y(), robot.z());
/*  90 */       int dx = robot.x() - robot.moveFromX();
/*  91 */       int dy = robot.y() - robot.moveFromY();
/*  92 */       int dz = robot.z() - robot.moveFromZ();
/*  93 */       func_149676_a(
/*  94 */           (float)block.func_149704_x() + dx, 
/*  95 */           (float)block.func_149665_z() + dy, 
/*  96 */           (float)block.func_149706_B() + dz, 
/*  97 */           (float)block.func_149753_y() + dx, 
/*  98 */           (float)block.func_149669_A() + dy, 
/*  99 */           (float)block.func_149693_C() + dz); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 100 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*     */     boolean bool;
/* 105 */     Option<Robot> option = findMovingRobot((IBlockAccess)world, x, y, z);
/* 106 */     if (option instanceof Some) { Some some = (Some)option; Robot robot = (Robot)some.x(); bool = Items.get("robot").block().func_149727_a(world, robot.x(), robot.y(), robot.z(), player, side.ordinal(), hitX, hitY, hitZ); }
/* 107 */     else { bool = world.func_147468_f(x, y, z); }
/*     */     
/*     */     return bool;
/*     */   } public Option<Robot> findMovingRobot(IBlockAccess world, int x, int y, int z) {
/* 111 */     Object object = new Object(); try {
/* 112 */       Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RobotAfterimage$$anonfun$findMovingRobot$1(this, world, x, y, z, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (Option<Robot>)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     return (Option<Robot>)None$.MODULE$;
/*     */   }
/*     */   
/*     */   public final class RobotAfterimage$$anonfun$findMovingRobot$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IBlockAccess world$1;
/*     */     private final int x$2;
/*     */     private final int y$1;
/*     */     private final int z$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public RobotAfterimage$$anonfun$findMovingRobot$1(RobotAfterimage $outer, IBlockAccess world$1, int x$2, int y$1, int z$1, Object nonLocalReturnKey1$1) {}
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/*     */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(this.x$2 + side.offsetX), BoxesRunTime.boxToInteger(this.y$1 + side.offsetY), BoxesRunTime.boxToInteger(this.z$1 + side.offsetZ));
/*     */       if (tuple3 != null) {
/*     */         boolean bool;
/*     */         int tx = BoxesRunTime.unboxToInt(tuple3._1()), ty = BoxesRunTime.unboxToInt(tuple3._2()), tz = BoxesRunTime.unboxToInt(tuple3._3());
/*     */         Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(tx), BoxesRunTime.boxToInteger(ty), BoxesRunTime.boxToInteger(tz)), tuple31 = tuple32;
/*     */         int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/*     */         IBlockAccess iBlockAccess = this.world$1;
/*     */         if (iBlockAccess instanceof World) {
/*     */           World world = (World)iBlockAccess;
/*     */           bool = world.func_72899_e(i, j, k);
/*     */         } else {
/*     */           bool = this.world$1.func_147437_c(i, j, k) ? false : true;
/*     */         } 
/*     */         if (bool) {
/*     */           TileEntity tileEntity = this.world$1.func_147438_o(i, j, k);
/*     */           if (tileEntity instanceof RobotProxy) {
/*     */             RobotProxy robotProxy = (RobotProxy)tileEntity;
/*     */             if (robotProxy.robot().moveFromX() == this.x$2 && robotProxy.robot().moveFromY() == this.y$1 && robotProxy.robot().moveFromZ() == this.z$1)
/*     */               throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, new Some(robotProxy.robot())); 
/*     */           } 
/*     */           BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         } 
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\RobotAfterimage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */