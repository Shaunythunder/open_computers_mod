/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Product;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterator;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ScalaRunTime$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-c\001B\001\003\005.\021AC\0217pG.LeN^3oi>\024\030pU8ve\016,'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001aE\003\001\031I1\022\004\005\002\016!5\taBC\001\020\003\025\0318-\0317b\023\t\tbB\001\004B]f\024VM\032\t\003'Qi\021AA\005\003+\t\021q\"\0238wK:$xN]=T_V\0248-\032\t\003\033]I!\001\007\b\003\017A\023x\016Z;diB\021QBG\005\00379\021AbU3sS\006d\027N_1cY\026D\001\"\b\001\003\026\004%\tAH\001\ta>\034\030\016^5p]V\tq\004\005\002\024A%\021\021E\001\002\016\0052|7m\033)pg&$\030n\0348\t\021\r\002!\021#Q\001\n}\t\021\002]8tSRLwN\034\021\t\021\025\002!Q3A\005\002\031\n\021\"\0338wK:$xN]=\026\003\035\002\"\001\013\030\016\003%R!!\n\026\013\005-b\023!C7j]\026\034'/\0314u\025\005i\023a\0018fi&\021q&\013\002\013\023&sg/\0328u_JL\b\002C\031\001\005#\005\013\021B\024\002\025%tg/\0328u_JL\b\005C\0034\001\021\005A'\001\004=S:LGO\020\013\004kY:\004CA\n\001\021\025i\"\0071\001 \021\025)#\0071\001(\021\035I\004!!A\005\002i\nAaY8qsR\031Qg\017\037\t\017uA\004\023!a\001?!9Q\005\017I\001\002\0049\003b\002 \001#\003%\taP\001\017G>\004\030\020\n3fM\006,H\016\036\0232+\005\001%FA\020BW\005\021\005CA\"I\033\005!%BA#G\003%)hn\0315fG.,GM\003\002H\035\005Q\021M\0348pi\006$\030n\0348\n\005%#%!E;oG\",7m[3e-\006\024\030.\0318dK\"91\nAI\001\n\003a\025AD2paf$C-\0324bk2$HEM\013\002\033*\022q%\021\005\b\037\002\t\t\021\"\021Q\0035\001(o\0343vGR\004&/\0324jqV\t\021\013\005\002S/6\t1K\003\002U+\006!A.\0318h\025\0051\026\001\0026bm\006L!\001W*\003\rM#(/\0338h\021\035Q\006!!A\005\002m\013A\002\035:pIV\034G/\021:jif,\022\001\030\t\003\033uK!A\030\b\003\007%sG\017C\004a\001\005\005I\021A1\002\035A\024x\016Z;di\026cW-\\3oiR\021!-\032\t\003\033\rL!\001\032\b\003\007\005s\027\020C\004g?\006\005\t\031\001/\002\007a$\023\007C\004i\001\005\005I\021I5\002\037A\024x\016Z;di&#XM]1u_J,\022A\033\t\004W:\024W\"\0017\013\0055t\021AC2pY2,7\r^5p]&\021q\016\034\002\t\023R,'/\031;pe\"9\021\017AA\001\n\003\021\030\001C2b]\026\013X/\0317\025\005M4\bCA\007u\023\t)hBA\004C_>dW-\0318\t\017\031\004\030\021!a\001E\"9\001\020AA\001\n\003J\030\001\0035bg\"\034u\016Z3\025\003qCqa\037\001\002\002\023\005C0\001\005u_N#(/\0338h)\005\t\006b\002@\001\003\003%\te`\001\007KF,\030\r\\:\025\007M\f\t\001C\004g{\006\005\t\031\0012\b\023\005\025!!!A\t\002\005\035\021\001\006\"m_\016\\\027J\034<f]R|'/_*pkJ\034W\rE\002\024\003\0231\001\"\001\002\002\002#\005\0211B\n\006\003\023\ti!\007\t\b\003\037\t)bH\0246\033\t\t\tBC\002\002\0249\tqA];oi&lW-\003\003\002\030\005E!!E!cgR\024\030m\031;Gk:\034G/[8oe!91'!\003\005\002\005mACAA\004\021!Y\030\021BA\001\n\013b\bBCA\021\003\023\t\t\021\"!\002$\005)\021\r\0359msR)Q'!\n\002(!1Q$a\bA\002}Aa!JA\020\001\0049\003BCA\026\003\023\t\t\021\"!\002.\0059QO\\1qa2LH\003BA\030\003w\001R!DA\031\003kI1!a\r\017\005\031y\005\017^5p]B)Q\"a\016 O%\031\021\021\b\b\003\rQ+\b\017\\33\021%\ti$!\013\002\002\003\007Q'A\002yIAB!\"!\021\002\n\005\005I\021BA\"\003-\021X-\0313SKN|GN^3\025\005\005\025\003c\001*\002H%\031\021\021J*\003\r=\023'.Z2u\001")
/*     */ public final class BlockInventorySource
/*     */   implements InventorySource, Product, Serializable
/*     */ {
/*     */   private final BlockPosition position;
/*     */   private final IInventory inventory;
/*     */   
/*     */   public static Option<Tuple2<BlockPosition, IInventory>> unapply(BlockInventorySource paramBlockInventorySource) {
/*     */     return BlockInventorySource$.MODULE$.unapply(paramBlockInventorySource);
/*     */   }
/*     */   
/*     */   public static BlockInventorySource apply(BlockPosition paramBlockPosition, IInventory paramIInventory) {
/*     */     return BlockInventorySource$.MODULE$.apply(paramBlockPosition, paramIInventory);
/*     */   }
/*     */   
/*     */   public static Function1<Tuple2<BlockPosition, IInventory>, BlockInventorySource> tupled() {
/*     */     return BlockInventorySource$.MODULE$.tupled();
/*     */   }
/*     */   
/*     */   public static Function1<BlockPosition, Function1<IInventory, BlockInventorySource>> curried() {
/*     */     return BlockInventorySource$.MODULE$.curried();
/*     */   }
/*     */   
/*     */   public BlockPosition position() {
/* 428 */     return this.position; } public IInventory inventory() { return this.inventory; } public BlockInventorySource copy(BlockPosition position, IInventory inventory) { return new BlockInventorySource(position, inventory); } public BlockPosition copy$default$1() { return position(); } public IInventory copy$default$2() { return inventory(); } public String productPrefix() { return "BlockInventorySource"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return position(); } public Iterator<Object> productIterator() { return ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof BlockInventorySource; } public int hashCode() { return ScalaRunTime$.MODULE$._hashCode(this); } public String toString() { return ScalaRunTime$.MODULE$._toString(this); } public BlockInventorySource(BlockPosition position, IInventory inventory) { Product.class.$init$(this); }
/*     */ 
/*     */   
/*     */   public boolean equals(Object x$1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: if_acmpeq -> 103
/*     */     //   5: aload_1
/*     */     //   6: astore_2
/*     */     //   7: aload_2
/*     */     //   8: instanceof li/cil/oc/util/BlockInventorySource
/*     */     //   11: ifeq -> 19
/*     */     //   14: iconst_1
/*     */     //   15: istore_3
/*     */     //   16: goto -> 21
/*     */     //   19: iconst_0
/*     */     //   20: istore_3
/*     */     //   21: iload_3
/*     */     //   22: ifeq -> 107
/*     */     //   25: aload_1
/*     */     //   26: checkcast li/cil/oc/util/BlockInventorySource
/*     */     //   29: astore #4
/*     */     //   31: aload_0
/*     */     //   32: invokevirtual position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   35: aload #4
/*     */     //   37: invokevirtual position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   40: astore #5
/*     */     //   42: dup
/*     */     //   43: ifnonnull -> 55
/*     */     //   46: pop
/*     */     //   47: aload #5
/*     */     //   49: ifnull -> 63
/*     */     //   52: goto -> 99
/*     */     //   55: aload #5
/*     */     //   57: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 99
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   67: aload #4
/*     */     //   69: invokevirtual inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   72: astore #6
/*     */     //   74: dup
/*     */     //   75: ifnonnull -> 87
/*     */     //   78: pop
/*     */     //   79: aload #6
/*     */     //   81: ifnull -> 95
/*     */     //   84: goto -> 99
/*     */     //   87: aload #6
/*     */     //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_1
/*     */     //   96: goto -> 100
/*     */     //   99: iconst_0
/*     */     //   100: ifeq -> 107
/*     */     //   103: iconst_1
/*     */     //   104: goto -> 108
/*     */     //   107: iconst_0
/*     */     //   108: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #428	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	109	0	this	Lli/cil/oc/util/BlockInventorySource;
/*     */     //   0	109	1	x$1	Ljava/lang/Object;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\BlockInventorySource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */