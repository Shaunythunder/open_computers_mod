/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ import scala.runtime.Nothing$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Q3q!\001\002\021\002\007\005qBA\tJ]Z,g\016^8ssR\023\030M\\:gKJT!a\001\003\002\rQ\024\030-\033;t\025\t)a!A\005d_6\004xN\\3oi*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001a\005\003\001!YQ\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\r\005\002\03015\t!!\003\002\032\005\tQqk\034:mI\006;\030M]3\021\005]Y\022B\001\017\003\0059\031\026\016Z3SKN$(/[2uK\022DQA\b\001\005\002}\ta\001J5oSR$C#\001\021\021\005E\t\023B\001\022\023\005\021)f.\033;\t\013\021\002a\021A\023\002%=tGK]1og\032,'oQ8oi\026tGo\035\013\002MA\031\021cJ\025\n\005!\022\"AB(qi&|g\016\005\002+[9\021\021cK\005\003YI\ta\001\025:fI\0264\027B\001\0300\005\031\031FO]5oO*\021AF\005\005\006c\001!\tAM\001\riJ\fgn\0354fe&#X-\034\013\004gY\002\005cA\t5!%\021QG\005\002\006\003J\024\030-\037\005\006oA\002\r\001O\001\bG>tG/\032=u!\tId(D\001;\025\tYD(A\004nC\016D\027N\\3\013\005uB\021aA1qS&\021qH\017\002\b\007>tG/\032=u\021\025\t\005\0071\001C\003\021\t'oZ:\021\005e\032\025B\001#;\005%\t%oZ;nK:$8\017\013\0031\r&S\005CA\035H\023\tA%H\001\005DC2d'-Y2l\003\r!wnY\021\002\027\006\t9DZ;oGRLwN\034\025t_V\0248-Z*jI\026Td.^7cKJd\003e]5oWNKG-\032\036ok6\024WM].-A\r|WO\034;;]Vl'-\032:\\Y\001\032x.\036:dKNcw\016\036\036ok6\024WM].-AMLgn[*m_RTd.^7cKJlV,X\025;]Vl'-\032:![5\002CK]1og\032,'\017I:p[\026\004\023\016^3ng\002\022W\r^<fK:\004Co^8!S:4XM\034;pe&,7O\f\005\006\033\002!\tAT\001\016iJ\fgn\0354fe\032cW/\0333\025\007Mz\005\013C\0038\031\002\007\001\bC\003B\031\002\007!\t\013\003M\r&\023\026%A*\002\003_2WO\\2uS>t\007f]8ve\016,7+\0333fu9,XNY3sY\001\032\030N\\6TS\022,'H\\;nE\026\0248\f\f\021d_VtGO\0178v[\n,'\017I.-AM|WO]2f)\006t7N\0178v[\n,'/X/*u\t|w\016\\3b]2\002c.^7cKJ\004S&\f\021Ue\006t7OZ3sAM|W.\032\021gYVLG\r\t2fi^,WM\034\021uo>\004C/\0318lg:\002#+\032;ve:\034\be\0349fe\006$\030n\0348!e\026\034X\017\034;!C:$\007EZ5mY\026$\007%Y7pk:$\b")
/*    */ public interface InventoryTransfer
/*    */   extends WorldAware, SideRestricted {
/*    */   Option<String> onTransferContents();
/*    */   
/*    */   @Callback(doc = "function(sourceSide:number, sinkSide:number[, count:number[, sourceSlot:number[, sinkSlot:number]]]):number -- Transfer some items between two inventories.")
/*    */   Object[] transferItem(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(sourceSide:number, sinkSide:number[, count:number [, sourceTank:number]]):boolean, number -- Transfer some fluid between two tanks. Returns operation result and filled amount")
/*    */   Object[] transferFluid(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class InventoryTransfer$$anonfun$1 extends AbstractFunction0<Nothing$> implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public InventoryTransfer$$anonfun$1(InventoryTransfer $outer) {}
/*    */     
/* 29 */     public final Nothing$ apply() { throw new IllegalArgumentException("no inventory"); } } public final class InventoryTransfer$$anonfun$2 extends AbstractFunction0<Nothing$> implements Serializable { public final Nothing$ apply() {
/* 30 */       throw new IllegalArgumentException("no inventory");
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public InventoryTransfer$$anonfun$2(InventoryTransfer $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryTransfer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */