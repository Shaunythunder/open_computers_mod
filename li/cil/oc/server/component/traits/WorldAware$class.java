/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraftforge.common.util.FakePlayer;
/*    */ import net.minecraftforge.common.util.FakePlayerFactory;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import net.minecraftforge.event.ForgeEventFactory;
/*    */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.collection.mutable.Buffer$;
/*    */ import scala.reflect.ClassTag;
/*    */ import scala.reflect.package$;
/*    */ 
/*    */ public abstract class WorldAware$class {
/*    */   public static void $init$(WorldAware $this) {}
/*    */   
/*    */   public static World world(WorldAware $this) {
/* 30 */     return (World)$this.position().world().get();
/*    */   }
/*    */   public static EntityPlayer fakePlayer(WorldAware $this) {
/* 33 */     FakePlayer player = FakePlayerFactory.get((WorldServer)$this.world(), Settings$.MODULE$.get().fakePlayerProfile());
/* 34 */     ((Entity)player).field_70165_t = $this.position().x() + 0.5D;
/* 35 */     ((Entity)player).field_70163_u = $this.position().y() + 0.5D;
/* 36 */     ((Entity)player).field_70161_v = $this.position().z() + 0.5D;
/* 37 */     return (EntityPlayer)player;
/*    */   }
/*    */   
/*    */   public static boolean mayInteract(WorldAware $this, BlockPosition blockPos, ForgeDirection face) {
/*    */     try {
/* 42 */       PlayerInteractEvent event = ForgeEventFactory.onPlayerInteract($this.fakePlayer(), PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, blockPos.x(), blockPos.y(), blockPos.z(), face.ordinal(), $this.world());
/* 43 */       if (!event.isCanceled()) { Event.Result result = Event.Result.DENY; if (event.useBlock == null) { if (result != null); } else if (event.useBlock.equals(result))
/*    */         {  }
/*    */          }
/*    */     
/*    */     } finally {
/*    */       Exception exception = null;
/*    */     } 
/*    */   }
/*    */   public static Buffer entitiesInBounds(WorldAware $this, AxisAlignedBB bounds, ClassTag evidence$1) {
/* 52 */     return (Buffer)WrapAsScala$.MODULE$.asScalaBuffer($this.world().func_72872_a(package$.MODULE$.classTag(evidence$1).runtimeClass(), bounds)).map((Function1)new WorldAware$$anonfun$entitiesInBounds$1($this), Buffer$.MODULE$.canBuildFrom());
/*    */   }
/*    */   
/*    */   public static Buffer entitiesInBlock(WorldAware $this, BlockPosition blockPos, ClassTag<Entity> evidence$2) {
/* 56 */     return $this.entitiesInBounds(blockPos.bounds(), evidence$2);
/*    */   }
/*    */   
/*    */   public static Buffer entitiesOnSide(WorldAware $this, ForgeDirection side, ClassTag<Entity> evidence$3) {
/* 60 */     return $this.entitiesInBlock($this.position().offset(side), evidence$3);
/*    */   }
/*    */   
/*    */   public static Option closestEntity(WorldAware $this, ForgeDirection side, ClassTag evidence$4) {
/* 64 */     BlockPosition blockPos = $this.position().offset(side);
/* 65 */     return Option$.MODULE$.apply($this.world().func_72857_a(package$.MODULE$.classTag(evidence$4).runtimeClass(), blockPos.bounds(), (Entity)$this.fakePlayer())).map((Function1)new WorldAware$$anonfun$closestEntity$1($this));
/*    */   }
/*    */   
/*    */   public static Tuple2 blockContent(WorldAware $this, ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */     //   5: ldc net/minecraft/entity/Entity
/*    */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*    */     //   10: invokeinterface closestEntity : (Lnet/minecraftforge/common/util/ForgeDirection;Lscala/reflect/ClassTag;)Lscala/Option;
/*    */     //   15: astore_2
/*    */     //   16: aload_2
/*    */     //   17: instanceof scala/Some
/*    */     //   20: ifeq -> 87
/*    */     //   23: aload_2
/*    */     //   24: checkcast scala/Some
/*    */     //   27: astore_3
/*    */     //   28: aload_3
/*    */     //   29: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   32: instanceof net/minecraft/entity/EntityLivingBase
/*    */     //   35: ifeq -> 44
/*    */     //   38: iconst_1
/*    */     //   39: istore #4
/*    */     //   41: goto -> 63
/*    */     //   44: aload_3
/*    */     //   45: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   48: instanceof net/minecraft/entity/item/EntityMinecart
/*    */     //   51: ifeq -> 60
/*    */     //   54: iconst_1
/*    */     //   55: istore #4
/*    */     //   57: goto -> 63
/*    */     //   60: iconst_0
/*    */     //   61: istore #4
/*    */     //   63: iload #4
/*    */     //   65: ifeq -> 87
/*    */     //   68: new scala/Tuple2
/*    */     //   71: dup
/*    */     //   72: iconst_1
/*    */     //   73: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   76: ldc_w 'entity'
/*    */     //   79: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   82: astore #5
/*    */     //   84: goto -> 383
/*    */     //   87: aload_0
/*    */     //   88: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */     //   97: astore #6
/*    */     //   99: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   102: aload_0
/*    */     //   103: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   108: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   111: aload #6
/*    */     //   113: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*    */     //   116: astore #7
/*    */     //   118: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   121: aload_0
/*    */     //   122: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   127: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   130: aload #6
/*    */     //   132: invokevirtual getBlockMetadata : (Lli/cil/oc/util/BlockPosition;)I
/*    */     //   135: istore #8
/*    */     //   137: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*    */     //   140: aload #7
/*    */     //   142: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*    */     //   145: aload #6
/*    */     //   147: invokevirtual isAir : (Lli/cil/oc/util/BlockPosition;)Z
/*    */     //   150: ifeq -> 170
/*    */     //   153: new scala/Tuple2
/*    */     //   156: dup
/*    */     //   157: iconst_0
/*    */     //   158: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   161: ldc_w 'air'
/*    */     //   164: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   167: goto -> 381
/*    */     //   170: aload #7
/*    */     //   172: invokestatic lookupFluidForBlock : (Lnet/minecraft/block/Block;)Lnet/minecraftforge/fluids/Fluid;
/*    */     //   175: ifnonnull -> 314
/*    */     //   178: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*    */     //   181: aload #7
/*    */     //   183: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*    */     //   186: aload #6
/*    */     //   188: invokevirtual isReplaceable : (Lli/cil/oc/util/BlockPosition;)Z
/*    */     //   191: ifeq -> 264
/*    */     //   194: new net/minecraftforge/event/world/BlockEvent$BreakEvent
/*    */     //   197: dup
/*    */     //   198: aload #6
/*    */     //   200: invokevirtual x : ()I
/*    */     //   203: aload #6
/*    */     //   205: invokevirtual y : ()I
/*    */     //   208: aload #6
/*    */     //   210: invokevirtual z : ()I
/*    */     //   213: aload_0
/*    */     //   214: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   219: aload #7
/*    */     //   221: iload #8
/*    */     //   223: aload_0
/*    */     //   224: invokeinterface fakePlayer : ()Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   229: invokespecial <init> : (IIILnet/minecraft/world/World;Lnet/minecraft/block/Block;ILnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   232: astore #10
/*    */     //   234: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*    */     //   237: aload #10
/*    */     //   239: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*    */     //   242: pop
/*    */     //   243: new scala/Tuple2
/*    */     //   246: dup
/*    */     //   247: aload #10
/*    */     //   249: invokevirtual isCanceled : ()Z
/*    */     //   252: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   255: ldc_w 'replaceable'
/*    */     //   258: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   261: goto -> 381
/*    */     //   264: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*    */     //   267: aload #7
/*    */     //   269: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*    */     //   272: aload #6
/*    */     //   274: invokevirtual getCollisionBoundingBoxFromPool : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/util/AxisAlignedBB;
/*    */     //   277: ifnonnull -> 297
/*    */     //   280: new scala/Tuple2
/*    */     //   283: dup
/*    */     //   284: iconst_1
/*    */     //   285: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   288: ldc_w 'passable'
/*    */     //   291: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   294: goto -> 381
/*    */     //   297: new scala/Tuple2
/*    */     //   300: dup
/*    */     //   301: iconst_1
/*    */     //   302: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   305: ldc_w 'solid'
/*    */     //   308: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   311: goto -> 381
/*    */     //   314: new net/minecraftforge/event/world/BlockEvent$BreakEvent
/*    */     //   317: dup
/*    */     //   318: aload #6
/*    */     //   320: invokevirtual x : ()I
/*    */     //   323: aload #6
/*    */     //   325: invokevirtual y : ()I
/*    */     //   328: aload #6
/*    */     //   330: invokevirtual z : ()I
/*    */     //   333: aload_0
/*    */     //   334: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   339: aload #7
/*    */     //   341: iload #8
/*    */     //   343: aload_0
/*    */     //   344: invokeinterface fakePlayer : ()Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   349: invokespecial <init> : (IIILnet/minecraft/world/World;Lnet/minecraft/block/Block;ILnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   352: astore #9
/*    */     //   354: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*    */     //   357: aload #9
/*    */     //   359: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*    */     //   362: pop
/*    */     //   363: new scala/Tuple2
/*    */     //   366: dup
/*    */     //   367: aload #9
/*    */     //   369: invokevirtual isCanceled : ()Z
/*    */     //   372: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   375: ldc_w 'liquid'
/*    */     //   378: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   381: astore #5
/*    */     //   383: aload #5
/*    */     //   385: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #69	-> 0
/*    */     //   #70	-> 16
/*    */     //   #69	-> 28
/*    */     //   #70	-> 29
/*    */     //   #69	-> 44
/*    */     //   #70	-> 45
/*    */     //   #71	-> 68
/*    */     //   #73	-> 87
/*    */     //   #74	-> 99
/*    */     //   #75	-> 118
/*    */     //   #76	-> 137
/*    */     //   #77	-> 153
/*    */     //   #79	-> 170
/*    */     //   #84	-> 178
/*    */     //   #85	-> 194
/*    */     //   #86	-> 234
/*    */     //   #87	-> 243
/*    */     //   #89	-> 264
/*    */     //   #90	-> 280
/*    */     //   #93	-> 297
/*    */     //   #80	-> 314
/*    */     //   #81	-> 354
/*    */     //   #82	-> 363
/*    */     //   #72	-> 381
/*    */     //   #69	-> 383
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	386	0	$this	Lli/cil/oc/server/component/traits/WorldAware;
/*    */     //   0	386	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   99	287	6	blockPos	Lli/cil/oc/util/BlockPosition;
/*    */     //   118	268	7	block	Lnet/minecraft/block/Block;
/*    */     //   137	249	8	metadata	I
/*    */     //   234	27	10	event	Lnet/minecraftforge/event/world/BlockEvent$BreakEvent;
/*    */     //   354	27	9	event	Lnet/minecraftforge/event/world/BlockEvent$BreakEvent;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */