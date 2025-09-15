/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.server.network.DebugNetwork;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ 
/*    */ public final class SendDebugMessageCommand$ extends SimpleCommand {
/*    */   public static final SendDebugMessageCommand$ MODULE$;
/*    */   
/*    */   private SendDebugMessageCommand$() {
/*  9 */     super("oc_sendDebugMessage"); MODULE$ = this;
/* 10 */     aliases().$plus$eq("oc_sdbg");
/*    */   } public String func_71518_a(ICommandSender sender) {
/* 12 */     return (new StringBuilder()).append(name()).append("<destinationAddress> [message...]").toString();
/*    */   }
/*    */   
/* 15 */   public void func_71515_b(ICommandSender sender, String[] args) { if (args == null || args.length == 0) {
/* 16 */       throw new WrongUsageException("no destination address specified.", new Object[0]);
/*    */     }
/* 18 */     String destination = args[0];
/* 19 */     li.cil.oc.server.network.DebugNetwork$.MODULE$.getEndpoint(destination).foreach((Function1)new SendDebugMessageCommand$$anonfun$processCommand$1(sender, args, destination)); } public final class SendDebugMessageCommand$$anonfun$processCommand$1 extends AbstractFunction1<DebugNetwork.DebugNode, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ICommandSender sender$1; public final void apply(DebugNetwork.DebugNode endpoint) {
/* 20 */       Packet packet = Network.newPacket(this.sender$1.func_70005_c_(), this.destination$1, 0, (Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.args$1).drop(1)).toList().toArray(scala.reflect.ClassTag$.MODULE$.AnyRef()));
/* 21 */       endpoint.receivePacket(packet);
/*    */     } private final String[] args$1; private final String destination$1;
/*    */     public SendDebugMessageCommand$$anonfun$processCommand$1(ICommandSender sender$1, String[] args$1, String destination$1) {} }
/*    */   public int func_82362_a() {
/* 25 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\SendDebugMessageCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */