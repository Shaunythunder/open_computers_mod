/*    */ package li.cil.oc.integration.util;@ScalaSignature(bytes = "\006\0015<Q!\001\002\t\0025\taa\026:f]\016D'BA\002\005\003\021)H/\0337\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005\0319&/\0328dQN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001b\002\017\020\005\004%I!H\001\007kN\fw-Z:\026\003y\0012a\b\023'\033\005\001#BA\021#\003\035iW\017^1cY\026T!a\t\013\002\025\r|G\016\\3di&|g.\003\002&A\tiA*\0338lK\022D\025m\0355TKR\004\"a\n\030\016\003!R!!\013\026\002\017I,g\r\\3di*\0211\006L\001\005Y\006twMC\001.\003\021Q\027M^1\n\005=B#AB'fi\"|G\r\003\0042\037\001\006IAH\001\bkN\fw-Z:!\021\035\031tB1A\005\nu\taa\0315fG.\034\bBB\033\020A\003%a$A\004dQ\026\0347n\035\021\t\013]zA\021\001\035\002\021\005$G-V:bO\026$\"!\017\037\021\005MQ\024BA\036\025\005\021)f.\033;\t\013u2\004\031\001\024\002\r]\024XM\\2i\021\025yt\002\"\001A\003!\tG\rZ\"iK\016\\GCA\035B\021\025\021e\b1\001'\003\035\031\007.Z2lKJDQ\001R\b\005\002\025\013\001\"[:Xe\026t7\r\033\013\003\r&\003\"aE$\n\005!#\"a\002\"p_2,\027M\034\005\006\025\016\003\raS\001\006gR\f7m\033\t\003\031Nk\021!\024\006\003\035>\013A!\033;f[*\021\001+U\001\n[&tWm\031:bMRT\021AU\001\004]\026$\030B\001+N\005%IE/Z7Ti\006\0347\016C\003W\037\021\005q+A\013i_2$7/\0219qY&\034\027M\0317f/J,gn\0315\025\007\031C\026\rC\003Z+\002\007!,\001\004qY\006LXM\035\t\0037~k\021\001\030\006\0033vS!AX(\002\r\025tG/\033;z\023\t\001GL\001\007F]RLG/\037)mCf,'\017C\003c+\002\0071-\001\005q_NLG/[8o!\t!g-D\001f\025\t\031a!\003\002hK\ni!\t\\8dWB{7/\033;j_:DQ![\b\005\002)\f!b\036:f]\016DWk]3e)\rI4\016\034\005\0063\"\004\rA\027\005\006E\"\004\ra\031")
/*    */ public final class Wrench { public static void wrenchUsed(EntityPlayer paramEntityPlayer, BlockPosition paramBlockPosition) {
/*    */     Wrench$.MODULE$.wrenchUsed(paramEntityPlayer, paramBlockPosition);
/*    */   }
/*    */   public static boolean holdsApplicableWrench(EntityPlayer paramEntityPlayer, BlockPosition paramBlockPosition) {
/*    */     return Wrench$.MODULE$.holdsApplicableWrench(paramEntityPlayer, paramBlockPosition);
/*    */   }
/*    */   public static boolean isWrench(ItemStack paramItemStack) {
/*    */     return Wrench$.MODULE$.isWrench(paramItemStack);
/*    */   }
/*    */   public static void addCheck(Method paramMethod) {
/*    */     Wrench$.MODULE$.addCheck(paramMethod);
/*    */   }
/*    */   public static void addUsage(Method paramMethod) {
/*    */     Wrench$.MODULE$.addUsage(paramMethod);
/*    */   }
/*    */   public final class Wrench$$anonfun$isWrench$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Method x$1) {
/* 20 */       return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic(x$1, (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     } private final ItemStack stack$1; public Wrench$$anonfun$isWrench$1(ItemStack stack$1) {} } public final class Wrench$$anonfun$holdsApplicableWrench$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; private final BlockPosition position$1;
/*    */     public final boolean apply(Method x$2) {
/* 23 */       return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic(x$2, (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.player$1, BoxesRunTime.boxToInteger(this.position$1.x()), BoxesRunTime.boxToInteger(this.position$1.y()), BoxesRunTime.boxToInteger(this.position$1.z()), BoxesRunTime.boxToBoolean(false) }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     } public Wrench$$anonfun$holdsApplicableWrench$1(EntityPlayer player$1, BlockPosition position$1) {} } public final class Wrench$$anonfun$wrenchUsed$1 extends AbstractFunction1<Method, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$2; private final BlockPosition position$2;
/*    */     public final void apply(Method x$3) {
/* 26 */       IMC$.MODULE$.tryInvokeStaticVoid(x$3, (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.player$2, BoxesRunTime.boxToInteger(this.position$2.x()), BoxesRunTime.boxToInteger(this.position$2.y()), BoxesRunTime.boxToInteger(this.position$2.z()), BoxesRunTime.boxToBoolean(true) }));
/*    */     }
/*    */     
/*    */     public Wrench$$anonfun$wrenchUsed$1(EntityPlayer player$2, BlockPosition position$2) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\Wrench.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */