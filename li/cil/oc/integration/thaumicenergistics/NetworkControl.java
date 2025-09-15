/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ 
/*    */ import appeng.api.storage.data.IAEFluidStack;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t4q!\001\002\021\002\007\005QB\001\bOKR<xN]6D_:$(o\0347\013\005\r!\021A\005;iCVl\027nY3oKJ<\027n\035;jGNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001QC\001\b!'\t\001q\002\005\002\021'5\t\021CC\001\023\003\025\0318-\0317b\023\t!\022C\001\004B]f\024VM\032\005\006-\001!\taF\001\007I%t\027\016\036\023\025\003a\001\"\001E\r\n\005i\t\"\001B+oSRDQ\001\b\001\007\002u\tA\001^5mKV\ta\004\005\002 A1\001A!B\021\001\005\004\021#AB!F)&dW-\005\002$MA\021\001\003J\005\003KE\021AAT;mYJ!q%K\032>\r\021A\003\001\001\024\003\031q\022XMZ5oK6,g\016\036 \021\005)\nT\"A\026\013\0051j\023A\003;jY\026,g\016^5us*\021afL\001\n[&tWm\031:bMRT\021\001M\001\004]\026$\030B\001\032,\005)!\026\016\\3F]RLG/\037\t\003imj\021!\016\006\003m]\nq\001[3ma\026\0248O\003\0029s\005\021Q.\032\006\002u\0051\021\r\0359f]\036L!\001P\033\003\035%;%/\0333Qe>D\0300\0312mKB\021a(R\007\002)\021\001)Q\001\tg\026\034WO]5us*\021!iQ\001\013]\026$xo\034:lS:<'B\001#:\003\r\t\007/[\005\003\r~\0221\"S!di&|g\016S8ti\")\001\n\001C\001\023\006!r-\032;FgN,g\016^5b\023:tU\r^<pe.$2AS'W!\r\0012jD\005\003\031F\021Q!\021:sCfDQAT$A\002=\013qaY8oi\026DH\017\005\002Q)6\t\021K\003\002S'\0069Q.Y2iS:,'B\001#\007\023\t)\026KA\004D_:$X\r\037;\t\013];\005\031\001-\002\t\005\024xm\035\t\003!fK!AW)\003\023\005\023x-^7f]R\034\b\006B$]?\002\004\"\001U/\n\005y\013&\001C\"bY2\024\027mY6\002\007\021|7-I\001b\003\0253WO\\2uS>t\007&\013\036uC\ndW\rI\027.A\035+G\017I1!Y&\034H\017I8gAQDW\rI:u_J,G\rI3tg\026tG/[1!S:\004C\017[3!]\026$xo\034:l]\001")
/*    */ public interface NetworkControl<AETile extends net.minecraft.tileentity.TileEntity & appeng.me.helpers.IGridProxyable & appeng.api.networking.security.IActionHost> {
/*    */   AETile tile();
/*    */   
/*    */   @Callback(doc = "function():table -- Get a list of the stored essentia in the network.")
/*    */   Object[] getEssentiaInNetwork(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class NetworkControl$$anonfun$getEssentiaInNetwork$1 extends AbstractFunction1<IAEFluidStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 21 */     public final boolean apply(IAEFluidStack stack) { return (stack.getFluid() != null && stack.getFluid() instanceof thaumicenergistics.api.IThEEssentiaGas); } public NetworkControl$$anonfun$getEssentiaInNetwork$1(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getEssentiaInNetwork$2 extends AbstractFunction1<IAEFluidStack, FluidStack> implements Serializable { public final FluidStack apply(IAEFluidStack fluid) {
/* 22 */       return ThaumicEnergisticsUtils$.MODULE$.getAspect(fluid);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public NetworkControl$$anonfun$getEssentiaInNetwork$2(NetworkControl $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\NetworkControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */