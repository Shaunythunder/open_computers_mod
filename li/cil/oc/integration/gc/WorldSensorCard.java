/*    */ package li.cil.oc.integration.gc;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005ma\001B\001\003\0015\021qbV8sY\022\034VM\\:pe\016\013'\017\032\006\003\007\021\t!aZ2\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u\021!9\002A!b\001\n\003A\022\001\0025pgR,\022!\007\t\0035ui\021a\007\006\0039I\tqA\\3uo>\0248.\003\002\0377\tyQI\034<je>tW.\0328u\021>\034H\017\003\005!\001\t\005\t\025!\003\032\003\025Awn\035;!\021\025\021\003\001\"\001$\003\031a\024N\\5u}Q\021AE\n\t\003K\001i\021A\001\005\006/\005\002\r!\007\005\bQ\001\021\r\021\"\021*\003\021qw\016Z3\026\003)\002\"AG\026\n\0051Z\"AE\"p[B|g.\0328u\007>tg.Z2u_JDaA\f\001!\002\023Q\023!\0028pI\026\004\003\"\002\031\001\t\003\t\024AC4fi\036\023\030M^5usR\031!gO\"\021\007M2\004(D\0015\025\005)\024!B:dC2\f\027BA\0345\005\025\t%O]1z!\t\031\024(\003\002;i\t1\021I\\=SK\032DQ\001P\030A\002u\nqaY8oi\026DH\017\005\002?\0036\tqH\003\002A%\0059Q.Y2iS:,\027B\001\"@\005\035\031uN\034;fqRDQ\001R\030A\002\025\013A!\031:hgB\021aHR\005\003\017~\022\021\"\021:hk6,g\016^:)\t=JE*\024\t\003})K!aS \003\021\r\013G\016\0342bG.\f1\001Z8dC\005q\025!\0244v]\016$\030n\0348)SirW/\0342fe\002jS\006I$fi\002\"\b.\032\021he\0064\030\016^=!_\032\004C\017[3!o>\024H\016\032\021uQ\026\004C-\032<jG\026\004\023n\035\021dkJ\024XM\034;ms\002JgN\f\005\006!\002!\t!U\001\030Q\006\034(I]3bi\"\f'\r\\3Bi6|7\017\0355fe\026$2A\r*T\021\025at\n1\001>\021\025!u\n1\001FQ\021y\025\nT+\"\003Y\0131MZ;oGRLwN\034\025*u\t|w\016\\3b]\002jS\006I$fi\002:\b.\032;iKJ\004C\017[3!o>\024H\016\032\021uQ\026\004C-\032<jG\026\004\023n\035\021dkJ\024XM\034;ms\002Jg\016\t5bg\002\n\007E\031:fCRD\027M\0317fA\005$Xn\\:qQ\026\024XM\f\005\0061\002!\t!W\001\rSN<\025m\035)sKN,g\016\036\013\004ei[\006\"\002\037X\001\004i\004\"\002#X\001\004)\005\006B,J\031v\013\023AX\001\002\004\031,hn\031;j_:Ds-Y:;gR\024\030N\\4*u\t|w\016\\3b]\002jS\006I$fi\002:\b.\032;iKJ\004C\017[3!o>\024H\016\032\021uQ\026\004C-\032<jG\026\004\023n\035\021dkJ\024XM\034;ms\002Jg\016\t5bg\002\"\b.\032\021ta\026\034\027NZ5fI\002:\027m\035\021)K::g\006I8ys\036,g\016I8sA9LGO]8hK:Lc\006C\003a\001\021\005\021-\001\007hKR<\026N\0343MKZ,G\016F\0023E\016DQ\001P0A\002uBQ\001R0A\002\025CCaX%MK\006\na-\001)gk:\034G/[8oQ%Rd.^7cKJ\004S&\f\021HKR\004C\017[3!o&tG\r\t7fm\026d\007%\0338!i\",\007e^8sY\022\004C\017[3!I\0264\030nY3!SN\0043-\036:sK:$H.\037\021j]:BQ\001\033\001\005\n%\fAb^5uQB\023xN^5eKJ$\"A[7\025\005IZ\007b\0027h!\003\005\rAM\001\bI\0264\027-\0367u\021\025qw\r1\001p\003\0051\007\003B\032qeJJ!!\035\033\003\023\031+hn\031;j_:\f\004CA:~\033\005!(BA;w\003\0259xN\0357e\025\t\031rO\003\002ys\006aq-\0317bGRL7M]1gi*\021!p_\001\005[>$7OC\001}\003)i\027n\0313p_\022dW\rO\005\003}R\024!$S$bY\006\034G/[2sC\032$xk\034:mIB\023xN^5eKJD\021\"!\001\001#\003%I!a\001\002-]LG\017\033)s_ZLG-\032:%I\0264\027-\0367uII\"B!!\002\002\032)\032!'a\002,\005\005%\001\003BA\006\003+i!!!\004\013\t\005=\021\021C\001\nk:\034\007.Z2lK\022T1!a\0055\003)\tgN\\8uCRLwN\\\005\005\003/\tiAA\tv]\016DWmY6fIZ\013'/[1oG\026DQA\\@A\002=\004")
/*    */ public class WorldSensorCard extends ManagedEnvironment {
/*    */   public EnvironmentHost host() {
/* 14 */     return this.host;
/* 15 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Neighbors)
/* 16 */     .withComponent("world_sensor")
/* 17 */     .withConnector()
/* 18 */     .create(); public ComponentConnector node() {
/*    */     return this.node;
/*    */   }
/*    */   @Callback(doc = "function():number -- Get the gravity of the world the device is currently in.")
/* 22 */   public Object[] getGravity(Context context, Arguments args) { return withProvider((Function1<IGalacticraftWorldProvider, Object[]>)new WorldSensorCard$$anonfun$getGravity$1(this), package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(1.0F) }))); } public final class WorldSensorCard$$anonfun$getGravity$1 extends AbstractFunction1<IGalacticraftWorldProvider, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(IGalacticraftWorldProvider provider) { return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(provider.getGravity()) })); }
/*    */     
/*    */     public WorldSensorCard$$anonfun$getGravity$1(WorldSensorCard $outer) {} }
/*    */   @Callback(doc = "function():boolean -- Get whether the world the device is currently in has a breathable atmosphere.")
/* 26 */   public Object[] hasBreathableAtmosphere(Context context, Arguments args) { return withProvider((Function1<IGalacticraftWorldProvider, Object[]>)new WorldSensorCard$$anonfun$hasBreathableAtmosphere$1(this), package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }))); } public final class WorldSensorCard$$anonfun$hasBreathableAtmosphere$1 extends AbstractFunction1<IGalacticraftWorldProvider, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(IGalacticraftWorldProvider provider) { return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(provider.hasBreathableAtmosphere()) })); }
/*    */ 
/*    */     
/*    */     public WorldSensorCard$$anonfun$hasBreathableAtmosphere$1(WorldSensorCard $outer) {} }
/*    */ 
/*    */   
/*    */   @Callback(doc = "function(gas:string):boolean -- Get whether the world the device is currently in has the specified gas (e.g. oxygen or nitrogen).")
/* 33 */   public Object[] isGasPresent(Context context, Arguments args) { return withProvider((Function1<IGalacticraftWorldProvider, Object[]>)new WorldSensorCard$$anonfun$isGasPresent$1(this, args), package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }))); } public final class WorldSensorCard$$anonfun$isGasPresent$1 extends AbstractFunction1<IGalacticraftWorldProvider, Object[]> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Arguments args$1; public WorldSensorCard$$anonfun$isGasPresent$1(WorldSensorCard $outer, Arguments args$1) {} public final Object[] apply(IGalacticraftWorldProvider provider) { IAtmosphericGas gas = IAtmosphericGas.valueOf(this.args$1.checkString(0).toUpperCase());
/*    */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(provider.isGasPresent(gas)) })); } }
/*    */   @Callback(doc = "function():number -- Get the wind level in the world the device is currently in.")
/* 37 */   public Object[] getWindLevel(Context context, Arguments args) { return withProvider((Function1<IGalacticraftWorldProvider, Object[]>)new WorldSensorCard$$anonfun$getWindLevel$1(this), package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(1.0F) }))); } public final class WorldSensorCard$$anonfun$getWindLevel$1 extends AbstractFunction1<IGalacticraftWorldProvider, Object[]> implements Serializable { public static final long serialVersionUID = 0L; public final Object[] apply(IGalacticraftWorldProvider provider) { return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToFloat(provider.getWindLevel()) })); } public WorldSensorCard$$anonfun$getWindLevel$1(WorldSensorCard $outer) {} } private Object[] withProvider(Function1 f, Object[] default) {
/*    */     Object[] arrayOfObject;
/* 39 */     WorldProvider worldProvider = (host().world()).field_73011_w;
/* 40 */     if (worldProvider instanceof IGalacticraftWorldProvider) { WorldProvider worldProvider1 = worldProvider; arrayOfObject = (Object[])f.apply(worldProvider1); }
/* 41 */     else { arrayOfObject = default; }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */   
/*    */   private Object[] withProvider$default$2(Function1 f) {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public WorldSensorCard(EnvironmentHost host) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gc\WorldSensorCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */