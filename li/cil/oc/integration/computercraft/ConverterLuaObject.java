/*    */ package li.cil.oc.integration.computercraft;
/*    */ 
/*    */ import dan200.computercraft.api.lua.ILuaObject;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedPeripheral;
/*    */ import li.cil.oc.api.prefab.AbstractValue;
/*    */ 
/*    */ public final class ConverterLuaObject
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 14 */     if (value instanceof ILuaObject)
/* 15 */       output.put("value", new LuaObjectValue((ILuaObject)value)); 
/*    */   }
/*    */   
/*    */   public static final class LuaObjectValue
/*    */     extends AbstractValue
/*    */     implements ManagedPeripheral
/*    */   {
/*    */     private final ILuaObject value;
/*    */     protected final CallableHelper helper;
/*    */     
/*    */     public LuaObjectValue() {
/* 26 */       this.value = null;
/* 27 */       this.helper = null;
/*    */     }
/*    */     
/*    */     public LuaObjectValue(ILuaObject value) {
/* 31 */       this.value = value;
/* 32 */       this.helper = new CallableHelper(value.getMethodNames());
/*    */     }
/*    */ 
/*    */     
/*    */     public String[] methods() {
/* 37 */       if (this.value != null) return this.value.getMethodNames(); 
/* 38 */       return new String[0];
/*    */     }
/*    */ 
/*    */     
/*    */     public Object[] invoke(String method, Context context, Arguments args) throws Exception {
/* 43 */       if (this.value != null) {
/* 44 */         int index = this.helper.methodIndex(method);
/* 45 */         Object[] argArray = this.helper.convertArguments(args);
/* 46 */         return this.value.callMethod(DriverPeripheral.Environment.UnsupportedLuaContext.instance(), index, argArray);
/*    */       } 
/* 48 */       return new Object[] { null, "ComputerCraft userdata cannot be persisted" };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\ConverterLuaObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */