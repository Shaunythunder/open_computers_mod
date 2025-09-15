/*    */ package li.cil.oc.common.item.traits;
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Machine;
/*    */ import li.cil.oc.api.driver.Item;
/*    */ import li.cil.oc.api.driver.item.MutableProcessor;
/*    */ import li.cil.oc.integration.opencomputers.DriverCPU$;
/*    */ import li.cil.oc.util.Tooltip$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.Seq$;
/*    */ import scala.collection.immutable.List;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public abstract class CPULike$class {
/*    */   public static Seq tooltipData(CPULike $this) {
/* 22 */     return (Seq)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapIntArray(new int[] { Settings$.MODULE$.get().cpuComponentSupport()[$this.cpuTierForComponents()] }));
/*    */   } public static void $init$(CPULike $this) {}
/*    */   public static void tooltipExtended(CPULike $this, ItemStack stack, List tooltip) {
/* 25 */     tooltip.addAll(Tooltip$.MODULE$.get("CPU.Architecture", (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Machine.getArchitectureName(DriverCPU$.MODULE$.architecture(stack)) })));
/*    */   }
/*    */   
/*    */   public static ItemStack onItemRightClick(CPULike $this, ItemStack stack, World world, EntityPlayer player) {
/* 29 */     if (player.func_70093_af() && 
/* 30 */       !world.field_72995_K) {
/* 31 */       Item item = Driver.driverFor(stack);
/* 32 */       if (item instanceof MutableProcessor) { MutableProcessor mutableProcessor = (MutableProcessor)item;
/* 33 */         List architectures = WrapAsScala$.MODULE$.collectionAsScalaIterable(mutableProcessor.allArchitectures()).toList();
/* 34 */         if (architectures.nonEmpty()) {
/* 35 */           int currentIndex = architectures.indexOf(mutableProcessor.architecture(stack));
/* 36 */           int newIndex = (currentIndex + 1) % architectures.length();
/* 37 */           Class archClass = (Class)architectures.apply(newIndex);
/* 38 */           String archName = Machine.getArchitectureName(archClass);
/* 39 */           mutableProcessor.setArchitecture(stack, archClass);
/* 40 */           player.func_145747_a((IChatComponent)new ChatComponentTranslation((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tooltip.CPU.Architecture").toString(), new Object[] { archName }));
/*    */         } 
/* 42 */         player.func_71038_i(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 43 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } 
/*    */     
/* 47 */     return stack;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\CPULike$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */