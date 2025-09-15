/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import java.io.RandomAccessFile;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}caB\001\003!\003\r\t!\004\002\033\r&dWmT;uaV$8\013\036:fC64\025\016\\3TsN$X-\034\006\003\007\021\t!AZ:\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0275A\021q\002F\007\002!)\021\021CE\001\005Y\006twMC\001\024\003\021Q\027M^1\n\005U\001\"AB(cU\026\034G\017\005\002\03015\t!!\003\002\032\005\tIb)\0337f\023:\004X\017^*ue\026\fWNR5mKNK8\017^3n!\t92$\003\002\035\005\t1r*\036;qkR\034FO]3b[\032KG.Z*zgR,W\016C\003\037\001\021\005q$\001\004%S:LG\017\n\013\002AA\021\021\005J\007\002E)\t1%A\003tG\006d\027-\003\002&E\t!QK\\5u\021\0259\003\001\"\021)\003)\031\b/Y2f)>$\030\r\034\013\002SA\021\021EK\005\003W\t\022A\001T8oO\")Q\006\001C!Q\005I1\017]1dKV\033X\r\032\005\006_\001!\t\005M\001\007I\026dW\r^3\025\005E\"\004CA\0213\023\t\031$EA\004C_>dW-\0318\t\013Ur\003\031\001\034\002\tA\fG\017\033\t\003oir!!\t\035\n\005e\022\023A\002)sK\022,g-\003\002<y\t11\013\036:j]\036T!!\017\022\t\013y\002A\021I \002\0335\f7.\032#je\026\034Go\034:z)\t\t\004\tC\0036{\001\007a\007C\003C\001\021\0053)\001\004sK:\fW.\032\013\004c\0213\005\"B#B\001\0041\024\001\0024s_6DQaR!A\002Y\n!\001^8\t\013%\003A\021\t&\002\037M,G\017T1ti6{G-\0334jK\022$2!M&M\021\025)\004\n1\0017\021\025i\005\n1\001*\003\021!\030.\\3\t\013=\003A\021\013)\002!=\004XM\\(viB,H\017S1oI2,G\003B)Y;z\0032!\t*U\023\t\031&E\001\004PaRLwN\034\t\003+Zk\021\001A\005\003/n\021AbT;uaV$\b*\0318eY\026DQ!\027(A\002i\013!!\0333\021\005\005Z\026B\001/#\005\rIe\016\036\005\006k9\003\rA\016\005\006?:\003\r\001Y\001\005[>$W\r\005\002bK6\t!M\003\002\004G*\021AMB\001\004CBL\027B\0014c\005\021iu\016Z3\t\013!\004A\021I5\002\tM\fg/\032\013\003A)DQa[4A\0021\f1A\0342u!\ti7/D\001o\025\tYwN\003\002qc\006IQ.\0338fGJ\fg\r\036\006\002e\006\031a.\032;\n\005Qt'A\004(C)R\013wmQ8na>,h\016\032\004\005m\002AqO\001\006GS2,\007*\0318eY\026\034\"!\036+\t\021e,(Q1A\005\002i\fAAZ5mKV\t1\020\005\002}6\tQP\003\002%\005\021\021n\\\005\004\003\003i(\001\005*b]\022|W.Q2dKN\034h)\0337f\021%\t)!\036B\001B\003%10A\003gS2,\007\005C\006\002\nU\024\t\021)A\0055\005-\021!B8x]\026\024\030bAA\005-\"Y\021qB;\003\002\003\006IAWA\t\003\031A\027M\0343mK&\031\021q\002,\t\025U*(\021!Q\001\nY\n)\"\003\0026-\"Aq,\036B\001B\003%\001\rC\004\002\034U$\t!!\b\002\rqJg.\033;?)1\ty\"!\t\002$\005\025\022qEA\025!\t)V\017\003\004z\0033\001\ra\037\005\b\003\023\tI\0021\001\033\021\035\ty!!\007A\002iCa!NA\r\001\0041\004BB0\002\032\001\007\001\r\003\004\002.U$\t\005K\001\ta>\034\030\016^5p]\"1\021\021G;\005B!\na\001\\3oORD\007BBA\033k\022\005s$A\003dY>\034X\rC\004\002:U$\t%a\017\002\tM,Wm\033\013\004S\005u\002BB$\0028\001\007\021\006C\004\002BU$\t%a\021\002\013]\024\030\016^3\025\007\001\n)\005\003\005\002H\005}\002\031AA%\003\0251\030\r\\;f!\025\t\0231JA(\023\r\tiE\t\002\006\003J\024\030-\037\t\004C\005E\023bAA*E\t!!)\037;f\0219\t9\006\001I\001\004\003\005I\021BA-\003;\n!b];qKJ$3/\031<f)\r\001\0231\f\005\007W\006U\003\031\0017\n\005!\\\002")
/*    */ public interface FileOutputStreamFileSystem
/*    */   extends FileInputStreamFileSystem, OutputStreamFileSystem
/*    */ {
/*    */   long spaceTotal();
/*    */   
/*    */   long spaceUsed();
/*    */   
/*    */   boolean delete(String paramString);
/*    */   
/*    */   boolean makeDirectory(String paramString);
/*    */   
/*    */   boolean rename(String paramString1, String paramString2);
/*    */   
/*    */   boolean setLastModified(String paramString, long paramLong);
/*    */   
/*    */   Option<OutputStreamFileSystem.OutputHandle> openOutputHandle(int paramInt, String paramString, Mode paramMode);
/*    */   
/*    */   void save(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   public class FileHandle
/*    */     extends OutputStreamFileSystem.OutputHandle
/*    */   {
/*    */     private final RandomAccessFile file;
/*    */     
/*    */     public RandomAccessFile file() {
/* 53 */       return this.file; } public FileHandle(FileOutputStreamFileSystem $outer, RandomAccessFile file, OutputStreamFileSystem owner, int handle, String path, Mode mode) { super($outer, owner, handle, path);
/* 54 */       Mode mode1 = Mode.Write; if (mode == null) { if (mode1 != null) return;  } else { if (mode.equals(mode1))
/* 55 */         { file.setLength(0L); return; }  return; }  file.setLength(0L); }
/*    */     
/*    */     public long position() {
/* 58 */       return file().getFilePointer();
/*    */     } public long length() {
/* 60 */       return file().length();
/*    */     }
/*    */     public void close() {
/* 63 */       super.close();
/* 64 */       file().close();
/*    */     }
/*    */     
/*    */     public long seek(long to) {
/* 68 */       file().seek(to);
/* 69 */       return to;
/*    */     }
/*    */     public void write(byte[] value) {
/* 72 */       file().write(value);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\FileOutputStreamFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */