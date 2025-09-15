/*    */ package li.cil.oc.integration.redlogic;
/*    */ 
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ import scala.runtime.ObjectRef;
/*    */ 
/*    */ public final class ModRedLogic$ implements ModProxy, BundledRedstone.RedstoneProvider {
/* 14 */   private ModRedLogic$() { MODULE$ = this; } public static final ModRedLogic$ MODULE$; public Mods.SimpleMod getMod() {
/* 15 */     return li.cil.oc.integration.Mods$.MODULE$.RedLogic();
/*    */   }
/*    */   public void initialize() {
/* 18 */     li.cil.oc.integration.util.BundledRedstone$.MODULE$.addProvider(this);
/*    */   }
/*    */   
/*    */   public int computeInput(BlockPosition pos, ForgeDirection side) { boolean bool;
/* 22 */     TileEntity tileEntity = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld((World)pos.world().get()).getTileEntity(pos.offset(side));
/* 23 */     if (tileEntity instanceof IRedstoneEmitter) { TileEntity tileEntity1 = tileEntity;
/* 24 */       IntRef strength = IntRef.create(0); scala.runtime.RichInt$.MODULE$
/* 25 */         .to$extension0(scala.Predef$.MODULE$.intWrapper(-1), 5).foreach$mVc$sp((Function1)new ModRedLogic$$anonfun$computeInput$1(side, strength, tileEntity1));
/*    */ 
/*    */       
/* 28 */       bool = strength.elem; }
/* 29 */     else { bool = false; }
/*    */     
/*    */     return bool; }
/*    */    public int[] computeBundledInput(BlockPosition pos, ForgeDirection side) {
/*    */     int[] arrayOfInt;
/* 34 */     World world = (World)pos.world().get();
/* 35 */     BlockPosition npos = pos.offset(side);
/* 36 */     TileEntity tileEntity = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world).getTileEntity(npos);
/* 37 */     if (tileEntity instanceof IInsulatedRedstoneWire) { TileEntity tileEntity1 = tileEntity;
/* 38 */       ObjectRef strength = ObjectRef.create(null); scala.runtime.RichInt$.MODULE$
/* 39 */         .to$extension0(scala.Predef$.MODULE$.intWrapper(-1), 5).withFilter((Function1)new ModRedLogic$$anonfun$computeBundledInput$1(side, tileEntity1)).foreach((Function1)new ModRedLogic$$anonfun$computeBundledInput$2(side, strength, tileEntity1));
/*    */ 
/*    */ 
/*    */       
/* 43 */       arrayOfInt = (int[])strength.elem; }
/* 44 */     else if (tileEntity instanceof IBundledEmitter) { TileEntity tileEntity1 = tileEntity;
/* 45 */       ObjectRef strength = ObjectRef.create(null); scala.runtime.RichInt$.MODULE$
/* 46 */         .to$extension0(scala.Predef$.MODULE$.intWrapper(-1), 5).withFilter((Function1)new ModRedLogic$$anonfun$computeBundledInput$3(strength)).foreach((Function1)new ModRedLogic$$anonfun$computeBundledInput$4(side, strength, tileEntity1));
/*    */ 
/*    */       
/* 49 */       arrayOfInt = (int[])strength.elem; }
/* 50 */     else { arrayOfInt = null; }
/*    */     
/*    */     return arrayOfInt;
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeInput$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$1;
/*    */     private final IntRef strength$1;
/*    */     private final TileEntity x2$1;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public ModRedLogic$$anonfun$computeInput$1(ForgeDirection side$1, IntRef strength$1, TileEntity x2$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       this.strength$1.elem = scala.math.package$.MODULE$.max(this.strength$1.elem, ((IRedstoneEmitter)this.x2$1).getEmittedSignalStrength(i, this.side$1.getOpposite().ordinal()));
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$2;
/*    */     private final TileEntity x2$2;
/*    */     
/*    */     public final boolean apply(int face) {
/*    */       return apply$mcZI$sp(face);
/*    */     }
/*    */     
/*    */     public boolean apply$mcZI$sp(int face) {
/*    */       return ((IWire)this.x2$2).wireConnectsInDirection(face, this.side$2.ordinal());
/*    */     }
/*    */     
/*    */     public ModRedLogic$$anonfun$computeBundledInput$1(ForgeDirection side$2, TileEntity x2$2) {}
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$2;
/*    */     private final ObjectRef strength$2;
/*    */     private final TileEntity x2$2;
/*    */     
/*    */     public final void apply(int face) {
/*    */       apply$mcVI$sp(face);
/*    */     }
/*    */     
/*    */     public ModRedLogic$$anonfun$computeBundledInput$2(ForgeDirection side$2, ObjectRef strength$2, TileEntity x2$2) {}
/*    */     
/*    */     public void apply$mcVI$sp(int face) {
/*    */       if ((int[])this.strength$2.elem == null)
/*    */         this.strength$2.elem = scala.Array$.MODULE$.fill(16, (Function0)new ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1(this), scala.reflect.ClassTag$.MODULE$.Int()); 
/*    */       ((int[])this.strength$2.elem)[((IInsulatedRedstoneWire)this.x2$2).getInsulatedWireColour()] = scala.math.package$.MODULE$.max(((int[])this.strength$2.elem)[((IInsulatedRedstoneWire)this.x2$2).getInsulatedWireColour()], ((IRedstoneEmitter)this.x2$2).getEmittedSignalStrength(face, this.side$2.ordinal()));
/*    */     }
/*    */     
/*    */     public final class ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final int apply() {
/*    */         return apply$mcI$sp();
/*    */       }
/*    */       
/*    */       public int apply$mcI$sp() {
/*    */         return 0;
/*    */       }
/*    */       
/*    */       public ModRedLogic$$anonfun$computeBundledInput$2$$anonfun$apply$mcVI$sp$1(ModRedLogic$$anonfun$computeBundledInput$2 $outer) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$3 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ObjectRef strength$3;
/*    */     
/*    */     public final boolean apply(int i) {
/*    */       return apply$mcZI$sp(i);
/*    */     }
/*    */     
/*    */     public boolean apply$mcZI$sp(int i) {
/*    */       return ((int[])this.strength$3.elem == null);
/*    */     }
/*    */     
/*    */     public ModRedLogic$$anonfun$computeBundledInput$3(ObjectRef strength$3) {}
/*    */   }
/*    */   
/*    */   public final class ModRedLogic$$anonfun$computeBundledInput$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ForgeDirection side$2;
/*    */     private final ObjectRef strength$3;
/*    */     private final TileEntity x3$1;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public ModRedLogic$$anonfun$computeBundledInput$4(ForgeDirection side$2, ObjectRef strength$3, TileEntity x3$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       this.strength$3.elem = scala.Option$.MODULE$.apply(((IBundledEmitter)this.x3$1).getBundledCableStrength(i, this.side$2.getOpposite().ordinal())).fold((Function0)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2(this), (Function1)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3(this));
/*    */     }
/*    */     
/*    */     public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2 extends AbstractFunction0<int[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final int[] apply() {
/*    */         return null;
/*    */       }
/*    */       
/*    */       public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$2(ModRedLogic$$anonfun$computeBundledInput$4 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<byte[], int[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final int[] apply(byte[] x$1) {
/*    */         return (int[])scala.Predef$.MODULE$.byteArrayOps(x$1).map((Function1)new ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1(this), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Int()));
/*    */       }
/*    */       
/*    */       public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3(ModRedLogic$$anonfun$computeBundledInput$4 $outer) {}
/*    */       
/*    */       public final class ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         
/*    */         public final int apply(byte x$2) {
/*    */           return x$2 & 0xFF;
/*    */         }
/*    */         
/*    */         public ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3$$anonfun$apply$1(ModRedLogic$$anonfun$computeBundledInput$4$$anonfun$apply$mcVI$sp$3 $outer) {}
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\redlogic\ModRedLogic$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */