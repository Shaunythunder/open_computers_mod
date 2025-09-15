/*    */ package li.cil.oc.common.block;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0053A!\001\002\001\033\t\t2)\031:qKR,GmQ1qC\016LGo\034:\013\005\r!\021!\0022m_\016\\'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005%\031\025\r]1dSR|'\017C\003\024\001\021\005A#\001\004=S:LGO\020\013\002+A\021q\002\001\005\006/\001!\t\005G\001\021GJ,\027\r^3US2,WI\034;jif$2!\007\020*!\tQR$D\001\034\025\taB!\001\006uS2,WM\034;jifL!!A\016\t\013}1\002\031\001\021\002\013]|'\017\0343\021\005\005:S\"\001\022\013\005}\031#B\001\023&\003%i\027N\\3de\0064GOC\001'\003\rqW\r^\005\003Q\t\022QaV8sY\022DQA\013\fA\002-\n\001\"\\3uC\022\fG/\031\t\003Y=j\021!\f\006\002]\005)1oY1mC&\021\001'\f\002\004\023:$\b\"\002\032\001\t#\032\024AD2vgR|W\016V3yiV\024Xm]\013\002iA\031A&N\034\n\005Yj#!B!se\006L\bc\001\0279u%\021\021(\f\002\007\037B$\030n\0348\021\005mrdB\001\027=\023\tiT&\001\004Qe\026$WMZ\005\003\001\023aa\025;sS:<'BA\037.\001")
/*    */ public class CarpetedCapacitor extends Capacitor {
/*    */   public li.cil.oc.common.tileentity.CarpetedCapacitor createTileEntity(World world, int metadata) {
/*  7 */     return new li.cil.oc.common.tileentity.CarpetedCapacitor();
/*    */   } public Option<String>[] customTextures() {
/*  9 */     (new Option[6])[0] = 
/* 10 */       (Option)None$.MODULE$;
/* 11 */     (new Option[6])[1] = (Option)new Some("CarpetCapacitorTop");
/* 12 */     (new Option[6])[2] = (Option)new Some("CapacitorSide");
/* 13 */     (new Option[6])[3] = (Option)new Some("CapacitorSide");
/* 14 */     (new Option[6])[4] = (Option)new Some("CapacitorSide");
/* 15 */     (new Option[6])[5] = (Option)new Some("CapacitorSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\CarpetedCapacitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */