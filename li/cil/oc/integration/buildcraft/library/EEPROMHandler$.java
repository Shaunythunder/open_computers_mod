/*    */ package li.cil.oc.integration.buildcraft.library;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class EEPROMHandler$ extends LibraryTypeHandlerNBT {
/*    */   public static final EEPROMHandler$ MODULE$;
/*    */   
/* 13 */   private EEPROMHandler$() { super("ocrom"); MODULE$ = this; }
/* 14 */   public boolean isHandler(ItemStack stack, LibraryTypeHandler.HandlerType handlerType) { ItemInfo itemInfo = Items.get("eeprom"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*    */     {  }
/* 16 */      } public int getTextColor() { return 13434828; }
/*    */ 
/*    */   
/* 19 */   public String getName(ItemStack stack) { Item driver = Driver.driverFor(stack);
/* 20 */     return (driver == null) ? (
/*    */ 
/*    */       
/* 23 */       new StringBuilder()).append(EnumChatFormatting.OBFUSCATED.toString()).append("?????").toString() : driver.dataTag(stack).func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("label").toString()); }
/*    */   public final class EEPROMHandler$$anonfun$load$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; private final NBTTagCompound stackData$1; public final void apply(Object x0$1) { Object object = x0$1; if (object instanceof String) {
/*    */         String str = (String)object; this.stackData$1.func_74782_a(str, this.nbt$1.func_74781_a(str)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return;
/* 27 */       }  throw new MatchError(object); } public EEPROMHandler$$anonfun$load$1(NBTTagCompound nbt$1, NBTTagCompound stackData$1) {} } public ItemStack load(ItemStack stack, NBTTagCompound nbt) { Item driver = Driver.driverFor(stack);
/* 28 */     if (driver != null) {
/* 29 */       NBTTagCompound stackData = driver.dataTag(stack);
/* 30 */       scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(nbt.func_150296_c()).foreach((Function1)new EEPROMHandler$$anonfun$load$1(nbt, stackData));
/*    */     } 
/*    */ 
/*    */     
/* 34 */     return stack; }
/*    */ 
/*    */   
/*    */   public boolean store(ItemStack stack, NBTTagCompound nbt) {
/* 38 */     Item driver = Driver.driverFor(stack);
/*    */     
/* 40 */     NBTTagCompound stackData = driver.dataTag(stack);
/* 41 */     scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(stackData.func_150296_c()).foreach((Function1)new EEPROMHandler$$anonfun$store$1(nbt, stackData)); return !(driver == null); } public final class EEPROMHandler$$anonfun$store$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; private final NBTTagCompound stackData$2; public final void apply(Object x0$2) { Object object = x0$2;
/* 42 */       if (object instanceof String) { String str = (String)object; this.nbt$2.func_74782_a(str, this.stackData$2.func_74781_a(str)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(object); }
/*    */ 
/*    */     
/*    */     public EEPROMHandler$$anonfun$store$1(NBTTagCompound nbt$2, NBTTagCompound stackData$2) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\library\EEPROMHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */