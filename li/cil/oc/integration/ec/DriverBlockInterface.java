/*    */ package li.cil.oc.integration.ec;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025s!B\001\003\021\003i\021\001\006#sSZ,'O\0217pG.Le\016^3sM\006\034WM\003\002\004\t\005\021Qm\031\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003)\021\023\030N^3s\0052|7m[%oi\026\024h-Y2f'\ty!\003\005\002\02415\tAC\003\002\026-\0051\001O]3gC\nT!a\006\004\002\007\005\004\030.\003\002\032)\t)BI]5wKJ\034\026\016Z3e)&dW-\0228uSRL\b\"B\016\020\t\003a\022A\002\037j]&$h\bF\001\016\021\025qr\002\"\001 \003I9W\r\036+jY\026,e\016^5us\016c\027m]:\025\003\001\002$!I\027\021\007\tB3F\004\002$M5\tAEC\001&\003\025\0318-\0317b\023\t9C%\001\004Qe\026$WMZ\005\003S)\022Qa\0217bgNT!a\n\023\021\0051jC\002\001\003\n]u\t\t\021!A\003\002=\0221a\030\0232#\t\0014\007\005\002$c%\021!\007\n\002\b\035>$\b.\0338h!\t\031C'\003\0026I\t\031\021I\\=\t\013]zA\021\001\035\002#\r\024X-\031;f\013:4\030N]8o[\026tG\017\006\004:){\025k\025\t\003uuj\021a\017\006\003yY\tqA\\3uo>\0248.\003\002?w\t\021R*\0318bO\026$WI\034<je>tW.\0328u\021\025\001e\0071\001B\003\0259xN\0357e!\t\021\005*D\001D\025\t\001EI\003\002F\r\006IQ.\0338fGJ\fg\r\036\006\002\017\006\031a.\032;\n\005%\033%!B,pe2$\007\"B&7\001\004a\025!\001=\021\005\rj\025B\001(%\005\rIe\016\036\005\006!Z\002\r\001T\001\002s\")!K\016a\001\031\006\t!\020C\003Um\001\007Q+\001\003tS\022,\007C\001,^\033\0059&B\001-Z\003\021)H/\0337\013\005i[\026AB2p[6|gN\003\002]\r\006qQ.\0338fGJ\fg\r\0364pe\036,\027B\0010X\00591uN]4f\t&\024Xm\031;j_:4A\001Y\b\003C\nYQI\034<je>tW.\0328u'\ry&\r\035\t\004G\0224W\"\001\003\n\005\025$!\001H'b]\006<W\r\032+jY\026,e\016^5us\026sg/\033:p]6,g\016\036\t\003O:l\021\001\033\006\003S*\fA!\\5tG*\0211\016\\\001\005i&dWMC\001n\003\031\t\007\017]3oO&\021q\016\033\002\016)&dW-\0238uKJ4\027mY3\021\0079\th-\003\002s\005\tqa*\032;x_J\\7i\0348ue>d\007\002C6`\005\013\007I\021\001;\026\003\031D\001B^0\003\002\003\006IAZ\001\006i&dW\r\t\005\0067}#\t\001\037\013\003sn\004\"A_0\016\003=AQa[<A\002\031<Q!`\b\t\002y\f\001\002\025:pm&$WM\035\t\003u~4q!!\001\020\021\003\t\031A\001\005Qe>4\030\016Z3s'\025y\030QAA\013!\021\t9!!\005\016\005\005%!\002BA\006\003\033\tA\001\\1oO*\021\021qB\001\005U\0064\030-\003\003\002\024\005%!AB(cU\026\034G\017\005\003\002\030\005uQBAA\r\025\r\tYBF\001\007IJLg/\032:\n\t\005}\021\021\004\002\024\013:4\030N]8o[\026tG\017\025:pm&$WM\035\005\0077}$\t!a\t\025\003yDq!a\n\000\t\003\nI#\001\bhKR,eN^5s_:lWM\034;\025\t\005-\022Q\007\031\005\003[\t\t\004\005\003#Q\005=\002c\001\027\0022\021Y\0211GA\023\003\003\005\tQ!\0010\005\ryFE\r\005\t\003o\t)\0031\001\002:\005)1\017^1dWB!\0211HA!\033\t\tiDC\002\002@\021\013A!\033;f[&!\0211IA\037\005%IE/Z7Ti\006\0347\016")
/*    */ public final class DriverBlockInterface {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBlockInterface$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverBlockInterface$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBlockInterface$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileInterface> implements NetworkControl<TileInterface> {
/*    */     @Callback(doc = "function():table -- Get a list of the stored gases in the network.")
/* 19 */     public Object[] getGasesInNetwork(Context context, Arguments args) { return NetworkControl$class.getGasesInNetwork(this, context, args); } private final TileInterface tile; public TileInterface tile() { return this.tile; } public Environment(TileInterface tile) { super(tile, "me_interface"); NetworkControl$class.$init$(this); }
/*    */      } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$; public Provider$() {
/* 21 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 23 */       return li.cil.oc.integration.appeng.AEUtil$.MODULE$.isBlockInterface(stack) ? 
/* 24 */         DriverBlockInterface.Environment.class : 
/* 25 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\DriverBlockInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */