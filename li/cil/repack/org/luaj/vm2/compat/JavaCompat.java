/*    */ package li.cil.repack.org.luaj.vm2.compat;
/*    */ 
/*    */ public class JavaCompat {
/*    */   public static final JavaCompat INSTANCE;
/*    */   
/*    */   static {
/*    */     JavaCompat instance;
/*    */     try {
/*  9 */       instance = (JavaCompat)Class.forName("li.cil.repack.org.luaj.vm2.lib.jse.JavaCompatJSE").newInstance();
/* 10 */     } catch (Throwable t) {
/* 11 */       instance = new JavaCompat();
/*    */     } 
/* 13 */     INSTANCE = instance;
/*    */   }
/*    */   
/*    */   public long doubleToRawLongBits(double x) {
/* 17 */     return Double.doubleToLongBits(x);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compat\JavaCompat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */