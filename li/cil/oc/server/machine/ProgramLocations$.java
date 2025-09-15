/*    */ package li.cil.oc.server.machine;
/*    */ 
/*    */ public final class ProgramLocations$ {
/*    */   public static final ProgramLocations$ MODULE$;
/*    */   
/*  6 */   public final Map<String, Map<String, String>> architectureLocations() { return this.architectureLocations; } private final Map<String, Map<String, String>> architectureLocations; private final Map<String, String> globalLocations; public final Map<String, String> globalLocations() {
/*  7 */     return this.globalLocations;
/*    */   }
/*    */   
/* 10 */   public void addMapping(String program, String label, Seq architectures) { if (architectures == null || architectures.isEmpty())
/* 11 */     { globalLocations().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(program), label)); }
/*    */     else
/*    */     
/* 14 */     { architectures.foreach((Function1)new ProgramLocations$$anonfun$addMapping$1(program, label)); }  } public final class ProgramLocations$$anonfun$addMapping$1 extends AbstractFunction1<String, Map<String, String>> implements Serializable { public static final long serialVersionUID = 0L; private final String program$1; private final String label$1; public final Map<String, String> apply(String x$1) { return (Map<String, String>)((MapLike)ProgramLocations$.MODULE$.architectureLocations().getOrElseUpdate(x$1, (Function0)new ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1(this))).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(this.program$1), this.label$1)); } public ProgramLocations$$anonfun$addMapping$1(String program$1, String label$1) {} public final class ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1 extends AbstractFunction0<Map<String, String>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, String> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); }
/*    */       
/*    */       public ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1(ProgramLocations$$anonfun$addMapping$1 $outer) {} } }
/*    */   
/* 18 */   public Iterable<Tuple2<String, String>> getMappings(String architecture) { return (Iterable<Tuple2<String, String>>)((TraversableLike)architectureLocations().getOrElse(architecture, (Function0)new ProgramLocations$$anonfun$getMappings$1())).$plus$plus((GenTraversableOnce)globalLocations(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ProgramLocations$$anonfun$getMappings$1 extends AbstractFunction0<Iterable<scala.runtime.Nothing$>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<scala.runtime.Nothing$> apply() { return (Iterable<scala.runtime.Nothing$>)scala.package$.MODULE$.Iterable().empty(); } } private ProgramLocations$() {
/* 19 */     MODULE$ = this;
/*    */     this.architectureLocations = scala.collection.mutable.Map$.MODULE$.empty();
/*    */     this.globalLocations = scala.collection.mutable.Map$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\ProgramLocations$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */