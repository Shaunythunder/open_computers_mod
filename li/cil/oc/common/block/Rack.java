/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.DoubleRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t}b\001B\001\003\0015\021AAU1dW*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M1\001A\004\n\0317y\001\"a\004\t\016\003\tI!!\005\002\003\033I+Gm\035;p]\026\fu/\031:f!\t\031b#D\001\025\025\t)\"!\001\004ue\006LGo]\005\003/Q\021Ab\0259fG&\fGN\0217pG.\004\"aE\r\n\005i!\"!\004)po\026\024\030iY2faR|'\017\005\002\0249%\021Q\004\006\002\013'R\fG/Z!xCJ,\007CA\n \023\t\001CCA\002H+&CQA\t\001\005\002\r\na\001P5oSRtD#\001\023\021\005=\001\001\"\002\024\001\t#:\023AD2vgR|W\016V3yiV\024Xm]\013\002QA\031\021\006\f\030\016\003)R\021aK\001\006g\016\fG.Y\005\003[)\022Q!\021:sCf\0042!K\0302\023\t\001$F\001\004PaRLwN\034\t\003eUr!!K\032\n\005QR\023A\002)sK\022,g-\003\0027o\t11\013\036:j]\036T!\001\016\026\t\023e\002\001\031!a\001\n\003Q\024!\0044s_:$xJ^3se&$W-F\001<!\ta4)D\001>\025\tqt(\001\003vi&d'B\001!B\003%i\027N\\3de\0064GOC\001C\003\rqW\r^\005\003\tv\022Q!S%d_:D\021B\022\001A\002\003\007I\021A$\002#\031\024xN\034;Pm\026\024(/\0333f?\022*\027\017\006\002I\027B\021\021&S\005\003\025*\022A!\0268ji\"9A*RA\001\002\004Y\024a\001=%c!1a\n\001Q!\nm\naB\032:p]R|e/\032:sS\022,\007\005C\003Q\001\021\005\023+\001\nsK\036L7\017^3s\0052|7m[%d_:\034HC\001%S\021\025\031v\n1\001U\0031I7m\0348SK\036L7\017^3s!\t)F,D\001W\025\t9\006,A\004uKb$XO]3\013\005eS\026\001\003:f]\022,'/\032:\013\005m{\024AB2mS\026tG/\003\002^-\ni\021*S2p]J+w-[:uKJDQa\030\001\005B\001\fqaZ3u\023\016|g\016F\004<C\"lw.]>\t\013\tt\006\031A2\002\013]|'\017\0343\021\005\0214W\"A3\013\005\t|\024BA4f\0051I%\t\\8dW\006\0337-Z:t\021\025Ig\f1\001k\003\005A\bCA\025l\023\ta'FA\002J]RDQA\0340A\002)\f\021!\037\005\006az\003\rA[\001\002u\")!O\030a\001g\006Qq\r\\8cC2\034\026\016Z3\021\005QLX\"A;\013\005y2(BA\003x\025\tA\030)\001\bnS:,7M]1gi\032|'oZ3\n\005i,(A\004$pe\036,G)\033:fGRLwN\034\005\006yz\003\ra]\001\nY>\034\027\r\\*jI\026DcA\030@\002\026\005]\001cA@\002\0225\021\021\021\001\006\005\003\007\t)!\001\006sK2\fWO\\2iKJTA!a\002\002\n\005\031a-\0347\013\t\005-\021QB\001\005[>$7O\003\002\002\020\005\0311\r]<\n\t\005M\021\021\001\002\t'&$Wm\0248ms\006)a/\0317vK\022\022\021\021D\005\005\0037\ti\"\001\004D\031&+e\n\026\006\005\003?\t\t!\001\003TS\022,\007bBA\022\001\021\005\023QE\001\033O\026$X*\033=fI\n\023\030n\0325u]\026\0348OR8s\0052|7m\033\013\nU\006\035\022\021FA\026\003[AaAYA\021\001\004\031\007BB5\002\"\001\007!\016\003\004o\003C\001\rA\033\005\007a\006\005\002\031\0016)\017\005\005b0!\006\002\030!9\0211\007\001\005B\005U\022\001D5t\0052|7m[*pY&$G\003DA\034\003{\ty$!\021\002D\005\025\003cA\025\002:%\031\0211\b\026\003\017\t{w\016\\3b]\"1!-!\rA\002\rDa![A\031\001\004Q\007B\0028\0022\001\007!\016\003\004q\003c\001\rA\033\005\b\003\017\n\t\0041\001t\003\021\031\030\016Z3\t\017\005-\003\001\"\021\002N\005Y\021n]*jI\026\034v\016\\5e)1\t9$a\024\002R\005M\023QKA,\021\031\021\027\021\na\001G\"1\021.!\023A\002)DaA\\A%\001\004Q\007B\0029\002J\001\007!\016C\004\002H\005%\003\031A:\t\017\005m\003\001\"\021\002^\005\001RM\\3sOf$\006N]8vO\"\004X\017^\013\003\003?\0022!KA1\023\r\t\031G\013\002\007\t>,(\r\\3\t\017\005\035\004\001\"\021\002j\0059q-^5UsB,WCAA6%\031\ti'!\037\002\000\0311\021q\016\001\001\003W\022A\002\020:fM&tW-\\3oizJA!a\035\002v\005)!+Y2lA)\031\021q\017\003\002\017\035+\030\016V=qKB\031\021&a\037\n\007\005u$F\001\004B]f\024VM\032\t\005\003\003\0139I\004\003\002\004\006\025U\"\001\003\n\007\005]D!\003\003\002\n\006U$aB#ok64\026\r\034\005\t\003\033\013i\007\"\001\002\020\00691/\0362UsB,WCAAI%\031\t\031*!\037\002\036\0321\021q\016\001\001\003#KA!a&\002\032\0061!\t\\8dW\002RA!a'\002v\005A1)\031;fO>\024\030\020\005\003\002 \006\rf\002BAA\003CKA!a'\002v%!\021\021RAM\021\035\t9\013\001C!\003S\013Q\002[1t)&dW-\0228uSRLH\003BA\034\003WCq!!,\002&\002\007!.\001\005nKR\fG-\031;b\021\035\t\t\f\001C!\003g\013\001c\031:fCR,G+\0337f\013:$\030\016^=\025\r\005U\026qXAd!\021\t9,!0\016\005\005e&bAA^\t\005QA/\0337fK:$\030\016^=\n\007\005\tI\fC\004c\003_\003\r!!1\021\007\021\f\031-C\002\002F\026\024QaV8sY\022Dq!!,\0020\002\007!\016C\005\002L\002\021\r\021\"\002\002N\006y1m\0347mSNLwN\034\"pk:$7/\006\002\002PB!\021\006LAi!\ra\0241[\005\004\003+l$!D!ySN\fE.[4oK\022\024%\t\003\005\002Z\002\001\013QBAh\003A\031w\016\0347jg&|gNQ8v]\022\034\b\005C\004\002^\002!\t&a8\002\023%tG/\032:tK\016$HCDAq\003O\fI/a;\002n\006=\030\021 \t\004y\005\r\030bAAs{\t!Rj\034<j]\036|%M[3diB{7/\033;j_:DqAYAn\001\004\t\t\r\003\004j\0037\004\rA\033\005\007]\006m\007\031\0016\t\rA\fY\0161\001k\021!\t\t0a7A\002\005M\030!B:uCJ$\bc\001\037\002v&\031\021q_\037\003\tY+7m\r\005\t\003w\fY\0161\001\002t\006\031QM\0343\t\017\005}\b\001\"\021\003\002\005\001rN\034\"m_\016\\\027i\031;jm\006$X\r\032\013\025\003o\021\031A!\002\003\b\t%!1\002B\017\005?\021IC!\f\t\017\t\fi\0201\001\002B\"1\021.!@A\002)DaA\\A\001\004Q\007B\0029\002~\002\007!\016\003\005\003\016\005u\b\031\001B\b\003\031\001H.Y=feB!!\021\003B\r\033\t\021\031B\003\003\003\016\tU!b\001B\f\0051QM\034;jifLAAa\007\003\024\taQI\034;jif\004F.Y=fe\"9\021qIA\001\004\031\b\002\003B\021\003{\004\rAa\t\002\t!LG\017\027\t\004S\t\025\022b\001B\024U\t)a\t\\8bi\"A!1FA\001\004\021\031#\001\003iSRL\006\002\003B\030\003{\004\rAa\t\002\t!LGO\027\005\b\005g\001A\021\001B\033\003\031\021x\016^1uKR1\0211\037B\034\005wA\001B!\017\0032\001\007\0211_\001\002m\"A!Q\bB\031\001\004\021\031#A\001u\001")
/*     */ public class Rack extends RedstoneAware implements SpecialBlock, PowerAcceptor, StateAware, GUI {
/*     */   private IIcon frontOverride;
/*     */   private final AxisAlignedBB[] collisionBounds;
/*     */   
/*  20 */   public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public Option<String>[] customTextures() { (new Option[6])[0] = (Option)None$.MODULE$; (new Option[6])[1] = (Option)None$.MODULE$; (new Option[6])[2] = (Option)new Some("RackSide"); (new Option[6])[3] = (Option)new Some("RackFront"); (new Option[6])[4] = (Option)new Some("RackSide"); (new Option[6])[5] = (Option)new Some("RackSide"); return (Option<String>[])new Option[6]; } public IIcon frontOverride() { return this.frontOverride; } public void frontOverride_$eq(IIcon x$1) { this.frontOverride = x$1; } public void func_149651_a(IIconRegister iconRegister) { super.func_149651_a(iconRegister); System.arraycopy(icons(), 0, Textures$Rack$.MODULE$.icons(), 0, (icons()).length); Textures$Rack$.MODULE$.diskDrive_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append("DiskDriveMountable").toString())); Textures$Rack$.MODULE$.server_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append("ServerFront").toString())); Textures$Rack$.MODULE$.terminal_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append("TerminalServerFront").toString())); } @SideOnly(Side.CLIENT) public IIcon getIcon(IBlockAccess world, int x, int y, int z, ForgeDirection globalSide, ForgeDirection localSide) { // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   5: astore #7
/*     */     //   7: dup
/*     */     //   8: ifnonnull -> 20
/*     */     //   11: pop
/*     */     //   12: aload #7
/*     */     //   14: ifnull -> 28
/*     */     //   17: goto -> 42
/*     */     //   20: aload #7
/*     */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   25: ifeq -> 42
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual frontOverride : ()Lnet/minecraft/util/IIcon;
/*     */     //   32: ifnull -> 42
/*     */     //   35: aload_0
/*     */     //   36: invokevirtual frontOverride : ()Lnet/minecraft/util/IIcon;
/*     */     //   39: goto -> 55
/*     */     //   42: aload_0
/*     */     //   43: aload_1
/*     */     //   44: iload_2
/*     */     //   45: iload_3
/*     */     //   46: iload #4
/*     */     //   48: aload #5
/*     */     //   50: aload #6
/*     */     //   52: invokespecial getIcon : (Lnet/minecraft/world/IBlockAccess;IIILnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraft/util/IIcon;
/*     */     //   55: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #42	-> 0
/*     */     //   #43	-> 42
/*     */     //   #42	-> 55
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	56	0	this	Lli/cil/oc/common/block/Rack;
/*     */     //   0	56	1	world	Lnet/minecraft/world/IBlockAccess;
/*     */     //   0	56	2	x	I
/*     */     //   0	56	3	y	I
/*     */     //   0	56	4	z	I
/*     */     //   0	56	5	globalSide	Lnet/minecraftforge/common/util/ForgeDirection;
/*  20 */     //   0	56	6	localSide	Lnet/minecraftforge/common/util/ForgeDirection; } @SideOnly(Side.CLIENT) public int func_149677_c(IBlockAccess world, int x, int y, int z) { int i; TileEntity tileEntity = world.func_147438_o(x, y, z); if (tileEntity instanceof li.cil.oc.common.tileentity.Rack) { li.cil.oc.common.tileentity.Rack rack = (li.cil.oc.common.tileentity.Rack)tileEntity; int value = brightness$1(x + (rack.facing()).offsetX, y + (rack.facing()).offsetY, z + (rack.facing()).offsetZ, world); int skyBrightness = value >> 20 & 0xF; int blockBrightness = value >> 4 & 0xF; i = skyBrightness * 3 / 4 << 20 | blockBrightness * 3 / 4 << 4; } else { i = super.func_149677_c(world, x, y, z); }  return (y >= 0 && y < world.func_72800_K()) ? i : super.func_149677_c(world, x, y, z); } private final int brightness$1(int x, int y, int z, IBlockAccess world$1) { return world$1.func_72802_i(x, y, z, world$1.func_147439_a(x, y, z).getLightValue(world$1, x, y, z)); } public Rack() { SpecialBlock.class.$init$(this); PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this);
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
/*  76 */     (new AxisAlignedBB[7])[0] = 
/*  77 */       AxisAlignedBB.func_72330_a(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);
/*  78 */     (new AxisAlignedBB[7])[1] = AxisAlignedBB.func_72330_a(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  79 */     (new AxisAlignedBB[7])[2] = AxisAlignedBB.func_72330_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
/*  80 */     (new AxisAlignedBB[7])[3] = AxisAlignedBB.func_72330_a(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);
/*  81 */     (new AxisAlignedBB[7])[4] = AxisAlignedBB.func_72330_a(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
/*  82 */     (new AxisAlignedBB[7])[5] = AxisAlignedBB.func_72330_a(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  83 */     (new AxisAlignedBB[7])[6] = AxisAlignedBB.func_72330_a(0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.9375D, 0.9375D); this.collisionBounds = new AxisAlignedBB[7]; }
/*     */   public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.SOUTH; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection)) {  }  }
/*     */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.SOUTH; if (toLocal(world, x, y, z, side) == null) { toLocal(world, x, y, z, side); if (forgeDirection != null); } else if (toLocal(world, x, y, z, side).equals(forgeDirection)) {  }  }
/*     */   public double energyThroughput() { return Settings$.MODULE$.get().serverRackRate(); }
/*  87 */   public GuiType.EnumVal guiType() { return GuiType$.MODULE$.Rack(); } public boolean hasTileEntity(int metadata) { return true; } public li.cil.oc.common.tileentity.Rack createTileEntity(World world, int metadata) { return new li.cil.oc.common.tileentity.Rack(); } public final AxisAlignedBB[] collisionBounds() { return this.collisionBounds; } public MovingObjectPosition intersect(World world, int x, int y, int z, Vec3 start, Vec3 end) { MovingObjectPosition movingObjectPosition; TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  88 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Rack) { li.cil.oc.common.tileentity.Rack rack = (li.cil.oc.common.tileentity.Rack)tileEntity;
/*  89 */       DoubleRef closestDistance = DoubleRef.create(Double.POSITIVE_INFINITY);
/*  90 */       ObjectRef closest = ObjectRef.create(None$.MODULE$);
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
/* 102 */       ForgeDirection[] facings = ForgeDirection.VALID_DIRECTIONS; RichInt$.MODULE$
/* 103 */         .until$extension0(Predef$.MODULE$.intWrapper(0), facings.length).foreach$mVc$sp((Function1)new Rack$$anonfun$intersect$1(this, x, y, z, start, end, closestDistance, closest, facings, rack));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 108 */       li$cil$oc$common$block$Rack$$intersect$1((AxisAlignedBB)Predef$.MODULE$.refArrayOps((Object[])collisionBounds()).last(), x, y, z, start, end, closestDistance, closest);
/* 109 */       movingObjectPosition = (MovingObjectPosition)((Option)closest.elem).map((Function1)new Rack$$anonfun$intersect$2(this, x, y, z)).orNull(Predef$.MODULE$.$conforms()); }
/* 110 */     else { movingObjectPosition = super.intersect(world, x, y, z, start, end); }  return movingObjectPosition; } public final void li$cil$oc$common$block$Rack$$intersect$1(AxisAlignedBB bounds, int x$1, int y$1, int z$1, Vec3 start$1, Vec3 end$1, DoubleRef closestDistance$1, ObjectRef closest$1) { MovingObjectPosition hit = bounds.func_72329_c().func_72317_d(x$1, y$1, z$1).func_72327_a(start$1, end$1); if (hit != null) { double distance = hit.field_72307_f.func_72438_d(start$1); if (distance < closestDistance$1.elem) { closestDistance$1.elem = distance; closest$1.elem = Option$.MODULE$.apply(hit); }  }  } public final class Rack$$anonfun$intersect$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int x$1; private final int y$1; private final int z$1; private final Vec3 start$1; private final Vec3 end$1; private final DoubleRef closestDistance$1; private final ObjectRef closest$1; private final ForgeDirection[] facings$1; private final li.cil.oc.common.tileentity.Rack x2$1; public final void apply(int i) { apply$mcVI$sp(i); } public Rack$$anonfun$intersect$1(Rack $outer, int x$1, int y$1, int z$1, Vec3 start$1, Vec3 end$1, DoubleRef closestDistance$1, ObjectRef closest$1, ForgeDirection[] facings$1, li.cil.oc.common.tileentity.Rack x2$1) {} public void apply$mcVI$sp(int i) { ForgeDirection forgeDirection = this.facings$1[i]; if (this.x2$1.facing() == null) { this.x2$1.facing(); if (forgeDirection != null) { this.$outer.li$cil$oc$common$block$Rack$$intersect$1(this.$outer.collisionBounds()[i], this.x$1, this.y$1, this.z$1, this.start$1, this.end$1, this.closestDistance$1, this.closest$1); return; }  } else if (!this.x2$1.facing().equals(forgeDirection)) { this.$outer.li$cil$oc$common$block$Rack$$intersect$1(this.$outer.collisionBounds()[i], this.x$1, this.y$1, this.z$1, this.start$1, this.end$1, this.closestDistance$1, this.closest$1); return; }  } } public final class Rack$$anonfun$intersect$2 extends AbstractFunction1<MovingObjectPosition, MovingObjectPosition> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int x$1; private final int y$1; private final int z$1;
/*     */     public final MovingObjectPosition apply(MovingObjectPosition hit) { return new MovingObjectPosition(this.x$1, this.y$1, this.z$1, hit.field_72310_e, hit.field_72307_f); }
/*     */     public Rack$$anonfun$intersect$2(Rack $outer, int x$1, int y$1, int z$1) {} }
/* 115 */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 116 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Rack) { li.cil.oc.common.tileentity.Rack rack = (li.cil.oc.common.tileentity.Rack)tileEntity; Option option = rack.slotAt(side, hitX, hitY, hitZ);
/* 117 */       if (option instanceof Some) { float f1; Some some = (Some)option; int slot = BoxesRunTime.unboxToInt(some.x());
/*     */         
/* 119 */         Vec3 hitVec = Vec3.func_72443_a(((int)(hitX * 16.0F) / 16.0F), ((int)(hitY * 16.0F) / 16.0F), ((int)(hitZ * 16.0F) / 16.0F));
/* 120 */         ForgeDirection forgeDirection = side;
/* 121 */         if (ForgeDirection.WEST.equals(forgeDirection)) { f1 = (float)Math.toRadians(90.0D); }
/* 122 */         else if (ForgeDirection.NORTH.equals(forgeDirection)) { f1 = (float)Math.toRadians(180.0D); }
/* 123 */         else if (ForgeDirection.EAST.equals(forgeDirection)) { f1 = (float)Math.toRadians(270.0D); }
/* 124 */         else { f1 = 0.0F; }
/*     */         
/*     */         float rotation = f1;
/* 127 */         Vec3 localHitVec = rotate(hitVec.func_72441_c(-0.46875D, -0.46875D, -0.46875D), rotation).func_72441_c(0.46875D, 0.46875D, 0.46875D);
/* 128 */         int globalX = (int)(localHitVec.field_72450_a * 16.049999237060547D);
/* 129 */         int globalY = (int)(localHitVec.field_72448_b * 16.049999237060547D);
/* 130 */         int localX = ((side.offsetX != 0) ? (15 - globalX) : globalX) - 1;
/* 131 */         int localY = 15 - globalY - 2 - 3 * slot;
/* 132 */         RackMountable rackMountable = rack.getMountable(slot);
/* 133 */         if (rackMountable != null) { RackMountable rackMountable1 = rackMountable; if (rackMountable1.onActivate(player, localX / 14.0F, localY / 3.0F)) return true;  }
/* 134 */          BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = (localX >= 0 && localX < 14 && localY >= 0 && localY < 3) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */       else
/* 136 */       { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */        BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 138 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 140 */     return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); }
/*     */ 
/*     */   
/*     */   public Vec3 rotate(Vec3 v, float t) {
/* 144 */     double cos = Math.cos(t);
/* 145 */     double sin = Math.sin(t);
/* 146 */     return Vec3.func_72443_a(v.field_72450_a * cos - v.field_72449_c * sin, v.field_72448_b, v.field_72450_a * sin + v.field_72449_c * cos);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Rack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */