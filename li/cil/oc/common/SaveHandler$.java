/*     */ package li.cil.oc.common;
/*     */ import cpw.mods.fml.common.eventhandler.EventPriority;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.util.concurrent.ConcurrentLinkedDeque;
/*     */ import java.util.concurrent.Future;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import li.cil.oc.api.machine.MachineHost;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.SafeThreadPool;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.world.ChunkCoordIntPair;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.event.world.WorldEvent;
/*     */ import org.apache.commons.lang3.JavaVersion;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.HashMap;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class SaveHandler$ {
/*     */   public static final SaveHandler$ MODULE$;
/*     */   private final String li$cil$oc$common$SaveHandler$$uuidRegex;
/*     */   private final int li$cil$oc$common$SaveHandler$$TimeToHoldOntoOldSaves;
/*     */   
/*     */   public String li$cil$oc$common$SaveHandler$$uuidRegex() {
/*  35 */     return this.li$cil$oc$common$SaveHandler$$uuidRegex;
/*     */   } private boolean savingForClients; private final SafeThreadPool stateSaveHandler; private final ConcurrentLinkedDeque<File> chunkDirs; private final HashMap<String, Future<?>> saving; public int li$cil$oc$common$SaveHandler$$TimeToHoldOntoOldSaves() {
/*  37 */     return this.li$cil$oc$common$SaveHandler$$TimeToHoldOntoOldSaves;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean savingForClients()
/*     */   {
/*  47 */     return this.savingForClients; } public void savingForClients_$eq(boolean x$1) { this.savingForClients = x$1; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SafeThreadPool stateSaveHandler() {
/*  71 */     return this.stateSaveHandler;
/*     */   }
/*  73 */   public ConcurrentLinkedDeque<File> chunkDirs() { return this.chunkDirs; } public HashMap<String, Future<?>> saving() {
/*  74 */     return this.saving;
/*     */   } public File savePath() {
/*  76 */     return new File(DimensionManager.getCurrentSaveRootDirectory(), li.cil.oc.Settings$.MODULE$.savePath());
/*     */   } public File statePath() {
/*  78 */     return new File(savePath(), "state");
/*     */   }
/*     */   public void scheduleSave(MachineHost host, NBTTagCompound nbt, String name, byte[] data) {
/*  81 */     scheduleSave(li.cil.oc.util.BlockPosition$.MODULE$.apply((EnvironmentHost)host), nbt, name, data);
/*     */   }
/*     */   
/*     */   public void scheduleSave(MachineHost host, NBTTagCompound nbt, String name, Function1<NBTTagCompound, BoxedUnit> save) {
/*  85 */     scheduleSave(host, nbt, name, writeNBT(save));
/*     */   }
/*     */   
/*     */   public void scheduleSave(EnvironmentHost host, NBTTagCompound nbt, String name, Function1<NBTTagCompound, BoxedUnit> save) {
/*  89 */     scheduleSave(li.cil.oc.util.BlockPosition$.MODULE$.apply(host), nbt, name, writeNBT(save));
/*     */   }
/*     */   
/*     */   public void scheduleSave(World world, double x, double z, NBTTagCompound nbt, String name, byte[] data) {
/*  93 */     scheduleSave(li.cil.oc.util.BlockPosition$.MODULE$.apply(x, 0.0D, z, world), nbt, name, data);
/*     */   }
/*     */   
/*     */   public void scheduleSave(World world, double x, double z, NBTTagCompound nbt, String name, Function1<NBTTagCompound, BoxedUnit> save) {
/*  97 */     scheduleSave(world, x, z, nbt, name, writeNBT(save));
/*     */   }
/*     */   
/*     */   public void scheduleSave(BlockPosition position, NBTTagCompound nbt, String name, byte[] data) {
/* 101 */     World world = (World)position.world().get();
/*     */ 
/*     */     
/* 104 */     if (world instanceof net.minecraft.world.WorldServer) {
/* 105 */       int dimension = world.field_73011_w.field_76574_g;
/* 106 */       ChunkCoordIntPair chunk = new ChunkCoordIntPair(position.x() >> 4, position.z() >> 4);
/*     */ 
/*     */ 
/*     */       
/* 110 */       nbt.func_74768_a("dimension", dimension);
/* 111 */       nbt.func_74768_a("chunkX", chunk.field_77276_a);
/* 112 */       nbt.func_74768_a("chunkZ", chunk.field_77275_b);
/*     */       
/* 114 */       scheduleSave(dimension, chunk, name, data);
/*     */     } 
/*     */   }
/*     */   
/*     */   private byte[] writeNBT(Function1 save) {
/* 119 */     NBTTagCompound tmpNbt = new NBTTagCompound();
/* 120 */     save.apply(tmpNbt);
/* 121 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 122 */     DataOutputStream dos = new DataOutputStream(baos);
/* 123 */     CompressedStreamTools.func_74800_a(tmpNbt, dos);
/* 124 */     return baos.toByteArray();
/*     */   }
/*     */   
/*     */   public NBTTagCompound loadNBT(NBTTagCompound nbt, String name) {
/* 128 */     byte[] data = load(nbt, name);
/* 129 */     if (data.length > 0) { try {
/* 130 */         ByteArrayInputStream bais = new ByteArrayInputStream(data);
/* 131 */         DataInputStream dis = new DataInputStream(bais);
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       }  }
/*     */     else
/*     */     {  }
/*     */ 
/*     */     
/* 139 */     return new NBTTagCompound();
/*     */   } public final class SaveHandler$$anonfun$load$1 extends AbstractFunction1<Future<?>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Object apply(Future f) { try {
/*     */       
/*     */       } catch (TimeoutException timeoutException) {
/*     */         li.cil.oc.OpenComputers$.MODULE$.log().warn("Waiting for state data to save took two minutes! Aborting.");
/*     */       } catch (CancellationException cancellationException) {}
/* 146 */       return BoxedUnit.UNIT; } } public byte[] load(NBTTagCompound nbt, String name) { int dimension = nbt.func_74762_e("dimension");
/* 147 */     ChunkCoordIntPair chunk = new ChunkCoordIntPair(nbt.func_74762_e("chunkX"), nbt.func_74762_e("chunkZ"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     saving().get(name).foreach((Function1)new SaveHandler$$anonfun$load$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     saving().remove(name);
/*     */     
/* 160 */     return load(dimension, chunk, name); }
/*     */ 
/*     */   
/*     */   public void scheduleSave(int dimension, ChunkCoordIntPair chunk, String name, byte[] data) {
/* 164 */     if (chunk == null) throw new IllegalArgumentException("chunk is null");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     stateSaveHandler().withPool((Function1)new SaveHandler$$anonfun$scheduleSave$1(dimension, chunk, name, data), stateSaveHandler().withPool$default$2()).foreach((Function1)new SaveHandler$$anonfun$scheduleSave$2(name)); } public final class SaveHandler$$anonfun$scheduleSave$1 extends AbstractFunction1<ScheduledExecutorService, Future<?>> implements Serializable { public static final long serialVersionUID = 0L; private final int dimension$1; private final ChunkCoordIntPair chunk$1; private final String name$1; private final byte[] data$1; public final Future<?> apply(ScheduledExecutorService x$1) { return x$1.submit(new SaveHandler.SaveDataEntry(this.data$1, this.chunk$1, this.name$1, this.dimension$1)); } public SaveHandler$$anonfun$scheduleSave$1(int dimension$1, ChunkCoordIntPair chunk$1, String name$1, byte[] data$1) {} } public final class SaveHandler$$anonfun$scheduleSave$2 extends AbstractFunction1<Future<?>, Option<Future<?>>> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public final Option<Future<?>> apply(Future x$2) { return SaveHandler$.MODULE$.saving().put(this.name$1, x$2); }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public SaveHandler$$anonfun$scheduleSave$2(String name$1) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] load(int dimension, ChunkCoordIntPair chunk, String name) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ifnonnull -> 15
/*     */     //   4: new java/lang/IllegalArgumentException
/*     */     //   7: dup
/*     */     //   8: ldc_w 'chunk is null'
/*     */     //   11: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   14: athrow
/*     */     //   15: aload_0
/*     */     //   16: invokevirtual statePath : ()Ljava/io/File;
/*     */     //   19: astore #4
/*     */     //   21: new java/io/File
/*     */     //   24: dup
/*     */     //   25: aload #4
/*     */     //   27: iload_1
/*     */     //   28: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   31: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   34: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   37: astore #5
/*     */     //   39: new java/io/File
/*     */     //   42: dup
/*     */     //   43: aload #5
/*     */     //   45: new scala/StringContext
/*     */     //   48: dup
/*     */     //   49: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   52: iconst_3
/*     */     //   53: anewarray java/lang/String
/*     */     //   56: dup
/*     */     //   57: iconst_0
/*     */     //   58: ldc_w ''
/*     */     //   61: aastore
/*     */     //   62: dup
/*     */     //   63: iconst_1
/*     */     //   64: ldc_w '.'
/*     */     //   67: aastore
/*     */     //   68: dup
/*     */     //   69: iconst_2
/*     */     //   70: ldc_w ''
/*     */     //   73: aastore
/*     */     //   74: checkcast [Ljava/lang/Object;
/*     */     //   77: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   80: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   83: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   86: iconst_2
/*     */     //   87: anewarray java/lang/Object
/*     */     //   90: dup
/*     */     //   91: iconst_0
/*     */     //   92: aload_2
/*     */     //   93: getfield field_77276_a : I
/*     */     //   96: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   99: aastore
/*     */     //   100: dup
/*     */     //   101: iconst_1
/*     */     //   102: aload_2
/*     */     //   103: getfield field_77275_b : I
/*     */     //   106: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   109: aastore
/*     */     //   110: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   113: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   116: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   119: astore #6
/*     */     //   121: new java/io/File
/*     */     //   124: dup
/*     */     //   125: aload #6
/*     */     //   127: aload_3
/*     */     //   128: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
/*     */     //   131: astore #7
/*     */     //   133: aload #7
/*     */     //   135: invokevirtual exists : ()Z
/*     */     //   138: ifeq -> 222
/*     */     //   141: new java/io/BufferedInputStream
/*     */     //   144: dup
/*     */     //   145: new java/io/FileInputStream
/*     */     //   148: dup
/*     */     //   149: aload #7
/*     */     //   151: invokespecial <init> : (Ljava/io/File;)V
/*     */     //   154: invokespecial <init> : (Ljava/io/InputStream;)V
/*     */     //   157: astore #9
/*     */     //   159: new java/io/ByteArrayOutputStream
/*     */     //   162: dup
/*     */     //   163: invokespecial <init> : ()V
/*     */     //   166: astore #10
/*     */     //   168: sipush #8192
/*     */     //   171: newarray byte
/*     */     //   173: astore #11
/*     */     //   175: iconst_0
/*     */     //   176: istore #12
/*     */     //   178: aload #9
/*     */     //   180: aload #11
/*     */     //   182: invokevirtual read : ([B)I
/*     */     //   185: istore #12
/*     */     //   187: iload #12
/*     */     //   189: iconst_0
/*     */     //   190: if_icmple -> 203
/*     */     //   193: aload #10
/*     */     //   195: aload #11
/*     */     //   197: iconst_0
/*     */     //   198: iload #12
/*     */     //   200: invokevirtual write : ([BII)V
/*     */     //   203: iload #12
/*     */     //   205: iconst_0
/*     */     //   206: if_icmpge -> 178
/*     */     //   209: aload #9
/*     */     //   211: invokevirtual close : ()V
/*     */     //   214: aload #10
/*     */     //   216: invokevirtual toByteArray : ()[B
/*     */     //   219: goto -> 271
/*     */     //   222: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   225: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   228: invokevirtual Byte : ()Lscala/reflect/ClassTag;
/*     */     //   231: invokevirtual empty : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   234: checkcast [B
/*     */     //   237: areturn
/*     */     //   238: astore #8
/*     */     //   240: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   243: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   246: ldc_w 'Error loading auxiliary tile entity data.'
/*     */     //   249: aload #8
/*     */     //   251: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   256: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   259: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   262: invokevirtual Byte : ()Lscala/reflect/ClassTag;
/*     */     //   265: invokevirtual empty : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   268: checkcast [B
/*     */     //   271: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #175	-> 0
/*     */     //   #177	-> 15
/*     */     //   #178	-> 21
/*     */     //   #179	-> 39
/*     */     //   #180	-> 121
/*     */     //   #181	-> 133
/*     */     //   #184	-> 141
/*     */     //   #185	-> 159
/*     */     //   #186	-> 168
/*     */     //   #187	-> 175
/*     */     //   #189	-> 178
/*     */     //   #188	-> 178
/*     */     //   #190	-> 187
/*     */     //   #191	-> 193
/*     */     //   #193	-> 203
/*     */     //   #194	-> 209
/*     */     //   #195	-> 214
/*     */     //   #181	-> 222
/*     */     //   #198	-> 238
/*     */     //   #182	-> 238
/*     */     //   #199	-> 240
/*     */     //   #200	-> 256
/*     */     //   #174	-> 271
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	272	0	this	Lli/cil/oc/common/SaveHandler$;
/*     */     //   0	272	1	dimension	I
/*     */     //   0	272	2	chunk	Lnet/minecraft/world/ChunkCoordIntPair;
/*     */     //   0	272	3	name	Ljava/lang/String;
/*     */     //   21	251	4	path	Ljava/io/File;
/*     */     //   39	233	5	dimPath	Ljava/io/File;
/*     */     //   121	151	6	chunkPath	Ljava/io/File;
/*     */     //   133	139	7	file	Ljava/io/File;
/*     */     //   159	60	9	bis	Ljava/io/BufferedInputStream;
/*     */     //   168	51	10	bos	Ljava/io/ByteArrayOutputStream;
/*     */     //   175	44	11	buffer	[B
/*     */     //   178	41	12	read	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   141	222	238	java/io/IOException
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class SaveHandler$$anon$1
/*     */     implements FileFilter
/*     */   {
/*     */     public boolean accept(File file) {
/*     */       if (file.isDirectory()) {
/*     */         if (file.getName().matches(SaveHandler$.MODULE$.li$cil$oc$common$SaveHandler$$uuidRegex())) {
/*     */           if (System.currentTimeMillis() - file.lastModified() > SaveHandler$.MODULE$.li$cil$oc$common$SaveHandler$$TimeToHoldOntoOldSaves()) {
/*     */             String[] list = file.list();
/*     */             if ((list == null || scala.Predef$.MODULE$.refArrayOps((Object[])list).isEmpty()));
/*     */           } 
/*     */         }
/*     */       }
/*     */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void cleanSaveData()
/*     */   {
/* 206 */     File[] emptyDirs = savePath().listFiles(new SaveHandler$$anon$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     if (emptyDirs != null)
/* 218 */       scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])emptyDirs).filter((Function1)new SaveHandler$$anonfun$cleanSaveData$1())).foreach((Function1)new SaveHandler$$anonfun$cleanSaveData$2());  } public final class SaveHandler$$anonfun$cleanSaveData$1 extends AbstractFunction1<File, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(File x$3) { return !(x$3 == null); } } public final class SaveHandler$$anonfun$cleanSaveData$2 extends AbstractFunction1<File, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(File x$4) { return x$4.delete(); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.HIGHEST)
/*     */   public void onWorldLoad(WorldEvent.Load e) {
/* 227 */     if (SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_7)) { SaveHandlerJava17Functionality$.MODULE$.visitJava17(statePath()); }
/* 228 */     else { visitJava16(); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public final void li$cil$oc$common$SaveHandler$$recurse$1(File file)
/*     */   {
/* 235 */     file.setLastModified(System.currentTimeMillis());
/* 236 */     if (file.exists() && file.isDirectory() && file.list() != null) scala.Predef$.MODULE$.refArrayOps((Object[])file.listFiles()).foreach((Function1)new SaveHandler$$anonfun$li$cil$oc$common$SaveHandler$$recurse$1$1());  } public final class SaveHandler$$anonfun$li$cil$oc$common$SaveHandler$$recurse$1$1 extends AbstractFunction1<File, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(File file) { SaveHandler$.MODULE$.li$cil$oc$common$SaveHandler$$recurse$1(file); }
/*     */      } private void visitJava16() {
/* 238 */     li$cil$oc$common$SaveHandler$$recurse$1(statePath());
/*     */   }
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.LOWEST)
/*     */   public void onWorldSave(WorldEvent.Save e) {
/* 243 */     stateSaveHandler().withPool((Function1)new SaveHandler$$anonfun$onWorldSave$1(), stateSaveHandler().withPool$default$2()); } public final class SaveHandler$$anonfun$onWorldSave$1 extends AbstractFunction1<ScheduledExecutorService, Future<?>> implements Serializable { public static final long serialVersionUID = 0L; public final Future<?> apply(ScheduledExecutorService x$5) { return x$5.submit(new SaveHandler$$anonfun$onWorldSave$1$$anon$2(this)); } public final class SaveHandler$$anonfun$onWorldSave$1$$anon$2 implements Runnable { public SaveHandler$$anonfun$onWorldSave$1$$anon$2(SaveHandler$$anonfun$onWorldSave$1 $outer) {} public void run() {
/* 244 */         SaveHandler$.MODULE$.cleanSaveData();
/*     */       } } }
/*     */ 
/*     */   
/*     */   private SaveHandler$() {
/* 249 */     MODULE$ = this;
/*     */     this.li$cil$oc$common$SaveHandler$$uuidRegex = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";
/*     */     this.li$cil$oc$common$SaveHandler$$TimeToHoldOntoOldSaves = 60000;
/*     */     this.savingForClients = false;
/*     */     this.stateSaveHandler = li.cil.oc.util.ThreadPoolFactory$.MODULE$.createSafePool("SaveHandler", 1);
/*     */     this.chunkDirs = new ConcurrentLinkedDeque<>();
/*     */     this.saving = scala.collection.mutable.HashMap$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\SaveHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */