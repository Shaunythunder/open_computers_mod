package li.cil.oc.common.tileentity.traits;

import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001]2q!\001\002\021\002\007\005qBA\007S_R\fG/[8o\003^\f'/\032\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003)!\030\016\\3f]RLG/\037\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\031\001\001E\r\021\005E9R\"\001\n\013\005\025\031\"B\001\013\026\003%i\027N\\3de\0064GOC\001\027\003\rqW\r^\005\0031I\021!\002V5mK\026sG/\033;z!\tQ2$D\001\003\023\tA\"\001C\003\036\001\021\005a$\001\004%S:LG\017\n\013\002?A\021\001eI\007\002C)\t!%A\003tG\006d\027-\003\002%C\t!QK\\5u\021\0251\003\001\"\001(\003\035!x\016T8dC2$\"\001K\031\021\005%zS\"\001\026\013\005-b\023\001B;uS2T!aB\027\013\0059*\022AD7j]\026\034'/\0314uM>\024x-Z\005\003a)\022aBR8sO\026$\025N]3di&|g\016C\0033K\001\007\001&A\003wC2,X\rC\0035\001\021\005Q'\001\005u_\036cwNY1m)\tAc\007C\0033g\001\007\001\006")
public interface RotationAware extends TileEntity {
  ForgeDirection toLocal(ForgeDirection paramForgeDirection);
  
  ForgeDirection toGlobal(ForgeDirection paramForgeDirection);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\RotationAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */