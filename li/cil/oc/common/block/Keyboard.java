/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import li.cil.oc.common.block.traits.SpecialBlock;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple4;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005=g\001B\001\003\0015\021\001bS3zE>\f'\017\032\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\0019\021\002CA\b\021\033\005\021\021BA\t\003\005-\031\026.\0349mK\ncwnY6\021\005M1R\"\001\013\013\005U\021\021A\002;sC&$8/\003\002\030)\ta1\013]3dS\006d'\t\\8dW\")\021\004\001C\0015\0051A(\0338jiz\"\022a\007\t\003\037\001Aq!\b\001C\002\023\005a$A\026J[6L'-[:NS\016\024xN\0317pG.\034x\f\026:b]N4wN]7bE2,'\t\\8dW6\013'o[3s+\005y\002C\001\021$\033\005\t#\"\001\022\002\013M\034\027\r\\1\n\005\021\n#\001\002(vY2DaA\n\001!\002\023y\022\001L%n[&\024\027n]'jGJ|'\r\\8dWN|FK]1og\032|'/\\1cY\026\024En\\2l\033\006\0248.\032:!\021\025A\003\001\"\025*\0039\031Wo\035;p[R+\007\020^;sKN,\022A\013\t\004A-j\023B\001\027\"\005\025\t%O]1z!\r\001c\006M\005\003_\005\022aa\0249uS>t\007CA\0315\035\t\001#'\003\0024C\0051\001K]3eK\032L!!\016\034\003\rM#(/\0338h\025\t\031\024\005C\0039\001\021\005\023(A\006jgNKG-Z*pY&$GC\002\036>\0216{\025\013\005\002!w%\021A(\t\002\b\005>|G.Z1o\021\025qt\0071\001@\003\0259xN\0357e!\t\001e)D\001B\025\tq$I\003\002D\t\006IQ.\0338fGJ\fg\r\036\006\002\013\006\031a.\032;\n\005\035\013%\001D%CY>\0347.Q2dKN\034\b\"B%8\001\004Q\025!\001=\021\005\001Z\025B\001'\"\005\rIe\016\036\005\006\035^\002\rAS\001\002s\")\001k\016a\001\025\006\t!\020C\003So\001\0071+\001\003tS\022,\007C\001+[\033\005)&B\001,X\003\021)H/\0337\013\005\025A&BA-E\0039i\027N\\3de\0064GOZ8sO\026L!aW+\003\035\031{'oZ3ESJ,7\r^5p]\")Q\f\001C!=\006!2\017[8vY\022\034\026\016Z3CKJ+g\016Z3sK\022$bAO0aC\n\034\007\"\002 ]\001\004y\004\"B%]\001\004Q\005\"\002(]\001\004Q\005\"\002)]\001\004Q\005\"\002*]\001\004\031\006\"B3\001\t\0032\027aG:fi\ncwnY6C_VtGm\035$pe&#X-\034*f]\022,'\017\006\002hUB\021\001\005[\005\003S\006\022A!\0268ji\")1\016\032a\001\025\006AQ.\032;bI\006$\030\rC\003n\001\021\005c.A\007qe\026LE/Z7SK:$WM\035\013\003O>DQa\0337A\002)CQ!\035\001\005BI\fQ\002[1t)&dW-\0228uSRLHC\001\036t\021\025Y\007\0171\001K\021\025)\b\001\"\021w\003A\031'/Z1uKRKG.Z#oi&$\030\020\006\003xy\006\005\001C\001=|\033\005I(B\001>\005\003)!\030\016\\3f]RLG/_\005\003\003eDQA\020;A\002u\004\"\001\021@\n\005}\f%!B,pe2$\007\"B6u\001\004Q\005bBA\003\001\021\005\023qA\001\013kB$\027\r^3US\016\\GcC4\002\n\005-\021QBA\b\003#AaAPA\002\001\004i\bBB%\002\004\001\007!\n\003\004O\003\007\001\rA\023\005\007!\006\r\001\031\001&\t\021\005M\0211\001a\001\003+\t1A\0358h!\021\t9\"a\b\016\005\005e!b\001,\002\034)\021\021QD\001\005U\0064\030-\003\003\002\"\005e!A\002*b]\022|W\016C\004\002&\001!\t%a\n\002'\r\fg\016\0257bG\026\024En\\2l\037:\034\026\016Z3\025\027i\nI#a\013\002.\005=\022\021\007\005\007}\005\r\002\031A?\t\r%\013\031\0031\001K\021\031q\0251\005a\001\025\"1\001+a\tA\002)CaAUA\022\001\004\031\006bBA\033\001\021E\023qG\001\035I>\034V\r\036\"m_\016\\'i\\;oIN\024\025m]3e\037:\034F/\031;f)%9\027\021HA\036\003{\ty\004\003\004?\003g\001\ra\020\005\007\023\006M\002\031\001&\t\r9\013\031\0041\001K\021\031\001\0261\007a\001\025\"9\0211\t\001\005\n\005\025\023AD:fi\ncwnY6C_VtGm\035\013\006O\006\035\0231\n\005\b\003\023\n\t\0051\001T\003\025\001\030\016^2i\021\035\ti%!\021A\002M\0131!_1x\021\035\t\t\006\001C!\003'\nQc\0348OK&<\007NY8s\0052|7m[\"iC:<W\rF\006h\003+\n9&!\027\002\\\005u\003B\002 \002P\001\007Q\020\003\004J\003\037\002\rA\023\005\007\035\006=\003\031\001&\t\rA\013y\0051\001K\021\035\031\021q\na\001\003?\002B!!\031\002f5\021\0211\r\006\003\007\tKA!a\032\002d\t)!\t\\8dW\"9\0211\016\001\005B\0055\024\001E8o\0052|7m[!di&4\030\r^3e)MQ\024qNA9\003g\n)(a\036\002\n\006-\025QSAM\021\031q\024\021\016a\001{\"1\021*!\033A\002)CaATA5\001\004Q\005B\002)\002j\001\007!\n\003\005\002z\005%\004\031AA>\003\031\001H.Y=feB!\021QPAC\033\t\tyH\003\003\002z\005\005%bAAB\005\0061QM\034;jifLA!a\"\002\000\taQI\034;jif\004F.Y=fe\"1!+!\033A\002MC\001\"!$\002j\001\007\021qR\001\005Q&$\b\fE\002!\003#K1!a%\"\005\0251En\\1u\021!\t9*!\033A\002\005=\025\001\0025jifC\001\"a'\002j\001\007\021qR\001\005Q&$(\fC\004\002 \002!\t!!)\002\033\005$'.Y2f]\016L\030J\0344p)\031\t\031+a/\002>B!\001ELAS!%\001\023qU<\002,\006E6+C\002\002*\006\022a\001V;qY\026$\004cA\b\002.&\031\021q\026\002\003\rM\033'/Z3o!\021\t\031,a.\016\005\005U&B\001,\007\023\021\tI,!.\003\033\tcwnY6Q_NLG/[8o\021\031q\024Q\024a\001{\"A\021qXAO\001\004\t\t,\001\005q_NLG/[8o\021\035\t\031\r\001C!\003\013\f\021cZ3u-\006d\027\016\032*pi\006$\030n\0348t)%y\022qYAe\003\027\fi\r\003\004?\003\003\004\r! \005\007\023\006\005\007\031\001&\t\r9\013\t\r1\001K\021\031\001\026\021\031a\001\025\002")
/*     */ public class Keyboard extends SimpleBlock implements SpecialBlock {
/*  19 */   public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } private final Null$ ImmibisMicroblocks_TransformableBlockMarker; public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public Keyboard() { super(Material.field_151576_e); SpecialBlock.class.$init$(this);
/*  20 */     func_149713_g(0);
/*     */ 
/*     */     
/*  23 */     this.ImmibisMicroblocks_TransformableBlockMarker = null; } public Null$ ImmibisMicroblocks_TransformableBlockMarker() { return null; }
/*     */    public Option<String>[] customTextures() {
/*  25 */     (new Option[6])[0] = 
/*  26 */       (Option)new Some("Keyboard");
/*  27 */     (new Option[6])[1] = (Option)new Some("Keyboard");
/*  28 */     (new Option[6])[2] = (Option)new Some("Keyboard");
/*  29 */     (new Option[6])[3] = (Option)new Some("Keyboard");
/*  30 */     (new Option[6])[4] = (Option)new Some("Keyboard");
/*  31 */     (new Option[6])[5] = (Option)new Some("Keyboard");
/*     */     return (Option<String>[])new Option[6];
/*     */   } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  34 */     return false;
/*     */   } public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  36 */     return true;
/*     */   } public void setBlockBoundsForItemRender(int metadata) {
/*  38 */     setBlockBounds(ForgeDirection.NORTH, ForgeDirection.WEST);
/*     */   }
/*     */   public void preItemRender(int metadata) {
/*  41 */     GL11.glTranslatef(-0.75F, 0.0F, 0.0F);
/*  42 */     GL11.glScalef(1.5F, 1.5F, 1.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasTileEntity(int metadata) {
/*  47 */     return true;
/*     */   } public li.cil.oc.common.tileentity.Keyboard createTileEntity(World world, int metadata) {
/*  49 */     return new li.cil.oc.common.tileentity.Keyboard();
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149674_a(World world, int x, int y, int z, Random rng) {
/*  54 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  55 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Keyboard) { li.cil.oc.common.tileentity.Keyboard keyboard = (li.cil.oc.common.tileentity.Keyboard)tileEntity; Network.joinOrCreateNetwork((TileEntity)keyboard); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  56 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canPlaceBlockOnSide(World world, int x, int y, int z, ForgeDirection side) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_2
/*     */     //   2: aload #5
/*     */     //   4: getfield offsetX : I
/*     */     //   7: iadd
/*     */     //   8: iload_3
/*     */     //   9: aload #5
/*     */     //   11: getfield offsetY : I
/*     */     //   14: iadd
/*     */     //   15: iload #4
/*     */     //   17: aload #5
/*     */     //   19: getfield offsetZ : I
/*     */     //   22: iadd
/*     */     //   23: aload #5
/*     */     //   25: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   28: invokevirtual isSideSolid : (IIILnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   31: ifeq -> 132
/*     */     //   34: aload_1
/*     */     //   35: iload_2
/*     */     //   36: aload #5
/*     */     //   38: getfield offsetX : I
/*     */     //   41: iadd
/*     */     //   42: iload_3
/*     */     //   43: aload #5
/*     */     //   45: getfield offsetY : I
/*     */     //   48: iadd
/*     */     //   49: iload #4
/*     */     //   51: aload #5
/*     */     //   53: getfield offsetZ : I
/*     */     //   56: iadd
/*     */     //   57: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   60: astore #6
/*     */     //   62: aload #6
/*     */     //   64: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   67: ifeq -> 120
/*     */     //   70: aload #6
/*     */     //   72: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   75: astore #7
/*     */     //   77: aload #7
/*     */     //   79: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   82: aload #5
/*     */     //   84: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   87: astore #9
/*     */     //   89: dup
/*     */     //   90: ifnonnull -> 102
/*     */     //   93: pop
/*     */     //   94: aload #9
/*     */     //   96: ifnull -> 110
/*     */     //   99: goto -> 114
/*     */     //   102: aload #9
/*     */     //   104: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 114
/*     */     //   110: iconst_0
/*     */     //   111: goto -> 115
/*     */     //   114: iconst_1
/*     */     //   115: istore #8
/*     */     //   117: goto -> 123
/*     */     //   120: iconst_1
/*     */     //   121: istore #8
/*     */     //   123: iload #8
/*     */     //   125: ifeq -> 132
/*     */     //   128: iconst_1
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_0
/*     */     //   133: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #61	-> 34
/*     */     //   #62	-> 62
/*     */     //   #63	-> 120
/*     */     //   #61	-> 123
/*     */     //   #60	-> 128
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	134	0	this	Lli/cil/oc/common/block/Keyboard;
/*     */     //   0	134	1	world	Lnet/minecraft/world/World;
/*     */     //   0	134	2	x	I
/*     */     //   0	134	3	y	I
/*     */     //   0	134	4	z	I
/*     */     //   0	134	5	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */   }
/*     */ 
/*     */   
/*     */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
/*  68 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  69 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Keyboard) { li.cil.oc.common.tileentity.Keyboard keyboard = (li.cil.oc.common.tileentity.Keyboard)tileEntity; setBlockBounds(keyboard.pitch(), keyboard.yaw()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  70 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } private void setBlockBounds(ForgeDirection pitch, ForgeDirection yaw) { boolean bool;
/*     */     Tuple2 tuple22;
/*  74 */     ForgeDirection forgeDirection = pitch;
/*  75 */     if (ForgeDirection.DOWN.equals(forgeDirection)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection)) { bool = true; } else { bool = false; }  if (bool) { tuple22 = new Tuple2(forgeDirection, yaw); }
/*  76 */     else { tuple22 = new Tuple2(yaw, ForgeDirection.UP); }
/*     */      Tuple2 tuple21 = tuple22; if (tuple21 != null) {
/*  78 */       ForgeDirection forward = (ForgeDirection)tuple21._1(), up = (ForgeDirection)tuple21._2(); Tuple2 tuple24 = new Tuple2(forward, up), tuple23 = tuple24; ForgeDirection forgeDirection1 = (ForgeDirection)tuple23._1(), forgeDirection2 = (ForgeDirection)tuple23._2(); ForgeDirection side = forgeDirection1.getRotation(forgeDirection2);
/*  79 */       float[] sizes = { 0.4375F, 0.25F, 0.4375F };
/*  80 */       float x0 = -forgeDirection2.offsetX * sizes[1] - side.offsetX * sizes[2] - forgeDirection1.offsetX * sizes[0];
/*  81 */       float x1 = forgeDirection2.offsetX * sizes[1] + side.offsetX * sizes[2] - forgeDirection1.offsetX * 0.5F;
/*  82 */       float y0 = -forgeDirection2.offsetY * sizes[1] - side.offsetY * sizes[2] - forgeDirection1.offsetY * sizes[0];
/*  83 */       float y1 = forgeDirection2.offsetY * sizes[1] + side.offsetY * sizes[2] - forgeDirection1.offsetY * 0.5F;
/*  84 */       float z0 = -forgeDirection2.offsetZ * sizes[1] - side.offsetZ * sizes[2] - forgeDirection1.offsetZ * sizes[0];
/*  85 */       float z1 = forgeDirection2.offsetZ * sizes[1] + side.offsetZ * sizes[2] - forgeDirection1.offsetZ * 0.5F;
/*  86 */       func_149676_a(
/*  87 */           package$.MODULE$.min(x0, x1) + 0.5F, package$.MODULE$.min(y0, y1) + 0.5F, package$.MODULE$.min(z0, z1) + 0.5F, 
/*  88 */           package$.MODULE$.max(x0, x1) + 0.5F, package$.MODULE$.max(y0, y1) + 0.5F, package$.MODULE$.max(z0, z1) + 0.5F);
/*     */       return;
/*     */     } 
/*     */     throw new MatchError(tuple21); } public void func_149695_a(World world, int x, int y, int z, Block block) {
/*  92 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  93 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Keyboard) { li.cil.oc.common.tileentity.Keyboard keyboard = (li.cil.oc.common.tileentity.Keyboard)tileEntity;
/*     */       
/*  95 */       world.func_147468_f(x, y, z);
/*  96 */       InventoryUtils$.MODULE$.spawnStackInWorld(BlockPosition$.MODULE$.apply(x, y, z, world), Items.get("keyboard").createItemStack(1), InventoryUtils$.MODULE$.spawnStackInWorld$default$3(), InventoryUtils$.MODULE$.spawnStackInWorld$default$4()); BoxedUnit boxedUnit = canPlaceBlockOnSide(world, x, y, z, keyboard.facing().getOpposite()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/*  98 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 102 */     Option<Tuple4<li.cil.oc.common.tileentity.Keyboard, Screen, BlockPosition, ForgeDirection>> option = adjacencyInfo(world, BlockPosition$.MODULE$.apply(x, y, z));
/* 103 */     if (option instanceof Some) { Some some = (Some)option; Tuple4 tuple4 = (Tuple4)some.x(); if (tuple4 != null) { Screen screen = (Screen)tuple4._2(); BlockPosition position = (BlockPosition)tuple4._3(); ForgeDirection facing = (ForgeDirection)tuple4._4(); return screen.rightClick(world, position.x(), position.y(), position.z(), player, facing, 0.0F, 0.0F, 0.0F, true); }
/*     */        }
/*     */     
/*     */     return false;
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
/*     */   public Option<Tuple4<li.cil.oc.common.tileentity.Keyboard, Screen, BlockPosition, ForgeDirection>> adjacencyInfo(World world, BlockPosition position) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   3: aload_1
/*     */     //   4: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   7: aload_2
/*     */     //   8: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: instanceof li/cil/oc/common/tileentity/Keyboard
/*     */     //   16: ifeq -> 393
/*     */     //   19: aload_3
/*     */     //   20: checkcast li/cil/oc/common/tileentity/Keyboard
/*     */     //   23: astore #4
/*     */     //   25: aload_2
/*     */     //   26: aload #4
/*     */     //   28: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   31: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   34: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   37: astore #6
/*     */     //   39: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   42: aload_1
/*     */     //   43: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   46: aload #6
/*     */     //   48: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: instanceof li/cil/oc/common/block/Screen
/*     */     //   58: ifeq -> 101
/*     */     //   61: aload #7
/*     */     //   63: checkcast li/cil/oc/common/block/Screen
/*     */     //   66: astore #8
/*     */     //   68: new scala/Some
/*     */     //   71: dup
/*     */     //   72: new scala/Tuple4
/*     */     //   75: dup
/*     */     //   76: aload #4
/*     */     //   78: aload #8
/*     */     //   80: aload #6
/*     */     //   82: aload #4
/*     */     //   84: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   87: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   90: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   93: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   96: astore #9
/*     */     //   98: goto -> 386
/*     */     //   101: aload #4
/*     */     //   103: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   106: astore #11
/*     */     //   108: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   111: aload #11
/*     */     //   113: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   116: ifeq -> 125
/*     */     //   119: iconst_1
/*     */     //   120: istore #12
/*     */     //   122: goto -> 145
/*     */     //   125: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   128: aload #11
/*     */     //   130: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   133: ifeq -> 142
/*     */     //   136: iconst_1
/*     */     //   137: istore #12
/*     */     //   139: goto -> 145
/*     */     //   142: iconst_0
/*     */     //   143: istore #12
/*     */     //   145: iload #12
/*     */     //   147: ifeq -> 160
/*     */     //   150: aload #4
/*     */     //   152: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   155: astore #13
/*     */     //   157: goto -> 165
/*     */     //   160: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   163: astore #13
/*     */     //   165: aload #13
/*     */     //   167: astore #10
/*     */     //   169: aload_2
/*     */     //   170: aload #10
/*     */     //   172: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   175: astore #14
/*     */     //   177: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   180: aload_1
/*     */     //   181: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   184: aload #14
/*     */     //   186: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   189: astore #15
/*     */     //   191: aload #15
/*     */     //   193: instanceof li/cil/oc/common/block/Screen
/*     */     //   196: ifeq -> 233
/*     */     //   199: aload #15
/*     */     //   201: checkcast li/cil/oc/common/block/Screen
/*     */     //   204: astore #16
/*     */     //   206: new scala/Some
/*     */     //   209: dup
/*     */     //   210: new scala/Tuple4
/*     */     //   213: dup
/*     */     //   214: aload #4
/*     */     //   216: aload #16
/*     */     //   218: aload #14
/*     */     //   220: aload #10
/*     */     //   222: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   225: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   228: astore #17
/*     */     //   230: goto -> 382
/*     */     //   233: aload #4
/*     */     //   235: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   238: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   241: astore #18
/*     */     //   243: dup
/*     */     //   244: ifnonnull -> 256
/*     */     //   247: pop
/*     */     //   248: aload #18
/*     */     //   250: ifnull -> 295
/*     */     //   253: goto -> 264
/*     */     //   256: aload #18
/*     */     //   258: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   261: ifne -> 295
/*     */     //   264: aload #4
/*     */     //   266: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   269: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   272: astore #19
/*     */     //   274: dup
/*     */     //   275: ifnonnull -> 287
/*     */     //   278: pop
/*     */     //   279: aload #19
/*     */     //   281: ifnull -> 295
/*     */     //   284: goto -> 303
/*     */     //   287: aload #19
/*     */     //   289: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   292: ifeq -> 303
/*     */     //   295: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   298: astore #17
/*     */     //   300: goto -> 382
/*     */     //   303: aload_2
/*     */     //   304: aload #10
/*     */     //   306: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   309: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   312: astore #20
/*     */     //   314: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   317: aload_1
/*     */     //   318: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   321: aload #20
/*     */     //   323: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   326: astore #21
/*     */     //   328: aload #21
/*     */     //   330: instanceof li/cil/oc/common/block/Screen
/*     */     //   333: ifeq -> 373
/*     */     //   336: aload #21
/*     */     //   338: checkcast li/cil/oc/common/block/Screen
/*     */     //   341: astore #22
/*     */     //   343: new scala/Some
/*     */     //   346: dup
/*     */     //   347: new scala/Tuple4
/*     */     //   350: dup
/*     */     //   351: aload #4
/*     */     //   353: aload #22
/*     */     //   355: aload #20
/*     */     //   357: aload #10
/*     */     //   359: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   362: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   365: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   368: astore #23
/*     */     //   370: goto -> 378
/*     */     //   373: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   376: astore #23
/*     */     //   378: aload #23
/*     */     //   380: astore #17
/*     */     //   382: aload #17
/*     */     //   384: astore #9
/*     */     //   386: aload #9
/*     */     //   388: astore #5
/*     */     //   390: goto -> 398
/*     */     //   393: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   396: astore #5
/*     */     //   398: aload #5
/*     */     //   400: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #109	-> 12
/*     */     //   #110	-> 25
/*     */     //   #111	-> 39
/*     */     //   #112	-> 53
/*     */     //   #115	-> 101
/*     */     //   #116	-> 108
/*     */     //   #117	-> 160
/*     */     //   #115	-> 165
/*     */     //   #119	-> 169
/*     */     //   #120	-> 177
/*     */     //   #121	-> 191
/*     */     //   #122	-> 233
/*     */     //   #129	-> 295
/*     */     //   #124	-> 303
/*     */     //   #125	-> 314
/*     */     //   #126	-> 328
/*     */     //   #127	-> 373
/*     */     //   #125	-> 378
/*     */     //   #122	-> 380
/*     */     //   #120	-> 382
/*     */     //   #113	-> 384
/*     */     //   #111	-> 386
/*     */     //   #109	-> 388
/*     */     //   #132	-> 393
/*     */     //   #108	-> 398
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	401	0	this	Lli/cil/oc/common/block/Keyboard;
/*     */     //   0	401	1	world	Lnet/minecraft/world/World;
/*     */     //   0	401	2	position	Lli/cil/oc/util/BlockPosition;
/*     */     //   39	349	6	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   169	215	10	forward	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   177	207	14	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   314	66	20	blockPos	Lli/cil/oc/util/BlockPosition;
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
/*     */   public Null$ getValidRotations(World world, int x, int y, int z) {
/* 135 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */