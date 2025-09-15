/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.item.EntityMinecartContainer;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.ISidedInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.immutable.Range;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tUu!B\001\003\021\003Y\021AD%om\026tGo\034:z+RLGn\035\006\003\007\021\tA!\036;jY*\021QAB\001\003_\016T!a\002\005\002\007\rLGNC\001\n\003\ta\027n\001\001\021\0051iQ\"\001\002\007\0139\021\001\022A\b\003\035%sg/\0328u_JLX\013^5mgN\021Q\002\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]iA\021\001\r\002\rqJg.\033;?)\005Y\001\"\002\016\016\t\003Y\022\001\0055bm\026\034\026-\\3Ji\026lG+\0379f)\021ardK\027\021\005Ei\022B\001\020\023\005\035\021un\0347fC:DQ\001I\rA\002\005\naa\035;bG.\f\005C\001\022*\033\005\031#B\001\023&\003\021IG/Z7\013\005\031:\023!C7j]\026\034'/\0314u\025\005A\023a\0018fi&\021!f\t\002\n\023R,Wn\025;bG.DQ\001L\rA\002\005\naa\035;bG.\024\005b\002\030\032!\003\005\r\001H\001\tG\",7m\033(C)\")\001'\004C\001c\005\t\022N\034<f]R|'/_*pkJ\034W-\021;\025\005IB\004cA\t4k%\021AG\005\002\007\037B$\030n\0348\021\00511\024BA\034\003\005=IeN^3oi>\024\030pU8ve\016,\007\"B\0350\001\004Q\024\001\0039pg&$\030n\0348\021\0051Y\024B\001\037\003\0055\021En\\2l!>\034\030\016^5p]\")a(\004C\001\005Y\021N\034<f]R|'/_!u)\t\001u\tE\002\022g\005\003\"AQ#\016\003\rS!\001R\023\002\023%tg/\0328u_JL\030B\001$D\005)I\025J\034<f]R|'/\037\005\006su\002\rA\017\005\006\0236!\tAS\001\030S:\034XM\035;J]R|\027J\034<f]R|'/_*m_R$r\001H&N\035j{\026\rC\003M\021\002\007\021%A\003ti\006\0347\016C\003E\021\002\007\021\tC\003P\021\002\007\001+\001\003tS\022,\007cA\t4#B\021!\013W\007\002'*\0211\001\026\006\003+Z\013aaY8n[>t'BA,(\0039i\027N\\3de\0064GOZ8sO\026L!!W*\003\035\031{'oZ3ESJ,7\r^5p]\")1\f\023a\0019\006!1\017\\8u!\t\tR,\003\002_%\t\031\021J\034;\t\017\001D\005\023!a\0019\006)A.[7ji\"9!\r\023I\001\002\004a\022\001C:j[Vd\027\r^3\t\013\021lA\021A3\0021\025DHO]1di\032\023x.\\%om\026tGo\034:z'2|G\017\006\004]M:|\007/\035\005\006O\016\004\r\001[\001\tG>t7/^7feB!\021#[\021l\023\tQ'CA\005Gk:\034G/[8ocA\021\021\003\\\005\003[J\021A!\0268ji\")Ai\031a\001\003\")qj\031a\001#\")1l\031a\0019\"9\001m\031I\001\002\004a\006\"B:\016\t\003!\030aE5og\026\024H/\0238u_&sg/\0328u_JLHc\002\017vm^D\030P\037\005\006\031J\004\r!\t\005\006\tJ\004\r!\021\005\b\037J\004\n\0211\001Q\021\035\001'\017%AA\002qCqA\031:\021\002\003\007A\004C\004|eB\005\t\031\001?\002\013Mdw\016^:\021\007E\031T\020\005\003\003\033afbA@\002\n9!\021\021AA\004\033\t\t\031AC\002\002\006)\ta\001\020:p_Rt\024\"A\n\n\007\005-!#A\004qC\016\\\027mZ3\n\t\005=\021\021\003\002\t\023R,'/\0312mK*\031\0211\002\n\t\017\005UQ\002\"\001\002\030\0059R\r\037;sC\016$\030I\\=Ge>l\027J\034<f]R|'/\037\013\n9\006e\0211DA\017\003?AaaZA\n\001\004A\007B\002#\002\024\001\007\021\t\003\004P\003'\001\r!\025\005\tA\006M\001\023!a\0019\"9\0211E\007\005\002\005\025\022\001F3yiJ\f7\r\036$s_6LeN^3oi>\024\030\020F\006\"\003O\tI#a\013\002.\005=\002B\002'\002\"\001\007\021\005\003\004E\003C\001\r!\021\005\007\037\006\005\002\031A)\t\021\t\f\t\003%AA\002qA\021\"!\r\002\"A\005\t\031\001\017\002\013\025D\030m\031;\t\017\005UR\002\"\001\0028\005)\022N\\:feRLe\016^8J]Z,g\016^8ss\006#Hc\003\017\002:\005m\022QHA \003\003Ba\001TA\032\001\004\t\003BB\035\0024\001\007!\b\003\005P\003g\001\n\0211\001Q\021!\001\0271\007I\001\002\004a\006\002\0032\0024A\005\t\031\001\017\006\r\005\025S\002AA$\005%)\005\020\036:bGR|'\017\005\003\022\003\023b\026bAA&%\tIa)\0368di&|g\016\r\005\b\003\037jA\021AA)\003m9W\r^#yiJ\f7\r^8s\rJ|W.\0238wK:$xN]=BiRQ\0211KA,\0033\nY&!\030\021\t\005U\0231I\007\002\033!1q-!\024A\002!Da!OA'\001\004Q\004BB(\002N\001\007\021\013\003\005a\003\033\002\n\0211\001]\021\035\t\t'\004C\001\003G\n!\004\036:b]N4WM\035\"fi^,WM\\%om\026tGo\034:jKN$2\002XA3\003S\ni'!\035\002v!9\021qMA0\001\004\t\025AB:pkJ\034W\rC\004\002l\005}\003\031A)\002\025M|WO]2f'&$W\rC\004\002p\005}\003\031A!\002\tMLgn\033\005\b\003g\ny\0061\001Q\003!\031\030N\\6TS\022,\007\002\0031\002`A\005\t\031\001/\t\017\005eT\002\"\001\002|\005yBO]1og\032,'OQ3uo\026,g.\0238wK:$xN]5fgNcw\016^:\025\037q\013i(a \002\002\006\025\025qQAE\003\037Cq!a\032\002x\001\007\021\tC\004\002l\005]\004\031A)\t\017\005\r\025q\017a\0019\006Q1o\\;sG\026\034Fn\034;\t\017\005=\024q\017a\001\003\"9\0211OA<\001\004\001\006\002CAF\003o\002\r!!$\002\021MLgn[*m_R\0042!E\032]\021!\001\027q\017I\001\002\004a\006bBAJ\033\021\005\021QS\001 O\026$HK]1og\032,'OQ3uo\026,g.\0238wK:$xN]5fg\006#H\003DA*\003/\013I*a'\002\036\006}\005bBA4\003#\003\rA\017\005\b\003W\n\t\n1\001R\021\035\ty'!%A\002iBq!a\035\002\022\002\007\001\013\003\005a\003#\003\n\0211\001]\021\035\t\031+\004C\001\003K\013AeZ3u)J\fgn\0354fe\n+Go^3f]&sg/\0328u_JLWm]*m_R\034\030\t\036\013\021\003'\n9+a+\002.\006=\0261WA[\003oCq!!+\002\"\002\007!(A\005t_V\0248-\032)pg\"9\0211NAQ\001\004\t\006bBAB\003C\003\r\001\030\005\b\003c\013\t\0131\001;\003\035\031\030N\\6Q_NDq!a\035\002\"\002\007\001\013\003\005\002\f\006\005\006\031AAG\021!\001\027\021\025I\001\002\004a\006bBA^\033\021\005\021QX\001\tIJ|\007o\0257piRYA$a0\002B\006\r\027QYAe\021\031I\024\021\030a\001u!1A)!/A\002\005CaaWA]\001\004a\006bBAd\003s\003\r\001X\001\006G>,h\016\036\005\n\003\027\fI\f%AA\002A\013\021\002Z5sK\016$\030n\0348\t\017\005=W\002\"\001\002R\006aAM]8q\0032d7\013\\8ugR)1.a5\002V\"1\021(!4A\002iBa\001RAg\001\004\t\005bBAm\033\021\005\0211\\\001\025C\022$Gk\034)mCf,'/\0238wK:$xN]=\025\017-\fi.a8\002r\"1A*a6A\002\005B\001\"!9\002X\002\007\0211]\001\007a2\f\0270\032:\021\t\005\025\030Q^\007\003\003OTA!!9\002j*\031\0211^\023\002\r\025tG/\033;z\023\021\ty/a:\003\031\025sG/\033;z!2\f\0270\032:\t\023\005M\030q\033I\001\002\004a\022\001D:qC^t\027J\\,pe2$\007bBA|\033\021\005\021\021`\001\022gB\fwO\\*uC\016\\\027J\\,pe2$GCCA~\005\013\0219A!\003\003\fA!\021Q B\001\033\t\tyPC\002%\003SLAAa\001\002\000\nQQI\034;jifLE/Z7\t\re\n)\0201\001;\021\031a\025Q\037a\001C!I\0211ZA{!\003\005\r\001\025\005\013\005\033\t)\020%AA\002\t=\021!\003<bY&$\027\r^8s!\021\t2G!\005\021\013EI\0271 \017\t\023\tUQ\"%A\005\002\t]\021AH1eIR{\007\013\\1zKJLeN^3oi>\024\030\020\n3fM\006,H\016\036\0234+\t\021IBK\002\035\0057Y#A!\b\021\t\t}!\021F\007\003\005CQAAa\t\003&\005IQO\\2iK\016\\W\r\032\006\004\005O\021\022AC1o]>$\030\r^5p]&!!1\006B\021\005E)hn\0315fG.,GMV1sS\006t7-\032\005\n\005_i\021\023!C\001\005c\t!\003\032:paNcw\016\036\023eK\032\fW\017\034;%kU\021!1\007\026\004!\nm\001\"\003B\034\033E\005I\021\001B\031\003m\031\b/Y<o'R\f7m[%o/>\024H\016\032\023eK\032\fW\017\034;%g!I!1H\007\022\002\023\005!QH\001\034gB\fwO\\*uC\016\\\027J\\,pe2$G\005Z3gCVdG\017\n\033\026\005\t}\"\006\002B\b\0057A\021Ba\021\016#\003%\tA!\r\002?%t7/\032:u\023:$x.\0238wK:$xN]=Bi\022\"WMZ1vYR$3\007C\005\003H5\t\n\021\"\001\003J\005y\022N\\:feRLe\016^8J]Z,g\016^8ss\006#H\005Z3gCVdG\017\n\033\026\005\t-#f\001/\003\034!I!qJ\007\022\002\023\005!qC\001 S:\034XM\035;J]R|\027J\034<f]R|'/_!uI\021,g-Y;mi\022*\004\"\003B*\033E\005I\021\001B%\003\005Jgn]3si&sGo\\%om\026tGo\034:z'2|G\017\n3fM\006,H\016\036\0236\021%\0219&DI\001\n\003\0219\"A\021j]N,'\017^%oi>LeN^3oi>\024\030p\0257pi\022\"WMZ1vYR$c\007C\005\003\\5\t\n\021\"\001\0032\005i\022N\\:feRLe\016^8J]Z,g\016^8ss\022\"WMZ1vYR$3\007C\005\003`5\t\n\021\"\001\003J\005i\022N\\:feRLe\016^8J]Z,g\016^8ss\022\"WMZ1vYR$C\007C\005\003d5\t\n\021\"\001\003\030\005i\022N\\:feRLe\016^8J]Z,g\016^8ss\022\"WMZ1vYR$S\007C\005\003h5\t\n\021\"\001\003j\005i\022N\\:feRLe\016^8J]Z,g\016^8ss\022\"WMZ1vYR$c'\006\002\003l)\032APa\007\t\023\t=T\"%A\005\002\t]\021AH3yiJ\f7\r\036$s_6LeN^3oi>\024\030\020\n3fM\006,H\016\036\0235\021%\021\031(DI\001\n\003\0219\"\001\020fqR\024\030m\031;Ge>l\027J\034<f]R|'/\037\023eK\032\fW\017\034;%k!I!qO\007\022\002\023\005!qC\001\033Q\0064XmU1nK&#X-\034+za\026$C-\0324bk2$He\r\005\n\005wj\021\023!C\001\005\023\nafZ3u)J\fgn\0354fe\n+Go^3f]&sg/\0328u_JLWm]*m_R\034\030\t\036\023eK\032\fW\017\034;%o!I!qP\007\022\002\023\005!\021J\001*O\026$HK]1og\032,'OQ3uo\026,g.\0238wK:$xN]5fg\006#H\005Z3gCVdG\017J\033\t\023\t\rU\"%A\005\002\t%\023!I3yiJ\f7\r^!os\032\023x.\\%om\026tGo\034:zI\021,g-Y;mi\022\"\004\"\003BD\033E\005I\021\001B%\003\t*\007\020\036:bGR4%o\\7J]Z,g\016^8ssNcw\016\036\023eK\032\fW\017\034;%k!I!1R\007\022\002\023\005!\021J\001&O\026$X\t\037;sC\016$xN\035$s_6LeN^3oi>\024\0300\021;%I\0264\027-\0367uIQB\021Ba$\016#\003%\tA!\023\002IQ\024\030M\\:gKJ\024U\r^<fK:LeN^3oi>\024\030.Z:%I\0264\027-\0367uIUB\021Ba%\016#\003%\tA!\023\002SQ\024\030M\\:gKJ\024U\r^<fK:LeN^3oi>\024\030.Z:TY>$8\017\n3fM\006,H\016\036\0238\001") public final class InventoryUtils
/*     */ {
/*     */   public static int transferBetweenInventoriesSlots$default$7() { return InventoryUtils$.MODULE$.transferBetweenInventoriesSlots$default$7(); }
/*     */   public static int transferBetweenInventories$default$5() { return InventoryUtils$.MODULE$.transferBetweenInventories$default$5(); }
/*     */   public static int getExtractorFromInventoryAt$default$4() { return InventoryUtils$.MODULE$.getExtractorFromInventoryAt$default$4(); }
/*     */   public static int extractFromInventorySlot$default$5() { return InventoryUtils$.MODULE$.extractFromInventorySlot$default$5(); }
/*     */   public static int extractAnyFromInventory$default$4() { return InventoryUtils$.MODULE$.extractAnyFromInventory$default$4(); } public static int getTransferBetweenInventoriesAt$default$5() { return InventoryUtils$.MODULE$.getTransferBetweenInventoriesAt$default$5(); } public static int getTransferBetweenInventoriesSlotsAt$default$7() { return InventoryUtils$.MODULE$.getTransferBetweenInventoriesSlotsAt$default$7(); } public static boolean haveSameItemType$default$3() { return InventoryUtils$.MODULE$.haveSameItemType$default$3(); } public static boolean extractFromInventory$default$5() { return InventoryUtils$.MODULE$.extractFromInventory$default$5(); } public static boolean extractFromInventory$default$4() { return InventoryUtils$.MODULE$.extractFromInventory$default$4(); } public static Option<Iterable<Object>> insertIntoInventory$default$6() { return InventoryUtils$.MODULE$.insertIntoInventory$default$6(); } public static boolean insertIntoInventory$default$5() { return InventoryUtils$.MODULE$.insertIntoInventory$default$5(); } public static int insertIntoInventory$default$4() { return InventoryUtils$.MODULE$.insertIntoInventory$default$4(); } public static Option<ForgeDirection> insertIntoInventory$default$3() { return InventoryUtils$.MODULE$.insertIntoInventory$default$3(); } public static boolean insertIntoInventorySlot$default$6() { return InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6(); } public static int insertIntoInventorySlot$default$5() { return InventoryUtils$.MODULE$.insertIntoInventorySlot$default$5(); } public static boolean insertIntoInventoryAt$default$5() { return InventoryUtils$.MODULE$.insertIntoInventoryAt$default$5(); } public static int insertIntoInventoryAt$default$4() { return InventoryUtils$.MODULE$.insertIntoInventoryAt$default$4(); } public static Option<ForgeDirection> insertIntoInventoryAt$default$3() { return InventoryUtils$.MODULE$.insertIntoInventoryAt$default$3(); } public static Option<Function1<EntityItem, Object>> spawnStackInWorld$default$4() { return InventoryUtils$.MODULE$.spawnStackInWorld$default$4(); } public static Option<ForgeDirection> spawnStackInWorld$default$3() { return InventoryUtils$.MODULE$.spawnStackInWorld$default$3(); } public static Option<ForgeDirection> dropSlot$default$5() { return InventoryUtils$.MODULE$.dropSlot$default$5(); } public static boolean addToPlayerInventory$default$3() { return InventoryUtils$.MODULE$.addToPlayerInventory$default$3(); } public static EntityItem spawnStackInWorld(BlockPosition paramBlockPosition, ItemStack paramItemStack, Option<ForgeDirection> paramOption, Option<Function1<EntityItem, Object>> paramOption1) { return InventoryUtils$.MODULE$.spawnStackInWorld(paramBlockPosition, paramItemStack, paramOption, paramOption1); } public static void addToPlayerInventory(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, boolean paramBoolean) { InventoryUtils$.MODULE$.addToPlayerInventory(paramItemStack, paramEntityPlayer, paramBoolean); } public static void dropAllSlots(BlockPosition paramBlockPosition, IInventory paramIInventory) { InventoryUtils$.MODULE$.dropAllSlots(paramBlockPosition, paramIInventory); } public static boolean dropSlot(BlockPosition paramBlockPosition, IInventory paramIInventory, int paramInt1, int paramInt2, Option<ForgeDirection> paramOption) { return InventoryUtils$.MODULE$.dropSlot(paramBlockPosition, paramIInventory, paramInt1, paramInt2, paramOption); } public static Function0<Object> getTransferBetweenInventoriesSlotsAt(BlockPosition paramBlockPosition1, ForgeDirection paramForgeDirection, int paramInt1, BlockPosition paramBlockPosition2, Option<ForgeDirection> paramOption, Option<Object> paramOption1, int paramInt2) { return InventoryUtils$.MODULE$.getTransferBetweenInventoriesSlotsAt(paramBlockPosition1, paramForgeDirection, paramInt1, paramBlockPosition2, paramOption, paramOption1, paramInt2); } public static Function0<Object> getTransferBetweenInventoriesAt(BlockPosition paramBlockPosition1, ForgeDirection paramForgeDirection, BlockPosition paramBlockPosition2, Option<ForgeDirection> paramOption, int paramInt) { return InventoryUtils$.MODULE$.getTransferBetweenInventoriesAt(paramBlockPosition1, paramForgeDirection, paramBlockPosition2, paramOption, paramInt); } public static int transferBetweenInventoriesSlots(IInventory paramIInventory1, ForgeDirection paramForgeDirection, int paramInt1, IInventory paramIInventory2, Option<ForgeDirection> paramOption, Option<Object> paramOption1, int paramInt2) { return InventoryUtils$.MODULE$.transferBetweenInventoriesSlots(paramIInventory1, paramForgeDirection, paramInt1, paramIInventory2, paramOption, paramOption1, paramInt2); } public static int transferBetweenInventories(IInventory paramIInventory1, ForgeDirection paramForgeDirection, IInventory paramIInventory2, Option<ForgeDirection> paramOption, int paramInt) { return InventoryUtils$.MODULE$.transferBetweenInventories(paramIInventory1, paramForgeDirection, paramIInventory2, paramOption, paramInt); } public static Function0<Object> getExtractorFromInventoryAt(Function1<ItemStack, BoxedUnit> paramFunction1, BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection, int paramInt) { return InventoryUtils$.MODULE$.getExtractorFromInventoryAt(paramFunction1, paramBlockPosition, paramForgeDirection, paramInt); } public static boolean insertIntoInventoryAt(ItemStack paramItemStack, BlockPosition paramBlockPosition, Option<ForgeDirection> paramOption, int paramInt, boolean paramBoolean) { return InventoryUtils$.MODULE$.insertIntoInventoryAt(paramItemStack, paramBlockPosition, paramOption, paramInt, paramBoolean); } public static ItemStack extractFromInventory(ItemStack paramItemStack, IInventory paramIInventory, ForgeDirection paramForgeDirection, boolean paramBoolean1, boolean paramBoolean2) { return InventoryUtils$.MODULE$.extractFromInventory(paramItemStack, paramIInventory, paramForgeDirection, paramBoolean1, paramBoolean2); } public static int extractAnyFromInventory(Function1<ItemStack, BoxedUnit> paramFunction1, IInventory paramIInventory, ForgeDirection paramForgeDirection, int paramInt) { return InventoryUtils$.MODULE$.extractAnyFromInventory(paramFunction1, paramIInventory, paramForgeDirection, paramInt); } public static boolean insertIntoInventory(ItemStack paramItemStack, IInventory paramIInventory, Option<ForgeDirection> paramOption, int paramInt, boolean paramBoolean, Option<Iterable<Object>> paramOption1) { return InventoryUtils$.MODULE$.insertIntoInventory(paramItemStack, paramIInventory, paramOption, paramInt, paramBoolean, paramOption1); } public static int extractFromInventorySlot(Function1<ItemStack, BoxedUnit> paramFunction1, IInventory paramIInventory, ForgeDirection paramForgeDirection, int paramInt1, int paramInt2) { return InventoryUtils$.MODULE$.extractFromInventorySlot(paramFunction1, paramIInventory, paramForgeDirection, paramInt1, paramInt2); } public static boolean insertIntoInventorySlot(ItemStack paramItemStack, IInventory paramIInventory, Option<ForgeDirection> paramOption, int paramInt1, int paramInt2, boolean paramBoolean) { return InventoryUtils$.MODULE$.insertIntoInventorySlot(paramItemStack, paramIInventory, paramOption, paramInt1, paramInt2, paramBoolean); } public static Option<IInventory> inventoryAt(BlockPosition paramBlockPosition) { return InventoryUtils$.MODULE$.inventoryAt(paramBlockPosition); } public static Option<InventorySource> inventorySourceAt(BlockPosition paramBlockPosition) { return InventoryUtils$.MODULE$.inventorySourceAt(paramBlockPosition); } public static boolean haveSameItemType(ItemStack paramItemStack1, ItemStack paramItemStack2, boolean paramBoolean) { return InventoryUtils$.MODULE$.haveSameItemType(paramItemStack1, paramItemStack2, paramBoolean); } public final class InventoryUtils$$anonfun$inventorySourceAt$1 extends AbstractFunction1<IInventory, BlockInventorySource> implements Serializable
/*     */   {
/*  39 */     public static final long serialVersionUID = 0L; public final BlockInventorySource apply(IInventory a) { return new BlockInventorySource(this.position$2, a); }
/*     */      private final BlockPosition position$2; public InventoryUtils$$anonfun$inventorySourceAt$1(BlockPosition position$2) {} } public final class InventoryUtils$$anonfun$inventorySourceAt$2 extends AbstractFunction1<Object, EntityMinecartContainer> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final EntityMinecartContainer apply(Object x$1) {
/*  42 */       return (EntityMinecartContainer)x$1; } } public final class InventoryUtils$$anonfun$inventorySourceAt$3 extends AbstractFunction1<EntityMinecartContainer, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  43 */     public final boolean apply(EntityMinecartContainer x$2) { return !x$2.field_70128_L; } } public final class InventoryUtils$$anonfun$inventorySourceAt$4 extends AbstractFunction1<EntityMinecartContainer, EntityInventorySource> implements Serializable { public static final long serialVersionUID = 0L; public final EntityInventorySource apply(EntityMinecartContainer a) {
/*  44 */       return new EntityInventorySource((Entity)a, (IInventory)a);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$inventoryAt$1
/*     */     extends AbstractFunction1<InventorySource, IInventory>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final IInventory apply(InventorySource a) {
/*  56 */       return a.inventory();
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$1
/*     */     extends AbstractFunction0<Iterable<Object>>
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final IInventory inventory$2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Option side$2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Iterable<Object> apply() {
/*     */       Range range;
/* 184 */       IInventory iInventory = this.inventory$2;
/* 185 */       if (iInventory instanceof ISidedInventory) { ISidedInventory iSidedInventory = (ISidedInventory)iInventory; Iterable iterable = Predef$.MODULE$.intArrayOps(iSidedInventory.func_94128_d(((Enum)this.side$2.getOrElse((Function0)new InventoryUtils$$anonfun$1$$anonfun$apply$1(this))).ordinal())).toIterable(); }
/* 186 */       else { range = RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.inventory$2.func_70302_i_()); }
/*     */       
/*     */       return (Iterable<Object>)range;
/*     */     }
/*     */     public InventoryUtils$$anonfun$1(IInventory inventory$2, Option side$2) {}
/*     */     public final class InventoryUtils$$anonfun$1$$anonfun$apply$1 extends AbstractFunction0<ForgeDirection> implements Serializable { public static final long serialVersionUID = 0L;
/*     */       public final ForgeDirection apply() {
/*     */         return ForgeDirection.UNKNOWN;
/*     */       }
/*     */       public InventoryUtils$$anonfun$1$$anonfun$apply$1(InventoryUtils$$anonfun$1 $outer) {} } }
/*     */   public final class InventoryUtils$$anonfun$insertIntoInventory$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$2;
/*     */     private final IInventory inventory$2;
/*     */     private final Option side$2;
/*     */     private final boolean simulate$2;
/*     */     private final BooleanRef success$1;
/*     */     private final IntRef remaining$1;
/*     */     
/* 204 */     public final void apply(int slot) { apply$mcVI$sp(slot); } public InventoryUtils$$anonfun$insertIntoInventory$1(ItemStack stack$2, IInventory inventory$2, Option side$2, boolean simulate$2, BooleanRef success$1, IntRef remaining$1) {} public void apply$mcVI$sp(int slot) {
/* 205 */       int stackSize = this.stack$2.field_77994_a;
/* 206 */       if (this.inventory$2.func_70301_a(slot) != null && InventoryUtils$.MODULE$.insertIntoInventorySlot(this.stack$2, this.inventory$2, this.side$2, slot, this.remaining$1.elem, this.simulate$2)) {
/* 207 */         this.remaining$1.elem -= stackSize - this.stack$2.field_77994_a;
/* 208 */         this.success$1.elem = true;
/*     */       } 
/*     */     } }
/*     */   public final class InventoryUtils$$anonfun$insertIntoInventory$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2; private final IInventory inventory$2; private final Option side$2; private final boolean simulate$2; private final BooleanRef success$1; private final IntRef remaining$1;
/*     */     
/* 213 */     public final void apply(int slot) { apply$mcVI$sp(slot); } public InventoryUtils$$anonfun$insertIntoInventory$2(ItemStack stack$2, IInventory inventory$2, Option side$2, boolean simulate$2, BooleanRef success$1, IntRef remaining$1) {} public void apply$mcVI$sp(int slot) {
/* 214 */       int stackSize = this.stack$2.field_77994_a;
/* 215 */       if (this.inventory$2.func_70301_a(slot) == null && InventoryUtils$.MODULE$.insertIntoInventorySlot(this.stack$2, this.inventory$2, this.side$2, slot, this.remaining$1.elem, this.simulate$2)) {
/* 216 */         this.remaining$1.elem -= stackSize - this.stack$2.field_77994_a;
/* 217 */         this.success$1.elem = true;
/*     */       } 
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$extractAnyFromInventory$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final Function1 consumer$1;
/*     */     
/*     */     private final IInventory inventory$4;
/*     */     
/*     */     private final ForgeDirection side$4;
/*     */     
/*     */     private final int limit$4;
/*     */     
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public final void apply(int slot)
/*     */     {
/* 241 */       apply$mcVI$sp(slot); } public InventoryUtils$$anonfun$extractAnyFromInventory$1(Function1 consumer$1, IInventory inventory$4, ForgeDirection side$4, int limit$4, Object nonLocalReturnKey1$1) {} public void apply$mcVI$sp(int slot) {
/* 242 */       int extracted = InventoryUtils$.MODULE$.extractFromInventorySlot(this.consumer$1, this.inventory$4, this.side$4, slot, this.limit$4);
/* 243 */       if (extracted > 0) {
/* 244 */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, extracted);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$extractFromInventory$1
/*     */     extends AbstractFunction1.mcZI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final ItemStack remaining$2;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(int slot)
/*     */     {
/* 265 */       return apply$mcZI$sp(slot); } public boolean apply$mcZI$sp(int slot) { return (this.remaining$2.field_77994_a > 0); } public InventoryUtils$$anonfun$extractFromInventory$1(ItemStack remaining$2) {} } public final class InventoryUtils$$anonfun$extractFromInventory$2 extends AbstractFunction1.mcII.sp implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$3; private final ForgeDirection side$3; public final boolean simulate$3; public final boolean exact$1; public final ItemStack remaining$2; public final int apply(int slot) { return apply$mcII$sp(slot); } public InventoryUtils$$anonfun$extractFromInventory$2(IInventory inventory$3, ForgeDirection side$3, boolean simulate$3, boolean exact$1, ItemStack remaining$2) {} public int apply$mcII$sp(int slot) {
/* 266 */       return InventoryUtils$.MODULE$.extractFromInventorySlot((Function1<ItemStack, BoxedUnit>)new InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1(this), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 274 */           this.inventory$3, this.side$3, slot, this.remaining$2.field_77994_a);
/*     */     }
/*     */     public final class InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1(InventoryUtils$$anonfun$extractFromInventory$2 $outer) {}
/*     */       public final void apply(ItemStack stackInInv) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: ifnull -> 135
/*     */         //   4: aload_0
/*     */         //   5: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   8: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   11: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   14: aload_1
/*     */         //   15: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   18: astore_2
/*     */         //   19: dup
/*     */         //   20: ifnonnull -> 31
/*     */         //   23: pop
/*     */         //   24: aload_2
/*     */         //   25: ifnull -> 38
/*     */         //   28: goto -> 135
/*     */         //   31: aload_2
/*     */         //   32: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   35: ifeq -> 135
/*     */         //   38: aload_0
/*     */         //   39: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   42: getfield exact$1 : Z
/*     */         //   45: ifeq -> 66
/*     */         //   48: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */         //   51: aload_0
/*     */         //   52: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   55: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   58: aload_1
/*     */         //   59: iconst_1
/*     */         //   60: invokevirtual haveSameItemType : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Z)Z
/*     */         //   63: ifeq -> 135
/*     */         //   66: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */         //   69: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */         //   72: aload_1
/*     */         //   73: getfield field_77994_a : I
/*     */         //   76: invokevirtual intWrapper : (I)I
/*     */         //   79: aload_0
/*     */         //   80: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   83: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   86: getfield field_77994_a : I
/*     */         //   89: invokevirtual min$extension : (II)I
/*     */         //   92: istore_3
/*     */         //   93: aload_0
/*     */         //   94: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   97: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   100: aload_0
/*     */         //   101: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   104: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   107: getfield field_77994_a : I
/*     */         //   110: iload_3
/*     */         //   111: isub
/*     */         //   112: putfield field_77994_a : I
/*     */         //   115: aload_0
/*     */         //   116: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   119: getfield simulate$3 : Z
/*     */         //   122: ifne -> 135
/*     */         //   125: aload_1
/*     */         //   126: aload_1
/*     */         //   127: getfield field_77994_a : I
/*     */         //   130: iload_3
/*     */         //   131: isub
/*     */         //   132: putfield field_77994_a : I
/*     */         //   135: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #267	-> 0
/*     */         //   #268	-> 69
/*     */         //   #269	-> 93
/*     */         //   #270	-> 115
/*     */         //   #271	-> 125
/*     */         //   #267	-> 135
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	136	0	this	Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1;
/*     */         //   0	136	1	stackInInv	Lnet/minecraft/item/ItemStack;
/*     */         //   93	43	3	transferred	I
/*     */       } } }
/*     */   public final class InventoryUtils$$anonfun$insertIntoInventoryAt$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; private final Option side$1; private final int limit$1; private final boolean simulate$1;
/*     */     public final boolean apply(IInventory x$3) {
/* 284 */       return InventoryUtils$.MODULE$.insertIntoInventory(this.stack$1, x$3, this.side$1, this.limit$1, this.simulate$1, InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/*     */     }
/*     */     public InventoryUtils$$anonfun$insertIntoInventoryAt$1(ItemStack stack$1, Option side$1, int limit$1, boolean simulate$1) {} }
/*     */   
/*     */   public final class InventoryUtils$$anonfun$getExtractorFromInventoryAt$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final Function1 consumer$2;
/*     */     private final ForgeDirection side$5;
/*     */     private final int limit$5;
/*     */     private final IInventory inventory$5;
/*     */     
/* 294 */     public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return InventoryUtils$.MODULE$.extractAnyFromInventory(this.consumer$2, this.inventory$5, this.side$5, this.limit$5); }
/*     */ 
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$getExtractorFromInventoryAt$1(Function1 consumer$2, ForgeDirection side$5, int limit$5, IInventory inventory$5) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$transferBetweenInventories$1
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final IInventory sink$1;
/*     */     
/*     */     private final Option sinkSide$3;
/*     */     private final int limit$6;
/*     */     
/*     */     public final void apply(ItemStack x$4) {
/* 314 */       InventoryUtils$.MODULE$.insertIntoInventory(x$4, this.sink$1, this.sinkSide$3, this.limit$6, InventoryUtils$.MODULE$.insertIntoInventory$default$5(), InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/*     */     }
/*     */     public InventoryUtils$$anonfun$transferBetweenInventories$1(IInventory sink$1, Option sinkSide$3, int limit$6) {} }
/*     */   public final class InventoryUtils$$anonfun$transferBetweenInventoriesSlots$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory sink$2;
/*     */     private final Option sinkSide$4;
/*     */     private final int limit$7;
/*     */     private final int explicitSinkSlot$1;
/*     */     
/*     */     public final void apply(ItemStack x$5) {
/* 323 */       InventoryUtils$.MODULE$.insertIntoInventorySlot(x$5, this.sink$2, this.sinkSide$4, this.explicitSinkSlot$1, this.limit$7, InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6());
/*     */     } public InventoryUtils$$anonfun$transferBetweenInventoriesSlots$1(IInventory sink$2, Option sinkSide$4, int limit$7, int explicitSinkSlot$1) {} } public final class InventoryUtils$$anonfun$transferBetweenInventoriesSlots$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory sink$2; private final Option sinkSide$4; private final int limit$7;
/*     */     public final void apply(ItemStack x$6) {
/* 326 */       InventoryUtils$.MODULE$.insertIntoInventory(x$6, this.sink$2, this.sinkSide$4, this.limit$7, InventoryUtils$.MODULE$.insertIntoInventory$default$5(), InventoryUtils$.MODULE$.insertIntoInventory$default$6());
/*     */     }
/*     */     public InventoryUtils$$anonfun$transferBetweenInventoriesSlots$2(IInventory sink$2, Option sinkSide$4, int limit$7) {} }
/*     */   
/*     */   public final class InventoryUtils$$anonfun$getTransferBetweenInventoriesAt$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ForgeDirection sourceSide$2;
/*     */     private final Option sinkSide$2;
/*     */     private final int limit$3;
/*     */     private final IInventory sourceInventory$1;
/*     */     private final IInventory sinkInventory$1;
/*     */     
/* 337 */     public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return InventoryUtils$.MODULE$.transferBetweenInventories(this.sourceInventory$1, this.sourceSide$2, this.sinkInventory$1, this.sinkSide$2, this.limit$3); }
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$getTransferBetweenInventoriesAt$1(ForgeDirection sourceSide$2, Option sinkSide$2, int limit$3, IInventory sourceInventory$1, IInventory sinkInventory$1) {} }
/*     */   
/*     */   public final class InventoryUtils$$anonfun$getTransferBetweenInventoriesSlotsAt$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ForgeDirection sourceSide$1;
/*     */     private final int sourceSlot$1;
/*     */     private final Option sinkSide$1;
/*     */     private final Option sinkSlot$1;
/*     */     private final int limit$2;
/*     */     private final IInventory sourceInventory$2;
/*     */     private final IInventory sinkInventory$2;
/*     */     
/* 351 */     public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return InventoryUtils$.MODULE$.transferBetweenInventoriesSlots(this.sourceInventory$2, this.sourceSide$1, this.sourceSlot$1, this.sinkInventory$2, this.sinkSide$1, this.sinkSlot$1, this.limit$2); }
/*     */ 
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$getTransferBetweenInventoriesSlotsAt$1(ForgeDirection sourceSide$1, int sourceSlot$1, Option sinkSide$1, Option sinkSlot$1, int limit$2, IInventory sourceInventory$2, IInventory sinkInventory$2) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$dropAllSlots$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final BlockPosition position$1;
/*     */     
/*     */     private final IInventory inventory$1;
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$dropAllSlots$1(BlockPosition position$1, IInventory inventory$1) {}
/*     */     
/*     */     public final Object apply(int slot) {
/* 373 */       Option option = Option$.MODULE$.apply(this.inventory$1.func_70301_a(slot));
/* 374 */       if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); if (stack.field_77994_a > 0)
/* 375 */         { this.inventory$1.func_70299_a(slot, null);
/* 376 */           return InventoryUtils$.MODULE$.spawnStackInWorld(this.position$1, stack, InventoryUtils$.MODULE$.spawnStackInWorld$default$3(), InventoryUtils$.MODULE$.spawnStackInWorld$default$4()); }  }
/* 377 */        return BoxedUnit.UNIT;
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
/*     */   public final class InventoryUtils$$anonfun$2
/*     */     extends AbstractFunction0<Tuple3<Object, Object, Object>>
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
/*     */     public final Tuple3<Object, Object, Object> apply()
/*     */     {
/* 405 */       return new Tuple3(BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(0)); } } public final class InventoryUtils$$anonfun$3 extends AbstractFunction1<ForgeDirection, Tuple3<Object, Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(ForgeDirection d) { return new Tuple3(BoxesRunTime.boxToInteger(d.offsetX), BoxesRunTime.boxToInteger(d.offsetY), BoxesRunTime.boxToInteger(d.offsetZ)); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class InventoryUtils$$anonfun$spawnStackInWorld$1
/*     */     extends AbstractFunction0.mcZ.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply() {
/* 416 */       return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class InventoryUtils$$anonfun$spawnStackInWorld$2 extends AbstractFunction1<Function1<EntityItem, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final EntityItem entity$1; public final boolean apply(Function1 x$9) { return BoxesRunTime.unboxToBoolean(x$9.apply(this.entity$1)); }
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$spawnStackInWorld$2(EntityItem entity$1) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\InventoryUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */