/*    */ package li.cil.oc.common.container;
/*    */ import li.cil.oc.common.Slot$;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001A2A!\001\002\001\033\t!!+Y5e\025\t\031A!A\005d_:$\030-\0338fe*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\007!2\f\0270\032:\t\023M\001!\021!Q\001\nQ\001\023a\0049mCf,'/\0238wK:$xN]=\021\005UqR\"\001\f\013\005]A\022A\0029mCf,'O\003\002\0325\0051QM\034;jifT!a\007\017\002\0235Lg.Z2sC\032$(\"A\017\002\0079,G/\003\002 -\ty\021J\034<f]R|'/\037)mCf,'/\003\002\024!!I!\005\001B\001B\003%1\005K\001\005e\006LG\r\005\002%O5\tQE\003\002'\t\005QA/\0337fK:$\030\016^=\n\005\005)\023BA\025\021\0039yG\017[3s\023:4XM\034;pefDQa\013\001\005\0021\na\001P5oSRtDcA\027/_A\021q\002\001\005\006')\002\r\001\006\005\006E)\002\ra\t")
/*    */ public class Raid extends Player {
/*    */   public Raid(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Raid raid) {
/*  8 */     super(playerInventory, (IInventory)raid);
/*  9 */     addSlotToContainer(60, 23, Slot$.MODULE$.HDD(), 2);
/* 10 */     addSlotToContainer(80, 23, Slot$.MODULE$.HDD(), 2);
/* 11 */     addSlotToContainer(100, 23, Slot$.MODULE$.HDD(), 2);
/* 12 */     addPlayerInventorySlots(8, 84);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Raid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */