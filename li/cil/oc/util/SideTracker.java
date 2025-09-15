/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import cpw.mods.fml.common.FMLCommonHandler;
/*    */ import java.util.Collections;
/*    */ import java.util.Set;
/*    */ import java.util.WeakHashMap;
/*    */ 
/*    */ public final class SideTracker {
/*  9 */   private static final Set<Thread> serverThreads = Collections.newSetFromMap(new WeakHashMap<>());
/*    */   
/*    */   public static void addServerThread() {
/* 12 */     serverThreads.add(Thread.currentThread());
/*    */   }
/*    */   
/*    */   public static boolean isServer() {
/* 16 */     return (FMLCommonHandler.instance().getEffectiveSide().isServer() || serverThreads
/* 17 */       .contains(Thread.currentThread()));
/*    */   }
/*    */   
/*    */   public static boolean isClient() {
/* 21 */     return !isServer();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\SideTracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */