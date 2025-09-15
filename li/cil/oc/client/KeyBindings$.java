/*    */ package li.cil.oc.client;
/*    */ 
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import scala.Option;
/*    */ 
/*    */ public final class KeyBindings$ {
/*    */   public static final KeyBindings$ MODULE$;
/*    */   private final ArrayBuffer<Function1<KeyBinding, Object>> keyBindingChecks;
/*    */   private final ArrayBuffer<Function1<KeyBinding, Option<String>>> keyBindingNameGetters;
/*    */   private final KeyBinding materialCosts;
/*    */   private final KeyBinding clipboardPaste;
/*    */   
/* 13 */   public ArrayBuffer<Function1<KeyBinding, Object>> keyBindingChecks() { return this.keyBindingChecks; } public final class KeyBindings$$anonfun$1 extends AbstractFunction1<KeyBinding, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(KeyBinding keyBinding) { return KeyBindings$.MODULE$.isKeyBindingPressedVanilla(keyBinding); }
/*    */      }
/* 15 */   public ArrayBuffer<Function1<KeyBinding, Option<String>>> keyBindingNameGetters() { return this.keyBindingNameGetters; } public final class KeyBindings$$anonfun$2 extends AbstractFunction1<KeyBinding, Option<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<String> apply(KeyBinding keyBinding) { return KeyBindings$.MODULE$.getKeyBindingNameVanilla(keyBinding); }
/*    */      } public boolean showExtendedTooltips() {
/* 17 */     return isKeyBindingPressed(extendedTooltip());
/*    */   } public boolean showMaterialCosts() {
/* 19 */     return isKeyBindingPressed(materialCosts());
/*    */   }
/* 21 */   public boolean isPastingClipboard() { return isKeyBindingPressed(clipboardPaste()); } public final class KeyBindings$$anonfun$getKeyBindingName$2 extends AbstractFunction1<Function1<KeyBinding, Option<String>>, Option<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final KeyBinding keyBinding$2; public final Option<String> apply(Function1 x$1) { return (Option<String>)x$1.apply(this.keyBinding$2); } public KeyBindings$$anonfun$getKeyBindingName$2(KeyBinding keyBinding$2) {} }
/* 23 */   public String getKeyBindingName(KeyBinding keyBinding) { return (String)((TraversableOnce)keyBindingNameGetters().map((Function1)new KeyBindings$$anonfun$getKeyBindingName$2(keyBinding), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new KeyBindings$$anonfun$getKeyBindingName$1())
/*    */       
/* 25 */       .getOrElse((Function0)new KeyBindings$$anonfun$getKeyBindingName$3()); } public final class KeyBindings$$anonfun$getKeyBindingName$1 extends AbstractPartialFunction<Option<String>, String> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<String>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; String name = (String)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } } public final class KeyBindings$$anonfun$getKeyBindingName$3 extends AbstractFunction0<String> implements Serializable { public final String apply() { return "???"; }
/*    */      public static final long serialVersionUID = 0L; } public boolean isKeyBindingPressed(KeyBinding keyBinding) {
/* 27 */     return keyBindingChecks().forall((Function1)new KeyBindings$$anonfun$isKeyBindingPressed$1(keyBinding)); } public final class KeyBindings$$anonfun$isKeyBindingPressed$1 extends AbstractFunction1<Function1<KeyBinding, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final KeyBinding keyBinding$1; public final boolean apply(Function1 x$2) { return BoxesRunTime.unboxToBoolean(x$2.apply(this.keyBinding$1)); } public KeyBindings$$anonfun$isKeyBindingPressed$1(KeyBinding keyBinding$1) {} } public Option<String> getKeyBindingNameVanilla(KeyBinding keyBinding) { try {
/*    */     
/* 29 */     } finally {} return 
/* 30 */       (Option<String>)scala.None$.MODULE$; } public boolean isKeyBindingPressedVanilla(KeyBinding keyBinding) { try {
/*    */     
/*    */     } finally {}
/* 33 */     return false; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeyBinding extendedTooltip() {
/* 43 */     return (FMLClientHandler.instance().getClient()).field_71474_y.field_74311_E;
/*    */   } public KeyBinding materialCosts() {
/* 45 */     return this.materialCosts;
/*    */   }
/* 47 */   public KeyBinding clipboardPaste() { return this.clipboardPaste; } private KeyBindings$() {
/* 48 */     MODULE$ = this;
/*    */     (new Function1[1])[0] = (Function1)new KeyBindings$$anonfun$1();
/*    */     this.keyBindingChecks = (ArrayBuffer<Function1<KeyBinding, Object>>)scala.collection.mutable.ArrayBuffer$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1]));
/*    */     (new Function1[1])[0] = (Function1)new KeyBindings$$anonfun$2();
/*    */     this.keyBindingNameGetters = (ArrayBuffer<Function1<KeyBinding, Option<String>>>)scala.collection.mutable.ArrayBuffer$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1]));
/*    */     this.materialCosts = new KeyBinding("key.materialCosts", 0, "OpenComputers");
/*    */     this.clipboardPaste = new KeyBinding("key.clipboardPaste", 0, "OpenComputers");
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\KeyBindings$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */