/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mc\001B\001\003\0015\021A\002R5tCN\034X-\0342mKJT!a\001\003\002\013\tdwnY6\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031R\001\001\b\0231m\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\t\003'Yi\021\001\006\006\003+\t\ta\001\036:bSR\034\030BA\f\025\0055\001vn^3s\003\016\034W\r\035;peB\0211#G\005\0035Q\021!b\025;bi\026\fu/\031:f!\t\031B$\003\002\036)\t\031q)V%\t\013}\001A\021\001\021\002\rqJg.\033;?)\005\t\003CA\b\001\021\025\031\003\001\"\025%\0039\031Wo\035;p[R+\007\020^;sKN,\022!\n\t\004M%ZS\"A\024\013\003!\nQa]2bY\006L!AK\024\003\013\005\023(/Y=\021\007\031bc&\003\002.O\t1q\n\035;j_:\004\"a\f\032\017\005\031\002\024BA\031(\003\031\001&/\0323fM&\0211\007\016\002\007'R\024\030N\\4\013\005E:\003\"\002\034\001\t\003:\024A\005:fO&\034H/\032:CY>\0347.S2p]N$\"\001O\036\021\005\031J\024B\001\036(\005\021)f.\033;\t\013q*\004\031A\037\002\031%\034wN\034*fO&\034H/\032:\021\005yJU\"A \013\005\001\013\025a\002;fqR,(/\032\006\003\005\016\013\001B]3oI\026\024XM\035\006\003\t\026\013aa\0317jK:$(B\001$H\003%i\027N\\3de\0064GOC\001I\003\rqW\r^\005\003\025~\022Q\"S%d_:\024VmZ5ti\026\024\b\"\002'\001\t#j\025a\003;p_2$\030\016\035\"pIf$b\001\017(T7\022t\007\"B(L\001\004\001\026\001C7fi\006$\027\r^1\021\005\031\n\026B\001*(\005\rIe\016\036\005\006).\003\r!V\001\006gR\f7m\033\t\003-fk\021a\026\006\0031\026\013A!\033;f[&\021!l\026\002\n\023R,Wn\025;bG.DQ\001X&A\002u\013a\001\0357bs\026\024\bC\0010c\033\005y&B\001/a\025\t\tW)\001\004f]RLG/_\005\003G~\023A\"\0228uSRL\b\013\\1zKJDQ!Z&A\002\031\fq\001^8pYRL\007\017E\002hY:j\021\001\033\006\003S*\fA!\036;jY*\t1.\001\003kCZ\f\027BA7i\005\021a\025n\035;\t\013=\\\005\031\0019\002\021\005$g/\0318dK\022\004\"AJ9\n\005I<#a\002\"p_2,\027M\034\005\006i\002!\t%^\001\021K:,'oZ=UQJ|Wo\0325qkR,\022A\036\t\003M]L!\001_\024\003\r\021{WO\0317f\021\025Q\b\001\"\021|\003\0359W/\033+za\026,\022\001 \n\006{\006\035\021Q\002\004\005}\002\001AP\001\007=e\0264\027N\\3nK:$h(\003\003\002\002\005\r\021!\004#jg\006\0348/Z7cY\026\024\bEC\002\002\006\021\tqaR;j)f\004X\rE\002'\003\023I1!a\003(\005\031\te.\037*fMB!\021qBA\013\035\021\t\t\"a\005\016\003\021I1!!\002\005\023\021\t9\"a\001\003\017\025sW/\034,bY\"9\0211D?\005\002\005u\021aB:vERK\b/Z\013\003\003?\021b!!\t\002\b\005-b!\002@\001\001\005}\021\002BA\023\003O\taA\0217pG.\004#\002BA\025\003\007\t\001bQ1uK\036|'/\037\t\005\003[\t\tD\004\003\002\020\005=\022\002BA\025\003\007IA!a\006\002(!9\021Q\007\001\005B\005]\022!\0045bgRKG.Z#oi&$\030\020F\002q\003sAaaTA\032\001\004\001\006bBA\037\001\021\005\023qH\001\021GJ,\027\r^3US2,WI\034;jif$b!!\021\002L\005e\003\003BA\"\003\023j!!!\022\013\007\005\035C!\001\006uS2,WM\034;jifL1!AA#\021!\ti%a\017A\002\005=\023!B<pe2$\007\003BA)\003+j!!a\025\013\007\0055S)\003\003\002X\005M#!B,pe2$\007BB(\002<\001\007\001\013")
/*    */ public class Disassembler extends SimpleBlock implements PowerAcceptor, StateAware, GUI {
/* 13 */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public Disassembler() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this); } public Option<String>[] customTextures() {
/* 14 */     (new Option[6])[0] = 
/* 15 */       (Option)None$.MODULE$;
/* 16 */     (new Option[6])[1] = (Option)new Some("DisassemblerTop");
/* 17 */     (new Option[6])[2] = (Option)new Some("DisassemblerSide");
/* 18 */     (new Option[6])[3] = (Option)new Some("DisassemblerSide");
/* 19 */     (new Option[6])[4] = (Option)new Some("DisassemblerSide");
/* 20 */     (new Option[6])[5] = (Option)new Some("DisassemblerSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 24 */     super.func_149651_a(iconRegister);
/* 25 */     Textures$Disassembler$.MODULE$.iconSideOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":DisassemblerSideOn").toString()));
/* 26 */     Textures$Disassembler$.MODULE$.iconTopOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":DisassemblerTopOn").toString()));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 32 */     tooltip.addAll(Tooltip$.MODULE$.get(getClass().getSimpleName(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger((int)(Settings$.MODULE$.get().disassemblerBreakChance() * 100)).toString() })));
/*    */   }
/*    */ 
/*    */   
/*    */   public double energyThroughput() {
/* 37 */     return Settings$.MODULE$.get().disassemblerRate();
/*    */   } public GuiType.EnumVal guiType() {
/* 39 */     return GuiType$.MODULE$.Disassembler();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 41 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Disassembler createTileEntity(World world, int metadata) {
/* 43 */     return new li.cil.oc.common.tileentity.Disassembler();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Disassembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */