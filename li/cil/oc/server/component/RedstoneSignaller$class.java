/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import li.cil.oc.common.tileentity.traits.RedstoneChangedEventArgs;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class RedstoneSignaller$class {
/*    */   public static void $init$(RedstoneSignaller $this) {
/* 16 */     $this.li$cil$oc$server$component$RedstoneSignaller$_setter_$node_$eq((Component)Network.newNode((Environment)$this, Visibility.Network)
/* 17 */         .withComponent("redstone", Visibility.Neighbors)
/* 18 */         .create());
/*    */     
/* 20 */     $this.wakeThreshold_$eq(0);
/*    */     
/* 22 */     $this.wakeNeighborsOnly_$eq(true);
/*    */   }
/*    */   
/*    */   @Callback(direct = true, doc = "function():number -- Get the current wake-up threshold.")
/*    */   public static Object[] getWakeThreshold(RedstoneSignaller $this, Context context, Arguments args) {
/* 27 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.wakeThreshold()) }));
/*    */   }
/*    */   @Callback(doc = "function(threshold:number):number -- Set the wake-up threshold.")
/*    */   public static Object[] setWakeThreshold(RedstoneSignaller $this, Context context, Arguments args) {
/* 31 */     int oldThreshold = $this.wakeThreshold();
/* 32 */     $this.wakeThreshold_$eq(args.checkInteger(0));
/* 33 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(oldThreshold) }));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void onRedstoneChanged(RedstoneSignaller $this, RedstoneChangedEventArgs args) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   4: getstatic net/minecraftforge/common/util/ForgeDirection.UNKNOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   7: astore_3
/*    */     //   8: dup
/*    */     //   9: ifnonnull -> 20
/*    */     //   12: pop
/*    */     //   13: aload_3
/*    */     //   14: ifnull -> 27
/*    */     //   17: goto -> 32
/*    */     //   20: aload_3
/*    */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   24: ifeq -> 32
/*    */     //   27: ldc 'wireless'
/*    */     //   29: goto -> 42
/*    */     //   32: aload_1
/*    */     //   33: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   36: invokevirtual ordinal : ()I
/*    */     //   39: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   42: astore_2
/*    */     //   43: getstatic scala/collection/mutable/ArrayBuffer$.MODULE$ : Lscala/collection/mutable/ArrayBuffer$;
/*    */     //   46: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   49: iconst_4
/*    */     //   50: anewarray java/lang/Object
/*    */     //   53: dup
/*    */     //   54: iconst_0
/*    */     //   55: ldc 'redstone_changed'
/*    */     //   57: aastore
/*    */     //   58: dup
/*    */     //   59: iconst_1
/*    */     //   60: aload_2
/*    */     //   61: aastore
/*    */     //   62: dup
/*    */     //   63: iconst_2
/*    */     //   64: aload_1
/*    */     //   65: invokevirtual oldValue : ()I
/*    */     //   68: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   71: aastore
/*    */     //   72: dup
/*    */     //   73: iconst_3
/*    */     //   74: aload_1
/*    */     //   75: invokevirtual newValue : ()I
/*    */     //   78: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   81: aastore
/*    */     //   82: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   85: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*    */     //   88: checkcast scala/collection/mutable/ArrayBuffer
/*    */     //   91: astore #4
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual color : ()I
/*    */     //   97: iconst_0
/*    */     //   98: if_icmplt -> 116
/*    */     //   101: aload #4
/*    */     //   103: aload_1
/*    */     //   104: invokevirtual color : ()I
/*    */     //   107: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   110: invokevirtual $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/ArrayBuffer;
/*    */     //   113: goto -> 119
/*    */     //   116: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   119: pop
/*    */     //   120: aload_0
/*    */     //   121: invokeinterface node : ()Lli/cil/oc/api/network/Component;
/*    */     //   126: ldc 'computer.signal'
/*    */     //   128: aload #4
/*    */     //   130: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */     //   133: invokevirtual Object : ()Lscala/reflect/ClassTag;
/*    */     //   136: invokevirtual toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */     //   139: checkcast [Ljava/lang/Object;
/*    */     //   142: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   147: aload_1
/*    */     //   148: invokevirtual oldValue : ()I
/*    */     //   151: aload_0
/*    */     //   152: invokeinterface wakeThreshold : ()I
/*    */     //   157: if_icmpge -> 219
/*    */     //   160: aload_1
/*    */     //   161: invokevirtual newValue : ()I
/*    */     //   164: aload_0
/*    */     //   165: invokeinterface wakeThreshold : ()I
/*    */     //   170: if_icmplt -> 219
/*    */     //   173: aload_0
/*    */     //   174: invokeinterface wakeNeighborsOnly : ()Z
/*    */     //   179: ifeq -> 202
/*    */     //   182: aload_0
/*    */     //   183: invokeinterface node : ()Lli/cil/oc/api/network/Component;
/*    */     //   188: ldc 'computer.start'
/*    */     //   190: iconst_0
/*    */     //   191: anewarray java/lang/Object
/*    */     //   194: invokeinterface sendToNeighbors : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   199: goto -> 219
/*    */     //   202: aload_0
/*    */     //   203: invokeinterface node : ()Lli/cil/oc/api/network/Component;
/*    */     //   208: ldc 'computer.start'
/*    */     //   210: iconst_0
/*    */     //   211: anewarray java/lang/Object
/*    */     //   214: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   219: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 0
/*    */     //   #40	-> 43
/*    */     //   #41	-> 93
/*    */     //   #42	-> 101
/*    */     //   #41	-> 116
/*    */     //   #43	-> 120
/*    */     //   #44	-> 147
/*    */     //   #45	-> 173
/*    */     //   #46	-> 182
/*    */     //   #48	-> 202
/*    */     //   #38	-> 219
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	220	0	$this	Lli/cil/oc/server/component/RedstoneSignaller;
/*    */     //   0	220	1	args	Lli/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs;
/*    */     //   43	177	2	side	Ljava/lang/Object;
/*    */     //   93	127	4	flatArgs	Lscala/collection/mutable/ArrayBuffer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void load(RedstoneSignaller $this, NBTTagCompound nbt) {
/* 55 */     $this.li$cil$oc$server$component$RedstoneSignaller$$super$load(nbt);
/* 56 */     $this.wakeThreshold_$eq(nbt.func_74762_e("wakeThreshold"));
/*    */   }
/*    */   
/*    */   public static void save(RedstoneSignaller $this, NBTTagCompound nbt) {
/* 60 */     $this.li$cil$oc$server$component$RedstoneSignaller$$super$save(nbt);
/* 61 */     nbt.func_74768_a("wakeThreshold", $this.wakeThreshold());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneSignaller$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */