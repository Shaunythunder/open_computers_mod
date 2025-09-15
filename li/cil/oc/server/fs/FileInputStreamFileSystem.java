/*    */ package li.cil.oc.server.fs;@ScalaSignature(bytes = "\006\001\005-baB\001\003!\003\r\t!\004\002\032\r&dW-\0238qkR\034FO]3b[\032KG.Z*zgR,WN\003\002\004\t\005\021am\035\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022\001\0027b]\036T\021aE\001\005U\0064\030-\003\002\026!\t1qJ\0316fGR\004\"a\006\r\016\003\tI!!\007\002\003+%s\007/\036;TiJ,\027-\034$jY\026\034\026p\035;f[\")1\004\001C\0019\0051A%\0338ji\022\"\022!\b\t\003=\005j\021a\b\006\002A\005)1oY1mC&\021!e\b\002\005+:LG\017C\003%\001\031EQ%\001\003s_>$X#\001\024\021\005\035RS\"\001\025\013\005%\022\022AA5p\023\tY\003F\001\003GS2,\007\"B\027\001\t\003r\023AC:qC\016,Gk\034;bYR\tq\006\005\002\037a%\021\021g\b\002\005\031>tw\rC\0034\001\021\005c&A\005ta\006\034W-V:fI\"AQ\007\001EC\002\023%a'\001\006ta\006\034W-V:fI~+\022a\f\005\tq\001A\t\021)Q\005_\005Y1\017]1dKV\033X\rZ0!\021\025Q\004\001\"\021<\003\031)\0070[:ugR\021Ah\020\t\003=uJ!AP\020\003\017\t{w\016\\3b]\")\001)\017a\001\003\006!\001/\031;i!\t\021UI\004\002\037\007&\021AiH\001\007!J,G-\0324\n\005\031;%AB*ue&twM\003\002E?!)\021\n\001C!\025\006!1/\033>f)\ty3\nC\003A\021\002\007\021\tC\003N\001\021\005c*A\006jg\022K'/Z2u_JLHC\001\037P\021\025\001E\n1\001B\021\025\t\006\001\"\021S\0031a\027m\035;N_\022Lg-[3e)\ty3\013C\003A!\002\007\021\tC\003V\001\021\005c+\001\003mSN$HCA,]!\rq\002LW\005\0033~\021Q!\021:sCf\004\"aD.\n\005\031\003\002\"\002!U\001\004\t\005\"\0020\001\t#z\026\001E8qK:Le\016];u\007\"\fgN\\3m)\r\001\027\021\006\t\004=\005\034\027B\0012 \005\021\031v.\\3\021\005\021,W\"\001\001\007\t\031\004\001b\032\002\f\r&dWm\0215b]:,GnE\002f\035!\004\"\001Z5\n\005)D\"\001D%oaV$8\t[1o]\026d\007\002\0037f\005\003\005\013\021\002\024\002\t\031LG.\032\005\006]\026$\ta\\\001\007y%t\027\016\036 \025\005\r\004\b\"\0027n\001\0041\003b\002:f\005\004%\ta]\001\bG\"\fgN\\3m+\005!\bCA;{\033\0051(BA<y\003!\031\007.\0318oK2\034(BA=\023\003\rq\027n\\\005\003MZDa\001`3!\002\023!\030\001C2iC:tW\r\034\021\t\013y,G\021I@\002\021A|7/\033;j_:$2aLA\001\021\031\t\031! a\001_\005Ya.Z<Q_NLG/[8o\021\025qX\r\"\0217\021\031\tI!\032C!9\005)1\r\\8tK\"9\021QB3\005B\005=\021AB5t\037B,g\016F\001=\021\035\t\031\"\032C!\003+\tAA]3bIR!\021qCA\017!\rq\022\021D\005\004\0037y\"aA%oi\"A\021qDA\t\001\004\t\t#A\002egR\004BA\b-\002$A\031a$!\n\n\007\005\035rD\001\003CsR,\007\"\002!^\001\004\t\005")
/*    */ public interface FileInputStreamFileSystem extends InputStreamFileSystem { File root();
/*    */   long spaceTotal();
/*    */   long spaceUsed();
/*    */   long li$cil$oc$server$fs$FileInputStreamFileSystem$$spaceUsed_();
/*    */   boolean exists(String paramString);
/*    */   long size(String paramString);
/*    */   boolean isDirectory(String paramString);
/*    */   
/*    */   long lastModified(String paramString);
/*    */   
/*    */   String[] list(String paramString);
/*    */   
/*    */   Some<FileChannel> openInputChannel(String paramString);
/*    */   
/*    */   public final class FileInputStreamFileSystem$$anonfun$recurse$1$1 extends AbstractFunction2<Object, File, Object> implements Serializable { public final long apply(long acc, File f) {
/* 17 */       return acc + FileInputStreamFileSystem$class.recurse$1(this.$outer, f);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */     
/*    */     public FileInputStreamFileSystem$$anonfun$recurse$1$1(FileInputStreamFileSystem $outer) {} }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class FileInputStreamFileSystem$$anonfun$list$1
/*    */     extends AbstractFunction1<File, String>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */     
/*    */     public final String apply(File file) {
/* 40 */       return file.isDirectory() ? (new StringBuilder()).append(file.getName()).append("/").toString() : file.getName();
/*    */     }
/*    */     
/*    */     public FileInputStreamFileSystem$$anonfun$list$1(FileInputStreamFileSystem $outer) {}
/*    */   }
/*    */   
/*    */   public class FileChannel implements InputStreamFileSystem.InputChannel { private final java.nio.channels.FileChannel channel;
/*    */     
/* 48 */     public int read(ByteBuffer dst) { return InputStreamFileSystem.InputChannel$class.read(this, dst); } public FileChannel(FileInputStreamFileSystem $outer, File file) { InputStreamFileSystem.InputChannel$class.$init$(this);
/* 49 */       this.channel = (new RandomAccessFile(file, "r")).getChannel(); } public java.nio.channels.FileChannel channel() { return this.channel; }
/*    */     
/*    */     public long position(long newPosition) {
/* 52 */       channel().position(newPosition);
/* 53 */       return channel().position();
/*    */     }
/*    */     public long position() {
/* 56 */       return channel().position();
/*    */     } public void close() {
/* 58 */       channel().close();
/*    */     } public boolean isOpen() {
/* 60 */       return channel().isOpen();
/*    */     } public int read(byte[] dst) {
/* 62 */       return channel().read(ByteBuffer.wrap(dst));
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\FileInputStreamFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */