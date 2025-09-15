/*    */ package li.cil.oc.common.component.traits;
/*    */ import li.cil.oc.util.TextBuffer;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ public abstract class VideoRamDevice$class {
/*    */   public static void $init$(VideoRamDevice $this) {
/*  8 */     $this.li$cil$oc$common$component$traits$VideoRamDevice$_setter_$li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers_$eq(new HashMap());
/*  9 */     $this.li$cil$oc$common$component$traits$VideoRamDevice$_setter_$RESERVED_SCREEN_INDEX_$eq(0);
/*    */   } public static boolean isEmpty(VideoRamDevice $this) {
/* 11 */     return $this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().isEmpty();
/*    */   }
/*    */   public static void onBufferRamDestroy(VideoRamDevice $this, int id) {}
/*    */   public static int[] bufferIndexes(VideoRamDevice $this) {
/* 15 */     return (int[])((TraversableOnce)$this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().collect((PartialFunction)new VideoRamDevice$$anonfun$bufferIndexes$1($this), Iterable$.MODULE$.canBuildFrom()))
/*    */       
/* 17 */       .toArray(ClassTag$.MODULE$.Int());
/*    */   }
/*    */   public static boolean addBuffer(VideoRamDevice $this, GpuTextBuffer ram) {
/* 20 */     boolean preexists = $this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().contains(BoxesRunTime.boxToInteger(ram.id()));
/* 21 */     $this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(ram.id())), ram));
/* 22 */     return preexists;
/*    */   }
/*    */   
/*    */   public static int removeBuffers(VideoRamDevice $this, int[] ids) {
/* 26 */     IntRef count = IntRef.create(0);
/* 27 */     if (Predef$.MODULE$.intArrayOps(ids).nonEmpty()) {
/* 28 */       Predef$.MODULE$.intArrayOps(ids).foreach((Function1)new VideoRamDevice$$anonfun$removeBuffers$1($this, count));
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     return count.elem;
/*    */   }
/*    */   public static int removeAllBuffers(VideoRamDevice $this) {
/* 38 */     return $this.removeBuffers($this.bufferIndexes());
/*    */   }
/*    */   public static void loadBuffer(VideoRamDevice $this, String address, int id, NBTTagCompound nbt) {
/* 41 */     TextBuffer src = new TextBuffer(1, 1, (PackedColor.ColorFormat)PackedColor$SingleBitFormat$.MODULE$);
/* 42 */     src.load(nbt);
/* 43 */     $this.addBuffer(GpuTextBuffer$.MODULE$.wrap(address, id, src));
/*    */   }
/*    */   
/*    */   public static Option getBuffer(VideoRamDevice $this, int id) {
/* 47 */     return $this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().contains(BoxesRunTime.boxToInteger(id)) ? 
/* 48 */       Option$.MODULE$.apply($this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().apply(BoxesRunTime.boxToInteger(id))) : 
/*    */       
/* 50 */       (Option)None$.MODULE$;
/*    */   }
/*    */   
/*    */   public static int nextAvailableBufferIndex(VideoRamDevice $this) {
/* 54 */     int index = $this.RESERVED_SCREEN_INDEX() + 1;
/* 55 */     while ($this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().contains(BoxesRunTime.boxToInteger(index))) {
/* 56 */       index++;
/*    */     }
/* 58 */     return index;
/*    */   }
/*    */   
/*    */   public static int calculateUsedMemory(VideoRamDevice $this) {
/* 62 */     IntRef sum = IntRef.create(0);
/* 63 */     $this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().withFilter((Function1)new VideoRamDevice$$anonfun$calculateUsedMemory$1($this)).foreach((Function1)new VideoRamDevice$$anonfun$calculateUsedMemory$2($this, sum));
/*    */ 
/*    */     
/* 66 */     return sum.elem;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\VideoRamDevice$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */