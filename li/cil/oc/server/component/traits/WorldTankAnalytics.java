/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001]3q!\001\002\021\002\007\005qB\001\nX_JdG\rV1oW\006s\027\r\\=uS\016\034(BA\002\005\003\031!(/Y5ug*\021QAB\001\nG>l\007o\0348f]RT!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\005\001A1\"\004\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\t\003/ai\021AA\005\0033\t\021!bV8sY\022\fu/\031:f!\t92$\003\002\035\005\tq1+\0333f%\026\034HO]5di\026$\007\"\002\020\001\t\003y\022A\002\023j]&$H\005F\001!!\t\t\022%\003\002#%\t!QK\\5u\021\025!\003\001\"\001&\00319W\r\036+b].dUM^3m)\r1\023f\r\t\004#\035\002\022B\001\025\023\005\025\t%O]1z\021\025Q3\0051\001,\003\035\031wN\034;fqR\004\"\001L\031\016\0035R!AL\030\002\0175\f7\r[5oK*\021\001\007C\001\004CBL\027B\001\032.\005\035\031uN\034;fqRDQ\001N\022A\002U\nA!\031:hgB\021AFN\005\003o5\022\021\"\021:hk6,g\016^:)\t\rJD(\020\t\003YiJ!aO\027\003\021\r\013G\016\0342bG.\f1\001Z8dC\005q\024\001\0364v]\016$\030n\0348)g&$WM\0178v[\n,'\017I.-AQ\fgn\033\036ok6\024WM]/*u9,XNY3sA5j\003eR3uAQDW\rI1n_VtG\017I8gA\031dW/\0333!S:\004C\017[3!gB,7-\0334jK\022\004C/\0318lA=t\007\005\0365fAM\004XmY5gS\026$\007e]5eK:BQ\001\021\001\005\002\005\013qbZ3u)\006t7nQ1qC\016LG/\037\013\004M\t\033\005\"\002\026@\001\004Y\003\"\002\033@\001\004)\004\006B :y\025\013\023AR\001nMVt7\r^5p]\"\032\030\016Z3;]Vl'-\032:!72\002C/\0318lu9,XNY3s;&Rd.^7cKJ\004S&\f\021HKR\004C\017[3!G\006\004\030mY5us\002zg\r\t;iK\002\032\b/Z2jM&,G\r\t;b].\004sN\034\021uQ\026\0043\017]3dS\032LW\r\032\021tS\022,g\006C\003I\001\021\005\021*\001\bhKR4E.^5e\023:$\026M\\6\025\007\031R5\nC\003+\017\002\0071\006C\0035\017\002\007Q\007\013\003Hsqj\025%\001(\002}\032,hn\031;j_:D3/\0333fu9,XNY3sAmc\003\005^1oWjrW/\0342fevK#\b^1cY\026\004S&\f\021HKR\004\023\r\t3fg\016\024\030\016\035;j_:\004sN\032\021uQ\026\004c\r\\;jI\002Jg\016\t;iK\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\030M\\6!_:\004C\017[3!gB,7-\0334jK\022\0043/\0333f]!)\001\013\001C\001#\006aq-\032;UC:\\7i\\;oiR\031aEU*\t\013)z\005\031A\026\t\013Qz\005\031A\033)\t=KD(V\021\002-\006Af-\0368di&|g\016K:jI\026Td.^7cKJL#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fA9,XNY3sA=4\007\005^1oWN\004\023M^1jY\006\024G.\032\021p]\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3/\001")
/*    */ public interface WorldTankAnalytics extends WorldAware, SideRestricted {
/*    */   @Callback(doc = "function(side:number [, tank:number]):number -- Get the amount of fluid in the specified tank on the specified side.")
/*    */   Object[] getTankLevel(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(side:number [, tank:number]):number -- Get the capacity of the specified tank on the specified side.")
/*    */   Object[] getTankCapacity(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(side:number [, tank:number]):table -- Get a description of the fluid in the the specified tank on the specified side.")
/*    */   Object[] getFluidInTank(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(side:number):number -- Get the number of tanks available on the specified side.")
/*    */   Object[] getTankCount(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class WorldTankAnalytics$$anonfun$getTankLevel$1 extends AbstractFunction0.mcI.sp implements Serializable {
/* 19 */     public final int apply() { return apply$mcI$sp(); } public static final long serialVersionUID = 0L; public int apply$mcI$sp() { return 0; } public WorldTankAnalytics$$anonfun$getTankLevel$1(WorldTankAnalytics $outer) {} } public final class WorldTankAnalytics$$anonfun$getTankLevel$2 extends AbstractFunction1<FluidStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(FluidStack x$1) { return x$1.amount; } public WorldTankAnalytics$$anonfun$getTankLevel$2(WorldTankAnalytics $outer) {} } public final class WorldTankAnalytics$$anonfun$getTankLevel$3 extends AbstractFunction1<FluidTankInfo, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 20 */     public final int apply(FluidTankInfo info) { return BoxesRunTime.unboxToInt(Option$.MODULE$.apply(info.fluid).fold((Function0)new WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$1(this), (Function1)new WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$2(this))); } public WorldTankAnalytics$$anonfun$getTankLevel$3(WorldTankAnalytics $outer) {} public final class WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 0; } public WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$1(WorldTankAnalytics$$anonfun$getTankLevel$3 $outer) {} } public final class WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$2 extends AbstractFunction1<FluidStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(FluidStack x$2) { return x$2.amount; }
/*    */ 
/*    */       
/*    */       public WorldTankAnalytics$$anonfun$getTankLevel$3$$anonfun$apply$2(WorldTankAnalytics$$anonfun$getTankLevel$3 $outer) {} }
/*    */      }
/*    */ 
/*    */   
/*    */   public final class WorldTankAnalytics$$anonfun$getTankCapacity$2
/*    */     extends AbstractFunction1<FluidTankInfo, Object> implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 32 */     public final int apply(FluidTankInfo x$3) { return x$3.capacity; } public WorldTankAnalytics$$anonfun$getTankCapacity$2(WorldTankAnalytics $outer) {} } public final class WorldTankAnalytics$$anonfun$getTankCapacity$1 extends AbstractFunction2.mcIII.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply(int max, int capacity) { return apply$mcIII$sp(max, capacity); } public int apply$mcIII$sp(int max, int capacity) { return package$.MODULE$.max(max, capacity); }
/*    */ 
/*    */     
/*    */     public WorldTankAnalytics$$anonfun$getTankCapacity$1(WorldTankAnalytics $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldTankAnalytics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */