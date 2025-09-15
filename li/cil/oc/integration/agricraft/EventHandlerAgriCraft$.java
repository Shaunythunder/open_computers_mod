/*    */ package li.cil.oc.integration.agricraft;
/*    */ 
/*    */ import com.InfinityRaider.AgriCraft.api.v1.APIv1;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.ISeedStats;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class EventHandlerAgriCraft$ {
/*    */   public static final EventHandlerAgriCraft$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/* 12 */   public void onGeolyzerAnalyze(GeolyzerEvent.Analyze e) { World world = e.host.world();
/*    */     
/* 14 */     ApiHandler$.MODULE$.Api().foreach((Function1)new EventHandlerAgriCraft$$anonfun$onGeolyzerAnalyze$1(e, world)); } public final class EventHandlerAgriCraft$$anonfun$onGeolyzerAnalyze$1 extends AbstractFunction1<APIv1, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(APIv1 api) { BoxedUnit boxedUnit;
/* 15 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(api.isMature(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? 1.0F : 0.0F)));
/*    */ 
/*    */       
/* 18 */       ISeedStats iSeedStats = api.getStats(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z);
/* 19 */       if (iSeedStats != null) { ISeedStats iSeedStats1 = iSeedStats;
/* 20 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("gain"), BoxesRunTime.boxToFloat(iSeedStats1.getGain())));
/* 21 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxGain"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGain())));
/* 22 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(iSeedStats1.getGrowth())));
/* 23 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxGrowth"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGrowth())));
/* 24 */         scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("strength"), BoxesRunTime.boxToFloat(iSeedStats1.getStrength())));
/* 25 */         MapLike mapLike = scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("maxStrength"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxStrength()))); }
/* 26 */       else { boxedUnit = BoxedUnit.UNIT; }
/*    */       
/*    */       return api.isCrops(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? (api.isAnalyzed(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? boxedUnit : BoxedUnit.UNIT) : BoxedUnit.UNIT; }
/*    */      private final GeolyzerEvent.Analyze e$1; private final World world$1; public EventHandlerAgriCraft$$anonfun$onGeolyzerAnalyze$1(GeolyzerEvent.Analyze e$1, World world$1) {} }
/*    */   private EventHandlerAgriCraft$() {
/* 31 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\EventHandlerAgriCraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */