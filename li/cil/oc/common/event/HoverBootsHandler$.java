/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.common.item.HoverBoots;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class HoverBootsHandler$ {
/*    */   public static final HoverBootsHandler$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/* 14 */   public void onLivingUpdate(LivingEvent.LivingUpdateEvent e) { Entity entity = e.entity;
/* 15 */     if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; if (!(entityPlayer instanceof net.minecraftforge.common.util.FakePlayer)) {
/* 16 */         NBTTagCompound nbt = entityPlayer.getEntityData();
/* 17 */         boolean hadHoverBoots = nbt.func_74767_n((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hasHoverBoots").toString());
/* 18 */         boolean hasHoverBoots = (!entityPlayer.func_70093_af() && equippedArmor(entityPlayer).exists((Function1)new HoverBootsHandler$$anonfun$1(entityPlayer)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 31 */         if (hasHoverBoots != hadHoverBoots) {
/* 32 */           nbt.func_74757_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hasHoverBoots").toString(), hasHoverBoots);
/* 33 */           ((Entity)entityPlayer).field_70138_W = hasHoverBoots ? 1.0F : 0.5F;
/*    */         } 
/*    */         
/* 36 */         entityPlayer.field_70181_x *= 0.8999999761581421D; BoxedUnit boxedUnit1 = (hasHoverBoots && !entityPlayer.field_70122_E && entityPlayer.field_70143_R < 5 && entityPlayer.field_70181_x < false) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*    */       }  }
/* 38 */      BoxedUnit boxedUnit = BoxedUnit.UNIT; } public final class HoverBootsHandler$$anonfun$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final EntityPlayer x2$1; public final boolean apply(ItemStack stack) { // Byte code:
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
/*    */       //   128	76	5	velocity	D }
/*    */     public HoverBootsHandler$$anonfun$1(EntityPlayer x2$1) {} }
/*    */   @SubscribeEvent
/* 42 */   public void onLivingJump(LivingEvent.LivingJumpEvent e) { Entity entity = e.entity;
/* 43 */     if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; if (!(entityPlayer instanceof net.minecraftforge.common.util.FakePlayer) && !entityPlayer.func_70093_af()) {
/* 44 */         equippedArmor(entityPlayer).collectFirst((PartialFunction)new HoverBootsHandler$$anonfun$onLivingJump$1(entityPlayer)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         return;
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     BoxedUnit boxedUnit = BoxedUnit.UNIT; } public final class HoverBootsHandler$$anonfun$onLivingJump$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final EntityPlayer x2$2; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { Object object; ItemStack itemStack = x1; if (itemStack.func_77973_b() instanceof HoverBoots) { HoverBoots boots = (HoverBoots)itemStack.func_77973_b(); double hoverJumpCost = -li.cil.oc.Settings$.MODULE$.get().hoverBootJump(); boolean isCreative = (li.cil.oc.Settings$.MODULE$.get().ignorePower() || this.x2$2.field_71075_bZ.field_75098_d); isCreative ? BoxedUnit.UNIT : BoxesRunTime.boxToDouble(boots.charge(itemStack, hoverJumpCost, false)); this.x2$2.func_70024_g(this.x2$2.field_70159_w * 0.5D, 0.4D, this.x2$2.field_70179_y * 0.5D); this.x2$2.func_70024_g(0.0D, 0.4D, 0.0D); object = (isCreative || boots.charge(itemStack, hoverJumpCost, true) == false) ? (this.x2$2.func_70051_ag() ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT; } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(ItemStack x1) { boolean bool; ItemStack itemStack = x1; if (itemStack.func_77973_b() instanceof HoverBoots) { bool = true; } else { bool = false; }
/*    */        return bool; }
/*    */     public HoverBootsHandler$$anonfun$onLivingJump$1(EntityPlayer x2$2) {} }
/* 61 */   @SubscribeEvent public void onLivingFall(LivingFallEvent e) { if (e.distance > 3) { Entity entity = e.entity;
/* 62 */       if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; if (!(entityPlayer instanceof net.minecraftforge.common.util.FakePlayer)) {
/* 63 */           equippedArmor(entityPlayer).collectFirst((PartialFunction)new HoverBootsHandler$$anonfun$onLivingFall$1(e, entityPlayer)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */           
/*    */           return;
/*    */         }  }
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 73 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      }
/*    */   
/* 76 */   private IndexedSeq<ItemStack> equippedArmor(EntityPlayer player) { return (IndexedSeq<ItemStack>)((TraversableLike)scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(1), 4).map((Function1)new HoverBootsHandler$$anonfun$equippedArmor$1(player), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).filter((Function1)new HoverBootsHandler$$anonfun$equippedArmor$2()); } public final class HoverBootsHandler$$anonfun$onLivingFall$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final LivingFallEvent e$1; private final EntityPlayer x2$3; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x2, Function1 default) { Object object; ItemStack itemStack = x2; if (itemStack.func_77973_b() instanceof HoverBoots) { HoverBoots boots = (HoverBoots)itemStack.func_77973_b(); double hoverFallCost = -li.cil.oc.Settings$.MODULE$.get().hoverBootAbsorb(); boolean isCreative = (li.cil.oc.Settings$.MODULE$.get().ignorePower() || this.x2$3.field_71075_bZ.field_75098_d); isCreative ? BoxedUnit.UNIT : BoxesRunTime.boxToDouble(boots.charge(itemStack, hoverFallCost, false)); this.e$1.distance *= 0.3F; object = (isCreative || boots.charge(itemStack, hoverFallCost, true) == false) ? BoxedUnit.UNIT : BoxedUnit.UNIT; } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(ItemStack x2) { boolean bool; ItemStack itemStack = x2; if (itemStack.func_77973_b() instanceof HoverBoots) { bool = true; } else { bool = false; }  return bool; } public HoverBootsHandler$$anonfun$onLivingFall$1(LivingFallEvent e$1, EntityPlayer x2$3) {} } public final class HoverBootsHandler$$anonfun$equippedArmor$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final ItemStack apply(int x$1) { return this.player$1.func_71124_b(x$1); } public HoverBootsHandler$$anonfun$equippedArmor$1(EntityPlayer player$1) {} } public final class HoverBootsHandler$$anonfun$equippedArmor$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); } } private HoverBootsHandler$() {
/* 77 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\HoverBootsHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */