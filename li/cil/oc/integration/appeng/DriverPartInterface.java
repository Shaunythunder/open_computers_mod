/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.parts.IPart;
/*    */ import appeng.api.parts.IPartHost;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005eu!B\001\003\021\003i\021a\005#sSZ,'\017U1si&sG/\032:gC\016,'BA\002\005\003\031\t\007\017]3oO*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\0211\003\022:jm\026\024\b+\031:u\023:$XM\0354bG\026\0342a\004\n\033!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016!\033\005a\"BA\017\037\003\031!'/\033<fe*\021qDB\001\004CBL\027BA\021\035\005)\031\026\016Z3e\0052|7m\033\005\006G=!\t\001J\001\007y%t\027\016\036 \025\0035AQAJ\b\005B\035\n\021b^8sWN<\026\016\0365\025\r!r\023H\020!C!\tIC&D\001+\025\005Y\023!B:dC2\f\027BA\027+\005\035\021un\0347fC:DQaL\023A\002A\nQa^8sY\022\004\"!M\034\016\003IR!aL\032\013\005Q*\024!C7j]\026\034'/\0314u\025\0051\024a\0018fi&\021\001H\r\002\006/>\024H\016\032\005\006u\025\002\raO\001\002qB\021\021\006P\005\003{)\0221!\0238u\021\025yT\0051\001<\003\005I\b\"B!&\001\004Y\024!\001>\t\013\r+\003\031\001#\002\tMLG-\032\t\003\0132k\021A\022\006\003\017\"\013A!\036;jY*\021\021JS\001\007G>lWn\0348\013\005-+\024AD7j]\026\034'/\0314uM>\024x-Z\005\003\033\032\023aBR8sO\026$\025N]3di&|g\016C\003P\037\021\005\003+A\tde\026\fG/Z#om&\024xN\\7f]R$2\"UA\037\003\t\t%a\021\002FA\021!kU\007\002\037\031!Ak\004\002V\005-)eN^5s_:lWM\034;\024\tM3&-\032\t\004/bSV\"\001\003\n\005e#!\001H'b]\006<W\r\032+jY\026,e\016^5us\026sg/\033:p]6,g\016\036\t\0037\002l\021\001\030\006\003;z\013Q\001]1siNT!aH0\013\003\rI!!\031/\003\023%\003\026M\035;I_N$\bCA\016d\023\t!GD\001\006OC6,GM\0217pG.\004\"A\0044\n\005\035\024!a\005)beR,eN^5s_:lWM\034;CCN,\007\002C5T\005\013\007I\021\0016\002\t!|7\017^\013\0025\"AAn\025B\001B\003%!,A\003i_N$\b\005C\003$'\022\005a\016\006\002R_\")\021.\034a\0015\")\021o\025C!e\006i\001O]3gKJ\024X\r\032(b[\026$\022a\035\t\003'QL!!\036\013\003\rM#(/\0338h\021\02598\013\"\021y\003!\001(/[8sSRLH#A\036\t\013i\034F\021A>\0023\035,G/\0238uKJ4\027mY3D_:4\027nZ;sCRLwN\034\013\006y\006\025\021Q\003\t\004Su|\030B\001@+\005\025\t%O]1z!\rI\023\021A\005\004\003\007Q#AB!osJ+g\rC\004\002\be\004\r!!\003\002\017\r|g\016^3yiB!\0211BA\t\033\t\tiAC\002\002\020y\tq!\\1dQ&tW-\003\003\002\024\0055!aB\"p]R,\007\020\036\005\b\003/I\b\031AA\r\003\021\t'oZ:\021\t\005-\0211D\005\005\003;\tiAA\005Be\036,X.\0328ug\":\0210!\t\002(\005%\002\003BA\006\003GIA!!\n\002\016\tA1)\0317mE\006\0347.A\002e_\016\f#!a\013\002s\032,hn\031;j_:D3/\0333fu9,XNY3s72\0023\017\\8uu9,XNY3s;&RD/\0312mK\002jS\006I$fi\002\"\b.\032\021d_:4\027nZ;sCRLwN\034\021pM\002\"\b.\032\021j]R,'OZ1dK\002\002x.\0338uS:<\007%\0338!i\",\007e\0359fG&4\027.\0323!I&\024Xm\031;j_:t\003bBA\030'\022\005\021\021G\001\032g\026$\030J\034;fe\032\f7-Z\"p]\032Lw-\036:bi&|g\016F\003}\003g\t)\004\003\005\002\b\0055\002\031AA\005\021!\t9\"!\fA\002\005e\001\006CA\027\003C\t9#!\017\"\005\005m\022!a\017gk:\034G/[8oQMLG-\032\036ok6\024WM].-AMdw\016\036\036ok6\024WM]/\\Y\001\"\027\r^1cCN,'(\0313ee\026\0348\017\f\021f]R\024\030P\0178v[\n,'o\027\027!g&TXM\0178v[\n,'/X/*u\t|w\016\\3b]\002jS\006I\"p]\032Lw-\036:fAQDW\rI5oi\026\024h-Y2fAA|\027N\034;j]\036\004\023N\034\021uQ\026\0043\017]3dS\032LW\r\032\021eSJ,7\r^5p]:BQa\f(A\002ABQA\017(A\002mBQa\020(A\002mBQ!\021(A\002mBQa\021(A\002\021;q!!\023\020\021\003\tY%\001\005Qe>4\030\016Z3s!\r\021\026Q\n\004\b\003\037z\001\022AA)\005!\001&o\034<jI\026\0248#BA'%\005M\003cA\016\002V%\031\021q\013\017\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\017\r\ni\005\"\001\002\\Q\021\0211\n\005\t\003?\ni\005\"\021\002b\005qq-\032;F]ZL'o\0348nK:$H\003BA2\003\023\003D!!\032\002xA1\021qMA7\003gr1!KA5\023\r\tYGK\001\007!J,G-\0324\n\t\005=\024\021\017\002\006\0072\f7o\035\006\004\003WR\003\003BA;\003ob\001\001\002\007\002z\005u\023\021!A\001\006\003\tYHA\002`IE\nB!! \002\004B\031\021&a \n\007\005\005%FA\004O_RD\027N\\4\021\007%\n))C\002\002\b*\0221!\0218z\021!\tY)!\030A\002\0055\025!B:uC\016\\\007\003BAH\003+k!!!%\013\007\005M5'\001\003ji\026l\027\002BAL\003#\023\021\"\023;f[N#\030mY6")
/*    */ public final class DriverPartInterface {
/*    */   public static Environment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverPartInterface$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverPartInterface$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/* 19 */   public final class DriverPartInterface$$anonfun$worksWith$3 extends AbstractFunction1<IPart, Object> implements Serializable { public final boolean apply(IPart x$1) { return x$1 instanceof PartInterface; } public static final long serialVersionUID = 0L; } public final class DriverPartInterface$$anonfun$worksWith$2 extends AbstractFunction1<IPart, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IPart obj) { return !(obj == null); } } public final class DriverPartInterface$$anonfun$worksWith$1 extends AbstractFunction1<ForgeDirection, IPart> implements Serializable { public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final IPart apply(ForgeDirection x$1) { return ((IPartHost)this.x2$1).getPart(x$1); }
/*    */     
/*    */     public DriverPartInterface$$anonfun$worksWith$1(TileEntity x2$1) {} }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IPartHost> implements NamedBlock, PartEnvironmentBase { private final IPartHost host;
/*    */     
/* 25 */     public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] getPartConfig(Context context, Arguments args, ClassTag evidence$1) { return PartEnvironmentBase$class.getPartConfig(this, context, args, evidence$1); } public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] setPartConfig(Context context, Arguments args, ClassTag evidence$2) { return PartEnvironmentBase$class.setPartConfig(this, context, args, evidence$2); } public IPartHost host() { return this.host; } public Environment(IPartHost host) { super(host, "me_interface"); PartEnvironmentBase$class.$init$(this); } public String preferredName() {
/* 26 */       return "me_interface";
/*    */     } public int priority() {
/* 28 */       return 0;
/*    */     } @Callback(doc = "function(side:number[, slot:number]):table -- Get the configuration of the interface pointing in the specified direction.")
/*    */     public Object[] getInterfaceConfiguration(Context context, Arguments args) {
/* 31 */       return getPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartInterface.class));
/*    */     } @Callback(doc = "function(side:number[, slot:number][, database:address, entry:number[, size:number]]):boolean -- Configure the interface pointing in the specified direction.")
/*    */     public Object[] setInterfaceConfiguration(Context context, Arguments args) {
/* 34 */       return setPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartInterface.class));
/*    */     } } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 37 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 39 */       return AEUtil$.MODULE$.isPartInterface(stack) ? 
/* 40 */         DriverPartInterface.Environment.class : 
/* 41 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverPartInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */