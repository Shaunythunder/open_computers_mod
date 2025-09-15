/*    */ package li.cil.oc.integration.computercraft;
/*    */ @ScalaSignature(bytes = "\006\001q<Q!\001\002\t\0025\tqCQ;oI2,GMU3egR|g.\032)s_ZLG-\032:\013\005\r!\021!D2p[B,H/\032:de\0064GO\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\030\005VtG\r\\3e%\026$7\017^8oKB\023xN^5eKJ\034Ba\004\n\033KA\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\034G5\tAD\003\002\036=\005A!/\0323ti>tWM\003\002 A\005\031\021\r]5\013\005\r\t#\"\001\022\002\r\021\fgN\r\0311\023\t!CD\001\rJ\005VtG\r\\3e%\026$7\017^8oKB\023xN^5eKJ\004\"A\n\035\017\005\035*dB\001\0254\035\tI#G\004\002+c9\0211\006\r\b\003Y=j\021!\f\006\003]1\ta\001\020:p_Rt\024\"A\006\n\005%Q\021BA\004\t\023\t)a!\003\0025\t\005!Q\017^5m\023\t1t'A\bCk:$G.\0323SK\022\034Ho\0348f\025\t!D!\003\002:u\t\001\"+\0323ti>tW\r\025:pm&$WM\035\006\003m]BQ\001P\b\005\002u\na\001P5oSRtD#A\007\t\013}zA\021\001!\002\t%t\027\016\036\013\002\003B\021!)R\007\002\007*\tA)A\003tG\006d\027-\003\002G\007\n!QK\\5u\021\025Au\002\"\021J\003a9W\r\036\"v]\022dW\r\032*fIN$xN\\3PkR\004X\017\036\013\007\0256C&\f\0300\021\005\t[\025B\001'D\005\rIe\016\036\005\006\035\036\003\raT\001\006o>\024H\016\032\t\003!Zk\021!\025\006\003\035JS!a\025+\002\0235Lg.Z2sC\032$(\"A+\002\0079,G/\003\002X#\n)qk\034:mI\")\021l\022a\001\025\006\t\001\020C\003\\\017\002\007!*A\001z\021\025iv\t1\001K\003\005Q\b\"B0H\001\004Q\025\001B:jI\026DQ!Y\b\005B\t\fAbY8naV$X-\0238qkR$2AS2k\021\025!\007\r1\001f\003\r\001xn\035\t\003M\"l\021a\032\006\003i\031I!![4\003\033\tcwnY6Q_NLG/[8o\021\025y\006\r1\001l!\ta'/D\001n\025\t!dN\003\002pa\00611m\\7n_:T!!\035+\002\0355Lg.Z2sC\032$hm\034:hK&\0211/\034\002\017\r>\024x-\032#je\026\034G/[8o\021\025)x\002\"\021w\003M\031w.\0349vi\026\024UO\0343mK\022Le\016];u)\r9(p\037\t\004\005bT\025BA=D\005\025\t%O]1z\021\025!G\0171\001f\021\025yF\0171\001l\001")
/*    */ public final class BundledRedstoneProvider {
/*    */   public static int[] computeBundledInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return BundledRedstoneProvider$.MODULE$.computeBundledInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static int computeInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
/*    */     return BundledRedstoneProvider$.MODULE$.computeInput(paramBlockPosition, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static int getBundledRedstoneOutput(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     return BundledRedstoneProvider$.MODULE$.getBundledRedstoneOutput(paramWorld, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */   public static void init() {
/*    */     BundledRedstoneProvider$.MODULE$.init();
/*    */   }
/*    */   
/*    */   public final class BundledRedstoneProvider$$anonfun$getBundledRedstoneOutput$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 23 */     public final void apply(int color) { apply$mcVI$sp(color); } private final IntRef result$1; private final int[] colors$1; public BundledRedstoneProvider$$anonfun$getBundledRedstoneOutput$1(IntRef result$1, int[] colors$1) {} public void apply$mcVI$sp(int color) {
/* 24 */       if (this.colors$1[color] > 0) this.result$1.elem |= 1 << color; 
/*    */     }
/*    */   }
/*    */   
/*    */   public final class BundledRedstoneProvider$$anonfun$computeBundledInput$1
/*    */     extends AbstractFunction1.mcVI.sp
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final int strength$1;
/*    */     private final int[] strengths$1;
/*    */     
/*    */     public final void apply(int colour) {
/* 37 */       apply$mcVI$sp(colour); } public BundledRedstoneProvider$$anonfun$computeBundledInput$1(int strength$1, int[] strengths$1) {} public void apply$mcVI$sp(int colour) {
/* 38 */       this.strengths$1[colour] = ((this.strength$1 & 1 << colour) == 0) ? 0 : 15;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\BundledRedstoneProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */