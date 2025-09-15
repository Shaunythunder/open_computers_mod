/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.parts.IPart;
/*    */ import appeng.api.parts.IPartHost;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005eu!B\001\003\021\003i\021a\004#sSZ,'/S7q_J$()^:\013\005\r!\021AB1qa\026twM\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\020\tJLg/\032:J[B|'\017\036\"vgN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\021\016\003qQ!!\b\020\002\r\021\024\030N^3s\025\tyb!A\002ba&L!!\t\017\003\025MKG-\0323CY>\0347\016C\003$\037\021\005A%\001\004=S:LGO\020\013\002\033!)ae\004C!O\005Iqo\034:lg^KG\017\033\013\007Q9Jd\b\021\"\021\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\017\t{w\016\\3b]\")q&\na\001a\005)qo\034:mIB\021\021gN\007\002e)\021qf\r\006\003iU\n\021\"\\5oK\016\024\030M\032;\013\003Y\n1A\\3u\023\tA$GA\003X_JdG\rC\003;K\001\0071(A\001y!\tIC(\003\002>U\t\031\021J\034;\t\013}*\003\031A\036\002\003eDQ!Q\023A\002m\n\021A\037\005\006\007\026\002\r\001R\001\005g&$W\r\005\002F\0316\taI\003\002H\021\006!Q\017^5m\025\tI%*\001\004d_6lwN\034\006\003\027V\na\"\\5oK\016\024\030M\032;g_J<W-\003\002N\r\nqai\034:hK\022K'/Z2uS>t\007\"B(\020\t\003\002\026!E2sK\006$X-\0228wSJ|g.\\3oiRY\021+!\020\002@\005\005\0231IA#!\t\0216+D\001\020\r\021!vBA+\003\027\025sg/\033:p]6,g\016^\n\005'Z\023W\rE\002X1jk\021\001B\005\0033\022\021A$T1oC\036,G\rV5mK\026sG/\033;z\013:4\030N]8o[\026tG\017\005\002\\A6\tAL\003\002^=\006)\001/\031:ug*\021qd\030\006\002\007%\021\021\r\030\002\n\023B\013'\017\036%pgR\004\"aG2\n\005\021d\"A\003(b[\026$'\t\\8dWB\021aBZ\005\003O\n\0211\003U1si\026sg/\033:p]6,g\016\036\"bg\026D\001\"[*\003\006\004%\tA[\001\005Q>\034H/F\001[\021!a7K!A!\002\023Q\026!\0025pgR\004\003\"B\022T\t\003qGCA)p\021\025IW\0161\001[\021\025\t8\013\"\021s\0035\001(/\0324feJ,GMT1nKR\t1\017\005\002\024i&\021Q\017\006\002\007'R\024\030N\\4\t\013]\034F\021\t=\002\021A\024\030n\034:jif$\022a\017\005\006uN#\ta_\001\027O\026$\030*\0349peR\034uN\0344jOV\024\030\r^5p]R)A0!\002\002\026A\031\021&`@\n\005yT#!B!se\006L\bcA\025\002\002%\031\0211\001\026\003\r\005s\027PU3g\021\035\t9!\037a\001\003\023\tqaY8oi\026DH\017\005\003\002\f\005EQBAA\007\025\r\tyAH\001\b[\006\034\007.\0338f\023\021\t\031\"!\004\003\017\r{g\016^3yi\"9\021qC=A\002\005e\021\001B1sON\004B!a\003\002\034%!\021QDA\007\005%\t%oZ;nK:$8\017K\004z\003C\t9#!\013\021\t\005-\0211E\005\005\003K\tiA\001\005DC2d'-Y2l\003\r!wnY\021\003\003W\tAPZ;oGRLwN\034\025tS\022,'H\\;nE\026\0248\f\f\021tY>$(H\\;nE\026\024X,\013\036c_>dW-\0318![5\002s)\032;!i\",\007eY8oM&<WO]1uS>t\007e\0344!i\",\007%[7q_J$\bEY;tAA|\027N\034;j]\036\004\023N\034\021uQ\026\0043\017]3dS\032LW\r\032\021eSJ,7\r^5p]:Bq!a\fT\t\003\t\t$\001\ftKRLU\016]8si\016{gNZ5hkJ\fG/[8o)\025a\0301GA\033\021!\t9!!\fA\002\005%\001\002CA\f\003[\001\r!!\007)\021\0055\022\021EA\024\003s\t#!a\017\002\003\0373WO\\2uS>t\007f]5eKjrW/\0342fenc\003e\0357pijrW/\0342fev[F\006\t3bi\006\024\027m]3;C\022$'/Z:tY\001*g\016\036:zu9,XNY3s;&R$m\\8mK\006t\007%L\027!\007>tg-[4ve\026\004C\017[3!S6\004xN\035;!EV\034\b\005]8j]RLgn\032\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\027N]3di&|g\016\t;pA%l\007o\034:uA%$X-\034\021ti\006\0347n\035\021nCR\034\007.\0338hAQDW\rI:qK\016Lg-[3eA\021,7o\031:jaR|'O\f\005\006_9\003\r\001\r\005\006u9\003\ra\017\005\0069\003\ra\017\005\006\003:\003\ra\017\005\006\007:\003\r\001R\004\b\003\023z\001\022AA&\003!\001&o\034<jI\026\024\bc\001*\002N\0319\021qJ\b\t\002\005E#\001\003)s_ZLG-\032:\024\013\0055##a\025\021\007m\t)&C\002\002Xq\0211#\0228wSJ|g.\\3oiB\023xN^5eKJDqaIA'\t\003\tY\006\006\002\002L!A\021qLA'\t\003\n\t'\001\bhKR,eN^5s_:lWM\034;\025\t\005\r\024\021\022\031\005\003K\n9\b\005\004\002h\0055\0241\017\b\004S\005%\024bAA6U\0051\001K]3eK\032LA!a\034\002r\t)1\t\\1tg*\031\0211\016\026\021\t\005U\024q\017\007\001\t1\tI(!\030\002\002\003\005)\021AA>\005\ryF%M\t\005\003{\n\031\tE\002*\003J1!!!+\005\035qu\016\0365j]\036\0042!KAC\023\r\t9I\013\002\004\003:L\b\002CAF\003;\002\r!!$\002\013M$\030mY6\021\t\005=\025QS\007\003\003#S1!a%4\003\021IG/Z7\n\t\005]\025\021\023\002\n\023R,Wn\025;bG.\004")
/*    */ public final class DriverImportBus {
/*    */   public static Environment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverImportBus$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverImportBus$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/* 19 */   public final class DriverImportBus$$anonfun$worksWith$3 extends AbstractFunction1<IPart, Object> implements Serializable { public final boolean apply(IPart x$1) { return x$1 instanceof PartImportBus; } public static final long serialVersionUID = 0L; } public final class DriverImportBus$$anonfun$worksWith$2 extends AbstractFunction1<IPart, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IPart obj) { return !(obj == null); } } public final class DriverImportBus$$anonfun$worksWith$1 extends AbstractFunction1<ForgeDirection, IPart> implements Serializable { public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final IPart apply(ForgeDirection x$1) { return ((IPartHost)this.x2$1).getPart(x$1); }
/*    */     
/*    */     public DriverImportBus$$anonfun$worksWith$1(TileEntity x2$1) {} }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IPartHost> implements NamedBlock, PartEnvironmentBase { private final IPartHost host;
/*    */     
/* 25 */     public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] getPartConfig(Context context, Arguments args, ClassTag evidence$1) { return PartEnvironmentBase$class.getPartConfig(this, context, args, evidence$1); } public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] setPartConfig(Context context, Arguments args, ClassTag evidence$2) { return PartEnvironmentBase$class.setPartConfig(this, context, args, evidence$2); } public IPartHost host() { return this.host; } public Environment(IPartHost host) { super(host, "me_importbus"); PartEnvironmentBase$class.$init$(this); } public String preferredName() {
/* 26 */       return "me_importbus";
/*    */     } public int priority() {
/* 28 */       return 1;
/*    */     } @Callback(doc = "function(side:number[, slot:number]):boolean -- Get the configuration of the import bus pointing in the specified direction.")
/*    */     public Object[] getImportConfiguration(Context context, Arguments args) {
/* 31 */       return getPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartImportBus.class));
/*    */     } @Callback(doc = "function(side:number[, slot:number][, database:address, entry:number]):boolean -- Configure the import bus pointing in the specified direction to import item stacks matching the specified descriptor.")
/*    */     public Object[] setImportConfiguration(Context context, Arguments args) {
/* 34 */       return setPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartImportBus.class));
/*    */     } } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 37 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 39 */       return AEUtil$.MODULE$.isImportBus(stack) ? 
/* 40 */         DriverImportBus.Environment.class : 
/* 41 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverImportBus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */