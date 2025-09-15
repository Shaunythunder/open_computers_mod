/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.machine.Value;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AbstractValue
/*    */   implements Value
/*    */ {
/*    */   public Object apply(Context context, Arguments arguments) {
/* 14 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void unapply(Context context, Arguments arguments) {}
/*    */ 
/*    */   
/*    */   public Object[] call(Context context, Arguments arguments) {
/* 22 */     throw new RuntimeException("trying to call a non-callable value");
/*    */   }
/*    */   
/*    */   public void dispose(Context context) {}
/*    */   
/*    */   public void load(NBTTagCompound nbt) {}
/*    */   
/*    */   public void save(NBTTagCompound nbt) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\AbstractValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */