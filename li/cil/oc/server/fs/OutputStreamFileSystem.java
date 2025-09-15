/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005-eaB\001\003!\003\r\t!\004\002\027\037V$\b/\036;TiJ,\027-\034$jY\026\034\026p\035;f[*\0211\001B\001\003MNT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]AR\"\001\002\n\005e\021!!F%oaV$8\013\036:fC64\025\016\\3TsN$X-\034\005\0067\001!\t\001H\001\007I%t\027\016\036\023\025\003u\001\"AH\021\016\003}Q\021\001I\001\006g\016\fG.Y\005\003E}\021A!\0268ji\"9A\005\001b\001\n\023)\023a\0025b]\022dWm]\013\002MA!q\005\f\0302\033\005A#BA\025+\003\035iW\017^1cY\026T!aK\020\002\025\r|G\016\\3di&|g.\003\002.Q\t\031Q*\0319\021\005yy\023B\001\031 \005\rIe\016\036\t\003eMj\021\001\001\004\006i\001\t\t\"\016\002\r\037V$\b/\036;IC:$G.Z\n\004g91\004CA\034<\033\005A$BA\002:\025\tQd!A\002ba&L!\001\020\035\003\r!\013g\016\0327f\021!q4G!b\001\n\003y\024!B8x]\026\024X#\001!\021\005]\001\001\002\003\"4\005\003\005\013\021\002!\002\r=<h.\032:!\021!!5G!b\001\n\003)\025A\0025b]\022dW-F\001/\021!95G!A!\002\023q\023a\0025b]\022dW\r\t\005\t\023N\022)\031!C\001\025\006!\001/\031;i+\005Y\005C\001'P\035\tqR*\003\002O?\0051\001K]3eK\032L!\001U)\003\rM#(/\0338h\025\tqu\004\003\005Tg\t\005\t\025!\003L\003\025\001\030\r\0365!\021\025)6\007\"\001W\003\031a\024N\\5u}Q!\021g\026-Z\021\025qD\0131\001A\021\025!E\0131\001/\021\025IE\0131\001L\021\035Y6\0071A\005\022q\013\021bX5t\0072|7/\0323\026\003u\003\"A\b0\n\005}{\"a\002\"p_2,\027M\034\005\bCN\002\r\021\"\005c\0035y\026n]\"m_N,Gm\030\023fcR\021Qd\031\005\bI\002\f\t\0211\001^\003\rAH%\r\005\007MN\002\013\025B/\002\025}K7o\0217pg\026$\007\005C\003ig\021\005A,\001\005jg\016cwn]3e\021\025Q7\007\"\021\035\003\025\031Gn\\:f\021\025a7\007\"\021n\003\021\021X-\0313\025\0059r\007\"B8l\001\004\001\030\001B5oi>\0042AH9t\023\t\021xDA\003BeJ\f\027\020\005\002\037i&\021Qo\b\002\005\005f$X\rC\003xg\021\005\0030\001\003tK\026\\GCA=}!\tq\"0\003\002|?\t!Aj\0348h\021\025ih\0171\001z\003\t!x\016\003\004\000\001\001\006IAJ\001\tQ\006tG\r\\3tA!9\0211\001\001\005B\005\025\021AC5t%\026\fGm\0248msR\tQ\fC\004\002\n\001!\t%a\003\002\t=\004XM\034\013\006]\0055\021q\002\005\007\023\006\035\001\031A&\t\021\005E\021q\001a\001\003'\tA!\\8eKB\031q'!\006\n\007\005]\001H\001\003N_\022,\007bBA\016\001\021\005\023QD\001\nO\026$\b*\0318eY\026$2ANA\020\021\031!\025\021\004a\001]!)!\016\001C!9!9\021Q\005\001\005B\005\035\022\001\0027pC\022$2!HA\025\021!\tY#a\tA\002\0055\022a\0018ciB!\021qFA\036\033\t\t\tD\003\003\002,\005M\"\002BA\033\003o\t\021\"\\5oK\016\024\030M\032;\013\005\005e\022a\0018fi&!\021QHA\031\0059q%\t\026+bO\016{W\016]8v]\022Dq!!\021\001\t\003\n\031%\001\003tCZ,GcA\017\002F!A\0211FA \001\004\ti\003C\004\002J\0011\t\"a\023\002!=\004XM\\(viB,H\017S1oI2,G\003CA'\003'\n9&!\027\021\ty\ty%M\005\004\003#z\"AB(qi&|g\016C\004\002V\005\035\003\031\001\030\002\005%$\007BB%\002H\001\0071\n\003\005\002\022\005\035\003\031AA\n\0219\ti\006\001I\001\004\003\005I\021BA0\003K\n!b];qKJ$s\016]3o)\025q\023\021MA2\021\031I\0251\fa\001\027\"A\021\021CA.\001\004\t\031\"C\002\002\naAa\"!\033\001!\003\r\t\021!C\005\003W\ny'A\btkB,'\017J4fi\"\013g\016\0327f)\r1\024Q\016\005\007\t\006\035\004\031\001\030\n\007\005m\001\004C\007\002t\001\001\n1!A\001\n\023a\022QO\001\fgV\004XM\035\023dY>\034X-\003\002k1!q\021\021\020\001\021\002\007\005\t\021\"\003\002|\005}\024AC:va\026\024H\005\\8bIR\031Q$! \t\021\005-\022q\017a\001\003[I1!!\n\031\0219\t\031\t\001I\001\004\003\005I\021BAC\003\023\013!b];qKJ$3/\031<f)\ri\022q\021\005\t\003W\t\t\t1\001\002.%\031\021\021\t\r")
/*    */ public interface OutputStreamFileSystem extends InputStreamFileSystem {
/*    */   void li$cil$oc$server$fs$OutputStreamFileSystem$_setter_$li$cil$oc$server$fs$OutputStreamFileSystem$$handles_$eq(Map paramMap);
/*    */   
/*    */   Map<Object, OutputHandle> li$cil$oc$server$fs$OutputStreamFileSystem$$handles();
/*    */   
/*    */   boolean isReadOnly();
/*    */   
/*    */   int open(String paramString, Mode paramMode);
/*    */   
/*    */   Handle getHandle(int paramInt);
/*    */   
/*    */   void close();
/*    */   
/*    */   void load(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void save(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   Option<OutputHandle> openOutputHandle(int paramInt, String paramString, Mode paramMode);
/*    */   
/*    */   public final class OutputStreamFileSystem$$anonfun$1 extends AbstractFunction0.mcI.sp implements Serializable {
/* 28 */     public final int apply() { return apply$mcI$sp(); } public static final long serialVersionUID = 0L; public int apply$mcI$sp() { return (int)(Math.random() * 2147483647) + 1; } public OutputStreamFileSystem$$anonfun$1(OutputStreamFileSystem $outer) {} } public final class OutputStreamFileSystem$$anonfun$2 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int key) { return apply$mcZI$sp(key); } public boolean apply$mcZI$sp(int key) { return this.$outer.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().contains(BoxesRunTime.boxToInteger(key)); }
/*    */ 
/*    */     
/*    */     public OutputStreamFileSystem$$anonfun$2(OutputStreamFileSystem $outer) {} }
/*    */ 
/*    */   
/*    */   public final class OutputStreamFileSystem$$anonfun$getHandle$1 extends AbstractFunction0<Option<OutputHandle>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final int handle$1;
/*    */     
/*    */     public final Option<OutputStreamFileSystem.OutputHandle> apply() {
/* 38 */       return this.$outer.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().get(BoxesRunTime.boxToInteger(this.handle$1));
/*    */     } public OutputStreamFileSystem$$anonfun$getHandle$1(OutputStreamFileSystem $outer, int handle$1) {} }
/*    */   public final class OutputStreamFileSystem$$anonfun$close$1 extends AbstractFunction1<OutputHandle, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public OutputStreamFileSystem$$anonfun$close$1(OutputStreamFileSystem $outer) {}
/*    */     public final void apply(OutputStreamFileSystem.OutputHandle handle) {
/* 43 */       handle.close();
/*    */     } }
/*    */ 
/*    */   
/*    */   public final class OutputStreamFileSystem$$anonfun$load$1
/*    */     extends AbstractFunction1<Object, NBTTagCompound> implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagList handlesNbt$2;
/*    */     
/* 53 */     public final NBTTagCompound apply(int x$1) { return this.handlesNbt$2.func_150305_b(x$1); } public OutputStreamFileSystem$$anonfun$load$1(OutputStreamFileSystem $outer, NBTTagList handlesNbt$2) {} } public final class OutputStreamFileSystem$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, Object> implements Serializable { public static final long serialVersionUID = 0L; public OutputStreamFileSystem$$anonfun$load$2(OutputStreamFileSystem $outer) {} public final Object apply(NBTTagCompound handleNbt) { BoxedUnit boxedUnit;
/* 54 */       int handle = handleNbt.func_74762_e("handle");
/* 55 */       String path = handleNbt.func_74779_i("path");
/* 56 */       Option<OutputStreamFileSystem.OutputHandle> option = this.$outer.openOutputHandle(handle, path, Mode.Append);
/* 57 */       if (option instanceof Some) { Some some = (Some)option; OutputStreamFileSystem.OutputHandle fileHandle = (OutputStreamFileSystem.OutputHandle)some.x(); MapLike mapLike = this.$outer.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(handle)), fileHandle)); }
/* 58 */       else { boxedUnit = BoxedUnit.UNIT; }
/*    */       
/*    */       return boxedUnit; }
/*    */      }
/*    */   public final class OutputStreamFileSystem$$anonfun$save$1 extends AbstractFunction1<OutputHandle, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final NBTTagList handlesNbt$1;
/*    */     
/*    */     public OutputStreamFileSystem$$anonfun$save$1(OutputStreamFileSystem $outer, NBTTagList handlesNbt$1) {}
/*    */     
/*    */     public final void apply(OutputStreamFileSystem.OutputHandle file) {
/* 68 */       Predef$.MODULE$.assert(!file.isClosed());
/* 69 */       NBTTagCompound handleNbt = new NBTTagCompound();
/* 70 */       handleNbt.func_74768_a("handle", file.handle());
/* 71 */       handleNbt.func_74778_a("path", file.path());
/* 72 */       this.handlesNbt$1.func_74742_a((NBTBase)handleNbt);
/*    */     } }
/*    */ 
/*    */   
/*    */   public abstract class OutputHandle
/*    */     implements Handle {
/*    */     private final OutputStreamFileSystem owner;
/*    */     private final int handle;
/*    */     private final String path;
/*    */     
/*    */     public OutputStreamFileSystem owner() {
/* 83 */       return this.owner; } public int handle() { return this.handle; } public String path() { return this.path; } private boolean _isClosed = false;
/* 84 */     public boolean _isClosed() { return this._isClosed; } public void _isClosed_$eq(boolean x$1) { this._isClosed = x$1; }
/*    */      public boolean isClosed() {
/* 86 */       return _isClosed();
/*    */     } public void close() {
/* 88 */       if (!isClosed()) {
/* 89 */         _isClosed_$eq(true);
/* 90 */         owner().li$cil$oc$server$fs$OutputStreamFileSystem$$handles().$minus$eq(BoxesRunTime.boxToInteger(handle()));
/*    */       } 
/*    */     } public int read(byte[] into) {
/* 93 */       throw new IOException("bad file descriptor");
/*    */     } public long seek(long to) {
/* 95 */       throw new IOException("bad file descriptor");
/*    */     }
/*    */     
/*    */     public OutputHandle(OutputStreamFileSystem $outer, OutputStreamFileSystem owner, int handle, String path) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\OutputStreamFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */