/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.integration.Mods$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagIntArray;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ import scala.runtime.ScalaRunTime$;
/*     */ 
/*     */ public abstract class BundledRedstoneAware$class {
/*     */   public static void $init$(BundledRedstoneAware $this) {
/*  29 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_bundledInput_$eq((int[][])Array$.MODULE$.fill(6, (Function0)new BundledRedstoneAware$$anonfun$1($this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))));
/*     */     
/*  31 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_rednetInput_$eq((int[][])Array$.MODULE$.fill(6, (Function0)new BundledRedstoneAware$$anonfun$2($this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))));
/*     */     
/*  33 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$_setter_$_bundledOutput_$eq((int[][])Array$.MODULE$.fill(6, (Function0)new BundledRedstoneAware$$anonfun$3($this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setOutputEnabled(BundledRedstoneAware $this, boolean value) {
/*  38 */     if (value != $this._isOutputEnabled() && 
/*  39 */       !value) {
/*  40 */       Predef$.MODULE$.refArrayOps((Object[])$this._bundledOutput()).indices().foreach$mVc$sp((Function1)new BundledRedstoneAware$$anonfun$setOutputEnabled$1($this));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$$super$setOutputEnabled(value);
/*     */   }
/*     */   
/*     */   public static int[][] getBundledInput(BundledRedstoneAware $this) {
/*  51 */     return (int[][])((TraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 6).map((Function1)new BundledRedstoneAware$$anonfun$getBundledInput$2($this), IndexedSeq$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class)));
/*     */   }
/*     */   
/*     */   private static int checkSide(BundledRedstoneAware $this, ForgeDirection side) {
/*  55 */     int index = side.ordinal();
/*  56 */     if (index >= 6) { (new String[2])[0] = "Bad side "; (new String[2])[1] = ""; throw new IndexOutOfBoundsException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { side }))); }
/*  57 */      return index;
/*     */   }
/*     */   
/*     */   private static int checkColor(BundledRedstoneAware $this, int color) {
/*  61 */     if (color < 0 || color >= 16) { (new String[2])[0] = "Bad color "; (new String[2])[1] = ""; throw new IndexOutOfBoundsException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(color) }))); }
/*  62 */      return color;
/*     */   }
/*     */   
/*     */   public static int[] getBundledInput(BundledRedstoneAware $this, ForgeDirection side) {
/*  66 */     int sideIndex = checkSide($this, side);
/*  67 */     int[] bundled = $this._bundledInput()[sideIndex];
/*  68 */     int[] rednet = $this._rednetInput()[sideIndex]; return (int[])Tuple2Zipped$.MODULE$
/*  69 */       .map$extension(Tuple2Zipped$Ops$.MODULE$.zipped$extension(Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(bundled, rednet)), (Function1)new BundledRedstoneAware$$anonfun$getBundledInput$3($this), (Function1)new BundledRedstoneAware$$anonfun$getBundledInput$4($this)), (Function2)new BundledRedstoneAware$$anonfun$getBundledInput$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()));
/*     */   }
/*     */   
/*     */   public static int getBundledInput(BundledRedstoneAware $this, ForgeDirection side, int color) {
/*  73 */     int sideIndex = checkSide($this, side);
/*  74 */     int colorIndex = checkColor($this, color);
/*  75 */     int bundled = $this._bundledInput()[sideIndex][colorIndex];
/*  76 */     int rednet = $this._rednetInput()[sideIndex][colorIndex];
/*  77 */     return RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(bundled), rednet)), 0);
/*     */   }
/*     */   
/*     */   public static void setBundledInput(BundledRedstoneAware $this, ForgeDirection side, int color, int newValue) {
/*  81 */     $this.updateInput($this._bundledInput(), side, color, newValue);
/*     */   }
/*     */   
/*     */   public static void setBundledInput(BundledRedstoneAware $this, ForgeDirection side, int[] newBundledInput) {
/*  85 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 16).foreach$mVc$sp((Function1)new BundledRedstoneAware$$anonfun$setBundledInput$1($this, side, newBundledInput));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setRednetInput(BundledRedstoneAware $this, ForgeDirection side, int color, int value) {
/*  91 */     $this.updateInput($this._rednetInput(), side, color, value);
/*     */   }
/*     */   public static void updateInput(BundledRedstoneAware $this, int[][] inputs, ForgeDirection side, int color, int newValue) {
/*  94 */     int sideIndex = checkSide($this, side);
/*  95 */     int colorIndex = checkColor($this, color);
/*  96 */     int oldValue = inputs[sideIndex][colorIndex];
/*  97 */     if (oldValue != newValue) {
/*  98 */       inputs[sideIndex][colorIndex] = newValue;
/*  99 */       if (oldValue != -1)
/* 100 */         $this.onRedstoneInputChanged(new RedstoneChangedEventArgs(side, oldValue, newValue, colorIndex)); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int[][] getBundledOutput(BundledRedstoneAware $this) {
/* 105 */     return $this._bundledInput();
/*     */   } public static int[] getBundledOutput(BundledRedstoneAware $this, ForgeDirection side) {
/* 107 */     return $this._bundledOutput()[checkSide($this, $this.toLocal(side))];
/*     */   } public static int getBundledOutput(BundledRedstoneAware $this, ForgeDirection side, int color) {
/* 109 */     return $this.getBundledOutput(side)[checkColor($this, color)];
/*     */   }
/*     */   public static void notifyChangedSide(BundledRedstoneAware $this, ForgeDirection side) {
/* 112 */     if (Mods$.MODULE$.MineFactoryReloaded().isAvailable()) {
/* 113 */       BlockPosition blockPos = BlockPosition$.MODULE$.apply($this.x(), $this.y(), $this.z()).offset(side);
/* 114 */       Block block = ExtendedWorld$.MODULE$.extendedWorld($this.world()).getBlock(blockPos);
/* 115 */       if (block instanceof IRedNetNetworkContainer) { Block block1 = block; ((IRedNetNetworkContainer)block1).updateNetwork($this.world(), blockPos.x(), blockPos.y(), blockPos.z(), side.getOpposite()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 116 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } 
/*     */     
/* 120 */     $this.onRedstoneOutputChanged(side);
/*     */   }
/*     */   
/*     */   public static boolean setBundledOutput(BundledRedstoneAware $this, ForgeDirection side, int color, int value) {
/* 124 */     $this._bundledOutput()[checkSide($this, $this.toLocal(side))][checkColor($this, color)] = value;
/* 125 */     $this.notifyChangedSide(side);
/*     */     return (value != $this.getBundledOutput(side, color));
/*     */   }
/*     */   
/*     */   public static boolean setBundledOutput(BundledRedstoneAware $this, ForgeDirection side, Map values) {
/* 130 */     int sideIndex = $this.toLocal(side).ordinal();
/* 131 */     BooleanRef changed = BooleanRef.create(false); RichInt$.MODULE$
/* 132 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 16).foreach$mVc$sp((Function1)new BundledRedstoneAware$$anonfun$setBundledOutput$1($this, sideIndex, changed, side, values));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     if (changed.elem) {
/* 144 */       $this.notifyChangedSide(side);
/*     */     }
/* 146 */     return changed.elem;
/*     */   }
/*     */   
/*     */   public static boolean setBundledOutput(BundledRedstoneAware $this, Map values) {
/* 150 */     BooleanRef changed = BooleanRef.create(false);
/* 151 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new BundledRedstoneAware$$anonfun$setBundledOutput$2($this, changed, values));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     return changed.elem;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void updateRedstoneInput(BundledRedstoneAware $this, ForgeDirection side) {
/* 165 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$$super$updateRedstoneInput(side);
/* 166 */     $this.setBundledInput(side, BundledRedstone$.MODULE$.computeBundledInput($this.position(), side));
/*     */   }
/*     */   
/*     */   public static void readFromNBTForServer(BundledRedstoneAware $this, NBTTagCompound nbt) {
/* 170 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$$super$readFromNBTForServer(nbt);
/*     */ 
/*     */     
/* 173 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.bundledInput").toString(), 11)).toArray(ClassTag$.MODULE$.apply(NBTTagIntArray.class))).map((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$2($this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.bundledOutput").toString(), 11)).toArray(ClassTag$.MODULE$.apply(NBTTagIntArray.class))).map((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$3($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$4($this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.rednetInput").toString(), 11)).toArray(ClassTag$.MODULE$.apply(NBTTagIntArray.class))).map((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$5($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(int.class))))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).foreach((Function1)new BundledRedstoneAware$$anonfun$readFromNBTForServer$6($this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeToNBTForServer(BundledRedstoneAware $this, NBTTagCompound nbt) {
/* 197 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$$super$writeToNBTForServer(nbt);
/*     */     
/* 199 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.bundledInput").toString(), ExtendedNBT$.MODULE$.intArrayIterableToNbt((Iterable)Predef$.MODULE$.refArrayOps((Object[])$this._bundledInput()).view()));
/* 200 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.bundledOutput").toString(), ExtendedNBT$.MODULE$.intArrayIterableToNbt((Iterable)Predef$.MODULE$.refArrayOps((Object[])$this._bundledOutput()).view()));
/*     */     
/* 202 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.rednetInput").toString(), ExtendedNBT$.MODULE$.intArrayIterableToNbt((Iterable)Predef$.MODULE$.refArrayOps((Object[])$this._rednetInput()).view()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onRedstoneOutputEnabledChanged(BundledRedstoneAware $this) {
/* 208 */     if (Mods$.MODULE$.MineFactoryReloaded().isAvailable()) {
/* 209 */       Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new BundledRedstoneAware$$anonfun$onRedstoneOutputEnabledChanged$1($this));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     $this.li$cil$oc$common$tileentity$traits$BundledRedstoneAware$$super$onRedstoneOutputEnabledChanged();
/*     */   }
/*     */ 
/*     */   
/*     */   @Method(modid = "RedLogic")
/*     */   public static byte[] getBundledCableStrength(BundledRedstoneAware $this, int blockFace, int toDirection) {
/* 223 */     return (byte[])Predef$.MODULE$.intArrayOps($this.getBundledOutput(ForgeDirection.getOrientation(toDirection))).map((Function1)new BundledRedstoneAware$$anonfun$getBundledCableStrength$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Byte()));
/*     */   } @Method(modid = "RedLogic")
/*     */   public static void onBundledInputChanged(BundledRedstoneAware $this) {
/* 226 */     $this.checkRedstoneInputChanged();
/*     */   }
/*     */   
/*     */   @Method(modid = "ProjRed|Transmission")
/*     */   public static boolean canConnectBundled(BundledRedstoneAware $this, int side) {
/* 231 */     return $this._isOutputEnabled();
/*     */   } @Method(modid = "ProjRed|Transmission")
/*     */   public static byte[] getBundledSignal(BundledRedstoneAware $this, int side) {
/* 234 */     return (byte[])Predef$.MODULE$.intArrayOps($this.getBundledOutput(ForgeDirection.getOrientation(side))).map((Function1)new BundledRedstoneAware$$anonfun$getBundledSignal$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Byte()));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\BundledRedstoneAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */