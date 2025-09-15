/*     */ package li.cil.oc.common;
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.PlayerEvent;
/*     */ import java.util.Calendar;
/*     */ import java.util.List;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.component.RackMountable;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.internal.Server;
/*     */ import li.cil.oc.common.tileentity.Case;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import li.cil.oc.common.tileentity.traits.power.AppliedEnergistics2;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Classic;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Experimental;
/*     */ import li.cil.oc.server.component.Keyboard;
/*     */ import li.cil.oc.server.component.RedstoneWireless;
/*     */ import li.cil.oc.server.machine.Machine;
/*     */ import li.cil.oc.util.SideTracker;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.event.world.BlockEvent;
/*     */ import net.minecraftforge.event.world.ChunkEvent;
/*     */ import net.minecraftforge.event.world.WorldEvent;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class EventHandler$ {
/*     */   public static final EventHandler$ MODULE$;
/*     */   private final Buffer<Function0<BoxedUnit>> pendingServer;
/*     */   private final Buffer<Function0<BoxedUnit>> pendingClient;
/*     */   private final Set<Robot> runningRobots;
/*     */   private final Set<Keyboard> keyboards;
/*     */   private final Set<Machine> machines;
/*     */   private ItemInfo drone;
/*     */   
/*     */   private Buffer<Function0<BoxedUnit>> pendingServer() {
/*  56 */     return this.pendingServer;
/*     */   } private ItemInfo eeprom; private ItemInfo floppy; private ItemInfo mcu; private ItemInfo navigationUpgrade; private ItemInfo robot; private ItemInfo tablet; private volatile byte bitmap$0; private Buffer<Function0<BoxedUnit>> pendingClient() {
/*  58 */     return this.pendingClient;
/*     */   } private Set<Robot> runningRobots() {
/*  60 */     return this.runningRobots;
/*     */   } private Set<Keyboard> keyboards() {
/*  62 */     return this.keyboards;
/*     */   } private Set<Machine> machines() {
/*  64 */     return this.machines;
/*     */   } public void onRobotStart(Robot robot) {
/*  66 */     runningRobots().$plus$eq(robot);
/*     */   } public void onRobotStopped(Robot robot) {
/*  68 */     runningRobots().$minus$eq(robot);
/*     */   } public void addKeyboard(Keyboard keyboard) {
/*  70 */     scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(keyboards()).$plus$eq(keyboard);
/*     */   } public void scheduleClose(Machine machine) {
/*  72 */     machines().$plus$eq(machine);
/*     */   } public void unscheduleClose(Machine machine) {
/*  74 */     machines().$minus$eq(machine);
/*     */   }
/*     */   
/*  77 */   public void scheduleServer(TileEntity tileEntity) { if (SideTracker.isServer()) synchronized (pendingServer())
/*  78 */       { pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleServer$1(tileEntity)); return; }   } public final class EventHandler$$anonfun$scheduleServer$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final TileEntity tileEntity$1; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { Network.joinOrCreateNetwork(this.tileEntity$1); }
/*     */     
/*     */     public EventHandler$$anonfun$scheduleServer$1(TileEntity tileEntity$1) {} }
/*     */   
/*     */   public void scheduleServer(Function0 f) {
/*  83 */     synchronized (pendingServer()) {
/*  84 */       pendingServer().$plus$eq(f);
/*     */       return;
/*     */     } 
/*     */   }
/*     */   public void scheduleClient(Function0 f) {
/*  89 */     synchronized (pendingClient()) {
/*  90 */       pendingClient().$plus$eq(f);
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Method(modid = "ForgeMultipart")
/*  96 */   public void scheduleFMP(Function0 tileEntity) { if (SideTracker.isServer()) synchronized (pendingServer())
/*  97 */       { pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleFMP$1(tileEntity)); return; }   } public final class EventHandler$$anonfun$scheduleFMP$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final Function0 tileEntity$2; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { Network.joinOrCreateNetwork((TileEntity)this.tileEntity$2.apply()); }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleFMP$1(Function0 tileEntity$2) {} }
/*     */   
/*     */   @Method(modid = "appliedenergistics2")
/* 103 */   public void scheduleAE2Add(AppliedEnergistics2 tileEntity) { if (SideTracker.isServer()) synchronized (pendingServer())
/* 104 */       { pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleAE2Add$1(tileEntity)); return; }   } public final class EventHandler$$anonfun$scheduleAE2Add$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final AppliedEnergistics2 tileEntity$3; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!((TileEntity)this.tileEntity$3).func_145837_r())
/* 105 */         this.tileEntity$3.getGridNode(ForgeDirection.UNKNOWN).updateState();  }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleAE2Add$1(AppliedEnergistics2 tileEntity$3) {} }
/*     */ 
/*     */   
/*     */   @Method(modid = "IC2")
/* 112 */   public void scheduleIC2Add(IndustrialCraft2Experimental tileEntity) { if (SideTracker.isServer()) synchronized (pendingServer()) {
/* 113 */         BoxedUnit boxedUnit; IndustrialCraft2Experimental industrialCraft2Experimental = tileEntity;
/* 114 */         if (industrialCraft2Experimental instanceof IEnergyTile) { IndustrialCraft2Experimental industrialCraft2Experimental1 = industrialCraft2Experimental;
/* 115 */           Buffer buffer = pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleIC2Add$1(tileEntity, industrialCraft2Experimental1)); }
/*     */         
/*     */         else
/*     */         
/* 119 */         { boxedUnit = BoxedUnit.UNIT; }
/*     */          return;
/*     */       }   } public final class EventHandler$$anonfun$scheduleIC2Add$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IndustrialCraft2Experimental tileEntity$4; private final IndustrialCraft2Experimental x2$1; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!this.tileEntity$4.addedToIC2PowerGrid() && !((TileEntity)this.tileEntity$4).func_145837_r()) {
/*     */         MinecraftForge.EVENT_BUS.post((Event)new EnergyTileLoadEvent((IEnergyTile)this.x2$1)); this.tileEntity$4.addedToIC2PowerGrid_$eq(true);
/*     */       }  }
/*     */     public EventHandler$$anonfun$scheduleIC2Add$1(IndustrialCraft2Experimental tileEntity$4, IndustrialCraft2Experimental x2$1) {} }
/* 126 */   @Method(modid = "IC2-Classic") public void scheduleIC2Add(IndustrialCraft2Classic tileEntity) { if (SideTracker.isServer()) synchronized (pendingServer()) {
/* 127 */         BoxedUnit boxedUnit; IndustrialCraft2Classic industrialCraft2Classic = tileEntity;
/* 128 */         if (industrialCraft2Classic instanceof IEnergyTile) { IndustrialCraft2Classic industrialCraft2Classic1 = industrialCraft2Classic;
/* 129 */           Buffer buffer = pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleIC2Add$2(tileEntity, industrialCraft2Classic1)); }
/*     */         
/*     */         else
/*     */         
/* 133 */         { boxedUnit = BoxedUnit.UNIT; }
/*     */          return;
/*     */       }   } public final class EventHandler$$anonfun$scheduleIC2Add$2 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IndustrialCraft2Classic tileEntity$5; private final IndustrialCraft2Classic x2$2; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!this.tileEntity$5.addedToIC2PowerGrid() && !((TileEntity)this.tileEntity$5).func_145837_r()) { MinecraftForge.EVENT_BUS.post((Event)new EnergyTileLoadEvent((IEnergyTile)this.x2$2)); this.tileEntity$5.addedToIC2PowerGrid_$eq(true); }
/*     */        }
/*     */     public EventHandler$$anonfun$scheduleIC2Add$2(IndustrialCraft2Classic tileEntity$5, IndustrialCraft2Classic x2$2) {} }
/* 139 */   public void scheduleWirelessRedstone(RedstoneWireless rs) { if (SideTracker.isServer()) synchronized (pendingServer())
/* 140 */       { pendingServer().$plus$eq(new EventHandler$$anonfun$scheduleWirelessRedstone$1(rs)); return; }   } public final class EventHandler$$anonfun$scheduleWirelessRedstone$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$1; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (this.rs$1.node().network() != null) {
/* 141 */         li.cil.oc.integration.util.WirelessRedstone$.MODULE$.resetRedstone(this.rs$1);
/* 142 */         li.cil.oc.integration.util.WirelessRedstone$.MODULE$.addReceiver(this.rs$1);
/* 143 */         li.cil.oc.integration.util.WirelessRedstone$.MODULE$.updateOutput(this.rs$1);
/*     */       }  }
/*     */     
/*     */     public EventHandler$$anonfun$scheduleWirelessRedstone$1(RedstoneWireless rs$1) {} }
/*     */   @SubscribeEvent
/*     */   public Object onServerTick(TickEvent.ServerTickEvent e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield phase : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   4: getstatic cpw/mods/fml/common/gameevent/TickEvent$Phase.START : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   7: astore_2
/*     */     //   8: dup
/*     */     //   9: ifnonnull -> 20
/*     */     //   12: pop
/*     */     //   13: aload_2
/*     */     //   14: ifnull -> 27
/*     */     //   17: goto -> 138
/*     */     //   20: aload_2
/*     */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   24: ifeq -> 138
/*     */     //   27: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   30: aload_0
/*     */     //   31: invokespecial pendingServer : ()Lscala/collection/mutable/Buffer;
/*     */     //   34: dup
/*     */     //   35: astore_3
/*     */     //   36: monitorenter
/*     */     //   37: aload_0
/*     */     //   38: invokespecial pendingServer : ()Lscala/collection/mutable/Buffer;
/*     */     //   41: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   44: ldc_w scala/Function0
/*     */     //   47: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   50: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   55: checkcast [Lscala/Function0;
/*     */     //   58: astore #5
/*     */     //   60: aload_0
/*     */     //   61: invokespecial pendingServer : ()Lscala/collection/mutable/Buffer;
/*     */     //   64: invokeinterface clear : ()V
/*     */     //   69: aload #5
/*     */     //   71: astore #4
/*     */     //   73: aload_3
/*     */     //   74: monitorexit
/*     */     //   75: aload #4
/*     */     //   77: checkcast [Ljava/lang/Object;
/*     */     //   80: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   83: new li/cil/oc/common/EventHandler$$anonfun$onServerTick$1
/*     */     //   86: dup
/*     */     //   87: invokespecial <init> : ()V
/*     */     //   90: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   95: getstatic scala/collection/mutable/ArrayBuffer$.MODULE$ : Lscala/collection/mutable/ArrayBuffer$;
/*     */     //   98: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   101: checkcast scala/collection/mutable/ArrayBuffer
/*     */     //   104: astore #6
/*     */     //   106: aload_0
/*     */     //   107: invokespecial runningRobots : ()Lscala/collection/mutable/Set;
/*     */     //   110: new li/cil/oc/common/EventHandler$$anonfun$onServerTick$2
/*     */     //   113: dup
/*     */     //   114: aload #6
/*     */     //   116: invokespecial <init> : (Lscala/collection/mutable/ArrayBuffer;)V
/*     */     //   119: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   124: aload_0
/*     */     //   125: invokespecial runningRobots : ()Lscala/collection/mutable/Set;
/*     */     //   128: aload #6
/*     */     //   130: invokeinterface $minus$minus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/generic/Shrinkable;
/*     */     //   135: goto -> 214
/*     */     //   138: aload_1
/*     */     //   139: getfield phase : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   142: getstatic cpw/mods/fml/common/gameevent/TickEvent$Phase.END : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   145: astore #7
/*     */     //   147: dup
/*     */     //   148: ifnonnull -> 160
/*     */     //   151: pop
/*     */     //   152: aload #7
/*     */     //   154: ifnull -> 168
/*     */     //   157: goto -> 211
/*     */     //   160: aload #7
/*     */     //   162: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 211
/*     */     //   168: getstatic scala/collection/mutable/ArrayBuffer$.MODULE$ : Lscala/collection/mutable/ArrayBuffer$;
/*     */     //   171: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   174: checkcast scala/collection/mutable/ArrayBuffer
/*     */     //   177: astore #8
/*     */     //   179: aload_0
/*     */     //   180: invokespecial machines : ()Lscala/collection/mutable/Set;
/*     */     //   183: new li/cil/oc/common/EventHandler$$anonfun$onServerTick$3
/*     */     //   186: dup
/*     */     //   187: aload #8
/*     */     //   189: invokespecial <init> : (Lscala/collection/mutable/ArrayBuffer;)V
/*     */     //   192: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   197: aload_0
/*     */     //   198: invokespecial machines : ()Lscala/collection/mutable/Set;
/*     */     //   201: aload #8
/*     */     //   203: invokeinterface $minus$minus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/generic/Shrinkable;
/*     */     //   208: goto -> 214
/*     */     //   211: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   214: areturn
/*     */     //   215: aload_3
/*     */     //   216: monitorexit
/*     */     //   217: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 0
/*     */     //   #150	-> 27
/*     */     //   #151	-> 37
/*     */     //   #152	-> 60
/*     */     //   #153	-> 69
/*     */     //   #150	-> 74
/*     */     //   #154	-> 83
/*     */     //   #160	-> 95
/*     */     //   #161	-> 106
/*     */     //   #165	-> 124
/*     */     //   #167	-> 138
/*     */     //   #169	-> 168
/*     */     //   #170	-> 179
/*     */     //   #176	-> 197
/*     */     //   #167	-> 211
/*     */     //   #149	-> 214
/*     */     //   #150	-> 215
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	218	0	this	Lli/cil/oc/common/EventHandler$;
/*     */     //   0	218	1	e	Lcpw/mods/fml/common/gameevent/TickEvent$ServerTickEvent;
/*     */     //   60	11	5	adds	[Lscala/Function0;
/*     */     //   106	29	6	invalid	Lscala/collection/mutable/ArrayBuffer;
/*     */     //   179	29	8	closed	Lscala/collection/mutable/ArrayBuffer;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	75	215	finally
/*     */   }
/*     */   public final class EventHandler$$anonfun$onServerTick$1 extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Function0 callback) {
/*     */       
/* 155 */       try { callback.apply$mcV$sp(); }
/* 156 */       finally { Exception exception = null; }
/*     */     
/*     */     } }
/*     */   public final class EventHandler$$anonfun$onServerTick$2 extends AbstractFunction1<Robot, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer invalid$1;
/*     */     public EventHandler$$anonfun$onServerTick$2(ArrayBuffer invalid$1) {}
/*     */     
/*     */     public final Object apply(Robot robot) {
/* 163 */       robot.machine().update(); return robot.func_145837_r() ? this.invalid$1.$plus$eq(robot) : ((robot.world() == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT);
/*     */     } }
/*     */   
/*     */   public final class EventHandler$$anonfun$onServerTick$3 extends AbstractFunction1<Machine, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ArrayBuffer closed$1;
/*     */     
/*     */     public final void apply(Machine machine) {
/* 170 */       if (machine.tryClose()) {
/* 171 */         this.closed$1.$plus$eq(machine);
/* 172 */         if ((machine.host().world() == null || !li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(machine.host().world()).blockExists(li.cil.oc.util.BlockPosition$.MODULE$.apply((EnvironmentHost)machine.host()))) && 
/* 173 */           machine.node() != null) machine.node().remove(); 
/*     */       } 
/*     */     }
/*     */     public EventHandler$$anonfun$onServerTick$3(ArrayBuffer closed$1) {} }
/*     */   @SubscribeEvent
/*     */   public void onClientTick(TickEvent.ClientTickEvent e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield phase : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   4: getstatic cpw/mods/fml/common/gameevent/TickEvent$Phase.START : Lcpw/mods/fml/common/gameevent/TickEvent$Phase;
/*     */     //   7: astore_2
/*     */     //   8: dup
/*     */     //   9: ifnonnull -> 20
/*     */     //   12: pop
/*     */     //   13: aload_2
/*     */     //   14: ifnull -> 27
/*     */     //   17: goto -> 95
/*     */     //   20: aload_2
/*     */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   24: ifeq -> 95
/*     */     //   27: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   30: aload_0
/*     */     //   31: invokespecial pendingClient : ()Lscala/collection/mutable/Buffer;
/*     */     //   34: dup
/*     */     //   35: astore_3
/*     */     //   36: monitorenter
/*     */     //   37: aload_0
/*     */     //   38: invokespecial pendingClient : ()Lscala/collection/mutable/Buffer;
/*     */     //   41: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   44: ldc_w scala/Function0
/*     */     //   47: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   50: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   55: checkcast [Lscala/Function0;
/*     */     //   58: astore #5
/*     */     //   60: aload_0
/*     */     //   61: invokespecial pendingClient : ()Lscala/collection/mutable/Buffer;
/*     */     //   64: invokeinterface clear : ()V
/*     */     //   69: aload #5
/*     */     //   71: astore #4
/*     */     //   73: aload_3
/*     */     //   74: monitorexit
/*     */     //   75: aload #4
/*     */     //   77: checkcast [Ljava/lang/Object;
/*     */     //   80: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   83: new li/cil/oc/common/EventHandler$$anonfun$onClientTick$1
/*     */     //   86: dup
/*     */     //   87: invokespecial <init> : ()V
/*     */     //   90: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   95: return
/*     */     //   96: aload_3
/*     */     //   97: monitorexit
/*     */     //   98: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #180	-> 0
/*     */     //   #181	-> 27
/*     */     //   #182	-> 37
/*     */     //   #183	-> 60
/*     */     //   #184	-> 69
/*     */     //   #181	-> 74
/*     */     //   #185	-> 83
/*     */     //   #180	-> 95
/*     */     //   #181	-> 96
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	99	0	this	Lli/cil/oc/common/EventHandler$;
/*     */     //   0	99	1	e	Lcpw/mods/fml/common/gameevent/TickEvent$ClientTickEvent;
/*     */     //   60	11	5	adds	[Lscala/Function0;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	75	96	finally
/*     */   }
/*     */   
/*     */   public final class EventHandler$$anonfun$onClientTick$1 extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Function0 callback) {
/*     */       
/* 186 */       try { callback.apply$mcV$sp(); }
/* 187 */       finally { Exception exception = null; }
/*     */     
/*     */     } }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void playerLoggedIn(PlayerEvent.PlayerLoggedInEvent e) {
/* 194 */     if (SideTracker.isServer()) { EntityPlayer entityPlayer = e.player;
/* 195 */       if (entityPlayer instanceof net.minecraftforge.common.util.FakePlayer) { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 196 */       else if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
/* 197 */         if (!li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.isAvailable() && !li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.luajRequested()) {
/* 198 */           entityPlayerMP.func_145747_a(li.cil.oc.Localization$Chat$.MODULE$.WarningLuaFallback());
/*     */         }
/* 200 */         if (ClassTransformer$.MODULE$.hadErrors()) {
/* 201 */           entityPlayerMP.func_145747_a(li.cil.oc.Localization$Chat$.MODULE$.WarningClassTransformer());
/*     */         }
/* 203 */         if (ClassTransformer$.MODULE$.hadSimpleComponentErrors()) {
/* 204 */           entityPlayerMP.func_145747_a(li.cil.oc.Localization$Chat$.MODULE$.WarningSimpleComponent());
/*     */         }
/* 206 */         li.cil.oc.server.PacketSender$.MODULE$.sendPetVisibility((Option)scala.None$.MODULE$, (Option)new Some(entityPlayerMP));
/* 207 */         li.cil.oc.server.PacketSender$.MODULE$.sendLootDisks(entityPlayerMP); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 208 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/* 214 */   public void clientLoggedIn(FMLNetworkEvent.ClientConnectedToServerEvent e) { li.cil.oc.client.renderer.PetRenderer$.MODULE$.isInitialized_$eq(false);
/* 215 */     li.cil.oc.client.renderer.PetRenderer$.MODULE$.hidden().clear();
/* 216 */     Loot$.MODULE$.disksForClient().clear();
/* 217 */     Loot$.MODULE$.disksForCyclingClient().clear();
/*     */     
/* 219 */     li.cil.oc.client.Sound$.MODULE$.startLoop(null, "computer_running", 0.0F, 0L);
/* 220 */     scheduleServer((Function0<BoxedUnit>)new EventHandler$$anonfun$clientLoggedIn$1()); } public final class EventHandler$$anonfun$clientLoggedIn$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { li.cil.oc.client.Sound$.MODULE$.stopLoop(null); }
/*     */      }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onBlockBreak(BlockEvent.BreakEvent e) {
/* 225 */     TileEntity tileEntity = e.world.func_147438_o(e.x, e.y, e.z);
/* 226 */     if (tileEntity instanceof Case) { Case case_ = (Case)tileEntity;
/*     */       
/* 228 */       e.setCanceled(true); BoxedUnit boxedUnit = (case_.isCreative() && (!(e.getPlayer()).field_71075_bZ.field_75098_d || !case_.canInteract(e.getPlayer().func_70005_c_()))) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     
/* 230 */     else if (tileEntity instanceof RobotProxy) { RobotProxy robotProxy = (RobotProxy)tileEntity;
/* 231 */       Robot robot = robotProxy.robot();
/*     */       
/* 233 */       e.setCanceled(true); BoxedUnit boxedUnit = (robot.isCreative() && (!(e.getPlayer()).field_71075_bZ.field_75098_d || !robot.canInteract(e.getPlayer().func_70005_c_()))) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/* 235 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent e) {
/* 241 */     scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(keyboards()).foreach((Function1)new EventHandler$$anonfun$onPlayerRespawn$1(e)); } public final class EventHandler$$anonfun$onPlayerRespawn$1 extends AbstractFunction1<Keyboard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.PlayerRespawnEvent e$1; public final void apply(Keyboard x$1) { x$1.releasePressedKeys(this.e$1.player); }
/*     */     
/*     */     public EventHandler$$anonfun$onPlayerRespawn$1(PlayerEvent.PlayerRespawnEvent e$1) {} }
/*     */   
/*     */   @SubscribeEvent
/* 246 */   public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent e) { scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(keyboards()).foreach((Function1)new EventHandler$$anonfun$onPlayerChangedDimension$1(e)); } public final class EventHandler$$anonfun$onPlayerChangedDimension$1 extends AbstractFunction1<Keyboard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.PlayerChangedDimensionEvent e$2; public final void apply(Keyboard x$2) { x$2.releasePressedKeys(this.e$2.player); }
/*     */     
/*     */     public EventHandler$$anonfun$onPlayerChangedDimension$1(PlayerEvent.PlayerChangedDimensionEvent e$2) {} }
/*     */   
/*     */   @SubscribeEvent
/* 251 */   public void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent e) { scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(keyboards()).foreach((Function1)new EventHandler$$anonfun$onPlayerLogout$1(e)); } public final class EventHandler$$anonfun$onPlayerLogout$1 extends AbstractFunction1<Keyboard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.PlayerLoggedOutEvent e$3; public final void apply(Keyboard x$3) { x$3.releasePressedKeys(this.e$3.player); }
/*     */     
/*     */     public EventHandler$$anonfun$onPlayerLogout$1(PlayerEvent.PlayerLoggedOutEvent e$3) {} }
/*     */   @SubscribeEvent
/*     */   public void onEntityJoinWorld(EntityJoinWorldEvent e) {
/* 256 */     if (li.cil.oc.Settings$.MODULE$.get().giveManualToNewPlayers() && !e.world.field_72995_K) { Entity entity = e.entity;
/* 257 */       if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; if (!(entityPlayer instanceof net.minecraftforge.common.util.FakePlayer)) {
/* 258 */           NBTTagCompound persistedData = li.cil.oc.util.PlayerUtils$.MODULE$.persistedData(entityPlayer);
/*     */           
/* 260 */           persistedData.func_74757_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("receivedManual").toString(), true);
/* 261 */           entityPlayer.field_71071_by.func_70441_a(Items.get("manual").createItemStack(1)); BoxedUnit boxedUnit1 = persistedData.func_74767_n((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("receivedManual").toString()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*     */         }  }
/* 263 */        BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 267 */   private ItemInfo drone$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.drone = Items.get("drone"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.drone; }  } public ItemInfo drone() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? drone$lzycompute() : this.drone; }
/* 268 */   private ItemInfo eeprom$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.eeprom = Items.get("eeprom"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.eeprom; }  } public ItemInfo eeprom() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? eeprom$lzycompute() : this.eeprom; }
/* 269 */   private ItemInfo floppy$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.floppy = Items.get("floppy"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.floppy; }  } public ItemInfo floppy() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? floppy$lzycompute() : this.floppy; }
/* 270 */   private ItemInfo mcu$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.mcu = Items.get("microcontroller"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return this.mcu; }  } public ItemInfo mcu() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? mcu$lzycompute() : this.mcu; }
/* 271 */   private ItemInfo navigationUpgrade$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x10) == 0) { this.navigationUpgrade = Items.get("navigationUpgrade"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x10); }  return this.navigationUpgrade; }  } public ItemInfo navigationUpgrade() { return ((byte)(this.bitmap$0 & 0x10) == 0) ? navigationUpgrade$lzycompute() : this.navigationUpgrade; }
/* 272 */   private ItemInfo robot$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x20) == 0) { this.robot = Items.get("robot"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x20); }  return this.robot; }  } public ItemInfo robot() { return ((byte)(this.bitmap$0 & 0x20) == 0) ? robot$lzycompute() : this.robot; }
/* 273 */   private ItemInfo tablet$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x40) == 0) { this.tablet = Items.get("tablet"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x40); }  return this.tablet; }  } public ItemInfo tablet() { return ((byte)(this.bitmap$0 & 0x40) == 0) ? tablet$lzycompute() : this.tablet; }
/*     */    @SubscribeEvent
/*     */   public void onCrafting(PlayerEvent.ItemCraftedEvent e) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_2
/*     */     //   2: aload_0
/*     */     //   3: aload_1
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual navigationUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   8: new li/cil/oc/common/EventHandler$$anonfun$onCrafting$1
/*     */     //   11: dup
/*     */     //   12: aload_1
/*     */     //   13: invokespecial <init> : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;)V
/*     */     //   16: invokespecial recraft : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)Z
/*     */     //   19: ifne -> 26
/*     */     //   22: iload_2
/*     */     //   23: ifeq -> 30
/*     */     //   26: iconst_1
/*     */     //   27: goto -> 31
/*     */     //   30: iconst_0
/*     */     //   31: istore_2
/*     */     //   32: aload_0
/*     */     //   33: aload_1
/*     */     //   34: aload_0
/*     */     //   35: invokevirtual mcu : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   38: new li/cil/oc/common/EventHandler$$anonfun$onCrafting$2
/*     */     //   41: dup
/*     */     //   42: invokespecial <init> : ()V
/*     */     //   45: invokespecial recraft : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)Z
/*     */     //   48: ifne -> 55
/*     */     //   51: iload_2
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_1
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_0
/*     */     //   60: istore_2
/*     */     //   61: aload_0
/*     */     //   62: aload_1
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual drone : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   67: new li/cil/oc/common/EventHandler$$anonfun$onCrafting$3
/*     */     //   70: dup
/*     */     //   71: invokespecial <init> : ()V
/*     */     //   74: invokespecial recraft : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)Z
/*     */     //   77: ifne -> 84
/*     */     //   80: iload_2
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: istore_2
/*     */     //   90: aload_0
/*     */     //   91: aload_1
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual robot : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   96: new li/cil/oc/common/EventHandler$$anonfun$onCrafting$4
/*     */     //   99: dup
/*     */     //   100: invokespecial <init> : ()V
/*     */     //   103: invokespecial recraft : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)Z
/*     */     //   106: ifne -> 113
/*     */     //   109: iload_2
/*     */     //   110: ifeq -> 117
/*     */     //   113: iconst_1
/*     */     //   114: goto -> 118
/*     */     //   117: iconst_0
/*     */     //   118: istore_2
/*     */     //   119: aload_0
/*     */     //   120: aload_1
/*     */     //   121: aload_0
/*     */     //   122: invokevirtual tablet : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   125: new li/cil/oc/common/EventHandler$$anonfun$onCrafting$5
/*     */     //   128: dup
/*     */     //   129: invokespecial <init> : ()V
/*     */     //   132: invokespecial recraft : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)Z
/*     */     //   135: ifne -> 142
/*     */     //   138: iload_2
/*     */     //   139: ifeq -> 146
/*     */     //   142: iconst_1
/*     */     //   143: goto -> 147
/*     */     //   146: iconst_0
/*     */     //   147: istore_2
/*     */     //   148: getstatic li/cil/oc/common/Loot$.MODULE$ : Lli/cil/oc/common/Loot$;
/*     */     //   151: aload_1
/*     */     //   152: getfield crafting : Lnet/minecraft/item/ItemStack;
/*     */     //   155: invokevirtual isLootDisk : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   158: ifeq -> 306
/*     */     //   161: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   164: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   167: iconst_0
/*     */     //   168: invokevirtual intWrapper : (I)I
/*     */     //   171: aload_1
/*     */     //   172: getfield craftMatrix : Lnet/minecraft/inventory/IInventory;
/*     */     //   175: invokeinterface func_70302_i_ : ()I
/*     */     //   180: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*     */     //   183: new li/cil/oc/common/EventHandler$$anonfun$1
/*     */     //   186: dup
/*     */     //   187: aload_1
/*     */     //   188: invokespecial <init> : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;)V
/*     */     //   191: getstatic scala/collection/immutable/IndexedSeq$.MODULE$ : Lscala/collection/immutable/IndexedSeq$;
/*     */     //   194: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   197: invokevirtual flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   200: checkcast scala/collection/TraversableOnce
/*     */     //   203: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   206: ldc_w net/minecraft/item/ItemStack
/*     */     //   209: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   212: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   217: checkcast [Lnet/minecraft/item/ItemStack;
/*     */     //   220: astore_3
/*     */     //   221: aload_3
/*     */     //   222: arraylength
/*     */     //   223: iconst_2
/*     */     //   224: if_icmpne -> 302
/*     */     //   227: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   230: aload_3
/*     */     //   231: checkcast [Ljava/lang/Object;
/*     */     //   234: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   237: new li/cil/oc/common/EventHandler$$anonfun$2
/*     */     //   240: dup
/*     */     //   241: invokespecial <init> : ()V
/*     */     //   244: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   249: astore #4
/*     */     //   251: aload #4
/*     */     //   253: instanceof scala/Some
/*     */     //   256: ifeq -> 294
/*     */     //   259: aload #4
/*     */     //   261: checkcast scala/Some
/*     */     //   264: astore #5
/*     */     //   266: aload #5
/*     */     //   268: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   271: checkcast net/minecraft/item/ItemStack
/*     */     //   274: astore #6
/*     */     //   276: aload #6
/*     */     //   278: aload #6
/*     */     //   280: getfield field_77994_a : I
/*     */     //   283: iconst_1
/*     */     //   284: iadd
/*     */     //   285: putfield field_77994_a : I
/*     */     //   288: iconst_1
/*     */     //   289: istore #7
/*     */     //   291: goto -> 297
/*     */     //   294: iload_2
/*     */     //   295: istore #7
/*     */     //   297: iload #7
/*     */     //   299: goto -> 307
/*     */     //   302: iload_2
/*     */     //   303: goto -> 307
/*     */     //   306: iload_2
/*     */     //   307: istore_2
/*     */     //   308: aload_1
/*     */     //   309: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   312: astore #8
/*     */     //   314: aload #8
/*     */     //   316: instanceof net/minecraftforge/common/util/FakePlayer
/*     */     //   319: ifeq -> 330
/*     */     //   322: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   325: astore #9
/*     */     //   327: goto -> 496
/*     */     //   330: aload #8
/*     */     //   332: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   335: ifeq -> 491
/*     */     //   338: aload #8
/*     */     //   340: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   343: astore #10
/*     */     //   345: aload #10
/*     */     //   347: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   350: ifnull -> 491
/*     */     //   353: aload #10
/*     */     //   355: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   358: getfield field_72995_K : Z
/*     */     //   361: ifne -> 491
/*     */     //   364: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   367: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   370: invokevirtual presentChance : ()D
/*     */     //   373: iconst_0
/*     */     //   374: i2d
/*     */     //   375: dcmpl
/*     */     //   376: ifle -> 483
/*     */     //   379: iload_2
/*     */     //   380: ifne -> 483
/*     */     //   383: aload_1
/*     */     //   384: getfield crafting : Lnet/minecraft/item/ItemStack;
/*     */     //   387: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   390: ifnull -> 483
/*     */     //   393: aload_1
/*     */     //   394: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   397: invokevirtual func_70681_au : ()Ljava/util/Random;
/*     */     //   400: invokevirtual nextFloat : ()F
/*     */     //   403: f2d
/*     */     //   404: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   407: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   410: invokevirtual presentChance : ()D
/*     */     //   413: dcmpg
/*     */     //   414: ifge -> 483
/*     */     //   417: aload_0
/*     */     //   418: invokespecial timeForPresents : ()Z
/*     */     //   421: ifeq -> 483
/*     */     //   424: ldc_w 'present'
/*     */     //   427: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   430: iconst_1
/*     */     //   431: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   436: astore #11
/*     */     //   438: aload_1
/*     */     //   439: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   442: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   445: aload_1
/*     */     //   446: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   449: ldc_w 'note.pling'
/*     */     //   452: ldc_w 0.2
/*     */     //   455: fconst_1
/*     */     //   456: invokevirtual func_72956_a : (Lnet/minecraft/entity/Entity;Ljava/lang/String;FF)V
/*     */     //   459: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   462: aload #11
/*     */     //   464: aload_1
/*     */     //   465: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   468: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   471: invokevirtual addToPlayerInventory$default$3 : ()Z
/*     */     //   474: invokevirtual addToPlayerInventory : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Z)V
/*     */     //   477: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   480: goto -> 486
/*     */     //   483: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   486: astore #9
/*     */     //   488: goto -> 496
/*     */     //   491: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   494: astore #9
/*     */     //   496: getstatic li/cil/oc/common/Achievement$.MODULE$ : Lli/cil/oc/common/Achievement$;
/*     */     //   499: aload_1
/*     */     //   500: getfield crafting : Lnet/minecraft/item/ItemStack;
/*     */     //   503: aload_1
/*     */     //   504: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   507: invokevirtual onCraft : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   510: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #277	-> 0
/*     */     //   #279	-> 2
/*     */     //   #285	-> 22
/*     */     //   #279	-> 31
/*     */     //   #287	-> 32
/*     */     //   #290	-> 51
/*     */     //   #287	-> 60
/*     */     //   #292	-> 61
/*     */     //   #295	-> 80
/*     */     //   #292	-> 89
/*     */     //   #297	-> 90
/*     */     //   #300	-> 109
/*     */     //   #297	-> 118
/*     */     //   #302	-> 119
/*     */     //   #305	-> 138
/*     */     //   #302	-> 147
/*     */     //   #308	-> 148
/*     */     //   #309	-> 164
/*     */     //   #310	-> 221
/*     */     //   #311	-> 251
/*     */     //   #312	-> 276
/*     */     //   #313	-> 288
/*     */     //   #311	-> 289
/*     */     //   #314	-> 294
/*     */     //   #310	-> 297
/*     */     //   #316	-> 302
/*     */     //   #318	-> 306
/*     */     //   #307	-> 307
/*     */     //   #322	-> 308
/*     */     //   #323	-> 314
/*     */     //   #324	-> 330
/*     */     //   #326	-> 364
/*     */     //   #327	-> 393
/*     */     //   #329	-> 424
/*     */     //   #330	-> 438
/*     */     //   #331	-> 459
/*     */     //   #326	-> 483
/*     */     //   #333	-> 491
/*     */     //   #336	-> 496
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	511	0	this	Lli/cil/oc/common/EventHandler$;
/*     */     //   0	511	1	e	Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;
/*     */     //   2	508	2	didRecraft	Z
/*     */     //   221	290	3	stacks	[Lnet/minecraft/item/ItemStack;
/*     */     //   276	235	6	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   438	42	11	present	Lnet/minecraft/item/ItemStack;
/*     */   } public final class EventHandler$$anonfun$onCrafting$1 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.ItemCraftedEvent e$4;
/*     */     public EventHandler$$anonfun$onCrafting$1(PlayerEvent.ItemCraftedEvent e$4) {}
/*     */     public final Option<ItemStack> apply(ItemStack stack) {
/*     */       scala.None$ none$;
/* 281 */       Option option = scala.Option$.MODULE$.apply(Driver.driverFor(this.e$4.crafting));
/* 282 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); Option option1 = scala.Option$.MODULE$.apply(ItemStack.func_77949_a(driver.dataTag(stack).func_74775_l((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("map").toString()))); }
/* 283 */       else { none$ = scala.None$.MODULE$; }
/*     */       
/*     */       return (Option<ItemStack>)none$;
/*     */     } }
/*     */   public final class EventHandler$$anonfun$onCrafting$2 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 289 */     public final Option<ItemStack> apply(ItemStack stack) { return scala.Predef$.MODULE$.refArrayOps((Object[])(new MicrocontrollerData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3(this)); } public final class EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$4) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$4) == null) { Items.get(x$4); if (itemInfo != null); } else if (Items.get(x$4).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3(EventHandler$$anonfun$onCrafting$2 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$3 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 294 */     public final Option<ItemStack> apply(ItemStack stack) { return scala.Predef$.MODULE$.refArrayOps((Object[])(new MicrocontrollerData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4(this)); } public final class EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$5) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$5) == null) { Items.get(x$5); if (itemInfo != null); } else if (Items.get(x$5).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4(EventHandler$$anonfun$onCrafting$3 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$4 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 299 */     public final Option<ItemStack> apply(ItemStack stack) { return scala.Predef$.MODULE$.refArrayOps((Object[])(new RobotData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5(this)); } public final class EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$6) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$6) == null) { Items.get(x$6); if (itemInfo != null); } else if (Items.get(x$6).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5(EventHandler$$anonfun$onCrafting$4 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$5 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 304 */     public final Option<ItemStack> apply(ItemStack stack) { return scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])(new TabletData(stack)).items()).collect((PartialFunction)new EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1(this), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).find((Function1)new EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6(this)); } public final class EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack item = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } public EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1(EventHandler$$anonfun$onCrafting$5 $outer) {} } public final class EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$7) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$7) == null) { Items.get(x$7); if (itemInfo != null); } else if (Items.get(x$7).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6(EventHandler$$anonfun$onCrafting$5 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.ItemCraftedEvent e$4;
/* 309 */     public final Iterable<ItemStack> apply(int i) { return scala.Option$.MODULE$.option2Iterable(scala.Option$.MODULE$.apply(this.e$4.craftMatrix.func_70301_a(i))); } public EventHandler$$anonfun$1(PlayerEvent.ItemCraftedEvent e$4) {} } public final class EventHandler$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) {
/* 310 */       return li.cil.oc.integration.util.Wrench$.MODULE$.isWrench(stack);
/*     */     } }
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
/*     */   public void onPickup(PlayerEvent.ItemPickupEvent e) {
/* 341 */     EntityItem entity = e.pickedUp;
/* 342 */     Option option = scala.Option$.MODULE$.apply(entity).flatMap((Function1)new EventHandler$$anonfun$3());
/* 343 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x();
/* 344 */       Achievement$.MODULE$.onAssemble(stack, e.player);
/* 345 */       Achievement$.MODULE$.onCraft(stack, e.player); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 346 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public final class EventHandler$$anonfun$3 extends AbstractFunction1<EntityItem, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<ItemStack> apply(EntityItem e) {
/*     */       return scala.Option$.MODULE$.apply(e.func_92059_d());
/*     */     } } private boolean timeForPresents() {
/* 351 */     Calendar now = Calendar.getInstance();
/* 352 */     int month = now.get(2);
/* 353 */     int dayOfMonth = now.get(5);
/*     */     
/* 355 */     return ((month == 11 && dayOfMonth > 24) || (month == 0 && dayOfMonth < 7) || (
/* 356 */       month == 1 && dayOfMonth == 14) || (
/* 357 */       month == 3 && dayOfMonth == 22) || (
/* 358 */       month == 4 && dayOfMonth == 1) || (
/* 359 */       month == 9 && dayOfMonth == 3) || (
/* 360 */       month == 11 && dayOfMonth == 14));
/*     */   }
/*     */   
/*     */   public boolean isItTime() {
/* 364 */     Calendar now = Calendar.getInstance();
/* 365 */     int month = now.get(2);
/* 366 */     int dayOfMonth = now.get(5);
/* 367 */     return (month == 3 && dayOfMonth == 1);
/*     */   } private boolean recraft(PlayerEvent.ItemCraftedEvent e, ItemInfo item, Function1 callback) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield crafting : Lnet/minecraft/item/ItemStack;
/*     */     //   4: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   7: aload_2
/*     */     //   8: astore #4
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 23
/*     */     //   14: pop
/*     */     //   15: aload #4
/*     */     //   17: ifnull -> 31
/*     */     //   20: goto -> 70
/*     */     //   23: aload #4
/*     */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 70
/*     */     //   31: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   34: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   37: iconst_0
/*     */     //   38: invokevirtual intWrapper : (I)I
/*     */     //   41: aload_1
/*     */     //   42: getfield craftMatrix : Lnet/minecraft/inventory/IInventory;
/*     */     //   45: invokeinterface func_70302_i_ : ()I
/*     */     //   50: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*     */     //   53: new li/cil/oc/common/EventHandler$$anonfun$recraft$1
/*     */     //   56: dup
/*     */     //   57: aload_1
/*     */     //   58: aload_2
/*     */     //   59: aload_3
/*     */     //   60: invokespecial <init> : (Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)V
/*     */     //   63: invokevirtual foreach$mVc$sp : (Lscala/Function1;)V
/*     */     //   66: iconst_1
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_0
/*     */     //   71: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #371	-> 0
/*     */     //   #372	-> 34
/*     */     //   #379	-> 66
/*     */     //   #381	-> 70
/*     */     //   #371	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	72	0	this	Lli/cil/oc/common/EventHandler$;
/*     */     //   0	72	1	e	Lcpw/mods/fml/common/gameevent/PlayerEvent$ItemCraftedEvent;
/*     */     //   0	72	2	item	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   0	72	3	callback	Lscala/Function1;
/*     */   }
/*     */   public final class EventHandler$$anonfun$recraft$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final PlayerEvent.ItemCraftedEvent e$5; private final ItemInfo item$1; private final Function1 callback$1;
/* 372 */     public final void apply(int slot) { apply$mcVI$sp(slot); } public EventHandler$$anonfun$recraft$1(PlayerEvent.ItemCraftedEvent e$5, ItemInfo item$1, Function1 callback$1) {}
/* 373 */     public void apply$mcVI$sp(int slot) { ItemStack stack = this.e$5.craftMatrix.func_70301_a(slot);
/* 374 */       ItemInfo itemInfo = this.item$1; if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 375 */         { ((Option)this.callback$1.apply(stack)).foreach((Function1)new EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(this)); return; }  return; }  ((Option)this.callback$1.apply(stack)).foreach((Function1)new EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(this)); } public final class EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(EventHandler$$anonfun$recraft$1 $outer) {}
/* 376 */       public final void apply(ItemStack extra) { li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory(extra, this.$outer.e$5.player, li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory$default$3()); } }
/*     */      } public final class EventHandler$$anonfun$onWorldUnload$1 extends AbstractPartialFunction<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x2, Function1 default) { Object object2, object1 = x2; if (object1 instanceof TileEntity) {
/*     */         Object object = object1; ((TileEntity)object).dispose(); object2 = BoxedUnit.UNIT;
/*     */       } else {
/*     */         object2 = default.apply(x2);
/*     */       }  return (B1)object2; }
/*     */     public final boolean isDefinedAt(Object x2) { boolean bool;
/*     */       Object object = x2;
/*     */       if (object instanceof TileEntity) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool; } }
/* 390 */   @SubscribeEvent public synchronized void onWorldUnload(WorldEvent.Unload e) { if (e.world.field_72995_K)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 401 */       TerminalServer$.MODULE$.loaded().clear(); } else { scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(e.world.field_147482_g).collect((PartialFunction)new EventHandler$$anonfun$onWorldUnload$1(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(e.world.field_72996_f).collect((PartialFunction)new EventHandler$$anonfun$onWorldUnload$2(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); li.cil.oc.server.machine.Callbacks$.MODULE$.clear(); }  } public final class EventHandler$$anonfun$onWorldUnload$2 extends AbstractPartialFunction<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x3, Function1 default) { Object object2, object1 = x3; if (object1 instanceof MachineHost) { Object object = object1; object2 = BoxesRunTime.boxToBoolean(((MachineHost)object).machine().stop()); } else { object2 = default.apply(x3); }
/*     */        return (B1)object2; }
/*     */     public final boolean isDefinedAt(Object x3) { boolean bool; Object object = x3; if (object instanceof MachineHost) { bool = true; }
/*     */       else { bool = false; }
/*     */        return bool; } }
/* 407 */   @SubscribeEvent public void onChunkUnload(ChunkEvent.Unload e) { if (!e.world.field_72995_K)
/* 408 */       scala.Predef$.MODULE$.refArrayOps((Object[])(e.getChunk()).field_76645_j).foreach((Function1)new EventHandler$$anonfun$onChunkUnload$1());  } public final class EventHandler$$anonfun$onChunkUnload$1 extends AbstractFunction1<List<?>, Buffer<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Buffer<Object> apply(List x$8) { return (Buffer<Object>)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(x$8).collect((PartialFunction)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2(this), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); } public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 extends AbstractPartialFunction<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x4, Function1 default) { Object object2, object1 = x4;
/* 409 */         if (object1 instanceof MachineHost) { Object object = object1; Machine machine = ((MachineHost)object).machine();
/* 410 */           if (machine instanceof Machine) { Machine machine1 = (Machine)machine; EventHandler$.MODULE$.scheduleClose(machine1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 411 */           else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */            object2 = BoxedUnit.UNIT; }
/* 413 */         else if (object1 instanceof Rack) { Object object = object1;
/*     */ 
/*     */           
/* 416 */           object2 = ((TraversableLike)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), ((IInventory)object).func_70302_i_()).map((Function1)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2(this, object), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).collect((PartialFunction)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1(this), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()); } else { object2 = default.apply(x4); }  return (B1)object2; } public final boolean isDefinedAt(Object x4) { boolean bool; Object object = x4; if (object instanceof MachineHost) { bool = true; } else if (object instanceof Rack) { bool = true; } else { bool = false; }  return bool; } public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2(EventHandler$$anonfun$onChunkUnload$1 $outer) {} public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2 extends AbstractFunction1<Object, RackMountable> implements Serializable { public static final long serialVersionUID = 0L; private final Object x3$1; public final RackMountable apply(int x$1) { return ((Rack)this.x3$1).getMountable(x$1); } public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2(EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 $outer, Object x3$1) {} } public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1 extends AbstractPartialFunction<RackMountable, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends RackMountable, B1> B1 applyOrElse(RackMountable x5, Function1 default) { RackMountable rackMountable = x5; if (rackMountable instanceof Server) { Server server = (Server)rackMountable; if (server.machine() != null) return (B1)BoxesRunTime.boxToBoolean(server.machine().stop());  }  return (B1)default.apply(x5); } public final boolean isDefinedAt(RackMountable x5) { RackMountable rackMountable = x5; if (rackMountable instanceof Server) { Server server = (Server)rackMountable; if (server.machine() != null) return true;  }  return false; }
/*     */         
/*     */         public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1(EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 $outer) {} } } }
/*     */   private EventHandler$() {
/* 420 */     MODULE$ = this;
/*     */     this.pendingServer = (Buffer<Function0<BoxedUnit>>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     this.pendingClient = (Buffer<Function0<BoxedUnit>>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     this.runningRobots = scala.collection.mutable.Set$.MODULE$.empty();
/*     */     this.keyboards = Collections.newSetFromMap(new WeakHashMap<>());
/*     */     this.machines = scala.collection.mutable.Set$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\EventHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */