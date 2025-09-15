/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.Machine;
/*    */ import li.cil.oc.api.machine.Architecture;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.item.CPU;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.RichInt$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005es!B\001\003\021\003i\021!\003#sSZ,'o\021)V\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003\023\021\023\030N^3s\007B+6CA\b\023!\tq1CB\003\021\005\005\005AcE\003\024+u\001#\006\005\002\02775\tqC\003\002\0313\005!A.\0318h\025\005Q\022\001\0026bm\006L!\001H\f\003\r=\023'.Z2u!\tqa$\003\002 \005\t!\021\n^3n!\t\t\003&D\001#\025\t\031C%\001\003ji\026l'BA\023'\003\031!'/\033<fe*\021qEB\001\004CBL\027BA\025#\005AiU\017^1cY\026\004&o\\2fgN|'\017\005\002\"W%\021AF\t\002\013\007\006dGNQ;eO\026$\b\"\002\030\024\t\003y\023A\002\037j]&$h\bF\001\023\021\025\t4\003\"\0213\003%9xN]6t/&$\b\016\006\0024sA\021AgN\007\002k)\ta'A\003tG\006d\027-\003\0029k\t9!i\\8mK\006t\007\"\002\0361\001\004Y\024!B:uC\016\\\007C\001\037C\033\005i$BA\022?\025\ty\004)A\005nS:,7M]1gi*\t\021)A\002oKRL!aQ\037\003\023%#X-\\*uC\016\\\007\"B#\024\t\0032\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031q)\024(\021\005![U\"A%\013\005)3\023a\0028fi^|'o[\005\003\031&\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")!\b\022a\001w!)q\n\022a\001!\006!\001n\\:u!\tA\025+\003\002S\023\nyQI\034<je>tW.\0328u\021>\034H\017C\003U'\021\005S+\001\003tY>$HC\001,Z!\t1r+\003\002Y/\t11\013\036:j]\036DQAO*A\002mBQaW\n\005Bq\013A\001^5feR\021Q\f\031\t\003iyK!aX\033\003\007%sG\017C\003;5\002\0071\bC\003c'\021\0051-A\004daV$\026.\032:\025\005u#\007\"\002\036b\001\004Y\004\"\0024\024\t\003:\027aE:vaB|'\017^3e\007>l\007o\0348f]R\034HCA/i\021\025QT\r1\001<\021\025Q7\003\"\021l\003A\tG\016\\!sG\"LG/Z2ukJ,7\017F\001m!\ri\007O]\007\002]*\021q.G\001\005kRLG.\003\002r]\n!A*[:ua\t\031\b\020E\002\027iZL!!^\f\003\013\rc\027m]:\021\005]DH\002\001\003\ns\002\t\t\021!A\003\002y\024!a\020\031\n\005md\030!D1sG\"LG/Z2ukJ,7O\003\002~M\0059Q*Y2iS:,\027cA@\002\006A\031A'!\001\n\007\005\rQGA\004O_RD\027N\\4\021\t\005\035\021QB\007\003\003\023Q1!a\003'\003\035i\027m\0315j]\026LA!a\004\002\n\ta\021I]2iSR,7\r^;sK\"9\0211C\n\005B\005U\021\001D1sG\"LG/Z2ukJ,G\003BA\f\003W\001D!!\007\002(A1\0211DA\021\003Kq1\001NA\017\023\r\ty\"N\001\007!J,G-\0324\n\007U\f\031CC\002\002 U\0022a^A\024\t-\tI#!\005\002\002\003\005)\021\001@\003\007}#\023\007\003\004;\003#\001\ra\017\005\b\003_\031B\021IA\031\003=\031X\r^!sG\"LG/Z2ukJ,GCBA\032\003s\tY\004E\0025\003kI1!a\0166\005\021)f.\033;\t\ri\ni\0031\001<\021!\t\031\"!\fA\002\005u\002\007BA \003\007\002b!a\007\002\"\005\005\003cA<\002D\021Y\021QIA\036\003\003\005\tQ!\001\005\ryFE\r\005\b\003\023\032B\021IA&\00359W\r^\"bY2\024U\017Z4fiR!\021QJA*!\r!\024qJ\005\004\003#*$A\002#pk\ndW\r\003\004;\003\017\002\ra\017\005\007]=!\t!a\026\025\0035\001")
/*    */ public abstract class DriverCPU implements Item, MutableProcessor, CallBudget {
/* 21 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } public DriverCPU() { Item$class.$init$(this); }
/* 22 */   public boolean worksWith(ItemStack stack) { (new ItemInfo[3])[0] = 
/* 23 */       Items.get("cpu1");
/* 24 */     (new ItemInfo[3])[1] = Items.get("cpu2");
/* 25 */     (new ItemInfo[3])[2] = Items.get("cpu3");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3])); } public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 27 */     return (ManagedEnvironment)new CPU(tier(stack));
/*    */   } public String slot(ItemStack stack) {
/* 29 */     return Slot$.MODULE$.CPU();
/*    */   } public int tier(ItemStack stack) {
/* 31 */     return cpuTier(stack);
/*    */   }
/*    */   public int cpuTier(ItemStack stack) {
/* 34 */     Option option = Delegator$.MODULE$.subItem(stack);
/* 35 */     if (option instanceof Some) { Some some = (Some)option; Delegate cpu = (Delegate)some.x(); if (cpu instanceof CPU) { CPU cPU = (CPU)cpu; return cPU.cpuTier(); }  }
/* 36 */      return 0;
/*    */   }
/*    */   public int supportedComponents(ItemStack stack) {
/* 39 */     return Settings$.MODULE$.get().cpuComponentSupport()[cpuTier(stack)];
/*    */   } public List<Class<? extends Architecture>> allArchitectures() {
/* 41 */     return WrapAsJava$.MODULE$.seqAsJavaList((Seq)WrapAsScala$.MODULE$.collectionAsScalaIterable(Machine.architectures()).toList());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Class<? extends Architecture> architecture(ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual func_77942_o : ()Z
/*    */     //   4: ifeq -> 184
/*    */     //   7: aload_1
/*    */     //   8: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   11: new scala/collection/mutable/StringBuilder
/*    */     //   14: dup
/*    */     //   15: invokespecial <init> : ()V
/*    */     //   18: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   21: invokevirtual namespace : ()Ljava/lang/String;
/*    */     //   24: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   27: ldc 'archClass'
/*    */     //   29: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   32: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   35: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   38: astore_3
/*    */     //   39: aload_3
/*    */     //   40: ldc li/cil/oc/server/machine/luac/NativeLuaArchitecture
/*    */     //   42: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   45: astore #4
/*    */     //   47: dup
/*    */     //   48: ifnonnull -> 60
/*    */     //   51: pop
/*    */     //   52: aload #4
/*    */     //   54: ifnull -> 68
/*    */     //   57: goto -> 79
/*    */     //   60: aload #4
/*    */     //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   65: ifeq -> 79
/*    */     //   68: getstatic li/cil/oc/api/Machine.LuaArchitecture : Ljava/lang/Class;
/*    */     //   71: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   74: astore #5
/*    */     //   76: goto -> 82
/*    */     //   79: aload_3
/*    */     //   80: astore #5
/*    */     //   82: aload #5
/*    */     //   84: astore_2
/*    */     //   85: aload_2
/*    */     //   86: invokevirtual isEmpty : ()Z
/*    */     //   89: ifne -> 184
/*    */     //   92: aload_2
/*    */     //   93: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   96: ldc_w li/cil/oc/api/machine/Architecture
/*    */     //   99: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
/*    */     //   102: areturn
/*    */     //   103: astore #6
/*    */     //   105: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */     //   108: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */     //   111: ldc_w 'Failed getting class for CPU architecture. Resetting CPU to use the default.'
/*    */     //   114: aload #6
/*    */     //   116: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   121: aload_1
/*    */     //   122: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   125: new scala/collection/mutable/StringBuilder
/*    */     //   128: dup
/*    */     //   129: invokespecial <init> : ()V
/*    */     //   132: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   135: invokevirtual namespace : ()Ljava/lang/String;
/*    */     //   138: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   141: ldc 'archClass'
/*    */     //   143: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   146: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   149: invokevirtual func_82580_o : (Ljava/lang/String;)V
/*    */     //   152: aload_1
/*    */     //   153: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   156: new scala/collection/mutable/StringBuilder
/*    */     //   159: dup
/*    */     //   160: invokespecial <init> : ()V
/*    */     //   163: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   166: invokevirtual namespace : ()Ljava/lang/String;
/*    */     //   169: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   172: ldc_w 'archName'
/*    */     //   175: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   178: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   181: invokevirtual func_82580_o : (Ljava/lang/String;)V
/*    */     //   184: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   187: invokestatic architectures : ()Ljava/util/Collection;
/*    */     //   190: invokevirtual collectionAsScalaIterable : (Ljava/util/Collection;)Lscala/collection/Iterable;
/*    */     //   193: invokeinterface headOption : ()Lscala/Option;
/*    */     //   198: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   201: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*    */     //   204: invokevirtual orNull : (Lscala/Predef$$less$colon$less;)Ljava/lang/Object;
/*    */     //   207: checkcast java/lang/Class
/*    */     //   210: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 0
/*    */     //   #45	-> 7
/*    */     //   #46	-> 39
/*    */     //   #49	-> 68
/*    */     //   #50	-> 79
/*    */     //   #45	-> 82
/*    */     //   #52	-> 85
/*    */     //   #53	-> 103
/*    */     //   #54	-> 105
/*    */     //   #55	-> 121
/*    */     //   #56	-> 152
/*    */     //   #59	-> 184
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	211	0	this	Lli/cil/oc/integration/opencomputers/DriverCPU;
/*    */     //   0	211	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   85	126	2	archClass	Ljava/lang/String;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   92	103	103	finally
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setArchitecture(ItemStack stack, Class architecture) {
/* 63 */     if (worksWith(stack)) {
/* 64 */       if (!stack.func_77942_o()) stack.func_77982_d(new NBTTagCompound()); 
/* 65 */       stack.func_77978_p().func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("archClass").toString(), architecture.getName());
/* 66 */       stack.func_77978_p().func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("archName").toString(), Machine.getArchitectureName(architecture));
/*    */       return;
/*    */     } 
/* 69 */     throw new IllegalArgumentException("Unsupported processor type."); } public double getCallBudget(ItemStack stack) { return Settings$.MODULE$.get().callBudgets()[RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(tier(stack)), 0)), 2)]; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverCPU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */