/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.internal.TextBuffer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ public abstract class TextBuffer$class {
/* 12 */   public static TextBuffer buffer(TextBuffer $this) { ItemStack screenItem = Items.get("screen1").createItemStack(1);
/* 13 */     TextBuffer buffer = (TextBuffer)Driver.driverFor(screenItem, $this.getClass()).createEnvironment(screenItem, $this);
/* 14 */     Tuple2 tuple2 = Settings$.MODULE$.screenResolutionsByTier()[$this.tier()]; if (tuple2 != null) { int maxWidth = tuple2._1$mcI$sp(), maxHeight = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(maxWidth, maxHeight), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 15 */       buffer.setMaximumResolution(i, j);
/* 16 */       buffer.setMaximumColorDepth(Settings$.MODULE$.screenDepthsByTier()[$this.tier()]);
/* 17 */       return buffer; }
/*    */     
/*    */     throw new MatchError(tuple2); } public static void $init$(TextBuffer $this) {} public static Node node(TextBuffer $this) {
/* 20 */     return $this.buffer().node();
/*    */   }
/*    */ 
/*    */   
/*    */   public static void updateEntity(TextBuffer $this) {
/* 25 */     $this.li$cil$oc$common$tileentity$traits$TextBuffer$$super$updateEntity();
/* 26 */     if ($this.isClient() || $this.isConnected()) {
/* 27 */       $this.buffer().update();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void readFromNBTForServer(TextBuffer $this, NBTTagCompound nbt) {
/* 34 */     $this.li$cil$oc$common$tileentity$traits$TextBuffer$$super$readFromNBTForServer(nbt);
/* 35 */     $this.buffer().load(nbt);
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(TextBuffer $this, NBTTagCompound nbt) {
/* 39 */     $this.li$cil$oc$common$tileentity$traits$TextBuffer$$super$writeToNBTForServer(nbt);
/* 40 */     $this.buffer().save(nbt);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void readFromNBTForClient(TextBuffer $this, NBTTagCompound nbt) {
/* 45 */     $this.li$cil$oc$common$tileentity$traits$TextBuffer$$super$readFromNBTForClient(nbt);
/* 46 */     $this.buffer().load(nbt);
/*    */   }
/*    */   
/*    */   public static void writeToNBTForClient(TextBuffer $this, NBTTagCompound nbt) {
/* 50 */     $this.li$cil$oc$common$tileentity$traits$TextBuffer$$super$writeToNBTForClient(nbt);
/* 51 */     $this.buffer().save(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\TextBuffer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */