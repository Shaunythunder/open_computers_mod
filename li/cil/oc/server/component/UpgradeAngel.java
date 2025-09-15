/*    */ package li.cil.oc.server.component;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.driver.DeviceInfo;
/*    */ import li.cil.oc.api.network.Component;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001I3A!\001\002\001\033\taQ\013]4sC\022,\027I\\4fY*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\031\001(/\0324bE*\0211CB\001\004CBL\027BA\013\021\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\021\005]QR\"\001\r\013\005e\021\022A\0023sSZ,'/\003\002\0341\tQA)\032<jG\026LeNZ8\t\013u\001A\021\001\020\002\rqJg.\033;?)\005y\002C\001\021\001\033\005\021\001b\002\022\001\005\004%\teI\001\005]>$W-F\001%!\t)\003&D\001'\025\t9##A\004oKR<xN]6\n\005%2#!C\"p[B|g.\0328u\021\031Y\003\001)A\005I\005)an\0343fA!AQ\006\001EC\002\0235a&\001\006eKZL7-Z%oM>,\022a\f\t\005a]J\024(D\0012\025\t\0214'A\005j[6,H/\0312mK*\021A'N\001\013G>dG.Z2uS>t'\"\001\034\002\013M\034\027\r\\1\n\005a\n$aA'baB\021!hP\007\002w)\021A(P\001\005Y\006twMC\001?\003\021Q\027M^1\n\005\001[$AB*ue&tw\r\003\005C\001!\005\t\025)\0040\003-!WM^5dK&sgm\034\021\t\013\021\003A\021I#\002\033\035,G\017R3wS\016,\027J\0344p)\0051\005\003B$K\027.k\021\001\023\006\003\023v\nA!\036;jY&\021\001\b\023\t\003\031Bs!!\024(\016\003UJ!aT\033\002\rA\023X\rZ3g\023\t\001\025K\003\002Pk\001")
/*    */ public class UpgradeAngel extends ManagedEnvironment implements DeviceInfo {
/*    */   private Map<String, String> deviceInfo;
/*    */   private volatile boolean bitmap$0;
/* 20 */   private final Component node = (Component)Network.newNode((Environment)this, Visibility.Network)
/* 21 */     .withComponent("angel")
/* 22 */     .create();
/*    */   public Component node() { return this.node; } private Map deviceInfo$lzycompute() {
/* 24 */     synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 25 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 26 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Angel upgrade");
/* 27 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 28 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "FreePlacer (TM)");
/* 29 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 32 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeAngel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */