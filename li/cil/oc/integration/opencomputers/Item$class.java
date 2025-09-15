/*    */ package li.cil.oc.integration.opencomputers;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.internal.Adapter;
/*    */ import li.cil.oc.api.internal.Case;
/*    */ import li.cil.oc.api.internal.Drone;
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.api.internal.Rotatable;
/*    */ import li.cil.oc.api.internal.Tablet;
/*    */ import li.cil.oc.server.driver.Registry$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.SeqLike;
/*    */ 
/*    */ public abstract class Item$class {
/*    */   public static boolean worksWith(Item $this, ItemStack stack, Class host) {
/* 18 */     return ($this.worksWith(stack) && !Registry$.MODULE$.blacklist().exists((Function1)new Item$$anonfun$worksWith$1($this, stack, host)));
/*    */   }
/*    */   
/*    */   public static void $init$(Item $this) {}
/*    */   
/*    */   public static int tier(Item $this, ItemStack stack) {
/* 24 */     return 0;
/*    */   } public static NBTTagCompound dataTag(Item $this, ItemStack stack) {
/* 26 */     return Item$.MODULE$.dataTag(stack);
/*    */   } public static boolean isOneOf(Item $this, ItemStack stack, Seq items) {
/* 28 */     return ((SeqLike)items.filter((Function1)new Item$$anonfun$isOneOf$1($this))).contains(Items.get(stack));
/*    */   } public static boolean isAdapter(Item $this, Class<?> host) {
/* 30 */     return Adapter.class.isAssignableFrom(host);
/*    */   } public static boolean isComputer(Item $this, Class<?> host) {
/* 32 */     return Case.class.isAssignableFrom(host);
/*    */   } public static boolean isRobot(Item $this, Class<?> host) {
/* 34 */     return Robot.class.isAssignableFrom(host);
/*    */   } public static boolean isRotatable(Item $this, Class<?> host) {
/* 36 */     return Rotatable.class.isAssignableFrom(host);
/*    */   } public static boolean isServer(Item $this, Class<?> host) {
/* 38 */     return Server.class.isAssignableFrom(host);
/*    */   } public static boolean isTablet(Item $this, Class<?> host) {
/* 40 */     return Tablet.class.isAssignableFrom(host);
/*    */   } public static boolean isMicrocontroller(Item $this, Class<?> host) {
/* 42 */     return Microcontroller.class.isAssignableFrom(host);
/*    */   } public static boolean isDrone(Item $this, Class<?> host) {
/* 44 */     return Drone.class.isAssignableFrom(host);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\Item$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */