/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.client.gui.widget.Widget;
/*    */ import li.cil.oc.client.gui.widget.WidgetContainer;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import net.minecraft.inventory.Container;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ua!B\001\003\003\003i!AE\"vgR|WnR;j\007>tG/Y5oKJT!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001+\tqaeE\002\001\037m\001\"\001E\r\016\003EQ!AE\n\002\023%tg/\0328u_JL(BA\002\025\025\t)QC\003\002\027/\005IQ.\0338fGJ\fg\r\036\006\0021\005\031a.\032;\n\005i\t\"\001D$vS\016{g\016^1j]\026\024\bC\001\017 \033\005i\"B\001\020\003\003\0319\030\016Z4fi&\021\001%\b\002\020/&$w-\032;D_:$\030-\0338fe\"A!\005\001BC\002\023\0051%\001\nj]Z,g\016^8ss\016{g\016^1j]\026\024X#\001\023\021\005\0252C\002\001\003\006O\001\021\r\001\013\002\002\007F\021\021f\f\t\003U5j\021a\013\006\002Y\005)1oY1mC&\021af\013\002\b\035>$\b.\0338h!\t\001$'D\0012\025\t\021R#\003\0024c\tI1i\0348uC&tWM\035\005\tk\001\021\t\021)A\005I\005\031\022N\034<f]R|'/_\"p]R\f\027N\\3sA!)q\007\001C\001q\0051A(\0338jiz\"\"!O\036\021\007i\002A%D\001\003\021\025\021c\0071\001%\021\025i\004\001\"\021?\003\0359\030N\0343pob+\022a\020\t\003U\001K!!Q\026\003\007%sG\017C\003D\001\021\005c(A\004xS:$wn^-\t\013\025\003A\021\t$\002\017]Lg\016Z8x5V\tq\t\005\002+\021&\021\021j\013\002\006\r2|\027\r\036\005\006\027\002!\t\005T\001\021I>,7oR;j!\006,8/Z$b[\026$\022!\024\t\003U9K!aT\026\003\017\t{w\016\\3b]\")\021\013\001C\t%\006\031\021\r\0323\026\005M{FcA'UK\")Q\013\025a\001-\006!A.[:u!\r9FLX\007\0021*\021\021LW\001\005kRLGNC\001\\\003\021Q\027M^1\n\005uC&\001\002'jgR\004\"!J0\005\013\001\004&\031A1\003\003Q\013\"!\0132\021\005)\032\027B\0013,\005\r\te.\037\005\006MB\003\rAY\001\006m\006dW/\032\005\006Q\002!\t%[\001\021IJ\fw\017S8wKJLgn\032+fqR$RA[7umb\004\"AK6\n\0051\\#\001B+oSRDQA\\4A\002=\fA\001^3yiB\022\001O\035\t\004/r\013\bCA\023s\t%\031X.!A\001\002\013\005\021MA\002`IEBQ!^4A\002}\n\021\001\037\005\006o\036\004\raP\001\002s\")\021p\032a\001u\006!am\0348u!\tYH0D\001\024\023\ti8C\001\007G_:$(+\0328eKJ,'\017\003\004\000\001\021E\021\021A\001\027G>\004\030.\0323Ee\006<\bj\034<fe&tw\rV3yiRI!.a\001\002\020\005E\0211\003\005\007]z\004\r!!\0021\t\005\035\0211\002\t\005/r\013I\001E\002&\003\027!1\"!\004\002\004\005\005\t\021!B\001C\n\031q\f\n\032\t\013Ut\b\031A \t\013]t\b\031A \t\013et\b\031\001>")
/*    */ public abstract class CustomGuiContainer<C extends Container> extends GuiContainer implements WidgetContainer {
/*    */   private final C inventoryContainer;
/*    */   
/* 19 */   public ArrayBuffer<Widget> widgets() { return this.widgets; } private final ArrayBuffer<Widget> widgets; public void li$cil$oc$client$gui$widget$WidgetContainer$_setter_$widgets_$eq(ArrayBuffer<Widget> x$1) { this.widgets = x$1; } public <T extends Widget> T addWidget(Widget widget) { return (T)WidgetContainer.class.addWidget(this, widget); } public void drawWidgets() { WidgetContainer.class.drawWidgets(this); } public C inventoryContainer() { return this.inventoryContainer; } public CustomGuiContainer(Container inventoryContainer) { super(inventoryContainer); WidgetContainer.class.$init$(this); } public int windowX() {
/* 20 */     return this.field_147003_i;
/*    */   } public int windowY() {
/* 22 */     return this.field_147009_r;
/*    */   } public float windowZ() {
/* 24 */     return this.field_73735_i;
/*    */   } public boolean func_73868_f() {
/* 26 */     return false;
/*    */   } public <T> boolean add(List<Object> list, Object value) {
/* 28 */     return list.add(value);
/*    */   }
/*    */   
/*    */   public void drawHoveringText(List<?> text, int x, int y, FontRenderer font) {
/* 32 */     copiedDrawHoveringText(text, x, y, font);
/*    */   }
/*    */   
/*    */   public void copiedDrawHoveringText(List text, int x, int y, FontRenderer font) {
/* 36 */     if (!text.isEmpty()) {
/* 37 */       GL11.glDisable(32826);
/* 38 */       RenderHelper.func_74518_a();
/* 39 */       GL11.glDisable(2896);
/* 40 */       GL11.glDisable(2929);
/*    */       
/* 42 */       int textWidth = BoxesRunTime.unboxToInt(((TraversableOnce)WrapAsScala$.MODULE$.asScalaBuffer(text).map((Function1)new CustomGuiContainer$$anonfun$1(this, (CustomGuiContainer<C>)font), Buffer$.MODULE$.canBuildFrom())).max((Ordering)Ordering$Int$.MODULE$));
/*    */       
/* 44 */       IntRef posX = IntRef.create(x + 12);
/* 45 */       IntRef posY = IntRef.create(y - 12);
/* 46 */       int textHeight = 8;
/* 47 */       if (text.size() > 1) {
/* 48 */         textHeight += 2 + (text.size() - 1) * 10;
/*    */       }
/* 50 */       if (posX.elem + textWidth > this.field_146294_l) {
/* 51 */         posX.elem -= 28 + textWidth;
/*    */       }
/* 53 */       if (posY.elem + textHeight + 6 > this.field_146295_m) {
/* 54 */         posY.elem = this.field_146295_m - textHeight - 6;
/*    */       }
/*    */       
/* 57 */       ((Gui)this).field_73735_i = 300.0F;
/* 58 */       int bg = -267386864;
/* 59 */       func_73733_a(posX.elem - 3, posY.elem - 4, posX.elem + textWidth + 3, posY.elem - 3, bg, bg);
/* 60 */       func_73733_a(posX.elem - 3, posY.elem + textHeight + 3, posX.elem + textWidth + 3, posY.elem + textHeight + 4, bg, bg);
/* 61 */       func_73733_a(posX.elem - 3, posY.elem - 3, posX.elem + textWidth + 3, posY.elem + textHeight + 3, bg, bg);
/* 62 */       func_73733_a(posX.elem - 4, posY.elem - 3, posX.elem - 3, posY.elem + textHeight + 3, bg, bg);
/* 63 */       func_73733_a(posX.elem + textWidth + 3, posY.elem - 3, posX.elem + textWidth + 4, posY.elem + textHeight + 3, bg, bg);
/* 64 */       int color1 = 1347420415;
/* 65 */       int color2 = 1347420414;
/* 66 */       func_73733_a(posX.elem - 3, posY.elem - 3 + 1, posX.elem - 3 + 1, posY.elem + textHeight + 3 - 1, color1, color2);
/* 67 */       func_73733_a(posX.elem + textWidth + 2, posY.elem - 3 + 1, posX.elem + textWidth + 3, posY.elem + textHeight + 3 - 1, color1, color2);
/* 68 */       func_73733_a(posX.elem - 3, posY.elem - 3, posX.elem + textWidth + 3, posY.elem - 3 + 1, color1, color1);
/* 69 */       func_73733_a(posX.elem - 3, posY.elem + textHeight + 2, posX.elem + textWidth + 3, posY.elem + textHeight + 3, color2, color2);
/*    */       
/* 71 */       ((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(text).zipWithIndex(Buffer$.MODULE$.canBuildFrom())).withFilter((Function1)new CustomGuiContainer$$anonfun$copiedDrawHoveringText$1(this)).foreach((Function1)new CustomGuiContainer$$anonfun$copiedDrawHoveringText$2(this, font, posX, (CustomGuiContainer<C>)posY));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 78 */       ((Gui)this).field_73735_i = 0.0F;
/*    */       
/* 80 */       GL11.glEnable(2896);
/* 81 */       GL11.glEnable(2929);
/* 82 */       RenderHelper.func_74519_b();
/* 83 */       GL11.glEnable(32826);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final class CustomGuiContainer$$anonfun$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final FontRenderer font$1;
/*    */     
/*    */     public final int apply(Object line) {
/*    */       return this.font$1.func_78256_a((String)line);
/*    */     }
/*    */     
/*    */     public CustomGuiContainer$$anonfun$1(CustomGuiContainer $outer, FontRenderer font$1) {}
/*    */   }
/*    */   
/*    */   public final class CustomGuiContainer$$anonfun$copiedDrawHoveringText$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*    */       boolean bool;
/*    */       Tuple2 tuple2 = check$ifrefutable$1;
/*    */       if (tuple2 != null) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return bool;
/*    */     }
/*    */     
/*    */     public CustomGuiContainer$$anonfun$copiedDrawHoveringText$1(CustomGuiContainer $outer) {}
/*    */   }
/*    */   
/*    */   public final class CustomGuiContainer$$anonfun$copiedDrawHoveringText$2 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final FontRenderer font$1;
/*    */     private final IntRef posX$1;
/*    */     private final IntRef posY$1;
/*    */     
/*    */     public final void apply(Tuple2 x$1) {
/*    */       Tuple2 tuple2 = x$1;
/*    */       if (tuple2 != null) {
/*    */         Object line = tuple2._1();
/*    */         int index = tuple2._2$mcI$sp();
/*    */         this.font$1.func_78261_a((String)line, this.posX$1.elem, this.posY$1.elem, -1);
/*    */         if (index == 0)
/*    */           this.posY$1.elem += 2; 
/*    */         this.posY$1.elem += 10;
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return;
/*    */       } 
/*    */       throw new MatchError(tuple2);
/*    */     }
/*    */     
/*    */     public CustomGuiContainer$$anonfun$copiedDrawHoveringText$2(CustomGuiContainer $outer, FontRenderer font$1, IntRef posX$1, IntRef posY$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\CustomGuiContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */