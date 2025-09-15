/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import net.minecraftforge.fluids.FluidTankInfo;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001I3q!\001\002\021\002\007\005qB\001\tUC:\\wk\034:mI\016{g\016\036:pY*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021!C2p[B|g.\0328u\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011#\002\001\021-ii\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\r\005\002\03015\t!!\003\002\032\005\tIA+\0318l\003^\f'/\032\t\003/mI!\001\b\002\003\025]{'\017\0343Bo\006\024X\r\005\002\030=%\021qD\001\002\017'&$WMU3tiJL7\r^3e\021\025\t\003\001\"\001#\003\031!\023N\\5uIQ\t1\005\005\002\022I%\021QE\005\002\005+:LG\017C\003(\001\021\005\001&\001\007d_6\004\030M]3GYVLG\rF\002*YY\0022!\005\026\021\023\tY#CA\003BeJ\f\027\020C\003.M\001\007a&A\004d_:$X\r\037;\021\005=\"T\"\001\031\013\005E\022\024aB7bG\"Lg.\032\006\003g!\t1!\0319j\023\t)\004GA\004D_:$X\r\037;\t\013]2\003\031\001\035\002\t\005\024xm\035\t\003_eJ!A\017\031\003\023\005\023x-^7f]R\034\b\006\002\024=\001\003\"aL\037\n\005y\002$\001C\"bY2\024\027mY6\002\007\021|7-I\001B\003\005Uc-\0368di&|g\016K:jI\026Td.^7cKJ\0043\f\f\021uC:\\'H\\;nE\026\024X,\013\036c_>dW-\0318![5\0023i\\7qCJ,\007\005\0365fA\031dW/\0333!S:\004C\017[3!g\026dWm\031;fI\002\"\030M\\6!o&$\b\016\t;iK\0022G.^5eA%t\007\005\0365fAM\004XmY5gS\026$\007\005^1oW\002zg\016\t;iK\002\032\b/Z2jM&,G\rI:jI\026t\003EU3ukJt7\017\t;sk\026\004\023N\032\021fcV\fGN\f\005\006\007\002!\t\001R\001\006IJ\f\027N\034\013\004S\0253\005\"B\027C\001\004q\003\"B\034C\001\004A\004\006\002\"=!\013\023!S\001\002r\031,hn\031;j_:D3/\0333fu\t|w\016\\3b]nc\003%Y7pk:$(H\\;nE\026\024X(\r\0311auK#HY8pY\026\fg\016\f\021ok6\024WM\035\021pe\002\032HO]5oO\002jS\006\t#sC&t7\017\t;iK\002\032\b/Z2jM&,G\rI1n_VtG\017I8gA\031dW/\0333!MJ|W\016\t;iK\002\032\b/Z2jM&,G\rI:jI\026t\003EU3ukJt7\017\t;iK\002\nWn\\;oi\002\"'/Y5oK\022d\003e\034:!C:\004SM\035:pe\002jWm]:bO\026t\003\"B&\001\t\003a\025\001\0024jY2$2!K'O\021\025i#\n1\001/\021\0259$\n1\0019Q\021QEh\020)\"\003E\013\021q\r4v]\016$\030n\0348)g&$WM\0178v[\n,'o\027\027!C6|WO\034;;]Vl'-\032:>cA\002\004'X\025;E>|G.Z1oY\001rW/\0342fe\002zg\rI:ue&tw\rI\027.A\025SWm\031;!i\",\007e\0359fG&4\027.\0323!C6|WO\034;!_\032\004c\r\\;jI\002\"x\016\t;iK\002\032\b/Z2jM&,G\rI:jI\026t\003EU3ukJt7\017\t;iK\002\nWn\\;oi\002*'.Z2uK\022\004sN\035\021b]\002*'O]8sA5,7o]1hK:\002")
/*    */ public interface TankWorldControl extends TankAware, WorldAware, SideRestricted {
/*    */   @Callback(doc = "function(side:number [, tank:number]):boolean -- Compare the fluid in the selected tank with the fluid in the specified tank on the specified side. Returns true if equal.")
/*    */   Object[] compareFluid(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(side:boolean[, amount:number=1000]):boolean, number or string -- Drains the specified amount of fluid from the specified side. Returns the amount drained, or an error message.")
/*    */   Object[] drain(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(side:number[, amount:number=1000]):boolean, number of string -- Eject the specified amount of fluid to the specified side. Returns the amount ejected or an error message.")
/*    */   Object[] fill(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class TankWorldControl$$anonfun$compareFluid$1 extends AbstractFunction1<FluidTankInfo[], Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 21 */     public final boolean apply(FluidTankInfo[] x$1) { return Predef$.MODULE$.refArrayOps((Object[])x$1).exists((Function1)new TankWorldControl$$anonfun$compareFluid$1$$anonfun$apply$1(this)); } public final FluidStack stack$1; public TankWorldControl$$anonfun$compareFluid$1(TankWorldControl $outer, FluidStack stack$1) {} public final class TankWorldControl$$anonfun$compareFluid$1$$anonfun$apply$1 extends AbstractFunction1<FluidTankInfo, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(FluidTankInfo other) { return this.$outer.stack$1.isFluidEqual(other.fluid); }
/*    */ 
/*    */       
/*    */       public TankWorldControl$$anonfun$compareFluid$1$$anonfun$apply$1(TankWorldControl$$anonfun$compareFluid$1 $outer) {} }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankWorldControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */