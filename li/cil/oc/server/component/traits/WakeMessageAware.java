/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.TraitSetter;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025baB\001\003!\003\r\ta\004\002\021/\006\\W-T3tg\006<W-Q<be\026T!a\001\003\002\rQ\024\030-\033;t\025\t)a!A\005d_6\004xN\\3oi*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001aE\002\001!Y\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007CA\f\031\033\005\021\021BA\r\003\0051qU\r^<pe.\fu/\031:f\021\025Y\002\001\"\001\035\003\031!\023N\\5uIQ\tQ\004\005\002\022=%\021qD\005\002\005+:LG\017C\004\"\001\001\007I\021\003\022\002\027]\f7.Z'fgN\fw-Z\013\002GA\031\021\003\n\024\n\005\025\022\"AB(qi&|g\016\005\002(U9\021\021\003K\005\003SI\ta\001\025:fI\0264\027BA\026-\005\031\031FO]5oO*\021\021F\005\005\b]\001\001\r\021\"\0050\003=9\030m[3NKN\034\030mZ3`I\025\fHCA\0171\021\035\tT&!AA\002\r\n1\001\037\0232\021\031\031\004\001)Q\005G\005aq/Y6f\033\026\0348/Y4fA!9Q\007\001a\001\n#1\024\001E<bW\026lUm]:bO\0264UO\037>z+\0059\004CA\t9\023\tI$CA\004C_>dW-\0318\t\017m\002\001\031!C\ty\005!r/Y6f\033\026\0348/Y4f\rVT(0_0%KF$\"!H\037\t\017ER\024\021!a\001o!1q\b\001Q!\n]\n\021c^1lK6+7o]1hK\032+(P_=!\021\025\t\005\001\"\001C\00399W\r^,bW\026lUm]:bO\026$2a\021$Q!\r\tB\tE\005\003\013J\021Q!\021:sCfDQa\022!A\002!\013qaY8oi\026DH\017\005\002J\0356\t!J\003\002L\031\0069Q.Y2iS:,'BA'\t\003\r\t\007/[\005\003\037*\023qaQ8oi\026DH\017C\003R\001\002\007!+\001\003be\036\034\bCA%T\023\t!&JA\005Be\036,X.\0328ug\"2\001IV-[7r\003\"!S,\n\005aS%\001C\"bY2\024\027mY6\002\r\021L'/Z2u3\005\t\021a\0013pG\006\nQ,\001 gk:\034G/[8oQ%R4\017\036:j]\036d\003EY8pY\026\fg\016I\027.A\035+G\017\t;iK\002\032WO\035:f]R\004s/Y6f[U\004\b%\\3tg\006<WM\f\005\006?\002!\t\001Y\001\017g\026$x+Y6f\033\026\0348/Y4f)\r\031\025M\031\005\006\017z\003\r\001\023\005\006#z\003\rA\025\025\005=Z[F-I\001f\003u4WO\\2uS>t\007&\\3tg\006<WMO:ue&twm\027\027!MVT(0\037\036c_>dW-\0318^Si\032HO]5oO\002jS\006I*fi\002\"\b.\032\021xC.,W&\0369![\026\0348/Y4fA\005tG\rI<iKRDWM\035\021u_\002JwM\\8sK\002\nG\rZ5uS>t\027\r\034\021eCR\fw\006]1sC6,G/\032:t]!)q\r\001C\tQ\006\001\022n\035)bG.,G/Q2dKB$X\r\032\013\004o%\f\b\"\0026g\001\004Y\027A\0029bG.,G\017\005\002m_6\tQN\003\002o\031\0069a.\032;x_J\\\027B\0019n\005\031\001\026mY6fi\")!O\032a\001g\006AA-[:uC:\034W\r\005\002\022i&\021QO\005\002\007\t>,(\r\\3\t\013]\004A\021\003=\002\033I,7-Z5wKB\0137m[3u)\021i\022P_>\t\013)4\b\031A6\t\013I4\b\031A:\t\013q4\b\031A?\002\t!|7\017\036\t\003YzL!a`7\003\037\025sg/\033:p]6,g\016\036%pgRDq!a\001\001\t\003\t)!A\bm_\006$w+Y6f\033\026\0348/Y4f)\ri\022q\001\005\t\003\023\t\t\0011\001\002\f\005\031aN\031;\021\t\0055\021\021D\007\003\003\037QA!!\003\002\022)!\0211CA\013\003%i\027N\\3de\0064GO\003\002\002\030\005\031a.\032;\n\t\005m\021q\002\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\ty\002\001C\001\003C\tqb]1wK^\0137.Z'fgN\fw-\032\013\004;\005\r\002\002CA\005\003;\001\r!a\003")
/*    */ public interface WakeMessageAware extends NetworkAware {
/*    */   Option<String> wakeMessage();
/*    */   
/*    */   @TraitSetter
/*    */   void wakeMessage_$eq(Option<String> paramOption);
/*    */   
/*    */   boolean wakeMessageFuzzy();
/*    */   
/*    */   @TraitSetter
/*    */   void wakeMessageFuzzy_$eq(boolean paramBoolean);
/*    */   
/*    */   @Callback(direct = true, doc = "function():string, boolean -- Get the current wake-up message.")
/*    */   Object[] getWakeMessage(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(message:string[, fuzzy:boolean]):string -- Set the wake-up message and whether to ignore additional data/parameters.")
/*    */   Object[] setWakeMessage(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   boolean isPacketAccepted(Packet paramPacket, double paramDouble);
/*    */   
/*    */   void receivePacket(Packet paramPacket, double paramDouble, EnvironmentHost paramEnvironmentHost);
/*    */   
/*    */   void loadWakeMessage(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void saveWakeMessage(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   public final class WakeMessageAware$$anonfun$receivePacket$1 extends AbstractFunction1<String, Object> implements Serializable {
/*    */     public final boolean apply(String x$1) {
/* 36 */       String str = this.$outer.node().address(); if (x$1 == null) { if (str != null); } else if (x$1.equals(str))
/*    */       {  }
/*    */     
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public WakeMessageAware$$anonfun$receivePacket$1(WakeMessageAware $outer) {}
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class WakeMessageAware$$anonfun$saveWakeMessage$1
/*    */     extends AbstractFunction1<String, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */     
/*    */     private final NBTTagCompound nbt$1;
/*    */ 
/*    */ 
/*    */     
/*    */     public final void apply(String x$2) {
/* 67 */       this.nbt$1.func_74778_a("wakeMessage", x$2);
/*    */     }
/*    */     
/*    */     public WakeMessageAware$$anonfun$saveWakeMessage$1(WakeMessageAware $outer, NBTTagCompound nbt$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WakeMessageAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */