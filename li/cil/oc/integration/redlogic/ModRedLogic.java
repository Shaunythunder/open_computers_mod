/*    */ package li.cil.oc.integration.redlogic;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\0011<Q!\001\002\t\0025\t1\"T8e%\026$Gj\\4jG*\0211\001B\001\te\026$Gn\\4jG*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\0211\"T8e%\026$Gj\\4jGN!qB\005\016\037!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016\035\033\005!\021BA\017\005\005!iu\016\032)s_bL\bCA\0202\035\t\001cF\004\002\"Y9\021!e\013\b\003G)r!\001J\025\017\005\025BS\"\001\024\013\005\035b\021A\002\037s_>$h(C\001\f\023\tI!\"\003\002\b\021%\021QAB\005\003[\021\tA!\036;jY&\021q\006M\001\020\005VtG\r\\3e%\026$7\017^8oK*\021Q\006B\005\003eM\022\001CU3egR|g.\032)s_ZLG-\032:\013\005=\002\004\"B\033\020\t\0031\024A\002\037j]&$h\bF\001\016\021\025At\002\"\021:\003\0319W\r^'pIR\t!\b\005\002<}9\0211\004P\005\003{\021\tA!T8eg&\021q\b\021\002\n'&l\007\017\\3N_\022T!!\020\003\t\013\t{A\021I\"\002\025%t\027\016^5bY&TX\rF\001E!\t)\005*D\001G\025\0059\025!B:dC2\f\027BA%G\005\021)f.\033;\t\013-{A\021\t'\002\031\r|W\016];uK&s\007/\036;\025\0075\003v\013\005\002F\035&\021qJ\022\002\004\023:$\b\"B)K\001\004\021\026a\0019pgB\0211+V\007\002)*\021QFB\005\003-R\023QB\0217pG.\004vn]5uS>t\007\"\002-K\001\004I\026\001B:jI\026\004\"A\0272\016\003mS!!\f/\013\005us\026AB2p[6|gN\003\002`A\006qQ.\0338fGJ\fg\r\0364pe\036,'\"A1\002\0079,G/\003\002d7\nqai\034:hK\022K'/Z2uS>t\007\"B3\020\t\0031\027aE2p[B,H/\032\"v]\022dW\rZ%oaV$HcA4kWB\031Q\t['\n\005%4%!B!se\006L\b\"B)e\001\004\021\006\"\002-e\001\004I\006")
/*    */ public final class ModRedLogic {
/*    */   public static int[] computeBundledInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return ModRedLogic$.MODULE$.computeBundledInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static int computeInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return ModRedLogic$.MODULE$.computeInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static void initialize() {
/*    */     ModRedLogic$.MODULE$.initialize();
/*    */   }
/*    */   
/*    */   public static Mods.SimpleMod getMod() {
/*    */     return ModRedLogic$.MODULE$.getMod();
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeInput$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$1;
/*    */     
/* 25 */     public final void apply(int i) { apply$mcVI$sp(i); } private final IntRef strength$1; private final TileEntity x2$1; public ModRedLogic$$anonfun$computeInput$1(ForgeDirection side$1, IntRef strength$1, TileEntity x2$1) {} public void apply$mcVI$sp(int i) {
/* 26 */       this.strength$1.elem = package$.MODULE$.max(this.strength$1.elem, ((IRedstoneEmitter)this.x2$1).getEmittedSignalStrength(i, this.side$1.getOpposite().ordinal()));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$1
/*    */     extends AbstractFunction1.mcZI.sp
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$2;
/*    */     private final TileEntity x2$2;
/*    */     
/*    */     public final boolean apply(int face) {
/* 39 */       return apply$mcZI$sp(face); } public boolean apply$mcZI$sp(int face) { return ((IWire)this.x2$2).wireConnectsInDirection(face, this.side$2.ordinal()); } public ModRedLogic$$anonfun$computeBundledInput$1(ForgeDirection side$2, TileEntity x2$2) {} } public final class ModRedLogic$$anonfun$computeBundledInput$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection side$2; private final ObjectRef strength$2; private final TileEntity x2$2; public final void apply(int face) { apply$mcVI$sp(face); } public ModRedLogic$$anonfun$computeBundledInput$2(ForgeDirection side$2, ObjectRef strength$2, TileEntity x2$2) {}
/* 40 */     public void apply$mcVI$sp(int face) { if ((int[])this.strength$2.elem == null) this.strength$2.elem = Array$.MODULE$.fill(16, (Function0)new ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1(this), ClassTag$.MODULE$.Int()); 
/* 41 */       ((int[])this.strength$2.elem)[((IInsulatedRedstoneWire)this.x2$2).getInsulatedWireColour()] = package$.MODULE$.max(((int[])this.strength$2.elem)[((IInsulatedRedstoneWire)this.x2$2).getInsulatedWireColour()], ((IRedstoneEmitter)this.x2$2).getEmittedSignalStrength(face, this.side$2.ordinal())); } public final class ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() {
/*    */         return 0;
/*    */       } public ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1(ModRedLogic$$anonfun$computeBundledInput$2 $outer) {} } }
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$3 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef strength$3;
/* 46 */     public final boolean apply(int i) { return apply$mcZI$sp(i); } public boolean apply$mcZI$sp(int i) { return ((int[])this.strength$3.elem == null); } public ModRedLogic$$anonfun$computeBundledInput$3(ObjectRef strength$3) {} } public final class ModRedLogic$$anonfun$computeBundledInput$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final ForgeDirection side$2; private final ObjectRef strength$3; private final TileEntity x3$1; public final void apply(int i) { apply$mcVI$sp(i); } public ModRedLogic$$anonfun$computeBundledInput$4(ForgeDirection side$2, ObjectRef strength$3, TileEntity x3$1) {}
/* 47 */     public void apply$mcVI$sp(int i) { this.strength$3.elem = Option$.MODULE$.apply(((IBundledEmitter)this.x3$1).getBundledCableStrength(i, this.side$2.getOpposite().ordinal())).fold((Function0)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2(this), (Function1)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3(this)); } public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2 extends AbstractFunction0<int[]> implements Serializable { public static final long serialVersionUID = 0L; public final int[] apply() { return null; } public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2(ModRedLogic$$anonfun$computeBundledInput$4 $outer) {} } public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<byte[], int[]> implements Serializable { public static final long serialVersionUID = 0L; public final int[] apply(byte[] x$1) { return (int[])Predef$.MODULE$.byteArrayOps(x$1).map((Function1)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())); } public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3(ModRedLogic$$anonfun$computeBundledInput$4 $outer) {} public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(byte x$2) { return x$2 & 0xFF; }
/*    */ 
/*    */         
/*    */         public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1(ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3 $outer) {} }
/*    */        }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\redlogic\ModRedLogic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */