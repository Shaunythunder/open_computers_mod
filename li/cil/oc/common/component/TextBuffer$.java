/*     */ package li.cil.oc.common.component;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import net.minecraft.world.chunk.Chunk;
/*     */ import net.minecraftforge.event.world.ChunkEvent;
/*     */ import net.minecraftforge.event.world.WorldEvent;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.ListBuffer;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ public final class TextBuffer$
/*     */ {
/*     */   public static final TextBuffer$ MODULE$;
/*     */   private ListBuffer<TextBuffer> clientBuffers;
/*     */   
/*     */   public ListBuffer<TextBuffer> clientBuffers() {
/* 488 */     return this.clientBuffers; } public void clientBuffers_$eq(ListBuffer<TextBuffer> x$1) { this.clientBuffers = x$1; }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onChunkUnload(ChunkEvent.Unload e) {
/* 492 */     Chunk chunk = e.getChunk();
/* 493 */     clientBuffers_$eq((ListBuffer<TextBuffer>)clientBuffers().filter((Function1)new TextBuffer$$anonfun$onChunkUnload$1(e, chunk)));
/*     */   }
/*     */   public final class TextBuffer$$anonfun$onChunkUnload$1 extends AbstractFunction1<TextBuffer, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ChunkEvent.Unload e$1; private final Chunk chunk$1;
/*     */     public TextBuffer$$anonfun$onChunkUnload$1(ChunkEvent.Unload e$1, Chunk chunk$1) {}
/*     */     
/*     */     public final boolean apply(TextBuffer t) {
/*     */       // Byte code:
/*     */       //   0: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */       //   7: invokevirtual apply : (Lli/cil/oc/api/network/EnvironmentHost;)Lli/cil/oc/util/BlockPosition;
/*     */       //   10: astore_2
/*     */       //   11: aload_1
/*     */       //   12: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */       //   15: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   20: aload_0
/*     */       //   21: getfield e$1 : Lnet/minecraftforge/event/world/ChunkEvent$Unload;
/*     */       //   24: getfield world : Lnet/minecraft/world/World;
/*     */       //   27: astore #4
/*     */       //   29: dup
/*     */       //   30: ifnonnull -> 42
/*     */       //   33: pop
/*     */       //   34: aload #4
/*     */       //   36: ifnull -> 50
/*     */       //   39: goto -> 76
/*     */       //   42: aload #4
/*     */       //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   47: ifeq -> 76
/*     */       //   50: aload_0
/*     */       //   51: getfield chunk$1 : Lnet/minecraft/world/chunk/Chunk;
/*     */       //   54: aload_2
/*     */       //   55: invokevirtual x : ()I
/*     */       //   58: iconst_4
/*     */       //   59: ishr
/*     */       //   60: aload_2
/*     */       //   61: invokevirtual z : ()I
/*     */       //   64: iconst_4
/*     */       //   65: ishr
/*     */       //   66: invokevirtual func_76600_a : (II)Z
/*     */       //   69: ifeq -> 76
/*     */       //   72: iconst_0
/*     */       //   73: goto -> 77
/*     */       //   76: iconst_1
/*     */       //   77: istore_3
/*     */       //   78: iload_3
/*     */       //   79: ifne -> 98
/*     */       //   82: getstatic li/cil/oc/client/ComponentTracker$.MODULE$ : Lli/cil/oc/client/ComponentTracker$;
/*     */       //   85: aload_1
/*     */       //   86: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */       //   89: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   94: aload_1
/*     */       //   95: invokevirtual remove : (Lnet/minecraft/world/World;Lli/cil/oc/api/network/ManagedEnvironment;)V
/*     */       //   98: iload_3
/*     */       //   99: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #494	-> 0
/*     */       //   #495	-> 11
/*     */       //   #496	-> 78
/*     */       //   #497	-> 82
/*     */       //   #499	-> 98
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	100	0	this	Lli/cil/oc/common/component/TextBuffer$$anonfun$onChunkUnload$1;
/*     */       //   0	100	1	t	Lli/cil/oc/common/component/TextBuffer;
/*     */       //   11	88	2	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */       //   78	21	3	keep	Z
/*     */     } }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onWorldUnload(WorldEvent.Unload e) {
/* 505 */     clientBuffers_$eq((ListBuffer<TextBuffer>)clientBuffers().filter((Function1)new TextBuffer$$anonfun$onWorldUnload$1(e)));
/*     */   }
/*     */   public final class TextBuffer$$anonfun$onWorldUnload$1 extends AbstractFunction1<TextBuffer, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final WorldEvent.Unload e$2;
/*     */     public TextBuffer$$anonfun$onWorldUnload$1(WorldEvent.Unload e$2) {}
/*     */     public final boolean apply(TextBuffer t) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */       //   4: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   9: aload_0
/*     */       //   10: getfield e$2 : Lnet/minecraftforge/event/world/WorldEvent$Unload;
/*     */       //   13: getfield world : Lnet/minecraft/world/World;
/*     */       //   16: astore_3
/*     */       //   17: dup
/*     */       //   18: ifnonnull -> 29
/*     */       //   21: pop
/*     */       //   22: aload_3
/*     */       //   23: ifnull -> 36
/*     */       //   26: goto -> 40
/*     */       //   29: aload_3
/*     */       //   30: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   33: ifeq -> 40
/*     */       //   36: iconst_0
/*     */       //   37: goto -> 41
/*     */       //   40: iconst_1
/*     */       //   41: istore_2
/*     */       //   42: iload_2
/*     */       //   43: ifne -> 62
/*     */       //   46: getstatic li/cil/oc/client/ComponentTracker$.MODULE$ : Lli/cil/oc/client/ComponentTracker$;
/*     */       //   49: aload_1
/*     */       //   50: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */       //   53: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   58: aload_1
/*     */       //   59: invokevirtual remove : (Lnet/minecraft/world/World;Lli/cil/oc/api/network/ManagedEnvironment;)V
/*     */       //   62: iload_2
/*     */       //   63: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #506	-> 0
/*     */       //   #507	-> 42
/*     */       //   #508	-> 46
/*     */       //   #510	-> 62
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	64	0	this	Lli/cil/oc/common/component/TextBuffer$$anonfun$onWorldUnload$1;
/*     */       //   0	64	1	t	Lli/cil/oc/common/component/TextBuffer;
/*     */       //   42	21	2	keep	Z
/*     */     } }
/*     */   
/*     */   public void registerClientBuffer(TextBuffer t) {
/* 515 */     li.cil.oc.client.PacketSender$.MODULE$.sendTextBufferInit(t.proxy().nodeAddress());
/* 516 */     li.cil.oc.client.ComponentTracker$.MODULE$.add(t.host().world(), t.proxy().nodeAddress(), (ManagedEnvironment)t);
/* 517 */     clientBuffers().$plus$eq(t);
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
/*     */   private TextBuffer$() {
/* 890 */     MODULE$ = this;
/*     */     this.clientBuffers = (ListBuffer<TextBuffer>)scala.collection.mutable.ListBuffer$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\TextBuffer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */