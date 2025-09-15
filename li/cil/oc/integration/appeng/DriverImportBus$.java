/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.parts.IPart;
/*    */ import appeng.api.parts.IPartHost;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class DriverImportBus$ implements SidedBlock {
/* 16 */   private DriverImportBus$() { MODULE$ = this; } public static final DriverImportBus$ MODULE$; public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) {
/*    */     boolean bool;
/* 18 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 19 */     if (tileEntity instanceof IPartHost) { TileEntity tileEntity1 = tileEntity; bool = scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new DriverImportBus$$anonfun$worksWith$1(tileEntity1), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IPart.class)))).filter((Function1)new DriverImportBus$$anonfun$worksWith$2())).exists((Function1)new DriverImportBus$$anonfun$worksWith$3()); }
/* 20 */     else { bool = false; }
/*    */     
/*    */     return bool; } public DriverImportBus.Environment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return new DriverImportBus.Environment((IPartHost)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public final class DriverImportBus$$anonfun$worksWith$1 extends AbstractFunction1<ForgeDirection, IPart> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final TileEntity x2$1;
/*    */     
/*    */     public final IPart apply(ForgeDirection x$1) {
/*    */       return ((IPartHost)this.x2$1).getPart(x$1);
/*    */     }
/*    */     
/*    */     public DriverImportBus$$anonfun$worksWith$1(TileEntity x2$1) {}
/*    */   }
/*    */   
/*    */   public final class DriverImportBus$$anonfun$worksWith$2 extends AbstractFunction1<IPart, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(IPart obj) {
/*    */       return !(obj == null);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class DriverImportBus$$anonfun$worksWith$3 extends AbstractFunction1<IPart, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(IPart x$1) {
/*    */       return x$1 instanceof appeng.parts.automation.PartImportBus;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverImportBus$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */