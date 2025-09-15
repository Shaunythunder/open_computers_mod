/*    */ package li.cil.oc.common.item.traits;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.client.KeyBindings$;
/*    */ import li.cil.oc.util.ItemCosts$;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.WeightedRandomChestContent;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class SimpleItem$class {
/*    */   public static void $init$(SimpleItem $this) {
/* 23 */     ((Item)$this).func_77637_a((CreativeTabs)CreativeTab$.MODULE$);
/* 24 */     ((Item)$this).func_111206_d((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append($this.getClass().getSimpleName()).toString());
/*    */   }
/* 26 */   public static ItemStack createItemStack(SimpleItem $this, int amount) { return new ItemStack((Item)$this, amount); } public static int createItemStack$default$1(SimpleItem $this) { return 1; }
/*    */    public static boolean isBookEnchantable(SimpleItem $this, ItemStack stack, ItemStack book) {
/* 28 */     return false;
/*    */   } public static WeightedRandomChestContent getChestGenBase(SimpleItem $this, ChestGenHooks chest, Random rnd, WeightedRandomChestContent original) {
/* 30 */     return original;
/*    */   } public static boolean doesSneakBypassUse(SimpleItem $this, World world, int x, int y, int z, EntityPlayer player) {
/*    */     boolean bool;
/* 33 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 34 */     if (tileEntity instanceof li.cil.oc.common.tileentity.DiskDrive) { bool = true; }
/* 35 */     else { bool = $this.li$cil$oc$common$item$traits$SimpleItem$$super$doesSneakBypassUse(world, x, y, z, player); }
/*    */     
/*    */     return bool;
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void addInformation(SimpleItem $this, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 41 */     List<String> tt = tooltip;
/* 42 */     tt.addAll(Tooltip$.MODULE$.get($this.getClass().getSimpleName(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])));
/*    */ 
/*    */ 
/*    */     
/* 46 */     ItemCosts$.MODULE$.addTooltip(stack, tt); ItemCosts$.MODULE$.hasCosts(stack) ? (KeyBindings$.MODULE$.showMaterialCosts() ? BoxedUnit.UNIT : 
/*    */ 
/*    */       
/* 49 */       BoxesRunTime.boxToBoolean(tt.add(Localization$.MODULE$.localizeImmediately((
/* 50 */             new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tooltip.MaterialCosts").toString(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] {
/* 51 */                 KeyBindings$.MODULE$.getKeyBindingName(KeyBindings$.MODULE$.materialCosts())
/*    */               }))))) : BoxedUnit.UNIT;
/*    */     
/* 54 */     if (stack.func_77942_o() && stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString())) {
/* 55 */       NBTTagCompound data = stack.func_77978_p().func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/* 56 */       if (data.func_74764_b("node") && data.func_74775_l("node").func_74764_b("address"))
/* 57 */         tt.add((new StringBuilder()).append("§8").append(data.func_74775_l("node").func_74779_i("address").substring(0, 13)).append("...§7").toString()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\SimpleItem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */