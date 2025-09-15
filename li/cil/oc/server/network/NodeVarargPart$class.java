/*     */ package li.cil.oc.server.network;
/*     */ 
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.reflect.ClassTag$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class NodeVarargPart$class
/*     */ {
/*     */   public static void $init$(NodeVarargPart $this) {}
/*     */   
/*     */   public static void sendToAddress(NodeVarargPart $this, String target, String name, Seq data) {
/*  97 */     if ($this.network() != null) $this.network().sendToAddress($this, target, name, (Object[])data.toArray(ClassTag$.MODULE$.AnyRef())); 
/*     */   }
/*     */   public static void sendToNeighbors(NodeVarargPart $this, String name, Seq data) {
/* 100 */     if ($this.network() != null) $this.network().sendToNeighbors($this, name, (Object[])data.toArray(ClassTag$.MODULE$.AnyRef())); 
/*     */   }
/*     */   public static void sendToReachable(NodeVarargPart $this, String name, Seq data) {
/* 103 */     if ($this.network() != null) $this.network().sendToReachable($this, name, (Object[])data.toArray(ClassTag$.MODULE$.AnyRef())); 
/*     */   }
/*     */   public static void sendToVisible(NodeVarargPart $this, String name, Seq data) {
/* 106 */     if ($this.network() != null) $this.network().sendToVisible($this, name, (Object[])data.toArray(ClassTag$.MODULE$.AnyRef())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\NodeVarargPart$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */