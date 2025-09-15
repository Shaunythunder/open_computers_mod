/*    */ package li.cil.oc.integration.fmp;
/*    */ import codechicken.multipart.MultiPartRegistry;
/*    */ import codechicken.multipart.TMultiPart;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class MultipartFactory$ implements MultiPartRegistry.IPartFactory {
/*    */   private MultipartFactory$() {
/*  8 */     MODULE$ = this;
/*    */   } public static final MultipartFactory$ MODULE$; public void init() {
/* 10 */     (new String[2])[0] = (
/* 11 */       new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("cable").toString();
/* 12 */     (new String[2])[1] = (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("print").toString();
/*    */     codechicken.multipart.MultiPartRegistry$.MODULE$.registerParts(this, new String[2]);
/*    */   }
/*    */   
/*    */   public TMultiPart createPart(String name, boolean client) {
/* 17 */     if (name.equals((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("cable").toString()))
/* 18 */       return new CablePart(CablePart$.MODULE$.$lessinit$greater$default$1()); 
/* 19 */     if (name.equals((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("print").toString()))
/* 20 */       return new PrintPart(PrintPart$.MODULE$.$lessinit$greater$default$1()); 
/* 21 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\MultipartFactory$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */