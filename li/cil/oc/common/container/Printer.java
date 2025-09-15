/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001E3A!\001\002\001\033\t9\001K]5oi\026\024(BA\002\005\003%\031wN\034;bS:,'O\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020!5\t!!\003\002\022\005\t1\001\013\\1zKJD\021b\005\001\003\002\003\006I\001\006\021\002\037Ad\027-_3s\023:4XM\034;pef\004\"!\006\020\016\003YQ!a\006\r\002\rAd\027-_3s\025\tI\"$\001\004f]RLG/\037\006\0037q\t\021\"\\5oK\016\024\030M\032;\013\003u\t1A\\3u\023\tybCA\bJ]Z,g\016^8ssBc\027-_3s\023\t\031\002\003\003\005#\001\t\025\r\021\"\001$\003\035\001(/\0338uKJ,\022\001\n\t\003K!j\021A\n\006\003O\021\t!\002^5mK\026tG/\033;z\023\t\ta\005C\005+\001\t\005\t\025!\003%W\005A\001O]5oi\026\024\b%\003\002-!\005qq\016\0365fe&sg/\0328u_JL\b\"\002\030\001\t\003y\023A\002\037j]&$h\bF\0021cI\002\"a\004\001\t\013Mi\003\031\001\013\t\013\tj\003\031\001\023\t\013Q\002A\021A\033\002\021A\024xn\032:fgN,\022A\016\t\003oij\021\001\017\006\002s\005)1oY1mC&\0211\b\017\002\007\t>,(\r\\3\t\013u\002A\021\001 \002\035\005lw.\0368u\033\006$XM]5bYV\tq\b\005\0028\001&\021\021\t\017\002\004\023:$\b\"B\"\001\t\003q\024!C1n_VtG/\0238l\021\025)\005\001\"\025G\003]!W\r^3di\016+8\017^8n\t\006$\030m\0215b]\036,7\017\006\002H\025B\021q\007S\005\003\023b\022A!\0268ji\")1\n\022a\001\031\006\031aN\031;\021\0055{U\"\001(\013\005-S\022B\001)O\0059q%\t\026+bO\016{W\016]8v]\022\004")
/*    */ public class Printer extends Player {
/*  8 */   public li.cil.oc.common.tileentity.Printer printer() { return (li.cil.oc.common.tileentity.Printer)otherInventory(); } public Printer(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Printer printer) { super(playerInventory, (IInventory)printer);
/*  9 */     addSlotToContainer(18, 19, Slot$.MODULE$.Filtered(), addSlotToContainer$default$4());
/* 10 */     addSlotToContainer(18, 51, Slot$.MODULE$.Filtered(), addSlotToContainer$default$4());
/* 11 */     addSlotToContainer(152, 35, addSlotToContainer$default$3(), addSlotToContainer$default$4());
/*    */ 
/*    */     
/* 14 */     addPlayerInventorySlots(8, 84); }
/*    */    public double progress() {
/* 16 */     return synchronizedData().func_74769_h("progress");
/*    */   } public int amountMaterial() {
/* 18 */     return synchronizedData().func_74762_e("amountMaterial");
/*    */   } public int amountInk() {
/* 20 */     return synchronizedData().func_74762_e("amountInk");
/*    */   }
/*    */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/* 23 */     synchronizedData().func_74780_a("progress", printer().isPrinting() ? (printer().progress() / 100.0D) : 0.0D);
/* 24 */     synchronizedData().func_74768_a("amountMaterial", printer().amountMaterial());
/* 25 */     synchronizedData().func_74768_a("amountInk", printer().amountInk());
/* 26 */     super.detectCustomDataChanges(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Printer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */