/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.server.network.Network$;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import li.cil.oc.util.ResultWrapper$;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public abstract class Environment$class {
/*  20 */   public static void $init$(Environment $this) { $this.isChangeScheduled_$eq(false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     $this.moving_$eq(false); }
/*     */   public static double xPosition(Environment $this) { return $this.x() + 0.5D; }
/*     */   public static double yPosition(Environment $this) { return $this.y() + 0.5D; }
/*     */   public static double zPosition(Environment $this) { return $this.z() + 0.5D; }
/* 119 */   public static void markChanged(Environment $this) { if (((TileEntity)$this).canUpdate()) { $this.isChangeScheduled_$eq(true); } else { $this.world().func_147476_b($this.x(), $this.y(), $this.z(), (TileEntity)$this); }  } public static boolean isConnected(Environment $this) { return !($this.node() == null || $this.node().address() == null || $this.node().network() == null); } public static void initialize(Environment $this) { $this.li$cil$oc$common$tileentity$traits$Environment$$super$initialize(); if ($this.isServer()) EventHandler$.MODULE$.scheduleServer((TileEntity)$this);  } @Method(modid = "appliedenergistics2") public static boolean prepareToMove(Environment $this) { $this.moving_$eq(true);
/* 120 */     return true; }
/*     */   public static void updateEntity(Environment $this) { $this.li$cil$oc$common$tileentity$traits$Environment$$super$updateEntity(); if ($this.isChangeScheduled()) { $this.world().func_147476_b($this.x(), $this.y(), $this.z(), (TileEntity)$this); $this.isChangeScheduled_$eq(false); }  }
/*     */   public static void dispose(Environment $this) { $this.li$cil$oc$common$tileentity$traits$Environment$$super$dispose(); if ($this.isServer()) if ($this.moving() && $this instanceof Computer) { Environment environment = $this; if (environment instanceof li.cil.oc.api.network.SidedEnvironment) { Environment environment1 = environment; Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Environment$$anonfun$dispose$1($this, environment1)); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Environment$$anonfun$dispose$2($this, environment)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } else { Option$.MODULE$.apply($this.node()).foreach((Function1)new Environment$$anonfun$dispose$3($this)); Environment environment = $this; if (environment instanceof li.cil.oc.api.network.SidedEnvironment) { Environment environment1 = environment; Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Environment$$anonfun$dispose$4($this, environment1)); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  }   }
/*     */   public static void readFromNBTForServer(Environment $this, NBTTagCompound nbt) { $this.li$cil$oc$common$tileentity$traits$Environment$$super$readFromNBTForServer(nbt); if ($this.node() != null) { Environment environment = $this; if ($this.node().host() == null) { $this.node().host(); if (environment != null) return;  } else { if ($this.node().host().equals(environment)) { $this.node().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString())); return; }  return; }  } else { return; }  $this.node().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString())); }
/*     */   public static void writeToNBTForServer(Environment $this, NBTTagCompound nbt) { $this.li$cil$oc$common$tileentity$traits$Environment$$super$writeToNBTForServer(nbt); if ($this.node() != null) { Environment environment = $this; if ($this.node().host() == null) { $this.node().host(); if (environment != null) return;  } else { if ($this.node().host().equals(environment)) { Node node1 = $this.node(); ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString(), (Function1)new Environment$$anonfun$writeToNBTForServer$1($this, node1)); return; }  return; }  } else { return; }  Node node = $this.node(); ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("node").toString(), (Function1)new Environment$$anonfun$writeToNBTForServer$1($this, node)); }
/*     */   public static void onMessage(Environment $this, Message message) {} public static void onConnect(Environment $this, Node node) {} public static void onDisconnect(Environment $this, Node node) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   7: astore_2
/*     */     //   8: dup
/*     */     //   9: ifnonnull -> 20
/*     */     //   12: pop
/*     */     //   13: aload_2
/*     */     //   14: ifnull -> 27
/*     */     //   17: goto -> 63
/*     */     //   20: aload_2
/*     */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   24: ifeq -> 63
/*     */     //   27: aload_1
/*     */     //   28: astore_3
/*     */     //   29: aload_3
/*     */     //   30: instanceof li/cil/oc/api/network/Connector
/*     */     //   33: ifeq -> 58
/*     */     //   36: aload_3
/*     */     //   37: checkcast li/cil/oc/api/network/Connector
/*     */     //   40: astore #4
/*     */     //   42: aload #4
/*     */     //   44: dconst_0
/*     */     //   45: invokeinterface setLocalBufferSize : (D)V
/*     */     //   50: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   53: astore #5
/*     */     //   55: goto -> 63
/*     */     //   58: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   61: astore #5
/*     */     //   63: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 0
/*     */     //   #108	-> 29
/*     */     //   #109	-> 58
/*     */     //   #107	-> 63
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	64	0	$this	Lli/cil/oc/common/tileentity/traits/Environment;
/* 125 */     //   0	64	1	node	Lli/cil/oc/api/network/Node; } @Method(modid = "appliedenergistics2") public static void doneMoving(Environment $this) { $this.moving_$eq(false);
/* 126 */     Network$.MODULE$.joinOrCreateNetwork((TileEntity)$this);
/* 127 */     $this.world().func_147471_g($this.x(), $this.y(), $this.z()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object[] result(Environment $this, Seq args) {
/* 132 */     return ResultWrapper$.MODULE$.result(args);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Environment$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */