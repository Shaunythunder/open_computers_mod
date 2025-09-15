/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}c\001B\001\003\0015\021\001bV1za>Lg\016\036\006\003\007\021\t!\002^5mK\026tG/\033;z\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011#\002\001\017/u\001\003CA\b\026\033\005\001\"BA\002\022\025\t\0212#A\005nS:,7M]1gi*\tA#A\002oKRL!A\006\t\003\025QKG.Z#oi&$\030\020\005\002\03175\t\021D\003\002\033\005\0051AO]1jiNL!\001H\r\003\027\025sg/\033:p]6,g\016\036\t\0031yI!aH\r\003\023I{G/\031;bE2,\007C\001\r\"\023\t\021\023DA\007SK\022\034Ho\0348f\003^\f'/\032\005\006I\001!\t!J\001\007y%t\027\016\036 \025\003\031\002\"a\n\001\016\003\tAq!\013\001C\002\023\005!&\001\003o_\022,W#A\026\021\0051\nT\"A\027\013\0059z\023a\0028fi^|'o\033\006\003a\031\t1!\0319j\023\t\021TFA\005D_6\004xN\\3oi\"1A\007\001Q\001\n-\nQA\\8eK\002BqA\016\001A\002\023\005q'A\003mC\n,G.F\0019!\tId(D\001;\025\tYD(\001\003mC:<'\"A\037\002\t)\fg/Y\005\003i\022aa\025;sS:<\007bB!\001\001\004%\tAQ\001\nY\006\024W\r\\0%KF$\"aQ%\021\005\021;U\"A#\013\003\031\013Qa]2bY\006L!\001S#\003\tUs\027\016\036\005\b\025\002\013\t\0211\0019\003\rAH%\r\005\007\031\002\001\013\025\002\035\002\r1\f'-\0327!\021\025q\005\001\"\021P\00311\030\r\\5e\r\006\034\027N\\4t+\005\001\006c\001#R'&\021!+\022\002\006\003J\024\030-\037\t\003)jk\021!\026\006\003-^\013A!\036;jY*\021Q\001\027\006\0033N\ta\"\\5oK\016\024\030M\032;g_J<W-\003\002\\+\nqai\034:hK\022K'/Z2uS>t\007\"B/\001\t\003q\026\001C4fi2\013'-\0327\025\007}\0337\016E\002E#\002\004\"!O1\n\005\tT$AB(cU\026\034G\017C\003e9\002\007Q-A\004d_:$X\r\037;\021\005\031LW\"A4\013\005!|\023aB7bG\"Lg.Z\005\003U\036\024qaQ8oi\026DH\017C\003m9\002\007Q.\001\003be\036\034\bC\0014o\023\tywMA\005Be\036,X.\0328ug\"\"A,\035;v!\t1'/\003\002tO\nA1)\0317mE\006\0347.A\002e_\016\f\023A^\001>MVt7\r^5p]\"J#\bI:ue&tw\rI\027.A\035+G\017\t;iK\002\032WO\035:f]R\004C.\0312fY\002zg\r\t;iSN\004s/Y=q_&tGO\f\005\006q\002!\t!_\001\tg\026$H*\0312fYR\031qL_>\t\013\021<\b\031A3\t\0131<\b\031A7)\t]\fH/`\021\002}\006Qd-\0368di&|g\016\013<bYV,'h\035;sS:<\027\006I\027.AM+G\017\t;iK\002b\027MY3mA\031|'\017\t;iSN\004s/Y=q_&tGO\f\005\b\003\003\001A\021IA\002\0031)\b\017Z1uK\026sG/\033;z)\005\031\005bBA\004\001\021E\0231A\001\013S:LG/[1mSj,\007bBA\006\001\021\005\0231A\001\bI&\034\bo\\:f\021\035\ty\001\001C!\003#\tAC]3bI\032\023x.\034(C)\032{'oU3sm\026\024HcA\"\002\024!A\021QCA\007\001\004\t9\"A\002oER\004B!!\007\002\0365\021\0211\004\006\004\003+\t\022\002BA\020\0037\021aB\024\"U)\006<7i\\7q_VtG\rC\004\002$\001!\t%!\n\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\007\r\0139\003\003\005\002\026\005\005\002\031AA\f\021\035\tY\003\001C!\003[\tAC]3bI\032\023x.\034(C)\032{'o\0217jK:$HcA\"\0020!A\021QCA\025\001\004\t9\002\013\005\002*\005M\0221JA'!\021\t)$a\022\016\005\005]\"\002BA\035\003w\t!B]3mCVt7\r[3s\025\021\ti$a\020\002\007\031lGN\003\003\002B\005\r\023\001B7pINT!!!\022\002\007\r\004x/\003\003\002J\005]\"\001C*jI\026|e\016\\=\002\013Y\fG.^3%\005\005=\023\002BA)\003'\naa\021'J\013:#&\002BA+\003o\tAaU5eK\"9\021\021\f\001\005B\005m\023aE<sSR,Gk\034(C)\032{'o\0217jK:$HcA\"\002^!A\021QCA,\001\004\t9\002")
/*    */ public class Waypoint extends TileEntity implements Environment, Rotatable, RedstoneAware {
/*    */   private final Component node;
/*    */   private String label;
/*    */   private final int[] _input;
/*    */   private final int[] _output;
/*    */   private boolean _isOutputEnabled;
/*    */   private boolean shouldUpdateInput;
/*    */   
/* 16 */   public int[] _input() { return this._input; } private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private boolean isChangeScheduled; private boolean moving; public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled(this); } public void setOutputEnabled(boolean value) { RedstoneAware.class.setOutputEnabled(this, value); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy(this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt(this, value); } public int[] getInput() { return RedstoneAware.class.getInput(this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput(this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput(this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput(this, values); } public int maxInput() { return RedstoneAware.class.maxInput(this); } public int[] getOutput() { return RedstoneAware.class.getOutput(this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput(this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput(this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput(this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged(this); } public void func_145829_t() { RedstoneAware.class.validate(this); } public void updateRedstoneInput(ForgeDirection side) { RedstoneAware.class.updateRedstoneInput(this, side); } public void onRedstoneInputChanged(RedstoneChangedEventArgs args) { RedstoneAware.class.onRedstoneInputChanged(this, args); } public void onRedstoneOutputEnabledChanged() { RedstoneAware.class.onRedstoneOutputEnabledChanged(this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged(this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged(this); } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public void onRotationChanged() { Rotatable.class.onRotationChanged(this); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Waypoint() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this); RedstoneAware.class.$init$(this);
/* 17 */     this.node = (Component)Network.newNode((Environment)this, Visibility.Network)
/* 18 */       .withComponent("waypoint")
/* 19 */       .create();
/*    */     
/* 21 */     this.label = ""; } public Component node() { return this.node; } public String label() { return this.label; } public void label_$eq(String x$1) { this.label = x$1; }
/*    */    public ForgeDirection[] validFacings() {
/* 23 */     return ForgeDirection.VALID_DIRECTIONS;
/*    */   }
/*    */   
/*    */   @Callback(doc = "function(): string -- Get the current label of this waypoint.")
/*    */   public Object[] getLabel(Context context, Arguments args) {
/* 28 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { label() }));
/*    */   }
/*    */   @Callback(doc = "function(value:string) -- Set the label for this waypoint.")
/*    */   public Object[] setLabel(Context context, Arguments args) {
/* 32 */     label_$eq((String)(new StringOps(Predef$.MODULE$.augmentString(args.checkString(0)))).take(32));
/* 33 */     context.pause(0.5D);
/* 34 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_145845_h() {
/* 40 */     RedstoneAware.class.updateEntity(this);
/* 41 */     if (isClient()) {
/* 42 */       Vec3 origin = position().toVec3().func_72441_c((facing()).offsetX * 0.5D, (facing()).offsetY * 0.5D, (facing()).offsetZ * 0.5D);
/* 43 */       float dx = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.8F;
/* 44 */       float dy = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.8F;
/* 45 */       float dz = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.8F;
/* 46 */       float vx = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.2F + (facing()).offsetX * 0.3F;
/* 47 */       float vy = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.2F + (facing()).offsetY * 0.3F - 0.5F;
/* 48 */       float vz = ((world()).field_73012_v.nextFloat() - 0.5F) * 0.2F + (facing()).offsetZ * 0.3F;
/* 49 */       world().func_72869_a("portal", origin.field_72450_a + dx, origin.field_72448_b + dy, origin.field_72449_c + dz, vx, vy, vz);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void initialize() {
/* 54 */     Environment.class.initialize(this);
/* 55 */     EventHandler$.MODULE$.scheduleServer((Function0)new Waypoint$$anonfun$initialize$1(this)); } public final class Waypoint$$anonfun$initialize$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { Waypoints$.MODULE$.add(this.$outer); }
/*    */     
/*    */     public Waypoint$$anonfun$initialize$1(Waypoint $outer) {} }
/*    */   public void dispose() {
/* 59 */     Environment.class.dispose(this);
/* 60 */     Waypoints$.MODULE$.remove(this);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 66 */     RedstoneAware.class.readFromNBTForServer(this, nbt);
/* 67 */     label_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()));
/*    */   }
/*    */   
/*    */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 71 */     RedstoneAware.class.writeToNBTForServer(this, nbt);
/* 72 */     nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString(), label());
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 77 */     RedstoneAware.class.readFromNBTForClient(this, nbt);
/* 78 */     label_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()));
/*    */   }
/*    */   
/*    */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 82 */     RedstoneAware.class.writeToNBTForClient(this, nbt);
/* 83 */     nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString(), label());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Waypoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */