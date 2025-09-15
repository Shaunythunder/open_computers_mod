/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.driver.DeviceInfo;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import li.cil.oc.util.ExtendedWorld$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005-f!B\001\003\003\003i!!D+qOJ\fG-\032)jgR|gN\003\002\004\t\005I1m\\7q_:,g\016\036\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022A\0029sK\032\f'M\003\002\024\r\005\031\021\r]5\n\005U\001\"AE'b]\006<W\rZ#om&\024xN\\7f]R\004\"a\006\016\016\003aQ!!\007\n\002\r\021\024\030N^3s\023\tY\002D\001\006EKZL7-Z%oM>D\001\"\b\001\003\006\004%\tAH\001\005Q>\034H/F\001 !\t\0013%D\001\"\025\t\021##A\004oKR<xN]6\n\005\021\n#aD#om&\024xN\\7f]RDun\035;\t\021\031\002!\021!Q\001\n}\tQ\001[8ti\002BQ\001\013\001\005\002%\na\001P5oSRtDC\001\026-!\tY\003!D\001\003\021\025ir\0051\001 \021\035q\003A1A\005B=\nAA\\8eKV\t\001\007\005\002!c%\021!'\t\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\0045\001\001\006I\001M\001\006]>$W\r\t\005\tm\001A)\031!C\007o\005QA-\032<jG\026LeNZ8\026\003a\002B!\017!C\0056\t!H\003\002<y\005I\021.\\7vi\006\024G.\032\006\003{y\n!bY8mY\026\034G/[8o\025\005y\024!B:dC2\f\027BA!;\005\ri\025\r\035\t\003\007\"k\021\001\022\006\003\013\032\013A\001\\1oO*\tq)\001\003kCZ\f\027BA%E\005\031\031FO]5oO\"A1\n\001E\001B\0036\001(A\006eKZL7-Z%oM>\004\003\"B'\001\t\003r\025!D4fi\022+g/[2f\023:4w\016F\001P!\021\0016\013\026+\016\003ES!A\025$\002\tU$\030\016\\\005\003\003F\003\"!V-\017\005Y;V\"\001 \n\005as\024A\002)sK\022,g-\003\002J5*\021\001L\020\005\0069\0021\t!X\001\016aV\034\b\016R5sK\016$\030n\0348\025\007yK\027\017\005\002`O6\t\001M\003\002SC*\021!mY\001\007G>lWn\0348\013\005\021,\027AD7j]\026\034'/\0314uM>\024x-\032\006\002M\006\031a.\032;\n\005!\004'A\004$pe\036,G)\033:fGRLwN\034\005\006Un\003\ra[\001\005CJ<7\017\005\002m_6\tQN\003\002o%\0059Q.Y2iS:,\027B\0019n\005%\t%oZ;nK:$8\017C\003s7\002\0071/A\003j]\022,\007\020\005\002Wi&\021QO\020\002\004\023:$\b\"B<\001\t\003A\030A\0039vg\"|%/[4j]R\021\021P \t\003url\021a\037\006\003%\032I!!`>\003\033\tcwnY6Q_NLG/[8o\021\025yh\0171\001_\003\021\031\030\016Z3\t\017\005\r\001\001\"\001\002\006\005!\001/^:i)\031\t9!a\005\002\036A)a+!\003\002\016%\031\0211\002 \003\013\005\023(/Y=\021\007Y\013y!C\002\002\022y\022a!\0218z%\0264\007\002CA\013\003\003\001\r!a\006\002\017\r|g\016^3yiB\031A.!\007\n\007\005mQNA\004D_:$X\r\037;\t\r)\f\t\0011\001lQ!\t\t!!\t\002(\005%\002c\0017\002$%\031\021QE7\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\tY#AA\005MVt7\r^5p]\"Z6/\0333fu9,XNY3s;&R$m\\8mK\006t\007%L\027!)JLWm\035\021u_\002\002Xo\0355!i\",\007E\0317pG.\004sN\034\021uQ\026\0043\017]3dS\032LW\r\032\021tS\022,\007e\0344!i\",\007eY8oi\006Lg.\032:!_\032\004C\017[3!kB<'/\0313f]\001\"UMZ1vYR\034\b\005^8!MJ|g\016\036\030\b\017\005=\"\001#\001\0022\005iQ\013]4sC\022,\007+[:u_:\0042aKA\032\r\031\t!\001#\001\0026M!\0211GA\007\021\035A\0231\007C\001\003s!\"!!\r\007\017\005u\0221\007\001\002@\t)AI]8oKN\031\0211\b\026\t\031\005\r\0231\bB\001B\003%\021Q\t\017\002\013\021\024xN\\3\021\t\005\035\023QJ\007\003\003\023R1!a\023\023\003!Ig\016^3s]\006d\027\002BA\037\003\023Bq\001KA\036\t\003\t\t\006\006\003\002T\005]\003\003BA+\003wi!!a\r\t\021\005\r\023q\na\001\003\013Bq\001XA\036\t\003\nY\006F\003_\003;\ny\006\003\004k\0033\002\ra\033\005\007e\006e\003\031A:\007\017\005\r\0241\007\001\002f\t1A+\0312mKR\034B!!\031\002hA!\021QKA5\r\035\tY'a\r\001\003[\022\021BU8uCR\f'\r\\3\024\007\005%$\006C\006\002r\005%$Q1A\005\002\005M\024!\003:pi\006$\030M\0317f+\t\t)HE\003\002x\005mtDB\004\002z\005M\002!!\036\003\031q\022XMZ5oK6,g\016\036 \021\t\005\035\023QP\005\005\003W\nI\005\003\007\002\002\006%$\021!Q\001\n\005UD$\001\006s_R\fG/\0312mK\002Bq\001KA5\t\003\t)\t\006\003\002h\005\035\005\002CA9\003\007\003\r!!#\023\013\005-\0251P\020\007\017\005e\0241\007\001\002\n\"9A,!\033\005B\005=E#\0020\002\022\006M\005B\0026\002\016\002\0071\016\003\004s\003\033\003\ra\035\005\016\003/\013\tG!A!\002\023\tI*a\034\002\rQ\f'\r\\3u!\021\t9%a'\n\t\005\r\024\021\n\005\bQ\005\005D\021AAP)\021\t\t+a)\021\t\005U\023\021\r\005\t\003/\013i\n1\001\002\032\"9q/!\031\005B\005\035FcA=\002*\"1q0!*A\002y\003")
/*    */ public abstract class UpgradePiston extends ManagedEnvironment implements DeviceInfo {
/*    */   public EnvironmentHost host() {
/* 26 */     return this.host;
/* 27 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 28 */     .withComponent("piston")
/* 29 */     .withConnector()
/* 30 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*    */   public ComponentConnector node() { return this.node; }
/* 32 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 33 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 34 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Piston upgrade");
/* 35 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 36 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Displacer II+"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 39 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */    private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   } public BlockPosition pushOrigin(ForgeDirection side) {
/* 43 */     return BlockPosition$.MODULE$.apply(host());
/*    */   }
/*    */   @Callback(doc = "function([side:number]):boolean -- Tries to push the block on the specified side of the container of the upgrade. Defaults to front.")
/*    */   public Object[] push(Context context, Arguments args) {
/* 47 */     ForgeDirection side = pushDirection(args, 0);
/* 48 */     BlockPosition hostPos = pushOrigin(side);
/* 49 */     BlockPosition blockPos = hostPos.offset(side);
/*    */     
/* 51 */     ExtendedWorld$.MODULE$.extendedWorld(host().world()).setBlockToAir(blockPos);
/* 52 */     host().world().func_72908_a(host().xPosition(), host().yPosition(), host().zPosition(), "tile.piston.out", 0.5F, (host().world()).field_73012_v.nextFloat() * 0.25F + 0.6F);
/* 53 */     context.pause(0.5D);
/* 54 */     return (!ExtendedWorld$.MODULE$.extendedWorld(host().world()).isAirBlock(blockPos) && node().tryChangeBuffer(-Settings$.MODULE$.get().pistonCost()) && Blocks.field_150331_J.func_150079_i(host().world(), hostPos.x(), hostPos.y(), hostPos.z(), side.ordinal())) ? package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*    */           
/* 56 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*    */   }
/*    */   public abstract ForgeDirection pushDirection(Arguments paramArguments, int paramInt);
/*    */   
/*    */   public UpgradePiston(EnvironmentHost host) {}
/*    */   
/* 62 */   public static class Drone extends UpgradePiston { public Drone(li.cil.oc.api.internal.Drone drone) { super((EnvironmentHost)drone); } public ForgeDirection pushDirection(Arguments args, int index) {
/* 63 */       return ExtendedArguments$.MODULE$.extendedArguments(args).optSideAny(index, ForgeDirection.SOUTH);
/*    */     } }
/*    */   public static class Tablet extends Rotatable { public Tablet(li.cil.oc.api.internal.Tablet tablet) {
/* 66 */       super((li.cil.oc.api.internal.Rotatable)tablet);
/*    */     }
/*    */     public BlockPosition pushOrigin(ForgeDirection side) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */       //   4: astore_2
/*    */       //   5: dup
/*    */       //   6: ifnonnull -> 17
/*    */       //   9: pop
/*    */       //   10: aload_2
/*    */       //   11: ifnull -> 24
/*    */       //   14: goto -> 59
/*    */       //   17: aload_2
/*    */       //   18: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   21: ifeq -> 59
/*    */       //   24: aload_0
/*    */       //   25: invokespecial rotatable : ()Lli/cil/oc/api/internal/Rotatable;
/*    */       //   28: checkcast li/cil/oc/api/internal/Tablet
/*    */       //   31: invokeinterface player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*    */       //   36: invokevirtual func_70047_e : ()F
/*    */       //   39: iconst_1
/*    */       //   40: i2f
/*    */       //   41: fcmpl
/*    */       //   42: ifle -> 59
/*    */       //   45: aload_0
/*    */       //   46: aload_1
/*    */       //   47: invokespecial pushOrigin : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */       //   50: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */       //   53: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */       //   56: goto -> 64
/*    */       //   59: aload_0
/*    */       //   60: aload_1
/*    */       //   61: invokespecial pushOrigin : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */       //   64: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #68	-> 0
/*    */       //   #69	-> 59
/*    */       //   #68	-> 64
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	65	0	this	Lli/cil/oc/server/component/UpgradePiston$Tablet;
/*    */       //   0	65	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     } }
/*    */   
/* 72 */   public static class Rotatable extends UpgradePiston { public li.cil.oc.api.internal.Rotatable rotatable() { return (li.cil.oc.api.internal.Rotatable)host(); } public Rotatable(li.cil.oc.api.internal.Rotatable rotatable) { super((EnvironmentHost)rotatable); } public ForgeDirection pushDirection(Arguments args, int index) {
/* 73 */       return rotatable().toGlobal(ExtendedArguments$.MODULE$.extendedArguments(args).optSideForAction(index, ForgeDirection.SOUTH));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradePiston.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */