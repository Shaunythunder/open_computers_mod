/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.fluids.FluidTankInfo;
/*     */ import net.minecraftforge.fluids.IFluidHandler;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Ev!B\001\003\021\003Y\021!E#yi\026tG-\0323Be\036,X.\0328ug*\0211\001B\001\005kRLGN\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\001\"\001D\007\016\003\t1QA\004\002\t\002=\021\021#\022=uK:$W\rZ!sOVlWM\034;t'\ti\001\003\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\005\006/5!\t\001G\001\007y%t\027\016\036 \025\003-AQAG\007\005\004m\t\021#\032=uK:$W\rZ!sOVlWM\034;t)\ra\022q\026\t\003;yi\021!\004\004\005\0355\001qd\005\002\037!!A\021E\bBC\002\023\005!%\001\003be\036\034X#A\022\021\005\021JS\"A\023\013\005\031:\023aB7bG\"Lg.\032\006\003Q\021\t1!\0319j\023\tQSEA\005Be\036,X.\0328ug\"AAF\bB\001B\003%1%A\003be\036\034\b\005C\003\030=\021\005a\006\006\002\035_!)\021%\fa\001G!)\021G\bC\001e\005aq\016\035;Ji\026l7i\\;oiR\0311G\016\035\021\005E!\024BA\033\023\005\rIe\016\036\005\006oA\002\raM\001\006S:$W\r\037\005\bsA\002\n\0211\0014\003\035!WMZ1vYRDQa\017\020\005\002q\nQb\0349u\r2,\030\016Z\"pk:$HcA\032>}!)qG\017a\001g!9\021H\017I\001\002\004\031\004\"\002!\037\t\003\t\025!C2iK\016\\7\013\\8u)\r\031$)\024\005\006\007~\002\r\001R\001\nS:4XM\034;pef\004\"!R&\016\003\031S!aQ$\013\005!K\025!C7j]\026\034'/\0314u\025\005Q\025a\0018fi&\021AJ\022\002\013\023&sg/\0328u_JL\b\"\002(@\001\004\031\024!\0018\t\013AsB\021A)\002\017=\004Ho\0257piR!1GU*U\021\025\031u\n1\001E\021\0259t\n1\0014\021\025It\n1\0014\021\0251f\004\"\001X\003%\031\007.Z2l)\006t7\016F\00241\002DQ!W+A\002i\013Q!\\;mi&\004\"a\0270\016\003qS!!X\024\002\021%tG/\032:oC2L!a\030/\003\0235+H\016^5UC:\\\007\"\002(V\001\004\031\004\"\0022\037\t\003\031\027!D2iK\016\\G+\0318l\023:4w\016\006\003eYFT\bCA3k\033\0051'BA4i\003\0311G.^5eg*\021\021.S\001\017[&tWm\031:bMR4wN]4f\023\tYgMA\007GYVLG\rV1oW&sgm\034\005\006[\006\004\rA\\\001\bQ\006tG\r\\3s!\t)w.\003\002qM\ni\021J\0227vS\022D\025M\0343mKJDQA]1A\002M\fAa]5eKB\021A\017_\007\002k*\0211A\036\006\003o\"\faaY8n[>t\027BA=v\00591uN]4f\t&\024Xm\031;j_:DQAT1A\002MBQ\001 \020\005\002u\f1b\0349u)\006t7.\0238g_R9AM`@\002\002\005\r\001\"B7|\001\004q\007\"\002:|\001\004\031\b\"\002(|\001\004\031\004\"B\035|\001\004!\007bBA\004=\021\005\021\021B\001\rG\",7m[*jI\026\fe.\037\013\004g\006-\001BB\034\002\006\001\0071\007C\004\002\020y!\t!!\005\002\025=\004HoU5eK\006s\027\020F\003t\003'\t)\002\003\0048\003\033\001\ra\r\005\007s\0055\001\031A:\t\017\005ea\004\"\001\002\034\005y1\r[3dWNKG-Z#yG\026\004H\017F\003t\003;\ty\002\003\0048\003/\001\ra\r\005\t\003C\t9\0021\001\002$\0059\021N\034<bY&$\007\003B\t\002&ML1!a\n\023\005)a$/\0329fCR,GM\020\005\b\003WqB\021AA\027\0035y\007\017^*jI\026,\005pY3qiR91/a\f\0022\005M\002BB\034\002*\001\0071\007\003\004:\003S\001\ra\035\005\t\003C\tI\0031\001\002$!9\021q\007\020\005\002\005e\022AE2iK\016\\7+\0333f\r>\024\030i\031;j_:$2a]A\036\021\0319\024Q\007a\001g!9\021q\b\020\005\002\005\005\023\001E8qiNKG-\032$pe\006\033G/[8o)\025\031\0301IA#\021\0319\024Q\ba\001g!1\021(!\020A\002MDq!!\023\037\t\003\tY%\001\013dQ\026\0347nU5eK\032{'/T8wK6,g\016\036\013\004g\0065\003BB\034\002H\001\0071\007C\004\002Ry!\t!a\025\002%=\004HoU5eK\032{'/T8wK6,g\016\036\013\006g\006U\023q\013\005\007o\005=\003\031A\032\t\re\ny\0051\001t\021\035\tYF\bC\001\003;\n\001c\0315fG.\034\026\016Z3G_J4\025mY3\025\013M\fy&!\031\t\r]\nI\0061\0014\021\035\t\031'!\027A\002M\faAZ1dS:<\007bBA4=\021\005\021\021N\001\017_B$8+\0333f\r>\024h)Y2f)\025\031\0301NA7\021\0319\024Q\ra\001g!1\021(!\032A\002MDq!!\035\037\t\023\t\031(A\005dQ\026\0347nU5eKR)1/!\036\002x!1q'a\034A\002MB\001\"!\037\002p\001\007\0211E\001\bC2dwn^3e\021\035\tiH\bC\005\003\n\021\"[:EK\032Lg.\0323\025\t\005\005\025q\021\t\004#\005\r\025bAAC%\t9!i\\8mK\006t\007BB\034\002|\001\0071\007C\004\002\fz!I!!$\002\021!\f7OV1mk\026$B!!!\002\020\"1q'!#A\002MB\021\"a%\037#\003%\t!!&\002/=\004HO\0227vS\022\034u.\0368uI\021,g-Y;mi\022\022TCAALU\r\031\024\021T\026\003\0037\003B!!(\002(6\021\021q\024\006\005\003C\013\031+A\005v]\016DWmY6fI*\031\021Q\025\n\002\025\005tgn\034;bi&|g.\003\003\002*\006}%!E;oG\",7m[3e-\006\024\030.\0318dK\"I\021Q\026\020\022\002\023\005\021QS\001\027_B$\030\n^3n\007>,h\016\036\023eK\032\fW\017\034;%e!)\021%\007a\001G\001")
/*     */ public final class ExtendedArguments {
/*     */   public static ExtendedArguments extendedArguments(Arguments paramArguments) {
/*     */     return ExtendedArguments$.MODULE$.extendedArguments(paramArguments);
/*     */   }
/*     */   
/*     */   public static class ExtendedArguments {
/*  17 */     public Arguments args() { return this.args; } private final Arguments args; public ExtendedArguments(Arguments args) {} public int optItemCount$default$2() {
/*  18 */       return 64; } public int optItemCount(int index, int default) {
/*  19 */       return (isDefined(index) && hasValue(index)) ? 
/*  20 */         package$.MODULE$.max(0, package$.MODULE$.min(64, args().checkInteger(index))) : default;
/*     */     }
/*  22 */     public int optFluidCount$default$2() { return 1000; } public int optFluidCount(int index, int default) {
/*  23 */       return (isDefined(index) && hasValue(index)) ? 
/*  24 */         package$.MODULE$.max(0, args().checkInteger(index)) : default;
/*     */     }
/*     */     public int checkSlot(IInventory inventory, int n) {
/*  27 */       int slot = args().checkInteger(n) - 1;
/*  28 */       if (slot < 0 || slot >= inventory.func_70302_i_()) {
/*  29 */         throw new IllegalArgumentException("invalid slot");
/*     */       }
/*  31 */       return slot;
/*     */     }
/*     */     
/*     */     public int optSlot(IInventory inventory, int index, int default) {
/*  35 */       return isDefined(index) ? 
/*  36 */         checkSlot(inventory, index) : default;
/*     */     }
/*     */     
/*     */     public int checkTank(MultiTank multi, int n) {
/*  40 */       int tank = args().checkInteger(n) - 1;
/*  41 */       if (tank < 0 || tank >= multi.tankCount()) {
/*  42 */         throw new IllegalArgumentException("invalid tank index");
/*     */       }
/*  44 */       return tank;
/*     */     }
/*     */     
/*     */     public FluidTankInfo checkTankInfo(IFluidHandler handler, ForgeDirection side, int n) {
/*  48 */       int tank = args().checkInteger(n) - 1;
/*  49 */       FluidTankInfo[] tankInfo = handler.getTankInfo(side);
/*  50 */       if (tankInfo == null || tank < 0 || tank >= tankInfo.length) {
/*  51 */         throw new IllegalArgumentException("invalid tank index");
/*     */       }
/*  53 */       return tankInfo[tank];
/*     */     }
/*     */     
/*     */     public FluidTankInfo optTankInfo(IFluidHandler handler, ForgeDirection side, int n, FluidTankInfo default) {
/*  57 */       return isDefined(n) ? 
/*  58 */         checkTankInfo(handler, side, n) : default;
/*     */     }
/*     */     public ForgeDirection checkSideAny(int index) {
/*  61 */       return checkSide(index, (Seq<ForgeDirection>)Predef$.MODULE$.wrapRefArray((Object[])ForgeDirection.VALID_DIRECTIONS));
/*     */     }
/*     */     public ForgeDirection optSideAny(int index, ForgeDirection default) {
/*  64 */       return isDefined(index) ? 
/*  65 */         checkSideAny(index) : default;
/*     */     }
/*  67 */     public ForgeDirection checkSideExcept(int index, Seq invalid) { return checkSide(index, (Seq<ForgeDirection>)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).filterNot((Function1)new ExtendedArguments$ExtendedArguments$$anonfun$checkSideExcept$1(this, invalid)))); } public final class ExtendedArguments$ExtendedArguments$$anonfun$checkSideExcept$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Seq invalid$1; public final boolean apply(Object elem) { return this.invalid$1.contains(elem); }
/*     */        public ExtendedArguments$ExtendedArguments$$anonfun$checkSideExcept$1(ExtendedArguments.ExtendedArguments $outer, Seq invalid$1) {} }
/*     */     public ForgeDirection optSideExcept(int index, ForgeDirection default, Seq<ForgeDirection> invalid) {
/*  70 */       return isDefined(index) ? 
/*  71 */         checkSideExcept(index, invalid) : default;
/*     */     } public ForgeDirection checkSideForAction(int index) {
/*  73 */       (new ForgeDirection[3])[0] = ForgeDirection.SOUTH; (new ForgeDirection[3])[1] = ForgeDirection.UP; (new ForgeDirection[3])[2] = ForgeDirection.DOWN; return checkSide(index, (Seq<ForgeDirection>)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[3]));
/*     */     }
/*     */     public ForgeDirection optSideForAction(int index, ForgeDirection default) {
/*  76 */       return isDefined(index) ? 
/*  77 */         checkSideForAction(index) : default;
/*     */     } public ForgeDirection checkSideForMovement(int index) {
/*  79 */       (new ForgeDirection[4])[0] = ForgeDirection.SOUTH; (new ForgeDirection[4])[1] = ForgeDirection.NORTH; (new ForgeDirection[4])[2] = ForgeDirection.UP; (new ForgeDirection[4])[3] = ForgeDirection.DOWN; return checkSide(index, (Seq<ForgeDirection>)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[4]));
/*     */     }
/*     */     public ForgeDirection optSideForMovement(int index, ForgeDirection default) {
/*  82 */       return isDefined(index) ? 
/*  83 */         checkSideForMovement(index) : default;
/*     */     } public ForgeDirection checkSideForFace(int index, ForgeDirection facing) {
/*  85 */       (new ForgeDirection[1])[0] = facing.getOpposite(); return checkSideExcept(index, (Seq<ForgeDirection>)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[1]));
/*     */     }
/*     */     public ForgeDirection optSideForFace(int index, ForgeDirection default) {
/*  88 */       return isDefined(index) ? 
/*  89 */         checkSideForAction(index) : default;
/*     */     }
/*     */     private ForgeDirection checkSide(int index, Seq allowed) {
/*  92 */       int side = args().checkInteger(index);
/*  93 */       if (side < 0 || side > 5) {
/*  94 */         throw new IllegalArgumentException("invalid side");
/*     */       }
/*  96 */       ForgeDirection direction = ForgeDirection.getOrientation(side);
/*  97 */       if (allowed.isEmpty() || allowed.contains(direction)) return direction; 
/*  98 */       throw new IllegalArgumentException("unsupported side");
/*     */     }
/*     */     private boolean isDefined(int index) {
/* 101 */       return (index >= 0 && index < args().count());
/*     */     } private boolean hasValue(int index) {
/* 103 */       return !(args().checkAny(index) == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedArguments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */