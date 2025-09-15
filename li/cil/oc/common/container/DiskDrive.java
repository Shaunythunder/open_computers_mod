/*   */ package li.cil.oc.common.container;
/*   */ import net.minecraft.entity.player.InventoryPlayer;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001E2A!\001\002\001\033\tIA)[:l\tJLg/\032\006\003\007\021\t\021bY8oi\006Lg.\032:\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\001\001\b\021\005=\001R\"\001\002\n\005E\021!A\002)mCf,'\017C\005\024\001\t\005\t\025!\003\025A\005y\001\017\\1zKJLeN^3oi>\024\030\020\005\002\026=5\taC\003\002\0301\0051\001\017\\1zKJT!!\007\016\002\r\025tG/\033;z\025\tYB$A\005nS:,7M]1gi*\tQ$A\002oKRL!a\b\f\003\037%sg/\0328u_JL\b\013\\1zKJL!a\005\t\t\023\t\002!\021!Q\001\n\rJ\023!\0023sSZ,\007C\001\023(\033\005)#B\001\024\033\003%IgN^3oi>\024\0300\003\002)K\tQ\021*\0238wK:$xN]=\n\005)\002\022AD8uQ\026\024\030J\034<f]R|'/\037\005\006Y\001!\t!L\001\007y%t\027\016\036 \025\0079z\003\007\005\002\020\001!)1c\013a\001)!)!e\013a\001G\001")
/*   */ public class DiskDrive extends Player {
/*   */   public DiskDrive(InventoryPlayer playerInventory, IInventory drive) {
/* 7 */     super(playerInventory, drive);
/* 8 */     addSlotToContainer(80, 35, Slot$.MODULE$.Floppy(), addSlotToContainer$default$4());
/* 9 */     addPlayerInventorySlots(8, 84);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\DiskDrive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */