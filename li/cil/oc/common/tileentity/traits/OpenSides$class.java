/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class OpenSides$class {
/*    */   public static int SideCount(OpenSides $this) {
/* 12 */     return ForgeDirection.VALID_DIRECTIONS.length;
/*    */   } public static boolean defaultState(OpenSides $this) {
/* 14 */     return false;
/*    */   } public static void $init$(OpenSides $this) {
/* 16 */     $this.openSides_$eq((boolean[])Array$.MODULE$.fill($this.SideCount(), (Function0)new OpenSides$$anonfun$1($this), ClassTag$.MODULE$.Boolean()));
/*    */   } public static byte compressSides(OpenSides $this) {
/* 18 */     return (byte)BoxesRunTime.unboxToInt(ZippedTraversable2$.MODULE$.zippedTraversable2ToTraversable((ZippedTraversable2)new Tuple2Zipped(Tuple2Zipped$Ops$.MODULE$.zipped$extension(Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(ForgeDirection.VALID_DIRECTIONS, $this.openSides())), (Function1)new OpenSides$$anonfun$compressSides$1($this), (Function1)new OpenSides$$anonfun$compressSides$2($this)))).foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new OpenSides$$anonfun$compressSides$3($this)));
/*    */   } public static boolean[] uncompressSides(OpenSides $this, byte byte) {
/* 20 */     return (boolean[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new OpenSides$$anonfun$uncompressSides$1($this, byte), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Boolean()));
/*    */   } public static boolean isSideOpen(OpenSides $this, ForgeDirection side) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getstatic net/minecraftforge/common/util/ForgeDirection.UNKNOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   4: astore_2
/*    */     //   5: dup
/*    */     //   6: ifnonnull -> 17
/*    */     //   9: pop
/*    */     //   10: aload_2
/*    */     //   11: ifnull -> 42
/*    */     //   14: goto -> 24
/*    */     //   17: aload_2
/*    */     //   18: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   21: ifne -> 42
/*    */     //   24: aload_0
/*    */     //   25: invokeinterface openSides : ()[Z
/*    */     //   30: aload_1
/*    */     //   31: invokevirtual ordinal : ()I
/*    */     //   34: baload
/*    */     //   35: ifeq -> 42
/*    */     //   38: iconst_1
/*    */     //   39: goto -> 43
/*    */     //   42: iconst_0
/*    */     //   43: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	44	0	$this	Lli/cil/oc/common/tileentity/traits/OpenSides;
/*    */     //   0	44	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */   } public static void setSideOpen(OpenSides $this, ForgeDirection side, boolean value) {
/* 24 */     ForgeDirection forgeDirection = ForgeDirection.UNKNOWN; if (side == null) { if (forgeDirection != null) { if ($this.openSides()[side.ordinal()] != value)
/* 25 */           $this.openSides()[side.ordinal()] = value;  return; }  } else if (!side.equals(forgeDirection)) { if ($this.openSides()[side.ordinal()] != value) $this.openSides()[side.ordinal()] = value; 
/*    */       return; }
/*    */   
/*    */   } public static void readFromNBTForServer(OpenSides $this, NBTTagCompound nbt) {
/* 29 */     $this.li$cil$oc$common$tileentity$traits$OpenSides$$super$readFromNBTForServer(nbt);
/* 30 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("openSides").toString()))
/* 31 */       $this.openSides_$eq($this.uncompressSides(nbt.func_74771_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("openSides").toString()))); 
/*    */   }
/*    */   
/*    */   public static void writeToNBTForServer(OpenSides $this, NBTTagCompound nbt) {
/* 35 */     $this.li$cil$oc$common$tileentity$traits$OpenSides$$super$writeToNBTForServer(nbt);
/* 36 */     nbt.func_74774_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("openSides").toString(), $this.compressSides());
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void readFromNBTForClient(OpenSides $this, NBTTagCompound nbt) {
/* 41 */     $this.li$cil$oc$common$tileentity$traits$OpenSides$$super$readFromNBTForClient(nbt);
/* 42 */     $this.openSides_$eq($this.uncompressSides(nbt.func_74771_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("openSides").toString())));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForClient(OpenSides $this, NBTTagCompound nbt) {
/* 46 */     $this.li$cil$oc$common$tileentity$traits$OpenSides$$super$writeToNBTForClient(nbt);
/* 47 */     nbt.func_74774_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("openSides").toString(), $this.compressSides());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\OpenSides$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */