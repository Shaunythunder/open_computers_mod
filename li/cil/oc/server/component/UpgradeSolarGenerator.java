/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\005a\001B\001\003\0015\021Q#\0269he\006$WmU8mCJ<UM\\3sCR|'O\003\002\004\t\005I1m\\7q_:,g\016\036\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022A\0029sK\032\f'M\003\002\024\r\005\031\021\r]5\n\005U\001\"AE'b]\006<W\rZ#om&\024xN\\7f]R\004\"a\006\016\016\003aQ!!\007\n\002\r\021\024\030N^3s\023\tY\002D\001\006EKZL7-Z%oM>D\001\"\b\001\003\006\004%\tAH\001\005Q>\034H/F\001 !\t\0013%D\001\"\025\t\021##A\004oKR<xN]6\n\005\021\n#aD#om&\024xN\\7f]RDun\035;\t\021\031\002!\021!Q\001\n}\tQ\001[8ti\002BQ\001\013\001\005\002%\na\001P5oSRtDC\001\026-!\tY\003!D\001\003\021\025ir\0051\001 \021\035q\003A1A\005B=\nAA\\8eKV\t\001\007\005\002!c%\021!'\t\002\n\007>tg.Z2u_JDa\001\016\001!\002\023\001\024!\0028pI\026\004\003b\002\034\001\001\004%\taN\001\020i&\0347n]+oi&d7\t[3dWV\t\001\b\005\002:y5\t!HC\001<\003\025\0318-\0317b\023\ti$HA\002J]RDqa\020\001A\002\023\005\001)A\nuS\016\\7/\0268uS2\034\005.Z2l?\022*\027\017\006\002B\tB\021\021HQ\005\003\007j\022A!\0268ji\"9QIPA\001\002\004A\024a\001=%c!1q\t\001Q!\na\n\001\003^5dWN,f\016^5m\007\",7m\033\021\t\017%\003\001\031!C\001\025\006a\021n]*v]NC\027N\\5oOV\t1\n\005\002:\031&\021QJ\017\002\b\005>|G.Z1o\021\035y\005\0011A\005\002A\013\001#[:Tk:\034\006.\0338j]\036|F%Z9\025\005\005\013\006bB#O\003\003\005\ra\023\005\007'\002\001\013\025B&\002\033%\0348+\0368TQ&t\027N\\4!\021!)\006\001#b\001\n\0331\026A\0033fm&\034W-\0238g_V\tq\013\005\003Y;~{V\"A-\013\005i[\026!C5n[V$\030M\0317f\025\ta&(\001\006d_2dWm\031;j_:L!AX-\003\0075\013\007\017\005\002aK6\t\021M\003\002cG\006!A.\0318h\025\005!\027\001\0026bm\006L!AZ1\003\rM#(/\0338h\021!A\007\001#A!B\0339\026a\0033fm&\034W-\0238g_\002BQA\033\001\005B-\fQbZ3u\t\0264\030nY3J]\032|G#\0017\021\t5\004\030/]\007\002]*\021qnY\001\005kRLG.\003\002_]B\021!/\036\b\003sML!\001\036\036\002\rA\023X\rZ3g\023\t1gO\003\002uu!9\001\020\001b\001\n\003R\025!C2b]V\003H-\031;f\021\031Q\b\001)A\005\027\006Q1-\0318Va\022\fG/\032\021\t\013q\004A\021I?\002\rU\004H-\031;f)\005\t\005\"B@\001\t\023Q\025\001D5t'Vtg+[:jE2,\007")
/*    */ public class UpgradeSolarGenerator extends ManagedEnvironment implements DeviceInfo {
/*    */   private final EnvironmentHost host;
/*    */   
/*    */   public EnvironmentHost host() {
/* 20 */     return this.host;
/* 21 */   } private final Connector node = (Connector)Network.newNode((Environment)this, Visibility.Network)
/* 22 */     .withConnector()
/* 23 */     .create(); public Connector node() {
/*    */     return this.node;
/* 25 */   } private int ticksUntilCheck = 0; public int ticksUntilCheck() { return this.ticksUntilCheck; } public void ticksUntilCheck_$eq(int x$1) { this.ticksUntilCheck = x$1; }
/*    */    private boolean isSunShining = false; private Map<String, String> deviceInfo;
/* 27 */   public boolean isSunShining() { return this.isSunShining; } public void isSunShining_$eq(boolean x$1) { this.isSunShining = x$1; }
/*    */   private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 29 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 30 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/* 31 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Solar panel");
/* 32 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 33 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Enligh10"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 36 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */   
/*    */   private final boolean canUpdate = true; private volatile boolean bitmap$0;
/*    */   public boolean canUpdate() {
/* 40 */     return this.canUpdate;
/*    */   }
/*    */   public void update() {
/* 43 */     super.update();
/*    */     
/* 45 */     ticksUntilCheck_$eq(ticksUntilCheck() - 1);
/* 46 */     if (ticksUntilCheck() <= 0) {
/* 47 */       ticksUntilCheck_$eq(100);
/* 48 */       isSunShining_$eq(isSunVisible());
/*    */     } 
/* 50 */     if (isSunShining()) {
/* 51 */       node().changeBuffer(Settings$.MODULE$.get().solarGeneratorEfficiency());
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean isSunVisible() {
/* 56 */     BlockPosition blockPos = BlockPosition$.MODULE$.apply(host()).offset(ForgeDirection.UP);
/* 57 */     return (host().world().func_72935_r() && 
/* 58 */       !(host().world()).field_73011_w.field_76576_e && 
/* 59 */       host().world().func_72937_j(blockPos.x(), blockPos.y(), blockPos.z()) && (
/* 60 */       host().world().func_72959_q().func_76935_a(blockPos.x(), blockPos.z()) instanceof net.minecraft.world.biome.BiomeGenDesert || (!host().world().func_72896_J() && !host().world().func_72911_I())));
/*    */   }
/*    */   
/*    */   public UpgradeSolarGenerator(EnvironmentHost host) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeSolarGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */