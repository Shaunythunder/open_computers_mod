package li.cil.oc.server.agent;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import javax.crypto.SecretKey;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001M;Q!\001\002\t\0025\t!CR1lK:+Go^8sW6\013g.Y4fe*\0211\001B\001\006C\036,g\016\036\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t\021b)Y6f\035\026$xo\034:l\033\006t\027mZ3s'\ty!\003\005\002\02455\tAC\003\002\026-\0059a.\032;x_J\\'BA\f\031\003%i\027N\\3de\0064GOC\001\032\003\rqW\r^\005\0037Q\021aBT3uo>\0248.T1oC\036,'\017C\003\036\037\021\005a$\001\004=S:LGO\020\013\002\033!)\001e\004C!C\00512o\0315fIVdWmT;uE>,h\016\032)bG.,G\017F\002#Q5\002\"a\t\024\016\003\021R\021!J\001\006g\016\fG.Y\005\003O\021\022A!\0268ji\")\021f\ba\001U\0051\001/Y2lKR\004\"aE\026\n\0051\"\"A\002)bG.,G\017C\003/?\001\007q&\001\005mSN$XM\\3s!\r\031\003GM\005\003c\021\022!\002\020:fa\026\fG/\0323?a\t\031\024\tE\0025{}j\021!\016\006\003m]\n!bY8oGV\024(/\0328u\025\tA\024(\001\003vi&d'B\001\036<\003\025qW\r\036;z\025\005a\024AA5p\023\tqTGA\013HK:,'/[2GkR,(/\032'jgR,g.\032:\021\005\001\013E\002\001\003\n\0056\n\t\021!A\003\002\r\0231a\030\0232#\t!u\t\005\002$\013&\021a\t\n\002\b\035>$\b.\0338ha\tAE\nE\0025\023.K!AS\033\003\r\031+H/\036:f!\t\001E\nB\005N\035\006\005\t\021!B\001\037\n\031q\f\n\032\005\023\tk\023\021aA\001\006\003\031\025C\001#Q!\t\031\023+\003\002SI\t\031\021I\\=")
public final class FakeNetworkManager {
  public static void scheduleOutboundPacket(Packet paramPacket, Seq<GenericFutureListener<? extends Future<?>>> paramSeq) {
    FakeNetworkManager$.MODULE$.scheduleOutboundPacket(paramPacket, paramSeq);
  }
  
  public static Channel channel() {
    return FakeNetworkManager$.MODULE$.channel();
  }
  
  public static void disableAutoRead() {
    FakeNetworkManager$.MODULE$.func_150721_g();
  }
  
  public static IChatComponent getExitMessage() {
    return FakeNetworkManager$.MODULE$.func_150730_f();
  }
  
  public static INetHandler getNetHandler() {
    return FakeNetworkManager$.MODULE$.func_150729_e();
  }
  
  public static boolean isChannelOpen() {
    return FakeNetworkManager$.MODULE$.func_150724_d();
  }
  
  public static void enableEncryption(SecretKey paramSecretKey) {
    FakeNetworkManager$.MODULE$.func_150727_a(paramSecretKey);
  }
  
  public static boolean isLocalChannel() {
    return FakeNetworkManager$.MODULE$.func_150731_c();
  }
  
  public static void closeChannel(IChatComponent paramIChatComponent) {
    FakeNetworkManager$.MODULE$.func_150718_a(paramIChatComponent);
  }
  
  public static SocketAddress getSocketAddress() {
    return FakeNetworkManager$.MODULE$.func_74430_c();
  }
  
  public static void processReceivedPackets() {
    FakeNetworkManager$.MODULE$.func_74428_b();
  }
  
  public static void scheduleOutboundPacket(Packet paramPacket, GenericFutureListener[] paramArrayOfGenericFutureListener) {
    FakeNetworkManager$.MODULE$.func_150725_a(paramPacket, paramArrayOfGenericFutureListener);
  }
  
  public static void setNetHandler(INetHandler paramINetHandler) {
    FakeNetworkManager$.MODULE$.func_150719_a(paramINetHandler);
  }
  
  public static void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable) {
    FakeNetworkManager$.MODULE$.exceptionCaught(paramChannelHandlerContext, paramThrowable);
  }
  
  public static void channelInactive(ChannelHandlerContext paramChannelHandlerContext) {
    FakeNetworkManager$.MODULE$.channelInactive(paramChannelHandlerContext);
  }
  
  public static void setConnectionState(EnumConnectionState paramEnumConnectionState) {
    FakeNetworkManager$.MODULE$.func_150723_a(paramEnumConnectionState);
  }
  
  public static void channelActive(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.channelActive(paramChannelHandlerContext);
  }
  
  public static void channelRead(ChannelHandlerContext paramChannelHandlerContext, Object paramObject) throws Exception {
    FakeNetworkManager$.MODULE$.channelRead(paramChannelHandlerContext, paramObject);
  }
  
  public static boolean acceptInboundMessage(Object paramObject) throws Exception {
    return FakeNetworkManager$.MODULE$.acceptInboundMessage(paramObject);
  }
  
  public static void channelWritabilityChanged(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.channelWritabilityChanged(paramChannelHandlerContext);
  }
  
  public static void userEventTriggered(ChannelHandlerContext paramChannelHandlerContext, Object paramObject) throws Exception {
    FakeNetworkManager$.MODULE$.userEventTriggered(paramChannelHandlerContext, paramObject);
  }
  
  public static void channelReadComplete(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.channelReadComplete(paramChannelHandlerContext);
  }
  
  public static void channelUnregistered(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.channelUnregistered(paramChannelHandlerContext);
  }
  
  public static void channelRegistered(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.channelRegistered(paramChannelHandlerContext);
  }
  
  public static void handlerRemoved(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.handlerRemoved(paramChannelHandlerContext);
  }
  
  public static void handlerAdded(ChannelHandlerContext paramChannelHandlerContext) throws Exception {
    FakeNetworkManager$.MODULE$.handlerAdded(paramChannelHandlerContext);
  }
  
  public static boolean isSharable() {
    return FakeNetworkManager$.MODULE$.isSharable();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\FakeNetworkManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */