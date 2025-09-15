/*     */ package li.cil.oc.common.item.traits;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.client.KeyBindings$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.ItemCosts$;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.World;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.Seq$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class Delegate$class {
/*     */   public static String unlocalizedName(Delegate $this) {
/*  28 */     return $this.getClass().getSimpleName();
/*     */   } public static Option tooltipName(Delegate $this) {
/*  30 */     return Option$.MODULE$.apply($this.unlocalizedName());
/*     */   } public static Seq tooltipData(Delegate $this) {
/*  32 */     return (Seq)Seq$.MODULE$.empty();
/*     */   } public static void $init$(Delegate $this) {
/*  34 */     $this.showInItemList_$eq(true);
/*     */     
/*  36 */     $this.li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq($this.parent().add($this));
/*     */     
/*  38 */     $this.li$cil$oc$common$item$traits$Delegate$$_icon_$eq((Option<IIcon>)None$.MODULE$);
/*     */   } public static int maxStackSize(Delegate $this) {
/*  40 */     return 64;
/*     */   }
/*  42 */   public static ItemStack createItemStack(Delegate $this, int amount) { return new ItemStack((Item)$this.parent(), amount, $this.itemId()); } public static int createItemStack$default$1(Delegate $this) { return 1; }
/*     */ 
/*     */   
/*     */   public static boolean doesSneakBypassUse(Delegate $this, BlockPosition position, EntityPlayer player) {
/*  46 */     return false;
/*     */   } public static boolean onItemUseFirst(Delegate $this, ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/*  48 */     return false;
/*     */   } public static boolean onItemUse(Delegate $this, ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/*  50 */     return false;
/*     */   } public static ItemStack onItemRightClick(Delegate $this, ItemStack stack, World world, EntityPlayer player) {
/*  52 */     return stack;
/*     */   } public static EnumAction getItemUseAction(Delegate $this, ItemStack stack) {
/*  54 */     return EnumAction.none;
/*     */   } public static int getMaxItemUseDuration(Delegate $this, ItemStack stack) {
/*  56 */     return 0;
/*     */   } public static ItemStack onEaten(Delegate $this, ItemStack stack, World world, EntityPlayer player) {
/*  58 */     return stack;
/*     */   }
/*     */   
/*     */   public static void onPlayerStoppedUsing(Delegate $this, ItemStack stack, EntityPlayer player, int duration) {}
/*     */   
/*     */   public static void update(Delegate $this, ItemStack stack, World world, Entity player, int slot, boolean selected) {}
/*     */   
/*     */   public static EnumRarity rarity(Delegate $this, ItemStack stack) {
/*  66 */     return Rarity$.MODULE$.byTier($this.tierFromDriver(stack));
/*     */   }
/*     */   public static int tierFromDriver(Delegate $this, ItemStack stack) { boolean bool;
/*  69 */     Item item = Driver.driverFor(stack);
/*  70 */     if (item != null) { Item item1 = item; bool = item1.tier(stack); }
/*  71 */     else { bool = false; }
/*     */     
/*     */     return bool; } public static int color(Delegate $this, ItemStack stack, int pass) {
/*  74 */     return 16777215;
/*     */   } public static ItemStack getContainerItem(Delegate $this, ItemStack stack) {
/*  76 */     return null;
/*     */   } public static boolean hasContainerItem(Delegate $this, ItemStack stack) {
/*  78 */     return false;
/*     */   } public static Option displayName(Delegate $this, ItemStack stack) {
/*  80 */     return (Option)None$.MODULE$;
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void tooltipLines(Delegate $this, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/*  84 */     if ($this.tooltipName().isDefined()) {
/*  85 */       tooltip.addAll(Tooltip$.MODULE$.get((String)$this.tooltipName().get(), $this.tooltipData()));
/*  86 */       $this.tooltipExtended(stack, tooltip);
/*     */     } 
/*  88 */     $this.tooltipCosts(stack, tooltip);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void tooltipExtended(Delegate $this, ItemStack stack, List tooltip) {}
/*     */ 
/*     */   
/*     */   public static void tooltipCosts(Delegate $this, ItemStack stack, List<String> tooltip) {
/*  97 */     ItemCosts$.MODULE$.addTooltip(stack, tooltip); ItemCosts$.MODULE$.hasCosts(stack) ? (KeyBindings$.MODULE$.showMaterialCosts() ? BoxedUnit.UNIT : 
/*     */ 
/*     */       
/* 100 */       BoxesRunTime.boxToBoolean(tooltip.add(Localization$.MODULE$.localizeImmediately((
/* 101 */             new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tooltip.MaterialCosts").toString(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] {
/* 102 */                 KeyBindings$.MODULE$.getKeyBindingName(KeyBindings$.MODULE$.materialCosts())
/*     */               }))))) : BoxedUnit.UNIT;
/*     */     
/* 105 */     if (stack.func_77942_o() && stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString())) {
/* 106 */       NBTTagCompound data = stack.func_77978_p().func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/* 107 */       if (data.func_74764_b("node") && data.func_74775_l("node").func_74764_b("address"))
/* 108 */         tooltip.add((new StringBuilder()).append("§8").append(data.func_74775_l("node").func_74779_i("address").substring(0, 13)).append("...§7").toString()); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean isDamageable(Delegate $this) {
/* 113 */     return false;
/*     */   } public static int damage(Delegate $this, ItemStack stack) {
/* 115 */     return 0;
/*     */   } public static int maxDamage(Delegate $this, ItemStack stack) {
/* 117 */     return 0;
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public static Option icon(Delegate $this) {
/* 120 */     return $this.li$cil$oc$common$item$traits$Delegate$$_icon();
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public static void icon_$eq(Delegate $this, IIcon value) {
/* 123 */     $this.li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option$.MODULE$.apply(value));
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public static Option icon(Delegate $this, ItemStack stack, int pass) {
/* 126 */     return $this.icon();
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void registerIcons(Delegate $this, IIconRegister iconRegister) {
/* 130 */     $this.icon_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append($this.unlocalizedName()).toString()));
/*     */   }
/*     */   
/*     */   public static boolean equals(Delegate $this, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 55
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   8: aload_0
/*     */     //   9: invokeinterface parent : ()Lli/cil/oc/common/item/Delegator;
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 55
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 55
/*     */     //   34: aload_0
/*     */     //   35: invokeinterface parent : ()Lli/cil/oc/common/item/Delegator;
/*     */     //   40: aload_1
/*     */     //   41: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   44: aload_0
/*     */     //   45: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   48: ifeq -> 55
/*     */     //   51: iconst_1
/*     */     //   52: goto -> 56
/*     */     //   55: iconst_0
/*     */     //   56: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	57	0	$this	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   0	57	1	stack	Lnet/minecraft/item/ItemStack;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\Delegate$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */