/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.data.DebugCardData;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y3A!\001\002\001\033\tIA)\0322vO\016\013'\017\032\006\003\007\021\tA!\033;f[*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\031\033\0051\"BA\f\003\003\031!(/Y5ug&\021\021D\006\002\t\t\026dWmZ1uK\"A1\004\001BC\002\023\005A$\001\004qCJ,g\016^\013\002;A\021adH\007\002\005%\021\001E\001\002\n\t\026dWmZ1u_JD\001B\t\001\003\002\003\006I!H\001\ba\006\024XM\034;!\021\025!\003\001\"\001&\003\031a\024N\\5u}Q\021ae\n\t\003=\001AQaG\022A\002uAQ!\013\001\005R)\nq\002^8pYRL\007/\022=uK:$W\r\032\013\004W9J\004CA\b-\023\ti\003C\001\003V]&$\b\"B\030)\001\004\001\024!B:uC\016\\\007CA\0318\033\005\021$BA\0024\025\t!T'A\005nS:,7M]1gi*\ta'A\002oKRL!\001\017\032\003\023%#X-\\*uC\016\\\007\"\002\036)\001\004Y\024a\002;p_2$\030\016\035\t\004y\005\033U\"A\037\013\005yz\024\001B;uS2T\021\001Q\001\005U\0064\030-\003\002C{\t!A*[:u!\t!uI\004\002\020\013&\021a\tE\001\007!J,G-\0324\n\005!K%AB*ue&twM\003\002G!!)1\n\001C!\031\006\001rN\\%uK6\024\026n\0325u\0072L7m\033\013\005a5sU\013C\0030\025\002\007\001\007C\003P\025\002\007\001+A\003x_JdG\r\005\002R'6\t!K\003\002Pg%\021AK\025\002\006/>\024H\016\032\005\006-*\003\raV\001\007a2\f\0270\032:\021\005acV\"A-\013\005YS&BA.4\003\031)g\016^5us&\021Q,\027\002\r\013:$\030\016^=QY\006LXM\035")
/*    */ public class DebugCard implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 14 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public DebugCard(Delegator parent) { Delegate.class.$init$(this); }
/*    */   
/* 16 */   public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip);
/* 17 */     DebugCardData data = new DebugCardData(stack);
/* 18 */     data.access().foreach((Function1)new DebugCard$$anonfun$tooltipExtended$1(this, tooltip)); } public final class DebugCard$$anonfun$tooltipExtended$1 extends AbstractFunction1<li.cil.oc.server.component.DebugCard.AccessContext, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final boolean apply(li.cil.oc.server.component.DebugCard.AccessContext access) { (new String[2])[0] = "§8"; (new String[2])[1] = "§r"; return this.tooltip$1.add((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { access.player() }))); }
/*    */      public DebugCard$$anonfun$tooltipExtended$1(DebugCard $outer, List tooltip$1) {} }
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/*    */     DebugCardData data;
/* 22 */     if (!world.field_72995_K && player.func_70093_af())
/* 23 */     { data = new DebugCardData(stack);
/* 24 */       String name = player.func_70005_c_();
/*    */       
/* 26 */       if (data.access().exists((Function1)new DebugCard$$anonfun$onItemRightClick$1(this, name))) { data.access_$eq((Option)None$.MODULE$); }
/*    */       else
/* 28 */       { Product product = Settings$.MODULE$.get().debugCardAccess();
/* 29 */         if (product instanceof Settings.DebugCardAccess.Whitelist) { Settings.DebugCardAccess.Whitelist whitelist = (Settings.DebugCardAccess.Whitelist)product; Option option = whitelist.nonce(name);
/* 30 */           if (option instanceof Some) { Some some = (Some)option; String n = (String)some.x(), str2 = n; String str1 = str2; }
/* 31 */            if (None$.MODULE$.equals(option)) {
/* 32 */             player.func_146105_b(package$.MODULE$.string2text("§cYou are not whitelisted to use debug card"));
/* 33 */             player.func_71038_i();
/* 34 */             return stack;
/*    */           }  throw new MatchError(option); }
/*    */         
/* 37 */         String str = ""; }
/*    */       
/*    */        }
/*    */     
/*    */     else
/*    */     
/* 43 */     { return stack; }  data.save(stack); player.func_71038_i(); return stack;
/*    */   }
/*    */   
/*    */   public final class DebugCard$$anonfun$onItemRightClick$1 extends AbstractFunction1<li.cil.oc.server.component.DebugCard.AccessContext, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final String name$1;
/*    */     
/*    */     public final boolean apply(li.cil.oc.server.component.DebugCard.AccessContext x$1) {
/*    */       String str = this.name$1;
/*    */       if (x$1.player() == null) {
/*    */         x$1.player();
/*    */         if (str != null);
/*    */       } else if (x$1.player().equals(str)) {
/*    */       
/*    */       } 
/*    */     }
/*    */     
/*    */     public DebugCard$$anonfun$onItemRightClick$1(DebugCard $outer, String name$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\DebugCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */