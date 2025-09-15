/*    */ package li.cil.oc.integration.bluepower;
/*    */ 
/*    */ import com.bluepowermod.api.connect.IConnectionCache;
/*    */ import com.bluepowermod.api.wire.redstone.IRedstoneDevice;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ub\001B\001\003\0015\021aBU3egR|g.\032#fm&\034WM\003\002\004\t\005I!\r\\;fa><XM\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9\"%D\001\031\025\tI\"$\001\005sK\022\034Ho\0348f\025\tYB$\001\003xSJ,'BA\017\037\003\r\t\007/\033\006\003?\001\nAB\0317vKB|w/\032:n_\022T\021!I\001\004G>l\027BA\022\031\005=I%+\0323ti>tW\rR3wS\016,\007\002C\023\001\005\013\007I\021\001\024\002\025QLG.Z#oi&$\0300F\001(!\tAs&D\001*\025\tQ3&\001\004ue\006LGo\035\006\003Y5\n!\002^5mK\026tG/\033;z\025\tqc!\001\004d_6lwN\\\005\003a%\022QBU3egR|g.Z!xCJ,\007\002\003\032\001\005\003\005\013\021B\024\002\027QLG.Z#oi&$\030\020\t\005\006i\001!\t!N\001\007y%t\027\016\036 \025\005YB\004CA\034\001\033\005\021\001\"B\0234\001\0049\003\002\003\036\001\021\013\007I\021A\036\002\013\r\f7\r[3\026\003q\0022!\020!\027\033\005q$BA \035\003\035\031wN\0348fGRL!!\021 \003!%\033uN\0348fGRLwN\\\"bG\",\007\002C\"\001\021\003\005\013\025\002\037\002\r\r\f7\r[3!\021\025)\005\001\"\021G\003\0219W\r\036-\025\003\035\003\"\001S&\016\003%S\021AS\001\006g\016\fG.Y\005\003\031&\0231!\0238u\021\025q\005\001\"\021G\003\0219W\r^-\t\013A\003A\021\t$\002\t\035,GO\027\005\006%\002!\teU\001\tO\026$xk\034:mIR\tA\013\005\002V96\taK\003\002X1\006)qo\034:mI*\021\021LW\001\n[&tWm\031:bMRT\021aW\001\004]\026$\030BA/W\005\0259vN\0357e\021\025y\006\001\"\021a\003)\031\027M\\\"p]:,7\r\036\013\005C\022|\027\017\005\002IE&\0211-\023\002\b\005>|G.Z1o\021\025)g\f1\001g\003\021\031\030\016Z3\021\005\035lW\"\0015\013\005%T\027\001B;uS2T!AL6\013\0051T\026AD7j]\026\034'/\0314uM>\024x-Z\005\003]\"\024aBR8sO\026$\025N]3di&|g\016C\003q=\002\007a#A\002eKZDQA\0350A\002M\fabY8o]\026\034G/[8o)f\004X\r\005\002>i&\021QO\020\002\017\007>tg.Z2uS>tG+\0379f\021\0259\b\001\"\021y\0031I7OT8s[\006dg)Y2f)\t\t\027\020C\003fm\002\007a\rC\003|\001\021\005C0\001\016hKR\024V\rZ:u_:,7i\0348oK\016$\030n\0348DC\016DW\rF\001~a\rq\0301\001\t\004{\001{\b\003BA\001\003\007a\001\001B\006\002\006i\f\t\021!A\003\002\005\035!aA0%cE\031\021\021\002\f\021\007!\013Y!C\002\002\016%\023qAT8uQ&tw\rC\004\002\022\001!\t%a\005\002!\035,GOU3egR|g.\032)po\026\024H\003BA\013\0037\0012\001SA\f\023\r\tI\"\023\002\005\005f$X\r\003\004f\003\037\001\rA\032\005\b\003?\001A\021IA\021\003A\031X\r\036*fIN$xN\\3Q_^,'\017\006\004\002$\005%\0221\006\t\004\021\006\025\022bAA\024\023\n!QK\\5u\021\031)\027Q\004a\001M\"A\021QFA\017\001\004\t)\"A\003q_^,'\017C\004\0022\001!\t%a\r\002!=t'+\0323ti>tW-\0269eCR,GCAA\022\001")
/*    */ public class RedstoneDevice implements IRedstoneDevice {
/*    */   private final RedstoneAware tileEntity;
/*    */   
/* 11 */   public RedstoneAware tileEntity() { return this.tileEntity; } private IConnectionCache<IRedstoneDevice> cache; private volatile boolean bitmap$0; public RedstoneDevice(RedstoneAware tileEntity) {} private IConnectionCache cache$lzycompute() {
/* 12 */     synchronized (this) { if (!this.bitmap$0) { this.cache = BPApi.getInstance().getRedstoneApi().createRedstoneConnectionCache(this); this.bitmap$0 = true; }  return this.cache; }  } public IConnectionCache<IRedstoneDevice> cache() { return this.bitmap$0 ? this.cache : cache$lzycompute(); }
/*    */    public int getX() {
/* 14 */     return tileEntity().x();
/*    */   } public int getY() {
/* 16 */     return tileEntity().y();
/*    */   } public int getZ() {
/* 18 */     return tileEntity().z();
/*    */   } public World getWorld() {
/* 20 */     return tileEntity().world();
/*    */   } public boolean canConnect(ForgeDirection side, IRedstoneDevice dev, ConnectionType connectionType) {
/* 22 */     return tileEntity().isOutputEnabled();
/*    */   } public boolean isNormalFace(ForgeDirection side) {
/* 24 */     return true;
/*    */   } public IConnectionCache<? extends IRedstoneDevice> getRedstoneConnectionCache() {
/* 26 */     return cache();
/*    */   } public byte getRedstonePower(ForgeDirection side) {
/* 28 */     return (byte)tileEntity().getOutput(side);
/*    */   } public void setRedstonePower(ForgeDirection side, byte power) {
/* 30 */     tileEntity().setInput(side, power & 0xFF);
/*    */   } public void onRedstoneUpdate() {
/* 32 */     tileEntity().checkRedstoneInputChanged();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bluepower\RedstoneDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */