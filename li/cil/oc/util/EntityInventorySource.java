/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
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
/*     */ @ScalaSignature(bytes = "\006\001\005=c\001B\001\003\005.\021Q#\0228uSRL\030J\034<f]R|'/_*pkJ\034WM\003\002\004\t\005!Q\017^5m\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001A\n\006\0011\021b#\007\t\003\033Ai\021A\004\006\002\037\005)1oY1mC&\021\021C\004\002\007\003:L(+\0324\021\005M!R\"\001\002\n\005U\021!aD%om\026tGo\034:z'>,(oY3\021\00559\022B\001\r\017\005\035\001&o\0343vGR\004\"!\004\016\n\005mq!\001D*fe&\fG.\033>bE2,\007\002C\017\001\005+\007I\021\001\020\002\r\025tG/\033;z+\005y\002C\001\021'\033\005\t#BA\017#\025\t\031C%A\005nS:,7M]1gi*\tQ%A\002oKRL!aJ\021\003\r\025sG/\033;z\021!I\003A!E!\002\023y\022aB3oi&$\030\020\t\005\tW\001\021)\032!C\001Y\005I\021N\034<f]R|'/_\013\002[A\021a\006M\007\002_)\0211FI\005\003c=\022!\"S%om\026tGo\034:z\021!\031\004A!E!\002\023i\023AC5om\026tGo\034:zA!)Q\007\001C\001m\0051A(\0338jiz\"2a\016\035:!\t\031\002\001C\003\036i\001\007q\004C\003,i\001\007Q\006C\004<\001\005\005I\021\001\037\002\t\r|\007/\037\013\004our\004bB\017;!\003\005\ra\b\005\bWi\002\n\0211\001.\021\035\001\005!%A\005\002\005\013abY8qs\022\"WMZ1vYR$\023'F\001CU\ty2iK\001E!\t)%*D\001G\025\t9\005*A\005v]\016DWmY6fI*\021\021JD\001\013C:tw\016^1uS>t\027BA&G\005E)hn\0315fG.,GMV1sS\006t7-\032\005\b\033\002\t\n\021\"\001O\0039\031w\016]=%I\0264\027-\0367uII*\022a\024\026\003[\rCq!\025\001\002\002\023\005#+A\007qe>$Wo\031;Qe\0264\027\016_\013\002'B\021A+W\007\002+*\021akV\001\005Y\006twMC\001Y\003\021Q\027M^1\n\005i+&AB*ue&tw\rC\004]\001\005\005I\021A/\002\031A\024x\016Z;di\006\023\030\016^=\026\003y\003\"!D0\n\005\001t!aA%oi\"9!\rAA\001\n\003\031\027A\0049s_\022,8\r^#mK6,g\016\036\013\003I\036\004\"!D3\n\005\031t!aA!os\"9\001.YA\001\002\004q\026a\001=%c!9!\016AA\001\n\003Z\027a\0049s_\022,8\r^%uKJ\fGo\034:\026\0031\0042!\0349e\033\005q'BA8\017\003)\031w\016\0347fGRLwN\\\005\003c:\024\001\"\023;fe\006$xN\035\005\bg\002\t\t\021\"\001u\003!\031\027M\\#rk\006dGCA;y!\tia/\003\002x\035\t9!i\\8mK\006t\007b\0025s\003\003\005\r\001\032\005\bu\002\t\t\021\"\021|\003!A\027m\0355D_\022,G#\0010\t\017u\004\021\021!C!}\006AAo\\*ue&tw\rF\001T\021%\t\t\001AA\001\n\003\n\031!\001\004fcV\fGn\035\013\004k\006\025\001b\0025\000\003\003\005\r\001Z\004\n\003\023\021\021\021!E\001\003\027\tQ#\0228uSRL\030J\034<f]R|'/_*pkJ\034W\rE\002\024\003\0331\001\"\001\002\002\002#\005\021qB\n\006\003\033\t\t\"\007\t\b\003'\tIbH\0278\033\t\t)BC\002\002\0309\tqA];oi&lW-\003\003\002\034\005U!!E!cgR\024\030m\031;Gk:\034G/[8oe!9Q'!\004\005\002\005}ACAA\006\021!i\030QBA\001\n\013r\bBCA\023\003\033\t\t\021\"!\002(\005)\021\r\0359msR)q'!\013\002,!1Q$a\tA\002}AaaKA\022\001\004i\003BCA\030\003\033\t\t\021\"!\0022\0059QO\\1qa2LH\003BA\032\003\001R!DA\033\003sI1!a\016\017\005\031y\005\017^5p]B)Q\"a\017 [%\031\021Q\b\b\003\rQ+\b\017\\33\021%\t\t%!\f\002\002\003\007q'A\002yIAB!\"!\022\002\016\005\005I\021BA$\003-\021X-\0313SKN|GN^3\025\005\005%\003c\001+\002L%\031\021QJ+\003\r=\023'.Z2u\001")
/*     */ public final class EntityInventorySource
/*     */   implements InventorySource, Product, Serializable
/*     */ {
/*     */   private final Entity entity;
/*     */   private final IInventory inventory;
/*     */   
/*     */   public static Option<Tuple2<Entity, IInventory>> unapply(EntityInventorySource paramEntityInventorySource) {
/*     */     return EntityInventorySource$.MODULE$.unapply(paramEntityInventorySource);
/*     */   }
/*     */   
/*     */   public static EntityInventorySource apply(Entity paramEntity, IInventory paramIInventory) {
/*     */     return EntityInventorySource$.MODULE$.apply(paramEntity, paramIInventory);
/*     */   }
/*     */   
/*     */   public static Function1<Tuple2<Entity, IInventory>, EntityInventorySource> tupled() {
/*     */     return EntityInventorySource$.MODULE$.tupled();
/*     */   }
/*     */   
/*     */   public static Function1<Entity, Function1<IInventory, EntityInventorySource>> curried() {
/*     */     return EntityInventorySource$.MODULE$.curried();
/*     */   }
/*     */   
/*     */   public Entity entity() {
/* 429 */     return this.entity; } public IInventory inventory() { return this.inventory; } public EntityInventorySource copy(Entity entity, IInventory inventory) { return new EntityInventorySource(entity, inventory); } public Entity copy$default$1() { return entity(); } public IInventory copy$default$2() { return inventory(); } public String productPrefix() { return "EntityInventorySource"; } public int productArity() { return 2; } public Object productElement(int x$1) { int i = x$1; switch (i) { default: throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());case 1: case 0: break; }  return entity(); } public Iterator<Object> productIterator() { return ScalaRunTime$.MODULE$.typedProductIterator(this); } public boolean canEqual(Object x$1) { return x$1 instanceof EntityInventorySource; } public int hashCode() { return ScalaRunTime$.MODULE$._hashCode(this); } public String toString() { return ScalaRunTime$.MODULE$._toString(this); } public EntityInventorySource(Entity entity, IInventory inventory) { Product.class.$init$(this); }
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
/*     */     //   8: instanceof li/cil/oc/util/EntityInventorySource
/*     */     //   11: ifeq -> 19
/*     */     //   14: iconst_1
/*     */     //   15: istore_3
/*     */     //   16: goto -> 21
/*     */     //   19: iconst_0
/*     */     //   20: istore_3
/*     */     //   21: iload_3
/*     */     //   22: ifeq -> 107
/*     */     //   25: aload_1
/*     */     //   26: checkcast li/cil/oc/util/EntityInventorySource
/*     */     //   29: astore #4
/*     */     //   31: aload_0
/*     */     //   32: invokevirtual entity : ()Lnet/minecraft/entity/Entity;
/*     */     //   35: aload #4
/*     */     //   37: invokevirtual entity : ()Lnet/minecraft/entity/Entity;
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
/*     */     //   #429	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	109	0	this	Lli/cil/oc/util/EntityInventorySource;
/*     */     //   0	109	1	x$1	Ljava/lang/Object;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\EntityInventorySource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */