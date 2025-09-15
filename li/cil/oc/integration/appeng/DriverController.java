/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\035u!B\001\003\021\003i\021\001\005#sSZ,'oQ8oiJ|G\016\\3s\025\t\031A!\001\004baB,gn\032\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003!\021\023\030N^3s\007>tGO]8mY\026\0248CA\b\023!\t\031\002$D\001\025\025\t)b#\001\004qe\0264\027M\031\006\003/\031\t1!\0319j\023\tIBCA\013Ee&4XM]*jI\026$G+\0337f\013:$\030\016^=\t\013myA\021\001\017\002\rqJg.\033;?)\005iQ\001\002\020\020\t}\021a\002V5mK\016{g\016\036:pY2,'O\005\003!E1*d\001B\021\020\001}\021A\002\020:fM&tW-\\3oiz\002\"a\t\026\016\003\021R!!\n\024\002\025QLG.Z3oi&$\030P\003\002(Q\005IQ.\0338fGJ\fg\r\036\006\002S\005\031a.\032;\n\005-\"#A\003+jY\026,e\016^5usB\021QfM\007\002])\021q\006M\001\bQ\026d\007/\032:t\025\t\t$'\001\002nK*\t1!\003\0025]\tq\021j\022:jIB\023x\016_=bE2,\007C\001\034=\033\0059$B\001\035:\003!\031XmY;sSRL(B\001\036<\003)qW\r^<pe.Lgn\032\006\003/IJ!!P\034\003\027%\0135\r^5p]\"{7\017\036\005\006=!\t\001Q\001\023O\026$H+\0337f\013:$\030\016^=DY\006\0348\017F\001Ba\t\021E\nE\002D\021*k\021\001\022\006\003\013\032\013A\001\\1oO*\tq)\001\003kCZ\f\027BA%E\005\025\031E.Y:t!\tYE\n\004\001\005\0235s\024\021!A\001\006\003q%aA0%cE\021q*\026\t\003!Nk\021!\025\006\002%\006)1oY1mC&\021A+\025\002\b\035>$\b.\0338h!\t\001f+\003\002X#\n\031\021I\\=\t\013e{A\021\001.\002#\r\024X-\031;f\013:4\030N]8o[\026tG\017\006\004\\C\"lw.\035\t\0039~k\021!\030\006\003=Z\tqA\\3uo>\0248.\003\002a;\n\021R*\0318bO\026$WI\034<je>tW.\0328u\021\025\021\007\f1\001d\003\0259xN\0357e!\t!g-D\001f\025\t\021g%\003\002hK\n)qk\034:mI\")\021\016\027a\001U\006\t\001\020\005\002QW&\021A.\025\002\004\023:$\b\"\0028Y\001\004Q\027!A=\t\013AD\006\031\0016\002\003iDQA\035-A\002M\fAa]5eKB\021Ao_\007\002k*\021ao^\001\005kRLGN\003\002ys\00611m\\7n_:T!A\037\025\002\0355Lg.Z2sC\032$hm\034:hK&\021A0\036\002\017\r>\024x-\032#je\026\034G/[8o\r\021qxBA@\003\027\025sg/\033:p]6,g\016^\n\b{\006\005\021\021BA\013!\025\t\031!!\002 \033\005!\021bAA\004\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\b\003BA\006\003#i!!!\004\013\007\005=a#\001\004ee&4XM]\005\005\003'\tiA\001\006OC6,GM\0217pG.\004BADA\f?%\031\021\021\004\002\003\0359+Go^8sW\016{g\016\036:pY\"Q\021QD?\003\006\004%\t!a\b\002\tQLG.Z\013\003\003C\0012!a\t\036\033\005y\001BCA\024{\n\005\t\025!\003\002\"\005)A/\0337fA!11$ C\001\003W!B!!\f\0020A\031\0211E?\t\021\005u\021\021\006a\001\003CAq!a\r~\t\003\n)$A\007qe\0264WM\035:fI:\013W.\032\013\003\003o\0012aQA\035\023\r\tY\004\022\002\007'R\024\030N\\4\t\017\005}R\020\"\021\002B\005A\001O]5pe&$\030\020F\001k\017\035\t)e\004E\001\003\017\n\001\002\025:pm&$WM\035\t\005\003G\tIEB\004\002L=A\t!!\024\003\021A\023xN^5eKJ\034b!!\023\002P\005U\003cA\"\002R%\031\0211\013#\003\r=\023'.Z2u!\021\tY!a\026\n\t\005e\023Q\002\002\024\013:4\030N]8o[\026tG\017\025:pm&$WM\035\005\b7\005%C\021AA/)\t\t9\005\003\005\002b\005%C\021IA2\00399W\r^#om&\024xN\\7f]R$B!!\032\002xA\"\021qMA;!\031\tI'a\034\002t9\031\001+a\033\n\007\0055\024+\001\004Qe\026$WMZ\005\004\023\006E$bAA7#B\0311*!\036\005\0255\013y&!A\001\002\013\005a\n\003\005\002z\005}\003\031AA>\003\025\031H/Y2l!\021\ti(a!\016\005\005}$bAAAM\005!\021\016^3n\023\021\t))a \003\023%#X-\\*uC\016\\\007")
/*    */ public final class DriverController {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverController$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverController$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverController$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntity> implements NamedBlock, NetworkControl<TileEntity> {
/*    */     @Callback(doc = "function():table -- Get a list of tables representing the available CPUs in the network.")
/* 25 */     public Object[] getCpus(Context context, Arguments args) { return NetworkControl$class.getCpus(this, context, args); } private final TileEntity tile; @Callback(doc = "function([filter:table]):table -- Get a list of known item recipes. These can be used to issue crafting requests.") public Object[] getCraftables(Context context, Arguments args) { return NetworkControl$class.getCraftables(this, context, args); } @Callback(doc = "function([filter:table]):table -- Get a list of the stored items in the network.") public Object[] getItemsInNetwork(Context context, Arguments args) { return NetworkControl$class.getItemsInNetwork(this, context, args); } @Callback(doc = "function(filter:table):table -- Get a list of the stored items in the network matching the filter. Filter is an Array of Item IDs") public Object[] getItemsInNetworkById(Context context, Arguments args) { return NetworkControl$class.getItemsInNetworkById(this, context, args); } @Callback(doc = "function():userdata -- Get an iterator object for the list of the items in the network.") public Object[] allItems(Context context, Arguments args) { return NetworkControl$class.allItems(this, context, args); } @Callback(doc = "function(filter:table, dbAddress:string[, startSlot:number[, count:number]]): Boolean -- Store items in the network matching the specified filter in the database with the specified address.") public Object[] store(Context context, Arguments args) { return NetworkControl$class.store(this, context, args); } @Callback(doc = "function():table -- Get a list of the stored fluids in the network.") public Object[] getFluidsInNetwork(Context context, Arguments args) { return NetworkControl$class.getFluidsInNetwork(this, context, args); } @Callback(doc = "function():number -- Get the average power injection into the network.") public Object[] getAvgPowerInjection(Context context, Arguments args) { return NetworkControl$class.getAvgPowerInjection(this, context, args); } @Callback(doc = "function():number -- Get the average power usage of the network.") public Object[] getAvgPowerUsage(Context context, Arguments args) { return NetworkControl$class.getAvgPowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the idle power usage of the network.") public Object[] getIdlePowerUsage(Context context, Arguments args) { return NetworkControl$class.getIdlePowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the maximum stored power in the network.") public Object[] getMaxStoredPower(Context context, Arguments args) { return NetworkControl$class.getMaxStoredPower(this, context, args); } @Callback(doc = "function():number -- Get the stored power in the network. ") public Object[] getStoredPower(Context context, Arguments args) { return NetworkControl$class.getStoredPower(this, context, args); } public TileEntity tile() { return this.tile; } public Environment(TileEntity tile) { super(tile, "me_controller"); NetworkControl$class.$init$(this); } public String preferredName() {
/* 26 */       return "me_controller";
/*    */     } public int priority() {
/* 28 */       return 5;
/*    */     } } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 31 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 33 */       return AEUtil$.MODULE$.isController(stack) ? 
/* 34 */         DriverController.Environment.class : 
/* 35 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */