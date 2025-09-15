/*    */ package li.cil.oc.common.container;
/*    */ import li.cil.oc.common.Slot$;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00193A!\001\002\001\033\t11k^5uG\"T!a\001\003\002\023\r|g\016^1j]\026\024(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005\031\001F.Y=fe\"I1\003\001B\001B\003%A\003I\001\020a2\f\0270\032:J]Z,g\016^8ssB\021QCH\007\002-)\021q\003G\001\007a2\f\0270\032:\013\005eQ\022AB3oi&$\030P\003\002\0349\005IQ.\0338fGJ\fg\r\036\006\002;\005\031a.\032;\n\005}1\"aD%om\026tGo\034:z!2\f\0270\032:\n\005M\001\002\"\003\022\001\005\003\005\013\021B\022)\003\031\031x/\033;dQB\021AeJ\007\002K)\021a\005B\001\013i&dW-\0328uSRL\030BA\001&\023\tI\003#\001\bpi\",'/\0238wK:$xN]=\t\013-\002A\021\001\027\002\rqJg.\033;?)\ricf\f\t\003\037\001AQa\005\026A\002QAQA\t\026A\002\rBQ!\r\001\005\002I\n!B]3mCf$U\r\\1z+\005\031\004C\001\0338\033\005)$\"\001\034\002\013M\034\027\r\\1\n\005a*$aA%oi\")!\b\001C\001e\005Y!/\0327bs\006kw.\0368u\021\025a\004\001\"\0013\0031i\027\r_)vKV,7+\033>f\021\025q\004\001\"\0013\003I\001\030mY6fiN\004VM]\"zG2,\027I^4\t\013\001\003A\021\001\032\002\023E,X-^3TSj,\007\"\002\"\001\t#\032\025a\0063fi\026\034GoQ;ti>lG)\031;b\007\"\fgnZ3t)\t!u\t\005\0025\013&\021a)\016\002\005+:LG\017C\003I\003\002\007\021*A\002oER\004\"A\023'\016\003-S!\001\023\016\n\0055[%A\004(C)R\013wmQ8na>,h\016\032")
/*    */ public class Switch extends Player {
/*    */   public Switch(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Switch switch) {
/*  9 */     super(playerInventory, (IInventory)switch);
/* 10 */     addSlotToContainer(151, 15, Slot$.MODULE$.CPU(), addSlotToContainer$default$4());
/* 11 */     addSlotToContainer(151, 34, Slot$.MODULE$.Memory(), addSlotToContainer$default$4());
/* 12 */     addSlotToContainer(151, 53, Slot$.MODULE$.HDD(), addSlotToContainer$default$4());
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
/* 26 */     synchronizedData().func_74768_a("relayDelay", ((li.cil.oc.common.tileentity.Switch)otherInventory()).relayDelay());
/* 27 */     synchronizedData().func_74768_a("relayAmount", ((li.cil.oc.common.tileentity.Switch)otherInventory()).relayAmount());
/* 28 */     synchronizedData().func_74768_a("maxQueueSize", ((li.cil.oc.common.tileentity.Switch)otherInventory()).maxQueueSize());
/* 29 */     synchronizedData().func_74768_a("packetsPerCycleAvg", ((li.cil.oc.common.tileentity.Switch)otherInventory()).packetsPerCycleAvg().apply());
/* 30 */     synchronizedData().func_74768_a("queueSize", ((li.cil.oc.common.tileentity.Switch)otherInventory()).queue().size());
/* 31 */     super.detectCustomDataChanges(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */