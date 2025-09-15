package li.cil.oc.common.component;

import li.cil.oc.api.internal.TextBuffer;
import net.minecraft.nbt.NBTTagCompound;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005<Q!\001\002\t\0025\t!d\0217jK:$x\t];UKb$()\0364gKJD\025M\0343mKJT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\0035\rc\027.\0328u\017B,H+\032=u\005V4g-\032:IC:$G.\032:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!)Ad\004C\001;\0051!-\033;cYR$\"BH\021,aI\"dgP!D!\t\031r$\003\002!)\t!QK\\5u\021\025\0213\0041\001$\003\r!7\017\036\t\003I%j\021!\n\006\003M\035\n\001\"\0338uKJt\027\r\034\006\003Q\031\t1!\0319j\023\tQSE\001\006UKb$()\0364gKJDQ\001L\016A\0025\n1aY8m!\t\031b&\003\0020)\t\031\021J\034;\t\013EZ\002\031A\027\002\007I|w\017C\00347\001\007Q&A\001x\021\025)4\0041\001.\003\005A\007\"B\034\034\001\004A\024!B8x]\026\024\bCA\035=\035\t\031\"(\003\002<)\0051\001K]3eK\032L!!\020 \003\rM#(/\0338h\025\tYD\003C\003A7\001\007Q&A\003te\016LE\rC\003C7\001\007Q&A\004ge>l7i\0347\t\013\021[\002\031A\027\002\017\031\024x.\034*po\")ai\004C\001\017\006a!/Z7pm\026\024UO\0324feR!\001jS'O!\t\031\022*\003\002K)\t9!i\\8mK\006t\007\"\002'F\001\004\031\023A\0022vM\032,'\017C\0038\013\002\007\001\bC\003P\013\002\007Q&\001\002jI\")\021k\004C\001%\006QAn\\1e\005V4g-\032:\025\013!\033F+\026,\t\0131\003\006\031A\022\t\013]\002\006\031\001\035\t\013=\003\006\031A\027\t\013]\003\006\031\001-\002\0079\024G\017\005\002Z?6\t!L\003\002X7*\021A,X\001\n[&tWm\031:bMRT\021AX\001\004]\026$\030B\0011[\0059q%\t\026+bO\016{W\016]8v]\022\004")
public final class ClientGpuTextBufferHandler {
  public static boolean loadBuffer(TextBuffer paramTextBuffer, String paramString, int paramInt, NBTTagCompound paramNBTTagCompound) {
    return ClientGpuTextBufferHandler$.MODULE$.loadBuffer(paramTextBuffer, paramString, paramInt, paramNBTTagCompound);
  }
  
  public static boolean removeBuffer(TextBuffer paramTextBuffer, String paramString, int paramInt) {
    return ClientGpuTextBufferHandler$.MODULE$.removeBuffer(paramTextBuffer, paramString, paramInt);
  }
  
  public static void bitblt(TextBuffer paramTextBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, int paramInt6, int paramInt7) {
    ClientGpuTextBufferHandler$.MODULE$.bitblt(paramTextBuffer, paramInt1, paramInt2, paramInt3, paramInt4, paramString, paramInt5, paramInt6, paramInt7);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\ClientGpuTextBufferHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */