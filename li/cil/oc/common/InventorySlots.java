/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import scala.Option;
/*     */ import scala.Product;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterator;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.Statics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Ut!B\001\003\021\003Y\021AD%om\026tGo\034:z'2|Go\035\006\003\007\021\taaY8n[>t'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001A\021A\"D\007\002\005\031)aB\001E\001\037\tq\021J\034<f]R|'/_*m_R\0348CA\007\021!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005\031\te.\037*fM\")q#\004C\0011\0051A(\0338jiz\"\022a\003\005\b55\021\r\021\"\001\034\003!\031w.\0349vi\026\024X#\001\017\021\007Eir$\003\002\037%\t)\021I\035:bsB\031\021#\b\021\021\005\005\022S\"A\007\007\t\rj\001\t\n\002\016\023:4XM\034;pef\034Fn\034;\024\t\t\002R\005\013\t\003#\031J!a\n\n\003\017A\023x\016Z;diB\021\021#K\005\003UI\021AbU3sS\006d\027N_1cY\026D\001\002\f\022\003\026\004%\t!L\001\005g2|G/F\001/!\ty#G\004\002\022a%\021\021GE\001\007!J,G-\0324\n\005M\"$AB*ue&twM\003\0022%!AaG\tB\tB\003%a&A\003tY>$\b\005\003\0059E\tU\r\021\"\001:\003\021!\030.\032:\026\003i\002\"!E\036\n\005q\022\"aA%oi\"AaH\tB\tB\003%!(A\003uS\026\024\b\005C\003\030E\021\005\001\tF\002!\003\nCQ\001L A\0029BQ\001O A\002iBq\001\022\022\002\002\023\005Q)\001\003d_BLHc\001\021G\017\"9Af\021I\001\002\004q\003b\002\035D!\003\005\rA\017\005\b\023\n\n\n\021\"\001K\0039\031w\016]=%I\0264\027-\0367uIE*\022a\023\026\003]1[\023!\024\t\003\035Nk\021a\024\006\003!F\013\021\"\0368dQ\026\0347.\0323\013\005I\023\022AC1o]>$\030\r^5p]&\021Ak\024\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007b\002,##\003%\taV\001\017G>\004\030\020\n3fM\006,H\016\036\0233+\005A&F\001\036M\021\035Q&%!A\005Bm\013Q\002\035:pIV\034G\017\025:fM&DX#\001/\021\005u\023W\"\0010\013\005}\003\027\001\0027b]\036T\021!Y\001\005U\0064\030-\003\0024=\"9AMIA\001\n\003I\024\001\0049s_\022,8\r^!sSRL\bb\0024#\003\003%\taZ\001\017aJ|G-^2u\0132,W.\0328u)\tA7\016\005\002\022S&\021!N\005\002\004\003:L\bb\0027f\003\003\005\rAO\001\004q\022\n\004b\0028#\003\003%\te\\\001\020aJ|G-^2u\023R,'/\031;peV\t\001\017E\002ri\"l\021A\035\006\003gJ\t!bY8mY\026\034G/[8o\023\t)(O\001\005Ji\026\024\030\r^8s\021\0359(%!A\005\002a\f\001bY1o\013F,\030\r\034\013\003sr\004\"!\005>\n\005m\024\"a\002\"p_2,\027M\034\005\bYZ\f\t\0211\001i\021\035q(%!A\005B}\f\001\002[1tQ\016{G-\032\013\002u!I\0211\001\022\002\002\023\005\023QA\001\ti>\034FO]5oOR\tA\fC\005\002\n\t\n\t\021\"\021\002\f\0051Q-];bYN$2!_A\007\021!a\027qAA\001\002\004A\007bBA\t\033\001\006I\001H\001\nG>l\007/\036;fe\002B\001\"!\006\016\005\004%\taG\001\007g\026\024h/\032:\t\017\005eQ\002)A\0059\00591/\032:wKJ\004\003\"CA\017\033\t\007I\021AA\020\003\025\021X\r\\1z+\005y\002bBA\022\033\001\006IaH\001\007e\026d\027-\037\021\t\023\005\035RB1A\005\002\005}\021AB:xSR\034\007\016C\004\002,5\001\013\021B\020\002\017M<\030\016^2iA\035I\021qF\007\002\002#\005\021\021G\001\016\023:4XM\034;pef\034Fn\034;\021\007\005\n\031D\002\005$\033\005\005\t\022AA\033'\025\t\031$a\016)!\035\tI$a\020/u\001j!!a\017\013\007\005u\"#A\004sk:$\030.\\3\n\t\005\005\0231\b\002\022\003\n\034HO]1di\032+hn\031;j_:\024\004bB\f\0024\021\005\021Q\t\013\003\003cA!\"a\001\0024\005\005IQIA\003\021)\tY%a\r\002\002\023\005\025QJ\001\006CB\004H.\037\013\006A\005=\023\021\013\005\007Y\005%\003\031\001\030\t\ra\nI\0051\001;\021)\t)&a\r\002\002\023\005\025qK\001\bk:\f\007\017\0357z)\021\tI&!\032\021\013E\tY&a\030\n\007\005u#C\001\004PaRLwN\034\t\006#\005\005dFO\005\004\003G\022\"A\002+va2,'\007C\005\002h\005M\023\021!a\001A\005\031\001\020\n\031\t\025\005-\0241GA\001\n\023\ti'A\006sK\006$'+Z:pYZ,GCAA8!\ri\026\021O\005\004\003gr&AB(cU\026\034G\017")
/*     */ public final class InventorySlots
/*     */ {
/*     */   public static InventorySlot[] switch() {
/*     */     return InventorySlots$.MODULE$.switch();
/*     */   }
/*     */   
/*     */   public static InventorySlot[] relay() {
/*     */     return InventorySlots$.MODULE$.relay();
/*     */   }
/*     */   
/*     */   public static InventorySlot[][] server() {
/*     */     return InventorySlots$.MODULE$.server();
/*     */   }
/*     */   
/*     */   public static InventorySlot[][] computer() {
/*     */     return InventorySlots$.MODULE$.computer();
/*     */   }
/*     */   
/*     */   public static class InventorySlot
/*     */     implements Product, Serializable
/*     */   {
/*     */     private final String slot;
/*     */     private final int tier;
/*     */     
/*     */     public String slot() {
/* 136 */       return this.slot; } public int tier() { return this.tier; } public InventorySlot copy(String slot, int tier) { return new InventorySlot(slot, tier); } public String copy$default$1() { return slot(); } public int copy$default$2() { return tier(); } public String productPrefix() { return "InventorySlot"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return slot(); } public Iterator<Object> productIterator() { return scala.runtime.ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof InventorySlot; } public int hashCode() { int i = -889275714; i = Statics.mix(i, Statics.anyHash(slot())); i = Statics.mix(i, tier()); return Statics.finalizeHash(i, 2); } public boolean equals(Object x$1) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: if_acmpeq -> 92
/*     */       //   5: aload_1
/*     */       //   6: astore_2
/*     */       //   7: aload_2
/*     */       //   8: instanceof li/cil/oc/common/InventorySlots$InventorySlot
/*     */       //   11: ifeq -> 19
/*     */       //   14: iconst_1
/*     */       //   15: istore_3
/*     */       //   16: goto -> 21
/*     */       //   19: iconst_0
/*     */       //   20: istore_3
/*     */       //   21: iload_3
/*     */       //   22: ifeq -> 96
/*     */       //   25: aload_1
/*     */       //   26: checkcast li/cil/oc/common/InventorySlots$InventorySlot
/*     */       //   29: astore #4
/*     */       //   31: aload_0
/*     */       //   32: invokevirtual slot : ()Ljava/lang/String;
/*     */       //   35: aload #4
/*     */       //   37: invokevirtual slot : ()Ljava/lang/String;
/*     */       //   40: astore #5
/*     */       //   42: dup
/*     */       //   43: ifnonnull -> 55
/*     */       //   46: pop
/*     */       //   47: aload #5
/*     */       //   49: ifnull -> 63
/*     */       //   52: goto -> 88
/*     */       //   55: aload #5
/*     */       //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   60: ifeq -> 88
/*     */       //   63: aload_0
/*     */       //   64: invokevirtual tier : ()I
/*     */       //   67: aload #4
/*     */       //   69: invokevirtual tier : ()I
/*     */       //   72: if_icmpne -> 88
/*     */       //   75: aload #4
/*     */       //   77: aload_0
/*     */       //   78: invokevirtual canEqual : (Ljava/lang/Object;)Z
/*     */       //   81: ifeq -> 88
/*     */       //   84: iconst_1
/*     */       //   85: goto -> 89
/*     */       //   88: iconst_0
/*     */       //   89: ifeq -> 96
/*     */       //   92: iconst_1
/*     */       //   93: goto -> 97
/*     */       //   96: iconst_0
/*     */       //   97: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #136	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	98	0	this	Lli/cil/oc/common/InventorySlots$InventorySlot;
/* 136 */       //   0	98	1	x$1	Ljava/lang/Object; } public String toString() { return scala.runtime.ScalaRunTime$.MODULE$._toString(this); } public InventorySlot(String slot, int tier) { Product.class.$init$(this); } } public static class InventorySlot$ extends AbstractFunction2<String, Object, InventorySlot> implements Serializable { public static final InventorySlot$ MODULE$; public final String toString() { return "InventorySlot"; } public InventorySlots.InventorySlot apply(String slot, int tier) { return new InventorySlots.InventorySlot(slot, tier); } public Option<Tuple2<String, Object>> unapply(InventorySlots.InventorySlot x$0) { return (x$0 == null) ? (Option<Tuple2<String, Object>>)scala.None$.MODULE$ : (Option<Tuple2<String, Object>>)new Some(new Tuple2(x$0.slot(), BoxesRunTime.boxToInteger(x$0.tier()))); } private Object readResolve() { return MODULE$; } public InventorySlot$() { MODULE$ = this; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\InventorySlots.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */