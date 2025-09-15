/*    */ package li.cil.oc.integration.computercraft;
/*    */ 
/*    */ import com.google.common.collect.Iterables;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ 
/*    */ public final class CallableHelper {
/*    */   private final List<String> _methods;
/*    */   
/*    */   public CallableHelper(String[] methods) {
/* 13 */     this._methods = Arrays.asList(methods);
/*    */   }
/*    */   
/*    */   public int methodIndex(String method) throws NoSuchMethodException {
/* 17 */     int index = this._methods.indexOf(method);
/* 18 */     if (index < 0) {
/* 19 */       throw new NoSuchMethodException();
/*    */     }
/* 21 */     return index;
/*    */   }
/*    */   
/*    */   public Object[] convertArguments(Arguments args) throws UnsupportedEncodingException {
/* 25 */     Object[] argArray = Iterables.toArray((Iterable)args, Object.class);
/* 26 */     for (int i = 0; i < argArray.length; i++) {
/* 27 */       if (argArray[i] instanceof byte[]) {
/* 28 */         argArray[i] = new String((byte[])argArray[i], "UTF-8");
/*    */       }
/*    */     } 
/* 31 */     return argArray;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\CallableHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */