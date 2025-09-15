/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import li.cil.oc.api.fs.Mode;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.IterableLike;
/*     */ import scala.collection.Seq$;
/*     */ import scala.collection.Traversable;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.immutable.IndexedSeq$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.ArrayBuffer$;
/*     */ import scala.collection.mutable.Iterable$;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Map$;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ import scala.runtime.TraitSetter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\r\005baB\001\003!\003\r\t!\004\002\022-&\024H/^1m\r&dWmU=ti\026l'BA\002\005\003\t17O\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\tA\001\\1oO*\t1#\001\003kCZ\f\027BA\013\021\005\031y%M[3diB\021q\003G\007\002\005%\021\021D\001\002\027\037V$\b/\036;TiJ,\027-\034$jY\026\034\026p\035;f[\")1\004\001C\0019\0051A%\0338ji\022\"\022!\b\t\003=\005j\021a\b\006\002A\005)1oY1mC&\021!e\b\002\005+:LG\017C\004%\001\t\007I\021C\023\002\tI|w\016^\013\002MA\021q\005K\007\002\001\031!\021\006\001\005+\005A1\026N\035;vC2$\025N]3di>\024\030pE\002)W9\002\"A\b\027\n\0055z\"AB!osJ+g\r\005\002(_\0319\001\007\001I\001\004#\t$!\004,jeR,\030\r\\(cU\026\034Go\005\0020W!)1d\fC\0019!)Ag\fD\001k\005Y\021n\035#je\026\034Go\034:z+\0051\004C\001\0208\023\tAtDA\004C_>dW-\0318\t\013izc\021A\036\002\tML'0Z\013\002yA\021a$P\005\003}}\021A\001T8oO\"9\001i\fa\001\n\003Y\024\001\0047bgRlu\016Z5gS\026$\007b\002\"0\001\004%\taQ\001\021Y\006\034H/T8eS\032LW\rZ0%KF$\"!\b#\t\017\025\013\025\021!a\001y\005\031\001\020J\031\t\r\035{\003\025)\003=\0035a\027m\035;N_\022Lg-[3eA!)\021j\fC\001\025\006!An\\1e)\ti2\nC\003M\021\002\007Q*A\002oER\004\"A\024+\016\003=S!\001\024)\013\005E\023\026!C7j]\026\034'/\0314u\025\005\031\026a\0018fi&\021Qk\024\002\017\035\n#F+Y4D_6\004x.\0368e\021\0259v\006\"\001Y\003\021\031\030M^3\025\005uI\006\"\002'W\001\004i\005\"B.0\t\003a\026aA4fiR\021Q\f\031\t\004=ys\023BA0 \005\031y\005\017^5p]\")\021M\027a\001E\006!\001/\031;i!\r\0317N\034\b\003I&t!!\0325\016\003\031T!a\032\007\002\rq\022xn\034;?\023\005\001\023B\0016 \003\035\001\030mY6bO\026L!\001\\7\003\021%#XM]1cY\026T!A[\020\021\005=\024hB\001\020q\023\t\tx$\001\004Qe\026$WMZ\005\003gR\024aa\025;sS:<'BA9 \021\0251xF\"\0016\003%\031\027M\034#fY\026$X\rC\003yQ\021\005\0210\001\004=S:LGO\020\013\002M!91\020\013b\001\n\003a\030\001C2iS2$'/\0328\026\003u\004RA`A\004]:j\021a \006\005\003\003\t\031!A\004nkR\f'\r\\3\013\007\005\025q$\001\006d_2dWm\031;j_:L1!!\003\000\005\ri\025\r\035\005\b\003\033A\003\025!\003~\003%\031\007.\0337ee\026t\007\005C\0035Q\021\005S\007C\003;Q\021\0053\bC\004\002\026!\"\t!a\006\002\t1L7\017\036\013\003\0033\001RAHA\016\003?I1!!\b \005\025\t%O]1z!\ry\021\021E\005\003gBAq!!\n)\t\003\t9#A\007nC.,G)\033:fGR|'/\037\013\004m\005%\002bBA\026\003G\001\rA\\\001\005]\006lW\rC\004\0020!\"\t!!\r\002\r\021,G.\032;f)\r1\0241\007\005\b\003W\ti\0031\001o\021\035\t9\004\013C\001\003s\tQ\001^8vG\"$B!a\017\003|A!aDXA\037!\r9\023q\b\004\007\003\003\002\001\"a\021\003\027YK'\017^;bY\032KG.Z\n\005\003Yc\006C\004y\003!\t!a\022\025\005\005u\002BCA&\003\021\r\021\"\001\002N\005!A-\031;b+\t\ty\005E\003\003#\n)&C\002\002T}\0241\"\021:sCf\024UO\0324feB\031a$a\026\n\007\005esD\001\003CsR,\007\"CA/\003\001\013\021BA(\003\025!\027\r^1!\021)\t\t'a\020A\002\023\005\0211M\001\007Q\006tG\r\\3\026\005\005\025\004\003\002\020_\003O\0022aJA5\r\031\tY\007\001\005\002n\t\031b+\033:uk\006dw*\036;qkRD\025M\0343mKN!\021\021NA8!\r9\023\021O\005\004\003gB\"\001D(viB,H\017S1oI2,\007bCA<\003S\022)\031!C\001\003s\nAAZ5mKV\021\021Q\b\005\f\003{\nIG!A!\002\023\ti$A\003gS2,\007\005\003\007\002\002\006%$\021!Q\001\nY\t\031)A\003po:,'/\003\003\002\002\006E\004\"DA1\003S\022\t\021)A\005\003\017\013i\tE\002\037\003\023K1!a# \005\rIe\016^\005\005\003C\n\t\bC\006b\003S\022\t\021)A\005]\006E\025bA1\002r!9\0010!\033\005\002\005UECCA4\003/\013I*a'\002\036\"A\021qOAJ\001\004\ti\004C\004\002\002\006M\005\031\001\f\t\021\005\005\0241\023a\001\003\017Ca!YAJ\001\004q\007\002CAQ\003S\"\t%a)\002\r1,gn\032;i)\005a\004\"CAT\003S\002\r\021\"\001<\003!\001xn]5uS>t\007BCAV\003S\002\r\021\"\001\002.\006a\001o\\:ji&|gn\030\023fcR\031Q$a,\t\021\025\013I+!AA\002qB\001\"a-\002j\001\006K\001P\001\na>\034\030\016^5p]\002Bq!a.\002j\021\005C$A\003dY>\034X\r\003\005\002<\006%D\021IA_\003\021\031X-Z6\025\007q\ny\fC\004\002B\006e\006\031\001\037\002\005Q|\007\002CAc\003S\"\t%a2\002\013]\024\030\016^3\025\007u\tI\r\003\005\002L\006\r\007\031AAg\003\005\021\007#\002\020\002\034\005U\003BCAi\003\001\r\021\"\001\002T\006Q\001.\0318eY\026|F%Z9\025\007u\t)\016C\005F\003\037\f\t\0211\001\002f!I\021\021\\A A\003&\021QM\001\bQ\006tG\r\\3!\021\031!\024q\bC!k!1!(a\020\005BmB\001\"!9\002@\021\005\0211]\001\020_B,g.\0238qkR\034FO]3b[R\021\021Q\035\t\006=\005\035\0301^\005\004\003S|\"\001B*p[\026\0042aJAw\r\031\ty\017\001\005\002r\n1b+\033:uk\006dg)\0337f\023:\004X\017^*ue\026\fWn\005\003\002n\006M\b\003BA{\003wl!!a>\013\007\005e(#\001\002j_&!\021Q`A|\005-Ie\016];u'R\024X-Y7\t\027\005]\024Q\036BC\002\023\005\021\021\020\005\f\003{\niO!A!\002\023\ti\004C\004y\003[$\tA!\002\025\t\005-(q\001\005\t\003o\022\031\0011\001\002>!I!1BAw\001\004%I!N\001\tSN\034En\\:fI\"Q!qBAw\001\004%IA!\005\002\031%\0348\t\\8tK\022|F%Z9\025\007u\021\031\002\003\005F\005\033\t\t\0211\0017\021!\0219\"!<!B\0231\024!C5t\0072|7/\0323!\021)\t9+!<A\002\023%!1D\013\003\003\017C!\"a+\002n\002\007I\021\002B\020)\ri\"\021\005\005\n\013\nu\021\021!a\001\003\017C\021\"a-\002n\002\006K!a\"\t\021\t\035\022Q\036C!\005S\t\021\"\031<bS2\f'\r\\3\025\005\005\035\005bBA\\\003[$\t\005\b\005\t\005_\ti\017\"\021\003*\005!!/Z1e\021!\021y#!<\005B\tMB\003CAD\005k\0219Da\017\t\021\005-'\021\007a\001\003\033D\001B!\017\0032\001\007\021qQ\001\004_\0324\007\002\003B\037\005c\001\r!a\"\002\0071,g\016C\004\003B\0055H\021\t\017\002\013I,7/\032;\t\021\t\025\023Q\036C!\005\017\nAa]6jaR\031AH!\023\t\017\t-#1\ta\001y\005\ta\016\003\005\003P\005}B\021\001B)\003Ay\007/\0328PkR\004X\017\036%b]\022dW\r\006\006\002f\tM#Q\013B-\0057Bq!!!\003N\001\007a\003\003\005\003X\t5\003\031AAD\003\tIG\r\003\004b\005\033\002\rA\034\005\t\005;\022i\0051\001\003`\005!Qn\0343f!\021\021\tG!\033\016\005\t\r$bA\002\003f)\031!q\r\004\002\007\005\004\030.\003\003\003l\t\r$\001B'pI\026Dq!SA \t\003\022y\007F\002\036\005cBa\001\024B7\001\004i\005bB,\002@\021\005#Q\017\013\004;\t]\004B\002'\003t\001\007Q\n\003\004w\003!\t%\016\005\b\003W\t)\0041\001o\021\031I\005\006\"\021\003\000Q\031QD!!\t\r1\023i\b1\001N\021\0319\006\006\"\021\003\006R\031QDa\"\t\r1\023\031\t1\001N\021\031Y\006\006\"\021\003\fR\031QL!$\t\r\005\024I\t1\001c\021\0251\b\006\"\0216\021\035\021\031\n\001Q\001\n\031\nQA]8pi\002BqAa&\001\t\003\022I*\001\004fq&\034Ho\035\013\004m\tm\005BB1\003\026\002\007a\016\003\0045\001\021\005#q\024\013\004m\t\005\006BB1\003\036\002\007a\016\003\004;\001\021\005#Q\025\013\004y\t\035\006BB1\003$\002\007a\016\003\004A\001\021\005#1\026\013\004y\t5\006BB1\003*\002\007a\016C\004\002\026\001!\tE!-\025\t\005e!1\027\005\007C\n=\006\031\0018\t\017\005=\002\001\"\021\0038R\031aG!/\t\r\005\024)\f1\001o\021\035\t)\003\001C!\005{#2A\016B`\021\031\t'1\030a\001]\"9!1\031\001\005B\t\025\027A\002:f]\006lW\rF\0037\005\017\024Y\rC\004\003J\n\005\007\031\0018\002\t\031\024x.\034\005\b\003\003\024\t\r1\001o\021\035\021y\r\001C!\005#\fqb]3u\031\006\034H/T8eS\032LW\r\032\013\006m\tM'Q\033\005\007C\n5\007\031\0018\t\017\t]'Q\032a\001y\005!A/[7f\021\035\021Y\016\001C\t\005;\f\001c\0349f]&s\007/\036;DQ\006tg.\0327\025\t\t}'1\036\t\005=y\023\t\017E\002(\005GLAA!:\003h\na\021J\0349vi\016C\027M\0348fY&\031!\021\036\002\003+%s\007/\036;TiJ,\027-\034$jY\026\034\026p\035;f[\"1\021M!7A\0029DqAa\024\001\t#\021y\017\006\005\003r\nM(Q\037B|!\021qb,a\034\t\021\t]#Q\036a\001\003\017Ca!\031Bw\001\004q\007\002\003B/\005[\004\rAa\030\t\r%\003A\021\tB~)\ri\"Q \005\007\031\ne\b\031A'\t\r]\003A\021IB\001)\ri21\001\005\007\031\n}\b\031A'\t\017\r\035\001\001\"\005\004\n\005A1/Z4nK:$8\017\006\003\002\032\r-\001BB1\004\006\001\007a\016\003\b\004\020\001\001\n1!A\001\n\023\031\tb!\006\002\025M,\b/\032:%Y>\fG\rF\002\036\007'Aa\001TB\007\001\004i\025BA%\031\0219\031I\002\001I\001\004\003\005I\021BB\016\007?\t!b];qKJ$3/\031<f)\ri2Q\004\005\007\031\016]\001\031A'\n\005]C\002")
/*     */ public interface VirtualFileSystem
/*     */   extends OutputStreamFileSystem
/*     */ {
/*     */   void li$cil$oc$server$fs$VirtualFileSystem$_setter_$root_$eq(VirtualDirectory paramVirtualDirectory);
/*     */   
/*     */   VirtualDirectory root();
/*     */   
/*     */   boolean exists(String paramString);
/*     */   
/*     */   boolean isDirectory(String paramString);
/*     */   
/*     */   long size(String paramString);
/*     */   
/*     */   long lastModified(String paramString);
/*     */   
/*     */   String[] list(String paramString);
/*     */   
/*     */   boolean delete(String paramString);
/*     */   
/*     */   boolean makeDirectory(String paramString);
/*     */   
/*     */   boolean rename(String paramString1, String paramString2);
/*     */   
/*     */   boolean setLastModified(String paramString, long paramLong);
/*     */   
/*     */   Option<InputStreamFileSystem.InputChannel> openInputChannel(String paramString);
/*     */   
/*     */   Option<OutputStreamFileSystem.OutputHandle> openOutputHandle(int paramInt, String paramString, Mode paramMode);
/*     */   
/*     */   void load(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   void save(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   String[] segments(String paramString);
/*     */   
/*     */   public final class VirtualFileSystem$$anonfun$openInputChannel$1
/*     */     extends AbstractFunction1<VirtualFileInputStream, InputStreamFileSystem.InputStreamChannel>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final InputStreamFileSystem.InputStreamChannel apply(VirtualFileSystem.VirtualFileInputStream x$1) {
/* 109 */       return new InputStreamFileSystem.InputStreamChannel(this.$outer, x$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public VirtualFileSystem$$anonfun$openInputChannel$1(VirtualFileSystem $outer) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class VirtualFileSystem$$anonfun$segments$1
/*     */     extends AbstractFunction1<String, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(String x$2) {
/* 141 */       String str = ""; if (x$2 == null) { if (str != null); } else if (x$2.equals(str))
/*     */       {  }
/*     */     
/*     */     }
/*     */     
/*     */     public VirtualFileSystem$$anonfun$segments$1(VirtualFileSystem $outer) {}
/*     */   }
/*     */   
/*     */   public abstract class VirtualObject$class { public static void $init$(VirtualFileSystem.VirtualObject $this) {
/* 150 */       $this.lastModified_$eq(System.currentTimeMillis());
/*     */     }
/*     */     public static void load(VirtualFileSystem.VirtualObject $this, NBTTagCompound nbt) {
/* 153 */       if (nbt.func_74764_b("lastModified"))
/* 154 */         $this.lastModified_$eq(nbt.func_74763_f("lastModified")); 
/*     */     }
/*     */     
/*     */     public static void save(VirtualFileSystem.VirtualObject $this, NBTTagCompound nbt) {
/* 158 */       nbt.func_74772_a("lastModified", $this.lastModified());
/*     */     }
/*     */     
/*     */     public static Option get(VirtualFileSystem.VirtualObject $this, Iterable path) {
/* 162 */       return path.isEmpty() ? (Option)new Some($this) : (Option)None$.MODULE$;
/*     */     } }
/*     */   
/*     */   public class VirtualFile implements VirtualObject { private final ArrayBuffer<Object> data;
/*     */     private Option<VirtualFileSystem.VirtualOutputHandle> handle;
/*     */     private long lastModified;
/*     */     
/* 169 */     public long lastModified() { return this.lastModified; } @TraitSetter public void lastModified_$eq(long x$1) { this.lastModified = x$1; } public Option<VirtualFileSystem.VirtualObject> get(Iterable path) { return VirtualFileSystem.VirtualObject$class.get(this, path); } public VirtualFile(VirtualFileSystem $outer) { VirtualFileSystem.VirtualObject$class.$init$(this);
/* 170 */       this.data = (ArrayBuffer<Object>)ArrayBuffer$.MODULE$.empty();
/*     */       
/* 172 */       this.handle = (Option<VirtualFileSystem.VirtualOutputHandle>)None$.MODULE$; } public ArrayBuffer<Object> data() { return this.data; } public Option<VirtualFileSystem.VirtualOutputHandle> handle() { return this.handle; } public void handle_$eq(Option<VirtualFileSystem.VirtualOutputHandle> x$1) { this.handle = x$1; }
/*     */      public boolean isDirectory() {
/* 174 */       return false;
/*     */     } public long size() {
/* 176 */       return data().length();
/*     */     } public Some<VirtualFileSystem.VirtualFileInputStream> openInputStream() {
/* 178 */       return new Some(new VirtualFileSystem.VirtualFileInputStream(li$cil$oc$server$fs$VirtualFileSystem$VirtualFile$$$outer(), this));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Option<VirtualFileSystem.VirtualOutputHandle> openOutputHandle(OutputStreamFileSystem owner, int id, String path, Mode mode) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual handle : ()Lscala/Option;
/*     */       //   4: invokevirtual isDefined : ()Z
/*     */       //   7: ifeq -> 16
/*     */       //   10: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   13: goto -> 88
/*     */       //   16: aload #4
/*     */       //   18: getstatic li/cil/oc/api/fs/Mode.Write : Lli/cil/oc/api/fs/Mode;
/*     */       //   21: astore #5
/*     */       //   23: dup
/*     */       //   24: ifnonnull -> 36
/*     */       //   27: pop
/*     */       //   28: aload #5
/*     */       //   30: ifnull -> 44
/*     */       //   33: goto -> 58
/*     */       //   36: aload #5
/*     */       //   38: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   41: ifeq -> 58
/*     */       //   44: aload_0
/*     */       //   45: invokevirtual data : ()Lscala/collection/mutable/ArrayBuffer;
/*     */       //   48: invokevirtual clear : ()V
/*     */       //   51: aload_0
/*     */       //   52: invokestatic currentTimeMillis : ()J
/*     */       //   55: invokevirtual lastModified_$eq : (J)V
/*     */       //   58: aload_0
/*     */       //   59: new scala/Some
/*     */       //   62: dup
/*     */       //   63: new li/cil/oc/server/fs/VirtualFileSystem$VirtualOutputHandle
/*     */       //   66: dup
/*     */       //   67: aload_0
/*     */       //   68: invokevirtual li$cil$oc$server$fs$VirtualFileSystem$VirtualFile$$$outer : ()Lli/cil/oc/server/fs/VirtualFileSystem;
/*     */       //   71: aload_0
/*     */       //   72: aload_1
/*     */       //   73: iload_2
/*     */       //   74: aload_3
/*     */       //   75: invokespecial <init> : (Lli/cil/oc/server/fs/VirtualFileSystem;Lli/cil/oc/server/fs/VirtualFileSystem$VirtualFile;Lli/cil/oc/server/fs/OutputStreamFileSystem;ILjava/lang/String;)V
/*     */       //   78: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   81: invokevirtual handle_$eq : (Lscala/Option;)V
/*     */       //   84: aload_0
/*     */       //   85: invokevirtual handle : ()Lscala/Option;
/*     */       //   88: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #181	-> 0
/*     */       //   #183	-> 16
/*     */       //   #184	-> 44
/*     */       //   #185	-> 51
/*     */       //   #187	-> 58
/*     */       //   #188	-> 84
/*     */       //   #181	-> 88
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	89	0	this	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualFile;
/*     */       //   0	89	1	owner	Lli/cil/oc/server/fs/OutputStreamFileSystem;
/*     */       //   0	89	2	id	I
/*     */       //   0	89	3	path	Ljava/lang/String;
/*     */       //   0	89	4	mode	Lli/cil/oc/api/fs/Mode;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void load(NBTTagCompound nbt) {
/* 192 */       VirtualFileSystem.VirtualObject$class.load(this, nbt);
/* 193 */       data().clear();
/* 194 */       data().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.byteArrayOps(nbt.func_74770_j("data")));
/*     */     }
/*     */     
/*     */     public void save(NBTTagCompound nbt) {
/* 198 */       VirtualFileSystem.VirtualObject$class.save(this, nbt);
/* 199 */       nbt.func_74773_a("data", (byte[])data().toArray(ClassTag$.MODULE$.Byte()));
/*     */     }
/*     */     public boolean canDelete() {
/* 202 */       return handle().isEmpty();
/*     */     } }
/*     */   public class VirtualDirectory implements VirtualObject { private final Map<String, VirtualFileSystem.VirtualObject> children;
/*     */     private long lastModified;
/*     */     
/* 207 */     public long lastModified() { return this.lastModified; } @TraitSetter public void lastModified_$eq(long x$1) { this.lastModified = x$1; } public VirtualDirectory(VirtualFileSystem $outer) { VirtualFileSystem.VirtualObject$class.$init$(this);
/* 208 */       this.children = Map$.MODULE$.empty(); } public Map<String, VirtualFileSystem.VirtualObject> children() { return this.children; }
/*     */      public boolean isDirectory() {
/* 210 */       return true;
/*     */     } public long size() {
/* 212 */       return 0L;
/*     */     }
/* 214 */     public String[] list() { return (String[])((TraversableOnce)children().map((Function1)new VirtualFileSystem$VirtualDirectory$$anonfun$list$1(this), Iterable$.MODULE$.canBuildFrom()))
/*     */         
/* 216 */         .toArray(ClassTag$.MODULE$.apply(String.class)); } public final class VirtualFileSystem$VirtualDirectory$$anonfun$list$1 extends AbstractFunction1<Tuple2<String, VirtualFileSystem.VirtualObject>, String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final String apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/*     */           String childName = (String)tuple2._1(); VirtualFileSystem.VirtualObject child = (VirtualFileSystem.VirtualObject)tuple2._2(); return child.isDirectory() ? (new StringBuilder()).append(childName).append("/").toString() : childName;
/*     */         } 
/*     */         throw new MatchError(tuple2); } public VirtualFileSystem$VirtualDirectory$$anonfun$list$1(VirtualFileSystem.VirtualDirectory $outer) {} }
/* 221 */     public boolean makeDirectory(String name) { children().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), new VirtualDirectory(li$cil$oc$server$fs$VirtualFileSystem$VirtualDirectory$$$outer())));
/* 222 */       lastModified_$eq(System.currentTimeMillis());
/*     */       return !children().contains(name); }
/*     */ 
/*     */     
/*     */     public boolean delete(String name) {
/* 227 */       Option option = children().get(name);
/* 228 */       if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject child = (VirtualFileSystem.VirtualObject)some.x(); if (child.canDelete()) {
/* 229 */           children().$minus$eq(name);
/* 230 */           lastModified_$eq(System.currentTimeMillis());
/*     */           return true;
/*     */         }  }
/*     */       
/*     */       return false;
/*     */     } public Option<VirtualFileSystem.VirtualFile> touch(String name) {
/*     */       None$ none$;
/* 237 */       Option option = children().get(name);
/* 238 */       if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); if (obj instanceof VirtualFileSystem.VirtualFile) { VirtualFileSystem.VirtualFile virtualFile = (VirtualFileSystem.VirtualFile)obj; return (Option<VirtualFileSystem.VirtualFile>)new Some(virtualFile); }  }
/* 239 */        if (None$.MODULE$.equals(option))
/* 240 */       { VirtualFileSystem.VirtualFile child = new VirtualFileSystem.VirtualFile(li$cil$oc$server$fs$VirtualFileSystem$VirtualDirectory$$$outer());
/* 241 */         children().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), child));
/* 242 */         lastModified_$eq(System.currentTimeMillis());
/* 243 */         Some some = new Some(child); }
/* 244 */       else { none$ = None$.MODULE$; }
/*     */       
/*     */       return (Option<VirtualFileSystem.VirtualFile>)none$;
/*     */     }
/* 248 */     public void load(NBTTagCompound nbt) { VirtualFileSystem.VirtualObject$class.load(this, nbt);
/* 249 */       NBTTagList childrenNbt = nbt.func_150295_c("children", 10); ((IterableLike)RichInt$.MODULE$
/* 250 */         .until$extension0(Predef$.MODULE$.intWrapper(0), childrenNbt.func_74745_c()).map((Function1)new VirtualFileSystem$VirtualDirectory$$anonfun$load$1(this, childrenNbt), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new VirtualFileSystem$VirtualDirectory$$anonfun$load$2(this)); } public final class VirtualFileSystem$VirtualDirectory$$anonfun$load$1 extends AbstractFunction1<Object, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList childrenNbt$1; public final NBTTagCompound apply(int x$1) { return this.childrenNbt$1.func_150305_b(x$1); } public VirtualFileSystem$VirtualDirectory$$anonfun$load$1(VirtualFileSystem.VirtualDirectory $outer, NBTTagList childrenNbt$1) {} }
/* 251 */      public final class VirtualFileSystem$VirtualDirectory$$anonfun$load$2 extends AbstractFunction1<NBTTagCompound, Map<String, VirtualFileSystem.VirtualObject>> implements Serializable { public static final long serialVersionUID = 0L; public VirtualFileSystem$VirtualDirectory$$anonfun$load$2(VirtualFileSystem.VirtualDirectory $outer) {} public final Map<String, VirtualFileSystem.VirtualObject> apply(NBTTagCompound childNbt) { VirtualFileSystem.VirtualObject child = 
/* 252 */           childNbt.func_74767_n("isDirectory") ? new VirtualFileSystem.VirtualDirectory(this.$outer.li$cil$oc$server$fs$VirtualFileSystem$VirtualDirectory$$$outer()) : 
/* 253 */           new VirtualFileSystem.VirtualFile(this.$outer.li$cil$oc$server$fs$VirtualFileSystem$VirtualDirectory$$$outer());
/* 254 */         child.load(childNbt);
/* 255 */         return (Map<String, VirtualFileSystem.VirtualObject>)this.$outer.children().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(childNbt.func_74779_i("name")), child)); } } public final class VirtualFileSystem$VirtualDirectory$$anonfun$save$1 extends AbstractFunction1<Tuple2<String, VirtualFileSystem.VirtualObject>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; }
/*     */         else
/*     */         { bool = false; }
/*     */          return bool; } public VirtualFileSystem$VirtualDirectory$$anonfun$save$1(VirtualFileSystem.VirtualDirectory $outer) {}
/* 260 */     } public void save(NBTTagCompound nbt) { VirtualFileSystem.VirtualObject$class.save(this, nbt);
/* 261 */       NBTTagList childrenNbt = new NBTTagList();
/* 262 */       children().withFilter((Function1)new VirtualFileSystem$VirtualDirectory$$anonfun$save$1(this)).foreach((Function1)new VirtualFileSystem$VirtualDirectory$$anonfun$save$2(this, childrenNbt));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 269 */       nbt.func_74782_a("children", (NBTBase)childrenNbt); }
/*     */     public final class VirtualFileSystem$VirtualDirectory$$anonfun$save$2 extends AbstractFunction1<Tuple2<String, VirtualFileSystem.VirtualObject>, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final NBTTagList childrenNbt$2; public final void apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) {
/*     */           String childName = (String)tuple2._1(); VirtualFileSystem.VirtualObject child = (VirtualFileSystem.VirtualObject)tuple2._2(); NBTTagCompound childNbt = new NBTTagCompound(); childNbt.func_74757_a("isDirectory", child.isDirectory()); childNbt.func_74778_a("name", childName); child.save(childNbt); this.childrenNbt$2.func_74742_a((NBTBase)childNbt); BoxedUnit boxedUnit = BoxedUnit.UNIT; return;
/* 273 */         }  throw new MatchError(tuple2); } public VirtualFileSystem$VirtualDirectory$$anonfun$save$2(VirtualFileSystem.VirtualDirectory $outer, NBTTagList childrenNbt$2) {} } public Option<VirtualFileSystem.VirtualObject> get(Iterable path) { return VirtualFileSystem.VirtualObject$class.get(this, path).orElse(
/* 274 */           (Function0)new VirtualFileSystem$VirtualDirectory$$anonfun$get$1(this, path)); } public final class VirtualFileSystem$VirtualDirectory$$anonfun$get$1 extends AbstractFunction0<Option<VirtualFileSystem.VirtualObject>> implements Serializable { public static final long serialVersionUID = 0L; private final Iterable path$1; public final Option<VirtualFileSystem.VirtualObject> apply() { None$ none$; Option option = this.$outer.children().get(this.path$1.head());
/* 275 */         if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject child = (VirtualFileSystem.VirtualObject)some.x(); Option<VirtualFileSystem.VirtualObject> option1 = child.get((Iterable<String>)this.path$1.drop(1)); }
/* 276 */         else { none$ = None$.MODULE$; }
/*     */         
/*     */         return (Option<VirtualFileSystem.VirtualObject>)none$; }
/*     */        public VirtualFileSystem$VirtualDirectory$$anonfun$get$1(VirtualFileSystem.VirtualDirectory $outer, Iterable path$1) {} } public boolean canDelete() {
/* 280 */       return children().isEmpty();
/*     */     } }
/*     */   
/*     */   public class VirtualFileInputStream extends InputStream { private final VirtualFileSystem.VirtualFile file;
/*     */     
/* 285 */     public VirtualFileSystem.VirtualFile file() { return this.file; } private boolean isClosed = false;
/* 286 */     private boolean isClosed() { return this.isClosed; } private void isClosed_$eq(boolean x$1) { this.isClosed = x$1; }
/*     */     
/* 288 */     private int position = 0; private int position() { return this.position; } private void position_$eq(int x$1) { this.position = x$1; }
/*     */     
/*     */     public int available() {
/* 291 */       return isClosed() ? 0 : 
/* 292 */         package$.MODULE$.max(file().data().length() - position(), 0);
/*     */     } public void close() {
/* 294 */       isClosed_$eq(true);
/*     */     }
/*     */     
/* 297 */     public int read() { if (isClosed())
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 304 */         throw new IOException("file is closed"); } 
/*     */       position_$eq(position() + 1);
/*     */       return (available() == 0) ? -1 : BoxesRunTime.unboxToByte(file().data().apply(position() - 1)); }
/* 307 */     public int read(byte[] b, int off, int len) { if (isClosed())
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 317 */         throw new IOException("file is closed"); }  int count = available(); int n = package$.MODULE$.min(len, count);
/*     */       file().data().view(position(), file().data().length()).copyToArray(b, off, n);
/*     */       position_$eq(position() + n);
/* 320 */       return (count == 0) ? -1 : n; } public void reset() { if (isClosed())
/*     */       {
/*     */         
/* 323 */         throw new IOException("file is closed"); } 
/*     */       position_$eq(0); }
/*     */      public long skip(long n) {
/* 326 */       if (isClosed())
/*     */       {
/*     */ 
/*     */         
/* 330 */         throw new IOException("file is closed"); } 
/*     */       position_$eq(package$.MODULE$.min((int)(position() + n), 2147483647));
/*     */       return position();
/*     */     } public VirtualFileInputStream(VirtualFileSystem $outer, VirtualFileSystem.VirtualFile file) {} }
/*     */   public class VirtualOutputHandle extends OutputStreamFileSystem.OutputHandle { private final VirtualFileSystem.VirtualFile file; private long position;
/* 335 */     public VirtualFileSystem.VirtualFile file() { return this.file; } public VirtualOutputHandle(VirtualFileSystem $outer, VirtualFileSystem.VirtualFile file, OutputStreamFileSystem owner, int handle, String path) { super($outer, owner, handle, path);
/*     */ 
/*     */       
/* 338 */       this.position = file.data().length(); } public long length() { return file().size(); } public long position() { return this.position; } public void position_$eq(long x$1) { this.position = x$1; }
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual isClosed : ()Z
/*     */       //   4: ifne -> 63
/*     */       //   7: aload_0
/*     */       //   8: invokespecial close : ()V
/*     */       //   11: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   14: aload_0
/*     */       //   15: invokevirtual file : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualFile;
/*     */       //   18: invokevirtual handle : ()Lscala/Option;
/*     */       //   21: invokevirtual get : ()Ljava/lang/Object;
/*     */       //   24: aload_0
/*     */       //   25: astore_1
/*     */       //   26: dup
/*     */       //   27: ifnonnull -> 38
/*     */       //   30: pop
/*     */       //   31: aload_1
/*     */       //   32: ifnull -> 45
/*     */       //   35: goto -> 49
/*     */       //   38: aload_1
/*     */       //   39: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   42: ifeq -> 49
/*     */       //   45: iconst_1
/*     */       //   46: goto -> 50
/*     */       //   49: iconst_0
/*     */       //   50: invokevirtual assert : (Z)V
/*     */       //   53: aload_0
/*     */       //   54: invokevirtual file : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualFile;
/*     */       //   57: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   60: invokevirtual handle_$eq : (Lscala/Option;)V
/*     */       //   63: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #340	-> 0
/*     */       //   #341	-> 7
/*     */       //   #342	-> 11
/*     */       //   #343	-> 53
/*     */       //   #340	-> 63
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	64	0	this	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualOutputHandle;
/*     */     }
/*     */     
/*     */     public long seek(long to) {
/* 347 */       if (to < 0L) throw new IOException("invalid offset"); 
/* 348 */       position_$eq(to);
/* 349 */       return position();
/*     */     }
/*     */     
/*     */     public void write(byte[] b) {
/* 353 */       if (isClosed())
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 362 */         throw new IOException("file is closed");
/*     */       }
/*     */       int pos = (int)position();
/*     */       file().data().insertAll(file().data().length(), (Traversable)Seq$.MODULE$.fill(pos + b.length - file().data().length(), (Function0)new VirtualFileSystem$VirtualOutputHandle$$anonfun$write$1(this)));
/*     */       Predef$.MODULE$.byteArrayOps(b).indices().foreach$mVc$sp((Function1)new VirtualFileSystem$VirtualOutputHandle$$anonfun$write$2(this, b, pos));
/*     */       position_$eq(position() + b.length);
/*     */       file().lastModified_$eq(System.currentTimeMillis());
/*     */     }
/*     */     
/*     */     public final class VirtualFileSystem$VirtualOutputHandle$$anonfun$write$1 extends AbstractFunction0.mcB.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final byte apply() {
/*     */         return apply$mcB$sp();
/*     */       }
/*     */       
/*     */       public byte apply$mcB$sp() {
/*     */         return 0;
/*     */       }
/*     */       
/*     */       public VirtualFileSystem$VirtualOutputHandle$$anonfun$write$1(VirtualFileSystem.VirtualOutputHandle $outer) {}
/*     */     }
/*     */     
/*     */     public final class VirtualFileSystem$VirtualOutputHandle$$anonfun$write$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final byte[] b$1;
/*     */       private final int pos$1;
/*     */       
/*     */       public final void apply(int i) {
/*     */         apply$mcVI$sp(i);
/*     */       }
/*     */       
/*     */       public VirtualFileSystem$VirtualOutputHandle$$anonfun$write$2(VirtualFileSystem.VirtualOutputHandle $outer, byte[] b$1, int pos$1) {}
/*     */       
/*     */       public void apply$mcVI$sp(int i) {
/*     */         this.$outer.file().data().update(this.pos$1 + i, BoxesRunTime.boxToByte(this.b$1[i]));
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   public interface VirtualObject {
/*     */     boolean isDirectory();
/*     */     
/*     */     long size();
/*     */     
/*     */     long lastModified();
/*     */     
/*     */     @TraitSetter
/*     */     void lastModified_$eq(long param1Long);
/*     */     
/*     */     void load(NBTTagCompound param1NBTTagCompound);
/*     */     
/*     */     void save(NBTTagCompound param1NBTTagCompound);
/*     */     
/*     */     Option<VirtualObject> get(Iterable<String> param1Iterable);
/*     */     
/*     */     boolean canDelete();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\VirtualFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */