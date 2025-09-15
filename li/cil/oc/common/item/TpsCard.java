/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y3A!\001\002\001\033\t9A\013]:DCJ$'BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\025!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fMB\021Q\003G\007\002-)\021qCA\001\007iJ\f\027\016^:\n\005e1\"\001\003#fY\026<\027\r^3\t\021m\001!Q1A\005\002q\ta\001]1sK:$X#A\017\021\005yyR\"\001\002\n\005\001\022!!\003#fY\026<\027\r^8s\021!\021\003A!A!\002\023i\022a\0029be\026tG\017\t\005\006I\001!\t!J\001\007y%t\027\016\036 \025\005\031:\003C\001\020\001\021\025Y2\0051\001\036\021\025I\003\001\"\025+\003=!xn\0347uSB,\005\020^3oI\026$GcA\026/sA\021q\002L\005\003[A\021A!\0268ji\")q\006\013a\001a\005)1\017^1dWB\021\021gN\007\002e)\0211a\r\006\003iU\n\021\"\\5oK\016\024\030M\032;\013\003Y\n1A\\3u\023\tA$GA\005Ji\026l7\013^1dW\")!\b\013a\001w\0059Ao\\8mi&\004\bc\001\037B\0076\tQH\003\002?\005!Q\017^5m\025\005\001\025\001\0026bm\006L!AQ\037\003\t1K7\017\036\t\003\t\036s!aD#\n\005\031\003\022A\002)sK\022,g-\003\002I\023\n11\013\036:j]\036T!A\022\t\t\013-\003A\021\t'\002!=t\027\n^3n%&<\007\016^\"mS\016\\G\003\002\031N\035VCQa\f&A\002ABQa\024&A\002A\013Qa^8sY\022\004\"!U*\016\003IS!aT\032\n\005Q\023&!B,pe2$\007\"\002,K\001\0049\026A\0029mCf,'\017\005\002Y96\t\021L\003\002W5*\0211lM\001\007K:$\030\016^=\n\005uK&\001D#oi&$\030\020\0257bs\026\024\b")
/*    */ public class TpsCard implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 12 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public TpsCard(Delegator parent) { Delegate.class.$init$(this); }
/*    */   
/* 14 */   public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip);
/* 15 */     DebugCardData data = new DebugCardData(stack);
/* 16 */     data.access().foreach((Function1)new TpsCard$$anonfun$tooltipExtended$1(this, tooltip)); } public final class TpsCard$$anonfun$tooltipExtended$1 extends AbstractFunction1<DebugCard.AccessContext, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final boolean apply(DebugCard.AccessContext access) { (new String[2])[0] = "§8"; (new String[2])[1] = "§r"; return this.tooltip$1.add((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { access.player() }))); }
/*    */      public TpsCard$$anonfun$tooltipExtended$1(TpsCard $outer, List tooltip$1) {} }
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 19 */     if (!world.field_72995_K && player.func_70093_af() && DebugWhitelistCommand$.MODULE$.isOp((ICommandSender)player)) {
/* 20 */       DebugCardData data = new DebugCardData(stack);
/* 21 */       String name = player.func_70005_c_();
/*    */       
/* 23 */       if (data.access().exists((Function1)new TpsCard$$anonfun$onItemRightClick$1(this, name))) { data.access_$eq((Option)None$.MODULE$); }
/* 24 */       else { data.access_$eq((Option)new Some(new DebugCard.AccessContext(name, ""))); }
/*    */       
/* 26 */       data.save(stack);
/* 27 */       player.func_71038_i();
/*    */     } 
/* 29 */     return stack;
/*    */   }
/*    */   
/*    */   public final class TpsCard$$anonfun$onItemRightClick$1 extends AbstractFunction1<DebugCard.AccessContext, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final String name$1;
/*    */     
/*    */     public final boolean apply(DebugCard.AccessContext x$1) {
/*    */       String str = this.name$1;
/*    */       if (x$1.player() == null) {
/*    */         x$1.player();
/*    */         if (str != null);
/*    */       } else if (x$1.player().equals(str)) {
/*    */       
/*    */       } 
/*    */     }
/*    */     
/*    */     public TpsCard$$anonfun$onItemRightClick$1(TpsCard $outer, String name$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\TpsCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */