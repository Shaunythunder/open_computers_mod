/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.driver.Item;
/*    */ import li.cil.oc.api.internal.Adapter;
/*    */ import li.cil.oc.api.internal.Case;
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.api.internal.Rotatable;
/*    */ import li.cil.oc.api.internal.Server;
/*    */ import li.cil.oc.api.internal.Tablet;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DriverItem
/*    */   implements Item
/*    */ {
/*    */   protected final ItemStack[] items;
/*    */   
/*    */   protected DriverItem(ItemStack... items) {
/* 26 */     this.items = (ItemStack[])items.clone();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean worksWith(ItemStack stack) {
/* 31 */     if (stack != null) {
/* 32 */       for (ItemStack item : this.items) {
/* 33 */         if (item != null && item.func_77969_a(stack)) {
/* 34 */           return true;
/*    */         }
/*    */       } 
/*    */     }
/* 38 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int tier(ItemStack stack) {
/* 43 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public NBTTagCompound dataTag(ItemStack stack) {
/* 48 */     if (!stack.func_77942_o()) {
/* 49 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 51 */     NBTTagCompound nbt = stack.func_77978_p();
/*    */ 
/*    */     
/* 54 */     if (!nbt.func_74764_b("oc:data")) {
/* 55 */       nbt.func_74782_a("oc:data", (NBTBase)new NBTTagCompound());
/*    */     }
/* 57 */     return nbt.func_74775_l("oc:data");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean isAdapter(Class<? extends EnvironmentHost> host) {
/* 63 */     return Adapter.class.isAssignableFrom(host);
/*    */   }
/*    */   
/*    */   protected boolean isComputer(Class<? extends EnvironmentHost> host) {
/* 67 */     return Case.class.isAssignableFrom(host);
/*    */   }
/*    */   
/*    */   protected boolean isRobot(Class<? extends EnvironmentHost> host) {
/* 71 */     return Robot.class.isAssignableFrom(host);
/*    */   }
/*    */   
/*    */   protected boolean isRotatable(Class<? extends EnvironmentHost> host) {
/* 75 */     return Rotatable.class.isAssignableFrom(host);
/*    */   }
/*    */   
/*    */   protected boolean isServer(Class<? extends EnvironmentHost> host) {
/* 79 */     return Server.class.isAssignableFrom(host);
/*    */   }
/*    */   
/*    */   protected boolean isTablet(Class<? extends EnvironmentHost> host) {
/* 83 */     return Tablet.class.isAssignableFrom(host);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\DriverItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */