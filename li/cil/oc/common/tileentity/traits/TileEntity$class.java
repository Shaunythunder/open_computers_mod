/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.common.SaveHandler$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.network.Packet;
/*     */ import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ public abstract class TileEntity$class {
/*     */   public static World world(TileEntity $this) {
/*  16 */     return ((TileEntity)$this).func_145831_w();
/*     */   } public static void $init$(TileEntity $this) {} public static int x(TileEntity $this) {
/*  18 */     return ((TileEntity)$this).field_145851_c;
/*     */   } public static int y(TileEntity $this) {
/*  20 */     return ((TileEntity)$this).field_145848_d;
/*     */   } public static int z(TileEntity $this) {
/*  22 */     return ((TileEntity)$this).field_145849_e;
/*     */   } public static BlockPosition position(TileEntity $this) {
/*  24 */     return BlockPosition$.MODULE$.apply($this.x(), $this.y(), $this.z(), $this.world());
/*     */   } public static Block block(TileEntity $this) {
/*  26 */     return ((TileEntity)$this).func_145838_q();
/*     */   } public static boolean isClient(TileEntity $this) {
/*  28 */     return !$this.isServer();
/*     */   } public static boolean isServer(TileEntity $this) {
/*  30 */     return ($this.world() == null) ? SideTracker.isServer() : (!($this.world()).field_72995_K);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateEntity(TileEntity $this) {
/*  35 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$updateEntity();
/*  36 */     if (Settings$.MODULE$.get().periodicallyForceLightUpdate() && $this.world().func_82737_E() % 40L == 0L && $this.block().getLightValue((IBlockAccess)$this.world(), $this.x(), $this.y(), $this.z()) > 0) {
/*  37 */       $this.world().func_147471_g($this.x(), $this.y(), $this.z());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void validate(TileEntity $this) {
/*  42 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$validate();
/*  43 */     $this.initialize();
/*     */   }
/*     */   
/*     */   public static void invalidate(TileEntity $this) {
/*  47 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$invalidate();
/*  48 */     $this.dispose();
/*     */   }
/*     */   
/*     */   public static void onChunkUnload(TileEntity $this) {
/*  52 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$onChunkUnload();
/*  53 */     $this.dispose();
/*     */   }
/*     */   
/*     */   public static void initialize(TileEntity $this) {}
/*     */   
/*     */   public static void dispose(TileEntity $this) {
/*  59 */     if ($this.isClient())
/*     */     {
/*  61 */       Sound$.MODULE$.stopLoop((TileEntity)$this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(TileEntity $this, NBTTagCompound nbt) {
/*  67 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$readFromNBT(nbt);
/*     */   } public static void writeToNBTForServer(TileEntity $this, NBTTagCompound nbt) {
/*  69 */     $this.li$cil$oc$common$tileentity$traits$TileEntity$$super$writeToNBT(nbt);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void readFromNBTForClient(TileEntity $this, NBTTagCompound nbt) {}
/*     */   
/*     */   public static void writeToNBTForClient(TileEntity $this, NBTTagCompound nbt) {}
/*     */   
/*     */   public static void readFromNBT(TileEntity $this, NBTTagCompound nbt) {
/*  79 */     if ($this.isServer()) {
/*  80 */       $this.readFromNBTForServer(nbt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void writeToNBT(TileEntity $this, NBTTagCompound nbt) {
/*  85 */     if ($this.isServer()) {
/*  86 */       $this.writeToNBTForServer(nbt);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Packet getDescriptionPacket(TileEntity $this) {
/*  91 */     NBTTagCompound nbt = new NBTTagCompound();
/*     */ 
/*     */     
/*  94 */     SaveHandler$.MODULE$.savingForClients_$eq(true); try {
/*     */       
/*  96 */       try { $this.writeToNBTForClient(nbt); }
/*  97 */       finally { Exception exception = null; }
/*     */     
/*     */     } finally {
/*     */       
/* 101 */       SaveHandler$.MODULE$.savingForClients_$eq(false);
/*     */     } 
/*     */     return nbt.func_82582_d() ? null : (Packet)new S35PacketUpdateTileEntity($this.x(), $this.y(), $this.z(), -1, nbt);
/*     */   } public static void onDataPacket(TileEntity $this, NetworkManager manager, S35PacketUpdateTileEntity packet) {
/*     */     
/* 106 */     try { $this.readFromNBTForClient(packet.func_148857_g()); }
/* 107 */     finally { Exception exception = null; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\TileEntity$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */