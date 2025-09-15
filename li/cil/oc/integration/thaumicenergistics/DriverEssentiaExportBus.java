/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ 
/*    */ import appeng.api.parts.IPart;
/*    */ import appeng.api.parts.IPartHost;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.reflect.ClassTag;
/*    */ import thaumicenergistics.common.parts.PartEssentiaExportBus;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Uw!B\001\003\021\003i\021a\006#sSZ,'/R:tK:$\030.Y#ya>\024HOQ;t\025\t\031A!\001\nuQ\006,X.[2f]\026\024x-[:uS\016\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\fEe&4XM]#tg\026tG/[1FqB|'\017\036\"vgN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\021\016\003qQ!!\b\020\002\r\021\024\030N^3s\025\tyb!A\002ba&L!!\t\017\003\025MKG-\0323CY>\0347\016C\003$\037\021\005A%\001\004=S:LGO\020\013\002\033!)ae\004C!O\005Iqo\034:lg^KG\017\033\013\007Q9Jd\b\021\"\021\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\017\t{w\016\\3b]\")q&\na\001a\005)qo\034:mIB\021\021gN\007\002e)\021qf\r\006\003iU\n\021\"\\5oK\016\024\030M\032;\013\003Y\n1A\\3u\023\tA$GA\003X_JdG\rC\003;K\001\0071(A\001y!\tIC(\003\002>U\t\031\021J\034;\t\013}*\003\031A\036\002\003eDQ!Q\023A\002m\n\021A\037\005\006\007\026\002\r\001R\001\005g&$W\r\005\002F\0316\taI\003\002H\021\006!Q\017^5m\025\tI%*\001\004d_6lwN\034\006\003\027V\na\"\\5oK\016\024\030M\032;g_J<W-\003\002N\r\nqai\034:hK\022K'/Z2uS>t\007\"B(\020\t\003\002\026!E2sK\006$X-\0228wSJ|g.\\3oiRY\021+!\037\002|\005u\024qPAA!\t\0216+D\001\020\r\021!vBA+\003\027\025sg/\033:p]6,g\016^\n\005'Z\033g\rE\002X1jk\021\001B\005\0033\022\021A$T1oC\036,G\rV5mK\026sG/\033;z\013:4\030N]8o[\026tG\017\005\002\\C6\tAL\003\002^=\006)\001/\031:ug*\021qd\030\006\002A\0061\021\r\0359f]\036L!A\031/\003\023%\003\026M\035;I_N$\bCA\016e\023\t)GD\001\006OC6,GM\0217pG.\004\"AD4\n\005!\024!a\005)beR,eN^5s_:lWM\034;CCN,\007\002C\030T\005\013\007I\021\0016\026\003AB\001\002\\*\003\002\003\006I\001M\001\007o>\024H\016\032\021\t\0219\034&Q1A\005\002=\fA\001[8tiV\t!\f\003\005r'\n\005\t\025!\003[\003\025Awn\035;!\021\025\0313\013\"\001t)\r\tF/\036\005\006_I\004\r\001\r\005\006]J\004\rA\027\005\006oN#\t\005_\001\016aJ,g-\032:sK\022t\025-\\3\025\003e\004\"a\005>\n\005m$\"AB*ue&tw\rC\003~'\022\005c0\001\005qe&|'/\033;z)\005Y\004bBA\001'\022\005\0211A\001\027O\026$X\t\0379peR\034uN\0344jOV\024\030\r^5p]R1\021QAA\t\003C\001R!KA\004\003\027I1!!\003+\005\025\t%O]1z!\rI\023QB\005\004\003\037Q#AB!osJ+g\rC\004\002\024}\004\r!!\006\002\017\r|g\016^3yiB!\021qCA\017\033\t\tIBC\002\002\034y\tq!\\1dQ&tW-\003\003\002 \005e!aB\"p]R,\007\020\036\005\b\003Gy\b\031AA\023\003\021\t'oZ:\021\t\005]\021qE\005\005\003S\tIBA\005Be\036,X.\0328ug\":q0!\f\0024\005U\002\003BA\f\003_IA!!\r\002\032\tA1)\0317mE\006\0347.A\002e_\016\f#!a\016\002w\032,hn\031;j_:D3/\0333fu9,XNY3s72\0023\017\\8uu9,XNY3s;&R4\017\036:j]\036\004S&\f\021HKR\004C\017[3!G>tg-[4ve\006$\030n\0348!_\032\004C\017[3!Kb\004xN\035;!EV\034\b\005]8j]RLgn\032\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\027N]3di&|gN\f\005\b\003w\031F\021AA\037\003Y\031X\r^#ya>\024HoQ8oM&<WO]1uS>tGCBA\003\003\t\t\005\003\005\002\024\005e\002\031AA\013\021!\t\031#!\017A\002\005\025\002\006CA\035\003[\t\031$!\022\"\005\005\035\023!a\027gk:\034G/[8oQMLG-\032\036ok6\024WM].-AMdw\016\036\036ok6\024WM]/\\Y\001\n7\017]3dij\032HO]5oOvK#HY8pY\026\fg\016I\027.A\r{gNZ5hkJ,\007\005\0365fA\025D\bo\034:uA\t,8\017\t9pS:$\030N\\4!S:\004C\017[3!gB,7-\0334jK\022\004C-\033:fGRLwN\034\021u_\002*\007\020]8si\002*7o]3oi&\f\007%\\1uG\"Lgn\032\021uQ\026\0043\017]3dS\032LW\r\032\021usB,g\006C\004\002LM#\t!!\024\002#\035,G/\022=q_J$8\013\\8u'&TX\r\006\004\002\006\005=\023\021\013\005\t\003'\tI\0051\001\002\026!A\0211EA%\001\004\t)\003\013\005\002J\0055\0221GA+C\t\t9&A)gk:\034G/[8oQMLG-\032\036ok6\024WM]\025;]Vl'-\032:![5\002s)\032;!i\",\007E\\;nE\026\024\be\0344!m\006d\027\016\032\021tY>$8\017I5oAQD\027n\035\021fqB|'\017\036\021ckNt\003bBA.'\022\005\021QL\001\017O\026$hk\\5e\0032dwn^3e)\031\t)!a\030\002b!A\0211CA-\001\004\t)\002\003\005\002$\005e\003\031AA\023Q!\tI&!\f\0024\005\025\024EAA4\003!4WO\\2uS>t\007f]5eKjrW/\0342fe&R$m\\8mK\006t\007%L\027!\017\026$\be\0365fi\",'\017I8sA9|G\017I3tg\026tG/[1!Kb\004xN\035;fI\002Jg\016^8!C\0022x.\0333!U\006\024\be^5mY\002\nG\016\\8xAY|\027\016Z5oO\"9\0211N*\005\002\0055\024AD:fiZ{\027\016Z!mY><X\r\032\013\007\003\013\ty'!\035\t\021\005M\021\021\016a\001\003+A\001\"a\t\002j\001\007\021Q\005\025\t\003S\ni#a\r\002v\005\022\021qO\001@MVt7\r^5p]\"\032\030\016Z3;]Vl'-\032:-A\005dGn\\<fIj\022wn\0347fC:L#HY8pY\026\fg\016I\027.AM+G\017\t<pS\022\004Sn\0343f\021\025yc\n1\0011\021\025Qd\n1\001<\021\025yd\n1\001<\021\025\te\n1\001<\021\025\031e\n1\001E\017\035\t)i\004E\001\003\017\013\001\002\025:pm&$WM\035\t\004%\006%eaBAF\037!\005\021Q\022\002\t!J|g/\0333feN)\021\021\022\n\002\020B\0311$!%\n\007\005MEDA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\004$\003\023#\t!a&\025\005\005\035\005\002CAN\003\023#\t%!(\002\035\035,G/\0228wSJ|g.\\3oiR!\021qTAca\021\t\t+a-\021\r\005\r\026\021VAX\035\rI\023QU\005\004\003OS\023A\002)sK\022,g-\003\003\002,\0065&!B\"mCN\034(bAATUA!\021\021WAZ\031\001!A\"!.\002\032\006\005\t\021!B\001\003o\0231a\030\0232#\021\tI,a0\021\007%\nY,C\002\002>*\022qAT8uQ&tw\rE\002*\003\003L1!a1+\005\r\te.\037\005\t\003\017\fI\n1\001\002J\006)1\017^1dWB!\0211ZAi\033\t\tiMC\002\002PN\nA!\033;f[&!\0211[Ag\005%IE/Z7Ti\006\0347\016")
/*    */ public final class DriverEssentiaExportBus {
/*    */   public static Environment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverEssentiaExportBus$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverEssentiaExportBus$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/* 22 */   public final class DriverEssentiaExportBus$$anonfun$worksWith$3 extends AbstractFunction1<IPart, Object> implements Serializable { public final boolean apply(IPart x$1) { return x$1 instanceof PartEssentiaExportBus; } public static final long serialVersionUID = 0L; } public final class DriverEssentiaExportBus$$anonfun$worksWith$2 extends AbstractFunction1<IPart, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IPart obj) { return !(obj == null); } } public final class DriverEssentiaExportBus$$anonfun$worksWith$1 extends AbstractFunction1<ForgeDirection, IPart> implements Serializable { public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final IPart apply(ForgeDirection x$1) { return ((IPartHost)this.x2$1).getPart(x$1); }
/*    */     
/*    */     public DriverEssentiaExportBus$$anonfun$worksWith$1(TileEntity x2$1) {} }
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IPartHost> implements NamedBlock, PartEnvironmentBase { private final World world;
/*    */     private final IPartHost host;
/*    */     
/* 28 */     public <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] getSlotSize(Context context, Arguments args, ClassTag evidence$1) { return PartEnvironmentBase$class.getSlotSize(this, context, args, evidence$1); } public <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] getPartConfig(Context context, Arguments args, ClassTag evidence$2) { return PartEnvironmentBase$class.getPartConfig(this, context, args, evidence$2); } public <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] setPartConfig(Context context, Arguments args, ClassTag evidence$3) { return PartEnvironmentBase$class.setPartConfig(this, context, args, evidence$3); } public World world() { return this.world; } public IPartHost host() { return this.host; } public Environment(World world, IPartHost host) { super(host, "essentia_exportbus"); PartEnvironmentBase$class.$init$(this); } public String preferredName() {
/* 29 */       return "essentia_exportbus";
/*    */     } public int priority() {
/* 31 */       return 2;
/*    */     } @Callback(doc = "function(side:number[, slot:number]):string -- Get the configuration of the export bus pointing in the specified direction.")
/*    */     public Object[] getExportConfiguration(Context context, Arguments args) {
/* 34 */       return getPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartEssentiaExportBus.class));
/*    */     } @Callback(doc = "function(side:number[, slot:number][, aspect:string]):boolean -- Configure the export bus pointing in the specified direction to export essentia matching the specified type.")
/*    */     public Object[] setExportConfiguration(Context context, Arguments args) {
/* 37 */       return setPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartEssentiaExportBus.class));
/*    */     } @Callback(doc = "function(side:number):number -- Get the number of valid slots in this export bus.")
/*    */     public Object[] getExportSlotSize(Context context, Arguments args) {
/* 40 */       return getSlotSize(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartEssentiaExportBus.class));
/*    */     } @Callback(doc = "function(side:number):boolean -- Get whether or not essentia exported into a void jar will allow voiding")
/*    */     public Object[] getVoidAllowed(Context context, Arguments args) {
/*    */       Object[] arrayOfObject;
/* 44 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 45 */       IPart iPart = host().getPart(side);
/* 46 */       if (iPart instanceof PartEssentiaExportBus) { PartEssentiaExportBus partEssentiaExportBus = (PartEssentiaExportBus)iPart;
/* 47 */         arrayOfObject = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(partEssentiaExportBus.isVoidAllowed()) })); }
/* 48 */       else { arrayOfObject = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no essentia export bus" })); }
/*    */       
/*    */       return arrayOfObject;
/*    */     } @Callback(doc = "function(side:number, allowed:boolean):boolean -- Set void mode")
/*    */     public Object[] setVoidAllowed(Context context, Arguments args) {
/*    */       Object[] arrayOfObject;
/* 54 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 55 */       boolean mode = args.checkBoolean(1);
/* 56 */       IPart iPart = host().getPart(side);
/* 57 */       if (iPart instanceof PartEssentiaExportBus) { PartEssentiaExportBus partEssentiaExportBus = (PartEssentiaExportBus)iPart;
/* 58 */         boolean didSomething = false;
/* 59 */         if (mode != partEssentiaExportBus.isVoidAllowed()) {
/* 60 */           partEssentiaExportBus.toggleVoidMode();
/* 61 */           didSomething = true;
/*    */         } 
/*    */         
/* 64 */         arrayOfObject = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(didSomething) })); }
/* 65 */       else { arrayOfObject = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no essentia export bus" })); }
/*    */       
/*    */       return arrayOfObject;
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 71 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 73 */       return (ThEApi.instance().parts()).Essentia_ExportBus.getStack().func_77969_a(stack) ? 
/* 74 */         DriverEssentiaExportBus.Environment.class : 
/* 75 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\DriverEssentiaExportBus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */