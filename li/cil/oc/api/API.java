/*    */ package li.cil.oc.api;
/*    */ 
/*    */ import com.typesafe.config.Config;
/*    */ import li.cil.oc.api.detail.DriverAPI;
/*    */ import li.cil.oc.api.detail.FileSystemAPI;
/*    */ import li.cil.oc.api.detail.ItemAPI;
/*    */ import li.cil.oc.api.detail.MachineAPI;
/*    */ import li.cil.oc.api.detail.ManualAPI;
/*    */ import li.cil.oc.api.detail.NanomachinesAPI;
/*    */ import li.cil.oc.api.detail.NetworkAPI;
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
/*    */ public class API
/*    */ {
/*    */   public static final String ID_OWNER = "OpenComputers|Core";
/*    */   public static final String VERSION = "6.0.0-alpha";
/* 28 */   public static Config config = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isPowerEnabled = false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public static DriverAPI driver = null;
/* 42 */   public static FileSystemAPI fileSystem = null;
/* 43 */   public static ItemAPI items = null;
/* 44 */   public static MachineAPI machine = null;
/* 45 */   public static ManualAPI manual = null;
/* 46 */   public static NanomachinesAPI nanomachines = null;
/* 47 */   public static NetworkAPI network = null;
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\API.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */