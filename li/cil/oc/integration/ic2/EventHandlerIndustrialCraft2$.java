/*     */ package li.cil.oc.integration.ic2;
/*     */ import ic2.api.crops.CropCard;
/*     */ import ic2.api.crops.ICropTile;
/*     */ import ic2.api.item.IElectricItemManager;
/*     */ import li.cil.oc.api.event.GeolyzerEvent;
/*     */ import li.cil.oc.api.event.RobotUsedToolEvent;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class EventHandlerIndustrialCraft2$ {
/*     */   @SubscribeEvent
/*     */   public void onGeolyzerAnalyze(GeolyzerEvent.Analyze e) {
/*  18 */     World world = e.host.world();
/*  19 */     TileEntity tileEntity = world.func_147438_o(e.x, e.y, e.z);
/*  20 */     if (tileEntity instanceof ICropTile) { TileEntity tileEntity1 = tileEntity;
/*  21 */       ((ICropTile)tileEntity1).setScanLevel((byte)4);
/*  22 */       CropCard cc = ((ICropTile)tileEntity1).getCrop();
/*     */       
/*  24 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:name"), cc.name()));
/*  25 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:tier"), BoxesRunTime.boxToInteger(cc.tier())));
/*  26 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:size"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getSize())));
/*  27 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:maxSize"), BoxesRunTime.boxToInteger(cc.maxSize())));
/*  28 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:growth"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getGrowth())));
/*  29 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:gain"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getGain())));
/*  30 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:resistance"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getResistance())));
/*  31 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:fertilizer"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getNutrientStorage())));
/*  32 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:hydration"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getHydrationStorage())));
/*  33 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:weedex"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getWeedExStorage())));
/*  34 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:humidity"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getHumidity())));
/*  35 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:nutrients"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getNutrients())));
/*  36 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:air"), BoxesRunTime.boxToInteger(((ICropTile)tileEntity1).getAirQuality())));
/*  37 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(e.data).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("crop:roots"), BoxesRunTime.boxToInteger(cc.getrootslength((ICropTile)tileEntity1)))); BoxedUnit boxedUnit = (cc == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/*  39 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public static final EventHandlerIndustrialCraft2$ MODULE$; @SubscribeEvent
/*     */   public void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate e) {
/*     */     scala.None$ none$2, none$4;
/*  44 */     Item item1 = e.toolBeforeUse.func_77973_b();
/*  45 */     if (item1 instanceof ISpecialElectricItem) { Item item = item1; Option option = scala.Option$.MODULE$.apply(((ISpecialElectricItem)item).getManager(e.toolBeforeUse)); }
/*  46 */     else if (item1 instanceof IElectricItem) { Option option = scala.Option$.MODULE$.apply(ElectricItem.manager); }
/*  47 */     else { none$2 = scala.None$.MODULE$; }
/*     */      scala.None$ none$1 = none$2;
/*  49 */     Item item2 = e.toolAfterUse.func_77973_b();
/*  50 */     if (item2 instanceof ISpecialElectricItem) { Item item = item2; Option option = scala.Option$.MODULE$.apply(((ISpecialElectricItem)item).getManager(e.toolAfterUse)); }
/*  51 */     else if (item2 instanceof IElectricItem) { Option option = scala.Option$.MODULE$.apply(ElectricItem.manager); }
/*  52 */     else { none$4 = scala.None$.MODULE$; }
/*     */      scala.None$ none$3 = none$4;
/*  54 */     Tuple2 tuple2 = new Tuple2(none$1, none$3); if (tuple2 != null) {
/*  55 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; IElectricItemManager managerBefore = (IElectricItemManager)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; IElectricItemManager managerAfter = (IElectricItemManager)some1.x();
/*  56 */           double damage = managerBefore.getCharge(e.toolBeforeUse) - managerAfter.getCharge(e.toolAfterUse);
/*     */           
/*  58 */           double actualDamage = damage * e.getDamageRate();
/*  59 */           double repairedDamage = 
/*  60 */             (e.agent.player().func_70681_au().nextDouble() > 0.5D) ? (
/*  61 */             damage - (int)scala.math.package$.MODULE$.floor(actualDamage)) : (
/*     */             
/*  63 */             damage - (int)scala.math.package$.MODULE$.ceil(actualDamage));
/*  64 */           managerAfter.charge(e.toolAfterUse, repairedDamage, 2147483647, true, false); BoxedUnit boxedUnit1 = (damage > false) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  }
/*     */     
/*  66 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */   
/*     */   public double getDurability(ItemStack stack) {
/*     */     double d;
/*  71 */     Item item = stack.func_77973_b();
/*  72 */     if (item instanceof ISpecialElectricItem) { Item item1 = item; d = ((ISpecialElectricItem)item1).getManager(stack).getCharge(stack) / ((IElectricItem)item1).getMaxCharge(stack); }
/*  73 */     else if (item instanceof IElectricItem) { Item item1 = item; d = ElectricItem.manager.getCharge(stack) / ((IElectricItem)item1).getMaxCharge(stack); }
/*  74 */     else { d = Double.NaN; }
/*     */     
/*     */     return d;
/*     */   } public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*     */     boolean bool;
/*  79 */     Item item = player.func_70694_bm().func_77973_b();
/*  80 */     if (item instanceof ItemToolWrench) { ItemToolWrench itemToolWrench = (ItemToolWrench)item;
/*     */       
/*  82 */       itemToolWrench.damage(player.func_70694_bm(), 1, player);
/*  83 */       bool = changeDurability ? true : 
/*     */         
/*  85 */         itemToolWrench.canTakeDamage(player.func_70694_bm(), 1); }
/*  86 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*  90 */   public boolean isWrench(ItemStack stack) { return stack.func_77973_b() instanceof ItemToolWrench; }
/*     */   public boolean canCharge(ItemStack stack) { boolean bool;
/*  92 */     Item item = stack.func_77973_b();
/*  93 */     if (item instanceof IElectricItem) { Item item1 = item; bool = (((IElectricItem)item1).getMaxCharge(stack) > false) ? true : false; }
/*  94 */     else { bool = false; }
/*     */     
/*     */     return bool; } public double charge(ItemStack stack, double amount, boolean simulate) { scala.None$ none$2;
/*     */     double d;
/*  98 */     Item item = stack.func_77973_b();
/*  99 */     if (item instanceof ISpecialElectricItem) { Item item1 = item; Option option = scala.Option$.MODULE$.apply(((ISpecialElectricItem)item1).getManager(stack)); }
/* 100 */     else if (item instanceof IElectricItem) { Option option = scala.Option$.MODULE$.apply(ElectricItem.manager); }
/* 101 */     else { none$2 = scala.None$.MODULE$; }
/*     */      scala.None$ none$1 = none$2;
/* 103 */     if (none$1 instanceof Some) { Some some = (Some)none$1; IElectricItemManager manager = (IElectricItemManager)some.x(); d = amount - li.cil.oc.integration.util.Power$.MODULE$.fromEU(manager.charge(stack, li.cil.oc.integration.util.Power$.MODULE$.toEU(amount), 2147483647, true, false)); }
/* 104 */     else { d = amount; }
/*     */     
/*     */     return d; } private EventHandlerIndustrialCraft2$() {
/* 107 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\EventHandlerIndustrialCraft2$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */