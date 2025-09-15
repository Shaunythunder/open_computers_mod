/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import li.cil.oc.api.fs.Mode;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005]faB\001\003!\003\r\t!\004\002\t\007\006\004\030mY5us*\0211\001B\001\003MNT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]AR\"\001\002\n\005e\021!AF(viB,Ho\025;sK\006lg)\0337f'f\034H/Z7\t\013m\001A\021\001\017\002\r\021Jg.\033;%)\005i\002C\001\020\"\033\005y\"\"\001\021\002\013M\034\027\r\\1\n\005\tz\"\001B+oSRDq\001\n\001A\002\023%Q%\001\003vg\026$W#\001\024\021\005y9\023B\001\025 \005\021auN\\4\t\017)\002\001\031!C\005W\005AQo]3e?\022*\027\017\006\002\036Y!9Q&KA\001\002\0041\023a\001=%c!1q\006\001Q!\n\031\nQ!^:fI\002Bq!\r\001A\002\023%!'\001\bjO:|'/Z\"ba\006\034\027\016^=\026\003M\002\"A\b\033\n\005Uz\"a\002\"p_2,\027M\034\005\bo\001\001\r\021\"\0039\003IIwM\\8sK\016\013\007/Y2jif|F%Z9\025\005uI\004bB\0277\003\003\005\ra\r\005\007w\001\001\013\025B\032\002\037%<gn\034:f\007\006\004\030mY5us\002BQ!\020\001\007\022\025\n\001bY1qC\016LG/\037\005\006\001!\t\005Q\001\013gB\f7-\032+pi\006dG#\001\024\t\013\t\003A\021\t!\002\023M\004\030mY3Vg\026$\007\"\002#\001\t\003*\025A\0023fY\026$X\r\006\0024\r\")qi\021a\001\021\006!\001/\031;i!\tIEJ\004\002\037\025&\0211jH\001\007!J,G-\0324\n\0055s%AB*ue&twM\003\002L?!)\001\013\001C!#\0061!/\0328b[\026$2a\r*U\021\025\031v\n1\001I\003\0211'o\\7\t\013U{\005\031\001%\002\005Q|\007\"B,\001\t\003B\026!D7bW\026$\025N]3di>\024\030\020\006\00243\")qI\026a\001\021\")1\f\001C!9\005)1\r\\8tK\")Q\f\001C!=\006!An\\1e)\tir\fC\003a9\002\007\021-A\002oER\004\"A\0315\016\003\rT!\001\0313\013\005\0254\027!C7j]\026\034'/\0314u\025\0059\027a\0018fi&\021\021n\031\002\017\035\n#F+Y4D_6\004x.\0368e\021\025Y\007\001\"\021m\003\021\031\030M^3\025\005ui\007\"\0021k\001\004\t\007BB8\001!\023E\001/\001\tpa\026tw*\036;qkRD\025M\0343mKR!\021\017_?!\rq\"\017^\005\003g~\021aa\0249uS>t\007CA;w\033\005\001\021BA<\031\0051yU\017\0369vi\"\013g\016\0327f\021\025Ih\0161\001{\003\tIG\r\005\002\037w&\021Ap\b\002\004\023:$\b\"B$o\001\004A\005BB@o\001\004\t\t!\001\003n_\022,\007\003BA\002\003\027i!!!\002\013\007\r\t9AC\002\002\n\031\t1!\0319j\023\021\ti!!\002\003\t5{G-\032\005\b\003#\001A\021BA\n\003-\031w.\0349vi\026\034\026N_3\025\007\031\n)\002\003\004H\003\037\001\r\001\023\004\007\0033\001\001\"a\007\003)\r{WO\034;j]\036|U\017\0369vi\"\013g\016\0327f'\r\t9\002\036\005\f\003?\t9B!b\001\n\003\n\t#A\003po:,'/\006\002\002$A\021q\003\001\005\f\003O\t9B!A!\002\023\t\031#\001\004po:,'\017\t\005\f\003W\t9B!b\001\n\003\ti#A\003j]:,'/F\001u\021)\t\t$a\006\003\002\003\006I\001^\001\007S:tWM\035\021\t\021\005U\022q\003C\001\003o\ta\001P5oSRtDCBA\035\003w\ti\004E\002v\003/A\001\"a\b\0024\001\007\0211\005\005\b\003W\t\031\0041\001u\021\035\t\t%a\006\005BI\n\001\"[:DY>\034X\r\032\005\b\003\013\n9\002\"\021A\003\031aWM\\4uQ\"9\021\021JA\f\t\003\002\025\001\0039pg&$\030n\0348\t\rm\0139\002\"\021\035\021!\ty%a\006\005B\005E\023\001B:fK.$2AJA*\021\031)\026Q\na\001M!A\021qKA\f\t\003\nI&A\003xe&$X\rF\002\036\0037B\001\"!\030\002V\001\007\021qL\001\002EB)a$!\031\002f%\031\0211M\020\003\013\005\023(/Y=\021\007y\t9'C\002\002j}\021AAQ=uK\"q\021Q\016\001\021\002\007\005\t\021\"\003\002p\005M\024\001D:va\026\024H\005Z3mKR,GcA\032\002r!1q)a\033A\002!K1\001RA;\023\r\t9H\001\002\026\023:\004X\017^*ue\026\fWNR5mKNK8\017^3n\0219\tY\b\001I\001\004\003\005I\021BA?\003\007\013Ab];qKJ$#/\0328b[\026$RaMA@\003\003CaaUA=\001\004A\005BB+\002z\001\007\001*C\002Q\003kBa\"a\"\001!\003\r\t\021!C\005\003\023\013i)A\ntkB,'\017J7bW\026$\025N]3di>\024\030\020F\0024\003\027CaaRAC\001\004A\025bA,\002v!i\021\021\023\001\021\002\007\005\t\021\"\003\035\003'\0131b];qKJ$3\r\\8tK&\0211\f\007\005\017\003/\003\001\023aA\001\002\023%\021\021TAO\003)\031X\017]3sI1|\027\r\032\013\004;\005m\005B\0021\002\026\002\007\021-\003\002^1!q\021\021\025\001\021\002\007\005\t\021\"\003\002$\006\035\026AC:va\026\024He]1wKR\031Q$!*\t\r\001\fy\n1\001b\023\tY\007\004\003\b\002,\002\001\n1!A\001\n\023\ti+!.\002-M,\b/\032:%_B,gnT;uaV$\b*\0318eY\026$r!]AX\003c\013\031\f\003\004z\003S\003\rA\037\005\007\017\006%\006\031\001%\t\017}\fI\0131\001\002\002%\021q\016\007")
/*     */ public interface Capacity
/*     */   extends OutputStreamFileSystem
/*     */ {
/*     */   long li$cil$oc$server$fs$Capacity$$used();
/*     */   
/*     */   @TraitSetter
/*     */   void li$cil$oc$server$fs$Capacity$$used_$eq(long paramLong);
/*     */   
/*     */   boolean li$cil$oc$server$fs$Capacity$$ignoreCapacity();
/*     */   
/*     */   @TraitSetter
/*     */   void li$cil$oc$server$fs$Capacity$$ignoreCapacity_$eq(boolean paramBoolean);
/*     */   
/*     */   long capacity();
/*     */   
/*     */   long spaceTotal();
/*     */   
/*     */   long spaceUsed();
/*     */   
/*     */   boolean delete(String paramString);
/*     */   
/*     */   boolean rename(String paramString1, String paramString2);
/*     */   
/*     */   boolean makeDirectory(String paramString);
/*     */   
/*     */   void close();
/*     */   
/*     */   void load(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   void save(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   Option<OutputStreamFileSystem.OutputHandle> openOutputHandle(int paramInt, String paramString, Mode paramMode);
/*     */   
/*     */   public final class Capacity$$anonfun$li$cil$oc$server$fs$Capacity$$computeSize$1
/*     */     extends AbstractFunction2<Object, String, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String path$1;
/*     */     
/*     */     public Capacity$$anonfun$li$cil$oc$server$fs$Capacity$$computeSize$1(Capacity $outer, String path$1) {}
/*     */     
/*     */     public final long apply(long acc, String child) {
/* 117 */       return acc + Capacity$class.li$cil$oc$server$fs$Capacity$$computeSize(this.$outer, (new StringBuilder()).append(this.path$1).append(child).toString());
/*     */     }
/*     */   } public class CountingOutputHandle extends OutputStreamFileSystem.OutputHandle { private final Capacity owner;
/* 120 */     public Capacity owner() { return this.owner; } private final OutputStreamFileSystem.OutputHandle inner; public OutputStreamFileSystem.OutputHandle inner() { return this.inner; } public CountingOutputHandle(Capacity $outer, Capacity owner, OutputStreamFileSystem.OutputHandle inner) { super($outer, inner.owner(), inner.handle(), inner.path()); } public boolean isClosed() {
/* 121 */       return inner().isClosed();
/*     */     } public long length() {
/* 123 */       return inner().length();
/*     */     } public long position() {
/* 125 */       return inner().position();
/*     */     } public void close() {
/* 127 */       inner().close();
/*     */     } public long seek(long to) {
/* 129 */       return inner().seek(to);
/*     */     }
/*     */     public void write(byte[] b) {
/* 132 */       if (owner().capacity() - owner().li$cil$oc$server$fs$Capacity$$used() < b.length && !li$cil$oc$server$fs$Capacity$CountingOutputHandle$$$outer().li$cil$oc$server$fs$Capacity$$ignoreCapacity())
/* 133 */         throw new IOException("not enough space"); 
/* 134 */       inner().write(b);
/* 135 */       owner().li$cil$oc$server$fs$Capacity$$used_$eq(owner().li$cil$oc$server$fs$Capacity$$used() + b.length);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\Capacity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */