/*    */ package li.cil.oc.common.template;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ import scala.Array$;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.SeqLike;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t5r!B\001\003\021\003i\021AE!tg\026l'\r\\3s)\026l\007\017\\1uKNT!a\001\003\002\021Q,W\016\0357bi\026T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\023\003N\034X-\0342mKJ$V-\0349mCR,7o\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\001;\0051aj\\*m_R,\022A\b\t\003?\001j\021a\004\004\005C=\001!E\001\003TY>$8C\001\021\023\021!!\003E!b\001\n\003)\023\001B6j]\022,\022A\n\t\003O)r!a\005\025\n\005%\"\022A\002)sK\022,g-\003\002,Y\t11\013\036:j]\036T!!\013\013\t\0219\002#\021!Q\001\n\031\nQa[5oI\002B\001\002\r\021\003\006\004%\t!M\001\005i&,'/F\0013!\t\0312'\003\0025)\t\031\021J\034;\t\021Y\002#\021!Q\001\nI\nQ\001^5fe\002B\001\002\017\021\003\006\004%\t!O\001\nm\006d\027\016Z1u_J,\022A\017\t\004'mj\024B\001\037\025\005\031y\005\017^5p]B\021a(R\007\002)\021\001)Q\001\be\0264G.Z2u\025\t\0215)\001\003mC:<'\"\001#\002\t)\fg/Y\005\003\r~\022a!T3uQ>$\007\002\003%!\005\003\005\013\021\002\036\002\025Y\fG.\0333bi>\024\b\005\003\005KA\t\025\r\021\"\001L\003%Awn\035;DY\006\0348/F\001M!\r\0312(\024\031\003\035N\0032aJ(R\023\t\001FFA\003DY\006\0348\017\005\002S'2\001A!\003+V\003\003\005\tQ!\001]\005\ryF%\r\005\t-\002\022\t\021)A\005/\006Q\001n\\:u\0072\f7o\035\021\021\007MY\004\f\r\002Z7B\031qe\024.\021\005I[F!\003+V\003\003\005\tQ!\001]#\ti\006\r\005\002\024=&\021q\f\006\002\b\035>$\b.\0338h!\t\tg-D\001c\025\t\031G-A\004oKR<xN]6\013\005\0254\021aA1qS&\021qM\031\002\020\013:4\030N]8o[\026tG\017S8ti\")\021\004\tC\001SR)aD[6m[\")A\005\033a\001M!)\001\007\033a\001e!)\001\b\033a\001u!)!\n\033a\001]B\0311cO81\005A\024\bcA\024PcB\021!K\035\003\n)6\f\t\021!A\003\002qCQ\001\036\021\005\002U\f\001B^1mS\022\fG/\032\013\007mf\fI!!\004\021\005M9\030B\001=\025\005\035\021un\0347fC:DQA_:A\002m\f\021\"\0338wK:$xN]=\021\007q\f)!D\001~\025\tQhPC\002\000\003\003\t\021\"\\5oK\016\024\030M\032;\013\005\005\r\021a\0018fi&\031\021qA?\003\025%KeN^3oi>\024\030\020\003\004\002\fM\004\rAM\001\005g2|G\017C\004\002\020M\004\r!!\005\002\013M$\030mY6\021\t\005M\021\021D\007\003\003+Q1!a\006\003\021IG/Z7\n\t\005m\021Q\003\002\n\023R,Wn\025;bG.Dq!a\b\020A\003%a$A\004O_Ncw\016\036\021\t\023\005\rrB1A\005\n\005\025\022!\003;f[Bd\027\r^3t+\t\t9\003\005\004\002*\005M\022qG\007\003\003WQA!!\f\0020\0059Q.\036;bE2,'bAA\031)\005Q1m\0347mK\016$\030n\0348\n\t\005U\0221\006\002\f\003J\024\030-\037\"vM\032,'\017E\002 \003s1a!a\017\020\001\005u\"\001\003+f[Bd\027\r^3\024\007\005e\"\003C\006\002B\005e\"Q1A\005\002\005\r\023\001C:fY\026\034Go\034:\026\003uB!\"a\022\002:\t\005\t\025!\003>\003%\031X\r\\3di>\024\b\005\003\0069\003s\021)\031!C\001\003\007B\021\002SA\035\005\003\005\013\021B\037\t\027\005=\023\021\bBC\002\023\005\0211I\001\nCN\034X-\0342mKJD!\"a\025\002:\t\005\t\025!\003>\003)\t7o]3nE2,'\017\t\005\f\003/\nID!b\001\n\003\tI&\001\bd_:$\030-\0338feNcw\016^:\026\005\005m\003\003B\n\002^yI1!a\030\025\005\025\t%O]1z\021-\t\031'!\017\003\002\003\006I!a\027\002\037\r|g\016^1j]\026\0248\013\\8ug\002B1\"a\032\002:\t\025\r\021\"\001\002Z\005aQ\017]4sC\022,7\013\\8ug\"Y\0211NA\035\005\003\005\013\021BA.\0035)\bo\032:bI\026\034Fn\034;tA!Y\021qNA\035\005\013\007I\021AA-\0039\031w.\0349p]\026tGo\0257piND1\"a\035\002:\t\005\t\025!\003\002\\\005y1m\\7q_:,g\016^*m_R\034\b\005C\004\032\003s!\t!a\036\025\035\005]\022\021PA>\003{\ny(!!\002\004\"9\021\021IA;\001\004i\004B\002\035\002v\001\007Q\bC\004\002P\005U\004\031A\037\t\021\005]\023Q\017a\001\0037B\001\"a\032\002v\001\007\0211\f\005\t\003_\n)\b1\001\002\\!A\021qQA\035\t\003\tI)\001\004tK2,7\r\036\013\004m\006-\005\002CA\b\003\013\003\r!!\005\t\017Q\fI\004\"\001\002\020R!\021\021SAS!!\031\0221\023<\002\030\006\r\026bAAK)\t1A+\0369mKN\002B!!'\002 6\021\0211\024\006\004\003;s\030\001B;uS2LA!!)\002\034\nq\021j\0215bi\016{W\016]8oK:$\b#B\n\002^\005]\005B\002>\002\016\002\0071\020\003\005\002*\006eB\021AAV\003!\t7o]3nE2,G\003BAW\003s\003raEAX\003#\t\031,C\002\0022R\021a\001V;qY\026\024\004cA\n\0026&\031\021q\027\013\003\r\021{WO\0317f\021\031Q\030q\025a\001w\"A\021QX\b!\002\023\t9#\001\006uK6\004H.\031;fg\002B\021\"!1\020\005\004%I!a1\002\037Q,W\016\0357bi\0264\025\016\034;feN,\"!!2\021\013\005%\0221G\037\t\021\005%w\002)A\005\003\013\f\001\003^3na2\fG/\032$jYR,'o\035\021\t\017\0055w\002\"\001\002P\006\031\021\r\0323\025\t\005E\027q\033\t\004'\005M\027bAAk)\t!QK\\5u\021\035\031\0211\032a\001\0033\004B!a7\002b6\021\021Q\034\006\004\003?t\030a\0018ci&!\0211]Ao\0059q%\t\026+bO\016{W\016]8v]\022Dq!a:\020\t\003\tI/A\005bI\0224\025\016\034;feR!\021\021[Av\021\035\ti/!:A\002\031\na!\\3uQ>$\007bBAD\037\021\005\021\021\037\013\005\003g\f)\020\005\003\024w\005]\002\002CA\b\003_\004\r!!\005\t\017\005ex\002\"\003\002|\006I\001/\031:tKNcw\016\036\013\b=\005u\030q B\003\021!\ty.a>A\002\005e\007\002\003B\001\003o\004\rAa\001\002\031-Lg\016Z(wKJ\024\030\016Z3\021\007MYd\005C\004K\003o\004\rAa\002\021\tMY$\021\002\031\005\005\027\021y\001\005\003(\037\n5\001c\001*\003\020\021Y!\021\003B\003\003\003\005\tQ!\001]\005\ryFE\r\005\b\005+yA\021\002B\f\003=!(/_$fi\"{7\017^\"mCN\034H\003\002B\r\005S\001DAa\007\003&A!1c\017B\017!\031\021yB!\t\003$5\t\021)\003\002Q\003B\031!K!\n\005\027\t\035\"1CA\001\002\003\025\t\001\030\002\003ABqAa\013\003\024\001\007a%\001\003oC6,\007")
/*    */ public final class AssemblerTemplates {
/*    */   public static Option<Template> select(ItemStack paramItemStack) {
/*    */     return AssemblerTemplates$.MODULE$.select(paramItemStack);
/*    */   }
/*    */   
/*    */   public static void addFilter(String paramString) {
/*    */     AssemblerTemplates$.MODULE$.addFilter(paramString);
/*    */   }
/*    */   
/*    */   public static void add(NBTTagCompound paramNBTTagCompound) {
/*    */     AssemblerTemplates$.MODULE$.add(paramNBTTagCompound);
/*    */   }
/*    */   
/*    */   public static Slot NoSlot() {
/*    */     return AssemblerTemplates$.MODULE$.NoSlot();
/*    */   }
/*    */   
/*    */   public final class AssemblerTemplates$$anonfun$1 extends AbstractFunction1<NBTTagCompound, Slot> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 34 */     public final AssemblerTemplates.Slot apply(NBTTagCompound tag) { return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)new Some(Slot$.MODULE$.Container()), this.hostClass$1); } private final Option hostClass$1; public AssemblerTemplates$$anonfun$1(Option hostClass$1) {} } public final class AssemblerTemplates$$anonfun$2 extends AbstractFunction1<NBTTagCompound, Slot> implements Serializable { public static final long serialVersionUID = 0L; private final Option hostClass$1; public final AssemblerTemplates.Slot apply(NBTTagCompound tag) {
/* 35 */       return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)new Some(Slot$.MODULE$.Upgrade()), this.hostClass$1); } public AssemblerTemplates$$anonfun$2(Option hostClass$1) {} } public final class AssemblerTemplates$$anonfun$3 extends AbstractFunction1<NBTTagCompound, Slot> implements Serializable { public static final long serialVersionUID = 0L; private final Option hostClass$1; public final AssemblerTemplates.Slot apply(NBTTagCompound tag) {
/* 36 */       return AssemblerTemplates$.MODULE$.li$cil$oc$common$template$AssemblerTemplates$$parseSlot(tag, (Option<String>)None$.MODULE$, this.hostClass$1);
/*    */     }
/*    */     
/*    */     public AssemblerTemplates$$anonfun$3(Option hostClass$1) {} }
/*    */ 
/*    */   
/*    */   public final class AssemblerTemplates$$anonfun$select$1 extends AbstractFunction1<Method, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ItemStack stack$1;
/*    */     
/* 46 */     public final boolean apply(Method x$1) { return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic(x$1, (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(true))); } public AssemblerTemplates$$anonfun$select$1(ItemStack stack$1) {} } public final class AssemblerTemplates$$anonfun$select$2 extends AbstractFunction1<Template, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(AssemblerTemplates.Template x$2) {
/* 47 */       return x$2.select(this.stack$1);
/*    */     }
/*    */     public AssemblerTemplates$$anonfun$select$2(ItemStack stack$1) {} }
/*    */   public static class Template { private final Method selector; private final Method validator; private final Method assembler; private final AssemblerTemplates.Slot[] containerSlots; private final AssemblerTemplates.Slot[] upgradeSlots; private final AssemblerTemplates.Slot[] componentSlots;
/*    */     
/* 52 */     public Method selector() { return this.selector; } public Template(Method selector, Method validator, Method assembler, AssemblerTemplates.Slot[] containerSlots, AssemblerTemplates.Slot[] upgradeSlots, AssemblerTemplates.Slot[] componentSlots) {}
/* 53 */     public Method validator() { return this.validator; }
/* 54 */     public Method assembler() { return this.assembler; }
/* 55 */     public AssemblerTemplates.Slot[] containerSlots() { return this.containerSlots; }
/* 56 */     public AssemblerTemplates.Slot[] upgradeSlots() { return this.upgradeSlots; }
/* 57 */     public AssemblerTemplates.Slot[] componentSlots() { return this.componentSlots; } public boolean select(ItemStack stack) {
/* 58 */       return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic(selector(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { stack }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     } public Tuple3<Object, IChatComponent, IChatComponent[]> validate(IInventory inventory) {
/* 60 */       Object[] arrayOfObject = (Object[])IMC$.MODULE$.tryInvokeStatic(validator(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { inventory }, ), null);
/* 61 */       Option option1 = Array$.MODULE$.unapplySeq(arrayOfObject); if (!option1.isEmpty() && option1.get() != null && ((SeqLike)option1.get()).lengthCompare(3) == 0) { Object valid = ((SeqLike)option1.get()).apply(0), progress = ((SeqLike)option1.get()).apply(1), warnings = ((SeqLike)option1.get()).apply(2); if (valid instanceof Boolean) { Boolean bool = (Boolean)valid; if (progress instanceof IChatComponent) { IChatComponent iChatComponent = (IChatComponent)progress; if (warnings instanceof IChatComponent[]) { IChatComponent[] arrayOfIChatComponent = (IChatComponent[])warnings; return new Tuple3(BoxesRunTime.boxToBoolean(Predef$.MODULE$.Boolean2boolean(bool)), iChatComponent, arrayOfIChatComponent); }  }  }  }
/* 62 */        Option option2 = Array$.MODULE$.unapplySeq(arrayOfObject); if (!option2.isEmpty() && option2.get() != null && ((SeqLike)option2.get()).lengthCompare(2) == 0) { Object valid = ((SeqLike)option2.get()).apply(0), progress = ((SeqLike)option2.get()).apply(1); if (valid instanceof Boolean) { Boolean bool = (Boolean)valid; if (progress instanceof IChatComponent) { IChatComponent iChatComponent = (IChatComponent)progress; return new Tuple3(BoxesRunTime.boxToBoolean(Predef$.MODULE$.Boolean2boolean(bool)), iChatComponent, Array$.MODULE$.empty(ClassTag$.MODULE$.apply(IChatComponent.class))); }  }  }
/* 63 */        Option option3 = Array$.MODULE$.unapplySeq(arrayOfObject); if (!option3.isEmpty() && option3.get() != null && ((SeqLike)option3.get()).lengthCompare(1) == 0) { Object valid = ((SeqLike)option3.get()).apply(0); if (valid instanceof Boolean) { Boolean bool = (Boolean)valid; return new Tuple3(BoxesRunTime.boxToBoolean(Predef$.MODULE$.Boolean2boolean(bool)), null, Array$.MODULE$.empty(ClassTag$.MODULE$.apply(IChatComponent.class))); }  }
/* 64 */        return new Tuple3(BoxesRunTime.boxToBoolean(false), null, Array$.MODULE$.empty(ClassTag$.MODULE$.apply(IChatComponent.class)));
/*    */     }
/*    */     public Tuple2<ItemStack, Object> assemble(IInventory inventory) {
/* 67 */       Object[] arrayOfObject = (Object[])IMC$.MODULE$.tryInvokeStatic(assembler(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { inventory }, ), null);
/* 68 */       Option option1 = Array$.MODULE$.unapplySeq(arrayOfObject); if (!option1.isEmpty() && option1.get() != null && ((SeqLike)option1.get()).lengthCompare(2) == 0) { Object stack = ((SeqLike)option1.get()).apply(0), energy = ((SeqLike)option1.get()).apply(1); if (stack instanceof ItemStack) { ItemStack itemStack = (ItemStack)stack; if (energy instanceof Number) { Number number = (Number)energy; return new Tuple2(itemStack, BoxesRunTime.boxToDouble(number.doubleValue())); }  }  }
/* 69 */        Option option2 = Array$.MODULE$.unapplySeq(arrayOfObject); if (!option2.isEmpty() && option2.get() != null && ((SeqLike)option2.get()).lengthCompare(1) == 0) { Object stack = ((SeqLike)option2.get()).apply(0); if (stack instanceof ItemStack) { ItemStack itemStack = (ItemStack)stack; return new Tuple2(itemStack, BoxesRunTime.boxToDouble(0.0D)); }  }
/* 70 */        return new Tuple2(null, BoxesRunTime.boxToDouble(0.0D));
/*    */     } }
/*    */   public static class Slot { private final String kind; private final int tier; private final Option<Method> validator; private final Option<Class<? extends EnvironmentHost>> hostClass;
/*    */     
/* 74 */     public String kind() { return this.kind; } public int tier() { return this.tier; } public Option<Method> validator() { return this.validator; } public Option<Class<? extends EnvironmentHost>> hostClass() { return this.hostClass; } public Slot(String kind, int tier, Option<Method> validator, Option<Class<? extends EnvironmentHost>> hostClass) {} public boolean validate(IInventory inventory, int slot, ItemStack stack) {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: invokevirtual validator : ()Lscala/Option;
/*    */       //   4: astore #4
/*    */       //   6: aload #4
/*    */       //   8: instanceof scala/Some
/*    */       //   11: ifeq -> 112
/*    */       //   14: aload #4
/*    */       //   16: checkcast scala/Some
/*    */       //   19: astore #5
/*    */       //   21: aload #5
/*    */       //   23: invokevirtual x : ()Ljava/lang/Object;
/*    */       //   26: checkcast java/lang/reflect/Method
/*    */       //   29: astore #6
/*    */       //   31: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*    */       //   34: aload #6
/*    */       //   36: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   39: iconst_4
/*    */       //   40: anewarray java/lang/Object
/*    */       //   43: dup
/*    */       //   44: iconst_0
/*    */       //   45: aload_1
/*    */       //   46: aastore
/*    */       //   47: dup
/*    */       //   48: iconst_1
/*    */       //   49: new scala/runtime/RichInt
/*    */       //   52: dup
/*    */       //   53: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   56: iload_2
/*    */       //   57: invokevirtual intWrapper : (I)I
/*    */       //   60: invokespecial <init> : (I)V
/*    */       //   63: invokevirtual underlying : ()Ljava/lang/Object;
/*    */       //   66: aastore
/*    */       //   67: dup
/*    */       //   68: iconst_2
/*    */       //   69: new scala/runtime/RichInt
/*    */       //   72: dup
/*    */       //   73: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   76: aload_0
/*    */       //   77: invokevirtual tier : ()I
/*    */       //   80: invokevirtual intWrapper : (I)I
/*    */       //   83: invokespecial <init> : (I)V
/*    */       //   86: invokevirtual underlying : ()Ljava/lang/Object;
/*    */       //   89: aastore
/*    */       //   90: dup
/*    */       //   91: iconst_3
/*    */       //   92: aload_3
/*    */       //   93: aastore
/*    */       //   94: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   97: iconst_0
/*    */       //   98: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */       //   101: invokevirtual tryInvokeStatic : (Ljava/lang/reflect/Method;Lscala/collection/Seq;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   104: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */       //   107: istore #7
/*    */       //   109: goto -> 308
/*    */       //   112: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */       //   115: aload_0
/*    */       //   116: invokevirtual hostClass : ()Lscala/Option;
/*    */       //   119: new li/cil/oc/common/template/AssemblerTemplates$Slot$$anonfun$4
/*    */       //   122: dup
/*    */       //   123: aload_0
/*    */       //   124: aload_3
/*    */       //   125: invokespecial <init> : (Lli/cil/oc/common/template/AssemblerTemplates$Slot;Lnet/minecraft/item/ItemStack;)V
/*    */       //   128: new li/cil/oc/common/template/AssemblerTemplates$Slot$$anonfun$5
/*    */       //   131: dup
/*    */       //   132: aload_0
/*    */       //   133: aload_3
/*    */       //   134: invokespecial <init> : (Lli/cil/oc/common/template/AssemblerTemplates$Slot;Lnet/minecraft/item/ItemStack;)V
/*    */       //   137: invokevirtual fold : (Lscala/Function0;Lscala/Function1;)Ljava/lang/Object;
/*    */       //   140: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */       //   143: astore #8
/*    */       //   145: aload #8
/*    */       //   147: instanceof scala/Some
/*    */       //   150: ifeq -> 228
/*    */       //   153: aload #8
/*    */       //   155: checkcast scala/Some
/*    */       //   158: astore #9
/*    */       //   160: aload #9
/*    */       //   162: invokevirtual x : ()Ljava/lang/Object;
/*    */       //   165: checkcast li/cil/oc/api/driver/Item
/*    */       //   168: astore #10
/*    */       //   170: aload #10
/*    */       //   172: aload_3
/*    */       //   173: invokeinterface slot : (Lnet/minecraft/item/ItemStack;)Ljava/lang/String;
/*    */       //   178: aload_0
/*    */       //   179: invokevirtual kind : ()Ljava/lang/String;
/*    */       //   182: astore #13
/*    */       //   184: dup
/*    */       //   185: ifnonnull -> 197
/*    */       //   188: pop
/*    */       //   189: aload #13
/*    */       //   191: ifnull -> 205
/*    */       //   194: goto -> 224
/*    */       //   197: aload #13
/*    */       //   199: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   202: ifeq -> 224
/*    */       //   205: aload #10
/*    */       //   207: aload_3
/*    */       //   208: invokeinterface tier : (Lnet/minecraft/item/ItemStack;)I
/*    */       //   213: aload_0
/*    */       //   214: invokevirtual tier : ()I
/*    */       //   217: if_icmpgt -> 224
/*    */       //   220: iconst_1
/*    */       //   221: goto -> 302
/*    */       //   224: iconst_0
/*    */       //   225: goto -> 302
/*    */       //   228: iconst_0
/*    */       //   229: istore #11
/*    */       //   231: goto -> 304
/*    */       //   234: astore #12
/*    */       //   236: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */       //   239: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */       //   242: new scala/StringContext
/*    */       //   245: dup
/*    */       //   246: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   249: iconst_2
/*    */       //   250: anewarray java/lang/String
/*    */       //   253: dup
/*    */       //   254: iconst_0
/*    */       //   255: ldc 'Error trying to query driver ''
/*    */       //   257: aastore
/*    */       //   258: dup
/*    */       //   259: iconst_1
/*    */       //   260: ldc '' for slot and/or tier information. Probably their fault. Yell at them before coming to OpenComputers for support. :P'
/*    */       //   262: aastore
/*    */       //   263: checkcast [Ljava/lang/Object;
/*    */       //   266: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   269: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   272: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   275: iconst_1
/*    */       //   276: anewarray java/lang/Object
/*    */       //   279: dup
/*    */       //   280: iconst_0
/*    */       //   281: aload #10
/*    */       //   283: invokevirtual getClass : ()Ljava/lang/Class;
/*    */       //   286: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   289: aastore
/*    */       //   290: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   293: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   296: invokeinterface warn : (Ljava/lang/String;)V
/*    */       //   301: iconst_0
/*    */       //   302: istore #11
/*    */       //   304: iload #11
/*    */       //   306: istore #7
/*    */       //   308: iload #7
/*    */       //   310: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #75	-> 0
/*    */       //   #76	-> 6
/*    */       //   #77	-> 112
/*    */       //   #78	-> 145
/*    */       //   #83	-> 228
/*    */       //   #79	-> 234
/*    */       //   #78	-> 234
/*    */       //   #80	-> 236
/*    */       //   #81	-> 301
/*    */       //   #78	-> 302
/*    */       //   #77	-> 304
/*    */       //   #75	-> 308
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	311	0	this	Lli/cil/oc/common/template/AssemblerTemplates$Slot;
/*    */       //   0	311	1	inventory	Lnet/minecraft/inventory/IInventory;
/*    */       //   0	311	2	slot	I
/*    */       //   0	311	3	stack	Lnet/minecraft/item/ItemStack;
/*    */       //   31	280	6	method	Ljava/lang/reflect/Method;
/*    */       //   170	141	10	driver	Lli/cil/oc/api/driver/Item;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   170	228	234	java/lang/AbstractMethodError
/*    */     } public final class AssemblerTemplates$Slot$$anonfun$4 extends AbstractFunction0<Item> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2;
/* 77 */       public final Item apply() { return Driver.driverFor(this.stack$2); } public AssemblerTemplates$Slot$$anonfun$4(AssemblerTemplates.Slot $outer, ItemStack stack$2) {} } public final class AssemblerTemplates$Slot$$anonfun$5 extends AbstractFunction1<Class<? extends EnvironmentHost>, Item> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2; public final Item apply(Class x$3) { return Driver.driverFor(this.stack$2, x$3); }
/*    */ 
/*    */       
/*    */       public AssemblerTemplates$Slot$$anonfun$5(AssemblerTemplates.Slot $outer, ItemStack stack$2) {} }
/*    */      }
/*    */ 
/*    */   
/*    */   public final class AssemblerTemplates$$anonfun$6 extends AbstractFunction0<String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagCompound nbt$1;
/*    */     
/*    */     public final String apply() {
/* 89 */       return this.nbt$1.func_74764_b("type") ? this.nbt$1.func_74779_i("type") : Slot$.MODULE$.None();
/*    */     }
/*    */     
/*    */     public AssemblerTemplates$$anonfun$6(NBTTagCompound nbt$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\AssemblerTemplates.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */