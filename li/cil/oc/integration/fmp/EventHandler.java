/*     */ package li.cil.oc.integration.fmp;
/*     */ 
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*     */ import scala.MatchError;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-r!B\001\003\021\003i\021\001D#wK:$\b*\0318eY\026\024(BA\002\005\003\r1W\016\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\031\0253XM\034;IC:$G.\032:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!9Ad\004a\001\n\023i\022\001E2veJ,g\016\0367z!2\f7-\0338h+\005q\002CA\n \023\t\001CCA\004C_>dW-\0318\t\017\tz\001\031!C\005G\005!2-\036:sK:$H.\037)mC\016LgnZ0%KF$\"\001J\024\021\005M)\023B\001\024\025\005\021)f.\033;\t\017!\n\023\021!a\001=\005\031\001\020J\031\t\r)z\001\025)\003\037\003E\031WO\035:f]Rd\027\020\0257bG&tw\r\t\005\bY=\021\r\021\"\003.\0035I\030m\036\032ESJ,7\r^5p]V\ta\006E\002\024_EJ!\001\r\013\003\013\005\023(/Y=\021\005IZT\"A\032\013\005Q*\024\001B;uS2T!AN\034\002\r\r|W.\\8o\025\tA\024(\001\bnS:,7M]1gi\032|'oZ3\013\003i\n1A\\3u\023\ta4G\001\bG_J<W\rR5sK\016$\030n\0348\t\ryz\001\025!\003/\0039I\030m\036\032ESJ,7\r^5p]\002BQ\001Q\b\005\002\005\013a\002\0357bs\026\024\030J\034;fe\006\034G\017\006\002%\005\")1i\020a\001\t\006)QM^3oiB\021QiS\007\002\r*\021q\tS\001\007a2\f\0270\032:\013\005%S\025AB3oi&$\030P\003\002Do%\021AJ\022\002\024!2\f\0270\032:J]R,'/Y2u\013Z,g\016\036\025\0039\003\"aT-\016\003AS!!\025*\002\031\0254XM\034;iC:$G.\032:\013\005Y\032&B\001+V\003\r1W\016\034\006\003-^\013A!\\8eg*\t\001,A\002da^L!A\027)\003\035M+(m]2sS\n,WI^3oi\")Al\004C\001;\006)\001\017\\1dKR\021aD\030\005\006\017n\003\ra\030\t\003A\026l\021!\031\006\003\017\nT!!S2\013\005\021L\024!C7j]\026\034'/\0314u\023\t1\027M\001\007F]RLG/\037)mCf,'\017C\003i\037\021E\021.A\tqY\006\034W\rR3mK\036\fG/\032)beR$BA\b6le\")qi\032a\001?\")An\032a\001[\006\031\001.\033;\021\0059\004X\"A8\013\005Q\032\027BA9p\005QiuN^5oO>\023'.Z2u!>\034\030\016^5p]\")1o\032a\001i\006!\001/\031:u!\tqQ/\003\002w\005\ty1+[7qY\026\024En\\2l!\006\024H\017C\003y\037\021E\0210A\006dC:\fE\r\032)sS:$H\003\002\020{\003\023AQa_<A\002q\f\021\001\036\t\004{\006\025Q\"\001@\013\007}\f\t!A\005nk2$\030\016]1si*\021\0211A\001\fG>$Wm\0315jG.,g.C\002\002\by\024Q\002V5mK6+H\016^5qCJ$\bBBA\006o\002\007A/A\001q\021\035\tya\004C\t\003#\ta\002\0357bG\026lU\017\034;j!\006\024H\017F\004\037\003'\t)\"a\006\t\r\035\013i\0011\001`\021\031\031\030Q\002a\001i\"A\021\021DA\007\001\004\tY\"A\002q_N\004B!!\b\002(5\021\021q\004\006\005\003C\t\031#A\002wK\016TA!!\n\002\002\005\031A.\0332\n\t\005%\022q\004\002\013\0052|7m[\"p_J$\007")
/*     */ public final class EventHandler
/*     */ {
/*     */   public static boolean place(EntityPlayer paramEntityPlayer) {
/*     */     return EventHandler$.MODULE$.place(paramEntityPlayer);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void playerInteract(PlayerInteractEvent paramPlayerInteractEvent) {
/*     */     EventHandler$.MODULE$.playerInteract(paramPlayerInteractEvent);
/*     */   }
/*     */   
/*     */   public final class EventHandler$$anonfun$1
/*     */     extends AbstractFunction2<Tuple2<Object, Object>, TMultiPart, Tuple2<Object, Object>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Tuple2<Object, Object> apply(Tuple2 acc, TMultiPart part) {
/* 105 */       Tuple2 tuple2 = acc; if (tuple2 != null) { Tuple2.mcII.sp sp4; int offAcc = tuple2._1$mcI$sp(), onAcc = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(offAcc, onAcc), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 106 */         TMultiPart tMultiPart = part;
/* 107 */         if (tMultiPart instanceof PrintPart) { PrintPart printPart = (PrintPart)tMultiPart; sp4 = new Tuple2.mcII.sp(printPart.data().stateOff().size(), printPart.data().stateOn().size()); }
/* 108 */         else { sp4 = new Tuple2.mcII.sp(0, 0); }
/*     */          Tuple2.mcII.sp sp3 = sp4; if (sp3 != null) {
/* 110 */           int offCount = sp3._1$mcI$sp(), onCount = sp3._2$mcI$sp(); Tuple2.mcII.sp sp6 = new Tuple2.mcII.sp(offCount, onCount), sp5 = sp6; int k = sp5._1$mcI$sp(), m = sp5._2$mcI$sp(); return (Tuple2<Object, Object>)new Tuple2.mcII.sp(i + k, j + m);
/*     */         } 
/*     */         throw new MatchError(sp3); }
/*     */       
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\EventHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */