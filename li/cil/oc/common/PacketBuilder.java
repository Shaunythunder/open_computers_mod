/*     */ package li.cil.oc.common;
/*     */ import li.cil.oc.OpenComputers$;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.server.management.ServerConfigurationManager;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Enumeration;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035b!B\001\003\003\003Y!!\004)bG.,GOQ;jY\022,'O\003\002\004\t\00511m\\7n_:T!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001'\t\001A\002\005\002\016%5\taB\003\002\020!\005\021\021n\034\006\002#\005!!.\031<b\023\t\031bB\001\tECR\fw*\036;qkR\034FO]3b[\"AQ\003\001B\001B\003%a#\001\004tiJ,\027-\034\t\003\033]I!\001\007\b\003\031=+H\017];u'R\024X-Y7\t\013i\001A\021A\016\002\rqJg.\033;?)\tab\004\005\002\036\0015\t!\001C\003\0263\001\007a\003C\003!\001\021\005\021%A\bxe&$X\rV5mK\026sG/\033;z)\t\021\003\006\005\002$M5\tAEC\001&\003\025\0318-\0317b\023\t9CE\001\003V]&$\b\"B\025 \001\004Q\023!\001;\021\005-\022T\"\001\027\013\0055r\023A\003;jY\026,g\016^5us*\021q\006M\001\n[&tWm\031:bMRT\021!M\001\004]\026$\030BA\032-\005)!\026\016\\3F]RLG/\037\005\006k\001!\tAN\001\foJLG/Z#oi&$\030\020\006\002#o!)\001\b\016a\001s\005\tQ\r\005\002;{5\t1H\003\002=]\0051QM\034;jifL!AP\036\003\r\025sG/\033;z\021\025\001\005\001\"\001B\00399(/\033;f\t&\024Xm\031;j_:$\"A\t\"\t\013\r{\004\031\001#\002\003\021\0042aI#H\023\t1EE\001\004PaRLwN\034\t\003\021:k\021!\023\006\003\025.\013A!\036;jY*\0211\001\024\006\003\033B\na\"\\5oK\016\024\030M\032;g_J<W-\003\002P\023\nqai\034:hK\022K'/Z2uS>t\007\"B)\001\t\003\021\026AD<sSR,\027\n^3n'R\f7m\033\013\003EMCQ\001\026)A\002U\013Qa\035;bG.\004\"AV-\016\003]S!\001\027\030\002\t%$X-\\\005\0035^\023\021\"\023;f[N#\030mY6\t\013q\003A\021A/\002\021]\024\030\016^3O\005R#\"A\t0\t\013}[\006\031\0011\002\0079\024G\017\005\002bG6\t!M\003\002`]%\021AM\031\002\017\035\n#F+Y4D_6\004x.\0368e\021\0251\007\001\"\001h\003-9(/\033;f\033\026$\027.^7\025\005\tB\007\"B5f\001\004Q\027!\001<\021\005\rZ\027B\0017%\005\rIe\016\036\005\006]\002!\ta\\\001\020oJLG/\032)bG.,G\017V=qKR\021!\005\035\005\006c6\004\rA]\001\003aR\004\"a\035<\017\005u!\030BA;\003\003)\001\026mY6fiRK\b/Z\005\003ob\024QAV1mk\026L!!\037\023\003\027\025sW/\\3sCRLwN\034\005\006w\002!\t\001`\001\021g\026tG\rV8BY2\004F.Y=feN$\022A\t\005\006}\002!\ta`\001\030g\026tG\rV8QY\006LXM]:OK\006\024XI\034;jif$RAIA\001\003\007AQ\001O?A\002eB\021\"!\002~!\003\005\r!a\002\002\013I\fgnZ3\021\t\r*\025\021\002\t\004G\005-\021bAA\007I\t1Ai\\;cY\026Dq!!\005\001\t\003\t\031\"A\013tK:$Gk\034)mCf,'o\035(fCJDun\035;\025\013\t\n)\"!\013\t\021\005]\021q\002a\001\0033\tA\001[8tiB!\0211DA\023\033\t\tiB\003\003\002 \005\005\022a\0028fi^|'o\033\006\004\003G!\021aA1qS&!\021qEA\017\005=)eN^5s_:lWM\034;I_N$\bBCA\003\003\037\001\n\0211\001\002\b!9\021Q\006\001\005\002\005=\022aG:f]\022$v\016\0257bs\026\0248OT3beRKG.Z#oi&$\030\020F\003#\003c\t\031\004\003\004*\003W\001\rA\013\005\013\003\013\tY\003%AA\002\005\035\001bBA\034\001\021\005\021\021H\001\024g\026tG\rV8OK\006\024(-\037)mCf,'o\035\013\fE\005m\022\021JA'\003#\n)\006\003\005\002>\005U\002\031AA \003\0259xN\0357e!\021\t\t%!\022\016\005\005\r#bAA\037]%!\021qIA\"\005\0259vN\0357e\021!\tY%!\016A\002\005%\021!\001=\t\021\005=\023Q\007a\001\003\023\t\021!\037\005\t\003'\n)\0041\001\002\n\005\t!\020\003\005\002\006\005U\002\031AA\004\021\035\tI\006\001C\001\0037\nAb]3oIR{\007\013\\1zKJ$2AIA/\021!\ty&a\026A\002\005\005\024A\0029mCf,'\017\005\003\002d\005\035TBAA3\025\r\tyfO\005\005\003S\n)G\001\bF]RLG/\037)mCf,'/\024)\t\r\0055\004\001\"\001}\0031\031XM\0343U_N+'O^3s\021\035\t\t\b\001D\t\003g\na\001]1dW\026$XCAA;!\021\t9(!$\016\005\005e$\002BA>\003{\n\001\"\0338uKJt\027\r\034\006\005\003?\tyHC\002\004\003\003SA!a!\002\006\006\031a-\0347\013\t\005\035\025\021R\001\005[>$7O\003\002\002\f\006\0311\r]<\n\t\005=\025\021\020\002\017\r6c\005K]8ysB\0137m[3u\021%\t\031\nAI\001\n\003\t)*A\021tK:$Gk\034)mCf,'o\035(fCJ,e\016^5us\022\"WMZ1vYR$#'\006\002\002\030*\"\021qAAMW\t\tY\n\005\003\002\036\006\035VBAAP\025\021\t\t+a)\002\023Ut7\r[3dW\026$'bAASI\005Q\021M\0348pi\006$\030n\0348\n\t\005%\026q\024\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007\"CAW\001E\005I\021AAK\003}\031XM\0343U_Bc\027-_3sg:+\027M\035%pgR$C-\0324bk2$HE\r\005\n\003c\003\021\023!C\001\003+\013Qe]3oIR{\007\013\\1zKJ\034h*Z1s)&dW-\0228uSRLH\005Z3gCVdG\017\n\032\b\017\005U&\001#\001\0028\006i\001+Y2lKR\024U/\0337eKJ\0042!HA]\r\031\t!\001#\001\002<N!\021\021XA_!\r\031\023qX\005\004\003\003$#AB!osJ+g\rC\004\033\003s#\t!!2\025\005\005]\006BCAe\003s\023\r\021\"\001\002L\006\031An\\4\026\005\0055\007\003BAh\003Cl!!!5\013\t\005M\027Q[\001\006Y><GG\033\006\005\003/\fI.A\004m_\036<\027N\\4\013\t\005m\027Q\\\001\007CB\f7\r[3\013\005\005}\027aA8sO&!\0211]Ai\005\031aunZ4fe\"I\021q]A]A\003%\021QZ\001\005Y><\007\005\003\006\002l\006e\006\031!C\001\003[\f!#[:Qe>4\027\016\\5oO\026s\027M\0317fIV\021\021q\036\t\004G\005E\030bAAzI\t9!i\\8mK\006t\007BCA|\003s\003\r\021\"\001\002z\0061\022n\035)s_\032LG.\0338h\013:\f'\r\\3e?\022*\027\017F\002#\003wD!\"!@\002v\006\005\t\031AAx\003\rAH%\r\005\n\005\003\tI\f)Q\005\003_\f1#[:Qe>4\027\016\\5oO\026s\027M\0317fI\002B\001B!\002\002:\022\005!qA\001\nY><\007+Y2lKR$rA\tB\005\005\033\021\t\002C\004\003\f\t\r\001\031\001:\002\025A\f7m[3u)f\004X\rC\004\003\020\t\r\001\031\0016\002\027A\f\027\020\\8bINK'0\032\005\t\005'\021\031\0011\001\003\026\005QA/\0337f\013:$\030\016^=\021\007\r*%\006\003\005\003\032\005eF\021\001B\016\003\035qWm\036#bi\006$BA!\b\003$A\031QBa\b\n\007\t\005bBA\013CsR,\027I\035:bs>+H\017];u'R\024X-Y7\t\021\t\025\"q\003a\001\003_\f!bY8naJ,7o]3e\001")
/*     */ public abstract class PacketBuilder extends DataOutputStream {
/*     */   public PacketBuilder(OutputStream stream) {
/*  26 */     super(stream);
/*     */   } public void writeTileEntity(TileEntity t) {
/*  28 */     writeInt((t.func_145831_w()).field_73011_w.field_76574_g);
/*  29 */     writeInt(t.field_145851_c);
/*  30 */     writeInt(t.field_145848_d);
/*  31 */     writeInt(t.field_145849_e);
/*     */   }
/*     */   
/*     */   public void writeEntity(Entity e) {
/*  35 */     writeInt(e.field_70170_p.field_73011_w.field_76574_g);
/*  36 */     writeInt(e.func_145782_y());
/*     */   }
/*     */   public void writeDirection(Option d) {
/*  39 */     Option option = d;
/*  40 */     if (option instanceof Some) { Some some = (Some)option; ForgeDirection side = (ForgeDirection)some.x(); writeByte((byte)side.ordinal()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  41 */     else { writeByte(-1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void writeItemStack(ItemStack stack) {
/*  45 */     boolean haveStack = (stack != null && stack.field_77994_a > 0);
/*  46 */     writeBoolean(haveStack);
/*  47 */     if (haveStack) {
/*  48 */       writeNBT(stack.func_77955_b(new NBTTagCompound()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void writeNBT(NBTTagCompound nbt) {
/*  53 */     boolean haveNbt = !(nbt == null);
/*  54 */     writeBoolean(haveNbt);
/*  55 */     if (haveNbt) {
/*  56 */       CompressedStreamTools.func_74800_a(nbt, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void writeMedium(int v) {
/*  61 */     writeByte(v & 0xFF);
/*  62 */     writeByte(v >> 8 & 0xFF);
/*  63 */     writeByte(v >> 16 & 0xFF);
/*     */   }
/*     */   public void writePacketType(Enumeration.Value pt) {
/*  66 */     writeByte(pt.id());
/*     */   } public void sendToAllPlayers() {
/*  68 */     OpenComputers$.MODULE$.channel().sendToAll(packet());
/*     */   }
/*  70 */   public void sendToPlayersNearEntity(Entity e, Option<Object> range) { sendToNearbyPlayers(e.field_70170_p, e.field_70165_t, e.field_70163_u, e.field_70161_v, range); } public Option<Object> sendToPlayersNearEntity$default$2() { return (Option<Object>)None$.MODULE$; }
/*     */   
/*  72 */   public Option<Object> sendToPlayersNearHost$default$2() { return (Option<Object>)None$.MODULE$; } public void sendToPlayersNearHost(EnvironmentHost host, Option<Object> range) {
/*  73 */     EnvironmentHost environmentHost = host;
/*  74 */     if (environmentHost instanceof TileEntity) { TileEntity tileEntity = (TileEntity)environmentHost; sendToPlayersNearTileEntity(tileEntity, range); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  75 */     else { sendToNearbyPlayers(host.world(), host.xPosition(), host.yPosition(), host.zPosition(), range); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*  79 */   public Option<Object> sendToPlayersNearTileEntity$default$2() { return (Option<Object>)None$.MODULE$; } public final class PacketBuilder$$anonfun$1 extends AbstractFunction0.mcD.sp implements Serializable {
/*  80 */     public static final long serialVersionUID = 0L; private final ServerConfigurationManager manager$1; public final double apply() { return apply$mcD$sp(); } public double apply$mcD$sp() { return (this.manager$1.func_72395_o() + 1) * 16.0D; } public PacketBuilder$$anonfun$1(PacketBuilder $outer, ServerConfigurationManager manager$1) {} } public void sendToPlayersNearTileEntity(TileEntity t, Option<Object> range) { World world = t.func_145831_w();
/*  81 */     if (world instanceof WorldServer) { WorldServer worldServer = (WorldServer)world;
/*  82 */       int chunkX = t.field_145851_c >> 4;
/*  83 */       int chunkZ = t.field_145849_e >> 4;
/*     */       
/*  85 */       ServerConfigurationManager manager = FMLCommonHandler.instance().getMinecraftServerInstance().func_71203_ab();
/*  86 */       double maxPacketRange = BoxesRunTime.unboxToDouble(range.getOrElse((Function0)new PacketBuilder$$anonfun$1(this, manager)));
/*  87 */       double maxPacketRangeConfig = Settings$.MODULE$.get().maxNetworkClientPacketDistance();
/*  88 */       if (maxPacketRangeConfig > 0.0D) {
/*  89 */         maxPacketRange = RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(maxPacketRange), maxPacketRangeConfig);
/*     */       }
/*  91 */       double maxPacketRangeSq = maxPacketRange * maxPacketRange;
/*     */       
/*  93 */       WrapAsScala$.MODULE$.asScalaBuffer(worldServer.field_73010_i).foreach((Function1)new PacketBuilder$$anonfun$sendToPlayersNearTileEntity$1(this, t, chunkX, chunkZ, maxPacketRangeSq, worldServer)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/* 100 */       sendToNearbyPlayers(t.func_145831_w(), t.field_145851_c + 0.5D, t.field_145848_d + 0.5D, t.field_145849_e + 0.5D, range); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */   public final class PacketBuilder$$anonfun$sendToPlayersNearTileEntity$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TileEntity t$1; private final int chunkX$1; private final int chunkZ$1; private final double maxPacketRangeSq$1; private final WorldServer x2$1; public final void apply(Object e) { Object object = e; if (object instanceof EntityPlayerMP) {
/*     */         EntityPlayerMP entityPlayerMP = (EntityPlayerMP)object; this.$outer.sendToPlayer(entityPlayerMP); BoxedUnit boxedUnit = this.x2$1.func_73040_p().func_72694_a(entityPlayerMP, this.chunkX$1, this.chunkZ$1) ? ((entityPlayerMP.func_70092_e(this.t$1.field_145851_c + 0.5D, this.t$1.field_145848_d + 0.5D, this.t$1.field_145849_e + 0.5D) <= this.maxPacketRangeSq$1) ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT; return;
/* 105 */       }  throw new MatchError(object); } public PacketBuilder$$anonfun$sendToPlayersNearTileEntity$1(PacketBuilder $outer, TileEntity t$1, int chunkX$1, int chunkZ$1, double maxPacketRangeSq$1, WorldServer x2$1) {} } public void sendToNearbyPlayers(World world, double x, double y, double z, Option range) { int dimension = world.field_73011_w.field_76574_g;
/* 106 */     MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
/* 107 */     ServerConfigurationManager manager = server.func_71203_ab();
/*     */     
/* 109 */     double maxPacketRange = BoxesRunTime.unboxToDouble(range.getOrElse((Function0)new PacketBuilder$$anonfun$2(this, manager)));
/* 110 */     double maxPacketRangeConfig = Settings$.MODULE$.get().maxNetworkClientPacketDistance();
/* 111 */     if (maxPacketRangeConfig > 0.0D) {
/* 112 */       maxPacketRange = RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(maxPacketRange), maxPacketRangeConfig);
/*     */     }
/* 114 */     double maxPacketRangeSq = maxPacketRange * maxPacketRange;
/*     */     
/* 116 */     ((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(manager.field_72404_b).map((Function1)new PacketBuilder$$anonfun$sendToNearbyPlayers$1(this), Buffer$.MODULE$.canBuildFrom())).withFilter((Function1)new PacketBuilder$$anonfun$sendToNearbyPlayers$2(this, dimension)).foreach((Function1)new PacketBuilder$$anonfun$sendToNearbyPlayers$3(this, x, y, z, maxPacketRangeSq)); } public final class PacketBuilder$$anonfun$2 extends AbstractFunction0.mcD.sp implements Serializable { public static final long serialVersionUID = 0L; private final ServerConfigurationManager manager$2; public final double apply() { return apply$mcD$sp(); } public double apply$mcD$sp() { return (this.manager$2.func_72395_o() + 1) * 16.0D; } public PacketBuilder$$anonfun$2(PacketBuilder $outer, ServerConfigurationManager manager$2) {} } public final class PacketBuilder$$anonfun$sendToNearbyPlayers$1 extends AbstractFunction1<Object, EntityPlayerMP> implements Serializable { public static final long serialVersionUID = 0L; public final EntityPlayerMP apply(Object x$1) { return (EntityPlayerMP)x$1; } public PacketBuilder$$anonfun$sendToNearbyPlayers$1(PacketBuilder $outer) {} } public final class PacketBuilder$$anonfun$sendToNearbyPlayers$2 extends AbstractFunction1<EntityPlayerMP, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int dimension$1; public final boolean apply(EntityPlayerMP player) { return (player.field_71093_bK == this.dimension$1); } public PacketBuilder$$anonfun$sendToNearbyPlayers$2(PacketBuilder $outer, int dimension$1) {} } public final class PacketBuilder$$anonfun$sendToNearbyPlayers$3 extends AbstractFunction1<EntityPlayerMP, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final double x$2; private final double y$1; private final double z$1; private final double maxPacketRangeSq$2; public PacketBuilder$$anonfun$sendToNearbyPlayers$3(PacketBuilder $outer, double x$2, double y$1, double z$1, double maxPacketRangeSq$2) {} public final void apply(EntityPlayerMP player) {
/* 117 */       if (player.func_70092_e(this.x$2, this.y$1, this.z$1) <= this.maxPacketRangeSq$2)
/* 118 */         this.$outer.sendToPlayer(player); 
/*     */     } }
/*     */ 
/*     */   
/*     */   public void sendToPlayer(EntityPlayerMP player) {
/* 123 */     OpenComputers$.MODULE$.channel().sendTo(packet(), player);
/*     */   } public void sendToServer() {
/* 125 */     OpenComputers$.MODULE$.channel().sendToServer(packet());
/*     */   }
/*     */   
/*     */   public static ByteArrayOutputStream newData(boolean paramBoolean) {
/*     */     return PacketBuilder$.MODULE$.newData(paramBoolean);
/*     */   }
/*     */   
/*     */   public static void logPacket(Enumeration.Value paramValue, int paramInt, Option<TileEntity> paramOption) {
/*     */     PacketBuilder$.MODULE$.logPacket(paramValue, paramInt, paramOption);
/*     */   }
/*     */   
/*     */   public static void isProfilingEnabled_$eq(boolean paramBoolean) {
/*     */     PacketBuilder$.MODULE$.isProfilingEnabled_$eq(paramBoolean);
/*     */   }
/*     */   
/*     */   public static boolean isProfilingEnabled() {
/*     */     return PacketBuilder$.MODULE$.isProfilingEnabled();
/*     */   }
/*     */   
/*     */   public static Logger log() {
/*     */     return PacketBuilder$.MODULE$.log();
/*     */   }
/*     */   
/*     */   public abstract FMLProxyPacket packet();
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\PacketBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */