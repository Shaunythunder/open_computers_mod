/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ 
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Function2;
/*    */ 
/*    */ public abstract class RotaryCraft$class
/*    */ {
/*    */   private static boolean useRotaryCraftPower(RotaryCraft $this) {
/* 13 */     return ($this.isServer() && Mods$.MODULE$.RotaryCraft().isAvailable());
/*    */   } public static void $init$(RotaryCraft $this) {
/* 15 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(0);
/* 16 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(0);
/* 17 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(0L);
/* 18 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(0);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void updateEntity(RotaryCraft $this) {
/* 23 */     if (useRotaryCraftPower($this)) updateEnergy($this); 
/* 24 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$super$updateEntity();
/*    */   }
/*    */   
/*    */   @Method(modid = "RotaryCraft")
/*    */   private static void updateEnergy(RotaryCraft $this) {
/* 29 */     if ($this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 30 */       $this.tryAllSides((Function2<Object, ForgeDirection, Object>)new RotaryCraft$$anonfun$updateEnergy$3($this), 
/*    */ 
/*    */ 
/*    */           
/* 34 */           (Function1<Object, Object>)new RotaryCraft$$anonfun$updateEnergy$1($this), (Function1<Object, Object>)new RotaryCraft$$anonfun$updateEnergy$2($this));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Method(modid = "RotaryCraft")
/*    */   public static int getOmega(RotaryCraft $this) {
/* 42 */     return $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega();
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static int getTorque(RotaryCraft $this) {
/* 45 */     return $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque();
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static long getPower(RotaryCraft $this) {
/* 48 */     return $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power();
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static String getName(RotaryCraft $this) {
/* 51 */     return "OpenComputers";
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static int getIORenderAlpha(RotaryCraft $this) {
/* 54 */     return $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha();
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static void setIORenderAlpha(RotaryCraft $this, int value) {
/* 57 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(value);
/*    */   }
/*    */ 
/*    */   
/*    */   @Method(modid = "RotaryCraft")
/*    */   public static void setOmega(RotaryCraft $this, int value) {
/* 63 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(value);
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static void setTorque(RotaryCraft $this, int value) {
/* 66 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(value);
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static void setPower(RotaryCraft $this, long value) {
/* 69 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(value);
/*    */   }
/*    */   @Method(modid = "RotaryCraft")
/*    */   public static void noInputMachine(RotaryCraft $this) {
/* 73 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(0);
/* 74 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(0);
/* 75 */     $this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(0L);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Method(modid = "RotaryCraft")
/*    */   public static boolean canReadFrom(RotaryCraft $this, ForgeDirection forgeDirection) {
/* 82 */     return true;
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static boolean isReceiving(RotaryCraft $this) {
/* 85 */     return true;
/*    */   } @Method(modid = "RotaryCraft")
/*    */   public static int getMinTorque(RotaryCraft $this, int available) {
/* 88 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\RotaryCraft$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */