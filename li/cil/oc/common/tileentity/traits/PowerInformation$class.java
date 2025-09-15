/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.server.PacketSender$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.math.package$;
/*    */ 
/*    */ public abstract class PowerInformation$class {
/*    */   public static void $init$(PowerInformation $this) {
/* 10 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio_$eq(-1.0D);
/*    */     
/* 12 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync_$eq(0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void updatePowerInformation(PowerInformation $this) {
/* 23 */     double ratio = ($this.globalBufferSize() > false) ? ($this.globalBuffer() / $this.globalBufferSize()) : 0.0D;
/* 24 */     if (shouldSync($this, ratio) || hasChangedSignificantly($this, ratio)) {
/* 25 */       $this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio_$eq(ratio);
/* 26 */       PacketSender$.MODULE$.sendPowerState($this);
/*    */     } 
/*    */   }
/*    */   private static boolean hasChangedSignificantly(PowerInformation $this, double ratio) {
/* 30 */     return ($this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio() < false || package$.MODULE$.abs($this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio() - ratio) > 0.05D);
/*    */   }
/*    */   private static boolean shouldSync(PowerInformation $this, double ratio) {
/* 33 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync_$eq($this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync() - 1);
/*    */     
/* 35 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync_$eq(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper((int)(100 / Settings$.MODULE$.get().tickFrequency())), 1));
/* 36 */     return ($this.li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync() <= 0) ? (($this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio() != ratio)) : false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void readFromNBTForClient(PowerInformation $this, NBTTagCompound nbt) {
/* 43 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$super$readFromNBTForClient(nbt);
/* 44 */     $this.globalBuffer_$eq(nbt.func_74769_h("globalBuffer"));
/* 45 */     $this.globalBufferSize_$eq(nbt.func_74769_h("globalBufferSize"));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForClient(PowerInformation $this, NBTTagCompound nbt) {
/* 49 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$super$writeToNBTForClient(nbt);
/* 50 */     $this.li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio_$eq(($this.globalBufferSize() > false) ? ($this.globalBuffer() / $this.globalBufferSize()) : 0.0D);
/* 51 */     nbt.func_74780_a("globalBuffer", $this.globalBuffer());
/* 52 */     nbt.func_74780_a("globalBufferSize", $this.globalBufferSize());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\PowerInformation$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */