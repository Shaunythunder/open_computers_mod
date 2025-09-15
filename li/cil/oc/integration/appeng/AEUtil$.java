/*     */ package li.cil.oc.integration.appeng;
/*     */ import appeng.api.AEApi;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ public final class AEUtil$ {
/*     */   public static final AEUtil$ MODULE$;
/*     */   private final VersionRange versionsWithNewItemDefinitionAPI;
/*     */   
/*     */   public VersionRange versionsWithNewItemDefinitionAPI() {
/*  13 */     return this.versionsWithNewItemDefinitionAPI;
/*     */   } public boolean useNewItemDefinitionAPI() {
/*  15 */     return versionsWithNewItemDefinitionAPI().containsVersion((
/*  16 */         (ModContainer)Loader.instance().getIndexedModList().get(li.cil.oc.integration.Mods$.MODULE$.AppliedEnergistics2().id())).getProcessedVersion());
/*     */   }
/*     */   
/*     */   public boolean areChannelsEnabled() {
/*  20 */     return (AEApi.instance() != null && (
/*  21 */       useNewItemDefinitionAPI() ? areChannelsEnabledNew() : 
/*  22 */       areChannelsEnabledOld()));
/*     */   }
/*     */   private boolean areChannelsEnabledNew() {
/*  25 */     return AEApi.instance().definitions().blocks().controller().maybeStack(1).isPresent();
/*     */   } private boolean areChannelsEnabledOld() {
/*  27 */     return !(AEApi.instance().blocks() == null || (AEApi.instance().blocks()).blockController == null || (AEApi.instance().blocks()).blockController.item() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public Class<?> controllerClass() {
/*  32 */     return (AEApi.instance() == null) ? 
/*     */ 
/*     */ 
/*     */       
/*  36 */       null : (useNewItemDefinitionAPI() ? controllerClassNew() : controllerClassOld());
/*     */   }
/*     */   private Class<?> controllerClassNew() {
/*  39 */     return areChannelsEnabled() ? (Class)AEApi.instance().definitions().blocks().controller().maybeEntity().orNull() : 
/*  40 */       null;
/*     */   }
/*     */   
/*     */   private Class<?> controllerClassOld() {
/*  44 */     return areChannelsEnabled() ? Class.forName("appeng.tile.networking.TileController") : 
/*  45 */       null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isController(ItemStack stack) {
/*  50 */     return (stack != null && AEApi.instance() != null && (
/*  51 */       useNewItemDefinitionAPI() ? isControllerNew(stack) : 
/*  52 */       isControllerOld(stack)));
/*     */   }
/*     */   
/*     */   private boolean isControllerNew(ItemStack stack) {
/*  56 */     return (areChannelsEnabled() && 
/*  57 */       AEApi.instance().definitions().blocks().controller().isSameAs(stack));
/*     */   }
/*     */   private boolean isControllerOld(ItemStack stack) {
/*  60 */     return (areChannelsEnabled() && 
/*  61 */       AEApi.instance().blocks() != null && 
/*  62 */       (AEApi.instance().blocks()).blockController != null && 
/*  63 */       (AEApi.instance().blocks()).blockController.sameAsStack(stack));
/*     */   }
/*     */   
/*     */   public boolean isExportBus(ItemStack stack) {
/*  67 */     return (stack != null && AEApi.instance() != null && (
/*  68 */       useNewItemDefinitionAPI() ? isExportBusNew(stack) : 
/*  69 */       isExportBusOld(stack)));
/*     */   }
/*     */   
/*     */   private boolean isExportBusNew(ItemStack stack) {
/*  73 */     return AEApi.instance().definitions().parts().exportBus().isSameAs(stack);
/*     */   }
/*     */   private boolean isExportBusOld(ItemStack stack) {
/*  76 */     return (AEApi.instance().parts() != null && 
/*  77 */       (AEApi.instance().parts()).partExportBus != null && 
/*  78 */       (AEApi.instance().parts()).partExportBus.sameAsStack(stack));
/*     */   }
/*     */   
/*     */   public boolean isImportBus(ItemStack stack) {
/*  82 */     return (stack != null && AEApi.instance() != null && (
/*  83 */       useNewItemDefinitionAPI() ? isImportBusNew(stack) : 
/*  84 */       isImportBusOld(stack)));
/*     */   }
/*     */   
/*     */   private boolean isImportBusNew(ItemStack stack) {
/*  88 */     return AEApi.instance().definitions().parts().importBus().isSameAs(stack);
/*     */   }
/*     */   private boolean isImportBusOld(ItemStack stack) {
/*  91 */     return (AEApi.instance().parts() != null && 
/*  92 */       (AEApi.instance().parts()).partImportBus != null && 
/*  93 */       (AEApi.instance().parts()).partImportBus.sameAsStack(stack));
/*     */   }
/*     */   
/*     */   public boolean isBlockInterface(ItemStack stack) {
/*  97 */     return (stack != null && AEApi.instance() != null && (
/*  98 */       useNewItemDefinitionAPI() ? isBlockInterfaceNew(stack) : 
/*  99 */       isBlockInterfaceOld(stack)));
/*     */   }
/*     */   
/*     */   private boolean isBlockInterfaceNew(ItemStack stack) {
/* 103 */     return AEApi.instance().definitions().blocks().iface().isSameAs(stack);
/*     */   }
/*     */   private boolean isBlockInterfaceOld(ItemStack stack) {
/* 106 */     return (AEApi.instance().blocks() != null && 
/* 107 */       (AEApi.instance().blocks()).blockInterface != null && 
/* 108 */       (AEApi.instance().blocks()).blockInterface.sameAsStack(stack));
/*     */   }
/*     */   
/*     */   public boolean isPartInterface(ItemStack stack) {
/* 112 */     return (stack != null && AEApi.instance() != null && (
/* 113 */       useNewItemDefinitionAPI() ? isPartInterfaceNew(stack) : 
/* 114 */       isPartInterfaceOld(stack)));
/*     */   }
/*     */   
/*     */   private boolean isPartInterfaceNew(ItemStack stack) {
/* 118 */     return AEApi.instance().definitions().parts().iface().isSameAs(stack);
/*     */   }
/*     */   private boolean isPartInterfaceOld(ItemStack stack) {
/* 121 */     return (AEApi.instance().parts() != null && 
/* 122 */       (AEApi.instance().parts()).partInterface != null && 
/* 123 */       (AEApi.instance().parts()).partInterface.sameAsStack(stack));
/*     */   }
/*     */   
/* 126 */   public boolean isRobot(ItemStack stack) { ItemInfo itemInfo = Items.get("robot"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */      }
/* 129 */   public boolean isDrone(ItemStack stack) { ItemInfo itemInfo = Items.get("drone"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/* 131 */      } public ItemStack getAEUpgradeComponent(RobotData robot) { Object object = new Object(); try {
/* 132 */       scala.Predef$.MODULE$.refArrayOps((Object[])robot.components()).foreach((Function1)new AEUtil$$anonfun$getAEUpgradeComponent$1(object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (ItemStack)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/* 138 */     return null; }
/*     */ 
/*     */   
/* 141 */   public ItemStack getAEUpgradeComponent(DroneData drone) { Object object = new Object(); try {
/* 142 */       scala.Predef$.MODULE$.refArrayOps((Object[])drone.components()).foreach((Function1)new AEUtil$$anonfun$getAEUpgradeComponent$2(object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (ItemStack)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/* 148 */     return null; }
/*     */   public final class AEUtil$$anonfun$getAEUpgradeComponent$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey1$1; public AEUtil$$anonfun$getAEUpgradeComponent$1(Object nonLocalReturnKey1$1) {} public final void apply(ItemStack component) { // Byte code:
/*     */       //   0: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */       //   7: astore_2
/*     */       //   8: aload_2
/*     */       //   9: instanceof scala/Some
/*     */       //   12: ifeq -> 43
/*     */       //   15: aload_2
/*     */       //   16: checkcast scala/Some
/*     */       //   19: astore_3
/*     */       //   20: aload_3
/*     */       //   21: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   24: instanceof li/cil/oc/integration/appeng/ItemUpgradeAE
/*     */       //   27: ifeq -> 43
/*     */       //   30: new scala/runtime/NonLocalReturnControl
/*     */       //   33: dup
/*     */       //   34: aload_0
/*     */       //   35: getfield nonLocalReturnKey1$1 : Ljava/lang/Object;
/*     */       //   38: aload_1
/*     */       //   39: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   42: athrow
/*     */       //   43: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   46: astore #4
/*     */       //   48: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #133	-> 0
/*     */       //   #134	-> 8
/*     */       //   #133	-> 20
/*     */       //   #134	-> 21
/*     */       //   #135	-> 43
/*     */       //   #133	-> 48
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	49	0	this	Lli/cil/oc/integration/appeng/AEUtil$$anonfun$getAEUpgradeComponent$1;
/* 150 */       //   0	49	1	component	Lnet/minecraft/item/ItemStack; } } private AEUtil$() { MODULE$ = this;
/*     */     this.versionsWithNewItemDefinitionAPI = VersionRange.createFromVersionSpec("[rv2-beta-20,)"); }
/*     */ 
/*     */   
/*     */   public final class AEUtil$$anonfun$getAEUpgradeComponent$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Object nonLocalReturnKey2$1;
/*     */     
/*     */     public AEUtil$$anonfun$getAEUpgradeComponent$2(Object nonLocalReturnKey2$1) {}
/*     */     
/*     */     public final void apply(ItemStack component) {
/*     */       // Byte code:
/*     */       //   0: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */       //   7: astore_2
/*     */       //   8: aload_2
/*     */       //   9: instanceof scala/Some
/*     */       //   12: ifeq -> 43
/*     */       //   15: aload_2
/*     */       //   16: checkcast scala/Some
/*     */       //   19: astore_3
/*     */       //   20: aload_3
/*     */       //   21: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   24: instanceof li/cil/oc/integration/appeng/ItemUpgradeAE
/*     */       //   27: ifeq -> 43
/*     */       //   30: new scala/runtime/NonLocalReturnControl
/*     */       //   33: dup
/*     */       //   34: aload_0
/*     */       //   35: getfield nonLocalReturnKey2$1 : Ljava/lang/Object;
/*     */       //   38: aload_1
/*     */       //   39: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   42: athrow
/*     */       //   43: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   46: astore #4
/*     */       //   48: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #143	-> 0
/*     */       //   #144	-> 8
/*     */       //   #143	-> 20
/*     */       //   #144	-> 21
/*     */       //   #145	-> 43
/*     */       //   #143	-> 48
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	49	0	this	Lli/cil/oc/integration/appeng/AEUtil$$anonfun$getAEUpgradeComponent$2;
/*     */       //   0	49	1	component	Lnet/minecraft/item/ItemStack;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\AEUtil$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */