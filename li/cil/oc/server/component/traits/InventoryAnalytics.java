/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.server.component.UpgradeDatabase;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import li.cil.oc.util.InventoryUtils$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001]3q!\001\002\021\002\007\005qB\001\nJ]Z,g\016^8ss\006s\027\r\\=uS\016\034(BA\002\005\003\031!(/Y5ug*\021QAB\001\nG>l\007o\0348f]RT!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\005\001A1\"\004\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\t\003/ai\021AA\005\0033\t\021a\"\0238wK:$xN]=Bo\006\024X\r\005\002\0307%\021AD\001\002\r\035\026$xo\034:l\003^\f'/\032\005\006=\001!\taH\001\007I%t\027\016\036\023\025\003\001\002\"!E\021\n\005\t\022\"\001B+oSRDQ\001\n\001\005\002\025\nacZ3u'R\f7m[%o\023:$XM\0358bYNcw\016\036\013\004M%\032\004cA\t(!%\021\001F\005\002\006\003J\024\030-\037\005\006U\r\002\raK\001\bG>tG/\032=u!\ta\023'D\001.\025\tqs&A\004nC\016D\027N\\3\013\005AB\021aA1qS&\021!'\f\002\b\007>tG/\032=u\021\025!4\0051\0016\003\021\t'oZ:\021\00512\024BA\034.\005%\t%oZ;nK:$8\017\013\003$sqj\004C\001\027;\023\tYTF\001\005DC2d'-Y2l\003\r!wnY\021\002}\005Yg-\0368di&|g\016K.tY>$(H\\;nE\026\024X,\013\036uC\ndW\rI\027.A\035+G\017I1!I\026\0348M]5qi&|g\016I8gAQDW\rI:uC\016\\\007%\0338!i\",\007e\0359fG&4\027.\0323!g2|G\017I8sAQDW\rI:fY\026\034G/\0323!g2|GO\f\005\006\001\002!\t!Q\001\017SN,\025/^5wC2,g\016\036+p)\r1#i\021\005\006U}\002\ra\013\005\006i}\002\r!\016\025\005ebT)I\001G\003\005\rc-\0368di&|g\016K8uQ\026\0248\013\\8uu9,XNY3sSi\022wn\0347fC:\004S&\f\021HKR\004s\017[3uQ\026\024\b\005\0365fAM$\030mY6!S:\004C\017[3!g\026dWm\031;fI\002\032Hn\034;!SN\004S-];jm\006dWM\034;!i>\004C\017[3!SR,W\016I5oAQDW\rI:qK\016Lg-[3eAMdw\016\036\021)Q\0064X\rI:iCJ,G\rI(sK\022K7\r^5p]\006\024\030\020I%Eg&r\003\"\002%\001\t\003I\025!D:u_J,\027J\034;fe:\fG\016F\002'\025.CQAK$A\002-BQ\001N$A\002UBCaR\035=\033\006\na*AA$MVt7\r^5p]\"\032Hn\034;;]Vl'-\032:-A\021\024\027\t\0323sKN\034(h\035;sS:<G\006\t3c'2|GO\0178v[\n,'/\013\036c_>dW-\0318![5\0023\013^8sK\002\ng\016I5uK6\0043\017^1dW\002\"Wm]2sSB$\030n\0348!S:\004C\017[3!gB,7-\0334jK\022\0043\017\\8uA=4\007\005\0365fA\021\fG/\0312bg\026\004s/\033;iAQDW\rI:qK\016Lg-[3eA\005$GM]3tg:BQ\001\025\001\005\002E\013\021cY8na\006\024X\rV8ECR\f'-Y:f)\r1#k\025\005\006U=\003\ra\013\005\006i=\003\r!\016\025\005\037fbT+I\001W\003\0055d-\0368di&|g\016K:m_RTd.^7cKJd\003\005\0322BI\022\024Xm]:;gR\024\030N\\4-A\021\0247\013\\8uu9,XNY3s72\0023\r[3dW:\023EK\0172p_2,\027M\\\037gC2\034X-X\025;E>|G.Z1oA5j\003eQ8na\006\024X\rI1oA%$X-\034\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\032Hn\034;!o&$\b\016I8oK\002Jg\016\t;iK\002\"\027\r^1cCN,\007e^5uQ\002\"\b.\032\021ta\026\034\027NZ5fI\002\nG\r\032:fgNt\003")
/*    */ public interface InventoryAnalytics extends InventoryAware, NetworkAware {
/*    */   @Callback(doc = "function([slot:number]):table -- Get a description of the stack in the specified slot or the selected slot.")
/*    */   Object[] getStackInInternalSlot(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(otherSlot:number):boolean -- Get whether the stack in the selected slot is equivalent to the item in the specified slot (have shared OreDictionary IDs).")
/*    */   Object[] isEquivalentTo(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(slot:number, dbAddress:string, dbSlot:number):boolean -- Store an item stack description in the specified slot of the database with the specified address.")
/*    */   Object[] storeInternal(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(slot:number, dbAddress:string, dbSlot:number[, checkNBT:boolean=false]):boolean -- Compare an item in the specified slot with one in the database with the specified address.")
/*    */   Object[] compareToDatabase(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class InventoryAnalytics$$anonfun$storeInternal$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ItemStack localStack$1;
/*    */     
/*    */     public final Object[] apply(UpgradeDatabase database) {
/* 37 */       int dbSlot = ExtendedArguments$.MODULE$.extendedArguments(this.args$1).checkSlot(database.data(), 2);
/* 38 */       boolean nonEmpty = !(database.getStackInSlot(dbSlot) == null);
/* 39 */       database.setStackInSlot(dbSlot, this.localStack$1.func_77946_l());
/* 40 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(nonEmpty) }));
/*    */     }
/*    */     private final Arguments args$1;
/*    */     public InventoryAnalytics$$anonfun$storeInternal$1(InventoryAnalytics $outer, ItemStack localStack$1, Arguments args$1) {} }
/*    */   public final class InventoryAnalytics$$anonfun$compareToDatabase$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack localStack$2;
/*    */     private final Arguments args$2;
/*    */     
/*    */     public InventoryAnalytics$$anonfun$compareToDatabase$1(InventoryAnalytics $outer, ItemStack localStack$2, Arguments args$2) {}
/*    */     
/*    */     public final Object[] apply(UpgradeDatabase database) {
/* 50 */       int dbSlot = ExtendedArguments$.MODULE$.extendedArguments(this.args$2).checkSlot(database.data(), 2);
/* 51 */       ItemStack dbStack = database.getStackInSlot(dbSlot);
/* 52 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(InventoryUtils$.MODULE$.haveSameItemType(this.localStack$2, dbStack, this.args$2.optBoolean(3, false))) }));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryAnalytics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */