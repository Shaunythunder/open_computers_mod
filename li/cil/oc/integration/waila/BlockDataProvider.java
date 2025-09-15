/*     */ package li.cil.oc.integration.waila;
/*     */ 
/*     */ import java.util.List;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.SidedEnvironment;
/*     */ import mcp.mobius.waila.api.IWailaConfigHandler;
/*     */ import mcp.mobius.waila.api.IWailaDataAccessor;
/*     */ import mcp.mobius.waila.api.IWailaRegistrar;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\rt!B\001\003\021\003i\021!\005\"m_\016\\G)\031;b!J|g/\0333fe*\0211\001B\001\006o\006LG.\031\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003#\tcwnY6ECR\f\007K]8wS\022,'oE\002\020%i\001\"a\005\r\016\003QQ!!\006\f\002\t1\fgn\032\006\002/\005!!.\031<b\023\tIBC\001\004PE*,7\r\036\t\0037\rj\021\001\b\006\003;y\t1!\0319j\025\t\031qD\003\002!C\0051Qn\0342jkNT\021AI\001\004[\016\004\030B\001\023\035\005IIu+Y5mC\022\013G/\031)s_ZLG-\032:\t\013\031zA\021A\024\002\rqJg.\033;?)\005i\001bB\025\020\005\004%\tAK\001\016\007>tg-[4BI\022\024Xm]:\026\003-\002\"a\005\027\n\0055\"\"AB*ue&tw\r\003\0040\037\001\006IaK\001\017\007>tg-[4BI\022\024Xm]:!\021\035\ttB1A\005\002)\nAbQ8oM&<WI\\3sOfDaaM\b!\002\023Y\023!D\"p]\032Lw-\0228fe\036L\b\005C\0046\037\t\007I\021\001\026\002'\r{gNZ5h\007>l\007o\0348f]Rt\025-\\3\t\r]z\001\025!\003,\003Q\031uN\0344jO\016{W\016]8oK:$h*Y7fA!)\021h\004C\001u\005!\021N\\5u)\tY\024\t\005\002=5\tQHC\001?\003\025\0318-\0317b\023\t\001UH\001\003V]&$\b\"\002\"9\001\004\031\025!\003:fO&\034HO]1s!\tYB)\003\002F9\ty\021jV1jY\006\024VmZ5tiJ\f'\017C\003H\037\021\005\003*\001\006hKRt%\t\026#bi\006$\002\"S*]I\032l'\017\036\t\003\025Fk\021a\023\006\003\0316\0131A\0342u\025\tqu*A\005nS:,7M]1gi*\t\001+A\002oKRL!AU&\003\0359\023E\013V1h\007>l\007o\\;oI\")AK\022a\001+\0061\001\017\\1zKJ\004\"A\026.\016\003]S!\001\026-\013\005ek\025AB3oi&$\0300\003\002\\/\nqQI\034;jif\004F.Y=fe6\003\006\"B/G\001\004q\026A\003;jY\026,e\016^5usB\021qLY\007\002A*\021\021-T\001\013i&dW-\0328uSRL\030BA2a\005)!\026\016\\3F]RLG/\037\005\006K\032\003\r!S\001\004i\006<\007\"B4G\001\004A\027!B<pe2$\007CA5l\033\005Q'BA4N\023\ta'NA\003X_JdG\rC\003o\r\002\007q.A\001y!\ta\004/\003\002r{\t\031\021J\034;\t\013M4\005\031A8\002\003eDQ!\036$A\002=\f\021A\037\005\006o>!\t\005_\001\rO\026$x+Y5mC\n{G-\037\013\ns\006-\0211DA\020\003S\0012A_?\000\033\005Y(B\001?\027\003\021)H/\0337\n\005y\\(\001\002'jgR\004B!!\001\002\b9\031A(a\001\n\007\005\025Q(\001\004Qe\026$WMZ\005\004[\005%!bAA\003{!9\021Q\002<A\002\005=\021!B:uC\016\\\007\003BA\t\003/i!!a\005\013\007\005UQ*\001\003ji\026l\027\002BA\r\003'\021\021\"\023;f[N#\030mY6\t\r\005ua\0171\001z\003\035!xn\0347uSBDq!!\tw\001\004\t\031#\001\005bG\016,7o]8s!\rY\022QE\005\004\003Oa\"AE%XC&d\027\rR1uC\006\0337-Z:t_JDq!a\013w\001\004\ti#\001\004d_:4\027n\032\t\0047\005=\022bAA\0319\t\031\022jV1jY\006\034uN\0344jO\"\013g\016\0327fe\"9\021QG\b\005B\005]\022!D4fi^\013\027\016\\1Ti\006\0347\016\006\004\002\020\005e\0221\b\005\t\003C\t\031\0041\001\002$!A\0211FA\032\001\004\ti\003C\004\002@=!\t%!\021\002\031\035,GoV1jY\006DU-\0313\025\023e\f\031%!\022\002H\005%\003\002CA\007\003{\001\r!a\004\t\017\005u\021Q\ba\001s\"A\021\021EA\037\001\004\t\031\003\003\005\002,\005u\002\031AA\027\021\035\tie\004C!\003\037\nAbZ3u/\006LG.\031+bS2$\022\"_A)\003'\n)&a\026\t\021\0055\0211\na\001\003\037Aq!!\b\002L\001\007\021\020\003\005\002\"\005-\003\031AA\022\021!\tY#a\023A\002\0055\002bBA.\037\021%\021QL\001\013M>\024X.\031;US6,GcA@\002`!9\021\021MA-\001\004y\027aB:fG>tGm\035")
/*     */ public final class BlockDataProvider
/*     */ {
/*     */   public static List<String> getWailaTail(ItemStack paramItemStack, List<String> paramList, IWailaDataAccessor paramIWailaDataAccessor, IWailaConfigHandler paramIWailaConfigHandler) {
/*     */     return BlockDataProvider$.MODULE$.getWailaTail(paramItemStack, paramList, paramIWailaDataAccessor, paramIWailaConfigHandler);
/*     */   }
/*     */   
/*     */   public static List<String> getWailaHead(ItemStack paramItemStack, List<String> paramList, IWailaDataAccessor paramIWailaDataAccessor, IWailaConfigHandler paramIWailaConfigHandler) {
/*     */     return BlockDataProvider$.MODULE$.getWailaHead(paramItemStack, paramList, paramIWailaDataAccessor, paramIWailaConfigHandler);
/*     */   }
/*     */   
/*     */   public static ItemStack getWailaStack(IWailaDataAccessor paramIWailaDataAccessor, IWailaConfigHandler paramIWailaConfigHandler) {
/*     */     return BlockDataProvider$.MODULE$.getWailaStack(paramIWailaDataAccessor, paramIWailaConfigHandler);
/*     */   }
/*     */   
/*     */   public static List<String> getWailaBody(ItemStack paramItemStack, List<String> paramList, IWailaDataAccessor paramIWailaDataAccessor, IWailaConfigHandler paramIWailaConfigHandler) {
/*     */     return BlockDataProvider$.MODULE$.getWailaBody(paramItemStack, paramList, paramIWailaDataAccessor, paramIWailaConfigHandler);
/*     */   }
/*     */   
/*     */   public static NBTTagCompound getNBTData(EntityPlayerMP paramEntityPlayerMP, TileEntity paramTileEntity, NBTTagCompound paramNBTTagCompound, World paramWorld, int paramInt1, int paramInt2, int paramInt3) {
/*     */     return BlockDataProvider$.MODULE$.getNBTData(paramEntityPlayerMP, paramTileEntity, paramNBTTagCompound, paramWorld, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public static void init(IWailaRegistrar paramIWailaRegistrar) {
/*     */     BlockDataProvider$.MODULE$.init(paramIWailaRegistrar);
/*     */   }
/*     */   
/*     */   public static String ConfigComponentName() {
/*     */     return BlockDataProvider$.MODULE$.ConfigComponentName();
/*     */   }
/*     */   
/*     */   public static String ConfigEnergy() {
/*     */     return BlockDataProvider$.MODULE$.ConfigEnergy();
/*     */   }
/*     */   
/*     */   public static String ConfigAddress() {
/*     */     return BlockDataProvider$.MODULE$.ConfigAddress();
/*     */   }
/*     */   
/*     */   public final class BlockDataProvider$$anonfun$getNBTData$1
/*     */     extends AbstractFunction1<ForgeDirection, Node>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final TileEntity x2$1;
/*     */     
/*     */     public final Node apply(ForgeDirection x$1) {
/*  68 */       return ((SidedEnvironment)this.x2$1).sidedNode(x$1); } public BlockDataProvider$$anonfun$getNBTData$1(TileEntity x2$1) {} } public final class BlockDataProvider$$anonfun$getNBTData$2 extends AbstractFunction1<Node, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Node x$1) {
/*  69 */       return BlockDataProvider$.MODULE$.li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(x$1, new NBTTagCompound(), this.tileEntity$1);
/*     */     }
/*     */     private final TileEntity tileEntity$1;
/*     */     
/*     */     public BlockDataProvider$$anonfun$getNBTData$2(TileEntity tileEntity$1) {} }
/*     */   
/*     */   public final class BlockDataProvider$$anonfun$ignoreSidedness$1$1 extends AbstractFunction1<ForgeDirection, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final NBTTagCompound nodeTag$1;
/*     */     
/*     */     public final NBTTagCompound apply(ForgeDirection x$2) {
/*  79 */       return this.nodeTag$1;
/*     */     }
/*     */     public BlockDataProvider$$anonfun$ignoreSidedness$1$1(NBTTagCompound nodeTag$1) {} }
/*     */   public final class BlockDataProvider$$anonfun$getNBTData$3 extends AbstractFunction1<Component, String> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final String apply(Component x$3) {
/*  85 */       return x$3.address();
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class BlockDataProvider$$anonfun$getNBTData$4
/*     */     extends AbstractFunction1<Node, NBTTagCompound>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final TileEntity tileEntity$1;
/*     */     
/*     */     private final NBTTagCompound tag$1;
/*     */     
/*     */     public final NBTTagCompound apply(Node x$4) {
/* 101 */       return BlockDataProvider$.MODULE$.li$cil$oc$integration$waila$BlockDataProvider$$writeNode$1(x$4, this.tag$1, this.tileEntity$1);
/*     */     }
/*     */     
/*     */     public BlockDataProvider$$anonfun$getNBTData$4(TileEntity tileEntity$1, NBTTagCompound tag$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\waila\BlockDataProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */