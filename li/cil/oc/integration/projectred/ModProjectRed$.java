/*    */ package li.cil.oc.integration.projectred;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ModProjectRed$ implements ModProxy, BundledRedstone.RedstoneProvider {
/* 12 */   private ModProjectRed$() { MODULE$ = this; } public static final ModProjectRed$ MODULE$; public Mods.SimpleMod getMod() {
/* 13 */     return li.cil.oc.integration.Mods$.MODULE$.ProjectRedTransmission();
/*    */   }
/*    */   public void initialize() {
/* 16 */     IMC.registerWrenchTool("li.cil.oc.integration.projectred.EventHandlerProjectRed.useWrench");
/* 17 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.projectred.EventHandlerProjectRed.isWrench");
/*    */     
/* 19 */     li.cil.oc.integration.util.BundledRedstone$.MODULE$.addProvider(this);
/*    */   }
/*    */   public int computeInput(BlockPosition pos, ForgeDirection side) {
/* 22 */     return 0;
/*    */   }
/*    */   
/* 25 */   public int[] computeBundledInput(BlockPosition pos, ForgeDirection side) { return (int[])scala.Option$.MODULE$.apply(ProjectRedAPI.transmissionAPI.getBundledInput((World)pos.world().get(), pos.x(), pos.y(), pos.z(), side.ordinal()))
/* 26 */       .fold((Function0)new ModProjectRed$$anonfun$computeBundledInput$1(), (Function1)new ModProjectRed$$anonfun$computeBundledInput$2()); } public final class ModProjectRed$$anonfun$computeBundledInput$1 extends AbstractFunction0<int[]> implements Serializable { public static final long serialVersionUID = 0L; public final int[] apply() { return null; } } public final class ModProjectRed$$anonfun$computeBundledInput$2 extends AbstractFunction1<byte[], int[]> implements Serializable { public static final long serialVersionUID = 0L; public final int[] apply(byte[] x$1) { return (int[])scala.Predef$.MODULE$.byteArrayOps(x$1).map((Function1)new ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1(this), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Int())); } public final class ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(byte x$2) { return x$2 & 0xFF; }
/*    */ 
/*    */       
/*    */       public ModProjectRed$$anonfun$computeBundledInput$2$$anonfun$apply$1(ModProjectRed$$anonfun$computeBundledInput$2 $outer) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\projectred\ModProjectRed$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */