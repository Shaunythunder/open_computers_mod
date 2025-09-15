/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.internal.Rotatable;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001}3A!\001\002\001\033\t1R\013]4sC\022,7+[4o\023:\024v\016^1uC\ndWM\003\002\004\t\005I1m\\7q_:,g\016\036\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Ai\021AA\005\003#\t\0211\"\0269he\006$WmU5h]\"A1\003\001BC\002\023\005A#\001\003i_N$X#A\013\023\007YA\002E\002\003\030\001\001)\"\001\004\037sK\032Lg.Z7f]Rt\004CA\r\037\033\005Q\"BA\016\035\003\035qW\r^<pe.T!!\b\004\002\007\005\004\030.\003\002 5\tyQI\034<je>tW.\0328u\021>\034H\017\005\002\"I5\t!E\003\002$9\005A\021N\034;fe:\fG.\003\002&E\tI!k\034;bi\006\024G.\032\005\tO\001\021\t\021)A\005+\005)\001n\\:uA!)\021\006\001C\001U\0051A(\0338jiz\"\"a\013\027\021\005=\001\001\"B\n)\001\004i#c\001\030\031A\031!q\003\001\001.\021\035\001\004A1A\005BE\nAA\\8eKV\t!\007\005\002\032g%\021AG\007\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\0047\001\001\006IAM\001\006]>$W\r\t\005\006q\001!\t!O\001\tO\026$h+\0317vKR\031!hQ&\021\007mr\004)D\001=\025\005i\024!B:dC2\f\027BA =\005\025\t%O]1z!\tY\024)\003\002Cy\t1\021I\\=SK\032DQ\001R\034A\002\025\013qaY8oi\026DH\017\005\002G\0236\tqI\003\002I9\0059Q.Y2iS:,\027B\001&H\005\035\031uN\034;fqRDQ\001T\034A\0025\013A!\031:hgB\021aIT\005\003\037\036\023\021\"\021:hk6,g\016^:)\t]\nF+\026\t\003\rJK!aU$\003\021\r\013G\016\0342bG.\f1\001Z8dC\0051\026a\0214v]\016$\030n\0348)Si\032HO]5oO\002jS\006I$fi\002\"\b.\032\021uKb$\be\0348!i\",\007e]5h]\002Jg\016\t4s_:$\be\0344!i\",\007\005[8ti:BQ\001\027\001\005\002e\013\001b]3u-\006dW/\032\013\004ui[\006\"\002#X\001\004)\005\"\002'X\001\004i\005\006B,R)v\013\023AX\001PMVt7\r^5p]\"2\030\r\\;fuM$(/\0338hSi\032HO]5oO\002jS\006I*fi\002\"\b.\032\021uKb$\be\0348!i\",\007e]5h]\002Jg\016\t4s_:$\be\0344!i\",\007\005[8ti:\002")
/*    */ public class UpgradeSignInRotatable extends UpgradeSign {
/*    */   public EnvironmentHost host() {
/* 11 */     return this.host;
/* 12 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 13 */     .withComponent("sign", Visibility.Neighbors)
/* 14 */     .withConnector()
/* 15 */     .create(); public ComponentConnector node() {
/*    */     return this.node;
/*    */   }
/*    */   @Callback(doc = "function():string -- Get the text on the sign in front of the host.")
/*    */   public Object[] getValue(Context context, Arguments args) {
/* 20 */     return getValue(findSign(((Rotatable)host()).facing()));
/*    */   } @Callback(doc = "function(value:string):string -- Set the text on the sign in front of the host.")
/*    */   public Object[] setValue(Context context, Arguments args) {
/* 23 */     return setValue(findSign(((Rotatable)host()).facing()), args.checkString(0));
/*    */   }
/*    */   
/*    */   public UpgradeSignInRotatable(EnvironmentHost host) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeSignInRotatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */