/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ import appeng.me.helpers.IGridProxyable;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Iterable$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.TraversableLike;
/*    */ import scala.collection.TraversableOnce;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.reflect.ClassTag$;
/*    */ 
/*    */ public abstract class NetworkControl$class {
/*    */   @Callback(doc = "function():table -- Get a list of the stored essentia in the network.")
/*    */   public static Object[] getEssentiaInNetwork(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 20 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)((IGridProxyable)$this.tile()).getProxy().getStorage().getFluidInventory().getStorageList()).filter((Function1)new NetworkControl$$anonfun$getEssentiaInNetwork$1((NetworkControl)$this)))
/*    */             
/* 22 */             .map((Function1)new NetworkControl$$anonfun$getEssentiaInNetwork$2((NetworkControl)$this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(FluidStack.class)) }));
/*    */   }
/*    */   
/*    */   public static void $init$(NetworkControl $this) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\NetworkControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */