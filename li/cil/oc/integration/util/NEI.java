/*    */ package li.cil.oc.integration.util;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001U<Q!\001\002\t\0025\t1AT#J\025\t\031A!\001\003vi&d'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\002O\013&\033\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\004\035\037\t\007I\021A\017\002\027!LG\rZ3o\023R,Wn]\013\002=A\031q\004\n\024\016\003\001R!!\t\022\002\0175,H/\0312mK*\0211\005F\001\013G>dG.Z2uS>t\027BA\023!\005\r\031V\r\036\t\004'\035J\023B\001\025\025\005%1UO\\2uS>t\007\007\005\002+c5\t1F\003\002-[\005!\021\016^3n\025\tqs&A\005nS:,7M]1gi*\t\001'A\002oKRL!AM\026\003\023%#X-\\*uC\016\\\007B\002\033\020A\003%a$\001\007iS\022$WM\\%uK6\034\b\005C\0037\037\021\005q'\001\bjg&s\007/\036;G_\016,8/\0323\026\003a\002\"aE\035\n\005i\"\"a\002\"p_2,\027M\034\005\006y=!IaN\001\020SNLe\016];u\r>\034Wo]3ea!)ah\004C\001\005a\001n\034<fe\026$7\013^1dWR!\001iQ(U!\r\031\022)K\005\003\005R\021aa\0249uS>t\007\"\002#>\001\004)\025!C2p]R\f\027N\\3s!\t1U*D\001H\025\tA\025*A\005j]Z,g\016^8ss*\021!jS\001\004OVL'B\001'.\003\031\031G.[3oi&\021aj\022\002\r\017VL7i\0348uC&tWM\035\005\006!v\002\r!U\001\007[>,8/\032-\021\005M\021\026BA*\025\005\rIe\016\036\005\006+v\002\r!U\001\007[>,8/Z-\t\013]{A\021\002-\002\033!|g/\032:fIN#\030mY61)\021I\023LW.\t\013\0213\006\031A#\t\013A3\006\031A)\t\013U3\006\031A)\t\013u{A\021\0010\002\t!LG-\032\013\003?\n\004\"a\0051\n\005\005$\"\001B+oSRDQa\031/A\002\021\fQA\0317pG.\004\"!Z4\016\003\031T!aY\027\n\005!4'!\002\"m_\016\\\007\"B/\020\t\003QGCA0l\021\025a\023\0161\001m!\ti7/D\001o\025\ty\007/\001\004ue\006LGo\035\006\003YET!A\035\004\002\r\r|W.\\8o\023\t!hN\001\005EK2,w-\031;f\001")
/*    */ public final class NEI {
/*    */   public static void hide(Delegate paramDelegate) {
/*    */     NEI$.MODULE$.hide(paramDelegate);
/*    */   }
/*    */   
/*    */   public static void hide(Block paramBlock) {
/*    */     NEI$.MODULE$.hide(paramBlock);
/*    */   }
/*    */   
/*    */   public static Option<ItemStack> hoveredStack(GuiContainer paramGuiContainer, int paramInt1, int paramInt2) {
/*    */     return NEI$.MODULE$.hoveredStack(paramGuiContainer, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public static boolean isInputFocused() {
/*    */     return NEI$.MODULE$.isInputFocused();
/*    */   }
/*    */   
/*    */   public static Set<Function0<ItemStack>> hiddenItems() {
/*    */     return NEI$.MODULE$.hiddenItems();
/*    */   }
/*    */   
/*    */   public final class NEI$$anonfun$hide$1 extends AbstractFunction0<ItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final ItemStack apply() {
/* 30 */       return new ItemStack(this.block$1);
/*    */     } private final Block block$1; public NEI$$anonfun$hide$1(Block block$1) {} } public final class NEI$$anonfun$hide$2 extends AbstractFunction0<ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Delegate item$1; public final ItemStack apply() {
/* 32 */       return this.item$1.createItemStack(this.item$1.createItemStack$default$1());
/*    */     }
/*    */     
/*    */     public NEI$$anonfun$hide$2(Delegate item$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\NEI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */