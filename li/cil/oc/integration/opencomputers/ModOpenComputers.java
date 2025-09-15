/*     */ package li.cil.oc.integration.opencomputers;
/*     */ 
/*     */ import li.cil.oc.api.IMC;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.manual.PathProvider;
/*     */ import li.cil.oc.common.block.SimpleBlock;
/*     */ import li.cil.oc.integration.Mods;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Set;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
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
/*     */ @ScalaSignature(bytes = "\006\001\005}u!B\001\003\021\003i\021\001E'pI>\003XM\\\"p[B,H/\032:t\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003!5{Gm\0249f]\016{W\016];uKJ\0348cA\b\0235A\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\03495\tA!\003\002\036\t\tAQj\0343Qe>D\030\020C\003 \037\021\005\001%\001\004=S:LGO\020\013\002\033!)!e\004C!G\0051q-\032;N_\022$\022\001\n\t\003K!r!a\007\024\n\005\035\"\021\001B'pINL!!\013\026\003\023MKW\016\0357f\033>$'BA\024\005\021\025as\002\"\021.\003)Ig.\033;jC2L'0\032\013\002]A\021qFM\007\002a)\t\021'A\003tG\006d\027-\003\0024a\t!QK\\5u\021\025)t\002\"\0017\003%)8/Z,sK:\034\007\016\006\0048u\035ce\n\025\t\003_aJ!!\017\031\003\017\t{w\016\\3b]\")1\b\016a\001y\0051\001\017\\1zKJ\004\"!P#\016\003yR!aO \013\005\001\013\025AB3oi&$\030P\003\002C\007\006IQ.\0338fGJ\fg\r\036\006\002\t\006\031a.\032;\n\005\031s$\001D#oi&$\030\020\0257bs\026\024\b\"\002%5\001\004I\025!\001=\021\005=R\025BA&1\005\rIe\016\036\005\006\033R\002\r!S\001\002s\")q\n\016a\001\023\006\t!\020C\003Ri\001\007q'\001\tdQ\006tw-\032#ve\006\024\027\016\\5us\")1k\004C\001)\006A\021n],sK:\034\007\016\006\0028+\")aK\025a\001/\006)1\017^1dWB\021\001lW\007\0023*\021!,Q\001\005SR,W.\003\002]3\nI\021\n^3n'R\f7m\033\005\006=>!\taX\001\nG\006t7\t[1sO\026$\"a\0161\t\013Yk\006\031A,\t\013\t|A\021A2\002\r\rD\027M]4f)\021!w\r\0336\021\005=*\027B\00141\005\031!u.\0362mK\")a+\031a\001/\")\021.\031a\001I\0061\021-\\8v]RDQa[1A\002]\n\001b]5nk2\fG/\032\005\006[>!\tA\\\001\030S:\\7)\031:ue&$w-Z%oWB\023xN^5eKJ$\"!S8\t\013Yc\007\031A,\t\013E|A\021\001:\002\035\021LX-\0238l!J|g/\0333feR\021\021j\035\005\006-B\004\ra\026\005\006k>!IA^\001\016E2\f7m\0337jgRDun\035;\025\t9:\030\021\004\005\006qR\004\r!_\001\005Q>\034H\017M\002{\003\017\001Ba\037@\002\0049\021q\006`\005\003{B\na\001\025:fI\0264\027bA@\002\002\t)1\t\\1tg*\021Q\020\r\t\005\003\013\t9\001\004\001\005\027\005%q/!A\001\002\013\005\0211\002\002\004?\022\n\024\003BA\007\003'\0012aLA\b\023\r\t\t\002\r\002\b\035>$\b.\0338h!\ry\023QC\005\004\003/\001$aA!os\"9\0211\004;A\002\005u\021!C5uK6t\025-\\3t!\025y\023qDA\022\023\r\t\t\003\r\002\013yI,\007/Z1uK\022t\004cA>\002&%!\021qEA\001\005\031\031FO]5oO\0369\0211F\b\t\002\0055\022A\006#fM&t\027\016^5p]B\013G\017\033)s_ZLG-\032:\021\t\005=\022\021G\007\002\037\0319\0211G\b\t\002\005U\"A\006#fM&t\027\016^5p]B\013G\017\033)s_ZLG-\032:\024\013\005E\"#a\016\021\t\005e\0221I\007\003\003wQA!!\020\002@\0051Q.\0318vC2T1!!\021\007\003\r\t\007/[\005\005\003\013\nYD\001\007QCRD\007K]8wS\022,'\017C\004 \003c!\t!!\023\025\005\0055\002BCA'\003c\021\r\021\"\004\002P\005I!\t\\1dW2L7\017^\013\003\003#\002b!a\025\002^\005\005TBAA+\025\021\t9&!\027\002\023%lW.\036;bE2,'bAA.a\005Q1m\0347mK\016$\030n\0348\n\t\005}\023Q\013\002\004'\026$\bcA\n\002d%\031\021q\005\013\t\023\005\035\024\021\007Q\001\016\005E\023A\003\"mC\016\\G.[:uA!A\0211NA\031\t\003\ni'A\004qCRDgi\034:\025\t\005\r\022q\016\005\007-\006%\004\031A,\t\021\005-\024\021\007C!\003g\"\"\"a\t\002v\005\r\025QQAD\021!\t9(!\035A\002\005e\024!B<pe2$\007\003BA>\003j!!! \013\007\005]\024)\003\003\002\002\006u$!B,pe2$\007B\002%\002r\001\007\021\n\003\004N\003c\002\r!\023\005\007\037\006E\004\031A%\t\021\005-\025\021\007C\005\003\033\013\001c\0315fG.\024E.Y2lY&\034H/\0323\025\t\005\r\022q\022\005\t\003#\013I\t1\001\002\024\006!\021N\0344p!\021\t)*a'\016\005\005]%\002BAM\003\ta\001Z3uC&d\027\002BAO\003/\023\001\"\023;f[&sgm\034")
/*     */ public final class ModOpenComputers
/*     */ {
/*     */   public static int dyeInkProvider(ItemStack paramItemStack) {
/*     */     return ModOpenComputers$.MODULE$.dyeInkProvider(paramItemStack);
/*     */   }
/*     */   
/*     */   public static int inkCartridgeInkProvider(ItemStack paramItemStack) {
/*     */     return ModOpenComputers$.MODULE$.inkCartridgeInkProvider(paramItemStack);
/*     */   }
/*     */   
/*     */   public static double charge(ItemStack paramItemStack, double paramDouble, boolean paramBoolean) {
/*     */     return ModOpenComputers$.MODULE$.charge(paramItemStack, paramDouble, paramBoolean);
/*     */   }
/*     */   
/*     */   public static boolean canCharge(ItemStack paramItemStack) {
/*     */     return ModOpenComputers$.MODULE$.canCharge(paramItemStack);
/*     */   }
/*     */   
/*     */   public static boolean isWrench(ItemStack paramItemStack) {
/*     */     return ModOpenComputers$.MODULE$.isWrench(paramItemStack);
/*     */   }
/*     */   
/*     */   public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*     */     return ModOpenComputers$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
/*     */   }
/*     */   
/*     */   public static void initialize() {
/*     */     ModOpenComputers$.MODULE$.initialize();
/*     */   }
/*     */   
/*     */   public static Mods.SimpleMod getMod() {
/*     */     return ModOpenComputers$.MODULE$.getMod();
/*     */   }
/*     */   
/*     */   public final class ModOpenComputers$$anonfun$blacklistHost$1
/*     */     extends AbstractFunction1<String, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Class host$1;
/*     */     
/*     */     public ModOpenComputers$$anonfun$blacklistHost$1(Class host$1) {}
/*     */     
/*     */     public final void apply(String itemName) {
/* 407 */       IMC.blacklistHost(itemName, this.host$1, Items.get(itemName).createItemStack(1));
/*     */     } }
/*     */   public static class DefinitionPathProvider$ implements PathProvider { public static final DefinitionPathProvider$ MODULE$; private final Set<String> Blacklist;
/*     */     
/* 411 */     public DefinitionPathProvider$() { MODULE$ = this;
/* 412 */       (new String[4])[0] = 
/* 413 */         "debugger";
/* 414 */       (new String[4])[1] = "chipDiamond";
/* 415 */       (new String[4])[2] = "endstone";
/* 416 */       (new String[4])[3] = "nuggetIron";
/*     */       this.Blacklist = (Set<String>)scala.Predef$.MODULE$.Set().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[4])); }
/*     */     public String pathFor(ItemStack stack) { String str;
/* 419 */       Option option = scala.Option$.MODULE$.apply(Items.get(stack));
/* 420 */       if (option instanceof Some) { Some some = (Some)option; ItemInfo definition = (ItemInfo)some.x(); str = checkBlacklisted(definition); }
/* 421 */       else { str = null; }
/*     */        return str; }
/*     */     private final Set<String> Blacklist() { return this.Blacklist; } public String pathFor(World world, int x, int y, int z) { String str;
/* 424 */       Block block = world.func_147439_a(x, y, z);
/* 425 */       if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; str = checkBlacklisted(Items.get(new ItemStack((Block)simpleBlock))); }
/* 426 */       else { str = null; }
/*     */       
/*     */       return str; }
/*     */      private String checkBlacklisted(ItemInfo info) {
/* 430 */       return (info == null || Blacklist().contains(info.name())) ? null : (
/* 431 */         (info.block() == null) ? (
/* 432 */         new StringBuilder()).append("%LANGUAGE%/item/").append(info.name()).append(".md").toString() : (new StringBuilder()).append("%LANGUAGE%/block/").append(info.name()).append(".md").toString());
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\ModOpenComputers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */