/*     */ package li.cil.oc.common.inventory;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.util.Lifecycle;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Array$;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ public abstract class ComponentInventory$class {
/*     */   public static void $init$(ComponentInventory $this) {
/*  21 */     $this.isSizeInventoryReady_$eq(true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     $this.li$cil$oc$common$inventory$ComponentInventory$_setter_$updatingComponents_$eq((ArrayBuffer)ArrayBuffer$.MODULE$.empty());
/*     */   }
/*     */   public static Option[] components(ComponentInventory $this) {
/*     */     if ($this.li$cil$oc$common$inventory$ComponentInventory$$_components() == null && $this.isSizeInventoryReady())
/*     */       $this.li$cil$oc$common$inventory$ComponentInventory$$_components_$eq((Option<ManagedEnvironment>[])Array$.MODULE$.fill($this.func_70302_i_(), (Function0)new ComponentInventory$$anonfun$components$1($this), ClassTag$.MODULE$.apply(Option.class))); 
/*     */     return ($this.li$cil$oc$common$inventory$ComponentInventory$$_components() == null) ? (Option[])Array$.MODULE$.apply((Seq)Nil$.MODULE$, ClassTag$.MODULE$.apply(Option.class)) : (Option[])$this.li$cil$oc$common$inventory$ComponentInventory$$_components();
/*     */   }
/*     */   
/*     */   public static void updateComponents(ComponentInventory $this) {
/*  39 */     if ($this.updatingComponents().nonEmpty()) {
/*  40 */       int i = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  46 */       while (i < $this.updatingComponents().size()) {
/*  47 */         ((ManagedEnvironment)$this.updatingComponents().apply(i)).update();
/*  48 */         i++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void connectComponents(ComponentInventory $this) {
/*  56 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), $this.func_70302_i_()).withFilter((Function1)new ComponentInventory$$anonfun$connectComponents$1($this)).foreach((Function1)new ComponentInventory$$anonfun$connectComponents$2($this));
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
/*  82 */     Network.joinNewNetwork($this.node());
/*  83 */     Predef$.MODULE$.refArrayOps((Object[])$this.components()).collect((PartialFunction)new ComponentInventory$$anonfun$connectComponents$3($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void disconnectComponents(ComponentInventory $this) {
/*  92 */     Predef$.MODULE$.refArrayOps((Object[])$this.components()).collect((PartialFunction)new ComponentInventory$$anonfun$disconnectComponents$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Unit()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void save(ComponentInventory $this, NBTTagCompound nbt) {
/* 103 */     $this.saveComponents();
/* 104 */     $this.li$cil$oc$common$inventory$ComponentInventory$$super$save(nbt);
/*     */   }
/*     */   public static void saveComponents(ComponentInventory $this) {
/* 107 */     Object object = new Object(); try { RichInt$.MODULE$
/* 108 */         .until$extension0(Predef$.MODULE$.intWrapper(0), $this.func_70302_i_()).foreach$mVc$sp((Function1)new ComponentInventory$$anonfun$saveComponents$1($this, object)); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) { nonLocalReturnControl.value$mcV$sp();
/*     */         return; }
/*     */        }
/*     */   
/*     */   }
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
/*     */   public static int getInventoryStackLimit(ComponentInventory $this) {
/* 131 */     return 1;
/*     */   } public static void onItemAdded(ComponentInventory $this, int slot, ItemStack stack) {
/* 133 */     if (slot >= 0 && slot < ($this.components()).length && $this.isComponentSlot(slot, stack)) {
/* 134 */       Option$.MODULE$.apply(Driver.driverFor(stack)).foreach((Function1)new ComponentInventory$$anonfun$onItemAdded$1($this, slot, stack));
/*     */     }
/*     */   }
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
/*     */   public static void onItemRemoved(ComponentInventory $this, int slot, ItemStack stack) {
/* 157 */     if (slot >= 0 && slot < ($this.components()).length) {
/*     */       
/* 159 */       Option<ManagedEnvironment> option = $this.components()[slot];
/* 160 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment component = (ManagedEnvironment)some.x(); synchronized ($this) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 165 */           $this.components()[slot] = (Option<ManagedEnvironment>)None$.MODULE$;
/* 166 */           $this.updatingComponents().$minus$eq(component);
/* 167 */           $this.applyLifecycleState(component, Lifecycle.LifecycleState.Disposing);
/* 168 */           Option$.MODULE$.apply(component.node()).foreach((Function1)new ComponentInventory$$anonfun$onItemRemoved$1($this));
/* 169 */           Option$.MODULE$.apply(Driver.driverFor(stack)).foreach((Function1)new ComponentInventory$$anonfun$onItemRemoved$2($this, component, stack));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 174 */           Option$.MODULE$.apply(component.node()).foreach((Function1)new ComponentInventory$$anonfun$onItemRemoved$3($this));
/* 175 */           $this.applyLifecycleState(component, Lifecycle.LifecycleState.Disposed); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = boxedUnit2; return;
/*     */         }  }
/* 177 */        BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     } 
/*     */   }
/*     */   public static boolean isComponentSlot(ComponentInventory $this, int slot, ItemStack stack) {
/* 181 */     return true;
/*     */   }
/*     */   public static void connectItemNode(ComponentInventory $this, Node node) {
/* 184 */     if ($this.node() != null && node != null) {
/* 185 */       $this.node().connect(node);
/*     */     }
/*     */   }
/*     */   
/*     */   public static NBTTagCompound dataTag(ComponentInventory $this, Item driver, ItemStack stack) {
/* 190 */     return (NBTTagCompound)Option$.MODULE$.apply(driver.dataTag(stack)).getOrElse((Function0)new ComponentInventory$$anonfun$dataTag$1($this, stack));
/*     */   }
/*     */   
/*     */   public static void save(ComponentInventory $this, ManagedEnvironment component, Item driver, ItemStack stack) { try {
/* 194 */       NBTTagCompound tag = $this.dataTag(driver, stack);
/*     */ 
/*     */       
/* 197 */       ((IterableLike)WrapAsScala$.MODULE$.asScalaSet(tag.func_150296_c()).map((Function1)new ComponentInventory$$anonfun$save$1($this), Set$.MODULE$.canBuildFrom())).foreach((Function1)new ComponentInventory$$anonfun$save$2($this, tag));
/*     */ 
/*     */       
/* 200 */       component.save(tag);
/*     */     } finally {
/*     */       Exception exception = null;
/*     */       (new String[3])[0] = "An item component of type '";
/*     */       (new String[3])[1] = "' (provided by driver '";
/*     */       (new String[3])[2] = "') threw an error while saving.";
/* 206 */     }  } public static void applyLifecycleState(ComponentInventory $this, Object component, Lifecycle.LifecycleState state) { Object object = component;
/* 207 */     if (object instanceof Lifecycle) { Lifecycle lifecycle = (Lifecycle)object; lifecycle.onLifecycleStateChange(state); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 208 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\ComponentInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */