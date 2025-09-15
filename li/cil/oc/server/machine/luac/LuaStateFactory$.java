/*     */ package li.cil.oc.server.machine.luac;
/*     */ 
/*     */ import li.cil.oc.api.Driver;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.driver.item.MutableProcessor;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
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
/*     */ public final class LuaStateFactory$
/*     */ {
/*     */   public static final LuaStateFactory$ MODULE$;
/*     */   
/*     */   public boolean isAvailable() {
/*  27 */     boolean lua52 = LuaStateFactory.Lua52$.MODULE$.isAvailable();
/*  28 */     boolean lua53 = LuaStateFactory.Lua53$.MODULE$.isAvailable();
/*  29 */     boolean lua54 = LuaStateFactory.Lua54$.MODULE$.isAvailable();
/*  30 */     return (lua52 || lua53 || lua54);
/*     */   }
/*     */   public boolean luajRequested() {
/*  33 */     return (li.cil.oc.Settings$.MODULE$.get().forceLuaJ() || li.cil.oc.Settings$.MODULE$.get().registerLuaJArchitecture());
/*     */   } public boolean includeLuaJ() {
/*  35 */     return !(isAvailable() && !luajRequested());
/*     */   } public boolean include52() {
/*  37 */     return (LuaStateFactory.Lua52$.MODULE$.isAvailable() && !li.cil.oc.Settings$.MODULE$.get().forceLuaJ());
/*     */   } public boolean include53() {
/*  39 */     return (LuaStateFactory.Lua53$.MODULE$.isAvailable() && li.cil.oc.Settings$.MODULE$.get().enableLua53() && !li.cil.oc.Settings$.MODULE$.get().forceLuaJ());
/*     */   } public boolean include54() {
/*  41 */     return (LuaStateFactory.Lua54$.MODULE$.isAvailable() && li.cil.oc.Settings$.MODULE$.get().enableLua54() && !li.cil.oc.Settings$.MODULE$.get().forceLuaJ());
/*     */   } public boolean default53() {
/*  43 */     return (include53() && li.cil.oc.Settings$.MODULE$.get().defaultLua53());
/*     */   }
/*     */   public ItemStack setDefaultArch(ItemStack stack) {
/*  46 */     if (default53()) {
/*  47 */       Class<NativeLua53Architecture> lua53 = NativeLua53Architecture.class;
/*  48 */       scala.Option$.MODULE$.apply(Driver.driverFor(stack)).foreach((Function1)new LuaStateFactory$$anonfun$setDefaultArch$1(stack, lua53));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     return stack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class LuaStateFactory$$anonfun$setDefaultArch$1
/*     */     extends AbstractFunction1<Item, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemStack stack$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Class lua53$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(Item x0$1) {
/*     */       Item item = x0$1;
/*     */       if (item instanceof MutableProcessor) {
/*     */         MutableProcessor mutableProcessor = (MutableProcessor)item;
/*     */         mutableProcessor.setArchitecture(this.stack$1, this.lua53$1);
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaStateFactory$$anonfun$setDefaultArch$1(ItemStack stack$1, Class lua53$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private LuaStateFactory$() {
/* 121 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\LuaStateFactory$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */