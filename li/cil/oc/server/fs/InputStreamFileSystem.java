/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\005baB\001\003!\003\r\t!\004\002\026\023:\004X\017^*ue\026\fWNR5mKNK8\017^3n\025\t\031A!\001\002gg*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/mi\021\001\007\006\003\007eQ!A\007\004\002\007\005\004\030.\003\002\0351\tQa)\0337f'f\034H/Z7\t\013y\001A\021A\020\002\r\021Jg.\033;%)\005\001\003CA\021%\033\005\021#\"A\022\002\013M\034\027\r\\1\n\005\025\022#\001B+oSRDqa\n\001C\002\023%\001&A\004iC:$G.Z:\026\003%\002BAK\0302i5\t1F\003\002-[\0059Q.\036;bE2,'B\001\030#\003)\031w\016\0347fGRLwN\\\005\003a-\0221!T1q!\t\t#'\003\0024E\t\031\021J\034;\021\005U2T\"\001\001\007\t]\002A\001\017\002\007\021\006tG\r\\3\024\007Yr\021\b\005\002\030u%\021q\007\007\005\tyY\022)\031!C\001{\005)qn\0368feV\ta\b\005\002@\0015\t!\001\003\005Bm\t\005\t\025!\003?\003\031ywO\\3sA!A1I\016BC\002\023\005A)\001\004iC:$G.Z\013\002c!AaI\016B\001B\003%\021'A\004iC:$G.\032\021\t\021!3$Q1A\005\002%\013A\001]1uQV\t!\n\005\002L\035:\021\021\005T\005\003\033\n\na\001\025:fI\0264\027BA(Q\005\031\031FO]5oO*\021QJ\t\005\t%Z\022\t\021)A\005\025\006)\001/\031;iA!AAK\016BC\002\023\005Q+A\004dQ\006tg.\0327\026\003Y\003\"!N,\007\017a\003\001\023aA\t3\na\021J\0349vi\016C\027M\0348fYN\031qK\004.\021\005m\003W\"\001/\013\005us\026\001C2iC:tW\r\\:\013\005}\023\022a\0018j_&\021\021\r\030\002\024%\026\fG-\0312mK\nKH/Z\"iC:tW\r\034\005\006=]#\ta\b\005\006I^3\t!Z\001\007SN|\005/\0328\025\003\031\004\"!I4\n\005!\024#a\002\"p_2,\027M\034\005\006U^3\taH\001\006G2|7/\032\005\006Y^3\t!\\\001\ta>\034\030\016^5p]V\ta\016\005\002\"_&\021\001O\t\002\005\031>tw\rC\003m/\032\005!\017\006\002og\")A/\035a\001]\006Ya.Z<Q_NLG/[8o\021\0251xK\"\001x\003\021\021X-\0313\025\005EB\b\"B=v\001\004Q\030a\0013tiB\031\021e_?\n\005q\024#!B!se\006L\bCA\021\023\ty(E\001\003CsR,\007B\002<X\t\003\n\031\001F\0022\003\013Aq!_A\001\001\004\t9\001\005\003\002\n\005-Q\"\0010\n\007\0055aL\001\006CsR,')\0364gKJD\021\"!\0057\005\003\005\013\021\002,\002\021\rD\027M\0348fY\002Bq!!\0067\t\003\t9\"\001\004=S:LGO\020\013\ni\005e\0211DA\017\003?Aa\001PA\n\001\004q\004BB\"\002\024\001\007\021\007\003\004I\003'\001\rA\023\005\007)\006M\001\031\001,\t\r14D\021IA\022)\005q\007bBA\024m\021\005\0231E\001\007Y\026tw\r\0365\t\013)4D\021I\020\t\rY4D\021IA\027)\r\t\024q\006\005\b\003c\tY\0031\001{\003\021Ig\016^8\t\017\005Ub\007\"\021\0028\005!1/Z3l)\rq\027\021\b\005\b\003w\t\031\0041\001o\003\t!x\016C\004\002@Y\"\t%!\021\002\013]\024\030\016^3\025\t\005\r\023\021\n\t\004C\005\025\023bAA$E\t9aj\034;iS:<\007bBA&\003{\001\rA_\001\006m\006dW/\032\005\b\003\037\002\001\025!\003*\003!A\027M\0343mKN\004\003BBA*\001\021\005S-\001\006jgJ+\027\rZ(oYfDq!a\026\001\t\003\nI&\001\004eK2,G/\032\013\004M\006m\003B\002%\002V\001\007!\nC\004\002`\001!\t%!\031\002\0335\f7.\032#je\026\034Go\034:z)\r1\0271\r\005\007\021\006u\003\031\001&\t\017\005\035\004\001\"\021\002j\0051!/\0328b[\026$RAZA6\003_Bq!!\034\002f\001\007!*\001\003ge>l\007bBA\036\003K\002\rA\023\005\b\003g\002A\021IA;\003=\031X\r\036'bgRlu\016Z5gS\026$G#\0024\002x\005e\004B\002%\002r\001\007!\nC\004\002|\005E\004\031\0018\002\tQLW.\032\005\b\003\002A\021IAA\003\021y\007/\0328\025\013E\n\031)!\"\t\r!\013i\b1\001K\021!\t9)! A\002\005%\025\001B7pI\026\0042aFAF\023\r\ti\t\007\002\005\033>$W\rC\004\002\022\002!\t%a%\002\023\035,G\017S1oI2,GcA\035\002\026\"11)a$A\002EBQA\033\001\005B}Aq!a'\001\t\003\ni*\001\003m_\006$Gc\001\021\002 \"A\021\021UAM\001\004\t\031+A\002oER\004B!!*\00226\021\021q\025\006\005\003C\013IK\003\003\002,\0065\026!C7j]\026\034'/\0314u\025\t\ty+A\002oKRLA!a-\002(\nqaJ\021+UC\036\034u.\0349pk:$\007bBA\\\001\021\005\023\021X\001\005g\0064X\rF\002!\003wC\001\"!)\0026\002\007\0211\025\005\b\003\003a\021CAa\003Ay\007/\0328J]B,Ho\0215b]:,G\016\006\003\002D\006%\007\003B\021\002FZK1!a2#\005\031y\005\017^5p]\"1\001*!0A\002)3a!!4\001\021\005='AE%oaV$8\013\036:fC6\034\005.\0318oK2\034B!a3\017-\"Y\0211[Af\005\013\007I\021AAk\003-Ig\016];u'R\024X-Y7\026\005\005]\007\003BAm\003?l!!a7\013\007\005u'#\001\002j_&!\021\021]An\005-Ie\016];u'R\024X-Y7\t\027\005\025\0301\032B\001B\003%\021q[\001\rS:\004X\017^*ue\026\fW\016\t\005\t\003+\tY\r\"\001\002jR!\0211^Aw!\r)\0241\032\005\t\003'\f9\0171\001\002X\"IA-a3A\002\023\005\021\021_\013\002M\"Q\021Q_Af\001\004%\t!a>\002\025%\034x\n]3o?\022*\027\017F\002!\003sD\021\"a?\002t\006\005\t\031\0014\002\007a$\023\007\003\005\002\000\006-\007\025)\003g\003\035I7o\0249f]\002B\021Ba\001\002L\002\007I\021B7\002\023A|7/\033;j_:|\006B\003B\004\003\027\004\r\021\"\003\003\n\005i\001o\\:ji&|gnX0%KF$2\001\tB\006\021%\tYP!\002\002\002\003\007a\016\003\005\003\020\005-\007\025)\003o\003)\001xn]5uS>tw\f\t\005\007U\006-G\021I\020\t\r1\fY\r\"\021n\021\035a\0271\032C!\005/!2A\034B\r\021\031!(Q\003a\001]\"9a/a3\005B\tuAcA\031\003 !1\021Pa\007A\002i\004")
/*     */ public interface InputStreamFileSystem extends FileSystem {
/*     */   void li$cil$oc$server$fs$InputStreamFileSystem$_setter_$li$cil$oc$server$fs$InputStreamFileSystem$$handles_$eq(Map paramMap);
/*     */   
/*     */   Map<Object, Handle> li$cil$oc$server$fs$InputStreamFileSystem$$handles();
/*     */   
/*     */   boolean isReadOnly();
/*     */   
/*     */   boolean delete(String paramString);
/*     */   
/*     */   boolean makeDirectory(String paramString);
/*     */   
/*     */   boolean rename(String paramString1, String paramString2);
/*     */   
/*     */   boolean setLastModified(String paramString, long paramLong);
/*     */   
/*     */   int open(String paramString, Mode paramMode);
/*     */   
/*     */   li.cil.oc.api.fs.Handle getHandle(int paramInt);
/*     */   
/*     */   void close();
/*     */   
/*     */   void load(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   void save(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   Option<InputChannel> openInputChannel(String paramString);
/*     */   
/*     */   public final class InputStreamFileSystem$$anonfun$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*  36 */     public final int apply() { return apply$mcI$sp(); } public static final long serialVersionUID = 0L; public int apply$mcI$sp() { return (int)(Math.random() * 2147483647) + 1; } public InputStreamFileSystem$$anonfun$1(InputStreamFileSystem $outer) {} } public final class InputStreamFileSystem$$anonfun$2 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int key) { return apply$mcZI$sp(key); } public boolean apply$mcZI$sp(int key) { return this.$outer.li$cil$oc$server$fs$InputStreamFileSystem$$handles().contains(BoxesRunTime.boxToInteger(key)); }
/*     */ 
/*     */     
/*     */     public InputStreamFileSystem$$anonfun$2(InputStreamFileSystem $outer) {} }
/*     */ 
/*     */   
/*     */   public final class InputStreamFileSystem$$anonfun$close$1
/*     */     extends AbstractFunction1<Handle, BoxedUnit>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public InputStreamFileSystem$$anonfun$close$1(InputStreamFileSystem $outer) {}
/*     */     
/*     */     public final void apply(InputStreamFileSystem.Handle handle) {
/*  50 */       handle.close();
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InputStreamFileSystem$$anonfun$load$1 extends AbstractFunction1<Object, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NBTTagList handlesNbt$2;
/*     */     
/*  58 */     public final NBTTagCompound apply(int x$1) { return this.handlesNbt$2.func_150305_b(x$1); } public InputStreamFileSystem$$anonfun$load$1(InputStreamFileSystem $outer, NBTTagList handlesNbt$2) {} } public final class InputStreamFileSystem$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, Object> implements Serializable { public static final long serialVersionUID = 0L; public InputStreamFileSystem$$anonfun$load$2(InputStreamFileSystem $outer) {} public final Object apply(NBTTagCompound handleNbt) { BoxedUnit boxedUnit;
/*  59 */       int handle = handleNbt.func_74762_e("handle");
/*  60 */       String path = handleNbt.func_74779_i("path");
/*  61 */       long position = handleNbt.func_74763_f("position");
/*  62 */       Option<InputStreamFileSystem.InputChannel> option = this.$outer.openInputChannel(path);
/*  63 */       if (option instanceof Some) { Some some = (Some)option; InputStreamFileSystem.InputChannel channel = (InputStreamFileSystem.InputChannel)some.x();
/*  64 */         InputStreamFileSystem.Handle fileHandle = new InputStreamFileSystem.Handle(this.$outer, this.$outer, handle, path, channel);
/*  65 */         channel.position(position);
/*  66 */         MapLike mapLike = this.$outer.li$cil$oc$server$fs$InputStreamFileSystem$$handles().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(handle)), fileHandle)); }
/*  67 */       else { boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */       return boxedUnit; }
/*     */      }
/*     */   public final class InputStreamFileSystem$$anonfun$save$1 extends AbstractFunction1<Handle, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList handlesNbt$1;
/*     */     public InputStreamFileSystem$$anonfun$save$1(InputStreamFileSystem $outer, NBTTagList handlesNbt$1) {}
/*     */     
/*     */     public final void apply(InputStreamFileSystem.Handle file) {
/*  75 */       Predef$.MODULE$.assert(file.channel().isOpen());
/*  76 */       NBTTagCompound handleNbt = new NBTTagCompound();
/*  77 */       handleNbt.func_74768_a("handle", file.handle());
/*  78 */       handleNbt.func_74778_a("path", file.path());
/*  79 */       handleNbt.func_74772_a("position", file.position());
/*  80 */       this.handlesNbt$1.func_74742_a((NBTBase)handleNbt);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract class InputChannel$class
/*     */   {
/*     */     public static void $init$(InputStreamFileSystem.InputChannel $this) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static int read(InputStreamFileSystem.InputChannel $this, ByteBuffer dst) {
/* 105 */       int count = package$.MODULE$.max(0, dst.limit() - dst.position());
/* 106 */       byte[] buffer = new byte[count];
/* 107 */       int n = $this.read(buffer);
/* 108 */       (n > 0) ? dst.put(buffer, 0, n) : BoxedUnit.UNIT;
/* 109 */       return dst.hasArray() ? $this.read(dst.array()) : n;
/*     */     } }
/*     */   public class InputStreamChannel implements InputChannel { private final InputStream inputStream; private boolean isOpen;
/*     */     private long position_;
/*     */     
/* 114 */     public int read(ByteBuffer dst) { return InputStreamFileSystem.InputChannel$class.read(this, dst); } public InputStream inputStream() { return this.inputStream; } public InputStreamChannel(InputStreamFileSystem $outer, InputStream inputStream) { InputStreamFileSystem.InputChannel$class.$init$(this);
/* 115 */       this.isOpen = true;
/*     */       
/* 117 */       this.position_ = 0L; } public boolean isOpen() { return this.isOpen; } public void isOpen_$eq(boolean x$1) { this.isOpen = x$1; } private long position_() { return this.position_; } private void position__$eq(long x$1) { this.position_ = x$1; }
/*     */      public void close() {
/* 119 */       if (isOpen()) {
/* 120 */         isOpen_$eq(false);
/* 121 */         inputStream().close();
/*     */       } 
/*     */     } public long position() {
/* 124 */       return position_();
/*     */     }
/*     */     public long position(long newPosition) {
/* 127 */       inputStream().reset();
/* 128 */       position__$eq(inputStream().skip(newPosition));
/* 129 */       return position_();
/*     */     }
/*     */     
/*     */     public int read(byte[] dst) {
/* 133 */       int read = inputStream().read(dst);
/* 134 */       position__$eq(position_() + read);
/* 135 */       return read;
/*     */     } }
/*     */   public class Handle implements li.cil.oc.api.fs.Handle { private final InputStreamFileSystem owner; private final int handle;
/*     */     private final String path;
/*     */     private final InputStreamFileSystem.InputChannel channel;
/*     */     
/* 141 */     public InputStreamFileSystem owner() { return this.owner; } public int handle() { return this.handle; } public String path() { return this.path; } public InputStreamFileSystem.InputChannel channel() { return this.channel; } public Handle(InputStreamFileSystem $outer, InputStreamFileSystem owner, int handle, String path, InputStreamFileSystem.InputChannel channel) {} public long position() {
/* 142 */       return channel().position();
/*     */     } public long length() {
/* 144 */       return owner().size(path());
/*     */     } public void close() {
/* 146 */       if (channel().isOpen()) {
/* 147 */         owner().li$cil$oc$server$fs$InputStreamFileSystem$$handles().$minus$eq(BoxesRunTime.boxToInteger(handle()));
/* 148 */         channel().close();
/*     */       } 
/*     */     } public int read(byte[] into) {
/* 151 */       return channel().read(into);
/*     */     } public long seek(long to) {
/* 153 */       return channel().position(to);
/*     */     } public Nothing$ write(byte[] value) {
/* 155 */       throw new IOException("bad file descriptor");
/*     */     } }
/*     */ 
/*     */   
/*     */   public interface InputChannel extends ReadableByteChannel {
/*     */     boolean isOpen();
/*     */     
/*     */     void close();
/*     */     
/*     */     long position();
/*     */     
/*     */     long position(long param1Long);
/*     */     
/*     */     int read(byte[] param1ArrayOfbyte);
/*     */     
/*     */     int read(ByteBuffer param1ByteBuffer);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\InputStreamFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */