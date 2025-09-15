/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\025a\001B\001\003\0015\021aaU2sK\026t'BA\002\005\003)!\030\016\\3f]RLG/\037\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001MI\001AD\f\036K!Zc&\r\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\tQA+\0337f\013:$\030\016^=\021\005aYR\"A\r\013\005i\021\021A\002;sC&$8/\003\002\0353\tQA+\032=u\005V4g-\032:\021\005y\031S\"A\020\013\005\001\n\023a\0028fi^|'o\033\006\003E\031\t1!\0319j\023\t!sD\001\tTS\022,G-\0228wSJ|g.\\3oiB\021\001DJ\005\003Oe\021\021BU8uCR\f'\r\\3\021\005aI\023B\001\026\032\0055\021V\rZ:u_:,\027i^1sKB\021\001\004L\005\003[e\021qaQ8m_J,G\r\005\002\037_%\021\001g\b\002\013\003:\fG.\037>bE2,\007c\001\032=9\0211'\017\b\003i]j\021!\016\006\003m1\ta\001\020:p_Rt\024\"\001\035\002\013M\034\027\r\\1\n\005iZ\024a\0029bG.\fw-\032\006\002q%\021QH\020\002\b\037J$WM]3e\025\tQ4\b\005\002A\0015\t!\001\003\005C\001\t\005\r\021\"\001D\003\021!\030.\032:\026\003\021\003\"!\022$\016\003mJ!aR\036\003\007%sG\017\003\005J\001\t\005\r\021\"\001K\003!!\030.\032:`I\025\fHCA&O!\t)E*\003\002Nw\t!QK\\5u\021\035y\005*!AA\002\021\0131\001\037\0232\021!\t\006A!A!B\023!\025!\002;jKJ\004\003\"B*\001\t\003!\026A\002\037j]&$h\b\006\002@+\")!I\025a\001\t\")1\013\001C\001/R\tq\bC\003Z\001\021\005#,\001\007wC2LGMR1dS:<7/F\001\\!\r)ELX\005\003;n\022Q!\021:sCf\004\"aX3\016\003\001T!!\0312\002\tU$\030\016\034\006\003\013\rT!\001Z\n\002\0355Lg.Z2sC\032$hm\034:hK&\021a\r\031\002\017\r>\024x-\032#je\026\034G/[8o\021\035A\007\0011A\005\002%\f\001d\0355pk2$7\t[3dW\032{'/T;mi&\024En\\2l+\005Q\007CA#l\023\ta7HA\004C_>dW-\0318\t\0179\004\001\031!C\001_\006a2\017[8vY\022\034\005.Z2l\r>\024X*\0367uS\ncwnY6`I\025\fHCA&q\021\035yU.!AA\002)DaA\035\001!B\023Q\027!G:i_VdGm\0215fG.4uN]'vYRL'\t\\8dW\002Bq\001\036\001A\002\023\0051)\001\017eK2\f\0270\0268uS2\034\005.Z2l\r>\024X*\0367uS\ncwnY6\t\017Y\004\001\031!C\001o\006\001C-\0327bsVsG/\0337DQ\026\0347NR8s\033VdG/\033\"m_\016\\w\fJ3r)\tY\005\020C\004Pk\006\005\t\031\001#\t\ri\004\001\025)\003E\003u!W\r\\1z+:$\030\016\\\"iK\016\\gi\034:Nk2$\030N\0217pG.\004\003b\002?\001\001\004%\taQ\001\006o&$G\017\033\005\b}\002\001\r\021\"\001\000\003%9\030\016\032;i?\022*\027\017F\002L\003\003AqaT?\002\002\003\007A\tC\004\002\006\001\001\013\025\002#\002\r]LG\r\0365!\021!\tI\001\001a\001\n\003\031\025A\0025fS\036DG\017C\005\002\016\001\001\r\021\"\001\002\020\005Q\001.Z5hQR|F%Z9\025\007-\013\t\002\003\005P\003\027\t\t\0211\001E\021\035\t)\002\001Q!\n\021\013q\001[3jO\"$\b\005C\005\002\032\001\001\r\021\"\001\002\034\0051qN]5hS:,\022a\020\005\n\003?\001\001\031!C\001\003C\t!b\034:jO&tw\fJ3r)\rY\0251\005\005\t\037\006u\021\021!a\001!9\021q\005\001!B\023y\024aB8sS\036Lg\016\t\005\n\003W\001!\031!C\001\003[\tqa]2sK\026t7/\006\002\0020A)\021\021GA\0365\021\0211\007\006\005\003k\t9$A\004nkR\f'\r\\3\013\007\005e2(\001\006d_2dWm\031;j_:LA!!\020\0024\t\0311+\032;\t\021\005\005\003\001)A\005\003_\t\001b]2sK\026t7\017\t\005\t\003\013\002\001\031!C\001S\006\001\002.\0313SK\022\034Ho\0348f\023:\004X\017\036\005\n\003\023\002\001\031!C\001\003\027\nA\003[1e%\026$7\017^8oK&s\007/\036;`I\025\fHcA&\002N!Aq*a\022\002\002\003\007!\016C\004\002R\001\001\013\025\0026\002#!\fGMU3egR|g.Z%oaV$\b\005C\005\002V\001\001\r\021\"\001\002X\005a1-Y2iK\022\024u.\0368egV\021\021\021\f\t\006\013\006m\023qL\005\004\003;Z$AB(qi&|g\016\005\003\002b\005\025TBAA2\025\t\t\027#\003\003\002h\005\r$!D!ySN\fE.[4oK\022\024%\tC\005\002l\001\001\r\021\"\001\002n\005\0012-Y2iK\022\024u.\0368eg~#S-\035\013\004\027\006=\004\"C(\002j\005\005\t\031AA-\021!\t\031\b\001Q!\n\005e\023!D2bG\",GMQ8v]\022\034\b\005\003\005\002x\001\001\r\021\"\001j\003=IgN^3siR{Wo\0315N_\022,\007\"CA>\001\001\007I\021AA?\003MIgN^3siR{Wo\0315N_\022,w\fJ3r)\rY\025q\020\005\t\037\006e\024\021!a\001U\"9\0211\021\001!B\023Q\027\001E5om\026\024H\017V8vG\"lu\016Z3!\021%\t9\t\001b\001\n\023\tI)\001\004beJ|wo]\013\003\003\027\003b!!\r\002<\0055\005\003BAH\0033k!!!%\013\t\005M\025QS\001\013aJ|'.Z2uS2,'bAAL#\0051QM\034;jifLA!a'\002\022\nYQI\034;jif\f%O]8x\021!\ty\n\001Q\001\n\005-\025aB1se><8\017\t\005\b\003G\003A\021IAS\003)\031\027M\\\"p]:,7\r\036\013\004U\006\035\006bBAU\003C\003\rAX\001\005g&$W\r\013\005\002\"\0065\026QYAd!\021\ty+!1\016\005\005E&\002BAZ\003k\013!B]3mCVt7\r[3s\025\021\t9,!/\002\007\031lGN\003\003\002<\006u\026\001B7pINT!!a0\002\007\r\004x/\003\003\002D\006E&\001C*jI\026|e\016\\=\002\013Y\fG.^3%\005\005%\027\002BAf\003\033\faa\021'J\013:#&\002BAh\003c\013AaU5eK\"9\0211\033\001\005B\005U\027!C:jI\026$gj\0343f)\021\t9.!8\021\007y\tI.C\002\002\\~\021AAT8eK\"9\021\021VAi\001\004q\006BBAq\001\021\005\021.\001\005jg>\023\030nZ5o\021\035\t)\017\001C\001\003O\fQ\002\\8dC2\004vn]5uS>tWCAAu!\025)\0251\036#E\023\r\tio\017\002\007)V\004H.\032\032\t\r\005E\b\001\"\001j\003-A\027m]&fs\n|\027M\0353\t\017\005U\b\001\"\001\002x\006y1\r[3dW6+H\016^5CY>\0347\016F\001L\021\035\tY\020\001C\001\003{\f1\003^8TGJ,WM\\\"p_J$\027N\\1uKN$\002\"a@\003\f\t=!1\003\t\007\013\006-(N!\001\021\013\025\013YFa\001\021\017\025\013YO!\002\003\006A\031QIa\002\n\007\t%1H\001\004E_V\024G.\032\005\t\005\033\tI\0201\001\003\006\005!\001.\033;Y\021!\021\t\"!?A\002\t\025\021\001\0025jifC\001B!\006\002z\002\007!QA\001\005Q&$(\fC\004\003\032\001!\tAa\007\002\035\r|\007/\037+p\003:\fG.\037>feR9!N!\b\003 \t\005\002\002\003B\007\005/\001\rA!\002\t\021\tE!q\003a\001\005\013A\001B!\006\003\030\001\007!Q\001\005\b\005K\001A\021\001B\024\003\025\031G.[2l)\035Q'\021\006B\026\005[A\001B!\004\003$\001\007!Q\001\005\t\005#\021\031\0031\001\003\006!A!Q\003B\022\001\004\021)\001C\004\0032\001!\tAa\r\002\t]\fGn\033\013\004\027\nU\002\002CAL\005_\001\rAa\016\021\t\te\"1H\007\003\003+KAA!\020\002\026\n1QI\034;jifDqA!\021\001\t\003\021\031%\001\003tQ>$HcA&\003F!A!q\tB \001\004\ti)A\003beJ|w\017C\004\003L\001!\tE!\024\002\023\r\fg.\0269eCR,G#\0016\t\017\tE\003\001\"\021\002x\006aQ\017\0353bi\026,e\016^5us\"1!Q\013\001\005\n%\fq$[:DY&,g\016\036*fC\022Lhi\034:Nk2$\030N\0217pG.\034\005.Z2l\021\035\021I\006\001C!\003o\fq\001Z5ta>\034X\rC\004\003^\001!\t&a>\002\035=t7i\0347pe\016C\027M\\4fI\"9!\021\r\001\005B\t\r\024\001\006:fC\0224%o\\7O\005R3uN]*feZ,'\017F\002L\005KB\001Ba\032\003`\001\007!\021N\001\004]\n$\b\003\002B6\005_j!A!\034\013\007\t\035\024#\003\003\003r\t5$A\004(C)R\013wmQ8na>,h\016\032\005\b\005k\002A\021\tB<\003M9(/\033;f)>t%\t\026$peN+'O^3s)\rY%\021\020\005\t\005O\022\031\b1\001\003j!9!Q\020\001\005B\t}\024\001\006:fC\0224%o\\7O\005R3uN]\"mS\026tG\017F\002L\005\003C\001Ba\032\003|\001\007!\021\016\025\t\005w\ni+!2\002H\"9!q\021\001\005B\t%\025aE<sSR,Gk\034(C)\032{'o\0217jK:$HcA&\003\f\"A!q\rBC\001\004\021I\007C\004\003\020\002!\tE!%\002)\035,GOU3oI\026\024(i\\;oI&twMQ8y)\t\ty\006\013\005\003\016\0065\026QYAd\021\035\0219\n\001C!\0053\0131dZ3u\033\006D(+\0328eKJ$\025n\035;b]\016,7+];be\026$GC\001B\003Q!\021)*!,\002F\006\035\007b\002BP\001\021\005#\021U\001\n_:\fe.\0317zu\026$BBa)\003&\nM&Q\027B_\005\003B!\022/\002X\"A!q\025BO\001\004\021I+\001\004qY\006LXM\035\t\005\005W\023y+\004\002\003.*!!qUAK\023\021\021\tL!,\003\031\025sG/\033;z!2\f\0270\032:\t\017\005%&Q\024a\001\t\"A!Q\002BO\001\004\0219\fE\002F\005sK1Aa/<\005\0251En\\1u\021!\021\tB!(A\002\t]\006\002\003B\013\005;\003\rAa.\t\017\t\r\007\001\"\025\003F\0061rN\034*fIN$xN\\3J]B,Ho\0215b]\036,G\rF\002L\005\017D\001B!3\003B\002\007!1Z\001\005CJ<7\017E\002\031\005\033L1Aa4\032\005a\021V\rZ:u_:,7\t[1oO\026$WI^3oi\006\023xm\035\005\b\005'\004A\021IA|\003EygNU8uCRLwN\\\"iC:<W\r\032\005\b\005/\004A\021\tBm\003\035\031w.\0349be\026$2\001\022Bn\021\035\021iN!6A\002}\nA\001\0365bi\"9!\021\035\001\005\n\t5\023\001\003;ss6+'oZ3\t\017\t\025\b\001\"\003\003h\0069\001O]8kK\016$H\003\002Bu\005_\004b!\022Bv\t\022#\025b\001Bww\t1A+\0369mKNBqA!=\003d\002\007q(A\001u\021\035\021)\020\001C\005\005o\f\021\"\0368qe>TWm\031;\025\021\t%(\021 B\007\003AqAa?\003t\002\007A)A\001y\021\035\021yPa=A\002\021\013\021!\037\005\b\007\007\021\031\0201\001E\003\005Q\b")
/*     */ public class Screen implements TextBuffer, SidedEnvironment, Rotatable, RedstoneAware, Colored, Analyzable, Ordered<Screen> {
/*     */   private int tier;
/*     */   private boolean shouldCheckForMultiBlock;
/*     */   private int delayUntilCheckForMultiBlock;
/*     */   private int width;
/*     */   private int height;
/*     */   private Screen origin;
/*     */   private final Set<Screen> screens;
/*     */   private boolean hadRedstoneInput;
/*     */   private Option<AxisAlignedBB> cachedBounds;
/*     */   private boolean invertTouchMode;
/*     */   private final Set<EntityArrow> arrows;
/*     */   private int li$cil$oc$common$tileentity$traits$Colored$$_color;
/*     */   
/*  24 */   public boolean $less(Object that) { return Ordered.class.$less(this, that); } private final int[] _input; private final int[] _output; private boolean _isOutputEnabled; private boolean shouldUpdateInput; private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; private final ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; private ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; private final TextBuffer buffer; private boolean isChangeScheduled; private boolean moving; private volatile boolean bitmap$0; public boolean $greater(Object that) { return Ordered.class.$greater(this, that); } public boolean $less$eq(Object that) { return Ordered.class.$less$eq(this, that); } public boolean $greater$eq(Object that) { return Ordered.class.$greater$eq(this, that); } public int compareTo(Object that) { return Ordered.class.compareTo(this, that); } public int li$cil$oc$common$tileentity$traits$Colored$$_color() { return this.li$cil$oc$common$tileentity$traits$Colored$$_color; } public void li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$Colored$$_color = x$1; } public int color() { return Colored.class.color(this); } public void color_$eq(int value) { Colored.class.color_$eq(this, value); } public boolean consumesDye() { return Colored.class.consumesDye(this); } public int getColor() { return Colored.class.getColor(this); } public void setColor(int value) { Colored.class.setColor(this, value); } public int[] _input() { return this._input; } public int[] _output() { return this._output; } public boolean _isOutputEnabled() { return this._isOutputEnabled; } public void _isOutputEnabled_$eq(boolean x$1) { this._isOutputEnabled = x$1; } public boolean shouldUpdateInput() { return this.shouldUpdateInput; } public void shouldUpdateInput_$eq(boolean x$1) { this.shouldUpdateInput = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq(int[] x$1) { this._input = x$1; } public void li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq(int[] x$1) { this._output = x$1; } public boolean isOutputEnabled() { return RedstoneAware.class.isOutputEnabled(this); } public void setOutputEnabled(boolean value) { RedstoneAware.class.setOutputEnabled(this, value); } public Option<Object> getObjectFuzzy(Map map, int key) { return RedstoneAware.class.getObjectFuzzy(this, map, key); } public Option<Object> valueToInt(Object value) { return RedstoneAware.class.valueToInt(this, value); } public int[] getInput() { return RedstoneAware.class.getInput(this); } public int getInput(ForgeDirection side) { return RedstoneAware.class.getInput(this, side); } public void setInput(ForgeDirection side, int newInput) { RedstoneAware.class.setInput(this, side, newInput); } public void setInput(int[] values) { RedstoneAware.class.setInput(this, values); } public int maxInput() { return RedstoneAware.class.maxInput(this); } public int[] getOutput() { return RedstoneAware.class.getOutput(this); } public int getOutput(ForgeDirection side) { return RedstoneAware.class.getOutput(this, side); } public boolean setOutput(ForgeDirection side, int value) { return RedstoneAware.class.setOutput(this, side, value); } public boolean setOutput(Map values) { return RedstoneAware.class.setOutput(this, values); } public void checkRedstoneInputChanged() { RedstoneAware.class.checkRedstoneInputChanged(this); } public void func_145829_t() { RedstoneAware.class.validate(this); } public void updateRedstoneInput(ForgeDirection side) { RedstoneAware.class.updateRedstoneInput(this, side); } public void onRedstoneOutputEnabledChanged() { RedstoneAware.class.onRedstoneOutputEnabledChanged(this); } public void onRedstoneOutputChanged(ForgeDirection side) { RedstoneAware.class.onRedstoneOutputChanged(this, side); } @Method(modid = "RedLogic") public boolean connects(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connects(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public boolean connectsAroundCorner(IWire wire, int blockFace, int fromDirection) { return RedstoneAware.class.connectsAroundCorner(this, wire, blockFace, fromDirection); } @Method(modid = "RedLogic") public short getEmittedSignalStrength(int blockFace, int toDirection) { return RedstoneAware.class.getEmittedSignalStrength(this, blockFace, toDirection); } @Method(modid = "RedLogic") public void onRedstoneInputChanged() { RedstoneAware.class.onRedstoneInputChanged(this); } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction; } public ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch = x$1; } public ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw() { return this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw; } public void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction = x$1; } public void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] x$1) { this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction = x$1; } public ForgeDirection pitch() { return Rotatable.class.pitch(this); } public void pitch_$eq(ForgeDirection value) { Rotatable.class.pitch_$eq(this, value); } public ForgeDirection yaw() { return Rotatable.class.yaw(this); } public void yaw_$eq(ForgeDirection value) { Rotatable.class.yaw_$eq(this, value); } public boolean setFromEntityPitchAndYaw(Entity entity) { return Rotatable.class.setFromEntityPitchAndYaw(this, entity); } public boolean setFromFacing(ForgeDirection value) { return Rotatable.class.setFromFacing(this, value); } public boolean invertRotation() { return Rotatable.class.invertRotation(this); } public ForgeDirection facing() { return Rotatable.class.facing(this); } public boolean rotate(ForgeDirection axis) { return Rotatable.class.rotate(this, axis); } public ForgeDirection toLocal(ForgeDirection value) { return Rotatable.class.toLocal(this, value); } public ForgeDirection toGlobal(ForgeDirection value) { return Rotatable.class.toGlobal(this, value); } private TextBuffer buffer$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.buffer = TextBuffer.class.buffer(this); this.bitmap$0 = true; }  return this.buffer; }  } public TextBuffer buffer() { return this.bitmap$0 ? this.buffer : buffer$lzycompute(); } public Node node() { return TextBuffer.class.node(this); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition((Environment)this); } public double yPosition() { return Environment.class.yPosition((Environment)this); } public double zPosition() { return Environment.class.zPosition((Environment)this); } public void markChanged() { Environment.class.markChanged((Environment)this); } public boolean isConnected() { return Environment.class.isConnected((Environment)this); } public void initialize() { Environment.class.initialize((Environment)this); } public void onMessage(Message message) { Environment.class.onMessage((Environment)this, message); } public void onConnect(Node node) { Environment.class.onConnect((Environment)this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect((Environment)this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove((Environment)this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving((Environment)this); } public Object[] result(Seq args) { return Environment.class.result((Environment)this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145843_s() { TileEntity.class.invalidate((TileEntity)this); } public void onChunkUnload() { TileEntity.class.onChunkUnload((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public int tier() { return this.tier; } public void tier_$eq(int x$1) { this.tier = x$1; } public Screen(int tier) { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$((Environment)this); TextBuffer.class.$init$(this); RotationAware.class.$init$((RotationAware)this); Rotatable.class.$init$(this); RedstoneAware.class.$init$(this); Colored.class.$init$(this); Ordered.class.$init$(this);
/*     */ 
/*     */ 
/*     */     
/*  28 */     _isOutputEnabled_$eq(true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     this.shouldCheckForMultiBlock = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     this.delayUntilCheckForMultiBlock = 40;
/*     */     
/*  47 */     this.width = 1; this.height = 1;
/*     */     
/*  49 */     this.origin = this;
/*     */     
/*  51 */     (new Screen[1])[0] = this; this.screens = (Set<Screen>)Set$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Screen[1]));
/*     */     
/*  53 */     this.hadRedstoneInput = false;
/*     */     
/*  55 */     this.cachedBounds = (Option<AxisAlignedBB>)None$.MODULE$;
/*     */     
/*  57 */     this.invertTouchMode = false;
/*     */     
/*  59 */     this.arrows = Set$.MODULE$.empty();
/*     */     
/*  61 */     color_$eq(Color$.MODULE$.byTier()[tier()]); } public Screen() { this(0); } public ForgeDirection[] validFacings() { return ForgeDirection.VALID_DIRECTIONS; } public boolean shouldCheckForMultiBlock() { return this.shouldCheckForMultiBlock; } public void shouldCheckForMultiBlock_$eq(boolean x$1) { this.shouldCheckForMultiBlock = x$1; } public int delayUntilCheckForMultiBlock() { return this.delayUntilCheckForMultiBlock; } public void delayUntilCheckForMultiBlock_$eq(int x$1) { this.delayUntilCheckForMultiBlock = x$1; } public int width() { return this.width; } public void width_$eq(int x$1) { this.width = x$1; }
/*     */   public int height() { return this.height; }
/*     */   public void height_$eq(int x$1) { this.height = x$1; }
/*  64 */   @SideOnly(Side.CLIENT) public boolean canConnect(ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.SOUTH; if (toLocal(side) == null) { toLocal(side); if (forgeDirection != null); } else if (toLocal(side).equals(forgeDirection)) {  }  } public Screen origin() { return this.origin; } public void origin_$eq(Screen x$1) { this.origin = x$1; } public Set<Screen> screens() { return this.screens; } public boolean hadRedstoneInput() { return this.hadRedstoneInput; } public void hadRedstoneInput_$eq(boolean x$1) { this.hadRedstoneInput = x$1; }
/*     */   public Option<AxisAlignedBB> cachedBounds() { return this.cachedBounds; }
/*     */   public void cachedBounds_$eq(Option<AxisAlignedBB> x$1) { this.cachedBounds = x$1; }
/*     */   public boolean invertTouchMode() { return this.invertTouchMode; }
/*     */   public void invertTouchMode_$eq(boolean x$1) { this.invertTouchMode = x$1; }
/*     */   private Set<EntityArrow> arrows() { return this.arrows; }
/*     */   public Node sidedNode(ForgeDirection side) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual toLocal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   5: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   8: astore_2
/*     */     //   9: dup
/*     */     //   10: ifnonnull -> 21
/*     */     //   13: pop
/*     */     //   14: aload_2
/*     */     //   15: ifnull -> 28
/*     */     //   18: goto -> 83
/*     */     //   21: aload_2
/*     */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   25: ifeq -> 83
/*     */     //   28: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   31: aload_0
/*     */     //   32: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   35: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   38: aload_0
/*     */     //   39: invokevirtual position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   42: aload_1
/*     */     //   43: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   46: invokevirtual blockExists : (Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   49: ifeq -> 79
/*     */     //   52: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   55: aload_0
/*     */     //   56: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   59: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   62: aload_0
/*     */     //   63: invokevirtual position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   66: aload_1
/*     */     //   67: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   70: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   73: instanceof li/cil/oc/common/tileentity/Keyboard
/*     */     //   76: ifne -> 83
/*     */     //   79: aconst_null
/*     */     //   80: goto -> 87
/*     */     //   83: aload_0
/*     */     //   84: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   87: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	88	0	this	Lli/cil/oc/common/tileentity/Screen;
/*     */     //   0	88	1	side	Lnet/minecraftforge/common/util/ForgeDirection; }
/*  71 */   public boolean isOrigin() { Screen screen = this; if (origin() == null) { origin(); if (screen != null); } else if (origin().equals(screen))
/*     */     {  }
/*     */      }
/*  74 */   public Tuple2<Object, Object> localPosition() { Tuple3<Object, Object, Object> tuple3 = project(this); if (tuple3 != null) { int lx = BoxesRunTime.unboxToInt(tuple3._1()), ly = BoxesRunTime.unboxToInt(tuple3._2()); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(lx, ly), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*  75 */       Tuple3<Object, Object, Object> tuple31 = project(origin()); if (tuple31 != null) { int ox = BoxesRunTime.unboxToInt(tuple31._1()), oy = BoxesRunTime.unboxToInt(tuple31._2()); Tuple2.mcII.sp sp4 = new Tuple2.mcII.sp(ox, oy), sp3 = sp4; int k = sp3._1$mcI$sp(), m = sp3._2$mcI$sp();
/*  76 */         return (Tuple2<Object, Object>)new Tuple2.mcII.sp(i - k, j - m); }
/*     */        throw new MatchError(tuple31); }
/*     */     
/*  79 */     throw new MatchError(tuple3); } public boolean hasKeyboard() { return screens().exists((Function1)new Screen$$anonfun$hasKeyboard$1(this)); }
/*     */   
/*     */   public final class Screen$$anonfun$hasKeyboard$1 extends AbstractFunction1<Screen, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public Screen$$anonfun$hasKeyboard$1(Screen $outer) {}
/*     */     
/*  84 */     public final boolean apply(Screen screen) { return Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new Screen$$anonfun$hasKeyboard$1$$anonfun$apply$1(this, screen), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).exists((Function1)new Screen$$anonfun$hasKeyboard$1$$anonfun$apply$2(this)); } public final class Screen$$anonfun$hasKeyboard$1$$anonfun$apply$1 extends AbstractFunction1<ForgeDirection, Tuple2<ForgeDirection, TileEntity>> implements Serializable { public static final long serialVersionUID = 0L; private final Screen screen$1; public final Tuple2<ForgeDirection, TileEntity> apply(ForgeDirection side) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(this.screen$1.x() + side.offsetX), BoxesRunTime.boxToInteger(this.screen$1.y() + side.offsetY), BoxesRunTime.boxToInteger(this.screen$1.z() + side.offsetZ)); if (tuple3 != null) { int nx = BoxesRunTime.unboxToInt(tuple3._1()), ny = BoxesRunTime.unboxToInt(tuple3._2()), nz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(nx), BoxesRunTime.boxToInteger(ny), BoxesRunTime.boxToInteger(nz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3()); return new Tuple2(side, this.$outer.li$cil$oc$common$tileentity$Screen$$anonfun$$$outer().world().func_72899_e(i, j, k) ? this.$outer.li$cil$oc$common$tileentity$Screen$$anonfun$$$outer().world().func_147438_o(i, j, k) : null); }  throw new MatchError(tuple3); } public Screen$$anonfun$hasKeyboard$1$$anonfun$apply$1(Screen$$anonfun$hasKeyboard$1 $outer, Screen screen$1) {} } public final class Screen$$anonfun$hasKeyboard$1$$anonfun$apply$2 extends AbstractFunction1<Tuple2<ForgeDirection, TileEntity>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/*  85 */           ForgeDirection side = (ForgeDirection)tuple2._1(); TileEntity keyboard = (TileEntity)tuple2._2(); if (keyboard instanceof Keyboard) { Keyboard keyboard1 = (Keyboard)keyboard; return keyboard1.hasNodeOnSide(side.getOpposite()); }
/*     */         
/*     */         } 
/*     */         return false; }
/*     */        public Screen$$anonfun$hasKeyboard$1$$anonfun$apply$2(Screen$$anonfun$hasKeyboard$1 $outer) {} } } public void checkMultiBlock() {
/*  90 */     shouldCheckForMultiBlock_$eq(true);
/*  91 */     width_$eq(1);
/*  92 */     height_$eq(1);
/*  93 */     origin_$eq(this);
/*  94 */     screens().clear();
/*  95 */     screens().$plus$eq(this);
/*  96 */     cachedBounds_$eq((Option<AxisAlignedBB>)None$.MODULE$);
/*  97 */     invertTouchMode_$eq(false);
/*     */   }
/*     */   
/*     */   private final double dot$3(ForgeDirection f, double hitX$1, double hitY$1, double hitZ$1)
/*     */   {
/* 102 */     return f.offsetX * hitX$1 + f.offsetY * hitY$1 + f.offsetZ * hitZ$1;
/* 103 */   } public Tuple2<Object, Option<Tuple2<Object, Object>>> toScreenCoordinates(double hitX, double hitY, double hitZ) { Tuple2.mcDD.sp sp = new Tuple2.mcDD.sp(dot$3(toGlobal(ForgeDirection.EAST), hitX, hitY, hitZ), dot$3(toGlobal(ForgeDirection.UP), hitX, hitY, hitZ)); if (sp != null) { double hx = sp._1$mcD$sp(), hy = sp._2$mcD$sp(); Tuple2.mcDD.sp sp2 = new Tuple2.mcDD.sp(hx, hy), sp1 = sp2; double d1 = sp1._1$mcD$sp(), d2 = sp1._2$mcD$sp();
/* 104 */       double tx = (d1 < false) ? (true + d1) : d1;
/* 105 */       double ty = true - ((d2 < false) ? (true + d2) : d2);
/* 106 */       Tuple2<Object, Object> tuple2 = localPosition(); if (tuple2 != null) { int lx = tuple2._1$mcI$sp(), ly = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp4 = new Tuple2.mcII.sp(lx, ly), sp3 = sp4; int i = sp3._1$mcI$sp(), j = sp3._2$mcI$sp();
/* 107 */         Tuple2.mcDD.sp sp5 = new Tuple2.mcDD.sp(i + tx, (height() - 1 - j) + ty); if (sp5 != null) { double ax = sp5._1$mcD$sp(), ay = sp5._2$mcD$sp(); Tuple2.mcDD.sp sp7 = new Tuple2.mcDD.sp(ax, ay), sp6 = sp7; double d3 = sp6._1$mcD$sp(), d4 = sp6._2$mcD$sp();
/*     */ 
/*     */           
/* 110 */           double border = 0.140625D;
/* 111 */           if (d3 <= border || d4 <= border || d3 >= width() - border || d4 >= height() - border) {
/* 112 */             return new Tuple2(BoxesRunTime.boxToBoolean(false), None$.MODULE$);
/*     */           }
/* 114 */           if ((world()).field_72995_K) {
/*     */             
/* 116 */             Tuple2.mcDD.sp sp8 = new Tuple2.mcDD.sp(width() - border * 2, height() - border * 2); if (sp8 != null) { double iw = sp8._1$mcD$sp(), ih = sp8._2$mcD$sp(); Tuple2.mcDD.sp sp10 = new Tuple2.mcDD.sp(iw, ih), sp9 = sp10; double d5 = sp9._1$mcD$sp(), d6 = sp9._2$mcD$sp();
/* 117 */               Tuple2.mcDD.sp sp11 = new Tuple2.mcDD.sp((d3 - border) / d5, (d4 - border) / d6); if (sp11 != null) { double rx = sp11._1$mcD$sp(), ry = sp11._2$mcD$sp(); Tuple2.mcDD.sp sp13 = new Tuple2.mcDD.sp(rx, ry), sp12 = sp13; double d7 = sp12._1$mcD$sp(), d8 = sp12._2$mcD$sp();
/*     */ 
/*     */                 
/* 120 */                 int bw = origin().buffer().getViewportWidth();
/* 121 */                 int bh = origin().buffer().getViewportHeight();
/* 122 */                 Tuple2.mcDD.sp sp14 = new Tuple2.mcDD.sp(origin().buffer().renderWidth() / d5, origin().buffer().renderHeight() / d6); if (sp14 != null) { double bpw = sp14._1$mcD$sp(), bph = sp14._2$mcD$sp(); Tuple2.mcDD.sp sp16 = new Tuple2.mcDD.sp(bpw, bph), sp15 = sp16; double d9 = sp15._1$mcD$sp(), d10 = sp15._2$mcD$sp();
/*     */                   
/* 124 */                   double rh = d10 / d9;
/* 125 */                   double bry = (d8 - (true - rh) * 0.5D) / rh;
/*     */ 
/*     */ 
/*     */                   
/* 129 */                   double rw = d9 / d10;
/* 130 */                   double brx = (d7 - (true - rw) * 0.5D) / rw;
/* 131 */                   Tuple2.mcDD.sp sp17 = (d9 > d10) ? new Tuple2.mcDD.sp(d7, bry) : ((d10 > d9) ? new Tuple2.mcDD.sp(brx, d8) : 
/*     */ 
/*     */                     
/* 134 */                     new Tuple2.mcDD.sp(d7, d8)); if (sp17 != null)
/*     */                   { double d11 = sp17._1$mcD$sp(), d12 = sp17._2$mcD$sp(); Tuple2.mcDD.sp sp19 = new Tuple2.mcDD.sp(d11, d12), sp18 = sp19;
/*     */                     double d13 = sp18._1$mcD$sp(), d14 = sp18._2$mcD$sp();
/* 137 */                     boolean inBounds = ((d14 >= false && d14 <= true && d13 >= false) || d13 <= true);
/* 138 */                     return new Tuple2(BoxesRunTime.boxToBoolean(inBounds), new Some(new Tuple2.mcDD.sp(d13 * bw, d14 * bh))); }  throw new MatchError(sp17); }  throw new MatchError(sp14); }  throw new MatchError(sp11); }  throw new MatchError(sp8);
/*     */           }  return new Tuple2(BoxesRunTime.boxToBoolean(true), None$.MODULE$); }
/*     */          throw new MatchError(sp5); }
/*     */        throw new MatchError(tuple2); }
/* 142 */      throw new MatchError(sp); } public boolean copyToAnalyzer(double hitX, double hitY, double hitZ) { Tuple2<Object, Option<Tuple2<Object, Object>>> tuple2 = toScreenCoordinates(hitX, hitY, hitZ); if (tuple2 != null) { boolean inBounds = tuple2._1$mcZ$sp(); Option coordinates = (Option)tuple2._2(); Tuple2 tuple22 = new Tuple2(BoxesRunTime.boxToBoolean(inBounds), coordinates), tuple21 = tuple22; boolean bool1 = tuple21._1$mcZ$sp(); Option option1 = (Option)tuple21._2();
/* 143 */       Option option2 = option1;
/* 144 */       if (option2 instanceof Some) { Some some = (Some)option2; Tuple2 tuple23 = (Tuple2)some.x(); if (tuple23 != null) { boolean bool; double y = tuple23._2$mcD$sp(); TextBuffer textBuffer = origin().buffer();
/* 145 */           if (textBuffer instanceof TextBuffer) { TextBuffer textBuffer1 = (TextBuffer)textBuffer;
/* 146 */             textBuffer1.copyToAnalyzer((int)y, null);
/* 147 */             bool = true; }
/* 148 */           else { bool = false; }  return bool; }
/*     */          }
/* 150 */        return bool1; }
/*     */     
/*     */     throw new MatchError(tuple2); }
/*     */   
/*     */   public boolean click(double hitX, double hitY, double hitZ) {
/* 155 */     Tuple2<Object, Option<Tuple2<Object, Object>>> tuple2 = toScreenCoordinates(hitX, hitY, hitZ); if (tuple2 != null) { boolean inBounds = tuple2._1$mcZ$sp(); Option coordinates = (Option)tuple2._2(); Tuple2 tuple22 = new Tuple2(BoxesRunTime.boxToBoolean(inBounds), coordinates), tuple21 = tuple22; boolean bool1 = tuple21._1$mcZ$sp(); Option option1 = (Option)tuple21._2();
/* 156 */       Option option2 = option1;
/* 157 */       if (option2 instanceof Some) { Some some = (Some)option2; Tuple2 tuple23 = (Tuple2)some.x(); if (tuple23 != null) { double x = tuple23._1$mcD$sp(), y = tuple23._2$mcD$sp();
/*     */           
/* 159 */           origin().buffer().mouseDown(x, y, 0, null); return true; }
/*     */          }
/* 161 */        return bool1; }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   }
/*     */   public void walk(Entity entity) {
/* 166 */     Tuple2<Object, Object> tuple2 = localPosition(); if (tuple2 != null) { int x = tuple2._1$mcI$sp(), y = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(x, y), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 167 */       Entity entity1 = entity;
/* 168 */       if (entity1 instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity1; if (Settings$.MODULE$.get().inputUsername()) {
/* 169 */           origin().node().sendToReachable("computer.signal", new Object[] { "walk", BoxesRunTime.boxToInteger(i + 1), BoxesRunTime.boxToInteger(height() - j), entityPlayer.func_70005_c_() }); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return;
/*     */         }  }
/* 171 */        origin().node().sendToReachable("computer.signal", new Object[] { "walk", BoxesRunTime.boxToInteger(i + 1), BoxesRunTime.boxToInteger(height() - j) }); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       return; }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   } public void shot(EntityArrow arrow) {
/* 176 */     arrows().add(arrow);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 181 */     return true;
/*     */   }
/*     */   
/* 184 */   public void func_145845_h() { RedstoneAware.class.updateEntity(this);
/* 185 */     if (shouldCheckForMultiBlock() && ((isClient() && isClientReadyForMultiBlockCheck()) || (isServer() && isConnected()))) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 190 */       (new Screen[1])[0] = this; SortedSet pending = (SortedSet)SortedSet$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Screen[1]), Ordering$.MODULE$.ordered((Function1)Predef$.MODULE$.$conforms()));
/* 191 */       (new Screen[1])[0] = this; Queue queue = (Queue)Queue$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Screen[1]));
/* 192 */       while (queue.nonEmpty()) {
/* 193 */         Screen current = (Screen)queue.dequeue();
/* 194 */         Tuple3<Object, Object, Object> tuple3 = project(current); if (tuple3 != null) { int lx = BoxesRunTime.unboxToInt(tuple3._1()), ly = BoxesRunTime.unboxToInt(tuple3._2()), lz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(lx), BoxesRunTime.boxToInteger(ly), BoxesRunTime.boxToInteger(lz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 202 */           tryQueue$1(-1, 0, pending, queue, i, j, k);
/* 203 */           tryQueue$1(1, 0, pending, queue, i, j, k);
/* 204 */           tryQueue$1(0, -1, pending, queue, i, j, k);
/* 205 */           tryQueue$1(0, 1, pending, queue, i, j, k); continue; }
/*     */          throw new MatchError(tuple3);
/*     */       } 
/* 208 */       while (pending.nonEmpty()) {
/* 209 */         Screen current = (Screen)pending.firstKey(); do {  }
/* 210 */         while (current.tryMerge());
/* 211 */         current.screens().foreach(
/* 212 */             (Function1)new Screen$$anonfun$updateEntity$1(this, pending, queue));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 217 */         if (isClient()) {
/* 218 */           AxisAlignedBB bounds = current.origin().getRenderBoundingBox();
/* 219 */           world().func_147458_c((int)bounds.field_72340_a, (int)bounds.field_72338_b, (int)bounds.field_72339_c, 
/* 220 */               (int)bounds.field_72336_d, (int)bounds.field_72337_e, (int)bounds.field_72334_f);
/*     */         } 
/*     */       } 
/*     */       
/* 224 */       queue.foreach((Function1)new Screen$$anonfun$updateEntity$2(this));
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
/* 247 */     if (arrows().nonEmpty())
/* 248 */     { arrows().foreach((Function1)new Screen$$anonfun$updateEntity$3(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 257 */       arrows().clear(); }  } private final void tryQueue$1(int dx, int dy, SortedSet pending$1, Queue queue$1, int lx$1, int ly$1, int lz$1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload #5
/*     */     //   3: iload_1
/*     */     //   4: iadd
/*     */     //   5: iload #6
/*     */     //   7: iload_2
/*     */     //   8: iadd
/*     */     //   9: iload #7
/*     */     //   11: invokespecial unproject : (III)Lscala/Tuple3;
/*     */     //   14: astore #9
/*     */     //   16: aload #9
/*     */     //   18: ifnull -> 252
/*     */     //   21: aload #9
/*     */     //   23: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   26: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   29: istore #10
/*     */     //   31: aload #9
/*     */     //   33: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   36: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   39: istore #11
/*     */     //   41: aload #9
/*     */     //   43: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   46: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   49: istore #12
/*     */     //   51: new scala/Tuple3
/*     */     //   54: dup
/*     */     //   55: iload #10
/*     */     //   57: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   60: iload #11
/*     */     //   62: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   65: iload #12
/*     */     //   67: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   70: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   73: astore #13
/*     */     //   75: aload #13
/*     */     //   77: astore #8
/*     */     //   79: aload #8
/*     */     //   81: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   84: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   87: istore #14
/*     */     //   89: aload #8
/*     */     //   91: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   94: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   97: istore #15
/*     */     //   99: aload #8
/*     */     //   101: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   104: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   107: istore #16
/*     */     //   109: aload_0
/*     */     //   110: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   113: iload #14
/*     */     //   115: iload #15
/*     */     //   117: iload #16
/*     */     //   119: invokevirtual func_72899_e : (III)Z
/*     */     //   122: ifeq -> 251
/*     */     //   125: aload_0
/*     */     //   126: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   129: iload #14
/*     */     //   131: iload #15
/*     */     //   133: iload #16
/*     */     //   135: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   138: astore #17
/*     */     //   140: aload #17
/*     */     //   142: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   145: ifeq -> 246
/*     */     //   148: aload #17
/*     */     //   150: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   153: astore #18
/*     */     //   155: aload #18
/*     */     //   157: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   160: aload_0
/*     */     //   161: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   164: astore #19
/*     */     //   166: dup
/*     */     //   167: ifnonnull -> 179
/*     */     //   170: pop
/*     */     //   171: aload #19
/*     */     //   173: ifnull -> 187
/*     */     //   176: goto -> 246
/*     */     //   179: aload #19
/*     */     //   181: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   184: ifeq -> 246
/*     */     //   187: aload #18
/*     */     //   189: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   192: aload_0
/*     */     //   193: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   196: astore #20
/*     */     //   198: dup
/*     */     //   199: ifnonnull -> 211
/*     */     //   202: pop
/*     */     //   203: aload #20
/*     */     //   205: ifnull -> 219
/*     */     //   208: goto -> 246
/*     */     //   211: aload #20
/*     */     //   213: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   216: ifeq -> 246
/*     */     //   219: aload_3
/*     */     //   220: aload #18
/*     */     //   222: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   227: ifeq -> 246
/*     */     //   230: aload #4
/*     */     //   232: aload #18
/*     */     //   234: invokevirtual $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/MutableList;
/*     */     //   237: pop
/*     */     //   238: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   241: astore #21
/*     */     //   243: goto -> 251
/*     */     //   246: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   249: astore #21
/*     */     //   251: return
/*     */     //   252: new scala/MatchError
/*     */     //   255: dup
/*     */     //   256: aload #9
/*     */     //   258: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   261: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #196	-> 0
/*     */     //   #197	-> 109
/*     */     //   #198	-> 140
/*     */     //   #199	-> 246
/*     */     //   #195	-> 251
/*     */     //   #196	-> 252
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	262	0	this	Lli/cil/oc/common/tileentity/Screen;
/*     */     //   0	262	1	dx	I
/*     */     //   0	262	2	dy	I
/*     */     //   0	262	3	pending$1	Lscala/collection/mutable/SortedSet;
/*     */     //   0	262	4	queue$1	Lscala/collection/mutable/Queue;
/*     */     //   0	262	5	lx$1	I
/*     */     //   0	262	6	ly$1	I
/*     */     //   0	262	7	lz$1	I
/*     */     //   31	231	10	nx	I
/*     */     //   41	221	11	ny	I
/*     */     //   51	211	12	nz	I
/*     */     //   89	173	14	nx	I
/*     */     //   99	163	15	ny	I
/*     */     //   109	153	16	nz	I } public final class Screen$$anonfun$updateEntity$1 extends AbstractFunction1<Screen, Queue<Screen>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final SortedSet pending$1; private final Queue queue$1; public Screen$$anonfun$updateEntity$1(Screen $outer, SortedSet pending$1, Queue queue$1) {} public final Queue<Screen> apply(Screen screen) { screen.shouldCheckForMultiBlock_$eq(false); this.pending$1.remove(screen); return (Queue<Screen>)this.queue$1.$plus$eq(screen); } } public final class Screen$$anonfun$updateEntity$2 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public Screen$$anonfun$updateEntity$2(Screen $outer) {} public final void apply(Screen screen) { TextBuffer buffer = screen.buffer(); if (screen.isOrigin()) { if (this.$outer.isServer()) { ((Component)buffer.node()).setVisibility(Visibility.Network); buffer.setEnergyCostPerTick(Settings$.MODULE$.get().screenCost() * screen.width() * screen.height()); buffer.setAspectRatio(screen.width(), screen.height()); }  } else { if (this.$outer.isServer()) { ((Component)buffer.node()).setVisibility(Visibility.None); buffer.setEnergyCostPerTick(Settings$.MODULE$.get().screenCost()); }  buffer.setAspectRatio(1.0D, 1.0D); int w = buffer.getWidth(); int h = buffer.getHeight(); buffer.setForegroundColor(16777215, false); buffer.setBackgroundColor(0, false); buffer.fill(0, 0, w, h, 32); }  } } public final class Screen$$anonfun$updateEntity$3 extends AbstractFunction1<EntityArrow, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public Screen$$anonfun$updateEntity$3(Screen $outer) {}
/*     */     public final Object apply(EntityArrow arrow) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: getfield field_70165_t : D
/*     */       //   4: aload_0
/*     */       //   5: getfield $outer : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   8: invokevirtual x : ()I
/*     */       //   11: i2d
/*     */       //   12: dsub
/*     */       //   13: dstore_2
/*     */       //   14: aload_1
/*     */       //   15: getfield field_70163_u : D
/*     */       //   18: aload_0
/*     */       //   19: getfield $outer : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   22: invokevirtual y : ()I
/*     */       //   25: i2d
/*     */       //   26: dsub
/*     */       //   27: dstore #4
/*     */       //   29: aload_1
/*     */       //   30: getfield field_70161_v : D
/*     */       //   33: aload_0
/*     */       //   34: getfield $outer : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   37: invokevirtual z : ()I
/*     */       //   40: i2d
/*     */       //   41: dsub
/*     */       //   42: dstore #6
/*     */       //   44: aload_1
/*     */       //   45: getfield field_70250_c : Lnet/minecraft/entity/Entity;
/*     */       //   48: astore #8
/*     */       //   50: aload #8
/*     */       //   52: instanceof net/minecraft/entity/player/EntityPlayer
/*     */       //   55: ifeq -> 116
/*     */       //   58: aload #8
/*     */       //   60: checkcast net/minecraft/entity/player/EntityPlayer
/*     */       //   63: astore #9
/*     */       //   65: aload #9
/*     */       //   67: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   70: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */       //   73: astore #10
/*     */       //   75: dup
/*     */       //   76: ifnonnull -> 88
/*     */       //   79: pop
/*     */       //   80: aload #10
/*     */       //   82: ifnull -> 96
/*     */       //   85: goto -> 116
/*     */       //   88: aload #10
/*     */       //   90: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   93: ifeq -> 116
/*     */       //   96: aload_0
/*     */       //   97: getfield $outer : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   100: dload_2
/*     */       //   101: dload #4
/*     */       //   103: dload #6
/*     */       //   105: invokevirtual click : (DDD)Z
/*     */       //   108: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   111: astore #11
/*     */       //   113: goto -> 121
/*     */       //   116: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   119: astore #11
/*     */       //   121: aload #11
/*     */       //   123: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #249	-> 0
/*     */       //   #250	-> 14
/*     */       //   #251	-> 29
/*     */       //   #252	-> 44
/*     */       //   #253	-> 50
/*     */       //   #254	-> 116
/*     */       //   #252	-> 121
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	124	0	this	Lli/cil/oc/common/tileentity/Screen$$anonfun$updateEntity$3;
/*     */       //   0	124	1	arrow	Lnet/minecraft/entity/projectile/EntityArrow;
/*     */       //   14	109	2	hitX	D
/*     */       //   29	94	4	hitY	D
/*     */       //   44	79	6	hitZ	D } }
/* 262 */   private boolean isClientReadyForMultiBlockCheck() { delayUntilCheckForMultiBlock_$eq(delayUntilCheckForMultiBlock() - 1);
/*     */     return !(delayUntilCheckForMultiBlock() > 0); }
/*     */    public void dispose() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic dispose : (Lli/cil/oc/common/tileentity/traits/Environment;)V
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual screens : ()Lscala/collection/mutable/Set;
/*     */     //   8: invokeinterface clone : ()Lscala/collection/mutable/Set;
/*     */     //   13: new li/cil/oc/common/tileentity/Screen$$anonfun$dispose$1
/*     */     //   16: dup
/*     */     //   17: aload_0
/*     */     //   18: invokespecial <init> : (Lli/cil/oc/common/tileentity/Screen;)V
/*     */     //   21: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   26: aload_0
/*     */     //   27: invokevirtual isClient : ()Z
/*     */     //   30: ifeq -> 100
/*     */     //   33: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   36: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
/*     */     //   39: astore_1
/*     */     //   40: aload_1
/*     */     //   41: instanceof li/cil/oc/client/gui/Screen
/*     */     //   44: ifeq -> 95
/*     */     //   47: aload_1
/*     */     //   48: checkcast li/cil/oc/client/gui/Screen
/*     */     //   51: astore_2
/*     */     //   52: aload_2
/*     */     //   53: invokevirtual buffer : ()Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   56: aload_0
/*     */     //   57: invokevirtual buffer : ()Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   60: astore_3
/*     */     //   61: dup
/*     */     //   62: ifnonnull -> 73
/*     */     //   65: pop
/*     */     //   66: aload_3
/*     */     //   67: ifnull -> 80
/*     */     //   70: goto -> 95
/*     */     //   73: aload_3
/*     */     //   74: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   77: ifeq -> 95
/*     */     //   80: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   83: aconst_null
/*     */     //   84: invokevirtual func_147108_a : (Lnet/minecraft/client/gui/GuiScreen;)V
/*     */     //   87: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   90: astore #4
/*     */     //   92: goto -> 100
/*     */     //   95: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   98: astore #4
/*     */     //   100: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #267	-> 0
/*     */     //   #268	-> 4
/*     */     //   #269	-> 26
/*     */     //   #270	-> 33
/*     */     //   #271	-> 40
/*     */     //   #272	-> 80
/*     */     //   #273	-> 95
/*     */     //   #266	-> 100
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	101	0	this	Lli/cil/oc/common/tileentity/Screen;
/*     */   } public final class Screen$$anonfun$dispose$1 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final void apply(Screen x$16) {
/* 268 */       x$16.checkMultiBlock();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Screen$$anonfun$dispose$1(Screen $outer) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onColorChanged()
/*     */   {
/* 279 */     Colored.class.onColorChanged(this);
/* 280 */     screens().clone().foreach((Function1)new Screen$$anonfun$onColorChanged$1(this)); } public final class Screen$$anonfun$onColorChanged$1 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Screen x$17) { x$17.checkMultiBlock(); }
/*     */ 
/*     */     
/*     */     public Screen$$anonfun$onColorChanged$1(Screen $outer) {} }
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 286 */     tier_$eq(RichByte$.MODULE$.min$extension(Predef$.MODULE$.byteWrapper(RichByte$.MODULE$.max$extension(Predef$.MODULE$.byteWrapper(nbt.func_74771_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString())), (byte)0)), (byte)2));
/* 287 */     color_$eq(Color$.MODULE$.byTier()[tier()]);
/* 288 */     Colored.class.readFromNBTForServer(this, nbt);
/* 289 */     hadRedstoneInput_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("hadRedstoneInput").toString()));
/* 290 */     invertTouchMode_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("invertTouchMode").toString()));
/*     */   }
/*     */   
/*     */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 294 */     nbt.func_74774_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString(), (byte)tier());
/* 295 */     Colored.class.writeToNBTForServer(this, nbt);
/* 296 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("hadRedstoneInput").toString(), hadRedstoneInput());
/* 297 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("invertTouchMode").toString(), invertTouchMode());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void readFromNBTForClient(NBTTagCompound nbt) {
/* 302 */     Colored.class.readFromNBTForClient(this, nbt);
/* 303 */     invertTouchMode_$eq(nbt.func_74767_n("invertTouchMode"));
/*     */   }
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 307 */     Colored.class.writeToNBTForClient(this, nbt);
/* 308 */     nbt.func_74757_a("invertTouchMode", invertTouchMode());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public AxisAlignedBB getRenderBoundingBox()
/*     */   {
/*     */     AxisAlignedBB axisAlignedBB;
/* 315 */     if ((width() != 1 || height() != 1) && isOrigin())
/* 316 */     { Option<AxisAlignedBB> option = cachedBounds();
/* 317 */       if (option instanceof Some) { Some some = (Some)option; AxisAlignedBB bounds = (AxisAlignedBB)some.x(); }
/*     */       else
/* 319 */       { Tuple3<Object, Object, Object> tuple3 = unproject(width(), height(), 1); if (tuple3 != null) { int sx = BoxesRunTime.unboxToInt(tuple3._1()), sy = BoxesRunTime.unboxToInt(tuple3._2()), sz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(sx), BoxesRunTime.boxToInteger(sy), BoxesRunTime.boxToInteger(sz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 320 */           int ox = x() + ((i < 0) ? 1 : 0);
/* 321 */           int oy = y() + ((j < 0) ? 1 : 0);
/* 322 */           int oz = z() + ((k < 0) ? 1 : 0);
/* 323 */           AxisAlignedBB b = AxisAlignedBB.func_72330_a(ox, oy, oz, (ox + i), (oy + j), (oz + k));
/* 324 */           b.func_72324_b(package$.MODULE$.min(b.field_72340_a, b.field_72336_d), package$.MODULE$.min(b.field_72338_b, b.field_72337_e), package$.MODULE$.min(b.field_72339_c, b.field_72334_f), 
/* 325 */               package$.MODULE$.max(b.field_72340_a, b.field_72336_d), package$.MODULE$.max(b.field_72338_b, b.field_72337_e), package$.MODULE$.max(b.field_72339_c, b.field_72334_f));
/* 326 */           cachedBounds_$eq((Option<AxisAlignedBB>)new Some(b));
/* 327 */           axisAlignedBB = b; }
/*     */          throw new MatchError(tuple3); }
/*     */        }
/*     */     else { return super.getRenderBoundingBox(); }
/* 331 */      } @SideOnly(Side.CLIENT) public double func_145833_n() { return isOrigin() ? super.func_145833_n() : 0.0D; }
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 335 */     (new Node[1])[0] = origin().node(); return new Node[1];
/*     */   }
/*     */   public void onRedstoneInputChanged(RedstoneChangedEventArgs args) {
/* 338 */     RedstoneAware.class.onRedstoneInputChanged(this, args);
/* 339 */     boolean hasRedstoneInput = (BoxesRunTime.unboxToInt(((TraversableOnce)screens().map((Function1)new Screen$$anonfun$1(this), Set$.MODULE$.canBuildFrom())).max((Ordering)Ordering$Int$.MODULE$)) > 0);
/* 340 */     if (hasRedstoneInput != hadRedstoneInput()) {
/* 341 */       hadRedstoneInput_$eq(hasRedstoneInput);
/* 342 */       if (hasRedstoneInput)
/* 343 */         origin().buffer().setPowerState(!origin().buffer().getPowerState()); 
/*     */     } 
/*     */   } public final class Screen$$anonfun$1 extends AbstractFunction1<Screen, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int apply(Screen x$19) {
/*     */       return x$19.maxInput();
/*     */     } public Screen$$anonfun$1(Screen $outer) {} }
/* 349 */   public void onRotationChanged() { Rotatable.class.onRotationChanged(this);
/* 350 */     screens().clone().foreach((Function1)new Screen$$anonfun$onRotationChanged$1(this)); } public final class Screen$$anonfun$onRotationChanged$1 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Screen x$20) { x$20.checkMultiBlock(); }
/*     */ 
/*     */     
/*     */     public Screen$$anonfun$onRotationChanged$1(Screen $outer) {} }
/*     */   
/*     */   public int compare(Screen that) {
/* 356 */     return (x() != that.x()) ? (x() - that.x()) : (
/* 357 */       (y() != that.y()) ? (y() - that.y()) : (
/* 358 */       z() - that.z()));
/*     */   }
/*     */   
/*     */   private boolean tryMerge()
/*     */   {
/* 363 */     Tuple3<Object, Object, Object> tuple3 = project(origin()); if (tuple3 != null) { int ox = BoxesRunTime.unboxToInt(tuple3._1()), oy = BoxesRunTime.unboxToInt(tuple3._2()), oz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(ox), BoxesRunTime.boxToInteger(oy), BoxesRunTime.boxToInteger(oz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 396 */       return (tryMergeTowards$1(0, height(), i, j, k) || tryMergeTowards$1(0, -1, i, j, k) || tryMergeTowards$1(width(), 0, i, j, k) || tryMergeTowards$1(-1, 0, i, j, k)); }
/*     */      throw new MatchError(tuple3);
/*     */   } private final boolean tryMergeTowards$1(int dx, int dy, int ox$1, int oy$1, int oz$1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_3
/*     */     //   2: iload_1
/*     */     //   3: iadd
/*     */     //   4: iload #4
/*     */     //   6: iload_2
/*     */     //   7: iadd
/*     */     //   8: iload #5
/*     */     //   10: invokespecial unproject : (III)Lscala/Tuple3;
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: ifnull -> 660
/*     */     //   20: aload #7
/*     */     //   22: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   25: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   28: istore #8
/*     */     //   30: aload #7
/*     */     //   32: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   35: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   38: istore #9
/*     */     //   40: aload #7
/*     */     //   42: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   45: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   48: istore #10
/*     */     //   50: new scala/Tuple3
/*     */     //   53: dup
/*     */     //   54: iload #8
/*     */     //   56: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   59: iload #9
/*     */     //   61: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   64: iload #10
/*     */     //   66: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   69: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   72: astore #11
/*     */     //   74: aload #11
/*     */     //   76: astore #6
/*     */     //   78: aload #6
/*     */     //   80: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   83: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   86: istore #12
/*     */     //   88: aload #6
/*     */     //   90: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   93: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   96: istore #13
/*     */     //   98: aload #6
/*     */     //   100: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   103: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   106: istore #14
/*     */     //   108: aload_0
/*     */     //   109: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   112: iload #12
/*     */     //   114: iload #13
/*     */     //   116: iload #14
/*     */     //   118: invokevirtual func_72899_e : (III)Z
/*     */     //   121: ifeq -> 658
/*     */     //   124: aload_0
/*     */     //   125: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   128: iload #12
/*     */     //   130: iload #13
/*     */     //   132: iload #14
/*     */     //   134: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   137: astore #15
/*     */     //   139: aload #15
/*     */     //   141: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   144: ifeq -> 646
/*     */     //   147: aload #15
/*     */     //   149: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   152: astore #16
/*     */     //   154: aload #16
/*     */     //   156: invokevirtual tier : ()I
/*     */     //   159: aload_0
/*     */     //   160: invokevirtual tier : ()I
/*     */     //   163: if_icmpne -> 646
/*     */     //   166: aload #16
/*     */     //   168: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   171: aload_0
/*     */     //   172: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   175: astore #17
/*     */     //   177: dup
/*     */     //   178: ifnonnull -> 190
/*     */     //   181: pop
/*     */     //   182: aload #17
/*     */     //   184: ifnull -> 198
/*     */     //   187: goto -> 646
/*     */     //   190: aload #17
/*     */     //   192: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   195: ifeq -> 646
/*     */     //   198: aload #16
/*     */     //   200: invokevirtual color : ()I
/*     */     //   203: aload_0
/*     */     //   204: invokevirtual color : ()I
/*     */     //   207: if_icmpne -> 646
/*     */     //   210: aload #16
/*     */     //   212: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   215: aload_0
/*     */     //   216: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   219: astore #18
/*     */     //   221: dup
/*     */     //   222: ifnonnull -> 234
/*     */     //   225: pop
/*     */     //   226: aload #18
/*     */     //   228: ifnull -> 242
/*     */     //   231: goto -> 646
/*     */     //   234: aload #18
/*     */     //   236: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   239: ifeq -> 646
/*     */     //   242: aload_0
/*     */     //   243: invokevirtual screens : ()Lscala/collection/mutable/Set;
/*     */     //   246: aload #16
/*     */     //   248: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   253: ifne -> 646
/*     */     //   256: aload_0
/*     */     //   257: aload #16
/*     */     //   259: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   262: invokespecial project : (Lli/cil/oc/common/tileentity/Screen;)Lscala/Tuple3;
/*     */     //   265: astore #21
/*     */     //   267: aload #21
/*     */     //   269: ifnull -> 636
/*     */     //   272: aload #21
/*     */     //   274: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   277: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   280: istore #22
/*     */     //   282: aload #21
/*     */     //   284: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   287: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   290: istore #23
/*     */     //   292: new scala/Tuple2$mcII$sp
/*     */     //   295: dup
/*     */     //   296: iload #22
/*     */     //   298: iload #23
/*     */     //   300: invokespecial <init> : (II)V
/*     */     //   303: astore #24
/*     */     //   305: aload #24
/*     */     //   307: astore #20
/*     */     //   309: aload #20
/*     */     //   311: invokevirtual _1$mcI$sp : ()I
/*     */     //   314: istore #25
/*     */     //   316: aload #20
/*     */     //   318: invokevirtual _2$mcI$sp : ()I
/*     */     //   321: istore #26
/*     */     //   323: iload #26
/*     */     //   325: iload #4
/*     */     //   327: if_icmpne -> 368
/*     */     //   330: aload #16
/*     */     //   332: invokevirtual height : ()I
/*     */     //   335: aload_0
/*     */     //   336: invokevirtual height : ()I
/*     */     //   339: if_icmpne -> 368
/*     */     //   342: aload #16
/*     */     //   344: invokevirtual width : ()I
/*     */     //   347: aload_0
/*     */     //   348: invokevirtual width : ()I
/*     */     //   351: iadd
/*     */     //   352: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   355: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   358: invokevirtual maxScreenWidth : ()I
/*     */     //   361: if_icmpgt -> 368
/*     */     //   364: iconst_1
/*     */     //   365: goto -> 369
/*     */     //   368: iconst_0
/*     */     //   369: istore #27
/*     */     //   371: iload #25
/*     */     //   373: iload_3
/*     */     //   374: if_icmpne -> 415
/*     */     //   377: aload #16
/*     */     //   379: invokevirtual width : ()I
/*     */     //   382: aload_0
/*     */     //   383: invokevirtual width : ()I
/*     */     //   386: if_icmpne -> 415
/*     */     //   389: aload #16
/*     */     //   391: invokevirtual height : ()I
/*     */     //   394: aload_0
/*     */     //   395: invokevirtual height : ()I
/*     */     //   398: iadd
/*     */     //   399: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   402: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   405: invokevirtual maxScreenHeight : ()I
/*     */     //   408: if_icmpgt -> 415
/*     */     //   411: iconst_1
/*     */     //   412: goto -> 416
/*     */     //   415: iconst_0
/*     */     //   416: istore #28
/*     */     //   418: iload #27
/*     */     //   420: ifne -> 428
/*     */     //   423: iload #28
/*     */     //   425: ifeq -> 630
/*     */     //   428: iload #27
/*     */     //   430: ifeq -> 454
/*     */     //   433: iload #25
/*     */     //   435: iload_3
/*     */     //   436: if_icmpge -> 447
/*     */     //   439: aload #16
/*     */     //   441: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   444: goto -> 473
/*     */     //   447: aload_0
/*     */     //   448: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   451: goto -> 473
/*     */     //   454: iload #26
/*     */     //   456: iload #4
/*     */     //   458: if_icmpge -> 469
/*     */     //   461: aload #16
/*     */     //   463: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   466: goto -> 473
/*     */     //   469: aload_0
/*     */     //   470: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   473: astore #29
/*     */     //   475: iload #27
/*     */     //   477: ifeq -> 504
/*     */     //   480: new scala/Tuple2$mcII$sp
/*     */     //   483: dup
/*     */     //   484: aload_0
/*     */     //   485: invokevirtual width : ()I
/*     */     //   488: aload #16
/*     */     //   490: invokevirtual width : ()I
/*     */     //   493: iadd
/*     */     //   494: aload_0
/*     */     //   495: invokevirtual height : ()I
/*     */     //   498: invokespecial <init> : (II)V
/*     */     //   501: goto -> 525
/*     */     //   504: new scala/Tuple2$mcII$sp
/*     */     //   507: dup
/*     */     //   508: aload_0
/*     */     //   509: invokevirtual width : ()I
/*     */     //   512: aload_0
/*     */     //   513: invokevirtual height : ()I
/*     */     //   516: aload #16
/*     */     //   518: invokevirtual height : ()I
/*     */     //   521: iadd
/*     */     //   522: invokespecial <init> : (II)V
/*     */     //   525: astore #31
/*     */     //   527: aload #31
/*     */     //   529: ifnull -> 620
/*     */     //   532: aload #31
/*     */     //   534: invokevirtual _1$mcI$sp : ()I
/*     */     //   537: istore #32
/*     */     //   539: aload #31
/*     */     //   541: invokevirtual _2$mcI$sp : ()I
/*     */     //   544: istore #33
/*     */     //   546: new scala/Tuple2$mcII$sp
/*     */     //   549: dup
/*     */     //   550: iload #32
/*     */     //   552: iload #33
/*     */     //   554: invokespecial <init> : (II)V
/*     */     //   557: astore #34
/*     */     //   559: aload #34
/*     */     //   561: astore #30
/*     */     //   563: aload #30
/*     */     //   565: invokevirtual _1$mcI$sp : ()I
/*     */     //   568: istore #35
/*     */     //   570: aload #30
/*     */     //   572: invokevirtual _2$mcI$sp : ()I
/*     */     //   575: istore #36
/*     */     //   577: aload_0
/*     */     //   578: invokevirtual screens : ()Lscala/collection/mutable/Set;
/*     */     //   581: aload #16
/*     */     //   583: invokevirtual screens : ()Lscala/collection/mutable/Set;
/*     */     //   586: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;)Lscala/collection/mutable/Set;
/*     */     //   591: astore #37
/*     */     //   593: aload #37
/*     */     //   595: new li/cil/oc/common/tileentity/Screen$$anonfun$tryMergeTowards$1$1
/*     */     //   598: dup
/*     */     //   599: aload_0
/*     */     //   600: aload #29
/*     */     //   602: iload #35
/*     */     //   604: iload #36
/*     */     //   606: aload #37
/*     */     //   608: invokespecial <init> : (Lli/cil/oc/common/tileentity/Screen;Lli/cil/oc/common/tileentity/Screen;IILscala/collection/mutable/Set;)V
/*     */     //   611: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   616: iconst_1
/*     */     //   617: goto -> 631
/*     */     //   620: new scala/MatchError
/*     */     //   623: dup
/*     */     //   624: aload #31
/*     */     //   626: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   629: athrow
/*     */     //   630: iconst_0
/*     */     //   631: istore #19
/*     */     //   633: goto -> 649
/*     */     //   636: new scala/MatchError
/*     */     //   639: dup
/*     */     //   640: aload #21
/*     */     //   642: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   645: athrow
/*     */     //   646: iconst_0
/*     */     //   647: istore #19
/*     */     //   649: iload #19
/*     */     //   651: ifeq -> 658
/*     */     //   654: iconst_1
/*     */     //   655: goto -> 659
/*     */     //   658: iconst_0
/*     */     //   659: ireturn
/*     */     //   660: new scala/MatchError
/*     */     //   663: dup
/*     */     //   664: aload #7
/*     */     //   666: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   669: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #365	-> 0
/*     */     //   #366	-> 108
/*     */     //   #367	-> 139
/*     */     //   #368	-> 256
/*     */     //   #369	-> 323
/*     */     //   #370	-> 371
/*     */     //   #371	-> 418
/*     */     //   #373	-> 428
/*     */     //   #374	-> 433
/*     */     //   #377	-> 454
/*     */     //   #372	-> 473
/*     */     //   #380	-> 475
/*     */     //   #381	-> 504
/*     */     //   #380	-> 525
/*     */     //   #379	-> 532
/*     */     //   #380	-> 559
/*     */     //   #379	-> 561
/*     */     //   #382	-> 577
/*     */     //   #383	-> 593
/*     */     //   #390	-> 616
/*     */     //   #380	-> 620
/*     */     //   #392	-> 630
/*     */     //   #367	-> 631
/*     */     //   #368	-> 636
/*     */     //   #393	-> 646
/*     */     //   #366	-> 649
/*     */     //   #364	-> 659
/*     */     //   #365	-> 660
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	670	0	this	Lli/cil/oc/common/tileentity/Screen;
/*     */     //   0	670	1	dx	I
/*     */     //   0	670	2	dy	I
/*     */     //   0	670	3	ox$1	I
/*     */     //   0	670	4	oy$1	I
/*     */     //   0	670	5	oz$1	I
/*     */     //   30	640	8	nx	I
/*     */     //   40	630	9	ny	I
/*     */     //   50	620	10	nz	I
/*     */     //   88	582	12	nx	I
/*     */     //   98	572	13	ny	I
/*     */     //   108	562	14	nz	I
/*     */     //   282	388	22	sx	I
/*     */     //   292	378	23	sy	I
/*     */     //   316	354	25	sx	I
/*     */     //   323	347	26	sy	I
/*     */     //   371	299	27	canMergeAlongX	Z
/*     */     //   418	252	28	canMergeAlongY	Z
/*     */     //   475	142	29	newOrigin	Lli/cil/oc/common/tileentity/Screen;
/*     */     //   539	131	32	newWidth	I
/*     */     //   546	124	33	newHeight	I
/*     */     //   570	47	35	newWidth	I
/*     */     //   577	40	36	newHeight	I
/*     */     //   593	24	37	newScreens	Lscala/collection/mutable/Set; } public final class Screen$$anonfun$tryMergeTowards$1$1 extends AbstractFunction1<Screen, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Screen newOrigin$1; private final int newWidth$1; private final int newHeight$1; private final Set newScreens$1; public Screen$$anonfun$tryMergeTowards$1$1(Screen $outer, Screen newOrigin$1, int newWidth$1, int newHeight$1, Set newScreens$1) {} public final void apply(Screen screen) { screen.width_$eq(this.newWidth$1); screen.height_$eq(this.newHeight$1); screen.origin_$eq(this.newOrigin$1); screen.screens().$plus$plus$eq((TraversableOnce)this.newScreens$1); screen.cachedBounds_$eq((Option<AxisAlignedBB>)None$.MODULE$); } }
/* 400 */   private final int dot$2(ForgeDirection f, Screen s) { return f.offsetX * s.x() + f.offsetY * s.y() + f.offsetZ * s.z(); } private Tuple3<Object, Object, Object> project(Screen t) {
/* 401 */     return new Tuple3(BoxesRunTime.boxToInteger(dot$2(toGlobal(ForgeDirection.EAST), t)), BoxesRunTime.boxToInteger(dot$2(toGlobal(ForgeDirection.UP), t)), BoxesRunTime.boxToInteger(dot$2(toGlobal(ForgeDirection.SOUTH), t)));
/*     */   }
/*     */   
/*     */   private final int dot$1(ForgeDirection f, int x$25, int y$1, int z$1) {
/* 405 */     return f.offsetX * x$25 + f.offsetY * y$1 + f.offsetZ * z$1; } private Tuple3<Object, Object, Object> unproject(int x, int y, int z) {
/* 406 */     return new Tuple3(BoxesRunTime.boxToInteger(dot$1(toLocal(ForgeDirection.EAST), x, y, z)), BoxesRunTime.boxToInteger(dot$1(toLocal(ForgeDirection.UP), x, y, z)), BoxesRunTime.boxToInteger(dot$1(toLocal(ForgeDirection.SOUTH), x, y, z)));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Screen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */