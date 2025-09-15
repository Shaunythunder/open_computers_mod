/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class Hub$class {
/*     */   public static Node node(Hub $this) {
/*  18 */     return null;
/*     */   } public static boolean isConnected(Hub $this) {
/*  20 */     return Predef$.MODULE$.refArrayOps((Object[])$this.plugs()).exists((Function1)new Hub$$anonfun$isConnected$1($this));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void $init$(Hub $this) {
/*  26 */     $this.li$cil$oc$common$tileentity$traits$Hub$_setter_$plugs_$eq((Hub.Plug[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Hub$$anonfun$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Hub.Plug.class))));
/*     */     
/*  28 */     $this.li$cil$oc$common$tileentity$traits$Hub$_setter_$queue_$eq((Queue)Queue$.MODULE$.empty());
/*     */     
/*  30 */     $this.maxQueueSize_$eq($this.queueBaseSize());
/*     */     
/*  32 */     $this.relayDelay_$eq($this.relayBaseDelay());
/*     */     
/*  34 */     $this.relayAmount_$eq($this.relayBaseAmount());
/*     */     
/*  36 */     $this.relayCooldown_$eq(-1);
/*     */ 
/*     */     
/*  39 */     $this.li$cil$oc$common$tileentity$traits$Hub$_setter_$packetsPerCycleAvg_$eq(new MovingAverage(20));
/*     */   }
/*     */   
/*     */   public static int queueBaseSize(Hub $this) {
/*  43 */     return Settings$.MODULE$.get().switchDefaultMaxQueueSize();
/*     */   } public static int queueSizePerUpgrade(Hub $this) {
/*  45 */     return Settings$.MODULE$.get().switchQueueSizeUpgrade();
/*     */   } public static int relayBaseDelay(Hub $this) {
/*  47 */     return Settings$.MODULE$.get().switchDefaultRelayDelay();
/*     */   } public static double relayDelayPerUpgrade(Hub $this) {
/*  49 */     return Settings$.MODULE$.get().switchRelayDelayUpgrade();
/*     */   } public static int relayBaseAmount(Hub $this) {
/*  51 */     return Settings$.MODULE$.get().switchDefaultRelayAmount();
/*     */   } public static int relayAmountPerUpgrade(Hub $this) {
/*  53 */     return Settings$.MODULE$.get().switchRelayAmountUpgrade();
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static boolean canConnect(Hub $this, ForgeDirection side) {
/*  58 */     ForgeDirection forgeDirection = ForgeDirection.UNKNOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*  60 */      } public static Node sidedNode(Hub $this, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.UNKNOWN; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*     */      }
/*     */   
/*     */   public static void updateEntity(Hub $this) {
/*  65 */     $this.li$cil$oc$common$tileentity$traits$Hub$$super$updateEntity();
/*  66 */     if ($this.relayCooldown() > 0) {
/*  67 */       $this.relayCooldown_$eq($this.relayCooldown() - 1);
/*     */     } else {
/*     */       
/*  70 */       $this.relayCooldown_$eq(-1);
/*  71 */       if ($this.queue().nonEmpty()) synchronized ($this.queue()) {
/*  72 */           int packetsToRely = package$.MODULE$.min($this.queue().size(), $this.relayAmount());
/*  73 */           $this.packetsPerCycleAvg().$plus$eq(packetsToRely); RichInt$.MODULE$
/*  74 */             .until$extension0(Predef$.MODULE$.intWrapper(0), packetsToRely).foreach$mVc$sp((Function1)new Hub$$anonfun$updateEntity$1($this));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  79 */           $this.relayCooldown_$eq($this.relayDelay() - 1); $this.queue().nonEmpty() ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */           return;
/*     */         }  
/*  82 */       if ($this.world().func_82737_E() % $this.relayDelay() == 0L)
/*  83 */         $this.packetsPerCycleAvg().$plus$eq(0); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean tryEnqueuePacket(Hub $this, Option sourceSide, Packet packet) {
/*  88 */     synchronized ($this.queue()) {
/*     */       
/*  90 */       $this.queue().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(sourceSide), packet.hop()));
/*  91 */       if ($this.relayCooldown() < 0) {
/*  92 */         $this.relayCooldown_$eq($this.relayDelay() - 1);
/*     */       }
/*     */ 
/*     */       
/*  96 */       Boolean bool = (packet.ttl() > 0 && $this.queue().size() < $this.maxQueueSize()) ? BoxesRunTime.boxToBoolean(true) : BoxesRunTime.boxToBoolean(false);
/*     */       return BoxesRunTime.unboxToBoolean(bool);
/*     */     } 
/*     */   } public static void relayPacket(Hub $this, Option sourceSide, Packet packet) {
/* 100 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Hub$$anonfun$relayPacket$1($this, sourceSide, packet));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(Hub $this, NBTTagCompound nbt) {
/* 111 */     $this.li$cil$oc$common$tileentity$traits$Hub$$super$readFromNBTForServer(nbt);
/*     */     
/* 113 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("plugs").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new Hub$$anonfun$readFromNBTForServer$1($this));
/*     */ 
/*     */     
/* 116 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("queue").toString(), 10)).foreach(
/* 117 */         (Function1)new Hub$$anonfun$readFromNBTForServer$2($this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("relayCooldown").toString()))
/* 123 */       $this.relayCooldown_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("relayCooldown").toString())); 
/*     */   }
/*     */   
/*     */   public static void writeToNBTForServer(Hub $this, NBTTagCompound nbt) {
/* 127 */     synchronized ($this.queue()) {
/* 128 */       $this.li$cil$oc$common$tileentity$traits$Hub$$super$writeToNBTForServer(nbt);
/*     */ 
/*     */       
/* 131 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("plugs").toString(), (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])$this.plugs()).map((Function1)new Hub$$anonfun$writeToNBTForServer$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class)))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("queue").toString(), (Iterable)$this.queue().map((Function1)new Hub$$anonfun$writeToNBTForServer$2($this), Queue$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 145 */       nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("relayCooldown").toString(), $this.relayCooldown()); $this.isServer() ? (($this.relayCooldown() > 0) ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static Hub.Plug createPlug(Hub $this, ForgeDirection side) {
/* 152 */     return new Hub.Plug($this, side);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onPlugConnect(Hub $this, Hub.Plug plug, Node node) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onPlugDisconnect(Hub $this, Hub.Plug plug, Node node) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onPlugMessage(Hub $this, Hub.Plug plug, Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokeinterface name : ()Ljava/lang/String;
/*     */     //   6: ldc_w 'network.message'
/*     */     //   9: astore_3
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 22
/*     */     //   14: pop
/*     */     //   15: aload_3
/*     */     //   16: ifnull -> 29
/*     */     //   19: goto -> 176
/*     */     //   22: aload_3
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 176
/*     */     //   29: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface plugs : ()[Lli/cil/oc/common/tileentity/traits/Hub$Plug;
/*     */     //   38: checkcast [Ljava/lang/Object;
/*     */     //   41: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   44: new li/cil/oc/common/tileentity/traits/Hub$$anonfun$onPlugMessage$1
/*     */     //   47: dup
/*     */     //   48: aload_0
/*     */     //   49: aload_2
/*     */     //   50: invokespecial <init> : (Lli/cil/oc/common/tileentity/traits/Hub;Lli/cil/oc/api/network/Message;)V
/*     */     //   53: invokeinterface exists : (Lscala/Function1;)Z
/*     */     //   58: ifne -> 176
/*     */     //   61: aload_2
/*     */     //   62: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   67: astore #4
/*     */     //   69: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   72: aload #4
/*     */     //   74: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   77: astore #5
/*     */     //   79: aload #5
/*     */     //   81: invokevirtual isEmpty : ()Z
/*     */     //   84: ifne -> 171
/*     */     //   87: aload #5
/*     */     //   89: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   92: ifnull -> 171
/*     */     //   95: aload #5
/*     */     //   97: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   100: checkcast scala/collection/SeqLike
/*     */     //   103: iconst_1
/*     */     //   104: invokeinterface lengthCompare : (I)I
/*     */     //   109: iconst_0
/*     */     //   110: if_icmpne -> 171
/*     */     //   113: aload #5
/*     */     //   115: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   118: checkcast scala/collection/SeqLike
/*     */     //   121: iconst_0
/*     */     //   122: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   127: astore #6
/*     */     //   129: aload #6
/*     */     //   131: instanceof li/cil/oc/api/network/Packet
/*     */     //   134: ifeq -> 171
/*     */     //   137: aload #6
/*     */     //   139: checkcast li/cil/oc/api/network/Packet
/*     */     //   142: astore #7
/*     */     //   144: aload_0
/*     */     //   145: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   148: aload_1
/*     */     //   149: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   152: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   155: aload #7
/*     */     //   157: invokeinterface tryEnqueuePacket : (Lscala/Option;Lli/cil/oc/api/network/Packet;)Z
/*     */     //   162: pop
/*     */     //   163: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   166: astore #8
/*     */     //   168: goto -> 176
/*     */     //   171: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   174: astore #8
/*     */     //   176: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #177	-> 0
/*     */     //   #178	-> 69
/*     */     //   #179	-> 171
/*     */     //   #177	-> 176
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	177	0	$this	Lli/cil/oc/common/tileentity/traits/Hub;
/*     */     //   0	177	1	plug	Lli/cil/oc/common/tileentity/traits/Hub$Plug;
/*     */     //   0	177	2	message	Lli/cil/oc/api/network/Message;
/*     */     //   129	48	6	packet	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Node createNode(Hub $this, Hub.Plug plug) {
/* 183 */     return Network.newNode(plug, Visibility.Network).create();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Hub$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */