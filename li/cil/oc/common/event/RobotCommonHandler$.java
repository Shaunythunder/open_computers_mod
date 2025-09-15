/*    */ package li.cil.oc.common.event;
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ public final class RobotCommonHandler$ {
/*    */   @SubscribeEvent
/*    */   public void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate e) {
/* 17 */     if (e.toolAfterUse.func_77984_f()) {
/* 18 */       int damage = e.toolAfterUse.func_77960_j() - e.toolBeforeUse.func_77960_j();
/* 19 */       if (damage > 0) {
/* 20 */         double actualDamage = damage * e.getDamageRate();
/* 21 */         int repairedDamage = (e.agent.player().func_70681_au().nextDouble() > 0.5D) ? (damage - (int)scala.math.package$.MODULE$.floor(actualDamage)) : (damage - (int)scala.math.package$.MODULE$.ceil(actualDamage));
/* 22 */         e.toolAfterUse.func_77964_b(e.toolAfterUse.func_77960_j() - repairedDamage);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   public static final RobotCommonHandler$ MODULE$;
/*    */   @SubscribeEvent
/*    */   public void onRobotMove(RobotMoveEvent.Pre e) {
/* 29 */     if (li.cil.oc.Settings$.MODULE$.get().limitFlightHeight() >= 0) { Agent agent = e.agent;
/* 30 */       if (agent instanceof Robot) { Robot robot = (Robot)agent;
/* 31 */         World world = robot.world();
/* 32 */         IntRef maxFlyingHeight = IntRef.create(li.cil.oc.Settings$.MODULE$.get().limitFlightHeight());
/*    */ 
/*    */         
/* 35 */         IInventory iInventory = robot.equipmentInventory(); ((TraversableLike)((TraversableLike)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), robot.equipmentInventory().func_70302_i_()).map((Function1)new RobotCommonHandler$$anonfun$onRobotMove$4(iInventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 36 */           .map((Function1)new RobotCommonHandler$$anonfun$onRobotMove$5(), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 37 */           .collect((PartialFunction)new RobotCommonHandler$$anonfun$onRobotMove$2(maxFlyingHeight), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()); ((TraversableLike)((TraversableLike)((TraversableLike)scala.runtime.RichInt$.MODULE$
/*    */           
/* 39 */           .until$extension0(scala.Predef$.MODULE$.intWrapper(0), robot.componentCount())
/* 40 */           .map((Function1)new RobotCommonHandler$$anonfun$onRobotMove$1(robot), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 41 */           .map((Function1)new RobotCommonHandler$$anonfun$onRobotMove$6(robot), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 42 */           .map((Function1)new RobotCommonHandler$$anonfun$onRobotMove$7(), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 43 */           .collect((PartialFunction)new RobotCommonHandler$$anonfun$onRobotMove$3(maxFlyingHeight), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 49 */         BlockPosition startPos = li.cil.oc.util.BlockPosition$.MODULE$.apply((EnvironmentHost)robot);
/* 50 */         BlockPosition targetPos = startPos.offset(e.direction);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 59 */         boolean validMove = (isMovingDown$1(e) || bypassesFlightLimit$1(world, maxFlyingHeight) || hasAdjacentBlock$1(startPos, world) || hasAdjacentBlock$1(targetPos, world) || 
/* 60 */           isWithinFlyingHeight$1(startPos, world, maxFlyingHeight));
/*    */ 
/*    */         
/* 63 */         e.setCanceled(true); BoxedUnit boxedUnit = validMove ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */       else
/* 65 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  }
/*    */   
/*    */   } public final class RobotCommonHandler$$anonfun$onRobotMove$4 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/* 68 */     public static final long serialVersionUID = 0L; private final IInventory eta$0$1$1; public final ItemStack apply(int x$1) { return this.eta$0$1$1.func_70301_a(x$1); } public RobotCommonHandler$$anonfun$onRobotMove$4(IInventory eta$0$1$1) {} } private RobotCommonHandler$() { MODULE$ = this; }
/*    */ 
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$5 extends AbstractFunction1<ItemStack, Option<Delegate>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Option<Delegate> apply(ItemStack stack) {
/*    */       return li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$2 extends AbstractPartialFunction<Option<Delegate>, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final IntRef maxFlyingHeight$1;
/*    */     
/*    */     public final <A1 extends Option<Delegate>, B1> B1 applyOrElse(Option x1, Function1 default) {
/*    */       Option option = x1;
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         Delegate item = (Delegate)some.x();
/*    */         if (item instanceof UpgradeHover) {
/*    */           UpgradeHover upgradeHover = (UpgradeHover)item;
/*    */           this.maxFlyingHeight$1.elem = scala.math.package$.MODULE$.max(this.maxFlyingHeight$1.elem, li.cil.oc.Settings$.MODULE$.get().upgradeFlightHeight()[upgradeHover.tier()]);
/*    */           return (B1)BoxedUnit.UNIT;
/*    */         } 
/*    */       } 
/*    */       return (B1)default.apply(x1);
/*    */     }
/*    */     
/*    */     public final boolean isDefinedAt(Option x1) {
/*    */       Option option = x1;
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         Delegate item = (Delegate)some.x();
/*    */         if (item instanceof UpgradeHover)
/*    */           return true; 
/*    */       } 
/*    */       return false;
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$onRobotMove$2(IntRef maxFlyingHeight$1) {}
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$1 extends AbstractFunction1.mcII.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Robot x2$1;
/*    */     
/*    */     public final int apply(int x$1) {
/*    */       return apply$mcII$sp(x$1);
/*    */     }
/*    */     
/*    */     public int apply$mcII$sp(int x$1) {
/*    */       return x$1 + this.x2$1.mainInventory().func_70302_i_() + this.x2$1.equipmentInventory().func_70302_i_();
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$onRobotMove$1(Robot x2$1) {}
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$6 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Robot x2$1;
/*    */     
/*    */     public final ItemStack apply(int x$1) {
/*    */       return this.x2$1.func_70301_a(x$1);
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$onRobotMove$6(Robot x2$1) {}
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$7 extends AbstractFunction1<ItemStack, Option<Delegate>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Option<Delegate> apply(ItemStack stack) {
/*    */       return li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$onRobotMove$3 extends AbstractPartialFunction<Option<Delegate>, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final IntRef maxFlyingHeight$1;
/*    */     
/*    */     public final <A1 extends Option<Delegate>, B1> B1 applyOrElse(Option x2, Function1 default) {
/*    */       Option option = x2;
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         Delegate item = (Delegate)some.x();
/*    */         if (item instanceof UpgradeHover) {
/*    */           UpgradeHover upgradeHover = (UpgradeHover)item;
/*    */           this.maxFlyingHeight$1.elem = scala.math.package$.MODULE$.max(this.maxFlyingHeight$1.elem, li.cil.oc.Settings$.MODULE$.get().upgradeFlightHeight()[upgradeHover.tier()]);
/*    */           return (B1)BoxedUnit.UNIT;
/*    */         } 
/*    */       } 
/*    */       return (B1)default.apply(x2);
/*    */     }
/*    */     
/*    */     public final boolean isDefinedAt(Option x2) {
/*    */       Option option = x2;
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         Delegate item = (Delegate)some.x();
/*    */         if (item instanceof UpgradeHover)
/*    */           return true; 
/*    */       } 
/*    */       return false;
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$onRobotMove$3(IntRef maxFlyingHeight$1) {}
/*    */   }
/*    */   
/*    */   private final boolean isMovingDown$1(RobotMoveEvent.Pre e$1) {
/*    */     ForgeDirection forgeDirection = ForgeDirection.DOWN;
/*    */     if (e$1.direction == null) {
/*    */       if (forgeDirection != null);
/*    */     } else if (e$1.direction.equals(forgeDirection)) {
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   private final boolean bypassesFlightLimit$1(World world$1, IntRef maxFlyingHeight$1) {
/*    */     return (maxFlyingHeight$1.elem >= world$1.func_72800_K());
/*    */   }
/*    */   
/*    */   private final boolean hasAdjacentBlock$1(BlockPosition pos, World world$1) {
/*    */     return scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).exists((Function1)new RobotCommonHandler$$anonfun$hasAdjacentBlock$1$1(world$1, pos));
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$hasAdjacentBlock$1$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final World world$1;
/*    */     private final BlockPosition pos$1;
/*    */     
/*    */     public final boolean apply(ForgeDirection side) {
/*    */       return li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(this.world$1).isSideSolid(this.pos$1.offset(side), side.getOpposite());
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$hasAdjacentBlock$1$1(World world$1, BlockPosition pos$1) {}
/*    */   }
/*    */   
/*    */   private final boolean isWithinFlyingHeight$1(BlockPosition pos, World world$1, IntRef maxFlyingHeight$1) {
/*    */     return scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(1), maxFlyingHeight$1.elem).exists((Function1)new RobotCommonHandler$$anonfun$isWithinFlyingHeight$1$1(world$1, pos));
/*    */   }
/*    */   
/*    */   public final class RobotCommonHandler$$anonfun$isWithinFlyingHeight$1$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final World world$1;
/*    */     private final BlockPosition pos$2;
/*    */     
/*    */     public final boolean apply(int n) {
/*    */       return apply$mcZI$sp(n);
/*    */     }
/*    */     
/*    */     public boolean apply$mcZI$sp(int n) {
/*    */       return !li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(this.world$1).isAirBlock(this.pos$2.offset(ForgeDirection.DOWN, n));
/*    */     }
/*    */     
/*    */     public RobotCommonHandler$$anonfun$isWithinFlyingHeight$1$1(World world$1, BlockPosition pos$2) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\RobotCommonHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */