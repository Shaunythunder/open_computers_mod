/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.server.PacketSender$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public abstract class Colored$class {
/*    */   public static void $init$(Colored $this) {
/* 11 */     $this.li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(0);
/*    */   } public static int color(Colored $this) {
/* 13 */     return $this.li$cil$oc$common$tileentity$traits$Colored$$_color();
/*    */   } public static void color_$eq(Colored $this, int value) {
/* 15 */     if (value != $this.li$cil$oc$common$tileentity$traits$Colored$$_color()) {
/* 16 */       $this.li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(value);
/* 17 */       $this.onColorChanged();
/*    */     } 
/*    */   } public static boolean consumesDye(Colored $this) {
/* 20 */     return false;
/*    */   } public static int getColor(Colored $this) {
/* 22 */     return $this.color();
/*    */   } public static void setColor(Colored $this, int value) {
/* 24 */     $this.color_$eq(value);
/*    */   }
/*    */   public static void onColorChanged(Colored $this) {
/* 27 */     if ($this.world() != null && $this.isServer()) {
/* 28 */       PacketSender$.MODULE$.sendColorChange($this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void readFromNBTForServer(Colored $this, NBTTagCompound nbt) {
/* 33 */     $this.li$cil$oc$common$tileentity$traits$Colored$$super$readFromNBTForServer(nbt);
/* 34 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString())) {
/* 35 */       $this.li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString()));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(Colored $this, NBTTagCompound nbt) {
/* 40 */     $this.li$cil$oc$common$tileentity$traits$Colored$$super$writeToNBTForServer(nbt);
/* 41 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("renderColor").toString(), $this.li$cil$oc$common$tileentity$traits$Colored$$_color());
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void readFromNBTForClient(Colored $this, NBTTagCompound nbt) {
/* 46 */     $this.li$cil$oc$common$tileentity$traits$Colored$$super$readFromNBTForClient(nbt);
/* 47 */     $this.li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(nbt.func_74762_e("renderColor"));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForClient(Colored $this, NBTTagCompound nbt) {
/* 51 */     $this.li$cil$oc$common$tileentity$traits$Colored$$super$writeToNBTForClient(nbt);
/* 52 */     nbt.func_74768_a("renderColor", $this.li$cil$oc$common$tileentity$traits$Colored$$_color());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Colored$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */