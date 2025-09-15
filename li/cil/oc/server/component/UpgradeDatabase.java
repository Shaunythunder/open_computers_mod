/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import com.google.common.hash.HashCode;
/*     */ import com.google.common.hash.Hashing;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.util.ExtendedArguments$;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0055g\001B\001\003\0015\021q\"\0269he\006$W\rR1uC\n\f7/\032\006\003\007\021\t\021bY8na>tWM\034;\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0279A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032%\005A\021N\034;fe:\fG.\003\002\0341\tAA)\031;bE\006\034X\r\005\002\036A5\taD\003\002 %\0051AM]5wKJL!!\t\020\003\025\021+g/[2f\023:4w\016\003\005$\001\t\025\r\021\"\001%\003\021!\027\r^1\026\003\025\002\"AJ\027\016\003\035R!\001K\025\002\023%tg/\0328u_JL(B\001\026,\003%i\027N\\3de\0064GOC\001-\003\rqW\r^\005\003]\035\022!\"S%om\026tGo\034:z\021!\001\004A!A!\002\023)\023!\0023bi\006\004\003\"\002\032\001\t\003\031\024A\002\037j]&$h\b\006\0025mA\021Q\007A\007\002\005!)1%\ra\001K!9\001\b\001b\001\n\003J\024\001\0028pI\026,\022A\017\t\003wyj\021\001\020\006\003{I\tqA\\3uo>\0248.\003\002@y\t!aj\0343f\021\031\t\005\001)A\005u\005)an\0343fA!A1\t\001EC\002\0235A)\001\006eKZL7-Z%oM>,\022!\022\t\005\r6{u*D\001H\025\tA\025*A\005j[6,H/\0312mK*\021!jS\001\013G>dG.Z2uS>t'\"\001'\002\013M\034\027\r\\1\n\0059;%aA'baB\021\001+V\007\002#*\021!kU\001\005Y\006twMC\001U\003\021Q\027M^1\n\005Y\013&AB*ue&tw\r\003\005Y\001!\005\t\025)\004F\003-!WM^5dK&sgm\034\021\t\013i\003A\021I.\002\033\035,G\017R3wS\016,\027J\0344p)\005a\006\003B/aC\006l\021A\030\006\003?N\013A!\036;jY&\021aJ\030\t\003E\032t!a\0313\016\003-K!!Z&\002\rA\023X\rZ3g\023\t1vM\003\002f\027\")\021\016\001C!U\006!1/\033>f)\005Y\007CA2m\023\ti7JA\002J]RDQa\034\001\005BA\fabZ3u'R\f7m[%o'2|G\017\006\002roB\021!/^\007\002g*\021A/K\001\005SR,W.\003\002wg\nI\021\n^3n'R\f7m\033\005\006q:\004\ra[\001\005g2|G\017C\003{\001\021\00530\001\btKR\034F/Y2l\023:\034Fn\034;\025\tq|\030\021\001\t\003GvL!A`&\003\tUs\027\016\036\005\006qf\004\ra\033\005\007\003\007I\b\031A9\002\013M$\030mY6\t\017\005\035\001\001\"\021\002\n\005\tb-\0338e'R\f7m[,ji\"D\025m\0355\025\007-\fY\001C\004\002\016\005\025\001\031A1\002\r9,W\r\0327f\021\035\t\t\002\001C\001\003'\t1aZ3u)\031\t)\"!\t\0022A)1-a\006\002\034%\031\021\021D&\003\013\005\023(/Y=\021\007\r\fi\"C\002\002 -\023a!\0218z%\0264\007\002CA\022\003\037\001\r!!\n\002\017\r|g\016^3yiB!\021qEA\027\033\t\tICC\002\002,I\tq!\\1dQ&tW-\003\003\0020\005%\"aB\"p]R,\007\020\036\005\t\003g\ty\0011\001\0026\005!\021M]4t!\021\t9#a\016\n\t\005e\022\021\006\002\n\003J<W/\\3oiND\003\"a\004\002>\005\r\023Q\t\t\005\003O\ty$\003\003\002B\005%\"\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002H\005)g-\0368di&|g\016K:m_RTd.^7cKJL#\b^1cY\026\004S&\f\021HKR\004C\017[3!e\026\004(/Z:f]R\fG/[8oA=4\007\005\0365fA%$X-\034\021ti\006\0347\016I:u_J,G\rI5oAQDW\rI:qK\016Lg-[3eAMdw\016\036\030\t\017\005-\003\001\"\001\002N\005Y1m\\7qkR,\007*Y:i)\031\t)\"a\024\002R!A\0211EA%\001\004\t)\003\003\005\0024\005%\003\031AA\033Q!\tI%!\020\002D\005U\023EAA,\003}3WO\\2uS>t\007f\0357pijrW/\0342fe&R4\017\036:j]\036\004S&\f\021D_6\004X\017^3tA\005\004\003.Y:iAY\fG.^3!M>\024\b\005\0365fA%$X-\034\021ti\006\0347\016I5oAQDW\rI:qK\016Lg-[3eAMdw\016\036\030\t\017\005m\003\001\"\001\002^\0059\021N\0343fq>3GCBA\013\003?\n\t\007\003\005\002$\005e\003\031AA\023\021!\t\031$!\027A\002\005U\002\006CA-\003{\t\031%!\032\"\005\005\035\024!!\007gk:\034G/[8oQ!\f7\017\033\036tiJLgnZ\025;]Vl'-\032:![5\002s)\032;!i\",\007%\0338eKb\004sN\032\021b]\002JG/Z7!gR\f7m\033\021xSRD\007\005\0365fAM\004XmY5gS\026$\007\005[1tQ:\002#+\032;ve:\034\b%\031\021oK\036\fG/\033<fAY\fG.^3!S\032\004cn\034\021tk\016D\007e\035;bG.\004s/Y:!M>,h\016\032\030\t\017\005-\004\001\"\001\002n\005)1\r\\3beR1\021QCA8\003cB\001\"a\t\002j\001\007\021Q\005\005\t\003g\tI\0071\001\0026!B\021\021NA\037\003\007\n)(\t\002\002x\005\031h-\0368di&|g\016K:m_RTd.^7cKJL#HY8pY\026\fg\016I\027.A\rcW-\031:tAQDW\rI:qK\016Lg-[3eAMdw\016\036\030!%\026$XO\0358tAQ\024X/\032\021jM\002\"\b.\032:fA]\f7\017I:p[\026$\b.\0338hA%t\007\005\0365fAMdw\016\036\021cK\032|'/\032\030\t\017\005m\004\001\"\001\002~\005!1m\0349z)\031\t)\"a \002\002\"A\0211EA=\001\004\t)\003\003\005\0024\005e\004\031AA\033Q!\tI(!\020\002D\005\025\025EAAD\003\005\rd-\0368di&|g\016\0134s_6\034Fn\034;;]Vl'-\032:-AQ|7\013\\8uu9,XNY3s72\002\023\r\0323sKN\034(h\035;sS:<W,\013\036c_>dW-\0318![5\0023i\0349jKN\004\023M\034\021f]R\024\030\020\t;pA\005tw\016\0365fe\002\032Hn\034;-A=\004H/[8oC2d\027\020\t;pA\005tw\016\0365fe\002\"\027\r^1cCN,g\006\t*fiV\024hn\035\021ueV,\007%\0334!g>lW\r\0365j]\036\004s/Y:!_Z,'o\036:jiR,gN\f\005\b\003\027\003A\021AAG\003\025\031Gn\0348f)\031\t)\"a$\002\022\"A\0211EAE\001\004\t)\003\003\005\0024\005%\005\031AA\033Q!\tI)!\020\002D\005U\025EAAL\003i4WO\\2uS>t\007&\0313ee\026\0348OO:ue&tw-\013\036ok6\024WM\035\021.[\001\032u\016]5fg\002\"\b.\032\021eCR\f\007e\035;pe\026$\007%\0338!i\"L7\017\t3bi\006\024\027m]3!i>\004\023M\\8uQ\026\024\b\005Z1uC\n\f7/\032\021xSRD\007\005\0365fAM\004XmY5gS\026$\007%\0313ee\026\0348O\f\005\b\0037\003A\021AAO\003\r\031X\r\036\013\007\003+\ty*!)\t\021\005\r\022\021\024a\001\003KA\001\"a\r\002\032\002\007\021Q\007\025\t\0033\013i$a\021\002&\006\022\021qU\001\0020\031,hn\031;j_:D3\017\\8uu9,XNY3sY\001JGMO:ue&tw\r\f\021eC6\fw-\032\036ok6\024WM\035\027!]\n$(h\035;sS:<\027F\0172p_2,\027M\034\021.AM+G\017I1oA%$X-\034\021j]R|\007\005\0365fAM\004XmY5gS\026$\007\005Z1uC\n\f7/\032\021tY>$h\006\t(C)\002\"\030m\032\021jg\002*\007\020]3di\026$\007%\0338!\025N{e\n\t4pe6\fGO\f\005\b\0037\002A\021BAV)\025Y\027QVAX\021\035\ti!!+A\002\005D\021\"!-\002*B\005\t\031A6\002\r=4gm]3u\021%\t)\fAI\001\n\023\t9,A\tj]\022,\007p\0244%I\0264\027-\0367uII*\"!!/+\007-\fYl\013\002\002>B!\021qXAe\033\t\t\tM\003\003\002D\006\025\027!C;oG\",7m[3e\025\r\t9mS\001\013C:tw\016^1uS>t\027\002BAf\003\003\024\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\001")
/*     */ public class UpgradeDatabase extends ManagedEnvironment implements Database, DeviceInfo {
/*  27 */   public IInventory data() { return this.data; } private final IInventory data; public Node node() {
/*  28 */     return this.node; } private final Node node = Network.newNode((Environment)this, Visibility.Network)
/*  29 */     .withComponent("database")
/*  30 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*     */   
/*  32 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  33 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  34 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Object catalogue");
/*  35 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  36 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "iCatalogue (patent pending)");
/*  37 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(size()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  40 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */    public int size() {
/*  42 */     return data().func_70302_i_();
/*     */   }
/*  44 */   public ItemStack getStackInSlot(int slot) { return (ItemStack)Option$.MODULE$.apply(data().func_70301_a(slot)).map((Function1)new UpgradeDatabase$$anonfun$getStackInSlot$1(this)).orNull(Predef$.MODULE$.$conforms()); } public final class UpgradeDatabase$$anonfun$getStackInSlot$1 extends AbstractFunction1<ItemStack, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(ItemStack x$1) { return x$1.func_77946_l(); }
/*     */      public UpgradeDatabase$$anonfun$getStackInSlot$1(UpgradeDatabase $outer) {} } public void setStackInSlot(int slot, ItemStack stack) {
/*  46 */     data().func_70299_a(slot, stack);
/*     */   } public int findStackWithHash(String needle) {
/*  48 */     return indexOf(needle, indexOf$default$2());
/*     */   }
/*     */   @Callback(doc = "function(slot:number):table -- Get the representation of the item stack stored in the specified slot.")
/*     */   public Object[] get(Context context, Arguments args) {
/*  52 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { data().func_70301_a(ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(data(), 0)) }));
/*     */   }
/*     */   @Callback(doc = "function(slot:number):string -- Computes a hash value for the item stack in the specified slot.")
/*     */   public Object[] computeHash(Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  57 */     ItemStack itemStack = data().func_70301_a(ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(data(), 0));
/*  58 */     if (itemStack != null) { ItemStack itemStack1 = itemStack;
/*  59 */       HashCode hash = Hashing.sha256().hashBytes(CompressedStreamTools.func_74798_a(ExtendedNBT$.MODULE$.toNbt(itemStack1)));
/*  60 */       arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { hash.toString() })); }
/*  61 */     else { arrayOfObject = null; }
/*     */     
/*     */     return arrayOfObject;
/*     */   }
/*     */   @Callback(doc = "function(hash:string):number -- Get the index of an item stack with the specified hash. Returns a negative value if no such stack was found.")
/*     */   public Object[] indexOf(Context context, Arguments args) {
/*  67 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(indexOf(args.checkString(0), 1)) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(slot:number):boolean -- Clears the specified slot. Returns true if there was something in the slot before.")
/*     */   public Object[] clear(Context context, Arguments args) {
/*  72 */     int slot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(data(), 0);
/*  73 */     boolean nonEmpty = !(data().func_70301_a(slot) == null);
/*  74 */     data().func_70299_a(slot, null);
/*  75 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(nonEmpty) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(fromSlot:number, toSlot:number[, address:string]):boolean -- Copies an entry to another slot, optionally to another database. Returns true if something was overwritten.")
/*     */   public Object[] copy(Context context, Arguments args)
/*     */   {
/*  81 */     int fromSlot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(data(), 0);
/*  82 */     ItemStack entry = data().func_70301_a(fromSlot);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     return (args.count() > 2) ? DatabaseAccess$.MODULE$.withDatabase(node(), args.checkString(2), (Function1)new UpgradeDatabase$$anonfun$copy$1(this, args, entry)) : 
/*  90 */       li$cil$oc$server$component$UpgradeDatabase$$set$1(data(), args, entry);
/*     */   } public final Object[] li$cil$oc$server$component$UpgradeDatabase$$set$1(IInventory inventory, Arguments args$1, ItemStack entry$1) { int toSlot = ExtendedArguments$.MODULE$.extendedArguments(args$1).checkSlot(inventory, 1);
/*     */     boolean nonEmpty = !(inventory.func_70301_a(toSlot) == null);
/*     */     inventory.func_70299_a(toSlot, entry$1.func_77946_l());
/*     */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(nonEmpty) })); } public final class UpgradeDatabase$$anonfun$copy$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Arguments args$1; private final ItemStack entry$1; public final Object[] apply(UpgradeDatabase database) { return this.$outer.li$cil$oc$server$component$UpgradeDatabase$$set$1(database.data(), this.args$1, this.entry$1); } public UpgradeDatabase$$anonfun$copy$1(UpgradeDatabase $outer, Arguments args$1, ItemStack entry$1) {} }
/*  96 */   @Callback(doc = "function(address:string):number -- Copies the data stored in this database to another database with the specified address.") public Object[] clone(Context context, Arguments args) { return DatabaseAccess$.MODULE$.withDatabase(node(), args.checkString(0), (Function1)new UpgradeDatabase$$anonfun$clone$1(this, context)); } public final class UpgradeDatabase$$anonfun$clone$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final Context context$1; public UpgradeDatabase$$anonfun$clone$1(UpgradeDatabase $outer, Context context$1) {}
/*  97 */     public final Object[] apply(UpgradeDatabase database) { int numberToCopy = package$.MODULE$.min(this.$outer.data().func_70302_i_(), database.data().func_70302_i_()); RichInt$.MODULE$
/*  98 */         .until$extension0(Predef$.MODULE$.intWrapper(0), numberToCopy).foreach$mVc$sp((Function1)new UpgradeDatabase$$anonfun$clone$1$$anonfun$apply$1(this, database));
/*     */ 
/*     */       
/* 101 */       this.context$1.pause(0.25D);
/* 102 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(numberToCopy) })); } public final class UpgradeDatabase$$anonfun$clone$1$$anonfun$apply$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final UpgradeDatabase database$1; public final void apply(int slot) {
/*     */         apply$mcVI$sp(slot);
/*     */       } public UpgradeDatabase$$anonfun$clone$1$$anonfun$apply$1(UpgradeDatabase$$anonfun$clone$1 $outer, UpgradeDatabase database$1) {} public void apply$mcVI$sp(int slot) {
/*     */         this.database$1.data().func_70299_a(slot, this.$outer.li$cil$oc$server$component$UpgradeDatabase$$anonfun$$$outer().data().func_70301_a(slot).func_77946_l());
/*     */       } } }
/*     */   @Callback(doc = "function(slot:number, id:string, damage:number, nbt:string):boolean - Set an item into the specified database slot. NBT tag is expected in JSON format.")
/*     */   public Object[] set(Context context, Arguments args) {
/* 109 */     int slot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(data(), 0);
/* 110 */     Item item = (Item)Item.field_150901_e.func_82594_a(args.checkString(1));
/* 111 */     if (item == null)
/* 112 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "invalid item id" })); 
/* 113 */     int damage = args.checkInteger(2);
/* 114 */     String tagJson = args.optString(3, "");
/* 115 */     NBTTagCompound tag = Strings.isNullOrEmpty(tagJson) ? null : (NBTTagCompound)JsonToNBT.func_150315_a(tagJson);
/* 116 */     ItemStack stack = new ItemStack(item, 1, damage);
/* 117 */     stack.func_77982_d(tag);
/* 118 */     data().func_70299_a(slot, stack);
/* 119 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */   }
/*     */   private int indexOf(String needle, int offset) {
/* 122 */     Object object = new Object(); try { RichInt$.MODULE$
/* 123 */         .until$extension0(Predef$.MODULE$.intWrapper(0), data().func_70302_i_()).foreach$mVc$sp((Function1)new UpgradeDatabase$$anonfun$indexOf$1(this, needle, offset, object)); }
/*     */     catch (NonLocalReturnControl nonLocalReturnControl)
/*     */     { if (nonLocalReturnControl.key() == object) {
/*     */         return nonLocalReturnControl.value$mcI$sp();
/*     */       } }
/*     */     
/* 129 */     return -1;
/*     */   }
/*     */   
/*     */   private int indexOf$default$2() {
/*     */     return 0;
/*     */   }
/*     */   
/*     */   public UpgradeDatabase(IInventory data) {}
/*     */   
/*     */   public final class UpgradeDatabase$$anonfun$indexOf$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String needle$1;
/*     */     private final int offset$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public final void apply(int slot) {
/*     */       apply$mcVI$sp(slot);
/*     */     }
/*     */     
/*     */     public void apply$mcVI$sp(int slot) {
/*     */       ItemStack itemStack = this.$outer.data().func_70301_a(slot);
/*     */       if (itemStack != null) {
/*     */         ItemStack itemStack1 = itemStack;
/*     */         HashCode hash = Hashing.sha256().hashBytes(CompressedStreamTools.func_74798_a(ExtendedNBT$.MODULE$.toNbt(itemStack1)));
/*     */         String str = this.needle$1;
/*     */         if (hash.toString() == null) {
/*     */           hash.toString();
/*     */           if (str != null);
/*     */         } else if (hash.toString().equals(str)) {
/*     */           throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, slot + this.offset$1);
/*     */         } 
/*     */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, slot + this.offset$1);
/*     */       } 
/*     */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     }
/*     */     
/*     */     public UpgradeDatabase$$anonfun$indexOf$1(UpgradeDatabase $outer, String needle$1, int offset$1, Object nonLocalReturnKey1$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */