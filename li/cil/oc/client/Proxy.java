/*     */ package li.cil.oc.client;
/*     */ import cpw.mods.fml.client.registry.ClientRegistry;
/*     */ import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
/*     */ import cpw.mods.fml.client.registry.RenderingRegistry;
/*     */ import cpw.mods.fml.common.FMLCommonHandler;
/*     */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*     */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*     */ import li.cil.oc.OpenComputers$;
/*     */ import li.cil.oc.api.API;
/*     */ import li.cil.oc.client.renderer.PetRenderer$;
/*     */ import li.cil.oc.client.renderer.item.ItemRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.AdapterRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.CaseRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.DisassemblerRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.DiskDriveRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.HologramRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.PrinterRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.RaidRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.RobotRenderer$;
/*     */ import li.cil.oc.client.renderer.tileentity.SwitchRenderer$;
/*     */ import li.cil.oc.common.Proxy;
/*     */ import li.cil.oc.common.event.RackMountableRenderHandler$;
/*     */ import li.cil.oc.common.init.Items$;
/*     */ import li.cil.oc.common.tileentity.Hologram;
/*     */ import li.cil.oc.common.tileentity.Relay;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import li.cil.oc.common.tileentity.Screen;
/*     */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*     */ import net.minecraftforge.client.IItemRenderer;
/*     */ import net.minecraftforge.client.MinecraftForgeClient;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001U2Q!\001\002\001\t)\021Q\001\025:pqfT!a\001\003\002\r\rd\027.\0328u\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7C\001\001\f!\taq\"D\001\016\025\tqA!\001\004d_6lwN\\\005\003\0035AQ!\005\001\005\002M\ta\001P5oSRt4\001\001\013\002)A\021Q\003A\007\002\005!)q\003\001C!1\0059\001O]3J]&$HCA\r !\tQR$D\001\034\025\005a\022!B:dC2\f\027B\001\020\034\005\021)f.\033;\t\013\0012\002\031A\021\002\003\025\004\"A\t\027\016\003\rR!\001J\023\002\013\0254XM\034;\013\00591#BA\024)\003\r1W\016\034\006\003S)\nA!\\8eg*\t1&A\002da^L!!L\022\0033\031kE\n\025:f\023:LG/[1mSj\fG/[8o\013Z,g\016\036\005\006_\001!\t\005M\001\005S:LG\017\006\002\032c!)\001E\fa\001eA\021!eM\005\003i\r\022aCR'M\023:LG/[1mSj\fG/[8o\013Z,g\016\036")
/*     */ public class Proxy extends Proxy {
/*     */   public void preInit(FMLPreInitializationEvent e) {
/*  37 */     super.preInit(e);
/*     */     
/*  39 */     API.manual = Manual$.MODULE$;
/*     */     
/*  41 */     CommandHandler$.MODULE$.register();
/*     */     
/*  43 */     MinecraftForge.EVENT_BUS.register(Icons$.MODULE$);
/*     */   }
/*     */   
/*     */   public void init(FMLInitializationEvent e) {
/*  47 */     super.init(e);
/*     */     
/*  49 */     OpenComputers$.MODULE$.channel().register(PacketHandler$.MODULE$);
/*     */     
/*  51 */     Settings$.MODULE$.blockRenderId_$eq(RenderingRegistry.getNextAvailableRenderId());
/*  52 */     RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)BlockRenderer$.MODULE$);
/*  53 */     RenderingRegistry.registerEntityRenderingHandler(Drone.class, (Render)DroneRenderer$.MODULE$);
/*     */     
/*  55 */     ClientRegistry.bindTileEntitySpecialRenderer(Adapter.class, (TileEntitySpecialRenderer)AdapterRenderer$.MODULE$);
/*  56 */     ClientRegistry.bindTileEntitySpecialRenderer(Assembler.class, (TileEntitySpecialRenderer)AssemblerRenderer$.MODULE$);
/*  57 */     ClientRegistry.bindTileEntitySpecialRenderer(Case.class, (TileEntitySpecialRenderer)CaseRenderer$.MODULE$);
/*  58 */     ClientRegistry.bindTileEntitySpecialRenderer(Charger.class, (TileEntitySpecialRenderer)ChargerRenderer$.MODULE$);
/*  59 */     ClientRegistry.bindTileEntitySpecialRenderer(Disassembler.class, (TileEntitySpecialRenderer)DisassemblerRenderer$.MODULE$);
/*  60 */     ClientRegistry.bindTileEntitySpecialRenderer(DiskDrive.class, (TileEntitySpecialRenderer)DiskDriveRenderer$.MODULE$);
/*  61 */     ClientRegistry.bindTileEntitySpecialRenderer(Geolyzer.class, (TileEntitySpecialRenderer)GeolyzerRenderer$.MODULE$);
/*  62 */     if ((GLContext.getCapabilities()).OpenGL15) {
/*  63 */       ClientRegistry.bindTileEntitySpecialRenderer(Hologram.class, (TileEntitySpecialRenderer)HologramRenderer$.MODULE$);
/*     */     } else {
/*  65 */       ClientRegistry.bindTileEntitySpecialRenderer(Hologram.class, (TileEntitySpecialRenderer)HologramRendererFallback$.MODULE$);
/*  66 */     }  ClientRegistry.bindTileEntitySpecialRenderer(Microcontroller.class, (TileEntitySpecialRenderer)MicrocontrollerRenderer$.MODULE$);
/*  67 */     ClientRegistry.bindTileEntitySpecialRenderer(NetSplitter.class, (TileEntitySpecialRenderer)NetSplitterRenderer$.MODULE$);
/*  68 */     ClientRegistry.bindTileEntitySpecialRenderer(PowerDistributor.class, (TileEntitySpecialRenderer)PowerDistributorRenderer$.MODULE$);
/*  69 */     ClientRegistry.bindTileEntitySpecialRenderer(Printer.class, (TileEntitySpecialRenderer)PrinterRenderer$.MODULE$);
/*  70 */     ClientRegistry.bindTileEntitySpecialRenderer(Raid.class, (TileEntitySpecialRenderer)RaidRenderer$.MODULE$);
/*  71 */     ClientRegistry.bindTileEntitySpecialRenderer(Rack.class, (TileEntitySpecialRenderer)RackRenderer$.MODULE$);
/*  72 */     ClientRegistry.bindTileEntitySpecialRenderer(Switch.class, (TileEntitySpecialRenderer)SwitchRenderer$.MODULE$);
/*  73 */     ClientRegistry.bindTileEntitySpecialRenderer(AccessPoint.class, (TileEntitySpecialRenderer)SwitchRenderer$.MODULE$);
/*  74 */     ClientRegistry.bindTileEntitySpecialRenderer(Relay.class, (TileEntitySpecialRenderer)SwitchRenderer$.MODULE$);
/*  75 */     ClientRegistry.bindTileEntitySpecialRenderer(RobotProxy.class, (TileEntitySpecialRenderer)RobotRenderer$.MODULE$);
/*  76 */     ClientRegistry.bindTileEntitySpecialRenderer(Screen.class, (TileEntitySpecialRenderer)ScreenRenderer$.MODULE$);
/*  77 */     ClientRegistry.bindTileEntitySpecialRenderer(Transposer.class, (TileEntitySpecialRenderer)TransposerRenderer$.MODULE$);
/*     */     
/*  79 */     MinecraftForgeClient.registerItemRenderer(Items$.MODULE$.get("floppy").createItemStack(1).func_77973_b(), (IItemRenderer)ItemRenderer$.MODULE$);
/*  80 */     MinecraftForgeClient.registerItemRenderer(Items$.MODULE$.get("cable").createItemStack(1).func_77973_b(), (IItemRenderer)ItemRenderer$.MODULE$);
/*  81 */     MinecraftForgeClient.registerItemRenderer(Items$.MODULE$.get("print").createItemStack(1).func_77973_b(), (IItemRenderer)ItemRenderer$.MODULE$);
/*     */     
/*  83 */     ClientRegistry.registerKeyBinding(KeyBindings$.MODULE$.materialCosts());
/*  84 */     ClientRegistry.registerKeyBinding(KeyBindings$.MODULE$.clipboardPaste());
/*     */     
/*  86 */     MinecraftForge.EVENT_BUS.register(HighlightRenderer$.MODULE$);
/*  87 */     MinecraftForge.EVENT_BUS.register(NanomachinesHandler$Client$.MODULE$);
/*  88 */     MinecraftForge.EVENT_BUS.register(PetRenderer$.MODULE$);
/*  89 */     MinecraftForge.EVENT_BUS.register(RackMountableRenderHandler$.MODULE$);
/*  90 */     MinecraftForge.EVENT_BUS.register(Sound$.MODULE$);
/*  91 */     MinecraftForge.EVENT_BUS.register(TextBuffer$.MODULE$);
/*  92 */     MinecraftForge.EVENT_BUS.register(MFUTargetRenderer$.MODULE$);
/*  93 */     MinecraftForge.EVENT_BUS.register(WirelessNetworkDebugRenderer$.MODULE$);
/*     */     
/*  95 */     NetworkRegistry.INSTANCE.registerGuiHandler(OpenComputers$.MODULE$, (IGuiHandler)GuiHandler$.MODULE$);
/*     */     
/*  97 */     FMLCommonHandler.instance().bus().register(Audio$.MODULE$);
/*  98 */     FMLCommonHandler.instance().bus().register(HologramRenderer$.MODULE$);
/*  99 */     FMLCommonHandler.instance().bus().register(PetRenderer$.MODULE$);
/* 100 */     FMLCommonHandler.instance().bus().register(Sound$.MODULE$);
/* 101 */     FMLCommonHandler.instance().bus().register(TextBufferRenderCache$.MODULE$);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */