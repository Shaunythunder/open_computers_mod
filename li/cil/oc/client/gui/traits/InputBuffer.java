/*    */ package li.cil.oc.client.gui.traits;
/*    */ 
/*    */ import li.cil.oc.api.internal.TextBuffer;
/*    */ import scala.MatchError;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.TraitSetter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005maaB\001\003!\003\r\ta\004\002\f\023:\004X\017\036\"vM\032,'O\003\002\004\t\0051AO]1jiNT!!\002\004\002\007\035,\030N\003\002\b\021\00511\r\\5f]RT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\r\001\001C\007\t\003#ai\021A\005\006\003\013MQ!a\002\013\013\005U1\022!C7j]\026\034'/\0314u\025\0059\022a\0018fi&\021\021D\005\002\n\017VL7k\031:fK:\004\"a\007\017\016\003\tI!!\b\002\003\033\021K7\017\0357bs\n+hMZ3s\021\025y\002\001\"\001!\003\031!\023N\\5uIQ\t\021\005\005\002#K5\t1EC\001%\003\025\0318-\0317b\023\t13E\001\003V]&$\b\"\002\025\001\r#I\023A\0022vM\032,'/F\001+!\tY\003'D\001-\025\tic&\001\005j]R,'O\\1m\025\ty\003\"A\002ba&L!!\r\027\003\025Q+\007\020\036\"vM\032,'\017C\0034\001\021EC'A\007ck\0324WM]\"pYVlgn]\013\002kA\021!EN\005\003o\r\0221!\0238u\021\025I\004\001\"\0255\003)\021WO\0324feJ{wo\035\005\006w\0011\t\002P\001\fQ\006\0348*Z=c_\006\024H-F\001>!\t\021c(\003\002@G\t9!i\\8mK\006t\007bB!\001\005\004%IAQ\001\faJ,7o]3e\027\026L8/F\001D!\021!\025*N&\016\003\025S!AR$\002\0175,H/\0312mK*\021\001jI\001\013G>dG.Z2uS>t\027B\001&F\005\ri\025\r\035\t\003E1K!!T\022\003\t\rC\027M\035\005\007\037\002\001\013\021B\"\002\031A\024Xm]:fI.+\027p\035\021\t\017E\003\001\031!C\005%\006\0312\017[8x\027\026L(m\\1sI6K7o]5oOV\t1\013\005\002#)&\021Qk\t\002\005\031>tw\rC\004X\001\001\007I\021\002-\002/MDwn^&fs\n|\027M\0353NSN\034\030N\\4`I\025\fHCA\021Z\021\035Qf+!AA\002M\0131\001\037\0232\021\031a\006\001)Q\005'\006!2\017[8x\027\026L(m\\1sI6K7o]5oO\002BQA\030\001\005B}\013\001\003Z8fg\036+\030\016U1vg\026<\025-\\3\025\003uBQ!\031\001\005B\001\nq!\0338ji\036+\030\016C\003d\001\021E\003%A\bee\006<()\0364gKJd\025-_3s\021\025)\007\001\"\021!\003-ygnR;j\0072|7/\0323\t\013\035\004A\021\t\021\002'!\fg\016\0327f\027\026L(m\\1sI&s\007/\036;\t\013%\004A\021\0136\002\0315|Wo]3DY&\0347.\0323\025\t\005ZWn\034\005\006Y\"\004\r!N\001\002q\")a\016\033a\001k\005\t\021\020C\003qQ\002\007Q'\001\004ckR$xN\034\005\006e\002!Ia]\001\rS\036twN]3SKB,\027\r\036\013\004{Q4\b\"B;r\001\004Y\025\001B2iCJDQa^9A\002U\nAaY8eK\"Y\021\020\001I\001\004\003\005I\021\002\021{\0035\031X\017]3sI%t\027\016^$vS&\021\021\r\b\005\fy\002\001\n1!A\001\n\023\001S0A\013tkB,'\017\n3sC^\024UO\0324fe2\013\0270\032:\n\005\rd\002\002D@\001!\003\r\t\021!C\005A\005\005\021!E:va\026\024He\0348Hk&\034En\\:fI&\021Q\r\007\005\016\003\013\001\001\023aA\001\002\023%\001%a\002\0023M,\b/\032:%Q\006tG\r\\3LKf\024w.\031:e\023:\004X\017^\005\003ObAa\"a\003\001!\003\r\t\021!C\005\003\033\tI\"\001\ntkB,'\017J7pkN,7\t\\5dW\026$GcB\021\002\020\005E\021Q\003\005\t5\006%\021\021!a\001k!I\0211CA\005\003\003\005\r!N\001\004q\022\022\004\"CA\f\003\023\t\t\0211\0016\003\rAHeM\005\003Sb\001")
/*    */ public interface InputBuffer
/*    */   extends DisplayBuffer
/*    */ {
/*    */   void li$cil$oc$client$gui$traits$InputBuffer$_setter_$li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys_$eq(Map paramMap);
/*    */   
/*    */   TextBuffer buffer();
/*    */   
/*    */   int bufferColumns();
/*    */   
/*    */   int bufferRows();
/*    */   
/*    */   boolean hasKeyboard();
/*    */   
/*    */   Map<Object, Object> li$cil$oc$client$gui$traits$InputBuffer$$pressedKeys();
/*    */   
/*    */   long li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing();
/*    */   
/*    */   @TraitSetter
/*    */   void li$cil$oc$client$gui$traits$InputBuffer$$showKeyboardMissing_$eq(long paramLong);
/*    */   
/*    */   boolean doesGuiPauseGame();
/*    */   
/*    */   void initGui();
/*    */   
/*    */   void drawBufferLayer();
/*    */   
/*    */   void onGuiClosed();
/*    */   
/*    */   void handleKeyboardInput();
/*    */   
/*    */   void mouseClicked(int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public final class InputBuffer$$anonfun$onGuiClosed$1
/*    */     extends AbstractFunction1<Tuple2<Object, Object>, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public InputBuffer$$anonfun$onGuiClosed$1(InputBuffer $outer) {}
/*    */     
/*    */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*    */       boolean bool;
/* 60 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class InputBuffer$$anonfun$onGuiClosed$2 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable { public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { int code = tuple2._1$mcI$sp(); char char = tuple2._2$mcC$sp();
/* 61 */         this.$outer.buffer().keyUp(char, code, null); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public InputBuffer$$anonfun$onGuiClosed$2(InputBuffer $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\InputBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */