/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.math.package$;
/*    */ 
/*    */ public abstract class Common$class {
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static boolean hasConnector(Common $this, ForgeDirection side) {
/* 12 */     return false;
/*    */   } public static void $init$(Common $this) {} public static Option connector(Common $this, ForgeDirection side) {
/* 14 */     return (Option)None$.MODULE$;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void tryAllSides(Common $this, Function2 provider, Function1 fromOther, Function1 toOther) {
/* 23 */     DoubleRef budget = DoubleRef.create($this.energyThroughput() * Settings$.MODULE$.get().tickFrequency());
/* 24 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Common$$anonfun$tryAllSides$1($this, budget, provider, fromOther, toOther));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean canConnectPower(Common $this, ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   3: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */     //   6: invokevirtual ignorePower : ()Z
/*    */     //   9: ifne -> 76
/*    */     //   12: aload_1
/*    */     //   13: ifnull -> 76
/*    */     //   16: aload_1
/*    */     //   17: getstatic net/minecraftforge/common/util/ForgeDirection.UNKNOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   20: astore_2
/*    */     //   21: dup
/*    */     //   22: ifnonnull -> 33
/*    */     //   25: pop
/*    */     //   26: aload_2
/*    */     //   27: ifnull -> 76
/*    */     //   30: goto -> 40
/*    */     //   33: aload_2
/*    */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   37: ifne -> 76
/*    */     //   40: aload_0
/*    */     //   41: invokeinterface isClient : ()Z
/*    */     //   46: ifeq -> 59
/*    */     //   49: aload_0
/*    */     //   50: aload_1
/*    */     //   51: invokeinterface hasConnector : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*    */     //   56: goto -> 69
/*    */     //   59: aload_0
/*    */     //   60: aload_1
/*    */     //   61: invokeinterface connector : (Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Option;
/*    */     //   66: invokevirtual isDefined : ()Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 77
/*    */     //   76: iconst_0
/*    */     //   77: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 0
/*    */     //   #39	-> 40
/*    */     //   #38	-> 72
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	78	0	$this	Lli/cil/oc/common/tileentity/traits/power/Common;
/*    */     //   0	78	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean tryChangeBuffer$default$3(Common $this)
/*    */   {
/* 49 */     return true; } public static double tryChangeBuffer(Common $this, ForgeDirection side, double amount, boolean doReceive) {
/*    */     double d;
/* 51 */     Option<Connector> option = $this.connector(side);
/* 52 */     if (option instanceof Some) { Some some = (Some)option; Connector node = (Connector)some.x();
/* 53 */       double cappedAmount = package$.MODULE$.max(0.0D, package$.MODULE$.min(package$.MODULE$.min($this.energyThroughput(), amount), $this.globalDemand(side)));
/* 54 */       d = doReceive ? (cappedAmount - node.changeBuffer(cappedAmount)) : 
/* 55 */         cappedAmount; }
/* 56 */     else { d = 0.0D; }
/*    */     
/*    */     return ($this.isClient() || Settings$.MODULE$.get().ignorePower()) ? 0.0D : d;
/*    */   } public static double globalBuffer(Common $this, ForgeDirection side) {
/*    */     double d;
/* 61 */     Option<Connector> option = $this.connector(side);
/* 62 */     if (option instanceof Some) { Some some = (Some)option; Connector node = (Connector)some.x(); d = node.globalBuffer(); }
/* 63 */     else { d = 0.0D; }
/*    */     
/*    */     return $this.isClient() ? 0.0D : d;
/*    */   }
/*    */   public static double globalBufferSize(Common $this, ForgeDirection side) { double d;
/* 68 */     Option<Connector> option = $this.connector(side);
/* 69 */     if (option instanceof Some) { Some some = (Some)option; Connector node = (Connector)some.x(); d = node.globalBufferSize(); }
/* 70 */     else { d = 0.0D; }
/*    */     
/*    */     return $this.isClient() ? 0.0D : d; } public static double globalDemand(Common $this, ForgeDirection side) {
/* 73 */     return package$.MODULE$.max(0.0D, package$.MODULE$.min($this.energyThroughput(), $this.globalBufferSize(side) - $this.globalBuffer(side)));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Common$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */