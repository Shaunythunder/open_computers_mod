/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import net.minecraft.tileentity.TileEntityBeacon;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Mv!B\001\003\021\003i\021\001\004#sSZ,'OQ3bG>t'BA\002\005\003\0351\030M\\5mY\006T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"\001\004#sSZ,'OQ3bG>t7CA\b\023!\t\031\002$D\001\025\025\t)b#\001\004qe\0264\027M\031\006\003/\031\t1!\0319j\023\tIBCA\013Ee&4XM]*jI\026$G+\0337f\013:$\030\016^=\t\013myA\021\001\017\002\rqJg.\033;?)\005i\001\"\002\020\020\t\003z\022AE4fiRKG.Z#oi&$\030p\0217bgN$\022\001\t\031\003C5\0022A\t\025,\035\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\003\031\001&/\0323fM&\021\021F\013\002\006\0072\f7o\035\006\003O\021\002\"\001L\027\r\001\021Ia&HA\001\002\003\025\ta\f\002\004?\022\n\024C\001\0314!\t\031\023'\003\0023I\t9aj\034;iS:<\007CA\0225\023\t)DEA\002B]fDQaN\b\005Ba\n\021c\031:fCR,WI\034<je>tW.\0328u)\031ItHS(R'B\021!(P\007\002w)\021AHF\001\b]\026$xo\034:l\023\tq4H\001\nNC:\fw-\0323F]ZL'o\0348nK:$\b\"\002!7\001\004\t\025!B<pe2$\007C\001\"I\033\005\031%B\001!E\025\t)e)A\005nS:,7M]1gi*\tq)A\002oKRL!!S\"\003\013]{'\017\0343\t\013-3\004\031\001'\002\003a\004\"aI'\n\0059##aA%oi\")\001K\016a\001\031\006\t\021\020C\003Sm\001\007A*A\001{\021\025!f\0071\001V\003\021\031\030\016Z3\021\005YkV\"A,\013\005aK\026\001B;uS2T!AW.\002\r\r|W.\\8o\025\taf)\001\bnS:,7M]1gi\032|'oZ3\n\005y;&A\004$pe\036,G)\033:fGRLwN\034\004\005A>\021\021MA\006F]ZL'o\0348nK:$8cA0cYB\0311\r\0324\016\003\021I!!\032\003\00395\013g.Y4fIRKG.Z#oi&$\0300\0228wSJ|g.\\3oiB\021qM[\007\002Q*\021\021\016R\001\013i&dW-\0328uSRL\030BA6i\005A!\026\016\\3F]RLG/\037\"fC\016|g\016\005\002na6\taN\003\002p-\0051AM]5wKJL!!\0358\003\0259\013W.\0323CY>\0347\016\003\005t?\n\005\t\025!\003g\003)!\030\016\\3F]RLG/\037\005\0067}#\t!\036\013\003mb\004\"a^0\016\003=AQa\035;A\002\031DQA_0\005Bm\fQ\002\035:fM\026\024(/\0323OC6,G#\001?\021\007u\f)!D\001\025\ry\030\021A\001\005Y\006twM\003\002\002\004\005!!.\031<b\023\r\t9A \002\007'R\024\030N\\4\t\017\005-q\f\"\021\002\016\005A\001O]5pe&$\030\020F\001M\021\035\t\tb\030C\001\003'\t\021bZ3u\031\0264X\r\\:\025\r\005U\021\021EA\031!\025\031\023qCA\016\023\r\tI\002\n\002\006\003J\024\030-\037\t\004G\005u\021bAA\020I\t1\021I\\=SK\032D\001\"a\t\002\020\001\007\021QE\001\bG>tG/\032=u!\021\t9#!\f\016\005\005%\"bAA\026-\0059Q.Y2iS:,\027\002BA\030\003S\021qaQ8oi\026DH\017\003\005\0024\005=\001\031AA\033\003\021\t'oZ:\021\t\005\035\022qG\005\005\003s\tICA\005Be\036,X.\0328ug\"B\021qBA\037\003\007\n)\005\005\003\002(\005}\022\002BA!\003S\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA$\003y2WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\004c.^7cKJ\004sN\032\021mKZ,Gn\035\021g_J\004C\017[5tA\t,\027mY8o]!9\0211J0\005\002\0055\023\001E4fiB\023\030.\\1ss\0263g-Z2u)\031\t)\"a\024\002R!A\0211EA%\001\004\t)\003\003\005\0024\005%\003\031AA\033Q!\tI%!\020\002D\005U\023EAA,\003}2WO\\2uS>t\007&\013\036tiJLgn\032\021.[\001:U\r\036\021uQ\026\004c.Y7fA=4\007\005\0365fA\005\034G/\033<fAA\024\030.\\1ss\002*gMZ3di:Bq!a\027`\t\003\ti&\001\nhKR\034VmY8oI\006\024\0300\0224gK\016$HCBA\013\003?\n\t\007\003\005\002$\005e\003\031AA\023\021!\t\031$!\027A\002\005U\002\006CA-\003{\t\031%!\032\"\005\005\035\024!\0214v]\016$\030n\0348)Si\032HO]5oO\002jS\006I$fi\002\"\b.\032\021oC6,\007e\0344!i\",\007%Y2uSZ,\007e]3d_:$\027M]=!K\0324Wm\031;/\021\035\tYg\030C\005\003[\nQbZ3u\013\0324Wm\031;OC6,G\003BA8\003g\0022AIA9\023\r\t9A\013\005\b\003k\nI\0071\001M\003\tIGmB\004\002z=A\t!a\037\002\021A\023xN^5eKJ\0042a^A?\r\035\tyh\004E\001\003\003\023\001\002\025:pm&$WM]\n\007\003{\n\031)!#\021\007u\f))C\002\002\bz\024aa\0242kK\016$\bcA7\002\f&\031\021Q\0228\003'\025sg/\033:p]6,g\016\036)s_ZLG-\032:\t\017m\ti\b\"\001\002\022R\021\0211\020\005\t\003+\013i\b\"\021\002\030\006qq-\032;F]ZL'o\0348nK:$H\003BAM\003G\003D!a'\002 B!!\005KAO!\ra\023q\024\003\f\003C\013\031*!A\001\002\013\005qFA\002`IIB\001\"!*\002\024\002\007\021qU\001\006gR\f7m\033\t\005\003S\013y+\004\002\002,*\031\021Q\026#\002\t%$X-\\\005\005\003c\013YKA\005Ji\026l7\013^1dW\002")
/*    */ public final class DriverBeacon {
/*    */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBeacon$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static Class<?> getTileEntityClass() {
/*    */     return DriverBeacon$.MODULE$.getTileEntityClass();
/*    */   }
/*    */   
/*    */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*    */     return DriverBeacon$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityBeacon> implements NamedBlock {
/* 26 */     public Environment(TileEntityBeacon tileEntity) { super(tileEntity, "beacon"); } private final TileEntityBeacon tileEntity; public String preferredName() {
/* 27 */       return "beacon";
/*    */     } public int priority() {
/* 29 */       return 0;
/*    */     }
/*    */     @Callback(doc = "function():number -- Get the number of levels for this beacon.")
/*    */     public Object[] getLevels(Context context, Arguments args) {
/* 33 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(this.tileEntity.func_145998_l()) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the name of the active primary effect.")
/*    */     public Object[] getPrimaryEffect(Context context, Arguments args) {
/* 38 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { getEffectName(this.tileEntity.func_146007_j()) }));
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the name of the active secondary effect.")
/*    */     public Object[] getSecondaryEffect(Context context, Arguments args) {
/* 43 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { getEffectName(this.tileEntity.func_146006_k()) }));
/*    */     }
/*    */     
/*    */     private String getEffectName(int id) {
/* 47 */       return (id >= 0 && id < Potion.field_76425_a.length && Potion.field_76425_a[id] != null) ? 
/* 48 */         Potion.field_76425_a[id].func_76393_a() : 
/* 49 */         null;
/*    */     } }
/*    */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*    */     public Provider$() {
/* 53 */       MODULE$ = this;
/*    */     }
/*    */     
/*    */     public Class<?> getEnvironment(ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 39
/*    */       //   4: aload_1
/*    */       //   5: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   8: invokestatic func_149634_a : (Lnet/minecraft/item/Item;)Lnet/minecraft/block/Block;
/*    */       //   11: getstatic net/minecraft/init/Blocks.field_150461_bJ : Lnet/minecraft/block/BlockBeacon;
/*    */       //   14: astore_2
/*    */       //   15: dup
/*    */       //   16: ifnonnull -> 27
/*    */       //   19: pop
/*    */       //   20: aload_2
/*    */       //   21: ifnull -> 34
/*    */       //   24: goto -> 39
/*    */       //   27: aload_2
/*    */       //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   31: ifeq -> 39
/*    */       //   34: ldc li/cil/oc/integration/vanilla/DriverBeacon$Environment
/*    */       //   36: goto -> 40
/*    */       //   39: aconst_null
/*    */       //   40: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #55	-> 0
/*    */       //   #56	-> 34
/*    */       //   #57	-> 39
/*    */       //   #55	-> 40
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	41	0	this	Lli/cil/oc/integration/vanilla/DriverBeacon$Provider$;
/*    */       //   0	41	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverBeacon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */