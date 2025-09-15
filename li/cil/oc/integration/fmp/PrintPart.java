/*     */ package li.cil.oc.integration.fmp;
/*     */ 
/*     */ import codechicken.lib.data.MCDataInput;
/*     */ import codechicken.lib.data.MCDataOutput;
/*     */ import codechicken.lib.raytracer.ExtendedMOP;
/*     */ import codechicken.lib.raytracer.IndexedCuboid6;
/*     */ import codechicken.lib.vec.Cuboid6;
/*     */ import codechicken.lib.vec.Vector3;
/*     */ import codechicken.multipart.IRedstonePart;
/*     */ import codechicken.multipart.PartMap;
/*     */ import codechicken.multipart.TCuboidPart;
/*     */ import codechicken.multipart.TEdgePart;
/*     */ import codechicken.multipart.TFacePart;
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import codechicken.multipart.TNormalOcclusion;
/*     */ import codechicken.multipart.TileMultipart;
/*     */ import codechicken.multipart.scalatraits.TSlottedTile;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.common.block.Print;
/*     */ import li.cil.oc.common.block.SimpleBlock;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import li.cil.oc.common.tileentity.Print;
/*     */ import li.cil.oc.integration.util.BundledRedstone$;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import li.cil.oc.util.ExtendedAABB$;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.OpenGlHelper;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraft.client.renderer.RenderGlobal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Function2;
/*     */ import scala.MatchError;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.collection.mutable.Set$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.Ordering;
/*     */ import scala.math.Ordering$Int$;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.DoubleRef;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r5r!B\001\003\021\003i\021!\003)sS:$\b+\031:u\025\t\031A!A\002g[BT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\003)sS:$\b+\031:u'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035Aq\001H\bC\002\023%Q$\001\002raU\ta\004\005\002\024?%\021\001\005\006\002\006\r2|\027\r\036\005\007E=\001\013\021\002\020\002\007E\004\004\005C\004%\037\t\007I\021B\017\002\005E\f\004B\002\024\020A\003%a$A\002rc\001Bq\001K\bC\002\023%Q$\001\002re!1!f\004Q\001\ny\t1!\035\032!\021\035asB1A\005\nu\t!!]\032\t\r9z\001\025!\003\037\003\r\t8\007\t\005\ba=\021\r\021\"\0012\003)\031Hn\034;C_VtGm]\013\002eA\0311cM\033\n\005Q\"\"!B!se\006L\bC\001\034>\033\0059$B\001\035:\003\r1Xm\031\006\003um\n1\001\\5c\025\005a\024aC2pI\026\034\007.[2lK:L!AP\034\003\017\r+(m\\5em!1\001i\004Q\001\nI\n1b\0357pi\n{WO\0343tA!9!iDI\001\n\003\031\025a\007\023mKN\034\030N\\5uI\035\024X-\031;fe\022\"WMZ1vYR$\023'F\001EU\t)\005\013E\002\024\r\"K!a\022\013\003\r=\003H/[8o!\tIe*D\001K\025\tYE*\001\006uS2,WM\034;jifT!!\024\004\002\r\r|W.\\8o\023\ty%JA\003Qe&tGoK\001R!\t\021v+D\001T\025\t!V+A\005v]\016DWmY6fI*\021a\013F\001\013C:tw\016^1uS>t\027B\001-T\005E)hn\0315fG.,GMV1sS\006t7-\032\004\005!\t\001!l\005\005Z7z#wM[7q!\tqA,\003\002^\005\ty1+[7qY\026\024En\\2l!\006\024H\017\005\002`E6\t\001M\003\002bw\005IQ.\0367uSB\f'\017^\005\003G\002\0241\002V\"vE>LG\rU1siB\021q,Z\005\003M\002\024\001\003\026(pe6\fGnT2dYV\034\030n\0348\021\005}C\027BA5a\0055I%+\0323ti>tW\rU1siB\021ql[\005\003Y\002\024A\002V*m_R$X\r\032)beR\004\"a\0308\n\005=\004'!\003+FI\036,\007+\031:u!\ty\026/\003\002sA\nIAKR1dKB\013'\017\036\005\tif\023)\031!C\001k\006AqN]5hS:\fG.F\001F\021!9\030L!A!\002\023)\025!C8sS\036Lg.\0317!\021\025I\022\f\"\001z)\tQ8\020\005\002\0173\"9A\017\037I\001\002\004)\005bB?Z\001\004%\tA`\001\007M\006\034\027N\\4\026\003}\004B!!\001\002\0225\021\0211\001\006\005\003\013\t9!\001\003vi&d'bA'\002\n)!\0211BA\007\0039i\027N\\3de\0064GOZ8sO\026T!!a\004\002\0079,G/\003\003\002\024\005\r!A\004$pe\036,G)\033:fGRLwN\034\005\n\003/I\006\031!C\001\0033\t!BZ1dS:<w\fJ3r)\021\tY\"!\t\021\007M\ti\"C\002\002 Q\021A!\0268ji\"I\0211EA\013\003\003\005\ra`\001\004q\022\n\004bBA\0243\002\006Ka`\001\bM\006\034\027N\\4!\021%\tY#\027a\001\n\003\ti#\001\003eCR\fWCAA\030!\021\t\t$!\017\016\005\005M\"\002BA\026\003kQ1!a\016M\003\021IG/Z7\n\t\005m\0221\007\002\n!JLg\016\036#bi\006D\021\"a\020Z\001\004%\t!!\021\002\021\021\fG/Y0%KF$B!a\007\002D!Q\0211EA\037\003\003\005\r!a\f\t\021\005\035\023\f)Q\005\003_\tQ\001Z1uC\002B\021\"a\023Z\001\004%\t!!\024\002\023\t|WO\0343t\037\0324WCAA(!\021\t\t&!\027\016\005\005M#\002BA\003\003+RA!a\026\002\016\005IQ.\0338fGJ\fg\r^\005\005\0037\n\031FA\007Bq&\034\030\t\\5h]\026$'I\021\005\n\003?J\006\031!C\001\003C\nQBY8v]\022\034xJ\0324`I\025\fH\003BA\016\003GB!\"a\t\002^\005\005\t\031AA(\021!\t9'\027Q!\n\005=\023A\0032pk:$7o\0244gA!I\0211N-A\002\023\005\021QJ\001\tE>,h\016Z:P]\"I\021qN-A\002\023\005\021\021O\001\rE>,h\016Z:P]~#S-\035\013\005\0037\t\031\b\003\006\002$\0055\024\021!a\001\003\037B\001\"a\036ZA\003&\021qJ\001\nE>,h\016Z:P]\002B\021\"a\037Z\001\004%\t!! \002\013M$\030\r^3\026\005\005}\004cA\n\002\002&\031\0211\021\013\003\017\t{w\016\\3b]\"I\021qQ-A\002\023\005\021\021R\001\ngR\fG/Z0%KF$B!a\007\002\f\"Q\0211EAC\003\003\005\r!a \t\021\005=\025\f)Q\005\003\naa\035;bi\026\004\003\"CAJ3\002\007I\021AA?\003!!xnZ4mS:<\007\"CAL3\002\007I\021AAM\0031!xnZ4mS:<w\fJ3r)\021\tY\"a'\t\025\005\r\022QSA\001\002\004\ty\b\003\005\002 f\003\013\025BA@\003%!xnZ4mS:<\007\005C\004\002$f#\t%!*\002\027MLW\016\0357f\0052|7m[\013\003\003O\003B!!+\00206\021\0211\026\006\004\003[c\025!\0022m_\016\\\027bA(\002,\"9\0211W-\005\002\005U\026aB4fiRK\b/Z\013\003\003o\003B!!/\002D6\021\0211\030\006\005\003{\013y,\001\003mC:<'BAAa\003\021Q\027M^1\n\t\005\025\0271\030\002\007'R\024\030N\\4\t\017\005%\027\f\"\021\002~\005AAm\\3t)&\0347\016C\004\002Nf#\t%a4\002\033\035,G\017T5hQR4\026\r\\;f+\t\t\t\016E\002\024\003'L1!!6\025\005\rIe\016\036\005\b\0033LF\021IAn\003%9W\r\036\"pk:$7/F\0016\021\035\ty.\027C!\003C\f\021cZ3u\037\016\034G.^:j_:\024u\016_3t+\t\t\031\017E\003\002:\006\025X'\003\003\002h\006m&\001C%uKJ\f'\r\\3\t\017\005-\030\f\"\021\002b\006\tr-\032;D_2d\027n]5p]\n{\0070Z:\t\017\005=\030\f\"\021\002\\\006yq-\032;SK:$WM\035\"pk:$7\017C\004\002tf#\t%a4\002\027\035,Go\0257pi6\0137o\033\005\b\003oLF\021IA?\003A\031wN\0343vGR\034(+\0323ti>tW\rC\004\002|f#\t%a4\002+I,Gm\035;p]\026\034uN\0343vGRLwN\\'ba\"9\021q`-\005B\t\005\021AE2b]\016{gN\\3diJ+Gm\035;p]\026$B!a \003\004!A!QAA\001\004\t\t.\001\003tS\022,\007b\002B\0053\022\005#1B\001\021gR\024xN\\4Q_^,'\017T3wK2$B!!5\003\016!A!Q\001B\004\001\004\t\t\016C\004\003\022e#\tEa\005\002\035],\027m\033)po\026\024H*\032<fYR!\021\021\033B\013\021!\021)Aa\004A\002\005E\007b\002B\r3\022\005#1D\001\tC\016$\030N^1uKRA\021q\020B\017\005_\021I\004\003\005\003 \t]\001\031\001B\021\003\031\001H.Y=feB!!1\005B\026\033\t\021)C\003\003\003 \t\035\"\002\002B\025\003+\na!\0328uSRL\030\002\002B\027\005K\021A\"\0228uSRL\b\013\\1zKJD\001B!\r\003\030\001\007!1G\001\004Q&$\b\003BA)\005kIAAa\016\002T\t!Rj\034<j]\036|%M[3diB{7/\033;j_:D\001\"a\016\003\030\001\007!1\b\t\005\005{\021\t%\004\002\003@)!\021qGA+\023\021\021\031Ea\020\003\023%#X-\\*uC\016\\\007b\002B$3\022\005!\021J\001\fi><w\r\\3Ti\006$X\r\006\002\002\034!9!QJ-\005\002\005u\024!C2b]R{wm\0327f\021\035\021\t&\027C!\005\023\nQb]2iK\022,H.\0323US\016\\\007b\002B+3\022\005#qK\001\ta&\0347.\023;f[R!!1\bB-\021!\021\tDa\025A\002\tM\002b\002B/3\022\005#qL\001\tO\026$HI]8qgV\021!\021\r\t\007\003s\013)Oa\017\t\017\t\025\024\f\"\021\003h\005\t2m\0347mSNLwN\034*bsR\023\030mY3\025\r\t%$Q\017B@!\021\021YG!\035\016\005\t5$b\001B8s\005I!/Y=ue\006\034WM]\005\005\005g\022iGA\006FqR,g\016Z3e\033>\003\006\002\003B<\005G\002\rA!\037\002\013M$\030M\035;\021\t\005E#1P\005\005\005{\n\031F\001\003WK\016\034\004\002\003BA\005G\002\rA!\037\002\007\025tG\rC\004\003\006f#\tEa\"\002\033\021\024\030m\036%jO\"d\027n\0325u)!\tyH!#\003\f\n5\005\002\003B\031\005\007\003\rAa\r\t\021\t}!1\021a\001\005CAqAa$\003\004\002\007a$A\003ge\006lW\r\013\005\003\004\nM%1\026BW!\021\021)Ja*\016\005\t]%\002\002BM\0057\013!B]3mCVt7\r[3s\025\021\021iJa(\002\007\031lGN\003\003\003\"\n\r\026\001B7pINT!A!*\002\007\r\004x/\003\003\003*\n]%\001C*jI\026|e\016\\=\002\013Y\fG.^3%\005\t=\026\002\002BY\005g\013aa\021'J\013:#&\002\002B[\005/\013AaU5eK\"9!\021X-\005B\tm\026!D8o!\006\024Ho\0215b]\036,G\r\006\003\002\034\tu\006\002\003B`\005o\003\rA!1\002\tA\f'\017\036\t\004?\n\r\027b\001BcA\nQA+T;mi&\004\026M\035;\t\017\t%\027\f\"\021\003J\005\trN\034(fS\036D'm\034:DQ\006tw-\0323\t\017\t5\027\f\"\005\003J\005i1\r[3dWJ+Gm\035;p]\026DqA!5Z\t#\021\031.\001\007d_6\004X\017^3J]B,H\017\006\002\002R\"9!q[-\005B\te\027\001\0027pC\022$B!a\007\003\\\"A!Q\034Bk\001\004\021y.A\002oER\004BA!9\003f6\021!1\035\006\005\005;\f)&\003\003\003h\n\r(A\004(C)R\013wmQ8na>,h\016\032\005\b\005WLF\021\tBw\003\021\031\030M^3\025\t\005m!q\036\005\t\005;\024I\0171\001\003`\"9!1_-\005B\tU\030\001\003:fC\022$Um]2\025\t\005m!q\037\005\t\005s\024\t\0201\001\003|\0061\001/Y2lKR\004BA!@\004\0025\021!q \006\004\003WI\024\002BB\002\005\0241\"T\"ECR\f\027J\0349vi\"91qA-\005B\r%\021!C<sSR,G)Z:d)\021\tYba\003\t\021\te8Q\001a\001\007\033\001BA!@\004\020%!1\021\003B\000\0051i5\tR1uC>+H\017];u\021\035\031)\"\027C\001\005\023\nA\"\0369eCR,'i\\;oINDqa!\007Z\t\003\032Y\"\001\007sK:$WM]*uCRL7\r\006\004\002\000\ru1q\005\005\t\007?\0319\0021\001\004\"\005\031\001o\\:\021\007Y\032\031#C\002\004&]\022qAV3di>\0248\007\003\005\004*\r]\001\031AAi\003\021\001\030m]:)\021\r]!1\023BV\005[\003")
/*     */ public class PrintPart extends SimpleBlockPart implements TCuboidPart, TNormalOcclusion, IRedstonePart, TEdgePart, TFacePart {
/*     */   private final Option<Print> original;
/*     */   private ForgeDirection facing;
/*     */   private PrintData data;
/*     */   private AxisAlignedBB boundsOff;
/*     */   private AxisAlignedBB boundsOn;
/*     */   private boolean state;
/*     */   private boolean toggling;
/*     */   
/*  86 */   public boolean solid(int side) { return TFacePart.class.solid(this, side); } public boolean occlusionTest(TMultiPart npart) { return TNormalOcclusion.class.occlusionTest(this, npart); } public Iterable<IndexedCuboid6> getSubParts() { return TCuboidPart.class.getSubParts(this); } @SideOnly(Side.CLIENT) public void drawBreaking(RenderBlocks renderBlocks) { TCuboidPart.class.drawBreaking(this, renderBlocks); } public Option<Print> original() { return this.original; } public PrintPart(Option<Print> original) { TCuboidPart.class.$init$(this); TNormalOcclusion.class.$init$(this); TEdgePart.class.$init$(this); TFacePart.class.$init$(this);
/*  87 */     this.facing = ForgeDirection.SOUTH;
/*  88 */     this.data = new PrintData();
/*     */     
/*  90 */     this.boundsOff = ExtendedAABB$.MODULE$.unitBounds();
/*  91 */     this.boundsOn = ExtendedAABB$.MODULE$.unitBounds();
/*  92 */     this.state = false;
/*  93 */     this.toggling = false;
/*     */     
/*  95 */     original.foreach((Function1)new PrintPart$$anonfun$1(this)); } public ForgeDirection facing() { return this.facing; } public void facing_$eq(ForgeDirection x$1) { this.facing = x$1; } public PrintData data() { return this.data; } public void data_$eq(PrintData x$1) { this.data = x$1; } public AxisAlignedBB boundsOff() { return this.boundsOff; } public void boundsOff_$eq(AxisAlignedBB x$1) { this.boundsOff = x$1; } public AxisAlignedBB boundsOn() { return this.boundsOn; } public void boundsOn_$eq(AxisAlignedBB x$1) { this.boundsOn = x$1; } public boolean state() { return this.state; } public void state_$eq(boolean x$1) { this.state = x$1; } public boolean toggling() { return this.toggling; } public void toggling_$eq(boolean x$1) { this.toggling = x$1; } public final class PrintPart$$anonfun$1 extends AbstractFunction1<Print, BoxedUnit> implements Serializable {
/*  96 */     public static final long serialVersionUID = 0L; public final void apply(Print print) { this.$outer.facing_$eq(print.facing());
/*  97 */       this.$outer.data_$eq(print.data());
/*  98 */       this.$outer.boundsOff_$eq(print.boundsOff());
/*  99 */       this.$outer.boundsOn_$eq(print.boundsOn());
/* 100 */       this.$outer.state_$eq(print.state()); }
/*     */     
/*     */     public PrintPart$$anonfun$1(PrintPart $outer) {} }
/*     */   
/*     */   public Print simpleBlock() {
/* 105 */     return ((Print)Items.get("print").block()).getPrintBlock();
/*     */   } public String getType() {
/* 107 */     return (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("print").toString();
/*     */   } public boolean doesTick() {
/* 109 */     return false;
/*     */   } public int getLightValue() {
/* 111 */     return data().lightLevel();
/*     */   } public Cuboid6 getBounds() {
/* 113 */     return new Cuboid6(state() ? boundsOn() : boundsOff());
/*     */   }
/*     */   
/* 116 */   public Iterable<Cuboid6> getOcclusionBoxes() { Set shapes = state() ? data().stateOn() : data().stateOff();
/* 117 */     return WrapAsJava$.MODULE$.asJavaIterable((Iterable)shapes.map((Function1)new PrintPart$$anonfun$getOcclusionBoxes$1(this), Set$.MODULE$.canBuildFrom())); } public final class PrintPart$$anonfun$getOcclusionBoxes$1 extends AbstractFunction1<PrintData.Shape, Cuboid6> implements Serializable { public static final long serialVersionUID = 0L; public final Cuboid6 apply(PrintData.Shape shape) { return new Cuboid6(ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.$outer.facing())); }
/*     */      public PrintPart$$anonfun$getOcclusionBoxes$1(PrintPart $outer) {} }
/*     */   public Iterable<Cuboid6> getCollisionBoxes() {
/* 120 */     return getOcclusionBoxes();
/*     */   } public Cuboid6 getRenderBounds() {
/* 122 */     return getBounds();
/*     */   }
/*     */   
/* 125 */   public int getSlotMask() { IntRef mask = IntRef.create(0);
/* 126 */     Iterable<Cuboid6> boxes = getOcclusionBoxes();
/* 127 */     Predef$.MODULE$.refArrayOps((Object[])PartMap.values()).foreach((Function1)new PrintPart$$anonfun$getSlotMask$1(this, mask, boxes));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     return mask.elem; } public final class PrintPart$$anonfun$getSlotMask$1 extends AbstractFunction1<PartMap, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IntRef mask$1; private final Iterable boxes$1; public PrintPart$$anonfun$getSlotMask$1(PrintPart $outer, IntRef mask$1, Iterable boxes$1) {} public final void apply(PartMap slot) { Cuboid6 bounds = PrintPart$.MODULE$.slotBounds()[slot.i]; if (WrapAsScala$.MODULE$.iterableAsScalaIterable(this.boxes$1).exists((Function1)new PrintPart$$anonfun$getSlotMask$1$$anonfun$apply$1(this, bounds)))
/*     */         this.mask$1.elem |= slot.mask;  } public final class PrintPart$$anonfun$getSlotMask$1$$anonfun$apply$1 extends AbstractFunction1<Cuboid6, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Cuboid6 bounds$1; public final boolean apply(Cuboid6 x$1) { return x$1.intersects(this.bounds$1); }
/*     */       public PrintPart$$anonfun$getSlotMask$1$$anonfun$apply$1(PrintPart$$anonfun$getSlotMask$1 $outer, Cuboid6 bounds$1) {} } }
/* 138 */   public boolean conductsRedstone() { return state() ? data().emitRedstoneWhenOn() : data().emitRedstoneWhenOff(); }
/*     */    public int redstoneConductionMap() {
/* 140 */     return conductsRedstone() ? 255 : 0;
/*     */   } public boolean canConnectRedstone(int side) {
/* 142 */     return true;
/*     */   } public int strongPowerLevel(int side) {
/* 144 */     return weakPowerLevel(side);
/*     */   } public int weakPowerLevel(int side) {
/* 146 */     return data().emitRedstone(state()) ? data().redstoneLevel() : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean activate(EntityPlayer player, MovingObjectPosition hit, ItemStack item) {
/* 151 */     if (data().hasActiveState() && (
/* 152 */       !state() || !data().isButtonMode())) {
/* 153 */       toggleState();
/* 154 */       return true;
/*     */     } 
/*     */     
/* 157 */     return false;
/*     */   }
/*     */   
/*     */   public void toggleState() {
/* 161 */     if (canToggle())
/* 162 */     { toggling_$eq(true);
/* 163 */       state_$eq(!state());
/*     */       
/* 165 */       TileMultipart tileMultipart = tile();
/* 166 */       if (tileMultipart instanceof TSlottedTile) { TSlottedTile tSlottedTile = (TSlottedTile)tileMultipart;
/* 167 */         Predef$.MODULE$.refArrayOps((Object[])tSlottedTile.v_partMap()).indices().foreach$mVc$sp((Function1)new PrintPart$$anonfun$toggleState$1(this, tSlottedTile));
/*     */ 
/*     */ 
/*     */         
/* 171 */         tile().bindPart(this); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 172 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 174 */       world().func_72908_a(x() + 0.5D, y() + 0.5D, z() + 0.5D, "random.click", 0.3F, state() ? 0.6F : 0.5F);
/* 175 */       tile().notifyPartChange(this);
/* 176 */       sendDescUpdate();
/* 177 */       if (state() && data().isButtonMode()) {
/* 178 */         scheduleTick(simpleBlock().func_149738_a(world()));
/*     */       }
/* 180 */       toggling_$eq(false); } 
/*     */   } public final class PrintPart$$anonfun$toggleState$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TSlottedTile x2$1; public final void apply(int i) { apply$mcVI$sp(i); } public PrintPart$$anonfun$toggleState$1(PrintPart $outer, TSlottedTile x2$1) {} public void apply$mcVI$sp(int i) { PrintPart printPart = this.$outer; if (this.x2$1.v_partMap()[i] == null) { this.x2$1.v_partMap()[i]; if (printPart != null)
/*     */           return;  } else { if (this.x2$1.v_partMap()[i].equals(printPart)) { this.x2$1.v_partMap()[i] = null; return; }  return; }  this.x2$1.v_partMap()[i] = null; } }
/* 184 */   public boolean canToggle() { if (!toggling() && world() != null && !(world()).field_72995_K) {
/* 185 */       PrintPart toggled = new PrintPart(PrintPart$.MODULE$.$lessinit$greater$default$1());
/* 186 */       toggled.facing_$eq(facing());
/* 187 */       toggled.data_$eq(data());
/* 188 */       toggled.state_$eq(!state());
/* 189 */       toggled.boundsOff_$eq(boundsOff());
/* 190 */       toggled.boundsOn_$eq(boundsOn());
/* 191 */       if (tile().canReplacePart(this, toggled));
/*     */     } 
/*     */     return false; }
/*     */   
/*     */   public void scheduledTick() {
/* 196 */     if (state()) toggleState(); 
/*     */   } public ItemStack pickItem(MovingObjectPosition hit) {
/* 198 */     return data().createItemStack();
/*     */   } public Iterable<ItemStack> getDrops() {
/* 200 */     (new ItemStack[1])[0] = data().createItemStack(); return WrapAsJava$.MODULE$.asJavaIterable((Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ItemStack[1])));
/*     */   }
/*     */   
/* 203 */   public ExtendedMOP collisionRayTrace(Vec3 start, Vec3 end) { Set shapes = state() ? data().stateOn() : data().stateOff();
/* 204 */     DoubleRef closestDistance = DoubleRef.create(Double.POSITIVE_INFINITY);
/* 205 */     ObjectRef closest = ObjectRef.create(None$.MODULE$);
/* 206 */     shapes.foreach((Function1)new PrintPart$$anonfun$collisionRayTrace$1(this, start, end, closestDistance, closest));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     return (ExtendedMOP)((Option)closest.elem).fold((Function0)new PrintPart$$anonfun$collisionRayTrace$2(this, shapes), (Function1)new PrintPart$$anonfun$collisionRayTrace$3(this, closestDistance)); } public final class PrintPart$$anonfun$collisionRayTrace$1 extends AbstractFunction1<PrintData.Shape, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Vec3 start$1; private final Vec3 end$1; private final DoubleRef closestDistance$1; private final ObjectRef closest$1; public PrintPart$$anonfun$collisionRayTrace$1(PrintPart $outer, Vec3 start$1, Vec3 end$1, DoubleRef closestDistance$1, ObjectRef closest$1) {} public final void apply(PrintData.Shape shape) { AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.$outer.facing()).func_72317_d(this.$outer.x(), this.$outer.y(), this.$outer.z()); MovingObjectPosition hit = bounds.func_72327_a(this.start$1, this.end$1); if (hit != null) { double distance = hit.field_72307_f.func_72438_d(this.start$1); if (distance < this.closestDistance$1.elem) { this.closestDistance$1.elem = distance; hit.field_72311_b = this.$outer.x(); hit.field_72312_c = this.$outer.y(); hit.field_72309_d = this.$outer.z(); this.closest$1.elem = Option$.MODULE$.apply(hit); }  }  } } public final class PrintPart$$anonfun$collisionRayTrace$2 extends AbstractFunction0<ExtendedMOP> implements Serializable { public static final long serialVersionUID = 0L; private final Set shapes$1; public final ExtendedMOP apply() { return this.shapes$1.isEmpty() ? new ExtendedMOP(this.$outer.x(), this.$outer.y(), this.$outer.z(), 0, Vec3.func_72443_a(0.5D, 0.5D, 0.5D), null) : null; } public PrintPart$$anonfun$collisionRayTrace$2(PrintPart $outer, Set shapes$1) {} } public final class PrintPart$$anonfun$collisionRayTrace$3 extends AbstractFunction1<MovingObjectPosition, ExtendedMOP> implements Serializable { public static final long serialVersionUID = 0L; private final DoubleRef closestDistance$1; public final ExtendedMOP apply(MovingObjectPosition hit) { return new ExtendedMOP(hit, null, this.closestDistance$1.elem); }
/*     */     
/*     */     public PrintPart$$anonfun$collisionRayTrace$3(PrintPart $outer, DoubleRef closestDistance$1) {} }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/* 225 */   public boolean drawHighlight(MovingObjectPosition hit, EntityPlayer player, float frame) { Vec3 pos = player.func_70666_h(frame);
/* 226 */     float expansion = 0.002F;
/*     */ 
/*     */     
/* 229 */     GL11.glEnable(3042);
/* 230 */     OpenGlHelper.func_148821_a(770, 771, 1, 0);
/* 231 */     GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
/* 232 */     GL11.glLineWidth(2.0F);
/* 233 */     GL11.glDisable(3553);
/* 234 */     GL11.glDepthMask(false);
/*     */     
/* 236 */     (state() ? data().stateOn() : data().stateOff()).foreach((Function1)new PrintPart$$anonfun$drawHighlight$1(this, hit, pos, expansion));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     GL11.glDepthMask(true);
/* 244 */     GL11.glEnable(3553);
/* 245 */     GL11.glDisable(3042);
/*     */     
/* 247 */     return true; } public final class PrintPart$$anonfun$drawHighlight$1 extends AbstractFunction1<PrintData.Shape, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final MovingObjectPosition hit$1; private final Vec3 pos$1; private final float expansion$1; public PrintPart$$anonfun$drawHighlight$1(PrintPart $outer, MovingObjectPosition hit$1, Vec3 pos$1, float expansion$1) {} public final void apply(PrintData.Shape shape) { AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.$outer.facing());
/*     */       RenderGlobal.func_147590_a(bounds.func_72329_c().func_72314_b(this.expansion$1, this.expansion$1, this.expansion$1).func_72317_d(this.hit$1.field_72311_b, this.hit$1.field_72312_c, this.hit$1.field_72309_d).func_72317_d(-this.pos$1.field_72450_a, -this.pos$1.field_72448_b, -this.pos$1.field_72449_c), -1); } }
/*     */   public void onPartChanged(TMultiPart part) {
/* 251 */     super.onPartChanged(part);
/* 252 */     checkRedstone();
/*     */   }
/*     */   
/*     */   public void onNeighborChanged() {
/* 256 */     super.onNeighborChanged();
/* 257 */     checkRedstone();
/*     */   }
/*     */   
/*     */   public void checkRedstone() {
/* 261 */     int newMaxValue = computeInput();
/* 262 */     boolean newState = (newMaxValue > 1);
/* 263 */     if (!data().emitRedstone() && data().hasActiveState() && state() != newState) {
/* 264 */       toggleState();
/*     */     }
/*     */   }
/*     */   
/*     */   public int computeInput() {
/* 269 */     int inner = BoxesRunTime.unboxToInt(tile().partList().foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new PrintPart$$anonfun$2(this)));
/*     */ 
/*     */ 
/*     */     
/* 273 */     return package$.MODULE$.max(inner, BoxesRunTime.unboxToInt(Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new PrintPart$$anonfun$computeInput$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).max((Ordering)Ordering$Int$.MODULE$))); } public final class PrintPart$$anonfun$2 extends AbstractFunction2<Object, TMultiPart, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int power, TMultiPart part) { TMultiPart tMultiPart = part; if (tMultiPart instanceof PrintPart) { PrintPart printPart = (PrintPart)tMultiPart; if (printPart.data().emitRedstone(printPart.state())) return package$.MODULE$.max(power, printPart.data().redstoneLevel());  }  return power; } public PrintPart$$anonfun$2(PrintPart $outer) {} } public final class PrintPart$$anonfun$computeInput$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$2) { return BundledRedstone$.MODULE$.computeInput(BlockPosition$.MODULE$.apply(this.$outer.x(), this.$outer.y(), this.$outer.z(), this.$outer.world()), x$2); }
/*     */ 
/*     */     
/*     */     public PrintPart$$anonfun$computeInput$1(PrintPart $outer) {} }
/*     */ 
/*     */   
/* 279 */   public void load(NBTTagCompound nbt) { super.load(nbt);
/* 280 */     facing_$eq((ForgeDirection)ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).getDirection("facing").getOrElse((Function0)new PrintPart$$anonfun$load$1(this)));
/* 281 */     data().load(nbt.func_74775_l("data"));
/* 282 */     state_$eq(nbt.func_74767_n("state"));
/* 283 */     updateBounds(); } public final class PrintPart$$anonfun$load$1 extends AbstractFunction0<ForgeDirection> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ForgeDirection apply() {
/*     */       return this.$outer.facing();
/*     */     } public PrintPart$$anonfun$load$1(PrintPart $outer) {} }
/* 287 */   public void save(NBTTagCompound nbt) { super.save(nbt);
/* 288 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setDirection("facing", Option$.MODULE$.apply(facing()));
/* 289 */     PrintData printData = data(); ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("data", (Function1)new PrintPart$$anonfun$save$1(this, printData));
/* 290 */     nbt.func_74757_a("state", state()); } public final class PrintPart$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PrintData eta$0$1$1; public final void apply(NBTTagCompound nbt) {
/*     */       this.eta$0$1$1.save(nbt);
/*     */     } public PrintPart$$anonfun$save$1(PrintPart $outer, PrintData eta$0$1$1) {} } public void readDesc(MCDataInput packet) {
/* 294 */     super.readDesc(packet);
/* 295 */     facing_$eq(ForgeDirection.getOrientation(packet.readUByte()));
/* 296 */     data().load(packet.readNBTTagCompound());
/* 297 */     state_$eq(packet.readBoolean());
/* 298 */     updateBounds();
/* 299 */     if (world() != null) {
/* 300 */       world().func_147471_g(x(), y(), z());
/*     */     }
/*     */   }
/*     */   
/*     */   public void writeDesc(MCDataOutput packet) {
/* 305 */     super.writeDesc(packet);
/* 306 */     packet.writeByte((byte)facing().ordinal());
/* 307 */     NBTTagCompound nbt = new NBTTagCompound();
/* 308 */     data().save(nbt);
/* 309 */     packet.writeNBTTagCompound(nbt);
/* 310 */     packet.writeBoolean(state());
/*     */   }
/*     */   
/*     */   public void updateBounds() {
/* 314 */     boundsOff_$eq((AxisAlignedBB)((TraversableOnce)data().stateOff().drop(1)).foldLeft(data().stateOff().headOption().fold((Function0)new PrintPart$$anonfun$updateBounds$1(this), (Function1)new PrintPart$$anonfun$updateBounds$2(this)), (Function2)new PrintPart$$anonfun$updateBounds$3(this)));
/* 315 */     if (ExtendedAABB$.MODULE$.extendedAABB(boundsOff()).volume() == 0) { boundsOff_$eq(ExtendedAABB$.MODULE$.unitBounds()); }
/* 316 */     else { boundsOff_$eq(ExtendedAABB$.MODULE$.extendedAABB(boundsOff()).rotateTowards(facing())); }
/* 317 */      boundsOn_$eq((AxisAlignedBB)((TraversableOnce)data().stateOn().drop(1)).foldLeft(data().stateOn().headOption().fold((Function0)new PrintPart$$anonfun$updateBounds$4(this), (Function1)new PrintPart$$anonfun$updateBounds$5(this)), (Function2)new PrintPart$$anonfun$updateBounds$6(this)));
/* 318 */     if (ExtendedAABB$.MODULE$.extendedAABB(boundsOn()).volume() == 0) { boundsOn_$eq(ExtendedAABB$.MODULE$.unitBounds()); }
/* 319 */     else { boundsOn_$eq(ExtendedAABB$.MODULE$.extendedAABB(boundsOn()).rotateTowards(facing())); } 
/*     */   } public final class PrintPart$$anonfun$updateBounds$1 extends AbstractFunction0<AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply() { return ExtendedAABB$.MODULE$.unitBounds(); } public PrintPart$$anonfun$updateBounds$1(PrintPart $outer) {} } public final class PrintPart$$anonfun$updateBounds$2 extends AbstractFunction1<PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(PrintData.Shape x$3) { return x$3.bounds(); } public PrintPart$$anonfun$updateBounds$2(PrintPart $outer) {} } public final class PrintPart$$anonfun$updateBounds$3 extends AbstractFunction2<AxisAlignedBB, PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(AxisAlignedBB a, PrintData.Shape b) { return a.func_111270_a(b.bounds()); } public PrintPart$$anonfun$updateBounds$3(PrintPart $outer) {} } public final class PrintPart$$anonfun$updateBounds$4 extends AbstractFunction0<AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply() { return ExtendedAABB$.MODULE$.unitBounds(); } public PrintPart$$anonfun$updateBounds$4(PrintPart $outer) {} } public final class PrintPart$$anonfun$updateBounds$5 extends AbstractFunction1<PrintData.Shape, AxisAlignedBB> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(PrintData.Shape x$4) { return x$4.bounds(); } public PrintPart$$anonfun$updateBounds$5(PrintPart $outer) {} } public final class PrintPart$$anonfun$updateBounds$6 extends AbstractFunction2<AxisAlignedBB, PrintData.Shape, AxisAlignedBB> implements Serializable {
/* 326 */     public static final long serialVersionUID = 0L; public final AxisAlignedBB apply(AxisAlignedBB a, PrintData.Shape b) { return a.func_111270_a(b.bounds()); } public PrintPart$$anonfun$updateBounds$6(PrintPart $outer) {} } @SideOnly(Side.CLIENT) public boolean renderStatic(Vector3 pos, int pass) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger((int)pos.x), BoxesRunTime.boxToInteger((int)pos.y), BoxesRunTime.boxToInteger((int)pos.z)); if (tuple3 != null) { int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 327 */       RenderBlocks renderer = RenderBlocks.getInstance();
/* 328 */       renderer.field_147845_a = (IBlockAccess)world();
/* 329 */       Print$.MODULE$.render(data(), state(), facing(), i, j, k, (Block)simpleBlock(), renderer);
/* 330 */       return true; }
/*     */     
/*     */     throw new MatchError(tuple3); }
/*     */ 
/*     */   
/*     */   public static Option<Print> $lessinit$greater$default$1() {
/*     */     return PrintPart$.MODULE$.$lessinit$greater$default$1();
/*     */   }
/*     */   
/*     */   public static Cuboid6[] slotBounds() {
/*     */     return PrintPart$.MODULE$.slotBounds();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\PrintPart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */