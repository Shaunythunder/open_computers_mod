/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005]c\001B\001\003\0015\021Q\001\025:j]RT!a\001\003\002\025QLG.Z3oi&$\030P\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\025\001ab\006\017 !\tyQ#D\001\021\025\t\031\021C\003\002\023'\005IQ.\0338fGJ\fg\r\036\006\002)\005\031a.\032;\n\005Y\001\"A\003+jY\026,e\016^5usB\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005YI\002C\001\r\036\023\tq\022DA\007SK\022\034Ho\0348f\003^\f'/\032\t\0031\001J!!I\r\003\023I{G/\031;bE2,\007\"B\022\001\t\003!\023A\002\037j]&$h\bF\001&!\t1\003!D\001\003\021\035A\003A1A\005\002%\nA\001Z1uCV\t!\006\005\002,_5\tAF\003\002)[)\021a\006B\001\005SR,W.\003\0021Y\tI\001K]5oi\022\013G/\031\005\007e\001\001\013\021\002\026\002\013\021\fG/\031\021\t\017Q\002\001\031!C\001k\005I!m\\;oIN|eMZ\013\002mA\021qGO\007\002q)\021\021(E\001\005kRLG.\003\002<q\ti\021\t_5t\0032LwM\\3e\005\nCq!\020\001A\002\023\005a(A\007c_VtGm](gM~#S-\035\013\003\025\003\"\001Q\"\016\003\005S\021AQ\001\006g\016\fG.Y\005\003\t\006\023A!\0268ji\"9a\tPA\001\002\0041\024a\001=%c!1\001\n\001Q!\nY\n!BY8v]\022\034xJ\0324!\021\035Q\005\0011A\005\002U\n\001BY8v]\022\034xJ\034\005\b\031\002\001\r\021\"\001N\0031\021w.\0368eg>sw\fJ3r)\tyd\nC\004G\027\006\005\t\031\001\034\t\rA\003\001\025)\0037\003%\021w.\0368eg>s\007\005C\004S\001\001\007I\021A*\002\013M$\030\r^3\026\003Q\003\"\001Q+\n\005Y\013%a\002\"p_2,\027M\034\005\b1\002\001\r\021\"\001Z\003%\031H/\031;f?\022*\027\017\006\002@5\"9aiVA\001\002\004!\006B\002/\001A\003&A+\001\004ti\006$X\r\t\005\006=\002!\taX\001\tC\016$\030N^1uKR\tA\013C\003b\001\021%!-A\007ck&dGMV1mk\026\034V\r\036\013\003G6\004B\001\0325kU6\tQM\003\002:M*\tq-\001\003kCZ\f\027BA5f\005\ri\025\r\035\t\003\001.L!\001\\!\003\r\005s\027PU3g\021\025q\007\r1\001p\003\0251\030\r\\;f!\t\001\005/\003\002r\003\n\031\021J\034;\t\013M\004A\021\001;\002\027Q|wm\0327f'R\fG/\032\013\002!)a\017\001C!?\006I1-\0318Va\022\fG/\032\005\006q\002!\t&_\001\027_:\024V\rZ:u_:,\027J\0349vi\016C\027M\\4fIR\021qH\037\005\006w^\004\r\001`\001\005CJ<7\017\005\002\031{&\021a0\007\002\031%\026$7\017^8oK\016C\027M\\4fI\0263XM\034;Be\036\034\bbBA\001\001\021\005\0231A\001\025e\026\fGM\022:p[:\023EKR8s'\026\024h/\032:\025\007}\n)\001C\004\002\b}\004\r!!\003\002\0079\024G\017\005\003\002\f\005=QBAA\007\025\r\t9!E\005\005\003#\tiA\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\005U\001\001\"\021\002\030\005\031rO]5uKR{gJ\021+G_J\034VM\035<feR\031q(!\007\t\021\005\035\0211\003a\001\003\023Aq!!\b\001\t\003\ny\"\001\013sK\006$gI]8n\035\n#fi\034:DY&,g\016\036\013\004\005\005\002\002CA\004\0037\001\r!!\003)\017\005m\021Q\0058\002>A!\021qEA\035\033\t\tIC\003\003\002,\0055\022A\003:fY\006,hn\0315fe*!\021qFA\031\003\r1W\016\034\006\005\003g\t)$\001\003n_\022\034(BAA\034\003\r\031\007o^\005\005\003w\tIC\001\005TS\022,wJ\0347zI\t\ty$\003\003\002B\005\r\023AB\"M\023\026sEK\003\003\002F\005%\022\001B*jI\026Dq!!\023\001\t\003\nY%A\nxe&$X\rV8O\005R3uN]\"mS\026tG\017F\002@\003\033B\001\"a\002\002H\001\007\021\021\002\005\007\003#\002A\021\001;\002\031U\004H-\031;f\005>,h\016Z:\t\r\005U\003\001\"\025u\003EygNU8uCRLwN\\\"iC:<W\r\032")
/*     */ public class Print extends TileEntity implements RedstoneAware, Rotatable {
/*     */   private final PrintData data;
/*     */   private AxisAlignedBB boundsOff;
/*     */   private AxisAlignedBB boundsOn;
/*     */   private boolean state;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction;
/*     */   
/*  16 */   public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private final int[] _input; private final int[] _output; private boolean _isOutputEnabled; private boolean shouldUpdateInput; public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public ForgeDirection[] validFacings() { return Rotatable.class.validFacings(this); } public int[] _input() { return this._input; } public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled(this); } public void setOutputEnabled(boolean value) { RedstoneAware.class.setOutputEnabled(this, value); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy(this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt(this, value); } public int[] getInput() { return RedstoneAware.class.getInput(this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput(this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput(this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput(this, values); } public int maxInput() { return RedstoneAware.class.maxInput(this); } public int[] getOutput() { return RedstoneAware.class.getOutput(this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput(this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput(this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput(this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged(this); } public void func_145845_h() { RedstoneAware.class.updateEntity(this); } public void func_145829_t() { RedstoneAware.class.validate(this); } public void updateRedstoneInput(ForgeDirection side) { RedstoneAware.class.updateRedstoneInput(this, side); } public void onRedstoneOutputEnabledChanged() { RedstoneAware.class.onRedstoneOutputEnabledChanged(this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged(this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged(this); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void initialize() { TileEntity.class.initialize((TileEntity)this); } public void dispose() { TileEntity.class.dispose((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Print() { TileEntity.class.$init$((TileEntity)this); RotationAware.class.$init$((RotationAware)this); RedstoneAware.class.$init$(this); Rotatable.class.$init$(this);
/*  17 */     this.data = new PrintData();
/*     */     
/*  19 */     this.boundsOff = ExtendedAABB$.MODULE$.unitBounds();
/*  20 */     this.boundsOn = ExtendedAABB$.MODULE$.unitBounds();
/*  21 */     this.state = false;
/*     */     
/*  23 */     _isOutputEnabled_$eq(true); } public PrintData data() { return this.data; } public AxisAlignedBB boundsOff() { return this.boundsOff; } public void boundsOff_$eq(AxisAlignedBB x$1) { this.boundsOff = x$1; } public AxisAlignedBB boundsOn() { return this.boundsOn; } public void boundsOn_$eq(AxisAlignedBB x$1) { this.boundsOn = x$1; }
/*     */   public boolean state() { return this.state; }
/*     */   public void state_$eq(boolean x$1) { this.state = x$1; }
/*  26 */   public boolean activate() { if (data().hasActiveState() && (
/*  27 */       !state() || !data().isButtonMode())) {
/*  28 */       toggleState();
/*  29 */       return true;
/*     */     } 
/*     */     
/*  32 */     return false; }
/*     */ 
/*     */   
/*     */   private Map<Object, Object> buildValueSet(int value) {
/*  36 */     Map<Object, Object> map = new HashMap<>(); RichInt$.MODULE$
/*  37 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 6).foreach(
/*  38 */         (Function1)new Print$$anonfun$buildValueSet$1(this, value, map));
/*     */     
/*  40 */     return map;
/*     */   } public final class Print$$anonfun$buildValueSet$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int value$1; private final Map map$1; public final Object apply(int side) {
/*     */       return this.map$1.put(new Integer(side), new Integer(this.value$1));
/*     */     } public Print$$anonfun$buildValueSet$1(Print $outer, int value$1, Map map$1) {} } public void toggleState() {
/*  44 */     state_$eq(!state());
/*  45 */     world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "random.click", 0.3F, state() ? 0.6F : 0.5F);
/*  46 */     world().func_147471_g(x(), y(), z());
/*  47 */     data().emitRedstoneWhenOn() ? 
/*  48 */       BoxesRunTime.boxToBoolean(setOutput(buildValueSet(state() ? data().redstoneLevel() : 0))) : BoxedUnit.UNIT;
/*     */     
/*  50 */     if (state() && data().isButtonMode())
/*  51 */       world().func_147464_a(x(), y(), z(), block(), block().func_149738_a(world())); 
/*     */   }
/*     */   
/*     */   public boolean canUpdate() {
/*  55 */     return false;
/*     */   }
/*     */   public void onRedstoneInputChanged(RedstoneChangedEventArgs args) {
/*  58 */     RedstoneAware.class.onRedstoneInputChanged(this, args);
/*  59 */     if (!data().emitRedstone() && data().hasActiveState()) {
/*  60 */       state_$eq((args.newValue() > 0));
/*  61 */       world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "random.click", 0.3F, state() ? 0.6F : 0.5F);
/*  62 */       world().func_147471_g(x(), y(), z());
/*  63 */       if (state() && data().isButtonMode()) {
/*  64 */         world().func_147464_a(x(), y(), z(), block(), block().func_149738_a(world()));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt) {
/*  70 */     Rotatable.class.readFromNBTForServer(this, nbt);
/*  71 */     data().load(nbt.func_74775_l("data"));
/*  72 */     state_$eq(nbt.func_74767_n("state"));
/*  73 */     updateBounds();
/*     */   }
/*     */   
/*     */   public void writeToNBTForServer(NBTTagCompound nbt) {
/*  77 */     Rotatable.class.writeToNBTForServer(this, nbt);
/*  78 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("data", (Function1)new Print$$anonfun$writeToNBTForServer$1(this));
/*  79 */     nbt.func_74757_a("state", state());
/*     */   } public final class Print$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.data().save(nbt);
/*     */     } public Print$$anonfun$writeToNBTForServer$1(Print $outer) {} } @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/*  84 */     Rotatable.class.readFromNBTForClient(this, nbt);
/*  85 */     data().load(nbt.func_74775_l("data"));
/*  86 */     state_$eq(nbt.func_74767_n("state"));
/*  87 */     updateBounds();
/*  88 */     world().func_147471_g(x(), y(), z());
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/*  92 */     Rotatable.class.writeToNBTForClient(this, nbt);
/*  93 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("data", (Function1)new Print$$anonfun$writeToNBTForClient$1(this));
/*  94 */     nbt.func_74757_a("state", state());
/*     */   } public final class Print$$anonfun$writeToNBTForClient$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound nbt) {
/*     */       this.$outer.data().save(nbt);
/*  98 */     } public Print$$anonfun$writeToNBTForClient$1(Print $outer) {} } public void updateBounds() { boundsOff_$eq((AxisAlignedBB)((TraversableOnce)data().stateOff().drop(1)).foldLeft(data().stateOff().headOption().fold((Function0)new Print$$anonfun$updateBounds$1(this), (Function1)new Print$$anonfun$updateBounds$2(this)), (Function2)new Print$$anonfun$updateBounds$3(this)));
/*  99 */     if (ExtendedAABB$.MODULE$.extendedAABB(boundsOff()).volume() == 0) { boundsOff_$eq(ExtendedAABB$.MODULE$.unitBounds()); }
/* 100 */     else { boundsOff_$eq(ExtendedAABB$.MODULE$.extendedAABB(boundsOff()).rotateTowards(facing())); }
/* 101 */      boundsOn_$eq((AxisAlignedBB)((TraversableOnce)data().stateOn().drop(1)).foldLeft(data().stateOn().headOption().fold((Function0)new Print$$anonfun$updateBounds$4(this), (Function1)new Print$$anonfun$updateBounds$5(this)), (Function2)new Print$$anonfun$updateBounds$6(this)));
/* 102 */     if (ExtendedAABB$.MODULE$.extendedAABB(boundsOn()).volume() == 0) { boundsOn_$eq(ExtendedAABB$.MODULE$.unitBounds()); }
/* 103 */     else { boundsOn_$eq(ExtendedAABB$.MODULE$.extendedAABB(boundsOn()).rotateTowards(facing())); }
/*     */     
/* 105 */     if (data().emitRedstoneWhenOff())
/* 106 */       setOutput(buildValueSet(data().redstoneLevel()));  } public final class Print$$anonfun$updateBounds$1 extends AbstractFunction0<AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply() { return ExtendedAABB$.MODULE$.unitBounds(); } public Print$$anonfun$updateBounds$1(Print $outer) {} } public final class Print$$anonfun$updateBounds$2 extends AbstractFunction1<PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(PrintData.Shape x$1) { return x$1.bounds(); } public Print$$anonfun$updateBounds$2(Print $outer) {} } public final class Print$$anonfun$updateBounds$3 extends AbstractFunction2<AxisAlignedBB, PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(AxisAlignedBB a, PrintData.Shape b) { return a.func_111270_a(b.bounds()); }
/*     */     public Print$$anonfun$updateBounds$3(Print $outer) {} }
/* 111 */   public void onRotationChanged() { Rotatable.class.onRotationChanged(this);
/* 112 */     updateBounds(); }
/*     */ 
/*     */   
/*     */   public final class Print$$anonfun$updateBounds$4 extends AbstractFunction0<AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final AxisAlignedBB apply() {
/*     */       return ExtendedAABB$.MODULE$.unitBounds();
/*     */     }
/*     */     
/*     */     public Print$$anonfun$updateBounds$4(Print $outer) {}
/*     */   }
/*     */   
/*     */   public final class Print$$anonfun$updateBounds$5 extends AbstractFunction1<PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final AxisAlignedBB apply(PrintData.Shape x$2) {
/*     */       return x$2.bounds();
/*     */     }
/*     */     
/*     */     public Print$$anonfun$updateBounds$5(Print $outer) {}
/*     */   }
/*     */   
/*     */   public final class Print$$anonfun$updateBounds$6 extends AbstractFunction2<AxisAlignedBB, PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final AxisAlignedBB apply(AxisAlignedBB a, PrintData.Shape b) {
/*     */       return a.func_111270_a(b.bounds());
/*     */     }
/*     */     
/*     */     public Print$$anonfun$updateBounds$6(Print $outer) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Print.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */