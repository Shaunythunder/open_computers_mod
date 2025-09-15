/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.tileentity.TileEntityComparator;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025u!B\001\003\021\003i\021\001\005#sSZ,'oQ8na\006\024\030\r^8s\025\t\031A!A\004wC:LG\016\\1\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005A!%/\033<fe\016{W\016]1sCR|'o\005\002\020%A\0211\003G\007\002))\021QCF\001\007aJ,g-\0312\013\005]1\021aA1qS&\021\021\004\006\002\026\tJLg/\032:TS\022,G\rV5mK\026sG/\033;z\021\025Yr\002\"\001\035\003\031a\024N\\5u}Q\tQ\002C\003\037\037\021\005s$\001\nhKR$\026\016\\3F]RLG/_\"mCN\034H#\001\0211\005\005j\003c\001\022)W9\0211EJ\007\002I)\tQ%A\003tG\006d\027-\003\002(I\0051\001K]3eK\032L!!\013\026\003\013\rc\027m]:\013\005\035\"\003C\001\027.\031\001!\021BL\017\002\002\003\005)\021A\030\003\007}#\023'\005\0021gA\0211%M\005\003e\021\022qAT8uQ&tw\r\005\002$i%\021Q\007\n\002\004\003:L\b\"B\034\020\t\003B\024!E2sK\006$X-\0228wSJ|g.\\3oiR1\021h\020&P#N\003\"AO\037\016\003mR!\001\020\f\002\0179,Go^8sW&\021ah\017\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\003Am\001\007\021)A\003x_JdG\r\005\002C\0216\t1I\003\002A\t*\021QIR\001\n[&tWm\031:bMRT\021aR\001\004]\026$\030BA%D\005\0259vN\0357e\021\025Ye\0071\001M\003\005A\bCA\022N\023\tqEEA\002J]RDQ\001\025\034A\0021\013\021!\037\005\006%Z\002\r\001T\001\002u\")AK\016a\001+\006!1/\0333f!\t1V,D\001X\025\tA\026,\001\003vi&d'B\001.\\\003\031\031w.\\7p]*\021ALR\001\017[&tWm\031:bMR4wN]4f\023\tqvK\001\bG_J<W\rR5sK\016$\030n\0348\007\t\001|!!\031\002\f\013:4\030N]8o[\026tGoE\002`E2\0042a\0313g\033\005!\021BA3\005\005qi\025M\\1hK\022$\026\016\\3F]RLG/_#om&\024xN\\7f]R\004\"a\0326\016\003!T!!\033#\002\025QLG.Z3oi&$\0300\003\002lQ\n!B+\0337f\013:$\030\016^=D_6\004\030M]1u_J\004\"!\0349\016\0039T!a\034\f\002\r\021\024\030N^3s\023\t\thN\001\006OC6,GM\0217pG.D\001b]0\003\002\003\006IAZ\001\013i&dW-\0228uSRL\b\"B\016`\t\003)HC\001<y!\t9x,D\001\020\021\025\031H\0171\001g\021\025Qx\f\"\021|\0035\001(/\0324feJ,GMT1nKR\tA\020E\002~\003\013i\021A \006\004\006\005\021\001\0027b]\036T!!a\001\002\t)\fg/Y\005\004\003\017q(AB*ue&tw\rC\004\002\f}#\t%!\004\002\021A\024\030n\034:jif$\022\001\024\005\b\003#yF\021AA\n\003=9W\r^(viB,HoU5h]\006dGCBA\013\003C\t\t\004E\003$\003/\tY\"C\002\002\032\021\022Q!\021:sCf\0042aIA\017\023\r\ty\002\n\002\007\003:L(+\0324\t\021\005\r\022q\002a\001\003K\tqaY8oi\026DH\017\005\003\002(\0055RBAA\025\025\r\tYCF\001\b[\006\034\007.\0338f\023\021\ty#!\013\003\017\r{g\016^3yi\"A\0211GA\b\001\004\t)$\001\003be\036\034\b\003BA\024\003oIA!!\017\002*\tI\021I]4v[\026tGo\035\025\t\003\037\ti$a\021\002FA!\021qEA \023\021\t\t%!\013\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\t9%A$gk:\034G/[8oQ%Rd.^7cKJ\004S&\f\021HKR\004C\017[3!gR\024XM\\4uQ\002zg\r\t;iK\002\032w.\0349be\006$xN]:!_V$\b/\036;!g&<g.\0317/\017\035\tYe\004E\001\003\033\n\001\002\025:pm&$WM\035\t\004o\006=caBA)\037!\005\0211\013\002\t!J|g/\0333feN1\021qJA+\0037\0022!`A,\023\r\tIF \002\007\037\nTWm\031;\021\0075\fi&C\002\002`9\0241#\0228wSJ|g.\\3oiB\023xN^5eKJDqaGA(\t\003\t\031\007\006\002\002N!A\021qMA(\t\003\nI'\001\bhKR,eN^5s_:lWM\034;\025\t\005-\024Q\017\031\005\003[\n\t\b\005\003#Q\005=\004c\001\027\002r\021Y\0211OA3\003\003\005\tQ!\0010\005\ryFE\r\005\t\003o\n)\0071\001\002z\005)1\017^1dWB!\0211PAA\033\t\tiHC\002\002\000\021\013A!\033;f[&!\0211QA?\005%IE/Z7Ti\006\0347\016")
/*    */ public final class DriverComparator {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverComparator$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverComparator$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverComparator$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityComparator> implements NamedBlock {
/* 24 */     public Environment(TileEntityComparator tileEntity) { super(tileEntity, "comparator"); } private final TileEntityComparator tileEntity; public String preferredName() {
/* 25 */       return "comparator";
/*    */     } public int priority() {
/* 27 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():number -- Get the strength of the comparators output signal.")
/*    */     public Object[] getOutputSignal(Context context, Arguments args) {
/* 31 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.func_145996_a()) }));
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
/*    */       //   8: getstatic net/minecraft/init/Items.field_151132_bS : Lnet/minecraft/item/Item;
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
/*    */       //   31: ldc li/cil/oc/integration/vanilla/DriverComparator$Environment
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
/*    */       //   0	38	0	this	Lli/cil/oc/integration/vanilla/DriverComparator$Provider$;
/*    */       //   0	38	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverComparator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */