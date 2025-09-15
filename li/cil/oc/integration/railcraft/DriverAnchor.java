/*    */ package li.cil.oc.integration.railcraft;
/*    */ 
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005uu!B\001\003\021\003i\021\001\004#sSZ,'/\0218dQ>\024(BA\002\005\003%\021\030-\0337de\0064GO\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\r\tJLg/\032:B]\016DwN]\n\003\037I\001\"a\005\r\016\003QQ!!\006\f\002\rA\024XMZ1c\025\t9b!A\002ba&L!!\007\013\003+\021\023\030N^3s'&$W\r\032+jY\026,e\016^5us\")1d\004C\0019\0051A(\0338jiz\"\022!\004\005\006==!\taH\001\023O\026$H+\0337f\013:$\030\016^=DY\006\0348\017F\001!a\t\tS\006E\002#Q-r!a\t\024\016\003\021R\021!J\001\006g\016\fG.Y\005\003O\021\na\001\025:fI\0264\027BA\025+\005\025\031E.Y:t\025\t9C\005\005\002-[1\001A!\003\030\036\003\003\005\tQ!\0010\005\ryF%M\t\003aM\002\"aI\031\n\005I\"#a\002(pi\"Lgn\032\t\003GQJ!!\016\023\003\007\005s\027\020C\0038\037\021\005\001(A\tde\026\fG/Z#om&\024xN\\7f]R$b!O K\037F\033\006C\001\036>\033\005Y$B\001\037\027\003\035qW\r^<pe.L!AP\036\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006\001Z\002\r!Q\001\006o>\024H\016\032\t\003\005\"k\021a\021\006\003\001\022S!!\022$\002\0235Lg.Z2sC\032$(\"A$\002\0079,G/\003\002J\007\n)qk\034:mI\")1J\016a\001\031\006\t\001\020\005\002$\033&\021a\n\n\002\004\023:$\b\"\002)7\001\004a\025!A=\t\013I3\004\031\001'\002\003iDQ\001\026\034A\002U\013Aa]5eKB\021a+X\007\002/*\021\001,W\001\005kRLGN\003\002[7\00611m\\7n_:T!\001\030$\002\0355Lg.Z2sC\032$hm\034:hK&\021al\026\002\017\r>\024x-\032#je\026\034G/[8o\r\021\001wBA1\003\027\025sg/\033:p]6,g\016^\n\004?\n$\bcA2eM6\tA!\003\002f\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\bCA4s\033\005A'BA5k\003\025\tG\016\0355b\025\tYG.A\004nC\016D\027N\\3\013\0055t\027A\0022m_\016\\7O\003\002[_*\0211\001\035\006\002c\006!Qn\0343t\023\t\031\bNA\bUS2,\027I\\2i_J<vN\0357e!\t)\b0D\001w\025\t9h#\001\004ee&4XM]\005\003sZ\024!BT1nK\022\024En\\2l\021!YxL!b\001\n\003a\030\001\002;jY\026,\022A\032\005\t}~\023\t\021)A\005M\006)A/\0337fA!11d\030C\001\003\003!B!a\001\002\bA\031\021QA0\016\003=AQa_@A\002\031Dq!a\003`\t\003\ni!A\007qe\0264WM\035:fI:\013W.\032\013\003\003\037\001B!!\005\002\0345\021\0211\003\006\005\003+\t9\"\001\003mC:<'BAA\r\003\021Q\027M^1\n\t\005u\0211\003\002\007'R\024\030N\\4\t\017\005\005r\f\"\021\002$\005A\001O]5pe&$\030\020F\001M\021\035\t9c\030C\001\003S\tqaZ3u\rV,G\016\006\004\002,\005]\022Q\t\t\006G\0055\022\021G\005\004\003_!#!B!se\006L\bcA\022\0024%\031\021Q\007\023\003\r\005s\027PU3g\021!\tI$!\nA\002\005m\022aB2p]R,\007\020\036\t\005\003{\t\t%\004\002\002@)\0211NF\005\005\003\007\nyDA\004D_:$X\r\037;\t\021\005\035\023Q\005a\001\003\023\nA!\031:hgB!\021QHA&\023\021\ti%a\020\003\023\005\023x-^7f]R\034\b\006CA\023\003#\n9&!\027\021\t\005u\0221K\005\005\003+\nyD\001\005DC2d'-Y2l\003\r!wnY\021\003\0037\n!HZ;oGRLwN\034\025*u%tG\017I\027.A\035+G\017\t;iK\002\022X-\\1j]&tw\rI1oG\"|'\017\t;j[\026d\003%\0338!i&\0347n\035\030\t\017\005}s\f\"\001\002b\005Aq-\032;Po:,'\017\006\004\002,\005\r\024Q\r\005\t\003s\ti\0061\001\002<!A\021qIA/\001\004\tI\005\013\005\002^\005E\023qKA5C\t\tY'A\030gk:\034G/[8oQ%R4\017\036:j]\036\004S&\f\021HKR\004C\017[3!C:\034\007n\034:!_^tWM\035\021oC6,g\006C\004\002p}#\t!!\035\002\017\035,G\017V=qKR1\0211FA:\003kB\001\"!\017\002n\001\007\0211\b\005\t\003\017\ni\0071\001\002J!B\021QNA)\003/\nI(\t\002\002|\005Ic-\0368di&|g\016K\025;gR\024\030N\\4![5\002s)\032;!i\",\007%\0318dQ>\024\b\005^=qK:Bq!a `\t\003\t\t)A\nhKR4U/\0327TY>$8i\0348uK:$8\017\006\004\002,\005\r\025Q\021\005\t\003s\ti\b1\001\002<!A\021qIA?\001\004\tI\005\013\005\002~\005E\023qKAEC\t\tY)\001\035gk:\034G/[8oQ%RD/\0312mK\002jS\006I$fi\002\"\b.\032\021b]\016DwN\035\021gk\026d\007e\0357pi\036\032\beY8oi\026tGo\035\030\t\017\005=u\f\"\001\002\022\006Q\021n\035#jg\006\024G.\0323\025\r\005-\0221SAK\021!\tI$!$A\002\005m\002\002CA$\003\033\003\r!!\023)\021\0055\025\021KA,\0033\013#!a'\002\r\032,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001Je\r\t;iK\002\ngn\0315pe\002J7\017\t3jg\006\024G.\0323!QA|w/\032:fI\002\022\027\020\t:fIN$xN\\3*]\001")
/*    */ public final class DriverAnchor {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverAnchor$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverAnchor$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverAnchor$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileAnchorWorld> implements NamedBlock {
/* 22 */     public TileAnchorWorld tile() { return this.tile; } private final TileAnchorWorld tile; public Environment(TileAnchorWorld tile) { super(tile, "anchor"); }
/* 23 */     public String preferredName() { return "anchor"; } public int priority() {
/* 24 */       return 5;
/*    */     } @Callback(doc = "function():int -- Get the remaining anchor time, in ticks.")
/*    */     public Object[] getFuel(Context context, Arguments args) {
/* 27 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToLong(tile().getAnchorFuel()) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the anchor owner name.")
/* 31 */     public Object[] getOwner(Context context, Arguments args) { return (tile().getOwner() == null || tile().getOwner().getName() == null || Objects.equals(tile().getOwner().getName(), "[Railcraft]")) ? 
/* 32 */         ResultWrapper$.MODULE$.result((Seq)Nil$.MODULE$) : 
/*    */         
/* 34 */         ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { tile().getOwner().getName() })); }
/*    */     @Callback(doc = "function():string -- Get the anchor type.")
/*    */     public Object[] getType(Context context, Arguments args) { Object[] arrayOfObject;
/* 37 */       IEnumMachine iEnumMachine = tile().getMachineType();
/* 38 */       if (EnumMachineAlpha.WORLD_ANCHOR.equals(iEnumMachine)) { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { "world" })); }
/* 39 */       else if (EnumMachineAlpha.ADMIN_ANCHOR.equals(iEnumMachine)) { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { "admin" })); }
/* 40 */       else if (EnumMachineAlpha.PERSONAL_ANCHOR.equals(iEnumMachine)) { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { "personal" })); }
/* 41 */       else if (EnumMachineAlpha.PASSIVE_ANCHOR.equals(iEnumMachine)) { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { "passive" })); }
/* 42 */       else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { "missing" })); }
/*    */       
/*    */       return arrayOfObject; } @Callback(doc = "function():table -- Get the anchor fuel slot's contents.")
/*    */     public Object[] getFuelSlotContents(Context context, Arguments args) {
/* 46 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { tile().func_70301_a(0) }));
/*    */     } @Callback(doc = "function():boolean -- If the anchor is disabled (powered by redstone).")
/*    */     public Object[] isDisabled(Context context, Arguments args) {
/* 49 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(tile().isPowered()) }));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\DriverAnchor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */