/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.command.server.CommandBlockLogic;
/*    */ import net.minecraft.tileentity.TileEntityCommandBlock;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005%v!B\001\003\021\003i\021A\005#sSZ,'oQ8n[\006tGM\0217pG.T!a\001\003\002\017Y\fg.\0337mC*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!\003\022:jm\026\0248i\\7nC:$'\t\\8dWN\021qB\005\t\003'ai\021\001\006\006\003+Y\ta\001\035:fM\006\024'BA\f\007\003\r\t\007/[\005\0033Q\021Q\003\022:jm\026\0248+\0333fIRKG.Z#oi&$\030\020C\003\034\037\021\005A$\001\004=S:LGO\020\013\002\033!)ad\004C!?\005\021r-\032;US2,WI\034;jif\034E.Y:t)\005\001\003GA\021.!\r\021\003f\013\b\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005J\001\007!J,G-\0324\n\005%R#!B\"mCN\034(BA\024%!\taS\006\004\001\005\0239j\022\021!A\001\006\003y#aA0%cE\021\001g\r\t\003GEJ!A\r\023\003\0179{G\017[5oOB\0211\005N\005\003k\021\0221!\0218z\021\0259t\002\"\0219\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\007s}Ru*U*\021\005ijT\"A\036\013\005q2\022a\0028fi^|'o[\005\003}m\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")\001I\016a\001\003\006)qo\034:mIB\021!\tS\007\002\007*\021\001\t\022\006\003\013\032\013\021\"\\5oK\016\024\030M\032;\013\003\035\0131A\\3u\023\tI5IA\003X_JdG\rC\003Lm\001\007A*A\001y!\t\031S*\003\002OI\t\031\021J\034;\t\013A3\004\031\001'\002\003eDQA\025\034A\0021\013\021A\037\005\006)Z\002\r!V\001\005g&$W\r\005\002W;6\tqK\003\002Y3\006!Q\017^5m\025\tQ6,\001\004d_6lwN\034\006\0039\032\013a\"\\5oK\016\024\030M\032;g_J<W-\003\002_/\nqai\034:hK\022K'/Z2uS>tg\001\0021\020\005\005\0241\"\0228wSJ|g.\\3oiN\031qL\0317\021\007\r$g-D\001\005\023\t)GA\001\017NC:\fw-\0323US2,WI\034;jif,eN^5s_:lWM\034;\021\005\035TW\"\0015\013\005%$\025A\003;jY\026,g\016^5us&\0211\016\033\002\027)&dW-\0228uSRL8i\\7nC:$'\t\\8dWB\021Q\016]\007\002]*\021qNF\001\007IJLg/\032:\n\005Et'A\003(b[\026$'\t\\8dW\"A1o\030B\001B\003%a-\001\006uS2,WI\034;jifDQaG0\005\002U$\"A\036=\021\005]|V\"A\b\t\013M$\b\031\0014\t\013i|F\021I>\002\033A\024XMZ3se\026$g*Y7f)\005a\bcA?\002\0065\taPC\002\000\003\003\tA\001\\1oO*\021\0211A\001\005U\0064\030-C\002\002\by\024aa\025;sS:<\007bBA\006?\022\005\023QB\001\taJLwN]5usR\tA\nC\004\002\022}#\t!a\005\002\025\035,GoQ8n[\006tG\r\006\004\002\026\005\005\022\021\007\t\006G\005]\0211D\005\004\0033!#!B!se\006L\bcA\022\002\036%\031\021q\004\023\003\r\005s\027PU3g\021!\t\031#a\004A\002\005\025\022aB2p]R,\007\020\036\t\005\003O\ti#\004\002\002*)\031\0211\006\f\002\0175\f7\r[5oK&!\021qFA\025\005\035\031uN\034;fqRD\001\"a\r\002\020\001\007\021QG\001\005CJ<7\017\005\003\002(\005]\022\002BA\035\003S\021\021\"\021:hk6,g\016^:)\031\005=\021QHA\"\003\013\n9%!\023\021\t\005\035\022qH\005\005\003\003\nIC\001\005DC2d'-Y2l\003\031!\027N]3dif\t\021!A\002e_\016\f#!a\023\002\023\032,hn\031;j_:D\023FO:ue&tw\rI\027.A\035+G\017\t;iK\002\032w.\\7b]\022\0043-\036:sK:$H.\037\021tKR\004\023N\034\021uQ&\034\beY8n[\006tG\r\t2m_\016\\g\006C\004\002P}#\t!!\025\002\025M,GoQ8n[\006tG\r\006\004\002\026\005M\023Q\013\005\t\003G\ti\0051\001\002&!A\0211GA'\001\004\t)\004\013\005\002N\005u\022qIA-C\t\tY&\001&gk:\034G/[8oQY\fG.^3;gR\024\030N\\4*A5j\003eU3uAQDW\rI:qK\016Lg-[3eA\r|W.\\1oI\0022wN\035\021uQ\026\0043m\\7nC:$\007E\0317pG.t\003bBA0?\022\005\021\021M\001\017Kb,7-\036;f\007>lW.\0318e)\031\t)\"a\031\002f!A\0211EA/\001\004\t)\003\003\005\0024\005u\003\031AA\033Q!\ti&!\020\002H\005%\024EAA6\003y4WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001*\0050Z2vi\026\004C\017[3!GV\024(/\0328uYf\0043/\032;!G>lW.\0318e]\001\"\006.[:!Q\006\034\b%\031\021tY&<\007\016\036\021eK2\f\027\020\t;pA\005dGn\\<!i\",\007eY8n[\006tG\r\t2m_\016\\\007\005^8!aJ|\007/\032:ms\002*\b\017Z1uK::q!a\034\020\021\003\t\t(\001\005Qe>4\030\016Z3s!\r9\0301\017\004\b\003kz\001\022AA<\005!\001&o\034<jI\026\0248CBA:\003s\ny\bE\002~\003wJ1!! \005\031y%M[3diB\031Q.!!\n\007\005\reNA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\004\034\003g\"\t!a\"\025\005\005E\004\002CAF\003g\"\t%!$\002\035\035,G/\0228wSJ|g.\\3oiR!\021qRAMa\021\t\t*!&\021\t\tB\0231\023\t\004Y\005UEaCAL\003\023\013\t\021!A\003\002=\0221a\030\0233\021!\tY*!#A\002\005u\025!B:uC\016\\\007\003BAP\003Kk!!!)\013\007\005\rF)\001\003ji\026l\027\002BAT\003C\023\021\"\023;f[N#\030mY6")
/*    */ public final class DriverCommandBlock {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverCommandBlock$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverCommandBlock$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverCommandBlock$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityCommandBlock> implements NamedBlock {
/* 26 */     public Environment(TileEntityCommandBlock tileEntity) { super(tileEntity, "command_block"); } private final TileEntityCommandBlock tileEntity; public String preferredName() {
/* 27 */       return "command_block";
/*    */     } public int priority() {
/* 29 */       return 0;
/*    */     }
/*    */     @Callback(direct = true, doc = "function():string -- Get the command currently set in this command block.")
/*    */     public Object[] getCommand(Context context, Arguments args) {
/* 33 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { this.tileEntity.func_145993_a().func_145753_i() }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(value:string) -- Set the specified command for the command block.")
/*    */     public Object[] setCommand(Context context, Arguments args) {
/* 38 */       this.tileEntity.func_145993_a().func_145752_a(args.checkString(0));
/* 39 */       this.tileEntity.func_145831_w().func_147471_g(this.tileEntity.field_145851_c, this.tileEntity.field_145848_d, this.tileEntity.field_145849_e);
/* 40 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Execute the currently set command. This has a slight delay to allow the command block to properly update.")
/*    */     public Object[] executeCommand(Context context, Arguments args) {
/* 45 */       context.pause(0.1D);
/*    */ 
/*    */ 
/*    */       
/* 49 */       CommandBlockLogic commandSender = this.tileEntity.func_145993_a();
/* 50 */       commandSender.func_145755_a(this.tileEntity.func_145831_w());
/* 51 */       return MinecraftServer.func_71276_C().func_82356_Z() ? li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(commandSender.func_145760_g()), commandSender.func_145749_h().func_150260_c() })) : li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { null, "command blocks are disabled" }));
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     
/*    */     public Provider$() {
/* 56 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150483_bI : Lnet/minecraft/block/Block;
/*    */       //   14: astore_2
/*    */       //   15: dup
/*    */       //   16: ifnonnull -> 27
/*    */       //   19: pop
/*    */       //   20: aload_2
/*    */       //   21: ifnull -> 34
/*    */       //   24: goto -> 39
/*    */       //   27: aload_2
/*    */       //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   31: ifeq -> 39
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverCommandBlock$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #58	-> 0
/*    */       //   #59	-> 34
/*    */       //   #60	-> 39
/*    */       //   #58	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverCommandBlock$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverCommandBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */