package li.cil.oc.integration.fmp;

import codechicken.lib.vec.BlockCoord;
import codechicken.multipart.TMultiPart;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\001<Q!\001\002\t\0025\t!#T;mi&\004\030M\035;D_:4XM\035;fe*\0211\001B\001\004M6\004(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\nNk2$\030\016]1si\016{gN^3si\026\0248cA\b\0231A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032\004\"!G\024\017\005i!cBA\016\"\035\tar$D\001\036\025\tqB\"\001\004=e>|GOP\005\002A\005Y1m\0343fG\"L7m[3o\023\t\0213%A\005nk2$\030\016]1si*\t\001%\003\002&M\005\tR*\0367uSB\013'\017\036*fO&\034HO]=\013\005\t\032\023B\001\025*\0059I\005+\031:u\007>tg/\032:uKJT!!\n\024\t\013-zA\021\001\027\002\rqJg.\033;?)\005i\001\"\002\030\020\t\003y\023\001B5oSR$\022\001\r\t\003'EJ!A\r\013\003\tUs\027\016\036\005\006i=!\t%N\001\013E2|7m\033+za\026\034X#\001\034\021\007]bd(D\0019\025\tI$(\001\003vi&d'\"A\036\002\t)\fg/Y\005\003{a\022A\001T5tiB\021qHR\007\002\001*\021\021IQ\001\006E2|7m\033\006\003\007\022\013\021\"\\5oK\016\024\030M\032;\013\003\025\0131A\\3u\023\t9\005IA\003CY>\0347\016C\003J\037\021\005#*A\004d_:4XM\035;\025\007-{e\013\005\002M\0336\ta%\003\002OM\tQA+T;mi&\004\026M\035;\t\013AC\005\031A)\002\013]|'\017\0343\021\005I#V\"A*\013\005A\023\025BA+T\005\0259vN\0357e\021\0259\006\n1\001Y\003\r\001xn\035\t\0033zk\021A\027\006\0037r\0131A^3d\025\ti6%A\002mS\nL!a\030.\003\025\tcwnY6D_>\024H\r")
public final class MultipartConverter {
  public static TMultiPart convert(World paramWorld, BlockCoord paramBlockCoord) {
    return MultipartConverter$.MODULE$.convert(paramWorld, paramBlockCoord);
  }
  
  public static List<Block> blockTypes() {
    return MultipartConverter$.MODULE$.blockTypes();
  }
  
  public static void init() {
    MultipartConverter$.MODULE$.init();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\MultipartConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */