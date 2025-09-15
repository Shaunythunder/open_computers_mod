/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\0015;Q!\001\002\t\002-\t\021\003\0265sK\006$\007k\\8m\r\006\034Go\034:z\025\t\031A!\001\003vi&d'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001A\021A\"D\007\002\005\031)aB\001E\001\037\t\tB\013\033:fC\022\004vn\0347GC\016$xN]=\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!9!$\004b\001\n\003Y\022\001\0039sS>\024\030\016^=\026\003q\001\"!E\017\n\005y\021\"aA%oi\"1\001%\004Q\001\nq\t\021\002\035:j_JLG/\037\021\t\013\tjA\021A\022\002\r\r\024X-\031;f)\r!SF\016\t\003K-j\021A\n\006\003O!\n!bY8oGV\024(/\0328u\025\t\031\021FC\001+\003\021Q\027M^1\n\00512#\001G*dQ\026$W\017\\3e\013b,7-\036;peN+'O^5dK\")a&\ta\001_\005!a.Y7f!\t\0014G\004\002\022c%\021!GE\001\007!J,G-\0324\n\005Q*$AB*ue&twM\003\0023%!)q'\ta\0019\0059A\017\033:fC\022\034\bbB\035\016\005\004%\tAO\001\ng\0064W\rU8pYN,\022a\017\t\004y\005\033U\"A\037\013\005yz\024aB7vi\006\024G.\032\006\003\001J\t!bY8mY\026\034G/[8o\023\t\021UHA\006BeJ\f\027PQ;gM\026\024\bC\001\007E\023\t)%A\001\bTC\032,G\013\033:fC\022\004vn\0347\t\r\035k\001\025!\003<\003)\031\030MZ3Q_>d7\017\t\005\006\0236!\tAS\001\017GJ,\027\r^3TC\032,\007k\\8m)\r\0315\n\024\005\006]!\003\ra\f\005\006o!\003\r\001\b")
/*    */ public final class ThreadPoolFactory {
/*    */   public static SafeThreadPool createSafePool(String paramString, int paramInt) {
/*    */     return ThreadPoolFactory$.MODULE$.createSafePool(paramString, paramInt);
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<SafeThreadPool> safePools() {
/*    */     return ThreadPoolFactory$.MODULE$.safePools();
/*    */   }
/*    */   
/*    */   public static ScheduledExecutorService create(String paramString, int paramInt) {
/*    */     return ThreadPoolFactory$.MODULE$.create(paramString, paramInt);
/*    */   }
/*    */   
/*    */   public static int priority() {
/*    */     return ThreadPoolFactory$.MODULE$.priority();
/*    */   }
/*    */   
/*    */   public final class ThreadPoolFactory$$anon$1 implements ThreadFactory {
/*    */     private final String baseName;
/*    */     
/*    */     public ThreadPoolFactory$$anon$1(String name$1) { ThreadGroup threadGroup;
/* 28 */       this.baseName = (new StringBuilder()).append("OpenComputers-").append(name$1).append("-").toString();
/*    */       
/* 30 */       this.threadNumber = new AtomicInteger(1);
/*    */       
/* 32 */       SecurityManager securityManager = System.getSecurityManager();
/* 33 */       if (securityManager == null) { threadGroup = Thread.currentThread().getThreadGroup(); }
/* 34 */       else { threadGroup = securityManager.getThreadGroup(); }
/*    */       
/*    */       this.group = threadGroup; }
/*    */     private final AtomicInteger threadNumber; private final ThreadGroup group; private String baseName() { return this.baseName; } public Thread newThread(Runnable r) {
/* 38 */       Thread thread = new Thread(group(), r, (new StringBuilder()).append(baseName()).append(BoxesRunTime.boxToInteger(threadNumber().getAndIncrement())).toString());
/* 39 */       if (!thread.isDaemon()) {
/* 40 */         thread.setDaemon(true);
/*    */       }
/* 42 */       if (thread.getPriority() != ThreadPoolFactory$.MODULE$.priority()) {
/* 43 */         thread.setPriority(ThreadPoolFactory$.MODULE$.priority());
/*    */       }
/* 45 */       return thread;
/*    */     }
/*    */     
/*    */     private AtomicInteger threadNumber() {
/*    */       return this.threadNumber;
/*    */     }
/*    */     
/*    */     private ThreadGroup group() {
/*    */       return this.group;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ThreadPoolFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */