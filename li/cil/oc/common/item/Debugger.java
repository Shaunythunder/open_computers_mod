/*    */ package li.cil.oc.common.item;
/*    */ 
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ed\001B\001\003\0015\021\001\002R3ck\036<WM\035\006\003\007\021\tA!\033;f[*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Q\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007CA\013\031\033\0051\"BA\f\003\003\031!(/Y5ug&\021\021D\006\002\t\t\026dWmZ1uK\"A1\004\001BC\002\023\005A$\001\004qCJ,g\016^\013\002;A\021adH\007\002\005%\021\001E\001\002\n\t\026dWmZ1u_JD\001B\t\001\003\002\003\006I!H\001\ba\006\024XM\034;!\021\025!\003\001\"\001&\003\031a\024N\\5u}Q\021ae\n\t\003=\001AQaG\022A\002uAQ!\013\001\005B)\n\021b\0348Ji\026lWk]3\025\021-r\023H\021&P)Z\003\"a\004\027\n\0055\002\"a\002\"p_2,\027M\034\005\006_!\002\r\001M\001\006gR\f7m\033\t\003c]j\021A\r\006\003\007MR!\001N\033\002\0235Lg.Z2sC\032$(\"\001\034\002\0079,G/\003\0029e\tI\021\n^3n'R\f7m\033\005\006u!\002\raO\001\007a2\f\0270\032:\021\005q\002U\"A\037\013\005ir$BA 4\003\031)g\016^5us&\021\021)\020\002\r\013:$\030\016^=QY\006LXM\035\005\006\007\"\002\r\001R\001\ta>\034\030\016^5p]B\021Q\tS\007\002\r*\021qIB\001\005kRLG.\003\002J\r\ni!\t\\8dWB{7/\033;j_:DQa\023\025A\0021\013Aa]5eKB\021q\"T\005\003\035B\0211!\0238u\021\025\001\006\0061\001R\003\021A\027\016\036-\021\005=\021\026BA*\021\005\0251En\\1u\021\025)\006\0061\001R\003\021A\027\016^-\t\013]C\003\031A)\002\t!LGOW\004\0063\nA\tAW\001\t\t\026\024WoZ4feB\021ad\027\004\006\003\tA\t\001X\n\0047v+\007C\0010d\033\005y&B\0011b\003\021a\027M\\4\013\003\t\fAA[1wC&\021Am\030\002\007\037\nTWm\031;\021\005\031\\W\"A4\013\005!L\027a\0028fi^|'o\033\006\003U\032\t1!\0319j\023\tawMA\006F]ZL'o\0348nK:$\b\"\002\023\\\t\003qG#\001.\t\017A\\\006\031!C\001c\006!an\0343f+\005\021\bC\0014t\023\t!xM\001\003O_\022,\007b\002<\\\001\004%\ta^\001\t]>$Wm\030\023fcR\021\001p\037\t\003\037eL!A\037\t\003\tUs\027\016\036\005\byV\f\t\0211\001s\003\rAH%\r\005\007}n\003\013\025\002:\002\0139|G-\032\021\t\017\005\0051\f\"\021\002\004\005IqN\\\"p]:,7\r\036\013\004q\006\025\001\"\0029\000\001\004\021\bbBA\0057\022\005\0231B\001\r_:$\025n]2p]:,7\r\036\013\004q\0065\001B\0029\002\b\001\007!\017C\004\002\022m#\t%a\005\002\023=tW*Z:tC\036,Gc\001=\002\026!A\021qCA\b\001\004\tI\"A\004nKN\034\030mZ3\021\007\031\fY\"C\002\002\036\035\024q!T3tg\006<W\rC\004\002\"m#\t!a\t\002\023I,7m\0348oK\016$Hc\001=\002&!A\021qEA\020\001\004\tI#A\003o_\022,7\017\005\003\020\003W\021\030bAA\027!\t)\021I\035:bs\"9\021\021G.\005\n\005M\022\001\0038pI\026LeNZ8\025\t\005U\0221\b\t\004=\006]\022bAA\035?\n11\013\036:j]\036Da\001]A\030\001\004\021\bbBA 7\022%\021\021I\001\016G>l\007o\0348f]RLeNZ8\025\t\005\r\023q\n\t\005\003\013\nYED\002\020\003\017J1!!\023\021\003\031\001&/\0323fM&!\021\021HA'\025\r\tI\005\005\005\t\003#\ni\0041\001\002T\005I1m\\7q_:,g\016\036\t\004M\006U\023bAA,O\nI1i\\7q_:,g\016\036\005\b\0037ZF\021BA/\0035\031wN\0348fGR|'/\0238g_R!\0211IA0\021!\t\t'!\027A\002\005\r\024!C2p]:,7\r^8s!\r1\027QM\005\004\003O:'!C\"p]:,7\r^8s\021\035\tYg\027C\005\003[\n1\"\\3tg\006<W-\0238g_R!\0211IA8\021!\t9\"!\033A\002\005e\001")
/*    */ public class Debugger implements Delegate {
/*    */   private final Delegator parent;
/*    */   private boolean showInItemList;
/*    */   
/* 14 */   public boolean showInItemList() { return this.showInItemList; } private final int itemId; private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon; public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onItemRightClick(this, stack, world, player); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Debugger(Delegator parent) { Delegate.class.$init$(this); } public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/* 16 */     World world = (World)position.world().get();
/* 17 */     EntityPlayer entityPlayer = player;
/* 18 */     if (entityPlayer instanceof net.minecraftforge.common.util.FakePlayer) { bool = false; }
/* 19 */     else if (entityPlayer instanceof net.minecraft.entity.player.EntityPlayerMP)
/* 20 */     { boolean bool1; TileEntity tileEntity = ExtendedWorld$.MODULE$.extendedWorld(world).getTileEntity(position);
/* 21 */       if (tileEntity instanceof SidedEnvironment) { TileEntity tileEntity1 = tileEntity;
/* 22 */         if (!world.field_72995_K) {
/* 23 */           (new Node[1])[0] = ((SidedEnvironment)tileEntity1).sidedNode(ForgeDirection.getOrientation(side)); Debugger$.MODULE$.reconnect(new Node[1]);
/*    */         } 
/* 25 */         bool1 = true; }
/* 26 */       else if (tileEntity instanceof Environment) { TileEntity tileEntity1 = tileEntity;
/* 27 */         if (!world.field_72995_K) {
/* 28 */           (new Node[1])[0] = ((Environment)tileEntity1).node(); Debugger$.MODULE$.reconnect(new Node[1]);
/*    */         } 
/* 30 */         bool1 = true; }
/*    */       else
/* 32 */       { if (!world.field_72995_K) {
/* 33 */           Debugger$.MODULE$.node().remove();
/*    */         }
/* 35 */         bool1 = true; }
/*    */        bool = bool1; }
/* 37 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   }
/*    */   
/*    */   public static void reconnect(Node[] paramArrayOfNode) {
/*    */     Debugger$.MODULE$.reconnect(paramArrayOfNode);
/*    */   }
/*    */   
/*    */   public static void onMessage(Message paramMessage) {
/*    */     Debugger$.MODULE$.onMessage(paramMessage);
/*    */   }
/*    */   
/*    */   public static void onDisconnect(Node paramNode) {
/*    */     Debugger$.MODULE$.onDisconnect(paramNode);
/*    */   }
/*    */   
/*    */   public static void onConnect(Node paramNode) {
/*    */     Debugger$.MODULE$.onConnect(paramNode);
/*    */   }
/*    */   
/*    */   public static void node_$eq(Node paramNode) {
/*    */     Debugger$.MODULE$.node_$eq(paramNode);
/*    */   }
/*    */   
/*    */   public static Node node() {
/*    */     return Debugger$.MODULE$.node();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Debugger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */