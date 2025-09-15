/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import li.cil.oc.common.tileentity.Keyboard;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
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
/*    */ public final class Keyboard$
/*    */ {
/*    */   public static final Keyboard$ MODULE$;
/*    */   
/*    */   public boolean render(Keyboard keyboard, int x, int y, int z, Block block, RenderBlocks renderer) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   4: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   7: astore #7
/*    */     //   9: dup
/*    */     //   10: ifnonnull -> 22
/*    */     //   13: pop
/*    */     //   14: aload #7
/*    */     //   16: ifnull -> 60
/*    */     //   19: goto -> 30
/*    */     //   22: aload #7
/*    */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   27: ifne -> 60
/*    */     //   30: aload_1
/*    */     //   31: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   34: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   37: astore #8
/*    */     //   39: dup
/*    */     //   40: ifnonnull -> 52
/*    */     //   43: pop
/*    */     //   44: aload #8
/*    */     //   46: ifnull -> 60
/*    */     //   49: goto -> 236
/*    */     //   52: aload #8
/*    */     //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   57: ifeq -> 236
/*    */     //   60: aload_1
/*    */     //   61: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   64: astore #9
/*    */     //   66: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   69: aload #9
/*    */     //   71: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   74: ifeq -> 97
/*    */     //   77: aload #6
/*    */     //   79: iconst_0
/*    */     //   80: putfield field_147867_u : I
/*    */     //   83: aload #6
/*    */     //   85: iconst_0
/*    */     //   86: putfield field_147865_v : I
/*    */     //   89: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   92: astore #10
/*    */     //   94: goto -> 187
/*    */     //   97: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   100: aload #9
/*    */     //   102: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   105: ifeq -> 128
/*    */     //   108: aload #6
/*    */     //   110: iconst_3
/*    */     //   111: putfield field_147867_u : I
/*    */     //   114: aload #6
/*    */     //   116: iconst_3
/*    */     //   117: putfield field_147865_v : I
/*    */     //   120: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   123: astore #10
/*    */     //   125: goto -> 187
/*    */     //   128: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   131: aload #9
/*    */     //   133: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   136: ifeq -> 159
/*    */     //   139: aload #6
/*    */     //   141: iconst_2
/*    */     //   142: putfield field_147867_u : I
/*    */     //   145: aload #6
/*    */     //   147: iconst_1
/*    */     //   148: putfield field_147865_v : I
/*    */     //   151: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   154: astore #10
/*    */     //   156: goto -> 187
/*    */     //   159: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   162: aload #9
/*    */     //   164: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   167: ifeq -> 226
/*    */     //   170: aload #6
/*    */     //   172: iconst_1
/*    */     //   173: putfield field_147867_u : I
/*    */     //   176: aload #6
/*    */     //   178: iconst_2
/*    */     //   179: putfield field_147865_v : I
/*    */     //   182: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   185: astore #10
/*    */     //   187: aload_1
/*    */     //   188: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   191: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   194: astore #11
/*    */     //   196: dup
/*    */     //   197: ifnonnull -> 209
/*    */     //   200: pop
/*    */     //   201: aload #11
/*    */     //   203: ifnull -> 217
/*    */     //   206: goto -> 236
/*    */     //   209: aload #11
/*    */     //   211: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   214: ifeq -> 236
/*    */     //   217: aload #6
/*    */     //   219: iconst_1
/*    */     //   220: putfield field_147842_e : Z
/*    */     //   223: goto -> 236
/*    */     //   226: new java/lang/AssertionError
/*    */     //   229: dup
/*    */     //   230: ldc 'Impossible yaw value on keyboard.'
/*    */     //   232: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   235: athrow
/*    */     //   236: aload #6
/*    */     //   238: aload #5
/*    */     //   240: iload_2
/*    */     //   241: iload_3
/*    */     //   242: iload #4
/*    */     //   244: invokevirtual func_147784_q : (Lnet/minecraft/block/Block;III)Z
/*    */     //   247: istore #12
/*    */     //   249: aload #6
/*    */     //   251: iconst_0
/*    */     //   252: putfield field_147867_u : I
/*    */     //   255: aload #6
/*    */     //   257: iconst_0
/*    */     //   258: putfield field_147865_v : I
/*    */     //   261: aload #6
/*    */     //   263: iconst_0
/*    */     //   264: putfield field_147842_e : Z
/*    */     //   267: iload #12
/*    */     //   269: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 0
/*    */     //   #11	-> 60
/*    */     //   #12	-> 66
/*    */     //   #13	-> 77
/*    */     //   #14	-> 83
/*    */     //   #12	-> 92
/*    */     //   #15	-> 97
/*    */     //   #16	-> 108
/*    */     //   #17	-> 114
/*    */     //   #15	-> 123
/*    */     //   #18	-> 128
/*    */     //   #19	-> 139
/*    */     //   #20	-> 145
/*    */     //   #18	-> 154
/*    */     //   #21	-> 159
/*    */     //   #22	-> 170
/*    */     //   #23	-> 176
/*    */     //   #21	-> 185
/*    */     //   #26	-> 187
/*    */     //   #27	-> 217
/*    */     //   #24	-> 226
/*    */     //   #30	-> 236
/*    */     //   #31	-> 249
/*    */     //   #32	-> 255
/*    */     //   #33	-> 261
/*    */     //   #34	-> 267
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	270	0	this	Lli/cil/oc/client/renderer/block/Keyboard$;
/*    */     //   0	270	1	keyboard	Lli/cil/oc/common/tileentity/Keyboard;
/*    */     //   0	270	2	x	I
/*    */     //   0	270	3	y	I
/*    */     //   0	270	4	z	I
/*    */     //   0	270	5	block	Lnet/minecraft/block/Block;
/*    */     //   0	270	6	renderer	Lnet/minecraft/client/renderer/RenderBlocks;
/*    */     //   249	20	12	result	Z
/*    */   }
/*    */   
/*    */   private Keyboard$() {
/* 36 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Keyboard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */