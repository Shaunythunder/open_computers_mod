/*    */ package li.cil.oc.integration.thaumcraft;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.IntRef;
/*    */ import thaumcraft.api.aspects.Aspect;
/*    */ import thaumcraft.api.aspects.AspectList;
/*    */ 
/*    */ public final class ConverterAspectItem$ implements Converter {
/* 11 */   private ConverterAspectItem$() { MODULE$ = this; } public static final ConverterAspectItem$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (itemStack.func_77942_o()) {
/* 14 */         AspectList aspects = new AspectList();
/* 15 */         aspects.readFromNBT(itemStack.func_77978_p());
/* 16 */         (aspects.size() > 0) ? 
/* 17 */           scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("aspects"), aspects)) : BoxedUnit.UNIT;
/* 18 */         Item item = itemStack.func_77973_b();
/* 19 */         if (item instanceof ItemWandCasting) { ItemWandCasting itemWandCasting = (ItemWandCasting)item;
/* 20 */           aspects = itemWandCasting.getAllVis(itemStack);
/*    */           
/* 22 */           scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("aspects"), aspects)); BoxedUnit boxedUnit1 = (aspects.size() > 0) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */         else
/* 24 */         { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */          BoxedUnit boxedUnit = BoxedUnit.UNIT; return;
/*    */       }  }
/* 27 */      if (object instanceof IAspectContainer) { IAspectContainer iAspectContainer = (IAspectContainer)object;
/* 28 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("aspects"), iAspectContainer.getAspects())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/* 30 */     else if (object instanceof AspectList) { AspectList aspectList = (AspectList)object;
/* 31 */       IntRef i = IntRef.create(1);
/* 32 */       scala.Predef$.MODULE$.refArrayOps((Object[])aspectList.getAspects()).foreach((Function1)new ConverterAspectItem$$anonfun$convert$1(output, i, aspectList)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */       
/*    */        }
/*    */     
/*    */     else
/*    */     
/*    */     { 
/*    */       
/* 41 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public final class ConverterAspectItem$$anonfun$convert$1 extends AbstractFunction1<Aspect, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Map output$1;
/*    */     private final IntRef i$1;
/*    */     private final AspectList x4$1;
/*    */     
/*    */     public ConverterAspectItem$$anonfun$convert$1(Map output$1, IntRef i$1, AspectList x4$1) {}
/*    */     
/*    */     public final void apply(Aspect aspect) {
/*    */       if (aspect != null) {
/*    */         HashMap<Object, Object> aspectMap = new HashMap<>();
/*    */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(aspectMap).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), aspect.getName()));
/*    */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(aspectMap).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("amount"), BoxesRunTime.boxToInteger(this.x4$1.getAmount(aspect))));
/*    */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.output$1).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(this.i$1.elem)), aspectMap));
/*    */         this.i$1.elem++;
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumcraft\ConverterAspectItem$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */