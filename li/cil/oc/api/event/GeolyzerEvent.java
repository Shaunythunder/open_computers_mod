/*     */ package li.cil.oc.api.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
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
/*     */ @Cancelable
/*     */ public abstract class GeolyzerEvent
/*     */   extends Event
/*     */ {
/*     */   public final EnvironmentHost host;
/*     */   public final Map<?, ?> options;
/*     */   
/*     */   protected GeolyzerEvent(EnvironmentHost host, Map<?, ?> options) {
/*  29 */     this.host = host;
/*  30 */     this.options = options;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Scan
/*     */     extends GeolyzerEvent
/*     */   {
/*     */     public final int minX;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int minY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int minZ;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int maxX;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int maxY;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int maxZ;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     public final float[] data = new float[64];
/*     */ 
/*     */     
/*     */     public Scan(EnvironmentHost host, Map<?, ?> options, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
/*  84 */       super(host, options);
/*  85 */       this.minX = minX;
/*  86 */       this.minY = minY;
/*  87 */       this.minZ = minZ;
/*  88 */       this.maxX = maxX;
/*  89 */       this.maxY = maxY;
/*  90 */       this.maxZ = maxZ;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Analyze
/*     */     extends GeolyzerEvent
/*     */   {
/*     */     public final int x;
/*     */ 
/*     */ 
/*     */     
/*     */     public final int y;
/*     */ 
/*     */     
/*     */     public final int z;
/*     */ 
/*     */     
/* 110 */     public final Map<String, Object> data = new HashMap<>();
/*     */     
/*     */     public Analyze(EnvironmentHost host, Map<?, ?> options, int x, int y, int z) {
/* 113 */       super(host, options);
/* 114 */       this.x = x;
/* 115 */       this.y = y;
/* 116 */       this.z = z;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\GeolyzerEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */