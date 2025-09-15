/*    */ package li.cil.oc.integration.vanilla;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterNBT$ implements Converter {
/*    */   private ConverterNBT$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterNBT$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)object; scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("oc:flatten"), li$cil$oc$integration$vanilla$ConverterNBT$$convert((NBTBase)nBTTagCompound))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 14 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   } public Object li$cil$oc$integration$vanilla$ConverterNBT$$convert(NBTBase nbt) {
/* 17 */     NBTBase nBTBase = nbt;
/* 18 */     if (nBTBase instanceof NBTTagByte) { NBTTagByte nBTTagByte = (NBTTagByte)nBTBase; Byte byte_ = BoxesRunTime.boxToByte(nBTTagByte.func_150290_f()); }
/* 19 */     else if (nBTBase instanceof NBTTagShort) { NBTTagShort nBTTagShort = (NBTTagShort)nBTBase; Short short_ = BoxesRunTime.boxToShort(nBTTagShort.func_150289_e()); }
/* 20 */     else if (nBTBase instanceof NBTTagInt) { NBTTagInt nBTTagInt = (NBTTagInt)nBTBase; Integer integer = BoxesRunTime.boxToInteger(nBTTagInt.func_150287_d()); }
/* 21 */     else if (nBTBase instanceof NBTTagLong) { NBTTagLong nBTTagLong = (NBTTagLong)nBTBase; Long long_ = BoxesRunTime.boxToLong(nBTTagLong.func_150291_c()); }
/* 22 */     else if (nBTBase instanceof NBTTagFloat) { NBTTagFloat nBTTagFloat = (NBTTagFloat)nBTBase; Float float_ = BoxesRunTime.boxToFloat(nBTTagFloat.func_150288_h()); }
/* 23 */     else if (nBTBase instanceof NBTTagDouble) { NBTTagDouble nBTTagDouble = (NBTTagDouble)nBTBase; Double double_ = BoxesRunTime.boxToDouble(nBTTagDouble.func_150286_g()); }
/* 24 */     else if (nBTBase instanceof NBTTagByteArray) { NBTTagByteArray nBTTagByteArray = (NBTTagByteArray)nBTBase; byte[] arrayOfByte = nBTTagByteArray.func_150292_c(); }
/* 25 */     else if (nBTBase instanceof NBTTagString) { NBTTagString nBTTagString = (NBTTagString)nBTBase; String str = nBTTagString.func_150285_a_(); }
/* 26 */     else if (nBTBase instanceof NBTTagList) { NBTTagList nBTTagList1 = (NBTTagList)nBTBase;
/* 27 */       NBTTagList copy = (NBTTagList)nBTTagList1.func_74737_b(); Object object = ((TraversableOnce)scala.runtime.RichInt$.MODULE$
/* 28 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), copy.func_74745_c()).map((Function1)new ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$2(copy), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.AnyRef()); }
/* 29 */     else if (nBTBase instanceof NBTTagCompound) { NBTTagCompound nBTTagCompound = (NBTTagCompound)nBTBase;
/*    */ 
/*    */       
/* 32 */       Map map = ((TraversableOnce)scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(nBTTagCompound.func_150296_c()).collect((PartialFunction)new ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$1(nBTTagCompound), scala.collection.mutable.Set$.MODULE$.canBuildFrom())).toMap(scala.Predef$.MODULE$.$conforms()); }
/* 33 */     else { if (nBTBase instanceof NBTTagIntArray) { NBTTagIntArray nBTTagIntArray = (NBTTagIntArray)nBTBase; return nBTTagIntArray.func_150302_c(); }
/*    */       
/*    */       throw new MatchError(nBTBase); }
/*    */     
/*    */     return SYNTHETIC_LOCAL_VARIABLE_4;
/*    */   }
/*    */   
/*    */   public final class ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagList copy$1;
/*    */     
/*    */     public final Object apply(int x$1) {
/*    */       return ConverterNBT$.MODULE$.li$cil$oc$integration$vanilla$ConverterNBT$$convert(this.copy$1.func_74744_a(0));
/*    */     }
/*    */     
/*    */     public ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$2(NBTTagList copy$1) {}
/*    */   }
/*    */   
/*    */   public final class ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$1 extends AbstractPartialFunction<Object, Tuple2<String, Object>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagCompound x11$1;
/*    */     
/*    */     public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) {
/*    */       Object object2, object1 = x1;
/*    */       if (object1 instanceof String) {
/*    */         String str = (String)object1;
/*    */         object2 = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(str), ConverterNBT$.MODULE$.li$cil$oc$integration$vanilla$ConverterNBT$$convert(this.x11$1.func_74781_a(str)));
/*    */       } else {
/*    */         object2 = default.apply(x1);
/*    */       } 
/*    */       return (B1)object2;
/*    */     }
/*    */     
/*    */     public final boolean isDefinedAt(Object x1) {
/*    */       boolean bool;
/*    */       Object object = x1;
/*    */       if (object instanceof String) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return bool;
/*    */     }
/*    */     
/*    */     public ConverterNBT$$anonfun$li$cil$oc$integration$vanilla$ConverterNBT$$convert$1(NBTTagCompound x11$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ConverterNBT$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */