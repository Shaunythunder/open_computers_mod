/*    */ package li.cil.oc.integration.nek;
/*    */ 
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001I;Q!\001\002\t\0025\t\001#T8e\035>$XI\\8vO\"\\U-_:\013\005\r!\021a\0018fW*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001#T8e\035>$XI\\8vO\"\\U-_:\024\007=\021\"\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tYB$D\001\005\023\tiBA\001\005N_\022\004&o\034=z\021\025yr\002\"\001!\003\031a\024N\\5u}Q\tQ\002C\003#\037\021\0053%\001\004hKRlu\016\032\013\002IA\021Q\005\013\b\0037\031J!a\n\003\002\t5{Gm]\005\003S)\022\021bU5na2,Wj\0343\013\005\035\"\001\"\002\027\020\t\003j\023AC5oSRL\027\r\\5{KR\ta\006\005\0020e5\t\001GC\0012\003\025\0318-\0317b\023\t\031\004G\001\003V]&$\b\"B\033\020\t\0031\024aE5t\027\026L()\0338eS:<\007K]3tg\026$GCA\034;!\ty\003(\003\002:a\t9!i\\8mK\006t\007\"B\0365\001\004a\024AA6c!\tid)D\001?\025\ty\004)\001\005tKR$\030N\\4t\025\t\t%)\001\004dY&,g\016\036\006\003\007\022\013\021\"\\5oK\016\024\030M\032;\013\003\025\0131A\\3u\023\t9eH\001\006LKf\024\025N\0343j]\036DQ!S\b\005\002)\013\021cZ3u\027\026L()\0338eS:<g*Y7f)\tY\025\013E\0020\031:K!!\024\031\003\r=\003H/[8o!\t\031r*\003\002Q)\t11\013\036:j]\036DQa\017%A\002q\002")
/*    */ public final class ModNotEnoughKeys {
/*    */   public static Option<String> getKeyBindingName(KeyBinding paramKeyBinding) {
/*    */     return ModNotEnoughKeys$.MODULE$.getKeyBindingName(paramKeyBinding);
/*    */   }
/*    */   
/*    */   public static boolean isKeyBindingPressed(KeyBinding paramKeyBinding) {
/*    */     return ModNotEnoughKeys$.MODULE$.isKeyBindingPressed(paramKeyBinding);
/*    */   }
/*    */   
/*    */   public static void initialize() {
/*    */     ModNotEnoughKeys$.MODULE$.initialize();
/*    */   }
/*    */   
/*    */   public static Mods.SimpleMod getMod() {
/*    */     return ModNotEnoughKeys$.MODULE$.getMod();
/*    */   }
/*    */   
/* 23 */   public final class ModNotEnoughKeys$$anonfun$initialize$1 extends AbstractFunction1<KeyBinding, Object> implements Serializable { public final boolean apply(KeyBinding kb) { return ModNotEnoughKeys$.MODULE$.isKeyBindingPressed(kb); } public static final long serialVersionUID = 0L; } public final class ModNotEnoughKeys$$anonfun$initialize$2 extends AbstractFunction1<KeyBinding, Option<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<String> apply(KeyBinding kb) {
/* 24 */       return ModNotEnoughKeys$.MODULE$.getKeyBindingName(kb);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class ModNotEnoughKeys$$anonfun$1
/*    */     extends AbstractFunction1<String, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final boolean apply(String x$1) {
/* 49 */       return !(x$1 == null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nek\ModNotEnoughKeys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */