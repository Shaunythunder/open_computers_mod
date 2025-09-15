/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025b\001B\001\003\0015\021Q\001\022:p]\026T!a\001\003\002\t%$X-\034\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\013\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g!\t)\002$D\001\027\025\t9\"!\001\004ue\006LGo]\005\0033Y\021\001\002R3mK\036\fG/\032\005\t7\001\021)\031!C\0019\0051\001/\031:f]R,\022!\b\t\003=}i\021AA\005\003A\t\021\021\002R3mK\036\fGo\034:\t\021\t\002!\021!Q\001\nu\tq\001]1sK:$\b\005C\003%\001\021\005Q%\001\004=S:LGO\020\013\003M\035\002\"A\b\001\t\013m\031\003\031A\017\t\013%\002A\021\013\026\002\037Q|w\016\034;ja\026CH/\0328eK\022$2a\013\030:!\tyA&\003\002.!\t!QK\\5u\021\025y\003\0061\0011\003\025\031H/Y2l!\t\tt'D\0013\025\t\0311G\003\0025k\005IQ.\0338fGJ\fg\r\036\006\002m\005\031a.\032;\n\005a\022$!C%uK6\034F/Y2l\021\025Q\004\0061\001<\003\035!xn\0347uSB\0042\001P!D\033\005i$B\001 @\003\021)H/\0337\013\003\001\013AA[1wC&\021!)\020\002\005\031&\034H\017\005\002E\017:\021q\"R\005\003\rB\ta\001\025:fI\0264\027B\001%J\005\031\031FO]5oO*\021a\t\005\005\006\027\002!\t\005T\001\007e\006\024\030\016^=\025\0055\003\006CA\031O\023\ty%G\001\006F]Vl'+\031:jifDQa\f&A\002ABQA\025\001\005BM\013\021b\0348Ji\026lWk]3\025\021Q;\006,\0315neR\004\"aD+\n\005Y\003\"a\002\"p_2,\027M\034\005\006_E\003\r\001\r\005\0063F\003\rAW\001\007a2\f\0270\032:\021\005m{V\"\001/\013\005ek&B\00104\003\031)g\016^5us&\021\001\r\030\002\r\013:$\030\016^=QY\006LXM\035\005\006EF\003\raY\001\ta>\034\030\016^5p]B\021AMZ\007\002K*\021aHB\005\003O\026\024QB\0217pG.\004vn]5uS>t\007\"B5R\001\004Q\027\001B:jI\026\004\"aD6\n\0051\004\"aA%oi\")a.\025a\001_\006!\001.\033;Y!\ty\001/\003\002r!\t)a\t\\8bi\")1/\025a\001_\006!\001.\033;Z\021\025)\030\0131\001p\003\021A\027\016\036.\t\013]\004A\021\t=\002\033I,w-[:uKJL5m\0348t)\tY\023\020C\003{m\002\00710\001\007jG>t'+Z4jgR,'\017\005\002}{6\t\001!\003\0021\ta\021jY8o%\026<\027n\035;fe\":a/!\001\002\032\005m\001\003BA\002\003+i!!!\002\013\t\005\035\021\021B\001\013e\026d\027-\0368dQ\026\024(\002BA\006\003\033\t1AZ7m\025\021\ty!!\005\002\t5|Gm\035\006\003\003'\t1a\0319x\023\021\t9\"!\002\003\021MKG-Z(oYf\fQA^1mk\026$#!!\b\n\t\005}\021\021E\001\007\0072KUI\024+\013\t\005\r\022QA\001\005'&$W\r")
/*    */ public class Drone implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 17 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onItemRightClick(this, stack, world, player); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Drone(Delegator parent) { Delegate.class.$init$(this);
/* 18 */     NEI$.MODULE$.hide(this);
/*    */     
/* 20 */     showInItemList_$eq(false); }
/*    */ 
/*    */   
/* 23 */   public void tooltipExtended(ItemStack stack, List tooltip) { if (KeyBindings$.MODULE$.showExtendedTooltips())
/* 24 */     { DroneData info = new DroneData(stack);
/* 25 */       Predef$.MODULE$.refArrayOps((Object[])info.components()).withFilter((Function1)new Drone$$anonfun$tooltipExtended$1(this)).foreach((Function1)new Drone$$anonfun$tooltipExtended$2(this, tooltip)); }  } public final class Drone$$anonfun$tooltipExtended$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack component) { return !(component == null); } public Drone$$anonfun$tooltipExtended$1(Drone $outer) {} } public final class Drone$$anonfun$tooltipExtended$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public Drone$$anonfun$tooltipExtended$2(Drone $outer, List tooltip$1) {} public final boolean apply(ItemStack component) {
/* 26 */       return this.tooltip$1.add((new StringBuilder()).append("- ").append(component.func_82833_r()).toString());
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   public EnumRarity rarity(ItemStack stack) {
/* 32 */     DroneData data = new DroneData(stack);
/* 33 */     return Rarity$.MODULE$.byTier(data.tier());
/*    */   }
/*    */   
/*    */   public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/* 37 */     World world = (World)position.world().get();
/*    */     
/* 39 */     li.cil.oc.common.entity.Drone drone = new li.cil.oc.common.entity.Drone(world);
/* 40 */     EntityPlayer entityPlayer = player;
/* 41 */     if (entityPlayer instanceof Player) { Player player1 = (Player)entityPlayer;
/* 42 */       drone.ownerName_$eq(player1.agent().ownerName());
/* 43 */       drone.ownerUUID_$eq(player1.agent().ownerUUID()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     else
/* 45 */     { drone.ownerName_$eq(player.func_70005_c_());
/* 46 */       drone.ownerUUID_$eq(player.func_146103_bH().getId()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/* 48 */     drone.initializeAfterPlacement(stack, player, position.offset((hitX * 1.1F), (hitY * 1.1F), (hitZ * 1.1F)));
/* 49 */     world.field_72995_K ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(world.func_72838_d((Entity)drone));
/*    */     
/* 51 */     stack.field_77994_a--;
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerIcons(IIconRegister iconRegister) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Drone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */