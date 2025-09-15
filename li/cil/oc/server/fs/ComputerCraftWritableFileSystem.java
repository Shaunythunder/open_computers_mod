/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import dan200.computercraft.api.filesystem.IWritableMount;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055b\001B\001\003\0015\021qdQ8naV$XM]\"sC\032$xK]5uC\ndWMR5mKNK8\017^3n\025\t\031A!\001\002gg*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035I\001\"a\004\t\016\003\tI!!\005\002\003/\r{W\016];uKJ\034%/\0314u\r&dWmU=ti\026l\007CA\b\024\023\t!\"A\001\fPkR\004X\017^*ue\026\fWNR5mKNK8\017^3n\021!1\002A!b\001\n\003:\022!B7pk:$X#\001\r\021\005e\021S\"\001\016\013\005ma\022A\0034jY\026\034\030p\035;f[*\021QDH\001\004CBL'BA\020!\0035\031w.\0349vi\026\0248M]1gi*\t\021%\001\004eC:\024\004\007M\005\003Gi\021a\"S,sSR\f'\r\\3N_VtG\017C\005&\001\t\005\t\025!\003\031M\0051Qn\\;oi\002J!A\006\t\t\013!\002A\021A\025\002\rqJg.\033;?)\tQ3\006\005\002\020\001!)ac\na\0011!)Q\006\001C!]\0051A-\0327fi\026$\"aL\033\021\005A\032T\"A\031\013\003I\nQa]2bY\006L!\001N\031\003\017\t{w\016\\3b]\")a\007\fa\001o\005!\001/\031;i!\tA4H\004\0021s%\021!(M\001\007!J,G-\0324\n\005qj$AB*ue&twM\003\002;c!)q\b\001C!\001\006iQ.Y6f\t&\024Xm\031;pef$\"aL!\t\013Yr\004\031A\034\t\013\r\003A\021\013#\002!=\004XM\\(viB,H\017S1oI2,G\003B#M#J\0032\001\r$I\023\t9\025G\001\004PaRLwN\034\t\003\023*k\021\001A\005\003\027N\021AbT;uaV$\b*\0318eY\026DQ!\024\"A\0029\013!!\0333\021\005Az\025B\001)2\005\rIe\016\036\005\006m\t\003\ra\016\005\006'\n\003\r\001V\001\005[>$W\r\005\002V16\taK\003\002\004/*\021QDB\005\0033Z\023A!T8eK\032!1\f\001\005]\005e\031u.\0349vi\026\0248I]1gi>+H\017];u\021\006tG\r\\3\024\005iC\005\002\003\f[\005\013\007I\021A\f\t\021\025R&\021!Q\001\naA\001\002\031.\003\006\004%\t!Y\001\007gR\024X-Y7\026\003\t\004\"a\0315\016\003\021T!!\0324\002\005%|'\"A4\002\t)\fg/Y\005\003S\022\024AbT;uaV$8\013\036:fC6D\001b\033.\003\002\003\006IAY\001\bgR\024X-Y7!\021%i'L!A!\002\023\021b.A\003po:,'/\003\002n\025\"I\001O\027B\001B\003%a*]\001\007Q\006tG\r\\3\n\005AT\005\"\003\034[\005\003\005\013\021B\034t\023\t1$\nC\003)5\022\005Q\017\006\004wobL(p\037\t\003\023jCQA\006;A\002aAQ\001\031;A\002\tDQ!\034;A\002IAQ\001\035;A\0029CQA\016;A\002]BQ! .\005By\fa\001\\3oORDG#A@\021\007A\n\t!C\002\002\004E\022A\001T8oO\"9\021q\001.\005B\005%\021\001\0039pg&$\030n\0348\025\005\005-\001c\001\031\002\016%\031\021qB\031\003\0179{G\017[5oO\"9\0211\003.\005B\005U\021!B<sSR,G\003BA\f\003;\0012\001MA\r\023\r\tY\"\r\002\005+:LG\017\003\005\002 \005E\001\031AA\021\003\0251\030\r\\;f!\025\001\0241EA\024\023\r\t)#\r\002\006\003J\024\030-\037\t\004a\005%\022bAA\026c\t!!)\037;f\001")
/*    */ public class ComputerCraftWritableFileSystem extends ComputerCraftFileSystem implements OutputStreamFileSystem {
/*  9 */   public Map<Object, OutputStreamFileSystem.OutputHandle> li$cil$oc$server$fs$OutputStreamFileSystem$$handles() { return this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles; } private final Map<Object, OutputStreamFileSystem.OutputHandle> li$cil$oc$server$fs$OutputStreamFileSystem$$handles; public void li$cil$oc$server$fs$OutputStreamFileSystem$_setter_$li$cil$oc$server$fs$OutputStreamFileSystem$$handles_$eq(Map<Object, OutputStreamFileSystem.OutputHandle> x$1) { this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles = x$1; } public boolean isReadOnly() { return OutputStreamFileSystem$class.isReadOnly(this); } public int open(String path, Mode mode) { return OutputStreamFileSystem$class.open(this, path, mode); } public Handle getHandle(int handle) { return OutputStreamFileSystem$class.getHandle(this, handle); } public void close() { OutputStreamFileSystem$class.close(this); } public void load(NBTTagCompound nbt) { OutputStreamFileSystem$class.load(this, nbt); } public void save(NBTTagCompound nbt) { OutputStreamFileSystem$class.save(this, nbt); } public IWritableMount mount() { return (IWritableMount)super.mount(); } public ComputerCraftWritableFileSystem(IWritableMount mount) {
/* 10 */     super((IMount)mount); OutputStreamFileSystem$class.$init$(this);
/*    */   }
/*    */   public boolean delete(String path) {
/*    */     try {
/* 14 */       mount().delete(path);
/*    */     } finally {}
/*    */     return false;
/*    */   }
/*    */   
/*    */   public boolean makeDirectory(String path) {
/*    */     try {
/* 21 */       mount().makeDirectory(path);
/*    */     } finally {}
/*    */     return false;
/*    */   }
/*    */   public Option<OutputStreamFileSystem.OutputHandle> openOutputHandle(int id, String path, Mode mode) {
/*    */     try {
/*    */       OutputStream outputStream;
/* 28 */       Mode mode1 = mode;
/* 29 */       if (Mode.Append.equals(mode1)) { outputStream = mount().openForAppend(path); }
/* 30 */       else if (Mode.Write.equals(mode1)) { outputStream = mount().openForWrite(path); }
/* 31 */       else { throw new IllegalArgumentException(); }
/*    */     
/*    */     } finally {}
/* 34 */     return (Option<OutputStreamFileSystem.OutputHandle>)None$.MODULE$;
/*    */   }
/*    */   public class ComputerCraftOutputHandle extends OutputStreamFileSystem.OutputHandle { private final IWritableMount mount; private final OutputStream stream;
/* 37 */     public IWritableMount mount() { return this.mount; } public OutputStream stream() { return this.stream; } public ComputerCraftOutputHandle(ComputerCraftWritableFileSystem $outer, IWritableMount mount, OutputStream stream, OutputStreamFileSystem owner, int handle, String path) { super($outer, owner, handle, path); } public long length() {
/* 38 */       return mount().getSize(path());
/*    */     } public Nothing$ position() {
/* 40 */       throw new IOException("bad file descriptor");
/*    */     } public void write(byte[] value) {
/* 42 */       stream().write(value);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\ComputerCraftWritableFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */