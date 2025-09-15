/*    */ package li.cil.oc.integration.ic2;
/*    */ import ic2.api.crops.CropCard;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q2A!\001\002\001\033\t\t2i\0348wKJ$XM\035\"bg\026\034V-\0323\013\005\r!\021aA5de)\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\003mC:<'\"A\n\002\t)\fg/Y\005\003+A\021aa\0242kK\016$\bCA\f\035\033\005A\"BA\r\033\003\031!'/\033<fe*\0211DB\001\004CBL\027BA\017\031\005%\031uN\034<feR,'\017C\003 \001\021\005\001%\001\004=S:LGO\020\013\002CA\021!\005A\007\002\005!)A\005\001C!K\00591m\0348wKJ$Hc\001\024-cA\021qEK\007\002Q)\t\021&A\003tG\006d\027-\003\002,Q\t!QK\\5u\021\025i3\0051\001/\003\0251\030\r\\;f!\t9s&\003\0021Q\t\031\021I\\=\t\013I\032\003\031A\032\002\r=,H\017];u!\021!t'O\035\016\003UR!A\016\n\002\tU$\030\016\\\005\003qU\0221!T1q!\t9#(\003\002<Q\t1\021I\\=SK\032\004")
/*    */ public class ConverterBaseSeed implements Converter {
/*    */   public void convert(Object value, Map output) {
/* 11 */     if (value instanceof ItemStack) {
/* 12 */       ItemStack stack = (ItemStack)value;
/* 13 */       CropCard cc = Crops.instance.getCropCard(stack);
/* 14 */       if (cc != null && stack.func_77978_p().func_74771_c("scan") == 4) {
/* 15 */         (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("name"), cc.name()); (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$
/* 16 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("tier"), BoxesRunTime.boxToInteger(cc.tier()));
/* 17 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("growth"), BoxesRunTime.boxToByte(stack.func_77978_p().func_74771_c("growth")));
/* 18 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("gain"), BoxesRunTime.boxToByte(stack.func_77978_p().func_74771_c("gain")));
/* 19 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("resistance"), BoxesRunTime.boxToByte(stack.func_77978_p().func_74771_c("resistance")));
/*    */         WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("crop"), Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5]))));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\ConverterBaseSeed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */