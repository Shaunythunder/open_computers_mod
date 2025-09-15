/*    */ package li.cil.oc.common.recipe;
/*    */ 
/*    */ import net.minecraft.inventory.InventoryCrafting;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.immutable.IndexedSeq;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.ObjectRef;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0314A!\001\002\001\033\t\001B)Z2pY>\024\030N_3SK\016L\007/\032\006\003\007\021\taA]3dSB,'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9\002%D\001\031\025\tI\"$\001\005de\0064G/\0338h\025\tYB$\001\003ji\026l'BA\017\037\003%i\027N\\3de\0064GOC\001 \003\rqW\r^\005\003Ca\021q!\023*fG&\004X\r\003\005$\001\t\005\t\025!\003%\003\031!\030M]4fiB\021QEJ\007\0025%\021qE\007\002\005\023R,W\016C\003*\001\021\005!&\001\004=S:LGO\020\013\003W5\002\"\001\f\001\016\003\tAQa\t\025A\002\021BQ!\013\001\005\002=\"\"a\013\031\t\013\rr\003\031A\031\021\005I*T\"A\032\013\005Qb\022!\0022m_\016\\\027B\001\0344\005\025\021En\\2l\021\035A\004A1A\005\002e\n!\002^1sO\026$\030\n^3n+\005!\003BB\036\001A\003%A%A\006uCJ<W\r^%uK6\004\003\"B\037\001\t\003r\024aB7bi\016DWm\035\013\004\025c\005C\001!D\033\005\t%\"\001\"\002\013M\034\027\r\\1\n\005\021\013%a\002\"p_2,\027M\034\005\0063q\002\rA\022\t\003\017*k\021\001\023\006\003\023r\t\021\"\0338wK:$xN]=\n\005-C%!E%om\026tGo\034:z\007J\fg\r^5oO\")Q\n\020a\001\035\006)qo\034:mIB\021q*U\007\002!*\021Q\nH\005\003%B\023QaV8sY\022DQ\001\026\001\005BU\013\021cZ3u\007J\fg\r^5oOJ+7/\0367u)\t1\026\f\005\002&/&\021\001L\007\002\n\023R,Wn\025;bG.DQ!G*A\002\031CQa\027\001\005Bq\013QbZ3u%\026\034\027\016]3TSj,G#A/\021\005\001s\026BA0B\005\rIe\016\036\005\006C\002!\tEY\001\020O\026$(+Z2ja\026|U\017\0369viR\t1\r\005\002AI&\021Q-\021\002\005\035VdG\016")
/*    */ public class DecolorizeRecipe implements IRecipe {
/*    */   private final Item targetItem;
/*    */   
/* 18 */   public DecolorizeRecipe(Item target) { this.targetItem = target; } public DecolorizeRecipe(Block target) { this(Item.func_150898_a(target)); } public final class DecolorizeRecipe$$anonfun$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final InventoryCrafting crafting$1; public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.crafting$1.func_70301_a(i))); } public DecolorizeRecipe$$anonfun$1(DecolorizeRecipe $outer, InventoryCrafting crafting$1) {} } public Item targetItem() { return this.targetItem; }
/*    */   public final class DecolorizeRecipe$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { Item item = this.$outer.targetItem(); if (stack.func_77973_b() == null) { stack.func_77973_b(); if (item != null); } else if (stack.func_77973_b().equals(item)) {  }
/* 21 */        } public DecolorizeRecipe$$anonfun$2(DecolorizeRecipe $outer) {} } public boolean func_77569_a(InventoryCrafting crafting, World world) { IndexedSeq stacks = (IndexedSeq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), crafting.func_70302_i_()).flatMap((Function1)new DecolorizeRecipe$$anonfun$1(this, crafting), IndexedSeq$.MODULE$.canBuildFrom());
/* 22 */     IndexedSeq targets = (IndexedSeq)stacks.filter((Function1)new DecolorizeRecipe$$anonfun$2(this));
/* 23 */     IndexedSeq other = (IndexedSeq)stacks.filterNot((Function1)new DecolorizeRecipe$$anonfun$3(this, targets));
/* 24 */     return (targets.size() == 1 && other.size() == 1 && other.forall((Function1)new DecolorizeRecipe$$anonfun$matches$1(this))); } public final class DecolorizeRecipe$$anonfun$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IndexedSeq targets$1; public final boolean apply(Object elem) { return this.targets$1.contains(elem); } public DecolorizeRecipe$$anonfun$3(DecolorizeRecipe $outer, IndexedSeq targets$1) {} } public final class DecolorizeRecipe$$anonfun$matches$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { Item item = Items.field_151131_as; if (x$1.func_77973_b() == null) { x$1.func_77973_b(); if (item != null); } else if (x$1.func_77973_b().equals(item))
/*    */       {  }
/*    */        } public DecolorizeRecipe$$anonfun$matches$1(DecolorizeRecipe $outer) {} }
/* 27 */   public ItemStack func_77572_b(InventoryCrafting crafting) { Object object = new Object(); 
/* 28 */     try { ObjectRef targetStack = ObjectRef.create(null); ((IterableLike)RichInt$.MODULE$
/*    */         
/* 30 */         .until$extension0(Predef$.MODULE$.intWrapper(0), crafting.func_70302_i_()).flatMap((Function1)new DecolorizeRecipe$$anonfun$getCraftingResult$1(this, crafting), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new DecolorizeRecipe$$anonfun$getCraftingResult$2(this, targetStack, object));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 39 */       if ((ItemStack)targetStack.elem == null) { null; return null; }
/*    */       
/* 41 */       ItemColorizer$.MODULE$.removeColor((ItemStack)targetStack.elem); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object)
/* 42 */         return (ItemStack)nonLocalReturnControl.value();  }  return (ItemStack)targetStack.elem; } public final class DecolorizeRecipe$$anonfun$getCraftingResult$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final InventoryCrafting crafting$2; public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.crafting$2.func_70301_a(i))); } public DecolorizeRecipe$$anonfun$getCraftingResult$1(DecolorizeRecipe $outer, InventoryCrafting crafting$2) {} } public final class DecolorizeRecipe$$anonfun$getCraftingResult$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final ObjectRef targetStack$1; private final Object nonLocalReturnKey1$1; public DecolorizeRecipe$$anonfun$getCraftingResult$2(DecolorizeRecipe $outer, ObjectRef targetStack$1, Object nonLocalReturnKey1$1) {} public final void apply(ItemStack stack) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   4: aload_0
/*    */       //   5: getfield $outer : Lli/cil/oc/common/recipe/DecolorizeRecipe;
/*    */       //   8: invokevirtual targetItem : ()Lnet/minecraft/item/Item;
/*    */       //   11: astore_2
/*    */       //   12: dup
/*    */       //   13: ifnonnull -> 24
/*    */       //   16: pop
/*    */       //   17: aload_2
/*    */       //   18: ifnull -> 31
/*    */       //   21: goto -> 59
/*    */       //   24: aload_2
/*    */       //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   28: ifeq -> 59
/*    */       //   31: aload_0
/*    */       //   32: getfield targetStack$1 : Lscala/runtime/ObjectRef;
/*    */       //   35: aload_1
/*    */       //   36: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*    */       //   39: putfield elem : Ljava/lang/Object;
/*    */       //   42: aload_0
/*    */       //   43: getfield targetStack$1 : Lscala/runtime/ObjectRef;
/*    */       //   46: getfield elem : Ljava/lang/Object;
/*    */       //   49: checkcast net/minecraft/item/ItemStack
/*    */       //   52: iconst_1
/*    */       //   53: putfield field_77994_a : I
/*    */       //   56: goto -> 86
/*    */       //   59: aload_1
/*    */       //   60: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   63: getstatic net/minecraft/init/Items.field_151131_as : Lnet/minecraft/item/Item;
/*    */       //   66: astore_3
/*    */       //   67: dup
/*    */       //   68: ifnonnull -> 79
/*    */       //   71: pop
/*    */       //   72: aload_3
/*    */       //   73: ifnull -> 86
/*    */       //   76: goto -> 87
/*    */       //   79: aload_3
/*    */       //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   83: ifeq -> 87
/*    */       //   86: return
/*    */       //   87: new scala/runtime/NonLocalReturnControl
/*    */       //   90: dup
/*    */       //   91: aload_0
/*    */       //   92: getfield nonLocalReturnKey1$1 : Ljava/lang/Object;
/*    */       //   95: aconst_null
/*    */       //   96: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */       //   99: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #31	-> 0
/*    */       //   #32	-> 31
/*    */       //   #33	-> 42
/*    */       //   #34	-> 59
/*    */       //   #31	-> 86
/*    */       //   #35	-> 87
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	100	0	this	Lli/cil/oc/common/recipe/DecolorizeRecipe$$anonfun$getCraftingResult$2;
/*    */       //   0	100	1	stack	Lnet/minecraft/item/ItemStack; } }
/* 45 */   public int func_77570_a() { return 10; }
/*    */    public Null$ getRecipeOutput() {
/* 47 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\DecolorizeRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */