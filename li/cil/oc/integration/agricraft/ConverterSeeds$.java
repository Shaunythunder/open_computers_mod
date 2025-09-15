/*    */ package li.cil.oc.integration.agricraft;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.APIv1;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.ISeedStats;
/*    */ import java.util.Map;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterSeeds$ implements Converter {
/*    */   private ConverterSeeds$() {
/* 11 */     MODULE$ = this;
/*    */   } public static final ConverterSeeds$ MODULE$; public void convert(Object value, Map output) {
/* 13 */     Object object = value;
/* 14 */     if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; ApiHandler$.MODULE$.Api().foreach((Function1)new ConverterSeeds$$anonfun$convert$1(output, itemStack)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */        }
/*    */     
/*    */     else
/*    */     
/*    */     { 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 28 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public final class ConverterSeeds$$anonfun$convert$1 extends AbstractFunction1<APIv1, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Map output$1;
/*    */     private final ItemStack x2$1;
/*    */     
/*    */     public ConverterSeeds$$anonfun$convert$1(Map output$1, ItemStack x2$1) {}
/*    */     
/*    */     public final Object apply(APIv1 api) {
/*    */       BoxedUnit boxedUnit;
/*    */       ISeedStats iSeedStats = api.getSeedStats(this.x2$1);
/*    */       if (iSeedStats != null) {
/*    */         ISeedStats iSeedStats1 = iSeedStats;
/*    */         (new scala.Tuple2[6])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("gain"), BoxesRunTime.boxToFloat(iSeedStats1.getGain()));
/*    */         (new scala.Tuple2[6])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxGain"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGain()));
/*    */         (new scala.Tuple2[6])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(iSeedStats1.getGrowth()));
/*    */         (new scala.Tuple2[6])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxGrowth"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGrowth()));
/*    */         (new scala.Tuple2[6])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("strength"), BoxesRunTime.boxToFloat(iSeedStats1.getStrength()));
/*    */         (new scala.Tuple2[6])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxStrength"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxStrength()));
/*    */         MapLike mapLike = scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.output$1).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("agricraft"), scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6]))));
/*    */       } else {
/*    */         boxedUnit = BoxedUnit.UNIT;
/*    */       } 
/*    */       return (api.isHandledByAgricraft(this.x2$1) && this.x2$1.func_77942_o() && this.x2$1.func_77978_p().func_74767_n("analyzed")) ? boxedUnit : BoxedUnit.UNIT;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\ConverterSeeds$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */