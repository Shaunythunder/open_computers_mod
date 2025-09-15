package li.cil.oc.integration.computercraft;

import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.world.World;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0015;Q!\001\002\t\0025\t!\003U3sSBDWM]1m!J|g/\0333fe*\0211\001B\001\016G>l\007/\036;fe\016\024\030M\032;\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005I\001VM]5qQ\026\024\030\r\034)s_ZLG-\032:\024\007=\021\"\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tY2%D\001\035\025\tib$\001\006qKJL\007\017[3sC2T!a\b\021\002\007\005\004\030N\003\002\004C)\t!%\001\004eC:\024\004\007M\005\003Iq\0211#\023)fe&\004\b.\032:bYB\023xN^5eKJDQAJ\b\005\002\035\na\001P5oSRtD#A\007\t\013%zA\021\001\026\002\t%t\027\016\036\013\002WA\021AfL\007\002[)\ta&A\003tG\006d\027-\003\0021[\t!QK\\5u\021\025\021t\002\"\0214\00359W\r\036)fe&\004\b.\032:bYR1Ag\016\"H\023.\003\"aG\033\n\005Yb\"aC%QKJL\007\017[3sC2DQ\001O\031A\002e\nQa^8sY\022\004\"A\017!\016\003mR!\001\017\037\013\005ur\024!C7j]\026\034'/\0314u\025\005y\024a\0018fi&\021\021i\017\002\006/>\024H\016\032\005\006\007F\002\r\001R\001\002qB\021A&R\005\003\r6\0221!\0238u\021\025A\025\0071\001E\003\005I\b\"\002&2\001\004!\025!\001>\t\0131\013\004\031\001#\002\tMLG-\032")
public final class PeripheralProvider {
  public static IPeripheral getPeripheral(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return PeripheralProvider$.MODULE$.getPeripheral(paramWorld, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void init() {
    PeripheralProvider$.MODULE$.init();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\PeripheralProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */