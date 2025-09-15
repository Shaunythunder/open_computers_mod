/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.potion.Potion;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ 
/*    */ public final class PotionProvider$ extends ScalaProvider {
/*    */   public static final PotionProvider$ MODULE$;
/*    */   private Set<Potion> PotionWhitelist;
/*    */   private volatile boolean bitmap$0;
/*    */   
/*    */   private PotionProvider$() {
/* 15 */     super("c29e4eec-5a46-479a-9b3d-ad0f06da784a"); MODULE$ = this;
/*    */   }
/* 17 */   private Set PotionWhitelist$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.PotionWhitelist = filterPotions((Iterable<?>)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(li.cil.oc.Settings$.MODULE$.get().nanomachinePotionWhitelist())); this.bitmap$0 = true; }  return this.PotionWhitelist; }  } public Set<Potion> PotionWhitelist() { return this.bitmap$0 ? this.PotionWhitelist : PotionWhitelist$lzycompute(); } public final class PotionProvider$$anonfun$filterPotions$2 extends AbstractFunction1<T, Option<Potion>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final Option<Potion> apply(Object x0$1) { scala.None$ none$; Object object = x0$1; if (object instanceof String) { String str = (String)object; Option option = scala.Predef$.MODULE$.refArrayOps((Object[])Potion.field_76425_a).find((Function1)new PotionProvider$$anonfun$filterPotions$2$$anonfun$apply$1(this, str)); }
/*    */       else { if (object instanceof Number) {
/*    */           Number number = (Number)object; if (number.intValue() >= 0 && number.intValue() < Potion.field_76425_a.length)
/*    */             return scala.Option$.MODULE$.apply(Potion.field_76425_a[number.intValue()]); 
/*    */         }  none$ = scala.None$.MODULE$; }
/*    */        return (Option<Potion>)none$; } public final class PotionProvider$$anonfun$filterPotions$2$$anonfun$apply$1 extends AbstractFunction1<Potion, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; private final String x2$1; public final boolean apply(Potion p) { // Byte code:
/*    */         //   0: aload_1
/*    */         //   1: ifnull -> 36
/*    */         //   4: aload_1
/*    */         //   5: invokevirtual func_76393_a : ()Ljava/lang/String;
/*    */         //   8: aload_0
/*    */         //   9: getfield x2$1 : Ljava/lang/String;
/*    */         //   12: astore_2
/*    */         //   13: dup
/*    */         //   14: ifnonnull -> 25
/*    */         //   17: pop
/*    */         //   18: aload_2
/*    */         //   19: ifnull -> 32
/*    */         //   22: goto -> 36
/*    */         //   25: aload_2
/*    */         //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */         //   29: ifeq -> 36
/*    */         //   32: iconst_1
/*    */         //   33: goto -> 37
/*    */         //   36: iconst_0
/*    */         //   37: ireturn
/*    */         // Line number table:
/*    */         //   Java source line number -> byte code offset
/*    */         //   #21	-> 0
/*    */         // Local variable table:
/*    */         //   start	length	slot	name	descriptor
/*    */         //   0	38	0	this	Lli/cil/oc/common/nanomachines/provider/PotionProvider$$anonfun$filterPotions$2$$anonfun$apply$1;
/*    */         //   0	38	1	p	Lnet/minecraft/potion/Potion; }
/*    */       public PotionProvider$$anonfun$filterPotions$2$$anonfun$apply$1(PotionProvider$$anonfun$filterPotions$2 $outer, String x2$1) {} } }
/* 26 */   public <T> Set<Potion> filterPotions(Iterable list) { return ((TraversableOnce)((TraversableLike)list.map((Function1)new PotionProvider$$anonfun$filterPotions$2(), scala.collection.Iterable$.MODULE$.canBuildFrom())).collect((PartialFunction)new PotionProvider$$anonfun$filterPotions$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())).toSet(); }
/*    */ 
/*    */   
/* 29 */   public boolean isPotionEligible(Potion potion) { return (potion != null && PotionWhitelist().contains(potion)); }
/*    */   public final class PotionProvider$$anonfun$filterPotions$1 extends AbstractPartialFunction<Option<Potion>, Potion> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/* 32 */     public final <A1 extends Option<Potion>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; Potion potion = (Potion)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } } public Iterable<Behavior> createScalaBehaviors(EntityPlayer player) { return (Iterable<Behavior>)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])Potion.field_76425_a).filter((Function1)new PotionProvider$$anonfun$createScalaBehaviors$1())).map((Function1)new PotionProvider$$anonfun$createScalaBehaviors$2(player), scala.Array$.MODULE$.fallbackCanBuildFrom(scala.Predef$DummyImplicit$.MODULE$.dummyImplicit())); } public final class PotionProvider$$anonfun$createScalaBehaviors$1 extends AbstractFunction1<Potion, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Potion potion) { return PotionProvider$.MODULE$.isPotionEligible(potion); } } public final class PotionProvider$$anonfun$createScalaBehaviors$2 extends AbstractFunction1<Potion, PotionProvider.PotionBehavior> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final PotionProvider.PotionBehavior apply(Potion x$1) { return new PotionProvider.PotionBehavior(x$1, this.player$1); }
/*    */     
/*    */     public PotionProvider$$anonfun$createScalaBehaviors$2(EntityPlayer player$1) {} }
/*    */   public void writeBehaviorToNBT(Behavior behavior, NBTTagCompound nbt) {
/* 36 */     Behavior behavior1 = behavior;
/* 37 */     if (behavior1 instanceof PotionProvider.PotionBehavior) { PotionProvider.PotionBehavior potionBehavior = (PotionProvider.PotionBehavior)behavior1;
/* 38 */       nbt.func_74768_a("potionId", (potionBehavior.potion()).field_76415_H); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 39 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public PotionProvider.PotionBehavior readBehaviorFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 44 */     int potionId = nbt.func_74762_e("potionId");
/* 45 */     return new PotionProvider.PotionBehavior(Potion.field_76425_a[potionId], player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\PotionProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */