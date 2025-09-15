/*    */ package li.cil.oc.integration.agricraft;
/*    */ import com.InfinityRaider.AgriCraft.api.v1.ISeedStats;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y:Q!\001\002\t\0025\tabQ8om\026\024H/\032:TK\026$7O\003\002\004\t\005I\021m\032:jGJ\fg\r\036\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\035\r{gN^3si\026\0248+Z3egN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\021\016\003qQ!!\b\020\002\r\021\024\030N^3s\025\tyb!A\002ba&L!!\t\017\003\023\r{gN^3si\026\024\b\"B\022\020\t\003!\023A\002\037j]&$h\bF\001\016\021\0251s\002\"\021(\003\035\031wN\034<feR$2\001\013\0304!\tIC&D\001+\025\005Y\023!B:dC2\f\027BA\027+\005\021)f.\033;\t\013=*\003\031\001\031\002\013Y\fG.^3\021\005%\n\024B\001\032+\005\r\te.\037\005\006i\025\002\r!N\001\007_V$\b/\036;\021\tYJ4hO\007\002o)\021\001HF\001\005kRLG.\003\002;o\t\031Q*\0319\021\005%b\024BA\037+\005\031\te.\037*fM\002")
/*    */ public final class ConverterSeeds {
/*    */   public static void convert(Object paramObject, Map<Object, Object> paramMap) {
/*    */     ConverterSeeds$.MODULE$.convert(paramObject, paramMap);
/*    */   }
/*    */   
/*    */   public final class ConverterSeeds$$anonfun$convert$1 extends AbstractFunction1<APIv1, Object> implements Serializable {
/*    */     public final Object apply(APIv1 api) {
/*    */       BoxedUnit boxedUnit;
/* 15 */       ISeedStats iSeedStats = api.getSeedStats(this.x2$1);
/* 16 */       if (iSeedStats != null) { ISeedStats iSeedStats1 = iSeedStats;
/* 17 */         (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/* 18 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("gain"), BoxesRunTime.boxToFloat(iSeedStats1.getGain()));
/* 19 */         (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxGain"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGain()));
/* 20 */         (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToFloat(iSeedStats1.getGrowth()));
/* 21 */         (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxGrowth"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxGrowth()));
/* 22 */         (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("strength"), BoxesRunTime.boxToFloat(iSeedStats1.getStrength()));
/* 23 */         (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxStrength"), BoxesRunTime.boxToFloat(iSeedStats1.getMaxStrength())); MapLike mapLike = WrapAsScala$.MODULE$.mapAsScalaMap(this.output$1).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("agricraft"), Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6])))); }
/*    */       else
/* 25 */       { boxedUnit = BoxedUnit.UNIT; }
/*    */       
/*    */       return (api.isHandledByAgricraft(this.x2$1) && this.x2$1.func_77942_o() && this.x2$1.func_77978_p().func_74767_n("analyzed")) ? boxedUnit : BoxedUnit.UNIT;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Map output$1;
/*    */     private final ItemStack x2$1;
/*    */     
/*    */     public ConverterSeeds$$anonfun$convert$1(Map output$1, ItemStack x2$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\ConverterSeeds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */