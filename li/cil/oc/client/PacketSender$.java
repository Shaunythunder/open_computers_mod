/*     */ package li.cil.oc.client;
/*     */ 
/*     */ import li.cil.oc.common.CompressedPacketBuilder;
/*     */ import li.cil.oc.common.SimplePacketBuilder;
/*     */ import li.cil.oc.common.entity.Drone;
/*     */ import li.cil.oc.common.tileentity.Assembler;
/*     */ import li.cil.oc.common.tileentity.Rack;
/*     */ import li.cil.oc.common.tileentity.Waypoint;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.audio.SoundHandler;
/*     */ import net.minecraft.client.entity.EntityClientPlayerMP;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import scala.Option;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class PacketSender$ {
/*     */   public static final PacketSender$ MODULE$;
/*     */   
/*  19 */   public long clipboardCooldown() { return this.clipboardCooldown; } private long clipboardCooldown; public void clipboardCooldown_$eq(long x$1) { this.clipboardCooldown = x$1; }
/*     */   
/*     */   public void sendComputerPower(Computer t, boolean power) {
/*  22 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ComputerPower());
/*     */     
/*  24 */     pb.writeTileEntity((TileEntity)t);
/*  25 */     pb.writeBoolean(power);
/*     */     
/*  27 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendDriveMode(boolean unmanaged) {
/*  31 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.DriveMode());
/*     */     
/*  33 */     pb.writeBoolean(unmanaged);
/*     */     
/*  35 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendDriveLock() {
/*  39 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.DriveLock());
/*     */     
/*  41 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendDronePower(Drone e, boolean power) {
/*  45 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.DronePower());
/*     */     
/*  47 */     pb.writeEntity((Entity)e);
/*  48 */     pb.writeBoolean(power);
/*     */     
/*  50 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendKeyDown(String address, char char, int code) {
/*  54 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.KeyDown());
/*     */     
/*  56 */     pb.writeUTF(address);
/*  57 */     pb.writeChar(char);
/*  58 */     pb.writeInt(code);
/*     */     
/*  60 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendKeyUp(String address, char char, int code) {
/*  64 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.KeyUp());
/*     */     
/*  66 */     pb.writeUTF(address);
/*  67 */     pb.writeChar(char);
/*  68 */     pb.writeInt(code);
/*     */     
/*  70 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendClipboard(String address, String value) {
/*  74 */     if (value != null && !value.isEmpty())
/*  75 */       if (value.length() > 65536 || System.currentTimeMillis() < clipboardCooldown()) {
/*  76 */         EntityClientPlayerMP player = (Minecraft.func_71410_x()).field_71439_g;
/*  77 */         SoundHandler handler = Minecraft.func_71410_x().func_147118_V();
/*  78 */         handler.func_147682_a((ISound)new PositionedSoundRecord(new ResourceLocation("note.harp"), 1.0F, 1.0F, (float)player.field_70165_t, (float)player.field_70163_u, (float)player.field_70161_v));
/*     */       } else {
/*     */         
/*  81 */         clipboardCooldown_$eq(System.currentTimeMillis() + (value.length() / 10));
/*  82 */         (new StringOps(scala.Predef$.MODULE$.augmentString(value))).grouped(16384).foreach((Function1)new PacketSender$$anonfun$sendClipboard$1(address));
/*  83 */       }   } public final class PacketSender$$anonfun$sendClipboard$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String address$1; public PacketSender$$anonfun$sendClipboard$1(String address$1) {} public final void apply(String part) { CompressedPacketBuilder pb = new CompressedPacketBuilder(li.cil.oc.common.PacketType$.MODULE$.Clipboard(), li.cil.oc.common.CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2());
/*     */       
/*  85 */       pb.writeUTF(this.address$1);
/*  86 */       pb.writeUTF(part);
/*     */       
/*  88 */       pb.sendToServer(); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendMouseClick(String address, double x, double y, boolean drag, int button) {
/*  95 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.MouseClickOrDrag());
/*     */     
/*  97 */     pb.writeUTF(address);
/*  98 */     pb.writeFloat((float)x);
/*  99 */     pb.writeFloat((float)y);
/* 100 */     pb.writeBoolean(drag);
/* 101 */     pb.writeByte((byte)button);
/*     */     
/* 103 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendMouseScroll(String address, double x, double y, int scroll) {
/* 107 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.MouseScroll());
/*     */     
/* 109 */     pb.writeUTF(address);
/* 110 */     pb.writeFloat((float)x);
/* 111 */     pb.writeFloat((float)y);
/* 112 */     pb.writeByte(scroll);
/*     */     
/* 114 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendMouseUp(String address, double x, double y, int button) {
/* 118 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.MouseUp());
/*     */     
/* 120 */     pb.writeUTF(address);
/* 121 */     pb.writeFloat((float)x);
/* 122 */     pb.writeFloat((float)y);
/* 123 */     pb.writeByte((byte)button);
/*     */     
/* 125 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendCopyToAnalyzer(String address, int line) {
/* 129 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.CopyToAnalyzer());
/*     */     
/* 131 */     pb.writeUTF(address);
/* 132 */     pb.writeInt(line);
/*     */     
/* 134 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendMultiPlace() {
/* 138 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.MultiPartPlace());
/* 139 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendPetVisibility() {
/* 143 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.PetVisibility());
/*     */     
/* 145 */     pb.writeBoolean(!li.cil.oc.Settings$.MODULE$.get().hideOwnPet());
/*     */     
/* 147 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendRackMountableMapping(Rack t, int mountableIndex, int nodeIndex, Option side) {
/* 151 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RackMountableMapping());
/*     */     
/* 153 */     pb.writeTileEntity((TileEntity)t);
/* 154 */     pb.writeInt(mountableIndex);
/* 155 */     pb.writeInt(nodeIndex);
/* 156 */     pb.writeDirection(side);
/*     */     
/* 158 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendRackRelayState(Rack t, boolean enabled) {
/* 162 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RackRelayState());
/*     */     
/* 164 */     pb.writeTileEntity((TileEntity)t);
/* 165 */     pb.writeBoolean(enabled);
/*     */     
/* 167 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendDatabaseSetSlot(int slot, ItemStack stack) {
/* 171 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.DatabaseSetSlot());
/*     */     
/* 173 */     pb.writeByte(slot);
/* 174 */     pb.writeItemStack(stack);
/*     */     
/* 176 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendRobotAssemblerStart(Assembler t) {
/* 180 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotAssemblerStart());
/*     */     
/* 182 */     pb.writeTileEntity((TileEntity)t);
/*     */     
/* 184 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendRobotStateRequest(int dimension, int x, int y, int z) {
/* 188 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.RobotStateRequest());
/*     */     
/* 190 */     pb.writeInt(dimension);
/* 191 */     pb.writeInt(x);
/* 192 */     pb.writeInt(y);
/* 193 */     pb.writeInt(z);
/*     */     
/* 195 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendServerPower(Rack t, int mountableIndex, boolean power) {
/* 199 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.ServerPower());
/*     */     
/* 201 */     pb.writeTileEntity((TileEntity)t);
/* 202 */     pb.writeInt(mountableIndex);
/* 203 */     pb.writeBoolean(power);
/*     */     
/* 205 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendTextBufferInit(String address) {
/* 209 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.TextBufferInit());
/*     */     
/* 211 */     pb.writeUTF(address);
/*     */     
/* 213 */     pb.sendToServer();
/*     */   }
/*     */   
/*     */   public void sendWaypointLabel(Waypoint t) {
/* 217 */     SimplePacketBuilder pb = new SimplePacketBuilder(li.cil.oc.common.PacketType$.MODULE$.WaypointLabel());
/*     */     
/* 219 */     pb.writeTileEntity((TileEntity)t);
/* 220 */     pb.writeUTF(t.label());
/*     */     
/* 222 */     pb.sendToServer();
/*     */   } private PacketSender$() {
/* 224 */     MODULE$ = this;
/*     */     this.clipboardCooldown = 0L;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\PacketSender$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */