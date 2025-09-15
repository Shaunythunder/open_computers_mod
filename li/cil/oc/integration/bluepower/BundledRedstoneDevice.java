/*    */ package li.cil.oc.integration.bluepower;
/*    */ 
/*    */ import com.bluepowermod.api.connect.IConnectionCache;
/*    */ import com.bluepowermod.api.wire.redstone.IBundledDevice;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]c\001B\001\003\0015\021QCQ;oI2,GMU3egR|g.\032#fm&\034WM\003\002\004\t\005I!\r\\;fa><XM\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9\"%D\001\031\025\tI\"$\001\005sK\022\034Ho\0348f\025\tYB$\001\003xSJ,'BA\017\037\003\r\t\007/\033\006\003?\001\nAB\0317vKB|w/\032:n_\022T\021!I\001\004G>l\027BA\022\031\0059I%)\0368eY\026$G)\032<jG\026D\001\"\n\001\003\006\004%\tAJ\001\013i&dW-\0228uSRLX#A\024\021\005!zS\"A\025\013\005)Z\023A\002;sC&$8O\003\002-[\005QA/\0337fK:$\030\016^=\013\00592\021AB2p[6|g.\003\0021S\t!\")\0368eY\026$'+\0323ti>tW-Q<be\026D\001B\r\001\003\002\003\006IaJ\001\fi&dW-\0228uSRL\b\005C\0035\001\021\005Q'\001\004=S:LGO\020\013\003ma\002\"a\016\001\016\003\tAQ!J\032A\002\035B\001B\017\001\t\006\004%\taO\001\006G\006\034\007.Z\013\002yA\031Q\b\021\f\016\003yR!a\020\017\002\017\r|gN\\3di&\021\021I\020\002\021\023\016{gN\\3di&|gnQ1dQ\026D\001b\021\001\t\002\003\006K\001P\001\007G\006\034\007.\032\021\t\013\025\003A\021\t$\002\t\035,G\017\027\013\002\017B\021\001jS\007\002\023*\t!*A\003tG\006d\027-\003\002M\023\n\031\021J\034;\t\0139\003A\021\t$\002\t\035,G/\027\005\006!\002!\tER\001\005O\026$(\fC\003S\001\021\0053+\001\005hKR<vN\0357e)\005!\006CA+]\033\0051&BA,Y\003\0259xN\0357e\025\tI&,A\005nS:,7M]1gi*\t1,A\002oKRL!!\030,\003\013]{'\017\0343\t\013}\003A\021\t1\002\025\r\fgnQ8o]\026\034G\017\006\003bI>\f\bC\001%c\023\t\031\027JA\004C_>dW-\0318\t\013\025t\006\031\0014\002\tMLG-\032\t\003O6l\021\001\033\006\003S*\fA!\036;jY*\021af\033\006\003Yj\013a\"\\5oK\016\024\030M\032;g_J<W-\003\002oQ\nqai\034:hK\022K'/Z2uS>t\007\"\0029_\001\0041\022a\0013fm\")!O\030a\001g\006q1m\0348oK\016$\030n\0348UsB,\007CA\037u\023\t)hH\001\bD_:tWm\031;j_:$\026\020]3\t\013]\004A\021\t=\002\031%\034hj\034:nC24\025mY3\025\005\005L\b\"B3w\001\0041\007\"B>\001\t\003b\030!G4fi\n+h\016\0327fI\016{gN\\3di&|gnQ1dQ\026$\022! \031\004}\006\r\001cA\037AB!\021\021AA\002\031\001!1\"!\002{\003\003\005\tQ!\001\002\b\t\031q\fJ\031\022\007\005%a\003E\002I\003\027I1!!\004J\005\035qu\016\0365j]\036Dq!!\005\001\t\003\n\031\"A\bhKR\024UO\0343mK\022\034u\016\\8s)\021\t)\"!\t\021\t\005]\021QD\007\003\0033Q1!a\007\035\003\021i\027n]2\n\t\005}\021\021\004\002\017\033&tWm\031:bMR\034u\016\\8s\021\031)\027q\002a\001M\"9\021Q\005\001\005B\005\035\022\001E4fi\n+h\016\0327fI>+H\017];u)\021\tI#!\016\021\013!\013Y#a\f\n\007\0055\022JA\003BeJ\f\027\020E\002I\003cI1!a\rJ\005\021\021\025\020^3\t\r\025\f\031\0031\001g\021\035\tI\004\001C!\003w\tqbZ3u\005VtG\r\\3e!><XM\035\013\005\003S\ti\004\003\004f\003o\001\rA\032\005\b\003\003\002A\021IA\"\003=\031X\r\036\"v]\022dW\r\032)po\026\024HCBA#\003\027\ni\005E\002I\003\017J1!!\023J\005\021)f.\033;\t\r\025\fy\0041\001g\021!\ty%a\020A\002\005%\022!\0029po\026\024\bbBA*\001\021\005\023QK\001\020_:\024UO\0343mK\022,\006\017Z1uKR\021\021Q\t")
/*    */ public class BundledRedstoneDevice implements IBundledDevice {
/*    */   private final BundledRedstoneAware tileEntity;
/*    */   
/* 12 */   public BundledRedstoneAware tileEntity() { return this.tileEntity; } private IConnectionCache<IBundledDevice> cache; private volatile boolean bitmap$0; public BundledRedstoneDevice(BundledRedstoneAware tileEntity) {} private IConnectionCache cache$lzycompute() {
/* 13 */     synchronized (this) { if (!this.bitmap$0) { this.cache = BPApi.getInstance().getRedstoneApi().createBundledConnectionCache(this); this.bitmap$0 = true; }  return this.cache; }  } public IConnectionCache<IBundledDevice> cache() { return this.bitmap$0 ? this.cache : cache$lzycompute(); }
/*    */    public int getX() {
/* 15 */     return tileEntity().x();
/*    */   } public int getY() {
/* 17 */     return tileEntity().y();
/*    */   } public int getZ() {
/* 19 */     return tileEntity().z();
/*    */   } public World getWorld() {
/* 21 */     return tileEntity().world();
/*    */   } public boolean canConnect(ForgeDirection side, IBundledDevice dev, ConnectionType connectionType) {
/* 23 */     return tileEntity().isOutputEnabled();
/*    */   } public boolean isNormalFace(ForgeDirection side) {
/* 25 */     return true;
/*    */   } public IConnectionCache<? extends IBundledDevice> getBundledConnectionCache() {
/* 27 */     return cache();
/*    */   } public MinecraftColor getBundledColor(ForgeDirection side) {
/* 29 */     return MinecraftColor.ANY;
/*    */   }
/* 31 */   public byte[] getBundledOutput(ForgeDirection side) { return (byte[])Predef$.MODULE$.intArrayOps(tileEntity().getBundledOutput(side)).map((Function1)new BundledRedstoneDevice$$anonfun$getBundledOutput$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Byte())); } public final class BundledRedstoneDevice$$anonfun$getBundledOutput$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final byte apply(int x$1) { return (byte)x$1; }
/*    */      public BundledRedstoneDevice$$anonfun$getBundledOutput$1(BundledRedstoneDevice $outer) {} }
/* 33 */   public byte[] getBundledPower(ForgeDirection side) { return (byte[])Predef$.MODULE$.intArrayOps(tileEntity().getBundledInput(side)).map((Function1)new BundledRedstoneDevice$$anonfun$getBundledPower$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Byte())); } public final class BundledRedstoneDevice$$anonfun$getBundledPower$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final byte apply(int x$2) { return (byte)x$2; }
/*    */      public BundledRedstoneDevice$$anonfun$getBundledPower$1(BundledRedstoneDevice $outer) {} }
/* 35 */   public void setBundledPower(ForgeDirection side, byte[] power) { tileEntity().setBundledInput(side, (int[])Predef$.MODULE$.byteArrayOps(power).map((Function1)new BundledRedstoneDevice$$anonfun$setBundledPower$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))); } public final class BundledRedstoneDevice$$anonfun$setBundledPower$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(byte x$3) { return x$3 & 0xFF; }
/*    */      public BundledRedstoneDevice$$anonfun$setBundledPower$1(BundledRedstoneDevice $outer) {} } public void onBundledUpdate() {
/* 37 */     tileEntity().checkRedstoneInputChanged();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bluepower\BundledRedstoneDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */