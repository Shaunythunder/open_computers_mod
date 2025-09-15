/*    */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*    */ 
/*    */ import li.cil.repack.org.luaj.vm2.lib.StringLib;
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
/*    */ 
/*    */ 
/*    */ public class JseStringLib
/*    */   extends StringLib
/*    */ {
/*    */   protected String format(String src, double x) {
/*    */     String out;
/*    */     try {
/* 34 */       out = String.format(src, new Object[] { Double.valueOf(x) });
/* 35 */     } catch (Throwable e) {
/* 36 */       out = super.format(src, x);
/*    */     } 
/* 38 */     return out;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JseStringLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */