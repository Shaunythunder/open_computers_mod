/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.api.event.RobotMoveEvent;
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.common.item.UpgradeHover;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!;Q!\001\002\t\0025\t!CU8c_R\034u.\\7p]\"\013g\016\0327fe*\0211\001B\001\006KZ,g\016\036\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t\021\"k\0342pi\016{W.\\8o\021\006tG\r\\3s'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035AQ\001H\b\005\002u\tac\0348S_\n|G/\0219qYf$\025-\\1hKJ\013G/\032\013\003=\005\002\"aE\020\n\005\001\"\"\001B+oSRDQAI\016A\002\r\n\021!\032\t\003I-r!!J\025\016\003\031R!aA\024\013\005!2\021aA1qS&\021!FJ\001\023%>\024w\016^+tK\022$vn\0347Fm\026tG/\003\002-[\ty\021\t\0359ms\022\013W.Y4f%\006$XM\003\002+M!\0221d\f\t\003aij\021!\r\006\003eM\nA\"\032<f]RD\027M\0343mKJT!!\002\033\013\005U2\024a\0014nY*\021q\007O\001\005[>$7OC\001:\003\r\031\007o^\005\003wE\022abU;cg\016\024\030NY3Fm\026tG\017C\003>\037\021\005a(A\006p]J{'m\034;N_Z,GC\001\020@\021\025\021C\b1\001A!\t\tEI\004\002&\005&\0211IJ\001\017%>\024w\016^'pm\026,e/\0328u\023\t)eIA\002Qe\026T!a\021\024)\005qz\003")
/*    */ public final class RobotCommonHandler {
/*    */   @SubscribeEvent
/*    */   public static void onRobotMove(RobotMoveEvent.Pre paramPre) {
/*    */     RobotCommonHandler$.MODULE$.onRobotMove(paramPre);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate paramApplyDamageRate) {
/*    */     RobotCommonHandler$.MODULE$.onRobotApplyDamageRate(paramApplyDamageRate);
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$4 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 35 */     public final ItemStack apply(int x$1) { return this.eta$0$1$1.func_70301_a(x$1); } private final IInventory eta$0$1$1; public RobotCommonHandler$$anonfun$onRobotMove$4(IInventory eta$0$1$1) {} } public final class RobotCommonHandler$$anonfun$onRobotMove$5 extends AbstractFunction1<ItemStack, Option<Delegate>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<Delegate> apply(ItemStack stack) {
/* 36 */       return Delegator$.MODULE$.subItem(stack); } } public final class RobotCommonHandler$$anonfun$onRobotMove$2 extends AbstractPartialFunction<Option<Delegate>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef maxFlyingHeight$1;
/* 37 */     public final <A1 extends Option<Delegate>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; Delegate item = (Delegate)some.x(); if (item instanceof UpgradeHover) { UpgradeHover upgradeHover = (UpgradeHover)item; this.maxFlyingHeight$1.elem = package$.MODULE$.max(this.maxFlyingHeight$1.elem, Settings$.MODULE$.get().upgradeFlightHeight()[upgradeHover.tier()]); return (B1)BoxedUnit.UNIT; }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; Delegate item = (Delegate)some.x(); if (item instanceof UpgradeHover) return true;  }  return false; }
/*    */      public RobotCommonHandler$$anonfun$onRobotMove$2(IntRef maxFlyingHeight$1) {} }
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$1 extends AbstractFunction1.mcII.sp implements Serializable { public static final long serialVersionUID = 0L; private final Robot x2$1;
/* 40 */     public final int apply(int x$1) { return apply$mcII$sp(x$1); } public int apply$mcII$sp(int x$1) { return x$1 + this.x2$1.mainInventory().func_70302_i_() + this.x2$1.equipmentInventory().func_70302_i_(); } public RobotCommonHandler$$anonfun$onRobotMove$1(Robot x2$1) {} } public final class RobotCommonHandler$$anonfun$onRobotMove$6 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Robot x2$1;
/* 41 */     public final ItemStack apply(int x$1) { return this.x2$1.func_70301_a(x$1); } public RobotCommonHandler$$anonfun$onRobotMove$6(Robot x2$1) {} } public final class RobotCommonHandler$$anonfun$onRobotMove$7 extends AbstractFunction1<ItemStack, Option<Delegate>> implements Serializable { public static final long serialVersionUID = 0L;
/* 42 */     public final Option<Delegate> apply(ItemStack stack) { return Delegator$.MODULE$.subItem(stack); } } public final class RobotCommonHandler$$anonfun$onRobotMove$3 extends AbstractPartialFunction<Option<Delegate>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef maxFlyingHeight$1;
/* 43 */     public final <A1 extends Option<Delegate>, B1> B1 applyOrElse(Option x2, Function1 default) { Option option = x2; if (option instanceof Some) { Some some = (Some)option; Delegate item = (Delegate)some.x(); if (item instanceof UpgradeHover) { UpgradeHover upgradeHover = (UpgradeHover)item; this.maxFlyingHeight$1.elem = package$.MODULE$.max(this.maxFlyingHeight$1.elem, Settings$.MODULE$.get().upgradeFlightHeight()[upgradeHover.tier()]); return (B1)BoxedUnit.UNIT; }  }  return (B1)default.apply(x2); } public final boolean isDefinedAt(Option x2) { Option option = x2; if (option instanceof Some) { Some some = (Some)option; Delegate item = (Delegate)some.x(); if (item instanceof UpgradeHover) return true;  }  return false; }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$onRobotMove$3(IntRef maxFlyingHeight$1) {} }
/*    */   public final class RobotCommonHandler$$anonfun$hasAdjacentBlock$1$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final BlockPosition pos$1;
/* 47 */     public final boolean apply(ForgeDirection side) { return ExtendedWorld$.MODULE$.extendedWorld(this.world$1).isSideSolid(this.pos$1.offset(side), side.getOpposite()); } public RobotCommonHandler$$anonfun$hasAdjacentBlock$1$1(World world$1, BlockPosition pos$1) {} } public final class RobotCommonHandler$$anonfun$isWithinFlyingHeight$1$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final BlockPosition pos$2;
/* 48 */     public final boolean apply(int n) { return apply$mcZI$sp(n); } public boolean apply$mcZI$sp(int n) { return !ExtendedWorld$.MODULE$.extendedWorld(this.world$1).isAirBlock(this.pos$2.offset(ForgeDirection.DOWN, n)); }
/*    */ 
/*    */     
/*    */     public RobotCommonHandler$$anonfun$isWithinFlyingHeight$1$1(World world$1, BlockPosition pos$2) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\RobotCommonHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */