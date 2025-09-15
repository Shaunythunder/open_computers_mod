/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import java.io.File;
/*    */ import li.cil.oc.api.FileSystem;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.fs.FileSystem;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class DriverLootDisk$ implements Item {
/*    */   public static final DriverLootDisk$ MODULE$;
/*    */   
/* 17 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public int tier(ItemStack stack) { return Item$class.tier(this, stack); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverLootDisk$() { MODULE$ = this; Item$class.$init$(this); }
/*    */    public boolean worksWith(ItemStack stack) {
/* 19 */     (new ItemInfo[1])[0] = Items.get("lootDisk"); return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[1]));
/*    */   }
/*    */   
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 23 */     String lootPath = (new StringBuilder()).append("loot/").append(stack.func_77978_p().func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootPath").toString())).toString();
/* 24 */     File savePath = new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.savePath()).append(lootPath).toString());
/* 25 */     FileSystem fs = 
/* 26 */       (savePath.exists() && savePath.isDirectory()) ? 
/* 27 */       FileSystem.fromSaveDirectory(lootPath, 0L, false) : 
/*    */ 
/*    */       
/* 30 */       FileSystem.fromClass(li.cil.oc.OpenComputers$.MODULE$.getClass(), li.cil.oc.Settings$.MODULE$.resourceDomain(), lootPath);
/*    */     
/* 32 */     String label = 
/* 33 */       dataTag(stack).func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("fs.label").toString()) ? 
/* 34 */       dataTag(stack).func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("fs.label").toString()) : 
/*    */       
/* 36 */       null;
/* 37 */     return (!(host.world()).field_72995_K && stack.func_77942_o()) ? FileSystem.asManagedEnvironment(fs, label, host, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":floppy_access").toString()) : 
/*    */       
/* 39 */       null;
/*    */   } public String slot(ItemStack stack) {
/* 41 */     return li.cil.oc.common.Slot$.MODULE$.Floppy();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverLootDisk$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */