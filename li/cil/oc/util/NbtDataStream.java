/*    */ package li.cil.oc.util;
/*    */ @ScalaSignature(bytes = "\006\001U;Q!\001\002\t\002-\tQB\0242u\t\006$\030m\025;sK\006l'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\007OER$\025\r^1TiJ,\027-\\\n\003\033A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\016\t\003A\022A\002\037j]&$h\bF\001\f\021\025QR\002\"\001\034\00359W\r^*i_J$\030I\035:bsR1Ad\b\0264y\005\003\"!E\017\n\005y\021\"a\002\"p_2,\027M\034\005\006Ae\001\r!I\001\004]\n$\bC\001\022)\033\005\031#B\001\021%\025\t)c%A\005nS:,7M]1gi*\tq%A\002oKRL!!K\022\003\0359\023E\013V1h\007>l\007o\\;oI\")1&\007a\001Y\005\0311.Z=\021\0055\002dBA\t/\023\ty##\001\004Qe\026$WMZ\005\003cI\022aa\025;sS:<'BA\030\023\021\025!\024\0041\0016\003\035\t'O]1ze\021\0042!\005\0349\023\t9$CA\003BeJ\f\027\020E\002\022me\002\"!\005\036\n\005m\022\"!B*i_J$\b\"B\037\032\001\004q\024!A<\021\005Ey\024B\001!\023\005\rIe\016\036\005\006\005f\001\rAP\001\002Q\")A)\004C\001\013\006\tr-\032;J]R\f%O]1z\031\026<\027mY=\025\rq1u\tS%K\021\025\0013\t1\001\"\021\025Y3\t1\001-\021\025!4\t1\0016\021\025i4\t1\001?\021\025\0215\t1\001?\021\025aU\002\"\001N\0035\031X\r^*i_J$\030I\035:bsR!a*\025*T!\t\tr*\003\002Q%\t!QK\\5u\021\025\0013\n1\001\"\021\025Y3\n1\001-\021\025!6\n1\0019\003\025\t'O]1z\001")
/*    */ public final class NbtDataStream { public static void setShortArray(NBTTagCompound paramNBTTagCompound, String paramString, short[] paramArrayOfshort) {
/*    */     NbtDataStream$.MODULE$.setShortArray(paramNBTTagCompound, paramString, paramArrayOfshort);
/*    */   }
/*    */   public static boolean getIntArrayLegacy(NBTTagCompound paramNBTTagCompound, String paramString, short[][] paramArrayOfshort, int paramInt1, int paramInt2) {
/*    */     return NbtDataStream$.MODULE$.getIntArrayLegacy(paramNBTTagCompound, paramString, paramArrayOfshort, paramInt1, paramInt2);
/*    */   }
/*    */   public static boolean getShortArray(NBTTagCompound paramNBTTagCompound, String paramString, short[][] paramArrayOfshort, int paramInt1, int paramInt2) {
/*    */     return NbtDataStream$.MODULE$.getShortArray(paramNBTTagCompound, paramString, paramArrayOfshort, paramInt1, paramInt2);
/*    */   }
/*    */   public final class NbtDataStream$$anonfun$getShortArray$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final short[][] array2d$1;
/* 13 */     public final void apply(int y) { apply$mcVI$sp(y); } private final int w$1; public final DataInputStream memReader$1; public final Object nonLocalReturnKey1$1; public NbtDataStream$$anonfun$getShortArray$1(short[][] array2d$1, int w$1, DataInputStream memReader$1, Object nonLocalReturnKey1$1) {} public void apply$mcVI$sp(int y) {
/* 14 */       RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.w$1).foreach$mVc$sp((Function1)new NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1(this, y)); } public final class NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int y$1; public final void apply(int x) { apply$mcVI$sp(x); } public NbtDataStream$$anonfun$getShortArray$1$$anonfun$apply$mcVI$sp$1(NbtDataStream$$anonfun$getShortArray$1 $outer, int y$1) {} public void apply$mcVI$sp(int x) {
/* 15 */         if (2 > this.$outer.memReader$1.available()) {
/* 16 */           throw new NonLocalReturnControl.mcZ.sp(this.$outer.nonLocalReturnKey1$1, true);
/*    */         }
/* 18 */         this.$outer.array2d$1[this.y$1][x] = this.$outer.memReader$1.readShort();
/*    */       } }
/*    */      }
/*    */ 
/*    */   
/*    */   public final class NbtDataStream$$anonfun$getIntArrayLegacy$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final short[][] array2d$2;
/*    */     public final int w$2;
/*    */     public final int[] c$1;
/*    */     public final Object nonLocalReturnKey2$1;
/*    */     
/* 30 */     public final void apply(int y) { apply$mcVI$sp(y); } public NbtDataStream$$anonfun$getIntArrayLegacy$1(short[][] array2d$2, int w$2, int[] c$1, Object nonLocalReturnKey2$1) {}
/* 31 */     public void apply$mcVI$sp(int y) { short[] rowColor = this.array2d$2[y]; RichInt$.MODULE$
/* 32 */         .until$extension0(Predef$.MODULE$.intWrapper(0), this.w$2).foreach$mVc$sp((Function1)new NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2(this, rowColor, y)); } public final class NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final short[] rowColor$1; private final int y$2; public final void apply(int x) { apply$mcVI$sp(x); } public NbtDataStream$$anonfun$getIntArrayLegacy$1$$anonfun$apply$mcVI$sp$2(NbtDataStream$$anonfun$getIntArrayLegacy$1 $outer, short[] rowColor$1, int y$2) {} public void apply$mcVI$sp(int x) {
/* 33 */         int index = x + this.y$2 * this.$outer.w$2;
/* 34 */         if (index >= this.$outer.c$1.length) {
/* 35 */           throw new NonLocalReturnControl.mcZ.sp(this.$outer.nonLocalReturnKey2$1, true);
/*    */         }
/* 37 */         this.rowColor$1[x] = (short)this.$outer.c$1[index];
/*    */       } }
/*    */   }
/*    */   
/*    */   public final class NbtDataStream$$anonfun$setShortArray$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final DataOutputStream memWriter$1;
/*    */     
/*    */     public final void apply(short x$1) {
/* 46 */       this.memWriter$1.writeShort(x$1);
/*    */     }
/*    */     
/*    */     public NbtDataStream$$anonfun$setShortArray$1(DataOutputStream memWriter$1) {}
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\NbtDataStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */