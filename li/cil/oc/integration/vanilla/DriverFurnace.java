/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import net.minecraft.tileentity.TileEntityFurnace;
/*    */ import net.minecraft.world.World;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Uv!B\001\003\021\003i\021!\004#sSZ,'OR;s]\006\034WM\003\002\004\t\0059a/\0318jY2\f'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\007Ee&4XM\035$ve:\f7-Z\n\003\037I\001\"a\005\r\016\003QQ!!\006\f\002\rA\024XMZ1c\025\t9b!A\002ba&L!!\007\013\003+\021\023\030N^3s'&$W\r\032+jY\026,e\016^5us\")1d\004C\0019\0051A(\0338jiz\"\022!\004\005\006==!\teH\001\023O\026$H+\0337f\013:$\030\016^=DY\006\0348\017F\001!a\t\tS\006E\002#Q-r!a\t\024\016\003\021R\021!J\001\006g\016\fG.Y\005\003O\021\na\001\025:fI\0264\027BA\025+\005\025\031E.Y:t\025\t9C\005\005\002-[1\001A!\003\030\036\003\003\005\tQ!\0010\005\ryF%M\t\003aM\002\"aI\031\n\005I\"#a\002(pi\"Lgn\032\t\003GQJ!!\016\023\003\007\005s\027\020C\0038\037\021\005\003(A\tde\026\fG/Z#om&\024xN\\7f]R$b!O K\037F\033\006C\001\036>\033\005Y$B\001\037\027\003\035qW\r^<pe.L!AP\036\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006\001Z\002\r!Q\001\006o>\024H\016\032\t\003\005\"k\021a\021\006\003\001\022S!!\022$\002\0235Lg.Z2sC\032$(\"A$\002\0079,G/\003\002J\007\n)qk\034:mI\")1J\016a\001\031\006\t\001\020\005\002$\033&\021a\n\n\002\004\023:$\b\"\002)7\001\004a\025!A=\t\013I3\004\031\001'\002\003iDQ\001\026\034A\002U\013Aa]5eKB\021a+X\007\002/*\021\001,W\001\005kRLGN\003\002[7\00611m\\7n_:T!\001\030$\002\0355Lg.Z2sC\032$hm\034:hK&\021al\026\002\017\r>\024x-\032#je\026\034G/[8o\r\021\001wBA1\003\027\025sg/\033:p]6,g\016^\n\004?\nd\007cA2eM6\tA!\003\002f\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\bCA4k\033\005A'BA5E\003)!\030\016\\3f]RLG/_\005\003W\"\024\021\003V5mK\026sG/\033;z\rV\024h.Y2f!\ti\007/D\001o\025\tyg#\001\004ee&4XM]\005\003c:\024!BT1nK\022\024En\\2l\021!\031xL!A!\002\0231\027A\003;jY\026,e\016^5us\")1d\030C\001kR\021a\017\037\t\003o~k\021a\004\005\006gR\004\rA\032\005\006u~#\te_\001\016aJ,g-\032:sK\022t\025-\\3\025\003q\0042!`A\003\033\005q(bA@\002\002\005!A.\0318h\025\t\t\031!\001\003kCZ\f\027bAA\004}\n11\013\036:j]\036Dq!a\003`\t\003\ni!\001\005qe&|'/\033;z)\005a\005bBA\t?\022\005\0211C\001\fO\026$()\036:o)&lW\r\006\004\002\026\005\005\022\021\007\t\006G\005]\0211D\005\004\0033!#!B!se\006L\bcA\022\002\036%\031\021q\004\023\003\r\005s\027PU3g\021!\t\031#a\004A\002\005\025\022aB2p]R,\007\020\036\t\005\003O\ti#\004\002\002*)\031\0211\006\f\002\0175\f7\r[5oK&!\021qFA\025\005\035\031uN\034;fqRD\001\"a\r\002\020\001\007\021QG\001\005CJ<7\017\005\003\002(\005]\022\002BA\035\003S\021\021\"\021:hk6,g\016^:)\021\005=\021QHA\"\003\013\002B!a\n\002@%!\021\021IA\025\005!\031\025\r\0347cC\016\\\027a\0013pG\006\022\021qI\001iMVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!)\",\007E\\;nE\026\024\be\0344!i&\0347n\035\021uQ\006$\b\005\0365fA\031,(O\\1dK\002:\030\016\0347!W\026,\007\017\t2ve:Lgn\032\021ge>l\007\005\0365fA1\f7\017\036\021d_:\034X/\\3eA\031,X\r\034\030\t\017\005-s\f\"\001\002N\005Yq-\032;D_>\\G+[7f)\031\t)\"a\024\002R!A\0211EA%\001\004\t)\003\003\005\0024\005%\003\031AA\033Q!\tI%!\020\002D\005U\023EAA,\003Q3WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001\"\006.\032\021ok6\024WM\035\021pM\002\"\030nY6tAQD\027\r\036\021uQ\026\0043-\036:sK:$\b%\033;f[\002B\027m\035\021cK\026t\007eY8pW&tw\r\t4pe:Bq!a\027`\t\003\ti&\001\fhKR\034UO\035:f]RLE/Z7CkJtG+[7f)\031\t)\"a\030\002b!A\0211EA-\001\004\t)\003\003\005\0024\005e\003\031AA\033Q!\tI&!\020\002D\005\025\024EAA4\003a3WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001\"\006.\032\021ok6\024WM\035\021pM\002\"\030nY6tAQD\027\r\036\021uQ\026\0043-\036:sK:$H.\037\021ckJt\027N\\4!MV,G\016\t7bgR\034\b%\0338!i>$\030\r\034\030\t\017\005-t\f\"\001\002n\005I\021n\035\"ve:Lgn\032\013\007\003+\ty'!\035\t\021\005\r\022\021\016a\001\003KA\001\"a\r\002j\001\007\021Q\007\025\t\003S\ni$a\021\002v\005\022\021qO\001CMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.A\035+G\017I<iKRDWM\035\021uQ\026\004c-\036:oC\016,\007%[:!GV\024(/\0328uYf\004\023m\031;jm\026tsaBA>\037!\005\021QP\001\t!J|g/\0333feB\031q/a \007\017\005\005u\002#\001\002\004\nA\001K]8wS\022,'o\005\004\002\000\005\025\0251\022\t\004{\006\035\025bAAE}\n1qJ\0316fGR\0042!\\AG\023\r\tyI\034\002\024\013:4\030N]8o[\026tG\017\025:pm&$WM\035\005\b7\005}D\021AAJ)\t\ti\b\003\005\002\030\006}D\021IAM\00399W\r^#om&\024xN\\7f]R$B!a'\002&B\"\021QTAQ!\021\021\003&a(\021\0071\n\t\013B\006\002$\006U\025\021!A\001\006\003y#aA0%e!A\021qUAK\001\004\tI+A\003ti\006\0347\016\005\003\002,\006EVBAAW\025\r\ty\013R\001\005SR,W.\003\003\0024\0065&!C%uK6\034F/Y2l\001")
/*    */ public final class DriverFurnace {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverFurnace$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverFurnace$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverFurnace$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityFurnace> implements NamedBlock {
/* 25 */     public Environment(TileEntityFurnace tileEntity) { super(tileEntity, "furnace"); } private final TileEntityFurnace tileEntity; public String preferredName() {
/* 26 */       return "furnace";
/*    */     } public int priority() {
/* 28 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():number -- The number of ticks that the furnace will keep burning from the last consumed fuel.")
/*    */     public Object[] getBurnTime(Context context, Arguments args) {
/* 32 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.field_145956_a) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- The number of ticks that the current item has been cooking for.")
/*    */     public Object[] getCookTime(Context context, Arguments args) {
/* 37 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.field_145961_j) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- The number of ticks that the currently burning fuel lasts in total.")
/*    */     public Object[] getCurrentItemBurnTime(Context context, Arguments args) {
/* 42 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.field_145963_i) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean -- Get whether the furnace is currently active.")
/*    */     public Object[] isBurning(Context context, Arguments args) {
/* 47 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.tileEntity.func_145950_i()) }));
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 51 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150460_al : Lnet/minecraft/block/Block;
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
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverFurnace$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #53	-> 0
/*    */       //   #54	-> 34
/*    */       //   #55	-> 39
/*    */       //   #53	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverFurnace$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverFurnace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */