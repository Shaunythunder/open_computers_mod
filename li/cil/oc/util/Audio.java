/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import net.minecraft.client.audio.ISound;
/*     */ import net.minecraft.client.audio.PositionedSoundRecord;
/*     */ import org.lwjgl.openal.AL10;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005=w!B\001\003\021\003Y\021!B!vI&|'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\003Bk\022Lwn\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\013iiA\021B\016\002\025M\fW\016\0357f%\006$X-F\001\035!\t\tR$\003\002\037%\t\031\021J\034;\t\013\001jA\021B\016\002\023\005l\007\017\\5uk\022,\007\"\002\022\016\t\023\031\023aC7bq\022K7\017^1oG\026,\022\001\n\t\003#\025J!A\n\n\003\013\031cw.\031;\t\017!j!\031!C\005S\00591o\\;sG\026\034X#\001\026\021\007-\002$'D\001-\025\tic&A\004nkR\f'\r\\3\013\005=\022\022AC2pY2,7\r^5p]&\021\021\007\f\002\004'\026$\bCA\0325\033\005ia\001B\033\016\tY\022aaU8ve\016,7C\001\033\021\021!ADG!b\001\n\003\031\023!\001=\t\021i\"$\021!Q\001\n\021\n!\001\037\021\t\021q\"$\021!Q\001\n\021\n\021!\037\005\t}Q\022\t\021)A\005I\005\t!\020\003\005Ai\t\025\r\021\"\001B\003\021!\027\r^1\026\003\t\003\"a\021%\016\003\021S!!\022$\002\0079LwNC\001H\003\021Q\027M^1\n\005%#%A\003\"zi\026\024UO\0324fe\"A1\n\016B\001B\003%!)A\003eCR\f\007\005\003\005Ni\t\025\r\021\"\001$\003\0219\027-\0338\t\021=#$\021!Q\001\n\021\nQaZ1j]\002BQa\006\033\005\002E#bA\r*T)V3\006\"\002\035Q\001\004!\003\"\002\037Q\001\004!\003\"\002 Q\001\004!\003\"\002!Q\001\004\021\005\"B'Q\001\004!\003B\003-5!\003\005\031\021)A\0053\006\031\001\020J\032\021\tEQF\004H\005\0037J\021a\001V;qY\026\024\004bB/5\005\004%\taG\001\007g>,(oY3\t\r}#\004\025!\003\035\003\035\031x.\036:dK\002Bq!\031\033C\002\023\0051$\001\004ck\0324WM\035\005\007GR\002\013\021\002\017\002\017\t,hMZ3sA!)Q\r\016C\001M\006i1\r[3dW\032Kg.[:iK\022,\022a\032\t\003#!L!!\033\n\003\017\t{w\016\\3b]\"11.\004Q\001\n)\n\001b]8ve\016,7\017\t\005\006[6!IaI\001\007m>dW/\\3\t\017=l\001\031!C\005M\006aA-[:bE2,\027)\0363j_\"9\021/\004a\001\n\023\021\030\001\0053jg\006\024G.Z!vI&|w\fJ3r)\t\031h\017\005\002\022i&\021QO\005\002\005+:LG\017C\004xa\006\005\t\031A4\002\007a$\023\007\003\004z\033\001\006KaZ\001\016I&\034\030M\0317f\003V$\027n\034\021\t\013mlA\021\001?\002\tAd\027-\037\013\tgvtx0!\001\002\006!)\001H\037a\001I!)AH\037a\001I!)aH\037a\001I!1\0211\001>A\002q\tQB\032:fcV,gnY=J]\"S\bBBA\004u\002\007A$\001\fekJ\fG/[8o\023:l\025\016\0347jg\026\034wN\0343t\021\031YX\002\"\001\002\fQi1/!\004\002\020\005E\0211CA\023\003OAa\001OA\005\001\004!\003B\002\037\002\n\001\007A\005\003\004?\003\023\001\r\001\n\005\t\003+\tI\0011\001\002\030\0059\001/\031;uKJt\007\003BA\r\003?q1!EA\016\023\r\tiBE\001\007!J,G-\0324\n\t\005\005\0221\005\002\007'R\024\030N\\4\013\007\005u!\003C\005\002\004\005%\001\023!a\0019!I\021qAA\005!\003\005\r\001\b\005\b\003WiA\021AA\027\003\031)\b\017Z1uKR\t1O\002\004\00225\001\0211\007\002\033\031\026\0348/V:fY\026\0348o\0249f]\006cU\t_2faRLwN\\\n\005\003_\t)\004\005\003\0028\005\025SBAA\035\025\021\tY$!\020\002\r=\004XM\\1m\025\021\ty$!\021\002\0131<(n\0327\013\005\005\r\023aA8sO&!\021qIA\035\005=y\005/\0328B\031\026C8-\0329uS>t\007BCA&\003_\021)\031!C\0017\005IQM\035:pe\016{G-\032\005\013\003\037\nyC!A!\002\023a\022AC3se>\0248i\0343fA!9q#a\f\005\002\005MC\003BA+\003/\0022aMA\030\021\035\tY%!\025A\002qAq!a\027\016\t\003\ti#\001\007dQ\026\0347.\021'FeJ|'\017C\004\002`5!\t!!\031\002\r=tG+[2l)\r\031\0301\r\005\t\003K\ni\0061\001\002h\005\tQ\r\005\003\002j\005ue\002BA6\003/sA!!\034\002\022:!\021qNAF\035\021\t\t(!\"\017\t\005M\024q\020\b\005\003k\nY(\004\002\002x)\031\021\021\020\006\002\rq\022xn\034;?\023\t\ti(A\002da^LA!!!\002\004\006!Qn\0343t\025\t\ti(\003\003\002\b\006%\025a\0014nY*!\021\021QAB\023\021\ti)a$\002\r\r|W.\\8o\025\021\t9)!#\n\t\005M\025QS\001\nO\006lW-\032<f]RTA!!$\002\020&!\021\021TAN\003%!\026nY6Fm\026tGO\003\003\002\024\006U\025\002BAP\003C\023qb\0217jK:$H+[2l\013Z,g\016\036\006\005\0033\013Y\n\013\003\002^\005\025\006\003BAT\003[k!!!+\013\t\005-\026QS\001\rKZ,g\016\0365b]\022dWM]\005\005\003_\013IK\001\bTk\n\0348M]5cK\0263XM\034;\t\023\005MV\"%A\005\002\005U\026A\0049mCf$C-\0324bk2$H%N\013\003\003oS3\001HA]W\t\tY\f\005\003\002>\006\035WBAA`\025\021\t\t-a1\002\023Ut7\r[3dW\026$'bAAc%\005Q\021M\0348pi\006$\030n\0348\n\t\005%\027q\030\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007\"CAg\033E\005I\021AA[\0039\001H.Y=%I\0264\027-\0367uIY\002")
/*     */ public final class Audio {
/*     */   public static int play$default$6() {
/*     */     return Audio$.MODULE$.play$default$6();
/*     */   }
/*     */   
/*     */   public static int play$default$5() {
/*     */     return Audio$.MODULE$.play$default$5();
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onTick(TickEvent.ClientTickEvent paramClientTickEvent) {
/*     */     Audio$.MODULE$.onTick(paramClientTickEvent);
/*     */   }
/*     */   
/*     */   public static void checkALError() {
/*     */     Audio$.MODULE$.checkALError();
/*     */   }
/*     */   
/*     */   public static void update() {
/*     */     Audio$.MODULE$.update();
/*     */   }
/*     */   
/*     */   public static void play(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, int paramInt1, int paramInt2) {
/*     */     Audio$.MODULE$.play(paramFloat1, paramFloat2, paramFloat3, paramString, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void play(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2) {
/*     */     Audio$.MODULE$.play(paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public final class Audio$$anonfun$play$2 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final float x$4;
/*     */     private final float y$1;
/*     */     private final float z$1;
/*     */     private final int durationInMilliseconds$1;
/*     */     private final Minecraft mc$1;
/*     */     private final float gain$1;
/*     */     private final float clampedFrequency$1;
/*     */     private final IntRef delay$1;
/*     */     
/*     */     public Audio$$anonfun$play$2(float x$4, float y$1, float z$1, int durationInMilliseconds$1, Minecraft mc$1, float gain$1, float clampedFrequency$1, IntRef delay$1) {}
/*     */     
/*     */     public final void apply(char ch) {
/*  61 */       PositionedSoundRecord record = new PositionedSoundRecord(new ResourceLocation("note.harp"), this.gain$1, this.clampedFrequency$1, this.x$4, this.y$1, this.z$1);
/*  62 */       if (this.delay$1.elem == 0) { this.mc$1.func_147118_V().func_147682_a((ISound)record); }
/*  63 */       else { this.mc$1.func_147118_V().func_147681_a((ISound)record, this.delay$1.elem); }
/*  64 */        this.delay$1.elem += RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(((ch == '.') ? this.durationInMilliseconds$1 : (2 * this.durationInMilliseconds$1)) * 20 / 1000), 1);
/*     */     } }
/*     */   
/*     */   public final class Audio$$anonfun$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final int durationInMilliseconds$1;
/*     */     
/*  70 */     public final int apply(char ch) { return (ch == '.') ? this.durationInMilliseconds$1 : (2 * this.durationInMilliseconds$1); } public Audio$$anonfun$2(int durationInMilliseconds$1) {} } public final class Audio$$anonfun$1 extends AbstractFunction1.mcII.sp implements Serializable { public static final long serialVersionUID = 0L;
/*  71 */     public final int apply(int x$1) { return apply$mcII$sp(x$1); } public int apply$mcII$sp(int x$1) { return x$1 * Audio$.MODULE$.li$cil$oc$util$Audio$$sampleRate() / 1000; }
/*     */      }
/*     */   public final class Audio$$anonfun$play$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int pauseSampleCount$1; public final ByteBuffer data$1;
/*     */     public final float step$1;
/*     */     public final FloatRef offset$1;
/*     */     
/*  77 */     public final void apply(int sampleCount) { apply$mcVI$sp(sampleCount); } public Audio$$anonfun$play$1(int pauseSampleCount$1, ByteBuffer data$1, float step$1, FloatRef offset$1) {}
/*  78 */     public void apply$mcVI$sp(int sampleCount) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), sampleCount).foreach((Function1)new Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       if (this.data$1.hasRemaining()) RichInt$.MODULE$
/*  86 */           .until$extension0(Predef$.MODULE$.intWrapper(0), this.pauseSampleCount$1).foreach((Function1)new Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2(this));  } public final class Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<Object, ByteBuffer> implements Serializable {
/*  87 */       public static final long serialVersionUID = 0L; public Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$1(Audio$$anonfun$play$1 $outer) {} public final ByteBuffer apply(int sample) { double angle = 6.283185307179586D * this.$outer.offset$1.elem; int value = (byte)(int)(package$.MODULE$.signum(package$.MODULE$.sin(angle)) * Audio$.MODULE$.li$cil$oc$util$Audio$$amplitude()) ^ 0x80; this.$outer.offset$1.elem += this.$outer.step$1; if (this.$outer.offset$1.elem > true) this.$outer.offset$1.elem -= true;  return this.$outer.data$1.put((byte)value); } } public final class Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1<Object, ByteBuffer> implements Serializable { public final ByteBuffer apply(int sample) { return this.$outer.data$1.put(127); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Audio$$anonfun$play$1$$anonfun$apply$mcVI$sp$2(Audio$$anonfun$play$1 $outer) {} }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Audio$$anonfun$update$1
/*     */     extends AbstractFunction1<Source, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(Audio.Source x$2) {
/* 114 */       return x$2.checkFinished();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class Source {
/*     */     private final float x;
/*     */     private final float y;
/*     */     private final float z;
/*     */     private final ByteBuffer data;
/*     */     private final float gain;
/*     */     private final int source;
/*     */     private final int buffer;
/*     */     
/* 127 */     public float x() { return this.x; } public ByteBuffer data() { return this.data; } public float gain() { return this.gain; }
/*     */     
/* 129 */     public Source(float x, float y, float z, ByteBuffer data, float gain) { AL10.alGetError();
/*     */ 
/*     */       
/* 132 */       int buffer = AL10.alGenBuffers();
/* 133 */       Audio$.MODULE$.checkALError();
/*     */       
/* 135 */       Tuple2 tuple2 = liftedTree1$1(buffer); if (tuple2 != null) { int source = tuple2._1$mcI$sp(), i = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp = new Tuple2.mcII.sp(source, i); this.source = this.x$3._1$mcI$sp(); this.buffer = this.x$3._2$mcI$sp(); return; }  throw new MatchError(tuple2); }
/* 136 */     public int source() { return this.source; } private final Tuple2 liftedTree1$1(int buffer$1) { try { AL10.alBufferData(buffer$1, 4352, data(), Audio$.MODULE$.li$cil$oc$util$Audio$$sampleRate());
/* 137 */         Audio$.MODULE$.checkALError();
/*     */         
/* 139 */         int source = AL10.alGenSources();
/* 140 */         Audio$.MODULE$.checkALError();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       finally
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 165 */         AL10.alDeleteBuffers(buffer$1); }
/*     */        }
/*     */      public int buffer() {
/*     */       return this.buffer;
/*     */     } public boolean checkFinished() {
/* 170 */       if (AL10.alGetSourcei(source(), 4112) != 4114) {
/* 171 */         AL10.alDeleteSources(source());
/* 172 */         AL10.alDeleteBuffers(buffer());
/*     */         if (true);
/*     */       } 
/*     */       return false;
/*     */     } }
/*     */   public static class LessUselessOpenALException extends OpenALException { private final int errorCode;
/* 178 */     public int errorCode() { return this.errorCode; } public LessUselessOpenALException(int errorCode) { super(errorCode); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Audio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */