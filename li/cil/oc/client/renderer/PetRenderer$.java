/*     */ package li.cil.oc.client.renderer;
/*     */ import com.google.common.cache.Cache;
/*     */ import cpw.mods.fml.common.eventhandler.EventPriority;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraftforge.client.event.RenderPlayerEvent;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class PetRenderer$ {
/*     */   public static final PetRenderer$ MODULE$;
/*     */   private final Set<String> hidden;
/*     */   private boolean isInitialized;
/*     */   
/*     */   public Set<String> hidden() {
/*  22 */     return this.hidden;
/*     */   } private final Map<String, Tuple3<Object, Object, Object>> entitledPlayers; private final Cache<Entity, PetRenderer.PetLocation> petLocations; private Option<Tuple3<Object, Object, Object>> rendering; public boolean isInitialized() {
/*  24 */     return this.isInitialized; } public void isInitialized_$eq(boolean x$1) { this.isInitialized = x$1; }
/*     */   
/*     */   private Map<String, Tuple3<Object, Object, Object>> entitledPlayers() {
/*  27 */     return this.entitledPlayers;
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
/*     */   private Cache<Entity, PetRenderer.PetLocation> petLocations() {
/*  41 */     return this.petLocations;
/*     */   }
/*     */   
/*     */   private Option<Tuple3<Object, Object, Object>> rendering()
/*     */   {
/*  46 */     return this.rendering; } private void rendering_$eq(Option<Tuple3<Object, Object, Object>> x$1) { this.rendering = x$1; }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onPlayerRender(RenderPlayerEvent.Pre e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   4: invokevirtual func_110124_au : ()Ljava/util/UUID;
/*     */     //   7: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   10: astore_2
/*     */     //   11: aload_0
/*     */     //   12: invokevirtual hidden : ()Lscala/collection/mutable/Set;
/*     */     //   15: aload_2
/*     */     //   16: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   21: ifne -> 353
/*     */     //   24: aload_0
/*     */     //   25: invokespecial entitledPlayers : ()Lscala/collection/immutable/Map;
/*     */     //   28: aload_2
/*     */     //   29: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 353
/*     */     //   37: aload_0
/*     */     //   38: new scala/Some
/*     */     //   41: dup
/*     */     //   42: aload_0
/*     */     //   43: invokespecial entitledPlayers : ()Lscala/collection/immutable/Map;
/*     */     //   46: aload_2
/*     */     //   47: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   52: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   55: invokespecial rendering_$eq : (Lscala/Option;)V
/*     */     //   58: aload_1
/*     */     //   59: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   62: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   65: invokevirtual func_82737_E : ()J
/*     */     //   68: lstore_3
/*     */     //   69: aload_1
/*     */     //   70: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   73: invokevirtual hashCode : ()I
/*     */     //   76: sipush #255
/*     */     //   79: ixor
/*     */     //   80: istore #5
/*     */     //   82: iload #5
/*     */     //   84: i2d
/*     */     //   85: lload_3
/*     */     //   86: l2d
/*     */     //   87: ldc2_w 20.0
/*     */     //   90: ddiv
/*     */     //   91: dadd
/*     */     //   92: dstore #6
/*     */     //   94: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   97: iload #5
/*     */     //   99: i2d
/*     */     //   100: lload_3
/*     */     //   101: l2d
/*     */     //   102: aload_1
/*     */     //   103: getfield partialRenderTick : F
/*     */     //   106: f2d
/*     */     //   107: dadd
/*     */     //   108: ldc2_w 20.0
/*     */     //   111: ddiv
/*     */     //   112: dadd
/*     */     //   113: invokevirtual sin : (D)D
/*     */     //   116: ldc2_w 0.03
/*     */     //   119: dmul
/*     */     //   120: d2f
/*     */     //   121: fstore #8
/*     */     //   123: aload_0
/*     */     //   124: invokespecial petLocations : ()Lcom/google/common/cache/Cache;
/*     */     //   127: aload_1
/*     */     //   128: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   131: new li/cil/oc/client/renderer/PetRenderer$$anon$1
/*     */     //   134: dup
/*     */     //   135: aload_1
/*     */     //   136: invokespecial <init> : (Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;)V
/*     */     //   139: invokeinterface get : (Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
/*     */     //   144: checkcast li/cil/oc/client/renderer/PetRenderer$PetLocation
/*     */     //   147: astore #9
/*     */     //   149: invokestatic glPushMatrix : ()V
/*     */     //   152: ldc 1048575
/*     */     //   154: invokestatic glPushAttrib : (I)V
/*     */     //   157: aload_1
/*     */     //   158: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   161: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   164: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   167: astore #10
/*     */     //   169: dup
/*     */     //   170: ifnonnull -> 182
/*     */     //   173: pop
/*     */     //   174: aload #10
/*     */     //   176: ifnull -> 280
/*     */     //   179: goto -> 190
/*     */     //   182: aload #10
/*     */     //   184: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   187: ifne -> 280
/*     */     //   190: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   193: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   196: aload_1
/*     */     //   197: getfield partialRenderTick : F
/*     */     //   200: invokevirtual func_70666_h : (F)Lnet/minecraft/util/Vec3;
/*     */     //   203: astore #11
/*     */     //   205: aload_1
/*     */     //   206: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   209: aload_1
/*     */     //   210: getfield partialRenderTick : F
/*     */     //   213: invokevirtual func_70666_h : (F)Lnet/minecraft/util/Vec3;
/*     */     //   216: astore #12
/*     */     //   218: ldc2_w 1.62
/*     */     //   221: aload_1
/*     */     //   222: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   225: invokevirtual func_70093_af : ()Z
/*     */     //   228: ifeq -> 237
/*     */     //   231: ldc2_w 0.125
/*     */     //   234: goto -> 238
/*     */     //   237: dconst_0
/*     */     //   238: dsub
/*     */     //   239: dstore #13
/*     */     //   241: aload #12
/*     */     //   243: getfield field_72450_a : D
/*     */     //   246: aload #11
/*     */     //   248: getfield field_72450_a : D
/*     */     //   251: dsub
/*     */     //   252: aload #12
/*     */     //   254: getfield field_72448_b : D
/*     */     //   257: aload #11
/*     */     //   259: getfield field_72448_b : D
/*     */     //   262: dsub
/*     */     //   263: dload #13
/*     */     //   265: dadd
/*     */     //   266: aload #12
/*     */     //   268: getfield field_72449_c : D
/*     */     //   271: aload #11
/*     */     //   273: getfield field_72449_c : D
/*     */     //   276: dsub
/*     */     //   277: invokestatic glTranslated : (DDD)V
/*     */     //   280: sipush #2896
/*     */     //   283: invokestatic glEnable : (I)V
/*     */     //   286: sipush #3042
/*     */     //   289: invokestatic glDisable : (I)V
/*     */     //   292: ldc 32826
/*     */     //   294: invokestatic glEnable : (I)V
/*     */     //   297: fconst_1
/*     */     //   298: fconst_1
/*     */     //   299: fconst_1
/*     */     //   300: fconst_1
/*     */     //   301: invokestatic glColor4f : (FFFF)V
/*     */     //   304: aload #9
/*     */     //   306: aload_1
/*     */     //   307: getfield partialRenderTick : F
/*     */     //   310: invokevirtual applyInterpolatedTransformations : (F)V
/*     */     //   313: ldc 0.3
/*     */     //   315: ldc 0.3
/*     */     //   317: ldc 0.3
/*     */     //   319: invokestatic glScalef : (FFF)V
/*     */     //   322: fconst_0
/*     */     //   323: fload #8
/*     */     //   325: fconst_0
/*     */     //   326: invokestatic glTranslatef : (FFF)V
/*     */     //   329: getstatic li/cil/oc/client/renderer/tileentity/RobotRenderer$.MODULE$ : Lli/cil/oc/client/renderer/tileentity/RobotRenderer$;
/*     */     //   332: aconst_null
/*     */     //   333: dload #6
/*     */     //   335: iconst_1
/*     */     //   336: invokevirtual renderChassis : (Lli/cil/oc/common/tileentity/Robot;DZ)V
/*     */     //   339: invokestatic glPopAttrib : ()V
/*     */     //   342: invokestatic glPopMatrix : ()V
/*     */     //   345: aload_0
/*     */     //   346: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   349: invokespecial rendering_$eq : (Lscala/Option;)V
/*     */     //   352: return
/*     */     //   353: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 0
/*     */     //   #51	-> 11
/*     */     //   #52	-> 37
/*     */     //   #54	-> 58
/*     */     //   #55	-> 69
/*     */     //   #56	-> 82
/*     */     //   #57	-> 94
/*     */     //   #59	-> 123
/*     */     //   #63	-> 149
/*     */     //   #64	-> 152
/*     */     //   #65	-> 157
/*     */     //   #66	-> 190
/*     */     //   #67	-> 205
/*     */     //   #68	-> 218
/*     */     //   #70	-> 241
/*     */     //   #71	-> 252
/*     */     //   #72	-> 266
/*     */     //   #69	-> 277
/*     */     //   #75	-> 280
/*     */     //   #76	-> 286
/*     */     //   #77	-> 292
/*     */     //   #78	-> 297
/*     */     //   #80	-> 304
/*     */     //   #82	-> 313
/*     */     //   #83	-> 322
/*     */     //   #85	-> 329
/*     */     //   #87	-> 339
/*     */     //   #88	-> 342
/*     */     //   #90	-> 345
/*     */     //   #51	-> 353
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	354	0	this	Lli/cil/oc/client/renderer/PetRenderer$;
/*     */     //   0	354	1	e	Lnet/minecraftforge/client/event/RenderPlayerEvent$Pre;
/*     */     //   11	341	2	uuid	Ljava/lang/String;
/*     */     //   69	283	3	worldTime	J
/*     */     //   82	270	5	timeJitter	I
/*     */     //   94	258	6	offset	D
/*     */     //   123	229	8	hover	F
/*     */     //   149	203	9	location	Lli/cil/oc/client/renderer/PetRenderer$PetLocation;
/*     */     //   205	75	11	localPos	Lnet/minecraft/util/Vec3;
/*     */     //   218	62	12	playerPos	Lnet/minecraft/util/Vec3;
/*     */     //   241	39	13	correction	D
/*     */   }
/*     */   
/*     */   public final class PetRenderer$$anon$1 implements Callable<PetRenderer.PetLocation> {
/*     */     private final RenderPlayerEvent.Pre e$1;
/*     */     
/*     */     public PetRenderer$$anon$1(RenderPlayerEvent.Pre e$1) {}
/*     */     
/*     */     public PetRenderer.PetLocation call() {
/*  60 */       return new PetRenderer.PetLocation((Entity)this.e$1.entityPlayer);
/*     */     }
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
/*     */   @SubscribeEvent(priority = EventPriority.LOWEST)
/*     */   public void onRobotRender(RobotRenderEvent e) {
/*  95 */     Option<Tuple3<Object, Object, Object>> option = rendering();
/*  96 */     if (option instanceof Some) { Some some = (Some)option; Tuple3 tuple3 = (Tuple3)some.x(); if (tuple3 != null) { double r = BoxesRunTime.unboxToDouble(tuple3._1()), g = BoxesRunTime.unboxToDouble(tuple3._2()), b = BoxesRunTime.unboxToDouble(tuple3._3()); GL11.glColor3d(r, g, b); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/*  97 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
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
/*     */   @SubscribeEvent
/*     */   public void tickStart(TickEvent.ClientTickEvent e)
/*     */   {
/* 151 */     petLocations().cleanUp();
/* 152 */     scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable(petLocations().asMap().values()).foreach((Function1)new PetRenderer$$anonfun$tickStart$1()); } public final class PetRenderer$$anonfun$tickStart$1 extends AbstractFunction1<PetRenderer.PetLocation, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(PetRenderer.PetLocation pet) {
/* 153 */       pet.update();
/*     */     } }
/*     */   private PetRenderer$() {
/* 156 */     MODULE$ = this;
/*     */     this.hidden = scala.collection.mutable.Set$.MODULE$.empty();
/*     */     this.isInitialized = false;
/*     */     (new scala.Tuple2[11])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("9f1f262f-0d68-4e13-9161-9eeaf4a0a1a8"), new Tuple3(BoxesRunTime.boxToDouble(0.3D), BoxesRunTime.boxToDouble(0.9D), BoxesRunTime.boxToDouble(0.6D)));
/*     */     (new scala.Tuple2[11])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("18f8bed4-f027-44af-8947-6a3a2317645a"), new Tuple3(BoxesRunTime.boxToDouble(1.0D), BoxesRunTime.boxToDouble(0.0D), BoxesRunTime.boxToDouble(0.0D)));
/*     */     (new scala.Tuple2[11])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("36123742-2cf6-4cfc-8b65-278581b3caeb"), new Tuple3(BoxesRunTime.boxToDouble(0.5D), BoxesRunTime.boxToDouble(0.7D), BoxesRunTime.boxToDouble(1.0D)));
/*     */     (new scala.Tuple2[11])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("2c0c214b-96f4-4565-b513-de90d5fbc977"), new Tuple3(BoxesRunTime.boxToDouble(1.0D), BoxesRunTime.boxToDouble(0.0D), BoxesRunTime.boxToDouble(0.0D)));
/*     */     (new scala.Tuple2[11])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("f3ba6ec8-c280-4950-bb08-1fcb2eab3a9c"), new Tuple3(BoxesRunTime.boxToDouble(0.18D), BoxesRunTime.boxToDouble(0.95D), BoxesRunTime.boxToDouble(0.922D)));
/*     */     (new scala.Tuple2[11])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("9d636bdd-b9f4-4b80-b9ce-586ca04bd4f3"), new Tuple3(BoxesRunTime.boxToDouble(0.8D), BoxesRunTime.boxToDouble(0.77D), BoxesRunTime.boxToDouble(0.75D)));
/*     */     (new scala.Tuple2[11])[6] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("23c7ed71-fb13-4abe-abe7-f355e1de6e62"), new Tuple3(BoxesRunTime.boxToDouble(0.3D), BoxesRunTime.boxToDouble(0.3D), BoxesRunTime.boxToDouble(1.0D)));
/*     */     (new scala.Tuple2[11])[7] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("076541f1-f10a-46de-a127-dfab8adfbb75"), new Tuple3(BoxesRunTime.boxToDouble(0.2D), BoxesRunTime.boxToDouble(1.0D), BoxesRunTime.boxToDouble(0.1D)));
/*     */     (new scala.Tuple2[11])[8] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("e7e90198-0ccf-4662-a827-192ec8f4419d"), new Tuple3(BoxesRunTime.boxToDouble(0.0D), BoxesRunTime.boxToDouble(0.2D), BoxesRunTime.boxToDouble(0.6D)));
/*     */     (new scala.Tuple2[11])[9] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("f514ee69-7bbb-4e46-9e94-d8176324cec2"), new Tuple3(BoxesRunTime.boxToDouble(0.098D), BoxesRunTime.boxToDouble(0.471D), BoxesRunTime.boxToDouble(0.784D)));
/*     */     (new scala.Tuple2[11])[10] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("f812c043-78ba-4324-82ae-e8f05c52ae6e"), new Tuple3(BoxesRunTime.boxToDouble(0.1D), BoxesRunTime.boxToDouble(0.8D), BoxesRunTime.boxToDouble(0.5D)));
/*     */     this.entitledPlayers = (Map<String, Tuple3<Object, Object, Object>>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[11]));
/*     */     this.petLocations = CacheBuilder.newBuilder().expireAfterAccess(5L, TimeUnit.SECONDS).build();
/*     */     this.rendering = (Option<Tuple3<Object, Object, Object>>)scala.None$.MODULE$;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\PetRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */