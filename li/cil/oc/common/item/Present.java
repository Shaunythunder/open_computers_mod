/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0254A!\001\002\001\033\t9\001K]3tK:$(BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\025!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fMB\021Q\003G\007\002-)\021qCA\001\007iJ\f\027\016^:\n\005e1\"\001\003#fY\026<\027\r^3\t\021m\001!Q1A\005\002q\ta\001]1sK:$X#A\017\021\005yyR\"\001\002\n\005\001\022!!\003#fY\026<\027\r^8s\021!\021\003A!A!\002\023i\022a\0029be\026tG\017\t\005\006I\001!\t!J\001\007y%t\027\016\036 \025\005\031:\003C\001\020\001\021\025Y2\0051\001\036\021\025I\003\001\"\021+\003Ayg.\023;f[JKw\r\033;DY&\0347\016\006\003,iYj\004C\001\0273\033\005i#BA\002/\025\ty\003'A\005nS:,7M]1gi*\t\021'A\002oKRL!aM\027\003\023%#X-\\*uC\016\\\007\"B\033)\001\004Y\023!B:uC\016\\\007\"B\034)\001\004A\024!B<pe2$\007CA\035<\033\005Q$BA\034/\023\ta$HA\003X_JdG\rC\003?Q\001\007q(\001\004qY\006LXM\035\t\003\001\022k\021!\021\006\003}\tS!a\021\030\002\r\025tG/\033;z\023\t)\025I\001\007F]RLG/\037)mCf,'oB\003H\005!\005\001*A\004Qe\026\034XM\034;\021\005yIe!B\001\003\021\003Q5CA%\017\021\025!\023\n\"\001M)\005A\005\002\003(J\021\013\007I\021B(\002\021A\023Xm]3oiN,\022\001\025\t\004\037E[\023B\001*\021\005\025\t%O]1z\021!!\026\n#A!B\023\001\026!\003)sKN,g\016^:!\021\0351\026J1A\005\n]\0131A\0358h+\005A\006CA-_\033\005Q&BA.]\003\021)H/\0337\013\003u\013AA[1wC&\021qL\027\002\007%\006tGm\\7\t\r\005L\005\025!\003Y\003\021\021hn\032\021\t\013\rLE\021\0013\002\0279,\007\020\036)sKN,g\016\036\013\002W\001")
/*    */ public class Present implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 16 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Present(Delegator parent) { Delegate.class.$init$(this);
/* 17 */     showInItemList_$eq(false); }
/*    */   
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 20 */     if (stack.field_77994_a > 0) {
/* 21 */       stack.field_77994_a--;
/* 22 */       if (!world.field_72995_K) {
/* 23 */         world.func_72956_a((Entity)player, "random.levelup", 0.2F, 1.0F);
/* 24 */         ItemStack present = Present$.MODULE$.nextPresent();
/* 25 */         InventoryUtils$.MODULE$.addToPlayerInventory(present, player, InventoryUtils$.MODULE$.addToPlayerInventory$default$3());
/*    */       } 
/*    */     } 
/* 28 */     return stack;
/*    */   }
/*    */   
/*    */   public static ItemStack nextPresent() {
/*    */     return Present$.MODULE$.nextPresent();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Present.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */