/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]faB\001\003!\003\r\t!\004\002\020%\026$7\017^8oK\n+h\016\0327fI*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\031\001(/\0324bE*\0211CB\001\004CBL\027BA\013\021\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\021\005]AR\"\001\002\n\005e\021!a\004*fIN$xN\\3WC:LG\016\\1\t\013m\001A\021\001\017\002\r\021Jg.\033;%)\005i\002C\001\020\"\033\005y\"\"\001\021\002\013M\034\027\r\\1\n\005\tz\"\001B+oSRD\001\002\n\001\t\006\004%i!J\001\013I\0264\030nY3J]\032|W#\001\024\021\t\035bcFL\007\002Q)\021\021FK\001\nS6lW\017^1cY\026T!aK\020\002\025\r|G\016\\3di&|g.\003\002.Q\t\031Q*\0319\021\005=\"T\"\001\031\013\005E\022\024\001\0027b]\036T\021aM\001\005U\0064\030-\003\0026a\t11\013\036:j]\036D\001b\016\001\t\002\003\006kAJ\001\fI\0264\030nY3J]\032|\007\005C\003:\001\021\005#(A\007hKR$UM^5dK&sgm\034\013\002wA!Ah\020!A\033\005i$B\001 3\003\021)H/\0337\n\0055j\004CA!E\035\tq\")\003\002D?\0051\001K]3eK\032L!!N#\013\005\r{\002bB$\001\005\004%I\001S\001\f\007>cuJU0S\003:;U)F\001J!\t9#*\003\002LQ\t)!+\0318hK\"1Q\n\001Q\001\n%\013AbQ(M\037J{&+\021(H\013\002BQa\024\001\007BA\013\001B]3egR|g.Z\013\002#J\031!\013\026.\007\tM\003\001!\025\002\ryI,g-\0338f[\026tGO\020\t\003+bk\021A\026\006\003/J\tqA\\3uo>\0248.\003\002Z-\nyQI\034<je>tW.\0328u\021>\034H\017\005\002\\E6\tAL\003\002^=\0061AO]1jiNT!a\0301\002\025QLG.Z3oi&$\030P\003\002b\r\00511m\\7n_:L!a\031/\003)\t+h\016\0327fIJ+Gm\035;p]\026\fu/\031:f\021\025)\007\001\"\003g\00319W\r\036\"v]\022dWmS3z)\t97\020\005\003\037Q*<\030BA5 \005\031!V\017\0357feA\031ad[7\n\0051|\"AB(qi&|g\016\005\002ok6\tqN\003\002?a*\021\021-\035\006\003eN\fa\"\\5oK\016\024\030M\032;g_J<WMC\001u\003\rqW\r^\005\003m>\024aBR8sO\026$\025N]3di&|g\016E\002\037Wb\004\"AH=\n\005i|\"aA%oi\")A\020\032a\001{\006!\021M]4t!\rq\0301A\007\002*\031\021\021\001\n\002\0175\f7\r[5oK&\031\021QA@\003\023\005\023x-^7f]R\034\bbBA\005\001\021%\0211B\001\023i\006\024G.\032+p\007>dwN\035,bYV,7\017\006\003\002\016\005M\001\003\002\020\002\020aL1!!\005 \005\025\t%O]1z\021!\t)\"a\002A\002\005]\021!\002;bE2,\007GBA\r\003?\t\031\004\005\004=\005m\021\021\007\t\005\003;\ty\002\004\001\005\031\005\005\0221CA\001\002\003\025\t!a\t\003\007}#\023'\005\003\002&\005-\002c\001\020\002(%\031\021\021F\020\003\0179{G\017[5oOB\031a$!\f\n\007\005=rDA\002B]f\004B!!\b\0024\021a\021QGA\n\003\003\005\tQ!\001\002$\t\031q\f\n\032\t\017\005e\002\001\"\003\002<\005Y1m\0347peN$v.T1q)\021\ti$!\021\021\013\005\013y\004\037=\n\0055*\005\002CA\"\003o\001\r!!\004\002\005\005\024\bbBA$\001\021%\021\021J\001\013g&$Wm\035+p\033\006\004H\003BA&\003\033\002b!QA q\006u\002\002CA\"\003\013\002\r!a\024\021\013y\ty!!\004\t\017\005M\003\001\"\003\002V\005\031r-\032;Ck:$G.Z!tg&<g.\\3oiR!\021qKA/!%q\022\021LA\026\003W\tY#C\002\002\\}\021a\001V;qY\026\034\004B\002?\002R\001\007Q\020C\004\002b\001!\t!a\031\002\037\035,GOQ;oI2,G-\0238qkR$b!!\032\002n\005]\004#\002\020\002\020\005\035\004c\001\020\002j%\031\0211N\020\003\r\005s\027PU3g\021!\ty'a\030A\002\005E\024aB2p]R,\007\020\036\t\004}\006M\024bAA;\n91i\0348uKb$\bB\002?\002`\001\007Q\020\013\007\002`\005m\024\021QAB\003\013\0139\tE\002\003{J1!a \000\005!\031\025\r\0347cC\016\\\027A\0023je\026\034G/G\001\002\003\r!wnY\021\003\003\023\013QLZ;oGRLwN\034\025\\g&$WM\0178v[\n,'o\027\027!G>dwN\035\036ok6\024WM]/^SirW/\0342fe\002z'\017\t;bE2,\007%L\027!\r\026<XM\035\021qCJ\fWn\035\021sKR,(O\\:!g\026$\be\0344!S:\004X\017^:\t\017\0055\005\001\"\001\002\020\006\001r-\032;Ck:$G.\0323PkR\004X\017\036\013\007\003K\n\t*a%\t\021\005=\0241\022a\001\003cBa\001`AF\001\004i\b\006DAF\003w\n\t)a!\002\006\006]\025EAAM\003y3WO\\2uS>t\007fW:jI\026Td.^7cKJ\\F\006I2pY>\024(H\\;nE\026\024X,X\025;]Vl'-\032:!_J\004C/\0312mK\002jS\006\t$fo\026\024\b\005]1sC6\034\bE]3ukJt7\017I:fi\002zg\rI8viB,Ho\035\005\b\003;\003A\021AAP\003A\031X\r\036\"v]\022dW\rZ(viB,H\017\006\004\002f\005\005\0261\025\005\t\003_\nY\n1\001\002r!1A0a'A\002uD\003\"a'\002|\005\025\025qU\021\003\003S\013\0211\0054v]\016$\030n\0348)7NLG-\032\036ok6\024WM].-A\r|Gn\034:;]Vl'-\032:-;v\003c/\0317vKjrW/\0342fe\002z'\017\t;bE2,\027F\0178v[\n,'\017I8sAQ\f'\r\\3![5\002\003ER3xKJ\004\003/\031:b[N\004Co\034\021bgNLwM\034\021tKR\004sN\032\021pkR\004X\017^:/AI+G/\036:og\002\002(/\032<j_V\034\bE^1mk\026\034\bbBAW\001\021%\021qV\001\013G\",7m[\"pY>\024H#\002=\0022\006M\006B\002?\002,\002\007Q\020C\004\0026\006-\006\031\001=\002\013%tG-\032=")
/*    */ public interface RedstoneBundled extends RedstoneVanilla {
/*    */   void li$cil$oc$server$component$RedstoneBundled$_setter_$li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE_$eq(Range paramRange);
/*    */   
/*    */   Map<String, String> li$cil$oc$server$component$RedstoneBundled$$deviceInfo();
/*    */   
/*    */   Map<String, String> getDeviceInfo();
/*    */   
/*    */   Range li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE();
/*    */   
/*    */   EnvironmentHost redstone();
/*    */   
/*    */   @Callback(direct = true, doc = "function([side:number[, color:number]]):number or table -- Fewer params returns set of inputs")
/*    */   Object[] getBundledInput(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(direct = true, doc = "function([side:number[, color:number]]):number or table -- Fewer params returns set of outputs")
/*    */   Object[] getBundledOutput(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function([side:number[, color:number,]] value:number or table):number or table --  Fewer params to assign set of outputs. Returns previous values")
/*    */   Object[] setBundledOutput(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class RedstoneBundled$$anonfun$tableToColorValues$1 extends AbstractPartialFunction.mcII.sp implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final Map table$1;
/*    */     
/*    */     public final boolean isDefinedAt(int x1) {
/*    */       boolean bool;
/*    */       int i = x1;
/*    */       int j = i;
/*    */       if (this.table$1.containsKey(BoxesRunTime.boxToInteger(j))) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       return bool;
/*    */     }
/*    */     
/*    */     public final <A1, B1> B1 applyOrElse(int x1, Function1 default) {
/* 46 */       int i = x1;
/* 47 */       int j = i; if (this.table$1.containsKey(BoxesRunTime.boxToInteger(j))) {
/* 48 */         Object object = this.table$1.get(BoxesRunTime.boxToInteger(j));
/* 49 */         if (object instanceof Integer) { Integer integer2 = (Integer)object; int k = Predef$.MODULE$.Integer2int(integer2);
/*    */           Integer integer1 = BoxesRunTime.boxToInteger(k); }
/*    */         
/*    */         throw new MatchError(object);
/*    */       } 
/*    */       return (B1)default.apply(BoxesRunTime.boxToInteger(x1));
/*    */     } public RedstoneBundled$$anonfun$tableToColorValues$1(RedstoneBundled $outer, Map table$1) {} } public final class RedstoneBundled$$anonfun$li$cil$oc$server$component$RedstoneBundled$$colorsToMap$1 extends AbstractFunction1<Object, Tuple2<Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; private final int[] ar$1; public final Tuple2<Object, Object> apply(int x0$1) {
/* 56 */       int i = x0$1;
/* 57 */       if (i < this.ar$1.length) return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(i)), BoxesRunTime.boxToInteger(this.ar$1[i])); 
/*    */       throw new MatchError(BoxesRunTime.boxToInteger(i));
/*    */     } public RedstoneBundled$$anonfun$li$cil$oc$server$component$RedstoneBundled$$colorsToMap$1(RedstoneBundled $outer, int[] ar$1) {} }
/*    */   public final class RedstoneBundled$$anonfun$sidesToMap$1 extends AbstractFunction1<ForgeDirection, Tuple2<Object, Map<Object, Object>>> implements Serializable { public static final long serialVersionUID = 0L; private final int[][] ar$2;
/*    */     public final Tuple2<Object, Map<Object, Object>> apply(ForgeDirection x0$2) {
/* 62 */       ForgeDirection forgeDirection = x0$2;
/* 63 */       if (forgeDirection.ordinal() < this.ar$2.length && (this.ar$2[forgeDirection.ordinal()]).length > 0) return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(forgeDirection.ordinal())), RedstoneBundled$class.li$cil$oc$server$component$RedstoneBundled$$colorsToMap(this.$outer, this.ar$2[forgeDirection.ordinal()])); 
/*    */       throw new MatchError(forgeDirection);
/*    */     }
/*    */     
/*    */     public RedstoneBundled$$anonfun$sidesToMap$1(RedstoneBundled $outer, int[][] ar$2) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneBundled.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */