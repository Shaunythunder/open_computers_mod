/*    */ package li.cil.oc.server.network;
/*    */ 
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.MatchError;
/*    */ import scala.Predef$;
/*    */ import scala.StringContext;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.TraversableOnce;
/*    */ import scala.collection.convert.WrapAsJava$;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.package$;
/*    */ 
/*    */ public abstract class Node$class {
/*    */   public static void $init$(Node $this) {
/* 18 */     $this.address_$eq(null);
/*    */     
/* 20 */     $this.network_$eq(null);
/*    */   }
/* 22 */   public static boolean canBeReachedFrom(Node $this, Node other) { Visibility visibility = $this.reachability();
/* 23 */     if (Visibility.None.equals(visibility)) { boolean bool = false; }
/* 24 */     else if (Visibility.Neighbors.equals(visibility)) { boolean bool = $this.isNeighborOf(other); }
/* 25 */     else { if (Visibility.Network.equals(visibility)) return isInSameNetwork($this, other); 
/*    */       throw new MatchError(visibility); }
/*    */     
/*    */     return SYNTHETIC_LOCAL_VARIABLE_3; } public static boolean isNeighborOf(Node $this, Node other) {
/* 29 */     return (isInSameNetwork($this, other) && WrapAsScala$.MODULE$.iterableAsScalaIterable($this.network().neighbors($this)).exists((Function1)new Node$$anonfun$isNeighborOf$1($this, other)));
/*    */   }
/*    */   public static Iterable reachableNodes(Node $this) {
/* 32 */     return ($this.network() == null) ? WrapAsJava$.MODULE$.seqAsJavaList(((TraversableOnce)package$.MODULE$.Iterable().empty()).toSeq()) : 
/* 33 */       $this.network().nodes($this);
/*    */   }
/*    */   public static Iterable neighbors(Node $this) {
/* 36 */     return ($this.network() == null) ? WrapAsJava$.MODULE$.seqAsJavaList(((TraversableOnce)package$.MODULE$.Iterable().empty()).toSeq()) : 
/* 37 */       $this.network().neighbors($this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void connect(Node $this, Node node) {
/* 44 */     if ($this.network() != null) $this.network().connect($this, node); 
/*    */   }
/*    */   public static void disconnect(Node $this, Node node) {
/* 47 */     if ($this.network() != null && isInSameNetwork($this, node)) $this.network().disconnect($this, node); 
/*    */   } public static void remove(Node $this) {
/* 49 */     if ($this.network() != null) $this.network().remove($this); 
/*    */   }
/*    */   private static boolean isInSameNetwork(Node $this, Node other) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   6: ifnull -> 49
/*    */     //   9: aload_1
/*    */     //   10: ifnull -> 49
/*    */     //   13: aload_0
/*    */     //   14: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   19: aload_1
/*    */     //   20: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   25: astore_2
/*    */     //   26: dup
/*    */     //   27: ifnonnull -> 38
/*    */     //   30: pop
/*    */     //   31: aload_2
/*    */     //   32: ifnull -> 45
/*    */     //   35: goto -> 49
/*    */     //   38: aload_2
/*    */     //   39: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   42: ifeq -> 49
/*    */     //   45: iconst_1
/*    */     //   46: goto -> 50
/*    */     //   49: iconst_0
/*    */     //   50: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	51	0	$this	Lli/cil/oc/server/network/Node;
/*    */     //   0	51	1	other	Lli/cil/oc/api/network/Node;
/*    */   }
/*    */   
/*    */   public static void onConnect(Node $this, Node node) {
/*    */     try {
/* 57 */       $this.host().onConnect(node);
/*    */     } finally {
/*    */       Exception exception = null;
/*    */       (new String[2])[0] = "A component of type '";
/*    */       (new String[2])[1] = "' threw an error while being connected to the component network.";
/*    */     } 
/*    */   } public static void onDisconnect(Node $this, Node node) {
/*    */     try {
/* 65 */       $this.host().onDisconnect(node);
/*    */     } finally {
/*    */       Exception exception = null;
/*    */       (new String[2])[0] = "A component of type '";
/*    */       (new String[2])[1] = "' threw an error while being disconnected from the component network.";
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void load(Node $this, NBTTagCompound nbt) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'address'
/*    */     //   3: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*    */     //   6: ifeq -> 103
/*    */     //   9: aload_1
/*    */     //   10: ldc 'address'
/*    */     //   12: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   15: astore_2
/*    */     //   16: aload_2
/*    */     //   17: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*    */     //   20: ifne -> 103
/*    */     //   23: aload_2
/*    */     //   24: aload_0
/*    */     //   25: invokeinterface address : ()Ljava/lang/String;
/*    */     //   30: astore_3
/*    */     //   31: dup
/*    */     //   32: ifnonnull -> 43
/*    */     //   35: pop
/*    */     //   36: aload_3
/*    */     //   37: ifnull -> 103
/*    */     //   40: goto -> 50
/*    */     //   43: aload_3
/*    */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   47: ifne -> 103
/*    */     //   50: aload_0
/*    */     //   51: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   56: astore #4
/*    */     //   58: aload #4
/*    */     //   60: instanceof li/cil/oc/server/network/Network$Wrapper
/*    */     //   63: ifeq -> 91
/*    */     //   66: aload #4
/*    */     //   68: checkcast li/cil/oc/server/network/Network$Wrapper
/*    */     //   71: astore #5
/*    */     //   73: aload #5
/*    */     //   75: invokevirtual network : ()Lli/cil/oc/server/network/Network;
/*    */     //   78: aload_0
/*    */     //   79: aload_2
/*    */     //   80: invokevirtual remap : (Lli/cil/oc/server/network/Node;Ljava/lang/String;)V
/*    */     //   83: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   86: astore #6
/*    */     //   88: goto -> 103
/*    */     //   91: aload_0
/*    */     //   92: aload_2
/*    */     //   93: invokeinterface address_$eq : (Ljava/lang/String;)V
/*    */     //   98: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   101: astore #6
/*    */     //   103: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #74	-> 0
/*    */     //   #75	-> 9
/*    */     //   #76	-> 16
/*    */     //   #77	-> 58
/*    */     //   #78	-> 91
/*    */     //   #74	-> 103
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	104	0	$this	Lli/cil/oc/server/network/Node;
/*    */     //   0	104	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   16	88	2	newAddress	Ljava/lang/String;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void save(Node $this, NBTTagCompound nbt) {
/* 84 */     if ($this.address() != null)
/* 85 */       nbt.func_74778_a("address", $this.address()); 
/*    */   }
/*    */   
/*    */   public static String toString(Node $this) {
/* 89 */     (new String[3])[0] = "Node("; (new String[3])[1] = ", "; (new String[3])[2] = ")"; return (new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { $this.address(), $this.host() }));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Node$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */