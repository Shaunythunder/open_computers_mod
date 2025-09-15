/*    */ package li.cil.oc.common;
/*    */ import com.google.common.cache.Cache;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.event.world.WorldEvent;
/*    */ import scala.Function0;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]a!B\001\003\003\003Y!\001E\"p[B|g.\0328u)J\f7m[3s\025\t\031A!\001\004d_6lwN\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\0011C\001\001\r!\ti\001#D\001\017\025\005y\021!B:dC2\f\027BA\t\017\005\031\te.\037*fM\")1\003\001C\001)\0051A(\0338jiz\"\022!\006\t\003-\001i\021A\001\005\b1\001\021\r\021\"\003\032\003\0319xN\0357egV\t!\004\005\003\034A\t*S\"\001\017\013\005uq\022aB7vi\006\024G.\032\006\003?9\t!bY8mY\026\034G/[8o\023\t\tCDA\002NCB\004\"!D\022\n\005\021r!aA%oiB!aE\f\0318\033\0059#B\001\025*\003\025\031\027m\0315f\025\t\031!F\003\002,Y\0051qm\\8hY\026T\021!L\001\004G>l\027BA\030(\005\025\031\025m\0315f!\t\tDG\004\002\016e%\0211GD\001\007!J,G-\0324\n\005U2$AB*ue&twM\003\0024\035A\021\001(P\007\002s)\021!hO\001\b]\026$xo\034:l\025\taD!A\002ba&L!AP\035\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\007\001\002\001\013\021\002\016\002\017]|'\017\0343tA!)!\t\001C\005\007\006Q1m\\7q_:,g\016^:\025\005\025\"\005\"B#B\001\0041\025!B<pe2$\007CA$N\033\005A%BA#J\025\tQ5*A\005nS:,7M]1gi*\tA*A\002oKRL!A\024%\003\013]{'\017\0343\t\013A\003A\021A)\002\007\005$G\r\006\003S+ZC\006CA\007T\023\t!fB\001\003V]&$\b\"B#P\001\0041\005\"B,P\001\004\001\024aB1eIJ,7o\035\005\0063>\003\raN\001\nG>l\007o\0348f]RDQa\027\001\005\002q\013aA]3n_Z,Gc\001*^=\")QI\027a\001\r\")\021L\027a\001o!)\001\r\001C\001C\006\031q-\032;\025\007\t,g\rE\002\016G^J!\001\032\b\003\r=\003H/[8o\021\025)u\f1\001G\021\0259v\f1\0011\021\025A\007\001\"\001j\0035ygnV8sY\022,f\016\\8bIR\021!K\033\005\006W\036\004\r\001\\\001\002KB\021QN\036\b\003]Rl\021a\034\006\003\013BT!!\035:\002\013\0254XM\034;\013\005M\\\025AD7j]\026\034'/\0314uM>\024x-Z\005\003k>\f!bV8sY\022,e/\0328u\023\t9\bP\001\004V]2|\027\r\032\006\003k>D#a\032>\021\007m\fY!D\001}\025\tih0\001\007fm\026tG\017[1oI2,'O\003\002\004*!\021\021AA\002\003\r1W\016\034\006\005\003\013\t9!\001\003n_\022\034(BAA\005\003\r\031\007o^\005\004\003\033a(AD*vEN\034'/\0332f\013Z,g\016\036\005\b\003#\001A\021CA\n\003\025\031G.Z1s)\r\021\026Q\003\005\007\013\006=\001\031\001$")
/*    */ public abstract class ComponentTracker {
/* 20 */   private final Map<Object, Cache<String, ManagedEnvironment>> worlds = Map$.MODULE$.empty(); private Map<Object, Cache<String, ManagedEnvironment>> worlds() { return this.worlds; }
/*    */ 
/*    */   
/* 23 */   private Cache<String, ManagedEnvironment> components(World world) { return (Cache<String, ManagedEnvironment>)worlds().getOrElseUpdate(BoxesRunTime.boxToInteger(world.field_73011_w.field_76574_g), 
/*    */ 
/*    */ 
/*    */         
/* 27 */         (Function0)new ComponentTracker$$anonfun$components$1(this)); } public final class ComponentTracker$$anonfun$components$1 extends AbstractFunction0<Cache<String, ManagedEnvironment>> implements Serializable { public static final long serialVersionUID = 0L; public final Cache<String, ManagedEnvironment> apply() { return CacheBuilder.newBuilder().weakValues().build(); }
/*    */     
/*    */     public ComponentTracker$$anonfun$components$1(ComponentTracker $outer) {} }
/*    */   
/*    */   public synchronized void add(World world, String address, ManagedEnvironment component) {
/* 32 */     components(world).put(address, component);
/*    */   } public final class ComponentTracker$$anonfun$remove$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final String apply(Tuple2 x$2) {
/*    */       return (String)x$2._1();
/*    */     }
/*    */     public ComponentTracker$$anonfun$remove$2(ComponentTracker $outer) {} }
/* 38 */   public synchronized void remove(World world, ManagedEnvironment component) { components(world).invalidateAll(WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)WrapAsScala$.MODULE$.mapAsScalaConcurrentMap(components(world).asMap()).filter((Function1)new ComponentTracker$$anonfun$remove$1(this, component))).map((Function1)new ComponentTracker$$anonfun$remove$2(this), Iterable$.MODULE$.canBuildFrom())));
/* 39 */     components(world).cleanUp(); }
/*    */ 
/*    */   
/*    */   public synchronized Option<ManagedEnvironment> get(World world, String address)
/*    */   {
/* 44 */     components(world).cleanUp();
/* 45 */     return Option$.MODULE$.apply(components(world).getIfPresent(address));
/*    */   } public final class ComponentTracker$$anonfun$remove$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final ManagedEnvironment component$1; public final boolean apply(Tuple2 x$1) { ManagedEnvironment managedEnvironment = this.component$1; if (x$1._2() == null) { x$1._2(); if (managedEnvironment != null); }
/*    */       else if (x$1._2().equals(managedEnvironment)) {  }
/* 49 */        } public ComponentTracker$$anonfun$remove$1(ComponentTracker $outer, ManagedEnvironment component$1) {} } @SubscribeEvent public void onWorldUnload(WorldEvent.Unload e) { clear(e.world); }
/*    */   
/*    */   public synchronized void clear(World world) {
/* 52 */     components(world).invalidateAll();
/* 53 */     components(world).cleanUp();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\ComponentTracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */