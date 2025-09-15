/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.common.item.HoverBoots;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i<Q!\001\002\t\0025\t\021\003S8wKJ\024un\034;t\021\006tG\r\\3s\025\t\031A!A\003fm\026tGO\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005EAuN^3s\005>|Go\035%b]\022dWM]\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\025ar\002\"\001\036\0039yg\016T5wS:<W\013\0353bi\026$\"AH\021\021\005My\022B\001\021\025\005\021)f.\033;\t\013\tZ\002\031A\022\002\003\025\004\"\001J\037\017\005\025RdB\001\0248\035\t9CG\004\002)e9\021\021f\f\b\003U5j\021a\013\006\003Y1\ta\001\020:p_Rt\024\"\001\030\002\0079,G/\003\0021c\005qQ.\0338fGJ\fg\r\0364pe\036,'\"\001\030\n\005\r\031$B\001\0312\023\t)d'\001\004f]RLG/\037\006\003\007MJ!\001O\035\002\r1Lg/\0338h\025\t)d'\003\002<y\005YA*\033<j]\036,e/\0328u\025\tA\024(\003\002?\t\tB*\033<j]\036,\006\017Z1uK\0263XM\034;\013\005mb\004FA\016B!\t\021E*D\001D\025\t!U)\001\007fm\026tG\017[1oI2,'O\003\002\006\r*\021q\tS\001\004M6d'BA%K\003\021iw\016Z:\013\003-\0131a\0319x\023\ti5I\001\bTk\n\0348M]5cK\0263XM\034;\t\013={A\021\001)\002\031=tG*\033<j]\036TU/\0349\025\005y\t\006\"\002\022O\001\004\021\006C\001\023T\023\t!vHA\bMSZLgn\032&v[B,e/\0328uQ\tq\025\tC\003X\037\021\005\001,\001\007p]2Kg/\0338h\r\006dG\016\006\002\0373\")!E\026a\0015B\0211\fX\007\002y%\021Q\f\020\002\020\031&4\030N\\4GC2dWI^3oi\"\022a+\021\005\006A>!I!Y\001\016KF,\030\016\0359fI\006\023Xn\034:\025\005\t\024\bcA2iU6\tAM\003\002fM\006I\021.\\7vi\006\024G.\032\006\003OR\t!bY8mY\026\034G/[8o\023\tIGM\001\006J]\022,\0070\0323TKF\004\"a\0339\016\0031T!!\0348\002\t%$X-\034\006\003_F\n\021\"\\5oK\016\024\030M\032;\n\005Ed'!C%uK6\034F/Y2l\021\025\031x\f1\001u\003\031\001H.Y=feB\021Q\017_\007\002m*\0211o\036\006\003k9L!!\037<\003\031\025sG/\033;z!2\f\0270\032:")
/*    */ public final class HoverBootsHandler {
/*    */   @SubscribeEvent
/*    */   public static void onLivingFall(LivingFallEvent paramLivingFallEvent) {
/*    */     HoverBootsHandler$.MODULE$.onLivingFall(paramLivingFallEvent);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onLivingJump(LivingEvent.LivingJumpEvent paramLivingJumpEvent) {
/*    */     HoverBootsHandler$.MODULE$.onLivingJump(paramLivingJumpEvent);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onLivingUpdate(LivingEvent.LivingUpdateEvent paramLivingUpdateEvent) {
/*    */     HoverBootsHandler$.MODULE$.onLivingUpdate(paramLivingUpdateEvent);
/*    */   }
/*    */   
/*    */   public final class HoverBootsHandler$$anonfun$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final EntityPlayer x2$1;
/*    */     
/*    */     public final boolean apply(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   4: astore_2
/*    */       //   5: aload_2
/*    */       //   6: instanceof li/cil/oc/common/item/HoverBoots
/*    */       //   9: ifeq -> 198
/*    */       //   12: aload_2
/*    */       //   13: checkcast li/cil/oc/common/item/HoverBoots
/*    */       //   16: astore_3
/*    */       //   17: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */       //   20: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */       //   23: invokevirtual ignorePower : ()Z
/*    */       //   26: ifne -> 188
/*    */       //   29: aload_0
/*    */       //   30: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   33: getfield field_70122_E : Z
/*    */       //   36: ifeq -> 165
/*    */       //   39: aload_0
/*    */       //   40: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   43: getfield field_71075_bZ : Lnet/minecraft/entity/player/PlayerCapabilities;
/*    */       //   46: getfield field_75098_d : Z
/*    */       //   49: ifne -> 165
/*    */       //   52: aload_0
/*    */       //   53: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   56: getfield field_70170_p : Lnet/minecraft/world/World;
/*    */       //   59: invokevirtual func_82737_E : ()J
/*    */       //   62: l2d
/*    */       //   63: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */       //   66: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */       //   69: invokevirtual tickFrequency : ()D
/*    */       //   72: drem
/*    */       //   73: iconst_0
/*    */       //   74: i2d
/*    */       //   75: dcmpl
/*    */       //   76: ifne -> 165
/*    */       //   79: aload_0
/*    */       //   80: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   83: getfield field_70159_w : D
/*    */       //   86: aload_0
/*    */       //   87: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   90: getfield field_70159_w : D
/*    */       //   93: dmul
/*    */       //   94: aload_0
/*    */       //   95: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   98: getfield field_70181_x : D
/*    */       //   101: aload_0
/*    */       //   102: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   105: getfield field_70181_x : D
/*    */       //   108: dmul
/*    */       //   109: dadd
/*    */       //   110: aload_0
/*    */       //   111: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   114: getfield field_70179_y : D
/*    */       //   117: aload_0
/*    */       //   118: getfield x2$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   121: getfield field_70179_y : D
/*    */       //   124: dmul
/*    */       //   125: dadd
/*    */       //   126: dstore #5
/*    */       //   128: dload #5
/*    */       //   130: ldc2_w 0.014999999664723873
/*    */       //   133: dcmpl
/*    */       //   134: ifle -> 159
/*    */       //   137: aload_3
/*    */       //   138: aload_1
/*    */       //   139: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */       //   142: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */       //   145: invokevirtual hoverBootMove : ()D
/*    */       //   148: dneg
/*    */       //   149: iconst_0
/*    */       //   150: invokevirtual charge : (Lnet/minecraft/item/ItemStack;DZ)D
/*    */       //   153: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*    */       //   156: goto -> 168
/*    */       //   159: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   162: goto -> 168
/*    */       //   165: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   168: pop
/*    */       //   169: aload_3
/*    */       //   170: aload_1
/*    */       //   171: invokevirtual getCharge : (Lnet/minecraft/item/ItemStack;)D
/*    */       //   174: iconst_0
/*    */       //   175: i2d
/*    */       //   176: dcmpl
/*    */       //   177: ifle -> 184
/*    */       //   180: iconst_1
/*    */       //   181: goto -> 185
/*    */       //   184: iconst_0
/*    */       //   185: ifeq -> 192
/*    */       //   188: iconst_1
/*    */       //   189: goto -> 193
/*    */       //   192: iconst_0
/*    */       //   193: istore #4
/*    */       //   195: goto -> 201
/*    */       //   198: iconst_0
/*    */       //   199: istore #4
/*    */       //   201: iload #4
/*    */       //   203: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #18	-> 0
/*    */       //   #19	-> 5
/*    */       //   #20	-> 17
/*    */       //   #21	-> 29
/*    */       //   #22	-> 79
/*    */       //   #23	-> 128
/*    */       //   #24	-> 137
/*    */       //   #23	-> 159
/*    */       //   #21	-> 165
/*    */       //   #27	-> 169
/*    */       //   #20	-> 188
/*    */       //   #29	-> 198
/*    */       //   #18	-> 201
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	204	0	this	Lli/cil/oc/common/event/HoverBootsHandler$$anonfun$1;
/*    */       //   0	204	1	stack	Lnet/minecraft/item/ItemStack;
/*    */       //   128	76	5	velocity	D
/*    */     }
/*    */     
/*    */     public HoverBootsHandler$$anonfun$1(EntityPlayer x2$1) {}
/*    */   }
/*    */   
/*    */   public final class HoverBootsHandler$$anonfun$onLivingJump$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final EntityPlayer x2$2;
/*    */     
/*    */     public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { Object object;
/* 44 */       ItemStack itemStack = x1;
/* 45 */       if (itemStack.func_77973_b() instanceof HoverBoots) {
/* 46 */         HoverBoots boots = (HoverBoots)itemStack.func_77973_b();
/* 47 */         double hoverJumpCost = -Settings$.MODULE$.get().hoverBootJump();
/* 48 */         boolean isCreative = (Settings$.MODULE$.get().ignorePower() || this.x2$2.field_71075_bZ.field_75098_d);
/*    */         
/* 50 */         isCreative ? BoxedUnit.UNIT : BoxesRunTime.boxToDouble(boots.charge(itemStack, hoverJumpCost, false));
/*    */         
/* 52 */         this.x2$2.func_70024_g(this.x2$2.field_70159_w * 0.5D, 0.4D, this.x2$2.field_70179_y * 0.5D);
/*    */         
/* 54 */         this.x2$2.func_70024_g(0.0D, 0.4D, 0.0D); object = (isCreative || boots.charge(itemStack, hoverJumpCost, true) == false) ? (this.x2$2.func_70051_ag() ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*    */       } else {
/*    */         object = default.apply(x1);
/*    */       }  return (B1)object; } public final boolean isDefinedAt(ItemStack x1) { boolean bool; ItemStack itemStack = x1; if (itemStack.func_77973_b() instanceof HoverBoots) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       }  return bool; } public HoverBootsHandler$$anonfun$onLivingJump$1(EntityPlayer x2$2) {} } public final class HoverBootsHandler$$anonfun$onLivingFall$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final LivingFallEvent e$1; private final EntityPlayer x2$3;
/*    */     public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x2, Function1 default) { Object object;
/* 63 */       ItemStack itemStack = x2;
/* 64 */       if (itemStack.func_77973_b() instanceof HoverBoots)
/* 65 */       { HoverBoots boots = (HoverBoots)itemStack.func_77973_b();
/* 66 */         double hoverFallCost = -Settings$.MODULE$.get().hoverBootAbsorb();
/* 67 */         boolean isCreative = (Settings$.MODULE$.get().ignorePower() || this.x2$3.field_71075_bZ.field_75098_d);
/*    */         
/* 69 */         isCreative ? BoxedUnit.UNIT : BoxesRunTime.boxToDouble(boots.charge(itemStack, hoverFallCost, false));
/* 70 */         this.e$1.distance *= 0.3F; object = (isCreative || boots.charge(itemStack, hoverFallCost, true) == false) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */       else { object = default.apply(x2); }
/*    */        return (B1)object; } public final boolean isDefinedAt(ItemStack x2) { boolean bool; ItemStack itemStack = x2; if (itemStack.func_77973_b() instanceof HoverBoots) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/*    */        return bool; } public HoverBootsHandler$$anonfun$onLivingFall$1(LivingFallEvent e$1, EntityPlayer x2$3) {} }
/* 76 */    public final class HoverBootsHandler$$anonfun$equippedArmor$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(int x$1) { return this.player$1.func_71124_b(x$1); } private final EntityPlayer player$1; public HoverBootsHandler$$anonfun$equippedArmor$1(EntityPlayer player$1) {} } public final class HoverBootsHandler$$anonfun$equippedArmor$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\HoverBootsHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */