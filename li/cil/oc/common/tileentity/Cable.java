/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0054A!\001\002\001\033\t)1)\0312mK*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\r\001qq#\b\021$!\tyQ#D\001\021\025\t\031\021C\003\002\023'\005IQ.\0338fGJ\fg\r\036\006\002)\005\031a.\032;\n\005Y\001\"A\003+jY\026,e\016^5usB\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005qI\"aC#om&\024xN\\7f]R\004\"\001\007\020\n\005}I\"!\004(pi\006s\027\r\\={C\ndW\r\005\002\031C%\021!%\007\002\022\0236l\027NY5t\033&\034'o\0342m_\016\\\007C\001\r%\023\t)\023DA\004D_2|'/\0323\t\013\035\002A\021\001\025\002\rqJg.\033;?)\005I\003C\001\026\001\033\005\021\001b\002\027\001\005\004%\t!L\001\005]>$W-F\001/!\tyC'D\0011\025\t\t$'A\004oKR<xN]6\013\005M2\021aA1qS&\021Q\007\r\002\005\035>$W\r\003\0048\001\001\006IAL\001\006]>$W\r\t\005\006s\001!\tAO\001\020GJ,\027\r^3Ji\026l7\013^1dWR\t1\b\005\002=5\tQH\003\002?#\005!\021\016^3n\023\t\001UHA\005Ji\026l7\013^1dW\")!\t\001C\001\007\006iaM]8n\023R,Wn\025;bG.$\"\001\022&\021\005\025CU\"\001$\013\003\035\013Qa]2bY\006L!!\023$\003\tUs\027\016\036\005\006\027\006\003\raO\001\006gR\f7m\033\005\006\033\002!\tET\001\fG>t7/^7fg\022KX-F\001P!\t)\005+\003\002R\r\n9!i\\8mK\006t\007\"B*\001\t#\"\026AD8o\007>dwN]\"iC:<W\r\032\013\002\t\")a\013\001C!/\006I1-\0318Va\022\fG/\032\013\002\037\")\021\f\001C!5\006!r-\032;SK:$WM\035\"pk:$\027N\\4C_b$\022a\027\t\0039~k\021!\030\006\003=F\tA!\036;jY&\021\001-\030\002\016\003bL7/\0217jO:,GM\021\"")
/*    */ public class Cable extends TileEntity implements Environment, NotAnalyzable, ImmibisMicroblock, Colored {
/*    */   private final Node node;
/*    */   private int li$cil$oc$common$tileentity$traits$Colored$$_color;
/*    */   
/* 11 */   public int li$cil$oc$common$tileentity$traits$Colored$$_color() { return this.li$cil$oc$common$tileentity$traits$Colored$$_color; } private final Null$ ImmibisMicroblocks_TransformableTileEntityMarker; private boolean isChangeScheduled; private boolean moving; public void li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$Colored$$_color = x$1; } public int color() { return Colored.class.color(this); } public void color_$eq(int value) { Colored.class.color_$eq(this, value); } public int getColor() { return Colored.class.getColor(this); } public void setColor(int value) { Colored.class.setColor(this, value); } public void readFromNBTForServer(NBTTagCompound nbt) { Colored.class.readFromNBTForServer(this, nbt); } public void writeToNBTForServer(NBTTagCompound nbt) { Colored.class.writeToNBTForServer(this, nbt); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { Colored.class.readFromNBTForClient(this, nbt); } public void writeToNBTForClient(NBTTagCompound nbt) { Colored.class.writeToNBTForClient(this, nbt); } public Null$ ImmibisMicroblocks_TransformableTileEntityMarker() { return null; } public void li$cil$oc$common$tileentity$traits$ImmibisMicroblock$_setter_$ImmibisMicroblocks_TransformableTileEntityMarker_$eq(Null$ x$1) { this.ImmibisMicroblocks_TransformableTileEntityMarker = x$1; } public boolean ImmibisMicroblocks_isSideOpen(int side) { return ImmibisMicroblock.class.ImmibisMicroblocks_isSideOpen(this, side); } public void ImmibisMicroblocks_onMicroblocksChanged() { ImmibisMicroblock.class.ImmibisMicroblocks_onMicroblocksChanged(this); } public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) { return NotAnalyzable.class.onAnalyze(this, player, side, hitX, hitY, hitZ); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void func_145845_h() { Environment.class.updateEntity(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Cable() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); NotAnalyzable.class.$init$(this); ImmibisMicroblock.class.$init$(this); Colored.class.$init$(this);
/* 12 */     this.node = Network.newNode((Environment)this, Visibility.None).create();
/*    */     
/* 14 */     color_$eq(Color$.MODULE$.LightGray()); } public Node node() {
/*    */     return this.node;
/*    */   } public ItemStack createItemStack() {
/* 17 */     ItemStack stack = new ItemStack(Item.func_150898_a(func_145838_q()));
/* 18 */     if (color() != Color$.MODULE$.LightGray()) {
/* 19 */       ItemColorizer$.MODULE$.setColor(stack, color());
/*    */     }
/* 21 */     return stack;
/*    */   }
/*    */   
/*    */   public void fromItemStack(ItemStack stack) {
/* 25 */     if (ItemColorizer$.MODULE$.hasColor(stack))
/* 26 */       color_$eq(ItemColorizer$.MODULE$.getColor(stack)); 
/*    */   }
/*    */   
/*    */   public boolean consumesDye() {
/* 30 */     return true;
/*    */   }
/*    */   public void onColorChanged() {
/* 33 */     Colored.class.onColorChanged(this);
/* 34 */     if (world() != null && isServer())
/* 35 */       Network.joinOrCreateNetwork(this); 
/*    */   }
/*    */   
/*    */   public boolean canUpdate() {
/* 39 */     return false;
/*    */   } public AxisAlignedBB getRenderBoundingBox() {
/* 41 */     return Cable$.MODULE$.bounds((IBlockAccess)world(), x(), y(), z()).func_72317_d(x(), y(), z());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Cable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */