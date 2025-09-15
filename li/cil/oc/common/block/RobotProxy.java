/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.common.block.traits.SpecialBlock;
/*     */ import li.cil.oc.common.item.data.RobotData;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.util.Tooltip$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t=h\001B\001\003\0015\021!BU8c_R\004&o\034=z\025\t\031A!A\003cY>\0347N\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\021\001aB\005\r\021\005=\001R\"\001\002\n\005E\021!!\004*fIN$xN\\3Bo\006\024X\r\005\002\024-5\tAC\003\002\026\005\0051AO]1jiNL!a\006\013\003\031M\003XmY5bY\ncwnY6\021\005MI\022B\001\016\025\005)\031F/\031;f\003^\f'/\032\005\0069\001!\t!H\001\007y%t\027\016\036 \025\003y\001\"a\004\001\t\017\001\002!\031!C!C\005\021r-\032;V]2|7-\0317ju\026$g*Y7f+\005\021\003CA\022)\033\005!#BA\023'\003\021a\027M\\4\013\003\035\nAA[1wC&\021\021\006\n\002\007'R\024\030N\\4\t\r-\002\001\025!\003#\003M9W\r^+oY>\034\027\r\\5{K\022t\025-\\3!\021%i\003\0011AA\002\023%a&\001\003jG>tW#A\030\021\005A:T\"A\031\013\005I\032\024\001B;uS2T!\001N\033\002\0235Lg.Z2sC\032$(\"\001\034\002\0079,G/\003\0029c\t)\021*S2p]\"I!\b\001a\001\002\004%IaO\001\tS\016|gn\030\023fcR\021AH\021\t\003{\001k\021A\020\006\002\005)1oY1mC&\021\021I\020\002\005+:LG\017C\004Ds\005\005\t\031A\030\002\007a$\023\007\003\004F\001\001\006KaL\001\006S\016|g\016\t\005\b\017\002\001\r\021\"\001I\003\031iwN^5oOV\t\021\nE\002$\0252K!a\023\023\003\027QC'/Z1e\031>\034\027\r\034\t\004{5{\025B\001(?\005\031y\005\017^5p]B\021\001kU\007\002#*\021!\013B\001\013i&dW-\0328uSRL\030B\001+R\005\025\021vNY8u\021\0351\006\0011A\005\002]\013!\"\\8wS:<w\fJ3r)\ta\004\fC\004D+\006\005\t\031A%\t\ri\003\001\025)\003J\003\035iwN^5oO\002BQ\001\030\001\005Bu\013!C]3hSN$XM\035\"m_\016\\\027jY8ogR\021AH\030\005\006?n\003\r\001Y\001\rS\016|gNU3hSN$XM\035\t\003C\"l\021A\031\006\003G\022\fq\001^3yiV\024XM\003\002fM\006A!/\0328eKJ,'O\003\002hg\00511\r\\5f]RL!!\0332\003\033%K5m\0348SK\036L7\017^3sQ\021Y6n\036=\021\0051,X\"A7\013\0059|\027A\003:fY\006,hn\0315fe*\021\001/]\001\004M6d'B\001:t\003\021iw\016Z:\013\003Q\f1a\0319x\023\t1XN\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005I\030B\001>|\003\031\031E*S#O)*\021A0\\\001\005'&$W\rC\003\001\021\005s0A\004hKRL5m\0348\025\013=\n\t!!\006\t\017\005\rQ\0201\001\002\006\005!1/\0333f!\021\t9!!\005\016\005\005%!b\001\032\002\f)\031Q!!\004\013\007\005=Q'\001\bnS:,7M]1gi\032|'oZ3\n\t\005M\021\021\002\002\017\r>\024x-\032#je\026\034G/[8o\021\035\t9\" a\001\0033\t\001\"\\3uC\022\fG/\031\t\004{\005m\021bAA\017}\t\031\021J\034;)\tu\\w\017\037\005\b\003G\001A\021IA\023\003Q\031\bn\\;mINKG-\032\"f%\026tG-\032:fIRa\021qEA\027\003w\ty$a\021\002HA\031Q(!\013\n\007\005-bHA\004C_>dW-\0318\t\021\005=\022\021\005a\001\003c\tQa^8sY\022\004B!a\r\00285\021\021Q\007\006\004\003_\031\024\002BA\035\003k\021A\"\023\"m_\016\\\027iY2fgND\001\"!\020\002\"\001\007\021\021D\001\002q\"A\021\021IA\021\001\004\tI\"A\001z\021!\t)%!\tA\002\005e\021!\001>\t\021\005\r\021\021\005a\001\003\013Aq!a\023\001\t\003\ni%\001\007jg\ncwnY6T_2LG\r\006\007\002(\005=\023\021KA*\003+\n9\006\003\005\0020\005%\003\031AA\031\021!\ti$!\023A\002\005e\001\002CA!\003\023\002\r!!\007\t\021\005\025\023\021\na\001\0033A\001\"a\001\002J\001\007\021Q\001\005\b\0037\002A\021IA/\003-I7oU5eKN{G.\0333\025\031\005\035\022qLA1\003G\n)'a\032\t\021\005=\022\021\fa\001\003cA\001\"!\020\002Z\001\007\021\021\004\005\t\003\003\nI\0061\001\002\032!A\021QIA-\001\004\tI\002\003\005\002\004\005e\003\031AA\003\021\035\tY\007\001C!\003[\nAbZ3u!&\0347N\0217pG.$B\"a\034\002|\005\025\025QRAH\003#\003B!!\035\002x5\021\0211\017\006\004\003k\032\024\001B5uK6LA!!\037\002t\tI\021\n^3n'R\f7m\033\005\t\003{\nI\0071\001\002\000\0051A/\031:hKR\0042\001MAA\023\r\t\031)\r\002\025\033>4\030N\\4PE*,7\r\036)pg&$\030n\0348\t\021\005=\022\021\016a\001\003\017\003B!a\r\002\n&!\0211RA\033\005\0259vN\0357e\021!\ti$!\033A\002\005e\001\002CA!\003S\002\r!!\007\t\021\005\025\023\021\016a\001\0033Aq!!&\001\t\003\n9*\001\004sCJLG/\037\013\005\0033\013y\n\005\003\002r\005m\025\002BAO\003g\022!\"\0228v[J\013'/\033;z\021!\t\t+a%A\002\005=\024!B:uC\016\\\007bBAS\001\021E\023qU\001\fi>|G\016^5q\021\026\fG\rF\006=\003S\013Y+!,\002@\006e\007\002CA\f\003G\003\r!!\007\t\021\005\005\0261\025a\001\003_B\001\"a,\002$\002\007\021\021W\001\007a2\f\0270\032:\021\t\005M\0261X\007\003\003kSA!a,\0028*\031\021\021X\032\002\r\025tG/\033;z\023\021\ti,!.\003\031\025sG/\033;z!2\f\0270\032:\t\021\005\005\0271\025a\001\003\007\fq\001^8pYRL\007\017\005\004\002F\006%\027QZ\007\003\003\017T!A\r\024\n\t\005-\027q\031\002\005\031&\034H\017\005\003\002P\006UgbA\037\002R&\031\0211\033 \002\rA\023X\rZ3g\023\rI\023q\033\006\004\003't\004\002CAn\003G\003\r!a\n\002\021\005$g/\0318dK\022Dq!a8\001\t#\n\t/A\006u_>dG/\0339C_\022LHc\003\037\002d\006\025\030q]Au\003WD\001\"a\006\002^\002\007\021\021\004\005\t\003C\013i\0161\001\002p!A\021qVAo\001\004\t\t\f\003\005\002B\006u\007\031AAb\021!\tY.!8A\002\005\035\002bBAx\001\021E\023\021_\001\fi>|G\016^5q)\006LG\016F\006=\003g\f)0a>\002z\006m\b\002CA\f\003[\004\r!!\007\t\021\005\005\026Q\036a\001\003_B\001\"a,\002n\002\007\021\021\027\005\t\003\003\fi\0171\001\002D\"A\0211\\Aw\001\004\t9\003C\004\002\000\002!IA!\001\002\021\005$G\rT5oKN$R\001\020B\002\005\013A\001\"!)\002~\002\007\021q\016\005\t\003\003\fi\0201\001\002D\"9!\021\002\001\005B\t-\021\001E2sK\006$X\rV5mK\026sG/\033;z)\031\021iAa\006\003\032A!!q\002B\n\033\t\021\tB\003\002Sg%!!Q\003B\t\005)!\026\016\\3F]RLG/\037\005\t\003_\0219\0011\001\002\b\"A\021q\003B\004\001\004\tI\002C\004\003\036\001!\tEa\b\002-\035,G/\022=qY>\034\030n\0348SKNL7\017^1oG\026$BA!\t\003(A\031QHa\t\n\007\t\025bHA\003GY>\fG\017\003\005\002:\nm\001\031\001B\025!\021\021YC!\f\016\005\005]\026\002\002B\030\003o\023a!\0228uSRL\bb\002B\032\001\021\005#QG\001\tO\026$HI]8qgRq!q\007B\037\005\021\tEa\021\003F\t\035\003CBAc\005s\ty'\003\003\003<\005\035'!C!se\006LH*[:u\021!\tyC!\rA\002\005\035\005\002CA\037\005c\001\r!!\007\t\021\005\005#\021\007a\001\0033A\001\"!\022\0032\001\007\021\021\004\005\t\003/\021\t\0041\001\002\032!A!\021\nB\031\001\004\tI\"A\004g_J$XO\\3\t\023\t5\003A1A\005\n\t=\023!G4fi\022\023x\016\035$peJ+\027\r\034#s_B\034\025\r\0347feN,\"A!\025\021\013\tM#Q\f\022\016\005\tU#\002\002B,\0053\n\021\"[7nkR\f'\r\\3\013\007\tmc(\001\006d_2dWm\031;j_:LAAa\030\003V\t\0311+\032;\t\021\t\r\004\001)A\005\005#\n!dZ3u\tJ|\007OR8s%\026\fG\016\022:pa\016\013G\016\\3sg\002BqAa\032\001\t\023\021I'A\rhKR$\030N\\4Ee>\0048OR8s\003\016$X/\0317Ee>\004XCAA\024\021\035\021i\007\001C!\005_\n\021\"\0338uKJ\034Xm\031;\025\035\005}$\021\017B:\005k\0229H!\037\003\004\"A\021q\006B6\001\004\t9\t\003\005\002>\t-\004\031AA\r\021!\t\tEa\033A\002\005e\001\002CA#\005W\002\r!!\007\t\021\tm$1\016a\001\005{\nQa\035;beR\0042\001\rB@\023\r\021\t)\r\002\005-\026\0347\007\003\005\003\006\n-\004\031\001B?\003\r)g\016\032\005\b\005\023\003A\021\tBF\003q!wnU3u\0052|7m\033\"pk:$7OQ1tK\022|en\025;bi\026$\022\002\020BG\005\037\023\tJa%\t\021\005=\"q\021a\001\003cA\001\"!\020\003\b\002\007\021\021\004\005\t\003\003\0229\t1\001\002\032!A\021Q\tBD\001\004\tI\002C\004\003\030\002!\tE!'\002!=t'\t\\8dW\006\033G/\033<bi\026$G\003FA\024\0057\023iJa(\003\"\n\r&Q\025BT\005W\023y\013\003\005\0020\tU\005\031AAD\021!\tiD!&A\002\005e\001\002CA!\005+\003\r!!\007\t\021\005\025#Q\023a\001\0033A\001\"a,\003\026\002\007\021\021\027\005\t\003\007\021)\n1\001\002\006!A!\021\026BK\001\004\021\t#\001\003iSRD\006\002\003BW\005+\003\rA!\t\002\t!LG/\027\005\t\005c\023)\n1\001\003\"\005!\001.\033;[\021\035\021)\f\001C!\005o\013qb\0348CY>\0347\016\0257bG\026$')\037\013\016y\te&1\030B_\005\023\tM!3\t\021\005=\"1\027a\001\003\017C\001\"!\020\0034\002\007\021\021\004\005\t\003\003\022\031\f1\001\002\032!A\021Q\tBZ\001\004\tI\002\003\005\002:\nM\006\031\001Bb!\021\021YC!2\n\t\t\035\027q\027\002\021\013:$\030\016^=MSZLgn\032\"bg\026D\001\"!)\0034\002\007\021q\016\005\b\005\033\004A\021\tBh\003=\021X-\\8wK\022\024\025\020\0257bs\026\024HCDA\024\005#\024\031N!6\003X\ne'1\034\005\t\003_\021Y\r1\001\002\b\"A\021q\026Bf\001\004\t\t\f\003\005\002>\t-\007\031AA\r\021!\t\tEa3A\002\005e\001\002CA#\005\027\004\r!!\007\t\021\tu'1\032a\001\003O\t1b^5mY\"\013'O^3ti\"9!\021\035\001\005B\t\r\030!E8o\0052|7m\033)sK\022+7\017\036:psRYAH!:\003h\n%(1\036Bw\021!\tyCa8A\002\005\035\005\002CA\037\005?\004\r!!\007\t\021\005\005#q\034a\001\0033A\001\"!\022\003`\002\007\021\021\004\005\t\003/\021y\0161\001\002\032\001")
/*     */ public class RobotProxy extends RedstoneAware implements SpecialBlock, StateAware {
/*     */   private final String getUnlocalizedName;
/*     */   private IIcon icon;
/*     */   private ThreadLocal<Option<Robot>> moving;
/*     */   private final Set<String> li$cil$oc$common$block$RobotProxy$$getDropForRealDropCallers;
/*     */   
/*  33 */   public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public String func_149739_a() { return this.getUnlocalizedName; } private IIcon icon() { return this.icon; } private void icon_$eq(IIcon x$1) { this.icon = x$1; } public ThreadLocal<Option<Robot>> moving() { return this.moving; } public void moving_$eq(ThreadLocal<Option<Robot>> x$1) { this.moving = x$1; } public final class RobotProxy$$anon$1 extends ThreadLocal<Option<Robot>> { public RobotProxy$$anon$1(RobotProxy $outer) {} public None$ initialValue() { return None$.MODULE$; } } @SideOnly(Side.CLIENT) public void func_149651_a(IIconRegister iconRegister) { super.func_149651_a(iconRegister); icon_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":GenericTop").toString())); } @SideOnly(Side.CLIENT) public IIcon getIcon(ForgeDirection side, int metadata) { return icon(); } public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return false; } public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return false; } public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return false; } public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) { ItemStack itemStack; TileEntity tileEntity = world.func_147438_o(x, y, z); if (tileEntity instanceof li.cil.oc.common.tileentity.RobotProxy) { li.cil.oc.common.tileentity.RobotProxy robotProxy = (li.cil.oc.common.tileentity.RobotProxy)tileEntity; itemStack = robotProxy.robot().info().copyItemStack(); } else { itemStack = null; }  return itemStack; } public RobotProxy() { SpecialBlock.class.$init$(this); StateAware.class.$init$(this);
/*  34 */     func_149713_g(0);
/*  35 */     func_149647_a(null);
/*  36 */     NEI$.MODULE$.hide(this);
/*     */     
/*  38 */     this.getUnlocalizedName = "Robot";
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.moving = new RobotProxy$$anon$1(this);
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
/* 164 */     (new String[1])[0] = 
/* 165 */       "appeng.parts.automation.PartAnnihilationPlane.EatBlock"; this.li$cil$oc$common$block$RobotProxy$$getDropForRealDropCallers = (Set<String>)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[1])); }
/*     */   public EnumRarity rarity(ItemStack stack) { RobotData data = new RobotData(stack); return Rarity$.MODULE$.byTier(data.tier()); } public void tooltipHead(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) { super.tooltipHead(metadata, stack, player, tooltip, advanced); addLines(stack, tooltip); } public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { tooltip.addAll(Tooltip$.MODULE$.get("Robot", (Seq)Predef$.MODULE$.genericWrapArray(new Object[0]))); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) { super.tooltipTail(metadata, stack, player, tooltip, advanced); if (KeyBindings$.MODULE$.showExtendedTooltips()) { RobotData info = new RobotData(stack); ItemStack[] components = (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])info.containers()).$plus$plus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])info.components()), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))); if (components.length > 0) { tooltip.addAll(Tooltip$.MODULE$.get("Server.Components", (Seq)Predef$.MODULE$.genericWrapArray(new Object[0]))); Predef$.MODULE$.refArrayOps((Object[])components).withFilter((Function1)new RobotProxy$$anonfun$tooltipTail$1(this)).foreach((Function1)new RobotProxy$$anonfun$tooltipTail$2(this, tooltip)); }  }  } public final class RobotProxy$$anonfun$tooltipTail$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack component) { return !(component == null); } public RobotProxy$$anonfun$tooltipTail$1(RobotProxy $outer) {} } public final class RobotProxy$$anonfun$tooltipTail$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/* 168 */     public static final long serialVersionUID = 0L; private final List tooltip$1; public RobotProxy$$anonfun$tooltipTail$2(RobotProxy $outer, List tooltip$1) {} public final boolean apply(ItemStack component) { return this.tooltip$1.add((new StringBuilder()).append("- ").append(component.func_82833_r()).toString()); } } private void addLines(ItemStack stack, List tooltip) { if (stack.func_77942_o()) { double xp = stack.func_77978_p().func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("xp").toString()); int level = package$.MODULE$.min((int)(Math.pow(xp - Settings$.MODULE$.get().baseXpToLevel(), true / Settings$.MODULE$.get().exponentialXpGrowth()) / Settings$.MODULE$.get().constantXpGrowth()), 30); stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("xp").toString()) ? ((level > 0) ? BoxesRunTime.boxToBoolean(tooltip.addAll(Tooltip$.MODULE$.get((new StringBuilder()).append(func_149739_a()).append("_Level").toString(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(level) })))) : BoxedUnit.UNIT) : BoxedUnit.UNIT; if (stack.func_77978_p().func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString())) { int energy = stack.func_77978_p().func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString()); if (energy > 0) tooltip.addAll(Tooltip$.MODULE$.get((new StringBuilder()).append(func_149739_a()).append("_StoredEnergy").toString(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(energy) })));  }  }  } public TileEntity createTileEntity(World world, int metadata) { li.cil.oc.common.tileentity.RobotProxy robotProxy; Option option = moving().get(); if (option instanceof Some) { Some some = (Some)option; Robot robot = (Robot)some.x(); robotProxy = new li.cil.oc.common.tileentity.RobotProxy(robot); } else { robotProxy = new li.cil.oc.common.tileentity.RobotProxy(); }  return (TileEntity)robotProxy; } public float func_149638_a(Entity entity) { return 10.0F; } public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) { BoxedUnit boxedUnit; ArrayList<ItemStack> list = new ArrayList(); TileEntity tileEntity = world.func_147438_o(x, y, z); if (tileEntity instanceof li.cil.oc.common.tileentity.RobotProxy) { li.cil.oc.common.tileentity.RobotProxy robotProxy = (li.cil.oc.common.tileentity.RobotProxy)tileEntity; Robot robot = robotProxy.robot(); if (gettingDropsForActualDrop()) { robot.node().remove(); robot.saveComponents(); }  boxedUnit = (BoxedUnit)(world.field_72995_K ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(list.add(robot.info().createItemStack()))); } else { boxedUnit = BoxedUnit.UNIT; }  return list; } public Set<String> li$cil$oc$common$block$RobotProxy$$getDropForRealDropCallers() { return this.li$cil$oc$common$block$RobotProxy$$getDropForRealDropCallers; } private boolean gettingDropsForActualDrop() { return Predef$.MODULE$.refArrayOps((Object[])(new Exception()).getStackTrace()).exists((Function1)new RobotProxy$$anonfun$gettingDropsForActualDrop$1(this)); } public final class RobotProxy$$anonfun$gettingDropsForActualDrop$1 extends AbstractFunction1<StackTraceElement, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(StackTraceElement element) { return this.$outer.li$cil$oc$common$block$RobotProxy$$getDropForRealDropCallers().contains((new StringBuilder()).append(element.getClassName()).append(".").append(element.getMethodName()).toString()); }
/*     */      public RobotProxy$$anonfun$gettingDropsForActualDrop$1(RobotProxy $outer) {} }
/*     */   public MovingObjectPosition intersect(World world, int x, int y, int z, Vec3 start, Vec3 end) {
/* 171 */     AxisAlignedBB bounds = func_149668_a(world, x, y, z);
/* 172 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 173 */     if (tileEntity instanceof li.cil.oc.common.tileentity.RobotProxy) { li.cil.oc.common.tileentity.RobotProxy robotProxy = (li.cil.oc.common.tileentity.RobotProxy)tileEntity; if (robotProxy.robot().animationTicksLeft() <= 0 && bounds.func_72318_a(start)) return null;  }
/* 174 */      return super.intersect(world, x, y, z, start, end);
/*     */   }
/*     */ 
/*     */   
/*     */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
/* 179 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 180 */     if (tileEntity instanceof li.cil.oc.common.tileentity.RobotProxy) { li.cil.oc.common.tileentity.RobotProxy robotProxy = (li.cil.oc.common.tileentity.RobotProxy)tileEntity;
/* 181 */       Robot robot = robotProxy.robot();
/* 182 */       AxisAlignedBB bounds = AxisAlignedBB.func_72330_a(0.1D, 0.1D, 0.1D, 0.9D, 0.9D, 0.9D);
/*     */       
/* 184 */       double remaining = robot.animationTicksLeft() / robot.animationTicksTotal();
/* 185 */       int dx = robot.moveFromX() - robot.x();
/* 186 */       int dy = robot.moveFromY() - robot.y();
/* 187 */       int dz = robot.moveFromZ() - robot.z();
/* 188 */       robot.isAnimatingMove() ? bounds.func_72317_d(dx * remaining, dy * remaining, dz * remaining) : BoxedUnit.UNIT;
/*     */       
/* 190 */       setBlockBounds(bounds); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 191 */     else { super.doSetBlockBoundsBasedOnState(world, x, y, z); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
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
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: invokevirtual func_70093_af : ()Z
/*     */     //   5: ifeq -> 111
/*     */     //   8: aload #5
/*     */     //   10: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   13: ifnonnull -> 107
/*     */     //   16: aload_1
/*     */     //   17: getfield field_72995_K : Z
/*     */     //   20: ifeq -> 29
/*     */     //   23: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   26: goto -> 102
/*     */     //   29: aload_1
/*     */     //   30: iload_2
/*     */     //   31: iload_3
/*     */     //   32: iload #4
/*     */     //   34: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   37: astore #13
/*     */     //   39: aload #13
/*     */     //   41: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   44: ifeq -> 95
/*     */     //   47: aload #13
/*     */     //   49: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   52: astore #14
/*     */     //   54: aload #14
/*     */     //   56: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   59: invokeinterface isRunning : ()Z
/*     */     //   64: ifne -> 95
/*     */     //   67: aload #14
/*     */     //   69: aload #5
/*     */     //   71: invokevirtual func_70300_a : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   74: ifeq -> 95
/*     */     //   77: aload #14
/*     */     //   79: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   82: invokeinterface start : ()Z
/*     */     //   87: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   90: astore #15
/*     */     //   92: goto -> 100
/*     */     //   95: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   98: astore #15
/*     */     //   100: aload #15
/*     */     //   102: pop
/*     */     //   103: iconst_1
/*     */     //   104: goto -> 208
/*     */     //   107: iconst_0
/*     */     //   108: goto -> 208
/*     */     //   111: aload_1
/*     */     //   112: getfield field_72995_K : Z
/*     */     //   115: ifne -> 207
/*     */     //   118: aload_1
/*     */     //   119: iload_2
/*     */     //   120: iload_3
/*     */     //   121: iload #4
/*     */     //   123: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   126: astore #10
/*     */     //   128: aload #10
/*     */     //   130: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   133: ifeq -> 202
/*     */     //   136: aload #10
/*     */     //   138: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   141: astore #11
/*     */     //   143: aload #11
/*     */     //   145: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   148: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   151: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   156: ifnull -> 202
/*     */     //   159: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*     */     //   162: aload #11
/*     */     //   164: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   167: invokevirtual sendRobotSelectedSlotChange : (Lli/cil/oc/common/tileentity/Robot;)V
/*     */     //   170: aload #5
/*     */     //   172: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   175: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   178: invokevirtual Robot : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   181: invokeinterface id : ()I
/*     */     //   186: aload_1
/*     */     //   187: iload_2
/*     */     //   188: iload_3
/*     */     //   189: iload #4
/*     */     //   191: invokevirtual openGui : (Ljava/lang/Object;ILnet/minecraft/world/World;III)V
/*     */     //   194: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   197: astore #12
/*     */     //   199: goto -> 207
/*     */     //   202: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   205: astore #12
/*     */     //   207: iconst_1
/*     */     //   208: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #199	-> 0
/*     */     //   #213	-> 8
/*     */     //   #214	-> 16
/*     */     //   #215	-> 29
/*     */     //   #216	-> 39
/*     */     //   #217	-> 95
/*     */     //   #215	-> 100
/*     */     //   #214	-> 102
/*     */     //   #220	-> 103
/*     */     //   #222	-> 107
/*     */     //   #200	-> 111
/*     */     //   #204	-> 118
/*     */     //   #205	-> 128
/*     */     //   #206	-> 159
/*     */     //   #207	-> 170
/*     */     //   #205	-> 197
/*     */     //   #208	-> 202
/*     */     //   #211	-> 207
/*     */     //   #199	-> 208
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	209	0	this	Lli/cil/oc/common/block/RobotProxy;
/*     */     //   0	209	1	world	Lnet/minecraft/world/World;
/*     */     //   0	209	2	x	I
/*     */     //   0	209	3	y	I
/*     */     //   0	209	4	z	I
/*     */     //   0	209	5	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	209	6	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	209	7	hitX	F
/*     */     //   0	209	8	hitY	F
/*     */     //   0	209	9	hitZ	F
/*     */   }
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
/*     */   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: iload_2
/*     */     //   3: iload_3
/*     */     //   4: iload #4
/*     */     //   6: aload #5
/*     */     //   8: aload #6
/*     */     //   10: invokespecial func_149689_a : (Lnet/minecraft/world/World;IIILnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;)V
/*     */     //   13: aload_1
/*     */     //   14: getfield field_72995_K : Z
/*     */     //   17: ifne -> 390
/*     */     //   20: new scala/Tuple2
/*     */     //   23: dup
/*     */     //   24: aload #5
/*     */     //   26: aload_1
/*     */     //   27: iload_2
/*     */     //   28: iload_3
/*     */     //   29: iload #4
/*     */     //   31: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   34: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   37: astore #8
/*     */     //   39: aload #8
/*     */     //   41: ifnull -> 138
/*     */     //   44: aload #8
/*     */     //   46: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   49: checkcast net/minecraft/entity/EntityLivingBase
/*     */     //   52: astore #9
/*     */     //   54: aload #8
/*     */     //   56: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   59: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   62: astore #10
/*     */     //   64: aload #9
/*     */     //   66: instanceof li/cil/oc/server/agent/Player
/*     */     //   69: ifeq -> 138
/*     */     //   72: aload #9
/*     */     //   74: checkcast li/cil/oc/server/agent/Player
/*     */     //   77: astore #11
/*     */     //   79: aload #10
/*     */     //   81: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   84: ifeq -> 138
/*     */     //   87: aload #10
/*     */     //   89: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   92: astore #12
/*     */     //   94: new scala/Some
/*     */     //   97: dup
/*     */     //   98: new scala/Tuple3
/*     */     //   101: dup
/*     */     //   102: aload #12
/*     */     //   104: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   107: aload #11
/*     */     //   109: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   112: invokeinterface ownerName : ()Ljava/lang/String;
/*     */     //   117: aload #11
/*     */     //   119: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   122: invokeinterface ownerUUID : ()Ljava/util/UUID;
/*     */     //   127: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   130: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   133: astore #13
/*     */     //   135: goto -> 235
/*     */     //   138: aload #8
/*     */     //   140: ifnull -> 230
/*     */     //   143: aload #8
/*     */     //   145: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   148: checkcast net/minecraft/entity/EntityLivingBase
/*     */     //   151: astore #14
/*     */     //   153: aload #8
/*     */     //   155: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   158: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   161: astore #15
/*     */     //   163: aload #14
/*     */     //   165: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   168: ifeq -> 230
/*     */     //   171: aload #14
/*     */     //   173: checkcast net/minecraft/entity/player/EntityPlayer
/*     */     //   176: astore #16
/*     */     //   178: aload #15
/*     */     //   180: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   183: ifeq -> 230
/*     */     //   186: aload #15
/*     */     //   188: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   191: astore #17
/*     */     //   193: new scala/Some
/*     */     //   196: dup
/*     */     //   197: new scala/Tuple3
/*     */     //   200: dup
/*     */     //   201: aload #17
/*     */     //   203: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   206: aload #16
/*     */     //   208: invokevirtual func_70005_c_ : ()Ljava/lang/String;
/*     */     //   211: aload #16
/*     */     //   213: invokevirtual func_146103_bH : ()Lcom/mojang/authlib/GameProfile;
/*     */     //   216: invokevirtual getId : ()Ljava/util/UUID;
/*     */     //   219: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   222: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   225: astore #13
/*     */     //   227: goto -> 235
/*     */     //   230: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   233: astore #13
/*     */     //   235: aload #13
/*     */     //   237: astore #7
/*     */     //   239: aload #7
/*     */     //   241: instanceof scala/Some
/*     */     //   244: ifeq -> 385
/*     */     //   247: aload #7
/*     */     //   249: checkcast scala/Some
/*     */     //   252: astore #18
/*     */     //   254: aload #18
/*     */     //   256: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   259: checkcast scala/Tuple3
/*     */     //   262: astore #19
/*     */     //   264: aload #19
/*     */     //   266: ifnull -> 385
/*     */     //   269: aload #19
/*     */     //   271: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   274: checkcast li/cil/oc/common/tileentity/Robot
/*     */     //   277: astore #20
/*     */     //   279: aload #19
/*     */     //   281: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   284: checkcast java/lang/String
/*     */     //   287: astore #21
/*     */     //   289: aload #19
/*     */     //   291: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   294: checkcast java/util/UUID
/*     */     //   297: astore #22
/*     */     //   299: aload #20
/*     */     //   301: aload #21
/*     */     //   303: invokevirtual ownerName_$eq : (Ljava/lang/String;)V
/*     */     //   306: aload #20
/*     */     //   308: getstatic li/cil/oc/server/agent/Player$.MODULE$ : Lli/cil/oc/server/agent/Player$;
/*     */     //   311: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   314: aload #22
/*     */     //   316: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   319: invokevirtual determineUUID : (Lscala/Option;)Ljava/util/UUID;
/*     */     //   322: invokevirtual ownerUUID_$eq : (Ljava/util/UUID;)V
/*     */     //   325: aload #20
/*     */     //   327: invokevirtual info : ()Lli/cil/oc/common/item/data/RobotData;
/*     */     //   330: aload #6
/*     */     //   332: invokevirtual load : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   335: aload #20
/*     */     //   337: invokevirtual bot : ()Lli/cil/oc/server/component/Robot;
/*     */     //   340: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   343: aload #20
/*     */     //   345: invokevirtual info : ()Lli/cil/oc/common/item/data/RobotData;
/*     */     //   348: invokevirtual robotEnergy : ()I
/*     */     //   351: i2d
/*     */     //   352: aload #20
/*     */     //   354: invokevirtual bot : ()Lli/cil/oc/server/component/Robot;
/*     */     //   357: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   360: invokeinterface localBuffer : ()D
/*     */     //   365: dsub
/*     */     //   366: invokeinterface changeBuffer : (D)D
/*     */     //   371: pop2
/*     */     //   372: aload #20
/*     */     //   374: invokevirtual updateInventorySize : ()V
/*     */     //   377: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   380: astore #23
/*     */     //   382: goto -> 390
/*     */     //   385: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   388: astore #23
/*     */     //   390: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #226	-> 0
/*     */     //   #227	-> 13
/*     */     //   #228	-> 44
/*     */     //   #229	-> 94
/*     */     //   #227	-> 138
/*     */     //   #230	-> 143
/*     */     //   #231	-> 193
/*     */     //   #232	-> 230
/*     */     //   #227	-> 235
/*     */     //   #234	-> 239
/*     */     //   #235	-> 299
/*     */     //   #236	-> 306
/*     */     //   #237	-> 325
/*     */     //   #238	-> 335
/*     */     //   #239	-> 372
/*     */     //   #234	-> 380
/*     */     //   #240	-> 385
/*     */     //   #225	-> 390
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	391	0	this	Lli/cil/oc/common/block/RobotProxy;
/*     */     //   0	391	1	world	Lnet/minecraft/world/World;
/*     */     //   0	391	2	x	I
/*     */     //   0	391	3	y	I
/*     */     //   0	391	4	z	I
/*     */     //   0	391	5	entity	Lnet/minecraft/entity/EntityLivingBase;
/*     */     //   0	391	6	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   54	337	9	player	Lnet/minecraft/entity/EntityLivingBase;
/*     */     //   64	327	10	proxy	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   153	238	14	player	Lnet/minecraft/entity/EntityLivingBase;
/*     */     //   163	228	15	proxy	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   279	112	20	robot	Lli/cil/oc/common/tileentity/Robot;
/*     */     //   289	102	21	owner	Ljava/lang/String;
/*     */     //   299	92	22	uuid	Ljava/util/UUID;
/*     */   }
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
/*     */   public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_3
/*     */     //   2: iload #4
/*     */     //   4: iload #5
/*     */     //   6: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   9: astore #7
/*     */     //   11: aload #7
/*     */     //   13: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   16: ifeq -> 227
/*     */     //   19: aload #7
/*     */     //   21: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   24: astore #8
/*     */     //   26: aload #8
/*     */     //   28: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   31: astore #10
/*     */     //   33: aload #10
/*     */     //   35: invokevirtual isCreative : ()Z
/*     */     //   38: ifeq -> 65
/*     */     //   41: aload_2
/*     */     //   42: getfield field_71075_bZ : Lnet/minecraft/entity/player/PlayerCapabilities;
/*     */     //   45: getfield field_75098_d : Z
/*     */     //   48: ifeq -> 63
/*     */     //   51: aload #10
/*     */     //   53: aload_2
/*     */     //   54: invokevirtual func_70005_c_ : ()Ljava/lang/String;
/*     */     //   57: invokevirtual canInteract : (Ljava/lang/String;)Z
/*     */     //   60: ifne -> 65
/*     */     //   63: iconst_0
/*     */     //   64: ireturn
/*     */     //   65: aload_1
/*     */     //   66: getfield field_72995_K : Z
/*     */     //   69: ifne -> 136
/*     */     //   72: aload #10
/*     */     //   74: invokevirtual player : ()Lli/cil/oc/server/agent/Player;
/*     */     //   77: aload_2
/*     */     //   78: astore #11
/*     */     //   80: dup
/*     */     //   81: ifnonnull -> 93
/*     */     //   84: pop
/*     */     //   85: aload #11
/*     */     //   87: ifnull -> 101
/*     */     //   90: goto -> 103
/*     */     //   93: aload #11
/*     */     //   95: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   98: ifeq -> 103
/*     */     //   101: iconst_0
/*     */     //   102: ireturn
/*     */     //   103: aload #10
/*     */     //   105: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   108: invokeinterface remove : ()V
/*     */     //   113: aload #10
/*     */     //   115: invokevirtual saveComponents : ()V
/*     */     //   118: aload_0
/*     */     //   119: aload_1
/*     */     //   120: iload_3
/*     */     //   121: iload #4
/*     */     //   123: iload #5
/*     */     //   125: aload #10
/*     */     //   127: invokevirtual info : ()Lli/cil/oc/common/item/data/RobotData;
/*     */     //   130: invokevirtual createItemStack : ()Lnet/minecraft/item/ItemStack;
/*     */     //   133: invokevirtual func_149642_a : (Lnet/minecraft/world/World;IIILnet/minecraft/item/ItemStack;)V
/*     */     //   136: aload_1
/*     */     //   137: aload #10
/*     */     //   139: invokevirtual moveFromX : ()I
/*     */     //   142: aload #10
/*     */     //   144: invokevirtual moveFromY : ()I
/*     */     //   147: aload #10
/*     */     //   149: invokevirtual moveFromZ : ()I
/*     */     //   152: invokevirtual func_147439_a : (III)Lnet/minecraft/block/Block;
/*     */     //   155: ldc_w 'robotAfterimage'
/*     */     //   158: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   161: invokeinterface block : ()Lnet/minecraft/block/Block;
/*     */     //   166: astore #12
/*     */     //   168: dup
/*     */     //   169: ifnonnull -> 181
/*     */     //   172: pop
/*     */     //   173: aload #12
/*     */     //   175: ifnull -> 189
/*     */     //   178: goto -> 219
/*     */     //   181: aload #12
/*     */     //   183: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   186: ifeq -> 219
/*     */     //   189: aload_1
/*     */     //   190: aload #10
/*     */     //   192: invokevirtual moveFromX : ()I
/*     */     //   195: aload #10
/*     */     //   197: invokevirtual moveFromY : ()I
/*     */     //   200: aload #10
/*     */     //   202: invokevirtual moveFromZ : ()I
/*     */     //   205: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
/*     */     //   208: iconst_0
/*     */     //   209: iconst_1
/*     */     //   210: invokevirtual func_147465_d : (IIILnet/minecraft/block/Block;II)Z
/*     */     //   213: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   216: goto -> 222
/*     */     //   219: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   222: astore #9
/*     */     //   224: goto -> 232
/*     */     //   227: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   230: astore #9
/*     */     //   232: aload #9
/*     */     //   234: pop
/*     */     //   235: aload_0
/*     */     //   236: aload_1
/*     */     //   237: aload_2
/*     */     //   238: iload_3
/*     */     //   239: iload #4
/*     */     //   241: iload #5
/*     */     //   243: iload #6
/*     */     //   245: invokespecial removedByPlayer : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;IIIZ)Z
/*     */     //   248: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #245	-> 0
/*     */     //   #246	-> 11
/*     */     //   #247	-> 26
/*     */     //   #252	-> 33
/*     */     //   #253	-> 65
/*     */     //   #254	-> 72
/*     */     //   #255	-> 103
/*     */     //   #256	-> 113
/*     */     //   #257	-> 118
/*     */     //   #259	-> 136
/*     */     //   #260	-> 189
/*     */     //   #259	-> 219
/*     */     //   #246	-> 222
/*     */     //   #262	-> 227
/*     */     //   #245	-> 232
/*     */     //   #264	-> 235
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	249	0	this	Lli/cil/oc/common/block/RobotProxy;
/*     */     //   0	249	1	world	Lnet/minecraft/world/World;
/*     */     //   0	249	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	249	3	x	I
/*     */     //   0	249	4	y	I
/*     */     //   0	249	5	z	I
/*     */     //   0	249	6	willHarvest	Z
/*     */     //   33	216	10	robot	Lli/cil/oc/common/tileentity/Robot;
/*     */   }
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
/*     */   public void func_149725_f(World world, int x, int y, int z, int metadata) {
/* 268 */     if (((Option)moving().get()).isEmpty())
/* 269 */       super.func_149725_f(world, x, y, z, metadata); 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\RobotProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */