/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import appeng.api.networking.crafting.ICraftingPatternDetails;
/*     */ import appeng.api.storage.data.IAEFluidStack;
/*     */ import appeng.api.storage.data.IAEItemStack;
/*     */ import appeng.me.helpers.IGridProxyable;
/*     */ import com.google.common.collect.ImmutableCollection;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraftforge.common.DimensionManager;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ public final class NetworkControl$
/*     */ {
/*     */   public static final NetworkControl$ MODULE$;
/*     */   
/*     */   public IAEItemStack aeCraftItem(IAEItemStack aeItem, TileEntity tile) {
/*     */     IAEItemStack iAEItemStack;
/* 498 */     ImmutableCollection patterns = ((IGridProxyable)tile).getProxy().getCrafting().getCraftingFor(aeItem, null, 0, tile.func_145831_w());
/* 499 */     Option option = scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable((Collection)patterns).find((Function1)new NetworkControl$$anonfun$10(aeItem));
/* 500 */     if (option instanceof Some) { Some some = (Some)option; ICraftingPatternDetails pattern = (ICraftingPatternDetails)some.x(); iAEItemStack = (IAEItemStack)scala.Predef$.MODULE$.refArrayOps((Object[])pattern.getOutputs()).find((Function1)new NetworkControl$$anonfun$aeCraftItem$1(aeItem)).get(); }
/* 501 */     else { iAEItemStack = (IAEItemStack)aeItem.copy().setStackSize(0L); }  return iAEItemStack;
/*     */   } public final class NetworkControl$$anonfun$10 extends AbstractFunction1<ICraftingPatternDetails, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final IAEItemStack aeItem$1; public final boolean apply(ICraftingPatternDetails pattern) { return scala.Predef$.MODULE$.refArrayOps((Object[])pattern.getOutputs()).exists((Function1)new NetworkControl$$anonfun$10$$anonfun$apply$3(this)); } public NetworkControl$$anonfun$10(IAEItemStack aeItem$1) {} public final class NetworkControl$$anonfun$10$$anonfun$apply$3 extends AbstractFunction1<IAEItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(IAEItemStack x$4) { return x$4.isSameType(this.$outer.aeItem$1); } public NetworkControl$$anonfun$10$$anonfun$apply$3(NetworkControl$$anonfun$10 $outer) {} } } public final class NetworkControl$$anonfun$aeCraftItem$1 extends AbstractFunction1<IAEItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IAEItemStack aeItem$1; public final boolean apply(IAEItemStack x$5) { return x$5.isSameType(this.aeItem$1); } public NetworkControl$$anonfun$aeCraftItem$1(IAEItemStack aeItem$1) {} }
/* 506 */   public IAEItemStack aePotentialItem(IAEItemStack aeItem, TileEntity tile) { return (aeItem.getStackSize() <= 0L && aeItem.isCraftable()) ? 
/*     */ 
/*     */       
/* 509 */       aeCraftItem(aeItem, tile) : aeItem; }
/*     */   public final class NetworkControl$$anonfun$hashConvert$1 extends AbstractPartialFunction<Tuple2<Object, Object>, Map<String, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final HashMap hash$1; public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x8, Function1 default) { Tuple2 tuple2 = x8; if (tuple2 != null) { Object k = tuple2._1(), v = tuple2._2(); if (k instanceof String) { String str = (String)k; if (v instanceof Object) { Object object = v; return (B1)scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(this.hash$1).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(str), object)); }  }  }  return (B1)default.apply(x8); } public final boolean isDefinedAt(Tuple2 x8) { Tuple2 tuple2 = x8; if (tuple2 != null) { Object k = tuple2._1(), v = tuple2._2(); if (k instanceof String && v instanceof Object)
/* 513 */           return true;  }  return false; } public NetworkControl$$anonfun$hashConvert$1(HashMap hash$1) {} } public HashMap<String, Object> hashConvert(HashMap value) { HashMap<Object, Object> hash = new HashMap<>();
/* 514 */     scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(value).collect((PartialFunction)new NetworkControl$$anonfun$hashConvert$1(hash), scala.collection.mutable.Iterable$.MODULE$.canBuildFrom());
/* 515 */     return (HashMap)hash; }
/*     */ 
/*     */   
/*     */   public HashMap<String, Object> convert(IAEItemStack aeItem, TileEntity tile) {
/* 519 */     IAEItemStack potentialItem = aePotentialItem(aeItem, tile);
/* 520 */     HashMap[] result = (HashMap[])scala.Predef$.MODULE$.refArrayOps(li.cil.oc.server.driver.Registry$.MODULE$.convert(new Object[] { potentialItem.getItemStack()
/* 521 */           })).collect((PartialFunction)new NetworkControl$$anonfun$6(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(HashMap.class)));
/* 522 */     if (result.length > 0) {
/* 523 */       HashMap<String, Object> hash = result[0];
/*     */ 
/*     */       
/* 526 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(hash).update("size", BoxesRunTime.boxToLong(aeItem.getStackSize()));
/* 527 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(hash).update("isCraftable", BoxesRunTime.boxToBoolean(aeItem.isCraftable()));
/* 528 */       return hash;
/*     */     } 
/* 530 */     return null; } public final class NetworkControl$$anonfun$6 extends AbstractPartialFunction<Object, HashMap<String, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x9, Function1 default) { Object object2, object1 = x9; if (object1 instanceof HashMap) { HashMap<?, ?> hashMap = (HashMap)object1; object2 = NetworkControl$.MODULE$.hashConvert(hashMap); } else { object2 = default.apply(x9); }  return (B1)object2; }
/*     */     public final boolean isDefinedAt(Object x9) { boolean bool; Object object = x9; if (object instanceof HashMap) { bool = true; } else { bool = false; }
/*     */        return bool; } }
/* 534 */   public HashMap<String, Object> convert(IAEFluidStack aeItem, TileEntity tile) { HashMap[] result = (HashMap[])scala.Predef$.MODULE$.refArrayOps(li.cil.oc.server.driver.Registry$.MODULE$.convert(new Object[] { aeItem.getFluidStack()
/* 535 */           })).collect((PartialFunction)new NetworkControl$$anonfun$7(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(HashMap.class)));
/* 536 */     if (result.length > 0) {
/* 537 */       HashMap<String, Object> hash = result[0];
/* 538 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(hash).update("amount", BoxesRunTime.boxToLong(aeItem.getStackSize()));
/* 539 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(hash).update("isCraftable", BoxesRunTime.boxToBoolean(aeItem.isCraftable()));
/* 540 */       return hash;
/*     */     } 
/* 542 */     return null; } public final class NetworkControl$$anonfun$7 extends AbstractPartialFunction<Object, HashMap<String, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x10, Function1 default) { Object object2, object1 = x10; if (object1 instanceof HashMap) { HashMap<?, ?> hashMap = (HashMap)object1; object2 = NetworkControl$.MODULE$.hashConvert(hashMap); } else { object2 = default.apply(x10); }  return (B1)object2; }
/*     */     public final boolean isDefinedAt(Object x10) { boolean bool; Object object = x10; if (object instanceof HashMap) { bool = true; } else { bool = false; }
/*     */        return bool; } }
/* 546 */   public void li$cil$oc$integration$appeng$NetworkControl$$loadController(NBTTagCompound nbt, Function1 f) { if (nbt.func_74764_b("dimension"))
/* 547 */     { int dimension = nbt.func_74762_e("dimension");
/* 548 */       int x = nbt.func_74762_e("x");
/* 549 */       int y = nbt.func_74762_e("y");
/* 550 */       int z = nbt.func_74762_e("z");
/* 551 */       li.cil.oc.common.EventHandler$.MODULE$.scheduleServer((Function0)new NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$loadController$1(f, dimension, x, y, z)); }  } public final class NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$loadController$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final Function1 f$1; private final int dimension$1; private final int x$6; private final int y$1; private final int z$1; public final void apply() { apply$mcV$sp(); } public NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$loadController$1(Function1 f$1, int dimension$1, int x$6, int y$1, int z$1) {} public void apply$mcV$sp() {
/* 552 */       WorldServer world = DimensionManager.getWorld(this.dimension$1);
/* 553 */       TileEntity tileEntity = world.func_147438_o(this.x$6, this.y$1, this.z$1);
/* 554 */       if (tileEntity != null && tileEntity instanceof IGridProxyable && tileEntity instanceof appeng.api.networking.security.IActionHost) {
/* 555 */         this.f$1.apply(tileEntity);
/*     */       }
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public void li$cil$oc$integration$appeng$NetworkControl$$saveController(TileEntity controller, NBTTagCompound nbt) {
/* 562 */     if (controller != null && !controller.func_145837_r()) {
/* 563 */       nbt.func_74768_a("dimension", (controller.func_145831_w()).field_73011_w.field_76574_g);
/* 564 */       nbt.func_74768_a("x", controller.field_145851_c);
/* 565 */       nbt.func_74768_a("y", controller.field_145848_d);
/* 566 */       nbt.func_74768_a("z", controller.field_145849_e);
/*     */     } 
/*     */   } private NetworkControl$() {
/* 569 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\NetworkControl$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */