/*     */ package li.cil.oc.common.component;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.internal.Keyboard;
/*     */ import li.cil.oc.api.internal.Rack;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.util.Lifecycle;
/*     */ import li.cil.oc.api.util.StateAware;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagString;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.ListBuffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tEh\001B\001\003\0015\021a\002V3s[&t\027\r\\*feZ,'O\003\002\004\t\005I1m\\7q_:,g\016\036\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001MA\001A\004\f\037C\021Js\006\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9B$D\001\031\025\tI\"$A\004oKR<xN]6\013\005m1\021aA1qS&\021Q\004\007\002\f\013:4\030N]8o[\026tG\017\005\002\030?%\021\001\005\007\002\020\013:4\030N]8o[\026tG\017S8tiB\021qCI\005\003Ga\021!\"\0218bYfT\030M\0317f!\t)s%D\001'\025\t\031!$\003\002)M\ti!+Y2l\033>,h\016^1cY\026\004\"AK\027\016\003-R!\001\f\016\002\tU$\030\016\\\005\003]-\022\021\002T5gK\016L8\r\\3\021\005A\032T\"A\031\013\005IR\022A\0023sSZ,'/\003\0025c\tQA)\032<jG\026LeNZ8\t\021Y\002!Q1A\005\002]\nAA]1dWV\t\001\b\005\002:y5\t!H\003\002<5\005A\021N\034;fe:\fG.\003\002>u\t!!+Y2l\021!y\004A!A!\002\023A\024!\002:bG.\004\003\002C!\001\005\013\007I\021\001\"\002\tMdw\016^\013\002\007B\021AiR\007\002\013*\ta)A\003tG\006d\027-\003\002I\013\n\031\021J\034;\t\021)\003!\021!Q\001\n\r\013Qa\0357pi\002BQ\001\024\001\005\0025\013a\001P5oSRtDc\001(Q#B\021q\nA\007\002\005!)ag\023a\001q!)\021i\023a\001\007\"91\013\001b\001\n\003!\026\001\0028pI\026,\022!\026\t\003/YK!a\026\r\003\t9{G-\032\005\0073\002\001\013\021B+\002\0139|G-\032\021\t\021m\003\001R1A\005\002q\013aAY;gM\026\024X#A/\021\005er\026BA0;\005)!V\r\037;Ck\0324WM\035\005\tC\002A\t\021)Q\005;\0069!-\0364gKJ\004\003\002C2\001\021\013\007I\021\0013\002\021-,\027PY8be\022,\022!\032\t\003s\031L!a\032\036\003\021-+\027PY8be\022D\001\"\033\001\t\002\003\006K!Z\001\nW\026L(m\\1sI\002Bqa\033\001A\002\023\005A.A\003sC:<W-F\001n!\t!e.\003\002p\013\n1Ai\\;cY\026Dq!\035\001A\002\023\005!/A\005sC:<Wm\030\023fcR\0211O\036\t\003\tRL!!^#\003\tUs\027\016\036\005\boB\f\t\0211\001n\003\rAH%\r\005\007s\002\001\013\025B7\002\rI\fgnZ3!\021\035Y\bA1A\005\002q\fAa[3zgV\tQ\020E\003\003\017\tY!D\001\000\025\021\t\t!a\001\002\0175,H/\0312mK*\031\021QA#\002\025\r|G\016\\3di&|g.C\002\002\n}\024!\002T5ti\n+hMZ3s!\021\ti!a\005\017\007\021\013y!C\002\002\022\025\013a\001\025:fI\0264\027\002BA\013\003/\021aa\025;sS:<'bAA\t\013\"9\0211\004\001!\002\023i\030!B6fsN\004\003bBA\020\001\021\005\021\021E\001\013Q\006\034\030\t\0323sKN\034XCAA\022!\r!\025QE\005\004\003O)%a\002\"p_2,\027M\034\005\b\003W\001A\021AA\027\003\035\tG\r\032:fgN,\"!a\003\t\017\005E\002\001\"\001\0024\005I1/\0333fI.+\027p]\013\003\003k\001b!a\016\002:\005-QBAA\002\023\021\tY$a\001\003\007M+\027\017\003\006\002@\001A)\031!C\007\003\003\n!\002Z3wS\016,\027J\0344p+\t\t\031\005\005\005\002F\005-\023qJA(\033\t\t9E\003\003\002J\005\r\021!C5n[V$\030M\0317f\023\021\ti%a\022\003\0075\013\007\017E\002\020\003#J1!!\006\021\021)\t)\006\001E\001B\0036\0211I\001\fI\0264\030nY3J]\032|\007\005C\004\002Z\001!\t%a\027\002\033\035,G\017R3wS\016,\027J\0344p)\t\ti\006\005\005\002`\005\r\0241BA\006\033\t\t\tG\003\002-%%!\021QJA1\021\035\t9\007\001C!\003S\n\021b\0348D_:tWm\031;\025\007M\fY\007\003\004T\003K\002\r!\026\005\b\003_\002A\021IA9\0031yg\016R5tG>tg.Z2u)\r\031\0301\017\005\007'\0065\004\031A+\t\017\005]\004\001\"\021\002z\005IqN\\'fgN\fw-\032\013\004g\006m\004\002CA?\003k\002\r!a \002\0175,7o]1hKB\031q#!!\n\007\005\r\005DA\004NKN\034\030mZ3\t\017\005\035\005\001\"\021\002\n\006)qo\034:mIR\021\0211\022\t\005\003\033\013I*\004\002\002\020*!\021qQAI\025\021\t\031*!&\002\0235Lg.Z2sC\032$(BAAL\003\rqW\r^\005\005\0037\013yIA\003X_JdG\rC\004\002 \002!\t%!)\002\023a\004vn]5uS>tG#A7\t\017\005\025\006\001\"\021\002\"\006I\021\020U8tSRLwN\034\005\b\003S\003A\021IAQ\003%Q\bk\\:ji&|g\016C\004\002.\002!\t%a,\002\0275\f'o[\"iC:<W\r\032\013\002g\"9\0211\027\001\005B\005U\026aB4fi\022\013G/\031\013\003\003o\003B!!/\002@6\021\0211\030\006\005\003{\013\t*A\002oERLA!!1\002<\nqaJ\021+UC\036\034u.\0349pk:$\007bBAc\001\021\005\023qY\001\024O\026$8i\0348oK\016$\030M\0317f\007>,h\016\036\013\002\007\"9\0211\032\001\005B\0055\027\001E4fi\016{gN\\3di\006\024G.Z!u)\021\ty-!6\021\007\025\n\t.C\002\002T\032\022!CU1dW\n+8oQ8o]\026\034G/\0312mK\"9\021q[Ae\001\004\031\025!B5oI\026D\bbBAn\001\021\005\023Q\\\001\013_:\f5\r^5wCR,G\003CA\022\003?\f\t0a?\t\021\005\005\030\021\034a\001\003G\fa\001\0357bs\026\024\b\003BAs\003[l!!a:\013\t\005\005\030\021\036\006\005\003W\f\t*\001\004f]RLG/_\005\005\003_\f9O\001\007F]RLG/\037)mCf,'\017\003\005\002t\006e\007\031AA{\003\021A\027\016\036-\021\007\021\01390C\002\002z\026\023QA\0227pCRD\001\"!@\002Z\002\007\021Q_\001\005Q&$\030\fC\004\003\002\001!\tEa\001\002\t1|\027\r\032\013\004g\n\025\001\002CA_\003\004\r!a.\t\017\t%\001\001\"\021\003\f\005!1/\031<f)\r\031(Q\002\005\t\003{\0239\0011\001\0028\"9!\021\003\001\005B\tM\021!C2b]V\003H-\031;f)\t\t\031\003C\004\003\030\001!\t%a,\002\rU\004H-\031;f\021\035\021Y\002\001C!\005;\tqbZ3u\007V\024(/\0328u'R\fG/\032\013\003\005?\001b!a\030\003\"\t\025\022\002\002B\022\003C\022q!\0228v[N+G\017\005\003\003(\t\035c\002\002B\025\005\007rAAa\013\003B9!!Q\006B \035\021\021yC!\020\017\t\tE\"1\b\b\005\005g\021I$\004\002\0036)\031!q\007\007\002\rq\022xn\034;?\023\005Y\021BA\005\013\023\t9\001\"\003\002\034\r%\021AFG\005\004\005\013Z\023AC*uCR,\027i^1sK&!!\021\nB&\005\025\031F/\031;f\025\r\021)e\013\005\b\005\037\002A\021\tB)\003%yg.\0218bYfTX\r\006\007\003T\te#1\fB0\005C\022\031\007\005\003E\005+*\026b\001B,\013\n)\021I\035:bs\"A\021\021\035B'\001\004\t\031\017C\004\003^\t5\003\031A\"\002\tMLG-\032\005\t\003g\024i\0051\001\002v\"A\021Q B'\001\004\t)\020\003\005\003f\t5\003\031AA{\003\021A\027\016\036.\t\017\t%\004\001\"\021\003l\0051rN\034'jM\026\034\027p\0317f'R\fG/Z\"iC:<W\rF\002t\005[B\001Ba\034\003h\001\007!\021O\001\006gR\fG/\032\t\005\005g\022IHD\002+\005kJ1Aa\036,\003%a\025NZ3ds\016dW-\003\003\003|\tu$A\004'jM\026\034\027p\0317f'R\fG/\032\006\004\005oZsa\002BA\005!\005!1Q\001\017)\026\024X.\0338bYN+'O^3s!\ry%Q\021\004\007\003\tA\tAa\"\024\t\t\025%\021\022\t\004\t\n-\025b\001BG\013\n1\021I\\=SK\032Dq\001\024BC\t\003\021\t\n\006\002\003\004\"Q!Q\023BC\005\004%\tAa&\002\r1|\027\rZ3e+\t\021I\n\005\003\003\034\nuUB\001BC\r\035\021yJ!\"\001\005C\0231\003V3s[&t\027\r\\*feZ,'oQ1dQ\026\034BA!(\003\n\"9AJ!(\005\002\t\025FC\001BM\021)\021IK!(C\002\023%!1V\001\006e\026\fG-_\013\003\005[\003bA BX\003\027q\025bAA'\"I!1\027BOA\003%!QV\001\007e\026\fG-\037\021\t\025\t]&Q\024b\001\n\023\021I,A\004qK:$\027N\\4\026\005\tm\006\003\002@\003>:K1Aa0\000\005\031\021UO\0324fe\"I!1\031BOA\003%!1X\001\ta\026tG-\0338hA!A!q\031BO\t\023\ty+A\bd_6\004H.\032;f!\026tG-\0338h\021!\021YM!(\005\002\t5\027aA1eIR!\0211\005Bh\021\035\021\tN!3A\0029\013\001\002^3s[&t\027\r\034\005\t\005+\024i\n\"\001\003X\0061!/Z7pm\026$B!a\t\003Z\"9!\021\033Bj\001\004q\005\002\003Bo\005;#\t!a,\002\013\rdW-\031:\t\021\t\005(Q\024C\001\005G\fAAZ5oIR!!Q\035Bv!\021!%q\035(\n\007\t%XI\001\004PaRLwN\034\005\t\003W\021y\0161\001\002\f!I!q\036BCA\003%!\021T\001\bY>\fG-\0323!\001")
/*     */ public class TerminalServer implements EnvironmentHost, Analyzable, RackMountable, Lifecycle, DeviceInfo {
/*     */   private final Rack rack;
/*     */   
/*  37 */   public Rack rack() { return this.rack; } private final int slot; public int slot() { return this.slot; }
/*  38 */    private final Node node = Network.newNode((Environment)this, Visibility.None).create(); private TextBuffer buffer; private Keyboard keyboard; public Node node() { return this.node; }
/*     */   
/*  40 */   private TextBuffer buffer$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) {
/*  41 */         ItemStack screenItem = Items.get("screen1").createItemStack(1);
/*  42 */         TextBuffer buffer = (TextBuffer)Driver.driverFor(screenItem, getClass()).createEnvironment(screenItem, this);
/*  43 */         Tuple2 tuple2 = Settings$.MODULE$.screenResolutionsByTier()[2]; if (tuple2 != null) { int maxWidth = tuple2._1$mcI$sp(), maxHeight = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(maxWidth, maxHeight), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*  44 */           buffer.setMaximumResolution(i, j);
/*  45 */           buffer.setMaximumColorDepth(Settings$.MODULE$.screenDepthsByTier()[2]);
/*  46 */           this.buffer = buffer; this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); } else { throw new MatchError(tuple2); } 
/*     */       }  return this.buffer; }
/*     */      } public TextBuffer buffer() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? buffer$lzycompute() : this.buffer; }
/*  49 */   private Keyboard keyboard$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0)
/*  50 */       { ItemStack keyboardItem = Items.get("keyboard").createItemStack(1);
/*  51 */         Keyboard keyboard = (Keyboard)Driver.driverFor(keyboardItem, getClass()).createEnvironment(keyboardItem, this);
/*  52 */         keyboard.setUsableOverride(new TerminalServer$$anon$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  61 */         this.keyboard = keyboard; this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.keyboard; }  } public Keyboard keyboard() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? keyboard$lzycompute() : this.keyboard; } public final class TerminalServer$$anon$1 implements Keyboard.UsabilityChecker {
/*     */     public TerminalServer$$anon$1(TerminalServer $outer) {}
/*     */     public boolean isUsableByPlayer(Keyboard keyboard, EntityPlayer player) { ItemStack stack = player.func_70694_bm(); Option option = Delegator$.MODULE$.subItem(stack); if (option instanceof Some) { Some some = (Some)option; Delegate t = (Delegate)some.x(); if (t instanceof li.cil.oc.common.item.Terminal && stack.func_77942_o()) return this.$outer.sidedKeys().contains(stack.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("key").toString()));  }  return false; } }
/*  64 */   private double range = Settings$.MODULE$.get().maxWirelessRange()[1]; public double range() { return this.range; } public void range_$eq(double x$1) { this.range = x$1; }
/*  65 */    private final ListBuffer<String> keys = (ListBuffer<String>)ListBuffer$.MODULE$.empty(); private Map<String, String> deviceInfo; private volatile byte bitmap$0; public ListBuffer<String> keys() { return this.keys; }
/*     */   
/*     */   public boolean hasAddress() {
/*  68 */     if (rack() != null) {
/*  69 */       NBTTagCompound data = rack().getMountableData(slot());
/*  70 */       if (data != null) {
/*  71 */         return data.func_74764_b("terminalAddress");
/*     */       }
/*     */     } 
/*  74 */     return false;
/*     */   }
/*     */   public String address() {
/*  77 */     return rack().getMountableData(slot()).func_74779_i("terminalAddress");
/*     */   }
/*     */   
/*  80 */   public Seq<String> sidedKeys() { return (rack().world()).field_72995_K ? 
/*  81 */       (Seq<String>)ExtendedNBT$.MODULE$.extendNBTTagList(rack().getMountableData(slot()).func_150295_c("keys", 8)).map((Function1)new TerminalServer$$anonfun$sidedKeys$1(this)) : (Seq<String>)keys(); } public final class TerminalServer$$anonfun$sidedKeys$1 extends AbstractFunction1<NBTTagString, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(NBTTagString tag) { return tag.func_150285_a_(); }
/*     */ 
/*     */     
/*     */     public TerminalServer$$anonfun$sidedKeys$1(TerminalServer $outer) {} }
/*     */ 
/*     */   
/*  87 */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  88 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  89 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Terminal server");
/*  90 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  91 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "RemoteViewing EX"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*  94 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 100 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 101 */       { node.connect(buffer().node());
/* 102 */         node.connect(keyboard().node());
/* 103 */         buffer().node().connect(keyboard().node()); return; }  return; }  node.connect(buffer().node()); node.connect(keyboard().node()); buffer().node().connect(keyboard().node());
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {
/* 108 */     Node node1 = node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 109 */       { buffer().node().remove();
/* 110 */         keyboard().node().remove(); return; }  return; }  buffer().node().remove(); keyboard().node().remove();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public World world() {
/* 120 */     return rack().world();
/*     */   } public double xPosition() {
/* 122 */     return rack().xPosition();
/*     */   } public double yPosition() {
/* 124 */     return rack().yPosition();
/*     */   } public double zPosition() {
/* 126 */     return rack().zPosition();
/*     */   } public void markChanged() {
/* 128 */     rack().markChanged();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTTagCompound getData() {
/* 134 */     if (node().address() == null) Network.joinNewNetwork(node());
/*     */     
/* 136 */     NBTTagCompound nbt = new NBTTagCompound();
/* 137 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("keys", ExtendedNBT$.MODULE$.stringIterableToNbt((Iterable)keys()));
/* 138 */     nbt.func_74778_a("terminalAddress", node().address());
/* 139 */     return nbt;
/*     */   }
/*     */   public int getConnectableCount() {
/* 142 */     return 0;
/*     */   } public RackBusConnectable getConnectableAt(int index) {
/* 144 */     return null;
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
/*     */   public boolean onActivate(EntityPlayer player, float hitX, float hitY) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   4: astore #4
/*     */     //   6: aload #4
/*     */     //   8: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   11: ldc_w 'terminal'
/*     */     //   14: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   17: astore #5
/*     */     //   19: dup
/*     */     //   20: ifnonnull -> 32
/*     */     //   23: pop
/*     */     //   24: aload #5
/*     */     //   26: ifnull -> 40
/*     */     //   29: goto -> 271
/*     */     //   32: aload #5
/*     */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   37: ifeq -> 271
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   44: getfield field_72995_K : Z
/*     */     //   47: ifne -> 267
/*     */     //   50: invokestatic randomUUID : ()Ljava/util/UUID;
/*     */     //   53: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   56: astore #6
/*     */     //   58: aload #4
/*     */     //   60: invokevirtual func_77942_o : ()Z
/*     */     //   63: ifeq -> 109
/*     */     //   66: aload_0
/*     */     //   67: invokevirtual keys : ()Lscala/collection/mutable/ListBuffer;
/*     */     //   70: aload #4
/*     */     //   72: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   75: new scala/collection/mutable/StringBuilder
/*     */     //   78: dup
/*     */     //   79: invokespecial <init> : ()V
/*     */     //   82: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   85: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   88: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   91: ldc_w 'key'
/*     */     //   94: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   97: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   100: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   103: invokevirtual $minus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/ListBuffer;
/*     */     //   106: goto -> 124
/*     */     //   109: aload #4
/*     */     //   111: new net/minecraft/nbt/NBTTagCompound
/*     */     //   114: dup
/*     */     //   115: invokespecial <init> : ()V
/*     */     //   118: invokevirtual func_77982_d : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   121: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   124: pop
/*     */     //   125: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   128: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   131: invokevirtual terminalsPerServer : ()I
/*     */     //   134: istore #7
/*     */     //   136: aload_0
/*     */     //   137: invokevirtual keys : ()Lscala/collection/mutable/ListBuffer;
/*     */     //   140: invokevirtual length : ()I
/*     */     //   143: iload #7
/*     */     //   145: if_icmplt -> 160
/*     */     //   148: aload_0
/*     */     //   149: invokevirtual keys : ()Lscala/collection/mutable/ListBuffer;
/*     */     //   152: iconst_0
/*     */     //   153: invokevirtual remove : (I)Ljava/lang/Object;
/*     */     //   156: pop
/*     */     //   157: goto -> 136
/*     */     //   160: aload_0
/*     */     //   161: invokevirtual keys : ()Lscala/collection/mutable/ListBuffer;
/*     */     //   164: aload #6
/*     */     //   166: invokevirtual $plus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/ListBuffer;
/*     */     //   169: pop
/*     */     //   170: aload #4
/*     */     //   172: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   175: new scala/collection/mutable/StringBuilder
/*     */     //   178: dup
/*     */     //   179: invokespecial <init> : ()V
/*     */     //   182: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   185: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   188: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   191: ldc_w 'key'
/*     */     //   194: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   197: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   200: aload #6
/*     */     //   202: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   205: aload #4
/*     */     //   207: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   210: new scala/collection/mutable/StringBuilder
/*     */     //   213: dup
/*     */     //   214: invokespecial <init> : ()V
/*     */     //   217: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   220: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   223: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   226: ldc_w 'server'
/*     */     //   229: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   232: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   235: aload_0
/*     */     //   236: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   239: invokeinterface address : ()Ljava/lang/String;
/*     */     //   244: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   247: aload_0
/*     */     //   248: invokevirtual rack : ()Lli/cil/oc/api/internal/Rack;
/*     */     //   251: aload_0
/*     */     //   252: invokevirtual slot : ()I
/*     */     //   255: invokeinterface markChanged : (I)V
/*     */     //   260: aload_1
/*     */     //   261: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   264: invokevirtual func_70296_d : ()V
/*     */     //   267: iconst_1
/*     */     //   268: goto -> 272
/*     */     //   271: iconst_0
/*     */     //   272: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 0
/*     */     //   #148	-> 6
/*     */     //   #149	-> 40
/*     */     //   #150	-> 50
/*     */     //   #151	-> 58
/*     */     //   #155	-> 66
/*     */     //   #152	-> 109
/*     */     //   #151	-> 124
/*     */     //   #157	-> 125
/*     */     //   #158	-> 136
/*     */     //   #159	-> 148
/*     */     //   #161	-> 160
/*     */     //   #162	-> 170
/*     */     //   #163	-> 205
/*     */     //   #164	-> 247
/*     */     //   #165	-> 260
/*     */     //   #167	-> 267
/*     */     //   #169	-> 271
/*     */     //   #146	-> 272
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	273	0	this	Lli/cil/oc/common/component/TerminalServer;
/*     */     //   0	273	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	273	2	hitX	F
/*     */     //   0	273	3	hitY	F
/*     */     //   6	267	4	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   58	209	6	key	Ljava/lang/String;
/*     */     //   136	131	7	maxSize	I
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
/*     */   public void load(NBTTagCompound nbt)
/*     */   {
/* 176 */     if (!(rack().world()).field_72995_K) {
/* 177 */       node().load(nbt);
/*     */     }
/* 179 */     buffer().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("buffer").toString()));
/* 180 */     keyboard().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keyboard").toString()));
/* 181 */     keys().clear();
/* 182 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keys").toString(), 8)).foreach((Function1)new TerminalServer$$anonfun$load$1(this)); } public final class TerminalServer$$anonfun$load$1 extends AbstractFunction1<NBTTagString, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagString tag) { this.$outer.keys().$plus$eq(tag.func_150285_a_()); }
/*     */     
/*     */     public TerminalServer$$anonfun$load$1(TerminalServer $outer) {} }
/*     */   
/* 186 */   public void save(NBTTagCompound nbt) { node().save(nbt);
/* 187 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("buffer").toString(), (Function1)new TerminalServer$$anonfun$save$1(this));
/* 188 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keyboard").toString(), (Function1)new TerminalServer$$anonfun$save$2(this));
/* 189 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("keys").toString(), ExtendedNBT$.MODULE$.stringIterableToNbt((Iterable)keys())); } public final class TerminalServer$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) { this.$outer.buffer().save(x$1); } public TerminalServer$$anonfun$save$1(TerminalServer $outer) {} } public final class TerminalServer$$anonfun$save$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) {
/*     */       this.$outer.keyboard().save(x$1);
/*     */     } public TerminalServer$$anonfun$save$2(TerminalServer $outer) {} }
/*     */   public boolean canUpdate() {
/* 195 */     return true;
/*     */   }
/*     */   public void update() {
/* 198 */     if ((world()).field_72995_K || (node().address() != null && node().network() != null)) {
/* 199 */       buffer().update();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState() {
/* 207 */     return EnumSet.noneOf(StateAware.State.class);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Node[] onAnalyze(EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 213 */     (new Node[2])[0] = buffer().node(); (new Node[2])[1] = keyboard().node(); return new Node[2];
/*     */   }
/*     */ 
/*     */   
/*     */   public void onLifecycleStateChange(Lifecycle.LifecycleState state) {
/* 218 */     if ((rack().world()).field_72995_K) { Lifecycle.LifecycleState lifecycleState = state;
/* 219 */       if (Lifecycle.LifecycleState.Initialized.equals(lifecycleState))
/* 220 */       { TerminalServer$.MODULE$.loaded().add(this); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 221 */       else if (Lifecycle.LifecycleState.Disposed.equals(lifecycleState))
/* 222 */       { TerminalServer$.MODULE$.loaded().remove(this); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 223 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public static TerminalServerCache loaded() {
/*     */     return TerminalServer$.MODULE$.loaded();
/*     */   }
/*     */ 
/*     */   
/*     */   public TerminalServer(Rack rack, int slot) {}
/*     */   
/*     */   public static class TerminalServerCache
/*     */   {
/* 238 */     private final Map<String, TerminalServer> li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready = (Map<String, TerminalServer>)new HashMap(); public Map<String, TerminalServer> li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready() { return this.li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready; }
/* 239 */      private final Buffer<TerminalServer> li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending = (Buffer<TerminalServer>)Buffer$.MODULE$.empty(); public Buffer<TerminalServer> li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending() { return this.li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending; }
/*     */ 
/*     */     
/* 242 */     private void completePending() { Buffer promoted = (Buffer)Buffer$.MODULE$.empty();
/* 243 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().foreach((Function1)new TerminalServer$TerminalServerCache$$anonfun$completePending$1(this, promoted));
/*     */ 
/*     */       
/* 246 */       promoted.foreach((Function1)new TerminalServer$TerminalServerCache$$anonfun$completePending$2(this)); } public final class TerminalServer$TerminalServerCache$$anonfun$completePending$1 extends AbstractFunction1<TerminalServer, Object> implements Serializable {
/* 247 */       public static final long serialVersionUID = 0L; private final Buffer promoted$1; public final Object apply(TerminalServer term) { return term.hasAddress() ? this.promoted$1.$plus$eq(term) : BoxedUnit.UNIT; } public TerminalServer$TerminalServerCache$$anonfun$completePending$1(TerminalServer.TerminalServerCache $outer, Buffer promoted$1) {} } public final class TerminalServer$TerminalServerCache$$anonfun$completePending$2 extends AbstractFunction1<TerminalServer, Object> implements Serializable { public static final long serialVersionUID = 0L; public TerminalServer$TerminalServerCache$$anonfun$completePending$2(TerminalServer.TerminalServerCache $outer) {} public final Object apply(TerminalServer term) { this.$outer.li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().$minus$eq(term);
/* 248 */         String address = term.address();
/* 249 */         return this.$outer.li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().contains(address) ? BoxedUnit.UNIT : 
/* 250 */           this.$outer.li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().put(address, term); }
/*     */        }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean add(TerminalServer terminal) {
/* 256 */       completePending();
/*     */       
/* 258 */       String newAddress = terminal.address();
/*     */ 
/*     */ 
/*     */       
/* 262 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().put(newAddress, terminal);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 267 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().$plus$eq(terminal);
/*     */       return terminal.hasAddress() ? (!li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().contains(newAddress)) : true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(TerminalServer terminal) {
/* 273 */       completePending();
/*     */ 
/*     */ 
/*     */       
/* 277 */       int before = li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().size();
/* 278 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().$minus$eq(terminal);
/* 279 */       return terminal.hasAddress() ? li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().remove(terminal.address()).isDefined() : ((li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().size() > before));
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 284 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready().clear();
/* 285 */       li$cil$oc$common$component$TerminalServer$TerminalServerCache$$pending().clear();
/*     */     }
/*     */     public Option<TerminalServer> find(String address) {
/*     */       None$ none$;
/* 289 */       completePending();
/* 290 */       TerminalServer terminalServer = (TerminalServer)WrapAsJava$.MODULE$.mutableMapAsJavaMap(li$cil$oc$common$component$TerminalServer$TerminalServerCache$$ready()).getOrDefault(address, null);
/* 291 */       if (terminalServer != null) { TerminalServer terminalServer1 = terminalServer; Option option = Option$.MODULE$.apply(terminalServer1); }
/* 292 */       else { none$ = None$.MODULE$; }
/*     */       
/*     */       return (Option<TerminalServer>)none$;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\TerminalServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */