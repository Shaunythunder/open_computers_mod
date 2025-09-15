/*    */ package li.cil.oc.common.launch;
/*    */ import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
/*    */ import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.common.asm.ClassTransformer;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.Null$;
/*    */ 
/*    */ @TransformerExclusions({"li.cil.oc.common.asm"})
/*    */ @MCVersion("1.7.10")
/*    */ @ScalaSignature(bytes = "\006\001]4A!\001\002\001\033\t\tBK]1og\032|'/\\3s\031>\fG-\032:\013\005\r!\021A\0027bk:\034\007N\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\tA\001\\1oO*\t1#\001\003kCZ\f\027BA\013\021\005\031y%M[3diB\021q\003I\007\0021)\021\021DG\001\013e\026d\027-\0368dQ\026\024(BA\016\035\003\r1W\016\034\006\003;y\tA!\\8eg*\tq$A\002da^L!!\t\r\003#%3U\n\024'pC\022Lgn\032)mk\036Lg\016C\003$\001\021\005A%\001\004=S:LGO\020\013\002KA\021a\005A\007\002\005!9\001\006\001b\001\n\003I\023\001C5ogR\fgnY3\026\003\025Baa\013\001!\002\023)\023!C5ogR\fgnY3!\021\025i\003\001\"\021/\003Q9W\r^'pI\016{g\016^1j]\026\0248\t\\1tgR\tq\006\005\002\020a%\021\021\007\005\002\007'R\024\030N\\4\t\013M\002A\021\t\033\002-\035,G/Q*N)J\fgn\0354pe6,'o\0217bgN$\022!\016\t\004mezS\"A\034\013\003a\nQa]2bY\006L!AO\034\003\013\005\023(/Y=\t\013q\002A\021I\037\0023\035,G/Q2dKN\034HK]1og\032|'/\\3s\0072\f7o\035\013\002}A\021agP\005\003\001^\022AAT;mY\")!\t\001C!{\005iq-\032;TKR,\bo\0217bgNDQ\001\022\001\005B\025\013!\"\0338kK\016$H)\031;b)\t1\025\n\005\0027\017&\021\001j\016\002\005+:LG\017C\003K\007\002\0071*\001\003eCR\f\007\003\002'P#^k\021!\024\006\003\035J\tA!\036;jY&\021\001+\024\002\004\033\006\004\bC\001*V\035\t14+\003\002Uo\0051\001K]3eK\032L!!\r,\013\005Q;\004C\001\034Y\023\tIvG\001\004B]f\024VM\032\025\005\001mkg\016\005\002]U:\021Q\f\033\b\003=\036t!a\0304\017\005\001,gBA1e\033\005\021'BA2\r\003\031a$o\\8u}%\tq$\003\002\036=%\0211\004H\005\0033iI!!\033\r\002#%3U\n\024'pC\022Lgn\032)mk\036Lg.\003\002lY\nIQj\021,feNLwN\034\006\003Sb\tQA^1mk\026\f\023a\\\001\007c9:d&\r\031)\t\001\tX\016\036\t\0039JL!a\0357\003+Q\023\030M\\:g_JlWM]#yG2,8/[8og2\nQ/I\001w\003Qa\027NL2jY:z7ML2p[6|gNL1t[\002")
/*    */ public class TransformerLoader implements IFMLLoadingPlugin {
/* 13 */   private final TransformerLoader instance = this; public TransformerLoader instance() { return this.instance; }
/*    */    public String getModContainerClass() {
/* 15 */     return "li.cil.oc.common.launch.CoreModContainer";
/*    */   } public String[] getASMTransformerClass() {
/* 17 */     (new String[1])[0] = ClassTransformer.class.getName(); return new String[1];
/*    */   } public Null$ getAccessTransformerClass() {
/* 19 */     return null;
/*    */   } public Null$ getSetupClass() {
/* 21 */     return null;
/*    */   }
/*    */   
/*    */   public void injectData(Map data) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\launch\TransformerLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */