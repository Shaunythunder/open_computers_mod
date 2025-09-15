/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import cpw.mods.fml.common.network.internal.FMLProxyPacket;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.ByteArrayOutputStream;
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
/*     */ @ScalaSignature(bytes = "\006\001y2A!\001\002\001\027\t\0312+[7qY\026\004\026mY6fi\n+\030\016\0343fe*\0211\001B\001\007G>lWn\0348\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001a\005\002\001\031A\031QB\004\t\016\003\tI!a\004\002\003#A\0137m[3u\005VLG\016Z3s\005\006\034X\r\005\002\022-5\t!C\003\002\024)\005\021\021n\034\006\002+\005!!.\031<b\023\t9\"CA\013CsR,\027I\035:bs>+H\017];u'R\024X-Y7\t\021e\001!Q1A\005\002i\t!\002]1dW\026$H+\0379f+\005Y\002C\001\017 \035\tiQ$\003\002\037\005\005Q\001+Y2lKR$\026\020]3\n\005\001\n#!\002,bYV,\027B\001\022$\005-)e.^7fe\006$\030n\0348\013\003\021\nQa]2bY\006D\001B\n\001\003\002\003\006IaG\001\fa\006\0347.\032;UsB,\007\005C\003)\001\021\005\021&\001\004=S:LGO\020\013\003U-\002\"!\004\001\t\013e9\003\031A\016\t\0135\002A\021\013\030\002\rA\f7m[3u+\005y\003C\001\031=\033\005\t$B\001\0324\003!Ig\016^3s]\006d'B\001\0336\003\035qW\r^<pe.T!a\001\034\013\005]B\024a\0014nY*\021\021HO\001\005[>$7OC\001<\003\r\031\007o^\005\003{E\022aBR'M!J|\0070\037)bG.,G\017")
/*     */ public class SimplePacketBuilder
/*     */   extends PacketBuilderBase<ByteArrayOutputStream>
/*     */ {
/*     */   private final Enumeration.Value packetType;
/*     */   
/*     */   public Enumeration.Value packetType() {
/* 142 */     return this.packetType; } public SimplePacketBuilder(Enumeration.Value packetType) { super(PacketBuilder$.MODULE$.newData(false));
/* 143 */     writeByte(packetType.id()); }
/*     */   
/*     */   public FMLProxyPacket packet() {
/* 146 */     flush();
/* 147 */     byte[] payload = stream().toByteArray();
/* 148 */     PacketBuilder$.MODULE$.logPacket(packetType(), payload.length, tileEntity());
/* 149 */     return new FMLProxyPacket(Unpooled.wrappedBuffer(payload), "OpenComputers");
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\SimplePacketBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */