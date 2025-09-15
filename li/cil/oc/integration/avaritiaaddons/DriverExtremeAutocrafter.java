/*    */ package li.cil.oc.integration.avaritiaaddons;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import scala.Tuple3;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]u!B\001\003\021\003i\021\001\007#sSZ,'/\022=ue\026lW-Q;u_\016\024\030M\032;fe*\0211\001B\001\017CZ\f'/\033;jC\006$Gm\0348t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\tABI]5wKJ,\005\020\036:f[\026\fU\017^8de\0064G/\032:\024\005=\021\002CA\n\031\033\005!\"BA\013\027\003\031\001(/\0324bE*\021qCB\001\004CBL\027BA\r\025\005U!%/\033<feNKG-\0323US2,WI\034;jifDQaG\b\005\002q\ta\001P5oSRtD#A\007\t\013yyA\021A\020\002%\035,G\017V5mK\026sG/\033;z\0072\f7o\035\013\002AA\022\021%\f\t\004E!ZcBA\022'\033\005!#\"A\023\002\013M\034\027\r\\1\n\005\035\"\023A\002)sK\022,g-\003\002*U\t)1\t\\1tg*\021q\005\n\t\003Y5b\001\001B\005/;\005\005\t\021!B\001_\t\031q\fJ\031\022\005A\032\004CA\0222\023\t\021DEA\004O_RD\027N\\4\021\005\r\"\024BA\033%\005\r\te.\037\005\006o=!\t\005O\001\022GJ,\027\r^3F]ZL'o\0348nK:$HCB\035@\025>\0136\013\005\002;{5\t1H\003\002=-\0059a.\032;x_J\\\027B\001 <\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\013\0013\004\031A!\002\013]|'\017\0343\021\005\tCU\"A\"\013\005\001#%BA#G\003%i\027N\\3de\0064GOC\001H\003\rqW\r^\005\003\023\016\023QaV8sY\022DQa\023\034A\0021\013\021\001\037\t\003G5K!A\024\023\003\007%sG\017C\003Qm\001\007A*A\001z\021\025\021f\0071\001M\003\005Q\b\"\002+7\001\004)\026\001B:jI\026\004\"AV/\016\003]S!\001W-\002\tU$\030\016\034\006\0035n\013aaY8n[>t'B\001/G\0039i\027N\\3de\0064GOZ8sO\026L!AX,\003\035\031{'oZ3ESJ,7\r^5p]\032!\001m\004\002b\005-)eN^5s_:lWM\034;\024\005}\023\007cA2eM6\tA!\003\002f\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\bCA4q\033\005A'BA5k\003I)\007\020\036:f[\026\fW\017^8de\0064G/\032:\013\005-d\027!\0022m_\016\\'BA7o\0035\tg/\031:ji&\fG\rZ8og*\tq.\001\004xC:LwN\\\005\003c\"\024A\004V5mK\026sG/\033;z\013b$(/Z7f\003V$xn\021:bMR,'\017\003\005t?\n\025\r\021\"\001u\003\021!\030\016\\3\026\003\031D\001B^0\003\002\003\006IAZ\001\006i&dW\r\t\005\0067}#\t\001\037\013\003sn\004\"A_0\016\003=AQa]<A\002\031DQ!`0\005\002y\fAb]3u\017\"|7\017^%uK6$Ra`A\006\0037\001RaIA\001\003\013I1!a\001%\005\025\t%O]1z!\r\031\023qA\005\004\003\023!#AB!osJ+g\rC\004\002\016q\004\r!a\004\002\017\r|g\016^3yiB!\021\021CA\f\033\t\t\031BC\002\002\026Y\tq!\\1dQ&tW-\003\003\002\032\005M!aB\"p]R,\007\020\036\005\b\003;a\b\031AA\020\003\021\t'oZ:\021\t\005E\021\021E\005\005\003G\t\031BA\005Be\036,X.\0328ug\":A0a\n\002.\005=\002\003BA\t\003SIA!a\013\002\024\tA1)\0317mE\006\0347.A\002e_\016\f#!!\r\002\00371WO\\2uS>t\007f\0357pijrW/\0342fe2\002C-\031;bE\006\034XMO:ue&tw\r\f\021eCR\f'-Y:f?Ndw\016\036\036ok6\024WM]\025;E>|G.Z1oA5j\003eU3uAQDW\rI4i_N$\b%\033;f[\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI:m_Rt\003%\023;f[\002\032\bn\\;mI\002\022W\rI5oA\021\fG/\0312bg\026t\003bBA\033?\022\005\021qG\001\rO\026$x\t[8ti&#X-\034\013\006\006e\0221\b\005\t\003\033\t\031\0041\001\002\020!A\021QDA\032\001\004\ty\002\013\005\0024\005\035\022QFA C\t\t\t%\001'gk:\034G/[8oQMdw\016\036\036ok6\024WM]\025;i\006\024G.\032\021.[\001\022V\r^;s]N\004C\017[3!O\"|7\017\036\021ji\026l\007%\031;!i\",\007e\0359fG&4\027.\0323!g2|GO\f\005\b\003\013zF\021BA$\003!9W\r^*uC\016\\G\003BA%\003+\002B!a\023\002R5\021\021Q\n\006\004\003\037\"\025\001B5uK6LA!a\025\002N\tI\021\n^3n'R\f7m\033\005\t\003;\t\031\0051\001\002 \0359\021\021L\b\t\002\005m\023\001\003)s_ZLG-\032:\021\007i\fiFB\004\002`=A\t!!\031\003\021A\023xN^5eKJ\034b!!\030\002d\005M\004\003BA3\003_j!!a\032\013\t\005%\0241N\001\005Y\006twM\003\002\002n\005!!.\031<b\023\021\t\t(a\032\003\r=\023'.Z2u!\021\t)(a\037\016\005\005]$bAA=-\0051AM]5wKJLA!! \002x\t\031RI\034<je>tW.\0328u!J|g/\0333fe\"91$!\030\005\002\005\005ECAA.\021!\t))!\030\005B\005\035\025AD4fi\026sg/\033:p]6,g\016\036\013\005\003\023\013\031\n\r\003\002\f\006=\005\003\002\022)\003\033\0032\001LAH\t-\t\t*a!\002\002\003\005)\021A\030\003\007}##\007\003\005\002\026\006\r\005\031AA%\003\025\031H/Y2l\001")
/*    */ public final class DriverExtremeAutocrafter {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverExtremeAutocrafter$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverExtremeAutocrafter$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverExtremeAutocrafter$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityExtremeAutoCrafter> {
/* 21 */     public TileEntityExtremeAutoCrafter tile() { return this.tile; } private final TileEntityExtremeAutoCrafter tile; public Environment(TileEntityExtremeAutoCrafter tile) { super(tile, "extreme_autocrafter"); }
/*    */      @Callback(doc = "function(slot:number, database:string, database_slot:number):boolean -- Set the ghost item at the specified slot. Item should be in database.")
/*    */     public Object[] setGhostItem(Context context, Arguments args) {
/* 24 */       int slot = args.checkInteger(0);
/* 25 */       if (slot > 80) throw new IllegalArgumentException("Slot number should be from 0 to 80 (inclusive)"); 
/* 26 */       tile().func_70299_a(slot + 81, getStack(args));
/* 27 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*    */     }
/*    */     @Callback(doc = "function(slot:number):table -- Returns the ghost item at the specified slot.")
/*    */     public Object[] getGhostItem(Context context, Arguments args) {
/* 31 */       int slot = args.checkInteger(0);
/* 32 */       if (slot > 80) throw new IllegalArgumentException("Slot number should be from 0 to 80 (inclusive)"); 
/* 33 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { tile().func_70301_a(slot + 81) }));
/*    */     }
/*    */     private ItemStack getStack(Arguments args) {
/* 36 */       if (args.count() > 1) {
/*    */         
/* 38 */         Tuple3 tuple3 = args.isString(0) ? new Tuple3(args.checkString(0), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.optInteger(2, 1))) : 
/* 39 */           new Tuple3(args.checkString(1), BoxesRunTime.boxToInteger(args.checkInteger(2)), BoxesRunTime.boxToInteger(args.optInteger(3, 1))); if (tuple3 != null) {
/*    */           String address = (String)tuple3._1(); int entry = BoxesRunTime.unboxToInt(tuple3._2()), size = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(address, BoxesRunTime.boxToInteger(entry), BoxesRunTime.boxToInteger(size)), tuple31 = tuple32; String str1 = (String)tuple31._1(); int i = BoxesRunTime.unboxToInt(tuple31._2()), j = BoxesRunTime.unboxToInt(tuple31._3());
/* 41 */           Node node = node().network().node(str1);
/*    */         } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         throw new MatchError(tuple3);
/*    */       } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 55 */       return null;
/*    */     } } public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$; public Provider$() {
/* 57 */       MODULE$ = this;
/*    */     } public Class<?> getEnvironment(ItemStack stack) {
/* 59 */       Item item = Item.func_150898_a((Block)BlockExtremeAutoCrafter.instance); if (stack.func_77973_b() == null) { stack.func_77973_b(); if (item != null); } else if (stack.func_77973_b().equals(item))
/*    */       {  }
/*    */     
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\avaritiaaddons\DriverExtremeAutocrafter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */