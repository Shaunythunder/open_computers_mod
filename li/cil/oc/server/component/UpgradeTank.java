/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mc\001B\001\003\0015\0211\"\0269he\006$W\rV1oW*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\005\00191\002\005\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9b$D\001\031\025\tI\"$\001\004gYVLGm\035\006\0037q\ta\"\\5oK\016\024\030M\032;g_J<WMC\001\036\003\rqW\r^\005\003?a\021!\"\023$mk&$G+\0318l!\t\tC%D\001#\025\t\031##\001\004ee&4XM]\005\003K\t\022!\002R3wS\016,\027J\0344p\021!9\003A!b\001\n\003A\023!B8x]\026\024X#A\025\021\005)jS\"A\026\013\0051\022\022a\0028fi^|'o[\005\003]-\022q\"\0228wSJ|g.\\3oi\"{7\017\036\005\ta\001\021\t\021)A\005S\0051qn\0368fe\002B\001B\r\001\003\006\004%\taM\001\tG\006\004\030mY5usV\tA\007\005\0026q5\taGC\0018\003\025\0318-\0317b\023\tIdGA\002J]RD\001b\017\001\003\002\003\006I\001N\001\nG\006\004\030mY5us\002BQ!\020\001\005\002y\na\001P5oSRtDcA B\005B\021\001\tA\007\002\005!)q\005\020a\001S!)!\007\020a\001i!9A\t\001b\001\n\003*\025\001\0028pI\026,\022A\022\t\003U\035K!\001S\026\003\t9{G-\032\005\007\025\002\001\013\021\002$\002\0139|G-\032\021\t\0211\003\001R1A\005\0165\013!\002Z3wS\016,\027J\0344p+\005q\005\003B(U-Zk\021\001\025\006\003#J\013\021\"[7nkR\f'\r\\3\013\005M3\024AC2pY2,7\r^5p]&\021Q\013\025\002\004\033\006\004\bCA,]\033\005A&BA-[\003\021a\027M\\4\013\003m\013AA[1wC&\021Q\f\027\002\007'R\024\030N\\4\t\021}\003\001\022!Q!\0169\0131\002Z3wS\016,\027J\0344pA!)\021\r\001C!E\006iq-\032;EKZL7-Z%oM>$\022a\031\t\005I\036D\007.D\001f\025\t1',\001\003vi&d\027BA+f!\tIGN\004\0026U&\0211NN\001\007!J,G-\0324\n\005uk'BA67\021\035y\007A1A\005\002A\fA\001^1oWV\t\021\017\005\002\030e&\0211\017\007\002\n\r2,\030\016\032+b].Da!\036\001!\002\023\t\030!\002;b].\004\003\"B<\001\t\003B\030\001\0027pC\022$\"!\037?\021\005UR\030BA>7\005\021)f.\033;\t\013u4\b\031\001@\002\0079\024G\017E\002\000\003\017i!!!\001\013\007u\f\031AC\002\002\006q\t\021\"\\5oK\016\024\030M\032;\n\t\005%\021\021\001\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\ti\001\001C!\003\037\tAa]1wKR\031\0210!\005\t\ru\fY\0011\001\021\035\t)\002\001C!\003/\t\001bZ3u\r2,\030\016\032\013\003\0033\0012aFA\016\023\r\ti\002\007\002\013\r2,\030\016Z*uC\016\\\007bBA\021\001\021\005\0231E\001\017O\026$h\t\\;jI\006kw.\0368u)\005!\004bBA\024\001\021\005\0231E\001\fO\026$8)\0319bG&$\030\020C\004\002,\001!\t%!\f\002\017\035,G/\0238g_R\021\021q\006\t\004/\005E\022bAA\0321\tia\t\\;jIR\013gn[%oM>Dq!a\016\001\t\003\nI$\001\003gS2dG#\002\033\002<\005}\002\002CA\037\003k\001\r!!\007\002\013M$\030mY6\t\021\005\005\023Q\007a\001\003\007\na\001Z8GS2d\007cA\033\002F%\031\021q\t\034\003\017\t{w\016\\3b]\"9\0211\n\001\005B\0055\023!\0023sC&tGCBA\r\003\037\n\031\006C\004\002R\005%\003\031\001\033\002\0215\f\007\020\022:bS:D\001\"!\026\002J\001\007\0211I\001\bI>$%/Y5o\021\031\tI\006\001C\005g\005IA/\0318l\023:$W\r\037")
/*    */ public class UpgradeTank extends ManagedEnvironment implements IFluidTank, DeviceInfo {
/*    */   private final EnvironmentHost owner;
/*    */   private final int capacity;
/*    */   private final Node node;
/*    */   private Map<String, String> deviceInfo;
/*    */   private final FluidTank tank;
/*    */   private volatile boolean bitmap$0;
/*    */   
/* 20 */   public EnvironmentHost owner() { return this.owner; } public int capacity() { return this.capacity; }
/* 21 */   public UpgradeTank(EnvironmentHost owner, int capacity) { this.node = Network.newNode((Environment)this, Visibility.None).create();
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
/* 35 */     this.tank = new FluidTank(capacity); } public Node node() { return this.node; } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic"); (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Tank upgrade"); (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Superblubb V10"); (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(capacity()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }  return this.deviceInfo; }  } public FluidTank tank() { return this.tank; }
/*    */   private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*    */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); } public void load(NBTTagCompound nbt) {
/* 38 */     super.load(nbt);
/* 39 */     tank().readFromNBT(nbt);
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 43 */     super.save(nbt);
/* 44 */     tank().writeToNBT(nbt);
/*    */   }
/*    */ 
/*    */   
/*    */   public FluidStack getFluid() {
/* 49 */     return tank().getFluid();
/*    */   } public int getFluidAmount() {
/* 51 */     return tank().getFluidAmount();
/*    */   } public int getCapacity() {
/* 53 */     return tank().getCapacity();
/*    */   } public FluidTankInfo getInfo() {
/* 55 */     return tank().getInfo();
/*    */   }
/*    */   public int fill(FluidStack stack, boolean doFill) {
/* 58 */     int amount = tank().fill(stack, doFill);
/* 59 */     if (doFill && amount > 0) {
/* 60 */       node().sendToVisible("computer.signal", new Object[] { "tank_changed", BoxesRunTime.boxToInteger(tankIndex()), BoxesRunTime.boxToInteger(amount) });
/*    */     }
/* 62 */     return amount;
/*    */   }
/*    */   
/*    */   public FluidStack drain(int maxDrain, boolean doDrain) {
/* 66 */     FluidStack amount = tank().drain(maxDrain, doDrain);
/* 67 */     if (doDrain && amount != null && amount.amount > 0) {
/* 68 */       node().sendToVisible("computer.signal", new Object[] { "tank_changed", BoxesRunTime.boxToInteger(tankIndex()), BoxesRunTime.boxToInteger(-amount.amount) });
/*    */     }
/* 70 */     return amount;
/*    */   }
/*    */   
/*    */   private int tankIndex() {
/* 74 */     EnvironmentHost environmentHost = owner();
/* 75 */     if (environmentHost instanceof Agent) { Agent agent = (Agent)environmentHost; if (agent.tank() != null)
/* 76 */       { MultiTank multiTank = agent.tank(); IndexedSeq tanks = (IndexedSeq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), agent.tank().tankCount()).map((Function1)new UpgradeTank$$anonfun$1(this, multiTank), IndexedSeq$.MODULE$.canBuildFrom());
/* 77 */         int index = tanks.indexOf(this); return RichInt$.MODULE$
/* 78 */           .max$extension(Predef$.MODULE$.intWrapper(index), 0) + 1; }  }
/* 79 */      return 1;
/*    */   }
/*    */   
/*    */   public final class UpgradeTank$$anonfun$1 extends AbstractFunction1<Object, IFluidTank> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final MultiTank eta$0$1$1;
/*    */     
/*    */     public final IFluidTank apply(int x$1) {
/*    */       return this.eta$0$1$1.getFluidTank(x$1);
/*    */     }
/*    */     
/*    */     public UpgradeTank$$anonfun$1(UpgradeTank $outer, MultiTank eta$0$1$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeTank.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */