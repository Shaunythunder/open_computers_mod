/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Item$
/*    */ {
/*    */   public static final Item$ MODULE$;
/*    */   
/*    */   public NBTTagCompound dataTag(ItemStack stack) {
/* 49 */     if (!stack.func_77942_o()) {
/* 50 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 52 */     NBTTagCompound nbt = stack.func_77978_p();
/* 53 */     if (!nbt.func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString())) {
/* 54 */       nbt.func_74782_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)new NBTTagCompound());
/*    */     }
/* 56 */     return nbt.func_74775_l((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString());
/*    */   }
/*    */ 
/*    */   
/*    */   private Option<NBTTagCompound> getTag(NBTTagCompound tagCompound, String[] keys) {
/*    */     while (true) {
/* 62 */       if (tagCompound.func_74764_b(keys[0])) {
/* 63 */         keys = (String[])scala.Predef$.MODULE$.refArrayOps((Object[])keys).drop(1); tagCompound = tagCompound.func_74775_l(keys[0]);
/*    */         continue;
/*    */       } 
/*    */       return (keys.length == 0) ? scala.Option$.MODULE$.apply(tagCompound) : (Option<NBTTagCompound>)scala.None$.MODULE$;
/* 67 */     }  } private Option<NBTTagCompound> getTag(ItemStack stack, String[] keys) { return (stack == null || stack.field_77994_a == 0) ? (Option<NBTTagCompound>)scala.None$.MODULE$ : (
/* 68 */       stack.func_77942_o() ? 
/* 69 */       getTag(stack.func_77978_p(), keys) : (Option<NBTTagCompound>)scala.None$.MODULE$); }
/*    */ 
/*    */   
/*    */   public Option<String> address(ItemStack stack) {
/* 73 */     String addressKey = "address";
/* 74 */     (new String[2])[0] = (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString(); (new String[2])[1] = "node"; Option<NBTTagCompound> option = getTag(stack, new String[2]);
/* 75 */     if (option instanceof Some) { Some some = (Some)option; NBTTagCompound tag = (NBTTagCompound)some.x(); if (tag.func_74764_b(addressKey)) return scala.Option$.MODULE$.apply(tag.func_74779_i(addressKey));  }
/* 76 */      return (Option<String>)scala.None$.MODULE$;
/*    */   }
/*    */   private Item$() {
/* 79 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\Item$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */