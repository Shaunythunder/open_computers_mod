/*     */ package li.cil.oc.util;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.fluids.FluidContainerRegistry;
/*     */ import net.minecraftforge.fluids.IFluidHandler;
/*     */ import scala.Option;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class FluidContainerUtils$ {
/*     */   public static final FluidContainerUtils$ MODULE$;
/*     */   
/*     */   public Option<IFluidHandler> fluidHandlerIn(IInventory inventory, int slot) {
/*  14 */     ItemStack itemStack = inventory.func_70301_a(slot);
/*  15 */     if (itemStack != null) { ItemStack itemStack1 = itemStack; if (itemStack1 != null) {
/*  16 */         scala.None$ none$; ItemStack oneSizedStack = itemStack1.func_77946_l();
/*  17 */         oneSizedStack.field_77994_a = 1;
/*  18 */         ItemStack itemStack2 = oneSizedStack;
/*  19 */         if (FluidContainerRegistry.isFilledContainer(oneSizedStack)) { Option option = scala.Option$.MODULE$.apply(new FluidContainerUtils.FilledContainerWrapper(oneSizedStack)); }
/*  20 */         else if (FluidContainerRegistry.isEmptyContainer(oneSizedStack)) { Option option = scala.Option$.MODULE$.apply(new FluidContainerUtils.EmptyContainerWrapper(oneSizedStack)); }
/*     */         else
/*  22 */         { scala.None$ none$1; Item item = itemStack1.func_77973_b();
/*  23 */           if (item instanceof net.minecraftforge.fluids.IFluidContainerItem) { Option option = scala.Option$.MODULE$.apply(new FluidContainerUtils.FluidContainerItemWrapper(oneSizedStack)); }
/*  24 */           else { none$1 = scala.None$.MODULE$; }  none$ = none$1; }
/*     */          return (Option<IFluidHandler>)none$;
/*     */       }  }
/*  27 */      return (Option<IFluidHandler>)scala.None$.MODULE$;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean replayableFluidHandler$default$2() {
/*  34 */     return true; } public IFluidHandler replayableFluidHandler(IFluidHandler handler, boolean simulate) {
/*  35 */     return new FluidContainerUtils.ReplayableFluidHandler(handler, simulate);
/*     */   }
/*     */   public ItemStack getContainerResult(IFluidHandler container) {
/*     */     ItemStack itemStack;
/*  39 */     IFluidHandler iFluidHandler = container;
/*  40 */     if (iFluidHandler instanceof FluidContainerUtils.ContainerWrapper) { FluidContainerUtils.ContainerWrapper containerWrapper = (FluidContainerUtils.ContainerWrapper)iFluidHandler; itemStack = containerWrapper.getResult(); }
/*  41 */     else { itemStack = null; }
/*     */     
/*     */     return itemStack;
/*     */   }
/*     */   
/*     */   public void replay(IFluidHandler replayable, IFluidHandler handler) {
/*  47 */     IFluidHandler iFluidHandler = replayable;
/*  48 */     if (iFluidHandler instanceof FluidContainerUtils.ReplayableFluidHandler) { FluidContainerUtils.ReplayableFluidHandler replayableFluidHandler = (FluidContainerUtils.ReplayableFluidHandler)iFluidHandler; replayableFluidHandler.replay(handler); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  49 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FluidContainerUtils$() {
/* 211 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\FluidContainerUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */