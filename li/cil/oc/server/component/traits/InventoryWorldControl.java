/*     */ package li.cil.oc.server.component.traits;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\raaB\001\003!\003\r\ta\004\002\026\023:4XM\034;pef<vN\0357e\007>tGO]8m\025\t\031A!\001\004ue\006LGo\035\006\003\013\031\t\021bY8na>tWM\034;\013\005\035A\021AB:feZ,'O\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\031R\001\001\t\0275u\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007CA\f\031\033\005\021\021BA\r\003\0059IeN^3oi>\024\0300Q<be\026\004\"aF\016\n\005q\021!AC,pe2$\027i^1sKB\021qCH\005\003?\t\021abU5eKJ+7\017\036:jGR,G\rC\003\"\001\021\005!%\001\004%S:LG\017\n\013\002GA\021\021\003J\005\003KI\021A!\0268ji\")q\005\001C\001Q\00591m\\7qCJ,GcA\025-mA\031\021C\013\t\n\005-\022\"!B!se\006L\b\"B\027'\001\004q\023aB2p]R,\007\020\036\t\003_Qj\021\001\r\006\003cI\nq!\\1dQ&tWM\003\0024\021\005\031\021\r]5\n\005U\002$aB\"p]R,\007\020\036\005\006o\031\002\r\001O\001\005CJ<7\017\005\0020s%\021!\b\r\002\n\003J<W/\\3oiNDCA\n\037@\001B\021q&P\005\003}A\022\001bQ1mY\n\f7m[\001\004I>\034\027%A!\002\003g1WO\\2uS>t\007f]5eKjrW/\0342fenc\003EZ;{ufT$m\\8mK\006tWHZ1mg\026l\026F\0172p_2,\027M\034\021.[\001\032u.\0349be\026\004C\017[3!E2|7m\033\021p]\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3!o&$\b\016\t;iK\002zg.\032\021j]\002\"\b.\032\021tK2,7\r^3eAMdw\016\036\030!%\026$XO\0358tAQ\024X/\032\021jM\002*\027/^1m]!)1\t\001C\001\t\006!AM]8q)\rISI\022\005\006[\t\003\rA\f\005\006o\t\003\r\001\017\025\005\005rz\004*I\001J\003I4WO\\2uS>t\007f]5eKjrW/\0342fenc\003eY8v]RTd.^7cKJld\007N/*u\t|w\016\\3b]\002jS\006\t#s_B\034\b%\033;f[N\004cM]8nAQDW\rI:fY\026\034G/\0323!g2|G\017\t;po\006\024Hm\035\021uQ\026\0043\017]3dS\032LW\r\032\021tS\022,g\006C\003L\001\021\005A*A\007tk\016\\gI]8n\023R,Wn\035\013\003\033B\003\"!\005(\n\005=\023\"aA%oi\")\021K\023a\001%\0061a-Y2j]\036\004\"a\025/\016\003QS!!\026,\002\tU$\030\016\034\006\003/b\013aaY8n[>t'BA-[\0039i\027N\\3de\0064GOZ8sO\026T\021aW\001\004]\026$\030BA/U\00591uN]4f\t&\024Xm\031;j_:DQa\030\001\005\002\001\fAa];dWR\031\021&\0312\t\0135r\006\031\001\030\t\013]r\006\031\001\035)\tyct\bZ\021\002K\006Qf-\0368di&|g\016K:jI\026Td.^7cKJ\\F\006I2pk:$(H\\;nE\026\024XH\016\033^Si\022wn\0347fC:\004S&\f\021Tk\016\\\007%\0369!SR,Wn\035\021ge>l\007\005\0365fAM\004XmY5gS\026$\007e]5eK:BQa\032\001\005\022!\fQb];dW\006\024G.Z%uK6\034HCA5|!\rQw.]\007\002W*\021A.\\\001\b[V$\030M\0317f\025\tq'#\001\006d_2dWm\031;j_:L!\001]6\003\r\t+hMZ3s!\t\021\0300D\001t\025\t!X/\001\003ji\026l'B\001<x\003\031)g\016^5us*\021\001PW\001\n[&tWm\031:bMRL!A_:\003\025\025sG/\033;z\023R,W\016C\003}M\002\007!+\001\003tS\022,\007\"\002@\001\t#y\030!D8o'V\0347nQ8mY\026\034G\017F\002$\003\003AQA^?A\002E\004")
/*     */ public interface InventoryWorldControl
/*     */   extends InventoryAware, WorldAware, SideRestricted
/*     */ {
/*     */   @Callback(doc = "function(side:number[, fuzzy:boolean=false]):boolean -- Compare the block on the specified side with the one in the selected slot. Returns true if equal.")
/*     */   Object[] compare(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(side:number[, count:number=64]):boolean -- Drops items from the selected slot towards the specified side.")
/*     */   Object[] drop(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   int suckFromItems(ForgeDirection paramForgeDirection);
/*     */   
/*     */   @Callback(doc = "function(side:number[, count:number=64]):boolean -- Suck up items from the specified side.")
/*     */   Object[] suck(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   Buffer<EntityItem> suckableItems(ForgeDirection paramForgeDirection);
/*     */   
/*     */   void onSuckCollect(EntityItem paramEntityItem);
/*     */   
/*     */   public final class InventoryWorldControl$$anonfun$1
/*     */     extends AbstractFunction1<EntityItem, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public InventoryWorldControl$$anonfun$1(InventoryWorldControl $outer) {}
/*     */     
/*     */     public final boolean apply(EntityItem item) {
/*     */       // Byte code:
/*     */       //   0: new net/minecraftforge/event/entity/item/ItemTossEvent
/*     */       //   3: dup
/*     */       //   4: aload_1
/*     */       //   5: aload_0
/*     */       //   6: getfield $outer : Lli/cil/oc/server/component/traits/InventoryWorldControl;
/*     */       //   9: invokeinterface fakePlayer : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   14: invokespecial <init> : (Lnet/minecraft/entity/item/EntityItem;Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   17: astore_2
/*     */       //   18: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */       //   21: aload_2
/*     */       //   22: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */       //   25: istore_3
/*     */       //   26: aload_2
/*     */       //   27: invokevirtual hasResult : ()Z
/*     */       //   30: ifeq -> 67
/*     */       //   33: aload_2
/*     */       //   34: invokevirtual getResult : ()Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */       //   37: getstatic cpw/mods/fml/common/eventhandler/Event$Result.DENY : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */       //   40: astore #5
/*     */       //   42: dup
/*     */       //   43: ifnonnull -> 55
/*     */       //   46: pop
/*     */       //   47: aload #5
/*     */       //   49: ifnull -> 63
/*     */       //   52: goto -> 67
/*     */       //   55: aload #5
/*     */       //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   60: ifeq -> 67
/*     */       //   63: iconst_1
/*     */       //   64: goto -> 68
/*     */       //   67: iconst_0
/*     */       //   68: istore #4
/*     */       //   70: iload_3
/*     */       //   71: ifne -> 79
/*     */       //   74: iload #4
/*     */       //   76: ifeq -> 83
/*     */       //   79: iconst_0
/*     */       //   80: goto -> 84
/*     */       //   83: iconst_1
/*     */       //   84: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #61	-> 0
/*     */       //   #62	-> 18
/*     */       //   #63	-> 26
/*     */       //   #64	-> 70
/*     */       //   #60	-> 84
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	85	0	this	Lli/cil/oc/server/component/traits/InventoryWorldControl$$anonfun$1;
/*     */       //   0	85	1	item	Lnet/minecraft/entity/item/EntityItem;
/*     */       //   18	67	2	event	Lnet/minecraftforge/event/entity/item/ItemTossEvent;
/*     */       //   26	59	3	canceled	Z
/*     */       //   70	15	4	denied	Z
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InventoryWorldControl$$anonfun$suckFromItems$1
/*     */     extends AbstractFunction1<EntityItem, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public InventoryWorldControl$$anonfun$suckFromItems$1(InventoryWorldControl $outer) {}
/*     */     
/*     */     public final boolean apply(EntityItem entity) {
/*  84 */       return (!entity.field_70128_L && entity.field_145804_b <= 0); } } public final class InventoryWorldControl$$anonfun$suckFromItems$2 extends AbstractFunction1<EntityItem, BoxedUnit> implements Serializable { public final void apply(EntityItem entity) {
/*  85 */       ItemStack stack = entity.func_92059_d();
/*  86 */       int size = stack.field_77994_a;
/*  87 */       this.$outer.onSuckCollect(entity);
/*  88 */       if (stack.field_77994_a < size)
/*  89 */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, size - stack.field_77994_a); 
/*  90 */       if (entity.field_70128_L)
/*  91 */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, size); 
/*     */     }
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public InventoryWorldControl$$anonfun$suckFromItems$2(InventoryWorldControl $outer, Object nonLocalReturnKey1$1) {} }
/*     */ 
/*     */   
/*     */   public final class InventoryWorldControl$$anonfun$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(ItemStack x$1) {
/* 104 */       ItemStack x$6 = x$1; IInventory x$7 = this.$outer.inventory(); Option x$8 = Option$.MODULE$.apply(this.$outer.insertionSlots()), x$9 = InventoryUtils$.MODULE$.insertIntoInventory$default$3(); int x$10 = InventoryUtils$.MODULE$.insertIntoInventory$default$4(); boolean x$11 = InventoryUtils$.MODULE$.insertIntoInventory$default$5(); InventoryUtils$.MODULE$.insertIntoInventory(x$6, x$7, x$9, x$10, x$11, x$8);
/*     */     }
/*     */     
/*     */     public InventoryWorldControl$$anonfun$2(InventoryWorldControl $outer) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryWorldControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */