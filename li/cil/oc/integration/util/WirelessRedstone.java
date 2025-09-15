/*    */ package li.cil.oc.integration.util;
/*    */ import li.cil.oc.server.component.RedstoneWireless;
/*    */ import scala.Serializable;
/*    */ import scala.collection.mutable.Set;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ @ScalaSignature(bytes = "\006\001%<Q!\001\002\t\0025\t\001cV5sK2,7o\035*fIN$xN\\3\013\005\r!\021\001B;uS2T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"\001E,je\026dWm]:SK\022\034Ho\0348f'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035Aq\001H\bC\002\023\005Q$A\004tsN$X-\\:\026\003y\0012a\b\023'\033\005\001#BA\021#\003\035iW\017^1cY\026T!a\t\013\002\025\r|G\016\\3di&|g.\003\002&A\t\0311+\032;\021\005\035BS\"A\b\007\017%z\001\023aI\001U\t1r+\033:fY\026\0348OU3egR|g.Z*zgR,Wn\005\002)%!)A\006\013D\001[\005Y\021\r\0323SK\016,\027N^3s)\tq\023\007\005\002\024_%\021\001\007\006\002\005+:LG\017C\0033W\001\0071'\001\002sgB\021A'O\007\002k)\021agN\001\nG>l\007o\0348f]RT!\001\017\004\002\rM,'O^3s\023\tQTG\001\tSK\022\034Ho\0348f/&\024X\r\\3tg\")A\b\013D\001{\005q!/Z7pm\026\024VmY3jm\026\024HC\001\030?\021\025\0214\b1\0014\021\025\001\005F\"\001B\0031)\b\017Z1uK>+H\017];u)\tq#\tC\0033\001\0071\007C\003EQ\031\005Q)A\tsK6|g/\032+sC:\034X.\033;uKJ$\"A\f$\t\013I\032\005\031A\032\t\013!Cc\021A%\002\021\035,G/\0238qkR$\"AS'\021\005MY\025B\001'\025\005\035\021un\0347fC:DQAM$A\002MBQa\024\025\007\002A\013QB]3tKR\024V\rZ:u_:,GC\001\030R\021\025\021d\n1\0014\021\031\031v\002)A\005=\005A1/_:uK6\034\b\005C\003V\037\021\005a+A\006jg\0063\030-\0337bE2,W#\001&\t\0131zA\021\001-\025\0059J\006\"\002\032X\001\004\031\004\"\002\037\020\t\003YFC\001\030]\021\025\021$\f1\0014\021\025\001u\002\"\001_)\tqs\fC\0033;\002\0071\007C\003E\037\021\005\021\r\006\002/E\")!\007\031a\001g!)\001j\004C\001IR\021!*\032\005\006e\r\004\ra\r\005\006\037>!\ta\032\013\003]!DQA\r4A\002M\002")
/*    */ public final class WirelessRedstone { public static void resetRedstone(RedstoneWireless paramRedstoneWireless) { WirelessRedstone$.MODULE$.resetRedstone(paramRedstoneWireless); } public static boolean getInput(RedstoneWireless paramRedstoneWireless) { return WirelessRedstone$.MODULE$.getInput(paramRedstoneWireless); } public static void removeTransmitter(RedstoneWireless paramRedstoneWireless) { WirelessRedstone$.MODULE$.removeTransmitter(paramRedstoneWireless); } public static void updateOutput(RedstoneWireless paramRedstoneWireless) { WirelessRedstone$.MODULE$.updateOutput(paramRedstoneWireless); } public static void removeReceiver(RedstoneWireless paramRedstoneWireless) { WirelessRedstone$.MODULE$.removeReceiver(paramRedstoneWireless); } public static void addReceiver(RedstoneWireless paramRedstoneWireless) { WirelessRedstone$.MODULE$.addReceiver(paramRedstoneWireless); } public static boolean isAvailable() { return WirelessRedstone$.MODULE$.isAvailable(); } public static Set<WirelessRedstoneSystem> systems() {
/*    */     return WirelessRedstone$.MODULE$.systems();
/*    */   } public final class WirelessRedstone$$anonfun$addReceiver$1 extends AbstractFunction1<WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) {
/*    */       try {
/* 13 */         system.addReceiver(this.rs$2);
/*    */       } finally {}
/*    */     } private final RedstoneWireless rs$2; public WirelessRedstone$$anonfun$addReceiver$1(RedstoneWireless rs$2) {} }
/*    */   public final class WirelessRedstone$$anonfun$removeReceiver$1 extends AbstractFunction1<WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$4;
/*    */     public final void apply(WirelessRedstone.WirelessRedstoneSystem system) {
/*    */       try {
/* 19 */         system.removeReceiver(this.rs$4);
/*    */       } finally {}
/*    */     } public WirelessRedstone$$anonfun$removeReceiver$1(RedstoneWireless rs$4) {} }
/*    */   public final class WirelessRedstone$$anonfun$updateOutput$1 extends AbstractFunction1<WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$3;
/*    */     public final void apply(WirelessRedstone.WirelessRedstoneSystem system) {
/*    */       try {
/* 25 */         system.updateOutput(this.rs$3);
/*    */       } finally {}
/*    */     } public WirelessRedstone$$anonfun$updateOutput$1(RedstoneWireless rs$3) {} }
/*    */   public final class WirelessRedstone$$anonfun$removeTransmitter$1 extends AbstractFunction1<WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$5;
/*    */     public final void apply(WirelessRedstone.WirelessRedstoneSystem system) {
/*    */       try {
/* 31 */         system.removeTransmitter(this.rs$5);
/*    */       } finally {}
/*    */     } public WirelessRedstone$$anonfun$removeTransmitter$1(RedstoneWireless rs$5) {} }
/*    */   public final class WirelessRedstone$$anonfun$getInput$1 extends AbstractFunction1<WirelessRedstoneSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$6;
/*    */     public final boolean apply(WirelessRedstone.WirelessRedstoneSystem x$1) {
/* 36 */       return x$1.getInput(this.rs$6);
/*    */     } public WirelessRedstone$$anonfun$getInput$1(RedstoneWireless rs$6) {} } public final class WirelessRedstone$$anonfun$resetRedstone$1 extends AbstractFunction1<WirelessRedstoneSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final RedstoneWireless rs$1; public final void apply(WirelessRedstone.WirelessRedstoneSystem system) {
/*    */       try {
/* 39 */         system.resetRedstone(this.rs$1);
/*    */       } finally {}
/*    */     }
/*    */     
/*    */     public WirelessRedstone$$anonfun$resetRedstone$1(RedstoneWireless rs$1) {} }
/*    */ 
/*    */   
/*    */   public static interface WirelessRedstoneSystem {
/*    */     void addReceiver(RedstoneWireless param1RedstoneWireless);
/*    */     
/*    */     void removeReceiver(RedstoneWireless param1RedstoneWireless);
/*    */     
/*    */     void updateOutput(RedstoneWireless param1RedstoneWireless);
/*    */     
/*    */     void removeTransmitter(RedstoneWireless param1RedstoneWireless);
/*    */     
/*    */     boolean getInput(RedstoneWireless param1RedstoneWireless);
/*    */     
/*    */     void resetRedstone(RedstoneWireless param1RedstoneWireless);
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\WirelessRedstone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */