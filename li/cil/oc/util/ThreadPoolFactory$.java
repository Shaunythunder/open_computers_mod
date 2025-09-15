/*    */ package li.cil.oc.util;
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import li.cil.oc.Settings;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ThreadPoolFactory$ {
/*    */   public static final ThreadPoolFactory$ MODULE$;
/*    */   private final int priority;
/*    */   private final ArrayBuffer<SafeThreadPool> safePools;
/*    */   
/*    */   public int priority() {
/* 16 */     return this.priority;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ScheduledExecutorService create(String name, int threads)
/*    */   {
/* 26 */     return Executors.newScheduledThreadPool(threads, 
/* 27 */         new ThreadPoolFactory$$anon$1(name)); } public final class ThreadPoolFactory$$anon$1 implements ThreadFactory { private final String baseName; private final AtomicInteger threadNumber; private final ThreadGroup group; public ThreadPoolFactory$$anon$1(String name$1) { ThreadGroup threadGroup;
/* 28 */       this.baseName = (new StringBuilder()).append("OpenComputers-").append(name$1).append("-").toString();
/*    */       
/* 30 */       this.threadNumber = new AtomicInteger(1);
/*    */       
/* 32 */       SecurityManager securityManager = System.getSecurityManager();
/* 33 */       if (securityManager == null) { threadGroup = Thread.currentThread().getThreadGroup(); }
/* 34 */       else { threadGroup = securityManager.getThreadGroup(); }
/*    */       
/*    */       this.group = threadGroup; }
/*    */     private String baseName() { return this.baseName; }
/* 38 */     private AtomicInteger threadNumber() { return this.threadNumber; } public Thread newThread(Runnable r) { Thread thread = new Thread(group(), r, (new StringBuilder()).append(baseName()).append(BoxesRunTime.boxToInteger(threadNumber().getAndIncrement())).toString());
/* 39 */       if (!thread.isDaemon()) {
/* 40 */         thread.setDaemon(true);
/*    */       }
/* 42 */       if (thread.getPriority() != ThreadPoolFactory$.MODULE$.priority()) {
/* 43 */         thread.setPriority(ThreadPoolFactory$.MODULE$.priority());
/*    */       }
/* 45 */       return thread; }
/*    */      private ThreadGroup group() {
/*    */       return this.group;
/*    */     } } public ArrayBuffer<SafeThreadPool> safePools() {
/* 49 */     return this.safePools;
/*    */   }
/*    */   public SafeThreadPool createSafePool(String name, int threads) {
/* 52 */     SafeThreadPool handler = new SafeThreadPool(name, threads);
/* 53 */     safePools().$plus$eq(handler);
/* 54 */     return handler;
/*    */   }
/*    */   private ThreadPoolFactory$() {
/*    */     int i;
/* 58 */     MODULE$ = this;
/*    */     Option option = scala.Option$.MODULE$.apply(li.cil.oc.Settings$.MODULE$.get());
/*    */     if (scala.None$.MODULE$.equals(option)) {
/*    */       i = -1;
/*    */     } else if (option instanceof Some) {
/*    */       Some some = (Some)option;
/*    */       Settings settings = (Settings)some.x();
/*    */       i = settings.threadPriority();
/*    */     } else {
/*    */       throw new MatchError(option);
/*    */     } 
/*    */     int custom = i;
/*    */     this.priority = (custom < 1) ? 3 : scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(custom), 1)), 10);
/*    */     this.safePools = (ArrayBuffer<SafeThreadPool>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ThreadPoolFactory$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */