/*   */ package li.cil.oc.server.machine.luaj;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001A2Q!\001\002\002\002=\021q\001T;b\025\006\003\026J\003\002\004\t\005!A.^1k\025\t)a!A\004nC\016D\027N\\3\013\005\035A\021AB:feZ,'O\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\031\"\001\001\t\021\005E\021R\"\001\003\n\005M!!aD!sG\"LG/Z2ukJ,\027\tU%\t\021U\001!Q1A\005\002Y\tQa\\<oKJ,\022a\006\t\0031ei\021AA\005\0035\t\0211\003T;b\0252+\030-\021:dQ&$Xm\031;ve\026D\001\002\b\001\003\002\003\006IaF\001\007_^tWM\035\021\t\013y\001A\021A\020\002\rqJg.\033;?)\t\001\023\005\005\002\031\001!)Q#\ba\001/!)1\005\001C\tI\005\031A.^1\026\003\025\002\"A\n\030\016\003\035R!\001K\025\002\007Yl'G\003\002\004U)\0211\006L\001\004_J<'BA\027\013\003\031\021X\r]1dW&\021qf\n\002\b\0172|'-\0317t\001")
/*   */ public abstract class LuaJAPI extends ArchitectureAPI {
/* 5 */   public LuaJLuaArchitecture owner() { return this.owner; } private final LuaJLuaArchitecture owner; public LuaJAPI(LuaJLuaArchitecture owner) { super(owner.machine()); } public Globals lua() {
/* 6 */     return owner().lua();
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\LuaJAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */