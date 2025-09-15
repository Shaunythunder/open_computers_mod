/*     */ package li.cil.oc.integration.fmp;
/*     */ 
/*     */ import codechicken.lib.data.MCDataInput;
/*     */ import codechicken.lib.data.MCDataOutput;
/*     */ import codechicken.lib.vec.Cuboid6;
/*     */ import codechicken.lib.vec.Vector3;
/*     */ import codechicken.multipart.TCuboidPart;
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import codechicken.multipart.TNormalOcclusion;
/*     */ import codechicken.multipart.TileMultipart;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.block.SimpleBlock;
/*     */ import li.cil.oc.common.tileentity.Cable;
/*     */ import li.cil.oc.util.Color$;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035d\001B\001\003\0015\021\021bQ1cY\026\004\026M\035;\013\005\r!\021a\0014na*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031r\001\001\b\0235u\031c\005\005\002\020!5\t!!\003\002\022\005\ty1+[7qY\026\024En\\2l!\006\024H\017\005\002\02415\tAC\003\002\026-\005IQ.\0367uSB\f'\017\036\006\002/\005Y1m\0343fG\"L7m[3o\023\tIBCA\006U\007V\024w.\0333QCJ$\bCA\n\034\023\taBC\001\007U'2|G\017^3e!\006\024H\017\005\002\037C5\tqD\003\002!-\005QQ.[2s_\ndwnY6\n\005\tz\"aE%TS\022,G\rS8mY><8i\0348oK\016$\bCA\n%\023\t)CC\001\tU\035>\024X.\0317PG\016dWo]5p]B\021q\005L\007\002Q)\021\021FK\001\b]\026$xo\034:l\025\tYc!A\002ba&L!!\f\025\003\027\025sg/\033:p]6,g\016\036\005\t_\001\021)\031!C\001a\005AqN]5hS:\fG.F\0012!\r\021TgN\007\002g)\tA'A\003tG\006d\027-\003\0027g\t1q\n\035;j_:\004\"\001O\037\016\003eR!AO\036\002\025QLG.Z3oi&$\030P\003\002=\r\00511m\\7n_:L!AP\035\003\013\r\013'\r\\3\t\021\001\003!\021!Q\001\nE\n\021b\034:jO&t\027\r\034\021\t\013\t\003A\021A\"\002\rqJg.\033;?)\t!U\t\005\002\020\001!9q&\021I\001\002\004\t\004bB$\001\005\004%\t\001S\001\005]>$W-F\001J!\t9#*\003\002LQ\t!aj\0343f\021\031i\005\001)A\005\023\006)an\0343fA!9q\n\001a\001\n\023\001\026AB0d_2|'/F\001R!\t\021$+\003\002Tg\t\031\021J\034;\t\017U\003\001\031!C\005-\006QqlY8m_J|F%Z9\025\005]S\006C\001\032Y\023\tI6G\001\003V]&$\bbB.U\003\003\005\r!U\001\004q\022\n\004BB/\001A\003&\021+A\004`G>dwN\035\021\t\013}\003A\021\001)\002\013\r|Gn\034:\t\013\005\004A\021\0012\002\023\r|Gn\034:`I\025\fHCA,d\021\025!\007\r1\001R\003\0251\030\r\\;f\021\0251\007\001\"\005h\0039ygnQ8m_J\034\005.\0318hK\022$\022a\026\005\006S\002!\tE[\001\fg&l\007\017\\3CY>\0347.F\001l!\taw.D\001n\025\tq7(A\003cY>\0347.\003\002?[\")\021\017\001C\001e\0069q-\032;UsB,W#A:\021\005QLX\"A;\013\005Y<\030\001\0027b]\036T\021\001_\001\005U\0064\030-\003\002{k\n11\013\036:j]\036DQ\001 \001\005Bu\f1bZ3u'R\024XM\\4uQR)a0a\001\002\034A\021!g`\005\004\003\003\031$!\002$m_\006$\bbBA\003w\002\007\021qA\001\004Q&$\b\003BA\005\003/i!!a\003\013\t\0055\021qB\001\005kRLGN\003\003\002\022\005M\021!C7j]\026\034'/\0314u\025\t\t)\"A\002oKRLA!!\007\002\f\t!Rj\034<j]\036|%M[3diB{7/\033;j_:Dq!!\b|\001\004\ty\"\001\004qY\006LXM\035\t\005\003C\tI#\004\002\002$)!\021QDA\023\025\021\t9#a\004\002\r\025tG/\033;z\023\021\tY#a\t\003\031\025sG/\033;z!2\f\0270\032:\t\017\005=\002\001\"\021\0022\005AAm\\3t)&\0347.\006\002\0024A\031!'!\016\n\007\005]2GA\004C_>dW-\0318\t\017\005m\002\001\"\021\002>\005Iq-\032;C_VtGm]\013\003\003\001B!!\021\002L5\021\0211\t\006\005\003\013\n9%A\002wK\016T1!!\023\027\003\ra\027NY\005\005\003\033\n\031EA\004Dk\n|\027\016\032\034\t\017\005E\003\001\"\021\002T\005\tr-\032;PG\016dWo]5p]\n{\0070Z:\026\005\005U\003#\002;\002X\005}\022bAA-k\nA\021\n^3sC\ndW\rC\004\002^\001!\t%!\020\002\037\035,GOU3oI\026\024(i\\;oINDq!!\031\001\t\003\n\031'A\007hKRDu\016\0347poNK'0\032\013\004#\006\025\004bBA4\003?\002\r!U\001\005g&$W\r\003\004\002l\001!\t\005U\001\fO\026$8\013\\8u\033\006\0348\016C\004\002p\001!\t%!\035\002\021\005\034G/\033<bi\026$\002\"a\r\002t\005U\024q\017\005\t\003;\ti\0071\001\002 !A\021QAA7\001\004\t9\001\003\005\002z\0055\004\031AA>\003\021IG/Z7\021\t\005u\024\021Q\007\003\003RA!!\037\002\020%!\0211QA@\005%IE/Z7Ti\006\0347\016\003\004\002\b\002!\teZ\001\030S:4\030\r\\5eCR,7i\0348wKJ$X\r\032+jY\026Dq!a#\001\t\003\ni)A\007p]B\013'\017^\"iC:<W\r\032\013\004/\006=\005\002CAI\003\023\003\r!a%\002\tA\f'\017\036\t\004'\005U\025bAAL)\tQA+T;mi&\004\026M\035;\t\r\005m\005\001\"\021h\003-ygnV8sY\022Tu.\0338\t\r\005}\005\001\"\021h\003=ygnV8sY\022\034V\r]1sCR,\007bBAR\001\021\005\023QU\001\005Y>\fG\rF\002X\003OC\001\"!+\002\"\002\007\0211V\001\004]\n$\b\003BAW\003ck!!a,\013\t\005%\026qB\005\005\003g\013yK\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\005]\006\001\"\021\002:\006!1/\031<f)\r9\0261\030\005\t\003S\013)\f1\001\002,\"9\021q\030\001\005B\005\005\027\001\003:fC\022$Um]2\025\007]\013\031\r\003\005\002F\006u\006\031AAd\003\031\001\030mY6fiB!\021\021ZAh\033\t\tYM\003\003\002N\006\035\023\001\0023bi\006LA!!5\002L\nYQj\021#bi\006Le\016];u\021\035\t)\016\001C!\003/\f\021b\036:ji\026$Um]2\025\007]\013I\016\003\005\002F\006M\007\031AAn!\021\tI-!8\n\t\005}\0271\032\002\r\033\016#\025\r^1PkR\004X\017\036\005\b\003G\004A\021IAs\0031\021XM\0343feN#\030\r^5d)\031\t\031$a:\002r\"A\021\021^Aq\001\004\tY/A\002q_N\004B!!\021\002n&!\021q^A\"\005\0351Vm\031;peNBq!a=\002b\002\007\021+\001\003qCN\034\bfBAq\003o$'q\002\t\005\003s\024Y!\004\002\002|*!\021Q`A\000\003)\021X\r\\1v]\016DWM\035\006\005\005\003\021\031!A\002g[2TAA!\002\003\b\005!Qn\0343t\025\t\021I!A\002da^LAA!\004\002|\nA1+\0333f\037:d\027\020\n\002\003\022%!!1\003B\013\003\031\031E*S#O)*!!qCA~\003\021\031\026\016Z3\t\017\tm\001\001\"\021\003\036\005IqN\\'fgN\fw-\032\013\004/\n}\001\002\003B\021\0053\001\rAa\t\002\0175,7o]1hKB\031qE!\n\n\007\t\035\002FA\004NKN\034\030mZ3\t\017\t-\002\001\"\021\003.\005aqN\034#jg\016|gN\\3diR\031qKa\f\t\r\035\023I\0031\001J\021\035\021\031\004\001C!\005k\t\021b\0348D_:tWm\031;\025\007]\0239\004\003\004H\005c\001\r!S\004\n\005w\021\021\021!E\001\005{\t\021bQ1cY\026\004\026M\035;\021\007=\021yD\002\005\002\005\005\005\t\022\001B!'\021\021yDa\021\021\007I\022)%C\002\003HM\022a!\0218z%\0264\007b\002\"\003@\021\005!1\n\013\003\005{A!Ba\024\003@E\005I\021\001B)\003m!C.Z:tS:LG\017J4sK\006$XM\035\023eK\032\fW\017\034;%cU\021!1\013\026\004c\tU3F\001B,!\021\021IFa\031\016\005\tm#\002\002B/\005?\n\021\"\0368dQ\026\0347.\0323\013\007\t\0054'\001\006b]:|G/\031;j_:LAA!\032\003\\\t\tRO\\2iK\016\\W\r\032,be&\fgnY3")
/*     */ public class CablePart extends SimpleBlockPart implements TCuboidPart, TSlottedPart, ISidedHollowConnect, TNormalOcclusion, Environment {
/*     */   private final Option<Cable> original;
/*     */   
/*  35 */   public boolean occlusionTest(TMultiPart npart) { return TNormalOcclusion.class.occlusionTest(this, npart); } private final Node node; private int li$cil$oc$integration$fmp$CablePart$$_color; public Iterable<IndexedCuboid6> getSubParts() { return TCuboidPart.class.getSubParts(this); } public Iterable<Cuboid6> getCollisionBoxes() { return TCuboidPart.class.getCollisionBoxes(this); } @SideOnly(Side.CLIENT) public void drawBreaking(RenderBlocks renderBlocks) { TCuboidPart.class.drawBreaking(this, renderBlocks); } public Option<Cable> original() { return this.original; } public CablePart(Option<Cable> original) { TCuboidPart.class.$init$(this); TNormalOcclusion.class.$init$(this);
/*  36 */     this.node = Network.newNode(this, Visibility.None).create();
/*     */     
/*  38 */     this.li$cil$oc$integration$fmp$CablePart$$_color = Color$.MODULE$.LightGray();
/*     */     
/*  40 */     original.foreach((Function1)new CablePart$$anonfun$1(this)); } public Node node() { return this.node; } private int li$cil$oc$integration$fmp$CablePart$$_color() { return this.li$cil$oc$integration$fmp$CablePart$$_color; } public void li$cil$oc$integration$fmp$CablePart$$_color_$eq(int x$1) { this.li$cil$oc$integration$fmp$CablePart$$_color = x$1; } public final class CablePart$$anonfun$1 extends AbstractFunction1<Cable, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Cable cable) { this.$outer.li$cil$oc$integration$fmp$CablePart$$_color_$eq(cable.color()); }
/*     */     
/*     */     public CablePart$$anonfun$1(CablePart $outer) {} }
/*     */   public int color() {
/*  44 */     return li$cil$oc$integration$fmp$CablePart$$_color();
/*     */   } public void color_$eq(int value) {
/*  46 */     if (value != li$cil$oc$integration$fmp$CablePart$$_color()) {
/*  47 */       li$cil$oc$integration$fmp$CablePart$$_color_$eq(value);
/*  48 */       onColorChanged();
/*     */     } 
/*     */   }
/*     */   public void onColorChanged() {
/*  52 */     if (world() != null && !(world()).field_72995_K) {
/*  53 */       sendDescUpdate();
/*  54 */       Network.joinOrCreateNetwork((TileEntity)tile());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Cable simpleBlock() {
/*  60 */     return (Cable)Items.get("cable").block();
/*     */   } public String getType() {
/*  62 */     return (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("cable").toString();
/*     */   } public float getStrength(MovingObjectPosition hit, EntityPlayer player) {
/*  64 */     return Items.get("cable").block().func_149712_f(world(), hit.field_72311_b, hit.field_72312_c, hit.field_72309_d);
/*     */   } public boolean doesTick() {
/*  66 */     return false;
/*     */   } public Cuboid6 getBounds() {
/*  68 */     return new Cuboid6(Cable$.MODULE$.bounds((IBlockAccess)world(), x(), y(), z()));
/*     */   } public Iterable<Cuboid6> getOcclusionBoxes() {
/*  70 */     (new Cuboid6[1])[0] = new Cuboid6(AxisAlignedBB.func_72330_a(0.375D, 0.375D, 0.375D, 0.625D, 0.625D, 0.625D)); return WrapAsJava$.MODULE$.asJavaIterable((Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Cuboid6[1])));
/*     */   } public Cuboid6 getRenderBounds() {
/*  72 */     return new Cuboid6(Cable$.MODULE$.bounds((IBlockAccess)world(), x(), y(), z()).func_72317_d(x(), y(), z()));
/*     */   } public int getHollowSize(int side) {
/*  74 */     return 4;
/*     */   } public int getSlotMask() {
/*  76 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean activate(EntityPlayer player, MovingObjectPosition hit, ItemStack item) {
/*  82 */     color_$eq(Color$.MODULE$.dyeColor(player.func_70694_bm()));
/*  83 */     tile().func_70296_d();
/*     */ 
/*     */     
/*  86 */     return Color$.MODULE$.isDye(player.func_70694_bm()) ? true : super.activate(player, hit, item);
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidateConvertedTile()
/*     */   {
/*  92 */     super.invalidateConvertedTile();
/*  93 */     original().foreach((Function1)new CablePart$$anonfun$invalidateConvertedTile$1(this)); } public final class CablePart$$anonfun$invalidateConvertedTile$1 extends AbstractFunction1<Cable, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Cable x$1) { WrapAsScala$.MODULE$.iterableAsScalaIterable(x$1.node().neighbors()).foreach((Function1)new CablePart$$anonfun$invalidateConvertedTile$1$$anonfun$apply$1(this)); } public CablePart$$anonfun$invalidateConvertedTile$1(CablePart $outer) {} public final class CablePart$$anonfun$invalidateConvertedTile$1$$anonfun$apply$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node x$2) { x$2.connect(this.$outer.li$cil$oc$integration$fmp$CablePart$$anonfun$$$outer().node()); }
/*     */       
/*     */       public CablePart$$anonfun$invalidateConvertedTile$1$$anonfun$apply$1(CablePart$$anonfun$invalidateConvertedTile$1 $outer) {} } }
/*     */   public void onPartChanged(TMultiPart part) {
/*  97 */     super.onPartChanged(part);
/*  98 */     Network.joinOrCreateNetwork((TileEntity)tile());
/*     */   }
/*     */   
/*     */   public void onWorldJoin() {
/* 102 */     super.onWorldJoin();
/* 103 */     EventHandler$.MODULE$.scheduleFMP((Function0)new CablePart$$anonfun$onWorldJoin$1(this)); } public final class CablePart$$anonfun$onWorldJoin$1 extends AbstractFunction0<TileMultipart> implements Serializable { public static final long serialVersionUID = 0L; public final TileMultipart apply() { return this.$outer.tile(); }
/*     */     
/*     */     public CablePart$$anonfun$onWorldJoin$1(CablePart $outer) {} }
/*     */   
/* 107 */   public void onWorldSeparate() { super.onWorldSeparate();
/* 108 */     Option$.MODULE$.apply(node()).foreach((Function1)new CablePart$$anonfun$onWorldSeparate$1(this)); } public final class CablePart$$anonfun$onWorldSeparate$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node x$3) { x$3.remove(); }
/*     */ 
/*     */     
/*     */     public CablePart$$anonfun$onWorldSeparate$1(CablePart $outer) {} }
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 114 */     super.load(nbt);
/* 115 */     node().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString()));
/* 116 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString())) {
/* 117 */       li$cil$oc$integration$fmp$CablePart$$_color_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 122 */     super.save(nbt);
/*     */     
/* 124 */     (node() == null) ? BoxedUnit.UNIT : 
/* 125 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString(), (Function1)new CablePart$$anonfun$save$1(this));
/*     */     
/* 127 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString(), li$cil$oc$integration$fmp$CablePart$$_color()); } public final class CablePart$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound x$1) {
/*     */       this.$outer.node().save(x$1);
/*     */     } public CablePart$$anonfun$save$1(CablePart $outer) {} } public void readDesc(MCDataInput packet) {
/* 131 */     super.readDesc(packet);
/* 132 */     li$cil$oc$integration$fmp$CablePart$$_color_$eq(packet.readInt());
/*     */   }
/*     */   
/*     */   public void writeDesc(MCDataOutput packet) {
/* 136 */     super.writeDesc(packet);
/* 137 */     packet.writeInt(li$cil$oc$integration$fmp$CablePart$$_color());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean renderStatic(Vector3 pos, int pass) {
/* 144 */     Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger((int)pos.x), BoxesRunTime.boxToInteger((int)pos.y), BoxesRunTime.boxToInteger((int)pos.z)); if (tuple3 != null) { int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()), z = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), BoxesRunTime.boxToInteger(z)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 145 */       RenderBlocks renderer = RenderBlocks.getInstance();
/* 146 */       renderer.field_147845_a = (IBlockAccess)world();
/* 147 */       simpleBlock().colorMultiplierOverride_$eq((Option)new Some(BoxesRunTime.boxToInteger(li$cil$oc$integration$fmp$CablePart$$_color())));
/* 148 */       Cable$.MODULE$.render((IBlockAccess)world(), i, j, k, (Block)simpleBlock(), renderer);
/* 149 */       simpleBlock().colorMultiplierOverride_$eq((Option)None$.MODULE$);
/* 150 */       return true; }
/*     */     
/*     */     throw new MatchError(tuple3);
/*     */   }
/*     */   
/*     */   public void onMessage(Message message) {}
/*     */   
/*     */   public void onDisconnect(Node node) {}
/*     */   
/*     */   public void onConnect(Node node) {}
/*     */   
/*     */   public static Option<Cable> $lessinit$greater$default$1() {
/*     */     return CablePart$.MODULE$.$lessinit$greater$default$1();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\CablePart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */