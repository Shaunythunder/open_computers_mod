/*    */ package li.cil.oc.common.init;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import li.cil.oc.common.block.Case;
/*    */ import li.cil.oc.common.block.Screen;
/*    */ import li.cil.oc.common.tileentity.Cable;
/*    */ import li.cil.oc.common.tileentity.Raid;
/*    */ import net.minecraft.block.Block;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class Blocks$ {
/*    */   public void init() {
/* 13 */     GameRegistry.registerTileEntity(AccessPoint.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("access_point").toString());
/* 14 */     GameRegistry.registerTileEntity(Adapter.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("adapter").toString());
/* 15 */     GameRegistry.registerTileEntityWithAlternatives(Assembler.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("assembler").toString(), new String[] { (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("robotAssembler").toString() });
/* 16 */     GameRegistry.registerTileEntity(Cable.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("cable").toString());
/* 17 */     GameRegistry.registerTileEntity(Capacitor.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("capacitor").toString());
/* 18 */     GameRegistry.registerTileEntity(CarpetedCapacitor.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("carpetedCapacitor").toString());
/* 19 */     GameRegistry.registerTileEntity(Case.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("case").toString());
/* 20 */     GameRegistry.registerTileEntity(Charger.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("charger").toString());
/* 21 */     GameRegistry.registerTileEntity(DiskDrive.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("disk_drive").toString());
/* 22 */     GameRegistry.registerTileEntity(Disassembler.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("disassembler").toString());
/* 23 */     GameRegistry.registerTileEntity(Keyboard.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("keyboard").toString());
/* 24 */     GameRegistry.registerTileEntity(Hologram.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hologram").toString());
/* 25 */     GameRegistry.registerTileEntity(Geolyzer.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("geolyzer").toString());
/* 26 */     GameRegistry.registerTileEntity(Microcontroller.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("microcontroller").toString());
/* 27 */     GameRegistry.registerTileEntity(MotionSensor.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("motion_sensor").toString());
/* 28 */     GameRegistry.registerTileEntity(NetSplitter.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("netSplitter").toString());
/* 29 */     GameRegistry.registerTileEntity(PowerConverter.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("power_converter").toString());
/* 30 */     GameRegistry.registerTileEntity(PowerDistributor.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("power_distributor").toString());
/* 31 */     GameRegistry.registerTileEntity(Print.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("print").toString());
/* 32 */     GameRegistry.registerTileEntity(Printer.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("printer").toString());
/* 33 */     GameRegistry.registerTileEntity(Raid.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("raid").toString());
/* 34 */     GameRegistry.registerTileEntity(Redstone.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("redstone").toString());
/* 35 */     GameRegistry.registerTileEntity(Relay.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("relay").toString());
/* 36 */     GameRegistry.registerTileEntity(RobotProxy.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("robot").toString());
/* 37 */     GameRegistry.registerTileEntity(Switch.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("switch").toString());
/* 38 */     GameRegistry.registerTileEntity(Screen.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("screen").toString());
/* 39 */     GameRegistry.registerTileEntityWithAlternatives(Rack.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("rack").toString(), new String[] { (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("serverRack").toString() });
/* 40 */     GameRegistry.registerTileEntity(Transposer.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("transposer").toString());
/* 41 */     GameRegistry.registerTileEntity(Waypoint.class, (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("waypoint").toString());
/*    */     
/* 43 */     Items$.MODULE$.registerBlock(new AccessPoint(), "accessPoint");
/* 44 */     (new String[1])[0] = "oc:adapter"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Adapter(), "adapter", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 45 */     (new String[1])[0] = "oc:assembler"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Assembler(), "assembler", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 46 */     (new String[1])[0] = "oc:cable"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Cable(scala.reflect.ClassTag$.MODULE$.apply(Cable.class)), "cable", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 47 */     (new String[1])[0] = "oc:capacitor"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Capacitor(), "capacitor", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 48 */     (new String[1])[0] = "oc:case1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Case(0), "case1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 49 */     (new String[1])[0] = "oc:case3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Case(2), "case3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 50 */     (new String[1])[0] = "oc:case2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Case(1), "case2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 51 */     (new String[1])[0] = "oc:charger"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Charger(), "charger", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 52 */     (new String[1])[0] = "oc:disassembler"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Disassembler(), "disassembler", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 53 */     (new String[1])[0] = "oc:diskDrive"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new DiskDrive(), "diskDrive", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 54 */     (new String[1])[0] = "oc:geolyzer"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Geolyzer(), "geolyzer", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 55 */     (new String[1])[0] = "oc:hologram1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Hologram(0), "hologram1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 56 */     (new String[1])[0] = "oc:hologram2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Hologram(1), "hologram2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 57 */     (new String[1])[0] = "oc:keyboard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Keyboard(), "keyboard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 58 */     (new String[1])[0] = "oc:motionSensor"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new MotionSensor(), "motionSensor", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 59 */     (new String[1])[0] = "oc:powerConverter"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new PowerConverter(), "powerConverter", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 60 */     (new String[1])[0] = "oc:powerDistributor"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new PowerDistributor(), "powerDistributor", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 61 */     (new String[1])[0] = "oc:raid"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Raid(scala.reflect.ClassTag$.MODULE$.apply(Raid.class)), "raid", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 62 */     (new String[1])[0] = "oc:redstone"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Redstone(), "redstone", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 63 */     (new String[1])[0] = "oc:relay"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Relay(), "relay", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 64 */     (new String[1])[0] = "oc:screen1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Screen(0), "screen1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 65 */     (new String[1])[0] = "oc:screen3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Screen(2), "screen3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 66 */     (new String[1])[0] = "oc:screen2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Screen(1), "screen2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 67 */     (new String[2])[0] = "oc:rack"; (new String[2])[1] = "oc:serverRack"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Rack(), "rack", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]));
/* 68 */     Items$.MODULE$.registerBlock(new Switch(), "switch");
/*    */     
/* 70 */     Items$.MODULE$.registerBlock(new Case(3), "caseCreative");
/* 71 */     Items$.MODULE$.registerBlock(new Microcontroller(scala.reflect.ClassTag$.MODULE$.apply(Microcontroller.class)), "microcontroller");
/* 72 */     Items$.MODULE$.registerBlock(new RobotAfterimage(), "robotAfterimage");
/* 73 */     Items$.MODULE$.registerBlock(new RobotProxy(), "robot");
/*    */ 
/*    */     
/* 76 */     Items$.MODULE$.registerBlock(new Print(scala.reflect.ClassTag$.MODULE$.apply(Print.class)), "print");
/* 77 */     (new String[1])[0] = "oc:printer"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Printer(), "printer", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 78 */     (new String[1])[0] = "oc:chameliumBlock"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new ChameliumBlock(), "chameliumBlock", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 79 */     (new String[1])[0] = "oc:waypoint"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Waypoint(), "waypoint", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */ 
/*    */     
/* 82 */     (new String[1])[0] = "oc:stoneEndstone"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new FakeEndstone(), "endstone", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */ 
/*    */     
/* 85 */     (new String[1])[0] = "oc:netSplitter"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new NetSplitter(), "netSplitter", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */ 
/*    */     
/* 88 */     (new String[1])[0] = "oc:transposer"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new Transposer(), "transposer", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */ 
/*    */     
/* 91 */     (new String[1])[0] = "oc:carpetedCapacitor"; li.cil.oc.common.recipe.Recipes$.MODULE$.addBlock((Block)new CarpetedCapacitor(), "carpetedCapacitor", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */   } public static final Blocks$ MODULE$; private Blocks$() {
/* 93 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\init\Blocks$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */