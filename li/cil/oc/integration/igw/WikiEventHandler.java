/*    */ package li.cil.oc.integration.igw;
/*    */ 
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=;Q!\001\002\t\0025\t\001cV5lS\0263XM\034;IC:$G.\032:\013\005\r!\021aA5ho*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001cV5lS\0263XM\034;IC:$G.\032:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!9Ad\004a\001\n\003i\022\001\0037bgR\004\026\r\0365\026\003y\001\"a\b\023\016\003\001R!!\t\022\002\t1\fgn\032\006\002G\005!!.\031<b\023\t)\003E\001\004TiJLgn\032\005\bO=\001\r\021\"\001)\0031a\027m\035;QCRDw\fJ3r)\tIC\006\005\002\024U%\0211\006\006\002\005+:LG\017C\004.M\005\005\t\031\001\020\002\007a$\023\007\003\0040\037\001\006KAH\001\nY\006\034H\017U1uQ\002BQ!M\b\005\002I\nA!\0338jiR\t\021\006C\0035\037\021\005Q'A\tp]B\013w-Z\"iC:<W-\022<f]R$\"!\013\034\t\013]\032\004\031\001\035\002\003\025\004\"!\017 \016\003iR!a\017\037\002\007\005\004\030NC\001>\003\031Iwm^7pI&\021qH\017\002\020!\006<Wm\0215b]\036,WI^3oi\"\0221'\021\t\003\0056k\021a\021\006\003\t\026\013A\"\032<f]RD\027M\0343mKJT!AR$\002\r\r|W.\\8o\025\tA\025*A\002g[2T!AS&\002\t5|Gm\035\006\002\031\006\0311\r]<\n\0059\033%AD*vEN\034'/\0332f\013Z,g\016\036")
/*    */ public final class WikiEventHandler {
/*    */   @SubscribeEvent
/*    */   public static void onPageChangeEvent(PageChangeEvent paramPageChangeEvent) {
/*    */     WikiEventHandler$.MODULE$.onPageChangeEvent(paramPageChangeEvent);
/*    */   }
/*    */   
/*    */   public static void init() {
/*    */     WikiEventHandler$.MODULE$.init();
/*    */   }
/*    */   
/*    */   public static void lastPath_$eq(String paramString) {
/*    */     WikiEventHandler$.MODULE$.lastPath_$eq(paramString);
/*    */   }
/*    */   
/*    */   public static String lastPath() {
/*    */     return WikiEventHandler$.MODULE$.lastPath();
/*    */   }
/*    */   
/*    */   public final class WikiEventHandler$$anonfun$init$1 extends AbstractFunction1<Tuple2<String, ItemInfo>, Object> implements Serializable { public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/* 25 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public static final long serialVersionUID = 0L; } public final class WikiEventHandler$$anonfun$init$2 extends AbstractFunction1<Tuple2<String, ItemInfo>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { ItemInfo info = (ItemInfo)tuple2._2();
/* 26 */         ItemStack stack = info.createItemStack(1);
/* 27 */         String path = Manual.pathFor(stack);
/*    */         
/* 29 */         WikiRegistry.registerBlockAndItemPageEntry(stack); BoxedUnit boxedUnit = (path == null || Manual.contentFor(path) == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\igw\WikiEventHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */