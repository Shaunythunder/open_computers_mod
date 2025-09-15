/*    */ package li.cil.oc.integration.vanilla;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.fluids.Fluid;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import net.minecraftforge.fluids.IFluidContainerItem;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterFluidContainerItem$ implements Converter {
/*    */   private ConverterFluidContainerItem$() {
/* 14 */     MODULE$ = this;
/*    */   } public static final ConverterFluidContainerItem$ MODULE$; public void convert(Object value, Map output) {
/* 16 */     Object object = value;
/* 17 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; Item item = itemStack.func_77973_b();
/* 18 */       if (item instanceof IFluidContainerItem) { Item item1 = item;
/* 19 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(((IFluidContainerItem)item1).getCapacity(itemStack))));
/* 20 */         FluidStack fluidStack = ((IFluidContainerItem)item1).getFluid(itemStack);
/*    */         
/* 22 */         Object[] fluidData = li.cil.oc.server.driver.Registry$.MODULE$.convert(new Object[] { fluidStack });
/* 23 */         (fluidStack == null) ? BoxedUnit.UNIT : (scala.Predef$.MODULE$.refArrayOps(fluidData).nonEmpty() ? 
/* 24 */           scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid"), fluidData[0])) : BoxedUnit.UNIT);
/*    */ 
/*    */ 
/*    */         
/* 28 */         HashMap<Object, Object> fluidMap = new HashMap<>();
/* 29 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(fluidMap).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(0)));
/* 30 */         output.containsKey("fluid") ? BoxedUnit.UNIT : scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid"), fluidMap));
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 35 */         Fluid fluid = fluidStack.getFluid();
/* 36 */         li.cil.oc.Settings$.MODULE$.get().insertIdsInConverters() ? 
/* 37 */           scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid_id"), BoxesRunTime.boxToInteger(fluid.getID()))) : BoxedUnit.UNIT;
/* 38 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid_hasTag"), BoxesRunTime.boxToBoolean(!(fluidStack.tag == null))));
/*    */         
/* 40 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid_name"), fluid.getName()));
/* 41 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("fluid_label"), fluid.getLocalizedName(fluidStack))); BoxedUnit boxedUnit1 = (fluidStack == null || fluidStack.getFluid() == null) ? BoxedUnit.UNIT : ((fluid == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT); }
/*    */       else
/*    */       
/* 44 */       { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */        BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 46 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterFluidContainerItem$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */