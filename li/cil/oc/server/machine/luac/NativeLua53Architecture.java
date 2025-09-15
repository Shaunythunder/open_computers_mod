/*    */ package li.cil.oc.server.machine.luac;
/*    */ 
/*    */ import li.cil.oc.api.machine.Architecture.Name;
/*    */ import li.cil.oc.api.machine.Machine;
/*    */ import scala.reflect.ScalaSignature;
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
/*    */ @Name("Lua 5.3")
/*    */ @ScalaSignature(bytes = "\006\001]2A!\001\002\001\037\t9b*\031;jm\026dU/Y\0334\003J\034\007.\033;fGR,(/\032\006\003\007\021\tA\001\\;bG*\021QAB\001\b[\006\034\007.\0338f\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\003\023\t\031\"AA\013OCRLg/\032'vC\006\0238\r[5uK\016$XO]3\t\023\025\001!\021!Q\001\nUa\002C\001\f\033\033\0059\"BA\003\031\025\tI\002\"A\002ba&L!aG\f\003\0175\0137\r[5oK&\021QA\005\005\006=\001!\taH\001\007y%t\027\016\036 \025\005\001\n\003CA\t\001\021\025)Q\0041\001\026\021\025\031\003\001\"\021%\003\0351\027m\031;pef,\022!\n\b\003M%r!!E\024\n\005!\022\021a\004'vCN#\030\r^3GC\016$xN]=\n\005)Z\023!\002'vCV\032$B\001\025\003Q\021\001Q\006N\033\021\0059\ndB\001\f0\023\t\001t#\001\007Be\016D\027\016^3diV\024X-\003\0023g\t!a*Y7f\025\t\001t#A\003wC2,X-I\0017\003\035aU/\031\0216]M\002")
/*    */ public class NativeLua53Architecture
/*    */   extends NativeLuaArchitecture
/*    */ {
/*    */   public NativeLua53Architecture(Machine machine) {
/* 29 */     super(machine); } public LuaStateFactory.Lua53$ factory() {
/* 30 */     return LuaStateFactory.Lua53$.MODULE$;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\NativeLua53Architecture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */