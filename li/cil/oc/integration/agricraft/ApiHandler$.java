/*    */ package li.cil.oc.integration.agricraft;
/*    */ public final class ApiHandler$ {
/*    */   public static final ApiHandler$ MODULE$;
/*    */   
/*    */   public Option<APIv1> Api() {
/*  6 */     return this.bitmap$0 ? this.Api : Api$lzycompute();
/*    */   }
/*    */   private Option<APIv1> Api; private volatile boolean bitmap$0;
/*    */   private Option Api$lzycompute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: astore_1
/*    */     //   3: monitorenter
/*    */     //   4: aload_0
/*    */     //   5: getfield bitmap$0 : Z
/*    */     //   8: ifne -> 64
/*    */     //   11: aload_0
/*    */     //   12: iconst_1
/*    */     //   13: invokestatic getAPI : (I)Lcom/InfinityRaider/AgriCraft/api/APIBase;
/*    */     //   16: astore_2
/*    */     //   17: aload_2
/*    */     //   18: instanceof com/InfinityRaider/AgriCraft/api/v1/APIv1
/*    */     //   21: ifeq -> 49
/*    */     //   24: aload_2
/*    */     //   25: checkcast com/InfinityRaider/AgriCraft/api/v1/APIv1
/*    */     //   28: astore_3
/*    */     //   29: aload_0
/*    */     //   30: aload_3
/*    */     //   31: invokespecial isApiUsable : (Lcom/InfinityRaider/AgriCraft/api/APIBase;)Z
/*    */     //   34: ifeq -> 49
/*    */     //   37: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   40: aload_3
/*    */     //   41: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   44: astore #4
/*    */     //   46: goto -> 54
/*    */     //   49: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */     //   52: astore #4
/*    */     //   54: aload #4
/*    */     //   56: putfield Api : Lscala/Option;
/*    */     //   59: aload_0
/*    */     //   60: iconst_1
/*    */     //   61: putfield bitmap$0 : Z
/*    */     //   64: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   67: pop
/*    */     //   68: aload_1
/*    */     //   69: monitorexit
/*    */     //   70: aload_0
/*    */     //   71: getfield Api : Lscala/Option;
/*    */     //   74: areturn
/*    */     //   75: aload_1
/*    */     //   76: monitorexit
/*    */     //   77: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 0
/*    */     //   #7	-> 17
/*    */     //   #8	-> 49
/*    */     //   #6	-> 54
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	78	0	this	Lli/cil/oc/integration/agricraft/ApiHandler$;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   4	70	75	finally
/*    */   }
/*    */   private boolean isApiUsable(APIBase api) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokeinterface getStatus : ()Lcom/InfinityRaider/AgriCraft/api/APIStatus;
/*    */     //   6: astore_2
/*    */     //   7: aload_2
/*    */     //   8: getstatic com/InfinityRaider/AgriCraft/api/APIStatus.OK : Lcom/InfinityRaider/AgriCraft/api/APIStatus;
/*    */     //   11: astore_3
/*    */     //   12: dup
/*    */     //   13: ifnonnull -> 24
/*    */     //   16: pop
/*    */     //   17: aload_3
/*    */     //   18: ifnull -> 85
/*    */     //   21: goto -> 31
/*    */     //   24: aload_3
/*    */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   28: ifne -> 85
/*    */     //   31: aload_2
/*    */     //   32: getstatic com/InfinityRaider/AgriCraft/api/APIStatus.BACKLEVEL_OK : Lcom/InfinityRaider/AgriCraft/api/APIStatus;
/*    */     //   35: astore #4
/*    */     //   37: dup
/*    */     //   38: ifnonnull -> 50
/*    */     //   41: pop
/*    */     //   42: aload #4
/*    */     //   44: ifnull -> 85
/*    */     //   47: goto -> 58
/*    */     //   50: aload #4
/*    */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   55: ifne -> 85
/*    */     //   58: aload_2
/*    */     //   59: getstatic com/InfinityRaider/AgriCraft/api/APIStatus.BACKLEVEL_LIMITED : Lcom/InfinityRaider/AgriCraft/api/APIStatus;
/*    */     //   62: astore #5
/*    */     //   64: dup
/*    */     //   65: ifnonnull -> 77
/*    */     //   68: pop
/*    */     //   69: aload #5
/*    */     //   71: ifnull -> 85
/*    */     //   74: goto -> 89
/*    */     //   77: aload #5
/*    */     //   79: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   82: ifeq -> 89
/*    */     //   85: iconst_1
/*    */     //   86: goto -> 90
/*    */     //   89: iconst_0
/*    */     //   90: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     //   #13	-> 7
/*    */     //   #14	-> 31
/*    */     //   #15	-> 58
/*    */     //   #14	-> 85
/*    */     //   #11	-> 90
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	91	0	this	Lli/cil/oc/integration/agricraft/ApiHandler$;
/*    */     //   0	91	1	api	Lcom/InfinityRaider/AgriCraft/api/APIBase;
/*    */     //   7	84	2	status	Lcom/InfinityRaider/AgriCraft/api/APIStatus;
/*    */   }
/*    */   
/*    */   private ApiHandler$() {
/* 17 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\agricraft\ApiHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */