/*    */ package li.cil.oc.common.item;
/*    */ @ScalaSignature(bytes = "\006\001\005\005a\001B\001\003\0015\021a\"\0269he\006$WMQ1ui\026\024\030P\003\002\004\t\005!\021\016^3n\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011#\002\001\017)ii\002CA\b\023\033\005\001\"\"A\t\002\013M\034\027\r\\1\n\005M\001\"AB!osJ+g\r\005\002\02615\taC\003\002\030\005\0051AO]1jiNL!!\007\f\003\021\021+G.Z4bi\026\004\"!F\016\n\005q1\"\001C%uK6$\026.\032:\021\005y!S\"A\020\013\005\r\001#BA\021#\003\031!'/\033<fe*\0211EB\001\004CBL\027BA\023 \005)\031\005.\031:hK\006\024G.\032\005\tO\001\021)\031!C\001Q\0051\001/\031:f]R,\022!\013\t\003U-j\021AA\005\003Y\t\021\021\002R3mK\036\fGo\034:\t\0219\002!\021!Q\001\n%\nq\001]1sK:$\b\005\003\0051\001\t\025\r\021\"\0012\003\021!\030.\032:\026\003I\002\"aD\032\n\005Q\002\"aA%oi\"Aa\007\001B\001B\003%!'A\003uS\026\024\b\005C\0039\001\021\005\021(\001\004=S:LGO\020\013\004umb\004C\001\026\001\021\0259s\0071\001*\021\025\001t\0071\0013\021\035q\004A1A\005B}\nq\"\0368m_\016\fG.\033>fI:\013W.Z\013\002\001B\021\021IR\007\002\005*\0211\tR\001\005Y\006twMC\001F\003\021Q\027M^1\n\005\035\023%AB*ue&tw\r\003\004J\001\001\006I\001Q\001\021k:dwnY1mSj,GMT1nK\002BQa\023\001\005R1\0131\002^8pYRL\007OT1nKV\tQ\nE\002\020\035\002K!a\024\t\003\r=\003H/[8o\021\025\t\006\001\"\025S\003-!xn\0347uSB$\025\r^1\026\003M\0032\001V,3\033\005)&B\001,\021\003)\031w\016\0347fGRLwN\\\005\0031V\0231aU3r\021\025Q\006\001\"\021\\\0031I7\017R1nC\036,\027M\0317f+\005a\006CA\b^\023\tq\006CA\004C_>dW-\0318\t\013\001\004A\021I1\002\r\021\fW.Y4f)\t\021$\rC\003d?\002\007A-A\003ti\006\0347\016\005\002fW6\taM\003\002\004O*\021\001.[\001\n[&tWm\031:bMRT\021A[\001\004]\026$\030B\0017g\005%IE/Z7Ti\006\0347\016C\003o\001\021\005s.A\005nCb$\025-\\1hKR\021!\007\035\005\006G6\004\r\001\032\005\006e\002!\ta]\001\nG\006t7\t[1sO\026$\"\001\030;\t\013\r\f\b\031\0013\t\013Y\004A\021A<\002\r\rD\027M]4f)\021A8\020 @\021\005=I\030B\001>\021\005\031!u.\0362mK\")1-\036a\001I\")Q0\036a\001q\0061\021-\\8v]RDQa`;A\002q\013\001b]5nk2\fG/\032")
/*    */ public class UpgradeBattery implements ItemTier, Chargeable { private final Delegator parent;
/*    */   private final int tier;
/*    */   private final String unlocalizedName;
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*  8 */   public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { ItemTier.class.tooltipLines(this, stack, player, tooltip, advanced); } private boolean showInItemList; private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public boolean showInItemList() { return this.showInItemList; } public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public int maxStackSize() { return Delegate.class.maxStackSize((Delegate)this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack((Delegate)this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse((Delegate)this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst((Delegate)this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse((Delegate)this, stack, player, position, side, hitX, hitY, hitZ); } public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onItemRightClick((Delegate)this, stack, world, player); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction((Delegate)this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration((Delegate)this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten((Delegate)this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing((Delegate)this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update((Delegate)this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity((Delegate)this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver((Delegate)this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color((Delegate)this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem((Delegate)this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem((Delegate)this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName((Delegate)this, stack); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended((Delegate)this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts((Delegate)this, stack, tooltip); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon((Delegate)this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq((Delegate)this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon((Delegate)this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons((Delegate)this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals((Delegate)this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1((Delegate)this); } public Delegator parent() { return this.parent; } public int tier() { return this.tier; } public UpgradeBattery(Delegator parent, int tier) { Delegate.class.$init$((Delegate)this); ItemTier.class.$init$(this);
/*  9 */     this.unlocalizedName = (new StringBuilder()).append(Delegate.class.unlocalizedName((Delegate)this)).append(BoxesRunTime.boxToInteger(tier)).toString(); } public String unlocalizedName() { return this.unlocalizedName; }
/*    */    public Option<String> tooltipName() {
/* 11 */     return Option$.MODULE$.apply(Delegate.class.unlocalizedName((Delegate)this));
/*    */   } public Seq<Object> tooltipData() {
/* 13 */     return (Seq<Object>)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapIntArray(new int[] { (int)Settings$.MODULE$.get().bufferCapacitorUpgrades()[tier()] }));
/*    */   } public boolean isDamageable() {
/* 15 */     return true;
/*    */   }
/*    */   
/* 18 */   public int damage(ItemStack stack) { NodeData data = new NodeData(stack);
/* 19 */     return (int)((true - BoxesRunTime.unboxToDouble(data.buffer().getOrElse((Function0)new UpgradeBattery$$anonfun$damage$1(this))) / Settings$.MODULE$.get().bufferCapacitorUpgrades()[tier()]) * 100); } public final class UpgradeBattery$$anonfun$damage$1 extends AbstractFunction0.mcD.sp implements Serializable { public static final long serialVersionUID = 0L; public final double apply() { return apply$mcD$sp(); } public double apply$mcD$sp() { return 0.0D; }
/*    */      public UpgradeBattery$$anonfun$damage$1(UpgradeBattery $outer) {} }
/*    */   public int maxDamage(ItemStack stack) {
/* 22 */     return 100;
/*    */   }
/*    */   
/*    */   public boolean canCharge(ItemStack stack) {
/* 26 */     return true;
/*    */   } public double charge(ItemStack stack, double amount, boolean simulate) {
/*    */     double d1;
/* 29 */     NodeData data = new NodeData(stack);
/* 30 */     Option option = data.buffer();
/* 31 */     if (option instanceof Some) { Some some = (Some)option; double value = BoxesRunTime.unboxToDouble(some.x()); }
/* 32 */     else { d1 = 0.0D; }
/*    */ 
/*    */     
/*    */     double buffer = d1;
/* 36 */     double charge = package$.MODULE$.min(amount, (int)Settings$.MODULE$.get().bufferCapacitorUpgrades()[tier()] - buffer);
/* 37 */     if (!simulate) {
/* 38 */       data.buffer_$eq(Option$.MODULE$.apply(BoxesRunTime.boxToDouble(buffer + charge)));
/* 39 */       data.save(stack);
/*    */     } 
/* 41 */     return (amount < false) ? amount : (amount - charge);
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\UpgradeBattery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */