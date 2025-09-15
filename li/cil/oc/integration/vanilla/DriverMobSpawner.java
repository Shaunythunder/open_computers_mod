/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025u!B\001\003\021\003i\021\001\005#sSZ,'/T8c'B\fwO\\3s\025\t\031A!A\004wC:LG\016\\1\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005A!%/\033<fe6{'m\0259bo:,'o\005\002\020%A\0211\003G\007\002))\021QCF\001\007aJ,g-\0312\013\005]1\021aA1qS&\021\021\004\006\002\026\tJLg/\032:TS\022,G\rV5mK\026sG/\033;z\021\025Yr\002\"\001\035\003\031a\024N\\5u}Q\tQ\002C\003\037\037\021\005s$\001\nhKR$\026\016\\3F]RLG/_\"mCN\034H#\001\0211\005\005j\003c\001\022)W9\0211EJ\007\002I)\tQ%A\003tG\006d\027-\003\002(I\0051\001K]3eK\032L!!\013\026\003\013\rc\027m]:\013\005\035\"\003C\001\027.\031\001!\021BL\017\002\002\003\005)\021A\030\003\007}#\023'\005\0021gA\0211%M\005\003e\021\022qAT8uQ&tw\r\005\002$i%\021Q\007\n\002\004\003:L\b\"B\034\020\t\003B\024!E2sK\006$X-\0228wSJ|g.\\3oiR1\021h\020&P#N\003\"AO\037\016\003mR!\001\020\f\002\0179,Go^8sW&\021ah\017\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\003Am\001\007\021)A\003x_JdG\r\005\002C\0216\t1I\003\002A\t*\021QIR\001\n[&tWm\031:bMRT\021aR\001\004]\026$\030BA%D\005\0259vN\0357e\021\025Ye\0071\001M\003\005A\bCA\022N\023\tqEEA\002J]RDQ\001\025\034A\0021\013\021!\037\005\006%Z\002\r\001T\001\002u\")AK\016a\001+\006!1/\0333f!\t1V,D\001X\025\tA\026,\001\003vi&d'B\001.\\\003\031\031w.\\7p]*\021ALR\001\017[&tWm\031:bMR4wN]4f\023\tqvK\001\bG_J<W\rR5sK\016$\030n\0348\007\t\001|!!\031\002\f\013:4\030N]8o[\026tGoE\002`E2\0042a\0313g\033\005!\021BA3\005\005qi\025M\\1hK\022$\026\016\\3F]RLG/_#om&\024xN\\7f]R\004\"a\0326\016\003!T!!\033#\002\025QLG.Z3oi&$\0300\003\002lQ\n!B+\0337f\013:$\030\016^=N_\n\034\006/Y<oKJ\004\"!\0349\016\0039T!a\034\f\002\r\021\024\030N^3s\023\t\thN\001\006OC6,GM\0217pG.D\001b]0\003\002\003\006IAZ\001\013i&dW-\0228uSRL\b\"B\016`\t\003)HC\001<y!\t9x,D\001\020\021\025\031H\0171\001g\021\025Qx\f\"\021|\0035\001(/\0324feJ,GMT1nKR\tA\020E\002~\003\013i\021A \006\004\006\005\021\001\0027b]\036T!!a\001\002\t)\fg/Y\005\004\003\017q(AB*ue&tw\rC\004\002\f}#\t%!\004\002\021A\024\030n\034:jif$\022\001\024\005\b\003#yF\021AA\n\003I9W\r^*qC^t\027N\\4N_\nt\025-\\3\025\r\005U\021\021EA\031!\025\031\023qCA\016\023\r\tI\002\n\002\006\003J\024\030-\037\t\004G\005u\021bAA\020I\t1\021I\\=SK\032D\001\"a\t\002\020\001\007\021QE\001\bG>tG/\032=u!\021\t9#!\f\016\005\005%\"bAA\026-\0059Q.Y2iS:,\027\002BA\030\003S\021qaQ8oi\026DH\017\003\005\0024\005=\001\031AA\033\003\021\t'oZ:\021\t\005\035\022qG\005\005\003s\tICA\005Be\036,X.\0328ug\"B\021qBA\037\003\007\n)\005\005\003\002(\005}\022\002BA!\003S\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA$\003Y3WO\\2uS>t\007&\013\036tiJLgn\032\021.[\001:U\r\036\021uQ\026\004c.Y7fA=4\007\005\0365fA\025tG/\033;zAQD\027\r\036\021jg\002\022W-\0338hAM\004\030m\0368fI\002\022\027\020\t;iSN\0043\017]1x]\026\024hfB\004\002L=A\t!!\024\002\021A\023xN^5eKJ\0042a^A(\r\035\t\tf\004E\001\003'\022\001\002\025:pm&$WM]\n\007\003\037\n)&a\027\021\007u\f9&C\002\002Zy\024aa\0242kK\016$\bcA7\002^%\031\021q\f8\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\017m\ty\005\"\001\002dQ\021\021Q\n\005\t\003O\ny\005\"\021\002j\005qq-\032;F]ZL'o\0348nK:$H\003BA6\003k\002D!!\034\002rA!!\005KA8!\ra\023\021\017\003\f\003g\n)'!A\001\002\013\005qFA\002`IIB\001\"a\036\002f\001\007\021\021P\001\006gR\f7m\033\t\005\003w\n\t)\004\002\002~)\031\021q\020#\002\t%$X-\\\005\005\003\007\013iHA\005Ji\026l7\013^1dW\002")
/*    */ public final class DriverMobSpawner {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverMobSpawner$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverMobSpawner$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverMobSpawner$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityMobSpawner> implements NamedBlock {
/* 25 */     public Environment(TileEntityMobSpawner tileEntity) { super(tileEntity, "mob_spawner"); } private final TileEntityMobSpawner tileEntity; public String preferredName() {
/* 26 */       return "mob_spawner";
/*    */     } public int priority() {
/* 28 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():string -- Get the name of the entity that is being spawned by this spawner.")
/*    */     public Object[] getSpawningMobName(Context context, Arguments args) {
/* 32 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { this.tileEntity.func_145881_a().func_98276_e() }));
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 36 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150474_ac : Lnet/minecraft/block/Block;
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
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverMobSpawner$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #38	-> 0
/*    */       //   #39	-> 34
/*    */       //   #40	-> 39
/*    */       //   #38	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverMobSpawner$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverMobSpawner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */