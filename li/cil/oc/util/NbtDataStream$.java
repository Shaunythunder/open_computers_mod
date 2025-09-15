/*    */ package li.cil.oc.util;
/*    */ public final class NbtDataStream$ {
/*    */   public static final NbtDataStream$ MODULE$;
/*    */   
/*    */   public boolean getShortArray(NBTTagCompound nbt, String key, short[][] array2d, int w, int h) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/Object
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore #6
/*    */     //   9: aload_1
/*    */     //   10: aload_2
/*    */     //   11: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*    */     //   14: ifeq -> 78
/*    */     //   17: new java/io/ByteArrayInputStream
/*    */     //   20: dup
/*    */     //   21: aload_1
/*    */     //   22: aload_2
/*    */     //   23: invokevirtual func_74770_j : (Ljava/lang/String;)[B
/*    */     //   26: invokespecial <init> : ([B)V
/*    */     //   29: astore #8
/*    */     //   31: new java/io/DataInputStream
/*    */     //   34: dup
/*    */     //   35: aload #8
/*    */     //   37: invokespecial <init> : (Ljava/io/InputStream;)V
/*    */     //   40: astore #9
/*    */     //   42: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*    */     //   45: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   48: iconst_0
/*    */     //   49: invokevirtual intWrapper : (I)I
/*    */     //   52: iload #5
/*    */     //   54: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*    */     //   57: new li/cil/oc/util/NbtDataStream$$anonfun$getShortArray$1
/*    */     //   60: dup
/*    */     //   61: aload_3
/*    */     //   62: iload #4
/*    */     //   64: aload #9
/*    */     //   66: aload #6
/*    */     //   68: invokespecial <init> : ([[SILjava/io/DataInputStream;Ljava/lang/Object;)V
/*    */     //   71: invokevirtual foreach$mVc$sp : (Lscala/Function1;)V
/*    */     //   74: iconst_1
/*    */     //   75: goto -> 97
/*    */     //   78: iconst_0
/*    */     //   79: ireturn
/*    */     //   80: astore #7
/*    */     //   82: aload #7
/*    */     //   84: invokevirtual key : ()Ljava/lang/Object;
/*    */     //   87: aload #6
/*    */     //   89: if_acmpne -> 98
/*    */     //   92: aload #7
/*    */     //   94: invokevirtual value$mcZ$sp : ()Z
/*    */     //   97: ireturn
/*    */     //   98: aload #7
/*    */     //   100: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 0
/*    */     //   #7	-> 9
/*    */     //   #11	-> 17
/*    */     //   #12	-> 31
/*    */     //   #13	-> 45
/*    */     //   #21	-> 74
/*    */     //   #8	-> 78
/*    */     //   #6	-> 80
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	101	0	this	Lli/cil/oc/util/NbtDataStream$;
/*    */     //   0	101	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   0	101	2	key	Ljava/lang/String;
/*    */     //   0	101	3	array2d	[[S
/*    */     //   0	101	4	w	I
/*    */     //   0	101	5	h	I
/*    */     //   31	44	8	rawByteReader	Ljava/io/ByteArrayInputStream;
/*    */     //   42	33	9	memReader	Ljava/io/DataInputStream;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	80	80	scala/runtime/NonLocalReturnControl
/*    */   }
/*    */   
/*    */   public final class NbtDataStream$$anonfun$getShortArray$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final short[][] array2d$1;
/*    */     
/* 13 */     public final void apply(int y) { apply$mcVI$sp(y); } private final int w$1; public final DataInputStream memReader$1; public final Object nonLocalReturnKey1$1; public NbtDataStream$$anonfun$getShortArray$1(short[][] array2d$1, int w$1, DataInputStream memReader$1, Object nonLocalReturnKey1$1) {} public void apply$mcVI$sp(int y) {
/* 14 */       scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), this.w$1).foreach$mVc$sp((Function1)new NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1(this, y)); } public final class NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int y$1; public final void apply(int x) { apply$mcVI$sp(x); } public NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1(NbtDataStream$$anonfun$getShortArray$1 $outer, int y$1) {} public void apply$mcVI$sp(int x) {
/* 15 */         if (2 > this.$outer.memReader$1.available()) {
/* 16 */           throw new NonLocalReturnControl.mcZ.sp(this.$outer.nonLocalReturnKey1$1, true);
/*    */         }
/* 18 */         this.$outer.array2d$1[this.y$1][x] = this.$outer.memReader$1.readShort();
/*    */       } } }
/*    */   public boolean getIntArrayLegacy(NBTTagCompound nbt, String key, short[][] array2d, int w, int h) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/Object
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore #6
/*    */     //   9: aload_1
/*    */     //   10: aload_2
/*    */     //   11: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*    */     //   14: ifeq -> 60
/*    */     //   17: aload_1
/*    */     //   18: aload_2
/*    */     //   19: invokevirtual func_74759_k : (Ljava/lang/String;)[I
/*    */     //   22: astore #8
/*    */     //   24: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*    */     //   27: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   30: iconst_0
/*    */     //   31: invokevirtual intWrapper : (I)I
/*    */     //   34: iload #5
/*    */     //   36: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*    */     //   39: new li/cil/oc/util/NbtDataStream$$anonfun$getIntArrayLegacy$1
/*    */     //   42: dup
/*    */     //   43: aload_3
/*    */     //   44: iload #4
/*    */     //   46: aload #8
/*    */     //   48: aload #6
/*    */     //   50: invokespecial <init> : ([[SI[ILjava/lang/Object;)V
/*    */     //   53: invokevirtual foreach$mVc$sp : (Lscala/Function1;)V
/*    */     //   56: iconst_1
/*    */     //   57: goto -> 79
/*    */     //   60: iconst_0
/*    */     //   61: ireturn
/*    */     //   62: astore #7
/*    */     //   64: aload #7
/*    */     //   66: invokevirtual key : ()Ljava/lang/Object;
/*    */     //   69: aload #6
/*    */     //   71: if_acmpne -> 80
/*    */     //   74: aload #7
/*    */     //   76: invokevirtual value$mcZ$sp : ()Z
/*    */     //   79: ireturn
/*    */     //   80: aload #7
/*    */     //   82: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     //   #25	-> 9
/*    */     //   #29	-> 17
/*    */     //   #30	-> 27
/*    */     //   #40	-> 56
/*    */     //   #26	-> 60
/*    */     //   #24	-> 62
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	83	0	this	Lli/cil/oc/util/NbtDataStream$;
/*    */     //   0	83	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   0	83	2	key	Ljava/lang/String;
/*    */     //   0	83	3	array2d	[[S
/*    */     //   0	83	4	w	I
/*    */     //   0	83	5	h	I
/*    */     //   24	33	8	c	[I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	62	62	scala/runtime/NonLocalReturnControl
/*    */   }
/*    */   
/*    */   public final class NbtDataStream$$anonfun$getIntArrayLegacy$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final short[][] array2d$2;
/*    */     public final int w$2;
/*    */     public final int[] c$1;
/*    */     public final Object nonLocalReturnKey2$1;
/*    */     
/* 30 */     public final void apply(int y) { apply$mcVI$sp(y); } public NbtDataStream$$anonfun$getIntArrayLegacy$1(short[][] array2d$2, int w$2, int[] c$1, Object nonLocalReturnKey2$1) {}
/* 31 */     public void apply$mcVI$sp(int y) { short[] rowColor = this.array2d$2[y]; scala.runtime.RichInt$.MODULE$
/* 32 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), this.w$2).foreach$mVc$sp((Function1)new NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2(this, rowColor, y)); } public final class NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final short[] rowColor$1; private final int y$2; public final void apply(int x) { apply$mcVI$sp(x); } public NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2(NbtDataStream$$anonfun$getIntArrayLegacy$1 $outer, short[] rowColor$1, int y$2) {} public void apply$mcVI$sp(int x) {
/* 33 */         int index = x + this.y$2 * this.$outer.w$2;
/* 34 */         if (index >= this.$outer.c$1.length) {
/* 35 */           throw new NonLocalReturnControl.mcZ.sp(this.$outer.nonLocalReturnKey2$1, true);
/*    */         }
/* 37 */         this.rowColor$1[x] = (short)this.$outer.c$1[index];
/*    */       } }
/*    */      }
/*    */ 
/*    */   
/*    */   public void setShortArray(NBTTagCompound nbt, String key, short[] array)
/*    */   {
/* 44 */     ByteArrayOutputStream rawByteWriter = new ByteArrayOutputStream();
/* 45 */     DataOutputStream memWriter = new DataOutputStream(rawByteWriter);
/* 46 */     scala.Predef$.MODULE$.shortArrayOps(array).foreach((Function1)new NbtDataStream$$anonfun$setShortArray$1(memWriter));
/* 47 */     nbt.func_74773_a(key, rawByteWriter.toByteArray());
/*    */   } public final class NbtDataStream$$anonfun$setShortArray$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/* 49 */     public static final long serialVersionUID = 0L; private final DataOutputStream memWriter$1; public final void apply(short x$1) { this.memWriter$1.writeShort(x$1); } public NbtDataStream$$anonfun$setShortArray$1(DataOutputStream memWriter$1) {} } private NbtDataStream$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\NbtDataStream$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */