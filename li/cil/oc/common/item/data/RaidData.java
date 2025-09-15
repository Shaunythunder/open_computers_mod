/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t4A!\001\002\001\037\tA!+Y5e\t\006$\030M\003\002\004\t\005!A-\031;b\025\t)a!\001\003ji\026l'BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005!IE/Z7ECR\f\007\"B\013\001\t\0031\022A\002\037j]&$h\bF\001\030!\t\t\002\001C\003\026\001\021\005\021\004\006\002\0305!)1\004\007a\0019\005)1\017^1dWB\021QdI\007\002=)\021Qa\b\006\003A\005\n\021\"\\5oK\016\024\030M\032;\013\003\t\n1A\\3u\023\t!cDA\005Ji\026l7\013^1dW\"9a\005\001a\001\n\0039\023!\0023jg.\034X#\001\025\021\007%bC$D\001+\025\005Y\023!B:dC2\f\027BA\027+\005\025\t%O]1z\021\035y\003\0011A\005\002A\n\021\002Z5tWN|F%Z9\025\005E\"\004CA\0253\023\t\031$F\001\003V]&$\bbB\033/\003\003\005\r\001K\001\004q\022\n\004BB\034\001A\003&\001&\001\004eSN\\7\017\t\005\bs\001\001\r\021\"\001;\003)1\027\016\\3tsN$X-\\\013\002wA\021AhP\007\002{)\021ahH\001\004]\n$\030B\001!>\0059q%\t\026+bO\016{W\016]8v]\022DqA\021\001A\002\023\0051)\001\bgS2,7/_:uK6|F%Z9\025\005E\"\005bB\033B\003\003\005\ra\017\005\007\r\002\001\013\025B\036\002\027\031LG.Z:zgR,W\016\t\005\b\021\002\001\r\021\"\001J\003\025a\027MY3m+\005Q\005cA\025L\033&\021AJ\013\002\007\037B$\030n\0348\021\0059\013fBA\025P\023\t\001&&\001\004Qe\026$WMZ\005\003%N\023aa\025;sS:<'B\001)+\021\035)\006\0011A\005\002Y\013\021\002\\1cK2|F%Z9\025\005E:\006bB\033U\003\003\005\rA\023\005\0073\002\001\013\025\002&\002\r1\f'-\0327!\021\025Y\006\001\"\021]\003\021aw.\0313\025\005Ej\006\"\002 [\001\004Y\004\"B0\001\t\003\002\027\001B:bm\026$\"!M1\t\013yr\006\031A\036")
/*    */ public class RaidData extends ItemData {
/*    */   private ItemStack[] disks;
/*    */   private NBTTagCompound filesystem;
/*    */   private Option<String> label;
/*    */   
/* 10 */   public RaidData() { super("raid");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     this.disks = (ItemStack[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(ItemStack.class));
/*    */     
/* 18 */     this.filesystem = new NBTTagCompound();
/*    */     
/* 20 */     this.label = (Option<String>)None$.MODULE$; } public RaidData(ItemStack stack) { this(); load(stack); } public ItemStack[] disks() { return this.disks; } public Option<String> label() { return this.label; } public void disks_$eq(ItemStack[] x$1) { this.disks = x$1; } public NBTTagCompound filesystem() { return this.filesystem; } public void filesystem_$eq(NBTTagCompound x$1) { this.filesystem = x$1; } public void label_$eq(Option<String> x$1) { this.label = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 23 */     disks_$eq(
/* 24 */         (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("disks").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).map((Function1)new RaidData$$anonfun$load$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))));
/* 25 */     filesystem_$eq(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("filesystem").toString()));
/* 26 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()))
/* 27 */       label_$eq(Option$.MODULE$.apply(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString()))); 
/*    */   } public final class RaidData$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, ItemStack> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final ItemStack apply(NBTTagCompound x$1) {
/*    */       return ItemStack.func_77949_a(x$1);
/*    */     } public RaidData$$anonfun$load$1(RaidData $outer) {} }
/* 32 */   public void save(NBTTagCompound nbt) { ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("disks").toString(), ExtendedNBT$.MODULE$.itemStackIterableToNbt(Predef$.MODULE$.refArrayOps((Object[])disks()).toIterable()));
/* 33 */     nbt.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("filesystem").toString(), (NBTBase)filesystem());
/* 34 */     label().foreach((Function1)new RaidData$$anonfun$save$1(this, nbt)); } public final class RaidData$$anonfun$save$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(String x$1) { this.nbt$1.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("label").toString(), x$1); }
/*    */ 
/*    */     
/*    */     public RaidData$$anonfun$save$1(RaidData $outer, NBTTagCompound nbt$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\RaidData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */