package li.cil.oc.common.item.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import li.cil.oc.common.item.Delegator;
import li.cil.oc.util.BlockPosition;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import scala.Option;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\t%gaB\001\003!\003\r\ta\004\002\t\t\026dWmZ1uK*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021\001B5uK6T!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\001\t\003A\022A\002\023j]&$H\005F\001\032!\t\t\"$\003\002\034%\t!QK\\5u\013\021i\002\001\001\020\003\t%\033wN\034\t\003?\031j\021\001\t\006\003C\t\nA!\036;jY*\0211\005J\001\n[&tWm\031:bMRT\021!J\001\004]\026$\030BA\024!\005\025I\025jY8o\013\021I\003\001\001\026\003\031%\033wN\034*fO&\034H/\032:\021\005-\022T\"\001\027\013\0055r\023a\002;fqR,(/\032\006\003_A\n\001B]3oI\026\024XM\035\006\003c\t\naa\0317jK:$\030BA\032-\0055I\025jY8o%\026<\027n\035;fe\")Q\007\001D\001m\0051\001/\031:f]R,\022a\016\t\003qej\021\001B\005\003u\021\021\021\002R3mK\036\fGo\034:\t\013q\002A\021A\037\002\037UtGn\\2bY&TX\r\032(b[\026,\022A\020\t\003\021k\021\001\021\006\003\003\n\013A\001\\1oO*\t1)\001\003kCZ\f\027BA#A\005\031\031FO]5oO\")q\t\001C\t\021\006YAo\\8mi&\004h*Y7f+\005I\005cA\tK}%\0211J\005\002\007\037B$\030n\0348\t\0135\003A\021\003(\002\027Q|w\016\034;ja\022\013G/Y\013\002\037B\031\001kU+\016\003ES!A\025\n\002\025\r|G\016\\3di&|g.\003\002U#\n\0311+Z9\021\005E1\026BA,\023\005\r\te.\037\005\b3\002\001\r\021\"\001[\0039\031\bn\\<J]&#X-\034'jgR,\022a\027\t\003#qK!!\030\n\003\017\t{w\016\\3b]\"9q\f\001a\001\n\003\001\027AE:i_^Le.\023;f[2K7\017^0%KF$\"!G1\t\017\tt\026\021!a\0017\006\031\001\020J\031\t\r\021\004\001\025)\003\\\003=\031\bn\\<J]&#X-\034'jgR\004\003b\0024\001\005\004%\taZ\001\007SR,W.\0233\026\003!\004\"!E5\n\005)\024\"aA%oi\"1A\016\001Q\001\n!\fq!\033;f[&#\007\005C\004o\001\001\007I\021B8\002\013}K7m\0348\026\003A\0042!\005&r!\t\021H$D\001\001\021\035!\b\0011A\005\nU\f\021bX5d_:|F%Z9\025\005e1\bb\0022t\003\003\005\r\001\035\005\007q\002\001\013\025\0029\002\r}K7m\0348!\021\025Q\b\001\"\001h\0031i\027\r_*uC\016\\7+\033>f\021\025a\b\001\"\001~\003=\031'/Z1uK&#X-\\*uC\016\\Gc\001@\002\bA\031q0a\001\016\005\005\005!BA\003#\023\021\t)!!\001\003\023%#X-\\*uC\016\\\007\002CA\005wB\005\t\031\0015\002\r\005lw.\0368u\021\035\ti\001\001C\001\003\037\t!\003Z8fgNsW-Y6CsB\f7o]+tKR)1,!\005\002 !A\0211CA\006\001\004\t)\"\001\005q_NLG/[8o!\021\t9\"a\007\016\005\005e!BA\021\t\023\021\ti\"!\007\003\033\tcwnY6Q_NLG/[8o\021!\t\t#a\003A\002\005\r\022A\0029mCf,'\017\005\003\002&\0055RBAA\024\025\021\t\t#!\013\013\007\005-\"%\001\004f]RLG/_\005\005\003_\t9C\001\007F]RLG/\037)mCf,'\017C\004\0024\001!\t!!\016\002\035=t\027\n^3n+N,g)\033:tiRy1,a\016\002<\005u\022qHA\"\003\033\n\t\006C\004\002:\005E\002\031\001@\002\013M$\030mY6\t\021\005\005\022\021\007a\001\003GA\001\"a\005\0022\001\007\021Q\003\005\b\003\003\n\t\0041\001i\003\021\031\030\016Z3\t\021\005\025\023\021\007a\001\003\017\nA\001[5u1B\031\021#!\023\n\007\005-#CA\003GY>\fG\017\003\005\002P\005E\002\031AA$\003\021A\027\016^-\t\021\005M\023\021\007a\001\003\017\nA\001[5u5\"9\021q\013\001\005\002\005e\023!C8o\023R,W.V:f)=Y\0261LA/\003?\n\t'a\031\002f\005\035\004bBA\035\003+\002\rA \005\t\003C\t)\0061\001\002$!A\0211CA+\001\004\t)\002C\004\002B\005U\003\031\0015\t\021\005\025\023Q\013a\001\003\017B\001\"a\024\002V\001\007\021q\t\005\t\003'\n)\0061\001\002H!9\0211\016\001\005\002\0055\024\001E8o\023R,WNU5hQR\034E.[2l)\035q\030qNA9\003Bq!!\017\002j\001\007a\020\003\005\002t\005%\004\031AA;\003\0259xN\0357e!\021\t9(a\037\016\005\005e$bAA:E%!\021QPA=\005\0259vN\0357e\021!\t\t#!\033A\002\005\r\002bBAB\001\021\005\021QQ\001\021O\026$\030\n^3n+N,\027i\031;j_:$B!a\"\002\016B\031q0!#\n\t\005-\025\021\001\002\013\013:,X.Q2uS>t\007bBA\035\003\003\003\rA \005\b\003#\003A\021AAJ\003U9W\r^'bq&#X-\\+tK\022+(/\031;j_:$2\001[AK\021\035\tI$a$A\002yDq!!'\001\t\003\tY*A\004p]\026\013G/\0328\025\017y\fi*a(\002\"\"9\021\021HAL\001\004q\b\002CA:\003/\003\r!!\036\t\021\005\005\022q\023a\001\003GAq!!*\001\t\003\t9+\001\013p]Bc\027-_3s'R|\007\017]3e+NLgn\032\013\b3\005%\0261VAW\021\035\tI$a)A\002yD\001\"!\t\002$\002\007\0211\005\005\b\003_\013\031\0131\001i\003!!WO]1uS>t\007bBAZ\001\021\005\021QW\001\007kB$\027\r^3\025\027e\t9,!/\002<\006\025\027\021\032\005\b\003s\t\t\f1\001\021!\t\031(!-A\002\005U\004\002CA\021\003c\003\r!!0\021\t\005}\026\021Y\007\003\003SIA!a1\002*\t1QI\034;jifDq!a2\0022\002\007\001.\001\003tY>$\bbBAf\003c\003\raW\001\tg\026dWm\031;fI\"9\021q\032\001\005\002\005E\027A\002:be&$\030\020\006\003\002T\006e\007cA@\002V&!\021q[A\001\005))e.^7SCJLG/\037\005\b\003s\ti\r1\001\021\035\ti\016\001C\t\003?\fa\002^5fe\032\023x.\034#sSZ,'\017F\002i\003CDq!!\017\002\\\002\007a\020C\004\002f\002!\t!a:\002\013\r|Gn\034:\025\013!\fI/a;\t\017\005e\0221\035a\001}\"9\021Q^Ar\001\004A\027\001\0029bgNDq!!=\001\t\003\t\0310\001\thKR\034uN\034;bS:,'/\023;f[R\031a0!>\t\017\005e\022q\036a\001}\"9\021\021 \001\005\002\005m\030\001\0055bg\016{g\016^1j]\026\024\030\n^3n)\rY\026Q \005\b\003s\t9\0201\001\021\035\021\t\001\001C\001\005\007\t1\002Z5ta2\f\027PT1nKR!!Q\001B\n!\021\t\"Ja\002\021\t\t%!q\002\b\004#\t-\021b\001B\007%\0051\001K]3eK\032L1!\022B\t\025\r\021iA\005\005\b\003s\ty\0201\001\021\035\0219\002\001C\001\0053\tA\002^8pYRL\007\017T5oKN$\022\"\007B\016\005;\021yB!\f\t\017\005e\"Q\003a\001}\"A\021\021\005B\013\001\004\t\031\003\003\005\003\"\tU\001\031\001B\022\003\035!xn\0347uSB\004bA!\n\003*\t\035QB\001B\024\025\t\t#)\003\003\003,\t\035\"\001\002'jgRDqAa\f\003\026\001\0071,\001\005bIZ\fgnY3eQ!\021)Ba\r\003L\t5\003\003\002B\033\005\017j!Aa\016\013\t\te\"1H\001\013e\026d\027-\0368dQ\026\024(\002\002B\037\005\t1AZ7m\025\021\021\tEa\021\002\t5|Gm\035\006\003\005\013\n1a\0319x\023\021\021IEa\016\003\021MKG-Z(oYf\fQA^1mk\026$#Aa\024\n\t\tE#1K\001\007\0072KUI\024+\013\t\tU#qG\001\005'&$W\rC\004\003Z\001!\tBa\027\002\037Q|w\016\034;ja\026CH/\0328eK\022$R!\007B/\005?Bq!!\017\003X\001\007a\020\003\005\003\"\t]\003\031\001B\022\021\035\021\031\007\001C\t\005K\nA\002^8pYRL\007oQ8tiN$R!\007B4\005SBq!!\017\003b\001\007a\020\003\005\003\"\t\005\004\031\001B\022\021\031\021i\007\001C\0015\006a\021n\035#b[\006<W-\0312mK\"9!\021\017\001\005\002\tM\024A\0023b[\006<W\rF\002i\005kBq!!\017\003p\001\007a\020C\004\003z\001!\tAa\037\002\0235\f\007\020R1nC\036,Gc\0015\003~!9\021\021\bB<\001\004q\bB\002BA\001\021\005q.\001\003jG>t\007\006\003B@\005g\021YE!\024\t\017\t\035\005\001\"\005\003\n\006A\021nY8o?\022*\027\017F\002\032\005\027CqAa\023\003\006\002\007\021\017\013\005\003\006\nM\"1\nB'\021\035\021\t\t\001C\001\005##R\001\035BJ\005+Cq!!\017\003\020\002\007a\020C\004\002n\n=\005\031\0015)\021\t=%1\007B&\005\033BqAa'\001\t\003\021i*A\007sK\036L7\017^3s\023\016|gn\035\013\0043\t}\005\002\003BQ\0053\003\rAa)\002\031%\034wN\034*fO&\034H/\032:\021\005ID\003\006\003BM\005g\021YE!\024\t\017\t%\006\001\"\001\003,\0061Q-];bYN$2a\027BW\021\035\tIDa*A\002yD\021B!-\001#\003%\tAa-\0023\r\024X-\031;f\023R,Wn\025;bG.$C-\0324bk2$H%M\013\003\005kS3\001\033B\\W\t\021I\f\005\003\003<\n\025WB\001B_\025\021\021yL!1\002\023Ut7\r[3dW\026$'b\001Bb%\005Q\021M\0348pi\006$\030n\0348\n\t\t\035'Q\030\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007")
public interface Delegate {
  void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int paramInt);
  
  Delegator parent();
  
  String unlocalizedName();
  
  Option<String> tooltipName();
  
  Seq<Object> tooltipData();
  
  boolean showInItemList();
  
  @TraitSetter
  void showInItemList_$eq(boolean paramBoolean);
  
  int itemId();
  
  Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon();
  
  @TraitSetter
  void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> paramOption);
  
  int maxStackSize();
  
  ItemStack createItemStack(int paramInt);
  
  int createItemStack$default$1();
  
  boolean doesSneakBypassUse(BlockPosition paramBlockPosition, EntityPlayer paramEntityPlayer);
  
  boolean onItemUseFirst(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, BlockPosition paramBlockPosition, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
  
  boolean onItemUse(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, BlockPosition paramBlockPosition, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
  
  ItemStack onItemRightClick(ItemStack paramItemStack, World paramWorld, EntityPlayer paramEntityPlayer);
  
  EnumAction getItemUseAction(ItemStack paramItemStack);
  
  int getMaxItemUseDuration(ItemStack paramItemStack);
  
  ItemStack onEaten(ItemStack paramItemStack, World paramWorld, EntityPlayer paramEntityPlayer);
  
  void onPlayerStoppedUsing(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, int paramInt);
  
  void update(ItemStack paramItemStack, World paramWorld, Entity paramEntity, int paramInt, boolean paramBoolean);
  
  EnumRarity rarity(ItemStack paramItemStack);
  
  int tierFromDriver(ItemStack paramItemStack);
  
  int color(ItemStack paramItemStack, int paramInt);
  
  ItemStack getContainerItem(ItemStack paramItemStack);
  
  boolean hasContainerItem(ItemStack paramItemStack);
  
  Option<String> displayName(ItemStack paramItemStack);
  
  @SideOnly(Side.CLIENT)
  void tooltipLines(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, List<String> paramList, boolean paramBoolean);
  
  void tooltipExtended(ItemStack paramItemStack, List<String> paramList);
  
  void tooltipCosts(ItemStack paramItemStack, List<String> paramList);
  
  boolean isDamageable();
  
  int damage(ItemStack paramItemStack);
  
  int maxDamage(ItemStack paramItemStack);
  
  @SideOnly(Side.CLIENT)
  Option<IIcon> icon();
  
  @SideOnly(Side.CLIENT)
  void icon_$eq(IIcon paramIIcon);
  
  @SideOnly(Side.CLIENT)
  Option<IIcon> icon(ItemStack paramItemStack, int paramInt);
  
  @SideOnly(Side.CLIENT)
  void registerIcons(IIconRegister paramIIconRegister);
  
  boolean equals(ItemStack paramItemStack);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\Delegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */