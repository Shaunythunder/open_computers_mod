/*    */ package li.cil.oc.common.item.data;
/*    */ @ScalaSignature(bytes = "\006\001y4A!\001\002\001\037\tQA+\0312mKR$\025\r^1\013\005\r!\021\001\0023bi\006T!!\002\004\002\t%$X-\034\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Ii\021AA\005\003'\t\021\001\"\023;f[\022\013G/\031\005\006+\001!\tAF\001\007y%t\027\016\036 \025\003]\001\"!\005\001\t\013U\001A\021A\r\025\005]Q\002\"B\016\031\001\004a\022!B:uC\016\\\007CA\017$\033\005q\"BA\003 \025\t\001\023%A\005nS:,7M]1gi*\t!%A\002oKRL!\001\n\020\003\023%#X-\\*uC\016\\\007b\002\024\001\001\004%\taJ\001\006SR,Wn]\013\002QA\031\021\006\f\030\016\003)R\021aK\001\006g\016\fG.Y\005\003[)\022Q!\021:sCf\0042!K\030\035\023\t\001$F\001\004PaRLwN\034\005\be\001\001\r\021\"\0014\003%IG/Z7t?\022*\027\017\006\0025oA\021\021&N\005\003m)\022A!\0268ji\"9\001(MA\001\002\004A\023a\001=%c!1!\b\001Q!\n!\na!\033;f[N\004\003b\002\037\001\001\004%\t!P\001\nSN\024VO\0348j]\036,\022A\020\t\003S}J!\001\021\026\003\017\t{w\016\\3b]\"9!\t\001a\001\n\003\031\025!D5t%Vtg.\0338h?\022*\027\017\006\0025\t\"9\001(QA\001\002\004q\004B\002$\001A\003&a(\001\006jgJ+hN\\5oO\002Bq\001\023\001A\002\023\005\021*\001\004f]\026\024x-_\013\002\025B\021\021fS\005\003\031*\022a\001R8vE2,\007b\002(\001\001\004%\taT\001\013K:,'oZ=`I\025\fHC\001\033Q\021\035AT*!AA\002)CaA\025\001!B\023Q\025aB3oKJ<\027\020\t\005\b)\002\001\r\021\"\001J\003%i\027\r_#oKJ<\027\020C\004W\001\001\007I\021A,\002\0335\f\0070\0228fe\036Lx\fJ3r)\t!\004\fC\0049+\006\005\t\031\001&\t\ri\003\001\025)\003K\003)i\027\r_#oKJ<\027\020\t\005\b9\002\001\r\021\"\001^\003\021!\030.\032:\026\003y\003\"!K0\n\005\001T#aA%oi\"9!\r\001a\001\n\003\031\027\001\003;jKJ|F%Z9\025\005Q\"\007b\002\035b\003\003\005\rA\030\005\007M\002\001\013\025\0020\002\013QLWM\035\021\t\017!\004\001\031!C\001S\006I1m\0348uC&tWM]\013\002]!91\016\001a\001\n\003a\027!D2p]R\f\027N\\3s?\022*\027\017\006\0025[\"9\001H[A\001\002\004q\003BB8\001A\003&a&\001\006d_:$\030-\0338fe\002BQ!\035\001\005BI\fA\001\\8bIR\021Ag\035\005\006iB\004\r!^\001\004]\n$\bC\001<y\033\0059(B\001; \023\tIxO\001\bO\005R#\026mZ\"p[B|WO\0343\t\013m\004A\021\t?\002\tM\fg/\032\013\003iuDQ\001\036>A\002U\004")
/*    */ public class TabletData extends ItemData {
/*    */   private Option<ItemStack>[] items;
/*    */   private boolean isRunning;
/*    */   private double energy;
/*    */   private double maxEnergy;
/*    */   private int tier;
/*    */   private Option<ItemStack> container;
/*    */   
/* 11 */   public TabletData() { super("tablet");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     this.items = (Option<ItemStack>[])Array$.MODULE$.fill(32, (Function0)new TabletData$$anonfun$1(this), ClassTag$.MODULE$.apply(Option.class));
/* 18 */     this.isRunning = false;
/* 19 */     this.energy = 0.0D;
/* 20 */     this.maxEnergy = 0.0D;
/* 21 */     this.tier = 0;
/* 22 */     this.container = (Option<ItemStack>)None$.MODULE$; } public TabletData(ItemStack stack) { this(); load(stack); } public Option<ItemStack>[] items() { return this.items; } public void items_$eq(Option[] x$1) { this.items = (Option<ItemStack>[])x$1; } public final class TabletData$$anonfun$1 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; } public TabletData$$anonfun$1(TabletData $outer) {} } public boolean isRunning() { return this.isRunning; } public void isRunning_$eq(boolean x$1) { this.isRunning = x$1; } public double energy() { return this.energy; } public void energy_$eq(double x$1) { this.energy = x$1; } public double maxEnergy() { return this.maxEnergy; } public void maxEnergy_$eq(double x$1) { this.maxEnergy = x$1; } public int tier() { return this.tier; } public void tier_$eq(int x$1) { this.tier = x$1; } public Option<ItemStack> container() { return this.container; } public void container_$eq(Option<ItemStack> x$1) { this.container = x$1; }
/*    */ 
/*    */   
/* 25 */   public void load(NBTTagCompound nbt) { ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("items").toString(), 10)).foreach((Function1)new TabletData$$anonfun$load$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     isRunning_$eq(nbt.func_74767_n((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRunning").toString()));
/* 32 */     energy_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("energy").toString()));
/* 33 */     maxEnergy_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxEnergy").toString()));
/* 34 */     tier_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString()));
/* 35 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("container").toString()))
/* 36 */       container_$eq(Option$.MODULE$.apply(ItemStack.func_77949_a(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("container").toString()))));  } public final class TabletData$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public TabletData$$anonfun$load$1(TabletData $outer) {}
/*    */     public final void apply(NBTTagCompound slotNbt) { byte slot = slotNbt.func_74771_c("slot");
/*    */       if (slot >= 0 && slot < (this.$outer.items()).length)
/*    */         this.$outer.items()[slot] = Option$.MODULE$.apply(ItemStack.func_77949_a(slotNbt.func_74775_l("item")));  } }
/* 41 */   public void save(NBTTagCompound nbt) { ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("items").toString(), 
/*    */ 
/*    */         
/* 44 */         (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])items()).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).collect((PartialFunction)new TabletData$$anonfun$save$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).map((Function1)new TabletData$$anonfun$save$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagCompound.class)))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     nbt.func_74757_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("isRunning").toString(), isRunning());
/* 51 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("energy").toString(), energy());
/* 52 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("maxEnergy").toString(), maxEnergy());
/* 53 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString(), tier());
/* 54 */     container().foreach((Function1)new TabletData$$anonfun$save$3(this, nbt)); } public final class TabletData$$anonfun$save$1 extends AbstractPartialFunction<Tuple2<Option<ItemStack>, Object>, Tuple2<ItemStack, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<Option<ItemStack>, Object>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null) { Option option = (Option)tuple2._1(); int slot = tuple2._2$mcI$sp(); if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); return (B1)new Tuple2(stack, BoxesRunTime.boxToInteger(slot)); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Option option = (Option)tuple2._1(); if (option instanceof Some) return true;  }  return false; } public TabletData$$anonfun$save$1(TabletData $outer) {} } public final class TabletData$$anonfun$save$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); int slot = tuple2._2$mcI$sp(); NBTTagCompound slotNbt = new NBTTagCompound(); slotNbt.func_74774_a("slot", (byte)slot); return ExtendedNBT$.MODULE$.extendNBTTagCompound(slotNbt).setNewCompoundTag("item", (Function1)new TabletData$$anonfun$save$2$$anonfun$apply$1(this, stack)); }  throw new MatchError(tuple2); } public TabletData$$anonfun$save$2(TabletData $outer) {} public final class TabletData$$anonfun$save$2$$anonfun$apply$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final NBTTagCompound apply(NBTTagCompound x$1) { return this.stack$1.func_77955_b(x$1); } public TabletData$$anonfun$save$2$$anonfun$apply$1(TabletData$$anonfun$save$2 $outer, ItemStack stack$1) {} } } public final class TabletData$$anonfun$save$3 extends AbstractFunction1<ItemStack, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(ItemStack stack) { return ExtendedNBT$.MODULE$.extendNBTTagCompound(this.nbt$1).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("container").toString(), (Function1)new TabletData$$anonfun$save$3$$anonfun$apply$2(this, stack)); } private final NBTTagCompound nbt$1; public TabletData$$anonfun$save$3(TabletData $outer, NBTTagCompound nbt$1) {} public final class TabletData$$anonfun$save$3$$anonfun$apply$2 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2; public final NBTTagCompound apply(NBTTagCompound x$1) { return this.stack$2.func_77955_b(x$1); }
/*    */ 
/*    */       
/*    */       public TabletData$$anonfun$save$3$$anonfun$apply$2(TabletData$$anonfun$save$3 $outer, ItemStack stack$2) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\TabletData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */