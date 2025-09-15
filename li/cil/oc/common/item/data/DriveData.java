/*    */ package li.cil.oc.common.item.data;
/*    */ @ScalaSignature(bytes = "\006\001\005-a\001B\001\003\001=\021\021\002\022:jm\026$\025\r^1\013\005\r!\021\001\0023bi\006T!!\002\004\002\t%$X-\034\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Ii\021AA\005\003'\t\021\001\"\023;f[\022\013G/\031\005\006+\001!\tAF\001\007y%t\027\016\036 \025\003]\001\"!\005\001\t\013U\001A\021A\r\025\005]Q\002\"B\016\031\001\004a\022!B:uC\016\\\007CA\017$\033\005q\"BA\003 \025\t\001\023%A\005nS:,7M]1gi*\t!%A\002oKRL!\001\n\020\003\023%#X-\\*uC\016\\\007b\002\024\001\001\004%\taJ\001\fSN,f.\\1oC\036,G-F\001)!\tIC&D\001+\025\005Y\023!B:dC2\f\027BA\027+\005\035\021un\0347fC:Dqa\f\001A\002\023\005\001'A\bjgVsW.\0318bO\026$w\fJ3r)\t\tD\007\005\002*e%\0211G\013\002\005+:LG\017C\0046]\005\005\t\031\001\025\002\007a$\023\007\003\0048\001\001\006K\001K\001\rSN,f.\\1oC\036,G\r\t\005\bs\001\001\r\021\"\001;\003!awnY6J]\032|W#A\036\021\005qzdBA\025>\023\tq$&\001\004Qe\026$WMZ\005\003\001\006\023aa\025;sS:<'B\001 +\021\035\031\005\0011A\005\002\021\013A\002\\8dW&sgm\\0%KF$\"!M#\t\017U\022\025\021!a\001w!1q\t\001Q!\nm\n\021\002\\8dW&sgm\034\021\t\013%\003A\021A\024\002\021%\034Hj\\2lK\022Dqa\023\001C\002\023%A*\001\007V]6\fg.Y4fI.+\0270F\001N!\tq5+D\001P\025\t\001\026+\001\003mC:<'\"\001*\002\t)\fg/Y\005\003\001>Ca!\026\001!\002\023i\025!D+o[\006t\027mZ3e\027\026L\b\005C\004X\001\t\007I\021\002'\002\0171{7m[&fs\"1\021\f\001Q\001\n5\013\001\002T8dW.+\027\020\t\005\0067\002!\t\005X\001\005Y>\fG\r\006\0022;\")aL\027a\001?\006\031aN\031;\021\005\001\024W\"A1\013\005y{\022BA2b\0059q%\t\026+bO\016{W\016]8v]\022DQ!\032\001\005B\031\fAa]1wKR\021\021g\032\005\006=\022\004\raX\004\006S\nA\tA[\001\n\tJLg/\032#bi\006\004\"!E6\007\013\005\021\001\022\0017\024\005-l\007CA\025o\023\ty'F\001\004B]f\024VM\032\005\006+-$\t!\035\013\002U\")1o\033C\001i\006!An\\2l)\r\tTO\036\005\0067I\004\r\001\b\005\006oJ\004\r\001_\001\007a2\f\0270\032:\021\005elX\"\001>\013\005]\\(B\001? \003\031)g\016^5us&\021aP\037\002\r\013:$\030\016^=QY\006LXM\035\005\b\003\003YG\021AA\002\0031\031X\r^+o[\006t\027mZ3e)\025\t\024QAA\004\021\025Yr\0201\001\035\021\031\tIa a\001Q\005IQO\\7b]\006<W\r\032")
/*    */ public class DriveData extends ItemData {
/*    */   private boolean isUnmanaged;
/*    */   private String lockInfo;
/*    */   private final String UnmanagedKey;
/*    */   private final String LockKey;
/*    */   
/*  9 */   public DriveData() { super(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     this.isUnmanaged = false;
/* 16 */     this.lockInfo = "";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     this.UnmanagedKey = (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("unmanaged").toString();
/* 23 */     this.LockKey = (new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lock").toString(); } public DriveData(ItemStack stack) { this(); load(stack); } public boolean isUnmanaged() { return this.isUnmanaged; } public void isUnmanaged_$eq(boolean x$1) { this.isUnmanaged = x$1; } private String LockKey() { return this.LockKey; }
/*    */   public String lockInfo() { return this.lockInfo; }
/*    */   public void lockInfo_$eq(String x$1) { this.lockInfo = x$1; }
/* 26 */   public boolean isLocked() { return !(lockInfo() == null || lockInfo().isEmpty()); } private String UnmanagedKey() { return this.UnmanagedKey; } public void load(NBTTagCompound nbt) { isUnmanaged_$eq(nbt.func_74767_n(UnmanagedKey()));
/* 27 */     lockInfo_$eq(nbt.func_74764_b(LockKey()) ? 
/* 28 */         nbt.func_74779_i(LockKey()) : 
/* 29 */         ""); }
/*    */ 
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 33 */     nbt.func_74757_a(UnmanagedKey(), isUnmanaged());
/* 34 */     nbt.func_74778_a(LockKey(), lockInfo());
/*    */   }
/*    */   
/*    */   public static void setUnmanaged(ItemStack paramItemStack, boolean paramBoolean) {
/*    */     DriveData$.MODULE$.setUnmanaged(paramItemStack, paramBoolean);
/*    */   }
/*    */   
/*    */   public static void lock(ItemStack paramItemStack, EntityPlayer paramEntityPlayer) {
/*    */     DriveData$.MODULE$.lock(paramItemStack, paramEntityPlayer);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\DriveData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */