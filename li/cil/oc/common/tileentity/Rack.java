/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneAware;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\005f\001B\001\003\0015\021AAU1dW*\0211\001B\001\013i&dW-\0328uSRL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\031\001qq#\b\021$M%bsf\016\037\021\005=)R\"\001\t\013\005\r\t\"B\001\n\024\003%i\027N\\3de\0064GOC\001\025\003\rqW\r^\005\003-A\021!\002V5mK\026sG/\033;z!\tA2$D\001\032\025\tQ\"!\001\004ue\006LGo]\005\0039e\021Q\002U8xKJ\f5mY3qi>\024\bC\001\r\037\023\ty\022DA\002Ik\n\004\"\001G\021\n\005\tJ\"!\004)po\026\024()\0317b]\016,'\017\005\002\031I%\021Q%\007\002\023\007>l\007o\0348f]RLeN^3oi>\024\030\020\005\002\031O%\021\001&\007\002\n%>$\030\r^1cY\026\004\"\001\007\026\n\005-J\"\001\006\"v]\022dW\r\032*fIN$xN\\3Bo\006\024X\r\005\002\031[%\021a&\007\002\021\003\n\034HO]1di\n+8/Q<be\026\004\"\001M\033\016\003ER!AM\032\002\0179,Go^8sW*\021AGB\001\004CBL\027B\001\0342\005)\te.\0317zu\006\024G.\032\t\003qmj\021!\017\006\003uM\n\001\"\0338uKJt\027\r\\\005\003\003e\002\"\001G\037\n\005yJ\"AC*uCR,\027i^1sK\")\001\t\001C\001\003\0061A(\0338jiz\"\022A\021\t\003\007\002i\021A\001\005\b\013\002\001\r\021\"\001G\0039I7OU3mCf,e.\0312mK\022,\022a\022\t\003\021.k\021!\023\006\002\025\006)1oY1mC&\021A*\023\002\b\005>|G.Z1o\021\035q\005\0011A\005\002=\013!#[:SK2\f\0270\0228bE2,Gm\030\023fcR\021\001k\025\t\003\021FK!AU%\003\tUs\027\016\036\005\b)6\013\t\0211\001H\003\rAH%\r\005\007-\002\001\013\025B$\002\037%\034(+\0327bs\026s\027M\0317fI\002Bq\001\027\001C\002\023\005\021,\001\005mCN$H)\031;b+\005Q\006c\001%\\;&\021A,\023\002\006\003J\024\030-\037\t\003=\006l\021a\030\006\003AF\t1A\0342u\023\t\021wL\001\bO\005R#\026mZ\"p[B|WO\0343\t\r\021\004\001\025!\003[\003%a\027m\035;ECR\f\007\005C\004g\001\t\007I\021A4\002\025!\f7o\0215b]\036,G-F\001i!\rA5l\022\005\007U\002\001\013\021\0025\002\027!\f7o\0215b]\036,G\r\t\005\bY\002\021\r\021\"\001n\003-qw\016Z3NCB\004\030N\\4\026\0039\0042\001S.p!\rA5\f\035\t\004\021F\034\030B\001:J\005\031y\005\017^5p]B\021AO_\007\002k*\021ao^\001\005kRLGN\003\002\006q*\021\021pE\001\017[&tWm\031:bMR4wN]4f\023\tYXO\001\bG_J<W\rR5sK\016$\030n\0348\t\ru\004\001\025!\003o\0031qw\016Z3NCB\004\030N\\4!\021!y\bA1A\005\002\005\005\021\001D:oS\0324WM\035(pI\026\034XCAA\002!\021A5,!\002\021\t![\026q\001\t\004a\005%\021bAA\006c\t!aj\0343f\021!\ty\001\001Q\001\n\005\r\021!D:oS\0324WM\035(pI\026\034\b\005C\004\002\024\001!\t!!\006\002\017\r|gN\\3diR9\001+a\006\002\"\005\025\002\002CA\r\003#\001\r!a\007\002\tMdw\016\036\t\004\021\006u\021bAA\020\023\n\031\021J\034;\t\021\005\r\022\021\003a\001\0037\t\001cY8o]\026\034G/\0312mK&sG-\032=\t\017\005\035\022\021\003a\001a\006!1/\0333f\021\035\tY\003\001C\005\003[\t\021B]3d_:tWm\031;\025\007A\013y\003C\004\0022\005%\002\031A:\002\021AdWoZ*jI\026Dq!!\016\001\t#\t9$\001\ftK:$\007+Y2lKR$v.T8v]R\f'\r\\3t)\025\001\026\021HA\037\021\035\tY$a\rA\002A\f!b]8ve\016,7+\0333f\021!\ty$a\rA\002\005\005\023A\0029bG.,G\017E\0021\003\007J1!!\0222\005\031\001\026mY6fi\"9\021\021\n\001\005B\005-\023\001\005;ss\026s\027/^3vKB\0137m[3u)\0259\025QJA(\021\035\tY$a\022A\002AD\001\"a\020\002H\001\007\021\021\t\005\b\003'\002A\021KA+\003-\021X\r\\1z!\006\0347.\032;\025\013A\0139&!\027\t\017\005m\022\021\013a\001a\"A\021qHA)\001\004\t\t\005C\004\002^\001!\t&a\030\002\033=t\007\013\\;h\007>tg.Z2u)\025\001\026\021MA7\021!\t\031'a\027A\002\005\025\024\001\0029mk\036\004B!a\032\002j5\t\001!C\002\002ly\021A\001\0257vO\"A\021qNA.\001\004\t9!\001\003o_\022,\007bBA:\001\021E\023QO\001\013GJ,\027\r^3O_\022,G\003BA\004\003oB\001\"a\031\002r\001\007\021Q\r\005\b\003w\002A\021IA?\003\035!\027n\0359pg\026$\022\001\025\005\b\003\003\003A\021IAB\003%yg.T3tg\006<W\rF\002Q\003\013C\001\"a\"\002\000\001\007\021\021R\001\b[\026\0348/Y4f!\r\001\0241R\005\004\003\033\013$aB'fgN\fw-\032\005\b\003#\003A\021BAJ\003u\021X\r\\1z\023\032lUm]:bO\0264%o\\7D_:tWm\031;bE2,G#\002)\002\026\006]\005\002CAD\003\037\003\r!!#\t\021\005}\022q\022a\001\003\003Bq!a'\001\t\023\ti*A\rsK2\f\027\020V8D_:tWm\031;bE2,7o\0248TS\022,Gc\002)\002 \006\005\0261\025\005\t\003\017\013I\n1\001\002\n\"A\021qHAM\001\004\t\t\005C\004\002<\005e\005\031A:\t\017\005\035\006\001\"\021\002*\006Q1-\0318D_:tWm\031;\025\007\035\013Y\013C\004\002(\005\025\006\031A:\t\017\005=\006\001\"\021\0022\006I1/\0333fI:{G-\032\013\005\003\017\t\031\fC\004\002(\0055\006\031A:\t\017\005]\006\001\"\025\002:\006a\001.Y:D_:tWm\031;peR\031q)a/\t\017\005\035\022Q\027a\001g\"B\021QWA`\003/\fI\016\005\003\002B\006MWBAAb\025\021\t)-a2\002\025I,G.Y;oG\",'O\003\003\002J\006-\027a\0014nY*!\021QZAh\003\021iw\016Z:\013\005\005E\027aA2qo&!\021Q[Ab\005!\031\026\016Z3P]2L\030!\002<bYV,GEAAn\023\021\ti.a8\002\r\rc\025*\022(U\025\021\t\t/a1\002\tMKG-\032\005\b\003K\004A\021KAt\003%\031wN\0348fGR|'\017\006\003\002j\006E\b\003\002%r\003W\0042\001MAw\023\r\ty/\r\002\n\007>tg.Z2u_JDq!a\n\002d\002\0071\017C\004\002v\002!\t%a>\002!\025tWM]4z)\"\024x.^4iaV$XCAA}!\rA\0251`\005\004\003{L%A\002#pk\ndW\rC\004\003\002\001!\tEa\001\002\023=t\027I\\1msj,G\003DA\003\005\013\0219B!\007\003$\t\035\002\002\003B\004\003\004\rA!\003\002\rAd\027-_3s!\021\021YAa\005\016\005\t5!\002\002B\004\005\037Q1A!\005\022\003\031)g\016^5us&!!Q\003B\007\0051)e\016^5usBc\027-_3s\021!\t9#a@A\002\005m\001\002\003B\016\003\004\rA!\b\002\t!LG\017\027\t\004\021\n}\021b\001B\021\023\n)a\t\\8bi\"A!QEA\000\001\004\021i\"\001\003iSRL\006\002\003B\025\003\004\rA!\b\002\t!LGO\027\005\b\005[\001A\021\tB\030\003MIgn\035;bY2,GmQ8na>tWM\034;t+\t\021\t\004\005\004\0034\t\r#\021\n\b\005\005k\021yD\004\003\0038\tuRB\001B\035\025\r\021Y\004D\001\007yI|w\016\036 \n\003)K1A!\021J\003\035\001\030mY6bO\026LAA!\022\003H\tA\021\n^3sC\ndWMC\002\003B%\0032\001\rB&\023\r\021i%\r\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\004\003R\001!\tEa\025\002\033\035,G/\0238uKJ4\027mY3t)\021\021)F!\034\021\t![&q\013\t\005\0053\022I'\004\002\003\\)!!Q\fB0\003\r\021Wo\035\006\004i\t\005$\002\002B2\005K\nQb\035;be\036\fG/\032;fG\"\024$B\001B4\003%awN\0353g_.\f7/\003\003\003l\tm#!D%CkNLe\016^3sM\006\034W\r\003\005\002(\t=\003\031AA\016Q!\021yE!\035\003\022\nM\005\003\002B:\005\027sAA!\036\003\006:!!q\017BB\035\021\021IH!!\017\t\tm$q\020\b\005\005o\021i(\003\002\002R&!\021QZAh\023\021\tI-a3\n\007\025\t9-\003\003\003\b\n%\025\001C(qi&|g.\0317\013\007\025\t9-\003\003\003\016\n=%AB'fi\"|GM\003\003\003\b\n%\025!B7pI&$\027E\001BK\0035\031F/\031:hCR,G+Z2ie!9!\021\024\001\005B\tm\025\001C4fi^{'\017\0343\026\005\tu\005\003\002BP\005Kk!A!)\013\007\t\r\026#A\003x_JdG-\003\003\003(\n\005&!B,pe2$\007b\002BV\001\021\005#QV\001\021S:$W\r_(g\033>,h\016^1cY\026$B!a\007\0030\"A!\021\027BU\001\004\021\031,A\005n_VtG/\0312mKB!!Q\027B^\033\t\0219LC\002\003:N\n\021bY8na>tWM\034;\n\t\tu&q\027\002\016%\006\0347.T8v]R\f'\r\\3\t\017\t\005\007\001\"\021\003D\006aq-\032;N_VtG/\0312mKR!!1\027Bc\021!\tIBa0A\002\005m\001b\002Be\001\021\005#1Z\001\021O\026$Xj\\;oi\006\024G.\032#bi\006$2!\030Bg\021!\tIBa2A\002\005m\001b\002Bi\001\021\005#1[\001\f[\006\0248n\0215b]\036,G\rF\002Q\005+D\001\"!\007\003P\002\007\0211\004\005\b\0053\004A\021\tBn\003=9W\r^\"veJ,g\016^*uCR,GC\001Bo!\031\021yNa:\003l6\021!\021\035\006\004m\n\r(B\001Bs\003\021Q\027M^1\n\t\t%(\021\035\002\b\013:,XnU3u!\021\021iOa@\017\t\t=(\021 \b\005\005c\0249P\004\003\003t\nUX\"\001\004\n\005Q2\021B\001<4\023\021\021YP!@\002\025M#\030\r^3Bo\006\024XM\003\002wg%!1\021AB\002\005\025\031F/\031;f\025\021\021YP!@\t\017\r\035\001\001\"\025\002~\005\trN\034*pi\006$\030n\0348DQ\006tw-\0323\t\017\r-\001\001\"\025\004\016\0051rN\034*fIN$xN\\3J]B,Ho\0215b]\036,G\rF\002Q\007\037A\001b!\005\004\n\001\00711C\001\005CJ<7\017E\002\031\007+I1aa\006\032\005a\021V\rZ:u_:,7\t[1oO\026$WI^3oi\006\023xm\035\005\b\0077\001A\021IB\017\003A9W\r^*ju\026LeN^3oi>\024\030\020\006\002\002\034!91\021\005\001\005B\ru\021AF4fi&sg/\0328u_JL8\013^1dW2KW.\033;\t\017\r\025\002\001\"\021\004(\005\021\022n]%uK64\026\r\\5e\r>\0248\013\\8u)\02595\021FB\026\021!\tIba\tA\002\005m\001\002CB\027\007G\001\raa\f\002\013M$\030mY6\021\t\rE2qG\007\003\007gQ1a!\016\022\003\021IG/Z7\n\t\re21\007\002\n\023R,Wn\025;bG.Dqa!\020\001\t\003\ni(A\005nCJ\\G)\033:us\"91\021\t\001\005R\r\r\023aC8o\023R,W.\0213eK\022$R\001UB#\007\017B\001\"!\007\004@\001\007\0211\004\005\t\007[\031y\0041\001\0040!911\n\001\005R\r5\023!D8o\023R,WNU3n_Z,G\rF\003Q\007\037\032\t\006\003\005\002\032\r%\003\031AA\016\021!\031ic!\023A\002\r=\002bBB+\001\021E3qK\001\020G>tg.Z2u\023R,WNT8eKR\031\001k!\027\t\021\005=41\013a\001\003\017Aqa!\030\001\t\003\ni(\001\007va\022\fG/Z#oi&$\030\020C\004\004b\001!\tea\031\002)I,\027\r\032$s_6t%\t\026$peN+'O^3s)\r\0016Q\r\005\007A\016}\003\031A/\t\017\r%\004\001\"\021\004l\005\031rO]5uKR{gJ\021+G_J\034VM\035<feR\031\001k!\034\t\r\001\0349\0071\001^\021\035\031\t\b\001C!\007g\nAC]3bI\032\023x.\034(C)\032{'o\0217jK:$Hc\001)\004v!1\001ma\034A\002uC\003ba\034\002@\006]\027\021\034\005\b\007w\002A\021IB?\003M9(/\033;f)>t%\t\026$pe\016c\027.\0328u)\r\0016q\020\005\007A\016e\004\031A/\t\017\r\r\005\001\"\001\004\006\00611\017\\8u\003R$\"ba\"\004\n\016-5QRBH!\021A\025/a\007\t\017\005\0352\021\021a\001g\"A!1DBA\001\004\021i\002\003\005\003&\r\005\005\031\001B\017\021!\021Ic!!A\002\tu\001bBBJ\001\021\0051QS\001\nSN<vN]6j]\036$2aRBL\021!\021\tl!%A\002\tM\006BBBN\001\021\005a)\001\niCN\f%m\035;sC\016$()^:DCJ$\007BBBP\001\021\005a)A\biCN\024V\rZ:u_:,7)\031:e\001")
/*     */ public class Rack extends TileEntity implements PowerAcceptor, Hub, PowerBalancer, ComponentInventory, Rotatable, BundledRedstoneAware, AbstractBusAware, Analyzable, Rack, StateAware {
/*     */   private boolean isRelayEnabled;
/*     */   private final NBTTagCompound[] lastData;
/*     */   private final boolean[] hasChanged;
/*     */   private final Option<ForgeDirection>[][] nodeMapping;
/*     */   private final Node[][] snifferNodes;
/*     */   private boolean _isAbstractBusAvailable;
/*     */   private final Object[] fakeInterface;
/*     */   private final int[][] _bundledInput;
/*     */   private final int[][] _rednetInput;
/*     */   private final int[][] _bundledOutput;
/*     */   private final int[] _input;
/*     */   private final int[] _output;
/*     */   private boolean _isOutputEnabled;
/*     */   private boolean shouldUpdateInput;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction;
/*     */   private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction;
/*     */   private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch;
/*     */   private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual;
/*     */   private final ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual;
/*     */   private boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled;
/*     */   private Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components;
/*     */   private boolean isSizeInventoryReady;
/*     */   private final ArrayBuffer<ManagedEnvironment> updatingComponents;
/*     */   
/*     */   @Method(modid = "BuildCraft|Core")
/*  41 */   public boolean hasWork() { return StateAware.class.hasWork(this); } private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory; private double globalBuffer; private double globalBufferSize; private double li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio; private int li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync; private final Hub.Plug[] plugs; private final Queue<Tuple2<Option<ForgeDirection>, Packet>> queue; private int maxQueueSize; private int relayDelay; private int relayAmount; private int relayCooldown; private final MovingAverage packetsPerCycleAvg; private boolean isChangeScheduled; private boolean moving; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; private long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; private boolean addedToIC2PowerGrid; @Method(modid = "factorization") private final Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge; private Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; private volatile byte bitmap$0; public boolean _isAbstractBusAvailable() { return this._isAbstractBusAvailable; } public void _isAbstractBusAvailable_$eq(boolean x$1) { this._isAbstractBusAvailable = x$1; } private Object[] fakeInterface$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.fakeInterface = AbstractBusAware.class.fakeInterface(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.fakeInterface; }  } public Object[] fakeInterface() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? fakeInterface$lzycompute() : this.fakeInterface; } public int getXCoord() { return AbstractBusAware.class.getXCoord(this); } public int getYCoord() { return AbstractBusAware.class.getYCoord(this); } public int getZCoord() { return AbstractBusAware.class.getZCoord(this); } public boolean isAbstractBusAvailable() { return AbstractBusAware.class.isAbstractBusAvailable(this); } public AbstractBusAware isAbstractBusAvailable_$eq(boolean value) { return AbstractBusAware.class.isAbstractBusAvailable_$eq(this, value); } public void onDisconnect(Node node) { AbstractBusAware.class.onDisconnect(this, node); } public int[][] _bundledInput() { return this._bundledInput; } public int[][] _rednetInput() { return this._rednetInput; } public int[][] _bundledOutput() { return this._bundledOutput; } public void li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_bundledInput_$eq(int[][] x$1) { this._bundledInput = x$1; } public void li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_rednetInput_$eq(int[][] x$1) { this._rednetInput = x$1; } public void li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_bundledOutput_$eq(int[][] x$1) { this._bundledOutput = x$1; } public void setOutputEnabled(boolean value) { BundledRedstoneAware.class.setOutputEnabled(this, value); } public int[][] getBundledInput() { return BundledRedstoneAware.class.getBundledInput(this); } public int[] getBundledInput(ForgeDirection side) { return BundledRedstoneAware.class.getBundledInput(this, side); } public int getBundledInput(ForgeDirection side, int color) { return BundledRedstoneAware.class.getBundledInput(this, side, color); } public void setBundledInput(ForgeDirection side, int color, int newValue) { BundledRedstoneAware.class.setBundledInput(this, side, color, newValue); } public void setBundledInput(ForgeDirection side, int[] newBundledInput) { BundledRedstoneAware.class.setBundledInput(this, side, newBundledInput); } public void setRednetInput(ForgeDirection side, int color, int value) { BundledRedstoneAware.class.setRednetInput(this, side, color, value); } public void updateInput(int[][] inputs, ForgeDirection side, int color, int newValue) { BundledRedstoneAware.class.updateInput(this, inputs, side, color, newValue); } public int[][] getBundledOutput() { return BundledRedstoneAware.class.getBundledOutput(this); } public int[] getBundledOutput(ForgeDirection side) { return BundledRedstoneAware.class.getBundledOutput(this, side); } public int getBundledOutput(ForgeDirection side, int color) { return BundledRedstoneAware.class.getBundledOutput(this, side, color); } public void notifyChangedSide(ForgeDirection side) { BundledRedstoneAware.class.notifyChangedSide(this, side); } public boolean setBundledOutput(ForgeDirection side, int color, int value) { return BundledRedstoneAware.class.setBundledOutput(this, side, color, value); } public boolean setBundledOutput(ForgeDirection side, Map values) { return BundledRedstoneAware.class.setBundledOutput(this, side, values); } public boolean setBundledOutput(Map values) { return BundledRedstoneAware.class.setBundledOutput(this, values); } public void updateRedstoneInput(ForgeDirection side) { BundledRedstoneAware.class.updateRedstoneInput(this, side); } public void onRedstoneOutputEnabledChanged() { BundledRedstoneAware.class.onRedstoneOutputEnabledChanged(this); } @Method(modid = "RedLogic") public byte[] getBundledCableStrength(int blockFace, int toDirection) { return BundledRedstoneAware.class.getBundledCableStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onBundledInputChanged() { BundledRedstoneAware.class.onBundledInputChanged(this); } @Method(modid = "ProjRed|Transmission") public boolean canConnectBundled(int side) { return BundledRedstoneAware.class.canConnectBundled(this, side); } @Method(modid = "ProjRed|Transmission") public byte[] getBundledSignal(int side) { return BundledRedstoneAware.class.getBundledSignal(this, side); } public int[] _input() { return this._input; } public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled((RedstoneAware)this); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy((RedstoneAware)this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt((RedstoneAware)this, value); } public int[] getInput() { return RedstoneAware.class.getInput((RedstoneAware)this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput((RedstoneAware)this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput((RedstoneAware)this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput((RedstoneAware)this, values); } public int maxInput() { return RedstoneAware.class.maxInput((RedstoneAware)this); } public int[] getOutput() { return RedstoneAware.class.getOutput((RedstoneAware)this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput((RedstoneAware)this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput((RedstoneAware)this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput((RedstoneAware)this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged((RedstoneAware)this); } public void func_145829_t() { RedstoneAware.class.validate((RedstoneAware)this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged((RedstoneAware)this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects((RedstoneAware)this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner((RedstoneAware)this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength((RedstoneAware)this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged((RedstoneAware)this); } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } public ForgeDirection[] validFacings() { return Rotatable.class.validFacings(this); } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingRemovalsActual; } private ArrayBuffer li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual = ComponentInventory.class.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; }  } public ArrayBuffer<Option<ItemStack>> li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual$lzycompute() : this.li$cil$oc$common$tileentity$traits$ComponentInventory$$pendingAddsActual; } public boolean li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled() { return this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled; } public void li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled_$eq(boolean x$1) { this.li$cil$oc$common$tileentity$traits$ComponentInventory$$updateScheduled = x$1; } public ComponentInventory host() { return ComponentInventory.class.host(this); } public ArrayBuffer<Option<ItemStack>> pendingRemovals() { return ComponentInventory.class.pendingRemovals(this); } public ArrayBuffer<Option<ItemStack>> pendingAdds() { return ComponentInventory.class.pendingAdds(this); } public void save(ManagedEnvironment component, Item driver, ItemStack stack) { ComponentInventory.class.save(this, component, driver, stack); } public void initialize() { ComponentInventory.class.initialize(this); } public void onConnect(Node node) { ComponentInventory.class.onConnect(this, node); } public Option<ManagedEnvironment>[] li$cil$oc$common$inventory$ComponentInventory$$_components() { return this.li$cil$oc$common$inventory$ComponentInventory$$_components; } @TraitSetter public void li$cil$oc$common$inventory$ComponentInventory$$_components_$eq(Option[] x$1) { this.li$cil$oc$common$inventory$ComponentInventory$$_components = (Option<ManagedEnvironment>[])x$1; } public boolean isSizeInventoryReady() { return this.isSizeInventoryReady; } @TraitSetter public void isSizeInventoryReady_$eq(boolean x$1) { this.isSizeInventoryReady = x$1; } public ArrayBuffer<ManagedEnvironment> updatingComponents() { return this.updatingComponents; } public void li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq(ArrayBuffer<ManagedEnvironment> x$1) { this.updatingComponents = x$1; } public Option<ManagedEnvironment>[] components() { return (Option<ManagedEnvironment>[])ComponentInventory.class.components((ComponentInventory)this); } public void updateComponents() { ComponentInventory.class.updateComponents((ComponentInventory)this); } public void connectComponents() { ComponentInventory.class.connectComponents((ComponentInventory)this); } public void disconnectComponents() { ComponentInventory.class.disconnectComponents((ComponentInventory)this); } public void save(NBTTagCompound nbt) { ComponentInventory.class.save((ComponentInventory)this, nbt); } public void saveComponents() { ComponentInventory.class.saveComponents((ComponentInventory)this); } public boolean isComponentSlot(int slot, ItemStack stack) { return ComponentInventory.class.isComponentSlot((ComponentInventory)this, slot, stack); } public NBTTagCompound dataTag(Item driver, ItemStack stack) { return ComponentInventory.class.dataTag((ComponentInventory)this, driver, stack); } public void applyLifecycleState(Object component, Lifecycle.LifecycleState state) { ComponentInventory.class.applyLifecycleState((ComponentInventory)this, component, state); } private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory((Inventory)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items((Inventory)this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer((Inventory)this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot((Inventory)this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots((Inventory)this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld((Inventory)this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2((Inventory)this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3((Inventory)this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2((Inventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public double globalBuffer() { return this.globalBuffer; } public void globalBuffer_$eq(double x$1) { this.globalBuffer = x$1; } public double globalBufferSize() { return this.globalBufferSize; } public void globalBufferSize_$eq(double x$1) { this.globalBufferSize = x$1; } public Tuple2<Object, Object> distribute() { return PowerBalancer.class.distribute(this); } public double li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio() { return this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio; } public void li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio = x$1; } public int li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync() { return this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync; } public void li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync = x$1; } public void updatePowerInformation() { PowerInformation.class.updatePowerInformation((PowerInformation)this); } public Hub.Plug[] plugs() { return this.plugs; } public Queue<Tuple2<Option<ForgeDirection>, Packet>> queue() { return this.queue; } public int maxQueueSize() { return this.maxQueueSize; } public void maxQueueSize_$eq(int x$1) { this.maxQueueSize = x$1; } public int relayDelay() { return this.relayDelay; } public void relayDelay_$eq(int x$1) { this.relayDelay = x$1; } public int relayAmount() { return this.relayAmount; } public void relayAmount_$eq(int x$1) { this.relayAmount = x$1; } public int relayCooldown() { return this.relayCooldown; } public void relayCooldown_$eq(int x$1) { this.relayCooldown = x$1; } public MovingAverage packetsPerCycleAvg() { return this.packetsPerCycleAvg; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$plugs_$eq(Hub.Plug[] x$1) { this.plugs = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$queue_$eq(Queue<Tuple2<Option<ForgeDirection>, Packet>> x$1) { this.queue = x$1; } public void li$cil$oc$common$tileentity$traits$Hub$_setter_$packetsPerCycleAvg_$eq(MovingAverage x$1) { this.packetsPerCycleAvg = x$1; } public Node node() { return Hub.class.node(this); } public boolean isConnected() { return Hub.class.isConnected(this); } public int queueBaseSize() { return Hub.class.queueBaseSize(this); } public int queueSizePerUpgrade() { return Hub.class.queueSizePerUpgrade(this); } public int relayBaseDelay() { return Hub.class.relayBaseDelay(this); } public double relayDelayPerUpgrade() { return Hub.class.relayDelayPerUpgrade(this); } public int relayBaseAmount() { return Hub.class.relayBaseAmount(this); } public int relayAmountPerUpgrade() { return Hub.class.relayAmountPerUpgrade(this); } public Hub.Plug createPlug(ForgeDirection side) { return Hub.class.createPlug(this, side); } public void onPlugDisconnect(Hub.Plug plug, Node node) { Hub.class.onPlugDisconnect(this, plug, node); } public void onPlugMessage(Hub.Plug plug, Message message) { Hub.class.onPlugMessage(this, plug, message); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque = x$1; } public long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(long x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha = x$1; } @Method(modid = "RotaryCraft") public int getOmega() { return RotaryCraft.class.getOmega((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getTorque() { return RotaryCraft.class.getTorque((RotaryCraft)this); } @Method(modid = "RotaryCraft") public long getPower() { return RotaryCraft.class.getPower((RotaryCraft)this); } @Method(modid = "RotaryCraft") public String getName() { return RotaryCraft.class.getName((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getIORenderAlpha() { return RotaryCraft.class.getIORenderAlpha((RotaryCraft)this); } @Method(modid = "RotaryCraft") public void setIORenderAlpha(int value) { RotaryCraft.class.setIORenderAlpha((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setOmega(int value) { RotaryCraft.class.setOmega((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setTorque(int value) { RotaryCraft.class.setTorque((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setPower(long value) { RotaryCraft.class.setPower((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void noInputMachine() { RotaryCraft.class.noInputMachine((RotaryCraft)this); } @Method(modid = "RotaryCraft") public boolean canReadFrom(ForgeDirection forgeDirection) { return RotaryCraft.class.canReadFrom((RotaryCraft)this, forgeDirection); } @Method(modid = "RotaryCraft") public boolean isReceiving() { return RotaryCraft.class.isReceiving((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getMinTorque(int available) { return RotaryCraft.class.getMinTorque((RotaryCraft)this, available); } @Method(modid = "CoFHAPI|energy") public boolean canConnectEnergy(ForgeDirection from) { return RedstoneFlux.class.canConnectEnergy((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) { return RedstoneFlux.class.receiveEnergy((RedstoneFlux)this, from, maxReceive, simulate); } @Method(modid = "CoFHAPI|energy") public int getEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int getMaxEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getMaxEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) { return RedstoneFlux.class.extractEnergy((RedstoneFlux)this, from, maxExtract, simulate); } @Method(modid = "Mekanism") public boolean canReceiveEnergy(ForgeDirection side) { return Mekanism.class.canReceiveEnergy((Mekanism)this, side); } @Method(modid = "Mekanism") public double transferEnergyToAcceptor(ForgeDirection side, double amount) { return Mekanism.class.transferEnergyToAcceptor((Mekanism)this, side, amount); } @Method(modid = "Mekanism") public double getMaxEnergy() { return Mekanism.class.getMaxEnergy((Mekanism)this); } @Method(modid = "Mekanism") public double getEnergy() { return Mekanism.class.getEnergy((Mekanism)this); } @Method(modid = "Mekanism") public void setEnergy(double energy) { Mekanism.class.setEnergy((Mekanism)this, energy); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer = x$1; } public void func_145843_s() { IndustrialCraft2Classic.class.invalidate((IndustrialCraft2Classic)this); } public void onChunkUnload() { IndustrialCraft2Classic.class.onChunkUnload((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean isAddedToEnergyNet() { return IndustrialCraft2Classic.class.isAddedToEnergyNet((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public int getMaxSafeInput() { return IndustrialCraft2Classic.class.getMaxSafeInput((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) { return IndustrialCraft2Classic.class.acceptsEnergyFrom((IndustrialCraft2Classic)this, emitter, direction); } @Method(modid = "IC2-Classic") public boolean injectEnergy(Direction directionFrom, int amount) { return IndustrialCraft2Classic.class.injectEnergy((IndustrialCraft2Classic)this, directionFrom, amount); } @Method(modid = "IC2-Classic") public int demandsEnergy() { return IndustrialCraft2Classic.class.demandsEnergy((IndustrialCraft2Classic)this); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer = x$1; } @Method(modid = "IC2") public int getSinkTier() { return IndustrialCraft2Experimental.class.getSinkTier((IndustrialCraft2Experimental)this); } @Method(modid = "IC2") public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) { return IndustrialCraft2Experimental.class.acceptsEnergyFrom((IndustrialCraft2Experimental)this, emitter, direction); } @Method(modid = "IC2") public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) { return IndustrialCraft2Experimental.class.injectEnergy((IndustrialCraft2Experimental)this, directionFrom, amount, voltage); } @Method(modid = "IC2") public double getDemandedEnergy() { return IndustrialCraft2Experimental.class.getDemandedEnergy((IndustrialCraft2Experimental)this); } public boolean addedToIC2PowerGrid() { return this.addedToIC2PowerGrid; } public void addedToIC2PowerGrid_$eq(boolean x$1) { this.addedToIC2PowerGrid = x$1; } @Method(modid = "Galacticraft API") public boolean nodeAvailable(EnergySource from) { return Galacticraft.class.nodeAvailable((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float receiveEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.receiveEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public float getEnergyStoredGC(EnergySource from) { return Galacticraft.class.getEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float getMaxEnergyStoredGC(EnergySource from) { return Galacticraft.class.getMaxEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float extractEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.extractEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public boolean canConnect(ForgeDirection from, NetworkType networkType) { return Galacticraft.class.canConnect((Galacticraft)this, from, networkType); } private Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x10) == 0) { this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge = Factorization.class.li$cil$oc$common$tileentity$traits$power$Factorization$$charge((Factorization)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x10); }  return this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; }  } public Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge() { return ((byte)(this.bitmap$0 & 0x10) == 0) ? li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() : this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; } @Method(modid = "factorization") public Charge getCharge() { return Factorization.class.getCharge((Factorization)this); } @Method(modid = "factorization") public String getInfo() { return Factorization.class.getInfo((Factorization)this); } @Method(modid = "factorization") public Coord getCoord() { return Factorization.class.getCoord((Factorization)this); } public Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node() { return this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; } public void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> x$1) { this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node = x$1; } @Method(modid = "appliedenergistics2") public IGridNode getGridNode(ForgeDirection side) { return AppliedEnergistics2.class.getGridNode((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public AECableType getCableConnectionType(ForgeDirection side) { return AppliedEnergistics2.class.getCableConnectionType((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public void securityBreak() { AppliedEnergistics2.class.securityBreak((AppliedEnergistics2)this); } public void tryAllSides(Function2 provider, Function1 fromOther, Function1 toOther) { Common.class.tryAllSides((Common)this, provider, fromOther, toOther); } public boolean canConnectPower(ForgeDirection side) { return Common.class.canConnectPower((Common)this, side); } public double tryChangeBuffer(ForgeDirection side, double amount, boolean doReceive) { return Common.class.tryChangeBuffer((Common)this, side, amount, doReceive); } public double globalBuffer(ForgeDirection side) { return Common.class.globalBuffer((Common)this, side); } public double globalBufferSize(ForgeDirection side) { return Common.class.globalBufferSize((Common)this, side); } public double globalDemand(ForgeDirection side) { return Common.class.globalDemand((Common)this, side); } public boolean tryChangeBuffer$default$3() { return Common.class.tryChangeBuffer$default$3((Common)this); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Rack() { TileEntity.class.$init$((TileEntity)this); Common.class.$init$((Common)this); AppliedEnergistics2.class.$init$((AppliedEnergistics2)this); Factorization.class.$init$((Factorization)this); Galacticraft.class.$init$((Galacticraft)this); IndustrialCraft2Common.class.$init$((IndustrialCraft2Common)this); IndustrialCraft2Experimental.class.$init$((IndustrialCraft2Experimental)this); IndustrialCraft2Classic.class.$init$((IndustrialCraft2Classic)this); Mekanism.class.$init$((Mekanism)this); RedstoneFlux.class.$init$((RedstoneFlux)this); RotaryCraft.class.$init$((RotaryCraft)this); Environment.class.$init$((Environment)this); Hub.class.$init$(this); PowerInformation.class.$init$((PowerInformation)this); PowerBalancer.class.$init$(this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$((Inventory)this); ComponentInventory.class.$init$((ComponentInventory)this); ComponentInventory.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this); RedstoneAware.class.$init$((RedstoneAware)this); BundledRedstoneAware.class.$init$(this); AbstractBusAware.class.$init$(this); StateAware.class.$init$(this);
/*  42 */     this.isRelayEnabled = false;
/*  43 */     this.lastData = new NBTTagCompound[func_70302_i_()];
/*  44 */     this.hasChanged = (boolean[])Array$.MODULE$.fill(func_70302_i_(), (Function0)new Rack$$anonfun$1(this), ClassTag$.MODULE$.Boolean());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     this.nodeMapping = (Option<ForgeDirection>[][])Array$.MODULE$.fill(func_70302_i_(), (Function0)new Rack$$anonfun$2(this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(Option.class)));
/*  54 */     this.snifferNodes = (Node[][])Array$.MODULE$.fill(func_70302_i_(), (Function0)new Rack$$anonfun$3(this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(Node.class))); } public boolean isRelayEnabled() { return this.isRelayEnabled; } public void isRelayEnabled_$eq(boolean x$1) { this.isRelayEnabled = x$1; } public NBTTagCompound[] lastData() { return this.lastData; } public boolean[] hasChanged() { return this.hasChanged; } public final class Rack$$anonfun$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } public Rack$$anonfun$1(Rack $outer) {} } public Option<ForgeDirection>[][] nodeMapping() { return this.nodeMapping; } public final class Rack$$anonfun$2 extends AbstractFunction0<Option<ForgeDirection>[]> implements Serializable { public static final long serialVersionUID = 0L; public final Option<ForgeDirection>[] apply() { return (Option<ForgeDirection>[])Array$.MODULE$.fill(4, (Function0)new Rack$$anonfun$2$$anonfun$apply$2(this), ClassTag$.MODULE$.apply(Option.class)); } public Rack$$anonfun$2(Rack $outer) {} public final class Rack$$anonfun$2$$anonfun$apply$2 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; } public Rack$$anonfun$2$$anonfun$apply$2(Rack$$anonfun$2 $outer) {} } } public Node[][] snifferNodes() { return this.snifferNodes; } public final class Rack$$anonfun$3 extends AbstractFunction0<Node[]> implements Serializable { public static final long serialVersionUID = 0L; public final Node[] apply() { return (Node[])Array$.MODULE$.fill(3, (Function0)new Rack$$anonfun$3$$anonfun$apply$3(this), ClassTag$.MODULE$.apply(Node.class)); } public Rack$$anonfun$3(Rack $outer) {} public final class Rack$$anonfun$3$$anonfun$apply$3 extends AbstractFunction0<Node> implements Serializable { public static final long serialVersionUID = 0L; public final Node apply() { return Network.newNode((Environment)this.$outer.li$cil$oc$common$tileentity$Rack$$anonfun$$$outer(), Visibility.Neighbors).create(); }
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
/*     */       public Rack$$anonfun$3$$anonfun$apply$3(Rack$$anonfun$3 $outer) {} }
/*     */      }
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
/*     */   public void connect(int slot, int connectableIndex, Option side) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: astore #5
/*     */     //   3: aload #5
/*     */     //   5: instanceof scala/Some
/*     */     //   8: ifeq -> 97
/*     */     //   11: aload #5
/*     */     //   13: checkcast scala/Some
/*     */     //   16: astore #6
/*     */     //   18: aload #6
/*     */     //   20: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   23: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   26: astore #7
/*     */     //   28: aload #7
/*     */     //   30: getstatic net/minecraftforge/common/util/ForgeDirection.UNKNOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   33: astore #8
/*     */     //   35: dup
/*     */     //   36: ifnonnull -> 48
/*     */     //   39: pop
/*     */     //   40: aload #8
/*     */     //   42: ifnull -> 97
/*     */     //   45: goto -> 56
/*     */     //   48: aload #8
/*     */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   53: ifne -> 97
/*     */     //   56: aload #7
/*     */     //   58: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   61: astore #9
/*     */     //   63: dup
/*     */     //   64: ifnonnull -> 76
/*     */     //   67: pop
/*     */     //   68: aload #9
/*     */     //   70: ifnull -> 97
/*     */     //   73: goto -> 84
/*     */     //   76: aload #9
/*     */     //   78: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   81: ifne -> 97
/*     */     //   84: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   87: aload #7
/*     */     //   89: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   92: astore #10
/*     */     //   94: goto -> 102
/*     */     //   97: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   100: astore #10
/*     */     //   102: aload #10
/*     */     //   104: astore #4
/*     */     //   106: aload_0
/*     */     //   107: invokevirtual nodeMapping : ()[[Lscala/Option;
/*     */     //   110: iload_1
/*     */     //   111: aaload
/*     */     //   112: iload_2
/*     */     //   113: iconst_1
/*     */     //   114: iadd
/*     */     //   115: aaload
/*     */     //   116: astore #11
/*     */     //   118: aload #11
/*     */     //   120: aload #4
/*     */     //   122: astore #12
/*     */     //   124: dup
/*     */     //   125: ifnonnull -> 137
/*     */     //   128: pop
/*     */     //   129: aload #12
/*     */     //   131: ifnull -> 145
/*     */     //   134: goto -> 146
/*     */     //   137: aload #12
/*     */     //   139: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   142: ifeq -> 146
/*     */     //   145: return
/*     */     //   146: aload_0
/*     */     //   147: iload_1
/*     */     //   148: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*     */     //   151: astore #13
/*     */     //   153: aload #13
/*     */     //   155: ifnull -> 238
/*     */     //   158: aload #11
/*     */     //   160: invokevirtual isDefined : ()Z
/*     */     //   163: ifeq -> 238
/*     */     //   166: iload_2
/*     */     //   167: iconst_m1
/*     */     //   168: if_icmpne -> 220
/*     */     //   171: aload #13
/*     */     //   173: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   178: astore #14
/*     */     //   180: aload_0
/*     */     //   181: aload_0
/*     */     //   182: aload #11
/*     */     //   184: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   187: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   190: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   193: invokevirtual sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*     */     //   196: astore #15
/*     */     //   198: aload #14
/*     */     //   200: ifnull -> 238
/*     */     //   203: aload #15
/*     */     //   205: ifnull -> 238
/*     */     //   208: aload #14
/*     */     //   210: aload #15
/*     */     //   212: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   217: goto -> 238
/*     */     //   220: iload_2
/*     */     //   221: iconst_0
/*     */     //   222: if_icmplt -> 238
/*     */     //   225: aload_0
/*     */     //   226: invokevirtual snifferNodes : ()[[Lli/cil/oc/api/network/Node;
/*     */     //   229: iload_1
/*     */     //   230: aaload
/*     */     //   231: iload_2
/*     */     //   232: aaload
/*     */     //   233: invokeinterface remove : ()V
/*     */     //   238: aload_0
/*     */     //   239: invokevirtual nodeMapping : ()[[Lscala/Option;
/*     */     //   242: iload_1
/*     */     //   243: aaload
/*     */     //   244: iload_2
/*     */     //   245: iconst_1
/*     */     //   246: iadd
/*     */     //   247: aload #4
/*     */     //   249: aastore
/*     */     //   250: aload #13
/*     */     //   252: ifnull -> 403
/*     */     //   255: aload #4
/*     */     //   257: invokevirtual isDefined : ()Z
/*     */     //   260: ifeq -> 403
/*     */     //   263: iload_2
/*     */     //   264: iconst_m1
/*     */     //   265: if_icmpne -> 317
/*     */     //   268: aload #13
/*     */     //   270: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   275: astore #16
/*     */     //   277: aload_0
/*     */     //   278: aload_0
/*     */     //   279: aload #4
/*     */     //   281: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   284: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   287: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   290: invokevirtual sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*     */     //   293: astore #17
/*     */     //   295: aload #16
/*     */     //   297: ifnull -> 403
/*     */     //   300: aload #17
/*     */     //   302: ifnull -> 403
/*     */     //   305: aload #16
/*     */     //   307: aload #17
/*     */     //   309: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   314: goto -> 403
/*     */     //   317: iload_2
/*     */     //   318: iconst_0
/*     */     //   319: if_icmplt -> 403
/*     */     //   322: iload_2
/*     */     //   323: aload #13
/*     */     //   325: invokeinterface getConnectableCount : ()I
/*     */     //   330: if_icmpge -> 403
/*     */     //   333: aload #13
/*     */     //   335: iload_2
/*     */     //   336: invokeinterface getConnectableAt : (I)Lli/cil/oc/api/component/RackBusConnectable;
/*     */     //   341: astore #18
/*     */     //   343: aload #18
/*     */     //   345: ifnull -> 403
/*     */     //   348: aload #18
/*     */     //   350: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   355: ifnull -> 403
/*     */     //   358: aload #18
/*     */     //   360: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   365: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   370: ifnonnull -> 383
/*     */     //   373: aload #18
/*     */     //   375: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   380: invokestatic joinNewNetwork : (Lli/cil/oc/api/network/Node;)V
/*     */     //   383: aload #18
/*     */     //   385: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   390: aload_0
/*     */     //   391: invokevirtual snifferNodes : ()[[Lli/cil/oc/api/network/Node;
/*     */     //   394: iload_1
/*     */     //   395: aaload
/*     */     //   396: iload_2
/*     */     //   397: aaload
/*     */     //   398: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   403: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 0
/*     */     //   #58	-> 3
/*     */     //   #59	-> 97
/*     */     //   #57	-> 102
/*     */     //   #62	-> 106
/*     */     //   #63	-> 118
/*     */     //   #66	-> 146
/*     */     //   #67	-> 153
/*     */     //   #68	-> 166
/*     */     //   #69	-> 171
/*     */     //   #70	-> 180
/*     */     //   #71	-> 198
/*     */     //   #72	-> 208
/*     */     //   #75	-> 220
/*     */     //   #76	-> 225
/*     */     //   #80	-> 238
/*     */     //   #83	-> 250
/*     */     //   #84	-> 263
/*     */     //   #85	-> 268
/*     */     //   #86	-> 277
/*     */     //   #87	-> 295
/*     */     //   #88	-> 305
/*     */     //   #91	-> 317
/*     */     //   #92	-> 333
/*     */     //   #93	-> 343
/*     */     //   #94	-> 358
/*     */     //   #95	-> 373
/*     */     //   #97	-> 383
/*     */     //   #56	-> 403
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	404	0	this	Lli/cil/oc/common/tileentity/Rack;
/*     */     //   0	404	1	slot	I
/*     */     //   0	404	2	connectableIndex	I
/*     */     //   0	404	3	side	Lscala/Option;
/*     */     //   28	376	7	direction	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   106	298	4	newSide	Lscala/Option;
/*     */     //   118	286	11	oldSide	Lscala/Option;
/*     */     //   153	251	13	mountable	Lli/cil/oc/api/component/RackMountable;
/*     */     //   180	224	14	node	Lli/cil/oc/api/network/Node;
/*     */     //   198	206	15	plug	Lli/cil/oc/api/network/Node;
/*     */     //   277	127	16	node	Lli/cil/oc/api/network/Node;
/*     */     //   295	109	17	plug	Lli/cil/oc/api/network/Node;
/*     */     //   343	61	18	connectable	Lli/cil/oc/api/component/RackBusConnectable;
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
/*     */   
/*     */   private void reconnect(ForgeDirection plugSide)
/*     */   {
/* 104 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Rack$$anonfun$reconnect$1(this, plugSide)); } public final class Rack$$anonfun$reconnect$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final ForgeDirection plugSide$1; public final void apply(int slot) { apply$mcVI$sp(slot); }
/*     */     
/*     */     public Rack$$anonfun$reconnect$1(Rack $outer, ForgeDirection plugSide$1) {}
/*     */     public void apply$mcVI$sp(int slot) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $outer : Lli/cil/oc/common/tileentity/Rack;
/*     */       //   4: invokevirtual nodeMapping : ()[[Lscala/Option;
/*     */       //   7: iload_1
/*     */       //   8: aaload
/*     */       //   9: astore_2
/*     */       //   10: aload_2
/*     */       //   11: iconst_0
/*     */       //   12: aaload
/*     */       //   13: astore_3
/*     */       //   14: aload_3
/*     */       //   15: instanceof scala/Some
/*     */       //   18: ifeq -> 186
/*     */       //   21: aload_3
/*     */       //   22: checkcast scala/Some
/*     */       //   25: astore #4
/*     */       //   27: aload #4
/*     */       //   29: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   32: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */       //   35: astore #5
/*     */       //   37: aload_0
/*     */       //   38: getfield $outer : Lli/cil/oc/common/tileentity/Rack;
/*     */       //   41: aload #5
/*     */       //   43: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   46: aload_0
/*     */       //   47: getfield plugSide$1 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   50: astore #6
/*     */       //   52: dup
/*     */       //   53: ifnonnull -> 65
/*     */       //   56: pop
/*     */       //   57: aload #6
/*     */       //   59: ifnull -> 73
/*     */       //   62: goto -> 186
/*     */       //   65: aload #6
/*     */       //   67: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   70: ifeq -> 186
/*     */       //   73: aload_0
/*     */       //   74: getfield $outer : Lli/cil/oc/common/tileentity/Rack;
/*     */       //   77: iload_1
/*     */       //   78: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*     */       //   81: astore #8
/*     */       //   83: aload_0
/*     */       //   84: getfield $outer : Lli/cil/oc/common/tileentity/Rack;
/*     */       //   87: aload_0
/*     */       //   88: getfield plugSide$1 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   91: invokevirtual sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*     */       //   94: astore #9
/*     */       //   96: aload #9
/*     */       //   98: ifnull -> 148
/*     */       //   101: aload #8
/*     */       //   103: ifnull -> 148
/*     */       //   106: aload #8
/*     */       //   108: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */       //   113: ifnull -> 148
/*     */       //   116: aload #9
/*     */       //   118: aload #8
/*     */       //   120: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */       //   125: astore #10
/*     */       //   127: dup
/*     */       //   128: ifnonnull -> 140
/*     */       //   131: pop
/*     */       //   132: aload #10
/*     */       //   134: ifnull -> 148
/*     */       //   137: goto -> 154
/*     */       //   140: aload #10
/*     */       //   142: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   145: ifeq -> 154
/*     */       //   148: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   151: goto -> 181
/*     */       //   154: aload #8
/*     */       //   156: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */       //   161: invokestatic joinNewNetwork : (Lli/cil/oc/api/network/Node;)V
/*     */       //   164: aload #9
/*     */       //   166: aload #8
/*     */       //   168: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */       //   173: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */       //   178: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   181: astore #7
/*     */       //   183: goto -> 191
/*     */       //   186: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   189: astore #7
/*     */       //   191: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */       //   194: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   197: iconst_0
/*     */       //   198: invokevirtual intWrapper : (I)I
/*     */       //   201: iconst_3
/*     */       //   202: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*     */       //   205: new li/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1$$anonfun$apply$mcVI$sp$1
/*     */       //   208: dup
/*     */       //   209: aload_0
/*     */       //   210: aload_2
/*     */       //   211: iload_1
/*     */       //   212: invokespecial <init> : (Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;[Lscala/Option;I)V
/*     */       //   215: invokevirtual foreach$mVc$sp : (Lscala/Function1;)V
/*     */       //   218: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #105	-> 0
/*     */       //   #106	-> 10
/*     */       //   #107	-> 14
/*     */       //   #108	-> 73
/*     */       //   #109	-> 83
/*     */       //   #110	-> 96
/*     */       //   #111	-> 154
/*     */       //   #112	-> 164
/*     */       //   #107	-> 181
/*     */       //   #114	-> 186
/*     */       //   #116	-> 194
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	219	0	this	Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;
/*     */       //   0	219	1	slot	I
/*     */       //   10	208	2	mapping	[Lscala/Option;
/*     */       //   37	182	5	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   83	136	8	mountable	Lli/cil/oc/api/component/RackMountable;
/*     */       //   96	123	9	busNode	Lli/cil/oc/api/network/Node;
/*     */     }
/*     */     
/*     */     public final class Rack$$anonfun$reconnect$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */       private final Option[] mapping$1;
/*     */       private final int slot$3;
/*     */       
/*     */       public final void apply(int connectableIndex) {
/* 116 */         apply$mcVI$sp(connectableIndex);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Rack$$anonfun$reconnect$1$$anonfun$apply$mcVI$sp$1(Rack$$anonfun$reconnect$1 $outer, Option[] mapping$1, int slot$3) {}
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public void apply$mcVI$sp(int connectableIndex) {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield mapping$1 : [Lscala/Option;
/*     */         //   4: iload_1
/*     */         //   5: iconst_1
/*     */         //   6: iadd
/*     */         //   7: aaload
/*     */         //   8: astore_2
/*     */         //   9: aload_2
/*     */         //   10: instanceof scala/Some
/*     */         //   13: ifeq -> 203
/*     */         //   16: aload_2
/*     */         //   17: checkcast scala/Some
/*     */         //   20: astore_3
/*     */         //   21: aload_3
/*     */         //   22: invokevirtual x : ()Ljava/lang/Object;
/*     */         //   25: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */         //   28: astore #4
/*     */         //   30: aload_0
/*     */         //   31: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;
/*     */         //   34: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   37: aload #4
/*     */         //   39: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   42: aload_0
/*     */         //   43: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;
/*     */         //   46: getfield plugSide$1 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   49: astore #5
/*     */         //   51: dup
/*     */         //   52: ifnonnull -> 64
/*     */         //   55: pop
/*     */         //   56: aload #5
/*     */         //   58: ifnull -> 72
/*     */         //   61: goto -> 203
/*     */         //   64: aload #5
/*     */         //   66: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   69: ifeq -> 203
/*     */         //   72: aload_0
/*     */         //   73: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;
/*     */         //   76: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   79: aload_0
/*     */         //   80: getfield slot$3 : I
/*     */         //   83: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*     */         //   86: astore #7
/*     */         //   88: aload #7
/*     */         //   90: ifnull -> 195
/*     */         //   93: iload_1
/*     */         //   94: aload #7
/*     */         //   96: invokeinterface getConnectableCount : ()I
/*     */         //   101: if_icmpge -> 195
/*     */         //   104: aload #7
/*     */         //   106: iload_1
/*     */         //   107: invokeinterface getConnectableAt : (I)Lli/cil/oc/api/component/RackBusConnectable;
/*     */         //   112: astore #8
/*     */         //   114: aload #8
/*     */         //   116: ifnull -> 129
/*     */         //   119: aload #8
/*     */         //   121: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   126: ifnonnull -> 135
/*     */         //   129: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   132: goto -> 198
/*     */         //   135: aload #8
/*     */         //   137: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   142: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */         //   147: ifnonnull -> 160
/*     */         //   150: aload #8
/*     */         //   152: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   157: invokestatic joinNewNetwork : (Lli/cil/oc/api/network/Node;)V
/*     */         //   160: aload #8
/*     */         //   162: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   167: aload_0
/*     */         //   168: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1;
/*     */         //   171: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   174: invokevirtual snifferNodes : ()[[Lli/cil/oc/api/network/Node;
/*     */         //   177: aload_0
/*     */         //   178: getfield slot$3 : I
/*     */         //   181: aaload
/*     */         //   182: iload_1
/*     */         //   183: aaload
/*     */         //   184: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */         //   189: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   192: goto -> 198
/*     */         //   195: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   198: astore #6
/*     */         //   200: goto -> 208
/*     */         //   203: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   206: astore #6
/*     */         //   208: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #117	-> 0
/*     */         //   #118	-> 9
/*     */         //   #119	-> 72
/*     */         //   #120	-> 88
/*     */         //   #121	-> 104
/*     */         //   #122	-> 114
/*     */         //   #123	-> 135
/*     */         //   #124	-> 150
/*     */         //   #126	-> 160
/*     */         //   #120	-> 195
/*     */         //   #118	-> 198
/*     */         //   #129	-> 203
/*     */         //   #117	-> 208
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	209	0	this	Lli/cil/oc/common/tileentity/Rack$$anonfun$reconnect$1$$anonfun$apply$mcVI$sp$1;
/*     */         //   0	209	1	connectableIndex	I
/*     */         //   30	179	4	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   88	121	7	mountable	Lli/cil/oc/api/component/RackMountable;
/*     */         //   114	95	8	connectable	Lli/cil/oc/api/component/RackBusConnectable;
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendPacketToMountables(Option sourceSide, Packet packet)
/*     */   {
/* 139 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Rack$$anonfun$sendPacketToMountables$1(this, sourceSide, packet)); } public final class Rack$$anonfun$sendPacketToMountables$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final Option sourceSide$1; public final Packet packet$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public Rack$$anonfun$sendPacketToMountables$1(Rack $outer, Option sourceSide$1, Packet packet$1) {}
/* 140 */     public void apply$mcVI$sp(int slot) { Option<ForgeDirection>[] arrayOfOption = this.$outer.nodeMapping()[slot]; RichInt$.MODULE$
/* 141 */         .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Rack$$anonfun$sendPacketToMountables$1$$anonfun$apply$mcVI$sp$2(this, (Option[])arrayOfOption, slot)); } public final class Rack$$anonfun$sendPacketToMountables$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Option[] mapping$2; private final int slot$4; public final void apply(int connectableIndex) { apply$mcVI$sp(connectableIndex); } public Rack$$anonfun$sendPacketToMountables$1$$anonfun$apply$mcVI$sp$2(Rack$$anonfun$sendPacketToMountables$1 $outer, Option[] mapping$2, int slot$4) {} public void apply$mcVI$sp(int connectableIndex) {
/* 142 */         Option option = this.mapping$2[connectableIndex + 1];
/* 143 */         if (option instanceof Some) { Some some = (Some)option; ForgeDirection side = (ForgeDirection)some.x(); if (this.$outer.sourceSide$1.contains(this.$outer.li$cil$oc$common$tileentity$Rack$$anonfun$$$outer().toGlobal(side))) {
/* 144 */             RackMountable mountable = this.$outer.li$cil$oc$common$tileentity$Rack$$anonfun$$$outer().getMountable(this.slot$4);
/*     */             
/* 146 */             RackBusConnectable connectable = mountable.getConnectableAt(connectableIndex);
/*     */             
/* 148 */             connectable.receivePacket(this.$outer.packet$1); BoxedUnit boxedUnit1 = (mountable != null && connectableIndex < mountable.getConnectableCount()) ? ((connectable == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT; return;
/*     */           }  }
/*     */         
/* 151 */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean tryEnqueuePacket(Option<ForgeDirection> sourceSide, Packet packet) {
/* 161 */     sendPacketToMountables(sourceSide, packet);
/* 162 */     return isRelayEnabled() ? 
/* 163 */       Hub.class.tryEnqueuePacket(this, sourceSide, packet) : true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void relayPacket(Option sourceSide, Packet packet) {
/* 169 */     if (isRelayEnabled())
/* 170 */       Hub.class.relayPacket(this, sourceSide, packet); 
/*     */   }
/*     */   
/*     */   public void onPlugConnect(Hub.Plug plug, Node node) {
/* 174 */     Hub.class.onPlugConnect(this, plug, node);
/* 175 */     connectComponents();
/* 176 */     reconnect(plug.side());
/*     */   }
/*     */ 
/*     */   
/*     */   public Node createNode(Hub.Plug plug) {
/* 181 */     return Network.newNode((Environment)plug, Visibility.Network).withConnector(Settings$.MODULE$.get().bufferDistributor()).create();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 187 */     ComponentInventory.class.dispose(this);
/* 188 */     disconnectComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokestatic onMessage : (Lli/cil/oc/common/tileentity/traits/Environment;Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'network.message'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 135
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 135
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   40: astore_3
/*     */     //   41: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   44: aload_3
/*     */     //   45: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: invokevirtual isEmpty : ()Z
/*     */     //   55: ifne -> 130
/*     */     //   58: aload #4
/*     */     //   60: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   63: ifnull -> 130
/*     */     //   66: aload #4
/*     */     //   68: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   71: checkcast scala/collection/SeqLike
/*     */     //   74: iconst_1
/*     */     //   75: invokeinterface lengthCompare : (I)I
/*     */     //   80: iconst_0
/*     */     //   81: if_icmpne -> 130
/*     */     //   84: aload #4
/*     */     //   86: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   89: checkcast scala/collection/SeqLike
/*     */     //   92: iconst_0
/*     */     //   93: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   98: astore #5
/*     */     //   100: aload #5
/*     */     //   102: instanceof li/cil/oc/api/network/Packet
/*     */     //   105: ifeq -> 130
/*     */     //   108: aload #5
/*     */     //   110: checkcast li/cil/oc/api/network/Packet
/*     */     //   113: astore #6
/*     */     //   115: aload_0
/*     */     //   116: aload_1
/*     */     //   117: aload #6
/*     */     //   119: invokespecial relayIfMessageFromConnectable : (Lli/cil/oc/api/network/Message;Lli/cil/oc/api/network/Packet;)V
/*     */     //   122: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   125: astore #7
/*     */     //   127: goto -> 135
/*     */     //   130: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   133: astore #7
/*     */     //   135: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 0
/*     */     //   #193	-> 5
/*     */     //   #194	-> 41
/*     */     //   #195	-> 130
/*     */     //   #191	-> 135
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	136	0	this	Lli/cil/oc/common/tileentity/Rack;
/*     */     //   0	136	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   100	36	5	packet	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   private void relayIfMessageFromConnectable(Message message, Packet packet)
/*     */   {
/* 199 */     Object object = new Object(); try { RichInt$.MODULE$
/* 200 */         .until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Rack$$anonfun$relayIfMessageFromConnectable$1(this, message, packet, object)); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) { nonLocalReturnControl.value$mcV$sp(); return; }  }  } public final class Rack$$anonfun$relayIfMessageFromConnectable$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final Message message$1; public final Packet packet$2; public final Object nonLocalReturnKey1$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public Rack$$anonfun$relayIfMessageFromConnectable$1(Rack $outer, Message message$1, Packet packet$2, Object nonLocalReturnKey1$1) {}
/* 201 */     public void apply$mcVI$sp(int slot) { RackMountable mountable = this.$outer.getMountable(slot);
/* 202 */       if (mountable != null)
/* 203 */       { Option<ForgeDirection>[] arrayOfOption = this.$outer.nodeMapping()[slot]; RichInt$.MODULE$
/* 204 */           .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Rack$$anonfun$relayIfMessageFromConnectable$1$$anonfun$apply$mcVI$sp$3(this, mountable, (Option[])arrayOfOption)); }  } public final class Rack$$anonfun$relayIfMessageFromConnectable$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final RackMountable mountable$1; private final Option[] mapping$3; public final void apply(int connectableIndex) { apply$mcVI$sp(connectableIndex); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Rack$$anonfun$relayIfMessageFromConnectable$1$$anonfun$apply$mcVI$sp$3(Rack$$anonfun$relayIfMessageFromConnectable$1 $outer, RackMountable mountable$1, Option[] mapping$3) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public void apply$mcVI$sp(int connectableIndex) {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield mapping$3 : [Lscala/Option;
/*     */         //   4: iload_1
/*     */         //   5: iconst_1
/*     */         //   6: iadd
/*     */         //   7: aaload
/*     */         //   8: astore_2
/*     */         //   9: aload_2
/*     */         //   10: instanceof scala/Some
/*     */         //   13: ifeq -> 203
/*     */         //   16: aload_2
/*     */         //   17: checkcast scala/Some
/*     */         //   20: astore_3
/*     */         //   21: aload_3
/*     */         //   22: invokevirtual x : ()Ljava/lang/Object;
/*     */         //   25: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */         //   28: astore #4
/*     */         //   30: iload_1
/*     */         //   31: aload_0
/*     */         //   32: getfield mountable$1 : Lli/cil/oc/api/component/RackMountable;
/*     */         //   35: invokeinterface getConnectableCount : ()I
/*     */         //   40: if_icmpge -> 195
/*     */         //   43: aload_0
/*     */         //   44: getfield mountable$1 : Lli/cil/oc/api/component/RackMountable;
/*     */         //   47: iload_1
/*     */         //   48: invokeinterface getConnectableAt : (I)Lli/cil/oc/api/component/RackBusConnectable;
/*     */         //   53: astore #6
/*     */         //   55: aload #6
/*     */         //   57: ifnull -> 189
/*     */         //   60: aload #6
/*     */         //   62: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   67: aload_0
/*     */         //   68: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   71: getfield message$1 : Lli/cil/oc/api/network/Message;
/*     */         //   74: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */         //   79: astore #7
/*     */         //   81: dup
/*     */         //   82: ifnonnull -> 94
/*     */         //   85: pop
/*     */         //   86: aload #7
/*     */         //   88: ifnull -> 102
/*     */         //   91: goto -> 189
/*     */         //   94: aload #7
/*     */         //   96: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   99: ifeq -> 189
/*     */         //   102: aload_0
/*     */         //   103: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   106: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   109: aload_0
/*     */         //   110: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   113: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   116: aload #4
/*     */         //   118: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   121: invokevirtual sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*     */         //   124: ldc 'network.message'
/*     */         //   126: iconst_1
/*     */         //   127: anewarray java/lang/Object
/*     */         //   130: dup
/*     */         //   131: iconst_0
/*     */         //   132: aload_0
/*     */         //   133: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   136: getfield packet$2 : Lli/cil/oc/api/network/Packet;
/*     */         //   139: aastore
/*     */         //   140: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */         //   145: aload_0
/*     */         //   146: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   149: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   152: aload_0
/*     */         //   153: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   156: getfield message$1 : Lli/cil/oc/api/network/Message;
/*     */         //   159: aload_0
/*     */         //   160: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   163: getfield packet$2 : Lli/cil/oc/api/network/Packet;
/*     */         //   166: aload #4
/*     */         //   168: invokevirtual li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide : (Lli/cil/oc/api/network/Message;Lli/cil/oc/api/network/Packet;Lnet/minecraftforge/common/util/ForgeDirection;)V
/*     */         //   171: new scala/runtime/NonLocalReturnControl$mcV$sp
/*     */         //   174: dup
/*     */         //   175: aload_0
/*     */         //   176: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1;
/*     */         //   179: getfield nonLocalReturnKey1$1 : Ljava/lang/Object;
/*     */         //   182: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   185: invokespecial <init> : (Ljava/lang/Object;Lscala/runtime/BoxedUnit;)V
/*     */         //   188: athrow
/*     */         //   189: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   192: goto -> 198
/*     */         //   195: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   198: astore #5
/*     */         //   200: goto -> 208
/*     */         //   203: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   206: astore #5
/*     */         //   208: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #205	-> 0
/*     */         //   #206	-> 9
/*     */         //   #207	-> 30
/*     */         //   #208	-> 43
/*     */         //   #209	-> 55
/*     */         //   #210	-> 102
/*     */         //   #211	-> 145
/*     */         //   #212	-> 171
/*     */         //   #209	-> 189
/*     */         //   #207	-> 195
/*     */         //   #215	-> 203
/*     */         //   #205	-> 208
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	209	0	this	Lli/cil/oc/common/tileentity/Rack$$anonfun$relayIfMessageFromConnectable$1$$anonfun$apply$mcVI$sp$3;
/*     */         //   0	209	1	connectableIndex	I
/*     */         //   30	179	4	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   55	154	6	connectable	Lli/cil/oc/api/component/RackBusConnectable;
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide(Message message, Packet packet, ForgeDirection sourceSide)
/*     */   {
/* 223 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1(this, message, packet, sourceSide)); } public final class Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final Message message$2; public final Packet packet$3; public final ForgeDirection sourceSide$2; public final void apply(int slot) { apply$mcVI$sp(slot); } public Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1(Rack $outer, Message message$2, Packet packet$3, ForgeDirection sourceSide$2) {}
/* 224 */     public void apply$mcVI$sp(int slot) { RackMountable mountable = this.$outer.getMountable(slot);
/* 225 */       if (mountable != null)
/* 226 */       { Option<ForgeDirection>[] arrayOfOption = this.$outer.nodeMapping()[slot]; RichInt$.MODULE$
/* 227 */           .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1$$anonfun$apply$mcVI$sp$4(this, mountable, (Option[])arrayOfOption, slot)); }  } public final class Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final RackMountable mountable$2; private final Option[] mapping$4; private final int slot$5; public final void apply(int connectableIndex) { apply$mcVI$sp(connectableIndex); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1$$anonfun$apply$mcVI$sp$4(Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1 $outer, RackMountable mountable$2, Option[] mapping$4, int slot$5) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public void apply$mcVI$sp(int connectableIndex) {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield mapping$4 : [Lscala/Option;
/*     */         //   4: iload_1
/*     */         //   5: iconst_1
/*     */         //   6: iadd
/*     */         //   7: aaload
/*     */         //   8: astore_2
/*     */         //   9: aload_2
/*     */         //   10: instanceof scala/Some
/*     */         //   13: ifeq -> 192
/*     */         //   16: aload_2
/*     */         //   17: checkcast scala/Some
/*     */         //   20: astore_3
/*     */         //   21: aload_3
/*     */         //   22: invokevirtual x : ()Ljava/lang/Object;
/*     */         //   25: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */         //   28: astore #4
/*     */         //   30: aload #4
/*     */         //   32: aload_0
/*     */         //   33: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1;
/*     */         //   36: getfield sourceSide$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   39: astore #5
/*     */         //   41: dup
/*     */         //   42: ifnonnull -> 54
/*     */         //   45: pop
/*     */         //   46: aload #5
/*     */         //   48: ifnull -> 62
/*     */         //   51: goto -> 192
/*     */         //   54: aload #5
/*     */         //   56: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   59: ifeq -> 192
/*     */         //   62: iload_1
/*     */         //   63: aload_0
/*     */         //   64: getfield mountable$2 : Lli/cil/oc/api/component/RackMountable;
/*     */         //   67: invokeinterface getConnectableCount : ()I
/*     */         //   72: if_icmpge -> 184
/*     */         //   75: aload_0
/*     */         //   76: getfield mountable$2 : Lli/cil/oc/api/component/RackMountable;
/*     */         //   79: iload_1
/*     */         //   80: invokeinterface getConnectableAt : (I)Lli/cil/oc/api/component/RackBusConnectable;
/*     */         //   85: astore #7
/*     */         //   87: aload #7
/*     */         //   89: ifnull -> 134
/*     */         //   92: aload #7
/*     */         //   94: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */         //   99: aload_0
/*     */         //   100: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1;
/*     */         //   103: getfield message$2 : Lli/cil/oc/api/network/Message;
/*     */         //   106: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */         //   111: astore #8
/*     */         //   113: dup
/*     */         //   114: ifnonnull -> 126
/*     */         //   117: pop
/*     */         //   118: aload #8
/*     */         //   120: ifnull -> 134
/*     */         //   123: goto -> 140
/*     */         //   126: aload #8
/*     */         //   128: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   131: ifeq -> 140
/*     */         //   134: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   137: goto -> 187
/*     */         //   140: aload_0
/*     */         //   141: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1;
/*     */         //   144: invokevirtual li$cil$oc$common$tileentity$Rack$$anonfun$$$outer : ()Lli/cil/oc/common/tileentity/Rack;
/*     */         //   147: invokevirtual snifferNodes : ()[[Lli/cil/oc/api/network/Node;
/*     */         //   150: aload_0
/*     */         //   151: getfield slot$5 : I
/*     */         //   154: aaload
/*     */         //   155: iload_1
/*     */         //   156: aaload
/*     */         //   157: ldc 'network.message'
/*     */         //   159: iconst_1
/*     */         //   160: anewarray java/lang/Object
/*     */         //   163: dup
/*     */         //   164: iconst_0
/*     */         //   165: aload_0
/*     */         //   166: getfield $outer : Lli/cil/oc/common/tileentity/Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1;
/*     */         //   169: getfield packet$3 : Lli/cil/oc/api/network/Packet;
/*     */         //   172: aastore
/*     */         //   173: invokeinterface sendToNeighbors : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */         //   178: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   181: goto -> 187
/*     */         //   184: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   187: astore #6
/*     */         //   189: goto -> 197
/*     */         //   192: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   195: astore #6
/*     */         //   197: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #228	-> 0
/*     */         //   #229	-> 9
/*     */         //   #230	-> 62
/*     */         //   #231	-> 75
/*     */         //   #232	-> 87
/*     */         //   #233	-> 140
/*     */         //   #230	-> 184
/*     */         //   #236	-> 192
/*     */         //   #228	-> 197
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	198	0	this	Lli/cil/oc/common/tileentity/Rack$$anonfun$li$cil$oc$common$tileentity$Rack$$relayToConnectablesOnSide$1$$anonfun$apply$mcVI$sp$4;
/*     */         //   0	198	1	connectableIndex	I
/*     */         //   30	168	4	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */         //   87	111	7	connectable	Lli/cil/oc/api/component/RackBusConnectable;
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canConnect(ForgeDirection side)
/*     */   {
/* 246 */     ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/* 248 */      } public Node sidedNode(ForgeDirection side) { ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*     */      }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/* 254 */   public boolean hasConnector(ForgeDirection side) { ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/* 256 */      } public Option<Connector> connector(ForgeDirection side) { ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/* 258 */      } public double energyThroughput() { return Settings$.MODULE$.get().serverRackRate(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_2
/*     */     //   2: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   5: fload_3
/*     */     //   6: fload #4
/*     */     //   8: fload #5
/*     */     //   10: invokevirtual slotAt : (Lnet/minecraftforge/common/util/ForgeDirection;FFF)Lscala/Option;
/*     */     //   13: astore #6
/*     */     //   15: aload #6
/*     */     //   17: instanceof scala/Some
/*     */     //   20: ifeq -> 118
/*     */     //   23: aload #6
/*     */     //   25: checkcast scala/Some
/*     */     //   28: astore #7
/*     */     //   30: aload #7
/*     */     //   32: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   35: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   38: istore #8
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual components : ()[Lscala/Option;
/*     */     //   44: iload #8
/*     */     //   46: aaload
/*     */     //   47: astore #10
/*     */     //   49: aload #10
/*     */     //   51: instanceof scala/Some
/*     */     //   54: ifeq -> 108
/*     */     //   57: aload #10
/*     */     //   59: checkcast scala/Some
/*     */     //   62: astore #11
/*     */     //   64: aload #11
/*     */     //   66: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   69: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   72: astore #12
/*     */     //   74: aload #12
/*     */     //   76: instanceof li/cil/oc/api/network/Analyzable
/*     */     //   79: ifeq -> 108
/*     */     //   82: aload #12
/*     */     //   84: astore #13
/*     */     //   86: aload #13
/*     */     //   88: checkcast li/cil/oc/api/network/Analyzable
/*     */     //   91: aload_1
/*     */     //   92: iload_2
/*     */     //   93: fload_3
/*     */     //   94: fload #4
/*     */     //   96: fload #5
/*     */     //   98: invokeinterface onAnalyze : (Lnet/minecraft/entity/player/EntityPlayer;IFFF)[Lli/cil/oc/api/network/Node;
/*     */     //   103: astore #14
/*     */     //   105: goto -> 111
/*     */     //   108: aconst_null
/*     */     //   109: astore #14
/*     */     //   111: aload #14
/*     */     //   113: astore #9
/*     */     //   115: goto -> 141
/*     */     //   118: iconst_1
/*     */     //   119: anewarray li/cil/oc/api/network/Node
/*     */     //   122: dup
/*     */     //   123: iconst_0
/*     */     //   124: aload_0
/*     */     //   125: iload_2
/*     */     //   126: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   129: invokevirtual sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*     */     //   132: aastore
/*     */     //   133: checkcast [Ljava/lang/Object;
/*     */     //   136: checkcast [Lli/cil/oc/api/network/Node;
/*     */     //   139: astore #9
/*     */     //   141: aload #9
/*     */     //   143: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #264	-> 0
/*     */     //   #265	-> 15
/*     */     //   #266	-> 49
/*     */     //   #267	-> 108
/*     */     //   #265	-> 111
/*     */     //   #269	-> 118
/*     */     //   #264	-> 141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	144	0	this	Lli/cil/oc/common/tileentity/Rack;
/*     */     //   0	144	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	144	2	side	I
/*     */     //   0	144	3	hitX	F
/*     */     //   0	144	4	hitY	F
/*     */     //   0	144	5	hitZ	F
/*     */     //   40	104	8	slot	I
/*     */     //   74	70	12	analyzable	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterable<ManagedEnvironment> installedComponents() {
/* 276 */     return WrapAsScala$.MODULE$.iterableAsScalaIterable(WrapAsJava$.MODULE$.asJavaIterable(
/*     */ 
/*     */ 
/*     */           
/* 280 */           Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new Rack$$anonfun$installedComponents$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Iterable.class)))).flatten((Function1)Predef$.MODULE$.$conforms(), ClassTag$.MODULE$.apply(ManagedEnvironment.class))).toIterable()));
/*     */   } public final class Rack$$anonfun$installedComponents$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, Iterable<ManagedEnvironment>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable && mountable instanceof ComponentHost) { RackMountable rackMountable = (RackMountable)mountable; return (B1)WrapAsScala$.MODULE$.iterableAsScalaIterable(((ComponentHost)rackMountable).getComponents()).collect((PartialFunction)new Rack$$anonfun$installedComponents$1$$anonfun$applyOrElse$1(this), Iterable$.MODULE$.canBuildFrom()); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable && mountable instanceof ComponentHost) return true;  }  return false; } public Rack$$anonfun$installedComponents$1(Rack $outer) {} public final class Rack$$anonfun$installedComponents$1$$anonfun$applyOrElse$1 extends AbstractPartialFunction<Environment, ManagedEnvironment> implements Serializable {
/* 283 */       public static final long serialVersionUID = 0L; public final <A1 extends Environment, B1> B1 applyOrElse(Environment x2, Function1 default) { Object object; Environment environment = x2; if (environment instanceof ManagedEnvironment) { ManagedEnvironment managedEnvironment = (ManagedEnvironment)environment; } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Environment x2) { boolean bool; Environment environment = x2; if (environment instanceof ManagedEnvironment) { bool = true; } else { bool = false; }  return bool; } public Rack$$anonfun$installedComponents$1$$anonfun$applyOrElse$1(Rack$$anonfun$installedComponents$1 $outer) {} } } @Method(modid = "StargateTech2") public IBusInterface[] getInterfaces(int side) { return (side != facing().ordinal()) ? 
/* 284 */       AbstractBusAware.class.getInterfaces(this, side) : 
/*     */       
/* 286 */       null; }
/*     */    public World getWorld() {
/* 288 */     return world();
/*     */   }
/*     */   
/*     */   public int indexOfMountable(RackMountable mountable)
/*     */   {
/* 293 */     return Predef$.MODULE$.refArrayOps((Object[])components()).indexWhere((Function1)new Rack$$anonfun$indexOfMountable$1(this, mountable)); } public final class Rack$$anonfun$indexOfMountable$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final RackMountable mountable$3; public final boolean apply(Option x$1) { return x$1.contains(this.mountable$3); }
/*     */      public Rack$$anonfun$indexOfMountable$1(Rack $outer, RackMountable mountable$3) {} } public RackMountable getMountable(int slot) {
/* 295 */     Option<ManagedEnvironment> option = components()[slot];
/* 296 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) { RackMountable rackMountable; return rackMountable = (RackMountable)mountable; }  }
/* 297 */      return null;
/*     */   }
/*     */   public NBTTagCompound getMountableData(int slot) {
/* 300 */     return lastData()[slot];
/*     */   }
/*     */   public void markChanged(int slot) {
/* 303 */     synchronized (hasChanged()) { hasChanged()[slot] = true;
/* 304 */       setOutputEnabled(hasRedstoneCard());
/* 305 */       isAbstractBusAvailable_$eq(hasAbstractBusCard());
/*     */       return; }
/*     */   
/*     */   }
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState()
/*     */   {
/* 312 */     EnumSet<StateAware.State> result = EnumSet.noneOf(StateAware.State.class);
/* 313 */     Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new Rack$$anonfun$getCurrentState$1(this, result), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean()));
/*     */ 
/*     */     
/* 316 */     return result;
/*     */   } public final class Rack$$anonfun$getCurrentState$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final EnumSet result$1; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x3, Function1 default) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) { RackMountable rackMountable = (RackMountable)mountable; return (B1)BoxesRunTime.boxToBoolean(this.result$1.addAll(rackMountable.getCurrentState())); }
/*     */          }
/*     */        return (B1)default.apply(x3); } public final boolean isDefinedAt(Option x3) { Option option = x3; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable)
/*     */           return true;  }
/*     */        return false; } public Rack$$anonfun$getCurrentState$1(Rack $outer, EnumSet result$1) {} }
/* 323 */   public void onRotationChanged() { Rotatable.class.onRotationChanged(this);
/* 324 */     checkRedstoneInputChanged(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRedstoneInputChanged(RedstoneChangedEventArgs args)
/*     */   {
/* 331 */     RedstoneAware.class.onRedstoneInputChanged((RedstoneAware)this, args);
/* 332 */     Predef$.MODULE$.refArrayOps((Object[])components()).collect((PartialFunction)new Rack$$anonfun$onRedstoneInputChanged$1(this, args), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit())); } public final class Rack$$anonfun$onRedstoneInputChanged$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneChangedEventArgs args$1; public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x4, Function1 default) { Option option = x4;
/* 333 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) { RackMountable rackMountable = (RackMountable)mountable; if (rackMountable.node() != null) {
/* 334 */             RedstoneChangedEventArgs toLocalArgs = new RedstoneChangedEventArgs(this.$outer.toLocal(this.args$1.side()), this.args$1.oldValue(), this.args$1.newValue(), this.args$1.color());
/* 335 */             rackMountable.node().sendToNeighbors("redstone.changed", new Object[] { toLocalArgs }); return (B1)BoxedUnit.UNIT;
/*     */           }  }
/*     */          }
/*     */        return (B1)default.apply(x4); } public final boolean isDefinedAt(Option x4) { Option option = x4; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) { RackMountable rackMountable = (RackMountable)mountable; if (rackMountable.node() != null)
/*     */             return true;  }
/*     */          }
/*     */        return false; } public Rack$$anonfun$onRedstoneInputChanged$1(Rack $outer, RedstoneChangedEventArgs args$1) {} }
/* 342 */   public int func_70302_i_() { return 4; }
/*     */    public int func_70297_j_() {
/* 344 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: new scala/Tuple2
/*     */     //   3: dup
/*     */     //   4: iload_1
/*     */     //   5: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   8: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   11: aload_2
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   16: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */     //   19: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   22: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   25: astore_3
/*     */     //   26: aload_3
/*     */     //   27: ifnull -> 111
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   34: checkcast scala/Option
/*     */     //   37: astore #4
/*     */     //   39: aload #4
/*     */     //   41: instanceof scala/Some
/*     */     //   44: ifeq -> 111
/*     */     //   47: aload #4
/*     */     //   49: checkcast scala/Some
/*     */     //   52: astore #5
/*     */     //   54: aload #5
/*     */     //   56: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   59: checkcast li/cil/oc/api/driver/Item
/*     */     //   62: astore #6
/*     */     //   64: aload #6
/*     */     //   66: aload_2
/*     */     //   67: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */     //   72: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   75: invokevirtual RackMountable : ()Ljava/lang/String;
/*     */     //   78: astore #8
/*     */     //   80: dup
/*     */     //   81: ifnonnull -> 93
/*     */     //   84: pop
/*     */     //   85: aload #8
/*     */     //   87: ifnull -> 101
/*     */     //   90: goto -> 105
/*     */     //   93: aload #8
/*     */     //   95: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   98: ifeq -> 105
/*     */     //   101: iconst_1
/*     */     //   102: goto -> 106
/*     */     //   105: iconst_0
/*     */     //   106: istore #7
/*     */     //   108: goto -> 114
/*     */     //   111: iconst_0
/*     */     //   112: istore #7
/*     */     //   114: iload #7
/*     */     //   116: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #346	-> 0
/*     */     //   #347	-> 30
/*     */     //   #348	-> 111
/*     */     //   #346	-> 114
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	117	0	this	Lli/cil/oc/common/tileentity/Rack;
/*     */     //   0	117	1	slot	I
/*     */     //   0	117	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   64	53	6	driver	Lli/cil/oc/api/driver/Item;
/*     */   }
/*     */   
/*     */   public void func_70296_d() {
/* 352 */     super.func_70296_d();
/* 353 */     if (isServer()) {
/* 354 */       setOutputEnabled(hasRedstoneCard());
/* 355 */       isAbstractBusAvailable_$eq(hasAbstractBusCard());
/* 356 */       PacketSender$.MODULE$.sendRackInventory(this);
/*     */     } else {
/*     */       
/* 359 */       world().func_147471_g(x(), y(), z());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onItemAdded(int slot, ItemStack stack) {
/* 367 */     if (isServer()) { RichInt$.MODULE$
/* 368 */         .until$extension0(Predef$.MODULE$.intWrapper(0), 4).foreach$mVc$sp((Function1)new Rack$$anonfun$onItemAdded$1(this, slot));
/*     */ 
/*     */       
/* 371 */       lastData()[slot] = null;
/* 372 */       hasChanged()[slot] = true; }
/*     */     
/* 374 */     ComponentInventory.class.onItemAdded(this, slot, stack);
/*     */   } public final class Rack$$anonfun$onItemAdded$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int slot$1; public final void apply(int connectable) { apply$mcVI$sp(connectable); } public Rack$$anonfun$onItemAdded$1(Rack $outer, int slot$1) {}
/*     */     public void apply$mcVI$sp(int connectable) { this.$outer.nodeMapping()[this.slot$1][connectable] = (Option<ForgeDirection>)None$.MODULE$; } }
/* 378 */   public void onItemRemoved(int slot, ItemStack stack) { if (isServer()) { RichInt$.MODULE$
/* 379 */         .until$extension0(Predef$.MODULE$.intWrapper(0), 4).foreach$mVc$sp((Function1)new Rack$$anonfun$onItemRemoved$1(this, slot));
/*     */ 
/*     */       
/* 382 */       lastData()[slot] = null; }
/*     */     
/* 384 */     ComponentInventory.class.onItemRemoved(this, slot, stack); } public final class Rack$$anonfun$onItemRemoved$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int slot$2; public final void apply(int connectable) {
/*     */       apply$mcVI$sp(connectable);
/*     */     } public Rack$$anonfun$onItemRemoved$1(Rack $outer, int slot$2) {} public void apply$mcVI$sp(int connectable) {
/*     */       this.$outer.nodeMapping()[this.slot$2][connectable] = (Option<ForgeDirection>)None$.MODULE$;
/*     */     } } public void connectItemNode(Node node) {
/* 390 */     Network.joinNewNetwork(node);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145845_h() {
/* 396 */     VolatileByteRef bitmap$0 = VolatileByteRef.create((byte)0);
/* 397 */     RedstoneAware.class.updateEntity((RedstoneAware)this);
/* 398 */     if (isServer() && isConnected())
/* 399 */     { ObjectRef connectors$lzy = ObjectRef.zero();
/*     */ 
/*     */       
/* 402 */       Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])components()).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).collect((PartialFunction)new Rack$$anonfun$updateEntity$1(this, connectors$lzy, bitmap$0), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));
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
/*     */       
/* 428 */       updateComponents(); } 
/*     */   } private final Connector[] connectors$lzycompute$1(ObjectRef connectors$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { connectors$lzy$1.elem = Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Rack$$anonfun$connectors$lzycompute$1$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Node.class)))).collect((PartialFunction)new Rack$$anonfun$connectors$lzycompute$1$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Connector.class))); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (Connector[])connectors$lzy$1.elem; }  } public final Connector[] li$cil$oc$common$tileentity$Rack$$connectors$1(ObjectRef connectors$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? connectors$lzycompute$1(connectors$lzy$1, bitmap$0$1) : (Connector[])connectors$lzy$1.elem; } public final class Rack$$anonfun$connectors$lzycompute$1$2 extends AbstractFunction1<ForgeDirection, Node> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Node apply(ForgeDirection side) { return this.$outer.sidedNode(side); } public Rack$$anonfun$connectors$lzycompute$1$2(Rack $outer) {} } public final class Rack$$anonfun$connectors$lzycompute$1$1 extends AbstractPartialFunction<Node, Connector> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Node, B1> B1 applyOrElse(Node x5, Function1 default) { Object object; Node node = x5; if (node instanceof Connector) { Connector connector = (Connector)node; } else { object = default.apply(x5); }  return (B1)object; } public final boolean isDefinedAt(Node x5) { boolean bool; Node node = x5; if (node instanceof Connector) { bool = true; } else { bool = false; }  return bool; } public Rack$$anonfun$connectors$lzycompute$1$1(Rack $outer) {} } public final class Rack$$anonfun$updateEntity$1 extends AbstractPartialFunction<Tuple2<Option<ManagedEnvironment>, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ObjectRef connectors$lzy$1; private final VolatileByteRef bitmap$0$1; public final <A1 extends Tuple2<Option<ManagedEnvironment>, Object>, B1> B1 applyOrElse(Tuple2 x6, Function1 default) { Tuple2 tuple2 = x6; if (tuple2 != null) { Option option = (Option)tuple2._1(); int slot = tuple2._2$mcI$sp(); if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) { RackMountable rackMountable = (RackMountable)mountable; this.$outer.hasChanged()[slot] = false; this.$outer.lastData()[slot] = rackMountable.getData(); PacketSender$.MODULE$.sendRackMountableData(this.$outer, slot); this.$outer.world().func_147459_d(this.$outer.x(), this.$outer.y(), this.$outer.z(), this.$outer.block()); this.$outer.setOutputEnabled(this.$outer.hasRedstoneCard()); this.$outer.hasChanged()[slot] ? this.$outer.isAbstractBusAvailable_$eq(this.$outer.hasAbstractBusCard()) : BoxedUnit.UNIT; Node node = rackMountable.node(); if (node instanceof Connector) { Connector connector = (Connector)node; DoubleRef remaining = DoubleRef.create(Settings$.MODULE$.get().serverRackRate()); Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$common$tileentity$Rack$$connectors$1(this.connectors$lzy$1, this.bitmap$0$1)).withFilter((Function1)new Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$2(this, remaining)).foreach((Function1)new Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$3(this, remaining, connector)); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return (B1)BoxedUnit.UNIT; }  }  }  return (B1)default.apply(x6); } public final boolean isDefinedAt(Tuple2 x6) { Tuple2 tuple2 = x6; if (tuple2 != null) { Option option = (Option)tuple2._1(); if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof RackMountable) return true;  }  }  return false; } public Rack$$anonfun$updateEntity$1(Rack $outer, ObjectRef connectors$lzy$1, VolatileByteRef bitmap$0$1) {} public final class Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$2 extends AbstractFunction1<Connector, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final DoubleRef remaining$1; public final boolean apply(Connector outside) { return (this.remaining$1.elem > false); } public Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$2(Rack$$anonfun$updateEntity$1 $outer, DoubleRef remaining$1) {} } public final class Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$3 extends AbstractFunction1<Connector, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final DoubleRef remaining$1; private final Connector x2$1; public Rack$$anonfun$updateEntity$1$$anonfun$applyOrElse$3(Rack$$anonfun$updateEntity$1 $outer, DoubleRef remaining$1, Connector x2$1) {} public final void apply(Connector outside) { double received = this.remaining$1.elem + outside.changeBuffer(-this.remaining$1.elem); double rejected = this.x2$1.changeBuffer(received); outside.changeBuffer(rejected); this.remaining$1.elem -= received - rejected; } } }
/* 435 */   public void readFromNBTForServer(NBTTagCompound nbt) { BundledRedstoneAware.class.readFromNBTForServer(this, nbt);
/*     */     
/* 437 */     isRelayEnabled_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRelayEnabled").toString()));
/* 438 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("nodeMapping").toString(), 11)).map((Function1)new Rack$$anonfun$readFromNBTForServer$1(this))
/*     */       
/* 440 */       .copyToArray(nodeMapping());
/*     */ 
/*     */     
/* 443 */     _isOutputEnabled_$eq(hasRedstoneCard());
/* 444 */     _isAbstractBusAvailable_$eq(hasAbstractBusCard()); } public final class Rack$$anonfun$readFromNBTForServer$1 extends AbstractFunction1<NBTTagIntArray, Option<ForgeDirection>[]> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public Rack$$anonfun$readFromNBTForServer$1(Rack $outer) {} public final Option<ForgeDirection>[] apply(NBTTagIntArray buses) { return (Option<ForgeDirection>[])Predef$.MODULE$.intArrayOps(buses.func_150302_c()).map((Function1)new Rack$$anonfun$readFromNBTForServer$1$$anonfun$apply$4(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class))); } public final class Rack$$anonfun$readFromNBTForServer$1$$anonfun$apply$4 extends AbstractFunction1<Object, Option<ForgeDirection>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final Option<ForgeDirection> apply(int id) { return (id < 0 || id == ForgeDirection.UNKNOWN.ordinal() || id == ForgeDirection.SOUTH.ordinal()) ? (Option<ForgeDirection>)None$.MODULE$ : Option$.MODULE$.apply(ForgeDirection.getOrientation(id)); }
/*     */       public Rack$$anonfun$readFromNBTForServer$1$$anonfun$apply$4(Rack$$anonfun$readFromNBTForServer$1 $outer) {} } }
/* 448 */   public void writeToNBTForServer(NBTTagCompound nbt) { BundledRedstoneAware.class.writeToNBTForServer(this, nbt);
/*     */     
/* 450 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRelayEnabled").toString(), isRelayEnabled());
/* 451 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("nodeMapping").toString(), (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])nodeMapping()).map((Function1)new Rack$$anonfun$writeToNBTForServer$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagIntArray.class))))); } public final class Rack$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<Option<ForgeDirection>[], NBTTagIntArray> implements Serializable { public static final long serialVersionUID = 0L; public Rack$$anonfun$writeToNBTForServer$1(Rack $outer) {}
/* 452 */     public final NBTTagIntArray apply(Option[] buses) { return ExtendedNBT$.MODULE$.toNbt((int[])Predef$.MODULE$.refArrayOps((Object[])buses).map((Function1)new Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))); } public final class Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5 extends AbstractFunction1<Option<ForgeDirection>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(Option side) { return BoxesRunTime.unboxToInt(side.map((Function1)new Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$6(this)).getOrElse((Function0)new Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$1(this))); } public Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5(Rack$$anonfun$writeToNBTForServer$1 $outer) {} public final class Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$6 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$2) { return x$2.ordinal(); } public Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$6(Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5 $outer) {} } public final class Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return -1; }
/*     */         
/*     */         public Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5$$anonfun$apply$1(Rack$$anonfun$writeToNBTForServer$1$$anonfun$apply$5 $outer) {} } } }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 457 */     AbstractBusAware.class.readFromNBTForClient(this, nbt);
/*     */     
/* 459 */     NBTTagCompound[] data = (NBTTagCompound[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lastData").toString(), 10))
/* 460 */       .toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class));
/* 461 */     Predef$.MODULE$.refArrayOps((Object[])data).copyToArray(lastData());
/* 462 */     load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rackData").toString()));
/* 463 */     connectComponents();
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 467 */     AbstractBusAware.class.writeToNBTForClient(this, nbt);
/*     */     
/* 469 */     NBTTagCompound[] data = (NBTTagCompound[])Predef$.MODULE$.refArrayOps((Object[])lastData()).map((Function1)new Rack$$anonfun$4(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class)));
/* 470 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lastData").toString(), (Iterable)Predef$.MODULE$.wrapRefArray((Object[])data));
/* 471 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rackData").toString(), (Function1)new Rack$$anonfun$writeToNBTForClient$1(this)); } public final class Rack$$anonfun$4 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(NBTTagCompound tag) { return (tag == null) ? new NBTTagCompound() : tag; } public Rack$$anonfun$4(Rack $outer) {} } public final class Rack$$anonfun$writeToNBTForClient$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound nbt) { this.$outer.save(nbt); }
/*     */ 
/*     */     
/*     */     public Rack$$anonfun$writeToNBTForClient$1(Rack $outer) {} }
/*     */   
/*     */   public Option<Object> slotAt(ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 477 */     ForgeDirection forgeDirection = facing(); if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/* 478 */     { int globalY = (int)(hitY * 16);
/* 479 */       int l = 2;
/* 480 */       int h = 14;
/* 481 */       int slot = (15 - globalY - l) * func_70302_i_() / (h - l); }  int i = (int)(hitY * 16); byte b1 = 2; byte b2 = 14; int j = (15 - i - b1) * func_70302_i_() / (b2 - b1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWorking(RackMountable mountable) {
/* 487 */     return mountable.getCurrentState().contains(StateAware.State.IsWorking);
/*     */   }
/* 489 */   public boolean hasAbstractBusCard() { return Predef$.MODULE$.refArrayOps((Object[])components()).exists((Function1)new Rack$$anonfun$hasAbstractBusCard$1(this)); } public final class Rack$$anonfun$hasAbstractBusCard$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x0$2) { Option option = x0$2;
/* 490 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof EnvironmentHost && mountable instanceof RackMountable && mountable instanceof IInventory) { EnvironmentHost environmentHost = (EnvironmentHost)mountable; if (this.$outer.isWorking((RackMountable)environmentHost))
/* 491 */             return ExtendedInventory$.MODULE$.extendedInventory((IInventory)environmentHost).exists((Function1)new Rack$$anonfun$hasAbstractBusCard$1$$anonfun$apply$7(this, environmentHost));  }  }  return false; } public Rack$$anonfun$hasAbstractBusCard$1(Rack $outer) {} public final class Rack$$anonfun$hasAbstractBusCard$1$$anonfun$apply$7 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final EnvironmentHost x3$1; public final boolean apply(ItemStack stack) { return DriverAbstractBusCard$.MODULE$.worksWith(stack, this.x3$1.getClass()); }
/*     */       
/*     */       public Rack$$anonfun$hasAbstractBusCard$1$$anonfun$apply$7(Rack$$anonfun$hasAbstractBusCard$1 $outer, EnvironmentHost x3$1) {} } }
/*     */   
/* 495 */   public boolean hasRedstoneCard() { return Predef$.MODULE$.refArrayOps((Object[])components()).exists((Function1)new Rack$$anonfun$hasRedstoneCard$1(this)); } public final class Rack$$anonfun$hasRedstoneCard$1 extends AbstractFunction1<Option<ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x0$1) { Option option = x0$1;
/* 496 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment mountable = (ManagedEnvironment)some.x(); if (mountable instanceof EnvironmentHost && mountable instanceof RackMountable && mountable instanceof IInventory) { EnvironmentHost environmentHost = (EnvironmentHost)mountable; if (this.$outer.isWorking((RackMountable)environmentHost))
/* 497 */             return ExtendedInventory$.MODULE$.extendedInventory((IInventory)environmentHost).exists((Function1)new Rack$$anonfun$hasRedstoneCard$1$$anonfun$apply$8(this, environmentHost));  }  }  return false; } public Rack$$anonfun$hasRedstoneCard$1(Rack $outer) {} public final class Rack$$anonfun$hasRedstoneCard$1$$anonfun$apply$8 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final EnvironmentHost x3$2; public final boolean apply(ItemStack stack) { return DriverRedstoneCard$.MODULE$.worksWith(stack, this.x3$2.getClass()); }
/*     */ 
/*     */       
/*     */       public Rack$$anonfun$hasRedstoneCard$1$$anonfun$apply$8(Rack$$anonfun$hasRedstoneCard$1 $outer, EnvironmentHost x3$2) {} }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Rack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */