/*    */ package li.cil.oc.integration.stargatetech2;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import lordfokas.stargatetech2.api.bus.BusPacketNetScan;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ConverterBusPacketNetScanDevice$ implements Converter {
/*    */   private ConverterBusPacketNetScanDevice$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ConverterBusPacketNetScanDevice$ MODULE$; public void convert(Object value, Map output) {
/* 12 */     Object object = value;
/* 13 */     if (object instanceof BusPacketNetScan.Device) { BusPacketNetScan.Device device = (BusPacketNetScan.Device)object;
/* 14 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("address"), BoxesRunTime.boxToShort(device.address)));
/* 15 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("name"), device.name));
/* 16 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("description"), device.description));
/* 17 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("enabled"), BoxesRunTime.boxToBoolean(device.enabled)));
/* 18 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("x"), BoxesRunTime.boxToInteger(device.x)));
/* 19 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("y"), BoxesRunTime.boxToInteger(device.y)));
/* 20 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("z"), BoxesRunTime.boxToInteger(device.z))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 21 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\stargatetech2\ConverterBusPacketNetScanDevice$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */