/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import li.cil.oc.api.event.RackMountableRenderEvent;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\025;Q!\001\002\t\002=\tAAU1dW*\0211\001B\001\006E2|7m\033\006\003\013\031\t\001B]3oI\026\024XM\035\006\003\017!\taa\0317jK:$(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001A\021\001#E\007\002\005\031)!C\001E\001'\t!!+Y2l'\t\tB\003\005\002\02615\taCC\001\030\003\025\0318-\0317b\023\tIbC\001\004B]f\024VM\032\005\0067E!\t\001H\001\007y%t\027\016\036 \025\003=AQAH\t\005\002}\taA]3oI\026\024Hc\002\021$YE\032TG\017\t\003+\005J!A\t\f\003\tUs\027\016\036\005\006Iu\001\r!J\001\005e\006\0347\016\005\002'W5\tqE\003\002)S\005QA/\0337fK:$\030\016^=\013\005)B\021AB2p[6|g.\003\002\023O!)Q&\ba\001]\005\t\001\020\005\002\026_%\021\001G\006\002\004\023:$\b\"\002\032\036\001\004q\023!A=\t\013Qj\002\031\001\030\002\003iDQaA\017A\002Y\002\"aN\035\016\003aR!aA\025\n\005IA\004\"B\003\036\001\004Y\004C\001\037D\033\005i$BA\003?\025\t9qH\003\002A\003\006IQ.\0338fGJ\fg\r\036\006\002\005\006\031a.\032;\n\005\021k$\001\004*f]\022,'O\0217pG.\034\b")
/*    */ public final class Rack
/*    */ {
/*    */   public static void render(li.cil.oc.common.tileentity.Rack paramRack, int paramInt1, int paramInt2, int paramInt3, li.cil.oc.common.block.Rack paramRack1, RenderBlocks paramRenderBlocks) {
/*    */     Rack$.MODULE$.render(paramRack, paramInt1, paramInt2, paramInt3, paramRack1, paramRenderBlocks);
/*    */   }
/*    */   
/*    */   public final class Rack$$anonfun$renderSide$1$1
/*    */     extends AbstractFunction1.mcZI.sp
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final li.cil.oc.common.tileentity.Rack rack$1;
/*    */     
/*    */     public final boolean apply(int i) {
/* 30 */       return apply$mcZI$sp(i); } public Rack$$anonfun$renderSide$1$1(li.cil.oc.common.tileentity.Rack rack$1) {} public boolean apply$mcZI$sp(int i) { return !(this.rack$1.func_70301_a(i) == null); } } public final class Rack$$anonfun$renderSide$1$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final li.cil.oc.common.tileentity.Rack rack$1; private final int x$1; private final int y$1; private final int z$1; private final li.cil.oc.common.block.Rack block$1; private final RenderBlocks renderer$1; private final float u1$1; private final float u2$1; private final float v2$1; private final float fs$1; private final ForgeDirection side$1; private final double lx$1; private final double lz$1; private final double hx$1; private final double hz$1; public final void apply(int i) { apply$mcVI$sp(i); } public Rack$$anonfun$renderSide$1$2(li.cil.oc.common.tileentity.Rack rack$1, int x$1, int y$1, int z$1, li.cil.oc.common.block.Rack block$1, RenderBlocks renderer$1, float u1$1, float u2$1, float v2$1, float fs$1, ForgeDirection side$1, double lx$1, double lz$1, double hx$1, double hz$1) {} public void apply$mcVI$sp(int i) {
/* 31 */       ForgeDirection forgeDirection = this.side$1;
/* 32 */       if (ForgeDirection.WEST.equals(forgeDirection))
/* 33 */       { this.renderer$1.func_147782_a(this.lx$1 + 0.0625D, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + this.u1$1, this.u2$1, (this.v2$1 - i * this.fs$1), this.hz$1 - this.u1$1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 34 */       else if (ForgeDirection.EAST.equals(forgeDirection))
/* 35 */       { this.renderer$1.func_147782_a(this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + this.u1$1, this.hx$1 - 0.0625D, (this.v2$1 - i * this.fs$1), this.hz$1 - this.u1$1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 36 */       else if (ForgeDirection.NORTH.equals(forgeDirection))
/* 37 */       { this.renderer$1.func_147782_a(this.lx$1 + this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + 0.0625D, this.hx$1 - this.u1$1, (this.v2$1 - i * this.fs$1), this.u2$1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 38 */       else if (ForgeDirection.SOUTH.equals(forgeDirection))
/* 39 */       { this.renderer$1.func_147782_a(this.lx$1 + this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.u1$1, this.hx$1 - this.u1$1, (this.v2$1 - i * this.fs$1), this.hz$1 - 0.0625D); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 40 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */       
/* 43 */       RackMountableRenderEvent.Block event = new RackMountableRenderEvent.Block((li.cil.oc.api.internal.Rack)this.rack$1, i, this.rack$1.lastData()[i], this.side$1, this.renderer$1);
/* 44 */       MinecraftForge.EVENT_BUS.post((Event)event);
/* 45 */       if (!event.isCanceled()) {
/* 46 */         this.block$1.frontOverride_$eq(event.getFrontTextureOverride());
/* 47 */         this.renderer$1.func_147784_q((Block)this.block$1, this.x$1, this.y$1, this.z$1);
/* 48 */         this.block$1.frontOverride_$eq(null);
/*    */       } 
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Rack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */