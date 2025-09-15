/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\r3A!\001\002\001\033\t\031\021\tU+\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ty\001#D\001\003\023\t\t\"A\001\007He\006\004\b.[2t\007\006\024H\rC\005\024\001\t\005\t\025!\003\0255\005!A/[3s!\t)\002$D\001\027\025\0059\022!B:dC2\f\027BA\r\027\005\rIe\016^\005\003'AAQ\001\b\001\005\002u\ta\001P5oSRtDC\001\020 !\ty\001\001C\003\0247\001\007A\003\003\005\"\001!\025\r\021\"\004#\003)!WM^5dK&sgm\\\013\002GA!A%K\0264\033\005)#B\001\024(\003%IW.\\;uC\ndWM\003\002)-\005Q1m\0347mK\016$\030n\0348\n\005)*#aA'baB\021A&M\007\002[)\021afL\001\005Y\006twMC\0011\003\021Q\027M^1\n\005Ij#AB*ue&tw\r\005\0025o9\021Q#N\005\003mY\ta\001\025:fI\0264\027B\001\0329\025\t1d\003\003\005;\001!\005\t\025)\004$\003-!WM^5dK&sgm\034\021\t\013q\002A\021I\037\002\033\035,G\017R3wS\016,\027J\0344p)\005q\004\003B CgMj\021\001\021\006\003\003>\nA!\036;jY&\021!\006\021")
/*    */ public class APU extends GraphicsCard {
/*    */   private Map<String, String> deviceInfo;
/*    */   
/* 12 */   public APU(int tier) { super(tier); } private volatile boolean bitmap$0; private Map deviceInfo$lzycompute() {
/* 13 */     synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[7])[0] = Predef$ArrowAssoc$.MODULE$
/* 14 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "processor");
/* 15 */         (new scala.Tuple2[7])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "APU");
/* 16 */         (new scala.Tuple2[7])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 17 */         (new scala.Tuple2[7])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), (new StringBuilder()).append("FlexiArch ").append(BoxesRunTime.boxToInteger(tier() + 1).toString()).append(" Processor (Builtin Graphics)").toString());
/* 18 */         (new scala.Tuple2[7])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), capacityInfo());
/* 19 */         (new scala.Tuple2[7])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), widthInfo());
/* 20 */         (new scala.Tuple2[7])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("clock"), (new StringBuilder()).append(BoxesRunTime.boxToInteger((int)(Settings$.MODULE$.get().callBudgets()[tier()] * 'Ϩ')).toString()).append("+").append(clockInfo()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[7])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 23 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\APU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */