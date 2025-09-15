/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Product;
/*    */ import scala.Tuple4;
/*    */ import scala.runtime.ScalaRunTime$;
/*    */ import scala.runtime.Statics;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ud\001B\001\003\001>\021\001DU3egR|g.Z\"iC:<W\rZ#wK:$\030I]4t\025\t\031A!\001\004ue\006LGo\035\006\003\013\031\t!\002^5mK\026tG/\033;z\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011\003\002\001\021-e\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007CA\t\030\023\tA\"CA\004Qe>$Wo\031;\021\005EQ\022BA\016\023\0051\031VM]5bY&T\030M\0317f\021!i\002A!f\001\n\003q\022\001B:jI\026,\022a\b\t\003A!j\021!\t\006\003E\r\nA!\036;jY*\021q\001\n\006\003K\031\na\"\\5oK\016\024\030M\032;g_J<WMC\001(\003\rqW\r^\005\003S\005\022aBR8sO\026$\025N]3di&|g\016\003\005,\001\tE\t\025!\003 \003\025\031\030\016Z3!\021!i\003A!f\001\n\003q\023\001C8mIZ\013G.^3\026\003=\002\"!\005\031\n\005E\022\"aA%oi\"A1\007\001B\tB\003%q&A\005pY\0224\026\r\\;fA!AQ\007\001BK\002\023\005a&\001\005oK^4\026\r\\;f\021!9\004A!E!\002\023y\023!\0038foZ\013G.^3!\021!I\004A!f\001\n\003q\023!B2pY>\024\b\002C\036\001\005#\005\013\021B\030\002\r\r|Gn\034:!\021\025i\004\001\"\001?\003\031a\024N\\5u}Q)q(\021\"D\tB\021\001\tA\007\002\005!)Q\004\020a\001?!)Q\006\020a\001_!)Q\007\020a\001_!9\021\b\020I\001\002\004y\003b\002$\001\003\003%\taR\001\005G>\004\030\020F\003@\021&S5\nC\004\036\013B\005\t\031A\020\t\0175*\005\023!a\001_!9Q'\022I\001\002\004y\003bB\035F!\003\005\ra\f\005\b\033\002\t\n\021\"\001O\0039\031w\016]=%I\0264\027-\0367uIE*\022a\024\026\003?A[\023!\025\t\003%^k\021a\025\006\003)V\013\021\"\0368dQ\026\0347.\0323\013\005Y\023\022AC1o]>$\030\r^5p]&\021\001l\025\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007b\002.\001#\003%\taW\001\017G>\004\030\020\n3fM\006,H\016\036\0233+\005a&FA\030Q\021\035q\006!%A\005\002m\013abY8qs\022\"WMZ1vYR$3\007C\004a\001E\005I\021A.\002\035\r|\007/\037\023eK\032\fW\017\034;%i!9!\rAA\001\n\003\032\027!\0049s_\022,8\r\036)sK\032L\0070F\001e!\t)'.D\001g\025\t9\007.\001\003mC:<'\"A5\002\t)\fg/Y\005\003W\032\024aa\025;sS:<\007bB7\001\003\003%\tAL\001\raJ|G-^2u\003JLG/\037\005\b_\002\t\t\021\"\001q\0039\001(o\0343vGR,E.Z7f]R$\"!\035;\021\005E\021\030BA:\023\005\r\te.\037\005\bk:\f\t\0211\0010\003\rAH%\r\005\bo\002\t\t\021\"\021y\003=\001(o\0343vGRLE/\032:bi>\024X#A=\021\007il\030/D\001|\025\ta(#\001\006d_2dWm\031;j_:L!A`>\003\021%#XM]1u_JD\021\"!\001\001\003\003%\t!a\001\002\021\r\fg.R9vC2$B!!\002\002\fA\031\021#a\002\n\007\005%!CA\004C_>dW-\0318\t\017U|\030\021!a\001c\"I\021q\002\001\002\002\023\005\023\021C\001\tQ\006\034\bnQ8eKR\tq\006C\005\002\026\001\t\t\021\"\021\002\030\005AAo\\*ue&tw\rF\001e\021%\tY\002AA\001\n\003\ni\"\001\004fcV\fGn\035\013\005\003\013\ty\002\003\005v\0033\t\t\0211\001r\017%\t\031CAA\001\022\003\t)#\001\rSK\022\034Ho\0348f\007\"\fgnZ3e\013Z,g\016^!sON\0042\001QA\024\r!\t!!!A\t\002\005%2#BA\024\003WI\002#CA\027\003gyrfL\030@\033\t\tyCC\002\0022I\tqA];oi&lW-\003\003\0026\005=\"!E!cgR\024\030m\031;Gk:\034G/[8oi!9Q(a\n\005\002\005eBCAA\023\021)\t)\"a\n\002\002\023\025\023q\003\005\013\003\t9#!A\005\002\006\005\023!B1qa2LH#C \002D\005\025\023qIA%\021\031i\022Q\ba\001?!1Q&!\020A\002=Ba!NA\037\001\004y\003\002C\035\002>A\005\t\031A\030\t\025\0055\023qEA\001\n\003\013y%A\004v]\006\004\b\017\\=\025\t\005E\023Q\f\t\006#\005M\023qK\005\004\003+\022\"AB(qi&|g\016E\004\022\0033zrfL\030\n\007\005m#C\001\004UkBdW\r\016\005\n\003?\nY%!AA\002}\n1\001\037\0231\021%\t\031'a\n\022\002\023\0051,A\bbaBd\027\020\n3fM\006,H\016\036\0235\021%\t9'a\n\022\002\023\0051,A\016%Y\026\0348/\0338ji\022:'/Z1uKJ$C-\0324bk2$H\005\016\005\013\003W\n9#!A\005\n\0055\024a\003:fC\022\024Vm]8mm\026$\"!a\034\021\007\025\f\t(C\002\002t\031\024aa\0242kK\016$\b")
/*    */ public class RedstoneChangedEventArgs implements Product, Serializable {
/*    */   private final ForgeDirection side;
/*    */   private final int oldValue;
/*    */   private final int newValue;
/*    */   private final int color;
/*    */   
/*    */   public static int $lessinit$greater$default$4() {
/*    */     return RedstoneChangedEventArgs$.MODULE$.$lessinit$greater$default$4();
/*    */   }
/*    */   
/* 21 */   public ForgeDirection side() { return this.side; } public static int apply$default$4() { return RedstoneChangedEventArgs$.MODULE$.apply$default$4(); } public static Option<Tuple4<ForgeDirection, Object, Object, Object>> unapply(RedstoneChangedEventArgs paramRedstoneChangedEventArgs) { return RedstoneChangedEventArgs$.MODULE$.unapply(paramRedstoneChangedEventArgs); } public static RedstoneChangedEventArgs apply(ForgeDirection paramForgeDirection, int paramInt1, int paramInt2, int paramInt3) { return RedstoneChangedEventArgs$.MODULE$.apply(paramForgeDirection, paramInt1, paramInt2, paramInt3); } public static Function1<Tuple4<ForgeDirection, Object, Object, Object>, RedstoneChangedEventArgs> tupled() { return RedstoneChangedEventArgs$.MODULE$.tupled(); } public static Function1<ForgeDirection, Function1<Object, Function1<Object, Function1<Object, RedstoneChangedEventArgs>>>> curried() { return RedstoneChangedEventArgs$.MODULE$.curried(); } public int oldValue() { return this.oldValue; } public int newValue() { return this.newValue; } public int color() { return this.color; } public RedstoneChangedEventArgs copy(ForgeDirection side, int oldValue, int newValue, int color) { return new RedstoneChangedEventArgs(side, oldValue, newValue, color); } public ForgeDirection copy$default$1() { return side(); } public int copy$default$2() { return oldValue(); } public int copy$default$3() { return newValue(); } public int copy$default$4() { return color(); } public String productPrefix() { return "RedstoneChangedEventArgs"; } public int productArity() { return 4; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 3: case 2: case 1: case 0: break; }  return side(); } public Iterator<Object> productIterator() { return ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof RedstoneChangedEventArgs; } public int hashCode() { int i = -889275714; i = Statics.mix(i, Statics.anyHash(side())); i = Statics.mix(i, oldValue()); i = Statics.mix(i, newValue()); i = Statics.mix(i, color()); return Statics.finalizeHash(i, 4); } public String toString() { return ScalaRunTime$.MODULE$._toString(this); } public boolean equals(Object x$1) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: if_acmpeq -> 116
/*    */     //   5: aload_1
/*    */     //   6: astore_2
/*    */     //   7: aload_2
/*    */     //   8: instanceof li/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs
/*    */     //   11: ifeq -> 19
/*    */     //   14: iconst_1
/*    */     //   15: istore_3
/*    */     //   16: goto -> 21
/*    */     //   19: iconst_0
/*    */     //   20: istore_3
/*    */     //   21: iload_3
/*    */     //   22: ifeq -> 120
/*    */     //   25: aload_1
/*    */     //   26: checkcast li/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs
/*    */     //   29: astore #4
/*    */     //   31: aload_0
/*    */     //   32: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   35: aload #4
/*    */     //   37: invokevirtual side : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   40: astore #5
/*    */     //   42: dup
/*    */     //   43: ifnonnull -> 55
/*    */     //   46: pop
/*    */     //   47: aload #5
/*    */     //   49: ifnull -> 63
/*    */     //   52: goto -> 112
/*    */     //   55: aload #5
/*    */     //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   60: ifeq -> 112
/*    */     //   63: aload_0
/*    */     //   64: invokevirtual oldValue : ()I
/*    */     //   67: aload #4
/*    */     //   69: invokevirtual oldValue : ()I
/*    */     //   72: if_icmpne -> 112
/*    */     //   75: aload_0
/*    */     //   76: invokevirtual newValue : ()I
/*    */     //   79: aload #4
/*    */     //   81: invokevirtual newValue : ()I
/*    */     //   84: if_icmpne -> 112
/*    */     //   87: aload_0
/*    */     //   88: invokevirtual color : ()I
/*    */     //   91: aload #4
/*    */     //   93: invokevirtual color : ()I
/*    */     //   96: if_icmpne -> 112
/*    */     //   99: aload #4
/*    */     //   101: aload_0
/*    */     //   102: invokevirtual canEqual : (Ljava/lang/Object;)Z
/*    */     //   105: ifeq -> 112
/*    */     //   108: iconst_1
/*    */     //   109: goto -> 113
/*    */     //   112: iconst_0
/*    */     //   113: ifeq -> 120
/*    */     //   116: iconst_1
/*    */     //   117: goto -> 121
/*    */     //   120: iconst_0
/*    */     //   121: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	122	0	this	Lli/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs;
/* 21 */     //   0	122	1	x$1	Ljava/lang/Object; } public RedstoneChangedEventArgs(ForgeDirection side, int oldValue, int newValue, int color) { Product.class.$init$(this); }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\RedstoneChangedEventArgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */