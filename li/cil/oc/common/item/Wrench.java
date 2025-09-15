/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import li.cil.oc.api.internal.Wrench;
/*     */ import li.cil.oc.common.asm.Injectable.Interface;
/*     */ import li.cil.oc.common.asm.Injectable.InterfaceList;
/*     */ import li.cil.oc.common.item.traits.SimpleItem;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityMinecart;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.WeightedRandomChestContent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.ChestGenHooks;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ @InterfaceList({@Interface(value = "appeng.api.implementations.items.IAEWrench", modid = "appliedenergistics2"), @Interface(value = "buildcraft.api.tools.IToolWrench", modid = "BuildCraftAPI|tools"), @Interface(value = "com.bluepowermod.api.misc.IScrewdriver", modid = "bluepowerAPI"), @Interface(value = "cofh.api.item.IToolHammer", modid = "CoFHAPI|item"), @Interface(value = "crazypants.enderio.tool.ITool", modid = "EnderIO"), @Interface(value = "mekanism.api.IMekWrench", modid = "Mekanism"), @Interface(value = "powercrystals.minefactoryreloaded.api.IMFRHammer", modid = "MineFactoryReloaded"), @Interface(value = "mrtjp.projectred.api.IScrewdriver", modid = "ProjRed|Core"), @Interface(value = "mods.railcraft.api.core.items.IToolCrowbar", modid = "Railcraft"), @Interface(value = "ic2.api.item.IBoxable", modid = "IC2")})
/*     */ @ScalaSignature(bytes = "\006\001\t=e\001B\001\003\0015\021aa\026:f]\016D'BA\002\005\003\021IG/Z7\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\030;A\021q\"F\007\002!)\0211!\005\006\003%M\t\021\"\\5oK\016\024\030M\032;\013\003Q\t1A\\3u\023\t1\002C\001\003Ji\026l\007C\001\r\034\033\005I\"B\001\016\003\003\031!(/Y5ug&\021A$\007\002\013'&l\007\017\\3Ji\026l\007C\001\020$\033\005y\"B\001\021\"\003!Ig\016^3s]\006d'B\001\022\007\003\r\t\007/[\005\003\003}AQ!\n\001\005\002\031\na\001P5oSRtD#A\024\021\005!\002Q\"\001\002\t\013)\002A\021I\026\002%\021|Wm]*oK\006\\')\0379bgN,6/\032\013\007YIJd\b\021\"\021\0055\002T\"\001\030\013\003=\nQa]2bY\006L!!\r\030\003\017\t{w\016\\3b]\")1'\013a\001i\005)qo\034:mIB\021QgN\007\002m)\0211'E\005\003qY\022QaV8sY\022DQAO\025A\002m\n\021\001\037\t\003[qJ!!\020\030\003\007%sG\017C\003@S\001\0071(A\001z\021\025\t\025\0061\001<\003\005Q\b\"B\"*\001\004!\025A\0029mCf,'\017\005\002F\0236\taI\003\002D\017*\021\001*E\001\007K:$\030\016^=\n\005)3%\001D#oi&$\030\020\0257bs\026\024\b\"\002'\001\t\003j\025AD8o\023R,W.V:f\r&\0248\017\036\013\fY9\033F+\026,X1j{\026\rC\003P\027\002\007\001+A\003ti\006\0347\016\005\002\020#&\021!\013\005\002\n\023R,Wn\025;bG.DQaQ&A\002\021CQaM&A\002QBQAO&A\002mBQaP&A\002mBQ!Q&A\002mBQ!W&A\002m\nAa]5eK\")1l\023a\0019\006!\001.\033;Y!\tiS,\003\002_]\t)a\t\\8bi\")\001m\023a\0019\006!\001.\033;Z\021\025\0217\n1\001]\003\021A\027\016\036.\t\013\021\004A\021A3\002!U\034Xm\026:f]\016DwJ\034\"m_\016\\Gc\002\027gO\"L'n\033\005\006\007\016\004\r\001\022\005\006g\r\004\r\001\016\005\006u\r\004\ra\017\005\006\r\004\ra\017\005\006\003\016\004\ra\017\005\006Y\016\004\r\001L\001\tg&lW\017\\1uK\")a\016\001C\001_\006I1-\0318Xe\026t7\r\033\013\007YA\f(o\035;\t\013=k\007\031\001)\t\013\rk\007\031\001#\t\013ij\007\031A\036\t\013}j\007\031A\036\t\013\005k\007\031A\036\t\013Y\004A\021A<\002\r\021\fW.Y4f)\025a\0030\037>|\021\025yU\0171\001Q\021\0251X\0171\001<\021\025\031U\0171\001E\021\025aX\0171\001-\003%\031\030.\\;mCR,G\rC\003o\001\021\005a\020\006\005-\006\005\0211AA\003\021\025\031U\0201\001E\021\025QT\0201\001<\021\025yT\0201\001<\021\025\tU\0201\001<\021\035\tI\001\001C\001\003\027\t!b\036:f]\016DWk]3e))\ti!a\005\002\026\005]\021\021\004\t\004[\005=\021bAA\t]\t!QK\\5u\021\031\031\025q\001a\001\t\"1!(a\002A\002mBaaPA\004\001\004Y\004BB!\002\b\001\0071\b\003\004o\001\021\005\021Q\004\013\006Y\005}\021\021\005\005\007\007\006m\001\031\001#\t\017!\013Y\0021\001\002$A!\021QEA\024\033\0059\025bAA\025\017\n1QI\034;jifDq!!\003\001\t\003\ti\003\006\004\002\016\005=\022\021\007\005\007\007\006-\002\031\001#\t\017!\013Y\0031\001\002$!9\021Q\007\001\005\002\005]\022\001C5t+N\f'\r\\3\025\0271\nI$a\017\002D\005\025\023q\t\005\007\037\006M\002\031\001)\t\017\r\013\031\0041\001\002>A!\021QEA \023\r\t\te\022\002\021\013:$\030\016^=MSZLgn\032\"bg\026DaAOA\032\001\004Y\004BB \0024\001\0071\b\003\004B\003g\001\ra\017\005\b\003\027\002A\021AA'\003!!xn\0347Vg\026$G\003DA\007\003\037\n\t&a\025\002V\005]\003BB(\002J\001\007\001\013C\004D\003\023\002\r!!\020\t\ri\nI\0051\001<\021\031y\024\021\na\001w!1\021)!\023A\002mBq!a\027\001\t\003\ti&\001\004dC:,6/\032\013\fY\005}\023\021MA2\003K\n9\007\003\004P\0033\002\r\001\025\005\007\007\006e\003\031\001#\t\ri\nI\0061\001<\021\031y\024\021\fa\001w!1\021)!\027A\002mBq!a\033\001\t\003\ti'\001\003vg\026$G\003DA\007\003_\n\t(a\035\002v\005]\004BB(\002j\001\007\001\013\003\004D\003S\002\r\001\022\005\007u\005%\004\031A\036\t\r}\nI\0071\001<\021\031\t\025\021\016a\001w!9\0211\020\001\005\002\005u\024\001D2b]V\033Xm\026:f]\016DG#\003\027\002\000\005\005\0251QAC\021\031\031\025\021\020a\001\t\"1!(!\037A\002mBaaPA=\001\004Y\004BB!\002z\001\0071\bC\004\002\\\001!\t!!#\025\0131\nY)a$\t\017\0055\025q\021a\001\t\006aQM\034;jif\004F.Y=fe\"9\021\021SAD\001\004\001\026!C5uK6\034F/Y2l\021\035\t)\n\001C\001\003/\013\021\003Z1nC\036,7k\031:fo\022\024\030N^3s)\031\ti!!'\002\034\"11'a%A\002QBaaQAJ\001\004!\005bBAK\001\021\005\021q\024\013\007\003\033\t\t+a)\t\r\r\013i\n1\001E\021\031y\025Q\024a\001!\"9\021q\025\001\005\002\005%\026\001C2b]^C\027mY6\025\0271\nY+!,\0020\006E\0261\027\005\007\007\006\025\006\031\001#\t\r=\013)\0131\001Q\021\031Q\024Q\025a\001w!1q(!*A\002mBa!QAS\001\004Y\004bBA\\\001\021\005\021\021X\001\b_:<\006.Y2l)1\ti!a/\002>\006}\026\021YAb\021\031\031\025Q\027a\001\t\"1q*!.A\002ACaAOA[\001\004Y\004BB \0026\002\0071\b\003\004B\003k\003\ra\017\005\b\003\017\004A\021AAe\003\035\031\027M\034'j].$r\001LAf\003\033\fy\r\003\004D\003\013\004\r\001\022\005\007\037\006\025\007\031\001)\t\021\005E\027Q\031a\001\003'\fAaY1siB!\021Q[Am\033\t\t9N\003\002\004\017&!\0211\\Al\0059)e\016^5us6Kg.Z2beRDq!a8\001\t\003\t\t/\001\004p]2Kgn\033\013\t\003\033\t\031/!:\002h\"11)!8A\002\021CaaTAo\001\004\001\006\002CAi\003;\004\r!a5\t\017\005-\b\001\"\001\002n\006A1-\0318C_>\034H\017F\004-\003_\f\t0a=\t\r\r\013I\0171\001E\021\031y\025\021\036a\001!\"A\021\021[Au\001\004\t\031\016C\004\002x\002!\t!!?\002\017=t'i\\8tiRA\021QBA~\003{\fy\020\003\004D\003k\004\r\001\022\005\007\037\006U\b\031\001)\t\021\005E\027Q\037a\001\003'DqAa\001\001\t\003\021)!\001\013dC:\024Um\025;pe\026$\027J\034+p_2\024w\016\037\013\004Y\t\035\001BB(\003\002\001\007\001\013K\004\001\005\027\021yB!\t\021\t\t5!\021\004\b\005\005\037\021)\"\004\002\003\022)\031!1\003\003\002\007\005\034X.\003\003\003\030\tE\021AC%oU\026\034G/\0312mK&!!1\004B\017\0055Ie\016^3sM\006\034W\rT5ti*!!q\003B\t\003\0251\030\r\\;fYQ\021\031C!\016\003@\t%#1\013B/\005O\022\tHa\037\003\006.R!Q\005B\020\005W\021yC!\r\021\t\t5!qE\005\005\005S\021iBA\005J]R,'OZ1dK\006\022!QF\001+CB\004XM\\4/CBLg&[7qY\026lWM\034;bi&|gn\035\030ji\026l7OL%B\013^\023XM\\2i\003\025iw\016Z5eC\t\021\031$A\nbaBd\027.\0323f]\026\024x-[:uS\016\034(g\013\006\003&\t}!q\007B\030\005w\t#A!\017\002A\t,\030\016\0343de\0064GOL1qS:\"xn\0347t]%#vn\0347Xe\026t7\r[\021\003\005{\t1CQ;jY\022\034%/\0314u\003BKE\020^8pYN\\#B!\n\003 \t\005#q\006B#C\t\021\031%\001\024d_6t#\r\\;fa><XM]7pI:\n\007/\033\030nSN\034g&S*de\026<HM]5wKJ\f#Aa\022\002\031\tdW/\0329po\026\024\030\tU%,\025\t\025\"q\004B&\005_\021y%\t\002\003N\005I2m\0344i]\005\004\030NL5uK6t\023\nV8pY\"\013W.\\3sC\t\021\t&\001\007D_\032C\025\tU%}SR,Wn\013\006\003&\t}!Q\013B\030\0053\n#Aa\026\002;\r\024\030M_=qC:$8OL3oI\026\024\030n\034\030u_>dg&\023+p_2\f#Aa\027\002\017\025sG-\032:J\037.R!Q\005B\020\005?\022yCa\031\"\005\t\005\024aF7fW\006t\027n]7/CBLg&S'fW^\023XM\\2iC\t\021)'\001\005NK.\fg.[:nW)\021)Ca\b\003j\t=\"QN\021\003\005W\n\001\007]8xKJ\034'/_:uC2\034h&\\5oK\032\f7\r^8ssJ,Gn\\1eK\022t\023\r]5/\02363%\013S1n[\026\024\030E\001B8\003Mi\025N\\3GC\016$xN]=SK2|\027\rZ3eW)\021)Ca\b\003t\t=\"qO\021\003\005k\n\021%\034:uUBt\003O]8kK\016$(/\0323/CBLg&S*de\026<HM]5wKJ\f#A!\037\002\031A\023xN\033*fIr\034uN]3,\025\t\025\"q\004B?\005_\021\t)\t\002\003\000\005QSn\0343t]I\f\027\016\\2sC\032$h&\0319j]\r|'/\032\030ji\026l7OL%U_>d7I]8xE\006\024\030E\001BB\003%\021\026-\0337de\0064Go\013\006\003&\t}!q\021B\030\005\027\013#A!#\002+%\034'GL1qS:JG/Z7/\023\n{\0070\0312mK\006\022!QR\001\004\023\016\023\004")
/*     */ public class Wrench
/*     */   extends Item
/*     */   implements SimpleItem, Wrench {
/*     */   public ItemStack createItemStack(int amount) {
/*  28 */     return SimpleItem.class.createItemStack(this, amount); } public boolean isBookEnchantable(ItemStack stack, ItemStack book) { return SimpleItem.class.isBookEnchantable(this, stack, book); } public WeightedRandomChestContent getChestGenBase(ChestGenHooks chest, Random rnd, WeightedRandomChestContent original) { return SimpleItem.class.getChestGenBase(this, chest, rnd, original); } @SideOnly(Side.CLIENT) public void func_77624_a(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { SimpleItem.class.addInformation(this, stack, player, tooltip, advanced); } public int createItemStack$default$1() { return SimpleItem.class.createItemStack$default$1(this); } public Wrench() { SimpleItem.class.$init$(this);
/*  29 */     setHarvestLevel("wrench", 1);
/*  30 */     func_77625_d(1); }
/*     */    public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) {
/*  32 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: iload #4
/*     */     //   3: iload #5
/*     */     //   5: iload #6
/*     */     //   7: invokevirtual func_72899_e : (III)Z
/*     */     //   10: ifeq -> 136
/*     */     //   13: aload_3
/*     */     //   14: aload_2
/*     */     //   15: iload #4
/*     */     //   17: iload #5
/*     */     //   19: iload #6
/*     */     //   21: invokevirtual func_72962_a : (Lnet/minecraft/entity/player/EntityPlayer;III)Z
/*     */     //   24: ifeq -> 136
/*     */     //   27: aload_3
/*     */     //   28: iload #4
/*     */     //   30: iload #5
/*     */     //   32: iload #6
/*     */     //   34: invokevirtual func_147439_a : (III)Lnet/minecraft/block/Block;
/*     */     //   37: astore #11
/*     */     //   39: aload #11
/*     */     //   41: ifnull -> 104
/*     */     //   44: aload #11
/*     */     //   46: astore #12
/*     */     //   48: aload #12
/*     */     //   50: aload_3
/*     */     //   51: iload #4
/*     */     //   53: iload #5
/*     */     //   55: iload #6
/*     */     //   57: iload #7
/*     */     //   59: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   62: invokevirtual rotateBlock : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   65: ifeq -> 104
/*     */     //   68: aload #12
/*     */     //   70: aload_3
/*     */     //   71: iload #4
/*     */     //   73: iload #5
/*     */     //   75: iload #6
/*     */     //   77: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
/*     */     //   80: invokevirtual func_149695_a : (Lnet/minecraft/world/World;IIILnet/minecraft/block/Block;)V
/*     */     //   83: aload_2
/*     */     //   84: invokevirtual func_71038_i : ()V
/*     */     //   87: aload_3
/*     */     //   88: getfield field_72995_K : Z
/*     */     //   91: ifeq -> 98
/*     */     //   94: iconst_0
/*     */     //   95: goto -> 99
/*     */     //   98: iconst_1
/*     */     //   99: istore #13
/*     */     //   101: goto -> 127
/*     */     //   104: aload_0
/*     */     //   105: aload_1
/*     */     //   106: aload_2
/*     */     //   107: aload_3
/*     */     //   108: iload #4
/*     */     //   110: iload #5
/*     */     //   112: iload #6
/*     */     //   114: iload #7
/*     */     //   116: fload #8
/*     */     //   118: fload #9
/*     */     //   120: fload #10
/*     */     //   122: invokespecial onItemUseFirst : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;IIIIFFF)Z
/*     */     //   125: istore #13
/*     */     //   127: iload #13
/*     */     //   129: ifeq -> 136
/*     */     //   132: iconst_1
/*     */     //   133: goto -> 137
/*     */     //   136: iconst_0
/*     */     //   137: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #35	-> 0
/*     */     //   #36	-> 39
/*     */     //   #37	-> 68
/*     */     //   #38	-> 83
/*     */     //   #39	-> 87
/*     */     //   #36	-> 99
/*     */     //   #41	-> 104
/*     */     //   #35	-> 127
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	138	0	this	Lli/cil/oc/common/item/Wrench;
/*     */     //   0	138	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	138	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	138	3	world	Lnet/minecraft/world/World;
/*     */     //   0	138	4	x	I
/*     */     //   0	138	5	y	I
/*     */     //   0	138	6	z	I
/*     */     //   0	138	7	side	I
/*     */     //   0	138	8	hitX	F
/*     */     //   0	138	9	hitY	F
/*     */     //   0	138	10	hitZ	F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean useWrenchOnBlock(EntityPlayer player, World world, int x, int y, int z, boolean simulate) {
/*  46 */     if (!simulate) player.func_71038_i(); 
/*  47 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canWrench(ItemStack stack, EntityPlayer player, int x, int y, int z) {
/*  52 */     return true;
/*     */   }
/*     */   public boolean damage(ItemStack stack, int damage, EntityPlayer player, boolean simulated) {
/*  55 */     return (damage == 0);
/*     */   }
/*     */   
/*     */   public boolean canWrench(EntityPlayer player, int x, int y, int z) {
/*  59 */     return true;
/*     */   } public void wrenchUsed(EntityPlayer player, int x, int y, int z) {
/*  61 */     player.func_71038_i();
/*     */   } public boolean canWrench(EntityPlayer player, Entity entity) {
/*  63 */     return true;
/*     */   } public void wrenchUsed(EntityPlayer player, Entity entity) {
/*  65 */     player.func_71038_i();
/*     */   }
/*     */   
/*     */   public boolean isUsable(ItemStack stack, EntityLivingBase player, int x, int y, int z) {
/*  69 */     return true;
/*     */   } public void toolUsed(ItemStack stack, EntityLivingBase player, int x, int y, int z) {
/*  71 */     player.func_71038_i();
/*     */   }
/*     */   
/*     */   public boolean canUse(ItemStack stack, EntityPlayer player, int x, int y, int z) {
/*  75 */     return true;
/*     */   }
/*     */   
/*     */   public void used(ItemStack stack, EntityPlayer player, int x, int y, int z) {}
/*     */   
/*     */   public boolean canUseWrench(EntityPlayer player, int x, int y, int z) {
/*  81 */     return true;
/*     */   }
/*     */   
/*     */   public boolean canUse(EntityPlayer entityPlayer, ItemStack itemStack) {
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void damageScrewdriver(World world, EntityPlayer player) {}
/*     */ 
/*     */   
/*     */   public void damageScrewdriver(EntityPlayer player, ItemStack stack) {}
/*     */   
/*     */   public boolean canWhack(EntityPlayer player, ItemStack stack, int x, int y, int z) {
/*  95 */     return true;
/*     */   }
/*     */   public void onWhack(EntityPlayer player, ItemStack stack, int x, int y, int z) {}
/*     */   public boolean canLink(EntityPlayer player, ItemStack stack, EntityMinecart cart) {
/*  99 */     return false;
/*     */   }
/*     */   public void onLink(EntityPlayer player, ItemStack stack, EntityMinecart cart) {}
/*     */   public boolean canBoost(EntityPlayer player, ItemStack stack, EntityMinecart cart) {
/* 103 */     return false;
/*     */   }
/*     */   
/*     */   public void onBoost(EntityPlayer player, ItemStack stack, EntityMinecart cart) {}
/*     */   
/*     */   public boolean canBeStoredInToolbox(ItemStack stack) {
/* 109 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Wrench.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */