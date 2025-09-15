/*    */ package li.cil.oc.common.component.traits;
/*    */ import li.cil.oc.common.component.GpuTextBuffer;
/*    */ import li.cil.oc.util.TextBuffer;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ public abstract class VideoRamRasterizer$class {
/*    */   public static void $init$(VideoRamRasterizer $this) {
/* 12 */     $this.li$cil$oc$common$component$traits$VideoRamRasterizer$_setter_$li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers_$eq(new HashMap());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean addBuffer(VideoRamRasterizer $this, GpuTextBuffer ram) {
/* 19 */     Option gpu = $this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers().get(ram.owner());
/*    */     
/* 21 */     gpu = Option$.MODULE$.apply(new VideoRamRasterizer.VirtualRamDevice($this, ram.owner()));
/* 22 */     gpu.isEmpty() ? $this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(ram.owner()), gpu.get())) : BoxedUnit.UNIT;
/*    */     
/* 24 */     boolean preexists = ((VideoRamDevice)gpu.get()).addBuffer(ram);
/* 25 */     if (!preexists || ram.dirty()) {
/* 26 */       $this.onBufferRamInit(ram);
/*    */     }
/* 28 */     return preexists;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean removeBuffer(VideoRamRasterizer $this, String owner, int id) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers : ()Lscala/collection/mutable/HashMap;
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual get : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   10: astore_3
/*    */     //   11: aload_3
/*    */     //   12: instanceof scala/Some
/*    */     //   15: ifeq -> 133
/*    */     //   18: aload_3
/*    */     //   19: checkcast scala/Some
/*    */     //   22: astore #4
/*    */     //   24: aload #4
/*    */     //   26: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   29: checkcast li/cil/oc/common/component/traits/VideoRamDevice
/*    */     //   32: astore #5
/*    */     //   34: aload #5
/*    */     //   36: ifnull -> 133
/*    */     //   39: aload #5
/*    */     //   41: astore #6
/*    */     //   43: aload #6
/*    */     //   45: iload_2
/*    */     //   46: invokeinterface getBuffer : (I)Lscala/Option;
/*    */     //   51: astore #8
/*    */     //   53: aload #8
/*    */     //   55: instanceof scala/Some
/*    */     //   58: ifeq -> 123
/*    */     //   61: aload #8
/*    */     //   63: checkcast scala/Some
/*    */     //   66: astore #9
/*    */     //   68: aload #9
/*    */     //   70: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   73: checkcast li/cil/oc/common/component/GpuTextBuffer
/*    */     //   76: astore #10
/*    */     //   78: aload #10
/*    */     //   80: ifnull -> 123
/*    */     //   83: aload #10
/*    */     //   85: astore #11
/*    */     //   87: aload_0
/*    */     //   88: aload #11
/*    */     //   90: invokeinterface onBufferRamDestroy : (Lli/cil/oc/common/component/GpuTextBuffer;)V
/*    */     //   95: aload #6
/*    */     //   97: iconst_1
/*    */     //   98: newarray int
/*    */     //   100: dup
/*    */     //   101: iconst_0
/*    */     //   102: iload_2
/*    */     //   103: iastore
/*    */     //   104: invokeinterface removeBuffers : ([I)I
/*    */     //   109: iconst_1
/*    */     //   110: if_icmpne -> 117
/*    */     //   113: iconst_1
/*    */     //   114: goto -> 118
/*    */     //   117: iconst_0
/*    */     //   118: istore #12
/*    */     //   120: goto -> 126
/*    */     //   123: iconst_0
/*    */     //   124: istore #12
/*    */     //   126: iload #12
/*    */     //   128: istore #7
/*    */     //   130: goto -> 136
/*    */     //   133: iconst_0
/*    */     //   134: istore #7
/*    */     //   136: iload #7
/*    */     //   138: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 0
/*    */     //   #33	-> 11
/*    */     //   #34	-> 43
/*    */     //   #35	-> 53
/*    */     //   #36	-> 87
/*    */     //   #37	-> 95
/*    */     //   #35	-> 118
/*    */     //   #39	-> 123
/*    */     //   #34	-> 126
/*    */     //   #42	-> 133
/*    */     //   #32	-> 136
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	139	0	$this	Lli/cil/oc/common/component/traits/VideoRamRasterizer;
/*    */     //   0	139	1	owner	Ljava/lang/String;
/*    */     //   0	139	2	id	I
/*    */     //   34	105	5	gpu	Lli/cil/oc/common/component/traits/VideoRamDevice;
/*    */     //   78	61	10	ram	Lli/cil/oc/common/component/GpuTextBuffer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int removeAllBuffers(VideoRamRasterizer $this, String owner) {
/* 47 */     IntRef count = IntRef.create(0);
/* 48 */     Option option = $this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers().get(owner);
/* 49 */     if (option instanceof Some) { Some some = (Some)option; VideoRamDevice gpu = (VideoRamDevice)some.x(); if (gpu != null) { VideoRamDevice videoRamDevice = gpu;
/* 50 */         int[] ids = videoRamDevice.bufferIndexes();
/* 51 */         Predef$.MODULE$.intArrayOps(ids).foreach((Function1)new VideoRamRasterizer$$anonfun$removeAllBuffers$1($this, count, owner)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 59 */         return count.elem; }  }  Unit$ unit$ = Unit$.MODULE$; return count.elem;
/*    */   }
/*    */   
/*    */   public static int removeAllBuffers(VideoRamRasterizer $this) {
/* 63 */     IntRef count = IntRef.create(0);
/* 64 */     $this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers().withFilter((Function1)new VideoRamRasterizer$$anonfun$removeAllBuffers$2($this)).foreach((Function1)new VideoRamRasterizer$$anonfun$removeAllBuffers$3($this, count));
/*    */ 
/*    */     
/* 67 */     return count.elem;
/*    */   }
/*    */   
/*    */   public static boolean loadBuffer(VideoRamRasterizer $this, String owner, int id, NBTTagCompound nbt) {
/* 71 */     TextBuffer src = new TextBuffer(1, 1, (PackedColor.ColorFormat)PackedColor$SingleBitFormat$.MODULE$);
/* 72 */     src.load(nbt);
/* 73 */     return $this.addBuffer(GpuTextBuffer$.MODULE$.wrap(owner, id, src));
/*    */   }
/*    */   
/*    */   public static Option getBuffer(VideoRamRasterizer $this, String owner, int id) {
/* 77 */     Option option = $this.li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers().get(owner);
/* 78 */     if (option instanceof Some) { Some some = (Some)option; VideoRamDevice gpu = (VideoRamDevice)some.x(); if (gpu != null) { VideoRamDevice videoRamDevice = gpu; return videoRamDevice.getBuffer(id); }  }
/* 79 */      return (Option)None$.MODULE$;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\VideoRamRasterizer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */