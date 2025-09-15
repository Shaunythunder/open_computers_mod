/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.init.Items$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.stats.StatBase;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.collection.mutable.Set$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ @ScalaSignature(bytes = "\006\001\tEx!B\001\003\021\003Y\021aC!dQ&,g/Z7f]RT!a\001\003\002\r\r|W.\\8o\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001\001\t\003\0315i\021A\001\004\006\035\tA\ta\004\002\f\003\016D\027.\032<f[\026tGo\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\017ii!\031!C\0017\005\031\021\t\0347\026\003q\0012!\b\022%\033\005q\"BA\020!\003\035iW\017^1cY\026T!!\t\n\002\025\r|G\016\\3di&|g.\003\002$=\tY\021I\035:bs\n+hMZ3s!\t)C&D\001'\025\t9\003&A\003ti\006$8O\003\002*U\005IQ.\0338fGJ\fg\r\036\006\002W\005\031a.\032;\n\00591\003B\002\030\016A\003%A$\001\003BY2\004\003b\002\031\016\005\004%\t!M\001\f\007J\fg\r^5oO6\013\007/F\0013!\021i2'\016\023\n\005Qr\"aA'baB\021agO\007\002o)\021\001(O\001\007I\026$\030-\0337\013\005i\"\021aA1qS&\021Ah\016\002\t\023R,W.\0238g_\"1a(\004Q\001\nI\nAb\021:bMRLgnZ'ba\002Bq\001Q\007C\002\023\005\021)A\tDkN$x.\\\"sC\032$\030N\\4NCB,\022A\021\t\005;M\032E\005\005\002E\0176\tQI\003\002GQ\005!\021\016^3n\023\tAUIA\005Ji\026l7\013^1dW\"1!*\004Q\001\n\t\013!cQ;ti>l7I]1gi&tw-T1qA!9A*\004b\001\n\003\t\024!D!tg\026l'\r\\5oO6\013\007\017\003\004O\033\001\006IAM\001\017\003N\034X-\0342mS:<W*\0319!\021\035\001VB1A\005\002E\013!\002\026:b]NL7\017^8s+\005!\003BB*\016A\003%A%A\006Ue\006t7/[:u_J\004\003bB+\016\005\004%\t!U\001\r\t&\034\030m]:f[\ndWM\035\005\007/6\001\013\021\002\023\002\033\021K7/Y:tK6\024G.\032:!\021\035IVB1A\005\002E\013\021\"T5de>\034\007.\0339\t\rmk\001\025!\003%\003)i\025n\031:pG\"L\007\017\t\005\b;6\021\r\021\"\001R\003%\031\025\r]1dSR|'\017\003\004`\033\001\006I\001J\001\013\007\006\004\030mY5u_J\004\003bB1\016\005\004%\t!U\001\n\003N\034X-\0342mKJDaaY\007!\002\023!\023AC!tg\026l'\r\\3sA!9Q-\004b\001\n\003\t\026aD'jGJ|7m\0348ue>dG.\032:\t\r\035l\001\025!\003%\003Ai\025n\031:pG>tGO]8mY\026\024\b\005C\004j\033\t\007I\021A)\002\013I{'m\034;\t\r-l\001\025!\003%\003\031\021vNY8uA!9Q.\004b\001\n\003\t\026!\002#s_:,\007BB8\016A\003%A%\001\004Ee>tW\r\t\005\bc6\021\r\021\"\001R\003\031!\026M\0317fi\"11/\004Q\001\n\021\nq\001V1cY\026$\b\005C\004v\033\t\007I\021A)\002\017\rC\027M]4fe\"1q/\004Q\001\n\021\n\001b\0215be\036,'\017\t\005\bs6\021\r\021\"\001R\003\r\031\005+\026\005\007w6\001\013\021\002\023\002\t\r\003V\013\t\005\b{6\021\r\021\"\001R\0031iu\016^5p]N+gn]8s\021\031yX\002)A\005I\005iQj\034;j_:\034VM\\:pe\002B\001\"a\001\016\005\004%\t!U\001\t\017\026|G.\037>fe\"9\021qA\007!\002\023!\023!C$f_2L(0\032:!\021!\tY!\004b\001\n\003\t\026A\003*fIN$xN\\3J\037\"9\021qB\007!\002\023!\023a\003*fIN$xN\\3J\037\002B\001\"a\005\016\005\004%\t!U\001\007\013\026\003&kT'\t\017\005]Q\002)A\005I\0059Q)\022)S\0376\003\003\002CA\016\033\t\007I\021A)\002\r5+Wn\034:z\021\035\ty\"\004Q\001\n\021\nq!T3n_JL\b\005\003\005\002$5\021\r\021\"\001R\003\rAE\t\022\005\b\003Oi\001\025!\003%\003\021AE\t\022\021\t\021\005-RB1A\005\002E\013AaQ1tK\"9\021qF\007!\002\023!\023!B\"bg\026\004\003\002CA\032\033\t\007I\021A)\002\tI\0137m\033\005\b\003oi\001\025!\003%\003\025\021\026mY6!\021!\tY$\004b\001\n\003\t\026AB*feZ,'\017C\004\002@5\001\013\021\002\023\002\017M+'O^3sA!A\0211I\007C\002\023\005\021+\001\004TGJ,WM\034\005\b\003\017j\001\025!\003%\003\035\0316M]3f]\002B\001\"a\023\016\005\004%\t!U\001\t\027\026L(m\\1sI\"9\021qJ\007!\002\023!\023!C&fs\n|\027M\0353!\021!\t\031&\004b\001\n\003\t\026\001\003%pY><'/Y7\t\017\005]S\002)A\005I\005I\001j\0347pOJ\fW\016\t\005\t\0037j!\031!C\001#\006IA)[:l\tJLg/\032\005\b\003?j\001\025!\003%\003)!\025n]6Ee&4X\r\t\005\t\003Gj!\031!C\001#\0061a\t\\8qafDq!a\032\016A\003%A%A\004GY>\004\b/\037\021\t\021\005-TB1A\005\002E\013aa\0249f]>\033\006bBA8\033\001\006I\001J\001\b\037B,gnT*!\021!\t\031(\004b\001\n\003\t\026\001\002*bS\022Dq!a\036\016A\003%A%A\003SC&$\007\005\003\005\002|5\021\r\021\"\001R\003\021\031\025M\0353\t\017\005}T\002)A\005I\005)1)\031:eA!A\0211Q\007C\002\023\005\021+\001\007SK\022\034Ho\0348f\007\006\024H\rC\004\002\b6\001\013\021\002\023\002\033I+Gm\035;p]\026\034\025M\0353!\021!\tY)\004b\001\n\003\t\026\001D$sCBD\027nY:DCJ$\007bBAH\033\001\006I\001J\001\016\017J\f\007\017[5dg\016\013'\017\032\021\t\021\005MUB1A\005\002E\0131BT3uo>\0248nQ1sI\"9\021qS\007!\002\023!\023\001\004(fi^|'o[\"be\022\004\003\002CAN\033\t\007I\021A)\002']K'/\0327fgNtU\r^<pe.\034\025M\0353\t\017\005}U\002)A\005I\005!r+\033:fY\026\0348OT3uo>\0248nQ1sI\002B\001\"a)\016\005\004%\t!U\001\006\007\006\024G.\032\005\b\003Ok\001\025!\003%\003\031\031\025M\0317fA!A\0211V\007C\002\023\005\021+\001\tQ_^,'\017R5tiJL'-\036;pe\"9\021qV\007!\002\023!\023!\005)po\026\024H)[:ue&\024W\017^8sA!A\0211W\007C\002\023\005\021+\001\004To&$8\r\033\005\b\003ok\001\025!\003%\003\035\031v/\033;dQ\002B\001\"a/\016\005\004%\t!U\001\b\003\022\f\007\017^3s\021\035\ty,\004Q\001\n\021\n\001\"\0213baR,'\017\t\005\b\003\007lA\021AAc\003\021Ig.\033;\025\005\005\035\007cA\t\002J&\031\0211\032\n\003\tUs\027\016\036\005\b\003\037lA\021AAi\003)yg.Q:tK6\024G.\032\013\007\003\017\f\031.a6\t\017\005U\027Q\032a\001\007\006)1\017^1dW\"A\021\021\\Ag\001\004\tY.\001\004qY\006LXM\035\t\005\003;\f)/\004\002\002`*!\021\021\\Aq\025\r\t\031\017K\001\007K:$\030\016^=\n\t\005\035\030q\034\002\r\013:$\030\016^=QY\006LXM\035\005\b\003WlA\021AAw\003\035ygn\021:bMR$b!a2\002p\006E\bbBAk\003S\004\ra\021\005\t\0033\fI\0171\001\002\\\"9\021Q_\007\005\n\005]\030A\0048fo\006\033\007.[3wK6,g\016\036\013\005\003s\024y\017\005\003\002|\006uX\"A\007\007\r\005}X\002\002B\001\005I\t5\r[5fm\026lWM\034;Ck&dG-\032:\024\007\005u\b\003C\006\003\006\005u(Q1A\005\002\t\035\021\001\0028b[\026,\"A!\003\021\t\t-!\021\003\b\004#\t5\021b\001B\b%\0051\001K]3eK\032LAAa\005\003\026\t11\013\036:j]\036T1Aa\004\023\021-\021I\"!@\003\002\003\006IA!\003\002\0139\fW.\032\021\t\017]\ti\020\"\001\003\036Q!\021\021 B\020\021!\021)Aa\007A\002\t%\001B\003B\022\003{\004\r\021\"\001\003&\005\t\0010\006\002\003(A\031\021C!\013\n\007\t-\"CA\002J]RD!Ba\f\002~\002\007I\021\001B\031\003\025Ax\fJ3r)\021\t9Ma\r\t\025\tU\"QFA\001\002\004\0219#A\002yIEB\021B!\017\002~\002\006KAa\n\002\005a\004\003B\003B\037\003{\004\r\021\"\001\003&\005\t\021\020\003\006\003B\005u\b\031!C\001\005\007\nQ!_0%KF$B!a2\003F!Q!Q\007B \003\003\005\rAa\n\t\023\t%\023Q Q!\n\t\035\022AA=!\021)\t).!@A\002\023\005!QJ\013\003\005\037\002B!\005B)\007&\031!1\013\n\003\r=\003H/[8o\021)\0219&!@A\002\023\005!\021L\001\ngR\f7m[0%KF$B!a2\003\\!Q!Q\007B+\003\003\005\rAa\024\t\023\t}\023Q Q!\n\t=\023AB:uC\016\\\007\005\003\006\003d\005u\b\031!C\001\005K\na\001]1sK:$XC\001B4!\021\t\"\021\013\023\t\025\t-\024Q a\001\n\003\021i'\001\006qCJ,g\016^0%KF$B!a2\003p!Q!Q\007B5\003\003\005\rAa\032\t\023\tM\024Q Q!\n\t\035\024a\0029be\026tG\017\t\005\013\005o\ni\0201A\005\002\te\024\001C2sC\032$\030N\\4\026\005\tm\004#B\017\003~\t%\021b\001B@=\t\0311+\032;\t\025\t\r\025Q a\001\n\003\021))\001\007de\0064G/\0338h?\022*\027\017\006\003\002H\n\035\005B\003B\033\005\003\013\t\0211\001\003|!I!1RAA\003&!1P\001\nGJ\fg\r^5oO\002B!Ba$\002~\002\007I\021\001BI\0039\031Wo\035;p[\016\023\030M\032;j]\036,\"Aa%\021\tu\021ih\021\005\013\005/\013i\0201A\005\002\te\025AE2vgR|Wn\021:bMRLgnZ0%KF$B!a2\003\034\"Q!Q\007BK\003\003\005\rAa%\t\023\t}\025Q Q!\n\tM\025aD2vgR|Wn\021:bMRLgn\032\021\t\025\t\r\026Q a\001\n\003\021I(\001\006bgN,WN\0317j]\036D!Ba*\002~\002\007I\021\001BU\0039\t7o]3nE2LgnZ0%KF$B!a2\003,\"Q!Q\007BS\003\003\005\rAa\037\t\023\t=\026Q Q!\n\tm\024aC1tg\026l'\r\\5oO\002B\001Ba-\002~\022\005!QW\001\003CR$b!!?\0038\ne\006\002\003B\022\005c\003\rAa\n\t\021\tu\"\021\027a\001\005OA\001B!0\002~\022\005!qX\001\013o&$\b.S2p]>3G\003BA}\005\003Dq!!6\003<\002\0071\t\003\005\003F\006uH\021\001Bd\003)9\030\016\0365QCJ,g\016\036\013\005\003s\024I\rC\004\003d\t\r\007\031\001\023\t\021\t5\027Q C\001\005\037\fAb\0365f]\016\023\030M\032;j]\036$B!!?\003R\"A!Q\001Bf\001\004\021I\001\003\005\003N\006uH\021\001Bk)\021\tIPa6\t\017\005U'1\033a\001\007\"A!1\\A\t\003\021i.\001\bxQ\026t\027i]:f[\nd\027N\\4\025\t\005e(q\034\005\t\005\013\021I\0161\001\003\n!A!1]A\t\003\021)/A\002bI\022$\022\001\n\005\t\005S\fi\020\"\003\003l\006i1\017^1dW\032\023x.\034(b[\026$BAa\024\003n\"A!Q\001Bt\001\004\021I\001\003\005\003\006\005M\b\031\001B\005\001")
/*     */ public final class Achievement
/*     */ {
/*     */   public static void onCraft(ItemStack paramItemStack, EntityPlayer paramEntityPlayer) {
/*     */     Achievement$.MODULE$.onCraft(paramItemStack, paramEntityPlayer);
/*     */   }
/*     */   
/*     */   public static void onAssemble(ItemStack paramItemStack, EntityPlayer paramEntityPlayer) {
/*     */     Achievement$.MODULE$.onAssemble(paramItemStack, paramEntityPlayer);
/*     */   }
/*     */   
/*     */   public static void init() {
/*     */     Achievement$.MODULE$.init();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Adapter() {
/*     */     return Achievement$.MODULE$.Adapter();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Switch() {
/*     */     return Achievement$.MODULE$.Switch();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement PowerDistributor() {
/*     */     return Achievement$.MODULE$.PowerDistributor();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Cable() {
/*     */     return Achievement$.MODULE$.Cable();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement WirelessNetworkCard() {
/*     */     return Achievement$.MODULE$.WirelessNetworkCard();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement NetworkCard() {
/*     */     return Achievement$.MODULE$.NetworkCard();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement GraphicsCard() {
/*     */     return Achievement$.MODULE$.GraphicsCard();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement RedstoneCard() {
/*     */     return Achievement$.MODULE$.RedstoneCard();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Card() {
/*     */     return Achievement$.MODULE$.Card();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Raid() {
/*     */     return Achievement$.MODULE$.Raid();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement OpenOS() {
/*     */     return Achievement$.MODULE$.OpenOS();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Floppy() {
/*     */     return Achievement$.MODULE$.Floppy();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement DiskDrive() {
/*     */     return Achievement$.MODULE$.DiskDrive();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Hologram() {
/*     */     return Achievement$.MODULE$.Hologram();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Keyboard() {
/*     */     return Achievement$.MODULE$.Keyboard();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Screen() {
/*     */     return Achievement$.MODULE$.Screen();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Server() {
/*     */     return Achievement$.MODULE$.Server();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Rack() {
/*     */     return Achievement$.MODULE$.Rack();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Case() {
/*     */     return Achievement$.MODULE$.Case();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement HDD() {
/*     */     return Achievement$.MODULE$.HDD();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Memory() {
/*     */     return Achievement$.MODULE$.Memory();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement EEPROM() {
/*     */     return Achievement$.MODULE$.EEPROM();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement RedstoneIO() {
/*     */     return Achievement$.MODULE$.RedstoneIO();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Geolyzer() {
/*     */     return Achievement$.MODULE$.Geolyzer();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement MotionSensor() {
/*     */     return Achievement$.MODULE$.MotionSensor();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement CPU() {
/*     */     return Achievement$.MODULE$.CPU();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Charger() {
/*     */     return Achievement$.MODULE$.Charger();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Tablet() {
/*     */     return Achievement$.MODULE$.Tablet();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Drone() {
/*     */     return Achievement$.MODULE$.Drone();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Robot() {
/*     */     return Achievement$.MODULE$.Robot();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Microcontroller() {
/*     */     return Achievement$.MODULE$.Microcontroller();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Assembler() {
/*     */     return Achievement$.MODULE$.Assembler();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Capacitor() {
/*     */     return Achievement$.MODULE$.Capacitor();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Microchip() {
/*     */     return Achievement$.MODULE$.Microchip();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Disassembler() {
/*     */     return Achievement$.MODULE$.Disassembler();
/*     */   }
/*     */   
/*     */   public static net.minecraft.stats.Achievement Transistor() {
/*     */     return Achievement$.MODULE$.Transistor();
/*     */   }
/*     */   
/*     */   public static Map<ItemInfo, net.minecraft.stats.Achievement> AssemblingMap() {
/*     */     return Achievement$.MODULE$.AssemblingMap();
/*     */   }
/*     */   
/*     */   public static Map<ItemStack, net.minecraft.stats.Achievement> CustomCraftingMap() {
/*     */     return Achievement$.MODULE$.CustomCraftingMap();
/*     */   }
/*     */   
/*     */   public static Map<ItemInfo, net.minecraft.stats.Achievement> CraftingMap() {
/*     */     return Achievement$.MODULE$.CraftingMap();
/*     */   }
/*     */   
/*     */   public static ArrayBuffer<net.minecraft.stats.Achievement> All() {
/*     */     return Achievement$.MODULE$.All();
/*     */   }
/*     */   
/*     */   public final class Achievement$$anonfun$init$1
/*     */     extends AbstractFunction1<net.minecraft.stats.Achievement, StatBase>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final StatBase apply(net.minecraft.stats.Achievement x$1) {
/* 228 */       return x$1.func_75971_g();
/*     */     } }
/*     */   public final class Achievement$$anonfun$onAssemble$1 extends AbstractFunction1<net.minecraft.stats.Achievement, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1;
/*     */     
/*     */     public final void apply(net.minecraft.stats.Achievement x$2) {
/* 233 */       this.player$1.func_71064_a((StatBase)x$2, 1);
/*     */     }
/*     */     public Achievement$$anonfun$onAssemble$1(EntityPlayer player$1) {} }
/*     */   public final class Achievement$$anonfun$onCraft$1 extends AbstractFunction1<net.minecraft.stats.Achievement, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$2;
/* 237 */     public final void apply(net.minecraft.stats.Achievement x$3) { this.player$2.func_71064_a((StatBase)x$3, 1); } public Achievement$$anonfun$onCraft$1(EntityPlayer player$2) {} } public final class Achievement$$anonfun$onCraft$2 extends AbstractFunction1<Tuple2<ItemStack, net.minecraft.stats.Achievement>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1;
/* 238 */     public final boolean apply(Tuple2 entry) { return ItemStack.func_77989_b(this.stack$1, (ItemStack)entry._1()); } public Achievement$$anonfun$onCraft$2(ItemStack stack$1) {} } public final class Achievement$$anonfun$onCraft$3 extends AbstractFunction1<Tuple2<ItemStack, net.minecraft.stats.Achievement>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$2; public final void apply(Tuple2 entry) { this.player$2.func_71064_a((StatBase)entry._2(), 1); }
/*     */     
/*     */     public Achievement$$anonfun$onCraft$3(EntityPlayer player$2) {} }
/*     */   public static class AchievementBuilder { private final String name;
/*     */     public String name() {
/* 243 */       return this.name;
/* 244 */     } private int x = 0; public int x() { return this.x; } public void x_$eq(int x$1) { this.x = x$1; }
/* 245 */      private int y = 0; private Option<ItemStack> stack; private Option<net.minecraft.stats.Achievement> parent; private Set<String> crafting; private Set<ItemStack> customCrafting; private Set<String> assembling; public int y() { return this.y; } public void y_$eq(int x$1) { this.y = x$1; }
/* 246 */     public Option<ItemStack> stack() { return this.stack; } public void stack_$eq(Option<ItemStack> x$1) { this.stack = x$1; } public AchievementBuilder(String name) { this.stack = stackFromName(name);
/* 247 */       this.parent = (Option<net.minecraft.stats.Achievement>)None$.MODULE$;
/* 248 */       this.crafting = Set$.MODULE$.empty();
/* 249 */       this.customCrafting = Set$.MODULE$.empty();
/* 250 */       this.assembling = Set$.MODULE$.empty(); } public Option<net.minecraft.stats.Achievement> parent() { return this.parent; } public void parent_$eq(Option<net.minecraft.stats.Achievement> x$1) { this.parent = x$1; } public Set<String> crafting() { return this.crafting; } public Set<String> assembling() { return this.assembling; } public void crafting_$eq(Set<String> x$1) { this.crafting = x$1; } public Set<ItemStack> customCrafting() { return this.customCrafting; } public void customCrafting_$eq(Set<ItemStack> x$1) { this.customCrafting = x$1; } public void assembling_$eq(Set<String> x$1) { this.assembling = x$1; }
/*     */     
/*     */     public AchievementBuilder at(int x, int y) {
/* 253 */       x_$eq(x);
/* 254 */       y_$eq(y);
/* 255 */       return this;
/*     */     }
/*     */     
/*     */     public AchievementBuilder withIconOf(ItemStack stack) {
/* 259 */       stack_$eq(Option$.MODULE$.apply(stack));
/* 260 */       return this;
/*     */     }
/*     */     
/*     */     public AchievementBuilder withParent(net.minecraft.stats.Achievement parent) {
/* 264 */       parent_$eq(Option$.MODULE$.apply(parent));
/* 265 */       return this;
/*     */     }
/*     */     
/*     */     public AchievementBuilder whenCrafting(String name) {
/* 269 */       crafting().$plus$eq(name);
/* 270 */       if (stack().isEmpty()) stack_$eq(stackFromName(name)); 
/* 271 */       return this;
/*     */     }
/*     */     
/*     */     public AchievementBuilder whenCrafting(ItemStack stack) {
/* 275 */       customCrafting().$plus$eq(stack);
/* 276 */       if (stack().isEmpty()) stack_$eq(Option$.MODULE$.apply(stack)); 
/* 277 */       return this;
/*     */     }
/*     */     
/*     */     public AchievementBuilder whenAssembling(String name) {
/* 281 */       assembling().$plus$eq(name);
/* 282 */       if (stack().isEmpty()) stack_$eq(stackFromName(name)); 
/* 283 */       return this;
/*     */     } public final class Achievement$AchievementBuilder$$anonfun$add$1 extends AbstractFunction1<String, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final net.minecraft.stats.Achievement achievement$1; public Achievement$AchievementBuilder$$anonfun$add$1(Achievement.AchievementBuilder $outer, net.minecraft.stats.Achievement achievement$1) {} public final Object apply(String requirement) { ItemInfo descriptor = Items$.MODULE$.get(requirement); return (descriptor == null) ? BoxedUnit.UNIT : Achievement$.MODULE$.CraftingMap().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(descriptor), this.achievement$1)); } } public final class Achievement$AchievementBuilder$$anonfun$add$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final net.minecraft.stats.Achievement achievement$1; public Achievement$AchievementBuilder$$anonfun$add$2(Achievement.AchievementBuilder $outer, net.minecraft.stats.Achievement achievement$1) {} public final Object apply(ItemStack requirement) { return (requirement == null) ? BoxedUnit.UNIT : Achievement$.MODULE$.CustomCraftingMap().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(requirement), this.achievement$1)); } }
/* 287 */     public net.minecraft.stats.Achievement add() { net.minecraft.stats.Achievement achievement = new net.minecraft.stats.Achievement((new StringBuilder()).append("oc.").append(name()).toString(), (new StringBuilder()).append("oc.").append(name()).toString(), x(), y(), (ItemStack)stack().orNull(Predef$.MODULE$.$conforms()), (net.minecraft.stats.Achievement)parent().orNull(Predef$.MODULE$.$conforms()));
/*     */       
/* 289 */       parent().isEmpty() ? 
/* 290 */         achievement.func_75966_h() : BoxedUnit.UNIT;
/*     */ 
/*     */       
/* 293 */       crafting().foreach((Function1)new Achievement$AchievementBuilder$$anonfun$add$1(this, achievement));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 300 */       customCrafting().foreach((Function1)new Achievement$AchievementBuilder$$anonfun$add$2(this, achievement));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 306 */       assembling().foreach((Function1)new Achievement$AchievementBuilder$$anonfun$add$3(this, achievement));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 313 */       Achievement$.MODULE$.All().$plus$eq(achievement);
/* 314 */       return achievement; } public final class Achievement$AchievementBuilder$$anonfun$add$3 extends AbstractFunction1<String, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final net.minecraft.stats.Achievement achievement$1; public Achievement$AchievementBuilder$$anonfun$add$3(Achievement.AchievementBuilder $outer, net.minecraft.stats.Achievement achievement$1) {} public final Object apply(String requirement) { ItemInfo descriptor = Items$.MODULE$.get(requirement);
/*     */         return (descriptor == null) ? BoxedUnit.UNIT : Achievement$.MODULE$.AssemblingMap().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(descriptor), this.achievement$1)); } }
/* 317 */     private Option<ItemStack> stackFromName(String name) { return Option$.MODULE$.apply(Items$.MODULE$.get(name)).map((Function1)new Achievement$AchievementBuilder$$anonfun$stackFromName$1(this)); } public final class Achievement$AchievementBuilder$$anonfun$stackFromName$1 extends AbstractFunction1<ItemInfo, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(ItemInfo x$4) { return x$4.createItemStack(1); }
/*     */ 
/*     */       
/*     */       public Achievement$AchievementBuilder$$anonfun$stackFromName$1(Achievement.AchievementBuilder $outer) {} }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\Achievement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */