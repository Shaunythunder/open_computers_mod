/*     */ package li.cil.oc.server.component;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.internal.Robot;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.CraftingManager;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\025f\001B\001\003\0015\021q\"\0269he\006$Wm\021:bMRLgn\032\006\003\007\021\t\021bY8na>tWM\034;\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\004qe\0264\027M\031\006\003'\031\t1!\0319j\023\t)\002C\001\nNC:\fw-\0323F]ZL'o\0348nK:$\bCA\f\033\033\005A\"BA\r\023\003\031!'/\033<fe&\0211\004\007\002\013\t\0264\030nY3J]\032|\007\002C\017\001\005\013\007I\021\001\020\002\t!|7\017^\013\002?I\031\001E\t\025\007\t\005\002\001a\b\002\ryI,g-\0338f[\026tGO\020\t\003G\031j\021\001\n\006\003KI\tqA\\3uo>\0248.\003\002(I\tyQI\034<je>tW.\0328u\021>\034H\017\005\002*Y5\t!F\003\002,%\005A\021N\034;fe:\fG.\003\002.U\t)!k\0342pi\"Aq\006\001B\001B\003%q$A\003i_N$\b\005C\0032\001\021\005!'\001\004=S:LGO\020\013\003gU\002\"\001\016\001\016\003\tAQ!\b\031A\002Y\0222a\016\022)\r\021\t\003\001\001\034\t\017e\002!\031!C!u\005!an\0343f+\005Y\004CA\022=\023\tiDEA\005D_6\004xN\\3oi\"1q\b\001Q\001\nm\nQA\\8eK\002B\001\"\021\001\t\006\004%iAQ\001\013I\0264\030nY3J]\032|W#A\"\021\t\021[U*T\007\002\013*\021aiR\001\nS6lW\017^1cY\026T!\001S%\002\025\r|G\016\\3di&|gNC\001K\003\025\0318-\0317b\023\taUIA\002NCB\004\"AT*\016\003=S!\001U)\002\t1\fgn\032\006\002%\006!!.\031<b\023\t!vJ\001\004TiJLgn\032\005\t-\002A\t\021)Q\007\007\006YA-\032<jG\026LeNZ8!\021\025A\006\001\"\021Z\00359W\r\036#fm&\034W-\0238g_R\t!\f\005\003\\=~{V\"\001/\013\005u\013\026\001B;uS2L!\001\024/\021\005\001$gBA1c\033\005I\025BA2J\003\031\001&/\0323fM&\021A+\032\006\003G&CQa\032\001\005\002!\fQa\031:bMR$2![8x!\r\t'\016\\\005\003W&\023Q!\021:sCf\004\"!Y7\n\0059L%AB!osJ+g\rC\003qM\002\007\021/A\004d_:$X\r\037;\021\005I,X\"A:\013\005Q\024\022aB7bG\"Lg.Z\005\003mN\024qaQ8oi\026DH\017C\003yM\002\007\0210\001\003be\036\034\bC\001:{\023\tY8OA\005Be\036,X.\0328ug\"2a-`A\001\003\007\001\"A\035@\n\005}\034(\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002\006\0051h-\0368di&|g\016K.d_VtGO\0178v[\n,'/X\025;]Vl'-\032:![5\002CK]5fg\002\"x\016I2sC\032$\b\005\0365fAM\004XmY5gS\026$\007E\\;nE\026\024\be\0344!SR,Wn\035\021j]\002\"\b.\032\021u_B\004C.\0324uA\005\024X-\031\021pM\002\"\b.\032\021j]Z,g\016^8ss::q!!\003\001\021\023\tY!A\tDe\0064G/\0338h\023:4XM\034;pef\004B!!\004\002\0205\t\001AB\004\002\022\001AI!a\005\003#\r\023\030M\032;j]\036LeN^3oi>\024\030p\005\003\002\020\005U\001\003BA\f\003Ki!!!\007\013\t\005m\021QD\001\nS:4XM\034;pefTA!a\b\002\"\005IQ.\0338fGJ\fg\r\036\006\003\003G\t1A\\3u\023\021\t9#!\007\003#%sg/\0328u_JL8I]1gi&tw\rC\0042\003\037!\t!a\013\025\005\005-\001BCA\030\003\037\001\r\021\"\001\0022\005q\021-\\8v]R\004vn]:jE2,WCAA\032!\r\t\027QG\005\004\003oI%aA%oi\"Q\0211HA\b\001\004%\t!!\020\002%\005lw.\0368u!>\0348/\0332mK~#S-\035\013\005\003\t)\005E\002b\003\003J1!a\021J\005\021)f.\033;\t\025\005\035\023\021HA\001\002\004\t\031$A\002yIEB\021\"a\023\002\020\001\006K!a\r\002\037\005lw.\0368u!>\0348/\0332mK\002BqaZA\b\t\003\ty\005\006\003\002R\005\005\005\007BA*\003_\002b!!\026\002f\005-d\002BA,\003CrA!!\027\002`5\021\0211\f\006\004\003;b\021A\002\037s_>$h(C\001K\023\r\t\031'S\001\ba\006\0347.Y4f\023\021\t9'!\033\003\007M+\027OC\002\002d%\003B!!\034\002p1\001A\001DA9\003\033\n\t\021!A\003\002\005M$aA0%cE!\021QOA>!\r\t\027qO\005\004\003sJ%a\002(pi\"Lgn\032\t\004C\006u\024bAA@\023\n\031\021I\\=\t\021\005\r\025Q\na\001\003g\t1b^1oi\026$7i\\;oi\"A\021qQA\b\t\003\tI)\001\003m_\006$G\003BA \003\027C\001\"a\007\002\006\002\007\021Q\022\t\005\003/\ty)\003\003\002\022\006e!AC%J]Z,g\016^8ss\"A\021QSA\b\t\003\t9*\001\003tCZ,G\003BA \0033C\001\"a\007\002\024\002\007\021Q\022\005\t\003;\013y\001\"\003\002 \006aAo\034)be\026tGo\0257piR!\0211GAQ\021!\t\031+a'A\002\005M\022\001B:m_R\004")
/*     */ public class UpgradeCrafting extends ManagedEnvironment implements DeviceInfo {
/*     */   private final Robot host;
/*     */   
/*     */   public Robot host() {
/*  32 */     return this.host;
/*  33 */   } private final Component node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  34 */     .withComponent("crafting")
/*  35 */     .create(); private Map<String, String> deviceInfo; private volatile CraftingInventory$ CraftingInventory$module; private volatile boolean bitmap$0;
/*     */   public Component node() { return this.node; }
/*  37 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  38 */           .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  39 */         (new scala.Tuple2[4])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("description"), "Assembly controller");
/*  40 */         (new scala.Tuple2[4])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  41 */         (new scala.Tuple2[4])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("product"), "MultiCombinator-9S"); this.deviceInfo = (Map<String, String>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  44 */   public Map<String, String> getDeviceInfo() { return scala.collection.convert.WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   
/*     */   @Callback(doc = "function([count:number]):number -- Tries to craft the specified number of items in the top left area of the inventory.")
/*     */   public Object[] craft(Context context, Arguments args) {
/*  48 */     int count = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(args.optInteger(0, 64)), 0)), 64);
/*  49 */     return package$.MODULE$.result((Seq)li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory().craft(count));
/*     */   }
/*     */   
/*  52 */   private CraftingInventory$ li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory$lzycompute() { synchronized (this) { if (this.CraftingInventory$module == null) this.CraftingInventory$module = new CraftingInventory$(this);  null; return this.CraftingInventory$module; }  } public CraftingInventory$ li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory() { return (this.CraftingInventory$module == null) ? li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory$lzycompute() : this.CraftingInventory$module; } public UpgradeCrafting(Robot host) {} public class CraftingInventory$ extends InventoryCrafting { private int amountPossible; public CraftingInventory$(UpgradeCrafting $outer) { super(new UpgradeCrafting$CraftingInventory$$anon$1($outer), 
/*     */           
/*  54 */           3, 3);
/*  55 */       this.amountPossible = 0; } public final class UpgradeCrafting$CraftingInventory$$anon$1 extends Container { public UpgradeCrafting$CraftingInventory$$anon$1(UpgradeCrafting $outer) {} public boolean func_75145_c(EntityPlayer player) { return true; } } public int amountPossible() { return this.amountPossible; } public void amountPossible_$eq(int x$1) { this.amountPossible = x$1; } public final class UpgradeCrafting$CraftingInventory$$anonfun$craft$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int wantedCount$1; public final ObjectRef player$1; private final CraftingManager cm$1; private final IntRef countCrafted$1; private final ItemStack originalCraft$1; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { while (this.countCrafted$1.elem < this.wantedCount$1) { ItemStack result = this.cm$1.func_82787_a(this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$$outer().li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory(), this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$$outer().host().world()); if (result == null || result.field_77994_a < 1) throw scala.util.control.Breaks$.MODULE$.break();  if (this.originalCraft$1.func_77969_a(result)) { this.countCrafted$1.elem += result.field_77994_a; FMLCommonHandler.instance().firePlayerCraftingEvent((EntityPlayer)this.player$1.elem, result, (IInventory)this.$outer); ArrayBuffer surplus = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty(); scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), this.$outer.func_70302_i_()).foreach((Function1)new UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$1(this, surplus)); this.$outer.save((IInventory)((EntityPlayer)this.player$1.elem).field_71071_by); li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory(result, (EntityPlayer)this.player$1.elem, li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory$default$3()); surplus.foreach((Function1)new UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$2(this)); this.$outer.load((IInventory)((EntityPlayer)this.player$1.elem).field_71071_by); continue; }  throw scala.util.control.Breaks$.MODULE$.break(); }  } public UpgradeCrafting$CraftingInventory$$anonfun$craft$1(UpgradeCrafting.CraftingInventory$ $outer, int wantedCount$1, ObjectRef player$1, CraftingManager cm$1, IntRef countCrafted$1, ItemStack originalCraft$1) {} public final class UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final ArrayBuffer surplus$1; public UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$1(UpgradeCrafting$CraftingInventory$$anonfun$craft$1 $outer, ArrayBuffer surplus$1) {} public final Object apply(int slot) { ItemStack stack = this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$anonfun$$$outer().func_70301_a(slot); this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$anonfun$$$outer().func_70298_a(slot, 1); Item item = stack.func_77973_b(); ItemStack container = item.getContainerItem(stack); this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$anonfun$$$outer().func_70299_a(slot, container); return (stack == null) ? BoxedUnit.UNIT : (item.hasContainerItem(stack) ? ((container.func_77984_f() && container.func_77960_j() > container.func_77958_k()) ? BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new PlayerDestroyItemEvent((EntityPlayer)this.$outer.player$1.elem, container))) : ((!container.func_77973_b().func_77630_h(container) && this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$anonfun$$$outer().func_70301_a(slot) == null) ? BoxedUnit.UNIT : this.surplus$1.$plus$eq(container))) : BoxedUnit.UNIT); } } public final class UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*  58 */         public static final long serialVersionUID = 0L; public UpgradeCrafting$CraftingInventory$$anonfun$craft$1$$anonfun$apply$mcV$sp$2(UpgradeCrafting$CraftingInventory$$anonfun$craft$1 $outer) {} public final void apply(ItemStack stack) { li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory(stack, (EntityPlayer)this.$outer.player$1.elem, li.cil.oc.util.InventoryUtils$.MODULE$.addToPlayerInventory$default$3()); } } } public Seq<?> craft(int wantedCount) { ObjectRef player = ObjectRef.create(this.$outer.host().player());
/*  59 */       load((IInventory)((EntityPlayer)player.elem).field_71071_by);
/*  60 */       CraftingManager cm = CraftingManager.func_77594_a();
/*  61 */       IntRef countCrafted = IntRef.create(0);
/*  62 */       ItemStack originalCraft = cm.func_82787_a(this.$outer.li$cil$oc$server$component$UpgradeCrafting$$CraftingInventory(), this.$outer.host().world());
/*  63 */       if (originalCraft == null) {
/*  64 */         return (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), BoxesRunTime.boxToInteger(0) }));
/*     */       }
/*  66 */       scala.util.control.Breaks$.MODULE$.breakable(
/*  67 */           (Function0)new UpgradeCrafting$CraftingInventory$$anonfun$craft$1(this, wantedCount, player, cm, countCrafted, originalCraft));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 103 */       return (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(!(originalCraft == null)), BoxesRunTime.boxToInteger(countCrafted.elem) })); }
/*     */ 
/*     */     
/*     */     public void load(IInventory inventory) {
/* 107 */       amountPossible_$eq(2147483647); scala.runtime.RichInt$.MODULE$
/* 108 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new UpgradeCrafting$CraftingInventory$$anonfun$load$1(this, inventory)); } public final class UpgradeCrafting$CraftingInventory$$anonfun$load$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public UpgradeCrafting$CraftingInventory$$anonfun$load$1(UpgradeCrafting.CraftingInventory$ $outer, IInventory inventory$1) {} public void apply$mcVI$sp(int slot) {
/* 109 */         ItemStack stack = this.inventory$1.func_70301_a(this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$toParentSlot(slot));
/* 110 */         this.$outer.func_70299_a(slot, stack);
/* 111 */         if (stack != null) {
/* 112 */           this.$outer.amountPossible_$eq(scala.math.package$.MODULE$.min(this.$outer.amountPossible(), stack.field_77994_a));
/*     */         }
/*     */       } }
/*     */ 
/*     */     
/*     */     public void save(IInventory inventory) {
/* 118 */       scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new UpgradeCrafting$CraftingInventory$$anonfun$save$1(this, inventory)); } public final class UpgradeCrafting$CraftingInventory$$anonfun$save$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$2; public final void apply(int slot) { apply$mcVI$sp(slot); } public UpgradeCrafting$CraftingInventory$$anonfun$save$1(UpgradeCrafting.CraftingInventory$ $outer, IInventory inventory$2) {} public void apply$mcVI$sp(int slot) {
/* 119 */         this.inventory$2.func_70299_a(this.$outer.li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$toParentSlot(slot), this.$outer.func_70301_a(slot));
/*     */       } }
/*     */ 
/*     */     
/*     */     public int li$cil$oc$server$component$UpgradeCrafting$CraftingInventory$$toParentSlot(int slot) {
/* 124 */       int col = slot % 3;
/* 125 */       int row = slot / 3;
/* 126 */       return row * 4 + col;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeCrafting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */