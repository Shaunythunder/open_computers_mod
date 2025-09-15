/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]a\001B\001\003\0015\021A\003R=oC6L7mQ8na>tWM\034;TY>$(BA\002\005\003%\031wN\034;bS:,'O\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001a\002\007\t\003\037Yi\021\001\005\006\003#I\t\021\"\0338wK:$xN]=\013\005M!\022!C7j]\026\034'/\0314u\025\005)\022a\0018fi&\021q\003\005\002\005'2|G\017\005\002\03255\t!!\003\002\034\005\ti1i\\7q_:,g\016^*m_RD\001b\001\001\003\006\004%\t!H\013\002=A\021\021dH\005\003A\t\021a\001\0257bs\026\024\b\002\003\022\001\005\003\005\013\021\002\020\002\025\r|g\016^1j]\026\024\b\005\003\005\022\001\t\005\t\025!\003%!\tyQ%\003\002'!\tQ\021*\0238wK:$xN]=\t\021!\002!\021!Q\001\n%\nQ!\0338eKb\004\"AK\027\016\003-R\021\001L\001\006g\016\fG.Y\005\003]-\0221!\0238u\021!\001\004A!A!\002\023I\023!\001=\t\021I\002!\021!Q\001\n%\n\021!\037\005\ti\001\021)\031!C\001k\005!\021N\0344p+\0051\004\003\002\0268siJ!\001O\026\003\023\031+hn\031;j_:\f\004CA\r\001!\tY\024J\004\002=\017:\021QH\022\b\003}\025s!a\020#\017\005\001\033U\"A!\013\005\tc\021A\002\037s_>$h(C\001\f\023\tI!\"\003\002\b\021%\021QAB\005\003\021\022\ta\"\0238wK:$xN]=TY>$8/\003\002K\027\ni\021J\034<f]R|'/_*m_RT!\001\023\003\t\0215\003!\021!Q\001\nY\nQ!\0338g_\002B\001b\024\001\003\006\004%\t\001U\001\024G>tG/Y5oKJ$\026.\032:HKR$XM]\013\002#B\031!FU\025\n\005M[#!\003$v]\016$\030n\03481\021!)\006A!A!\002\023\t\026\001F2p]R\f\027N\\3s)&,'oR3ui\026\024\b\005C\003X\001\021\005\001,\001\004=S:LGO\020\013\tseS6\fX/_?\")1A\026a\001=!)\021C\026a\001I!)\001F\026a\001S!)\001G\026a\001S!)!G\026a\001S!)AG\026a\001m!)qJ\026a\001#\")\021\r\001C!E\006!A/[3s+\005I\003\"\0023\001\t\003)\027\001\003;jKJL5m\0348\026\003\031\004\"a\0326\016\003!T!!\033\n\002\tU$\030\016\\\005\003W\"\024Q!S%d_:DQ!\034\001\005\0029\fAa\0357piV\tq\016\005\002qg:\021!&]\005\003e.\na\001\025:fI\0264\027B\001;v\005\031\031FO]5oO*\021!o\013\005\006o\002!\t\005_\001\027O\026$()Y2lOJ|WO\0343JG>t\027J\0343fqR\ta\rC\003{\001\021\00530A\thKR\034Fn\034;Ti\006\0347\016T5nSR$\022!\013\005\006{\002!\tF`\001\017G2,\027M]%g\023:4\030\r\\5e)\ry\030Q\001\t\004U\005\005\021bAA\002W\t!QK\\5u\021\035\t9\001 a\001\003\023\ta\001\0357bs\026\024\b\003BA\006\003'i!!!\004\013\t\005\035\021q\002\006\004\003#\021\022AB3oi&$\0300\003\003\002\026\0055!\001D#oi&$\030\020\0257bs\026\024\b")
/*    */ public class DynamicComponentSlot extends Slot implements ComponentSlot {
/*    */   private final Player container;
/*    */   private final Function1<DynamicComponentSlot, InventorySlots.InventorySlot> info;
/*    */   
/* 12 */   public Option<Function1<Slot, BoxedUnit>> changeListener() { return this.changeListener; } private final Function0<Object> containerTierGetter; private Option<Function1<Slot, BoxedUnit>> changeListener; @TraitSetter public void changeListener_$eq(Option<Function1<Slot, BoxedUnit>> x$1) { this.changeListener = x$1; } @SideOnly(Side.CLIENT) public boolean func_111238_b() { return ComponentSlot$class.func_111238_b(this); } public boolean func_75214_a(ItemStack stack) { return ComponentSlot$class.isItemValid(this, stack); } public void func_82870_a(EntityPlayer player, ItemStack stack) { ComponentSlot$class.onPickupFromSlot(this, player, stack); } public void func_75215_d(ItemStack stack) { ComponentSlot$class.putStack(this, stack); } public void func_75218_e() { ComponentSlot$class.onSlotChanged(this); } public Player container() { return this.container; } public Function1<DynamicComponentSlot, InventorySlots.InventorySlot> info() { return this.info; } public Function0<Object> containerTierGetter() { return this.containerTierGetter; } public DynamicComponentSlot(Player container, IInventory inventory, int index, int x, int y, Function1<DynamicComponentSlot, InventorySlots.InventorySlot> info, Function0<Object> containerTierGetter) { super(inventory, index, x, y); ComponentSlot$class.$init$(this); }
/*    */    public int tier() {
/* 14 */     int mainTier = containerTierGetter().apply$mcI$sp();
/* 15 */     return (mainTier >= 0) ? ((InventorySlots.InventorySlot)info().apply(this)).tier() : 
/* 16 */       mainTier;
/*    */   }
/*    */   public IIcon tierIcon() {
/* 19 */     return Icons$.MODULE$.get(tier());
/*    */   }
/*    */   public String slot() {
/* 22 */     int mainTier = containerTierGetter().apply$mcI$sp();
/* 23 */     return (mainTier >= 0) ? ((InventorySlots.InventorySlot)info().apply(this)).slot() : 
/* 24 */       Slot$.MODULE$.None();
/*    */   }
/*    */   public IIcon func_75212_b() {
/* 27 */     return Icons$.MODULE$.get(slot());
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_75219_a() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual slot : ()Ljava/lang/String;
/*    */     //   4: astore_1
/*    */     //   5: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   8: invokevirtual Tool : ()Ljava/lang/String;
/*    */     //   11: aload_1
/*    */     //   12: astore_2
/*    */     //   13: dup
/*    */     //   14: ifnonnull -> 25
/*    */     //   17: pop
/*    */     //   18: aload_2
/*    */     //   19: ifnull -> 32
/*    */     //   22: goto -> 37
/*    */     //   25: aload_2
/*    */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   29: ifeq -> 37
/*    */     //   32: iconst_1
/*    */     //   33: istore_3
/*    */     //   34: goto -> 109
/*    */     //   37: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   40: invokevirtual Any : ()Ljava/lang/String;
/*    */     //   43: aload_1
/*    */     //   44: astore #4
/*    */     //   46: dup
/*    */     //   47: ifnonnull -> 59
/*    */     //   50: pop
/*    */     //   51: aload #4
/*    */     //   53: ifnull -> 67
/*    */     //   56: goto -> 72
/*    */     //   59: aload #4
/*    */     //   61: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   64: ifeq -> 72
/*    */     //   67: iconst_1
/*    */     //   68: istore_3
/*    */     //   69: goto -> 109
/*    */     //   72: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   75: invokevirtual Filtered : ()Ljava/lang/String;
/*    */     //   78: aload_1
/*    */     //   79: astore #5
/*    */     //   81: dup
/*    */     //   82: ifnonnull -> 94
/*    */     //   85: pop
/*    */     //   86: aload #5
/*    */     //   88: ifnull -> 102
/*    */     //   91: goto -> 107
/*    */     //   94: aload #5
/*    */     //   96: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   99: ifeq -> 107
/*    */     //   102: iconst_1
/*    */     //   103: istore_3
/*    */     //   104: goto -> 109
/*    */     //   107: iconst_0
/*    */     //   108: istore_3
/*    */     //   109: iload_3
/*    */     //   110: ifeq -> 122
/*    */     //   113: aload_0
/*    */     //   114: invokespecial func_75219_a : ()I
/*    */     //   117: istore #6
/*    */     //   119: goto -> 161
/*    */     //   122: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*    */     //   125: invokevirtual None : ()Ljava/lang/String;
/*    */     //   128: aload_1
/*    */     //   129: astore #7
/*    */     //   131: dup
/*    */     //   132: ifnonnull -> 144
/*    */     //   135: pop
/*    */     //   136: aload #7
/*    */     //   138: ifnull -> 152
/*    */     //   141: goto -> 158
/*    */     //   144: aload #7
/*    */     //   146: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   149: ifeq -> 158
/*    */     //   152: iconst_0
/*    */     //   153: istore #6
/*    */     //   155: goto -> 161
/*    */     //   158: iconst_1
/*    */     //   159: istore #6
/*    */     //   161: iload #6
/*    */     //   163: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 0
/*    */     //   #31	-> 5
/*    */     //   #32	-> 122
/*    */     //   #33	-> 158
/*    */     //   #30	-> 161
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	164	0	this	Lli/cil/oc/common/container/DynamicComponentSlot;
/*    */   }
/*    */ 
/*    */   
/*    */   public void clearIfInvalid(EntityPlayer player) {
/* 37 */     if (SideTracker.isServer() && func_75216_d() && !func_75214_a(func_75211_c())) {
/* 38 */       ItemStack stack = func_75211_c();
/* 39 */       func_75215_d((ItemStack)null);
/* 40 */       InventoryUtils$.MODULE$.addToPlayerInventory(stack, player, InventoryUtils$.MODULE$.addToPlayerInventory$default$3());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\DynamicComponentSlot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */