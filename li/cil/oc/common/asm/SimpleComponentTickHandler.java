/*    */ package li.cil.oc.common.asm;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import cpw.mods.fml.common.gameevent.TickEvent;
/*    */ import java.util.ArrayList;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.util.SideTracker;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ public final class SimpleComponentTickHandler
/*    */ {
/* 15 */   private static final Logger log = LogManager.getLogger("OpenComputers");
/*    */   
/* 17 */   public static final ArrayList<Runnable> pending = new ArrayList<>();
/*    */   
/* 19 */   public static final SimpleComponentTickHandler Instance = new SimpleComponentTickHandler();
/*    */ 
/*    */ 
/*    */   
/*    */   public static void schedule(final TileEntity tileEntity) {
/* 24 */     if (SideTracker.isServer()) {
/* 25 */       synchronized (pending) {
/* 26 */         pending.add(new Runnable()
/*    */             {
/*    */               public void run() {
/* 29 */                 Network.joinOrCreateNetwork(tileEntity);
/*    */               }
/*    */             });
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onTick(TickEvent.ServerTickEvent e) {
/* 38 */     if (e.phase == TickEvent.Phase.START) {
/*    */       Runnable[] adds;
/* 40 */       synchronized (pending) {
/* 41 */         adds = pending.<Runnable>toArray(new Runnable[pending.size()]);
/* 42 */         pending.clear();
/*    */       } 
/* 44 */       for (Runnable runnable : adds) {
/*    */         try {
/* 46 */           runnable.run();
/* 47 */         } catch (Throwable t) {
/* 48 */           log.warn("Error in scheduled tick action.", t);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\asm\SimpleComponentTickHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */