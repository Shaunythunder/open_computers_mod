/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Et!B\001\003\021\003i\021\001\005#sSZ,'oQ8oiJ|G\016\\3s\025\t\031A!\001\nuQ\006,X.[2f]\026\024x-[:uS\016\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\tEe&4XM]\"p]R\024x\016\0347feN\021qB\005\t\003'ai\021\001\006\006\003+Y\ta\001\035:fM\006\024'BA\f\007\003\r\t\007/[\005\0033Q\021Q\003\022:jm\026\0248+\0333fIRKG.Z#oi&$\030\020C\003\034\037\021\005A$\001\004=S:LGO\020\013\002\033\025!ad\004\003 \0059!\026\016\\3D_:$(o\0347mKJ\024B\001\t\022-m\031!\021e\004\001 \0051a$/\0324j]\026lWM\034;?!\t\031#&D\001%\025\t)c%\001\006uS2,WM\034;jifT!a\n\025\002\0235Lg.Z2sC\032$(\"A\025\002\0079,G/\003\002,I\tQA+\0337f\013:$\030\016^=\021\0055\"T\"\001\030\013\005=\002\024a\0025fYB,'o\035\006\003cI\n!!\\3\013\003M\na!\0319qK:<\027BA\033/\0059IuI]5e!J|\0070_1cY\026\004\"aN\037\016\003aR!!\017\036\002\021M,7-\036:jifT!a\017\037\002\0259,Go^8sW&twM\003\002\030e%\021a\b\017\002\f\023\006\033G/[8o\021>\034H\017C\003A\037\021\005\021)\001\nhKR$\026\016\\3F]RLG/_\"mCN\034H#\001\"1\005\rk\005c\001#J\0276\tQI\003\002G\017\006!A.\0318h\025\005A\025\001\0026bm\006L!AS#\003\013\rc\027m]:\021\0051kE\002\001\003\n\035~\n\t\021!A\003\002=\0231a\030\0232#\t\001f\013\005\002R)6\t!KC\001T\003\025\0318-\0317b\023\t)&KA\004O_RD\027N\\4\021\005E;\026B\001-S\005\r\te.\037\005\0065>!\taW\001\022GJ,\027\r^3F]ZL'o\0348nK:$HC\002/cS:\004(\017\005\002^A6\taL\003\002`-\0059a.\032;x_J\\\027BA1_\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013\rL\006\031\0013\002\013]|'\017\0343\021\005\025<W\"\0014\013\005\r4\023B\0015g\005\0259vN\0357e\021\025Q\027\f1\001l\003\005A\bCA)m\023\ti'KA\002J]RDQa\\-A\002-\f\021!\037\005\006cf\003\ra[\001\002u\")1/\027a\001i\006!1/\0333f!\t)H0D\001w\025\t9\b0\001\003vi&d'BA={\003\031\031w.\\7p]*\0211\020K\001\017[&tWm\031:bMR4wN]4f\023\tihO\001\bG_J<W\rR5sK\016$\030n\0348\007\013}|!!!\001\003\027\025sg/\033:p]6,g\016^\n\006}\006\r\0211\002\t\006\003\013\t9aH\007\002\t%\031\021\021\002\003\00395\013g.Y4fIRKG.Z#oi&$\0300\0228wSJ|g.\\3oiB!a\"!\004 \023\r\tyA\001\002\017\035\026$xo\034:l\007>tGO]8m\021)\t\031B BC\002\023\005\021QC\001\005i&dW-\006\002\002\030A\031\021\021D\017\016\003=A!\"!\b\005\003\005\013\021BA\f\003\025!\030\016\\3!\021\031Yb\020\"\001\002\"Q!\0211EA\023!\r\tIB \005\t\003'\ty\0021\001\002\030\0359\021\021F\b\t\002\005-\022\001\003)s_ZLG-\032:\021\t\005e\021Q\006\004\b\003_y\001\022AA\031\005!\001&o\034<jI\026\0248CBA\027\003g\tI\004E\002E\003kI1!a\016F\005\031y%M[3diB!\0211HA!\033\t\tiDC\002\002@Y\ta\001\032:jm\026\024\030\002BA\"\003{\0211#\0228wSJ|g.\\3oiB\023xN^5eKJDqaGA\027\t\003\t9\005\006\002\002,!A\0211JA\027\t\003\ni%\001\bhKR,eN^5s_:lWM\034;\025\t\005=\023\021\r\031\005\003#\ny\006\005\004\002T\005e\023Q\f\b\004#\006U\023bAA,%\0061\001K]3eK\032L1ASA.\025\r\t9F\025\t\004\031\006}CA\003(\002J\005\005\t\021!B\001\037\"A\0211MA%\001\004\t)'A\003ti\006\0347\016\005\003\002h\0055TBAA5\025\r\tYGJ\001\005SR,W.\003\003\002p\005%$!C%uK6\034F/Y2l\001")
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
/*    */     @Callback(doc = "function():table -- Get a list of the stored essentia in the network.")
/* 25 */     public Object[] getEssentiaInNetwork(Context context, Arguments args) { return NetworkControl$class.getEssentiaInNetwork(this, context, args); } private final TileEntity tile; public TileEntity tile() { return this.tile; } public Environment(TileEntity tile) { super(tile, "me_controller"); NetworkControl$class.$init$(this); }
/*    */      } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$; public Provider$() {
/* 27 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 29 */       return li.cil.oc.integration.appeng.AEUtil$.MODULE$.isController(stack) ? 
/* 30 */         DriverController.Environment.class : 
/* 31 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\DriverController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */