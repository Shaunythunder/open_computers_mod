/*    */ package li.cil.oc.api;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import li.cil.oc.api.machine.Architecture;
/*    */ import li.cil.oc.api.machine.Machine;
/*    */ import li.cil.oc.api.machine.MachineHost;
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
/*    */ public final class Machine
/*    */ {
/*    */   public static void add(Class<? extends Architecture> architecture) {
/* 34 */     if (API.machine != null) API.machine.add(architecture);
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static Collection<Class<? extends Architecture>> architectures() {
/* 41 */     if (API.machine != null) return API.machine.architectures(); 
/* 42 */     return Collections.emptyList();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getArchitectureName(Class<? extends Architecture> architecture) {
/* 52 */     if (API.machine != null) return API.machine.getArchitectureName(architecture); 
/* 53 */     return null;
/*    */   }
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
/*    */   public static Machine create(MachineHost host) {
/* 66 */     if (API.machine != null) return API.machine.create(host); 
/* 67 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 78 */   public static Class<? extends Architecture> LuaArchitecture = null;
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Machine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */