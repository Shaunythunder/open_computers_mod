/*   */ package li.cil.oc.common.container;
/*   */ import net.minecraft.entity.player.InventoryPlayer;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001A2A!\001\002\001\033\t9\021\tZ1qi\026\024(BA\002\005\003%\031wN\034;bS:,'O\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020!5\t!!\003\002\022\005\t1\001\013\\1zKJD\021b\005\001\003\002\003\006I\001\006\021\002\037Ad\027-_3s\023:4XM\034;pef\004\"!\006\020\016\003YQ!a\006\r\002\rAd\027-_3s\025\tI\"$\001\004f]RLG/\037\006\0037q\t\021\"\\5oK\016\024\030M\032;\013\003u\t1A\\3u\023\tybCA\bJ]Z,g\016^8ssBc\027-_3s\023\t\031\002\003C\005#\001\t\005\t\025!\003$Q\0059\021\rZ1qi\026\024\bC\001\023(\033\005)#B\001\024\005\003)!\030\016\\3f]RLG/_\005\003\003\025J!!\013\t\002\035=$\b.\032:J]Z,g\016^8ss\")1\006\001C\001Y\0051A(\0338jiz\"2!\f\0300!\ty\001\001C\003\024U\001\007A\003C\003#U\001\0071\005")
/*   */ public class Adapter extends Player {
/*   */   public Adapter(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Adapter adapter) {
/* 7 */     super(playerInventory, (IInventory)adapter);
/* 8 */     addSlotToContainer(80, 35, Slot$.MODULE$.Upgrade(), addSlotToContainer$default$4());
/* 9 */     addPlayerInventorySlots(8, 84);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */