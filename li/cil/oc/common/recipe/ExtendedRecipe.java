/*     */ package li.cil.oc.common.recipe;
/*     */ 
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.common.item.data.DroneData;
/*     */ import li.cil.oc.common.item.data.MicrocontrollerData;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import li.cil.oc.common.item.data.RobotData;
/*     */ import li.cil.oc.common.item.data.TabletData;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.inventory.InventoryCrafting;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.PartialFunction;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.IterableLike;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.mutable.Set$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ import scala.util.control.Breaks$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t}q!B\001\003\021\003i\021AD#yi\026tG-\0323SK\016L\007/\032\006\003\007\021\taA]3dSB,'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\035\025CH/\0328eK\022\024VmY5qKN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\002\003\017\020\021\013\007I\021B\017\002\013\021\024xN\\3\026\003y\001\"a\b\023\016\003\001R!!\t\022\002\r\021,G/Y5m\025\t\031c!A\002ba&L!!\n\021\003\021%#X-\\%oM>D\001bJ\b\t\002\003\006KAH\001\007IJ|g.\032\021\t\021%z\001R1A\005\nu\ta!Z3qe>l\007\002C\026\020\021\003\005\013\025\002\020\002\017\025,\007O]8nA!AQf\004EC\002\023%Q$A\004mk\006\024\025n\\:\t\021=z\001\022!Q!\ny\t\001\002\\;b\005&|7\017\t\005\tc=A)\031!C\005;\005\031QnY;\t\021Mz\001\022!Q!\ny\tA!\\2vA!AQg\004EC\002\023%Q$A\toCZLw-\031;j_:,\006o\032:bI\026D\001bN\b\t\002\003\006KAH\001\023]\0064\030nZ1uS>tW\013]4sC\022,\007\005\003\005:\037!\025\r\021\"\003\036\003)a\027N\\6fI\016\013'\017\032\005\tw=A\t\021)Q\005=\005YA.\0338lK\022\034\025M\0353!\021!it\002#b\001\n\023i\022A\0024m_B\004\030\020\003\005@\037!\005\t\025)\003\037\003\0351Gn\0349qs\002B\001\"Q\b\t\006\004%IAQ\001\005Q\022$7/F\001D!\r\031BIH\005\003\013R\021Q!\021:sCfD\001bR\b\t\002\003\006KaQ\001\006Q\022$7\017\t\005\t\023>A)\031!C\005\005\006!1\r];t\021!Yu\002#A!B\023\031\025!B2qkN\004\003\002C'\020\021\013\007I\021B\017\002\013I|'m\034;\t\021={\001\022!Q!\ny\taA]8c_R\004\003\002C)\020\021\013\007I\021B\017\002\rQ\f'\r\\3u\021!\031v\002#A!B\023q\022a\002;bE2,G\017\t\005\t+>A)\031!C\005;\005)\001O]5oi\"Aqk\004E\001B\003&a$\001\004qe&tG\017\t\005\t3>A)\031!C\0055\006AA-[:bE2,G-F\001\\!\ta6-D\001^\025\tqv,\001\003ji\026l'B\0011b\003%i\027N\\3de\0064GOC\001c\003\rqW\r^\005\003Iv\023\021\"\023;f[N#\030mY6\t\021\031|\001\022!Q!\nm\013\021\002Z5tC\ndW\r\032\021\t\013!|A\021A5\002\035\005$GM\024\"U)>\024Vm];miR!1L[9t\021\025\031q\r1\001l!\taw.D\001n\025\tqW,\001\005de\0064G/\0338h\023\t\001XNA\004J%\026\034\027\016]3\t\013I<\007\031A.\002\031\r\024\030M\032;fIN#\030mY6\t\013Q<\007\031A;\002\023%tg/\0328u_JL\bC\001<y\033\0059(B\001;`\023\tIxOA\tJ]Z,g\016^8ss\016\023\030M\032;j]\036DQa_\b\005\nq\f\001bZ3u\023R,Wn\035\013\004{\006-\001\003\002@\002\bmk\021a \006\005\003\003\t\031!A\005j[6,H/\0312mK*\031\021Q\001\013\002\025\r|G\016\\3di&|g.C\002\002\n}\024!\"\0238eKb,GmU3r\021\025!(\0201\001v\021\035\tya\004C\005\003#\tqA]3de\0064G\017\006\006\002\024\005e\0211DA\017\003C\0012aEA\013\023\r\t9\002\006\002\005+:LG\017\003\004s\003\033\001\ra\027\005\007i\0065\001\031A;\t\017\005}\021Q\002a\001=\005QA-Z:de&\004Ho\034:\t\021\005\r\022Q\002a\001\003K\t1\002Z1uC\032\0137\r^8ssB11#a\n\\\003WI1!!\013\025\005%1UO\\2uS>t\027\007\005\003\002.\005=R\"A\b\007\023\005Er\002%A\022\n\005M\"aD%uK6$\025\r^1Xe\006\004\b/\032:\024\007\005=\"\003\003\005\0028\005=b\021AA\035\003)\031w.\0349p]\026tGo]\013\003\003w\0012a\005#\\\021!\ty$a\f\007\002\005\005\023AD2p[B|g.\0328ug~#S-\035\013\005\003'\t\031\005\003\005\002F\005u\002\031AA\036\003\0251\030\r\\;f\021!\tI%a\f\007\002\005-\023\001B:bm\026$B!a\005\002N!9\021qJA$\001\004Y\026!B:uC\016\\\007bBA*\037\021%\021QK\001(o\026\f%/\032\"fS:<7)\0317mK\0224%o\\7BaBd\027.\0323F]\026\024x-[:uS\016\034('\006\002\002XA\0311#!\027\n\007\005mCCA\004C_>dW-\0318\007\r\005}s\002BA1\0059i5)\026#bi\006<&/\0319qKJ\034R!!\030\023\003WA!\"a\024\002^\t\025\r\021\"\001[\021)\t9'!\030\003\002\003\006IaW\001\007gR\f7m\033\021\t\017e\ti\006\"\001\002lQ!\021QNA8!\021\ti#!\030\t\017\005=\023\021\016a\0017\"Q\0211OA/\005\004%\t!!\036\002\t\021\fG/Y\013\003\003o\002B!!\037\002\0005\021\0211\020\006\005\003g\niH\003\002_\t%!\021\021QA>\005Mi\025n\031:pG>tGO]8mY\026\024H)\031;b\021%\t))!\030!\002\023\t9(A\003eCR\f\007\005\003\005\0028\005uC\021IA\035\021!\ty$!\030\005B\005-E\003BA\n\003\033C\001\"!\022\002\n\002\007\0211\b\005\t\003\023\ni\006\"\021\002\022R!\0211CAJ\021\035\ty%a$A\002m3a!a&\020\t\005e%\001\005#s_:,G)\031;b/J\f\007\017]3s'\025\t)JEA\026\021)\ty%!&\003\006\004%\tA\027\005\013\003O\n)J!A!\002\023Y\006bB\r\002\026\022\005\021\021\025\013\005\003G\013)\013\005\003\002.\005U\005bBA(\003?\003\ra\027\005\013\003g\n)J1A\005\002\005%VCAAV!\021\tI(!,\n\t\005=\0261\020\002\n\tJ|g.\032#bi\006D\021\"!\"\002\026\002\006I!a+\t\021\005]\022Q\023C!\003sA\001\"a\020\002\026\022\005\023q\027\013\005\003'\tI\f\003\005\002F\005U\006\031AA\036\021!\tI%!&\005B\005uF\003BA\n\003Cq!a\024\002<\002\0071L\002\004\002D>!\021Q\031\002\021%>\024w\016\036#bi\006<&/\0319qKJ\034R!!1\023\003WA!\"a\024\002B\n\025\r\021\"\001[\021)\t9'!1\003\002\003\006Ia\027\005\b3\005\005G\021AAg)\021\ty-!5\021\t\0055\022\021\031\005\b\003\037\nY\r1\001\\\021)\t\031(!1C\002\023\005\021Q[\013\003\003/\004B!!\037\002Z&!\0211\\A>\005%\021vNY8u\t\006$\030\rC\005\002\006\006\005\007\025!\003\002X\"A\021qGAa\t\003\nI\004\003\005\002@\005\005G\021IAr)\021\t\031\"!:\t\021\005\025\023\021\035a\001\003wA\001\"!\023\002B\022\005\023\021\036\013\005\003'\tY\017C\004\002P\005\035\b\031A.\007\r\005=x\002BAy\005E!\026M\0317fi\022\013G/Y,sCB\004XM]\n\006\003[\024\0221\006\005\013\003\037\niO!b\001\n\003Q\006BCA4\003[\024\t\021)A\0057\"9\021$!<\005\002\005eH\003BA~\003{\004B!!\f\002n\"9\021qJA|\001\004Y\006BCA:\003[\024\r\021\"\001\003\002U\021!1\001\t\005\003s\022)!\003\003\003\b\005m$A\003+bE2,G\017R1uC\"I\021QQAwA\003%!1\001\005\013\003o\ti\0171A\005\002\005e\002BCA \003[\004\r\021\"\001\003\020Q!\0211\003B\t\021)\021\031B!\004\002\002\003\007\0211H\001\004q\022\n\004\"\003B\f\003[\004\013\025BA\036\003-\031w.\0349p]\026tGo\035\021\t\021\005%\023Q\036C!\0057!B!a\005\003\036!9\021q\nB\r\001\004Y\006")
/*     */ public final class ExtendedRecipe {
/*     */   public static ItemStack addNBTToResult(IRecipe paramIRecipe, ItemStack paramItemStack, InventoryCrafting paramInventoryCrafting) {
/*     */     return ExtendedRecipe$.MODULE$.addNBTToResult(paramIRecipe, paramItemStack, paramInventoryCrafting);
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$disabled$1
/*     */     extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final NBTTagCompound apply(NBTTagCompound x$1) {
/*  54 */       (new NBTBase[1])[0] = (NBTBase)ExtendedNBT$.MODULE$.toNbt("Autocrafting of this item is disabled to avoid exploits."); return ExtendedNBT$.MODULE$.extendNBTTagCompound(x$1).setNewTagList("Lore", (Seq)Predef$.MODULE$.wrapRefArray((Object[])new NBTBase[1]));
/*     */     } }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$2 extends AbstractFunction1<Item, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack craftedStack$1;
/*     */     private final InventoryCrafting inventory$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$2(ItemStack craftedStack$1, InventoryCrafting inventory$1) {}
/*     */     
/*     */     public final void apply(Item driver) {
/*  64 */       ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$getItems(this.inventory$1).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1(this, driver));
/*     */     } public final class ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Item driver$1; public ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1(ExtendedRecipe$$anonfun$addNBTToResult$2 $outer, Item driver$1) {} public final Object apply(ItemStack stack) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   4: getstatic net/minecraft/init/Items.field_151098_aY : Lnet/minecraft/item/ItemMap;
/*     */         //   7: astore_2
/*     */         //   8: dup
/*     */         //   9: ifnonnull -> 20
/*     */         //   12: pop
/*     */         //   13: aload_2
/*     */         //   14: ifnull -> 27
/*     */         //   17: goto -> 90
/*     */         //   20: aload_2
/*     */         //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   24: ifeq -> 90
/*     */         //   27: aload_0
/*     */         //   28: getfield driver$1 : Lli/cil/oc/api/driver/Item;
/*     */         //   31: aload_0
/*     */         //   32: getfield $outer : Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2;
/*     */         //   35: getfield craftedStack$1 : Lnet/minecraft/item/ItemStack;
/*     */         //   38: invokeinterface dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */         //   43: astore_3
/*     */         //   44: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*     */         //   47: aload_3
/*     */         //   48: invokevirtual extendNBTTagCompound : (Lnet/minecraft/nbt/NBTTagCompound;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagCompound;
/*     */         //   51: new scala/collection/mutable/StringBuilder
/*     */         //   54: dup
/*     */         //   55: invokespecial <init> : ()V
/*     */         //   58: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */         //   61: invokevirtual namespace : ()Ljava/lang/String;
/*     */         //   64: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   67: ldc 'map'
/*     */         //   69: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   72: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   75: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2
/*     */         //   78: dup
/*     */         //   79: aload_0
/*     */         //   80: aload_1
/*     */         //   81: invokespecial <init> : (Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1;Lnet/minecraft/item/ItemStack;)V
/*     */         //   84: invokevirtual setNewCompoundTag : (Ljava/lang/String;Lscala/Function1;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */         //   87: goto -> 93
/*     */         //   90: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   93: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #65	-> 0
/*     */         //   #67	-> 27
/*     */         //   #68	-> 44
/*     */         //   #65	-> 90
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	94	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1;
/*     */         //   0	94	1	stack	Lnet/minecraft/item/ItemStack;
/*     */         //   44	43	3	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */       } public final class ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(NBTTagCompound x$1) {
/*  68 */           return this.stack$1.func_77955_b(x$1);
/*     */         }
/*     */         private final ItemStack stack$1;
/*     */         public ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2(ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1 $outer, ItemStack stack$1) {} } } }
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$3 extends AbstractFunction1<Item, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack craftedStack$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$3(ItemStack craftedStack$1) {}
/*     */     
/*     */     public final void apply(Item driver) {
/*  77 */       NBTTagCompound nbt = driver.dataTag(this.craftedStack$1);
/*  78 */       nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tunnel").toString(), UUID.randomUUID().toString());
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$4
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final NBTTagCompound nbt$1;
/*     */     
/*     */     private final String colorKey$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$4(NBTTagCompound nbt$1, String colorKey$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   4: ifnull -> 150
/*     */       //   7: aload_1
/*     */       //   8: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   11: getstatic li/cil/oc/common/recipe/ExtendedRecipe$.MODULE$ : Lli/cil/oc/common/recipe/ExtendedRecipe$;
/*     */       //   14: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$floppy : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   17: astore_2
/*     */       //   18: dup
/*     */       //   19: ifnonnull -> 30
/*     */       //   22: pop
/*     */       //   23: aload_2
/*     */       //   24: ifnull -> 68
/*     */       //   27: goto -> 37
/*     */       //   30: aload_2
/*     */       //   31: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   34: ifne -> 68
/*     */       //   37: aload_1
/*     */       //   38: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   41: invokeinterface name : ()Ljava/lang/String;
/*     */       //   46: ldc 'lootDisk'
/*     */       //   48: astore_3
/*     */       //   49: dup
/*     */       //   50: ifnonnull -> 61
/*     */       //   53: pop
/*     */       //   54: aload_3
/*     */       //   55: ifnull -> 68
/*     */       //   58: goto -> 150
/*     */       //   61: aload_3
/*     */       //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   65: ifeq -> 150
/*     */       //   68: aload_1
/*     */       //   69: invokevirtual func_77942_o : ()Z
/*     */       //   72: ifeq -> 150
/*     */       //   75: aload_1
/*     */       //   76: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   79: astore #4
/*     */       //   81: aload #4
/*     */       //   83: aload_0
/*     */       //   84: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   87: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */       //   90: ifeq -> 150
/*     */       //   93: aload #4
/*     */       //   95: aload_0
/*     */       //   96: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   99: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */       //   102: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   105: getstatic li/cil/oc/util/Color$.MODULE$ : Lli/cil/oc/util/Color$;
/*     */       //   108: invokevirtual dyes : ()[Ljava/lang/String;
/*     */       //   111: checkcast [Ljava/lang/Object;
/*     */       //   114: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   117: ldc 'lightGray'
/*     */       //   119: invokeinterface indexOf : (Ljava/lang/Object;)I
/*     */       //   124: if_icmpeq -> 150
/*     */       //   127: aload_0
/*     */       //   128: getfield nbt$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   131: aload_0
/*     */       //   132: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   135: aload #4
/*     */       //   137: aload_0
/*     */       //   138: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   141: invokevirtual func_74781_a : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTBase;
/*     */       //   144: invokevirtual func_74737_b : ()Lnet/minecraft/nbt/NBTBase;
/*     */       //   147: invokevirtual func_74782_a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
/*     */       //   150: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 0
/*     */       //   #97	-> 75
/*     */       //   #98	-> 81
/*     */       //   #99	-> 127
/*     */       //   #96	-> 150
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	151	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$4;
/*     */       //   0	151	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   81	70	4	oldData	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$5
/*     */     extends AbstractFunction1<ItemStack, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(ItemStack x$2) {
/* 107 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$floppy(); if (Items.get(x$2) == null) { Items.get(x$2); if (itemInfo != null); } else if (Items.get(x$2).equals(itemInfo))
/*     */       {  }
/*     */     
/* 110 */     } } public final class ExtendedRecipe$$anonfun$addNBTToResult$6 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound nbt$1; public ExtendedRecipe$$anonfun$addNBTToResult$6(NBTTagCompound nbt$1) {} public final void apply(ItemStack stack) { ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$floppy(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo)) { if (stack.func_77942_o())
/* 111 */           { NBTTagCompound oldData = stack.func_77978_p();
/* 112 */             ((IterableLike)WrapAsScala$.MODULE$.asScalaSet(oldData.func_150296_c()).map((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(this), Set$.MODULE$.canBuildFrom())).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(this, oldData)); }  return; }  return; }  if (stack.func_77942_o()) { NBTTagCompound nBTTagCompound = stack.func_77978_p(); ((IterableLike)WrapAsScala$.MODULE$.asScalaSet(nBTTagCompound.func_150296_c()).map((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(this), Set$.MODULE$.canBuildFrom())).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(this, nBTTagCompound)); }  } public final class ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Object x$3) { return (String)x$3; } public ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(ExtendedRecipe$$anonfun$addNBTToResult$6 $outer) {} } public final class ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound oldData$1; public ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(ExtendedRecipe$$anonfun$addNBTToResult$6 $outer, NBTTagCompound oldData$1) {} public final void apply(String oldTagName) {
/* 113 */         this.$outer.nbt$1.func_74782_a(oldTagName, this.oldData$1.func_74781_a(oldTagName).func_74737_b());
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$7
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final PrintData data$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$7(PrintData data$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/* 128 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$print(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 129 */         { this.data$1.load(stack); return; }  return; }  this.data$1.load(stack);
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$8 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final PrintData data$1;
/*     */     private final ItemStack[] beaconBlocks$1;
/*     */     private final ItemStack glowstoneDust$1;
/*     */     private final ItemStack glowstone$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$8(PrintData data$1, ItemStack[] beaconBlocks$1, ItemStack glowstoneDust$1, ItemStack glowstone$1, Object nonLocalReturnKey1$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/* 144 */       if (Predef$.MODULE$.refArrayOps((Object[])this.beaconBlocks$1).exists((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5(this, stack))) {
/* 145 */         if (this.data$1.isBeaconBase())
/*     */         {
/* 147 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 149 */         this.data$1.isBeaconBase_$eq(true);
/*     */       } 
/* 151 */       if (this.glowstoneDust$1.func_77969_a(stack)) {
/* 152 */         if (this.data$1.lightLevel() == 15)
/*     */         {
/* 154 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 156 */         this.data$1.lightLevel_$eq(package$.MODULE$.min(15, this.data$1.lightLevel() + 1));
/*     */       } 
/* 158 */       if (this.glowstone$1.func_77969_a(stack)) {
/* 159 */         if (this.data$1.lightLevel() == 15)
/*     */         {
/* 161 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 163 */         this.data$1.lightLevel_$eq(package$.MODULE$.min(15, this.data$1.lightLevel() + 4));
/*     */       } 
/*     */     }
/*     */     public final class ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2;
/*     */       public final boolean apply(ItemStack x$4) {
/*     */         return x$4.func_77969_a(this.stack$2);
/*     */       }
/*     */       public ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5(ExtendedRecipe$$anonfun$addNBTToResult$8 $outer, ItemStack stack$2) {} }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack craftedStack$1;
/*     */     private final InventoryCrafting inventory$1;
/*     */     
/* 177 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$getItems(this.inventory$1).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1(this)); } public ExtendedRecipe$$anonfun$addNBTToResult$1(ItemStack craftedStack$1, InventoryCrafting inventory$1) {} public final class ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1(ExtendedRecipe$$anonfun$addNBTToResult$1 $outer) {} public final void apply(ItemStack stack) {
/* 178 */         ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo)) { if (stack.func_77942_o())
/* 179 */             { NBTTagCompound copy = (NBTTagCompound)stack.func_77978_p().func_74737_b();
/*     */               
/* 181 */               copy.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()).func_74775_l("node").func_82580_o("address");
/* 182 */               this.$outer.craftedStack$1.func_77982_d(copy);
/* 183 */               throw Breaks$.MODULE$.break(); }  return; }  return; }  if (stack.func_77942_o()) { NBTTagCompound nBTTagCompound = (NBTTagCompound)stack.func_77978_p().func_74737_b(); nBTTagCompound.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()).func_74775_l("node").func_82580_o("address"); this.$outer.craftedStack$1.func_77982_d(nBTTagCompound); throw Breaks$.MODULE$.break(); }
/*     */       
/*     */       } } }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$9 extends AbstractFunction1<ItemStack, MCUDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 189 */     public final ExtendedRecipe.MCUDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.MCUDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$10 extends AbstractFunction1<ItemStack, DroneDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/* 190 */     public final ExtendedRecipe.DroneDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.DroneDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$11 extends AbstractFunction1<ItemStack, RobotDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/* 191 */     public final ExtendedRecipe.RobotDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.RobotDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$12 extends AbstractFunction1<ItemStack, TabletDataWrapper> implements Serializable { public static final long serialVersionUID = 0L; public final ExtendedRecipe.TabletDataWrapper apply(ItemStack stack) {
/* 192 */       return new ExtendedRecipe.TabletDataWrapper(stack);
/*     */     } }
/*     */   public final class ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final InventoryCrafting inventory$2;
/*     */     
/* 197 */     public final ItemStack apply(int x$1) { return this.inventory$2.func_70301_a(x$1); } public ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$1(InventoryCrafting inventory$2) {} } public final class ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$5) { return !(x$5 == null); }
/*     */      }
/*     */   public final class ExtendedRecipe$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemInfo descriptor$1;
/*     */     
/*     */     public final boolean apply(ItemStack x$6) {
/* 202 */       ItemInfo itemInfo = this.descriptor$1; if (Items.get(x$6) == null) { Items.get(x$6); if (itemInfo != null); } else if (Items.get(x$6).equals(itemInfo))
/*     */       {  }
/*     */     
/*     */     } public ExtendedRecipe$$anonfun$2(ItemInfo descriptor$1) {} } public final class ExtendedRecipe$$anonfun$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(ItemStack x$7) {
/* 207 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(x$7) == null) { Items.get(x$7); if (itemInfo != null); } else if (Items.get(x$7).equals(itemInfo))
/*     */       {  }
/*     */     
/*     */     } } public final class ExtendedRecipe$$anonfun$recraft$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ExtendedRecipe.ItemDataWrapper data$2; public ExtendedRecipe$$anonfun$recraft$1(ExtendedRecipe.ItemDataWrapper data$2) {}
/*     */     public final void apply(ItemStack stack) {
/* 212 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 213 */         { this.data$2.components_$eq((ItemStack[])Predef$.MODULE$.refArrayOps((Object[])this.data$2.components()).$colon$plus(stack.func_77946_l().func_77979_a(1), ClassTag$.MODULE$.apply(ItemStack.class))); return; }  return; }  this.data$2.components_$eq((ItemStack[])Predef$.MODULE$.refArrayOps((Object[])this.data$2.components()).$colon$plus(stack.func_77946_l().func_77979_a(1), ClassTag$.MODULE$.apply(ItemStack.class)));
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$weAreBeingCalledFromAppliedEnergistics2$1
/*     */     extends AbstractFunction1<StackTraceElement, Object>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(StackTraceElement x$8) {
/* 223 */       String str = "appeng.container.implementations.ContainerPatternTerm"; if (x$8.getClassName() == null) { x$8.getClassName(); if (str != null); } else if (x$8.getClassName().equals(str))
/*     */       {  }
/*     */     
/*     */     }
/*     */   }
/*     */   
/*     */   public static class MCUDataWrapper implements ItemDataWrapper {
/*     */     private final ItemStack stack;
/*     */     private final MicrocontrollerData data;
/*     */     
/* 233 */     public ItemStack stack() { return this.stack; }
/* 234 */     public MCUDataWrapper(ItemStack stack) { this.data = new MicrocontrollerData(stack); } public MicrocontrollerData data() { return this.data; }
/*     */      public ItemStack[] components() {
/* 236 */       return data().components();
/*     */     } public void components_$eq(ItemStack[] value) {
/* 238 */       data().components_$eq(value);
/*     */     } public void save(ItemStack stack) {
/* 240 */       data().save(stack);
/*     */     } }
/*     */   public static class DroneDataWrapper implements ItemDataWrapper { private final ItemStack stack; private final DroneData data;
/* 243 */     public ItemStack stack() { return this.stack; }
/* 244 */     public DroneDataWrapper(ItemStack stack) { this.data = new DroneData(stack); } public DroneData data() { return this.data; }
/*     */      public ItemStack[] components() {
/* 246 */       return data().components();
/*     */     } public void components_$eq(ItemStack[] value) {
/* 248 */       data().components_$eq(value);
/*     */     } public void save(ItemStack stack) {
/* 250 */       data().save(stack);
/*     */     } }
/*     */   public static class RobotDataWrapper implements ItemDataWrapper { private final ItemStack stack; private final RobotData data;
/* 253 */     public ItemStack stack() { return this.stack; }
/* 254 */     public RobotDataWrapper(ItemStack stack) { this.data = new RobotData(stack); } public RobotData data() { return this.data; }
/*     */      public ItemStack[] components() {
/* 256 */       return data().components();
/*     */     } public void components_$eq(ItemStack[] value) {
/* 258 */       data().components_$eq(value);
/*     */     } public void save(ItemStack stack) {
/* 260 */       data().save(stack);
/*     */     } }
/*     */   public static class TabletDataWrapper implements ItemDataWrapper { private final ItemStack stack; private final TabletData data; private ItemStack[] components;
/* 263 */     public ItemStack stack() { return this.stack; }
/* 264 */     public TabletDataWrapper(ItemStack stack) { this.data = new TabletData(stack);
/*     */       
/* 266 */       this.components = (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])data().items()).collect((PartialFunction)new ExtendedRecipe$TabletDataWrapper$$anonfun$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))); } public TabletData data() { return this.data; } public ItemStack[] components() { return this.components; } public void components_$eq(ItemStack[] x$1) { this.components = x$1; } public final class ExtendedRecipe$TabletDataWrapper$$anonfun$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack item = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; }
/*     */        public ExtendedRecipe$TabletDataWrapper$$anonfun$1(ExtendedRecipe.TabletDataWrapper $outer) {} }
/*     */     public void save(ItemStack stack) {
/* 269 */       data().items_$eq((Option[])Predef$.MODULE$.refArrayOps((Object[])components()).map((Function1)new ExtendedRecipe$TabletDataWrapper$$anonfun$save$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class))));
/* 270 */       data().save(stack);
/*     */     }
/*     */     
/*     */     public final class ExtendedRecipe$TabletDataWrapper$$anonfun$save$1 extends AbstractFunction1<ItemStack, Option<ItemStack>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final Option<ItemStack> apply(ItemStack stack) {
/*     */         return Option$.MODULE$.apply(stack);
/*     */       }
/*     */       
/*     */       public ExtendedRecipe$TabletDataWrapper$$anonfun$save$1(ExtendedRecipe.TabletDataWrapper $outer) {}
/*     */     } }
/*     */ 
/*     */   
/*     */   public static interface ItemDataWrapper {
/*     */     ItemStack[] components();
/*     */     
/*     */     void components_$eq(ItemStack[] param1ArrayOfItemStack);
/*     */     
/*     */     void save(ItemStack param1ItemStack);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\ExtendedRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */