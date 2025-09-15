/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i3A!\001\002\001\033\tI1\t[1nK2LW/\034\006\003\007\021\tA!\033;f[*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\031\033\0051\"BA\f\003\003\031!(/Y5ug&\021\021D\006\002\t\t\026dWmZ1uK\"A1\004\001BC\002\023\005A$\001\004qCJ,g\016^\013\002;A\021adH\007\002\005%\021\001E\001\002\n\t\026dWmZ1u_JD\001B\t\001\003\002\003\006I!H\001\ba\006\024XM\034;!\021\025!\003\001\"\001&\003\031a\024N\\5u}Q\021ae\n\t\003=\001AQaG\022A\002uAQ!\013\001\005B)\n\001c\0348Ji\026l'+[4ii\016c\027nY6\025\t-\"d'\020\t\003YIj\021!\f\006\003\0079R!a\f\031\002\0235Lg.Z2sC\032$(\"A\031\002\0079,G/\003\0024[\tI\021\n^3n'R\f7m\033\005\006k!\002\raK\001\006gR\f7m\033\005\006o!\002\r\001O\001\006o>\024H\016\032\t\003smj\021A\017\006\003o9J!\001\020\036\003\013]{'\017\0343\t\013yB\003\031A \002\rAd\027-_3s!\t\001E)D\001B\025\tq$I\003\002D]\0051QM\034;jifL!!R!\003\031\025sG/\033;z!2\f\0270\032:\t\013\035\003A\021\t%\002!\035,G/\023;f[V\033X-Q2uS>tGCA%M!\ta#*\003\002L[\tQQI\\;n\003\016$\030n\0348\t\013U2\005\031A\026\t\0139\003A\021I(\002+\035,G/T1y\023R,W.V:f\tV\024\030\r^5p]R\021\001k\025\t\003\037EK!A\025\t\003\007%sG\017C\0036\033\002\0071\006C\003V\001\021\005c+A\004p]\026\013G/\0328\025\t-:\006,\027\005\006kQ\003\ra\013\005\006oQ\003\r\001\017\005\006}Q\003\ra\020")
/*    */ public class Chamelium implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 11 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Chamelium(Delegator parent) { Delegate.class.$init$(this); }
/*    */    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 13 */     if (Settings$.MODULE$.get().chameliumEdible()) {
/* 14 */       player.func_71008_a(stack, getMaxItemUseDuration(stack));
/*    */     }
/* 16 */     return stack;
/*    */   }
/*    */   public EnumAction getItemUseAction(ItemStack stack) {
/* 19 */     return EnumAction.eat;
/*    */   } public int getMaxItemUseDuration(ItemStack stack) {
/* 21 */     return 32;
/*    */   }
/*    */   public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
/* 24 */     if (!world.field_72995_K) {
/* 25 */       player.func_70690_d(new PotionEffect(Potion.field_76441_p.field_76415_H, 100, 0));
/* 26 */       player.func_70690_d(new PotionEffect(Potion.field_76440_q.field_76415_H, 200, 0));
/*    */     } 
/* 28 */     stack.field_77994_a--;
/* 29 */     return (stack.field_77994_a > 0) ? stack : 
/* 30 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Chamelium.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */