/*     */ package li.cil.oc.common.template;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ @ScalaSignature(bytes = "\006\001\005=q!B\001\003\021\003i\021A\004+bE2,G\017V3na2\fG/\032\006\003\007\021\t\001\002^3na2\fG/\032\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\tqA+\0312mKR$V-\0349mCR,7CA\b\023!\tq1#\003\002\025\005\tAA+Z7qY\006$X\rC\003\027\037\021\005q#\001\004=S:LGO\020\013\002\033!9\021d\004b\001\n#R\022aE:vO\036,7\017^3e\007>l\007o\0348f]R\034X#A\016\021\007qy\022%D\001\036\025\005q\022!B:dC2\f\027B\001\021\036\005\025\t%O]1z!\021a\"\005\n\027\n\005\rj\"A\002+va2,'\007\005\002&U5\taE\003\002(Q\005!A.\0318h\025\005I\023\001\0026bm\006L!a\013\024\003\rM#(/\0338h!\021aRfL\035\n\0059j\"!\003$v]\016$\030n\03482!\t\001t'D\0012\025\t\0214'A\005j]Z,g\016^8ss*\021A'N\001\n[&tWm\031:bMRT\021AN\001\004]\026$\030B\001\0352\005)I\025J\034<f]R|'/\037\t\0039iJ!aO\017\003\017\t{w\016\\3b]\"1Qh\004Q\001\nm\tAc];hO\026\034H/\0323D_6\004xN\\3oiN\004\003\"B \020\t#\002\025!\0035pgR\034E.Y:t+\005\t\005cA\023C\t&\0211I\n\002\006\0072\f7o\035\t\003\013*k\021A\022\006\003\017\"\013\001\"\0338uKJt\027\r\034\006\003\023\032\t1!\0319j\023\tYeI\001\004UC\ndW\r\036\005\006\033>!\tAT\001\fg\026dWm\031;US\026\024\030\007\006\002:\037\")\001\013\024a\001#\006)1\017^1dWB\021!+V\007\002'*\021AkM\001\005SR,W.\003\002W'\nI\021\n^3n'R\f7m\033\005\0061>!\t!W\001\fg\026dWm\031;US\026\024(\007\006\002:5\")\001k\026a\001#\")Al\004C\001;\006q1/\0327fGR\034%/Z1uSZ,GCA\035_\021\025\0016\f1\001R\021\025\001w\002\"\001b\003!1\030\r\\5eCR,GC\0012g!\rard\031\t\0039\021L!!Z\017\003\r\005s\027PU3g\021\025\021t\f1\0010\021\025Aw\002\"\001j\003!\t7o]3nE2,GC\0012k\021\025\021t\r1\0010\021\025aw\002\"\001n\003I\031X\r\\3di\022K7/Y:tK6\024G.\032:\025\005er\007\"\002)l\001\004\t\006\"\0029\020\t\003\t\030a\0033jg\006\0348/Z7cY\026$2A]:u!\rar$\025\005\006!>\004\r!\025\005\006k>\004\rA]\001\fS:<'/\0323jK:$8\017C\003x\037\021\005\0010\001\005sK\036L7\017^3s)\005I\bC\001\017{\023\tYXD\001\003V]&$\b\"B?\020\t#r\030!D7bq\016{W\016\0357fq&$\030\020F\002\000\003\013\0012\001HA\001\023\r\t\031!\b\002\004\023:$\b\"\002\032}\001\004y\003bBA\005\037\021E\0231B\001\tG\006\034X\rV5feR\031q0!\004\t\rI\n9\0011\0010\001")
/*     */ public final class TabletTemplate { public static void register() { TabletTemplate$.MODULE$.register(); } public static ItemStack[] disassemble(ItemStack paramItemStack, ItemStack[] paramArrayOfItemStack) { return TabletTemplate$.MODULE$.disassemble(paramItemStack, paramArrayOfItemStack); } public static boolean selectDisassembler(ItemStack paramItemStack) { return TabletTemplate$.MODULE$.selectDisassembler(paramItemStack); } public static Object[] assemble(IInventory paramIInventory) { return TabletTemplate$.MODULE$.assemble(paramIInventory); } public static Object[] validate(IInventory paramIInventory) { return TabletTemplate$.MODULE$.validate(paramIInventory); } public static boolean selectCreative(ItemStack paramItemStack) { return TabletTemplate$.MODULE$.selectCreative(paramItemStack); } public static boolean selectTier2(ItemStack paramItemStack) { return TabletTemplate$.MODULE$.selectTier2(paramItemStack); } public static boolean selectTier1(ItemStack paramItemStack) { return TabletTemplate$.MODULE$.selectTier1(paramItemStack); } public static Pair<String, Integer> toPair(Tuple2<String, Object> paramTuple2) { return TabletTemplate$.MODULE$.toPair(paramTuple2); } public static boolean hasFileSystem(IInventory paramIInventory) {
/*     */     return TabletTemplate$.MODULE$.hasFileSystem(paramIInventory);
/*     */   } public static boolean hasInventory(IInventory paramIInventory) {
/*     */     return TabletTemplate$.MODULE$.hasInventory(paramIInventory);
/*     */   } public static boolean hasComponent(String paramString, IInventory paramIInventory) {
/*     */     return TabletTemplate$.MODULE$.hasComponent(paramString, paramIInventory);
/*  18 */   } public final class TabletTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public final boolean apply(IInventory inventory) { return TabletTemplate$.MODULE$.hasComponent("eeprom", inventory); } public static final long serialVersionUID = 0L; } public final class TabletTemplate$$anonfun$2 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) {
/*  19 */       return TabletTemplate$.MODULE$.hasComponent("keyboard", inventory); } } public final class TabletTemplate$$anonfun$3 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  20 */     public final boolean apply(IInventory inventory) { (new String[6])[0] = 
/*  21 */         "apuCreative";
/*  22 */       (new String[6])[1] = "apu1";
/*  23 */       (new String[6])[2] = "apu2";
/*  24 */       (new String[6])[3] = "graphicsCard1";
/*  25 */       (new String[6])[4] = "graphicsCard2";
/*  26 */       (new String[6])[5] = "graphicsCard3";
/*  27 */       return Predef$.MODULE$.refArrayOps((Object[])new String[6]).exists((Function1)new TabletTemplate$$anonfun$3$$anonfun$apply$1(this, inventory)); } public final class TabletTemplate$$anonfun$3$$anonfun$apply$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$2; public final boolean apply(String name) { return TabletTemplate$.MODULE$.hasComponent(name, this.inventory$2); } public TabletTemplate$$anonfun$3$$anonfun$apply$1(TabletTemplate$$anonfun$3 $outer, IInventory inventory$2) {} } } public final class TabletTemplate$$anonfun$4 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) {
/*  28 */       return TabletTemplate$.MODULE$.hasFileSystem(inventory);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class TabletTemplate$$anonfun$5
/*     */     extends AbstractFunction1<Object, Option<ItemStack>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IInventory inventory$1;
/*     */     
/*     */     public final Option<ItemStack> apply(int slot) {
/*  41 */       return Option$.MODULE$.apply(this.inventory$1.func_70301_a(slot));
/*     */     } public TabletTemplate$$anonfun$5(IInventory inventory$1) {} }
/*     */   public final class TabletTemplate$$anonfun$assemble$1 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L;
/*  44 */     public final None$ apply() { return None$.MODULE$; } } public final class TabletTemplate$$anonfun$assemble$2 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Option x$1) {
/*  45 */       return x$1.isDefined();
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class TabletTemplate$$anonfun$disassemble$1
/*     */     extends AbstractPartialFunction<Option<ItemStack>, ItemStack>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default)
/*     */     {
/*     */       Object object;
/*  60 */       Option option = x1;
/*  61 */       if (option instanceof Some) { Some some = (Some)option; ItemStack item = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }
/*  62 */        return bool; } } public final class TabletTemplate$$anonfun$disassemble$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) { return !(x$2 == null); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class TabletTemplate$$anonfun$register$1
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*  88 */       return TabletTemplate$.MODULE$.toPair(t);
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
/*     */   public final class TabletTemplate$$anonfun$register$2
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 114 */       return TabletTemplate$.MODULE$.toPair(t);
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
/*     */   public final class TabletTemplate$$anonfun$register$3
/*     */     extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>>
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
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/* 146 */       return TabletTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\TabletTemplate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */