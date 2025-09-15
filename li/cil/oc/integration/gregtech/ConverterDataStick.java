/*    */ package li.cil.oc.integration.gregtech;
/*    */ 
/*    */ import java.util.Map;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.convert.WrapAsScala$;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001I3A!\001\002\001\033\t\0212i\0348wKJ$XM\035#bi\006\034F/[2l\025\t\031A!\001\005he\026<G/Z2i\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022\001\0027b]\036T\021aE\001\005U\0064\030-\003\002\026!\t1qJ\0316fGR\004\"a\006\017\016\003aQ!!\007\016\002\r\021\024\030N^3s\025\tYb!A\002ba&L!!\b\r\003\023\r{gN^3si\026\024\b\"B\020\001\t\003\001\023A\002\037j]&$h\bF\001\"!\t\021\003!D\001\003\021\025!\003\001\"\021&\003\035\031wN\034<feR$2A\n\0272!\t9#&D\001)\025\005I\023!B:dC2\f\027BA\026)\005\021)f.\033;\t\0135\032\003\031\001\030\002\013Y\fG.^3\021\005\035z\023B\001\031)\005\r\te.\037\005\006e\r\002\raM\001\007_V$\b/\036;\021\tQ:\024(O\007\002k)\021aGE\001\005kRLG.\003\0029k\t\031Q*\0319\021\005\035R\024BA\036)\005\031\te.\037*fM\")Q\b\001C\005}\005)r-\032;SC^\004&o\\:qK\016$\030n\0348ECR\fGcA G\017B!\001)R\035:\033\005\t%B\001\"D\003\035iW\017^1cY\026T!\001\022\025\002\025\r|G\016\\3di&|g.\003\0029\003\")!\007\020a\001g!)\001\n\020a\001\023\006\031aN\031;\021\005)\003V\"A&\013\005!c%BA'O\003%i\027N\\3de\0064GOC\001P\003\rqW\r^\005\003#.\023aB\024\"U)\006<7i\\7q_VtG\r")
/*    */ public class ConverterDataStick implements Converter {
/* 16 */   public void convert(Object value, Map<Object, Object> output) { if (value instanceof ItemStack)
/* 17 */     { ItemStack stack = (ItemStack)value;
/* 18 */       NBTTagCompound nbt = stack.field_77990_d;
/* 19 */       if (nbt != null)
/* 20 */         if (nbt.func_74764_b("prospection_tier"))
/* 21 */         { String str = nbt.func_74779_i("title");
/* 22 */           if ("Raw Prospection Data".equals(str)) { getRawProspectionData(output, nbt); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 23 */           else if ("Analyzed Prospection Data".equals(str))
/* 24 */           { getRawProspectionData(output, nbt);
/* 25 */             WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$
/*    */                 
/* 27 */                 .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("Analyzed Prospection Data"), Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("pages", 8)).toArray(ClassTag$.MODULE$.apply(NBTTagString.class))).map((Function1)new ConverterDataStick$$anonfun$convert$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(String.class)))))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 28 */           else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */            }
/* 30 */         else if (nbt.func_74764_b("author") && nbt.func_74779_i("author").contains("Recipe Generator") && nbt.func_74764_b("output"))
/* 31 */         { ItemStack outputItem = ItemStack.func_77949_a(nbt.func_74775_l("output"));
/* 32 */           WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("output"), outputItem.func_82833_r()));
/* 33 */           WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("time"), BoxesRunTime.boxToInteger(nbt.func_74762_e("time")).toString()));
/* 34 */           WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("eu"), BoxesRunTime.boxToInteger(nbt.func_74762_e("eu")).toString()));
/* 35 */           ArrayBuffer inputs = new ArrayBuffer();
/* 36 */           int index = 0;
/* 37 */           while (nbt.func_74764_b(BoxesRunTime.boxToInteger(index).toString())) {
/* 38 */             inputs.$plus$eq(ItemStack.func_77949_a(nbt.func_74775_l(BoxesRunTime.boxToInteger(index).toString())));
/* 39 */             index++;
/*    */           } 
/* 41 */           WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("inputItems"), inputs.map((Function1)new ConverterDataStick$$anonfun$convert$2(this), ArrayBuffer$.MODULE$.canBuildFrom())));
/* 42 */           index = 0;
/* 43 */           ArrayBuffer inputFluids = new ArrayBuffer();
/* 44 */           while (nbt.func_74764_b((new StringBuilder()).append("f").append(BoxesRunTime.boxToInteger(index)).toString())) {
/* 45 */             inputFluids.$plus$eq(FluidStack.loadFluidStackFromNBT(nbt.func_74775_l((new StringBuilder()).append("f").append(BoxesRunTime.boxToInteger(index)).toString())));
/* 46 */             index++;
/*    */           } 
/* 48 */           WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("inputFluids"), inputFluids.map((Function1)new ConverterDataStick$$anonfun$convert$3(this), ArrayBuffer$.MODULE$.canBuildFrom()))); }   }  } public final class ConverterDataStick$$anonfun$convert$1 extends AbstractFunction1<NBTTagString, String[]> implements Serializable { public static final long serialVersionUID = 0L; public final String[] apply(NBTTagString tag) { return (new StringOps(Predef$.MODULE$.augmentString(tag.func_150285_a_()))).split('\n'); } public ConverterDataStick$$anonfun$convert$1(ConverterDataStick $outer) {} } public final class ConverterDataStick$$anonfun$convert$2 extends AbstractFunction1<ItemStack, Tuple2<String, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<String, Object> apply(ItemStack s) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(s.func_82833_r()), BoxesRunTime.boxToInteger(s.field_77994_a)); } public ConverterDataStick$$anonfun$convert$2(ConverterDataStick $outer) {} } public final class ConverterDataStick$$anonfun$convert$3 extends AbstractFunction1<FluidStack, Tuple2<String, Object>> implements Serializable { public final Tuple2<String, Object> apply(FluidStack s) { return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(s.getLocalizedName()), BoxesRunTime.boxToInteger(s.amount)); }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     public ConverterDataStick$$anonfun$convert$3(ConverterDataStick $outer) {} }
/*    */   private Map<Object, Object> getRawProspectionData(Map output, NBTTagCompound nbt) {
/* 53 */     (new Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/* 54 */       .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_tier"), BoxesRunTime.boxToByte(nbt.func_74771_c("prospection_tier")));
/* 55 */     (new Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_pos"), nbt.func_74779_i("prospection_pos"));
/* 56 */     (new Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_ores"), (new StringOps(Predef$.MODULE$.augmentString(nbt.func_74779_i("prospection_ores")))).split('|'));
/* 57 */     (new Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_oils"), (new StringOps(Predef$.MODULE$.augmentString(nbt.func_74779_i("prospection_oils")))).split('|'));
/* 58 */     (new Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_oils_pos"), nbt.func_74779_i("prospection_oils_pos"));
/* 59 */     (new Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("prospection_radius"), nbt.func_74779_i("prospection_radius"));
/*    */     return (Map<Object, Object>)WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("Raw Prospection Data"), Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[6]))));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\ConverterDataStick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */