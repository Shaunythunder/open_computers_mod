/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import net.minecraft.tileentity.TileEntityNote;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]v!B\001\003\021\003i\021a\004#sSZ,'OT8uK\ncwnY6\013\005\r!\021a\002<b]&dG.\031\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\037\021\023\030N^3s\035>$XM\0217pG.\034\"a\004\n\021\005MAR\"\001\013\013\005U1\022A\0029sK\032\f'M\003\002\030\r\005\031\021\r]5\n\005e!\"!\006#sSZ,'oU5eK\022$\026\016\\3F]RLG/\037\005\0067=!\t\001H\001\007y%t\027\016\036 \025\0035AQAH\b\005B}\t!cZ3u)&dW-\0228uSRL8\t\\1tgR\t\001\005\r\002\"[A\031!\005K\026\017\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\002\rA\023X\rZ3g\023\tI#FA\003DY\006\0348O\003\002(IA\021A&\f\007\001\t%qS$!A\001\002\013\005qFA\002`IE\n\"\001M\032\021\005\r\n\024B\001\032%\005\035qu\016\0365j]\036\004\"a\t\033\n\005U\"#aA!os\")qg\004C!q\005\t2M]3bi\026,eN^5s_:lWM\034;\025\rez$jT)T!\tQT(D\001<\025\tad#A\004oKR<xN]6\n\005yZ$AE'b]\006<W\rZ#om&\024xN\\7f]RDQ\001\021\034A\002\005\013Qa^8sY\022\004\"A\021%\016\003\rS!\001\021#\013\005\0253\025!C7j]\026\034'/\0314u\025\0059\025a\0018fi&\021\021j\021\002\006/>\024H\016\032\005\006\027Z\002\r\001T\001\002qB\0211%T\005\003\035\022\0221!\0238u\021\025\001f\0071\001M\003\005I\b\"\002*7\001\004a\025!\001>\t\013Q3\004\031A+\002\tMLG-\032\t\003-vk\021a\026\006\0031f\013A!\036;jY*\021!lW\001\007G>lWn\0348\013\005q3\025AD7j]\026\034'/\0314uM>\024x-Z\005\003=^\023aBR8sO\026$\025N]3di&|gN\002\003a\037\t\t'aC#om&\024xN\\7f]R\0342a\0302m!\r\031GMZ\007\002\t%\021Q\r\002\002\035\033\006t\027mZ3e)&dW-\0228uSRLXI\034<je>tW.\0328u!\t9'.D\001i\025\tIG)\001\006uS2,WM\034;jifL!a\0335\003\035QKG.Z#oi&$\030PT8uKB\021Q\016]\007\002]*\021qNF\001\007IJLg/\032:\n\005Et'A\003(b[\026$'\t\\8dW\"A1o\030B\001B\003%a-\001\006uS2,WI\034;jifDQaG0\005\002U$\"A\036=\021\005]|V\"A\b\t\013M$\b\031\0014\t\013i|F\021I>\002\033A\024XMZ3se\026$g*Y7f)\005a\bcA?\002\0065\taPC\002\000\003\003\tA\001\\1oO*\021\0211A\001\005U\0064\030-C\002\002\by\024aa\025;sS:<\007bBA\006?\022\005\023QB\001\taJLwN]5usR\tA\nC\004\002\022}#\t!a\005\002\021\035,G\017U5uG\"$b!!\006\002\"\005E\002#B\022\002\030\005m\021bAA\rI\t)\021I\035:bsB\0311%!\b\n\007\005}AE\001\004B]f\024VM\032\005\t\003G\ty\0011\001\002&\00591m\0348uKb$\b\003BA\024\003[i!!!\013\013\007\005-b#A\004nC\016D\027N\\3\n\t\005=\022\021\006\002\b\007>tG/\032=u\021!\t\031$a\004A\002\005U\022\001B1sON\004B!a\n\0028%!\021\021HA\025\005%\t%oZ;nK:$8\017\013\007\002\020\005u\0221IA#\003\017\nI\005\005\003\002(\005}\022\002BA!\003S\021\001bQ1mY\n\f7m[\001\007I&\024Xm\031;\032\003\005\t1\001Z8dC\t\tY%\001#gk:\034G/[8oQ%Rd.^7cKJ\004S&\f\021HKR\004C\017[3!GV\024(/\0328uYf\0043/\032;!a&$8\r\033\021p]\002\"\b.[:!]>$X\r\t2m_\016\\g\006C\004\002P}#\t!!\025\002\021M,G\017U5uG\"$b!!\006\002T\005U\003\002CA\022\003\033\002\r!!\n\t\021\005M\022Q\na\001\003kA\003\"!\024\002>\005\035\023\021L\021\003\0037\nQLZ;oGRLwN\034\025wC2,XM\0178v[\n,'/\013\021.[\001\032V\r\036\021uQ\026\004\003/\033;dQ\0022wN\035\021uQ&\034\bE\\8uK\002\022Gn\\2l]\001jUo\035;!E\026\004\023N\034\021uQ\026\004\023N\034;feZ\fG\016I.2Y\001\022T'\030\030\t\017\005}s\f\"\001\002b\0059AO]5hO\026\024HCBA\013\003G\n)\007\003\005\002$\005u\003\031AA\023\021!\t\031$!\030A\002\005U\002\006CA/\003{\t9%!\033\"\005\005-\024!\0364v]\016$\030n\0348)7BLGo\0315;]Vl'-\032:^Si\022wn\0347fC:\004S&\f\021Ue&<w-\032:tAQDW\r\t8pi\026\004#\r\\8dW\002Jg\r\t9pgNL'\r\\3/A\005cGn\\<tAM,G\017^5oO\002\"\b.\032\021qSR\034\007\016\t4pe\002\"x\016I:bm\026\004\023\r\t;jG.t\003bBA(?\022%\021q\016\013\005\003c\n9\bE\002$\003gJ1!!\036%\005\021)f.\033;\t\017\005e\024Q\016a\001\031\006)a/\0317vK\0369\021QP\b\t\002\005}\024\001\003)s_ZLG-\032:\021\007]\f\tIB\004\002\004>A\t!!\"\003\021A\023xN^5eKJ\034b!!!\002\b\0065\005cA?\002\n&\031\0211\022@\003\r=\023'.Z2u!\ri\027qR\005\004\003#s'aE#om&\024xN\\7f]R\004&o\034<jI\026\024\bbB\016\002\002\022\005\021Q\023\013\003\003B\001\"!'\002\002\022\005\0231T\001\017O\026$XI\034<je>tW.\0328u)\021\ti*a*1\t\005}\0251\025\t\005E!\n\t\013E\002-\003G#1\"!*\002\030\006\005\t\021!B\001_\t\031q\f\n\032\t\021\005%\026q\023a\001\003W\013Qa\035;bG.\004B!!,\00246\021\021q\026\006\004\003c#\025\001B5uK6LA!!.\0020\nI\021\n^3n'R\f7m\033")
/*    */ public final class DriverNoteBlock {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverNoteBlock$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverNoteBlock$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverNoteBlock$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityNote> implements NamedBlock {
/* 26 */     public Environment(TileEntityNote tileEntity) { super(tileEntity, "note_block"); } private final TileEntityNote tileEntity; public String preferredName() {
/* 27 */       return "note_block";
/*    */     } public int priority() {
/* 29 */       return 0;
/*    */     }
/*    */     @Callback(direct = true, doc = "function():number -- Get the currently set pitch on this note block.")
/*    */     public Object[] getPitch(Context context, Arguments args) {
/* 33 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.field_145879_a + 1) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(value:number) -- Set the pitch for this note block. Must be in the interval [1, 25].")
/*    */     public Object[] setPitch(Context context, Arguments args) {
/* 38 */       setPitch(args.checkInteger(0));
/* 39 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function([pitch:number]):boolean -- Triggers the note block if possible. Allows setting the pitch for to save a tick.")
/*    */     public Object[] trigger(Context context, Arguments args) {
/* 44 */       if (args.count() > 0 && args.checkAny(0) != null) {
/* 45 */         setPitch(args.checkInteger(0));
/*    */       }
/* 47 */       World world = this.tileEntity.func_145831_w();
/* 48 */       int x = this.tileEntity.field_145851_c;
/* 49 */       int y = this.tileEntity.field_145848_d;
/* 50 */       int z = this.tileEntity.field_145849_e;
/* 51 */       Material material = world.func_147439_a(x, y + 1, z).func_149688_o();
/* 52 */       boolean canTrigger = (material == Material.field_151579_a);
/* 53 */       this.tileEntity.func_145878_a(world, x, y, z);
/* 54 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(canTrigger) }));
/*    */     }
/*    */     
/*    */     private void setPitch(int value) {
/* 58 */       if (value < 1 || value > 25) {
/* 59 */         throw new IllegalArgumentException("invalid pitch");
/*    */       }
/* 61 */       this.tileEntity.field_145879_a = (byte)(value - 1);
/* 62 */       this.tileEntity.func_70296_d();
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 66 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150323_B : Lnet/minecraft/block/Block;
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
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverNoteBlock$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #68	-> 0
/*    */       //   #69	-> 34
/*    */       //   #70	-> 39
/*    */       //   #68	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverNoteBlock$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverNoteBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */