/*     */ package li.cil.oc.server.agent;
/*     */ 
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Uh\001B\001\003\0015\021\021\"\0238wK:$xN]=\013\005\r!\021!B1hK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\031\033\005\001\"BA\t\023\003\031\001H.Y=fe*\0211\003F\001\007K:$\030\016^=\013\005U1\022!C7j]\026\034'/\0314u\025\0059\022a\0018fi&\021\021\004\005\002\020\023:4XM\034;pef\004F.Y=fe\"A1\001\001BC\002\023\0051$F\001\035!\ti\"%D\001\037\025\ty\002%\001\005j]R,'O\\1m\025\t\tc!A\002ba&L!a\t\020\003\013\005;WM\034;\t\021\025\002!\021!Q\001\nq\ta!Y4f]R\004\003\"B\024\001\t\003A\023A\002\037j]&$h\b\006\002*WA\021!\006A\007\002\005!)1A\na\0019!)Q\006\001C\005]\005\t2/\0327fGR,G-\023;f[N#\030mY6\026\003=\002\"\001M\032\016\003ER!A\r\013\002\t%$X-\\\005\003iE\022\021\"\023;f[N#\030mY6\t\013Y\002A\021B\034\002\035%tg/\0328u_JL8\013\\8ugV\t\001\bE\002:\001\nk\021A\017\006\003wq\n\021\"[7nkR\f'\r\\3\013\005ur\024AC2pY2,7\r^5p]*\tq(A\003tG\006d\027-\003\002Bu\tQ\021J\0343fq\026$7+Z9\021\005\r#U\"\001 \n\005\025s$aA%oi\")q\t\001C!\021\006qq-\032;DkJ\024XM\034;Ji\026lG#A\030\t\013)\003A\021I&\002%\035,GOR5sgR,U\016\035;z'R\f7m\033\013\002\005\")Q\n\001C!\035\006ia-\0368d?F\"d\007M\0321?\006$Ra\024*X3z\003\"a\021)\n\005Es$\001B+oSRDQa\025'A\002Q\0131\002]02iY\0024\007M02?B\021\001'V\005\003-F\022A!\023;f[\")\001\f\024a\001\005\006Y\001oX\0315mA\032\004g\030\032`\021\025QF\n1\001\\\003-\001x,\r\0337aM\002tlM0\021\005\rc\026BA/?\005\035\021un\0347fC:DQa\030'A\002m\0131\002]02iY\0024\007M05?\")\021\r\001C\001E\006q1/\032;DkJ\024XM\034;Ji\026lG#B(dI\032D\007\"\002\032a\001\004!\006\"B3a\001\004\021\025AC5uK6$\025-\\1hK\")q\r\031a\0017\006Y1\r[3dW\022\013W.Y4f\021\025I\007\r1\001\\\003\031\031'/Z1uK\")1\016\001C!Y\006\t2\r[1oO\026\034UO\035:f]RLE/Z7\025\005=k\007\"\0028k\001\004\021\025!\0033je\026\034G/[8o\021\025\001\b\001\"\021r\0039\031G.Z1s\023:4XM\034;pef$2A\021:t\021\025\021t\0161\001U\021\025)w\0161\001C\021\025)\b\001\"\021w\00311WO\\2`oA\"4'O0b)\ryu\017\037\005\006eQ\004\r\001\026\005\006KR\004\rA\021\005\006u\002!\te_\001\024I\026\034'/Z7f]R\fe.[7bi&|gn\035\013\002\037\")Q\020\001C!}\006!2m\0348tk6,\027J\034<f]R|'/_%uK6$\"aW@\t\013Ib\b\031\001+\t\017\005\r\001\001\"\021\002\006\0059\022\r\0323Ji\026l7\013^1dWR{\027J\034<f]R|'/\037\013\0047\006\035\001bBA\005\003\003\001\raL\001\006gR\f7m\033\005\b\003\033\001A\021IA\b\00351WO\\2`cQ2\004GM\033`ER\0311,!\005\t\021\005M\0211\002a\001\003+\tQA\0317pG.\004B!a\006\002\0345\021\021\021\004\006\004\003'!\022\002BA\017\0033\021QA\0217pG.Dq!!\t\001\t\003\t\031#A\bdC:D\025M\035<fgR\024En\\2l)\rY\026Q\005\005\t\003'\ty\0021\001\002\026!9\021\021\006\001\005B\005-\022!\0044v]\016|\026\007\016\0341eMz\026\r\006\003\002.\005M\002cA\"\0020%\031\021\021\007 \003\013\031cw.\031;\t\021\005M\021q\005a\001\003+Aq!a\016\001\t\003\tI$A\007hKR\034FO\035,t\0052|7m\033\013\005\003[\tY\004\003\005\002\024\005U\002\031AA\013\021\035\ty\004\001C!\003\003\n!b\036:ji\026$vN\024\"U)\021\t\031%a\024\021\t\005\025\0231J\007\003\003\017R1!!\023\025\003\rq'\r^\005\005\003\033\n9E\001\006O\005R#\026m\032'jgRD\001\"!\023\002>\001\007\0211\t\005\b\003'\002A\021IA+\003-\021X-\0313Ge>lgJ\021+\025\007=\0139\006\003\005\002J\005E\003\031AA\"\021\035\tY\006\001C!\003;\nq\"\031:n_JLE/Z7J]Ncw\016\036\013\005\003?\n)\007E\002D\003CJ1!a\031?\005\021qU\017\0347\t\017\005\035\024\021\fa\001\005\006!1\017\\8u\021\031\tY\007\001C!\027\006\021r-\032;U_R\fG.\021:n_J4\026\r\\;f\021\035\ty\007\001C!\003c\n1\002Z1nC\036,\027I]7peR\031q*a\035\t\021\005U\024Q\016a\001\003[\ta\001Z1nC\036,\007BBA=\001\021\00530\001\007ee>\004\030\t\0347Ji\026l7\017C\004\002~\001!\t%a \002\017!\f7/\023;f[R\0311,!!\t\rI\nY\b1\001U\021\035\t)\t\001C!\003\017\013A\002[1t\023R,Wn\025;bG.$2aWAE\021\035\tI!a!A\002=Bq!!$\001\t\003\ny)A\007d_BL\030J\034<f]R|'/\037\013\004\037\006E\005bBAJ\003\027\003\rAD\001\005MJ|W\016\003\004\002\030\002!\teS\001\021O\026$8+\033>f\023:4XM\034;pefDq!a'\001\t\003\ni*\001\bhKR\034F/Y2l\023:\034Fn\034;\025\007=\ny\nC\004\002h\005e\005\031\001\"\t\017\005\r\006\001\"\021\002&\006iA-Z2s'R\f7m[*ju\026$RaLAT\003SCq!a\032\002\"\002\007!\tC\004\002,\006\005\006\031\001\"\002\r\005lw.\0368u\021\035\ty\013\001C!\003c\013qcZ3u'R\f7m[%o'2|Go\0248DY>\034\030N\\4\025\007=\n\031\fC\004\002h\0055\006\031\001\"\t\017\005]\006\001\"\021\002:\006A2/\032;J]Z,g\016^8ssNcw\016^\"p]R,g\016^:\025\013=\013Y,!0\t\017\005\035\024Q\027a\001\005\"9\021\021BA[\001\004y\003bBAa\001\021\005\0231Y\001\021O\026$\030J\034<f]R|'/\037(b[\026$\"!!2\021\t\005\035\027\021[\007\003\003\023TA!a3\002N\006!A.\0318h\025\t\ty-\001\003kCZ\f\027\002BAj\003\023\024aa\025;sS:<\007BBAl\001\021\0053*\001\fhKRLeN^3oi>\024\030p\025;bG.d\025.\\5u\021\031\tY\016\001C!w\006IQ.\031:l\t&\024H/\037\005\b\003?\004A\021IAq\003EI7/V:fC\ndWMQ=QY\006LXM\035\013\0047\006\r\bbB\t\002^\002\007\021Q\035\t\004\037\005\035\030bAAu!\taQI\034;jif\004F.Y=fe\"9\021Q\036\001\005B\005=\030AE5t\023R,WNV1mS\0224uN]*m_R$RaWAy\003gDq!a\032\002l\002\007!\tC\004\002\n\005-\b\031A\030")
/*     */ public class Inventory extends InventoryPlayer {
/*  13 */   public Agent agent() { return this.agent; } private final Agent agent; public Inventory(Agent agent) { super(null); } private ItemStack selectedItemStack() {
/*  14 */     return agent().mainInventory().func_70301_a(agent().selectedSlot());
/*     */   } private IndexedSeq<Object> inventorySlots() {
/*  16 */     return (IndexedSeq<Object>)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(agent().selectedSlot()), func_70302_i_()).$plus$plus((GenTraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), agent().selectedSlot()), IndexedSeq$.MODULE$.canBuildFrom());
/*     */   } public ItemStack func_70448_g() {
/*  18 */     return agent().equipmentInventory().func_70301_a(0);
/*     */   }
/*     */   
/*  21 */   public int func_70447_i() { return (selectedItemStack() == null) ? agent().selectedSlot() : 
/*  22 */       BoxesRunTime.unboxToInt(inventorySlots().find((Function1)new Inventory$$anonfun$getFirstEmptyStack$1(this)).getOrElse((Function0)new Inventory$$anonfun$getFirstEmptyStack$2(this))); } public final class Inventory$$anonfun$getFirstEmptyStack$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int x$1) { return apply$mcZI$sp(x$1); } public boolean apply$mcZI$sp(int x$1) { return (this.$outer.func_70301_a(x$1) == null); } public Inventory$$anonfun$getFirstEmptyStack$1(Inventory $outer) {} } public final class Inventory$$anonfun$getFirstEmptyStack$2 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return -1; }
/*     */      public Inventory$$anonfun$getFirstEmptyStack$2(Inventory $outer) {} }
/*     */   public void func_146030_a(Item p_146030_1_, int p_146030_2_, boolean p_146030_3_, boolean p_146030_4_) {
/*  25 */     setCurrentItem(p_146030_1_, p_146030_2_, p_146030_3_, p_146030_4_);
/*     */   }
/*     */   public void setCurrentItem(Item item, int itemDamage, boolean checkDamage, boolean create) {}
/*     */   public void func_70453_c(int direction) {}
/*     */   
/*     */   public int func_146027_a(Item item, int itemDamage) {
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public void func_70439_a(Item item, int itemDamage) {}
/*     */   
/*  36 */   public void func_70429_k() { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Inventory$$anonfun$decrementAnimations$1(this)); } public final class Inventory$$anonfun$decrementAnimations$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int slot) { apply$mcVI$sp(slot); }
/*     */ 
/*     */     
/*     */     public Inventory$$anonfun$decrementAnimations$1(Inventory $outer) {}
/*     */     
/*     */     public void apply$mcVI$sp(int slot) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   3: aload_0
/*     */       //   4: getfield $outer : Lli/cil/oc/server/agent/Inventory;
/*     */       //   7: iload_1
/*     */       //   8: invokevirtual func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */       //   11: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   14: astore_2
/*     */       //   15: aload_2
/*     */       //   16: instanceof scala/Some
/*     */       //   19: ifeq -> 104
/*     */       //   22: aload_2
/*     */       //   23: checkcast scala/Some
/*     */       //   26: astore_3
/*     */       //   27: aload_3
/*     */       //   28: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   31: checkcast net/minecraft/item/ItemStack
/*     */       //   34: astore #4
/*     */       //   36: aload #4
/*     */       //   38: aload_0
/*     */       //   39: getfield $outer : Lli/cil/oc/server/agent/Inventory;
/*     */       //   42: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   45: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   50: aload_0
/*     */       //   51: getfield $outer : Lli/cil/oc/server/agent/Inventory;
/*     */       //   54: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   57: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */       //   62: getfield field_72995_K : Z
/*     */       //   65: ifeq -> 72
/*     */       //   68: aconst_null
/*     */       //   69: goto -> 84
/*     */       //   72: aload_0
/*     */       //   73: getfield $outer : Lli/cil/oc/server/agent/Inventory;
/*     */       //   76: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   79: invokeinterface player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   84: iload_1
/*     */       //   85: iload_1
/*     */       //   86: iconst_0
/*     */       //   87: if_icmpne -> 94
/*     */       //   90: iconst_1
/*     */       //   91: goto -> 95
/*     */       //   94: iconst_0
/*     */       //   95: invokevirtual func_77945_a : (Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V
/*     */       //   98: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   101: goto -> 117
/*     */       //   104: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   107: astore #5
/*     */       //   109: goto -> 119
/*     */       //   112: astore #6
/*     */       //   114: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   117: astore #5
/*     */       //   119: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #37	-> 0
/*     */       //   #38	-> 15
/*     */       //   #41	-> 104
/*     */       //   #39	-> 112
/*     */       //   #38	-> 112
/*     */       //   #38	-> 117
/*     */       //   #37	-> 119
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	120	0	this	Lli/cil/oc/server/agent/Inventory$$anonfun$decrementAnimations$1;
/*     */       //   0	120	1	slot	I
/*     */       //   36	84	4	stack	Lnet/minecraft/item/ItemStack;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   36	104	112	java/lang/NullPointerException
/*     */     } }
/*     */ 
/*     */   
/*  46 */   public boolean func_146026_a(Item item) { Object object = new Object(); 
/*  47 */     try { ((TraversableLike)inventorySlots().map((Function1)new Inventory$$anonfun$consumeInventoryItem$1(this), IndexedSeq$.MODULE$.canBuildFrom())).withFilter((Function1)new Inventory$$anonfun$consumeInventoryItem$2(this)).withFilter((Function1)new Inventory$$anonfun$consumeInventoryItem$3(this, item)).foreach((Function1)new Inventory$$anonfun$consumeInventoryItem$4(this, object)); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) return nonLocalReturnControl.value$mcZ$sp();  }  return false; } public final class Inventory$$anonfun$consumeInventoryItem$1 extends AbstractFunction1<Object, Tuple2<Object, ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<Object, ItemStack> apply(int slot) { return new Tuple2(BoxesRunTime.boxToInteger(slot), this.$outer.func_70301_a(slot)); } public Inventory$$anonfun$consumeInventoryItem$1(Inventory $outer) {} } public final class Inventory$$anonfun$consumeInventoryItem$2 extends AbstractFunction1<Tuple2<Object, ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Inventory$$anonfun$consumeInventoryItem$2(Inventory $outer) {} } public final class Inventory$$anonfun$consumeInventoryItem$3 extends AbstractFunction1<Tuple2<Object, ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Item item$1; public final boolean apply(Tuple2 x$2) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 67
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   10: checkcast net/minecraft/item/ItemStack
/*     */       //   13: astore_3
/*     */       //   14: aload_3
/*     */       //   15: ifnull -> 61
/*     */       //   18: aload_3
/*     */       //   19: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */       //   22: aload_0
/*     */       //   23: getfield item$1 : Lnet/minecraft/item/Item;
/*     */       //   26: astore #5
/*     */       //   28: dup
/*     */       //   29: ifnonnull -> 41
/*     */       //   32: pop
/*     */       //   33: aload #5
/*     */       //   35: ifnull -> 49
/*     */       //   38: goto -> 61
/*     */       //   41: aload #5
/*     */       //   43: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   46: ifeq -> 61
/*     */       //   49: aload_3
/*     */       //   50: getfield field_77994_a : I
/*     */       //   53: iconst_0
/*     */       //   54: if_icmple -> 61
/*     */       //   57: iconst_1
/*     */       //   58: goto -> 62
/*     */       //   61: iconst_0
/*     */       //   62: istore #4
/*     */       //   64: iload #4
/*     */       //   66: ireturn
/*     */       //   67: new scala/MatchError
/*     */       //   70: dup
/*     */       //   71: aload_2
/*     */       //   72: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   75: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #47	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	76	0	this	Lli/cil/oc/server/agent/Inventory$$anonfun$consumeInventoryItem$3;
/*     */       //   0	76	1	x$2	Lscala/Tuple2;
/*  47 */       //   14	62	3	stack	Lnet/minecraft/item/ItemStack; } public Inventory$$anonfun$consumeInventoryItem$3(Inventory $outer, Item item$1) {} } public final class Inventory$$anonfun$consumeInventoryItem$4 extends AbstractFunction1<Tuple2<Object, ItemStack>, Nothing$> implements Serializable { public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey1$1; public final Nothing$ apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { int slot = tuple2._1$mcI$sp(); ItemStack stack = (ItemStack)tuple2._2();
/*  48 */         stack.field_77994_a--;
/*  49 */         if (stack.field_77994_a <= 0) {
/*  50 */           this.$outer.func_70299_a(slot, null);
/*     */         }
/*  52 */         throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey1$1, true); }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */     
/*     */     public Inventory$$anonfun$consumeInventoryItem$4(Inventory $outer, Object nonLocalReturnKey1$1) {} }
/*     */   public boolean func_70441_a(ItemStack stack) {
/*  58 */     IndexedSeq slots = (IndexedSeq)ExtendedInventory$.MODULE$.extendedInventory((IInventory)this).indices().drop(agent().selectedSlot()).$plus$plus((GenTraversableOnce)ExtendedInventory$.MODULE$.extendedInventory((IInventory)this).indices().take(agent().selectedSlot()), IndexedSeq$.MODULE$.canBuildFrom());
/*  59 */     ItemStack x$9 = stack; Inventory x$10 = this; Option x$11 = Option$.MODULE$.apply(slots), x$12 = InventoryUtils$.MODULE$.insertIntoInventory$default$3(); int x$13 = InventoryUtils$.MODULE$.insertIntoInventory$default$4(); boolean x$14 = InventoryUtils$.MODULE$.insertIntoInventory$default$5(); return InventoryUtils$.MODULE$.insertIntoInventory(x$9, (IInventory)x$10, x$12, x$13, x$14, x$11);
/*     */   }
/*     */   public boolean func_146025_b(Block block) {
/*  62 */     return canHarvestBlock(block);
/*     */   }
/*     */   public boolean canHarvestBlock(Block block) {
/*  65 */     return (block.func_149688_o().func_76229_l() || (func_70448_g() != null && func_70448_g().func_150998_b(block)));
/*     */   }
/*     */   public float func_146023_a(Block block) {
/*  68 */     return getStrVsBlock(block);
/*     */   }
/*  70 */   public float getStrVsBlock(Block block) { return BoxesRunTime.unboxToFloat(Option$.MODULE$.apply(func_70448_g()).fold((Function0)new Inventory$$anonfun$getStrVsBlock$1(this), (Function1)new Inventory$$anonfun$getStrVsBlock$2(this, block))); } public final class Inventory$$anonfun$getStrVsBlock$1 extends AbstractFunction0.mcF.sp implements Serializable { public static final long serialVersionUID = 0L; public final float apply() { return apply$mcF$sp(); } public float apply$mcF$sp() { return 1.0F; } public Inventory$$anonfun$getStrVsBlock$1(Inventory $outer) {} } public final class Inventory$$anonfun$getStrVsBlock$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Block block$1; public final float apply(ItemStack x$4) { return x$4.func_150997_a(this.block$1); }
/*     */      public Inventory$$anonfun$getStrVsBlock$2(Inventory $outer, Block block$1) {} } public NBTTagList func_70442_a(NBTTagList nbt) {
/*  72 */     return nbt;
/*     */   }
/*     */   public void func_70443_b(NBTTagList nbt) {}
/*     */   public Null$ armorItemInSlot(int slot) {
/*  76 */     return null;
/*     */   } public int func_70430_l() {
/*  78 */     return 0;
/*     */   }
/*     */   public void func_70449_g(float damage) {}
/*     */   
/*     */   public void func_70436_m() {}
/*     */   
/*  84 */   public boolean func_146028_b(Item item) { return ((IterableLike)((TraversableLike)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).map((Function1)new Inventory$$anonfun$hasItem$1(this), IndexedSeq$.MODULE$.canBuildFrom())).filter((Function1)new Inventory$$anonfun$hasItem$2(this))).exists((Function1)new Inventory$$anonfun$hasItem$3(this, item)); } public final class Inventory$$anonfun$hasItem$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(int slot) { return this.$outer.func_70301_a(slot); } public Inventory$$anonfun$hasItem$1(Inventory $outer) {} } public final class Inventory$$anonfun$hasItem$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$5) { return !(x$5 == null); } public Inventory$$anonfun$hasItem$2(Inventory $outer) {} } public final class Inventory$$anonfun$hasItem$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Item item$2; public final boolean apply(ItemStack x$6) { Item item = this.item$2; if (x$6.func_77973_b() == null) { x$6.func_77973_b(); if (item != null); } else if (x$6.func_77973_b().equals(item))
/*     */       {  }
/*  86 */        } public Inventory$$anonfun$hasItem$3(Inventory $outer, Item item$2) {} } public boolean func_70431_c(ItemStack stack) { return ((IterableLike)((TraversableLike)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).map((Function1)new Inventory$$anonfun$hasItemStack$1(this), IndexedSeq$.MODULE$.canBuildFrom())).filter((Function1)new Inventory$$anonfun$hasItemStack$2(this))).exists((Function1)new Inventory$$anonfun$hasItemStack$3(this, stack)); } public final class Inventory$$anonfun$hasItemStack$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(int slot) { return this.$outer.func_70301_a(slot); } public Inventory$$anonfun$hasItemStack$1(Inventory $outer) {} } public final class Inventory$$anonfun$hasItemStack$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$7) { return !(x$7 == null); } public Inventory$$anonfun$hasItemStack$2(Inventory $outer) {} } public final class Inventory$$anonfun$hasItemStack$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(ItemStack x$8) { return x$8.func_77969_a(this.stack$1); }
/*     */     
/*     */     public Inventory$$anonfun$hasItemStack$3(Inventory $outer, ItemStack stack$1) {} }
/*     */   public void func_70455_b(InventoryPlayer from) {}
/*     */   
/*     */   public int func_70302_i_() {
/*  92 */     return agent().mainInventory().func_70302_i_();
/*     */   }
/*     */   public ItemStack func_70301_a(int slot) {
/*  95 */     return (slot < 0) ? agent().equipmentInventory().func_70301_a(slot ^ 0xFFFFFFFF) : 
/*  96 */       agent().mainInventory().func_70301_a(slot);
/*     */   }
/*     */   public ItemStack func_70298_a(int slot, int amount) {
/*  99 */     return (slot < 0) ? agent().equipmentInventory().func_70298_a(slot ^ 0xFFFFFFFF, amount) : 
/* 100 */       agent().mainInventory().func_70298_a(slot, amount);
/*     */   }
/*     */   
/*     */   public ItemStack func_70304_b(int slot) {
/* 104 */     return (slot < 0) ? agent().equipmentInventory().func_70304_b(slot ^ 0xFFFFFFFF) : 
/* 105 */       agent().mainInventory().func_70304_b(slot);
/*     */   }
/*     */   public void func_70299_a(int slot, ItemStack stack) {
/* 108 */     if (slot < 0) { agent().equipmentInventory().func_70299_a(slot ^ 0xFFFFFFFF, stack); }
/* 109 */     else { agent().mainInventory().func_70299_a(slot, stack); }
/*     */   
/*     */   } public String func_145825_b() {
/* 112 */     return agent().mainInventory().func_145825_b();
/*     */   } public int func_70297_j_() {
/* 114 */     return agent().mainInventory().func_70297_j_();
/*     */   } public void func_70296_d() {
/* 116 */     agent().mainInventory().func_70296_d();
/*     */   } public boolean func_70300_a(EntityPlayer player) {
/* 118 */     return agent().mainInventory().func_70300_a(player);
/*     */   }
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/* 121 */     return (slot < 0) ? agent().equipmentInventory().func_94041_b(slot ^ 0xFFFFFFFF, stack) : 
/* 122 */       agent().mainInventory().func_94041_b(slot, stack);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\Inventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */