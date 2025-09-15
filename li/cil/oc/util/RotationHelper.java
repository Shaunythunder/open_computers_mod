/*    */ package li.cil.oc.util;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ @ScalaSignature(bytes = "\006\001\0055q!B\001\003\021\003Y\021A\004*pi\006$\030n\0348IK2\004XM\035\006\003\007\021\tA!\036;jY*\021QAB\001\003_\016T!a\002\005\002\007\rLGNC\001\n\003\ta\027n\001\001\021\0051iQ\"\001\002\007\0139\021\001\022A\b\003\035I{G/\031;j_:DU\r\0349feN\021Q\002\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]iA\021\001\r\002\rqJg.\033;?)\005Y\001\"\002\016\016\t\003Y\022a\0024s_6L\026m\036\013\0039\035\002\"!H\023\016\003yQ!aA\020\013\005\001\n\023AB2p[6|gN\003\002#G\005qQ.\0338fGJ\fg\r\0364pe\036,'\"\001\023\002\0079,G/\003\002'=\tqai\034:hK\022K'/Z2uS>t\007\"\002\025\032\001\004I\023aA=boB\021\021CK\005\003WI\021QA\0227pCRDQ!L\007\005\0029\nq\001^8M_\016\fG\016\006\003\035_E\022\004\"\002\031-\001\004a\022!\0029ji\016D\007\"\002\025-\001\004a\002\"B\032-\001\004a\022!\002<bYV,\007\"B\033\016\t\0031\024\001\003;p\0172|'-\0317\025\tq9\004(\017\005\006aQ\002\r\001\b\005\006QQ\002\r\001\b\005\006gQ\002\r\001\b\005\006w5!\t\001P\001\017iJ\fgn\0357bi&|gNR8s)\ri\004)\021\t\004#yb\022BA \023\005\025\t%O]1z\021\025\001$\b1\001\035\021\025A#\b1\001\035\021\025\031U\002\"\001E\003UIgN^3sg\026$&/\0318tY\006$\030n\0348G_J$2!P#G\021\025\001$\t1\001\035\021\025A#\t1\001\035\021\035AUB1A\005\n%\013\001\003\036:b]Nd\027\r^5p]\016\0137\r[3\026\003)\003Ba\023)\035%6\tAJ\003\002N\035\0069Q.\036;bE2,'BA(\023\003)\031w\016\0347fGRLwN\\\005\003#2\0231!T1q!\021Y\005\013H\037\t\rQk\001\025!\003K\003E!(/\0318tY\006$\030n\0348DC\016DW\r\t\005\b-6\021\r\021\"\003J\003]IgN^3sg\026$&/\0318tY\006$\030n\0348DC\016DW\r\003\004Y\033\001\006IAS\001\031S:4XM]:f)J\fgn\0357bi&|gnQ1dQ\026\004\003b\002.\016\005\004%IaW\001\riJ\fgn\0357bi&|gn]\013\0029B\031\021CP/\021\007EqT\b\003\004`\033\001\006I\001X\001\016iJ\fgn\0357bi&|gn\035\021\b\013\005l\001\022\0022\002\003\021\003\"a\0313\016\00351Q!Z\007\t\n\031\024\021\001R\n\003IBAQa\0063\005\002!$\022A\031\005\bU\022\024\r\021\"\001l\003\021!wn\0368\026\003qAa!\0343!\002\023a\022!\0023po:\004\003bB8e\005\004%\ta[\001\003kBDa!\0353!\002\023a\022aA;qA!91\017\032b\001\n\003Y\027!\0028peRD\007BB;eA\003%A$\001\004o_J$\b\016\t\005\bo\022\024\r\021\"\001l\003\025\031x.\036;i\021\031IH\r)A\0059\00511o\\;uQ\002Bqa\0373C\002\023\0051.\001\003xKN$\bBB?eA\003%A$A\003xKN$\b\005C\004\000I\n\007I\021A6\002\t\025\f7\017\036\005\b\003\007!\007\025!\003\035\003\025)\027m\035;!\021!\t9\001\032b\001\n\003Y\027aB;oW:|wO\034\005\b\003\027!\007\025!\003\035\003!)hn\0338po:\004\003")
/*    */ public final class RotationHelper {
/*    */   public static ForgeDirection[] inverseTranslationFor(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2) {
/*    */     return RotationHelper$.MODULE$.inverseTranslationFor(paramForgeDirection1, paramForgeDirection2);
/*    */   }
/*    */   
/*    */   public static ForgeDirection[] translationFor(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2) {
/*    */     return RotationHelper$.MODULE$.translationFor(paramForgeDirection1, paramForgeDirection2);
/*    */   }
/*    */   
/*    */   public static ForgeDirection toGlobal(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2, ForgeDirection paramForgeDirection3) {
/*    */     return RotationHelper$.MODULE$.toGlobal(paramForgeDirection1, paramForgeDirection2, paramForgeDirection3);
/*    */   }
/*    */   
/*    */   public static ForgeDirection toLocal(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2, ForgeDirection paramForgeDirection3) {
/*    */     return RotationHelper$.MODULE$.toLocal(paramForgeDirection1, paramForgeDirection2, paramForgeDirection3);
/*    */   }
/*    */   
/*    */   public static ForgeDirection fromYaw(float paramFloat) {
/*    */     return RotationHelper$.MODULE$.fromYaw(paramFloat);
/*    */   }
/*    */   
/* 25 */   public final class RotationHelper$$anonfun$translationFor$1 extends AbstractFunction0<Map<ForgeDirection, ForgeDirection[]>> implements Serializable { public final Map<ForgeDirection, ForgeDirection[]> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); } public static final long serialVersionUID = 0L; } public final class RotationHelper$$anonfun$translationFor$2 extends AbstractFunction0<ForgeDirection[]> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection pitch$1; private final ForgeDirection yaw$1; public final ForgeDirection[] apply() {
/* 26 */       return RotationHelper$.MODULE$.li$cil$oc$util$RotationHelper$$translations()[this.pitch$1.ordinal()][this.yaw$1.ordinal() - 2];
/*    */     } public RotationHelper$$anonfun$translationFor$2(ForgeDirection pitch$1, ForgeDirection yaw$1) {} }
/*    */   public final class RotationHelper$$anonfun$inverseTranslationFor$1 extends AbstractFunction0<Map<ForgeDirection, ForgeDirection[]>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final Map<ForgeDirection, ForgeDirection[]> apply() {
/* 30 */       return scala.collection.mutable.Map$.MODULE$.empty();
/*    */     } } public final class RotationHelper$$anonfun$inverseTranslationFor$2 extends AbstractFunction0<ForgeDirection[]> implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection pitch$2; private final ForgeDirection yaw$2; public RotationHelper$$anonfun$inverseTranslationFor$2(ForgeDirection pitch$2, ForgeDirection yaw$2) {} public final ForgeDirection[] apply() {
/* 32 */       ForgeDirection[] t = RotationHelper$.MODULE$.translationFor(this.pitch$2, this.yaw$2);
/*    */ 
/*    */       
/* 35 */       ArrayOps arrayOps = scala.Predef$.MODULE$.refArrayOps((Object[])t); return (ForgeDirection[])((TraversableOnce)((TraversableLike)((TraversableLike)scala.Predef$.MODULE$.refArrayOps((Object[])t).indices().map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2(this, arrayOps), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 36 */         .map((Function1)new RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()))
/* 37 */         .toArray(scala.reflect.ClassTag$.MODULE$.apply(ForgeDirection.class));
/*    */     }
/*    */     
/*    */     public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1
/*    */       extends AbstractFunction1<Object, ForgeDirection>
/*    */       implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final ForgeDirection apply(int x$1) {
/*    */         return ForgeDirection.getOrientation(x$1);
/*    */       }
/*    */       
/*    */       public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$1(RotationHelper$$anonfun$inverseTranslationFor$2 $outer) {}
/*    */     }
/*    */     
/*    */     public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final ArrayOps eta$0$1$1;
/*    */       
/*    */       public final int apply(Object elem) {
/*    */         return this.eta$0$1$1.indexOf(elem);
/*    */       }
/*    */       
/*    */       public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$2(RotationHelper$$anonfun$inverseTranslationFor$2 $outer, ArrayOps eta$0$1$1) {}
/*    */     }
/*    */     
/*    */     public final class RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3 extends AbstractFunction1<Object, ForgeDirection> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final ForgeDirection apply(int x$1) {
/*    */         return ForgeDirection.getOrientation(x$1);
/*    */       }
/*    */       
/*    */       public RotationHelper$$anonfun$inverseTranslationFor$2$$anonfun$apply$3(RotationHelper$$anonfun$inverseTranslationFor$2 $outer) {}
/*    */     } }
/*    */ 
/*    */   
/*    */   public static class D$ {
/*    */     public static final D$ MODULE$;
/*    */     private final ForgeDirection down;
/*    */     private final ForgeDirection up;
/*    */     private final ForgeDirection north;
/*    */     private final ForgeDirection south;
/*    */     private final ForgeDirection west;
/*    */     private final ForgeDirection east;
/*    */     private final ForgeDirection unknown;
/*    */     
/*    */     public ForgeDirection down() {
/* 85 */       return this.down;
/* 86 */     } public ForgeDirection up() { return this.up; }
/* 87 */     public ForgeDirection north() { return this.north; }
/* 88 */     public ForgeDirection south() { return this.south; }
/* 89 */     public ForgeDirection west() { return this.west; }
/* 90 */     public ForgeDirection east() { return this.east; } public ForgeDirection unknown() {
/* 91 */       return this.unknown;
/*    */     }
/*    */     public D$() {
/* 94 */       MODULE$ = this;
/*    */       this.down = ForgeDirection.DOWN;
/*    */       this.up = ForgeDirection.UP;
/*    */       this.north = ForgeDirection.NORTH;
/*    */       this.south = ForgeDirection.SOUTH;
/*    */       this.west = ForgeDirection.WEST;
/*    */       this.east = ForgeDirection.EAST;
/*    */       this.unknown = ForgeDirection.UNKNOWN;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\RotationHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */