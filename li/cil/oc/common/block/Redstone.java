/*    */ package li.cil.oc.common.block;
/*    */ import java.util.List;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import li.cil.oc.util.Tooltip$;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!4A!\001\002\001\033\tA!+\0323ti>tWM\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\016%\026$7\017^8oK\006;\030M]3\t\013M\001A\021\001\013\002\rqJg.\033;?)\005)\002CA\b\001\021\0259\002\001\"\025\031\0039\031Wo\035;p[R+\007\020^;sKN,\022!\007\t\0045uyR\"A\016\013\003q\tQa]2bY\006L!AH\016\003\013\005\023(/Y=\021\007i\001#%\003\002\"7\t1q\n\035;j_:\004\"a\t\024\017\005i!\023BA\023\034\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025Z\002\"\002\026\001\t#Z\023a\003;p_2$\030\016\035+bS2$b\001L\0305\001&\033\006C\001\016.\023\tq3D\001\003V]&$\b\"\002\031*\001\004\t\024\001C7fi\006$\027\r^1\021\005i\021\024BA\032\034\005\rIe\016\036\005\006k%\002\rAN\001\006gR\f7m\033\t\003oyj\021\001\017\006\003si\nA!\033;f[*\0211\bP\001\n[&tWm\031:bMRT\021!P\001\004]\026$\030BA 9\005%IE/Z7Ti\006\0347\016C\003BS\001\007!)\001\004qY\006LXM\035\t\003\007\036k\021\001\022\006\003\003\026S!A\022\036\002\r\025tG/\033;z\023\tAEI\001\007F]RLG/\037)mCf,'\017C\003KS\001\0071*A\004u_>dG/\0339\021\0071\013&%D\001N\025\tqu*\001\003vi&d'\"\001)\002\t)\fg/Y\005\003%6\023A\001T5ti\")A+\013a\001+\006A\021\r\032<b]\016,G\r\005\002\033-&\021qk\007\002\b\005>|G.Z1o\021\025I\006\001\"\021[\003A\031'/Z1uKRKG.Z#oi&$\030\020F\002\\A\036\004\"\001X0\016\003uS!A\030\003\002\025QLG.Z3oi&$\0300\003\002\002;\")\021\r\027a\001E\006)qo\034:mIB\0211-Z\007\002I*\021\021MO\005\003M\022\024QaV8sY\022DQ\001\r-A\002E\002")
/*    */ public class Redstone extends RedstoneAware {
/*    */   public Option<String>[] customTextures() {
/* 13 */     (new Option[6])[0] = 
/* 14 */       (Option)new Some("RedstoneBottom");
/* 15 */     (new Option[6])[1] = (Option)new Some("RedstoneTop");
/* 16 */     (new Option[6])[2] = (Option)new Some("RedstoneNorth");
/* 17 */     (new Option[6])[3] = (Option)new Some("RedstoneSouth");
/* 18 */     (new Option[6])[4] = (Option)new Some("RedstoneWest");
/* 19 */     (new Option[6])[5] = (Option)new Some("RedstoneEast");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */ 
/*    */   
/*    */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 25 */     super.tooltipTail(metadata, stack, player, tooltip, advanced);
/* 26 */     Mods$.MODULE$.ProjectRedTransmission().isAvailable() ? 
/* 27 */       BoxesRunTime.boxToBoolean(tooltip.addAll(Tooltip$.MODULE$.get("RedstoneCard.ProjectRed", (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])))) : BoxedUnit.UNIT;
/*    */     
/* 29 */     Mods$.MODULE$.RedLogic().isAvailable() ? 
/* 30 */       BoxesRunTime.boxToBoolean(tooltip.addAll(Tooltip$.MODULE$.get("RedstoneCard.RedLogic", (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])))) : BoxedUnit.UNIT;
/*    */     
/* 32 */     if (Mods$.MODULE$.MineFactoryReloaded().isAvailable()) {
/* 33 */       tooltip.addAll(Tooltip$.MODULE$.get("RedstoneCard.RedNet", (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public li.cil.oc.common.tileentity.Redstone createTileEntity(World world, int metadata) {
/* 39 */     return new li.cil.oc.common.tileentity.Redstone();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Redstone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */