package li.cil.oc.common.tileentity.traits.power;

import cpw.mods.fml.common.Optional.Method;
import li.cil.oc.common.asm.Injectable.Interface;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@Interface(value = "cofh.api.energy.IEnergyHandler", modid = "CoFHAPI|energy")
@ScalaSignature(bytes = "\006\001a4q!\001\002\021\002\007\005\021C\001\007SK\022\034Ho\0348f\r2,\bP\003\002\004\t\005)\001o\\<fe*\021QAB\001\007iJ\f\027\016^:\013\005\035A\021A\003;jY\026,g\016^5us*\021\021BC\001\007G>lWn\0348\013\005-a\021AA8d\025\tia\"A\002dS2T\021aD\001\003Y&\034\001aE\002\001%m\001\"aE\r\016\003QQ!aB\013\013\005Y9\022!C7j]\026\034'/\0314u\025\005A\022a\0018fi&\021!\004\006\002\013)&dW-\0228uSRL\bC\001\017\036\033\005\021\021B\001\020\003\005\031\031u.\\7p]\")\001\005\001C\001C\0051A%\0338ji\022\"\022A\t\t\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005\n\002\005+:LG\017C\003*\001\021\005!&\001\tdC:\034uN\0348fGR,e.\032:hsR\0211F\f\t\003G1J!!\f\023\003\017\t{w\016\\3b]\")q\006\013a\001a\005!aM]8n!\t\tt'D\0013\025\t\031D'\001\003vi&d'BA\0056\025\t1t#\001\bnS:,7M]1gi\032|'oZ3\n\005a\022$A\004$pe\036,G)\033:fGRLwN\034\025\005QiJ%\n\005\002<\r:\021A\bR\007\002{)\021\021B\020\006\003\001\0131AZ7m\025\t\t%)\001\003n_\022\034(\"A\"\002\007\r\004x/\003\002F{\005Aq\n\035;j_:\fG.\003\002H\021\n1Q*\032;i_\022T!!R\037\002\0135|G-\0333\"\003-\013abQ8G\021\006\003\026\n`3oKJ<\027\020C\003N\001\021\005a*A\007sK\016,\027N^3F]\026\024x-\037\013\005\037J\033V\013\005\002$!&\021\021\013\n\002\004\023:$\b\"B\030M\001\004\001\004\"\002+M\001\004y\025AC7bqJ+7-Z5wK\")a\013\024a\001W\005A1/[7vY\006$X\r\013\003Mu%S\005\"B-\001\t\003Q\026aD4fi\026sWM]4z'R|'/\0323\025\005=[\006\"B\030Y\001\004\001\004\006\002-;\023*CQA\030\001\005\002}\013!cZ3u\033\006DXI\\3sOf\034Fo\034:fIR\021q\n\031\005\006_u\003\r\001\r\025\005;jJ%\nC\003d\001\021\005A-A\007fqR\024\030m\031;F]\026\024x-\037\013\005\037\0264\007\016C\0030E\002\007\001\007C\003hE\002\007q*\001\006nCb,\005\020\036:bGRDQA\0262A\002-BCA\031\036J\025\"2\001a[;w\023*\003\"\001\034:\017\0055\004X\"\0018\013\005=D\021aA1t[&\021\021O\\\001\013\023:TWm\031;bE2,\027BA:u\005%Ie\016^3sM\006\034WM\003\002r]\006)a/\0317vK\006\nq/\001\020d_\032Dg&\0319j]\025tWM]4z]%+e.\032:hs\"\013g\016\0327fe\002")
public interface RedstoneFlux extends Common {
  @Method(modid = "CoFHAPI|energy")
  boolean canConnectEnergy(ForgeDirection paramForgeDirection);
  
  @Method(modid = "CoFHAPI|energy")
  int receiveEnergy(ForgeDirection paramForgeDirection, int paramInt, boolean paramBoolean);
  
  @Method(modid = "CoFHAPI|energy")
  int getEnergyStored(ForgeDirection paramForgeDirection);
  
  @Method(modid = "CoFHAPI|energy")
  int getMaxEnergyStored(ForgeDirection paramForgeDirection);
  
  @Method(modid = "CoFHAPI|energy")
  int extractEnergy(ForgeDirection paramForgeDirection, int paramInt, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\RedstoneFlux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */