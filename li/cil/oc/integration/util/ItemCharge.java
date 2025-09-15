/*    */ package li.cil.oc.integration.util;@ScalaSignature(bytes = "\006\001a;Q!\001\002\t\0025\t!\"\023;f[\016C\027M]4f\025\t\031A!\001\003vi&d'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\006Ji\026l7\t[1sO\026\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\004\035\037\t\007I\021B\017\002\021\rD\027M]4feN,\022A\b\t\004?\0212S\"\001\021\013\005\005\022\023aB7vi\006\024G.\032\006\003GQ\t!bY8mY\026\034G/[8o\023\t)\003EA\007MS:\\W\r\032%bg\"\034V\r\036\t\005'\035J\023&\003\002))\t1A+\0369mKJ\002\"AK\031\016\003-R!\001L\027\002\017I,g\r\\3di*\021afL\001\005Y\006twMC\0011\003\021Q\027M^1\n\005IZ#AB'fi\"|G\r\003\0045\037\001\006IAH\001\nG\"\f'oZ3sg\002BQAN\b\005\002]\n1!\0313e)\rA4(\020\t\003'eJ!A\017\013\003\tUs\027\016\036\005\006yU\002\r!K\001\nG\006t7\t[1sO\026DQAP\033A\002%\naa\0315be\036,\007\"\002\037\020\t\003\001ECA!E!\t\031\")\003\002D)\t9!i\\8mK\006t\007\"B#@\001\0041\025!B:uC\016\\\007CA$O\033\005A%BA%K\003\021IG/Z7\013\005-c\025!C7j]\026\034'/\0314u\025\005i\025a\0018fi&\021q\n\023\002\n\023R,Wn\025;bG.DQAP\b\005\002E#2AU+W!\t\0312+\003\002U)\t1Ai\\;cY\026DQ!\022)A\002\031CQa\026)A\002I\013a!Y7pk:$\b")
/*    */ public final class ItemCharge { public static double charge(ItemStack paramItemStack, double paramDouble) {
/*    */     return ItemCharge$.MODULE$.charge(paramItemStack, paramDouble);
/*    */   }
/*    */   public static boolean canCharge(ItemStack paramItemStack) {
/*    */     return ItemCharge$.MODULE$.canCharge(paramItemStack);
/*    */   }
/*    */   public static void add(Method paramMethod1, Method paramMethod2) {
/*    */     ItemCharge$.MODULE$.add(paramMethod1, paramMethod2);
/*    */   }
/*    */   
/*    */   public final class ItemCharge$$anonfun$canCharge$1 extends AbstractFunction1<Tuple2<Method, Method>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Tuple2 charger) {
/* 15 */       return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic((Method)charger._1(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$2 }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     } private final ItemStack stack$2; public ItemCharge$$anonfun$canCharge$1(ItemStack stack$2) {} } public final class ItemCharge$$anonfun$1 extends AbstractFunction1<Tuple2<Method, Method>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1;
/*    */     public final boolean apply(Tuple2 charger) {
/* 18 */       return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic((Method)charger._1(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     }
/*    */     
/*    */     public ItemCharge$$anonfun$1(ItemStack stack$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\ItemCharge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */