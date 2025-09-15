/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!3A!\001\002\001\033\taQj\034;j_:\034VM\\:pe*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Ai\021AA\005\003#\t\0211bU5na2,'\t\\8dW\")1\003\001C\001)\0051A(\0338jiz\"\022!\006\t\003\037\001AQa\006\001\005Ra\tabY;ti>lG+\032=ukJ,7/F\001\032!\rQRdH\007\0027)\tA$A\003tG\006d\027-\003\002\0377\t)\021I\035:bsB\031!\004\t\022\n\005\005Z\"AB(qi&|g\016\005\002$M9\021!\004J\005\003Km\ta\001\025:fI\0264\027BA\024)\005\031\031FO]5oO*\021Qe\007\005\006U\001!\teK\001\016Q\006\034H+\0337f\013:$\030\016^=\025\0051z\003C\001\016.\023\tq3DA\004C_>dW-\0318\t\013AJ\003\031A\031\002\0215,G/\0313bi\006\004\"A\007\032\n\005MZ\"aA%oi\")Q\007\001C!m\005\0012M]3bi\026$\026\016\\3F]RLG/\037\013\004oq:\005C\001\035<\033\005I$B\001\036\005\003)!\030\016\\3f]RLG/_\005\003\003eBQ!\020\033A\002y\nQa^8sY\022\004\"aP#\016\003\001S!!P!\013\005\t\033\025!C7j]\026\034'/\0314u\025\005!\025a\0018fi&\021a\t\021\002\006/>\024H\016\032\005\006aQ\002\r!\r")
/*    */ public class MotionSensor extends SimpleBlock {
/*  6 */   public MotionSensor() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); } public Option<String>[] customTextures() {
/*  7 */     (new Option[6])[0] = 
/*  8 */       (Option)new Some("MotionSensorTop");
/*  9 */     (new Option[6])[1] = (Option)new Some("MotionSensorTop");
/* 10 */     (new Option[6])[2] = (Option)new Some("MotionSensorSide");
/* 11 */     (new Option[6])[3] = (Option)new Some("MotionSensorSide");
/* 12 */     (new Option[6])[4] = (Option)new Some("MotionSensorSide");
/* 13 */     (new Option[6])[5] = (Option)new Some("MotionSensorSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 18 */     return true;
/*    */   } public li.cil.oc.common.tileentity.MotionSensor createTileEntity(World world, int metadata) {
/* 20 */     return new li.cil.oc.common.tileentity.MotionSensor();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\MotionSensor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */