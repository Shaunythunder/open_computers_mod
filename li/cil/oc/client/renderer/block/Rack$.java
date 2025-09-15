/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import li.cil.oc.api.event.RackMountableRenderEvent;
/*    */ import li.cil.oc.common.block.Rack;
/*    */ import li.cil.oc.common.tileentity.Rack;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Rack$ {
/* 12 */   public void render(Rack rack, int x, int y, int z, Rack block, RenderBlocks renderer) { boolean previousRenderAllFaces = renderer.field_147837_f;
/* 13 */     float u1 = 0.0625F;
/* 14 */     float u2 = 0.9375F;
/* 15 */     float v1 = 0.125F;
/* 16 */     float v2 = 0.875F;
/* 17 */     float fs = 0.1875F;
/*    */ 
/*    */     
/* 20 */     renderer.field_147837_f = true;
/* 21 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, v1, 1.0D);
/* 22 */     renderer.func_147784_q((Block)block, x, y, z);
/* 23 */     renderer.func_147782_a(0.0D, v2, 0.0D, 1.0D, 1.0D, 1.0D);
/* 24 */     renderer.func_147784_q((Block)block, x, y, z);
/*    */ 
/*    */     
/* 27 */     ForgeDirection front = rack.facing();
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
/*    */ 
/*    */ 
/*    */     
/* 63 */     renderSide$1(ForgeDirection.WEST, 0.0D, 0.0D, u1, 1.0D, rack, x, y, z, block, renderer, u1, u2, v1, v2, fs, front);
/* 64 */     renderSide$1(ForgeDirection.EAST, u2, 0.0D, 1.0D, 1.0D, rack, x, y, z, block, renderer, u1, u2, v1, v2, fs, front);
/* 65 */     renderSide$1(ForgeDirection.NORTH, 0.0D, 0.0D, 1.0D, u1, rack, x, y, z, block, renderer, u1, u2, v1, v2, fs, front);
/* 66 */     renderSide$1(ForgeDirection.SOUTH, 0.0D, u2, 1.0D, 1.0D, rack, x, y, z, block, renderer, u1, u2, v1, v2, fs, front);
/*    */     
/* 68 */     renderer.field_147837_f = previousRenderAllFaces; }
/*    */   public static final Rack$ MODULE$; private final void renderSide$1(ForgeDirection side, double lx, double lz, double hx, double hz, Rack rack$1, int x$1, int y$1, int z$1, Rack block$1, RenderBlocks renderer$1, float u1$1, float u2$1, float v1$1, float v2$1, float fs$1, ForgeDirection front$1) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aload #21
/*    */     //   3: astore #22
/*    */     //   5: dup
/*    */     //   6: ifnonnull -> 18
/*    */     //   9: pop
/*    */     //   10: aload #22
/*    */     //   12: ifnull -> 26
/*    */     //   15: goto -> 95
/*    */     //   18: aload #22
/*    */     //   20: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   23: ifeq -> 95
/*    */     //   26: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*    */     //   29: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   32: iconst_0
/*    */     //   33: invokevirtual intWrapper : (I)I
/*    */     //   36: iconst_4
/*    */     //   37: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*    */     //   40: new li/cil/oc/client/renderer/block/Rack$$anonfun$renderSide$1$1
/*    */     //   43: dup
/*    */     //   44: aload #10
/*    */     //   46: invokespecial <init> : (Lli/cil/oc/common/tileentity/Rack;)V
/*    */     //   49: invokevirtual withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*    */     //   52: new li/cil/oc/client/renderer/block/Rack$$anonfun$renderSide$1$2
/*    */     //   55: dup
/*    */     //   56: aload #10
/*    */     //   58: iload #11
/*    */     //   60: iload #12
/*    */     //   62: iload #13
/*    */     //   64: aload #14
/*    */     //   66: aload #15
/*    */     //   68: fload #16
/*    */     //   70: fload #17
/*    */     //   72: fload #19
/*    */     //   74: fload #20
/*    */     //   76: aload_1
/*    */     //   77: dload_2
/*    */     //   78: dload #4
/*    */     //   80: dload #6
/*    */     //   82: dload #8
/*    */     //   84: invokespecial <init> : (Lli/cil/oc/common/tileentity/Rack;IIILli/cil/oc/common/block/Rack;Lnet/minecraft/client/renderer/RenderBlocks;FFFFLnet/minecraftforge/common/util/ForgeDirection;DDDD)V
/*    */     //   87: invokeinterface foreach : (Lscala/Function1;)V
/*    */     //   92: goto -> 191
/*    */     //   95: aload #21
/*    */     //   97: aload_1
/*    */     //   98: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   101: astore #24
/*    */     //   103: dup
/*    */     //   104: ifnonnull -> 116
/*    */     //   107: pop
/*    */     //   108: aload #24
/*    */     //   110: ifnull -> 124
/*    */     //   113: goto -> 128
/*    */     //   116: aload #24
/*    */     //   118: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   121: ifeq -> 128
/*    */     //   124: iconst_1
/*    */     //   125: goto -> 129
/*    */     //   128: iconst_0
/*    */     //   129: istore #23
/*    */     //   131: iload #23
/*    */     //   133: ifeq -> 154
/*    */     //   136: aload #15
/*    */     //   138: getstatic li/cil/oc/client/Textures$Rack$.MODULE$ : Lli/cil/oc/client/Textures$Rack$;
/*    */     //   141: invokevirtual icons : ()[Lnet/minecraft/util/IIcon;
/*    */     //   144: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   147: invokevirtual ordinal : ()I
/*    */     //   150: aaload
/*    */     //   151: invokevirtual func_147757_a : (Lnet/minecraft/util/IIcon;)V
/*    */     //   154: aload #15
/*    */     //   156: dload_2
/*    */     //   157: fload #18
/*    */     //   159: f2d
/*    */     //   160: dload #4
/*    */     //   162: dload #6
/*    */     //   164: fload #19
/*    */     //   166: f2d
/*    */     //   167: dload #8
/*    */     //   169: invokevirtual func_147782_a : (DDDDDD)V
/*    */     //   172: aload #15
/*    */     //   174: aload #14
/*    */     //   176: iload #11
/*    */     //   178: iload #12
/*    */     //   180: iload #13
/*    */     //   182: invokevirtual func_147784_q : (Lnet/minecraft/block/Block;III)Z
/*    */     //   185: pop
/*    */     //   186: aload #15
/*    */     //   188: invokevirtual func_147771_a : ()V
/*    */     //   191: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #30	-> 29
/*    */     //   #53	-> 95
/*    */     //   #54	-> 131
/*    */     //   #55	-> 136
/*    */     //   #57	-> 154
/*    */     //   #58	-> 172
/*    */     //   #59	-> 186
/*    */     //   #29	-> 191
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	192	0	this	Lli/cil/oc/client/renderer/block/Rack$;
/*    */     //   0	192	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   0	192	2	lx	D
/*    */     //   0	192	4	lz	D
/*    */     //   0	192	6	hx	D
/*    */     //   0	192	8	hz	D
/*    */     //   0	192	10	rack$1	Lli/cil/oc/common/tileentity/Rack;
/*    */     //   0	192	11	x$1	I
/*    */     //   0	192	12	y$1	I
/*    */     //   0	192	13	z$1	I
/*    */     //   0	192	14	block$1	Lli/cil/oc/common/block/Rack;
/*    */     //   0	192	15	renderer$1	Lnet/minecraft/client/renderer/RenderBlocks;
/*    */     //   0	192	16	u1$1	F
/*    */     //   0	192	17	u2$1	F
/*    */     //   0	192	18	v1$1	F
/*    */     //   0	192	19	v2$1	F
/*    */     //   0	192	20	fs$1	F
/*    */     //   0	192	21	front$1	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   131	60	23	isBack	Z } private Rack$() {
/* 70 */     MODULE$ = this;
/*    */   }
/*    */   
/*    */   public final class Rack$$anonfun$renderSide$1$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Rack rack$1;
/*    */     
/*    */     public final boolean apply(int i) {
/*    */       return apply$mcZI$sp(i);
/*    */     }
/*    */     
/*    */     public boolean apply$mcZI$sp(int i) {
/*    */       return !(this.rack$1.func_70301_a(i) == null);
/*    */     }
/*    */     
/*    */     public Rack$$anonfun$renderSide$1$1(Rack rack$1) {}
/*    */   }
/*    */   
/*    */   public final class Rack$$anonfun$renderSide$1$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Rack rack$1;
/*    */     private final int x$1;
/*    */     private final int y$1;
/*    */     private final int z$1;
/*    */     private final Rack block$1;
/*    */     private final RenderBlocks renderer$1;
/*    */     private final float u1$1;
/*    */     private final float u2$1;
/*    */     private final float v2$1;
/*    */     private final float fs$1;
/*    */     private final ForgeDirection side$1;
/*    */     private final double lx$1;
/*    */     private final double lz$1;
/*    */     private final double hx$1;
/*    */     private final double hz$1;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public Rack$$anonfun$renderSide$1$2(Rack rack$1, int x$1, int y$1, int z$1, Rack block$1, RenderBlocks renderer$1, float u1$1, float u2$1, float v2$1, float fs$1, ForgeDirection side$1, double lx$1, double lz$1, double hx$1, double hz$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       ForgeDirection forgeDirection = this.side$1;
/*    */       if (ForgeDirection.WEST.equals(forgeDirection)) {
/*    */         this.renderer$1.func_147782_a(this.lx$1 + 0.0625D, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + this.u1$1, this.u2$1, (this.v2$1 - i * this.fs$1), this.hz$1 - this.u1$1);
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } else if (ForgeDirection.EAST.equals(forgeDirection)) {
/*    */         this.renderer$1.func_147782_a(this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + this.u1$1, this.hx$1 - 0.0625D, (this.v2$1 - i * this.fs$1), this.hz$1 - this.u1$1);
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } else if (ForgeDirection.NORTH.equals(forgeDirection)) {
/*    */         this.renderer$1.func_147782_a(this.lx$1 + this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.lz$1 + 0.0625D, this.hx$1 - this.u1$1, (this.v2$1 - i * this.fs$1), this.u2$1);
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } else if (ForgeDirection.SOUTH.equals(forgeDirection)) {
/*    */         this.renderer$1.func_147782_a(this.lx$1 + this.u1$1, (this.v2$1 - (i + 1) * this.fs$1), this.u1$1, this.hx$1 - this.u1$1, (this.v2$1 - i * this.fs$1), this.hz$1 - 0.0625D);
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } else {
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } 
/*    */       RackMountableRenderEvent.Block event = new RackMountableRenderEvent.Block((Rack)this.rack$1, i, this.rack$1.lastData()[i], this.side$1, this.renderer$1);
/*    */       MinecraftForge.EVENT_BUS.post((Event)event);
/*    */       if (!event.isCanceled()) {
/*    */         this.block$1.frontOverride_$eq(event.getFrontTextureOverride());
/*    */         this.renderer$1.func_147784_q((Block)this.block$1, this.x$1, this.y$1, this.z$1);
/*    */         this.block$1.frontOverride_$eq(null);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Rack$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */