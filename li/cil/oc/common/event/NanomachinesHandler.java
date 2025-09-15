/*     */ package li.cil.oc.common.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.PlayerEvent;
/*     */ import li.cil.oc.api.Nanomachines;
/*     */ import li.cil.oc.api.nanomachines.Controller;
/*     */ import li.cil.oc.common.nanomachines.ControllerImpl;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.client.event.RenderGameOverlayEvent;
/*     */ import net.minecraftforge.event.entity.living.LivingEvent;
/*     */ import net.minecraftforge.event.entity.player.PlayerEvent;
/*     */ import scala.Function0;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.BoxedUnit;
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
/*     */ @ScalaSignature(bytes = "\006\001\005\005u!B\001\003\021\003i\021a\005(b]>l\027m\0315j]\026\034\b*\0318eY\026\024(BA\002\005\003\025)g/\0328u\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"a\005(b]>l\027m\0315j]\026\034\b*\0318eY\026\0248CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!D\004\0069=A\t!H\001\007\0072LWM\034;\021\005yyR\"A\b\007\013\001z\001\022A\021\003\r\rc\027.\0328u'\ty\"\003C\003\032?\021\0051\005F\001\036\021\025)s\004\"\001'\003MygNU3oI\026\024x)Y7f\037Z,'\017\\1z)\t9#\006\005\002\024Q%\021\021\006\006\002\005+:LG\017C\003,I\001\007A&A\001f!\ti\003H\004\002/m5\tqF\003\002\004a)\021\021GM\001\007G2LWM\034;\013\005M\"\024AD7j]\026\034'/\0314uM>\024x-\032\006\002k\005\031a.\032;\n\005]z\023A\006*f]\022,'oR1nK>3XM\0357bs\0263XM\034;\n\005eR$\001\002)pgRT!aN\030)\005\021b\004CA\037H\033\005q$BA A\0031)g/\0328uQ\006tG\r\\3s\025\t)\021I\003\002C\007\006\031a-\0347\013\005\021+\025\001B7pINT\021AR\001\004GB<\030B\001%?\0059\031VOY:de&\024W-\022<f]RDQAS\020\005\n-\013\001\002\032:boJ+7\r\036\013\tO1\0136+V,Z7\")Q*\023a\001\035\006\t\001\020\005\002\024\037&\021\001\013\006\002\004\023:$\b\"\002*J\001\004q\025!A=\t\013QK\005\031\001(\002\003]DQAV%A\0029\013\021\001\033\005\0061&\003\rAT\001\003i^DQAW%A\0029\013!\001\0365\t\017qK\005\023!a\001;\006!a-\0337m!\t\031b,\003\002`)\t1Ai\\;cY\026Dq!Y\020\022\002\023%!-\001\nee\006<(+Z2uI\021,g-Y;mi\022:T#A2+\005u#7&A3\021\005\031\\W\"A4\013\005!L\027!C;oG\",7m[3e\025\tQG#\001\006b]:|G/\031;j_:L!\001\\4\003#Ut7\r[3dW\026$g+\031:jC:\034WmB\003o\037!\005q.\001\004D_6lwN\034\t\003=A4Q!]\b\t\002I\024aaQ8n[>t7C\0019\023\021\025I\002\017\"\001u)\005y\007\"\002<q\t\0039\030aD8o!2\f\0270\032:SKN\004\030m\0368\025\005\035B\b\"B\026v\001\004I\bc\001>\002\0329\03110a\005\017\007q\fyAD\002~\003\033q1A`A\006\035\ry\030\021\002\b\005\003\003\t9!\004\002\002\004)\031\021Q\001\007\002\rq\022xn\034;?\023\0051\025B\001#F\023\t\0215)\003\002\006\003&\031\021\021\003!\002\023\035\fW.Z3wK:$\030\002BA\013\003/\t1\002\0257bs\026\024XI^3oi*\031\021\021\003!\n\t\005m\021Q\004\002\023!2\f\0270\032:SKN\004\030m\0368Fm\026tGO\003\003\002\026\005]\001FA;=\021\035\t\031\003\035C\001\003K\tab\0348MSZLgnZ+qI\006$X\rF\002(\003OAqaKA\021\001\004\tI\003\005\003\002,\005ub\002BA\027\003si!!a\f\013\t\005E\0221G\001\007Y&4\030N\\4\013\t\005U\022qG\001\007K:$\030\016^=\013\005\r\021\024\002BA\036\003_\t1\002T5wS:<WI^3oi&!\021qHA!\005Ea\025N^5oOV\003H-\031;f\013Z,g\016\036\006\005\003w\ty\003K\002\002\"qBq!a\022q\t\003\tI%\001\007p]Bc\027-_3s'\0064X\rF\002(\003\027BqaKA#\001\004\ti\005\005\003\002P\005ec\002BA)\003/j!!a\025\013\t\005U\0231G\001\007a2\f\0270\032:\n\t\005U\0211K\005\005\0037\niF\001\006TCZ,Gk\034$jY\026TA!!\006\002T!\032\021Q\t\037\t\017\005\r\004\017\"\001\002f\005aqN\034)mCf,'\017T8bIR\031q%a\032\t\017-\n\t\0071\001\002jA!\021qJA6\023\021\ti'!\030\003\0311{\027\r\032$s_64\025\016\\3)\007\005\005D\bC\004\002tA$\t!!\036\002%=t\007\013\\1zKJ$\025n]2p]:,7\r\036\013\004O\005]\004bB\026\002r\001\007\021\021\020\t\004u\006m\024\002BA?\003;\021A\003\0257bs\026\024Hj\\4hK\022|U\017^#wK:$\bfAA9y\001")
/*     */ public final class NanomachinesHandler
/*     */ {
/*     */   public static class Client$
/*     */   {
/*     */     public static final Client$ MODULE$;
/*     */     
/*     */     @SubscribeEvent
/*     */     public void onRenderGameOverlay(RenderGameOverlayEvent.Post e) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: getfield type : Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
/*     */       //   4: getstatic net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType.TEXT : Lnet/minecraftforge/client/event/RenderGameOverlayEvent$ElementType;
/*     */       //   7: astore_2
/*     */       //   8: dup
/*     */       //   9: ifnonnull -> 20
/*     */       //   12: pop
/*     */       //   13: aload_2
/*     */       //   14: ifnull -> 27
/*     */       //   17: goto -> 367
/*     */       //   20: aload_2
/*     */       //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   24: ifeq -> 367
/*     */       //   27: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   30: astore_3
/*     */       //   31: aload_3
/*     */       //   32: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */       //   35: invokestatic getController : (Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/api/nanomachines/Controller;
/*     */       //   38: astore #4
/*     */       //   40: aload #4
/*     */       //   42: ifnull -> 362
/*     */       //   45: aload #4
/*     */       //   47: astore #5
/*     */       //   49: new net/minecraft/client/gui/ScaledResolution
/*     */       //   52: dup
/*     */       //   53: aload_3
/*     */       //   54: aload_3
/*     */       //   55: getfield field_71443_c : I
/*     */       //   58: aload_3
/*     */       //   59: getfield field_71440_d : I
/*     */       //   62: invokespecial <init> : (Lnet/minecraft/client/Minecraft;II)V
/*     */       //   65: astore #7
/*     */       //   67: bipush #8
/*     */       //   69: istore #8
/*     */       //   71: bipush #12
/*     */       //   73: istore #9
/*     */       //   75: aload #7
/*     */       //   77: invokevirtual func_78326_a : ()I
/*     */       //   80: istore #10
/*     */       //   82: aload #7
/*     */       //   84: invokevirtual func_78328_b : ()I
/*     */       //   87: istore #11
/*     */       //   89: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   92: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   95: invokevirtual nanomachineHudPos : ()Lscala/Tuple2;
/*     */       //   98: astore #13
/*     */       //   100: aload #13
/*     */       //   102: ifnull -> 352
/*     */       //   105: aload #13
/*     */       //   107: invokevirtual _1$mcD$sp : ()D
/*     */       //   110: dstore #14
/*     */       //   112: aload #13
/*     */       //   114: invokevirtual _2$mcD$sp : ()D
/*     */       //   117: dstore #16
/*     */       //   119: new scala/Tuple2$mcDD$sp
/*     */       //   122: dup
/*     */       //   123: dload #14
/*     */       //   125: dload #16
/*     */       //   127: invokespecial <init> : (DD)V
/*     */       //   130: astore #18
/*     */       //   132: aload #18
/*     */       //   134: astore #12
/*     */       //   136: aload #12
/*     */       //   138: invokevirtual _1$mcD$sp : ()D
/*     */       //   141: dstore #19
/*     */       //   143: aload #12
/*     */       //   145: invokevirtual _2$mcD$sp : ()D
/*     */       //   148: dstore #21
/*     */       //   150: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */       //   153: iload #10
/*     */       //   155: iload #8
/*     */       //   157: isub
/*     */       //   158: i2d
/*     */       //   159: dload #19
/*     */       //   161: iconst_0
/*     */       //   162: i2d
/*     */       //   163: dcmpg
/*     */       //   164: ifge -> 181
/*     */       //   167: iload #10
/*     */       //   169: iconst_2
/*     */       //   170: idiv
/*     */       //   171: bipush #91
/*     */       //   173: isub
/*     */       //   174: bipush #12
/*     */       //   176: isub
/*     */       //   177: i2d
/*     */       //   178: goto -> 200
/*     */       //   181: dload #19
/*     */       //   183: iconst_1
/*     */       //   184: i2d
/*     */       //   185: dcmpg
/*     */       //   186: ifge -> 198
/*     */       //   189: iload #10
/*     */       //   191: i2d
/*     */       //   192: dload #19
/*     */       //   194: dmul
/*     */       //   195: goto -> 200
/*     */       //   198: dload #19
/*     */       //   200: invokevirtual min : (DD)D
/*     */       //   203: dstore #23
/*     */       //   205: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */       //   208: iload #11
/*     */       //   210: iload #9
/*     */       //   212: isub
/*     */       //   213: i2d
/*     */       //   214: dload #21
/*     */       //   216: iconst_0
/*     */       //   217: i2d
/*     */       //   218: dcmpg
/*     */       //   219: ifge -> 231
/*     */       //   222: iload #11
/*     */       //   224: bipush #39
/*     */       //   226: isub
/*     */       //   227: i2d
/*     */       //   228: goto -> 250
/*     */       //   231: dload #21
/*     */       //   233: iconst_1
/*     */       //   234: i2d
/*     */       //   235: dcmpg
/*     */       //   236: ifge -> 248
/*     */       //   239: dload #21
/*     */       //   241: iload #11
/*     */       //   243: i2d
/*     */       //   244: dmul
/*     */       //   245: goto -> 250
/*     */       //   248: dload #21
/*     */       //   250: invokevirtual min : (DD)D
/*     */       //   253: dstore #25
/*     */       //   255: aload #5
/*     */       //   257: invokeinterface getLocalBuffer : ()D
/*     */       //   262: aload #5
/*     */       //   264: invokeinterface getLocalBufferSize : ()D
/*     */       //   269: ddiv
/*     */       //   270: dstore #27
/*     */       //   272: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   275: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */       //   278: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */       //   281: invokevirtual overlayNanomachines : ()Lnet/minecraft/util/ResourceLocation;
/*     */       //   284: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */       //   287: aload_0
/*     */       //   288: dload #23
/*     */       //   290: d2i
/*     */       //   291: dload #25
/*     */       //   293: d2i
/*     */       //   294: iload #8
/*     */       //   296: iload #9
/*     */       //   298: iload #8
/*     */       //   300: iload #9
/*     */       //   302: aload_0
/*     */       //   303: invokespecial drawRect$default$7 : ()D
/*     */       //   306: invokespecial drawRect : (IIIIIID)V
/*     */       //   309: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   312: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */       //   315: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */       //   318: invokevirtual overlayNanomachinesBar : ()Lnet/minecraft/util/ResourceLocation;
/*     */       //   321: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */       //   324: aload_0
/*     */       //   325: dload #23
/*     */       //   327: d2i
/*     */       //   328: dload #25
/*     */       //   330: d2i
/*     */       //   331: iload #8
/*     */       //   333: iload #9
/*     */       //   335: iload #8
/*     */       //   337: iload #9
/*     */       //   339: dload #27
/*     */       //   341: invokespecial drawRect : (IIIIIID)V
/*     */       //   344: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   347: astore #6
/*     */       //   349: goto -> 367
/*     */       //   352: new scala/MatchError
/*     */       //   355: dup
/*     */       //   356: aload #13
/*     */       //   358: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   361: athrow
/*     */       //   362: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   365: astore #6
/*     */       //   367: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #31	-> 0
/*     */       //   #32	-> 27
/*     */       //   #33	-> 31
/*     */       //   #34	-> 40
/*     */       //   #35	-> 49
/*     */       //   #36	-> 67
/*     */       //   #37	-> 71
/*     */       //   #38	-> 75
/*     */       //   #39	-> 82
/*     */       //   #40	-> 89
/*     */       //   #42	-> 150
/*     */       //   #43	-> 159
/*     */       //   #44	-> 181
/*     */       //   #45	-> 198
/*     */       //   #42	-> 200
/*     */       //   #41	-> 203
/*     */       //   #47	-> 205
/*     */       //   #48	-> 214
/*     */       //   #49	-> 231
/*     */       //   #50	-> 248
/*     */       //   #47	-> 250
/*     */       //   #46	-> 253
/*     */       //   #51	-> 255
/*     */       //   #52	-> 272
/*     */       //   #53	-> 287
/*     */       //   #54	-> 309
/*     */       //   #55	-> 324
/*     */       //   #34	-> 347
/*     */       //   #40	-> 352
/*     */       //   #56	-> 362
/*     */       //   #31	-> 367
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	368	0	this	Lli/cil/oc/common/event/NanomachinesHandler$Client$;
/*     */       //   0	368	1	e	Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Post;
/*     */       //   31	337	3	mc	Lnet/minecraft/client/Minecraft;
/*     */       //   67	280	7	res	Lnet/minecraft/client/gui/ScaledResolution;
/*     */       //   71	276	8	sizeX	I
/*     */       //   75	272	9	sizeY	I
/*     */       //   82	265	10	width	I
/*     */       //   89	258	11	height	I
/*     */       //   112	256	14	x	D
/*     */       //   119	249	16	y	D
/*     */       //   143	204	19	x	D
/*     */       //   150	197	21	y	D
/*     */       //   205	142	23	left	D
/*     */       //   255	92	25	top	D
/*     */       //   272	75	27	fill	D
/*     */     }
/*     */     
/*     */     private double drawRect$default$7() {
/*  61 */       return 1.0D; } private void drawRect(int x, int y, int w, int h, int tw, int th, double fill) {
/*  62 */       float sx = 1.0F / tw;
/*  63 */       float sy = 1.0F / th;
/*  64 */       Tessellator t = Tessellator.field_78398_a;
/*  65 */       t.func_78382_b();
/*  66 */       t.func_78374_a(x, (y + h), 0.0D, 0.0D, (h * sy));
/*  67 */       t.func_78374_a((x + w), (y + h), 0.0D, (w * sx), (h * sy));
/*  68 */       t.func_78374_a((x + w), y + h * (true - fill), 0.0D, (w * sx), true - fill);
/*  69 */       t.func_78374_a(x, y + h * (true - fill), 0.0D, 0.0D, true - fill);
/*  70 */       t.func_78381_a();
/*     */     }
/*     */     
/*     */     public Client$() {
/*  74 */       MODULE$ = this;
/*     */     } } public static class Common$ { @SubscribeEvent
/*     */     public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent e) {
/*  77 */       Controller controller = Nanomachines.getController(e.player);
/*  78 */       if (controller != null) { Controller controller1 = controller; controller1.changeBuffer(-controller1.getLocalBuffer()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  79 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */     public static final Common$ MODULE$;
/*     */     @SubscribeEvent
/*     */     public void onLivingUpdate(LivingEvent.LivingUpdateEvent e) {
/*  85 */       Entity entity = e.entity;
/*  86 */       if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; Controller controller = Nanomachines.getController(entityPlayer);
/*  87 */         if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/*     */           
/*  89 */           controllerImpl.update();
/*     */ 
/*     */ 
/*     */           
/*  93 */           NBTTagCompound nbt = new NBTTagCompound();
/*  94 */           controllerImpl.save(nbt);
/*  95 */           Nanomachines.uninstallController(controllerImpl.player());
/*  96 */           Controller controller1 = Nanomachines.installController(entityPlayer);
/*  97 */           if (controller1 instanceof ControllerImpl) { ControllerImpl controllerImpl1 = (ControllerImpl)controller1;
/*  98 */             controllerImpl1.load(nbt);
/*  99 */             controllerImpl1.reset(); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/* 100 */           else { BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/*     */            BoxedUnit boxedUnit1 = (controllerImpl.player() == entityPlayer) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */         else
/* 103 */         { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */          BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 105 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
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
/*     */     @SubscribeEvent
/*     */     public void onPlayerSave(PlayerEvent.SaveToFile e) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'ocnm'
/*     */       //   3: invokevirtual getPlayerFile : (Ljava/lang/String;)Ljava/io/File;
/*     */       //   6: astore_2
/*     */       //   7: aload_1
/*     */       //   8: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   11: invokestatic getController : (Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/api/nanomachines/Controller;
/*     */       //   14: astore_3
/*     */       //   15: aload_3
/*     */       //   16: instanceof li/cil/oc/common/nanomachines/ControllerImpl
/*     */       //   19: ifeq -> 64
/*     */       //   22: aload_3
/*     */       //   23: checkcast li/cil/oc/common/nanomachines/ControllerImpl
/*     */       //   26: astore #4
/*     */       //   28: new net/minecraft/nbt/NBTTagCompound
/*     */       //   31: dup
/*     */       //   32: invokespecial <init> : ()V
/*     */       //   35: astore #7
/*     */       //   37: aload #4
/*     */       //   39: aload #7
/*     */       //   41: invokevirtual save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   44: new java/io/FileOutputStream
/*     */       //   47: dup
/*     */       //   48: aload_2
/*     */       //   49: invokespecial <init> : (Ljava/io/File;)V
/*     */       //   52: astore #8
/*     */       //   54: aload #7
/*     */       //   56: aload #8
/*     */       //   58: invokestatic func_74799_a : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/io/OutputStream;)V
/*     */       //   61: goto -> 89
/*     */       //   64: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   67: astore #5
/*     */       //   69: goto -> 122
/*     */       //   72: astore #9
/*     */       //   74: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   77: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   80: ldc 'Error saving nanomachine state.'
/*     */       //   82: aload #9
/*     */       //   84: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   89: aload #8
/*     */       //   91: invokevirtual close : ()V
/*     */       //   94: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   97: goto -> 120
/*     */       //   100: astore #6
/*     */       //   102: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   105: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   108: ldc 'Error saving nanomachine state.'
/*     */       //   110: aload #6
/*     */       //   112: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   117: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   120: astore #5
/*     */       //   122: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #111	-> 0
/*     */       //   #112	-> 7
/*     */       //   #113	-> 15
/*     */       //   #115	-> 28
/*     */       //   #116	-> 37
/*     */       //   #117	-> 44
/*     */       //   #118	-> 54
/*     */       //   #128	-> 64
/*     */       //   #119	-> 72
/*     */       //   #118	-> 72
/*     */       //   #120	-> 74
/*     */       //   #122	-> 89
/*     */       //   #125	-> 100
/*     */       //   #114	-> 100
/*     */       //   #126	-> 102
/*     */       //   #114	-> 120
/*     */       //   #110	-> 122
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	123	0	this	Lli/cil/oc/common/event/NanomachinesHandler$Common$;
/*     */       //   0	123	1	e	Lnet/minecraftforge/event/entity/player/PlayerEvent$SaveToFile;
/*     */       //   7	116	2	file	Ljava/io/File;
/*     */       //   37	60	7	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   54	43	8	fos	Ljava/io/FileOutputStream;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   28	64	100	finally
/*     */       //   54	64	72	finally
/*     */       //   72	100	100	finally
/*     */     }
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
/*     */     @SubscribeEvent
/*     */     public void onPlayerLoad(PlayerEvent.LoadFromFile e) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'ocnm'
/*     */       //   3: invokevirtual getPlayerFile : (Ljava/lang/String;)Ljava/io/File;
/*     */       //   6: astore_2
/*     */       //   7: aload_2
/*     */       //   8: invokevirtual exists : ()Z
/*     */       //   11: ifeq -> 116
/*     */       //   14: aload_1
/*     */       //   15: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   18: invokestatic getController : (Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/api/nanomachines/Controller;
/*     */       //   21: astore_3
/*     */       //   22: aload_3
/*     */       //   23: instanceof li/cil/oc/common/nanomachines/ControllerImpl
/*     */       //   26: ifeq -> 58
/*     */       //   29: aload_3
/*     */       //   30: checkcast li/cil/oc/common/nanomachines/ControllerImpl
/*     */       //   33: astore #4
/*     */       //   35: new java/io/FileInputStream
/*     */       //   38: dup
/*     */       //   39: aload_2
/*     */       //   40: invokespecial <init> : (Ljava/io/File;)V
/*     */       //   43: astore #7
/*     */       //   45: aload #4
/*     */       //   47: aload #7
/*     */       //   49: invokestatic func_74796_a : (Ljava/io/InputStream;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   52: invokevirtual load : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   55: goto -> 83
/*     */       //   58: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   61: astore #5
/*     */       //   63: goto -> 116
/*     */       //   66: astore #8
/*     */       //   68: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   71: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   74: ldc 'Error loading nanomachine state.'
/*     */       //   76: aload #8
/*     */       //   78: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   83: aload #7
/*     */       //   85: invokevirtual close : ()V
/*     */       //   88: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   91: goto -> 114
/*     */       //   94: astore #6
/*     */       //   96: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   99: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   102: ldc 'Error loading nanomachine state.'
/*     */       //   104: aload #6
/*     */       //   106: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   111: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   114: astore #5
/*     */       //   116: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #134	-> 0
/*     */       //   #135	-> 7
/*     */       //   #136	-> 14
/*     */       //   #137	-> 22
/*     */       //   #139	-> 35
/*     */       //   #140	-> 45
/*     */       //   #150	-> 58
/*     */       //   #141	-> 66
/*     */       //   #140	-> 66
/*     */       //   #142	-> 68
/*     */       //   #144	-> 83
/*     */       //   #147	-> 94
/*     */       //   #138	-> 94
/*     */       //   #148	-> 96
/*     */       //   #138	-> 114
/*     */       //   #133	-> 116
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	117	0	this	Lli/cil/oc/common/event/NanomachinesHandler$Common$;
/*     */       //   0	117	1	e	Lnet/minecraftforge/event/entity/player/PlayerEvent$LoadFromFile;
/*     */       //   7	110	2	file	Ljava/io/File;
/*     */       //   45	46	7	fis	Ljava/io/FileInputStream;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   35	58	94	finally
/*     */       //   45	58	66	finally
/*     */       //   66	94	94	finally
/*     */     }
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
/*     */     @SubscribeEvent
/*     */     public void onPlayerDisconnect(PlayerEvent.PlayerLoggedOutEvent e) {
/* 157 */       Controller controller = Nanomachines.getController(e.player);
/* 158 */       if (controller instanceof ControllerImpl)
/*     */       
/* 160 */       { li.cil.oc.common.EventHandler$.MODULE$.scheduleServer((Function0)new NanomachinesHandler$Common$$anonfun$onPlayerDisconnect$1(e)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 161 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     }
/*     */     
/*     */     public Common$() {
/* 166 */       MODULE$ = this;
/*     */     }
/*     */     
/*     */     public final class NanomachinesHandler$Common$$anonfun$onPlayerDisconnect$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final PlayerEvent.PlayerLoggedOutEvent e$1;
/*     */       
/*     */       public final void apply() {
/*     */         apply$mcV$sp();
/*     */       }
/*     */       
/*     */       public void apply$mcV$sp() {
/*     */         Nanomachines.uninstallController(this.e$1.player);
/*     */       }
/*     */       
/*     */       public NanomachinesHandler$Common$$anonfun$onPlayerDisconnect$1(PlayerEvent.PlayerLoggedOutEvent e$1) {}
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\NanomachinesHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */