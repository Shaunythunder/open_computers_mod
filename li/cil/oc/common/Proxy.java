/*     */ package li.cil.oc.common;
/*     */ import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
/*     */ import li.cil.oc.OpenComputers$;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.API;
/*     */ import li.cil.oc.api.Machine;
/*     */ import li.cil.oc.common.init.Items$;
/*     */ import li.cil.oc.server.machine.luac.LuaStateFactory$;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.oredict.OreDictionary;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ec\001B\001\003\001-\021Q\001\025:pqfT!a\001\003\002\r\r|W.\\8o\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001A\n\003\0011\001\"!\004\t\016\0039Q\021aD\001\006g\016\fG.Y\005\003#9\021a!\0218z%\0264\007\"B\n\001\t\003!\022A\002\037j]&$h\bF\001\026!\t1\002!D\001\003\021\025A\002\001\"\001\032\003\035\001(/Z%oSR$\"AG\017\021\0055Y\022B\001\017\017\005\021)f.\033;\t\013y9\002\031A\020\002\003\025\004\"\001\t\026\016\003\005R!AI\022\002\013\0254XM\034;\013\005\r!#BA\023'\003\r1W\016\034\006\003O!\nA!\\8eg*\t\021&A\002da^L!aK\021\0033\031kE\n\025:f\023:LG/[1mSj\fG/[8o\013Z,g\016\036\005\006[\001!\tAL\001\005S:LG\017\006\002\033_!)a\004\fa\001aA\021\001%M\005\003e\005\022aCR'M\023:LG/[1mSj\fG/[8o\013Z,g\016\036\005\006i\001!\t!N\001\ta>\034H/\0238jiR\021!D\016\005\006=M\002\ra\016\t\003AaJ!!O\021\0035\031kE\nU8ti&s\027\016^5bY&T\030\r^5p]\0263XM\034;\t\013m\002A\021\001\037\002#Q\024\030PU3hSN$XM\035(vO\036,G/\006\002>\023R)ah\0261c[R\021!d\020\005\b\001j\n\t\021q\001B\003))g/\0333f]\016,G%\r\t\004\005\026;U\"A\"\013\005\021s\021a\002:fM2,7\r^\005\003\r\016\023\001b\0217bgN$\026m\032\t\003\021&c\001\001B\003Ku\t\0071JA\003U\023R,W.\005\002M\037B\021Q\"T\005\003\035:\021qAT8uQ&tw\r\005\002Q+6\t\021K\003\002S'\0061AO]1jiNT!\001\026\002\002\t%$X-\\\005\003-F\023\001\002R3mK\036\fG/\032\005\0061j\002\r!W\001\017]V<w-\032;Ji\026lg*Y7f!\tQVL\004\002\0167&\021ALD\001\007!J,G-\0324\n\005y{&AB*ue&twM\003\002]\035!)\021M\017a\0013\006\tb.^4hKR|%/\0323jGRt\025-\\3\t\013\rT\004\031\0013\002\023%twm\034;Ji\026l\007CA3l\033\0051'B\001+h\025\tA\027.A\005nS:,7M]1gi*\t!.A\002oKRL!\001\0344\003\t%#X-\034\005\006]j\002\r!W\001\021S:<w\016^(sK\022L7\r\036(b[\026DQ\001\035\001\005\nE\f\021C]3hSN$XM]#yG2,8/\033<f)\rQ\"\017\036\005\006g>\004\r!W\001\005]\006lW\rC\003v_\002\007a/A\003ji\026l7\017E\002\016ofL!\001\037\b\003\025q\022X\r]3bi\026$g\b\005\002fu&\0211P\032\002\n\023R,Wn\025;bG.Dq! \001C\002\023%a0\001\007cY>\0347NU3oC6,7/F\001\000!\031\t\t!a\003Z36\021\0211\001\006\005\003\013\t9!A\005j[6,H/\0312mK*\031\021\021\002\b\002\025\r|G\016\\3di&|g.\003\003\002\016\005\r!aA'ba\"9\021\021\003\001!\002\023y\030!\0042m_\016\\'+\0328b[\026\034\b\005\003\005\002\026\001\021\r\021\"\003\003-IG/Z7SK:\fW.Z:\t\017\005e\001\001)A\005\006a\021\016^3n%\026t\027-\\3tA!9\021Q\004\001\005\002\005}\021aD7jgNLgnZ'baBLgnZ:\025\007i\t\t\003C\004\037\0037\001\r!a\t\021\007\001\n)#C\002\002(\005\022qCR'M\033&\0348/\0338h\033\006\004\b/\0338hg\0263XM\034;\t\023\005-\002A1A\005\016\0055\022A\005\"s_.,gNS1wCZ+'o]5p]N,\"!a\f\021\r\005\005\021\021GA\033\023\021\t\031$a\001\003\007M+G\017\005\003\0028\005\005SBAA\035\025\021\tY$!\020\002\t1\fgn\032\006\003\003\tAA[1wC&\031a,!\017\t\021\005\025\003\001)A\007\003_\t1C\021:pW\026t'*\031<b-\026\0248/[8og\002Bq!!\023\001\t\003\tY%A\njg\n\023xn[3o\025\0064\030MV3sg&|g.\006\002\002NA\031Q\"a\024\n\007\005EcBA\004C_>dW-\0318\t\017\005U\003\001\"\001\002X\005I2\r[3dW\032{'O\021:pW\026t'*\031<b-\026\0248/[8o)\005Q\002")
/*     */ public class Proxy {
/*     */   private final Map<String, String> li$cil$oc$common$Proxy$$blockRenames;
/*     */   
/*     */   public void preInit(FMLPreInitializationEvent e) {
/*  30 */     checkForBrokenJavaVersion();
/*     */     
/*  32 */     Settings$.MODULE$.load(e.getSuggestedConfigurationFile());
/*     */     
/*  34 */     OpenComputers$.MODULE$.log().debug("Initializing blocks and items.");
/*     */     
/*  36 */     Blocks$.MODULE$.init();
/*  37 */     Items$.MODULE$.init();
/*     */     
/*  39 */     OpenComputers$.MODULE$.log().debug("Initializing additional OreDict entries.");
/*     */     
/*  41 */     OreDictionary.registerOre("craftingPiston", (Block)Blocks.field_150331_J);
/*  42 */     OreDictionary.registerOre("craftingPiston", (Block)Blocks.field_150320_F);
/*  43 */     OreDictionary.registerOre("torchRedstoneActive", Blocks.field_150429_aA);
/*  44 */     OreDictionary.registerOre("materialEnderPearl", Items.field_151079_bi);
/*  45 */     OreDictionary.registerOre("nuggetGold", Items.field_151074_bl);
/*  46 */     OreDictionary.registerOre("chest", (Block)Blocks.field_150486_ae);
/*  47 */     OreDictionary.registerOre("chest", Blocks.field_150447_bR);
/*     */ 
/*     */     
/*  50 */     OreDictionary.registerOre("oc:wlanCard", Items$.MODULE$.get("wlanCard2").createItemStack(1));
/*     */     
/*  52 */     tryRegisterNugget("nuggetIron", "nuggetIron", Items.field_151042_j, "ingotIron", ClassTag$.MODULE$.apply(IronNugget.class));
/*  53 */     tryRegisterNugget("chipDiamond", "chipDiamond", Items.field_151045_i, "gemDiamond", ClassTag$.MODULE$.apply(DiamondChip.class));
/*     */ 
/*     */ 
/*     */     
/*  57 */     OreDictionary.registerOre("obsidian", Blocks.field_150343_Z);
/*     */ 
/*     */     
/*  60 */     OreDictionary.registerOre("oc:stoneEndstone", Blocks.field_150377_bs);
/*     */     
/*  62 */     OpenComputers$.MODULE$.log().info("Initializing OpenComputers API.");
/*     */     
/*  64 */     CreativeTab.instance = (CreativeTabs)CreativeTab$.MODULE$;
/*  65 */     API.driver = (DriverAPI)Registry$.MODULE$;
/*  66 */     API.fileSystem = (FileSystemAPI)FileSystem$.MODULE$;
/*  67 */     API.items = (ItemAPI)Items$.MODULE$;
/*  68 */     API.machine = (MachineAPI)Machine$.MODULE$;
/*  69 */     API.nanomachines = (NanomachinesAPI)Nanomachines$.MODULE$;
/*  70 */     API.network = (NetworkAPI)Network$.MODULE$;
/*     */     
/*  72 */     API.config = Settings$.MODULE$.get().config();
/*     */     
/*  74 */     if (LuaStateFactory$.MODULE$.isAvailable()) {
/*  75 */       if (LuaStateFactory$.MODULE$.include53()) {
/*  76 */         Machine.add(NativeLua53Architecture.class);
/*     */       }
/*  78 */       if (LuaStateFactory$.MODULE$.include54()) {
/*  79 */         Machine.add(NativeLua54Architecture.class);
/*     */       }
/*  81 */       if (LuaStateFactory$.MODULE$.include52()) {
/*  82 */         Machine.add(NativeLua52Architecture.class);
/*     */       }
/*     */     } 
/*  85 */     if (LuaStateFactory$.MODULE$.includeLuaJ()) {
/*  86 */       Machine.add(LuaJLuaArchitecture.class);
/*     */     }
/*     */     
/*  89 */     Machine.LuaArchitecture = 
/*  90 */       Settings$.MODULE$.get().forceLuaJ() ? LuaJLuaArchitecture.class : 
/*  91 */       (Class)WrapAsScala$.MODULE$.collectionAsScalaIterable(Machine.architectures()).head();
/*     */   }
/*     */   private final Map<String, String> li$cil$oc$common$Proxy$$itemRenames; private final Set<String> BrokenJavaVersions;
/*     */   public void init(FMLInitializationEvent e) {
/*  95 */     OpenComputers$.MODULE$.channel_$eq(NetworkRegistry.INSTANCE.newEventDrivenChannel("OpenComputers"));
/*  96 */     OpenComputers$.MODULE$.channel().register(PacketHandler$.MODULE$);
/*     */     
/*  98 */     Loot$.MODULE$.init();
/*  99 */     Achievement$.MODULE$.init();
/*     */     
/* 101 */     EntityRegistry.registerModEntity(Drone.class, "Drone", 0, OpenComputers$.MODULE$, 80, 1, true);
/*     */     
/* 103 */     OpenComputers$.MODULE$.log().debug("Initializing mod integration.");
/* 104 */     Mods$.MODULE$.init();
/*     */     
/* 106 */     OpenComputers$.MODULE$.log().debug("Initializing recipes.");
/* 107 */     Recipes$.MODULE$.init();
/*     */     
/* 109 */     API.isPowerEnabled = !Settings$.MODULE$.get().ignorePower();
/*     */   }
/*     */ 
/*     */   
/*     */   public void postInit(FMLPostInitializationEvent e) {
/* 114 */     Registry$.MODULE$.locked_$eq(true);
/*     */   }
/*     */   
/*     */   public <TItem extends Delegate> void tryRegisterNugget(String nuggetItemName, String nuggetOredictName, Item ingotItem, String ingotOredictName, ClassTag evidence$1) {
/* 118 */     ItemStack nugget = Items$.MODULE$.get(nuggetItemName).createItemStack(1);
/*     */     
/* 120 */     (new ItemStack[1])[0] = nugget; registerExclusive(nuggetOredictName, (Seq<ItemStack>)Predef$.MODULE$.wrapRefArray((Object[])new ItemStack[1]));
/*     */     
/* 122 */     Option option = Delegator$.MODULE$.subItem(nugget);
/* 123 */     if (option instanceof Some) { Some some = (Some)option; Object subItem = some.x(); Option option1 = evidence$1.unapply(subItem); if (!option1.isEmpty() && option1.get() != null) {
/*     */         
/* 125 */         Recipes$.MODULE$.addSubItem((Delegate)subItem, nuggetItemName, (Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[0]));
/* 126 */         Recipes$.MODULE$.addItem(ingotItem, ingotOredictName, (Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[0]));
/*     */ 
/*     */         
/* 129 */         ((Delegate)subItem).showInItemList_$eq(false); BoxedUnit boxedUnit1 = WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(nuggetOredictName)).exists((Function1)new Proxy$$anonfun$tryRegisterNugget$1(this, nugget)) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return;
/*     */       }  }
/* 131 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   } public final class Proxy$$anonfun$tryRegisterNugget$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack nugget$1; public final boolean apply(ItemStack x$1) {
/*     */       return this.nugget$1.func_77969_a(x$1);
/*     */     } public Proxy$$anonfun$tryRegisterNugget$1(Proxy $outer, ItemStack nugget$1) {} }
/* 136 */   private void registerExclusive(String name, Seq items) { if (OreDictionary.getOres(name).isEmpty())
/* 137 */       items.foreach((Function1)new Proxy$$anonfun$registerExclusive$1(this, name));  } public final class Proxy$$anonfun$registerExclusive$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public Proxy$$anonfun$registerExclusive$1(Proxy $outer, String name$1) {} public final void apply(ItemStack item) {
/* 138 */       OreDictionary.registerOre(this.name$1, item);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, String> li$cil$oc$common$Proxy$$blockRenames() {
/* 148 */     return this.li$cil$oc$common$Proxy$$blockRenames;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, String> li$cil$oc$common$Proxy$$itemRenames() {
/* 153 */     return this.li$cil$oc$common$Proxy$$itemRenames;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void missingMappings(FMLMissingMappingsEvent e) {
/* 163 */     WrapAsScala$.MODULE$.asScalaBuffer(e.get()).foreach((Function1)new Proxy$$anonfun$missingMappings$1(this));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Proxy$$anonfun$missingMappings$1
/*     */     extends AbstractFunction1<FMLMissingMappingsEvent.MissingMapping, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public Proxy$$anonfun$missingMappings$1(Proxy $outer) {}
/*     */ 
/*     */     
/*     */     public final void apply(FMLMissingMappingsEvent.MissingMapping missing) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: getfield type : Lcpw/mods/fml/common/registry/GameRegistry$Type;
/*     */       //   4: getstatic cpw/mods/fml/common/registry/GameRegistry$Type.BLOCK : Lcpw/mods/fml/common/registry/GameRegistry$Type;
/*     */       //   7: astore_2
/*     */       //   8: dup
/*     */       //   9: ifnonnull -> 20
/*     */       //   12: pop
/*     */       //   13: aload_2
/*     */       //   14: ifnull -> 27
/*     */       //   17: goto -> 116
/*     */       //   20: aload_2
/*     */       //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   24: ifeq -> 116
/*     */       //   27: aload_0
/*     */       //   28: getfield $outer : Lli/cil/oc/common/Proxy;
/*     */       //   31: invokevirtual li$cil$oc$common$Proxy$$blockRenames : ()Lscala/collection/immutable/Map;
/*     */       //   34: aload_1
/*     */       //   35: getfield name : Ljava/lang/String;
/*     */       //   38: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   43: astore_3
/*     */       //   44: aload_3
/*     */       //   45: instanceof scala/Some
/*     */       //   48: ifeq -> 104
/*     */       //   51: aload_3
/*     */       //   52: checkcast scala/Some
/*     */       //   55: astore #4
/*     */       //   57: aload #4
/*     */       //   59: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   62: checkcast java/lang/String
/*     */       //   65: astore #5
/*     */       //   67: aload #5
/*     */       //   69: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*     */       //   72: ifeq -> 85
/*     */       //   75: aload_1
/*     */       //   76: invokevirtual ignore : ()V
/*     */       //   79: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   82: goto -> 99
/*     */       //   85: aload_1
/*     */       //   86: ldc 'OpenComputers'
/*     */       //   88: aload #5
/*     */       //   90: invokestatic findBlock : (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/block/Block;
/*     */       //   93: invokevirtual remap : (Lnet/minecraft/block/Block;)V
/*     */       //   96: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   99: astore #6
/*     */       //   101: goto -> 235
/*     */       //   104: aload_1
/*     */       //   105: invokevirtual warn : ()V
/*     */       //   108: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   111: astore #6
/*     */       //   113: goto -> 235
/*     */       //   116: aload_1
/*     */       //   117: getfield type : Lcpw/mods/fml/common/registry/GameRegistry$Type;
/*     */       //   120: getstatic cpw/mods/fml/common/registry/GameRegistry$Type.ITEM : Lcpw/mods/fml/common/registry/GameRegistry$Type;
/*     */       //   123: astore #7
/*     */       //   125: dup
/*     */       //   126: ifnonnull -> 138
/*     */       //   129: pop
/*     */       //   130: aload #7
/*     */       //   132: ifnull -> 146
/*     */       //   135: goto -> 235
/*     */       //   138: aload #7
/*     */       //   140: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   143: ifeq -> 235
/*     */       //   146: aload_0
/*     */       //   147: getfield $outer : Lli/cil/oc/common/Proxy;
/*     */       //   150: invokevirtual li$cil$oc$common$Proxy$$itemRenames : ()Lscala/collection/immutable/Map;
/*     */       //   153: aload_1
/*     */       //   154: getfield name : Ljava/lang/String;
/*     */       //   157: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   162: astore #8
/*     */       //   164: aload #8
/*     */       //   166: instanceof scala/Some
/*     */       //   169: ifeq -> 226
/*     */       //   172: aload #8
/*     */       //   174: checkcast scala/Some
/*     */       //   177: astore #9
/*     */       //   179: aload #9
/*     */       //   181: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   184: checkcast java/lang/String
/*     */       //   187: astore #10
/*     */       //   189: aload #10
/*     */       //   191: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*     */       //   194: ifeq -> 207
/*     */       //   197: aload_1
/*     */       //   198: invokevirtual ignore : ()V
/*     */       //   201: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   204: goto -> 221
/*     */       //   207: aload_1
/*     */       //   208: ldc 'OpenComputers'
/*     */       //   210: aload #10
/*     */       //   212: invokestatic findItem : (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/item/Item;
/*     */       //   215: invokevirtual remap : (Lnet/minecraft/item/Item;)V
/*     */       //   218: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   221: astore #11
/*     */       //   223: goto -> 235
/*     */       //   226: aload_1
/*     */       //   227: invokevirtual warn : ()V
/*     */       //   230: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   233: astore #11
/*     */       //   235: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #164	-> 0
/*     */       //   #165	-> 27
/*     */       //   #166	-> 44
/*     */       //   #167	-> 67
/*     */       //   #168	-> 85
/*     */       //   #167	-> 99
/*     */       //   #169	-> 104
/*     */       //   #172	-> 116
/*     */       //   #173	-> 146
/*     */       //   #174	-> 164
/*     */       //   #175	-> 189
/*     */       //   #176	-> 207
/*     */       //   #175	-> 221
/*     */       //   #177	-> 226
/*     */       //   #164	-> 235
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	236	0	this	Lli/cil/oc/common/Proxy$$anonfun$missingMappings$1;
/*     */       //   0	236	1	missing	Lcpw/mods/fml/common/event/FMLMissingMappingsEvent$MissingMapping;
/*     */       //   67	169	5	name	Ljava/lang/String;
/*     */       //   189	47	10	name	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private final Set<String> BrokenJavaVersions() {
/* 185 */     return this.BrokenJavaVersions;
/*     */   }
/*     */   public boolean isBrokenJavaVersion() {
/* 188 */     String javaVersion = (new StringBuilder()).append(System.getProperty("java.version")).append(", ").append(System.getProperty("java.vendor")).toString();
/* 189 */     return BrokenJavaVersions().contains(javaVersion);
/*     */   }
/*     */   public void checkForBrokenJavaVersion() {
/* 192 */     if (isBrokenJavaVersion()) {
/* 193 */       FMLLog.bigWarning("You're using a broken Java version! Please update now, or remove OpenComputers. DO NOT REPORT THIS! UPDATE YOUR JAVA!", new Object[0]);
/* 194 */       throw new Exception("You're using a broken Java version! Please update now, or remove OpenComputers. DO NOT REPORT THIS! UPDATE YOUR JAVA!");
/*     */     } 
/*     */   }
/*     */   
/*     */   public Proxy() {
/*     */     (new scala.Tuple2[1])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:serverRack"), "rack");
/*     */     this.li$cil$oc$common$Proxy$$blockRenames = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[1]));
/*     */     (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:microcontrollerCase"), "microcontrollerCase1");
/*     */     (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:droneCase"), "droneCase1");
/*     */     (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:tabletCase"), "tabletCase1");
/*     */     (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:dataCard"), "dataCard1");
/*     */     (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:serverRack"), "rack");
/*     */     (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OpenComputers:wlanCard"), "wlanCard2");
/*     */     this.li$cil$oc$common$Proxy$$itemRenames = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6]));
/*     */     (new String[1])[0] = "1.6.0_65, Apple Inc.";
/*     */     this.BrokenJavaVersions = (Set<String>)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */