/*     */ package li.cil.oc.integration.waila;
/*     */ 
/*     */ import java.util.List;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.tileentity.AccessPoint;
/*     */ import li.cil.oc.common.tileentity.Assembler;
/*     */ import mcp.mobius.waila.api.IWailaConfigHandler;
/*     */ import mcp.mobius.waila.api.IWailaDataAccessor;
/*     */ import mcp.mobius.waila.api.IWailaRegistrar;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class BlockDataProvider$ implements IWailaDataProvider {
/*     */   public static final BlockDataProvider$ MODULE$;
/*     */   private final String ConfigAddress;
/*     */   private final String ConfigEnergy;
/*     */   private final String ConfigComponentName;
/*     */   
/*  28 */   private BlockDataProvider$() { MODULE$ = this;
/*  29 */     this.ConfigAddress = "oc.address";
/*  30 */     this.ConfigEnergy = "oc.energy";
/*  31 */     this.ConfigComponentName = "oc.componentName"; } public String ConfigAddress() { return this.ConfigAddress; } public String ConfigEnergy() { return this.ConfigEnergy; } public String ConfigComponentName() { return this.ConfigComponentName; }
/*     */   
/*     */   public void init(IWailaRegistrar registrar) {
/*  34 */     registrar.registerBodyProvider(this, SimpleBlock.class);
/*     */     
/*  36 */     registrar.registerNBTProvider(this, Environment.class);
/*  37 */     registrar.registerNBTProvider(this, SidedEnvironment.class);
/*     */     
/*  39 */     registrar.addConfig("OpenComputers", ConfigAddress());
/*  40 */     registrar.addConfig("OpenComputers", ConfigEnergy());
/*  41 */     registrar.addConfig("OpenComputers", ConfigComponentName());
/*     */   }
/*     */   public final NBTTagCompound li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(Node node, NBTTagCompound tag, TileEntity tileEntity$1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 171
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface reachability : ()Lli/cil/oc/api/network/Visibility;
/*     */     //   10: getstatic li/cil/oc/api/network/Visibility.None : Lli/cil/oc/api/network/Visibility;
/*     */     //   13: astore #4
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 28
/*     */     //   19: pop
/*     */     //   20: aload #4
/*     */     //   22: ifnull -> 171
/*     */     //   25: goto -> 36
/*     */     //   28: aload #4
/*     */     //   30: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   33: ifne -> 171
/*     */     //   36: aload_3
/*     */     //   37: instanceof li/cil/oc/common/tileentity/traits/NotAnalyzable
/*     */     //   40: ifne -> 171
/*     */     //   43: aload_1
/*     */     //   44: invokeinterface address : ()Ljava/lang/String;
/*     */     //   49: ifnull -> 65
/*     */     //   52: aload_2
/*     */     //   53: ldc_w 'address'
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface address : ()Ljava/lang/String;
/*     */     //   62: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   65: aload_1
/*     */     //   66: astore #5
/*     */     //   68: aload #5
/*     */     //   70: instanceof li/cil/oc/api/network/Connector
/*     */     //   73: ifeq -> 121
/*     */     //   76: aload #5
/*     */     //   78: checkcast li/cil/oc/api/network/Connector
/*     */     //   81: astore #6
/*     */     //   83: aload_2
/*     */     //   84: ldc_w 'buffer'
/*     */     //   87: aload #6
/*     */     //   89: invokeinterface localBuffer : ()D
/*     */     //   94: d2i
/*     */     //   95: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   98: aload_2
/*     */     //   99: ldc_w 'bufferSize'
/*     */     //   102: aload #6
/*     */     //   104: invokeinterface localBufferSize : ()D
/*     */     //   109: d2i
/*     */     //   110: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   113: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   116: astore #7
/*     */     //   118: goto -> 126
/*     */     //   121: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   124: astore #7
/*     */     //   126: aload_1
/*     */     //   127: astore #8
/*     */     //   129: aload #8
/*     */     //   131: instanceof li/cil/oc/api/network/Component
/*     */     //   134: ifeq -> 166
/*     */     //   137: aload #8
/*     */     //   139: checkcast li/cil/oc/api/network/Component
/*     */     //   142: astore #9
/*     */     //   144: aload_2
/*     */     //   145: ldc_w 'componentName'
/*     */     //   148: aload #9
/*     */     //   150: invokeinterface name : ()Ljava/lang/String;
/*     */     //   155: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   158: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   161: astore #10
/*     */     //   163: goto -> 171
/*     */     //   166: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   169: astore #10
/*     */     //   171: aload_2
/*     */     //   172: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 0
/*     */     //   #47	-> 43
/*     */     //   #48	-> 52
/*     */     //   #50	-> 65
/*     */     //   #51	-> 68
/*     */     //   #52	-> 83
/*     */     //   #53	-> 98
/*     */     //   #51	-> 116
/*     */     //   #54	-> 121
/*     */     //   #56	-> 126
/*     */     //   #57	-> 129
/*     */     //   #58	-> 144
/*     */     //   #59	-> 166
/*     */     //   #62	-> 171
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	173	0	this	Lli/cil/oc/integration/waila/BlockDataProvider$;
/*     */     //   0	173	1	node	Lli/cil/oc/api/network/Node;
/*     */     //   0	173	2	tag	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   0	173	3	tileEntity$1	Lnet/minecraft/tileentity/TileEntity;
/*     */   } public final class BlockDataProvider$$anonfun$getNBTData$1 extends AbstractFunction1<ForgeDirection, Node> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final Node apply(ForgeDirection x$1) {
/*     */       return ((SidedEnvironment)this.x2$1).sidedNode(x$1);
/*     */     } public BlockDataProvider$$anonfun$getNBTData$1(TileEntity x2$1) {} } public final class BlockDataProvider$$anonfun$getNBTData$2 extends AbstractFunction1<Node, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TileEntity tileEntity$1; public final NBTTagCompound apply(Node x$1) {
/*     */       return BlockDataProvider$.MODULE$.li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(x$1, new NBTTagCompound(), this.tileEntity$1);
/*     */     } public BlockDataProvider$$anonfun$getNBTData$2(TileEntity tileEntity$1) {} } private final void ignoreSidedness$1(Node node, TileEntity tileEntity$1, NBTTagCompound tag$1) {
/*     */     tag$1.func_82580_o("nodes");
/*     */     NBTTagCompound nodeTag = li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(node, new NBTTagCompound(), tileEntity$1);
/*     */     li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(tag$1).setNewTagList("nodes", (Iterable)scala.Predef$.MODULE$.wrapRefArray((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new BlockDataProvider$$anonfun$ignoreSidedness$1$1(nodeTag), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(NBTTagCompound.class)))));
/*     */   } public final class BlockDataProvider$$anonfun$ignoreSidedness$1$1 extends AbstractFunction1<ForgeDirection, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound nodeTag$1; public final NBTTagCompound apply(ForgeDirection x$2) {
/*     */       return this.nodeTag$1;
/*     */     } public BlockDataProvider$$anonfun$ignoreSidedness$1$1(NBTTagCompound nodeTag$1) {} }
/*     */   public final class BlockDataProvider$$anonfun$getNBTData$3 extends AbstractFunction1<Component, String> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final String apply(Component x$3) {
/*     */       return x$3.address();
/*     */     } }
/*     */   public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity tileEntity, NBTTagCompound tag, World world, int x, int y, int z) { BoxedUnit boxedUnit1, boxedUnit2;
/*  65 */     TileEntity tileEntity1 = tileEntity;
/*  66 */     if (tileEntity1 instanceof SidedEnvironment) { TileEntity tileEntity3 = tileEntity1;
/*  67 */       NBTTagCompound nBTTagCompound = li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(tag).setNewTagList("nodes", 
/*     */           
/*  69 */           (Iterable)scala.Predef$.MODULE$.wrapRefArray((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new BlockDataProvider$$anonfun$getNBTData$1(tileEntity3), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Node.class)))).map((Function1)new BlockDataProvider$$anonfun$getNBTData$2(tileEntity), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(NBTTagCompound.class))))); }
/*  70 */     else if (tileEntity1 instanceof Environment) { TileEntity tileEntity3 = tileEntity1;
/*  71 */       NBTTagCompound nBTTagCompound = li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(((Environment)tileEntity3).node(), tag, tileEntity); }
/*  72 */     else { boxedUnit1 = BoxedUnit.UNIT; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     TileEntity tileEntity2 = tileEntity;
/*  83 */     if (tileEntity2 instanceof AccessPoint) { AccessPoint accessPoint = (AccessPoint)tileEntity2;
/*  84 */       tag.func_74780_a("signalStrength", accessPoint.strength());
/*  85 */       NBTTagCompound nBTTagCompound = li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(tag).setNewTagList("addresses", li.cil.oc.util.ExtendedNBT$.MODULE$.stringIterableToNbt((Iterable)scala.Predef$.MODULE$.refArrayOps((Object[])accessPoint.componentNodes()).map((Function1)new BlockDataProvider$$anonfun$getNBTData$3(), scala.Array$.MODULE$.fallbackCanBuildFrom(scala.Predef$DummyImplicit$.MODULE$.dummyImplicit())))); }
/*  86 */     else if (tileEntity2 instanceof Assembler) { Assembler assembler = (Assembler)tileEntity2;
/*  87 */       ignoreSidedness$1((Node)assembler.node(), tileEntity, tag);
/*     */       
/*  89 */       tag.func_74780_a("progress", assembler.progress());
/*  90 */       tag.func_74768_a("timeRemaining", assembler.timeRemaining());
/*  91 */       Option option = assembler.output();
/*  92 */       if (option instanceof Some) { Some some = (Some)option; ItemStack output = (ItemStack)some.x(); tag.func_74778_a("output", output.func_77977_a()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  93 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */       boxedUnit2 = assembler.isAssembling() ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*  96 */     else if (tileEntity2 instanceof Charger) { Charger charger = (Charger)tileEntity2;
/*  97 */       tag.func_74780_a("chargeSpeed", charger.chargeSpeed()); boxedUnit2 = BoxedUnit.UNIT; }
/*  98 */     else if (tileEntity2 instanceof DiskDrive) { DiskDrive diskDrive = (DiskDrive)tileEntity2;
/*     */       
/* 100 */       tag.func_82580_o("address");
/* 101 */       diskDrive.filesystemNode().foreach((Function1)new BlockDataProvider$$anonfun$getNBTData$4(tileEntity, tag)); boxedUnit2 = BoxedUnit.UNIT; }
/* 102 */     else if (tileEntity2 instanceof Hologram) { Hologram hologram = (Hologram)tileEntity2; ignoreSidedness$1((Node)hologram.node(), tileEntity, tag); boxedUnit2 = BoxedUnit.UNIT; }
/* 103 */     else if (tileEntity2 instanceof Keyboard) { Keyboard keyboard = (Keyboard)tileEntity2; ignoreSidedness$1(keyboard.node(), tileEntity, tag); boxedUnit2 = BoxedUnit.UNIT; }
/* 104 */     else if (tileEntity2 instanceof Screen) { Screen screen = (Screen)tileEntity2; ignoreSidedness$1(screen.node(), tileEntity, tag); boxedUnit2 = BoxedUnit.UNIT; }
/* 105 */     else if (tileEntity2 instanceof li.cil.oc.common.tileentity.Rack)
/* 106 */     { tag.func_82580_o("nodes"); boxedUnit2 = BoxedUnit.UNIT; }
/*     */     
/*     */     else
/*     */     
/* 110 */     { boxedUnit2 = BoxedUnit.UNIT; }
/*     */ 
/*     */     
/* 113 */     return tag; }
/*     */   public final class BlockDataProvider$$anonfun$getNBTData$4 extends AbstractFunction1<Node, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TileEntity tileEntity$1; private final NBTTagCompound tag$1; public final NBTTagCompound apply(Node x$4) { return BlockDataProvider$.MODULE$.li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(x$4, this.tag$1, this.tileEntity$1); } public BlockDataProvider$$anonfun$getNBTData$4(TileEntity tileEntity$1, NBTTagCompound tag$1) {} } public List<String> getWailaBody(ItemStack stack, List<String> tooltip, IWailaDataAccessor accessor, IWailaConfigHandler config) { BoxedUnit boxedUnit;
/*     */     Object object;
/* 117 */     NBTTagCompound tag = accessor.getNBTData();
/* 118 */     if (tag == null || tag.func_82582_d()) return tooltip;
/*     */     
/* 120 */     TileEntity tileEntity1 = accessor.getTileEntity();
/* 121 */     if (tileEntity1 instanceof AccessPoint)
/* 122 */     { String address = tag.func_150295_c("addresses", 8).func_150307_f(accessor.getSide().ordinal());
/* 123 */       double signalStrength = tag.func_74769_h("signalStrength");
/* 124 */       config.getConfig(ConfigAddress()) ? 
/* 125 */         BoxesRunTime.boxToBoolean(tooltip.add(li.cil.oc.Localization$Analyzer$.MODULE$.Address(address).func_150260_c())) : BoxedUnit.UNIT;
/*     */       
/* 127 */       Boolean bool = BoxesRunTime.boxToBoolean(tooltip.add(li.cil.oc.Localization$Analyzer$.MODULE$.WirelessStrength(signalStrength).func_150260_c())); }
/* 128 */     else if (tileEntity1 instanceof Assembler)
/*     */     
/* 130 */     { double progress = tag.func_74769_h("progress");
/* 131 */       String timeRemaining = formatTime(tag.func_74762_e("timeRemaining"));
/* 132 */       tooltip.add(li.cil.oc.Localization$Assembler$.MODULE$.Progress(progress, timeRemaining));
/*     */       
/* 134 */       String output = tag.func_74779_i("output");
/* 135 */       boxedUnit = (BoxedUnit)(tag.func_74764_b("progress") ? (tag.func_74764_b("output") ? BoxesRunTime.boxToBoolean(tooltip.add((new StringBuilder()).append("Building: ").append(li.cil.oc.Localization$.MODULE$.localizeImmediately(output)).toString())) : BoxedUnit.UNIT) : BoxedUnit.UNIT);
/*     */        }
/*     */     
/* 138 */     else if (tileEntity1 instanceof Charger)
/* 139 */     { double chargeSpeed = tag.func_74769_h("chargeSpeed");
/* 140 */       Boolean bool = BoxesRunTime.boxToBoolean(tooltip.add(li.cil.oc.Localization$Analyzer$.MODULE$.ChargerSpeed(chargeSpeed).func_150260_c())); }
/* 141 */     else if (tileEntity1 instanceof li.cil.oc.common.tileentity.Rack) { boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */ 
/*     */       
/* 152 */       boxedUnit = BoxedUnit.UNIT; }
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
/* 177 */     TileEntity tileEntity2 = accessor.getTileEntity();
/* 178 */     if (tileEntity2 instanceof SidedEnvironment)
/* 179 */     { object = readNode$1(tag.func_150295_c("nodes", 10).func_150305_b(accessor.getSide().ordinal()), tooltip, config); }
/* 180 */     else if (tileEntity2 instanceof Environment)
/* 181 */     { object = readNode$1(tag, tooltip, config); }
/* 182 */     else { object = BoxedUnit.UNIT; }
/*     */ 
/*     */     
/* 185 */     return tooltip; } private final Object readNode$1(NBTTagCompound tag, List<String> tooltip$1, IWailaConfigHandler config$1) { String address = tag.func_74779_i("address"); (config$1.getConfig(ConfigAddress()) && tag.func_74764_b("address")) ? ((new StringOps(scala.Predef$.MODULE$.augmentString(address))).nonEmpty() ? BoxesRunTime.boxToBoolean(tooltip$1.add(li.cil.oc.Localization$Analyzer$.MODULE$.Address(address).func_150260_c())) : BoxedUnit.UNIT) : BoxedUnit.UNIT; int buffer = tag.func_74762_e("buffer"); int bufferSize = tag.func_74762_e("bufferSize"); (new String[3])[0] = ""; (new String[3])[1] = "/"; (new String[3])[2] = ""; (config$1.getConfig(ConfigEnergy()) && tag.func_74764_b("buffer") && tag.func_74764_b("bufferSize")) ? ((bufferSize > 0) ? BoxesRunTime.boxToBoolean(tooltip$1.add(li.cil.oc.Localization$Analyzer$.MODULE$.StoredEnergy((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(buffer), BoxesRunTime.boxToInteger(bufferSize) }))).func_150260_c())) : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */     String componentName = tag.func_74779_i("componentName");
/*     */     return (config$1.getConfig(ConfigComponentName()) && tag.func_74764_b("componentName")) ? ((new StringOps(scala.Predef$.MODULE$.augmentString(componentName))).nonEmpty() ? BoxesRunTime.boxToBoolean(tooltip$1.add(li.cil.oc.Localization$Analyzer$.MODULE$.ComponentName(componentName).func_150260_c())) : BoxedUnit.UNIT) : BoxedUnit.UNIT; }
/* 188 */   public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) { return accessor.getStack(); }
/*     */    public List<String> getWailaHead(ItemStack stack, List<String> tooltip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
/* 190 */     return tooltip;
/*     */   } public List<String> getWailaTail(ItemStack stack, List<String> tooltip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
/* 192 */     return tooltip;
/*     */   }
/*     */   
/*     */   private String formatTime(int seconds) {
/* 196 */     int arg$macro$10 = seconds;
/* 197 */     Object arg$macro$11 = BoxesRunTime.boxToInteger(seconds / 60); int arg$macro$12 = seconds % 60; return (seconds < 60) ? (new StringOps("0:%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$10) })) : (new StringOps("%s:%02d")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { arg$macro$11, BoxesRunTime.boxToInteger(arg$macro$12) }));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\waila\BlockDataProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */