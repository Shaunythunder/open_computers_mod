package li.cil.oc.server.command;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001E:Q!\001\002\t\0025\tabQ8n[\006tG\rS1oI2,'O\003\002\004\t\00591m\\7nC:$'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\035\r{W.\\1oI\"\013g\016\0327feN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\"\002\017\020\t\003i\022\001\003:fO&\034H/\032:\025\005y\t\003CA\n \023\t\001CC\001\003V]&$\b\"\002\022\034\001\004\031\023!A3\021\005\021zS\"A\023\013\005\031:\023!B3wK:$(B\001\025*\003\031\031w.\\7p]*\021!fK\001\004M6d'B\001\027.\003\021iw\016Z:\013\0039\n1a\0319x\023\t\001TE\001\fG\0332\033VM\035<feN#\030M\035;j]\036,e/\0328u\001")
public final class CommandHandler {
  public static void register(FMLServerStartingEvent paramFMLServerStartingEvent) {
    CommandHandler$.MODULE$.register(paramFMLServerStartingEvent);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\CommandHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */