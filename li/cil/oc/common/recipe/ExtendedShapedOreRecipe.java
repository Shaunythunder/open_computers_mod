/*   */ package li.cil.oc.common.recipe;
/*   */ import net.minecraft.inventory.InventoryCrafting;
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001y2A!\001\002\001\033\t9R\t\037;f]\022,Gm\0255ba\026$wJ]3SK\016L\007/\032\006\003\007\021\taA]3dSB,'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\027\033\005\001\"BA\t\023\003\035y'/\0323jGRT!a\005\013\002\0355Lg.Z2sC\032$hm\034:hK*\tQ#A\002oKRL!a\006\t\003\037MC\027\r]3e\037J,'+Z2ja\026D\001\"\007\001\003\002\003\006IAG\001\007e\026\034X\017\034;\021\005m\001S\"\001\017\013\005uq\022\001B5uK6T!a\b\013\002\0235Lg.Z2sC\032$\030BA\021\035\005%IE/Z7Ti\006\0347\016\003\005$\001\t\005\t\025!\003%\003-Ign\032:fI&,g\016^:\021\007\025B#&D\001'\025\0059\023!B:dC2\f\027BA\025'\005)a$/\0329fCR,GM\020\t\003K-J!\001\f\024\003\r\005s\027PU3g\021\025q\003\001\"\0010\003\031a\024N\\5u}Q\031\001GM\032\021\005E\002Q\"\001\002\t\013ei\003\031\001\016\t\013\rj\003\031\001\023\t\013U\002A\021\t\034\002#\035,Go\021:bMRLgn\032*fgVdG\017\006\002\033o!)\001\b\016a\001s\005I\021N\034<f]R|'/\037\t\003uqj\021a\017\006\003qyI!!P\036\003#%sg/\0328u_JL8I]1gi&tw\r")
/*   */ public class ExtendedShapedOreRecipe extends ShapedOreRecipe {
/*   */   public ExtendedShapedOreRecipe(ItemStack result, Seq ingredients) {
/* 7 */     super(result, (Object[])ingredients.toArray(ClassTag$.MODULE$.AnyRef()));
/*   */   } public ItemStack func_77572_b(InventoryCrafting inventory) {
/* 9 */     return ExtendedRecipe$.MODULE$.addNBTToResult((IRecipe)this, super.func_77572_b(inventory), inventory);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\ExtendedShapedOreRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */