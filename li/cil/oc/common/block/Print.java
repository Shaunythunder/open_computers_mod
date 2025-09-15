/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import java.util.List;
/*     */ import li.cil.oc.common.block.traits.CustomDrops;
/*     */ import li.cil.oc.common.block.traits.SpecialBlock;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.DoubleRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r=e\001B\001\003\0015\021Q\001\025:j]RT!a\001\003\002\013\tdwnY6\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031R\001\001\b\0231\001\002\"a\004\t\016\003\tI!!\005\002\003\033I+Gm\035;p]\026\fu/\031:f!\t\031b#D\001\025\025\t)\"!\001\004ue\006LGo]\005\003/Q\021Ab\0259fG&\fGN\0217pG.\0042aE\r\034\023\tQBCA\006DkN$x.\034#s_B\034\bC\001\017 \033\005i\"B\001\020\005\003)!\030\016\\3f]RLG/_\005\003\003u\001\"!\t\023\016\003\tR\021aI\001\006g\016\fG.Y\005\003K\t\022\021b\0217p]\026\f'\r\\3\t\021\035\002!Q1A\005\024!\nq\001^5mKR\013w-F\001*!\rQSfG\007\002W)\021AFI\001\be\0264G.Z2u\023\tq3F\001\005DY\006\0348\017V1h\021!\001\004A!A!\002\023I\023\001\003;jY\026$\026m\032\021\t\013I\002A\021A\032\002\rqJg.\033;?)\005!DCA\0337!\ty\001\001C\003(c\001\017\021\006C\0049\001\001\007I\021A\035\002/\r|Gn\034:Nk2$\030\016\0357jKJ|e/\032:sS\022,W#\001\036\021\007\005ZT(\003\002=E\t1q\n\035;j_:\004\"!\t \n\005}\022#aA%oi\"9\021\t\001a\001\n\003\021\025aG2pY>\024X*\0367uSBd\027.\032:Pm\026\024(/\0333f?\022*\027\017\006\002D\rB\021\021\005R\005\003\013\n\022A!\0268ji\"9q\tQA\001\002\004Q\024a\001=%c!1\021\n\001Q!\ni\n\001dY8m_JlU\017\034;ja2LWM](wKJ\024\030\016Z3!\021\035Y\005\0011A\005\0021\013q\002^3yiV\024Xm\024<feJLG-Z\013\002\033B\031\021e\017(\021\005=3V\"\001)\013\005E\023\026\001B;uS2T!a\025+\002\0235Lg.Z2sC\032$(\"A+\002\0079,G/\003\002X!\n)\021*S2p]\"9\021\f\001a\001\n\003Q\026a\005;fqR,(/Z(wKJ\024\030\016Z3`I\025\fHCA\"\\\021\0359\005,!AA\0025Ca!\030\001!B\023i\025\001\005;fqR,(/Z(wKJ\024\030\016Z3!\021\035y\006\0011A\005\002\001\fQ\"[:TS:<G.Z*iCB,W#A1\021\005\005\022\027BA2#\005\035\021un\0347fC:Dq!\032\001A\002\023\005a-A\tjgNKgn\0327f'\"\f\007/Z0%KF$\"aQ4\t\017\035#\027\021!a\001C\"1\021\016\001Q!\n\005\fa\"[:TS:<G.Z*iCB,\007\005C\003l\001\021\005C.A\003dY>tW\rF\0016\021!q\007\001#b\001\n\003y\027!\0069sS:$(\t\\8dWRC'/Z1e\031>\034\027\r\\\013\002aB\031\021O^\033\016\003IT!a\035;\002\t1\fgn\032\006\002k\006!!.\031<b\023\t9(OA\006UQJ,\027\r\032'pG\006d\007\002C=\001\021\003\005\013\025\0029\002-A\024\030N\034;CY>\0347\016\0265sK\006$Gj\\2bY\002BQa\037\001\005\002q\fQbZ3u!JLg\016\036\"m_\016\\W#A\033\t\013y\004A\021I@\002\017\035,G/S2p]Ria*!\001\002\020\005M\021qCA\016\003_Aq!a\001~\001\004\t)!A\003x_JdG\r\005\003\002\b\005-QBAA\005\025\r\t\031AU\005\005\003\033\tIA\001\007J\0052|7m[!dG\026\0348\017\003\004\002\022u\004\r!P\001\002q\"1\021QC?A\002u\n\021!\037\005\007\0033i\b\031A\037\002\003iDq!!\b~\001\004\ty\"\001\006hY>\024\027\r\\*jI\026\004B!!\t\002,5\021\0211\005\006\004#\006\025\"bA\003\002()\031\021\021\006+\002\0355Lg.Z2sC\032$hm\034:hK&!\021QFA\022\00591uN]4f\t&\024Xm\031;j_:Dq!!\r~\001\004\ty\"A\005m_\016\fGnU5eK\":Q0!\016\002N\005=\003\003BA\034\003\023j!!!\017\013\t\005m\022QH\001\013e\026d\027-\0368dQ\026\024(\002BA \003\003\n1AZ7m\025\021\t\031%!\022\002\t5|Gm\035\006\003\003\017\n1a\0319x\023\021\tY%!\017\003\021MKG-Z(oYf\fQA^1mk\026$#!!\025\n\t\005M\023QK\001\007\0072KUI\024+\013\t\005]\023\021H\001\005'&$W\rC\004\002\\\001!\t%!\030\002\037\r|Gn\034:Nk2$\030\016\0357jKJ$\022\"PA0\003C\n\031'!\032\t\021\005\r\021\021\fa\001\003\013Aq!!\005\002Z\001\007Q\bC\004\002\026\005e\003\031A\037\t\017\005e\021\021\fa\001{!9\021\021\016\001\005R\005-\024a\003;p_2$\030\016\035\"pIf$2bQA7\003c\n\t)a%\0020\"9\021qNA4\001\004i\024\001C7fi\006$\027\r^1\t\021\005M\024q\ra\001\003k\nQa\035;bG.\004B!a\036\002~5\021\021\021\020\006\004\003w\022\026\001B5uK6LA!a \002z\tI\021\n^3n'R\f7m\033\005\t\003\007\0139\0071\001\002\006\0061\001\017\\1zKJ\004B!a\"\002\0206\021\021\021\022\006\005\003\007\013YIC\002\002\016J\013a!\0328uSRL\030\002BAI\003\023\023A\"\0228uSRL\b\013\\1zKJD\001\"!&\002h\001\007\021qS\001\bi>|G\016^5q!\031\tI*!(\002\"6\021\0211\024\006\003#RLA!a(\002\034\n!A*[:u!\021\t\031+!+\017\007\005\n)+C\002\002(\n\na\001\025:fI\0264\027\002BAV\003[\023aa\025;sS:<'bAATE!9\021\021WA4\001\004\t\027\001C1em\006t7-\0323\t\017\005U\006\001\"\025\0028\006YAo\\8mi&\004H+Y5m)-\031\025\021XA^\003{\013y,!1\t\017\005=\0241\027a\001{!A\0211OAZ\001\004\t)\b\003\005\002\004\006M\006\031AAC\021!\t)*a-A\002\005]\005bBAY\003g\003\r!\031\005\b\003\013\004A\021IAd\00359W\r\036'jO\"$h+\0317vKRIQ(!3\002L\0065\027q\032\005\t\003\007\t\031\r1\001\002\006!9\021\021CAb\001\004i\004bBA\013\003\007\004\r!\020\005\b\0033\t\031\r1\001>\021\035\t\031\016\001C!\003+\fqbZ3u\031&<\007\016^(qC\016LG/\037\013\n{\005]\027\021\\An\003;D\001\"a\001\002R\002\007\021Q\001\005\b\003#\t\t\0161\001>\021\035\t)\"!5A\002uBq!!\007\002R\002\007Q\bC\004\002b\002!\t%a9\002)MDw.\0367e'&$WMQ3SK:$WM]3e)-\t\027Q]At\003S\fY/!<\t\021\005\r\021q\034a\001\003\013Aq!!\005\002`\002\007Q\bC\004\002\026\005}\007\031A\037\t\017\005e\021q\034a\001{!A\021q^Ap\001\004\ty\"\001\003tS\022,\007bBAz\001\021\005\023Q_\001\rSN\024En\\2l'>d\027\016\032\013\fC\006]\030\021`A~\003{\fy\020\003\005\002\004\005E\b\031AA\003\021\035\t\t\"!=A\002uBq!!\006\002r\002\007Q\bC\004\002\032\005E\b\031A\037\t\021\005=\030\021\037a\001\003?AqAa\001\001\t\003\022)!A\006jgNKG-Z*pY&$GcC1\003\b\t%!1\002B\007\005\037A\001\"a\001\003\002\001\007\021Q\001\005\b\003#\021\t\0011\001>\021\035\t)B!\001A\002uBq!!\007\003\002\001\007Q\b\003\005\002p\n\005\001\031AA\020\021\035\021\031\002\001C!\005+\tAbZ3u!&\0347N\0217pG.$B\"!\036\003\030\t\005\"\021\006B\026\005[A\001B!\007\003\022\001\007!1D\001\007i\006\024x-\032;\021\007=\023i\"C\002\003 A\023A#T8wS:<wJ\0316fGR\004vn]5uS>t\007\002CA\002\005#\001\rAa\t\021\t\005\035!QE\005\005\005O\tIAA\003X_JdG\rC\004\002\022\tE\001\031A\037\t\017\005U!\021\003a\001{!9\021\021\004B\t\001\004i\004b\002B\031\001\021\005#1G\001\030C\022$7i\0347mSNLwN\034\"pq\026\034Hk\034'jgR$rb\021B\033\005o\021IDa\017\003>\t\035#Q\r\005\t\003\007\021y\0031\001\003$!9\021\021\003B\030\001\004i\004bBA\013\005_\001\r!\020\005\b\0033\021y\0031\001>\021!\021yDa\fA\002\t\005\023\001B7bg.\0042a\024B\"\023\r\021)\005\025\002\016\003bL7/\0217jO:,GM\021\"\t\021\t%#q\006a\001\005\027\nA\001\\5tiB\"!Q\nB*!\031\tI*!(\003PA!!\021\013B*\031\001!AB!\026\003H\005\005\t\021!B\001\005/\0221a\030\0232#\021\021IFa\030\021\007\005\022Y&C\002\003^\t\022qAT8uQ&tw\rE\002\"\005CJ1Aa\031#\005\r\te.\037\005\t\003\033\023y\0031\001\003hA!!\021\016B6\033\t\tY)\003\003\003n\005-%AB#oi&$\030\020C\004\003r\001!\tFa\035\002\023%tG/\032:tK\016$HC\004B\016\005k\0229H!\037\003|\tu$q\021\005\t\003\007\021y\0071\001\003$!9\021\021\003B8\001\004i\004bBA\013\005_\002\r!\020\005\b\0033\021y\0071\001>\021!\021yHa\034A\002\t\005\025!B:uCJ$\bcA(\003\004&\031!Q\021)\003\tY+7m\r\005\t\005\023\023y\0071\001\003\002\006\031QM\0343\t\017\t5\005\001\"\025\003\020\006aBm\\*fi\ncwnY6C_VtGm\035\"bg\026$wJ\\*uCR,G#C\"\003\022\nM%Q\023BL\021!\t\031Aa#A\002\005\025\001bBA\t\005\027\003\r!\020\005\b\003+\021Y\t1\001>\021\035\tIBa#A\002uBqAa'\001\t\003\022i*A\016tKR\024En\\2l\005>,h\016Z:G_JLE/Z7SK:$WM\035\013\004\007\n}\005bBA8\0053\003\r!\020\005\b\005G\003A\021\tBS\003A\031\027M\\\"sK\006$XO]3Ta\006<h\016F\006b\005O\023\tLa-\0036\n]\006\002\003BU\005C\003\rAa+\002\021\r\024X-\031;ve\026\004BA!\033\003.&!!qVAF\005A)e.^7De\026\fG/\036:f)f\004X\r\003\005\002\004\t\005\006\031AA\003\021\035\t\tB!)A\002uBq!!\006\003\"\002\007Q\bC\004\002\032\t\005\006\031A\037\t\017\tm\006\001\"\021\003>\006AA/[2l%\006$X\rF\002>\005C\001\"a\001\003:\002\007!1\005\005\b\005\007\004A\021\tBc\003))\b\017Z1uKRK7m\033\013\f\007\n\035'\021\032Bf\005\033\024y\r\003\005\002\004\t\005\007\031\001B\022\021\035\t\tB!1A\002uBq!!\006\003B\002\007Q\bC\004\002\032\t\005\007\031A\037\t\021\tE'\021\031a\001\005'\f1A\0358h!\021\tIJ!6\n\t\t]\0271\024\002\007%\006tGm\\7\t\017\tm\007\001\"\021\003^\006a\021n\035\"fC\016|gNQ1tKRy\021Ma8\003b\n\r(Q\035Bt\005W\024y\017\003\005\002\004\te\007\031AA\003\021\035\t\tB!7A\002uBq!!\006\003Z\002\007Q\bC\004\002\032\te\007\031A\037\t\017\t%(\021\034a\001{\0059!-Z1d_:D\006b\002Bw\0053\004\r!P\001\bE\026\f7m\0348Z\021\035\021\tP!7A\002u\nqAY3bG>t'\fC\004\003v\002!\tEa>\002\033!\f7\017V5mK\026sG/\033;z)\r\t'\021 \005\b\003_\022\031\0201\001>\021\035\021i\020\001C!\005\f\001c\031:fCR,G+\0337f\013:$\030\016^=\025\013m\031\taa\001\t\021\005\r!1 a\001\005GAq!a\034\003|\002\007Q\bC\004\004\b\001!\te!\003\002!=t'\t\\8dW\006\033G/\033<bi\026$GcE1\004\f\r51qBB\t\007'\031)ba\006\004\"\r\025\002\002CA\002\007\013\001\rAa\t\t\017\005E1Q\001a\001{!9\021QCB\003\001\004i\004bBA\r\007\013\001\r!\020\005\t\003\007\033)\0011\001\002\006\"A\021q^B\003\001\004\ty\002\003\005\004\032\r\025\001\031AB\016\003\021A\027\016\036-\021\007\005\032i\"C\002\004 \t\022QA\0227pCRD\001ba\t\004\006\001\00711D\001\005Q&$\030\f\003\005\004(\r\025\001\031AB\016\003\021A\027\016\036.\t\017\r-\002\001\"\025\004.\005aAm\\\"vgR|W.\0238jiR91ia\f\0044\rm\002bBB\031\007S\001\raG\001\013i&dW-\0228uSRL\b\002CAB\007S\001\ra!\016\021\t\t%4qG\005\005\007s\tYI\001\tF]RLG/\037'jm&twMQ1tK\"A\0211OB\025\001\004\t)\bC\004\004@\001!\tf!\021\002\033\021|7)^:u_6$%o\0349t)\035\03151IB#\007\017Bqa!\r\004>\001\0071\004\003\005\002\004\016u\002\031AAC\021\035\031Ie!\020A\002\005\f1b^5mY\"\013'O^3ti\"91Q\n\001\005B\r=\023A\0032sK\006\\'\t\\8dWRi1i!\025\004T\rU3qKB-\007KB\001\"a\001\004L\001\007!1\005\005\b\003#\031Y\0051\001>\021\035\t)ba\023A\002uBq!!\007\004L\001\007Q\bC\004\004\007\027\002\raa\027\021\t\ru3\021M\007\003\007?R!a\001*\n\t\r\r4q\f\002\006\0052|7m\033\005\b\003_\032Y\0051\001>\0219\031I\007\001I\001\004\003\005I\021BB6\007s\nQb];qKJ$s-\032;JG>tG#\004(\004n\r=4\021OB:\007k\0329\b\003\005\002\004\r\035\004\031AA\003\021\035\t\tba\032A\002uBq!!\006\004h\001\007Q\bC\004\002\032\r\035\004\031A\037\t\021\005u1q\ra\001\003?A\001\"!\r\004h\001\007\021qD\005\004}\016m\024bAB?\005\tY1+[7qY\026\024En\\2l\0219\031\t\t\001I\001\004\003\005I\021BBB\007\033\013Qc];qKJ$3m\0347pe6+H\016^5qY&,'\017F\005>\007\013\0339i!#\004\f\"A\0211AB@\001\004\t)\001C\004\002\022\r}\004\031A\037\t\017\005U1q\020a\001{!9\021\021DB@\001\004i\024\002BA.\007w\002")
/*     */ public class Print extends RedstoneAware implements SpecialBlock, CustomDrops<Print>, Cloneable {
/*     */   private final ClassTag<Print> tileTag;
/*     */   private Option<Object> colorMultiplierOverride;
/*     */   private Option<IIcon> textureOverride;
/*     */   private boolean isSingleShape;
/*     */   private ThreadLocal<Print> printBlockThreadLocal;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  36 */   public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) { return CustomDrops.class.getDrops(this, world, x, y, z, metadata, fortune); } public void func_149725_f(World world, int x, int y, int z, int metadata) { CustomDrops.class.onBlockPreDestroy(this, world, x, y, z, metadata); } public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) { return CustomDrops.class.removedByPlayer(this, world, player, x, y, z, willHarvest); } public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) { CustomDrops.class.onBlockPlacedBy(this, world, x, y, z, player, stack); } public boolean func_149662_c() { return SpecialBlock.class.isOpaqueCube(this); } public boolean func_149686_d() { return SpecialBlock.class.renderAsNormalBlock(this); } public final boolean func_149747_d(IBlockAccess world, int x, int y, int z, int side) { return SpecialBlock.class.isBlockSolid(this, world, x, y, z, side); } public ClassTag<Print> tileTag() { return this.tileTag; } public Print(ClassTag<Print> tileTag) { SpecialBlock.class.$init$(this); CustomDrops.class.$init$(this);
/*  37 */     func_149713_g(0);
/*  38 */     func_149711_c(1.0F);
/*  39 */     func_149647_a(null);
/*  40 */     NEI$.MODULE$.hide(this);
/*  41 */     func_149658_d((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append("GenericTop").toString());
/*     */ 
/*     */     
/*  44 */     this.colorMultiplierOverride = (Option<Object>)None$.MODULE$;
/*     */     
/*  46 */     this.textureOverride = (Option<IIcon>)None$.MODULE$;
/*     */     
/*  48 */     this.isSingleShape = false; } public Option<Object> colorMultiplierOverride() { return this.colorMultiplierOverride; } public void colorMultiplierOverride_$eq(Option<Object> x$1) { this.colorMultiplierOverride = x$1; } public Option<IIcon> textureOverride() { return this.textureOverride; } public void textureOverride_$eq(Option<IIcon> x$1) { this.textureOverride = x$1; } public boolean isSingleShape() { return this.isSingleShape; } public void isSingleShape_$eq(boolean x$1) { this.isSingleShape = x$1; }
/*     */   
/*     */   public Print clone() {
/*  51 */     Print clone = (Print)super.clone();
/*  52 */     clone.colorMultiplierOverride_$eq(colorMultiplierOverride());
/*  53 */     clone.textureOverride_$eq(textureOverride());
/*  54 */     clone.isSingleShape_$eq(isSingleShape());
/*  55 */     return clone;
/*     */   }
/*     */   
/*  58 */   private ThreadLocal printBlockThreadLocal$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.printBlockThreadLocal = new Print$$anon$1(this); this.bitmap$0 = true; }  return this.printBlockThreadLocal; }  } public ThreadLocal<Print> printBlockThreadLocal() { return this.bitmap$0 ? this.printBlockThreadLocal : printBlockThreadLocal$lzycompute(); } public final class Print$$anon$1 extends ThreadLocal<Print> { public Print$$anon$1(Print $outer) {} public Print initialValue() {
/*  59 */       return ((Print)Items.get("print").block()).clone();
/*     */     } }
/*     */   public Print getPrintBlock() {
/*  62 */     return printBlockThreadLocal().get();
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(IBlockAccess world, int x, int y, int z, ForgeDirection globalSide, ForgeDirection localSide) {
/*  67 */     return (IIcon)textureOverride().getOrElse((Function0)new Print$$anonfun$getIcon$1(this, world, x, y, z, globalSide, localSide)); } public final class Print$$anonfun$getIcon$1 extends AbstractFunction0<IIcon> implements Serializable { public static final long serialVersionUID = 0L; private final IBlockAccess world$1; private final int x$1; private final int y$1; private final int z$1; private final ForgeDirection globalSide$1; private final ForgeDirection localSide$1; public final IIcon apply() { return this.$outer.li$cil$oc$common$block$Print$$super$getIcon(this.world$1, this.x$1, this.y$1, this.z$1, this.globalSide$1, this.localSide$1); }
/*     */     
/*     */     public Print$$anonfun$getIcon$1(Print $outer, IBlockAccess world$1, int x$1, int y$1, int z$1, ForgeDirection globalSide$1, ForgeDirection localSide$1) {} }
/*  70 */   public int func_149720_d(IBlockAccess world, int x, int y, int z) { return BoxesRunTime.unboxToInt(colorMultiplierOverride().getOrElse((Function0)new Print$$anonfun$colorMultiplier$1(this, world, x, y, z))); } public final class Print$$anonfun$colorMultiplier$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IBlockAccess world$2; private final int x$2; private final int y$2; private final int z$2; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return this.$outer.li$cil$oc$common$block$Print$$super$colorMultiplier(this.world$2, this.x$2, this.y$2, this.z$2); }
/*     */     
/*     */     public Print$$anonfun$colorMultiplier$1(Print $outer, IBlockAccess world$2, int x$2, int y$2, int z$2) {} }
/*  73 */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) { super.tooltipBody(metadata, stack, player, tooltip, advanced);
/*  74 */     PrintData data = new PrintData(stack);
/*  75 */     data.tooltip().foreach((Function1)new Print$$anonfun$tooltipBody$1(this, tooltip)); } public final class Print$$anonfun$tooltipBody$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final boolean apply(String s) { return this.tooltip$1.addAll(WrapAsJava$.MODULE$.asJavaCollection((new StringOps(Predef$.MODULE$.augmentString(s))).lines().toIterable())); }
/*     */     
/*     */     public Print$$anonfun$tooltipBody$1(Print $outer, List tooltip$1) {} }
/*     */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/*  79 */     super.tooltipTail(metadata, stack, player, tooltip, advanced);
/*  80 */     PrintData data = new PrintData(stack);
/*  81 */     data.isBeaconBase() ? 
/*  82 */       BoxesRunTime.boxToBoolean(tooltip.add(Localization$Tooltip$.MODULE$.PrintBeaconBase())) : BoxedUnit.UNIT;
/*     */     
/*  84 */     data.emitRedstone() ? 
/*  85 */       BoxesRunTime.boxToBoolean(tooltip.add(Localization$Tooltip$.MODULE$.PrintRedstoneLevel(data.redstoneLevel()))) : BoxedUnit.UNIT;
/*     */     
/*  87 */     if (data.emitLight())
/*  88 */       tooltip.add(Localization$Tooltip$.MODULE$.PrintLightValue(data.lightLevel())); 
/*     */   }
/*     */   
/*     */   public int getLightValue(IBlockAccess world, int x, int y, int z) {
/*     */     int i;
/*  93 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  94 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; i = print.data().lightLevel(); }
/*  95 */     else { i = super.getLightValue(world, x, y, z); }
/*     */     
/*     */     return i;
/*     */   } public int getLightOpacity(IBlockAccess world, int x, int y, int z) {
/*  99 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 100 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; if (Settings$.MODULE$.get().printsHaveOpacity()) return (int)(print.data().opacity() * 4);  }
/* 101 */      return super.getLightOpacity(world, x, y, z);
/*     */   }
/*     */   
/* 104 */   public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) { if (isSingleShape()) { boolean bool; TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 105 */       if (tileEntity instanceof Print && isSideSolid(world, x, y, z, side.getOpposite()))
/* 106 */       { boolean bool1; ForgeDirection forgeDirection = side;
/* 107 */         if (ForgeDirection.DOWN.equals(forgeDirection)) { bool1 = (this.field_149760_C > false) ? true : false; }
/* 108 */         else if (ForgeDirection.UP.equals(forgeDirection)) { bool1 = (this.field_149756_F < true) ? true : false; }
/* 109 */         else if (ForgeDirection.NORTH.equals(forgeDirection)) { bool1 = (this.field_149754_D > false) ? true : false; }
/* 110 */         else if (ForgeDirection.SOUTH.equals(forgeDirection)) { bool1 = (this.field_149757_G < true) ? true : false; }
/* 111 */         else if (ForgeDirection.WEST.equals(forgeDirection)) { bool1 = (this.field_149759_B > false) ? true : false; }
/* 112 */         else if (ForgeDirection.EAST.equals(forgeDirection)) { bool1 = (this.field_149755_E < true) ? true : false; }
/* 113 */         else { bool1 = true; }
/*     */          bool = bool1; }
/* 115 */       else { bool = super.shouldSideBeRendered(world, x, y, z, side); }
/*     */        if (!bool); }
/*     */     
/* 118 */     return true; } public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { return isSideSolid(world, x, y, z, side); }
/*     */   
/* 120 */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { Object object = new Object(); 
/* 121 */     try { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 122 */       if (tileEntity instanceof Print) { Print print = (Print)tileEntity;
/* 123 */         Set shapes = print.state() ? print.data().stateOn() : print.data().stateOff();
/* 124 */         shapes.withFilter((Function1)new Print$$anonfun$isSideSolid$1(this)).foreach((Function1)new Print$$anonfun$isSideSolid$2(this, side, print, object)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       else
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 139 */         BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */     catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object)
/*     */         return nonLocalReturnControl.value$mcZ$sp();  }
/*     */      return false; }
/*     */   public final class Print$$anonfun$isSideSolid$1 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable {
/* 145 */     public static final long serialVersionUID = 0L; public final boolean apply(PrintData.Shape shape) { return !Strings.isNullOrEmpty(shape.texture()); } public Print$$anonfun$isSideSolid$1(Print $outer) {} } public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) { ItemStack itemStack; TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 146 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; itemStack = print.data().createItemStack(); }
/* 147 */     else { itemStack = null; }  return itemStack; }
/*     */   public final class Print$$anonfun$isSideSolid$2 extends AbstractFunction1<PrintData.Shape, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection side$1; private final Print x2$1; private final Object nonLocalReturnKey1$1; public Print$$anonfun$isSideSolid$2(Print $outer, ForgeDirection side$1, Print x2$1, Object nonLocalReturnKey1$1) {} public final void apply(PrintData.Shape shape) { boolean bool; AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.x2$1.facing()); boolean fullX = (bounds.field_72340_a == false && bounds.field_72336_d == true); boolean fullY = (bounds.field_72338_b == false && bounds.field_72337_e == true); boolean fullZ = (bounds.field_72339_c == false && bounds.field_72334_f == true); ForgeDirection forgeDirection = this.side$1; if (ForgeDirection.DOWN.equals(forgeDirection)) { bool = (bounds.field_72338_b == false && fullX && fullZ) ? true : false; } else if (ForgeDirection.UP.equals(forgeDirection)) { bool = (bounds.field_72337_e == true && fullX && fullZ) ? true : false; } else if (ForgeDirection.NORTH.equals(forgeDirection)) { bool = (bounds.field_72339_c == false && fullX && fullY) ? true : false; } else if (ForgeDirection.SOUTH.equals(forgeDirection)) { bool = (bounds.field_72334_f == true && fullX && fullY) ? true : false; } else if (ForgeDirection.WEST.equals(forgeDirection)) { bool = (bounds.field_72340_a == false && fullY && fullZ) ? true : false; } else if (ForgeDirection.EAST.equals(forgeDirection)) { bool = (bounds.field_72336_d == true && fullY && fullZ) ? true : false; }
/*     */       else { bool = false; }
/*     */        if (bool)
/* 152 */         throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey1$1, true);  } } public void func_149743_a(World world, int x, int y, int z, AxisAlignedBB mask, List list, Entity entity) { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 153 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity;
/* 154 */       if (print.state() ? print.data().noclipOn() : print.data().noclipOff()) {
/*     */         return;
/*     */       }
/* 157 */       Set shapes = print.state() ? print.data().stateOn() : print.data().stateOff();
/* 158 */       shapes.foreach((Function1)new Print$$anonfun$addCollisionBoxesToList$1(this, x, y, z, mask, list, print)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/* 164 */       super.func_149743_a(world, x, y, z, mask, list, entity); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final boolean li$cil$oc$common$block$Print$$add$1(List<Object> list, Object value) { return list.add(value); } public final class Print$$anonfun$addCollisionBoxesToList$1 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int x$3; private final int y$3; private final int z$3; private final AxisAlignedBB mask$1; private final List list$1; private final Print x2$2; public Print$$anonfun$addCollisionBoxesToList$1(Print $outer, int x$3, int y$3, int z$3, AxisAlignedBB mask$1, List list$1, Print x2$2) {}
/*     */     public final Object apply(PrintData.Shape shape) { AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.x2$2.facing()).func_72317_d(this.x$3, this.y$3, this.z$3); return bounds.func_72326_a(this.mask$1) ? BoxesRunTime.boxToBoolean(this.$outer.li$cil$oc$common$block$Print$$add$1(this.list$1, bounds)) : BoxedUnit.UNIT; } }
/*     */   public MovingObjectPosition intersect(World world, int x, int y, int z, Vec3 start, Vec3 end) { MovingObjectPosition movingObjectPosition;
/* 169 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 170 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity;
/* 171 */       DoubleRef closestDistance = DoubleRef.create(Double.POSITIVE_INFINITY);
/* 172 */       ObjectRef closest = ObjectRef.create(None$.MODULE$);
/* 173 */       (print.state() ? print.data().stateOn() : print.data().stateOff()).foreach((Function1)new Print$$anonfun$intersect$1(this, x, y, z, start, end, closestDistance, closest, print));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 184 */       movingObjectPosition = (MovingObjectPosition)((Option)closest.elem).map((Function1)new Print$$anonfun$intersect$2(this, x, y, z)).orNull(Predef$.MODULE$.$conforms()); }
/* 185 */     else { movingObjectPosition = super.intersect(world, x, y, z, start, end); }  return movingObjectPosition; } public final class Print$$anonfun$intersect$1 extends AbstractFunction1<PrintData.Shape, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int x$4; private final int y$4; private final int z$4; private final Vec3 start$1; private final Vec3 end$1; private final DoubleRef closestDistance$1; private final ObjectRef closest$1; private final Print x2$3; public Print$$anonfun$intersect$1(Print $outer, int x$4, int y$4, int z$4, Vec3 start$1, Vec3 end$1, DoubleRef closestDistance$1, ObjectRef closest$1, Print x2$3) {} public final void apply(PrintData.Shape shape) { AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.x2$3.facing()).func_72317_d(this.x$4, this.y$4, this.z$4); MovingObjectPosition hit = bounds.func_72327_a(this.start$1, this.end$1); if (hit != null) { double distance = hit.field_72307_f.func_72438_d(this.start$1); if (distance < this.closestDistance$1.elem) { this.closestDistance$1.elem = distance; this.closest$1.elem = Option$.MODULE$.apply(hit); }  }
/*     */        } } public final class Print$$anonfun$intersect$2 extends AbstractFunction1<MovingObjectPosition, MovingObjectPosition> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int x$4; private final int y$4; private final int z$4; public final MovingObjectPosition apply(MovingObjectPosition hit) { return new MovingObjectPosition(this.x$4, this.y$4, this.z$4, hit.field_72310_e, hit.field_72307_f); }
/*     */     public Print$$anonfun$intersect$2(Print $outer, int x$4, int y$4, int z$4) {} }
/* 190 */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 191 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; setBlockBounds(print.state() ? print.boundsOn() : print.boundsOff()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 192 */     else { super.doSetBlockBoundsBasedOnState(world, x, y, z); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */ 
/*     */   
/*     */   public void setBlockBoundsForItemRender(int metadata) {
/* 197 */     setBlockBounds(ExtendedAABB$.MODULE$.unitBounds());
/*     */   }
/*     */   public boolean canCreatureSpawn(EnumCreatureType creature, IBlockAccess world, int x, int y, int z) {
/* 200 */     return true;
/*     */   } public int func_149738_a(World world) {
/* 202 */     return 20;
/*     */   }
/*     */   public void func_149674_a(World world, int x, int y, int z, Random rng) {
/* 205 */     if (!world.field_72995_K) { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 206 */       if (tileEntity instanceof Print) { Print print = (Print)tileEntity; print.toggleState(); BoxedUnit boxedUnit = print.state() ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 207 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */   
/*     */   } public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
/*     */     boolean bool;
/* 212 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 213 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; bool = print.data().isBeaconBase(); }
/* 214 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*     */   
/*     */   public boolean hasTileEntity(int metadata) {
/* 220 */     return true;
/*     */   } public Print createTileEntity(World world, int metadata) {
/* 222 */     return new Print();
/*     */   }
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*     */     boolean bool;
/* 227 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 228 */     if (tileEntity instanceof Print) { Print print = (Print)tileEntity; bool = print.activate(); }
/* 229 */     else { bool = super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ); }
/*     */     
/*     */     return bool;
/*     */   }
/*     */   public void doCustomInit(Print tileEntity, EntityLivingBase player, ItemStack stack) {
/* 234 */     CustomDrops.class.doCustomInit(this, (TileEntity)tileEntity, player, stack);
/* 235 */     tileEntity.data().load(stack);
/* 236 */     tileEntity.updateBounds();
/* 237 */     tileEntity.world().func_147451_t(tileEntity.x(), tileEntity.y(), tileEntity.z());
/*     */   }
/*     */   
/*     */   public void doCustomDrops(Print tileEntity, EntityPlayer player, boolean willHarvest) {
/* 241 */     CustomDrops.class.doCustomDrops(this, (TileEntity)tileEntity, player, willHarvest);
/* 242 */     if (!player.field_71075_bZ.field_75098_d)
/* 243 */       func_149642_a(tileEntity.world(), tileEntity.x(), tileEntity.y(), tileEntity.z(), tileEntity.data().createItemStack()); 
/*     */   }
/*     */   public void func_149749_a(World world, int x, int y, int z, Block block, int metadata) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_2
/*     */     //   2: iload_3
/*     */     //   3: iload #4
/*     */     //   5: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   8: astore #7
/*     */     //   10: aload #7
/*     */     //   12: instanceof li/cil/oc/common/tileentity/Print
/*     */     //   15: ifeq -> 88
/*     */     //   18: aload #7
/*     */     //   20: checkcast li/cil/oc/common/tileentity/Print
/*     */     //   23: astore #8
/*     */     //   25: aload #8
/*     */     //   27: invokevirtual data : ()Lli/cil/oc/common/item/data/PrintData;
/*     */     //   30: aload #8
/*     */     //   32: invokevirtual state : ()Z
/*     */     //   35: invokevirtual emitRedstone : (Z)Z
/*     */     //   38: ifeq -> 88
/*     */     //   41: aload_1
/*     */     //   42: iload_2
/*     */     //   43: iload_3
/*     */     //   44: iload #4
/*     */     //   46: aload_0
/*     */     //   47: invokevirtual func_147459_d : (IIILnet/minecraft/block/Block;)V
/*     */     //   50: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   53: getstatic net/minecraftforge/common/util/ForgeDirection.VALID_DIRECTIONS : [Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   56: checkcast [Ljava/lang/Object;
/*     */     //   59: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   62: new li/cil/oc/common/block/Print$$anonfun$breakBlock$1
/*     */     //   65: dup
/*     */     //   66: aload_0
/*     */     //   67: aload_1
/*     */     //   68: iload_2
/*     */     //   69: iload_3
/*     */     //   70: iload #4
/*     */     //   72: invokespecial <init> : (Lli/cil/oc/common/block/Print;Lnet/minecraft/world/World;III)V
/*     */     //   75: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   80: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   83: astore #9
/*     */     //   85: goto -> 93
/*     */     //   88: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   91: astore #9
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: iload_2
/*     */     //   96: iload_3
/*     */     //   97: iload #4
/*     */     //   99: aload #5
/*     */     //   101: iload #6
/*     */     //   103: invokespecial func_149749_a : (Lnet/minecraft/world/World;IIILnet/minecraft/block/Block;I)V
/*     */     //   106: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #248	-> 0
/*     */     //   #249	-> 10
/*     */     //   #250	-> 41
/*     */     //   #251	-> 50
/*     */     //   #249	-> 83
/*     */     //   #254	-> 88
/*     */     //   #256	-> 93
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	107	0	this	Lli/cil/oc/common/block/Print;
/*     */     //   0	107	1	world	Lnet/minecraft/world/World;
/*     */     //   0	107	2	x	I
/*     */     //   0	107	3	y	I
/*     */     //   0	107	4	z	I
/*     */     //   0	107	5	block	Lnet/minecraft/block/Block;
/*     */     //   0	107	6	metadata	I
/*     */   }
/*     */   public final class Print$$anonfun$breakBlock$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final World world$3; private final int x$5; private final int y$5; private final int z$5;
/*     */     public Print$$anonfun$breakBlock$1(Print $outer, World world$3, int x$5, int y$5, int z$5) {}
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/* 252 */       this.world$3.func_147459_d(this.x$5 + side.offsetX, this.y$5 + side.offsetY, this.z$5 + side.offsetZ, this.$outer);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Print.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */