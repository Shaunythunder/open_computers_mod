/*     */ package li.cil.oc.common.template;
/*     */ 
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ec!B\001\003\003\003i!\001\003+f[Bd\027\r^3\013\005\r!\021\001\003;f[Bd\027\r^3\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\001\001\b\021\005=\021R\"\001\t\013\003E\tQa]2bY\006L!a\005\t\003\r\005s\027PU3g\021\025)\002\001\"\001\027\003\031a\024N\\5u}Q\tq\003\005\002\031\0015\t!\001C\004\033\001\t\007I\021C\016\002'M,xmZ3ti\026$7i\\7q_:,g\016^:\026\003q\0012aD\017 \023\tq\002CA\003BeJ\f\027\020\005\003\020A\tR\023BA\021\021\005\031!V\017\0357feA\0211\005K\007\002I)\021QEJ\001\005Y\006twMC\001(\003\021Q\027M^1\n\005%\"#AB*ue&tw\r\005\003\020W5:\024B\001\027\021\005%1UO\\2uS>t\027\007\005\002/k5\tqF\003\0021c\005I\021N\034<f]R|'/\037\006\003eM\n\021\"\\5oK\016\024\030M\032;\013\003Q\n1A\\3u\023\t1tF\001\006J\023:4XM\034;pef\004\"a\004\035\n\005e\002\"a\002\"p_2,\027M\034\005\007w\001\001\013\021\002\017\002)M,xmZ3ti\026$7i\\7q_:,g\016^:!\021\025i\004A\"\005?\003%Awn\035;DY\006\0348/F\001@a\t\001\025\nE\002B\t\036s!a\004\"\n\005\r\003\022A\002)sK\022,g-\003\002F\r\n)1\t\\1tg*\0211\t\005\t\003\021&c\001\001B\005Ky\005\005\t\021!B\001\027\n\031q\fJ\031\022\0051{\005CA\bN\023\tq\005CA\004O_RD\027N\\4\021\005A+V\"A)\013\005I\033\026a\0028fi^|'o\033\006\003)\032\t1!\0319j\023\t1\026KA\bF]ZL'o\0348nK:$\bj\\:u\021\025A\006\001\"\005Z\003A1\030\r\\5eCR,7i\\7qkR,'\017\006\002[7B\031q\"\b\b\t\013A:\006\031A\027\t\013u\003A\021\0030\002\r\025D\030n\035;t)\r9t\f\031\005\006aq\003\r!\f\005\006Cr\003\rAY\001\002aB!qbK28!\t!w-D\001f\025\t1\027'\001\003ji\026l\027B\0015f\005%IE/Z7Ti\006\0347\016C\003k\001\021E1.\001\004iCN\034\005+\026\013\003o1DQ\001M5A\0025BQA\034\001\005\022=\fa\001[1t%\006kECA\034q\021\025\001T\0161\001.\021\025\021\b\001\"\005t\003-\021X-];je\026\034(+Q'\025\005]\"\b\"\002\031r\001\004i\003\"\002<\001\t#9\030\001\0045bg\016{W\016]8oK:$HC\001={)\t9\024\020C\0031k\002\007Q\006C\003|k\002\007A0\001\003oC6,\007CA!~\023\tIc\t\003\004\000\001\021E\021\021A\001\rQ\006\034\030J\034<f]R|'/\037\013\004o\005\r\001\"\002\031\001\004i\003bBA\004\001\021E\021\021B\001\016Q\006\034h)\0337f'f\034H/Z7\025\007]\nY\001\003\0041\003\013\001\r!\f\005\b\003\037\001A\021CA\t\003)\031w.\0349mKbLG/\037\013\005\003'\tI\002E\002\020\003+I1!a\006\021\005\rIe\016\036\005\007a\0055\001\031A\027\t\017\005u\001\001\"\005\002 \005iQ.\031=D_6\004H.\032=jif$B!a\005\002\"!1\001'a\007A\0025Bq!!\n\001\r#\t9#\001\005dCN,G+[3s)\021\t\031\"!\013\t\rA\n\031\0031\001.\021\035\ti\003\001C\t\003_\ta\001^8QC&\024H\003BA\031\003'\002r!a\r\002Jq\fi%\004\002\0026)!\021qGA\035\003\025!X\017\0357f\025\021\tY$!\020\002\0131\fgnZ\032\013\t\005}\022\021I\001\bG>lWn\0348t\025\021\t\031%!\022\002\r\005\004\030m\0315f\025\t\t9%A\002pe\036LA!a\023\0026\t!\001+Y5s!\r\031\023qJ\005\004\003#\"#aB%oi\026<WM\035\005\t\003+\nY\0031\001\002X\005\tA\017E\003\020Aq\f\031\002")
/*     */ public abstract class Template {
/*     */   private final Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents;
/*     */   
/*  17 */   public Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents() { return this.suggestedComponents; } public abstract Class<? extends EnvironmentHost> hostClass(); public final class Template$$anonfun$2 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  18 */     public final boolean apply(IInventory inventory) { return this.$outer.hasComponent("eeprom", inventory); } public Template$$anonfun$2(Template $outer) {} } public final class Template$$anonfun$3 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  19 */     public final boolean apply(IInventory inventory) { return this.$outer.hasComponent("screen1", inventory); } public Template$$anonfun$3(Template $outer) {} } public final class Template$$anonfun$4 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  20 */     public final boolean apply(IInventory inventory) { return this.$outer.hasComponent("keyboard", inventory); } public Template$$anonfun$4(Template $outer) {} } public final class Template$$anonfun$5 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  21 */     public final boolean apply(IInventory inventory) { (new String[6])[0] = 
/*  22 */         "apuCreative";
/*  23 */       (new String[6])[1] = "apu1";
/*  24 */       (new String[6])[2] = "apu2";
/*  25 */       (new String[6])[3] = "graphicsCard1";
/*  26 */       (new String[6])[4] = "graphicsCard2";
/*  27 */       (new String[6])[5] = "graphicsCard3";
/*  28 */       return Predef$.MODULE$.refArrayOps((Object[])new String[6]).exists((Function1)new Template$$anonfun$5$$anonfun$apply$1(this, inventory)); } public Template$$anonfun$5(Template $outer) {} public final class Template$$anonfun$5$$anonfun$apply$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$6; public final boolean apply(String name) { return this.$outer.li$cil$oc$common$template$Template$$anonfun$$$outer().hasComponent(name, this.inventory$6); } public Template$$anonfun$5$$anonfun$apply$1(Template$$anonfun$5 $outer, IInventory inventory$6) {} } } public final class Template$$anonfun$6 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  29 */     public final boolean apply(IInventory inventory) { return this.$outer.hasInventory(inventory); } public Template$$anonfun$6(Template $outer) {} }
/*  30 */    public final class Template$$anonfun$7 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { return this.$outer.hasFileSystem(inventory); } public Template$$anonfun$7(Template $outer) {} } public final class Template$$anonfun$validateComputer$1 extends AbstractFunction1<Tuple2<String, Function1<IInventory, Object>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; }
/*     */       else
/*     */       { bool = false; }
/*     */        return bool; } public Template$$anonfun$validateComputer$1(Template $outer) {}
/*  35 */   } public Object[] validateComputer(IInventory inventory) { boolean hasCase = (caseTier(inventory) != -1);
/*  36 */     boolean hasCPU = hasCPU(inventory);
/*  37 */     boolean hasRAM = hasRAM(inventory);
/*  38 */     boolean requiresRAM = requiresRAM(inventory);
/*  39 */     int complexity = complexity(inventory);
/*  40 */     int maxComplexity = maxComplexity(inventory);
/*     */     
/*  42 */     boolean valid = (hasCase && hasCPU && (hasRAM || !requiresRAM) && complexity <= maxComplexity);
/*     */     
/*  44 */     IChatComponent progress = 
/*  45 */       hasCPU ? (
/*  46 */       (!hasRAM && requiresRAM) ? (IChatComponent)Localization$Assembler$.MODULE$.InsertRAM() : 
/*  47 */       Localization$Assembler$.MODULE$.Complexity(complexity, maxComplexity)) : (IChatComponent)Localization$Assembler$.MODULE$.InsertCPU();
/*     */     
/*  49 */     ArrayBuffer warnings = (ArrayBuffer)ArrayBuffer$.MODULE$.empty();
/*  50 */     Predef$.MODULE$.refArrayOps((Object[])suggestedComponents()).withFilter((Function1)new Template$$anonfun$validateComputer$1(this)).foreach((Function1)new Template$$anonfun$validateComputer$2(this, inventory, warnings));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     if (warnings.nonEmpty()) {
/*  56 */       (new IChatComponent[1])[0] = (IChatComponent)Localization$Assembler$.MODULE$.Warnings(); warnings.prepend((Seq)Predef$.MODULE$.wrapRefArray((Object[])new IChatComponent[1]));
/*     */     } 
/*     */     
/*  59 */     return new Object[] { Predef$.MODULE$.boolean2Boolean(valid), progress, warnings.toArray(ClassTag$.MODULE$.apply(IChatComponent.class)) }; }
/*     */   public final class Template$$anonfun$validateComputer$2 extends AbstractFunction1<Tuple2<String, Function1<IInventory, Object>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$2; private final ArrayBuffer warnings$1; public final Object apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) {
/*     */         String name = (String)tuple2._1(); Function1 check = (Function1)tuple2._2(); return BoxesRunTime.unboxToBoolean(check.apply(this.inventory$2)) ? BoxedUnit.UNIT : this.warnings$1.$plus$eq(Localization$Assembler$.MODULE$.Warning(name));
/*  63 */       }  throw new MatchError(tuple2); } public Template$$anonfun$validateComputer$2(Template $outer, IInventory inventory$2, ArrayBuffer warnings$1) {} } public boolean exists(IInventory inventory, Function1 p) { return RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).exists((Function1)new Template$$anonfun$exists$1(this, inventory, p)); } public final class Template$$anonfun$exists$1 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$1; private final Function1 p$1; public final boolean apply(int slot) { return apply$mcZI$sp(slot); } public boolean apply$mcZI$sp(int slot) { boolean bool; Option option = Option$.MODULE$.apply(this.inventory$1.func_70301_a(slot));
/*  64 */       if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); bool = BoxesRunTime.unboxToBoolean(this.p$1.apply(stack)); }
/*  65 */       else { bool = false; }
/*     */       
/*     */       return bool; }
/*     */      public Template$$anonfun$exists$1(Template $outer, IInventory inventory$1, Function1 p$1) {} }
/*  69 */   public boolean hasCPU(IInventory inventory) { return exists(inventory, (Function1<ItemStack, Object>)new Template$$anonfun$hasCPU$1(this)); } public final class Template$$anonfun$hasCPU$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) { boolean bool; Item item = Driver.driverFor(x$2, this.$outer.hostClass());
/*  70 */       if (item instanceof Processor) { bool = true; }
/*  71 */       else { bool = false; }
/*     */       
/*     */       return bool; } public Template$$anonfun$hasCPU$1(Template $outer) {} }
/*  74 */   public boolean hasRAM(IInventory inventory) { return exists(inventory, (Function1<ItemStack, Object>)new Template$$anonfun$hasRAM$1(this)); } public final class Template$$anonfun$hasRAM$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$3) { boolean bool; Item item = Driver.driverFor(x$3, this.$outer.hostClass());
/*  75 */       if (item instanceof li.cil.oc.api.driver.item.Memory) { bool = true; }
/*  76 */       else { bool = false; }
/*     */       
/*     */       return bool; } public Template$$anonfun$hasRAM$1(Template $outer) {} }
/*  79 */   public boolean requiresRAM(IInventory inventory) { return 
/*     */       
/*  81 */       !((IterableLike)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).map((Function1)new Template$$anonfun$requiresRAM$1(this, inventory), IndexedSeq$.MODULE$.canBuildFrom())).exists((Function1)new Template$$anonfun$requiresRAM$2(this)); } public final class Template$$anonfun$requiresRAM$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$5; public final ItemStack apply(int x$1) { return this.inventory$5.func_70301_a(x$1); } public Template$$anonfun$requiresRAM$1(Template $outer, IInventory inventory$5) {} } public final class Template$$anonfun$requiresRAM$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { boolean bool; Item item = Driver.driverFor(stack, this.$outer.hostClass());
/*  82 */       if (item instanceof Processor) { Processor processor = (Processor)item;
/*  83 */         Class architecture = processor.architecture(stack);
/*  84 */         bool = (architecture == null || architecture.getAnnotation(Architecture.NoMemoryRequirements.class) == null) ? false : true; }
/*  85 */       else { bool = false; }
/*     */       
/*     */       return bool; } public Template$$anonfun$requiresRAM$2(Template $outer) {} } public boolean hasComponent(String name, IInventory inventory) {
/*  88 */     return exists(inventory, (Function1<ItemStack, Object>)new Template$$anonfun$hasComponent$1(this, name));
/*     */   } public final class Template$$anonfun$hasComponent$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String name$1; public final boolean apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   3: aload_1
/*     */       //   4: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   7: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   10: astore_2
/*     */       //   11: aload_2
/*     */       //   12: instanceof scala/Some
/*     */       //   15: ifeq -> 76
/*     */       //   18: aload_2
/*     */       //   19: checkcast scala/Some
/*     */       //   22: astore_3
/*     */       //   23: aload_3
/*     */       //   24: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   27: checkcast li/cil/oc/api/detail/ItemInfo
/*     */       //   30: astore #4
/*     */       //   32: aload #4
/*     */       //   34: invokeinterface name : ()Ljava/lang/String;
/*     */       //   39: aload_0
/*     */       //   40: getfield name$1 : Ljava/lang/String;
/*     */       //   43: astore #6
/*     */       //   45: dup
/*     */       //   46: ifnonnull -> 58
/*     */       //   49: pop
/*     */       //   50: aload #6
/*     */       //   52: ifnull -> 66
/*     */       //   55: goto -> 70
/*     */       //   58: aload #6
/*     */       //   60: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   63: ifeq -> 70
/*     */       //   66: iconst_1
/*     */       //   67: goto -> 71
/*     */       //   70: iconst_0
/*     */       //   71: istore #5
/*     */       //   73: goto -> 79
/*     */       //   76: iconst_0
/*     */       //   77: istore #5
/*     */       //   79: iload #5
/*     */       //   81: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #88	-> 0
/*     */       //   #89	-> 11
/*     */       //   #90	-> 76
/*     */       //   #88	-> 79
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	82	0	this	Lli/cil/oc/common/template/Template$$anonfun$hasComponent$1;
/*     */       //   0	82	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   32	50	4	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */     } public Template$$anonfun$hasComponent$1(Template $outer, String name$1) {} }
/*  93 */   public boolean hasInventory(IInventory inventory) { return exists(inventory, (Function1<ItemStack, Object>)new Template$$anonfun$hasInventory$1(this)); } public final class Template$$anonfun$hasInventory$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$4) { boolean bool; Item item = Driver.driverFor(x$4, this.$outer.hostClass());
/*  94 */       if (item instanceof li.cil.oc.api.driver.item.Inventory) { bool = true; }
/*  95 */       else { bool = false; }
/*     */       
/*     */       return bool; } public Template$$anonfun$hasInventory$1(Template $outer) {} } public boolean hasFileSystem(IInventory inventory) {
/*  98 */     return exists(inventory, (Function1<ItemStack, Object>)new Template$$anonfun$hasFileSystem$1(this));
/*     */   } public final class Template$$anonfun$hasFileSystem$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   3: aload_1
/*     */       //   4: aload_0
/*     */       //   5: getfield $outer : Lli/cil/oc/common/template/Template;
/*     */       //   8: invokevirtual hostClass : ()Ljava/lang/Class;
/*     */       //   11: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */       //   14: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   17: astore_2
/*     */       //   18: aload_2
/*     */       //   19: instanceof scala/Some
/*     */       //   22: ifeq -> 123
/*     */       //   25: aload_2
/*     */       //   26: checkcast scala/Some
/*     */       //   29: astore_3
/*     */       //   30: aload_3
/*     */       //   31: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   34: checkcast li/cil/oc/api/driver/Item
/*     */       //   37: astore #4
/*     */       //   39: aload #4
/*     */       //   41: aload_1
/*     */       //   42: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */       //   47: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */       //   50: invokevirtual Floppy : ()Ljava/lang/String;
/*     */       //   53: astore #6
/*     */       //   55: dup
/*     */       //   56: ifnonnull -> 68
/*     */       //   59: pop
/*     */       //   60: aload #6
/*     */       //   62: ifnull -> 113
/*     */       //   65: goto -> 76
/*     */       //   68: aload #6
/*     */       //   70: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   73: ifne -> 113
/*     */       //   76: aload #4
/*     */       //   78: aload_1
/*     */       //   79: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */       //   84: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */       //   87: invokevirtual HDD : ()Ljava/lang/String;
/*     */       //   90: astore #7
/*     */       //   92: dup
/*     */       //   93: ifnonnull -> 105
/*     */       //   96: pop
/*     */       //   97: aload #7
/*     */       //   99: ifnull -> 113
/*     */       //   102: goto -> 117
/*     */       //   105: aload #7
/*     */       //   107: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   110: ifeq -> 117
/*     */       //   113: iconst_1
/*     */       //   114: goto -> 118
/*     */       //   117: iconst_0
/*     */       //   118: istore #5
/*     */       //   120: goto -> 126
/*     */       //   123: iconst_0
/*     */       //   124: istore #5
/*     */       //   126: iload #5
/*     */       //   128: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #98	-> 0
/*     */       //   #99	-> 18
/*     */       //   #100	-> 123
/*     */       //   #98	-> 126
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	129	0	this	Lli/cil/oc/common/template/Template$$anonfun$hasFileSystem$1;
/*     */       //   0	129	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   39	90	4	driver	Lli/cil/oc/api/driver/Item;
/*     */     }
/*     */     public Template$$anonfun$hasFileSystem$1(Template $outer) {} }
/* 104 */   public int complexity(IInventory inventory) { IntRef acc = IntRef.create(0); RichInt$.MODULE$
/* 105 */       .until$extension0(Predef$.MODULE$.intWrapper(1), inventory.func_70302_i_()).foreach$mVc$sp((Function1)new Template$$anonfun$complexity$1(this, inventory, acc));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     return acc.elem; } public final class Template$$anonfun$complexity$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$3; private final IntRef acc$1; public final void apply(int slot) { apply$mcVI$sp(slot); }
/*     */     public Template$$anonfun$complexity$1(Template $outer, IInventory inventory$3, IntRef acc$1) {}
/*     */     public void apply$mcVI$sp(int slot) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield inventory$3 : Lnet/minecraft/inventory/IInventory;
/*     */       //   4: iload_1
/*     */       //   5: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */       //   10: astore_2
/*     */       //   11: aload_0
/*     */       //   12: getfield acc$1 : Lscala/runtime/IntRef;
/*     */       //   15: aload_0
/*     */       //   16: getfield acc$1 : Lscala/runtime/IntRef;
/*     */       //   19: getfield elem : I
/*     */       //   22: iconst_0
/*     */       //   23: istore_3
/*     */       //   24: aconst_null
/*     */       //   25: astore #4
/*     */       //   27: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   30: aload_2
/*     */       //   31: aload_0
/*     */       //   32: getfield $outer : Lli/cil/oc/common/template/Template;
/*     */       //   35: invokevirtual hostClass : ()Ljava/lang/Class;
/*     */       //   38: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Lli/cil/oc/api/driver/Item;
/*     */       //   41: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   44: astore #5
/*     */       //   46: aload #5
/*     */       //   48: instanceof scala/Some
/*     */       //   51: ifeq -> 87
/*     */       //   54: iconst_1
/*     */       //   55: istore_3
/*     */       //   56: aload #5
/*     */       //   58: checkcast scala/Some
/*     */       //   61: astore #4
/*     */       //   63: aload #4
/*     */       //   65: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   68: checkcast li/cil/oc/api/driver/Item
/*     */       //   71: astore #6
/*     */       //   73: aload #6
/*     */       //   75: instanceof li/cil/oc/api/driver/item/Processor
/*     */       //   78: ifeq -> 87
/*     */       //   81: iconst_0
/*     */       //   82: istore #7
/*     */       //   84: goto -> 202
/*     */       //   87: iload_3
/*     */       //   88: ifeq -> 133
/*     */       //   91: aload #4
/*     */       //   93: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   96: checkcast li/cil/oc/api/driver/Item
/*     */       //   99: astore #8
/*     */       //   101: aload #8
/*     */       //   103: instanceof li/cil/oc/api/driver/item/Container
/*     */       //   106: ifeq -> 133
/*     */       //   109: aload #8
/*     */       //   111: checkcast li/cil/oc/api/driver/item/Container
/*     */       //   114: astore #9
/*     */       //   116: iconst_1
/*     */       //   117: aload #9
/*     */       //   119: aload_2
/*     */       //   120: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */       //   125: iadd
/*     */       //   126: iconst_2
/*     */       //   127: imul
/*     */       //   128: istore #7
/*     */       //   130: goto -> 202
/*     */       //   133: iload_3
/*     */       //   134: ifeq -> 199
/*     */       //   137: aload #4
/*     */       //   139: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   142: checkcast li/cil/oc/api/driver/Item
/*     */       //   145: astore #10
/*     */       //   147: aload #10
/*     */       //   149: aload_2
/*     */       //   150: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*     */       //   155: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */       //   158: invokevirtual EEPROM : ()Ljava/lang/String;
/*     */       //   161: astore #11
/*     */       //   163: dup
/*     */       //   164: ifnonnull -> 176
/*     */       //   167: pop
/*     */       //   168: aload #11
/*     */       //   170: ifnull -> 199
/*     */       //   173: goto -> 184
/*     */       //   176: aload #11
/*     */       //   178: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   181: ifne -> 199
/*     */       //   184: iconst_1
/*     */       //   185: aload #10
/*     */       //   187: aload_2
/*     */       //   188: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*     */       //   193: iadd
/*     */       //   194: istore #7
/*     */       //   196: goto -> 202
/*     */       //   199: iconst_0
/*     */       //   200: istore #7
/*     */       //   202: iload #7
/*     */       //   204: iadd
/*     */       //   205: putfield elem : I
/*     */       //   208: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #106	-> 0
/*     */       //   #107	-> 11
/*     */       //   #108	-> 22
/*     */       //   #107	-> 27
/*     */       //   #108	-> 46
/*     */       //   #107	-> 87
/*     */       //   #109	-> 91
/*     */       //   #107	-> 133
/*     */       //   #110	-> 137
/*     */       //   #111	-> 199
/*     */       //   #107	-> 202
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	209	0	this	Lli/cil/oc/common/template/Template$$anonfun$complexity$1;
/*     */       //   0	209	1	slot	I
/*     */       //   11	197	2	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   73	136	6	driver	Lli/cil/oc/api/driver/Item;
/*     */       //   101	108	8	driver	Lli/cil/oc/api/driver/Item;
/*     */       //   147	62	10	driver	Lli/cil/oc/api/driver/Item; } }
/* 118 */   public int maxComplexity(IInventory inventory) { int caseTier = caseTier(inventory);
/* 119 */     int cpuTier = BoxesRunTime.unboxToInt(RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).foldRight(BoxesRunTime.boxToInteger(0), (Function2)new Template$$anonfun$1(this, inventory)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     return (caseTier >= 0 && cpuTier >= 0) ? (
/* 127 */       Settings$.MODULE$.deviceComplexityByTier()[caseTier] - (package$.MODULE$.min(2, caseTier) - cpuTier) * 6) : 
/*     */       
/* 129 */       0; } public abstract int caseTier(IInventory paramIInventory); public final class Template$$anonfun$1 extends AbstractFunction2.mcIII.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$4; public final int apply(int slot, int acc) { return apply$mcIII$sp(slot, acc); } public Template$$anonfun$1(Template $outer, IInventory inventory$4) {}
/*     */     public int apply$mcIII$sp(int slot, int acc) { byte b; ItemStack stack = this.inventory$4.func_70301_a(slot); Item item = Driver.driverFor(stack, this.$outer.hostClass()); if (item instanceof Processor) { Processor processor = (Processor)item; b = processor.tier(stack); }
/*     */       else
/*     */       { b = 0; }
/*     */        return acc + b; } }
/* 135 */   public Pair<String, Integer> toPair(Tuple2 t) { return (t == null) ? null : 
/* 136 */       Pair.of(t._1(), Predef$.MODULE$.int2Integer(t._2$mcI$sp())); }
/*     */ 
/*     */   
/*     */   public Template() {
/*     */     (new Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("BIOS"), new Template$$anonfun$2(this));
/*     */     (new Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("Screen"), new Template$$anonfun$3(this));
/*     */     (new Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("Keyboard"), new Template$$anonfun$4(this));
/*     */     (new Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("GraphicsCard"), new Template$$anonfun$5(this));
/*     */     (new Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("Inventory"), new Template$$anonfun$6(this));
/*     */     (new Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("OS"), new Template$$anonfun$7(this));
/*     */     this.suggestedComponents = (Tuple2<String, Function1<IInventory, Object>>[])new Tuple2[6];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\Template.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */