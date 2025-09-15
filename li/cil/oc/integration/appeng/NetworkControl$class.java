/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import appeng.api.storage.data.IAEFluidStack;
/*     */ import appeng.me.helpers.IGridProxyable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.integration.Mods$;
/*     */ import li.cil.oc.integration.ae2fc.Ae2FcUtil$;
/*     */ import li.cil.oc.integration.ec.ECUtil$;
/*     */ import li.cil.oc.util.DatabaseAccess$;
/*     */ import li.cil.oc.util.ResultWrapper$;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import scala.Function1;
/*     */ import scala.PartialFunction;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Iterable$;
/*     */ import scala.collection.Map;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.TraversableLike;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.LinkedHashSet;
/*     */ import scala.collection.mutable.LinkedHashSet$;
/*     */ import scala.collection.mutable.ListBuffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Map$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class NetworkControl$class
/*     */ {
/*     */   public static void $init$(NetworkControl $this) {}
/*     */   
/*     */   public static Iterable li$cil$oc$integration$appeng$NetworkControl$$allItems(NetworkControl<IGridProxyable> $this) {
/*  55 */     return WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)((IGridProxyable)$this.tile()).getProxy().getStorage().getItemInventory().getStorageList()); } private static Iterable allCraftables(NetworkControl $this) {
/*  56 */     return (Iterable)li$cil$oc$integration$appeng$NetworkControl$$allItems($this).collect((PartialFunction)new NetworkControl$$anonfun$allCraftables$1((NetworkControl$class)$this), Iterable$.MODULE$.canBuildFrom());
/*     */   }
/*     */   @Callback(doc = "function():table -- Get a list of tables representing the available CPUs in the network.")
/*     */   public static Object[] getCpus(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/*  60 */     ListBuffer buffer = new ListBuffer();
/*  61 */     IntRef index = IntRef.create(0);
/*  62 */     WrapAsScala$.MODULE$.asScalaSet((Set)((IGridProxyable)$this.tile()).getProxy().getCrafting().getCpus()).foreach((Function1)new NetworkControl$$anonfun$getCpus$1($this, buffer, (NetworkControl<AETile>)index));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { buffer.toArray(ClassTag$.MODULE$.apply(Map.class)) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function([filter:table]):table -- Get a list of known item recipes. These can be used to issue crafting requests.")
/*     */   public static Object[] getCraftables(NetworkControl<AETile> $this, Context context, Arguments args) {
/*  77 */     Map filter = (Map)WrapAsScala$.MODULE$.mapAsScalaMap(args.optTable(0, WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().empty()))).collect((PartialFunction)new NetworkControl$$anonfun$1($this), Map$.MODULE$.canBuildFrom());
/*     */ 
/*     */     
/*  80 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)allCraftables($this)
/*  81 */             .collect((PartialFunction)new NetworkControl$$anonfun$getCraftables$1($this, (NetworkControl<AETile>)filter), Iterable$.MODULE$.canBuildFrom()))
/*  82 */             .toArray(ClassTag$.MODULE$.apply(NetworkControl.Craftable.class)) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function([filter:table]):table -- Get a list of the stored items in the network.")
/*     */   public static Object[] getItemsInNetwork(NetworkControl<AETile> $this, Context context, Arguments args) {
/*  87 */     Map filter = (Map)WrapAsScala$.MODULE$.mapAsScalaMap(args.optTable(0, WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.Map().empty()))).collect((PartialFunction)new NetworkControl$$anonfun$2($this), Map$.MODULE$.canBuildFrom());
/*     */ 
/*     */     
/*  90 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)((TraversableLike)li$cil$oc$integration$appeng$NetworkControl$$allItems($this)
/*  91 */             .map((Function1)new NetworkControl$$anonfun$getItemsInNetwork$1($this), Iterable$.MODULE$.canBuildFrom()))
/*  92 */             .filter((Function1)new NetworkControl$$anonfun$getItemsInNetwork$2($this, (NetworkControl<AETile>)filter)))
/*  93 */             .toArray(ClassTag$.MODULE$.apply(HashMap.class)) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(filter:table):table -- Get a list of the stored items in the network matching the filter. Filter is an Array of Item IDs")
/*     */   public static Object[] getItemsInNetworkById(NetworkControl<AETile> $this, Context context, Arguments args) {
/*  98 */     Map table = args.checkTable(0);
/*     */     
/* 100 */     LinkedHashSet itemFilterSet = LinkedHashSet$.MODULE$.empty(); RichInt$.MODULE$
/* 101 */       .until$extension0(Predef$.MODULE$.intWrapper(0), table.size()).foreach((Function1)new NetworkControl$$anonfun$getItemsInNetworkById$1($this, table, (NetworkControl<AETile>)itemFilterSet));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)((TraversableLike)li$cil$oc$integration$appeng$NetworkControl$$allItems($this)
/* 109 */             .filter((Function1)new NetworkControl$$anonfun$getItemsInNetworkById$2($this, (NetworkControl<AETile>)itemFilterSet)))
/* 110 */             .map((Function1)new NetworkControl$$anonfun$getItemsInNetworkById$3($this), Iterable$.MODULE$.canBuildFrom()))
/* 111 */             .toArray(ClassTag$.MODULE$.apply(HashMap.class)) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():userdata -- Get an iterator object for the list of the items in the network.")
/*     */   public static Object[] allItems(NetworkControl<TileEntity> $this, Context context, Arguments args) {
/* 116 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { new NetworkControl.NetworkContents($this.tile()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(filter:table, dbAddress:string[, startSlot:number[, count:number]]): Boolean -- Store items in the network matching the specified filter in the database with the specified address.")
/*     */   public static Object[] store(NetworkControl<AETile> $this, Context context, Arguments args) {
/* 121 */     Map filter = (Map)WrapAsScala$.MODULE$.mapAsScalaMap(args.checkTable(0)).collect((PartialFunction)new NetworkControl$$anonfun$3($this), Map$.MODULE$.canBuildFrom());
/*     */ 
/*     */     
/* 124 */     return DatabaseAccess$.MODULE$.withDatabase($this.node(), args.checkString(1), (Function1)new NetworkControl$$anonfun$store$1($this, filter, (NetworkControl<AETile>)args));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean li$cil$oc$integration$appeng$NetworkControl$$isFluidVisible(NetworkControl $this, IAEFluidStack stack) {
/* 142 */     return Mods$.MODULE$.ExtraCells().isAvailable() ? ECUtil$.MODULE$.canSeeFluidInNetwork(stack) : (
/* 143 */       Mods$.MODULE$.Ae2Fc().isAvailable() ? Ae2FcUtil$.MODULE$.canSeeFluidInNetwork(stack) : true);
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of the stored fluids in the network.")
/*     */   public static Object[] getFluidsInNetwork(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 148 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)((IGridProxyable)$this.tile()).getProxy().getStorage().getFluidInventory().getStorageList()).filter((Function1)new NetworkControl$$anonfun$getFluidsInNetwork$1((NetworkControl)$this))).map((Function1)new NetworkControl$$anonfun$getFluidsInNetwork$2((NetworkControl)$this), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(HashMap.class)) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the average power injection into the network.")
/*     */   public static Object[] getAvgPowerInjection(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 152 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(((IGridProxyable)$this.tile()).getProxy().getEnergy().getAvgPowerInjection()) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the average power usage of the network.")
/*     */   public static Object[] getAvgPowerUsage(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 156 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(((IGridProxyable)$this.tile()).getProxy().getEnergy().getAvgPowerUsage()) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the idle power usage of the network.")
/*     */   public static Object[] getIdlePowerUsage(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 160 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(((IGridProxyable)$this.tile()).getProxy().getEnergy().getIdlePowerUsage()) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the maximum stored power in the network.")
/*     */   public static Object[] getMaxStoredPower(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 164 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(((IGridProxyable)$this.tile()).getProxy().getEnergy().getMaxStoredPower()) }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the stored power in the network. ")
/*     */   public static Object[] getStoredPower(NetworkControl<IGridProxyable> $this, Context context, Arguments args) {
/* 168 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(((IGridProxyable)$this.tile()).getProxy().getEnergy().getStoredPower()) }));
/*     */   }
/*     */   public static boolean li$cil$oc$integration$appeng$NetworkControl$$matches(NetworkControl $this, HashMap stack, Map filter) {
/* 171 */     if (stack == null) return false; 
/* 172 */     return filter.forall((Function1)new NetworkControl$$anonfun$li$cil$oc$integration$appeng$NetworkControl$$matches$1($this, (NetworkControl$class)stack));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\NetworkControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */