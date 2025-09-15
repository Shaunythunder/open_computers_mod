/*     */ package li.cil.oc.util;
/*     */ import cpw.mods.fml.common.FMLCommonHandler;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import java.nio.ByteBuffer;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.audio.ISound;
/*     */ import net.minecraft.client.audio.PositionedSoundRecord;
/*     */ import net.minecraft.client.audio.SoundCategory;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.openal.AL;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.FloatRef;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ public final class Audio$ {
/*     */   public static final Audio$ MODULE$;
/*     */   private final Set<Audio.Source> sources;
/*     */   private boolean disableAudio;
/*     */   
/*     */   public int li$cil$oc$util$Audio$$sampleRate() {
/*  29 */     return li.cil.oc.Settings$.MODULE$.get().beepSampleRate();
/*     */   } public int li$cil$oc$util$Audio$$amplitude() {
/*  31 */     return li.cil.oc.Settings$.MODULE$.get().beepAmplitude();
/*     */   } public float li$cil$oc$util$Audio$$maxDistance() {
/*  33 */     return li.cil.oc.Settings$.MODULE$.get().beepRadius();
/*     */   } private Set<Audio.Source> sources() {
/*  35 */     return this.sources;
/*     */   } private float volume() {
/*  37 */     return (Minecraft.func_71410_x()).field_71474_y.func_151438_a(SoundCategory.BLOCKS);
/*     */   }
/*  39 */   private boolean disableAudio() { return this.disableAudio; } private void disableAudio_$eq(boolean x$1) { this.disableAudio = x$1; }
/*     */   
/*     */   public void play(float x, float y, float z, int frequencyInHz, int durationInMilliseconds) {
/*  42 */     play(x, y, z, ".", frequencyInHz, durationInMilliseconds);
/*     */   }
/*     */   
/*  45 */   public int play$default$5() { return 1000; } public int play$default$6() { return 200; } public final class Audio$$anonfun$play$2 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*  46 */     public static final long serialVersionUID = 0L; private final float x$4; private final float y$1; private final float z$1; private final int durationInMilliseconds$1; private final Minecraft mc$1; private final float gain$1; private final float clampedFrequency$1; private final IntRef delay$1; public Audio$$anonfun$play$2(float x$4, float y$1, float z$1, int durationInMilliseconds$1, Minecraft mc$1, float gain$1, float clampedFrequency$1, IntRef delay$1) {} public final void apply(char ch) { PositionedSoundRecord record = new PositionedSoundRecord(new ResourceLocation("note.harp"), this.gain$1, this.clampedFrequency$1, this.x$4, this.y$1, this.z$1); if (this.delay$1.elem == 0) { this.mc$1.func_147118_V().func_147682_a((ISound)record); } else { this.mc$1.func_147118_V().func_147681_a((ISound)record, this.delay$1.elem); }  this.delay$1.elem += scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(((ch == '.') ? this.durationInMilliseconds$1 : (2 * this.durationInMilliseconds$1)) * 20 / 1000), 1); } } public void play(float x, float y, float z, String pattern, int frequencyInHz, int durationInMilliseconds) { Minecraft mc = Minecraft.func_71410_x();
/*  47 */     float distanceBasedGain = (float)scala.math.package$.MODULE$.max(0.0D, true - mc.field_71439_g.func_70011_f(x, y, z) / li$cil$oc$util$Audio$$maxDistance());
/*  48 */     float gain = distanceBasedGain * volume();
/*  49 */     if (gain <= false || li$cil$oc$util$Audio$$amplitude() <= 0)
/*     */       return; 
/*  51 */     if (disableAudio()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  58 */       float clampedFrequency = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(frequencyInHz - 20), 0)), 1980) / 1980.0F + 0.5F;
/*  59 */       IntRef delay = IntRef.create(0);
/*  60 */       (new StringOps(scala.Predef$.MODULE$.augmentString(pattern))).foreach((Function1)new Audio$$anonfun$play$2(x, y, z, durationInMilliseconds, mc, gain, clampedFrequency, delay));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  68 */     else if (AL.isCreated()) {
/*  69 */       int[] sampleCounts = 
/*  70 */         (int[])scala.Predef$.MODULE$.intArrayOps((int[])scala.Predef$.MODULE$.charArrayOps(pattern.toCharArray()).map((Function1)new Audio$$anonfun$2(durationInMilliseconds), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Int())))
/*  71 */         .map((Function1)new Audio$$anonfun$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Int()));
/*     */       
/*  73 */       int pauseSampleCount = 50 * li$cil$oc$util$Audio$$sampleRate() / 1000;
/*  74 */       ByteBuffer data = BufferUtils.createByteBuffer(BoxesRunTime.unboxToInt(scala.Predef$.MODULE$.intArrayOps(sampleCounts).sum((Numeric)scala.math.Numeric$IntIsIntegral$.MODULE$)) + (sampleCounts.length - 1) * pauseSampleCount);
/*  75 */       float step = frequencyInHz / li$cil$oc$util$Audio$$sampleRate();
/*  76 */       FloatRef offset = FloatRef.create(0.0F);
/*  77 */       scala.Predef$.MODULE$.intArrayOps(sampleCounts).foreach((Function1)new Audio$$anonfun$play$1(pauseSampleCount, data, step, offset));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  91 */       data.rewind();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/*  97 */         synchronized (sources()) { sources().$plus$eq(new Audio.Source(x, y, z, data, gain)); } 
/*  98 */       } catch (LessUselessOpenALException lessUselessOpenALException) {
/*  99 */         if (lessUselessOpenALException.errorCode() == 40965) {
/*     */           
/* 101 */           li.cil.oc.OpenComputers$.MODULE$.log().info("Couldn't play computer speaker sound because your sound card ran out of memory. Either your sound card is just really low-end, or there are just too many sounds in use already by other mods. Disabling computer speakers to avoid spamming your log file now.");
/* 102 */           disableAudio_$eq(true);
/*     */         } else {
/*     */           
/* 105 */           li.cil.oc.OpenComputers$.MODULE$.log().warn("Error playing computer speaker sound.", (Throwable)lessUselessOpenALException);
/*     */         } 
/*     */       } 
/*     */     }  }
/*     */    public final class Audio$$anonfun$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int durationInMilliseconds$1; public final int apply(char ch) {
/*     */       return (ch == '.') ? this.durationInMilliseconds$1 : (2 * this.durationInMilliseconds$1);
/*     */     } public Audio$$anonfun$2(int durationInMilliseconds$1) {} } public void update() {
/* 113 */     if (!disableAudio())
/* 114 */       synchronized (sources()) { sources().$minus$minus$eq((TraversableOnce)sources().filter((Function1)new Audio$$anonfun$update$1()));
/*     */ 
/*     */         
/* 117 */         if (AL.isCreated())
/* 118 */           try { AL10.alGetError(); } catch (UnsatisfiedLinkError unsatisfiedLinkError)
/*     */           
/* 120 */           { li.cil.oc.OpenComputers$.MODULE$.log().warn("Negotiations with OpenAL broke down, disabling sounds.");
/* 121 */             disableAudio_$eq(true); }
/*     */             }
/*     */        
/*     */   }
/*     */   public final class Audio$$anonfun$1 extends AbstractFunction1.mcII.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final int apply(int x$1) {
/*     */       return apply$mcII$sp(x$1);
/*     */     }
/*     */     public int apply$mcII$sp(int x$1) {
/*     */       return x$1 * Audio$.MODULE$.li$cil$oc$util$Audio$$sampleRate() / 1000;
/*     */     } }
/*     */   public final class Audio$$anonfun$play$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int pauseSampleCount$1;
/*     */     public final ByteBuffer data$1;
/*     */     public final float step$1;
/*     */     public final FloatRef offset$1;
/*     */     
/*     */     public final void apply(int sampleCount) {
/*     */       apply$mcVI$sp(sampleCount);
/*     */     }
/*     */     
/*     */     public Audio$$anonfun$play$1(int pauseSampleCount$1, ByteBuffer data$1, float step$1, FloatRef offset$1) {}
/*     */     
/*     */     public void apply$mcVI$sp(int sampleCount) {
/*     */       scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), sampleCount).foreach((Function1)new Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1(this));
/*     */       if (this.data$1.hasRemaining())
/*     */         scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), this.pauseSampleCount$1).foreach((Function1)new Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2(this)); 
/*     */     }
/*     */     
/*     */     public final class Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<Object, ByteBuffer> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1(Audio$$anonfun$play$1 $outer) {}
/*     */       
/*     */       public final ByteBuffer apply(int sample) {
/*     */         double angle = 6.283185307179586D * this.$outer.offset$1.elem;
/*     */         int value = (byte)(int)(scala.math.package$.MODULE$.signum(scala.math.package$.MODULE$.sin(angle)) * Audio$.MODULE$.li$cil$oc$util$Audio$$amplitude()) ^ 0x80;
/*     */         this.$outer.offset$1.elem += this.$outer.step$1;
/*     */         if (this.$outer.offset$1.elem > true)
/*     */           this.$outer.offset$1.elem -= true; 
/*     */         return this.$outer.data$1.put((byte)value);
/*     */       } }
/*     */     
/*     */     public final class Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1<Object, ByteBuffer> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2(Audio$$anonfun$play$1 $outer) {}
/*     */       
/*     */       public final ByteBuffer apply(int sample) {
/*     */         return this.$outer.data$1.put(127);
/*     */       } } }
/*     */   
/*     */   public final class Audio$$anonfun$update$1 extends AbstractFunction1<Audio.Source, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Audio.Source x$2) {
/*     */       return x$2.checkFinished();
/*     */     } }
/*     */   
/*     */   public void checkALError() {
/* 182 */     int errorCode = AL10.alGetError();
/* 183 */     if (errorCode != 0) {
/* 184 */       throw new Audio.LessUselessOpenALException(errorCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onTick(TickEvent.ClientTickEvent e) {
/* 192 */     update();
/*     */   } private Audio$() {
/* 194 */     MODULE$ = this;
/*     */     this.sources = scala.collection.mutable.Set$.MODULE$.empty();
/*     */     this.disableAudio = false;
/*     */     FMLCommonHandler.instance().bus().register(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Audio$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */