package li.cil.oc.common.item.traits;

import appeng.api.config.AccessRestriction;
import cpw.mods.fml.common.Optional.Method;
import ic2.api.item.IElectricItemManager;
import li.cil.oc.api.driver.item.Chargeable;
import li.cil.oc.common.asm.Injectable.Interface;
import li.cil.oc.common.asm.Injectable.InterfaceList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@InterfaceList({@Interface(value = "appeng.api.implementations.items.IAEItemPowerStorage", modid = "appliedenergistics2"), @Interface(value = "cofh.api.energy.IEnergyContainerItem", modid = "CoFHAPI|energy"), @Interface(value = "ic2.api.item.ISpecialElectricItem", modid = "IC2"), @Interface(value = "mekanism.api.energy.IEnergizedItem", modid = "Mekanism")})
@ScalaSignature(bytes = "\006\001\005UhaB\001\003!\003\r\ta\004\002\013\007\"\f'oZ3bE2,'BA\002\005\003\031!(/Y5ug*\021QAB\001\005SR,WN\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\r\001\001\003\007\t\003#Yi\021A\005\006\003'Q\tA\001\\1oO*\tQ#\001\003kCZ\f\027BA\f\023\005\031y%M[3diB\021\021dH\007\0025)\021Qa\007\006\0039u\ta\001\032:jm\026\024(B\001\020\t\003\r\t\007/[\005\003\003iAQ!\t\001\005\002\t\na\001J5oSR$C#A\022\021\005\021:S\"A\023\013\003\031\nQa]2bY\006L!\001K\023\003\tUs\027\016\036\005\006U\0011\taK\001\n[\006D8\t[1sO\026$\"\001L\030\021\005\021j\023B\001\030&\005\031!u.\0362mK\")\001'\013a\001c\005)1\017^1dWB\021!\007O\007\002g)\021Q\001\016\006\003kY\n\021\"\\5oK\016\024\030M\032;\013\003]\n1A\\3u\023\tI4GA\005Ji\026l7\013^1dW\")1\b\001D\001y\005Iq-\032;DQ\006\024x-\032\013\003YuBQ\001\r\036A\002EBQa\020\001\007\002\001\013\021b]3u\007\"\f'oZ3\025\007\r\n%\tC\0031}\001\007\021\007C\003D}\001\007A&\001\004b[>,h\016\036\005\006\013\002!\tAR\001\022O\026$\030)R\"veJ,g\016\036)po\026\024HC\001\027H\021\025\001D\t1\0012\021\025I\005\001\"\001K\00359W\r^!F\033\006D\bk\\<feR\021Af\023\005\006a!\003\r!\r\005\006\033\002!\tAT\001\016S:TWm\031;B\013B{w/\032:\025\0071z\005\013C\0031\031\002\007\021\007C\003R\031\002\007A&A\003wC2,X\rC\003T\001\021\005A+\001\bfqR\024\030m\031;B\013B{w/\032:\025\0071*f\013C\0031%\002\007\021\007C\003R%\002\007A\006C\003Y\001\021\005\021,\001\007hKR\004vn^3s\r2|w\017\006\002[GB\0211,Y\007\0029*\021QLX\001\007G>tg-[4\013\005yy&\"\0011\002\r\005\004\b/\0328h\023\t\021GLA\tBG\016,7o\035*fgR\024\030n\031;j_:DQ\001M,A\002EBCaV3ukB\021a-\035\b\003O>l\021\001\033\006\003\017%T!A[6\002\007\031lGN\003\002m[\006!Qn\0343t\025\005q\027aA2qo&\021\001\017[\001\t\037B$\030n\0348bY&\021!o\035\002\007\033\026$\bn\0343\013\005AD\027!B7pI&$\027%\001<\002'\005\004\b\017\\5fI\026tWM]4jgRL7m\035\032\t\013a\004A\021A=\002\025\035,G/T1oC\036,'\017F\002{\003\013\0012a_A\001\033\005a(BA\003~\025\tqbPC\001\000\003\rI7MM\005\004\003\007a(\001F%FY\026\034GO]5d\023R,W.T1oC\036,'\017C\0031o\002\007\021\007K\003xKR\fI!\t\002\002\f\005\031\021j\021\032\t\017\005=\001\001\"\001\002\022\005aq-\032;NCb\034\005.\031:hKR\031A&a\005\t\rA\ni\0011\0012\021\035\t9\002\001C\001\0033\t\001cZ3u)J\fgn\0354fe2KW.\033;\025\0071\nY\002\003\0041\003+\001\r!\r\005\b\003?\001A\021AA\021\003\0359W\r\036+jKJ$B!a\t\002*A\031A%!\n\n\007\005\035REA\002J]RDa\001MA\017\001\004\t\004bBA\027\001\021\005\021qF\001\021G\006t\007K]8wS\022,WI\\3sOf$B!!\r\0028A\031A%a\r\n\007\005UREA\004C_>dW-\0318\t\rA\nY\0031\0012\021\035\tY\004\001C\001\003{\tAbZ3u\0136\004H/_%uK6$B!a\020\002FA\031!'!\021\n\007\005\r3G\001\003Ji\026l\007B\002\031\002:\001\007\021\007C\004\002J\001!\t!a\023\002\035\035,Go\0215be\036,G-\023;f[R!\021qHA'\021\031\001\024q\ta\001c!9\021\021\013\001\005\002\005M\023!C4fi\026sWM]4z)\ra\023Q\013\005\007a\005=\003\031A\031\t\017\005e\003\001\"\001\002\\\005I1/\032;F]\026\024x-\037\013\006G\005u\023q\f\005\007a\005]\003\031A\031\t\r\r\0139\0061\001-\021\035\t\031\007\001C\001\003K\nAbZ3u\033\006DXI\\3sOf$2\001LA4\021\031\001\024\021\ra\001c!9\0211\016\001\005\002\0055\024aB2b]N+g\016\032\013\005\003c\ty\007\003\0041\003S\002\r!\r\005\b\003g\002A\021AA;\003)\031\027M\034*fG\026Lg/\032\013\005\003c\t9\b\003\0041\003c\002\r!\r\005\b\003w\002A\021AA?\003II7/T3uC\022\fG/Y*qK\016Lg-[2\025\t\005E\022q\020\005\007a\005e\004\031A\031\t\017\005\r\005\001\"\001\002\006\006qq-\032;NCb$&/\0318tM\026\024Hc\001\027\002\b\"1\001'!!A\002EBq!a#\001\t\003\ti)A\bhKR,e.\032:hsN#xN]3e)\021\t\031#a$\t\rA\nI\t1\0012\021\035\t\031\n\001C\001\003+\013!cZ3u\033\006DXI\\3sOf\034Fo\034:fIR!\0211EAL\021\031\001\024\021\023a\001c!9\0211\024\001\005\002\005u\025!\004:fG\026Lg/Z#oKJ<\027\020\006\005\002$\005}\025\021UAS\021\031\001\024\021\024a\001c!A\0211UAM\001\004\t\031#\001\006nCb\024VmY3jm\026D\001\"a*\002\032\002\007\021\021G\001\tg&lW\017\\1uK\"9\0211\026\001\005\002\0055\026!D3yiJ\f7\r^#oKJ<\027\020\006\005\002$\005=\026\021WA[\021\031\001\024\021\026a\001c!A\0211WAU\001\004\t\031#\001\006nCb,\005\020\036:bGRD\001\"a*\002*\002\007\021\021\007\025\007\001\005e\026+!4\021\t\005m\026q\031\b\005\003{\013\031-\004\002\002@*\031\021\021\031\004\002\007\005\034X.\003\003\002F\006}\026AC%oU\026\034G/\0312mK&!\021\021ZAf\0055Ie\016^3sM\006\034W\rT5ti*!\021QYA`Y!\ty-a7\002f\006-8fBAi#\006]G/\036\t\005\003w\013\031.\003\003\002V\006-'!C%oi\026\024h-Y2fC\t\tI.\001\033baB,gn\032\030ba&t\023.\0349mK6,g\016^1uS>t7OL5uK6\034h&S!F\023R,W\016U8xKJ\034Fo\034:bO\026\\\003\"!5R\003;$\030\021]\021\003\003?\fAeY8gQ:\n\007/\033\030f]\026\024x-\037\030J\013:,'oZ=D_:$\030-\0338fe&#X-\\\021\003\003G\fabQ8G\021\006\003\026\n`3oKJ<\027p\013\005\002RF\0139\017^A\005C\t\tI/A\021jGJr\023\r]5/SR,WNL%Ta\026\034\027.\0317FY\026\034GO]5d\023R,Wn\013\005\002RF\013i\017^AyC\t\ty/\001\022nK.\fg.[:n]\005\004\030NL3oKJ<\027PL%F]\026\024x-\033>fI&#X-\\\021\003\003g\f\001\"T3lC:L7/\034")
public interface Chargeable extends Chargeable {
  double maxCharge(ItemStack paramItemStack);
  
  double getCharge(ItemStack paramItemStack);
  
  void setCharge(ItemStack paramItemStack, double paramDouble);
  
  double getAECurrentPower(ItemStack paramItemStack);
  
  double getAEMaxPower(ItemStack paramItemStack);
  
  double injectAEPower(ItemStack paramItemStack, double paramDouble);
  
  double extractAEPower(ItemStack paramItemStack, double paramDouble);
  
  @Method(modid = "appliedenergistics2")
  AccessRestriction getPowerFlow(ItemStack paramItemStack);
  
  @Method(modid = "IC2")
  IElectricItemManager getManager(ItemStack paramItemStack);
  
  double getMaxCharge(ItemStack paramItemStack);
  
  double getTransferLimit(ItemStack paramItemStack);
  
  int getTier(ItemStack paramItemStack);
  
  boolean canProvideEnergy(ItemStack paramItemStack);
  
  Item getEmptyItem(ItemStack paramItemStack);
  
  Item getChargedItem(ItemStack paramItemStack);
  
  double getEnergy(ItemStack paramItemStack);
  
  void setEnergy(ItemStack paramItemStack, double paramDouble);
  
  double getMaxEnergy(ItemStack paramItemStack);
  
  boolean canSend(ItemStack paramItemStack);
  
  boolean canReceive(ItemStack paramItemStack);
  
  boolean isMetadataSpecific(ItemStack paramItemStack);
  
  double getMaxTransfer(ItemStack paramItemStack);
  
  int getEnergyStored(ItemStack paramItemStack);
  
  int getMaxEnergyStored(ItemStack paramItemStack);
  
  int receiveEnergy(ItemStack paramItemStack, int paramInt, boolean paramBoolean);
  
  int extractEnergy(ItemStack paramItemStack, int paramInt, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\Chargeable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */