/*     */ package li.cil.oc.client;
/*     */ import cpw.mods.fml.client.FMLClientHandler;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.util.Timer;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.audio.SoundCategory;
/*     */ import net.minecraft.client.audio.SoundManager;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.client.event.sound.SoundLoadEvent;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.PriorityQueue;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class Sound$ {
/*     */   public static final Sound$ MODULE$;
/*     */   private final Map<TileEntity, Sound.PseudoLoopingStream> li$cil$oc$client$Sound$$sources;
/*     */   private final PriorityQueue<Sound.Command> li$cil$oc$client$Sound$$commandQueue;
/*     */   private float li$cil$oc$client$Sound$$lastVolume;
/*     */   
/*     */   public Map<TileEntity, Sound.PseudoLoopingStream> li$cil$oc$client$Sound$$sources() {
/*  33 */     return this.li$cil$oc$client$Sound$$sources;
/*     */   } private final Timer updateTimer; private Option<Function0<BoxedUnit>> li$cil$oc$client$Sound$$updateCallable; private SoundManager manager; private boolean hasPreloaded; public PriorityQueue<Sound.Command> li$cil$oc$client$Sound$$commandQueue() {
/*  35 */     return this.li$cil$oc$client$Sound$$commandQueue;
/*     */   }
/*  37 */   public float li$cil$oc$client$Sound$$lastVolume() { return this.li$cil$oc$client$Sound$$lastVolume; } private void li$cil$oc$client$Sound$$lastVolume_$eq(float x$1) { this.li$cil$oc$client$Sound$$lastVolume = x$1; }
/*     */    private Timer updateTimer() {
/*  39 */     return this.updateTimer;
/*     */   }
/*     */   
/*     */   public final class Sound$$anon$1 extends TimerTask {
/*  43 */     public void run() { synchronized (Sound$.MODULE$.li$cil$oc$client$Sound$$sources()) { Sound$.MODULE$.li$cil$oc$client$Sound$$updateCallable_$eq((Option<Function0<BoxedUnit>>)new Some(new Sound$$anon$1$$anonfun$run$1(this))); return; }  } public final class Sound$$anon$1$$anonfun$run$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } public Sound$$anon$1$$anonfun$run$1(Sound$$anon$1 $outer) {} public void apply$mcV$sp() {
/*  44 */         Sound$.MODULE$.li$cil$oc$client$Sound$$updateVolume();
/*  45 */         Sound$.MODULE$.li$cil$oc$client$Sound$$processQueue();
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   private Option<Function0<BoxedUnit>> li$cil$oc$client$Sound$$updateCallable() {
/*  51 */     return this.li$cil$oc$client$Sound$$updateCallable; } public void li$cil$oc$client$Sound$$updateCallable_$eq(Option<Function0<BoxedUnit>> x$1) { this.li$cil$oc$client$Sound$$updateCallable = x$1; }
/*     */ 
/*     */   
/*  54 */   public SoundManager manager() { return this.manager; } public void manager_$eq(SoundManager x$1) { this.manager = x$1; }
/*     */    public SoundManager.SoundSystemStarterThread soundSystem() {
/*  56 */     return (manager() == null) ? null : (manager()).field_148620_e;
/*     */   }
/*     */   
/*  59 */   public void li$cil$oc$client$Sound$$updateVolume() { float volume = 
/*  60 */       isGamePaused() ? 0.0F : 
/*  61 */       (FMLClientHandler.instance().getClient()).field_71474_y.func_151438_a(SoundCategory.BLOCKS);
/*  62 */     if (volume != li$cil$oc$client$Sound$$lastVolume()) {
/*  63 */       li$cil$oc$client$Sound$$lastVolume_$eq(volume);
/*  64 */       synchronized (li$cil$oc$client$Sound$$sources())
/*  65 */       { li$cil$oc$client$Sound$$sources().values().foreach((Function1)new Sound$$anonfun$li$cil$oc$client$Sound$$updateVolume$1()); return; } 
/*  66 */     }  } public final class Sound$$anonfun$li$cil$oc$client$Sound$$updateVolume$1 extends AbstractFunction1<Sound.PseudoLoopingStream, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Sound.PseudoLoopingStream sound) { sound.updateVolume(); }
/*     */      }
/*     */ 
/*     */   
/*     */   private boolean isGamePaused()
/*     */   {
/*  72 */     if (MinecraftServer.func_71276_C() != null && !MinecraftServer.func_71276_C().func_71262_S()) { boolean bool; MinecraftServer minecraftServer = MinecraftServer.func_71276_C();
/*  73 */       if (minecraftServer instanceof net.minecraft.server.integrated.IntegratedServer) { bool = Minecraft.func_71410_x().func_147113_T(); }
/*  74 */       else { bool = false; }
/*     */       
/*     */       if (bool); }
/*     */     
/*  78 */     return false; } public void li$cil$oc$client$Sound$$processQueue() { if (li$cil$oc$client$Sound$$commandQueue().nonEmpty())
/*  79 */       synchronized (li$cil$oc$client$Sound$$commandQueue())
/*  80 */       { while (li$cil$oc$client$Sound$$commandQueue().nonEmpty() && ((Sound.Command)li$cil$oc$client$Sound$$commandQueue().head()).when() < System.currentTimeMillis())
/*  81 */           liftedTree1$1();  return; }   } private final void liftedTree1$1() { try { ((Sound.Command)li$cil$oc$client$Sound$$commandQueue().dequeue()).apply(); }
/*  82 */     finally { Exception exception = null; }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   public float startLoop$default$3()
/*     */   {
/*  89 */     return 1.0F; } public long startLoop$default$4() { return 0L; } public void startLoop(TileEntity tileEntity, String name, float volume, long delay) {
/*  90 */     if (li.cil.oc.Settings$.MODULE$.get().soundVolume() > false)
/*  91 */       synchronized (li$cil$oc$client$Sound$$commandQueue()) {
/*  92 */         li$cil$oc$client$Sound$$commandQueue().$plus$eq(new Sound.StartCommand(System.currentTimeMillis() + delay, tileEntity, name, volume));
/*     */         return;
/*     */       }  
/*     */   }
/*     */   
/*     */   public void stopLoop(TileEntity tileEntity) {
/*  98 */     if (li.cil.oc.Settings$.MODULE$.get().soundVolume() > false)
/*  99 */       synchronized (li$cil$oc$client$Sound$$commandQueue()) {
/* 100 */         li$cil$oc$client$Sound$$commandQueue().$plus$eq(new Sound.StopCommand(tileEntity));
/*     */         return;
/*     */       }  
/*     */   }
/*     */   
/*     */   public void updatePosition(TileEntity tileEntity) {
/* 106 */     if (li.cil.oc.Settings$.MODULE$.get().soundVolume() > false)
/* 107 */       synchronized (li$cil$oc$client$Sound$$commandQueue()) {
/* 108 */         li$cil$oc$client$Sound$$commandQueue().$plus$eq(new Sound.UpdatePositionCommand(tileEntity));
/*     */         return;
/*     */       }  
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onSoundLoad(SoundLoadEvent event) {
/* 115 */     manager_$eq(event.manager);
/*     */   }
/*     */   
/* 118 */   private boolean hasPreloaded() { return this.hasPreloaded; } private void hasPreloaded_$eq(boolean x$1) { this.hasPreloaded = x$1; }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/* 122 */   public void onTick(TickEvent.ClientTickEvent e) { if (soundSystem() != null) {
/*     */       
/* 124 */       hasPreloaded_$eq(true);
/* 125 */       hasPreloaded() ? BoxedUnit.UNIT : new Thread(new Sound$$anon$2());
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
/* 145 */       synchronized (li$cil$oc$client$Sound$$sources()) {
/* 146 */         li$cil$oc$client$Sound$$updateCallable().foreach((Function1)new Sound$$anonfun$onTick$1());
/* 147 */         li$cil$oc$client$Sound$$updateCallable_$eq((Option<Function0<BoxedUnit>>)scala.None$.MODULE$);
/*     */         return;
/*     */       } 
/*     */     }  }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onWorldUnload(WorldEvent.Unload event) {
/* 154 */     synchronized (li$cil$oc$client$Sound$$commandQueue()) { li$cil$oc$client$Sound$$commandQueue().clear();
/* 155 */       synchronized (li$cil$oc$client$Sound$$sources()) { liftedTree2$1();
/*     */ 
/*     */         
/* 158 */         li$cil$oc$client$Sound$$sources().clear();
/*     */         return; }
/*     */        }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Sound$$anon$2
/*     */     implements Runnable
/*     */   {
/*     */     public void run() {
/*     */       ResourceLocation preloadConfigLocation = new ResourceLocation(li.cil.oc.Settings$.MODULE$.resourceDomain(), "sounds/preload.cfg");
/*     */       IResource preloadConfigResource = Minecraft.func_71410_x().func_110442_L().func_110536_a(preloadConfigLocation);
/*     */       scala.io.Source$.MODULE$.fromInputStream(preloadConfigResource.func_110527_b(), scala.io.Codec$.MODULE$.charset2codec(Charsets.UTF_8)).getLines().foreach((Function1)new Sound$$anon$2$$anonfun$run$2(this));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final class Sound$$anon$2$$anonfun$run$2
/*     */       extends AbstractFunction1<String, BoxedUnit>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */       
/*     */       public Sound$$anon$2$$anonfun$run$2(Sound$$anon$2 $outer) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public final void apply(String location) {
/*     */         URL url = this.$outer.getClass().getClassLoader().getResource(location);
/*     */         if (url == null) {
/*     */           (new String[2])[0] = "Couldn't preload sound ";
/*     */           (new String[2])[1] = "!";
/*     */           li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { location })));
/*     */         } else {
/*     */           try {
/*     */             String sourceName = (new StringBuilder()).append("preload_").append(location).toString();
/*     */             Sound$.MODULE$.soundSystem().newSource(false, sourceName, url, location, true, 0.0F, 0.0F, 0.0F, 0, 16.0F);
/*     */             Sound$.MODULE$.soundSystem().activate(sourceName);
/*     */             Sound$.MODULE$.soundSystem().removeSource(sourceName);
/*     */           } finally {}
/*     */         } 
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Sound$$anonfun$onTick$1
/*     */     extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final void apply(Function0 x$1) {
/*     */       x$1.apply$mcV$sp();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private final void liftedTree2$1() {
/*     */     try {
/*     */       li$cil$oc$client$Sound$$sources().foreach((Function1)new Sound$$anonfun$liftedTree2$1$1());
/*     */     } finally {}
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Sound$$anonfun$liftedTree2$1$1
/*     */     extends AbstractFunction1<Tuple2<TileEntity, Sound.PseudoLoopingStream>, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final void apply(Tuple2 x$2) {
/*     */       ((Sound.PseudoLoopingStream)x$2._2()).stop();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public URL li$cil$oc$client$Sound$$toUrl(ResourceLocation resource) {
/* 242 */     (new String[3])[0] = "mcsounddomain:"; (new String[3])[1] = ":"; (new String[3])[2] = ""; String name = (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { resource.func_110624_b(), resource.func_110623_a() })); try {  }
/* 243 */     catch (MalformedURLException malformedURLException) {}
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
/* 254 */     return null;
/*     */   }
/*     */   private Sound$() {
/* 257 */     MODULE$ = this;
/*     */     this.li$cil$oc$client$Sound$$sources = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     this.li$cil$oc$client$Sound$$commandQueue = (PriorityQueue<Sound.Command>)scala.collection.mutable.PriorityQueue$.MODULE$.empty(scala.math.Ordering$.MODULE$.ordered((Function1)scala.Predef$.MODULE$.$conforms()));
/*     */     this.li$cil$oc$client$Sound$$lastVolume = (FMLClientHandler.instance().getClient()).field_71474_y.func_151438_a(SoundCategory.BLOCKS);
/*     */     this.updateTimer = new Timer("OpenComputers-SoundUpdater", true);
/*     */     if (li.cil.oc.Settings$.MODULE$.get().soundVolume() > false)
/*     */       updateTimer().scheduleAtFixedRate(new Sound$$anon$1(), 500L, 50L); 
/*     */     this.li$cil$oc$client$Sound$$updateCallable = (Option<Function0<BoxedUnit>>)scala.None$.MODULE$;
/*     */     this.hasPreloaded = (li.cil.oc.Settings$.MODULE$.get().soundVolume() <= false);
/*     */   }
/*     */   
/*     */   public final class Sound$$anon$3 extends URLStreamHandler {
/*     */     public final ResourceLocation resource$1;
/*     */     
/*     */     public Sound$$anon$3(ResourceLocation resource$1) {}
/*     */     
/*     */     public URLConnection openConnection(URL url) {
/*     */       return new Sound$$anon$3$$anon$4(this, url);
/*     */     }
/*     */     
/*     */     public final class Sound$$anon$3$$anon$4 extends URLConnection {
/*     */       public Sound$$anon$3$$anon$4(Sound$$anon$3 $outer, URL url$1) {
/*     */         super(url$1);
/*     */       }
/*     */       
/*     */       public void connect() {}
/*     */       
/*     */       public InputStream getInputStream() {
/*     */         return Minecraft.func_71410_x().func_110442_L().func_110536_a(this.$outer.resource$1).func_110527_b();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\Sound$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */