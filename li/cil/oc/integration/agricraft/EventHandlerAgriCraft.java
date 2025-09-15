/*    */ package li.cil.oc.integration.agricraft;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.APIv1;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.ISeedStats;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y:Q!\001\002\t\0025\tQ#\022<f]RD\025M\0343mKJ\fuM]5De\0064GO\003\002\004\t\005I\021m\032:jGJ\fg\r\036\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003+\0253XM\034;IC:$G.\032:BOJL7I]1giN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\"\002\017\020\t\003i\022!E8o\017\026|G.\037>fe\006s\027\r\\={KR\021a$\t\t\003'}I!\001\t\013\003\tUs\027\016\036\005\006Em\001\raI\001\002KB\021A\005\f\b\003K)j\021A\n\006\003O!\nQ!\032<f]RT!!\013\004\002\007\005\004\030.\003\002,M\005iq)Z8msj,'/\022<f]RL!!\f\030\003\017\005s\027\r\\={K*\0211F\n\025\0037A\002\"!\r\037\016\003IR!a\r\033\002\031\0254XM\034;iC:$G.\032:\013\005U2\024AB2p[6|gN\003\0028q\005\031a-\0347\013\005eR\024\001B7pINT\021aO\001\004GB<\030BA\0373\0059\031VOY:de&\024W-\022<f]R\004")
/*    */ public final class EventHandlerAgriCraft {
/*    */   @SubscribeEvent
/*    */   public static void onGeolyzerAnalyze(GeolyzerEvent.Analyze paramAnalyze) {
/*    */     EventHandlerAgriCraft$.MODULE$.onGeolyzerAnalyze(paramAnalyze);
/*    */   }
/*    */   
/*    */   public final class EventHandlerAgriCraft$$anonfun$onGeolyzerAnalyze$1 extends AbstractFunction1<APIv1, Object> implements Serializable {
/*    */     public final Object apply(APIv1 api) {
/*    */       BoxedUnit boxedUnit;
/* 15 */       WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(api.isMature(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? 1.0F : 0.0F)));
/*    */ 
/*    */       
/* 18 */       ISeedStats iSeedStats = api.getStats(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z);
/* 19 */       if (iSeedStats != null) { ISeedStats iSeedStats1 = iSeedStats;
/* 20 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("gain"), BoxesRunTime.boxToFloat(iSeedStats1.getGain())));
/* 21 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxGain"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGain())));
/* 22 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(iSeedStats1.getGrowth())));
/* 23 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxGrowth"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGrowth())));
/* 24 */         WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("strength"), BoxesRunTime.boxToFloat(iSeedStats1.getStrength())));
/* 25 */         MapLike mapLike = WrapAsScala$.MODULE$.mapAsScalaMap(this.e$1.data).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxStrength"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxStrength()))); }
/* 26 */       else { boxedUnit = BoxedUnit.UNIT; }
/*    */       
/*    */       return api.isCrops(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? (api.isAnalyzed(this.world$1, this.e$1.x, this.e$1.y, this.e$1.z) ? boxedUnit : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final GeolyzerEvent.Analyze e$1;
/*    */     private final World world$1;
/*    */     
/*    */     public EventHandlerAgriCraft$$anonfun$onGeolyzerAnalyze$1(GeolyzerEvent.Analyze e$1, World world$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\EventHandlerAgriCraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */