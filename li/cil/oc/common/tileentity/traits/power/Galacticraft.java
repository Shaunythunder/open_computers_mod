package li.cil.oc.common.tileentity.traits.power;

import cpw.mods.fml.common.Optional.Method;
import li.cil.oc.common.asm.Injectable.Interface;
import li.cil.oc.common.asm.Injectable.InterfaceList;
import micdoodle8.mods.galacticraft.api.power.EnergySource;
import micdoodle8.mods.galacticraft.api.transmission.NetworkType;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@InterfaceList({@Interface(value = "micdoodle8.mods.galacticraft.api.power.IEnergyHandlerGC", modid = "Galacticraft API"), @Interface(value = "micdoodle8.mods.galacticraft.api.transmission.tile.IConnector", modid = "Galacticraft API")})
@ScalaSignature(bytes = "\006\001\005mbaB\001\003!\003\r\t!\005\002\r\017\006d\027m\031;jGJ\fg\r\036\006\003\007\021\tQ\001]8xKJT!!\002\004\002\rQ\024\030-\033;t\025\t9\001\"\001\006uS2,WM\034;jifT!!\003\006\002\r\r|W.\\8o\025\tYA\"\001\002pG*\021QBD\001\004G&d'\"A\b\002\0051L7\001A\n\004\001IY\002CA\n\032\033\005!\"BA\004\026\025\t1r#A\005nS:,7M]1gi*\t\001$A\002oKRL!A\007\013\003\025QKG.Z#oi&$\030\020\005\002\035;5\t!!\003\002\037\005\t11i\\7n_:DQ\001\t\001\005\002\005\na\001J5oSR$C#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\006S\001!YAK\001\fi>$\025N]3di&|g\016\006\002,iA\021AFM\007\002[)\021afL\001\005kRLGN\003\002\na)\021\021gF\001\017[&tWm\031:bMR4wN]4f\023\t\031TF\001\bG_J<W\rR5sK\016$\030n\0348\t\013UB\003\031\001\034\002\rM|WO]2f!\t9\024)D\0019\025\t\031\021H\003\002;w\005\031\021\r]5\013\005qj\024\001D4bY\006\034G/[2sC\032$(B\001 @\003\021iw\016Z:\013\003\001\013!\"\\5dI>|G\r\\39\023\t\021\005H\001\007F]\026\024x-_*pkJ\034W\rC\003E\001\021\005Q)A\007o_\022,\027I^1jY\006\024G.\032\013\003\r&\003\"aI$\n\005!##a\002\"p_2,\027M\034\005\006\025\016\003\rAN\001\005MJ|W\016\013\003D\031j[\006CA'X\035\tqU+D\001P\025\tI\001K\003\002R%\006\031a-\0347\013\005y\032&\"\001+\002\007\r\004x/\003\002W\037\006Aq\n\035;j_:\fG.\003\002Y3\n1Q*\032;i_\022T!AV(\002\0135|G-\0333\"\003q\013\001cR1mC\016$\030n\031:bMR\004\023\tU%\t\013y\003A\021A0\002\037I,7-Z5wK\026sWM]4z\017\016#B\001Y2eMB\0211%Y\005\003E\022\022QA\0227pCRDQAS/A\002YBQ!Z/A\002\001\fa!Y7pk:$\b\"B4^\001\0041\025\001C:j[Vd\027\r^3)\tuc%l\027\005\006U\002!\ta[\001\022O\026$XI\\3sOf\034Fo\034:fI\036\033EC\0011m\021\025Q\025\0161\0017Q\021IGJW.\t\013=\004A\021\0019\002)\035,G/T1y\013:,'oZ=Ti>\024X\rZ$D)\t\001\027\017C\003K]\002\007a\007\013\003o\031j[\006\"\002;\001\t\003)\030aD3yiJ\f7\r^#oKJ<\027pR\"\025\t\0014x\017\037\005\006\025N\004\rA\016\005\006KN\004\r\001\031\005\006ON\004\rA\022\025\005g2S6\fC\003|\001\021\005A0\001\006dC:\034uN\0348fGR$2AR?\021\025Q%\0201\001,\021\031y(\0201\001\002\002\005Ya.\032;x_J\\G+\0379f!\021\t\031!!\003\016\005\005\025!bAA\004s\005aAO]1og6L7o]5p]&!\0211BA\003\005-qU\r^<pe.$\026\020]3)\tid%l\027\025\b\001\005E\021QEA\024!\021\t\031\"a\b\017\t\005U\0211D\007\003\003/Q1!!\007\t\003\r\t7/\\\005\005\003;\t9\"\001\006J]*,7\r^1cY\026LA!!\t\002$\ti\021J\034;fe\032\f7-\032'jgRTA!!\b\002\030\005)a/\0317vK2\"\021\021FA\033W!\tY#!\n\0022i[\006\003BA\n\003[IA!a\f\002$\tI\021J\034;fe\032\f7-Z\021\003\003g\tq'\\5dI>|G\r\\39]5|Gm\035\030hC2\f7\r^5de\0064GOL1qS:\002xn^3s]%+e.\032:hs\"\013g\016\0327fe\036\0335\006CA\026\003K\t9DW.\"\005\005e\022!P7jG\022|w\016\0327fq9jw\016Z:/O\006d\027m\031;jGJ\fg\r\036\030ba&tCO]1og6L7o]5p]:\"\030\016\\3/\023\016{gN\\3di>\024\b")
public interface Galacticraft extends Common {
  @Method(modid = "Galacticraft API")
  boolean nodeAvailable(EnergySource paramEnergySource);
  
  @Method(modid = "Galacticraft API")
  float receiveEnergyGC(EnergySource paramEnergySource, float paramFloat, boolean paramBoolean);
  
  @Method(modid = "Galacticraft API")
  float getEnergyStoredGC(EnergySource paramEnergySource);
  
  @Method(modid = "Galacticraft API")
  float getMaxEnergyStoredGC(EnergySource paramEnergySource);
  
  @Method(modid = "Galacticraft API")
  float extractEnergyGC(EnergySource paramEnergySource, float paramFloat, boolean paramBoolean);
  
  @Method(modid = "Galacticraft API")
  boolean canConnect(ForgeDirection paramForgeDirection, NetworkType paramNetworkType);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Galacticraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */