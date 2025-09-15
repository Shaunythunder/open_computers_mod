/*    */ package li.cil.oc.integration.gregtech;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import gregtech.api.items.MetaGeneratedTool;
/*    */ import li.cil.oc.api.event.GeolyzerEvent;
/*    */ import li.cil.oc.api.event.RobotUsedToolEvent;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class EventHandlerGregTech$ {
/*    */   @SubscribeEvent
/*    */   public void onGeolyzerAnalyze(GeolyzerEvent.Analyze e) {
/* 15 */     World world = e.host.world();
/* 16 */     TileEntity tileEntity = world.func_147438_o(e.x, e.y, e.z);
/* 17 */     if (tileEntity instanceof gregtech.api.interfaces.tileentity.IGregTechTileEntity) { TileEntity tileEntity1 = tileEntity;
/* 18 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("facing"), ((ITurnable)tileEntity1).getFrontFacing().name()));
/* 19 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("sensorInformation"), ((IGregTechDeviceInformation)tileEntity1).getInfoData())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 20 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   public static final EventHandlerGregTech$ MODULE$;
/*    */   @SubscribeEvent
/*    */   public void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate e) {
/* 26 */     Tuple2 tuple2 = new Tuple2(e.toolBeforeUse.func_77973_b(), e.toolAfterUse.func_77973_b()); if (tuple2 != null) {
/* 27 */       Item itemBefore = (Item)tuple2._1(), itemAfter = (Item)tuple2._2(); if (itemBefore instanceof gregtech.api.interfaces.IDamagableItem && itemAfter instanceof gregtech.api.interfaces.IDamagableItem) {
/* 28 */         long damage = MetaGeneratedTool.getToolDamage(e.toolAfterUse) - MetaGeneratedTool.getToolDamage(e.toolBeforeUse);
/*    */         
/* 30 */         double actualDamage = damage * e.getDamageRate();
/* 31 */         long repairedDamage = 
/* 32 */           (e.agent.player().func_70681_au().nextDouble() > 0.5D) ? (
/* 33 */           damage - (int)scala.math.package$.MODULE$.floor(actualDamage)) : (
/*    */           
/* 35 */           damage - (int)scala.math.package$.MODULE$.ceil(actualDamage));
/* 36 */         MetaGeneratedTool.setToolDamage(e.toolAfterUse, MetaGeneratedTool.getToolDamage(e.toolAfterUse) - repairedDamage); BoxedUnit boxedUnit1 = (damage > 0L) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*    */       } 
/* 38 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */   
/*    */   public double getDurability(ItemStack stack) {
/*    */     double d;
/* 43 */     Item item = stack.func_77973_b();
/* 44 */     if (item instanceof gregtech.api.interfaces.IDamagableItem) { d = 1.0D - MetaGeneratedTool.getToolDamage(stack) / MetaGeneratedTool.getToolMaxDamage(stack); }
/* 45 */     else { d = Double.NaN; }
/*    */     
/*    */     return d; } private EventHandlerGregTech$() {
/* 48 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\EventHandlerGregTech$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */