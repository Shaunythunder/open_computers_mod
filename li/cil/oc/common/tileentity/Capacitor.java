/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.traits.Environment;
/*    */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Predef$;
/*    */ import scala.Tuple3;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025b\001B\001\003\0015\021\021bQ1qC\016LGo\034:\013\005\r!\021A\003;jY\026,g\016^5us*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\003\001\035]i\002CA\b\026\033\005\001\"BA\002\022\025\t\0212#A\005nS:,7M]1gi*\tA#A\002oKRL!A\006\t\003\025QKG.Z#oi&$\030\020\005\002\03175\t\021D\003\002\033\005\0051AO]1jiNL!\001H\r\003\027\025sg/\033:p]6,g\016\036\t\003=\rj\021a\b\006\003A\005\na\001\032:jm\026\024(B\001\022\007\003\r\t\007/[\005\003I}\021!\002R3wS\016,\027J\0344p\021\0251\003\001\"\001(\003\031a\024N\\5u}Q\t\001\006\005\002*\0015\t!\001C\004,\001\t\007I\021\001\027\002\t9|G-Z\013\002[A\021a&M\007\002_)\021\001'I\001\b]\026$xo\034:l\023\t\021tFA\005D_:tWm\031;pe\"1A\007\001Q\001\n5\nQA\\8eK\002B\001B\016\001\t\006\004%iaN\001\013I\0264\030nY3J]\032|W#\001\035\021\te\002%IQ\007\002u)\0211\bP\001\nS6lW\017^1cY\026T!!\020 \002\025\r|G\016\\3di&|gNC\001@\003\025\0318-\0317b\023\t\t%HA\002NCB\004\"a\021%\016\003\021S!!\022$\002\t1\fgn\032\006\002\017\006!!.\031<b\023\tIEI\001\004TiJLgn\032\005\t\027\002A\t\021)Q\007q\005YA-\032<jG\026LeNZ8!\021\025i\005\001\"\021O\00359W\r\036#fm&\034W-\0238g_R\tq\n\005\003Q'R#V\"A)\013\005I3\025\001B;uS2L!!Q)\021\005UKfB\001,X\033\005q\024B\001-?\003\031\001&/\0323fM&\021\021J\027\006\0031zBQ\001\030\001\005Bu\013\021bY1o+B$\027\r^3\025\003y\003\"AV0\n\005\001t$a\002\"p_2,\027M\034\005\006E\002!\teY\001\bI&\034\bo\\:f)\005!\007C\001,f\023\t1gH\001\003V]&$\b\"\0025\001\t\003J\027!C8o\007>tg.Z2u)\t!'\016C\003,O\002\0071\016\005\002/Y&\021Qn\f\002\005\035>$W\rC\003p\001\021\005\001/A\tsK\016|W\016];uK\016\013\007/Y2jif$\"\001Z9\t\017It\007\023!a\001=\006QR\017\0353bi\026\034VmY8oI\036\023\030\rZ3OK&<\007NY8sg\")A\017\001C\005k\006\t\022N\0343je\026\034GOT3jO\"\024wN]:\026\003Y\0042AV<z\023\tAhHA\003BeJ\f\027\020E\003WurdH0\003\002|}\t1A+\0369mKN\002\"AV?\n\005yt$aA%oi\"9\021\021\001\001\005\022\005\r\021aC7bq\016\013\007/Y2jif,\"!!\002\021\007Y\0139!C\002\002\ny\022a\001R8vE2,\007\"CA\007\001E\005I\021AA\b\003m\021XmY8naV$XmQ1qC\016LG/\037\023eK\032\fW\017\034;%cU\021\021\021\003\026\004=\006M1FAA\013!\021\t9\"!\t\016\005\005e!\002BA\016\003;\t\021\"\0368dQ\026\0347.\0323\013\007\005}a(\001\006b]:|G/\031;j_:LA!a\t\002\032\t\tRO\\2iK\016\\W\r\032,be&\fgnY3")
/*    */ public class Capacitor extends TileEntity implements Environment, DeviceInfo {
/*    */   private final Connector node;
/*    */   private Map<String, String> deviceInfo;
/*    */   
/* 17 */   public boolean isChangeScheduled() { return this.isChangeScheduled; } private boolean isChangeScheduled; private boolean moving; private volatile boolean bitmap$0; public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void func_145845_h() { Environment.class.updateEntity(this); } public void readFromNBTForServer(NBTTagCompound nbt) { Environment.class.readFromNBTForServer(this, nbt); } public void writeToNBTForServer(NBTTagCompound nbt) { Environment.class.writeToNBTForServer(this, nbt); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145829_t() { TileEntity.class.validate((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { TileEntity.class.readFromNBTForClient((TileEntity)this, nbt); } public void writeToNBTForClient(NBTTagCompound nbt) { TileEntity.class.writeToNBTForClient((TileEntity)this, nbt); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Capacitor() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this);
/*    */ 
/*    */     
/* 20 */     this.node = (Connector)Network.newNode((Environment)this, Visibility.Network)
/* 21 */       .withConnector(maxCapacity())
/* 22 */       .create(); }
/*    */   public Connector node() { return this.node; }
/* 24 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 25 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/* 26 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Battery");
/* 27 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 28 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "CapBank3x");
/* 29 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToDouble(maxCapacity()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 32 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   public boolean canUpdate() {
/* 36 */     return false;
/*    */   }
/*    */   
/* 39 */   public void dispose() { Environment.class.dispose(this);
/* 40 */     if (isServer())
/* 41 */       Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])indirectNeighbors()).map((Function1)new Capacitor$$anonfun$dispose$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(TileEntity.class))))
/*    */ 
/*    */ 
/*    */         
/* 45 */         .collect((PartialFunction)new Capacitor$$anonfun$dispose$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));  } public final class Capacitor$$anonfun$dispose$2 extends AbstractFunction1<Tuple3<Object, Object, Object>, TileEntity> implements Serializable { public static final long serialVersionUID = 0L; public Capacitor$$anonfun$dispose$2(Capacitor $outer) {} public final TileEntity apply(Tuple3 coordinate) { Tuple3 tuple3 = coordinate; if (tuple3 != null) { int nx = BoxesRunTime.unboxToInt(tuple3._1()), ny = BoxesRunTime.unboxToInt(tuple3._2()), nz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(nx), BoxesRunTime.boxToInteger(ny), BoxesRunTime.boxToInteger(nz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3()); return this.$outer.world().func_72899_e(i, j, k) ? this.$outer.world().func_147438_o(i, j, k) : null; }  throw new MatchError(tuple3); } } public final class Capacitor$$anonfun$dispose$1 extends AbstractPartialFunction<TileEntity, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends TileEntity, B1> B1 applyOrElse(TileEntity x1, Function1 default) { Object object; TileEntity tileEntity = x1;
/* 46 */       if (tileEntity instanceof Capacitor) { Capacitor capacitor = (Capacitor)tileEntity; capacitor.recomputeCapacity(capacitor.recomputeCapacity$default$1()); object = BoxedUnit.UNIT; } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(TileEntity x1) { boolean bool; TileEntity tileEntity = x1; if (tileEntity instanceof Capacitor) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/*    */       
/*    */       return bool; }
/*    */      public Capacitor$$anonfun$dispose$1(Capacitor $outer) {} } public void onConnect(Node node) {
/* 52 */     Environment.class.onConnect(this, node);
/* 53 */     Connector connector = node(); if (node == null) { if (connector != null) return;  } else { if (node.equals(connector))
/* 54 */       { recomputeCapacity(true); return; }  return; }  recomputeCapacity(true);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean recomputeCapacity$default$1() {
/* 60 */     return false;
/* 61 */   } public void recomputeCapacity(boolean updateSecondGradeNeighbors) { node().setLocalBufferSize(
/* 62 */         Settings$.MODULE$.get().bufferCapacitor() + 
/* 63 */         Settings$.MODULE$.get().bufferCapacitorAdjacencyBonus() * Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).count((Function1)new Capacitor$$anonfun$recomputeCapacity$1(this)) + 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 70 */         Settings$.MODULE$.get().bufferCapacitorAdjacencyBonus() / 2 * Predef$.MODULE$.refArrayOps((Object[])indirectNeighbors()).count((Function1)new Capacitor$$anonfun$recomputeCapacity$2(this, updateSecondGradeNeighbors))); } public final class Capacitor$$anonfun$recomputeCapacity$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public Capacitor$$anonfun$recomputeCapacity$1(Capacitor $outer) {} public final boolean apply(ForgeDirection side) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(this.$outer.x() + side.offsetX), BoxesRunTime.boxToInteger(this.$outer.y() + side.offsetY), BoxesRunTime.boxToInteger(this.$outer.z() + side.offsetZ)); if (tuple3 != null) {
/*    */         int nx = BoxesRunTime.unboxToInt(tuple3._1()), ny = BoxesRunTime.unboxToInt(tuple3._2()), nz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(nx), BoxesRunTime.boxToInteger(ny), BoxesRunTime.boxToInteger(nz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3()); if (this.$outer.world().func_72899_e(i, j, k)) {
/*    */           boolean bool; TileEntity tileEntity = this.$outer.world().func_147438_o(i, j, k); if (tileEntity instanceof Capacitor) {
/*    */             bool = true;
/*    */           } else {
/*    */             bool = false;
/*    */           }  if (bool);
/*    */         }  return false;
/*    */       }  throw new MatchError(tuple3); } } public final class Capacitor$$anonfun$recomputeCapacity$2 extends AbstractFunction1<Tuple3<Object, Object, Object>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final boolean updateSecondGradeNeighbors$1; public final boolean apply(Tuple3 x0$1) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: astore_2
/*    */       //   2: aload_2
/*    */       //   3: ifnull -> 123
/*    */       //   6: aload_2
/*    */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*    */       //   10: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */       //   13: istore_3
/*    */       //   14: aload_2
/*    */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*    */       //   18: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */       //   21: istore #4
/*    */       //   23: aload_2
/*    */       //   24: invokevirtual _3 : ()Ljava/lang/Object;
/*    */       //   27: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */       //   30: istore #5
/*    */       //   32: aload_0
/*    */       //   33: getfield $outer : Lli/cil/oc/common/tileentity/Capacitor;
/*    */       //   36: invokevirtual world : ()Lnet/minecraft/world/World;
/*    */       //   39: iload_3
/*    */       //   40: iload #4
/*    */       //   42: iload #5
/*    */       //   44: invokevirtual func_72899_e : (III)Z
/*    */       //   47: ifeq -> 117
/*    */       //   50: aload_0
/*    */       //   51: getfield $outer : Lli/cil/oc/common/tileentity/Capacitor;
/*    */       //   54: invokevirtual world : ()Lnet/minecraft/world/World;
/*    */       //   57: iload_3
/*    */       //   58: iload #4
/*    */       //   60: iload #5
/*    */       //   62: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*    */       //   65: astore #7
/*    */       //   67: aload #7
/*    */       //   69: instanceof li/cil/oc/common/tileentity/Capacitor
/*    */       //   72: ifeq -> 105
/*    */       //   75: aload #7
/*    */       //   77: checkcast li/cil/oc/common/tileentity/Capacitor
/*    */       //   80: astore #8
/*    */       //   82: aload_0
/*    */       //   83: getfield updateSecondGradeNeighbors$1 : Z
/*    */       //   86: ifeq -> 99
/*    */       //   89: aload #8
/*    */       //   91: aload #8
/*    */       //   93: invokevirtual recomputeCapacity$default$1 : ()Z
/*    */       //   96: invokevirtual recomputeCapacity : (Z)V
/*    */       //   99: iconst_1
/*    */       //   100: istore #9
/*    */       //   102: goto -> 108
/*    */       //   105: iconst_0
/*    */       //   106: istore #9
/*    */       //   108: iload #9
/*    */       //   110: ifeq -> 117
/*    */       //   113: iconst_1
/*    */       //   114: goto -> 118
/*    */       //   117: iconst_0
/*    */       //   118: istore #6
/*    */       //   120: iload #6
/*    */       //   122: ireturn
/*    */       //   123: new scala/MatchError
/*    */       //   126: dup
/*    */       //   127: aload_2
/*    */       //   128: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   131: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #70	-> 0
/*    */       //   #71	-> 6
/*    */       //   #72	-> 67
/*    */       //   #73	-> 82
/*    */       //   #74	-> 89
/*    */       //   #76	-> 99
/*    */       //   #72	-> 100
/*    */       //   #77	-> 105
/*    */       //   #71	-> 108
/*    */       //   #70	-> 120
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	132	0	this	Lli/cil/oc/common/tileentity/Capacitor$$anonfun$recomputeCapacity$2;
/*    */       //   0	132	1	x0$1	Lscala/Tuple3;
/*    */       //   14	118	3	nx	I
/*    */       //   23	109	4	ny	I
/*    */       //   32	100	5	nz	I }
/*    */     public Capacitor$$anonfun$recomputeCapacity$2(Capacitor $outer, boolean updateSecondGradeNeighbors$1) {} }
/* 82 */   private Tuple3<Object, Object, Object>[] indirectNeighbors() { return (Tuple3<Object, Object, Object>[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Capacitor$$anonfun$indirectNeighbors$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple3.class))); } public final class Capacitor$$anonfun$indirectNeighbors$1 extends AbstractFunction1<ForgeDirection, Tuple3<Object, Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(ForgeDirection side) { return new Tuple3(BoxesRunTime.boxToInteger(this.$outer.x() + side.offsetX * 2), BoxesRunTime.boxToInteger(this.$outer.y() + side.offsetY * 2), BoxesRunTime.boxToInteger(this.$outer.z() + side.offsetZ * 2)); }
/*    */      public Capacitor$$anonfun$indirectNeighbors$1(Capacitor $outer) {} } public double maxCapacity() {
/* 84 */     return Settings$.MODULE$.get().bufferCapacitor() + Settings$.MODULE$.get().bufferCapacitorAdjacencyBonus() * 9;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Capacitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */