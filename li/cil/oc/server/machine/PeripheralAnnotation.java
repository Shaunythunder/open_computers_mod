/*    */ package li.cil.oc.server.machine;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ 
/*    */ public class PeripheralAnnotation
/*    */   implements Callback
/*    */ {
/*    */   private final String name;
/*    */   
/*    */   public PeripheralAnnotation(String name) {
/* 12 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public String value() {
/* 17 */     return this.name;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean direct() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int limit() {
/* 27 */     return 100;
/*    */   }
/*    */ 
/*    */   
/*    */   public String doc() {
/* 32 */     return "";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getter() {
/* 37 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean setter() {
/* 42 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<? extends Annotation> annotationType() {
/* 47 */     return (Class)Callback.class;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\PeripheralAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */