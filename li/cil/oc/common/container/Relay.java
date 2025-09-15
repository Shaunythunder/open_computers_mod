/*    */ package li.cil.oc.common.container;
/*    */ import li.cil.oc.common.Slot$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00193A!\001\002\001\033\t)!+\0327bs*\0211\001B\001\nG>tG/Y5oKJT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\t\016\003\tI!!\005\002\003\rAc\027-_3s\021%\031\002A!A!\002\023!\002%A\bqY\006LXM]%om\026tGo\034:z!\t)b$D\001\027\025\t9\002$\001\004qY\006LXM\035\006\0033i\ta!\0328uSRL(BA\016\035\003%i\027N\\3de\0064GOC\001\036\003\rqW\r^\005\003?Y\021q\"\0238wK:$xN]=QY\006LXM]\005\003'AA\021B\t\001\003\002\003\006Ia\t\025\002\013I,G.Y=\021\005\021:S\"A\023\013\005\031\"\021A\003;jY\026,g\016^5us&\021\021!J\005\003SA\tab\034;iKJLeN^3oi>\024\030\020C\003,\001\021\005A&\001\004=S:LGO\020\013\004[9z\003CA\b\001\021\025\031\"\0061\001\025\021\025\021#\0061\001$\021\025\t\004\001\"\0013\003)\021X\r\\1z\t\026d\027-_\013\002gA\021AgN\007\002k)\ta'A\003tG\006d\027-\003\0029k\t\031\021J\034;\t\013i\002A\021\001\032\002\027I,G.Y=B[>,h\016\036\005\006y\001!\tAM\001\r[\006D\030+^3vKNK'0\032\005\006}\001!\tAM\001\023a\006\0347.\032;t!\026\0248)_2mK\0063x\rC\003A\001\021\005!'A\005rk\026,XmU5{K\")!\t\001C)\007\0069B-\032;fGR\034Uo\035;p[\022\013G/Y\"iC:<Wm\035\013\003\t\036\003\"\001N#\n\005\031+$\001B+oSRDQ\001S!A\002%\0131A\0342u!\tQE*D\001L\025\tA%$\003\002N\027\nqaJ\021+UC\036\034u.\0349pk:$\007")
/*    */ public class Relay extends Player {
/*    */   public Relay(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Relay relay) {
/*  8 */     super(playerInventory, (IInventory)relay);
/*  9 */     addSlotToContainer(151, 15, Slot$.MODULE$.CPU(), addSlotToContainer$default$4());
/* 10 */     addSlotToContainer(151, 34, Slot$.MODULE$.Memory(), addSlotToContainer$default$4());
/* 11 */     addSlotToContainer(151, 53, Slot$.MODULE$.HDD(), addSlotToContainer$default$4());
/* 12 */     addSlotToContainer(178, 15, Slot$.MODULE$.Card(), addSlotToContainer$default$4());
/* 13 */     addPlayerInventorySlots(8, 84);
/*    */   } public int relayDelay() {
/* 15 */     return synchronizedData().func_74762_e("relayDelay");
/*    */   } public int relayAmount() {
/* 17 */     return synchronizedData().func_74762_e("relayAmount");
/*    */   } public int maxQueueSize() {
/* 19 */     return synchronizedData().func_74762_e("maxQueueSize");
/*    */   } public int packetsPerCycleAvg() {
/* 21 */     return synchronizedData().func_74762_e("packetsPerCycleAvg");
/*    */   } public int queueSize() {
/* 23 */     return synchronizedData().func_74762_e("queueSize");
/*    */   }
/*    */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/* 26 */     synchronizedData().func_74768_a("relayDelay", ((li.cil.oc.common.tileentity.Relay)otherInventory()).relayDelay());
/* 27 */     synchronizedData().func_74768_a("relayAmount", ((li.cil.oc.common.tileentity.Relay)otherInventory()).relayAmount());
/* 28 */     synchronizedData().func_74768_a("maxQueueSize", ((li.cil.oc.common.tileentity.Relay)otherInventory()).maxQueueSize());
/* 29 */     synchronizedData().func_74768_a("packetsPerCycleAvg", ((li.cil.oc.common.tileentity.Relay)otherInventory()).packetsPerCycleAvg().apply());
/* 30 */     synchronizedData().func_74768_a("queueSize", ((li.cil.oc.common.tileentity.Relay)otherInventory()).queue().size());
/* 31 */     super.detectCustomDataChanges(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Relay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */