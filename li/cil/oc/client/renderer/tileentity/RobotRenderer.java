/*     */ package li.cil.oc.client.renderer.tileentity;
/*     */ 
/*     */ import li.cil.oc.api.driver.item.UpgradeRenderer;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Mt!B\001\003\021\003y\021!\004*pE>$(+\0328eKJ,'O\003\002\004\t\005QA/\0337fK:$\030\016^=\013\005\0251\021\001\003:f]\022,'/\032:\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021QBU8c_R\024VM\0343fe\026\0248CA\t\025!\t)R$D\001\027\025\t\031qC\003\002\0061)\021q!\007\006\0035m\t\021\"\\5oK\016\024\030M\032;\013\003q\t1A\\3u\023\tqbCA\rUS2,WI\034;jif\034\006/Z2jC2\024VM\0343fe\026\024\b\"\002\021\022\t\003\t\023A\002\037j]&$h\bF\001\020\021\035\031\023C1A\005\n\021\n1\002Z5ta2\f\027\020T5tiV\tQ\005\005\002'S5\tqEC\001)\003\025\0318-\0317b\023\tQsEA\002J]RDa\001L\t!\002\023)\023\001\0043jgBd\027-\037'jgR\004\003b\002\030\022\005\004%IaL\001\f[>,h\016\036)pS:$8/F\0011!\r1\023gM\005\003e\035\022Q!\021:sCf\004\"\001\016\037\017\005URT\"\001\034\013\005]B\024!B3wK:$(BA\035\t\003\r\t\007/[\005\003wY\n\001CU8c_R\024VM\0343fe\0263XM\034;\n\005ur$AC'pk:$\bk\\5oi*\0211H\016\005\007\001F\001\013\021\002\031\002\0315|WO\034;Q_&tGo\035\021\t\017\t\013\"\031!C\005\007\006y1\017\\8u\035\006lW-T1qa&tw-F\001E!\021)%\nT\023\016\003\031S!a\022%\002\023%lW.\036;bE2,'BA%(\003)\031w\016\0347fGRLwN\\\005\003\027\032\0231!T1q!\ti%+D\001O\025\ty\005+\001\003mC:<'\"A)\002\t)\fg/Y\005\003':\023aa\025;sS:<\007BB+\022A\003%A)\001\ttY>$h*Y7f\033\006\004\b/\0338hA!9q+\005b\001\n\023A\026aA4baV\t\021\f\005\002'5&\0211l\n\002\006\r2|\027\r\036\005\007;F\001\013\021B-\002\t\035\f\007\017\t\005\b?F\021\r\021\"\003Y\003\t9G\017\003\004b#\001\006I!W\001\004OR\004\003bB2\022\005\004%I\001W\001\003O\nDa!Z\t!\002\023I\026aA4cA!)q-\005C\005Q\0061an\034:nC2$\"!\0337\021\005\031R\027BA6(\005\021)f.\033;\t\01354\007\031\0018\002\003Y\004\"a\034:\016\003AT!!]\r\002\tU$\030\016\\\005\003gB\024AAV3dg!)Q/\005C\001m\006Y1m\\7qS2,G*[:u)\005I\007\"\002=\022\t\003I\030\001\005:fg\026$Xj\\;oiB{\027N\034;t)\tI'\020C\003|o\002\007A0A\004sk:t\027N\\4\021\005\031j\030B\001@(\005\035\021un\0347fC:Dq!!\001\022\t\003\t\031!A\007sK:$WM]\"iCN\034\030n\035\013\bS\006\025\021qCA\021\021%\t9a I\001\002\004\tI!A\003s_\n|G\017\005\003\002\f\005MQBAA\007\025\r\031\021q\002\006\004\003#A\021AB2p[6|g.\003\003\002\026\0055!!\002*pE>$\b\"CA\rB\005\t\031AA\016\003\031ygMZ:fiB\031a%!\b\n\007\005}qE\001\004E_V\024G.\032\005\t\003Gy\b\023!a\001y\006\t\022n\035*v]:LgnZ(wKJ\024\030\016Z3\t\017\005\035\022\003\"\021\002*\005\021\"/\0328eKJ$\026\016\\3F]RLG/_!u)-I\0271FA\035\003{\t\t%!\022\t\021\0055\022Q\005a\001\003_\ta!\0328uSRL\b\003BA\031\003ki!!a\r\013\005\rI\022\002BA\034\003g\021!\002V5mK\026sG/\033;z\021!\tY$!\nA\002\005m\021!\001=\t\021\005}\022Q\005a\001\0037\t\021!\037\005\t\003\007\n)\0031\001\002\034\005\t!\020C\004\002H\005\025\002\031A-\002\003\031D\021\"a\023\022#\003%\t!!\024\002/I,g\016Z3s\007\"\f7o]5tI\021,g-Y;mi\022\nTCAA(U\021\tI!!\025,\005\005M\003\003BA+\003?j!!a\026\013\t\005e\0231L\001\nk:\034\007.Z2lK\022T1!!\030(\003)\tgN\\8uCRLwN\\\005\005\003C\n9FA\tv]\016DWmY6fIZ\013'/[1oG\026D\021\"!\032\022#\003%\t!a\032\002/I,g\016Z3s\007\"\f7o]5tI\021,g-Y;mi\022\022TCAA5U\021\tY\"!\025\t\023\0055\024#%A\005\002\005=\024a\006:f]\022,'o\0215bgNL7\017\n3fM\006,H\016\036\0234+\t\t\tHK\002}\003#\002")
/*     */ public final class RobotRenderer {
/*     */   public static boolean renderChassis$default$3() {
/*     */     return RobotRenderer$.MODULE$.renderChassis$default$3();
/*     */   }
/*     */   
/*     */   public static double renderChassis$default$2() {
/*     */     return RobotRenderer$.MODULE$.renderChassis$default$2();
/*     */   }
/*     */   
/*     */   public static Robot renderChassis$default$1() {
/*     */     return RobotRenderer$.MODULE$.renderChassis$default$1();
/*     */   }
/*     */   
/*     */   public static void renderTileEntityAt(TileEntity paramTileEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*     */     RobotRenderer$.MODULE$.func_147500_a(paramTileEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*     */   }
/*     */   
/*     */   public static void renderChassis(Robot paramRobot, double paramDouble, boolean paramBoolean) {
/*     */     RobotRenderer$.MODULE$.renderChassis(paramRobot, paramDouble, paramBoolean);
/*     */   }
/*     */   
/*     */   public static void resetMountPoints(boolean paramBoolean) {
/*     */     RobotRenderer$.MODULE$.resetMountPoints(paramBoolean);
/*     */   }
/*     */   
/*     */   public static void compileList() {
/*     */     RobotRenderer$.MODULE$.compileList();
/*     */   }
/*     */   
/*     */   public static FontRenderer func_147498_b() {
/*     */     return RobotRenderer$.MODULE$.func_147498_b();
/*     */   }
/*     */   
/*     */   public static void func_147496_a(World paramWorld) {
/*     */     RobotRenderer$.MODULE$.func_147496_a(paramWorld);
/*     */   }
/*     */   
/*     */   public static void func_147497_a(TileEntityRendererDispatcher paramTileEntityRendererDispatcher) {
/*     */     RobotRenderer$.MODULE$.func_147497_a(paramTileEntityRendererDispatcher);
/*     */   }
/*     */   
/*     */   public final class RobotRenderer$$anonfun$2 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable { public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/*  53 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public static final long serialVersionUID = 0L; } public final class RobotRenderer$$anonfun$3 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String name = (String)tuple2._1(); int index = tuple2._2$mcI$sp();
/*  54 */         RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[index] = new RobotRenderEvent.MountPoint(name); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      }
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
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemStack stack$1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemRenderer itemRenderer$1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final int pass$1;
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
/*     */     public final void apply(int fakePass)
/*     */     {
/* 417 */       apply$mcVI$sp(fakePass); } public RobotRenderer$$anonfun$renderTileEntityAt$1(ItemStack stack$1, ItemRenderer itemRenderer$1, int pass$1) {} public void apply$mcVI$sp(int fakePass) {
/* 418 */       RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$renderPass$1(this.stack$1, this.itemRenderer$1, this.pass$1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class RobotRenderer$$anonfun$slotMapping$lzycompute$1$1
/*     */     extends AbstractFunction0<Tuple2<ItemStack, UpgradeRenderer>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Tuple2<ItemStack, UpgradeRenderer> apply() {
/* 441 */       return null;
/*     */     } } public final class RobotRenderer$$anonfun$4 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Robot robot$1;
/* 443 */     public final ItemStack apply(int slot) { return this.robot$1.func_70301_a(slot); } public RobotRenderer$$anonfun$4(Robot robot$1) {} } public final class RobotRenderer$$anonfun$1 extends AbstractPartialFunction<ItemStack, Tuple2<ItemStack, UpgradeRenderer>> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { Object object;
/* 444 */       ItemStack itemStack = x1; if (itemStack != null && itemStack.func_77973_b() instanceof UpgradeRenderer) { object = new Tuple2(itemStack, itemStack.func_77973_b()); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(ItemStack x1) { boolean bool; ItemStack itemStack = x1; if (itemStack != null && itemStack.func_77973_b() instanceof UpgradeRenderer) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$2 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/* 446 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$3 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Robot robot$1; private final ObjectRef availableSlots$lzy$1; private final ObjectRef wildcardRenderers$lzy$1; private final ObjectRef slotMapping$lzy$1; private final VolatileByteRef bitmap$0$1; public final Object apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); UpgradeRenderer renderer = (UpgradeRenderer)tuple2._2();
/* 447 */         String preferredSlot = renderer.computePreferredMountPoint(stack, (Robot)this.robot$1, WrapAsJava$.MODULE$.mutableSetAsJavaSet(RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$availableSlots$1(this.availableSlots$lzy$1, this.bitmap$0$1)));
/* 448 */         if (RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$availableSlots$1(this.availableSlots$lzy$1, this.bitmap$0$1).remove(preferredSlot)) {
/* 449 */           RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)[BoxesRunTime.unboxToInt(RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping().apply(preferredSlot))] = new Tuple2(stack, renderer);
/*     */         } else {
/* 451 */           String str = "any"; if (preferredSlot == null) { if (str != null); } else if (preferredSlot.equals(str)) {  } 
/* 452 */         }  return new Tuple2(stack, renderer); }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public RobotRenderer$$anonfun$renderTileEntityAt$3(Robot robot$1, ObjectRef availableSlots$lzy$1, ObjectRef wildcardRenderers$lzy$1, ObjectRef slotMapping$lzy$1, VolatileByteRef bitmap$0$1) {} }
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$4 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef firstEmpty$1;
/* 457 */     public final boolean apply(Tuple2 entry) { return (this.firstEmpty$1.elem >= 0); } public RobotRenderer$$anonfun$renderTileEntityAt$4(IntRef firstEmpty$1) {} } public final class RobotRenderer$$anonfun$renderTileEntityAt$5 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef slotMapping$lzy$1; private final IntRef firstEmpty$1; private final VolatileByteRef bitmap$0$1; public RobotRenderer$$anonfun$renderTileEntityAt$5(ObjectRef slotMapping$lzy$1, IntRef firstEmpty$1, VolatileByteRef bitmap$0$1) {} public final void apply(Tuple2 entry) {
/* 458 */       RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)[this.firstEmpty$1.elem] = entry;
/* 459 */       this.firstEmpty$1.elem = Predef$.MODULE$.refArrayOps((Object[])RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)).indexOf(null);
/*     */     } }
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$6 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>[], ArrayOps<Tuple2<ItemStack, UpgradeRenderer>>> implements Serializable { public static final long serialVersionUID = 0L;
/* 462 */     public final ArrayOps<Tuple2<ItemStack, UpgradeRenderer>> apply(Tuple2[] xs) { return Predef$.MODULE$.refArrayOps((Object[])xs); } } public final class RobotRenderer$$anonfun$renderTileEntityAt$7 extends AbstractFunction1<RobotRenderEvent.MountPoint[], ArrayOps<RobotRenderEvent.MountPoint>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<RobotRenderEvent.MountPoint> apply(RobotRenderEvent.MountPoint[] xs) { return Predef$.MODULE$.refArrayOps((Object[])xs); } } public final class RobotRenderer$$anonfun$renderTileEntityAt$8 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool; Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$9 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$5) { Tuple2 tuple2 = x$5; if (tuple2 != null) { Tuple2 info = (Tuple2)tuple2._1(); return !(info == null); }  throw new MatchError(tuple2); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$10 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final float f$1;
/*     */     private final Robot robot$1;
/*     */     
/*     */     public final void apply(Tuple2 x$6) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 138
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast scala/Tuple2
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   18: checkcast li/cil/oc/api/event/RobotRenderEvent$MountPoint
/*     */       //   21: astore #4
/*     */       //   23: aload_3
/*     */       //   24: astore #8
/*     */       //   26: aload #8
/*     */       //   28: ifnull -> 128
/*     */       //   31: aload #8
/*     */       //   33: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   36: checkcast net/minecraft/item/ItemStack
/*     */       //   39: astore #9
/*     */       //   41: aload #8
/*     */       //   43: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   46: checkcast li/cil/oc/api/driver/item/UpgradeRenderer
/*     */       //   49: astore #10
/*     */       //   51: new scala/Tuple2
/*     */       //   54: dup
/*     */       //   55: aload #9
/*     */       //   57: aload #10
/*     */       //   59: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   62: astore #11
/*     */       //   64: aload #11
/*     */       //   66: astore #7
/*     */       //   68: aload #7
/*     */       //   70: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   73: checkcast net/minecraft/item/ItemStack
/*     */       //   76: astore #12
/*     */       //   78: aload #7
/*     */       //   80: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   83: checkcast li/cil/oc/api/driver/item/UpgradeRenderer
/*     */       //   86: astore #13
/*     */       //   88: invokestatic glPushMatrix : ()V
/*     */       //   91: ldc 0.5
/*     */       //   93: ldc 0.5
/*     */       //   95: ldc 0.5
/*     */       //   97: invokestatic glTranslatef : (FFF)V
/*     */       //   100: aload #13
/*     */       //   102: aload #12
/*     */       //   104: aload #4
/*     */       //   106: aload_0
/*     */       //   107: getfield robot$1 : Lli/cil/oc/common/tileentity/Robot;
/*     */       //   110: aload_0
/*     */       //   111: getfield f$1 : F
/*     */       //   114: invokeinterface render : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;Lli/cil/oc/api/internal/Robot;F)V
/*     */       //   119: invokestatic glPopMatrix : ()V
/*     */       //   122: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   125: goto -> 175
/*     */       //   128: new scala/MatchError
/*     */       //   131: dup
/*     */       //   132: aload #8
/*     */       //   134: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   137: athrow
/*     */       //   138: new scala/MatchError
/*     */       //   141: dup
/*     */       //   142: aload_2
/*     */       //   143: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   146: athrow
/*     */       //   147: astore #6
/*     */       //   149: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   152: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   155: ldc 'Failed rendering equipped upgrade.'
/*     */       //   157: aload #6
/*     */       //   159: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   164: aload_0
/*     */       //   165: getfield robot$1 : Lli/cil/oc/common/tileentity/Robot;
/*     */       //   168: iconst_1
/*     */       //   169: invokevirtual renderingErrored_$eq : (Z)V
/*     */       //   172: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   175: astore #5
/*     */       //   177: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #462	-> 0
/*     */       //   #463	-> 23
/*     */       //   #464	-> 88
/*     */       //   #465	-> 91
/*     */       //   #466	-> 100
/*     */       //   #467	-> 119
/*     */       //   #463	-> 128
/*     */       //   #462	-> 138
/*     */       //   #470	-> 147
/*     */       //   #471	-> 149
/*     */       //   #472	-> 164
/*     */       //   #462	-> 175
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	178	0	this	Lli/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$10;
/*     */       //   0	178	1	x$6	Lscala/Tuple2;
/*     */       //   14	164	3	info	Lscala/Tuple2;
/*     */       //   23	155	4	mountPoint	Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;
/*     */       //   41	137	9	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   51	127	10	renderer	Lli/cil/oc/api/driver/item/UpgradeRenderer;
/*     */       //   78	47	12	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   88	37	13	renderer	Lli/cil/oc/api/driver/item/UpgradeRenderer;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   23	138	147	finally
/*     */     }
/*     */     
/*     */     public RobotRenderer$$anonfun$renderTileEntityAt$10(float f$1, Robot robot$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RobotRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */