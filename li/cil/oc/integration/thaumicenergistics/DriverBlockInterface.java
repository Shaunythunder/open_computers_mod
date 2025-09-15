/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025s!B\001\003\021\003i\021\001\006#sSZ,'O\0217pG.Le\016^3sM\006\034WM\003\002\004\t\005\021B\017[1v[&\034WM\\3sO&\034H/[2t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t!BI]5wKJ\024En\\2l\023:$XM\0354bG\026\034\"a\004\n\021\005MAR\"\001\013\013\005U1\022A\0029sK\032\f'M\003\002\030\r\005\031\021\r]5\n\005e!\"!\006#sSZ,'oU5eK\022$\026\016\\3F]RLG/\037\005\0067=!\t\001H\001\007y%t\027\016\036 \025\0035AQAH\b\005\002}\t!cZ3u)&dW-\0228uSRL8\t\\1tgR\t\001\005\r\002\"[A\031!\005K\026\017\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\002\rA\023X\rZ3g\023\tI#FA\003DY\006\0348O\003\002(IA\021A&\f\007\001\t%qS$!A\001\002\013\005qFA\002`IE\n\"\001M\032\021\005\r\n\024B\001\032%\005\035qu\016\0365j]\036\004\"a\t\033\n\005U\"#aA!os\")qg\004C\001q\005\t2M]3bi\026,eN^5s_:lWM\034;\025\rez$jT)T!\tQT(D\001<\025\tad#A\004oKR<xN]6\n\005yZ$AE'b]\006<W\rZ#om&\024xN\\7f]RDQ\001\021\034A\002\005\013Qa^8sY\022\004\"A\021%\016\003\rS!\001\021#\013\005\0253\025!C7j]\026\034'/\0314u\025\0059\025a\0018fi&\021\021j\021\002\006/>\024H\016\032\005\006\027Z\002\r\001T\001\002qB\0211%T\005\003\035\022\0221!\0238u\021\025\001f\0071\001M\003\005I\b\"\002*7\001\004a\025!\001>\t\013Q3\004\031A+\002\tMLG-\032\t\003-vk\021a\026\006\0031f\013A!\036;jY*\021!lW\001\007G>lWn\0348\013\005q3\025AD7j]\026\034'/\0314uM>\024x-Z\005\003=^\023aBR8sO\026$\025N]3di&|gN\002\003a\037\t\t'aC#om&\024xN\\7f]R\0342a\0302q!\r\031GMZ\007\002\t%\021Q\r\002\002\035\033\006t\027mZ3e)&dW-\0228uSRLXI\034<je>tW.\0328u!\t9g.D\001i\025\tI'.\001\003nSN\034'BA6m\003\021!\030\016\\3\013\0035\fa!\0319qK:<\027BA8i\0055!\026\016\\3J]R,'OZ1dKB\031a\"\0354\n\005I\024!A\004(fi^|'o[\"p]R\024x\016\034\005\tW~\023)\031!C\001iV\ta\r\003\005w?\n\005\t\025!\003g\003\025!\030\016\\3!\021\025Yr\f\"\001y)\tI8\020\005\002{?6\tq\002C\003lo\002\007amB\003~\037!\005a0\001\005Qe>4\030\016Z3s!\tQxPB\004\002\002=A\t!a\001\003\021A\023xN^5eKJ\034Ra`A\003\003+\001B!a\002\002\0225\021\021\021\002\006\005\003\027\ti!\001\003mC:<'BAA\b\003\021Q\027M^1\n\t\005M\021\021\002\002\007\037\nTWm\031;\021\t\005]\021QD\007\003\0033Q1!a\007\027\003\031!'/\033<fe&!\021qDA\r\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\031Yr\020\"\001\002$Q\ta\020C\004\002(}$\t%!\013\002\035\035,G/\0228wSJ|g.\\3oiR!\0211FA\033a\021\ti#!\r\021\t\tB\023q\006\t\004Y\005EBaCA\032\003K\t\t\021!A\003\002=\0221a\030\0233\021!\t9$!\nA\002\005e\022!B:uC\016\\\007\003BA\036\003\003j!!!\020\013\007\005}B)\001\003ji\026l\027\002BA\"\003{\021\021\"\023;f[N#\030mY6")
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
/*    */     @Callback(doc = "function():table -- Get a list of the stored essentia in the network.")
/* 19 */     public Object[] getEssentiaInNetwork(Context context, Arguments args) { return NetworkControl$class.getEssentiaInNetwork(this, context, args); } private final TileInterface tile; public TileInterface tile() { return this.tile; } public Environment(TileInterface tile) { super(tile, "me_interface"); NetworkControl$class.$init$(this); }
/*    */      } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$; public Provider$() {
/* 21 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 23 */       return li.cil.oc.integration.appeng.AEUtil$.MODULE$.isBlockInterface(stack) ? 
/* 24 */         DriverBlockInterface.Environment.class : 
/* 25 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\DriverBlockInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */