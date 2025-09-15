package li.cil.oc.common.tileentity.traits.power;

import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001-2q!\001\002\021\002\007\005\021C\001\fJ]\022,8\017\036:jC2\034%/\0314ue\r{W.\\8o\025\t\031A!A\003q_^,'O\003\002\006\r\0051AO]1jiNT!a\002\005\002\025QLG.Z3oi&$\030P\003\002\n\025\00511m\\7n_:T!a\003\007\002\005=\034'BA\007\017\003\r\031\027\016\034\006\002\037\005\021A.[\002\001'\t\001!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063\001!\tAG\001\007I%t\027\016\036\023\025\003m\001\"a\005\017\n\005u!\"\001B+oSRDqa\b\001A\002\023\005\001%A\nbI\022,G\rV8J\007J\002vn^3s\017JLG-F\001\"!\t\031\"%\003\002$)\t9!i\\8mK\006t\007bB\023\001\001\004%\tAJ\001\030C\022$W\r\032+p\023\016\023\004k\\<fe\036\023\030\016Z0%KF$\"aG\024\t\017!\"\023\021!a\001C\005\031\001\020J\031\t\r)\002\001\025)\003\"\003Q\tG\rZ3e)>L5I\r)po\026\024xI]5eA\001")
public interface IndustrialCraft2Common {
  boolean addedToIC2PowerGrid();
  
  @TraitSetter
  void addedToIC2PowerGrid_$eq(boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\IndustrialCraft2Common.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */