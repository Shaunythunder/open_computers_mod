/*     */ package li.cil.oc.api.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NetworkActivityEvent
/*     */   extends Event
/*     */ {
/*     */   protected World world;
/*     */   protected double x;
/*     */   protected double y;
/*     */   protected double z;
/*     */   protected TileEntity tileEntity;
/*     */   protected NBTTagCompound data;
/*     */   
/*     */   protected NetworkActivityEvent(TileEntity tileEntity, NBTTagCompound data) {
/*  41 */     this.world = tileEntity.func_145831_w();
/*  42 */     this.x = tileEntity.field_145851_c + 0.5D;
/*  43 */     this.y = tileEntity.field_145848_d + 0.5D;
/*  44 */     this.z = tileEntity.field_145849_e + 0.5D;
/*  45 */     this.tileEntity = tileEntity;
/*  46 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected NetworkActivityEvent(World world, double x, double y, double z, NBTTagCompound data) {
/*  59 */     this.world = world;
/*  60 */     this.x = x;
/*  61 */     this.y = y;
/*  62 */     this.z = z;
/*  63 */     this.tileEntity = null;
/*  64 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public World getWorld() {
/*  71 */     return this.world;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getX() {
/*  78 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getY() {
/*  85 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getZ() {
/*  92 */     return this.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity getTileEntity() {
/* 102 */     return this.tileEntity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound getData() {
/* 110 */     return this.data;
/*     */   }
/*     */   
/*     */   public static final class Server extends NetworkActivityEvent {
/*     */     private Node node;
/*     */     
/*     */     public Server(TileEntity tileEntity, Node node) {
/* 117 */       super(tileEntity, new NBTTagCompound());
/* 118 */       this.node = node;
/*     */     }
/*     */     
/*     */     public Server(World world, double x, double y, double z, Node node) {
/* 122 */       super(world, x, y, z, new NBTTagCompound());
/* 123 */       this.node = node;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Node getNode() {
/* 130 */       return this.node;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Client
/*     */     extends NetworkActivityEvent
/*     */   {
/*     */     public Client(TileEntity tileEntity, NBTTagCompound data) {
/* 142 */       super(tileEntity, data);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Client(World world, double x, double y, double z, NBTTagCompound data) {
/* 155 */       super(world, x, y, z, data);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\NetworkActivityEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */