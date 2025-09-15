/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Mc\001B\001\003\0015\021\001\002V3s[&t\027\r\034\006\003\007\021\tA!\033;f[*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\031\033\0051\"BA\f\003\003\031!(/Y5ug&\021\021D\006\002\t\t\026dWmZ1uK\"A1\004\001BC\002\023\005A$\001\004qCJ,g\016^\013\002;A\021adH\007\002\005%\021\001E\001\002\n\t\026dWmZ1u_JD\001B\t\001\003\002\003\006I!H\001\ba\006\024XM\034;!\021\025!\003\001\"\001&\003\031a\024N\\5u}Q\021ae\n\t\003=\001AQaG\022A\002uAQ!\013\001\005B)\nA\"\\1y'R\f7m[*ju\026,\022a\013\t\003\0371J!!\f\t\003\007%sG\017C\0040\001\001\007I\021\002\031\002\r%\034wN\\(o+\005\t\004cA\b3i%\0211\007\005\002\007\037B$\030n\0348\021\005U2T\"\001\001\n\005]B\"\001B%d_:Dq!\017\001A\002\023%!(\001\006jG>twJ\\0%KF$\"a\017 \021\005=a\024BA\037\021\005\021)f.\033;\t\017}B\024\021!a\001c\005\031\001\020J\031\t\r\005\003\001\025)\0032\003\035I7m\0348P]\002Bqa\021\001A\002\023%\001'A\004jG>twJ\0324\t\017\025\003\001\031!C\005\r\006Y\021nY8o\037\0324w\fJ3r)\tYt\tC\004@\t\006\005\t\031A\031\t\r%\003\001\025)\0032\003!I7m\0348PM\032\004\003\"B&\001\t\003a\025!\0035bgN+'O^3s)\ti\005\013\005\002\020\035&\021q\n\005\002\b\005>|G.Z1o\021\025\t&\n1\001S\003\025\031H/Y2l!\t\031\026,D\001U\025\t\031QK\003\002W/\006IQ.\0338fGJ\fg\r\036\006\0021\006\031a.\032;\n\005i#&!C%uK6\034F/Y2l\021\025a\006\001\"\021^\0031!xn\0347uSBd\025N\\3t)\025Ydl\0305z\021\025\t6\f1\001S\021\025\0017\f1\001b\003\031\001H.Y=feB\021!MZ\007\002G*\021\001\r\032\006\003KV\013a!\0328uSRL\030BA4d\0051)e\016^5usBc\027-_3s\021\025I7\f1\001k\003\035!xn\0347uSB\0042a\0339s\033\005a'BA7o\003\021)H/\0337\013\003=\fAA[1wC&\021\021\017\034\002\005\031&\034H\017\005\002tm:\021q\002^\005\003kB\ta\001\025:fI\0264\027BA<y\005\031\031FO]5oO*\021Q\017\005\005\006un\003\r!T\001\tC\0224\030M\\2fI\"21\f`A\t\003'\0012!`A\007\033\005q(bA@\002\002\005Q!/\0327bk:\034\007.\032:\013\t\005\r\021QA\001\004M6d'\002BA\004\003\023\tA!\\8eg*\021\0211B\001\004GB<\030bAA\b}\nA1+\0333f\037:d\0270A\003wC2,X\r\n\002\002\026%!\021qCA\r\003\031\031E*S#O)*\031\0211\004@\002\tMKG-\032\005\b\003?\001A\021IA\021\003\021I7m\0348\025\013E\n\031#!\n\t\rE\013i\0021\001S\021\035\t9#!\bA\002-\nA\001]1tg\":\021Q\004?\002\022\005M\001bBA\027\001\021\005\023qF\001\016e\026<\027n\035;fe&\033wN\\:\025\007m\n\t\004\003\005\0024\005-\002\031AA\033\0031I7m\0348SK\036L7\017^3s!\r)\024qG\005\004\003sA\"\001D%d_:\024VmZ5ti\026\024\bbBA\037\001\021\005\023qH\001\021_:LE/Z7SS\036DGo\0217jG.$rAUA!\003\007\n\t\006\003\004R\003w\001\rA\025\005\t\003\013\nY\0041\001\002H\005)qo\034:mIB!\021\021JA'\033\t\tYEC\002\002FUKA!a\024\002L\t)qk\034:mI\"1\001-a\017A\002\005\004")
/*    */ public class Terminal implements Delegate {
/*    */   private final Delegator parent;
/*    */   private Option<IIcon> iconOn;
/*    */   private Option<IIcon> iconOff;
/*    */   
/* 15 */   public boolean showInItemList() { return this.showInItemList; } private boolean showInItemList; private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Terminal(Delegator parent) { Delegate.class.$init$(this);
/*    */ 
/*    */     
/* 18 */     this.iconOn = (Option<IIcon>)None$.MODULE$;
/* 19 */     this.iconOff = (Option<IIcon>)None$.MODULE$; } public int maxStackSize() { return 1; } private Option<IIcon> iconOn() { return this.iconOn; } private void iconOn_$eq(Option<IIcon> x$1) { this.iconOn = x$1; } private Option<IIcon> iconOff() { return this.iconOff; } private void iconOff_$eq(Option<IIcon> x$1) { this.iconOff = x$1; }
/*    */    public boolean hasServer(ItemStack stack) {
/* 21 */     return (stack.func_77942_o() && stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("server").toString()));
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void tooltipLines(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 25 */     Delegate.class.tooltipLines(this, stack, player, tooltip, advanced);
/* 26 */     if (hasServer(stack)) {
/* 27 */       String server = stack.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("server").toString());
/* 28 */       tooltip.add((new StringBuilder()).append("§8").append(server.substring(0, 13)).append("...§7").toString());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public Option<IIcon> icon(ItemStack stack, int pass) {
/* 35 */     return hasServer(stack) ? iconOn() : iconOff();
/*    */   }
/*    */   public void registerIcons(IIconRegister iconRegister) {
/* 38 */     Delegate.class.registerIcons(this, iconRegister);
/*    */     
/* 40 */     iconOn_$eq(Option$.MODULE$.apply(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":TerminalOn").toString())));
/* 41 */     iconOff_$eq(Option$.MODULE$.apply(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":TerminalOff").toString())));
/*    */   }
/*    */   
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 45 */     if (!player.func_70093_af() && stack.func_77942_o()) {
/* 46 */       String key = stack.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("key").toString());
/* 47 */       String server = stack.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("server").toString());
/* 48 */       if (key != null && !key.isEmpty() && server != null && !server.isEmpty()) {
/* 49 */         if (world.field_72995_K) {
/* 50 */           player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.Terminal().id(), world, 0, 0, 0);
/*    */         }
/* 52 */         player.func_71038_i();
/*    */       } 
/*    */     } 
/* 55 */     return Delegate.class.onItemRightClick(this, stack, world, player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Terminal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */