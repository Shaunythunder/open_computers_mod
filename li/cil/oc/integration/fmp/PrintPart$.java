/*    */ package li.cil.oc.integration.fmp;
/*    */ 
/*    */ import codechicken.lib.vec.Cuboid6;
/*    */ import li.cil.oc.common.tileentity.Print;
/*    */ import scala.Option;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PrintPart$
/*    */ {
/*    */   public static final PrintPart$ MODULE$;
/*    */   private final float q0;
/*    */   private final float q1;
/*    */   private final float q2;
/*    */   private final float q3;
/*    */   private final Cuboid6[] slotBounds;
/*    */   
/*    */   private float q0() {
/* 48 */     return this.q0;
/* 49 */   } private float q1() { return this.q1; }
/* 50 */   private float q2() { return this.q2; } private float q3() {
/* 51 */     return this.q3;
/*    */   } public Cuboid6[] slotBounds() {
/* 53 */     return this.slotBounds;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Option<Print> $lessinit$greater$default$1() {
/* 86 */     return (Option<Print>)scala.None$.MODULE$; } private PrintPart$() { MODULE$ = this;
/*    */     this.q0 = 0.0F;
/*    */     this.q1 = 0.25F;
/*    */     this.q2 = 0.75F;
/*    */     this.q3 = 1.0F;
/*    */     (new Cuboid6[27])[0] = new Cuboid6(q1(), q0(), q1(), q2(), q1(), q2());
/*    */     (new Cuboid6[27])[1] = new Cuboid6(q1(), q2(), q1(), q2(), q3(), q2());
/*    */     (new Cuboid6[27])[2] = new Cuboid6(q1(), q1(), q0(), q2(), q2(), q1());
/*    */     (new Cuboid6[27])[3] = new Cuboid6(q1(), q1(), q2(), q2(), q2(), q3());
/*    */     (new Cuboid6[27])[4] = new Cuboid6(q0(), q1(), q1(), q1(), q2(), q2());
/*    */     (new Cuboid6[27])[5] = new Cuboid6(q2(), q1(), q1(), q3(), q2(), q2());
/*    */     (new Cuboid6[27])[6] = new Cuboid6(q1(), q1(), q1(), q2(), q2(), q2());
/*    */     (new Cuboid6[27])[7] = new Cuboid6(q0(), q0(), q0(), q1(), q1(), q1());
/*    */     (new Cuboid6[27])[8] = new Cuboid6(q0(), q2(), q0(), q1(), q3(), q1());
/*    */     (new Cuboid6[27])[9] = new Cuboid6(q0(), q0(), q2(), q1(), q1(), q3());
/*    */     (new Cuboid6[27])[10] = new Cuboid6(q0(), q2(), q2(), q1(), q3(), q3());
/*    */     (new Cuboid6[27])[11] = new Cuboid6(q2(), q0(), q0(), q3(), q1(), q1());
/*    */     (new Cuboid6[27])[12] = new Cuboid6(q2(), q2(), q0(), q3(), q3(), q1());
/*    */     (new Cuboid6[27])[13] = new Cuboid6(q2(), q0(), q2(), q3(), q1(), q3());
/*    */     (new Cuboid6[27])[14] = new Cuboid6(q2(), q2(), q2(), q3(), q3(), q3());
/*    */     (new Cuboid6[27])[15] = new Cuboid6(q0(), q1(), q0(), q1(), q2(), q1());
/*    */     (new Cuboid6[27])[16] = new Cuboid6(q0(), q1(), q2(), q1(), q2(), q3());
/*    */     (new Cuboid6[27])[17] = new Cuboid6(q2(), q1(), q0(), q3(), q2(), q1());
/*    */     (new Cuboid6[27])[18] = new Cuboid6(q2(), q1(), q2(), q3(), q2(), q3());
/*    */     (new Cuboid6[27])[19] = new Cuboid6(q0(), q0(), q1(), q1(), q1(), q2());
/*    */     (new Cuboid6[27])[20] = new Cuboid6(q2(), q0(), q1(), q3(), q1(), q2());
/*    */     (new Cuboid6[27])[21] = new Cuboid6(q0(), q2(), q1(), q1(), q3(), q2());
/*    */     (new Cuboid6[27])[22] = new Cuboid6(q2(), q2(), q1(), q3(), q3(), q2());
/*    */     (new Cuboid6[27])[23] = new Cuboid6(q1(), q0(), q0(), q2(), q1(), q1());
/*    */     (new Cuboid6[27])[24] = new Cuboid6(q1(), q2(), q0(), q2(), q3(), q1());
/*    */     (new Cuboid6[27])[25] = new Cuboid6(q1(), q0(), q2(), q2(), q1(), q3());
/*    */     (new Cuboid6[27])[26] = new Cuboid6(q1(), q2(), q2(), q2(), q3(), q3());
/*    */     this.slotBounds = new Cuboid6[27]; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\PrintPart$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */