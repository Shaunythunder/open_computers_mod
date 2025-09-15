/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.server.PacketSender$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.ExtendedWorld$;
/*     */ import mods.immibis.redlogic.api.wiring.IWire;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.Ordering;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ public abstract class RedstoneAware$class {
/*  29 */   public static void $init$(RedstoneAware $this) { $this.li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_input_$eq((int[])Array$.MODULE$.fill(6, (Function0)new RedstoneAware$$anonfun$1($this), ClassTag$.MODULE$.Int()));
/*     */     
/*  31 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$_setter_$_output_$eq((int[])Array$.MODULE$.fill(6, (Function0)new RedstoneAware$$anonfun$2($this), ClassTag$.MODULE$.Int()));
/*     */     
/*  33 */     $this._isOutputEnabled_$eq(false);
/*     */ 
/*     */ 
/*     */     
/*  37 */     $this.shouldUpdateInput_$eq(true); } public static boolean isOutputEnabled(RedstoneAware $this) {
/*     */     return $this._isOutputEnabled();
/*     */   } public static void setOutputEnabled(RedstoneAware $this, boolean value) {
/*  40 */     if (value != $this._isOutputEnabled()) {
/*  41 */       $this._isOutputEnabled_$eq(value);
/*  42 */       if (!value) {
/*  43 */         Predef$.MODULE$.intArrayOps($this._output()).indices().foreach$mVc$sp((Function1)new RedstoneAware$$anonfun$setOutputEnabled$1($this));
/*     */       }
/*     */ 
/*     */       
/*  47 */       $this.onRedstoneOutputEnabledChanged();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Option getObjectFuzzy(RedstoneAware $this, Map map, int key) {
/*  52 */     Map refMap = map;
/*  53 */     return refMap.containsKey(BoxesRunTime.boxToInteger(key)) ? 
/*  54 */       Option$.MODULE$.apply(refMap.get(BoxesRunTime.boxToInteger(key))) : (
/*  55 */       refMap.containsKey(new Integer(key)) ? 
/*  56 */       Option$.MODULE$.apply(refMap.get(new Integer(key))) : (
/*  57 */       refMap.containsKey(BoxesRunTime.boxToDouble(Predef$.MODULE$.Integer2int(new Integer(key)) * 1.0D)) ? 
/*  58 */       Option$.MODULE$.apply(refMap.get(BoxesRunTime.boxToDouble(Predef$.MODULE$.Integer2int(new Integer(key)) * 1.0D))) : (
/*  59 */       refMap.containsKey(BoxesRunTime.boxToDouble(key * 1.0D)) ? 
/*  60 */       Option$.MODULE$.apply(refMap.get(BoxesRunTime.boxToDouble(key * 1.0D))) : 
/*     */       
/*  62 */       (Option)None$.MODULE$)));
/*     */   }
/*     */   
/*     */   public static Option valueToInt(RedstoneAware $this, Object value) {
/*  66 */     Object object = value;
/*  67 */     if (object instanceof Some) { Some some = (Some)object; Object num = some.x(); if (num instanceof Number) { Number number = (Number)num; return Option$.MODULE$.apply(BoxesRunTime.boxToInteger(number.intValue())); }  }
/*  68 */      return (Option)None$.MODULE$;
/*     */   }
/*     */   
/*     */   public static int[] getInput(RedstoneAware $this) {
/*  72 */     return (int[])Predef$.MODULE$.intArrayOps($this._input()).map((Function1)new RedstoneAware$$anonfun$getInput$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()));
/*     */   } public static int getInput(RedstoneAware $this, ForgeDirection side) {
/*  74 */     return RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper($this._input()[side.ordinal()]), 0);
/*     */   }
/*     */   public static void setInput(RedstoneAware $this, ForgeDirection side, int newInput) {
/*  77 */     int oldInput = $this._input()[side.ordinal()];
/*  78 */     $this._input()[side.ordinal()] = newInput;
/*  79 */     if (oldInput >= 0 && newInput != oldInput) {
/*  80 */       $this.onRedstoneInputChanged(new RedstoneChangedEventArgs(side, oldInput, newInput, RedstoneChangedEventArgs$.MODULE$.apply$default$4()));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setInput(RedstoneAware $this, int[] values) {
/*  85 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RedstoneAware$$anonfun$setInput$1($this, values));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int maxInput(RedstoneAware $this) {
/*  91 */     return BoxesRunTime.unboxToInt(Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.intArrayOps($this._input()).map((Function1)new RedstoneAware$$anonfun$maxInput$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).max((Ordering)Ordering$Int$.MODULE$));
/*     */   }
/*  93 */   public static int[] getOutput(RedstoneAware $this) { return (int[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new RedstoneAware$$anonfun$getOutput$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())); } public static int getOutput(RedstoneAware $this, ForgeDirection side) {
/*     */     boolean bool;
/*  95 */     Option option = Option$.MODULE$.apply($this._output());
/*  96 */     if (option instanceof Some) { Some some = (Some)option; int[] output = (int[])some.x(); bool = output[$this.toLocal(side).ordinal()]; }
/*  97 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   } public static boolean setOutput(RedstoneAware $this, ForgeDirection side, int value) {
/* 101 */     if (value == $this.getOutput(side)) return false; 
/* 102 */     $this._output()[$this.toLocal(side).ordinal()] = value;
/* 103 */     $this.onRedstoneOutputChanged(side);
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean setOutput(RedstoneAware $this, Map values) {
/* 108 */     BooleanRef changed = BooleanRef.create(false);
/* 109 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RedstoneAware$$anonfun$setOutput$1($this, changed, values));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 117 */     return changed.elem;
/*     */   }
/*     */   
/*     */   public static void checkRedstoneInputChanged(RedstoneAware $this) {
/* 121 */     $this.shouldUpdateInput_$eq($this.isServer());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void updateEntity(RedstoneAware $this) {
/* 127 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$updateEntity();
/* 128 */     if ($this.isServer() && 
/* 129 */       $this.shouldUpdateInput()) {
/* 130 */       $this.shouldUpdateInput_$eq(false);
/* 131 */       Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new RedstoneAware$$anonfun$updateEntity$1($this));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void validate(RedstoneAware $this) {
/* 137 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$validate();
/* 138 */     if (!((TileEntity)$this).canUpdate() && $this.isServer())
/* 139 */       EventHandler$.MODULE$.scheduleServer((Function0)new RedstoneAware$$anonfun$validate$1($this)); 
/*     */   }
/*     */   
/*     */   public static void updateRedstoneInput(RedstoneAware $this, ForgeDirection side) {
/* 143 */     $this.setInput(side, BundledRedstone$.MODULE$.computeInput($this.position(), side));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(RedstoneAware $this, NBTTagCompound nbt) {
/* 148 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$readFromNBTForServer(nbt);
/*     */     
/* 150 */     int[] input = nbt.func_74759_k((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.input").toString());
/* 151 */     Predef$.MODULE$.intArrayOps(input).copyToArray($this._input(), 0, RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(input.length), ($this._input()).length));
/* 152 */     int[] output = nbt.func_74759_k((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.output").toString());
/* 153 */     Predef$.MODULE$.intArrayOps(output).copyToArray($this._output(), 0, RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(output.length), ($this._output()).length));
/*     */   }
/*     */   
/*     */   public static void writeToNBTForServer(RedstoneAware $this, NBTTagCompound nbt) {
/* 157 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$writeToNBTForServer(nbt);
/*     */     
/* 159 */     nbt.func_74783_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.input").toString(), $this._input());
/* 160 */     nbt.func_74783_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("rs.output").toString(), $this._output());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void readFromNBTForClient(RedstoneAware $this, NBTTagCompound nbt) {
/* 165 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$readFromNBTForClient(nbt);
/* 166 */     $this._isOutputEnabled_$eq(nbt.func_74767_n("isOutputEnabled"));
/* 167 */     Predef$.MODULE$.intArrayOps(nbt.func_74759_k("output")).copyToArray($this._output());
/*     */   }
/*     */   
/*     */   public static void writeToNBTForClient(RedstoneAware $this, NBTTagCompound nbt) {
/* 171 */     $this.li$cil$oc$common$tileentity$traits$RedstoneAware$$super$writeToNBTForClient(nbt);
/* 172 */     nbt.func_74757_a("isOutputEnabled", $this._isOutputEnabled());
/* 173 */     nbt.func_74783_a("output", $this._output());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onRedstoneInputChanged(RedstoneAware $this, RedstoneChangedEventArgs args) {}
/*     */ 
/*     */   
/*     */   public static void onRedstoneOutputEnabledChanged(RedstoneAware $this) {
/* 181 */     ExtendedWorld$.MODULE$.extendedWorld($this.world()).notifyBlocksOfNeighborChange($this.position(), $this.block());
/* 182 */     if ($this.isServer()) { PacketSender$.MODULE$.sendRedstoneState($this); }
/* 183 */     else { ExtendedWorld$.MODULE$.extendedWorld($this.world()).markBlockForUpdate($this.position()); }
/*     */   
/*     */   }
/*     */   public static void onRedstoneOutputChanged(RedstoneAware $this, ForgeDirection side) {
/* 187 */     BlockPosition blockPos = $this.position().offset(side);
/* 188 */     ExtendedWorld$.MODULE$.extendedWorld($this.world()).notifyBlockOfNeighborChange(blockPos, $this.block());
/* 189 */     ExtendedWorld$.MODULE$.extendedWorld($this.world()).notifyBlocksOfNeighborChange(blockPos, ExtendedWorld$.MODULE$.extendedWorld($this.world()).getBlock(blockPos), side.getOpposite());
/*     */     
/* 191 */     if ($this.isServer()) { PacketSender$.MODULE$.sendRedstoneState($this); }
/* 192 */     else { ExtendedWorld$.MODULE$.extendedWorld($this.world()).markBlockForUpdate($this.position()); }
/*     */   
/*     */   }
/*     */   
/*     */   @Method(modid = "RedLogic")
/*     */   public static boolean connects(RedstoneAware $this, IWire wire, int blockFace, int fromDirection) {
/* 198 */     return $this._isOutputEnabled();
/*     */   } @Method(modid = "RedLogic")
/*     */   public static boolean connectsAroundCorner(RedstoneAware $this, IWire wire, int blockFace, int fromDirection) {
/* 201 */     return false;
/*     */   } @Method(modid = "RedLogic")
/*     */   public static short getEmittedSignalStrength(RedstoneAware $this, int blockFace, int toDirection) {
/* 204 */     return (short)$this._output()[$this.toLocal(ForgeDirection.getOrientation(toDirection)).ordinal()];
/*     */   } @Method(modid = "RedLogic")
/*     */   public static void onRedstoneInputChanged(RedstoneAware $this) {
/* 207 */     $this.checkRedstoneInputChanged();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\RedstoneAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */