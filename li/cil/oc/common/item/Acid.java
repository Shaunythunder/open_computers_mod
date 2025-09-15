/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i3A!\001\002\001\033\t!\021iY5e\025\t\031A!\001\003ji\026l'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qA\003\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\t\003+ai\021A\006\006\003/\t\ta\001\036:bSR\034\030BA\r\027\005!!U\r\\3hCR,\007\002C\016\001\005\013\007I\021\001\017\002\rA\f'/\0328u+\005i\002C\001\020 \033\005\021\021B\001\021\003\005%!U\r\\3hCR|'\017\003\005#\001\t\005\t\025!\003\036\003\035\001\030M]3oi\002BQ\001\n\001\005\002\025\na\001P5oSRtDC\001\024(!\tq\002\001C\003\034G\001\007Q\004C\003*\001\021\005#&\001\tp]&#X-\034*jO\"$8\t\\5dWR!1\006\016\034>!\ta#'D\001.\025\t\031aF\003\0020a\005IQ.\0338fGJ\fg\r\036\006\002c\005\031a.\032;\n\005Mj#!C%uK6\034F/Y2l\021\025)\004\0061\001,\003\025\031H/Y2l\021\0259\004\0061\0019\003\0259xN\0357e!\tI4(D\001;\025\t9d&\003\002=u\t)qk\034:mI\")a\b\013a\001\0051\001\017\\1zKJ\004\"\001\021#\016\003\005S!A\020\"\013\005\rs\023AB3oi&$\0300\003\002F\003\naQI\034;jif\004F.Y=fe\")q\t\001C!\021\006\001r-\032;Ji\026lWk]3BGRLwN\034\013\003\0232\003\"\001\f&\n\005-k#AC#ok6\f5\r^5p]\")QG\022a\001W!)a\n\001C!\037\006)r-\032;NCbLE/Z7Vg\026$UO]1uS>tGC\001)T!\ty\021+\003\002S!\t\031\021J\034;\t\013Uj\005\031A\026\t\013U\003A\021\t,\002\017=tW)\031;f]R!1f\026-Z\021\025)D\0131\001,\021\0259D\0131\0019\021\025qD\0131\001@\001")
/*    */ public class Acid implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 11 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Acid(Delegator parent) { Delegate.class.$init$(this); }
/*    */    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 13 */     player.func_71008_a(stack, getMaxItemUseDuration(stack));
/* 14 */     return stack;
/*    */   }
/*    */   public EnumAction getItemUseAction(ItemStack stack) {
/* 17 */     return EnumAction.drink;
/*    */   } public int getMaxItemUseDuration(ItemStack stack) {
/* 19 */     return 32;
/*    */   }
/*    */   public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
/* 22 */     if (!world.field_72995_K) {
/* 23 */       player.func_70690_d(new PotionEffect(Potion.field_76440_q.field_76415_H, 200));
/* 24 */       player.func_70690_d(new PotionEffect(Potion.field_76436_u.field_76415_H, 100));
/* 25 */       player.func_70690_d(new PotionEffect(Potion.field_76421_d.field_76415_H, 600));
/* 26 */       player.func_70690_d(new PotionEffect(Potion.field_76431_k.field_76415_H, 1200));
/* 27 */       player.func_70690_d(new PotionEffect(Potion.field_76443_y.field_76415_H, 2000));
/*    */ 
/*    */       
/* 30 */       Nanomachines.uninstallController(player);
/*    */     } 
/* 32 */     stack.field_77994_a--;
/* 33 */     return (stack.field_77994_a > 0) ? stack : 
/* 34 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Acid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */