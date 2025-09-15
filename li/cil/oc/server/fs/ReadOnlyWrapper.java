/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import li.cil.oc.api.fs.FileSystem;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]b\001B\001\003\t5\021qBU3bI>sG._,sCB\004XM\035\006\003\007\021\t!AZ:\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\003mC:<'\"A\n\002\t)\fg/Y\005\003+A\021aa\0242kK\016$\bCA\f\034\033\005A\"BA\002\032\025\tQb!A\002ba&L!\001\b\r\003\025\031KG.Z*zgR,W\016\003\005\037\001\t\025\r\021\"\001 \003)1\027\016\\3TsN$X-\\\013\002-!A\021\005\001B\001B\003%a#A\006gS2,7+_:uK6\004\003\"B\022\001\t\003!\023A\002\037j]&$h\b\006\002&OA\021a\005A\007\002\005!)aD\ta\001-!)\021\006\001C!U\005Q\021n\035*fC\022|e\016\\=\025\003-\002\"\001L\030\016\0035R\021AL\001\006g\016\fG.Y\005\003a5\022qAQ8pY\026\fg\016C\0033\001\021\0053'\001\006ta\006\034W\rV8uC2$\022\001\016\t\003YUJ!AN\027\003\t1{gn\032\005\006q\001!\teM\001\ngB\f7-Z+tK\022DQA\017\001\005Bm\na!\032=jgR\034HCA\026=\021\025i\024\b1\001?\003\021\001\030\r\0365\021\005}\022eB\001\027A\023\t\tU&\001\004Qe\026$WMZ\005\003\007\022\023aa\025;sS:<'BA!.\021\0251\005\001\"\021H\003\021\031\030N_3\025\005QB\005\"B\037F\001\004q\004\"\002&\001\t\003Z\025aC5t\t&\024Xm\031;pef$\"a\013'\t\013uJ\005\031\001 \t\0139\003A\021I(\002\0311\f7\017^'pI&4\027.\0323\025\005Q\002\006\"B\037N\001\004q\004\"\002*\001\t\003\032\026\001\0027jgR$\"\001V-\021\0071*v+\003\002W[\t)\021I\035:bsB\021q\002W\005\003\007BAQ!P)A\002yBQa\027\001\005Bq\013a\001Z3mKR,GCA\026^\021\025i$\f1\001?\021\025y\006\001\"\021a\0035i\027m[3ESJ,7\r^8ssR\0211&\031\005\006{y\003\rA\020\005\006G\002!\t\005Z\001\007e\026t\027-\\3\025\007-*w\rC\003gE\002\007a(\001\003ge>l\007\"\0025c\001\004q\024A\001;p\021\025Q\007\001\"\021l\003=\031X\r\036'bgRlu\016Z5gS\026$GcA\026m[\")Q(\033a\001}!)a.\033a\001i\005!A/[7f\021\025\001\b\001\"\021r\003\021y\007/\0328\025\007I,h\017\005\002-g&\021A/\f\002\004\023:$\b\"B\037p\001\004q\004\"B<p\001\004A\030\001B7pI\026\004\"aF=\n\005iD\"\001B'pI\026DQ\001 \001\005Bu\f\021bZ3u\021\006tG\r\\3\025\007y\f\031\001\005\002\030&\031\021\021\001\r\003\r!\013g\016\0327f\021\031\t)a\037a\001e\0061\001.\0318eY\026Dq!!\003\001\t\003\nY!A\003dY>\034X\r\006\002\002\016A\031A&a\004\n\007\005EQF\001\003V]&$\bbBA\013\001\021\005\023qC\001\005Y>\fG\r\006\003\002\016\005e\001\002CA\016\003'\001\r!!\b\002\0079\024G\017\005\003\002 \005-RBAA\021\025\021\tY\"a\t\013\t\005\025\022qE\001\n[&tWm\031:bMRT!!!\013\002\0079,G/\003\003\002.\005\005\"A\004(C)R\013wmQ8na>,h\016\032\005\b\003c\001A\021IA\032\003\021\031\030M^3\025\t\0055\021Q\007\005\t\0037\ty\0031\001\002\036\001")
/*    */ public class ReadOnlyWrapper implements FileSystem {
/*  9 */   public FileSystem fileSystem() { return this.fileSystem; } private final FileSystem fileSystem; public ReadOnlyWrapper(FileSystem fileSystem) {} public boolean isReadOnly() {
/* 10 */     return true;
/*    */   } public long spaceTotal() {
/* 12 */     return fileSystem().spaceUsed();
/*    */   } public long spaceUsed() {
/* 14 */     return fileSystem().spaceUsed();
/*    */   } public boolean exists(String path) {
/* 16 */     return fileSystem().exists(path);
/*    */   } public long size(String path) {
/* 18 */     return fileSystem().size(path);
/*    */   } public boolean isDirectory(String path) {
/* 20 */     return fileSystem().isDirectory(path);
/*    */   } public long lastModified(String path) {
/* 22 */     return fileSystem().lastModified(path);
/*    */   } public String[] list(String path) {
/* 24 */     return fileSystem().list(path);
/*    */   } public boolean delete(String path) {
/* 26 */     return false;
/*    */   } public boolean makeDirectory(String path) {
/* 28 */     return false;
/*    */   } public boolean rename(String from, String to) {
/* 30 */     return false;
/*    */   } public boolean setLastModified(String path, long time) {
/* 32 */     return false;
/*    */   } public int open(String path, Mode mode) {
/* 34 */     Mode mode1 = mode;
/* 35 */     if (Mode.Read.equals(mode1)) return fileSystem().open(path, mode); 
/* 36 */     if (Mode.Write.equals(mode1)) throw new FileNotFoundException((new StringBuilder()).append("read-only filesystem; cannot open for writing: ").append(path).toString()); 
/* 37 */     if (Mode.Append.equals(mode1)) throw new FileNotFoundException((new StringBuilder()).append("read-only filesystem; cannot open for appending: ").append(path).toString()); 
/*    */     throw new MatchError(mode1);
/*    */   } public Handle getHandle(int handle) {
/* 40 */     return fileSystem().getHandle(handle);
/*    */   } public void close() {
/* 42 */     fileSystem().close();
/*    */   } public void load(NBTTagCompound nbt) {
/* 44 */     fileSystem().load(nbt);
/*    */   } public void save(NBTTagCompound nbt) {
/* 46 */     fileSystem().save(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\ReadOnlyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */