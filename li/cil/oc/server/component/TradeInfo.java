/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.IMerchant;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.village.MerchantRecipe;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.DimensionManager;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.ref.WeakReference;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-c\001B\001\003\0015\021\021\002\026:bI\026LeNZ8\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ty!#D\001\021\025\005\t\022!B:dC2\f\027BA\n\021\005\031\te.\037*fM\"AQ\003\001BA\002\023\005a#\001\003i_N$X#A\f\021\007=A\"$\003\002\032!\t1q\n\035;j_:\004\"a\007\021\016\003qQ!!\b\020\002\0179,Go^8sW*\021qDB\001\004CBL\027BA\021\035\005=)eN^5s_:lWM\034;I_N$\b\002C\022\001\005\003\007I\021\001\023\002\021!|7\017^0%KF$\"!\n\025\021\005=1\023BA\024\021\005\021)f.\033;\t\017%\022\023\021!a\001/\005\031\001\020J\031\t\021-\002!\021!Q!\n]\tQ\001[8ti\002B\001\"\f\001\003\002\004%\tAL\001\t[\026\0248\r[1oiV\tq\006E\0021gUj\021!\r\006\003eA\t1A]3g\023\t!\024GA\007XK\006\\'+\0324fe\026t7-\032\t\003muj\021a\016\006\003qe\na!\0328uSRL(B\001\036<\003%i\027N\\3de\0064GOC\001=\003\rqW\r^\005\003}]\022\021\"S'fe\016D\027M\034;\t\021\001\003!\0211A\005\002\005\013A\"\\3sG\"\fg\016^0%KF$\"!\n\"\t\017%z\024\021!a\001_!AA\t\001B\001B\003&q&A\005nKJ\034\007.\0318uA!Aa\t\001BA\002\023\005q)\001\005sK\016L\007/Z%E+\005A\005CA\bJ\023\tQ\005CA\002J]RD\001\002\024\001\003\002\004%\t!T\001\re\026\034\027\016]3J\t~#S-\035\013\003K9Cq!K&\002\002\003\007\001\n\003\005Q\001\t\005\t\025)\003I\003%\021XmY5qK&#\005\005\003\005S\001\t\005\r\021\"\001H\003)iWM]2iC:$\030\n\022\005\t)\002\021\t\031!C\001+\006qQ.\032:dQ\006tG/\023#`I\025\fHCA\023W\021\035I3+!AA\002!C\001\002\027\001\003\002\003\006K\001S\001\f[\026\0248\r[1oi&#\005\005C\003[\001\021\0051,\001\004=S:LGO\020\013\0069z{\006-\031\t\003;\002i\021A\001\005\006+e\003\ra\006\005\006[e\003\ra\f\005\006\rf\003\r\001\023\005\006%f\003\r\001\023\005\0065\002!\ta\031\013\0029\")!\f\001C\001KR)ALZ4iS\")Q\003\032a\0015!)Q\006\032a\001k!)a\t\032a\001\021\")!\013\032a\001\021\")1\016\001C\001Y\0061!/Z2ja\026,\022!\034\t\004\037aq\007CA8s\033\005\001(BA9:\003\0351\030\016\0347bO\026L!a\0359\003\0355+'o\0315b]R\024VmY5qK\")Q\017\001C\001m\006I\021N\034<f]R|'/_\013\002oB\031q\002\007=\021\005e\\X\"\001>\013\005UL\024B\001?{\005)I\025J\034<f]R|'/\037\005\006}\002!\ta`\001\005Y>\fG\rF\002&\003\003Aq!a\001~\001\004\t)!A\002oER\004B!a\002\002\f5\021\021\021\002\006\004\003\007I\024\002BA\007\003\023\021aB\024\"U)\006<7i\\7q_VtG\rC\004\002\022\001!\t!a\005\002\tM\fg/\032\013\004K\005U\001\002CA\002\003\037\001\r!!\002\t\017\005e\001\001\"\003\002\034\005QAn\\1e\013:$\030\016^=\025\r\005u\021QEA\024!\021y\001$a\b\021\007Y\n\t#C\002\002$]\022a!\0228uSRL\b\002CA\002\003/\001\r!!\002\t\021\005%\022q\003a\001\003W\tA!^;jIB!\021QFA\034\033\t\tyC\003\003\0022\005M\022\001B;uS2T!!!\016\002\t)\fg/Y\005\005\003s\tyC\001\003V+&#\005bBA\037\001\021%\021qH\001\017Y>\fG\rS8ti\026sG/\033;z)\r9\022\021\t\005\t\003\007\tY\0041\001\002\006!9\021Q\t\001\005\n\005\035\023A\0057pC\022Dun\035;US2,WI\034;jif$2aFA%\021!\t\031!a\021A\002\005\025\001")
/*     */ public class TradeInfo
/*     */ {
/*     */   private Option<EnvironmentHost> host;
/*     */   private WeakReference<IMerchant> merchant;
/*     */   private int recipeID;
/*     */   private int merchantID;
/*     */   
/*     */   public Option<EnvironmentHost> host() {
/* 134 */     return this.host; } public void host_$eq(Option<EnvironmentHost> x$1) { this.host = x$1; } public WeakReference<IMerchant> merchant() { return this.merchant; } public void merchant_$eq(WeakReference<IMerchant> x$1) { this.merchant = x$1; } public int recipeID() { return this.recipeID; } public void recipeID_$eq(int x$1) { this.recipeID = x$1; } public int merchantID() { return this.merchantID; } public void merchantID_$eq(int x$1) { this.merchantID = x$1; } public TradeInfo(Option<EnvironmentHost> host, WeakReference<IMerchant> merchant, int recipeID, int merchantID) {} public TradeInfo() {
/* 135 */     this((Option<EnvironmentHost>)None$.MODULE$, new WeakReference(null), -1, -1);
/*     */   }
/*     */   public TradeInfo(EnvironmentHost host, IMerchant merchant, int recipeID, int merchantID) {
/* 138 */     this(Option$.MODULE$.apply(host), new WeakReference(merchant), recipeID, merchantID);
/*     */   }
/* 140 */   public Option<MerchantRecipe> recipe() { return merchant().get().map((Function1)new TradeInfo$$anonfun$recipe$1(this)); } public final class TradeInfo$$anonfun$recipe$1 extends AbstractFunction1<IMerchant, MerchantRecipe> implements Serializable { public final MerchantRecipe apply(IMerchant x$7) { return (MerchantRecipe)x$7.func_70934_b(null).get(this.$outer.recipeID()); }
/*     */      public static final long serialVersionUID = 0L; public TradeInfo$$anonfun$recipe$1(TradeInfo $outer) {} } public Option<IInventory> inventory() {
/* 142 */     Option<EnvironmentHost> option = host();
/* 143 */     if (option instanceof Some) { Some some = (Some)option; EnvironmentHost agent = (EnvironmentHost)some.x(); if (agent instanceof Agent) { Agent agent1 = (Agent)agent; return Option$.MODULE$.apply(agent1.mainInventory()); }  }
/* 144 */      return (Option<IInventory>)None$.MODULE$;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'hostIsEntity'
/*     */     //   3: invokevirtual func_74767_n : (Ljava/lang/String;)Z
/*     */     //   6: istore_2
/*     */     //   7: aload_0
/*     */     //   8: iload_2
/*     */     //   9: ifeq -> 20
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: invokespecial loadHostEntity : (Lnet/minecraft/nbt/NBTTagCompound;)Lscala/Option;
/*     */     //   17: goto -> 25
/*     */     //   20: aload_0
/*     */     //   21: aload_1
/*     */     //   22: invokespecial loadHostTileEntity : (Lnet/minecraft/nbt/NBTTagCompound;)Lscala/Option;
/*     */     //   25: invokevirtual host_$eq : (Lscala/Option;)V
/*     */     //   28: aload_0
/*     */     //   29: new scala/ref/WeakReference
/*     */     //   32: dup
/*     */     //   33: aload_0
/*     */     //   34: aload_1
/*     */     //   35: new java/util/UUID
/*     */     //   38: dup
/*     */     //   39: aload_1
/*     */     //   40: ldc 'merchantUUIDMost'
/*     */     //   42: invokevirtual func_74763_f : (Ljava/lang/String;)J
/*     */     //   45: aload_1
/*     */     //   46: ldc 'merchantUUIDLeast'
/*     */     //   48: invokevirtual func_74763_f : (Ljava/lang/String;)J
/*     */     //   51: invokespecial <init> : (JJ)V
/*     */     //   54: invokespecial loadEntity : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/util/UUID;)Lscala/Option;
/*     */     //   57: astore_3
/*     */     //   58: aload_3
/*     */     //   59: instanceof scala/Some
/*     */     //   62: ifeq -> 103
/*     */     //   65: aload_3
/*     */     //   66: checkcast scala/Some
/*     */     //   69: astore #4
/*     */     //   71: aload #4
/*     */     //   73: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   76: checkcast net/minecraft/entity/Entity
/*     */     //   79: astore #5
/*     */     //   81: aload #5
/*     */     //   83: instanceof net/minecraft/entity/IMerchant
/*     */     //   86: ifeq -> 103
/*     */     //   89: aload #5
/*     */     //   91: astore #6
/*     */     //   93: aload #6
/*     */     //   95: checkcast net/minecraft/entity/IMerchant
/*     */     //   98: astore #7
/*     */     //   100: goto -> 106
/*     */     //   103: aconst_null
/*     */     //   104: astore #7
/*     */     //   106: aload #7
/*     */     //   108: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   111: invokevirtual merchant_$eq : (Lscala/ref/WeakReference;)V
/*     */     //   114: aload_0
/*     */     //   115: aload_1
/*     */     //   116: ldc 'recipeID'
/*     */     //   118: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */     //   121: invokevirtual recipeID_$eq : (I)V
/*     */     //   124: aload_0
/*     */     //   125: aload_1
/*     */     //   126: ldc 'merchantID'
/*     */     //   128: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   131: ifeq -> 143
/*     */     //   134: aload_1
/*     */     //   135: ldc 'merchantID'
/*     */     //   137: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */     //   140: goto -> 144
/*     */     //   143: iconst_m1
/*     */     //   144: invokevirtual merchantID_$eq : (I)V
/*     */     //   147: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 0
/*     */     //   #150	-> 7
/*     */     //   #151	-> 28
/*     */     //   #152	-> 58
/*     */     //   #153	-> 103
/*     */     //   #151	-> 106
/*     */     //   #155	-> 114
/*     */     //   #156	-> 124
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	148	0	this	Lli/cil/oc/server/component/TradeInfo;
/*     */     //   0	148	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   7	140	2	isEntity	Z
/*     */     //   81	67	5	merchant	Lnet/minecraft/entity/Entity;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_2
/*     */     //   2: aconst_null
/*     */     //   3: astore_3
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual host : ()Lscala/Option;
/*     */     //   8: astore #4
/*     */     //   10: aload #4
/*     */     //   12: instanceof scala/Some
/*     */     //   15: ifeq -> 115
/*     */     //   18: iconst_1
/*     */     //   19: istore_2
/*     */     //   20: aload #4
/*     */     //   22: checkcast scala/Some
/*     */     //   25: astore_3
/*     */     //   26: aload_3
/*     */     //   27: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   30: checkcast li/cil/oc/api/network/EnvironmentHost
/*     */     //   33: astore #5
/*     */     //   35: aload #5
/*     */     //   37: instanceof net/minecraft/entity/Entity
/*     */     //   40: ifeq -> 115
/*     */     //   43: aload #5
/*     */     //   45: checkcast net/minecraft/entity/Entity
/*     */     //   48: astore #6
/*     */     //   50: aload_1
/*     */     //   51: ldc 'hostIsEntity'
/*     */     //   53: iconst_1
/*     */     //   54: invokevirtual func_74757_a : (Ljava/lang/String;Z)V
/*     */     //   57: aload_1
/*     */     //   58: ldc 'dimensionID'
/*     */     //   60: aload #6
/*     */     //   62: checkcast li/cil/oc/api/network/EnvironmentHost
/*     */     //   65: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   70: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
/*     */     //   73: getfield field_76574_g : I
/*     */     //   76: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   79: aload_1
/*     */     //   80: ldc 'hostUUIDLeast'
/*     */     //   82: aload #6
/*     */     //   84: invokevirtual getPersistentID : ()Ljava/util/UUID;
/*     */     //   87: invokevirtual getLeastSignificantBits : ()J
/*     */     //   90: invokevirtual func_74772_a : (Ljava/lang/String;J)V
/*     */     //   93: aload_1
/*     */     //   94: ldc 'hostUUIDMost'
/*     */     //   96: aload #6
/*     */     //   98: invokevirtual getPersistentID : ()Ljava/util/UUID;
/*     */     //   101: invokevirtual getMostSignificantBits : ()J
/*     */     //   104: invokevirtual func_74772_a : (Ljava/lang/String;J)V
/*     */     //   107: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   110: astore #7
/*     */     //   112: goto -> 213
/*     */     //   115: iload_2
/*     */     //   116: ifeq -> 208
/*     */     //   119: aload_3
/*     */     //   120: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   123: checkcast li/cil/oc/api/network/EnvironmentHost
/*     */     //   126: astore #8
/*     */     //   128: aload #8
/*     */     //   130: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   133: ifeq -> 208
/*     */     //   136: aload #8
/*     */     //   138: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   141: astore #9
/*     */     //   143: aload_1
/*     */     //   144: ldc 'hostIsEntity'
/*     */     //   146: iconst_0
/*     */     //   147: invokevirtual func_74757_a : (Ljava/lang/String;Z)V
/*     */     //   150: aload_1
/*     */     //   151: ldc 'dimensionID'
/*     */     //   153: aload #9
/*     */     //   155: invokevirtual func_145831_w : ()Lnet/minecraft/world/World;
/*     */     //   158: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
/*     */     //   161: getfield field_76574_g : I
/*     */     //   164: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   167: aload_1
/*     */     //   168: ldc 'hostX'
/*     */     //   170: aload #9
/*     */     //   172: getfield field_145851_c : I
/*     */     //   175: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   178: aload_1
/*     */     //   179: ldc 'hostY'
/*     */     //   181: aload #9
/*     */     //   183: getfield field_145848_d : I
/*     */     //   186: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   189: aload_1
/*     */     //   190: ldc 'hostZ'
/*     */     //   192: aload #9
/*     */     //   194: getfield field_145849_e : I
/*     */     //   197: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   200: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   203: astore #7
/*     */     //   205: goto -> 213
/*     */     //   208: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   211: astore #7
/*     */     //   213: aload_0
/*     */     //   214: invokevirtual merchant : ()Lscala/ref/WeakReference;
/*     */     //   217: invokevirtual get : ()Lscala/Option;
/*     */     //   220: astore #10
/*     */     //   222: aload #10
/*     */     //   224: instanceof scala/Some
/*     */     //   227: ifeq -> 298
/*     */     //   230: aload #10
/*     */     //   232: checkcast scala/Some
/*     */     //   235: astore #11
/*     */     //   237: aload #11
/*     */     //   239: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   242: checkcast net/minecraft/entity/IMerchant
/*     */     //   245: astore #12
/*     */     //   247: aload #12
/*     */     //   249: instanceof net/minecraft/entity/Entity
/*     */     //   252: ifeq -> 298
/*     */     //   255: aload #12
/*     */     //   257: checkcast net/minecraft/entity/Entity
/*     */     //   260: astore #13
/*     */     //   262: aload_1
/*     */     //   263: ldc 'merchantUUIDLeast'
/*     */     //   265: aload #13
/*     */     //   267: invokevirtual getPersistentID : ()Ljava/util/UUID;
/*     */     //   270: invokevirtual getLeastSignificantBits : ()J
/*     */     //   273: invokevirtual func_74772_a : (Ljava/lang/String;J)V
/*     */     //   276: aload_1
/*     */     //   277: ldc 'merchantUUIDMost'
/*     */     //   279: aload #13
/*     */     //   281: invokevirtual getPersistentID : ()Ljava/util/UUID;
/*     */     //   284: invokevirtual getMostSignificantBits : ()J
/*     */     //   287: invokevirtual func_74772_a : (Ljava/lang/String;J)V
/*     */     //   290: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   293: astore #14
/*     */     //   295: goto -> 303
/*     */     //   298: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   301: astore #14
/*     */     //   303: aload_1
/*     */     //   304: ldc 'recipeID'
/*     */     //   306: aload_0
/*     */     //   307: invokevirtual recipeID : ()I
/*     */     //   310: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   313: aload_1
/*     */     //   314: ldc 'merchantID'
/*     */     //   316: aload_0
/*     */     //   317: invokevirtual merchantID : ()I
/*     */     //   320: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   323: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #161	-> 0
/*     */     //   #160	-> 4
/*     */     //   #161	-> 10
/*     */     //   #162	-> 50
/*     */     //   #163	-> 57
/*     */     //   #164	-> 79
/*     */     //   #165	-> 93
/*     */     //   #161	-> 110
/*     */     //   #160	-> 115
/*     */     //   #166	-> 119
/*     */     //   #167	-> 143
/*     */     //   #168	-> 150
/*     */     //   #169	-> 167
/*     */     //   #170	-> 178
/*     */     //   #171	-> 189
/*     */     //   #166	-> 203
/*     */     //   #172	-> 208
/*     */     //   #174	-> 213
/*     */     //   #175	-> 222
/*     */     //   #176	-> 262
/*     */     //   #177	-> 276
/*     */     //   #175	-> 293
/*     */     //   #178	-> 298
/*     */     //   #180	-> 303
/*     */     //   #181	-> 313
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	324	0	this	Lli/cil/oc/server/component/TradeInfo;
/*     */     //   0	324	1	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   35	289	5	entity	Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   128	196	8	tileEntity	Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   247	77	12	entity	Lnet/minecraft/entity/IMerchant;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class TradeInfo$$anonfun$loadEntity$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final UUID uuid$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(Object x0$1) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: instanceof net/minecraft/entity/Entity
/*     */       //   6: ifeq -> 51
/*     */       //   9: aload_2
/*     */       //   10: checkcast net/minecraft/entity/Entity
/*     */       //   13: astore_3
/*     */       //   14: aload_3
/*     */       //   15: invokevirtual getPersistentID : ()Ljava/util/UUID;
/*     */       //   18: aload_0
/*     */       //   19: getfield uuid$1 : Ljava/util/UUID;
/*     */       //   22: astore #4
/*     */       //   24: dup
/*     */       //   25: ifnonnull -> 37
/*     */       //   28: pop
/*     */       //   29: aload #4
/*     */       //   31: ifnull -> 45
/*     */       //   34: goto -> 51
/*     */       //   37: aload #4
/*     */       //   39: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   42: ifeq -> 51
/*     */       //   45: iconst_1
/*     */       //   46: istore #5
/*     */       //   48: goto -> 54
/*     */       //   51: iconst_0
/*     */       //   52: istore #5
/*     */       //   54: iload #5
/*     */       //   56: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #188	-> 0
/*     */       //   #189	-> 2
/*     */       //   #190	-> 51
/*     */       //   #188	-> 54
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	57	0	this	Lli/cil/oc/server/component/TradeInfo$$anonfun$loadEntity$1;
/*     */       //   0	57	1	x0$1	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public TradeInfo$$anonfun$loadEntity$1(TradeInfo $outer, UUID uuid$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Option<Entity> loadEntity(NBTTagCompound nbt, UUID uuid)
/*     */   {
/* 185 */     int dimension = nbt.func_74762_e("dimensionID");
/* 186 */     World world = (DimensionManager.getProvider(dimension)).field_76579_a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     return WrapAsScala$.MODULE$.asScalaBuffer(world.field_72996_f).find((Function1)new TradeInfo$$anonfun$loadEntity$1(this, uuid)).map((Function1)new TradeInfo$$anonfun$loadEntity$2(this)); } public final class TradeInfo$$anonfun$loadEntity$2 extends AbstractFunction1<Object, Entity> implements Serializable { public static final long serialVersionUID = 0L; public final Entity apply(Object x$8) { return (Entity)x$8; }
/*     */     
/*     */     public TradeInfo$$anonfun$loadEntity$2(TradeInfo $outer) {} }
/*     */   private Option<EnvironmentHost> loadHostEntity(NBTTagCompound nbt) {
/* 195 */     Option<Entity> option = loadEntity(nbt, new UUID(nbt.func_74763_f("hostUUIDMost"), nbt.func_74763_f("hostUUIDLeast")));
/* 196 */     if (option instanceof Some) { Some some = (Some)option; Entity entity = (Entity)some.x(); if (entity instanceof Agent) { Entity entity1 = entity; return Option$.MODULE$.apply(entity1); }  }
/* 197 */      return (Option<EnvironmentHost>)None$.MODULE$;
/*     */   }
/*     */ 
/*     */   
/*     */   private Option<EnvironmentHost> loadHostTileEntity(NBTTagCompound nbt) {
/* 202 */     int dimension = nbt.func_74762_e("dimensionID");
/* 203 */     World world = (DimensionManager.getProvider(dimension)).field_76579_a;
/*     */     
/* 205 */     int x = nbt.func_74762_e("hostX");
/* 206 */     int y = nbt.func_74762_e("hostY");
/* 207 */     int z = nbt.func_74762_e("hostZ");
/*     */     
/* 209 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 210 */     if (tileEntity instanceof RobotProxy) { RobotProxy robotProxy = (RobotProxy)tileEntity; Option option = Option$.MODULE$.apply(robotProxy.robot()); }
/* 211 */     else if (tileEntity instanceof Agent) { TileEntity tileEntity1 = tileEntity; Option option = Option$.MODULE$.apply(tileEntity1); }
/* 212 */     else { if (tileEntity == null) return (Option<EnvironmentHost>)None$.MODULE$; 
/*     */       throw new MatchError(tileEntity); }
/*     */     
/*     */     return (Option<EnvironmentHost>)SYNTHETIC_LOCAL_VARIABLE_9;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\TradeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */