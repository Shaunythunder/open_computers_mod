/*    */ package li.cil.oc.common.block;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.client.KeyBindings$;
/*    */ import li.cil.oc.util.ItemCosts$;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.EnumRarity;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.StatCollector;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\005e\001B\001\003\0015\021A!\023;f[*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Yi\021\001\005\006\003#I\tA!\033;f[*\0211\003F\001\n[&tWm\031:bMRT\021!F\001\004]\026$\030BA\f\021\005%IE/Z7CY>\0347\016\003\005\032\001\t\005\t\025!\003\033\003\0251\030\r\\;f!\tYR$D\001\035\025\t\031!#\003\002\0379\t)!\t\\8dW\")\001\005\001C\001C\0051A(\0338jiz\"\"A\t\023\021\005\r\002Q\"\001\002\t\013ey\002\031\001\016\t\013\r\001A\021\001\024\026\003iAQ\001\013\001\005B%\na\"\0313e\023:4wN]7bi&|g\016F\003+aUrD\013\005\002,]5\tAFC\001.\003\025\0318-\0317b\023\tyCF\001\003V]&$\b\"B\031(\001\004\021\024!B:uC\016\\\007CA\b4\023\t!\004CA\005Ji\026l7\013^1dW\")ag\na\001o\0051\001\017\\1zKJ\004\"\001\017\037\016\003eR!A\016\036\013\005m\022\022AB3oi&$\0300\003\002>s\taQI\034;jif\004F.Y=fe\")qh\na\001\001\0069Ao\\8mi&\004\bGA!L!\r\021u)S\007\002\007*\021A)R\001\005kRLGNC\001G\003\021Q\027M^1\n\005!\033%\001\002'jgR\004\"AS&\r\001\021IAJPA\001\002\003\025\t!\024\002\004?\022\n\024C\001(R!\tYs*\003\002QY\t9aj\034;iS:<\007CA\026S\023\t\031FFA\002B]fDQ!V\024A\002Y\013\001\"\0313wC:\034W\r\032\t\003W]K!\001\027\027\003\017\t{w\016\\3b]\")!\f\001C!7\006Iq-\032;SCJLG/\037\013\0039~\003\"aD/\n\005y\003\"AC#ok6\024\026M]5us\")\021'\027a\001e!)\021\r\001C!E\006Yq-\032;NKR\fG-\031;b)\t\031g\r\005\002,I&\021Q\r\f\002\004\023:$\b\"B4a\001\004\031\027AC5uK6$\025-\\1hK\")\021\016\001C!U\0069r-\032;Ji\026l7\013^1dW\022K7\017\0357bs:\013W.\032\013\003WJ\004\"\001\\8\017\005-j\027B\0018-\003\031\001&/\0323fM&\021\001/\035\002\007'R\024\030N\\4\013\0059d\003\"B\031i\001\004\021\004\"\002;\001\t\003*\030AE4fiVsGn\\2bY&TX\r\032(b[\026$\022A\036\t\003ojl\021\001\037\006\003s\026\013A\001\\1oO&\021\001\017\037\005\006y\002!\t%`\001\026O\026$8i\0347pe\032\023x.\\%uK6\034F/Y2l)\r\031gp \005\006cm\004\rA\r\005\007\003\003Y\b\031A2\002\003YDca_A\0033\005u\001\003BA\004\0033i!!!\003\013\t\005-\021QB\001\013e\026d\027-\0368dQ\026\024(\002BA\b\003#\t1AZ7m\025\021\t\031\"!\006\002\t5|Gm\035\006\003\003/\t1a\0319x\023\021\tY\"!\003\003\021MKG-Z(oYf$#!a\b\n\t\005\005\0221E\001\007\0072KUI\024+\013\t\005\025\022\021B\001\005'&$W\rC\004\002*\001!\t%a\013\002#%\034(i\\8l\013:\034\007.\0318uC\ndW\rF\003W\003[\t\t\004C\004\0020\005\035\002\031\001\032\002\003\005Dq!a\r\002(\001\007!'A\001c\021\035\t9\004\001C!\003s\tA\002\0357bG\026\024En\\2l\003R$rCVA\036\003{\ty$!\024\002R\005U\023\021LA/\003O\nY'a\034\t\rE\n)\0041\0013\021\0311\024Q\007a\001o!A\021\021IA\033\001\004\t\031%A\003x_JdG\r\005\003\002F\005%SBAA$\025\r\t\tEE\005\005\003\027\n9EA\003X_JdG\rC\004\002P\005U\002\031A2\002\003aDq!a\025\0026\001\0071-A\001z\021\035\t9&!\016A\002\r\f\021A\037\005\b\0037\n)\0041\001d\003\021\031\030\016Z3\t\021\005}\023Q\007a\001\003C\nA\001[5u1B\0311&a\031\n\007\005\025DFA\003GY>\fG\017\003\005\002j\005U\002\031AA1\003\021A\027\016^-\t\021\0055\024Q\007a\001\003C\nA\001[5u5\"9\021\021OA\033\001\004\031\027\001C7fi\006$\027\r^1\t\035\005U\004\001%A\002\002\003%I!a\036\002~\005i2/\0369fe\022:W\r^%uK6\034F/Y2l\t&\034\b\017\\1z\035\006lW\rF\002w\003sB\021\"a\037\002t\005\005\t\031\001\032\002\007a$\023'C\002j\003J!!\001\t")
/*    */ public class Item extends ItemBlock {
/*    */   public Item(Block value) {
/* 25 */     super(value);
/* 26 */     func_77627_a(true);
/*    */   } public Block block() {
/* 28 */     return this.field_150939_a;
/*    */   }
/*    */   public void func_77624_a(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 31 */     super.func_77624_a(stack, player, tooltip, advanced);
/* 32 */     Tuple2 tuple2 = new Tuple2(block(), tooltip); if (tuple2 != null) {
/* 33 */       Block simple = (Block)tuple2._1(); List<String> lines = (List)tuple2._2(); if (simple instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)simple; if (lines instanceof List) { List<String> list = lines;
/* 34 */           simpleBlock.addInformation(func_77647_b(stack.func_77960_j()), stack, player, list, advanced);
/*    */ 
/*    */           
/* 37 */           ItemCosts$.MODULE$.addTooltip(stack, list);
/*    */ 
/*    */           
/* 40 */           list.add(StatCollector.func_74837_a((
/* 41 */                 new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tooltip.MaterialCosts").toString(), new Object[] {
/* 42 */                   KeyBindings$.MODULE$.getKeyBindingName(KeyBindings$.MODULE$.materialCosts()) })); BoxedUnit boxedUnit1 = KeyBindings$.MODULE$.showMaterialCosts() ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  }
/*    */     
/* 44 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */   
/*    */   public EnumRarity func_77613_e(ItemStack stack) { EnumRarity enumRarity;
/* 48 */     Block block = block();
/* 49 */     if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; enumRarity = simpleBlock.rarity(stack); }
/* 50 */     else { enumRarity = EnumRarity.common; }
/*    */     
/*    */     return enumRarity; } public int func_77647_b(int itemDamage) {
/* 53 */     return itemDamage;
/*    */   } public String func_77653_i(ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   4: ldc 'print'
/*    */     //   6: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   9: astore_2
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 22
/*    */     //   14: pop
/*    */     //   15: aload_2
/*    */     //   16: ifnull -> 29
/*    */     //   19: goto -> 60
/*    */     //   22: aload_2
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 60
/*    */     //   29: new li/cil/oc/common/item/data/PrintData
/*    */     //   32: dup
/*    */     //   33: aload_1
/*    */     //   34: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   37: astore_3
/*    */     //   38: aload_3
/*    */     //   39: invokevirtual label : ()Lscala/Option;
/*    */     //   42: new li/cil/oc/common/block/Item$$anonfun$getItemStackDisplayName$1
/*    */     //   45: dup
/*    */     //   46: aload_0
/*    */     //   47: aload_1
/*    */     //   48: invokespecial <init> : (Lli/cil/oc/common/block/Item;Lnet/minecraft/item/ItemStack;)V
/*    */     //   51: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*    */     //   54: checkcast java/lang/String
/*    */     //   57: goto -> 65
/*    */     //   60: aload_0
/*    */     //   61: aload_1
/*    */     //   62: invokespecial func_77653_i : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */     //   65: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     //   #57	-> 29
/*    */     //   #58	-> 38
/*    */     //   #60	-> 60
/*    */     //   #56	-> 65
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	66	0	this	Lli/cil/oc/common/block/Item;
/*    */     //   0	66	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   38	19	3	data	Lli/cil/oc/common/item/data/PrintData;
/*    */   } public final class Item$$anonfun$getItemStackDisplayName$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final String apply() {
/* 58 */       return this.$outer.li$cil$oc$common$block$Item$$super$getItemStackDisplayName(this.stack$1);
/*    */     } private final ItemStack stack$1;
/*    */     public Item$$anonfun$getItemStackDisplayName$1(Item $outer, ItemStack stack$1) {} }
/*    */   public String func_77658_a() {
/*    */     String str;
/* 63 */     Block block = block();
/* 64 */     if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; str = simpleBlock.func_149739_a(); }
/* 65 */     else { str = (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tile").toString(); }
/*    */     
/*    */     return str;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int func_82790_a(ItemStack stack, int v) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   4: ldc 'cable'
/*    */     //   6: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   9: astore_3
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 22
/*    */     //   14: pop
/*    */     //   15: aload_3
/*    */     //   16: ifnull -> 29
/*    */     //   19: goto -> 58
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 58
/*    */     //   29: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*    */     //   32: aload_1
/*    */     //   33: invokevirtual hasColor : (Lnet/minecraft/item/ItemStack;)Z
/*    */     //   36: ifeq -> 49
/*    */     //   39: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*    */     //   42: aload_1
/*    */     //   43: invokevirtual getColor : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   46: goto -> 64
/*    */     //   49: getstatic li/cil/oc/util/Color$.MODULE$ : Lli/cil/oc/util/Color$;
/*    */     //   52: invokevirtual LightGray : ()I
/*    */     //   55: goto -> 64
/*    */     //   58: aload_0
/*    */     //   59: aload_1
/*    */     //   60: iload_2
/*    */     //   61: invokespecial func_82790_a : (Lnet/minecraft/item/ItemStack;I)I
/*    */     //   64: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #70	-> 0
/*    */     //   #71	-> 29
/*    */     //   #72	-> 39
/*    */     //   #74	-> 49
/*    */     //   #76	-> 58
/*    */     //   #70	-> 64
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	65	0	this	Lli/cil/oc/common/block/Item;
/*    */     //   0	65	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   0	65	2	v	I
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isBookEnchantable(ItemStack a, ItemStack b) {
/* 79 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: getfield field_71075_bZ : Lnet/minecraft/entity/player/PlayerCapabilities;
/*    */     //   4: getfield field_75098_d : Z
/*    */     //   7: ifeq -> 46
/*    */     //   10: aload_1
/*    */     //   11: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   14: ldc 'robot'
/*    */     //   16: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   19: astore #13
/*    */     //   21: dup
/*    */     //   22: ifnonnull -> 34
/*    */     //   25: pop
/*    */     //   26: aload #13
/*    */     //   28: ifnull -> 42
/*    */     //   31: goto -> 46
/*    */     //   34: aload #13
/*    */     //   36: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   39: ifeq -> 46
/*    */     //   42: iconst_1
/*    */     //   43: goto -> 47
/*    */     //   46: iconst_0
/*    */     //   47: istore #12
/*    */     //   49: iload #12
/*    */     //   51: ifeq -> 68
/*    */     //   54: new li/cil/oc/common/item/data/RobotData
/*    */     //   57: dup
/*    */     //   58: aload_1
/*    */     //   59: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   62: invokevirtual copyItemStack : ()Lnet/minecraft/item/ItemStack;
/*    */     //   65: goto -> 69
/*    */     //   68: aload_1
/*    */     //   69: astore #14
/*    */     //   71: aload_0
/*    */     //   72: aload #14
/*    */     //   74: aload_2
/*    */     //   75: aload_3
/*    */     //   76: iload #4
/*    */     //   78: iload #5
/*    */     //   80: iload #6
/*    */     //   82: iload #7
/*    */     //   84: fload #8
/*    */     //   86: fload #9
/*    */     //   88: fload #10
/*    */     //   90: iload #11
/*    */     //   92: invokespecial placeBlockAt : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;IIIIFFFI)Z
/*    */     //   95: ifeq -> 288
/*    */     //   98: aload_3
/*    */     //   99: iload #4
/*    */     //   101: iload #5
/*    */     //   103: iload #6
/*    */     //   105: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   108: astore #15
/*    */     //   110: aload #15
/*    */     //   112: instanceof li/cil/oc/common/tileentity/Keyboard
/*    */     //   115: ifeq -> 150
/*    */     //   118: aload #15
/*    */     //   120: checkcast li/cil/oc/common/tileentity/Keyboard
/*    */     //   123: astore #16
/*    */     //   125: aload #16
/*    */     //   127: aload_2
/*    */     //   128: invokevirtual setFromEntityPitchAndYaw : (Lnet/minecraft/entity/Entity;)Z
/*    */     //   131: pop
/*    */     //   132: aload #16
/*    */     //   134: iload #7
/*    */     //   136: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   139: invokevirtual setFromFacing : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*    */     //   142: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   145: astore #17
/*    */     //   147: goto -> 281
/*    */     //   150: aload #15
/*    */     //   152: instanceof li/cil/oc/common/tileentity/traits/Rotatable
/*    */     //   155: ifeq -> 276
/*    */     //   158: aload #15
/*    */     //   160: checkcast li/cil/oc/common/tileentity/traits/Rotatable
/*    */     //   163: astore #18
/*    */     //   165: aload #18
/*    */     //   167: aload_2
/*    */     //   168: invokeinterface setFromEntityPitchAndYaw : (Lnet/minecraft/entity/Entity;)Z
/*    */     //   173: pop
/*    */     //   174: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   177: aload #18
/*    */     //   179: invokeinterface validFacings : ()[Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   184: checkcast [Ljava/lang/Object;
/*    */     //   187: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   190: aload #18
/*    */     //   192: invokeinterface pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   197: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   202: ifne -> 247
/*    */     //   205: aload #18
/*    */     //   207: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   210: aload #18
/*    */     //   212: invokeinterface validFacings : ()[Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   217: checkcast [Ljava/lang/Object;
/*    */     //   220: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   223: invokeinterface headOption : ()Lscala/Option;
/*    */     //   228: new li/cil/oc/common/block/Item$$anonfun$placeBlockAt$1
/*    */     //   231: dup
/*    */     //   232: aload_0
/*    */     //   233: invokespecial <init> : (Lli/cil/oc/common/block/Item;)V
/*    */     //   236: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*    */     //   239: checkcast net/minecraftforge/common/util/ForgeDirection
/*    */     //   242: invokeinterface pitch_$eq : (Lnet/minecraftforge/common/util/ForgeDirection;)V
/*    */     //   247: aload #18
/*    */     //   249: instanceof li/cil/oc/common/tileentity/RobotProxy
/*    */     //   252: ifeq -> 261
/*    */     //   255: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   258: goto -> 271
/*    */     //   261: aload #18
/*    */     //   263: invokeinterface invertRotation : ()Z
/*    */     //   268: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   271: astore #17
/*    */     //   273: goto -> 281
/*    */     //   276: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   279: astore #17
/*    */     //   281: aload #17
/*    */     //   283: pop
/*    */     //   284: iconst_1
/*    */     //   285: goto -> 289
/*    */     //   288: iconst_0
/*    */     //   289: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #85	-> 0
/*    */     //   #86	-> 49
/*    */     //   #87	-> 71
/*    */     //   #89	-> 98
/*    */     //   #90	-> 110
/*    */     //   #91	-> 125
/*    */     //   #92	-> 132
/*    */     //   #90	-> 145
/*    */     //   #93	-> 150
/*    */     //   #94	-> 165
/*    */     //   #95	-> 174
/*    */     //   #96	-> 205
/*    */     //   #98	-> 247
/*    */     //   #99	-> 261
/*    */     //   #93	-> 271
/*    */     //   #101	-> 276
/*    */     //   #89	-> 281
/*    */     //   #103	-> 284
/*    */     //   #105	-> 288
/*    */     //   #81	-> 289
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	290	0	this	Lli/cil/oc/common/block/Item;
/*    */     //   0	290	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   0	290	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   0	290	3	world	Lnet/minecraft/world/World;
/*    */     //   0	290	4	x	I
/*    */     //   0	290	5	y	I
/*    */     //   0	290	6	z	I
/*    */     //   0	290	7	side	I
/*    */     //   0	290	8	hitX	F
/*    */     //   0	290	9	hitY	F
/*    */     //   0	290	10	hitZ	F
/*    */     //   0	290	11	metadata	I
/*    */     //   49	241	12	needsCopying	Z
/*    */     //   71	219	14	stackToUse	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public final class Item$$anonfun$placeBlockAt$1
/*    */     extends AbstractFunction0<ForgeDirection>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */     
/*    */     public final ForgeDirection apply() {
/* 96 */       return ForgeDirection.NORTH;
/*    */     }
/*    */     
/*    */     public Item$$anonfun$placeBlockAt$1(Item $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */