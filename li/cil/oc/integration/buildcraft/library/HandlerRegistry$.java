/*    */ package li.cil.oc.integration.buildcraft.library;
/*    */ 
/*    */ import buildcraft.api.library.LibraryAPI;
/*    */ import buildcraft.api.library.LibraryTypeHandler;
/*    */ 
/*    */ public final class HandlerRegistry$ {
/*    */   public static final HandlerRegistry$ MODULE$;
/*    */   
/*    */   public void init() {
/* 10 */     LibraryAPI.registerHandler((LibraryTypeHandler)EEPROMHandler$.MODULE$);
/*    */   } private HandlerRegistry$() {
/* 12 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\library\HandlerRegistry$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */