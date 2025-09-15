package li.cil.oc;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001i:Q!\001\002\t\002%\t1b\021:fCRLg/\032+bE*\0211\001B\001\003_\016T!!\002\004\002\007\rLGNC\001\b\003\ta\027n\001\001\021\005)YQ\"\001\002\007\0131\021\001\022A\007\003\027\r\023X-\031;jm\026$\026MY\n\003\0279\001\"a\004\f\016\003AQ!!\005\n\002\027\r\024X-\031;jm\026$\030M\031\006\003'Q\t\021\"\\5oK\016\024\030M\032;\013\003U\t1A\\3u\023\t9\002C\001\007De\026\fG/\033<f)\006\0247\017C\003\032\027\021\005!$\001\004=S:LGO\020\013\002\023!AAd\003EC\002\023%Q$A\003ti\006\0347.F\001\037!\ty\"%D\001!\025\t\t##\001\003ji\026l\027BA\022!\005%IE/Z7Ti\006\0347\016\003\005&\027!\005\t\025)\003\037\003\031\031H/Y2lA!)qe\003C!Q\005qq-\032;UC\nL5m\0348Ji\026lG#A\025\021\005}Q\023BA\026!\005\021IE/Z7\t\0135ZA\021\t\030\002!\035,G/S2p]&#X-\\*uC\016\\G#\001\020\t\013AZA\021I\031\002+\035,G\017\026:b]Nd\027\r^3e)\006\024G*\0312fYR\t!\007\005\0024q5\tAG\003\0026m\005!A.\0318h\025\0059\024\001\0026bm\006L!!\017\033\003\rM#(/\0338h\001")
public final class CreativeTab {
  public static String getTranslatedTabLabel() {
    return CreativeTab$.MODULE$.func_78024_c();
  }
  
  public static ItemStack getIconItemStack() {
    return CreativeTab$.MODULE$.func_151244_d();
  }
  
  public static Item getTabIconItem() {
    return CreativeTab$.MODULE$.func_78016_d();
  }
  
  public static int getSearchbarWidth() {
    return CreativeTab$.MODULE$.getSearchbarWidth();
  }
  
  public static boolean hasSearchBar() {
    return CreativeTab$.MODULE$.hasSearchBar();
  }
  
  public static int getTabPage() {
    return CreativeTab$.MODULE$.getTabPage();
  }
  
  @SideOnly(Side.CLIENT)
  public static void addEnchantmentBooksToList(List paramList, EnumEnchantmentType[] paramArrayOfEnumEnchantmentType) {
    CreativeTab$.MODULE$.func_92116_a(paramList, paramArrayOfEnumEnchantmentType);
  }
  
  @SideOnly(Side.CLIENT)
  public static void displayAllReleventItems(List paramList) {
    CreativeTab$.MODULE$.func_78018_a(paramList);
  }
  
  @SideOnly(Side.CLIENT)
  public static boolean func_111226_a(EnumEnchantmentType paramEnumEnchantmentType) {
    return CreativeTab$.MODULE$.func_111226_a(paramEnumEnchantmentType);
  }
  
  public static CreativeTabs func_111229_a(EnumEnchantmentType[] paramArrayOfEnumEnchantmentType) {
    return CreativeTab$.MODULE$.func_111229_a(paramArrayOfEnumEnchantmentType);
  }
  
  @SideOnly(Side.CLIENT)
  public static EnumEnchantmentType[] func_111225_m() {
    return CreativeTab$.MODULE$.func_111225_m();
  }
  
  @SideOnly(Side.CLIENT)
  public static boolean isTabInFirstRow() {
    return CreativeTab$.MODULE$.func_78023_l();
  }
  
  @SideOnly(Side.CLIENT)
  public static int getTabColumn() {
    return CreativeTab$.MODULE$.func_78020_k();
  }
  
  public static CreativeTabs setNoScrollbar() {
    return CreativeTab$.MODULE$.func_78022_j();
  }
  
  @SideOnly(Side.CLIENT)
  public static boolean shouldHidePlayerInventory() {
    return CreativeTab$.MODULE$.func_78017_i();
  }
  
  public static CreativeTabs setNoTitle() {
    return CreativeTab$.MODULE$.func_78014_h();
  }
  
  @SideOnly(Side.CLIENT)
  public static boolean drawInForegroundOfTab() {
    return CreativeTab$.MODULE$.func_78019_g();
  }
  
  @SideOnly(Side.CLIENT)
  public static String getBackgroundImageName() {
    return CreativeTab$.MODULE$.func_78015_f();
  }
  
  @SideOnly(Side.CLIENT)
  public static int func_151243_f() {
    return CreativeTab$.MODULE$.func_151243_f();
  }
  
  @SideOnly(Side.CLIENT)
  public static String getTabLabel() {
    return CreativeTab$.MODULE$.func_78013_b();
  }
  
  public static CreativeTabs setBackgroundImageName(String paramString) {
    return CreativeTab$.MODULE$.func_78025_a(paramString);
  }
  
  @SideOnly(Side.CLIENT)
  public static int getTabIndex() {
    return CreativeTab$.MODULE$.func_78021_a();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\CreativeTab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */