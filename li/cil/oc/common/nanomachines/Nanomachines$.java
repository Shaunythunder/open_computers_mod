/*    */ package li.cil.oc.common.nanomachines;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.BehaviorProvider;
/*    */ import li.cil.oc.api.nanomachines.Controller;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class Nanomachines$ implements NanomachinesAPI {
/*    */   public static final Nanomachines$ MODULE$;
/*    */   private final Set<BehaviorProvider> providers;
/*    */   private final WeakHashMap<EntityPlayer, ControllerImpl> serverControllers;
/*    */   private final WeakHashMap<EntityPlayer, ControllerImpl> clientControllers;
/*    */   
/* 14 */   private Nanomachines$() { MODULE$ = this;
/* 15 */     this.providers = scala.collection.mutable.Set$.MODULE$.empty();
/*    */     
/* 17 */     this.serverControllers = scala.collection.mutable.WeakHashMap$.MODULE$.empty();
/* 18 */     this.clientControllers = scala.collection.mutable.WeakHashMap$.MODULE$.empty(); } public Set<BehaviorProvider> providers() { return this.providers; } public WeakHashMap<EntityPlayer, ControllerImpl> clientControllers() { return this.clientControllers; }
/*    */   public WeakHashMap<EntityPlayer, ControllerImpl> serverControllers() { return this.serverControllers; } public WeakHashMap<EntityPlayer, ControllerImpl> controllers(EntityPlayer player) {
/* 20 */     return (player.func_130014_f_()).field_72995_K ? clientControllers() : serverControllers();
/*    */   } public void addProvider(BehaviorProvider provider) {
/* 22 */     providers().$plus$eq(provider);
/*    */   } public Iterable<BehaviorProvider> getProviders() {
/* 24 */     return scala.collection.convert.WrapAsJava$.MODULE$.mutableSetAsJavaSet(providers());
/*    */   }
/*    */   
/* 27 */   public Controller getController(EntityPlayer player) { return hasController(player) ? (Controller)controllers(player).getOrElseUpdate(player, (Function0)new Nanomachines$$anonfun$getController$1(player)) : 
/* 28 */       null; } public final class Nanomachines$$anonfun$getController$1 extends AbstractFunction0<ControllerImpl> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public final ControllerImpl apply() {
/*    */       return new ControllerImpl(this.player$1);
/*    */     } public Nanomachines$$anonfun$getController$1(EntityPlayer player$1) {} } public boolean hasController(EntityPlayer player) {
/* 32 */     return li.cil.oc.util.PlayerUtils$.MODULE$.persistedData(player).func_74767_n((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hasNanomachines").toString());
/*    */   }
/*    */   
/*    */   public Controller installController(EntityPlayer player) {
/* 36 */     if (!hasController(player)) {
/* 37 */       li.cil.oc.util.PlayerUtils$.MODULE$.persistedData(player).func_74757_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hasNanomachines").toString(), true);
/*    */     }
/* 39 */     return getController(player);
/*    */   }
/*    */   
/*    */   public void uninstallController(EntityPlayer player) {
/* 43 */     Controller controller = getController(player);
/* 44 */     if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 45 */       controllerImpl.dispose();
/* 46 */       controllers(player).$minus$eq(player);
/* 47 */       li.cil.oc.util.PlayerUtils$.MODULE$.persistedData(player).func_82580_o((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("hasNanomachines").toString());
/*    */       
/* 49 */       li.cil.oc.server.PacketSender$.MODULE$.sendNanomachineConfiguration(player); BoxedUnit boxedUnit = (player.func_130014_f_()).field_72995_K ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */     else
/* 51 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\Nanomachines$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */