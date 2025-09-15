/*    */ package li.cil.oc.integration.ec;
/*    */ 
/*    */ import appeng.api.storage.data.IAEFluidStack;
/*    */ import extracells.api.ExtraCellsApi;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t4q!\001\002\021\002\007\005QB\001\bOKR<xN]6D_:$(o\0347\013\005\r!\021AA3d\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001U\021a\002I\n\003\001=\001\"\001E\n\016\003EQ\021AE\001\006g\016\fG.Y\005\003)E\021a!\0218z%\0264\007\"\002\f\001\t\0039\022A\002\023j]&$H\005F\001\031!\t\001\022$\003\002\033#\t!QK\\5u\021\025a\002A\"\001\036\003\021!\030\016\\3\026\003y\001\"a\b\021\r\001\021)\021\005\001b\001E\t1\021)\022+jY\026\f\"a\t\024\021\005A!\023BA\023\022\005\021qU\017\0347\023\t\035J3'\020\004\005Q\001\001aE\001\007=e\0264\027N\\3nK:$h\b\005\002+c5\t1F\003\002-[\005QA/\0337fK:$\030\016^=\013\0059z\023!C7j]\026\034'/\0314u\025\005\001\024a\0018fi&\021!g\013\002\013)&dW-\0228uSRL\bC\001\033<\033\005)$B\001\0348\003\035AW\r\0349feNT!\001O\035\002\0055,'\"\001\036\002\r\005\004\b/\0328h\023\taTG\001\bJ\017JLG\r\025:pqf\f'\r\\3\021\005y*U\"A \013\005\001\013\025\001C:fGV\024\030\016^=\013\005\t\033\025A\0038fi^|'o[5oO*\021A)O\001\004CBL\027B\001$@\005-I\025i\031;j_:Dun\035;\t\013!\003A\021A%\002#\035,GoR1tKNLeNT3uo>\0248\016F\002K\033Z\0032\001E&\020\023\ta\025CA\003BeJ\f\027\020C\003O\017\002\007q*A\004d_:$X\r\037;\021\005A#V\"A)\013\005I\033\026aB7bG\"Lg.\032\006\003\t\032I!!V)\003\017\r{g\016^3yi\")qk\022a\0011\006!\021M]4t!\t\001\026,\003\002[#\nI\021I]4v[\026tGo\035\025\005\017r{\006\r\005\002Q;&\021a,\025\002\t\007\006dGNY1dW\006\031Am\\2\"\003\005\f!IZ;oGRLwN\034\025*uQ\f'\r\\3![5\002s)\032;!C\002b\027n\035;!_\032\004C\017[3!gR|'/\0323!O\006\034Xm\035\021j]\002\"\b.\032\021oKR<xN]6/\001")
/*    */ public interface NetworkControl<AETile extends net.minecraft.tileentity.TileEntity & appeng.me.helpers.IGridProxyable & appeng.api.networking.security.IActionHost> {
/*    */   AETile tile();
/*    */   
/*    */   @Callback(doc = "function():table -- Get a list of the stored gases in the network.")
/*    */   Object[] getGasesInNetwork(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class NetworkControl$$anonfun$getGasesInNetwork$1 extends AbstractFunction1<IAEFluidStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 21 */     public final boolean apply(IAEFluidStack stack) { return ECApi.instance().isGasStack(stack); } public NetworkControl$$anonfun$getGasesInNetwork$1(NetworkControl $outer) {} } public final class NetworkControl$$anonfun$getGasesInNetwork$2 extends AbstractFunction1<IAEFluidStack, Object> implements Serializable { public final Object apply(IAEFluidStack x$1) {
/* 22 */       return this.eta$0$1$1.createGasStack(x$1);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ExtraCellsApi eta$0$1$1;
/*    */     
/*    */     public NetworkControl$$anonfun$getGasesInNetwork$2(NetworkControl $outer, ExtraCellsApi eta$0$1$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\NetworkControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */