/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import cpw.mods.fml.common.network.internal.FMLProxyPacket;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.util.zip.Deflater;
/*     */ import java.util.zip.DeflaterOutputStream;
/*     */ import scala.Enumeration;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0214A!\001\002\001\027\t92i\\7qe\026\0348/\0323QC\016\\W\r\036\"vS2$WM\035\006\003\007\021\taaY8n[>t'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001M\021\001\001\004\t\004\0339\001R\"\001\002\n\005=\021!!\005)bG.,GOQ;jY\022,'OQ1tKB\021\021\003G\007\002%)\0211\003F\001\004u&\004(BA\013\027\003\021)H/\0337\013\003]\tAA[1wC&\021\021D\005\002\025\t\0264G.\031;fe>+H\017];u'R\024X-Y7\t\021m\001!Q1A\005\002q\t!\002]1dW\026$H+\0379f+\005i\002C\001\020\"\035\tiq$\003\002!\005\005Q\001+Y2lKR$\026\020]3\n\005\t\032#!\002,bYV,\027B\001\023&\005-)e.^7fe\006$\030n\0348\013\003\031\nQa]2bY\006D\001\002\013\001\003\002\003\006I!H\001\fa\006\0347.\032;UsB,\007\005\003\005+\001\t\025\r\021\"\003,\003\021!\027\r^1\026\0031\002\"!\f\031\016\0039R!a\f\f\002\005%|\027BA\031/\005U\021\025\020^3BeJ\f\027pT;uaV$8\013\036:fC6D\001b\r\001\003\002\003\006I\001L\001\006I\006$\030\r\t\005\006k\001!\tAN\001\007y%t\027\016\036 \025\007]B\024\b\005\002\016\001!)1\004\016a\001;!9!\006\016I\001\002\004a\003\"B\036\001\t#b\024A\0029bG.,G/F\001>!\tq$*D\001@\025\t\001\025)\001\005j]R,'O\\1m\025\t\0215)A\004oKR<xN]6\013\005\r!%BA#G\003\r1W\016\034\006\003\017\"\013A!\\8eg*\t\021*A\002da^L!aS \003\035\031kE\n\025:pqf\004\026mY6fi\0369QJAA\001\022\003q\025aF\"p[B\024Xm]:fIB\0137m[3u\005VLG\016Z3s!\tiqJB\004\002\005\005\005\t\022\001)\024\005=\013\006C\001*T\033\005)\023B\001+&\005\031\te.\037*fM\")Qg\024C\001-R\ta\nC\004Y\037F\005I\021A-\0027\021bWm]:j]&$He\032:fCR,'\017\n3fM\006,H\016\036\0233+\005Q&F\001\027\\W\005a\006CA/c\033\005q&BA0a\003%)hn\0315fG.,GM\003\002bK\005Q\021M\0348pi\006$\030n\0348\n\005\rt&!E;oG\",7m[3e-\006\024\030.\0318dK\002")
/*     */ public class CompressedPacketBuilder
/*     */   extends PacketBuilderBase<DeflaterOutputStream>
/*     */ {
/*     */   private final Enumeration.Value packetType;
/*     */   private final ByteArrayOutputStream data;
/*     */   
/*     */   public Enumeration.Value packetType() {
/* 153 */     return this.packetType; } private ByteArrayOutputStream data() { return this.data; } public CompressedPacketBuilder(Enumeration.Value packetType, ByteArrayOutputStream data) { super(new DeflaterOutputStream(data, new Deflater(1)));
/* 154 */     writeByte(packetType.id()); }
/*     */   
/*     */   public FMLProxyPacket packet() {
/* 157 */     flush();
/* 158 */     stream().finish();
/* 159 */     byte[] payload = data().toByteArray();
/* 160 */     PacketBuilder$.MODULE$.logPacket(packetType(), payload.length, tileEntity());
/* 161 */     return new FMLProxyPacket(Unpooled.wrappedBuffer(payload), "OpenComputers");
/*     */   }
/*     */   
/*     */   public static ByteArrayOutputStream $lessinit$greater$default$2() {
/*     */     return CompressedPacketBuilder$.MODULE$.$lessinit$greater$default$2();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\CompressedPacketBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */