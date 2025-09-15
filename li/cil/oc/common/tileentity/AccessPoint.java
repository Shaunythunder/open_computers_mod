/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.common.tileentity.traits.power.AppliedEnergistics2;
/*     */ import li.cil.oc.common.tileentity.traits.power.Factorization;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Classic;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Experimental;
/*     */ import li.cil.oc.common.tileentity.traits.power.RotaryCraft;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t=a\001B\001\003\0015\0211\"Q2dKN\034\bk\\5oi*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\t\001q!C\007\t\003\037Ai\021AA\005\003#\t\021aaU<ji\016D\007CA\n\031\033\005!\"BA\013\027\003\035qW\r^<pe.T!a\006\004\002\007\005\004\030.\003\002\032)\t\001r+\033:fY\026\0348/\0228ea>Lg\016\036\t\0037yi\021\001\b\006\003;\t\ta\001\036:bSR\034\030BA\020\035\0055\001vn^3s\003\016\034W\r\035;pe\")\021\005\001C\001E\0051A(\0338jiz\"\022a\t\t\003\037\001Aq!\n\001A\002\023\005a%\001\005tiJ,gn\032;i+\0059\003C\001\025,\033\005I#\"\001\026\002\013M\034\027\r\\1\n\0051J#A\002#pk\ndW\rC\004/\001\001\007I\021A\030\002\031M$(/\0328hi\"|F%Z9\025\005A\032\004C\001\0252\023\t\021\024F\001\003V]&$\bb\002\033.\003\003\005\raJ\001\004q\022\n\004B\002\034\001A\003&q%A\005tiJ,gn\032;iA!9\001\b\001a\001\n\003I\024AC5t%\026\004X-\031;feV\t!\b\005\002)w%\021A(\013\002\b\005>|G.Z1o\021\035q\004\0011A\005\002}\na\"[:SKB,\027\r^3s?\022*\027\017\006\0021\001\"9A'PA\001\002\004Q\004B\002\"\001A\003&!(A\006jgJ+\007/Z1uKJ\004\003b\002#\001\005\004%\t!R\001\017G>l\007o\0348f]Rtu\016Z3t+\0051\005c\001\025H\023&\021\001*\013\002\006\003J\024\030-\037\t\003')K!a\023\013\003\023\r{W\016]8oK:$\bBB'\001A\003%a)A\bd_6\004xN\\3oi:{G-Z:!\021\025y\005\001\"\021:\003EI7oV5sK2,7o]#oC\ndW\r\032\005\006#\002!\tFU\001\rQ\006\0348i\0348oK\016$xN\035\013\003uMCQ\001\026)A\002U\013Aa]5eKB\021aKX\007\002/*\021\001,W\001\005kRLGN\003\002\0065*\0211\fX\001\017[&tWm\031:bMR4wN]4f\025\005i\026a\0018fi&\021ql\026\002\017\r>\024x-\032#je\026\034G/[8oQ\021\001\026-\0348\021\005\t\\W\"A2\013\005\021,\027A\003:fY\006,hn\0315fe*\021amZ\001\004M6d'B\0015j\003\021iw\016Z:\013\003)\f1a\0319x\023\ta7M\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005y\027B\0019r\003\031\031E*S#O)*\021!oY\001\005'&$W\rC\003u\001\021ES/A\005d_:tWm\031;peR\021a\017 \t\004Q]L\030B\001=*\005\031y\005\017^5p]B\0211C_\005\003wR\021\021bQ8o]\026\034Go\034:\t\013Q\033\b\031A+\t\013y\004A\021\t\024\002!\025tWM]4z)\"\024x.^4iaV$\bbBA\001\001\021\005\0231A\001\n_:\fe.\0317zu\026$B\"!\002\002\016\005\r\0221FA\033\003s\001B\001K$\002\bA\0311#!\003\n\007\005-AC\001\003O_\022,\007bBA\b\002\007\021\021C\001\007a2\f\0270\032:\021\t\005M\021qD\007\003\003+QA!a\004\002\030)!\021\021DA\016\003\031)g\016^5us*\031\021Q\004/\002\0235Lg.Z2sC\032$\030\002BA\021\003+\021A\"\0228uSRL\b\013\\1zKJDa\001V@A\002\005\025\002c\001\025\002(%\031\021\021F\025\003\007%sG\017C\004\002.}\004\r!a\f\002\t!LG\017\027\t\004Q\005E\022bAA\032S\t)a\t\\8bi\"9\021qG@A\002\005=\022\001\0025jifCq!a\017\000\001\004\ty#\001\003iSRT\006bBA \001\021\005\021\021I\001\fO\026$8\013\036:f]\036$\b\016\006\004\002D\005-\0231\f\t\005Q\035\013)\005E\002)\003\017J1!!\023*\005\031\te.\037*fM\"A\021QJA\037\001\004\ty%A\004d_:$X\r\037;\021\t\005E\023qK\007\003\003'R1!!\026\027\003\035i\027m\0315j]\026LA!!\027\002T\t91i\0348uKb$\b\002CA/\003{\001\r!a\030\002\t\005\024xm\035\t\005\003#\n\t'\003\003\002d\005M#!C!sOVlWM\034;tQ1\ti$a\032\002n\005=\024\021OA:!\021\t\t&!\033\n\t\005-\0241\013\002\t\007\006dGNY1dW\0061A-\033:fGRL\022!A\001\004I>\034\027EAA;\003E3WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043/[4oC2\0043\017\036:f]\036$\b\016\t\025sC:<W-\013\021vg\026$\007e\0365f]\002\022X\r\\1zS:<\007%\\3tg\006<Wm\035\030\t\017\005e\004\001\"\001\002|\005Y1/\032;TiJ,gn\032;i)\031\t\031%! \002\000!A\021QJA<\001\004\ty\005\003\005\002^\005]\004\031AA0Q!\t9(a\032\002r\005\r\025EAAC\003\0014WO\\2uS>t\007f\035;sK:<G\017\033\036ok6\024WM]\025;]Vl'-\032:![5\0023+\032;!i\",\007e]5h]\006d\007e\035;sK:<G\017\033\021)e\006tw-Z\025!kN,G\rI<iK:\004#/\0327bs&tw\rI7fgN\fw-Z:/\021\031A\004\001\"\001\002\nR1\0211IAF\003\033C\001\"!\024\002\b\002\007\021q\n\005\t\003;\n9\t1\001\002`!b\021qQA4\003[\ny'!\035\002\022\006\022\0211S\001MVt7\r^5p]\"J#HY8pY\026\fg\016I\027.A\035+G\017I<iKRDWM\035\021uQ\026\004\023mY2fgN\004\003o\\5oi\002\032WO\035:f]Rd\027\020I1diN\004\023m\035\021bAI,\007/Z1uKJ\004\003F]3tK:$\007E]3dK&4X\r\032\021xSJ,G.Z:tAA\f7m[3ug\002:\030N]3mKN\034H._\025/\021\035\t9\n\001C\001\0033\0131b]3u%\026\004X-\031;feR1\0211IAN\003;C\001\"!\024\002\026\002\007\021q\n\005\t\003;\n)\n1\001\002`!B\021QSA4\003c\n\t+\t\002\002$\006Yf-\0368di&|g\016K3oC\ndW\r\032\036c_>dW-\0318*u\t|w\016\\3b]\002jS\006I*fi\002:\b.\032;iKJ\004C\017[3!C\016\034Wm]:!a>Lg\016\036\021tQ>,H\016\032\021bGR\004\023m\035\021bAI,\007/Z1uKJt\003bBAT\001\021\005\023\021V\001\016e\026\034W-\033<f!\006\0347.\032;\025\013A\nY+!.\t\021\0055\026Q\025a\001\003_\013a\001]1dW\026$\bcA\n\0022&\031\0211\027\013\003\rA\0137m[3u\021\035\t9,!*A\002I\taa]8ve\016,\007bBA^\001\021E\023QX\001\fe\026d\027-\037)bG.,G\017F\0031\003\013)\r\003\005\002B\006e\006\031AAb\003)\031x.\036:dKNKG-\032\t\004Q],\006\002CAW\003s\003\r!a,\t\017\005%\007\001\"\025\002L\006Q1M]3bi\026tu\016Z3\025\007e\fi\r\003\005\002P\006\035\007\031AAi\003\021\001H.^4\021\t\005M\027Q[\007\002\001%!\021q[Am\005\021\001F.^4\n\007\005mGDA\002Ik\nDq!a8\001\t#\n\t/A\007p]BcWoZ\"p]:,7\r\036\013\006a\005\r\030Q\035\005\t\003\037\fi\0161\001\002R\"A\021q]Ao\001\004\t9!\001\003o_\022,\007bBAv\001\021E\023Q^\001\021_:\004F.^4ESN\034wN\0348fGR$R\001MAx\003cD\001\"a4\002j\002\007\021\021\033\005\t\003O\fI\0171\001\002\b!9\021Q\037\001\005B\005]\030\001\006:fC\0224%o\\7O\005R3uN]*feZ,'\017F\0021\003sD\001\"a?\002t\002\007\021Q`\001\004]\n$\b\003BA\000\005\007i!A!\001\013\t\005m\0301D\005\005\005\013\021\tA\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\t%\001\001\"\021\003\f\005\031rO]5uKR{gJ\021+G_J\034VM\035<feR\031\001G!\004\t\021\005m(q\001a\001\003{\004")
/*     */ public class AccessPoint extends Switch implements WirelessEndpoint, PowerAcceptor {
/*     */   private double strength;
/*     */   private boolean isRepeater;
/*     */   private final Component[] componentNodes;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque;
/*     */   private long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power;
/*     */   
/*  22 */   public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; } private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; private boolean addedToIC2PowerGrid; @Method(modid = "factorization") private final Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge; private Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; private volatile boolean bitmap$0; public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque = x$1; } public long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(long x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha = x$1; } public void func_145845_h() { RotaryCraft.class.updateEntity((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getOmega() { return RotaryCraft.class.getOmega((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getTorque() { return RotaryCraft.class.getTorque((RotaryCraft)this); } @Method(modid = "RotaryCraft") public long getPower() { return RotaryCraft.class.getPower((RotaryCraft)this); } @Method(modid = "RotaryCraft") public String getName() { return RotaryCraft.class.getName((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getIORenderAlpha() { return RotaryCraft.class.getIORenderAlpha((RotaryCraft)this); } @Method(modid = "RotaryCraft") public void setIORenderAlpha(int value) { RotaryCraft.class.setIORenderAlpha((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setOmega(int value) { RotaryCraft.class.setOmega((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setTorque(int value) { RotaryCraft.class.setTorque((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setPower(long value) { RotaryCraft.class.setPower((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void noInputMachine() { RotaryCraft.class.noInputMachine((RotaryCraft)this); } @Method(modid = "RotaryCraft") public boolean canReadFrom(ForgeDirection forgeDirection) { return RotaryCraft.class.canReadFrom((RotaryCraft)this, forgeDirection); } @Method(modid = "RotaryCraft") public boolean isReceiving() { return RotaryCraft.class.isReceiving((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getMinTorque(int available) { return RotaryCraft.class.getMinTorque((RotaryCraft)this, available); } @Method(modid = "CoFHAPI|energy") public boolean canConnectEnergy(ForgeDirection from) { return RedstoneFlux.class.canConnectEnergy((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) { return RedstoneFlux.class.receiveEnergy((RedstoneFlux)this, from, maxReceive, simulate); } @Method(modid = "CoFHAPI|energy") public int getEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int getMaxEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getMaxEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) { return RedstoneFlux.class.extractEnergy((RedstoneFlux)this, from, maxExtract, simulate); } @Method(modid = "Mekanism") public boolean canReceiveEnergy(ForgeDirection side) { return Mekanism.class.canReceiveEnergy((Mekanism)this, side); } @Method(modid = "Mekanism") public double transferEnergyToAcceptor(ForgeDirection side, double amount) { return Mekanism.class.transferEnergyToAcceptor((Mekanism)this, side, amount); } @Method(modid = "Mekanism") public double getMaxEnergy() { return Mekanism.class.getMaxEnergy((Mekanism)this); } @Method(modid = "Mekanism") public double getEnergy() { return Mekanism.class.getEnergy((Mekanism)this); } @Method(modid = "Mekanism") public void setEnergy(double energy) { Mekanism.class.setEnergy((Mekanism)this, energy); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer = x$1; } public void func_145829_t() { IndustrialCraft2Classic.class.validate((IndustrialCraft2Classic)this); } public void func_145843_s() { IndustrialCraft2Classic.class.invalidate((IndustrialCraft2Classic)this); } public void onChunkUnload() { IndustrialCraft2Classic.class.onChunkUnload((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean isAddedToEnergyNet() { return IndustrialCraft2Classic.class.isAddedToEnergyNet((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public int getMaxSafeInput() { return IndustrialCraft2Classic.class.getMaxSafeInput((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) { return IndustrialCraft2Classic.class.acceptsEnergyFrom((IndustrialCraft2Classic)this, emitter, direction); } @Method(modid = "IC2-Classic") public boolean injectEnergy(Direction directionFrom, int amount) { return IndustrialCraft2Classic.class.injectEnergy((IndustrialCraft2Classic)this, directionFrom, amount); } @Method(modid = "IC2-Classic") public int demandsEnergy() { return IndustrialCraft2Classic.class.demandsEnergy((IndustrialCraft2Classic)this); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer = x$1; } @Method(modid = "IC2") public int getSinkTier() { return IndustrialCraft2Experimental.class.getSinkTier((IndustrialCraft2Experimental)this); } @Method(modid = "IC2") public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) { return IndustrialCraft2Experimental.class.acceptsEnergyFrom((IndustrialCraft2Experimental)this, emitter, direction); } @Method(modid = "IC2") public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) { return IndustrialCraft2Experimental.class.injectEnergy((IndustrialCraft2Experimental)this, directionFrom, amount, voltage); } @Method(modid = "IC2") public double getDemandedEnergy() { return IndustrialCraft2Experimental.class.getDemandedEnergy((IndustrialCraft2Experimental)this); } public boolean addedToIC2PowerGrid() { return this.addedToIC2PowerGrid; } public void addedToIC2PowerGrid_$eq(boolean x$1) { this.addedToIC2PowerGrid = x$1; } @Method(modid = "Galacticraft API") public boolean nodeAvailable(EnergySource from) { return Galacticraft.class.nodeAvailable((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float receiveEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.receiveEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public float getEnergyStoredGC(EnergySource from) { return Galacticraft.class.getEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float getMaxEnergyStoredGC(EnergySource from) { return Galacticraft.class.getMaxEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float extractEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.extractEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public boolean canConnect(ForgeDirection from, NetworkType networkType) { return Galacticraft.class.canConnect((Galacticraft)this, from, networkType); } private Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge = Factorization.class.li$cil$oc$common$tileentity$traits$power$Factorization$$charge((Factorization)this); this.bitmap$0 = true; }  return this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; }  } public Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge() { return this.bitmap$0 ? this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge : li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute(); } @Method(modid = "factorization") public Charge getCharge() { return Factorization.class.getCharge((Factorization)this); } @Method(modid = "factorization") public String getInfo() { return Factorization.class.getInfo((Factorization)this); } @Method(modid = "factorization") public Coord getCoord() { return Factorization.class.getCoord((Factorization)this); } public Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node() { return this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; } public void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> x$1) { this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node = x$1; } @Method(modid = "appliedenergistics2") public IGridNode getGridNode(ForgeDirection side) { return AppliedEnergistics2.class.getGridNode((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public AECableType getCableConnectionType(ForgeDirection side) { return AppliedEnergistics2.class.getCableConnectionType((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public void securityBreak() { AppliedEnergistics2.class.securityBreak((AppliedEnergistics2)this); } public void tryAllSides(Function2 provider, Function1 fromOther, Function1 toOther) { Common.class.tryAllSides((Common)this, provider, fromOther, toOther); } public boolean canConnectPower(ForgeDirection side) { return Common.class.canConnectPower((Common)this, side); } public double tryChangeBuffer(ForgeDirection side, double amount, boolean doReceive) { return Common.class.tryChangeBuffer((Common)this, side, amount, doReceive); } public double globalBuffer(ForgeDirection side) { return Common.class.globalBuffer((Common)this, side); } public double globalBufferSize(ForgeDirection side) { return Common.class.globalBufferSize((Common)this, side); } public double globalDemand(ForgeDirection side) { return Common.class.globalDemand((Common)this, side); } public boolean tryChangeBuffer$default$3() { return Common.class.tryChangeBuffer$default$3((Common)this); } public AccessPoint() { Common.class.$init$((Common)this); AppliedEnergistics2.class.$init$((AppliedEnergistics2)this); Factorization.class.$init$((Factorization)this); Galacticraft.class.$init$((Galacticraft)this); IndustrialCraft2Common.class.$init$((IndustrialCraft2Common)this); IndustrialCraft2Experimental.class.$init$((IndustrialCraft2Experimental)this); IndustrialCraft2Classic.class.$init$((IndustrialCraft2Classic)this); Mekanism.class.$init$((Mekanism)this); RedstoneFlux.class.$init$((RedstoneFlux)this); RotaryCraft.class.$init$((RotaryCraft)this);
/*  23 */     this.strength = Settings$.MODULE$.get().maxWirelessRange()[1];
/*     */     
/*  25 */     this.isRepeater = true;
/*     */     
/*  27 */     this.componentNodes = (Component[])Array$.MODULE$.fill(6, 
/*     */         
/*  29 */         (Function0)new AccessPoint$$anonfun$3(this), ClassTag$.MODULE$.apply(Component.class)); } public double strength() { return this.strength; } public void strength_$eq(double x$1) { this.strength = x$1; } public boolean isRepeater() { return this.isRepeater; } public void isRepeater_$eq(boolean x$1) { this.isRepeater = x$1; } public Component[] componentNodes() { return this.componentNodes; } public final class AccessPoint$$anonfun$3 extends AbstractFunction0<Component> implements Serializable { public static final long serialVersionUID = 0L; public final Component apply() { return (Component)Network.newNode((Environment)this.$outer, Visibility.Network).withComponent("access_point").create(); }
/*     */      public AccessPoint$$anonfun$3(AccessPoint $outer) {} } public boolean isWirelessEnabled() {
/*  31 */     return true;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean hasConnector(ForgeDirection side) {
/*  36 */     return true;
/*     */   } public Option<Connector> connector(ForgeDirection side) { None$ none$;
/*  38 */     Node node = sidedNode(side);
/*  39 */     if (node instanceof Connector) { Connector connector = (Connector)node; Option option = Option$.MODULE$.apply(connector); }
/*  40 */     else { none$ = None$.MODULE$; }
/*     */     
/*     */     return (Option<Connector>)none$; } public double energyThroughput() {
/*  43 */     return Settings$.MODULE$.get().accessPointRate();
/*     */   }
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*  48 */     player.func_145747_a((IChatComponent)Localization$Analyzer$.MODULE$.WirelessStrength(strength()));
/*  49 */     (new Node[1])[0] = (Node)componentNodes()[side]; return new Node[1];
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- Get the signal strength (range) used when relaying messages.")
/*     */   public synchronized Object[] getStrength(Context context, Arguments args) {
/*  55 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) }));
/*     */   }
/*     */   @Callback(doc = "function(strength:number):number -- Set the signal strength (range) used when relaying messages.")
/*     */   public synchronized Object[] setStrength(Context context, Arguments args) {
/*  59 */     strength_$eq(package$.MODULE$.max(args.checkDouble(0), package$.MODULE$.min(0.0D, Settings$.MODULE$.get().maxWirelessRange()[1])));
/*  60 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():boolean -- Get whether the access point currently acts as a repeater (resend received wireless packets wirelessly).")
/*     */   public synchronized Object[] isRepeater(Context context, Arguments args) {
/*  64 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isRepeater()) }));
/*     */   }
/*     */   @Callback(doc = "function(enabled:boolean):boolean -- Set whether the access point should act as a repeater.")
/*     */   public synchronized Object[] setRepeater(Context context, Arguments args) {
/*  68 */     isRepeater_$eq(args.checkBoolean(0));
/*  69 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isRepeater()) }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void receivePacket(Packet packet, WirelessEndpoint source) {
/*  75 */     tryEnqueuePacket((Option<ForgeDirection>)None$.MODULE$, packet);
/*  76 */     if (Mods$.MODULE$.ComputerCraft().isAvailable()) {
/*  77 */       Option option = Predef$.MODULE$.refArrayOps(packet.data()).headOption();
/*  78 */       if (option instanceof Some) { Some some = (Some)option; Object answerPort = some.x(); if (answerPort instanceof Double) { Double double_ = (Double)answerPort; queueMessage(packet.source(), packet.destination(), packet.port(), (int)Predef$.MODULE$.Double2double(double_), (Object[])Predef$.MODULE$.refArrayOps(packet.data()).drop(1)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/*  79 */        queueMessage(packet.source(), packet.destination(), packet.port(), -1, packet.data()); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void relayPacket(Option<ForgeDirection> sourceSide, Packet packet)
/*     */   {
/*  85 */     super.relayPacket(sourceSide, packet);
/*  86 */     if (strength() > false && (sourceSide.isDefined() || isRepeater()))
/*  87 */     { AccessPoint$$anonfun$2 accessPoint$$anonfun$22; double cost = Settings$.MODULE$.get().wirelessCostPerRange()[1];
/*  88 */       Option<ForgeDirection> option = sourceSide;
/*  89 */       if (option instanceof Some) { Some some = (Some)option; ForgeDirection side = (ForgeDirection)some.x();
/*  90 */         AccessPoint$$anonfun$1 accessPoint$$anonfun$1 = new AccessPoint$$anonfun$1(this, side); }
/*     */       else
/*  92 */       { accessPoint$$anonfun$22 = new AccessPoint$$anonfun$2(this); }
/*     */        AccessPoint$$anonfun$2 accessPoint$$anonfun$21 = accessPoint$$anonfun$22;
/*  94 */       if (accessPoint$$anonfun$21.apply$mcZD$sp(-strength() * cost))
/*  95 */         Network.sendWirelessPacket(this, strength(), packet);  } 
/*     */   } public final class AccessPoint$$anonfun$1 extends AbstractFunction1.mcZD.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection side$1; public final boolean apply(double amount) { return apply$mcZD$sp(amount); } public boolean apply$mcZD$sp(double amount) { return ((Connector)this.$outer.plugs()[this.side$1.ordinal()].node()).tryChangeBuffer(amount); } public AccessPoint$$anonfun$1(AccessPoint $outer, ForgeDirection side$1) {} } public final class AccessPoint$$anonfun$2 extends AbstractFunction1.mcZD.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(double amount) { return apply$mcZD$sp(amount); } public boolean apply$mcZD$sp(double amount) { return Predef$.MODULE$.refArrayOps((Object[])this.$outer.plugs()).exists((Function1)new AccessPoint$$anonfun$2$$anonfun$apply$mcZD$sp$1(this, amount)); } public AccessPoint$$anonfun$2(AccessPoint $outer) {} public final class AccessPoint$$anonfun$2$$anonfun$apply$mcZD$sp$1 extends AbstractFunction1<Hub.Plug, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final double amount$1;
/*     */       public final boolean apply(Hub.Plug x$1) { return ((Connector)x$1.node()).tryChangeBuffer(this.amount$1); }
/*     */       public AccessPoint$$anonfun$2$$anonfun$apply$mcZD$sp$1(AccessPoint$$anonfun$2 $outer, double amount$1) {} } }
/* 102 */   public Connector createNode(Hub.Plug plug) { return (Connector)Network.newNode((Environment)plug, Visibility.Network)
/* 103 */       .withConnector(package$.MODULE$.round(Settings$.MODULE$.get().bufferAccessPoint()))
/* 104 */       .create(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPlugConnect(Hub.Plug plug, Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: aload_2
/*     */     //   3: invokestatic onPlugConnect : (Lli/cil/oc/common/tileentity/traits/Hub;Lli/cil/oc/common/tileentity/traits/Hub$Plug;Lli/cil/oc/api/network/Node;)V
/*     */     //   6: aload_2
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   11: astore_3
/*     */     //   12: dup
/*     */     //   13: ifnonnull -> 24
/*     */     //   16: pop
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 31
/*     */     //   21: goto -> 35
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 35
/*     */     //   31: aload_0
/*     */     //   32: invokestatic joinWirelessNetwork : (Lli/cil/oc/api/network/WirelessEndpoint;)V
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual isPrimary : ()Z
/*     */     //   39: ifeq -> 66
/*     */     //   42: aload_1
/*     */     //   43: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   46: aload_0
/*     */     //   47: invokevirtual componentNodes : ()[Lli/cil/oc/api/network/Component;
/*     */     //   50: aload_1
/*     */     //   51: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   54: invokevirtual ordinal : ()I
/*     */     //   57: aaload
/*     */     //   58: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   63: goto -> 83
/*     */     //   66: aload_0
/*     */     //   67: invokevirtual componentNodes : ()[Lli/cil/oc/api/network/Component;
/*     */     //   70: aload_1
/*     */     //   71: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   74: invokevirtual ordinal : ()I
/*     */     //   77: aaload
/*     */     //   78: invokeinterface remove : ()V
/*     */     //   83: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 0
/*     */     //   #108	-> 6
/*     */     //   #109	-> 31
/*     */     //   #111	-> 35
/*     */     //   #112	-> 42
/*     */     //   #114	-> 66
/*     */     //   #106	-> 83
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	84	0	this	Lli/cil/oc/common/tileentity/AccessPoint;
/*     */     //   0	84	1	plug	Lli/cil/oc/common/tileentity/traits/Hub$Plug;
/*     */     //   0	84	2	node	Lli/cil/oc/api/network/Node;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPlugDisconnect(Hub.Plug plug, Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: aload_2
/*     */     //   3: invokestatic onPlugDisconnect : (Lli/cil/oc/common/tileentity/traits/Hub;Lli/cil/oc/common/tileentity/traits/Hub$Plug;Lli/cil/oc/api/network/Node;)V
/*     */     //   6: aload_2
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   11: astore_3
/*     */     //   12: dup
/*     */     //   13: ifnonnull -> 24
/*     */     //   16: pop
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 31
/*     */     //   21: goto -> 35
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 35
/*     */     //   31: aload_0
/*     */     //   32: invokestatic leaveWirelessNetwork : (Lli/cil/oc/api/network/WirelessEndpoint;)V
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual isPrimary : ()Z
/*     */     //   39: ifeq -> 94
/*     */     //   42: aload_2
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   47: astore #4
/*     */     //   49: dup
/*     */     //   50: ifnonnull -> 62
/*     */     //   53: pop
/*     */     //   54: aload #4
/*     */     //   56: ifnull -> 94
/*     */     //   59: goto -> 70
/*     */     //   62: aload #4
/*     */     //   64: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   67: ifne -> 94
/*     */     //   70: aload_1
/*     */     //   71: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual componentNodes : ()[Lli/cil/oc/api/network/Component;
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   82: invokevirtual ordinal : ()I
/*     */     //   85: aaload
/*     */     //   86: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   91: goto -> 111
/*     */     //   94: aload_0
/*     */     //   95: invokevirtual componentNodes : ()[Lli/cil/oc/api/network/Component;
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   102: invokevirtual ordinal : ()I
/*     */     //   105: aaload
/*     */     //   106: invokeinterface remove : ()V
/*     */     //   111: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 0
/*     */     //   #119	-> 6
/*     */     //   #120	-> 31
/*     */     //   #122	-> 35
/*     */     //   #123	-> 70
/*     */     //   #125	-> 94
/*     */     //   #117	-> 111
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	112	0	this	Lli/cil/oc/common/tileentity/AccessPoint;
/*     */     //   0	112	1	plug	Lli/cil/oc/common/tileentity/traits/Hub$Plug;
/*     */     //   0	112	2	node	Lli/cil/oc/api/network/Node;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt)
/*     */   {
/* 131 */     IndustrialCraft2Classic.class.readFromNBTForServer((IndustrialCraft2Classic)this, nbt);
/* 132 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString())) {
/* 133 */       strength_$eq(RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString())), 0.0D)), Settings$.MODULE$.get().maxWirelessRange()[1]));
/*     */     }
/* 135 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString())) {
/* 136 */       isRepeater_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString()));
/*     */     }
/*     */     
/* 139 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("componentNodes").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new AccessPoint$$anonfun$readFromNBTForServer$1(this)); } public final class AccessPoint$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<Tuple2<NBTTagCompound, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/* 140 */         NBTTagCompound tag = (NBTTagCompound)tuple2._1(); int index = tuple2._2$mcI$sp(); this.$outer.componentNodes()[index].load(tag); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple2); }
/*     */      public AccessPoint$$anonfun$readFromNBTForServer$1(AccessPoint $outer) {} }
/* 145 */   public void writeToNBTForServer(NBTTagCompound nbt) { IndustrialCraft2Classic.class.writeToNBTForServer((IndustrialCraft2Classic)this, nbt);
/* 146 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString(), strength());
/* 147 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString(), isRepeater());
/* 148 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("componentNodes").toString(), (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])componentNodes()).map((Function1)new AccessPoint$$anonfun$writeToNBTForServer$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class))))); } public final class AccessPoint$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<Component, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Component x0$2) { NBTTagCompound nBTTagCompound; Component component = x0$2;
/* 149 */       if (component != null) { Component component1 = component;
/* 150 */         NBTTagCompound tag = new NBTTagCompound();
/* 151 */         component1.save(tag);
/* 152 */         nBTTagCompound = tag; }
/* 153 */       else { nBTTagCompound = new NBTTagCompound(); }
/*     */       
/*     */       return nBTTagCompound; }
/*     */ 
/*     */     
/*     */     public AccessPoint$$anonfun$writeToNBTForServer$1(AccessPoint $outer) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\AccessPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */