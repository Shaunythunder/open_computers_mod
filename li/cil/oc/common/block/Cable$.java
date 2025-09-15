/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import codechicken.lib.vec.Cuboid6;
/*     */ import codechicken.multipart.JNormalOcclusion;
/*     */ import codechicken.multipart.PartMap;
/*     */ import codechicken.multipart.TFacePart;
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import codechicken.multipart.TileMultipart;
/*     */ import java.util.List;
/*     */ import li.cil.oc.api.network.SidedComponent;
/*     */ import li.cil.oc.api.network.SidedEnvironment;
/*     */ import li.cil.oc.common.tileentity.Cable;
/*     */ import li.cil.oc.common.tileentity.traits.ImmibisMicroblock;
/*     */ import li.cil.oc.integration.fmp.CablePart;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Function2;
/*     */ import scala.MatchError;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.Traversable;
/*     */ import scala.collection.TraversableLike;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Cable$
/*     */ {
/*     */   public static final Cable$ MODULE$;
/*     */   private final double MIN;
/*     */   private final double MAX;
/*     */   private final AxisAlignedBB center;
/*     */   private final AxisAlignedBB[] cachedParts;
/*     */   private final AxisAlignedBB[] cachedBounds;
/*     */   
/*     */   private final double MIN() {
/* 110 */     return 0.375D; } private final double MAX() {
/* 111 */     return 0.625D;
/*     */   } public final AxisAlignedBB center() {
/* 113 */     return this.center;
/*     */   } public final AxisAlignedBB[] cachedParts() {
/* 115 */     return this.cachedParts;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AxisAlignedBB[] cachedBounds() {
/* 123 */     return this.cachedBounds;
/*     */   }
/*     */   public final class Cable$$anonfun$1 extends AbstractFunction1<Object, AxisAlignedBB> implements Serializable { public static final long serialVersionUID = 0L;
/* 126 */     public final AxisAlignedBB apply(int mask) { AxisAlignedBB center = Cable$.MODULE$.center().func_72329_c();
/*     */ 
/*     */       
/* 129 */       return (AxisAlignedBB)scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foldLeft(center, (Function2)new Cable$$anonfun$1$$anonfun$apply$1(this, mask)); } public final class Cable$$anonfun$1$$anonfun$apply$1 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, AxisAlignedBB> implements Serializable {
/* 130 */       public static final long serialVersionUID = 0L; private final int mask$1; public Cable$$anonfun$1$$anonfun$apply$1(Cable$$anonfun$1 $outer, int mask$1) {} public final AxisAlignedBB apply(AxisAlignedBB bound, ForgeDirection side) { return ((side.flag & this.mask$1) != 0) ? bound.func_111270_a(Cable$.MODULE$.cachedParts()[side.ordinal()]) : 
/* 131 */           bound; }
/*     */     } }
/*     */    public final class Cable$$anonfun$neighbors$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IBlockAccess world$1; private final int x$4; private final int y$1; private final int z$1; private final IntRef result$1; private final TileEntity tileEntity$1; public Cable$$anonfun$neighbors$1(IBlockAccess world$1, int x$4, int y$1, int z$1, IntRef result$1, TileEntity tileEntity$1) {} public final void apply(ForgeDirection side) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(this.x$4 + side.offsetX), BoxesRunTime.boxToInteger(this.y$1 + side.offsetY), BoxesRunTime.boxToInteger(this.z$1 + side.offsetZ)); if (tuple3 != null) { boolean bool; int tx = BoxesRunTime.unboxToInt(tuple3._1()), ty = BoxesRunTime.unboxToInt(tuple3._2()), tz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(tx), BoxesRunTime.boxToInteger(ty), BoxesRunTime.boxToInteger(tz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3()); IBlockAccess iBlockAccess = this.world$1; if (iBlockAccess instanceof World) { World world = (World)iBlockAccess; bool = world.func_72899_e(i, j, k); } else { bool = this.world$1.func_147437_c(i, j, k) ? false : true; }
/*     */          if (bool) { TileEntity neighborTileEntity = this.world$1.func_147438_o(i, j, k); boolean neighborHasNode = Cable$.MODULE$.li$cil$oc$common$block$Cable$$hasNetworkNode(neighborTileEntity, side.getOpposite()); boolean canConnectColor = Cable$.MODULE$.li$cil$oc$common$block$Cable$$canConnectBasedOnColor(this.tileEntity$1, neighborTileEntity); boolean canConnectFMP = !(li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable() && (!Cable$.MODULE$.li$cil$oc$common$block$Cable$$canConnectFromSideFMP(this.tileEntity$1, side) || !Cable$.MODULE$.li$cil$oc$common$block$Cable$$canConnectFromSideFMP(neighborTileEntity, side.getOpposite()))); boolean canConnectIM = (Cable$.MODULE$.li$cil$oc$common$block$Cable$$canConnectFromSideIM(this.tileEntity$1, side) && Cable$.MODULE$.li$cil$oc$common$block$Cable$$canConnectFromSideIM(neighborTileEntity, side.getOpposite())); if (neighborHasNode && canConnectColor && canConnectFMP && canConnectIM)
/*     */             this.result$1.elem |= side.flag;  }
/*     */          return; }
/* 137 */        throw new MatchError(tuple3); } } public int neighbors(IBlockAccess world, int x, int y, int z) { IntRef result = IntRef.create(0);
/* 138 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 139 */     scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Cable$$anonfun$neighbors$1(world, x, y, z, result, tileEntity));
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
/* 156 */     return result.elem; }
/*     */   
/*     */   public AxisAlignedBB bounds(IBlockAccess world, int x, int y, int z) {
/* 159 */     return cachedBounds()[neighbors(world, x, y, z)].func_72329_c();
/*     */   }
/*     */   public void parts(IBlockAccess world, int x, int y, int z, AxisAlignedBB entityBox, List<AxisAlignedBB> boxes) {
/* 162 */     AxisAlignedBB center = center().func_72325_c(x, y, z);
/* 163 */     entityBox.func_72326_a(center) ? BoxesRunTime.boxToBoolean(boxes.add(center)) : BoxedUnit.UNIT;
/*     */     
/* 165 */     int flag = neighbors(world, x, y, z);
/* 166 */     scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Cable$$anonfun$parts$1(x, y, z, entityBox, boxes, flag));
/*     */   } public final class Cable$$anonfun$parts$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int x$6; private final int y$3; private final int z$3; private final AxisAlignedBB entityBox$1; private final List boxes$1; private final int flag$1; public Cable$$anonfun$parts$1(int x$6, int y$3, int z$3, AxisAlignedBB entityBox$1, List boxes$1, int flag$1) {} public final Object apply(ForgeDirection side) {
/* 168 */       AxisAlignedBB part = Cable$.MODULE$.cachedParts()[side.ordinal()].func_72325_c(this.x$6, this.y$3, this.z$3);
/* 169 */       return ((side.flag & this.flag$1) != 0) ? (this.entityBox$1.func_72326_a(part) ? BoxesRunTime.boxToBoolean(this.boxes$1.add(part)) : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */     } }
/*     */ 
/*     */   
/*     */   public boolean li$cil$oc$common$block$Cable$$hasNetworkNode(TileEntity tileEntity, ForgeDirection side) {
/*     */     boolean bool;
/* 175 */     TileEntity tileEntity1 = tileEntity;
/* 176 */     if (tileEntity1 instanceof li.cil.oc.common.tileentity.RobotProxy) { bool = false; }
/* 177 */     else if (tileEntity1 instanceof SidedEnvironment) { TileEntity tileEntity2 = tileEntity1;
/* 178 */       bool = (tileEntity2.func_145831_w()).field_72995_K ? ((SidedEnvironment)tileEntity2).canConnect(side) : (
/* 179 */         (((SidedEnvironment)tileEntity2).sidedNode(side) == null) ? false : true); }
/* 180 */     else if (tileEntity1 instanceof li.cil.oc.api.network.Environment && tileEntity1 instanceof SidedComponent) { TileEntity tileEntity2 = tileEntity1;
/* 181 */       bool = ((SidedComponent)tileEntity2).canConnectNode(side); }
/* 182 */     else if (tileEntity1 instanceof li.cil.oc.api.network.Environment) { bool = true; }
/* 183 */     else if (li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable()) { bool = hasMultiPartNode(tileEntity); }
/* 184 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   } private boolean hasMultiPartNode(TileEntity tileEntity) { boolean bool;
/* 188 */     TileEntity tileEntity1 = tileEntity;
/* 189 */     if (tileEntity1 instanceof TileMultipart) { TileMultipart tileMultipart = (TileMultipart)tileEntity1; bool = tileMultipart.partList().exists((Function1)new Cable$$anonfun$hasMultiPartNode$1()); }
/* 190 */     else { bool = false; }
/*     */      return bool; } public final class Cable$$anonfun$hasMultiPartNode$1 extends AbstractFunction1<TMultiPart, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(TMultiPart x$2) { return x$2 instanceof CablePart; } }
/*     */   private int cableColor(TileEntity tileEntity) { int i;
/* 194 */     TileEntity tileEntity1 = tileEntity;
/* 195 */     if (tileEntity1 instanceof Cable) { Cable cable = (Cable)tileEntity1; i = cable.color(); }
/*     */     else
/* 197 */     { i = li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable() ? cableColorFMP(tileEntity) : 
/* 198 */         li.cil.oc.util.Color$.MODULE$.LightGray(); }
/*     */     
/*     */     return i; }
/*     */   private int cableColorFMP(TileEntity tileEntity) { int i;
/* 202 */     TileEntity tileEntity1 = tileEntity;
/* 203 */     if (tileEntity1 instanceof TileMultipart) { TileMultipart tileMultipart = (TileMultipart)tileEntity1;
/*     */       
/* 205 */       i = BoxesRunTime.unboxToInt(((TraversableLike)tileMultipart.partList().collect((PartialFunction)new Cable$$anonfun$cableColorFMP$2(), scala.collection.Seq$.MODULE$.canBuildFrom())).headOption().getOrElse((Function0)new Cable$$anonfun$cableColorFMP$1())); }
/* 206 */     else { i = li.cil.oc.util.Color$.MODULE$.LightGray(); }  return i; } public final class Cable$$anonfun$cableColorFMP$2 extends AbstractPartialFunction<TMultiPart, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends TMultiPart, B1> B1 applyOrElse(TMultiPart x1, Function1 default) { Object object; TMultiPart tMultiPart = x1; if (tMultiPart instanceof CablePart) { CablePart cablePart = (CablePart)tMultiPart; object = BoxesRunTime.boxToInteger(cablePart.color()); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(TMultiPart x1) { boolean bool; TMultiPart tMultiPart = x1; if (tMultiPart instanceof CablePart) { bool = true; } else { bool = false; }  return bool; } } public final class Cable$$anonfun$cableColorFMP$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); }
/*     */     public int apply$mcI$sp() { return li.cil.oc.util.Color$.MODULE$.LightGray(); } }
/* 210 */   public boolean li$cil$oc$common$block$Cable$$canConnectBasedOnColor(TileEntity te1, TileEntity te2) { Tuple2.mcII.sp sp = new Tuple2.mcII.sp(cableColor(te1), cableColor(te2)); if (sp != null) { int c1 = sp._1$mcI$sp(), c2 = sp._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(c1, c2), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 211 */       return (i == j || i == li.cil.oc.util.Color$.MODULE$.LightGray() || j == li.cil.oc.util.Color$.MODULE$.LightGray()); }
/*     */     
/*     */     throw new MatchError(sp); }
/*     */   public boolean li$cil$oc$common$block$Cable$$canConnectFromSideFMP(TileEntity tileEntity, ForgeDirection side) { boolean bool;
/* 215 */     TileEntity tileEntity1 = tileEntity;
/* 216 */     if (tileEntity1 instanceof TileMultipart) { TileMultipart tileMultipart = (TileMultipart)tileEntity1;
/* 217 */       bool = tileMultipart.partList().forall((Function1)new Cable$$anonfun$li$cil$oc$common$block$Cable$$canConnectFromSideFMP$1(side));
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */       
/* 226 */       bool = true; }  return bool; } public final class Cable$$anonfun$li$cil$oc$common$block$Cable$$canConnectFromSideFMP$1 extends AbstractFunction1<TMultiPart, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection side$1; public final boolean apply(TMultiPart x0$1) { boolean bool; TMultiPart tMultiPart = x0$1; if (tMultiPart instanceof JNormalOcclusion) { TMultiPart tMultiPart1 = tMultiPart; if (!(tMultiPart1 instanceof CablePart)) { (new Cuboid6[1])[0] = new Cuboid6(Cable$.MODULE$.cachedBounds()[this.side$1.flag]); Iterable ownBounds = (Iterable)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Cuboid6[1])); Iterable otherBounds = ((JNormalOcclusion)tMultiPart1).getOcclusionBoxes(); return codechicken.multipart.NormalOcclusionTest$.MODULE$.apply((Traversable)ownBounds, (Traversable)scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(otherBounds)); }  }  if (tMultiPart instanceof TFacePart) { TFacePart tFacePart = (TFacePart)tMultiPart; bool = (tFacePart.solid(this.side$1.ordinal()) && (tFacePart.getSlotMask() & (PartMap.face(this.side$1.ordinal())).mask) != 0) ? false : true; }
/*     */       else { bool = true; }
/*     */        return bool; } public Cable$$anonfun$li$cil$oc$common$block$Cable$$canConnectFromSideFMP$1(ForgeDirection side$1) {} }
/* 230 */   public boolean li$cil$oc$common$block$Cable$$canConnectFromSideIM(TileEntity tileEntity, ForgeDirection side) { boolean bool; TileEntity tileEntity1 = tileEntity;
/* 231 */     if (tileEntity1 instanceof ImmibisMicroblock) { ImmibisMicroblock immibisMicroblock = (ImmibisMicroblock)tileEntity1; bool = immibisMicroblock.ImmibisMicroblocks_isSideOpen(side.ordinal()); }
/* 232 */     else { bool = true; }
/*     */     
/* 234 */     return bool; } private Cable$() { MODULE$ = this;
/*     */     this.center = AxisAlignedBB.func_72330_a(0.375D, 0.375D, 0.375D, 0.625D, 0.625D, 0.625D);
/*     */     (new AxisAlignedBB[6])[0] = AxisAlignedBB.func_72330_a(0.375D, 0.0D, 0.375D, 0.625D, 0.375D, 0.625D);
/*     */     (new AxisAlignedBB[6])[1] = AxisAlignedBB.func_72330_a(0.375D, 0.625D, 0.375D, 0.625D, 1.0D, 0.625D);
/*     */     (new AxisAlignedBB[6])[2] = AxisAlignedBB.func_72330_a(0.375D, 0.375D, 0.0D, 0.625D, 0.625D, 0.375D);
/*     */     (new AxisAlignedBB[6])[3] = AxisAlignedBB.func_72330_a(0.375D, 0.375D, 0.625D, 0.625D, 0.625D, 1.0D);
/*     */     (new AxisAlignedBB[6])[4] = AxisAlignedBB.func_72330_a(0.0D, 0.375D, 0.375D, 0.375D, 0.625D, 0.625D);
/*     */     (new AxisAlignedBB[6])[5] = AxisAlignedBB.func_72330_a(0.625D, 0.375D, 0.375D, 1.0D, 0.625D, 0.625D);
/*     */     this.cachedParts = new AxisAlignedBB[6];
/*     */     this.cachedBounds = (AxisAlignedBB[])((TraversableOnce)scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(0), 63).map((Function1)new Cable$$anonfun$1(), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(AxisAlignedBB.class)); }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Cable$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */