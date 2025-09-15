/*     */ package li.cil.oc.client.renderer.tileentity;
/*     */ 
/*     */ import li.cil.oc.api.driver.item.UpgradeRenderer;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import net.minecraft.client.renderer.ItemRenderer;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.Vec3;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple4;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.ArrayOps;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.runtime.VolatileByteRef;
/*     */ 
/*     */ public final class RobotRenderer$ extends TileEntitySpecialRenderer {
/*     */   public static final RobotRenderer$ MODULE$;
/*     */   private final int displayList;
/*     */   private final RobotRenderEvent.MountPoint[] li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints;
/*     */   private final Map<String, Object> li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping;
/*     */   private final float gap;
/*     */   private final float gt;
/*     */   private final float gb;
/*     */   
/*  38 */   private RobotRenderer$() { MODULE$ = this;
/*  39 */     this.displayList = GLAllocation.func_74526_a(2);
/*     */     
/*  41 */     this.li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints = new RobotRenderEvent.MountPoint[7];
/*     */     
/*  43 */     (new Tuple2[7])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  44 */       .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("top_left"), BoxesRunTime.boxToInteger(0));
/*  45 */     (new Tuple2[7])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("top_right"), BoxesRunTime.boxToInteger(1));
/*  46 */     (new Tuple2[7])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("top_back"), BoxesRunTime.boxToInteger(2));
/*  47 */     (new Tuple2[7])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("bottom_left"), BoxesRunTime.boxToInteger(3));
/*  48 */     (new Tuple2[7])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("bottom_right"), BoxesRunTime.boxToInteger(4));
/*  49 */     (new Tuple2[7])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("bottom_back"), BoxesRunTime.boxToInteger(5));
/*  50 */     (new Tuple2[7])[6] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("bottom_front"), BoxesRunTime.boxToInteger(6));
/*     */     
/*     */     this.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping = (Map<String, Object>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]));
/*  53 */     li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping().withFilter((Function1)new RobotRenderer$$anonfun$2()).foreach((Function1)new RobotRenderer$$anonfun$3());
/*     */ 
/*     */ 
/*     */     
/*  57 */     this.gap = 0.035714287F;
/*  58 */     this.gt = 0.5F + gap();
/*  59 */     this.gb = 0.5F - gap();
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
/* 137 */     compileList(); }
/*     */   private int displayList() { return this.displayList; } public RobotRenderEvent.MountPoint[] li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints() { return this.li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints; } public Map<String, Object> li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping() { return this.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping; } public final class RobotRenderer$$anonfun$2 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$3 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable {
/* 140 */     public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String name = (String)tuple2._1(); int index = tuple2._2$mcI$sp(); RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[index] = new RobotRenderEvent.MountPoint(name); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } } public void resetMountPoints(boolean running) { float offset = running ? 0.0F : -0.06F;
/*     */ 
/*     */     
/* 143 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).offset.setX(0.0F);
/* 144 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).offset.setY(0.2F);
/* 145 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).offset.setZ(0.24F);
/* 146 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).rotation.setX(0.0F);
/* 147 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).rotation.setY(1.0F);
/* 148 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).rotation.setZ(0.0F);
/* 149 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[0]).rotation.setW(90.0F);
/*     */ 
/*     */     
/* 152 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).offset.setX(0.0F);
/* 153 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).offset.setY(0.2F);
/* 154 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).offset.setZ(0.24F);
/* 155 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).rotation.setX(0.0F);
/* 156 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).rotation.setY(1.0F);
/* 157 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).rotation.setZ(0.0F);
/* 158 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[1]).rotation.setW(-90.0F);
/*     */ 
/*     */     
/* 161 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).offset.setX(0.0F);
/* 162 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).offset.setY(0.2F);
/* 163 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).offset.setZ(0.24F);
/* 164 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).rotation.setX(0.0F);
/* 165 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).rotation.setY(1.0F);
/* 166 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).rotation.setZ(0.0F);
/* 167 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[2]).rotation.setW(180.0F);
/*     */ 
/*     */     
/* 170 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).offset.setX(0.0F);
/* 171 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).offset.setY(-0.2F - offset);
/* 172 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).offset.setZ(0.24F);
/* 173 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).rotation.setX(0.0F);
/* 174 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).rotation.setY(1.0F);
/* 175 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).rotation.setZ(0.0F);
/* 176 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[3]).rotation.setW(90.0F);
/*     */ 
/*     */     
/* 179 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).offset.setX(0.0F);
/* 180 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).offset.setY(-0.2F - offset);
/* 181 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).offset.setZ(0.24F);
/* 182 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).rotation.setX(0.0F);
/* 183 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).rotation.setY(1.0F);
/* 184 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).rotation.setZ(0.0F);
/* 185 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[4]).rotation.setW(-90.0F);
/*     */ 
/*     */     
/* 188 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).offset.setX(0.0F);
/* 189 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).offset.setY(-0.2F - offset);
/* 190 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).offset.setZ(0.24F);
/* 191 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).rotation.setX(0.0F);
/* 192 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).rotation.setY(1.0F);
/* 193 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).rotation.setZ(0.0F);
/* 194 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[5]).rotation.setW(180.0F);
/*     */ 
/*     */     
/* 197 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).offset.setX(0.0F);
/* 198 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).offset.setY(-0.2F - offset);
/* 199 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).offset.setZ(0.24F);
/* 200 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).rotation.setX(0.0F);
/* 201 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).rotation.setY(1.0F);
/* 202 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).rotation.setZ(0.0F);
/* 203 */     (li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()[6]).rotation.setW(0.0F); }
/*     */   private float gap() { return this.gap; }
/*     */   private float gt() { return this.gt; }
/* 206 */   private float gb() { return this.gb; } private void normal(Vec3 v) { Vec3 n = v.func_72432_b(); GL11.glNormal3f((float)n.field_72450_a, (float)n.field_72448_b, (float)n.field_72449_c); } public void compileList() { Tessellator t = Tessellator.field_78398_a; float size = 0.4F; float l = 0.5F - size; float h = 0.5F + size; GL11.glNewList(displayList(), 4864); GL11.glBegin(6); GL11.glTexCoord2f(0.25F, 0.25F); GL11.glVertex3f(0.5F, 1.0F, 0.5F); GL11.glTexCoord2f(0.0F, 0.5F); GL11.glVertex3f(l, gt(), h); GL11.glTexCoord2f(0.5F, 0.5F); GL11.glVertex3f(h, gt(), h); GL11.glTexCoord2f(0.5F, 0.0F); GL11.glVertex3f(h, gt(), l); GL11.glTexCoord2f(0.0F, 0.0F); GL11.glVertex3f(l, gt(), l); GL11.glTexCoord2f(0.0F, 0.5F); GL11.glVertex3f(l, gt(), h); GL11.glEnd(); t.func_78382_b(); t.func_78375_b(0.0F, -1.0F, 0.0F); t.func_78374_a(l, gt(), h, 0.0D, 1.0D); t.func_78374_a(l, gt(), l, 0.0D, 0.5D); t.func_78374_a(h, gt(), l, 0.5D, 0.5D); t.func_78374_a(h, gt(), h, 0.5D, 1.0D); t.func_78381_a(); GL11.glEndList(); GL11.glNewList(displayList() + 1, 4864); GL11.glBegin(6); GL11.glTexCoord2f(0.75F, 0.25F); GL11.glVertex3f(0.5F, 0.03F, 0.5F); GL11.glTexCoord2f(0.5F, 0.0F); GL11.glVertex3f(l, gb(), l); GL11.glTexCoord2f(1.0F, 0.0F); GL11.glVertex3f(h, gb(), l); GL11.glTexCoord2f(1.0F, 0.5F); GL11.glVertex3f(h, gb(), h); GL11.glTexCoord2f(0.5F, 0.5F); GL11.glVertex3f(l, gb(), h); GL11.glTexCoord2f(0.5F, 0.0F); GL11.glVertex3f(l, gb(), l); GL11.glEnd(); t.func_78382_b(); t.func_78375_b(0.0F, 1.0F, 0.0F); t.func_78374_a(l, gb(), l, 0.0D, 0.5D); t.func_78374_a(l, gb(), h, 0.0D, 1.0D); t.func_78374_a(h, gb(), h, 0.5D, 1.0D); t.func_78374_a(h, gb(), l, 0.5D, 0.5D); t.func_78381_a(); GL11.glEndList(); } public Robot renderChassis$default$1() { return null; } public double renderChassis$default$2() { return 0.0D; } public boolean renderChassis$default$3() { return false; } public void renderChassis(Robot robot, double offset, boolean isRunningOverride) {
/* 207 */     boolean isRunning = (robot == null) ? isRunningOverride : robot.isRunning();
/*     */     
/* 209 */     float size = 0.3F;
/* 210 */     float l = 0.5F - size;
/* 211 */     float h = 0.5F + size;
/* 212 */     float vStep = 0.03125F;
/*     */     
/* 214 */     float offsetV = (int)((offset - (int)offset) * 16) * vStep;
/*     */     
/* 216 */     Tuple4 tuple4 = isRunning ? 
/* 217 */       new Tuple4(BoxesRunTime.boxToFloat(0.5F), BoxesRunTime.boxToFloat(1.0F), BoxesRunTime.boxToFloat(0.5F + offsetV), BoxesRunTime.boxToFloat(0.5F + vStep + offsetV)) : 
/*     */       
/* 219 */       new Tuple4(BoxesRunTime.boxToFloat(0.25F - vStep), BoxesRunTime.boxToFloat(0.25F + vStep), BoxesRunTime.boxToFloat(0.75F - vStep), BoxesRunTime.boxToFloat(0.75F + vStep));
/*     */     if (tuple4 != null) {
/*     */       float u0 = BoxesRunTime.unboxToFloat(tuple4._1()), u1 = BoxesRunTime.unboxToFloat(tuple4._2()), v0 = BoxesRunTime.unboxToFloat(tuple4._3()), v1 = BoxesRunTime.unboxToFloat(tuple4._4());
/*     */       Tuple4 tuple42 = new Tuple4(BoxesRunTime.boxToFloat(u0), BoxesRunTime.boxToFloat(u1), BoxesRunTime.boxToFloat(v0), BoxesRunTime.boxToFloat(v1)), tuple41 = tuple42;
/*     */       float f1 = BoxesRunTime.unboxToFloat(tuple41._1()), f2 = BoxesRunTime.unboxToFloat(tuple41._2()), f3 = BoxesRunTime.unboxToFloat(tuple41._3()), f4 = BoxesRunTime.unboxToFloat(tuple41._4());
/*     */     } 
/*     */     throw new MatchError(tuple4);
/*     */   }
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
/*     */   public void func_147500_a(TileEntity entity, double x, double y, double z, float f) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: invokestatic create : (B)Lscala/runtime/VolatileByteRef;
/*     */     //   4: astore #9
/*     */     //   6: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   9: new scala/collection/mutable/StringBuilder
/*     */     //   12: dup
/*     */     //   13: invokespecial <init> : ()V
/*     */     //   16: aload_0
/*     */     //   17: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   20: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   23: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   26: ldc_w '.renderTileEntityAt: entering (aka: wasntme)'
/*     */     //   29: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   32: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   35: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   38: aload_1
/*     */     //   39: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   42: astore #10
/*     */     //   44: aload #10
/*     */     //   46: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   49: astore #11
/*     */     //   51: aload_1
/*     */     //   52: invokevirtual func_145831_w : ()Lnet/minecraft/world/World;
/*     */     //   55: invokevirtual func_82737_E : ()J
/*     */     //   58: l2d
/*     */     //   59: fload #8
/*     */     //   61: f2d
/*     */     //   62: dadd
/*     */     //   63: d2f
/*     */     //   64: fstore #12
/*     */     //   66: invokestatic glPushMatrix : ()V
/*     */     //   69: ldc_w 1048575
/*     */     //   72: invokestatic glPushAttrib : (I)V
/*     */     //   75: dload_2
/*     */     //   76: ldc2_w 0.5
/*     */     //   79: dadd
/*     */     //   80: dload #4
/*     */     //   82: ldc2_w 0.5
/*     */     //   85: dadd
/*     */     //   86: dload #6
/*     */     //   88: ldc2_w 0.5
/*     */     //   91: dadd
/*     */     //   92: invokestatic glTranslated : (DDD)V
/*     */     //   95: aload #11
/*     */     //   97: invokevirtual proxy : ()Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   100: aload #10
/*     */     //   102: astore #13
/*     */     //   104: dup
/*     */     //   105: ifnonnull -> 117
/*     */     //   108: pop
/*     */     //   109: aload #13
/*     */     //   111: ifnull -> 173
/*     */     //   114: goto -> 125
/*     */     //   117: aload #13
/*     */     //   119: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   122: ifne -> 173
/*     */     //   125: aload #11
/*     */     //   127: invokevirtual proxy : ()Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   130: invokevirtual x : ()I
/*     */     //   133: aload #10
/*     */     //   135: invokevirtual x : ()I
/*     */     //   138: isub
/*     */     //   139: i2d
/*     */     //   140: aload #11
/*     */     //   142: invokevirtual proxy : ()Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   145: invokevirtual y : ()I
/*     */     //   148: aload #10
/*     */     //   150: invokevirtual y : ()I
/*     */     //   153: isub
/*     */     //   154: i2d
/*     */     //   155: aload #11
/*     */     //   157: invokevirtual proxy : ()Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   160: invokevirtual z : ()I
/*     */     //   163: aload #10
/*     */     //   165: invokevirtual z : ()I
/*     */     //   168: isub
/*     */     //   169: i2d
/*     */     //   170: invokestatic glTranslated : (DDD)V
/*     */     //   173: aload #11
/*     */     //   175: invokevirtual isAnimatingMove : ()Z
/*     */     //   178: ifeq -> 260
/*     */     //   181: aload #11
/*     */     //   183: invokevirtual animationTicksLeft : ()I
/*     */     //   186: i2f
/*     */     //   187: fload #8
/*     */     //   189: fsub
/*     */     //   190: f2d
/*     */     //   191: aload #11
/*     */     //   193: invokevirtual animationTicksTotal : ()I
/*     */     //   196: i2d
/*     */     //   197: ddiv
/*     */     //   198: dstore #14
/*     */     //   200: aload #11
/*     */     //   202: invokevirtual moveFromX : ()I
/*     */     //   205: aload #11
/*     */     //   207: invokevirtual x : ()I
/*     */     //   210: isub
/*     */     //   211: istore #16
/*     */     //   213: aload #11
/*     */     //   215: invokevirtual moveFromY : ()I
/*     */     //   218: aload #11
/*     */     //   220: invokevirtual y : ()I
/*     */     //   223: isub
/*     */     //   224: istore #17
/*     */     //   226: aload #11
/*     */     //   228: invokevirtual moveFromZ : ()I
/*     */     //   231: aload #11
/*     */     //   233: invokevirtual z : ()I
/*     */     //   236: isub
/*     */     //   237: istore #18
/*     */     //   239: iload #16
/*     */     //   241: i2d
/*     */     //   242: dload #14
/*     */     //   244: dmul
/*     */     //   245: iload #17
/*     */     //   247: i2d
/*     */     //   248: dload #14
/*     */     //   250: dmul
/*     */     //   251: iload #18
/*     */     //   253: i2d
/*     */     //   254: dload #14
/*     */     //   256: dmul
/*     */     //   257: invokestatic glTranslated : (DDD)V
/*     */     //   260: aload #11
/*     */     //   262: invokevirtual hashCode : ()I
/*     */     //   265: sipush #255
/*     */     //   268: ixor
/*     */     //   269: istore #19
/*     */     //   271: aload #11
/*     */     //   273: invokevirtual isRunning : ()Z
/*     */     //   276: ifeq -> 301
/*     */     //   279: iload #19
/*     */     //   281: i2d
/*     */     //   282: fload #12
/*     */     //   284: f2d
/*     */     //   285: ldc2_w 20.0
/*     */     //   288: ddiv
/*     */     //   289: dadd
/*     */     //   290: invokestatic sin : (D)D
/*     */     //   293: ldc2_w 0.03
/*     */     //   296: dmul
/*     */     //   297: d2f
/*     */     //   298: goto -> 304
/*     */     //   301: ldc_w -0.03
/*     */     //   304: fstore #20
/*     */     //   306: fconst_0
/*     */     //   307: fload #20
/*     */     //   309: fconst_0
/*     */     //   310: invokestatic glTranslatef : (FFF)V
/*     */     //   313: invokestatic glPushMatrix : ()V
/*     */     //   316: iconst_1
/*     */     //   317: invokestatic glDepthMask : (Z)V
/*     */     //   320: sipush #2896
/*     */     //   323: invokestatic glEnable : (I)V
/*     */     //   326: sipush #3042
/*     */     //   329: invokestatic glDisable : (I)V
/*     */     //   332: fconst_1
/*     */     //   333: fconst_1
/*     */     //   334: fconst_1
/*     */     //   335: fconst_1
/*     */     //   336: invokestatic glColor4f : (FFFF)V
/*     */     //   339: aload #11
/*     */     //   341: invokevirtual isAnimatingTurn : ()Z
/*     */     //   344: ifeq -> 383
/*     */     //   347: aload #11
/*     */     //   349: invokevirtual animationTicksLeft : ()I
/*     */     //   352: i2f
/*     */     //   353: fload #8
/*     */     //   355: fsub
/*     */     //   356: f2d
/*     */     //   357: aload #11
/*     */     //   359: invokevirtual animationTicksTotal : ()I
/*     */     //   362: i2d
/*     */     //   363: ddiv
/*     */     //   364: dstore #21
/*     */     //   366: bipush #90
/*     */     //   368: i2d
/*     */     //   369: dload #21
/*     */     //   371: dmul
/*     */     //   372: dconst_0
/*     */     //   373: aload #11
/*     */     //   375: invokevirtual turnAxis : ()I
/*     */     //   378: i2d
/*     */     //   379: dconst_0
/*     */     //   380: invokestatic glRotated : (DDDD)V
/*     */     //   383: aload #11
/*     */     //   385: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   388: astore #23
/*     */     //   390: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   393: aload #23
/*     */     //   395: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   398: ifeq -> 417
/*     */     //   401: ldc -90.0
/*     */     //   403: fconst_0
/*     */     //   404: fconst_1
/*     */     //   405: fconst_0
/*     */     //   406: invokestatic glRotatef : (FFFF)V
/*     */     //   409: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   412: astore #24
/*     */     //   414: goto -> 476
/*     */     //   417: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   420: aload #23
/*     */     //   422: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   425: ifeq -> 444
/*     */     //   428: ldc 180.0
/*     */     //   430: fconst_0
/*     */     //   431: fconst_1
/*     */     //   432: fconst_0
/*     */     //   433: invokestatic glRotatef : (FFFF)V
/*     */     //   436: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   439: astore #24
/*     */     //   441: goto -> 476
/*     */     //   444: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   447: aload #23
/*     */     //   449: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   452: ifeq -> 471
/*     */     //   455: ldc 90.0
/*     */     //   457: fconst_0
/*     */     //   458: fconst_1
/*     */     //   459: fconst_0
/*     */     //   460: invokestatic glRotatef : (FFFF)V
/*     */     //   463: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   466: astore #24
/*     */     //   468: goto -> 476
/*     */     //   471: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   474: astore #24
/*     */     //   476: ldc_w -0.5
/*     */     //   479: ldc_w -0.5
/*     */     //   482: ldc_w -0.5
/*     */     //   485: invokestatic glTranslatef : (FFF)V
/*     */     //   488: iload #19
/*     */     //   490: i2d
/*     */     //   491: fload #12
/*     */     //   493: f2d
/*     */     //   494: ldc2_w 20.0
/*     */     //   497: ddiv
/*     */     //   498: dadd
/*     */     //   499: dstore #25
/*     */     //   501: aload_0
/*     */     //   502: aload #11
/*     */     //   504: dload #25
/*     */     //   506: aload_0
/*     */     //   507: invokevirtual renderChassis$default$3 : ()Z
/*     */     //   510: invokevirtual renderChassis : (Lli/cil/oc/common/tileentity/Robot;DZ)V
/*     */     //   513: aload #11
/*     */     //   515: invokevirtual renderingErrored : ()Z
/*     */     //   518: ifne -> 1507
/*     */     //   521: dload_2
/*     */     //   522: dload_2
/*     */     //   523: dmul
/*     */     //   524: dload #4
/*     */     //   526: dload #4
/*     */     //   528: dmul
/*     */     //   529: dadd
/*     */     //   530: dload #6
/*     */     //   532: dload #6
/*     */     //   534: dmul
/*     */     //   535: dadd
/*     */     //   536: sipush #576
/*     */     //   539: i2d
/*     */     //   540: dcmpg
/*     */     //   541: ifge -> 1507
/*     */     //   544: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   547: aload #11
/*     */     //   549: iconst_0
/*     */     //   550: invokevirtual func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   553: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   556: astore #27
/*     */     //   558: aload #27
/*     */     //   560: instanceof scala/Some
/*     */     //   563: ifeq -> 1160
/*     */     //   566: aload #27
/*     */     //   568: checkcast scala/Some
/*     */     //   571: astore #28
/*     */     //   573: aload #28
/*     */     //   575: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   578: checkcast net/minecraft/item/ItemStack
/*     */     //   581: astore #29
/*     */     //   583: getstatic net/minecraft/client/renderer/entity/RenderManager.field_78727_a : Lnet/minecraft/client/renderer/entity/RenderManager;
/*     */     //   586: getfield field_78721_f : Lnet/minecraft/client/renderer/ItemRenderer;
/*     */     //   589: astore #31
/*     */     //   591: ldc_w 1048575
/*     */     //   594: invokestatic glPushAttrib : (I)V
/*     */     //   597: invokestatic glPushMatrix : ()V
/*     */     //   600: sipush #2884
/*     */     //   603: invokestatic glDisable : (I)V
/*     */     //   606: ldc_w 32826
/*     */     //   609: invokestatic glEnable : (I)V
/*     */     //   612: fconst_1
/*     */     //   613: ldc -1.0
/*     */     //   615: ldc -1.0
/*     */     //   617: invokestatic glScalef : (FFF)V
/*     */     //   620: fconst_0
/*     */     //   621: ldc_w -0.5078125
/*     */     //   624: ldc_w -0.5
/*     */     //   627: invokestatic glTranslatef : (FFF)V
/*     */     //   630: aload #11
/*     */     //   632: invokevirtual isAnimatingSwing : ()Z
/*     */     //   635: ifeq -> 710
/*     */     //   638: bipush #10
/*     */     //   640: istore #33
/*     */     //   642: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   645: aload #11
/*     */     //   647: invokevirtual animationTicksTotal : ()I
/*     */     //   650: iload #33
/*     */     //   652: idiv
/*     */     //   653: iconst_1
/*     */     //   654: invokevirtual max : (II)I
/*     */     //   657: istore #34
/*     */     //   659: aload #11
/*     */     //   661: invokevirtual animationTicksTotal : ()I
/*     */     //   664: iload #34
/*     */     //   666: idiv
/*     */     //   667: istore #35
/*     */     //   669: aload #11
/*     */     //   671: invokevirtual animationTicksLeft : ()I
/*     */     //   674: i2f
/*     */     //   675: fload #8
/*     */     //   677: fsub
/*     */     //   678: f2d
/*     */     //   679: iload #35
/*     */     //   681: i2d
/*     */     //   682: ddiv
/*     */     //   683: dstore #36
/*     */     //   685: dload #36
/*     */     //   687: dload #36
/*     */     //   689: d2i
/*     */     //   690: i2d
/*     */     //   691: dsub
/*     */     //   692: ldc2_w 3.141592653589793
/*     */     //   695: dmul
/*     */     //   696: invokestatic sin : (D)D
/*     */     //   699: bipush #45
/*     */     //   701: i2d
/*     */     //   702: dmul
/*     */     //   703: d2f
/*     */     //   704: fconst_1
/*     */     //   705: fconst_0
/*     */     //   706: fconst_0
/*     */     //   707: invokestatic glRotatef : (FFFF)V
/*     */     //   710: aload #29
/*     */     //   712: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   715: invokestatic getItemRenderer : (Lnet/minecraft/item/ItemStack;Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;)Lnet/minecraftforge/client/IItemRenderer;
/*     */     //   718: astore #38
/*     */     //   720: aload #38
/*     */     //   722: ifnull -> 747
/*     */     //   725: aload #38
/*     */     //   727: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   730: aload #29
/*     */     //   732: getstatic net/minecraftforge/client/IItemRenderer$ItemRendererHelper.BLOCK_3D : Lnet/minecraftforge/client/IItemRenderer$ItemRendererHelper;
/*     */     //   735: invokeinterface shouldUseRenderHelper : (Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;Lnet/minecraft/item/ItemStack;Lnet/minecraftforge/client/IItemRenderer$ItemRendererHelper;)Z
/*     */     //   740: ifeq -> 747
/*     */     //   743: iconst_1
/*     */     //   744: goto -> 748
/*     */     //   747: iconst_0
/*     */     //   748: istore #39
/*     */     //   750: iload #39
/*     */     //   752: ifne -> 783
/*     */     //   755: aload #29
/*     */     //   757: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   760: instanceof net/minecraft/item/ItemBlock
/*     */     //   763: ifeq -> 830
/*     */     //   766: aload #29
/*     */     //   768: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   771: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*     */     //   774: invokevirtual func_149645_b : ()I
/*     */     //   777: invokestatic func_147739_a : (I)Z
/*     */     //   780: ifeq -> 830
/*     */     //   783: ldc_w 0.375
/*     */     //   786: fstore #40
/*     */     //   788: fconst_0
/*     */     //   789: ldc_w 0.1875
/*     */     //   792: ldc_w -0.3125
/*     */     //   795: invokestatic glTranslatef : (FFF)V
/*     */     //   798: ldc_w 20.0
/*     */     //   801: fconst_1
/*     */     //   802: fconst_0
/*     */     //   803: fconst_0
/*     */     //   804: invokestatic glRotatef : (FFFF)V
/*     */     //   807: ldc_w 45.0
/*     */     //   810: fconst_0
/*     */     //   811: fconst_1
/*     */     //   812: fconst_0
/*     */     //   813: invokestatic glRotatef : (FFFF)V
/*     */     //   816: fload #40
/*     */     //   818: fneg
/*     */     //   819: fload #40
/*     */     //   821: fneg
/*     */     //   822: fload #40
/*     */     //   824: invokestatic glScalef : (FFF)V
/*     */     //   827: goto -> 1047
/*     */     //   830: aload #29
/*     */     //   832: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   835: getstatic net/minecraft/init/Items.field_151031_f : Lnet/minecraft/item/ItemBow;
/*     */     //   838: astore #41
/*     */     //   840: dup
/*     */     //   841: ifnonnull -> 853
/*     */     //   844: pop
/*     */     //   845: aload #41
/*     */     //   847: ifnull -> 861
/*     */     //   850: goto -> 914
/*     */     //   853: aload #41
/*     */     //   855: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   858: ifeq -> 914
/*     */     //   861: ldc_w 0.375
/*     */     //   864: fstore #42
/*     */     //   866: fconst_0
/*     */     //   867: ldc 0.2
/*     */     //   869: ldc -0.2
/*     */     //   871: invokestatic glTranslatef : (FFF)V
/*     */     //   874: ldc_w -10.0
/*     */     //   877: fconst_0
/*     */     //   878: fconst_1
/*     */     //   879: fconst_0
/*     */     //   880: invokestatic glRotatef : (FFFF)V
/*     */     //   883: fload #42
/*     */     //   885: fload #42
/*     */     //   887: fneg
/*     */     //   888: fload #42
/*     */     //   890: invokestatic glScalef : (FFF)V
/*     */     //   893: ldc_w -20.0
/*     */     //   896: fconst_1
/*     */     //   897: fconst_0
/*     */     //   898: fconst_0
/*     */     //   899: invokestatic glRotatef : (FFFF)V
/*     */     //   902: ldc_w 45.0
/*     */     //   905: fconst_0
/*     */     //   906: fconst_1
/*     */     //   907: fconst_0
/*     */     //   908: invokestatic glRotatef : (FFFF)V
/*     */     //   911: goto -> 1047
/*     */     //   914: aload #29
/*     */     //   916: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   919: invokevirtual func_77662_d : ()Z
/*     */     //   922: ifeq -> 996
/*     */     //   925: ldc_w 0.375
/*     */     //   928: fstore #43
/*     */     //   930: aload #29
/*     */     //   932: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   935: invokevirtual func_77629_n_ : ()Z
/*     */     //   938: ifeq -> 957
/*     */     //   941: ldc 180.0
/*     */     //   943: fconst_0
/*     */     //   944: fconst_0
/*     */     //   945: fconst_1
/*     */     //   946: invokestatic glRotatef : (FFFF)V
/*     */     //   949: fconst_0
/*     */     //   950: ldc_w -0.125
/*     */     //   953: fconst_0
/*     */     //   954: invokestatic glTranslatef : (FFF)V
/*     */     //   957: fconst_0
/*     */     //   958: ldc_w 0.1
/*     */     //   961: fconst_0
/*     */     //   962: invokestatic glTranslatef : (FFF)V
/*     */     //   965: fload #43
/*     */     //   967: fload #43
/*     */     //   969: fneg
/*     */     //   970: fload #43
/*     */     //   972: invokestatic glScalef : (FFF)V
/*     */     //   975: ldc_w -100.0
/*     */     //   978: fconst_1
/*     */     //   979: fconst_0
/*     */     //   980: fconst_0
/*     */     //   981: invokestatic glRotatef : (FFFF)V
/*     */     //   984: ldc_w 45.0
/*     */     //   987: fconst_0
/*     */     //   988: fconst_1
/*     */     //   989: fconst_0
/*     */     //   990: invokestatic glRotatef : (FFFF)V
/*     */     //   993: goto -> 1047
/*     */     //   996: ldc_w 0.375
/*     */     //   999: fstore #44
/*     */     //   1001: ldc 0.25
/*     */     //   1003: ldc_w 0.1875
/*     */     //   1006: ldc_w -0.1875
/*     */     //   1009: invokestatic glTranslatef : (FFF)V
/*     */     //   1012: fload #44
/*     */     //   1014: fload #44
/*     */     //   1016: fload #44
/*     */     //   1018: invokestatic glScalef : (FFF)V
/*     */     //   1021: ldc_w 60.0
/*     */     //   1024: fconst_0
/*     */     //   1025: fconst_0
/*     */     //   1026: fconst_1
/*     */     //   1027: invokestatic glRotatef : (FFFF)V
/*     */     //   1030: ldc -90.0
/*     */     //   1032: fconst_1
/*     */     //   1033: fconst_0
/*     */     //   1034: fconst_0
/*     */     //   1035: invokestatic glRotatef : (FFFF)V
/*     */     //   1038: ldc_w 20.0
/*     */     //   1041: fconst_0
/*     */     //   1042: fconst_0
/*     */     //   1043: fconst_1
/*     */     //   1044: invokestatic glRotatef : (FFFF)V
/*     */     //   1047: invokestatic getRenderPass : ()I
/*     */     //   1050: istore #45
/*     */     //   1052: aload #29
/*     */     //   1054: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   1057: invokevirtual func_77623_v : ()Z
/*     */     //   1060: ifeq -> 1141
/*     */     //   1063: aload #29
/*     */     //   1065: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   1068: aload #29
/*     */     //   1070: invokevirtual func_77960_j : ()I
/*     */     //   1073: invokevirtual getRenderPasses : (I)I
/*     */     //   1076: istore #46
/*     */     //   1078: iload #45
/*     */     //   1080: iload #46
/*     */     //   1082: if_icmpge -> 1095
/*     */     //   1085: aload_0
/*     */     //   1086: aload #29
/*     */     //   1088: aload #31
/*     */     //   1090: iload #45
/*     */     //   1092: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$renderPass$1 : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/ItemRenderer;I)V
/*     */     //   1095: iload #45
/*     */     //   1097: iconst_1
/*     */     //   1098: if_icmpne -> 1192
/*     */     //   1101: iload #46
/*     */     //   1103: iconst_2
/*     */     //   1104: if_icmple -> 1192
/*     */     //   1107: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   1110: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1113: iconst_2
/*     */     //   1114: invokevirtual intWrapper : (I)I
/*     */     //   1117: iload #46
/*     */     //   1119: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*     */     //   1122: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$1
/*     */     //   1125: dup
/*     */     //   1126: aload #29
/*     */     //   1128: aload #31
/*     */     //   1130: iload #45
/*     */     //   1132: invokespecial <init> : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/ItemRenderer;I)V
/*     */     //   1135: invokevirtual foreach$mVc$sp : (Lscala/Function1;)V
/*     */     //   1138: goto -> 1192
/*     */     //   1141: iload #45
/*     */     //   1143: iconst_0
/*     */     //   1144: if_icmpne -> 1192
/*     */     //   1147: aload_0
/*     */     //   1148: aload #29
/*     */     //   1150: aload #31
/*     */     //   1152: iload #45
/*     */     //   1154: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$renderPass$1 : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/ItemRenderer;I)V
/*     */     //   1157: goto -> 1192
/*     */     //   1160: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1163: astore #30
/*     */     //   1165: goto -> 1215
/*     */     //   1168: astore #32
/*     */     //   1170: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   1173: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   1176: ldc_w 'Failed rendering equipped item.'
/*     */     //   1179: aload #32
/*     */     //   1181: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1186: aload #11
/*     */     //   1188: iconst_1
/*     */     //   1189: invokevirtual renderingErrored_$eq : (Z)V
/*     */     //   1192: sipush #2884
/*     */     //   1195: invokestatic glEnable : (I)V
/*     */     //   1198: ldc_w 32826
/*     */     //   1201: invokestatic glDisable : (I)V
/*     */     //   1204: invokestatic glPopMatrix : ()V
/*     */     //   1207: invokestatic glPopAttrib : ()V
/*     */     //   1210: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1213: astore #30
/*     */     //   1215: invokestatic getRenderPass : ()I
/*     */     //   1218: iconst_0
/*     */     //   1219: if_icmpne -> 1507
/*     */     //   1222: invokestatic zero : ()Lscala/runtime/ObjectRef;
/*     */     //   1225: astore #47
/*     */     //   1227: invokestatic zero : ()Lscala/runtime/ObjectRef;
/*     */     //   1230: astore #48
/*     */     //   1232: invokestatic zero : ()Lscala/runtime/ObjectRef;
/*     */     //   1235: astore #49
/*     */     //   1237: aload #11
/*     */     //   1239: invokevirtual componentSlots : ()Lscala/collection/immutable/Range;
/*     */     //   1242: aload #11
/*     */     //   1244: invokevirtual containerSlots : ()Lscala/collection/immutable/Range$Inclusive;
/*     */     //   1247: getstatic scala/collection/immutable/IndexedSeq$.MODULE$ : Lscala/collection/immutable/IndexedSeq$;
/*     */     //   1250: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   1253: invokevirtual $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   1256: checkcast scala/collection/TraversableLike
/*     */     //   1259: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$4
/*     */     //   1262: dup
/*     */     //   1263: aload #11
/*     */     //   1265: invokespecial <init> : (Lli/cil/oc/common/tileentity/Robot;)V
/*     */     //   1268: getstatic scala/collection/immutable/IndexedSeq$.MODULE$ : Lscala/collection/immutable/IndexedSeq$;
/*     */     //   1271: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   1274: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   1279: checkcast scala/collection/TraversableLike
/*     */     //   1282: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$1
/*     */     //   1285: dup
/*     */     //   1286: invokespecial <init> : ()V
/*     */     //   1289: getstatic scala/collection/immutable/IndexedSeq$.MODULE$ : Lscala/collection/immutable/IndexedSeq$;
/*     */     //   1292: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   1295: invokeinterface collect : (Lscala/PartialFunction;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   1300: checkcast scala/collection/immutable/IndexedSeq
/*     */     //   1303: astore #50
/*     */     //   1305: aload #50
/*     */     //   1307: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$2
/*     */     //   1310: dup
/*     */     //   1311: invokespecial <init> : ()V
/*     */     //   1314: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1319: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$3
/*     */     //   1322: dup
/*     */     //   1323: aload #11
/*     */     //   1325: aload #47
/*     */     //   1327: aload #48
/*     */     //   1329: aload #49
/*     */     //   1331: aload #9
/*     */     //   1333: invokespecial <init> : (Lli/cil/oc/common/tileentity/Robot;Lscala/runtime/ObjectRef;Lscala/runtime/ObjectRef;Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)V
/*     */     //   1336: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1341: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1344: aload_0
/*     */     //   1345: aload #49
/*     */     //   1347: aload #9
/*     */     //   1349: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1 : (Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)[Lscala/Tuple2;
/*     */     //   1352: checkcast [Ljava/lang/Object;
/*     */     //   1355: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   1358: aconst_null
/*     */     //   1359: invokeinterface indexOf : (Ljava/lang/Object;)I
/*     */     //   1364: invokestatic create : (I)Lscala/runtime/IntRef;
/*     */     //   1367: astore #51
/*     */     //   1369: aload_0
/*     */     //   1370: aload #48
/*     */     //   1372: aload #9
/*     */     //   1374: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$wildcardRenderers$1 : (Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)Lscala/collection/mutable/Buffer;
/*     */     //   1377: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$4
/*     */     //   1380: dup
/*     */     //   1381: aload #51
/*     */     //   1383: invokespecial <init> : (Lscala/runtime/IntRef;)V
/*     */     //   1386: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1391: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$5
/*     */     //   1394: dup
/*     */     //   1395: aload #49
/*     */     //   1397: aload #51
/*     */     //   1399: aload #9
/*     */     //   1401: invokespecial <init> : (Lscala/runtime/ObjectRef;Lscala/runtime/IntRef;Lscala/runtime/VolatileByteRef;)V
/*     */     //   1404: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1409: getstatic scala/runtime/ZippedTraversable2$.MODULE$ : Lscala/runtime/ZippedTraversable2$;
/*     */     //   1412: new scala/runtime/Tuple2Zipped
/*     */     //   1415: dup
/*     */     //   1416: getstatic scala/runtime/Tuple2Zipped$Ops$.MODULE$ : Lscala/runtime/Tuple2Zipped$Ops$;
/*     */     //   1419: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1422: new scala/Tuple2
/*     */     //   1425: dup
/*     */     //   1426: aload_0
/*     */     //   1427: aload #49
/*     */     //   1429: aload #9
/*     */     //   1431: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1 : (Lscala/runtime/ObjectRef;Lscala/runtime/VolatileByteRef;)[Lscala/Tuple2;
/*     */     //   1434: aload_0
/*     */     //   1435: invokevirtual li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints : ()[Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;
/*     */     //   1438: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1441: invokevirtual tuple2ToZippedOps : (Lscala/Tuple2;)Lscala/Tuple2;
/*     */     //   1444: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$6
/*     */     //   1447: dup
/*     */     //   1448: invokespecial <init> : ()V
/*     */     //   1451: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$7
/*     */     //   1454: dup
/*     */     //   1455: invokespecial <init> : ()V
/*     */     //   1458: invokevirtual zipped$extension : (Lscala/Tuple2;Lscala/Function1;Lscala/Function1;)Lscala/Tuple2;
/*     */     //   1461: invokespecial <init> : (Lscala/Tuple2;)V
/*     */     //   1464: invokevirtual zippedTraversable2ToTraversable : (Lscala/runtime/ZippedTraversable2;)Lscala/collection/Traversable;
/*     */     //   1467: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$8
/*     */     //   1470: dup
/*     */     //   1471: invokespecial <init> : ()V
/*     */     //   1474: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1479: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$9
/*     */     //   1482: dup
/*     */     //   1483: invokespecial <init> : ()V
/*     */     //   1486: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1491: new li/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$10
/*     */     //   1494: dup
/*     */     //   1495: fload #8
/*     */     //   1497: aload #11
/*     */     //   1499: invokespecial <init> : (FLli/cil/oc/common/tileentity/Robot;)V
/*     */     //   1502: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1507: invokestatic glPopMatrix : ()V
/*     */     //   1510: aload #11
/*     */     //   1512: invokevirtual name : ()Ljava/lang/String;
/*     */     //   1515: astore #52
/*     */     //   1517: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   1520: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   1523: invokevirtual robotLabels : ()Z
/*     */     //   1526: ifeq -> 1835
/*     */     //   1529: invokestatic getRenderPass : ()I
/*     */     //   1532: iconst_1
/*     */     //   1533: if_icmpne -> 1835
/*     */     //   1536: aload #52
/*     */     //   1538: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*     */     //   1541: ifne -> 1835
/*     */     //   1544: dload_2
/*     */     //   1545: dload_2
/*     */     //   1546: dmul
/*     */     //   1547: dload #4
/*     */     //   1549: dload #4
/*     */     //   1551: dmul
/*     */     //   1552: dadd
/*     */     //   1553: dload #6
/*     */     //   1555: dload #6
/*     */     //   1557: dmul
/*     */     //   1558: dadd
/*     */     //   1559: getstatic net/minecraft/client/renderer/entity/RendererLivingEntity.NAME_TAG_RANGE : F
/*     */     //   1562: f2d
/*     */     //   1563: dcmpg
/*     */     //   1564: ifge -> 1835
/*     */     //   1567: invokestatic glPushMatrix : ()V
/*     */     //   1570: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   1573: astore #53
/*     */     //   1575: aload_0
/*     */     //   1576: invokevirtual func_147498_b : ()Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   1579: astore #54
/*     */     //   1581: ldc_w 0.026666667
/*     */     //   1584: fstore #55
/*     */     //   1586: aload #54
/*     */     //   1588: aload #52
/*     */     //   1590: invokevirtual func_78256_a : (Ljava/lang/String;)I
/*     */     //   1593: istore #56
/*     */     //   1595: iload #56
/*     */     //   1597: iconst_2
/*     */     //   1598: idiv
/*     */     //   1599: istore #57
/*     */     //   1601: dconst_0
/*     */     //   1602: ldc2_w 0.8
/*     */     //   1605: dconst_0
/*     */     //   1606: invokestatic glTranslated : (DDD)V
/*     */     //   1609: fconst_0
/*     */     //   1610: fconst_1
/*     */     //   1611: fconst_0
/*     */     //   1612: invokestatic glNormal3f : (FFF)V
/*     */     //   1615: fconst_1
/*     */     //   1616: fconst_1
/*     */     //   1617: fconst_1
/*     */     //   1618: invokestatic glColor3f : (FFF)V
/*     */     //   1621: aload_0
/*     */     //   1622: getfield field_147501_a : Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;
/*     */     //   1625: getfield field_147562_h : F
/*     */     //   1628: fneg
/*     */     //   1629: fconst_0
/*     */     //   1630: fconst_1
/*     */     //   1631: fconst_0
/*     */     //   1632: invokestatic glRotatef : (FFFF)V
/*     */     //   1635: aload_0
/*     */     //   1636: getfield field_147501_a : Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;
/*     */     //   1639: getfield field_147563_i : F
/*     */     //   1642: fconst_1
/*     */     //   1643: fconst_0
/*     */     //   1644: fconst_0
/*     */     //   1645: invokestatic glRotatef : (FFFF)V
/*     */     //   1648: fload #55
/*     */     //   1650: fneg
/*     */     //   1651: fload #55
/*     */     //   1653: fneg
/*     */     //   1654: fload #55
/*     */     //   1656: invokestatic glScalef : (FFF)V
/*     */     //   1659: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   1662: invokevirtual makeItBlend : ()V
/*     */     //   1665: iconst_0
/*     */     //   1666: invokestatic glDepthMask : (Z)V
/*     */     //   1669: sipush #2896
/*     */     //   1672: invokestatic glDisable : (I)V
/*     */     //   1675: sipush #3553
/*     */     //   1678: invokestatic glDisable : (I)V
/*     */     //   1681: aload #53
/*     */     //   1683: invokevirtual func_78382_b : ()V
/*     */     //   1686: aload #53
/*     */     //   1688: fconst_0
/*     */     //   1689: fconst_0
/*     */     //   1690: fconst_0
/*     */     //   1691: ldc 0.5
/*     */     //   1693: invokevirtual func_78369_a : (FFFF)V
/*     */     //   1696: aload #53
/*     */     //   1698: iload #57
/*     */     //   1700: ineg
/*     */     //   1701: iconst_1
/*     */     //   1702: isub
/*     */     //   1703: i2d
/*     */     //   1704: ldc2_w -1.0
/*     */     //   1707: dconst_0
/*     */     //   1708: invokevirtual func_78377_a : (DDD)V
/*     */     //   1711: aload #53
/*     */     //   1713: iload #57
/*     */     //   1715: ineg
/*     */     //   1716: iconst_1
/*     */     //   1717: isub
/*     */     //   1718: i2d
/*     */     //   1719: ldc2_w 8.0
/*     */     //   1722: dconst_0
/*     */     //   1723: invokevirtual func_78377_a : (DDD)V
/*     */     //   1726: aload #53
/*     */     //   1728: iload #57
/*     */     //   1730: iconst_1
/*     */     //   1731: iadd
/*     */     //   1732: i2d
/*     */     //   1733: ldc2_w 8.0
/*     */     //   1736: dconst_0
/*     */     //   1737: invokevirtual func_78377_a : (DDD)V
/*     */     //   1740: aload #53
/*     */     //   1742: iload #57
/*     */     //   1744: iconst_1
/*     */     //   1745: iadd
/*     */     //   1746: i2d
/*     */     //   1747: ldc2_w -1.0
/*     */     //   1750: dconst_0
/*     */     //   1751: invokevirtual func_78377_a : (DDD)V
/*     */     //   1754: aload #53
/*     */     //   1756: invokevirtual func_78381_a : ()I
/*     */     //   1759: pop
/*     */     //   1760: sipush #3553
/*     */     //   1763: invokestatic glEnable : (I)V
/*     */     //   1766: aload #54
/*     */     //   1768: new scala/collection/mutable/StringBuilder
/*     */     //   1771: dup
/*     */     //   1772: invokespecial <init> : ()V
/*     */     //   1775: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*     */     //   1778: invokevirtual isItTime : ()Z
/*     */     //   1781: ifeq -> 1793
/*     */     //   1784: getstatic net/minecraft/util/EnumChatFormatting.OBFUSCATED : Lnet/minecraft/util/EnumChatFormatting;
/*     */     //   1787: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1790: goto -> 1796
/*     */     //   1793: ldc_w ''
/*     */     //   1796: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1799: aload #52
/*     */     //   1801: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1804: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1807: iload #57
/*     */     //   1809: ineg
/*     */     //   1810: iconst_0
/*     */     //   1811: iconst_m1
/*     */     //   1812: invokevirtual func_78276_b : (Ljava/lang/String;III)I
/*     */     //   1815: pop
/*     */     //   1816: iconst_1
/*     */     //   1817: invokestatic glDepthMask : (Z)V
/*     */     //   1820: sipush #2896
/*     */     //   1823: invokestatic glEnable : (I)V
/*     */     //   1826: sipush #3042
/*     */     //   1829: invokestatic glDisable : (I)V
/*     */     //   1832: invokestatic glPopMatrix : ()V
/*     */     //   1835: invokestatic glPopMatrix : ()V
/*     */     //   1838: invokestatic glPopAttrib : ()V
/*     */     //   1841: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   1844: new scala/collection/mutable/StringBuilder
/*     */     //   1847: dup
/*     */     //   1848: invokespecial <init> : ()V
/*     */     //   1851: aload_0
/*     */     //   1852: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1855: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   1858: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1861: ldc_w '.renderTileEntityAt: leaving'
/*     */     //   1864: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1867: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1870: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   1873: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #280	-> 0
/*     */     //   #281	-> 6
/*     */     //   #283	-> 38
/*     */     //   #284	-> 44
/*     */     //   #285	-> 51
/*     */     //   #287	-> 66
/*     */     //   #288	-> 69
/*     */     //   #289	-> 75
/*     */     //   #294	-> 95
/*     */     //   #295	-> 125
/*     */     //   #298	-> 173
/*     */     //   #299	-> 181
/*     */     //   #300	-> 200
/*     */     //   #301	-> 213
/*     */     //   #302	-> 226
/*     */     //   #303	-> 239
/*     */     //   #306	-> 260
/*     */     //   #308	-> 271
/*     */     //   #309	-> 301
/*     */     //   #307	-> 304
/*     */     //   #310	-> 306
/*     */     //   #312	-> 313
/*     */     //   #314	-> 316
/*     */     //   #315	-> 320
/*     */     //   #316	-> 326
/*     */     //   #317	-> 332
/*     */     //   #319	-> 339
/*     */     //   #320	-> 347
/*     */     //   #321	-> 366
/*     */     //   #324	-> 383
/*     */     //   #325	-> 390
/*     */     //   #326	-> 417
/*     */     //   #327	-> 444
/*     */     //   #328	-> 471
/*     */     //   #331	-> 476
/*     */     //   #333	-> 488
/*     */     //   #334	-> 501
/*     */     //   #336	-> 513
/*     */     //   #337	-> 544
/*     */     //   #338	-> 558
/*     */     //   #339	-> 583
/*     */     //   #341	-> 591
/*     */     //   #342	-> 597
/*     */     //   #347	-> 600
/*     */     //   #348	-> 606
/*     */     //   #350	-> 612
/*     */     //   #351	-> 620
/*     */     //   #353	-> 630
/*     */     //   #354	-> 638
/*     */     //   #355	-> 642
/*     */     //   #356	-> 659
/*     */     //   #357	-> 669
/*     */     //   #358	-> 685
/*     */     //   #361	-> 710
/*     */     //   #362	-> 720
/*     */     //   #364	-> 750
/*     */     //   #365	-> 783
/*     */     //   #366	-> 788
/*     */     //   #367	-> 798
/*     */     //   #368	-> 807
/*     */     //   #369	-> 816
/*     */     //   #371	-> 830
/*     */     //   #372	-> 861
/*     */     //   #373	-> 866
/*     */     //   #374	-> 874
/*     */     //   #375	-> 883
/*     */     //   #376	-> 893
/*     */     //   #377	-> 902
/*     */     //   #379	-> 914
/*     */     //   #380	-> 925
/*     */     //   #381	-> 930
/*     */     //   #382	-> 941
/*     */     //   #383	-> 949
/*     */     //   #385	-> 957
/*     */     //   #386	-> 965
/*     */     //   #387	-> 975
/*     */     //   #388	-> 984
/*     */     //   #391	-> 996
/*     */     //   #392	-> 1001
/*     */     //   #393	-> 1012
/*     */     //   #394	-> 1021
/*     */     //   #395	-> 1030
/*     */     //   #396	-> 1038
/*     */     //   #399	-> 1047
/*     */     //   #409	-> 1052
/*     */     //   #410	-> 1063
/*     */     //   #411	-> 1078
/*     */     //   #412	-> 1085
/*     */     //   #416	-> 1095
/*     */     //   #417	-> 1110
/*     */     //   #422	-> 1141
/*     */     //   #423	-> 1147
/*     */     //   #435	-> 1160
/*     */     //   #427	-> 1168
/*     */     //   #343	-> 1168
/*     */     //   #428	-> 1170
/*     */     //   #429	-> 1186
/*     */     //   #431	-> 1192
/*     */     //   #432	-> 1198
/*     */     //   #433	-> 1204
/*     */     //   #434	-> 1207
/*     */     //   #338	-> 1213
/*     */     //   #438	-> 1215
/*     */     //   #439	-> 1225
/*     */     //   #440	-> 1230
/*     */     //   #441	-> 1235
/*     */     //   #443	-> 1237
/*     */     //   #444	-> 1282
/*     */     //   #443	-> 1303
/*     */     //   #446	-> 1305
/*     */     //   #456	-> 1341
/*     */     //   #457	-> 1369
/*     */     //   #462	-> 1409
/*     */     //   #476	-> 1507
/*     */     //   #478	-> 1510
/*     */     //   #479	-> 1517
/*     */     //   #480	-> 1567
/*     */     //   #483	-> 1570
/*     */     //   #484	-> 1575
/*     */     //   #485	-> 1581
/*     */     //   #486	-> 1586
/*     */     //   #487	-> 1595
/*     */     //   #489	-> 1601
/*     */     //   #490	-> 1609
/*     */     //   #491	-> 1615
/*     */     //   #493	-> 1621
/*     */     //   #494	-> 1635
/*     */     //   #495	-> 1648
/*     */     //   #497	-> 1659
/*     */     //   #498	-> 1665
/*     */     //   #499	-> 1669
/*     */     //   #500	-> 1675
/*     */     //   #502	-> 1681
/*     */     //   #503	-> 1686
/*     */     //   #504	-> 1696
/*     */     //   #505	-> 1711
/*     */     //   #506	-> 1726
/*     */     //   #507	-> 1740
/*     */     //   #508	-> 1754
/*     */     //   #510	-> 1760
/*     */     //   #511	-> 1766
/*     */     //   #513	-> 1816
/*     */     //   #514	-> 1820
/*     */     //   #515	-> 1826
/*     */     //   #517	-> 1832
/*     */     //   #520	-> 1835
/*     */     //   #521	-> 1838
/*     */     //   #523	-> 1841
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1874	0	this	Lli/cil/oc/client/renderer/tileentity/RobotRenderer$;
/*     */     //   0	1874	1	entity	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   0	1874	2	x	D
/*     */     //   0	1874	4	y	D
/*     */     //   0	1874	6	z	D
/*     */     //   0	1874	8	f	F
/*     */     //   6	1867	9	bitmap$0	Lscala/runtime/VolatileByteRef;
/*     */     //   44	1829	10	proxy	Lli/cil/oc/common/tileentity/RobotProxy;
/*     */     //   51	1822	11	robot	Lli/cil/oc/common/tileentity/Robot;
/*     */     //   66	1807	12	worldTime	F
/*     */     //   200	60	14	remaining	D
/*     */     //   213	47	16	dx	I
/*     */     //   226	34	17	dy	I
/*     */     //   239	21	18	dz	I
/*     */     //   271	1602	19	timeJitter	I
/*     */     //   306	1567	20	hover	F
/*     */     //   366	17	21	remaining	D
/*     */     //   501	1372	25	offset	D
/*     */     //   583	1291	29	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   591	622	31	itemRenderer	Lnet/minecraft/client/renderer/ItemRenderer;
/*     */     //   642	68	33	wantedTicksPerCycle	I
/*     */     //   659	51	34	cycles	I
/*     */     //   669	41	35	ticksPerCycle	I
/*     */     //   685	25	36	remaining	D
/*     */     //   720	1154	38	customRenderer	Lnet/minecraftforge/client/IItemRenderer;
/*     */     //   750	1124	39	is3D	Z
/*     */     //   788	39	40	scale	F
/*     */     //   866	45	42	scale	F
/*     */     //   930	63	43	scale	F
/*     */     //   1001	46	44	scale	F
/*     */     //   1052	822	45	pass	I
/*     */     //   1078	796	46	passes	I
/*     */     //   1227	280	47	availableSlots$lzy	Lscala/runtime/ObjectRef;
/*     */     //   1232	275	48	wildcardRenderers$lzy	Lscala/runtime/ObjectRef;
/*     */     //   1237	270	49	slotMapping$lzy	Lscala/runtime/ObjectRef;
/*     */     //   1305	202	50	renderers	Lscala/collection/immutable/IndexedSeq;
/*     */     //   1369	138	51	firstEmpty	Lscala/runtime/IntRef;
/*     */     //   1517	356	52	name	Ljava/lang/String;
/*     */     //   1575	260	53	t	Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   1581	254	54	f	Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   1586	249	55	scale	F
/*     */     //   1595	240	56	width	I
/*     */     //   1601	234	57	halfWidth	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   600	1160	1168	finally
/*     */   }
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
/*     */   public final void li$cil$oc$client$renderer$tileentity$RobotRenderer$$renderPass$1(ItemStack stack$1, ItemRenderer itemRenderer$1, int pass$1) {
/* 401 */     int tint = stack$1.func_77973_b().func_82790_a(stack$1, pass$1);
/* 402 */     float r = (tint >> 16 & 0xFF) / 255.0F;
/* 403 */     float g = (tint >> 8 & 0xFF) / 255.0F;
/* 404 */     float b = (tint >> 0 & 0xFF) / 255.0F;
/* 405 */     GL11.glColor4f(r, g, b, 1.0F);
/* 406 */     itemRenderer$1.func_78443_a((EntityLivingBase)(Minecraft.func_71410_x()).field_71439_g, stack$1, pass$1);
/*     */   }
/*     */   
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$1
/*     */     extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$1;
/*     */     private final ItemRenderer itemRenderer$1;
/*     */     private final int pass$1;
/*     */     
/*     */     public final void apply(int fakePass) {
/* 417 */       apply$mcVI$sp(fakePass); } public RobotRenderer$$anonfun$renderTileEntityAt$1(ItemStack stack$1, ItemRenderer itemRenderer$1, int pass$1) {} public void apply$mcVI$sp(int fakePass) {
/* 418 */       RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$renderPass$1(this.stack$1, this.itemRenderer$1, this.pass$1);
/*     */     }
/*     */   }
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
/*     */   private final Set availableSlots$lzycompute$1(ObjectRef availableSlots$lzy$1, VolatileByteRef bitmap$0$1)
/*     */   {
/* 439 */     synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { availableSlots$lzy$1.elem = li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping().keys().to(scala.collection.mutable.Set$.MODULE$.canBuildFrom()); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (Set)availableSlots$lzy$1.elem; }  } public final Set li$cil$oc$client$renderer$tileentity$RobotRenderer$$availableSlots$1(ObjectRef availableSlots$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? availableSlots$lzycompute$1(availableSlots$lzy$1, bitmap$0$1) : (Set)availableSlots$lzy$1.elem; }
/* 440 */   private final Buffer wildcardRenderers$lzycompute$1(ObjectRef wildcardRenderers$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x2) == 0) { wildcardRenderers$lzy$1.elem = scala.collection.mutable.Buffer$.MODULE$.empty(); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x2); }  return (Buffer)wildcardRenderers$lzy$1.elem; }  } public final Buffer li$cil$oc$client$renderer$tileentity$RobotRenderer$$wildcardRenderers$1(ObjectRef wildcardRenderers$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x2) == 0) ? wildcardRenderers$lzycompute$1(wildcardRenderers$lzy$1, bitmap$0$1) : (Buffer)wildcardRenderers$lzy$1.elem; }
/* 441 */   private final Tuple2[] slotMapping$lzycompute$1(ObjectRef slotMapping$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x4) == 0) { slotMapping$lzy$1.elem = scala.Array$.MODULE$.fill((li$cil$oc$client$renderer$tileentity$RobotRenderer$$mountPoints()).length, (Function0)new RobotRenderer$$anonfun$slotMapping$lzycompute$1$1(), scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x4); }  return (Tuple2[])slotMapping$lzy$1.elem; }  } public final Tuple2[] li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(ObjectRef slotMapping$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x4) == 0) ? slotMapping$lzycompute$1(slotMapping$lzy$1, bitmap$0$1) : (Tuple2[])slotMapping$lzy$1.elem; } public final class RobotRenderer$$anonfun$slotMapping$lzycompute$1$1 extends AbstractFunction0<Tuple2<ItemStack, UpgradeRenderer>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<ItemStack, UpgradeRenderer> apply() { return null; }
/*     */      } public final class RobotRenderer$$anonfun$4 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Robot robot$1;
/* 443 */     public final ItemStack apply(int slot) { return this.robot$1.func_70301_a(slot); } public RobotRenderer$$anonfun$4(Robot robot$1) {} } public final class RobotRenderer$$anonfun$1 extends AbstractPartialFunction<ItemStack, Tuple2<ItemStack, UpgradeRenderer>> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends ItemStack, B1> B1 applyOrElse(ItemStack x1, Function1 default) { Object object;
/* 444 */       ItemStack itemStack = x1; if (itemStack != null && itemStack.func_77973_b() instanceof UpgradeRenderer) { object = new Tuple2(itemStack, itemStack.func_77973_b()); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(ItemStack x1) { boolean bool; ItemStack itemStack = x1; if (itemStack != null && itemStack.func_77973_b() instanceof UpgradeRenderer) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$2 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/* 446 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$3 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Robot robot$1; private final ObjectRef availableSlots$lzy$1; private final ObjectRef wildcardRenderers$lzy$1; private final ObjectRef slotMapping$lzy$1; private final VolatileByteRef bitmap$0$1; public final Object apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); UpgradeRenderer renderer = (UpgradeRenderer)tuple2._2();
/* 447 */         String preferredSlot = renderer.computePreferredMountPoint(stack, (Robot)this.robot$1, scala.collection.convert.WrapAsJava$.MODULE$.mutableSetAsJavaSet(RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$availableSlots$1(this.availableSlots$lzy$1, this.bitmap$0$1)));
/* 448 */         if (RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$availableSlots$1(this.availableSlots$lzy$1, this.bitmap$0$1).remove(preferredSlot)) {
/* 449 */           RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)[BoxesRunTime.unboxToInt(RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotNameMapping().apply(preferredSlot))] = new Tuple2(stack, renderer);
/*     */         } else {
/* 451 */           String str = "any"; if (preferredSlot == null) { if (str != null); } else if (preferredSlot.equals(str)) {  } 
/* 452 */         }  return new Tuple2(stack, renderer); }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public RobotRenderer$$anonfun$renderTileEntityAt$3(Robot robot$1, ObjectRef availableSlots$lzy$1, ObjectRef wildcardRenderers$lzy$1, ObjectRef slotMapping$lzy$1, VolatileByteRef bitmap$0$1) {} }
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$4 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef firstEmpty$1;
/* 457 */     public final boolean apply(Tuple2 entry) { return (this.firstEmpty$1.elem >= 0); } public RobotRenderer$$anonfun$renderTileEntityAt$4(IntRef firstEmpty$1) {} } public final class RobotRenderer$$anonfun$renderTileEntityAt$5 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef slotMapping$lzy$1; private final IntRef firstEmpty$1; private final VolatileByteRef bitmap$0$1; public RobotRenderer$$anonfun$renderTileEntityAt$5(ObjectRef slotMapping$lzy$1, IntRef firstEmpty$1, VolatileByteRef bitmap$0$1) {} public final void apply(Tuple2 entry) {
/* 458 */       RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)[this.firstEmpty$1.elem] = entry;
/* 459 */       this.firstEmpty$1.elem = scala.Predef$.MODULE$.refArrayOps((Object[])RobotRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RobotRenderer$$slotMapping$1(this.slotMapping$lzy$1, this.bitmap$0$1)).indexOf(null);
/*     */     } }
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$6 extends AbstractFunction1<Tuple2<ItemStack, UpgradeRenderer>[], ArrayOps<Tuple2<ItemStack, UpgradeRenderer>>> implements Serializable { public static final long serialVersionUID = 0L;
/* 462 */     public final ArrayOps<Tuple2<ItemStack, UpgradeRenderer>> apply(Tuple2[] xs) { return scala.Predef$.MODULE$.refArrayOps((Object[])xs); } } public final class RobotRenderer$$anonfun$renderTileEntityAt$7 extends AbstractFunction1<RobotRenderEvent.MountPoint[], ArrayOps<RobotRenderEvent.MountPoint>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayOps<RobotRenderEvent.MountPoint> apply(RobotRenderEvent.MountPoint[] xs) { return scala.Predef$.MODULE$.refArrayOps((Object[])xs); } } public final class RobotRenderer$$anonfun$renderTileEntityAt$8 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool; Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class RobotRenderer$$anonfun$renderTileEntityAt$9 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$5) { Tuple2 tuple2 = x$5; if (tuple2 != null) { Tuple2 info = (Tuple2)tuple2._1(); return !(info == null); }  throw new MatchError(tuple2); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class RobotRenderer$$anonfun$renderTileEntityAt$10 extends AbstractFunction1<Tuple2<Tuple2<ItemStack, UpgradeRenderer>, RobotRenderEvent.MountPoint>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final float f$1;
/*     */     private final Robot robot$1;
/*     */     
/*     */     public final void apply(Tuple2 x$6) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 138
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast scala/Tuple2
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   18: checkcast li/cil/oc/api/event/RobotRenderEvent$MountPoint
/*     */       //   21: astore #4
/*     */       //   23: aload_3
/*     */       //   24: astore #8
/*     */       //   26: aload #8
/*     */       //   28: ifnull -> 128
/*     */       //   31: aload #8
/*     */       //   33: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   36: checkcast net/minecraft/item/ItemStack
/*     */       //   39: astore #9
/*     */       //   41: aload #8
/*     */       //   43: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   46: checkcast li/cil/oc/api/driver/item/UpgradeRenderer
/*     */       //   49: astore #10
/*     */       //   51: new scala/Tuple2
/*     */       //   54: dup
/*     */       //   55: aload #9
/*     */       //   57: aload #10
/*     */       //   59: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   62: astore #11
/*     */       //   64: aload #11
/*     */       //   66: astore #7
/*     */       //   68: aload #7
/*     */       //   70: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   73: checkcast net/minecraft/item/ItemStack
/*     */       //   76: astore #12
/*     */       //   78: aload #7
/*     */       //   80: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   83: checkcast li/cil/oc/api/driver/item/UpgradeRenderer
/*     */       //   86: astore #13
/*     */       //   88: invokestatic glPushMatrix : ()V
/*     */       //   91: ldc 0.5
/*     */       //   93: ldc 0.5
/*     */       //   95: ldc 0.5
/*     */       //   97: invokestatic glTranslatef : (FFF)V
/*     */       //   100: aload #13
/*     */       //   102: aload #12
/*     */       //   104: aload #4
/*     */       //   106: aload_0
/*     */       //   107: getfield robot$1 : Lli/cil/oc/common/tileentity/Robot;
/*     */       //   110: aload_0
/*     */       //   111: getfield f$1 : F
/*     */       //   114: invokeinterface render : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;Lli/cil/oc/api/internal/Robot;F)V
/*     */       //   119: invokestatic glPopMatrix : ()V
/*     */       //   122: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   125: goto -> 175
/*     */       //   128: new scala/MatchError
/*     */       //   131: dup
/*     */       //   132: aload #8
/*     */       //   134: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   137: athrow
/*     */       //   138: new scala/MatchError
/*     */       //   141: dup
/*     */       //   142: aload_2
/*     */       //   143: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   146: athrow
/*     */       //   147: astore #6
/*     */       //   149: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   152: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   155: ldc 'Failed rendering equipped upgrade.'
/*     */       //   157: aload #6
/*     */       //   159: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   164: aload_0
/*     */       //   165: getfield robot$1 : Lli/cil/oc/common/tileentity/Robot;
/*     */       //   168: iconst_1
/*     */       //   169: invokevirtual renderingErrored_$eq : (Z)V
/*     */       //   172: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   175: astore #5
/*     */       //   177: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #462	-> 0
/*     */       //   #463	-> 23
/*     */       //   #464	-> 88
/*     */       //   #465	-> 91
/*     */       //   #466	-> 100
/*     */       //   #467	-> 119
/*     */       //   #463	-> 128
/*     */       //   #462	-> 138
/*     */       //   #470	-> 147
/*     */       //   #471	-> 149
/*     */       //   #472	-> 164
/*     */       //   #462	-> 175
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	178	0	this	Lli/cil/oc/client/renderer/tileentity/RobotRenderer$$anonfun$renderTileEntityAt$10;
/*     */       //   0	178	1	x$6	Lscala/Tuple2;
/*     */       //   14	164	3	info	Lscala/Tuple2;
/*     */       //   23	155	4	mountPoint	Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;
/*     */       //   41	137	9	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   51	127	10	renderer	Lli/cil/oc/api/driver/item/UpgradeRenderer;
/*     */       //   78	47	12	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   88	37	13	renderer	Lli/cil/oc/api/driver/item/UpgradeRenderer;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   23	138	147	finally
/*     */     }
/*     */     
/*     */     public RobotRenderer$$anonfun$renderTileEntityAt$10(float f$1, Robot robot$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RobotRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */