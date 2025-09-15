/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.traits.BundledRedstoneAware;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @Interface(iface = "powercrystals.minefactoryreloaded.api.rednet.IRedNetOmniNode", modid = "MineFactoryReloaded")
/*    */ @ScalaSignature(bytes = "\006\001\005Ud!B\001\003\003\003i!!\004*fIN$xN\\3Bo\006\024XM\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035I\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\t\003'qi\021\001\006\006\003+Y\taA]3e]\026$(BA\f\031\003\r\t\007/\033\006\0033i\t1#\\5oK\032\f7\r^8ssJ,Gn\\1eK\022T\021aG\001\016a><XM]2ssN$\030\r\\:\n\005u!\"aD%SK\022tU\r^(n]&tu\016Z3\t\013}\001A\021\001\021\002\rqJg.\033;?)\005\t\003CA\b\001\021\025\031\003\001\"\021%\0035A\027m\035+jY\026,e\016^5usR\021Qe\013\t\003M%j\021a\n\006\002Q\005)1oY1mC&\021!f\n\002\b\005>|G.Z1o\021\025a#\0051\001.\003!iW\r^1eCR\f\007C\001\024/\023\tysEA\002J]RDQ!\r\001\005BI\nqbY1o!J|g/\0333f!><XM\035\013\002K!)A\007\001C!k\005\0212-\0318D_:tWm\031;SK\022\034Ho\0348f)\031)c'Q\"F\017\")qg\ra\001q\005)qo\034:mIB\021\021hP\007\002u)\021qg\017\006\003yu\n\021\"\\5oK\016\024\030M\032;\013\003y\n1A\\3u\023\t\001%H\001\007J\0052|7m[!dG\026\0348\017C\003Cg\001\007Q&A\001y\021\025!5\0071\001.\003\005I\b\"\002$4\001\004i\023!\001>\t\013!\033\004\031A%\002\tMLG-\032\t\003\025Bk\021a\023\006\003\0316\013A!\036;jY*\021QA\024\006\003\037v\na\"\\5oK\016\024\030M\032;g_J<W-\003\002R\027\nqai\034:hK\022K'/Z2uS>t\007\"B*\001\t\003\"\026\001F5t!J|g/\0333j]\036<V-Y6Q_^,'\017\006\004.+Z;\006,\027\005\006oI\003\r\001\017\005\006\005J\003\r!\f\005\006\tJ\003\r!\f\005\006\rJ\003\r!\f\005\006\021J\003\r!\023\005\0067\002!\t\005X\001\026_:tU-[4iE>\024(\t\\8dW\016C\027M\\4f)\031i\006\rZ3gOB\021aEX\005\003?\036\022A!\0268ji\")qG\027a\001CB\021\021HY\005\003Gj\022QaV8sY\022DQA\021.A\0025BQ\001\022.A\0025BQA\022.A\0025BQa\001.A\002!\004\"![6\016\003)T!aA\036\n\0051T'!\002\"m_\016\\\007\"\0028\001\t\003z\027!E4fi\016{gN\\3di&|g\016V=qKR1\001O^<ysj\004\"!\035;\016\003IT!a\035\013\002\031\r|gN\\3di&4\030\016^=\n\005U\024(\001\006*fI:+GoQ8o]\026\034G/[8o)f\004X\rC\0038[\002\007\021\rC\003C[\002\007Q\006C\003E[\002\007Q\006C\003G[\002\007Q\006C\003I[\002\007\021\nC\003}\001\021\005S0\001\bhKR|U\017\0369viZ\013G.^3\025\0275rx0!\001\002\004\005\025\021q\001\005\006om\004\r!\031\005\006\005n\004\r!\f\005\006\tn\004\r!\f\005\006\rn\004\r!\f\005\006\021n\004\r!\023\005\007\003\023Y\b\031A\027\002\013\r|Gn\034:\t\017\0055\001\001\"\021\002\020\005yq-\032;PkR\004X\017\036,bYV,7\017\006\007\002\022\005]\021\021DA\016\003;\ty\002\005\003'\003'i\023bAA\013O\t)\021I\035:bs\"1q'a\003A\002\005DaAQA\006\001\004i\003B\002#\002\f\001\007Q\006\003\004G\003\027\001\r!\f\005\007\021\006-\001\031A%\t\017\005\r\002\001\"\021\002&\005qqN\\%oaV$8\t[1oO\026$G#D/\002(\005%\0221FA\027\003_\t\t\004\003\0048\003C\001\r!\031\005\007\005\006\005\002\031A\027\t\r\021\013\t\0031\001.\021\0311\025\021\005a\001[!1\001*!\tA\002%Cq!a\r\002\"\001\007Q&\001\006j]B,HOV1mk\026Dq!a\016\001\t\003\nI$A\bp]&s\007/\036;t\007\"\fgnZ3e)5i\0261HA\037\003\t\t%a\021\002F!1q'!\016A\002\005DaAQA\033\001\004i\003B\002#\0026\001\007Q\006\003\004G\003k\001\r!\f\005\007\021\006U\002\031A%\t\021\005\035\023Q\007a\001\003#\t1\"\0338qkR4\026\r\\;fg\"Z\001!a\023\002j\005-\024qNA9!\021\ti%a\031\017\t\005=\023qL\007\003\003#R1!BA*\025\021\t)&a\026\002\007\031lGN\003\003\002Z\005m\023\001B7pINT!!!\030\002\007\r\004x/\003\003\002b\005E\023\001C(qi&|g.\0317\n\t\005\025\024q\r\002\n\023:$XM\0354bG\026TA!!\031\002R\005)\021NZ1dK\006\022\021QN\001=a><XM]2ssN$\030\r\\:/[&tWMZ1di>\024\030P]3m_\006$W\r\032\030ba&t#/\0323oKRt\023JU3e\035\026$x*\0348j\035>$W-A\003n_\022LG-\t\002\002t\005\031R*\0338f\r\006\034Go\034:z%\026dw.\0313fI\002")
/*    */ public abstract class RedstoneAware extends SimpleBlock implements IRedNetOmniNode {
/* 17 */   public RedstoneAware() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); } public boolean hasTileEntity(int metadata) {
/* 18 */     return true;
/*    */   }
/*    */   
/*    */   public boolean func_149744_f() {
/* 22 */     return true;
/*    */   }
/*    */   public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, ForgeDirection side) { boolean bool;
/* 25 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 26 */     if (tileEntity instanceof li.cil.oc.common.tileentity.traits.RedstoneAware) { li.cil.oc.common.tileentity.traits.RedstoneAware redstoneAware = (li.cil.oc.common.tileentity.traits.RedstoneAware)tileEntity; bool = redstoneAware.isOutputEnabled(); }
/* 27 */     else { bool = false; }
/*    */     
/*    */     return bool; }
/*    */   public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, ForgeDirection side) { int i;
/* 31 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 32 */     if (tileEntity instanceof li.cil.oc.common.tileentity.traits.RedstoneAware) { li.cil.oc.common.tileentity.traits.RedstoneAware redstoneAware = (li.cil.oc.common.tileentity.traits.RedstoneAware)tileEntity; i = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(redstoneAware.getOutput(side)), 0); }
/* 33 */     else { i = super.isProvidingWeakPower(world, x, y, z, side); }  return i; }
/*    */   public final class RedstoneAware$$anonfun$onNeighborBlockChange$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final World world$1;
/*    */     private final BlockPosition position$1; public final BundledRedstoneAware x2$1; public RedstoneAware$$anonfun$onNeighborBlockChange$1(RedstoneAware $outer, World world$1, BlockPosition position$1, BundledRedstoneAware x2$1) {} public final void apply(ForgeDirection side) { Block block = ExtendedWorld$.MODULE$.extendedWorld(this.world$1).getBlock(this.position$1.offset(side)); if (block instanceof powercrystals.minefactoryreloaded.api.rednet.IRedNetNetworkContainer) { BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 16).foreach$mVc$sp((Function1)new RedstoneAware$$anonfun$onNeighborBlockChange$1$$anonfun$apply$1(this, side)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        } public final class RedstoneAware$$anonfun$onNeighborBlockChange$1$$anonfun$apply$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/* 39 */       public static final long serialVersionUID = 0L; private final ForgeDirection side$2; public final void apply(int color) { apply$mcVI$sp(color); } public RedstoneAware$$anonfun$onNeighborBlockChange$1$$anonfun$apply$1(RedstoneAware$$anonfun$onNeighborBlockChange$1 $outer, ForgeDirection side$2) {} public void apply$mcVI$sp(int color) { this.$outer.x2$1.setRednetInput(this.side$2, color, 0); } } } public void func_149695_a(World world, int x, int y, int z, Block block) { if (Mods$.MODULE$.MineFactoryReloaded().isAvailable()) {
/* 40 */       BlockPosition position = BlockPosition$.MODULE$.apply(x, y, z);
/* 41 */       TileEntity tileEntity1 = ExtendedWorld$.MODULE$.extendedWorld(world).getTileEntity(position);
/* 42 */       if (tileEntity1 instanceof BundledRedstoneAware) { BundledRedstoneAware bundledRedstoneAware = (BundledRedstoneAware)tileEntity1; Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RedstoneAware$$anonfun$onNeighborBlockChange$1(this, world, position, bundledRedstoneAware)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         
/*    */          }
/*    */       
/*    */       else
/*    */       
/*    */       { 
/*    */         
/* 50 */         BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } 
/* 53 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 54 */     if (tileEntity instanceof li.cil.oc.common.tileentity.traits.RedstoneAware) { li.cil.oc.common.tileentity.traits.RedstoneAware redstoneAware = (li.cil.oc.common.tileentity.traits.RedstoneAware)tileEntity;
/*    */       
/* 56 */       redstoneAware.checkRedstoneInputChanged();
/*    */       
/* 58 */       Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RedstoneAware$$anonfun$onNeighborBlockChange$2(this, redstoneAware)); BoxedUnit boxedUnit = ((TileEntity)redstoneAware).canUpdate() ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 59 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      }
/*    */    public final class RedstoneAware$$anonfun$onNeighborBlockChange$2 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final li.cil.oc.common.tileentity.traits.RedstoneAware x2$2; public final void apply(ForgeDirection side) {
/*    */       this.x2$2.updateRedstoneInput(side);
/*    */     } public RedstoneAware$$anonfun$onNeighborBlockChange$2(RedstoneAware $outer, li.cil.oc.common.tileentity.traits.RedstoneAware x2$2) {} } public RedNetConnectionType getConnectionType(World world, int x, int y, int z, ForgeDirection side) {
/* 65 */     return RedNetConnectionType.CableAll;
/*    */   }
/*    */   public int getOutputValue(World world, int x, int y, int z, ForgeDirection side, int color) { boolean bool;
/* 68 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 69 */     if (tileEntity instanceof BundledRedstoneAware) { BundledRedstoneAware bundledRedstoneAware = (BundledRedstoneAware)tileEntity; bool = bundledRedstoneAware.getBundledOutput(side, color); }
/* 70 */     else { bool = false; }
/*    */     
/*    */     return bool; }
/*    */   public int[] getOutputValues(World world, int x, int y, int z, ForgeDirection side) { int[] arrayOfInt;
/* 74 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 75 */     if (tileEntity instanceof BundledRedstoneAware) { BundledRedstoneAware bundledRedstoneAware = (BundledRedstoneAware)tileEntity; arrayOfInt = bundledRedstoneAware.getBundledOutput(side); }
/* 76 */     else { arrayOfInt = (int[])Array$.MODULE$.fill(16, (Function0)new RedstoneAware$$anonfun$getOutputValues$1(this), ClassTag$.MODULE$.Int()); }  return arrayOfInt; } public final class RedstoneAware$$anonfun$getOutputValues$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; }
/*    */     
/*    */     public RedstoneAware$$anonfun$getOutputValues$1(RedstoneAware $outer) {} }
/*    */   public void onInputChanged(World world, int x, int y, int z, ForgeDirection side, int inputValue) {}
/*    */   
/*    */   public void onInputsChanged(World world, int x, int y, int z, ForgeDirection side, int[] inputValues) {
/* 82 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 83 */     if (tileEntity instanceof BundledRedstoneAware) { BundledRedstoneAware bundledRedstoneAware = (BundledRedstoneAware)tileEntity; RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 16).foreach$mVc$sp((Function1)new RedstoneAware$$anonfun$onInputsChanged$1(this, side, inputValues, bundledRedstoneAware)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     else
/*    */     
/* 86 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public final class RedstoneAware$$anonfun$onInputsChanged$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$1;
/*    */     private final int[] inputValues$1;
/*    */     private final BundledRedstoneAware x2$3;
/*    */     
/*    */     public final void apply(int color) {
/*    */       apply$mcVI$sp(color);
/*    */     }
/*    */     
/*    */     public RedstoneAware$$anonfun$onInputsChanged$1(RedstoneAware $outer, ForgeDirection side$1, int[] inputValues$1, BundledRedstoneAware x2$3) {}
/*    */     
/*    */     public void apply$mcVI$sp(int color) {
/*    */       this.x2$3.setRednetInput(this.side$1, color, this.inputValues$1[color]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\RedstoneAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */