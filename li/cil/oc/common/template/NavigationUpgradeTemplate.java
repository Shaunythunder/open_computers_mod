/*    */ package li.cil.oc.common.template;@ScalaSignature(bytes = "\006\001q:Q!\001\002\t\0025\t\021DT1wS\036\fG/[8o+B<'/\0313f)\026l\007\017\\1uK*\0211\001B\001\ti\026l\007\017\\1uK*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\rOCZLw-\031;j_:,\006o\032:bI\026$V-\0349mCR,7CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!\004\005\0069=!\t!H\001\023g\026dWm\031;ESN\f7o]3nE2,'\017\006\002\037CA\0211cH\005\003AQ\021qAQ8pY\026\fg\016C\003#7\001\0071%A\003ti\006\0347\016\005\002%W5\tQE\003\002'O\005!\021\016^3n\025\tA\023&A\005nS:,7M]1gi*\t!&A\002oKRL!\001L\023\003\023%#X-\\*uC\016\\\007\"\002\030\020\t\003y\023a\0033jg\006\0348/Z7cY\026$2\001M\0325!\r\031\022gI\005\003eQ\021Q!\021:sCfDQAI\027A\002\rBQ!N\027A\002A\n1\"\0338he\026$\027.\0328ug\")qg\004C\001q\005A!/Z4jgR,'\017F\001:!\t\031\"(\003\002<)\t!QK\\5u\001")
/*    */ public final class NavigationUpgradeTemplate { public static void register() {
/*    */     NavigationUpgradeTemplate$.MODULE$.register();
/*    */   }
/*    */   
/*    */   public static ItemStack[] disassemble(ItemStack paramItemStack, ItemStack[] paramArrayOfItemStack) {
/*    */     return NavigationUpgradeTemplate$.MODULE$.disassemble(paramItemStack, paramArrayOfItemStack);
/*    */   }
/*    */   
/*    */   public static boolean selectDisassembler(ItemStack paramItemStack) {
/*    */     return NavigationUpgradeTemplate$.MODULE$.selectDisassembler(paramItemStack);
/*    */   }
/*    */   
/*    */   public final class NavigationUpgradeTemplate$$anonfun$disassemble$1 extends AbstractFunction1<ItemStack, ItemStack> implements Serializable { public final ItemStack apply(ItemStack x0$1) {
/* 15 */       ItemStack itemStack = x0$1;
/* 16 */       ItemMap itemMap = Items.field_151098_aY; if (itemStack.func_77973_b() == null) { itemStack.func_77973_b(); if (itemMap != null)
/* 17 */           ItemStack itemStack1 = itemStack;  } else { if (itemStack.func_77973_b().equals(itemMap)) return this.info$1.map();  ItemStack itemStack1 = itemStack; }
/*    */       
/*    */       return this.info$1.map();
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NavigationUpgradeData info$1;
/*    */     
/*    */     public NavigationUpgradeTemplate$$anonfun$disassemble$1(NavigationUpgradeData info$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\NavigationUpgradeTemplate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */