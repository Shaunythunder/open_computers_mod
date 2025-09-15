/*     */ package li.cil.oc.common;
/*     */ import cpw.mods.fml.common.gameevent.PlayerEvent;
/*     */ import li.cil.oc.api.component.RackMountable;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.server.machine.Machine;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ @ScalaSignature(bytes = "\006\001\r\rt!B\001\003\021\003Y\021\001D#wK:$\b*\0318eY\026\024(BA\002\005\003\031\031w.\\7p]*\021QAB\001\003_\016T!a\002\005\002\007\rLGNC\001\n\003\ta\027n\001\001\021\0051iQ\"\001\002\007\0139\021\001\022A\b\003\031\0253XM\034;IC:$G.\032:\024\0055\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\033\021\005\001$\001\004=S:LGO\020\013\002\027!9!$\004b\001\n\023Y\022!\0049f]\022LgnZ*feZ,'/F\001\035!\ri\"\005J\007\002=)\021q\004I\001\b[V$\030M\0317f\025\t\t##\001\006d_2dWm\031;j_:L!a\t\020\003\r\t+hMZ3s!\r\tReJ\005\003MI\021\021BR;oGRLwN\034\031\021\005EA\023BA\025\023\005\021)f.\033;\t\r-j\001\025!\003\035\0039\001XM\0343j]\036\034VM\035<fe\002Bq!L\007C\002\023%1$A\007qK:$\027N\\4DY&,g\016\036\005\007_5\001\013\021\002\017\002\035A,g\016Z5oO\016c\027.\0328uA!9\021'\004b\001\n\023\021\024!\004:v]:Lgn\032*pE>$8/F\0014!\riBGN\005\003ky\0211aU3u!\t9$(D\0019\025\tI$!\001\006uS2,WM\034;jifL!a\017\035\003\013I{'m\034;\t\ruj\001\025!\0034\0039\021XO\0348j]\036\024vNY8ug\002BqaP\007C\002\023%\001)A\005lKf\024w.\031:egV\t\021\tE\002C\017\"k\021a\021\006\003\t\026\013A!\036;jY*\ta)\001\003kCZ\f\027BA\033D!\tIe*D\001K\025\tYE*A\005d_6\004xN\\3oi*\021Q\nB\001\007g\026\024h/\032:\n\005=S%\001C&fs\n|\027M\0353\t\rEk\001\025!\003B\003)YW-\0372pCJ$7\017\t\005\b'6\021\r\021\"\003U\003!i\027m\0315j]\026\034X#A+\021\007u!d\013\005\002X56\t\001L\003\002Z\031\0069Q.Y2iS:,\027BA.Y\005\035i\025m\0315j]\026Da!X\007!\002\023)\026!C7bG\"Lg.Z:!\021\025yV\002\"\001a\0031ygNU8c_R\034F/\031:u)\t9\023\rC\003c=\002\007a'A\003s_\n|G\017C\003e\033\021\005Q-\001\bp]J{'m\034;Ti>\004\b/\0323\025\005\0352\007\"\0022d\001\0041\004\"\0025\016\t\003I\027aC1eI.+\027PY8be\022$\"a\n6\t\013-<\007\031\001%\002\021-,\027PY8be\022DQ!\\\007\005\0029\fQb]2iK\022,H.Z\"m_N,GCA\024p\021\025IF\0161\001W\021\025\tX\002\"\001s\003=)hn]2iK\022,H.Z\"m_N,GCA\024t\021\025I\006\0171\001W\021\025)X\002\"\001w\0039\0318\r[3ek2,7+\032:wKJ$\"aJ<\t\013a$\b\031A=\002\025QLG.Z#oi&$\030\020E\002{\003\003i\021a\037\006\003sqT!! @\002\0235Lg.Z2sC\032$(\"A@\002\0079,G/C\002\002\004m\024!\002V5mK\026sG/\033;z\021\031)X\002\"\001\002\bQ\031q%!\003\t\017\005-\021Q\001a\001I\005\ta\rC\004\002\0205!\t!!\005\002\035M\034\007.\0323vY\026\034E.[3oiR\031q%a\005\t\017\005-\021Q\002a\001I!9\021qC\007\005\002\005e\021aC:dQ\026$W\017\\3G\033B#2aJA\016\021\035A\030Q\003a\001\003;\0012!E\023zQ!\t)\"!\t\002@\005\005\003\003BA\022\003sqA!!\n\00265\021\021q\005\006\004\007\005%\"\002BA\026\003[\t1AZ7m\025\021\ty#!\r\002\t5|Gm\035\006\003\003g\t1a\0319x\023\021\t9$a\n\002\021=\003H/[8oC2LA!a\017\002>\t1Q*\032;i_\022TA!a\016\002(\005)Qn\0343jI\006\022\0211I\001\017\r>\024x-Z'vYRL\007/\031:u\021\035\t9%\004C\001\003\023\nab]2iK\022,H.Z!Fe\005#G\rF\002(\003\027Bq\001_A#\001\004\ti\005\005\003\002P\005eSBAA)\025\021\t\031&!\026\002\013A|w/\032:\013\007\005]\003(\001\004ue\006LGo]\005\005\0037\n\tFA\nBaBd\027.\0323F]\026\024x-[:uS\016\034(\007\013\005\002F\005\005\022qHA0C\t\t\t'A\nbaBd\027.\0323f]\026\024x-[:uS\016\034(\007C\004\002f5!\t!a\032\002\035M\034\007.\0323vY\026L5IM!eIR\031q%!\033\t\017a\f\031\0071\001\002lA!\021qJA7\023\021\ty'!\025\0039%sG-^:ue&\fGn\021:bMR\024T\t\0379fe&lWM\034;bY\"B\0211MA\021\003\t\031(\t\002\002v\005\031\021j\021\032\t\017\005\025T\002\"\001\002zQ\031q%a\037\t\017a\f9\b1\001\002~A!\021qJA@\023\021\t\t)!\025\003/%sG-^:ue&\fGn\021:bMR\0244\t\\1tg&\034\007\006CA<\003C\ty$!\"\"\005\005\035\025aC%De5\032E.Y:tS\016Dq!a#\016\t\003\ti)\001\rtG\",G-\0367f/&\024X\r\\3tgJ+Gm\035;p]\026$2aJAH\021!\t\t*!#A\002\005M\025A\001:t!\rI\025QS\005\004\003/S%\001\005*fIN$xN\\3XSJ,G.Z:t\021\035\tY*\004C\001\003;\013Ab\0348TKJ4XM\035+jG.$B!a(\002&B\031\021#!)\n\007\005\r&CA\002B]fD\001\"a*\002\032\002\007\021\021V\001\002KB!\0211VAh\035\021\ti+!3\017\t\005=\026Q\031\b\005\003c\013\031M\004\003\0024\006\005g\002BA[\003sA!a.\002>6\021\021\021\030\006\004\003wS\021A\002\037s_>$h(\003\002\0024%!\021qFA\031\023\021\tY#!\f\n\007\r\tI#\003\003\002H\006\035\022!C4b[\026,g/\0328u\023\021\tY-!4\002\023QK7m[#wK:$(\002BAd\003OIA!!5\002T\ny1+\032:wKJ$\026nY6Fm\026tGO\003\003\002L\0065\007\006BAM\003/\004B!!7\002`6\021\0211\034\006\005\003;\f9#\001\007fm\026tG\017[1oI2,'/\003\003\002b\006m'AD*vEN\034'/\0332f\013Z,g\016\036\005\b\003KlA\021AAt\0031ygn\0217jK:$H+[2l)\r9\023\021\036\005\t\003O\013\031\0171\001\002lB!\0211VAw\023\021\ty/a5\003\037\rc\027.\0328u)&\0347.\022<f]RDC!a9\002X\"9\021Q_\007\005\002\005]\030A\0049mCf,'\017T8hO\026$\027J\034\013\004O\005e\b\002CAT\003g\004\r!a?\021\t\005u(1\001\b\005\003[\013y0\003\003\003\002\0055\027a\003)mCf,'/\022<f]RLAA!\002\003\b\t\031\002\013\\1zKJdunZ4fI&sWI^3oi*!!\021AAgQ\021\t\0310a6\t\017\t5Q\002\"\001\003\020\005q1\r\\5f]RdunZ4fI&sGcA\024\003\022!A\021q\025B\006\001\004\021\031\002\005\003\003\026\t\rb\002\002B\f\005;qA!a,\003\032%!!1DA\024\003\035qW\r^<pe.LAAa\b\003\"\005ya)\024'OKR<xN]6Fm\026tGO\003\003\003\034\005\035\022\002\002B\023\005O\021Ad\0217jK:$8i\0348oK\016$X\r\032+p'\026\024h/\032:Fm\026tGO\003\003\003 \t\005\002\006\002B\006\003/DqA!\f\016\t\003\021y#\001\007p]\ncwnY6Ce\026\f7\016F\002(\005cA\001\"a*\003,\001\007!1\007\t\005\005k\021IE\004\003\0038\t\025SB\001B\035\025\021\021YD!\020\002\013]|'\017\0343\013\t\t}\"\021I\001\006KZ,g\016\036\006\004\005\007r\030AD7j]\026\034'/\0314uM>\024x-Z\005\005\005\017\022I$\001\006CY>\0347.\022<f]RLAAa\023\003N\tQ!I]3bW\0263XM\034;\013\t\t\035#\021\b\025\005\005W\t9\016C\004\003T5!\tA!\026\002\037=t\007\013\\1zKJ\024Vm\0359bo:$2a\nB,\021!\t9K!\025A\002\te\003\003BA\0057JAA!\030\003\b\t\021\002\013\\1zKJ\024Vm\0359bo:,e/\0328uQ\021\021\t&a6\t\017\t\rT\002\"\001\003f\005ArN\034)mCf,'o\0215b]\036,G\rR5nK:\034\030n\0348\025\007\035\0229\007\003\005\002(\n\005\004\031\001B5!\021\tiPa\033\n\t\t5$q\001\002\034!2\f\0270\032:DQ\006tw-\0323ES6,gn]5p]\0263XM\034;)\t\t\005\024q\033\005\b\005gjA\021\001B;\0039yg\016\0257bs\026\024Hj\\4pkR$2a\nB<\021!\t9K!\035A\002\te\004\003BA\005wJAA! \003\b\t!\002\013\\1zKJdunZ4fI>+H/\022<f]RDCA!\035\002X\"9!1Q\007\005\002\t\025\025!E8o\013:$\030\016^=K_&twk\034:mIR\031qEa\"\t\021\005\035&\021\021a\001\005\023\003BAa#\003\0226\021!Q\022\006\005\005\037\023i$\001\004f]RLG/_\005\005\005'\023iI\001\013F]RLG/\037&pS:<vN\0357e\013Z,g\016\036\025\005\005\003\0139\016\003\006\003\0326A)\031!C\001\0057\013Q\001\032:p]\026,\"A!(\021\t\t}%\021V\007\003\005CSAAa)\003&\0061A-\032;bS2T1Aa*\005\003\r\t\007/[\005\005\005W\023\tK\001\005Ji\026l\027J\0344p\021)\021y+\004E\001B\003&!QT\001\007IJ|g.\032\021\t\025\tMV\002#b\001\n\003\021Y*\001\004fKB\024x.\034\005\013\005ok\001\022!Q!\n\tu\025aB3faJ|W\016\t\005\013\005wk\001R1A\005\002\tm\025A\0024m_B\004\030\020\003\006\003@6A\t\021)Q\005\005;\013qA\0327paBL\b\005\003\006\003D6A)\031!C\001\0057\0131!\\2v\021)\0219-\004E\001B\003&!QT\001\005[\016,\b\005\003\006\003L6A)\031!C\001\0057\013\021C\\1wS\036\fG/[8o+B<'/\0313f\021)\021y-\004E\001B\003&!QT\001\023]\0064\030nZ1uS>tW\013]4sC\022,\007\005C\005c\033!\025\r\021\"\001\003\034\"Q!Q[\007\t\002\003\006KA!(\002\rI|'m\034;!\021)\021I.\004EC\002\023\005!1T\001\007i\006\024G.\032;\t\025\tuW\002#A!B\023\021i*A\004uC\ndW\r\036\021\t\017\t\005X\002\"\001\003d\006QqN\\\"sC\032$\030N\\4\025\007\035\022)\017\003\005\002(\n}\007\031\001Bt!\021\tiP!;\n\t\t-(q\001\002\021\023R,Wn\021:bMR,G-\022<f]RDCAa8\002X\"9!\021_\007\005\002\tM\030\001C8o!&\0347.\0369\025\007\035\022)\020\003\005\002(\n=\b\031\001B|!\021\tiP!?\n\t\tm(q\001\002\020\023R,W\016U5dWV\004XI^3oi\"\"!q^Al\021\035\031\t!\004C\005\007\007\tq\002^5nK\032{'\017\025:fg\026tGo]\013\003\007\013\0012!EB\004\023\r\031IA\005\002\b\005>|G.Z1o\021\035\031i!\004C\001\007\007\t\001\"[:JiRKW.\032\005\b\007#iA\021BB\n\003\035\021Xm\031:bMR$\002b!\002\004\026\r]11\004\005\t\003O\033y\0011\001\003h\"A1\021DB\b\001\004\021i*\001\003ji\026l\007\002CB\017\007\037\001\raa\b\002\021\r\fG\016\0342bG.\004r!EB\021\007K\031y#C\002\004$I\021\021BR;oGRLwN\\\031\021\t\r\03521F\007\003\007SQ1a!\007}\023\021\031ic!\013\003\023%#X-\\*uC\016\\\007#B\t\0042\r\025\022bAB\032%\t1q\n\035;j_:Dqaa\016\016\t\003\031I$A\007p]^{'\017\0343V]2|\027\r\032\013\004O\rm\002\002CAT\007k\001\ra!\020\021\t\r}2Q\t\b\005\005o\031\t%\003\003\004D\te\022AC,pe2$WI^3oi&!1qIB%\005\031)f\016\\8bI*!11\tB\035Q\021\031)$a6\t\017\r=S\002\"\001\004R\005iqN\\\"ik:\\WK\0347pC\022$2aJB*\021!\t9k!\024A\002\rU\003\003BB,\007;rAAa\016\004Z%!11\fB\035\003)\031\005.\0368l\013Z,g\016^\005\005\007\017\032yF\003\003\004\\\te\002\006BB'\003/\004")
/*     */ public final class EventHandler { @SubscribeEvent
/*     */   public static void onChunkUnload(ChunkEvent.Unload paramUnload) { EventHandler$.MODULE$.onChunkUnload(paramUnload); } @SubscribeEvent
/*     */   public static void onWorldUnload(WorldEvent.Unload paramUnload) { EventHandler$.MODULE$.onWorldUnload(paramUnload); } public static boolean isItTime() { return EventHandler$.MODULE$.isItTime(); } @SubscribeEvent
/*     */   public static void onPickup(PlayerEvent.ItemPickupEvent paramItemPickupEvent) { EventHandler$.MODULE$.onPickup(paramItemPickupEvent); } @SubscribeEvent
/*     */   public static void onCrafting(PlayerEvent.ItemCraftedEvent paramItemCraftedEvent) { EventHandler$.MODULE$.onCrafting(paramItemCraftedEvent); } public static ItemInfo tablet() { return EventHandler$.MODULE$.tablet(); } public static ItemInfo robot() { return EventHandler$.MODULE$.robot(); } public static ItemInfo navigationUpgrade() { return EventHandler$.MODULE$.navigationUpgrade(); } public static ItemInfo mcu() { return EventHandler$.MODULE$.mcu(); } public static ItemInfo floppy() { return EventHandler$.MODULE$.floppy(); } public static ItemInfo eeprom() {
/*     */     return EventHandler$.MODULE$.eeprom();
/*     */   } public static ItemInfo drone() {
/*     */     return EventHandler$.MODULE$.drone();
/*     */   } @SubscribeEvent
/*     */   public static void onEntityJoinWorld(EntityJoinWorldEvent paramEntityJoinWorldEvent) {
/*     */     EventHandler$.MODULE$.onEntityJoinWorld(paramEntityJoinWorldEvent);
/*     */   } @SubscribeEvent
/*     */   public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent paramPlayerLoggedOutEvent) {
/*     */     EventHandler$.MODULE$.onPlayerLogout(paramPlayerLoggedOutEvent);
/*     */   } @SubscribeEvent
/*     */   public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent paramPlayerChangedDimensionEvent) {
/*     */     EventHandler$.MODULE$.onPlayerChangedDimension(paramPlayerChangedDimensionEvent);
/*     */   } @SubscribeEvent
/*     */   public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent paramPlayerRespawnEvent) {
/*     */     EventHandler$.MODULE$.onPlayerRespawn(paramPlayerRespawnEvent);
/*     */   } @SubscribeEvent
/*     */   public static void onBlockBreak(BlockEvent.BreakEvent paramBreakEvent) {
/*     */     EventHandler$.MODULE$.onBlockBreak(paramBreakEvent);
/*     */   } @SubscribeEvent
/*     */   public static void clientLoggedIn(FMLNetworkEvent.ClientConnectedToServerEvent paramClientConnectedToServerEvent) {
/*     */     EventHandler$.MODULE$.clientLoggedIn(paramClientConnectedToServerEvent);
/*     */   } @SubscribeEvent
/*     */   public static void playerLoggedIn(PlayerEvent.PlayerLoggedInEvent paramPlayerLoggedInEvent) {
/*     */     EventHandler$.MODULE$.playerLoggedIn(paramPlayerLoggedInEvent);
/*     */   } @SubscribeEvent
/*     */   public static void onClientTick(TickEvent.ClientTickEvent paramClientTickEvent) {
/*     */     EventHandler$.MODULE$.onClientTick(paramClientTickEvent);
/*     */   } @SubscribeEvent
/*     */   public static Object onServerTick(TickEvent.ServerTickEvent paramServerTickEvent) {
/*     */     return EventHandler$.MODULE$.onServerTick(paramServerTickEvent);
/*     */   } public static void scheduleWirelessRedstone(RedstoneWireless paramRedstoneWireless) {
/*     */     EventHandler$.MODULE$.scheduleWirelessRedstone(paramRedstoneWireless);
/*     */   } @Method(modid = "IC2-Classic")
/*     */   public static void scheduleIC2Add(IndustrialCraft2Classic paramIndustrialCraft2Classic) {
/*     */     EventHandler$.MODULE$.scheduleIC2Add(paramIndustrialCraft2Classic);
/*     */   } @Method(modid = "IC2")
/*     */   public static void scheduleIC2Add(IndustrialCraft2Experimental paramIndustrialCraft2Experimental) {
/*     */     EventHandler$.MODULE$.scheduleIC2Add(paramIndustrialCraft2Experimental);
/*     */   } @Method(modid = "appliedenergistics2")
/*     */   public static void scheduleAE2Add(AppliedEnergistics2 paramAppliedEnergistics2) {
/*     */     EventHandler$.MODULE$.scheduleAE2Add(paramAppliedEnergistics2);
/*     */   } @Method(modid = "ForgeMultipart")
/*     */   public static void scheduleFMP(Function0<TileEntity> paramFunction0) {
/*     */     EventHandler$.MODULE$.scheduleFMP(paramFunction0);
/*     */   } public static void scheduleClient(Function0<BoxedUnit> paramFunction0) {
/*     */     EventHandler$.MODULE$.scheduleClient(paramFunction0);
/*     */   } public static void scheduleServer(Function0<BoxedUnit> paramFunction0) {
/*     */     EventHandler$.MODULE$.scheduleServer(paramFunction0);
/*     */   } public static void scheduleServer(TileEntity paramTileEntity) {
/*     */     EventHandler$.MODULE$.scheduleServer(paramTileEntity);
/*     */   } public static void unscheduleClose(Machine paramMachine) {
/*     */     EventHandler$.MODULE$.unscheduleClose(paramMachine);
/*     */   } public static void scheduleClose(Machine paramMachine) {
/*     */     EventHandler$.MODULE$.scheduleClose(paramMachine);
/*     */   } public static void addKeyboard(Keyboard paramKeyboard) {
/*     */     EventHandler$.MODULE$.addKeyboard(paramKeyboard);
/*     */   } public static void onRobotStopped(Robot paramRobot) {
/*     */     EventHandler$.MODULE$.onRobotStopped(paramRobot);
/*     */   } public static void onRobotStart(Robot paramRobot) {
/*     */     EventHandler$.MODULE$.onRobotStart(paramRobot);
/*  78 */   } public final class EventHandler$$anonfun$scheduleServer$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } private final TileEntity tileEntity$1; public void apply$mcV$sp() { Network.joinOrCreateNetwork(this.tileEntity$1); }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleServer$1(TileEntity tileEntity$1) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$scheduleFMP$1
/*     */     extends AbstractFunction0.mcV.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final Function0 tileEntity$2;
/*     */ 
/*     */     
/*     */     public final void apply() {
/*  97 */       apply$mcV$sp(); } public void apply$mcV$sp() { Network.joinOrCreateNetwork((TileEntity)this.tileEntity$2.apply()); }
/*     */     
/*     */     public EventHandler$$anonfun$scheduleFMP$1(Function0 tileEntity$2) {} }
/*     */   
/*     */   public final class EventHandler$$anonfun$scheduleAE2Add$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final AppliedEnergistics2 tileEntity$3;
/*     */     
/* 104 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!((TileEntity)this.tileEntity$3).func_145837_r())
/* 105 */         this.tileEntity$3.getGridNode(ForgeDirection.UNKNOWN).updateState();  }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleAE2Add$1(AppliedEnergistics2 tileEntity$3) {} }
/*     */   
/*     */   public final class EventHandler$$anonfun$scheduleIC2Add$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IndustrialCraft2Experimental tileEntity$4;
/*     */     private final IndustrialCraft2Experimental x2$1;
/*     */     
/* 115 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!this.tileEntity$4.addedToIC2PowerGrid() && !((TileEntity)this.tileEntity$4).func_145837_r()) {
/* 116 */         MinecraftForge.EVENT_BUS.post((Event)new EnergyTileLoadEvent((IEnergyTile)this.x2$1));
/* 117 */         this.tileEntity$4.addedToIC2PowerGrid_$eq(true);
/*     */       }  }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleIC2Add$1(IndustrialCraft2Experimental tileEntity$4, IndustrialCraft2Experimental x2$1) {}
/*     */   }
/*     */   
/*     */   public final class EventHandler$$anonfun$scheduleIC2Add$2 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IndustrialCraft2Classic tileEntity$5;
/*     */     private final IndustrialCraft2Classic x2$2;
/*     */     
/* 129 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (!this.tileEntity$5.addedToIC2PowerGrid() && !((TileEntity)this.tileEntity$5).func_145837_r()) {
/* 130 */         MinecraftForge.EVENT_BUS.post((Event)new EnergyTileLoadEvent((IEnergyTile)this.x2$2));
/* 131 */         this.tileEntity$5.addedToIC2PowerGrid_$eq(true);
/*     */       }  }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleIC2Add$2(IndustrialCraft2Classic tileEntity$5, IndustrialCraft2Classic x2$2) {} }
/*     */   
/*     */   public final class EventHandler$$anonfun$scheduleWirelessRedstone$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final RedstoneWireless rs$1;
/*     */     
/* 140 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { if (this.rs$1.node().network() != null) {
/* 141 */         WirelessRedstone$.MODULE$.resetRedstone(this.rs$1);
/* 142 */         WirelessRedstone$.MODULE$.addReceiver(this.rs$1);
/* 143 */         WirelessRedstone$.MODULE$.updateOutput(this.rs$1);
/*     */       }  }
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$scheduleWirelessRedstone$1(RedstoneWireless rs$1) {} }
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onServerTick$1 extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Function0 callback) {
/*     */       
/* 155 */       try { callback.apply$mcV$sp(); }
/* 156 */       finally { Exception exception = null; }
/*     */     
/*     */     } }
/*     */   public final class EventHandler$$anonfun$onServerTick$2 extends AbstractFunction1<Robot, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer invalid$1;
/*     */     public EventHandler$$anonfun$onServerTick$2(ArrayBuffer invalid$1) {}
/*     */     
/*     */     public final Object apply(Robot robot) {
/* 163 */       robot.machine().update(); return robot.func_145837_r() ? this.invalid$1.$plus$eq(robot) : ((robot.world() == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT);
/*     */     } }
/*     */   
/*     */   public final class EventHandler$$anonfun$onServerTick$3 extends AbstractFunction1<Machine, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ArrayBuffer closed$1;
/*     */     
/*     */     public final void apply(Machine machine) {
/* 170 */       if (machine.tryClose()) {
/* 171 */         this.closed$1.$plus$eq(machine);
/* 172 */         if ((machine.host().world() == null || !ExtendedWorld$.MODULE$.extendedWorld(machine.host().world()).blockExists(BlockPosition$.MODULE$.apply((EnvironmentHost)machine.host()))) && 
/* 173 */           machine.node() != null) machine.node().remove(); 
/*     */       } 
/*     */     }
/*     */     
/*     */     public EventHandler$$anonfun$onServerTick$3(ArrayBuffer closed$1) {} }
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onClientTick$1
/*     */     extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Function0 callback) {
/*     */       
/* 186 */       try { callback.apply$mcV$sp(); }
/* 187 */       finally { Exception exception = null; }
/*     */     
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
/*     */   public final class EventHandler$$anonfun$clientLoggedIn$1
/*     */     extends AbstractFunction0.mcV.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply()
/*     */     {
/* 220 */       apply$mcV$sp(); } public void apply$mcV$sp() { Sound$.MODULE$.stopLoop(null); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onPlayerRespawn$1
/*     */     extends AbstractFunction1<Keyboard, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final PlayerEvent.PlayerRespawnEvent e$1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(Keyboard x$1) {
/* 241 */       x$1.releasePressedKeys(this.e$1.player);
/*     */     }
/*     */     public EventHandler$$anonfun$onPlayerRespawn$1(PlayerEvent.PlayerRespawnEvent e$1) {} }
/*     */   public final class EventHandler$$anonfun$onPlayerChangedDimension$1 extends AbstractFunction1<Keyboard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.PlayerChangedDimensionEvent e$2;
/*     */     public final void apply(Keyboard x$2) {
/* 246 */       x$2.releasePressedKeys(this.e$2.player);
/*     */     }
/*     */     public EventHandler$$anonfun$onPlayerChangedDimension$1(PlayerEvent.PlayerChangedDimensionEvent e$2) {} }
/*     */   public final class EventHandler$$anonfun$onPlayerLogout$1 extends AbstractFunction1<Keyboard, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.PlayerLoggedOutEvent e$3;
/*     */     public final void apply(Keyboard x$3) {
/* 251 */       x$3.releasePressedKeys(this.e$3.player);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$onPlayerLogout$1(PlayerEvent.PlayerLoggedOutEvent e$3) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onCrafting$1
/*     */     extends AbstractFunction1<ItemStack, Option<ItemStack>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final PlayerEvent.ItemCraftedEvent e$4;
/*     */ 
/*     */ 
/*     */     
/*     */     public EventHandler$$anonfun$onCrafting$1(PlayerEvent.ItemCraftedEvent e$4) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final Option<ItemStack> apply(ItemStack stack) {
/*     */       None$ none$;
/* 281 */       Option option = Option$.MODULE$.apply(Driver.driverFor(this.e$4.crafting));
/* 282 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); Option option1 = Option$.MODULE$.apply(ItemStack.func_77949_a(driver.dataTag(stack).func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("map").toString()))); }
/* 283 */       else { none$ = None$.MODULE$; }
/*     */       
/*     */       return (Option<ItemStack>)none$;
/*     */     } }
/*     */   public final class EventHandler$$anonfun$onCrafting$2 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 289 */     public final Option<ItemStack> apply(ItemStack stack) { return Predef$.MODULE$.refArrayOps((Object[])(new MicrocontrollerData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3(this)); } public final class EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$4) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$4) == null) { Items.get(x$4); if (itemInfo != null); } else if (Items.get(x$4).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$2$$anonfun$apply$3(EventHandler$$anonfun$onCrafting$2 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$3 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 294 */     public final Option<ItemStack> apply(ItemStack stack) { return Predef$.MODULE$.refArrayOps((Object[])(new MicrocontrollerData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4(this)); } public final class EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$5) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$5) == null) { Items.get(x$5); if (itemInfo != null); } else if (Items.get(x$5).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$3$$anonfun$apply$4(EventHandler$$anonfun$onCrafting$3 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$4 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 299 */     public final Option<ItemStack> apply(ItemStack stack) { return Predef$.MODULE$.refArrayOps((Object[])(new RobotData(stack)).components()).find((Function1)new EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5(this)); } public final class EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$6) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$6) == null) { Items.get(x$6); if (itemInfo != null); } else if (Items.get(x$6).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$4$$anonfun$apply$5(EventHandler$$anonfun$onCrafting$4 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$onCrafting$5 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/* 304 */     public final Option<ItemStack> apply(ItemStack stack) { return Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])(new TabletData(stack)).items()).collect((PartialFunction)new EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class)))).find((Function1)new EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6(this)); } public final class EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack item = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } public EventHandler$$anonfun$onCrafting$5$$anonfun$apply$1(EventHandler$$anonfun$onCrafting$5 $outer) {} } public final class EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$7) { ItemInfo itemInfo = EventHandler$.MODULE$.eeprom(); if (Items.get(x$7) == null) { Items.get(x$7); if (itemInfo != null); } else if (Items.get(x$7).equals(itemInfo))
/*     */         {  }
/*     */          }
/*     */        public EventHandler$$anonfun$onCrafting$5$$anonfun$apply$6(EventHandler$$anonfun$onCrafting$5 $outer) {} } }
/*     */   public final class EventHandler$$anonfun$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final PlayerEvent.ItemCraftedEvent e$4;
/* 309 */     public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.e$4.craftMatrix.func_70301_a(i))); } public EventHandler$$anonfun$1(PlayerEvent.ItemCraftedEvent e$4) {} } public final class EventHandler$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) {
/* 310 */       return Wrench$.MODULE$.isWrench(stack);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$3
/*     */     extends AbstractFunction1<EntityItem, Option<ItemStack>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Option<ItemStack> apply(EntityItem e) {
/* 342 */       return Option$.MODULE$.apply(e.func_92059_d());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$recraft$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final PlayerEvent.ItemCraftedEvent e$5;
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemInfo item$1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final Function1 callback$1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(int slot) {
/* 372 */       apply$mcVI$sp(slot);
/* 373 */     } public EventHandler$$anonfun$recraft$1(PlayerEvent.ItemCraftedEvent e$5, ItemInfo item$1, Function1 callback$1) {} public void apply$mcVI$sp(int slot) { ItemStack stack = this.e$5.craftMatrix.func_70301_a(slot);
/* 374 */       ItemInfo itemInfo = this.item$1; if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 375 */         { ((Option)this.callback$1.apply(stack)).foreach((Function1)new EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(this)); return; }  return; }  ((Option)this.callback$1.apply(stack)).foreach((Function1)new EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(this)); } public final class EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public EventHandler$$anonfun$recraft$1$$anonfun$apply$mcVI$sp$1(EventHandler$$anonfun$recraft$1 $outer) {} public final void apply(ItemStack extra) {
/* 376 */         InventoryUtils$.MODULE$.addToPlayerInventory(extra, this.$outer.e$5.player, InventoryUtils$.MODULE$.addToPlayerInventory$default$3());
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onWorldUnload$1
/*     */     extends AbstractPartialFunction<Object, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final <A1, B1> B1 applyOrElse(Object x2, Function1 default)
/*     */     {
/* 391 */       Object object2, object1 = x2;
/* 392 */       if (object1 instanceof TileEntity) { Object object = object1; ((TileEntity)object).dispose(); object2 = BoxedUnit.UNIT; } else { object2 = default.apply(x2); }  return (B1)object2; } public final boolean isDefinedAt(Object x2) { boolean bool; Object object = x2; if (object instanceof TileEntity) { bool = true; }
/*     */       else { bool = false; }
/* 394 */        return bool; } } public final class EventHandler$$anonfun$onWorldUnload$2 extends AbstractPartialFunction<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x3, Function1 default) { Object object2, object1 = x3;
/* 395 */       if (object1 instanceof MachineHost) { Object object = object1; object2 = BoxesRunTime.boxToBoolean(((MachineHost)object).machine().stop()); } else { object2 = default.apply(x3); }  return (B1)object2; } public final boolean isDefinedAt(Object x3) { boolean bool; Object object = x3; if (object instanceof MachineHost) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*     */       
/*     */       return bool; }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$onChunkUnload$1
/*     */     extends AbstractFunction1<List<?>, Buffer<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Buffer<Object> apply(List x$8) {
/* 408 */       return (Buffer<Object>)WrapAsScala$.MODULE$.asScalaBuffer(x$8).collect((PartialFunction)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2(this), Buffer$.MODULE$.canBuildFrom()); } public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 extends AbstractPartialFunction<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x4, Function1 default) { Object object2, object1 = x4;
/* 409 */         if (object1 instanceof MachineHost) { Object object = object1; Machine machine = ((MachineHost)object).machine();
/* 410 */           if (machine instanceof Machine) { Machine machine1 = (Machine)machine; EventHandler$.MODULE$.scheduleClose(machine1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 411 */           else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */            object2 = BoxedUnit.UNIT; }
/* 413 */         else if (object1 instanceof Rack) { Object object = object1;
/*     */ 
/*     */           
/* 416 */           object2 = ((TraversableLike)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), ((IInventory)object).func_70302_i_()).map((Function1)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2(this, object), IndexedSeq$.MODULE$.canBuildFrom())).collect((PartialFunction)new EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1(this), IndexedSeq$.MODULE$.canBuildFrom()); } else { object2 = default.apply(x4); }  return (B1)object2; } public final boolean isDefinedAt(Object x4) { boolean bool; Object object = x4; if (object instanceof MachineHost) { bool = true; } else if (object instanceof Rack) { bool = true; } else { bool = false; }  return bool; } public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2(EventHandler$$anonfun$onChunkUnload$1 $outer) {} public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2 extends AbstractFunction1<Object, RackMountable> implements Serializable { public static final long serialVersionUID = 0L; private final Object x3$1; public final RackMountable apply(int x$1) { return ((Rack)this.x3$1).getMountable(x$1); } public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$2(EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 $outer, Object x3$1) {} } public final class EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1 extends AbstractPartialFunction<RackMountable, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends RackMountable, B1> B1 applyOrElse(RackMountable x5, Function1 default) { RackMountable rackMountable = x5; if (rackMountable instanceof Server) { Server server = (Server)rackMountable; if (server.machine() != null) return (B1)BoxesRunTime.boxToBoolean(server.machine().stop());  }  return (B1)default.apply(x5); } public final boolean isDefinedAt(RackMountable x5) { RackMountable rackMountable = x5; if (rackMountable instanceof Server) { Server server = (Server)rackMountable; if (server.machine() != null) return true;  }  return false; }
/*     */ 
/*     */         
/*     */         public EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2$$anonfun$applyOrElse$1(EventHandler$$anonfun$onChunkUnload$1$$anonfun$apply$2 $outer) {} }
/*     */        }
/*     */   
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\EventHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */