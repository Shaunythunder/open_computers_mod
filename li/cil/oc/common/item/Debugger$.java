/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Component;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Message;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.StringContext;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Debugger$
/*    */   implements Environment
/*    */ {
/*    */   public static final Debugger$ MODULE$;
/*    */   private Node node;
/*    */   
/*    */   private Debugger$() {
/* 42 */     MODULE$ = this;
/* 43 */     this.node = Network.newNode(this, Visibility.Network).create(); } public Node node() { return this.node; } public void node_$eq(Node x$1) { this.node = x$1; }
/*    */   
/*    */   public void onConnect(Node node) {
/* 46 */     (new String[2])[0] = "[NETWORK DEBUGGER] New node in network: "; (new String[2])[1] = ""; li.cil.oc.OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { nodeInfo(node) })));
/*    */   }
/*    */   
/*    */   public void onDisconnect(Node node) {
/* 50 */     (new String[2])[0] = "[NETWORK DEBUGGER] Node removed from network: "; (new String[2])[1] = ""; li.cil.oc.OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { nodeInfo(node) })));
/*    */   }
/*    */   
/*    */   public void onMessage(Message message) {
/* 54 */     (new String[2])[0] = "[NETWORK DEBUGGER] Received message: "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { messageInfo(message) })));
/*    */   }
/*    */   
/*    */   public void reconnect(Node[] nodes) {
/* 58 */     node().remove();
/* 59 */     Network.joinNewNetwork(node());
/* 60 */     scala.Predef$.MODULE$.refArrayOps((Object[])nodes).withFilter((Function1)new Debugger$$anonfun$reconnect$1()).foreach((Function1)new Debugger$$anonfun$reconnect$2()); } public final class Debugger$$anonfun$reconnect$1 extends AbstractFunction1<Node, Object> implements Serializable { public final boolean apply(Node node) { return !(node == null); } public static final long serialVersionUID = 0L; } public final class Debugger$$anonfun$reconnect$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node node) {
/* 61 */       Debugger$.MODULE$.node().connect(node);
/*    */     } }
/*    */   private String nodeInfo(Node node) {
/*    */     BoxedUnit boxedUnit;
/* 65 */     (new String[3])[0] = "{address = "; (new String[3])[1] = ", reachability = "; (new String[3])[2] = ""; Node node1 = node;
/* 66 */     if (node1 instanceof ComponentConnector) { ComponentConnector componentConnector = (ComponentConnector)node1; String str = (new StringBuilder()).append(componentInfo((Component)componentConnector)).append(connectorInfo((Connector)componentConnector)).toString(); }
/* 67 */     else if (node1 instanceof Component) { Component component = (Component)node1; String str = componentInfo(component); }
/* 68 */     else if (node1 instanceof Connector) { Connector connector = (Connector)node1; String str = connectorInfo(connector); }
/* 69 */     else { boxedUnit = BoxedUnit.UNIT; }
/* 70 */      return (new StringBuilder()).append((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { node.address(), node.reachability().name() }))).append(boxedUnit).append("}").toString();
/*    */   } private String componentInfo(Component component) {
/* 72 */     (new String[3])[0] = ", type = component, name = "; (new String[3])[1] = ", visibility = "; (new String[3])[2] = ""; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { component.name(), component.visibility().name() }));
/*    */   } private String connectorInfo(Connector connector) {
/* 74 */     (new String[3])[0] = ", type = connector, buffer = "; (new String[3])[1] = ", bufferSize = "; (new String[3])[2] = ""; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(connector.localBuffer()), BoxesRunTime.boxToDouble(connector.localBufferSize()) }));
/*    */   } private String messageInfo(Message message) {
/* 76 */     (new String[4])[0] = "{name = "; (new String[4])[1] = ", source = "; (new String[4])[2] = ", data = ["; (new String[4])[3] = "]}"; return (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { message.name(), nodeInfo(message.source()), scala.Predef$.MODULE$.refArrayOps(message.data()).mkString(", ") }));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Debugger$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */