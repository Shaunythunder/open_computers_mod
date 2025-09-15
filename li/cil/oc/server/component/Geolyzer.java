/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import java.util.Map;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.event.GeolyzerEvent;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.common.entity.Drone;
/*     */ import li.cil.oc.common.item.TabletWrapper;
/*     */ import li.cil.oc.common.tileentity.Microcontroller;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import li.cil.oc.server.component.traits.WorldAware;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import li.cil.oc.util.ExtendedArguments$;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple7;
/*     */ import scala.Unit$;
/*     */ import scala.collection.Map;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Mf\001B\001\003\0015\021\001bR3pYfTXM\035\006\003\007\021\t\021bY8na>tWM\034;\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0279A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032\005\0051AO]1jiNL!a\007\r\003\031]{'\017\0343D_:$(o\0347\021\005u\001S\"\001\020\013\005}\021\022A\0023sSZ,'/\003\002\"=\tQA)\032<jG\026LeNZ8\t\021\r\002!Q1A\005\002\021\nA\001[8tiV\tQ\005\005\002'S5\tqE\003\002)%\0059a.\032;x_J\\\027B\001\026(\005=)eN^5s_:lWM\034;I_N$\b\002\003\027\001\005\003\005\013\021B\023\002\013!|7\017\036\021\t\0139\002A\021A\030\002\rqJg.\033;?)\t\001$\007\005\0022\0015\t!\001C\003$[\001\007Q\005C\0045\001\t\007I\021I\033\002\t9|G-Z\013\002mA\021aeN\005\003q\035\022!cQ8na>tWM\034;D_:tWm\031;pe\"1!\b\001Q\001\nY\nQA\\8eK\002B\001\002\020\001\t\006\004%i!P\001\013I\0264\030nY3J]\032|W#\001 \021\t}2\005\nS\007\002\001*\021\021IQ\001\nS6lW\017^1cY\026T!a\021#\002\025\r|G\016\\3di&|gNC\001F\003\025\0318-\0317b\023\t9\005IA\002NCB\004\"!\023(\016\003)S!a\023'\002\t1\fgn\032\006\002\033\006!!.\031<b\023\ty%J\001\004TiJLgn\032\005\t#\002A\t\021)Q\007}\005YA-\032<jG\026LeNZ8!\021\025\031\006\001\"\021U\00359W\r\036#fm&\034W-\0238g_R\tQ\013\005\003W3jSV\"A,\013\005ac\025\001B;uS2L!aR,\021\005m{fB\001/^\033\005!\025B\0010E\003\031\001&/\0323fM&\021q\n\031\006\003=\022CQA\031\001\005R\r\f!c\0315fG.\034\026\016Z3G_J\f5\r^5p]R\031Am\\<\021\005\025lW\"\0014\013\005a;'B\0015j\003\031\031w.\\7p]*\021!n[\001\017[&tWm\031:bMR4wN]4f\025\005a\027a\0018fi&\021aN\032\002\017\r>\024x-\032#je\026\034G/[8o\021\025\001\030\r1\001r\003\021\t'oZ:\021\005I,X\"A:\013\005Q\024\022aB7bG\"Lg.Z\005\003mN\024\021\"\021:hk6,g\016^:\t\013a\f\007\031A=\002\0039\004\"\001\030>\n\005m$%aA%oi\")Q\020\001C!}\006A\001o\\:ji&|g.F\001\000!\021\t\t!!\002\016\005\005\r!B\001-\007\023\021\t9!a\001\003\033\tcwnY6Q_NLG/[8o\021\035\tY\001\001C\005\003\033\t\021bY1o'\026,7k[=\026\005\005=\001c\001/\002\022%\031\0211\003#\003\017\t{w\016\\3b]\"9\0211\002\001\005\002\005]ACBA\r\003K\ty\003E\003]\0037\ty\"C\002\002\036\021\023Q!\021:sCf\0042\001XA\021\023\r\t\031\003\022\002\007\003:L(+\0324\t\021\005\035\022Q\003a\001\003S\t\001bY8naV$XM\035\t\004e\006-\022bAA\027g\n91i\0348uKb$\bB\0029\002\026\001\007\021\017\013\005\002\026\005M\022\021HA\036!\r\021\030QG\005\004\003o\031(\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002>\005yf-\0368di&|g\016K\025;E>|G.Z1oA5j\003EU3ukJt7\017I<iKRDWM\035\021uQ\026\024X\rI5tA\005\0043\r\\3be\002b\027N\\3!_\032\0043/[4ii\002\"x\016\t;iK\002\0328.\037\021eSJ,7\r\0367zA\005\024wN^3/\021\035\t\t\005\001C\001\003\007\nA\"[:Tk:4\026n]5cY\026$b!!\007\002F\005\035\003\002CA\024\003\001\r!!\013\t\rA\fy\0041\001rQ!\ty$a\r\002:\005-\023EAA'\003E3WO\\2uS>t\007&\013\036c_>dW-\0318![5\002#+\032;ve:\004s\017[3uQ\026\024\b\005\0365fAM,h\016I5tA\r,(O]3oi2L\bE^5tS\ndW\r\t3je\026\034G\017\\=!C\n|g/\032\030\t\017\005E\003\001\"\001\002T\005!1oY1o)\031\tI\"!\026\002X!A\021qEA(\001\004\tI\003\003\004q\003\037\002\r!\035\025\t\003\037\n\031$!\017\002\\\005\022\021QL\001\002\n\032,hn\031;j_:D\003P\0178v[\n,'\017\f\021{u9,XNY3s72\002\023P\0178v[\n,'\017\f\021xu9,XNY3sY\001\"'H\\;nE\026\024H\006\t5;]Vl'-\032:^72\002\023n\0328pe\026\024V\r\0357bG\026\f'\r\\3;E>|G.Z1oy>\004H/[8ogj\"\030M\0317f;&RD/\0312mK\002jS\006I!oC2L(0Z:!i\",\007\005Z3og&$\030\020I8gAQDW\rI2pYVlg\016I1uAQDW\rI:qK\016Lg-[3eAI,G.\031;jm\026\0043m\\8sI&t\027\r^3t]!9\021\021\r\001\005\n\005\r\024aC4fiN\033\027M\\!sON$B!!\032\002lAQA,a\032zsfL\0300_=\n\007\005%DI\001\004UkBdWm\016\005\007a\006}\003\031A9\t\017\005=\004\001\"\001\002r\0059\021M\\1msj,GCBA\r\003g\n)\b\003\005\002(\0055\004\031AA\025\021\031\001\030Q\016a\001c\"B\021QNA\032\003s\tI(\t\002\002|\005\tg-\0368di&|g\016K:jI\026Td.^7cKJ\\Ff\0349uS>t7O\017;bE2,W,\013\036uC\ndW\rI\027.A\035+G\017I:p[\026\004\023N\0344pe6\fG/[8oA=t\007%\031\021eSJ,7\r\0367zA\005$'.Y2f]R\004#\r\\8dW:Bq!a \001\t\003\t\t)A\003ti>\024X\r\006\004\002\032\005\r\025Q\021\005\t\003O\ti\b1\001\002*!1\001/! A\002ED\003\"! \0024\005e\022\021R\021\003\003\027\013\021\021\t4v]\016$\030n\0348)g&$WM\0178v[\n,'\017\f\021eE\006#GM]3tgj\032HO]5oO2\002CMY*m_RTd.^7cKJL#HY8pY\026\fg\016I\027.AM#xN]3!C:\004\023\016^3nAM$\030mY6!e\026\004(/Z:f]R\fG/[8oA=4\007\005\0365fA\tdwnY6!_:\004C\017[3!gB,7-\0334jK\022\0043/\0333fA%t\007%\031\021eCR\f'-Y:fA\r|W\016]8oK:$h\006C\004\002\020\002!\t!!%\002+M\034\027M\\+oI\026\024xM]8v]\0224E.^5egR1\021\021DAJ\003+C\001\"a\n\002\016\002\007\021\021\006\005\007a\0065\005\031A9)\021\0055\0251GA\035\0033\013#!a'\002\007\032,hn\031;j_:D\023F\017;bE2,\007%L\027!%\026$XO\0358tA\035\023Xm\032+fG\"\004SO\0343fe\036\024x.\0368eA\031dW/\0333tA%tgm\034:nCRLwN\034\005\b\003?\003A\021IAQ\003%yg.T3tg\006<W\r\006\003\002$\006%\006c\001/\002&&\031\021q\025#\003\tUs\027\016\036\005\t\003W\013i\n1\001\002.\0069Q.Z:tC\036,\007c\001\024\0020&\031\021\021W\024\003\0175+7o]1hK\002")
/*     */ public class Geolyzer extends ManagedEnvironment implements WorldControl, DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   private final ComponentConnector node;
/*     */   
/*     */   @Callback(doc = "function(side:number):boolean, string -- Checks the contents of the block on the specified sides and returns the findings.")
/*  41 */   public Object[] detect(Context context, Arguments args) { return WorldControl.class.detect(this, context, args); } private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public World world() { return WorldAware.class.world((WorldAware)this); } public EntityPlayer fakePlayer() { return WorldAware.class.fakePlayer((WorldAware)this); } public boolean mayInteract(BlockPosition blockPos, ForgeDirection face) { return WorldAware.class.mayInteract((WorldAware)this, blockPos, face); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB bounds, ClassTag evidence$1) { return WorldAware.class.entitiesInBounds((WorldAware)this, bounds, evidence$1); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$2) { return WorldAware.class.entitiesInBlock((WorldAware)this, blockPos, evidence$2); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag evidence$3) { return WorldAware.class.entitiesOnSide((WorldAware)this, side, evidence$3); } public <Type extends net.minecraft.entity.Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$4) { return WorldAware.class.closestEntity((WorldAware)this, side, evidence$4); } public Tuple2<Object, String> blockContent(ForgeDirection side) { return WorldAware.class.blockContent((WorldAware)this, side); } public EnvironmentHost host() { return this.host; } public Geolyzer(EnvironmentHost host) { WorldAware.class.$init$((WorldAware)this); WorldControl.class.$init$(this);
/*  42 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  43 */       .withComponent("geolyzer")
/*  44 */       .withConnector()
/*  45 */       .create(); }
/*     */   public ComponentConnector node() { return this.node; }
/*  47 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  48 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  49 */         (new Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Geolyzer");
/*  50 */         (new Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  51 */         (new Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Terrain Analyzer MkII");
/*  52 */         (new Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(Settings$.MODULE$.get().geolyzerRange()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  55 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   public ForgeDirection checkSideForAction(Arguments args, int n)
/*     */   {
/*  60 */     ForgeDirection forgeDirection1, side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(n);
/*  61 */     boolean is_uc = host() instanceof Microcontroller;
/*  62 */     EnvironmentHost environmentHost = host();
/*  63 */     if (environmentHost instanceof Robot) { Robot robot = (Robot)environmentHost; forgeDirection1 = robot.proxy().toGlobal(side); }
/*  64 */     else if (environmentHost instanceof Drone) { Drone drone = (Drone)environmentHost; forgeDirection1 = drone.toGlobal(side); }
/*  65 */     else if (environmentHost instanceof Microcontroller) { Microcontroller microcontroller = (Microcontroller)environmentHost; forgeDirection1 = microcontroller.toLocal(side); }
/*  66 */     else if (environmentHost instanceof TabletWrapper) { TabletWrapper tabletWrapper = (TabletWrapper)environmentHost; forgeDirection1 = tabletWrapper.toGlobal(side); }
/*  67 */     else { forgeDirection1 = side; }
/*     */     
/*     */     return forgeDirection1; } public BlockPosition position() {
/*     */     BlockPosition blockPosition;
/*  71 */     EnvironmentHost environmentHost = host();
/*  72 */     if (environmentHost instanceof Robot) { Robot robot = (Robot)environmentHost; blockPosition = robot.proxy().position(); }
/*  73 */     else if (environmentHost instanceof Drone) { Drone drone = (Drone)environmentHost; blockPosition = BlockPosition$.MODULE$.apply(drone.field_70165_t, drone.field_70163_u, drone.field_70161_v, drone.world()); }
/*  74 */     else if (environmentHost instanceof Microcontroller) { Microcontroller microcontroller = (Microcontroller)environmentHost; blockPosition = microcontroller.position(); }
/*  75 */     else if (environmentHost instanceof TabletWrapper) { TabletWrapper tabletWrapper = (TabletWrapper)environmentHost; blockPosition = BlockPosition$.MODULE$.apply(tabletWrapper.xPosition(), tabletWrapper.yPosition(), tabletWrapper.zPosition(), tabletWrapper.world()); }
/*  76 */     else { blockPosition = BlockPosition$.MODULE$.apply(host()); }
/*     */     
/*     */     return blockPosition;
/*     */   } private boolean canSeeSky() {
/*  80 */     BlockPosition blockPos = position().offset(ForgeDirection.UP);
/*  81 */     return (!(host().world()).field_73011_w.field_76576_e && host().world().func_72937_j(blockPos.x(), blockPos.y(), blockPos.z()));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():boolean -- Returns whether there is a clear line of sight to the sky directly above.")
/*     */   public Object[] canSeeSky(Context computer, Arguments args) {
/*  86 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(canSeeSky()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():boolean -- Return whether the sun is currently visible directly above.")
/*     */   public Object[] isSunVisible(Context computer, Arguments args) {
/*  91 */     BlockPosition blockPos = BlockPosition$.MODULE$.apply(host()).offset(ForgeDirection.UP);
/*  92 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] {
/*     */             
/*  94 */             BoxesRunTime.boxToBoolean((host().world().func_72935_r() && canSeeSky() && (
/*  95 */               host().world().func_72959_q().func_76935_a(blockPos.x(), blockPos.z()) instanceof net.minecraft.world.biome.BiomeGenDesert || (!host().world().func_72896_J() && !host().world().func_72911_I())))) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(x:number, z:number[, y:number, w:number, d:number, h:number][, ignoreReplaceable:boolean|options:table]):table -- Analyzes the density of the column at the specified relative coordinates.")
/*     */   public Object[] scan(Context computer, Arguments args) {
/* 100 */     Tuple7<Object, Object, Object, Object, Object, Object, Object> tuple7 = getScanArgs(args); if (tuple7 != null) { int minX = BoxesRunTime.unboxToInt(tuple7._1()), minY = BoxesRunTime.unboxToInt(tuple7._2()), minZ = BoxesRunTime.unboxToInt(tuple7._3()), maxX = BoxesRunTime.unboxToInt(tuple7._4()), maxY = BoxesRunTime.unboxToInt(tuple7._5()), maxZ = BoxesRunTime.unboxToInt(tuple7._6()), optIndex = BoxesRunTime.unboxToInt(tuple7._7()); Tuple7 tuple72 = new Tuple7(BoxesRunTime.boxToInteger(minX), BoxesRunTime.boxToInteger(minY), BoxesRunTime.boxToInteger(minZ), BoxesRunTime.boxToInteger(maxX), BoxesRunTime.boxToInteger(maxY), BoxesRunTime.boxToInteger(maxZ), BoxesRunTime.boxToInteger(optIndex)), tuple71 = tuple72; int i = BoxesRunTime.unboxToInt(tuple71._1()), j = BoxesRunTime.unboxToInt(tuple71._2()), k = BoxesRunTime.unboxToInt(tuple71._3()), m = BoxesRunTime.unboxToInt(tuple71._4()), n = BoxesRunTime.unboxToInt(tuple71._5()), i1 = BoxesRunTime.unboxToInt(tuple71._6()), i2 = BoxesRunTime.unboxToInt(tuple71._7());
/* 101 */       int volume = (m - i + 1) * (i1 - k + 1) * (n - j + 1);
/* 102 */       if (volume > 64) throw new IllegalArgumentException("volume too large (maximum is 64)"); 
/* 103 */       (new Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("includeReplaceable"), BoxesRunTime.boxToBoolean(!args.checkBoolean(i2))); Map options = args.isBoolean(i2) ? WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1]))) : args.optTable(i2, WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().empty()));
/* 104 */       if (package$.MODULE$.abs(i) > Settings$.MODULE$.get().geolyzerRange() || package$.MODULE$.abs(m) > Settings$.MODULE$.get().geolyzerRange() || 
/* 105 */         package$.MODULE$.abs(j) > Settings$.MODULE$.get().geolyzerRange() || package$.MODULE$.abs(n) > Settings$.MODULE$.get().geolyzerRange() || 
/* 106 */         package$.MODULE$.abs(k) > Settings$.MODULE$.get().geolyzerRange() || package$.MODULE$.abs(i1) > Settings$.MODULE$.get().geolyzerRange()) {
/* 107 */         throw new IllegalArgumentException("location out of bounds");
/*     */       }
/*     */       
/* 110 */       if (node().tryChangeBuffer(-Settings$.MODULE$.get().geolyzerScanCost())) {
/*     */ 
/*     */         
/* 113 */         GeolyzerEvent.Scan event = new GeolyzerEvent.Scan(host(), options, i, j, k, m, n, i1);
/* 114 */         MinecraftForge.EVENT_BUS.post((Event)event);
/* 115 */         return event.isCanceled() ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "scan was canceled"
/* 116 */               })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { event.data }));
/*     */       } 
/*     */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" })); }
/*     */     
/* 120 */     throw new MatchError(tuple7); } private Tuple7<Object, Object, Object, Object, Object, Object, Object> getScanArgs(Arguments args) { int minX = args.checkInteger(0);
/* 121 */     int minZ = args.checkInteger(1);
/* 122 */     if (args.isInteger(2) && args.isInteger(3) && args.isInteger(4) && args.isInteger(5)) {
/* 123 */       int minY = args.checkInteger(2);
/* 124 */       int w = args.checkInteger(3);
/* 125 */       int d = args.checkInteger(4);
/* 126 */       int h = args.checkInteger(5);
/* 127 */       int maxX = minX + w - 1;
/* 128 */       int maxY = minY + h - 1;
/* 129 */       int maxZ = minZ + d - 1;
/*     */     } else {
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 136 */     return new Tuple7(BoxesRunTime.boxToInteger(minX), BoxesRunTime.boxToInteger(-32), BoxesRunTime.boxToInteger(minZ), BoxesRunTime.boxToInteger(minX), BoxesRunTime.boxToInteger(31), BoxesRunTime.boxToInteger(minZ), BoxesRunTime.boxToInteger(2)); }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(side:number[,options:table]):table -- Get some information on a directly adjacent block.")
/*     */   public Object[] analyze(Context computer, Arguments args) {
/* 141 */     if (Settings$.MODULE$.get().allowItemStackInspection())
/* 142 */     { ForgeDirection forgeDirection1, side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 143 */       EnvironmentHost environmentHost = host();
/* 144 */       if (environmentHost instanceof Rotatable) { EnvironmentHost environmentHost1 = environmentHost; forgeDirection1 = ((Rotatable)environmentHost1).toGlobal(side); }
/* 145 */       else { forgeDirection1 = side; }
/*     */        ForgeDirection globalSide = forgeDirection1;
/* 147 */       Map options = args.optTable(1, WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().empty()));
/*     */       
/* 149 */       if (node().tryChangeBuffer(-Settings$.MODULE$.get().geolyzerScanCost()))
/*     */       
/*     */       { 
/* 152 */         BlockPosition globalPos = BlockPosition$.MODULE$.apply(host()).offset(globalSide);
/* 153 */         GeolyzerEvent.Analyze event = new GeolyzerEvent.Analyze(host(), options, globalPos.x(), globalPos.y(), globalPos.z());
/* 154 */         MinecraftForge.EVENT_BUS.post((Event)event); }
/*     */       else { return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" })); }
/*     */        }
/*     */     else {  }
/* 158 */      return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number, dbAddress:string, dbSlot:number):boolean -- Store an item stack representation of the block on the specified side in a database component.")
/* 162 */   public Object[] store(Context computer, Arguments args) { ForgeDirection forgeDirection1, side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 163 */     EnvironmentHost environmentHost = host();
/* 164 */     if (environmentHost instanceof Rotatable) { EnvironmentHost environmentHost1 = environmentHost; forgeDirection1 = ((Rotatable)environmentHost1).toGlobal(side); }
/* 165 */     else { forgeDirection1 = side; }
/*     */     
/*     */     ForgeDirection globalSide = forgeDirection1;
/* 168 */     if (node().tryChangeBuffer(-Settings$.MODULE$.get().geolyzerScanCost())) {
/*     */ 
/*     */       
/* 171 */       BlockPosition blockPos = BlockPosition$.MODULE$.apply(host()).offset(globalSide);
/* 172 */       Block block = ExtendedWorld$.MODULE$.extendedWorld(host().world()).getBlock(blockPos);
/* 173 */       Item item = Item.func_150898_a(block);
/*     */ 
/*     */       
/* 176 */       int metadata = ExtendedWorld$.MODULE$.extendedWorld(host().world()).getBlockMetadata(blockPos);
/* 177 */       int damage = block.func_149692_a(metadata);
/* 178 */       ItemStack stack = new ItemStack(item, 1, damage);
/* 179 */       return (item == null) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "block has no registered item representation" })) : DatabaseAccess$.MODULE$.withDatabase((Node)node(), args.checkString(1), (Function1)new Geolyzer$$anonfun$store$1(this, args, stack));
/* 180 */     }  return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" })); } public final class Geolyzer$$anonfun$store$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$1; private final ItemStack stack$1; public Geolyzer$$anonfun$store$1(Geolyzer $outer, Arguments args$1, ItemStack stack$1) {} public final Object[] apply(UpgradeDatabase database) { int toSlot = ExtendedArguments$.MODULE$.extendedArguments(this.args$1).checkSlot(database.data(), 2);
/* 181 */       boolean nonEmpty = !(database.getStackInSlot(toSlot) == null);
/* 182 */       database.setStackInSlot(toSlot, this.stack$1);
/* 183 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(nonEmpty) })); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():table -- Returns GregTech underground fluids information")
/*     */   public Object[] scanUndergroundFluids(Context computer, Arguments args) {
/* 189 */     BlockPosition blockPos = BlockPosition$.MODULE$.apply(host());
/* 190 */     FluidStack fluid = UndergroundOil.undergroundOilReadInformation(new Chunk(host().world(), blockPos.x() >> 4, blockPos.z() >> 4));
/* 191 */     (new Tuple2[2])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("type"), fluid.getLocalizedName()); (new Tuple2[2])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("quantity"), BoxesRunTime.boxToInteger(fluid.amount)); return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2])) }));
/*     */   }
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'tablet.use'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 526
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 526
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   40: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: instanceof li/cil/oc/api/machine/Machine
/*     */     //   50: ifeq -> 521
/*     */     //   53: aload_3
/*     */     //   54: checkcast li/cil/oc/api/machine/Machine
/*     */     //   57: astore #4
/*     */     //   59: new scala/Tuple2
/*     */     //   62: dup
/*     */     //   63: aload #4
/*     */     //   65: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*     */     //   70: aload_1
/*     */     //   71: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   76: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   79: astore #6
/*     */     //   81: aload #6
/*     */     //   83: ifnull -> 508
/*     */     //   86: aload #6
/*     */     //   88: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   91: checkcast li/cil/oc/api/machine/MachineHost
/*     */     //   94: astore #7
/*     */     //   96: aload #6
/*     */     //   98: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   101: checkcast [Ljava/lang/Object;
/*     */     //   104: astore #8
/*     */     //   106: aload #7
/*     */     //   108: instanceof li/cil/oc/api/internal/Tablet
/*     */     //   111: ifeq -> 508
/*     */     //   114: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   117: aload #8
/*     */     //   119: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   122: astore #9
/*     */     //   124: aload #9
/*     */     //   126: invokevirtual isEmpty : ()Z
/*     */     //   129: ifne -> 508
/*     */     //   132: aload #9
/*     */     //   134: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   137: ifnull -> 508
/*     */     //   140: aload #9
/*     */     //   142: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   145: checkcast scala/collection/SeqLike
/*     */     //   148: bipush #8
/*     */     //   150: invokeinterface lengthCompare : (I)I
/*     */     //   155: iconst_0
/*     */     //   156: if_icmpne -> 508
/*     */     //   159: aload #9
/*     */     //   161: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   164: checkcast scala/collection/SeqLike
/*     */     //   167: iconst_0
/*     */     //   168: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   173: astore #10
/*     */     //   175: aload #9
/*     */     //   177: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   180: checkcast scala/collection/SeqLike
/*     */     //   183: iconst_1
/*     */     //   184: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   189: astore #11
/*     */     //   191: aload #9
/*     */     //   193: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   196: checkcast scala/collection/SeqLike
/*     */     //   199: iconst_2
/*     */     //   200: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   205: astore #12
/*     */     //   207: aload #9
/*     */     //   209: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   212: checkcast scala/collection/SeqLike
/*     */     //   215: iconst_3
/*     */     //   216: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   221: astore #13
/*     */     //   223: aload #9
/*     */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   228: checkcast scala/collection/SeqLike
/*     */     //   231: iconst_4
/*     */     //   232: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   237: astore #14
/*     */     //   239: aload #9
/*     */     //   241: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   244: checkcast scala/collection/SeqLike
/*     */     //   247: iconst_5
/*     */     //   248: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   253: astore #15
/*     */     //   255: aload #9
/*     */     //   257: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   260: checkcast scala/collection/SeqLike
/*     */     //   263: bipush #6
/*     */     //   265: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   270: astore #16
/*     */     //   272: aload #9
/*     */     //   274: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   277: checkcast scala/collection/SeqLike
/*     */     //   280: bipush #7
/*     */     //   282: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   287: astore #17
/*     */     //   289: aload #10
/*     */     //   291: instanceof net/minecraft/nbt/NBTTagCompound
/*     */     //   294: ifeq -> 508
/*     */     //   297: aload #10
/*     */     //   299: checkcast net/minecraft/nbt/NBTTagCompound
/*     */     //   302: astore #18
/*     */     //   304: aload #11
/*     */     //   306: instanceof net/minecraft/item/ItemStack
/*     */     //   309: ifeq -> 508
/*     */     //   312: aload #12
/*     */     //   314: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   317: ifeq -> 508
/*     */     //   320: aload #13
/*     */     //   322: instanceof li/cil/oc/util/BlockPosition
/*     */     //   325: ifeq -> 508
/*     */     //   328: aload #13
/*     */     //   330: checkcast li/cil/oc/util/BlockPosition
/*     */     //   333: astore #19
/*     */     //   335: aload #14
/*     */     //   337: instanceof net/minecraftforge/common/util/ForgeDirection
/*     */     //   340: ifeq -> 508
/*     */     //   343: aload #15
/*     */     //   345: instanceof java/lang/Float
/*     */     //   348: ifeq -> 508
/*     */     //   351: aload #16
/*     */     //   353: instanceof java/lang/Float
/*     */     //   356: ifeq -> 508
/*     */     //   359: aload #17
/*     */     //   361: instanceof java/lang/Float
/*     */     //   364: ifeq -> 508
/*     */     //   367: aload_0
/*     */     //   368: invokevirtual node : ()Lli/cil/oc/api/network/ComponentConnector;
/*     */     //   371: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   374: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   377: invokevirtual geolyzerScanCost : ()D
/*     */     //   380: dneg
/*     */     //   381: invokeinterface tryChangeBuffer : (D)Z
/*     */     //   386: ifeq -> 500
/*     */     //   389: new li/cil/oc/api/event/GeolyzerEvent$Analyze
/*     */     //   392: dup
/*     */     //   393: aload_0
/*     */     //   394: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   397: getstatic scala/collection/convert/WrapAsJava$.MODULE$ : Lscala/collection/convert/WrapAsJava$;
/*     */     //   400: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   403: invokevirtual Map : ()Lscala/collection/immutable/Map$;
/*     */     //   406: invokevirtual empty : ()Lscala/collection/immutable/Map;
/*     */     //   409: invokevirtual mapAsJavaMap : (Lscala/collection/Map;)Ljava/util/Map;
/*     */     //   412: aload #19
/*     */     //   414: invokevirtual x : ()I
/*     */     //   417: aload #19
/*     */     //   419: invokevirtual y : ()I
/*     */     //   422: aload #19
/*     */     //   424: invokevirtual z : ()I
/*     */     //   427: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;Ljava/util/Map;III)V
/*     */     //   430: astore #21
/*     */     //   432: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   435: aload #21
/*     */     //   437: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */     //   440: pop
/*     */     //   441: aload #21
/*     */     //   443: invokevirtual isCanceled : ()Z
/*     */     //   446: ifeq -> 455
/*     */     //   449: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   452: goto -> 503
/*     */     //   455: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   458: aload #21
/*     */     //   460: getfield data : Ljava/util/Map;
/*     */     //   463: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   466: new li/cil/oc/server/component/Geolyzer$$anonfun$onMessage$1
/*     */     //   469: dup
/*     */     //   470: aload_0
/*     */     //   471: invokespecial <init> : (Lli/cil/oc/server/component/Geolyzer;)V
/*     */     //   474: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   479: new li/cil/oc/server/component/Geolyzer$$anonfun$onMessage$2
/*     */     //   482: dup
/*     */     //   483: aload_0
/*     */     //   484: aload #18
/*     */     //   486: invokespecial <init> : (Lli/cil/oc/server/component/Geolyzer;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   489: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   494: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   497: goto -> 503
/*     */     //   500: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   503: astore #20
/*     */     //   505: goto -> 513
/*     */     //   508: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   511: astore #20
/*     */     //   513: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   516: astore #5
/*     */     //   518: goto -> 526
/*     */     //   521: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   524: astore #5
/*     */     //   526: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #195	-> 0
/*     */     //   #196	-> 5
/*     */     //   #197	-> 46
/*     */     //   #198	-> 86
/*     */     //   #199	-> 367
/*     */     //   #200	-> 389
/*     */     //   #201	-> 432
/*     */     //   #202	-> 441
/*     */     //   #203	-> 455
/*     */     //   #199	-> 500
/*     */     //   #210	-> 508
/*     */     //   #197	-> 513
/*     */     //   #212	-> 521
/*     */     //   #194	-> 526
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	527	0	this	Lli/cil/oc/server/component/Geolyzer;
/*     */     //   0	527	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   96	431	7	tablet	Lli/cil/oc/api/machine/MachineHost;
/*     */     //   175	352	10	nbt	Ljava/lang/Object;
/*     */     //   191	336	11	stack	Ljava/lang/Object;
/*     */     //   207	320	12	player	Ljava/lang/Object;
/*     */     //   223	304	13	blockPos	Ljava/lang/Object;
/*     */     //   239	288	14	side	Ljava/lang/Object;
/*     */     //   255	272	15	hitX	Ljava/lang/Object;
/*     */     //   272	255	16	hitY	Ljava/lang/Object;
/*     */     //   289	238	17	hitZ	Ljava/lang/Object;
/*     */     //   432	95	21	event	Lli/cil/oc/api/event/GeolyzerEvent$Analyze;
/*     */   }
/*     */   
/*     */   public final class Geolyzer$$anonfun$onMessage$1 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*     */       boolean bool;
/* 203 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool;
/*     */     }
/*     */     
/*     */     public Geolyzer$$anonfun$onMessage$1(Geolyzer $outer) {}
/*     */   }
/*     */   
/*     */   public final class Geolyzer$$anonfun$onMessage$2 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NBTTagCompound x5$1;
/*     */     
/*     */     public final void apply(Tuple2 x$2) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 112
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast java/lang/String
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   18: astore #4
/*     */       //   20: aload #4
/*     */       //   22: astore #6
/*     */       //   24: aload #6
/*     */       //   26: instanceof java/lang/Number
/*     */       //   29: ifeq -> 60
/*     */       //   32: aload #6
/*     */       //   34: checkcast java/lang/Number
/*     */       //   37: astore #7
/*     */       //   39: aload_0
/*     */       //   40: getfield x5$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   43: aload_3
/*     */       //   44: aload #7
/*     */       //   46: invokevirtual doubleValue : ()D
/*     */       //   49: invokevirtual func_74780_a : (Ljava/lang/String;D)V
/*     */       //   52: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   55: astore #8
/*     */       //   57: goto -> 106
/*     */       //   60: aload #6
/*     */       //   62: instanceof java/lang/String
/*     */       //   65: ifeq -> 101
/*     */       //   68: aload #6
/*     */       //   70: checkcast java/lang/String
/*     */       //   73: astore #9
/*     */       //   75: aload #9
/*     */       //   77: invokevirtual isEmpty : ()Z
/*     */       //   80: ifne -> 101
/*     */       //   83: aload_0
/*     */       //   84: getfield x5$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   87: aload_3
/*     */       //   88: aload #9
/*     */       //   90: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   93: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   96: astore #8
/*     */       //   98: goto -> 106
/*     */       //   101: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   104: astore #8
/*     */       //   106: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   109: astore #5
/*     */       //   111: return
/*     */       //   112: new scala/MatchError
/*     */       //   115: dup
/*     */       //   116: aload_2
/*     */       //   117: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   120: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #203	-> 0
/*     */       //   #204	-> 24
/*     */       //   #205	-> 60
/*     */       //   #206	-> 101
/*     */       //   #203	-> 106
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	121	0	this	Lli/cil/oc/server/component/Geolyzer$$anonfun$onMessage$2;
/*     */       //   0	121	1	x$2	Lscala/Tuple2;
/*     */       //   14	107	3	key	Ljava/lang/String;
/*     */       //   20	101	4	value	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public Geolyzer$$anonfun$onMessage$2(Geolyzer $outer, NBTTagCompound x5$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Geolyzer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */