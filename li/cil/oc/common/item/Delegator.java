/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import li.cil.oc.api.driver.item.Chargeable;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import li.cil.oc.api.internal.Robot;
/*     */ import li.cil.oc.client.renderer.item.UpgradeRenderer$;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import li.cil.oc.integration.opencomputers.Item$;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.EnumRarity;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.WeightedRandomChestContent;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.immutable.IndexedSeq$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.Ordering;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\025v!B\001\003\021\003i\021!\003#fY\026<\027\r^8s\025\t\031A!\001\003ji\026l'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\023\021+G.Z4bi>\0248CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!\004\005\0069=!\t!H\001\bgV\024\027\n^3n)\tqr\005E\002\024?\005J!\001\t\013\003\r=\003H/[8o!\t\021S%D\001$\025\t!#!\001\004ue\006LGo]\005\003M\r\022\001\002R3mK\036\fG/\032\005\006Qm\001\r!K\001\006gR\f7m\033\t\003UAj\021a\013\006\003\0071R!!\f\030\002\0235Lg.Z2sC\032$(\"A\030\002\0079,G/\003\0022W\tI\021\n^3n'R\f7m\033\004\005!\t\0011g\005\0033i]\002\005C\001\0266\023\t14F\001\003Ji\026l\007C\001\035?\033\005I$BA\002;\025\tYD(\001\004ee&4XM\035\006\003{\031\t1!\0319j\023\ty\024HA\bVa\036\024\030\rZ3SK:$WM]3s!\tA\024)\003\002Cs\tQ1\t[1sO\026\f'\r\\3\t\013e\021D\021\001#\025\003\025\003\"A\004\032\t\013\035\023D\021\t%\002#\035,G/\023;f[N#\030mY6MS6LG\017\006\002J\031B\0211CS\005\003\027R\0211!\0238u\021\025Ac\t1\001*\021\035q%G1A\005\002=\013\001b];c\023R,Wn]\013\002!B\031\021KV\021\016\003IS!a\025+\002\0175,H/\0312mK*\021Q\013F\001\013G>dG.Z2uS>t\027BA,S\005-\t%O]1z\005V4g-\032:\t\re\023\004\025!\003Q\003%\031XOY%uK6\034\b\005C\003\\e\021\005A,A\002bI\022$\"!S/\t\013qQ\006\031A\021\t\013q\021D\021A0\025\005y\001\007\"\002\025_\001\004I\003\"\002\0173\t\003\021GC\001\020d\021\025!\027\r1\001J\003\031!\027-\\1hK\")aM\rC!O\006Yq-\032;Tk\nLE/Z7t)\021A7\016\034;\021\005MI\027B\0016\025\005\021)f.\033;\t\013\r)\007\031\001\033\t\0135,\007\031\0018\002\007Q\f'\r\005\002pe6\t\001O\003\002rY\005Y1M]3bi&4X\r^1c\023\t\031\bO\001\007De\026\fG/\033<f)\006\0247\017C\003vK\002\007a/\001\003mSN$\bgA<\002\004A\031\0010`@\016\003eT!A_>\002\tU$\030\016\034\006\002y\006!!.\031<b\023\tq\030P\001\003MSN$\b\003BA\001\003\007a\001\001B\006\002\006Q\f\t\021!A\003\002\005\035!aA0%cE!\021\021BA\b!\r\031\0221B\005\004\003\033!\"a\002(pi\"Lgn\032\t\004'\005E\021bAA\n)\t\031\021I\\=\t\017\005]!\007\"\021\002\032\005\021r-\032;V]2|7-\0317ju\026$g*Y7f)\021\tY\"!\013\021\t\005u\0211\005\b\004'\005}\021bAA\021)\0051\001K]3eK\032LA!!\n\002(\t11\013\036:j]\036T1!!\t\025\021\031A\023Q\003a\001S!9\021Q\006\032\005B\005=\022!E5t\005>|7.\0228dQ\006tG/\0312mKR1\021\021GA\034\003w\0012aEA\032\023\r\t)\004\006\002\b\005>|G.Z1o\021\035\tI$a\013A\002%\nQ!\033;f[\006Cq!!\020\002,\001\007\021&A\003ji\026l'\tC\004\002BI\"\t%a\021\002\023\035,GOU1sSRLH\003BA#\003\027\0022AKA$\023\r\tIe\013\002\013\013:,XNU1sSRL\bB\002\025\002@\001\007\021\006C\004\002PI\"\t%!\025\002+\035,GoQ8m_J4%o\\7Ji\026l7\013^1dWR)\021*a\025\002V!1\001&!\024A\002%Bq!a\026\002N\001\007\021*\001\003qCN\034\bbBA.e\021\005\023QL\001\021O\026$8i\0348uC&tWM]%uK6$2!KA0\021\031A\023\021\fa\001S!9\0211\r\032\005B\005\025\024\001\0055bg\016{g\016^1j]\026\024\030\n^3n)\021\t\t$a\032\t\r!\n\t\0071\001*\021\035\tYG\rC!\003[\nqbZ3u\007\",7\017^$f]\n\0137/\032\013\t\003_\nI(a#\002\026B!\021\021OA;\033\t\t\031H\003\002{Y%!\021qOA:\005i9V-[4ii\026$'+\0318e_6\034\005.Z:u\007>tG/\0328u\021!\tY(!\033A\002\005u\024!B2iKN$\b\003BA@\003\017k!!!!\013\007\025\t\031IC\002\002\006:\na\"\\5oK\016\024\030M\032;g_J<W-\003\003\002\n\006\005%!D\"iKN$x)\0328I_>\\7\017\003\005\002\016\006%\004\031AAH\003\r\021h\016\032\t\004q\006E\025bAAJs\n1!+\0318e_6D\001\"a&\002j\001\007\021qN\001\t_JLw-\0338bY\"9\0211\024\032\005B\005u\025A\0053pKN\034f.Z1l\005f\004\030m]:Vg\026$B\"!\r\002 \0065\026\021WA[\003sC\001\"!)\002\032\002\007\0211U\001\006o>\024H\016\032\t\005\003K\013I+\004\002\002(*\031\021\021\025\027\n\t\005-\026q\025\002\006/>\024H\016\032\005\b\003_\013I\n1\001J\003\005A\bbBAZ\0033\003\r!S\001\002s\"9\021qWAM\001\004I\025!\001>\t\021\005m\026\021\024a\001\003{\013a\001\0357bs\026\024\b\003BA`\003\017l!!!1\013\t\005m\0261\031\006\004\003\013d\023AB3oi&$\0300\003\003\002J\006\005'\001D#oi&$\030\020\0257bs\026\024\bbBAge\021\005\023qZ\001\017_:LE/Z7Vg\0264\025N]:u)Y\t\t$!5\002T\006U\027q[Am\0037\fi.!9\002l\006=\bB\002\025\002L\002\007\021\006\003\005\002<\006-\007\031AA_\021!\t\t+a3A\002\005\r\006bBAX\003\027\004\r!\023\005\b\003g\013Y\r1\001J\021\035\t9,a3A\002%Cq!a8\002L\002\007\021*\001\003tS\022,\007\002CAr\003\027\004\r!!:\002\t!LG\017\027\t\004'\005\035\030bAAu)\t)a\t\\8bi\"A\021Q^Af\001\004\t)/\001\003iSRL\006\002CAy\003\027\004\r!!:\002\t!LGO\027\005\b\003k\024D\021IA|\003%yg.\023;f[V\033X\r\006\f\0022\005e\0301`A\003\024\tAa\001\003\006\t\035!\021\002B\006\021\031A\0231\037a\001S!A\0211XAz\001\004\ti\f\003\005\002\"\006M\b\031AAR\021\035\ty+a=A\002%Cq!a-\002t\002\007\021\nC\004\0028\006M\b\031A%\t\017\005}\0271\037a\001\023\"A\0211]Az\001\004\t)\017\003\005\002n\006M\b\031AAs\021!\t\t0a=A\002\005\025\bb\002B\be\021\005#\021C\001\021_:LE/Z7SS\036DGo\0217jG.$r!\013B\n\005+\0219\002\003\004)\005\033\001\r!\013\005\t\003C\023i\0011\001\002$\"A\0211\030B\007\001\004\ti\fC\004\003\034I\"\tE!\b\002\017=tW)\031;f]R9\021Fa\b\003\"\t\r\002B\002\025\003\032\001\007\021\006\003\005\002\"\ne\001\031AAR\021!\tYL!\007A\002\005u\006b\002B\024e\021\005#\021F\001\021O\026$\030\n^3n+N,\027i\031;j_:$BAa\013\0032A\031!F!\f\n\007\t=2F\001\006F]Vl\027i\031;j_:Da\001\013B\023\001\004I\003b\002B\033e\021\005#qG\001\026O\026$X*\031=Ji\026lWk]3EkJ\fG/[8o)\rI%\021\b\005\007Q\tM\002\031A\025\t\017\tu\"\007\"\021\003@\005!rN\034)mCf,'o\025;paB,G-V:j]\036$\022\002\033B!\005\007\022)Ea\022\t\r!\022Y\0041\001*\021!\t\tKa\017A\002\005\r\006\002CA^\005w\001\r!!0\t\017\t%#1\ba\001\023\006AA-\036:bi&|g\016C\004\003NI\"\tAa\024\002?%tG/\032:oC2<U\r^%uK6\034F/Y2l\t&\034\b\017\\1z\035\006lW\r\006\003\003R\tm\003\003\002B*\0053j!A!\026\013\007\t]30\001\003mC:<\027\002BA\023\005+Ba\001\013B&\001\004I\003b\002B0e\021\005#\021M\001\030O\026$\030\n^3n'R\f7m\033#jgBd\027-\037(b[\026$BA!\025\003d!1\001F!\030A\002%BqAa\0323\t\003\022I'\001\bbI\022LeNZ8s[\006$\030n\0348\025\023!\024YG!\034\003p\tu\004B\002\025\003f\001\007\021\006\003\005\002<\n\025\004\031AA_\021!\021\tH!\032A\002\tM\024a\002;p_2$\030\016\035\031\005\005k\022I\b\005\003y{\n]\004\003BA\001\005s\"ABa\037\003p\005\005\t\021!B\001\003\017\0211a\030\0233\021!\021yH!\032A\002\005E\022\001C1em\006t7-\0323)\021\t\025$1\021BN\005;\003BA!\"\003\0306\021!q\021\006\005\005\023\023Y)\001\006sK2\fWO\\2iKJTAA!$\003\020\006\031a-\0347\013\t\tE%1S\001\005[>$7O\003\002\003\026\006\0311\r]<\n\t\te%q\021\002\t'&$Wm\0248ms\006)a/\0317vK\022\022!qT\005\005\005C\023\031+\001\004D\031&+e\n\026\006\005\005K\0239)\001\003TS\022,\007b\002BUe\021\005#1V\001\021O\026$H)[:qY\006LH)Y7bO\026$2!\023BW\021\031A#q\025a\001S!9!\021\027\032\005B\tM\026\001D4fi6\013\007\020R1nC\036,GcA%\0036\"1\001Fa,A\002%BqA!/3\t\003\022Y,A\005jg\022\013W.Y4fIR!\021\021\007B_\021\031A#q\027a\001S!9!\021\031\032\005B\t\r\027\001C8o+B$\027\r^3\025\027!\024)Ma2\003J\nM'q\033\005\007Q\t}\006\031A\025\t\021\005\005&q\030a\001\003GC\001\"a/\003@\002\007!1\032\t\005\005\033\024y-\004\002\002D&!!\021[Ab\005\031)e\016^5us\"9!Q\033B`\001\004I\025\001B:m_RD\001B!7\003@\002\007\021\021G\001\tg\026dWm\031;fI\"9!Q\034\032\005B\t}\027aB4fi&\033wN\034\013\007\005C\0249O!;\021\t\005E$1]\005\005\005K\f\031HA\003J\023\016|g\016\003\004)\0057\004\r!\013\005\b\003/\022Y\0161\001JQ!\021YNa!\003\034\nu\005b\002Bxe\021\005#\021_\001\rO\026$\030jY8o\023:$W\r\037\013\005\005C\024\031\020\003\004)\005[\004\r!\013\025\t\005[\024\031Ia'\003\036\"9!\021 \032\005B\tm\030!E4fi&\033wN\034$s_6$\025-\\1hKR!!\021\035B\021\031!'q\037a\001\023\"B!q\037BB\0057\023i\nC\004\004\004I\"\te!\002\002\033I,w-[:uKJL5m\0348t)\rA7q\001\005\t\007\023\031\t\0011\001\004\f\005a\021nY8o%\026<\027n\035;feB!1QBB\016\033\t\031yA\003\003\004\022\rM\021a\002;fqR,(/\032\006\005\007+\0319\"\001\005sK:$WM]3s\025\r\031I\002L\001\007G2LWM\034;\n\t\ru1q\002\002\016\023&\033wN\034*fO&\034H/\032:)\021\r\005!1\021BN\005;Cqaa\t3\t\003\032)#\001\005u_N#(/\0338h)\t\021\t\006C\004\004*I\"\taa\013\002\023\r\fgn\0215be\036,G\003BA\031\007[Aa\001KB\024\001\004I\003bBB\031e\021\00511G\001\007G\"\f'oZ3\025\021\rU21HB\037\007\003\0022aEB\034\023\r\031I\004\006\002\007\t>,(\r\\3\t\r!\032y\0031\001*\021!\031yda\fA\002\rU\022AB1n_VtG\017\003\005\004D\r=\002\031AA\031\003!\031\030.\\;mCR,\007bBB$e\021\0053\021J\001\033G>l\007/\036;f!J,g-\032:sK\022lu.\0368u!>Lg\016\036\013\t\0037\031Ye!\024\004^!1\001f!\022A\002%B\001ba\024\004F\001\0071\021K\001\006e>\024w\016\036\t\005\007'\032I&\004\002\004V)\0311q\013\037\002\021%tG/\032:oC2LAaa\027\004V\t)!k\0342pi\"A1qLB#\001\004\031\t'\001\013bm\006LG.\0312mK6{WO\034;Q_&tGo\035\t\006q\016\r\0241D\005\004\007KJ(aA*fi\"91\021\016\032\005B\r-\024A\002:f]\022,'\017F\005i\007[\032yga(\004\"\"1\001fa\032A\002%B\001b!\035\004h\001\00711O\001\013[>,h\016\036)pS:$\b\003BB;\0073sAaa\036\004\024:!1\021PBH\035\021\031Yh!$\017\t\ru41\022\b\005\007\032II\004\003\004\002\016\035UBABB\025\r\031)\tD\001\007yI|w\016\036 \n\003-I!!\003\006\n\005\035A\021BA\037\007\023\r\031\t\nP\001\006KZ,g\016^\005\005\007+\0339*\001\tS_\n|GOU3oI\026\024XI^3oi*\0311\021\023\037\n\t\rm5Q\024\002\013\033>,h\016\036)pS:$(\002BBK\007/C\001ba\024\004h\001\0071\021\013\005\t\007G\0339\0071\001\002f\006\021\001\017\036")
/*     */ public class Delegator extends Item implements UpgradeRenderer, Chargeable {
/*     */   private final ArrayBuffer<Delegate> subItems;
/*     */   
/*  42 */   public Delegator() { func_77627_a(true);
/*  43 */     func_77637_a((CreativeTabs)CreativeTab$.MODULE$);
/*  44 */     func_77655_b("oc.multi");
/*  45 */     this.field_111218_cA = (new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":Microchip0").toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     this.subItems = (ArrayBuffer<Delegate>)ArrayBuffer$.MODULE$.empty(); } public int getItemStackLimit(ItemStack stack) { int i; Option<Delegate> option = Delegator$.MODULE$.subItem(stack); if (option instanceof Some) { int j; Some some = (Some)option; Delegate subItem = (Delegate)some.x(); Option option1 = Item$.MODULE$.address(stack); if (option1 instanceof Some) { j = 1; } else { j = subItem.maxStackSize(); }  i = j; } else { i = this.field_77777_bU; }  return i; } public ArrayBuffer<Delegate> subItems() { return this.subItems; }
/*     */   
/*     */   public int add(Delegate subItem) {
/*  63 */     int itemId = subItems().length();
/*  64 */     subItems().$plus$eq(subItem);
/*  65 */     return itemId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<Delegate> subItem(ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnonnull -> 10
/*     */     //   4: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   7: goto -> 89
/*     */     //   10: aload_0
/*     */     //   11: aload_1
/*     */     //   12: invokevirtual func_77960_j : ()I
/*     */     //   15: invokevirtual subItem : (I)Lscala/Option;
/*     */     //   18: astore_2
/*     */     //   19: aload_2
/*     */     //   20: instanceof scala/Some
/*     */     //   23: ifeq -> 82
/*     */     //   26: aload_2
/*     */     //   27: checkcast scala/Some
/*     */     //   30: astore_3
/*     */     //   31: aload_3
/*     */     //   32: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   35: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   38: astore #4
/*     */     //   40: aload_1
/*     */     //   41: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   44: aload_0
/*     */     //   45: astore #5
/*     */     //   47: dup
/*     */     //   48: ifnonnull -> 60
/*     */     //   51: pop
/*     */     //   52: aload #5
/*     */     //   54: ifnull -> 68
/*     */     //   57: goto -> 82
/*     */     //   60: aload #5
/*     */     //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 82
/*     */     //   68: new scala/Some
/*     */     //   71: dup
/*     */     //   72: aload #4
/*     */     //   74: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   77: astore #6
/*     */     //   79: goto -> 87
/*     */     //   82: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   85: astore #6
/*     */     //   87: aload #6
/*     */     //   89: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 0
/*     */     //   #73	-> 4
/*     */     //   #69	-> 10
/*     */     //   #70	-> 19
/*     */     //   #71	-> 82
/*     */     //   #69	-> 87
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	90	0	this	Lli/cil/oc/common/item/Delegator;
/*     */     //   0	90	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   40	50	4	subItem	Lli/cil/oc/common/item/traits/Delegate;
/*     */   }
/*     */ 
/*     */   
/*     */   public Option<Delegate> subItem(int damage) {
/*  76 */     int i = damage; switch (i) {  }  return 
/*  77 */       (i >= 0 && i < subItems().length()) ? (Option<Delegate>)new Some(subItems().apply(i)) : 
/*  78 */       (Option<Delegate>)None$.MODULE$;
/*     */   }
/*     */   
/*     */   public final boolean li$cil$oc$common$item$Delegator$$add$1(List<Object> list, Object value)
/*     */   {
/*  83 */     return list.add(value);
/*  84 */   } public final class Delegator$$anonfun$getSubItems$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int x$1) { return apply$mcZI$sp(x$1); } public boolean apply$mcZI$sp(int x$1) { return ((Delegate)this.$outer.subItems().apply(x$1)).showInItemList(); } public Delegator$$anonfun$getSubItems$1(Delegator $outer) {} } public final class Delegator$$anonfun$getSubItems$2 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(int x$2) { Delegate qual$1 = (Delegate)this.$outer.subItems().apply(x$2); int x$6 = qual$1.createItemStack$default$1(); return qual$1.createItemStack(x$6); } public Delegator$$anonfun$getSubItems$2(Delegator $outer) {} } public void func_150895_a(Item item, CreativeTabs tab, List list) { ((IterableLike)((SeqLike)((TraversableLike)subItems().indices().filter((Function1)new Delegator$$anonfun$getSubItems$1(this)))
/*  85 */       .map((Function1)new Delegator$$anonfun$getSubItems$2(this), IndexedSeq$.MODULE$.canBuildFrom()))
/*  86 */       .sortBy((Function1)new Delegator$$anonfun$getSubItems$3(this), (Ordering)Ordering$String$.MODULE$))
/*  87 */       .foreach((Function1)new Delegator$$anonfun$getSubItems$4(this, list)); } public final class Delegator$$anonfun$getSubItems$3 extends AbstractFunction1<ItemStack, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(ItemStack x$3) { return x$3.func_77977_a(); } public Delegator$$anonfun$getSubItems$3(Delegator $outer) {} } public final class Delegator$$anonfun$getSubItems$4 extends AbstractFunction1<ItemStack, Object> implements Serializable { public final boolean apply(ItemStack x$4) { return this.$outer.li$cil$oc$common$item$Delegator$$add$1(this.list$1, x$4); }
/*     */     
/*     */     public static final long serialVersionUID = 0L; private final List list$1;
/*     */     
/*     */     public Delegator$$anonfun$getSubItems$4(Delegator $outer, List list$1) {} }
/*     */   
/*     */   public String func_77667_c(ItemStack stack) {
/*     */     String str;
/*  95 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/*  96 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); str = (new StringBuilder()).append("item.oc.").append(subItem.unlocalizedName()).toString(); }
/*  97 */     else { str = func_77658_a(); }
/*     */     
/*     */     return str; } public boolean isBookEnchantable(ItemStack itemA, ItemStack itemB) {
/* 100 */     return false;
/*     */   }
/*     */   public EnumRarity func_77613_e(ItemStack stack) { EnumRarity enumRarity;
/* 103 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 104 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); enumRarity = subItem.rarity(stack); }
/* 105 */     else { enumRarity = EnumRarity.common; }
/*     */     
/*     */     return enumRarity; }
/*     */   public int func_82790_a(ItemStack stack, int pass) { int i;
/* 109 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 110 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); i = subItem.color(stack, pass); }
/* 111 */     else { i = super.func_82790_a(stack, pass); }
/*     */     
/*     */     return i; }
/*     */   public ItemStack getContainerItem(ItemStack stack) { ItemStack itemStack;
/* 115 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 116 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); itemStack = subItem.getContainerItem(stack); }
/* 117 */     else { itemStack = super.getContainerItem(stack); }
/*     */     
/*     */     return itemStack; }
/*     */   public boolean hasContainerItem(ItemStack stack) { boolean bool;
/* 121 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 122 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); bool = subItem.hasContainerItem(stack); }
/* 123 */     else { bool = super.hasContainerItem(stack); }
/*     */     
/*     */     return bool; } public WeightedRandomChestContent getChestGenBase(ChestGenHooks chest, Random rnd, WeightedRandomChestContent original) {
/* 126 */     return original;
/*     */   }
/*     */   
/*     */   public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
/*     */     boolean bool;
/* 131 */     Option<Delegate> option = Delegator$.MODULE$.subItem(player.func_70694_bm());
/* 132 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); bool = subItem.doesSneakBypassUse(BlockPosition$.MODULE$.apply(x, y, z, world), player); }
/* 133 */     else { bool = super.doesSneakBypassUse(world, x, y, z, player); }
/*     */     
/*     */     return bool;
/*     */   } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) { boolean bool;
/* 137 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 138 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); bool = subItem.onItemUseFirst(stack, player, BlockPosition$.MODULE$.apply(x, y, z, world), side, hitX, hitY, hitZ); }
/* 139 */     else { bool = super.onItemUseFirst(stack, player, world, x, y, z, side, hitX, hitY, hitZ); }
/*     */     
/*     */     return bool; }
/*     */   public boolean func_77648_a(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) { boolean bool;
/* 143 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 144 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); bool = subItem.onItemUse(stack, player, BlockPosition$.MODULE$.apply(x, y, z, world), side, hitX, hitY, hitZ); }
/* 145 */     else { bool = super.func_77648_a(stack, player, world, x, y, z, side, hitX, hitY, hitZ); }
/*     */     
/*     */     return bool; } public ItemStack func_77659_a(ItemStack stack, World world, EntityPlayer player) {
/*     */     ItemStack itemStack;
/* 149 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 150 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); itemStack = subItem.onItemRightClick(stack, world, player); }
/* 151 */     else { itemStack = super.func_77659_a(stack, world, player); }
/*     */     
/*     */     return itemStack;
/*     */   }
/*     */   
/*     */   public ItemStack func_77654_b(ItemStack stack, World world, EntityPlayer player) { ItemStack itemStack;
/* 157 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 158 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); itemStack = subItem.onEaten(stack, world, player); }
/* 159 */     else { itemStack = super.func_77654_b(stack, world, player); }
/*     */     
/*     */     return itemStack; }
/*     */   public EnumAction func_77661_b(ItemStack stack) { EnumAction enumAction;
/* 163 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 164 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); enumAction = subItem.getItemUseAction(stack); }
/* 165 */     else { enumAction = super.func_77661_b(stack); }
/*     */     
/*     */     return enumAction; } public int func_77626_a(ItemStack stack) {
/*     */     int i;
/* 169 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 170 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); i = subItem.getMaxItemUseDuration(stack); }
/* 171 */     else { i = super.func_77626_a(stack); }
/*     */     
/*     */     return i;
/*     */   } public void func_77615_a(ItemStack stack, World world, EntityPlayer player, int duration) {
/* 175 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 176 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); subItem.onPlayerStoppedUsing(stack, player, duration); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 177 */     else { super.func_77615_a(stack, world, player, duration); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public String internalGetItemStackDisplayName(ItemStack stack) {
/* 180 */     return super.func_77653_i(stack);
/*     */   } public String func_77653_i(ItemStack stack) {
/*     */     String str;
/* 183 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 184 */     if (option instanceof Some) { String str1; Some some = (Some)option; Delegate subItem = (Delegate)some.x(); Option option1 = subItem.displayName(stack);
/* 185 */       if (option1 instanceof Some) { Some some1 = (Some)option1; String name = (String)some1.x(); }
/* 186 */       else { str1 = super.func_77653_i(stack); }
/*     */        str = str1; }
/* 188 */     else { str = super.func_77653_i(stack); }
/*     */     
/*     */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_77624_a(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: aload_2
/*     */     //   3: aload_3
/*     */     //   4: iload #4
/*     */     //   6: invokespecial func_77624_a : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/List;Z)V
/*     */     //   9: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   12: aload_1
/*     */     //   13: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   16: astore #5
/*     */     //   18: aload #5
/*     */     //   20: instanceof scala/Some
/*     */     //   23: ifeq -> 61
/*     */     //   26: aload #5
/*     */     //   28: checkcast scala/Some
/*     */     //   31: astore #6
/*     */     //   33: aload #6
/*     */     //   35: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   38: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   41: astore #7
/*     */     //   43: aload #7
/*     */     //   45: aload_1
/*     */     //   46: aload_2
/*     */     //   47: aload_3
/*     */     //   48: iload #4
/*     */     //   50: invokeinterface tooltipLines : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/List;Z)V
/*     */     //   55: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   58: goto -> 90
/*     */     //   61: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   64: astore #8
/*     */     //   66: goto -> 92
/*     */     //   69: astore #9
/*     */     //   71: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   74: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   77: ldc_w 'Error in item tooltip.'
/*     */     //   80: aload #9
/*     */     //   82: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   87: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   90: astore #8
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #193	-> 0
/*     */     //   #194	-> 9
/*     */     //   #195	-> 18
/*     */     //   #198	-> 61
/*     */     //   #196	-> 69
/*     */     //   #195	-> 69
/*     */     //   #195	-> 90
/*     */     //   #192	-> 92
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	93	0	this	Lli/cil/oc/common/item/Delegator;
/*     */     //   0	93	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	93	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	93	3	tooltip	Ljava/util/List;
/*     */     //   0	93	4	advanced	Z
/*     */     //   43	50	7	subItem	Lli/cil/oc/common/item/traits/Delegate;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   43	61	69	finally
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDisplayDamage(ItemStack stack) {
/* 203 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 204 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); if (subItem.isDamageable()) return subItem.damage(stack);  }
/* 205 */      return super.getDisplayDamage(stack);
/*     */   }
/*     */   
/*     */   public int getMaxDamage(ItemStack stack) {
/* 209 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 210 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); if (subItem.isDamageable()) return subItem.maxDamage(stack);  }
/* 211 */      return super.getMaxDamage(stack);
/*     */   }
/*     */   
/*     */   public boolean isDamaged(ItemStack stack) {
/* 215 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 216 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); if (subItem.isDamageable()) return (subItem.damage(stack) > 0);  }
/*     */     
/*     */     return false;
/*     */   }
/*     */   public void func_77663_a(ItemStack stack, World world, Entity player, int slot, boolean selected) {
/* 221 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 222 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); subItem.update(stack, world, player, slot, selected); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 223 */     else { super.func_77663_a(stack, world, player, slot, selected); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(ItemStack stack, int pass) { IIcon iIcon;
/* 228 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 229 */     if (option instanceof Some) { IIcon iIcon1; Some some = (Some)option; Delegate subItem = (Delegate)some.x(); Option option1 = subItem.icon(stack, pass);
/* 230 */       if (option1 instanceof Some) { Some some1 = (Some)option1; IIcon icon = (IIcon)some1.x(); }
/* 231 */       else { iIcon1 = super.getIcon(stack, pass); }
/*     */        iIcon = iIcon1; }
/* 233 */     else { iIcon = super.getIcon(stack, pass); }
/*     */     
/*     */     return iIcon; } @SideOnly(Side.CLIENT)
/*     */   public IIcon func_77650_f(ItemStack stack) {
/* 237 */     return getIcon(stack, 0);
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public IIcon func_77617_a(int damage) {
/*     */     IIcon iIcon;
/* 241 */     Option<Delegate> option = subItem(damage);
/* 242 */     if (option instanceof Some) { IIcon iIcon1; Some some = (Some)option; Delegate subItem = (Delegate)some.x(); Option option1 = subItem.icon();
/* 243 */       if (option1 instanceof Some) { Some some1 = (Some)option1; IIcon icon = (IIcon)some1.x(); }
/* 244 */       else { iIcon1 = super.func_77617_a(damage); }
/*     */        iIcon = iIcon1; }
/* 246 */     else { iIcon = super.func_77617_a(damage); }
/*     */     
/*     */     return iIcon;
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/* 251 */   public void func_94581_a(IIconRegister iconRegister) { super.func_94581_a(iconRegister);
/* 252 */     subItems().foreach((Function1)new Delegator$$anonfun$registerIcons$1(this, iconRegister)); } public final class Delegator$$anonfun$registerIcons$1 extends AbstractFunction1<Delegate, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IIconRegister iconRegister$1; public final void apply(Delegate x$5) { x$5.registerIcons(this.iconRegister$1); }
/*     */      public Delegator$$anonfun$registerIcons$1(Delegator $outer, IIconRegister iconRegister$1) {} }
/*     */   public String toString() {
/* 255 */     return func_77658_a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canCharge(ItemStack stack) {
/* 260 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 261 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); if (subItem instanceof Chargeable)
/*     */         return true;  }
/*     */     
/*     */     return false;
/*     */   } public double charge(ItemStack stack, double amount, boolean simulate) {
/* 266 */     Option<Delegate> option = Delegator$.MODULE$.subItem(stack);
/* 267 */     if (option instanceof Some) { Some some = (Some)option; Delegate subItem = (Delegate)some.x(); if (subItem instanceof Chargeable) { Delegate delegate = subItem; return ((Chargeable)delegate).charge(stack, amount, simulate); }  }
/* 268 */      return 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public String computePreferredMountPoint(ItemStack stack, Robot robot, Set availableMountPoints) {
/* 273 */     return UpgradeRenderer$.MODULE$.preferredMountPoint(stack, availableMountPoints);
/*     */   } public void render(ItemStack stack, RobotRenderEvent.MountPoint mountPoint, Robot robot, float pt) {
/* 275 */     UpgradeRenderer$.MODULE$.render(stack, mountPoint);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Delegator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */