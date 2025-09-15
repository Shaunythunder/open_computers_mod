/*     */ package li.cil.oc.integration.computercraft;
/*     */ import dan200.computercraft.ComputerCraft;
/*     */ import dan200.computercraft.api.filesystem.IMount;
/*     */ import dan200.computercraft.api.filesystem.IWritableMount;
/*     */ import dan200.computercraft.api.lua.ILuaContext;
/*     */ import dan200.computercraft.api.lua.ILuaTask;
/*     */ import dan200.computercraft.api.lua.LuaException;
/*     */ import dan200.computercraft.api.peripheral.IComputerAccess;
/*     */ import dan200.computercraft.api.peripheral.IPeripheral;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import li.cil.oc.OpenComputers;
/*     */ import li.cil.oc.Settings;
/*     */ import li.cil.oc.api.FileSystem;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.driver.SidedBlock;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.BlacklistedPeripheral;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.ManagedPeripheral;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*     */ import li.cil.oc.util.Reflection;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public final class DriverPeripheral implements SidedBlock {
/*     */   private boolean isBlacklisted(Object o) {
/*  34 */     if (o instanceof BlacklistedPeripheral) {
/*  35 */       return ((BlacklistedPeripheral)o).isPeripheralBlacklisted();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  40 */     if (blacklist == null) {
/*  41 */       blacklist = new HashSet<>();
/*  42 */       for (String name : Settings.get().peripheralBlacklist()) {
/*  43 */         Class<?> clazz = Reflection.getClass(name);
/*  44 */         if (clazz != null) {
/*  45 */           blacklist.add(clazz);
/*     */         }
/*     */       } 
/*     */     } 
/*  49 */     for (Class<?> clazz : blacklist) {
/*  50 */       if (clazz.isInstance(o)) return true; 
/*     */     } 
/*  52 */     return false;
/*     */   }
/*     */   private static Set<Class<?>> blacklist;
/*     */   
/*     */   private IPeripheral findPeripheral(World world, int x, int y, int z, ForgeDirection side) {
/*     */     try {
/*  58 */       IPeripheral p = ComputerCraft.getPeripheralAt(world, x, y, z, side.ordinal());
/*  59 */       if (!isBlacklisted(p)) {
/*  60 */         return p;
/*     */       }
/*  62 */     } catch (Exception e) {
/*  63 */       OpenComputers.log()
/*  64 */         .warn(String.format("Error accessing ComputerCraft peripheral @ (%d, %d, %d).", new Object[] { Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(z) }), e);
/*     */     } 
/*  66 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) {
/*  71 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  72 */     return (tileEntity != null && 
/*     */ 
/*     */       
/*  75 */       !li.cil.oc.api.network.Environment.class.isAssignableFrom(tileEntity.getClass()) && 
/*     */ 
/*     */       
/*  78 */       !isBlacklisted(tileEntity) && 
/*     */       
/*  80 */       findPeripheral(world, x, y, z, side) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  86 */     return (ManagedEnvironment)new Environment(findPeripheral(world, x, y, z, side));
/*     */   }
/*     */   
/*     */   public static class Environment
/*     */     extends ManagedEnvironment
/*     */     implements ManagedPeripheral
/*     */   {
/*     */     protected final IPeripheral peripheral;
/*     */     protected final CallableHelper helper;
/*  95 */     protected final Map<String, FakeComputerAccess> accesses = new HashMap<>();
/*     */     
/*     */     public Environment(IPeripheral peripheral) {
/*  98 */       this.peripheral = peripheral;
/*  99 */       this.helper = new CallableHelper(peripheral.getMethodNames());
/* 100 */       setNode(Network.newNode((li.cil.oc.api.network.Environment)this, Visibility.Network).create());
/*     */     }
/*     */ 
/*     */     
/*     */     public String[] methods() {
/* 105 */       return this.peripheral.getMethodNames();
/*     */     }
/*     */     
/*     */     public Object[] invoke(String method, Context context, Arguments args) throws Exception {
/*     */       FakeComputerAccess access;
/* 110 */       int index = this.helper.methodIndex(method);
/* 111 */       Object[] argArray = this.helper.convertArguments(args);
/*     */       
/* 113 */       if (this.accesses.containsKey(context.node().address())) {
/* 114 */         access = this.accesses.get(context.node().address());
/*     */       }
/*     */       else {
/*     */         
/* 118 */         access = new FakeComputerAccess(this, context);
/*     */       } 
/* 120 */       return this.peripheral.callMethod(access, UnsupportedLuaContext.instance(), index, argArray);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onConnect(Node node) {
/* 125 */       super.onConnect(node);
/* 126 */       if (node.host() instanceof Context && !this.accesses.containsKey(node.address())) {
/* 127 */         FakeComputerAccess access = new FakeComputerAccess(this, (Context)node.host());
/* 128 */         this.accesses.put(node.address(), access);
/* 129 */         this.peripheral.attach(access);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void onDisconnect(Node node) {
/* 135 */       super.onDisconnect(node);
/* 136 */       if (node.host() instanceof Context) {
/* 137 */         FakeComputerAccess access = this.accesses.remove(node.address());
/* 138 */         if (access != null) {
/* 139 */           this.peripheral.detach(access);
/*     */         }
/* 141 */       } else if (node == node()) {
/* 142 */         for (FakeComputerAccess access : this.accesses.values()) {
/* 143 */           this.peripheral.detach(access);
/* 144 */           access.close();
/*     */         } 
/* 146 */         this.accesses.clear();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public static class FakeComputerAccess
/*     */       implements IComputerAccess
/*     */     {
/*     */       protected final DriverPeripheral.Environment owner;
/*     */       protected final Context context;
/* 156 */       protected final Map<String, ManagedEnvironment> fileSystems = new HashMap<>();
/*     */       
/*     */       public FakeComputerAccess(DriverPeripheral.Environment owner, Context context) {
/* 159 */         this.owner = owner;
/* 160 */         this.context = context;
/*     */       }
/*     */       
/*     */       public void close() {
/* 164 */         for (ManagedEnvironment fileSystem : this.fileSystems.values()) {
/* 165 */           fileSystem.node().remove();
/*     */         }
/* 167 */         this.fileSystems.clear();
/*     */       }
/*     */ 
/*     */       
/*     */       public String mount(String desiredLocation, IMount mount) {
/* 172 */         if (this.fileSystems.containsKey(desiredLocation)) {
/* 173 */           return null;
/*     */         }
/* 175 */         return mount(desiredLocation, FileSystem.asManagedEnvironment(FileSystem.fromComputerCraft(mount)));
/*     */       }
/*     */ 
/*     */       
/*     */       public String mount(String desiredLocation, IMount mount, String driveName) {
/* 180 */         if (this.fileSystems.containsKey(desiredLocation)) {
/* 181 */           return null;
/*     */         }
/* 183 */         return mount(desiredLocation, 
/*     */             
/* 185 */             FileSystem.asManagedEnvironment(FileSystem.fromComputerCraft(mount), driveName));
/*     */       }
/*     */ 
/*     */       
/*     */       public String mountWritable(String desiredLocation, IWritableMount mount) {
/* 190 */         if (this.fileSystems.containsKey(desiredLocation)) {
/* 191 */           return null;
/*     */         }
/* 193 */         return mount(desiredLocation, FileSystem.asManagedEnvironment(FileSystem.fromComputerCraft(mount)));
/*     */       }
/*     */ 
/*     */       
/*     */       public String mountWritable(String desiredLocation, IWritableMount mount, String driveName) {
/* 198 */         if (this.fileSystems.containsKey(desiredLocation)) {
/* 199 */           return null;
/*     */         }
/* 201 */         return mount(desiredLocation, 
/*     */             
/* 203 */             FileSystem.asManagedEnvironment(FileSystem.fromComputerCraft(mount), driveName));
/*     */       }
/*     */       
/*     */       private String mount(String path, ManagedEnvironment fileSystem) {
/* 207 */         this.fileSystems.put(path, fileSystem);
/*     */ 
/*     */         
/* 210 */         this.context.node().connect(fileSystem.node());
/* 211 */         return path;
/*     */       }
/*     */ 
/*     */       
/*     */       public void unmount(String location) {
/* 216 */         ManagedEnvironment fileSystem = this.fileSystems.remove(location);
/* 217 */         if (fileSystem != null) {
/* 218 */           fileSystem.node().remove();
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public int getID() {
/* 224 */         return this.context.node().address().hashCode();
/*     */       }
/*     */ 
/*     */       
/*     */       public void queueEvent(String event, Object[] arguments) {
/* 229 */         this.context.signal(event, arguments);
/*     */       }
/*     */ 
/*     */       
/*     */       public String getAttachmentName() {
/* 234 */         return this.owner.node().address();
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class UnsupportedLuaContext
/*     */       implements ILuaContext
/*     */     {
/* 243 */       protected static final UnsupportedLuaContext Instance = new UnsupportedLuaContext();
/*     */ 
/*     */ 
/*     */       
/*     */       public static UnsupportedLuaContext instance() {
/* 248 */         return Instance;
/*     */       }
/*     */ 
/*     */       
/*     */       public long issueMainThreadTask(ILuaTask task) throws LuaException {
/* 253 */         throw new UnsupportedOperationException();
/*     */       }
/*     */ 
/*     */       
/*     */       public Object[] executeMainThreadTask(ILuaTask task) throws LuaException, InterruptedException {
/* 258 */         throw new UnsupportedOperationException();
/*     */       }
/*     */ 
/*     */       
/*     */       public Object[] pullEvent(String filter) throws LuaException, InterruptedException {
/* 263 */         throw new UnsupportedOperationException();
/*     */       }
/*     */ 
/*     */       
/*     */       public Object[] pullEventRaw(String filter) throws InterruptedException {
/* 268 */         throw new UnsupportedOperationException();
/*     */       }
/*     */ 
/*     */       
/*     */       public Object[] yield(Object[] arguments) throws InterruptedException {
/* 273 */         throw new UnsupportedOperationException();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\DriverPeripheral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */