/*     */ package li.cil.oc.api.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.Cancelable;
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
/*     */ 
/*     */ 
/*     */ @Cancelable
/*     */ public class FileSystemAccessEvent
/*     */   extends Event
/*     */ {
/*     */   protected String sound;
/*     */   protected World world;
/*     */   protected double x;
/*     */   protected double y;
/*     */   protected double z;
/*     */   protected TileEntity tileEntity;
/*     */   protected NBTTagCompound data;
/*     */   
/*     */   protected FileSystemAccessEvent(String sound, TileEntity tileEntity, NBTTagCompound data) {
/*  46 */     this.sound = sound;
/*  47 */     this.world = tileEntity.func_145831_w();
/*  48 */     this.x = tileEntity.field_145851_c + 0.5D;
/*  49 */     this.y = tileEntity.field_145848_d + 0.5D;
/*  50 */     this.z = tileEntity.field_145849_e + 0.5D;
/*  51 */     this.tileEntity = tileEntity;
/*  52 */     this.data = data;
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
/*     */   
/*     */   protected FileSystemAccessEvent(String sound, World world, double x, double y, double z, NBTTagCompound data) {
/*  66 */     this.sound = sound;
/*  67 */     this.world = world;
/*  68 */     this.x = x;
/*  69 */     this.y = y;
/*  70 */     this.z = z;
/*  71 */     this.tileEntity = null;
/*  72 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSound() {
/*  79 */     return this.sound;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public World getWorld() {
/*  86 */     return this.world;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getX() {
/*  93 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getY() {
/* 100 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double getZ() {
/* 107 */     return this.z;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity getTileEntity() {
/* 117 */     return this.tileEntity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound getData() {
/* 125 */     return this.data;
/*     */   }
/*     */   
/*     */   public static final class Server extends FileSystemAccessEvent {
/*     */     private Node node;
/*     */     
/*     */     public Server(String sound, TileEntity tileEntity, Node node) {
/* 132 */       super(sound, tileEntity, new NBTTagCompound());
/* 133 */       this.node = node;
/*     */     }
/*     */     
/*     */     public Server(String sound, World world, double x, double y, double z, Node node) {
/* 137 */       super(sound, world, x, y, z, new NBTTagCompound());
/* 138 */       this.node = node;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Node getNode() {
/* 145 */       return this.node;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Client
/*     */     extends FileSystemAccessEvent
/*     */   {
/*     */     public Client(String sound, TileEntity tileEntity, NBTTagCompound data) {
/* 158 */       super(sound, tileEntity, data);
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
/*     */     
/*     */     public Client(String sound, World world, double x, double y, double z, NBTTagCompound data) {
/* 172 */       super(sound, world, x, y, z, data);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\FileSystemAccessEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */