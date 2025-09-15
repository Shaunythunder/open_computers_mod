/*    */ package li.cil.oc.integration.ec;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Et!B\001\003\021\003i\021\001\005#sSZ,'oQ8oiJ|G\016\\3s\025\t\031A!\001\002fG*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001\003\022:jm\026\0248i\0348ue>dG.\032:\024\005=\021\002CA\n\031\033\005!\"BA\013\027\003\031\001(/\0324bE*\021qCB\001\004CBL\027BA\r\025\005U!%/\033<feNKG-\0323US2,WI\034;jifDQaG\b\005\002q\ta\001P5oSRtD#A\007\006\tyyAa\b\002\017)&dWmQ8oiJ|G\016\\3s%\021\001#\005\f\034\007\t\005z\001a\b\002\ryI,g-\0338f[\026tGO\020\t\003G)j\021\001\n\006\003K\031\n!\002^5mK\026tG/\033;z\025\t9\003&A\005nS:,7M]1gi*\t\021&A\002oKRL!a\013\023\003\025QKG.Z#oi&$\030\020\005\002.i5\taF\003\0020a\0059\001.\0327qKJ\034(BA\0313\003\tiWMC\0014\003\031\t\007\017]3oO&\021QG\f\002\017\023\036\023\030\016\032)s_bL\030M\0317f!\t9T(D\0019\025\tI$(\001\005tK\016,(/\033;z\025\tYD(\001\006oKR<xN]6j]\036T!a\006\032\n\005yB$aC%BGRLwN\034%pgRDQ\001Q\b\005\002\005\013!cZ3u)&dW-\0228uSRL8\t\\1tgR\t!\t\r\002D\033B\031A)S&\016\003\025S!AR$\002\t1\fgn\032\006\002\021\006!!.\031<b\023\tQUIA\003DY\006\0348\017\005\002M\0332\001A!\003(@\003\003\005\tQ!\001P\005\ryF%M\t\003!Z\003\"!\025+\016\003IS\021aU\001\006g\016\fG.Y\005\003+J\023qAT8uQ&tw\r\005\002R/&\021\001L\025\002\004\003:L\b\"\002.\020\t\003Y\026!E2sK\006$X-\0228wSJ|g.\\3oiR1ALY5oaJ\004\"!\0301\016\003yS!a\030\f\002\0179,Go^8sW&\021\021M\030\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\003d3\002\007A-A\003x_JdG\r\005\002fO6\taM\003\002dM%\021\001N\032\002\006/>\024H\016\032\005\006Uf\003\ra[\001\002qB\021\021\013\\\005\003[J\0231!\0238u\021\025y\027\f1\001l\003\005I\b\"B9Z\001\004Y\027!\001>\t\013ML\006\031\001;\002\tMLG-\032\t\003krl\021A\036\006\003ob\fA!\036;jY*\021\021P_\001\007G>lWn\0348\013\005mD\023AD7j]\026\034'/\0314uM>\024x-Z\005\003{Z\024aBR8sO\026$\025N]3di&|gNB\003\000\037\t\t\tAA\006F]ZL'o\0348nK:$8#\002@\002\004\005-\001#BA\003\003\017yR\"\001\003\n\007\005%AA\001\017NC:\fw-\0323US2,WI\034;jif,eN^5s_:lWM\034;\021\t9\tiaH\005\004\003\037\021!A\004(fi^|'o[\"p]R\024x\016\034\005\013\003'q(Q1A\005\002\005U\021\001\002;jY\026,\"!a\006\021\007\005eQ$D\001\020\021)\tiB B\001B\003%\021qC\001\006i&dW\r\t\005\0077y$\t!!\t\025\t\005\r\022Q\005\t\004\0033q\b\002CA\n\003?\001\r!a\006\b\017\005%r\002#\001\002,\005A\001K]8wS\022,'\017\005\003\002\032\0055baBA\030\037!\005\021\021\007\002\t!J|g/\0333feN1\021QFA\032\003s\0012\001RA\033\023\r\t9$\022\002\007\037\nTWm\031;\021\t\005m\022\021I\007\003\003{Q1!a\020\027\003\031!'/\033<fe&!\0211IA\037\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\035Y\022Q\006C\001\003\017\"\"!a\013\t\021\005-\023Q\006C!\003\033\nabZ3u\013:4\030N]8o[\026tG\017\006\003\002P\005\005\004\007BA)\003?\002b!a\025\002Z\005ucbA)\002V%\031\021q\013*\002\rA\023X\rZ3g\023\rQ\0251\f\006\004\003/\022\006c\001'\002`\021Qa*!\023\002\002\003\005)\021A(\t\021\005\r\024\021\na\001\003K\nQa\035;bG.\004B!a\032\002n5\021\021\021\016\006\004\003W2\023\001B5uK6LA!a\034\002j\tI\021\n^3n'R\f7m\033")
/*    */ public final class DriverController {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverController$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverController$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverController$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntity> implements NetworkControl<TileEntity> {
/*    */     @Callback(doc = "function():table -- Get a list of the stored gases in the network.")
/* 25 */     public Object[] getGasesInNetwork(Context context, Arguments args) { return NetworkControl$class.getGasesInNetwork(this, context, args); } private final TileEntity tile; public TileEntity tile() { return this.tile; } public Environment(TileEntity tile) { super(tile, "me_controller"); NetworkControl$class.$init$(this); }
/*    */      } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$; public Provider$() {
/* 27 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 29 */       return li.cil.oc.integration.appeng.AEUtil$.MODULE$.isController(stack) ? 
/* 30 */         DriverController.Environment.class : 
/* 31 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\DriverController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */