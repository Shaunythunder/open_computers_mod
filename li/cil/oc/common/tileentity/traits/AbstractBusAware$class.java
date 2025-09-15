/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import li.cil.oc.integration.util.StargateTech2$;
/*    */ import li.cil.oc.server.PacketSender$;
/*    */ import lordfokas.stargatetech2.api.StargateTechAPI;
/*    */ import lordfokas.stargatetech2.api.bus.IBusDevice;
/*    */ import lordfokas.stargatetech2.api.bus.IBusInterface;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Function1;
/*    */ import scala.PartialFunction;
/*    */ import scala.Predef$;
/*    */ import scala.collection.TraversableOnce;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class AbstractBusAware$class {
/*    */   public static Object[] fakeInterface(AbstractBusAware $this) {
/* 23 */     return new Object[] { StargateTechAPI.api().getFactory().getIBusInterface((IBusDevice)$this, null) };
/*    */   }
/*    */   public static void $init$(AbstractBusAware $this) {}
/*    */   
/*    */   @Method(modid = "StargateTech2")
/*    */   public static IBusInterface[] getInterfaces(AbstractBusAware $this, int side) {
/* 29 */     return $this.isAbstractBusAvailable() ? (
/* 30 */       $this.isServer() ? 
/* 31 */       (IBusInterface[])((TraversableOnce)$this.installedComponents().collect((PartialFunction)new AbstractBusAware$$anonfun$getInterfaces$1($this), Iterable$.MODULE$.canBuildFrom()))
/*    */       
/* 33 */       .toArray(ClassTag$.MODULE$.apply(IBusInterface.class)) : 
/*    */       
/* 35 */       (IBusInterface[])Predef$.MODULE$.refArrayOps($this.fakeInterface()).map((Function1)new AbstractBusAware$$anonfun$getInterfaces$2($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(IBusInterface.class)))) : 
/*    */       
/* 37 */       null;
/*    */   } public static World getWorld(AbstractBusAware $this) {
/* 39 */     return $this.world();
/*    */   } public static int getXCoord(AbstractBusAware $this) {
/* 41 */     return $this.x();
/*    */   } public static int getYCoord(AbstractBusAware $this) {
/* 43 */     return $this.y();
/*    */   } public static int getZCoord(AbstractBusAware $this) {
/* 45 */     return $this.z();
/*    */   } public static boolean isAbstractBusAvailable(AbstractBusAware $this) {
/* 47 */     return $this._isAbstractBusAvailable();
/*    */   }
/*    */   public static AbstractBusAware isAbstractBusAvailable_$eq(AbstractBusAware $this, boolean value) {
/* 50 */     if (value != $this.isAbstractBusAvailable()) {
/* 51 */       $this._isAbstractBusAvailable_$eq(value);
/* 52 */       ($this.isServer() && Mods$.MODULE$.StargateTech2().isAvailable()) ? 
/* 53 */         BoxesRunTime.boxToBoolean($this.isAbstractBusAvailable() ? StargateTech2$.MODULE$.addDevice($this.world(), $this.x(), $this.y(), $this.z()) : 
/* 54 */           StargateTech2$.MODULE$.removeDevice($this.world(), $this.x(), $this.y(), $this.z())) : BoxedUnit.UNIT;
/*    */       
/* 56 */       $this.world().func_147459_d($this.x(), $this.y(), $this.z(), $this.block());
/* 57 */       if ($this.isServer()) { PacketSender$.MODULE$.sendAbstractBusState($this); }
/* 58 */       else { $this.world().func_147471_g($this.x(), $this.y(), $this.z()); }
/*    */     
/* 60 */     }  return $this;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void readFromNBTForClient(AbstractBusAware $this, NBTTagCompound nbt) {
/* 65 */     $this.li$cil$oc$common$tileentity$traits$AbstractBusAware$$super$readFromNBTForClient(nbt);
/* 66 */     $this.isAbstractBusAvailable_$eq(nbt.func_74767_n("isAbstractBusAvailable"));
/*    */   }
/*    */   
/*    */   public static void writeToNBTForClient(AbstractBusAware $this, NBTTagCompound nbt) {
/* 70 */     $this.li$cil$oc$common$tileentity$traits$AbstractBusAware$$super$writeToNBTForClient(nbt);
/* 71 */     nbt.func_74757_a("isAbstractBusAvailable", $this.isAbstractBusAvailable());
/*    */   }
/*    */   
/*    */   public static void onDisconnect(AbstractBusAware $this, Node node) {
/* 75 */     $this.li$cil$oc$common$tileentity$traits$AbstractBusAware$$super$onDisconnect(node);
/* 76 */     Node node1 = $this.node(); if (node == null) { if (node1 != null) return;  } else { if (node.equals(node1))
/* 77 */       { $this.isAbstractBusAvailable_$eq(false); return; }  return; }  $this.isAbstractBusAvailable_$eq(false);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\AbstractBusAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */