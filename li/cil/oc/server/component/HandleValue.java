/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.prefab.AbstractValue;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.reflect.ScalaSignature;
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
/*     */ @ScalaSignature(bytes = "\006\001%4A!\001\002\003\033\tY\001*\0318eY\0264\026\r\\;f\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\016\003\n\034HO]1diZ\013G.^3\t\013]\001A\021\001\r\002\rqJg.\033;?)\005I\002C\001\016\001\033\005\021\001\"B\f\001\t\003aBcA\r\036S!)ad\007a\001?\005)qn\0368feB\021\001E\n\b\003C\021j\021A\t\006\002G\005)1oY1mC&\021QEI\001\007!J,G-\0324\n\005\035B#AB*ue&twM\003\002&E!)!f\007a\001W\0051\001.\0318eY\026\004\"!\t\027\n\0055\022#aA%oi\"9a\004\001a\001\n\003yS#\001\031\021\005E2T\"\001\032\013\005M\"\024\001\0027b]\036T\021!N\001\005U\0064\030-\003\002(e!9\001\b\001a\001\n\003I\024!C8x]\026\024x\fJ3r)\tQT\b\005\002\"w%\021AH\t\002\005+:LG\017C\004?o\005\005\t\031\001\031\002\007a$\023\007\003\004A\001\001\006K\001M\001\007_^tWM\035\021\t\017)\002\001\031!C\001\005V\t1\006C\004E\001\001\007I\021A#\002\025!\fg\016\0327f?\022*\027\017\006\002;\r\"9ahQA\001\002\004Y\003B\002%\001A\003&1&A\004iC:$G.\032\021\t\013)\003A\021I&\002\017\021L7\017]8tKR\021!\b\024\005\006\033&\003\rAT\001\bG>tG/\032=u!\ty%+D\001Q\025\t\t&#A\004nC\016D\027N\\3\n\005M\003&aB\"p]R,\007\020\036\005\006+\002!\tEV\001\005Y>\fG\r\006\002;/\")\001\f\026a\0013\006\031aN\031;\021\005i\003W\"A.\013\005ac&BA/_\003%i\027N\\3de\0064GOC\001`\003\rqW\r^\005\003Cn\023aB\024\"U)\006<7i\\7q_VtG\rC\003d\001\021\005C-\001\003tCZ,GC\001\036f\021\025A&\r1\001Z\021\0259\007\001\"\021i\003!!xn\025;sS:<G#A\020")
/*     */ public final class HandleValue
/*     */   extends AbstractValue
/*     */ {
/*     */   public HandleValue(String owner, int handle) {
/* 372 */     this();
/* 373 */     owner_$eq(owner);
/* 374 */     handle_$eq(handle);
/*     */   }
/*     */   
/* 377 */   private String owner = ""; public String owner() { return this.owner; } public void owner_$eq(String x$1) { this.owner = x$1; }
/* 378 */    private int handle = 0; public int handle() { return this.handle; } public void handle_$eq(int x$1) { this.handle = x$1; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose(Context context) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial dispose : (Lli/cil/oc/api/machine/Context;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   11: ifnull -> 104
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   20: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   25: ifnull -> 104
/*     */     //   28: aload_1
/*     */     //   29: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   34: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   39: aload_0
/*     */     //   40: invokevirtual owner : ()Ljava/lang/String;
/*     */     //   43: invokeinterface node : (Ljava/lang/String;)Lli/cil/oc/api/network/Node;
/*     */     //   48: astore_2
/*     */     //   49: aload_2
/*     */     //   50: ifnull -> 104
/*     */     //   53: aload_2
/*     */     //   54: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*     */     //   59: astore_3
/*     */     //   60: aload_3
/*     */     //   61: instanceof li/cil/oc/server/component/FileSystem
/*     */     //   64: ifeq -> 89
/*     */     //   67: aload_3
/*     */     //   68: checkcast li/cil/oc/server/component/FileSystem
/*     */     //   71: astore #4
/*     */     //   73: aload #4
/*     */     //   75: aload_1
/*     */     //   76: aload_0
/*     */     //   77: invokevirtual handle : ()I
/*     */     //   80: invokevirtual close : (Lli/cil/oc/api/machine/Context;I)V
/*     */     //   83: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   86: goto -> 102
/*     */     //   89: new scala/MatchError
/*     */     //   92: dup
/*     */     //   93: aload_3
/*     */     //   94: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   97: athrow
/*     */     //   98: pop
/*     */     //   99: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   102: astore #5
/*     */     //   104: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #381	-> 0
/*     */     //   #382	-> 5
/*     */     //   #383	-> 28
/*     */     //   #384	-> 49
/*     */     //   #385	-> 53
/*     */     //   #386	-> 60
/*     */     //   #385	-> 89
/*     */     //   #386	-> 98
/*     */     //   #387	-> 99
/*     */     //   #386	-> 102
/*     */     //   #380	-> 104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	105	0	this	Lli/cil/oc/server/component/HandleValue;
/*     */     //   0	105	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   49	56	2	node	Lli/cil/oc/api/network/Node;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   73	89	98	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 395 */     super.load(nbt);
/* 396 */     owner_$eq(nbt.func_74779_i("owner"));
/* 397 */     handle_$eq(nbt.func_74762_e("handle"));
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 401 */     super.save(nbt);
/* 402 */     nbt.func_74768_a("handle", handle());
/* 403 */     nbt.func_74778_a("owner", owner());
/*     */   }
/*     */   public String toString() {
/* 406 */     return BoxesRunTime.boxToInteger(handle()).toString();
/*     */   }
/*     */   
/*     */   public HandleValue() {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\HandleValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */