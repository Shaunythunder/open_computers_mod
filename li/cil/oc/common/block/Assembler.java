/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import li.cil.oc.common.block.traits.SpecialBlock;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}c\001B\001\003\0015\021\021\"Q:tK6\024G.\032:\013\005\r!\021!\0022m_\016\\'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\r\001q!\003G\016\037!\ty\001#D\001\003\023\t\t\"AA\006TS6\004H.\032\"m_\016\\\007CA\n\027\033\005!\"BA\013\003\003\031!(/Y5ug&\021q\003\006\002\r'B,7-[1m\0052|7m\033\t\003'eI!A\007\013\003\033A{w/\032:BG\016,\007\017^8s!\t\031B$\003\002\036)\tQ1\013^1uK\006;\030M]3\021\005My\022B\001\021\025\005\r9U+\023\005\006E\001!\taI\001\007y%t\027\016\036 \025\003\021\002\"a\004\001\t\013\031\002A\021K\024\002\035\r,8\017^8n)\026DH/\036:fgV\t\001\006E\002*Y9j\021A\013\006\002W\005)1oY1mC&\021QF\013\002\006\003J\024\030-\037\t\004S=\n\024B\001\031+\005\031y\005\017^5p]B\021!'\016\b\003SMJ!\001\016\026\002\rA\023X\rZ3g\023\t1tG\001\004TiJLgn\032\006\003i)BQ!\017\001\005Bi\n!C]3hSN$XM\035\"m_\016\\\027jY8ogR\0211H\020\t\003SqJ!!\020\026\003\tUs\027\016\036\005\006a\002\r\001Q\001\rS\016|gNU3hSN$XM\035\t\003\0032k\021A\021\006\003\007\022\013q\001^3yiV\024XM\003\002F\r\006A!/\0328eKJ,'O\003\002H\021\00611\r\\5f]RT!!\023&\002\0235Lg.Z2sC\032$(\"A&\002\0079,G/\003\002N\005\ni\021*S2p]J+w-[:uKJDQa\024\001\005BA\013A\"[:CY>\0347nU8mS\022$b!\025+\\A\n$\007CA\025S\023\t\031&FA\004C_>dW-\0318\t\013Us\005\031\001,\002\013]|'\017\0343\021\005]KV\"\001-\013\005UC\025B\001.Y\0051I%\t\\8dW\006\0337-Z:t\021\025af\n1\001^\003\005A\bCA\025_\023\ty&FA\002J]RDQ!\031(A\002u\013\021!\037\005\006G:\003\r!X\001\002u\")QM\024a\001M\006!1/\0333f!\t9W.D\001i\025\tI'.\001\003vi&d'BA\003l\025\ta'*\001\bnS:,7M]1gi\032|'oZ3\n\0059D'A\004$pe\036,G)\033:fGRLwN\034\005\006a\002!\t%]\001\fSN\034\026\016Z3T_2LG\r\006\004ReN$XO\036\005\006+>\004\rA\026\005\0069>\004\r!\030\005\006C>\004\r!\030\005\006G>\004\r!\030\005\006K>\004\rA\032\005\006q\002!\t%_\001\021K:,'oZ=UQJ|Wo\0325qkR,\022A\037\t\003SmL!\001 \026\003\r\021{WO\0317f\021\025q\b\001\"\021\000\003\0359W/\033+za\026,\"!!\001\023\r\005\r\021qBA\013\r\031\t)\001\001\001\002\002\taAH]3gS:,W.\0328u}%!\021\021BA\006\003)\t5o]3nE2,'\017\t\006\004\003\033!\021aB$vSRK\b/\032\t\004S\005E\021bAA\nU\t1\021I\\=SK\032\004B!a\006\002\0369!\021\021DA\016\033\005!\021bAA\007\t%!\021qDA\006\005\035)e.^7WC2D\001\"a\t\002\004\021\005\021QE\001\bgV\024G+\0379f+\t\t9C\005\004\002*\005=\0211\007\004\007\003\013\001\001!a\n\n\t\0055\022qF\001\007\0052|7m\033\021\013\t\005E\0221B\001\t\007\006$XmZ8ssB!\021QGA\035\035\021\t9\"a\016\n\t\005E\0221B\005\005\003?\ty\003C\004\002>\001!\t%a\020\002\033!\f7\017V5mK\026sG/\033;z)\r\t\026\021\t\005\b\003\007\nY\0041\001^\003!iW\r^1eCR\f\007bBA$\001\021\005\023\021J\001\021GJ,\027\r^3US2,WI\034;jif$b!a\023\002V\005u\003\003BA'\003'j!!a\024\013\007\005EC!\001\006uS2,WM\034;jifL1!AA(\021\035)\026Q\ta\001\003/\0022aVA-\023\r\tY\006\027\002\006/>\024H\016\032\005\b\003\007\n)\0051\001^\001")
/*    */ public class Assembler extends SimpleBlock implements SpecialBlock, PowerAcceptor, StateAware, GUI {
/* 13 */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public Assembler() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); SpecialBlock.class.$init$(this); PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this);
/* 14 */     ModColoredLights$.MODULE$.setLightLevel(this, 0, 3, 5); }
/*    */    public Option<String>[] customTextures() {
/* 16 */     (new Option[6])[0] = 
/* 17 */       (Option)None$.MODULE$;
/* 18 */     (new Option[6])[1] = (Option)new Some("AssemblerTop");
/* 19 */     (new Option[6])[2] = (Option)new Some("AssemblerSide");
/* 20 */     (new Option[6])[3] = (Option)new Some("AssemblerSide");
/* 21 */     (new Option[6])[4] = (Option)new Some("AssemblerSide");
/* 22 */     (new Option[6])[5] = (Option)new Some("AssemblerSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 26 */     super.func_149651_a(iconRegister);
/* 27 */     Textures$Assembler$.MODULE$.iconSideAssembling_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":AssemblerSideAssembling").toString()));
/* 28 */     Textures$Assembler$.MODULE$.iconSideOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":AssemblerSideOn").toString()));
/* 29 */     Textures$Assembler$.MODULE$.iconTopOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":AssemblerTopOn").toString()));
/*    */   }
/*    */   public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   5: astore #6
/*    */     //   7: dup
/*    */     //   8: ifnonnull -> 20
/*    */     //   11: pop
/*    */     //   12: aload #6
/*    */     //   14: ifnull -> 56
/*    */     //   17: goto -> 28
/*    */     //   20: aload #6
/*    */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   25: ifne -> 56
/*    */     //   28: aload #5
/*    */     //   30: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   33: astore #7
/*    */     //   35: dup
/*    */     //   36: ifnonnull -> 48
/*    */     //   39: pop
/*    */     //   40: aload #7
/*    */     //   42: ifnull -> 56
/*    */     //   45: goto -> 60
/*    */     //   48: aload #7
/*    */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   53: ifeq -> 60
/*    */     //   56: iconst_1
/*    */     //   57: goto -> 61
/*    */     //   60: iconst_0
/*    */     //   61: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	62	0	this	Lli/cil/oc/common/block/Assembler;
/*    */     //   0	62	1	world	Lnet/minecraft/world/IBlockAccess;
/*    */     //   0	62	2	x	I
/*    */     //   0	62	3	y	I
/*    */     //   0	62	4	z	I
/*    */     //   0	62	5	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */   }
/*    */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   5: astore #6
/*    */     //   7: dup
/*    */     //   8: ifnonnull -> 20
/*    */     //   11: pop
/*    */     //   12: aload #6
/*    */     //   14: ifnull -> 56
/*    */     //   17: goto -> 28
/*    */     //   20: aload #6
/*    */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   25: ifne -> 56
/*    */     //   28: aload #5
/*    */     //   30: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   33: astore #7
/*    */     //   35: dup
/*    */     //   36: ifnonnull -> 48
/*    */     //   39: pop
/*    */     //   40: aload #7
/*    */     //   42: ifnull -> 56
/*    */     //   45: goto -> 60
/*    */     //   48: aload #7
/*    */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   53: ifeq -> 60
/*    */     //   56: iconst_1
/*    */     //   57: goto -> 61
/*    */     //   60: iconst_0
/*    */     //   61: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	62	0	this	Lli/cil/oc/common/block/Assembler;
/*    */     //   0	62	1	world	Lnet/minecraft/world/IBlockAccess;
/*    */     //   0	62	2	x	I
/*    */     //   0	62	3	y	I
/*    */     //   0	62	4	z	I
/*    */     //   0	62	5	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */   }
/*    */   public double energyThroughput() {
/* 38 */     return Settings$.MODULE$.get().assemblerRate();
/*    */   } public GuiType.EnumVal guiType() {
/* 40 */     return GuiType$.MODULE$.Assembler();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 42 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Assembler createTileEntity(World world, int metadata) {
/* 44 */     return new li.cil.oc.common.tileentity.Assembler();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Assembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */