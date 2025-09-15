/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.Component;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function0;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.math.package$;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.RichInt$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005uv!B\001\003\021\003i\021AE+qOJ\fG-\032+sC\016$xN\035\"fC6T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003%U\003xM]1eKR\023\030m\031;pe\n+\027-\\\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\r\025ar\"!\001\036\005\031\031u.\\7p]N\0311D\b\024\021\005}!S\"\001\021\013\005\005\022\023A\0029sK\032\f'M\003\002$\r\005\031\021\r]5\n\005\025\002#AE'b]\006<W\rZ#om&\024xN\\7f]R\004\"a\n\026\016\003!R!!\013\022\002\r\021\024\030N^3s\023\tY\003F\001\006EKZL7-Z%oM>DQ!G\016\005\0025\"\022A\f\t\003_mi\021a\004\005\bcm\021\r\021\"\0213\003\021qw\016Z3\026\003M\002\"\001N\034\016\003UR!A\016\022\002\0179,Go^8sW&\021\001(\016\002\n\007>l\007o\0348f]RDaAO\016!\002\023\031\024!\0028pI\026\004\003b\002\037\034\005\004%I!P\001\ra&\0347.\0369SC\022LWo]\013\002}A\0211cP\005\003\001R\0211!\0238u\021\031\0215\004)A\005}\005i\001/[2lkB\024\026\rZ5vg\002B\001\002R\016\t\006\004%i!R\001\013I\0264\030nY3J]\032|W#\001$\021\t\035ceJT\007\002\021*\021\021JS\001\nS6lW\017^1cY\026T!a\023\013\002\025\r|G\016\\3di&|g.\003\002N\021\n\031Q*\0319\021\005=#V\"\001)\013\005E\023\026\001\0027b]\036T\021aU\001\005U\0064\030-\003\002V!\n11\013\036:j]\036D\001bV\016\t\002\003\006kAR\001\fI\0264\030nY3J]\032|\007\005C\003Z7\021\005#,A\007hKR$UM^5dK&sgm\034\013\0027B!Al\0301a\033\005i&B\0010S\003\021)H/\0337\n\0055k\006CA1e\035\t\031\"-\003\002d)\0051\001K]3eK\032L!!V3\013\005\r$\002\"B4\034\r#A\027\001\0039pg&$\030n\0348\026\003%\004\"A\0337\016\003-T!A\030\004\n\0055\\'!\004\"m_\016\\\007k\\:ji&|g\016C\003p7\031E\001/A\006d_2dWm\031;Ji\026lGCA9u!\t\031\"/\003\002t)\t!QK\\5u\021\025)h\0161\001w\003\021IG/Z7\021\005]|X\"\001=\013\005UL(B\001>|\003\031)g\016^5us*\021A0`\001\n[&tWm\031:bMRT\021A`\001\004]\026$\030bAA\001q\nQQI\034;jifLE/Z7\t\017\005\0251\004\"\003\002\b\005)qo\034:mIV\021\021\021\002\t\005\003\027\ty!\004\002\002\016)\031\021QA>\n\t\005E\021Q\002\002\006/>\024H\016\032\005\b\003+YB\021AA\f\003\021\031XoY6\025\r\005e\021qDA\030!\021\031\0221\004\n\n\007\005uACA\003BeJ\f\027\020\003\005\002\"\005M\001\031AA\022\003\035\031wN\034;fqR\004B!!\n\002,5\021\021q\005\006\004\003S\021\023aB7bG\"Lg.Z\005\005\003[\t9CA\004D_:$X\r\037;\t\021\005E\0221\003a\001\003g\tA!\031:hgB!\021QEA\033\023\021\t9$a\n\003\023\005\023x-^7f]R\034\b\006CA\n\003w\t\t%a\021\021\t\005\025\022QH\005\005\003\t9C\001\005DC2d'-Y2l\003\r!wnY\021\003\003\013\nQJZ;oGRLwN\034\025*u\t|w\016\\3b]\002jS\006\t+sS\026\034\b\005^8!a&\0347\016I;qA\005\004#/\0318e_6\004\023\016^3nA%t\007\005\0365fAI|'m\034;tO\0012\030nY5oSRLhF\002\004\002J=\001\0211\n\002\007!2\f\0270\032:\024\007\005\035c\006C\006\002P\005\035#Q1A\005\002\005E\023!B8x]\026\024XCAA*!\r!\024QK\005\004\003/*$aD#om&\024xN\\7f]RDun\035;\t\027\005m\023q\tB\001B\003%\0211K\001\007_^tWM\035\021\t\027\005}\023q\tBC\002\023\005\021\021M\001\007a2\f\0270\032:\026\005\005\r\004#B\n\002f\005%\024bAA4)\tIa)\0368di&|g\016\r\t\005\003W\ny'\004\002\002n)\031\021qL=\n\t\005E\024Q\016\002\r\013:$\030\016^=QY\006LXM\035\005\f\003k\n9E!A!\002\023\t\031'A\004qY\006LXM\035\021\t\017e\t9\005\"\001\002zQ1\0211PA?\003\0022aLA$\021!\ty%a\036A\002\005M\003\002CA0\003o\002\r!a\031\t\r\035\f9\005\"\025i\021\035y\027q\tC)\003\013#2!]AD\021\031)\0301\021a\001m\0321\0211R\b\001\003\033\023Q\001\022:p]\026\0342!!#/\021-\ty%!#\003\006\004%\t!!%\026\005\005M\005\003BAK\0037k!!a&\013\007\005e%%\001\005j]R,'O\\1m\023\021\ti*a&\003\013\005;WM\034;\t\027\005m\023\021\022B\001B\003%\0211\023\005\b3\005%E\021AAR)\021\t)+a*\021\007=\nI\t\003\005\002P\005\005\006\031AAJ\021\0319\027\021\022C)Q\"9q.!#\005R\0055FcA9\0020\"1Q/a+A\002YD\001\"a-\002\n\022%\021QW\001\017S:\034XM\035;j_:\034Fn\034;t+\t\t9\f\005\003H\003ss\024bAA^\021\nQ\021J\0343fq\026$7+Z9")
/*    */ public final class UpgradeTractorBeam {
/*    */   public static abstract class Common extends ManagedEnvironment implements DeviceInfo {
/* 29 */     private final Component node = (Component)Network.newNode((Environment)this, Visibility.Network)
/* 30 */       .withComponent("tractor_beam")
/* 31 */       .create(); public Component node() {
/*    */       return this.node;
/* 33 */     } private final int pickupRadius = 3; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; private int pickupRadius() { return this.pickupRadius; }
/*    */     
/* 35 */     private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 36 */             .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 37 */           (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Tractor beam");
/* 38 */           (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 39 */           (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "T313-K1N.3515"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */          return this.deviceInfo; }
/*    */        } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 42 */     public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     private World world() {
/* 48 */       return (World)position().world().get();
/*    */     }
/*    */     public abstract BlockPosition position(); public abstract void collectItem(EntityItem param1EntityItem);
/*    */     @Callback(doc = "function():boolean -- Tries to pick up a random item in the robots' vicinity.")
/* 52 */     public Object[] suck(Context context, Arguments args) { Buffer items = (Buffer)((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(EntityItem.class, position().bounds().func_72314_b(pickupRadius(), pickupRadius(), pickupRadius())))
/* 53 */         .map((Function1)new UpgradeTractorBeam$Common$$anonfun$1(this), Buffer$.MODULE$.canBuildFrom()))
/* 54 */         .filter((Function1)new UpgradeTractorBeam$Common$$anonfun$2(this));
/* 55 */       if (items.nonEmpty()) {
/* 56 */         EntityItem item = (EntityItem)items.apply((world()).field_73012_v.nextInt(items.size()));
/* 57 */         ItemStack stack = item.func_92059_d();
/* 58 */         int size = stack.field_77994_a;
/* 59 */         collectItem(item);
/* 60 */         if (stack.field_77994_a < size || item.field_70128_L) {
/* 61 */           context.pause(Settings$.MODULE$.get().suckDelay());
/* 62 */           world().func_72926_e(2003, (int)package$.MODULE$.floor(item.field_70165_t), (int)package$.MODULE$.floor(item.field_70163_u), (int)package$.MODULE$.floor(item.field_70161_v), 0);
/* 63 */           return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*    */         } 
/*    */       } 
/* 66 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); } public final class UpgradeTractorBeam$Common$$anonfun$1 extends AbstractFunction1<Object, EntityItem> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final EntityItem apply(Object x$1) { return (EntityItem)x$1; } public UpgradeTractorBeam$Common$$anonfun$1(UpgradeTractorBeam.Common $outer) {} } public final class UpgradeTractorBeam$Common$$anonfun$2 extends AbstractFunction1<EntityItem, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final boolean apply(EntityItem item) { return (item.func_70089_S() && item.field_145804_b <= 0); } public UpgradeTractorBeam$Common$$anonfun$2(UpgradeTractorBeam.Common $outer) {}
/*    */     }
/* 70 */   } public static class Player extends Common { private final EnvironmentHost owner; private final Function0<EntityPlayer> player; public EnvironmentHost owner() { return this.owner; } public Function0<EntityPlayer> player() { return this.player; } public Player(EnvironmentHost owner, Function0<EntityPlayer> player) {} public BlockPosition position() {
/* 71 */       return BlockPosition$.MODULE$.apply(owner());
/*    */     } public void collectItem(EntityItem item) {
/* 73 */       item.func_70100_b_((EntityPlayer)player().apply());
/*    */     } }
/*    */   public static class Drone extends Common { private final Agent owner;
/* 76 */     public Agent owner() { return this.owner; } public Drone(Agent owner) {} public BlockPosition position() {
/* 77 */       return BlockPosition$.MODULE$.apply((EnvironmentHost)owner());
/*    */     }
/*    */     public void collectItem(EntityItem item) {
/* 80 */       InventoryUtils$.MODULE$.insertIntoInventory(item.func_92059_d(), owner().mainInventory(), (Option)None$.MODULE$, 64, false, (Option)new Some(insertionSlots()));
/*    */     }
/*    */     private IndexedSeq<Object> insertionSlots() {
/* 83 */       return (IndexedSeq<Object>)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(owner().selectedSlot()), owner().mainInventory().func_70302_i_()).$plus$plus((GenTraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), owner().selectedSlot()), IndexedSeq$.MODULE$.canBuildFrom());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeTractorBeam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */