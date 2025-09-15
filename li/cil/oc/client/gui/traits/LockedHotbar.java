package li.cil.oc.client.gui.traits;

import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001U3q!\001\002\021\002\007\005qB\001\007M_\016\\W\r\032%pi\n\f'O\003\002\004\t\0051AO]1jiNT!!\002\004\002\007\035,\030N\003\002\b\021\00511\r\\5f]RT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\02255\t!C\003\002\024)\005I\021N\034<f]R|'/\037\006\003\013UQ!a\002\f\013\005]A\022!C7j]\026\034'/\0314u\025\005I\022a\0018fi&\0211D\005\002\r\017VL7i\0348uC&tWM\035\005\006;\001!\tAH\001\007I%t\027\016\036\023\025\003}\001\"\001I\022\016\003\005R\021AI\001\006g\016\fG.Y\005\003I\005\022A!\0268ji\")a\005\001D\001O\005YAn\\2lK\022\034F/Y2l+\005A\003CA\025-\033\005Q#BA\026\027\003\021IG/Z7\n\0055R#!C%uK6\034F/Y2l\021\025y\003\001\"\0251\003AA\027M\0343mK6{Wo]3DY&\0347\016F\003 cajt\bC\0033]\001\0071'\001\003tY>$\bC\001\0337\033\005)$BA\n\027\023\t9TG\001\003TY>$\b\"B\035/\001\004Q\024AC:m_RtU/\0342feB\021\001eO\005\003y\005\0221!\0238u\021\025qd\0061\001;\003\031\021W\017\036;p]\")\001I\fa\001u\005)1\017[5gi\")!\t\001C)\007\006y1\r[3dW\"{GOY1s\027\026L8\017\006\002E\017B\021\001%R\005\003\r\006\022qAQ8pY\026\fg\016C\003I\003\002\007!(A\004lKf\034u\016Z3\t\027)\003\001\023aA\001\002\023%1\nV\001\027gV\004XM\035\023iC:$G.Z'pkN,7\t\\5dWR)q\004\024(Q%\"9Q*SA\001\002\004\031\024a\001=%c!9q*SA\001\002\004Q\024a\001=%e!9\021+SA\001\002\004Q\024a\001=%g!91+SA\001\002\004Q\024a\001=%i%\021qF\007")
public interface LockedHotbar {
  ItemStack lockedStack();
  
  void handleMouseClick(Slot paramSlot, int paramInt1, int paramInt2, int paramInt3);
  
  boolean checkHotbarKeys(int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\LockedHotbar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */