/*    */ package li.cil.repack.com.naef.jnlua;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ public enum LuaType
/*    */ {
/* 18 */   NIL,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   BOOLEAN,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   LIGHTUSERDATA,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   NUMBER,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   STRING,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 43 */   TABLE,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   FUNCTION,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 53 */   USERDATA,
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 58 */   THREAD;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String displayText() {
/* 68 */     return toString().toLowerCase(Locale.ROOT);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */