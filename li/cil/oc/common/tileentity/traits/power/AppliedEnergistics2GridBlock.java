/*     */ package li.cil.oc.common.tileentity.traits.power;
/*     */ 
/*     */ import appeng.api.networking.GridFlags;
/*     */ import appeng.api.networking.GridNotification;
/*     */ import appeng.api.networking.IGrid;
/*     */ import appeng.api.networking.IGridBlock;
/*     */ import appeng.api.networking.IGridHost;
/*     */ import appeng.api.util.AEColor;
/*     */ import appeng.api.util.DimensionalCoord;
/*     */ import java.util.EnumSet;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.Null$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\025b\001B\001\003\001E\021A$\0219qY&,G-\0228fe\036L7\017^5dgJ:%/\0333CY>\0347N\003\002\004\t\005)\001o\\<fe*\021QAB\001\007iJ\f\027\016^:\013\005\035A\021A\003;jY\026,g\016^5us*\021\021BC\001\007G>lWn\0348\013\005-a\021AA8d\025\tia\"A\002dS2T\021aD\001\003Y&\034\001aE\002\001%i\001\"a\005\r\016\003QQ!!\006\f\002\t1\fgn\032\006\002/\005!!.\031<b\023\tIBC\001\004PE*,7\r\036\t\0037\tj\021\001\b\006\003;y\t!B\\3uo>\0248.\0338h\025\ty\002%A\002ba&T\021!I\001\007CB\004XM\\4\n\005\rb\"AC%He&$'\t\\8dW\"AQ\005\001BC\002\023\005a%\001\006uS2,WI\034;jif,\022a\n\t\003Q%j\021AA\005\003U\t\0211#\0219qY&,G-\0228fe\036L7\017^5dgJB\001\002\f\001\003\002\003\006IaJ\001\fi&dW-\0228uSRL\b\005C\003/\001\021\005q&\001\004=S:LGO\020\013\003aE\002\"\001\013\001\t\013\025j\003\031A\024\t\013M\002A\021\t\033\002#\035,G/\0233mKB{w/\032:Vg\006<W\rF\0016!\t1\024(D\0018\025\005A\024!B:dC2\f\027B\001\0368\005\031!u.\0362mK\")A\b\001C!{\005Aq-\032;GY\006<7\017F\001?!\ry$\tR\007\002\001*\021\021IF\001\005kRLG.\003\002D\001\n9QI\\;n'\026$\bCA\016F\023\t1EDA\005He&$g\t\\1hg\")\001\n\001C\001\023\006\t\022n],pe2$\027iY2fgN\f'\r\\3\026\003)\003\"AN&\n\0051;$a\002\"p_2,\027M\034\005\006\035\002!\taT\001\022SN<vN\0357e\003\016\034Wm]:jE2,G#\001&\t\013E\003A\021\t*\002\027\035,G\017T8dCRLwN\034\013\002'B\021AKV\007\002+*\021\021IH\005\003/V\023\001\003R5nK:\034\030n\0348bY\016{wN\0353\t\013e\003A\021\t.\002\031\035,Go\022:jI\016{Gn\034:\025\003m\003\"\001\026/\n\005u+&aB!F\007>dwN\035\005\006?\002!\t\005Y\001\023_:<%/\0333O_RLg-[2bi&|g\016\006\002bIB\021aGY\005\003G^\022A!\0268ji\")QM\030a\001M\006\021\001/\r\t\0037\035L!\001\033\017\003!\035\023\030\016\032(pi&4\027nY1uS>t\007\"\0026\001\t\003Z\027\001E:fi:+Go^8sWN#\030\r^;t)\r\tG\016\035\005\006K&\004\r!\034\t\00379L!a\034\017\003\013%;%/\0333\t\013EL\007\031\001:\002\005A\024\004C\001\034t\023\t!xGA\002J]RDQA\036\001\005B]\f1cZ3u\007>tg.Z2uC\ndWmU5eKN$\022\001\037\t\004\tK\bc\001>\002\0045\t1P\003\002By*\021\021\" \006\003}~\fa\"\\5oK\016\024\030M\032;g_J<WM\003\002\002\002\005\031a.\032;\n\007\005\0251P\001\bG_J<W\rR5sK\016$\030n\0348\t\017\005%\001\001\"\021\002\f\005Qq-\032;NC\016D\027N\\3\025\005\0055\001cA\016\002\020%\031\021\021\003\017\003\023%;%/\0333I_N$\bbBA\013\001\021\005\023qC\001\fOJLGm\0215b]\036,G\rF\001b\021\035\tY\002\001C!\003;\t\001dZ3u\033\006\034\007.\0338f%\026\004(/Z:f]R\fG/[8o)\t\ty\002E\0027\003CI1!a\t8\005\021qU\017\0347")
/*     */ public class AppliedEnergistics2GridBlock
/*     */   implements IGridBlock
/*     */ {
/*     */   private final AppliedEnergistics2 tileEntity;
/*     */   
/*     */   public AppliedEnergistics2 tileEntity() {
/* 111 */     return this.tileEntity; } public AppliedEnergistics2GridBlock(AppliedEnergistics2 tileEntity) {} public double getIdlePowerUsage() {
/* 112 */     return 0.0D;
/*     */   } public EnumSet<GridFlags> getFlags() {
/* 114 */     return EnumSet.noneOf(GridFlags.class);
/*     */   }
/*     */   public boolean isWorldAccessable() {
/* 117 */     return true;
/*     */   }
/*     */   public boolean isWorldAccessible() {
/* 120 */     return true;
/*     */   } public DimensionalCoord getLocation() {
/* 122 */     return new DimensionalCoord((TileEntity)tileEntity());
/*     */   } public AEColor getGridColor() {
/* 124 */     return AEColor.Transparent;
/*     */   }
/*     */   public void onGridNotification(GridNotification p1) {}
/*     */   
/*     */   public void setNetworkStatus(IGrid p1, int p2) {}
/*     */   
/* 130 */   public EnumSet<ForgeDirection> getConnectableSides() { return EnumSet.copyOf(WrapAsJava$.MODULE$.seqAsJavaList((Seq)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).filter((Function1)new AppliedEnergistics2GridBlock$$anonfun$getConnectableSides$1(this))).toList())); } public final class AppliedEnergistics2GridBlock$$anonfun$getConnectableSides$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public final boolean apply(ForgeDirection side) { return this.$outer.tileEntity().canConnectPower(side); }
/*     */      public static final long serialVersionUID = 0L; public AppliedEnergistics2GridBlock$$anonfun$getConnectableSides$1(AppliedEnergistics2GridBlock $outer) {} } public IGridHost getMachine() {
/* 132 */     return (IGridHost)tileEntity();
/*     */   }
/*     */   public void gridChanged() {}
/*     */   public Null$ getMachineRepresentation() {
/* 136 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\AppliedEnergistics2GridBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */