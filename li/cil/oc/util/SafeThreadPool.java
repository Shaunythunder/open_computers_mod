/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import java.util.concurrent.Future;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import li.cil.oc.OpenComputers$;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.Null$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001e4A!\001\002\001\027\tq1+\0314f)\"\024X-\0313Q_>d'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001a\005\002\001\031A\021Q\002E\007\002\035)\tq\"A\003tG\006d\027-\003\002\022\035\t1\021I\\=SK\032D\001b\005\001\003\006\004%\t\001F\001\005]\006lW-F\001\026!\t1\022D\004\002\016/%\021\001DD\001\007!J,G-\0324\n\005iY\"AB*ue&twM\003\002\031\035!AQ\004\001B\001B\003%Q#A\003oC6,\007\005\003\005 \001\t\025\r\021\"\001!\003\035!\bN]3bIN,\022!\t\t\003\033\tJ!a\t\b\003\007%sG\017\003\005&\001\t\005\t\025!\003\"\003!!\bN]3bIN\004\003\"B\024\001\t\003A\023A\002\037j]&$h\bF\002*W1\002\"A\013\001\016\003\tAQa\005\024A\002UAQa\b\024A\002\005B\021B\f\001A\002\003\007I\021B\030\002\027}#\bN]3bIB{w\016\\\013\002aA\021\021gN\007\002e)\0211\007N\001\013G>t7-\036:sK:$(BA\0026\025\0051\024\001\0026bm\006L!\001\017\032\0031M\033\007.\0323vY\026$W\t_3dkR|'oU3sm&\034W\rC\005;\001\001\007\t\031!C\005w\005yq\f\0365sK\006$\007k\\8m?\022*\027\017\006\002=A\021Q\"P\005\003}9\021A!\0268ji\"9\001)OA\001\002\004\001\024a\001=%c!1!\t\001Q!\nA\nAb\030;ie\026\fG\rU8pY\002BQ\001\022\001\005\002\025\013\001b^5uQB{w\016\034\013\004\rb\023\007cA\007H\023&\021\001J\004\002\007\037B$\030n\03481\005){\005cA\031L\033&\021AJ\r\002\007\rV$XO]3\021\0059{E\002\001\003\n!\016\013\t\021!A\003\002E\0231a\030\0233#\t\021V\013\005\002\016'&\021AK\004\002\b\035>$\b.\0338h!\tia+\003\002X\035\t\031\021I\\=\t\013e\033\005\031\001.\002\003\031\004B!D.1;&\021AL\004\002\n\rVt7\r^5p]F\002$A\0301\021\007EZu\f\005\002OA\022I\021\rWA\001\002\003\025\t!\025\002\004?\022\n\004bB2D!\003\005\r\001Z\001\re\026\fX/\033:fgB{w\016\034\t\003\033\025L!A\032\b\003\017\t{w\016\\3b]\")\001\016\001C\001S\006ia.Z<UQJ,\027\r\032)p_2$\022\001\020\005\006W\002!\t![\001\022o\006LGOR8s\007>l\007\017\\3uS>t\007bB7\001#\003%\tA\\\001\023o&$\b\016U8pY\022\"WMZ1vYR$#'F\001pU\t!\007oK\001r!\t\021x/D\001t\025\t!X/A\005v]\016DWmY6fI*\021aOD\001\013C:tw\016^1uS>t\027B\001=t\005E)hn\0315fG.,GMV1sS\006t7-\032")
/*     */ public class SafeThreadPool
/*     */ {
/*     */   private final String name;
/*     */   private final int threads;
/*     */   private ScheduledExecutorService _threadPool;
/*     */   
/*     */   public String name() {
/*  58 */     return this.name; } public int threads() { return this.threads; }
/*  59 */   private ScheduledExecutorService _threadPool() { return this._threadPool; } public SafeThreadPool(String name, int threads) {} private void _threadPool_$eq(ScheduledExecutorService x$1) { this._threadPool = x$1; }
/*     */   
/*  61 */   public boolean withPool$default$2() { return true; } public Option<Future<?>> withPool(Function1 f, boolean requiresPool) {
/*  62 */     if (_threadPool() == null) {
/*  63 */       OpenComputers$.MODULE$.log().warn("Error handling file saving: Did the server never start?");
/*  64 */       if (requiresPool) {
/*  65 */         OpenComputers$.MODULE$.log().warn("Creating new thread pool.");
/*  66 */         newThreadPool();
/*     */       } else {
/*  68 */         return (Option<Future<?>>)None$.MODULE$;
/*     */       } 
/*  70 */     } else if (_threadPool().isShutdown() || _threadPool().isTerminated()) {
/*  71 */       OpenComputers$.MODULE$.log().warn("Error handling file saving: Thread pool shut down!");
/*  72 */       if (requiresPool) {
/*  73 */         OpenComputers$.MODULE$.log().warn("Creating new thread pool.");
/*  74 */         newThreadPool();
/*     */       } else {
/*  76 */         return (Option<Future<?>>)None$.MODULE$;
/*     */       } 
/*     */     } 
/*  79 */     return Option$.MODULE$.apply(f.apply(_threadPool()));
/*     */   }
/*     */   
/*     */   public void newThreadPool() {
/*  83 */     (_threadPool() == null || _threadPool().isTerminated()) ? BoxedUnit.UNIT : 
/*  84 */       _threadPool().shutdownNow();
/*     */     
/*  86 */     _threadPool_$eq(ThreadPoolFactory$.MODULE$.create(name(), threads()));
/*     */   }
/*     */   public void waitForCompletion() {
/*  89 */     withPool((Function1<ScheduledExecutorService, Future<?>>)new SafeThreadPool$$anonfun$waitForCompletion$1(this), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 105 */         false);
/*     */   }
/*     */   
/*     */   public final class SafeThreadPool$$anonfun$waitForCompletion$1 extends AbstractFunction1<ScheduledExecutorService, Null$> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public SafeThreadPool$$anonfun$waitForCompletion$1(SafeThreadPool $outer) {}
/*     */     
/*     */     public final Null$ apply(ScheduledExecutorService threadPool) {
/*     */       try {
/*     */         threadPool.shutdown();
/*     */         boolean terminated = threadPool.awaitTermination(15L, TimeUnit.SECONDS);
/*     */         OpenComputers$.MODULE$.log().warn("Warning: Completing all tasks has already taken 15 seconds!");
/*     */         terminated = threadPool.awaitTermination(105L, TimeUnit.SECONDS);
/*     */         OpenComputers$.MODULE$.log().error("Warning: Completing all tasks has already taken two minutes! Aborting");
/*     */       } catch (InterruptedException interruptedException) {
/*     */         interruptedException.printStackTrace();
/*     */       } 
/*     */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\SafeThreadPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */