/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.EnumRarity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.event.entity.player.EntityInteractEvent;
/*     */ import scala.Option;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\rt!B\001\003\021\003i\021\001C!oC2L(0\032:\013\005\r!\021\001B5uK6T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\t\003:\fG.\037>feN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\002\003\017\020\021\013\007I\021B\017\002\021\005t\027\r\\={KJ,\022A\b\t\003?\021j\021\001\t\006\003C\t\na\001Z3uC&d'BA\022\007\003\r\t\007/[\005\003K\001\022\001\"\023;f[&sgm\034\005\tO=A\t\021)Q\005=\005I\021M\\1msj,'\017\t\005\006S=!\tAK\001\013_:Le\016^3sC\016$HCA\026/!\t\031B&\003\002.)\t!QK\\5u\021\025y\003\0061\0011\003\005)\007CA\031=\033\005\021$BA\0325\003\031\001H.Y=fe*\021QGN\001\007K:$\030\016^=\013\005]B\024!B3wK:$(BA\035;\0039i\027N\\3de\0064GOZ8sO\026T\021aO\001\004]\026$\030BA\0373\005M)e\016^5us&sG/\032:bGR,e/\0328uQ\tAs\b\005\002A\0256\t\021I\003\002C\007\006aQM^3oi\"\fg\016\0327fe*\021Q\001\022\006\003\013\032\0131AZ7m\025\t9\005*\001\003n_\022\034(\"A%\002\007\r\004x/\003\002L\003\nq1+\0362tGJL'-Z#wK:$\b\"B'\020\t\003q\025aB1oC2L(0\032\013\b\037J#VLY4j!\t\031\002+\003\002R)\t9!i\\8mK\006t\007\"B*M\001\004\021\022!\002;iS:<\007\"B\032M\001\004)\006C\001,\\\033\0059&BA\032Y\025\t)\024L\003\002[u\005IQ.\0338fGJ\fg\r^\005\0039^\023A\"\0228uSRL\b\013\\1zKJDQA\030'A\002}\013Aa]5eKB\0211\003Y\005\003CR\0211!\0238u\021\025\031G\n1\001e\003\021A\027\016\036-\021\005M)\027B\0014\025\005\0251En\\1u\021\025AG\n1\001e\003\021A\027\016^-\t\013)d\005\031\0013\002\t!LGO\027\005\006Y>!I!\\\001\rC:\fG.\037>f\035>$Wm\035\013\004W9L\b\"B8l\001\004\001\030!\0028pI\026\034\bcA\nrg&\021!\017\006\002\006\003J\024\030-\037\t\003i^l\021!\036\006\003m\n\nqA\\3uo>\0248.\003\002yk\n!aj\0343f\021\025\0314\0161\001V\r\021\001\"\001A>\024\007i\024B\020E\002~\003\003i\021A \006\003\n\ta\001\036:bSR\034\030bAA\002}\nAA)\0327fO\006$X\r\003\006\002\bi\024)\031!C\001\003\023\ta\001]1sK:$XCAA\006!\rq\021QB\005\004\003\037\021!!\003#fY\026<\027\r^8s\021)\t\031B\037B\001B\003%\0211B\001\ba\006\024XM\034;!\021\031I\"\020\"\001\002\030Q!\021\021DA\016!\tq!\020\003\005\002\b\005U\001\031AA\006\021\035\tyB\037C!\003C\t\001c\0348Ji\026l'+[4ii\016c\027nY6\025\021\005\r\022QFA\031\003\001B!!\n\002*5\021\021q\005\006\003\007eKA!a\013\002(\tI\021\n^3n'R\f7m\033\005\t\003_\ti\0021\001\002$\005)1\017^1dW\"A\0211GA\017\001\004\t)$A\003x_JdG\r\005\003\0028\005mRBAA\035\025\r\t\031$W\005\005\003{\tIDA\003X_JdG\r\003\0044\003;\001\r!\026\005\b\003\007RH\021IA#\003%yg.\023;f[V\033X\rF\bP\003\017\nI%a\023\002\\\005u\023qLA1\021!\ty#!\021A\002\005\r\002BB\032\002B\001\007Q\013\003\005\002N\005\005\003\031AA(\003!\001xn]5uS>t\007\003BA)\003/j!!a\025\013\007\005Uc!\001\003vi&d\027\002BA-\003'\022QB\0217pG.\004vn]5uS>t\007B\0020\002B\001\007q\f\003\004d\003\003\002\r\001\032\005\007Q\006\005\003\031\0013\t\r)\f\t\0051\001e\001")
/*     */ public class Analyzer
/*     */   implements Delegate
/*     */ {
/*     */   private final Delegator parent;
/*     */   private boolean showInItemList;
/*     */   private final int itemId;
/*     */   private Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon;
/*     */   
/*     */   public boolean showInItemList() {
/* 102 */     return this.showInItemList; } public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public int itemId() { return this.itemId; } public Option<IIcon> li$cil$oc$common$item$traits$Delegate$$_icon() { return this.li$cil$oc$common$item$traits$Delegate$$_icon; } public void li$cil$oc$common$item$traits$Delegate$$_icon_$eq(Option<IIcon> x$1) { this.li$cil$oc$common$item$traits$Delegate$$_icon = x$1; } public void li$cil$oc$common$item$traits$Delegate$_setter_$itemId_$eq(int x$1) { this.itemId = x$1; } public String unlocalizedName() { return Delegate.class.unlocalizedName(this); } public Option<String> tooltipName() { return Delegate.class.tooltipName(this); } public Seq<Object> tooltipData() { return Delegate.class.tooltipData(this); } public int maxStackSize() { return Delegate.class.maxStackSize(this); } public ItemStack createItemStack(int amount) { return Delegate.class.createItemStack(this, amount); } public boolean doesSneakBypassUse(BlockPosition position, EntityPlayer player) { return Delegate.class.doesSneakBypassUse(this, position, player); } public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) { return Delegate.class.onItemUseFirst(this, stack, player, position, side, hitX, hitY, hitZ); } public EnumAction getItemUseAction(ItemStack stack) { return Delegate.class.getItemUseAction(this, stack); } public int getMaxItemUseDuration(ItemStack stack) { return Delegate.class.getMaxItemUseDuration(this, stack); } public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) { return Delegate.class.onEaten(this, stack, world, player); } public void onPlayerStoppedUsing(ItemStack stack, EntityPlayer player, int duration) { Delegate.class.onPlayerStoppedUsing(this, stack, player, duration); } public void update(ItemStack stack, World world, Entity player, int slot, boolean selected) { Delegate.class.update(this, stack, world, player, slot, selected); } public EnumRarity rarity(ItemStack stack) { return Delegate.class.rarity(this, stack); } public int tierFromDriver(ItemStack stack) { return Delegate.class.tierFromDriver(this, stack); } public int color(ItemStack stack, int pass) { return Delegate.class.color(this, stack, pass); } public ItemStack getContainerItem(ItemStack stack) { return Delegate.class.getContainerItem(this, stack); } public boolean hasContainerItem(ItemStack stack) { return Delegate.class.hasContainerItem(this, stack); } public Option<String> displayName(ItemStack stack) { return Delegate.class.displayName(this, stack); } @SideOnly(Side.CLIENT) public void tooltipLines(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { Delegate.class.tooltipLines(this, stack, player, tooltip, advanced); } public void tooltipExtended(ItemStack stack, List tooltip) { Delegate.class.tooltipExtended(this, stack, tooltip); } public void tooltipCosts(ItemStack stack, List tooltip) { Delegate.class.tooltipCosts(this, stack, tooltip); } public boolean isDamageable() { return Delegate.class.isDamageable(this); } public int damage(ItemStack stack) { return Delegate.class.damage(this, stack); } public int maxDamage(ItemStack stack) { return Delegate.class.maxDamage(this, stack); } @SideOnly(Side.CLIENT) public Option<IIcon> icon() { return Delegate.class.icon(this); } @SideOnly(Side.CLIENT) public void icon_$eq(IIcon value) { Delegate.class.icon_$eq(this, value); } @SideOnly(Side.CLIENT) public Option<IIcon> icon(ItemStack stack, int pass) { return Delegate.class.icon(this, stack, pass); } @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister iconRegister) { Delegate.class.registerIcons(this, iconRegister); } public boolean equals(ItemStack stack) { return Delegate.class.equals(this, stack); } public int createItemStack$default$1() { return Delegate.class.createItemStack$default$1(this); } public Delegator parent() { return this.parent; } public Analyzer(Delegator parent) { Delegate.class.$init$(this); }
/*     */    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/* 104 */     if (player.func_70093_af() && stack.func_77942_o()) {
/* 105 */       stack.func_77978_p().func_82580_o((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("clipboard").toString());
/* 106 */       if (stack.func_77978_p().func_82582_d()) {
/* 107 */         stack.func_77982_d(null);
/*     */       }
/*     */     } 
/* 110 */     return Delegate.class.onItemRightClick(this, stack, world, player);
/*     */   }
/*     */   
/*     */   public boolean onItemUse(ItemStack stack, EntityPlayer player, BlockPosition position, int side, float hitX, float hitY, float hitZ) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   4: astore #8
/*     */     //   6: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   9: aload #8
/*     */     //   11: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   14: aload_3
/*     */     //   15: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   18: astore #9
/*     */     //   20: aload #9
/*     */     //   22: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   25: ifeq -> 198
/*     */     //   28: aload #9
/*     */     //   30: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   33: astore #10
/*     */     //   35: iload #4
/*     */     //   37: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   40: aload #10
/*     */     //   42: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   45: astore #11
/*     */     //   47: dup
/*     */     //   48: ifnonnull -> 60
/*     */     //   51: pop
/*     */     //   52: aload #11
/*     */     //   54: ifnull -> 68
/*     */     //   57: goto -> 198
/*     */     //   60: aload #11
/*     */     //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 198
/*     */     //   68: aload_2
/*     */     //   69: invokevirtual func_70093_af : ()Z
/*     */     //   72: ifeq -> 92
/*     */     //   75: aload #10
/*     */     //   77: fload #5
/*     */     //   79: f2d
/*     */     //   80: fload #6
/*     */     //   82: f2d
/*     */     //   83: fload #7
/*     */     //   85: f2d
/*     */     //   86: invokevirtual copyToAnalyzer : (DDD)Z
/*     */     //   89: goto -> 193
/*     */     //   92: aload_1
/*     */     //   93: invokevirtual func_77942_o : ()Z
/*     */     //   96: ifeq -> 192
/*     */     //   99: aload_1
/*     */     //   100: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   103: new scala/collection/mutable/StringBuilder
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   113: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   116: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   119: ldc_w 'clipboard'
/*     */     //   122: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   125: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   128: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   131: ifeq -> 192
/*     */     //   134: aload #8
/*     */     //   136: getfield field_72995_K : Z
/*     */     //   139: ifne -> 188
/*     */     //   142: aload #10
/*     */     //   144: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   147: invokevirtual buffer : ()Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   150: aload_1
/*     */     //   151: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   154: new scala/collection/mutable/StringBuilder
/*     */     //   157: dup
/*     */     //   158: invokespecial <init> : ()V
/*     */     //   161: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   164: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   167: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   170: ldc_w 'clipboard'
/*     */     //   173: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   176: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   179: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   182: aload_2
/*     */     //   183: invokeinterface clipboard : (Ljava/lang/String;Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   188: iconst_1
/*     */     //   189: goto -> 193
/*     */     //   192: iconst_0
/*     */     //   193: istore #12
/*     */     //   195: goto -> 235
/*     */     //   198: getstatic li/cil/oc/common/item/Analyzer$.MODULE$ : Lli/cil/oc/common/item/Analyzer$;
/*     */     //   201: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   204: aload_3
/*     */     //   205: invokevirtual world : ()Lscala/Option;
/*     */     //   208: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   211: checkcast net/minecraft/world/World
/*     */     //   214: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   217: aload_3
/*     */     //   218: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   221: aload_2
/*     */     //   222: iload #4
/*     */     //   224: fload #5
/*     */     //   226: fload #6
/*     */     //   228: fload #7
/*     */     //   230: invokevirtual analyze : (Ljava/lang/Object;Lnet/minecraft/entity/player/EntityPlayer;IFFF)Z
/*     */     //   233: istore #12
/*     */     //   235: iload #12
/*     */     //   237: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 0
/*     */     //   #115	-> 6
/*     */     //   #116	-> 20
/*     */     //   #117	-> 68
/*     */     //   #118	-> 75
/*     */     //   #120	-> 92
/*     */     //   #121	-> 134
/*     */     //   #122	-> 142
/*     */     //   #124	-> 188
/*     */     //   #126	-> 192
/*     */     //   #117	-> 193
/*     */     //   #127	-> 198
/*     */     //   #115	-> 235
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	238	0	this	Lli/cil/oc/common/item/Analyzer;
/*     */     //   0	238	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	238	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	238	3	position	Lli/cil/oc/util/BlockPosition;
/*     */     //   0	238	4	side	I
/*     */     //   0	238	5	hitX	F
/*     */     //   0	238	6	hitY	F
/*     */     //   0	238	7	hitZ	F
/*     */     //   6	231	8	world	Lnet/minecraft/world/World;
/*     */   }
/*     */   
/*     */   public static boolean analyze(Object paramObject, EntityPlayer paramEntityPlayer, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     return Analyzer$.MODULE$.analyze(paramObject, paramEntityPlayer, paramInt, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onInteract(EntityInteractEvent paramEntityInteractEvent) {
/*     */     Analyzer$.MODULE$.onInteract(paramEntityInteractEvent);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Analyzer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */