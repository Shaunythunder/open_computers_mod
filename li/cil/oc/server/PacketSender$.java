/*     */ package li.cil.oc.server;
/*     */ import li.cil.oc.api.event.FileSystemAccessEvent;
/*     */ import li.cil.oc.api.event.NetworkActivityEvent;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.common.CompressedPacketBuilder;
/*     */ import li.cil.oc.common.PacketBuilder;
/*     */ import li.cil.oc.common.SimplePacketBuilder;
/*     */ import li.cil.oc.common.tileentity.Hologram;
/*     */ import li.cil.oc.common.tileentity.Rack;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class PacketSender$ {
/*     */   public static final PacketSender$ MODULE$;
/*     */   
/*     */   public void sendAbstractBusState(AbstractBusAware t) {
/*  29 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.AbstractBusState());
/*     */     
/*  31 */     pb.writeTileEntity((TileEntity)t);
/*  32 */     pb.writeBoolean(t.isAbstractBusAvailable());
/*     */     
/*  34 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   private final WeakHashMap<Node, Cache<String, Long>> fileSystemAccessTimeouts;
/*     */   public void sendAdapterState(Adapter t) {
/*  38 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.AdapterState());
/*     */     
/*  40 */     pb.writeTileEntity((TileEntity)t);
/*  41 */     pb.writeByte(t.compressSides());
/*     */     
/*  43 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendAnalyze(String address, EntityPlayerMP player) {
/*  47 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.Analyze());
/*     */     
/*  49 */     pb.writeUTF(address);
/*     */     
/*  51 */     pb.sendToPlayer(player);
/*     */   }
/*     */   
/*     */   public void sendChargerState(Charger t) {
/*  55 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ChargerState());
/*     */     
/*  57 */     pb.writeTileEntity((TileEntity)t);
/*  58 */     pb.writeDouble(t.chargeSpeed());
/*  59 */     pb.writeBoolean(t.hasPower());
/*     */     
/*  61 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendClientLog(String line, EntityPlayerMP player) {
/*  65 */     CompressedPacketBuilder pb = new CompressedPacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ClientLog(), li.cil.oc.common.CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2());
/*     */     
/*  67 */     pb.writeUTF(line);
/*     */     
/*  69 */     pb.sendToPlayer(player);
/*     */   }
/*     */   
/*     */   public void sendClipboard(EntityPlayerMP player, String text) {
/*  73 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.Clipboard());
/*     */     
/*  75 */     pb.writeUTF(text);
/*     */     
/*  77 */     pb.sendToPlayer(player);
/*     */   }
/*     */   
/*     */   public void sendColorChange(Colored t) {
/*  81 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ColorChange());
/*     */     
/*  83 */     pb.writeTileEntity((TileEntity)t);
/*  84 */     pb.writeInt(t.color());
/*     */     
/*  86 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendComputerState(Computer t) {
/*  90 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ComputerState());
/*     */     
/*  92 */     pb.writeTileEntity((TileEntity)t);
/*  93 */     pb.writeBoolean(t.isRunning());
/*  94 */     pb.writeBoolean(t.hasErrored());
/*     */     
/*  96 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendComputerUserList(Computer t, String[] list) {
/* 100 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ComputerUserList());
/*     */     
/* 102 */     pb.writeTileEntity((TileEntity)t);
/* 103 */     pb.writeInt(list.length);
/* 104 */     scala.Predef$.MODULE$.refArrayOps((Object[])list).foreach((Function1)new PacketSender$$anonfun$sendComputerUserList$1(pb));
/*     */     
/* 106 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } public final class PacketSender$$anonfun$sendComputerUserList$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final SimplePacketBuilder pb$4; public final void apply(String x$1) {
/*     */       this.pb$4.writeUTF(x$1);
/*     */     } public PacketSender$$anonfun$sendComputerUserList$1(SimplePacketBuilder pb$4) {} } public void sendContainerUpdate(Container c, NBTTagCompound nbt, EntityPlayerMP player) {
/* 110 */     if (!nbt.func_82582_d()) {
/* 111 */       SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ContainerUpdate());
/*     */       
/* 113 */       pb.writeByte((byte)c.field_75152_c);
/* 114 */       pb.writeNBT(nbt);
/*     */       
/* 116 */       pb.sendToPlayer(player);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void sendDisassemblerActive(Disassembler t, boolean active) {
/* 121 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.DisassemblerActiveChange());
/*     */     
/* 123 */     pb.writeTileEntity((TileEntity)t);
/* 124 */     pb.writeBoolean(active);
/*     */     
/* 126 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   private WeakHashMap<Node, Cache<String, Long>> fileSystemAccessTimeouts() {
/* 130 */     return this.fileSystemAccessTimeouts;
/*     */   }
/*     */   
/* 133 */   public void sendFileSystemActivity(Node node, EnvironmentHost host, String name) { int diskActivityPacketDelay = li.cil.oc.Settings$.MODULE$.get().diskActivitySoundDelay();
/*     */     
/* 135 */     if (diskActivityPacketDelay >= 0)
/* 136 */       synchronized (fileSystemAccessTimeouts()) {
/* 137 */         Object object = fileSystemAccessTimeouts().getOrElseUpdate(node, (Function0)new PacketSender$$anonfun$1(diskActivityPacketDelay));
/*     */         Cache hostTimeouts = (Cache)object;
/* 139 */         Long lastHostTimeout = (Long)hostTimeouts.getIfPresent(name);
/* 140 */         if (lastHostTimeout == null || scala.Predef$.MODULE$.Long2long(lastHostTimeout) <= System.currentTimeMillis()) {
/* 141 */           FileSystemAccessEvent.Server server1; EnvironmentHost environmentHost = host;
/* 142 */           if (environmentHost instanceof TileEntity) { TileEntity tileEntity = (TileEntity)environmentHost; server1 = new FileSystemAccessEvent.Server(name, tileEntity, node); }
/* 143 */           else { server1 = new FileSystemAccessEvent.Server(name, host.world(), host.xPosition(), host.yPosition(), host.zPosition(), node); }
/*     */            FileSystemAccessEvent.Server event = server1;
/* 145 */           MinecraftForge.EVENT_BUS.post((Event)event);
/* 146 */           if (!event.isCanceled()) {
/* 147 */             hostTimeouts.put(name, scala.Predef$.MODULE$.long2Long(System.currentTimeMillis() + diskActivityPacketDelay));
/*     */             
/* 149 */             SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.FileSystemActivity());
/*     */             
/* 151 */             pb.writeUTF(event.getSound());
/* 152 */             CompressedStreamTools.func_74800_a(event.getData(), (DataOutput)pb);
/* 153 */             TileEntity tileEntity = event.getTileEntity();
/* 154 */             if (tileEntity != null) { TileEntity tileEntity1 = tileEntity;
/* 155 */               pb.writeBoolean(true);
/* 156 */               pb.writeTileEntity(tileEntity1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */             else
/* 158 */             { pb.writeBoolean(false);
/* 159 */               pb.writeInt((event.getWorld()).field_73011_w.field_76574_g);
/* 160 */               pb.writeDouble(event.getX());
/* 161 */               pb.writeDouble(event.getY());
/* 162 */               pb.writeDouble(event.getZ()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */             
/* 165 */             pb.sendToPlayersNearHost(host, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientSoundPacketDistance())));
/*     */           } 
/*     */         } 
/*     */         return;
/*     */       }   } public final class PacketSender$$anonfun$1 extends AbstractFunction0<Cache<String, Long>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int diskActivityPacketDelay$1; public final Cache<String, Long> apply() { return CacheBuilder.newBuilder().concurrencyLevel(li.cil.oc.Settings$.MODULE$.get().threads()).maximumSize(250L).expireAfterWrite(this.diskActivityPacketDelay$1, TimeUnit.MILLISECONDS).build(); } public PacketSender$$anonfun$1(int diskActivityPacketDelay$1) {} }
/*     */   public void sendNetworkActivity(Node node, EnvironmentHost host) {
/*     */     NetworkActivityEvent.Server server1;
/* 173 */     EnvironmentHost environmentHost = host;
/* 174 */     if (environmentHost instanceof TileEntity) { TileEntity tileEntity = (TileEntity)environmentHost; server1 = new NetworkActivityEvent.Server(tileEntity, node); }
/* 175 */     else { server1 = new NetworkActivityEvent.Server(host.world(), host.xPosition(), host.yPosition(), host.zPosition(), node); }
/*     */      NetworkActivityEvent.Server event = server1;
/* 177 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 178 */     if (!event.isCanceled()) {
/*     */       
/* 180 */       SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.NetworkActivity());
/*     */       
/* 182 */       CompressedStreamTools.func_74800_a(event.getData(), (DataOutput)pb);
/* 183 */       TileEntity tileEntity = event.getTileEntity();
/* 184 */       if (tileEntity != null) { TileEntity tileEntity1 = tileEntity;
/* 185 */         pb.writeBoolean(true);
/* 186 */         pb.writeTileEntity(tileEntity1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 188 */       { pb.writeBoolean(false);
/* 189 */         pb.writeInt((event.getWorld()).field_73011_w.field_76574_g);
/* 190 */         pb.writeDouble(event.getX());
/* 191 */         pb.writeDouble(event.getY());
/* 192 */         pb.writeDouble(event.getZ()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */       
/* 195 */       pb.sendToPlayersNearHost(host, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance())));
/*     */     } 
/*     */   }
/*     */   
/* 199 */   public ItemStack sendFloppyChange$default$2() { return null; } public void sendFloppyChange(DiskDrive t, ItemStack stack) {
/* 200 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.FloppyChange());
/*     */     
/* 202 */     pb.writeTileEntity((TileEntity)t);
/* 203 */     pb.writeItemStack(stack);
/*     */     
/* 205 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramClear(Hologram t) {
/* 209 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramClear());
/*     */     
/* 211 */     pb.writeTileEntity((TileEntity)t);
/*     */     
/* 213 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramColor(Hologram t, int index, int value) {
/* 217 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramColor());
/*     */     
/* 219 */     pb.writeTileEntity((TileEntity)t);
/* 220 */     pb.writeInt(index);
/* 221 */     pb.writeInt(value);
/*     */     
/* 223 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramPowerChange(Hologram t) {
/* 227 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramPowerChange());
/*     */     
/* 229 */     pb.writeTileEntity((TileEntity)t);
/* 230 */     pb.writeBoolean(t.hasPower());
/*     */     
/* 232 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramScale(Hologram t) {
/* 236 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramScale());
/*     */     
/* 238 */     pb.writeTileEntity((TileEntity)t);
/* 239 */     pb.writeDouble(t.scale());
/*     */     
/* 241 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramArea(Hologram t) {
/* 245 */     CompressedPacketBuilder pb = new CompressedPacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramArea(), li.cil.oc.common.CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2());
/*     */     
/* 247 */     pb.writeTileEntity((TileEntity)t);
/* 248 */     pb.writeByte(t.dirtyFromX());
/* 249 */     pb.writeByte(t.dirtyUntilX());
/* 250 */     pb.writeByte(t.dirtyFromZ());
/* 251 */     pb.writeByte(t.dirtyUntilZ()); scala.runtime.RichInt$.MODULE$
/* 252 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(t.dirtyFromX()), t.dirtyUntilX()).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendHologramArea$1(t, pb));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } public final class PacketSender$$anonfun$sendHologramArea$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Hologram t$1; public final CompressedPacketBuilder pb$5; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$sendHologramArea$1(Hologram t$1, CompressedPacketBuilder pb$5) {} public void apply$mcVI$sp(int x) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(this.t$1.dirtyFromZ()), this.t$1.dirtyUntilZ()).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int x$2; public final void apply(int z) { apply$mcVI$sp(z); } public PacketSender$$anonfun$sendHologramArea$1$$anonfun$apply$mcVI$sp$1(PacketSender$$anonfun$sendHologramArea$1 $outer, int x$2) {} public void apply$mcVI$sp(int z) { this.$outer.pb$5.writeInt(this.$outer.t$1.volume()[this.x$2 + z * 48]); this.$outer.pb$5.writeInt(this.$outer.t$1.volume()[this.x$2 + z * 48 + 2304]); } } }
/* 263 */   public void sendHologramValues(Hologram t) { CompressedPacketBuilder pb = new CompressedPacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramValues(), li.cil.oc.common.CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2());
/*     */     
/* 265 */     pb.writeTileEntity((TileEntity)t);
/* 266 */     pb.writeInt(t.dirty().size());
/* 267 */     t.dirty().foreach((Function1)new PacketSender$$anonfun$sendHologramValues$1(t, pb));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 277 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2()); } public final class PacketSender$$anonfun$sendHologramValues$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Hologram t$2; private final CompressedPacketBuilder pb$6; public PacketSender$$anonfun$sendHologramValues$1(Hologram t$2, CompressedPacketBuilder pb$6) {} public final void apply(short xz) { byte x = (byte)(xz >> 8); byte z = (byte)xz; this.pb$6.writeShort(xz); int rangeStart = x + z * 48; int rangeFinal = x + z * 48 + 2304;
/*     */       this.pb$6.writeInt(this.t$2.volume()[scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(rangeStart), 0)), (this.t$2.volume()).length - 1)]);
/*     */       this.pb$6.writeInt(this.t$2.volume()[scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(rangeFinal), 0)), (this.t$2.volume()).length - 1)]); } }
/* 281 */   public void sendHologramOffset(Hologram t) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramTranslation());
/*     */     
/* 283 */     pb.writeTileEntity((TileEntity)t);
/* 284 */     pb.writeDouble((t.translation()).field_72450_a);
/* 285 */     pb.writeDouble((t.translation()).field_72448_b);
/* 286 */     pb.writeDouble((t.translation()).field_72449_c);
/*     */     
/* 288 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2()); }
/*     */ 
/*     */   
/*     */   public void sendHologramRotation(Hologram t) {
/* 292 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramRotation());
/*     */     
/* 294 */     pb.writeTileEntity((TileEntity)t);
/* 295 */     pb.writeFloat(t.rotationAngle());
/* 296 */     pb.writeFloat(t.rotationX());
/* 297 */     pb.writeFloat(t.rotationY());
/* 298 */     pb.writeFloat(t.rotationZ());
/*     */     
/* 300 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendHologramRotationSpeed(Hologram t) {
/* 304 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.HologramRotationSpeed());
/*     */     
/* 306 */     pb.writeTileEntity((TileEntity)t);
/* 307 */     pb.writeFloat(t.rotationSpeed());
/* 308 */     pb.writeFloat(t.rotationSpeedX());
/* 309 */     pb.writeFloat(t.rotationSpeedY());
/* 310 */     pb.writeFloat(t.rotationSpeedZ());
/*     */     
/* 312 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendLootDisks(EntityPlayerMP p)
/*     */   {
/* 317 */     ArrayBuffer stacks = (ArrayBuffer)li.cil.oc.common.Loot$.MODULE$.worldDisks().map((Function1)new PacketSender$$anonfun$2(), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());
/* 318 */     stacks.foreach((Function1)new PacketSender$$anonfun$sendLootDisks$1(p));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 325 */     li.cil.oc.common.Loot$.MODULE$.disksForCyclingServer().foreach((Function1)new PacketSender$$anonfun$sendLootDisks$2(p)); } public final class PacketSender$$anonfun$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, ItemStack> implements Serializable {
/* 326 */     public static final long serialVersionUID = 0L; public final ItemStack apply(Tuple2 x$1) { return (ItemStack)x$1._1(); } } public final class PacketSender$$anonfun$sendLootDisks$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayerMP p$1; public PacketSender$$anonfun$sendLootDisks$1(EntityPlayerMP p$1) {} public final void apply(ItemStack stack) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.LootDisk()); pb.writeItemStack(stack); pb.sendToPlayer(this.p$1); } } public final class PacketSender$$anonfun$sendLootDisks$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayerMP p$1; public PacketSender$$anonfun$sendLootDisks$2(EntityPlayerMP p$1) {} public final void apply(ItemStack stack) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.CyclingDisk());
/*     */       
/* 328 */       pb.writeItemStack(stack);
/*     */       
/* 330 */       pb.sendToPlayer(this.p$1); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void sendNanomachineConfiguration(EntityPlayer player) {
/* 335 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.NanomachinesConfiguration());
/*     */     
/* 337 */     pb.writeEntity((Entity)player);
/* 338 */     Controller controller = Nanomachines.getController(player);
/* 339 */     if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 340 */       pb.writeBoolean(true);
/* 341 */       NBTTagCompound nbt = new NBTTagCompound();
/* 342 */       controllerImpl.save(nbt);
/* 343 */       pb.writeNBT(nbt); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/* 345 */     { pb.writeBoolean(false); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */     
/* 348 */     pb.sendToPlayersNearEntity((Entity)player, pb.sendToPlayersNearEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendNanomachineInputs(EntityPlayer player) {
/* 352 */     Controller controller = Nanomachines.getController(player);
/* 353 */     if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 354 */       SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.NanomachinesInputs());
/*     */       
/* 356 */       pb.writeEntity((Entity)player);
/* 357 */       byte[] inputs = (byte[])((TraversableOnce)controllerImpl.configuration().triggers().map((Function1)new PacketSender$$anonfun$3(), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.Byte());
/* 358 */       pb.writeInt(inputs.length);
/* 359 */       pb.write(inputs);
/*     */       
/* 361 */       pb.sendToPlayersNearEntity((Entity)player, pb.sendToPlayersNearEntity$default$2()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 362 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public final class PacketSender$$anonfun$3 extends AbstractFunction1<NeuralNetwork.TriggerNeuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final byte apply(NeuralNetwork.TriggerNeuron i) {
/*     */       return i.isActive() ? (byte)1 : (byte)0;
/*     */     } } public void sendNanomachinePower(EntityPlayer player) {
/* 367 */     Controller controller = Nanomachines.getController(player);
/* 368 */     if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 369 */       SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.NanomachinesPower());
/*     */       
/* 371 */       pb.writeEntity((Entity)player);
/* 372 */       pb.writeDouble(controllerImpl.getLocalBuffer());
/*     */       
/* 374 */       pb.sendToPlayersNearEntity((Entity)player, pb.sendToPlayersNearEntity$default$2()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 375 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void sendNetSplitterState(NetSplitter t) {
/* 380 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.NetSplitterState());
/*     */     
/* 382 */     pb.writeTileEntity((TileEntity)t);
/* 383 */     pb.writeBoolean(t.isInverted());
/* 384 */     pb.writeByte(t.compressSides());
/*     */     
/* 386 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/* 389 */   public void sendParticleEffect(BlockPosition position, String name, int count, double velocity, Option direction) { if (count > 0) {
/* 390 */       SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ParticleEffect());
/*     */       
/* 392 */       pb.writeInt(((World)position.world().get()).field_73011_w.field_76574_g);
/* 393 */       pb.writeInt(position.x());
/* 394 */       pb.writeInt(position.y());
/* 395 */       pb.writeInt(position.z());
/* 396 */       pb.writeDouble(velocity);
/* 397 */       pb.writeDirection(direction);
/* 398 */       pb.writeUTF(name);
/* 399 */       pb.writeByte((byte)count);
/*     */       
/* 401 */       pb.sendToNearbyPlayers((World)position.world().get(), position.x(), position.y(), position.z(), (Option)new Some(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance() / 2.0D)));
/*     */     }  }
/*     */   public Option<ForgeDirection> sendParticleEffect$default$5() { return (Option<ForgeDirection>)scala.None$.MODULE$; }
/* 404 */   public Option<String> sendPetVisibility$default$1() { return (Option<String>)scala.None$.MODULE$; } public Option<EntityPlayerMP> sendPetVisibility$default$2() { return (Option<EntityPlayerMP>)scala.None$.MODULE$; }
/* 405 */   public void sendPetVisibility(Option name, Option player) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.PetVisibility());
/*     */     
/* 407 */     Option option1 = name;
/* 408 */     if (option1 instanceof Some) { Some some = (Some)option1; String n = (String)some.x();
/* 409 */       pb.writeInt(1);
/* 410 */       pb.writeUTF(n);
/* 411 */       pb.writeBoolean(!PetVisibility$.MODULE$.hidden().contains(n)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/* 413 */     { pb.writeInt(PetVisibility$.MODULE$.hidden().size());
/* 414 */       PetVisibility$.MODULE$.hidden().foreach((Function1)new PacketSender$$anonfun$sendPetVisibility$1(pb)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 420 */     Option option2 = player;
/* 421 */     if (option2 instanceof Some) { Some some = (Some)option2; EntityPlayerMP p = (EntityPlayerMP)some.x(); pb.sendToPlayer(p); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 422 */     else { pb.sendToAllPlayers(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketSender$$anonfun$sendPetVisibility$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final SimplePacketBuilder pb$7; public PacketSender$$anonfun$sendPetVisibility$1(SimplePacketBuilder pb$7) {} public final void apply(String n) { this.pb$7.writeUTF(n);
/*     */       this.pb$7.writeBoolean(false); } }
/*     */   public void sendPowerState(PowerInformation t) {
/* 427 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.PowerState());
/*     */     
/* 429 */     pb.writeTileEntity((TileEntity)t);
/* 430 */     pb.writeDouble(scala.math.package$.MODULE$.round(t.globalBuffer()));
/* 431 */     pb.writeDouble(t.globalBufferSize());
/*     */     
/* 433 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendPrinting(Printer t, boolean printing) {
/* 437 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.PrinterState());
/*     */     
/* 439 */     pb.writeTileEntity((TileEntity)t);
/* 440 */     pb.writeBoolean(printing);
/*     */     
/* 442 */     pb.sendToPlayersNearHost((EnvironmentHost)t, pb.sendToPlayersNearHost$default$2());
/*     */   }
/*     */   
/*     */   public void sendRackInventory(Rack t) {
/* 446 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RackInventory());
/*     */     
/* 448 */     pb.writeTileEntity((TileEntity)t);
/* 449 */     pb.writeInt(t.func_70302_i_()); scala.runtime.RichInt$.MODULE$
/* 450 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), t.func_70302_i_()).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendRackInventory$1(t, pb));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 455 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } public final class PacketSender$$anonfun$sendRackInventory$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Rack t$3; private final SimplePacketBuilder pb$8; public final void apply(int slot) { apply$mcVI$sp(slot); } public PacketSender$$anonfun$sendRackInventory$1(Rack t$3, SimplePacketBuilder pb$8) {} public void apply$mcVI$sp(int slot) { this.pb$8.writeInt(slot);
/*     */       this.pb$8.writeItemStack(this.t$3.func_70301_a(slot)); } }
/* 459 */   public void sendRackInventory(Rack t, int slot) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RackInventory());
/*     */     
/* 461 */     pb.writeTileEntity((TileEntity)t);
/* 462 */     pb.writeInt(1);
/* 463 */     pb.writeInt(slot);
/* 464 */     pb.writeItemStack(t.func_70301_a(slot));
/*     */     
/* 466 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2()); }
/*     */ 
/*     */   
/*     */   public void sendRackMountableData(Rack t, int mountable) {
/* 470 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RackMountableData());
/*     */     
/* 472 */     pb.writeTileEntity((TileEntity)t);
/* 473 */     pb.writeInt(mountable);
/* 474 */     pb.writeNBT(t.lastData()[mountable]);
/*     */     
/* 476 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendRaidChange(Raid t) {
/* 480 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RaidStateChange());
/*     */     
/* 482 */     pb.writeTileEntity((TileEntity)t); scala.runtime.RichInt$.MODULE$
/* 483 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), t.func_70302_i_()).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendRaidChange$1(t, pb));
/*     */ 
/*     */ 
/*     */     
/* 487 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } public final class PacketSender$$anonfun$sendRaidChange$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Raid t$4; private final SimplePacketBuilder pb$9; public final void apply(int slot) { apply$mcVI$sp(slot); } public PacketSender$$anonfun$sendRaidChange$1(Raid t$4, SimplePacketBuilder pb$9) {}
/*     */     public void apply$mcVI$sp(int slot) { this.pb$9.writeBoolean(!(this.t$4.func_70301_a(slot) == null)); } }
/* 491 */   public void sendRedstoneState(RedstoneAware t) { SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RedstoneState());
/*     */     
/* 493 */     pb.writeTileEntity((TileEntity)t);
/* 494 */     pb.writeBoolean(t.isOutputEnabled());
/* 495 */     scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new PacketSender$$anonfun$sendRedstoneState$1(t, pb));
/*     */ 
/*     */ 
/*     */     
/* 499 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2()); } public final class PacketSender$$anonfun$sendRedstoneState$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final RedstoneAware t$5; private final SimplePacketBuilder pb$10; public PacketSender$$anonfun$sendRedstoneState$1(RedstoneAware t$5, SimplePacketBuilder pb$10) {} public final void apply(ForgeDirection d) {
/*     */       this.pb$10.writeByte(this.t$5.getOutput(d));
/*     */     } } public void sendRobotAssembling(Assembler t, boolean assembling) {
/* 503 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotAssemblingState());
/*     */     
/* 505 */     pb.writeTileEntity((TileEntity)t);
/* 506 */     pb.writeBoolean(assembling);
/*     */     
/* 508 */     pb.sendToPlayersNearHost((EnvironmentHost)t, pb.sendToPlayersNearHost$default$2());
/*     */   }
/*     */   
/*     */   public void sendRobotMove(Robot t, BlockPosition position, ForgeDirection direction) {
/* 512 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotMove());
/*     */ 
/*     */     
/* 515 */     pb.writeInt((t.proxy().world()).field_73011_w.field_76574_g);
/* 516 */     pb.writeInt(position.x());
/* 517 */     pb.writeInt(position.y());
/* 518 */     pb.writeInt(position.z());
/* 519 */     pb.writeDirection(scala.Option$.MODULE$.apply(direction));
/*     */     
/* 521 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendRobotAnimateSwing(Robot t) {
/* 525 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotAnimateSwing());
/*     */     
/* 527 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 528 */     pb.writeInt(t.animationTicksTotal());
/*     */     
/* 530 */     pb.sendToPlayersNearTileEntity((TileEntity)t, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance())));
/*     */   }
/*     */   
/*     */   public void sendRobotAnimateTurn(Robot t) {
/* 534 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotAnimateTurn());
/*     */     
/* 536 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 537 */     pb.writeByte(t.turnAxis());
/* 538 */     pb.writeInt(t.animationTicksTotal());
/*     */     
/* 540 */     pb.sendToPlayersNearTileEntity((TileEntity)t, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance())));
/*     */   }
/*     */   
/*     */   public void sendRobotInventory(Robot t, int slot, ItemStack stack) {
/* 544 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotInventoryChange());
/*     */     
/* 546 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 547 */     pb.writeInt(slot);
/* 548 */     pb.writeItemStack(stack);
/*     */     
/* 550 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendRobotLightChange(Robot t) {
/* 554 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotLightChange());
/*     */     
/* 556 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 557 */     pb.writeInt(t.info().lightColor());
/*     */     
/* 559 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendRobotNameChange(Robot t) {
/* 563 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotNameChange());
/*     */     
/* 565 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 566 */     String name = t.name();
/* 567 */     short len = (short)name.length();
/* 568 */     pb.writeShort(len); scala.runtime.RichInt$.MODULE$
/* 569 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), len).foreach$mVc$sp((Function1)new PacketSender$$anonfun$sendRobotNameChange$1(pb, name));
/*     */ 
/*     */ 
/*     */     
/* 573 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } public final class PacketSender$$anonfun$sendRobotNameChange$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final SimplePacketBuilder pb$11; private final String name$1; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$sendRobotNameChange$1(SimplePacketBuilder pb$11, String name$1) {} public void apply$mcVI$sp(int x) { this.pb$11.writeChar(scala.collection.immutable.StringOps$.MODULE$.apply$extension(scala.Predef$.MODULE$.augmentString(this.name$1), x)); } }
/*     */   public void sendRobotSelectedSlotChange(Robot t) {
/* 577 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotSelectedSlotChange());
/*     */     
/* 579 */     pb.writeTileEntity((TileEntity)t.proxy());
/* 580 */     pb.writeInt(t.selectedSlot());
/*     */     
/* 582 */     pb.sendToPlayersNearTileEntity((TileEntity)t, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance() / 4.0D)));
/*     */   }
/*     */   
/*     */   public void sendRotatableState(Rotatable t) {
/* 586 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RotatableState());
/*     */     
/* 588 */     pb.writeTileEntity((TileEntity)t);
/* 589 */     pb.writeDirection(scala.Option$.MODULE$.apply(t.pitch()));
/* 590 */     pb.writeDirection(scala.Option$.MODULE$.apply(t.yaw()));
/*     */     
/* 592 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendSwitchActivity(SwitchLike t) {
/* 596 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.SwitchActivity());
/*     */     
/* 598 */     pb.writeTileEntity((TileEntity)t);
/*     */     
/* 600 */     pb.sendToPlayersNearTileEntity((TileEntity)t, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance())));
/*     */   }
/*     */   
/*     */   public void appendTextBufferColorChange(PacketBuilder pb, PackedColor.Color foreground, PackedColor.Color background) {
/* 604 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiColorChange());
/*     */     
/* 606 */     pb.writeInt(foreground.value());
/* 607 */     pb.writeBoolean(foreground.isPalette());
/* 608 */     pb.writeInt(background.value());
/* 609 */     pb.writeBoolean(background.isPalette());
/*     */   }
/*     */   
/*     */   public void appendTextBufferCopy(PacketBuilder pb, int col, int row, int w, int h, int tx, int ty) {
/* 613 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiCopy());
/*     */     
/* 615 */     pb.writeInt(col);
/* 616 */     pb.writeInt(row);
/* 617 */     pb.writeInt(w);
/* 618 */     pb.writeInt(h);
/* 619 */     pb.writeInt(tx);
/* 620 */     pb.writeInt(ty);
/*     */   }
/*     */   
/*     */   public void appendTextBufferDepthChange(PacketBuilder pb, TextBuffer.ColorDepth value) {
/* 624 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiDepthChange());
/*     */     
/* 626 */     pb.writeInt(value.ordinal());
/*     */   }
/*     */   
/*     */   public void appendTextBufferFill(PacketBuilder pb, int col, int row, int w, int h, int c) {
/* 630 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiFill());
/*     */     
/* 632 */     pb.writeInt(col);
/* 633 */     pb.writeInt(row);
/* 634 */     pb.writeInt(w);
/* 635 */     pb.writeInt(h);
/* 636 */     pb.writeMedium(c);
/*     */   }
/*     */   
/*     */   public void appendTextBufferPaletteChange(PacketBuilder pb, int index, int color) {
/* 640 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiPaletteChange());
/*     */     
/* 642 */     pb.writeInt(index);
/* 643 */     pb.writeInt(color);
/*     */   }
/*     */   
/*     */   public void appendTextBufferResolutionChange(PacketBuilder pb, int w, int h) {
/* 647 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiResolutionChange());
/*     */     
/* 649 */     pb.writeInt(w);
/* 650 */     pb.writeInt(h);
/*     */   }
/*     */   
/*     */   public void appendTextBufferViewportResolutionChange(PacketBuilder pb, int w, int h) {
/* 654 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiViewportResolutionChange());
/*     */     
/* 656 */     pb.writeInt(w);
/* 657 */     pb.writeInt(h);
/*     */   }
/*     */   
/*     */   public void appendTextBufferMaxResolutionChange(PacketBuilder pb, int w, int h) {
/* 661 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiMaxResolutionChange());
/*     */     
/* 663 */     pb.writeInt(w);
/* 664 */     pb.writeInt(h);
/*     */   }
/*     */   
/*     */   public void appendTextBufferSet(PacketBuilder pb, int col, int row, String s, boolean vertical) {
/* 668 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiSet());
/*     */     
/* 670 */     pb.writeInt(col);
/* 671 */     pb.writeInt(row);
/* 672 */     pb.writeUTF(s);
/* 673 */     pb.writeBoolean(vertical);
/*     */   }
/*     */   
/*     */   public void appendTextBufferBitBlt(PacketBuilder pb, int col, int row, int w, int h, String owner, int id, int fromCol, int fromRow) {
/* 677 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferBitBlt());
/*     */     
/* 679 */     pb.writeInt(col);
/* 680 */     pb.writeInt(row);
/* 681 */     pb.writeInt(w);
/* 682 */     pb.writeInt(h);
/* 683 */     pb.writeUTF(owner);
/* 684 */     pb.writeInt(id);
/* 685 */     pb.writeInt(fromCol);
/* 686 */     pb.writeInt(fromRow);
/*     */   }
/*     */   
/*     */   public void appendTextBufferRamInit(PacketBuilder pb, String address, int id, NBTTagCompound nbt) {
/* 690 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferRamInit());
/*     */     
/* 692 */     pb.writeUTF(address);
/* 693 */     pb.writeInt(id);
/* 694 */     pb.writeNBT(nbt);
/*     */   }
/*     */   
/*     */   public void appendTextBufferRamDestroy(PacketBuilder pb, String owner, int id) {
/* 698 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferRamDestroy());
/* 699 */     pb.writeUTF(owner);
/* 700 */     pb.writeInt(id);
/*     */   }
/*     */   
/*     */   public void appendTextBufferRawSetText(PacketBuilder pb, int col, int row, int[][] text) {
/* 704 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiRawSetText());
/*     */     
/* 706 */     pb.writeInt(col);
/* 707 */     pb.writeInt(row);
/* 708 */     pb.writeShort((short)text.length); scala.runtime.RichInt$.MODULE$
/* 709 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)text.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetText$1(pb, text)); } public final class PacketSender$$anonfun$appendTextBufferRawSetText$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final PacketBuilder pb$1; private final int[][] text$1; public final void apply(int y) { apply$mcVI$sp(y); } public PacketSender$$anonfun$appendTextBufferRawSetText$1(PacketBuilder pb$1, int[][] text$1) {}
/* 710 */     public void apply$mcVI$sp(int y) { int[] line = this.text$1[y];
/* 711 */       this.pb$1.writeShort((short)line.length); scala.runtime.RichInt$.MODULE$
/* 712 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$1; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetText$1$$anonfun$apply$mcVI$sp$2(PacketSender$$anonfun$appendTextBufferRawSetText$1 $outer, int[] line$1) {} public void apply$mcVI$sp(int x) {
/* 713 */         this.$outer.pb$1.writeMedium(this.line$1[x]);
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public void appendTextBufferRawSetBackground(PacketBuilder pb, int col, int row, int[][] color) {
/* 719 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiRawSetBackground());
/*     */     
/* 721 */     pb.writeInt(col);
/* 722 */     pb.writeInt(row);
/* 723 */     pb.writeShort((short)color.length); scala.runtime.RichInt$.MODULE$
/* 724 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)color.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetBackground$1(pb, color)); } public final class PacketSender$$anonfun$appendTextBufferRawSetBackground$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final PacketBuilder pb$2; private final int[][] color$1; public final void apply(int y) { apply$mcVI$sp(y); } public PacketSender$$anonfun$appendTextBufferRawSetBackground$1(PacketBuilder pb$2, int[][] color$1) {}
/* 725 */     public void apply$mcVI$sp(int y) { int[] line = this.color$1[y];
/* 726 */       this.pb$2.writeShort((short)line.length); scala.runtime.RichInt$.MODULE$
/* 727 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$2; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetBackground$1$$anonfun$apply$mcVI$sp$3(PacketSender$$anonfun$appendTextBufferRawSetBackground$1 $outer, int[] line$2) {} public void apply$mcVI$sp(int x) {
/* 728 */         this.$outer.pb$2.writeInt(this.line$2[x]);
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public void appendTextBufferRawSetForeground(PacketBuilder pb, int col, int row, int[][] color) {
/* 734 */     pb.writePacketType(li.cil.oc.common.PacketType$.MODULE$.TextBufferMultiRawSetForeground());
/*     */     
/* 736 */     pb.writeInt(col);
/* 737 */     pb.writeInt(row);
/* 738 */     pb.writeShort((short)color.length); scala.runtime.RichInt$.MODULE$
/* 739 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)color.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetForeground$1(pb, color)); } public final class PacketSender$$anonfun$appendTextBufferRawSetForeground$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final PacketBuilder pb$3; private final int[][] color$2; public final void apply(int y) { apply$mcVI$sp(y); } public PacketSender$$anonfun$appendTextBufferRawSetForeground$1(PacketBuilder pb$3, int[][] color$2) {}
/* 740 */     public void apply$mcVI$sp(int y) { int[] line = this.color$2[y];
/* 741 */       this.pb$3.writeShort((short)line.length); scala.runtime.RichInt$.MODULE$
/* 742 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), (short)line.length).foreach$mVc$sp((Function1)new PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4(this, line)); } public final class PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$3; public final void apply(int x) { apply$mcVI$sp(x); } public PacketSender$$anonfun$appendTextBufferRawSetForeground$1$$anonfun$apply$mcVI$sp$4(PacketSender$$anonfun$appendTextBufferRawSetForeground$1 $outer, int[] line$3) {} public void apply$mcVI$sp(int x) {
/* 743 */         this.$outer.pb$3.writeInt(this.line$3[x]);
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public void sendTextBufferInit(String address, NBTTagCompound value, EntityPlayerMP player) {
/* 749 */     CompressedPacketBuilder pb = new CompressedPacketBuilder(li.cil.oc.common.PacketType$.MODULE$.TextBufferInit(), li.cil.oc.common.CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2());
/*     */     
/* 751 */     pb.writeUTF(address);
/* 752 */     pb.writeNBT(value);
/*     */     
/* 754 */     pb.sendToPlayer(player);
/*     */   }
/*     */   
/*     */   public void sendTextBufferPowerChange(String address, boolean hasPower, EnvironmentHost host) {
/* 758 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.TextBufferPowerChange());
/*     */     
/* 760 */     pb.writeUTF(address);
/* 761 */     pb.writeBoolean(hasPower);
/*     */     
/* 763 */     pb.sendToPlayersNearHost(host, pb.sendToPlayersNearHost$default$2());
/*     */   }
/*     */   
/*     */   public void sendScreenTouchMode(Screen t, boolean value) {
/* 767 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ScreenTouchMode());
/*     */     
/* 769 */     pb.writeTileEntity((TileEntity)t);
/* 770 */     pb.writeBoolean(value);
/*     */     
/* 772 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   }
/*     */   
/*     */   public void sendSound(World world, double x, double y, double z, int frequency, int duration) {
/* 776 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.Sound());
/*     */     
/* 778 */     BlockPosition blockPos = li.cil.oc.util.BlockPosition$.MODULE$.apply(x, y, z);
/* 779 */     pb.writeInt(world.field_73011_w.field_76574_g);
/* 780 */     pb.writeInt(blockPos.x());
/* 781 */     pb.writeInt(blockPos.y());
/* 782 */     pb.writeInt(blockPos.z());
/* 783 */     pb.writeShort((short)frequency);
/* 784 */     pb.writeShort((short)duration);
/*     */     
/* 786 */     pb.sendToNearbyPlayers(world, x, y, z, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientSoundPacketDistance())));
/*     */   }
/*     */   
/*     */   public void sendSound(World world, double x, double y, double z, String pattern) {
/* 790 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.SoundPattern());
/*     */     
/* 792 */     BlockPosition blockPos = li.cil.oc.util.BlockPosition$.MODULE$.apply(x, y, z);
/* 793 */     pb.writeInt(world.field_73011_w.field_76574_g);
/* 794 */     pb.writeInt(blockPos.x());
/* 795 */     pb.writeInt(blockPos.y());
/* 796 */     pb.writeInt(blockPos.z());
/* 797 */     pb.writeUTF(pattern);
/*     */     
/* 799 */     pb.sendToNearbyPlayers(world, x, y, z, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientSoundPacketDistance())));
/*     */   }
/*     */   
/*     */   public void sendTransposerActivity(Transposer t) {
/* 803 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.TransposerActivity());
/*     */     
/* 805 */     pb.writeTileEntity((TileEntity)t);
/*     */     
/* 807 */     pb.sendToPlayersNearTileEntity((TileEntity)t, scala.Option$.MODULE$.apply(BoxesRunTime.boxToDouble(li.cil.oc.Settings$.MODULE$.get().maxNetworkClientEffectPacketDistance() / 2.0D)));
/*     */   }
/*     */   
/*     */   public void sendWaypointLabel(Waypoint t) {
/* 811 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.WaypointLabel());
/*     */     
/* 813 */     pb.writeTileEntity((TileEntity)t);
/* 814 */     pb.writeUTF(t.label());
/*     */     
/* 816 */     pb.sendToPlayersNearTileEntity((TileEntity)t, pb.sendToPlayersNearTileEntity$default$2());
/*     */   } private PacketSender$() {
/* 818 */     MODULE$ = this;
/*     */     this.fileSystemAccessTimeouts = scala.collection.mutable.WeakHashMap$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\PacketSender$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */