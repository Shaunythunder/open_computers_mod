/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockLiquid;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.fluids.Fluid;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import net.minecraftforge.fluids.FluidTank;
/*     */ import net.minecraftforge.fluids.FluidTankInfo;
/*     */ import net.minecraftforge.fluids.IFluidBlock;
/*     */ import net.minecraftforge.fluids.IFluidHandler;
/*     */ import net.minecraftforge.fluids.IFluidTank;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t5u!B\001\003\021\003Y\021A\003$mk&$W\013^5mg*\0211\001B\001\005kRLGN\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\001\"\001D\007\016\003\t1QA\004\002\t\002=\021!B\0227vS\022,F/\0337t'\ti\001\003\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\005\006/5!\t\001G\001\007y%t\027\016\036 \025\003-AQAG\007\005\002m\taB\0327vS\022D\025M\0343mKJ\fE\017\006\002\035SA\031\021#H\020\n\005y\021\"AB(qi&|g\016\005\002!O5\t\021E\003\002#G\0051a\r\\;jINT!\001J\023\002\0355Lg.Z2sC\032$hm\034:hK*\ta%A\002oKRL!\001K\021\003\033%3E.^5e\021\006tG\r\\3s\021\025Q\023\0041\001,\003!\001xn]5uS>t\007C\001\007-\023\ti#AA\007CY>\0347\016U8tSRLwN\034\005\006_5!\t\001M\001\035iJ\fgn\0354fe\n+Go^3f]\032cW/\0333IC:$G.\032:t)\035\tDGN B\007\026\003\"!\005\032\n\005M\022\"aA%oi\")QG\fa\001?\00511o\\;sG\026DQa\016\030A\002a\n!b]8ve\016,7+\0333f!\tIT(D\001;\025\t\0311H\003\002=G\00511m\\7n_:L!A\020\036\003\035\031{'oZ3ESJ,7\r^5p]\")\001I\fa\001?\005!1/\0338l\021\025\021e\0061\0019\003!\031\030N\\6TS\022,\007b\002#/!\003\005\r!M\001\006Y&l\027\016\036\005\b\r:\002\n\0211\0012\003)\031x.\036:dKR\013gn\033\005\006\0216!\t!S\001\037iJ\fgn\0354fe\n+Go^3f]\032cW/\0333IC:$G.\032:t\003R$r!\r&M\033>\003\026\013C\003L\017\002\0071&A\005t_V\0248-\032)pg\")qg\022a\001q!)aj\022a\001W\00591/\0338l!>\034\b\"\002\"H\001\004A\004b\002#H!\003\005\r!\r\005\b\r\036\003\n\0211\0012\021\025\031V\002\"\001U\003Mawn\\6va\032cW/\0333G_J\024En\\2l)\t)\006\f\005\002!-&\021q+\t\002\006\r2,\030\016\032\005\0063J\003\rAW\001\006E2|7m\033\t\0037~k\021\001\030\006\0033vS!AX\023\002\0235Lg.Z2sC\032$\030B\0011]\005\025\021En\\2l\r\021\021W\002B2\003'\035+g.\032:jG\ncwnY6Xe\006\004\b/\032:\024\007\005$w\004\005\002fU6\taM\003\002hQ\006!A.\0318h\025\005I\027\001\0026bm\006L!a\0334\003\r=\023'.Z2u\021!Q\023M!A!\002\023Y\003\"B\fb\t\003qGCA8r!\t\001\030-D\001\016\021\025QS\0161\001,\021\025\031\030\r\"\021u\003!\031\027M\034#sC&tGcA;yuB\021\021C^\005\003oJ\021qAQ8pY\026\fg\016C\003ze\002\007\001(\001\003ge>l\007\"B>s\001\004)\026!\0024mk&$\007\"B?b\t\003r\030!\0023sC&tGcB@\002\006\005\035\0211\002\t\004A\005\005\021bAA\002C\tQa\t\\;jIN#\030mY6\t\013ed\b\031\001\035\t\r\005%A\0201\001\000\003!\021Xm]8ve\016,\007BBA\007y\002\007Q/A\004e_\022\023\030-\0338\t\ru\fG\021IA\t)\035y\0301CA\013\0033Aa!_A\b\001\004A\004bBA\f\003\037\001\r!M\001\t[\006DHI]1j]\"9\021QBA\b\001\004)\bbBA\017C\022\005\023qD\001\bG\006tg)\0337m)\025)\030\021EA\022\021\031I\0301\004a\001q!110a\007A\002UCq!a\nb\t\003\nI#\001\003gS2dGcB\031\002,\0055\022q\006\005\007s\006\025\002\031\001\035\t\017\005%\021Q\005a\001\"9\021\021GA\023\001\004)\030A\0023p\r&dG\016C\004\0026\005$\t%a\016\002\027\035,G\017V1oW&sgm\034\013\005\003s\t)\005E\003\022\003w\ty$C\002\002>I\021Q!\021:sCf\0042\001IA!\023\r\t\031%\t\002\016\r2,\030\016\032+b].LeNZ8\t\re\f\031\0041\0019\021\035\tI%\031C\001\003\027\nabY;se\026tGo\026:baB,'/F\001\035\021\035\ty%\031C\001\003#\n\021#[:Gk2dG*[9vS\022\024En\\2l+\005)h!CA+\033A\005\031\021BA,\005A\021En\\2l/J\f\007\017]3s\005\006\034Xm\005\003\002T\021|\002\002CA.\003'\"\t!!\030\002\r\021Jg.\033;%)\t\ty\006E\002\022\003CJ1!a\031\023\005\021)f.\033;\t\021\005\035\0241\013D\t\003S\na\"\0368dQ\026\0347.\0323Ee\006Lg\016F\002\000\003WBq!!\004\002f\001\007Q\017C\004~\003'\"\t%a\034\025\017}\f\t(a\035\002v!1\0210!\034A\002aBq!!\003\002n\001\007q\020C\004\002\016\0055\004\031A;\t\017u\f\031\006\"\021\002zQ9q0a\037\002~\005}\004BB=\002x\001\007\001\bC\004\002\030\005]\004\031A\031\t\017\0055\021q\017a\001k\"A\021QDA*\t\003\n\031\tF\003v\003\013\0139\t\003\004z\003\003\003\r\001\017\005\007w\006\005\005\031A+\t\021\005\035\0221\013C!\003\027#r!MAG\003\037\013\t\n\003\004z\003\023\003\r\001\017\005\b\003\023\tI\t1\001\000\021\035\t\t$!#A\002U4a!!&\016\t\005]%!\005$mk&$'\t\\8dW^\023\030\r\0359feN)\0211\0233\002\032B\031\001/a\025\t\025)\n\031J!b\001\n\003\ti*F\001,\021)\t\t+a%\003\002\003\006IaK\001\na>\034\030\016^5p]\002B!\"WAJ\005\013\007I\021AAS+\t\t9\013E\002!\003SK1!a+\"\005-Ie\t\\;jI\ncwnY6\t\027\005=\0261\023B\001B\003%\021qU\001\007E2|7m\033\021\t\017]\t\031\n\"\001\0024R1\021QWA\\\003s\0032\001]AJ\021\031Q\023\021\027a\001W!9\021,!-A\002\005\035\006BCA_\003'\023\r\021\"\002\002@\006y\021i]:v[\026$7)\0319bG&$\0300\006\002\002B>\021\0211Y\017\003\007!H\021\"a2\002\024\002\006i!!1\002!\005\0338/^7fI\016\013\007/Y2jif\004\003bB:\002\024\022\005\0231\032\013\006k\0065\027q\032\005\007s\006%\007\031\001\035\t\rm\fI\r1\001V\021!\t)$a%\005B\005MG\003BA\035\003+Da!_Ai\001\004A\004\002CA4\003'#\t&!7\025\007}\fY\016C\004\002\016\005]\007\031A;\007\r\005}W\002BAq\005Ia\025.];jI\ncwnY6Xe\006\004\b/\032:\024\013\005uG-!'\t\025)\niN!b\001\n\003\ti\n\003\006\002\"\006u'\021!Q\001\n-B!\"WAo\005\013\007I\021AAu+\t\tY\017E\002\\\003[L1!a<]\005-\021En\\2l\031&\fX/\0333\t\027\005=\026Q\034B\001B\003%\0211\036\005\b/\005uG\021AA{)\031\t90!?\002|B\031\001/!8\t\r)\n\031\0201\001,\021\035I\0261\037a\001\003WD\021b_Ao\005\004%\t!a@\026\003UC\001Ba\001\002^\002\006I!V\001\007M2,\030\016\032\021\t\017M\fi\016\"\021\003\bQ)QO!\003\003\f!1\021P!\002A\002aBaa\037B\003\001\004)\006\002CA\033\003;$\tEa\004\025\t\005e\"\021\003\005\007s\n5\001\031\001\035\t\021\005\035\024Q\034C)\005+!2a B\f\021\035\tiAa\005A\002U4aAa\007\016\t\tu!aD!je\ncwnY6Xe\006\004\b/\032:\024\t\teAm\b\005\013U\te!Q1A\005\002\005u\005BCAQ\0053\021\t\021)A\005W!Q\021L!\007\003\006\004%\tA!\n\026\003iC!\"a,\003\032\t\005\t\025!\003[\021\0359\"\021\004C\001\005W!bA!\f\0030\tE\002c\0019\003\032!1!F!\013A\002-Ba!\027B\025\001\004Q\006bB:\003\032\021\005#Q\007\013\006k\n]\"\021\b\005\007s\nM\002\031\001\035\t\rm\024\031\0041\001V\021\035i(\021\004C!\005{!ra B \005\003\022\031\005\003\004z\005w\001\r\001\017\005\b\003\023\021Y\0041\001\000\021\035\tiAa\017A\002UDq! B\r\t\003\0229\005F\004\000\005\023\022YE!\024\t\re\024)\0051\0019\021\035\t9B!\022A\002EBq!!\004\003F\001\007Q\017\003\005\002\036\teA\021\tB))\025)(1\013B+\021\031I(q\na\001q!11Pa\024A\002UC\001\"a\n\003\032\021\005#\021\f\013\bc\tm#Q\fB0\021\031I(q\013a\001q!9\021\021\002B,\001\004y\bbBA\031\005/\002\r!\036\005\t\003k\021I\002\"\021\003dQ!\021\021\bB3\021\031I(\021\ra\001q!I!\021N\007\022\002\023\005!1N\001'iJ\fgn\0354fe\n+Go^3f]\032cW/\0333IC:$G.\032:tI\021,g-Y;mi\022*TC\001B7U\r\t$qN\026\003\005c\002BAa\035\003~5\021!Q\017\006\005\005o\022I(A\005v]\016DWmY6fI*\031!1\020\n\002\025\005tgn\034;bi&|g.\003\003\003\000\tU$!E;oG\",7m[3e-\006\024\030.\0318dK\"I!1Q\007\022\002\023\005!1N\001'iJ\fgn\0354fe\n+Go^3f]\032cW/\0333IC:$G.\032:tI\021,g-Y;mi\0222\004\"\003BD\033E\005I\021\001B6\003!\"(/\0318tM\026\024()\032;xK\026tg\t\\;jI\"\013g\016\0327feN\fE\017\n3fM\006,H\016\036\0236\021%\021Y)DI\001\n\003\021Y'\001\025ue\006t7OZ3s\005\026$x/Z3o\r2,\030\016\032%b]\022dWM]:Bi\022\"WMZ1vYR$c\007")
/*     */ public final class FluidUtils
/*     */ {
/*     */   public static int transferBetweenFluidHandlersAt$default$6() {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlersAt$default$6();
/*     */   }
/*     */   
/*     */   public static int transferBetweenFluidHandlersAt$default$5() {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlersAt$default$5();
/*     */   }
/*     */   
/*     */   public static int transferBetweenFluidHandlers$default$6() {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlers$default$6();
/*     */   }
/*     */   
/*     */   public static int transferBetweenFluidHandlers$default$5() {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlers$default$5();
/*     */   }
/*     */   
/*     */   public static Fluid lookupFluidForBlock(Block paramBlock) {
/*     */     return FluidUtils$.MODULE$.lookupFluidForBlock(paramBlock);
/*     */   }
/*     */   
/*     */   public static int transferBetweenFluidHandlersAt(BlockPosition paramBlockPosition1, ForgeDirection paramForgeDirection1, BlockPosition paramBlockPosition2, ForgeDirection paramForgeDirection2, int paramInt1, int paramInt2) {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlersAt(paramBlockPosition1, paramForgeDirection1, paramBlockPosition2, paramForgeDirection2, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static int transferBetweenFluidHandlers(IFluidHandler paramIFluidHandler1, ForgeDirection paramForgeDirection1, IFluidHandler paramIFluidHandler2, ForgeDirection paramForgeDirection2, int paramInt1, int paramInt2) {
/*     */     return FluidUtils$.MODULE$.transferBetweenFluidHandlers(paramIFluidHandler1, paramForgeDirection1, paramIFluidHandler2, paramForgeDirection2, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static Option<IFluidHandler> fluidHandlerAt(BlockPosition paramBlockPosition) {
/*     */     return FluidUtils$.MODULE$.fluidHandlerAt(paramBlockPosition);
/*     */   }
/*     */   
/*     */   public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$1
/*     */     extends AbstractFunction0.mcI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final int apply() {
/*  73 */       return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; }
/*  74 */   } public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; public final ForgeDirection sourceSide$1; private final BlockPosition sinkPos$1; public final int apply(IFluidHandler source) { return BoxesRunTime.unboxToInt(FluidUtils$.MODULE$.fluidHandlerAt(this.sinkPos$1).fold((Function0)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1(this), (Function1)new FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2(this, source))); } public final ForgeDirection sinkSide$1; public final int limit$1; public final int sourceTank$1; public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2(ForgeDirection sourceSide$1, BlockPosition sinkPos$1, ForgeDirection sinkSide$1, int limit$1, int sourceTank$1) {} public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$1(FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 $outer) {} } public final class FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IFluidHandler source$1; public FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2$$anonfun$apply$2(FluidUtils$$anonfun$transferBetweenFluidHandlersAt$2 $outer, IFluidHandler source$1) {} public final int apply(IFluidHandler sink) {
/*  75 */         return FluidUtils$.MODULE$.transferBetweenFluidHandlers(this.source$1, this.$outer.sourceSide$1, sink, this.$outer.sinkSide$1, this.$outer.limit$1, this.$outer.sourceTank$1);
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public static class GenericBlockWrapper
/*     */     implements IFluidHandler
/*     */   {
/*     */     private final BlockPosition position;
/*     */     
/*     */     public GenericBlockWrapper(BlockPosition position) {}
/*     */     
/*     */     public boolean canDrain(ForgeDirection from, Fluid fluid)
/*     */     {
/*  89 */       return BoxesRunTime.unboxToBoolean(currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$canDrain$1(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$canDrain$2(this, from, fluid))); } public final class FluidUtils$GenericBlockWrapper$$anonfun$canDrain$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public FluidUtils$GenericBlockWrapper$$anonfun$canDrain$1(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$canDrain$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$1; private final Fluid fluid$1; public final boolean apply(IFluidHandler x$1) { return x$1.canDrain(this.from$1, this.fluid$1); }
/*     */        public FluidUtils$GenericBlockWrapper$$anonfun$canDrain$2(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$1, Fluid fluid$1) {} }
/*  91 */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) { return (FluidStack)currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$drain$1(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$drain$2(this, from, resource, doDrain)); } public final class FluidUtils$GenericBlockWrapper$$anonfun$drain$1 extends AbstractFunction0<FluidStack> implements Serializable { public static final long serialVersionUID = 0L; public final FluidStack apply() { return null; } public FluidUtils$GenericBlockWrapper$$anonfun$drain$1(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$drain$2 extends AbstractFunction1<IFluidHandler, FluidStack> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$2; private final FluidStack resource$1; private final boolean doDrain$1; public final FluidStack apply(IFluidHandler x$2) { return x$2.drain(this.from$2, this.resource$1, this.doDrain$1); }
/*     */        public FluidUtils$GenericBlockWrapper$$anonfun$drain$2(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$2, FluidStack resource$1, boolean doDrain$1) {} }
/*  93 */     public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) { return (FluidStack)currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$drain$3(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$drain$4(this, from, maxDrain, doDrain)); } public final class FluidUtils$GenericBlockWrapper$$anonfun$drain$3 extends AbstractFunction0<FluidStack> implements Serializable { public static final long serialVersionUID = 0L; public final FluidStack apply() { return null; } public FluidUtils$GenericBlockWrapper$$anonfun$drain$3(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$drain$4 extends AbstractFunction1<IFluidHandler, FluidStack> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$3; private final int maxDrain$1; private final boolean doDrain$2; public final FluidStack apply(IFluidHandler x$3) { return x$3.drain(this.from$3, this.maxDrain$1, this.doDrain$2); }
/*     */        public FluidUtils$GenericBlockWrapper$$anonfun$drain$4(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$3, int maxDrain$1, boolean doDrain$2) {} }
/*  95 */     public boolean canFill(ForgeDirection from, Fluid fluid) { return BoxesRunTime.unboxToBoolean(currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$canFill$1(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$canFill$2(this, from, fluid))); } public final class FluidUtils$GenericBlockWrapper$$anonfun$canFill$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public FluidUtils$GenericBlockWrapper$$anonfun$canFill$1(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$canFill$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$4; private final Fluid fluid$2; public final boolean apply(IFluidHandler x$4) { return x$4.canFill(this.from$4, this.fluid$2); }
/*     */        public FluidUtils$GenericBlockWrapper$$anonfun$canFill$2(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$4, Fluid fluid$2) {} }
/*  97 */     public int fill(ForgeDirection from, FluidStack resource, boolean doFill) { return BoxesRunTime.unboxToInt(currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$fill$1(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$fill$2(this, from, resource, doFill))); } public final class FluidUtils$GenericBlockWrapper$$anonfun$fill$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public FluidUtils$GenericBlockWrapper$$anonfun$fill$1(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$fill$2 extends AbstractFunction1<IFluidHandler, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$5; private final FluidStack resource$2; private final boolean doFill$1; public final int apply(IFluidHandler x$5) { return x$5.fill(this.from$5, this.resource$2, this.doFill$1); }
/*     */        public FluidUtils$GenericBlockWrapper$$anonfun$fill$2(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$5, FluidStack resource$2, boolean doFill$1) {} }
/*  99 */     public FluidTankInfo[] getTankInfo(ForgeDirection from) { return (FluidTankInfo[])currentWrapper().fold((Function0)new FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$1(this), (Function1)new FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$2(this, from)); } public final class FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$1 extends AbstractFunction0<FluidTankInfo[]> implements Serializable { public static final long serialVersionUID = 0L; public final FluidTankInfo[] apply() { return (FluidTankInfo[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(FluidTankInfo.class)); } public FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$1(FluidUtils.GenericBlockWrapper $outer) {} } public final class FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$2 extends AbstractFunction1<IFluidHandler, FluidTankInfo[]> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection from$6; public final FluidTankInfo[] apply(IFluidHandler x$6) { return x$6.getTankInfo(this.from$6); }
/*     */ 
/*     */       
/*     */       public FluidUtils$GenericBlockWrapper$$anonfun$getTankInfo$2(FluidUtils.GenericBlockWrapper $outer, ForgeDirection from$6) {} }
/*     */ 
/*     */     
/*     */     public Option<IFluidHandler> currentWrapper() {
/*     */       // Byte code:
/*     */       //   0: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */       //   3: aload_0
/*     */       //   4: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   7: invokevirtual world : ()Lscala/Option;
/*     */       //   10: invokevirtual get : ()Ljava/lang/Object;
/*     */       //   13: checkcast net/minecraft/world/World
/*     */       //   16: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */       //   19: aload_0
/*     */       //   20: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   23: invokevirtual blockExists : (Lli/cil/oc/util/BlockPosition;)Z
/*     */       //   26: ifeq -> 272
/*     */       //   29: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */       //   32: aload_0
/*     */       //   33: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   36: invokevirtual world : ()Lscala/Option;
/*     */       //   39: invokevirtual get : ()Ljava/lang/Object;
/*     */       //   42: checkcast net/minecraft/world/World
/*     */       //   45: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */       //   48: aload_0
/*     */       //   49: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   52: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */       //   55: astore_1
/*     */       //   56: aload_1
/*     */       //   57: instanceof net/minecraftforge/fluids/IFluidBlock
/*     */       //   60: ifeq -> 90
/*     */       //   63: aload_1
/*     */       //   64: astore_2
/*     */       //   65: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   68: new li/cil/oc/util/FluidUtils$FluidBlockWrapper
/*     */       //   71: dup
/*     */       //   72: aload_0
/*     */       //   73: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   76: aload_2
/*     */       //   77: checkcast net/minecraftforge/fluids/IFluidBlock
/*     */       //   80: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;Lnet/minecraftforge/fluids/IFluidBlock;)V
/*     */       //   83: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   86: astore_3
/*     */       //   87: goto -> 268
/*     */       //   90: aload_1
/*     */       //   91: instanceof net/minecraft/block/BlockStaticLiquid
/*     */       //   94: ifeq -> 144
/*     */       //   97: aload_1
/*     */       //   98: checkcast net/minecraft/block/BlockStaticLiquid
/*     */       //   101: astore #4
/*     */       //   103: getstatic li/cil/oc/util/FluidUtils$.MODULE$ : Lli/cil/oc/util/FluidUtils$;
/*     */       //   106: aload #4
/*     */       //   108: invokevirtual lookupFluidForBlock : (Lnet/minecraft/block/Block;)Lnet/minecraftforge/fluids/Fluid;
/*     */       //   111: ifnull -> 144
/*     */       //   114: aload_0
/*     */       //   115: invokevirtual isFullLiquidBlock : ()Z
/*     */       //   118: ifeq -> 144
/*     */       //   121: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   124: new li/cil/oc/util/FluidUtils$LiquidBlockWrapper
/*     */       //   127: dup
/*     */       //   128: aload_0
/*     */       //   129: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   132: aload #4
/*     */       //   134: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/BlockLiquid;)V
/*     */       //   137: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   140: astore_3
/*     */       //   141: goto -> 268
/*     */       //   144: aload_1
/*     */       //   145: instanceof net/minecraft/block/BlockDynamicLiquid
/*     */       //   148: ifeq -> 198
/*     */       //   151: aload_1
/*     */       //   152: checkcast net/minecraft/block/BlockDynamicLiquid
/*     */       //   155: astore #5
/*     */       //   157: getstatic li/cil/oc/util/FluidUtils$.MODULE$ : Lli/cil/oc/util/FluidUtils$;
/*     */       //   160: aload #5
/*     */       //   162: invokevirtual lookupFluidForBlock : (Lnet/minecraft/block/Block;)Lnet/minecraftforge/fluids/Fluid;
/*     */       //   165: ifnull -> 198
/*     */       //   168: aload_0
/*     */       //   169: invokevirtual isFullLiquidBlock : ()Z
/*     */       //   172: ifeq -> 198
/*     */       //   175: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   178: new li/cil/oc/util/FluidUtils$LiquidBlockWrapper
/*     */       //   181: dup
/*     */       //   182: aload_0
/*     */       //   183: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   186: aload #5
/*     */       //   188: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/BlockLiquid;)V
/*     */       //   191: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   194: astore_3
/*     */       //   195: goto -> 268
/*     */       //   198: aload_1
/*     */       //   199: ifnull -> 264
/*     */       //   202: aload_1
/*     */       //   203: astore #6
/*     */       //   205: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*     */       //   208: aload #6
/*     */       //   210: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*     */       //   213: aload_0
/*     */       //   214: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   217: invokevirtual isAir : (Lli/cil/oc/util/BlockPosition;)Z
/*     */       //   220: ifne -> 241
/*     */       //   223: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*     */       //   226: aload #6
/*     */       //   228: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*     */       //   231: aload_0
/*     */       //   232: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   235: invokevirtual isReplaceable : (Lli/cil/oc/util/BlockPosition;)Z
/*     */       //   238: ifeq -> 264
/*     */       //   241: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   244: new li/cil/oc/util/FluidUtils$AirBlockWrapper
/*     */       //   247: dup
/*     */       //   248: aload_0
/*     */       //   249: getfield position : Lli/cil/oc/util/BlockPosition;
/*     */       //   252: aload #6
/*     */       //   254: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/Block;)V
/*     */       //   257: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   260: astore_3
/*     */       //   261: goto -> 268
/*     */       //   264: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   267: astore_3
/*     */       //   268: aload_3
/*     */       //   269: goto -> 275
/*     */       //   272: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   275: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #101	-> 0
/*     */       //   #102	-> 56
/*     */       //   #103	-> 90
/*     */       //   #104	-> 144
/*     */       //   #105	-> 198
/*     */       //   #106	-> 264
/*     */       //   #101	-> 268
/*     */       //   #108	-> 272
/*     */       //   #101	-> 275
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	276	0	this	Lli/cil/oc/util/FluidUtils$GenericBlockWrapper;
/*     */     }
/*     */     
/*     */     public boolean isFullLiquidBlock() {
/* 110 */       return (ExtendedWorld$.MODULE$.extendedWorld((World)this.position.world().get()).getBlockMetadata(this.position) == 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static abstract class BlockWrapperBase$class
/*     */   {
/*     */     public static void $init$(FluidUtils.BlockWrapperBase $this) {}
/*     */ 
/*     */     
/*     */     public static FluidStack drain(FluidUtils.BlockWrapperBase $this, ForgeDirection from, FluidStack resource, boolean doDrain) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: iconst_0
/*     */       //   2: invokeinterface uncheckedDrain : (Z)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   7: astore #4
/*     */       //   9: aload #4
/*     */       //   11: ifnull -> 72
/*     */       //   14: aload_2
/*     */       //   15: ifnull -> 62
/*     */       //   18: aload #4
/*     */       //   20: invokevirtual getFluid : ()Lnet/minecraftforge/fluids/Fluid;
/*     */       //   23: aload_2
/*     */       //   24: invokevirtual getFluid : ()Lnet/minecraftforge/fluids/Fluid;
/*     */       //   27: astore #5
/*     */       //   29: dup
/*     */       //   30: ifnonnull -> 42
/*     */       //   33: pop
/*     */       //   34: aload #5
/*     */       //   36: ifnull -> 50
/*     */       //   39: goto -> 72
/*     */       //   42: aload #5
/*     */       //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   47: ifeq -> 72
/*     */       //   50: aload #4
/*     */       //   52: getfield amount : I
/*     */       //   55: aload_2
/*     */       //   56: getfield amount : I
/*     */       //   59: if_icmpgt -> 72
/*     */       //   62: aload_0
/*     */       //   63: iload_3
/*     */       //   64: invokeinterface uncheckedDrain : (Z)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   69: goto -> 73
/*     */       //   72: aconst_null
/*     */       //   73: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #117	-> 0
/*     */       //   #118	-> 9
/*     */       //   #119	-> 62
/*     */       //   #121	-> 72
/*     */       //   #116	-> 73
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	74	0	$this	Lli/cil/oc/util/FluidUtils$BlockWrapperBase;
/*     */       //   0	74	1	from	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   0	74	2	resource	Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   0	74	3	doDrain	Z
/*     */       //   9	65	4	drained	Lnet/minecraftforge/fluids/FluidStack;
/*     */     }
/*     */     
/*     */     public static FluidStack drain(FluidUtils.BlockWrapperBase $this, ForgeDirection from, int maxDrain, boolean doDrain) {
/* 125 */       FluidStack drained = $this.uncheckedDrain(false);
/* 126 */       return (drained != null && drained.amount <= maxDrain) ? 
/* 127 */         $this.uncheckedDrain(doDrain) : 
/*     */         
/* 129 */         null;
/*     */     }
/*     */     public static boolean canFill(FluidUtils.BlockWrapperBase $this, ForgeDirection from, Fluid fluid) {
/* 132 */       return false;
/*     */     } public static int fill(FluidUtils.BlockWrapperBase $this, ForgeDirection from, FluidStack resource, boolean doFill) {
/* 134 */       return 0;
/*     */     } }
/*     */   public static class FluidBlockWrapper implements BlockWrapperBase { private final BlockPosition position; private final IFluidBlock block; private final int AssumedCapacity;
/* 137 */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) { return FluidUtils.BlockWrapperBase$class.drain(this, from, resource, doDrain); } public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) { return FluidUtils.BlockWrapperBase$class.drain(this, from, maxDrain, doDrain); } public boolean canFill(ForgeDirection from, Fluid fluid) { return FluidUtils.BlockWrapperBase$class.canFill(this, from, fluid); } public int fill(ForgeDirection from, FluidStack resource, boolean doFill) { return FluidUtils.BlockWrapperBase$class.fill(this, from, resource, doFill); } public BlockPosition position() { return this.position; } public IFluidBlock block() { return this.block; } public FluidBlockWrapper(BlockPosition position, IFluidBlock block) { FluidUtils.BlockWrapperBase$class.$init$(this); } public final int AssumedCapacity() {
/* 138 */       return 1000;
/*     */     } public boolean canDrain(ForgeDirection from, Fluid fluid) {
/* 140 */       return ExtendedBlock$.MODULE$.extendedFluidBlock(block()).canDrain(position());
/*     */     } public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 142 */       (new FluidTankInfo[1])[0] = new FluidTankInfo((IFluidTank)new FluidTank(block().getFluid(), (int)(ExtendedBlock$.MODULE$.extendedFluidBlock(block()).getFilledPercentage(position()) * 'Ϩ'), 1000)); return new FluidTankInfo[1];
/*     */     } public FluidStack uncheckedDrain(boolean doDrain) {
/* 144 */       return ExtendedBlock$.MODULE$.extendedFluidBlock(block()).drain(position(), doDrain);
/*     */     } }
/*     */   public static class LiquidBlockWrapper implements BlockWrapperBase { private final BlockPosition position; private final BlockLiquid block; private final Fluid fluid;
/* 147 */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) { return FluidUtils.BlockWrapperBase$class.drain(this, from, resource, doDrain); } public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) { return FluidUtils.BlockWrapperBase$class.drain(this, from, maxDrain, doDrain); } public boolean canFill(ForgeDirection from, Fluid fluid) { return FluidUtils.BlockWrapperBase$class.canFill(this, from, fluid); } public int fill(ForgeDirection from, FluidStack resource, boolean doFill) { return FluidUtils.BlockWrapperBase$class.fill(this, from, resource, doFill); } public BlockPosition position() { return this.position; } public BlockLiquid block() { return this.block; } public LiquidBlockWrapper(BlockPosition position, BlockLiquid block) { FluidUtils.BlockWrapperBase$class.$init$(this);
/* 148 */       this.fluid = FluidUtils$.MODULE$.lookupFluidForBlock((Block)block); } public Fluid fluid() { return this.fluid; }
/*     */      public boolean canDrain(ForgeDirection from, Fluid fluid) {
/* 150 */       return true;
/*     */     } public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 152 */       (new FluidTankInfo[1])[0] = new FluidTankInfo((IFluidTank)new FluidTank(fluid(), 1000, 1000)); return new FluidTankInfo[1];
/*     */     }
/*     */     public FluidStack uncheckedDrain(boolean doDrain) {
/* 155 */       doDrain ? 
/* 156 */         BoxesRunTime.boxToBoolean(ExtendedWorld$.MODULE$.extendedWorld((World)position().world().get()).setBlockToAir(position())) : BoxedUnit.UNIT;
/*     */       
/* 158 */       return new FluidStack(fluid(), 1000);
/*     */     } }
/*     */   public static class AirBlockWrapper implements IFluidHandler { private final BlockPosition position; private final Block block;
/*     */     
/* 162 */     public BlockPosition position() { return this.position; } public Block block() { return this.block; } public AirBlockWrapper(BlockPosition position, Block block) {} public boolean canDrain(ForgeDirection from, Fluid fluid) {
/* 163 */       return false;
/*     */     } public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
/* 165 */       return null;
/*     */     } public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
/* 167 */       return null;
/*     */     } public boolean canFill(ForgeDirection from, Fluid fluid) {
/* 169 */       return fluid.canBePlacedInWorld();
/*     */     }
/*     */     
/*     */     public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
/* 173 */       if (doFill) {
/* 174 */         World world = (World)position().world().get();
/*     */         
/* 176 */         ExtendedWorld.ExtendedWorld qual$5 = ExtendedWorld$.MODULE$.extendedWorld(world); BlockPosition x$7 = position(); boolean x$8 = qual$5.breakBlock$default$2(); (ExtendedWorld$.MODULE$.extendedWorld(world).isAirBlock(position()) || world.func_72953_d(position().bounds())) ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(qual$5.breakBlock(x$7, x$8));
/* 177 */         ExtendedWorld$.MODULE$.extendedWorld(world).setBlock(position(), resource.getFluid().getBlock());
/*     */         
/* 179 */         ExtendedWorld$.MODULE$.extendedWorld(world).notifyBlockOfNeighborChange(position(), ExtendedWorld$.MODULE$.extendedWorld(world).getBlock(position()));
/*     */       } 
/* 181 */       return (resource != null && resource.getFluid().canBePlacedInWorld() && resource.getFluid().getBlock() != null && resource.amount >= 1000) ? 1000 : 
/*     */         
/* 183 */         0;
/*     */     }
/*     */     public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 186 */       return (FluidTankInfo[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(FluidTankInfo.class));
/*     */     } }
/*     */ 
/*     */   
/*     */   public static interface BlockWrapperBase extends IFluidHandler {
/*     */     FluidStack uncheckedDrain(boolean param1Boolean);
/*     */     
/*     */     FluidStack drain(ForgeDirection param1ForgeDirection, FluidStack param1FluidStack, boolean param1Boolean);
/*     */     
/*     */     FluidStack drain(ForgeDirection param1ForgeDirection, int param1Int, boolean param1Boolean);
/*     */     
/*     */     boolean canFill(ForgeDirection param1ForgeDirection, Fluid param1Fluid);
/*     */     
/*     */     int fill(ForgeDirection param1ForgeDirection, FluidStack param1FluidStack, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\FluidUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */