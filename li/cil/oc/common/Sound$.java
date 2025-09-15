/*    */ package li.cil.oc.common;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ 
/*    */ public final class Sound$ {
/*    */   public static final Sound$ MODULE$;
/*    */   private final WeakHashMap<EnvironmentHost, Map<String, Object>> globalTimeouts;
/*    */   
/*    */   public WeakHashMap<EnvironmentHost, Map<String, Object>> globalTimeouts() {
/*  9 */     return this.globalTimeouts;
/*    */   }
/*    */   public synchronized Object play(EnvironmentHost host, String name) { MapLike mapLike;
/* 12 */     Option option = globalTimeouts().get(host);
/* 13 */     Some some = (Some)option; Map hostTimeouts = (Map)some.x(); if (option instanceof Some && BoxesRunTime.unboxToLong(hostTimeouts.getOrElse(name, (Function0)new Sound$$anonfun$play$1())) > System.currentTimeMillis()) { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     else
/* 15 */     { host.world().func_72908_a(host.xPosition(), host.yPosition(), host.zPosition(), (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":").append(name).toString(), li.cil.oc.Settings$.MODULE$.get().soundVolume(), 1.0F);
/* 16 */       mapLike = ((MapLike)globalTimeouts().getOrElseUpdate(host, (Function0)new Sound$$anonfun$play$2())).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), BoxesRunTime.boxToLong(System.currentTimeMillis() + 500L))); }  return mapLike; } public final class Sound$$anonfun$play$1 extends AbstractFunction0.mcJ.sp implements Serializable { public static final long serialVersionUID = 0L; public final long apply() { return apply$mcJ$sp(); } public long apply$mcJ$sp() { return 0L; } } public final class Sound$$anonfun$play$2 extends AbstractFunction0<Map<String, Object>> implements Serializable { public final Map<String, Object> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); }
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */   
/*    */   public void playDiskInsert(EnvironmentHost host) {
/* 21 */     play(host, "floppy_insert");
/*    */   }
/*    */   
/*    */   public void playDiskEject(EnvironmentHost host) {
/* 25 */     play(host, "floppy_eject");
/*    */   } private Sound$() {
/* 27 */     MODULE$ = this;
/*    */     this.globalTimeouts = scala.collection.mutable.WeakHashMap$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\Sound$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */