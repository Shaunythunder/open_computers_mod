/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ import li.cil.oc.client.renderer.markdown.MarkupFormat$;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import scala.Enumeration;
/*    */ import scala.Function2;
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.collection.mutable.Buffer$;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.collection.mutable.StringBuilder$;
/*    */ import scala.package$;
/*    */ import scala.util.matching.Regex;
/*    */ 
/*    */ public abstract class Segment$class {
/*    */   public static final Segment root(Segment $this) {
/*    */     while (true) {
/* 21 */       if ($this.parent() == null) return $this;  $this = $this.parent();
/*    */     } 
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
/*    */   public static Option render(Segment $this, int x, int y, int indent, int maxWidth, FontRenderer renderer, int mouseX, int mouseY) {
/* 49 */     return (Option)None$.MODULE$;
/*    */   }
/*    */   
/* 52 */   public static Iterable renderAsText(Segment $this, Enumeration.Value format) { Segment segment = $this;
/* 53 */     Buffer result = (Buffer)Buffer$.MODULE$.empty();
/* 54 */     StringBuilder builder = StringBuilder$.MODULE$.newBuilder(); while (true) {
/* 55 */       if (segment == null)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 63 */         return result.toIterable(); }  builder.append(segment.toString(format)); if (segment.isLast()) {
/*    */         result.$plus$eq(builder.toString());
/*    */         builder.clear();
/*    */       } 
/*    */       segment = segment.next();
/* 68 */     }  } public static String toString(Segment $this) { return $this.toString(MarkupFormat$.MODULE$.Markdown()); }
/*    */ 
/*    */ 
/*    */   
/*    */   public static Iterable refine(Segment $this, Regex pattern, Function2 factory) {
/* 73 */     (new Segment[1])[0] = $this; return (Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Segment[1]));
/*    */   }
/*    */   
/*    */   public static void $init$(Segment $this) {
/* 77 */     $this.next_$eq(null);
/*    */   }
/*    */   
/*    */   public static boolean isLast(Segment $this) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface next : ()Lli/cil/oc/client/renderer/markdown/segment/Segment;
/*    */     //   6: ifnull -> 50
/*    */     //   9: aload_0
/*    */     //   10: invokeinterface root : ()Lli/cil/oc/client/renderer/markdown/segment/Segment;
/*    */     //   15: aload_0
/*    */     //   16: invokeinterface next : ()Lli/cil/oc/client/renderer/markdown/segment/Segment;
/*    */     //   21: invokeinterface root : ()Lli/cil/oc/client/renderer/markdown/segment/Segment;
/*    */     //   26: astore_1
/*    */     //   27: dup
/*    */     //   28: ifnonnull -> 39
/*    */     //   31: pop
/*    */     //   32: aload_1
/*    */     //   33: ifnull -> 46
/*    */     //   36: goto -> 50
/*    */     //   39: aload_1
/*    */     //   40: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   43: ifeq -> 50
/*    */     //   46: iconst_0
/*    */     //   47: goto -> 51
/*    */     //   50: iconst_1
/*    */     //   51: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #80	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	52	0	$this	Lli/cil/oc/client/renderer/markdown/segment/Segment;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\Segment$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */