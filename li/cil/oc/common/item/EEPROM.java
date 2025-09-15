/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.SimpleItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001M3A!\001\002\001\033\t1Q)\022)S\0376S!a\001\003\002\t%$X-\034\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001AD\f\021\005=)R\"\001\t\013\005\r\t\"B\001\n\024\003%i\027N\\3de\0064GOC\001\025\003\rqW\r^\005\003-A\021A!\023;f[B\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005qI\"AC*j[BdW-\023;f[\")a\004\001C\001?\0051A(\0338jiz\"\022\001\t\t\003C\001i\021A\001\005\006G\001!\t\005J\001\023I>,7o\0258fC.\024\025\020]1tgV\033X\r\006\004&WI:\024h\017\t\003M%j\021a\n\006\002Q\005)1oY1mC&\021!f\n\002\b\005>|G.Z1o\021\025a#\0051\001.\003\0259xN\0357e!\tq\003'D\0010\025\ta\023#\003\0022_\t)qk\034:mI\")1G\ta\001i\005\t\001\020\005\002'k%\021ag\n\002\004\023:$\b\"\002\035#\001\004!\024!A=\t\013i\022\003\031\001\033\002\003iDQ\001\020\022A\002u\na\001\0357bs\026\024\bC\001 C\033\005y$B\001\037A\025\t\t\025#\001\004f]RLG/_\005\003\007~\022A\"\0228uSRL\b\013\\1zKJDQ!\022\001\005B\031\013qcZ3u\023R,Wn\025;bG.$\025n\0359mCft\025-\\3\025\005\035s\005C\001%L\035\t1\023*\003\002KO\0051\001K]3eK\032L!\001T'\003\rM#(/\0338h\025\tQu\005C\003P\t\002\007\001+A\003ti\006\0347\016\005\002\020#&\021!\013\005\002\n\023R,Wn\025;bG.\004")
/*    */ public class EEPROM extends Item implements SimpleItem {
/*  8 */   public ItemStack createItemStack(int amount) { return SimpleItem.class.createItemStack(this, amount); } public boolean isBookEnchantable(ItemStack stack, ItemStack book) { return SimpleItem.class.isBookEnchantable(this, stack, book); } public WeightedRandomChestContent getChestGenBase(ChestGenHooks chest, Random rnd, WeightedRandomChestContent original) { return SimpleItem.class.getChestGenBase(this, chest, rnd, original); } @SideOnly(Side.CLIENT) public void func_77624_a(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { SimpleItem.class.addInformation(this, stack, player, tooltip, advanced); } public int createItemStack$default$1() { return SimpleItem.class.createItemStack$default$1(this); } public EEPROM() { SimpleItem.class.$init$(this); } public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
/*  9 */     return true;
/*    */   }
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 13 */     NBTTagCompound tag = stack.func_77978_p();
/*    */     
/* 15 */     NBTTagCompound data = tag.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/* 16 */     if (stack.func_77942_o() && tag.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()) && data.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString())) {
/* 17 */       return data.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString());
/*    */     }
/*    */ 
/*    */     
/* 21 */     return super.func_77653_i(stack);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\EEPROM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */