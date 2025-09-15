/*    */ package li.cil.oc.client;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxesRunTime;
/* 13 */ @ScalaSignature(bytes = "\006\0011<Q!\001\002\t\002-\t1bS3z\005&tG-\0338hg*\0211\001B\001\007G2LWM\034;\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\006LKf\024\025N\0343j]\036\0348CA\007\021!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005\031\te.\037*fM\")q#\004C\0011\0051A(\0338jiz\"\022a\003\005\b55\021\r\021\"\001\034\003AYW-\037\"j]\022LgnZ\"iK\016\\7/F\001\035!\ri\"\005J\007\002=)\021q\004I\001\b[V$\030M\0317f\025\t\t##\001\006d_2dWm\031;j_:L!a\t\020\003\027\005\023(/Y=Ck\0324WM\035\t\005#\025:#'\003\002'%\tIa)\0368di&|g.\r\t\003QAj\021!\013\006\003U-\n\001b]3ui&twm\035\006\003\0071R!!\f\030\002\0235Lg.Z2sC\032$(\"A\030\002\0079,G/\003\0022S\tQ1*Z=CS:$\027N\\4\021\005E\031\024B\001\033\023\005\035\021un\0347fC:DaAN\007!\002\023a\022!E6fs\nKg\016Z5oO\016CWmY6tA!9\001(\004b\001\n\003I\024!F6fs\nKg\016Z5oO:\013W.Z$fiR,'o]\013\002uA\031QDI\036\021\tE)s\005\020\t\004#uz\024B\001 \023\005\031y\005\017^5p]B\021\001)R\007\002\003*\021!iQ\001\005Y\006twMC\001E\003\021Q\027M^1\n\005\031\013%AB*ue&tw\r\003\004I\033\001\006IAO\001\027W\026L()\0338eS:<g*Y7f\017\026$H/\032:tA!)!*\004C\001\027\006!2\017[8x\013b$XM\0343fIR{w\016\034;jaN,\022A\r\005\006\0336!\taS\001\022g\"|w/T1uKJL\027\r\\\"pgR\034\b\"B(\016\t\003Y\025AE5t!\006\034H/\0338h\0072L\007OY8be\022DQ!U\007\005\002I\013\021cZ3u\027\026L()\0338eS:<g*Y7f)\ty4\013C\003U!\002\007q%\001\006lKf\024\025N\0343j]\036DQAV\007\005\002]\0131#[:LKf\024\025N\0343j]\036\004&/Z:tK\022$\"A\r-\t\013Q+\006\031A\024\t\013ikA\021A.\0021\035,GoS3z\005&tG-\0338h\035\006lWMV1oS2d\027\r\006\002=9\")A+\027a\001O!)a,\004C\001?\006Q\022n]&fs\nKg\016Z5oOB\023Xm]:fIZ\013g.\0337mCR\021!\007\031\005\006)v\003\ra\n\005\006E6!\taY\001\020Kb$XM\0343fIR{w\016\034;jaV\tq\005C\004f\033\t\007I\021A2\002\0335\fG/\032:jC2\034un\035;t\021\0319W\002)A\005O\005qQ.\031;fe&\fGnQ8tiN\004\003bB5\016\005\004%\taY\001\017G2L\007OY8be\022\004\026m\035;f\021\031YW\002)A\005O\005y1\r\\5qE>\f'\017\032)bgR,\007\005") public final class KeyBindings { public static KeyBinding clipboardPaste() { return KeyBindings$.MODULE$.clipboardPaste(); } public static KeyBinding materialCosts() { return KeyBindings$.MODULE$.materialCosts(); } public static KeyBinding extendedTooltip() { return KeyBindings$.MODULE$.extendedTooltip(); } public static boolean isKeyBindingPressedVanilla(KeyBinding paramKeyBinding) { return KeyBindings$.MODULE$.isKeyBindingPressedVanilla(paramKeyBinding); } public static Option<String> getKeyBindingNameVanilla(KeyBinding paramKeyBinding) { return KeyBindings$.MODULE$.getKeyBindingNameVanilla(paramKeyBinding); } public static boolean isKeyBindingPressed(KeyBinding paramKeyBinding) { return KeyBindings$.MODULE$.isKeyBindingPressed(paramKeyBinding); } public static String getKeyBindingName(KeyBinding paramKeyBinding) { return KeyBindings$.MODULE$.getKeyBindingName(paramKeyBinding); } public static boolean isPastingClipboard() { return KeyBindings$.MODULE$.isPastingClipboard(); } public static boolean showMaterialCosts() { return KeyBindings$.MODULE$.showMaterialCosts(); } public static boolean showExtendedTooltips() { return KeyBindings$.MODULE$.showExtendedTooltips(); } public static ArrayBuffer<Function1<KeyBinding, Option<String>>> keyBindingNameGetters() { return KeyBindings$.MODULE$.keyBindingNameGetters(); } public static ArrayBuffer<Function1<KeyBinding, Object>> keyBindingChecks() { return KeyBindings$.MODULE$.keyBindingChecks(); } public final class KeyBindings$$anonfun$1 extends AbstractFunction1<KeyBinding, Object> implements Serializable { public final boolean apply(KeyBinding keyBinding) { return KeyBindings$.MODULE$.isKeyBindingPressedVanilla(keyBinding); }
/*    */      public static final long serialVersionUID = 0L; } public final class KeyBindings$$anonfun$2 extends AbstractFunction1<KeyBinding, Option<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<String> apply(KeyBinding keyBinding) {
/* 15 */       return KeyBindings$.MODULE$.getKeyBindingNameVanilla(keyBinding);
/*    */     } }
/*    */ 
/*    */   
/*    */   public final class KeyBindings$$anonfun$getKeyBindingName$2 extends AbstractFunction1<Function1<KeyBinding, Option<String>>, Option<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final KeyBinding keyBinding$2;
/*    */     
/* 23 */     public final Option<String> apply(Function1 x$1) { return (Option<String>)x$1.apply(this.keyBinding$2); } public KeyBindings$$anonfun$getKeyBindingName$2(KeyBinding keyBinding$2) {} } public final class KeyBindings$$anonfun$getKeyBindingName$1 extends AbstractPartialFunction<Option<String>, String> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<String>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1;
/* 24 */       if (option instanceof Some) { Some some = (Some)option; String name = (String)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }
/* 25 */        return bool; } } public final class KeyBindings$$anonfun$getKeyBindingName$3 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return "???"; }
/*    */      } public final class KeyBindings$$anonfun$isKeyBindingPressed$1 extends AbstractFunction1<Function1<KeyBinding, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final KeyBinding keyBinding$1; public final boolean apply(Function1 x$2) {
/* 27 */       return BoxesRunTime.unboxToBoolean(x$2.apply(this.keyBinding$1));
/*    */     }
/*    */     
/*    */     public KeyBindings$$anonfun$isKeyBindingPressed$1(KeyBinding keyBinding$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\KeyBindings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */