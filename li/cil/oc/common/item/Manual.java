/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\rb\001B\001\003\0015\021a!T1ok\006d'BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\025!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fMB\021Q\003G\007\002-)\021qCA\001\007iJ\f\027\016^:\n\005e1\"\001\003#fY\026<\027\r^3\t\021m\001!Q1A\005\002q\ta\001]1sK:$X#A\017\021\005yyR\"\001\002\n\005\001\022!!\003#fY\026<\027\r^8s\021!\021\003A!A!\002\023i\022a\0029be\026tG\017\t\005\006I\001!\t!J\001\007y%t\027\016\036 \025\005\031:\003C\001\020\001\021\025Y2\0051\001\036\021\025I\003\001\"\021+\0031!xn\0347uSBd\025N\\3t)\025Yc&\017\"T!\tyA&\003\002.!\t!QK\\5u\021\025y\003\0061\0011\003\025\031H/Y2l!\t\tt'D\0013\025\t\0311G\003\0025k\005IQ.\0338fGJ\fg\r\036\006\002m\005\031a.\032;\n\005a\022$!C%uK6\034F/Y2l\021\025Q\004\0061\001<\003\031\001H.Y=feB\021A\bQ\007\002{)\021!H\020\006\003M\na!\0328uSRL\030BA!>\0051)e\016^5usBc\027-_3s\021\025\031\005\0061\001E\003\035!xn\0347uSB\0042!\022&M\033\0051%BA$I\003\021)H/\0337\013\003%\013AA[1wC&\0211J\022\002\005\031&\034H\017\005\002N!:\021qBT\005\003\037B\ta\001\025:fI\0264\027BA)S\005\031\031FO]5oO*\021q\n\005\005\006)\"\002\r!V\001\tC\0224\030M\\2fIB\021qBV\005\003/B\021qAQ8pY\026\fg\016\013\003)3\0264\007C\001.d\033\005Y&B\001/^\003)\021X\r\\1v]\016DWM\035\006\003=~\0131AZ7m\025\t\001\027-\001\003n_\022\034(\"\0012\002\007\r\004x/\003\002e7\nA1+\0333f\037:d\0270A\003wC2,X\rJ\001h\023\tA\027.\001\004D\031&+e\n\026\006\003Un\013AaU5eK\")A\016\001C![\006\001rN\\%uK6\024\026n\0325u\0072L7m\033\013\005a9|g\017C\0030W\002\007\001\007C\003qW\002\007\021/A\003x_JdG\r\005\002si6\t1O\003\002qg%\021Qo\035\002\006/>\024H\016\032\005\006u-\004\ra\017\005\006q\002!\t%_\001\n_:LE/Z7Vg\026$B\"\026>|y\006\035\021\021CA\016\003?AQaL<A\002ABQAO<A\002mBQ!`<A\002y\f\001\002]8tSRLwN\034\t\004\006\rQBAA\001\025\t9e!\003\003\002\006\005\005!!\004\"m_\016\\\007k\\:ji&|g\016C\004\002\n]\004\r!a\003\002\tMLG-\032\t\004\037\0055\021bAA\b!\t\031\021J\034;\t\017\005Mq\0171\001\002\026\005!\001.\033;Y!\ry\021qC\005\004\0033\001\"!\002$m_\006$\bbBA\017o\002\007\021QC\001\005Q&$\030\fC\004\002\"]\004\r!!\006\002\t!LGO\027")
/*    */ public class Manual implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 15 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Manual(Delegator parent) { Delegate.class.$init$(this); }
/*    */    @SideOnly(Side.CLIENT)
/*    */   public void tooltipLines(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 18 */     tooltip.add((new StringBuilder()).append(EnumChatFormatting.DARK_GRAY.toString()).append("v").append("1.10.30-GTNH").toString());
/* 19 */     Delegate.class.tooltipLines(this, stack, player, tooltip, advanced);
/*    */   }
/*    */   
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 23 */     if (world.field_72995_K) {
/* 24 */       if (player.func_70093_af()) {
/* 25 */         li.cil.oc.api.Manual.reset();
/*    */       }
/* 27 */       li.cil.oc.api.Manual.openFor(player);
/*    */     } 
/* 29 */     return Delegate.class.onItemRightClick(this, stack, world, player);
/*    */   }
/*    */   public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/* 33 */     World world = player.func_130014_f_();
/* 34 */     String str = li.cil.oc.api.Manual.pathFor(world, position.x(), position.y(), position.z());
/* 35 */     if (str != null) { String str1 = str;
/* 36 */       if (world.field_72995_K) {
/* 37 */         li.cil.oc.api.Manual.openFor(player);
/* 38 */         li.cil.oc.api.Manual.reset();
/* 39 */         li.cil.oc.api.Manual.navigate(str1);
/*    */       }  bool = true; }
/*    */     else
/* 42 */     { bool = Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); }
/*    */     
/*    */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Manual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */