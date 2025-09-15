/*     */ package li.cil.oc.server.network;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import li.cil.oc.server.driver.CompoundBlockEnvironment;
/*     */ import li.cil.oc.server.machine.Callbacks;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public abstract class Component$class {
/*     */   public static Visibility visibility(Component $this) {
/*  23 */     return $this.li$cil$oc$server$network$Component$$_visibility();
/*     */   }
/*  25 */   public static Map li$cil$oc$server$network$Component$$callbacks(Component $this) { return Callbacks$.MODULE$.apply($this.host()); } public static Map li$cil$oc$server$network$Component$$hosts(Component $this) {
/*     */     Map map;
/*  27 */     Environment environment = $this.host();
/*  28 */     if (environment instanceof CompoundBlockEnvironment) { CompoundBlockEnvironment compoundBlockEnvironment = (CompoundBlockEnvironment)environment;
/*  29 */       map = (Map)$this.li$cil$oc$server$network$Component$$callbacks().map((Function1)new Component$$anonfun$li$cil$oc$server$network$Component$$hosts$1($this, compoundBlockEnvironment), Map$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  48 */       map = (Map)$this.li$cil$oc$server$network$Component$$callbacks().map((Function1)new Component$$anonfun$li$cil$oc$server$network$Component$$hosts$2($this), Map$.MODULE$.canBuildFrom()); }
/*     */     
/*     */     return map;
/*     */   }
/*     */   public static void $init$(Component $this) {
/*  53 */     $this.li$cil$oc$server$network$Component$$_visibility_$eq(Visibility.None);
/*     */   }
/*     */   public static void setVisibility(Component $this, Visibility value) {
/*  56 */     if (value.ordinal() > $this.reachability().ordinal()) {
/*  57 */       throw new IllegalArgumentException((
/*  58 */           new StringBuilder()).append("Trying to set computer visibility to '").append(value).append("' on a '").append($this.name()).append("' node with reachability '").append($this.reachability()).append("'. It will be limited to the node's reachability.").toString());
/*     */     }
/*  60 */     if (SideTracker.isServer()) {
/*  61 */       if ($this.network() != null) { Visibility visibility = $this.li$cil$oc$server$network$Component$$_visibility();
/*  62 */         if (Visibility.Neighbors.equals(visibility)) { Visibility visibility1 = value;
/*  63 */           if (Visibility.Network.equals(visibility1)) { addTo($this, WrapAsScala$.MODULE$.iterableAsScalaIterable($this.reachableNodes())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  64 */           else if (Visibility.None.equals(visibility1)) { removeFrom($this, WrapAsScala$.MODULE$.iterableAsScalaIterable($this.neighbors())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  65 */           else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */            BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  67 */         else if (Visibility.Network.equals(visibility)) { Visibility visibility1 = value;
/*  68 */           if (Visibility.Neighbors.equals(visibility1))
/*  69 */           { Set neighborSet = WrapAsScala$.MODULE$.iterableAsScalaIterable($this.neighbors()).toSet();
/*  70 */             removeFrom($this, (Iterable)WrapAsScala$.MODULE$.iterableAsScalaIterable($this.reachableNodes()).filterNot((Function1)new Component$$anonfun$setVisibility$1($this, neighborSet))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  71 */           else if (Visibility.None.equals(visibility1)) { removeFrom($this, WrapAsScala$.MODULE$.iterableAsScalaIterable($this.reachableNodes())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  72 */           else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */            BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  74 */         else if (Visibility.None.equals(visibility)) { Visibility visibility1 = value;
/*  75 */           if (Visibility.Neighbors.equals(visibility1)) { addTo($this, WrapAsScala$.MODULE$.iterableAsScalaIterable($this.neighbors())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  76 */           else if (Visibility.Network.equals(visibility1)) { addTo($this, WrapAsScala$.MODULE$.iterableAsScalaIterable($this.reachableNodes())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  77 */           else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }  BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         else { throw new MatchError(visibility); }
/*     */          }
/*  80 */        $this.li$cil$oc$server$network$Component$$_visibility_$eq(value);
/*     */     } 
/*     */   }
/*     */   
/*  84 */   public static boolean canBeSeenFrom(Component $this, Node other) { Visibility visibility = $this.visibility();
/*  85 */     if (Visibility.None.equals(visibility)) { boolean bool = false; }
/*  86 */     else if (Visibility.Network.equals(visibility)) { boolean bool = $this.canBeReachedFrom(other); }
/*  87 */     else { if (Visibility.Neighbors.equals(visibility)) return $this.isNeighborOf(other); 
/*     */       throw new MatchError(visibility); }
/*     */     
/*  90 */     return SYNTHETIC_LOCAL_VARIABLE_3; } private static void addTo(Component $this, Iterable nodes) { nodes.foreach((Function1)new Component$$anonfun$addTo$1($this)); }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void removeFrom(Component $this, Iterable nodes) {
/*  95 */     nodes.foreach((Function1)new Component$$anonfun$removeFrom$1($this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Set methods(Component $this) {
/* 102 */     return WrapAsJava$.MODULE$.setAsJavaSet((Set)$this.li$cil$oc$server$network$Component$$callbacks().keySet());
/*     */   }
/*     */   public static Callback annotation(Component $this, String method) {
/* 105 */     Option option = $this.li$cil$oc$server$network$Component$$callbacks().get(method);
/* 106 */     if (option instanceof Some) return ((Callbacks.Callback)$this.li$cil$oc$server$network$Component$$callbacks().apply(method)).annotation(); 
/* 107 */     throw new NoSuchMethodException();
/*     */   }
/*     */   
/*     */   public static Object[] invoke(Component $this, String method, Context context, Seq arguments) {
/* 111 */     Option option = $this.li$cil$oc$server$network$Component$$callbacks().get(method);
/* 112 */     if (option instanceof Some) { Some some = (Some)option; Callbacks.Callback callback = (Callbacks.Callback)some.x(); Option option1 = (Option)$this.li$cil$oc$server$network$Component$$hosts().apply(method);
/* 113 */       if (option1 instanceof Some) { Some some1 = (Some)option1; Environment environment = (Environment)some1.x(); Object[] arrayOfObject2 = Registry$.MODULE$.convert(callback.apply(environment, context, (Arguments)new ArgumentsImpl((Seq)Seq$.MODULE$.apply(arguments)))); Object[] arrayOfObject1 = arrayOfObject2; }
/* 114 */        throw new NoSuchMethodException(); }
/*     */     
/* 116 */     throw new NoSuchMethodException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void load(Component $this, NBTTagCompound nbt) {
/* 123 */     $this.li$cil$oc$server$network$Component$$super$load(nbt);
/* 124 */     if (nbt.func_74764_b("visibility")) {
/* 125 */       $this.li$cil$oc$server$network$Component$$_visibility_$eq(Visibility.values()[nbt.func_74762_e("visibility")]);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void save(Component $this, NBTTagCompound nbt) {
/* 130 */     $this.li$cil$oc$server$network$Component$$super$save(nbt);
/* 131 */     nbt.func_74768_a("visibility", $this.li$cil$oc$server$network$Component$$_visibility().ordinal());
/*     */   }
/*     */   public static String toString(Component $this) {
/* 134 */     (new String[2])[0] = "@"; (new String[2])[1] = ""; return (new StringBuilder()).append($this.li$cil$oc$server$network$Component$$super$toString()).append((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { $this.name() }))).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Component$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */