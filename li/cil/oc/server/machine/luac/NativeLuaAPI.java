/*   */ package li.cil.oc.server.machine.luac;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001E2Q!\001\002\002\002=\021ABT1uSZ,G*^1B!&S!a\001\003\002\t1,\030m\031\006\003\013\031\tq!\\1dQ&tWM\003\002\b\021\00511/\032:wKJT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\022%5\tA!\003\002\024\t\ty\021I]2iSR,7\r^;sK\006\003\026\n\003\005\026\001\t\025\r\021\"\001\027\003\025ywO\\3s+\0059\002C\001\r\032\033\005\021\021B\001\016\003\005Uq\025\r^5wK2+\030-\021:dQ&$Xm\031;ve\026D\001\002\b\001\003\002\003\006IaF\001\007_^tWM\035\021\t\013y\001A\021A\020\002\rqJg.\033;?)\t\001\023\005\005\002\031\001!)Q#\ba\001/!)1\005\001C\tI\005\031A.^1\026\003\025\002\"AJ\030\016\003\035R!\001K\025\002\013)tG.^1\013\005)Z\023\001\0028bK\032T!\001L\027\002\007\r|WN\003\002/\025\0051!/\0329bG.L!\001M\024\003\0211+\030m\025;bi\026\004")
/*   */ public abstract class NativeLuaAPI extends ArchitectureAPI {
/* 5 */   public NativeLuaArchitecture owner() { return this.owner; } private final NativeLuaArchitecture owner; public NativeLuaAPI(NativeLuaArchitecture owner) { super(owner.machine()); } public LuaState lua() {
/* 6 */     return owner().lua();
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\NativeLuaAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */