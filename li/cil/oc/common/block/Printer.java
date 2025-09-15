/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005%b\001B\001\003\0015\021q\001\025:j]R,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\003\001\035IA2\004\005\002\020!5\t!!\003\002\022\005\tY1+[7qY\026\024En\\2l!\t\031b#D\001\025\025\t)\"!\001\004ue\006LGo]\005\003/Q\021Ab\0259fG&\fGN\0217pG.\004\"aE\r\n\005i!\"AC*uCR,\027i^1sKB\0211\003H\005\003;Q\0211aR+J\021\025y\002\001\"\001!\003\031a\024N\\5u}Q\t\021\005\005\002\020\001!)1\005\001C)I\005q1-^:u_6$V\r\037;ve\026\034X#A\023\021\007\031J3&D\001(\025\005A\023!B:dC2\f\027B\001\026(\005\025\t%O]1z!\r1CFL\005\003[\035\022aa\0249uS>t\007CA\0303\035\t1\003'\003\0022O\0051\001K]3eK\032L!a\r\033\003\rM#(/\0338h\025\t\tt\005C\0037\001\021\005s'\001\007jg\ncwnY6T_2LG\r\006\0049w\031[Uj\024\t\003MeJ!AO\024\003\017\t{w\016\\3b]\")A(\016a\001{\005)qo\034:mIB\021a\bR\007\002)\021A\b\021\006\003\003\n\013\021\"\\5oK\016\024\030M\032;\013\003\r\0131A\\3u\023\t)uH\001\007J\0052|7m[!dG\026\0348\017C\003Hk\001\007\001*A\001y!\t1\023*\003\002KO\t\031\021J\034;\t\0131+\004\031\001%\002\003eDQAT\033A\002!\013\021A\037\005\006!V\002\r!U\001\005g&$W\r\005\002S16\t1K\003\002U+\006!Q\017^5m\025\t)aK\003\002X\005\006qQ.\0338fGJ\fg\r\0364pe\036,\027BA-T\00591uN]4f\t&\024Xm\031;j_:DQa\027\001\005Bq\0131\"[:TS\022,7k\0347jIR1\001(\0300`A\006DQ\001\020.A\002uBQa\022.A\002!CQ\001\024.A\002!CQA\024.A\002!CQ\001\025.A\002ECQa\031\001\005B\021\fqaZ;j)f\004X-F\001f%\r1Gn\034\004\005O\002\001QM\001\007=e\0264\027N\\3nK:$h(\003\002jU\006A\001K]5oi\026\024\bE\003\002l\t\0059q)^5UsB,\007C\001\024n\023\tqwE\001\004B]f\024VM\032\t\003aNt!!\035:\016\003\021I!a\033\003\n\005QT'aB#ok64\026\r\034\005\006m\032$\ta^\001\bgV\024G+\0379f+\005A(cA=m}\032!q\r\001\001y\023\tYH0\001\004CY>\0347\016\t\006\003{*\f\001bQ1uK\036|'/\037\t\004\006\rab\0019\002\002%\021QP[\005\003irDq!a\002\001\t\003\nI!A\007iCN$\026\016\\3F]RLG/\037\013\004q\005-\001bBA\007\003\013\001\r\001S\001\t[\026$\030\rZ1uC\"9\021\021\003\001\005B\005M\021\001E2sK\006$X\rV5mK\026sG/\033;z)\031\t)\"a\b\002(A!\021qCA\017\033\t\tIBC\002\002\034\021\t!\002^5mK\026tG/\033;z\023\r\t\021\021\004\005\by\005=\001\031AA\021!\rq\0241E\005\004\003Ky$!B,pe2$\007bBA\007\003\037\001\r\001\023")
/*    */ public class Printer extends SimpleBlock implements SpecialBlock, StateAware, GUI {
/*  9 */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public Printer() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); SpecialBlock.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this); } public Option<String>[] customTextures() {
/* 10 */     (new Option[6])[0] = 
/* 11 */       (Option)None$.MODULE$;
/* 12 */     (new Option[6])[1] = (Option)new Some("PrinterTop");
/* 13 */     (new Option[6])[2] = (Option)new Some("PrinterSide");
/* 14 */     (new Option[6])[3] = (Option)new Some("PrinterSide");
/* 15 */     (new Option[6])[4] = (Option)new Some("PrinterSide");
/* 16 */     (new Option[6])[5] = (Option)new Some("PrinterSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/* 19 */   public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.DOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*    */     {  }
/* 21 */      } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.DOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*    */     {  }
/*    */      }
/*    */    public GuiType.EnumVal guiType() {
/* 25 */     return GuiType$.MODULE$.Printer();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 27 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Printer createTileEntity(World world, int metadata) {
/* 29 */     return new li.cil.oc.common.tileentity.Printer();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Printer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */