/*    */ package li.cil.oc.common.nanomachines.provider;@ScalaSignature(bytes = "\006\001\005Uq!B\001\003\021\003y\021\001\005)beRL7\r\\3Qe>4\030\016Z3s\025\t\031A!\001\005qe>4\030\016Z3s\025\t)a!\001\007oC:|W.Y2iS:,7O\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001!\t\001\022#D\001\003\r\025\021\"\001#\001\024\005A\001\026M\035;jG2,\007K]8wS\022,'o\005\002\022)A\021\001#F\005\003-\t\021QbU2bY\006\004&o\034<jI\026\024\b\"\002\r\022\t\003I\022A\002\037j]&$h\bF\001\020\021\035Y\022C1A\005\006q\tQ\002U1si&\034G.\032(b[\026\034X#A\017\021\007y\t3%D\001 \025\005\001\023!B:dC2\f\027B\001\022 \005\025\t%O]1z!\t!\023&D\001&\025\t1s%\001\003mC:<'\"\001\025\002\t)\fg/Y\005\003U\025\022aa\025;sS:<\007B\002\027\022A\0035Q$\001\bQCJ$\030n\0317f\035\006lWm\035\021\t\0139\nB\021I\030\002)\r\024X-\031;f'\016\fG.\031\"fQ\0064\030n\034:t)\t\0014\tE\0022sqr!AM\034\017\005M2T\"\001\033\013\005Ur\021A\002\037s_>$h(C\001!\023\tAt$A\004qC\016\\\027mZ3\n\005iZ$\001C%uKJ\f'\r\\3\013\005az\002CA\037B\033\005q$BA\003@\025\t\001\005\"A\002ba&L!A\021 \003\021\t+\007.\031<j_JDQ\001R\027A\002\025\013a\001\0357bs\026\024\bC\001$O\033\0059%B\001#I\025\tI%*\001\004f]RLG/\037\006\003\0272\013\021\"\\5oK\016\024\030M\032;\013\0035\0131A\\3u\023\tyuI\001\007F]RLG/\037)mCf,'\017C\003R#\021\005#+\001\nxe&$XMQ3iCZLwN\035+p\035\n#FcA*W1B\021a\004V\005\003+~\021A!\0268ji\")q\013\025a\001y\005A!-\0325bm&|'\017C\003Z!\002\007!,A\002oER\004\"aW/\016\003qS!!\027&\n\005yc&A\004(C)R\013wmQ8na>,h\016\032\005\006AF!\t%Y\001\024e\026\fGMQ3iCZLwN\035$s_6t%\t\026\013\004y\t\034\007\"\002#`\001\004)\005\"B-`\001\004Qf\001B3\022\001\031\024\001\003U1si&\034G.\032\"fQ\0064\030n\034:\024\005\021<\007C\0015l\033\005I'B\0016@\003\031\001(/\0324bE&\021A.\033\002\021\003\n\034HO]1di\n+\007.\031<j_JD\001B\0343\003\002\004%\ta\\\001\013K\0324Wm\031;OC6,W#\0019\021\005E$hB\001\020s\023\t\031x$\001\004Qe\026$WMZ\005\003UUT!a]\020\t\021]$'\0211A\005\002a\fa\"\0324gK\016$h*Y7f?\022*\027\017\006\002Ts\"9!P^A\001\002\004\001\030a\001=%c!AA\020\032B\001B\003&\001/A\006fM\032,7\r\036(b[\026\004\003\002\003#e\005\003\005\013\021B#\t\013a!G\021A@\025\r\005\005\021QAA\004!\r\t\031\001Z\007\002#!)aN a\001a\")AI a\001\013\"9\0211\0023\005B\0055\021aC4fi:\013W.\032%j]R$\022a\t\005\b\003#!G\021IA\n\003\031)\b\017Z1uKR\t1\013")
/*    */ public final class ParticleProvider { public static Behavior readBehaviorFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound) {
/*    */     return ParticleProvider$.MODULE$.readBehaviorFromNBT(paramEntityPlayer, paramNBTTagCompound);
/*    */   }
/*    */   public static void writeBehaviorToNBT(Behavior paramBehavior, NBTTagCompound paramNBTTagCompound) {
/*    */     ParticleProvider$.MODULE$.writeBehaviorToNBT(paramBehavior, paramNBTTagCompound);
/*    */   }
/*    */   public static Iterable<Behavior> createScalaBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return ParticleProvider$.MODULE$.createScalaBehaviors(paramEntityPlayer);
/*    */   }
/*    */   public static String[] ParticleNames() {
/*    */     return ParticleProvider$.MODULE$.ParticleNames();
/*    */   }
/*    */   
/*    */   public static Iterable<Behavior> createBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return ParticleProvider$.MODULE$.createBehaviors(paramEntityPlayer);
/*    */   }
/*    */   
/*    */   public static Behavior readFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound) {
/*    */     return ParticleProvider$.MODULE$.readFromNBT(paramEntityPlayer, paramNBTTagCompound);
/*    */   }
/*    */   
/*    */   public static NBTTagCompound writeToNBT(Behavior paramBehavior) {
/*    */     return ParticleProvider$.MODULE$.writeToNBT(paramBehavior);
/*    */   }
/*    */   
/*    */   public final class ParticleProvider$$anonfun$createScalaBehaviors$1 extends AbstractFunction1<String, ParticleBehavior> implements Serializable { public final ParticleProvider.ParticleBehavior apply(String x$1) {
/* 28 */       return new ParticleProvider.ParticleBehavior(x$1, this.player$1);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final EntityPlayer player$1;
/*    */     
/*    */     public ParticleProvider$$anonfun$createScalaBehaviors$1(EntityPlayer player$1) {} }
/*    */ 
/*    */   
/*    */   public static class ParticleBehavior
/*    */     extends AbstractBehavior {
/*    */     private String effectName;
/*    */     private final EntityPlayer player;
/*    */     
/*    */     public String effectName() {
/* 43 */       return this.effectName; } public void effectName_$eq(String x$1) { this.effectName = x$1; } public ParticleBehavior(String effectName, EntityPlayer player) { super(player); } public String getNameHint() {
/* 44 */       return (new StringBuilder()).append("particles.").append(effectName()).toString();
/*    */     }
/*    */     public void update() {
/* 47 */       World world = this.player.func_130014_f_();
/* 48 */       if (world.field_72995_K && Settings$.MODULE$.get().enableNanomachinePfx())
/* 49 */         PlayerUtils$.MODULE$.spawnParticleAround(this.player, effectName(), Nanomachines.getController(this.player).getInputCount((Behavior)this) * 0.25D); 
/*    */     }
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\ParticleProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */