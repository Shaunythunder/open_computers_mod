/*     */ package li.cil.oc.server;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.network.FMLNetworkEvent;
/*     */ import li.cil.oc.common.Achievement$;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ew!B\001\003\021\003Y\021!\004)bG.,G\017S1oI2,'O\003\002\004\t\00511/\032:wKJT!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001!\taQ\"D\001\003\r\025q!\001#\001\020\0055\001\026mY6fi\"\013g\016\0327feN\021Q\002\005\t\003#Qi\021A\005\006\003'\021\taaY8n[>t\027B\001\b\023\021\0251R\002\"\001\030\003\031a\024N\\5u}Q\t1\002C\004\032\033\t\007I\021\002\016\002\035M,7-\036:jifl\025M]6feV\t1\004\005\002\035K5\tQD\003\002\037?\005)An\\45U*\021\001%I\001\bY><w-\0338h\025\t\0213%\001\004ba\006\034\007.\032\006\002I\005\031qN]4\n\005\031j\"AB'be.,'\017\003\004)\033\001\006IaG\001\020g\026\034WO]5us6\013'o[3sA!)!&\004C\005W\005yAn\\4G_J<W\r\032)bG.,G\017\006\002-eA\021Q\006M\007\002])\tq&A\003tG\006d\027-\003\0022]\t!QK\\5u\021\025\031\024\0061\0015\003\031\001H.Y=feB\021Q'P\007\002m)\0211g\016\006\003qe\na!\0328uSRL(B\001\036<\003%i\027N\\3de\0064GOC\001=\003\rqW\r^\005\003}Y\022a\"\0228uSRL\b\013\\1zKJl\005\013C\003A\033\021\005\021)\001\005p]B\0137m[3u)\ta#\tC\003D\001\007A)A\001f!\t)eL\004\002G7:\021q\t\027\b\003\021Zs!!S*\017\005)\003fBA&O\033\005a%BA'\013\003\031a$o\\8u}%\tq*A\002da^L!!\025*\002\t5|Gm\035\006\002\037&\021A+V\001\004M6d'BA)S\023\t\031rK\003\002U+&\021\021LW\001\b]\026$xo\034:l\025\t\031r+\003\002];\006ya)\024'OKR<xN]6Fm\026tGO\003\002Z5&\021q\f\031\002\030'\026\024h/\032:DkN$x.\034)bG.,G/\022<f]RT!\001X/)\005}\022\007CA2g\033\005!'BA3[\0031)g/\0328uQ\006tG\r\\3s\023\t9GM\001\bTk\n\0348M]5cK\0263XM\034;\t\013%lA\021\0136\002\013]|'\017\0343\025\007-\034x\017E\002.Y:L!!\034\030\003\r=\003H/[8o!\ty\027/D\001q\025\tI\027(\003\002sa\nYqk\034:mIN+'O^3s\021\025\031\004\0161\001u!\t)T/\003\002wm\taQI\034;jif\004F.Y=fe\")\001\020\033a\001s\006IA-[7f]NLwN\034\t\003[iL!a\037\030\003\007%sG\017C\003~\033\021\005c0\001\005eSN\004\030\r^2i)\tas\020C\004\002\002q\004\r!a\001\002\003A\004B!!\002\002\b5\tQ\"C\002\002\nQ\021A\002U1dW\026$\b+\031:tKJDq!!\004\016\t\003\ty!A\bp]\016{W\016];uKJ\004vn^3s)\ra\023\021\003\005\t\003\003\tY\0011\001\002\004!9\021QC\007\005\002\005]\021!D8o'\026\024h/\032:Q_^,'\017F\002-\0033A\001\"!\001\002\024\001\007\0211\001\005\b\003;iA\021AA\020\003AygnQ8qsR{\027I\\1msj,'\017F\002-\003CA\001\"!\001\002\034\001\007\0211\001\005\b\003KiA\021AA\024\003-yg\016\022:jm\026dunY6\025\0071\nI\003\003\005\002\002\005\r\002\031AA\002\021\035\ti#\004C\001\003_\t1b\0348Ee&4X-T8eKR\031A&!\r\t\021\005\005\0211\006a\001\003\007Aq!!\016\016\t\003\t9$\001\007p]\022\023xN\\3Q_^,'\017F\002-\003sA\001\"!\001\0024\001\007\0211\001\005\b\003{iA\021BA \003M!(/_*fi\016{W\016];uKJ\004vn^3s)\035a\023\021IA+\003?B\001\"a\021\002<\001\007\021QI\001\tG>l\007/\036;feB!\021qIA)\033\t\tIE\003\003\002L\0055\023aB7bG\"Lg.\032\006\004\003\037\"\021aA1qS&!\0211KA%\005\035i\025m\0315j]\026D\001\"a\026\002<\001\007\021\021L\001\006m\006dW/\032\t\004[\005m\023bAA/]\t9!i\\8mK\006t\007BB\032\002<\001\007A\007C\004\002d5!\t!!\032\002\023=t7*Z=E_^tGc\001\027\002h!A\021\021AA1\001\004\t\031\001C\004\002l5!\t!!\034\002\017=t7*Z=VaR\031A&a\034\t\021\005\005\021\021\016a\001\003\007Aq!a\035\016\t\003\t)(A\006p]\016c\027\016\0352pCJ$Gc\001\027\002x!A\021\021AA9\001\004\t\031\001C\004\002|5!\t!! \002\031=tWj\\;tK\016c\027nY6\025\0071\ny\b\003\005\002\002\005e\004\031AA\002\021\035\t\031)\004C\001\003\013\013\021b\0348N_V\034X-\0269\025\0071\n9\t\003\005\002\002\005\005\005\031AA\002\021\035\tY)\004C\001\003\033\013Qb\0348N_V\034XmU2s_2dGc\001\027\002\020\"A\021\021AAE\001\004\t\031\001C\004\002\0246!\t!!&\002#=tG)\031;bE\006\034XmU3u'2|G\017F\002-\003/C\001\"!\001\002\022\002\007\0211\001\005\b\0037kA\021AAO\003Ayg.T;mi&\004\026M\035;QY\006\034W\rF\002-\003?C\001\"!\001\002\032\002\007\0211\001\005\b\003GkA\021AAS\003=yg\016U3u-&\034\030NY5mSRLHc\001\027\002(\"A\021\021AAQ\001\004\t\031\001C\004\002,6!\t!!,\002-=t'+Y2l\033>,h\016^1cY\026l\025\r\0359j]\036$2\001LAX\021!\t\t!!+A\002\005\r\001bBAZ\033\021\005\021QW\001\021_:\024\026mY6SK2\f\027p\025;bi\026$2\001LA\\\021!\t\t!!-A\002\005\r\001bBA^\033\021\005\021QX\001\026_:\024vNY8u\003N\034X-\0342mKJ\034F/\031:u)\ra\023q\030\005\t\003\003\tI\f1\001\002\004!9\0211Y\007\005\002\005\025\027aE8o%>\024w\016^*uCR,'+Z9vKN$Hc\001\027\002H\"A\021\021AAa\001\004\t\031\001C\004\002L6!\t!!4\002!=tG+\032=u\005V4g-\032:J]&$Hc\001\027\002P\"A\021\021AAe\001\004\t\031\001C\004\002T6!\t!!6\002\037=tw+Y=q_&tG\017T1cK2$2\001LAl\021!\t\t!!5A\002\005\r\001")
/*     */ public final class PacketHandler
/*     */ {
/*     */   public static void onWaypointLabel(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onWaypointLabel(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onTextBufferInit(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onTextBufferInit(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onRobotStateRequest(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onRobotStateRequest(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onRobotAssemblerStart(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onRobotAssemblerStart(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onRackRelayState(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onRackRelayState(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onRackMountableMapping(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onRackMountableMapping(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onPetVisibility(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onPetVisibility(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onMultiPartPlace(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onMultiPartPlace(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onDatabaseSetSlot(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onDatabaseSetSlot(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onMouseScroll(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onMouseScroll(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onMouseUp(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onMouseUp(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onMouseClick(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onMouseClick(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onClipboard(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onClipboard(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onKeyUp(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onKeyUp(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onKeyDown(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onKeyDown(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onDronePower(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onDronePower(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onDriveMode(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onDriveMode(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onDriveLock(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onDriveLock(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onCopyToAnalyzer(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onCopyToAnalyzer(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onServerPower(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onServerPower(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void onComputerPower(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.onComputerPower(paramPacketParser);
/*     */   }
/*     */   
/*     */   public static void dispatch(li.cil.oc.common.PacketHandler.PacketParser paramPacketParser) {
/*     */     PacketHandler$.MODULE$.dispatch(paramPacketParser);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPacket(FMLNetworkEvent.ServerCustomPacketEvent paramServerCustomPacketEvent) {
/*     */     PacketHandler$.MODULE$.onPacket(paramServerCustomPacketEvent);
/*     */   }
/*     */   
/*     */   public final class PacketHandler$$anonfun$onRobotAssemblerStart$1
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final li.cil.oc.common.PacketHandler.PacketParser p$1;
/*     */     
/*     */     public final void apply(ItemStack stack) {
/* 314 */       Achievement$.MODULE$.onAssemble(stack, this.p$1.player());
/*     */     }
/*     */     
/*     */     public PacketHandler$$anonfun$onRobotAssemblerStart$1(li.cil.oc.common.PacketHandler.PacketParser p$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\PacketHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */