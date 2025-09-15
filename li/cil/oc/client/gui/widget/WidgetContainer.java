/*    */ package li.cil.oc.client.gui.widget;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001)3q!\001\002\021\002\007\005qBA\bXS\022<W\r^\"p]R\f\027N\\3s\025\t\031A!\001\004xS\022<W\r\036\006\003\013\031\t1aZ;j\025\t9\001\"\001\004dY&,g\016\036\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005\031\te.\037*fM\")q\003\001C\0011\0051A%\0338ji\022\"\022!\007\t\003#iI!a\007\n\003\tUs\027\016\036\005\b;\001\021\r\021\"\005\037\003\0359\030\016Z4fiN,\022a\b\t\004A\025:S\"A\021\013\005\t\032\023aB7vi\006\024G.\032\006\003II\t!bY8mY\026\034G/[8o\023\t1\023EA\006BeJ\f\027PQ;gM\026\024\bC\001\025*\033\005\021\021B\001\026\003\005\0319\026\016Z4fi\"1A\006\001Q\001\n}\t\001b^5eO\026$8\017\t\005\006]\001!\taL\001\nC\022$w+\0333hKR,\"\001M\032\025\005EJ\004C\001\0324\031\001!Q\001N\027C\002U\022\021\001V\t\003m\035\002\"!E\034\n\005a\022\"a\002(pi\"Lgn\032\005\006\0075\002\r!\r\005\006w\001!\t\001P\001\bo&tGm\\<Y+\005i\004CA\t?\023\ty$CA\002J]RDQ!\021\001\005\002q\nqa^5oI><\030\fC\003D\001\021\005A)A\004xS:$wn\036.\026\003\025\003\"!\005$\n\005\035\023\"!\002$m_\006$\b\"B%\001\t\003A\022a\0033sC^<\026\016Z4fiN\004")
/*    */ public interface WidgetContainer {
/*    */   void li$cil$oc$client$gui$widget$WidgetContainer$_setter_$widgets_$eq(ArrayBuffer paramArrayBuffer);
/*    */   
/*    */   ArrayBuffer<Widget> widgets();
/*    */   
/*    */   <T extends Widget> T addWidget(T paramT);
/*    */   
/*    */   int windowX();
/*    */   
/*    */   int windowY();
/*    */   
/*    */   float windowZ();
/*    */   
/*    */   void drawWidgets();
/*    */   
/*    */   public final class WidgetContainer$$anonfun$drawWidgets$1 extends AbstractFunction1<Widget, BoxedUnit> implements Serializable {
/*    */     public final void apply(Widget x$1) {
/* 21 */       x$1.draw();
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public WidgetContainer$$anonfun$drawWidgets$1(WidgetContainer $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\widget\WidgetContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */