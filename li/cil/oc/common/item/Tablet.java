/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.RemovalListener;
/*     */ import com.google.common.cache.RemovalNotification;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.TickEvent;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.Callable;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import li.cil.oc.api.driver.item.Chargeable;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.item.data.TabletData;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.EnumRarity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.event.world.WorldEvent;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple5;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\035g\001B\001\003\0015\021a\001V1cY\026$(BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0255A\021qBE\007\002!)\t\021#A\003tG\006d\027-\003\002\024!\t1\021I\\=SK\032\004\"!\006\r\016\003YQ!a\006\002\002\rQ\024\030-\033;t\023\tIbC\001\005EK2,w-\031;f!\tY\022%D\001\035\025\t\031QD\003\002\037?\0051AM]5wKJT!\001\t\004\002\007\005\004\030.\003\002#9\tQ1\t[1sO\026\f'\r\\3\t\021\021\002!Q1A\005\002\025\na\001]1sK:$X#\001\024\021\005\035BS\"\001\002\n\005%\022!!\003#fY\026<\027\r^8s\021!Y\003A!A!\002\0231\023a\0029be\026tG\017\t\005\006[\001!\tAL\001\007y%t\027\016\036 \025\005=\002\004CA\024\001\021\025!C\0061\001'\021\035\021\004A1A\005\006M\nQ\002V5nKR{\027I\\1msj,W#\001\033\020\003Uj\022A\003\005\007o\001\001\013Q\002\033\002\035QKW.\032+p\003:\fG.\037>fA!)\021\b\001C!u\005aQ.\031=Ti\006\0347nU5{KV\t1\b\005\002\020y%\021Q\b\005\002\004\023:$\bbB \001\001\004%I\001Q\001\007S\016|gn\0248\026\003\005\0032a\004\"E\023\t\031\005C\001\004PaRLwN\034\t\003\013\032k\021\001A\005\003\017b\021A!S2p]\"9\021\n\001a\001\n\023Q\025AC5d_:|en\030\023fcR\0211J\024\t\003\0371K!!\024\t\003\tUs\027\016\036\005\b\037\"\013\t\0211\001B\003\rAH%\r\005\007#\002\001\013\025B!\002\017%\034wN\\(oA!91\013\001a\001\n\023\001\025aB5d_:|eM\032\005\b+\002\001\r\021\"\003W\003-I7m\0348PM\032|F%Z9\025\005-;\006bB(U\003\003\005\r!\021\005\0073\002\001\013\025B!\002\021%\034wN\\(gM\002BQa\027\001\005Bq\013A![2p]R\031\021)\0305\t\013yS\006\031A0\002\013M$\030mY6\021\005\0014W\"A1\013\005\r\021'BA2e\003%i\027N\\3de\0064GOC\001f\003\rqW\r^\005\003O\006\024\021\"\023;f[N#\030mY6\t\013%T\006\031A\036\002\tA\f7o\035\025\0055.<\b\020\005\002mk6\tQN\003\002o_\006Q!/\0327bk:\034\007.\032:\013\005A\f\030a\0014nY*\021!o]\001\005[>$7OC\001u\003\r\031\007o^\005\003m6\024\001bU5eK>sG._\001\006m\006dW/\032\023\002s&\021!p_\001\007\0072KUI\024+\013\005ql\027\001B*jI\026DQA \001\005B}\fQB]3hSN$XM]%d_:\034HcA&\002\002!9\0211A?A\002\005\025\021\001D5d_:\024VmZ5ti\026\024\bcA#\002\b%\031\021\021\002\r\003\031%\033wN\034*fO&\034H/\032:\t\017\0055\001\001\"\025\002\020\005yAo\\8mi&\004X\t\037;f]\022,G\rF\003L\003#\t\031\002\003\004_\003\027\001\ra\030\005\t\003+\tY\0011\001\002\030\0059Ao\\8mi&\004\bCBA\r\003G\t9#\004\002\002\034)!\021QDA\020\003\021)H/\0337\013\005\005\005\022\001\0026bm\006LA!!\n\002\034\t!A*[:u!\021\tI#a\f\017\007=\tY#C\002\002.A\ta\001\025:fI\0264\027\002BA\031\003g\021aa\025;sS:<'bAA\027!!9\021q\007\001\005B\005e\022A\002:be&$\030\020\006\003\002<\005\005\003c\0011\002>%\031\021qH1\003\025\025sW/\034*be&$\030\020\003\004_\003k\001\ra\030\005\b\003\013\002A\021IA$\0031I7\017R1nC\036,\027M\0317f+\t\tI\005E\002\020\003\027J1!!\024\021\005\035\021un\0347fC:Dq!!\025\001\t\003\n\031&\001\004eC6\fw-\032\013\004w\005U\003B\0020\002P\001\007q\fC\004\002Z\001!\t%a\027\002\0235\f\007\020R1nC\036,GcA\036\002^!1a,a\026A\002}Cq!!\031\001\t\003\t\031'A\005dC:\034\005.\031:hKR!\021\021JA3\021\031q\026q\fa\001?\"9\021\021\016\001\005\002\005-\024AB2iCJ<W\r\006\005\002n\005M\024QOA=!\ry\021qN\005\004\003c\002\"A\002#pk\ndW\r\003\004_\003O\002\ra\030\005\t\003o\n9\0071\001\002n\0051\021-\\8v]RD\001\"a\037\002h\001\007\021\021J\001\tg&lW\017\\1uK\"9\021q\020\001\005B\005\005\025AB;qI\006$X\rF\006L\003\007\013))a%\002\"\006\025\006B\0020\002~\001\007q\f\003\005\002\b\006u\004\031AAE\003\0259xN\0357e!\021\tY)a$\016\005\0055%bAADE&!\021\021SAG\005\0259vN\0357e\021!\t)*! A\002\005]\025AB3oi&$\030\020\005\003\002\032\006uUBAAN\025\r\t)JY\005\005\003?\013YJ\001\004F]RLG/\037\005\b\003G\013i\b1\001<\003\021\031Hn\034;\t\021\005\035\026Q\020a\001\003\023\n\001b]3mK\016$X\r\032\005\b\003W\003A\021IAW\0039yg.\023;f[V\033XMR5sgR$\002#!\023\0020\006E\026qXAg\003#\fY.a8\t\ry\013I\0131\001`\021!\t\031,!+A\002\005U\026A\0029mCf,'\017\005\003\0028\006mVBAA]\025\021\t\031,a'\n\t\005u\026\021\030\002\r\013:$\030\016^=QY\006LXM\035\005\t\003\003\fI\0131\001\002D\006A\001o\\:ji&|g\016\005\003\002F\006%WBAAd\025\r\tiBB\005\005\003\027\f9MA\007CY>\0347\016U8tSRLwN\034\005\b\003\037\fI\0131\001<\003\021\031\030\016Z3\t\021\005M\027\021\026a\001\003+\fA\001[5u1B\031q\"a6\n\007\005e\007CA\003GY>\fG\017\003\005\002^\006%\006\031AAk\003\021A\027\016^-\t\021\005\005\030\021\026a\001\003+\fA\001[5u5\"9\021Q\035\001\005B\005\035\030!C8o\023R,W.V:f)A\tI%!;\002l\0065\030q^Ay\003g\f)\020\003\004_\003G\004\ra\030\005\t\003g\013\031\0171\001\0026\"A\021\021YAr\001\004\t\031\rC\004\002P\006\r\b\031A\036\t\021\005M\0271\035a\001\003+D\001\"!8\002d\002\007\021Q\033\005\t\003C\f\031\0171\001\002V\"9\021\021 \001\005B\005m\030\001E8o\023R,WNU5hQR\034E.[2l)\035y\026Q`A\000\005\003AaAXA|\001\004y\006\002CAD\003o\004\r!!#\t\021\005M\026q\037a\001\003kCqA!\002\001\t\003\0229!A\013hKRl\025\r_%uK6,6/\032#ve\006$\030n\0348\025\007m\022I\001\003\004_\005\007\001\ra\030\005\b\005\033\001A\021\tB\b\003Qyg\016\0257bs\026\0248\013^8qa\026$Wk]5oOR91J!\005\003\024\tU\001B\0020\003\f\001\007q\f\003\005\0024\n-\001\031AA[\021\035\0219Ba\003A\002m\n\001\002Z;sCRLwN\\\004\b\0057\021\001\022\001B\017\003\031!\026M\0317fiB\031qEa\b\007\r\005\021\001\022\001B\021'\r\021yB\004\005\b[\t}A\021\001B\023)\t\021i\002\003\006\003*\t}\001\031!C\001\005W\t!cY;se\026tG\017\\=B]\006d\027P_5oOV\021!Q\006\t\005\037\t\023y\003\005\007\020\005c\t\031mOAk\003+\f).C\002\0034A\021a\001V;qY\026,\004B\003B\034\005?\001\r\021\"\001\003:\00512-\036:sK:$H._!oC2L(0\0338h?\022*\027\017F\002L\005wA\021b\024B\033\003\003\005\rA!\f\t\023\t}\"q\004Q!\n\t5\022aE2veJ,g\016\0367z\003:\fG.\037>j]\036\004\003\002\003B\"\005?!\tA!\022\002\013\035,G/\0233\025\t\t\035#\021\013\t\005\005\023\022y%\004\002\003L)!!QJA\020\003\021a\027M\\4\n\t\005E\"1\n\005\007=\n\005\003\031A0\t\021\tU#q\004C\001\005/\n1aZ3u)\031\021IFa\030\003bA\031qEa\027\n\007\tu#AA\007UC\ndW\r^,sCB\004XM\035\005\007=\nM\003\031A0\t\021\t\r$1\013a\001\003k\013a\001[8mI\026\024\b\002\003B4\005?!\tA!\033\002\027=twk\034:mIN\013g/\032\013\004\027\n-\004\002\003B7\005K\002\rAa\034\002\003\025\004BA!\035\003\004:!!1\017B@\033\t\021)H\003\003\002\b\n]$\002\002B=\005w\nQ!\032<f]RT1A! e\0039i\027N\\3de\0064GOZ8sO\026LAA!!\003v\005Qqk\034:mI\0263XM\034;\n\t\t\025%q\021\002\005'\0064XM\003\003\003\002\nU\004\006\002B3\005\027\003BA!$\003\0266\021!q\022\006\005\005#\023\031*\001\007fm\026tG\017[1oI2,'O\003\002\006_&!!q\023BH\0059\031VOY:de&\024W-\022<f]RD\001Ba'\003 \021\005!QT\001\016_:<vN\0357e+:dw.\0313\025\007-\023y\n\003\005\003n\te\005\031\001BQ!\021\021\tHa)\n\t\t\025&q\021\002\007+:dw.\0313)\t\te%1\022\005\t\005W\023y\002\"\001\003.\006aqN\\\"mS\026tG\017V5dWR\0311Ja,\t\021\t5$\021\026a\001\005c\003BAa-\003X:!!Q\027Bi\035\021\0219L!4\017\t\te&1\032\b\005\005w\023IM\004\003\003>\n\035g\002\002B`\005\013l!A!1\013\007\t\rG\"\001\004=e>|GOP\005\002i&\021!o]\005\003aFL!!B8\n\t\t='1S\001\nO\006lW-\032<f]RLAAa5\003V\006IA+[2l\013Z,g\016\036\006\005\005\037\024\031*\003\003\003Z\nm'aD\"mS\026tG\017V5dW\0263XM\034;\013\t\tM'Q\033\025\005\005S\023Y\t\003\005\003b\n}A\021\001Br\0031ygnU3sm\026\024H+[2l)\rY%Q\035\005\t\005[\022y\0161\001\003hB!!1\027Bu\023\021\021YOa7\003\037M+'O^3s)&\0347.\022<f]RDCAa8\003\f\032A!\021\037B\020\003\003\021\031PA\003DC\016DWm\005\005\003p\nU(1`B\004!\021\021IEa>\n\t\te(1\n\002\007\037\nTWm\031;\021\r\tu81\001B-\033\t\021yP\003\003\004\002\005m\021AC2p]\016,(O]3oi&!1Q\001B\000\005!\031\025\r\0347bE2,\007\003CB\005\0073\t9C!\027\016\005\r-!\002BB\007\007\037\tQaY1dQ\026T1!BB\t\025\021\031\031b!\006\002\r\035|wn\0327f\025\t\0319\"A\002d_6LAaa\007\004\f\ty!+Z7pm\006dG*[:uK:,'\017C\004.\005_$\taa\b\025\005\r\005\002\003BB\022\005_l!Aa\b\t\025\r5!q\036b\001\n\003\0319#\006\002\004*AA1\021BB\026\003O\021I&\003\003\003r\016-\001\"CB\030\005_\004\013\021BB\025\003\031\031\027m\0315fA!911\007Bx\t#Q\024a\002;j[\026|W\017\036\005\r\007o\021y\0171AA\002\023%1\021H\001\rGV\024(/\0328u'R\f7m[\013\002?\"a1Q\bBx\001\004\005\r\021\"\003\004@\005\0012-\036:sK:$8\013^1dW~#S-\035\013\004\027\016\005\003\002C(\004<\005\005\t\031A0\t\021\r\025#q\036Q!\n}\013QbY;se\026tGo\025;bG.\004\003\002DB%\005_\004\r\0211A\005\n\r-\023!D2veJ,g\016\036%pY\022,'/\006\002\0026\"a1q\nBx\001\004\005\r\021\"\003\004R\005\t2-\036:sK:$\bj\0347eKJ|F%Z9\025\007-\033\031\006C\005P\007\033\n\t\0211\001\0026\"I1q\013BxA\003&\021QW\001\017GV\024(/\0328u\021>dG-\032:!\021!\021)Fa<\005\002\rmCC\002B-\007;\032y\006\003\004_\0073\002\ra\030\005\t\005G\032I\0061\001\0026\"A11\rBx\t\003\031)'\001\003dC2dGC\001B-\021!\031IGa<\005\002\r-\024!C8o%\026lwN^1m)\rY5Q\016\005\t\005[\0329\0071\001\004pAA1\021BB9\003O\021I&\003\003\004t\r-!a\005*f[>4\030\r\034(pi&4\027nY1uS>t\007\002CB<\005_$\ta!\037\002\013\rdW-\031:\025\007-\033Y\b\003\005\002\b\016U\004\031AAE\021!\031yHa<\005\002\r\005\025aB2mK\006tW\013\035\013\002\027\"A1Q\021Bx\t\003\0319)A\005lK\026\004\030\t\\5wKR\0211\021\022\t\t\007\027\033\t*a\n\003Z5\0211Q\022\006\005\007\037\033y!A\004d_2dWm\031;\n\t\rM5Q\022\002\r\0236lW\017^1cY\026l\025\r]\004\t\007/\023y\002#\001\004\032\00611\t\\5f]R\004Baa\t\004\034\032A1Q\024B\020\021\003\031yJ\001\004DY&,g\016^\n\005\0077\033\t\003C\004.\0077#\taa)\025\005\re\005bBB\032\0077#\tF\017\005\t\005+\032Y\n\"\001\004*R!11VBW!\021y!I!\027\t\ry\0339\0131\001`\017!\031\tLa\b\t\002\rM\026AB*feZ,'\017\005\003\004$\rUf\001CB\\\005?A\ta!/\003\rM+'O^3s'\021\031)l!\t\t\0175\032)\f\"\001\004>R\02111\027\005\t\007\003\034)\f\"\001\004D\00691/\031<f\0032dGcA&\004F\"A\021qQB`\001\004\tI\t")
/*     */ public class Tablet implements Delegate, Chargeable {
/*     */   private final Delegator parent;
/*     */   private final int TimeToAnalyze;
/*     */   private Option<IIcon> iconOn;
/*     */   private Option<IIcon> iconOff;
/*     */   private boolean showInItemList;
/*     */   private final int itemId;
/*     */   private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon;
/*     */   
/*     */   public boolean showInItemList() {
/*  59 */     return this.showInItemList; } public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Tablet(Delegator parent) { Delegate.class.$init$(this);
/*     */ 
/*     */ 
/*     */     
/*  63 */     showInItemList_$eq(false);
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.iconOn = (Option<IIcon>)scala.None$.MODULE$;
/*  68 */     this.iconOff = (Option<IIcon>)scala.None$.MODULE$; } public final int TimeToAnalyze() { return 10; } public int maxStackSize() { return 1; } private Option<IIcon> iconOff() { return this.iconOff; } private Option<IIcon> iconOn() { return this.iconOn; } private void iconOn_$eq(Option<IIcon> x$1) { this.iconOn = x$1; } private void iconOff_$eq(Option<IIcon> x$1) { this.iconOff = x$1; }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public Option<IIcon> icon(ItemStack stack, int pass) {
/*  73 */     TabletData data = new TabletData(stack);
/*  74 */     return stack.func_77942_o() ? (data.isRunning() ? iconOn() : iconOff()) : 
/*  75 */       Delegate.class.icon(this, stack, pass);
/*     */   }
/*     */   
/*     */   public void registerIcons(IIconRegister iconRegister) {
/*  79 */     Delegate.class.registerIcons(this, iconRegister);
/*     */     
/*  81 */     iconOn_$eq(scala.Option$.MODULE$.apply(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":TabletOn").toString())));
/*  82 */     iconOff_$eq(scala.Option$.MODULE$.apply(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":TabletOff").toString())));
/*     */   }
/*     */ 
/*     */   
/*     */   public void tooltipExtended(ItemStack stack, List tooltip)
/*     */   {
/*  88 */     if (li.cil.oc.client.KeyBindings$.MODULE$.showExtendedTooltips())
/*  89 */     { TabletData info = new TabletData(stack);
/*     */       
/*  91 */       Option[] components = (Option[])scala.Predef$.MODULE$.refArrayOps((Object[])info.items()).drop(1);
/*  92 */       if (components.length > 1)
/*  93 */       { tooltip.addAll(li.cil.oc.util.Tooltip$.MODULE$.get("Server.Components", (Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[0])));
/*  94 */         scala.Predef$.MODULE$.refArrayOps((Object[])components).collect((PartialFunction)new Tablet$$anonfun$tooltipExtended$1(this, tooltip), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Boolean())); }  }  } public final class Tablet$$anonfun$tooltipExtended$1 extends AbstractPartialFunction<Option<ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1;
/*  95 */       if (option instanceof Some) { Some some = (Some)option; ItemStack component = (ItemStack)some.x(); object = BoxesRunTime.boxToBoolean(this.tooltip$1.add((new StringBuilder()).append("- ").append(component.func_82833_r()).toString())); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*     */       
/*     */       return bool; }
/*     */      public Tablet$$anonfun$tooltipExtended$1(Tablet $outer, List tooltip$1) {} }
/*     */   public EnumRarity rarity(ItemStack stack) {
/* 102 */     TabletData data = new TabletData(stack);
/* 103 */     return li.cil.oc.util.Rarity$.MODULE$.byTier(data.tier());
/*     */   }
/*     */   public boolean isDamageable() {
/* 106 */     return true;
/*     */   }
/*     */   public int damage(ItemStack stack) {
/* 109 */     NBTTagCompound nbt = stack.func_77978_p();
/*     */     
/* 111 */     TabletData data = new TabletData();
/* 112 */     data.load(nbt);
/*     */ 
/*     */     
/* 115 */     return (nbt == null) ? 100 : (int)(data.maxEnergy() - data.energy());
/*     */   }
/*     */   
/*     */   public int maxDamage(ItemStack stack) {
/* 119 */     NBTTagCompound nbt = stack.func_77978_p();
/*     */     
/* 121 */     TabletData data = new TabletData();
/* 122 */     data.load(nbt);
/*     */ 
/*     */     
/* 125 */     return (nbt == null) ? 100 : scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper((int)data.maxEnergy()), 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canCharge(ItemStack stack) {
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public double charge(ItemStack stack, double amount, boolean simulate) {
/* 135 */     TabletData data = new TabletData(stack);
/* 136 */     double charge = scala.math.package$.MODULE$.min(data.maxEnergy() - data.energy(), amount);
/* 137 */     if (!simulate) {
/* 138 */       data.energy_$eq(data.energy() + charge);
/* 139 */       data.save(stack);
/*     */     } 
/* 141 */     return (amount < false) ? amount : (amount - charge);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: astore #6
/*     */     //   3: aload #6
/*     */     //   5: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   8: ifeq -> 141
/*     */     //   11: aload #6
/*     */     //   13: checkcast net/minecraft/entity/player/EntityPlayer
/*     */     //   16: astore #7
/*     */     //   18: aload_2
/*     */     //   19: getfield field_72995_K : Z
/*     */     //   22: ifeq -> 114
/*     */     //   25: aload #7
/*     */     //   27: invokevirtual func_71057_bx : ()I
/*     */     //   30: bipush #10
/*     */     //   32: if_icmpne -> 114
/*     */     //   35: aload #7
/*     */     //   37: invokevirtual func_71011_bu : ()Lnet/minecraft/item/ItemStack;
/*     */     //   40: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   43: ldc_w 'tablet'
/*     */     //   46: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   49: astore #9
/*     */     //   51: dup
/*     */     //   52: ifnonnull -> 64
/*     */     //   55: pop
/*     */     //   56: aload #9
/*     */     //   58: ifnull -> 72
/*     */     //   61: goto -> 114
/*     */     //   64: aload #9
/*     */     //   66: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 114
/*     */     //   72: getstatic li/cil/oc/util/Audio$.MODULE$ : Lli/cil/oc/util/Audio$;
/*     */     //   75: aload #7
/*     */     //   77: getfield field_70165_t : D
/*     */     //   80: d2f
/*     */     //   81: aload #7
/*     */     //   83: getfield field_70163_u : D
/*     */     //   86: d2f
/*     */     //   87: iconst_2
/*     */     //   88: i2f
/*     */     //   89: fadd
/*     */     //   90: aload #7
/*     */     //   92: getfield field_70161_v : D
/*     */     //   95: d2f
/*     */     //   96: ldc_w '.'
/*     */     //   99: getstatic li/cil/oc/util/Audio$.MODULE$ : Lli/cil/oc/util/Audio$;
/*     */     //   102: invokevirtual play$default$5 : ()I
/*     */     //   105: getstatic li/cil/oc/util/Audio$.MODULE$ : Lli/cil/oc/util/Audio$;
/*     */     //   108: invokevirtual play$default$6 : ()I
/*     */     //   111: invokevirtual play : (FFFLjava/lang/String;II)V
/*     */     //   114: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */     //   117: aload_1
/*     */     //   118: aload #7
/*     */     //   120: invokevirtual get : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/item/TabletWrapper;
/*     */     //   123: aload_2
/*     */     //   124: aload #7
/*     */     //   126: iload #4
/*     */     //   128: iload #5
/*     */     //   130: invokevirtual update : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;IZ)V
/*     */     //   133: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   136: astore #8
/*     */     //   138: goto -> 146
/*     */     //   141: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   144: astore #8
/*     */     //   146: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 0
/*     */     //   #149	-> 3
/*     */     //   #151	-> 18
/*     */     //   #152	-> 72
/*     */     //   #154	-> 114
/*     */     //   #149	-> 136
/*     */     //   #155	-> 141
/*     */     //   #148	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	147	0	this	Lli/cil/oc/common/item/Tablet;
/*     */     //   0	147	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	147	2	world	Lnet/minecraft/world/World;
/*     */     //   0	147	3	entity	Lnet/minecraft/entity/Entity;
/*     */     //   0	147	4	slot	I
/*     */     //   0	147	5	selected	Z
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/* 159 */     Tablet$.MODULE$.currentlyAnalyzing_$eq((Option<Tuple5<BlockPosition, Object, Object, Object, Object>>)new Some(new Tuple5(position, BoxesRunTime.boxToInteger(side), BoxesRunTime.boxToFloat(hitX), BoxesRunTime.boxToFloat(hitY), BoxesRunTime.boxToFloat(hitZ))));
/* 160 */     return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ);
/*     */   }
/*     */   
/*     */   public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/* 164 */     player.func_71008_a(stack, getMaxItemUseDuration(stack));
/* 165 */     return true;
/*     */   }
/*     */   
/*     */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 169 */     player.func_71008_a(stack, getMaxItemUseDuration(stack));
/* 170 */     return stack;
/*     */   }
/*     */   public int getMaxItemUseDuration(ItemStack stack) {
/* 173 */     return 72000;
/*     */   }
/*     */   public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) {
/* 176 */     World world = player.func_130014_f_();
/* 177 */     boolean didAnalyze = (getMaxItemUseDuration(stack) - duration >= 10);
/* 178 */     if (didAnalyze) {
/* 179 */       if (!world.field_72995_K) {
/* 180 */         Option<Tuple5<BlockPosition, Object, Object, Object, Object>> option = Tablet$.MODULE$.currentlyAnalyzing();
/* 181 */         if (option instanceof Some) { Some some = (Some)option; Tuple5 tuple5 = (Tuple5)some.x(); if (tuple5 != null) { BoxedUnit boxedUnit1; BlockPosition position = (BlockPosition)tuple5._1(); int side = BoxesRunTime.unboxToInt(tuple5._2()); float hitX = BoxesRunTime.unboxToFloat(tuple5._3()), hitY = BoxesRunTime.unboxToFloat(tuple5._4()), hitZ = BoxesRunTime.unboxToFloat(tuple5._5()); try {
/* 182 */               Machine computer = Tablet$.MODULE$.get(stack, player).machine();
/*     */               
/* 184 */               NBTTagCompound data = new NBTTagCompound();
/* 185 */               computer.node().sendToReachable("tablet.use", new Object[] { data, stack, player, position, ForgeDirection.getOrientation(side), BoxesRunTime.boxToFloat(hitX), BoxesRunTime.boxToFloat(hitY), BoxesRunTime.boxToFloat(hitZ) });
/*     */               
/* 187 */               computer.signal("tablet_use", new Object[] { data });
/*     */             } finally {
/*     */               Exception exception = null;
/*     */             } 
/*     */             return; }
/*     */            }
/*     */         
/* 194 */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 199 */     else if (player.func_70093_af()) {
/* 200 */       if (!world.field_72995_K) {
/* 201 */         TabletWrapper tablet = Server$.MODULE$.get(stack, player);
/* 202 */         tablet.machine().stop();
/* 203 */         if (tablet.data().tier() > 0) {
/* 204 */           player.openGui(li.cil.oc.OpenComputers$.MODULE$, li.cil.oc.common.GuiType$.MODULE$.TabletInner().id(), world, 0, 0, 0);
/*     */         }
/*     */       }
/*     */     
/*     */     }
/* 209 */     else if (world.field_72995_K) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 218 */       player.openGui(li.cil.oc.OpenComputers$.MODULE$, li.cil.oc.common.GuiType$.MODULE$.Tablet().id(), world, 0, 0, 0);
/*     */     } else {
/*     */       Machine computer = Tablet$.MODULE$.get(stack, player).machine();
/*     */       computer.start();
/*     */       String str = computer.lastError();
/*     */       if (str == null) {
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         player.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.LastError(str));
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } 
/*     */     } 
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
/*     */   @SubscribeEvent
/*     */   public static void onServerTick(TickEvent.ServerTickEvent paramServerTickEvent) {
/*     */     Tablet$.MODULE$.onServerTick(paramServerTickEvent);
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
/*     */   @SubscribeEvent
/*     */   public static void onClientTick(TickEvent.ClientTickEvent paramClientTickEvent) {
/*     */     Tablet$.MODULE$.onClientTick(paramClientTickEvent);
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
/*     */   @SubscribeEvent
/*     */   public static void onWorldUnload(WorldEvent.Unload paramUnload) {
/*     */     Tablet$.MODULE$.onWorldUnload(paramUnload);
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
/*     */   @SubscribeEvent
/*     */   public static void onWorldSave(WorldEvent.Save paramSave) {
/*     */     Tablet$.MODULE$.onWorldSave(paramSave);
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
/*     */   public static TabletWrapper get(ItemStack paramItemStack, EntityPlayer paramEntityPlayer) {
/*     */     return Tablet$.MODULE$.get(paramItemStack, paramEntityPlayer);
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
/*     */   public static String getId(ItemStack paramItemStack) {
/*     */     return Tablet$.MODULE$.getId(paramItemStack);
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
/*     */   public static void currentlyAnalyzing_$eq(Option<Tuple5<BlockPosition, Object, Object, Object, Object>> paramOption) {
/*     */     Tablet$.MODULE$.currentlyAnalyzing_$eq(paramOption);
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
/*     */   public static Option<Tuple5<BlockPosition, Object, Object, Object, Object>> currentlyAnalyzing() {
/*     */     return Tablet$.MODULE$.currentlyAnalyzing();
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
/*     */   public static abstract class Cache
/*     */     implements Callable<TabletWrapper>, RemovalListener<String, TabletWrapper>
/*     */   {
/*     */     public com.google.common.cache.Cache<String, TabletWrapper> cache() {
/* 495 */       return this.cache; } private final com.google.common.cache.Cache<String, TabletWrapper> cache = CacheBuilder.newBuilder()
/* 496 */       .expireAfterAccess(timeout(), TimeUnit.SECONDS)
/* 497 */       .removalListener(this)
/*     */       
/* 499 */       .build(); private ItemStack currentStack; private EntityPlayer currentHolder;
/*     */     public int timeout() {
/* 501 */       return 10;
/*     */     }
/*     */     
/* 504 */     private ItemStack currentStack() { return this.currentStack; } private void currentStack_$eq(ItemStack x$1) { this.currentStack = x$1; }
/*     */     
/* 506 */     private EntityPlayer currentHolder() { return this.currentHolder; } private void currentHolder_$eq(EntityPlayer x$1) { this.currentHolder = x$1; }
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
/*     */     public TabletWrapper get(ItemStack stack, EntityPlayer holder) {
/*     */       // Byte code:
/*     */       //   0: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual getId : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */       //   7: astore_3
/*     */       //   8: aload_0
/*     */       //   9: invokevirtual cache : ()Lcom/google/common/cache/Cache;
/*     */       //   12: dup
/*     */       //   13: astore #4
/*     */       //   15: monitorenter
/*     */       //   16: aload_0
/*     */       //   17: aload_1
/*     */       //   18: invokespecial currentStack_$eq : (Lnet/minecraft/item/ItemStack;)V
/*     */       //   21: aload_0
/*     */       //   22: aload_2
/*     */       //   23: invokespecial currentHolder_$eq : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   26: aload_0
/*     */       //   27: invokevirtual cache : ()Lcom/google/common/cache/Cache;
/*     */       //   30: aload_3
/*     */       //   31: aload_0
/*     */       //   32: invokeinterface get : (Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
/*     */       //   37: checkcast li/cil/oc/common/item/TabletWrapper
/*     */       //   40: astore #6
/*     */       //   42: aload_2
/*     */       //   43: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */       //   46: aload #6
/*     */       //   48: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   51: astore #7
/*     */       //   53: dup
/*     */       //   54: ifnonnull -> 66
/*     */       //   57: pop
/*     */       //   58: aload #7
/*     */       //   60: ifnull -> 121
/*     */       //   63: goto -> 74
/*     */       //   66: aload #7
/*     */       //   68: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   71: ifne -> 121
/*     */       //   74: aload #6
/*     */       //   76: iconst_0
/*     */       //   77: invokevirtual writeToNBT : (Z)V
/*     */       //   80: aload #6
/*     */       //   82: iconst_0
/*     */       //   83: invokevirtual autoSave_$eq : (Z)V
/*     */       //   86: aload_0
/*     */       //   87: invokevirtual cache : ()Lcom/google/common/cache/Cache;
/*     */       //   90: aload_3
/*     */       //   91: invokeinterface invalidate : (Ljava/lang/Object;)V
/*     */       //   96: aload_0
/*     */       //   97: invokevirtual cache : ()Lcom/google/common/cache/Cache;
/*     */       //   100: invokeinterface cleanUp : ()V
/*     */       //   105: aload_0
/*     */       //   106: invokevirtual cache : ()Lcom/google/common/cache/Cache;
/*     */       //   109: aload_3
/*     */       //   110: aload_0
/*     */       //   111: invokeinterface get : (Ljava/lang/Object;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
/*     */       //   116: checkcast li/cil/oc/common/item/TabletWrapper
/*     */       //   119: astore #6
/*     */       //   121: aload #6
/*     */       //   123: aload_1
/*     */       //   124: invokevirtual stack_$eq : (Lnet/minecraft/item/ItemStack;)V
/*     */       //   127: aload #6
/*     */       //   129: aload_2
/*     */       //   130: invokevirtual player_$eq : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   133: aload #6
/*     */       //   135: astore #5
/*     */       //   137: aload #4
/*     */       //   139: monitorexit
/*     */       //   140: aload #5
/*     */       //   142: checkcast li/cil/oc/common/item/TabletWrapper
/*     */       //   145: areturn
/*     */       //   146: aload #4
/*     */       //   148: monitorexit
/*     */       //   149: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #509	-> 0
/*     */       //   #510	-> 8
/*     */       //   #511	-> 16
/*     */       //   #512	-> 21
/*     */       //   #513	-> 26
/*     */       //   #517	-> 42
/*     */       //   #518	-> 74
/*     */       //   #519	-> 80
/*     */       //   #520	-> 86
/*     */       //   #521	-> 96
/*     */       //   #522	-> 105
/*     */       //   #525	-> 121
/*     */       //   #526	-> 127
/*     */       //   #527	-> 133
/*     */       //   #510	-> 139
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	150	0	this	Lli/cil/oc/common/item/Tablet$Cache;
/*     */       //   0	150	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   0	150	2	holder	Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   8	137	3	id	Ljava/lang/String;
/*     */       //   42	93	6	wrapper	Lli/cil/oc/common/item/TabletWrapper;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   16	140	146	finally
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
/*     */     public TabletWrapper call() {
/* 532 */       return new TabletWrapper(currentStack(), currentHolder());
/*     */     }
/*     */     
/*     */     public void onRemoval(RemovalNotification e) {
/* 536 */       TabletWrapper tablet = (TabletWrapper)e.getValue();
/* 537 */       if (tablet.node() != null) {
/*     */         
/* 539 */         if (tablet.autoSave()) tablet.writeToNBT(tablet.writeToNBT$default$1()); 
/* 540 */         tablet.machine().stop();
/* 541 */         scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(tablet.machine().node().network().nodes()).foreach((Function1)new Tablet$Cache$$anonfun$onRemoval$1(this));
/*     */ 
/*     */         
/* 544 */         if (tablet.autoSave()) tablet.writeToNBT(tablet.writeToNBT$default$1()); 
/*     */       } 
/*     */     } public final class Tablet$Cache$$anonfun$onRemoval$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public Tablet$Cache$$anonfun$onRemoval$1(Tablet.Cache $outer) {} public final void apply(Node node) {
/*     */         node.remove();
/* 549 */       } } public void clear(World world) { synchronized (cache()) {
/* 550 */         Map tabletsInWorld = (Map)scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaConcurrentMap(cache().asMap()).filter((Function1)new Tablet$Cache$$anonfun$1(this, world));
/* 551 */         cache().invalidateAll(scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable(tabletsInWorld.keys()));
/* 552 */         cache().cleanUp(); return;
/*     */       }  } public final class Tablet$Cache$$anonfun$1 extends AbstractFunction1<Tuple2<String, TabletWrapper>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final World world$2; public final boolean apply(Tuple2 x$3) { World world = this.world$2; if (((TabletWrapper)x$3._2()).world() == null) { ((TabletWrapper)x$3._2()).world(); if (world != null); }
/*     */         else if (((TabletWrapper)x$3._2()).world().equals(world)) {  }
/*     */          } public Tablet$Cache$$anonfun$1(Tablet.Cache $outer, World world$2) {} }
/* 557 */     public void cleanUp() { synchronized (cache()) { cache().cleanUp();
/*     */         return; }
/*     */        }
/*     */     
/*     */     public ImmutableMap<String, TabletWrapper> keepAlive() {
/* 562 */       return cache().getAllPresent(scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable(scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaConcurrentMap(cache().asMap()).keys()));
/*     */     } }
/*     */   public static class Client$ extends Cache { public static final Client$ MODULE$;
/*     */     
/* 566 */     public Client$() { MODULE$ = this; } public int timeout() {
/* 567 */       return 5;
/*     */     }
/*     */     public Option<TabletWrapper> get(ItemStack stack) {
/* 570 */       if (stack.func_77942_o() && stack.func_77978_p().func_74764_b((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("tablet").toString())) {
/* 571 */         String id = stack.func_77978_p().func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("tablet").toString());
/* 572 */         synchronized (cache()) { Option option = scala.Option$.MODULE$.apply(cache().getIfPresent(id)); }
/*     */       
/* 574 */       }  return (Option<TabletWrapper>)scala.None$.MODULE$;
/*     */     } }
/*     */   public static class Server$ extends Cache { public static final Server$ MODULE$;
/*     */     public Server$() {
/* 578 */       MODULE$ = this;
/*     */     }
/* 580 */     public void saveAll(World world) { synchronized (cache())
/* 581 */       { scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable(cache().asMap().values()).withFilter((Function1)new Tablet$Server$$anonfun$saveAll$1(world)).foreach((Function1)new Tablet$Server$$anonfun$saveAll$2()); return; }  } public final class Tablet$Server$$anonfun$saveAll$1 extends AbstractFunction1<TabletWrapper, Object> implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; public final boolean apply(TabletWrapper tablet) { World world = this.world$1; if (tablet.world() == null) { tablet.world(); if (world != null); } else if (tablet.world().equals(world)) {  }
/* 582 */          } public Tablet$Server$$anonfun$saveAll$1(World world$1) {} } public final class Tablet$Server$$anonfun$saveAll$2 extends AbstractFunction1<TabletWrapper, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(TabletWrapper tablet) { tablet.writeToNBT(tablet.writeToNBT$default$1()); }
/*     */        }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Tablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */