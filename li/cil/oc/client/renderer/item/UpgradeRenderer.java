package li.cil.oc.client.renderer.item;

import java.util.Set;
import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.event.RobotRenderEvent;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005=r!B\001\003\021\003y\021aD+qOJ\fG-\032*f]\022,'/\032:\013\005\r!\021\001B5uK6T!!\002\004\002\021I,g\016Z3sKJT!a\002\005\002\r\rd\027.\0328u\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\020+B<'/\0313f%\026tG-\032:feN\021\021\003\006\t\003+ai\021A\006\006\002/\005)1oY1mC&\021\021D\006\002\007\003:L(+\0324\t\013m\tB\021\001\017\002\rqJg.\033;?)\005y\001\002\003\020\022\021\013\007I\021A\020\002\037\r\024\030M\032;j]\036,\006o\032:bI\026,\022\001\t\t\003C\031j\021A\t\006\003G\021\na\001Z3uC&d'BA\023\t\003\r\t\007/[\005\003O\t\022\001\"\023;f[&sgm\034\005\tSEA\t\021)Q\005A\005\0012M]1gi&tw-\0269he\006$W\r\t\005\tWEA)\031!C\001?\005\001r-\0328fe\006$xN]+qOJ\fG-\032\005\t[EA\t\021)Q\005A\005\tr-\0328fe\006$xN]+qOJ\fG-\032\021\t\021=\n\002R1A\005\002}\t\001#\0338wK:$xN]=Va\036\024\030\rZ3\t\021E\n\002\022!Q!\n\001\n\021#\0338wK:$xN]=Va\036\024\030\rZ3!\021\025\031\024\003\"\0015\003M\001(/\0324feJ,G-T8v]R\004v.\0338u)\r)Dh\022\t\003mer!!F\034\n\005a2\022A\002)sK\022,g-\003\002;w\t11\013\036:j]\036T!\001\017\f\t\013u\022\004\031\001 \002\013M$\030mY6\021\005}*U\"\001!\013\005\r\t%B\001\"D\003%i\027N\\3de\0064GOC\001E\003\rqW\r^\005\003\r\002\023\021\"\023;f[N#\030mY6\t\013!\023\004\031A%\002)\0054\030-\0337bE2,Wj\\;oiB{\027N\034;t!\rQu*N\007\002\027*\021A*T\001\005kRLGNC\001O\003\021Q\027M^1\n\005A[%aA*fi\")!+\005C\001'\006I1-\0318SK:$WM\035\013\003)^\003\"!F+\n\005Y3\"a\002\"p_2,\027M\034\005\006{E\003\rA\020\005\0063F!\tAW\001\007e\026tG-\032:\025\007msv\f\005\002\0269&\021QL\006\002\005+:LG\017C\003>1\002\007a\bC\003a1\002\007\021-\001\006n_VtG\017U8j]R\004\"A\031;\017\005\r\fhB\0013p\035\t)gN\004\002g[:\021q\r\034\b\003Q.l\021!\033\006\003U:\ta\001\020:p_Rt\024\"A\007\n\005-a\021BA\005\013\023\t)\003\"\003\002qI\005)QM^3oi&\021!o]\001\021%>\024w\016\036*f]\022,'/\022<f]RT!\001\035\023\n\005U4(AC'pk:$\bk\\5oi*\021!o\035\005\bqF\021\r\021\"\003z\003\031\021w.\0368egV\t!\020\005\002|{6\tAP\003\002M\003&\021a\020 \002\016\003bL7/\0217jO:,GM\021\"\t\017\005\005\021\003)A\005u\0069!m\\;oIN\004\003bBA\003#\021%\021qA\001\020IJ\fwoU5na2,'\t\\8dWR)1,!\003\002\f!1\001-a\001A\002\005D!\"!\004\002\004A\005\t\031AA\b\003-1'o\0348u\037\03247/\032;\021\007U\t\t\"C\002\002\024Y\021QA\0227pCRD\021\"a\006\022#\003%I!!\007\0023\021\024\030m^*j[BdWM\0217pG.$C-\0324bk2$HEM\013\003\0037QC!a\004\002\036-\022\021q\004\t\005\003C\tY#\004\002\002$)!\021QEA\024\003%)hn\0315fG.,GMC\002\002*Y\t!\"\0318o_R\fG/[8o\023\021\ti#a\t\003#Ut7\r[3dW\026$g+\031:jC:\034W\r")
public final class UpgradeRenderer {
  public static void render(ItemStack paramItemStack, RobotRenderEvent.MountPoint paramMountPoint) {
    UpgradeRenderer$.MODULE$.render(paramItemStack, paramMountPoint);
  }
  
  public static boolean canRender(ItemStack paramItemStack) {
    return UpgradeRenderer$.MODULE$.canRender(paramItemStack);
  }
  
  public static String preferredMountPoint(ItemStack paramItemStack, Set<String> paramSet) {
    return UpgradeRenderer$.MODULE$.preferredMountPoint(paramItemStack, paramSet);
  }
  
  public static ItemInfo inventoryUpgrade() {
    return UpgradeRenderer$.MODULE$.inventoryUpgrade();
  }
  
  public static ItemInfo generatorUpgrade() {
    return UpgradeRenderer$.MODULE$.generatorUpgrade();
  }
  
  public static ItemInfo craftingUpgrade() {
    return UpgradeRenderer$.MODULE$.craftingUpgrade();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\UpgradeRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */