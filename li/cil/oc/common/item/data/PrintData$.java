/*     */ package li.cil.oc.common.item.data;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import scala.Function1;
/*     */ import scala.Function2;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.LinkedHashSet;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.FloatRef;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PrintData$
/*     */ {
/*     */   public static final PrintData$ MODULE$;
/*     */   private final int li$cil$oc$common$item$data$PrintData$$stepping;
/*     */   private final float li$cil$oc$common$item$data$PrintData$$step;
/*     */   private final float li$cil$oc$common$item$data$PrintData$$invMaxVolume;
/*     */   private final LinkedHashSet<Method> inkProviders;
/*     */   private final int materialPerItem;
/*     */   
/*     */   public int li$cil$oc$common$item$data$PrintData$$stepping() {
/* 126 */     return this.li$cil$oc$common$item$data$PrintData$$stepping;
/* 127 */   } public float li$cil$oc$common$item$data$PrintData$$step() { return this.li$cil$oc$common$item$data$PrintData$$step; } public float li$cil$oc$common$item$data$PrintData$$invMaxVolume() {
/* 128 */     return this.li$cil$oc$common$item$data$PrintData$$invMaxVolume;
/*     */   } private LinkedHashSet<Method> inkProviders() {
/* 130 */     return this.inkProviders;
/*     */   }
/* 132 */   public void addInkProvider(Method provider) { inkProviders().$plus$eq(provider); } public final class PrintData$$anonfun$computeApproximateOpacity$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final Iterable shapes$1; public final FloatRef volume$1; public final void apply(int x) { apply$mcVI$sp(x); } public void apply$mcVI$sp(int x) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 16 / PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$stepping()).foreach$mVc$sp((Function1)new PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1(this, x)); } public PrintData$$anonfun$computeApproximateOpacity$1(Iterable shapes$1, FloatRef volume$1) {} public final class PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int x$5; public final void apply(int y) { apply$mcVI$sp(y); } public void apply$mcVI$sp(int y) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 16 / PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$stepping()).foreach$mVc$sp((Function1)new PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, y)); } public PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1(PrintData$$anonfun$computeApproximateOpacity$1 $outer, int x$5) {} public final class PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final int y$1; public final void apply(int z) { apply$mcVI$sp(z); } public PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1 $outer, int y$1) {} public void apply$mcVI$sp(int z) { AxisAlignedBB bounds = AxisAlignedBB.func_72330_a((this.$outer.x$5 * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step()), (this.y$1 * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step()), (z * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step()), ((this.$outer.x$5 + 1) * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step()), ((this.y$1 + 1) * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step()), ((z + 1) * PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$step())); if (!(this.$outer.li$cil$oc$common$item$data$PrintData$$anonfun$$anonfun$$$outer()).shapes$1.exists((Function1)new PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$mcVI$sp$3(this, bounds))) (this.$outer.li$cil$oc$common$item$data$PrintData$$anonfun$$anonfun$$$outer()).volume$1.elem -= PrintData$.MODULE$.li$cil$oc$common$item$data$PrintData$$invMaxVolume();  } public final class PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<PrintData.Shape, Object> implements Serializable {
/* 135 */           public static final long serialVersionUID = 0L; private final AxisAlignedBB bounds$1; public final boolean apply(PrintData.Shape x$3) { return x$3.bounds().func_72326_a(this.bounds$1); } public PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2$$anonfun$apply$mcVI$sp$3(PrintData$$anonfun$computeApproximateOpacity$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 $outer, AxisAlignedBB bounds$1) {} } } } } public float computeApproximateOpacity(Iterable shapes) { FloatRef volume = FloatRef.create(1.0F);
/* 136 */     if (shapes.nonEmpty()) scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 16 / li$cil$oc$common$item$data$PrintData$$stepping()).foreach$mVc$sp((Function1)new PrintData$$anonfun$computeApproximateOpacity$1(shapes, volume));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     return volume.elem; }
/*     */ 
/*     */   
/*     */   public Option<Tuple2<Object, Object>> computeCosts(PrintData data) {
/* 148 */     int totalVolume = BoxesRunTime.unboxToInt(data.stateOn().foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new PrintData$$anonfun$2())) + BoxesRunTime.unboxToInt(data.stateOff().foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new PrintData$$anonfun$3()));
/* 149 */     int totalSurface = BoxesRunTime.unboxToInt(data.stateOn().foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new PrintData$$anonfun$4())) + BoxesRunTime.unboxToInt(data.stateOff().foldLeft(BoxesRunTime.boxToInteger(0), (Function2)new PrintData$$anonfun$5()));
/* 150 */     double multiplier = (data.noclipOff() || data.noclipOn()) ? li.cil.oc.Settings$.MODULE$.get().noclipMultiplier() : 1.0D;
/*     */ 
/*     */     
/* 153 */     int baseMaterialRequired = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(totalVolume / 2), 1);
/* 154 */     int materialRequired = 
/* 155 */       (data.redstoneLevel() > 0 && data.redstoneLevel() < 15) ? (baseMaterialRequired + li.cil.oc.Settings$.MODULE$.get().printCustomRedstone()) : 
/* 156 */       baseMaterialRequired;
/* 157 */     int inkRequired = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(totalSurface / 6), 1);
/*     */     
/* 159 */     return (totalVolume > 0) ? scala.Option$.MODULE$.apply(new Tuple2.mcII.sp((int)(materialRequired * multiplier), inkRequired)) : 
/*     */       
/* 161 */       (Option<Tuple2<Object, Object>>)scala.None$.MODULE$; } public final class PrintData$$anonfun$2 extends AbstractFunction2<Object, PrintData.Shape, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int apply(int acc, PrintData.Shape shape) { return acc + li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).volume(); } } public final class PrintData$$anonfun$3 extends AbstractFunction2<Object, PrintData.Shape, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int apply(int acc, PrintData.Shape shape) { return acc + li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).volume(); } } public final class PrintData$$anonfun$4 extends AbstractFunction2<Object, PrintData.Shape, Object> implements Serializable {
/* 164 */     public static final long serialVersionUID = 0L; public final int apply(int acc, PrintData.Shape shape) { return acc + li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).surface(); } } public final class PrintData$$anonfun$5 extends AbstractFunction2<Object, PrintData.Shape, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int acc, PrintData.Shape shape) { return acc + li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).surface(); } } private int materialPerItem() { return this.materialPerItem; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int materialValue(ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: ldc 'chamelium'
/*     */     //   6: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   9: astore_2
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 22
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: ifnull -> 29
/*     */     //   19: goto -> 36
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 36
/*     */     //   29: aload_0
/*     */     //   30: invokespecial materialPerItem : ()I
/*     */     //   33: goto -> 148
/*     */     //   36: aload_1
/*     */     //   37: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   40: ldc 'print'
/*     */     //   42: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   45: astore_3
/*     */     //   46: dup
/*     */     //   47: ifnonnull -> 58
/*     */     //   50: pop
/*     */     //   51: aload_3
/*     */     //   52: ifnull -> 65
/*     */     //   55: goto -> 147
/*     */     //   58: aload_3
/*     */     //   59: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 147
/*     */     //   65: new li/cil/oc/common/item/data/PrintData
/*     */     //   68: dup
/*     */     //   69: aload_1
/*     */     //   70: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   73: astore #4
/*     */     //   75: aload_0
/*     */     //   76: aload #4
/*     */     //   78: invokevirtual computeCosts : (Lli/cil/oc/common/item/data/PrintData;)Lscala/Option;
/*     */     //   81: astore #5
/*     */     //   83: aload #5
/*     */     //   85: instanceof scala/Some
/*     */     //   88: ifeq -> 139
/*     */     //   91: aload #5
/*     */     //   93: checkcast scala/Some
/*     */     //   96: astore #6
/*     */     //   98: aload #6
/*     */     //   100: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   103: checkcast scala/Tuple2
/*     */     //   106: astore #7
/*     */     //   108: aload #7
/*     */     //   110: ifnull -> 139
/*     */     //   113: aload #7
/*     */     //   115: invokevirtual _1$mcI$sp : ()I
/*     */     //   118: istore #8
/*     */     //   120: iload #8
/*     */     //   122: i2d
/*     */     //   123: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   126: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   129: invokevirtual printRecycleRate : ()D
/*     */     //   132: dmul
/*     */     //   133: d2i
/*     */     //   134: istore #9
/*     */     //   136: goto -> 142
/*     */     //   139: iconst_0
/*     */     //   140: istore #9
/*     */     //   142: iload #9
/*     */     //   144: goto -> 148
/*     */     //   147: iconst_0
/*     */     //   148: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #167	-> 0
/*     */     //   #168	-> 29
/*     */     //   #169	-> 36
/*     */     //   #170	-> 65
/*     */     //   #171	-> 75
/*     */     //   #172	-> 83
/*     */     //   #173	-> 139
/*     */     //   #171	-> 142
/*     */     //   #176	-> 147
/*     */     //   #167	-> 148
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	149	0	this	Lli/cil/oc/common/item/data/PrintData$;
/*     */     //   0	149	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   75	69	4	data	Lli/cil/oc/common/item/data/PrintData;
/*     */     //   120	29	8	materialRequired	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int inkValue(ItemStack stack) {
/* 179 */     Object object = new Object(); try {
/* 180 */       inkProviders().foreach((Function1)new PrintData$$anonfun$inkValue$1(stack, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return nonLocalReturnControl.value$mcI$sp();
/*     */       }
/*     */     } 
/* 186 */     return 0;
/*     */   } public final class PrintData$$anonfun$inkValue$1 extends AbstractFunction1<Method, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; private final Object nonLocalReturnKey1$1; public PrintData$$anonfun$inkValue$1(ItemStack stack$1, Object nonLocalReturnKey1$1) {} public final void apply(Method provider) {
/*     */       int value = BoxesRunTime.unboxToInt(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic(provider, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToInteger(0)));
/*     */       if (value > 0)
/*     */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, value); 
/*     */     } } public PrintData.Shape nbtToShape(NBTTagCompound nbt) {
/* 193 */     float minX = nbt.func_74771_c("minX") / 16.0F;
/* 194 */     float minY = nbt.func_74771_c("minY") / 16.0F;
/* 195 */     float minZ = nbt.func_74771_c("minZ") / 16.0F;
/* 196 */     float maxX = nbt.func_74771_c("maxX") / 16.0F;
/* 197 */     float maxY = nbt.func_74771_c("maxY") / 16.0F;
/* 198 */     float maxZ = nbt.func_74771_c("maxZ") / 16.0F;
/*     */ 
/*     */ 
/*     */     
/* 202 */     byte[] bounds = (byte[])scala.Predef$.MODULE$.byteArrayOps(nbt.func_74770_j("bounds")).padTo(6, BoxesRunTime.boxToByte((byte)0), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Byte()));
/* 203 */     float f1 = bounds[0] / 16.0F;
/* 204 */     float f2 = bounds[1] / 16.0F;
/* 205 */     float f3 = bounds[2] / 16.0F;
/* 206 */     float f4 = bounds[3] / 16.0F;
/* 207 */     float f5 = bounds[4] / 16.0F;
/* 208 */     float f6 = bounds[5] / 16.0F;
/* 209 */     AxisAlignedBB aabb = nbt.func_74764_b("minX") ? AxisAlignedBB.func_72330_a(minX, minY, minZ, maxX, maxY, maxZ) : AxisAlignedBB.func_72330_a(f1, f2, f3, f4, f5, f6);
/*     */     
/* 211 */     String texture = nbt.func_74779_i("texture");
/* 212 */     Option<Object> tint = nbt.func_74764_b("tint") ? scala.Option$.MODULE$.apply(BoxesRunTime.boxToInteger(nbt.func_74762_e("tint"))) : (Option)scala.None$.MODULE$;
/* 213 */     return new PrintData.Shape(aabb, texture, tint);
/*     */   }
/*     */   
/*     */   public NBTTagCompound shapeToNBT(PrintData.Shape shape) {
/* 217 */     NBTTagCompound nbt = new NBTTagCompound();
/* 218 */     nbt.func_74773_a("bounds", new byte[] {
/* 219 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72340_a * 16)), 
/* 220 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72338_b * 16)), 
/* 221 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72339_c * 16)), 
/* 222 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72336_d * 16)), 
/* 223 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72337_e * 16)), 
/* 224 */           (byte)(int)scala.runtime.RichDouble$.MODULE$.round$extension(scala.Predef$.MODULE$.doubleWrapper((shape.bounds()).field_72334_f * 16))
/*     */         });
/* 226 */     nbt.func_74778_a("texture", shape.texture());
/* 227 */     shape.tint().foreach((Function1)new PrintData$$anonfun$shapeToNBT$1(nbt));
/* 228 */     return nbt;
/*     */   } public final class PrintData$$anonfun$shapeToNBT$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(int x$4) { apply$mcVI$sp(x$4); } public void apply$mcVI$sp(int x$4) {
/*     */       this.nbt$2.func_74768_a("tint", x$4);
/*     */     } public PrintData$$anonfun$shapeToNBT$1(NBTTagCompound nbt$2) {} } private PrintData$() {
/* 233 */     MODULE$ = this;
/*     */     this.li$cil$oc$common$item$data$PrintData$$stepping = 4;
/*     */     this.li$cil$oc$common$item$data$PrintData$$step = li$cil$oc$common$item$data$PrintData$$stepping() / 16.0F;
/*     */     this.li$cil$oc$common$item$data$PrintData$$invMaxVolume = 1.0F / (li$cil$oc$common$item$data$PrintData$$stepping() * li$cil$oc$common$item$data$PrintData$$stepping() * li$cil$oc$common$item$data$PrintData$$stepping());
/*     */     this.inkProviders = scala.collection.mutable.LinkedHashSet$.MODULE$.empty();
/*     */     this.materialPerItem = li.cil.oc.Settings$.MODULE$.get().printMaterialValue();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\PrintData$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */