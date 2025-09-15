/*    */ package li.cil.oc.server.driver;
/*    */ 
/*    */ import li.cil.oc.api.driver.Block;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005=b\001B\001\003\0015\0211cQ8na>,h\016\032\"m_\016\\GI]5wKJT!a\001\003\002\r\021\024\030N^3s\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\005Y\006twMC\001\024\003\021Q\027M^1\n\005U\001\"AB(cU\026\034G\017\005\002\03075\t\001D\003\002\0043)\021!DB\001\004CBL\027B\001\017\031\005)\031\026\016Z3e\0052|7m\033\005\t=\001\021)\031!C\001?\005Y1/\0333fI\ncwnY6t+\005\001\003cA\021%-5\t!EC\001$\003\025\0318-\0317b\023\t)#EA\003BeJ\f\027\020\003\005(\001\t\005\t\025!\003!\0031\031\030\016Z3e\0052|7m[:!\021!I\003A!b\001\n\003Q\023A\0022m_\016\\7/F\001,!\r\tC\005\f\t\003/5J!A\f\r\003\013\tcwnY6\t\021A\002!\021!Q\001\n-\nqA\0317pG.\034\b\005C\0033\001\021\0051'\001\004=S:LGO\020\013\004iY:\004CA\033\001\033\005\021\001\"\002\0202\001\004\001\003\"B\0252\001\004Y\003\"B\035\001\t\003R\024!E2sK\006$X-\0228wSJ|g.\\3oiR11(\021'R'V\003\"\001P \016\003uR!AP\r\002\0179,Go^8sW&\021\001)\020\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\003Cq\001\0071)A\003x_JdG\r\005\002E\0256\tQI\003\002C\r*\021q\tS\001\n[&tWm\031:bMRT\021!S\001\004]\026$\030BA&F\005\0259vN\0357e\021\025i\005\b1\001O\003\005A\bCA\021P\023\t\001&EA\002J]RDQA\025\035A\0029\013\021!\037\005\006)b\002\rAT\001\002u\")a\013\017a\001/\006!1/\0333f!\tAv,D\001Z\025\tQ6,\001\003vi&d'B\001/^\003\031\031w.\\7p]*\021a\fS\001\017[&tWm\031:bMR4wN]4f\023\t\001\027L\001\bG_J<W\rR5sK\016$\030n\0348\t\013\t\004A\021I2\002\023]|'o[:XSRDGC\0023hQ&T7\016\005\002\"K&\021aM\t\002\b\005>|G.Z1o\021\025\021\025\r1\001D\021\025i\025\r1\001O\021\025\021\026\r1\001O\021\025!\026\r1\001O\021\0251\026\r1\001X\021\025i\007\001\"\021o\003\031)\027/^1mgR\021Am\034\005\006a2\004\r!]\001\004_\nT\007CA\021s\023\t\031(EA\002B]fDQ!\036\001\005\nY\f!\002\036:z\017\026$h*Y7f)%9hp`A\001\003\007\t)\001\005\002yw:\021\021%_\005\003u\n\na\001\025:fI\0264\027B\001?~\005\031\031FO]5oO*\021!P\t\005\006\005R\004\ra\021\005\006\033R\004\rA\024\005\006%R\004\rA\024\005\006)R\004\rA\024\005\b\003\017!\b\031AA\005\0031)gN^5s_:lWM\034;t!\025\tY!a\007<\035\021\ti!a\006\017\t\005=\021QC\007\003\003#Q1!a\005\r\003\031a$o\\8u}%\t1%C\002\002\032\t\nq\001]1dW\006<W-\003\003\002\036\005}!aA*fc*\031\021\021\004\022\t\017\005\r\002\001\"\003\002&\005I1\r\\3b]:\013W.\032\013\005\003O\tY\003E\002\020\003SI!\001 \t\t\017\0055\022\021\005a\001o\006!a.Y7f\001")
/*    */ public class CompoundBlockDriver implements SidedBlock {
/*    */   private final SidedBlock[] sidedBlocks;
/*    */   
/* 15 */   public SidedBlock[] sidedBlocks() { return this.sidedBlocks; } private final Block[] blocks; public Block[] blocks() { return this.blocks; }
/*    */    public CompoundBlockDriver(SidedBlock[] sidedBlocks, Block[] blocks) {} public final class CompoundBlockDriver$$anonfun$2 extends AbstractFunction1<SidedBlock, Tuple2<String, ManagedEnvironment>> implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final int x$6; private final int y$1; private final int z$1; private final ForgeDirection side$1;
/*    */     public final Tuple2<String, ManagedEnvironment> apply(SidedBlock driver) { Tuple2 tuple2;
/* 18 */       Option option = Option$.MODULE$.apply(driver.createEnvironment(this.world$1, this.x$6, this.y$1, this.z$1, this.side$1));
/* 19 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); tuple2 = new Tuple2(driver.getClass().getName(), environment); }
/* 20 */       else { tuple2 = null; }
/*    */        return tuple2; } public CompoundBlockDriver$$anonfun$2(CompoundBlockDriver $outer, World world$1, int x$6, int y$1, int z$1, ForgeDirection side$1) {} }
/*    */    public final class CompoundBlockDriver$$anonfun$3 extends AbstractFunction1<Block, Tuple2<String, ManagedEnvironment>> implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final int x$6; private final int y$1; private final int z$1; public final Tuple2<String, ManagedEnvironment> apply(Block driver) { Tuple2 tuple2; Option option = Option$.MODULE$.apply(driver.createEnvironment(this.world$1, this.x$6, this.y$1, this.z$1)); if (option instanceof Some) {
/*    */         Some some = (Some)option; ManagedEnvironment environment = (ManagedEnvironment)some.x(); tuple2 = new Tuple2(driver.getClass().getName(), environment);
/*    */       } else {
/*    */         tuple2 = null;
/*    */       }  return tuple2; } public CompoundBlockDriver$$anonfun$3(CompoundBlockDriver $outer, World world$1, int x$6, int y$1, int z$1) {} }
/* 27 */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) { Tuple2[] list = (Tuple2[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])sidedBlocks()).map((Function1)new CompoundBlockDriver$$anonfun$2(this, world, x, y, z, side), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).$plus$plus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])blocks()).map((Function1)new CompoundBlockDriver$$anonfun$3(this, world, x, y, z), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).filter((Function1)new CompoundBlockDriver$$anonfun$4(this));
/* 28 */     return Predef$.MODULE$.refArrayOps((Object[])list).isEmpty() ? null : 
/* 29 */       new CompoundBlockEnvironment(cleanName(tryGetName(world, x, y, z, (Seq<ManagedEnvironment>)Predef$.MODULE$.refArrayOps((Object[])list).map((Function1)new CompoundBlockDriver$$anonfun$createEnvironment$1(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit())))), (Seq<Tuple2<String, ManagedEnvironment>>)Predef$.MODULE$.wrapRefArray((Object[])list)); } public final class CompoundBlockDriver$$anonfun$4 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$1) { return !(x$1 == null); } public CompoundBlockDriver$$anonfun$4(CompoundBlockDriver $outer) {} } public final class CompoundBlockDriver$$anonfun$createEnvironment$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, ManagedEnvironment> implements Serializable { public static final long serialVersionUID = 0L; public final ManagedEnvironment apply(Tuple2 x$2) { return (ManagedEnvironment)x$2._2(); }
/*    */     
/*    */     public CompoundBlockDriver$$anonfun$createEnvironment$1(CompoundBlockDriver $outer) {} }
/* 32 */   public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) { return (Predef$.MODULE$.refArrayOps((Object[])sidedBlocks()).forall((Function1)new CompoundBlockDriver$$anonfun$worksWith$1(this, world, x, y, z, side)) && Predef$.MODULE$.refArrayOps((Object[])blocks()).forall((Function1)new CompoundBlockDriver$$anonfun$worksWith$2(this, world, x, y, z))); } public final class CompoundBlockDriver$$anonfun$worksWith$1 extends AbstractFunction1<SidedBlock, Object> implements Serializable { public static final long serialVersionUID = 0L; private final World world$2; private final int x$7; private final int y$2; private final int z$2; private final ForgeDirection side$2; public final boolean apply(SidedBlock x$3) { return x$3.worksWith(this.world$2, this.x$7, this.y$2, this.z$2, this.side$2); } public CompoundBlockDriver$$anonfun$worksWith$1(CompoundBlockDriver $outer, World world$2, int x$7, int y$2, int z$2, ForgeDirection side$2) {} } public final class CompoundBlockDriver$$anonfun$worksWith$2 extends AbstractFunction1<Block, Object> implements Serializable { public static final long serialVersionUID = 0L; private final World world$2; private final int x$7; private final int y$2; private final int z$2; public final boolean apply(Block x$4) { return x$4.worksWith(this.world$2, this.x$7, this.y$2, this.z$2); }
/*    */      public CompoundBlockDriver$$anonfun$worksWith$2(CompoundBlockDriver $outer, World world$2, int x$7, int y$2, int z$2) {} } public boolean equals(Object obj) {
/* 34 */     Object object = obj;
/* 35 */     if (object instanceof CompoundBlockDriver) { CompoundBlockDriver compoundBlockDriver = (CompoundBlockDriver)object; if ((compoundBlockDriver.sidedBlocks()).length == (sidedBlocks()).length && (compoundBlockDriver.blocks()).length == (blocks()).length) return (((SidedBlock[])Predef$.MODULE$.refArrayOps((Object[])sidedBlocks()).intersect((GenSeq)Predef$.MODULE$.wrapRefArray((Object[])compoundBlockDriver.sidedBlocks()))).length == (sidedBlocks()).length && ((Block[])Predef$.MODULE$.refArrayOps((Object[])blocks()).intersect((GenSeq)Predef$.MODULE$.wrapRefArray((Object[])compoundBlockDriver.blocks()))).length == (blocks()).length);
/*    */        }
/*    */     
/*    */     return false;
/*    */   }
/*    */   
/*    */   private String tryGetName(World world, int x, int y, int z, Seq environments) {
/* 42 */     Option option = ((TraversableLike)((SeqLike)environments.collect((PartialFunction)new CompoundBlockDriver$$anonfun$1(this), Seq$.MODULE$.canBuildFrom())).sortBy((Function1)new CompoundBlockDriver$$anonfun$5(this), (Ordering)Ordering$Int$.MODULE$)).lastOption();
/* 43 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment named = (ManagedEnvironment)some.x(); return ((NamedBlock)named).preferredName(); }
/* 44 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     try {
/* 46 */       TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 47 */       if (tileEntity instanceof IInventory) { TileEntity tileEntity1 = tileEntity; if (!Strings.isNullOrEmpty(((IInventory)tileEntity1).func_145825_b())) return (new StringOps(Predef$.MODULE$.augmentString(((IInventory)tileEntity1).func_145825_b()))).stripPrefix("container.");  }
/*    */        throw new MatchError(tileEntity);
/*    */     } finally {
/*    */       null;
/*    */       try {
/* 52 */         Block block = world.func_147439_a(x, y, z); try {  }
/* 53 */         finally {} Option stack = 
/*    */           
/* 55 */           (Item.func_150898_a(block) == null) ? 
/*    */ 
/*    */           
/* 58 */           (Option)None$.MODULE$ : (Option)new Some(new ItemStack(block, 1, block.func_149643_k(world, x, y, z)));
/*    */         
/* 60 */         if (stack.isDefined())
/* 61 */           return (new StringOps(Predef$.MODULE$.augmentString(((ItemStack)stack.get()).func_77977_a()))).stripPrefix("tile."); 
/*    */       } finally {}
/*    */     }  } public final class CompoundBlockDriver$$anonfun$1 extends AbstractPartialFunction<ManagedEnvironment, ManagedEnvironment> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final <A1 extends ManagedEnvironment, B1> B1 applyOrElse(ManagedEnvironment x1, Function1 default) { Object object; ManagedEnvironment managedEnvironment = x1; if (managedEnvironment instanceof NamedBlock) {
/*    */         ManagedEnvironment managedEnvironment1 = managedEnvironment;
/*    */       } else {
/*    */         object = default.apply(x1);
/*    */       }  return (B1)object; } public final boolean isDefinedAt(ManagedEnvironment x1) { boolean bool; ManagedEnvironment managedEnvironment = x1; if (managedEnvironment instanceof NamedBlock) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       }  return bool; } public CompoundBlockDriver$$anonfun$1(CompoundBlockDriver $outer) {} } public final class CompoundBlockDriver$$anonfun$5 extends AbstractFunction1<ManagedEnvironment, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final int apply(ManagedEnvironment x$5) { return ((NamedBlock)x$5).priority(); }
/*    */     public CompoundBlockDriver$$anonfun$5(CompoundBlockDriver $outer) {} }
/* 76 */   private String cleanName(String name) { String safeStart = name.matches("^[^a-zA-Z_]") ? (new StringBuilder()).append("_").append(name).toString() : name;
/* 77 */     String identifier = safeStart.replaceAll("[^\\w_]", "_").trim();
/* 78 */     return Strings.isNullOrEmpty(identifier) ? "component" : 
/* 79 */       identifier.toLowerCase(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\driver\CompoundBlockDriver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */