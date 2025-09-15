/*    */ package li.cil.oc.common.component;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=3A!\001\002\001\033\t11k\031:fK:T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005)!V\r\037;Ck\0324WM\035\005\t'\001\021)\031!C\001)\00511o\031:fK:,\022!\006\t\003-ei\021a\006\006\0031\021\t!\002^5mK\026tG/\033;z\023\t\tq\003C\005\034\001\t\005\t\025!\003\0269\00591o\031:fK:\004\023BA\017\021\003\021Awn\035;\t\013}\001A\021\001\021\002\rqJg.\033;?)\t\t#\005\005\002\020\001!)1C\ba\001+!)A\005\001C\001K\005\031\022n\035+pk\016DWj\0343f\023:4XM\035;fIR\031aeL\035\021\007\035RC&D\001)\025\005I\023!B:dC2\f\027BA\026)\005\025\t%O]1z!\t9S&\003\002/Q\t1\021I\\=SK\032DQ\001M\022A\002E\n\001bY8naV$XM\035\t\003e]j\021a\r\006\003iU\nq!\\1dQ&tWM\003\0027\r\005\031\021\r]5\n\005a\032$aB\"p]R,\007\020\036\005\006u\r\002\raO\001\005CJ<7\017\005\0023y%\021Qh\r\002\n\003J<W/\\3oiNDcaI C\007\022+\005C\001\032A\023\t\t5G\001\005DC2d'-Y2l\003\031!\027N]3dif\t\021!A\002e_\016\f\023AR\001mMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.A]CW\r\0365fe\002\"x.^2iA5|G-\032\021jg\002JgN^3si\026$\007\005K:oK\006\\W&Y2uSZ\fG/\032\021pa\026t7\017I$V\0232\002\023N\\:uK\006$\007e\0344!]>\024X.\0317!C\016$\030N^1uK&r\003\"\002%\001\t\003I\025\001F:fiR{Wo\0315N_\022,\027J\034<feR,G\rF\002'\025.CQ\001M$A\002EBQAO$A\002mBCaR E\033\006\na*\001?gk:\034G/[8oQY\fG.^3;E>|G.Z1oSi\022wn\0347fC:\004S&\f\021TKR\034\be\0365fi\",'\017\t;pA%tg/\032:uAQ|Wo\0315![>$W\r\t\025t]\026\f7.L1di&4\030\r^3!_B,gn\035\021H+&c\003%\0338ti\026\fG\rI8gA9|'/\\1mA\005\034G/\033<bi\026Lc\006")
/*    */ public class Screen extends TextBuffer {
/*  9 */   public li.cil.oc.common.tileentity.Screen screen() { return (li.cil.oc.common.tileentity.Screen)host(); } public Screen(li.cil.oc.common.tileentity.Screen screen) { super((EnvironmentHost)screen); } @Callback(direct = true, doc = "function():boolean -- Whether touch mode is inverted (sneak-activate opens GUI, instead of normal activate).")
/*    */   public Object[] isTouchModeInverted(Context computer, Arguments args) {
/* 11 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(screen().invertTouchMode()) }));
/*    */   }
/*    */   @Callback(doc = "function(value:boolean):boolean -- Sets whether to invert touch mode (sneak-activate opens GUI, instead of normal activate).")
/*    */   public Object[] setTouchModeInverted(Context computer, Arguments args) {
/* 15 */     boolean newValue = args.checkBoolean(0);
/* 16 */     boolean oldValue = screen().invertTouchMode();
/* 17 */     if (newValue != oldValue) {
/* 18 */       screen().invertTouchMode_$eq(newValue);
/* 19 */       PacketSender$.MODULE$.sendScreenTouchMode(screen(), newValue);
/*    */     } 
/* 21 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(oldValue) }));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\Screen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */