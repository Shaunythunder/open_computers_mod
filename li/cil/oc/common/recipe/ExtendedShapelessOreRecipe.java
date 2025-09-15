/*   */ package li.cil.oc.common.recipe;
/*   */ import net.minecraft.inventory.InventoryCrafting;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001y2A!\001\002\001\033\tQR\t\037;f]\022,Gm\0255ba\026dWm]:Pe\026\024VmY5qK*\0211\001B\001\007e\026\034\027\016]3\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\001\001\b\021\005=1R\"\001\t\013\005E\021\022aB8sK\022L7\r\036\006\003'Q\ta\"\\5oK\016\024\030M\032;g_J<WMC\001\026\003\rqW\r^\005\003/A\021!c\0255ba\026dWm]:Pe\026\024VmY5qK\"A\021\004\001B\001B\003%!$\001\004sKN,H\016\036\t\0037\001j\021\001\b\006\003;y\tA!\033;f[*\021q\004F\001\n[&tWm\031:bMRL!!\t\017\003\023%#X-\\*uC\016\\\007\002C\022\001\005\003\005\013\021\002\023\002\027%twM]3eS\026tGo\035\t\004K!RS\"\001\024\013\003\035\nQa]2bY\006L!!\013\024\003\025q\022X\r]3bi\026$g\b\005\002&W%\021AF\n\002\007\003:L(+\0324\t\0139\002A\021A\030\002\rqJg.\033;?)\r\001$g\r\t\003c\001i\021A\001\005\00635\002\rA\007\005\006G5\002\r\001\n\005\006k\001!\tEN\001\022O\026$8I]1gi&twMU3tk2$HC\001\0168\021\025AD\0071\001:\003%IgN^3oi>\024\030\020\005\002;y5\t1H\003\0029=%\021Qh\017\002\022\023:4XM\034;pef\034%/\0314uS:<\007")
/*   */ public class ExtendedShapelessOreRecipe extends ShapelessOreRecipe {
/*   */   public ExtendedShapelessOreRecipe(ItemStack result, Seq ingredients) {
/* 7 */     super(result, (Object[])ingredients.toArray(ClassTag$.MODULE$.AnyRef()));
/*   */   } public ItemStack func_77572_b(InventoryCrafting inventory) {
/* 9 */     return ExtendedRecipe$.MODULE$.addNBTToResult((IRecipe)this, super.func_77572_b(inventory), inventory);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\ExtendedShapelessOreRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */