/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ 
/*    */ public final class HungryProvider$ extends ScalaProvider {
/*    */   public static final HungryProvider$ MODULE$;
/*    */   private final int FillCount;
/*    */   private final DamageSource HungryDamage;
/*    */   
/*    */   public final int FillCount() {
/*    */     return 10;
/*    */   }
/*    */   
/* 12 */   private HungryProvider$() { super("d697c24a-014c-4773-a288-23084a59e9e8"); MODULE$ = this;
/*    */ 
/*    */     
/* 15 */     this.HungryDamage = (new DamageSourceWithRandomCause("oc.nanomachinesHungry", 3))
/* 16 */       .func_76348_h()
/* 17 */       .func_151518_m(); }
/*    */   public final DamageSource HungryDamage() { return this.HungryDamage; } public Iterable<Behavior> createScalaBehaviors(EntityPlayer player) {
/* 19 */     return (Iterable<Behavior>)scala.package$.MODULE$.Iterable().fill(10, (Function0)new HungryProvider$$anonfun$createScalaBehaviors$1(player)); } public final class HungryProvider$$anonfun$createScalaBehaviors$1 extends AbstractFunction0<HungryProvider.HungryBehavior> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final HungryProvider.HungryBehavior apply() { return new HungryProvider.HungryBehavior(this.player$1); }
/*    */      public HungryProvider$$anonfun$createScalaBehaviors$1(EntityPlayer player$1) {} } public Behavior readBehaviorFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 21 */     return (Behavior)new HungryProvider.HungryBehavior(player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\HungryProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */