/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.tileentity.TileEntityBrewingStand;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025u!B\001\003\021\003i\021A\005#sSZ,'O\021:fo&twm\025;b]\022T!a\001\003\002\017Y\fg.\0337mC*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!\003\022:jm\026\024(I]3xS:<7\013^1oIN\021qB\005\t\003'ai\021\001\006\006\003+Y\ta\001\035:fM\006\024'BA\f\007\003\r\t\007/[\005\0033Q\021Q\003\022:jm\026\0248+\0333fIRKG.Z#oi&$\030\020C\003\034\037\021\005A$\001\004=S:LGO\020\013\002\033!)ad\004C!?\005\021r-\032;US2,WI\034;jif\034E.Y:t)\005\001\003GA\021.!\r\021\003f\013\b\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005J\001\007!J,G-\0324\n\005%R#!B\"mCN\034(BA\024%!\taS\006\004\001\005\0239j\022\021!A\001\006\003y#aA0%cE\021\001g\r\t\003GEJ!A\r\023\003\0179{G\017[5oOB\0211\005N\005\003k\021\0221!\0218z\021\0259t\002\"\0219\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\007s}Ru*U*\021\005ijT\"A\036\013\005q2\022a\0028fi^|'o[\005\003}m\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")\001I\016a\001\003\006)qo\034:mIB\021!\tS\007\002\007*\021\001\t\022\006\003\013\032\013\021\"\\5oK\016\024\030M\032;\013\003\035\0131A\\3u\023\tI5IA\003X_JdG\rC\003Lm\001\007A*A\001y!\t\031S*\003\002OI\t\031\021J\034;\t\013A3\004\031\001'\002\003eDQA\025\034A\0021\013\021A\037\005\006)Z\002\r!V\001\005g&$W\r\005\002W;6\tqK\003\002Y3\006!Q\017^5m\025\tQ6,\001\004d_6lwN\034\006\0039\032\013a\"\\5oK\016\024\030M\032;g_J<W-\003\002_/\nqai\034:hK\022K'/Z2uS>tg\001\0021\020\005\005\0241\"\0228wSJ|g.\\3oiN\031qL\0317\021\007\r$g-D\001\005\023\t)GA\001\017NC:\fw-\0323US2,WI\034;jif,eN^5s_:lWM\034;\021\005\035TW\"\0015\013\005%$\025A\003;jY\026,g\016^5us&\0211\016\033\002\027)&dW-\0228uSRL(I]3xS:<7\013^1oIB\021Q\016]\007\002]*\021qNF\001\007IJLg/\032:\n\005Et'A\003(b[\026$'\t\\8dW\"A1o\030B\001B\003%a-\001\006uS2,WI\034;jifDQaG0\005\002U$\"A\036=\021\005]|V\"A\b\t\013M$\b\031\0014\t\013i|F\021I>\002\033A\024XMZ3se\026$g*Y7f)\005a\bcA?\002\0065\taPC\002\000\003\003\tA\001\\1oO*\021\0211A\001\005U\0064\030-C\002\002\by\024aa\025;sS:<\007bBA\006?\022\005\023QB\001\taJLwN]5usR\tA\nC\004\002\022}#\t!a\005\002\027\035,GO\021:foRKW.\032\013\007\003+\t\t#!\r\021\013\r\n9\"a\007\n\007\005eAEA\003BeJ\f\027\020E\002$\003;I1!a\b%\005\031\te.\037*fM\"A\0211EA\b\001\004\t)#A\004d_:$X\r\037;\021\t\005\035\022QF\007\003\003SQ1!a\013\027\003\035i\027m\0315j]\026LA!a\f\002*\t91i\0348uKb$\b\002CA\032\003\037\001\r!!\016\002\t\005\024xm\035\t\005\003O\t9$\003\003\002:\005%\"!C!sOVlWM\034;tQ!\ty!!\020\002D\005\025\003\003BA\024\003IA!!\021\002*\tA1)\0317mE\006\0347.A\002e_\016\f#!a\022\0021\032,hn\031;j_:D\023F\0178v[\n,'\017I\027.A\035+G\017\t;iK\002rW/\0342fe\002zg\r\t;jG.\034\bE]3nC&t\027N\\4!_\032\004C\017[3!GV\024(/\0328uA\t\024Xm^5oO\002z\007/\032:bi&|gNL\004\b\003\027z\001\022AA'\003!\001&o\034<jI\026\024\bcA<\002P\0319\021\021K\b\t\002\005M#\001\003)s_ZLG-\032:\024\r\005=\023QKA.!\ri\030qK\005\004\0033r(AB(cU\026\034G\017E\002n\003;J1!a\030o\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\035Y\022q\nC\001\003G\"\"!!\024\t\021\005\035\024q\nC!\003S\nabZ3u\013:4\030N]8o[\026tG\017\006\003\002l\005U\004\007BA7\003c\002BA\t\025\002pA\031A&!\035\005\027\005M\024QMA\001\002\003\025\ta\f\002\004?\022\022\004\002CA<\003K\002\r!!\037\002\013M$\030mY6\021\t\005m\024\021Q\007\003\003{R1!a E\003\021IG/Z7\n\t\005\r\025Q\020\002\n\023R,Wn\025;bG.\004")
/*    */ public final class DriverBrewingStand {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBrewingStand$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverBrewingStand$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBrewingStand$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityBrewingStand> implements NamedBlock {
/* 24 */     public Environment(TileEntityBrewingStand tileEntity) { super(tileEntity, "brewing_stand"); } private final TileEntityBrewingStand tileEntity; public String preferredName() {
/* 25 */       return "brewing_stand";
/*    */     } public int priority() {
/* 27 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():number -- Get the number of ticks remaining of the current brewing operation.")
/*    */     public Object[] getBrewTime(Context context, Arguments args) {
/* 31 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.func_145935_i()) }));
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 35 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 36
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: getstatic net/minecraft/init/Items.field_151067_bt : Lnet/minecraft/item/Item;
/*    */       //   11: astore_2
/*    */       //   12: dup
/*    */       //   13: ifnonnull -> 24
/*    */       //   16: pop
/*    */       //   17: aload_2
/*    */       //   18: ifnull -> 31
/*    */       //   21: goto -> 36
/*    */       //   24: aload_2
/*    */       //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   28: ifeq -> 36
/*    */       //   31: ldc li/cil/oc/integration/vanilla/DriverBrewingStand$Environment
/*    */       //   33: goto -> 37
/*    */       //   36: aconst_null
/*    */       //   37: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #37	-> 0
/*    */       //   #38	-> 31
/*    */       //   #39	-> 36
/*    */       //   #37	-> 37
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	38	0	this	Lli/cil/oc/integration/vanilla/DriverBrewingStand$Provider$;
/*    */       //   0	38	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverBrewingStand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */