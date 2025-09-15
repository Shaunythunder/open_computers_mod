/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.common.inventory.ComponentInventory;
/*     */ import li.cil.oc.common.tileentity.traits.Environment;
/*     */ import li.cil.oc.common.tileentity.traits.Hub;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\rb\001B\001\003\0015\021QAU3mCfT!a\001\003\002\025QLG.Z3oi&$\030P\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'!\001abF\017!G-r\003CA\b\026\033\005\001\"BA\002\022\025\t\0212#A\005nS:,7M]1gi*\tA#A\002oKRL!A\006\t\003\025QKG.Z#oi&$\030\020\005\002\03175\t\021D\003\002\033\005\0051AO]1jiNL!\001H\r\003\025M;\030\016^2i\031&\\W\r\005\002\031=%\021q$\007\002\023\007>l\007o\0348f]RLeN^3oi>\024\030\020\005\002\031C%\021!%\007\002\016!><XM]!dG\026\004Ho\034:\021\005\021JS\"A\023\013\005\031:\023a\0028fi^|'o\033\006\003Q\031\t1!\0319j\023\tQSE\001\006B]\006d\027P_1cY\026\004\"\001\n\027\n\0055*#\001E,je\026dWm]:F]\022\004x.\0338u!\tycG\004\0021i5\t\021G\003\002'e)\0211GB\001\007g\026\024h/\032:\n\005U\n\024AD)vC:$X/\034(fi^|'o[\005\003oa\0221\"U;b]R,XNT8eK*\021Q'\r\005\006u\001!\taO\001\007y%t\027\016\036 \025\003q\002\"!\020\001\016\003\tA\001b\020\001\t\006\004%)\001Q\001\031/&\024X\r\\3tg:+Go^8sW\016\013'\017\032+jKJ\fT#A!\021\005\t+U\"A\"\013\005\021;\023A\0023fi\006LG.\003\002G\007\nA\021\n^3n\023:4w\016\003\005I\001!\005\t\025)\004B\003e9\026N]3mKN\034h*\032;x_J\\7)\031:e)&,'/\r\021\t\021)\003\001R1A\005\006\001\013\001dV5sK2,7o\035(fi^|'o[\"be\022$\026.\032:3\021!a\005\001#A!B\033\t\025!G,je\026dWm]:OKR<xN]6DCJ$G+[3se\001B\001B\024\001\t\006\004%)\001Q\001\013\031&t7.\0323DCJ$\007\002\003)\001\021\003\005\013UB!\002\0271Kgn[3e\007\006\024H\r\t\005\b%\002\001\r\021\"\001T\00319\030N]3mKN\034H+[3s+\005!\006CA+Y\033\0051&\"A,\002\013M\034\027\r\\1\n\005e3&aA%oi\"91\f\001a\001\n\003a\026\001E<je\026dWm]:US\026\024x\fJ3r)\ti\006\r\005\002V=&\021qL\026\002\005+:LG\017C\004b5\006\005\t\031\001+\002\007a$\023\007\003\004d\001\001\006K\001V\001\016o&\024X\r\\3tgRKWM\035\021\t\013\025\004A\021\t4\002#%\034x+\033:fY\026\0348/\0228bE2,G-F\001h!\t)\006.\003\002j-\n9!i\\8mK\006t\007\"B6\001\t\003a\027\001E7bq^K'/\0327fgN\024\026M\\4f+\005i\007CA+o\023\tygK\001\004E_V\024G.\032\005\006c\002!\t\001\\\001\025o&\024X\r\\3tg\016{7\017\036)feJ\013gnZ3\t\017M\004\001\031!C\001Y\006A1\017\036:f]\036$\b\016C\004v\001\001\007I\021\001<\002\031M$(/\0328hi\"|F%Z9\025\005u;\bbB1u\003\003\005\r!\034\005\007s\002\001\013\025B7\002\023M$(/\0328hi\"\004\003bB>\001\001\004%\tAZ\001\013SN\024V\r]3bi\026\024\bbB?\001\001\004%\tA`\001\017SN\024V\r]3bi\026\024x\fJ3r)\tiv\020C\004by\006\005\t\031A4\t\017\005\r\001\001)Q\005O\006Y\021n\035*fa\026\fG/\032:!\021!\t9\001\001a\001\n\0031\027aD5t\031&t7.\0323F]\006\024G.\0323\t\023\005-\001\0011A\005\002\0055\021aE5t\031&t7.\0323F]\006\024G.\0323`I\025\fHcA/\002\020!A\021-!\003\002\002\003\007q\rC\004\002\024\001\001\013\025B4\002!%\034H*\0338lK\022,e.\0312mK\022\004\003\"CA\f\001\001\007I\021AA\r\003\031!XO\0348fYV\021\0211\004\t\005\003;\t9#\004\002\002 )!\021\021EA\022\003\021a\027M\\4\013\005\005\025\022\001\0026bm\006LA!!\013\002 \t11\013\036:j]\036D\021\"!\f\001\001\004%\t!a\f\002\025Q,hN\\3m?\022*\027\017F\002^\003cA\021\"YA\026\003\003\005\r!a\007\t\021\005U\002\001)Q\005\0037\tq\001^;o]\026d\007\005C\005\002:\001\021\r\021\"\001\002<\005q1m\\7q_:,g\016\036(pI\026\034XCAA\037!\025)\026qHA\"\023\r\t\tE\026\002\006\003J\024\030-\037\t\004I\005\025\023bAA$K\tI1i\\7q_:,g\016\036\005\t\003\027\002\001\025!\003\002>\005y1m\\7q_:,g\016\036(pI\026\034\b\005C\004\002P\001!\t%!\025\002\023\r\fg.\0269eCR,G#A4\t\017\005U\003\001\"\025\002X\005a\001.Y:D_:tWm\031;peR\031q-!\027\t\021\005m\0231\013a\001\003;\nAa]5eKB!\021qLA6\033\t\t\tG\003\003\002d\005\025\024\001B;uS2T1!BA4\025\r\tIgE\001\017[&tWm\031:bMR4wN]4f\023\021\ti'!\031\003\035\031{'oZ3ESJ,7\r^5p]\"B\0211KA9\003\023\013Y\t\005\003\002t\005\025UBAA;\025\021\t9(!\037\002\025I,G.Y;oG\",'O\003\003\002|\005u\024a\0014nY*!\021qPAA\003\021iw\016Z:\013\005\005\r\025aA2qo&!\021qQA;\005!\031\026\016Z3P]2L\030!\002<bYV,GEAAG\023\021\ty)!%\002\r\rc\025*\022(U\025\021\t\031*!\036\002\tMKG-\032\005\b\003/\003A\021KAM\003%\031wN\0348fGR|'\017\006\003\002\034\006\035\006#B+\002\036\006\005\026bAAP-\n1q\n\035;j_:\0042\001JAR\023\r\t)+\n\002\n\007>tg.Z2u_JD\001\"a\027\002\026\002\007\021Q\f\005\007\003W\003A\021\t7\002!\025tWM]4z)\"\024x.^4iaV$\bbBAX\001\021\005\023\021W\001\n_:\fe.\0317zu\026$B\"a-\002<\0065\027qZAm\003;\004R!VA \003k\0032\001JA\\\023\r\tI,\n\002\005\035>$W\r\003\005\002>\0065\006\031AA`\003\031\001H.Y=feB!\021\021YAe\033\t\t\031M\003\003\002>\006\025'bAAd#\0051QM\034;jifLA!a3\002D\naQI\034;jif\004F.Y=fe\"9\0211LAW\001\004!\006\002CAi\003[\003\r!a5\002\t!LG\017\027\t\004+\006U\027bAAl-\n)a\t\\8bi\"A\0211\\AW\001\004\t\031.\001\003iSRL\006\002CAp\003[\003\r!a5\002\t!LGO\027\005\b\003G\004A\021AAs\003-9W\r^*ue\026tw\r\0365\025\r\005\035\030q^A\000!\025)\026qHAu!\r)\0261^\005\004\003[4&AB!osJ+g\r\003\005\002r\006\005\b\031AAz\003\035\031wN\034;fqR\004B!!>\002|6\021\021q\037\006\004\003s<\023aB7bG\"Lg.Z\005\005\003{\f9PA\004D_:$X\r\037;\t\021\t\005\021\021\035a\001\005\007\tA!\031:hgB!\021Q\037B\003\023\021\0219!a>\003\023\005\023x-^7f]R\034\b\006DAq\005\027\021\tBa\005\003\026\t]\001\003BA{\005\033IAAa\004\002x\nA1)\0317mE\006\0347.\001\004eSJ,7\r^\r\002\003\005\031Am\\2\"\005\te\021!\0254v]\016$\030n\0348)SirW/\0342fe\002jS\006I$fi\002\"\b.\032\021tS\036t\027\r\034\021tiJ,gn\032;iA!\022\030M\\4fS\001*8/\0323!o\",g\016\t:fY\006L\030N\\4![\026\0348/Y4fg:BqA!\b\001\t\003\021y\"A\006tKR\034FO]3oORDGCBAt\005C\021\031\003\003\005\002r\nm\001\031AAz\021!\021\tAa\007A\002\t\r\001\006\003B\016\005\027\021)Ba\n\"\005\t%\022\001\0314v]\016$\030n\0348)gR\024XM\\4uQjrW/\0342fe&Rd.^7cKJ\004S&\f\021TKR\004C\017[3!g&<g.\0317!gR\024XM\\4uQ\002B#/\0318hK&\002So]3eA]DWM\034\021sK2\f\0270\0338hA5,7o]1hKNt\003BB>\001\t\003\021i\003\006\004\002h\n=\"\021\007\005\t\003c\024Y\0031\001\002t\"A!\021\001B\026\001\004\021\031\001\013\007\003,\t-!\021\003B\n\005+\021)$\t\002\0038\005qh-\0368di&|g\016K\025;E>|G.Z1oA5j\003eR3uA]DW\r\0365fe\002\"\b.\032\021bG\016,7o\035\021q_&tG\017I2veJ,g\016\0367zA\005\034Go\035\021bg\002\n\007E]3qK\006$XM\035\021)e\026\034XM\0343!e\026\034W-\033<fI\002:\030N]3mKN\034\b\005]1dW\026$8\017I<je\026dWm]:ms&r\003b\002B\036\001\021\005!QH\001\fg\026$(+\0329fCR,'\017\006\004\002h\n}\"\021\t\005\t\003c\024I\0041\001\002t\"A!\021\001B\035\001\004\021\031\001\013\005\003:\t-!Q\003B#C\t\0219%A.gk:\034G/[8oQ\025t\027M\0317fIj\022wn\0347fC:L#HY8pY\026\fg\016I\027.AM+G\017I<iKRDWM\035\021uQ\026\004\023mY2fgN\004\003o\\5oi\002\032\bn\\;mI\002\n7\r\036\021bg\002\n\007E]3qK\006$XM\035\030\t\017\t-\003\001\"\005\003N\005a\021/^3vK6+7o]1hKRYQLa\024\003`\t\r$q\rB6\021!\021\tF!\023A\002\tM\023AB:pkJ\034W\r\005\003\003V\tmcbA+\003X%\031!\021\f,\002\rA\023X\rZ3g\023\021\tIC!\030\013\007\tec\013\003\005\003b\t%\003\031\001B*\003-!Wm\035;j]\006$\030n\0348\t\017\t\025$\021\na\001)\006!\001o\034:u\021\035\021IG!\023A\002Q\013!\"\0318to\026\024\bk\034:u\021!\021\tA!\023A\002\005\035\bb\002B8\001\021\005#\021O\001\016e\026\034W-\033<f!\006\0347.\032;\025\013u\023\031H! \t\021\tU$Q\016a\001\005o\na\001]1dW\026$\bc\001\023\003z%\031!1P\023\003\rA\0137m[3u\021\035\021\tF!\034A\002-BqAa\034\001\t\003\022\t\tF\002^\005\007C\001B!\036\003\000\001\007!q\017\005\b\005\017\003A\021\tBE\003A!(/_#ocV,W/\032)bG.,G\017F\003h\005\027\023\t\n\003\005\003\016\n\025\005\031\001BH\003)\031x.\036:dKNKG-\032\t\006+\006u\025Q\f\005\t\005k\022)\t1\001\003x!9!Q\023\001\005R\t]\025a\003:fY\006L\b+Y2lKR$R!\030BM\0057C\001B!$\003\024\002\007!q\022\005\t\005k\022\031\n1\001\003x!9!q\024\001\005R\t\005\026AC2sK\006$XMT8eKR!\021\021\025BR\021!\021)K!(A\002\t\035\026\001\0029mk\036\004BA!+\003,6\t\001!\003\003\003.\n=&\001\002)mk\036L1A!-\032\005\rAUO\031\005\b\005k\003A\021\013B\\\0035yg\016\0257vO\016{gN\\3diR)QL!/\003<\"A!Q\025BZ\001\004\0219\013\003\005\003>\nM\006\031AA[\003\021qw\016Z3\t\017\t\005\007\001\"\025\003D\006\001rN\034)mk\036$\025n]2p]:,7\r\036\013\006;\n\025'q\031\005\t\005K\023y\f1\001\003(\"A!Q\030B`\001\004\t)\fC\004\003L\002!\tF!4\002\027=t\027\n^3n\003\022$W\r\032\013\006;\n='1\033\005\b\005#\024I\r1\001U\003\021\031Hn\034;\t\021\tU'\021\032a\001\005/\fQa\035;bG.\004BA!7\003`6\021!1\034\006\004\005;\f\022\001B5uK6LAA!9\003\\\nI\021\n^3n'R\f7m\033\005\b\005K\004A\021\002Bt\0031)\b\017Z1uK2KW.\033;t)\025i&\021\036Bv\021\035\021\tNa9A\002QC\001B!6\003d\002\007!q\033\005\b\005_\004A\021\013By\0035yg.\023;f[J+Wn\034<fIR)QLa=\003v\"9!\021\033Bw\001\004!\006\002\003Bk\005[\004\rAa6\t\017\te\b\001\"\021\003|\006\001r-\032;TSj,\027J\034<f]R|'/\037\013\002)\"9!q \001\005B\r\005\021AE5t\023R,WNV1mS\0224uN]*m_R$RaZB\002\007\013AqA!5\003~\002\007A\013\003\005\003V\nu\b\031\001Bl\021\035\031I\001\001C!\007\027\tAC]3bI\032\023x.\034(C)\032{'oU3sm\026\024HcA/\004\016!A1qBB\004\001\004\031\t\"A\002oER\004Baa\005\004\0305\0211Q\003\006\004\007\037\t\022\002BB\r\007+\021aB\024\"U)\006<7i\\7q_VtG\rC\004\004\036\001!\tea\b\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\007u\033\t\003\003\005\004\020\rm\001\031AB\t\001")
/*     */ public class Relay extends TileEntity implements SwitchLike, ComponentInventory, PowerAcceptor, Analyzable, WirelessEndpoint, QuantumNetwork.QuantumNode {
/*     */   private ItemInfo WirelessNetworkCardTier1;
/*     */   private ItemInfo WirelessNetworkCardTier2;
/*     */   private ItemInfo LinkedCard;
/*     */   private int wirelessTier;
/*     */   private double strength;
/*     */   private boolean isRepeater;
/*     */   private boolean isLinkedEnabled;
/*     */   private String tunnel;
/*     */   private final Component[] componentNodes;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque;
/*     */   private long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha;
/*     */   private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer;
/*     */   private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer;
/*     */   private boolean addedToIC2PowerGrid;
/*     */   @Method(modid = "factorization")
/*     */   private final Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge;
/*     */   private Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*     */   
/*  36 */   public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; } private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components; private boolean isSizeInventoryReady; private final ArrayBuffer<ManagedEnvironment> updatingComponents; private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory; private final Buffer<Object> computers; private final Map<Object, Set<Object>> openPorts; private long lastMessage; private final Hub.Plug[] plugs; private final Queue<Tuple2<Option<ForgeDirection>, Packet>> queue; private int maxQueueSize; private int relayDelay; private int relayAmount; private int relayCooldown; private final MovingAverage packetsPerCycleAvg; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque = x$1; } public long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(long x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha = x$1; } public void func_145845_h() { RotaryCraft.class.updateEntity((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getOmega() { return RotaryCraft.class.getOmega((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getTorque() { return RotaryCraft.class.getTorque((RotaryCraft)this); } @Method(modid = "RotaryCraft") public long getPower() { return RotaryCraft.class.getPower((RotaryCraft)this); } @Method(modid = "RotaryCraft") public String getName() { return RotaryCraft.class.getName((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getIORenderAlpha() { return RotaryCraft.class.getIORenderAlpha((RotaryCraft)this); } @Method(modid = "RotaryCraft") public void setIORenderAlpha(int value) { RotaryCraft.class.setIORenderAlpha((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setOmega(int value) { RotaryCraft.class.setOmega((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setTorque(int value) { RotaryCraft.class.setTorque((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setPower(long value) { RotaryCraft.class.setPower((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void noInputMachine() { RotaryCraft.class.noInputMachine((RotaryCraft)this); } @Method(modid = "RotaryCraft") public boolean canReadFrom(ForgeDirection forgeDirection) { return RotaryCraft.class.canReadFrom((RotaryCraft)this, forgeDirection); } @Method(modid = "RotaryCraft") public boolean isReceiving() { return RotaryCraft.class.isReceiving((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getMinTorque(int available) { return RotaryCraft.class.getMinTorque((RotaryCraft)this, available); } @Method(modid = "CoFHAPI|energy") public boolean canConnectEnergy(ForgeDirection from) { return RedstoneFlux.class.canConnectEnergy((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) { return RedstoneFlux.class.receiveEnergy((RedstoneFlux)this, from, maxReceive, simulate); } @Method(modid = "CoFHAPI|energy") public int getEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int getMaxEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getMaxEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) { return RedstoneFlux.class.extractEnergy((RedstoneFlux)this, from, maxExtract, simulate); } @Method(modid = "Mekanism") public boolean canReceiveEnergy(ForgeDirection side) { return Mekanism.class.canReceiveEnergy((Mekanism)this, side); } @Method(modid = "Mekanism") public double transferEnergyToAcceptor(ForgeDirection side, double amount) { return Mekanism.class.transferEnergyToAcceptor((Mekanism)this, side, amount); } @Method(modid = "Mekanism") public double getMaxEnergy() { return Mekanism.class.getMaxEnergy((Mekanism)this); } @Method(modid = "Mekanism") public double getEnergy() { return Mekanism.class.getEnergy((Mekanism)this); } @Method(modid = "Mekanism") public void setEnergy(double energy) { Mekanism.class.setEnergy((Mekanism)this, energy); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer = x$1; } public void func_145829_t() { IndustrialCraft2Classic.class.validate((IndustrialCraft2Classic)this); } public void func_145843_s() { IndustrialCraft2Classic.class.invalidate((IndustrialCraft2Classic)this); } public void onChunkUnload() { IndustrialCraft2Classic.class.onChunkUnload((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean isAddedToEnergyNet() { return IndustrialCraft2Classic.class.isAddedToEnergyNet((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public int getMaxSafeInput() { return IndustrialCraft2Classic.class.getMaxSafeInput((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) { return IndustrialCraft2Classic.class.acceptsEnergyFrom((IndustrialCraft2Classic)this, emitter, direction); } @Method(modid = "IC2-Classic") public boolean injectEnergy(Direction directionFrom, int amount) { return IndustrialCraft2Classic.class.injectEnergy((IndustrialCraft2Classic)this, directionFrom, amount); } @Method(modid = "IC2-Classic") public int demandsEnergy() { return IndustrialCraft2Classic.class.demandsEnergy((IndustrialCraft2Classic)this); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer = x$1; } @Method(modid = "IC2") public int getSinkTier() { return IndustrialCraft2Experimental.class.getSinkTier((IndustrialCraft2Experimental)this); } @Method(modid = "IC2") public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) { return IndustrialCraft2Experimental.class.acceptsEnergyFrom((IndustrialCraft2Experimental)this, emitter, direction); } @Method(modid = "IC2") public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) { return IndustrialCraft2Experimental.class.injectEnergy((IndustrialCraft2Experimental)this, directionFrom, amount, voltage); } @Method(modid = "IC2") public double getDemandedEnergy() { return IndustrialCraft2Experimental.class.getDemandedEnergy((IndustrialCraft2Experimental)this); } public boolean addedToIC2PowerGrid() { return this.addedToIC2PowerGrid; } public void addedToIC2PowerGrid_$eq(boolean x$1) { this.addedToIC2PowerGrid = x$1; } @Method(modid = "Galacticraft API") public boolean nodeAvailable(EnergySource from) { return Galacticraft.class.nodeAvailable((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float receiveEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.receiveEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public float getEnergyStoredGC(EnergySource from) { return Galacticraft.class.getEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float getMaxEnergyStoredGC(EnergySource from) { return Galacticraft.class.getMaxEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float extractEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.extractEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public boolean canConnect(ForgeDirection from, NetworkType networkType) { return Galacticraft.class.canConnect((Galacticraft)this, from, networkType); } private Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge = Factorization.class.li$cil$oc$common$tileentity$traits$power$Factorization$$charge((Factorization)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; }  } public Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() : this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; } @Method(modid = "factorization") public Charge getCharge() { return Factorization.class.getCharge((Factorization)this); } @Method(modid = "factorization") public String getInfo() { return Factorization.class.getInfo((Factorization)this); } @Method(modid = "factorization") public Coord getCoord() { return Factorization.class.getCoord((Factorization)this); } public Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node() { return this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; } public void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> x$1) { this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node = x$1; } @Method(modid = "appliedenergistics2") public IGridNode getGridNode(ForgeDirection side) { return AppliedEnergistics2.class.getGridNode((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public AECableType getCableConnectionType(ForgeDirection side) { return AppliedEnergistics2.class.getCableConnectionType((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public void securityBreak() { AppliedEnergistics2.class.securityBreak((AppliedEnergistics2)this); } public void tryAllSides(Function2 provider, Function1 fromOther, Function1 toOther) { Common.class.tryAllSides((Common)this, provider, fromOther, toOther); } public boolean canConnectPower(ForgeDirection side) { return Common.class.canConnectPower((Common)this, side); } public double tryChangeBuffer(ForgeDirection side, double amount, boolean doReceive) { return Common.class.tryChangeBuffer((Common)this, side, amount, doReceive); } public double globalBuffer(ForgeDirection side) { return Common.class.globalBuffer((Common)this, side); } public double globalBufferSize(ForgeDirection side) { return Common.class.globalBufferSize((Common)this, side); } public double globalDemand(ForgeDirection side) { return Common.class.globalDemand((Common)this, side); } public boolean tryChangeBuffer$default$3() { return Common.class.tryChangeBuffer$default$3((Common)this); } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x10) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x10); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x10) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x20) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x20); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x20) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void dispose() { ComponentInventory.class.dispose(this); } public void onConnect(Node node) { ComponentInventory.class.onConnect(this, node); } public void onDisconnect(Node node) { ComponentInventory.class.onDisconnect(this, node); } public void writeToNBTForClient(NBTTagCompound nbt) { ComponentInventory.class.writeToNBTForClient(this, nbt); } @SideOnly(Side.CLIENT) public void readFromNBTForClient(NBTTagCompound nbt) { ComponentInventory.class.readFromNBTForClient(this, nbt); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public int func_70297_j_() { return ComponentInventory.class.getInventoryStackLimit((ComponentInventory)this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot((ComponentInventory)this, slot, stack); } public void connectItemNode(Node node) { ComponentInventory.class.connectItemNode((ComponentInventory)this, node); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x40) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x40); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x40) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public Buffer<Object> computers() { return this.computers; } public Map<Object, Set<Object>> openPorts() { return this.openPorts; } public long lastMessage() { return this.lastMessage; } public void lastMessage_$eq(long x$1) { this.lastMessage = x$1; } public void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$computers_$eq(Buffer<Object> x$1) { this.computers = x$1; } public void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$openPorts_$eq(Map<Object, Set<Object>> x$1) { this.openPorts = x$1; } public void onSwitchActivity() { SwitchLike.class.onSwitchActivity(this); } public Hub.Plug[] plugs() { return this.plugs; } public Queue<Tuple2<Option<ForgeDirection>, Packet>> queue() { return this.queue; } public int maxQueueSize() { return this.maxQueueSize; } public void maxQueueSize_$eq(int x$1) { this.maxQueueSize = x$1; } public int relayDelay() { return this.relayDelay; } public void relayDelay_$eq(int x$1) { this.relayDelay = x$1; } public int relayAmount() { return this.relayAmount; } public void relayAmount_$eq(int x$1) { this.relayAmount = x$1; } public int relayCooldown() { return this.relayCooldown; } public void relayCooldown_$eq(int x$1) { this.relayCooldown = x$1; } public MovingAverage packetsPerCycleAvg() { return this.packetsPerCycleAvg; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$plugs_$eq(Hub.Plug[] x$1) { this.plugs = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$queue_$eq(Queue<Tuple2<Option<ForgeDirection>, Packet>> x$1) { this.queue = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$packetsPerCycleAvg_$eq(MovingAverage x$1) { this.packetsPerCycleAvg = x$1; } public Node node() { return Hub.class.node((Hub)this); } public boolean isConnected() { return Hub.class.isConnected((Hub)this); } public int queueBaseSize() { return Hub.class.queueBaseSize((Hub)this); } public int queueSizePerUpgrade() { return Hub.class.queueSizePerUpgrade((Hub)this); } public int relayBaseDelay() { return Hub.class.relayBaseDelay((Hub)this); } public double relayDelayPerUpgrade() { return Hub.class.relayDelayPerUpgrade((Hub)this); } public int relayBaseAmount() { return Hub.class.relayBaseAmount((Hub)this); } public int relayAmountPerUpgrade() { return Hub.class.relayAmountPerUpgrade((Hub)this); } @SideOnly(Side.CLIENT) public boolean canConnect(ForgeDirection side) { return Hub.class.canConnect((Hub)this, side); } public Node sidedNode(ForgeDirection side) { return Hub.class.sidedNode((Hub)this, side); } public Hub.Plug createPlug(ForgeDirection side) { return Hub.class.createPlug((Hub)this, side); } public void onPlugMessage(Hub.Plug plug, Message message) { Hub.class.onPlugMessage((Hub)this, plug, message); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Relay() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); Hub.class.$init$((Hub)this); SwitchLike.class.$init$(this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); Common.class.$init$((Common)this); AppliedEnergistics2.class.$init$((AppliedEnergistics2)this); Factorization.class.$init$((Factorization)this); Galacticraft.class.$init$((Galacticraft)this); IndustrialCraft2Common.class.$init$((IndustrialCraft2Common)this); IndustrialCraft2Experimental.class.$init$((IndustrialCraft2Experimental)this); IndustrialCraft2Classic.class.$init$((IndustrialCraft2Classic)this); Mekanism.class.$init$((Mekanism)this); RedstoneFlux.class.$init$((RedstoneFlux)this); RotaryCraft.class.$init$((RotaryCraft)this);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  41 */     this.wirelessTier = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.strength = maxWirelessRange();
/*     */     
/*  53 */     this.isRepeater = true;
/*     */     
/*  55 */     this.isLinkedEnabled = false;
/*     */     
/*  57 */     this.tunnel = "creative";
/*     */     
/*  59 */     this.componentNodes = (Component[])Array$.MODULE$.fill(6, 
/*     */         
/*  61 */         (Function0)new Relay$$anonfun$3(this), ClassTag$.MODULE$.apply(Component.class)); } private ItemInfo WirelessNetworkCardTier1$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.WirelessNetworkCardTier1 = Items.get("wlanCard1"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.WirelessNetworkCardTier1; }  } public final ItemInfo WirelessNetworkCardTier1() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? WirelessNetworkCardTier1$lzycompute() : this.WirelessNetworkCardTier1; } private ItemInfo WirelessNetworkCardTier2$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.WirelessNetworkCardTier2 = Items.get("wlanCard2"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.WirelessNetworkCardTier2; }  } public final ItemInfo WirelessNetworkCardTier2() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? WirelessNetworkCardTier2$lzycompute() : this.WirelessNetworkCardTier2; } private ItemInfo LinkedCard$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.LinkedCard = Items.get("linkedCard"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.LinkedCard; }  } public final ItemInfo LinkedCard() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? LinkedCard$lzycompute() : this.LinkedCard; } public int wirelessTier() { return this.wirelessTier; } public void wirelessTier_$eq(int x$1) { this.wirelessTier = x$1; } public boolean isWirelessEnabled() { return (wirelessTier() >= 0); } public double maxWirelessRange() { return (wirelessTier() == 0 || wirelessTier() == 1) ? Settings$.MODULE$.get().maxWirelessRange()[wirelessTier()] : 0.0D; } public double wirelessCostPerRange() { return (wirelessTier() == 0 || wirelessTier() == 1) ? Settings$.MODULE$.get().wirelessCostPerRange()[wirelessTier()] : 0.0D; } public double strength() { return this.strength; } public void strength_$eq(double x$1) { this.strength = x$1; } public boolean isRepeater() { return this.isRepeater; } public void isRepeater_$eq(boolean x$1) { this.isRepeater = x$1; } public boolean isLinkedEnabled() { return this.isLinkedEnabled; } public void isLinkedEnabled_$eq(boolean x$1) { this.isLinkedEnabled = x$1; } public String tunnel() { return this.tunnel; } public void tunnel_$eq(String x$1) { this.tunnel = x$1; } public Component[] componentNodes() { return this.componentNodes; } public final class Relay$$anonfun$3 extends AbstractFunction0<Component> implements Serializable { public static final long serialVersionUID = 0L; public final Component apply() { return (Component)Network.newNode((Environment)this.$outer, Visibility.Network).withComponent("relay").create(); }
/*     */      public Relay$$anonfun$3(Relay $outer) {} } public boolean canUpdate() {
/*  63 */     return isServer();
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean hasConnector(ForgeDirection side) {
/*  68 */     return true;
/*     */   } public Option<Connector> connector(ForgeDirection side) { None$ none$;
/*  70 */     Node node = sidedNode(side);
/*  71 */     if (node instanceof Connector) { Connector connector = (Connector)node; Option option = Option$.MODULE$.apply(connector); }
/*  72 */     else { none$ = None$.MODULE$; }
/*     */     
/*     */     return (Option<Connector>)none$; } public double energyThroughput() {
/*  75 */     return Settings$.MODULE$.get().accessPointRate();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*  81 */     player.func_145747_a((IChatComponent)Localization$Analyzer$.MODULE$.WirelessStrength(strength()));
/*  82 */     (new Node[1])[0] = (Node)componentNodes()[side]; return isWirelessEnabled() ? new Node[1] : 
/*     */       
/*  84 */       null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- Get the signal strength (range) used when relaying messages.")
/*     */   public synchronized Object[] getStrength(Context context, Arguments args) {
/*  90 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) }));
/*     */   }
/*     */   @Callback(doc = "function(strength:number):number -- Set the signal strength (range) used when relaying messages.")
/*     */   public synchronized Object[] setStrength(Context context, Arguments args) {
/*  94 */     strength_$eq(package$.MODULE$.max(0.0D, package$.MODULE$.min(args.checkDouble(0), maxWirelessRange())));
/*  95 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(strength()) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():boolean -- Get whether the access point currently acts as a repeater (resend received wireless packets wirelessly).")
/*     */   public synchronized Object[] isRepeater(Context context, Arguments args) {
/*  99 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isRepeater()) }));
/*     */   }
/*     */   @Callback(doc = "function(enabled:boolean):boolean -- Set whether the access point should act as a repeater.")
/*     */   public synchronized Object[] setRepeater(Context context, Arguments args) {
/* 103 */     isRepeater_$eq(args.checkBoolean(0));
/* 104 */     return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(isRepeater()) }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void queueMessage(String source, String destination, int port, int answerPort, Object[] args)
/*     */   {
/* 110 */     ((IterableLike)computers().map((Function1)new Relay$$anonfun$queueMessage$1(this), Buffer$.MODULE$.canBuildFrom())).foreach((Function1)new Relay$$anonfun$queueMessage$2(this, source, destination, port, answerPort, args)); } public final class Relay$$anonfun$queueMessage$1 extends AbstractFunction1<Object, IComputerAccess> implements Serializable { public static final long serialVersionUID = 0L; public final IComputerAccess apply(Object x$1) { return (IComputerAccess)x$1; } public Relay$$anonfun$queueMessage$1(Relay $outer) {} } public final class Relay$$anonfun$queueMessage$2 extends AbstractFunction1<IComputerAccess, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String source$1; private final String destination$1; private final int port$1; private final int answerPort$1; private final Object[] args$1; public Relay$$anonfun$queueMessage$2(Relay $outer, String source$1, String destination$1, int port$1, int answerPort$1, Object[] args$1) {} public final void apply(IComputerAccess computer) { // Byte code:
/*     */       //   0: new scala/StringContext
/*     */       //   3: dup
/*     */       //   4: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   7: iconst_3
/*     */       //   8: anewarray java/lang/String
/*     */       //   11: dup
/*     */       //   12: iconst_0
/*     */       //   13: ldc 'cc'
/*     */       //   15: aastore
/*     */       //   16: dup
/*     */       //   17: iconst_1
/*     */       //   18: ldc '_'
/*     */       //   20: aastore
/*     */       //   21: dup
/*     */       //   22: iconst_2
/*     */       //   23: ldc ''
/*     */       //   25: aastore
/*     */       //   26: checkcast [Ljava/lang/Object;
/*     */       //   29: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   32: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   35: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   38: iconst_2
/*     */       //   39: anewarray java/lang/Object
/*     */       //   42: dup
/*     */       //   43: iconst_0
/*     */       //   44: aload_1
/*     */       //   45: invokeinterface getID : ()I
/*     */       //   50: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   53: aastore
/*     */       //   54: dup
/*     */       //   55: iconst_1
/*     */       //   56: aload_1
/*     */       //   57: invokeinterface getAttachmentName : ()Ljava/lang/String;
/*     */       //   62: aastore
/*     */       //   63: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   66: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   69: astore_2
/*     */       //   70: aload_0
/*     */       //   71: getfield source$1 : Ljava/lang/String;
/*     */       //   74: aload_2
/*     */       //   75: astore_3
/*     */       //   76: dup
/*     */       //   77: ifnonnull -> 88
/*     */       //   80: pop
/*     */       //   81: aload_3
/*     */       //   82: ifnull -> 280
/*     */       //   85: goto -> 95
/*     */       //   88: aload_3
/*     */       //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   92: ifne -> 280
/*     */       //   95: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   98: aload_0
/*     */       //   99: getfield destination$1 : Ljava/lang/String;
/*     */       //   102: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   105: new li/cil/oc/common/tileentity/Relay$$anonfun$queueMessage$2$$anonfun$apply$2
/*     */       //   108: dup
/*     */       //   109: aload_0
/*     */       //   110: aload_2
/*     */       //   111: invokespecial <init> : (Lli/cil/oc/common/tileentity/Relay$$anonfun$queueMessage$2;Ljava/lang/String;)V
/*     */       //   114: invokevirtual forall : (Lscala/Function1;)Z
/*     */       //   117: ifeq -> 280
/*     */       //   120: aload_0
/*     */       //   121: getfield $outer : Lli/cil/oc/common/tileentity/Relay;
/*     */       //   124: invokevirtual openPorts : ()Lscala/collection/mutable/Map;
/*     */       //   127: aload_1
/*     */       //   128: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   133: checkcast scala/collection/SetLike
/*     */       //   136: aload_0
/*     */       //   137: getfield port$1 : I
/*     */       //   140: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   143: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   148: ifeq -> 280
/*     */       //   151: aload_1
/*     */       //   152: ldc 'modem_message'
/*     */       //   154: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */       //   157: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*     */       //   160: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   163: iconst_3
/*     */       //   164: anewarray java/lang/Object
/*     */       //   167: dup
/*     */       //   168: iconst_0
/*     */       //   169: aload_1
/*     */       //   170: invokeinterface getAttachmentName : ()Ljava/lang/String;
/*     */       //   175: aastore
/*     */       //   176: dup
/*     */       //   177: iconst_1
/*     */       //   178: aload_0
/*     */       //   179: getfield port$1 : I
/*     */       //   182: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   185: aastore
/*     */       //   186: dup
/*     */       //   187: iconst_2
/*     */       //   188: aload_0
/*     */       //   189: getfield answerPort$1 : I
/*     */       //   192: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   195: aastore
/*     */       //   196: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   199: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */       //   202: checkcast scala/collection/TraversableLike
/*     */       //   205: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   208: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   211: aload_0
/*     */       //   212: getfield args$1 : [Ljava/lang/Object;
/*     */       //   215: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   218: new li/cil/oc/common/tileentity/Relay$$anonfun$queueMessage$2$$anonfun$apply$3
/*     */       //   221: dup
/*     */       //   222: aload_0
/*     */       //   223: invokespecial <init> : (Lli/cil/oc/common/tileentity/Relay$$anonfun$queueMessage$2;)V
/*     */       //   226: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */       //   229: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */       //   232: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*     */       //   235: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */       //   238: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */       //   243: checkcast [Ljava/lang/Object;
/*     */       //   246: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   249: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*     */       //   252: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */       //   255: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */       //   260: checkcast scala/collection/Seq
/*     */       //   263: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */       //   266: invokevirtual AnyRef : ()Lscala/reflect/ClassTag;
/*     */       //   269: invokevirtual apply : (Lscala/collection/Seq;Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */       //   272: checkcast [Ljava/lang/Object;
/*     */       //   275: invokeinterface queueEvent : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */       //   280: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #111	-> 0
/*     */       //   #112	-> 70
/*     */       //   #113	-> 151
/*     */       //   #110	-> 280
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	281	0	this	Lli/cil/oc/common/tileentity/Relay$$anonfun$queueMessage$2;
/*     */       //   0	281	1	computer	Ldan200/computercraft/api/peripheral/IComputerAccess;
/*     */       //   70	211	2	address	Ljava/lang/String; }
/*     */     public final class Relay$$anonfun$queueMessage$2$$anonfun$apply$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String address$1;
/* 112 */       public final boolean apply(String x$2) { String str = this.address$1; if (x$2 == null) { if (str != null); } else if (x$2.equals(str)) {  }
/* 113 */          } public Relay$$anonfun$queueMessage$2$$anonfun$apply$2(Relay$$anonfun$queueMessage$2 $outer, String address$1) {} } public final class Relay$$anonfun$queueMessage$2$$anonfun$apply$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object x0$1) { Object object2, object1 = x0$1;
/* 114 */         if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; object2 = new String(arrayOfByte, Charsets.UTF_8); }
/* 115 */         else { object2 = object1; }
/*     */         
/*     */         return object2; }
/*     */ 
/*     */       
/*     */       public Relay$$anonfun$queueMessage$2$$anonfun$apply$3(Relay$$anonfun$queueMessage$2 $outer) {} } }
/*     */   
/*     */   public void receivePacket(Packet packet, WirelessEndpoint source) {
/* 123 */     if (isWirelessEnabled()) {
/* 124 */       tryEnqueuePacket((Option<ForgeDirection>)None$.MODULE$, packet);
/*     */     }
/*     */   }
/*     */   
/*     */   public void receivePacket(Packet packet) {
/* 129 */     if (isLinkedEnabled()) {
/* 130 */       tryEnqueuePacket((Option<ForgeDirection>)None$.MODULE$, packet);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean tryEnqueuePacket(Option sourceSide, Packet packet) {
/* 135 */     if (Mods$.MODULE$.ComputerCraft().isAvailable())
/* 136 */     { Option option = Predef$.MODULE$.refArrayOps(packet.data()).headOption();
/* 137 */       if (option instanceof Some) { Some some = (Some)option; Object answerPort = some.x(); if (answerPort instanceof Double) { Double double_ = (Double)answerPort; queueMessage(packet.source(), packet.destination(), packet.port(), (int)Predef$.MODULE$.Double2double(double_), (Object[])Predef$.MODULE$.refArrayOps(packet.data()).drop(1)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */           
/* 141 */           return Hub.class.tryEnqueuePacket((Hub)this, sourceSide, packet); }  }  queueMessage(packet.source(), packet.destination(), packet.port(), -1, packet.data()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return Hub.class.tryEnqueuePacket((Hub)this, sourceSide, packet);
/*     */   }
/*     */   
/*     */   public void relayPacket(Option sourceSide, Packet packet) { Relay$$anonfun$2 relay$$anonfun$22;
/* 145 */     Hub.class.relayPacket((Hub)this, sourceSide, packet);
/*     */     
/* 147 */     Option option = sourceSide;
/* 148 */     if (option instanceof Some) { Some some = (Some)option; ForgeDirection side = (ForgeDirection)some.x();
/* 149 */       Relay$$anonfun$1 relay$$anonfun$1 = new Relay$$anonfun$1(this, side); }
/*     */     else
/* 151 */     { relay$$anonfun$22 = new Relay$$anonfun$2(this); }
/*     */     
/*     */     Relay$$anonfun$2 relay$$anonfun$21 = relay$$anonfun$22;
/* 154 */     if (isWirelessEnabled() && strength() > false && (sourceSide.isDefined() || isRepeater())) {
/* 155 */       double cost = wirelessCostPerRange();
/* 156 */       if (relay$$anonfun$21.apply$mcZD$sp(-strength() * cost)) {
/* 157 */         Network.sendWirelessPacket(this, strength(), packet);
/*     */       }
/*     */     } 
/*     */     
/* 161 */     if (isLinkedEnabled() && sourceSide.isDefined()) {
/* 162 */       double cost = packet.size() / 32.0D + wirelessCostPerRange() * maxWirelessRange() * 5;
/* 163 */       if (relay$$anonfun$21.apply$mcZD$sp(-cost)) {
/* 164 */         Iterable endpoints = (Iterable)QuantumNetwork$.MODULE$.getEndpoints(tunnel()).filter((Function1)new Relay$$anonfun$4(this));
/* 165 */         endpoints.foreach((Function1)new Relay$$anonfun$relayPacket$1(this, packet));
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 171 */     onSwitchActivity(); } public final class Relay$$anonfun$1 extends AbstractFunction1.mcZD.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection side$1; public final boolean apply(double amount) { return apply$mcZD$sp(amount); } public boolean apply$mcZD$sp(double amount) { return ((Connector)this.$outer.plugs()[this.side$1.ordinal()].node()).tryChangeBuffer(amount); } public Relay$$anonfun$1(Relay $outer, ForgeDirection side$1) {} } public final class Relay$$anonfun$2 extends AbstractFunction1.mcZD.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(double amount) { return apply$mcZD$sp(amount); } public boolean apply$mcZD$sp(double amount) { return Predef$.MODULE$.refArrayOps((Object[])this.$outer.plugs()).exists((Function1)new Relay$$anonfun$2$$anonfun$apply$mcZD$sp$1(this, amount)); } public Relay$$anonfun$2(Relay $outer) {} public final class Relay$$anonfun$2$$anonfun$apply$mcZD$sp$1 extends AbstractFunction1<Hub.Plug, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final double amount$1; public final boolean apply(Hub.Plug x$3) { return ((Connector)x$3.node()).tryChangeBuffer(this.amount$1); } public Relay$$anonfun$2$$anonfun$apply$mcZD$sp$1(Relay$$anonfun$2 $outer, double amount$1) {} } } public final class Relay$$anonfun$4 extends AbstractFunction1<QuantumNetwork.QuantumNode, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(QuantumNetwork.QuantumNode x$4) { Relay relay = this.$outer; if (x$4 == null) { if (relay != null); } else if (x$4.equals(relay)) {  }  } public Relay$$anonfun$4(Relay $outer) {} } public final class Relay$$anonfun$relayPacket$1 extends AbstractFunction1<QuantumNetwork.QuantumNode, BoxedUnit> implements Serializable {
/* 176 */     public static final long serialVersionUID = 0L; private final Packet packet$1; public Relay$$anonfun$relayPacket$1(Relay $outer, Packet packet$1) {} public final void apply(QuantumNetwork.QuantumNode endpoint) { endpoint.receivePacket(this.packet$1); } } public Connector createNode(Hub.Plug plug) { return (Connector)Network.newNode((Environment)plug, Visibility.Network)
/* 177 */       .withConnector(package$.MODULE$.round(Settings$.MODULE$.get().bufferAccessPoint()))
/* 178 */       .create(); }
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
/*     */     //   #181	-> 0
/*     */     //   #182	-> 6
/*     */     //   #183	-> 31
/*     */     //   #185	-> 35
/*     */     //   #186	-> 42
/*     */     //   #188	-> 66
/*     */     //   #180	-> 83
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	84	0	this	Lli/cil/oc/common/tileentity/Relay;
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
/*     */     //   #192	-> 0
/*     */     //   #193	-> 6
/*     */     //   #194	-> 31
/*     */     //   #196	-> 35
/*     */     //   #197	-> 70
/*     */     //   #199	-> 94
/*     */     //   #191	-> 111
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	112	0	this	Lli/cil/oc/common/tileentity/Relay;
/*     */     //   0	112	1	plug	Lli/cil/oc/common/tileentity/traits/Hub$Plug;
/*     */     //   0	112	2	node	Lli/cil/oc/api/network/Node;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onItemAdded(int slot, ItemStack stack) {
/* 205 */     ComponentInventory.class.onItemAdded(this, slot, stack);
/* 206 */     li$cil$oc$common$tileentity$Relay$$updateLimits(slot, stack);
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
/*     */   
/*     */   public void li$cil$oc$common$tileentity$Relay$$updateLimits(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: aconst_null
/*     */     //   3: astore #4
/*     */     //   5: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   8: aload_2
/*     */     //   9: aload_0
/*     */     //   10: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   13: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   16: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   19: astore #5
/*     */     //   21: aload #5
/*     */     //   23: instanceof scala/Some
/*     */     //   26: ifeq -> 126
/*     */     //   29: iconst_1
/*     */     //   30: istore_3
/*     */     //   31: aload #5
/*     */     //   33: checkcast scala/Some
/*     */     //   36: astore #4
/*     */     //   38: aload #4
/*     */     //   40: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   43: checkcast li/cil/oc/api/driver/Item
/*     */     //   46: astore #6
/*     */     //   48: aload #6
/*     */     //   50: aload_2
/*     */     //   51: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   56: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   59: invokevirtual CPU : ()Ljava/lang/String;
/*     */     //   62: astore #7
/*     */     //   64: dup
/*     */     //   65: ifnonnull -> 77
/*     */     //   68: pop
/*     */     //   69: aload #7
/*     */     //   71: ifnull -> 85
/*     */     //   74: goto -> 126
/*     */     //   77: aload #7
/*     */     //   79: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   82: ifeq -> 126
/*     */     //   85: aload_0
/*     */     //   86: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   89: iconst_1
/*     */     //   90: aload_0
/*     */     //   91: invokevirtual relayBaseDelay : ()I
/*     */     //   94: aload #6
/*     */     //   96: aload_2
/*     */     //   97: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */     //   102: iconst_1
/*     */     //   103: iadd
/*     */     //   104: i2d
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual relayDelayPerUpgrade : ()D
/*     */     //   109: dmul
/*     */     //   110: d2i
/*     */     //   111: isub
/*     */     //   112: invokevirtual max : (II)I
/*     */     //   115: invokevirtual relayDelay_$eq : (I)V
/*     */     //   118: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   121: astore #8
/*     */     //   123: goto -> 673
/*     */     //   126: iload_3
/*     */     //   127: ifeq -> 288
/*     */     //   130: aload #4
/*     */     //   132: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   135: checkcast li/cil/oc/api/driver/Item
/*     */     //   138: astore #9
/*     */     //   140: aload #9
/*     */     //   142: aload_2
/*     */     //   143: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   148: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   151: invokevirtual Memory : ()Ljava/lang/String;
/*     */     //   154: astore #10
/*     */     //   156: dup
/*     */     //   157: ifnonnull -> 169
/*     */     //   160: pop
/*     */     //   161: aload #10
/*     */     //   163: ifnull -> 177
/*     */     //   166: goto -> 288
/*     */     //   169: aload #10
/*     */     //   171: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   174: ifeq -> 288
/*     */     //   177: aload_0
/*     */     //   178: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   181: iconst_1
/*     */     //   182: aload_0
/*     */     //   183: invokevirtual relayBaseAmount : ()I
/*     */     //   186: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   189: aload_2
/*     */     //   190: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   193: astore #11
/*     */     //   195: aload #11
/*     */     //   197: instanceof scala/Some
/*     */     //   200: ifeq -> 252
/*     */     //   203: aload #11
/*     */     //   205: checkcast scala/Some
/*     */     //   208: astore #12
/*     */     //   210: aload #12
/*     */     //   212: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   215: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   218: astore #13
/*     */     //   220: aload #13
/*     */     //   222: instanceof li/cil/oc/common/item/Memory
/*     */     //   225: ifeq -> 252
/*     */     //   228: aload #13
/*     */     //   230: checkcast li/cil/oc/common/item/Memory
/*     */     //   233: astore #14
/*     */     //   235: aload #14
/*     */     //   237: invokevirtual tier : ()I
/*     */     //   240: iconst_1
/*     */     //   241: iadd
/*     */     //   242: aload_0
/*     */     //   243: invokevirtual relayAmountPerUpgrade : ()I
/*     */     //   246: imul
/*     */     //   247: istore #15
/*     */     //   249: goto -> 271
/*     */     //   252: aload #9
/*     */     //   254: aload_2
/*     */     //   255: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */     //   260: iconst_1
/*     */     //   261: iadd
/*     */     //   262: aload_0
/*     */     //   263: invokevirtual relayAmountPerUpgrade : ()I
/*     */     //   266: iconst_2
/*     */     //   267: imul
/*     */     //   268: imul
/*     */     //   269: istore #15
/*     */     //   271: iload #15
/*     */     //   273: iadd
/*     */     //   274: invokevirtual max : (II)I
/*     */     //   277: invokevirtual relayAmount_$eq : (I)V
/*     */     //   280: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   283: astore #8
/*     */     //   285: goto -> 673
/*     */     //   288: iload_3
/*     */     //   289: ifeq -> 378
/*     */     //   292: aload #4
/*     */     //   294: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   297: checkcast li/cil/oc/api/driver/Item
/*     */     //   300: astore #16
/*     */     //   302: aload #16
/*     */     //   304: aload_2
/*     */     //   305: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   310: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   313: invokevirtual HDD : ()Ljava/lang/String;
/*     */     //   316: astore #17
/*     */     //   318: dup
/*     */     //   319: ifnonnull -> 331
/*     */     //   322: pop
/*     */     //   323: aload #17
/*     */     //   325: ifnull -> 339
/*     */     //   328: goto -> 378
/*     */     //   331: aload #17
/*     */     //   333: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   336: ifeq -> 378
/*     */     //   339: aload_0
/*     */     //   340: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   343: iconst_1
/*     */     //   344: aload_0
/*     */     //   345: invokevirtual queueBaseSize : ()I
/*     */     //   348: aload #16
/*     */     //   350: aload_2
/*     */     //   351: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */     //   356: iconst_1
/*     */     //   357: iadd
/*     */     //   358: aload_0
/*     */     //   359: invokevirtual queueSizePerUpgrade : ()I
/*     */     //   362: imul
/*     */     //   363: iadd
/*     */     //   364: invokevirtual max : (II)I
/*     */     //   367: invokevirtual maxQueueSize_$eq : (I)V
/*     */     //   370: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   373: astore #8
/*     */     //   375: goto -> 673
/*     */     //   378: iload_3
/*     */     //   379: ifeq -> 668
/*     */     //   382: aload #4
/*     */     //   384: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   387: checkcast li/cil/oc/api/driver/Item
/*     */     //   390: astore #18
/*     */     //   392: aload #18
/*     */     //   394: aload_2
/*     */     //   395: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   400: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   403: invokevirtual Card : ()Ljava/lang/String;
/*     */     //   406: astore #19
/*     */     //   408: dup
/*     */     //   409: ifnonnull -> 421
/*     */     //   412: pop
/*     */     //   413: aload #19
/*     */     //   415: ifnull -> 429
/*     */     //   418: goto -> 668
/*     */     //   421: aload #19
/*     */     //   423: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   426: ifeq -> 668
/*     */     //   429: aload_2
/*     */     //   430: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   433: astore #20
/*     */     //   435: aload #20
/*     */     //   437: aload_0
/*     */     //   438: invokevirtual WirelessNetworkCardTier1 : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   441: astore #21
/*     */     //   443: dup
/*     */     //   444: ifnonnull -> 456
/*     */     //   447: pop
/*     */     //   448: aload #21
/*     */     //   450: ifnull -> 493
/*     */     //   453: goto -> 464
/*     */     //   456: aload #21
/*     */     //   458: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   461: ifne -> 493
/*     */     //   464: aload #20
/*     */     //   466: aload_0
/*     */     //   467: invokevirtual WirelessNetworkCardTier2 : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   470: astore #22
/*     */     //   472: dup
/*     */     //   473: ifnonnull -> 485
/*     */     //   476: pop
/*     */     //   477: aload #22
/*     */     //   479: ifnull -> 493
/*     */     //   482: goto -> 531
/*     */     //   485: aload #22
/*     */     //   487: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   490: ifeq -> 531
/*     */     //   493: aload_0
/*     */     //   494: aload #20
/*     */     //   496: aload_0
/*     */     //   497: invokevirtual WirelessNetworkCardTier1 : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   500: astore #23
/*     */     //   502: dup
/*     */     //   503: ifnonnull -> 515
/*     */     //   506: pop
/*     */     //   507: aload #23
/*     */     //   509: ifnull -> 523
/*     */     //   512: goto -> 527
/*     */     //   515: aload #23
/*     */     //   517: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   520: ifeq -> 527
/*     */     //   523: iconst_0
/*     */     //   524: goto -> 528
/*     */     //   527: iconst_1
/*     */     //   528: invokevirtual wirelessTier_$eq : (I)V
/*     */     //   531: aload #20
/*     */     //   533: aload_0
/*     */     //   534: invokevirtual LinkedCard : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   537: astore #24
/*     */     //   539: dup
/*     */     //   540: ifnonnull -> 552
/*     */     //   543: pop
/*     */     //   544: aload #24
/*     */     //   546: ifnull -> 560
/*     */     //   549: goto -> 660
/*     */     //   552: aload #24
/*     */     //   554: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   557: ifeq -> 660
/*     */     //   560: getstatic li/cil/oc/integration/opencomputers/DriverLinkedCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverLinkedCard$;
/*     */     //   563: aload_2
/*     */     //   564: invokevirtual dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   567: astore #25
/*     */     //   569: aload #25
/*     */     //   571: new scala/collection/mutable/StringBuilder
/*     */     //   574: dup
/*     */     //   575: invokespecial <init> : ()V
/*     */     //   578: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   581: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   584: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   587: ldc_w 'tunnel'
/*     */     //   590: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   593: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   596: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   599: ifeq -> 654
/*     */     //   602: aload_0
/*     */     //   603: aload #25
/*     */     //   605: new scala/collection/mutable/StringBuilder
/*     */     //   608: dup
/*     */     //   609: invokespecial <init> : ()V
/*     */     //   612: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   615: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   618: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   621: ldc_w 'tunnel'
/*     */     //   624: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   627: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   630: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   633: invokevirtual tunnel_$eq : (Ljava/lang/String;)V
/*     */     //   636: aload_0
/*     */     //   637: iconst_1
/*     */     //   638: invokevirtual isLinkedEnabled_$eq : (Z)V
/*     */     //   641: getstatic li/cil/oc/server/network/QuantumNetwork$.MODULE$ : Lli/cil/oc/server/network/QuantumNetwork$;
/*     */     //   644: aload_0
/*     */     //   645: invokevirtual add : (Lli/cil/oc/server/network/QuantumNetwork$QuantumNode;)V
/*     */     //   648: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   651: goto -> 663
/*     */     //   654: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   657: goto -> 663
/*     */     //   660: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   663: astore #8
/*     */     //   665: goto -> 673
/*     */     //   668: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   671: astore #8
/*     */     //   673: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #211	-> 0
/*     */     //   #210	-> 5
/*     */     //   #211	-> 21
/*     */     //   #212	-> 85
/*     */     //   #210	-> 126
/*     */     //   #213	-> 130
/*     */     //   #214	-> 177
/*     */     //   #215	-> 195
/*     */     //   #216	-> 252
/*     */     //   #214	-> 271
/*     */     //   #210	-> 288
/*     */     //   #218	-> 292
/*     */     //   #219	-> 339
/*     */     //   #210	-> 378
/*     */     //   #220	-> 382
/*     */     //   #221	-> 429
/*     */     //   #222	-> 435
/*     */     //   #223	-> 493
/*     */     //   #224	-> 531
/*     */     //   #225	-> 560
/*     */     //   #226	-> 569
/*     */     //   #227	-> 602
/*     */     //   #228	-> 636
/*     */     //   #229	-> 641
/*     */     //   #226	-> 654
/*     */     //   #224	-> 660
/*     */     //   #220	-> 663
/*     */     //   #232	-> 668
/*     */     //   #210	-> 673
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	674	0	this	Lli/cil/oc/common/tileentity/Relay;
/*     */     //   0	674	1	slot	I
/*     */     //   0	674	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   48	626	6	driver	Lli/cil/oc/api/driver/Item;
/*     */     //   140	534	9	driver	Lli/cil/oc/api/driver/Item;
/*     */     //   220	454	13	ram	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   302	372	16	driver	Lli/cil/oc/api/driver/Item;
/*     */     //   392	282	18	driver	Lli/cil/oc/api/driver/Item;
/*     */     //   435	239	20	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   569	105	25	data	Lnet/minecraft/nbt/NBTTagCompound;
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
/*     */   public void onItemRemoved(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_1
/*     */     //   2: aload_2
/*     */     //   3: invokestatic onItemRemoved : (Lli/cil/oc/common/tileentity/traits/ComponentInventory;ILnet/minecraft/item/ItemStack;)V
/*     */     //   6: aload_2
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   11: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   14: astore_3
/*     */     //   15: aload_3
/*     */     //   16: aload_2
/*     */     //   17: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   22: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   25: invokevirtual CPU : ()Ljava/lang/String;
/*     */     //   28: astore #4
/*     */     //   30: dup
/*     */     //   31: ifnonnull -> 43
/*     */     //   34: pop
/*     */     //   35: aload #4
/*     */     //   37: ifnull -> 51
/*     */     //   40: goto -> 67
/*     */     //   43: aload #4
/*     */     //   45: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   48: ifeq -> 67
/*     */     //   51: aload_0
/*     */     //   52: aload_0
/*     */     //   53: invokevirtual relayBaseDelay : ()I
/*     */     //   56: invokevirtual relayDelay_$eq : (I)V
/*     */     //   59: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   62: astore #5
/*     */     //   64: goto -> 229
/*     */     //   67: aload_3
/*     */     //   68: aload_2
/*     */     //   69: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   74: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   77: invokevirtual Memory : ()Ljava/lang/String;
/*     */     //   80: astore #6
/*     */     //   82: dup
/*     */     //   83: ifnonnull -> 95
/*     */     //   86: pop
/*     */     //   87: aload #6
/*     */     //   89: ifnull -> 103
/*     */     //   92: goto -> 119
/*     */     //   95: aload #6
/*     */     //   97: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   100: ifeq -> 119
/*     */     //   103: aload_0
/*     */     //   104: aload_0
/*     */     //   105: invokevirtual relayBaseAmount : ()I
/*     */     //   108: invokevirtual relayAmount_$eq : (I)V
/*     */     //   111: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   114: astore #5
/*     */     //   116: goto -> 229
/*     */     //   119: aload_3
/*     */     //   120: aload_2
/*     */     //   121: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   126: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   129: invokevirtual HDD : ()Ljava/lang/String;
/*     */     //   132: astore #7
/*     */     //   134: dup
/*     */     //   135: ifnonnull -> 147
/*     */     //   138: pop
/*     */     //   139: aload #7
/*     */     //   141: ifnull -> 155
/*     */     //   144: goto -> 171
/*     */     //   147: aload #7
/*     */     //   149: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 171
/*     */     //   155: aload_0
/*     */     //   156: aload_0
/*     */     //   157: invokevirtual queueBaseSize : ()I
/*     */     //   160: invokevirtual maxQueueSize_$eq : (I)V
/*     */     //   163: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   166: astore #5
/*     */     //   168: goto -> 229
/*     */     //   171: aload_3
/*     */     //   172: aload_2
/*     */     //   173: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   178: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   181: invokevirtual Card : ()Ljava/lang/String;
/*     */     //   184: astore #8
/*     */     //   186: dup
/*     */     //   187: ifnonnull -> 199
/*     */     //   190: pop
/*     */     //   191: aload #8
/*     */     //   193: ifnull -> 207
/*     */     //   196: goto -> 230
/*     */     //   199: aload #8
/*     */     //   201: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   204: ifeq -> 230
/*     */     //   207: aload_0
/*     */     //   208: iconst_m1
/*     */     //   209: invokevirtual wirelessTier_$eq : (I)V
/*     */     //   212: aload_0
/*     */     //   213: iconst_0
/*     */     //   214: invokevirtual isLinkedEnabled_$eq : (Z)V
/*     */     //   217: getstatic li/cil/oc/server/network/QuantumNetwork$.MODULE$ : Lli/cil/oc/server/network/QuantumNetwork$;
/*     */     //   220: aload_0
/*     */     //   221: invokevirtual remove : (Lli/cil/oc/server/network/QuantumNetwork$QuantumNode;)V
/*     */     //   224: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   227: astore #5
/*     */     //   229: return
/*     */     //   230: new scala/MatchError
/*     */     //   233: dup
/*     */     //   234: aload_3
/*     */     //   235: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   238: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #237	-> 0
/*     */     //   #238	-> 6
/*     */     //   #239	-> 15
/*     */     //   #240	-> 67
/*     */     //   #241	-> 119
/*     */     //   #242	-> 171
/*     */     //   #243	-> 207
/*     */     //   #244	-> 212
/*     */     //   #245	-> 217
/*     */     //   #242	-> 227
/*     */     //   #236	-> 229
/*     */     //   #238	-> 230
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	239	0	this	Lli/cil/oc/common/tileentity/Relay;
/*     */     //   0	239	1	slot	I
/*     */     //   0	239	2	stack	Lnet/minecraft/item/ItemStack;
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
/*     */   public int func_70302_i_() {
/* 249 */     return (InventorySlots$.MODULE$.relay()).length;
/*     */   }
/*     */   
/* 252 */   public boolean func_94041_b(int slot, ItemStack stack) { return BoxesRunTime.unboxToBoolean(Option$.MODULE$.apply(Driver.driverFor(stack, getClass())).fold((Function0)new Relay$$anonfun$isItemValidForSlot$1(this), (Function1)new Relay$$anonfun$isItemValidForSlot$2(this, slot, stack))); } public final class Relay$$anonfun$isItemValidForSlot$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; }
/*     */     
/*     */     public Relay$$anonfun$isItemValidForSlot$1(Relay $outer) {} }
/*     */   
/*     */   public final class Relay$$anonfun$isItemValidForSlot$2 extends AbstractFunction1<Item, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int slot$1; private final ItemStack stack$1;
/*     */     public Relay$$anonfun$isItemValidForSlot$2(Relay $outer, int slot$1, ItemStack stack$1) {}
/*     */     
/*     */     public final boolean apply(Item driver) {
/*     */       // Byte code:
/*     */       //   0: getstatic li/cil/oc/common/InventorySlots$.MODULE$ : Lli/cil/oc/common/InventorySlots$;
/*     */       //   3: invokevirtual relay : ()[Lli/cil/oc/common/InventorySlots$InventorySlot;
/*     */       //   6: aload_0
/*     */       //   7: getfield slot$1 : I
/*     */       //   10: aaload
/*     */       //   11: astore_2
/*     */       //   12: aload_1
/*     */       //   13: aload_0
/*     */       //   14: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   17: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */       //   22: aload_2
/*     */       //   23: invokevirtual slot : ()Ljava/lang/String;
/*     */       //   26: astore #4
/*     */       //   28: dup
/*     */       //   29: ifnonnull -> 41
/*     */       //   32: pop
/*     */       //   33: aload #4
/*     */       //   35: ifnull -> 49
/*     */       //   38: goto -> 70
/*     */       //   41: aload #4
/*     */       //   43: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   46: ifeq -> 70
/*     */       //   49: aload_1
/*     */       //   50: aload_0
/*     */       //   51: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   54: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */       //   59: aload_2
/*     */       //   60: invokevirtual tier : ()I
/*     */       //   63: if_icmpgt -> 70
/*     */       //   66: iconst_1
/*     */       //   67: goto -> 71
/*     */       //   70: iconst_0
/*     */       //   71: istore_3
/*     */       //   72: aload_2
/*     */       //   73: invokevirtual slot : ()Ljava/lang/String;
/*     */       //   76: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */       //   79: invokevirtual Card : ()Ljava/lang/String;
/*     */       //   82: astore #6
/*     */       //   84: dup
/*     */       //   85: ifnonnull -> 97
/*     */       //   88: pop
/*     */       //   89: aload #6
/*     */       //   91: ifnull -> 105
/*     */       //   94: goto -> 224
/*     */       //   97: aload #6
/*     */       //   99: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   102: ifeq -> 224
/*     */       //   105: aload_0
/*     */       //   106: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   109: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   112: aload_0
/*     */       //   113: getfield $outer : Lli/cil/oc/common/tileentity/Relay;
/*     */       //   116: invokevirtual WirelessNetworkCardTier1 : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   119: astore #7
/*     */       //   121: dup
/*     */       //   122: ifnonnull -> 134
/*     */       //   125: pop
/*     */       //   126: aload #7
/*     */       //   128: ifnull -> 216
/*     */       //   131: goto -> 142
/*     */       //   134: aload #7
/*     */       //   136: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   139: ifne -> 216
/*     */       //   142: aload_0
/*     */       //   143: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   146: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   149: aload_0
/*     */       //   150: getfield $outer : Lli/cil/oc/common/tileentity/Relay;
/*     */       //   153: invokevirtual WirelessNetworkCardTier2 : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   156: astore #8
/*     */       //   158: dup
/*     */       //   159: ifnonnull -> 171
/*     */       //   162: pop
/*     */       //   163: aload #8
/*     */       //   165: ifnull -> 216
/*     */       //   168: goto -> 179
/*     */       //   171: aload #8
/*     */       //   173: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   176: ifne -> 216
/*     */       //   179: aload_0
/*     */       //   180: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   183: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   186: aload_0
/*     */       //   187: getfield $outer : Lli/cil/oc/common/tileentity/Relay;
/*     */       //   190: invokevirtual LinkedCard : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   193: astore #9
/*     */       //   195: dup
/*     */       //   196: ifnonnull -> 208
/*     */       //   199: pop
/*     */       //   200: aload #9
/*     */       //   202: ifnull -> 216
/*     */       //   205: goto -> 220
/*     */       //   208: aload #9
/*     */       //   210: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   213: ifeq -> 220
/*     */       //   216: iconst_1
/*     */       //   217: goto -> 225
/*     */       //   220: iconst_0
/*     */       //   221: goto -> 225
/*     */       //   224: iconst_1
/*     */       //   225: istore #5
/*     */       //   227: iload_3
/*     */       //   228: ifeq -> 240
/*     */       //   231: iload #5
/*     */       //   233: ifeq -> 240
/*     */       //   236: iconst_1
/*     */       //   237: goto -> 241
/*     */       //   240: iconst_0
/*     */       //   241: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #253	-> 0
/*     */       //   #254	-> 12
/*     */       //   #255	-> 72
/*     */       //   #256	-> 142
/*     */       //   #255	-> 225
/*     */       //   #257	-> 227
/*     */       //   #252	-> 241
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	242	0	this	Lli/cil/oc/common/tileentity/Relay$$anonfun$isItemValidForSlot$2;
/*     */       //   0	242	1	driver	Lli/cil/oc/api/driver/Item;
/*     */       //   12	230	2	provided	Lli/cil/oc/common/InventorySlots$InventorySlot;
/*     */       //   72	170	3	tierSatisfied	Z
/*     */       //   227	15	5	cardTypeSatisfied	Z
/*     */     } }
/*     */   
/* 263 */   public void readFromNBTForServer(NBTTagCompound nbt) { IndustrialCraft2Classic.class.readFromNBTForServer((IndustrialCraft2Classic)this, nbt);
/* 264 */     Predef$.MODULE$.refArrayOps((Object[])items()).indices().foreach((Function1)new Relay$$anonfun$readFromNBTForServer$1(this));
/*     */ 
/*     */ 
/*     */     
/* 268 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString())) {
/* 269 */       strength_$eq(RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString())), 0.0D)), maxWirelessRange()));
/*     */     }
/* 271 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString())) {
/* 272 */       isRepeater_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString()));
/*     */     }
/*     */     
/* 275 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("componentNodes").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new Relay$$anonfun$readFromNBTForServer$2(this)); } public final class Relay$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<Object, Option<BoxedUnit>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<BoxedUnit> apply(int slot) { return this.$outer.items()[slot].collect((PartialFunction)new Relay$$anonfun$readFromNBTForServer$1$$anonfun$apply$1(this, slot)); } public Relay$$anonfun$readFromNBTForServer$1(Relay $outer) {} public final class Relay$$anonfun$readFromNBTForServer$1$$anonfun$apply$1 extends AbstractPartialFunction<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final int slot$2; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { ItemStack itemStack = x1; this.$outer.li$cil$oc$common$tileentity$Relay$$anonfun$$$outer().li$cil$oc$common$tileentity$Relay$$updateLimits(this.slot$2, itemStack); return (B1)BoxedUnit.UNIT; } public final boolean isDefinedAt(ItemStack x1) { ItemStack itemStack = x1; return true; } public Relay$$anonfun$readFromNBTForServer$1$$anonfun$apply$1(Relay$$anonfun$readFromNBTForServer$1 $outer, int slot$2) {} } } public final class Relay$$anonfun$readFromNBTForServer$2 extends AbstractFunction1<Tuple2<NBTTagCompound, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x0$2) { Tuple2 tuple2 = x0$2; if (tuple2 != null) {
/* 276 */         NBTTagCompound tag = (NBTTagCompound)tuple2._1(); int index = tuple2._2$mcI$sp(); this.$outer.componentNodes()[index].load(tag); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(tuple2); }
/*     */      public Relay$$anonfun$readFromNBTForServer$2(Relay $outer) {} }
/* 281 */   public void writeToNBTForServer(NBTTagCompound nbt) { IndustrialCraft2Classic.class.writeToNBTForServer((IndustrialCraft2Classic)this, nbt);
/* 282 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("strength").toString(), strength());
/* 283 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRepeater").toString(), isRepeater());
/* 284 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("componentNodes").toString(), (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])componentNodes()).map((Function1)new Relay$$anonfun$writeToNBTForServer$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class))))); } public final class Relay$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<Component, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Component x0$3) { NBTTagCompound nBTTagCompound; Component component = x0$3;
/* 285 */       if (component != null) { Component component1 = component;
/* 286 */         NBTTagCompound tag = new NBTTagCompound();
/* 287 */         component1.save(tag);
/* 288 */         nBTTagCompound = tag; }
/* 289 */       else { nBTTagCompound = new NBTTagCompound(); }
/*     */       
/*     */       return nBTTagCompound; }
/*     */ 
/*     */     
/*     */     public Relay$$anonfun$writeToNBTForServer$1(Relay $outer) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Relay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */