/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%3A!\001\002\001\033\taA)[:bgN,WN\0317fe*\0211\001B\001\nG>tG/Y5oKJT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\t\016\003\tI!!\005\002\003\rAc\027-_3s\021%\031\002A!A!\002\023!\002%A\bqY\006LXM]%om\026tGo\034:z!\t)b$D\001\027\025\t9\002$\001\004qY\006LXM\035\006\0033i\ta!\0328uSRL(BA\016\035\003%i\027N\\3de\0064GOC\001\036\003\rqW\r^\005\003?Y\021q\"\0238wK:$xN]=QY\006LXM]\005\003'AA\001B\t\001\003\006\004%\taI\001\rI&\034\030m]:f[\ndWM]\013\002IA\021Q\005K\007\002M)\021q\005B\001\013i&dW-\0328uSRL\030BA\001'\021%Q\003A!A!\002\023!3&A\007eSN\f7o]3nE2,'\017I\005\003YA\tab\034;iKJLeN^3oi>\024\030\020C\003/\001\021\005q&\001\004=S:LGO\020\013\004aE\022\004CA\b\001\021\025\031R\0061\001\025\021\025\021S\0061\001%\021\025!\004\001\"\0016\003M!\027n]1tg\026l'\r\\=Qe><'/Z:t+\0051\004CA\034;\033\005A$\"A\035\002\013M\034\027\r\\1\n\005mB$A\002#pk\ndW\rC\003>\001\021Ec(A\feKR,7\r^\"vgR|W\016R1uC\016C\027M\\4fgR\021qH\021\t\003o\001K!!\021\035\003\tUs\027\016\036\005\006\007r\002\r\001R\001\004]\n$\bCA#H\033\0051%BA\"\033\023\tAeI\001\bO\005R#\026mZ\"p[B|WO\0343")
/*    */ public class Disassembler extends Player {
/*  7 */   public li.cil.oc.common.tileentity.Disassembler disassembler() { return (li.cil.oc.common.tileentity.Disassembler)otherInventory(); } public Disassembler(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Disassembler disassembler) { super(playerInventory, (IInventory)disassembler);
/*  8 */     addSlotToContainer(80, 35, "ocitem", addSlotToContainer$default$4());
/*  9 */     addPlayerInventorySlots(8, 84); }
/*    */    public double disassemblyProgress() {
/* 11 */     return synchronizedData().func_74769_h("disassemblyProgress");
/*    */   }
/*    */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/* 14 */     synchronizedData().func_74780_a("disassemblyProgress", disassembler().progress());
/* 15 */     super.detectCustomDataChanges(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Disassembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */