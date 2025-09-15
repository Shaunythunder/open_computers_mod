/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Q3A!\001\002\001\033\t!R\013]4sC\022,7+[4o\023:\fE-\0319uKJT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005-)\006o\032:bI\026\034\026n\0328\t\021M\001!Q1A\005\002Q\tA\001[8tiV\tQ\003\005\002\02775\tqC\003\002\0313\0059a.\032;x_J\\'B\001\016\007\003\r\t\007/[\005\0039]\021q\"\0228wSJ|g.\\3oi\"{7\017\036\005\t=\001\021\t\021)A\005+\005)\001n\\:uA!)\001\005\001C\001C\0051A(\0338jiz\"\"AI\022\021\005=\001\001\"B\n \001\004)\002bB\023\001\005\004%\tEJ\001\005]>$W-F\001(!\t1\002&\003\002*/\t\0212i\\7q_:,g\016^\"p]:,7\r^8s\021\031Y\003\001)A\005O\005)an\0343fA!)Q\006\001C\001]\005Aq-\032;WC2,X\rF\0020q\001\0032\001M\0326\033\005\t$\"\001\032\002\013M\034\027\r\\1\n\005Q\n$!B!se\006L\bC\001\0317\023\t9\024G\001\004B]f\024VM\032\005\006s1\002\rAO\001\bG>tG/\032=u!\tYd(D\001=\025\ti\024$A\004nC\016D\027N\\3\n\005}b$aB\"p]R,\007\020\036\005\006\0032\002\rAQ\001\005CJ<7\017\005\002<\007&\021A\t\020\002\n\003J<W/\\3oiNDC\001\f$J\025B\0211hR\005\003\021r\022\001bQ1mY\n\f7m[\001\004I>\034\027%A&\002=\032,hn\031;j_:D3/\0333fu9,XNY3sSi\032HO]5oO\002jS\006I$fi\002\"\b.\032\021uKb$\be\0348!i\",\007e]5h]\002zg\016\t;iK\002\032\b/Z2jM&,G\rI:jI\026\004sN\032\021uQ\026\004\023\rZ1qi\026\024h\006C\003N\001\021\005a*\001\005tKR4\026\r\\;f)\rys\n\025\005\006s1\003\rA\017\005\006\0032\003\rA\021\025\005\031\032K%+I\001T\00314WO\\2uS>t\007f]5eKjrW/\0342fe2\002c/\0317vKj\032HO]5oO&R4\017\036:j]\036\004S&\f\021TKR\004C\017[3!i\026DH\017I8oAQDW\rI:jO:\004sN\034\021uQ\026\0043\017]3dS\032LW\r\032\021tS\022,\007e\0344!i\",\007%\0313baR,'O\f")
/*    */ public class UpgradeSignInAdapter extends UpgradeSign {
/*    */   public EnvironmentHost host() {
/* 11 */     return this.host;
/* 12 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 13 */     .withComponent("sign", Visibility.Network)
/* 14 */     .withConnector()
/* 15 */     .create(); public ComponentConnector node() {
/*    */     return this.node;
/*    */   }
/*    */   @Callback(doc = "function(side:number):string -- Get the text on the sign on the specified side of the adapter.")
/*    */   public Object[] getValue(Context context, Arguments args) {
/* 20 */     return getValue(findSign(ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0)));
/*    */   } @Callback(doc = "function(side:number, value:string):string -- Set the text on the sign on the specified side of the adapter.")
/*    */   public Object[] setValue(Context context, Arguments args) {
/* 23 */     return setValue(findSign(ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0)), args.checkString(1));
/*    */   }
/*    */   
/*    */   public UpgradeSignInAdapter(EnvironmentHost host) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeSignInAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */