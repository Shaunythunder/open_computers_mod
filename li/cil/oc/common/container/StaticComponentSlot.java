/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u3A!\001\002\001\033\t\0312\013^1uS\016\034u.\0349p]\026tGo\0257pi*\0211\001B\001\nG>tG/Y5oKJT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\0019A\002CA\b\027\033\005\001\"BA\t\023\003%IgN^3oi>\024\030P\003\002\024)\005IQ.\0338fGJ\fg\r\036\006\002+\005\031a.\032;\n\005]\001\"\001B*m_R\004\"!\007\016\016\003\tI!a\007\002\003\033\r{W\016]8oK:$8\013\\8u\021!\031\001A!b\001\n\003iR#\001\020\021\005ey\022B\001\021\003\005\031\001F.Y=fe\"A!\005\001B\001B\003%a$\001\006d_:$\030-\0338fe\002B\001\"\005\001\003\002\003\006I\001\n\t\003\037\025J!A\n\t\003\025%KeN^3oi>\024\030\020\003\005)\001\t\005\t\025!\003*\003\025Ig\016Z3y!\tQS&D\001,\025\005a\023!B:dC2\f\027B\001\030,\005\rIe\016\036\005\ta\001\021\t\021)A\005S\005\t\001\020\003\0053\001\t\005\t\025!\003*\003\005I\b\002\003\033\001\005\013\007I\021A\033\002\tMdw\016^\013\002mA\021qG\017\b\003UaJ!!O\026\002\rA\023X\rZ3g\023\tYDH\001\004TiJLgn\032\006\003s-B\001B\020\001\003\002\003\006IAN\001\006g2|G\017\t\005\t\001\002\021)\031!C\001\003\006!A/[3s+\005I\003\002C\"\001\005\003\005\013\021B\025\002\013QLWM\035\021\t\013\025\003A\021\001$\002\rqJg.\033;?)!9\005*\023&L\0316s\005CA\r\001\021\025\031A\t1\001\037\021\025\tB\t1\001%\021\025AC\t1\001*\021\025\001D\t1\001*\021\025\021D\t1\001*\021\025!D\t1\0017\021\025\001E\t1\001*\021\035\001\006A1A\005\002E\013\001\002^5fe&\033wN\\\013\002%B\0211KV\007\002)*\021QKE\001\005kRLG.\003\002X)\n)\021*S2p]\"1\021\f\001Q\001\nI\013\021\002^5fe&\033wN\034\021\t\013m\003A\021\t/\002#\035,Go\0257piN#\030mY6MS6LG\017F\001*\001")
/*    */ public class StaticComponentSlot extends Slot implements ComponentSlot {
/*    */   private final Player container;
/*    */   private final String slot;
/*    */   
/*  8 */   public Option<Function1<Slot, BoxedUnit>> changeListener() { return this.changeListener; } private final int tier; private final IIcon tierIcon; private Option<Function1<Slot, BoxedUnit>> changeListener; public void changeListener_$eq(Option<Function1<Slot, BoxedUnit>> x$1) { this.changeListener = x$1; } @SideOnly(Side.CLIENT) public boolean func_111238_b() { return ComponentSlot$class.func_111238_b(this); } public boolean func_75214_a(ItemStack stack) { return ComponentSlot$class.isItemValid(this, stack); } public void func_82870_a(EntityPlayer player, ItemStack stack) { ComponentSlot$class.onPickupFromSlot(this, player, stack); } public void func_75215_d(ItemStack stack) { ComponentSlot$class.putStack(this, stack); } public void func_75218_e() { ComponentSlot$class.onSlotChanged(this); } public void clearIfInvalid(EntityPlayer player) { ComponentSlot$class.clearIfInvalid(this, player); } public Player container() { return this.container; } public String slot() { return this.slot; } public int tier() { return this.tier; } public StaticComponentSlot(Player container, IInventory inventory, int index, int x, int y, String slot, int tier) { super(inventory, index, x, y); ComponentSlot$class.$init$(this);
/*  9 */     setBackgroundIcon(Icons$.MODULE$.get(slot));
/*    */     
/* 11 */     this.tierIcon = Icons$.MODULE$.get(tier); } public IIcon tierIcon() { return this.tierIcon; }
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
/*    */     //   #14	-> 0
/*    */     //   #15	-> 5
/*    */     //   #16	-> 122
/*    */     //   #17	-> 158
/*    */     //   #14	-> 161
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	164	0	this	Lli/cil/oc/common/container/StaticComponentSlot;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\StaticComponentSlot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */