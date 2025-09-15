/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.server.component.traits.InventoryAware;
/*     */ import li.cil.oc.server.component.traits.InventoryControl;
/*     */ import li.cil.oc.server.component.traits.InventoryWorldControl;
/*     */ import li.cil.oc.server.component.traits.TankAware;
/*     */ import li.cil.oc.server.component.traits.TankControl;
/*     */ import li.cil.oc.server.component.traits.WorldAware;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005eg\001B\001\003\0015\021QAU8c_RT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\t\001qaC\007\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021q\003G\007\002\005%\021\021D\001\002\006\003\036,g\016\036\t\0037yi\021\001\b\006\003;I\ta\001\032:jm\026\024\030BA\020\035\005)!UM^5dK&sgm\034\005\tC\001\021)\031!C\001E\005)\021mZ3oiV\t1\005\005\002%S5\tQE\003\002'O\005QA/\0337fK:$\030\016^=\013\005!2\021AB2p[6|g.\003\002\002K!A1\006\001B\001B\003%1%\001\004bO\026tG\017\t\005\006[\001!\tAL\001\007y%t\027\016\036 \025\005=\002\004CA\f\001\021\025\tC\0061\001$\021\035\021\004A1A\005BM\nAA\\8eKV\tA\007\005\0026q5\taG\003\0028%\0059a.\032;x_J\\\027BA\0357\005I\031u.\0349p]\026tGoQ8o]\026\034Go\034:\t\rm\002\001\025!\0035\003\025qw\016Z3!\021\035i\004A1A\005\002y\n\001B]8n%>\024w\016^\013\002A\031\001iQ#\016\003\005S\021AQ\001\006g\016\fG.Y\005\003\t\006\023aa\0249uS>t\007CA\033G\023\t)b\007\003\004I\001\001\006IaP\001\ne>l'k\0342pi\002B\001B\023\001\t\006\004%iaS\001\013I\0264\030nY3J]\032|W#\001'\021\t5\023F\013V\007\002\035*\021q\nU\001\nS6lW\017^1cY\026T!!U!\002\025\r|G\016\\3di&|g.\003\002T\035\n\031Q*\0319\021\005USV\"\001,\013\005]C\026\001\0027b]\036T\021!W\001\005U\0064\030-\003\002\\-\n11\013\036:j]\036D\001\"\030\001\t\002\003\006k\001T\001\fI\0264\030nY3J]\032|\007\005C\003`\001\021\005\003-A\007hKR$UM^5dK&sgm\034\013\002CB!!-\0324g\033\005\031'B\0013Y\003\021)H/\0337\n\005M\033\007CA4k\035\t\001\005.\003\002j\003\0061\001K]3eK\032L!aW6\013\005%\f\005\"B7\001\t#r\027AE2iK\016\\7+\0333f\r>\024\030i\031;j_:$Ba\\=\002\004A\021\001o^\007\002c*\021AM\035\006\003QMT!\001^;\002\0355Lg.Z2sC\032$hm\034:hK*\ta/A\002oKRL!\001_9\003\035\031{'oZ3ESJ,7\r^5p]\")!\020\034a\001w\006!\021M]4t!\tax0D\001~\025\tq(#A\004nC\016D\027N\\3\n\007\005\005QPA\005Be\036,X.\0328ug\"9\021Q\0017A\002\005\035\021!\0018\021\007\001\013I!C\002\002\f\005\0231!\0238u\021\035\ty\001\001C)\003#\tqb\0315fG.\034\026\016Z3G_J,6/\032\013\006_\006M\021Q\003\005\007u\0065\001\031A>\t\021\005\025\021Q\002a\001\003\017Aq!!\007\001\t\003\nY\"\001\np]^{'\017\0343J]R,'/Y2uS>tGCBA\017\003G\ti\003E\002A\003?I1!!\tB\005\021)f.\033;\t\021\005\025\022q\003a\001\003O\tqaY8oi\026DH\017E\002}\003SI1!a\013~\005\035\031uN\034;fqRD\001\"a\f\002\030\001\007\021\021G\001\tIV\024\030\r^5p]B\031\001)a\r\n\007\005U\022I\001\004E_V\024G.\032\005\b\003s\001A\021AA\036\00359W\r\036'jO\"$8i\0347peR1\021QHA%\003\027\002R\001QA \003\007J1!!\021B\005\025\t%O]1z!\r\001\025QI\005\004\003\017\n%AB!osJ+g\r\003\005\002&\005]\002\031AA\024\021\031Q\030q\007a\001w\"B\021qGA(\003+\n9\006E\002}\003#J1!a\025~\005!\031\025\r\0347cC\016\\\027a\0013pG\006\022\021\021L\001mMVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fA\r,(O]3oi\002\032w\016\\8sA=4\007\005\0365fA\005\034G/\033<jif\004C.[4ii\002\n7\017I1oA%tG/Z4fe\002*gnY8eK\022\004#k\022\"!m\006dW/\032\021)aa\024&kR$C\005&r\003bBA/\001\021\005\021qL\001\016g\026$H*[4ii\016{Gn\034:\025\r\005u\022\021MA2\021!\t)#a\027A\002\005\035\002B\002>\002\\\001\0071\020\013\005\002\\\005=\023QKA4C\t\tI'A>gk:\034G/[8oQY\fG.^3;]Vl'-\032:*u9,XNY3sA5j\003eU3uAQDW\rI2pY>\024\be\0344!i\",\007%Y2uSZLG/\037\021mS\036DG\017\t;pAQDW\rI:qK\016Lg-[3eA%tG/Z4fe\002*gnY8eK\022\004#k\022\"!m\006dW/\032\021)aa\024&kR$C\005&r\003bBA7\001\021\005\021qN\001\013IV\024\030MY5mSRLHCBA\037\003c\n\031\b\003\005\002&\005-\004\031AA\024\021\031Q\0301\016a\001w\"B\0211NA(\003+\n9(\t\002\002z\0059e-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;!i\",\007\005Z;sC\nLG.\033;zA=4\007\005\0365fA\r,(O]3oi2L\b%Z9vSB\004X\r\032\021u_>dg\006C\004\002~\001!\t!a \002\t5|g/\032\013\007\003{\t\t)a!\t\021\005\025\0221\020a\001\003OAaA_A>\001\004Y\b\006CA>\003\037\n)&a\"\"\005\005%\025A\0224v]\016$\030n\0348)I&\024Xm\031;j_:Td.^7cKJL#HY8pY\026\fg\016I\027.A5{g/\032\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\027N]3di&|gN\f\005\b\003\033\003A\021AAH\003\021!XO\0358\025\r\005u\022\021SAJ\021!\t)#a#A\002\005\035\002B\002>\002\f\002\0071\020\013\005\002\f\006=\023QKALC\t\tI*A%gk:\034G/[8oQ\rdwnY6xSN,'HY8pY\026\fg.\013\036c_>dW-\0318![5\002#k\034;bi\026\004\023N\034\021uQ\026\0043\017]3dS\032LW\r\032\021eSJ,7\r^5p]:Bq!!(\001\t\003\ny*A\005p]\016{gN\\3diR!\021QDAQ\021\035\021\0241\024a\001\003G\0032!NAS\023\r\t9K\016\002\005\035>$W\rC\004\002,\002!\t%!,\002\023=tW*Z:tC\036,G\003BA\017\003_C\001\"!-\002*\002\007\0211W\001\b[\026\0348/Y4f!\r)\024QW\005\004\003o3$aB'fgN\fw-\032\005\b\003w\003A\021IA_\003\021aw.\0313\025\t\005u\021q\030\005\t\003\003\fI\f1\001\002D\006\031aN\031;\021\t\005\025\027QZ\007\003\003\017TA!!1\002J*\031\0211Z;\002\0235Lg.Z2sC\032$\030\002BAh\003\017\024aB\024\"U)\006<7i\\7q_VtG\rC\004\002T\002!\t%!6\002\tM\fg/\032\013\005\003;\t9\016\003\005\002B\006E\007\031AAb\001")
/*     */ public class Robot extends ManagedEnvironment implements Agent, DeviceInfo {
/*     */   private final li.cil.oc.common.tileentity.Robot agent;
/*     */   private final ComponentConnector node;
/*     */   
/*  28 */   public BlockPosition position() { return Agent$class.position(this); } private final Option<ManagedEnvironment> romRobot; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public EntityPlayer fakePlayer() { return Agent$class.fakePlayer(this); } public Player rotatedPlayer(ForgeDirection facing, ForgeDirection side) { return Agent$class.rotatedPlayer(this, facing, side); } public IInventory inventory() { return Agent$class.inventory(this); } public int selectedSlot() { return Agent$class.selectedSlot(this); } public void selectedSlot_$eq(int value) { Agent$class.selectedSlot_$eq(this, value); } public MultiTank tank() { return Agent$class.tank(this); } public int selectedTank() { return Agent$class.selectedTank(this); } public void selectedTank_$eq(int value) { Agent$class.selectedTank_$eq(this, value); } public boolean canPlaceInAir() { return Agent$class.canPlaceInAir(this); } @Callback(doc = "function():string -- Get the name of the agent.") public Object[] name(Context context, Arguments args) { return Agent$class.name(this, context, args); } @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean, string -- Perform a 'left click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.") public Object[] swing(Context context, Arguments args) { return Agent$class.swing(this, context, args); } @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false[, duration:number=0]]]):boolean, string -- Perform a 'right click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.") public Object[] use(Context context, Arguments args) { return Agent$class.use(this, context, args); } @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean -- Place a block towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.") public Object[] place(Context context, Arguments args) { return Agent$class.place(this, context, args); } public void beginConsumeDrops(Entity entity) { Agent$class.beginConsumeDrops(this, entity); } public void endConsumeDrops(Player player, Entity entity) { Agent$class.endConsumeDrops(this, player, entity); } public ForgeDirection checkSideForFace(Arguments args, int n, ForgeDirection facing) { return Agent$class.checkSideForFace(this, args, n, facing); } public MovingObjectPosition pick(Player player, double range) { return Agent$class.pick(this, player, range); } public Tuple6<Object, Object, Object, Object, Object, Object> clickParamsFromHit(MovingObjectPosition hit) { return Agent$class.clickParamsFromHit(this, hit); } public Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForItemActivate(ForgeDirection facing, ForgeDirection side) { return Agent$class.clickParamsForItemActivate(this, facing, side); } public Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForItemUse(ForgeDirection facing, ForgeDirection side) { return Agent$class.clickParamsForItemUse(this, facing, side); } public Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForPlace(ForgeDirection facing) { return Agent$class.clickParamsForPlace(this, facing); } public ForgeDirection rotatedPlayer$default$1() { return Agent$class.rotatedPlayer$default$1(this); } public ForgeDirection rotatedPlayer$default$2() { return Agent$class.rotatedPlayer$default$2(this); } @Callback(doc = "function(side:number [, tank:number]):boolean -- Compare the fluid in the selected tank with the fluid in the specified tank on the specified side. Returns true if equal.") public Object[] compareFluid(Context context, Arguments args) { return TankWorldControl.class.compareFluid(this, context, args); } @Callback(doc = "function(side:boolean[, amount:number=1000]):boolean, number or string -- Drains the specified amount of fluid from the specified side. Returns the amount drained, or an error message.") public Object[] drain(Context context, Arguments args) { return TankWorldControl.class.drain(this, context, args); } @Callback(doc = "function(side:number[, amount:number=1000]):boolean, number of string -- Eject the specified amount of fluid to the specified side. Returns the amount ejected or an error message.") public Object[] fill(Context context, Arguments args) { return TankWorldControl.class.fill(this, context, args); } @Callback(doc = "function():number -- The number of tanks installed in the device.") public Object[] tankCount(Context context, Arguments args) { return TankControl.class.tankCount(this, context, args); } @Callback(doc = "function([index:number]):number -- Select a tank and/or get the number of the currently selected tank.") public Object[] selectTank(Context context, Arguments args) { return TankControl.class.selectTank(this, context, args); } @Callback(direct = true, doc = "function([index:number]):number -- Get the fluid amount in the specified or selected tank.") public Object[] tankLevel(Context context, Arguments args) { return TankControl.class.tankLevel(this, context, args); } @Callback(direct = true, doc = "function([index:number]):number -- Get the remaining fluid capacity in the specified or selected tank.") public Object[] tankSpace(Context context, Arguments args) { return TankControl.class.tankSpace(this, context, args); } @Callback(doc = "function(index:number):boolean -- Compares the fluids in the selected and the specified tank. Returns true if equal.") public Object[] compareFluidTo(Context context, Arguments args) { return TankControl.class.compareFluidTo(this, context, args); } @Callback(doc = "function(index:number[, count:number=1000]):boolean -- Move the specified amount of fluid from the selected tank into the specified tank.") public Object[] transferFluidTo(Context context, Arguments args) { return TankControl.class.transferFluidTo(this, context, args); } public int optTank(Arguments args, int n) { return TankAware.class.optTank((TankAware)this, args, n); } public Option<IFluidTank> getTank(int index) { return TankAware.class.getTank((TankAware)this, index); } public Option<FluidStack> fluidInTank(int index) { return TankAware.class.fluidInTank((TankAware)this, index); } public boolean haveSameFluidType(FluidStack stackA, FluidStack stackB) { return TankAware.class.haveSameFluidType((TankAware)this, stackA, stackB); } @Callback(doc = "function(side:number[, fuzzy:boolean=false]):boolean -- Compare the block on the specified side with the one in the selected slot. Returns true if equal.") public Object[] compare(Context context, Arguments args) { return InventoryWorldControl.class.compare(this, context, args); } @Callback(doc = "function(side:number[, count:number=64]):boolean -- Drops items from the selected slot towards the specified side.") public Object[] drop(Context context, Arguments args) { return InventoryWorldControl.class.drop(this, context, args); } public int suckFromItems(ForgeDirection facing) { return InventoryWorldControl.class.suckFromItems(this, facing); } @Callback(doc = "function(side:number[, count:number=64]):boolean -- Suck up items from the specified side.") public Object[] suck(Context context, Arguments args) { return InventoryWorldControl.class.suck(this, context, args); } public Buffer<EntityItem> suckableItems(ForgeDirection side) { return InventoryWorldControl.class.suckableItems(this, side); } public void onSuckCollect(EntityItem entity) { InventoryWorldControl.class.onSuckCollect(this, entity); } @Callback(doc = "function():number -- The size of this device's internal inventory.") public Object[] inventorySize(Context context, Arguments args) { return InventoryControl.class.inventorySize(this, context, args); } @Callback(doc = "function([slot:number]):number -- Get the currently selected slot; set the selected slot if specified.") public Object[] select(Context context, Arguments args) { return InventoryControl.class.select(this, context, args); } @Callback(direct = true, doc = "function([slot:number]):number -- Get the number of items in the specified slot, otherwise in the selected slot.") public Object[] count(Context context, Arguments args) { return InventoryControl.class.count(this, context, args); } @Callback(direct = true, doc = "function([slot:number]):number -- Get the remaining space in the specified slot, otherwise in the selected slot.") public Object[] space(Context context, Arguments args) { return InventoryControl.class.space(this, context, args); } @Callback(doc = "function(otherSlot:number[, checkNBT:boolean=false]):boolean -- Compare the contents of the selected slot to the contents of the specified slot.") public Object[] compareTo(Context context, Arguments args) { return InventoryControl.class.compareTo(this, context, args); } @Callback(doc = "function(toSlot:number[, amount:number]):boolean -- Move up to the specified amount of items from the selected slot into the specified slot.") public Object[] transferTo(Context context, Arguments args) { return InventoryControl.class.transferTo(this, context, args); } public IndexedSeq<Object> insertionSlots() { return InventoryAware.class.insertionSlots((InventoryAware)this); } public int optSlot(Arguments args, int n) { return InventoryAware.class.optSlot((InventoryAware)this, args, n); } public Option<ItemStack> stackInSlot(int slot) { return InventoryAware.class.stackInSlot((InventoryAware)this, slot); } @Callback(doc = "function(side:number):boolean, string -- Checks the contents of the block on the specified sides and returns the findings.") public Object[] detect(Context context, Arguments args) { return WorldControl.class.detect(this, context, args); } public World world() { return WorldAware.class.world((WorldAware)this); } public boolean mayInteract(BlockPosition blockPos, ForgeDirection face) { return WorldAware.class.mayInteract((WorldAware)this, blockPos, face); } public <Type extends Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB bounds, ClassTag evidence$1) { return WorldAware.class.entitiesInBounds((WorldAware)this, bounds, evidence$1); } public <Type extends Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$2) { return WorldAware.class.entitiesInBlock((WorldAware)this, blockPos, evidence$2); } public <Type extends Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag evidence$3) { return WorldAware.class.entitiesOnSide((WorldAware)this, side, evidence$3); } public <Type extends Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$4) { return WorldAware.class.closestEntity((WorldAware)this, side, evidence$4); } public Tuple2<Object, String> blockContent(ForgeDirection side) { return WorldAware.class.blockContent((WorldAware)this, side); } public li.cil.oc.common.tileentity.Robot agent() { return this.agent; } public Robot(li.cil.oc.common.tileentity.Robot agent) { WorldAware.class.$init$((WorldAware)this); WorldControl.class.$init$(this); InventoryAware.class.$init$((InventoryAware)this); InventoryControl.class.$init$(this); InventoryWorldControl.class.$init$(this); TankAware.class.$init$((TankAware)this); TankControl.class.$init$(this); TankWorldControl.class.$init$(this); Agent$class.$init$(this);
/*  29 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  30 */       .withComponent("robot")
/*  31 */       .withConnector(Settings$.MODULE$.get().bufferRobot())
/*  32 */       .create();
/*     */     
/*  34 */     this.romRobot = Option$.MODULE$.apply(FileSystem.asManagedEnvironment(
/*  35 */           FileSystem.fromClass(OpenComputers$.MODULE$.getClass(), Settings$.MODULE$.resourceDomain(), "lua/component/robot"), "robot")); } public ComponentConnector node() { return this.node; }
/*     */   public Option<ManagedEnvironment> romRobot() { return this.romRobot; }
/*  37 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  38 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "system");
/*  39 */         (new Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Robot");
/*  40 */         (new Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  41 */         (new Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Caterpillar");
/*  42 */         (new Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(agent().func_70302_i_()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  45 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   public ForgeDirection checkSideForAction(Arguments args, int n) {
/*  49 */     return agent().toGlobal(ExtendedArguments$.MODULE$.extendedArguments(args).checkSideForAction(n)); } public ForgeDirection checkSideForUse(Arguments args, int n) {
/*  50 */     return agent().toGlobal(ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(n));
/*     */   }
/*     */   public void onWorldInteraction(Context context, double duration) {
/*  53 */     Agent$class.onWorldInteraction(this, context, duration);
/*  54 */     agent().animateSwing(duration);
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():number -- Get the current color of the activity light as an integer encoded RGB value (0xRRGGBB).")
/*     */   public Object[] getLightColor(Context context, Arguments args) {
/*  60 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(agent().info().lightColor()) }));
/*     */   }
/*     */   @Callback(doc = "function(value:number):number -- Set the color of the activity light to the specified integer encoded RGB value (0xRRGGBB).")
/*     */   public Object[] setLightColor(Context context, Arguments args) {
/*  64 */     agent().setLightColor(args.checkInteger(0));
/*  65 */     context.pause(0.1D);
/*  66 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(agent().info().lightColor()) }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():number -- Get the durability of the currently equipped tool.")
/*     */   public Object[] durability(Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  73 */     Option option = Option$.MODULE$.apply(agent().equipmentInventory().func_70301_a(0));
/*  74 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; ItemStack item = (ItemStack)some.x();
/*  75 */       Option option1 = ToolDurabilityProviders$.MODULE$.getDurability(item);
/*  76 */       if (option1 instanceof Some) { Some some1 = (Some)option1; double durability = BoxesRunTime.unboxToDouble(some1.x()); arrayOfObject1 = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(durability) })); }
/*  77 */       else { arrayOfObject1 = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tool cannot be damaged" })); }
/*     */        arrayOfObject = arrayOfObject1; }
/*  79 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tool equipped" })); }
/*     */     
/*     */     return arrayOfObject;
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
/*     */   @Callback(doc = "function(direction:number):boolean -- Move in the specified direction.")
/*     */   public Object[] move(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   4: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*     */     //   7: aload_2
/*     */     //   8: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*     */     //   11: iconst_0
/*     */     //   12: invokevirtual checkSideForMovement : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   15: invokevirtual toGlobal : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   18: astore_3
/*     */     //   19: aload_0
/*     */     //   20: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   23: invokevirtual isAnimatingMove : ()Z
/*     */     //   26: ifeq -> 60
/*     */     //   29: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   32: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   35: iconst_2
/*     */     //   36: anewarray java/lang/Object
/*     */     //   39: dup
/*     */     //   40: iconst_0
/*     */     //   41: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   44: aastore
/*     */     //   45: dup
/*     */     //   46: iconst_1
/*     */     //   47: ldc_w 'already moving'
/*     */     //   50: aastore
/*     */     //   51: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   54: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   57: goto -> 398
/*     */     //   60: aload_0
/*     */     //   61: aload_3
/*     */     //   62: invokevirtual blockContent : (Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple2;
/*     */     //   65: astore #5
/*     */     //   67: aload #5
/*     */     //   69: ifnull -> 399
/*     */     //   72: aload #5
/*     */     //   74: invokevirtual _1$mcZ$sp : ()Z
/*     */     //   77: istore #6
/*     */     //   79: aload #5
/*     */     //   81: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   84: checkcast java/lang/String
/*     */     //   87: astore #7
/*     */     //   89: new scala/Tuple2
/*     */     //   92: dup
/*     */     //   93: iload #6
/*     */     //   95: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   98: aload #7
/*     */     //   100: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   103: astore #8
/*     */     //   105: aload #8
/*     */     //   107: astore #4
/*     */     //   109: aload #4
/*     */     //   111: invokevirtual _1$mcZ$sp : ()Z
/*     */     //   114: istore #9
/*     */     //   116: aload #4
/*     */     //   118: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   121: checkcast java/lang/String
/*     */     //   124: astore #10
/*     */     //   126: iload #9
/*     */     //   128: ifeq -> 203
/*     */     //   131: aload_1
/*     */     //   132: ldc2_w 0.4
/*     */     //   135: invokeinterface pause : (D)Z
/*     */     //   140: pop
/*     */     //   141: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*     */     //   144: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   147: aload_0
/*     */     //   148: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   151: invokevirtual apply : (Lli/cil/oc/api/network/EnvironmentHost;)Lli/cil/oc/util/BlockPosition;
/*     */     //   154: ldc_w 'crit'
/*     */     //   157: bipush #8
/*     */     //   159: ldc2_w 0.25
/*     */     //   162: new scala/Some
/*     */     //   165: dup
/*     */     //   166: aload_3
/*     */     //   167: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   170: invokevirtual sendParticleEffect : (Lli/cil/oc/util/BlockPosition;Ljava/lang/String;IDLscala/Option;)V
/*     */     //   173: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   176: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   179: iconst_2
/*     */     //   180: anewarray java/lang/Object
/*     */     //   183: dup
/*     */     //   184: iconst_0
/*     */     //   185: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   188: aastore
/*     */     //   189: dup
/*     */     //   190: iconst_1
/*     */     //   191: aload #10
/*     */     //   193: aastore
/*     */     //   194: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   197: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   200: goto -> 398
/*     */     //   203: aload_0
/*     */     //   204: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   207: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   210: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   213: invokevirtual robotMoveCost : ()D
/*     */     //   216: dneg
/*     */     //   217: invokeinterface tryChangeBuffer : (D)Z
/*     */     //   222: ifeq -> 370
/*     */     //   225: aload_0
/*     */     //   226: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   229: aload_3
/*     */     //   230: invokevirtual move : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   233: ifeq -> 278
/*     */     //   236: aload_1
/*     */     //   237: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   240: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   243: invokevirtual moveDelay : ()D
/*     */     //   246: invokeinterface pause : (D)Z
/*     */     //   251: pop
/*     */     //   252: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   255: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   258: iconst_1
/*     */     //   259: anewarray java/lang/Object
/*     */     //   262: dup
/*     */     //   263: iconst_0
/*     */     //   264: iconst_1
/*     */     //   265: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   268: aastore
/*     */     //   269: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   272: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   275: goto -> 398
/*     */     //   278: aload_0
/*     */     //   279: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   282: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   285: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   288: invokevirtual robotMoveCost : ()D
/*     */     //   291: invokeinterface changeBuffer : (D)D
/*     */     //   296: pop2
/*     */     //   297: aload_1
/*     */     //   298: ldc2_w 0.4
/*     */     //   301: invokeinterface pause : (D)Z
/*     */     //   306: pop
/*     */     //   307: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*     */     //   310: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   313: aload_0
/*     */     //   314: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   317: invokevirtual apply : (Lli/cil/oc/api/network/EnvironmentHost;)Lli/cil/oc/util/BlockPosition;
/*     */     //   320: ldc_w 'crit'
/*     */     //   323: bipush #8
/*     */     //   325: ldc2_w 0.25
/*     */     //   328: new scala/Some
/*     */     //   331: dup
/*     */     //   332: aload_3
/*     */     //   333: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   336: invokevirtual sendParticleEffect : (Lli/cil/oc/util/BlockPosition;Ljava/lang/String;IDLscala/Option;)V
/*     */     //   339: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   342: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   345: iconst_2
/*     */     //   346: anewarray java/lang/Object
/*     */     //   349: dup
/*     */     //   350: iconst_0
/*     */     //   351: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   354: aastore
/*     */     //   355: dup
/*     */     //   356: iconst_1
/*     */     //   357: ldc_w 'impossible move'
/*     */     //   360: aastore
/*     */     //   361: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   364: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   367: goto -> 398
/*     */     //   370: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   373: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   376: iconst_2
/*     */     //   377: anewarray java/lang/Object
/*     */     //   380: dup
/*     */     //   381: iconst_0
/*     */     //   382: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   385: aastore
/*     */     //   386: dup
/*     */     //   387: iconst_1
/*     */     //   388: ldc_w 'not enough energy'
/*     */     //   391: aastore
/*     */     //   392: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   395: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   398: areturn
/*     */     //   399: new scala/MatchError
/*     */     //   402: dup
/*     */     //   403: aload #5
/*     */     //   405: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   408: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 0
/*     */     //   #88	-> 19
/*     */     //   #91	-> 29
/*     */     //   #94	-> 60
/*     */     //   #95	-> 126
/*     */     //   #96	-> 131
/*     */     //   #97	-> 141
/*     */     //   #98	-> 173
/*     */     //   #101	-> 203
/*     */     //   #104	-> 225
/*     */     //   #105	-> 236
/*     */     //   #106	-> 252
/*     */     //   #109	-> 278
/*     */     //   #110	-> 297
/*     */     //   #111	-> 307
/*     */     //   #112	-> 339
/*     */     //   #102	-> 370
/*     */     //   #86	-> 398
/*     */     //   #94	-> 399
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	409	0	this	Lli/cil/oc/server/component/Robot;
/*     */     //   0	409	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	409	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   19	390	3	direction	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   79	330	6	something	Z
/*     */     //   89	320	7	what	Ljava/lang/String;
/*     */     //   116	293	9	something	Z
/*     */     //   126	283	10	what	Ljava/lang/String;
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
/*     */   @Callback(doc = "function(clockwise:boolean):boolean -- Rotate in the specified direction.")
/*     */   public Object[] turn(Context context, Arguments args) {
/* 120 */     boolean clockwise = args.checkBoolean(0);
/*     */     
/* 122 */     clockwise ? agent().rotate(ForgeDirection.UP) : 
/* 123 */       agent().rotate(ForgeDirection.DOWN);
/* 124 */     agent().animateTurn(clockwise, Settings$.MODULE$.get().turnDelay());
/* 125 */     context.pause(Settings$.MODULE$.get().turnDelay());
/* 126 */     return node().tryChangeBuffer(-Settings$.MODULE$.get().robotTurnCost()) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*     */ 
/*     */           
/* 129 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node)
/*     */   {
/* 136 */     super.onConnect(node);
/* 137 */     ComponentConnector componentConnector = node(); if (node == null) { if (componentConnector != null) return;  } else { if (node.equals(componentConnector))
/* 138 */       { romRobot().foreach((Function1)new Robot$$anonfun$onConnect$1(this, node)); return; }  return; }  romRobot().foreach((Function1)new Robot$$anonfun$onConnect$1(this, node)); } public final class Robot$$anonfun$onConnect$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$1; public Robot$$anonfun$onConnect$1(Robot $outer, Node node$1) {} public final void apply(ManagedEnvironment fs) {
/* 139 */       ((Component)fs.node()).setVisibility(Visibility.Network);
/* 140 */       this.node$1.connect(fs.node());
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'network.message'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 193
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 193
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   44: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*     */     //   47: astore_3
/*     */     //   48: dup
/*     */     //   49: ifnonnull -> 60
/*     */     //   52: pop
/*     */     //   53: aload_3
/*     */     //   54: ifnull -> 193
/*     */     //   57: goto -> 67
/*     */     //   60: aload_3
/*     */     //   61: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   64: ifne -> 193
/*     */     //   67: aload_1
/*     */     //   68: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   73: astore #4
/*     */     //   75: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   78: aload #4
/*     */     //   80: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   83: astore #5
/*     */     //   85: aload #5
/*     */     //   87: invokevirtual isEmpty : ()Z
/*     */     //   90: ifne -> 188
/*     */     //   93: aload #5
/*     */     //   95: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   98: ifnull -> 188
/*     */     //   101: aload #5
/*     */     //   103: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   106: checkcast scala/collection/SeqLike
/*     */     //   109: iconst_1
/*     */     //   110: invokeinterface lengthCompare : (I)I
/*     */     //   115: iconst_0
/*     */     //   116: if_icmpne -> 188
/*     */     //   119: aload #5
/*     */     //   121: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   124: checkcast scala/collection/SeqLike
/*     */     //   127: iconst_0
/*     */     //   128: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   133: astore #6
/*     */     //   135: aload #6
/*     */     //   137: instanceof li/cil/oc/api/network/Packet
/*     */     //   140: ifeq -> 188
/*     */     //   143: aload #6
/*     */     //   145: checkcast li/cil/oc/api/network/Packet
/*     */     //   148: astore #7
/*     */     //   150: aload_0
/*     */     //   151: invokevirtual agent : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   154: invokevirtual proxy : ()Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   157: invokevirtual node : ()Lli/cil/oc/api/network/Component;
/*     */     //   160: aload_1
/*     */     //   161: invokeinterface name : ()Ljava/lang/String;
/*     */     //   166: iconst_1
/*     */     //   167: anewarray java/lang/Object
/*     */     //   170: dup
/*     */     //   171: iconst_0
/*     */     //   172: aload #7
/*     */     //   174: aastore
/*     */     //   175: invokeinterface sendToReachable : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   180: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   183: astore #8
/*     */     //   185: goto -> 193
/*     */     //   188: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   191: astore #8
/*     */     //   193: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 0
/*     */     //   #147	-> 5
/*     */     //   #148	-> 75
/*     */     //   #149	-> 188
/*     */     //   #145	-> 193
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	194	0	this	Lli/cil/oc/server/component/Robot;
/*     */     //   0	194	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   135	59	6	packet	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt)
/*     */   {
/* 156 */     super.load(nbt);
/* 157 */     romRobot().foreach((Function1)new Robot$$anonfun$load$1(this, nbt)); } public final class Robot$$anonfun$load$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(ManagedEnvironment x$2) { x$2.load(this.nbt$1.func_74775_l("romRobot")); }
/*     */     
/*     */     public Robot$$anonfun$load$1(Robot $outer, NBTTagCompound nbt$1) {} }
/*     */   
/* 161 */   public void save(NBTTagCompound nbt) { super.save(nbt);
/* 162 */     romRobot().foreach((Function1)new Robot$$anonfun$save$1(this, nbt)); } public final class Robot$$anonfun$save$1 extends AbstractFunction1<ManagedEnvironment, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final NBTTagCompound apply(ManagedEnvironment fs) { return ExtendedNBT$.MODULE$.extendNBTTagCompound(this.nbt$2).setNewCompoundTag("romRobot", (Function1)new Robot$$anonfun$save$1$$anonfun$apply$1(this, fs)); } public Robot$$anonfun$save$1(Robot $outer, NBTTagCompound nbt$2) {} public final class Robot$$anonfun$save$1$$anonfun$apply$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ManagedEnvironment fs$1; public final void apply(NBTTagCompound x$1) { this.fs$1.save(x$1); }
/*     */ 
/*     */       
/*     */       public Robot$$anonfun$save$1$$anonfun$apply$1(Robot$$anonfun$save$1 $outer, ManagedEnvironment fs$1) {} }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Robot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */