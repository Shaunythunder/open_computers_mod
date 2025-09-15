/*    */ package li.cil.oc.common.nanomachines.provider;@ScalaSignature(bytes = "\006\001]<Q!\001\002\t\002=\ta\002S;oOJL\bK]8wS\022,'O\003\002\004\t\005A\001O]8wS\022,'O\003\002\006\r\005aa.\0318p[\006\034\007.\0338fg*\021q\001C\001\007G>lWn\0348\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051C\001\bIk:<'/\037)s_ZLG-\032:\024\005E!\002C\001\t\026\023\t1\"AA\007TG\006d\027\r\025:pm&$WM\035\005\0061E!\t!G\001\007y%t\027\016\036 \025\003=AqaG\tC\002\023\025A$A\005GS2d7i\\;oiV\tQdD\001\037;\005Q\001B\002\021\022A\0035Q$\001\006GS2d7i\\;oi\002BqAI\tC\002\023\0251%\001\007Ik:<'/\037#b[\006<W-F\001%!\t)C&D\001'\025\t9\003&\001\003vi&d'BA\025+\003%i\027N\\3de\0064GOC\001,\003\rqW\r^\005\003[\031\022A\002R1nC\036,7k\\;sG\026DaaL\t!\002\033!\023!\004%v]\036\024\030\020R1nC\036,\007\005C\0032#\021\005#'\001\013de\026\fG/Z*dC2\f')\0325bm&|'o\035\013\003g!\0032\001\016 B\035\t)4H\004\0027s5\tqG\003\0029\035\0051AH]8pizJ\021AO\001\006g\016\fG.Y\005\003yu\nq\001]1dW\006<WMC\001;\023\ty\004I\001\005Ji\026\024\030M\0317f\025\taT\b\005\002C\r6\t1I\003\002\006\t*\021Q\tC\001\004CBL\027BA$D\005!\021U\r[1wS>\024\b\"B%1\001\004Q\025A\0029mCf,'\017\005\002L\0376\tAJ\003\002J\033*\021a\nK\001\007K:$\030\016^=\n\005Ac%\001D#oi&$\030\020\0257bs\026\024\b\"\002*\022\t#\032\026a\005:fC\022\024U\r[1wS>\024hI]8n\035\n#FcA!U+\")\021*\025a\001\025\")a+\025a\001/\006\031aN\031;\021\005aSV\"A-\013\005YC\023BA.Z\0059q%\t\026+bO\016{W\016]8v]\0224A!X\t\001=\nq\001*\0368hef\024U\r[1wS>\0248C\001/`!\t\0017-D\001b\025\t\021G)\001\004qe\0264\027MY\005\003I\006\024\001#\0212tiJ\f7\r\036\"fQ\0064\030n\034:\t\021%c&\021!Q\001\n)CQ\001\007/\005\002\035$\"\001\0336\021\005%dV\"A\t\t\013%3\007\031\001&\t\0131dF\021I7\002\023=tG)[:bE2,GC\0018s!\ty\007/D\001>\023\t\tXH\001\003V]&$\b\"B:l\001\004!\030A\002:fCN|g\016\005\002Ck&\021ao\021\002\016\t&\034\030M\0317f%\026\f7o\0348")
/*    */ public final class HungryProvider { public static Iterable<Behavior> createScalaBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return HungryProvider$.MODULE$.createScalaBehaviors(paramEntityPlayer);
/*    */   } public static DamageSource HungryDamage() {
/*    */     return HungryProvider$.MODULE$.HungryDamage();
/*    */   } public static int FillCount() {
/*    */     return HungryProvider$.MODULE$.FillCount();
/*    */   } public static Iterable<Behavior> createBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return HungryProvider$.MODULE$.createBehaviors(paramEntityPlayer);
/*    */   }
/*    */   public static Behavior readFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound) {
/*    */     return HungryProvider$.MODULE$.readFromNBT(paramEntityPlayer, paramNBTTagCompound);
/*    */   }
/*    */   public static NBTTagCompound writeToNBT(Behavior paramBehavior) {
/*    */     return HungryProvider$.MODULE$.writeToNBT(paramBehavior);
/*    */   }
/*    */   public final class HungryProvider$$anonfun$createScalaBehaviors$1 extends AbstractFunction0<HungryBehavior> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final HungryProvider.HungryBehavior apply() {
/* 19 */       return new HungryProvider.HungryBehavior(this.player$1);
/*    */     } private final EntityPlayer player$1; public HungryProvider$$anonfun$createScalaBehaviors$1(EntityPlayer player$1) {} }
/*    */   public static class HungryBehavior extends AbstractBehavior { private final EntityPlayer player;
/*    */     public HungryBehavior(EntityPlayer player) {
/* 23 */       super(player);
/*    */     } public void onDisable(DisableReason reason) {
/* 25 */       DisableReason disableReason = DisableReason.OutOfEnergy; if (reason == null) { if (disableReason != null) return;  } else { if (reason.equals(disableReason))
/* 26 */         { this.player.func_70097_a(HungryProvider$.MODULE$.HungryDamage(), Settings$.MODULE$.get().nanomachinesHungryDamage());
/* 27 */           Nanomachines.getController(this.player).changeBuffer(Settings$.MODULE$.get().nanomachinesHungryEnergyRestored()); return; }  return; }  this.player.func_70097_a(HungryProvider$.MODULE$.HungryDamage(), Settings$.MODULE$.get().nanomachinesHungryDamage()); Nanomachines.getController(this.player).changeBuffer(Settings$.MODULE$.get().nanomachinesHungryEnergyRestored());
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\HungryProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */