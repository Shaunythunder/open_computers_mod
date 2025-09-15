/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035s!B\001\003\021\003i\021\001\006#sSZ,'O\0217pG.Le\016^3sM\006\034WM\003\002\004\t\0051\021\r\0359f]\036T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"\001\006#sSZ,'O\0217pG.Le\016^3sM\006\034Wm\005\002\020%A\0211\003G\007\002))\021QCF\001\007aJ,g-\0312\013\005]1\021aA1qS&\021\021\004\006\002\026\tJLg/\032:TS\022,G\rV5mK\026sG/\033;z\021\025Yr\002\"\001\035\003\031a\024N\\5u}Q\tQ\002C\003\037\037\021\005q$\001\nhKR$\026\016\\3F]RLG/_\"mCN\034H#\001\0211\005\005j\003c\001\022)W9\0211EJ\007\002I)\tQ%A\003tG\006d\027-\003\002(I\0051\001K]3eK\032L!!\013\026\003\013\rc\027m]:\013\005\035\"\003C\001\027.\031\001!\021BL\017\002\002\003\005)\021A\030\003\007}#\023'\005\0021gA\0211%M\005\003e\021\022qAT8uQ&tw\r\005\002$i%\021Q\007\n\002\004\003:L\b\"B\034\020\t\003A\024!E2sK\006$X-\0228wSJ|g.\\3oiR1\021h\020&P#N\003\"AO\037\016\003mR!\001\020\f\002\0179,Go^8sW&\021ah\017\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017C\003Am\001\007\021)A\003x_JdG\r\005\002C\0216\t1I\003\002A\t*\021QIR\001\n[&tWm\031:bMRT\021aR\001\004]\026$\030BA%D\005\0259vN\0357e\021\025Ye\0071\001M\003\005A\bCA\022N\023\tqEEA\002J]RDQ\001\025\034A\0021\013\021!\037\005\006%Z\002\r\001T\001\002u\")AK\016a\001+\006!1/\0333f!\t1V,D\001X\025\tA\026,\001\003vi&d'B\001.\\\003\031\031w.\\7p]*\021ALR\001\017[&tWm\031:bMR4wN]4f\023\tqvK\001\bG_J<W\rR5sK\016$\030n\0348\007\t\001|!!\031\002\f\013:4\030N]8o[\026tGo\005\003`E>,\bcA2eM6\tA!\003\002f\t\taR*\0318bO\026$G+\0337f\013:$\030\016^=F]ZL'o\0348nK:$\bCA4n\033\005A'BA5k\003\021i\027n]2\013\005-d\027\001\002;jY\026T\021aA\005\003]\"\024Q\002V5mK&sG/\032:gC\016,\007C\0019t\033\005\t(B\001:\027\003\031!'/\033<fe&\021A/\035\002\013\035\006lW\r\032\"m_\016\\\007c\001\bwM&\021qO\001\002\017\035\026$xo\034:l\007>tGO]8m\021!YwL!b\001\n\003IX#\0014\t\021m|&\021!Q\001\n\031\fQ\001^5mK\002BQaG0\005\002u$2A`A\001!\tyx,D\001\020\021\025YG\0201\001g\021\035\t)a\030C!\003\017\tQ\002\035:fM\026\024(/\0323OC6,GCAA\005!\021\tY!!\006\016\005\0055!\002BA\b\003#\tA\001\\1oO*\021\0211C\001\005U\0064\030-\003\003\002\030\0055!AB*ue&tw\rC\004\002\034}#\t%!\b\002\021A\024\030n\034:jif$\022\001\024\005\b\003CyF\021AA\022\003e9W\r^%oi\026\024h-Y2f\007>tg-[4ve\006$\030n\0348\025\r\005\025\022\021GA!!\025\031\023qEA\026\023\r\tI\003\n\002\006\003J\024\030-\037\t\004G\0055\022bAA\030I\t1\021I\\=SK\032D\001\"a\r\002 \001\007\021QG\001\bG>tG/\032=u!\021\t9$!\020\016\005\005e\"bAA\036-\0059Q.Y2iS:,\027\002BA \003s\021qaQ8oi\026DH\017\003\005\002D\005}\001\031AA#\003\021\t'oZ:\021\t\005]\022qI\005\005\003\023\nIDA\005Be\036,X.\0328ug\"B\021qDA'\003'\n)\006\005\003\0028\005=\023\002BA)\003s\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA,\003!3WO\\2uS>t\007fW:m_RTd.^7cKJl\026F\017;bE2,\007%L\027!\017\026$\b\005\0365fA\r|gNZ5hkJ\fG/[8oA=4\007\005\0365fA%tG/\032:gC\016,g\006C\004\002\\}#\t!!\030\0023M,G/\0238uKJ4\027mY3D_:4\027nZ;sCRLwN\034\013\007\003K\ty&!\031\t\021\005M\022\021\fa\001\003kA\001\"a\021\002Z\001\007\021Q\t\025\t\0033\ni%a\025\002f\005\022\021qM\001mMVt7\r^5p]\"Z6\017\\8uu9,XNY3s;nc\003\005Z1uC\n\f7/\032\036bI\022\024Xm]:-A\025tGO]=;]Vl'-\032:\\Y\001\032\030N_3;]Vl'-\032:^;&R$m\\8mK\006t\007%L\027!\007>tg-[4ve\026\004C\017[3!S:$XM\0354bG\026t\003bBA6?\022%\021QN\001\tO\026$8\013^1dWR!\021qNA>!\021\t\t(a\036\016\005\005M$bAA;\t\006!\021\016^3n\023\021\tI(a\035\003\023%#X-\\*uC\016\\\007\002CA\"\003S\002\r!!\022\t\017\005}t\f\"\001\002\002\006\031r-\032;J]R,'OZ1dKB\013G\017^3s]R1\021QEAB\003\013C\001\"a\r\002~\001\007\021Q\007\005\t\003\007\ni\b1\001\002F!B\021QPA'\003'\nI)\t\002\002\f\006Ae-\0368di&|g\016K.tY>$(H\\;nE\026\024X,\013\036uC\ndW\rI\027.A\035+G\017\t;iK\002:\027N^3oAA\fG\017^3s]\002Jg\016\t;iK\002Jg\016^3sM\006\034WM\f\005\b\003\037{F\021AAI\003a\031X\r^%oi\026\024h-Y2f!\006$H/\032:o\023:\004X\017\036\013\007\003K\t\031*!&\t\021\005M\022Q\022a\001\003kA\001\"a\021\002\016\002\007\021Q\t\025\t\003\033\013i%a\025\002\032\006\022\0211T\001\002\f\031,hn\031;j_:D3\017\\8uu9,XNY3sY\001\"\027\r^1cCN,'(\0313ee\026\0348\017\f\021f]R\024\030P\0178v[\n,'\017\f\021tSj,'H\\;nE\026\024H\006I5oI\026D(H\\;nE\026\024\030F\0172p_2,\027M\034\021.[\001\032V\r\036\021uQ\026\004\003/\031;uKJt\007%\0338qkR\004\023\r\036\021uQ\026\004s-\033<f]\002Jg\016Z3y]!9\021qT0\005\002\005\005\026!G:fi&sG/\032:gC\016,\007+\031;uKJtw*\036;qkR$b!!\n\002$\006\025\006\002CA\032\003;\003\r!!\016\t\021\005\r\023Q\024a\001\003\013B\003\"!(\002N\005M\023\021V\021\003\003W\013\021Q\0024v]\016$\030n\0348)g2|GO\0178v[\n,'\017\f\021eCR\f'-Y:fu\005$GM]3tg2\002SM\034;ssjrW/\0342fe2\0023/\033>fu9,XNY3sY\001Jg\016Z3yu9,XNY3sSi\022wn\0347fC:\004S&\f\021TKR\004C\017[3!a\006$H/\032:oA=,H\017];uA\005$\b\005\0365fA\035Lg/\0328!S:$W\r\037\030\t\017\005=v\f\"\001\0022\006Q2\017^8sK&sG/\032:gC\016,\007+\031;uKJt\027J\0349viR1\021QEAZ\003kC\001\"a\r\002.\002\007\021Q\007\005\t\003\007\ni\0131\001\002F!B\021QVA'\003'\nI,\t\002\002<\006\tIBZ;oGRLwN\034\025tY>$(H\\;nE\026\024H\006I5oI\026D(H\\;nE\026\024H\006\t3bi\006\024\027m]3;C\022$'/Z:tY\001*g\016\036:zu9,XNY3sSi\022wn\0347fC:\004S&\f\021Ti>\024X\r\t9biR,'O\034\021j]B,H\017I1uAQDW\rI4jm\026t\007%\0338eKb\004Co\034\021uQ\026\004C-\031;bE\006\034X\rI3oiJLh\006C\004\002@~#\t!!1\0027M$xN]3J]R,'OZ1dKB\013G\017^3s]>+H\017];u)\031\t)#a1\002F\"A\0211GA_\001\004\t)\004\003\005\002D\005u\006\031AA#Q!\ti,!\024\002T\005%\027EAAf\003\005ma-\0368di&|g\016K:m_RTd.^7cKJd\003%\0338eKbTd.^7cKJd\003\005Z1uC\n\f7/\032\036bI\022\024Xm]:-A\025tGO]=;]Vl'-\032:*u\t|w\016\\3b]\002jS\006I*u_J,\007\005]1ui\026\024h\016I8viB,H\017I1uAQDW\rI4jm\026t\007%\0338eKb\004Co\034\021uQ\026\004C-\031;bE\006\034X\rI3oiJLh\006C\004\002P~#\t!!5\0025\rdW-\031:J]R,'OZ1dKB\013G\017^3s]&s\007/\036;\025\r\005\025\0221[Ak\021!\t\031$!4A\002\005U\002\002CA\"\003\033\004\r!!\022)\021\0055\027QJA*\0033\f#!a7\002-\032,hn\031;j_:D3\017\\8uu9,XNY3sY\001Jg\016Z3yu9,XNY3sSi\022wn\0347fC:\004S&\f\021DY\026\f'\017\t9biR,'O\034\021j]B,H\017I1uAQDW\rI4jm\026t\007%\0338eKbt\003bBAp?\022\005\021\021]\001\034G2,\027M]%oi\026\024h-Y2f!\006$H/\032:o\037V$\b/\036;\025\r\005\025\0221]As\021!\t\031$!8A\002\005U\002\002CA\"\003;\004\r!!\022)\021\005u\027QJA*\003S\f#!a;\002/\032,hn\031;j_:D3\017\\8uu9,XNY3sY\001Jg\016Z3yu9,XNY3sSi\022wn\0347fC:\004S&\f\021DY\026\f'\017\t9biR,'O\034\021pkR\004X\017\036\021bi\002\"\b.\032\021hSZ,g\016I5oI\026Dh\006C\004\002p~#I!!=\002+M$xN]3J]R,'OZ1dKB\013G\017^3s]RA\021QEAz\003k\f9\020\003\005\0024\0055\b\031AA\033\021!\t\031%!<A\002\005\025\003\002CA}\003[\004\r!a?\002\007Q\fw\rE\002#\003{L1!a\006+\021\035\021\ta\030C\005\005\007\tQc\0317fCJLe\016^3sM\006\034W\rU1ui\026\024h\016\006\005\002&\t\025!q\001B\005\021!\t\031$a@A\002\005U\002\002CA\"\003\004\r!!\022\t\021\005e\030q a\001\003wDqA!\004`\t\023\021y!\001\btKR\004\026\r\036;fe:\034Fn\034;\025\021\005\025\"\021\003B\n\005+A\001\"a\r\003\f\001\007\021Q\007\005\t\003\007\022Y\0011\001\002F!A\021\021 B\006\001\004\tYpB\004\003\032=A\tAa\007\002\021A\023xN^5eKJ\0042a B\017\r\035\021yb\004E\001\005C\021\001\002\025:pm&$WM]\n\007\005;\021\031C!\013\021\t\005-!QE\005\005\005O\tiA\001\004PE*,7\r\036\t\004a\n-\022b\001B\027c\n\031RI\034<je>tW.\0328u!J|g/\0333fe\"91D!\b\005\002\tEBC\001B\016\021!\021)D!\b\005B\t]\022AD4fi\026sg/\033:p]6,g\016\036\013\005\005s\021\031\005\r\003\003<\t}\002\003\002\022)\005{\0012\001\fB \t-\021\tEa\r\002\002\003\005)\021A\030\003\007}##\007\003\005\003F\tM\002\031AA8\003\025\031H/Y2l\001")
/*     */ public final class DriverBlockInterface {
/*     */   public static ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*     */     return DriverBlockInterface$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*     */   }
/*     */   
/*     */   public static Class<?> getTileEntityClass() {
/*     */     return DriverBlockInterface$.MODULE$.getTileEntityClass();
/*     */   }
/*     */   
/*     */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*     */     return DriverBlockInterface$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<TileInterface> implements NamedBlock, NetworkControl<TileInterface> {
/*     */     @Callback(doc = "function():table -- Get a list of tables representing the available CPUs in the network.")
/*  28 */     public Object[] getCpus(Context context, Arguments args) { return NetworkControl$class.getCpus(this, context, args); } private final TileInterface tile; @Callback(doc = "function([filter:table]):table -- Get a list of known item recipes. These can be used to issue crafting requests.") public Object[] getCraftables(Context context, Arguments args) { return NetworkControl$class.getCraftables(this, context, args); } @Callback(doc = "function([filter:table]):table -- Get a list of the stored items in the network.") public Object[] getItemsInNetwork(Context context, Arguments args) { return NetworkControl$class.getItemsInNetwork(this, context, args); } @Callback(doc = "function(filter:table):table -- Get a list of the stored items in the network matching the filter. Filter is an Array of Item IDs") public Object[] getItemsInNetworkById(Context context, Arguments args) { return NetworkControl$class.getItemsInNetworkById(this, context, args); } @Callback(doc = "function():userdata -- Get an iterator object for the list of the items in the network.") public Object[] allItems(Context context, Arguments args) { return NetworkControl$class.allItems(this, context, args); } @Callback(doc = "function(filter:table, dbAddress:string[, startSlot:number[, count:number]]): Boolean -- Store items in the network matching the specified filter in the database with the specified address.") public Object[] store(Context context, Arguments args) { return NetworkControl$class.store(this, context, args); } @Callback(doc = "function():table -- Get a list of the stored fluids in the network.") public Object[] getFluidsInNetwork(Context context, Arguments args) { return NetworkControl$class.getFluidsInNetwork(this, context, args); } @Callback(doc = "function():number -- Get the average power injection into the network.") public Object[] getAvgPowerInjection(Context context, Arguments args) { return NetworkControl$class.getAvgPowerInjection(this, context, args); } @Callback(doc = "function():number -- Get the average power usage of the network.") public Object[] getAvgPowerUsage(Context context, Arguments args) { return NetworkControl$class.getAvgPowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the idle power usage of the network.") public Object[] getIdlePowerUsage(Context context, Arguments args) { return NetworkControl$class.getIdlePowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the maximum stored power in the network.") public Object[] getMaxStoredPower(Context context, Arguments args) { return NetworkControl$class.getMaxStoredPower(this, context, args); } @Callback(doc = "function():number -- Get the stored power in the network. ") public Object[] getStoredPower(Context context, Arguments args) { return NetworkControl$class.getStoredPower(this, context, args); } public TileInterface tile() { return this.tile; } public Environment(TileInterface tile) { super(tile, "me_interface"); NetworkControl$class.$init$(this); } public String preferredName() {
/*  29 */       return "me_interface";
/*     */     } public int priority() {
/*  31 */       return 5;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function([slot:number]):table -- Get the configuration of the interface.")
/*     */     public Object[] getInterfaceConfiguration(Context context, Arguments args) {
/*  36 */       IInventory config = ((TileInterface)this.tileEntity).getInventoryByName("config");
/*  37 */       int slot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).optSlot(config, 0, 0);
/*  38 */       ItemStack stack = config.func_70301_a(slot);
/*  39 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { stack }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function([slot:number][, database:address, entry:number[, size:number]]):boolean -- Configure the interface.")
/*     */     public Object[] setInterfaceConfiguration(Context context, Arguments args) {
/*  44 */       IInventory config = ((TileInterface)this.tileEntity).getInventoryByName("config");
/*  45 */       int slot = args.isString(0) ? 0 : li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).optSlot(config, 0, 0);
/*  46 */       config.func_70299_a(slot, getStack(args));
/*  47 */       context.pause(0.5D);
/*  48 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */     }
/*     */     
/*     */     private ItemStack getStack(Arguments args) {
/*  52 */       if (args.count() > 1) {
/*     */         
/*  54 */         Tuple3 tuple3 = args.isString(0) ? new Tuple3(args.checkString(0), BoxesRunTime.boxToInteger(args.checkInteger(1)), BoxesRunTime.boxToInteger(args.optInteger(2, 1))) : 
/*  55 */           new Tuple3(args.checkString(1), BoxesRunTime.boxToInteger(args.checkInteger(2)), BoxesRunTime.boxToInteger(args.optInteger(3, 1))); if (tuple3 != null) {
/*     */           String address = (String)tuple3._1(); int entry = BoxesRunTime.unboxToInt(tuple3._2()), size = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(address, BoxesRunTime.boxToInteger(entry), BoxesRunTime.boxToInteger(size)), tuple31 = tuple32; String str1 = (String)tuple31._1(); int i = BoxesRunTime.unboxToInt(tuple31._2()), j = BoxesRunTime.unboxToInt(tuple31._3());
/*  57 */           Node node = node().network().node(str1);
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         throw new MatchError(tuple3);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  71 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function([slot:number]):table -- Get the given pattern in the interface.")
/*     */     public Object[] getInterfacePattern(Context context, Arguments args) {
/*  76 */       IInventory inv = ((TileInterface)this.tileEntity).getInventoryByName("patterns");
/*  77 */       int slot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).optSlot(inv, 0, 0);
/*  78 */       ItemStack stack = inv.func_70301_a(slot);
/*  79 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { stack }));
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(slot:number, database:address, entry:number, size:number, index:number):boolean -- Set the pattern input at the given index.")
/*     */     public Object[] setInterfacePatternInput(Context context, Arguments args) {
/*  84 */       return setPatternSlot(context, args, "in");
/*     */     }
/*     */     @Callback(doc = "function(slot:number, database:address, entry:number, size:number, index:number):boolean -- Set the pattern output at the given index.")
/*     */     public Object[] setInterfacePatternOutput(Context context, Arguments args) {
/*  88 */       return setPatternSlot(context, args, "out");
/*     */     }
/*     */     @Callback(doc = "function(slot:number, index:number, database:address, entry:number):boolean -- Store pattern input at the given index to the database entry.")
/*     */     public Object[] storeInterfacePatternInput(Context context, Arguments args) {
/*  92 */       return storeInterfacePattern(context, args, "in");
/*     */     }
/*     */     @Callback(doc = "function(slot:number, index:number, database:address, entry:number):boolean -- Store pattern output at the given index to the database entry.")
/*     */     public Object[] storeInterfacePatternOutput(Context context, Arguments args) {
/*  96 */       return storeInterfacePattern(context, args, "out");
/*     */     }
/*     */     @Callback(doc = "function(slot:number, index:number):boolean -- Clear pattern input at the given index.")
/*     */     public Object[] clearInterfacePatternInput(Context context, Arguments args) {
/* 100 */       return clearInterfacePattern(context, args, "in");
/*     */     }
/*     */     @Callback(doc = "function(slot:number, index:number):boolean -- Clear pattern output at the given index.")
/*     */     public Object[] clearInterfacePatternOutput(Context context, Arguments args) {
/* 104 */       return clearInterfacePattern(context, args, "out");
/*     */     }
/*     */     
/*     */     private Object[] storeInterfacePattern(Context context, Arguments args, String tag) {
/* 108 */       IInventory inv = ((TileInterface)this.tileEntity).getInventoryByName("patterns");
/* 109 */       ItemStack pattern = inv.func_70301_a(li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(inv, 0));
/* 110 */       NBTTagCompound encodedValue = pattern.func_77978_p();
/* 111 */       if (encodedValue == null)
/* 112 */         throw new IllegalArgumentException("No pattern here!"); 
/* 113 */       NBTTagList nbt = encodedValue.func_150295_c(tag, 10);
/* 114 */       int index = args.checkInteger(1) - 1;
/* 115 */       if (index < 0)
/* 116 */         throw new IllegalArgumentException("Invalid index!"); 
/* 117 */       NBTTagCompound stackNBT = nbt.func_150305_b(index);
/* 118 */       ItemStack stack = ItemStack.func_77949_a(stackNBT);
/* 119 */       return li.cil.oc.util.DatabaseAccess$.MODULE$.withDatabase(node(), args.checkString(2), (Function1)new DriverBlockInterface$Environment$$anonfun$storeInterfacePattern$1(this, context, args, stack)); } public final class DriverBlockInterface$Environment$$anonfun$storeInterfacePattern$1 extends AbstractFunction1<UpgradeDatabase, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final Context context$1; private final Arguments args$1; private final ItemStack stack$1; public DriverBlockInterface$Environment$$anonfun$storeInterfacePattern$1(DriverBlockInterface.Environment $outer, Context context$1, Arguments args$1, ItemStack stack$1) {} public final Object[] apply(UpgradeDatabase database) {
/* 120 */         int slot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(this.args$1).optSlot(database.data(), 3, 0);
/* 121 */         database.setStackInSlot(slot, this.stack$1);
/* 122 */         this.context$1.pause(0.1D);
/* 123 */         return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */       } }
/*     */ 
/*     */     
/*     */     private Object[] clearInterfacePattern(Context context, Arguments args, String tag) {
/* 128 */       IInventory inv = ((TileInterface)this.tileEntity).getInventoryByName("patterns");
/* 129 */       int slot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(inv, 0);
/* 130 */       ItemStack pattern = inv.func_70301_a(slot);
/* 131 */       NBTTagCompound encodedValue = pattern.func_77978_p();
/* 132 */       if (encodedValue == null)
/* 133 */         throw new IllegalArgumentException("No pattern here!"); 
/* 134 */       NBTTagList nbt = encodedValue.func_150295_c(tag, 10);
/* 135 */       int index = args.checkInteger(1) - 1;
/* 136 */       if (index < 0)
/* 137 */         throw new IllegalArgumentException("Invalid index!"); 
/* 138 */       nbt.func_74744_a(index);
/* 139 */       encodedValue.func_74782_a(tag, (NBTBase)nbt);
/* 140 */       pattern.func_77982_d(encodedValue);
/* 141 */       inv.func_70299_a(slot, null);
/* 142 */       inv.func_70299_a(slot, pattern);
/* 143 */       context.pause(0.1D);
/* 144 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */     }
/*     */     
/*     */     private Object[] setPatternSlot(Context context, Arguments args, String tag) {
/* 148 */       IInventory inv = ((TileInterface)this.tileEntity).getInventoryByName("patterns");
/* 149 */       int slot = args.isString(0) ? 0 : li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).optSlot(inv, 0, 0);
/* 150 */       ItemStack stack = getStack(args);
/* 151 */       int index = args.checkInteger(4) - 1;
/* 152 */       if (index < 0 || index > 511)
/* 153 */         throw new IllegalArgumentException("Invalid index!"); 
/* 154 */       ItemStack pattern = inv.func_70301_a(slot);
/* 155 */       NBTTagCompound encodedValue = pattern.func_77978_p();
/* 156 */       if (encodedValue == null)
/* 157 */         throw new IllegalArgumentException("No pattern here!"); 
/* 158 */       NBTTagList inTag = encodedValue.func_150295_c(tag, 10);
/* 159 */       while (inTag.func_74745_c() <= index) {
/* 160 */         inTag.func_74742_a((NBTBase)new NBTTagCompound());
/*     */       }
/* 162 */       NBTTagCompound nbt = new NBTTagCompound();
/* 163 */       stack.func_77955_b(nbt);
/* 164 */       nbt.func_74768_a("Count", stack.field_77994_a);
/* 165 */       nbt.func_74772_a("Cnt", stack.field_77994_a);
/* 166 */       inTag.func_150304_a(index, (NBTBase)nbt);
/*     */ 
/*     */       
/* 169 */       (stack == null) ? inTag.func_74744_a(index) : BoxedUnit.UNIT;
/* 170 */       encodedValue.func_74782_a(tag, (NBTBase)inTag);
/* 171 */       pattern.func_77982_d(encodedValue);
/* 172 */       inv.func_70299_a(slot, null);
/* 173 */       inv.func_70299_a(slot, pattern);
/* 174 */       context.pause(0.1D);
/* 175 */       return li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*     */     } }
/*     */   public static class Provider$ implements EnvironmentProvider { public static final Provider$ MODULE$;
/*     */     public Provider$() {
/* 179 */       MODULE$ = this;
/*     */     } public Class<?> getEnvironment(ItemStack stack) {
/* 181 */       return AEUtil$.MODULE$.isBlockInterface(stack) ? 
/* 182 */         DriverBlockInterface.Environment.class : 
/* 183 */         null;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverBlockInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */