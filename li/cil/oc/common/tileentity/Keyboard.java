/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*    */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Uc\001B\001\003\0015\021\001bS3zE>\f'\017\032\006\003\007\021\t!\002^5mK\026tG/\033;z\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\002\001\017/u\0013e\013\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\tQA+\0337f\013:$\030\016^=\021\005aYR\"A\r\013\005i\021\021A\002;sC&$8/\003\002\0353\tYQI\034<je>tW.\0328u!\tAb$\003\002 3\tI!k\034;bi\006\024G.\032\t\0031\005J!AI\r\003#%kW.\0332jg6K7M]8cY>\0347\016\005\002%S5\tQE\003\002'O\0059a.\032;x_J\\'B\001\025\007\003\r\t\007/[\005\003U\025\022\001cU5eK\022,eN^5s_:lWM\034;\021\005\021b\023BA\027&\005)\te.\0317zu\006\024G.\032\005\006_\001!\t\001M\001\007y%t\027\016\036 \025\003E\002\"A\r\001\016\003\tAQ\001\016\001\005BU\nAB^1mS\0224\025mY5oON,\022A\016\t\004oibT\"\001\035\013\003e\nQa]2bY\006L!a\017\035\003\013\005\023(/Y=\021\005u\032U\"\001 \013\005}\002\025\001B;uS2T!!B!\013\005\t\033\022AD7j]\026\034'/\0314uM>\024x-Z\005\003\tz\022aBR8sO\026$\025N]3di&|g\016C\004G\001\t\007I\021A$\002\021-,\027PY8be\022,\022\001\023\t\003I%K!AS\023\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\007\031\002\001\013\021\002%\002\023-,\027PY8be\022\004\003\"\002(\001\t\003z\025\001\0028pI\026$\022\001\025\t\003IEK!AU\023\003\t9{G-\032\005\006)\002!\t!V\001\016Q\006\034hj\0343f\037:\034\026\016Z3\025\005YK\006CA\034X\023\tA\006HA\004C_>dW-\0318\t\013i\033\006\031\001\037\002\tMLG-\032\005\0069\002!\t%X\001\013G\006t7i\0348oK\016$HC\001,_\021\025Q6\f1\001=Q\021Y\006\r\\7\021\005\005TW\"\0012\013\005\r$\027A\003:fY\006,hn\0315fe*\021QMZ\001\004M6d'BA4i\003\021iw\016Z:\013\003%\f1a\0319x\023\tY'M\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005q\027BA8q\003\031\031E*S#O)*\021\021OY\001\005'&$W\rC\003t\001\021\005C/A\005tS\022,GMT8eKR\021\001+\036\005\0065J\004\r\001\020\005\006o\002!\t\005_\001\n_:\fe.\0317zu\026$\"\"\037>\002\b\005=\021\021DA\017!\r9$\b\025\005\006wZ\004\r\001`\001\007a2\f\0270\032:\021\007u\f\031!D\001\025\tYxPC\002\002\002E\ta!\0328uSRL\030bAA\003}\naQI\034;jif\004F.Y=fe\"1!L\036a\001\003\023\0012aNA\006\023\r\ti\001\017\002\004\023:$\bbBA\tm\002\007\0211C\001\005Q&$\b\fE\0028\003+I1!a\0069\005\0251En\\1u\021\035\tYB\036a\001\003'\tA\001[5u3\"9\021q\004<A\002\005M\021\001\0025jijCq!a\t\001\t\003\n)#A\005dC:,\006\017Z1uKR\ta\013C\004\002*\001!\t%a\013\002)I,\027\r\032$s_6t%\t\026$peN+'O^3s)\021\ti#a\r\021\007]\ny#C\002\0022a\022A!\0268ji\"A\021QGA\024\001\004\t9$A\002oER\004B!!\017\002>5\021\0211\b\006\004\003k\t\022\002BA \003w\021aB\024\"U)\006<7i\\7q_VtG\rC\004\002D\001!\t%!\022\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\t\0055\022q\t\005\t\003k\t\t\0051\001\0028!9\0211\n\001\005\n\0055\023\001C5t\037:<\026\r\0347\026\003YCq!!\025\001\t\023\t\031&A\004g_J<\030M\0353\026\003q\002")
/*    */ public class Keyboard extends TileEntity implements Environment, Rotatable, ImmibisMicroblock, SidedEnvironment, Analyzable {
/*    */   private final ManagedEnvironment keyboard;
/*    */   private final Null$ ImmibisMicroblocks_TransformableTileEntityMarker;
/*    */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*    */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction;
/*    */   
/* 15 */   public Null$ ImmibisMicroblocks_TransformableTileEntityMarker() { return null; } private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private boolean isChangeScheduled; private boolean moving; public void li$cil$oc$common$tileentity$traits$ImmibisMicroblock$_setter_$ImmibisMicroblocks_TransformableTileEntityMarker_$eq(Null$ x$1) { this.ImmibisMicroblocks_TransformableTileEntityMarker = x$1; } public boolean ImmibisMicroblocks_isSideOpen(int side) { return ImmibisMicroblock.class.ImmibisMicroblocks_isSideOpen(this, side); } public void ImmibisMicroblocks_onMicroblocksChanged() { ImmibisMicroblock.class.ImmibisMicroblocks_onMicroblocksChanged(this); } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public void onRotationChanged() { Rotatable.class.onRotationChanged(this); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { Rotatable.class.readFromNBTForClient(this, nbt); } public void writeToNBTForClient(NBTTagCompound nbt) { Rotatable.class.writeToNBTForClient(this, nbt); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void func_145845_h() { Environment.class.updateEntity(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Keyboard() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this); ImmibisMicroblock.class.$init$(this);
/*    */ 
/*    */ 
/*    */     
/* 19 */     ItemStack keyboardItem = Items.get("keyboard").createItemStack(1);
/* 20 */     this.keyboard = Driver.driverFor(keyboardItem, getClass()).createEnvironment(keyboardItem, (EnvironmentHost)this); } public ForgeDirection[] validFacings() { return ForgeDirection.VALID_DIRECTIONS; }
/*    */   public ManagedEnvironment keyboard() { return this.keyboard; }
/*    */   public Node node() {
/* 23 */     return keyboard().node();
/*    */   }
/*    */   public boolean hasNodeOnSide(ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aload_0
/*    */     //   2: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   5: astore_2
/*    */     //   6: dup
/*    */     //   7: ifnonnull -> 18
/*    */     //   10: pop
/*    */     //   11: aload_2
/*    */     //   12: ifnull -> 60
/*    */     //   15: goto -> 25
/*    */     //   18: aload_2
/*    */     //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   22: ifne -> 60
/*    */     //   25: aload_0
/*    */     //   26: invokespecial isOnWall : ()Z
/*    */     //   29: ifne -> 64
/*    */     //   32: aload_1
/*    */     //   33: aload_0
/*    */     //   34: invokespecial forward : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   37: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   40: astore_3
/*    */     //   41: dup
/*    */     //   42: ifnonnull -> 53
/*    */     //   45: pop
/*    */     //   46: aload_3
/*    */     //   47: ifnull -> 60
/*    */     //   50: goto -> 64
/*    */     //   53: aload_3
/*    */     //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   57: ifeq -> 64
/*    */     //   60: iconst_0
/*    */     //   61: goto -> 65
/*    */     //   64: iconst_1
/*    */     //   65: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	66	0	this	Lli/cil/oc/common/tileentity/Keyboard;
/*    */     //   0	66	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public boolean canConnect(ForgeDirection side) {
/* 31 */     return hasNodeOnSide(side);
/*    */   } public Node sidedNode(ForgeDirection side) {
/* 33 */     return hasNodeOnSide(side) ? node() : null;
/*    */   }
/*    */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 36 */     (new Node[1])[0] = node(); return new Node[1];
/*    */   }
/*    */   
/*    */   public boolean canUpdate() {
/* 40 */     return false;
/*    */   }
/*    */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 43 */     Rotatable.class.readFromNBTForServer(this, nbt);
/* 44 */     if (isServer()) {
/* 45 */       keyboard().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keyboard").toString()));
/*    */     }
/*    */   }
/*    */   
/*    */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 50 */     Rotatable.class.writeToNBTForServer(this, nbt);
/* 51 */     if (isServer())
/* 52 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keyboard").toString(), (Function1)new Keyboard$$anonfun$writeToNBTForServer$1(this));  } public final class Keyboard$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) { this.$outer.keyboard().save(x$1); }
/*    */     
/*    */     public Keyboard$$anonfun$writeToNBTForServer$1(Keyboard $outer) {} }
/*    */   private boolean isOnWall() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   4: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   7: astore_1
/*    */     //   8: dup
/*    */     //   9: ifnonnull -> 20
/*    */     //   12: pop
/*    */     //   13: aload_1
/*    */     //   14: ifnull -> 54
/*    */     //   17: goto -> 27
/*    */     //   20: aload_1
/*    */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   24: ifne -> 54
/*    */     //   27: aload_0
/*    */     //   28: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   31: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   34: astore_2
/*    */     //   35: dup
/*    */     //   36: ifnonnull -> 47
/*    */     //   39: pop
/*    */     //   40: aload_2
/*    */     //   41: ifnull -> 54
/*    */     //   44: goto -> 58
/*    */     //   47: aload_2
/*    */     //   48: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   51: ifeq -> 58
/*    */     //   54: iconst_0
/*    */     //   55: goto -> 59
/*    */     //   58: iconst_1
/*    */     //   59: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	60	0	this	Lli/cil/oc/common/tileentity/Keyboard;
/*    */   }
/*    */   
/*    */   private ForgeDirection forward() {
/* 60 */     return isOnWall() ? ForgeDirection.UP : yaw();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */