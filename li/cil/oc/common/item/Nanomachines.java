/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.common.item.data.NanomachineData;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.common.nanomachines.ControllerImpl;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025b\001B\001\003\0015\021ABT1o_6\f7\r[5oKNT!a\001\003\002\t%$X-\034\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\013\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g!\t)\002$D\001\027\025\t9\"!\001\004ue\006LGo]\005\0033Y\021\001\002R3mK\036\fG/\032\005\t7\001\021)\031!C\0019\0051\001/\031:f]R,\022!\b\t\003=}i\021AA\005\003A\t\021\021\002R3mK\036\fGo\034:\t\021\t\002!\021!Q\001\nu\tq\001]1sK:$\b\005C\003%\001\021\005Q%\001\004=S:LGO\020\013\003M\035\002\"A\b\001\t\013m\031\003\031A\017\t\013%\002A\021\t\026\002\rI\f'/\033;z)\tYC\007\005\002-e5\tQF\003\002\004])\021q\006M\001\n[&tWm\031:bMRT\021!M\001\004]\026$\030BA\032.\005))e.^7SCJLG/\037\005\006k!\002\rAN\001\006gR\f7m\033\t\003Y]J!\001O\027\003\023%#X-\\*uC\016\\\007\"\002\036\001\t\003Z\024\001\004;p_2$\030\016\035'j]\026\034H#\002\037@\001&S\006CA\b>\023\tq\004C\001\003V]&$\b\"B\033:\001\0041\004\"B!:\001\004\021\025A\0029mCf,'\017\005\002D\0176\tAI\003\002B\013*\021aIL\001\007K:$\030\016^=\n\005!#%\001D#oi&$\030\020\0257bs\026\024\b\"\002&:\001\004Y\025a\002;p_2$\030\016\035\t\004\031F\033V\"A'\013\0059{\025\001B;uS2T\021\001U\001\005U\0064\030-\003\002S\033\n!A*[:u!\t!vK\004\002\020+&\021a\013E\001\007!J,G-\0324\n\005aK&AB*ue&twM\003\002W!!)1,\017a\0019\006A\021\r\032<b]\016,G\r\005\002\020;&\021a\f\005\002\b\005>|G.Z1oQ\021I\004\r\\7\021\005\005TW\"\0012\013\005\r$\027A\003:fY\006,hn\0315fe*\021QMZ\001\004M6d'BA4i\003\021iw\016Z:\013\003%\f1a\0319x\023\tY'M\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005q\027BA8q\003\031\031E*S#O)*\021\021OY\001\005'&$W\rC\003t\001\021\005C/\001\tp]&#X-\034*jO\"$8\t\\5dWR!a'\036<~\021\025)$\0171\0017\021\0259(\0171\001y\003\0259xN\0357e!\tI80D\001{\025\t9h&\003\002}u\n)qk\034:mI\")\021I\035a\001\005\"1q\020\001C!\003\003\t\001cZ3u\023R,W.V:f\003\016$\030n\0348\025\t\005\r\021\021\002\t\004Y\005\025\021bAA\004[\tQQI\\;n\003\016$\030n\0348\t\013Ur\b\031\001\034\t\017\0055\001\001\"\021\002\020\005)r-\032;NCbLE/Z7Vg\026$UO]1uS>tG\003BA\t\003/\0012aDA\n\023\r\t)\002\005\002\004\023:$\bBB\033\002\f\001\007a\007C\004\002\034\001!\t%!\b\002\017=tW)\031;f]R9a'a\b\002\"\005\r\002BB\033\002\032\001\007a\007\003\004x\0033\001\r\001\037\005\007\003\006e\001\031\001\"")
/*    */ public class Nanomachines implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 17 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUse(this, stack, player, position, side, hitX, hitY, hitZ); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Nanomachines(Delegator parent) { Delegate.class.$init$(this); } public EnumRarity rarity(ItemStack stack) {
/* 18 */     return EnumRarity.uncommon;
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void tooltipLines(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 22 */     Delegate.class.tooltipLines(this, stack, player, tooltip, advanced);
/* 23 */     if (stack.func_77942_o()) {
/* 24 */       NanomachineData data = new NanomachineData(stack);
/* 25 */       if (!Strings.isNullOrEmpty(data.uuid())) {
/* 26 */         tooltip.add((new StringBuilder()).append("§8").append(data.uuid().substring(0, 13)).append("...§7").toString());
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 32 */     player.func_71008_a(stack, getMaxItemUseDuration(stack));
/* 33 */     return stack;
/*    */   }
/*    */   public EnumAction getItemUseAction(ItemStack stack) {
/* 36 */     return EnumAction.eat;
/*    */   } public int getMaxItemUseDuration(ItemStack stack) {
/* 38 */     return 32;
/*    */   }
/*    */   public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
/*    */     Controller controller2;
/* 42 */     NanomachineData data = new NanomachineData(stack);
/*    */ 
/*    */     
/* 45 */     li.cil.oc.api.Nanomachines.uninstallController(player);
/* 46 */     Controller controller1 = li.cil.oc.api.Nanomachines.installController(player);
/* 47 */     if (controller1 instanceof ControllerImpl) { ControllerImpl controllerImpl3, controllerImpl1 = (ControllerImpl)controller1;
/* 48 */       Option option = data.configuration();
/* 49 */       if (option instanceof Some) { Some some = (Some)option; NBTTagCompound nbt = (NBTTagCompound)some.x();
/* 50 */         if (!Strings.isNullOrEmpty(data.uuid())) {
/* 51 */           controllerImpl1.uuid_$eq(data.uuid());
/*    */         }
/* 53 */         controllerImpl1.configuration().load(nbt); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 54 */       else { controllerImpl3 = controllerImpl1.reconfigure(); }
/*    */        ControllerImpl controllerImpl2 = controllerImpl3; }
/* 56 */     else { controller2 = controller1.reconfigure(); }
/*    */     
/*    */     world.field_72995_K ? BoxedUnit.UNIT : controller2;
/* 59 */     stack.field_77994_a--;
/* 60 */     return (stack.field_77994_a > 0) ? stack : 
/* 61 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Nanomachines.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */