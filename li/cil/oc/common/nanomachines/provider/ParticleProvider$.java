/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public final class ParticleProvider$ extends ScalaProvider {
/*    */   public static final ParticleProvider$ MODULE$;
/*    */   private final String[] ParticleNames;
/*    */   
/* 11 */   private ParticleProvider$() { super("b48c4bbd-51bb-4915-9367-16cff3220e4b"); MODULE$ = this;
/* 12 */     (new String[13])[0] = 
/* 13 */       "fireworksSpark";
/* 14 */     (new String[13])[1] = "townaura";
/* 15 */     (new String[13])[2] = "smoke";
/* 16 */     (new String[13])[3] = "witchMagic";
/* 17 */     (new String[13])[4] = "note";
/* 18 */     (new String[13])[5] = "enchantmenttable";
/* 19 */     (new String[13])[6] = "flame";
/* 20 */     (new String[13])[7] = "lava";
/* 21 */     (new String[13])[8] = "splash";
/* 22 */     (new String[13])[9] = "reddust";
/* 23 */     (new String[13])[10] = "slime";
/* 24 */     (new String[13])[11] = "heart";
/* 25 */     (new String[13])[12] = "happyVillager";
/*    */     this.ParticleNames = new String[13]; }
/*    */   public final String[] ParticleNames() { return this.ParticleNames; }
/* 28 */   public Iterable<Behavior> createScalaBehaviors(EntityPlayer player) { return (Iterable<Behavior>)scala.Predef$.MODULE$.refArrayOps((Object[])ParticleNames()).map((Function1)new ParticleProvider$$anonfun$createScalaBehaviors$1(player), scala.Array$.MODULE$.fallbackCanBuildFrom(scala.Predef$DummyImplicit$.MODULE$.dummyImplicit())); } public final class ParticleProvider$$anonfun$createScalaBehaviors$1 extends AbstractFunction1<String, ParticleProvider.ParticleBehavior> implements Serializable { public static final long serialVersionUID = 0L; public final ParticleProvider.ParticleBehavior apply(String x$1) { return new ParticleProvider.ParticleBehavior(x$1, this.player$1); }
/*    */      private final EntityPlayer player$1; public ParticleProvider$$anonfun$createScalaBehaviors$1(EntityPlayer player$1) {} }
/*    */   public void writeBehaviorToNBT(Behavior behavior, NBTTagCompound nbt) {
/* 31 */     Behavior behavior1 = behavior;
/* 32 */     if (behavior1 instanceof ParticleProvider.ParticleBehavior) { ParticleProvider.ParticleBehavior particleBehavior = (ParticleProvider.ParticleBehavior)behavior1;
/* 33 */       nbt.func_74778_a("effectName", particleBehavior.effectName()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 34 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public Behavior readBehaviorFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 39 */     String effectName = nbt.func_74779_i("effectName");
/* 40 */     return (Behavior)new ParticleProvider.ParticleBehavior(effectName, player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\ParticleProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */