/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001-<Q!\001\002\t\0025\tQ!S2p]NT!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005\025I5m\0348t'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035Aq\001H\bC\002\023%Q$\001\006csNcw\016\036+za\026,\022A\b\t\005?\0212S&D\001!\025\t\t#%A\004nkR\f'\r\\3\013\005\r\"\022AC2pY2,7\r^5p]&\021Q\005\t\002\004\033\006\004\bCA\024+\035\t\031\002&\003\002*)\0051\001K]3eK\032L!a\013\027\003\rM#(/\0338h\025\tIC\003\005\002/k5\tqF\003\0021c\005!Q\017^5m\025\t\0214'A\005nS:,7M]1gi*\tA'A\002oKRL!AN\030\003\013%K5m\0348\t\raz\001\025!\003\037\003-\021\027p\0257piRK\b/\032\021\t\017iz!\031!C\005w\0051!-\037+jKJ,\022\001\020\t\005?\021jT\006\005\002\024}%\021q\b\006\002\004\023:$\bBB!\020A\003%A(A\004csRKWM\035\021\t\013\r{A\021\001#\002%=t\027\n^3n\023\016|gNU3hSN$XM\035\013\003\013\"\003\"a\005$\n\005\035#\"\001B+oSRDQ!\023\"A\002)\013\021!\032\t\003\027Fk\021\001\024\006\003\033:\013Q!\032<f]RT!!B(\013\005A\033\024AD7j]\026\034'/\0314uM>\024x-Z\005\003%2\023!\003V3yiV\024Xm\025;ji\016DWI^3oi\"\022!\t\026\t\003+\002l\021A\026\006\003/b\013A\"\032<f]RD\027M\0343mKJT!!\027.\002\r\r|W.\\8o\025\tYF,A\002g[2T!!\0300\002\t5|Gm\035\006\002?\006\0311\r]<\n\005\0054&AD*vEN\034'/\0332f\013Z,g\016\036\005\006G>!\t\001Z\001\004O\026$HCA\027f\021\0251'\r1\001'\003!\031Hn\034;UsB,\007\"B2\020\t\003AGCA\027j\021\025Qw\r1\001>\003\021!\030.\032:")
/*    */ public final class Icons {
/*    */   public static IIcon get(int paramInt) {
/*    */     return Icons$.MODULE$.get(paramInt);
/*    */   }
/*    */   
/*    */   public static IIcon get(String paramString) {
/*    */     return Icons$.MODULE$.get(paramString);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onItemIconRegister(TextureStitchEvent paramTextureStitchEvent) {
/*    */     Icons$.MODULE$.onItemIconRegister(paramTextureStitchEvent);
/*    */   }
/*    */   
/*    */   public final class Icons$$anonfun$onItemIconRegister$1 extends AbstractFunction1<String, Map<String, IIcon>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Map<String, IIcon> apply(String name) {
/* 22 */       return (Map<String, IIcon>)Icons$.MODULE$.li$cil$oc$client$gui$Icons$$bySlotType().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), this.iconRegister$1.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":icons/").append(name).toString())));
/*    */     } private final TextureMap iconRegister$1; public Icons$$anonfun$onItemIconRegister$1(TextureMap iconRegister$1) {} }
/*    */   public final class Icons$$anonfun$onItemIconRegister$2 extends AbstractFunction1<Object, Map<Object, IIcon>> implements Serializable { public static final long serialVersionUID = 0L; private final TextureMap iconRegister$1;
/*    */     public Icons$$anonfun$onItemIconRegister$2(TextureMap iconRegister$1) {}
/*    */     public final Map<Object, IIcon> apply(int tier) {
/* 27 */       return (Map<Object, IIcon>)Icons$.MODULE$.li$cil$oc$client$gui$Icons$$byTier().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(tier)), this.iconRegister$1.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":icons/tier").append(BoxesRunTime.boxToInteger(tier)).toString())));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Icons.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */