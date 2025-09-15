/*    */ package li.cil.oc.common.item.data;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001-3Q!\001\002\002\002=\021\001\"\023;f[\022\013G/\031\006\003\007\021\tA\001Z1uC*\021QAB\001\005SR,WN\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\r\001\001\003\007\t\003#Yi\021A\005\006\003'Q\tA\001\\1oO*\tQ#\001\003kCZ\f\027BA\f\023\005\031y%M[3diB\021\021\004H\007\0025)\0211\004C\001\004CBL\027BA\017\033\005-\001VM]:jgR\f'\r\\3\t\021}\001!Q1A\005\002\001\n\001\"\033;f[:\013W.Z\013\002CA\021!\005\013\b\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005J\001\007!J,G-\0324\n\005%R#AB*ue&twM\003\002(I!AA\006\001B\001B\003%\021%A\005ji\026lg*Y7fA!)a\006\001C\001_\0051A(\0338jiz\"\"\001\r\032\021\005E\002Q\"\001\002\t\013}i\003\031A\021\t\013Q\002A\021A\033\002\t1|\027\r\032\013\003me\002\"aI\034\n\005a\"#\001B+oSRDQAO\032A\002m\nQa\035;bG.\004\"\001\020\"\016\003uR!!\002 \013\005}\002\025!C7j]\026\034'/\0314u\025\005\t\025a\0018fi&\0211)\020\002\n\023R,Wn\025;bG.DQ!\022\001\005\002\031\013Aa]1wKR\021ag\022\005\006u\021\003\ra\017\005\006\023\002!\tAS\001\020GJ,\027\r^3Ji\026l7\013^1dWR\t1\b")
/*    */ public abstract class ItemData implements Persistable {
/*    */   public String itemName() {
/*  8 */     return this.itemName;
/*    */   } private final String itemName; public ItemData(String itemName) {} public void load(ItemStack stack) {
/* 10 */     if (stack.func_77942_o())
/*    */     {
/*    */       
/* 13 */       load((NBTTagCompound)stack.func_77978_p().func_74737_b());
/*    */     }
/*    */   }
/*    */   
/*    */   public void save(ItemStack stack) {
/* 18 */     if (!stack.func_77942_o()) {
/* 19 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 21 */     save(stack.func_77978_p());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ItemStack createItemStack() {
/* 27 */     ItemStack stack = Items.get(itemName()).createItemStack(1);
/* 28 */     save(stack);
/* 29 */     return (itemName() == null) ? null : stack;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\ItemData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */