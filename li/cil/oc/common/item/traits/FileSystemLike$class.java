/*    */ package li.cil.oc.common.item.traits;
/*    */ import java.util.List;
/*    */ import li.cil.oc.Localization$Tooltip$;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.common.item.data.DriveData;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class FileSystemLike$class {
/*    */   public static None$ tooltipName(FileSystemLike $this) {
/* 15 */     return None$.MODULE$;
/*    */   }
/*    */   
/*    */   public static void $init$(FileSystemLike $this) {}
/*    */   
/*    */   public static void tooltipLines(FileSystemLike $this, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 21 */     NBTTagCompound nbt = stack.func_77978_p();
/*    */     
/* 23 */     NBTTagCompound data = nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/* 24 */     data.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs.label").toString()) ? 
/* 25 */       BoxesRunTime.boxToBoolean(tooltip.add(data.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("fs.label").toString()))) : BoxedUnit.UNIT;
/*    */ 
/*    */     
/* 28 */     NBTTagCompound fsNbt = data.func_74775_l("fs");
/*    */     
/* 30 */     long used = fsNbt.func_74763_f("capacity.used");
/* 31 */     nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()) ? ((advanced && data.func_74764_b("fs")) ? (fsNbt.func_74764_b("capacity.used") ? BoxesRunTime.boxToBoolean(tooltip.add(Localization$Tooltip$.MODULE$.DiskUsage(used, ($this.kiloBytes() * 1024)))) : BoxedUnit.UNIT) : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */     
/* 35 */     DriveData driveData = new DriveData(stack);
/* 36 */     tooltip.add(Localization$Tooltip$.MODULE$.DiskMode(driveData.isUnmanaged()));
/* 37 */     stack.func_77942_o() ? BoxesRunTime.boxToBoolean(tooltip.add(Localization$Tooltip$.MODULE$.DiskLock(driveData.lockInfo()))) : BoxedUnit.UNIT;
/*    */     
/* 39 */     $this.li$cil$oc$common$item$traits$FileSystemLike$$super$tooltipLines(stack, player, tooltip, advanced);
/*    */   }
/*    */   
/*    */   public static ItemStack onItemRightClick(FileSystemLike $this, ItemStack stack, World world, EntityPlayer player) {
/* 43 */     if (!player.func_70093_af() && (!stack.func_77942_o() || !stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lootFactory").toString()))) {
/* 44 */       player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.Drive().id(), world, 0, 0, 0);
/* 45 */       player.func_71038_i();
/*    */     } 
/* 47 */     return stack;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\FileSystemLike$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */