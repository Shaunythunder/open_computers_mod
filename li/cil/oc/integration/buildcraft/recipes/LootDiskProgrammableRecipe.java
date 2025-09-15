/*    */ package li.cil.oc.integration.buildcraft.recipes;@ScalaSignature(bytes = "\006\001\031<Q!\001\002\t\002=\t!\004T8pi\022K7o\033)s_\036\024\030-\\7bE2,'+Z2ja\026T!a\001\003\002\017I,7-\0339fg*\021QAB\001\013EVLG\016Z2sC\032$(BA\004\t\003-Ig\016^3he\006$\030n\0348\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051C\001\016M_>$H)[:l!J|wM]1n[\006\024G.\032*fG&\004XmE\002\022)q\001\"!\006\016\016\003YQ!a\006\r\002\t1\fgn\032\006\0023\005!!.\031<b\023\tYbC\001\004PE*,7\r\036\t\003;\tj\021A\b\006\003\007}Q!\001I\021\002\007\005\004\030NC\001\006\023\t\031cD\001\nJ!J|wM]1n[&twMU3dSB,\007\"B\023\022\t\0031\023A\002\037j]&$h\bF\001\020\021\025A\023\003\"\001*\003!\021XmZ5ti\026\024H#\001\026\021\005-rS\"\001\027\013\0035\nQa]2bY\006L!a\f\027\003\tUs\027\016\036\005\006cE!\tEM\001\006O\026$\030\n\032\013\002gA\021Ag\016\b\003WUJ!A\016\027\002\rA\023X\rZ3g\023\tA\024H\001\004TiJLgn\032\006\003m1BQaO\t\005Bq\n!bZ3u\037B$\030n\0348t)\riTJ\025\t\004}\005\033U\"A \013\005\001C\022\001B;uS2L!AQ \003\t1K7\017\036\t\003\t.k\021!\022\006\003\r\036\013A!\033;f[*\021\001*S\001\n[&tWm\031:bMRT\021AS\001\004]\026$\030B\001'F\005%IE/Z7Ti\006\0347\016C\003Ou\001\007q*A\003xS\022$\b\016\005\002,!&\021\021\013\f\002\004\023:$\b\"B*;\001\004y\025A\0025fS\036DG\017C\003V#\021\005c+A\007hKR,e.\032:hs\016{7\017\036\013\003\037^CQ\001\027+A\002\r\013aa\0349uS>t\007\"\002.\022\t\003Z\026\001C2b]\016\023\030M\032;\025\005q{\006CA\026^\023\tqFFA\004C_>dW-\0318\t\013\001L\006\031A\"\002\013%t\007/\036;\t\013\t\fB\021I2\002\013\r\024\030M\032;\025\007\r#W\rC\003aC\002\0071\tC\003YC\002\0071\t")
/*    */ public final class LootDiskProgrammableRecipe { public static ItemStack craft(ItemStack paramItemStack1, ItemStack paramItemStack2) {
/*    */     return LootDiskProgrammableRecipe$.MODULE$.craft(paramItemStack1, paramItemStack2);
/*    */   }
/*    */   
/*    */   public static boolean canCraft(ItemStack paramItemStack) {
/*    */     return LootDiskProgrammableRecipe$.MODULE$.canCraft(paramItemStack);
/*    */   }
/*    */   
/*    */   public static int getEnergyCost(ItemStack paramItemStack) {
/*    */     return LootDiskProgrammableRecipe$.MODULE$.getEnergyCost(paramItemStack);
/*    */   }
/*    */   
/*    */   public static List<ItemStack> getOptions(int paramInt1, int paramInt2) {
/*    */     return LootDiskProgrammableRecipe$.MODULE$.getOptions(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public static String getId() {
/*    */     return LootDiskProgrammableRecipe$.MODULE$.getId();
/*    */   }
/*    */   
/*    */   public static void register() {
/*    */     LootDiskProgrammableRecipe$.MODULE$.register();
/*    */   }
/*    */   
/*    */   public final class LootDiskProgrammableRecipe$$anonfun$getOptions$1 extends AbstractFunction1<ItemStack, ArrayBuffer<ItemStack>> implements Serializable {
/*    */     public final ArrayBuffer<ItemStack> apply(ItemStack stack) {
/* 28 */       return this.options$1.$plus$eq(stack.func_77946_l());
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ArrayBuffer options$1;
/*    */     
/*    */     public LootDiskProgrammableRecipe$$anonfun$getOptions$1(ArrayBuffer options$1) {}
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\recipes\LootDiskProgrammableRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */