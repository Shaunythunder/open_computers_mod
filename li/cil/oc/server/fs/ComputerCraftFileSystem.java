/*    */ package li.cil.oc.server.fs;
/*    */ @ScalaSignature(bytes = "\006\001)4A!\001\002\001\033\t92i\\7qkR,'o\021:bMR4\025\016\\3TsN$X-\034\006\003\007\021\t!AZ:\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\003mC:<'\"A\n\002\t)\fg/Y\005\003+A\021aa\0242kK\016$\bCA\f\031\033\005\021\021BA\r\003\005UIe\016];u'R\024X-Y7GS2,7+_:uK6D\001b\007\001\003\006\004%\t\001H\001\006[>,h\016^\013\002;A\021adJ\007\002?)\021\001%I\001\013M&dWm]=ti\026l'B\001\022$\003\r\t\007/\033\006\003I\025\nQbY8naV$XM]2sC\032$(\"\001\024\002\r\021\fgN\r\0311\023\tAsD\001\004J\033>,h\016\036\005\tU\001\021\t\021)A\005;\0051Qn\\;oi\002BQ\001\f\001\005\0025\na\001P5oSRtDC\001\0300!\t9\002\001C\003\034W\001\007Q\004C\0032\001\021\005#'\001\006ta\006\034W\rV8uC2$\022a\r\t\003i]j\021!\016\006\002m\005)1oY1mC&\021\001(\016\002\005\031>tw\rC\003;\001\021\005#'A\005ta\006\034W-V:fI\")A\b\001C!{\0051Q\r_5tiN$\"AP!\021\005Qz\024B\001!6\005\035\021un\0347fC:DQAQ\036A\002\r\013A\001]1uQB\021Ai\022\b\003i\025K!AR\033\002\rA\023X\rZ3g\023\tA\025J\001\004TiJLgn\032\006\003\rVBQa\023\001\005B1\0131\"[:ESJ,7\r^8ssR\021a(\024\005\006\005*\003\ra\021\005\006\037\002!\t\005U\001\rY\006\034H/T8eS\032LW\r\032\013\003gECQA\021(A\002\rCQa\025\001\005BQ\013A\001\\5tiR\021QK\027\t\004iYC\026BA,6\005\025\t%O]1z!\ty\021,\003\002I!!)!I\025a\001\007\")A\f\001C!;\006!1/\033>f)\t\031d\fC\003C7\002\0071\tC\003a\001\021E\021-\001\tpa\026t\027J\0349vi\016C\027M\0348fYR\021!-\033\t\004i\r,\027B\00136\005\031y\005\017^5p]B\021amZ\007\002\001%\021\001\016\007\002\r\023:\004X\017^\"iC:tW\r\034\005\006\005~\003\ra\021")
/*    */ public class ComputerCraftFileSystem implements InputStreamFileSystem { private final IMount mount;
/*    */   
/*  5 */   public Map<Object, InputStreamFileSystem.Handle> li$cil$oc$server$fs$InputStreamFileSystem$$handles() { return this.li$cil$oc$server$fs$InputStreamFileSystem$$handles; } private final Map<Object, InputStreamFileSystem.Handle> li$cil$oc$server$fs$InputStreamFileSystem$$handles; public void li$cil$oc$server$fs$InputStreamFileSystem$_setter_$li$cil$oc$server$fs$InputStreamFileSystem$$handles_$eq(Map<Object, InputStreamFileSystem.Handle> x$1) { this.li$cil$oc$server$fs$InputStreamFileSystem$$handles = x$1; } public boolean isReadOnly() { return InputStreamFileSystem$class.isReadOnly(this); } public boolean delete(String path) { return InputStreamFileSystem$class.delete(this, path); } public boolean makeDirectory(String path) { return InputStreamFileSystem$class.makeDirectory(this, path); } public boolean rename(String from, String to) { return InputStreamFileSystem$class.rename(this, from, to); } public boolean setLastModified(String path, long time) { return InputStreamFileSystem$class.setLastModified(this, path, time); } public int open(String path, Mode mode) { return InputStreamFileSystem$class.open(this, path, mode); } public Handle getHandle(int handle) { return InputStreamFileSystem$class.getHandle(this, handle); } public void close() { InputStreamFileSystem$class.close(this); } public void load(NBTTagCompound nbt) { InputStreamFileSystem$class.load(this, nbt); } public void save(NBTTagCompound nbt) { InputStreamFileSystem$class.save(this, nbt); } public IMount mount() { return this.mount; } public ComputerCraftFileSystem(IMount mount) { InputStreamFileSystem$class.$init$(this); } public long spaceTotal() {
/*  6 */     return 0L;
/*    */   } public long spaceUsed() {
/*  8 */     return 0L;
/*    */   }
/*    */   
/*    */   public boolean exists(String path) {
/* 12 */     return mount().exists(path);
/*    */   } public boolean isDirectory(String path) {
/* 14 */     return mount().isDirectory(path);
/*    */   } public long lastModified(String path) {
/* 16 */     return 0L;
/*    */   }
/*    */   
/* 19 */   public String[] list(String path) { ArrayList result = new ArrayList();
/* 20 */     mount().list(path, result);
/* 21 */     return (String[])Predef$.MODULE$.refArrayOps(result.toArray()).map((Function1)new ComputerCraftFileSystem$$anonfun$list$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(String.class))); } public final class ComputerCraftFileSystem$$anonfun$list$1 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Object x$1) { return (String)x$1; }
/*    */     
/*    */     public ComputerCraftFileSystem$$anonfun$list$1(ComputerCraftFileSystem $outer) {} }
/* 24 */   public long size(String path) { return mount().getSize(path); } public Option<InputStreamFileSystem.InputChannel> openInputChannel(String path) {
/*    */     try {
/*    */     
/*    */     } finally {}
/* 28 */     return 
/*    */ 
/*    */       
/* 31 */       (Option<InputStreamFileSystem.InputChannel>)None$.MODULE$;
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\ComputerCraftFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */