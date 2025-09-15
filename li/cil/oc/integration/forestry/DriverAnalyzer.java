/*    */ package li.cil.oc.integration.forestry;
/*    */ import forestry.core.tiles.TileAnalyzer;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}b\001B\001\003\0015\021a\002\022:jm\026\024\030I\\1msj,'O\003\002\004\t\005Aam\034:fgR\024\030P\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003+\021\023\030N^3s'&$W\r\032+jY\026,e\016^5us\")q\003\001C\0011\0051A(\0338jiz\"\022!\007\t\0035\001i\021A\001\005\0069\001!\t%H\001\023O\026$H+\0337f\013:$\030\016^=DY\006\0348\017F\001\037!\ryBEJ\007\002A)\021\021EI\001\005Y\006twMC\001$\003\021Q\027M^1\n\005\025\002#!B\"mCN\034\bCA\024.\033\005A#BA\025+\003\025!\030\016\\3t\025\tYC&\001\003d_J,'\"A\002\n\0059B#\001\004+jY\026\fe.\0317zu\026\024\b\"\002\031\001\t\003\n\024!E2sK\006$X-\0228wSJ|g.\\3oiRY!'!\002\002\034\005}\0211EA\024!\t\031D'D\001\001\r\021)\004A\001\034\003\027\025sg/\033:p]6,g\016^\n\004i]Z\004c\001\035:M5\tA!\003\002;\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\bC\001\037@\033\005i$B\001 \023\003\031!'/\033<fe&\021\001)\020\002\013\035\006lW\r\032\"m_\016\\\007\002\003\"5\005\003\005\013\021\002\024\002\025QLG.Z#oi&$\030\020C\003\030i\021\005A\t\006\0023\013\")!i\021a\001M!)q\t\016C!\021\006i\001O]3gKJ\024X\r\032(b[\026$\022!\023\t\003?)K!a\023\021\003\rM#(/\0338h\021\025iE\007\"\021O\003!\001(/[8sSRLH#A(\021\005A\033V\"A)\013\003I\013Qa]2bY\006L!\001V)\003\007%sG\017C\003Wi\021\005q+A\005jg^{'o[5oOR\031\001L\0304\021\007AK6,\003\002[#\n)\021I\035:bsB\021\001\013X\005\003;F\023a!\0218z%\0264\007\"B0V\001\004\001\027aB2p]R,\007\020\036\t\003C\022l\021A\031\006\003GJ\tq!\\1dQ&tW-\003\002fE\n91i\0348uKb$\b\"B4V\001\004A\027\001B1sON\004\"!Y5\n\005)\024'!C!sOVlWM\034;tQ\021)Fn\0349\021\005\005l\027B\0018c\005!\031\025\r\0347cC\016\\\027a\0013pG\006\n\021/\001\035gk:\034G/[8oQ%R$m\\8mK\006t\007%L\027!\017\026$\be\0365fi\",'\017\t;iK\002\ng.\0317zu\026\024\beY1oA]|'o\033\030\t\013M$D\021\001;\002\027\035,G\017\025:pOJ,7o\035\013\0041V4\b\"B0s\001\004\001\007\"B4s\001\004A\007\006\002:m_b\f\023!_\001AMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.A\035+G\017\t;iK\002\002(o\\4sKN\034\be\0344!i\",\007eY;se\026tG\017I8qKJ\fG/[8o]!)1\020\016C\001y\0061r-\032;J]\022Lg/\0333vC2|e\016R5ta2\f\027\020F\002Y{zDQa\030>A\002\001DQa\032>A\002!DSA\0377p\003\003\t#!a\001\002y\031,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001:U\r\036\021j]\032|\007e\0348!i\",\007eY;se\026tG\017\\=!aJ,7/\0328uA\t,WM\f\005\b\003\017y\003\031AA\005\003\0259xN\0357e!\021\tY!a\006\016\005\0055!\002BA\004\003\037QA!!\005\002\024\005IQ.\0338fGJ\fg\r\036\006\003\003+\t1A\\3u\023\021\tI\"!\004\003\013]{'\017\0343\t\r\005uq\0061\001P\003\005A\bBBA\021_\001\007q*A\001z\021\031\t)c\fa\001\037\006\t!\020C\004\002*=\002\r!a\013\002\tMLG-\032\t\005\003[\tY$\004\002\0020)!\021\021GA\032\003\021)H/\0337\013\t\005U\022qG\001\007G>lWn\0348\013\t\005e\0221C\001\017[&tWm\031:bMR4wN]4f\023\021\ti$a\f\003\035\031{'oZ3ESJ,7\r^5p]\002")
/*    */ public class DriverAnalyzer extends DriverSidedTileEntity {
/*    */   public Class<TileAnalyzer> getTileEntityClass() {
/* 16 */     return TileAnalyzer.class;
/*    */   } public Environment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 18 */     return new Environment(this, (TileAnalyzer)world.func_147438_o(x, y, z));
/*    */   } public final class Environment extends ManagedTileEntityEnvironment<TileAnalyzer> implements NamedBlock {
/* 20 */     private final TileAnalyzer tileEntity; public Environment(DriverAnalyzer $outer, TileAnalyzer tileEntity) { super(tileEntity, "forestry_analyzer"); } public String preferredName() {
/* 21 */       return "forestry_analyzer";
/*    */     } public int priority() {
/* 23 */       return 0;
/*    */     } @Callback(doc = "function():boolean -- Get whether the analyzer can work.")
/*    */     public Object[] isWorking(Context context, Arguments args) {
/* 26 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.tileEntity.hasWork()) }));
/*    */     } @Callback(doc = "function():boolean -- Get the progress of the current operation.")
/*    */     public Object[] getProgress(Context context, Arguments args) {
/* 29 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(1.0D - this.tileEntity.getProgressScaled(100) / 100.0D) }));
/*    */     } @Callback(doc = "function():boolean -- Get info on the currently present bee.")
/*    */     public Object[] getIndividualOnDisplay(Context context, Arguments args) {
/* 32 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { AlleleManager.alleleRegistry.getIndividual(this.tileEntity.getIndividualOnDisplay()) }));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\DriverAnalyzer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */