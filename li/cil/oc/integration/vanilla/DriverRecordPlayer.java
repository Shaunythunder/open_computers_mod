/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.block.BlockJukebox;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055v!B\001\003\021\003i\021A\005#sSZ,'OU3d_J$\007\013\\1zKJT!a\001\003\002\017Y\fg.\0337mC*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!\003\022:jm\026\024(+Z2pe\022\004F.Y=feN\021qB\005\t\003'ai\021\001\006\006\003+Y\ta\001\035:fM\006\024'BA\f\007\003\r\t\007/[\005\0033Q\021Q\003\022:jm\026\0248+\0333fIRKG.Z#oi&$\030\020C\003\034\037\021\005A$\001\004=S:LGO\020\013\002\033!)ad\004C!?\005\021r-\032;US2,WI\034;jif\034E.Y:t)\005\001\003GA\021.!\r\021\003f\013\b\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005J\001\007!J,G-\0324\n\005%R#!B\"mCN\034(BA\024%!\taS\006\004\001\005\0239j\022\021!A\001\006\003y#aA0%cE\021\001g\r\t\003GEJ!A\r\023\003\0179{G\017[5oOB\0211\005N\005\003k\021\0221!\0218z\021\0259t\002\"\0219\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\007s}Ru*U*\021\005ijT\"A\036\013\005q2\022a\0028fi^|'o[\005\003}m\022!#T1oC\036,G-\0228wSJ|g.\\3oi\")\001I\016a\001\003\006)qo\034:mIB\021!\tS\007\002\007*\021\001\t\022\006\003\013\032\013\021\"\\5oK\016\024\030M\032;\013\003\035\0131A\\3u\023\tI5IA\003X_JdG\rC\003Lm\001\007A*A\001y!\t\031S*\003\002OI\t\031\021J\034;\t\013A3\004\031\001'\002\003eDQA\025\034A\0021\013\021A\037\005\006)Z\002\r!V\001\005g&$W\r\005\002W;6\tqK\003\002Y3\006!Q\017^5m\025\tQ6,\001\004d_6lwN\034\006\0039\032\013a\"\\5oK\016\024\030M\032;g_J<W-\003\002_/\nqai\034:hK\022K'/Z2uS>tg\001\0021\020\005\005\0241\"\0228wSJ|g.\\3oiN\031qL\0319\021\007\r$g-D\001\005\023\t)GA\001\017NC:\fw-\0323US2,WI\034;jif,eN^5s_:lWM\034;\021\005\035lgB\0015l\033\005I'B\0016E\003\025\021Gn\\2l\023\ta\027.\001\007CY>\0347NS;lK\n|\0070\003\002o_\n\tB+\0337f\013:$\030\016^=Kk.,'m\034=\013\0051L\007CA9u\033\005\021(BA:\027\003\031!'/\033<fe&\021QO\035\002\013\035\006lW\r\032\"m_\016\\\007\002C<`\005\003\005\013\021\0024\002\025QLG.Z#oi&$\030\020C\003\034?\022\005\021\020\006\002{yB\0211pX\007\002\037!)q\017\037a\001M\")ap\030C!\006i\001O]3gKJ\024X\r\032(b[\026$\"!!\001\021\t\005\r\021QB\007\003\003\013QA!a\002\002\n\005!A.\0318h\025\t\tY!\001\003kCZ\f\027\002BA\b\003\013\021aa\025;sS:<\007bBA\n?\022\005\023QC\001\taJLwN]5usR\tA\nC\004\002\032}#\t!a\007\002\023\035,GOU3d_J$GCBA\017\003S\tI\004E\003$\003?\t\031#C\002\002\"\021\022Q!\021:sCf\0042aIA\023\023\r\t9\003\n\002\007\003:L(+\0324\t\021\005-\022q\003a\001\003[\tqaY8oi\026DH\017\005\003\0020\005URBAA\031\025\r\t\031DF\001\b[\006\034\007.\0338f\023\021\t9$!\r\003\017\r{g\016^3yi\"A\0211HA\f\001\004\ti$\001\003be\036\034\b\003BA\030\003IA!!\021\0022\tI\021I]4v[\026tGo\035\025\t\003/\t)%a\023\002NA!\021qFA$\023\021\tI%!\r\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\ty%\001&gk:\034G/[8oQ%R4\017\036:j]\036\004S&\f\021HKR\004C\017[3!i&$H.\032\021pM\002\"\b.\032\021sK\016|'\017\032\021dkJ\024XM\034;ms\002Jg\016\t;iK\002RWo[3c_bt\003bBA*?\022\005\021QK\001\005a2\f\027\020\006\004\002\036\005]\023\021\f\005\t\003W\t\t\0061\001\002.!A\0211HA)\001\004\ti\004\013\005\002R\005\025\0231JA/C\t\ty&\001!gk:\034G/[8oQ%\002S&\f\021Ti\006\024H\017\t9mCfLgn\032\021uQ\026\004#/Z2pe\022\0043-\036:sK:$H.\037\021j]\002\"\b.\032\021kk.,'m\034=/\021\035\t\031g\030C\001\003K\nAa\035;paR1\021QDA4\003SB\001\"a\013\002b\001\007\021Q\006\005\t\003w\t\t\0071\001\002>!B\021\021MA#\003\027\ni'\t\002\002p\005yd-\0368di&|g\016K\025![5\0023\013^8qAAd\027-_5oO\002\"\b.\032\021sK\016|'\017\032\021dkJ\024XM\034;ms\002Jg\016\t;iK\002RWo[3c_btsaBA:\037!\005\021QO\001\t!J|g/\0333feB\03110a\036\007\017\005et\002#\001\002|\tA\001K]8wS\022,'o\005\004\002x\005u\0241\021\t\005\003\007\ty(\003\003\002\002\006\025!AB(cU\026\034G\017E\002r\003\013K1!a\"s\005M)eN^5s_:lWM\034;Qe>4\030\016Z3s\021\035Y\022q\017C\001\003\027#\"!!\036\t\021\005=\025q\017C!\003#\013abZ3u\013:4\030N]8o[\026tG\017\006\003\002\024\006u\005\007BAK\0033\003BA\t\025\002\030B\031A&!'\005\027\005m\025QRA\001\002\003\025\ta\f\002\004?\022\022\004\002CAP\003\033\003\r!!)\002\013M$\030mY6\021\t\005\r\026\021V\007\003\003KS1!a*E\003\021IG/Z7\n\t\005-\026Q\025\002\n\023R,Wn\025;bG.\004")
/*    */ public final class DriverRecordPlayer {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverRecordPlayer$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverRecordPlayer$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverRecordPlayer$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<BlockJukebox.TileEntityJukebox> implements NamedBlock {
/* 26 */     public Environment(BlockJukebox.TileEntityJukebox tileEntity) { super(tileEntity, "jukebox"); } private final BlockJukebox.TileEntityJukebox tileEntity; public String preferredName() {
/* 27 */       return "jukebox";
/*    */     } public int priority() {
/* 29 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():string -- Get the title of the record currently in the jukebox.")
/*    */     public Object[] getRecord(Context context, Arguments args) {
/* 33 */       ItemStack record = this.tileEntity.func_145856_a();
/* 34 */       return (record != null && record.func_77973_b() instanceof ItemRecord) ? 
/* 35 */         li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { ((ItemRecord)record.func_77973_b()).func_150927_i()
/*    */             
/* 37 */             })) : null;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function() -- Start playing the record currently in the jukebox.")
/*    */     public Object[] play(Context context, Arguments args) {
/* 42 */       ItemStack record = this.tileEntity.func_145856_a();
/*    */       
/* 44 */       this.tileEntity.func_145831_w().func_72889_a(null, 1005, this.tileEntity.field_145851_c, this.tileEntity.field_145848_d, this.tileEntity.field_145849_e, Item.func_150891_b(record.func_77973_b()));
/* 45 */       return (record != null && record.func_77973_b() instanceof ItemRecord) ? li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*    */             
/* 47 */             })) : null;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function() -- Stop playing the record currently in the jukebox.")
/*    */     public Object[] stop(Context context, Arguments args) {
/* 52 */       this.tileEntity.func_145831_w().func_72926_e(1005, this.tileEntity.field_145851_c, this.tileEntity.field_145848_d, this.tileEntity.field_145849_e, 0);
/* 53 */       this.tileEntity.func_145831_w().func_72934_a(null, this.tileEntity.field_145851_c, this.tileEntity.field_145848_d, this.tileEntity.field_145849_e);
/* 54 */       return null;
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 58 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150421_aI : Lnet/minecraft/block/Block;
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
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverRecordPlayer$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #60	-> 0
/*    */       //   #61	-> 34
/*    */       //   #62	-> 39
/*    */       //   #60	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverRecordPlayer$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverRecordPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */