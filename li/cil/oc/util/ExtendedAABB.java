/*    */ package li.cil.oc.util;
/*    */ @ScalaSignature(bytes = "\006\001=;Q!\001\002\t\002-\tA\"\022=uK:$W\rZ!B\005\nS!a\001\003\002\tU$\030\016\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!\001D#yi\026tG-\0323B\003\n\0235CA\007\021!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005\031\te.\037*fM\")q#\004C\0011\0051A(\0338jiz\"\022a\003\005\00655!\031aG\001\rKb$XM\0343fI\006\013%I\021\013\00391\003\"!\b\020\016\00351AAD\007\001?M\021a\004\005\005\tCy\021)\031!C\001E\0051!m\\;oIN,\022a\t\t\003I)j\021!\n\006\003\007\031R!a\n\025\002\0235Lg.Z2sC\032$(\"A\025\002\0079,G/\003\002,K\ti\021\t_5t\0032LwM\\3e\005\nC\001\"\f\020\003\002\003\006IaI\001\bE>,h\016Z:!\021\0259b\004\"\0010)\ta\002\007C\003\"]\001\0071\005C\0033=\021\0051'\001\004w_2,X.Z\013\002iA\021\021#N\005\003mI\0211!\0238u\021\025Ad\004\"\0014\003\035\031XO\0354bG\026DQA\017\020\005\002m\nQB]8uCR,Gk\\<be\022\034HCA\022=\021\025i\024\b1\001?\003\0311\027mY5oOB\021q(R\007\002\001*\0211!\021\006\003\005\016\013aaY8n[>t'B\001#)\0039i\027N\\3de\0064GOZ8sO\026L!A\022!\003\035\031{'oZ3ESJ,7\r^5p]\")\001J\bC\001\023\0069!o\034;bi\026LFCA\022K\021\025Yu\t1\0015\003\025\031w.\0368u\021\025\t\023\0041\001$\021\025qU\002\"\001#\003))h.\033;C_VtGm\035")
/*    */ public final class ExtendedAABB {
/*    */   public static AxisAlignedBB unitBounds() {
/*    */     return ExtendedAABB$.MODULE$.unitBounds();
/*    */   }
/*    */   
/*    */   public static ExtendedAABB extendedAABB(AxisAlignedBB paramAxisAlignedBB) {
/*    */     return ExtendedAABB$.MODULE$.extendedAABB(paramAxisAlignedBB);
/*    */   }
/*    */   
/*    */   public static class ExtendedAABB {
/*    */     public AxisAlignedBB bounds() {
/* 14 */       return this.bounds;
/*    */     } private final AxisAlignedBB bounds; public ExtendedAABB(AxisAlignedBB bounds) {} public int volume() {
/* 16 */       int sx = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72336_d - (bounds()).field_72340_a) * 16));
/* 17 */       int sy = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72337_e - (bounds()).field_72338_b) * 16));
/* 18 */       int sz = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72334_f - (bounds()).field_72339_c) * 16));
/* 19 */       return sx * sy * sz;
/*    */     }
/*    */     
/*    */     public int surface() {
/* 23 */       int sx = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72336_d - (bounds()).field_72340_a) * 16));
/* 24 */       int sy = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72337_e - (bounds()).field_72338_b) * 16));
/* 25 */       int sz = (int)RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(((bounds()).field_72334_f - (bounds()).field_72339_c) * 16));
/* 26 */       return sx * sy * 2 + sx * sz * 2 + sy * sz * 2;
/*    */     } public AxisAlignedBB rotateTowards(ForgeDirection facing) {
/*    */       boolean bool;
/* 29 */       ForgeDirection forgeDirection = facing;
/* 30 */       if (ForgeDirection.WEST.equals(forgeDirection)) { bool = true; }
/* 31 */       else if (ForgeDirection.NORTH.equals(forgeDirection)) { bool = true; }
/* 32 */       else if (ForgeDirection.EAST.equals(forgeDirection)) { bool = true; }
/* 33 */       else { bool = false; }
/*    */       
/*    */       return rotateY(bool);
/*    */     } public AxisAlignedBB rotateY(int count) {
/* 37 */       Vec3 min = Vec3.func_72443_a((bounds()).field_72340_a - 0.5D, (bounds()).field_72338_b - 0.5D, (bounds()).field_72339_c - 0.5D);
/* 38 */       Vec3 max = Vec3.func_72443_a((bounds()).field_72336_d - 0.5D, (bounds()).field_72337_e - 0.5D, (bounds()).field_72334_f - 0.5D);
/* 39 */       min.func_72442_b(count * (float)Math.PI * 0.5F);
/* 40 */       max.func_72442_b(count * (float)Math.PI * 0.5F);
/* 41 */       return AxisAlignedBB.func_72330_a(
/* 42 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.min(min.field_72450_a + 0.5D, max.field_72450_a + 0.5D) * 32)) / 32.0D), 
/* 43 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.min(min.field_72448_b + 0.5D, max.field_72448_b + 0.5D) * 32)) / 32.0D), 
/* 44 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.min(min.field_72449_c + 0.5D, max.field_72449_c + 0.5D) * 32)) / 32.0D), 
/* 45 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.max(min.field_72450_a + 0.5D, max.field_72450_a + 0.5D) * 32)) / 32.0D), 
/* 46 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.max(min.field_72448_b + 0.5D, max.field_72448_b + 0.5D) * 32)) / 32.0D), 
/* 47 */           (float)(RichDouble$.MODULE$.round$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.max(min.field_72449_c + 0.5D, max.field_72449_c + 0.5D) * 32)) / 32.0D));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedAABB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */