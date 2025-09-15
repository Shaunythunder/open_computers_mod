/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Y3A!\001\002\001\033\taQj\034;j_:\034VM\\:pe*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qq\003\005\002\020+5\t\001C\003\002\004#)\021!cE\001\n[&tWm\031:bMRT\021\001F\001\004]\026$\030B\001\f\021\005)!\026\016\\3F]RLG/\037\t\0031mi\021!\007\006\0035\t\ta\001\036:bSR\034\030B\001\017\032\005-)eN^5s_:lWM\034;\t\013y\001A\021A\020\002\rqJg.\033;?)\005\001\003CA\021\001\033\005\021\001bB\022\001\005\004%\t\001J\001\r[>$\030n\0348TK:\034xN]\013\002KA\021aeK\007\002O)\021\001&K\001\nG>l\007o\0348f]RT!A\013\004\002\rM,'O^3s\023\t\tq\005\003\004.\001\001\006I!J\001\016[>$\030n\0348TK:\034xN\035\021\t\013=\002A\021\001\031\002\t9|G-\032\013\002cA\021!gN\007\002g)\021A'N\001\b]\026$xo\034:l\025\t1d!A\002ba&L!\001O\032\003\t9{G-\032\005\006u\001!\teO\001\nG\006tW\013\0353bi\026$\022\001\020\t\003{\001k\021A\020\006\002\005)1oY1mC&\021\021I\020\002\b\005>|G.Z1o\021\025\031\005\001\"\021E\0031)\b\017Z1uK\026sG/\033;z)\005)\005CA\037G\023\t9eH\001\003V]&$\b\"B%\001\t\003R\025\001\006:fC\0224%o\\7O\005R3uN]*feZ,'\017\006\002F\027\")A\n\023a\001\033\006\031aN\031;\021\0059\003V\"A(\013\0051\013\022BA)P\0059q%\t\026+bO\016{W\016]8v]\022DQa\025\001\005BQ\0131c\036:ji\026$vN\024\"U\r>\0248+\032:wKJ$\"!R+\t\0131\023\006\031A'")
/*    */ public class MotionSensor extends TileEntity implements Environment {
/*    */   private final li.cil.oc.server.component.MotionSensor motionSensor;
/*    */   
/*  7 */   public boolean isChangeScheduled() { return this.isChangeScheduled; } private boolean isChangeScheduled; private boolean moving; public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { TileEntity.class.readFromNBTForClient((TileEntity)this, nbt); } public void writeToNBTForClient(NBTTagCompound nbt) { TileEntity.class.writeToNBTForClient((TileEntity)this, nbt); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public MotionSensor() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this);
/*  8 */     this.motionSensor = new li.cil.oc.server.component.MotionSensor((EnvironmentHost)this); } public li.cil.oc.server.component.MotionSensor motionSensor() { return this.motionSensor; }
/*    */    public Node node() {
/* 10 */     return (Node)motionSensor().node();
/*    */   } public boolean canUpdate() {
/* 12 */     return isServer();
/*    */   }
/*    */   public void func_145845_h() {
/* 15 */     Environment.class.updateEntity(this);
/* 16 */     motionSensor().update();
/*    */   }
/*    */   
/*    */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 20 */     Environment.class.readFromNBTForServer(this, nbt);
/* 21 */     motionSensor().load(nbt);
/*    */   }
/*    */   
/*    */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 25 */     Environment.class.writeToNBTForServer(this, nbt);
/* 26 */     motionSensor().save(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\MotionSensor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */