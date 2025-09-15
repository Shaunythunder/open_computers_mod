/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import li.cil.oc.util.SafeThreadPool;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Buffered$
/*    */ {
/*    */   public static final Buffered$ MODULE$;
/*    */   private final SafeThreadPool fileSaveHandler;
/*    */   
/*    */   public SafeThreadPool fileSaveHandler() {
/* 21 */     return this.fileSaveHandler;
/*    */   }
/*    */   private Buffered$() {
/* 24 */     MODULE$ = this;
/*    */     this.fileSaveHandler = li.cil.oc.util.ThreadPoolFactory$.MODULE$.createSafePool("FileSystem", 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\Buffered$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */