/*    */ package li.cil.oc.common.template;
/*    */ import java.lang.reflect.Method;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.SeqLike;
/*    */ import scala.collection.TraversableOnce;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class AssemblerTemplates$ {
/*    */   public static final AssemblerTemplates$ MODULE$;
/*    */   private final AssemblerTemplates.Slot NoSlot;
/*    */   private final ArrayBuffer<AssemblerTemplates.Template> templates;
/*    */   private final ArrayBuffer<Method> templateFilters;
/*    */   
/*    */   public AssemblerTemplates.Slot NoSlot() {
/* 23 */     return this.NoSlot;
/*    */   } private ArrayBuffer<AssemblerTemplates.Template> templates() {
/* 25 */     return this.templates;
/*    */   } private ArrayBuffer<Method> templateFilters() {
/* 27 */     return this.templateFilters;
/*    */   }
/*    */   
/* 30 */   public void add(NBTTagCompound template) { (new Class[1])[0] = ItemStack.class; Method selector = li.cil.oc.common.IMC$.MODULE$.getStaticMethod(template.func_74779_i("select"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/* 31 */     (new Class[1])[0] = IInventory.class; Method validator = li.cil.oc.common.IMC$.MODULE$.getStaticMethod(template.func_74779_i("validate"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/* 32 */     (new Class[1])[0] = IInventory.class; Method assembler = li.cil.oc.common.IMC$.MODULE$.getStaticMethod(template.func_74779_i("assemble"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/* 33 */     Option<Class<EnvironmentHost>> hostClass = tryGetHostClass(template.func_74779_i("hostClass"));
/* 34 */     AssemblerTemplates.Slot[] containerSlots = (AssemblerTemplates.Slot[])((TraversableOnce)((SeqLike)li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(template.func_150295_c("containerSlots", 10)).map((Function1)new AssemblerTemplates$$anonfun$1(hostClass)).take(3)).padTo(3, NoSlot(), scala.collection.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(AssemblerTemplates.Slot.class));
/* 35 */     AssemblerTemplates.Slot[] upgradeSlots = (AssemblerTemplates.Slot[])((TraversableOnce)((SeqLike)li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(template.func_150295_c("upgradeSlots", 10)).map((Function1)new AssemblerTemplates$$anonfun$2(hostClass)).take(9)).padTo(9, NoSlot(), scala.collection.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(AssemblerTemplates.Slot.class));
/* 36 */     AssemblerTemplates.Slot[] componentSlots = (AssemblerTemplates.Slot[])((TraversableOnce)((SeqLike)li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagList(template.func_150295_c("componentSlots", 10)).map((Function1)new AssemblerTemplates$$anonfun$3(hostClass)).take(9)).padTo(9, NoSlot(), scala.collection.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(AssemblerTemplates.Slot.class));
/*    */     
/* 38 */     templates().$plus$eq(new AssemblerTemplates.Template(selector, validator, assembler, containerSlots, upgradeSlots, componentSlots)); }
/*    */   public final class AssemblerTemplates$$anonfun$1 extends AbstractFunction1<NBTTagCompound, AssemblerTemplates.Slot> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Option hostClass$1; public final AssemblerTemplates.Slot apply(NBTTagCompound tag) {
/*    */       return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)new Some(li.cil.oc.common.Slot$.MODULE$.Container()), this.hostClass$1);
/* 42 */     } public AssemblerTemplates$$anonfun$1(Option hostClass$1) {} } public void addFilter(String method) { (new Class[1])[0] = ItemStack.class; templateFilters().$plus$eq(li.cil.oc.common.IMC$.MODULE$.getStaticMethod(method, (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]))); }
/*    */   public final class AssemblerTemplates$$anonfun$2 extends AbstractFunction1<NBTTagCompound, AssemblerTemplates.Slot> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Option hostClass$1; public final AssemblerTemplates.Slot apply(NBTTagCompound tag) { return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)new Some(li.cil.oc.common.Slot$.MODULE$.Upgrade()), this.hostClass$1); } public AssemblerTemplates$$anonfun$2(Option hostClass$1) {} } public final class AssemblerTemplates$$anonfun$3 extends AbstractFunction1<NBTTagCompound, AssemblerTemplates.Slot> implements Serializable {
/* 46 */     public static final long serialVersionUID = 0L; private final Option hostClass$1; public final AssemblerTemplates.Slot apply(NBTTagCompound tag) { return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)scala.None$.MODULE$, this.hostClass$1); } public AssemblerTemplates$$anonfun$3(Option hostClass$1) {} } public Option<AssemblerTemplates.Template> select(ItemStack stack) { return (stack != null && templateFilters().forall((Function1)new AssemblerTemplates$$anonfun$select$1(stack))) ? 
/* 47 */       templates().find((Function1)new AssemblerTemplates$$anonfun$select$2(stack)) : 
/*    */       
/* 49 */       (Option<AssemblerTemplates.Template>)scala.None$.MODULE$; }
/*    */ 
/*    */ 
/*    */   
/*    */   public final class AssemblerTemplates$$anonfun$select$1
/*    */     extends AbstractFunction1<Method, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     private final ItemStack stack$1;
/*    */ 
/*    */     
/*    */     public final boolean apply(Method x$1) {
/*    */       return BoxesRunTime.unboxToBoolean(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic(x$1, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(true)));
/*    */     }
/*    */ 
/*    */     
/*    */     public AssemblerTemplates$$anonfun$select$1(ItemStack stack$1) {}
/*    */   }
/*    */ 
/*    */   
/*    */   public final class AssemblerTemplates$$anonfun$select$2
/*    */     extends AbstractFunction1<AssemblerTemplates.Template, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     private final ItemStack stack$1;
/*    */ 
/*    */     
/*    */     public final boolean apply(AssemblerTemplates.Template x$2) {
/*    */       return x$2.select(this.stack$1);
/*    */     }
/*    */ 
/*    */     
/*    */     public AssemblerTemplates$$anonfun$select$2(ItemStack stack$1) {}
/*    */   }
/*    */   
/*    */   public AssemblerTemplates.Slot li$cil$oc$common$template$AssemblerTemplates$$parseSlot(NBTTagCompound nbt, Option kindOverride, Option<Class<? extends EnvironmentHost>> hostClass) {
/* 89 */     String kind = (String)kindOverride.getOrElse((Function0)new AssemblerTemplates$$anonfun$6(nbt));
/* 90 */     int tier = nbt.func_74764_b("tier") ? nbt.func_74762_e("tier") : Integer.MAX_VALUE;
/* 91 */     (new Class[4])[0] = IInventory.class; (new Class[4])[1] = int.class; (new Class[4])[2] = int.class; (new Class[4])[3] = ItemStack.class; Option<Method> validator = nbt.func_74764_b("validate") ? scala.Option$.MODULE$.apply(li.cil.oc.common.IMC$.MODULE$.getStaticMethod(nbt.func_74779_i("validate"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[4]))) : (Option)scala.None$.MODULE$;
/* 92 */     return new AssemblerTemplates.Slot(kind, tier, validator, hostClass);
/*    */   } public final class AssemblerTemplates$$anonfun$6 extends AbstractFunction0<String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final String apply() {
/*    */       return this.nbt$1.func_74764_b("type") ? this.nbt$1.func_74779_i("type") : li.cil.oc.common.Slot$.MODULE$.None();
/* 96 */     } public AssemblerTemplates$$anonfun$6(NBTTagCompound nbt$1) {} } private Option<Class<EnvironmentHost>> tryGetHostClass(String name) { return Strings.isNullOrEmpty(name) ? (Option<Class<EnvironmentHost>>)scala.None$.MODULE$ : 
/* 97 */       scala.Option$.MODULE$.apply(Class.forName(name).asSubclass(EnvironmentHost.class)); } private AssemblerTemplates$() {
/* 98 */     MODULE$ = this;
/*    */     this.NoSlot = new AssemblerTemplates.Slot(li.cil.oc.common.Slot$.MODULE$.None(), -1, (Option<Method>)scala.None$.MODULE$, (Option<Class<? extends EnvironmentHost>>)scala.None$.MODULE$);
/*    */     this.templates = (ArrayBuffer<AssemblerTemplates.Template>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*    */     this.templateFilters = (ArrayBuffer<Method>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\AssemblerTemplates$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */